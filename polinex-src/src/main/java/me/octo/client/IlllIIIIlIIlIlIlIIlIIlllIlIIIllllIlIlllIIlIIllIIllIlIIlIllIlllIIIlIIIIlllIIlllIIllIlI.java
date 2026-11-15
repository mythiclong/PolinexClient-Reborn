package me.octo.client;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
import me.octo.client.utils.lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.ConnectScreen;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.client.gui.screens.multiplayer.JoinMultiplayerScreen;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.multiplayer.ServerData.Type;
import net.minecraft.client.multiplayer.resolver.ServerAddress;
import org.jetbrains.annotations.NotNull;

public final class IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI
   extends IlIlIIIllIIlIIlllIlIlIlIIlIIIlIllIllIIIllIIlIlIIllIIlIIlIlllIIIlllIlIIlIIIIlIllIlIlII {
   @NotNull
   public static IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.PXEvMid IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private boolean lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private static Minecraft lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private static AtomicLong lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private static AtomicLong IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private static AtomicLong llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @NotNull
   private static AtomicLong IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @NotNull
   private static AtomicLong IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static volatile boolean IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static volatile boolean IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   @NotNull
   private static AtomicReference<IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   @NotNull
   private static AtomicInteger IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   @NotNull
   private static AtomicInteger lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   private static long llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   private static String lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   private static String[] c;
   private static String[] d;

   public IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI() {
      short var10001 = -27529;
      short var10002 = -3496;
      super("Scheduler");
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
   }

   public void g() {
      me.octo.client.IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.B();
      java.util.concurrent.atomic.AtomicLong var1 = me.octo.client.IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.u();
      var1.set(System.currentTimeMillis() - me.octo.client.IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.y().get() - 1000L);

      if (var1 != null) {
         net.minecraft.client.Minecraft var2 = me.octo.client.IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.z();

         if (var2.player == null) {
            if (me.octo.client.IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.z().getConnection() == null) {
               this.v();
               this.b(false);
            }
         }
      }
   }

   public void h() {
      String var1 = B();
      if (llIIlIlllIlIllIllIllIlIlIlllllIlllIIIIlIIllIIIlIllIlIlIlIIIIIIlllIlIlllIlllIllIlIlIIl.a() != null) {
         boolean var10000 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
         if (var1 != null) {
            if (this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI) {
               return;
            }

            var10000 = false;
         }

         IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = var10000;
         this.a(true);
      }
   }

   public void j() {
      long var7;
      label28: {
         String var10000 = B();
         this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = false;
         String var1 = var10000;
         lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.set(System.currentTimeMillis());
         if (var1 != null) {
            if (IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.h()) {
               long var4 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.i();
               llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.set(var4 * 60000L);
               llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI.set(
                  IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
               );
               lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll.set((int)var4);
               IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.l();
               var7 = var4;
               break label28;
            }

            llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI.set(
               IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            );
            lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll.set(0);
         }

         var7 = llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.get() / 60000L;
      }

      long var2 = var7;
      short var8 = -27535;
      short var10001 = 2984;
      Pair[] var6 = new Pair[2];
      short var10003 = -27522;
      short var10004 = 18785;
      var6[0] = TuplesKt.to("break_duration", var2);
      var10003 = -27527;
      var10004 = 19099;
      var6[1] = TuplesKt.to(
         "triggered_by_integration",
         llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI.get()
            == IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
      );
      lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.a("scheduler_break_start", MapsKt.mapOf(var6), true, true);
      IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = true;
      IlIIIlIlIlIIIlIIIIlIlllIlllIlIIlIllIlIIllIIIllIlIlIlIIIIIllIlllIIlIlIIIllIllIIllllllI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .l();
      IlIIlllIllIlIIIlIIllIIlllllllIIlIIlIIlIIlllIIllIllIIllIlllIlIIIIIlIlllIIlllIIIllllllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .e();
      super.j();
      IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.PXEvMid var9 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      String var10;
      if (!lllIlIIIIllIIIIlIIIllIllIIlllIIlIIIIIIllIllllIlIIIIllIIIllIlIIIlIIllIlIllIllllIIIlIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .c()
         .ae()) {
         short var10002 = -27528;
         var10003 = 2415;
         var10003 = -27525;
         var10004 = -25179;
         var10 = " for " + var2 + " minutes.";
      } else {
         var10001 = -27533;
         short var12 = -21881;
         var10 = ", rejoin when ready!";
      }

      short var13 = -27536;
      var10003 = -5287;
      var9.a("Polinex | Taking a break" + var10);
      if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         b("HGkh6b");
      }
   }

   @JvmStatic
   public static final boolean n() {
      return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.f();
   }

   @JvmStatic
   public static final void o() {
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.g();
   }

   @JvmStatic
   public static final void p() {
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.v();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[13];
      int var3 = 0;
      String var2 = "«9¢\u009cÑ\n\u0007\u009f1Õ\u0088¹\u000fB\u0014óî9zVbÛ¿T¿ ,\u00843^l\nÆR\u009a\u0018E\u009e\u0002Þèq\u0099Øs\u0083/\u0012Û9\fO\u009eåð\u0018\u0017WôÔ\u0015±~ßCÝ_`JÔC\"\u0089\u00843-?LÁÒ;<\u0018WÜå&¸¡±\u0087%úÈµãÖ¹¡mO1\u00881*øó\t#Ç©t\u0013¹¹\u0096ï\t\u001aÊ~Û\u008cÊ\u008fÄS\u0013éoÔa¼\u001bLÂQR\u0092«\u0092wï·\u0002ÊÊ\u0010\u007fr\u008c(\"\u009dÌÐF¨è\u0015qþôV\tK|¸Ç\u0001¤Á\u0002\u0094\u0005ÂL\u008f·t";
      int var4 = "«9¢\u009cÑ\n\u0007\u009f1Õ\u0088¹\u000fB\u0014óî9zVbÛ¿T¿ ,\u00843^l\nÆR\u009a\u0018E\u009e\u0002Þèq\u0099Øs\u0083/\u0012Û9\fO\u009eåð\u0018\u0017WôÔ\u0015±~ßCÝ_`JÔC\"\u0089\u00843-?LÁÒ;<\u0018WÜå&¸¡±\u0087%úÈµãÖ¹¡mO1\u00881*øó\t#Ç©t\u0013¹¹\u0096ï\t\u001aÊ~Û\u008cÊ\u008fÄS\u0013éoÔa¼\u001bLÂQR\u0092«\u0092wï·\u0002ÊÊ\u0010\u007fr\u008c(\"\u009dÌÐF¨è\u0015qþôV\tK|¸Ç\u0001¤Á\u0002\u0094\u0005ÂL\u008f·t"
         .length();
      char var1 = 14;
      b("ZA9rtc");
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 125;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var26 = var10001.toCharArray();
               int var10004 = var26.length;
               int var6 = 0;
               byte var29 = var10000;
               var21 = var26;
               int var15 = var10004;
               byte var35;
               char[] var39;
               int var10006;
               if (var10004 <= 1) {
                  var39 = var26;
                  var35 = var10000;
                  var10006 = var6;
               } else {
                  var29 = var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var39 = var26;
                  var35 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var39[var10006] = (char)(var39[var10006] ^ var35 ^ switch (var6 % 7) {
                     case 0 -> 10;
                     case 1 -> 120;
                     case 2 -> 15;
                     case 3 -> 59;
                     case 4 -> 20;
                     case 5 -> 62;
                     default -> 15;
                  });
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var39 = var21;
                     var35 = var29;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var39 = var21;
                     var35 = var29;
                     var10006 = var6;
                  }
               }
            }

            String var31 = new String(var21).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var31;
                  if ((var8 += var1) >= var4) {
                     c = var5;
                     d = new String[13];
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.PXEvMid(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     Minecraft var10 = Minecraft.getInstance();
                     var10002 = -27526;
                     short var32 = -29720;
                     Intrinsics.checkNotNullExpressionValue(var10, "getInstance(...)");
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var10;
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new AtomicLong(0L);
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new AtomicLong(0L);
                     llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new AtomicLong(0L);
                     IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new AtomicLong(0L);
                     IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new AtomicLong(0L);
                     llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = new AtomicReference<>(
                        IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     );
                     IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = new AtomicInteger(0);
                     lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = new AtomicInteger(0);
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var31;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "Ê\u000f_UæÆsbtOë\n\u008e(\u001dwð\u009c\u008bûoM:\u0016\u000e\u0084þNmE=\u009cpK!Î.Î¹";
                  var4 = "Ê\u000f_UæÆsbtOë\n\u008e(\u001dwð\u009c\u008bûoM:\u0016\u000e\u0084þNmE=\u009cpK!Î.Î¹".length();
                  var1 = 24;
                  var8 = -1;
            }

            var10000 = 117;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   public static void b(String var0) {
      lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = var0;
   }

   public static String B() {
      return lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ -27534) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 138;
            case 1 -> 135;
            case 2 -> 19;
            case 3 -> 154;
            case 4 -> 78;
            case 5 -> 177;
            case 6 -> 216;
            case 7 -> 21;
            case 8 -> 121;
            case 9 -> 202;
            case 10 -> 6;
            case 11 -> 114;
            case 12 -> 157;
            case 13 -> 185;
            case 14 -> 55;
            case 15 -> 69;
            case 16 -> 254;
            case 17 -> 242;
            case 18 -> 140;
            case 19 -> 211;
            case 20 -> 224;
            case 21 -> 229;
            case 22 -> 64;
            case 23 -> 252;
            case 24 -> 188;
            case 25 -> 125;
            case 26 -> 13;
            case 27 -> 158;
            case 28 -> 119;
            case 29 -> 9;
            case 30 -> 193;
            case 31 -> 14;
            case 32 -> 95;
            case 33 -> 20;
            case 34 -> 38;
            case 35 -> 163;
            case 36 -> 103;
            case 37 -> 178;
            case 38 -> 166;
            case 39 -> 74;
            case 40 -> 192;
            case 41 -> 99;
            case 42 -> 93;
            case 43 -> 62;
            case 44 -> 110;
            case 45 -> 129;
            case 46 -> 167;
            case 47 -> 176;
            case 48 -> 60;
            case 49 -> 26;
            case 50 -> 247;
            case 51 -> 180;
            case 52 -> 1;
            case 53 -> 104;
            case 54 -> 120;
            case 55 -> 226;
            case 56 -> 115;
            case 57 -> 131;
            case 58 -> 102;
            case 59 -> 130;
            case 60 -> 137;
            case 61 -> 29;
            case 62 -> 113;
            case 63 -> 191;
            case 64 -> 65;
            case 65 -> 238;
            case 66 -> 150;
            case 67 -> 37;
            case 68 -> 189;
            case 69 -> 165;
            case 70 -> 75;
            case 71 -> 44;
            case 72 -> 132;
            case 73 -> 233;
            case 74 -> 143;
            case 75 -> 126;
            case 76 -> 147;
            case 77 -> 112;
            case 78 -> 58;
            case 79 -> 2;
            case 80 -> 179;
            case 81 -> 149;
            case 82 -> 227;
            case 83 -> 124;
            case 84 -> 81;
            case 85 -> 52;
            case 86 -> 98;
            case 87 -> 109;
            case 88 -> 12;
            case 89 -> 251;
            case 90 -> 220;
            case 91 -> 84;
            case 92 -> 210;
            case 93 -> 240;
            case 94 -> 96;
            case 95 -> 182;
            case 96 -> 50;
            case 97 -> 92;
            case 98 -> 32;
            case 99 -> 159;
            case 100 -> 134;
            case 101 -> 53;
            case 102 -> 235;
            case 103 -> 30;
            case 104 -> 39;
            case 105 -> 221;
            case 106 -> 79;
            case 107 -> 146;
            case 108 -> 136;
            case 109 -> 196;
            case 110 -> 83;
            case 111 -> 128;
            case 112 -> 139;
            case 113 -> 151;
            case 114 -> 123;
            case 115 -> 194;
            case 116 -> 122;
            case 117 -> 144;
            case 118 -> 205;
            case 119 -> 228;
            case 120 -> 248;
            case 121 -> 183;
            case 122 -> 234;
            case 123 -> 164;
            case 124 -> 168;
            case 125 -> 195;
            case 126 -> 153;
            case 127 -> 90;
            case 128 -> 61;
            case 129 -> 253;
            case 130 -> 197;
            case 131 -> 70;
            case 132 -> 223;
            case 133 -> 214;
            case 134 -> 116;
            case 135 -> 236;
            case 136 -> 198;
            case 137 -> 36;
            case 138 -> 23;
            case 139 -> 207;
            case 140 -> 66;
            case 141 -> 40;
            case 142 -> 217;
            case 143 -> 0;
            case 144 -> 245;
            case 145 -> 152;
            case 146 -> 3;
            case 147 -> 208;
            case 148 -> 76;
            case 149 -> 91;
            case 150 -> 156;
            case 151 -> 199;
            case 152 -> 86;
            case 153 -> 80;
            case 154 -> 41;
            case 155 -> 206;
            case 156 -> 35;
            case 157 -> 7;
            case 158 -> 201;
            case 159 -> 85;
            case 160 -> 25;
            case 161 -> 8;
            case 162 -> 231;
            case 163 -> 47;
            case 164 -> 117;
            case 165 -> 173;
            case 166 -> 97;
            case 167 -> 27;
            case 168 -> 71;
            case 169 -> 28;
            case 170 -> 94;
            case 171 -> 133;
            case 172 -> 87;
            case 173 -> 11;
            case 174 -> 73;
            case 175 -> 232;
            case 176 -> 88;
            case 177 -> 170;
            case 178 -> 100;
            case 179 -> 184;
            case 180 -> 162;
            case 181 -> 218;
            case 182 -> 219;
            case 183 -> 174;
            case 184 -> 172;
            case 185 -> 190;
            case 186 -> 160;
            case 187 -> 43;
            case 188 -> 72;
            case 189 -> 155;
            case 190 -> 22;
            case 191 -> 255;
            case 192 -> 17;
            case 193 -> 127;
            case 194 -> 186;
            case 195 -> 209;
            case 196 -> 4;
            case 197 -> 169;
            case 198 -> 243;
            case 199 -> 203;
            case 200 -> 222;
            case 201 -> 18;
            case 202 -> 54;
            case 203 -> 249;
            case 204 -> 141;
            case 205 -> 56;
            case 206 -> 33;
            case 207 -> 108;
            case 208 -> 49;
            case 209 -> 244;
            case 210 -> 48;
            case 211 -> 57;
            case 212 -> 175;
            case 213 -> 250;
            case 214 -> 161;
            case 215 -> 10;
            case 216 -> 215;
            case 217 -> 111;
            case 218 -> 31;
            case 219 -> 239;
            case 220 -> 82;
            case 221 -> 89;
            case 222 -> 241;
            case 223 -> 107;
            case 224 -> 142;
            case 225 -> 67;
            case 226 -> 225;
            case 227 -> 101;
            case 228 -> 24;
            case 229 -> 45;
            case 230 -> 63;
            case 231 -> 34;
            case 232 -> 212;
            case 233 -> 42;
            case 234 -> 204;
            case 235 -> 5;
            case 236 -> 213;
            case 237 -> 16;
            case 238 -> 181;
            case 239 -> 145;
            case 240 -> 230;
            case 241 -> 118;
            case 242 -> 59;
            case 243 -> 237;
            case 244 -> 77;
            case 245 -> 51;
            case 246 -> 68;
            case 247 -> 15;
            case 248 -> 148;
            case 249 -> 187;
            case 250 -> 106;
            case 251 -> 200;
            case 252 -> 105;
            case 253 -> 46;
            case 254 -> 171;
            default -> 246;
         };
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }

   public static final class PXEvMid {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public PXEvMid(Object... px) {
        }
      public PXEvMid(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private static String[] a;
      private static String[] b;

      private PXEvMid() {
      }

      public final boolean a() {
         return IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
      }

      public final void a(boolean var1) {
         IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = var1;
      }

      public final boolean b() {
         return IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
      }

      public final void b(boolean var1) {
         IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = var1;
      }

      public final void c() {
         String var1 = IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.B();
         long var2 = System.currentTimeMillis();
         long var4 = IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.s().get();
         boolean var6 = me.octo.client.lllIlIIIIllIIIIlIIIllIllIIlllIIlIIIIIIllIllllIlIIIIllIIIllIlIIIlIIllIlIllIllllIIIlIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d().ae();
         boolean var7 = !var6 && var4 > 0L && IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.t().get() > 0L && var2 - var4 <= 60000L;
         if (var7) {
            IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.u().set(var2 - IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.v().get());
         } else {
            IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.u().set(var2);
            this.t();
            this.u();
         }
         IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.s().set(0L);
         IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.v().set(0L);
         this.a(me.octo.client.lllIlIIIIllIIIIlIIIllIllIIlllIIlIIIIIIllIllllIlIIIIllIIIllIlIIIlIIllIlIllIllllIIIlIll.PXEvMid.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.a().aA());
      }

       public final void d() {
          if (this.b()) return;
          long var2 = java.lang.System.currentTimeMillis();
          long var4 = var2 - IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.u().get();
          long var6 = IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.t().get();
          if (var4 < 0) return;
          if (var6 <= 0) return;
          if (var4 < var6) {
             IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.v().set(var4);
             IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.s().set(var2);
          }
       }

      public final boolean e() {
         if (IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.w().get() == IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) return true;
         long var2 = System.currentTimeMillis();
         if (var2 - IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.u().get() <= IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.t().get()) return false;
         return this.a();
      }

      public final void a(int var1) {
         IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll
            .set(var1);
         IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI
            .set(
               IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
      }

      @JvmStatic
      public final boolean f() {
         return this.b();
      }

      @JvmStatic
       public final void g() {
          IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.u().set(java.lang.System.currentTimeMillis() - IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.y().get() - 1000L);
          net.minecraft.client.Minecraft var1 = IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.z();
          if (var1.player != null) return;
          if (var1.getConnection() != null) return;
          this.v();
          this.b(false);
       }

      public final boolean h() {
         try {
            if (IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI
                  .get()
               == IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               )
             {
               return true;
            }
         } catch (RuntimeException var1) {
            throw (RuntimeException)a(var1);
         }

         return false;
      }

      public final int i() {
         return IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll
            .get();
      }

      public final boolean j() {
         try {
            if (IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI
                  .get()
               == IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
               )
             {
               return true;
            }
         } catch (RuntimeException var1) {
            throw (RuntimeException)a(var1);
         }

         return false;
      }

      public final int k() {
         return IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll
            .get();
      }

      public final void l() {
         IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI
            .set(
               IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            );
         IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll
            .set(0);
      }

      public final boolean m() {
         String var10000 = IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.B();
         long var2 = System.currentTimeMillis();
         String var1 = var10000;

         try {
            long var6;
            int var5 = (
                     var6 = var2
                        - IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
                           .get()
                        - IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
                           .get()
                  )
                  == 0L
               ? 0
               : (var6 < 0L ? -1 : 1);
            if (var1 == null) {
               return (var5 != 0);
            }

            if (var5 > 0) {
               return (1 != 0);
            }
         } catch (RuntimeException var4) {
            throw (RuntimeException)a(var4);
         }

         return (0 != 0);
      }

      private final long a(long var1) {
         long var3 = System.currentTimeMillis();
         return var1
            - (
               var3
                  - IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
                     .get()
            );
      }

      public final long n() {
         return (long)Math.ceil(
            this.a(
                  IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
                     .get()
               )
               / 60000.0
         );
      }

      public final int o() {
         return (int)Math.ceil(
            this.a(
                  IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
                     .get()
               )
               / 60000.0
         );
      }

      public final long p() {
         return (long)Math.ceil(
            this.a(
                  IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
                     .get()
               )
               / 1000.0
         );
      }

      public final long q() {
         return IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
            .get();
      }

      public final long r() {
         return IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
            .get();
      }

      public final long s() {
         return IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
            .get();
      }

      public final void b(long param1) {
         String var3 = me.octo.client.IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.B();
         if (var3 != null && param1 != 0L) {
            me.octo.client.IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.u().addAndGet(param1);
         }
      }

      public final void t() {
         IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
            .set(
               Random.Default
                     .nextInt(
                        lllIlIIIIllIIIIlIIIllIllIIlllIIlIIIIIIllIllllIlIIIIllIIIllIlIIIlIIllIlIllIllllIIIlIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .a()
                           .Q(),
                        lllIlIIIIllIIIIlIIIllIllIIlllIIlIIIIIIllIllllIlIIIIllIIIllIlIIIlIIllIlIllIllllIIIlIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .a()
                           .R()
                     )
                  * 60000
            );
      }

      public final void u() {
         IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
            .set(
               Random.Default
                     .nextInt(
                        lllIlIIIIllIIIIlIIIllIllIIlllIIlIIIIIIllIllllIlIIIIllIIIllIlIIIlIIllIlIllIllllIIIlIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .b()
                           .Q(),
                        lllIlIIIIllIIIIlIIIllIllIIlllIIlIIIIIIllIllllIlIIIIllIIIllIlIIIlIIllIlIllIllllIIIlIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .b()
                           .R()
                     )
                  * 60000
            );
      }

      @JvmStatic
      public final void v() {
         try {
            Minecraft var10000 = Minecraft.getInstance();
            short var10002 = -1978;
            short var10003 = 5891;
            Intrinsics.checkNotNullExpressionValue(var10000, "getInstance(...)");
            Minecraft var1 = var10000;
            short var5 = -1977;
            short var10001 = 16785;
            ServerAddress var6 = ServerAddress.parseString("mc.hypixel.net:25565");
            var10002 = -1980;
            var10003 = -20739;
            Intrinsics.checkNotNullExpressionValue(var6, "parseString(...)");
            ServerAddress var2 = var6;
            var10002 = -1981;
            var10003 = 26391;
            var10003 = -1979;
            short var10004 = -5302;
            ServerData var3 = new ServerData("Hypixel", "mc.hypixel.net:25565", Type.OTHER);
            var1.execute(
               null
            );
         } catch (Exception var4) {
            throw new RuntimeException(var4);
         }
      }

      public final void a(@NotNull String param1) {
         kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "message");
         String var1 = me.octo.client.IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.B();
         net.minecraft.client.multiplayer.ClientPacketListener var2 = me.octo.client.IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.z().getConnection();
         net.minecraft.network.Connection var3 = var2 != null ? var2.getConnection() : null;
         if (var1 != null && var3 != null) {
            var3.disconnect((net.minecraft.network.chat.Component)net.minecraft.network.chat.Component.literal(param1));
         }
      }

      private static final void a(Minecraft var0, ServerAddress var1, ServerData var2) {
         TitleScreen var3 = new TitleScreen();
         JoinMultiplayerScreen var4 = new JoinMultiplayerScreen(var3);
         ConnectScreen.startConnecting(var4, var0, var1, var2, false, null);
      }

      private static Exception a(Exception var0) {
         return var0;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[6];
         int var3 = 0;
         String var2 = "Î\u009f\u0001Ø¶¼é \u000e\r¬\u0084Æ{Ö\n\u0014éÐôÖ\u000e{\u0016¢DhÄ\u0080¢/l\u008aâ»ûe\u0010\u0094s¹ûl\u0085Ø0/smç¼\u0017\u0099\u0087\u0014Ã+±©¦\u0094\u0003_æ×\u0090w(Ñ=UÈ@¾\u001a";
         int var4 = "Î\u009f\u0001Ø¶¼é \u000e\r¬\u0084Æ{Ö\n\u0014éÐôÖ\u000e{\u0016¢DhÄ\u0080¢/l\u008aâ»ûe\u0010\u0094s¹ûl\u0085Ø0/smç¼\u0017\u0099\u0087\u0014Ã+±©¦\u0094\u0003_æ×\u0090w(Ñ=UÈ@¾\u001a"
            .length();
         char var1 = 16;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 104;
            String var10001 = var2.substring(++var8, var8 + var1);
            byte var10002 = -1;

            while (true) {
               label47: {
                  char[] var24 = var10001.toCharArray();
                  int var10004 = var24.length;
                  int var6 = 0;
                  byte var27 = var10000;
                  var20 = var24;
                  int var14 = var10004;
                  byte var32;
                  char[] var36;
                  int var10006;
                  if (var10004 <= 1) {
                     var36 = var24;
                     var32 = var10000;
                     var10006 = var6;
                  } else {
                     var27 = var10000;
                     var14 = var10004;
                     if (var10004 <= var6) {
                        break label47;
                     }

                     var36 = var24;
                     var32 = var10000;
                     var10006 = var6;
                  }

                  while (true) {
                     var36[var10006] = (char)(var36[var10006] ^ var32 ^ switch (var6 % 7) {
                        case 0 -> 8;
                        case 1 -> 79;
                        case 2 -> 67;
                        case 3 -> 39;
                        case 4 -> 15;
                        case 5 -> 53;
                        default -> 108;
                     });
                     var6++;
                     if (var27 == 0) {
                        var10006 = var27;
                        var36 = var20;
                        var32 = var27;
                     } else {
                        if (var14 <= var6) {
                           break;
                        }

                        var36 = var20;
                        var32 = var27;
                        var10006 = var6;
                     }
                  }
               }

               String var29 = new String(var20).intern();
               switch (var10002) {
                  case 0:
                     var5[var3++] = var29;
                     if ((var8 += var1) >= var4) {
                        a = var5;
                        b = new String[6];
                        break pxClinit;
                     }

                     var1 = var2.charAt(var8);
                     break;
                  default:
                     var5[var3++] = var29;
                     if ((var8 += var1) < var4) {
                        var1 = var2.charAt(var8);
                        continue label52;
                     }

                     var2 = "j\u0003åMþ[#\u0007k\u00adG\u001dÐ\nÕ";
                     var4 = "j\u0003åMþ[#\u0007k\u00adG\u001dÐ\nÕ".length();
                     var1 = 7;
                     var8 = -1;
               }

               var10000 = 26;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -1978) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 112;
               case 1 -> 67;
               case 2 -> 33;
               case 3 -> 104;
               case 4 -> 13;
               case 5 -> 41;
               case 6 -> 6;
               case 7 -> 174;
               case 8 -> 101;
               case 9 -> 189;
               case 10 -> 23;
               case 11 -> 77;
               case 12 -> 201;
               case 13 -> 88;
               case 14 -> 151;
               case 15 -> 99;
               case 16 -> 168;
               case 17 -> 224;
               case 18 -> 107;
               case 19 -> 76;
               case 20 -> 103;
               case 21 -> 19;
               case 22 -> 22;
               case 23 -> 95;
               case 24 -> 127;
               case 25 -> 80;
               case 26 -> 158;
               case 27 -> 117;
               case 28 -> 150;
               case 29 -> 208;
               case 30 -> 187;
               case 31 -> 147;
               case 32 -> 75;
               case 33 -> 190;
               case 34 -> 94;
               case 35 -> 241;
               case 36 -> 159;
               case 37 -> 3;
               case 38 -> 120;
               case 39 -> 114;
               case 40 -> 236;
               case 41 -> 234;
               case 42 -> 129;
               case 43 -> 235;
               case 44 -> 141;
               case 45 -> 243;
               case 46 -> 0;
               case 47 -> 98;
               case 48 -> 27;
               case 49 -> 249;
               case 50 -> 242;
               case 51 -> 71;
               case 52 -> 56;
               case 53 -> 8;
               case 54 -> 217;
               case 55 -> 64;
               case 56 -> 54;
               case 57 -> 1;
               case 58 -> 212;
               case 59 -> 185;
               case 60 -> 148;
               case 61 -> 51;
               case 62 -> 156;
               case 63 -> 62;
               case 64 -> 137;
               case 65 -> 37;
               case 66 -> 146;
               case 67 -> 39;
               case 68 -> 178;
               case 69 -> 24;
               case 70 -> 2;
               case 71 -> 111;
               case 72 -> 149;
               case 73 -> 175;
               case 74 -> 65;
               case 75 -> 78;
               case 76 -> 30;
               case 77 -> 186;
               case 78 -> 160;
               case 79 -> 9;
               case 80 -> 10;
               case 81 -> 66;
               case 82 -> 199;
               case 83 -> 163;
               case 84 -> 250;
               case 85 -> 232;
               case 86 -> 45;
               case 87 -> 110;
               case 88 -> 209;
               case 89 -> 240;
               case 90 -> 206;
               case 91 -> 26;
               case 92 -> 90;
               case 93 -> 225;
               case 94 -> 251;
               case 95 -> 113;
               case 96 -> 18;
               case 97 -> 172;
               case 98 -> 38;
               case 99 -> 205;
               case 100 -> 198;
               case 101 -> 96;
               case 102 -> 153;
               case 103 -> 167;
               case 104 -> 170;
               case 105 -> 17;
               case 106 -> 245;
               case 107 -> 226;
               case 108 -> 34;
               case 109 -> 105;
               case 110 -> 143;
               case 111 -> 106;
               case 112 -> 139;
               case 113 -> 31;
               case 114 -> 57;
               case 115 -> 11;
               case 116 -> 152;
               case 117 -> 118;
               case 118 -> 115;
               case 119 -> 29;
               case 120 -> 69;
               case 121 -> 230;
               case 122 -> 126;
               case 123 -> 68;
               case 124 -> 219;
               case 125 -> 32;
               case 126 -> 181;
               case 127 -> 192;
               case 128 -> 177;
               case 129 -> 100;
               case 130 -> 136;
               case 131 -> 44;
               case 132 -> 182;
               case 133 -> 194;
               case 134 -> 169;
               case 135 -> 228;
               case 136 -> 73;
               case 137 -> 173;
               case 138 -> 138;
               case 139 -> 50;
               case 140 -> 134;
               case 141 -> 21;
               case 142 -> 200;
               case 143 -> 5;
               case 144 -> 130;
               case 145 -> 255;
               case 146 -> 49;
               case 147 -> 133;
               case 148 -> 48;
               case 149 -> 244;
               case 150 -> 145;
               case 151 -> 25;
               case 152 -> 91;
               case 153 -> 40;
               case 154 -> 220;
               case 155 -> 72;
               case 156 -> 109;
               case 157 -> 53;
               case 158 -> 210;
               case 159 -> 86;
               case 160 -> 79;
               case 161 -> 202;
               case 162 -> 123;
               case 163 -> 124;
               case 164 -> 93;
               case 165 -> 215;
               case 166 -> 207;
               case 167 -> 197;
               case 168 -> 142;
               case 169 -> 184;
               case 170 -> 188;
               case 171 -> 237;
               case 172 -> 116;
               case 173 -> 84;
               case 174 -> 58;
               case 175 -> 254;
               case 176 -> 60;
               case 177 -> 7;
               case 178 -> 221;
               case 179 -> 161;
               case 180 -> 144;
               case 181 -> 97;
               case 182 -> 180;
               case 183 -> 239;
               case 184 -> 204;
               case 185 -> 222;
               case 186 -> 55;
               case 187 -> 36;
               case 188 -> 92;
               case 189 -> 193;
               case 190 -> 131;
               case 191 -> 165;
               case 192 -> 63;
               case 193 -> 216;
               case 194 -> 59;
               case 195 -> 61;
               case 196 -> 191;
               case 197 -> 176;
               case 198 -> 81;
               case 199 -> 162;
               case 200 -> 20;
               case 201 -> 213;
               case 202 -> 119;
               case 203 -> 74;
               case 204 -> 132;
               case 205 -> 238;
               case 206 -> 12;
               case 207 -> 140;
               case 208 -> 83;
               case 209 -> 247;
               case 210 -> 223;
               case 211 -> 14;
               case 212 -> 211;
               case 213 -> 35;
               case 214 -> 248;
               case 215 -> 155;
               case 216 -> 4;
               case 217 -> 233;
               case 218 -> 218;
               case 219 -> 108;
               case 220 -> 157;
               case 221 -> 16;
               case 222 -> 154;
               case 223 -> 15;
               case 224 -> 122;
               case 225 -> 214;
               case 226 -> 179;
               case 227 -> 42;
               case 228 -> 195;
               case 229 -> 166;
               case 230 -> 135;
               case 231 -> 227;
               case 232 -> 82;
               case 233 -> 229;
               case 234 -> 231;
               case 235 -> 46;
               case 236 -> 28;
               case 237 -> 252;
               case 238 -> 196;
               case 239 -> 87;
               case 240 -> 85;
               case 241 -> 253;
               case 242 -> 164;
               case 243 -> 43;
               case 244 -> 121;
               case 245 -> 171;
               case 246 -> 52;
               case 247 -> 125;
               case 248 -> 183;
               case 249 -> 89;
               case 250 -> 203;
               case 251 -> 128;
               case 252 -> 47;
               case 253 -> 70;
               case 254 -> 246;
               default -> 102;
            };
            int var5 = (var1 & 0xFF) - var4;
            if (var5 < 0) {
               var5 += 256;
            }

            int var6 = ((var1 & 65535) >>> 8) - var4;
            if (var6 < 0) {
               var6 += 256;
            }

            for (int var7 = 0; var7 < var3.length; var7++) {
               int var8 = var7 % 2;
               char var10002 = var3[var7];
               if (var8 == 0) {
                  var3[var7] = (char)(var10002 ^ var5);
                  var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
               } else {
                  var3[var7] = (char)(var10002 ^ var6);
                  var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
               }
            }

            b[var2] = new String(var3).intern();
         }

         return b[var2];
      }

      private static enum IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;

         public static IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] a() {
         return (IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[])lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clone();
         }

         public static IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
            String var0
         ) {
            return Enum.valueOf(
               IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.class,
               var0
            );
         }

         @NotNull
         public static EnumEntries<IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> b() {
         return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         }

      private static final IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] c() {
         IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] var0 = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[3];
         var0[0] = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         var0[1] = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         var0[2] = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         return var0;
      }
         // $VF: Irreducible bytecode was duplicated to produce valid code
         // $VF: Failed to inline enum fields
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         private static final IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = c();
         private static final EnumEntries<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = kotlin.enums.EnumEntriesKt.enumEntries(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      }
   }

    // --- Phase A S1b: hand-written synthetic accessors/bridges (jar flags 0x1019) ---
    // javac cannot emit ACC_SYNTHETIC/ACC_BRIDGE; acceptance is descriptor-exact (name+descriptor).
    public static final java.util.concurrent.atomic.AtomicInteger A() { return lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */
    public static final boolean q() { return IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */
    public static final boolean r() { return IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */
    public static final java.util.concurrent.atomic.AtomicLong s() { return IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */
    public static final java.util.concurrent.atomic.AtomicLong t() { return IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */
    public static final java.util.concurrent.atomic.AtomicLong u() { return lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */
    public static final java.util.concurrent.atomic.AtomicLong v() { return IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */
    public static final java.util.concurrent.atomic.AtomicReference w() { return llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */
    public static final java.util.concurrent.atomic.AtomicInteger x() { return IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */
    public static final java.util.concurrent.atomic.AtomicLong y() { return llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */
    public static final net.minecraft.client.Minecraft z() { return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */
    public static final void c(boolean p0) { IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = p0; }   /* same-family gap: jar access 0x1019, absent from the S1b dispatch list */
    public static final void d(boolean p0) { IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = p0; }   /* same-family gap: jar access 0x1019, absent from the S1b dispatch list */
}
