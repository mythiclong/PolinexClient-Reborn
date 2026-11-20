import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;

/**
 * Compares the pure Powder Macro control gate used by Glacite's inventory
 * completion scan, without initializing Minecraft or creating fake game data.
 */
public final class ModeGateGolden {
    private static final String OWNER =
        "me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll$"
            + "IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI";
    private static final int[] INPUTS = {0, 1, -1, 59, 109, Integer.MIN_VALUE, Integer.MAX_VALUE};

    private ModeGateGolden() {}

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            throw new IllegalArgumentException("expected <original-jar> <compiled-classes>");
        }

        int[] original = evaluate(Path.of(args[0]));
        int[] compiled = evaluate(Path.of(args[1]));
        for (int i = 0; i < INPUTS.length; i++) {
            int expected = INPUTS[i] == 0 ? 109 : 0;
            if (original[i] != expected || compiled[i] != expected || original[i] != compiled[i]) {
                throw new AssertionError(
                    "input=" + INPUTS[i] + " expected=" + expected
                        + " original=" + original[i] + " compiled=" + compiled[i]
                );
            }
            System.out.println("input=" + INPUTS[i] + " output=" + compiled[i] + " assertion=PASS");
        }
        System.out.println("cases=" + INPUTS.length + " assertion=PASS");
    }

    private static int[] evaluate(Path artifact) throws Exception {
        URL[] urls = {artifact.toAbsolutePath().toUri().toURL()};
        try (URLClassLoader loader = new URLClassLoader(urls, ClassLoader.getPlatformClassLoader())) {
            Class<?> owner = Class.forName(OWNER, true, loader);
            Method setter = owner.getMethod("b", int.class);
            Method gate = owner.getMethod("d");
            int[] outputs = new int[INPUTS.length];
            for (int i = 0; i < INPUTS.length; i++) {
                setter.invoke(null, INPUTS[i]);
                outputs[i] = (Integer) gate.invoke(null);
            }
            return outputs;
        }
    }
}
