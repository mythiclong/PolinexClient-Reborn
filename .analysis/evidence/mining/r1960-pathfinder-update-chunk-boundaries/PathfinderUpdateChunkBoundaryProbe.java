import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Map;

public final class PathfinderUpdateChunkBoundaryProbe {
    private static final String OWNER = "me.octo.client.utils.player.pathfinder.NativePathFinder";
    private static final int[][] ORIGINS = {
        {-2, -17, 3},
        {0, 0, 0},
        {127, Integer.MAX_VALUE, -91},
        {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE}
    };

    private PathfinderUpdateChunkBoundaryProbe() {}

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
            for (int stateLength = 0; stateLength <= 32; stateLength++) {
                byte[] states = states(stateLength);
                for (int indexLength = -1; indexLength <= 32; indexLength++) {
                    int[] indices = indexLength < 0 ? null : indices(indexLength);
                    int effectiveIndexLength = indices == null ? stateLength : indices.length;
                    int[] counts = unique(-1, 0, 1, stateLength - 1, stateLength,
                            effectiveIndexLength, stateLength + 1, 64);
                    for (int count : counts) {
                        for (int[] origin : ORIGINS) {
                            original.clear.invoke(null);
                            compiled.clear.invoke(null);
                            original.update.invoke(null, origin[0], origin[1], origin[2], indices, states, count);
                            compiled.update.invoke(null, origin[0], origin[1], origin[2], indices, states, count);
                            Map<?, ?> originalStates = (Map<?, ?>) original.states.get(null);
                            Map<?, ?> compiledStates = (Map<?, ?>) compiled.states.get(null);
                            Map<?, ?> originalHeights = (Map<?, ?>) original.heights.get(null);
                            Map<?, ?> compiledHeights = (Map<?, ?>) compiled.heights.get(null);
                            if (!originalStates.equals(compiledStates)) {
                                throw new AssertionError("BYTE_STATES mismatch: bytes=" + stateLength
                                        + " indices=" + (indices == null ? "null" : indices.length)
                                        + " count=" + count + " origin=" + Arrays.toString(origin));
                            }
                            if (!originalHeights.equals(compiledHeights) || !originalHeights.isEmpty()) {
                                throw new AssertionError("unexpected HEIGHTS side effect");
                            }
                            fixtures++;
                        }
                    }
                }
            }
            System.out.println("owner=" + OWNER);
            System.out.println("method=updateChunk(III[I[BI)V");
            System.out.println("coverage=byte/index lengths 0..32, null indices, threshold counts, signed/extreme indices and origins");
            System.out.println("state_assertion=BYTE_STATES maps exactly equal; HEIGHTS remains empty");
            System.out.println("fixture_count=" + fixtures);
            System.out.println("assertion=PASS");
        }
    }

    private static int[] unique(int... values) {
        return Arrays.stream(values).distinct().toArray();
    }

    private static byte[] states(int length) {
        byte[] result = new byte[length];
        for (int i = 0; i < length; i++) {
            result[i] = (byte) switch (i % 5) {
                case 0 -> 0;
                case 1 -> 1;
                case 2 -> 2;
                case 3 -> 3;
                default -> -1;
            };
        }
        return result;
    }

    private static int[] indices(int length) {
        int[] result = new int[length];
        int[] special = {Integer.MIN_VALUE, Integer.MAX_VALUE, -1, 0, 255, 4095, 65535};
        for (int i = 0; i < length; i++) {
            result[i] = i % 3 == 0 ? special[(i / 3) % special.length] : i * 257;
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
            update = type.getMethod("updateChunk", int.class, int.class, int.class,
                    int[].class, byte[].class, int.class);
            states = type.getDeclaredField("BYTE_STATES");
            heights = type.getDeclaredField("HEIGHTS");
            states.setAccessible(true);
            heights.setAccessible(true);
        }
    }
}
