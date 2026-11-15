package me.octo.client;

import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.pipeline.TextureTarget;
import com.mojang.blaze3d.textures.GpuTexture;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl implements AutoCloseable {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl(Object... px) {
           this((String)null, false, 0); // PX-FIX: 委托主构造器（final 字段初始化）
        }

   @NotNull
   private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @JvmField
   public final boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @Nullable
   private RenderTarget lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static boolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static String[] a;
   private static String[] b;

   @JvmOverloads
   public lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl(@NotNull String var1, boolean var2, int var3) {
      short var10001 = 2086;
      short var10002 = -15536;
      Intrinsics.checkNotNullParameter(var1, "name");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
   }

   @NotNull
   public final String a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   public final int b() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @Nullable
   public final RenderTarget c() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @Override
   public void close() {
      boolean var1 = f();
      if (var1) {
         if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI != null) {
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.destroyBuffers();
         }
      }

      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = null;
   }

   @NotNull
   public final RenderTarget d() {
      return this.a(true);
   }

   @NotNull
   public final RenderTarget a(boolean var1) {
      GpuTexture var25 = null; // PX-FIX
      int var3 = RangesKt.coerceAtLeast(
         me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .getWindow()
               .getWidth()
            / this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
         1
      );
      int var10000 = ((f()) ? 1 : 0);
      int var4 = RangesKt.coerceAtLeast(
         me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .getWindow()
               .getHeight()
            / this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
         1
      );
      boolean var2 = (var10000 != 0);
      RenderTarget var5 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      if (var5 == null) {
         TextureTarget var19 = new TextureTarget(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3,
            var4,
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         );
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var19;
         return var19;
      } else {
         label85: {
            label91: {
               label83: {
                  var10000 = var3;
                  int var10001 = var5.width;
                  if (var2) {
                     if (var3 != var5.width) {
                        break label83;
                     }

                     var10000 = var4;
                     if (!var2) {
                        break label85;
                     }

                     var10001 = var5.height;
                  }

                  if (var10000 == var10001) {
                     break label91;
                  }
               }

               var5.resize(var3, var4);
               if (var2) {
                  return var5;
               }

               me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
                  new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[1]
               );
            }

            var10000 =(( var1) ? 1 : 0);
         }

         if (var2) {
            if (var10000 == 0) {
               return var5;
            }

            var10000 = ((this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) ? 1 : 0);
         }

         if (var10000 != 0) {
            label94: {
               byte var7;
               double var8;
               GpuTexture var15;
               var7 = 0;
               var8 = 1.0;
               boolean var10 = false;
               GpuTexture var11 = var5.getColorTexture();
               GpuTexture var12 = var5.getDepthTexture();
               boolean var14 = false;
               var15 = var5.useDepth ? var12 : null;
               var25 = var11;
               label59:
               if (var2) {
                  if (var11 != null) {
                     var25 = var15;
                     if (!var2) {
                        break label59;
                     }

                     if (var15 != null) {
                        lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.a()
                           .createCommandEncoder()
                           .clearColorAndDepthTextures(var11, var7, var15, var8);
                        if (var2) {
                           break label94;
                        }
                     }
                  }

                  var25 = var11;
               }

               if (var2) {
                  if (var25 != null) {
                     var12 = var25;
                     var14 = false;
                     lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.a()
                        .createCommandEncoder()
                        .clearColorTexture(var12, var7);
                     break label94;
                  }

                  if (!var2) {
                     break label94;
                  }

                  var25 = var15;
               }

               if (var25 != null) {
                  boolean var18 = false;
                  lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.a()
                     .createCommandEncoder()
                     .clearDepthTexture(var15, var8);
               }
            }

            if (var2) {
               return var5;
            }
         }

         GpuTexture var26 = var5.getColorTexture();
         Intrinsics.checkNotNull(var26);
         GpuTexture var6 = var26;
         byte var20 = 0;
         boolean var21 = false;
         lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.a().createCommandEncoder().clearColorTexture(var6, var20);
         return var5;
      }
   }

   @JvmOverloads
   public lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl(@NotNull String var1, boolean var2) {
      short var10001 = 2087;
      short var10002 = 2019;
      Intrinsics.checkNotNullParameter(var1, "name");
      this(var1, var2, 0, 4, null);
   }

   public static void b(boolean var0) {
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var0;
   }

   public static boolean e() {
      return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   public static boolean f() {
      boolean var0 = e();
      return !var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "ðD·n\u0004ª½üQ";
      int var4 = "ðD·n\u0004ª½üQ".length();
      b(false);
      char var1 = 4;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 67;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 67;
               var10006 = var6;
            } else {
               var13 = 67;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 67;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 27;
                  case 1 -> 95;
                  case 2 -> 47;
                  case 3 -> 14;
                  case 4 -> 101;
                  case 5 -> 38;
                  default -> 103;
               });
               var6++;
               if (var13 == 0) {
                  var10006 = var13;
                  var10005 = var10002;
                  var16 = var13;
               } else {
                  if (var8 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var16 = var13;
                  var10006 = var6;
               }
            }
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var5[var3++] = var15;
         if ((var0 += var1) >= var4) {
            a = var5;
            b = new String[2];
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 2086) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 17;
            case 1 -> 167;
            case 2 -> 249;
            case 3 -> 98;
            case 4 -> 101;
            case 5 -> 253;
            case 6 -> 141;
            case 7 -> 209;
            case 8 -> 139;
            case 9 -> 173;
            case 10 -> 41;
            case 11 -> 115;
            case 12 -> 51;
            case 13 -> 171;
            case 14 -> 93;
            case 15 -> 250;
            case 16 -> 232;
            case 17 -> 49;
            case 18 -> 43;
            case 19 -> 22;
            case 20 -> 135;
            case 21 -> 32;
            case 22 -> 240;
            case 23 -> 57;
            case 24 -> 8;
            case 25 -> 247;
            case 26 -> 117;
            case 27 -> 198;
            case 28 -> 166;
            case 29 -> 236;
            case 30 -> 2;
            case 31 -> 205;
            case 32 -> 75;
            case 33 -> 35;
            case 34 -> 226;
            case 35 -> 90;
            case 36 -> 30;
            case 37 -> 118;
            case 38 -> 212;
            case 39 -> 78;
            case 40 -> 214;
            case 41 -> 133;
            case 42 -> 23;
            case 43 -> 177;
            case 44 -> 174;
            case 45 -> 190;
            case 46 -> 193;
            case 47 -> 104;
            case 48 -> 172;
            case 49 -> 152;
            case 50 -> 77;
            case 51 -> 13;
            case 52 -> 153;
            case 53 -> 227;
            case 54 -> 233;
            case 55 -> 144;
            case 56 -> 106;
            case 57 -> 243;
            case 58 -> 159;
            case 59 -> 237;
            case 60 -> 9;
            case 61 -> 218;
            case 62 -> 19;
            case 63 -> 169;
            case 64 -> 238;
            case 65 -> 151;
            case 66 -> 112;
            case 67 -> 246;
            case 68 -> 126;
            case 69 -> 47;
            case 70 -> 85;
            case 71 -> 230;
            case 72 -> 194;
            case 73 -> 33;
            case 74 -> 145;
            case 75 -> 221;
            case 76 -> 28;
            case 77 -> 196;
            case 78 -> 224;
            case 79 -> 254;
            case 80 -> 251;
            case 81 -> 140;
            case 82 -> 191;
            case 83 -> 64;
            case 84 -> 127;
            case 85 -> 128;
            case 86 -> 161;
            case 87 -> 14;
            case 88 -> 55;
            case 89 -> 123;
            case 90 -> 102;
            case 91 -> 131;
            case 92 -> 70;
            case 93 -> 239;
            case 94 -> 178;
            case 95 -> 59;
            case 96 -> 87;
            case 97 -> 223;
            case 98 -> 5;
            case 99 -> 202;
            case 100 -> 189;
            case 101 -> 27;
            case 102 -> 39;
            case 103 -> 147;
            case 104 -> 160;
            case 105 -> 252;
            case 106 -> 36;
            case 107 -> 86;
            case 108 -> 187;
            case 109 -> 215;
            case 110 -> 80;
            case 111 -> 162;
            case 112 -> 186;
            case 113 -> 208;
            case 114 -> 146;
            case 115 -> 34;
            case 116 -> 121;
            case 117 -> 165;
            case 118 -> 26;
            case 119 -> 105;
            case 120 -> 99;
            case 121 -> 168;
            case 122 -> 109;
            case 123 -> 82;
            case 124 -> 120;
            case 125 -> 134;
            case 126 -> 21;
            case 127 -> 203;
            case 128 -> 91;
            case 129 -> 6;
            case 130 -> 73;
            case 131 -> 111;
            case 132 -> 18;
            case 133 -> 62;
            case 134 -> 113;
            case 135 -> 81;
            case 136 -> 11;
            case 137 -> 244;
            case 138 -> 216;
            case 139 -> 40;
            case 140 -> 148;
            case 141 -> 149;
            case 142 -> 136;
            case 143 -> 199;
            case 144 -> 228;
            case 145 -> 3;
            case 146 -> 108;
            case 147 -> 84;
            case 148 -> 116;
            case 149 -> 96;
            case 150 -> 200;
            case 151 -> 229;
            case 152 -> 197;
            case 153 -> 211;
            case 154 -> 176;
            case 155 -> 37;
            case 156 -> 65;
            case 157 -> 10;
            case 158 -> 16;
            case 159 -> 129;
            case 160 -> 248;
            case 161 -> 170;
            case 162 -> 54;
            case 163 -> 204;
            case 164 -> 110;
            case 165 -> 25;
            case 166 -> 88;
            case 167 -> 183;
            case 168 -> 138;
            case 169 -> 155;
            case 170 -> 0;
            case 171 -> 67;
            case 172 -> 132;
            case 173 -> 89;
            case 174 -> 52;
            case 175 -> 125;
            case 176 -> 1;
            case 177 -> 188;
            case 178 -> 24;
            case 179 -> 76;
            case 180 -> 95;
            case 181 -> 242;
            case 182 -> 60;
            case 183 -> 124;
            case 184 -> 219;
            case 185 -> 179;
            case 186 -> 154;
            case 187 -> 163;
            case 188 -> 206;
            case 189 -> 20;
            case 190 -> 74;
            case 191 -> 142;
            case 192 -> 83;
            case 193 -> 114;
            case 194 -> 79;
            case 195 -> 158;
            case 196 -> 195;
            case 197 -> 175;
            case 198 -> 222;
            case 199 -> 225;
            case 200 -> 44;
            case 201 -> 130;
            case 202 -> 15;
            case 203 -> 185;
            case 204 -> 143;
            case 205 -> 68;
            case 206 -> 192;
            case 207 -> 61;
            case 208 -> 235;
            case 209 -> 4;
            case 210 -> 66;
            case 211 -> 207;
            case 212 -> 48;
            case 213 -> 122;
            case 214 -> 58;
            case 215 -> 164;
            case 216 -> 137;
            case 217 -> 31;
            case 218 -> 157;
            case 219 -> 107;
            case 220 -> 42;
            case 221 -> 94;
            case 222 -> 241;
            case 223 -> 38;
            case 224 -> 7;
            case 225 -> 72;
            case 226 -> 97;
            case 227 -> 53;
            case 228 -> 69;
            case 229 -> 46;
            case 230 -> 100;
            case 231 -> 245;
            case 232 -> 210;
            case 233 -> 181;
            case 234 -> 156;
            case 235 -> 12;
            case 236 -> 255;
            case 237 -> 150;
            case 238 -> 119;
            case 239 -> 92;
            case 240 -> 103;
            case 241 -> 45;
            case 242 -> 71;
            case 243 -> 231;
            case 244 -> 182;
            case 245 -> 220;
            case 246 -> 180;
            case 247 -> 217;
            case 248 -> 234;
            case 249 -> 213;
            case 250 -> 29;
            case 251 -> 184;
            case 252 -> 50;
            case 253 -> 56;
            case 254 -> 201;
            default -> 63;
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
   public lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl(java.lang.String p0, boolean p1, int p2, int p3, kotlin.jvm.internal.DefaultConstructorMarker p4) {
      if ((p3 & 4) != 0) { p2 = 1; }
      this(p0, p1, p2);
   }
}
