package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class IIlIIIllllIlIllIIIlIllIIllllllIIlIlllIllIIIlIlIlIllIIllIllllIIllIIIlIIIlIlIllIlIllllI {
   private static String a;

   @NotNull
   public static final BlockPos a(@NotNull Vec3 var0) {
      int[] var10000 = me.octo.client.lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      Intrinsics.checkNotNullParameter(var0, a);
      double var2 = var0.x;
      double var4 = var0.y;
      double var6 = var0.z;
      float var8 = a(Math.abs((float)(var2 - (int)var2)));
      float var9 = a(Math.abs((float)(var6 - (int)var6)));
      int[] var1 = var10000;
      float var15;
      int var10 = (var15 = var8 - 0.9F) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
      if (var1 != null) {
         var10 = (((var10 == 0) ? 1 : 0));
      }

      BlockPos var11;
      if ((var10 != 0)) {
         var11 = new BlockPos((int)var2 + 1, (int)var4, (int)var6);
      } else {
         float var16;
         int var12 = (var16 = var8 - 0.1F) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1);
         if (var1 != null) {
            var12 = (((var12 == 0) ? 1 : 0));
         }

         if ((var12 != 0)) {
            var11 = new BlockPos((int)var2 - 1, (int)var4, (int)var6);
         } else {
            float var17;
            int var13 = (var17 = var9 - 0.9F) == 0.0F ? 0 : (var17 < 0.0F ? -1 : 1);
            if (var1 != null) {
               var13 = (((var13 == 0) ? 1 : 0));
            }

            if ((var13 != 0)) {
               var11 = new BlockPos((int)var2, (int)var4, (int)var6 + 1);
            } else {
               float var18;
               int var14 = (var18 = var9 - 0.1F) == 0.0F ? 0 : (var18 < 0.0F ? -1 : 1);
               if (var1 != null) {
                  var14 = (((var14 == 0) ? 1 : 0));
               }

               var11 =(( (var14 != 0) ? new BlockPos((int)var2, (int)var4, (int)var6 - 1) : new BlockPos((int)var2, (int)var4, (int)var6)));
            }
         }
      }

      if (var1 == null) {
         lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[1]
         );
      }

      return var11;
   }

   private static final boolean b(Vec3 param0) {
      int[] var1 = me.octo.client.lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();

      try {
         double var2 = param0.x;
         double var4 = param0.z;
         float var6 = a(Math.abs((float)(var2 - (int)var2)));
         float var7 = a(Math.abs((float)(var4 - (int)var4)));
         float var8;
         int var9 = (var8 = var6 - 0.1F) == 0.0F ? 0 : (var8 < 0.0F ? -1 : 1);
         if (var1 != null) {
            var9 = ((var9 == 0) ? 1 : 0);
         }
         if (var9 != 0) {
            return true;
         }
         float var10;
         int var11 = (var10 = var6 - 0.9F) == 0.0F ? 0 : (var10 < 0.0F ? -1 : 1);
         if (var1 != null) {
            var11 = ((var11 == 0) ? 1 : 0);
         }
         if (var11 != 0) {
            return true;
         }
         float var12;
         int var13 = (var12 = var7 - 0.1F) == 0.0F ? 0 : (var12 < 0.0F ? -1 : 1);
         if (var1 != null) {
            var13 = ((var13 == 0) ? 1 : 0);
         }
         if (var13 != 0) {
            return true;
         }
         float var14;
         int var15 = (var14 = var7 - 0.9F) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
         if (var1 != null) {
            var15 = ((var15 == 0) ? 1 : 0);
         }
         if (var15 != 0) {
            return true;
         }
         return false;
      } catch (Exception var5) {
         return false;
      }
   }

   private static final float a(float var0) {
      float var1;
      try {
         var1 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .d(var0 * 10000)
            / 10000.0F;
      } catch (Exception var3) {
         var1 = 0.0F;
      }

      return var1;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: {
      char[] var10003 = "eIB0#T\u0004px_7".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 16;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 16;
         var10006 = var0;
      } else {
         var6 = 16;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            break pxClinit;
         }

         var10005 = var10003;
         var10 = 16;
         var10006 = var0;
      }

      while (true) {
         var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
            case 0 -> 5;
            case 1 -> 56;
            case 2 -> 32;
            case 3 -> 84;
            case 4 -> 90;
            case 5 -> 39;
            default -> 120;
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
               break pxClinit;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}

  // PX-FIX synth restored from jar bytecode
  // PX-FIX synth restored from jar bytecode: synthetic single-arg bridge
  public static boolean c(net.minecraft.world.phys.Vec3 p0) { return b(p0); }
}
