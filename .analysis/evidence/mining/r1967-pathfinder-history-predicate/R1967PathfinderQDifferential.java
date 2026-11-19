import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/** Directly compares the original and managed q():Z implementations without Minecraft state. */
public final class R1967PathfinderQDifferential {
    private static final String OWNER =
        "me.octo.client.IIIIIllIIlIIlllIIllllllIllIlIlIllllllllIIIIlIlIIIIlIlIlIlIllIlIIIIIIlllIIIIllIlllIlll";
    private static final String RECORD =
        OWNER + "$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll";
    private static final String GUARD =
        "me.octo.client.IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll";

    private R1967PathfinderQDifferential() {}

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            throw new IllegalArgumentException("usage: R1967PathfinderQDifferential <original-jar>");
        }

        ClassLoader managedLoader = ClassLoader.getSystemClassLoader();
        try (ChildFirstPolinexLoader originalLoader = new ChildFirstPolinexLoader(Path.of(args[0]).toUri().toURL(), managedLoader)) {
            Fixture managed = new Fixture(managedLoader);
            Fixture original = new Fixture(originalLoader);
            int compared = 0;

            managed.setGuard(new int[] {2});
            original.setGuard(new int[] {2});
            int mismatches = 0;
            int originalTrue = 0;
            int managedTrue = 0;
            List<String> firstMismatches = new ArrayList<>();
            for (int encoded = 0; encoded < (1 << 16); encoded++) { // all 4^8 pairs of sampled booleans
                int remaining = encoded;
                StringBuilder sequence = new StringBuilder(16);
                for (int index = 0; index < 8; index++) {
                    int states = remaining & 3;
                    remaining >>>= 2;
                    sequence.append((states & 1) == 0 ? '0' : '1')
                        .append((states & 2) == 0 ? '0' : '1').append(',');
                    boolean first = (states & 1) != 0;
                    boolean fourth = (states & 2) != 0;
                    managed.setEntry(index, first, fourth);
                    original.setEntry(index, first, fourth);
                }
                String expected = original.invoke();
                String actual = managed.invoke();
                originalTrue += expected.equals("R:true") ? 1 : 0;
                managedTrue += actual.equals("R:true") ? 1 : 0;
                if (!expected.equals(actual)) {
                    mismatches++;
                    if (firstMismatches.size() < 12) {
                        firstMismatches.add(encoded + ":" + sequence + ":" + expected + "/" + actual);
                    }
                }
                compared++;
            }

            int nonNullGuardBoundaryCases = 0;
            for (int length = 0; length <= 9; length++) {
                managed.setGuard(new int[] {2});
                original.setGuard(new int[] {2});
                managed.setHistoryLength(length);
                original.setHistoryLength(length);
                String expected = original.invoke();
                String actual = managed.invoke();
                if (!expected.equals(actual)) {
                    throw new AssertionError("non-null guard/length mismatch length=" + length
                        + " original=" + expected + " managed=" + actual);
                }
                nonNullGuardBoundaryCases++;
            }

            int nullGuardCases = 0;
            for (int length = 0; length <= 9; length++) {
                managed.setGuard(null);
                original.setGuard(null);
                managed.setHistoryLength(length);
                original.setHistoryLength(length);
                String expected = original.invoke();
                String actual = managed.invoke();
                if (!expected.equals(actual)) {
                    throw new AssertionError("null guard/length mismatch length=" + length
                        + " original=" + expected + " managed=" + actual);
                }
                nullGuardCases++;
            }

            if (mismatches != 0 || nonNullGuardBoundaryCases != 10 || nullGuardCases != 10) {
                throw new AssertionError("differential mismatches=" + mismatches
                    + " first=" + firstMismatches + " nonNullGuardCases=" + nonNullGuardBoundaryCases
                    + " nullGuardCases=" + nullGuardCases);
            }
            System.out.println("{\"result\":\"PASS\",\"non_null_guard_boolean_sequences\":" + compared
                + ",\"original_true\":" + originalTrue + ",\"managed_true\":" + managedTrue
                + ",\"non_null_guard_history_lengths\":" + nonNullGuardBoundaryCases
                + ",\"null_guard_history_lengths\":" + nullGuardCases
                + ",\"mismatches\":0,\"minecraft_world_used\":false}");
        }
    }

    private static final class Fixture {
        private final ClassLoader loader;
        private final Object instance;
        private final Field historyField;
        private final Method guardSetter;
        private final Constructor<?> entryConstructor;
        private final Method setFirst;
        private final Method setFourth;
        private final Method readFirst;
        private final Method readFourth;
        private final Method predicate;
        private final Method guardGetter;
        private final ArrayList<Object> history = new ArrayList<>();
        private final List<Object> entries = new ArrayList<>();

        private Fixture(ClassLoader loader) throws Exception {
            this.loader = loader;
            Class<?> owner = Class.forName(OWNER, true, loader);
            Class<?> guard = Class.forName(GUARD, true, loader);
            Class<?> entry = Class.forName(RECORD, true, loader);

            Class<?> unsafeType = Class.forName("sun.misc.Unsafe");
            Field singleton = unsafeType.getDeclaredField("theUnsafe");
            singleton.setAccessible(true);
            Object unsafe = singleton.get(null);
            this.instance = unsafeType.getMethod("allocateInstance", Class.class).invoke(unsafe, owner);

            this.historyField = owner.getDeclaredField(
                "IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI");
            this.historyField.setAccessible(true);
            this.historyField.set(instance, history);

            this.guardSetter = guard.getDeclaredMethod("b", int[].class);
            this.guardSetter.setAccessible(true);
            this.guardGetter = guard.getDeclaredMethod("l");
            this.guardGetter.setAccessible(true);
            this.entryConstructor = entry.getDeclaredConstructor(boolean.class, boolean.class, boolean.class, boolean.class);
            this.entryConstructor.setAccessible(true);
            this.setFirst = entry.getDeclaredMethod("a", boolean.class);
            this.setFirst.setAccessible(true);
            this.setFourth = entry.getDeclaredMethod("d", boolean.class);
            this.setFourth.setAccessible(true);
            this.readFirst = entry.getDeclaredMethod("a");
            this.readFirst.setAccessible(true);
            this.readFourth = entry.getDeclaredMethod("d");
            this.readFourth.setAccessible(true);
            this.predicate = owner.getDeclaredMethod("q");
            this.predicate.setAccessible(true);

            for (int i = 0; i < 9; i++) {
                Object value = entryConstructor.newInstance(false, false, false, false);
                entries.add(value);
                if (i < 8) {
                    history.add(value);
                }
            }
        }

        private void setGuard(int[] value) throws Exception {
            guardSetter.invoke(null, new Object[] {value});
        }

        private void setEntry(int index, boolean first, boolean fourth) throws Exception {
            Object entry = entries.get(index);
            setFirst.invoke(entry, first);
            setFourth.invoke(entry, fourth);
        }

        private void setHistoryLength(int length) {
            history.clear();
            for (int index = 0; index < length; index++) {
                history.add(entries.get(index));
            }
        }

        private int guardLength() throws Exception {
            int[] value = (int[])guardGetter.invoke(null);
            return value == null ? -1 : value.length;
        }

        private String describeEntries() throws Exception {
            StringBuilder result = new StringBuilder();
            for (Object entry : entries) {
                result.append((Boolean)readFirst.invoke(entry) ? '1' : '0')
                    .append((Boolean)readFourth.invoke(entry) ? '1' : '0').append(',');
            }
            return result.toString();
        }

        private String invoke() throws Exception {
            try {
                return "R:" + predicate.invoke(instance);
            } catch (InvocationTargetException exception) {
                Throwable cause = exception.getCause();
                return "E:" + cause.getClass().getName() + ":" + String.valueOf(cause.getMessage());
            }
        }
    }

    private static final class ChildFirstPolinexLoader extends URLClassLoader {
        private ChildFirstPolinexLoader(URL originalJar, ClassLoader parent) {
            super(new URL[] {originalJar}, parent);
        }

        @Override
        protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
            synchronized (getClassLoadingLock(name)) {
                Class<?> loaded = findLoadedClass(name);
                if (loaded == null && name.startsWith("me.octo.client.")) {
                    try {
                        loaded = findClass(name);
                    } catch (ClassNotFoundException ignored) {
                        // Delegate only if this class is not packaged in the original JAR.
                    }
                }
                if (loaded == null) {
                    loaded = super.loadClass(name, false);
                }
                if (resolve) {
                    resolveClass(loaded);
                }
                return loaded;
            }
        }
    }
}
