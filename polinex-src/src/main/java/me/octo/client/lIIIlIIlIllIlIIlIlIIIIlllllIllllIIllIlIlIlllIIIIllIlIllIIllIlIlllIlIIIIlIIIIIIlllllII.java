package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public class lIIIlIIlIllIlIIlIlIIIIlllllIllllIIllIlIlIlllIIIIllIlIllIIllIlIlllIlIIIIlIIIIIIlllllII
   extends IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll
   implements IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public lIIIlIIlIllIlIIlIlIIIIlllllIllllIIllIlIlIlllIIIIllIlIllIIllIlIlllIlIIIIlIIIIIIlllllII(Object... px) {
           this((String)null, (String)null, (String)null); // PX-FIX: 委托主构造器（final 字段初始化）
        }

   @NotNull
   private String IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static String[] d;
   private static String[] e;

   public lIIIlIIlIllIlIIlIlIIIIlllllIllllIIllIlIlIlllIIIIllIlIllIIllIlIlllIlIIIIlIIIIIIlllllII(
      @NotNull String var1, @NotNull String var2, @NotNull String var3
   ) {
      short var10001 = -1160;
      short var10002 = -14317;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = -1153;
      var10002 = 28012;
      Intrinsics.checkNotNullParameter(var2, "description");
      var10001 = -1161;
      var10002 = 17690;
      Intrinsics.checkNotNullParameter(var3, "defaultText");
      super(var1, var2);
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = "";
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var3;
   }

   public lIIIlIIlIllIlIIlIlIIIIlllllIllllIIllIlIlIlllIIIIllIlIllIIllIlIlllIlIIIIlIIIIIIlllllII(@NotNull String var1) {
      short var10001 = -1154;
      short var10002 = 8240;
      Intrinsics.checkNotNullParameter(var1, "name");
      super(var1);
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = "";
   }

   public lIIIlIIlIllIlIIlIlIIIIlllllIllllIIllIlIlIlllIIIIllIlIllIIllIlIlllIlIIIIlIIIIIIlllllII(@NotNull String var1, @NotNull String var2) {
      short var10001 = -1154;
      short var10002 = 8240;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = -1158;
      var10002 = 19913;
      Intrinsics.checkNotNullParameter(var2, "defaultText");
      super(var1);
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = "";
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var2;
   }

   @Override
   public void V() {
      String[] var1 = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
      int var10000 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.length();
      if (var1 == null) {
         var10000 = var10000 > 0 ? 1 : 0;
      }

      if (var10000 != 0) {
         String var10001 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            .substring(0, this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.length() - 1);
         short var10003 = -1156;
         short var10004 = 16738;
         Intrinsics.checkNotNullExpressionValue(var10001, "substring(...)");
         this.f(var10001);
      }
   }

   @Override
   public void d(@NotNull String var1) {
      Intrinsics.checkNotNullParameter(var1, "s");
      this.f(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII + var1);
   }

   @NotNull
   @Override
   public String U() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   public final boolean W() {
      String[] var1 = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
      int var10000 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.length();
      if (var1 == null) {
         var10000 = var10000 == 0 ? 1 : 0;
      }

      return (var10000 != 0);
   }

   public final void f(@NotNull String var1) {
      short var10001 = -1159;
      short var10002 = 24908;
      Intrinsics.checkNotNullParameter(var1, "text");
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
      this.X();
      llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .e();
   }

   public void X() {
   }

   @NotNull
   @Override
   public IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl g() {
      return new IIIIllllIlIIllIIlIIIlIlIllllIIIIIIlIlIlIIIllIllIIIIIlIIIlIlIlIlIlIIIllllIllIIlIIIIllI(this);
   }

   @NotNull
   @Override
   public IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl h() {
      return new IllIlllIIlIlIIllIllIIllIIllIIIllIIIllIlIllIlllIIllllIIllIllllIIIlIIIIlIIllIllIIIIlllI(this);
   }

   @Override
   public void a(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var1) {
      short var10001 = -1162;
      short var10002 = 6259;
      Intrinsics.checkNotNullParameter(var1, "data");
      var10001 = -1155;
      var10002 = 30588;
      var1.a("text", this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
   }

   @Override
   public void b(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var1) {
      short var10001 = -1157;
      short var10002 = -758;
      Intrinsics.checkNotNullParameter(var1, "data");
      var10002 = -1155;
      short var10003 = 30588;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1.aString("text", "");
      this.X();
   }

   @Override
   public void aj() {
      String[] var1 = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
      lIIIlIIlIllIlIIlIlIIIIlllllIllllIIllIlIlIlllIIIIllIlIllIIllIlIlllIlIIIIlIIIIIIlllllII var10000 = this;
      if (var1 == null) {
         if (!this.c()) {
            return;
         }

         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = "";
         var10000 = this;
      }

      var10000.X();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[10];
      int var3 = 0;
      String var2 = "^MÚ\u00adBe¸\u000b\u0081~´\u0004°\\R\r\u0004EB [\u000e$Ðq\u001c\u0002Zo\u008eOÐâo/\u0093\u0004 ¥\u00026\u000b\u0017\u0099æ5u1½\u0004©¬&\u0004@W\u0000ù\u0004\u0086G\u0094n";
      int var4 = "^MÚ\u00adBe¸\u000b\u0081~´\u0004°\\R\r\u0004EB [\u000e$Ðq\u001c\u0002Zo\u008eOÐâo/\u0093\u0004 ¥\u00026\u000b\u0017\u0099æ5u1½\u0004©¬&\u0004@W\u0000ù\u0004\u0086G\u0094n"
         .length();
      char var1 = 11;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 125;
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
                     case 0 -> 33;
                     case 1 -> 50;
                     case 2 -> 124;
                     case 3 -> 58;
                     case 4 -> 43;
                     case 5 -> 35;
                     default -> 11;
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
                     e = new String[10];
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

                  var2 = "£jßäý¤\u0003\u0019Ñ \u0086\u0004c¨Õ8";
                  var4 = "£jßäý¤\u0003\u0019Ñ \u0086\u0004c¨Õ8".length();
                  var1 = 11;
                  var8 = -1;
            }

            var10000 = 58;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ -1153) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 193;
            case 1 -> 65;
            case 2 -> 6;
            case 3 -> 57;
            case 4 -> 92;
            case 5 -> 35;
            case 6 -> 226;
            case 7 -> 202;
            case 8 -> 218;
            case 9 -> 74;
            case 10 -> 17;
            case 11 -> 204;
            case 12 -> 126;
            case 13 -> 46;
            case 14 -> 213;
            case 15 -> 186;
            case 16 -> 123;
            case 17 -> 76;
            case 18 -> 113;
            case 19 -> 237;
            case 20 -> 211;
            case 21 -> 160;
            case 22 -> 219;
            case 23 -> 125;
            case 24 -> 23;
            case 25 -> 15;
            case 26 -> 254;
            case 27 -> 59;
            case 28 -> 228;
            case 29 -> 200;
            case 30 -> 235;
            case 31 -> 14;
            case 32 -> 191;
            case 33 -> 37;
            case 34 -> 244;
            case 35 -> 53;
            case 36 -> 148;
            case 37 -> 43;
            case 38 -> 194;
            case 39 -> 85;
            case 40 -> 10;
            case 41 -> 232;
            case 42 -> 255;
            case 43 -> 129;
            case 44 -> 166;
            case 45 -> 175;
            case 46 -> 214;
            case 47 -> 127;
            case 48 -> 140;
            case 49 -> 239;
            case 50 -> 25;
            case 51 -> 149;
            case 52 -> 216;
            case 53 -> 45;
            case 54 -> 176;
            case 55 -> 51;
            case 56 -> 208;
            case 57 -> 58;
            case 58 -> 128;
            case 59 -> 199;
            case 60 -> 221;
            case 61 -> 13;
            case 62 -> 243;
            case 63 -> 124;
            case 64 -> 138;
            case 65 -> 224;
            case 66 -> 9;
            case 67 -> 18;
            case 68 -> 7;
            case 69 -> 145;
            case 70 -> 167;
            case 71 -> 109;
            case 72 -> 157;
            case 73 -> 203;
            case 74 -> 178;
            case 75 -> 154;
            case 76 -> 177;
            case 77 -> 49;
            case 78 -> 71;
            case 79 -> 163;
            case 80 -> 88;
            case 81 -> 20;
            case 82 -> 180;
            case 83 -> 246;
            case 84 -> 48;
            case 85 -> 24;
            case 86 -> 107;
            case 87 -> 220;
            case 88 -> 118;
            case 89 -> 134;
            case 90 -> 122;
            case 91 -> 97;
            case 92 -> 229;
            case 93 -> 90;
            case 94 -> 115;
            case 95 -> 249;
            case 96 -> 141;
            case 97 -> 185;
            case 98 -> 12;
            case 99 -> 41;
            case 100 -> 104;
            case 101 -> 139;
            case 102 -> 231;
            case 103 -> 29;
            case 104 -> 38;
            case 105 -> 3;
            case 106 -> 252;
            case 107 -> 222;
            case 108 -> 11;
            case 109 -> 251;
            case 110 -> 158;
            case 111 -> 32;
            case 112 -> 27;
            case 113 -> 164;
            case 114 -> 86;
            case 115 -> 152;
            case 116 -> 31;
            case 117 -> 75;
            case 118 -> 105;
            case 119 -> 135;
            case 120 -> 87;
            case 121 -> 30;
            case 122 -> 34;
            case 123 -> 82;
            case 124 -> 36;
            case 125 -> 19;
            case 126 -> 159;
            case 127 -> 54;
            case 128 -> 68;
            case 129 -> 189;
            case 130 -> 236;
            case 131 -> 106;
            case 132 -> 94;
            case 133 -> 173;
            case 134 -> 196;
            case 135 -> 66;
            case 136 -> 119;
            case 137 -> 241;
            case 138 -> 98;
            case 139 -> 230;
            case 140 -> 225;
            case 141 -> 169;
            case 142 -> 223;
            case 143 -> 248;
            case 144 -> 182;
            case 145 -> 100;
            case 146 -> 1;
            case 147 -> 170;
            case 148 -> 171;
            case 149 -> 210;
            case 150 -> 247;
            case 151 -> 168;
            case 152 -> 121;
            case 153 -> 181;
            case 154 -> 234;
            case 155 -> 240;
            case 156 -> 227;
            case 157 -> 61;
            case 158 -> 133;
            case 159 -> 93;
            case 160 -> 22;
            case 161 -> 142;
            case 162 -> 91;
            case 163 -> 212;
            case 164 -> 153;
            case 165 -> 16;
            case 166 -> 187;
            case 167 -> 2;
            case 168 -> 179;
            case 169 -> 192;
            case 170 -> 245;
            case 171 -> 80;
            case 172 -> 190;
            case 173 -> 44;
            case 174 -> 206;
            case 175 -> 250;
            case 176 -> 52;
            case 177 -> 39;
            case 178 -> 89;
            case 179 -> 131;
            case 180 -> 5;
            case 181 -> 72;
            case 182 -> 150;
            case 183 -> 144;
            case 184 -> 62;
            case 185 -> 79;
            case 186 -> 205;
            case 187 -> 63;
            case 188 -> 156;
            case 189 -> 151;
            case 190 -> 165;
            case 191 -> 110;
            case 192 -> 40;
            case 193 -> 67;
            case 194 -> 99;
            case 195 -> 136;
            case 196 -> 132;
            case 197 -> 83;
            case 198 -> 108;
            case 199 -> 21;
            case 200 -> 233;
            case 201 -> 172;
            case 202 -> 201;
            case 203 -> 207;
            case 204 -> 120;
            case 205 -> 253;
            case 206 -> 238;
            case 207 -> 56;
            case 208 -> 101;
            case 209 -> 42;
            case 210 -> 116;
            case 211 -> 33;
            case 212 -> 195;
            case 213 -> 215;
            case 214 -> 146;
            case 215 -> 81;
            case 216 -> 162;
            case 217 -> 8;
            case 218 -> 95;
            case 219 -> 60;
            case 220 -> 26;
            case 221 -> 50;
            case 222 -> 77;
            case 223 -> 147;
            case 224 -> 70;
            case 225 -> 155;
            case 226 -> 161;
            case 227 -> 130;
            case 228 -> 78;
            case 229 -> 0;
            case 230 -> 73;
            case 231 -> 112;
            case 232 -> 143;
            case 233 -> 103;
            case 234 -> 96;
            case 235 -> 217;
            case 236 -> 174;
            case 237 -> 188;
            case 238 -> 55;
            case 239 -> 117;
            case 240 -> 47;
            case 241 -> 197;
            case 242 -> 242;
            case 243 -> 64;
            case 244 -> 69;
            case 245 -> 198;
            case 246 -> 137;
            case 247 -> 28;
            case 248 -> 209;
            case 249 -> 184;
            case 250 -> 111;
            case 251 -> 102;
            case 252 -> 114;
            case 253 -> 84;
            case 254 -> 4;
            default -> 183;
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
