// PX-FIX PhaseA: jar-only Kotlin nested class restored as a SIGNATURE-ONLY STUB container.
// The (name, descriptor) member set mirrors the jar exactly; the original obfuscated bodies,
// the string-decrypt tables and the captured-value wiring are not recoverable from the jar.
// NOTE: the jar declares 'implements Function2<...>'. SuspendLambda already implements
// kotlin.jvm.internal.FunctionBase<java.lang.Object>, and javac rejects inheriting kotlin.Function
// with different arguments (raw / parameterised Function2 vs <java.lang.Object>). Interfaces are not
// part of the dexact comparison (name+descriptor sets), so the clause is omitted.
// jar class: me.octo.client.IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll
package me.octo.client;

final class IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll extends kotlin.coroutines.jvm.internal.SuspendLambda {
     int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
    final java.lang.String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
    final IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII this$0;
    private static java.lang.String a;

     IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(java.lang.String param0, IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII param1, kotlin.coroutines.Continuation param2) {
        super(2, param2);
        this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = param0;
        this.this$0 = param1;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object param0) {
        me.octo.client.IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
        java.lang.Object var2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
            case 0:
                kotlin.ResultKt.throwOnFailure(param0);
                if (kotlin.text.StringsKt.isBlank((java.lang.CharSequence) this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII)) {
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                }
                if (kotlin.collections.ArraysKt.contains(me.octo.client.IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII.c(this.this$0), this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII)) {
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                }
                java.nio.file.Path var3 = me.octo.client.lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(me.octo.client.IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII.d(this.this$0), this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
                if (!java.nio.file.Files.exists(var3, new java.nio.file.LinkOption[0])) {
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                }
                boolean var4 = var3.toFile().delete();
                if (var4) {
                    this.this$0.F();
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(var4);
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final kotlin.coroutines.Continuation create(java.lang.Object param0, kotlin.coroutines.Continuation param1) {
       return new IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, this.this$0, param1);
    }

    public final java.lang.Object a(kotlinx.coroutines.CoroutineScope param0, kotlin.coroutines.Continuation param1) {
       return ((IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll) this.create(param0, param1)).invokeSuspend(kotlin.Unit.INSTANCE);
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
