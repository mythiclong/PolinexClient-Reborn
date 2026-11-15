package me.octo.client;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.utils.player.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.chicken.Chicken;
import net.minecraft.world.entity.animal.cow.Cow;
import net.minecraft.world.entity.animal.equine.Horse;
import net.minecraft.world.entity.animal.pig.Pig;
import net.minecraft.world.entity.animal.rabbit.Rabbit;
import net.minecraft.world.entity.animal.sheep.Sheep;
import org.jetbrains.annotations.NotNull;

public final class IlIlIlIllIlIIlIIllllIIIIIIlIlIIlIllIllIlIIIlIllllIlIlIlIIllIllIIIllIlIIIIlIlllIIlIIII
   extends lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI {
   @NotNull
   public static IlIlIlIllIlIIlIIllllIIIIIIlIlIIlIllIllIlIIIlIllllIlIlIlIIllIllIIIllIlIIIIlIlllIIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
   @NotNull
   private static List<Class<? extends Entity>> IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
   @NotNull
   private static List<String> IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
   private static String[] c;
   private static String[] d;

   @NotNull
   public static final List<Class<? extends Entity>> s() {
      return IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
   }

   @NotNull
   public static final List<String> t() {
      return IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
   }

   public IlIlIlIllIlIIlIIllllIIIIIIlIlIIlIllIllIlIIIlIllllIlIlIlIIllIllIIIllIlIIIIlIlllIIlIIII() {
      super(
         IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a()
      );
   }

   public final void a(@NotNull Entity var1) {
      short var10001 = 31922;
      short var10002 = -2867;
      Intrinsics.checkNotNullParameter(var1, "animal");
   }

   @Override
   public double a(
      @NotNull lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1,
      @NotNull LocalPlayer var2
   ) {
      short var10001 = 31935;
      short var10002 = -10504;
      Intrinsics.checkNotNullParameter(var1, "mob");
      var10001 = 31930;
      var10002 = 22666;
      Intrinsics.checkNotNullParameter(var2, "player");
      boolean var10000 = lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c();
      LivingEntity var4 = var1.a();
      boolean var3 = var10000;
      double var5 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(
               llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(var4),
               llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(var2)
            )
         + me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .d(llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(var4))
            * 0.3;
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b(
            !var3
         );
      }

      return var5;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var22 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[14];
      int var3 = 0;
      String var2 = "¤\u0014\u0000\u0087DÃ\u0006RB»ú\\\u0012\u0005m`z\u0091\u009a\u0003Rd\u009d\u0007 \u0084Ý\u000bø\u001c\u008b\u0003rpg\u0003Ê\u009fï\nÐ\u008d\u0018îéà\u0007&Å\u0017\u0006ÝW\u0014¹Ë\u008c\u0005\u0004Å8Ô2\nåì¬ÆecÉ\u0012ÚW\u0007ò[Mdwð3";
      int var4 = "¤\u0014\u0000\u0087DÃ\u0006RB»ú\\\u0012\u0005m`z\u0091\u009a\u0003Rd\u009d\u0007 \u0084Ý\u000bø\u001c\u008b\u0003rpg\u0003Ê\u009fï\nÐ\u008d\u0018îéà\u0007&Å\u0017\u0006ÝW\u0014¹Ë\u008c\u0005\u0004Å8Ô2\nåì¬ÆecÉ\u0012ÚW\u0007ò[Mdwð3"
         .length();
      char var1 = 6;
      int var9 = -1;

      label52:
      while (true) {
         byte var10000 = 62;
         String var10001 = var2.substring(++var9, var9 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var37 = var10001.toCharArray();
               int var10004 = var37.length;
               int var6 = 0;
               byte var40 = var10000;
               var22 = var37;
               int var16 = var10004;
               byte var56;
               char[] var60;
               int var10006;
               if (var10004 <= 1) {
                  var60 = var37;
                  var56 = var10000;
                  var10006 = var6;
               } else {
                  var40 = var10000;
                  var16 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var60 = var37;
                  var56 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var60[var10006] = (char)(var60[var10006] ^ var56 ^ switch (var6 % 7) {
                     case 0 -> 122;
                     case 1 -> 24;
                     case 2 -> 61;
                     case 3 -> 103;
                     case 4 -> 50;
                     case 5 -> 2;
                     default -> 67;
                  });
                  var6++;
                  if (var40 == 0) {
                     var10006 = var40;
                     var60 = var22;
                     var56 = var40;
                  } else {
                     if (var16 <= var6) {
                        break;
                     }

                     var60 = var22;
                     var56 = var40;
                     var10006 = var6;
                  }
               }
            }

            String var42 = new String(var22).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var42;
                  if ((var9 += var1) >= var4) {
                     c = var5;
                     d = new String[14];
                     lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI = new IlIlIlIllIlIIlIIllllIIIIIIlIlIIlIllIllIlIIIlIllllIlIlIlIIllIllIIIllIlIIIIlIlllIIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     Class[] var7 = new Class[]{Cow.class, Pig.class, Sheep.class, Chicken.class, Rabbit.class, Horse.class};
                     IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl = CollectionsKt.listOf(var7);
                     String[] var10 = new String[11];
                     var10002 = 31927;
                     short var43 = 10062;
                     var10[0] = "Trackable";
                     var10002 = 31926;
                     short var44 = -31377;
                     var10[1] = "Untrackable";
                     var10002 = 31920;
                     short var45 = 21668;
                     var10[2] = "Undetected";
                     var10002 = 31933;
                     short var46 = -16951;
                     var10[3] = "Endangered";
                     var10002 = 31921;
                     short var47 = 27469;
                     var10[4] = "Elusive";
                     var10002 = 31929;
                     short var48 = -14867;
                     var10[5] = "Cow";
                     var10002 = 31923;
                     short var49 = -19408;
                     var10[6] = "Horse";
                     var10002 = 31928;
                     short var50 = 16267;
                     var10[7] = "Sheep";
                     var10002 = 31932;
                     short var51 = 17490;
                     var10[8] = "Pig";
                     var10002 = 31931;
                     short var52 = -25124;
                     var10[9] = "Rabbit";
                     var10002 = 31934;
                     short var53 = 13586;
                     var10[10] = "Chicken";
                     IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI = CollectionsKt.listOf(var10);
                     break pxClinit;
                  }

                  var1 = var2.charAt(var9);
                  break;
               default:
                  var5[var3++] = var42;
                  if ((var9 += var1) < var4) {
                     var1 = var2.charAt(var9);
                     continue label52;
                  }

                  var2 = "¾ÙâB\u009e5<>_X\b\t°\u009d\u0017D\u009dÄ\u001eO4";
                  var4 = "¾ÙâB\u009e5<>_X\b\t°\u009d\u0017D\u009dÄ\u001eO4".length();
                  var1 = 11;
                  var9 = -1;
            }

            var10000 = 68;
            var10001 = var2.substring(++var9, var9 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 31930) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 163;
            case 1 -> 117;
            case 2 -> 119;
            case 3 -> 216;
            case 4 -> 156;
            case 5 -> 193;
            case 6 -> 56;
            case 7 -> 180;
            case 8 -> 175;
            case 9 -> 202;
            case 10 -> 83;
            case 11 -> 41;
            case 12 -> 75;
            case 13 -> 146;
            case 14 -> 96;
            case 15 -> 1;
            case 16 -> 51;
            case 17 -> 71;
            case 18 -> 33;
            case 19 -> 207;
            case 20 -> 58;
            case 21 -> 145;
            case 22 -> 152;
            case 23 -> 73;
            case 24 -> 249;
            case 25 -> 212;
            case 26 -> 241;
            case 27 -> 251;
            case 28 -> 126;
            case 29 -> 122;
            case 30 -> 35;
            case 31 -> 39;
            case 32 -> 223;
            case 33 -> 27;
            case 34 -> 80;
            case 35 -> 206;
            case 36 -> 63;
            case 37 -> 88;
            case 38 -> 106;
            case 39 -> 229;
            case 40 -> 219;
            case 41 -> 17;
            case 42 -> 191;
            case 43 -> 192;
            case 44 -> 179;
            case 45 -> 89;
            case 46 -> 144;
            case 47 -> 189;
            case 48 -> 143;
            case 49 -> 226;
            case 50 -> 168;
            case 51 -> 121;
            case 52 -> 68;
            case 53 -> 28;
            case 54 -> 157;
            case 55 -> 190;
            case 56 -> 15;
            case 57 -> 185;
            case 58 -> 43;
            case 59 -> 162;
            case 60 -> 170;
            case 61 -> 253;
            case 62 -> 233;
            case 63 -> 182;
            case 64 -> 40;
            case 65 -> 187;
            case 66 -> 20;
            case 67 -> 111;
            case 68 -> 186;
            case 69 -> 130;
            case 70 -> 244;
            case 71 -> 84;
            case 72 -> 125;
            case 73 -> 171;
            case 74 -> 134;
            case 75 -> 53;
            case 76 -> 10;
            case 77 -> 166;
            case 78 -> 70;
            case 79 -> 104;
            case 80 -> 161;
            case 81 -> 172;
            case 82 -> 32;
            case 83 -> 211;
            case 84 -> 164;
            case 85 -> 109;
            case 86 -> 13;
            case 87 -> 201;
            case 88 -> 7;
            case 89 -> 38;
            case 90 -> 81;
            case 91 -> 254;
            case 92 -> 131;
            case 93 -> 118;
            case 94 -> 12;
            case 95 -> 62;
            case 96 -> 132;
            case 97 -> 153;
            case 98 -> 52;
            case 99 -> 255;
            case 100 -> 205;
            case 101 -> 93;
            case 102 -> 25;
            case 103 -> 194;
            case 104 -> 105;
            case 105 -> 50;
            case 106 -> 92;
            case 107 -> 220;
            case 108 -> 183;
            case 109 -> 167;
            case 110 -> 100;
            case 111 -> 227;
            case 112 -> 232;
            case 113 -> 42;
            case 114 -> 5;
            case 115 -> 137;
            case 116 -> 228;
            case 117 -> 6;
            case 118 -> 0;
            case 119 -> 78;
            case 120 -> 59;
            case 121 -> 231;
            case 122 -> 94;
            case 123 -> 66;
            case 124 -> 136;
            case 125 -> 24;
            case 126 -> 34;
            case 127 -> 158;
            case 128 -> 154;
            case 129 -> 45;
            case 130 -> 236;
            case 131 -> 54;
            case 132 -> 245;
            case 133 -> 31;
            case 134 -> 181;
            case 135 -> 72;
            case 136 -> 238;
            case 137 -> 147;
            case 138 -> 37;
            case 139 -> 110;
            case 140 -> 65;
            case 141 -> 184;
            case 142 -> 116;
            case 143 -> 224;
            case 144 -> 112;
            case 145 -> 142;
            case 146 -> 29;
            case 147 -> 246;
            case 148 -> 248;
            case 149 -> 188;
            case 150 -> 18;
            case 151 -> 97;
            case 152 -> 165;
            case 153 -> 213;
            case 154 -> 218;
            case 155 -> 30;
            case 156 -> 102;
            case 157 -> 124;
            case 158 -> 61;
            case 159 -> 141;
            case 160 -> 138;
            case 161 -> 176;
            case 162 -> 22;
            case 163 -> 46;
            case 164 -> 135;
            case 165 -> 127;
            case 166 -> 217;
            case 167 -> 140;
            case 168 -> 133;
            case 169 -> 120;
            case 170 -> 155;
            case 171 -> 8;
            case 172 -> 177;
            case 173 -> 214;
            case 174 -> 225;
            case 175 -> 128;
            case 176 -> 55;
            case 177 -> 129;
            case 178 -> 48;
            case 179 -> 221;
            case 180 -> 215;
            case 181 -> 160;
            case 182 -> 90;
            case 183 -> 159;
            case 184 -> 21;
            case 185 -> 222;
            case 186 -> 98;
            case 187 -> 200;
            case 188 -> 101;
            case 189 -> 123;
            case 190 -> 2;
            case 191 -> 243;
            case 192 -> 113;
            case 193 -> 151;
            case 194 -> 85;
            case 195 -> 44;
            case 196 -> 76;
            case 197 -> 208;
            case 198 -> 86;
            case 199 -> 169;
            case 200 -> 67;
            case 201 -> 235;
            case 202 -> 174;
            case 203 -> 247;
            case 204 -> 103;
            case 205 -> 204;
            case 206 -> 91;
            case 207 -> 178;
            case 208 -> 49;
            case 209 -> 199;
            case 210 -> 4;
            case 211 -> 3;
            case 212 -> 148;
            case 213 -> 203;
            case 214 -> 195;
            case 215 -> 69;
            case 216 -> 115;
            case 217 -> 114;
            case 218 -> 36;
            case 219 -> 197;
            case 220 -> 23;
            case 221 -> 239;
            case 222 -> 237;
            case 223 -> 150;
            case 224 -> 250;
            case 225 -> 79;
            case 226 -> 74;
            case 227 -> 149;
            case 228 -> 107;
            case 229 -> 57;
            case 230 -> 108;
            case 231 -> 26;
            case 232 -> 173;
            case 233 -> 87;
            case 234 -> 196;
            case 235 -> 209;
            case 236 -> 242;
            case 237 -> 64;
            case 238 -> 139;
            case 239 -> 47;
            case 240 -> 19;
            case 241 -> 82;
            case 242 -> 198;
            case 243 -> 252;
            case 244 -> 210;
            case 245 -> 14;
            case 246 -> 234;
            case 247 -> 99;
            case 248 -> 9;
            case 249 -> 240;
            case 250 -> 230;
            case 251 -> 16;
            case 252 -> 60;
            case 253 -> 11;
            case 254 -> 95;
            default -> 77;
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker pxMarker) {
           this();
        }


      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final List<Class<? extends Entity>> a() {
         return IlIlIlIllIlIIlIIllllIIIIIIlIlIIlIllIllIlIIIlIllllIlIlIlIIllIllIIIllIlIIIIlIlllIIlIIII.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
      }

      @NotNull
      public final List<String> b() {
         return IlIlIlIllIlIIlIIllllIIIIIIlIlIIlIllIllIlIIIlIllllIlIlIlIIllIllIIIllIlIIIIlIlllIIlIIII.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
      }
   }
}
