package me.octo.client;

import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.CameraType;
import net.minecraft.client.Options;
import org.jetbrains.annotations.NotNull;

public final class llIIlIIIlIIIlIllIlIllIIlIIlIlllIIIIlIIlIIIllIlIlIlIIIllllIllIIIllllIIIIIllIllIIllllll
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static llIIlIIIlIIIlIllIlIllIIlIIlIlllIIIIlIIlIIIllIlIlIlIIIllllIllIIIllllIIIIIllIllIIllllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private long lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @JvmField
   @NotNull
   public static llIIlIIIlIIIlIllIlIllIIlIIlIlllIIIIlIIlIIIllIlIlIlIIIllllIllIIIllllIIIIIllIllIIllllll lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static String[] f;
   private static String[] g;

   private llIIlIIIlIIIlIllIlIllIIlIIlIlllIIIIlIIlIIIllIlIlIlIIIllllIllIIIllllIIIIIllIllIIllllll() {
      short var10001 = 14150;
      short var10002 = 20458;
      var10002 = 14149;
      short var10003 = -14250;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      short var10004 = 14148;
      short var10005 = -27283;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         IIlIlllIIIIIlIIIIIIIIlllIIlllIIIIllllIIIlllIlIlIIllIlllIllIIIlIIIlIllIIIlIIllIIIIlIIl.a(),
         IIlIlllIIIIIlIIIIIIIIlllIIlllIIIIllllIIIlllIlIlIIllIlllIllIIIlIIIlIllIIIlIIllIIIIlIIl.b(),
         IIlIlllIIIIIlIIIIIIIIlllIIlllIIIIllllIIIlllIlIlIIllIlllIllIIIlIIIlIllIIIlIIllIIIIlIIl.c(),
         IIlIlllIIIIIlIIIIIIIIlllIIlllIIIIllllIIIlllIlIlIIllIlllIllIIIlIIIlIllIIIlIIllIIIIlIIl.d(),
         IIlIlllIIIIIlIIIIIIIIlllIIlllIIIIllllIIIlllIlIlIIllIlllIllIIIlIIIlIllIIIlIIllIIIIlIIl.g(),
         IIlIlllIIIIIlIIIIIIIIlllIIlllIIIIllllIIIlllIlIlIIllIlllIllIIIlIIIlIllIIIlIIllIIIIlIIl.h(),
         IIlIlllIIIIIlIIIIIIIIlllIIlllIIIIllllIIIlllIlIlIIllIlllIllIIIlIIIlIllIIIlIIllIIIIlIIl.e(),
         IIlIlllIIIIIlIIIIIIIIlllIIlllIIIIllllIIIlllIlIlIIllIlllIllIIIlIIIlIllIIIlIIllIIIIlIIl.f()
      };
      super("Camera", "Modifies how the camera behaves.", var3, "Camera", var1);
   }

   public final void ag() {
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = System.currentTimeMillis();
   }

   public final float ah() {
      String var1 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      if (!IIlIlllIIIIIlIIIIIIIIlllIIlllIIIIllllIIIlllIlIlIIllIlllIllIIIlIIIlIllIIIlIIllIIIIlIIl.d().al()) {
         return IIlIlllIIIIIlIIIIIIIIlllIIlllIIIIllllIIIlllIlIlIIllIlllIllIIIlIIIlIllIIIlIIllIIIIlIIl.a().q();
      } else {
         long var2 = System.currentTimeMillis() - this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         long var10000 = var2;
         if (var1 == null) {
            if (var2 >= (Long)((me.octo.client.PXDyn)(Object)(IIlIlllIIIIIlIIIIIIIIlllIIlllIIIIllllIIIlllIlIlIIllIlllIllIIIlIIIlIllIIIlIIllIIIIlIIl.g())).O()) {
               return IIlIlllIIIIIlIIIIIIIIlllIIlllIIIIllllIIIlllIlIlIIllIlllIllIIIlIIIlIllIIIlIIllIIIIlIIl.a().q();
            }

            var10000 = var2;
         }

         float var4 = (float)var10000 / (Float)((me.octo.client.PXDyn)(Object)(IIlIlllIIIIIlIIIIIIIIlllIIlllIIIIllllIIIlllIlIlIIllIlllIllIIIlIIIlIllIIIlIIllIIIIlIIl.g())).O();
         return this.a(
            ((me.octo.client.PXDyn)(Object)(IIlIlllIIIIIlIIIIIIIIlllIIlllIIIIllllIIIlllIlIlIIllIlllIllIIIlIIIlIllIIIlIIllIIIIlIIl.h())).q(),
            IIlIlllIIIIIlIIIIIIIIlllIIlllIIIIllllIIIlllIlIlIIllIlllIllIIIlIIIlIllIIIlIIllIIIIlIIl.a().q(),
            this.a(var4)
         );
      }
   }

   private final float a(float var1, float var2, float var3) {
      return var1 + (var2 - var1) * var3;
   }

   private final float a(float var1) {
      return 1.0F - (1.0F - var1) * (1.0F - var1) * (1.0F - var1);
   }

   @SubscribeEvent
   public final void a(@NotNull llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII var1) {
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      short var10002 = 14151;
      short var10003 = 24365;
      Intrinsics.checkNotNullParameter(var1, "event");
      String var2 = var10000;
      if (IIlIlllIIIIIlIIIIIIIIlllIIlllIIIIllllIIIlllIlIlIIllIlllIllIIIlIIIlIllIIIlIIllIIIIlIIl.f().ae()) {
         Options var3 = this.ap().options;
         if (var2 == null) {
            if (var3.getCameraType() != CameraType.THIRD_PERSON_FRONT) {
               return;
            }

            var3 = this.ap().options;
         }

         var3.setCameraType(CameraType.FIRST_PERSON);
      }
   }

   @JvmStatic
   @NotNull
   public static final IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII ai() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.a();
   }

   @JvmStatic
   @NotNull
   public static final IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl aG() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.b();
   }

   @JvmStatic
   @NotNull
   public static final IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl aH() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.c();
   }

   @JvmStatic
   @NotNull
   public static final IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl aI() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.d();
   }

   @JvmStatic
   @NotNull
   public static final IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl aJ() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.e();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "þò\u0006\u0018Ñ\u008f Ý\u0017¤g¹å\u0098\u0088§ûÑÎ¼TØHÁÍÞÿ\u0093N\u0087J±«T½\u009aÂ\u0007Ñ";
      int var4 = "þò\u0006\u0018Ñ\u008f Ý\u0017¤g¹å\u0098\u0088§ûÑÎ¼TØHÁÍÞÿ\u0093N\u0087J±«T½\u009aÂ\u0007Ñ".length();
      char var1 = 6;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 8;
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
                     case 0 -> 14;
                     case 1 -> 120;
                     case 2 -> 87;
                     case 3 -> 104;
                     case 4 -> 64;
                     case 5 -> 32;
                     default -> 97;
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
                     f = var5;
                     g = new String[4];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new llIIlIIIlIIIlIllIlIllIIlIIlIlllIIIIlIIlIIIllIlIlIlIIIllllIllIIIllllIIIIIllIllIIllllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new llIIlIIIlIIIlIllIlIllIIlIIlIlllIIIIlIIlIIIllIlIlIlIIIllllIllIIIllllIIIIIllIllIIllllll();
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

                  var2 = "\u000e÷\u0082\"ÛR\u0005:\u00adî\u0097Y";
                  var4 = "\u000e÷\u0082\"ÛR\u0005:\u00adî\u0097Y".length();
                  var1 = 6;
                  var8 = -1;
            }

            var10000 = 53;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 14148) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 153;
            case 1 -> 201;
            case 2 -> 48;
            case 3 -> 30;
            case 4 -> 6;
            case 5 -> 138;
            case 6 -> 5;
            case 7 -> 211;
            case 8 -> 171;
            case 9 -> 252;
            case 10 -> 250;
            case 11 -> 243;
            case 12 -> 81;
            case 13 -> 121;
            case 14 -> 132;
            case 15 -> 181;
            case 16 -> 135;
            case 17 -> 223;
            case 18 -> 79;
            case 19 -> 58;
            case 20 -> 213;
            case 21 -> 186;
            case 22 -> 11;
            case 23 -> 133;
            case 24 -> 193;
            case 25 -> 167;
            case 26 -> 140;
            case 27 -> 131;
            case 28 -> 72;
            case 29 -> 93;
            case 30 -> 108;
            case 31 -> 33;
            case 32 -> 159;
            case 33 -> 149;
            case 34 -> 191;
            case 35 -> 236;
            case 36 -> 207;
            case 37 -> 77;
            case 38 -> 59;
            case 39 -> 248;
            case 40 -> 86;
            case 41 -> 134;
            case 42 -> 107;
            case 43 -> 42;
            case 44 -> 156;
            case 45 -> 53;
            case 46 -> 247;
            case 47 -> 168;
            case 48 -> 18;
            case 49 -> 111;
            case 50 -> 123;
            case 51 -> 155;
            case 52 -> 14;
            case 53 -> 116;
            case 54 -> 44;
            case 55 -> 215;
            case 56 -> 66;
            case 57 -> 228;
            case 58 -> 164;
            case 59 -> 36;
            case 60 -> 9;
            case 61 -> 198;
            case 62 -> 238;
            case 63 -> 237;
            case 64 -> 212;
            case 65 -> 208;
            case 66 -> 92;
            case 67 -> 118;
            case 68 -> 224;
            case 69 -> 196;
            case 70 -> 106;
            case 71 -> 57;
            case 72 -> 225;
            case 73 -> 254;
            case 74 -> 173;
            case 75 -> 205;
            case 76 -> 231;
            case 77 -> 122;
            case 78 -> 109;
            case 79 -> 37;
            case 80 -> 50;
            case 81 -> 110;
            case 82 -> 214;
            case 83 -> 100;
            case 84 -> 200;
            case 85 -> 184;
            case 86 -> 43;
            case 87 -> 158;
            case 88 -> 130;
            case 89 -> 182;
            case 90 -> 40;
            case 91 -> 95;
            case 92 -> 203;
            case 93 -> 78;
            case 94 -> 96;
            case 95 -> 1;
            case 96 -> 163;
            case 97 -> 234;
            case 98 -> 119;
            case 99 -> 169;
            case 100 -> 55;
            case 101 -> 56;
            case 102 -> 24;
            case 103 -> 3;
            case 104 -> 54;
            case 105 -> 47;
            case 106 -> 239;
            case 107 -> 227;
            case 108 -> 13;
            case 109 -> 29;
            case 110 -> 67;
            case 111 -> 241;
            case 112 -> 4;
            case 113 -> 216;
            case 114 -> 183;
            case 115 -> 197;
            case 116 -> 74;
            case 117 -> 226;
            case 118 -> 137;
            case 119 -> 27;
            case 120 -> 251;
            case 121 -> 35;
            case 122 -> 242;
            case 123 -> 38;
            case 124 -> 202;
            case 125 -> 204;
            case 126 -> 160;
            case 127 -> 20;
            case 128 -> 41;
            case 129 -> 142;
            case 130 -> 105;
            case 131 -> 145;
            case 132 -> 245;
            case 133 -> 113;
            case 134 -> 73;
            case 135 -> 75;
            case 136 -> 230;
            case 137 -> 51;
            case 138 -> 255;
            case 139 -> 115;
            case 140 -> 71;
            case 141 -> 64;
            case 142 -> 10;
            case 143 -> 83;
            case 144 -> 246;
            case 145 -> 102;
            case 146 -> 210;
            case 147 -> 165;
            case 148 -> 76;
            case 149 -> 52;
            case 150 -> 88;
            case 151 -> 187;
            case 152 -> 99;
            case 153 -> 85;
            case 154 -> 87;
            case 155 -> 120;
            case 156 -> 161;
            case 157 -> 136;
            case 158 -> 179;
            case 159 -> 89;
            case 160 -> 139;
            case 161 -> 253;
            case 162 -> 127;
            case 163 -> 150;
            case 164 -> 32;
            case 165 -> 199;
            case 166 -> 217;
            case 167 -> 143;
            case 168 -> 190;
            case 169 -> 172;
            case 170 -> 240;
            case 171 -> 177;
            case 172 -> 12;
            case 173 -> 46;
            case 174 -> 180;
            case 175 -> 176;
            case 176 -> 128;
            case 177 -> 185;
            case 178 -> 154;
            case 179 -> 249;
            case 180 -> 90;
            case 181 -> 7;
            case 182 -> 31;
            case 183 -> 209;
            case 184 -> 232;
            case 185 -> 69;
            case 186 -> 49;
            case 187 -> 229;
            case 188 -> 82;
            case 189 -> 21;
            case 190 -> 144;
            case 191 -> 141;
            case 192 -> 170;
            case 193 -> 16;
            case 194 -> 157;
            case 195 -> 61;
            case 196 -> 117;
            case 197 -> 147;
            case 198 -> 104;
            case 199 -> 65;
            case 200 -> 221;
            case 201 -> 189;
            case 202 -> 28;
            case 203 -> 101;
            case 204 -> 166;
            case 205 -> 91;
            case 206 -> 151;
            case 207 -> 23;
            case 208 -> 175;
            case 209 -> 218;
            case 210 -> 15;
            case 211 -> 112;
            case 212 -> 126;
            case 213 -> 0;
            case 214 -> 188;
            case 215 -> 233;
            case 216 -> 17;
            case 217 -> 194;
            case 218 -> 152;
            case 219 -> 192;
            case 220 -> 97;
            case 221 -> 124;
            case 222 -> 60;
            case 223 -> 68;
            case 224 -> 195;
            case 225 -> 45;
            case 226 -> 244;
            case 227 -> 25;
            case 228 -> 220;
            case 229 -> 39;
            case 230 -> 174;
            case 231 -> 222;
            case 232 -> 114;
            case 233 -> 235;
            case 234 -> 70;
            case 235 -> 146;
            case 236 -> 206;
            case 237 -> 162;
            case 238 -> 22;
            case 239 -> 103;
            case 240 -> 219;
            case 241 -> 2;
            case 242 -> 94;
            case 243 -> 84;
            case 244 -> 125;
            case 245 -> 26;
            case 246 -> 62;
            case 247 -> 19;
            case 248 -> 178;
            case 249 -> 129;
            case 250 -> 148;
            case 251 -> 34;
            case 252 -> 63;
            case 253 -> 80;
            case 254 -> 8;
            default -> 98;
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

         g[var2] = new String(var3).intern();
      }

      return g[var2];
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker pxMarker) {
           this();
        }


      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @JvmStatic
      @NotNull
      public final IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII a() {
         return IIlIlllIIIIIlIIIIIIIIlllIIlllIIIIllllIIIlllIlIlIIllIlllIllIIIlIIIlIllIIIlIIllIIIIlIIl.a();
      }

      @JvmStatic
      @NotNull
      public final IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl b() {
         return IIlIlllIIIIIlIIIIIIIIlllIIlllIIIIllllIIIlllIlIlIIllIlllIllIIIlIIIlIllIIIlIIllIIIIlIIl.b();
      }

      @JvmStatic
      @NotNull
      public final IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl c() {
         return IIlIlllIIIIIlIIIIIIIIlllIIlllIIIIllllIIIlllIlIlIIllIlllIllIIIlIIIlIllIIIlIIllIIIIlIIl.c();
      }

      @JvmStatic
      @NotNull
      public final IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl d() {
         return IIlIlllIIIIIlIIIIIIIIlllIIlllIIIIllllIIIlllIlIlIIllIlllIllIIIlIIIlIllIIIlIIllIIIIlIIl.d();
      }

      @JvmStatic
      @NotNull
      public final IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl e() {
         return IIlIlllIIIIIlIIIIIIIIlllIIlllIIIIllllIIIlllIlIlIIllIlllIllIIIlIIIlIllIIIlIIllIIIIlIIl.e();
      }
   }
}
