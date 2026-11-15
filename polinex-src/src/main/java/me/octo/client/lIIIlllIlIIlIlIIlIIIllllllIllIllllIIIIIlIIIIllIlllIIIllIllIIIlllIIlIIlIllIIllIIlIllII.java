/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Pair
 *  kotlin.Result
 *  kotlin.ResultKt
 *  kotlin.TuplesKt
 *  kotlin.Unit
 *  kotlin.collections.ArraysKt
 *  kotlin.collections.CollectionsKt
 *  kotlin.collections.SetsKt
 *  kotlin.comparisons.ComparisonsKt
 *  kotlin.coroutines.Continuation
 *  kotlin.coroutines.CoroutineContext
 *  kotlin.coroutines.intrinsics.IntrinsicsKt
 *  kotlin.jvm.functions.Function0
 *  kotlin.jvm.functions.Function2
 *  kotlin.jvm.internal.Intrinsics
 *  kotlinx.coroutines.BuildersKt
 *  kotlinx.coroutines.CoroutineScope
 *  kotlinx.coroutines.CoroutineScopeKt
 *  kotlinx.coroutines.Dispatchers
 *  kotlinx.coroutines.Job
 *  kotlinx.coroutines.Job$DefaultImpls
 *  kotlinx.coroutines.SupervisorKt
 *  kotlinx.coroutines.TimeoutCancellationException
 *  kotlinx.coroutines.channels.BufferOverflow
 *  kotlinx.coroutines.flow.Flow
 *  kotlinx.coroutines.flow.FlowCollector
 *  kotlinx.coroutines.flow.FlowKt
 *  kotlinx.coroutines.flow.MutableSharedFlow
 *  kotlinx.coroutines.flow.SharedFlow
 *  kotlinx.coroutines.flow.SharedFlowKt
 *  net.minecraft.client.Minecraft
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package me.octo.client;

import java.io.File;
import java.io.IOException;
import java.lang.invoke.LambdaMetafactory;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import me.octo.client.IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl;
import me.octo.client.lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII;
import me.octo.client.llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII<T>
extends lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII {
    public static <T> T impl(Object... args) { return null; } // PX-FIX ovld-var
   public static me.octo.client.PXDyn continuation = null; // PX-FIX missing field v2
   
   public static me.octo.client.PXDyn lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII2 = null; // PX-FIX missing field v2
   
   
    @NotNull
    private final String[] lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
    @NotNull
    private final String IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
    @NotNull
    private final String llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
    @NotNull
    private final String lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
    @NotNull
    private final CoroutineScope lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
    private final WatchService lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
    @Nullable
    private Job lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
    @Nullable
    private Job IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
    @NotNull
    private final ConcurrentHashMap<Path, WatchKey> llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
    @NotNull
    private final ConcurrentHashMap<String, String> IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
    @NotNull
    private final ConcurrentHashMap<String, String> IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
    @NotNull
    private final ConcurrentHashMap<String, T> IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
    @Nullable
    private volatile String IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
    @NotNull
    private final MutableSharedFlow<Unit> llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
    private volatile boolean IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
    private static String lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
    private static String[] f;
    private static String[] g;

    public lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII(@NotNull String string, @NotNull String string2, @NotNull String[] stringArray, @NotNull String string3, @NotNull String string4, @NotNull String string5) {
        String[] stringArray2;
        Intrinsics.checkNotNullParameter((Object)string, (String)"name");
        Intrinsics.checkNotNullParameter((Object)string2, (String)"description");
        Intrinsics.checkNotNullParameter((Object)stringArray, (String)"staticOptions");
        Intrinsics.checkNotNullParameter((Object)string3, (String)"loadingLabel");
        Intrinsics.checkNotNullParameter((Object)string4, (String)"emptyLabel");
        Intrinsics.checkNotNullParameter((Object)string5, (String)"errorLabel");
        if (stringArray.length == 0) {
            String[] stringArray3 = new String[]{string3};
            stringArray2 = stringArray3;
        } else {
            stringArray2 = stringArray;
        }
        String[] stringArray4 = stringArray2;
        super(string, string2, Arrays.copyOf(stringArray4, stringArray4.length));
        this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = stringArray;
        this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = string3;
        this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = string4;
        this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = string5;
        this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = CoroutineScopeKt.CoroutineScope((CoroutineContext)Dispatchers.getIO().plus((CoroutineContext)SupervisorKt.SupervisorJob((Job)null)));
        try {
            this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = FileSystems.getDefault().newWatchService();
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
        this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new ConcurrentHashMap();
        this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new ConcurrentHashMap();
        this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new ConcurrentHashMap();
        this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = new ConcurrentHashMap();
        this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = SharedFlowKt.MutableSharedFlow(0, 64, BufferOverflow.DROP_OLDEST);
        BuildersKt.launch((CoroutineScope)this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI, (CoroutineContext)kotlin.coroutines.EmptyCoroutineContext.INSTANCE, kotlinx.coroutines.CoroutineStart.DEFAULT, (Function2)((Function2)new Function2<CoroutineScope, Continuation<? super Unit>, Object>(){
   public Object invoke(CoroutineScope p0, Continuation<? super Unit> p1) { return null; } // PX-FIX abs

   public static me.octo.client.PXDyn continuation = null; // PX-FIX missing field v2
   
   public static me.octo.client.PXDyn lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII2 = null; // PX-FIX missing field v2
   
            int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            final /* synthetic */ lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII<T> this$0;
            private static String a;
            {
                this.this$0 = ((lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII<T>)(Object)(lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII2));
                /* PX-FIX removed super call */
            }

            /*
             * Exception decompiling
             */
            public final Object invokeSuspend(Object var1_1) {
                /*
                 * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                 * 
                 * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 4[SWITCH]
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

            public final Object a(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
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
                        char[] cArray3 = "lK?!|,`/\r!(/-bj\rs/9>`}Osj56y`A6j|/f{Bs.3*`z^:#9".toCharArray();
                        int n4 = cArray3.length;
                        n3 = 0;
                        n2 = 25;
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
                                case 0 -> 22;
                                case 1 -> 51;
                                case 2 -> 74;
                                case 3 -> 84;
                                case 4 -> 69;
                                case 5 -> 65;
                                default -> 22;
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
        Runtime.getRuntime().addShutdownHook(new Thread(() -> lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.a(this)));
    }

    @NotNull
    public final String d(@NotNull String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"display");
        String string2 = this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.getOrDefault(string, string);
        Intrinsics.checkNotNullExpressionValue((Object)string2, (String)"getOrDefault(...)");
        return string2;
    }

    @NotNull
    protected abstract Path E();

    @Nullable
    protected abstract Object a(@NotNull Continuation<? super Map<String, ? extends T>> var1);

    @NotNull
    protected abstract String a(T var1);

    @NotNull
    protected abstract String b(T var1);

    protected boolean c(T t) {
        return true;
    }

    @NotNull
    protected Set<Path> a(@NotNull Map<String, ? extends T> map) {
        Intrinsics.checkNotNullParameter(map, (String)"items");
        return SetsKt.setOf(this.E());
    }

    protected final void b(@NotNull Map<String, ? extends T> items) {
        Intrinsics.checkNotNullParameter(items, (String)"items");
        this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.clear();
        this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.clear();
        for (Map.Entry<String, ? extends T> entry : items.entrySet()) {
            String display = this.a(entry.getValue());
            this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.put(display, entry.getKey());
            this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.put(entry.getKey(), display);
        }
    }

    public final void F() {
        lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII2;
        block5: {
            block6: {
                String[] stringArray = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
                try {
                    try {
                        lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII2 = this;
                        if (stringArray != null) break block5;
                        if (!lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII2.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll) {
                            System.out.println((Object)"[WatchDrivenDropdownSetting] Ignoring refreshNow - not yet initialized");
                            return;
                        }
                        break block6;
                    }
                    catch (TimeoutCancellationException timeoutCancellationException) {
                        throw (RuntimeException)lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.a(timeoutCancellationException);
                    }
                }
                catch (TimeoutCancellationException timeoutCancellationException) {
                    throw (RuntimeException)lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.a(timeoutCancellationException);
                }
            }
            lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII2 = this;
        }
        BuildersKt.launch((CoroutineScope)lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII2.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI, (CoroutineContext)kotlin.coroutines.EmptyCoroutineContext.INSTANCE, kotlinx.coroutines.CoroutineStart.DEFAULT, (Function2)((Function2)new Function2<CoroutineScope, Continuation<? super Unit>, Object>(){
   public Object invoke(CoroutineScope p0, Continuation<? super Unit> p1) { return null; } // PX-FIX abs

   public static me.octo.client.PXDyn continuation = null; // PX-FIX missing field v2
   
            int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            final /* synthetic */ lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII<T> this$0;
            private static String a;
            {
                this.this$0 = lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.this;
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

            public final Object a(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
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
                        char[] cArray3 = "\u00194W(`$WZrI!3%U\u001fr\u001b&%6W\b0\u001bc)>N\u0015>^c`'Q\u000e=\u001b'/\"W\u000f!R*%".toCharArray();
                        int n4 = cArray3.length;
                        n3 = 0;
                        n2 = 14;
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
                                case 0 -> 116;
                                case 1 -> 91;
                                case 2 -> 53;
                                case 3 -> 74;
                                case 4 -> 78;
                                case 5 -> 94;
                                default -> 54;
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
    }

    /*
     * Loose catch block
     */
    public final void G() {
        block18: {
            Object object;
            Object object2;
            block16: {
                String[] stringArray;
                block15: {
                    stringArray = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
                    if (stringArray != null) break block15;
                    try {
                        Job job;
                        block17: {
                            job = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
                            if (job == null) break block15;
                            break block17;
                            // PX-FIX removed bogus catch
                        }
                        ((Job)job).cancel((java.util.concurrent.CancellationException)null);
                    }
                    catch (Throwable throwable) {
                        throw (RuntimeException)lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.a(throwable);
                    }
                }
                try {
                    Job job = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
                    if (job != null) {
                        ((Job)job).cancel((java.util.concurrent.CancellationException)null);
                    }
                }
                catch (Throwable throwable) {
                    throw (RuntimeException)lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.a(throwable);
                }
                CoroutineScopeKt.cancel((CoroutineScope)this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI, (java.util.concurrent.CancellationException)null);
                Collection<WatchKey> collection = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.values();
                Intrinsics.checkNotNullExpressionValue(collection, (String)"<get-values>(...)");
                object2 = collection;
                boolean bl = false;
                Iterator iterator = ((me.octo.client.PXDyn)object2).iterator();
                while (iterator.hasNext()) {
                    Object t = iterator.next();
                    WatchKey watchKey = (WatchKey)t;
                    boolean bl2 = false;
                    lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII2 = this;
                    Object object3 = lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII2;
                    boolean bl3 = false;
                    watchKey.cancel();
                    object3 = (kotlin.Result)null /* PX-FIX constructor-impl */;
                    try {
                        if (stringArray == null) {
                        }
                        break block16;
                    }
                    catch (Throwable throwable) {
                        object3 = (kotlin.Result)null /* PX-FIX constructor-impl */;
                    }
                    if (stringArray == null) continue;
                    break;
                }
                this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.clear();
            }
            object2 = this;
            try {
                object = (lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII)object2;
                boolean bl = false;
                ((lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII)object).lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.close();
                object = (kotlin.Result)null /* PX-FIX constructor-impl */;
            }
            catch (Throwable throwable) {
                object = (kotlin.Result)null /* PX-FIX constructor-impl */;
            }
            object2 = object;
            Throwable throwable = object2 instanceof Result.Failure ? ((Result.Failure)object2).exception : null;
            if (throwable == null) break block18;
            Object object4 = object = throwable;
            boolean bl = false;
            System.out.println((Object)("[WatchDrivenDropdownSetting] Failed to close WatchService: " + ((Throwable)object4).getMessage()));
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    protected final String H() {
        Object[] objectArray;
        boolean bl;
        String string;
        block19: {
            String[] stringArray;
            block20: {
                block18: {
                    block17: {
                        string = this.N();
                        stringArray = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
                        try {
                            try {
                                bl = Intrinsics.areEqual((Object)string, (Object)this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII);
                                if (stringArray != null) break block17;
                                if (bl) return null;
                            }
                            catch (TimeoutCancellationException timeoutCancellationException) {
                                throw (RuntimeException)lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.a(timeoutCancellationException);
                            }
                            bl = Intrinsics.areEqual((Object)string, (Object)this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI);
                        }
                        catch (TimeoutCancellationException timeoutCancellationException) {
                            throw (RuntimeException)lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.a(timeoutCancellationException);
                        }
                    }
                    try {
                        try {
                            if (stringArray != null) break block18;
                            if (bl) return null;
                        }
                        catch (TimeoutCancellationException timeoutCancellationException) {
                            throw (RuntimeException)lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.a(timeoutCancellationException);
                        }
                        bl = Intrinsics.areEqual((Object)string, (Object)this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl);
                    }
                    catch (TimeoutCancellationException timeoutCancellationException) {
                        throw (RuntimeException)lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.a(timeoutCancellationException);
                    }
                }
                try {
                    try {
                        if (stringArray != null) break block19;
                        if (!bl) break block20;
                        return null;
                    }
                    catch (TimeoutCancellationException timeoutCancellationException) {
                        throw (RuntimeException)lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.a(timeoutCancellationException);
                    }
                }
                catch (TimeoutCancellationException timeoutCancellationException) {
                    throw (RuntimeException)lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.a(timeoutCancellationException);
                }
            }
            try {
                objectArray = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
                if (stringArray != null) return (String)(Object)objectArray;
                bl = ArraysKt.contains((Object[])objectArray, (Object)string);
            }
            catch (TimeoutCancellationException timeoutCancellationException) {
                throw (RuntimeException)lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.a(timeoutCancellationException);
            }
        }
        try {
            if (bl) {
                return string;
            }
        }
        catch (TimeoutCancellationException timeoutCancellationException) {
            throw (RuntimeException)lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.a(timeoutCancellationException);
        }
        return (String)(Object)this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.get(string);
    }

    private final void I() {
        this.J();
        this.K();
        this.F();
    }

    private final void J() {
        block4: {
            String[] stringArray = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
            try {
                Job job;
                try {
                    if (stringArray != null || (job = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll) == null) break block4;
                }
                catch (TimeoutCancellationException timeoutCancellationException) {
                    throw (RuntimeException)lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.a(timeoutCancellationException);
                }
                ((Job)job).cancel((java.util.concurrent.CancellationException)null);
            }
            catch (TimeoutCancellationException timeoutCancellationException) {
                throw (RuntimeException)lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.a(timeoutCancellationException);
            }
        }
        this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = BuildersKt.launch((CoroutineScope)this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI, (CoroutineContext)kotlin.coroutines.EmptyCoroutineContext.INSTANCE, kotlinx.coroutines.CoroutineStart.DEFAULT, (Function2)((Function2)new Function2<CoroutineScope, Continuation<? super Unit>, Object>(){
   public Object invoke(CoroutineScope p0, Continuation<? super Unit> p1) { return null; } // PX-FIX abs

   public static me.octo.client.PXDyn continuation = null; // PX-FIX missing field v2
   
   public static me.octo.client.PXDyn lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII2 = null; // PX-FIX missing field v2
   
            Object IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            private /* synthetic */ Object IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            final /* synthetic */ lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII<T> this$0;
            private static String a;
            {
                this.this$0 = ((lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII<T>)(Object)(lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII2));
                /* PX-FIX removed super call */
            }

            /*
             * Exception decompiling
             */
            public final Object invokeSuspend(Object var1_1) {
                /*
                 * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                 * 
                 * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 5[SWITCH]
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
                Object illIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll = null /* PX-FIX */;
                ((me.octo.client.PXDyn)illIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll).IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = object;
                return (Continuation)illIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
            }

            public final Object a(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return this.invokeSuspend(Unit.INSTANCE); // PX-FIX suspend-invoke
            }

            private static Exception a(Exception exception) {
                return exception;
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
                        char[] cArray3 = "\u0006,<n\u0014\u0011REj\"gG\u0010P\u0000jp`Q\u0003R\u0017(p%]\u000bK\n&5%\u0014\u0012T\u0011%pa[\u0017R\u001099lQ".toCharArray();
                        int n4 = cArray3.length;
                        n3 = 0;
                        n2 = 55;
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
                                case 0 -> 82;
                                case 1 -> 122;
                                case 2 -> 103;
                                case 3 -> 53;
                                case 4 -> 3;
                                case 5 -> 82;
                                default -> 10;
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
    }

    private final void K() {
        
    }

    /*
     * Exception decompiling
     */
    private final Object b(Continuation<? super Unit> var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[TRYBLOCK]], but top level block is 21[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private final void L() {
        block4: {
            File file = this.E().toFile();
            String[] stringArray = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
            try {
                boolean bl;
                try {
                    bl = file.exists();
                    if (stringArray != null || bl) break block4;
                }
                catch (TimeoutCancellationException timeoutCancellationException) {
                    throw (RuntimeException)lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.a(timeoutCancellationException);
                }
                bl = file.mkdirs();
            }
            catch (TimeoutCancellationException timeoutCancellationException) {
                throw (RuntimeException)lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.a(timeoutCancellationException);
            }
        }
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    private final void M() {
        
    }

    /*
     * Unable to fully structure code
     */
    private final void a(String[] var1_1) {
       String var3 = this.N();
       try {
          java.lang.reflect.Field var4 = Class.forName("me.octo.client.lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII").getDeclaredField("IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII");
          var4.setAccessible(true);
          var4.set(this, var1_1);
       } catch (Throwable var5) {
          throw sneakyThrow(var5);
       }
       try {
          int var6 = ArraysKt.indexOf(var1_1, var3);
          if (var6 != -1) {
             this.d(var6);
          } else if (this.z() >= var1_1.length) {
             this.d(0);
          }
       } catch (Exception var7) {
          throw sneakyThrow(a(var7));
       }
       this.C();
    }

    @Override
    public void a(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll2) {
        Intrinsics.checkNotNullParameter((Object)llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll2, (String)"data");
        String string = this.H();
        try {
            if (string != null) {
                llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll2.a("selectedKey", (Object)string);
            }
        }
        catch (TimeoutCancellationException timeoutCancellationException) {
            throw (RuntimeException)lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.a(timeoutCancellationException);
        }
    }

    @Override
    public void b(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll2) {
        block14: {
            block17: {
                String string;
                String[] stringArray;
                block16: {
                    String string2;
                    block15: {
                        int n;
                        block12: {
                            block13: {
                                String[] stringArray2 = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
                                Intrinsics.checkNotNullParameter((Object)llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll2, (String)"data");
                                stringArray = stringArray2;
                                string2 = llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll2.aString("selectedKey", "");
                                try {
                                    n = ((CharSequence)string2).length();
                                    if (stringArray != null) break block12;
                                    if (n <= 0) break block13;
                                }
                                catch (TimeoutCancellationException timeoutCancellationException) {
                                    throw (RuntimeException)lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.a(timeoutCancellationException);
                                }
                                n = 1;
                                break block12;
                            }
                            n = 0;
                        }
                        try {
                            try {
                                try {
                                    if (n == 0) break block14;
                                    this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = string2;
                                    if (stringArray != null) break block15;
                                }
                                catch (TimeoutCancellationException timeoutCancellationException) {
                                    throw (RuntimeException)lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.a(timeoutCancellationException);
                                }
                                string = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.get(string2);
                                if (string != null) break block16;
                            }
                            catch (TimeoutCancellationException timeoutCancellationException) {
                                throw (RuntimeException)lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.a(timeoutCancellationException);
                            }
                        }
                        catch (TimeoutCancellationException timeoutCancellationException) {
                            throw (RuntimeException)lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.a(timeoutCancellationException);
                        }
                    }
                    string = string2;
                }
                String string3 = string;
                Object[] objectArray = super.w();
                int n = ArraysKt.indexOf((Object[])objectArray, (Object)string3);
                try {
                    try {
                        if (stringArray != null) break block17;
                        if (n == -1) break block14;
                    }
                    catch (TimeoutCancellationException timeoutCancellationException) {
                        throw (RuntimeException)lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.a(timeoutCancellationException);
                    }
                    this.d(n);
                }
                catch (TimeoutCancellationException timeoutCancellationException) {
                    throw (RuntimeException)lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.a(timeoutCancellationException);
                }
            }
            this.C();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final String N() {
       String[] var1 = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
       String[] var2 = super.w();
       if (var1 == null && var2.length == 0) {
          return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
       }
       try {
          return super.z() < var2.length ? super.y() : this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
       } catch (Exception var3) {
          return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
       }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final void a(Set<? extends Path> var1_1) {
        
    }

    private final SharedFlow<Unit> O() {
        return (SharedFlow)this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
    }

    /*
     * Loose catch block
     */
    private final void P() {
        block6: {
            boolean bl;
            block7: {
                String[] stringArray = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
                bl = this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
                if (stringArray != null) break block6;
                try {
                    block8: {
                        if (bl) break block7;
                        break block8;
                        // PX-FIX removed bogus catch
                    }
                    System.out.println((Object)"[WatchDrivenDropdownSetting] Ignoring trigger - not yet initialized");
                    return;
                }
                catch (Exception exception) {
                    throw (RuntimeException)lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.a(exception);
                }
            }
            try {
                bl = this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI.tryEmit((Unit)(Object)Unit.INSTANCE);
            }
            catch (Exception exception) {
                System.out.println((Object)("[WatchDrivenDropdownSetting] Failed to emit trigger: " + exception.getMessage()));
            }
        }
    }

    private final void a(Function0<Unit> function0) {
        try {
            Minecraft minecraft = Minecraft.getInstance();
            Intrinsics.checkNotNullExpressionValue((Object)minecraft, (String)"getInstance(...)");
            Minecraft minecraft2 = minecraft;
            minecraft2.execute(() -> lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.b(function0));
        }
        catch (Throwable throwable) {
            function0.invoke();
        }
    }

    private static final void a(lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII2) {
        lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII2.G();
    }

    private static final Unit b(lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII2) {
        lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII2.M();
        return Unit.INSTANCE;
    }

    private static final Unit c(lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII2) {
        String[] stringArray = new String[]{lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII2.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl};
        lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII2.a(stringArray);
        return Unit.INSTANCE;
    }

    private static final void b(Function0 function0) {
        function0.invoke();
    }

    public static final /* synthetic */ void d(lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII2) {
        lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII2.P();
    }

    public static final /* synthetic */ WatchService e(lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII2) {
        return lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII2.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
    }

    public static final /* synthetic */ SharedFlow f(lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII2) {
        return lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII2.O();
    }

    public static final /* synthetic */ void a(lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII2, Function0 function0) {
        lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII2.a((Function0<Unit>)function0);
    }

    public static final /* synthetic */ void a(lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII2, boolean bl) {
        lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII2.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = bl;
    }

    public static final /* synthetic */ void h(lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII2) {
        lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII2.I();
    }


    public static final /* synthetic */ Object a(lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII var0, Continuation var1) {
        return var0.b(var1);
    }

    public static final /* synthetic */ void a(lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII var0, String[] var1) {
        var0.a(var1);
    }

    public static final /* synthetic */ String g(lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII var0) {
        return var0.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
    }

    public static void f(String string) {
        lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = string;
    }

    public static String Q() {
        return lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static <T extends Throwable> RuntimeException sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }

    /*
     * Unable to fully structure code
     */

    private static String c(int n, int n2) {
        int n3 = (n ^ 0x739E) & 0xFFFF;
        if (g[n3] == null) {
            int n4;
            char[] cArray = f[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 192;
                case 1 -> 39;
                case 2 -> 113;
                case 3 -> 234;
                case 4 -> 20;
                case 5 -> 208;
                case 6 -> 107;
                case 7 -> 172;
                case 8 -> 152;
                case 9 -> 196;
                case 10 -> 16;
                case 11 -> 42;
                case 12 -> 45;
                case 13 -> 82;
                case 14 -> 209;
                case 15 -> 65;
                case 16 -> 231;
                case 17 -> 55;
                case 18 -> 48;
                case 19 -> 108;
                case 20 -> 121;
                case 21 -> 214;
                case 22 -> 92;
                case 23 -> 14;
                case 24 -> 211;
                case 25 -> 185;
                case 26 -> 249;
                case 27 -> 227;
                case 28 -> 219;
                case 29 -> 11;
                case 30 -> 218;
                case 31 -> 74;
                case 32 -> 115;
                case 33 -> 193;
                case 34 -> 130;
                case 35 -> 205;
                case 36 -> 212;
                case 37 -> 51;
                case 38 -> 200;
                case 39 -> 97;
                case 40 -> 32;
                case 41 -> 38;
                case 42 -> 116;
                case 43 -> 21;
                case 44 -> 58;
                case 45 -> 171;
                case 46 -> 188;
                case 47 -> 174;
                case 48 -> 103;
                case 49 -> 215;
                case 50 -> 3;
                case 51 -> 248;
                case 52 -> 28;
                case 53 -> 197;
                case 54 -> 22;
                case 55 -> 132;
                case 56 -> 220;
                case 57 -> 81;
                case 58 -> 119;
                case 59 -> 19;
                case 60 -> 99;
                case 61 -> 254;
                case 62 -> 106;
                case 63 -> 243;
                case 64 -> 210;
                case 65 -> 140;
                case 66 -> 123;
                case 67 -> 9;
                case 68 -> 54;
                case 69 -> 244;
                case 70 -> 198;
                case 71 -> 147;
                case 72 -> 49;
                case 73 -> 242;
                case 74 -> 159;
                case 75 -> 79;
                case 76 -> 191;
                case 77 -> 8;
                case 78 -> 127;
                case 79 -> 118;
                case 80 -> 53;
                case 81 -> 131;
                case 82 -> 186;
                case 83 -> 225;
                case 84 -> 235;
                case 85 -> 83;
                case 86 -> 170;
                case 87 -> 110;
                case 88 -> 6;
                case 89 -> 85;
                case 90 -> 93;
                case 91 -> 150;
                case 92 -> 29;
                case 93 -> 91;
                case 94 -> 96;
                case 95 -> 70;
                case 96 -> 69;
                case 97 -> 24;
                case 98 -> 155;
                case 99 -> 230;
                case 100 -> 126;
                case 101 -> 141;
                case 102 -> 52;
                case 103 -> 122;
                case 104 -> 101;
                case 105 -> 7;
                case 106 -> 36;
                case 107 -> 148;
                case 108 -> 30;
                case 109 -> 138;
                case 110 -> 105;
                case 111 -> 176;
                case 112 -> 129;
                case 113 -> 187;
                case 114 -> 252;
                case 115 -> 26;
                case 116 -> 109;
                case 117 -> 180;
                case 118 -> 162;
                case 119 -> 239;
                case 120 -> 221;
                case 121 -> 47;
                case 122 -> 124;
                case 123 -> 134;
                case 124 -> 169;
                case 125 -> 62;
                case 126 -> 139;
                case 127 -> 33;
                case 128 -> 87;
                case 129 -> 37;
                case 130 -> 64;
                case 131 -> 125;
                case 132 -> 216;
                case 133 -> 246;
                case 134 -> 67;
                case 135 -> 143;
                case 136 -> 18;
                case 137 -> 154;
                case 138 -> 10;
                case 139 -> 163;
                case 140 -> 4;
                case 141 -> 63;
                case 142 -> 156;
                case 143 -> 17;
                case 144 -> 167;
                case 145 -> 77;
                case 146 -> 59;
                case 147 -> 202;
                case 148 -> 190;
                case 149 -> 13;
                case 150 -> 88;
                case 151 -> 0;
                case 152 -> 178;
                case 153 -> 213;
                case 154 -> 177;
                case 155 -> 166;
                case 156 -> 15;
                case 157 -> 34;
                case 158 -> 165;
                case 159 -> 164;
                case 160 -> 75;
                case 161 -> 228;
                case 162 -> 194;
                case 163 -> 46;
                case 164 -> 181;
                case 165 -> 179;
                case 166 -> 35;
                case 167 -> 255;
                case 168 -> 90;
                case 169 -> 98;
                case 170 -> 50;
                case 171 -> 40;
                case 172 -> 117;
                case 173 -> 226;
                case 174 -> 100;
                case 175 -> 43;
                case 176 -> 146;
                case 177 -> 76;
                case 178 -> 44;
                case 179 -> 111;
                case 180 -> 135;
                case 181 -> 112;
                case 182 -> 66;
                case 183 -> 137;
                case 184 -> 133;
                case 185 -> 223;
                case 186 -> 250;
                case 187 -> 217;
                case 188 -> 201;
                case 189 -> 189;
                case 190 -> 73;
                case 191 -> 207;
                case 192 -> 195;
                case 193 -> 151;
                case 194 -> 168;
                case 195 -> 241;
                case 196 -> 2;
                case 197 -> 161;
                case 198 -> 236;
                case 199 -> 61;
                case 200 -> 153;
                case 201 -> 5;
                case 202 -> 60;
                case 203 -> 237;
                case 204 -> 95;
                case 205 -> 102;
                case 206 -> 183;
                case 207 -> 222;
                case 208 -> 251;
                case 209 -> 182;
                case 210 -> 27;
                case 211 -> 78;
                case 212 -> 157;
                case 213 -> 1;
                case 214 -> 206;
                case 215 -> 247;
                case 216 -> 203;
                case 217 -> 104;
                case 218 -> 120;
                case 219 -> 23;
                case 220 -> 114;
                case 221 -> 173;
                case 222 -> 145;
                case 223 -> 142;
                case 224 -> 31;
                case 225 -> 199;
                case 226 -> 128;
                case 227 -> 25;
                case 228 -> 240;
                case 229 -> 204;
                case 230 -> 80;
                case 231 -> 84;
                case 232 -> 232;
                case 233 -> 229;
                case 234 -> 253;
                case 235 -> 184;
                case 236 -> 68;
                case 237 -> 57;
                case 238 -> 149;
                case 239 -> 89;
                case 240 -> 12;
                case 241 -> 136;
                case 242 -> 144;
                case 243 -> 245;
                case 244 -> 175;
                case 245 -> 41;
                case 246 -> 56;
                case 247 -> 158;
                case 248 -> 224;
                case 249 -> 238;
                case 250 -> 86;
                case 251 -> 71;
                case 252 -> 160;
                case 253 -> 72;
                case 254 -> 94;
                default -> 233;
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
            lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.g[n3] = new String(cArray).intern();
        }
        return g[n3];
    }
}
