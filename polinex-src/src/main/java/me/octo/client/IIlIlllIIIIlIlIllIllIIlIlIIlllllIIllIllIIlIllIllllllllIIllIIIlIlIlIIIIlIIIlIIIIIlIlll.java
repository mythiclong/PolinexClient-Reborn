package me.octo.client;

import com.google.gson.JsonObject;
import java.io.File;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.player.LocalPlayer;
import org.jetbrains.annotations.NotNull;

public final class IIlIlllIIIIlIlIllIllIIlIlIIlllllIIllIllIIlIllIllllllllIIllIIIlIlIlIIIIlIIIlIIIIIlIlll
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static IIlIlllIIIIlIlIllIllIIlIlIIlllllIIllIllIIlIllIllllllllIIllIIIlIlIlIIIIlIIIlIIIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private final String lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private static IIlIlllIIIIlIlIllIllIIlIlIIlllllIIllIllIIlIllIllllllllIIllIIIlIlIlIIIIlIIIlIIIIIlIlll lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static String[] f;
   private static String[] g;

   private IIlIlllIIIIlIlIllIllIIlIlIIlllllIIllIllIIlIllIllllllllIIllIIIlIlIlIIIIlIIIlIIIIIlIlll() {
      short var10001 = -12635;
      short var10002 = -3257;
      var10002 = -12638;
      short var10003 = 11260;
      short var10004 = -12639;
      short var10005 = 2753;
      super(
         "rotation recorder blehhhh",
         "test dont push to prod pls",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
         "Dev Modules"
      );
      String var1 = this.ap().gameDirectory.getAbsolutePath();
      var10002 = -12637;
      var10003 = -13369;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var1 + "/polinexdevtest/rotations.json";
   }

   @NotNull
   public final String ag() {
      return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   @Override
   public void aB() {
      int var10000 = lIIlllllllIlIlIIlIIlllIIIIIIIllIIIlIIIIIIlIlIIlIIIIIllIIIllIlIIIIIllllIlllllllIllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c();
      super.aB();
      int var1 = var10000;
      File var2 = new File(this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl);
      if (var1 == 0 && var2.exists()) {
         var2.delete();
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIllIlllIIIIIllllIlllIIllIIIlIIllIIllIIlIllIIllIIIlIllIIlIIIIIlIIIIlIlIIIIIIlIlllIllI var1) {
      int var2;
      File var3;
      label25: {
         short var10001 = -12640;
         short var10002 = 8195;
         Intrinsics.checkNotNullParameter(var1, "event");
         int var10000 = lIIlllllllIlIlIIlIIlllIIIIIIIllIIIlIIIIIIlIlIIlIIIIIllIIIllIlIIIIIllllIlllllllIllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
         var3 = new File(this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl);
         var2 = var10000;
         File var11 = var3;
         if (var2 != 0) {
            if (var3.exists()) {
               break label25;
            }

            var11 = var3.getParentFile();
         }

         if (var11 != null) {
            var11.mkdirs();
         }

         try {
            var3.createNewFile();
         }
         catch (java.io.IOException iOException) {
            throw new RuntimeException(iOException);
         }
         var10001 = -12633;
         var10002 = -27562;
         FilesKt.writeText(var3, "[]", null);
      }

      me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII var5 = me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var6 = false;
      JsonObject var7 = new JsonObject();
      boolean var9 = false;
      me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII var12 = me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      short var16 = -12628;
      short var10003 = -4137;
      LocalPlayer var19 = this.ap().player;
      Intrinsics.checkNotNull(var19);
      var12.a(var7, "yaw", var19.getYRot());
      var12 = me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      var16 = -12636;
      var10003 = -26623;
      LocalPlayer var21 = this.ap().player;
      Intrinsics.checkNotNull(var21);
      var12.a(var7, "pitch", var21.getXRot());
      var16 = -12634;
      var10003 = -27070;
      me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var7, "time", System.nanoTime());
      me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var7, var3, true);
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         lIIlllllllIlIlIIlIIlllIIIIIIIllIIIlIIIIIIlIlIIlIIIIIllIIIllIlIIIIIllllIlllllllIllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b(
            ++var2
         );
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[9];
      int var3 = 0;
      String var2 = "`\u0099\u00026;\u0019%·è7zÅ\u00814aSOÜH½I\u001d·hAB8gUå\u0085\u0004âXÏ\b\u0002\u009b\u0084\u0005\u0097¢Z \u001f\u000bQÜ\u0094P\u008eF\n\u00996\u0089v\u001a\u0092¯ßj/Ôõº»Ðß¢ñ¼¥uûVd\u009bÆ\u008d\u0089-[A";
      int var4 = "`\u0099\u00026;\u0019%·è7zÅ\u00814aSOÜH½I\u001d·hAB8gUå\u0085\u0004âXÏ\b\u0002\u009b\u0084\u0005\u0097¢Z \u001f\u000bQÜ\u0094P\u008eF\n\u00996\u0089v\u001a\u0092¯ßj/Ôõº»Ðß¢ñ¼¥uûVd\u009bÆ\u008d\u0089-[A"
         .length();
      char var1 = 5;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 113;
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
                     case 0 -> 51;
                     case 1 -> 104;
                     case 2 -> 61;
                     case 3 -> 112;
                     case 4 -> 17;
                     case 5 -> 86;
                     default -> 38;
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
                     g = new String[9];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IIlIlllIIIIlIlIllIllIIlIlIIlllllIIllIllIIlIllIllllllllIIllIIIlIlIlIIIIlIIIlIIIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new IIlIlllIIIIlIlIllIllIIlIlIIlllllIIllIllIIlIllIllllllllIIllIIIlIlIlIIIIlIIIlIIIIIlIlll();
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

                  var2 = "\u0085\u0085\f\u009d\u009e&´¤Õ\u009f\u001bº¤\u0098\u0092ÏÃcÄ\u0095P-q\u0096à«q«Ýè\u0003Å®\u0080";
                  var4 = "\u0085\u0085\f\u009d\u009e&´¤Õ\u009f\u001bº¤\u0098\u0092ÏÃcÄ\u0095P-q\u0096à«q«Ýè\u0003Å®\u0080".length();
                  var1 = 30;
                  var8 = -1;
            }

            var10000 = 2;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   public static final IIlIlllIIIIlIlIllIllIIlIlIIlllllIIllIllIIlIllIllllllllIIllIIIlIlIlIIIIlIIIlIIIIIlIlll ah() {
      return lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -12636) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 125;
            case 1 -> 121;
            case 2 -> 94;
            case 3 -> 162;
            case 4 -> 251;
            case 5 -> 167;
            case 6 -> 34;
            case 7 -> 29;
            case 8 -> 58;
            case 9 -> 225;
            case 10 -> 230;
            case 11 -> 0;
            case 12 -> 138;
            case 13 -> 84;
            case 14 -> 2;
            case 15 -> 55;
            case 16 -> 242;
            case 17 -> 131;
            case 18 -> 4;
            case 19 -> 106;
            case 20 -> 197;
            case 21 -> 86;
            case 22 -> 14;
            case 23 -> 164;
            case 24 -> 115;
            case 25 -> 204;
            case 26 -> 89;
            case 27 -> 141;
            case 28 -> 254;
            case 29 -> 142;
            case 30 -> 150;
            case 31 -> 65;
            case 32 -> 98;
            case 33 -> 173;
            case 34 -> 175;
            case 35 -> 37;
            case 36 -> 90;
            case 37 -> 191;
            case 38 -> 35;
            case 39 -> 140;
            case 40 -> 170;
            case 41 -> 1;
            case 42 -> 97;
            case 43 -> 87;
            case 44 -> 209;
            case 45 -> 224;
            case 46 -> 27;
            case 47 -> 71;
            case 48 -> 233;
            case 49 -> 214;
            case 50 -> 222;
            case 51 -> 245;
            case 52 -> 32;
            case 53 -> 15;
            case 54 -> 145;
            case 55 -> 244;
            case 56 -> 215;
            case 57 -> 25;
            case 58 -> 70;
            case 59 -> 237;
            case 60 -> 64;
            case 61 -> 10;
            case 62 -> 156;
            case 63 -> 19;
            case 64 -> 216;
            case 65 -> 177;
            case 66 -> 228;
            case 67 -> 189;
            case 68 -> 66;
            case 69 -> 219;
            case 70 -> 100;
            case 71 -> 81;
            case 72 -> 73;
            case 73 -> 247;
            case 74 -> 186;
            case 75 -> 159;
            case 76 -> 211;
            case 77 -> 118;
            case 78 -> 18;
            case 79 -> 172;
            case 80 -> 229;
            case 81 -> 232;
            case 82 -> 252;
            case 83 -> 36;
            case 84 -> 153;
            case 85 -> 112;
            case 86 -> 40;
            case 87 -> 218;
            case 88 -> 69;
            case 89 -> 127;
            case 90 -> 120;
            case 91 -> 196;
            case 92 -> 51;
            case 93 -> 208;
            case 94 -> 79;
            case 95 -> 43;
            case 96 -> 180;
            case 97 -> 6;
            case 98 -> 183;
            case 99 -> 28;
            case 100 -> 193;
            case 101 -> 192;
            case 102 -> 57;
            case 103 -> 50;
            case 104 -> 231;
            case 105 -> 151;
            case 106 -> 93;
            case 107 -> 63;
            case 108 -> 13;
            case 109 -> 96;
            case 110 -> 217;
            case 111 -> 206;
            case 112 -> 203;
            case 113 -> 108;
            case 114 -> 210;
            case 115 -> 143;
            case 116 -> 184;
            case 117 -> 22;
            case 118 -> 207;
            case 119 -> 119;
            case 120 -> 46;
            case 121 -> 107;
            case 122 -> 105;
            case 123 -> 250;
            case 124 -> 152;
            case 125 -> 113;
            case 126 -> 72;
            case 127 -> 49;
            case 128 -> 17;
            case 129 -> 253;
            case 130 -> 165;
            case 131 -> 139;
            case 132 -> 148;
            case 133 -> 80;
            case 134 -> 190;
            case 135 -> 109;
            case 136 -> 60;
            case 137 -> 103;
            case 138 -> 202;
            case 139 -> 122;
            case 140 -> 47;
            case 141 -> 24;
            case 142 -> 221;
            case 143 -> 187;
            case 144 -> 168;
            case 145 -> 133;
            case 146 -> 227;
            case 147 -> 249;
            case 148 -> 161;
            case 149 -> 234;
            case 150 -> 101;
            case 151 -> 160;
            case 152 -> 123;
            case 153 -> 169;
            case 154 -> 147;
            case 155 -> 116;
            case 156 -> 39;
            case 157 -> 155;
            case 158 -> 16;
            case 159 -> 128;
            case 160 -> 110;
            case 161 -> 124;
            case 162 -> 163;
            case 163 -> 220;
            case 164 -> 75;
            case 165 -> 146;
            case 166 -> 56;
            case 167 -> 52;
            case 168 -> 76;
            case 169 -> 91;
            case 170 -> 54;
            case 171 -> 144;
            case 172 -> 135;
            case 173 -> 48;
            case 174 -> 213;
            case 175 -> 114;
            case 176 -> 238;
            case 177 -> 78;
            case 178 -> 33;
            case 179 -> 126;
            case 180 -> 44;
            case 181 -> 132;
            case 182 -> 235;
            case 183 -> 246;
            case 184 -> 201;
            case 185 -> 200;
            case 186 -> 240;
            case 187 -> 111;
            case 188 -> 53;
            case 189 -> 68;
            case 190 -> 134;
            case 191 -> 182;
            case 192 -> 226;
            case 193 -> 95;
            case 194 -> 171;
            case 195 -> 158;
            case 196 -> 199;
            case 197 -> 243;
            case 198 -> 157;
            case 199 -> 21;
            case 200 -> 198;
            case 201 -> 8;
            case 202 -> 179;
            case 203 -> 178;
            case 204 -> 31;
            case 205 -> 188;
            case 206 -> 181;
            case 207 -> 195;
            case 208 -> 88;
            case 209 -> 166;
            case 210 -> 26;
            case 211 -> 30;
            case 212 -> 85;
            case 213 -> 83;
            case 214 -> 12;
            case 215 -> 5;
            case 216 -> 59;
            case 217 -> 212;
            case 218 -> 45;
            case 219 -> 194;
            case 220 -> 205;
            case 221 -> 104;
            case 222 -> 82;
            case 223 -> 62;
            case 224 -> 176;
            case 225 -> 130;
            case 226 -> 236;
            case 227 -> 241;
            case 228 -> 38;
            case 229 -> 255;
            case 230 -> 154;
            case 231 -> 137;
            case 232 -> 129;
            case 233 -> 11;
            case 234 -> 42;
            case 235 -> 92;
            case 236 -> 23;
            case 237 -> 41;
            case 238 -> 3;
            case 239 -> 248;
            case 240 -> 9;
            case 241 -> 61;
            case 242 -> 77;
            case 243 -> 174;
            case 244 -> 74;
            case 245 -> 223;
            case 246 -> 185;
            case 247 -> 20;
            case 248 -> 99;
            case 249 -> 67;
            case 250 -> 239;
            case 251 -> 102;
            case 252 -> 136;
            case 253 -> 7;
            case 254 -> 117;
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

         g[var2] = new String(var3).intern();
      }

      return g[var2];
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final IIlIlllIIIIlIlIllIllIIlIlIIlllllIIllIllIIlIllIllllllllIIllIIIlIlIlIIIIlIIIlIIIIIlIlll a() {
         return IIlIlllIIIIlIlIllIllIIlIlIIlllllIIllIllIIlIllIllllllllIIllIIIlIlIlIIIIlIIIlIIIIIlIlll.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      }
       public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker var1) { this(); }
   }
}
