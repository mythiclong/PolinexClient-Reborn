import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;

public final class PathfinderNormalizeStateExhaustive {
    private static final String OWNER = "me.octo.client.utils.player.pathfinder.NativePathFinder";

    private PathfinderNormalizeStateExhaustive() {}

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            throw new IllegalArgumentException("expected <original-jar> <compiled-classes>");
        }

        Path originalJar = Path.of(args[0]).toAbsolutePath();
        Path compiledClasses = Path.of(args[1]).toAbsolutePath();
        ClassLoader platform = ClassLoader.getPlatformClassLoader();
        try (URLClassLoader originalLoader = loader(originalJar.toUri().toURL(), platform);
             URLClassLoader compiledLoader = loader(compiledClasses.toUri().toURL(), platform)) {
            Method original = method(originalLoader);
            Method compiled = method(compiledLoader);
            int matches = 0;
            for (int input = Byte.MIN_VALUE; input <= Byte.MAX_VALUE; input++) {
                byte value = (byte) input;
                Object expected = original.invoke(null, value);
                Object actual = compiled.invoke(null, value);
                if (!expected.equals(actual)) {
                    throw new AssertionError("input=" + input + " original=" + expected + " compiled=" + actual);
                }
                matches++;
            }
            System.out.println("owner=" + OWNER);
            System.out.println("descriptor=(B)B");
            System.out.println("domain=all signed byte values [-128,127]");
            System.out.println("matches=" + matches);
            System.out.println("assertion=PASS");
        }
    }

    private static URLClassLoader loader(URL url, ClassLoader parent) {
        return new URLClassLoader(new URL[] {url}, parent);
    }

    private static Method method(ClassLoader loader) throws Exception {
        Method method = Class.forName(OWNER, true, loader).getDeclaredMethod("normalizeState", byte.class);
        method.setAccessible(true);
        return method;
    }
}
