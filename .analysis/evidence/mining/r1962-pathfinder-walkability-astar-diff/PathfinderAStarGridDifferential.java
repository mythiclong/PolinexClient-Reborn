import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Map;

public final class PathfinderAStarGridDifferential {
    private static final String OWNER = "me.octo.client.utils.player.pathfinder.NativePathFinder";
    private static final float[] FLOAT_ARGUMENTS = {
        Float.NEGATIVE_INFINITY, -1.0f, -0.0f, 0.0f, 0.5625f, 1.0f, Float.POSITIVE_INFINITY, Float.NaN
    };
    private static final int[] NODE_LIMITS = {Integer.MIN_VALUE, -1, 0, 1, 2, 3, 4, 5, 8, 16, 64, Integer.MAX_VALUE};

    private PathfinderAStarGridDifferential() {}

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
            long start = pack(original, 0, 0, 0);
            long goal = pack(original, 2, 0, 2);
            if (start != pack(compiled, 0, 0, 0) || goal != pack(compiled, 2, 0, 2)) {
                throw new AssertionError("pack implementation mismatch for grid endpoints");
            }

            long fixtures = 0;
            for (int mask = 0; mask < (1 << 9); mask++) {
                for (boolean diagonal : new boolean[] {false, true}) {
                    for (int nodeLimit : NODE_LIMITS) {
                        for (float ignoredSearchParameter : FLOAT_ARGUMENTS) {
                            installGrid(original, mask);
                            installGrid(compiled, mask);
                            long[] expected = (long[]) original.findPath.invoke(null, start, goal,
                                    ignoredSearchParameter, nodeLimit, diagonal);
                            long[] actual = (long[]) compiled.findPath.invoke(null, start, goal,
                                    ignoredSearchParameter, nodeLimit, diagonal);
                            if (!Arrays.equals(expected, actual)) {
                                throw new AssertionError("route mismatch mask=" + mask + " diagonal=" + diagonal
                                        + " nodeLimit=" + nodeLimit + " float=" + ignoredSearchParameter
                                        + " original=" + Arrays.toString(expected)
                                        + " compiled=" + Arrays.toString(actual));
                            }
                            assertRoute(expected, mask, start, goal, diagonal);
                            Map<?, ?> originalStates = (Map<?, ?>) original.states.get(null);
                            Map<?, ?> compiledStates = (Map<?, ?>) compiled.states.get(null);
                            if (!originalStates.equals(compiledStates)) {
                                throw new AssertionError("findPath mutated BYTE_STATES differently");
                            }
                            fixtures++;
                        }
                    }
                }
            }

            long[] sameNode = (long[]) original.findPath.invoke(null, start, start,
                    Float.NaN, 0, false);
            if (!Arrays.equals(sameNode, new long[] {start})) {
                throw new AssertionError("same-node fast path mismatch");
            }
            System.out.println("owner=" + OWNER);
            System.out.println("method=findPath(JJFIZ)[J");
            System.out.println("grid=all 512 blocked-cell masks on a bounded 3x3 XZ plane; vertical and perimeter escape cells blocked");
            System.out.println("dimensions=cardinal/diagonal x 12 node limits x 8 float arguments");
            System.out.println("fixture_count=" + fixtures);
            System.out.println("assertions=exact original/current route arrays; route endpoints, adjacency, and blocked-cell validity; BYTE_STATES unchanged");
            System.out.println("same_node_fast_path=PASS");
            System.out.println("result=PASS");
        }
    }

    private static void installGrid(Api api, int mask) throws Exception {
        @SuppressWarnings("unchecked")
        Map<Long, Byte> states = (Map<Long, Byte>) api.states.get(null);
        states.clear();
        for (int x = -1; x <= 3; x++) {
            for (int z = -1; z <= 3; z++) {
                states.put(pack(api, x, -1, z), (byte) 2);
                states.put(pack(api, x, 1, z), (byte) 2);
                if (x == -1 || x == 3 || z == -1 || z == 3) {
                    states.put(pack(api, x, 0, z), (byte) 2);
                }
            }
        }
        for (int bit = 0; bit < 9; bit++) {
            if ((mask & (1 << bit)) != 0) {
                states.put(pack(api, bit % 3, 0, bit / 3), (byte) 2);
            }
        }
    }

    private static void assertRoute(long[] route, int mask, long start, long goal, boolean diagonal) throws Exception {
        if (route.length == 0) {
            return;
        }
        if (route[0] != start || route[route.length - 1] != goal) {
            throw new AssertionError("nonempty route has wrong endpoints: " + Arrays.toString(route));
        }
        for (int i = 0; i < route.length; i++) {
            int x = unpackX(route[i]);
            int y = unpackY(route[i]);
            int z = unpackZ(route[i]);
            if (x < 0 || x > 2 || z < 0 || z > 2 || y != 0) {
                throw new AssertionError("route escaped bounded grid: " + Arrays.toString(route));
            }
            if (i > 0) {
                int dx = Math.abs(x - unpackX(route[i - 1]));
                int dy = Math.abs(y - unpackY(route[i - 1]));
                int dz = Math.abs(z - unpackZ(route[i - 1]));
                if (dx + dy + dz != 1 && !(diagonal && dx == 1 && dy == 0 && dz == 1)) {
                    throw new AssertionError("route contains illegal step: " + Arrays.toString(route));
                }
            }
            if (i > 0 && (mask & (1 << (z * 3 + x))) != 0) {
                throw new AssertionError("route enters blocked cell: " + Arrays.toString(route));
            }
        }
    }

    private static long pack(Api api, int x, int y, int z) throws Exception {
        return (long) api.pack.invoke(null, x, y, z);
    }

    private static int unpackX(long packed) {
        return signExtend((int) (packed >> 38), 26);
    }

    private static int unpackY(long packed) {
        return signExtend((int) (packed & 4095L), 12);
    }

    private static int unpackZ(long packed) {
        return signExtend((int) (packed >> 12 & 67108863L), 26);
    }

    private static int signExtend(int value, int bits) {
        int shift = 32 - bits;
        return value << shift >> shift;
    }

    private static URLClassLoader loader(URL url, ClassLoader parent) {
        return new URLClassLoader(new URL[] {url}, parent);
    }

    private static final class Api {
        private final Method findPath;
        private final Method pack;
        private final Field states;

        private Api(ClassLoader loader) throws Exception {
            Class<?> type = Class.forName(OWNER, true, loader);
            findPath = type.getMethod("findPath", long.class, long.class, float.class, int.class, boolean.class);
            pack = type.getDeclaredMethod("pack", int.class, int.class, int.class);
            pack.setAccessible(true);
            states = type.getDeclaredField("BYTE_STATES");
            states.setAccessible(true);
        }
    }
}
