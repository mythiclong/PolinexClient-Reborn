package me.octo.client;

import me.octo.client.events.impl.lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;

public class IlllIIIlIlIIIIIIlIllIIlllllIIllIlIllIlllIIllllIlIllIIlllIIlIIlIIIIIIIllIlIlllIlIIlIII {
   public static int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] a;
   private static String[] b;

   @SubscribeEvent
   public void a(lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI var1) {
      boolean var2 = IIlIlIIIllIlllIlIIIIIIIIIIIIlIlIIlIIllllIllllIllllIIllIllIlIIllllllIllIlllIllIIIlIllI.c();
      if (!var1.c()) {
         Minecraft var10000 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if (!var2) {
            if (me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .player
               == null) {
               return;
            }

            var10000 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         if (var10000.level != null) {
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl++;
         }
      }
   }

   @SubscribeEvent(
      priority = EventPriority.HIGHEST
   )
   public void a(me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      Object var8 = null; // PX-FIX
      Object var12 = null; // PX-FIX
      Object var11 = null; // PX-FIX
      boolean var2 = IIlIlIIIllIlllIlIIIIIIIIIIIIlIlIIlIIllllIllllIllllIIllIllIlIIllllllIllIlllIllIIIlIllI.c();
      Minecraft var10000 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      if (!var2) {
         if (me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .player
            == null) {
            return;
         }

         var10000 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      if (var10000.level != null) {
         Packet var9 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         if (!var2) {
            if (var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI == null) {
               return;
            }

            var9 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         }

         Packet var4 = var9;
         Packet var10 = var4;
         if (!var2) {
            if (!(var4 instanceof ClientboundSystemChatPacket)) {
               return;
            }

            var10 = var4;
         }

         label99: {
            label100: {
               label75: {
                  label101: {
                     ClientboundSystemChatPacket var3 = (ClientboundSystemChatPacket)var10;
                     var8 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a(var3.content().getString().trim());
                     short var10001 = 3993;
                     short var10002 = 4966;
                     var11 = ((me.octo.client.PXDyn)var8).startsWith("Evacuating to Hub...");
                     if (!var2) {
                        if ((me.octo.client.PxTruth.truth(var11))) {
                           break label101;
                        }

                        var10001 = 3994;
                        var10002 = 3173;
                        var11 = ((me.octo.client.PXDyn)var8).startsWith("☠ You");
                     }

                     if (var2) {
                        break label100;
                     }

                     if (!(me.octo.client.PxTruth.truth(var11))) {
                        break label75;
                     }
                  }

                  me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.k();
               }

               var12 = var8;
               if (var2) {
                  break label99;
               }

               short var15 = 3995;
               short var17 = -27164;
               var11 = ((me.octo.client.PXDyn)var8).startsWith("[Important] This server will restart soon");
            }

            if ((me.octo.client.PxTruth.truth(var11))) {
               lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = true;
            }

            var12 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .getUser()
               .getName()
               .toLowerCase();
         }

         String var5 =((String)( var12));
         String var6 = ((me.octo.client.PXDyn)var8).toLowerCase();
         String[] var7 = var6.split(":");
         int var13 = ((var6.contains(var5)) ? 1 : 0);
         if (!var2) {
            if (var13 == 0) {
               return;
            }

            var13 = ((var6.contains(":")) ? 1 : 0);
         }

         if (!var2) {
            if (var13 == 0) {
               return;
            }

            var13 = var7.length;
         }

         if (!var2) {
            if (var13 <= 1) {
               return;
            }

            var13 = ((var7[0].contains(var5)) ? 1 : 0);
         }

         if (!var2 && var13 == 0) {
            llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .a(
                  (me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)(Object)(((String)(((String)(Object)(new me.octo.client.events.impl.IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll(
                     (String)var8
                  ))))))
               );
         }
      }
   }

   @SubscribeEvent(
      priority = EventPriority.HIGHEST
   )
   public void a(me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 0;
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = false;
   }

   public static boolean a(ClientboundPlayerPositionPacket var0) {
      boolean var1 = IIlIlIIIllIlllIlIIIIIIIIIIIIlIlIIlIIllllIllllIllllIIllIllIlIIllllllIllIlllIllIIIlIllI.c();
      ClientboundPlayerPositionPacket var10000 = var0;
      if (!var1) {
         if (var0 == null) {
            return false;
         }

         var10000 = var0;
      }

      int var2 = Math.round(var10000.change().yRot());
      if (!var1) {
         if (var2 != -180) {
            return false;
         }

         float var3;
         var2 = (var3 = var0.change().xRot() - 0.0F) == 0.0F ? 0 : (var3 < 0.0F ? -1 : 1);
      }

      if (!var1) {
         if (var2 != 0) {
            return false;
         }

         double var4;
         var2 = (var4 = var0.change().position().x() - 0.5) == 0.0 ? 0 : (var4 < 0.0 ? -1 : 1);
      }

      if (!var1) {
         if (var2 != 0) {
            return false;
         }

         double var5;
         var2 = (var5 = var0.change().position().y() - 77.0) == 0.0 ? 0 : (var5 < 0.0 ? -1 : 1);
      }

      if (!var1) {
         if (var2 != 0) {
            return false;
         }

         double var6;
         var2 = (var6 = var0.change().position().z() - -0.5) == 0.0 ? 0 : (var6 < 0.0 ? -1 : 1);
      }

      if (!var1) {
         if (var2 != 0) {
            return false;
         }

         var2 =(( lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) ? 1 : 0);
      }

      return (var2 != 0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "ÇT\u001a1o\u0090Ã¼Ë\u0011,{\u009dû÷N%\ffT« \u0098Ró\u00841`\u0014¸|ó±¸fÝ÷\u008d\u001e@\u0095\u0005☀ïÂ\u001dÜ\u0014ñ\u000f\r\u0091\u001aæ4\u000b5ý\u008eÃ z=9;yäP";
      int var4 = "ÇT\u001a1o\u0090Ã¼Ë\u0011,{\u009dû÷N%\ffT« \u0098Ró\u00841`\u0014¸|ó±¸fÝ÷\u008d\u001e@\u0095\u0005☀ïÂ\u001dÜ\u0014ñ\u000f\r\u0091\u001aæ4\u000b5ý\u008eÃ z=9;yäP"
         .length();
      char var1 = ')';
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 122;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 122;
               var10006 = var6;
            } else {
               var13 = 122;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 122;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 102;
                  case 1 -> 86;
                  case 2 -> 70;
                  case 3 -> 84;
                  case 4 -> 126;
                  case 5 -> 5;
                  default -> 34;
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
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 0;
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = false;
            break pxClinit; // PX-FIX
         }

         var1 = var2.charAt(var0);
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 3995) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 188;
            case 1 -> 124;
            case 2 -> 17;
            case 3 -> 20;
            case 4 -> 98;
            case 5 -> 189;
            case 6 -> 239;
            case 7 -> 223;
            case 8 -> 15;
            case 9 -> 138;
            case 10 -> 131;
            case 11 -> 44;
            case 12 -> 75;
            case 13 -> 31;
            case 14 -> 163;
            case 15 -> 6;
            case 16 -> 198;
            case 17 -> 218;
            case 18 -> 158;
            case 19 -> 233;
            case 20 -> 70;
            case 21 -> 205;
            case 22 -> 220;
            case 23 -> 127;
            case 24 -> 173;
            case 25 -> 145;
            case 26 -> 1;
            case 27 -> 103;
            case 28 -> 41;
            case 29 -> 214;
            case 30 -> 27;
            case 31 -> 128;
            case 32 -> 45;
            case 33 -> 29;
            case 34 -> 35;
            case 35 -> 51;
            case 36 -> 129;
            case 37 -> 175;
            case 38 -> 108;
            case 39 -> 178;
            case 40 -> 222;
            case 41 -> 89;
            case 42 -> 22;
            case 43 -> 74;
            case 44 -> 121;
            case 45 -> 94;
            case 46 -> 40;
            case 47 -> 24;
            case 48 -> 112;
            case 49 -> 37;
            case 50 -> 28;
            case 51 -> 253;
            case 52 -> 236;
            case 53 -> 48;
            case 54 -> 38;
            case 55 -> 85;
            case 56 -> 12;
            case 57 -> 216;
            case 58 -> 139;
            case 59 -> 96;
            case 60 -> 185;
            case 61 -> 148;
            case 62 -> 71;
            case 63 -> 243;
            case 64 -> 26;
            case 65 -> 116;
            case 66 -> 5;
            case 67 -> 95;
            case 68 -> 30;
            case 69 -> 69;
            case 70 -> 213;
            case 71 -> 196;
            case 72 -> 154;
            case 73 -> 248;
            case 74 -> 224;
            case 75 -> 107;
            case 76 -> 78;
            case 77 -> 237;
            case 78 -> 246;
            case 79 -> 23;
            case 80 -> 180;
            case 81 -> 179;
            case 82 -> 49;
            case 83 -> 50;
            case 84 -> 86;
            case 85 -> 182;
            case 86 -> 77;
            case 87 -> 67;
            case 88 -> 181;
            case 89 -> 118;
            case 90 -> 125;
            case 91 -> 150;
            case 92 -> 81;
            case 93 -> 0;
            case 94 -> 207;
            case 95 -> 110;
            case 96 -> 105;
            case 97 -> 251;
            case 98 -> 170;
            case 99 -> 93;
            case 100 -> 55;
            case 101 -> 147;
            case 102 -> 202;
            case 103 -> 193;
            case 104 -> 54;
            case 105 -> 144;
            case 106 -> 68;
            case 107 -> 136;
            case 108 -> 255;
            case 109 -> 156;
            case 110 -> 34;
            case 111 -> 102;
            case 112 -> 80;
            case 113 -> 231;
            case 114 -> 99;
            case 115 -> 161;
            case 116 -> 132;
            case 117 -> 111;
            case 118 -> 167;
            case 119 -> 232;
            case 120 -> 210;
            case 121 -> 113;
            case 122 -> 42;
            case 123 -> 97;
            case 124 -> 241;
            case 125 -> 229;
            case 126 -> 10;
            case 127 -> 254;
            case 128 -> 235;
            case 129 -> 130;
            case 130 -> 58;
            case 131 -> 157;
            case 132 -> 166;
            case 133 -> 36;
            case 134 -> 174;
            case 135 -> 217;
            case 136 -> 88;
            case 137 -> 3;
            case 138 -> 225;
            case 139 -> 104;
            case 140 -> 168;
            case 141 -> 244;
            case 142 -> 183;
            case 143 -> 115;
            case 144 -> 13;
            case 145 -> 209;
            case 146 -> 32;
            case 147 -> 242;
            case 148 -> 56;
            case 149 -> 227;
            case 150 -> 206;
            case 151 -> 212;
            case 152 -> 249;
            case 153 -> 208;
            case 154 -> 43;
            case 155 -> 66;
            case 156 -> 11;
            case 157 -> 238;
            case 158 -> 160;
            case 159 -> 197;
            case 160 -> 91;
            case 161 -> 65;
            case 162 -> 33;
            case 163 -> 21;
            case 164 -> 195;
            case 165 -> 16;
            case 166 -> 141;
            case 167 -> 59;
            case 168 -> 82;
            case 169 -> 172;
            case 170 -> 4;
            case 171 -> 63;
            case 172 -> 201;
            case 173 -> 109;
            case 174 -> 247;
            case 175 -> 114;
            case 176 -> 9;
            case 177 -> 146;
            case 178 -> 39;
            case 179 -> 211;
            case 180 -> 122;
            case 181 -> 187;
            case 182 -> 46;
            case 183 -> 120;
            case 184 -> 101;
            case 185 -> 221;
            case 186 -> 153;
            case 187 -> 228;
            case 188 -> 135;
            case 189 -> 14;
            case 190 -> 199;
            case 191 -> 57;
            case 192 -> 19;
            case 193 -> 159;
            case 194 -> 92;
            case 195 -> 176;
            case 196 -> 52;
            case 197 -> 123;
            case 198 -> 191;
            case 199 -> 171;
            case 200 -> 140;
            case 201 -> 117;
            case 202 -> 2;
            case 203 -> 133;
            case 204 -> 64;
            case 205 -> 25;
            case 206 -> 192;
            case 207 -> 149;
            case 208 -> 79;
            case 209 -> 215;
            case 210 -> 164;
            case 211 -> 60;
            case 212 -> 151;
            case 213 -> 165;
            case 214 -> 73;
            case 215 -> 87;
            case 216 -> 83;
            case 217 -> 47;
            case 218 -> 234;
            case 219 -> 100;
            case 220 -> 62;
            case 221 -> 204;
            case 222 -> 126;
            case 223 -> 137;
            case 224 -> 84;
            case 225 -> 61;
            case 226 -> 142;
            case 227 -> 7;
            case 228 -> 186;
            case 229 -> 230;
            case 230 -> 53;
            case 231 -> 194;
            case 232 -> 134;
            case 233 -> 203;
            case 234 -> 184;
            case 235 -> 72;
            case 236 -> 177;
            case 237 -> 190;
            case 238 -> 252;
            case 239 -> 143;
            case 240 -> 245;
            case 241 -> 240;
            case 242 -> 76;
            case 243 -> 106;
            case 244 -> 200;
            case 245 -> 250;
            case 246 -> 219;
            case 247 -> 90;
            case 248 -> 169;
            case 249 -> 119;
            case 250 -> 152;
            case 251 -> 8;
            case 252 -> 155;
            case 253 -> 18;
            case 254 -> 162;
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
