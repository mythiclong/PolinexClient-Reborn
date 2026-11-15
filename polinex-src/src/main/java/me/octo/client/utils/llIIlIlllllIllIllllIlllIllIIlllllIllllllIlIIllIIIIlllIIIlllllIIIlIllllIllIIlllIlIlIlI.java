package me.octo.client.utils;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI
   implements me.octo.client.lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI {
   @NotNull
   public static llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @Nullable
   private ClientLevel lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static Minecraft IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;

   @Nullable
   protected final ClientLevel b() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   protected final void a(@Nullable ClientLevel var1) {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
   }

   public boolean a(int var1, int var2) {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.level;
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII != null;
   }

   public boolean a(int var1, int var2, int var3) {
      int var10000 = c();
      BlockPos var5 = new BlockPos(var1, var2, var3);
      int var4 = var10000;
      if (var4 != 0 && this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII != null) {
         BlockState var6 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getBlockState(var5);
         if (var6 != null) {
            return var6.isSolidRender();
         }
      }

      return false;
   }

   public void a() {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = null;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      if (d() != 0) {
         b(111);
      }

      char[] var10003 = "\u001a\u001a(eZ\u001cn\u001c\u0011?I\u001cA4SV".toCharArray();
      int var10004 = var10003.length;
      int var1 = 0;
      byte var9 = 122;
      char[] var10002 = var10003;
      int var4 = var10004;
      char[] var13;
      byte var17;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var13 = var10003;
         var10005 = var1;
         char var10008 = var10003[var1];
         var10007 = 122;
         var10006 = var10008;
         switch (var1 % 7) {
            case 0:
               var17 = 7;
               break;
            case 1:
               var17 = 5;
               break;
            case 2:
               var17 = 38;
               break;
            case 3:
               var17 = 86;
               break;
            case 4:
               var17 = 78;
               break;
            case 5:
               var17 = 21;
               break;
            default:
               var17 = 96;
         }
      } else {
         var9 = 122;
         var4 = var10004;
         if (var10004 <= var1) {
            String var12 = new String(var10003).intern();
            byte var7 = -1;
            String var2 = var12;
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               (kotlin.jvm.internal.DefaultConstructorMarker) null
            );
            Minecraft var3 = Minecraft.getInstance();
            Intrinsics.checkNotNullExpressionValue(var3, var2);
            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
            break pxClinit; // PX-FIX
         }

         var13 = var10003;
         var10005 = var1;
         char var18 = var10003[var1];
         var10007 = 122;
         var10006 = var18;
         switch (var1 % 7) {
            case 0:
               var17 = 7;
               break;
            case 1:
               var17 = 5;
               break;
            case 2:
               var17 = 38;
               break;
            case 3:
               var17 = 86;
               break;
            case 4:
               var17 = 78;
               break;
            case 5:
               var17 = 21;
               break;
            default:
               var17 = 96;
         }
      }

      while (true) {
         var13[var10005] = (char)(var10006 ^ var10007 ^ var17);
         var1++;
         if (var9 == 0) {
            var13 = var10002;
            var10005 = var9;
            char var20 = var10002[var9];
            var10007 = var9;
            var10006 = var20;
            switch (var1 % 7) {
               case 0:
                  var17 = 7;
                  break;
               case 1:
                  var17 = 5;
                  break;
               case 2:
                  var17 = 38;
                  break;
               case 3:
                  var17 = 86;
                  break;
               case 4:
                  var17 = 78;
                  break;
               case 5:
                  var17 = 21;
                  break;
               default:
                  var17 = 96;
            }
         } else {
            if (var4 <= var1) {
               String var11 = new String(var10002).intern();
               byte var6 = -1;
               String var0 = var11;
               IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                  (kotlin.jvm.internal.DefaultConstructorMarker) null
               );
               Minecraft var10000 = Minecraft.getInstance();
               Intrinsics.checkNotNullExpressionValue(var10000, var0);
               IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var10000;
               break pxClinit; // PX-FIX
            }

            var13 = var10002;
            var10005 = var1;
            char var19 = var10002[var1];
            var10007 = var9;
            var10006 = var19;
            switch (var1 % 7) {
               case 0:
                  var17 = 7;
                  break;
               case 1:
                  var17 = 5;
                  break;
               case 2:
                  var17 = 38;
                  break;
               case 3:
                  var17 = 86;
                  break;
               case 4:
                  var17 = 78;
                  break;
               case 5:
                  var17 = 21;
                  break;
               default:
                  var17 = 96;
            }
         }
      }
   } // PX-FIX end pxClinit
   }

   public static void b(int var0) {
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var0;
   }

   public static int c() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   public static int d() {
      int var0 = c();
      return var0 == 0 ? 43 : 0;
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker pxMarker) {
           this();
        }


      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }
}
