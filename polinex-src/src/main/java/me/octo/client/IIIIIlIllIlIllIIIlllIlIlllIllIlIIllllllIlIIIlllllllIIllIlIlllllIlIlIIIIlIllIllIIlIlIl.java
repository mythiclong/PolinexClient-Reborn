package me.octo.client;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.renderer.texture.AbstractTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public record IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl(
   @NotNull RenderPipeline a, @NotNull Map<String, AbstractTexture> b, @NotNull Map<String, GpuBufferSlice> c
) {
   private static String[] d;
   private static String[] e;

   public IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl(
      @NotNull RenderPipeline a, @NotNull Map<String, AbstractTexture> b, @NotNull Map<String, GpuBufferSlice> c
   ) {
      short var10001 = 14073;
      short var10002 = 22268;
      Intrinsics.checkNotNullParameter(a, "pipeline");
      var10001 = 14076;
      var10002 = -24352;
      Intrinsics.checkNotNullParameter(b, "textures");
      var10001 = 14071;
      var10002 = 4582;
      Intrinsics.checkNotNullParameter(c, "uniforms");
            this.a = a;
      this.b = b;
      this.c = c;
   }

   public IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl(
      RenderPipeline var0, Map var1, Map var2, int var3, kotlin.jvm.internal.DefaultConstructorMarker var4
   ) {
      this(var0,
         (Map<String, AbstractTexture>)(Map<?, ?>)((var3 & 2) != 0 ? kotlin.collections.MapsKt.emptyMap() : var1),
         (Map<String, GpuBufferSlice>)(Map<?, ?>)((var3 & 4) != 0 ? kotlin.collections.MapsKt.emptyMap() : var2)
      );
   }

   @NotNull
   public final RenderPipeline d() {
      return this.a;
   }

   @NotNull
   public final Map<String, AbstractTexture> e() {
      return this.b;
   }

   @NotNull
   public final Map<String, GpuBufferSlice> f() {
      return this.c;
   }

   @NotNull
   public final IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl a(
      @NotNull RenderPipeline var1, @NotNull Map<String, ? extends AbstractTexture> var2, @NotNull Map<String, GpuBufferSlice> var3
   ) {
      short var10001 = 14075;
      short var10002 = -5167;
      Intrinsics.checkNotNullParameter(var1, "pipeline");
      var10001 = 14079;
      var10002 = -20663;
      Intrinsics.checkNotNullParameter(var2, "textures");
      var10001 = 14072;
      var10002 = -21206;
      Intrinsics.checkNotNullParameter(var3, "uniforms");
      return new IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl(
         var1, (Map<String, AbstractTexture>)(Map<?, ?>) var2, var3);
   }

   @NotNull
   @Override
   public String toString() {
      short var10000 = 14077;
      Map var1 = this.c;
      Map var2 = this.b;
      RenderPipeline var3 = this.a;
      short var10001 = 7871;
      short var10002 = 14078;
      short var10003 = 29147;
      short var10004 = 14074;
      short var10005 = -15028;
      return "RenderBufferKey(pipeline=" + var3 + ", textures=" + var2 + ", uniforms=" + var1 + ")";
   }

   @Override
   public int hashCode() {
      int var1 = this.a.hashCode();
      var1 = var1 * 31 + this.b.hashCode();
      return var1 * 31 + this.c.hashCode();
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      boolean var2 = IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.c();
      Object var10000 = this;
      if (!var2) {
         if (this == var1) {
            return true;
         }

         var10000 = var1;
      }

      if (!var2) {
         if (!(var10000 instanceof IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl)) {
            return false;
         }

         var10000 = var1;
      }

      IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl var3 = (IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl)var10000;
      boolean var4 = Intrinsics.areEqual(this.a, var3.a);
      if (!var2) {
         if (!var4) {
            return false;
         }

         var4 = Intrinsics.areEqual(this.b, var3.b);
      }

      if (!var2) {
         if (!var4) {
            return false;
         }

         var4 = Intrinsics.areEqual(this.c, var3.c);
      }

      if (!var2) {
         if (!var4) {
            return false;
         }

         var4 = true;
      }

      return var4;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[9];
      int var3 = 0;
      String var2 = "ÒLñîh°[\u0099\u000b¸/ã~ª\u0097¿º=1\u0089\u0019²\u0011\tU³Õ\u00153ºòBÒ/ë~èÀ\u0083B´²ö\u00adÖñ\b[¿À\u0090N\u007f\u009f`\b\u008d[\u0096\u0090\u0094Wõ\u000b\u000bxÊúÉ¹\u0019ô;\u0005\u0001\u0087\b\u0098n46À\u0083\u007f\u0091";
      int var4 = "ÒLñîh°[\u0099\u000b¸/ã~ª\u0097¿º=1\u0089\u0019²\u0011\tU³Õ\u00153ºòBÒ/ë~èÀ\u0083B´²ö\u00adÖñ\b[¿À\u0090N\u007f\u009f`\b\u008d[\u0096\u0090\u0094Wõ\u000b\u000bxÊúÉ¹\u0019ô;\u0005\u0001\u0087\b\u0098n46À\u0083\u007f\u0091"
         .length();
      char var1 = '\b';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 103;
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
                     case 0 -> 110;
                     case 1 -> 91;
                     case 2 -> 111;
                     case 3 -> 58;
                     case 4 -> 50;
                     case 5 -> 41;
                     default -> 37;
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
                     e = new String[9];
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

                  var2 = "¸+þ\bÒN/4\bF\u0085!Ý)ôPc";
                  var4 = "¸+þ\bÒN/4\bF\u0085!Ý)ôPc".length();
                  var1 = '\b';
                  var8 = -1;
            }

            var10000 = 62;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 14079) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 162;
            case 1 -> 247;
            case 2 -> 142;
            case 3 -> 240;
            case 4 -> 127;
            case 5 -> 97;
            case 6 -> 244;
            case 7 -> 105;
            case 8 -> 201;
            case 9 -> 63;
            case 10 -> 10;
            case 11 -> 121;
            case 12 -> 107;
            case 13 -> 90;
            case 14 -> 220;
            case 15 -> 192;
            case 16 -> 56;
            case 17 -> 30;
            case 18 -> 102;
            case 19 -> 250;
            case 20 -> 235;
            case 21 -> 32;
            case 22 -> 131;
            case 23 -> 133;
            case 24 -> 196;
            case 25 -> 24;
            case 26 -> 194;
            case 27 -> 78;
            case 28 -> 199;
            case 29 -> 77;
            case 30 -> 119;
            case 31 -> 219;
            case 32 -> 209;
            case 33 -> 178;
            case 34 -> 72;
            case 35 -> 86;
            case 36 -> 163;
            case 37 -> 188;
            case 38 -> 4;
            case 39 -> 88;
            case 40 -> 18;
            case 41 -> 64;
            case 42 -> 151;
            case 43 -> 245;
            case 44 -> 103;
            case 45 -> 59;
            case 46 -> 153;
            case 47 -> 5;
            case 48 -> 255;
            case 49 -> 137;
            case 50 -> 79;
            case 51 -> 182;
            case 52 -> 92;
            case 53 -> 139;
            case 54 -> 13;
            case 55 -> 47;
            case 56 -> 251;
            case 57 -> 96;
            case 58 -> 82;
            case 59 -> 227;
            case 60 -> 128;
            case 61 -> 60;
            case 62 -> 191;
            case 63 -> 229;
            case 64 -> 37;
            case 65 -> 170;
            case 66 -> 252;
            case 67 -> 112;
            case 68 -> 34;
            case 69 -> 52;
            case 70 -> 7;
            case 71 -> 203;
            case 72 -> 208;
            case 73 -> 44;
            case 74 -> 81;
            case 75 -> 226;
            case 76 -> 25;
            case 77 -> 125;
            case 78 -> 58;
            case 79 -> 28;
            case 80 -> 212;
            case 81 -> 100;
            case 82 -> 186;
            case 83 -> 205;
            case 84 -> 109;
            case 85 -> 161;
            case 86 -> 200;
            case 87 -> 218;
            case 88 -> 193;
            case 89 -> 51;
            case 90 -> 254;
            case 91 -> 234;
            case 92 -> 1;
            case 93 -> 115;
            case 94 -> 8;
            case 95 -> 202;
            case 96 -> 120;
            case 97 -> 145;
            case 98 -> 38;
            case 99 -> 190;
            case 100 -> 173;
            case 101 -> 36;
            case 102 -> 246;
            case 103 -> 106;
            case 104 -> 222;
            case 105 -> 71;
            case 106 -> 249;
            case 107 -> 54;
            case 108 -> 181;
            case 109 -> 12;
            case 110 -> 111;
            case 111 -> 189;
            case 112 -> 43;
            case 113 -> 239;
            case 114 -> 40;
            case 115 -> 117;
            case 116 -> 69;
            case 117 -> 134;
            case 118 -> 61;
            case 119 -> 116;
            case 120 -> 165;
            case 121 -> 157;
            case 122 -> 236;
            case 123 -> 9;
            case 124 -> 126;
            case 125 -> 73;
            case 126 -> 159;
            case 127 -> 146;
            case 128 -> 206;
            case 129 -> 166;
            case 130 -> 124;
            case 131 -> 35;
            case 132 -> 221;
            case 133 -> 160;
            case 134 -> 104;
            case 135 -> 76;
            case 136 -> 248;
            case 137 -> 185;
            case 138 -> 228;
            case 139 -> 68;
            case 140 -> 84;
            case 141 -> 85;
            case 142 -> 122;
            case 143 -> 0;
            case 144 -> 74;
            case 145 -> 27;
            case 146 -> 22;
            case 147 -> 253;
            case 148 -> 138;
            case 149 -> 231;
            case 150 -> 180;
            case 151 -> 16;
            case 152 -> 242;
            case 153 -> 197;
            case 154 -> 75;
            case 155 -> 168;
            case 156 -> 101;
            case 157 -> 89;
            case 158 -> 183;
            case 159 -> 198;
            case 160 -> 232;
            case 161 -> 70;
            case 162 -> 213;
            case 163 -> 238;
            case 164 -> 31;
            case 165 -> 172;
            case 166 -> 171;
            case 167 -> 57;
            case 168 -> 6;
            case 169 -> 143;
            case 170 -> 147;
            case 171 -> 179;
            case 172 -> 45;
            case 173 -> 230;
            case 174 -> 237;
            case 175 -> 80;
            case 176 -> 210;
            case 177 -> 62;
            case 178 -> 95;
            case 179 -> 174;
            case 180 -> 113;
            case 181 -> 195;
            case 182 -> 177;
            case 183 -> 207;
            case 184 -> 211;
            case 185 -> 3;
            case 186 -> 39;
            case 187 -> 214;
            case 188 -> 53;
            case 189 -> 98;
            case 190 -> 149;
            case 191 -> 156;
            case 192 -> 93;
            case 193 -> 83;
            case 194 -> 66;
            case 195 -> 114;
            case 196 -> 91;
            case 197 -> 11;
            case 198 -> 187;
            case 199 -> 135;
            case 200 -> 46;
            case 201 -> 2;
            case 202 -> 15;
            case 203 -> 29;
            case 204 -> 99;
            case 205 -> 123;
            case 206 -> 158;
            case 207 -> 216;
            case 208 -> 94;
            case 209 -> 33;
            case 210 -> 20;
            case 211 -> 42;
            case 212 -> 19;
            case 213 -> 41;
            case 214 -> 223;
            case 215 -> 225;
            case 216 -> 129;
            case 217 -> 241;
            case 218 -> 67;
            case 219 -> 154;
            case 220 -> 184;
            case 221 -> 148;
            case 222 -> 176;
            case 223 -> 17;
            case 224 -> 224;
            case 225 -> 150;
            case 226 -> 87;
            case 227 -> 130;
            case 228 -> 155;
            case 229 -> 14;
            case 230 -> 175;
            case 231 -> 144;
            case 232 -> 141;
            case 233 -> 132;
            case 234 -> 204;
            case 235 -> 169;
            case 236 -> 21;
            case 237 -> 243;
            case 238 -> 110;
            case 239 -> 167;
            case 240 -> 164;
            case 241 -> 26;
            case 242 -> 48;
            case 243 -> 50;
            case 244 -> 215;
            case 245 -> 233;
            case 246 -> 152;
            case 247 -> 49;
            case 248 -> 217;
            case 249 -> 23;
            case 250 -> 136;
            case 251 -> 108;
            case 252 -> 140;
            case 253 -> 118;
            case 254 -> 55;
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

         e[var2] = new String(var3).intern();
      }

      return e[var2];
   }

   public static final IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl a(
      IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl var0,
      RenderPipeline var1, Map var2, Map var3, int var4, Object var5
   ) {
      if ((var4 & 2) != 0) {
         var2 = var0.b;
      }

      if ((var4 & 4) != 0) {
         var3 = var0.c;
      }

      return var0.a(var1, var2, var3);
   }
}
