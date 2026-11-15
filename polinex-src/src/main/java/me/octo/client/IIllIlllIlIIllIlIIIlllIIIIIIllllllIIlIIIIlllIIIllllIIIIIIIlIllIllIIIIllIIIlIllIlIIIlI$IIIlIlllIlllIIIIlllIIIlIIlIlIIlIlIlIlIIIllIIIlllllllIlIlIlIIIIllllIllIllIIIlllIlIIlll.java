package me.octo.client;

/*
 * Restored nested class me.octo.client.IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
 *
 * Convention (a) of .analysis/reports/phaseA-nested-create-pilot.md: a separate
 * top-level file whose simple name contains the char 36.  The compiled class file is
 * IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.class, i.e. the same binary name as the jar nest member.
 * (Kotlin obfuscated callable-reference class; javap -p -v on IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.class
 * extracted from .analysis/me-octo-only.jar, major version 65.)
 *
 * Body sources -- every body below is a direct transcription of the jar bytecode:
 *
 *   <init>()V                      FAITHFUL   super(1, java.util.IdentityHashMap.class, "clear", "clear()V", 0);
 *   a(Ljava/util/IdentityHashMap;)V, invoke(Ljava/lang/Object;)Ljava/lang/Object;
 *                                  FAITHFUL   (see bodies)
 *   static {}                      SIGNATURE-ONLY STUB (empty block).
 *      jar body = the obfuscator encrypted-string table initialiser that fills the
 *      private static String[] a / b caches (bipush 8 / anewarray / xor tableswitch).
 *   a(II)Ljava/lang/String;        SIGNATURE-ONLY STUB (returns null).
 *      jar body = a ~1135-line obfuscator string decryptor (tableswitch 0..254 on the
 *      first char of a[arg0], xor loop, cache interned results into b[arg1]).
 *
 *   a(II) and the a/b tables are DEAD in this class: the class body contains no
 *   invokestatic of a(II) and no getstatic of a/b outside the static initialiser and
 *   a(II) itself, a(II) is private static, and the enclosing class (checked with its
 *   own javap -c) only touches this class through the public singleton field.  The two
 *   stubs therefore satisfy the descriptor gate and change no reachable behaviour.
 *
 * KNOWN DEVIATION (invisible to phaseA_dexact.py, which compares only the javap
 * name+descriptor set):
 *   The jar class Signature attribute is
 *     kotlin.jvm.functions.Function1<java.util.IdentityHashMap<com.mojang.blaze3d.vertex.BufferBuilder, me.octo.client.IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl>, kotlin.Unit>
 *   and its invoke() carries ACC_BRIDGE|ACC_SYNTHETIC.  javac cannot produce that
 *   shape from source: implementing the parameterised interface forces a *real*
 *   invoke(param-substituted) plus a compiler bridge -> one EXTRA method, while the
 *   jar has only the erased bridge.  Declaring the interface with erased type
 *   arguments reproduces the jar method set exactly (one invoke(Ljava/lang/Object;)
 *   or invoke()Ljava/lang/Object;), at the cost of the generic Signature above.
 *   The interface is therefore declared RAW (no type argument).  A parameterised
 *   declaration is rejected too: "Function cannot be inherited with different
 *   arguments: <java.lang.Object> and <>" because FunctionReferenceImpl already
 *   inherits kotlin.jvm.functions.Function raw.
 *   TODO for a later round (needs an outer source edit or a nest-based shape):
 *   restore the jar Signature attribute.
 */

final class IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll extends kotlin.jvm.internal.FunctionReferenceImpl
        implements kotlin.jvm.functions.Function1 {

    public static me.octo.client.IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
    private static java.lang.String[] a;
    private static java.lang.String[] b;

    IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll() {
        super(1, java.util.IdentityHashMap.class, "clear", "clear()V", 0);
    }

    public final void a(java.util.IdentityHashMap<com.mojang.blaze3d.vertex.BufferBuilder, me.octo.client.IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
        p0.clear();
    }

    public java.lang.Object invoke(java.lang.Object p0) {
        this.a((java.util.IdentityHashMap<com.mojang.blaze3d.vertex.BufferBuilder, me.octo.client.IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl>)p0);
        return kotlin.Unit.INSTANCE;
    }

    static {
    }

    private static java.lang.String a(int p0, int p1) {
        return null;
    }
}
