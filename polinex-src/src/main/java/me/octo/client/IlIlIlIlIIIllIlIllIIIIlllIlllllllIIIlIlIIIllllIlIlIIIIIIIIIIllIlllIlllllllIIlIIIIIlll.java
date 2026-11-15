package me.octo.client;

import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

public final class IlIlIlIlIIIllIlIllIIIIlllIlllllllIIIlIlIIIllllIlIlIIIIIIIIIIllIlllIlllllllIIlIIIIIlll {
   // PX-FIX missing no-arg method
   public static java.util.List<kotlin.Pair> a() {
      return null;
   }

   @NotNull
   private static List<Pair<String, Double>> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
      String[] var0 = new String[5];
      int var4 = 0;
      String var3 = "3\u00053A \u0007A=\u00192\u000b\u001f\u0002#\tfN@r$%\u0004\u000f\u0015\u000e:\u0012`HB7K\u0004\tuUH!";
      int var5 = "3\u00053A \u0007A=\u00192\u000b\u001f\u0002#\tfN@r$%\u0004\u000f\u0015\u000e:\u0012`HB7K\u0004\tuUH!".length();
      char var2 = '\n';
      int var9 = -1;

      label53:
while (true) {
         byte var10000 = 2;
         String var10001 = var3.substring(++var9, var9 + var2);
         byte var10002 = -1;

         while (true) {
            label48: {
               char[] var25 = var10001.toCharArray();
               int var10004 = var25.length;
               int var6 = 0;
               byte var28 = var10000;
               var21 = var25;
               int var15 = var10004;
               byte var33;
               char[] var37;
               int var10006;
               if (var10004 <= 1) {
                  var37 = var25;
                  var33 = var10000;
                  var10006 = var6;
               } else {
                  var28 = var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label48;
                  }

                  var37 = var25;
                  var33 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var37[var10006] = (char)(var37[var10006] ^ var33 ^ switch (var6 % 7) {
                     case 0 -> 80;
                     case 1 -> 105;
                     case 2 -> 85;
                     case 3 -> 99;
                     case 4 -> 22;
                     case 5 -> 37;
                     default -> 46;
                  });
                  var6++;
                  if (var28 == 0) {
                     var10006 = var28;
                     var37 = var21;
                     var33 = var28;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var37 = var21;
                     var33 = var28;
                     var10006 = var6;
                  }
               }
            }

            String var30 = new String(var21).intern();
            switch (var10002) {
               case 0:
                  var0[var4++] = var30;
                  if ((var9 += var2) >= var5) {
                     Pair[] var7 = new Pair[]{
                        TuplesKt.to(var0[1], 312510.0),
                        TuplesKt.to(var0[4], 268000.0),
                        TuplesKt.to(var0[3], 144000.0),
                        TuplesKt.to(var0[2], 92000.0),
                        TuplesKt.to(var0[0], 81200.0)
                     };
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = CollectionsKt.listOf(var7);
                     break label53;
                  }

                  var2 = var3.charAt(var9);
                  break;
               default:
                  var0[var4++] = var30;
                  if ((var9 += var2) < var5) {
                     var2 = var3.charAt(var9);
                     continue label53;
                  }

                  var3 = "\u007fm\\h\u00179#\u0018QR|\u001a(4\flhIj\u0010$3U!ry\u001b";
                  var5 = "\u007fm\\h\u00179#\u0018QR|\u001a(4\flhIj\u0010$3U!ry\u001b".length();
                  var2 = 14;
                  var9 = -1;
            }

            var10000 = 104;
            var10001 = var3.substring(++var9, var9 + var2);
            var10002 = 0;
         }
      }
   }
}
