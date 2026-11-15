package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.mixin.accessors.KeyMappingAccessor;
import net.minecraft.client.KeyMapping;
import org.jetbrains.annotations.NotNull;

public final class IllIIIIllIlllllIlllllllIlIlIIIlIlIIIlIllIIIIlIIlIIIlIllllIIlIlIIIlIlllIIIIlllIIllllll
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static IllIIIIllIlllllIlllllllIlIlIIIlIlIIIlIllIIIIlIIlIIIlIllllIIlIlIIIlIlllIIIIlllIIllllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private static IllIIIIllIlllllIlllllllIlIlIIIlIlIIIlIllIIIIlIIlIIIlIllllIIlIlIIIlIlllIIIIlllIIllllll lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] f;
   private static String[] g;

   private IllIIIIllIlllllIlllllllIlIlIIIlIlIIIlIllIIIIlIIlIIIlIllllIIlIlIIIlIlllIIIIlllIIllllll() {
      short var10001 = -2156;
      short var10002 = 4031;
      var10002 = -2153;
      short var10003 = 12368;
      short var10004 = -2159;
      short var10005 = -1689;
      super(
         "Toggle Sprint",
         "Forces you into a permanent sprinting state.",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
         "Movement"
      );
   }

   @SubscribeEvent
   public final void a(@NotNull lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI var1) {
      int var10000 = lIIlllllllIlIlIIlIIlllIIIIIIIllIIIlIIIIIIlIlIIlIIIIIllIIIllIlIIIIIllllIlllllllIllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c();
      short var10002 = -2154;
      short var10003 = -3952;
      Intrinsics.checkNotNullParameter(var1, "event");
      int var2 = var10000;
      if (var2 == 0) {
         if (var1.c()) {
            return;
         }

         KeyMapping var3 = this.ap().options.keySprint;
         var10002 = -2155;
         var10003 = 5231;
         Intrinsics.checkNotNull(var3, "null cannot be cast to non-null type me.octo.client.mixin.accessors.KeyMappingAccessor");
         KeyMapping.set(((KeyMappingAccessor)var3).getKey(), true);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[5];
      int var3 = 0;
      String var2 = "\u0019=ë¦,W\u009eO\u0016\"£víÑwv¬\u0004<¼W\u0018Öè'@J\u009bpZ¾<ÒÛ\u008e\u008ci2Ú8üÑ\u00ad¼fÀÛ\u007f¡\u0001oªÌG \u009bÙÿþÁaS\u000e\u0014Uêíßê+Â\u0007hÂ NZ.O*U¿×\u0013Lë\r\u0016\u0099|`øã\u0080\"¢\bõÃ\u008f,UøQHãtË.Ôá\u008e\u001e\u009a\u00ad[\u0089\u008f\u0083\\0Ùf\u0080e\u008eñmãàÎtxL>\u001d\u0097fv\u0082\u000e-\u0011I\u0010";
      int var4 = "\u0019=ë¦,W\u009eO\u0016\"£víÑwv¬\u0004<¼W\u0018Öè'@J\u009bpZ¾<ÒÛ\u008e\u008ci2Ú8üÑ\u00ad¼fÀÛ\u007f¡\u0001oªÌG \u009bÙÿþÁaS\u000e\u0014Uêíßê+Â\u0007hÂ NZ.O*U¿×\u0013Lë\r\u0016\u0099|`øã\u0080\"¢\bõÃ\u008f,UøQHãtË.Ôá\u008e\u001e\u009a\u00ad[\u0089\u008f\u0083\\0Ùf\u0080e\u008eñmãàÎtxL>\u001d\u0097fv\u0082\u000e-\u0011I\u0010"
         .length();
      char var1 = 'V';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 61;
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
                     case 0 -> 53;
                     case 1 -> 81;
                     case 2 -> 59;
                     case 3 -> 6;
                     case 4 -> 109;
                     case 5 -> 91;
                     default -> 105;
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
                     g = new String[5];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IllIIIIllIlllllIlllllllIlIlIIIlIlIIIlIllIIIIlIIlIIIlIllllIIlIlIIIlIlllIIIIlllIIllllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new IllIIIIllIlllllIlllllllIlIlIIIlIlIIIlIllIIIIlIIlIIIlIllllIIlIlIIIlIlllIIIIlllIIllllll();
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

                  var2 = "\u0099\u000e\u000b2ß\bý)¹çáÂ_²";
                  var4 = "\u0099\u000e\u000b2ß\bý)¹çáÂ_²".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 8;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -2155) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 225;
            case 1 -> 57;
            case 2 -> 17;
            case 3 -> 196;
            case 4 -> 50;
            case 5 -> 94;
            case 6 -> 177;
            case 7 -> 209;
            case 8 -> 162;
            case 9 -> 42;
            case 10 -> 205;
            case 11 -> 134;
            case 12 -> 136;
            case 13 -> 41;
            case 14 -> 70;
            case 15 -> 40;
            case 16 -> 230;
            case 17 -> 240;
            case 18 -> 103;
            case 19 -> 68;
            case 20 -> 113;
            case 21 -> 179;
            case 22 -> 12;
            case 23 -> 98;
            case 24 -> 15;
            case 25 -> 131;
            case 26 -> 147;
            case 27 -> 151;
            case 28 -> 175;
            case 29 -> 89;
            case 30 -> 117;
            case 31 -> 197;
            case 32 -> 48;
            case 33 -> 194;
            case 34 -> 99;
            case 35 -> 96;
            case 36 -> 181;
            case 37 -> 122;
            case 38 -> 195;
            case 39 -> 253;
            case 40 -> 66;
            case 41 -> 232;
            case 42 -> 28;
            case 43 -> 82;
            case 44 -> 67;
            case 45 -> 8;
            case 46 -> 128;
            case 47 -> 25;
            case 48 -> 156;
            case 49 -> 84;
            case 50 -> 184;
            case 51 -> 83;
            case 52 -> 72;
            case 53 -> 188;
            case 54 -> 239;
            case 55 -> 204;
            case 56 -> 39;
            case 57 -> 203;
            case 58 -> 214;
            case 59 -> 167;
            case 60 -> 217;
            case 61 -> 251;
            case 62 -> 19;
            case 63 -> 216;
            case 64 -> 222;
            case 65 -> 245;
            case 66 -> 101;
            case 67 -> 139;
            case 68 -> 135;
            case 69 -> 226;
            case 70 -> 185;
            case 71 -> 34;
            case 72 -> 182;
            case 73 -> 171;
            case 74 -> 212;
            case 75 -> 208;
            case 76 -> 81;
            case 77 -> 88;
            case 78 -> 97;
            case 79 -> 220;
            case 80 -> 180;
            case 81 -> 58;
            case 82 -> 155;
            case 83 -> 153;
            case 84 -> 165;
            case 85 -> 119;
            case 86 -> 172;
            case 87 -> 238;
            case 88 -> 231;
            case 89 -> 143;
            case 90 -> 60;
            case 91 -> 173;
            case 92 -> 23;
            case 93 -> 53;
            case 94 -> 137;
            case 95 -> 201;
            case 96 -> 190;
            case 97 -> 110;
            case 98 -> 80;
            case 99 -> 224;
            case 100 -> 2;
            case 101 -> 1;
            case 102 -> 69;
            case 103 -> 146;
            case 104 -> 211;
            case 105 -> 32;
            case 106 -> 104;
            case 107 -> 5;
            case 108 -> 243;
            case 109 -> 27;
            case 110 -> 133;
            case 111 -> 227;
            case 112 -> 198;
            case 113 -> 33;
            case 114 -> 178;
            case 115 -> 118;
            case 116 -> 71;
            case 117 -> 149;
            case 118 -> 252;
            case 119 -> 145;
            case 120 -> 3;
            case 121 -> 74;
            case 122 -> 234;
            case 123 -> 64;
            case 124 -> 59;
            case 125 -> 235;
            case 126 -> 169;
            case 127 -> 18;
            case 128 -> 221;
            case 129 -> 29;
            case 130 -> 247;
            case 131 -> 130;
            case 132 -> 237;
            case 133 -> 186;
            case 134 -> 45;
            case 135 -> 7;
            case 136 -> 11;
            case 137 -> 161;
            case 138 -> 160;
            case 139 -> 187;
            case 140 -> 199;
            case 141 -> 246;
            case 142 -> 95;
            case 143 -> 157;
            case 144 -> 152;
            case 145 -> 31;
            case 146 -> 9;
            case 147 -> 115;
            case 148 -> 62;
            case 149 -> 21;
            case 150 -> 78;
            case 151 -> 44;
            case 152 -> 73;
            case 153 -> 90;
            case 154 -> 200;
            case 155 -> 105;
            case 156 -> 63;
            case 157 -> 37;
            case 158 -> 206;
            case 159 -> 223;
            case 160 -> 109;
            case 161 -> 92;
            case 162 -> 102;
            case 163 -> 116;
            case 164 -> 207;
            case 165 -> 144;
            case 166 -> 215;
            case 167 -> 111;
            case 168 -> 36;
            case 169 -> 127;
            case 170 -> 236;
            case 171 -> 76;
            case 172 -> 249;
            case 173 -> 159;
            case 174 -> 193;
            case 175 -> 254;
            case 176 -> 26;
            case 177 -> 6;
            case 178 -> 75;
            case 179 -> 100;
            case 180 -> 191;
            case 181 -> 148;
            case 182 -> 85;
            case 183 -> 49;
            case 184 -> 158;
            case 185 -> 51;
            case 186 -> 250;
            case 187 -> 22;
            case 188 -> 112;
            case 189 -> 126;
            case 190 -> 87;
            case 191 -> 124;
            case 192 -> 218;
            case 193 -> 16;
            case 194 -> 123;
            case 195 -> 210;
            case 196 -> 164;
            case 197 -> 244;
            case 198 -> 192;
            case 199 -> 65;
            case 200 -> 228;
            case 201 -> 52;
            case 202 -> 202;
            case 203 -> 241;
            case 204 -> 142;
            case 205 -> 46;
            case 206 -> 138;
            case 207 -> 163;
            case 208 -> 54;
            case 209 -> 13;
            case 210 -> 43;
            case 211 -> 77;
            case 212 -> 106;
            case 213 -> 174;
            case 214 -> 150;
            case 215 -> 24;
            case 216 -> 233;
            case 217 -> 125;
            case 218 -> 129;
            case 219 -> 91;
            case 220 -> 229;
            case 221 -> 108;
            case 222 -> 132;
            case 223 -> 170;
            case 224 -> 242;
            case 225 -> 255;
            case 226 -> 213;
            case 227 -> 121;
            case 228 -> 141;
            case 229 -> 176;
            case 230 -> 93;
            case 231 -> 120;
            case 232 -> 79;
            case 233 -> 168;
            case 234 -> 219;
            case 235 -> 38;
            case 236 -> 154;
            case 237 -> 248;
            case 238 -> 189;
            case 239 -> 14;
            case 240 -> 114;
            case 241 -> 183;
            case 242 -> 55;
            case 243 -> 86;
            case 244 -> 140;
            case 245 -> 0;
            case 246 -> 30;
            case 247 -> 166;
            case 248 -> 56;
            case 249 -> 47;
            case 250 -> 10;
            case 251 -> 20;
            case 252 -> 35;
            case 253 -> 107;
            case 254 -> 61;
            default -> 4;
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
      public final IllIIIIllIlllllIlllllllIlIlIIIlIlIIIlIllIIIIlIIlIIIlIllllIIlIlIIIlIlllIIIIlllIIllllll a() {
         return IllIIIIllIlllllIlllllllIlIlIIIlIlIIIlIllIIIIlIIlIIIlIllllIIlIlIIIlIlllIIIIlllIIllllll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      }
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker p0) { this(); }
   }
   public static IllIIIIllIlllllIlllllllIlIlIIIlIlIIIlIllIIIIlIIlIIIlIllllIIlIlIIIlIlllIIIIlllIIllllll ag() { return null; }
}
