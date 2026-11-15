package me.octo.client;

// Restored from me-octo-only.jar (Phase A, agent NT3, pick 2).
// jar class : me.octo.client.lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI
// outer     : lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII
// Separate top-level file whose simple name contains the dollar sign
// (convention (a)); the binary name is identical to the jar's nested class.
//
// The jar's third-level lambda class
//     me.octo.client.lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI$lIIIlllIlIIlIlII
// has a 263-character binary name. Its .class file therefore cannot be written
// on this machine at all: 171 + 1 + 263 = 435 characters plus '.class', while
// the gate output dir (57 characters up to .../out/me/octo/client) leaves room
// for 197. The class is still required, because invokeSuspend constructs it, so
// it is declared here as a static nested class under the 16-character prefix of
// its own jar name: the emitted binary name is lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI$lIIIlllIlIIlIlII (shortened), and the
// class body (field this$0, ctor(OUTER), a(Unit, Continuation)) is the jar's.
//
// FIDELITY: complete. All 9 jar members (constructor, invokeSuspend, create,
// a(CoroutineScope, Continuation), private static a(OUTER), invoke, the
// private static identity helper, <clinit> and the dead decoder a(int, int))
// and all 5 fields are reproduced with the jar's exact descriptors.
// <clinit> is the obfuscator's string decryptor: it cuts one cipher constant
// into 52/47-character chunks and folds every character with
//     c[j] = (char) (c[j] ^ TAB[j % 7] ^ 49)
// TAB = {108, 9, 45, 5, 102, 60, 73} (tableswitch 0..5 plus default). Both
// chunks are written into the static String[] a; the parallel array b is
// allocated but stays empty. a(int, int) is the second stage of that decoder
// and has no call site anywhere in the jar (dead code, kept for fidelity).
// The obfuscator's stack juggling and the opaque predicates are dead code; see
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
public final class lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI<T> extends kotlin.coroutines.jvm.internal.SuspendLambda {

    int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

    final me.octo.client.lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII<T> this$0;

    final kotlinx.coroutines.flow.Flow<kotlin.Unit> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

    private static java.lang.String[] a;

    private static java.lang.String[] b;

    lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(me.octo.client.lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII<T> param0, kotlinx.coroutines.flow.Flow<kotlin.Unit> param1, kotlin.coroutines.Continuation<? super lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI> param2) {
        this.this$0 = param0;
        this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = param1;
        // raw-typed super call: SuspendLambda declares SuspendLambda(int, Continuation<Object>)
        // and Continuation<? super X> does not convert to it without erasure.
        super(2, (kotlin.coroutines.Continuation) param2);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object param0) {
        me.octo.client.IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
        java.lang.Object var4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
            case 0:
                kotlin.ResultKt.throwOnFailure(param0);
                break;
            case 1:
                kotlin.ResultKt.throwOnFailure(param0);
                return kotlin.Unit.INSTANCE;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            kotlinx.coroutines.flow.Flow[] var3 = new kotlinx.coroutines.flow.Flow[] {
                me.octo.client.lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.f(this.this$0),
                this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            };
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 1;
            java.lang.Object var6 = ((kotlinx.coroutines.flow.Flow) kotlinx.coroutines.flow.FlowKt.debounce(
                    kotlinx.coroutines.flow.FlowKt.merge(var3), 100L))
                    .collect((kotlinx.coroutines.flow.FlowCollector) (java.lang.Object) new lIIIlllIlIIlIlII(this.this$0),
                            (kotlin.coroutines.Continuation) this);
            if (var6 == var4) {
                return var6;
            }
        } catch (java.lang.Exception var7) {
            java.lang.System.out.println("[WatchDrivenDropdownSetting] Scanning loop crashed:" + var7.getMessage());
            var7.printStackTrace();
            final me.octo.client.lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII var8 = this.this$0;
            me.octo.client.lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.a(var8, new kotlin.jvm.functions.Function0<kotlin.Unit>() {
                public kotlin.Unit invoke() {
                    return lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a(var8);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object param0, kotlin.coroutines.Continuation<?> param1) {
        return (kotlin.coroutines.Continuation<kotlin.Unit>) (kotlin.coroutines.Continuation) new lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(this.this$0,
                this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                (kotlin.coroutines.Continuation) param1);
    }

    public final java.lang.Object a(kotlinx.coroutines.CoroutineScope param0, kotlin.coroutines.Continuation<? super kotlin.Unit> param1) {
        return ((lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI) (kotlin.coroutines.Continuation) this.create(param0, param1)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    private static final kotlin.Unit a(me.octo.client.lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII param0) {
        java.lang.String[] var1 = new java.lang.String[1];
        var1[0] = me.octo.client.lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.g(param0);
        me.octo.client.lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.a(param0, var1);
        return kotlin.Unit.INSTANCE;
    }

    public java.lang.Object invoke(java.lang.Object param0, java.lang.Object param1) {
        return this.a((kotlinx.coroutines.CoroutineScope) param0, (kotlin.coroutines.Continuation) param1);
    }

    private static java.lang.Exception a(java.lang.Exception param0) {
        return param0;
    }

    static {
        int[] var0 = new int[] {108, 9, 45, 5, 102, 60, 73};
        java.lang.String[] var5 = new java.lang.String[2];
        int var3 = 0;
        java.lang.String var2 = "\u00f9\u00a3\u00d9\u008e\u00c1\u00c8\u00e1\u00f2\u00ae\u00a3\u00c7v\u00fe\u008d\u0080\u00caA{c\u00084;\u00fcm?\u00edO\u00d1\u00be\u00a8'~Qgr\u00ddZ\u008f\u009fn\u00f6\u00ad\u0080\u009f\u00f1\u00ae\u00a5{^\u0092\u000f-/\u00f1\u00fc\u00ea\u008dH\u00af\u00d0\u00d3\u0088\u009b\u0084\u00e8\u00a7\u00ff\u00b6/\u0088w\u0084-\u00a4\u0081D\u009bU\u00ea\u008c\u00fd\u00a1[dy\u00b1\u0010\u00e9\u0013&\u000f\u00f1~\u00c8\u00b0\u00ac\u00d7\u0090]\u00e7";
        int var4 = var2.length();
        int var1 = 52;
        int var6 = -1;
        while (true) {
            var6++;
            char[] var7 = var2.substring(var6, var6 + var1).toCharArray();
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = (char) (var7[var8] ^ var0[var8 % 7] ^ 49);
            }
            var5[var3++] = new java.lang.String(var7).intern();
            var6 += var1;
            if (var6 >= var4) {
                break;
            }
            var1 = var2.charAt(var6);
        }
        a = var5;
        b = new java.lang.String[2];
    }

    private static java.lang.String a(int param0, int param1) {
        int var2 = (param0 ^ -2883) & 0xFFFF;
        if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();
            int[] var9 = new int[] {82, 157, 219, 133, 39, 135, 85, 195, 236, 92, 138, 251, 139, 171, 75, 27, 189, 91, 116, 42, 29, 66, 238, 231, 239, 154, 190, 156, 84, 65, 49, 26, 105, 55, 37, 229, 129, 63, 203, 22, 19, 224, 3, 214, 101, 187, 97, 35, 161, 201, 44, 108, 40, 94, 33, 68, 204, 185, 4, 252, 69, 141, 46, 153, 237, 217, 173, 218, 197, 12, 32, 167, 127, 213, 202, 106, 5, 43, 123, 169, 253, 47, 0, 170, 31, 58, 143, 124, 255, 150, 89, 168, 45, 128, 78, 76, 110, 126, 246, 102, 54, 191, 70, 220, 235, 79, 212, 122, 114, 6, 151, 50, 152, 226, 67, 215, 175, 222, 249, 17, 230, 158, 232, 198, 60, 2, 87, 188, 200, 8, 146, 245, 20, 172, 77, 155, 149, 147, 225, 64, 180, 182, 241, 136, 221, 53, 178, 244, 48, 113, 210, 248, 193, 181, 164, 93, 104, 196, 240, 144, 111, 179, 250, 194, 205, 174, 25, 59, 36, 112, 125, 88, 186, 166, 120, 13, 56, 10, 81, 254, 38, 86, 103, 233, 209, 159, 207, 208, 9, 165, 211, 61, 100, 148, 74, 234, 184, 121, 242, 28, 134, 115, 199, 57, 51, 183, 23, 11, 83, 132, 96, 228, 90, 223, 52, 30, 18, 117, 109, 131, 130, 243, 14, 71, 34, 7, 176, 137, 15, 24, 99, 73, 62, 16, 160, 118, 107, 140, 41, 119, 80, 192, 177, 21, 206, 162, 247, 142, 227, 163, 72, 145, 216, 95, 1, 98};
            int var4 = var9[var3[0] & 0xFF];
            int var5 = (param1 & 255) - var4;
            if (var5 < 0) {
                var5 += 256;
            }
            int var6 = ((param1 & 65535) >>> 8) - var4;
            if (var6 < 0) {
                var6 += 256;
            }
            for (int var7 = 0; var7 < var3.length; var7++) {
                if (var7 % 2 == 0) {
                    var3[var7] = (char) (var3[var7] ^ var5);
                    var5 = ((var5 >>> 3) | (var5 << 5)) ^ var3[var7] & 255;
                } else {
                    var3[var7] = (char) (var3[var7] ^ var6);
                    var6 = ((var6 >>> 3) | (var6 << 5)) ^ var3[var7] & 255;
                }
            }
            b[var2] = new java.lang.String(var3).intern();
        }
        return b[var2];
    }

    // Third-level class of the jar; it has no emit(Object, Continuation) member,
    // so it cannot declare 'implements FlowCollector' without inventing one - the
    // call site in invokeSuspend casts the fresh instance to the interface, which
    // is what the jar's checkcast does.
    static final class lIIIlllIlIIlIlII<T> {

        final me.octo.client.lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII<T> this$0;

        lIIIlllIlIIlIlII(me.octo.client.lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII<T> param0) {
            this.this$0 = param0;
        }

        public final java.lang.Object a(kotlin.Unit param0, kotlin.coroutines.Continuation<? super kotlin.Unit> param1) {
            java.lang.String[] var3 = me.octo.client.IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
            if (var3 == null) {
                java.lang.Object var4 = me.octo.client.lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.a(this.this$0, (kotlin.coroutines.Continuation) param1);
                if (var4 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return var4;
                }
            }
            return kotlin.Unit.INSTANCE;
        }
    }
}
