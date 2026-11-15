package me.octo.client.utils;

import java.io.PrintStream;
import java.lang.Thread.Builder.OfVirtual;
import lombok.Generated;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.ConnectScreen;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.client.gui.screens.multiplayer.JoinMultiplayerScreen;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.multiplayer.ServerData.Type;
import net.minecraft.client.multiplayer.resolver.ServerAddress;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;

public class lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI {
   public static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static Minecraft lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static String IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static String[] a;
   private static String[] b;

   public static void a(long var0) {
      try {
         Thread.sleep(var0);
      } catch (InterruptedException var3) {
      }
   }

   public static void a() {
      try {
         short var10000 = -31144;
         short var10001 = 1563;
         a("mc.hypixel.net", 25565);
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 0L;
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = false;
      } catch (Exception var1) {
      }
   }

   public static void a(String var0) {
      a(var0, ChatFormatting.GREEN);
   }

   public static void a(String var0, ChatFormatting var1) {
      MutableComponent var2 = Component.literal(var0).withStyle(var1);
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.execute(() -> {
         String var1x = c();
         ClientPacketListener var10000 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.getConnection();
         if (var1x != null) {
            if (var10000 == null) {
               return;
            }

            var10000 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.getConnection();
         }

         var10000.getConnection().disconnect(var2);
      });
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = System.currentTimeMillis();
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = true;
   }

   public static void a(long var0, String var2) {
      a(var0, var2, ChatFormatting.GREEN);
   }

   public static void a(long var0, String var2, ChatFormatting var3) {
      OfVirtual var10000 = Thread.ofVirtual();
      short var10001 = -31142;
      short var10002 = -26100;
      var10000.name("Reconnect-Thread").start(() -> {
         try {
            a(var2, var3);
            Thread.sleep(var0);
            a();
         } catch (Exception var5) {
            PrintStream var10000x = System.err;
            String var10001x = var5.getMessage();
            short var10002x = -31141;
            short var10003 = -8134;
            var10000x.println("Error during reconnect: " + var10001x);
         }
      });
   }

   private static void a(String var0, int var1) {
      short var10002 = -31143;
      short var10003 = -7359;
      ServerData var2 = new ServerData("Hypixel", var0 + ":" + var1, Type.OTHER);
      ServerAddress var3 = ServerAddress.parseString(var0 + ":" + var1);
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.execute(
         () -> ConnectScreen.startConnecting(
            new JoinMultiplayerScreen(new TitleScreen()),
            lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
            var3,
            var2,
            false,
            null
         )
      );
   }

   @Generated
   public static long b() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "\u0002±ÚH]SpsàÙcP\u0017pë%Þè\u007f#¬\u0091Ôí\u0010e\u009eÒXs\u001f+k¬J\u0016á\u0096¿Ç.";
      int var4 = "\u0002±ÚH]SpsàÙcP\u0017pë%Þè\u007f#¬\u0091Ôí\u0010e\u009eÒXs\u001f+k¬J\u0016á\u0096¿Ç.".length();
      char var1 = 24;
      b("NeXSo");
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 35;
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
                     case 0 -> 72;
                     case 1 -> 50;
                     case 2 -> 75;
                     case 3 -> 44;
                     case 4 -> 102;
                     case 5 -> 58;
                     default -> 8;
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
                     a = var5;
                     b = new String[4];
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = false;
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 0L;
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = Minecraft.getInstance();
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "Ãj\u0080\u0093\u0092g\u0006\u000e\r\f\u0086\u0007ÆÁ¨º\u008c\u0085\u0097»Hï";
                  var4 = "Ãj\u0080\u0093\u0092g\u0006\u000e\r\f\u0086\u0007ÆÁ¨º\u008c\u0085\u0097»Hï".length();
                  var1 = 7;
                  var8 = -1;
            }

            var10000 = 103;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   public static void b(String var0) {
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var0;
   }

   public static String c() {
      return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -31141) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 117;
            case 1 -> 207;
            case 2 -> 49;
            case 3 -> 191;
            case 4 -> 177;
            case 5 -> 235;
            case 6 -> 239;
            case 7 -> 138;
            case 8 -> 51;
            case 9 -> 242;
            case 10 -> 254;
            case 11 -> 64;
            case 12 -> 155;
            case 13 -> 89;
            case 14 -> 176;
            case 15 -> 34;
            case 16 -> 22;
            case 17 -> 80;
            case 18 -> 133;
            case 19 -> 105;
            case 20 -> 249;
            case 21 -> 125;
            case 22 -> 121;
            case 23 -> 225;
            case 24 -> 248;
            case 25 -> 98;
            case 26 -> 131;
            case 27 -> 11;
            case 28 -> 166;
            case 29 -> 244;
            case 30 -> 67;
            case 31 -> 62;
            case 32 -> 192;
            case 33 -> 227;
            case 34 -> 204;
            case 35 -> 221;
            case 36 -> 238;
            case 37 -> 148;
            case 38 -> 217;
            case 39 -> 71;
            case 40 -> 93;
            case 41 -> 158;
            case 42 -> 108;
            case 43 -> 40;
            case 44 -> 234;
            case 45 -> 211;
            case 46 -> 195;
            case 47 -> 95;
            case 48 -> 76;
            case 49 -> 96;
            case 50 -> 246;
            case 51 -> 84;
            case 52 -> 52;
            case 53 -> 23;
            case 54 -> 186;
            case 55 -> 106;
            case 56 -> 198;
            case 57 -> 37;
            case 58 -> 164;
            case 59 -> 153;
            case 60 -> 56;
            case 61 -> 150;
            case 62 -> 206;
            case 63 -> 226;
            case 64 -> 161;
            case 65 -> 86;
            case 66 -> 193;
            case 67 -> 210;
            case 68 -> 154;
            case 69 -> 182;
            case 70 -> 54;
            case 71 -> 194;
            case 72 -> 135;
            case 73 -> 120;
            case 74 -> 32;
            case 75 -> 202;
            case 76 -> 185;
            case 77 -> 178;
            case 78 -> 181;
            case 79 -> 8;
            case 80 -> 85;
            case 81 -> 107;
            case 82 -> 5;
            case 83 -> 162;
            case 84 -> 82;
            case 85 -> 92;
            case 86 -> 65;
            case 87 -> 10;
            case 88 -> 28;
            case 89 -> 183;
            case 90 -> 83;
            case 91 -> 212;
            case 92 -> 97;
            case 93 -> 43;
            case 94 -> 137;
            case 95 -> 237;
            case 96 -> 99;
            case 97 -> 110;
            case 98 -> 216;
            case 99 -> 129;
            case 100 -> 187;
            case 101 -> 188;
            case 102 -> 124;
            case 103 -> 42;
            case 104 -> 140;
            case 105 -> 14;
            case 106 -> 17;
            case 107 -> 143;
            case 108 -> 171;
            case 109 -> 174;
            case 110 -> 94;
            case 111 -> 156;
            case 112 -> 201;
            case 113 -> 141;
            case 114 -> 119;
            case 115 -> 213;
            case 116 -> 168;
            case 117 -> 190;
            case 118 -> 58;
            case 119 -> 197;
            case 120 -> 179;
            case 121 -> 6;
            case 122 -> 230;
            case 123 -> 214;
            case 124 -> 63;
            case 125 -> 170;
            case 126 -> 103;
            case 127 -> 7;
            case 128 -> 189;
            case 129 -> 115;
            case 130 -> 203;
            case 131 -> 142;
            case 132 -> 69;
            case 133 -> 81;
            case 134 -> 196;
            case 135 -> 127;
            case 136 -> 145;
            case 137 -> 215;
            case 138 -> 53;
            case 139 -> 88;
            case 140 -> 116;
            case 141 -> 1;
            case 142 -> 15;
            case 143 -> 241;
            case 144 -> 70;
            case 145 -> 159;
            case 146 -> 45;
            case 147 -> 109;
            case 148 -> 172;
            case 149 -> 113;
            case 150 -> 180;
            case 151 -> 60;
            case 152 -> 208;
            case 153 -> 77;
            case 154 -> 222;
            case 155 -> 255;
            case 156 -> 252;
            case 157 -> 146;
            case 158 -> 13;
            case 159 -> 209;
            case 160 -> 19;
            case 161 -> 30;
            case 162 -> 128;
            case 163 -> 247;
            case 164 -> 228;
            case 165 -> 111;
            case 166 -> 72;
            case 167 -> 91;
            case 168 -> 139;
            case 169 -> 136;
            case 170 -> 233;
            case 171 -> 44;
            case 172 -> 165;
            case 173 -> 48;
            case 174 -> 224;
            case 175 -> 160;
            case 176 -> 79;
            case 177 -> 126;
            case 178 -> 90;
            case 179 -> 101;
            case 180 -> 16;
            case 181 -> 184;
            case 182 -> 149;
            case 183 -> 167;
            case 184 -> 25;
            case 185 -> 3;
            case 186 -> 144;
            case 187 -> 66;
            case 188 -> 251;
            case 189 -> 220;
            case 190 -> 152;
            case 191 -> 123;
            case 192 -> 114;
            case 193 -> 122;
            case 194 -> 240;
            case 195 -> 4;
            case 196 -> 2;
            case 197 -> 243;
            case 198 -> 134;
            case 199 -> 46;
            case 200 -> 31;
            case 201 -> 9;
            case 202 -> 130;
            case 203 -> 27;
            case 204 -> 151;
            case 205 -> 39;
            case 206 -> 74;
            case 207 -> 199;
            case 208 -> 253;
            case 209 -> 229;
            case 210 -> 87;
            case 211 -> 33;
            case 212 -> 100;
            case 213 -> 132;
            case 214 -> 20;
            case 215 -> 68;
            case 216 -> 59;
            case 217 -> 218;
            case 218 -> 36;
            case 219 -> 75;
            case 220 -> 26;
            case 221 -> 245;
            case 222 -> 61;
            case 223 -> 50;
            case 224 -> 35;
            case 225 -> 231;
            case 226 -> 29;
            case 227 -> 78;
            case 228 -> 169;
            case 229 -> 104;
            case 230 -> 223;
            case 231 -> 236;
            case 232 -> 163;
            case 233 -> 102;
            case 234 -> 173;
            case 235 -> 118;
            case 236 -> 157;
            case 237 -> 55;
            case 238 -> 112;
            case 239 -> 21;
            case 240 -> 38;
            case 241 -> 250;
            case 242 -> 73;
            case 243 -> 200;
            case 244 -> 175;
            case 245 -> 147;
            case 246 -> 0;
            case 247 -> 232;
            case 248 -> 12;
            case 249 -> 57;
            case 250 -> 24;
            case 251 -> 205;
            case 252 -> 18;
            case 253 -> 41;
            case 254 -> 47;
            default -> 219;
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

   private static void lambda$joinServer$0(net.minecraft.client.multiplayer.resolver.ServerAddress var0, net.minecraft.client.multiplayer.ServerData var1) {
      ConnectScreen.startConnecting(
         new JoinMultiplayerScreen(new TitleScreen()),
         lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         var0,
         var1,
         false,
         (net.minecraft.client.multiplayer.TransferState)null
      );
   }

   private static void lambda$leaveAndJoinHypixel$0(String var0, ChatFormatting var1, long var2) {
      try {
         a(var0, var1);
         Thread.sleep(var2);
         a();
      } catch (Exception var4) {
         System.err.println("Error during reconnect:" + var4.getMessage());
      }
   }

   private static void lambda$leaveServer$0(Component var0) {
      String var1 = c();
      if (var1 != null) {
         ClientPacketListener var2 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.getConnection();
         if (var2 != null) {
            var2.getConnection().disconnect(var0);
         }
      }
   }
}
