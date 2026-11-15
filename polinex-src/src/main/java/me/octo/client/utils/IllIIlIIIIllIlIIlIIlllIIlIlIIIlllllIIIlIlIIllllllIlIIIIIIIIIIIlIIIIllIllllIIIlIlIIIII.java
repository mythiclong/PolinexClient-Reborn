package me.octo.client.utils;

import com.mojang.blaze3d.vertex.VertexConsumer;
import java.lang.reflect.Constructor;
import org.jetbrains.annotations.Nullable;

public final class IllIIlIIIIllIlIIlIIlllIIlIlIIIlllllIIIlIlIIllllllIlIIIIIIIIIIIlIIIIllIllllIIIlIlIIIII {
   private static Constructor<?> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

   private IllIIlIIIIllIlIIlIIlllIIlIlIIIlllllIIIlIlIIllllllIlIIIIIIIIIIIlIIIIllIllllIIIlIlIIIII() {
   }

   @Nullable
   public static VertexConsumer a(VertexConsumer param0, int param1) {
      Object constructor;
      block6: {
         int[] nArray = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
         constructor = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (nArray == null) return (VertexConsumer)constructor;
         try {
            if (constructor != null) break block6;
            return param0;
         }
         catch (Throwable throwable) {
            throw (RuntimeException)IllIIlIIIIllIlIIlIIlllIIlIlIIIlllllIIIlIlIIllllllIlIIIIIIIIIIIlIIIIllIllllIIIlIlIIIII.a(throwable);
         }
      }
      try {
         constructor = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.newInstance(param0, param1);
         return (VertexConsumer)constructor;
      }
      catch (Throwable throwable) {
         return param0;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: {
      char[] var10003 = "L\u0005xXm\r+G\u0003~\u0017f\u0010kA\fe\u0013n\u0010kP\u0005b\u0012e\u0016 PNC\u0003t\b,L\u0005N\u0003f\u0002 P3c\u0003r\u0007 \u0006%b\u0002i\u0010<m\u0015x\u001ai\n e\u0005b\u0013r\u00051M\u0012"
         .toCharArray();
      int var10004 = var10003.length;
      int var1 = 0;
      byte var14 = 2;
      char[] var10002 = var10003;
      int var9 = var10004;
      char[] var18;
      byte var22;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var18 = var10003;
         var10005 = var1;
         char var10008 = var10003[var1];
         var10007 = 2;
         var10006 = var10008;
         switch (var1 % 7) {
            case 0:
               var22 = 32;
               break;
            case 1:
               var22 = 98;
               break;
            case 2:
               var22 = 14;
               break;
            case 3:
               var22 = 116;
               break;
            case 4:
               var22 = 2;
               break;
            case 5:
               var22 = 102;
               break;
            default:
               var22 = 71;
         }
      } else {
         var14 = 2;
         var9 = var10004;
         if (var10004 <= var1) {
            String var17 = new String(var10003).intern();
            byte var12 = -1;
            String var6 = var17;

            Constructor var7;
            try {
               Class var8 = Class.forName(var6);
               var7 = var8.getDeclaredConstructor(VertexConsumer.class, int.class);
               var7.setAccessible(true);
            } catch (Throwable var5) {
               var7 = null;
               var5.printStackTrace();
            }

            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var7;
            break pxClinit;
         }

         var18 = var10003;
         var10005 = var1;
         char var23 = var10003[var1];
         var10007 = 2;
         var10006 = var23;
         switch (var1 % 7) {
            case 0:
               var22 = 32;
               break;
            case 1:
               var22 = 98;
               break;
            case 2:
               var22 = 14;
               break;
            case 3:
               var22 = 116;
               break;
            case 4:
               var22 = 2;
               break;
            case 5:
               var22 = 102;
               break;
            default:
               var22 = 71;
         }
      }

      while (true) {
         var18[var10005] = (char)(var10006 ^ var10007 ^ var22);
         var1++;
         if (var14 == 0) {
            var18 = var10002;
            var10005 = var14;
            char var25 = var10002[var14];
            var10007 = var14;
            var10006 = var25;
            switch (var1 % 7) {
               case 0:
                  var22 = 32;
                  break;
               case 1:
                  var22 = 98;
                  break;
               case 2:
                  var22 = 14;
                  break;
               case 3:
                  var22 = 116;
                  break;
               case 4:
                  var22 = 2;
                  break;
               case 5:
                  var22 = 102;
                  break;
               default:
                  var22 = 71;
            }
         } else {
            if (var9 <= var1) {
               String var16 = new String(var10002).intern();
               byte var11 = -1;
               String var0 = var16;

               Constructor var2;
               try {
                  Class var3 = Class.forName(var0);
                  var2 = var3.getDeclaredConstructor(VertexConsumer.class, int.class);
                  var2.setAccessible(true);
               } catch (Throwable var4) {
                  var2 = null;
                  var4.printStackTrace();
               }

               IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var2;
               break pxClinit;
            }

            var18 = var10002;
            var10005 = var1;
            char var24 = var10002[var1];
            var10007 = var14;
            var10006 = var24;
            switch (var1 % 7) {
               case 0:
                  var22 = 32;
                  break;
               case 1:
                  var22 = 98;
                  break;
               case 2:
                  var22 = 14;
                  break;
               case 3:
                  var22 = 116;
                  break;
               case 4:
                  var22 = 2;
                  break;
               case 5:
                  var22 = 102;
                  break;
               default:
                  var22 = 71;
            }
         }
      }
   }
}

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
