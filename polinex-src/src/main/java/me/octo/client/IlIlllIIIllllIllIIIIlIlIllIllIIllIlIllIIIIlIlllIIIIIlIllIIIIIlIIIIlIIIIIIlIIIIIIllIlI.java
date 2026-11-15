package me.octo.client;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;

public final class IlIlllIIIllllIllIIIIlIlIllIllIIllIlIllIIIIlIlllIIIIIlIllIIIIIlIIIIlIIIIIIlIIIIIIllIlI
   implements IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl {
   @NotNull
   private final lIIllIllIlIIllIlllIlIIIlllllllIllIlllIIlIIlIIlIIlIIlIlllllIlIIllIlIIIllIIIIIlIIIlIllI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String[] d;
   private static String[] e;

   public IlIlllIIIllllIllIIIIlIlIllIllIIllIlIllIIIIlIlllIIIIIlIllIIIIIlIIIIlIIIIIIlIIIIIIllIlI(
      @NotNull lIIllIllIlIIllIlllIlIIIlllllllIllIlllIIlIIlIIlIIlIIlIlllllIlIIllIlIIIllIIIIIlIIIlIllI param1
   ) {
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = param1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.z()); // PX-FIX: 按 jar 字节码还原（kotlin .map + 协程簿记已桩化）
      // Original constructor maps every module setting through g() into the child renderer array.
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = Arrays.stream(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.an())
         .map(IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll::g)
         .toArray(IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl[]::new);
   }

   @NotNull
   public lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll a(
      @NotNull GuiGraphicsExtractor var1,
      @NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var2,
      int var3,
      int var4,
      int var5
   ) {
      String[] var6;
      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var7;
      int var11;
      label57: {
         short var10001 = -13660;
         short var10002 = 24713;
         Intrinsics.checkNotNullParameter(var1, "drawContext");
         var10001 = -13658;
         var10002 = -18821;
         Intrinsics.checkNotNullParameter(var2, "resolution");
         var7 = null;
         float var8 = var2.e() - 26.0F;
         var6 = IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.x();
         float var10 = var8 - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.an() - 6.0F;
         var11 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var1, (int)var2.c(), var3, (int)var10);
         float var12 = var3 + (var11 - var3) / 2.0F;
         int var10000 = ((this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a(var1, var4, var5, var8, var12)) ? 1 : 0);
         if (var6 != null) {
            if (var10000 == 0) {
               break label57;
            }

            float var26;
            var10000 = (var26 = var5 - (var2.d() + 5)) == 0.0F ? 0 : (var26 < 0.0F ? -1 : 1);
         }

         if (var10000 > 0) {
            var7 = (IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII)this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(true);
         }
      }

      int var23;
      label60: {
         float var13 = llIlllIIIIlllllllIIllIIlIIllIlIIlIlllllIllIIIIIIIIlIIllllllIllIIIllIllIIIIlllllIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .d(
               (IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll)this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            );
         float var27;
         var23 = (var27 = var13 - 0.0F) == 0.0F ? 0 : (var27 < 0.0F ? -1 : 1);
         if (var6 != null) {
            if (var23 <= 0) {
               var23 = var11;
               break label60;
            }

            var23 = var11;
         }

         int var15 = var23;
         IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl[] var16 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var17 = 0;
         int var18 = var16.length;

         while (var17 < var18) {
            IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl var19 = var16[var17];
            lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll var20 = var19.a(var1, var2, var15, var4, var5);
            var23 = ((var20.c()) ? 1 : 0);
            if (var6 == null) {
               break label60;
            }

            label41: {
               if (var6 != null) {
                  if (var23 != 0) {
                     IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var21 = var20.b();
                     if (var6 == null) {
                        break label41;
                     }

                     if (var21 != null) {
                        var7 = var21;
                     }
                  }

                  var23 = var20.a();
               }

               var15 = var23;
               var17++;
            }

            if (var6 == null) {
               break;
            }
         }

         var23 = var15;
      }

      int var14 = var23;
      return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(var14, var7);
   }

   @NotNull
   public IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll c() {
      return (IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll)this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   public void a(char var1, int var2) {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a(var1, var2);
   }

   public void e() {
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.C();
   }

   private static Exception a(Exception var0) {
      return var0;
   }
   @Override
   public float a() {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a();
   }

   @Override
   public boolean a(int p0, int p1, int p2, int p3, int p4, int p5) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(p0, p1, p2, p3, p4, p5);
   }

   @Override
   public int a(llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll p0) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(p0);
   }

   @Override
   public boolean a(net.minecraft.client.gui.GuiGraphicsExtractor p0, int p1, int p2, float p3, float p4, float p5, float p6) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(p0, p1, p2, p3, p4, p5, p6);
   }

   @Override
   public boolean a(net.minecraft.client.gui.GuiGraphicsExtractor p0, int p1, int p2, int p3, int p4, float p5) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(p0, p1, p2, p3, p4, p5);
   }

   @Override
   public int b() {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b();
   }

   @Override
   public boolean b(net.minecraft.client.gui.GuiGraphicsExtractor p0, int p1, int p2, int p3, int p4, float p5) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b(p0, p1, p2, p3, p4, p5);
   }

   @Override
   public void d() {
      me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.d();
   }


   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "®,\u009b'uÓ\u000b\u0095ÜÑ\u0085¶ÏØÉ\"Q¬";
      int var4 = "®,\u009b'uÓ\u000b\u0095ÜÑ\u0085¶ÏØÉ\"Q¬".length();
      char var1 = 6;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 84;
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
                     case 0 -> 123;
                     case 1 -> 79;
                     case 2 -> 91;
                     case 3 -> 98;
                     case 4 -> 55;
                     case 5 -> 27;
                     default -> 115;
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
                     d = var5;
                     e = new String[4];
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

                  var2 = "\u009cÇè\u0019\u000e\u009f\u001b%(ß@è\u0010ÇU³Ñ\u0016\f[ÿ\u00195Ùã\rdßþ1\u0000c·Q\u00adüÛä¿\u008fï+ª..¥ó\b\u0000òÊ¤\u001c¢¾\u000f$ª~5ù?A\u0095ÇH\u0019?\u009f¼\u0000ÜßûLæ÷\u008b4/ÃR`\u0011[\n^¸Ö\\\u0091MTeXÔ";
                  var4 = "\u009cÇè\u0019\u000e\u009f\u001b%(ß@è\u0010ÇU³Ñ\u0016\f[ÿ\u00195Ùã\rdßþ1\u0000c·Q\u00adüÛä¿\u008fï+ª..¥ó\b\u0000òÊ¤\u001c¢¾\u000f$ª~5ù?A\u0095ÇH\u0019?\u009f¼\u0000ÜßûLæ÷\u008b4/ÃR`\u0011[\n^¸Ö\\\u0091MTeXÔ"
                     .length();
                  var1 = 'U';
                  var8 = -1;
            }

            var10000 = 34;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -13659) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 65;
            case 1 -> 240;
            case 2 -> 18;
            case 3 -> 145;
            case 4 -> 113;
            case 5 -> 243;
            case 6 -> 166;
            case 7 -> 6;
            case 8 -> 237;
            case 9 -> 54;
            case 10 -> 232;
            case 11 -> 148;
            case 12 -> 87;
            case 13 -> 94;
            case 14 -> 10;
            case 15 -> 245;
            case 16 -> 124;
            case 17 -> 56;
            case 18 -> 48;
            case 19 -> 44;
            case 20 -> 234;
            case 21 -> 1;
            case 22 -> 202;
            case 23 -> 21;
            case 24 -> 33;
            case 25 -> 80;
            case 26 -> 165;
            case 27 -> 43;
            case 28 -> 173;
            case 29 -> 184;
            case 30 -> 37;
            case 31 -> 79;
            case 32 -> 219;
            case 33 -> 66;
            case 34 -> 228;
            case 35 -> 157;
            case 36 -> 233;
            case 37 -> 74;
            case 38 -> 122;
            case 39 -> 72;
            case 40 -> 22;
            case 41 -> 119;
            case 42 -> 201;
            case 43 -> 170;
            case 44 -> 177;
            case 45 -> 24;
            case 46 -> 179;
            case 47 -> 209;
            case 48 -> 41;
            case 49 -> 60;
            case 50 -> 198;
            case 51 -> 133;
            case 52 -> 128;
            case 53 -> 53;
            case 54 -> 99;
            case 55 -> 14;
            case 56 -> 73;
            case 57 -> 88;
            case 58 -> 239;
            case 59 -> 147;
            case 60 -> 154;
            case 61 -> 180;
            case 62 -> 214;
            case 63 -> 197;
            case 64 -> 103;
            case 65 -> 227;
            case 66 -> 230;
            case 67 -> 132;
            case 68 -> 137;
            case 69 -> 196;
            case 70 -> 34;
            case 71 -> 123;
            case 72 -> 238;
            case 73 -> 105;
            case 74 -> 224;
            case 75 -> 76;
            case 76 -> 71;
            case 77 -> 221;
            case 78 -> 42;
            case 79 -> 49;
            case 80 -> 200;
            case 81 -> 223;
            case 82 -> 89;
            case 83 -> 61;
            case 84 -> 212;
            case 85 -> 175;
            case 86 -> 36;
            case 87 -> 109;
            case 88 -> 138;
            case 89 -> 246;
            case 90 -> 82;
            case 91 -> 236;
            case 92 -> 97;
            case 93 -> 29;
            case 94 -> 162;
            case 95 -> 131;
            case 96 -> 86;
            case 97 -> 45;
            case 98 -> 158;
            case 99 -> 81;
            case 100 -> 213;
            case 101 -> 52;
            case 102 -> 55;
            case 103 -> 144;
            case 104 -> 57;
            case 105 -> 0;
            case 106 -> 146;
            case 107 -> 168;
            case 108 -> 244;
            case 109 -> 226;
            case 110 -> 126;
            case 111 -> 102;
            case 112 -> 62;
            case 113 -> 183;
            case 114 -> 93;
            case 115 -> 84;
            case 116 -> 111;
            case 117 -> 252;
            case 118 -> 160;
            case 119 -> 247;
            case 120 -> 193;
            case 121 -> 69;
            case 122 -> 31;
            case 123 -> 134;
            case 124 -> 135;
            case 125 -> 70;
            case 126 -> 46;
            case 127 -> 150;
            case 128 -> 235;
            case 129 -> 59;
            case 130 -> 90;
            case 131 -> 176;
            case 132 -> 16;
            case 133 -> 217;
            case 134 -> 254;
            case 135 -> 222;
            case 136 -> 186;
            case 137 -> 2;
            case 138 -> 95;
            case 139 -> 101;
            case 140 -> 143;
            case 141 -> 142;
            case 142 -> 191;
            case 143 -> 255;
            case 144 -> 199;
            case 145 -> 5;
            case 146 -> 206;
            case 147 -> 215;
            case 148 -> 249;
            case 149 -> 91;
            case 150 -> 9;
            case 151 -> 92;
            case 152 -> 189;
            case 153 -> 75;
            case 154 -> 210;
            case 155 -> 58;
            case 156 -> 127;
            case 157 -> 118;
            case 158 -> 194;
            case 159 -> 116;
            case 160 -> 112;
            case 161 -> 218;
            case 162 -> 77;
            case 163 -> 50;
            case 164 -> 185;
            case 165 -> 172;
            case 166 -> 27;
            case 167 -> 136;
            case 168 -> 204;
            case 169 -> 3;
            case 170 -> 195;
            case 171 -> 100;
            case 172 -> 98;
            case 173 -> 181;
            case 174 -> 248;
            case 175 -> 121;
            case 176 -> 110;
            case 177 -> 211;
            case 178 -> 130;
            case 179 -> 220;
            case 180 -> 35;
            case 181 -> 207;
            case 182 -> 4;
            case 183 -> 140;
            case 184 -> 47;
            case 185 -> 167;
            case 186 -> 171;
            case 187 -> 190;
            case 188 -> 108;
            case 189 -> 30;
            case 190 -> 40;
            case 191 -> 153;
            case 192 -> 15;
            case 193 -> 11;
            case 194 -> 7;
            case 195 -> 149;
            case 196 -> 141;
            case 197 -> 242;
            case 198 -> 231;
            case 199 -> 117;
            case 200 -> 104;
            case 201 -> 225;
            case 202 -> 13;
            case 203 -> 38;
            case 204 -> 152;
            case 205 -> 51;
            case 206 -> 96;
            case 207 -> 216;
            case 208 -> 19;
            case 209 -> 125;
            case 210 -> 8;
            case 211 -> 241;
            case 212 -> 106;
            case 213 -> 25;
            case 214 -> 17;
            case 215 -> 129;
            case 216 -> 68;
            case 217 -> 23;
            case 218 -> 114;
            case 219 -> 178;
            case 220 -> 161;
            case 221 -> 156;
            case 222 -> 182;
            case 223 -> 188;
            case 224 -> 139;
            case 225 -> 12;
            case 226 -> 203;
            case 227 -> 26;
            case 228 -> 208;
            case 229 -> 67;
            case 230 -> 174;
            case 231 -> 253;
            case 232 -> 155;
            case 233 -> 83;
            case 234 -> 32;
            case 235 -> 250;
            case 236 -> 28;
            case 237 -> 192;
            case 238 -> 39;
            case 239 -> 164;
            case 240 -> 107;
            case 241 -> 63;
            case 242 -> 205;
            case 243 -> 163;
            case 244 -> 115;
            case 245 -> 159;
            case 246 -> 85;
            case 247 -> 229;
            case 248 -> 20;
            case 249 -> 187;
            case 250 -> 251;
            case 251 -> 151;
            case 252 -> 120;
            case 253 -> 78;
            case 254 -> 64;
            default -> 169;
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

         e[var2] = new String(var3).intern();
      }

      return e[var2];
   }
}
