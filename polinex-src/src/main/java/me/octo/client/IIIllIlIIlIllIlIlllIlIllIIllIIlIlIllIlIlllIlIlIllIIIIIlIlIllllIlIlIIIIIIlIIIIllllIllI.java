package me.octo.client;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIIllIlIIlIllIlIlllIlIllIIllIIlIlIllIlIlllIlIlIllIIIIIlIlIllllIlIlIIIIIIlIIIIllllIllI {
   @SerializedName("yaw")
   private final float IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @SerializedName("pitch")
   private final float lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] a;
   private static String[] b;

   public IIIllIlIIlIllIlIlllIlIllIIllIIlIlIllIlIlllIlIlIllIIIIIlIlIllllIlIlIIIIIIlIIIIllllIllI(
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII float var1,
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII float var2
   ) {
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
   }

   public final float a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   public final float b() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final float c() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   public final float d() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final IIIllIlIIlIllIlIlllIlIllIIllIIlIlIllIlIlllIlIlIllIIIIIlIlIllllIlIlIIIIIIlIIIIllllIllI a(
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII float var1,
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII float var2
   ) {
      return new IIIllIlIIlIllIlIlllIlIllIIllIIlIlIllIlIlllIlIlIllIIIIIlIlIllllIlIlIIIIIIlIIIIllllIllI(var1, var2);
   }

   @NotNull
   @Override
   public String toString() {
      short var10002 = 6570;
      short var10003 = 7060;
      var10003 = 6571;
      short var10004 = -21148;
      return "RotationData(yaw="
         + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         + ", pitch="
         + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         + ")";
   }

   @Override
   public int hashCode() {
      int var1 = Float.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
      return var1 * 31 + Float.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      boolean var2 = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.R();
      Object var10000 = this;
      if (!var2) {
         if (this == var1) {
            return true;
         }

         var10000 = var1;
      }

      if (!var2) {
         if (!(var10000 instanceof IIIllIlIIlIllIlIlllIlIllIIllIIlIlIllIlIlllIlIlIllIIIIIlIlIllllIlIlIIIIIIlIIIIllllIllI)) {
            return false;
         }

         var10000 = var1;
      }

      IIIllIlIIlIllIlIlllIlIllIIllIIlIlIllIlIlllIlIlIllIIIIIlIlIllllIlIlIIIIIIlIIIIllllIllI var3 = (IIIllIlIIlIllIlIlllIlIllIIllIIlIlIllIlIlllIlIlIllIIIIIlIlIllllIlIlIIIIIIlIIIIllllIllI)var10000;
      int var4 = Float.compare(
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
      );
      if (!var2) {
         if (var4 != 0) {
            return false;
         }

         var4 = Float.compare(
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         );
      }

      if (!var2) {
         if (var4 != 0) {
            return false;
         }

         var4 = 1;
      }

      return (var4 != 0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "C\u0080\u0013T<»l¥Ôa\u0085ÐwPZ´,\b&\u0084\nz\u009b}\u009fe";
      int var4 = "C\u0080\u0013T<»l¥Ôa\u0085ÐwPZ´,\b&\u0084\nz\u009b}\u009fe".length();
      char var1 = 17;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 127;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 127;
               var10006 = var6;
            } else {
               var13 = 127;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 127;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 37;
                  case 1 -> 66;
                  case 2 -> 35;
                  case 3 -> 127;
                  case 4 -> 36;
                  case 5 -> 106;
                  default -> 106;
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
      int var2 = (var0 ^ 6570) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 42;
            case 1 -> 13;
            case 2 -> 189;
            case 3 -> 204;
            case 4 -> 35;
            case 5 -> 88;
            case 6 -> 220;
            case 7 -> 33;
            case 8 -> 171;
            case 9 -> 148;
            case 10 -> 238;
            case 11 -> 99;
            case 12 -> 239;
            case 13 -> 203;
            case 14 -> 183;
            case 15 -> 76;
            case 16 -> 69;
            case 17 -> 191;
            case 18 -> 158;
            case 19 -> 225;
            case 20 -> 10;
            case 21 -> 45;
            case 22 -> 100;
            case 23 -> 54;
            case 24 -> 50;
            case 25 -> 73;
            case 26 -> 104;
            case 27 -> 205;
            case 28 -> 77;
            case 29 -> 218;
            case 30 -> 75;
            case 31 -> 212;
            case 32 -> 159;
            case 33 -> 12;
            case 34 -> 197;
            case 35 -> 57;
            case 36 -> 64;
            case 37 -> 0;
            case 38 -> 110;
            case 39 -> 92;
            case 40 -> 56;
            case 41 -> 251;
            case 42 -> 190;
            case 43 -> 113;
            case 44 -> 31;
            case 45 -> 81;
            case 46 -> 133;
            case 47 -> 249;
            case 48 -> 135;
            case 49 -> 216;
            case 50 -> 129;
            case 51 -> 245;
            case 52 -> 226;
            case 53 -> 17;
            case 54 -> 223;
            case 55 -> 230;
            case 56 -> 160;
            case 57 -> 83;
            case 58 -> 15;
            case 59 -> 229;
            case 60 -> 236;
            case 61 -> 174;
            case 62 -> 176;
            case 63 -> 124;
            case 64 -> 151;
            case 65 -> 227;
            case 66 -> 188;
            case 67 -> 14;
            case 68 -> 36;
            case 69 -> 60;
            case 70 -> 52;
            case 71 -> 143;
            case 72 -> 71;
            case 73 -> 3;
            case 74 -> 78;
            case 75 -> 198;
            case 76 -> 111;
            case 77 -> 155;
            case 78 -> 219;
            case 79 -> 252;
            case 80 -> 170;
            case 81 -> 58;
            case 82 -> 87;
            case 83 -> 141;
            case 84 -> 214;
            case 85 -> 61;
            case 86 -> 195;
            case 87 -> 136;
            case 88 -> 19;
            case 89 -> 137;
            case 90 -> 72;
            case 91 -> 23;
            case 92 -> 5;
            case 93 -> 244;
            case 94 -> 6;
            case 95 -> 146;
            case 96 -> 89;
            case 97 -> 131;
            case 98 -> 206;
            case 99 -> 63;
            case 100 -> 97;
            case 101 -> 122;
            case 102 -> 106;
            case 103 -> 9;
            case 104 -> 169;
            case 105 -> 208;
            case 106 -> 179;
            case 107 -> 154;
            case 108 -> 180;
            case 109 -> 30;
            case 110 -> 43;
            case 111 -> 101;
            case 112 -> 37;
            case 113 -> 16;
            case 114 -> 222;
            case 115 -> 243;
            case 116 -> 28;
            case 117 -> 80;
            case 118 -> 149;
            case 119 -> 38;
            case 120 -> 199;
            case 121 -> 95;
            case 122 -> 168;
            case 123 -> 163;
            case 124 -> 20;
            case 125 -> 29;
            case 126 -> 103;
            case 127 -> 166;
            case 128 -> 241;
            case 129 -> 48;
            case 130 -> 246;
            case 131 -> 209;
            case 132 -> 200;
            case 133 -> 96;
            case 134 -> 186;
            case 135 -> 62;
            case 136 -> 247;
            case 137 -> 232;
            case 138 -> 41;
            case 139 -> 217;
            case 140 -> 115;
            case 141 -> 215;
            case 142 -> 161;
            case 143 -> 138;
            case 144 -> 7;
            case 145 -> 237;
            case 146 -> 178;
            case 147 -> 90;
            case 148 -> 116;
            case 149 -> 44;
            case 150 -> 82;
            case 151 -> 202;
            case 152 -> 253;
            case 153 -> 150;
            case 154 -> 98;
            case 155 -> 165;
            case 156 -> 233;
            case 157 -> 4;
            case 158 -> 39;
            case 159 -> 94;
            case 160 -> 210;
            case 161 -> 47;
            case 162 -> 213;
            case 163 -> 250;
            case 164 -> 224;
            case 165 -> 2;
            case 166 -> 128;
            case 167 -> 18;
            case 168 -> 8;
            case 169 -> 182;
            case 170 -> 79;
            case 171 -> 254;
            case 172 -> 84;
            case 173 -> 172;
            case 174 -> 125;
            case 175 -> 93;
            case 176 -> 102;
            case 177 -> 134;
            case 178 -> 157;
            case 179 -> 68;
            case 180 -> 167;
            case 181 -> 74;
            case 182 -> 201;
            case 183 -> 121;
            case 184 -> 187;
            case 185 -> 66;
            case 186 -> 255;
            case 187 -> 27;
            case 188 -> 140;
            case 189 -> 156;
            case 190 -> 130;
            case 191 -> 59;
            case 192 -> 132;
            case 193 -> 228;
            case 194 -> 126;
            case 195 -> 40;
            case 196 -> 120;
            case 197 -> 22;
            case 198 -> 114;
            case 199 -> 67;
            case 200 -> 177;
            case 201 -> 193;
            case 202 -> 65;
            case 203 -> 231;
            case 204 -> 107;
            case 205 -> 24;
            case 206 -> 240;
            case 207 -> 145;
            case 208 -> 139;
            case 209 -> 194;
            case 210 -> 91;
            case 211 -> 211;
            case 212 -> 152;
            case 213 -> 85;
            case 214 -> 118;
            case 215 -> 184;
            case 216 -> 1;
            case 217 -> 119;
            case 218 -> 248;
            case 219 -> 175;
            case 220 -> 181;
            case 221 -> 235;
            case 222 -> 34;
            case 223 -> 11;
            case 224 -> 117;
            case 225 -> 207;
            case 226 -> 234;
            case 227 -> 112;
            case 228 -> 51;
            case 229 -> 25;
            case 230 -> 21;
            case 231 -> 46;
            case 232 -> 32;
            case 233 -> 70;
            case 234 -> 147;
            case 235 -> 105;
            case 236 -> 142;
            case 237 -> 164;
            case 238 -> 153;
            case 239 -> 162;
            case 240 -> 26;
            case 241 -> 196;
            case 242 -> 242;
            case 243 -> 123;
            case 244 -> 221;
            case 245 -> 86;
            case 246 -> 173;
            case 247 -> 108;
            case 248 -> 144;
            case 249 -> 53;
            case 250 -> 127;
            case 251 -> 55;
            case 252 -> 192;
            case 253 -> 109;
            case 254 -> 185;
            default -> 49;
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

  // PX-FIX synth restored from jar bytecode
  // PX-FIX synth restored from jar bytecode: Kotlin default-argument bridge
  public me.octo.client.IIIllIlIIlIllIlIlllIlIllIIllIIlIlIllIlIlllIlIlIllIIIIIlIlIllllIlIlIIIIIIlIIIIllllIllI a(me.octo.client.IIIllIlIIlIllIlIlllIlIllIIllIIlIlIllIlIlllIlIlIllIIIIIlIlIllllIlIlIIIIIIlIIIIllllIllI p0, float p1, float p2, int p3, java.lang.Object p4) {
     float var1 = p1;
     float var2 = p2;
     if (me.octo.client.llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.Q()) {
        if ((p3 & 1) != 0) {
           var1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        }
     }
     if ((p3 & 2) != 0) {
        var2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
     }
     return p0.a(var1, var2);
  }
}
