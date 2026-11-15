/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Unit
 *  kotlin.collections.CollectionsKt
 *  kotlin.coroutines.Continuation
 *  kotlin.coroutines.CoroutineContext
 *  kotlin.jvm.functions.Function2
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.ranges.RangesKt
 *  kotlinx.coroutines.BuildersKt
 *  kotlinx.coroutines.CoroutineScope
 *  kotlinx.coroutines.CoroutineScopeKt
 *  kotlinx.coroutines.Dispatchers
 *  kotlinx.coroutines.SupervisorKt
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
 *  net.minecraft.client.Minecraft
 *  org.jetbrains.annotations.NotNull
 */
package me.octo.client.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import me.octo.client.lllllIllIIlIlIlIllIlIIlllIlIlIllIlIlIlIIIIlllllIllllIIllIllIllIlllIlIIIlIlIlllIIlllll;
import me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
import me.octo.client.utils.IIIlIllllIllllIllIlIIIlllllIlIlIIIllllIllIlllIlllIlIlIllIIlIllllIIlIIlIIllllIIlIlIlII;
import me.octo.client.utils.IIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll;
import me.octo.client.utils.IlIllIlIIllllllIIIIlIIlIIIIIIlllllIIIlIIllIIlllIlIlIIIlIIIlIlIIIIIlIllIlIIlIllIIIIllI;
import me.octo.client.utils.llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl;
import me.octo.client.utils.llIIlIlIlIIIlIIIIlIllIlIllIllIIlIlIIllllIllIlllIlIIIllllllllllIlIllIIlllIlIIlIIIlllIl;
import me.octo.client.utils.lllIIlIIIIIIlIIlIlIllIllIlIIIlIllIllIlllIlllllllIIllIIIllIIllIllllIlIlllllIlIlIIIlIIl;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import me.octo.client.utils.llllIIIlIIIIlIIIlIlllIlIIllIIIlIlIlllIIIIlllIIlllIllIlIlIlllIIllIIIIlIIIlllllllIIIllI;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public final class IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII {
    @NotNull
    public static IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII();
    private static int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = 15;
    @NotNull
    private static List<IIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new java.util.ArrayList<>();
    private static long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
    @NotNull
    private static CoroutineScope IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
    private static String[] a;
    private static String[] b;

    private IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII() {
    }

    public final void a() {
        ClientTickEvents.END_CLIENT_TICK.register(IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII::a);
        ClientLifecycleEvents.CLIENT_STOPPING.register(IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII::b);
    }

    public final void b() {
        CoroutineScopeKt.cancel((CoroutineScope)IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, (java.util.concurrent.CancellationException)null);
    }

    private final IIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll a(long l, String string, String string2, IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll) {
        return switch (lllllIllIIlIlIlIllIlIIlllIlIlIllIlIlIlIIIIlllllIllllIIllIllIllIlllIlIIIlIlIlllIIlllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b().z()) {
            case 0 -> new IIIlIllllIllllIllIlIIIlllllIlIlIIIllllIllIlllIlllIlIlIllIIlIllllIIlIIlIIllllIIlIlIlII(l, string, string2, iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll);
            case 1 -> new lllIIlIIIIIIlIIlIlIllIllIlIIIlIllIllIlllIlllllllIIllIIIllIIllIllllIlIlllllIlIlIIIlIIl(l, string, string2, iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll);
            case 2 -> new IlIllIlIIllllllIIIIlIIlIIIIIIlllllIIIlIIllIIlllIlIlIIIlIIIlIlIIIIIlIllIlIIlIllIIIIllI(l, string, string2, iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll);
            case 3 -> new llIIlIlIlIIIlIIIIlIllIlIllIllIIlIlIIllllIllIlllIlIIIllllllllllIlIllIIlllIlIIlIIIlllIl(l, string, string2, iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll);
            case 4 -> new llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl(l, string, string2, iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll);
            case 5 -> new llllIIIlIIIIlIIIlIlllIlIIllIIIlIlIlllIIIIlllIIlllIllIlIlIlllIIllIIIIlIIIlllllllIIIllI(l, string, string2, iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll);
            default -> new IIIlIllllIllllIllIlIIIlllllIlIlIIIllllIllIlllIlllIlIlIllIIlIllllIIlIIlIIllllIIlIlIlII(l, string, string2, iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll);
        };
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    public final void b(long var1_1, @NotNull String var3_2, @NotNull String var4_3, @NotNull IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var5_4) {
      Intrinsics.checkNotNullParameter(var3_2, "title");
      Intrinsics.checkNotNullParameter(var4_3, "body");
      Intrinsics.checkNotNullParameter(var5_4, "style");
      if (IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.size() >= 15) {
         int var7 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.size() - 15 + 1;
         for (int var8 = 0; var8 < var7; var8++) {
            if (!IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.isEmpty()) {
               IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.remove(0);
            }
         }
      }
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.add(this.a(var1_1, var3_2, var4_3, var5_4));
      int var9 = 0;
      for (var var10 : IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
         if (!var10.i()) {
            var9++;
         }
      }
      if (var9 > 10) {
         int var11 = var9 - 8;
         int var12 = 0;
         for (var var13 : IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
            if (var12 >= var11) {
               break;
            }
            if (!var13.i()) {
               var13.p();
               var12++;
            }
         }
      }
    }

    public static /* synthetic */ void a(IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII illIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII, long l, String string, String string2, IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll, int n, Object object) {
        if ((n & 8) != 0) {
            iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
        }
        illIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.b(l, string, string2, iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll);
    }

    public final void a(long l, long l2, @NotNull String string, @NotNull String string2, @NotNull IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll) {
       kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "title");
       kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string2, "body");
       kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll, "style");
       kotlinx.coroutines.BuildersKt.launch(IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, kotlin.coroutines.EmptyCoroutineContext.INSTANCE, kotlinx.coroutines.CoroutineStart.DEFAULT, (kotlin.jvm.functions.Function2) new IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(l, l2, string, string2, iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll, null));
    }

    public static /* synthetic */ void a(IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII illIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII, long l, long l2, String string, String string2, IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll, int n, Object object) {
        if ((n & 0x10) != 0) {
            iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
        }
        illIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.a(l, l2, string, string2, iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll);
    }

    public final int a(@NotNull IIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll iIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll) {
        lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
        Intrinsics.checkNotNullParameter((Object)iIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll, (String)"notification");
        lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray2 = lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray;
        int n = 0;
        Iterator<IIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll> iterator = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.iterator();
        block0: while (true) {
            boolean bl = iterator.hasNext();
            while (bl) {
                IIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll iIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll2;
                IIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll iIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll3 = iIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll2 = iterator.next();
                if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray2 != null) {
                    if (iIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll3 == iIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll) {
                        return n;
                    }
                    iIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll3 = iIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll2;
                }
                bl = iIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll3.i();
                if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray2 == null) continue;
                if (bl) continue block0;
                ++n;
                if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray2 == null) break block0;
                continue block0;
            }
            break;
        }
        return n;
    }

    public final int b(@NotNull IIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll iIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll) {
        Intrinsics.checkNotNullParameter((Object)iIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll, (String)"notification");
        return RangesKt.coerceAtLeast((int)IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.indexOf(iIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll), (int)0);
    }

    private final void c() {
        Iterator<IIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll> iterator = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.iterator();
        lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
        block0: while (true) {
            boolean bl = iterator.hasNext();
            while (bl) {
                block6: {
                    IIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll iIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll;
                    block7: {
                        iIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll = iterator.next();
                        bl = iIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll.o();
                        if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray == null) break block6;
                        if (!bl) break block7;
                        bl = iIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll.i();
                        if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray == null) break block6;
                        if (!bl) {
                            iIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll.p();
                        }
                    }
                    bl = iIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll.q();
                }
                if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray == null) continue;
                if (!bl) continue block0;
                iterator.remove();
                if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray == null) break block0;
                continue block0;
            }
            break;
        }
    }

    public final void d() {
        int n;
        int n2;
        int n3;
        Iterable iterable;
        lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray;
        block8: {
            lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
            int n4 = (int)(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.isEmpty() ? 1 : 0);
            if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray != null) {
                if (n4 != 0) {
                    return;
                }
                long l = System.currentTimeMillis() - lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI - 3L;
                n4 = l == 0L ? 0 : (l < 0L ? -1 : 1);
            }
            if (n4 >= 0) {
                iterable = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                n3 = 0;
                int n5 = 0;
                for (Object object : iterable) {
                    n = n2 = n5++;
                    if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray != null) {
                        int n6 = n2;
                        if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray != null) {
                            if (n < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            n6 = n2;
                        }
                        IIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll iIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll = (IIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll)object;
                        int n7 = n6;
                        boolean bl = false;
                        iIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll.a(n7);
                        if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray != null) continue;
                        break;
                    }
                    break block8;
                }
                lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = System.currentTimeMillis();
            }
            iterable = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            n = 0;
        }
        n3 = n;
        for (Object iterator : (Iterable)iterable) {
            Object object;
            object = (IIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll)((Object)iterator);
            n2 = 0;
            ((IIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll)object).s();
            if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray == null) break;
            if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray != null) continue;
            break;
        }
    }

    private static final void a(Minecraft minecraft) {
        Intrinsics.checkNotNullParameter((Object)minecraft, (String)"it");
        IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
    }

    private static final void b(Minecraft minecraft) {
        Intrinsics.checkNotNullParameter((Object)minecraft, (String)"it");
        IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b();
    }

    /*
     * Unable to fully structure code
     */
    static {
        // PX-FIX: 原静态初始化块（jar <clinit>：字符串表构建）反编译损坏，先置空保证可编译；Phase A 按 jar 还原。
    }

    private static String a(int n, int n2) {
        int n3 = (n ^ 0xFFFF8ED2) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 85;
                case 1 -> 65;
                case 2 -> 124;
                case 3 -> 242;
                case 4 -> 3;
                case 5 -> 113;
                case 6 -> 176;
                case 7 -> 31;
                case 8 -> 126;
                case 9 -> 215;
                case 10 -> 247;
                case 11 -> 145;
                case 12 -> 236;
                case 13 -> 146;
                case 14 -> 56;
                case 15 -> 70;
                case 16 -> 238;
                case 17 -> 106;
                case 18 -> 245;
                case 19 -> 178;
                case 20 -> 250;
                case 21 -> 141;
                case 22 -> 99;
                case 23 -> 83;
                case 24 -> 172;
                case 25 -> 136;
                case 26 -> 155;
                case 27 -> 194;
                case 28 -> 110;
                case 29 -> 133;
                case 30 -> 37;
                case 31 -> 189;
                case 32 -> 43;
                case 33 -> 11;
                case 34 -> 200;
                case 35 -> 148;
                case 36 -> 95;
                case 37 -> 10;
                case 38 -> 51;
                case 39 -> 158;
                case 40 -> 166;
                case 41 -> 202;
                case 42 -> 34;
                case 43 -> 199;
                case 44 -> 233;
                case 45 -> 173;
                case 46 -> 71;
                case 47 -> 4;
                case 48 -> 239;
                case 49 -> 165;
                case 50 -> 119;
                case 51 -> 191;
                case 52 -> 248;
                case 53 -> 183;
                case 54 -> 86;
                case 55 -> 88;
                case 56 -> 235;
                case 57 -> 122;
                case 58 -> 60;
                case 59 -> 82;
                case 60 -> 224;
                case 61 -> 72;
                case 62 -> 152;
                case 63 -> 42;
                case 64 -> 5;
                case 65 -> 120;
                case 66 -> 160;
                case 67 -> 254;
                case 68 -> 212;
                case 69 -> 104;
                case 70 -> 63;
                case 71 -> 100;
                case 72 -> 123;
                case 73 -> 48;
                case 74 -> 90;
                case 75 -> 121;
                case 76 -> 223;
                case 77 -> 66;
                case 78 -> 180;
                case 79 -> 154;
                case 80 -> 111;
                case 81 -> 57;
                case 82 -> 135;
                case 83 -> 205;
                case 84 -> 138;
                case 85 -> 47;
                case 86 -> 179;
                case 87 -> 209;
                case 88 -> 221;
                case 89 -> 249;
                case 90 -> 9;
                case 91 -> 175;
                case 92 -> 24;
                case 93 -> 190;
                case 94 -> 25;
                case 95 -> 29;
                case 96 -> 6;
                case 97 -> 68;
                case 98 -> 246;
                case 99 -> 168;
                case 100 -> 7;
                case 101 -> 181;
                case 102 -> 115;
                case 103 -> 196;
                case 104 -> 227;
                case 105 -> 184;
                case 106 -> 197;
                case 107 -> 225;
                case 108 -> 52;
                case 109 -> 89;
                case 110 -> 49;
                case 111 -> 35;
                case 112 -> 40;
                case 113 -> 78;
                case 114 -> 54;
                case 115 -> 203;
                case 116 -> 232;
                case 117 -> 62;
                case 118 -> 139;
                case 119 -> 13;
                case 120 -> 103;
                case 121 -> 211;
                case 122 -> 97;
                case 123 -> 125;
                case 124 -> 220;
                case 125 -> 132;
                case 126 -> 55;
                case 127 -> 241;
                case 128 -> 18;
                case 129 -> 163;
                case 130 -> 216;
                case 131 -> 108;
                case 132 -> 53;
                case 133 -> 61;
                case 134 -> 214;
                case 135 -> 107;
                case 136 -> 32;
                case 137 -> 73;
                case 138 -> 185;
                case 139 -> 101;
                case 140 -> 12;
                case 141 -> 16;
                case 142 -> 0;
                case 143 -> 14;
                case 144 -> 210;
                case 145 -> 22;
                case 146 -> 159;
                case 147 -> 171;
                case 148 -> 240;
                case 149 -> 96;
                case 150 -> 156;
                case 151 -> 91;
                case 152 -> 8;
                case 153 -> 218;
                case 154 -> 1;
                case 155 -> 252;
                case 156 -> 229;
                case 157 -> 50;
                case 158 -> 208;
                case 159 -> 2;
                case 160 -> 151;
                case 161 -> 105;
                case 162 -> 230;
                case 163 -> 157;
                case 164 -> 67;
                case 165 -> 143;
                case 166 -> 149;
                case 167 -> 170;
                case 168 -> 109;
                case 169 -> 153;
                case 170 -> 94;
                case 171 -> 98;
                case 172 -> 161;
                case 173 -> 198;
                case 174 -> 80;
                case 175 -> 186;
                case 176 -> 58;
                case 177 -> 244;
                case 178 -> 75;
                case 179 -> 41;
                case 180 -> 27;
                case 181 -> 23;
                case 182 -> 131;
                case 183 -> 44;
                case 184 -> 188;
                case 185 -> 134;
                case 186 -> 92;
                case 187 -> 204;
                case 188 -> 21;
                case 189 -> 213;
                case 190 -> 231;
                case 191 -> 182;
                case 192 -> 142;
                case 193 -> 118;
                case 194 -> 127;
                case 195 -> 17;
                case 196 -> 195;
                case 197 -> 207;
                case 198 -> 84;
                case 199 -> 129;
                case 200 -> 243;
                case 201 -> 177;
                case 202 -> 147;
                case 203 -> 193;
                case 204 -> 164;
                case 205 -> 102;
                case 206 -> 116;
                case 207 -> 222;
                case 208 -> 26;
                case 209 -> 144;
                case 210 -> 20;
                case 211 -> 226;
                case 212 -> 206;
                case 213 -> 76;
                case 214 -> 79;
                case 215 -> 39;
                case 216 -> 137;
                case 217 -> 45;
                case 218 -> 237;
                case 219 -> 169;
                case 220 -> 15;
                case 221 -> 93;
                case 222 -> 253;
                case 223 -> 150;
                case 224 -> 46;
                case 225 -> 74;
                case 226 -> 187;
                case 227 -> 33;
                case 228 -> 228;
                case 229 -> 234;
                case 230 -> 19;
                case 231 -> 219;
                case 232 -> 38;
                case 233 -> 81;
                case 234 -> 112;
                case 235 -> 192;
                case 236 -> 77;
                case 237 -> 140;
                case 238 -> 128;
                case 239 -> 255;
                case 240 -> 217;
                case 241 -> 30;
                case 242 -> 114;
                case 243 -> 69;
                case 244 -> 162;
                case 245 -> 130;
                case 246 -> 59;
                case 247 -> 201;
                case 248 -> 117;
                case 249 -> 87;
                case 250 -> 167;
                case 251 -> 28;
                case 252 -> 174;
                case 253 -> 251;
                case 254 -> 36;
                default -> 64;
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
            IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }
}
