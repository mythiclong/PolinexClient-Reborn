package me.octo.client;

import java.util.Random;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import me.octo.client.events.impl.lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.HitResult.Type;
import org.jetbrains.annotations.NotNull;

public final class lIIlIllIlIIlIIIllIIIlIlIIIlIlllIIIIlIlIllIlIIIIllIIIllIIllIIlIlllIllllllllllIIIllIlII
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static lIIlIllIlIIlIIIllIIIlIlIIIlIlllIIIIlIlIllIlIIIIllIIIllIIllIIlIlllIllllllllllIIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private final Random lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private long lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private double IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private double llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private int IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @JvmField
   @NotNull
   public static lIIlIllIlIIlIIIllIIIlIlIIIlIlllIIIIlIlIllIlIIIIllIIIllIIllIIlIlllIllllllllllIIIllIlII IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static String[] f;
   private static String[] g;

   private lIIlIllIlIIlIIIllIIIlIlIIIlIlllIIIIlIlIllIlIIIIllIIIllIIllIIlIlllIllllllllllIIIllIlII() {
      short var10001 = -26063;
      short var10002 = 2039;
      var10002 = -26064;
      short var10003 = -29864;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      short var10004 = -26061;
      short var10005 = 28784;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         IIlIlllIIlIllIIlIllIlIIllIIlIIlIllIIIIlIIlIIllIllllIllIIIlllIlIlIlIllIIIllIllIllIIIIl.a(),
         IIlIlllIIlIllIIlIllIlIIllIIlIIlIllIIIIlIIlIIllIllllIllIIIlllIlIlIlIllIIIllIllIllIIIIl.b()
      };
      super("Triggerbot", "Clicks when hovering entities.", var3, "Misc", var1);
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new Random();
   }

   @SubscribeEvent
   public final void a(@NotNull lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI var1) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = lIIlIllIlIIlIIIllIIIlIlIIIlIlllIIIIlIlIllIlIIIIllIIIllIIllIIlIlllIllllllllllIIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      short var10002 = -26059;
      short var10003 = -10442;
      Intrinsics.checkNotNullParameter(var1, "event");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      if (!var1.c()) {
         Minecraft var7 = this.ap();
         if (var2 == null) {
            if (var7.player == null) {
               return;
            }

            var7 = this.ap();
         }

         if (var2 == null) {
            if (var7.level == null) {
               return;
            }

            var7 = this.ap();
         }

         if (var2 == null) {
            if (var7.screen != null) {
               return;
            }

            var7 = this.ap();
         }

         HitResult var3 = var7.hitResult;
         if (var2 == null) {
            label47:
            if (var3 != null) {
               HitResult var8 = var3;
               if (var2 == null) {
                  if (var3.getType() != Type.ENTITY) {
                     break label47;
                  }

                  var8 = var3;
               }

               Entity var9 = ((EntityHitResult)var8).getEntity();
               var10002 = -26062;
               var10003 = -1558;
               Intrinsics.checkNotNullExpressionValue(var9, "getEntity(...)");
               Entity var4 = var9;
               if (!(var4 instanceof LivingEntity)) {
                  return;
               }

               long var5 = System.currentTimeMillis();
               if (var2 == null) {
                  if (var5 < this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll) {
                     return;
                  }

                  me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.n();
                  this.ag();
               }

               if (var2 == null) {
                  return;
               }
            }

            this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 0;
         }

         this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 0.0;
      }
   }

   private final double a(double var1, double var3) {
      double var5 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.nextDouble();
      return var3 * Math.pow(-Math.log(1.0 - var5), 1.0 / var1);
   }

   private final double b(double var1, double var3) {
      double var5 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.nextDouble();
      double var7 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.nextDouble();
      double var9 = Math.sqrt(-2.0 * Math.log(var5)) * Math.sin((Math.PI * 2) * var7);
      return var1 + var3 * var9;
   }

   private final void ag() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1;
      double var28;
      double var31;
      label43: {
         double var2 = ((me.octo.client.PXDyn)(Object)(IIlIlllIIlIllIIlIllIlIIllIIlIIlIllIIIIlIIlIIllIllllIllIIIlllIlIlIlIllIIIllIllIllIIIIl.a())).Q();
         double var4 = ((me.octo.client.PXDyn)(Object)(IIlIlllIIlIllIIlIllIlIIllIIlIIlIllIIIIlIIlIIllIllllIllIIIlllIlIlIlIllIIIllIllIllIIIIl.a())).R();
         double var6 = 1000.0 / var4;
         double var8 = 1000.0 / var2;
         this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
            + (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.nextDouble() * 0.5 + 0.3);
         double var10 = Math.sin(this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) * 0.25 + 0.75;
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = lIIlIllIlIIlIIIllIIIlIlIIIlIlllIIIIlIlIllIlIIIIllIIIllIIllIIlIlllIllllllllllIIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
         double var12 = var2 + (var4 - var2) * var10;
         double var14 = 1000.0 / var12;
         double var16 = 1.5 + this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.nextDouble() * 0.3;
         double var18 = var14 * 0.92;
         var28 = this.a(var16, var18);
         double var22 = this.b(0.0, var14 * 0.15);
         var28 += var22;
         this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
            + this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.nextDouble() * 0.002;
         var1 = var10000;
         double var34;
         int var30 = (var34 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI - 0.15) == 0.0
            ? 0
            : (var34 < 0.0 ? -1 : 1);
         if (var1 == null) {
            if (var30 > 0) {
               this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 0.0;
            }

            var28 *= 1.0 + this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
            var31 = RangesKt.coerceIn(var28, var6 * 0.7, var8 * 1.4);
            if (var1 != null) {
               break label43;
            }

            var28 = var31;
            var30 = this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
         }

         var31 = var30 > 20 ? 0.08 : 0.03;
      }

      label36: {
         double var24 = var31;
         double var35;
         int var32 = (var35 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.nextDouble() - var24) == 0.0
            ? 0
            : (var35 < 0.0 ? -1 : 1);
         if (var1 == null) {
            if (var32 < 0) {
               long var26 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.nextInt(80) + 30;
               this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = System.currentTimeMillis() + var26 + (long)var28;
               this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 0;
               if (var1 == null) {
                  break label36;
               }
            }

            this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = System.currentTimeMillis() + (long)var28;
            var32 = this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
         }

         int var29 = var32;
         this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = var29 + 1;
      }

      lIIlIllIlIIlIIIllIIIlIlIIIlIlllIIIIlIlIllIlIIIIllIIIllIIllIIlIlllIllllllllllIIIllIlII var33 = this;
      if (var1 == null) {
         if (!(this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.nextDouble() < 0.05)) {
            return;
         }

         var33 = this;
      }

      var33.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 0.0;
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      short var10001 = -26060;
      short var10002 = 18314;
      Intrinsics.checkNotNullParameter(var1, "event");
      if (((me.octo.client.PXDyn)(Object)(IIlIlllIIlIllIIlIllIlIIllIIlIIlIllIIIIlIIlIIllIllllIllIIIlllIlIlIlIllIIIllIllIllIIIIl.b())).ae()) {
         this.c(false);
      }
   }

   @Override
   public void aB() {
      this.ag();
      super.aB();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "j<{q\u0083Eàõue\u001e\u008e\u0096\u0012ý¢F\u001bT\u0015÷\u0004ØÎ9<úÌR\u0004ìj\u0085=\u008cÀÐ°ì×@\u0004â¦J^\u000eQ\"TeÑ°\u0099n4\u009eS\u001f*H";
      int var4 = "j<{q\u0083Eàõue\u001e\u008e\u0096\u0012ý¢F\u001bT\u0015÷\u0004ØÎ9<úÌR\u0004ìj\u0085=\u008cÀÐ°ì×@\u0004â¦J^\u000eQ\"TeÑ°\u0099n4\u009eS\u001f*H"
         .length();
      char var1 = '\n';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 8;
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
                     case 0 -> 119;
                     case 1 -> 23;
                     case 2 -> 102;
                     case 3 -> 70;
                     case 4 -> 10;
                     case 5 -> 68;
                     default -> 33;
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
                     f = var5;
                     g = new String[6];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lIIlIllIlIIlIIIllIIIlIlIIIlIlllIIIIlIlIllIlIIIIllIIIllIIllIIlIlllIllllllllllIIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new lIIlIllIlIIlIIIllIIIlIlIIIlIlllIIIIlIlIllIlIIIIllIIIllIIllIIlIlllIllllllllllIIIllIlII();
                     break label52;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "{i(<\u001d\u0005hTJ\u009bQ";
                  var4 = "{i(<\u001d\u0005hTJ\u009bQ".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 3;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -26063) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 170;
            case 1 -> 148;
            case 2 -> 107;
            case 3 -> 33;
            case 4 -> 37;
            case 5 -> 221;
            case 6 -> 165;
            case 7 -> 162;
            case 8 -> 117;
            case 9 -> 202;
            case 10 -> 95;
            case 11 -> 195;
            case 12 -> 223;
            case 13 -> 169;
            case 14 -> 85;
            case 15 -> 204;
            case 16 -> 13;
            case 17 -> 235;
            case 18 -> 230;
            case 19 -> 80;
            case 20 -> 45;
            case 21 -> 182;
            case 22 -> 15;
            case 23 -> 47;
            case 24 -> 34;
            case 25 -> 233;
            case 26 -> 206;
            case 27 -> 133;
            case 28 -> 17;
            case 29 -> 108;
            case 30 -> 254;
            case 31 -> 217;
            case 32 -> 73;
            case 33 -> 180;
            case 34 -> 208;
            case 35 -> 199;
            case 36 -> 5;
            case 37 -> 77;
            case 38 -> 156;
            case 39 -> 92;
            case 40 -> 10;
            case 41 -> 66;
            case 42 -> 120;
            case 43 -> 89;
            case 44 -> 90;
            case 45 -> 129;
            case 46 -> 161;
            case 47 -> 136;
            case 48 -> 142;
            case 49 -> 118;
            case 50 -> 8;
            case 51 -> 251;
            case 52 -> 185;
            case 53 -> 103;
            case 54 -> 144;
            case 55 -> 192;
            case 56 -> 240;
            case 57 -> 186;
            case 58 -> 71;
            case 59 -> 32;
            case 60 -> 59;
            case 61 -> 207;
            case 62 -> 9;
            case 63 -> 56;
            case 64 -> 211;
            case 65 -> 102;
            case 66 -> 194;
            case 67 -> 23;
            case 68 -> 86;
            case 69 -> 83;
            case 70 -> 212;
            case 71 -> 196;
            case 72 -> 250;
            case 73 -> 173;
            case 74 -> 243;
            case 75 -> 62;
            case 76 -> 53;
            case 77 -> 222;
            case 78 -> 20;
            case 79 -> 237;
            case 80 -> 244;
            case 81 -> 43;
            case 82 -> 14;
            case 83 -> 138;
            case 84 -> 188;
            case 85 -> 147;
            case 86 -> 225;
            case 87 -> 39;
            case 88 -> 151;
            case 89 -> 228;
            case 90 -> 252;
            case 91 -> 241;
            case 92 -> 135;
            case 93 -> 184;
            case 94 -> 198;
            case 95 -> 227;
            case 96 -> 209;
            case 97 -> 31;
            case 98 -> 48;
            case 99 -> 74;
            case 100 -> 139;
            case 101 -> 159;
            case 102 -> 143;
            case 103 -> 29;
            case 104 -> 19;
            case 105 -> 201;
            case 106 -> 25;
            case 107 -> 181;
            case 108 -> 193;
            case 109 -> 65;
            case 110 -> 79;
            case 111 -> 91;
            case 112 -> 76;
            case 113 -> 145;
            case 114 -> 7;
            case 115 -> 176;
            case 116 -> 81;
            case 117 -> 229;
            case 118 -> 106;
            case 119 -> 50;
            case 120 -> 51;
            case 121 -> 112;
            case 122 -> 167;
            case 123 -> 57;
            case 124 -> 93;
            case 125 -> 99;
            case 126 -> 149;
            case 127 -> 247;
            case 128 -> 98;
            case 129 -> 21;
            case 130 -> 44;
            case 131 -> 153;
            case 132 -> 205;
            case 133 -> 246;
            case 134 -> 128;
            case 135 -> 123;
            case 136 -> 164;
            case 137 -> 163;
            case 138 -> 125;
            case 139 -> 55;
            case 140 -> 22;
            case 141 -> 234;
            case 142 -> 152;
            case 143 -> 87;
            case 144 -> 232;
            case 145 -> 126;
            case 146 -> 200;
            case 147 -> 42;
            case 148 -> 178;
            case 149 -> 61;
            case 150 -> 213;
            case 151 -> 72;
            case 152 -> 132;
            case 153 -> 36;
            case 154 -> 210;
            case 155 -> 6;
            case 156 -> 146;
            case 157 -> 160;
            case 158 -> 30;
            case 159 -> 124;
            case 160 -> 70;
            case 161 -> 97;
            case 162 -> 16;
            case 163 -> 158;
            case 164 -> 155;
            case 165 -> 69;
            case 166 -> 171;
            case 167 -> 218;
            case 168 -> 35;
            case 169 -> 154;
            case 170 -> 2;
            case 171 -> 255;
            case 172 -> 245;
            case 173 -> 24;
            case 174 -> 78;
            case 175 -> 88;
            case 176 -> 11;
            case 177 -> 105;
            case 178 -> 64;
            case 179 -> 140;
            case 180 -> 249;
            case 181 -> 226;
            case 182 -> 203;
            case 183 -> 96;
            case 184 -> 248;
            case 185 -> 183;
            case 186 -> 28;
            case 187 -> 174;
            case 188 -> 63;
            case 189 -> 109;
            case 190 -> 122;
            case 191 -> 236;
            case 192 -> 134;
            case 193 -> 38;
            case 194 -> 0;
            case 195 -> 215;
            case 196 -> 82;
            case 197 -> 1;
            case 198 -> 18;
            case 199 -> 68;
            case 200 -> 239;
            case 201 -> 187;
            case 202 -> 141;
            case 203 -> 114;
            case 204 -> 104;
            case 205 -> 172;
            case 206 -> 119;
            case 207 -> 121;
            case 208 -> 238;
            case 209 -> 101;
            case 210 -> 58;
            case 211 -> 177;
            case 212 -> 94;
            case 213 -> 131;
            case 214 -> 3;
            case 215 -> 110;
            case 216 -> 84;
            case 217 -> 67;
            case 218 -> 197;
            case 219 -> 4;
            case 220 -> 130;
            case 221 -> 220;
            case 222 -> 116;
            case 223 -> 115;
            case 224 -> 242;
            case 225 -> 41;
            case 226 -> 157;
            case 227 -> 111;
            case 228 -> 179;
            case 229 -> 12;
            case 230 -> 127;
            case 231 -> 190;
            case 232 -> 54;
            case 233 -> 191;
            case 234 -> 231;
            case 235 -> 27;
            case 236 -> 175;
            case 237 -> 214;
            case 238 -> 100;
            case 239 -> 150;
            case 240 -> 46;
            case 241 -> 166;
            case 242 -> 219;
            case 243 -> 113;
            case 244 -> 60;
            case 245 -> 137;
            case 246 -> 216;
            case 247 -> 75;
            case 248 -> 49;
            case 249 -> 253;
            case 250 -> 224;
            case 251 -> 168;
            case 252 -> 26;
            case 253 -> 189;
            case 254 -> 40;
            default -> 52;
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

         g[var2] = new String(var3).intern();
      }

      return g[var2];
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private static me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      public static void b(me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var0) {
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var0;
      }

      public static me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] b() {
         return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      static {
         if (b() != null) {
            b(new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[4]);
         }
      }
   }
}
