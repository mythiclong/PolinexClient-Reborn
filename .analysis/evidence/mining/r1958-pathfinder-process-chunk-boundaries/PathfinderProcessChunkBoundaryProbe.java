import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.ByteBuffer;
import java.nio.file.Path;
import java.util.Map;

public final class PathfinderProcessChunkBoundaryProbe {
    private static final String OWNER = "me.octo.client.utils.player.pathfinder.NativePathFinder";

    private PathfinderProcessChunkBoundaryProbe() {}

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            throw new IllegalArgumentException("expected <original-jar> <compiled-classes>");
        }
        Path originalJar = Path.of(args[0]).toAbsolutePath();
        Path compiledClasses = Path.of(args[1]).toAbsolutePath();
        ClassLoader platform = ClassLoader.getPlatformClassLoader();
        try (URLClassLoader originalLoader = loader(originalJar.toUri().toURL(), platform);
             URLClassLoader compiledLoader = loader(compiledClasses.toUri().toURL(), platform)) {
            Api original = new Api(originalLoader);
            Api compiled = new Api(compiledLoader);
            int fixtureCount = 0;
            long totalInputBytes = 0;
            for (int length = 0; length <= 2048; length++) {
                ByteBuffer originalBuffer = input(length);
                ByteBuffer compiledBuffer = input(length);
                original.clear.invoke(null);
                compiled.clear.invoke(null);
                original.process.invoke(null, 2, -3, originalBuffer);
                compiled.process.invoke(null, 2, -3, compiledBuffer);

                if (originalBuffer.position() != 3 || compiledBuffer.position() != 3
                        || originalBuffer.limit() != 3 + length || compiledBuffer.limit() != 3 + length) {
                    throw new AssertionError("buffer cursor changed at remaining=" + length);
                }
                Map<?, ?> originalStates = (Map<?, ?>) original.states.get(null);
                Map<?, ?> compiledStates = (Map<?, ?>) compiled.states.get(null);
                if (!originalStates.equals(compiledStates)) {
                    throw new AssertionError("state-map mismatch at remaining=" + length
                            + " originalEntries=" + originalStates.size()
                            + " compiledEntries=" + compiledStates.size());
                }
                fixtureCount++;
                totalInputBytes += length;
            }
            System.out.println("owner=" + OWNER);
            System.out.println("method=processChunk(IILjava/nio/ByteBuffer;)V");
            System.out.println("fixtures=remaining lengths 0..2048 inclusive");
            System.out.println("input_pattern=0,1,2,3,255 repeated after a 3-byte prefix");
            System.out.println("cursor_assertion=original and compiled buffers retain position 3 and the same limit");
            System.out.println("state_assertion=BYTE_STATES maps exactly equal for every fixture");
            System.out.println("fixture_count=" + fixtureCount);
            System.out.println("total_input_bytes_per_implementation=" + totalInputBytes);
            System.out.println("assertion=PASS");
        }
    }

    private static URLClassLoader loader(URL url, ClassLoader parent) {
        return new URLClassLoader(new URL[] {url}, parent);
    }

    private static ByteBuffer input(int remaining) {
        ByteBuffer buffer = ByteBuffer.allocate(remaining + 3);
        buffer.put((byte) 99).put((byte) 98).put((byte) 97);
        for (int i = 0; i < remaining; i++) {
            buffer.put((byte) switch (i % 5) {
                case 0 -> 0;
                case 1 -> 1;
                case 2 -> 2;
                case 3 -> 3;
                default -> -1;
            });
        }
        buffer.position(3);
        return buffer;
    }

    private static final class Api {
        private final Method clear;
        private final Method process;
        private final Field states;

        private Api(ClassLoader loader) throws Exception {
            Class<?> type = Class.forName(OWNER, true, loader);
            clear = type.getMethod("clearCache");
            process = type.getMethod("processChunk", int.class, int.class, ByteBuffer.class);
            states = type.getDeclaredField("BYTE_STATES");
            states.setAccessible(true);
        }
    }
}
