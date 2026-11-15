package me.octo.client.events.impl;

import com.mojang.blaze3d.platform.Window;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;
import org.joml.Vector2f;

public final class lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII
   extends me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII(Object... px) {
           this((GuiGraphicsExtractor)null); // PX-FIX: 委托主构造器（final 字段初始化）
        }

   @Nullable
   private final GuiGraphicsExtractor IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private final Window IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private final DeltaTracker lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private final float IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private final Vector2f llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private final Matrix4f lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static String[] c;
   private static String[] d;

   public lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII(@Nullable GuiGraphicsExtractor var1) {
      IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.n();
      super();
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
      Window var10001 = Minecraft.getInstance().getWindow();
      short var10003 = 29068;
      short var10004 = 29994;
      Intrinsics.checkNotNullExpressionValue(var10001, "getWindow(...)");
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var10001;
      DeltaTracker var3 = Minecraft.getInstance().getDeltaTracker();
      var10003 = 29069;
      var10004 = -6260;
      Intrinsics.checkNotNullExpressionValue(var3, "getDeltaTracker(...)");
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var3;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
         .getGameTimeDeltaPartialTick(false);
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new Vector2f(
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.getGuiScaledWidth(),
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.getGuiScaledHeight()
      );
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new Matrix4f();
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.b("pFOBQb");
      }
   }

   @Nullable
   public final GuiGraphicsExtractor k() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @NotNull
   public final Window l() {
      return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   @NotNull
   public final DeltaTracker m() {
      return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   public final float n() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   @NotNull
   public final Vector2f o() {
      return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   @NotNull
   public final Matrix4f p() {
      return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   public lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII() {
      this(null, 1, null);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "ñ\u0010PÛLÁäS¶Q&üh\u0010\u0014!ÐJÐ\u0003Ó\u0090]\t\u0005Ù*tb]\u0018(G\u0015C";
      int var4 = "ñ\u0010PÛLÁäS¶Q&üh\u0010\u0014!ÐJÐ\u0003Ó\u0090]\t\u0005Ù*tb]\u0018(G\u0015C".length();
      char var1 = 14;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 94;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 94;
               var10006 = var6;
            } else {
               var13 = 94;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 94;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 113;
                  case 1 -> 47;
                  case 2 -> 42;
                  case 3 -> 55;
                  case 4 -> 5;
                  case 5 -> 26;
                  default -> 120;
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
            c = var5;
            d = new String[2];
            break pxClinit; // PX-FIX
         }

         var1 = var2.charAt(var0);
      }
   } // PX-FIX end pxClinit
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 29068) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 239;
            case 1 -> 225;
            case 2 -> 27;
            case 3 -> 88;
            case 4 -> 116;
            case 5 -> 222;
            case 6 -> 161;
            case 7 -> 247;
            case 8 -> 192;
            case 9 -> 54;
            case 10 -> 97;
            case 11 -> 109;
            case 12 -> 41;
            case 13 -> 108;
            case 14 -> 35;
            case 15 -> 5;
            case 16 -> 198;
            case 17 -> 182;
            case 18 -> 104;
            case 19 -> 226;
            case 20 -> 251;
            case 21 -> 133;
            case 22 -> 69;
            case 23 -> 1;
            case 24 -> 66;
            case 25 -> 187;
            case 26 -> 63;
            case 27 -> 181;
            case 28 -> 254;
            case 29 -> 197;
            case 30 -> 77;
            case 31 -> 76;
            case 32 -> 172;
            case 33 -> 92;
            case 34 -> 170;
            case 35 -> 56;
            case 36 -> 20;
            case 37 -> 155;
            case 38 -> 107;
            case 39 -> 131;
            case 40 -> 193;
            case 41 -> 127;
            case 42 -> 151;
            case 43 -> 163;
            case 44 -> 185;
            case 45 -> 98;
            case 46 -> 47;
            case 47 -> 236;
            case 48 -> 37;
            case 49 -> 9;
            case 50 -> 174;
            case 51 -> 212;
            case 52 -> 234;
            case 53 -> 201;
            case 54 -> 2;
            case 55 -> 100;
            case 56 -> 190;
            case 57 -> 120;
            case 58 -> 12;
            case 59 -> 52;
            case 60 -> 152;
            case 61 -> 205;
            case 62 -> 130;
            case 63 -> 51;
            case 64 -> 233;
            case 65 -> 241;
            case 66 -> 110;
            case 67 -> 217;
            case 68 -> 93;
            case 69 -> 243;
            case 70 -> 146;
            case 71 -> 122;
            case 72 -> 74;
            case 73 -> 132;
            case 74 -> 25;
            case 75 -> 16;
            case 76 -> 121;
            case 77 -> 167;
            case 78 -> 188;
            case 79 -> 184;
            case 80 -> 33;
            case 81 -> 126;
            case 82 -> 244;
            case 83 -> 28;
            case 84 -> 117;
            case 85 -> 255;
            case 86 -> 229;
            case 87 -> 204;
            case 88 -> 15;
            case 89 -> 4;
            case 90 -> 10;
            case 91 -> 206;
            case 92 -> 140;
            case 93 -> 150;
            case 94 -> 91;
            case 95 -> 179;
            case 96 -> 156;
            case 97 -> 89;
            case 98 -> 171;
            case 99 -> 235;
            case 100 -> 147;
            case 101 -> 242;
            case 102 -> 44;
            case 103 -> 8;
            case 104 -> 128;
            case 105 -> 26;
            case 106 -> 85;
            case 107 -> 67;
            case 108 -> 105;
            case 109 -> 118;
            case 110 -> 42;
            case 111 -> 208;
            case 112 -> 136;
            case 113 -> 165;
            case 114 -> 115;
            case 115 -> 153;
            case 116 -> 114;
            case 117 -> 129;
            case 118 -> 112;
            case 119 -> 183;
            case 120 -> 34;
            case 121 -> 238;
            case 122 -> 186;
            case 123 -> 60;
            case 124 -> 23;
            case 125 -> 87;
            case 126 -> 250;
            case 127 -> 111;
            case 128 -> 22;
            case 129 -> 119;
            case 130 -> 36;
            case 131 -> 45;
            case 132 -> 141;
            case 133 -> 215;
            case 134 -> 166;
            case 135 -> 106;
            case 136 -> 134;
            case 137 -> 216;
            case 138 -> 159;
            case 139 -> 59;
            case 140 -> 142;
            case 141 -> 228;
            case 142 -> 40;
            case 143 -> 71;
            case 144 -> 162;
            case 145 -> 102;
            case 146 -> 70;
            case 147 -> 191;
            case 148 -> 78;
            case 149 -> 237;
            case 150 -> 32;
            case 151 -> 219;
            case 152 -> 39;
            case 153 -> 61;
            case 154 -> 148;
            case 155 -> 240;
            case 156 -> 224;
            case 157 -> 211;
            case 158 -> 194;
            case 159 -> 123;
            case 160 -> 96;
            case 161 -> 7;
            case 162 -> 177;
            case 163 -> 64;
            case 164 -> 21;
            case 165 -> 139;
            case 166 -> 81;
            case 167 -> 95;
            case 168 -> 207;
            case 169 -> 149;
            case 170 -> 252;
            case 171 -> 31;
            case 172 -> 73;
            case 173 -> 3;
            case 174 -> 180;
            case 175 -> 94;
            case 176 -> 29;
            case 177 -> 50;
            case 178 -> 135;
            case 179 -> 125;
            case 180 -> 232;
            case 181 -> 176;
            case 182 -> 218;
            case 183 -> 101;
            case 184 -> 58;
            case 185 -> 249;
            case 186 -> 53;
            case 187 -> 19;
            case 188 -> 214;
            case 189 -> 157;
            case 190 -> 199;
            case 191 -> 196;
            case 192 -> 75;
            case 193 -> 189;
            case 194 -> 213;
            case 195 -> 14;
            case 196 -> 248;
            case 197 -> 200;
            case 198 -> 6;
            case 199 -> 86;
            case 200 -> 65;
            case 201 -> 55;
            case 202 -> 164;
            case 203 -> 138;
            case 204 -> 175;
            case 205 -> 90;
            case 206 -> 49;
            case 207 -> 220;
            case 208 -> 72;
            case 209 -> 173;
            case 210 -> 231;
            case 211 -> 43;
            case 212 -> 143;
            case 213 -> 18;
            case 214 -> 84;
            case 215 -> 79;
            case 216 -> 46;
            case 217 -> 137;
            case 218 -> 245;
            case 219 -> 221;
            case 220 -> 227;
            case 221 -> 209;
            case 222 -> 113;
            case 223 -> 253;
            case 224 -> 83;
            case 225 -> 203;
            case 226 -> 223;
            case 227 -> 210;
            case 228 -> 169;
            case 229 -> 17;
            case 230 -> 38;
            case 231 -> 68;
            case 232 -> 57;
            case 233 -> 230;
            case 234 -> 13;
            case 235 -> 48;
            case 236 -> 0;
            case 237 -> 30;
            case 238 -> 24;
            case 239 -> 168;
            case 240 -> 160;
            case 241 -> 154;
            case 242 -> 11;
            case 243 -> 145;
            case 244 -> 202;
            case 245 -> 62;
            case 246 -> 80;
            case 247 -> 124;
            case 248 -> 158;
            case 249 -> 103;
            case 250 -> 246;
            case 251 -> 195;
            case 252 -> 144;
            case 253 -> 178;
            case 254 -> 82;
            default -> 99;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }

   public lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII(net.minecraft.client.gui.GuiGraphicsExtractor p0, int p1, kotlin.jvm.internal.DefaultConstructorMarker p2) {
      this(p0);
   }
}
