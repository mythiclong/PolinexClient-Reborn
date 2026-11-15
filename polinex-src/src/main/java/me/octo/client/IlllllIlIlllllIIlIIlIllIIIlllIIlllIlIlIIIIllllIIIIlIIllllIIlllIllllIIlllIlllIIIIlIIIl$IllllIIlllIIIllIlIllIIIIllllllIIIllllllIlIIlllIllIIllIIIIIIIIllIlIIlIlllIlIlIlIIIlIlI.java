// PX-FIX PhaseA: jar-only Kotlin nested class restored as a SIGNATURE-ONLY STUB container.
// The (name, descriptor) member set mirrors the jar exactly; the original obfuscated bodies,
// the string-decrypt tables and the captured-value wiring are not recoverable from the jar.
// NOTE: the jar declares 'implements Function2<...>'. SuspendLambda already implements
// kotlin.jvm.internal.FunctionBase<java.lang.Object>, and javac rejects inheriting kotlin.Function
// with different arguments (raw / parameterised Function2 vs <java.lang.Object>). Interfaces are not
// part of the dexact comparison (name+descriptor sets), so the clause is omitted.
// jar class: me.octo.client.IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
package me.octo.client;

final class IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI extends kotlin.coroutines.jvm.internal.SuspendLambda {
     int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
    final IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl this$0;
    final java.lang.String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
    final java.util.List IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
    private static java.lang.String a;

     IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl param0, java.lang.String param1, java.util.List param2, kotlin.coroutines.Continuation param3) {
        super(2, param3);
        this.this$0 = param0;
        this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = param1;
        this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = param2;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object param0) {
        return null;
    }

    public final kotlin.coroutines.Continuation create(java.lang.Object param0, kotlin.coroutines.Continuation param1) {
       return new IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(this.this$0, this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, param1);
    }

    public final java.lang.Object a(kotlinx.coroutines.CoroutineScope param0, kotlin.coroutines.Continuation param1) {
       return ((IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI) this.create(param0, param1)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public java.lang.Object invoke(java.lang.Object param0, java.lang.Object param1) {
        this.a((kotlinx.coroutines.CoroutineScope) param0, (kotlin.coroutines.Continuation) param1);
        return kotlin.Unit.INSTANCE;
    }

    private static java.lang.IllegalStateException a(java.lang.IllegalStateException param0) {
        return null;
    }

    static {
        java.lang.String[] unused = new java.lang.String[0];
    }
}
