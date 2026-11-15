package me.octo.client.utils;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl {
   @NotNull
   private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] a;
   private static String[] b;

   public IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl(@NotNull String var1, @NotNull String var2) {
      short var10001 = -4394;
      short var10002 = -1365;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = -4393;
      var10002 = 4636;
      Intrinsics.checkNotNullParameter(var2, "resourcePath");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
   }

   @NotNull
   public final String a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public final String b() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final ByteBuffer c() {
      String var1 = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.j();
      if (var1 != null) {
         InputStream var10000 = this.getClass().getResourceAsStream(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         if (var10000 != null) {
            InputStream var2 = var10000;
            byte[] var3 = ByteStreamsKt.readBytes(var2);
            try {
               var2.close();
            }
            catch (java.io.IOException iOException) {
               throw new RuntimeException(iOException);
            }
            ByteBuffer var4 = ByteBuffer.allocateDirect(var3.length).order(ByteOrder.nativeOrder()).put(var3);
            var4.flip();
            Intrinsics.checkNotNull(var4);
            return var4;
         }
      }

      try {
         throw new FileNotFoundException(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      }
      catch (java.io.FileNotFoundException exception) {
         throw new RuntimeException(exception);
      }
   }

   @Override
   public int hashCode() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      String var2 = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.j();
      boolean var10000 = var1 instanceof IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl;
      if (var2 != null) {
         if (!var10000) {
            return false;
         }

         var10000 = Intrinsics.areEqual(
            ((IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl)var1).lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         );
      }

      return var10000;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "\u0091rÇ\u0091\f¹\u0099CbFÀ\t\u0097ùaæO";
      int var4 = "\u0091rÇ\u0091\f¹\u0099CbFÀ\t\u0097ùaæO".length();
      char var1 = 4;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 61;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 61;
               var10006 = var6;
            } else {
               var13 = 61;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 61;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 45;
                  case 1 -> 16;
                  case 2 -> 4;
                  case 3 -> 111;
                  case 4 -> 92;
                  case 5 -> 11;
                  default -> 104;
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
      int var2 = (var0 ^ -4394) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 116;
            case 1 -> 110;
            case 2 -> 204;
            case 3 -> 56;
            case 4 -> 15;
            case 5 -> 105;
            case 6 -> 112;
            case 7 -> 101;
            case 8 -> 71;
            case 9 -> 173;
            case 10 -> 50;
            case 11 -> 102;
            case 12 -> 23;
            case 13 -> 205;
            case 14 -> 82;
            case 15 -> 74;
            case 16 -> 224;
            case 17 -> 143;
            case 18 -> 222;
            case 19 -> 27;
            case 20 -> 156;
            case 21 -> 94;
            case 22 -> 32;
            case 23 -> 238;
            case 24 -> 78;
            case 25 -> 146;
            case 26 -> 175;
            case 27 -> 19;
            case 28 -> 181;
            case 29 -> 236;
            case 30 -> 123;
            case 31 -> 193;
            case 32 -> 147;
            case 33 -> 43;
            case 34 -> 72;
            case 35 -> 155;
            case 36 -> 185;
            case 37 -> 73;
            case 38 -> 167;
            case 39 -> 20;
            case 40 -> 241;
            case 41 -> 30;
            case 42 -> 220;
            case 43 -> 199;
            case 44 -> 17;
            case 45 -> 201;
            case 46 -> 244;
            case 47 -> 68;
            case 48 -> 69;
            case 49 -> 0;
            case 50 -> 5;
            case 51 -> 153;
            case 52 -> 139;
            case 53 -> 45;
            case 54 -> 61;
            case 55 -> 103;
            case 56 -> 231;
            case 57 -> 246;
            case 58 -> 53;
            case 59 -> 208;
            case 60 -> 51;
            case 61 -> 157;
            case 62 -> 99;
            case 63 -> 33;
            case 64 -> 97;
            case 65 -> 16;
            case 66 -> 217;
            case 67 -> 44;
            case 68 -> 75;
            case 69 -> 96;
            case 70 -> 169;
            case 71 -> 136;
            case 72 -> 209;
            case 73 -> 84;
            case 74 -> 235;
            case 75 -> 18;
            case 76 -> 180;
            case 77 -> 66;
            case 78 -> 58;
            case 79 -> 118;
            case 80 -> 195;
            case 81 -> 151;
            case 82 -> 31;
            case 83 -> 87;
            case 84 -> 135;
            case 85 -> 215;
            case 86 -> 182;
            case 87 -> 206;
            case 88 -> 242;
            case 89 -> 93;
            case 90 -> 48;
            case 91 -> 12;
            case 92 -> 200;
            case 93 -> 26;
            case 94 -> 177;
            case 95 -> 77;
            case 96 -> 179;
            case 97 -> 170;
            case 98 -> 55;
            case 99 -> 203;
            case 100 -> 124;
            case 101 -> 145;
            case 102 -> 218;
            case 103 -> 47;
            case 104 -> 54;
            case 105 -> 7;
            case 106 -> 57;
            case 107 -> 35;
            case 108 -> 115;
            case 109 -> 213;
            case 110 -> 196;
            case 111 -> 111;
            case 112 -> 154;
            case 113 -> 247;
            case 114 -> 194;
            case 115 -> 63;
            case 116 -> 225;
            case 117 -> 2;
            case 118 -> 189;
            case 119 -> 229;
            case 120 -> 133;
            case 121 -> 120;
            case 122 -> 148;
            case 123 -> 38;
            case 124 -> 161;
            case 125 -> 168;
            case 126 -> 4;
            case 127 -> 86;
            case 128 -> 134;
            case 129 -> 188;
            case 130 -> 252;
            case 131 -> 98;
            case 132 -> 223;
            case 133 -> 70;
            case 134 -> 8;
            case 135 -> 233;
            case 136 -> 106;
            case 137 -> 80;
            case 138 -> 249;
            case 139 -> 11;
            case 140 -> 141;
            case 141 -> 158;
            case 142 -> 210;
            case 143 -> 255;
            case 144 -> 187;
            case 145 -> 192;
            case 146 -> 1;
            case 147 -> 140;
            case 148 -> 197;
            case 149 -> 14;
            case 150 -> 250;
            case 151 -> 40;
            case 152 -> 152;
            case 153 -> 95;
            case 154 -> 254;
            case 155 -> 107;
            case 156 -> 41;
            case 157 -> 221;
            case 158 -> 202;
            case 159 -> 67;
            case 160 -> 76;
            case 161 -> 159;
            case 162 -> 163;
            case 163 -> 125;
            case 164 -> 149;
            case 165 -> 144;
            case 166 -> 230;
            case 167 -> 114;
            case 168 -> 248;
            case 169 -> 65;
            case 170 -> 176;
            case 171 -> 109;
            case 172 -> 240;
            case 173 -> 3;
            case 174 -> 52;
            case 175 -> 117;
            case 176 -> 150;
            case 177 -> 59;
            case 178 -> 219;
            case 179 -> 6;
            case 180 -> 21;
            case 181 -> 207;
            case 182 -> 29;
            case 183 -> 128;
            case 184 -> 83;
            case 185 -> 100;
            case 186 -> 129;
            case 187 -> 237;
            case 188 -> 183;
            case 189 -> 91;
            case 190 -> 42;
            case 191 -> 90;
            case 192 -> 178;
            case 193 -> 49;
            case 194 -> 79;
            case 195 -> 137;
            case 196 -> 122;
            case 197 -> 211;
            case 198 -> 92;
            case 199 -> 214;
            case 200 -> 37;
            case 201 -> 165;
            case 202 -> 126;
            case 203 -> 119;
            case 204 -> 142;
            case 205 -> 198;
            case 206 -> 104;
            case 207 -> 130;
            case 208 -> 191;
            case 209 -> 24;
            case 210 -> 228;
            case 211 -> 186;
            case 212 -> 166;
            case 213 -> 251;
            case 214 -> 28;
            case 215 -> 239;
            case 216 -> 160;
            case 217 -> 39;
            case 218 -> 164;
            case 219 -> 243;
            case 220 -> 88;
            case 221 -> 232;
            case 222 -> 10;
            case 223 -> 22;
            case 224 -> 212;
            case 225 -> 108;
            case 226 -> 253;
            case 227 -> 226;
            case 228 -> 89;
            case 229 -> 13;
            case 230 -> 34;
            case 231 -> 36;
            case 232 -> 132;
            case 233 -> 127;
            case 234 -> 121;
            case 235 -> 172;
            case 236 -> 171;
            case 237 -> 234;
            case 238 -> 113;
            case 239 -> 81;
            case 240 -> 184;
            case 241 -> 60;
            case 242 -> 227;
            case 243 -> 64;
            case 244 -> 216;
            case 245 -> 190;
            case 246 -> 174;
            case 247 -> 46;
            case 248 -> 131;
            case 249 -> 245;
            case 250 -> 85;
            case 251 -> 25;
            case 252 -> 9;
            case 253 -> 62;
            case 254 -> 138;
            default -> 162;
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
