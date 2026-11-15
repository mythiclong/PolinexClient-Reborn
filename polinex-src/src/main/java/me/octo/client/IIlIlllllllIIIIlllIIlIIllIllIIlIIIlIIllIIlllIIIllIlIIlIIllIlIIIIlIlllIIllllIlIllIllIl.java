package me.octo.client;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class IIlIlllllllIIIIlllIIlIIllIllIIlIIIlIIllIIlllIIIllIlIIlIIllIlIIIIlIlllIIllllIlIllIllIl
   extends IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll {
   @Nullable
   private String IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private String llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private boolean lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static String[] d;
   private static String[] e;

   @Nullable
   public final String i() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   public final void e(@Nullable String var1) {
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var1;
   }

   @NotNull
   public final String j() {
      return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   public final void f(@NotNull String var1) {
      short var10001 = 11992;
      short var10002 = 30237;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var1;
   }

   public final boolean k() {
      return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   public final void a(boolean var1) {
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var1;
   }

   public IIlIlllllllIIIIlllIIlIIllIllIIlIIIlIIllIIlllIIIllIlIIlIIllIlIIIIlIlllIIllllIlIllIllIl(
      @NotNull String var1,
      @NotNull String var2,
      @NotNull IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3,
      @NotNull String var4,
      int var5,
      @NotNull IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll... var6
   ) {
      short var10001 = 11984;
      short var10002 = -5345;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = 11989;
      var10002 = 14188;
      Intrinsics.checkNotNullParameter(var2, "description");
      var10001 = 11993;
      var10002 = 3093;
      Intrinsics.checkNotNullParameter(var3, "category");
      var10001 = 11988;
      var10002 = -1513;
      Intrinsics.checkNotNullParameter(var4, "subcategory");
      var10001 = 11986;
      var10002 = 3951;
      Intrinsics.checkNotNullParameter(var6, "settings");
      super(var1, var2, var3, var4, var5, Arrays.copyOf(var6, var6.length));
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = "";
   }

   @NotNull
   public abstract List<String> l();

   public abstract void g(@NotNull String var1);

   public abstract void h(@NotNull String var1);

   public abstract void i(@NotNull String var1);

   public abstract void a(@NotNull String var1, @NotNull String var2);

   public abstract void m();

   @Nullable
   public String n() {
      return null;
   }

   public boolean j(@NotNull String var1) {
      short var10001 = 11994;
      short var10002 = -12898;
      Intrinsics.checkNotNullParameter(var1, "data");
      return false;
   }

   @NotNull
   @Override
   public IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl g() {
      return new IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll(this);
   }

   @Override
   public void a(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var1) {
      short var10001 = 11987;
      short var10002 = -6201;
      Intrinsics.checkNotNullParameter(var1, "data");
      String[] var10000 = IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI.V();
      var10002 = 11985;
      short var10003 = 13657;
      var1.a("name", this.aj());
      String[] var2 = var10000;
      if (var2 == null && this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII != null) {
         String var3 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
         boolean var4 = false;
         var10001 = 11990;
         var10002 = 10426;
         var1.a("selected_preset", (Object)var3);
      }

      this.c(var1);
   }

   @Override
   public void b(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var1) {
      IIlIlllllllIIIIlllIIlIIllIllIIlIIIlIIllIIlllIIIllIlIIlIIllIlIIIIlIlllIIllllIlIllIllIl var8;
      String var10;
      label25: {
         String[] var10000 = IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI.V();
         short var10002 = 11994;
         short var10003 = -12898;
         Intrinsics.checkNotNullParameter(var1, "data");
         String[] var2 = var10000;
         var8 = this;
         if (var2 == null) {
            var10002 = 11991;
            var10003 = 8944;
            var10 = var1.aString("selected_preset", "");
            if (var10 != null) {
               String var3 = var10;
               boolean var5 = false;
               int var9 = var3.length();
               if (var2 == null) {
                  var9 = var9 > 0 ? 1 : 0;
               }

               int var7 = var9;
               var8 = this;
               var10 = var7 != 0 ? var3 : null;
               break label25;
            }
         }

         var10 = null;
      }

      var8.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var10;
      this.d(var1);
   }

   public final void k(@Nullable String var1) {
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var1;
      llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .e();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[11];
      int var3 = 0;
      String var2 = "D±\u0019\u0088\u0004a¼½)\bînëæ/{\u0085\u008c\u0004</D_\u000bÑÆ\u001aöÍ\u0096Ò|\u0093)\u001f\u000bf®\bé¯hú\u000e'\u000bX\u000fòLp³Mø\u0080²é\u0091mèÑò`\u000f\u0083Q^\u0010\u0088\u008c8<þ@\u008fÒ\u008dµë\u0007¢\u0082Õ¯\u009f\u0003\u0006";
      int var4 = "D±\u0019\u0088\u0004a¼½)\bînëæ/{\u0085\u008c\u0004</D_\u000bÑÆ\u001aöÍ\u0096Ò|\u0093)\u001f\u000bf®\bé¯hú\u000e'\u000bX\u000fòLp³Mø\u0080²é\u0091mèÑò`\u000f\u0083Q^\u0010\u0088\u008c8<þ@\u008fÒ\u008dµë\u0007¢\u0082Õ¯\u009f\u0003\u0006"
         .length();
      char var1 = 4;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 118;
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
                     case 1 -> 88;
                     case 2 -> 42;
                     case 3 -> 37;
                     case 4 -> 60;
                     case 5 -> 47;
                     default -> 124;
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
                     e = new String[11];
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

                  var2 = "?2Æý\u0081/\u008f(\u0004/Ï#F";
                  var4 = "?2Æý\u0081/\u008f(\u0004/Ï#F".length();
                  var1 = '\b';
                  var8 = -1;
            }

            var10000 = 87;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 11984) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 155;
            case 1 -> 121;
            case 2 -> 88;
            case 3 -> 209;
            case 4 -> 63;
            case 5 -> 137;
            case 6 -> 176;
            case 7 -> 141;
            case 8 -> 105;
            case 9 -> 241;
            case 10 -> 28;
            case 11 -> 43;
            case 12 -> 19;
            case 13 -> 210;
            case 14 -> 21;
            case 15 -> 20;
            case 16 -> 6;
            case 17 -> 116;
            case 18 -> 10;
            case 19 -> 195;
            case 20 -> 94;
            case 21 -> 146;
            case 22 -> 44;
            case 23 -> 50;
            case 24 -> 182;
            case 25 -> 244;
            case 26 -> 253;
            case 27 -> 173;
            case 28 -> 161;
            case 29 -> 12;
            case 30 -> 158;
            case 31 -> 32;
            case 32 -> 72;
            case 33 -> 208;
            case 34 -> 59;
            case 35 -> 97;
            case 36 -> 135;
            case 37 -> 70;
            case 38 -> 84;
            case 39 -> 60;
            case 40 -> 91;
            case 41 -> 87;
            case 42 -> 235;
            case 43 -> 245;
            case 44 -> 76;
            case 45 -> 185;
            case 46 -> 233;
            case 47 -> 36;
            case 48 -> 108;
            case 49 -> 24;
            case 50 -> 128;
            case 51 -> 1;
            case 52 -> 164;
            case 53 -> 86;
            case 54 -> 134;
            case 55 -> 126;
            case 56 -> 186;
            case 57 -> 46;
            case 58 -> 183;
            case 59 -> 127;
            case 60 -> 238;
            case 61 -> 65;
            case 62 -> 191;
            case 63 -> 111;
            case 64 -> 145;
            case 65 -> 160;
            case 66 -> 138;
            case 67 -> 34;
            case 68 -> 178;
            case 69 -> 26;
            case 70 -> 22;
            case 71 -> 18;
            case 72 -> 140;
            case 73 -> 17;
            case 74 -> 49;
            case 75 -> 236;
            case 76 -> 230;
            case 77 -> 113;
            case 78 -> 74;
            case 79 -> 187;
            case 80 -> 102;
            case 81 -> 170;
            case 82 -> 200;
            case 83 -> 4;
            case 84 -> 47;
            case 85 -> 224;
            case 86 -> 205;
            case 87 -> 15;
            case 88 -> 252;
            case 89 -> 51;
            case 90 -> 53;
            case 91 -> 165;
            case 92 -> 237;
            case 93 -> 231;
            case 94 -> 83;
            case 95 -> 220;
            case 96 -> 69;
            case 97 -> 181;
            case 98 -> 232;
            case 99 -> 218;
            case 100 -> 9;
            case 101 -> 201;
            case 102 -> 239;
            case 103 -> 194;
            case 104 -> 188;
            case 105 -> 249;
            case 106 -> 55;
            case 107 -> 115;
            case 108 -> 89;
            case 109 -> 139;
            case 110 -> 196;
            case 111 -> 162;
            case 112 -> 202;
            case 113 -> 177;
            case 114 -> 98;
            case 115 -> 123;
            case 116 -> 77;
            case 117 -> 152;
            case 118 -> 85;
            case 119 -> 159;
            case 120 -> 251;
            case 121 -> 66;
            case 122 -> 169;
            case 123 -> 156;
            case 124 -> 125;
            case 125 -> 163;
            case 126 -> 82;
            case 127 -> 228;
            case 128 -> 142;
            case 129 -> 35;
            case 130 -> 215;
            case 131 -> 222;
            case 132 -> 61;
            case 133 -> 3;
            case 134 -> 96;
            case 135 -> 133;
            case 136 -> 71;
            case 137 -> 38;
            case 138 -> 79;
            case 139 -> 5;
            case 140 -> 114;
            case 141 -> 190;
            case 142 -> 80;
            case 143 -> 56;
            case 144 -> 92;
            case 145 -> 243;
            case 146 -> 148;
            case 147 -> 62;
            case 148 -> 27;
            case 149 -> 107;
            case 150 -> 154;
            case 151 -> 101;
            case 152 -> 103;
            case 153 -> 14;
            case 154 -> 246;
            case 155 -> 8;
            case 156 -> 150;
            case 157 -> 180;
            case 158 -> 104;
            case 159 -> 52;
            case 160 -> 219;
            case 161 -> 184;
            case 162 -> 23;
            case 163 -> 29;
            case 164 -> 143;
            case 165 -> 192;
            case 166 -> 175;
            case 167 -> 95;
            case 168 -> 131;
            case 169 -> 171;
            case 170 -> 58;
            case 171 -> 120;
            case 172 -> 54;
            case 173 -> 214;
            case 174 -> 122;
            case 175 -> 179;
            case 176 -> 207;
            case 177 -> 39;
            case 178 -> 42;
            case 179 -> 112;
            case 180 -> 198;
            case 181 -> 225;
            case 182 -> 168;
            case 183 -> 68;
            case 184 -> 229;
            case 185 -> 81;
            case 186 -> 151;
            case 187 -> 189;
            case 188 -> 118;
            case 189 -> 30;
            case 190 -> 117;
            case 191 -> 153;
            case 192 -> 109;
            case 193 -> 73;
            case 194 -> 212;
            case 195 -> 31;
            case 196 -> 242;
            case 197 -> 7;
            case 198 -> 254;
            case 199 -> 226;
            case 200 -> 78;
            case 201 -> 93;
            case 202 -> 221;
            case 203 -> 106;
            case 204 -> 67;
            case 205 -> 206;
            case 206 -> 147;
            case 207 -> 203;
            case 208 -> 248;
            case 209 -> 157;
            case 210 -> 204;
            case 211 -> 75;
            case 212 -> 110;
            case 213 -> 0;
            case 214 -> 193;
            case 215 -> 167;
            case 216 -> 216;
            case 217 -> 99;
            case 218 -> 57;
            case 219 -> 16;
            case 220 -> 124;
            case 221 -> 166;
            case 222 -> 240;
            case 223 -> 25;
            case 224 -> 223;
            case 225 -> 144;
            case 226 -> 172;
            case 227 -> 136;
            case 228 -> 48;
            case 229 -> 100;
            case 230 -> 213;
            case 231 -> 247;
            case 232 -> 211;
            case 233 -> 255;
            case 234 -> 33;
            case 235 -> 41;
            case 236 -> 199;
            case 237 -> 197;
            case 238 -> 130;
            case 239 -> 90;
            case 240 -> 227;
            case 241 -> 217;
            case 242 -> 13;
            case 243 -> 2;
            case 244 -> 64;
            case 245 -> 174;
            case 246 -> 234;
            case 247 -> 149;
            case 248 -> 250;
            case 249 -> 132;
            case 250 -> 119;
            case 251 -> 37;
            case 252 -> 129;
            case 253 -> 45;
            case 254 -> 11;
            default -> 40;
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
      public IIlIlllllllIIIIlllIIlIIllIllIIlIIIlIIllIIlllIIIllIlIIlIIllIlIIIIlIlllIIllllIlIllIllIl(java.lang.String p0, java.lang.String p1, me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll p2, java.lang.String p3, int p4, me.octo.client.IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] p5, int mask, kotlin.jvm.internal.DefaultConstructorMarker marker) {
         this(p0, p1, p2, p3, (mask & 16) != 0 ? 0 : p4, p5);
      }
}
