package me.octo.client;

import java.util.Locale;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

public class lIlIIlIIllIllllllllIllllllIIIIllIIIIIlIIIlllllllIlIIllIlllllIIlllIllllIIllIIIIIIlIlIl
   extends IIIIlIlIllIIllIlllllIlIlIlIlllllIIIllIIlIIIlIlIIIIIlllIlllIlIllllllIIllIIlIIlIlIlIIll {
   @NotNull
   private final String lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private String lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static String[] f;
   private static String[] g;

   public lIlIIlIIllIllllllllIllllllIIIIllIIIIIlIIIlllllllIlIIllIlllllIIlllIllllIIllIIIIIIlIlIl(
      @NotNull String var1,
      @NotNull String var2,
      @NotNull IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3,
      @NotNull String var4,
      @NotNull String var5,
      int var6
   ) {
      short var10001 = 27421;
      short var10002 = -8560;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = 27409;
      var10002 = 32443;
      Intrinsics.checkNotNullParameter(var2, "description");
      var10001 = 27408;
      var10002 = 17777;
      Intrinsics.checkNotNullParameter(var3, "category");
      var10001 = 27410;
      var10002 = -7473;
      Intrinsics.checkNotNullParameter(var4, "subcategory");
      var10001 = 27423;
      var10002 = -22643;
      Intrinsics.checkNotNullParameter(var5, "defaultName");
      super(
         var1,
         var2,
         var3,
         var4,
         me.octo.client.utils.IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c(),
         0,
         var6
      , new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[0]);
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var5;
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   @NotNull
   @Override
   public String[] w() {
      return me.octo.client.utils.IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .c();
   }

   @NotNull
   @Override
   public String y() {
      String[] var10000 = IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI.V();
      String[] var2 = me.octo.client.utils.IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .c();
      String[] var1 = var10000;
      var10000 = var2;
      if (var1 == null) {
         if (ArraysKt.contains(var2, this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI)) {
            return this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
         }

         var10000 = (String[])(Object)(ArraysKt.firstOrNull(var2));
      }

      String var4 = (String)(Object)var10000;
      if ((String)(Object)var10000 == null) {
         var4 = "";
      }

      return var4;
   }

   @Override
   public int x() {
      String[] var10000 = IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI.V();
      String[] var2 = me.octo.client.utils.IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .c();
      String[] var1 = var10000;
      int var3 = ArraysKt.indexOf(var2, this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI);
      int var4 = var3;
      if (var1 == null) {
         var4 = var3 >= 0 ? var3 : 0;
      }

      return var4;
   }

   @Override
   public void c(int var1) {
      String[] var3;
      int var4;
      label25: {
         String[] var10000 = IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI.V();
         var3 = me.octo.client.utils.IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c();
         String[] var2 = var10000;
         var4 = 0;
         int var10001 = var1;
         if (var2 == null) {
            if (0 > var1) {
               var4 = 0;
               break label25;
            }

            var4 = var1;
            if (var2 != null) {
               break label25;
            }

            var10001 = var3.length;
         }

         var4 = var4 < var10001 ? 1 : 0;
      }

      if (var4 != 0) {
         this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var3[var1];
         llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e();
         this.E();
      }
   }

   @NotNull
   public final String D() {
      return ArraysKt.contains(
            me.octo.client.utils.IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .c(),
            this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
         )
         ? this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
         : this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   public void E() {
      me.octo.client.utils.IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(this.D(), 1.0F);
   }

   @Override
   public void a(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var1) {
      short var10001 = 27414;
      short var10002 = 15199;
      Intrinsics.checkNotNullParameter(var1, "data");
      var10001 = 27413;
      var10002 = 8959;
      var1.a("name", this.aj());
      var10001 = 27415;
      var10002 = 5372;
      var1.a("selectedName", this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI);
      this.c(var1);
   }

   @Override
   public void b(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var1) {
      short var10001 = 27422;
      short var10002 = 8018;
      Intrinsics.checkNotNullParameter(var1, "data");
      var10001 = 27412;
      var10002 = -14064;
      String var2 = var1.aString("selectedName", this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl);
      lIlIIlIIllIllllllllIllllllIIIIllIIIIIlIIIlllllllIlIIllIlllllIIlllIllllIIllIIIIIIlIlIl var10000 = this;
      CharSequence var3 = var2;
      Object var7;
      if (StringsKt.isBlank(var3)) {
         boolean var4 = false;
         var7 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
         var10000 = this;
      } else {
         var7 = var3;
      }

      var10000.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = (String)var7;
      this.d(var1);
   }

   @Override
   public boolean a(@NotNull String var1) {
      Object var22 = null; // PX-FIX
      Object var21 = null; // PX-FIX
      String[] var10000 = IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI.V();
      Intrinsics.checkNotNullParameter(var1, "s");
      String var10001 = var1.toLowerCase(Locale.ROOT);
      short var10003 = 27411;
      short var10004 = 11982;
      Intrinsics.checkNotNullExpressionValue(var10001, "toLowerCase(...)");
      String var3 = var10001;
      String[] var2 = var10000;
      String var17 = this.aa().toLowerCase(Locale.ROOT);
      short var10002 = 27420;
      var10003 = 4907;
      Intrinsics.checkNotNullExpressionValue(var17, "toLowerCase(...)");
      boolean var18 = StringsKt.contains(var17, var3, false);
      if (var2 == null) {
         if (!var18) {
            String var19 = this.ab().toLowerCase(Locale.ROOT);
            var10002 = 27420;
            var10003 = 4907;
            Intrinsics.checkNotNullExpressionValue(var19, "toLowerCase(...)");
            boolean var28 = StringsKt.contains(var19, var3, false);
            if (var2 != null) {
               return var28;
            }

            if (!var28) {
               String[] var4 = me.octo.client.utils.IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c();
               boolean var5 = false;
               int var6 = 0;
               int var7 = var4.length;

               label63: {
                  while (var6 < var7) {
                     String var8 = var4[var6];
                     boolean var10 = false;
                     if (var2 == null) {
                        String var20 = var8.toLowerCase(Locale.ROOT);
                        var10002 = 27420;
                        var10003 = 4907;
                        Intrinsics.checkNotNullExpressionValue(var20, "toLowerCase(...)");
                        var21 = StringsKt.contains(var20, var3, false);
                        if (var2 != null) {
                           break label63;
                        }

                        if (((Boolean)(var21))) {
                           var21 = true;
                           break label63;
                        }

                        var6++;
                     }

                     if (var2 != null) {
                        break;
                     }
                  }

                  var21 = false;
               }

               if (!((Boolean)var21)) {
                  IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var11 = this.an();
                  var5 = false;
                  var6 = 0;
                  var7 = var11.length;

                  label47: {
                     while (var6 < var7) {
                        IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll var15 = var11[var6];
                        boolean var16 = false;
                        if (var2 == null) {
                           var22 = var15.a(var1);
                           if (var2 != null) {
                              break label47;
                           }

                           if (((Boolean)(var22))) {
                              var22 = true;
                              break label47;
                           }

                           var6++;
                        }

                        if (var2 != null) {
                           break;
                        }
                     }

                     var22 = false;
                  }

                  if (!((Boolean)var22)) {
                     return false;
                  }
               }
            }
         }

         var18 = true;
      }

      return var18;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[13];
      int var3 = 0;
      String var2 = "Q¾fß\fï zñûp\u0015\u0004)ÏÖu\u0004òåÿ4\f×ß¶ó\u0016jãÊ\u0099í}×\bM\u0085ï<\"\u0088öó\u000bAµ\u008e¸üØ\u00982fîB\u000b~=\u008d»¼¥ô0ZÂ\u0014\u0010¸5\u009cïc³Ìå¦ÙXLEÁt\u0098\u0010½¸<^w\u0085N#ö\u0001RW\u0004¢\\ô\u0004ß¸\b\u009b\u0004Zºêß";
      int var4 = "Q¾fß\fï zñûp\u0015\u0004)ÏÖu\u0004òåÿ4\f×ß¶ó\u0016jãÊ\u0099í}×\bM\u0085ï<\"\u0088öó\u000bAµ\u008e¸üØ\u00982fîB\u000b~=\u008d»¼¥ô0ZÂ\u0014\u0010¸5\u009cïc³Ìå¦ÙXLEÁt\u0098\u0010½¸<^w\u0085N#ö\u0001RW\u0004¢\\ô\u0004ß¸\b\u009b\u0004Zºêß"
         .length();
      char var1 = '\f';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 33;
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
                     case 0 -> 24;
                     case 1 -> 46;
                     case 2 -> 59;
                     case 3 -> 100;
                     case 4 -> 32;
                     case 5 -> 32;
                     default -> 74;
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
                     g = new String[13];
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

                  var2 = "R\u0083\u009c\u0019kÎì\n\u0001óÉ\u00050\u0001\u001c®\u0090";
                  var4 = "R\u0083\u009c\u0019kÎì\n\u0001óÉ\u00050\u0001\u001c®\u0090".length();
                  var1 = 11;
                  var8 = -1;
            }

            var10000 = 73;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String c(int var0, int var1) {
      int var2 = (var0 ^ 27412) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 119;
            case 1 -> 233;
            case 2 -> 7;
            case 3 -> 38;
            case 4 -> 18;
            case 5 -> 241;
            case 6 -> 157;
            case 7 -> 34;
            case 8 -> 56;
            case 9 -> 253;
            case 10 -> 76;
            case 11 -> 132;
            case 12 -> 235;
            case 13 -> 118;
            case 14 -> 93;
            case 15 -> 64;
            case 16 -> 129;
            case 17 -> 180;
            case 18 -> 216;
            case 19 -> 42;
            case 20 -> 192;
            case 21 -> 201;
            case 22 -> 194;
            case 23 -> 121;
            case 24 -> 237;
            case 25 -> 229;
            case 26 -> 14;
            case 27 -> 168;
            case 28 -> 54;
            case 29 -> 61;
            case 30 -> 68;
            case 31 -> 244;
            case 32 -> 120;
            case 33 -> 191;
            case 34 -> 203;
            case 35 -> 170;
            case 36 -> 137;
            case 37 -> 25;
            case 38 -> 103;
            case 39 -> 87;
            case 40 -> 179;
            case 41 -> 164;
            case 42 -> 226;
            case 43 -> 109;
            case 44 -> 20;
            case 45 -> 99;
            case 46 -> 96;
            case 47 -> 231;
            case 48 -> 92;
            case 49 -> 41;
            case 50 -> 160;
            case 51 -> 67;
            case 52 -> 252;
            case 53 -> 163;
            case 54 -> 144;
            case 55 -> 106;
            case 56 -> 136;
            case 57 -> 145;
            case 58 -> 17;
            case 59 -> 130;
            case 60 -> 84;
            case 61 -> 215;
            case 62 -> 189;
            case 63 -> 28;
            case 64 -> 184;
            case 65 -> 23;
            case 66 -> 134;
            case 67 -> 36;
            case 68 -> 104;
            case 69 -> 171;
            case 70 -> 74;
            case 71 -> 155;
            case 72 -> 169;
            case 73 -> 242;
            case 74 -> 238;
            case 75 -> 202;
            case 76 -> 115;
            case 77 -> 46;
            case 78 -> 195;
            case 79 -> 208;
            case 80 -> 188;
            case 81 -> 114;
            case 82 -> 198;
            case 83 -> 63;
            case 84 -> 73;
            case 85 -> 227;
            case 86 -> 165;
            case 87 -> 112;
            case 88 -> 21;
            case 89 -> 214;
            case 90 -> 81;
            case 91 -> 139;
            case 92 -> 247;
            case 93 -> 57;
            case 94 -> 100;
            case 95 -> 146;
            case 96 -> 152;
            case 97 -> 156;
            case 98 -> 12;
            case 99 -> 75;
            case 100 -> 27;
            case 101 -> 154;
            case 102 -> 5;
            case 103 -> 239;
            case 104 -> 245;
            case 105 -> 166;
            case 106 -> 177;
            case 107 -> 52;
            case 108 -> 135;
            case 109 -> 70;
            case 110 -> 187;
            case 111 -> 228;
            case 112 -> 230;
            case 113 -> 222;
            case 114 -> 62;
            case 115 -> 224;
            case 116 -> 90;
            case 117 -> 33;
            case 118 -> 71;
            case 119 -> 190;
            case 120 -> 159;
            case 121 -> 151;
            case 122 -> 9;
            case 123 -> 43;
            case 124 -> 3;
            case 125 -> 29;
            case 126 -> 225;
            case 127 -> 185;
            case 128 -> 4;
            case 129 -> 217;
            case 130 -> 212;
            case 131 -> 207;
            case 132 -> 59;
            case 133 -> 24;
            case 134 -> 30;
            case 135 -> 2;
            case 136 -> 254;
            case 137 -> 0;
            case 138 -> 167;
            case 139 -> 15;
            case 140 -> 37;
            case 141 -> 78;
            case 142 -> 16;
            case 143 -> 141;
            case 144 -> 204;
            case 145 -> 131;
            case 146 -> 117;
            case 147 -> 250;
            case 148 -> 126;
            case 149 -> 122;
            case 150 -> 153;
            case 151 -> 147;
            case 152 -> 88;
            case 153 -> 35;
            case 154 -> 53;
            case 155 -> 49;
            case 156 -> 83;
            case 157 -> 213;
            case 158 -> 138;
            case 159 -> 133;
            case 160 -> 162;
            case 161 -> 85;
            case 162 -> 66;
            case 163 -> 55;
            case 164 -> 22;
            case 165 -> 48;
            case 166 -> 150;
            case 167 -> 209;
            case 168 -> 251;
            case 169 -> 102;
            case 170 -> 128;
            case 171 -> 248;
            case 172 -> 197;
            case 173 -> 45;
            case 174 -> 47;
            case 175 -> 161;
            case 176 -> 98;
            case 177 -> 234;
            case 178 -> 172;
            case 179 -> 91;
            case 180 -> 69;
            case 181 -> 19;
            case 182 -> 255;
            case 183 -> 40;
            case 184 -> 223;
            case 185 -> 110;
            case 186 -> 123;
            case 187 -> 39;
            case 188 -> 31;
            case 189 -> 80;
            case 190 -> 178;
            case 191 -> 79;
            case 192 -> 240;
            case 193 -> 243;
            case 194 -> 142;
            case 195 -> 143;
            case 196 -> 1;
            case 197 -> 158;
            case 198 -> 11;
            case 199 -> 125;
            case 200 -> 149;
            case 201 -> 210;
            case 202 -> 89;
            case 203 -> 176;
            case 204 -> 32;
            case 205 -> 82;
            case 206 -> 58;
            case 207 -> 108;
            case 208 -> 50;
            case 209 -> 60;
            case 210 -> 175;
            case 211 -> 113;
            case 212 -> 246;
            case 213 -> 111;
            case 214 -> 94;
            case 215 -> 186;
            case 216 -> 173;
            case 217 -> 44;
            case 218 -> 220;
            case 219 -> 205;
            case 220 -> 218;
            case 221 -> 6;
            case 222 -> 181;
            case 223 -> 236;
            case 224 -> 13;
            case 225 -> 51;
            case 226 -> 26;
            case 227 -> 140;
            case 228 -> 196;
            case 229 -> 97;
            case 230 -> 8;
            case 231 -> 221;
            case 232 -> 183;
            case 233 -> 200;
            case 234 -> 174;
            case 235 -> 211;
            case 236 -> 105;
            case 237 -> 86;
            case 238 -> 95;
            case 239 -> 72;
            case 240 -> 127;
            case 241 -> 116;
            case 242 -> 77;
            case 243 -> 107;
            case 244 -> 10;
            case 245 -> 206;
            case 246 -> 101;
            case 247 -> 199;
            case 248 -> 182;
            case 249 -> 193;
            case 250 -> 232;
            case 251 -> 249;
            case 252 -> 219;
            case 253 -> 124;
            case 254 -> 148;
            default -> 65;
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
      public lIlIIlIIllIllllllllIllllllIIIIllIIIIIlIIIlllllllIlIIllIlllllIIlllIllllIIllIIIIIIlIlIl(java.lang.String p0, java.lang.String p1, me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll p2, java.lang.String p3, java.lang.String p4, int p5, int mask, kotlin.jvm.internal.DefaultConstructorMarker marker) {
         this(p0, p1, p2, p3, (mask & 16) != 0 ? "Crisp" : p4, (mask & 32) != 0 ? 0 : p5);
      }
}
