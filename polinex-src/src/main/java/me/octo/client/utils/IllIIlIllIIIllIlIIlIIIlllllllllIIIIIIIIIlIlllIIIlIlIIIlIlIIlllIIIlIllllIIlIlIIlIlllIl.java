package me.octo.client.utils;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.Connection;
import net.minecraft.network.protocol.Packet;
import org.jetbrains.annotations.NotNull;

public final class IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl
   extends lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   @NotNull
   public static IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] c;
   private static String[] d;

   private IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl() {
   }

   public final void a(@NotNull Packet<?> var1) {
      short var10001 = 9366;
      short var10002 = 7774;
      Intrinsics.checkNotNullParameter(var1, "packet");
      ClientPacketListener var10000 = this.a().getConnection();
      if (var10000 != null) {
         Connection var2 = var10000.getConnection();
         if (var2 != null) {
            var2.send(var1);
         }
      }
   }

   public final void b(@NotNull Packet<?> var1) {
      String var10000 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      short var10002 = 9367;
      short var10003 = -22143;
      Intrinsics.checkNotNullParameter(var1, "packet");
      String var2 = var10000;
      if (var2 == null) {
         ClientPacketListener var3 = this.a().getConnection();
         if (var3 != null) {
            var3.send(var1);
         }
      }
   }

   public final boolean g() {
      String var1 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      if (var1 == null) {
         ClientPacketListener var10000 = this.a().getConnection();
         if (var10000 != null) {
            Connection var2 = var10000.getConnection();
            if (var2 != null) {
               boolean var3 = var2.isConnected();
               if (var1 == null) {
                  ;
               }

               return var3;
            }
         }
      }

      return false;
   }

   public final int h() {
       int var6 = 0; // PX-FIX decl var6
      String var1 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      if (var1 == null) {
         LocalPlayer var10000 = this.a().player;
         if (var10000 != null) {
            label27: {
               LocalPlayer var2 = var10000;
               boolean var3 = false;
               if (var1 == null) {
                  ClientPacketListener var4 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().getConnection();
                  if (var4 != null) {
                     PlayerInfo var5 = var4.getPlayerInfo(var2.getUUID());
                     if (var5 != null) {
                        var6 = var5.getLatency();
                        if (var1 == null) {
                           break label27;
                        }
                     }
                  }
               }

               var6 = 0;
            }

            if (var6 != 0) {
               return var6;
            }
         }
      }

      return -1;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static { int var6 = 0; // PX-FIX hoist
        
   pxClinit: { // PX-FIX
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "]-åã\nþ\u0006þv\u0091\u0088\u0084\u0093";
      int var4 = "]-åã\nþ\u0006þv\u0091\u0088\u0084\u0093".length();
      char var1 = 6;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
             var6 = 0;
            byte var13 = 13;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 13;
               var10006 = var6;
            } else {
               var13 = 13;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 13;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 47;
                  case 1 -> 118;
                  case 2 -> 26;
                  case 3 -> 2;
                  case 4 -> 51;
                  case 5 -> 28;
                  default -> 86;
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
            IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl();
            break pxClinit; // PX-FIX
         }

         var1 = var2.charAt(var0);
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) { int var6 = 0; // PX-FIX hoist
        
      int var2 = (var0 ^ 9367) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 71;
            case 1 -> 38;
            case 2 -> 244;
            case 3 -> 252;
            case 4 -> 243;
            case 5 -> 171;
            case 6 -> 88;
            case 7 -> 196;
            case 8 -> 235;
            case 9 -> 207;
            case 10 -> 191;
            case 11 -> 157;
            case 12 -> 72;
            case 13 -> 133;
            case 14 -> 124;
            case 15 -> 162;
            case 16 -> 4;
            case 17 -> 41;
            case 18 -> 119;
            case 19 -> 91;
            case 20 -> 156;
            case 21 -> 188;
            case 22 -> 240;
            case 23 -> 212;
            case 24 -> 150;
            case 25 -> 173;
            case 26 -> 211;
            case 27 -> 142;
            case 28 -> 13;
            case 29 -> 226;
            case 30 -> 3;
            case 31 -> 15;
            case 32 -> 50;
            case 33 -> 221;
            case 34 -> 59;
            case 35 -> 129;
            case 36 -> 169;
            case 37 -> 228;
            case 38 -> 241;
            case 39 -> 170;
            case 40 -> 168;
            case 41 -> 58;
            case 42 -> 225;
            case 43 -> 174;
            case 44 -> 208;
            case 45 -> 84;
            case 46 -> 102;
            case 47 -> 19;
            case 48 -> 121;
            case 49 -> 0;
            case 50 -> 215;
            case 51 -> 29;
            case 52 -> 90;
            case 53 -> 34;
            case 54 -> 21;
            case 55 -> 44;
            case 56 -> 253;
            case 57 -> 87;
            case 58 -> 55;
            case 59 -> 104;
            case 60 -> 203;
            case 61 -> 138;
            case 62 -> 125;
            case 63 -> 110;
            case 64 -> 68;
            case 65 -> 165;
            case 66 -> 180;
            case 67 -> 181;
            case 68 -> 69;
            case 69 -> 109;
            case 70 -> 193;
            case 71 -> 183;
            case 72 -> 33;
            case 73 -> 56;
            case 74 -> 216;
            case 75 -> 54;
            case 76 -> 176;
            case 77 -> 137;
            case 78 -> 245;
            case 79 -> 79;
            case 80 -> 93;
            case 81 -> 70;
            case 82 -> 49;
            case 83 -> 153;
            case 84 -> 18;
            case 85 -> 202;
            case 86 -> 149;
            case 87 -> 101;
            case 88 -> 155;
            case 89 -> 201;
            case 90 -> 100;
            case 91 -> 126;
            case 92 -> 192;
            case 93 -> 77;
            case 94 -> 140;
            case 95 -> 148;
            case 96 -> 166;
            case 97 -> 197;
            case 98 -> 8;
            case 99 -> 213;
            case 100 -> 48;
            case 101 -> 60;
            case 102 -> 164;
            case 103 -> 117;
            case 104 -> 81;
            case 105 -> 152;
            case 106 -> 46;
            case 107 -> 229;
            case 108 -> 230;
            case 109 -> 80;
            case 110 -> 130;
            case 111 -> 111;
            case 112 -> 198;
            case 113 -> 62;
            case 114 -> 10;
            case 115 -> 76;
            case 116 -> 85;
            case 117 -> 97;
            case 118 -> 99;
            case 119 -> 2;
            case 120 -> 63;
            case 121 -> 210;
            case 122 -> 108;
            case 123 -> 73;
            case 124 -> 5;
            case 125 -> 223;
            case 126 -> 254;
            case 127 -> 114;
            case 128 -> 83;
            case 129 -> 163;
            case 130 -> 35;
            case 131 -> 161;
            case 132 -> 52;
            case 133 -> 195;
            case 134 -> 205;
            case 135 -> 112;
            case 136 -> 20;
            case 137 -> 96;
            case 138 -> 17;
            case 139 -> 227;
            case 140 -> 145;
            case 141 -> 89;
            case 142 -> 32;
            case 143 -> 16;
            case 144 -> 251;
            case 145 -> 184;
            case 146 -> 147;
            case 147 -> 11;
            case 148 -> 75;
            case 149 -> 248;
            case 150 -> 206;
            case 151 -> 222;
            case 152 -> 232;
            case 153 -> 154;
            case 154 -> 26;
            case 155 -> 28;
            case 156 -> 160;
            case 157 -> 57;
            case 158 -> 12;
            case 159 -> 22;
            case 160 -> 30;
            case 161 -> 159;
            case 162 -> 107;
            case 163 -> 115;
            case 164 -> 65;
            case 165 -> 217;
            case 166 -> 219;
            case 167 -> 118;
            case 168 -> 224;
            case 169 -> 200;
            case 170 -> 95;
            case 171 -> 64;
            case 172 -> 179;
            case 173 -> 190;
            case 174 -> 249;
            case 175 -> 214;
            case 176 -> 135;
            case 177 -> 146;
            case 178 -> 141;
            case 179 -> 27;
            case 180 -> 105;
            case 181 -> 182;
            case 182 -> 36;
            case 183 -> 143;
            case 184 -> 40;
            case 185 -> 177;
            case 186 -> 120;
            case 187 -> 1;
            case 188 -> 7;
            case 189 -> 25;
            case 190 -> 242;
            case 191 -> 186;
            case 192 -> 61;
            case 193 -> 220;
            case 194 -> 189;
            case 195 -> 98;
            case 196 -> 51;
            case 197 -> 6;
            case 198 -> 37;
            case 199 -> 128;
            case 200 -> 43;
            case 201 -> 172;
            case 202 -> 204;
            case 203 -> 24;
            case 204 -> 42;
            case 205 -> 14;
            case 206 -> 23;
            case 207 -> 47;
            case 208 -> 136;
            case 209 -> 82;
            case 210 -> 122;
            case 211 -> 127;
            case 212 -> 175;
            case 213 -> 250;
            case 214 -> 187;
            case 215 -> 239;
            case 216 -> 234;
            case 217 -> 151;
            case 218 -> 92;
            case 219 -> 66;
            case 220 -> 178;
            case 221 -> 123;
            case 222 -> 31;
            case 223 -> 194;
            case 224 -> 218;
            case 225 -> 103;
            case 226 -> 86;
            case 227 -> 231;
            case 228 -> 237;
            case 229 -> 74;
            case 230 -> 131;
            case 231 -> 134;
            case 232 -> 247;
            case 233 -> 236;
            case 234 -> 113;
            case 235 -> 209;
            case 236 -> 158;
            case 237 -> 9;
            case 238 -> 132;
            case 239 -> 139;
            case 240 -> 167;
            case 241 -> 233;
            case 242 -> 67;
            case 243 -> 255;
            case 244 -> 39;
            case 245 -> 144;
            case 246 -> 45;
            case 247 -> 94;
            case 248 -> 185;
            case 249 -> 199;
            case 250 -> 78;
            case 251 -> 116;
            case 252 -> 53;
            case 253 -> 238;
            case 254 -> 246;
            default -> 106;
         };
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

          var6 = ((var1 & 65535) >>> 8) - var4;
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
}
