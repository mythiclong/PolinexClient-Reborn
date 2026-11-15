/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Lazy
 *  kotlin.LazyKt
 *  kotlin.Unit
 *  kotlin.coroutines.Continuation
 *  kotlin.coroutines.CoroutineContext
 *  kotlin.jvm.functions.Function2
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  kotlinx.coroutines.BuildersKt
 *  kotlinx.coroutines.CoroutineScope
 *  kotlinx.coroutines.Dispatchers
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package me.octo.client;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import me.octo.client.IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl;
import me.octo.client.lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII;
import me.octo.client.lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl;
import me.octo.client.llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII
extends lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII<IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> {




   public static me.octo.client.PXDyn continuation = null; // PX-FIX missing field v2
   
   public static me.octo.client.PXDyn iIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII = null; // PX-FIX missing field v2
   
   public static me.octo.client.PXDyn var5 = null; // PX-FIX missing field v2
   
    @NotNull
    private String llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
    @NotNull
    private String[] lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
    private int IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
    @Nullable
    private String IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
    @NotNull
    private Lazy IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
    private static String[] h;
    private static String[] i;

    public IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII(@NotNull String string, @NotNull String string2, @NotNull String string3, @NotNull String[] stringArray, int n, @Nullable String string4) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"name");
        Intrinsics.checkNotNullParameter((Object)string2, (String)"description");
        Intrinsics.checkNotNullParameter((Object)string3, (String)"folderName");
        Intrinsics.checkNotNullParameter((Object)stringArray, (String)"staticOptions");
        super(string, string2, stringArray, "Loading...", "No routes found, create one!", "Error loading routes");
        this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = string3;
        this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = stringArray;
        this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = n;
        this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = string4;
        this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = LazyKt.lazy(() -> IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII.a(this));
        BuildersKt.launch(
            kotlinx.coroutines.CoroutineScopeKt.CoroutineScope((CoroutineContext) Dispatchers.getIO()),
            kotlin.coroutines.EmptyCoroutineContext.INSTANCE,
            kotlinx.coroutines.CoroutineStart.DEFAULT,
            (Function2<CoroutineScope, Continuation<? super Unit>, Object>) (scope, continuation) -> {
                while (true) {
                    try {
                        Map<String, ? extends llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> scanned =
                            (Map<String, ? extends llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll>) BuildersKt.runBlocking(
                                (CoroutineContext) kotlin.coroutines.EmptyCoroutineContext.INSTANCE,
                                (Function2<CoroutineScope, Continuation<? super Map<String, ? extends llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll>>, Object>) (scope2, continuation2) ->
                                    a((Continuation<? super Map<String, ? extends llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll>>) continuation2)
                            );
                        String[] names = scanned.keySet().toArray(new String[0]);
                        b(scanned);
                        lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.a(this, names);
                    } catch (Throwable error) {
                        error.printStackTrace();
                    }
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException interrupted) {
                        Thread.currentThread().interrupt();
                        return Unit.INSTANCE;
                    }
                }
            }
        );
    }

    public /* synthetic */ IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII(String string, String string2, String string3, String[] stringArray, int n, String string4, int n2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n2 & 0x10) != 0) {
            n = 25;
        }
        if ((n2 & 0x20) != 0) {
            string4 = null;
        }
        this(string, string2, string3, stringArray, n, string4);
    }

    private final Path R() {
        Lazy lazy = this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
        return (Path)lazy.getValue();
    }

    @NotNull
    public final String[] S() {
        return this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
    }

    @Override
    @NotNull
    protected Path E() {
        return this.R();
    }

    @Nullable
    protected Object a(@NotNull Continuation<? super Map<String, ? extends llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll>> continuation) {
        return BuildersKt.withContext(
            (CoroutineContext) ((CoroutineContext) Dispatchers.getIO()),
            (Function2) new IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(this, (Continuation<? super IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI>) continuation),
            (Continuation<? super LinkedHashMap<String, llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll>>) continuation
        );
    }

    @NotNull
    protected String a(@NotNull llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2) {
        Intrinsics.checkNotNullParameter((Object)llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2, (String)"item");
        return llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.a();
    }

    @NotNull
    protected String b(@NotNull llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2) {
        String string;
        String[] stringArray = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
        Intrinsics.checkNotNullParameter((Object)llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2, (String)"item");
        String[] stringArray2 = stringArray;
        String string2 = llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl, llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.a());
        if (stringArray2 != null || (string = string2) == null) {
            string = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.a();
        }
        String string3 = string;
        Object object = string3;
        if (stringArray2 == null) {
            if (((String)object).length() > this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll) {
                String string4 = string3.substring(0, this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll - 3);
                Intrinsics.checkNotNullExpressionValue((Object)string4, (String)"substring(...)");
                object = string4 + "...";
            } else {
                object = string3;
            }
        }
        return (String)object;
    }

    protected boolean c(@NotNull llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2) {
        Intrinsics.checkNotNullParameter((Object)llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2, (String)"item");
        return llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.d();
    }

    @Nullable
    public final String T() {
        return this.H();
    }

    @Nullable
    public final Path g(@Nullable String string) {
        Path path;
        Path path2;
        String string2;
        String[] stringArray;
        block5: {
            block6: {
                String string3;
                block4: {
                    stringArray = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
                    String string4 = string;
                    string3 = string4;
                    string2 = string4;
                    if (stringArray != null) break block4;
                    if (string3 != null) break block5;
                    if (stringArray != null) break block6;
                    String string5 = this.T();
                    string3 = string5;
                    string2 = string5;
                }
                if (string3 != null) break block5;
            }
            return null;
        }
        String string6 = string2;
        Path path3 = path2 = (path = lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl, string6));
        boolean bl = false;
        Path path4 = path3;
        if (stringArray == null) {
            LinkOption[] linkOptionArray = new LinkOption[]{};
            path4 = Files.exists(path4, Arrays.copyOf(linkOptionArray, linkOptionArray.length)) ? path2 : null;
        }
        return path4;
    }

    @Nullable
    public final Object a(@NotNull String string, @NotNull Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext((CoroutineContext)((CoroutineContext)Dispatchers.getIO()), (Function2)((Function2)new Function2<CoroutineScope, Continuation<? super Boolean>, Object>(){
   public Object invoke(CoroutineScope p0, Continuation<? super Boolean> p1) { return null; } // PX-FIX abs

   public static me.octo.client.PXDyn iIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII = null; // PX-FIX missing field v2
   
            int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            final /* synthetic */ String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            final /* synthetic */ IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII this$0;
            private static String[] a;
            private static String[] b;
            {
                this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = string;
                this.this$0 = ((IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII)(Object)(iIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII));
                /* PX-FIX removed super call */
            }

            /*
             * Exception decompiling
             */
            public final Object invokeSuspend(Object var1_1) {
                /*
                 * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                 * 
                 * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
                 *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
                 *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:923)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
                 *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
                 *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
                 *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
                 *     at org.benf.cfr.reader.Main.main(Main.java:54)
                 */
                throw new IllegalStateException("Decompilation failed");
            }

            public final Continuation<Unit> create(Object object, Continuation<?> continuation) {
                return (Continuation)null /* PX-FIX */;
            }

            public final Object a(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
                return this.invokeSuspend(Unit.INSTANCE); // PX-FIX suspend-invoke
            }

            private static IllegalStateException a(IllegalStateException illegalStateException) {
                return illegalStateException;
            }

            /*
             * Unable to fully structure code
             */
            private static String a(int n, int n2) {
                int n3 = (n ^ 0xFFFFB28A) & 0xFFFF;
                if (b[n3] == null) {
                    int n4;
                    char[] cArray = a[n3].toCharArray();
                    int n5 = switch (cArray[0] & 0xFF) {
                        case 0 -> 198;
                        case 1 -> 123;
                        case 2 -> 148;
                        case 3 -> 185;
                        case 4 -> 237;
                        case 5 -> 139;
                        case 6 -> 184;
                        case 7 -> 182;
                        case 8 -> 99;
                        case 9 -> 143;
                        case 10 -> 150;
                        case 11 -> 27;
                        case 12 -> 214;
                        case 13 -> 254;
                        case 14 -> 8;
                        case 15 -> 7;
                        case 16 -> 36;
                        case 17 -> 241;
                        case 18 -> 196;
                        case 19 -> 203;
                        case 20 -> 248;
                        case 21 -> 43;
                        case 22 -> 137;
                        case 23 -> 209;
                        case 24 -> 232;
                        case 25 -> 117;
                        case 26 -> 249;
                        case 27 -> 115;
                        case 28 -> 164;
                        case 29 -> 65;
                        case 30 -> 67;
                        case 31 -> 152;
                        case 32 -> 156;
                        case 33 -> 109;
                        case 34 -> 138;
                        case 35 -> 94;
                        case 36 -> 141;
                        case 37 -> 201;
                        case 38 -> 95;
                        case 39 -> 14;
                        case 40 -> 231;
                        case 41 -> 171;
                        case 42 -> 219;
                        case 43 -> 192;
                        case 44 -> 114;
                        case 45 -> 113;
                        case 46 -> 197;
                        case 47 -> 151;
                        case 48 -> 9;
                        case 49 -> 134;
                        case 50 -> 31;
                        case 51 -> 48;
                        case 52 -> 28;
                        case 53 -> 205;
                        case 54 -> 10;
                        case 55 -> 193;
                        case 56 -> 118;
                        case 57 -> 85;
                        case 58 -> 158;
                        case 59 -> 107;
                        case 60 -> 100;
                        case 61 -> 142;
                        case 62 -> 147;
                        case 63 -> 59;
                        case 64 -> 235;
                        case 65 -> 51;
                        case 66 -> 135;
                        case 67 -> 22;
                        case 68 -> 162;
                        case 69 -> 30;
                        case 70 -> 166;
                        case 71 -> 108;
                        case 72 -> 208;
                        case 73 -> 155;
                        case 74 -> 163;
                        case 75 -> 176;
                        case 76 -> 97;
                        case 77 -> 128;
                        case 78 -> 247;
                        case 79 -> 98;
                        case 80 -> 157;
                        case 81 -> 145;
                        case 82 -> 3;
                        case 83 -> 39;
                        case 84 -> 222;
                        case 85 -> 86;
                        case 86 -> 191;
                        case 87 -> 221;
                        case 88 -> 223;
                        case 89 -> 104;
                        case 90 -> 17;
                        case 91 -> 57;
                        case 92 -> 26;
                        case 93 -> 0;
                        case 94 -> 110;
                        case 95 -> 55;
                        case 96 -> 189;
                        case 97 -> 233;
                        case 98 -> 40;
                        case 99 -> 217;
                        case 100 -> 62;
                        case 101 -> 47;
                        case 102 -> 132;
                        case 103 -> 92;
                        case 104 -> 11;
                        case 105 -> 170;
                        case 106 -> 245;
                        case 107 -> 91;
                        case 108 -> 183;
                        case 109 -> 187;
                        case 110 -> 20;
                        case 111 -> 177;
                        case 112 -> 49;
                        case 113 -> 174;
                        case 114 -> 16;
                        case 115 -> 76;
                        case 116 -> 243;
                        case 117 -> 144;
                        case 118 -> 190;
                        case 119 -> 126;
                        case 120 -> 120;
                        case 121 -> 93;
                        case 122 -> 159;
                        case 123 -> 168;
                        case 124 -> 96;
                        case 125 -> 240;
                        case 126 -> 252;
                        case 127 -> 75;
                        case 128 -> 161;
                        case 129 -> 181;
                        case 130 -> 133;
                        case 131 -> 25;
                        case 132 -> 56;
                        case 133 -> 210;
                        case 134 -> 83;
                        case 135 -> 229;
                        case 136 -> 42;
                        case 137 -> 77;
                        case 138 -> 61;
                        case 139 -> 122;
                        case 140 -> 88;
                        case 141 -> 146;
                        case 142 -> 81;
                        case 143 -> 2;
                        case 144 -> 46;
                        case 145 -> 66;
                        case 146 -> 73;
                        case 147 -> 5;
                        case 148 -> 112;
                        case 149 -> 225;
                        case 150 -> 228;
                        case 151 -> 89;
                        case 152 -> 1;
                        case 153 -> 125;
                        case 154 -> 136;
                        case 155 -> 71;
                        case 156 -> 68;
                        case 157 -> 6;
                        case 158 -> 188;
                        case 159 -> 224;
                        case 160 -> 64;
                        case 161 -> 12;
                        case 162 -> 226;
                        case 163 -> 212;
                        case 164 -> 251;
                        case 165 -> 58;
                        case 166 -> 116;
                        case 167 -> 204;
                        case 168 -> 172;
                        case 169 -> 23;
                        case 170 -> 33;
                        case 171 -> 111;
                        case 172 -> 179;
                        case 173 -> 127;
                        case 174 -> 250;
                        case 175 -> 45;
                        case 176 -> 79;
                        case 177 -> 200;
                        case 178 -> 53;
                        case 179 -> 153;
                        case 180 -> 167;
                        case 181 -> 215;
                        case 182 -> 255;
                        case 183 -> 140;
                        case 184 -> 29;
                        case 185 -> 130;
                        case 186 -> 121;
                        case 187 -> 178;
                        case 188 -> 194;
                        case 189 -> 199;
                        case 190 -> 102;
                        case 191 -> 253;
                        case 192 -> 186;
                        case 193 -> 101;
                        case 194 -> 218;
                        case 195 -> 216;
                        case 196 -> 72;
                        case 197 -> 82;
                        case 198 -> 202;
                        case 199 -> 119;
                        case 200 -> 32;
                        case 201 -> 15;
                        case 202 -> 207;
                        case 203 -> 234;
                        case 204 -> 180;
                        case 205 -> 131;
                        case 206 -> 24;
                        case 207 -> 129;
                        case 208 -> 195;
                        case 209 -> 242;
                        case 210 -> 106;
                        case 211 -> 41;
                        case 212 -> 35;
                        case 213 -> 38;
                        case 214 -> 149;
                        case 215 -> 84;
                        case 216 -> 238;
                        case 217 -> 211;
                        case 218 -> 18;
                        case 219 -> 60;
                        case 220 -> 154;
                        case 221 -> 87;
                        case 222 -> 34;
                        case 223 -> 165;
                        case 224 -> 70;
                        case 225 -> 69;
                        case 226 -> 105;
                        case 227 -> 52;
                        case 228 -> 227;
                        case 229 -> 50;
                        case 230 -> 173;
                        case 231 -> 21;
                        case 232 -> 230;
                        case 233 -> 44;
                        case 234 -> 37;
                        case 235 -> 206;
                        case 236 -> 90;
                        case 237 -> 54;
                        case 238 -> 239;
                        case 239 -> 213;
                        case 240 -> 4;
                        case 241 -> 78;
                        case 242 -> 124;
                        case 243 -> 80;
                        case 244 -> 169;
                        case 245 -> 175;
                        case 246 -> 19;
                        case 247 -> 74;
                        case 248 -> 220;
                        case 249 -> 244;
                        case 250 -> 160;
                        case 251 -> 246;
                        case 252 -> 103;
                        case 253 -> 13;
                        case 254 -> 63;
                        default -> 236;
                    };
                    int n6 = (n2 & 0xFF) - n5;
                    if (n6 < 0) {
                        n6 += 256;
                    }
                    if ((n4 = ((n2 & 0xFFFF) >>> 8) - n5) < 0) {
                        n4 += 256;
                    }
                    int n7 = 0;
                    while (n7 < cArray.length) {
                        int n8 = n7 % 2;
                        int n9 = n7;
                        char[] cArray2 = cArray;
                        char c = cArray[n9];
                        if (n8 == 0) {
                            cArray2[n9] = (char)(c ^ n6);
                            n6 = ((n6 >>> 3 | n6 << 5) ^ cArray[n7]) & 0xFF;
                        } else {
                            cArray2[n9] = (char)(c ^ n4);
                            n4 = ((n4 >>> 3 | n4 << 5) ^ cArray[n7]) & 0xFF;
                        }
                        ++n7;
                    }
                    me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.b[n3] = new String(cArray).intern();
                }
                return b[n3];
            }
        }), continuation);
    }

    public final boolean h(@NotNull String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"routeName");
        try { // PX-FIX: InterruptedException（checked）包装
        return (Boolean)BuildersKt.runBlocking((CoroutineContext)kotlin.coroutines.EmptyCoroutineContext.INSTANCE, (Function2)((Function2)new Function2<CoroutineScope, Continuation<? super Boolean>, Object>(){
   public Object invoke(CoroutineScope p0, Continuation<? super Boolean> p1) { return null; } // PX-FIX abs

   public static me.octo.client.PXDyn continuation = null; // PX-FIX missing field v2
   
   public static me.octo.client.PXDyn iIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII = null; // PX-FIX missing field v2
   
            int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            final /* synthetic */ IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII this$0;
            final /* synthetic */ String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            private static String a;
            {
                this.this$0 = ((IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII)(Object)(iIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII));
                this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = string;
                /* PX-FIX removed super call */
            }

            /*
             * Exception decompiling
             */
            public final Object invokeSuspend(Object var1_1) {
                /*
                 * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                 * 
                 * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 4[SWITCH]
                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
                 *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
                 *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:923)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
                 *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
                 *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
                 *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
                 *     at org.benf.cfr.reader.Main.main(Main.java:54)
                 */
                throw new IllegalStateException("Decompilation failed");
            }

            public final Continuation<Unit> create(Object object, Continuation<?> continuation) {
                return (Continuation)null /* PX-FIX */;
            }

            public final Object a(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
                return this.invokeSuspend(Unit.INSTANCE); // PX-FIX suspend-invoke
            }

            private static IllegalStateException a(IllegalStateException illegalStateException) {
                return illegalStateException;
            }

            /*
             * Handled impossible loop by duplicating code
             * Enabled aggressive block sorting
             */
            static {
                char[] cArray;
                block12: {
                    int n;
                    char[] cArray2;
                    int n2;
                    int n3;
                    block11: {
                        char[] cArray3 = "9\u0012T\u001fRr\rzTJ\u0016\u0001s\u000f?T\u0018\u0011\u0017`\r(\u0016\u0018T\u001bh\u00145\u0018]TRq\u000b.\u001b\u0018\u0010\u001dt\r/\u0007Q\u001d\u0017".toCharArray();
                        int n4 = cArray3.length;
                        n3 = 0;
                        n2 = 74;
                        cArray2 = cArray3;
                        n = n4;
                        if (n4 <= 1) break block11;
                        cArray = cArray2;
                        n = n;
                        if (n <= n3) break block12;
                    }
                    do {
                        int n5 = n2;
                        cArray2 = cArray2;
                        char[] cArray4 = cArray2;
                        int n6 = n2;
                        int n7 = n3;
                        while (true) {
                            cArray4[n7] = (char)(cArray4[n7] ^ (n6 ^ (switch (n3 % 7) {
                                case 0 -> 16;
                                case 1 -> 57;
                                case 2 -> 114;
                                case 3 -> 57;
                                case 4 -> 56;
                                case 5 -> 76;
                                default -> 40;
                            })));
                            ++n3;
                            n2 = n5;
                            if (n5 != 0) break;
                            n5 = n2;
                            cArray2 = cArray2;
                            n7 = n2;
                            cArray4 = cArray2;
                            n6 = n2;
                        }
                        cArray = cArray2;
                        n = n;
                    } while (n > n3);
                }
                a = new String(cArray).intern();
            }
        }));
        } catch (InterruptedException var999px1) {
           throw new RuntimeException(var999px1);
        }
    }

    @Nullable
    public final Object b(@NotNull String string, @NotNull Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext((CoroutineContext)((CoroutineContext)Dispatchers.getIO()), (Function2)((Function2)new Function2<CoroutineScope, Continuation<? super Boolean>, Object>(){
   public Object invoke(CoroutineScope p0, Continuation<? super Boolean> p1) { return null; } // PX-FIX abs

   public static me.octo.client.PXDyn continuation = null; // PX-FIX missing field v2
   
   public static me.octo.client.PXDyn iIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII = null; // PX-FIX missing field v2
   
            int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            final /* synthetic */ String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            final /* synthetic */ IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII this$0;
            private static String a;
            {
                this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = string;
                this.this$0 = ((IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII)(Object)(iIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII));
                /* PX-FIX removed super call */
            }

            /*
             * Exception decompiling
             */
            public final Object invokeSuspend(Object var1_1) {
                /*
                 * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                 * 
                 * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
                 *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
                 *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:923)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
                 *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
                 *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
                 *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
                 *     at org.benf.cfr.reader.Main.main(Main.java:54)
                 */
                throw new IllegalStateException("Decompilation failed");
            }

            public final Continuation<Unit> create(Object object, Continuation<?> continuation) {
                return (Continuation)null /* PX-FIX */;
            }

            public final Object a(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
                return this.invokeSuspend(Unit.INSTANCE); // PX-FIX suspend-invoke
            }

            private static IllegalStateException a(IllegalStateException illegalStateException) {
                return illegalStateException;
            }

            /*
             * Handled impossible loop by duplicating code
             * Enabled aggressive block sorting
             */
            static {
                char[] cArray;
                block12: {
                    int n;
                    char[] cArray2;
                    int n2;
                    int n3;
                    block11: {
                        char[] cArray3 = "\u0004U.\u001coj\u001dG\u00130\u0015<k\u001f\u0002\u0013b\u0012*x\u001d\u0015QbW&p\u0004\b_'Woi\u001b\u0013\\b\u0013 l\u001d\u0012@+\u001e*".toCharArray();
                        int n4 = cArray3.length;
                        n3 = 0;
                        n2 = 51;
                        cArray2 = cArray3;
                        n = n4;
                        if (n4 <= 1) break block11;
                        cArray = cArray2;
                        n = n;
                        if (n <= n3) break block12;
                    }
                    do {
                        int n5 = n2;
                        cArray2 = cArray2;
                        char[] cArray4 = cArray2;
                        int n6 = n2;
                        int n7 = n3;
                        while (true) {
                            cArray4[n7] = (char)(cArray4[n7] ^ (n6 ^ (switch (n3 % 7) {
                                case 0 -> 84;
                                case 1 -> 7;
                                case 2 -> 113;
                                case 3 -> 67;
                                case 4 -> 124;
                                case 5 -> 45;
                                default -> 65;
                            })));
                            ++n3;
                            n2 = n5;
                            if (n5 != 0) break;
                            n5 = n2;
                            cArray2 = cArray2;
                            n7 = n2;
                            cArray4 = cArray2;
                            n6 = n2;
                        }
                        cArray = cArray2;
                        n = n;
                    } while (n > n3);
                }
                a = new String(cArray).intern();
            }
        }), continuation);
    }

    public final boolean i(@NotNull String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"routeName");
        try { // PX-FIX: InterruptedException（checked）包装
        return (Boolean)BuildersKt.runBlocking((CoroutineContext)kotlin.coroutines.EmptyCoroutineContext.INSTANCE, (Function2)((Function2)new Function2<CoroutineScope, Continuation<? super Boolean>, Object>(){
   public Object invoke(CoroutineScope p0, Continuation<? super Boolean> p1) { return null; } // PX-FIX abs

   public static me.octo.client.PXDyn continuation = null; // PX-FIX missing field v2
   
   public static me.octo.client.PXDyn iIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII = null; // PX-FIX missing field v2
   
            int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            final /* synthetic */ IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII this$0;
            final /* synthetic */ String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            private static String a;
            {
                this.this$0 = ((IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII)(Object)(iIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII));
                this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = string;
                /* PX-FIX removed super call */
            }

            /*
             * Exception decompiling
             */
            public final Object invokeSuspend(Object var1_1) {
                /*
                 * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                 * 
                 * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 4[SWITCH]
                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
                 *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
                 *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:923)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
                 *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
                 *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
                 *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
                 *     at org.benf.cfr.reader.Main.main(Main.java:54)
                 */
                throw new IllegalStateException("Decompilation failed");
            }

            public final Continuation<Unit> create(Object object, Continuation<?> continuation) {
                return (Continuation)null /* PX-FIX */;
            }

            public final Object a(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
                return this.invokeSuspend(Unit.INSTANCE); // PX-FIX suspend-invoke
            }

            private static IllegalStateException a(IllegalStateException illegalStateException) {
                return illegalStateException;
            }

            /*
             * Handled impossible loop by duplicating code
             * Enabled aggressive block sorting
             */
            static {
                char[] cArray;
                block12: {
                    int n;
                    char[] cArray2;
                    int n2;
                    int n3;
                    block11: {
                        char[] cArray3 = "Be\u0003\u0019K{D\u0001#\u001d\u0010\u0018zFD#O\u0017\u000eiDSaOR\u0002a]No\nRKxBUlO\u0016\u0004}DTp\u0006\u001b\u000e".toCharArray();
                        int n4 = cArray3.length;
                        n3 = 0;
                        n2 = 78;
                        cArray2 = cArray3;
                        n = n4;
                        if (n4 <= 1) break block11;
                        cArray = cArray2;
                        n = n;
                        if (n <= n3) break block12;
                    }
                    do {
                        int n5 = n2;
                        cArray2 = cArray2;
                        char[] cArray4 = cArray2;
                        int n6 = n2;
                        int n7 = n3;
                        while (true) {
                            cArray4[n7] = (char)(cArray4[n7] ^ (n6 ^ (switch (n3 % 7) {
                                case 0 -> 111;
                                case 1 -> 74;
                                case 2 -> 33;
                                case 3 -> 59;
                                case 4 -> 37;
                                case 5 -> 65;
                                default -> 101;
                            })));
                            ++n3;
                            n2 = n5;
                            if (n5 != 0) break;
                            n5 = n2;
                            cArray2 = cArray2;
                            n7 = n2;
                            cArray4 = cArray2;
                            n6 = n2;
                        }
                        cArray = cArray2;
                        n = n;
                    } while (n > n3);
                }
                a = new String(cArray).intern();
            }
        }));
        } catch (InterruptedException var999px2) {
           throw new RuntimeException(var999px2);
        }
    }

    private static final Path a(IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII iIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII) {
        return lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(iIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl);
    }

    public static final /* synthetic */ Path b(IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII iIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII) {
        return iIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII.R();
    }

    public static final /* synthetic */ String[] c(IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII iIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII) {
        return iIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
    }

    public static final /* synthetic */ String d(IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII iIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII) {
        return iIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
    }

    /*
     * Unable to fully structure code
     */
    static {
        String[] var5 = new String[13]; // PX-FIX: 解密初始化被桩化
        IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII.h = ((String[])(Object)(var5));
        IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII.i = new String[13];
    }

    private static String d(int n, int n2) {
        int n3 = (n ^ 0x673D) & 0xFFFF;
        if (i[n3] == null) {
            int n4;
            char[] cArray = h[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 169;
                case 1 -> 136;
                case 2 -> 227;
                case 3 -> 223;
                case 4 -> 252;
                case 5 -> 30;
                case 6 -> 246;
                case 7 -> 65;
                case 8 -> 151;
                case 9 -> 19;
                case 10 -> 89;
                case 11 -> 184;
                case 12 -> 86;
                case 13 -> 127;
                case 14 -> 176;
                case 15 -> 242;
                case 16 -> 210;
                case 17 -> 118;
                case 18 -> 225;
                case 19 -> 197;
                case 20 -> 224;
                case 21 -> 181;
                case 22 -> 35;
                case 23 -> 139;
                case 24 -> 156;
                case 25 -> 111;
                case 26 -> 230;
                case 27 -> 110;
                case 28 -> 164;
                case 29 -> 167;
                case 30 -> 81;
                case 31 -> 147;
                case 32 -> 59;
                case 33 -> 32;
                case 34 -> 108;
                case 35 -> 101;
                case 36 -> 219;
                case 37 -> 162;
                case 38 -> 79;
                case 39 -> 144;
                case 40 -> 72;
                case 41 -> 38;
                case 42 -> 39;
                case 43 -> 168;
                case 44 -> 93;
                case 45 -> 23;
                case 46 -> 70;
                case 47 -> 33;
                case 48 -> 212;
                case 49 -> 69;
                case 50 -> 244;
                case 51 -> 3;
                case 52 -> 10;
                case 53 -> 213;
                case 54 -> 46;
                case 55 -> 178;
                case 56 -> 226;
                case 57 -> 222;
                case 58 -> 180;
                case 59 -> 29;
                case 60 -> 113;
                case 61 -> 160;
                case 62 -> 174;
                case 63 -> 128;
                case 64 -> 4;
                case 65 -> 75;
                case 66 -> 149;
                case 67 -> 48;
                case 68 -> 199;
                case 69 -> 142;
                case 70 -> 166;
                case 71 -> 148;
                case 72 -> 73;
                case 73 -> 36;
                case 74 -> 114;
                case 75 -> 34;
                case 76 -> 14;
                case 77 -> 15;
                case 78 -> 146;
                case 79 -> 100;
                case 80 -> 122;
                case 81 -> 47;
                case 82 -> 66;
                case 83 -> 18;
                case 84 -> 105;
                case 85 -> 54;
                case 86 -> 115;
                case 87 -> 13;
                case 88 -> 28;
                case 89 -> 248;
                case 90 -> 50;
                case 91 -> 191;
                case 92 -> 67;
                case 93 -> 125;
                case 94 -> 1;
                case 95 -> 203;
                case 96 -> 161;
                case 97 -> 175;
                case 98 -> 31;
                case 99 -> 237;
                case 100 -> 78;
                case 101 -> 57;
                case 102 -> 183;
                case 103 -> 90;
                case 104 -> 103;
                case 105 -> 234;
                case 106 -> 231;
                case 107 -> 6;
                case 108 -> 235;
                case 109 -> 209;
                case 110 -> 229;
                case 111 -> 16;
                case 112 -> 71;
                case 113 -> 202;
                case 114 -> 188;
                case 115 -> 228;
                case 116 -> 131;
                case 117 -> 56;
                case 118 -> 208;
                case 119 -> 194;
                case 120 -> 239;
                case 121 -> 43;
                case 122 -> 8;
                case 123 -> 165;
                case 124 -> 196;
                case 125 -> 221;
                case 126 -> 189;
                case 127 -> 121;
                case 128 -> 95;
                case 129 -> 171;
                case 130 -> 211;
                case 131 -> 133;
                case 132 -> 255;
                case 133 -> 138;
                case 134 -> 214;
                case 135 -> 60;
                case 136 -> 157;
                case 137 -> 150;
                case 138 -> 207;
                case 139 -> 0;
                case 140 -> 21;
                case 141 -> 217;
                case 142 -> 62;
                case 143 -> 26;
                case 144 -> 137;
                case 145 -> 55;
                case 146 -> 24;
                case 147 -> 163;
                case 148 -> 27;
                case 149 -> 17;
                case 150 -> 61;
                case 151 -> 77;
                case 152 -> 92;
                case 153 -> 195;
                case 154 -> 200;
                case 155 -> 129;
                case 156 -> 201;
                case 157 -> 177;
                case 158 -> 96;
                case 159 -> 45;
                case 160 -> 98;
                case 161 -> 187;
                case 162 -> 85;
                case 163 -> 97;
                case 164 -> 64;
                case 165 -> 132;
                case 166 -> 135;
                case 167 -> 112;
                case 168 -> 53;
                case 169 -> 104;
                case 170 -> 170;
                case 171 -> 143;
                case 172 -> 253;
                case 173 -> 251;
                case 174 -> 106;
                case 175 -> 240;
                case 176 -> 51;
                case 177 -> 41;
                case 178 -> 190;
                case 179 -> 74;
                case 180 -> 192;
                case 181 -> 130;
                case 182 -> 102;
                case 183 -> 236;
                case 184 -> 134;
                case 185 -> 117;
                case 186 -> 220;
                case 187 -> 88;
                case 188 -> 94;
                case 189 -> 204;
                case 190 -> 241;
                case 191 -> 83;
                case 192 -> 186;
                case 193 -> 140;
                case 194 -> 205;
                case 195 -> 158;
                case 196 -> 5;
                case 197 -> 215;
                case 198 -> 119;
                case 199 -> 123;
                case 200 -> 76;
                case 201 -> 243;
                case 202 -> 182;
                case 203 -> 44;
                case 204 -> 218;
                case 205 -> 120;
                case 206 -> 107;
                case 207 -> 245;
                case 208 -> 172;
                case 209 -> 179;
                case 210 -> 25;
                case 211 -> 126;
                case 212 -> 63;
                case 213 -> 68;
                case 214 -> 80;
                case 215 -> 154;
                case 216 -> 87;
                case 217 -> 247;
                case 218 -> 250;
                case 219 -> 58;
                case 220 -> 193;
                case 221 -> 12;
                case 222 -> 124;
                case 223 -> 40;
                case 224 -> 152;
                case 225 -> 141;
                case 226 -> 145;
                case 227 -> 42;
                case 228 -> 155;
                case 229 -> 159;
                case 230 -> 232;
                case 231 -> 9;
                case 232 -> 173;
                case 233 -> 238;
                case 234 -> 254;
                case 235 -> 20;
                case 236 -> 84;
                case 237 -> 249;
                case 238 -> 52;
                case 239 -> 82;
                case 240 -> 206;
                case 241 -> 198;
                case 242 -> 11;
                case 243 -> 233;
                case 244 -> 2;
                case 245 -> 91;
                case 246 -> 22;
                case 247 -> 37;
                case 248 -> 116;
                case 249 -> 49;
                case 250 -> 99;
                case 251 -> 153;
                case 252 -> 216;
                case 253 -> 7;
                case 254 -> 185;
                default -> 109;
            };
            int n6 = (n2 & 0xFF) - n5;
            if (n6 < 0) {
                n6 += 256;
            }
            if ((n4 = ((n2 & 0xFFFF) >>> 8) - n5) < 0) {
                n4 += 256;
            }
            int n7 = 0;
            while (n7 < cArray.length) {
                int n8 = n7 % 2;
                int n9 = n7;
                char[] cArray2 = cArray;
                char c = cArray[n9];
                if (n8 == 0) {
                    cArray2[n9] = (char)(c ^ n6);
                    n6 = ((n6 >>> 3 | n6 << 5) ^ cArray[n7]) & 0xFF;
                } else {
                    cArray2[n9] = (char)(c ^ n4);
                    n4 = ((n4 >>> 3 | n4 << 5) ^ cArray[n7]) & 0xFF;
                }
                ++n7;
            }
            IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII.i[n3] = new String(cArray).intern();
        }
        return i[n3];
    }

    public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        @NotNull
        private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        private final long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
        private final long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
        private final boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
        private static String[] a;
        private static String[] b;
    static {
        String[] stringArray = new String[6];
        String[] stringArray2 = new String[]{"\005\u00b7(E!0\u009c\006\013w\u0097o-\u00a0\u00b4\u00f4\036\u00f6\u00acD\b\u009e8[\u00b4O\016Q\u00c1\n\026\u00cdL|\020\u00c3\u00a0t\u00ba\u00b9", "\u00edj\u00cey\u00bc\u00fc2\u00e1\u00f1\u00a0\030\u008b\u00a5Rc\u0099\u0098\u00d95\017\u0091\u0096\u00e9Ut\u00f3\u00dc\u0093`\u0087@\006\u00a7\u00e2x"};
        int[] nArray = new int[]{8, 19};
        int[] nArray2 = new int[]{116, 102};
        int n = 0;
        for (int i = 0; i < 2; i++) {
            String string = stringArray2[i];
            int n2 = -1;
            int n3 = nArray[i];
            int n4 = nArray2[i];
            while (true) {
                n2++;
                char[] cArray = string.substring(n2, n2 + n3).toCharArray();
                for (int j = 0; j < cArray.length; j++) {
                    int n5 = switch (j % 7) {
                        case 0 -> 54;
                        case 1 -> 56;
                        case 2 -> 114;
                        case 3 -> 111;
                        case 4 -> 63;
                        case 5 -> 39;
                        default -> 79;
                    };
                    cArray[j] = (char)(cArray[j] ^ n4 ^ n5);
                }
                stringArray[n++] = new String(cArray).intern();
                n2 += n3;
                if (n2 >= string.length()) {
                    break;
                }
                n3 = string.charAt(n2);
            }
        }
        a = stringArray;
        b = new String[6];
    }


        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(@NotNull String string, long l, long l2, boolean bl) {
            Intrinsics.checkNotNullParameter((Object)string, (String)"fileName");
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = string;
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = l;
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = l2;
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = bl;
        }

        @NotNull
        public final String a() {
            return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        }

        public final long b() {
            return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
        }

        public final long c() {
            return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
        }

        public final boolean d() {
            return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
        }

        @NotNull
        public final String e() {
            return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        }

        public final long f() {
            return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
        }

        public final long g() {
            return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
        }

        public final boolean h() {
            return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
        }

        @NotNull
        public final llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(@NotNull String string, long l, long l2, boolean bl) {
            Intrinsics.checkNotNullParameter((Object)string, (String)"fileName");
            return new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(string, l, l2, bl);
        }

        /*
         * WARNING - void declaration
         */
        public static /* synthetic */ llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2, String string, long l, long l2, boolean bl, int n, Object object) {
            boolean bl2 = bl; // PX-FIX: $default 未置位时沿用入参
            block10: {
                boolean bl3;
                block9: {
                    int var7_6 = 0; // PX-FIX
                    String[] stringArray = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
                    bl3 = ((var7_6 & 1) != 0);
                    if (stringArray == null) {
                        if (bl3) {
                            string = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                        }
                        bl3 = ((var7_6 & 2) != 0);
                    }
                    if (stringArray == null) {
                        if (bl3) {
                            l = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                        }
                        bl3 = ((var7_6 & 4) != 0);
                    }
                    if (stringArray == null) {
                        if (bl3) {
                            l2 = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                        }
                        bl3 = ((var7_6 & 8) != 0);
                    }
                    if (stringArray != null) break block9;
                    if (!bl3) break block10;
                    bl3 = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
                }
                bl2 = bl3;
            }
            return llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.a(string, l, l2, bl2);
        }

        @NotNull
        public String toString() {
            boolean bl = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            long l = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            long l2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            String string = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            return "RouteInfo(fileName=" + string + ", fileSize=" + l2 + ", lastModified=" + l + ", isValid=" + bl + ")";
        }

        public int hashCode() {
            int n = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
            n = n * 31 + Long.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
            n = n * 31 + Long.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
            n = n * 31 + Boolean.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
            return n;
        }

        public boolean equals(@Nullable Object object) {
            String[] stringArray = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
            Object object2 = this;
            if (stringArray == null) {
                if (object2 == object) {
                    return true;
                }
                object2 = object;
            }
            if (stringArray == null) {
                if (!(object2 instanceof llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)) {
                    return false;
                }
                object2 = object;
            }
            llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2 = (llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)object2;
            boolean bl = Intrinsics.areEqual((Object)this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, (Object)llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
            if (stringArray == null) {
                if (!bl) {
                    return false;
                }
                long l = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII - llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                bl = l == 0L;
            }
            if (stringArray == null) {
                if (bl) {
                    return false;
                }
                long l = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl - llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                bl = l == 0L;
            }
            if (stringArray == null) {
                if (bl) {
                    return false;
                }
                bl = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            }
            if (stringArray == null) {
                if (bl != llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
                    return false;
                }
                bl = true;
            }
            return bl;
        }

        /*
         * Unable to fully structure code
         */
        private static String a(int n, int n2) {
            int n3 = (n ^ 0xFFFFD7F3) & 0xFFFF;
            if (b[n3] == null) {
                int n4;
                char[] cArray = a[n3].toCharArray();
                int n5 = switch (cArray[0] & 0xFF) {
                    case 0 -> 97;
                    case 1 -> 22;
                    case 2 -> 222;
                    case 3 -> 61;
                    case 4 -> 206;
                    case 5 -> 78;
                    case 6 -> 71;
                    case 7 -> 146;
                    case 8 -> 170;
                    case 9 -> 109;
                    case 10 -> 37;
                    case 11 -> 62;
                    case 12 -> 226;
                    case 13 -> 250;
                    case 14 -> 203;
                    case 15 -> 122;
                    case 16 -> 25;
                    case 17 -> 1;
                    case 18 -> 244;
                    case 19 -> 83;
                    case 20 -> 93;
                    case 21 -> 239;
                    case 22 -> 28;
                    case 23 -> 76;
                    case 24 -> 5;
                    case 25 -> 24;
                    case 26 -> 229;
                    case 27 -> 2;
                    case 28 -> 106;
                    case 29 -> 41;
                    case 30 -> 68;
                    case 31 -> 197;
                    case 32 -> 59;
                    case 33 -> 118;
                    case 34 -> 130;
                    case 35 -> 234;
                    case 36 -> 175;
                    case 37 -> 189;
                    case 38 -> 209;
                    case 39 -> 87;
                    case 40 -> 205;
                    case 41 -> 33;
                    case 42 -> 195;
                    case 43 -> 10;
                    case 44 -> 17;
                    case 45 -> 47;
                    case 46 -> 164;
                    case 47 -> 225;
                    case 48 -> 101;
                    case 49 -> 132;
                    case 50 -> 66;
                    case 51 -> 156;
                    case 52 -> 11;
                    case 53 -> 135;
                    case 54 -> 213;
                    case 55 -> 98;
                    case 56 -> 224;
                    case 57 -> 29;
                    case 58 -> 131;
                    case 59 -> 95;
                    case 60 -> 7;
                    case 61 -> 196;
                    case 62 -> 232;
                    case 63 -> 173;
                    case 64 -> 230;
                    case 65 -> 31;
                    case 66 -> 108;
                    case 67 -> 60;
                    case 68 -> 13;
                    case 69 -> 34;
                    case 70 -> 9;
                    case 71 -> 176;
                    case 72 -> 182;
                    case 73 -> 124;
                    case 74 -> 188;
                    case 75 -> 82;
                    case 76 -> 251;
                    case 77 -> 148;
                    case 78 -> 210;
                    case 79 -> 113;
                    case 80 -> 92;
                    case 81 -> 161;
                    case 82 -> 19;
                    case 83 -> 194;
                    case 84 -> 163;
                    case 85 -> 56;
                    case 86 -> 80;
                    case 87 -> 227;
                    case 88 -> 245;
                    case 89 -> 134;
                    case 90 -> 246;
                    case 91 -> 74;
                    case 92 -> 115;
                    case 93 -> 187;
                    case 94 -> 127;
                    case 95 -> 102;
                    case 96 -> 157;
                    case 97 -> 84;
                    case 98 -> 185;
                    case 99 -> 107;
                    case 100 -> 233;
                    case 101 -> 111;
                    case 102 -> 184;
                    case 103 -> 4;
                    case 104 -> 171;
                    case 105 -> 3;
                    case 106 -> 254;
                    case 107 -> 85;
                    case 108 -> 86;
                    case 109 -> 30;
                    case 110 -> 158;
                    case 111 -> 116;
                    case 112 -> 228;
                    case 113 -> 142;
                    case 114 -> 220;
                    case 115 -> 18;
                    case 116 -> 14;
                    case 117 -> 238;
                    case 118 -> 36;
                    case 119 -> 32;
                    case 120 -> 214;
                    case 121 -> 64;
                    case 122 -> 65;
                    case 123 -> 75;
                    case 124 -> 139;
                    case 125 -> 125;
                    case 126 -> 39;
                    case 127 -> 192;
                    case 128 -> 104;
                    case 129 -> 58;
                    case 130 -> 162;
                    case 131 -> 191;
                    case 132 -> 57;
                    case 133 -> 167;
                    case 134 -> 94;
                    case 135 -> 23;
                    case 136 -> 42;
                    case 137 -> 88;
                    case 138 -> 180;
                    case 139 -> 45;
                    case 140 -> 153;
                    case 141 -> 179;
                    case 142 -> 12;
                    case 143 -> 247;
                    case 144 -> 183;
                    case 145 -> 43;
                    case 146 -> 44;
                    case 147 -> 147;
                    case 148 -> 235;
                    case 149 -> 186;
                    case 150 -> 177;
                    case 151 -> 26;
                    case 152 -> 119;
                    case 153 -> 207;
                    case 154 -> 178;
                    case 155 -> 223;
                    case 156 -> 237;
                    case 157 -> 216;
                    case 158 -> 40;
                    case 159 -> 165;
                    case 160 -> 240;
                    case 161 -> 123;
                    case 162 -> 133;
                    case 163 -> 211;
                    case 164 -> 91;
                    case 165 -> 255;
                    case 166 -> 52;
                    case 167 -> 154;
                    case 168 -> 208;
                    case 169 -> 129;
                    case 170 -> 20;
                    case 171 -> 105;
                    case 172 -> 79;
                    case 173 -> 151;
                    case 174 -> 103;
                    case 175 -> 152;
                    case 176 -> 198;
                    case 177 -> 27;
                    case 178 -> 21;
                    case 179 -> 16;
                    case 180 -> 0;
                    case 181 -> 35;
                    case 182 -> 231;
                    case 183 -> 150;
                    case 184 -> 241;
                    case 185 -> 166;
                    case 186 -> 137;
                    case 187 -> 159;
                    case 188 -> 248;
                    case 189 -> 217;
                    case 190 -> 128;
                    case 191 -> 181;
                    case 192 -> 89;
                    case 193 -> 160;
                    case 194 -> 242;
                    case 195 -> 90;
                    case 196 -> 249;
                    case 197 -> 15;
                    case 198 -> 143;
                    case 199 -> 174;
                    case 200 -> 199;
                    case 201 -> 51;
                    case 202 -> 200;
                    case 203 -> 8;
                    case 204 -> 53;
                    case 205 -> 219;
                    case 206 -> 67;
                    case 207 -> 136;
                    case 208 -> 190;
                    case 209 -> 212;
                    case 210 -> 99;
                    case 211 -> 46;
                    case 212 -> 49;
                    case 213 -> 144;
                    case 214 -> 70;
                    case 215 -> 193;
                    case 216 -> 243;
                    case 217 -> 112;
                    case 218 -> 221;
                    case 219 -> 172;
                    case 220 -> 204;
                    case 221 -> 81;
                    case 222 -> 6;
                    case 223 -> 114;
                    case 224 -> 253;
                    case 225 -> 120;
                    case 226 -> 145;
                    case 227 -> 100;
                    case 228 -> 55;
                    case 229 -> 140;
                    case 230 -> 110;
                    case 231 -> 169;
                    case 232 -> 202;
                    case 233 -> 69;
                    case 234 -> 168;
                    case 235 -> 126;
                    case 236 -> 141;
                    case 237 -> 236;
                    case 238 -> 38;
                    case 239 -> 96;
                    case 240 -> 138;
                    case 241 -> 72;
                    case 242 -> 63;
                    case 243 -> 48;
                    case 244 -> 215;
                    case 245 -> 201;
                    case 246 -> 50;
                    case 247 -> 252;
                    case 248 -> 155;
                    case 249 -> 73;
                    case 250 -> 121;
                    case 251 -> 54;
                    case 252 -> 218;
                    case 253 -> 77;
                    case 254 -> 117;
                    default -> 149;
                };
                int n6 = (n2 & 0xFF) - n5;
                if (n6 < 0) {
                    n6 += 256;
                }
                if ((n4 = ((n2 & 0xFFFF) >>> 8) - n5) < 0) {
                    n4 += 256;
                }
                int n7 = 0;
                while (n7 < cArray.length) {
                    int n8 = n7 % 2;
                    int n9 = n7;
                    char[] cArray2 = cArray;
                    char c = cArray[n9];
                    if (n8 == 0) {
                        cArray2[n9] = (char)(c ^ n6);
                        n6 = ((n6 >>> 3 | n6 << 5) ^ cArray[n7]) & 0xFF;
                    } else {
                        cArray2[n9] = (char)(c ^ n4);
                        n4 = ((n4 >>> 3 | n4 << 5) ^ cArray[n7]) & 0xFF;
                    }
                    ++n7;
                }
                llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b[n3] = new String(cArray).intern();
            }
            return b[n3];
        }
    }
    // Phase A NX4: jar-only nested class me.octo.client.IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
    // Member set taken from .analysis/me-octo-only.jar; body fidelity: faithful.
    // The jar's encoded string literals are not decodable, so the static String fields
    // hold placeholders and a(int,int) is a stub (matches the accepted fast-out precedent).
    static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Object> {

        int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        final me.octo.client.IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII this$0;
        final java.lang.String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
        private static java.lang.String a;

        IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(me.octo.client.IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII outer, java.lang.String payload, kotlin.coroutines.Continuation<? super IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> cont) {
            this.this$0 = outer;
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = payload;
            super(2, (kotlin.coroutines.Continuation<java.lang.Object>) (java.lang.Object) cont);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object result) {
            me.octo.client.IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
            java.lang.Object suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
                case 0:
                    kotlin.ResultKt.throwOnFailure(result);
                    this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 1;
                    if (this.this$0.a(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, (kotlin.coroutines.Continuation<? super java.lang.Boolean>) (java.lang.Object) this) == suspended) {
                        return suspended;
                    }
                    break;
                case 1:
                    kotlin.ResultKt.throwOnFailure(result);
                    break;
                default:
                    throw new java.lang.IllegalStateException(a);
            }
            return kotlin.Unit.INSTANCE;
        }

        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object scope, kotlin.coroutines.Continuation<?> cont) {
            return (kotlin.coroutines.Continuation<kotlin.Unit>) (java.lang.Object) new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(this.this$0, this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, (kotlin.coroutines.Continuation<? super IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI>) (java.lang.Object) cont);
        }

        public final java.lang.Object a(kotlinx.coroutines.CoroutineScope scope, kotlin.coroutines.Continuation<?> cont) {
            return ((IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI) (java.lang.Object) this.create(scope, cont)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        public java.lang.Object invoke(java.lang.Object scope, java.lang.Object cont) {
            return this.a((kotlinx.coroutines.CoroutineScope) scope, (kotlin.coroutines.Continuation<?>) cont);
        }

        private static java.lang.IllegalStateException a(java.lang.IllegalStateException e) {
            return e;
        }

        static {
        pxClinit: { // PX-FIX
            char[] var10003 = "9\u0012T\u001fRr\rzTJ\u0016\u0001s\u000f?T\u0018\u0011\u0017`\r(\u0016\u0018T\u001bh\u00145\u0018]TRq\u000b.\u001b\u0018\u0010\u001dt\r/\u0007Q\u001d\u0017".toCharArray();
            int var10004 = var10003.length;
            int var0 = 0;
            byte var6 = 74;
            char[] var10002 = var10003;
            int var1 = var10004;
            byte var10;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
                var10005 = var10003;
                var10 = 74;
                var10006 = var0;
            } else {
                var6 = 74;
                var1 = var10004;
                if (var10004 <= var0) {
                    String var9 = new String(var10003).intern();
                    byte var4 = -1;
                    a = var9;
                    break pxClinit; // PX-FIX
                }

                var10005 = var10003;
                var10 = 74;
                var10006 = var0;
            }

            while (true) {
                var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
                    case 0 -> 16;
                    case 1 -> 57;
                    case 2 -> 114;
                    case 3 -> 57;
                    case 4 -> 56;
                    case 5 -> 76;
                    default -> 40;
                });
                var0++;
                if (var6 == 0) {
                    var10006 = var6;
                    var10005 = var10002;
                    var10 = var6;
                } else {
                    if (var1 <= var0) {
                        String var8 = new String(var10002).intern();
                        byte var3 = -1;
                        a = var8;
                        break pxClinit; // PX-FIX
                    }

                    var10005 = var10002;
                    var10 = var6;
                    var10006 = var0;
                }
            }
        } // PX-FIX end pxClinit
        }
    }

    // Phase A NX4: jar-only nested class me.octo.client.IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll
    // Member set taken from .analysis/me-octo-only.jar; body fidelity: faithful.
    // The jar's encoded string literals are not decodable, so the static String fields
    // hold placeholders and a(int,int) is a stub (matches the accepted fast-out precedent).
    static final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Object> {

        int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        final me.octo.client.IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII this$0;
        final java.lang.String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
        private static java.lang.String a;

        IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(me.octo.client.IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII outer, java.lang.String payload, kotlin.coroutines.Continuation<? super IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll> cont) {
            this.this$0 = outer;
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = payload;
            super(2, (kotlin.coroutines.Continuation<java.lang.Object>) (java.lang.Object) cont);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object result) {
            me.octo.client.IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
            java.lang.Object suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
                case 0:
                    kotlin.ResultKt.throwOnFailure(result);
                    this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 1;
                    if (this.this$0.b(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, (kotlin.coroutines.Continuation<? super java.lang.Boolean>) (java.lang.Object) this) == suspended) {
                        return suspended;
                    }
                    break;
                case 1:
                    kotlin.ResultKt.throwOnFailure(result);
                    break;
                default:
                    throw new java.lang.IllegalStateException(a);
            }
            return kotlin.Unit.INSTANCE;
        }

        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object scope, kotlin.coroutines.Continuation<?> cont) {
            return (kotlin.coroutines.Continuation<kotlin.Unit>) (java.lang.Object) new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(this.this$0, this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, (kotlin.coroutines.Continuation<? super IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll>) (java.lang.Object) cont);
        }

        public final java.lang.Object a(kotlinx.coroutines.CoroutineScope scope, kotlin.coroutines.Continuation<?> cont) {
            return ((IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll) (java.lang.Object) this.create(scope, cont)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        public java.lang.Object invoke(java.lang.Object scope, java.lang.Object cont) {
            return this.a((kotlinx.coroutines.CoroutineScope) scope, (kotlin.coroutines.Continuation<?>) cont);
        }

        private static java.lang.IllegalStateException a(java.lang.IllegalStateException e) {
            return e;
        }

        static {
            java.lang.String var0 = "Be\003\031K{D\001#\035\020\030zFD#O\027\016iDSaOR\002a]No\012RKxBUlO\026\004}DTp\006\033\016";
            char[] var1 = var0.toCharArray();
            for (int var2 = 0; var2 < var1.length; var2++) {
                int var3;
                switch (var2 % 7) {
                    case 0: var3 = 111; break;
                    case 1: var3 = 74; break;
                    case 2: var3 = 33; break;
                    case 3: var3 = 59; break;
                    case 4: var3 = 37; break;
                    case 5: var3 = 65; break;
                    default: var3 = 101; break;
                }
                var1[var2] = (char)(var1[var2] ^ var3 ^ 78);
            }
            a = new java.lang.String(var1).intern();
        }
    }

    // Phase A NX4: jar-only nested class me.octo.client.IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
    // Member set taken from .analysis/me-octo-only.jar; body fidelity: high-level port (obfuscator-mangled jar bytecode).
    // The jar's encoded string literals are not decodable, so the static String fields
    // hold placeholders and a(int,int) is a stub (matches the accepted fast-out precedent).
    static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Object> {

        int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        final java.lang.String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
        final me.octo.client.IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII this$0;
        private static java.lang.String[] a;
        private static java.lang.String[] b;

        IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(java.lang.String payload, me.octo.client.IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII outer, kotlin.coroutines.Continuation<? super IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> cont) {
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = payload;
            this.this$0 = outer;
            super(2, (kotlin.coroutines.Continuation<java.lang.Object>) (java.lang.Object) cont);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object result) {
            me.octo.client.IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
            java.lang.Object suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
                case 0:
                    kotlin.ResultKt.throwOnFailure(result);
                    if (!kotlin.text.StringsKt.isBlank((java.lang.CharSequence) this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII)
                            && new kotlin.text.Regex("[/\\\\]").containsMatchIn((java.lang.CharSequence) this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII)) {
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                    }
                    java.nio.file.Path path = me.octo.client.lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(me.octo.client.IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII.d(this.this$0), this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
                    if (!java.nio.file.Files.exists(path, new java.nio.file.LinkOption[0])) {
                        try {
                            java.nio.file.Files.write(path, "[]".getBytes(java.nio.charset.StandardCharsets.UTF_8));
                        } catch (java.io.IOException e) {
                            throw new java.lang.IllegalStateException(e);
                        }
                        this.this$0.F();
                    }
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object scope, kotlin.coroutines.Continuation<?> cont) {
            return (kotlin.coroutines.Continuation<kotlin.Unit>) (java.lang.Object) new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, this.this$0, (kotlin.coroutines.Continuation<? super IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll>) (java.lang.Object) cont);
        }

        public final java.lang.Object a(kotlinx.coroutines.CoroutineScope scope, kotlin.coroutines.Continuation<?> cont) {
            return ((IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll) (java.lang.Object) this.create(scope, cont)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        public java.lang.Object invoke(java.lang.Object scope, java.lang.Object cont) {
            return this.a((kotlinx.coroutines.CoroutineScope) scope, (kotlin.coroutines.Continuation<?>) cont);
        }

        private static java.lang.IllegalStateException a(java.lang.IllegalStateException e) {
            return e;
        }

        private static java.lang.String a(int i, int j) {
            int var2 = (i ^ -19830) & 65535;
            if (b[var2] == null) {
                char[] var3 = a[var2].toCharArray();
                int var4;
                switch (var3[0] & 255) {
                    case 0: var4 = 198; break;
                    case 1: var4 = 123; break;
                    case 2: var4 = 148; break;
                    case 3: var4 = 185; break;
                    case 4: var4 = 237; break;
                    case 5: var4 = 139; break;
                    case 6: var4 = 184; break;
                    case 7: var4 = 182; break;
                    case 8: var4 = 99; break;
                    case 9: var4 = 143; break;
                    case 10: var4 = 150; break;
                    case 11: var4 = 27; break;
                    case 12: var4 = 214; break;
                    case 13: var4 = 254; break;
                    case 14: var4 = 8; break;
                    case 15: var4 = 7; break;
                    case 16: var4 = 36; break;
                    case 17: var4 = 241; break;
                    case 18: var4 = 196; break;
                    case 19: var4 = 203; break;
                    case 20: var4 = 248; break;
                    case 21: var4 = 43; break;
                    case 22: var4 = 137; break;
                    case 23: var4 = 209; break;
                    case 24: var4 = 232; break;
                    case 25: var4 = 117; break;
                    case 26: var4 = 249; break;
                    case 27: var4 = 115; break;
                    case 28: var4 = 164; break;
                    case 29: var4 = 65; break;
                    case 30: var4 = 67; break;
                    case 31: var4 = 152; break;
                    case 32: var4 = 156; break;
                    case 33: var4 = 109; break;
                    case 34: var4 = 138; break;
                    case 35: var4 = 94; break;
                    case 36: var4 = 141; break;
                    case 37: var4 = 201; break;
                    case 38: var4 = 95; break;
                    case 39: var4 = 14; break;
                    case 40: var4 = 231; break;
                    case 41: var4 = 171; break;
                    case 42: var4 = 219; break;
                    case 43: var4 = 192; break;
                    case 44: var4 = 114; break;
                    case 45: var4 = 113; break;
                    case 46: var4 = 197; break;
                    case 47: var4 = 151; break;
                    case 48: var4 = 9; break;
                    case 49: var4 = 134; break;
                    case 50: var4 = 31; break;
                    case 51: var4 = 48; break;
                    case 52: var4 = 28; break;
                    case 53: var4 = 205; break;
                    case 54: var4 = 10; break;
                    case 55: var4 = 193; break;
                    case 56: var4 = 118; break;
                    case 57: var4 = 85; break;
                    case 58: var4 = 158; break;
                    case 59: var4 = 107; break;
                    case 60: var4 = 100; break;
                    case 61: var4 = 142; break;
                    case 62: var4 = 147; break;
                    case 63: var4 = 59; break;
                    case 64: var4 = 235; break;
                    case 65: var4 = 51; break;
                    case 66: var4 = 135; break;
                    case 67: var4 = 22; break;
                    case 68: var4 = 162; break;
                    case 69: var4 = 30; break;
                    case 70: var4 = 166; break;
                    case 71: var4 = 108; break;
                    case 72: var4 = 208; break;
                    case 73: var4 = 155; break;
                    case 74: var4 = 163; break;
                    case 75: var4 = 176; break;
                    case 76: var4 = 97; break;
                    case 77: var4 = 128; break;
                    case 78: var4 = 247; break;
                    case 79: var4 = 98; break;
                    case 80: var4 = 157; break;
                    case 81: var4 = 145; break;
                    case 82: var4 = 3; break;
                    case 83: var4 = 39; break;
                    case 84: var4 = 222; break;
                    case 85: var4 = 86; break;
                    case 86: var4 = 191; break;
                    case 87: var4 = 221; break;
                    case 88: var4 = 223; break;
                    case 89: var4 = 104; break;
                    case 90: var4 = 17; break;
                    case 91: var4 = 57; break;
                    case 92: var4 = 26; break;
                    case 93: var4 = 0; break;
                    case 94: var4 = 110; break;
                    case 95: var4 = 55; break;
                    case 96: var4 = 189; break;
                    case 97: var4 = 233; break;
                    case 98: var4 = 40; break;
                    case 99: var4 = 217; break;
                    case 100: var4 = 62; break;
                    case 101: var4 = 47; break;
                    case 102: var4 = 132; break;
                    case 103: var4 = 92; break;
                    case 104: var4 = 11; break;
                    case 105: var4 = 170; break;
                    case 106: var4 = 245; break;
                    case 107: var4 = 91; break;
                    case 108: var4 = 183; break;
                    case 109: var4 = 187; break;
                    case 110: var4 = 20; break;
                    case 111: var4 = 177; break;
                    case 112: var4 = 49; break;
                    case 113: var4 = 174; break;
                    case 114: var4 = 16; break;
                    case 115: var4 = 76; break;
                    case 116: var4 = 243; break;
                    case 117: var4 = 144; break;
                    case 118: var4 = 190; break;
                    case 119: var4 = 126; break;
                    case 120: var4 = 120; break;
                    case 121: var4 = 93; break;
                    case 122: var4 = 159; break;
                    case 123: var4 = 168; break;
                    case 124: var4 = 96; break;
                    case 125: var4 = 240; break;
                    case 126: var4 = 252; break;
                    case 127: var4 = 75; break;
                    case 128: var4 = 161; break;
                    case 129: var4 = 181; break;
                    case 130: var4 = 133; break;
                    case 131: var4 = 25; break;
                    case 132: var4 = 56; break;
                    case 133: var4 = 210; break;
                    case 134: var4 = 83; break;
                    case 135: var4 = 229; break;
                    case 136: var4 = 42; break;
                    case 137: var4 = 77; break;
                    case 138: var4 = 61; break;
                    case 139: var4 = 122; break;
                    case 140: var4 = 88; break;
                    case 141: var4 = 146; break;
                    case 142: var4 = 81; break;
                    case 143: var4 = 2; break;
                    case 144: var4 = 46; break;
                    case 145: var4 = 66; break;
                    case 146: var4 = 73; break;
                    case 147: var4 = 5; break;
                    case 148: var4 = 112; break;
                    case 149: var4 = 225; break;
                    case 150: var4 = 228; break;
                    case 151: var4 = 89; break;
                    case 152: var4 = 1; break;
                    case 153: var4 = 125; break;
                    case 154: var4 = 136; break;
                    case 155: var4 = 71; break;
                    case 156: var4 = 68; break;
                    case 157: var4 = 6; break;
                    case 158: var4 = 188; break;
                    case 159: var4 = 224; break;
                    case 160: var4 = 64; break;
                    case 161: var4 = 12; break;
                    case 162: var4 = 226; break;
                    case 163: var4 = 212; break;
                    case 164: var4 = 251; break;
                    case 165: var4 = 58; break;
                    case 166: var4 = 116; break;
                    case 167: var4 = 204; break;
                    case 168: var4 = 172; break;
                    case 169: var4 = 23; break;
                    case 170: var4 = 33; break;
                    case 171: var4 = 111; break;
                    case 172: var4 = 179; break;
                    case 173: var4 = 127; break;
                    case 174: var4 = 250; break;
                    case 175: var4 = 45; break;
                    case 176: var4 = 79; break;
                    case 177: var4 = 200; break;
                    case 178: var4 = 53; break;
                    case 179: var4 = 153; break;
                    case 180: var4 = 167; break;
                    case 181: var4 = 215; break;
                    case 182: var4 = 255; break;
                    case 183: var4 = 140; break;
                    case 184: var4 = 29; break;
                    case 185: var4 = 130; break;
                    case 186: var4 = 121; break;
                    case 187: var4 = 178; break;
                    case 188: var4 = 194; break;
                    case 189: var4 = 199; break;
                    case 190: var4 = 102; break;
                    case 191: var4 = 253; break;
                    case 192: var4 = 186; break;
                    case 193: var4 = 101; break;
                    case 194: var4 = 218; break;
                    case 195: var4 = 216; break;
                    case 196: var4 = 72; break;
                    case 197: var4 = 82; break;
                    case 198: var4 = 202; break;
                    case 199: var4 = 119; break;
                    case 200: var4 = 32; break;
                    case 201: var4 = 15; break;
                    case 202: var4 = 207; break;
                    case 203: var4 = 234; break;
                    case 204: var4 = 180; break;
                    case 205: var4 = 131; break;
                    case 206: var4 = 24; break;
                    case 207: var4 = 129; break;
                    case 208: var4 = 195; break;
                    case 209: var4 = 242; break;
                    case 210: var4 = 106; break;
                    case 211: var4 = 41; break;
                    case 212: var4 = 35; break;
                    case 213: var4 = 38; break;
                    case 214: var4 = 149; break;
                    case 215: var4 = 84; break;
                    case 216: var4 = 238; break;
                    case 217: var4 = 211; break;
                    case 218: var4 = 18; break;
                    case 219: var4 = 60; break;
                    case 220: var4 = 154; break;
                    case 221: var4 = 87; break;
                    case 222: var4 = 34; break;
                    case 223: var4 = 165; break;
                    case 224: var4 = 70; break;
                    case 225: var4 = 69; break;
                    case 226: var4 = 105; break;
                    case 227: var4 = 52; break;
                    case 228: var4 = 227; break;
                    case 229: var4 = 50; break;
                    case 230: var4 = 173; break;
                    case 231: var4 = 21; break;
                    case 232: var4 = 230; break;
                    case 233: var4 = 44; break;
                    case 234: var4 = 37; break;
                    case 235: var4 = 206; break;
                    case 236: var4 = 90; break;
                    case 237: var4 = 54; break;
                    case 238: var4 = 239; break;
                    case 239: var4 = 213; break;
                    case 240: var4 = 4; break;
                    case 241: var4 = 78; break;
                    case 242: var4 = 124; break;
                    case 243: var4 = 80; break;
                    case 244: var4 = 169; break;
                    case 245: var4 = 175; break;
                    case 246: var4 = 19; break;
                    case 247: var4 = 74; break;
                    case 248: var4 = 220; break;
                    case 249: var4 = 244; break;
                    case 250: var4 = 160; break;
                    case 251: var4 = 246; break;
                    case 252: var4 = 103; break;
                    case 253: var4 = 13; break;
                    case 254: var4 = 63; break;
                    default: var4 = 236; break;
                }
                int var5 = (j & 255) - var4;
                if (var5 < 0) {
                    var5 += 256;
                }
                int var6 = ((j & 65535) >>> 8) - var4;
                if (var6 < 0) {
                    var6 += 256;
                }
                for (int var7 = 0; var7 < var3.length; var7++) {
                    if (var7 % 2 == 0) {
                        var3[var7] = (char)(var3[var7] ^ var5);
                        var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 255;
                    } else {
                        var3[var7] = (char)(var3[var7] ^ var6);
                        var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 255;
                    }
                }
                b[var2] = new java.lang.String(var3).intern();
            }
            return b[var2];
        }

        static {
            a = new java.lang.String[0];
            b = new java.lang.String[0];
        }
    }

    // Restored from the original nested class body (r812 bytecode): the route list is
    // scanned on Dispatchers.IO and returned synchronously by this non-suspending lambda.
    static final class IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Object> {

        int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        private java.lang.Object lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
        final me.octo.client.IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII this$0;
        private static java.lang.String[] a;
        private static java.lang.String[] b;

        IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(me.octo.client.IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII outer, kotlin.coroutines.Continuation<? super IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI> cont) {
            this.this$0 = outer;
            super(2, (kotlin.coroutines.Continuation<java.lang.Object>) (java.lang.Object) cont);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object result) {
            me.octo.client.IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
            kotlin.ResultKt.throwOnFailure(result);
            java.util.LinkedHashMap<java.lang.String, llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> routes =
                new java.util.LinkedHashMap<java.lang.String, llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll>();
            try {
                try (java.nio.file.DirectoryStream<java.nio.file.Path> stream =
                         java.nio.file.Files.newDirectoryStream(IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII.b(this.this$0), "*.json")) {
                    for (java.nio.file.Path path : stream) {
                        java.lang.String name = kotlin.text.StringsKt.removeSuffix(
                            kotlin.io.path.PathsKt.getName(path), ".json"
                        );
                        if (kotlin.collections.ArraysKt.contains(IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII.c(this.this$0), name)) {
                            continue;
                        }
                        if (java.nio.file.Files.size(path) == 0L) {
                            continue;
                        }

                        boolean valid = false;
                        try {
                            java.lang.String text = kotlin.text.StringsKt.trim(
                                (java.lang.CharSequence) kotlin.io.FilesKt.readText(path.toFile(), kotlin.text.Charsets.UTF_8)
                            ).toString();
                            if (text.startsWith("[")) {
                                valid = text.endsWith("]");
                            } else if (text.startsWith("{")) {
                                try {
                                    valid = com.google.gson.JsonParser.parseString(text).getAsJsonObject().size() > 0;
                                } catch (Throwable ignored) {
                                    valid = false;
                                }
                            }
                        } catch (Throwable ignored) {
                            valid = false;
                        }

                        routes.put(
                            name,
                            new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                                name,
                                java.nio.file.Files.size(path),
                                java.nio.file.Files.getLastModifiedTime(path, new java.nio.file.LinkOption[0]).toMillis(),
                                valid
                            )
                        );
                    }
                }
            } catch (java.io.IOException e) {
                throw a(e);
            }
            return routes;
        }

        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object scope, kotlin.coroutines.Continuation<?> cont) {
            return (kotlin.coroutines.Continuation<kotlin.Unit>) (java.lang.Object) new IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(this.this$0, (kotlin.coroutines.Continuation<? super IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI>) (java.lang.Object) cont);
        }

        public final java.lang.Object a(kotlinx.coroutines.CoroutineScope scope, kotlin.coroutines.Continuation<?> cont) {
            return ((IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI) (java.lang.Object) this.create(scope, cont)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        public java.lang.Object invoke(java.lang.Object scope, java.lang.Object cont) {
            return this.a((kotlinx.coroutines.CoroutineScope) scope, (kotlin.coroutines.Continuation<?>) cont);
        }

        private static <T extends java.lang.Throwable> T a(java.lang.Throwable e) throws T {
            @SuppressWarnings("unchecked")
            T typed = (T) e;
            throw typed;
        }

        private static java.lang.String a(int i, int j) {
            int var2 = (i ^ 31184) & 65535;
            if (b[var2] == null) {
                char[] var3 = a[var2].toCharArray();
                int var4;
                switch (var3[0] & 255) {
                    case 0: var4 = 168; break;
                    case 1: var4 = 13; break;
                    case 2: var4 = 133; break;
                    case 3: var4 = 227; break;
                    case 4: var4 = 70; break;
                    case 5: var4 = 57; break;
                    case 6: var4 = 59; break;
                    case 7: var4 = 66; break;
                    case 8: var4 = 121; break;
                    case 9: var4 = 85; break;
                    case 10: var4 = 68; break;
                    case 11: var4 = 28; break;
                    case 12: var4 = 102; break;
                    case 13: var4 = 134; break;
                    case 14: var4 = 38; break;
                    case 15: var4 = 54; break;
                    case 16: var4 = 35; break;
                    case 17: var4 = 184; break;
                    case 18: var4 = 146; break;
                    case 19: var4 = 194; break;
                    case 20: var4 = 213; break;
                    case 21: var4 = 26; break;
                    case 22: var4 = 234; break;
                    case 23: var4 = 186; break;
                    case 24: var4 = 124; break;
                    case 25: var4 = 78; break;
                    case 26: var4 = 198; break;
                    case 27: var4 = 191; break;
                    case 28: var4 = 142; break;
                    case 29: var4 = 147; break;
                    case 30: var4 = 24; break;
                    case 31: var4 = 160; break;
                    case 32: var4 = 30; break;
                    case 33: var4 = 131; break;
                    case 34: var4 = 101; break;
                    case 35: var4 = 32; break;
                    case 36: var4 = 3; break;
                    case 37: var4 = 40; break;
                    case 38: var4 = 67; break;
                    case 39: var4 = 226; break;
                    case 40: var4 = 254; break;
                    case 41: var4 = 16; break;
                    case 42: var4 = 187; break;
                    case 43: var4 = 252; break;
                    case 44: var4 = 46; break;
                    case 45: var4 = 50; break;
                    case 46: var4 = 47; break;
                    case 47: var4 = 80; break;
                    case 48: var4 = 221; break;
                    case 49: var4 = 0; break;
                    case 50: var4 = 209; break;
                    case 51: var4 = 253; break;
                    case 52: var4 = 27; break;
                    case 53: var4 = 212; break;
                    case 54: var4 = 249; break;
                    case 55: var4 = 34; break;
                    case 56: var4 = 60; break;
                    case 57: var4 = 94; break;
                    case 58: var4 = 199; break;
                    case 59: var4 = 232; break;
                    case 60: var4 = 219; break;
                    case 61: var4 = 100; break;
                    case 62: var4 = 220; break;
                    case 63: var4 = 82; break;
                    case 64: var4 = 204; break;
                    case 65: var4 = 71; break;
                    case 66: var4 = 237; break;
                    case 67: var4 = 114; break;
                    case 68: var4 = 72; break;
                    case 69: var4 = 195; break;
                    case 70: var4 = 150; break;
                    case 71: var4 = 119; break;
                    case 72: var4 = 110; break;
                    case 73: var4 = 39; break;
                    case 74: var4 = 36; break;
                    case 75: var4 = 137; break;
                    case 76: var4 = 235; break;
                    case 77: var4 = 250; break;
                    case 78: var4 = 126; break;
                    case 79: var4 = 48; break;
                    case 80: var4 = 230; break;
                    case 81: var4 = 14; break;
                    case 82: var4 = 87; break;
                    case 83: var4 = 190; break;
                    case 84: var4 = 217; break;
                    case 85: var4 = 53; break;
                    case 86: var4 = 122; break;
                    case 87: var4 = 218; break;
                    case 88: var4 = 17; break;
                    case 89: var4 = 255; break;
                    case 90: var4 = 129; break;
                    case 91: var4 = 197; break;
                    case 92: var4 = 120; break;
                    case 93: var4 = 93; break;
                    case 94: var4 = 251; break;
                    case 95: var4 = 79; break;
                    case 96: var4 = 239; break;
                    case 97: var4 = 113; break;
                    case 98: var4 = 112; break;
                    case 99: var4 = 247; break;
                    case 100: var4 = 166; break;
                    case 101: var4 = 63; break;
                    case 102: var4 = 180; break;
                    case 103: var4 = 108; break;
                    case 104: var4 = 1; break;
                    case 105: var4 = 41; break;
                    case 106: var4 = 49; break;
                    case 107: var4 = 143; break;
                    case 108: var4 = 51; break;
                    case 109: var4 = 115; break;
                    case 110: var4 = 103; break;
                    case 111: var4 = 21; break;
                    case 112: var4 = 15; break;
                    case 113: var4 = 7; break;
                    case 114: var4 = 158; break;
                    case 115: var4 = 244; break;
                    case 116: var4 = 45; break;
                    case 117: var4 = 73; break;
                    case 118: var4 = 174; break;
                    case 119: var4 = 233; break;
                    case 120: var4 = 89; break;
                    case 121: var4 = 240; break;
                    case 122: var4 = 210; break;
                    case 123: var4 = 127; break;
                    case 124: var4 = 2; break;
                    case 125: var4 = 243; break;
                    case 126: var4 = 18; break;
                    case 127: var4 = 44; break;
                    case 128: var4 = 248; break;
                    case 129: var4 = 175; break;
                    case 130: var4 = 162; break;
                    case 131: var4 = 75; break;
                    case 132: var4 = 241; break;
                    case 133: var4 = 222; break;
                    case 134: var4 = 19; break;
                    case 135: var4 = 12; break;
                    case 136: var4 = 11; break;
                    case 137: var4 = 52; break;
                    case 138: var4 = 152; break;
                    case 139: var4 = 65; break;
                    case 140: var4 = 203; break;
                    case 141: var4 = 223; break;
                    case 142: var4 = 83; break;
                    case 143: var4 = 116; break;
                    case 144: var4 = 154; break;
                    case 145: var4 = 104; break;
                    case 146: var4 = 153; break;
                    case 147: var4 = 118; break;
                    case 148: var4 = 161; break;
                    case 149: var4 = 128; break;
                    case 150: var4 = 98; break;
                    case 151: var4 = 176; break;
                    case 152: var4 = 64; break;
                    case 153: var4 = 155; break;
                    case 154: var4 = 196; break;
                    case 155: var4 = 105; break;
                    case 156: var4 = 5; break;
                    case 157: var4 = 181; break;
                    case 158: var4 = 188; break;
                    case 159: var4 = 91; break;
                    case 160: var4 = 140; break;
                    case 161: var4 = 6; break;
                    case 162: var4 = 106; break;
                    case 163: var4 = 76; break;
                    case 164: var4 = 43; break;
                    case 165: var4 = 117; break;
                    case 166: var4 = 58; break;
                    case 167: var4 = 81; break;
                    case 168: var4 = 55; break;
                    case 169: var4 = 178; break;
                    case 170: var4 = 145; break;
                    case 171: var4 = 206; break;
                    case 172: var4 = 202; break;
                    case 173: var4 = 136; break;
                    case 174: var4 = 99; break;
                    case 175: var4 = 31; break;
                    case 176: var4 = 132; break;
                    case 177: var4 = 193; break;
                    case 178: var4 = 159; break;
                    case 179: var4 = 84; break;
                    case 180: var4 = 10; break;
                    case 181: var4 = 200; break;
                    case 182: var4 = 185; break;
                    case 183: var4 = 61; break;
                    case 184: var4 = 215; break;
                    case 185: var4 = 90; break;
                    case 186: var4 = 9; break;
                    case 187: var4 = 92; break;
                    case 188: var4 = 201; break;
                    case 189: var4 = 214; break;
                    case 190: var4 = 139; break;
                    case 191: var4 = 62; break;
                    case 192: var4 = 86; break;
                    case 193: var4 = 123; break;
                    case 194: var4 = 88; break;
                    case 195: var4 = 97; break;
                    case 196: var4 = 207; break;
                    case 197: var4 = 189; break;
                    case 198: var4 = 171; break;
                    case 199: var4 = 77; break;
                    case 200: var4 = 172; break;
                    case 201: var4 = 224; break;
                    case 202: var4 = 69; break;
                    case 203: var4 = 183; break;
                    case 204: var4 = 170; break;
                    case 205: var4 = 242; break;
                    case 206: var4 = 211; break;
                    case 207: var4 = 165; break;
                    case 208: var4 = 135; break;
                    case 209: var4 = 23; break;
                    case 210: var4 = 182; break;
                    case 211: var4 = 245; break;
                    case 212: var4 = 42; break;
                    case 213: var4 = 225; break;
                    case 214: var4 = 29; break;
                    case 215: var4 = 138; break;
                    case 216: var4 = 33; break;
                    case 217: var4 = 95; break;
                    case 218: var4 = 216; break;
                    case 219: var4 = 229; break;
                    case 220: var4 = 157; break;
                    case 221: var4 = 125; break;
                    case 222: var4 = 148; break;
                    case 223: var4 = 56; break;
                    case 224: var4 = 96; break;
                    case 225: var4 = 25; break;
                    case 226: var4 = 238; break;
                    case 227: var4 = 151; break;
                    case 228: var4 = 20; break;
                    case 229: var4 = 74; break;
                    case 230: var4 = 163; break;
                    case 231: var4 = 149; break;
                    case 232: var4 = 130; break;
                    case 233: var4 = 173; break;
                    case 234: var4 = 141; break;
                    case 235: var4 = 208; break;
                    case 236: var4 = 156; break;
                    case 237: var4 = 37; break;
                    case 238: var4 = 107; break;
                    case 239: var4 = 228; break;
                    case 240: var4 = 22; break;
                    case 241: var4 = 109; break;
                    case 242: var4 = 169; break;
                    case 243: var4 = 177; break;
                    case 244: var4 = 8; break;
                    case 245: var4 = 164; break;
                    case 246: var4 = 236; break;
                    case 247: var4 = 111; break;
                    case 248: var4 = 231; break;
                    case 249: var4 = 205; break;
                    case 250: var4 = 246; break;
                    case 251: var4 = 144; break;
                    case 252: var4 = 179; break;
                    case 253: var4 = 4; break;
                    case 254: var4 = 167; break;
                    default: var4 = 192; break;
                }
                int var5 = (j & 255) - var4;
                if (var5 < 0) {
                    var5 += 256;
                }
                int var6 = ((j & 65535) >>> 8) - var4;
                if (var6 < 0) {
                    var6 += 256;
                }
                for (int var7 = 0; var7 < var3.length; var7++) {
                    if (var7 % 2 == 0) {
                        var3[var7] = (char)(var3[var7] ^ var5);
                        var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 255;
                    } else {
                        var3[var7] = (char)(var3[var7] ^ var6);
                        var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 255;
                    }
                }
                b[var2] = new java.lang.String(var3).intern();
            }
            return b[var2];
        }

        static {
            a = new java.lang.String[0];
            b = new java.lang.String[0];
        }
    }

}

