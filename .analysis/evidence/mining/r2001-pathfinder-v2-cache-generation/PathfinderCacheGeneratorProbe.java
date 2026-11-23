package me.octo.client;

import java.io.File;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.Comparator;

public final class PathfinderCacheGeneratorProbe {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            throw new IllegalArgumentException("expected evidence directory and repository root");
        }
        Path allowedRoot = Path.of(args[1]).toRealPath();
        Path evidenceRoot = Path.of(args[0]).toAbsolutePath().normalize();
        if (!evidenceRoot.startsWith(allowedRoot)) {
            throw new AssertionError("Probe fixture path escaped repository root: " + evidenceRoot);
        }

        Files.createDirectories(evidenceRoot);
        Path fixture = Files.createTempDirectory(evidenceRoot, "cache-generator-");
        try {
            Path cacheRoot = fixture.resolve("pathfind-cache-v2");
            Path zeroDimension = cacheRoot.resolve("fixture_overworld");
            Path sparseDimension = cacheRoot.resolve("fixture_sparse");
            Files.createDirectories(zeroDimension);
            Files.createDirectories(sparseDimension);
            for (int x = -1; x <= 1; x++) {
                for (int z = -1; z <= 1; z++) {
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
            }

            llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII generator =
                new llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII();
            Method generate = generator.getClass().getDeclaredMethod("polinex$generateCacheFiles", File.class, String[].class);
            generate.setAccessible(true);
            generate.invoke(generator, cacheRoot.toFile(), new String[2]);

            Class<?> loggerShim = Class.forName("me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI");
            @SuppressWarnings("unchecked")
            java.util.List<String> messages = (java.util.List<String>)loggerShim.getMethod("messages").invoke(null);
            java.util.Set<String> expectedMessages = java.util.Set.of("Generated: fixture_sparse.dat");
            if (messages.size() != 1 || !java.util.Set.copyOf(messages).equals(expectedMessages)) {
                throw new AssertionError("Unexpected cache generation messages: " + messages);
            }
            if (Files.exists(cacheRoot.resolve("fixture_overworld.dat"))) {
                throw new AssertionError("Original semantics skip aggregate output when no chunk produces records");
            }

            byte[] sparseOutput = Files.readAllBytes(cacheRoot.resolve("fixture_sparse.dat"));
            if (sparseOutput.length < 15) {
                throw new AssertionError("Sparse cache did not contain any emitted state records");
            }
            ByteBuffer sparseRecord = ByteBuffer.wrap(sparseOutput).order(ByteOrder.nativeOrder());
            if (sparseRecord.getInt() != 0 || sparseRecord.getInt() != 0) {
                throw new AssertionError("Unexpected sparse center chunk coordinates");
            }
            int stateCount = sparseRecord.getInt();
            if (stateCount <= 0 || sparseOutput.length != 12 + stateCount * 3) {
                throw new AssertionError("Sparse aggregate record length/count mismatch: count=" + stateCount + " bytes=" + sparseOutput.length);
            }
            for (int i = 0; i < stateCount; i++) {
                int index = Short.toUnsignedInt(sparseRecord.getShort());
                int state = Byte.toUnsignedInt(sparseRecord.get());
                if (index >= 65536 || state == 0) throw new AssertionError("Invalid sparse state record at index " + i);
            }
            System.out.println("PASS input_chunk_files=18 logger_messages=1 zero_aggregate=absent sparse_state_count=" + stateCount
                + " sparse_size=" + sparseOutput.length + " sparse_sha256=" + sha256(sparseOutput));
        } finally {
            try (var files = Files.walk(fixture)) {
                files.sorted(Comparator.reverseOrder()).forEach(path -> {
                    try {
                        Files.delete(path);
                    } catch (Exception exception) {
                        throw new RuntimeException(exception);
                    }
                });
            }
        }
    }

    private static String sha256(byte[] bytes) throws Exception {
        byte[] digest = MessageDigest.getInstance("SHA-256").digest(bytes);
        StringBuilder result = new StringBuilder();
        for (byte value : digest) result.append(String.format("%02x", value & 0xff));
        return result.toString();
    }
}