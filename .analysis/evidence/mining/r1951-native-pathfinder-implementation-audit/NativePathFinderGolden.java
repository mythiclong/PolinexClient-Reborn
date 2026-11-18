import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public final class NativePathFinderGolden {
    private static Object call(Class<?> type, String name, Class<?>[] signature, Object... args) throws Exception {
        Method method = type.getDeclaredMethod(name, signature);
        method.setAccessible(true);
        try {
            return method.invoke(null, args);
        } catch (java.lang.reflect.InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Exception exception) throw exception;
            if (cause instanceof Error error) throw error;
            throw new RuntimeException(cause);
        }
    }

    private static Object field(Class<?> type, String name) throws Exception {
        Field field = type.getDeclaredField(name);
        field.setAccessible(true);
        return field.get(null);
    }

    private static String sha256(String value) throws Exception {
        byte[] digest = MessageDigest.getInstance("SHA-256").digest(value.getBytes(java.nio.charset.StandardCharsets.UTF_8));
        StringBuilder hex = new StringBuilder();
        for (byte b : digest) hex.append(String.format("%02x", b));
        return hex.toString();
    }

    private static long pack(Class<?> type, int x, int y, int z) throws Exception {
        return (long) call(type, "pack", new Class<?>[]{int.class, int.class, int.class}, x, y, z);
    }

    private static String states(Class<?> type, int[][] positions) throws Exception {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < positions.length; i++) {
            int[] p = positions[i];
            if (i != 0) result.append(',');
            result.append(p[0]).append('/').append(p[1]).append('/').append(p[2]).append('=')
                .append(call(type, "getByteState", new Class<?>[]{int.class, int.class, int.class}, p[0], p[1], p[2]));
        }
        return result.toString();
    }

    private static String mapSnapshot(Class<?> type, String name) throws Exception {
        @SuppressWarnings("unchecked") Map<Object, Object> map = (Map<Object, Object>) field(type, name);
        return new TreeMap<>(map).toString();
    }

    private static String mapDigest(Class<?> type, String name) throws Exception {
        @SuppressWarnings("unchecked") Map<Object, Object> map = (Map<Object, Object>) field(type, name);
        String content = new TreeMap<>(map).toString();
        return "entries=" + map.size() + " sha256=" + sha256(content);
    }

    private static void clear(Class<?> type) throws Exception {
        call(type, "clearCache", new Class<?>[0]);
    }

    private static void update(Class<?> type, int chunkX, int chunkZ, int baseY, int[] indices, byte[] data) throws Exception {
        call(type, "updateChunk", new Class<?>[]{int.class, int.class, int.class, int[].class, byte[].class, int.class},
            chunkX, chunkZ, baseY, indices, data, data.length);
    }

    private static Map<String, String> run(Class<?> type) throws Exception {
        TreeMap<String, String> out = new TreeMap<>();
        out.put("initial_native_flag", String.valueOf(field(type, "IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl")));

        int[] edge = {-33554432, -33554431, -1, 0, 1, 33554430, 33554431};
        int[] yEdge = {-2048, -2047, -1, 0, 1, 2046, 2047};
        StringBuilder packed = new StringBuilder();
        for (int x : edge) for (int y : yEdge) for (int z : edge) {
            long value = pack(type, x, y, z);
            int ux = (int) call(type, "unpackX", new Class<?>[]{long.class}, value);
            int uy = (int) call(type, "unpackY", new Class<?>[]{long.class}, value);
            int uz = (int) call(type, "unpackZ", new Class<?>[]{long.class}, value);
            packed.append(x).append('/').append(y).append('/').append(z).append('=')
                .append(value).append(':').append(ux).append('/').append(uy).append('/').append(uz).append(';');
        }
        out.put("pack_unpack_edges", "samples=343 sha256=" + sha256(packed.toString()));
        byte[] normalizeInputs = {Byte.MIN_VALUE, -2, -1, 0, 1, 2, 3, Byte.MAX_VALUE};
        StringBuilder normalized = new StringBuilder();
        for (byte b : normalizeInputs) normalized.append(b).append(':')
            .append(call(type, "normalizeState", new Class<?>[]{byte.class}, b)).append(';');
        out.put("normalize_state", normalized.toString());
        double[] floorInputs = {-1.2, -1.0, -0.001, 0.0, 0.999, 1.0, 1.001, 2147483647.0};
        StringBuilder floors = new StringBuilder();
        for (double d : floorInputs) floors.append(d).append(':')
            .append(call(type, "floor", new Class<?>[]{double.class}, d)).append(';');
        out.put("floor_edges", floors.toString());
        out.put("cardinal_dirs", Arrays.deepToString((int[][]) field(type, "CARDINAL_DIRS")));
        out.put("diagonal_dirs", Arrays.deepToString((int[][]) field(type, "DIAGONAL_DIRS")));

        clear(type);
        int[] indices = {0, 1, 16, 256, 4095, 0x1234, 0x2345};
        byte[] values = {0, 1, 2, 3, -1, 1, 2};
        update(type, 2, -1, 10, indices, values);
        out.put("update_chunk_states", states(type, new int[][]{
            {32,10,-16},{33,10,-16},{32,10,-15},{32,11,-16},{47,25,-1},{36,28,-14},{37,32,-11}}));
        short[] heights = {-2048, -1, 0, 1, 255, 2047};
        call(type, "updateHeights", new Class<?>[]{int.class, int.class, short[].class, int.class}, 2, -1, heights, heights.length);
        out.put("height_map", mapSnapshot(type, "HEIGHTS"));
        out.put("byte_state_map", mapSnapshot(type, "BYTE_STATES"));

        clear(type);
        ByteBuffer chunk = ByteBuffer.allocate(514).order(ByteOrder.BIG_ENDIAN);
        chunk.put((byte)99).put((byte)98);
        for (int i = 0; i < 512; i++) chunk.put((byte)(i % 5 == 0 ? 0 : i % 5 == 1 ? 1 : i % 5 == 2 ? 2 : i % 5 == 3 ? 3 : -1));
        chunk.position(2);
        call(type, "processChunk", new Class<?>[]{int.class, int.class, ByteBuffer.class}, 2, -3, chunk);
        out.put("process_chunk_buffer_position", String.valueOf(chunk.position()));
        out.put("process_chunk_states", states(type, new int[][]{{32,0,-48},{33,0,-48},{47,0,-33},{32,1,-48},{33,1,-48}}));
        out.put("process_chunk_map_size", String.valueOf(((Map<?, ?>) field(type, "BYTE_STATES")).size()));

        clear(type);
        ByteBuffer fullChunk = ByteBuffer.allocate(65536);
        for (int i = 0; i < 65536; i++) fullChunk.put((byte)(i & 3));
        fullChunk.flip();
        call(type, "processChunk", new Class<?>[]{int.class, int.class, ByteBuffer.class}, -7, -3, fullChunk);
        out.put("process_chunk_full_map", mapDigest(type, "BYTE_STATES"));
        out.put("process_chunk_full_boundary_states", states(type, new int[][]{{-112,0,-48},{-111,0,-48},{-97,0,-48},{-112,0,-47},{-97,0,-33},{-112,1,-48},{-97,255,-33}}));

        clear(type);
        ByteBuffer cache = ByteBuffer.allocate(27).order(ByteOrder.BIG_ENDIAN);
        cache.putLong(pack(type, -17, 63, 29)).put((byte)1);
        cache.putLong(pack(type, 5, -64, -31)).put((byte)255);
        cache.putLong(pack(type, 0, 0, 0)).put((byte)0);
        call(type, "loadCache", new Class<?>[]{byte[].class, int.class}, cache.array(), 123456);
        out.put("load_cache_records", mapSnapshot(type, "BYTE_STATES"));
        clear(type);
        byte[] malformedCache = {0,1,2,3,4,5,6,7};
        call(type, "loadCache", new Class<?>[]{byte[].class, int.class}, malformedCache, 9);
        out.put("load_cache_fallback", mapSnapshot(type, "BYTE_STATES"));
        clear(type);
        call(type, "processChunk", new Class<?>[]{int.class, int.class, ByteBuffer.class}, 0, 0, (Object)null);
        call(type, "loadCache", new Class<?>[]{byte[].class, int.class}, (Object)null, -1);
        call(type, "loadCache", new Class<?>[]{byte[].class, int.class}, new byte[0], 0);
        call(type, "updateChunk", new Class<?>[]{int.class,int.class,int.class,int[].class,byte[].class,int.class}, 0,0,0,new int[0],new byte[]{1},1);
        call(type, "updateChunk", new Class<?>[]{int.class,int.class,int.class,int[].class,byte[].class,int.class}, -1,2,-64,(Object)null,new byte[]{1},1);
        call(type, "updateChunk", new Class<?>[]{int.class,int.class,int.class,int[].class,byte[].class,int.class}, 0,0,0,(Object)null,(Object)null,1);
        call(type, "updateHeights", new Class<?>[]{int.class,int.class,short[].class,int.class},0,0,(Object)null,1);
        out.put("null_and_partial_inputs_states", mapSnapshot(type, "BYTE_STATES"));
        out.put("null_and_partial_inputs_heights", mapSnapshot(type, "HEIGHTS"));

        clear(type);
        long start = pack(type, 0, 64, 0), goal = pack(type, 4, 64, 3);
        out.put("astar_cardinal", Arrays.toString((long[]) call(type, "findPath", new Class<?>[]{long.class,long.class,float.class,int.class,boolean.class}, start, goal, 1.25f, 4096, false)));
        out.put("astar_diagonal", Arrays.toString((long[]) call(type, "findPath", new Class<?>[]{long.class,long.class,float.class,int.class,boolean.class}, start, goal, Float.NaN, 4096, true)));
        out.put("astar_node_limit", Arrays.toString((long[]) call(type, "findPath", new Class<?>[]{long.class,long.class,float.class,int.class,boolean.class}, start, goal, -7.0f, 1, false)));
        out.put("astar_same_node", Arrays.toString((long[]) call(type, "findPath", new Class<?>[]{long.class,long.class,float.class,int.class,boolean.class}, start, start, 0.0f, 1, false)));
        out.put("can_reach_clear", String.valueOf(call(type, "canReach", new Class<?>[]{long.class,long.class,float.class,int.class,boolean.class}, start, goal, 1.0f, 4096, false)));

        clear(type);
        update(type, 0, 0, 0, new int[]{(64 << 8) | 1, (64 << 8) | (1 << 4) | 1}, new byte[]{2,2});
        long[] blockedRoute = (long[]) call(type, "findPath", new Class<?>[]{long.class,long.class,float.class,int.class,boolean.class}, start, goal, 0.0f, 4096, false);
        out.put("astar_blocked_route", Arrays.toString(blockedRoute));
        long obstacleA = pack(type, 1, 64, 0), obstacleB = pack(type, 1, 64, 1);
        out.put("astar_blocked_avoids_cells", String.valueOf(Arrays.stream(blockedRoute).noneMatch(p -> p == obstacleA || p == obstacleB)));

        clear(type);
        long etherTarget = pack(type, 3, 64, 0);
        out.put("etherwarp_clear", String.valueOf(call(type, "canEtherwarpTo", new Class<?>[]{double.class,double.class,double.class,long.class,double.class}, 0.5,64.5,0.5,etherTarget,0.0)));
        out.put("etherwarp_range_limited", String.valueOf(call(type, "canEtherwarpTo", new Class<?>[]{double.class,double.class,double.class,long.class,double.class}, 0.5,64.5,0.5,etherTarget,2.0)));
        update(type, 0, 0, 0, new int[]{(64 << 8) | 1}, new byte[]{2});
        out.put("etherwarp_blocked_line", String.valueOf(call(type, "canEtherwarpTo", new Class<?>[]{double.class,double.class,double.class,long.class,double.class}, 0.5,64.5,0.5,etherTarget,0.0)));
        out.put("get_byte_state", String.valueOf(call(type, "getByteState", new Class<?>[]{int.class,int.class,int.class},1,64,0)));
        out.put("is_walkable_blocked", String.valueOf(call(type, "isWalkable", new Class<?>[]{long.class},pack(type,1,64,0))));

        clear(type);
        call(type, "a", new Class<?>[]{String.class}, (Object)null);
        out.put("native_flag_after_null_load", String.valueOf(field(type, "IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl")));
        return out;
    }

    public static void main(String[] args) throws Exception {
        URL originalUrl = Path.of(args[0]).toUri().toURL();
        URL currentUrl = Path.of(args[1]).toUri().toURL();
        try (URLClassLoader originalLoader = new URLClassLoader(new URL[]{originalUrl}, ClassLoader.getPlatformClassLoader());
             URLClassLoader currentLoader = new URLClassLoader(new URL[]{currentUrl}, ClassLoader.getPlatformClassLoader())) {
            Class<?> original = Class.forName("me.octo.client.utils.player.pathfinder.NativePathFinder", true, originalLoader);
            Class<?> current = Class.forName("me.octo.client.utils.player.pathfinder.NativePathFinder", true, currentLoader);
            Map<String, String> expected = run(original);
            Map<String, String> actual = run(current);
            boolean passed = true;
            for (String name : expected.keySet()) {
                boolean same = expected.get(name).equals(actual.get(name));
                System.out.println((same ? "MATCH" : "DIFF") + "\t" + name + "\t" + expected.get(name) + (same ? "" : "\tACTUAL=" + actual.get(name)));
                passed &= same;
            }
            boolean semanticChecks = "[64]".equals(actual.get("astar_same_node"))
                && "[]".equals(actual.get("astar_node_limit"))
                && "true".equals(actual.get("can_reach_clear"))
                && "true".equals(actual.get("astar_blocked_avoids_cells"))
                && "false".equals(actual.get("etherwarp_blocked_line"))
                && actual.get("process_chunk_full_map").startsWith("entries=65536 ");
            System.out.println("semantic_checks\t" + (semanticChecks ? "PASS" : "FAIL"));
            passed &= semanticChecks;
            System.out.println("fixture_count\t" + expected.size());
            System.out.println("result\t" + (passed ? "PASS" : "FAIL"));
            if (!passed) System.exit(1);
        }
    }
}




