package me.octo.client.utils;

import lombok.Generated;

public class llllllIIIlllIlIllIIlIIIIIIIIllIIlllIIIIllllIlIlIIlIIllllIIIlIIllIlIIlIllIlIIIIlIIlIII<A, B> {
   private A IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private B lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] a;
   private static String[] b;

   @Generated
   @Override
   public boolean equals(Object var1) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = llllllIIlllIIIIIlIllIIIIIIllIIIIllIllIIllIlIIIIlIIllIIllIIlIIIlIIIIIlIllIlIlIIIIlIlII.b();
      Object var10000 = var1;
      if (var2 == null) {
         if (var1 == this) {
            return true;
         }

         var10000 = var1;
      }

      if (var2 == null) {
         if (!(var10000 instanceof llllllIIIlllIlIllIIlIIIIIIIIllIIlllIIIIllllIlIlIIlIIllllIIIlIIllIlIIlIllIlIIIIlIIlIII)) {
            return false;
         }

         var10000 = var1;
      }

      llllllIIIlllIlIllIIlIIIIIIIIllIIlllIIIIllllIlIlIIlIIllllIIIlIIllIlIIlIllIlIIIIlIIlIII var3 = (llllllIIIlllIlIllIIlIIIIIIIIllIIlllIIIIllllIlIlIIlIIllllIIIlIIllIlIIlIllIlIIIIlIIlIII)var10000;
      var10000 = var3;
      if (var2 == null) {
         if (!var3.a(this)) {
            return false;
         }

         var10000 = this.a();
      }

      label73: {
         label82: {
            Object var4 = var10000;
            Object var5 = var3.a();
            var10000 = var4;
            if (var2 == null) {
               if (var4 == null) {
                  var10000 = var5;
                  if (var2 != null) {
                     break label73;
                  }

                  if (var5 != null) {
                     return false;
                  }
                  break label82;
               }

               var10000 = var4;
            }

            if (var2 != null) {
               break label73;
            }

            if (!var10000.equals(var5)) {
               return false;
            }
         }

         var10000 = this.b();
      }

      Object var6 = var10000;
      Object var7 = var3.b();
      var10000 = var6;
      if (var2 == null) {
         if (var6 == null) {
            if (var7 != null) {
               return false;
            }

            return true;
         }

         var10000 = var6;
      }

      boolean var11 = var10000.equals(var7);
      return var2 != null ? var11 : var11;
   }

   @Generated
   protected boolean a(Object var1) {
      return var1 instanceof llllllIIIlllIlIllIIlIIIIIIIIllIIlllIIIIllllIlIlIIlIIllllIIIlIIllIlIIlIllIlIIIIlIIlIII;
   }

   @Generated
   @Override
   public int hashCode() {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1;
      int var8;
      int var10;
      label29: {
         lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = llllllIIlllIIIIIlIllIIIIIIllIIIIllIllIIllIlIIIIlIIllIIllIIlIIIlIIIIIlIllIlIlIIIIlIlII.b();
         byte var2 = 59;
         var1 = var10000;
         byte var3 = 1;
         Object var4 = this.a();
         var8 = var3 * 59;
         Object var10001 = var4;
         if (var1 == null) {
            if (var4 == null) {
               var10 = 43;
               break label29;
            }

            var10001 = var4;
         }

         var10 = var10001.hashCode();
      }

      label23: {
         int var6 = var8 + var10;
         Object var5 = this.b();
         var8 = var6 * 59;
         Object var11 = var5;
         if (var1 == null) {
            if (var5 == null) {
               var10 = 43;
               break label23;
            }

            var11 = var5;
         }

         var10 = var11.hashCode();
      }

      int var7 = var8 + var10;
      if (var1 != null) {
         lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[2]
         );
      }

      return var7;
   }

   @Generated
   @Override
   public String toString() {
      String var10000 = String.valueOf(this.a());
      String var10001 = String.valueOf(this.b());
      short var10002 = 18419;
      short var10003 = -10567;
      var10003 = 18418;
      short var10004 = -4042;
      return "Tuple(first=" + var10000 + ", second=" + var10001 + ")";
   }

   @Generated
   public A a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @Generated
   public B b() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @Generated
   public void b(A var1) {
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = (A)var1;
   }

   @Generated
   public void c(B var1) {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = (B)var1;
   }

   @Generated
   public llllllIIIlllIlIllIIlIIIIIIIIllIIlllIIIIllllIlIlIIlIIllllIIIlIIllIlIIlIllIlIIIIlIIlIII(A var1, B var2) {
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = (A)var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = (B)var2;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "s\u000b¯÷~\u0082A\u009e/\f©\u0095\u0080ÒþI\u009fE²\u0084ÉE";
      int var4 = "s\u000b¯÷~\u0082A\u009e/\f©\u0095\u0080ÒþI\u009fE²\u0084ÉE".length();
      char var1 = '\t';
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 53;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 53;
               var10006 = var6;
            } else {
               var13 = 53;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 53;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 23;
                  case 1 -> 41;
                  case 2 -> 106;
                  case 3 -> 97;
                  case 4 -> 43;
                  case 5 -> 101;
                  default -> 25;
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
            break pxClinit; // PX-FIX
         }

         var1 = var2.charAt(var0);
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 18418) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 19;
            case 1 -> 135;
            case 2 -> 106;
            case 3 -> 109;
            case 4 -> 0;
            case 5 -> 229;
            case 6 -> 52;
            case 7 -> 148;
            case 8 -> 76;
            case 9 -> 36;
            case 10 -> 45;
            case 11 -> 114;
            case 12 -> 107;
            case 13 -> 232;
            case 14 -> 142;
            case 15 -> 26;
            case 16 -> 53;
            case 17 -> 207;
            case 18 -> 10;
            case 19 -> 15;
            case 20 -> 249;
            case 21 -> 62;
            case 22 -> 32;
            case 23 -> 252;
            case 24 -> 131;
            case 25 -> 224;
            case 26 -> 151;
            case 27 -> 192;
            case 28 -> 56;
            case 29 -> 213;
            case 30 -> 116;
            case 31 -> 38;
            case 32 -> 5;
            case 33 -> 234;
            case 34 -> 210;
            case 35 -> 58;
            case 36 -> 81;
            case 37 -> 157;
            case 38 -> 202;
            case 39 -> 220;
            case 40 -> 165;
            case 41 -> 78;
            case 42 -> 217;
            case 43 -> 193;
            case 44 -> 196;
            case 45 -> 244;
            case 46 -> 180;
            case 47 -> 181;
            case 48 -> 170;
            case 49 -> 43;
            case 50 -> 222;
            case 51 -> 20;
            case 52 -> 50;
            case 53 -> 199;
            case 54 -> 154;
            case 55 -> 105;
            case 56 -> 24;
            case 57 -> 150;
            case 58 -> 173;
            case 59 -> 243;
            case 60 -> 178;
            case 61 -> 86;
            case 62 -> 55;
            case 63 -> 30;
            case 64 -> 236;
            case 65 -> 221;
            case 66 -> 89;
            case 67 -> 100;
            case 68 -> 13;
            case 69 -> 27;
            case 70 -> 8;
            case 71 -> 3;
            case 72 -> 190;
            case 73 -> 242;
            case 74 -> 162;
            case 75 -> 183;
            case 76 -> 127;
            case 77 -> 175;
            case 78 -> 48;
            case 79 -> 108;
            case 80 -> 40;
            case 81 -> 185;
            case 82 -> 34;
            case 83 -> 246;
            case 84 -> 235;
            case 85 -> 188;
            case 86 -> 61;
            case 87 -> 247;
            case 88 -> 203;
            case 89 -> 118;
            case 90 -> 197;
            case 91 -> 174;
            case 92 -> 189;
            case 93 -> 155;
            case 94 -> 250;
            case 95 -> 255;
            case 96 -> 186;
            case 97 -> 70;
            case 98 -> 168;
            case 99 -> 128;
            case 100 -> 71;
            case 101 -> 182;
            case 102 -> 205;
            case 103 -> 240;
            case 104 -> 147;
            case 105 -> 253;
            case 106 -> 16;
            case 107 -> 129;
            case 108 -> 163;
            case 109 -> 101;
            case 110 -> 14;
            case 111 -> 200;
            case 112 -> 177;
            case 113 -> 239;
            case 114 -> 137;
            case 115 -> 179;
            case 116 -> 42;
            case 117 -> 214;
            case 118 -> 120;
            case 119 -> 64;
            case 120 -> 1;
            case 121 -> 73;
            case 122 -> 215;
            case 123 -> 44;
            case 124 -> 141;
            case 125 -> 152;
            case 126 -> 18;
            case 127 -> 245;
            case 128 -> 83;
            case 129 -> 122;
            case 130 -> 17;
            case 131 -> 79;
            case 132 -> 21;
            case 133 -> 33;
            case 134 -> 47;
            case 135 -> 238;
            case 136 -> 93;
            case 137 -> 9;
            case 138 -> 187;
            case 139 -> 218;
            case 140 -> 160;
            case 141 -> 156;
            case 142 -> 248;
            case 143 -> 144;
            case 144 -> 7;
            case 145 -> 230;
            case 146 -> 74;
            case 147 -> 125;
            case 148 -> 233;
            case 149 -> 228;
            case 150 -> 75;
            case 151 -> 59;
            case 152 -> 67;
            case 153 -> 111;
            case 154 -> 130;
            case 155 -> 166;
            case 156 -> 63;
            case 157 -> 68;
            case 158 -> 115;
            case 159 -> 153;
            case 160 -> 117;
            case 161 -> 201;
            case 162 -> 132;
            case 163 -> 223;
            case 164 -> 95;
            case 165 -> 84;
            case 166 -> 121;
            case 167 -> 231;
            case 168 -> 158;
            case 169 -> 94;
            case 170 -> 77;
            case 171 -> 226;
            case 172 -> 216;
            case 173 -> 171;
            case 174 -> 12;
            case 175 -> 25;
            case 176 -> 96;
            case 177 -> 65;
            case 178 -> 139;
            case 179 -> 211;
            case 180 -> 28;
            case 181 -> 124;
            case 182 -> 161;
            case 183 -> 219;
            case 184 -> 104;
            case 185 -> 102;
            case 186 -> 110;
            case 187 -> 80;
            case 188 -> 195;
            case 189 -> 82;
            case 190 -> 37;
            case 191 -> 167;
            case 192 -> 145;
            case 193 -> 90;
            case 194 -> 225;
            case 195 -> 23;
            case 196 -> 87;
            case 197 -> 91;
            case 198 -> 69;
            case 199 -> 138;
            case 200 -> 11;
            case 201 -> 112;
            case 202 -> 172;
            case 203 -> 72;
            case 204 -> 194;
            case 205 -> 103;
            case 206 -> 119;
            case 207 -> 134;
            case 208 -> 126;
            case 209 -> 204;
            case 210 -> 159;
            case 211 -> 46;
            case 212 -> 241;
            case 213 -> 98;
            case 214 -> 169;
            case 215 -> 146;
            case 216 -> 123;
            case 217 -> 6;
            case 218 -> 237;
            case 219 -> 31;
            case 220 -> 176;
            case 221 -> 41;
            case 222 -> 97;
            case 223 -> 4;
            case 224 -> 39;
            case 225 -> 251;
            case 226 -> 212;
            case 227 -> 49;
            case 228 -> 57;
            case 229 -> 164;
            case 230 -> 54;
            case 231 -> 92;
            case 232 -> 29;
            case 233 -> 136;
            case 234 -> 184;
            case 235 -> 99;
            case 236 -> 60;
            case 237 -> 133;
            case 238 -> 191;
            case 239 -> 113;
            case 240 -> 35;
            case 241 -> 209;
            case 242 -> 143;
            case 243 -> 140;
            case 244 -> 22;
            case 245 -> 66;
            case 246 -> 198;
            case 247 -> 254;
            case 248 -> 51;
            case 249 -> 227;
            case 250 -> 206;
            case 251 -> 85;
            case 252 -> 2;
            case 253 -> 208;
            case 254 -> 88;
            default -> 149;
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
