package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import me.octo.client.IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll;
import org.jetbrains.annotations.NotNull;

public final class llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII(Object... px) {
           this((IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI)null, (Object[])null, (String[])null); // PX-FIX: 委托主构造器（final 字段初始化）
        }

   @NotNull
   private final IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final Object[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String[] a;
   private static String[] b;

   public llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII(
      @NotNull IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI var1, @NotNull Object[] var2, @NotNull String[] var3
   ) {
      short var10001 = 18187;
      short var10002 = -10164;
      Intrinsics.checkNotNullParameter(var1, "command");
      var10001 = 18186;
      var10002 = 16328;
      Intrinsics.checkNotNullParameter(var2, "arguments");
      var10001 = 18188;
      var10002 = 345;
      Intrinsics.checkNotNullParameter(var3, "originalArguments");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
   }

   @NotNull
   public final IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public final Object[] b() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final String[] c() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   /**
    * Recovered from the jar: Kotlin {@code inline fun <reified T> get(name: String): T?} over
    * {@code command.b()} (the argument descriptors) paired positionally with {@code b()} (the raw
    * argument array).  Returns the argument value whose name matches, otherwise null.
    */
   @SuppressWarnings("unchecked")
   public final <T> T a(@NotNull String var1) {
      Intrinsics.checkNotNullParameter(var1, "name");
      int var2 = 0;
      String var3 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.k();
      for (Object var4 : this.a().b()) {
         int var5 = var2++;
         if (var3 != null) {
            IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll var6 = (IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll)var4;
            if (var3 != null && Intrinsics.areEqual(var6.a(), var1) && var5 < this.b().length) {
               return (T)this.b()[var5];
            }
         }
      }
      return null;
   }

   /**
    * Recovered from the jar: Kotlin {@code inline fun <reified T> get(name: String, def: T): T}
    * over the same name/position pairing; falls back to {@code var2} when nothing matches.
    */
   @SuppressWarnings("unchecked")
   public final <T> T a(@NotNull String var1, T var2) {
      String var3 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.k();
      Intrinsics.checkNotNullParameter(var1, "name");
      int var4 = 0;
      Object var5 = null;
      for (Object var6 : this.a().b()) {
         int var7 = var4++;
         if (var3 != null) {
            IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll var8 = (IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll)var6;
            if (var3 != null && Intrinsics.areEqual(var8.a(), var1) && var7 < this.b().length) {
               var5 = this.b()[var7];
               break;
            }
         }
      }
      if (var5 == null) {
         var5 = var2;
      }
      return (T)var5;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "x\u009f\u0001t\u0002É\u0089\t_³\u0001\u0090\u0087\u009bL§p\u0007\bø£_\u0094r©";
      int var4 = "x\u009f\u0001t\u0002É\u0089\t_³\u0001\u0090\u0087\u009bL§p\u0007\bø£_\u0094r©".length();
      char var1 = 4;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 44;
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
                     case 0 -> 42;
                     case 1 -> 66;
                     case 2 -> 44;
                     case 3 -> 78;
                     case 4 -> 109;
                     case 5 -> 87;
                     default -> 22;
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
                     b = new String[6];
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "tY+Q\u0087vIæ\u0082\u0001\u007f¦°ö_Äu\u0004v\u0016NË";
                  var4 = "tY+Q\u0087vIæ\u0082\u0001\u007f¦°ö_Äu\u0004v\u0016NË".length();
                  var1 = 17;
                  var8 = -1;
            }

            var10000 = 106;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 18184) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 89;
            case 1 -> 199;
            case 2 -> 183;
            case 3 -> 187;
            case 4 -> 210;
            case 5 -> 176;
            case 6 -> 255;
            case 7 -> 159;
            case 8 -> 119;
            case 9 -> 189;
            case 10 -> 124;
            case 11 -> 232;
            case 12 -> 222;
            case 13 -> 203;
            case 14 -> 223;
            case 15 -> 85;
            case 16 -> 77;
            case 17 -> 172;
            case 18 -> 27;
            case 19 -> 78;
            case 20 -> 82;
            case 21 -> 92;
            case 22 -> 167;
            case 23 -> 67;
            case 24 -> 162;
            case 25 -> 139;
            case 26 -> 32;
            case 27 -> 204;
            case 28 -> 20;
            case 29 -> 231;
            case 30 -> 174;
            case 31 -> 71;
            case 32 -> 132;
            case 33 -> 116;
            case 34 -> 34;
            case 35 -> 51;
            case 36 -> 56;
            case 37 -> 88;
            case 38 -> 107;
            case 39 -> 196;
            case 40 -> 42;
            case 41 -> 247;
            case 42 -> 105;
            case 43 -> 191;
            case 44 -> 99;
            case 45 -> 158;
            case 46 -> 244;
            case 47 -> 106;
            case 48 -> 154;
            case 49 -> 206;
            case 50 -> 16;
            case 51 -> 127;
            case 52 -> 254;
            case 53 -> 93;
            case 54 -> 198;
            case 55 -> 185;
            case 56 -> 249;
            case 57 -> 21;
            case 58 -> 230;
            case 59 -> 96;
            case 60 -> 1;
            case 61 -> 164;
            case 62 -> 75;
            case 63 -> 90;
            case 64 -> 245;
            case 65 -> 137;
            case 66 -> 29;
            case 67 -> 155;
            case 68 -> 6;
            case 69 -> 182;
            case 70 -> 195;
            case 71 -> 12;
            case 72 -> 33;
            case 73 -> 72;
            case 74 -> 74;
            case 75 -> 147;
            case 76 -> 80;
            case 77 -> 37;
            case 78 -> 218;
            case 79 -> 253;
            case 80 -> 209;
            case 81 -> 166;
            case 82 -> 112;
            case 83 -> 54;
            case 84 -> 7;
            case 85 -> 250;
            case 86 -> 45;
            case 87 -> 41;
            case 88 -> 134;
            case 89 -> 144;
            case 90 -> 184;
            case 91 -> 15;
            case 92 -> 157;
            case 93 -> 104;
            case 94 -> 63;
            case 95 -> 251;
            case 96 -> 73;
            case 97 -> 181;
            case 98 -> 87;
            case 99 -> 136;
            case 100 -> 130;
            case 101 -> 55;
            case 102 -> 178;
            case 103 -> 62;
            case 104 -> 13;
            case 105 -> 239;
            case 106 -> 110;
            case 107 -> 156;
            case 108 -> 224;
            case 109 -> 186;
            case 110 -> 35;
            case 111 -> 177;
            case 112 -> 68;
            case 113 -> 43;
            case 114 -> 22;
            case 115 -> 152;
            case 116 -> 83;
            case 117 -> 150;
            case 118 -> 242;
            case 119 -> 108;
            case 120 -> 129;
            case 121 -> 9;
            case 122 -> 243;
            case 123 -> 165;
            case 124 -> 180;
            case 125 -> 52;
            case 126 -> 39;
            case 127 -> 145;
            case 128 -> 17;
            case 129 -> 163;
            case 130 -> 133;
            case 131 -> 221;
            case 132 -> 153;
            case 133 -> 123;
            case 134 -> 46;
            case 135 -> 149;
            case 136 -> 81;
            case 137 -> 200;
            case 138 -> 44;
            case 139 -> 131;
            case 140 -> 14;
            case 141 -> 103;
            case 142 -> 121;
            case 143 -> 2;
            case 144 -> 173;
            case 145 -> 220;
            case 146 -> 146;
            case 147 -> 4;
            case 148 -> 38;
            case 149 -> 117;
            case 150 -> 170;
            case 151 -> 217;
            case 152 -> 19;
            case 153 -> 30;
            case 154 -> 228;
            case 155 -> 11;
            case 156 -> 3;
            case 157 -> 100;
            case 158 -> 120;
            case 159 -> 171;
            case 160 -> 60;
            case 161 -> 111;
            case 162 -> 207;
            case 163 -> 65;
            case 164 -> 40;
            case 165 -> 58;
            case 166 -> 70;
            case 167 -> 64;
            case 168 -> 233;
            case 169 -> 216;
            case 170 -> 79;
            case 171 -> 241;
            case 172 -> 26;
            case 173 -> 114;
            case 174 -> 215;
            case 175 -> 229;
            case 176 -> 86;
            case 177 -> 18;
            case 178 -> 76;
            case 179 -> 0;
            case 180 -> 190;
            case 181 -> 202;
            case 182 -> 101;
            case 183 -> 57;
            case 184 -> 143;
            case 185 -> 211;
            case 186 -> 148;
            case 187 -> 240;
            case 188 -> 125;
            case 189 -> 205;
            case 190 -> 94;
            case 191 -> 188;
            case 192 -> 141;
            case 193 -> 97;
            case 194 -> 225;
            case 195 -> 142;
            case 196 -> 219;
            case 197 -> 135;
            case 198 -> 109;
            case 199 -> 248;
            case 200 -> 238;
            case 201 -> 193;
            case 202 -> 234;
            case 203 -> 192;
            case 204 -> 49;
            case 205 -> 69;
            case 206 -> 212;
            case 207 -> 113;
            case 208 -> 5;
            case 209 -> 175;
            case 210 -> 208;
            case 211 -> 53;
            case 212 -> 151;
            case 213 -> 201;
            case 214 -> 235;
            case 215 -> 23;
            case 216 -> 213;
            case 217 -> 252;
            case 218 -> 24;
            case 219 -> 161;
            case 220 -> 95;
            case 221 -> 47;
            case 222 -> 25;
            case 223 -> 50;
            case 224 -> 168;
            case 225 -> 194;
            case 226 -> 66;
            case 227 -> 214;
            case 228 -> 140;
            case 229 -> 59;
            case 230 -> 31;
            case 231 -> 122;
            case 232 -> 179;
            case 233 -> 28;
            case 234 -> 36;
            case 235 -> 128;
            case 236 -> 197;
            case 237 -> 48;
            case 238 -> 237;
            case 239 -> 115;
            case 240 -> 126;
            case 241 -> 246;
            case 242 -> 118;
            case 243 -> 169;
            case 244 -> 160;
            case 245 -> 227;
            case 246 -> 91;
            case 247 -> 138;
            case 248 -> 98;
            case 249 -> 102;
            case 250 -> 236;
            case 251 -> 61;
            case 252 -> 226;
            case 253 -> 84;
            case 254 -> 8;
            default -> 10;
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
