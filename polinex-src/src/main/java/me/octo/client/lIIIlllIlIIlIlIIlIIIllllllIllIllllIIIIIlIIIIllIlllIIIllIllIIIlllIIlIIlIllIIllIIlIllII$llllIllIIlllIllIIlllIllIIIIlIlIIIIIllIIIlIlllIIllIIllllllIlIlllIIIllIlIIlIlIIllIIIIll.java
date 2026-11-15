package me.octo.client;

// Restored from me-octo-only.jar (Phase A, agent NT3, pick 1).
// jar class : me.octo.client.lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll
// outer     : lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII
// Separate top-level file whose simple name contains the dollar sign
// (convention (a)); the binary name is identical to the jar's nested class.
//
// FIDELITY: complete. All 7 jar members (constructor, invokeSuspend, create,
// a(CoroutineScope, Continuation), invoke, the private static identity helper
// and <clinit>) and all 3 fields are reproduced with the jar's exact
// descriptors. The jar <clinit> folds its only string constant at run time:
//     c[j] = (char) (c[j] ^ TAB[j % 7] ^ 14)
// with TAB = {116, 91, 53, 74, 78, 94, 54} (tableswitch 0..5 plus default).
// Decrypting yields "call to 'resume' before 'invoke' with coroutine", the
// message of the IllegalStateException thrown from the default branch.
// The obfuscator's stack juggling around that fold is dead code; see
// .analysis/reports/phaseA-nested-NT3.md for the itemised list.
// NOTE (deviation, documented): the jar class also carries the interface
// kotlin.jvm.functions.Function2<CoroutineScope, Continuation<? super Unit>, Object>.
// Its kotlin compiler renamed the real override to a(CoroutineScope, Continuation)
// and added the synthetic bridge invoke(Object, Object), which is the only
// 'invoke' member in the jar. javac refuses that shape (a bridge must target a
// method of the same name), so this class declares the bridge's exact signature
// invoke(Object, Object) itself and does not repeat the implements clause; the
// member set then matches the jar exactly. Nothing here needs the interface:
// the continuation is passed around as kotlin.coroutines.Continuation.
public final class lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll<T> extends kotlin.coroutines.jvm.internal.SuspendLambda {

    int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

    final me.octo.client.lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII<T> this$0;

    private static java.lang.String a;

    lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(me.octo.client.lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII<T> param0, kotlin.coroutines.Continuation<? super lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll> param1) {
        this.this$0 = param0;
        // raw-typed super call: SuspendLambda declares SuspendLambda(int, Continuation<Object>)
        // and Continuation<? super X> does not convert to it without erasure.
        super(2, (kotlin.coroutines.Continuation) param1);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object param0) {
        me.octo.client.IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
        java.lang.Object var2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
            case 0:
                kotlin.ResultKt.throwOnFailure(param0);
                break;
            default:
                throw new java.lang.IllegalStateException(a);
        }
        me.octo.client.lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.d(this.this$0);
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object param0, kotlin.coroutines.Continuation<?> param1) {
        return (kotlin.coroutines.Continuation<kotlin.Unit>) (kotlin.coroutines.Continuation) new lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(this.this$0, (kotlin.coroutines.Continuation) param1);
    }

    public final java.lang.Object a(kotlinx.coroutines.CoroutineScope param0, kotlin.coroutines.Continuation<? super kotlin.Unit> param1) {
        return ((lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll) (kotlin.coroutines.Continuation) this.create(param0, param1)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public java.lang.Object invoke(java.lang.Object param0, java.lang.Object param1) {
        return this.a((kotlinx.coroutines.CoroutineScope) param0, (kotlin.coroutines.Continuation) param1);
    }

    private static java.lang.IllegalStateException a(java.lang.IllegalStateException param0) {
        return param0;
    }

    static {
        char[] var0 = "\u00194W(`$WZrI!3%U\u001fr\u001b&%6W\u00080\u001bc)>N\u0015>^c`'Q\u000e=\u001b'/\"W\u000f!R*%".toCharArray();
        int[] var1 = new int[] {116, 91, 53, 74, 78, 94, 54};
        for (int var2 = 0; var2 < var0.length; var2++) {
            var0[var2] = (char) (var0[var2] ^ var1[var2 % 7] ^ 14);
        }
        a = new java.lang.String(var0).intern();
    }
}
