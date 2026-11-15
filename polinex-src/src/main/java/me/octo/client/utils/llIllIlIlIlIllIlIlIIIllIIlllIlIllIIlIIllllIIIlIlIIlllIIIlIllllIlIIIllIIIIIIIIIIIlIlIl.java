package me.octo.client.utils;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll;
import me.octo.client.IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI;
import me.octo.client.lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII;
import me.octo.client.lIlIllllIllIIlIIIIIIlIIIlllllIIIIllIIIIIIllllIIIIIIlllIlIllIIIIIIIIllllIIlllllIllIlII;
import me.octo.client.llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
    public static <T> T a(Object... args) { return null; } // PX-FIX ovld-var
    public static <T> T a(Object p0) { return null; } // PX-FIX ovld2
   @NotNull
   public static llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Minecraft lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] a;
   private static String[] b;

   private llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl() {
   }

   public final void a() {
      int[] var1 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      if (var1 != null && lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.player != null) {
         LocalPlayer var2 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.player;
         if (var1 != null && lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.level != null) {
            ClientLevel var3;
            boolean var10000;
            var3 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.level;
            IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var4 = lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
            var10000 = var4 instanceof llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI;
            label71:
            if (var1 != null) {
               if (!var10000) {
                  var10000 = var4 instanceof IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll;
                  if (var1 == null) {
                     break label71;
                  }

                  if (!var10000) {
                     var10000 = false;
                     break label71;
                  }
               }

               var10000 = true;
            }

            boolean var5 = var10000;
            var10000 = var5;
            if (var1 != null) {
               if (var5) {
                  Vec3 var6 = me.octo.client.utils.player.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(var2);
                  AABB var17 = AABB.ofSize(var6, 16.0, 16.0, 16.0);
                  short var10002 = -25895;
                  short var10003 = -5453;
                  Intrinsics.checkNotNullExpressionValue(var17, "ofSize(...)");
                  AABB var7 = var17;
                  List var9 = var3.getEntitiesOfClass(
                     ArmorStand.class, var7, llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl::a
                  );
                  short var10001 = -25896;
                  var10002 = 293;
                  Intrinsics.checkNotNullExpressionValue(var9, "getEntitiesOfClass(...)");
                  boolean var15 = false;
                  Iterator var10 = var9.iterator();

                  label58:
                  while (true) {
                     var10000 = var10.hasNext();

                     while (true) {
                        if (!var10000) {
                           break label58;
                        }

                        Object var19 = var10.next();
                        var10002 = -25890;
                        var10003 = 32694;
                        Intrinsics.checkNotNullExpressionValue(var19, "next(...)");
                        ArmorStand var11 = (ArmorStand)var19;
                        String var20 = var11.getName().getString();
                        var10002 = -25893;
                        var10003 = 16201;
                        Intrinsics.checkNotNullExpressionValue(var20, "getString(...)");
                        String var12 = var20;

                        while (true) {
                           CharSequence var21 = var12;
                           var10001 = -25892;
                           var10002 = -19280;
                           var10000 = StringsKt.contains(var21, "'s Mineshaft Portal", false);
                           if (var1 == null) {
                              break;
                           }

                           if (!var10000) {
                              continue label58;
                           }

                           double var13 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .b(
                                 me.octo.client.utils.player.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(var11),
                                 true
                              );
                           if (!(var13 < 7.0)) {
                              continue label58;
                           }

                           var15 = true;
                           lIlIllllIllIIlIIIIIIlIIIlllllIIIIllIIIIIIllllIIIIIIlllIlIllIIIIIIIIllllIIlllllIllIlII.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = true;
                           if (var1 != null) {
                              break label58;
                           }
                        }
                     }
                  }

                  var10000 = var15;
                  if (var1 != null) {
                     if (var15) {
                        return;
                     }

                     var10000 = false;
                  }

                  lIlIllllIllIIlIIIIIIlIIIlllllIIIIllIIIIIIllllIIIIIIlllIlIllIIIIIIIIllllIIlllllIllIlII.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var10000;
                  return;
               }

               var10000 = false;
            }

            lIlIllllIllIIlIIIIIIlIIIlllllIIIIllIIIIIIllllIIIIIIlllIlIllIIIIIIIIllllIIlllllIllIlII.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var10000;
         }
      }
   }

   private static final boolean a(ArmorStand var0) {
      short var10001 = -25894;
      short var10002 = 5906;
      Intrinsics.checkNotNullParameter(var0, "it");
      return true;
   }

   private static final boolean a(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var21 = null; // PX-FIX
      String[] var5 = new String[7];
      int var3 = 0;
      String var2 = "\u0013\u0017\u000e\u001f\u0011Ô\u0010,}¼G#«iNÜ¡\u0017|\u0098¸7»K\u0017]Xü\u0094!ÝkÇ°¢\u0080Y\u0017\u0082\u009d\u0005\u000b\u0099k*\u0006>Õpç\u009añ9\t\u001b[p~i/\u0084\u009aÅ";
      int var4 = "\u0013\u0017\u000e\u001f\u0011Ô\u0010,}¼G#«iNÜ¡\u0017|\u0098¸7»K\u0017]Xü\u0094!ÝkÇ°¢\u0080Y\u0017\u0082\u009d\u0005\u000b\u0099k*\u0006>Õpç\u009añ9\t\u001b[p~i/\u0084\u009aÅ"
         .length();
      char var1 = 2;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 24;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var26 = var10001.toCharArray();
               int var10004 = var26.length;
               int var6 = 0;
               byte var29 = var10000;
               var21 = var26;
               int var15 = var10004;
               byte var35;
               char[] var39;
               int var10006;
               if (var10004 <= 1) {
                  var39 = var26;
                  var35 = var10000;
                  var10006 = var6;
               } else {
                  var29 = var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var39 = var26;
                  var35 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var39[var10006] = (char)(var39[var10006] ^ var35 ^ switch (var6 % 7) {
                     case 0 -> 13;
                     case 1 -> 15;
                     case 2 -> 114;
                     case 3 -> 82;
                     case 4 -> 109;
                     case 5 -> 101;
                     default -> 28;
                  });
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var39 = var21;
                     var35 = var29;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var39 = var21;
                     var35 = var29;
                     var10006 = var6;
                  }
               }
            }

            String var31 = new String(var21).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var31;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[7];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl();
                     Minecraft var10 = Minecraft.getInstance();
                     var10002 = -25889;
                     short var32 = -29194;
                     Intrinsics.checkNotNullExpressionValue(var10, "getInstance(...)");
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var10;
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var31;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "\u0000\u0097g\u008a\u0010&/R¶üèÐ\u009eãüy\u0013õ¯Å]\u009dEh\u0092k¶\u0096\u0087< &ûªÚ«";
                  var4 = "\u0000\u0097g\u008a\u0010&/R¶üèÐ\u009eãüy\u0013õ¯Å]\u009dEh\u0092k¶\u0096\u0087< &ûªÚ«".length();
                  var1 = 16;
                  var8 = -1;
            }

            var10000 = 10;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -25894) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 75;
            case 1 -> 154;
            case 2 -> 121;
            case 3 -> 99;
            case 4 -> 170;
            case 5 -> 76;
            case 6 -> 163;
            case 7 -> 150;
            case 8 -> 126;
            case 9 -> 122;
            case 10 -> 220;
            case 11 -> 83;
            case 12 -> 142;
            case 13 -> 112;
            case 14 -> 86;
            case 15 -> 10;
            case 16 -> 215;
            case 17 -> 202;
            case 18 -> 187;
            case 19 -> 242;
            case 20 -> 138;
            case 21 -> 192;
            case 22 -> 115;
            case 23 -> 213;
            case 24 -> 209;
            case 25 -> 34;
            case 26 -> 37;
            case 27 -> 246;
            case 28 -> 51;
            case 29 -> 50;
            case 30 -> 36;
            case 31 -> 103;
            case 32 -> 178;
            case 33 -> 135;
            case 34 -> 223;
            case 35 -> 254;
            case 36 -> 54;
            case 37 -> 9;
            case 38 -> 231;
            case 39 -> 111;
            case 40 -> 24;
            case 41 -> 133;
            case 42 -> 218;
            case 43 -> 207;
            case 44 -> 147;
            case 45 -> 214;
            case 46 -> 204;
            case 47 -> 48;
            case 48 -> 78;
            case 49 -> 3;
            case 50 -> 200;
            case 51 -> 116;
            case 52 -> 162;
            case 53 -> 110;
            case 54 -> 45;
            case 55 -> 146;
            case 56 -> 233;
            case 57 -> 176;
            case 58 -> 227;
            case 59 -> 130;
            case 60 -> 251;
            case 61 -> 172;
            case 62 -> 194;
            case 63 -> 20;
            case 64 -> 106;
            case 65 -> 15;
            case 66 -> 151;
            case 67 -> 169;
            case 68 -> 31;
            case 69 -> 155;
            case 70 -> 5;
            case 71 -> 119;
            case 72 -> 73;
            case 73 -> 182;
            case 74 -> 39;
            case 75 -> 230;
            case 76 -> 14;
            case 77 -> 177;
            case 78 -> 181;
            case 79 -> 92;
            case 80 -> 26;
            case 81 -> 244;
            case 82 -> 1;
            case 83 -> 60;
            case 84 -> 87;
            case 85 -> 252;
            case 86 -> 95;
            case 87 -> 68;
            case 88 -> 131;
            case 89 -> 132;
            case 90 -> 100;
            case 91 -> 195;
            case 92 -> 240;
            case 93 -> 27;
            case 94 -> 113;
            case 95 -> 225;
            case 96 -> 153;
            case 97 -> 77;
            case 98 -> 224;
            case 99 -> 190;
            case 100 -> 137;
            case 101 -> 134;
            case 102 -> 89;
            case 103 -> 118;
            case 104 -> 49;
            case 105 -> 23;
            case 106 -> 21;
            case 107 -> 250;
            case 108 -> 184;
            case 109 -> 197;
            case 110 -> 191;
            case 111 -> 238;
            case 112 -> 222;
            case 113 -> 248;
            case 114 -> 180;
            case 115 -> 40;
            case 116 -> 97;
            case 117 -> 105;
            case 118 -> 109;
            case 119 -> 13;
            case 120 -> 25;
            case 121 -> 18;
            case 122 -> 81;
            case 123 -> 4;
            case 124 -> 159;
            case 125 -> 63;
            case 126 -> 171;
            case 127 -> 117;
            case 128 -> 239;
            case 129 -> 217;
            case 130 -> 149;
            case 131 -> 102;
            case 132 -> 6;
            case 133 -> 53;
            case 134 -> 62;
            case 135 -> 203;
            case 136 -> 206;
            case 137 -> 243;
            case 138 -> 245;
            case 139 -> 90;
            case 140 -> 208;
            case 141 -> 161;
            case 142 -> 44;
            case 143 -> 221;
            case 144 -> 183;
            case 145 -> 212;
            case 146 -> 205;
            case 147 -> 234;
            case 148 -> 193;
            case 149 -> 19;
            case 150 -> 185;
            case 151 -> 71;
            case 152 -> 232;
            case 153 -> 236;
            case 154 -> 247;
            case 155 -> 79;
            case 156 -> 101;
            case 157 -> 52;
            case 158 -> 198;
            case 159 -> 22;
            case 160 -> 196;
            case 161 -> 35;
            case 162 -> 145;
            case 163 -> 65;
            case 164 -> 7;
            case 165 -> 173;
            case 166 -> 70;
            case 167 -> 107;
            case 168 -> 140;
            case 169 -> 58;
            case 170 -> 64;
            case 171 -> 144;
            case 172 -> 188;
            case 173 -> 139;
            case 174 -> 47;
            case 175 -> 72;
            case 176 -> 29;
            case 177 -> 210;
            case 178 -> 38;
            case 179 -> 166;
            case 180 -> 211;
            case 181 -> 2;
            case 182 -> 123;
            case 183 -> 82;
            case 184 -> 98;
            case 185 -> 120;
            case 186 -> 168;
            case 187 -> 174;
            case 188 -> 94;
            case 189 -> 57;
            case 190 -> 143;
            case 191 -> 74;
            case 192 -> 128;
            case 193 -> 59;
            case 194 -> 42;
            case 195 -> 11;
            case 196 -> 41;
            case 197 -> 253;
            case 198 -> 186;
            case 199 -> 189;
            case 200 -> 235;
            case 201 -> 228;
            case 202 -> 85;
            case 203 -> 30;
            case 204 -> 148;
            case 205 -> 241;
            case 206 -> 28;
            case 207 -> 46;
            case 208 -> 67;
            case 209 -> 56;
            case 210 -> 179;
            case 211 -> 16;
            case 212 -> 156;
            case 213 -> 17;
            case 214 -> 141;
            case 215 -> 69;
            case 216 -> 125;
            case 217 -> 165;
            case 218 -> 237;
            case 219 -> 0;
            case 220 -> 164;
            case 221 -> 201;
            case 222 -> 55;
            case 223 -> 136;
            case 224 -> 255;
            case 225 -> 8;
            case 226 -> 249;
            case 227 -> 229;
            case 228 -> 160;
            case 229 -> 167;
            case 230 -> 157;
            case 231 -> 61;
            case 232 -> 93;
            case 233 -> 175;
            case 234 -> 12;
            case 235 -> 114;
            case 236 -> 91;
            case 237 -> 129;
            case 238 -> 33;
            case 239 -> 104;
            case 240 -> 43;
            case 241 -> 216;
            case 242 -> 219;
            case 243 -> 152;
            case 244 -> 84;
            case 245 -> 88;
            case 246 -> 32;
            case 247 -> 80;
            case 248 -> 127;
            case 249 -> 96;
            case 250 -> 108;
            case 251 -> 199;
            case 252 -> 124;
            case 253 -> 66;
            case 254 -> 158;
            default -> 226;
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
