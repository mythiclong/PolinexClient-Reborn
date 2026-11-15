package me.octo.client;

import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@JvmInline
public final class IIIllllllllIIlIlIlIIlIllIIIIlIIIlIIlIIlllllIIIIlIlIIlIlIIlllIIIllIIlllllIIlIIlIlIIllI {
    public static <T> T m(Object... args) { return null; } // PX-FIX ovld-var
   @NotNull
   private final Std140SizeCalculator IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static String[] a;
   private static String[] b;

   public static final IIIllllllllIIlIlIlIIlIllIIIIlIIIlIIlIIlllllIIIIlIlIIlIlIIlllIIIllIIlllllIIlIIlIlIIllI m(Std140SizeCalculator var0) { // PX-FIX: 恢复工厂（jar: m(Std140SizeCalculator)）
      return new IIIllllllllIIlIlIlIIlIllIIIIlIIIlIIlIIlllllIIIIlIlIIlIlIIlllIIIllIIlllllIIlIIlIlIIllI(var0);
   }

   private IIIllllllllIIlIlIlIIlIllIIIIlIIIlIIlIIlllllIIIIlIlIIlIlIIlllIIIllIIlllllIIlIIlIlIIllI(Std140SizeCalculator var1) { // PX-FIX: 恢复构造器（final 字段初始化）
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
   }

   @NotNull
   public final Std140SizeCalculator a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public final Std140SizeCalculator b() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public static final Unit a(Std140SizeCalculator var0) {
      boolean var1 = false;
      var0.putFloat();
      return Unit.INSTANCE;
   }

   @NotNull
   public static final Unit b(Std140SizeCalculator var0) {
      boolean var1 = false;
      var0.putInt();
      return Unit.INSTANCE;
   }

   @NotNull
   public static final Unit c(Std140SizeCalculator var0) {
      boolean var1 = false;
      var0.putVec2();
      return Unit.INSTANCE;
   }

   @NotNull
   public static final Unit d(Std140SizeCalculator var0) {
      boolean var1 = false;
      var0.putIVec2();
      return Unit.INSTANCE;
   }

   @NotNull
   public static final Unit e(Std140SizeCalculator var0) {
      boolean var1 = false;
      var0.putVec3();
      return Unit.INSTANCE;
   }

   @NotNull
   public static final Unit f(Std140SizeCalculator var0) {
      boolean var1 = false;
      var0.putIVec3();
      return Unit.INSTANCE;
   }

   @NotNull
   public static final Unit g(Std140SizeCalculator var0) {
      boolean var1 = false;
      var0.putIVec4();
      return Unit.INSTANCE;
   }

   @NotNull
   public static final Unit h(Std140SizeCalculator var0) {
      boolean var1 = false;
      var0.putMat4f();
      return Unit.INSTANCE;
   }

   public static final void a(Std140SizeCalculator var0, @NotNull Unit var1, @NotNull Unit var2) {
      short var10001 = -25230;
      short var10002 = -20338;
      Intrinsics.checkNotNullParameter(var1, "$this$plus");
      var10001 = -25229;
      var10002 = -28178;
      Intrinsics.checkNotNullParameter(var2, "other");
      boolean var3 = false;
   }

   public static final int i(Std140SizeCalculator var0) {
      boolean var1 = false;
      return var0.get();
   }

   public static String j(Std140SizeCalculator var0) {
      short var10001 = -25231;
      short var10002 = -31030;
      return "KStd140SizeCalculator(j=" + var0 + ")";
   }

   @Override
   public String toString() {
      return j(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
   }

   public static int k(Std140SizeCalculator var0) {
      return var0.hashCode();
   }

   @Override
   public int hashCode() {
      return k(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
   }

   public static boolean a(Std140SizeCalculator var0, Object var1) {
      String[] var2 = lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.b();
      boolean var10000 = var1 instanceof IIIllllllllIIlIlIlIIlIllIIIIlIIIlIIlIIlllllIIIIlIlIIlIlIIlllIIIllIIlllllIIlIIlIlIIllI;
      if (var2 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = Intrinsics.areEqual(var0, ((IIIllllllllIIlIlIlIIlIllIIIIlIIIlIIlIIlllllIIIIlIlIIlIlIIlllIIIllIIlllllIIlIIlIlIIllI)var1).b());
      }

      if (var2 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = true;
      }

      return var10000;
   }

   @Override
   public boolean equals(Object var1) {
      return a(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, var1);
   }

   @NotNull
   public static Std140SizeCalculator l(@NotNull Std140SizeCalculator var0) {
      Intrinsics.checkNotNullParameter(var0, "j");
      return var0;
   }

   public static final boolean a(Std140SizeCalculator var0, Std140SizeCalculator var1) {
      return Intrinsics.areEqual(var0, var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "F\u0087!à\u0092\n~3\u0004z7ÄàãWí\u0018\u0081*e\u0097ÆÅ\u0094î\u008d\u009d\u001fd  \u008dÀÑ-\u000el\"\u0090R\u0001";
      int var4 = "F\u0087!à\u0092\n~3\u0004z7ÄàãWí\u0018\u0081*e\u0097ÆÅ\u0094î\u008d\u009d\u001fd  \u008dÀÑ-\u000el\"\u0090R\u0001".length();
      char var1 = 5;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 24;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 24;
               var10006 = var6;
            } else {
               var13 = 24;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 24;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 106;
                  case 1 -> 21;
                  case 2 -> 85;
                  case 3 -> 54;
                  case 4 -> 16;
                  case 5 -> 54;
                  default -> 114;
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
            b = new String[3];
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -25229) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 27;
            case 1 -> 3;
            case 2 -> 230;
            case 3 -> 11;
            case 4 -> 178;
            case 5 -> 251;
            case 6 -> 90;
            case 7 -> 41;
            case 8 -> 198;
            case 9 -> 37;
            case 10 -> 141;
            case 11 -> 143;
            case 12 -> 102;
            case 13 -> 133;
            case 14 -> 250;
            case 15 -> 69;
            case 16 -> 169;
            case 17 -> 188;
            case 18 -> 7;
            case 19 -> 88;
            case 20 -> 91;
            case 21 -> 87;
            case 22 -> 4;
            case 23 -> 47;
            case 24 -> 207;
            case 25 -> 204;
            case 26 -> 130;
            case 27 -> 56;
            case 28 -> 125;
            case 29 -> 160;
            case 30 -> 200;
            case 31 -> 190;
            case 32 -> 150;
            case 33 -> 206;
            case 34 -> 96;
            case 35 -> 68;
            case 36 -> 144;
            case 37 -> 238;
            case 38 -> 64;
            case 39 -> 197;
            case 40 -> 84;
            case 41 -> 43;
            case 42 -> 1;
            case 43 -> 15;
            case 44 -> 122;
            case 45 -> 192;
            case 46 -> 94;
            case 47 -> 85;
            case 48 -> 106;
            case 49 -> 254;
            case 50 -> 236;
            case 51 -> 247;
            case 52 -> 147;
            case 53 -> 186;
            case 54 -> 174;
            case 55 -> 78;
            case 56 -> 221;
            case 57 -> 172;
            case 58 -> 98;
            case 59 -> 67;
            case 60 -> 145;
            case 61 -> 255;
            case 62 -> 107;
            case 63 -> 177;
            case 64 -> 31;
            case 65 -> 57;
            case 66 -> 211;
            case 67 -> 105;
            case 68 -> 222;
            case 69 -> 95;
            case 70 -> 28;
            case 71 -> 73;
            case 72 -> 103;
            case 73 -> 136;
            case 74 -> 180;
            case 75 -> 215;
            case 76 -> 131;
            case 77 -> 175;
            case 78 -> 201;
            case 79 -> 142;
            case 80 -> 235;
            case 81 -> 92;
            case 82 -> 70;
            case 83 -> 82;
            case 84 -> 33;
            case 85 -> 20;
            case 86 -> 162;
            case 87 -> 151;
            case 88 -> 49;
            case 89 -> 168;
            case 90 -> 187;
            case 91 -> 55;
            case 92 -> 134;
            case 93 -> 100;
            case 94 -> 113;
            case 95 -> 232;
            case 96 -> 244;
            case 97 -> 156;
            case 98 -> 63;
            case 99 -> 205;
            case 100 -> 12;
            case 101 -> 219;
            case 102 -> 209;
            case 103 -> 149;
            case 104 -> 10;
            case 105 -> 81;
            case 106 -> 132;
            case 107 -> 223;
            case 108 -> 146;
            case 109 -> 191;
            case 110 -> 243;
            case 111 -> 217;
            case 112 -> 170;
            case 113 -> 218;
            case 114 -> 119;
            case 115 -> 153;
            case 116 -> 135;
            case 117 -> 237;
            case 118 -> 109;
            case 119 -> 167;
            case 120 -> 89;
            case 121 -> 25;
            case 122 -> 182;
            case 123 -> 0;
            case 124 -> 123;
            case 125 -> 101;
            case 126 -> 224;
            case 127 -> 38;
            case 128 -> 231;
            case 129 -> 79;
            case 130 -> 66;
            case 131 -> 46;
            case 132 -> 148;
            case 133 -> 155;
            case 134 -> 181;
            case 135 -> 52;
            case 136 -> 154;
            case 137 -> 61;
            case 138 -> 208;
            case 139 -> 35;
            case 140 -> 5;
            case 141 -> 54;
            case 142 -> 240;
            case 143 -> 196;
            case 144 -> 129;
            case 145 -> 124;
            case 146 -> 193;
            case 147 -> 83;
            case 148 -> 108;
            case 149 -> 202;
            case 150 -> 137;
            case 151 -> 152;
            case 152 -> 138;
            case 153 -> 36;
            case 154 -> 210;
            case 155 -> 29;
            case 156 -> 140;
            case 157 -> 2;
            case 158 -> 115;
            case 159 -> 53;
            case 160 -> 80;
            case 161 -> 6;
            case 162 -> 253;
            case 163 -> 176;
            case 164 -> 194;
            case 165 -> 74;
            case 166 -> 184;
            case 167 -> 195;
            case 168 -> 245;
            case 169 -> 104;
            case 170 -> 242;
            case 171 -> 212;
            case 172 -> 17;
            case 173 -> 199;
            case 174 -> 126;
            case 175 -> 58;
            case 176 -> 8;
            case 177 -> 157;
            case 178 -> 226;
            case 179 -> 161;
            case 180 -> 163;
            case 181 -> 44;
            case 182 -> 139;
            case 183 -> 249;
            case 184 -> 23;
            case 185 -> 9;
            case 186 -> 227;
            case 187 -> 21;
            case 188 -> 165;
            case 189 -> 71;
            case 190 -> 118;
            case 191 -> 48;
            case 192 -> 128;
            case 193 -> 40;
            case 194 -> 32;
            case 195 -> 50;
            case 196 -> 51;
            case 197 -> 76;
            case 198 -> 19;
            case 199 -> 97;
            case 200 -> 183;
            case 201 -> 114;
            case 202 -> 127;
            case 203 -> 121;
            case 204 -> 99;
            case 205 -> 158;
            case 206 -> 110;
            case 207 -> 213;
            case 208 -> 24;
            case 209 -> 77;
            case 210 -> 166;
            case 211 -> 252;
            case 212 -> 179;
            case 213 -> 60;
            case 214 -> 117;
            case 215 -> 248;
            case 216 -> 159;
            case 217 -> 203;
            case 218 -> 93;
            case 219 -> 239;
            case 220 -> 116;
            case 221 -> 30;
            case 222 -> 228;
            case 223 -> 229;
            case 224 -> 225;
            case 225 -> 42;
            case 226 -> 75;
            case 227 -> 214;
            case 228 -> 65;
            case 229 -> 234;
            case 230 -> 185;
            case 231 -> 112;
            case 232 -> 62;
            case 233 -> 189;
            case 234 -> 173;
            case 235 -> 111;
            case 236 -> 220;
            case 237 -> 246;
            case 238 -> 34;
            case 239 -> 14;
            case 240 -> 72;
            case 241 -> 22;
            case 242 -> 16;
            case 243 -> 18;
            case 244 -> 13;
            case 245 -> 39;
            case 246 -> 241;
            case 247 -> 171;
            case 248 -> 26;
            case 249 -> 59;
            case 250 -> 233;
            case 251 -> 45;
            case 252 -> 86;
            case 253 -> 216;
            case 254 -> 120;
            default -> 164;
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
