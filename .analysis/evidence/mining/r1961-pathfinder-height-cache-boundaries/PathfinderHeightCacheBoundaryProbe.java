import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Map;

public final class PathfinderHeightCacheBoundaryProbe {
    private static final String OWNER = "me.octo.client.utils.player.pathfinder.NativePathFinder";
    private static final int[][] ORIGINS = {
        {-2, 3},
        {0, 0},
        {Integer.MAX_VALUE, -91},
        {Integer.MIN_VALUE, Integer.MAX_VALUE}
    };
    private static final int[] LENGTHS = {0, 1, 2, 15, 16, 17, 31, 32, 33, 255, 256, 257, 65535, 65536};

    private PathfinderHeightCacheBoundaryProbe() {}

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
            long fixtures = 0;
            for (int length : LENGTHS) {
                short[] values = values(length);
                int[] counts = length >= 65535
                        ? new int[] {-1, 0, 1, 65534, 65535, 65536, 65537}
                        : new int[] {-1, 0, 1, length - 1, length, length + 1, 65536};
                for (int count : Arrays.stream(counts).distinct().toArray()) {
                    for (int[] origin : ORIGINS) {
                        compare(original, compiled, origin[0], origin[1], values, count);
                        fixtures++;
                    }
                }
            }
            for (int[] origin : ORIGINS) {
                for (int count : new int[] {-1, 0, 1, 65536}) {
                    compare(original, compiled, origin[0], origin[1], null, count);
                    fixtures++;
                }
            }
            System.out.println("owner=" + OWNER);
            System.out.println("method=updateHeights(II[SI)V");
            System.out.println("coverage=array lengths 0..33 and 255/256/257/65535/65536; count boundaries; varied signed-short patterns in long arrays; coordinate overflow edges; null arrays");
            System.out.println("state_assertion=HEIGHTS maps exactly equal; BYTE_STATES remains empty");
            System.out.println("fixture_count=" + fixtures);
            System.out.println("assertion=PASS");
        }
    }

    private static void compare(Api original, Api compiled, int x, int z, short[] values, int count) throws Exception {
        original.clear.invoke(null);
        compiled.clear.invoke(null);
        original.update.invoke(null, x, z, values, count);
        compiled.update.invoke(null, x, z, values, count);
        Map<?, ?> originalHeights = (Map<?, ?>) original.heights.get(null);
        Map<?, ?> compiledHeights = (Map<?, ?>) compiled.heights.get(null);
        Map<?, ?> originalStates = (Map<?, ?>) original.states.get(null);
        Map<?, ?> compiledStates = (Map<?, ?>) compiled.states.get(null);
        if (!originalHeights.equals(compiledHeights)) {
            throw new AssertionError("HEIGHTS mismatch: x=" + x + " z=" + z + " length="
                    + (values == null ? "null" : values.length) + " count=" + count);
        }
        if (!originalStates.equals(compiledStates) || !originalStates.isEmpty()) {
            throw new AssertionError("unexpected BYTE_STATES side effect");
        }
    }

    private static short[] values(int length) {
        short[] result = new short[length];
        for (int i = 0; i < length; i++) {
            result[i] = (short) (i * 7919 ^ (i >>> 4));
        }
        return result;
    }

    private static URLClassLoader loader(URL url, ClassLoader parent) {
        return new URLClassLoader(new URL[] {url}, parent);
    }

    private static final class Api {
        private final Method clear;
        private final Method update;
        private final Field states;
        private final Field heights;

        private Api(ClassLoader loader) throws Exception {
            Class<?> type = Class.forName(OWNER, true, loader);
            clear = type.getMethod("clearCache");
            update = type.getMethod("updateHeights", int.class, int.class, short[].class, int.class);
            states = type.getDeclaredField("BYTE_STATES");
            heights = type.getDeclaredField("HEIGHTS");
            states.setAccessible(true);
            heights.setAccessible(true);
        }
    }
}
