package me.octo.client;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import me.octo.client.events.impl.lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII
   extends llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII {
   private final List<LivingEntity> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new ArrayList<>();
   private static String[] a;
   private static String[] d;

   public llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII(String var1) {
      super(var1);
   }

   @SubscribeEvent
   public void a(lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI var1) {
      int[] var2 = lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl.k();
      if (!var1.c()) {
         Minecraft var10000 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if (var2 != null) {
            if (me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .player
               == null) {
               return;
            }

            var10000 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         if (var10000.level != null) {
            this.h();
            llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII var3 = this;
            if (var2 != null) {
               if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.isEmpty()) {
                  return;
               }

               var3 = this;
            }

            short var10001 = -4679;
            short var10002 = 13723;
            var3.a("DETECTED PLAYER CLONE");
         }
      }
   }

   private void h() {
      int[] var10000 = lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl.k();
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clear();
      int[] var1 = var10000;
      Iterator var2 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .level
         .entitiesForRendering()
         .iterator();

      while (true) {
         if (var2.hasNext()) {
            Entity var3 = (Entity)var2.next();
            if (var1 == null) {
               break;
            }

            label87: {
               Entity var10 = var3;
               if (var1 != null) {
                  if (!(var3 instanceof LivingEntity)) {
                     break label87;
                  }

                  var10 = var3;
               }

               LivingEntity var4 = (LivingEntity)var10;
               Entity var11 = var3;
               if (var1 != null) {
                  if (!(var3 instanceof Player)) {
                     continue;
                  }

                  var11 = var3;
               }

               Player var5 = (Player)var11;
               Object var12 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .player;
               if (var1 != null) {
                  if (me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        .player
                     == var5) {
                     continue;
                  }

                  var12 = var3;
               }

               boolean var13 = ((me.octo.client.PXDyn)var12).isAlive();
               if (var1 != null) {
                  if (!var13) {
                     continue;
                  }

                  var13 = var3.isInvisible();
               }

               if (var13) {
                  continue;
               }

               double var6 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .player
                  .distanceTo(var5);
               if (var6 > 8.0) {
                  continue;
               }

               String var8 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .player
                  .getName()
                  .getString();
               String var9 = var5.getName().getString();
               int var14 = var5.getId();
               if (var1 != null) {
                  if (var14 == -1) {
                     return;
                  }

                  var14 = ((var9.contains(var8)) ? 1 : 0);
               }

               if (var1 != null) {
                  if (var14 == 0) {
                     break label87;
                  }

                  var14 = ((me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     .player
                     .hasLineOfSight(var5)) ? 1 : 0);
               }

               label69: {
                  if (var1 != null) {
                     if (var14 == 0) {
                        break label69;
                     }

                     this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.add(var4);
                  }

                  if (var1 != null) {
                     break label87;
                  }
               }

               short var15 = -4680;
               short var10001 = -4413;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.f(
                  "DETECTED A PLAYER CLONE OF YOU WHICH YOU CAN'T SEE. §cDO NOT REACT OR YOU WILL GET BANNED!"
               );
            }

            if (var1 != null) {
               continue;
            }
         }

         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            .sort(
               Comparator.comparingDouble(
                  me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     .player::distanceTo
               )
            );
         break;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "Ûò'\u0090ø´HÉ\u0094pð¶iôtâj÷\u0097\u0089¯\u007fF\u008c\fr\u0018 \u00adc÷¢\u0013¿Y\u001ap\u009f\u0003Uù/\u009fÐy¯MgñU\u00ad£\u009f²û/V]e\u001e«P-\u0096[+\u0006u©\u0011±\u0019ÕÃ\u0093\nº¨âS[\u0010¹§\u0097à\u0011¸`Ä\u0015ïq¡à(ºR\b×Yô±\u001d#FùW1\u000f²;";
      int var4 = "Ûò'\u0090ø´HÉ\u0094pð¶iôtâj÷\u0097\u0089¯\u007fF\u008c\fr\u0018 \u00adc÷¢\u0013¿Y\u001ap\u009f\u0003Uù/\u009fÐy¯MgñU\u00ad£\u009f²û/V]e\u001e«P-\u0096[+\u0006u©\u0011±\u0019ÕÃ\u0093\nº¨âS[\u0010¹§\u0097à\u0011¸`Ä\u0015ïq¡à(ºR\b×Yô±\u001d#FùW1\u000f²;"
         .length();
      char var1 = 'Z';
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 74;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 74;
               var10006 = var6;
            } else {
               var13 = 74;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 74;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 76;
                  case 1 -> 57;
                  case 2 -> 78;
                  case 3 -> 66;
                  case 4 -> 75;
                  case 5 -> 84;
                  default -> 83;
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
            d = new String[2];
            break pxClinit; // PX-FIX
         }

         var1 = var2.charAt(var0);
      }
   } // PX-FIX end pxClinit
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ -4680) & 65535;
      if (d[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 60;
            case 1 -> 119;
            case 2 -> 32;
            case 3 -> 120;
            case 4 -> 166;
            case 5 -> 230;
            case 6 -> 131;
            case 7 -> 70;
            case 8 -> 129;
            case 9 -> 115;
            case 10 -> 139;
            case 11 -> 59;
            case 12 -> 136;
            case 13 -> 64;
            case 14 -> 208;
            case 15 -> 133;
            case 16 -> 196;
            case 17 -> 210;
            case 18 -> 223;
            case 19 -> 110;
            case 20 -> 100;
            case 21 -> 66;
            case 22 -> 33;
            case 23 -> 215;
            case 24 -> 172;
            case 25 -> 188;
            case 26 -> 5;
            case 27 -> 106;
            case 28 -> 71;
            case 29 -> 36;
            case 30 -> 194;
            case 31 -> 94;
            case 32 -> 184;
            case 33 -> 117;
            case 34 -> 200;
            case 35 -> 24;
            case 36 -> 101;
            case 37 -> 102;
            case 38 -> 252;
            case 39 -> 112;
            case 40 -> 205;
            case 41 -> 18;
            case 42 -> 235;
            case 43 -> 62;
            case 44 -> 204;
            case 45 -> 125;
            case 46 -> 224;
            case 47 -> 31;
            case 48 -> 67;
            case 49 -> 96;
            case 50 -> 128;
            case 51 -> 169;
            case 52 -> 244;
            case 53 -> 162;
            case 54 -> 50;
            case 55 -> 176;
            case 56 -> 7;
            case 57 -> 222;
            case 58 -> 151;
            case 59 -> 146;
            case 60 -> 193;
            case 61 -> 251;
            case 62 -> 155;
            case 63 -> 140;
            case 64 -> 80;
            case 65 -> 23;
            case 66 -> 159;
            case 67 -> 243;
            case 68 -> 219;
            case 69 -> 242;
            case 70 -> 22;
            case 71 -> 107;
            case 72 -> 65;
            case 73 -> 8;
            case 74 -> 105;
            case 75 -> 207;
            case 76 -> 191;
            case 77 -> 180;
            case 78 -> 121;
            case 79 -> 10;
            case 80 -> 225;
            case 81 -> 83;
            case 82 -> 173;
            case 83 -> 179;
            case 84 -> 48;
            case 85 -> 122;
            case 86 -> 30;
            case 87 -> 135;
            case 88 -> 85;
            case 89 -> 171;
            case 90 -> 88;
            case 91 -> 164;
            case 92 -> 95;
            case 93 -> 77;
            case 94 -> 253;
            case 95 -> 53;
            case 96 -> 63;
            case 97 -> 3;
            case 98 -> 241;
            case 99 -> 229;
            case 100 -> 178;
            case 101 -> 114;
            case 102 -> 203;
            case 103 -> 144;
            case 104 -> 46;
            case 105 -> 16;
            case 106 -> 250;
            case 107 -> 17;
            case 108 -> 168;
            case 109 -> 21;
            case 110 -> 167;
            case 111 -> 15;
            case 112 -> 249;
            case 113 -> 75;
            case 114 -> 211;
            case 115 -> 236;
            case 116 -> 237;
            case 117 -> 154;
            case 118 -> 195;
            case 119 -> 69;
            case 120 -> 213;
            case 121 -> 227;
            case 122 -> 185;
            case 123 -> 187;
            case 124 -> 38;
            case 125 -> 78;
            case 126 -> 152;
            case 127 -> 197;
            case 128 -> 27;
            case 129 -> 228;
            case 130 -> 137;
            case 131 -> 34;
            case 132 -> 246;
            case 133 -> 157;
            case 134 -> 174;
            case 135 -> 220;
            case 136 -> 149;
            case 137 -> 99;
            case 138 -> 87;
            case 139 -> 143;
            case 140 -> 239;
            case 141 -> 226;
            case 142 -> 234;
            case 143 -> 58;
            case 144 -> 51;
            case 145 -> 103;
            case 146 -> 54;
            case 147 -> 82;
            case 148 -> 145;
            case 149 -> 181;
            case 150 -> 73;
            case 151 -> 212;
            case 152 -> 127;
            case 153 -> 47;
            case 154 -> 247;
            case 155 -> 35;
            case 156 -> 153;
            case 157 -> 92;
            case 158 -> 147;
            case 159 -> 202;
            case 160 -> 199;
            case 161 -> 76;
            case 162 -> 19;
            case 163 -> 2;
            case 164 -> 86;
            case 165 -> 55;
            case 166 -> 190;
            case 167 -> 170;
            case 168 -> 49;
            case 169 -> 206;
            case 170 -> 12;
            case 171 -> 218;
            case 172 -> 113;
            case 173 -> 255;
            case 174 -> 248;
            case 175 -> 97;
            case 176 -> 123;
            case 177 -> 158;
            case 178 -> 232;
            case 179 -> 111;
            case 180 -> 11;
            case 181 -> 93;
            case 182 -> 109;
            case 183 -> 245;
            case 184 -> 1;
            case 185 -> 0;
            case 186 -> 163;
            case 187 -> 216;
            case 188 -> 126;
            case 189 -> 214;
            case 190 -> 231;
            case 191 -> 156;
            case 192 -> 44;
            case 193 -> 189;
            case 194 -> 98;
            case 195 -> 9;
            case 196 -> 192;
            case 197 -> 39;
            case 198 -> 240;
            case 199 -> 84;
            case 200 -> 118;
            case 201 -> 134;
            case 202 -> 25;
            case 203 -> 116;
            case 204 -> 72;
            case 205 -> 108;
            case 206 -> 141;
            case 207 -> 81;
            case 208 -> 4;
            case 209 -> 28;
            case 210 -> 68;
            case 211 -> 221;
            case 212 -> 165;
            case 213 -> 177;
            case 214 -> 37;
            case 215 -> 61;
            case 216 -> 89;
            case 217 -> 148;
            case 218 -> 45;
            case 219 -> 182;
            case 220 -> 40;
            case 221 -> 42;
            case 222 -> 74;
            case 223 -> 130;
            case 224 -> 79;
            case 225 -> 132;
            case 226 -> 209;
            case 227 -> 13;
            case 228 -> 90;
            case 229 -> 183;
            case 230 -> 254;
            case 231 -> 52;
            case 232 -> 198;
            case 233 -> 238;
            case 234 -> 29;
            case 235 -> 201;
            case 236 -> 233;
            case 237 -> 20;
            case 238 -> 6;
            case 239 -> 26;
            case 240 -> 104;
            case 241 -> 217;
            case 242 -> 43;
            case 243 -> 57;
            case 244 -> 175;
            case 245 -> 150;
            case 246 -> 142;
            case 247 -> 14;
            case 248 -> 138;
            case 249 -> 186;
            case 250 -> 56;
            case 251 -> 41;
            case 252 -> 91;
            case 253 -> 161;
            case 254 -> 124;
            default -> 160;
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
}
