import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;
import java.util.Map;

public final class PathfinderLoadCacheBoundaryProbe {
    private static final String OWNER = "me.octo.client.utils.player.pathfinder.NativePathFinder";

    private PathfinderLoadCacheBoundaryProbe() {}

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
                byte[] bytes = input(length);
                int mode = (length % 7) - 3;
                original.clear.invoke(null);
                compiled.clear.invoke(null);
                original.load.invoke(null, bytes, mode);
                compiled.load.invoke(null, bytes, mode);
                Map<?, ?> originalStates = (Map<?, ?>) original.states.get(null);
                Map<?, ?> compiledStates = (Map<?, ?>) compiled.states.get(null);
                Map<?, ?> originalHeights = (Map<?, ?>) original.heights.get(null);
                Map<?, ?> compiledHeights = (Map<?, ?>) compiled.heights.get(null);
                if (!originalStates.equals(compiledStates)) {
                    throw new AssertionError("BYTE_STATES mismatch at length=" + length + " mode=" + mode
                            + " originalEntries=" + originalStates.size()
                            + " compiledEntries=" + compiledStates.size());
                }
                if (!originalHeights.equals(compiledHeights) || !originalHeights.isEmpty()) {
                    throw new AssertionError("unexpected HEIGHTS side effect at length=" + length);
                }
                fixtureCount++;
                totalInputBytes += length;
            }
            System.out.println("owner=" + OWNER);
            System.out.println("method=loadCache([BI)V");
            System.out.println("fixtures=byte-array lengths 0..2048 inclusive; second argument cycles -3..3");
            System.out.println("coverage=both modulo-9 record parsing and malformed-length processChunk fallback");
            System.out.println("state_assertion=BYTE_STATES maps exactly equal; HEIGHTS remains empty");
            System.out.println("fixture_count=" + fixtureCount);
            System.out.println("total_input_bytes_per_implementation=" + totalInputBytes);
            System.out.println("assertion=PASS");
        }
    }

    private static URLClassLoader loader(URL url, ClassLoader parent) {
        return new URLClassLoader(new URL[] {url}, parent);
    }

    private static byte[] input(int length) {
        byte[] bytes = new byte[length];
        for (int i = 0; i < length; i++) {
            bytes[i] = (byte) (i * 31 ^ length * 17 ^ (i >>> 3));
        }
        return bytes;
    }

    private static final class Api {
        private final Method clear;
        private final Method load;
        private final Field states;
        private final Field heights;

        private Api(ClassLoader loader) throws Exception {
            Class<?> type = Class.forName(OWNER, true, loader);
            clear = type.getMethod("clearCache");
            load = type.getMethod("loadCache", byte[].class, int.class);
            states = type.getDeclaredField("BYTE_STATES");
            heights = type.getDeclaredField("HEIGHTS");
            states.setAccessible(true);
            heights.setAccessible(true);
        }
    }
}
