import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public final class PathfinderChunkMergeDifferentialProbe {
    private static final String OWNER = "me.octo.client.llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII";
    private static final String INDEX_SHIM = "me.octo.client.utils.player.pathfinder.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl";
    private record Outcome(int loadedChunks, String failure, String outputDigest, int outputCount) {}

    private static final class ClientClassLoader extends URLClassLoader {
        ClientClassLoader(URL shim, URL artifact) { super(new URL[] {shim, artifact}, ClassLoader.getSystemClassLoader()); }
        @Override protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
            if (!name.startsWith("me.octo.client.")) return super.loadClass(name, resolve);
            synchronized (getClassLoadingLock(name)) {
                Class<?> loaded = findLoadedClass(name);
                if (loaded == null) {
                    try { loaded = findClass(name); }
                    catch (ClassNotFoundException missing) { loaded = super.loadClass(name, false); }
                }
                if (resolve) resolveClass(loaded);
                return loaded;
            }
        }
    }

    private static String sha256(byte[] bytes) throws Exception {
        return java.util.HexFormat.of().formatHex(MessageDigest.getInstance("SHA-256").digest(bytes));
    }

    private static Outcome run(ClassLoader loader, Path dimension) throws Exception {
        Class<?> owner = Class.forName(OWNER, true, loader);
        Object instance = owner.getDeclaredConstructor().newInstance();
        Method readChunk = null;
        Method merge = null;
        for (Method method : owner.getDeclaredMethods()) {
            Class<?>[] parameters = method.getParameterTypes();
            if (method.getName().equals("a") && parameters.length == 1 && parameters[0] == File.class) readChunk = method;
            if (method.getName().equals("a") && parameters.length == 2 && parameters[1] == ByteBuffer.class) merge = method;
        }
        if (readChunk == null || merge == null) throw new AssertionError("Expected cache read/merge descriptors not found");
        readChunk.setAccessible(true);
        merge.setAccessible(true);
        Field mapField = null;
        for (Field field : owner.getDeclaredFields()) if (Map.class.isAssignableFrom(field.getType())) mapField = field;
        if (mapField == null) throw new AssertionError("Chunk map not found");
        mapField.setAccessible(true);
        @SuppressWarnings("unchecked") Map<Object, ByteBuffer> chunks = (Map<Object, ByteBuffer>) mapField.get(instance);
        try (var files = Files.list(dimension)) {
            for (Path file : files.sorted().toList()) readChunk.invoke(instance, file.toFile());
        }
        List<String> outputs = new ArrayList<>();
        String failure = null;
        for (Map.Entry<Object, ByteBuffer> entry : chunks.entrySet()) {
            try {
                ByteBuffer result = (ByteBuffer) merge.invoke(instance, entry.getKey(), entry.getValue());
                if (result != null) {
                    ByteBuffer copy = result.duplicate();
                    byte[] bytes = new byte[copy.remaining()];
                    copy.get(bytes);
                    outputs.add(sha256(bytes));
                }
            } catch (InvocationTargetException exception) {
                Throwable cause = exception.getCause();
                                StringBuilder chain = new StringBuilder();
                for (Throwable item = cause; item != null; item = item.getCause()) {
                    if (chain.length() > 0) chain.append(" <- ");
                    chain.append(item.getClass().getName()).append(":").append(item.getMessage());
                }
                cause.printStackTrace(System.err);
                failure = chain.toString();
                break;
            }
        }
        outputs.sort(String::compareTo);
        return new Outcome(chunks.size(), failure, sha256(String.join("\n", outputs).getBytes(java.nio.charset.StandardCharsets.UTF_8)), outputs.size());
    }

    public static void main(String[] args) throws Exception {
        Path archive = Path.of(args[0]).toRealPath();
        Path classes = Path.of(args[1]).toRealPath();
        Path evidenceRoot = Path.of(args[2]).toAbsolutePath().normalize();
        Path indexShim = Path.of(args[3]).toRealPath();
        Path allowedRoot = Path.of("D:/Work/OpenPoli").toRealPath();
        if (!archive.startsWith(allowedRoot) || !classes.startsWith(allowedRoot) || !evidenceRoot.startsWith(allowedRoot) || !indexShim.startsWith(allowedRoot)) throw new AssertionError("Probe path escaped D:\\Work\\OpenPoli");
        System.out.println("dependency_boundary=" + INDEX_SHIM + ".a(III)I supplied by exact bytecode-equivalent test shim; Minecraft-dependent class initializer excluded");
        Files.createDirectories(evidenceRoot);
        Path fixture = Files.createTempDirectory(evidenceRoot, "merge-differential-");
        try {
            Path zeroDimension = fixture.resolve("zero/fixture_overworld");
            Path sparseDimension = fixture.resolve("sparse/fixture_overworld");
            Files.createDirectories(zeroDimension);
            Files.createDirectories(sparseDimension);
            for (int x = -1; x <= 1; x++) for (int z = -1; z <= 1; z++) {
                byte[] zeroStates = new byte[256 * 256];
                byte[] sparseStates = new byte[256 * 256];
                sparseStates[10 * 256 + 8 * 16 + 8] = (byte)(((x + z) & 1) == 0 ? 1 : 2);
                                if (x == 0 && z == 0) {
                    int yOffset = 10 * 256;
                    sparseStates[yOffset + 8 * 16] = 2;
                    sparseStates[yOffset + 8 * 16 + 15] = 1;
                    sparseStates[yOffset + 8] = 2;
                    sparseStates[yOffset + 15 * 16 + 8] = 1;
                }
                ByteBuffer zeroChunk = ByteBuffer.allocate(8 + zeroStates.length).order(ByteOrder.BIG_ENDIAN);
                zeroChunk.putInt(x).putInt(z).put(zeroStates);
                ByteBuffer sparseChunk = ByteBuffer.allocate(8 + sparseStates.length).order(ByteOrder.BIG_ENDIAN);
                sparseChunk.putInt(x).putInt(z).put(sparseStates);
                String name = "chunk_" + x + "_" + z + ".dat";
                Files.write(zeroDimension.resolve(name), zeroChunk.array());
                Files.write(sparseDimension.resolve(name), sparseChunk.array());
            }
            Outcome zeroOriginal;
            Outcome zeroCompiled;
            Outcome sparseOriginal;
            Outcome sparseCompiled;
            try (ClientClassLoader originalLoader = new ClientClassLoader(indexShim.toUri().toURL(), archive.toUri().toURL());
                 ClientClassLoader compiledLoader = new ClientClassLoader(indexShim.toUri().toURL(), classes.toUri().toURL())) {
                zeroOriginal = run(originalLoader, zeroDimension);
                zeroCompiled = run(compiledLoader, zeroDimension);
                sparseOriginal = run(originalLoader, sparseDimension);
                sparseCompiled = run(compiledLoader, sparseDimension);
            }
            System.out.println("zero_original=" + zeroOriginal);
            System.out.println("zero_compiled=" + zeroCompiled);
            System.out.println("sparse_original=" + sparseOriginal);
            System.out.println("sparse_compiled=" + sparseCompiled);
            if (zeroOriginal.loadedChunks() != 9 || zeroCompiled.loadedChunks() != 9
                    || sparseOriginal.loadedChunks() != 9 || sparseCompiled.loadedChunks() != 9) {
                throw new AssertionError("Fixture did not load all nine chunks in each isolated loader");
            }
            if (zeroOriginal.failure() != null || zeroCompiled.failure() != null
                    || sparseOriginal.failure() != null || sparseCompiled.failure() != null) {
                throw new AssertionError("A merge path failed; matching failures are not differential parity");
            }
            if (sparseOriginal.outputCount() == 0 || sparseCompiled.outputCount() == 0) {
                throw new AssertionError("Sparse fixture did not exercise any emitted merge records");
            }
            if (!zeroOriginal.equals(zeroCompiled)) throw new AssertionError("Original and compiled all-zero merge outcomes differ");
            if (!sparseOriginal.equals(sparseCompiled)) throw new AssertionError("Original and compiled sparse merge outcomes differ");
            System.out.println("result=PASS");
        } finally {
            try (var paths = Files.walk(fixture)) {
                paths.sorted(Comparator.reverseOrder()).forEach(path -> {
                    try { Files.delete(path); }
                    catch (Exception exception) { throw new RuntimeException(exception); }
                });
            }
        }
    }
}

