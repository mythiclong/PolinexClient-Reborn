package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class IllIIIlIlIIIIIIIIlllIIlIllIIlIllIllIIIIIlIlllIIIIlllIIIIIllIlIlIlIIIIIlllIIIIIIllIIlI {
   @NotNull
   public static IllIIIlIlIIIIIIIIlllIIlIllIIlIllIllIIIIIlIlllIIIIlllIIIIIllIlIlIlIIIIIlllIIIIIIllIIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static ConcurrentHashMap<String, List<lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII>> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] a;
   private static String[] b;

   private IllIIIlIlIIIIIIIIlllIIlIllIIlIllIllIIIIIlIlllIIIIlllIIIIIllIlIlIlIIIIIlllIIIIIIllIIlI() {
   }

   public final void a(@NotNull lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII var1) { int var11 = 0; // PX-FIX hoist
        
      Object var9;
      boolean var10000 = lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.h();
      short var10002 = 27416;
      short var10003 = 8388;
      Intrinsics.checkNotNullParameter(var1, "scriptModule");
      ConcurrentMap var3 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      boolean var2 = var10000;
      String var4 = var1.ag();
      boolean var5 = false;
      var9 = var3.get(var4);
      label23:
      if (!var2 && var9 == null) {
         boolean var6 = false;
         List var7 = new ArrayList();
         boolean var8 = false;
         if (!var2) {
            var9 = var3.putIfAbsent(var4, var7);
            if (var9 != null) {
               break label23;
            }
         }

         var9 = var7;
      }

      ((List)var9).add(var1);
      var9 = var1.ah().aj();
      String var10001 = var1.ag();
      var10002 = 27423;
      var10003 = -7154;
      var10003 = 27415;
      short var10004 = 19542;
      me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d(
         "Registered script module: " + var9 + " from " + var10001
      );
       var11 = this.d();
      short var12 = 27418;
      var10002 = -8192;
      me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Total script modules: " + var11);
   }

   public final void a(@NotNull String var1) { List var11 = null; // PX-FIX hoist
        
      int var10000 = ((lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.h()) ? 1 : 0);
      short var10002 = 27419;
      short var10003 = 6243;
      Intrinsics.checkNotNullParameter(var1, "scriptName");
      boolean var2 = (var10000 != 0);
      if (!var2) {
          var11 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.remove(var1);
         if (var11 != null) {
            List var3 = var11;
            Iterable var4 = var3;
            boolean var5 = false;
            Iterator var6 = var4.iterator();

            while (true) {
               if (var6.hasNext()) {
                  Object var7 = var6.next();
                  lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII var8 = (lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII)var7;
                  boolean var9 = false;
                  IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var10 = var8.ah();
                  var10000 = ((var10 instanceof llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl) ? 1 : 0);
                  if (var2) {
                     break;
                  }

                  label29:
                  if (!var2) {
                     if (var10000 != 0) {
                        boolean var13 = ((llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl)var10).aA();
                        if (var2) {
                           break label29;
                        }

                        if (var13) {
                           ((llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl)var10).c(false);
                        }
                     }

                     lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        .remove(var8.ah());
                  }

                  if (!var2) {
                     continue;
                  }
               }

               var10000 = var3.size();
               break;
            }

            var10002 = 27422;
            var10003 = 27356;
            var10003 = 27414;
            short var10004 = -7141;
            me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d(
               "Unregistered " + var10000 + " module(s) from script: " + var1
            );
            return;
         }
      }
   }

   @NotNull
   public final List<lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII> a() {
      Collection var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.values();
      short var10002 = 27421;
      short var10003 = 18311;
      Intrinsics.checkNotNullExpressionValue(var10000, "<get-values>(...)");
      return CollectionsKt.flatten(var10000);
   }

   @NotNull
   public final List<lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII> b(@NotNull String var1) {
      boolean var10000 = lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.i();
      short var10002 = 27413;
      short var10003 = -7971;
      Intrinsics.checkNotNullParameter(var1, "scriptName");
      boolean var2 = var10000;
      if (var2) {
         List var3 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.get(var1);
         if (var3 != null) {
            return var3;
         }
      }

      return CollectionsKt.emptyList();
   }

   public final void b() { short var11 = (short)0; // PX-FIX hoist
        
      short var10000 = ((short)((lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.i()) ? 1 : 0));
      Set var10001 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.keySet();
      short var10003 = 27417;
      short var10004 = 19942;
      Intrinsics.checkNotNullExpressionValue(var10001, "<get-keys>(...)");
      List var2 = CollectionsKt.toList(var10001);
      Iterable var3 = var2;
      boolean var1 = (var10000 != 0);
      boolean var4 = false;
      Iterator var5 = var3.iterator();

      while (true) {
         if (var5.hasNext()) {
            Object var6 = var5.next();
            String var7 = (String)var6;
            boolean var8 = false;
            IllIIIlIlIIIIIIIIlllIIlIllIIlIllIllIIIIIlIlllIIIIlllIIIIIllIlIlIlIIIIIlllIIIIIIllIIlI var9 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            Intrinsics.checkNotNull(var7);
            var9.a(var7);
            if (!var1) {
               break;
            }

            if (var1) {
               continue;
            }
         }

         var10000 = 27420;
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.clear();
          var11 = 29203;
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Cleared all script modules");
         break;
      }
   }

   public final boolean c() {
      boolean var1 = lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.i();
      boolean var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.isEmpty();
      if (var1) {
         var10000 = !var10000;
      }

      return var10000;
   }

   public final int d() {
       int var11 = 0; // PX-FIX decl var11
      Collection var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.values();
      short var10002 = 27412;
      short var10003 = -15965;
      Intrinsics.checkNotNullExpressionValue(var10000, "<get-values>(...)");
      Iterable var2 = var10000;
      boolean var10 = lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.h();
      int var3 = 0;
      boolean var1 = var10;
      Iterator var4 = var2.iterator();

      while (true) {
         if (var4.hasNext()) {
            Object var5 = var4.next();
            List var6 = (List)var5;
            boolean var7 = false;
            int var9 = var6.size();
            var11 = var3 + var9;
            if (var1) {
               break;
            }

            var3 = var11;
            if (!var1) {
               continue;
            }
         }

         var11 = var3;
         break;
      }

      return var11;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[12];
      int var3 = 0;
      String var2 = "\u0093±ù\u0099\u0004Lj\u0004\u009fQ\u000b\u0002§\u0094®½B\u001a\u0097àéÌYBpøm\u0002Ü^ú\u008fi}4Ï\u0007\u009d¨N\b\u0018ïN\u001a ø.ïâ>'\u0016¢Ïí½\tÛ\u001eÝ¦µ\u009c\u000e4oè\u0006\u0096ö\r\u001a®\u009bC÷;\u0005\u000e2\u001cº\u0004M\u000fÛ\u0016ðm%ÏJß\u0019ÆFÐ8Ü\u009c\fªïoË~ºÿ\u009b\u0095Ñf[\nØ¤!¢·\u0097Å0¸{\u0016\u0096t-=ì9\f9\u0004\u0014\u009cm>9Õi\u0018ùb^¼¯\nf@ö>M\u0004\u009aBS5\u0011MM\"\u0006\u007f¿\u0005zr\u009e¶û\u0010«XZ\u009c";
      int var4 = "\u0093±ù\u0099\u0004Lj\u0004\u009fQ\u000b\u0002§\u0094®½B\u001a\u0097àéÌYBpøm\u0002Ü^ú\u008fi}4Ï\u0007\u009d¨N\b\u0018ïN\u001a ø.ïâ>'\u0016¢Ïí½\tÛ\u001eÝ¦µ\u009c\u000e4oè\u0006\u0096ö\r\u001a®\u009bC÷;\u0005\u000e2\u001cº\u0004M\u000fÛ\u0016ðm%ÏJß\u0019ÆFÐ8Ü\u009c\fªïoË~ºÿ\u009b\u0095Ñf[\nØ¤!¢·\u0097Å0¸{\u0016\u0096t-=ì9\f9\u0004\u0014\u009cm>9Õi\u0018ùb^¼¯\nf@ö>M\u0004\u009aBS5\u0011MM\"\u0006\u007f¿\u0005zr\u009e¶û\u0010«XZ\u009c"
         .length();
      char var1 = 17;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 91;
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
                     case 1 -> 49;
                     case 2 -> 100;
                     case 3 -> 70;
                     case 4 -> 99;
                     case 5 -> 11;
                     default -> 95;
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
                     b = new String[12];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllIIIlIlIIIIIIIIlllIIlIllIIlIllIllIIIIIlIlllIIIIlllIIIIIllIlIlIlIIIIIlllIIIIIIllIIlI();
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new ConcurrentHashMap<>();
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

                  var2 = "Ü\u00ad¤\u001c&î\u0018!\u009c\u0006[Ô \u001b¨\u000fx°\u0086\u008f*Å1b\rÀ\bkTÿ9";
                  var4 = "Ü\u00ad¤\u001c&î\u0018!\u009c\u0006[Ô \u001b¨\u000fx°\u0086\u008f*Å1b\rÀ\bkTÿ9".length();
                  var1 = 6;
                  var8 = -1;
            }

            var10000 = 41;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 27421) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 251;
            case 1 -> 117;
            case 2 -> 216;
            case 3 -> 198;
            case 4 -> 148;
            case 5 -> 253;
            case 6 -> 150;
            case 7 -> 146;
            case 8 -> 45;
            case 9 -> 17;
            case 10 -> 220;
            case 11 -> 147;
            case 12 -> 195;
            case 13 -> 76;
            case 14 -> 110;
            case 15 -> 68;
            case 16 -> 165;
            case 17 -> 28;
            case 18 -> 113;
            case 19 -> 39;
            case 20 -> 158;
            case 21 -> 181;
            case 22 -> 74;
            case 23 -> 38;
            case 24 -> 157;
            case 25 -> 176;
            case 26 -> 218;
            case 27 -> 73;
            case 28 -> 242;
            case 29 -> 133;
            case 30 -> 129;
            case 31 -> 97;
            case 32 -> 248;
            case 33 -> 142;
            case 34 -> 13;
            case 35 -> 104;
            case 36 -> 93;
            case 37 -> 244;
            case 38 -> 125;
            case 39 -> 203;
            case 40 -> 241;
            case 41 -> 201;
            case 42 -> 82;
            case 43 -> 160;
            case 44 -> 238;
            case 45 -> 207;
            case 46 -> 89;
            case 47 -> 141;
            case 48 -> 44;
            case 49 -> 88;
            case 50 -> 46;
            case 51 -> 209;
            case 52 -> 12;
            case 53 -> 151;
            case 54 -> 103;
            case 55 -> 123;
            case 56 -> 116;
            case 57 -> 169;
            case 58 -> 234;
            case 59 -> 92;
            case 60 -> 196;
            case 61 -> 36;
            case 62 -> 197;
            case 63 -> 177;
            case 64 -> 71;
            case 65 -> 227;
            case 66 -> 184;
            case 67 -> 101;
            case 68 -> 164;
            case 69 -> 63;
            case 70 -> 56;
            case 71 -> 231;
            case 72 -> 187;
            case 73 -> 192;
            case 74 -> 47;
            case 75 -> 95;
            case 76 -> 175;
            case 77 -> 96;
            case 78 -> 190;
            case 79 -> 250;
            case 80 -> 66;
            case 81 -> 69;
            case 82 -> 86;
            case 83 -> 149;
            case 84 -> 49;
            case 85 -> 194;
            case 86 -> 221;
            case 87 -> 41;
            case 88 -> 35;
            case 89 -> 5;
            case 90 -> 77;
            case 91 -> 65;
            case 92 -> 225;
            case 93 -> 64;
            case 94 -> 228;
            case 95 -> 108;
            case 96 -> 144;
            case 97 -> 143;
            case 98 -> 199;
            case 99 -> 167;
            case 100 -> 115;
            case 101 -> 7;
            case 102 -> 173;
            case 103 -> 219;
            case 104 -> 233;
            case 105 -> 217;
            case 106 -> 255;
            case 107 -> 37;
            case 108 -> 23;
            case 109 -> 212;
            case 110 -> 102;
            case 111 -> 53;
            case 112 -> 126;
            case 113 -> 240;
            case 114 -> 235;
            case 115 -> 237;
            case 116 -> 252;
            case 117 -> 25;
            case 118 -> 120;
            case 119 -> 87;
            case 120 -> 249;
            case 121 -> 155;
            case 122 -> 85;
            case 123 -> 19;
            case 124 -> 119;
            case 125 -> 211;
            case 126 -> 210;
            case 127 -> 145;
            case 128 -> 22;
            case 129 -> 202;
            case 130 -> 186;
            case 131 -> 213;
            case 132 -> 60;
            case 133 -> 33;
            case 134 -> 98;
            case 135 -> 91;
            case 136 -> 50;
            case 137 -> 67;
            case 138 -> 27;
            case 139 -> 107;
            case 140 -> 9;
            case 141 -> 1;
            case 142 -> 40;
            case 143 -> 20;
            case 144 -> 51;
            case 145 -> 4;
            case 146 -> 0;
            case 147 -> 179;
            case 148 -> 21;
            case 149 -> 8;
            case 150 -> 78;
            case 151 -> 174;
            case 152 -> 43;
            case 153 -> 132;
            case 154 -> 161;
            case 155 -> 152;
            case 156 -> 215;
            case 157 -> 70;
            case 158 -> 15;
            case 159 -> 154;
            case 160 -> 246;
            case 161 -> 80;
            case 162 -> 114;
            case 163 -> 156;
            case 164 -> 52;
            case 165 -> 247;
            case 166 -> 153;
            case 167 -> 118;
            case 168 -> 222;
            case 169 -> 138;
            case 170 -> 75;
            case 171 -> 136;
            case 172 -> 206;
            case 173 -> 30;
            case 174 -> 55;
            case 175 -> 214;
            case 176 -> 135;
            case 177 -> 128;
            case 178 -> 171;
            case 179 -> 193;
            case 180 -> 166;
            case 181 -> 180;
            case 182 -> 204;
            case 183 -> 232;
            case 184 -> 130;
            case 185 -> 2;
            case 186 -> 236;
            case 187 -> 34;
            case 188 -> 183;
            case 189 -> 105;
            case 190 -> 24;
            case 191 -> 182;
            case 192 -> 139;
            case 193 -> 243;
            case 194 -> 185;
            case 195 -> 14;
            case 196 -> 140;
            case 197 -> 111;
            case 198 -> 32;
            case 199 -> 59;
            case 200 -> 10;
            case 201 -> 239;
            case 202 -> 18;
            case 203 -> 254;
            case 204 -> 31;
            case 205 -> 191;
            case 206 -> 3;
            case 207 -> 94;
            case 208 -> 168;
            case 209 -> 172;
            case 210 -> 159;
            case 211 -> 189;
            case 212 -> 112;
            case 213 -> 106;
            case 214 -> 57;
            case 215 -> 109;
            case 216 -> 170;
            case 217 -> 26;
            case 218 -> 229;
            case 219 -> 178;
            case 220 -> 124;
            case 221 -> 11;
            case 222 -> 223;
            case 223 -> 48;
            case 224 -> 188;
            case 225 -> 134;
            case 226 -> 127;
            case 227 -> 79;
            case 228 -> 81;
            case 229 -> 224;
            case 230 -> 230;
            case 231 -> 54;
            case 232 -> 245;
            case 233 -> 84;
            case 234 -> 137;
            case 235 -> 42;
            case 236 -> 61;
            case 237 -> 90;
            case 238 -> 62;
            case 239 -> 122;
            case 240 -> 226;
            case 241 -> 6;
            case 242 -> 29;
            case 243 -> 16;
            case 244 -> 131;
            case 245 -> 163;
            case 246 -> 83;
            case 247 -> 72;
            case 248 -> 100;
            case 249 -> 58;
            case 250 -> 200;
            case 251 -> 205;
            case 252 -> 162;
            case 253 -> 121;
            case 254 -> 99;
            default -> 208;
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
}
