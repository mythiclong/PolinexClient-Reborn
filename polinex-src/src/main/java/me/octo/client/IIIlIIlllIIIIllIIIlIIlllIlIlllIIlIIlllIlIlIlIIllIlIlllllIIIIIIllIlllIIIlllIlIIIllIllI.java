package me.octo.client;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.resources.sounds.SimpleSoundInstance;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundSoundPacket;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import org.jetbrains.annotations.NotNull;

public final class IIIlIIlllIIIIllIIIlIIlllIlIlllIIlIIlllIlIlIlIIllIlIlllllIIIIIIllIlllIIIlllIlIIIllIllI
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static IIIlIIlllIIIIllIIIlIIlllIlIlllIIlIIlllIlIlIlIIllIlIlllllIIIIIIllIlllIIIlllIlIIIllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @JvmField
   @NotNull
   public static IIIlIIlllIIIIllIIIlIIlllIlIlllIIlIIlllIlIlIlIIllIlIlllllIIIIIIllIlllIIIlllIlIIIllIllI lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] f;
   private static String[] g;

   private IIIlIIlllIIIIllIIIlIIlllIlIlllIIlIIlllIlIlIlIIllIlIlllllIIIIIIllIlllIIIlllIlIIIllIllI() {
      short var10001 = -15041;
      short var10002 = 2260;
      var10002 = -15049;
      short var10003 = -8917;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      short var10004 = -15052;
      short var10005 = -9150;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         IIIIlllIIlIIIlIIlIllllIllIIIIllIIIlIIIlIIlIllllIIIIIlIIIIIIIIllIlIlIIIllllllIlIIIllII.a(),
         IIIIlllIIlIIIlIIlIllllIllIIIIllIIIlIIIlIIlIllllIIIIIlIIIIIIIIllIlIlIIIllllllIlIIIllII.b(),
         IIIIlllIIlIIIlIIlIllllIllIIIIllIIIlIIIlIIlIllllIIIIIlIIIIIIIIllIlIlIIIllllllIlIIIllII.c()
      };
      super("Etherwarp Chime", "Plays a Custom Sound on Etherwarp.", var3, "Sound", var1);
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      Object var16 = null; // PX-FIX
      int[] var10000 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      short var10002 = -15050;
      short var10003 = -1290;
      Intrinsics.checkNotNullParameter(var1, "event");
      int[] var2 = var10000;
      Packet var11 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      if (var2 == null) {
         if (!(var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI instanceof ClientboundSoundPacket)) {
            return;
         }

         var11 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      Packet var3 = var11;
      String var12 = ((ClientboundSoundPacket)var3).getSound().value().location().toString();
      var10002 = -15055;
      var10003 = 23056;
      Intrinsics.checkNotNullExpressionValue(var12, "toString(...)");
      String var4 = var12;
      float var5 = ((ClientboundSoundPacket)var3).getPitch();
      float var6 = ((ClientboundSoundPacket)var3).getVolume();
      CharSequence var13 = var4;
      short var10001 = -15054;
      var10002 = -27376;
      int var14 = ((StringsKt.contains(var13, "entity.ender_dragon.hurt", false)) ? 1 : 0);
      if (var2 == null) {
         if (var14 == 0) {
            return;
         }

         float var27;
         var14 = (var27 = Math.abs(var5 - 0.53968257F) - 0.001F) == 0.0F ? 0 : (var27 < 0.0F ? -1 : 1);
      }

      if (var2 == null) {
         if (var14 >= 0) {
            return;
         }

         float var28;
         var14 = (var28 = Math.abs(var6 - 1.0F) - 0.001F) == 0.0F ? 0 : (var28 < 0.0F ? -1 : 1);
      }

      if (var14 < 0) {
         if (this.ap().player == null) {
            return;
         }

         label47: {
            label46: {
               label45: {
                  String var10 = ((me.octo.client.PXDyn)(Object)(IIIIlllIIlIIIlIIlIllllIllIIIIllIIIlIIIlIIlIllllIIIIIlIIIIIIIIllIlIlIIIllllllIlIIIllII.a())).y();
                  int var15 = var10.hashCode();
                  if (var2 == null) {
                     switch (var15) {
                        case -2030807190:
                           var10000 = (int[])(Object)var10;
                           if (var2 != null) {
                              break label46;
                           }

                           var10001 = -15051;
                           var10002 = 15740;
                           if (var10.equals("note.pling")) {
                              var10000 = (int[])(Object)(SoundEvents.NOTE_BLOCK_PLING.value());
                              break label46;
                           }
                           break label45;
                        case 114516788:
                           var10001 = -15056;
                           var10002 = 8632;
                           var15 = ((var10.equals("random.orb")) ? 1 : 0);
                           break;
                        case 1053956345:
                           var10001 = -15053;
                           var10002 = -4426;
                           if (var10.equals("mob.blaze.hit")) {
                              var16 = SoundEvents.BLAZE_HURT;
                              break label47;
                           }
                        default:
                           break label45;
                     }
                  }

                  if (var15 != 0) {
                     var16 = SoundEvents.EXPERIENCE_ORB_PICKUP;
                     break label47;
                  }
               }

               var16 = SoundEvents.EXPERIENCE_ORB_PICKUP;
               break label47;
            }

            var16 = (SoundEvent)(Object)var10000;
         }

         SoundEvent var9 =((SoundEvent)( var16));
         Intrinsics.checkNotNull(var9);
         this.ap().execute(null);
         var1.a(true);
      }
   }

   @Override
   public void aB() {
      this.as();
   }

   @Override
   public void aC() {
      this.at();
   }

   private static final void a(IIIlIIlllIIIIllIIIlIIlllIlIlllIIlIIlllIlIlIlIIllIlIlllllIIIIIIllIlllIIIlllIlIIIllIllI var0, SoundEvent var1) {
      var0.ap()
         .getSoundManager()
         .play(
            SimpleSoundInstance.forUI(
               var1,
               ((me.octo.client.PXDyn)(Object)(IIIIlllIIlIIIlIIlIllllIllIIIIllIIIlIIIlIIlIllllIIIIIlIIIIIIIIllIlIlIIIllllllIlIIIllII.c())).n(),
               ((me.octo.client.PXDyn)(Object)(IIIIlllIIlIIIlIIlIllllIllIIIIllIIIlIIIlIIlIllllIIIIIlIIIIIIIIllIlIlIIIllllllIlIIIllII.b())).n()
            )
         );
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[9];
      int var3 = 0;
      String var2 = "$|\by\té\u001e·~\u0010ù\u009bý§\u0093Ô\u008e¸\u000b\u0018¡\nÍT1ì\u0013Aû%\u0095!¹\u0086\u0005Úû@Ç\u0083\n.X¥\u0082VY\u000e²ýÂ\u0005Ø4à\u0004\u0095\rö\u009aË\u0091\u0003\u0005lµ\u0016\u001a\r÷\u0000\u0018¦\u0000Þ¤c\u0019û\u009eIÉ\u0081\u0095\u0016©\u008a\u000f½\u00add©\u0004%$¼\r\u0093`l\u0094ð±\u000f\u009bÙaVß¸";
      int var4 = "$|\by\té\u001e·~\u0010ù\u009bý§\u0093Ô\u008e¸\u000b\u0018¡\nÍT1ì\u0013Aû%\u0095!¹\u0086\u0005Úû@Ç\u0083\n.X¥\u0082VY\u000e²ýÂ\u0005Ø4à\u0004\u0095\rö\u009aË\u0091\u0003\u0005lµ\u0016\u001a\r÷\u0000\u0018¦\u0000Þ¤c\u0019û\u009eIÉ\u0081\u0095\u0016©\u008a\u000f½\u00add©\u0004%$¼\r\u0093`l\u0094ð±\u000f\u009bÙaVß¸"
         .length();
      char var1 = '"';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 95;
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
                     case 0 -> 115;
                     case 1 -> 69;
                     case 2 -> 109;
                     case 3 -> 114;
                     case 4 -> 47;
                     case 5 -> 74;
                     default -> 18;
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
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IIIlIIlllIIIIllIIIlIIlllIlIlllIIlIIlllIlIlIlIIllIlIlllllIIIIIIllIlllIIIlllIlIIIllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new IIIlIIlllIIIIllIIIlIIlllIlIlllIIlIIlllIlIlIlIIllIlIlllllIIIIIIllIlllIIIlllIlIIIllIllI();
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

                  var2 = "M\u0091º\u0083[³r¡\u0092\u0095\u000fÄ\u0017\\å\\Dc\u001b\u0014>'KàÔE";
                  var4 = "M\u0091º\u0083[³r¡\u0092\u0095\u000fÄ\u0017\\å\\Dc\u001b\u0014>'KàÔE".length();
                  var1 = '\n';
                  var8 = -1;
            }

            var10000 = 2;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -15049) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 44;
            case 1 -> 244;
            case 2 -> 16;
            case 3 -> 254;
            case 4 -> 227;
            case 5 -> 93;
            case 6 -> 251;
            case 7 -> 129;
            case 8 -> 211;
            case 9 -> 171;
            case 10 -> 83;
            case 11 -> 232;
            case 12 -> 30;
            case 13 -> 161;
            case 14 -> 125;
            case 15 -> 210;
            case 16 -> 48;
            case 17 -> 149;
            case 18 -> 5;
            case 19 -> 144;
            case 20 -> 42;
            case 21 -> 55;
            case 22 -> 235;
            case 23 -> 137;
            case 24 -> 31;
            case 25 -> 214;
            case 26 -> 58;
            case 27 -> 43;
            case 28 -> 167;
            case 29 -> 174;
            case 30 -> 147;
            case 31 -> 216;
            case 32 -> 188;
            case 33 -> 200;
            case 34 -> 0;
            case 35 -> 222;
            case 36 -> 56;
            case 37 -> 78;
            case 38 -> 172;
            case 39 -> 53;
            case 40 -> 230;
            case 41 -> 8;
            case 42 -> 81;
            case 43 -> 90;
            case 44 -> 68;
            case 45 -> 4;
            case 46 -> 234;
            case 47 -> 107;
            case 48 -> 22;
            case 49 -> 41;
            case 50 -> 139;
            case 51 -> 156;
            case 52 -> 130;
            case 53 -> 182;
            case 54 -> 136;
            case 55 -> 135;
            case 56 -> 205;
            case 57 -> 18;
            case 58 -> 134;
            case 59 -> 157;
            case 60 -> 106;
            case 61 -> 80;
            case 62 -> 249;
            case 63 -> 119;
            case 64 -> 158;
            case 65 -> 87;
            case 66 -> 212;
            case 67 -> 75;
            case 68 -> 108;
            case 69 -> 111;
            case 70 -> 201;
            case 71 -> 186;
            case 72 -> 164;
            case 73 -> 65;
            case 74 -> 38;
            case 75 -> 218;
            case 76 -> 165;
            case 77 -> 203;
            case 78 -> 97;
            case 79 -> 150;
            case 80 -> 37;
            case 81 -> 45;
            case 82 -> 98;
            case 83 -> 204;
            case 84 -> 126;
            case 85 -> 82;
            case 86 -> 118;
            case 87 -> 35;
            case 88 -> 105;
            case 89 -> 29;
            case 90 -> 231;
            case 91 -> 240;
            case 92 -> 197;
            case 93 -> 206;
            case 94 -> 229;
            case 95 -> 11;
            case 96 -> 180;
            case 97 -> 221;
            case 98 -> 185;
            case 99 -> 76;
            case 100 -> 207;
            case 101 -> 39;
            case 102 -> 21;
            case 103 -> 242;
            case 104 -> 61;
            case 105 -> 169;
            case 106 -> 250;
            case 107 -> 122;
            case 108 -> 86;
            case 109 -> 176;
            case 110 -> 233;
            case 111 -> 13;
            case 112 -> 88;
            case 113 -> 217;
            case 114 -> 128;
            case 115 -> 114;
            case 116 -> 66;
            case 117 -> 20;
            case 118 -> 72;
            case 119 -> 7;
            case 120 -> 127;
            case 121 -> 67;
            case 122 -> 59;
            case 123 -> 159;
            case 124 -> 117;
            case 125 -> 153;
            case 126 -> 243;
            case 127 -> 252;
            case 128 -> 154;
            case 129 -> 15;
            case 130 -> 184;
            case 131 -> 248;
            case 132 -> 3;
            case 133 -> 116;
            case 134 -> 96;
            case 135 -> 63;
            case 136 -> 17;
            case 137 -> 187;
            case 138 -> 33;
            case 139 -> 193;
            case 140 -> 2;
            case 141 -> 79;
            case 142 -> 115;
            case 143 -> 47;
            case 144 -> 225;
            case 145 -> 145;
            case 146 -> 100;
            case 147 -> 178;
            case 148 -> 191;
            case 149 -> 84;
            case 150 -> 95;
            case 151 -> 102;
            case 152 -> 194;
            case 153 -> 241;
            case 154 -> 245;
            case 155 -> 219;
            case 156 -> 224;
            case 157 -> 120;
            case 158 -> 94;
            case 159 -> 213;
            case 160 -> 179;
            case 161 -> 236;
            case 162 -> 52;
            case 163 -> 160;
            case 164 -> 27;
            case 165 -> 177;
            case 166 -> 215;
            case 167 -> 70;
            case 168 -> 9;
            case 169 -> 175;
            case 170 -> 223;
            case 171 -> 239;
            case 172 -> 143;
            case 173 -> 152;
            case 174 -> 199;
            case 175 -> 253;
            case 176 -> 142;
            case 177 -> 138;
            case 178 -> 196;
            case 179 -> 113;
            case 180 -> 24;
            case 181 -> 228;
            case 182 -> 168;
            case 183 -> 195;
            case 184 -> 163;
            case 185 -> 1;
            case 186 -> 170;
            case 187 -> 237;
            case 188 -> 246;
            case 189 -> 123;
            case 190 -> 36;
            case 191 -> 69;
            case 192 -> 124;
            case 193 -> 101;
            case 194 -> 89;
            case 195 -> 60;
            case 196 -> 40;
            case 197 -> 162;
            case 198 -> 23;
            case 199 -> 133;
            case 200 -> 57;
            case 201 -> 74;
            case 202 -> 25;
            case 203 -> 183;
            case 204 -> 46;
            case 205 -> 190;
            case 206 -> 77;
            case 207 -> 110;
            case 208 -> 238;
            case 209 -> 189;
            case 210 -> 73;
            case 211 -> 51;
            case 212 -> 112;
            case 213 -> 121;
            case 214 -> 6;
            case 215 -> 198;
            case 216 -> 148;
            case 217 -> 54;
            case 218 -> 255;
            case 219 -> 28;
            case 220 -> 12;
            case 221 -> 181;
            case 222 -> 140;
            case 223 -> 49;
            case 224 -> 131;
            case 225 -> 141;
            case 226 -> 10;
            case 227 -> 192;
            case 228 -> 64;
            case 229 -> 202;
            case 230 -> 92;
            case 231 -> 85;
            case 232 -> 132;
            case 233 -> 173;
            case 234 -> 14;
            case 235 -> 247;
            case 236 -> 62;
            case 237 -> 146;
            case 238 -> 151;
            case 239 -> 26;
            case 240 -> 104;
            case 241 -> 19;
            case 242 -> 166;
            case 243 -> 109;
            case 244 -> 155;
            case 245 -> 71;
            case 246 -> 99;
            case 247 -> 32;
            case 248 -> 208;
            case 249 -> 91;
            case 250 -> 50;
            case 251 -> 220;
            case 252 -> 226;
            case 253 -> 209;
            case 254 -> 103;
            default -> 34;
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
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }
}
