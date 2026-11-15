package me.octo.client;

import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class IIllllIlIIIIIIlIIIIlllIlIIllIlIllIIllIIIIIIllIllIllIIIlIIlllIlIIlIllllIIlIIIIlIlIIIII {
   @NotNull
   public static IIllllIlIIIIIIlIIIIlllIlIIllIlIllIIllIIIIIIllIllIllIIIlIIlllIlIIlIllllIIlIIIIlIlIIIII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @JvmField
   @NotNull
   public static VertexFormat lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @JvmField
   @NotNull
   public static VertexFormat IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;

   private IIllllIlIIIIIIlIIIIlllIlIIllIlIllIIllIIIIIIllIllIllIIIlIIlllIlIIlIllllIIlIIIIlIlIIIII() {
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var22 = null; // PX-FIX
      String[] var0 = new String[10];
      int var4 = 0;
      String var3 = "\u0019A;!\u001cui<@'\b\u0000@&-\u001a_i>\n\u0019A;!\u001cdg$F:\n\u001fZ!!\u001cui<@'\u0003\u0005ye\b\u0000@&-\u001a_i>\u0003\u0005ye\n2Z<(\n\u001e(~\u0001|";
      int var5 = "\u0019A;!\u001cui<@'\b\u0000@&-\u001a_i>\n\u0019A;!\u001cdg$F:\n\u001fZ!!\u001cui<@'\u0003\u0005ye\b\u0000@&-\u001a_i>\u0003\u0005ye\n2Z<(\n\u001e(~\u0001|"
         .length();
      char var2 = '\n';
      int var8 = -1;

      label53:
while (true) {
         byte var10000 = 23;
         String var10001 = var3.substring(++var8, var8 + var2);
         byte var10002 = -1;

         while (true) {
            label48: {
               char[] var26 = var10001.toCharArray();
               int var10004 = var26.length;
               int var6 = 0;
               byte var29 = var10000;
               var22 = var26;
               int var16 = var10004;
               byte var34;
               char[] var38;
               int var10006;
               if (var10004 <= 1) {
                  var38 = var26;
                  var34 = var10000;
                  var10006 = var6;
               } else {
                  var29 = var10000;
                  var16 = var10004;
                  if (var10004 <= var6) {
                     break label48;
                  }

                  var38 = var26;
                  var34 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var38[var10006] = (char)(var38[var10006] ^ var34 ^ switch (var6 % 7) {
                     case 0 -> 71;
                     case 1 -> 56;
                     case 2 -> 66;
                     case 3 -> 83;
                     case 4 -> 121;
                     case 5 -> 33;
                     default -> 17;
                  });
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var38 = var22;
                     var34 = var29;
                  } else {
                     if (var16 <= var6) {
                        break;
                     }

                     var38 = var22;
                     var34 = var29;
                     var10006 = var6;
                  }
               }
            }

            String var31 = new String(var22).intern();
            switch (var10002) {
               case 0:
                  var0[var4++] = var31;
                  if ((var8 += var2) >= var5) {
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIllllIlIIIIIIlIIIIlllIlIIllIlIllIIllIIIIIIllIllIllIIIlIIlllIlIIlIllllIIlIIIIlIlIIIII();
                     VertexFormat var10 = VertexFormat.builder()
                        .add(var0[1], VertexFormatElement.POSITION)
                        .add(var0[6], VertexFormatElement.UV0)
                        .add(var0[9], VertexFormatElement.UV2)
                        .build();
                     Intrinsics.checkNotNullExpressionValue(var10, var0[8]);
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var10;
                     VertexFormat var11 = VertexFormat.builder()
                        .add(var0[5], VertexFormatElement.POSITION)
                        .add(var0[4], VertexFormatElement.UV0)
                        .add(var0[3], VertexFormatElement.UV1)
                        .add(var0[0], VertexFormatElement.UV2)
                        .add(var0[2], VertexFormatElement.LINE_WIDTH)
                        .build();
                     Intrinsics.checkNotNullExpressionValue(var11, var0[7]);
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var11;
                     break label53;
                  }

                  var2 = var3.charAt(var8);
                  break;
               default:
                  var0[var4++] = var31;
                  if ((var8 += var2) < var5) {
                     var2 = var3.charAt(var8);
                     continue label53;
                  }

                  var3 = "@(NZxlZ\fs\u000e\u0003w\u000b\u0015";
                  var5 = "@(NZxlZ\fs\u000e\u0003w\u000b\u0015".length();
                  var2 = '\n';
                  var8 = -1;
            }

            var10000 = 101;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
}
