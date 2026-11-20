import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.ByteBuffer;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/** Differential golden runner for world-independent NativePathFinder behavior. */
public final class NativePathfinderExtendedGolden {
  private static final String OWNER = "me.octo.client.utils.player.pathfinder.NativePathFinder";
  private static final long SEED = 0x4e41544956455046L;

  private static Class<?> load(Path source) throws Exception {
    URLClassLoader loader = new URLClassLoader(
        new URL[] {source.toUri().toURL()}, ClassLoader.getPlatformClassLoader());
    return Class.forName(OWNER, true, loader);
  }

  private static Object call(Class<?> c, String name, Class<?>[] types, Object... args) throws Exception {
    return c.getMethod(name, types).invoke(null, args);
  }

  private static Object privateCall(Class<?> c, String name, Class<?>[] types, Object... args)
      throws Exception {
    Method method = c.getDeclaredMethod(name, types);
    method.setAccessible(true);
    return method.invoke(null, args);
  }

  private static String map(Class<?> c, String name) throws Exception {
    Field field = c.getDeclaredField(name);
    field.setAccessible(true);
    return new TreeMap<>((Map<?, ?>) field.get(null)).toString();
  }

  private static String digest(String value) throws Exception {
    byte[] hash = MessageDigest.getInstance("SHA-256").digest(value.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    StringBuilder result = new StringBuilder();
    for (byte b : hash) result.append(String.format("%02x", b));
    return result.toString();
  }

  private static String run(Path source) throws Exception {
    Class<?> c = load(source);
    StringBuilder trace = new StringBuilder();
    Random random = new Random(SEED);
    int assertions = 0;

    call(c, "clearCache", new Class<?>[] {});
    for (int i = 0; i < 256; i++) {
      int x = random.nextInt(1 << 26) - (1 << 25);
      int y = random.nextInt(1 << 12) - (1 << 11);
      int z = random.nextInt(1 << 26) - (1 << 25);
      long packed = (long) privateCall(c, "pack",
          new Class<?>[] {int.class, int.class, int.class}, x, y, z);
      int ux = (int) privateCall(c, "unpackX", new Class<?>[] {long.class}, packed);
      int uy = (int) privateCall(c, "unpackY", new Class<?>[] {long.class}, packed);
      int uz = (int) privateCall(c, "unpackZ", new Class<?>[] {long.class}, packed);
      if (x != ux || y != uy || z != uz) throw new AssertionError("signed pack round trip at " + i);
      trace.append(packed).append(':').append(ux).append(',').append(uy).append(',').append(uz).append(';');
      assertions++;
    }

    for (int value = -128; value <= 127; value++) {
      byte normalized = (byte) privateCall(c, "normalizeState", new Class<?>[] {byte.class}, (byte) value);
      byte expected = value == 0 ? (byte) 0 : value == 1 ? (byte) 1 : (byte) 2;
      if (normalized != expected) throw new AssertionError("state normalization " + value);
      trace.append(normalized);
      assertions++;
    }
    trace.append('|');

    int[][] updateCases = {
        {0, 0, 0, 0}, {2, -1, 3, 1}, {-2, 4, -5, 5}, {1, 1, 1, 20},
        {7, -3, 9, -1}, {0, 0, 0, 3}
    };
    for (int i = 0; i < updateCases.length; i++) {
      int[] test = updateCases[i];
      int[] indices = {0, (1 << 8) | (2 << 4) | 3, (15 << 8) | (15 << 4) | 15, -1, 0x12345};
      byte[] states = {0, 1, 2, 3, -1};
      call(c, "updateChunk",
          new Class<?>[] {int.class, int.class, int.class, int[].class, byte[].class, int.class},
          test[0], test[1], test[2], i == 0 ? null : indices, states, test[3]);
      trace.append(map(c, "BYTE_STATES")).append('|');
      assertions++;
    }

    call(c, "clearCache", new Class<?>[] {});
    for (int length : new int[] {0, 1, 8, 9, 10, 17, 18, 19, 71, 72, 73, 255, 256, 257, 511, 512, 513}) {
      ByteBuffer buffer = ByteBuffer.allocate(length + 5);
      buffer.position(2);
      buffer.limit(length + 2);
      for (int i = 0; i < length; i++) buffer.put(i + 2, (byte) ((i * 37 + length) & 0xff));
      call(c, "processChunk", new Class<?>[] {int.class, int.class, ByteBuffer.class}, -3, 5, buffer);
      if (buffer.position() != 2 || buffer.limit() != length + 2) {
        throw new AssertionError("processChunk mutated caller buffer at length " + length);
      }
      trace.append(length).append(':').append(map(c, "BYTE_STATES")).append('|');
      assertions++;
    }

    call(c, "clearCache", new Class<?>[] {});
    for (int length : new int[] {0, 1, 8, 9, 10, 17, 18, 19, 72, 73, 144, 145}) {
      byte[] bytes = new byte[length];
      for (int i = 0; i < length; i++) bytes[i] = (byte) ((i * 53 + length * 7) & 0xff);
      int count = switch (length % 3) { case 0 -> -1; case 1 -> 0; default -> length; };
      call(c, "loadCache", new Class<?>[] {byte[].class, int.class}, bytes, count);
      trace.append(length).append('/').append(count).append(':').append(map(c, "BYTE_STATES")).append('|');
      assertions++;
    }

    short[] heights = new short[300];
    for (int i = 0; i < heights.length; i++) heights[i] = (short) (i * 97 - 12000);
    for (int count : new int[] {-1, 0, 1, 16, 257, 300, 400}) {
      call(c, "updateHeights", new Class<?>[] {int.class, int.class, short[].class, int.class}, -9, 12, heights, count);
      trace.append(count).append(':').append(map(c, "HEIGHTS")).append('|');
      assertions++;
    }
    call(c, "clearCache", new Class<?>[] {});
    if (!map(c, "BYTE_STATES").equals("{}") || !map(c, "HEIGHTS").equals("{}")) {
      throw new AssertionError("clearCache did not clear both maps");
    }
    assertions++;

    int[][] dimensions = {{7, 1, 7}, {6, 4, 6}, {5, 5, 5}};
    for (int scenario = 0; scenario < 72; scenario++) {
      call(c, "clearCache", new Class<?>[] {});
      int[] dim = dimensions[scenario % dimensions.length];
      int width = dim[0], height = dim[1], depth = dim[2];
      int ox = -4, oy = 61, oz = 7;
      for (int x = 0; x < width; x++) for (int y = 0; y < height; y++) for (int z = 0; z < depth; z++) {
        if (random.nextInt(100) < 24) {
          privateCall(c, "setState", new Class<?>[] {int.class, int.class, int.class, byte.class},
              ox + x, oy + y, oz + z, (byte) 2);
        }
      }
      int sx = ox, sy = oy, sz = oz;
      int gx = ox + width - 1, gy = oy + height - 1, gz = oz + depth - 1;
      privateCall(c, "setState", new Class<?>[] {int.class, int.class, int.class, byte.class}, sx, sy, sz, (byte) 1);
      privateCall(c, "setState", new Class<?>[] {int.class, int.class, int.class, byte.class}, gx, gy, gz, (byte) 1);
      long start = (long) privateCall(c, "pack", new Class<?>[] {int.class, int.class, int.class}, sx, sy, sz);
      long goal = (long) privateCall(c, "pack", new Class<?>[] {int.class, int.class, int.class}, gx, gy, gz);
      float scale = switch (scenario % 6) { case 0 -> Float.NaN; case 1 -> Float.POSITIVE_INFINITY; case 2 -> -1.0f; case 3 -> 0.0f; case 4 -> 0.25f; default -> 1.0f; };
      int budget = switch (scenario % 6) { case 0 -> -1; case 1 -> 0; case 2 -> 1; case 3 -> 8; case 4 -> 64; default -> 4096; };
      boolean diagonal = (scenario & 1) == 0;
      long[] path = (long[]) call(c, "findPath",
          new Class<?>[] {long.class, long.class, float.class, int.class, boolean.class}, start, goal, scale, budget, diagonal);
      boolean reachable = (boolean) call(c, "canReach",
          new Class<?>[] {long.class, long.class, float.class, int.class, boolean.class}, start, goal, scale, budget, diagonal);
      if (reachable != (path.length > 0 && path[path.length - 1] == goal)) {
        throw new AssertionError("canReach/findPath mismatch at scenario " + scenario);
      }
      trace.append(scenario).append(':').append(Arrays.toString(path)).append('/').append(reachable).append('|');
      assertions += 2;
    }

    call(c, "clearCache", new Class<?>[] {});
    long same = (long) privateCall(c, "pack", new Class<?>[] {int.class, int.class, int.class}, -2, 64, 9);
    privateCall(c, "setState", new Class<?>[] {int.class, int.class, int.class, byte.class}, -2, 64, 9, (byte) 2);
    long[] samePath = (long[]) call(c, "findPath",
        new Class<?>[] {long.class, long.class, float.class, int.class, boolean.class}, same, same, 0.0f, 1, false);
    if (!Arrays.equals(samePath, new long[] {same})) throw new AssertionError("same-position route contract");
    trace.append("same-blocked-start=").append(Arrays.toString(samePath)).append('|');
    assertions++;

    int[][] rays = {
        {0, 0, 0, 4, 0, 0}, {0, 0, 0, 4, 3, -2}, {-5, -64, 7, 3, -60, 7},
        {1, 12, -8, 1, 12, -8}, {0, 0, 0, 3, 0, 0}
    };
    for (int i = 0; i < rays.length; i++) {
      call(c, "clearCache", new Class<?>[] {});
      int[] ray = rays[i];
      long target = (long) privateCall(c, "pack", new Class<?>[] {int.class, int.class, int.class}, ray[3], ray[4], ray[5]);
      double max = switch (i) { case 0 -> 5.0; case 1 -> 0.0; case 2 -> -1.0; case 3 -> 0.01; default -> 100.0; };
      if (i == 0 || i == 2 || i == 4) {
        privateCall(c, "setState", new Class<?>[] {int.class, int.class, int.class, byte.class},
            ray[3], ray[4], ray[5], (byte) 1);
      }
      if (i == 4) privateCall(c, "setState", new Class<?>[] {int.class, int.class, int.class, byte.class}, 1, 0, 0, (byte) 2);
      boolean result = (boolean) call(c, "canEtherwarpTo",
          new Class<?>[] {double.class, double.class, double.class, long.class, double.class},
          ray[0] + 0.5, ray[1] + 0.5, ray[2] + 0.5, target, max);
      trace.append("ray").append(i).append('=').append(result).append('|');
      assertions++;
    }

    return assertions + ":" + digest(trace.toString());
  }

  public static void main(String[] args) throws Exception {
    String original = run(Path.of(args[0]));
    String current = run(Path.of(args[1]));
    System.out.println("ORIGINAL assertions_and_trace_sha256=" + original);
    System.out.println("CURRENT  assertions_and_trace_sha256=" + current);
    if (!original.equals(current)) throw new AssertionError("original/current NativePathFinder mismatch");
    System.out.println("ASSERTION PASS original equals current across deterministic edge/randomized cases");
  }
}
