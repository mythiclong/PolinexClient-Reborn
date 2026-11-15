package me.octo.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import me.octo.client.events.impl.lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import org.jetbrains.annotations.NotNull;

public final class IlllIIIIIIlIlIlllIIIIIlIlIlllIIIlIlIIIIIIIlllIIlIllIllIllIlIllllIlIIIlIIlIIlllllIIlIl
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static IlllIIIIIIlIlIlllIIIIIlIlIlllIIIlIlIIIIIIIlllIIlIllIllIllIlIllllIlIIIlIIlIIlllllIIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private final HashMap<BlockPos, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll> lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private int lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @JvmField
   @NotNull
   public static IlllIIIIIIlIlIlllIIIIIlIlIlllIIIlIlIIIIIIIlllIIlIllIllIllIlIllllIlIIIlIIlIIlllllIIlIl IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static String[] f;
   private static String[] g;

   private IlllIIIIIIlIlIlllIIIIIlIlIlllIIIlIlIIIIIIIlllIIlIllIllIllIlIllllIlIIIlIIlIIlllllIIlIl() {
      short var10001 = 4167;
      short var10002 = -25042;
      var10002 = 4160;
      short var10003 = 29233;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      short var10004 = 4165;
      short var10005 = 17313;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         IIIlIIIIIlllIlllllllIlIlIllllIlIlIIllIllIIIIIlIlIlIlIIlIllIlIIlIlIIIllIllIlIlIllIIlll.a(),
         IIIlIIIIIlllIlllllllIlIlIllllIlIlIIllIllIIIIIlIlIlIlIIlIllIlIIlIlIIIllIllIlIlIllIIlll.b(),
         IIIlIIIIIlllIlllllllIlIlIllllIlIlIIllIllIIIIIlIlIlIlIIlIllIlIIlIlIIIllIllIlIlIllIIlll.c()
      };
      super("Gemstone ESP", "Shows an ESP on gemstones.", var3, "Crystal Hollows", var1);
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new HashMap<>();
   }

   @SubscribeEvent
   public final void a(@NotNull lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI var1) {
      int[] var10000 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      Intrinsics.checkNotNullParameter(var1, "e");
      int[] var2 = var10000;
      if (me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m()) {
         if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g()
            == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
            )
          {
            int var5 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
               % ((me.octo.client.PXDyn)(Object)(IIIlIIIIIlllIlllllllIlIlIllllIlIlIIllIllIIIIIlIlIlIlIIlIllIlIIlIlIIIllIllIlIlIllIIlll.c())).<Integer>M();
            if (var2 != null) {
               if (var5 == 0) {
                  me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl var6 = me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  BlockPos var10001 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .r();
                  int var10002 = ((me.octo.client.PXDyn)(Object)(IIIlIIIIIlllIlllllllIlIlIllllIlIlIIllIllIIIIIlIlIlIlIIlIllIlIIlIlIIIllIllIlIlIllIIlll.b())).M();
                  lIlIlIlIlllIlIlIllIIIllIIIllIIlIlIlIllllIIlIlIIIIIIIIlIIlIlIlIllllllIllllIIIlIIIIIlII var10003 = IIIlIIIIIlllIlllllllIlIlIllllIlIlIIllIllIIIIIlIlIlIlIIlIllIlIIlIlIIIllIllIlIlIllIIlll.a();
                  short var10004 = 4166;
                  short var10005 = -3831;
                  boolean var7 = var10003.b("Topaz");
                  lIlIlIlIlllIlIlIllIIIllIIIllIIlIlIlIllllIIlIlIIIIIIIIlIIlIlIlIllllllIllllIIIlIIIIIlII var8 = IIIlIIIIIlllIlllllllIlIlIllllIlIlIIllIllIIIIIlIlIlIlIIlIllIlIIlIlIIIllIllIlIlIllIIlll.a();
                  var10005 = 4174;
                  short var10006 = 32332;
                  boolean var9 = var8.b("Amber");
                  lIlIlIlIlllIlIlIllIIIllIIIllIIlIlIlIllllIIlIlIIIIIIIIlIIlIlIlIllllllIllllIIIlIIIIIlII var11 = IIIlIIIIIlllIlllllllIlIlIllllIlIlIIllIllIIIIIlIlIlIlIIlIllIlIIlIlIIIllIllIlIlIllIIlll.a();
                  var10006 = 4161;
                  short var10007 = 19998;
                  boolean var12 = var11.b("Sapphire");
                  lIlIlIlIlllIlIlIllIIIllIIIllIIlIlIlIllllIIlIlIIIIIIIIlIIlIlIlIllllllIllllIIIlIIIIIlII var14 = IIIlIIIIIlllIlllllllIlIlIllllIlIlIIllIllIIIIIlIlIlIlIIlIllIlIIlIlIIIllIllIlIlIllIIlll.a();
                  var10007 = 4164;
                  short var10008 = 25141;
                  boolean var15 = var14.b("Jade");
                  lIlIlIlIlllIlIlIllIIIllIIIllIIlIlIlIllllIIlIlIIIIIIIIlIIlIlIlIllllllIllllIIIlIIIIIlII var17 = IIIlIIIIIlllIlllllllIlIlIllllIlIlIIllIllIIIIIlIlIlIlIIlIllIlIIlIlIIIllIllIlIlIllIIlll.a();
                  var10008 = 4175;
                  short var10009 = -15506;
                  boolean var18 = var17.b("Amethyst");
                  lIlIlIlIlllIlIlIllIIIllIIIllIIlIlIlIllllIIlIlIIIIIIIIlIIlIlIlIllllllIllllIIIlIIIIIlII var20 = IIIlIIIIIlllIlllllllIlIlIllllIlIlIIllIllIIIIIlIlIlIlIIlIllIlIIlIlIIIllIllIlIlIllIIlll.a();
                  var10009 = 4162;
                  short var10010 = -18525;
                  boolean var21 = var20.b("Jasper");
                  lIlIlIlIlllIlIlIllIIIllIIIllIIlIlIlIllllIIlIlIIIIIIIIlIIlIlIlIllllllIllllIIIlIIIIIlII var23 = IIIlIIIIIlllIlllllllIlIlIllllIlIlIIllIllIIIIIlIlIlIlIIlIllIlIIlIlIIIllIllIlIlIllIIlll.a();
                  var10010 = 4163;
                  short var10011 = -1044;
                  Map var3 = var6.a(var10001, var10002, var7, var9, var12, var15, var18, var21, var23.b("Ruby"));
                  this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.clear();
                  this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.putAll(var3);
               }

               var5 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
            }

            int var4 = var5;
            this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var4 + 1;
         }
      }
   }

   @SubscribeEvent(
      priority = EventPriority.HIGH
   )
   public final void a(@NotNull me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var1) {
      int[] var10000 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      Intrinsics.checkNotNullParameter(var1, "e");
      int[] var2 = var10000;
      if (me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m()) {
         if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g()
            == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
            )
          {
            IlllIIIIIIlIlIlllIIIIIlIlIlllIIIlIlIIIIIIIlllIIlIllIllIllIlIllllIlIIIlIIlIIlllllIIlIl var24 = this;
            if (var2 != null) {
               if (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.isEmpty()) {
                  return;
               }

               var24 = this;
            }

            LocalPlayer var25 = var24.ap().player;
            if (var25 != null) {
               LocalPlayer var3 = var25;
               double var4 = var3.getX();
               double var6 = var3.getY() + var3.getEyeHeight();
               double var8 = var3.getZ();
               int var13 = ((me.octo.client.PXDyn)(Object)(IIIlIIIIIlllIlllllllIlIlIllllIlIlIIllIllIIIIIlIlIlIlIIlIllIlIIlIlIIIllIllIlIlIllIIlll.b())).M();
               boolean var14 = false;
               double var10 = var13 * var13;

               for (Entry var22 : this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.entrySet()) {
                  BlockPos var23 = (BlockPos)var22.getKey();
                  me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var15 = (me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll)var22.getValue();
                  double var16 = var23.getX() + 0.5 - var4;
                  double var18 = var23.getY() + 0.5 - var6;
                  double var20 = var23.getZ() + 0.5 - var8;
                  if (var2 != null) {
                     if (var16 * var16 + var18 * var18 + var20 * var20 > var10) {
                        continue;
                     }

                     IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a(
                        var23,
                        null,
                        new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(var15.o()),
                        1.5F,
                        null,
                        null,
                        0.0F,
                        false,
                        0.0F);
                  }

                  if (var2 == null) {
                     break;
                  }
               }
            }
         }
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      Intrinsics.checkNotNullParameter(var1, "e");
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.clear();
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 0;
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI var1) {
      int[] var10000 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      Intrinsics.checkNotNullParameter(var1, "e");
      int[] var2 = var10000;
      boolean var5 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m();
      if (var2 != null) {
         if (!var5) {
            return;
         }

         var5 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.isEmpty();
      }

      if (var2 != null) {
         var5 = !var5;
      }

      if (var5) {
         Map var3 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         BlockPos var4 = var1.k();
         TypeIntrinsics.asMutableMap(var3).remove(var4);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[10];
      int var3 = 0;
      String var2 = "S[äà<\f\u008c%sv~9Ðöqr1W\u0004R\u0011\rb\u000f×\u0013\u0088E\u0097Qïq¼EÒâQAí\u0006ãç,©Y¼\u0004Âï\u00027\u001aè\u0089kK8UðÖ\u009b\u001cl\u009a\u0011í^÷/×§ÅËü\u0005X\u0018H\b¥¼ÝÂ\tÊ½N";
      int var4 = "S[äà<\f\u008c%sv~9Ðöqr1W\u0004R\u0011\rb\u000f×\u0013\u0088E\u0097Qïq¼EÒâQAí\u0006ãç,©Y¼\u0004Âï\u00027\u001aè\u0089kK8UðÖ\u009b\u001cl\u009a\u0011í^÷/×§ÅËü\u0005X\u0018H\b¥¼ÝÂ\tÊ½N"
         .length();
      char var1 = 5;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 28;
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
                     case 0 -> 47;
                     case 1 -> 52;
                     case 2 -> 90;
                     case 3 -> 113;
                     case 4 -> 112;
                     case 5 -> 52;
                     default -> 26;
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
                     g = new String[10];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IlllIIIIIIlIlIlllIIIIIlIlIlllIIIlIlIIIIIIIlllIIlIllIllIllIlIllllIlIIIlIIlIIlllllIIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new IlllIIIIIIlIlIlllIIIIIlIlIlllIIIlIlIIIIIIIlllIIlIllIllIllIlIllllIlIIIlIIlIIlllllIIlIl();
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

                  var2 = "Ü½*à'\b¬@#NûUx$";
                  var4 = "Ü½*à'\b¬@#NûUx$".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 33;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 4166) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 35;
            case 1 -> 251;
            case 2 -> 58;
            case 3 -> 24;
            case 4 -> 240;
            case 5 -> 66;
            case 6 -> 189;
            case 7 -> 239;
            case 8 -> 33;
            case 9 -> 238;
            case 10 -> 231;
            case 11 -> 144;
            case 12 -> 153;
            case 13 -> 12;
            case 14 -> 75;
            case 15 -> 71;
            case 16 -> 134;
            case 17 -> 188;
            case 18 -> 166;
            case 19 -> 103;
            case 20 -> 64;
            case 21 -> 141;
            case 22 -> 206;
            case 23 -> 34;
            case 24 -> 25;
            case 25 -> 13;
            case 26 -> 37;
            case 27 -> 31;
            case 28 -> 140;
            case 29 -> 125;
            case 30 -> 200;
            case 31 -> 194;
            case 32 -> 85;
            case 33 -> 101;
            case 34 -> 42;
            case 35 -> 168;
            case 36 -> 167;
            case 37 -> 82;
            case 38 -> 252;
            case 39 -> 247;
            case 40 -> 23;
            case 41 -> 138;
            case 42 -> 211;
            case 43 -> 133;
            case 44 -> 174;
            case 45 -> 131;
            case 46 -> 152;
            case 47 -> 45;
            case 48 -> 76;
            case 49 -> 181;
            case 50 -> 100;
            case 51 -> 68;
            case 52 -> 109;
            case 53 -> 38;
            case 54 -> 86;
            case 55 -> 14;
            case 56 -> 191;
            case 57 -> 162;
            case 58 -> 254;
            case 59 -> 150;
            case 60 -> 102;
            case 61 -> 53;
            case 62 -> 65;
            case 63 -> 217;
            case 64 -> 155;
            case 65 -> 132;
            case 66 -> 145;
            case 67 -> 104;
            case 68 -> 77;
            case 69 -> 187;
            case 70 -> 172;
            case 71 -> 50;
            case 72 -> 79;
            case 73 -> 29;
            case 74 -> 6;
            case 75 -> 176;
            case 76 -> 114;
            case 77 -> 156;
            case 78 -> 41;
            case 79 -> 173;
            case 80 -> 3;
            case 81 -> 108;
            case 82 -> 120;
            case 83 -> 127;
            case 84 -> 205;
            case 85 -> 214;
            case 86 -> 204;
            case 87 -> 233;
            case 88 -> 219;
            case 89 -> 123;
            case 90 -> 158;
            case 91 -> 27;
            case 92 -> 5;
            case 93 -> 244;
            case 94 -> 80;
            case 95 -> 121;
            case 96 -> 213;
            case 97 -> 10;
            case 98 -> 241;
            case 99 -> 210;
            case 100 -> 105;
            case 101 -> 202;
            case 102 -> 63;
            case 103 -> 119;
            case 104 -> 183;
            case 105 -> 52;
            case 106 -> 160;
            case 107 -> 20;
            case 108 -> 242;
            case 109 -> 18;
            case 110 -> 179;
            case 111 -> 197;
            case 112 -> 48;
            case 113 -> 142;
            case 114 -> 230;
            case 115 -> 95;
            case 116 -> 91;
            case 117 -> 7;
            case 118 -> 157;
            case 119 -> 69;
            case 120 -> 21;
            case 121 -> 223;
            case 122 -> 154;
            case 123 -> 57;
            case 124 -> 225;
            case 125 -> 55;
            case 126 -> 122;
            case 127 -> 67;
            case 128 -> 149;
            case 129 -> 15;
            case 130 -> 99;
            case 131 -> 201;
            case 132 -> 129;
            case 133 -> 221;
            case 134 -> 61;
            case 135 -> 84;
            case 136 -> 137;
            case 137 -> 30;
            case 138 -> 36;
            case 139 -> 148;
            case 140 -> 92;
            case 141 -> 182;
            case 142 -> 143;
            case 143 -> 203;
            case 144 -> 246;
            case 145 -> 56;
            case 146 -> 44;
            case 147 -> 130;
            case 148 -> 186;
            case 149 -> 26;
            case 150 -> 89;
            case 151 -> 228;
            case 152 -> 232;
            case 153 -> 215;
            case 154 -> 135;
            case 155 -> 253;
            case 156 -> 93;
            case 157 -> 192;
            case 158 -> 83;
            case 159 -> 74;
            case 160 -> 72;
            case 161 -> 78;
            case 162 -> 139;
            case 163 -> 70;
            case 164 -> 59;
            case 165 -> 207;
            case 166 -> 243;
            case 167 -> 90;
            case 168 -> 146;
            case 169 -> 39;
            case 170 -> 226;
            case 171 -> 88;
            case 172 -> 62;
            case 173 -> 117;
            case 174 -> 224;
            case 175 -> 40;
            case 176 -> 177;
            case 177 -> 147;
            case 178 -> 136;
            case 179 -> 124;
            case 180 -> 115;
            case 181 -> 60;
            case 182 -> 237;
            case 183 -> 196;
            case 184 -> 81;
            case 185 -> 198;
            case 186 -> 116;
            case 187 -> 175;
            case 188 -> 106;
            case 189 -> 193;
            case 190 -> 234;
            case 191 -> 54;
            case 192 -> 1;
            case 193 -> 22;
            case 194 -> 190;
            case 195 -> 47;
            case 196 -> 43;
            case 197 -> 164;
            case 198 -> 97;
            case 199 -> 16;
            case 200 -> 17;
            case 201 -> 218;
            case 202 -> 49;
            case 203 -> 255;
            case 204 -> 113;
            case 205 -> 236;
            case 206 -> 208;
            case 207 -> 111;
            case 208 -> 9;
            case 209 -> 151;
            case 210 -> 185;
            case 211 -> 46;
            case 212 -> 8;
            case 213 -> 107;
            case 214 -> 51;
            case 215 -> 128;
            case 216 -> 199;
            case 217 -> 209;
            case 218 -> 118;
            case 219 -> 169;
            case 220 -> 180;
            case 221 -> 195;
            case 222 -> 171;
            case 223 -> 178;
            case 224 -> 96;
            case 225 -> 87;
            case 226 -> 229;
            case 227 -> 170;
            case 228 -> 250;
            case 229 -> 112;
            case 230 -> 220;
            case 231 -> 0;
            case 232 -> 227;
            case 233 -> 222;
            case 234 -> 94;
            case 235 -> 2;
            case 236 -> 184;
            case 237 -> 11;
            case 238 -> 235;
            case 239 -> 32;
            case 240 -> 248;
            case 241 -> 73;
            case 242 -> 28;
            case 243 -> 165;
            case 244 -> 159;
            case 245 -> 110;
            case 246 -> 216;
            case 247 -> 245;
            case 248 -> 19;
            case 249 -> 126;
            case 250 -> 212;
            case 251 -> 98;
            case 252 -> 161;
            case 253 -> 249;
            case 254 -> 163;
            default -> 4;
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

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }
}
