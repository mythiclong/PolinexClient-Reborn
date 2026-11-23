import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HexFormat;
import java.util.List;
import java.util.Random;
import java.util.jar.JarFile;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

public final class CacheFileValidatorProbe {
    private static final String OWNER =
        "me/octo/client/utils/player/pathfinder/"
            + "IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI";
    private static final String METHOD = "polinex$validPathfinderCache";
    private static final String DESCRIPTOR = "(Ljava/io/File;)Z";

    private record Fixture(String name, byte[] bytes, Boolean expected) {}

    private static final class ProbeLoader extends ClassLoader {
        Class<?> define(String name, byte[] bytes) {
            return defineClass(name, bytes, 0, bytes.length);
        }
    }

    private static byte[] readOriginalClass(Path archive) throws Exception {
        try (JarFile jar = new JarFile(archive.toFile())) {
            var entry = jar.getJarEntry(OWNER + ".class");
            if (entry == null) throw new IllegalStateException("Original class not found");
            try (InputStream input = jar.getInputStream(entry)) {
                return input.readAllBytes();
            }
        }
    }

    private static byte[] extractValidator(byte[] ownerBytes, String newName) {
        ClassNode owner = new ClassNode(Opcodes.ASM9);
        new ClassReader(ownerBytes).accept(owner, 0);
        MethodNode source = owner.methods.stream()
            .filter(method -> method.name.equals(METHOD) && method.desc.equals(DESCRIPTOR))
            .findFirst()
            .orElseThrow(() -> new IllegalStateException("Validator method not found"));
        if ((source.access & Opcodes.ACC_STATIC) == 0) {
            throw new IllegalStateException("Validator is not static");
        }
        for (AbstractInsnNode instruction : source.instructions) {
            if (instruction instanceof FieldInsnNode) {
                throw new IllegalStateException("Validator unexpectedly reads or writes a field");
            }
            if (instruction instanceof MethodInsnNode call
                && !call.owner.startsWith("java/")) {
                throw new IllegalStateException("Unexpected non-JDK call: " + call.owner);
            }
        }

        ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        writer.visit(Opcodes.V17, Opcodes.ACC_PUBLIC | Opcodes.ACC_FINAL | Opcodes.ACC_SUPER,
            newName, null, "java/lang/Object", null);
        MethodVisitor method = writer.visitMethod(
            Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC, "validate", DESCRIPTOR, null, null);
        source.accept(method);
        writer.visitEnd();
        return writer.toByteArray();
    }

    private static String sha256(byte[] bytes) throws Exception {
        return HexFormat.of().formatHex(MessageDigest.getInstance("SHA-256").digest(bytes));
    }

    private static byte[] ints(int... values) {
        ByteBuffer buffer = ByteBuffer.allocate(values.length * Integer.BYTES);
        for (int value : values) buffer.putInt(value);
        return buffer.array();
    }

    private static byte[] append(byte[] prefix, byte... suffix) {
        byte[] result = java.util.Arrays.copyOf(prefix, prefix.length + suffix.length);
        System.arraycopy(suffix, 0, result, prefix.length, suffix.length);
        return result;
    }

    private static List<Fixture> fixtures() {
        byte[] validOneEntry = ByteBuffer.allocate(21)
            .putInt(1).putInt(1).putInt(0).putInt(0).putInt(123).put((byte) 4).array();
        byte[] validTwoRecords = ByteBuffer.allocate(33)
            .putInt(2)
            .putInt(1).putInt(0).putInt(0).putInt(123).put((byte) 4)
            .putInt(0).putInt(16).putInt(-2)
            .array();
        return List.of(
            new Fixture("empty", new byte[0], false),
            new Fixture("one-byte", new byte[] {0}, false),
            new Fixture("two-bytes", new byte[] {0, 0}, false),
            new Fixture("three-bytes", new byte[] {0, 0, 0}, false),
            new Fixture("zero-records", ints(0), true),
            new Fixture("one-empty-record", ints(1, 0, 0, 0), true),
            new Fixture("one-entry", validOneEntry, true),
            new Fixture("two-records", validTwoRecords, true),
            new Fixture("negative-record-count", ints(-1), false),
            new Fixture("record-count-exceeds-file", ints(1), false),
            new Fixture("short-record-header", ints(1, 0, 0), false),
            new Fixture("negative-entry-count", ints(1, -1, 0, 0), false),
            new Fixture("entry-count-exceeds-payload", ints(1, 2, 0, 0, 0), false),
            new Fixture("truncated-entry", ints(1, 1, 0, 0, 0), false),
            new Fixture("trailing-byte", append(ints(0), (byte) 1), false)
        );
    }

    private static List<Fixture> randomFixtures() {
        Random random = new Random(0x5041544846494E44L);
        List<Fixture> fixtures = new ArrayList<>();
        for (int index = 0; index < 4096; index++) {
            byte[] bytes = new byte[random.nextInt(257)];
            random.nextBytes(bytes);
            fixtures.add(new Fixture("random-" + index, bytes, null));
        }
        return fixtures;
    }

    private static boolean validate(Method method, File file) throws Exception {
        return (boolean) method.invoke(null, file);
    }

    public static void main(String[] args) throws Exception {
        if (args.length != 4) {
            throw new IllegalArgumentException("archive compiled-class fixture-root current-source");
        }
        Path archive = Path.of(args[0]);
        Path compiledClass = Path.of(args[1]);
        Path fixtureRoot = Path.of(args[2]).toAbsolutePath();
        Path currentSource = Path.of(args[3]);
        Files.createDirectories(fixtureRoot);

        byte[] originalBytes = readOriginalClass(archive);
        byte[] compiledBytes = Files.readAllBytes(compiledClass);
        Class<?> originalValidator = new ProbeLoader().define(
            "probe.OriginalCacheValidator", extractValidator(originalBytes, "probe/OriginalCacheValidator"));
        Class<?> compiledValidator = new ProbeLoader().define(
            "probe.CompiledCacheValidator", extractValidator(compiledBytes, "probe/CompiledCacheValidator"));
        Method original = originalValidator.getMethod("validate", File.class);
        Method compiled = compiledValidator.getMethod("validate", File.class);

        int assertions = 0;
        List<Fixture> allFixtures = new ArrayList<>(fixtures());
        allFixtures.addAll(randomFixtures());
        for (Fixture fixture : allFixtures) {
            Path path = fixtureRoot.resolve(fixture.name() + ".dat");
            Files.write(path, fixture.bytes());
            boolean originalResult = validate(original, path.toFile());
            boolean compiledResult = validate(compiled, path.toFile());
            if (originalResult != compiledResult
                || (fixture.expected() != null && originalResult != fixture.expected())) {
                throw new AssertionError(fixture.name() + ": expected=" + fixture.expected()
                    + ", original=" + originalResult + ", compiled=" + compiledResult);
            }
            assertions += 2;
        }

        Path directory = fixtureRoot.resolve("directory-input");
        Files.createDirectories(directory);
        if (validate(original, directory.toFile()) || validate(compiled, directory.toFile())) {
            throw new AssertionError("Directory input was accepted");
        }
        assertions += 2;
        if (validate(original, null) || validate(compiled, null)) {
            throw new AssertionError("Null input was accepted");
        }
        assertions += 2;

        byte[] originalClass = readOriginalClass(archive);
        byte[] currentClass = Files.readAllBytes(compiledClass);
        System.out.println("method=" + METHOD + DESCRIPTOR);
        System.out.println("fixtures=" + allFixtures.size() + " random_fixtures="
            + randomFixtures().size() + " assertions=" + assertions);
        System.out.println("archive_sha256=" + sha256(Files.readAllBytes(archive)));
        System.out.println("original_owner_sha256=" + sha256(originalClass));
        System.out.println("compiled_owner_sha256=" + sha256(currentClass));
        System.out.println("current_source_sha256=" + sha256(Files.readAllBytes(currentSource)));
        System.out.println("result=PASS");
    }
}
