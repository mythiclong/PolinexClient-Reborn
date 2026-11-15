package me.octo.client;

import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public final class llIIIIIIIIIllIlllIIllIIIIIIIIIlIIIIIIlllIIlllllIIlIlllIIIlIllIlIIllllIlIIlIIIlIIlIIll
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static llIIIIIIIIIllIlllIIllIIIIIIIIIlIIIIIIlllIIlllllIIlIlllIIIlIllIlIIllllIlIIlIIIlIIlIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @JvmField
   @NotNull
   public static llIIIIIIIIIllIlllIIllIIIIIIIIIlIIIIIIlllIIlllllIIlIlllIIIlIllIlIIllllIlIIlIIIlIIlIIll lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private static Map<String, llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll> lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static String[] f;
   private static String[] g;

   private llIIIIIIIIIllIlllIIllIIIIIIIIIlIIIIIIlllIIlllllIIlIlllIIIlIllIlIIllllIlIIlIIIlIIlIIll() {
      short var10001 = 17906;
      short var10002 = 30147;
      var10002 = 17905;
      short var10003 = -21622;
      short var10004 = 17919;
      short var10005 = 11657;
      super(
         "Frozen Corpse ESP",
         "Highlights corpses.",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
         "Mineshafts"
      );
   }

   @SubscribeEvent(
      priority = EventPriority.HIGH
   )
   public final void a(@NotNull me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var1) {
      int[] var10000 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      short var10002 = 17908;
      short var10003 = 1428;
      Intrinsics.checkNotNullParameter(var1, "event");
      int[] var2 = var10000;
      if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
         == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl
         )
       {
         ClientLevel var8 = this.ap().level;
         if (var8 != null) {
            ClientLevel var3 = var8;

            for (Object var13 : var3.entitiesForRendering()) {
               var10002 = 17907;
               var10003 = -9056;
               Intrinsics.checkNotNullExpressionValue(var13, "next(...)");
               Entity var5 = (Entity)var13;
               boolean var10 = var5 instanceof ArmorStand;
               if (var2 != null) {
                  if (!var10) {
                     continue;
                  }

                  var10 = ((ArmorStand)var5).isInvisible();
               }

               if (var2 != null) {
                  if (var10) {
                     continue;
                  }

                  var10 = ((ArmorStand)var5).showBasePlate();
               }

               Entity var11;
               label67: {
                  if (var2 != null) {
                     if (var10) {
                        continue;
                     }

                     var11 = var5;
                     if (var2 == null) {
                        break label67;
                     }

                     var10 = var5.hasCustomName();
                  }

                  if (var10) {
                     continue;
                  }

                  var11 = var5;
               }

               ItemStack var12 = ((ArmorStand)var11).getItemBySlot(EquipmentSlot.HEAD);
               var10002 = 17918;
               var10003 = -362;
               Intrinsics.checkNotNullExpressionValue(var12, "getItemBySlot(...)");
               ItemStack var6 = var12;
               Object var15 = var6;
               if (var2 != null) {
                  if (var6.isEmpty()) {
                     continue;
                  }

                  var15 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(
                     me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .b(var6)
                  );
               }

               llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var14 = (llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll)var15;
               if ((llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll)var15 != null) {
                  llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var7 = var14;
                  IIIIIlIlIIlIIllllllIlllllIlIlIIIIIIIIlIlllllIlIIlIlIIlIIIIIIIlllIIIlllIIIlllllIlIIlII.a(
                     var5, var7, 2.0F, null, 0.0F, 0.0F, false, null, 0.0F, 0.0F, false, true);
                  if (var2 == null) {
                     break;
                  }
               }
            }
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
      String[] var5 = new String[10];
      int var3 = 0;
      String var2 = "x~Å\u0099\u0097ªÛ\u0014ó\u008a¾\u008e!q\u008e\"\u000e\u0082\f  öÃ l\u0015Û\u0003\u0084\u0096\u0006\u0005Ê\u0080ª°Î\u000f\fÝ\fãu4R\f¡Z³`pÝ\u0019\u0011=s\u0019^â6ä\u0081{6ë¯À\u00993è\u0084\t£DðCg\u001a¾!¹\u000fýÙpõüã²KHù\u008e\u0014×Sí\u0013\u0081iIwèDÊ\u0003\n)í}P\u0083_\u0093¯j4";
      int var4 = "x~Å\u0099\u0097ªÛ\u0014ó\u008a¾\u008e!q\u008e\"\u000e\u0082\f  öÃ l\u0015Û\u0003\u0084\u0096\u0006\u0005Ê\u0080ª°Î\u000f\fÝ\fãu4R\f¡Z³`pÝ\u0019\u0011=s\u0019^â6ä\u0081{6ë¯À\u00993è\u0084\t£DðCg\u001a¾!¹\u000fýÙpõüã²KHù\u008e\u0014×Sí\u0013\u0081iIwèDÊ\u0003\n)í}P\u0083_\u0093¯j4"
         .length();
      char var1 = 18;
      int var9 = -1;

      label52:
while (true) {
         byte var10000 = 9;
         String var10001 = var2.substring(++var9, var9 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var29 = var10001.toCharArray();
               int var10004 = var29.length;
               int var6 = 0;
               byte var32 = var10000;
               var21 = var29;
               int var15 = var10004;
               byte var41;
               char[] var45;
               int var10006;
               if (var10004 <= 1) {
                  var45 = var29;
                  var41 = var10000;
                  var10006 = var6;
               } else {
                  var32 = var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var45 = var29;
                  var41 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var45[var10006] = (char)(var45[var10006] ^ var41 ^ switch (var6 % 7) {
                     case 0 -> 34;
                     case 1 -> 10;
                     case 2 -> 51;
                     case 3 -> 31;
                     case 4 -> 104;
                     case 5 -> 109;
                     default -> 116;
                  });
                  var6++;
                  if (var32 == 0) {
                     var10006 = var32;
                     var45 = var21;
                     var41 = var32;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var45 = var21;
                     var41 = var32;
                     var10006 = var6;
                  }
               }
            }

            String var34 = new String(var21).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var34;
                  if ((var9 += var1) >= var4) {
                     f = var5;
                     g = new String[10];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new llIIIIIIIIIllIlllIIllIIIIIIIIIlIIIIIIlllIIlllllIIlIlllIIIlIllIlIIllllIlIIlIIIlIIlIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new llIIIIIIIIIllIlllIIllIIIIIIIIIlIIIIIIlllIIlllllIIlIlllIIIlIllIlIIllllIlIIlIIIlIIlIIll();
                     Pair[] var7 = new Pair[4];
                     var10002 = 17910;
                     short var35 = -25473;
                     var7[0] = TuplesKt.to(
                        "LAPIS_ARMOR_HELMET", new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(-11184641)
                     );
                     var10002 = 17904;
                     short var36 = -4383;
                     var7[1] = TuplesKt.to(
                        "TUNGSTEN_HELMET", new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(-5592406)
                     );
                     var10002 = 17911;
                     short var37 = -13124;
                     var7[2] = TuplesKt.to("UMBER_HELMET", new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(-22016));
                     var10002 = 17909;
                     short var38 = 23084;
                     var7[3] = TuplesKt.to("VANGUARD_HELMET", new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(-1));
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = MapsKt.mapOf(var7);
                     break label52;
                  }

                  var1 = var2.charAt(var9);
                  break;
               default:
                  var5[var3++] = var34;
                  if ((var9 += var1) < var4) {
                     var1 = var2.charAt(var9);
                     continue label52;
                  }

                  var2 = "\u0007ÅßÑÌ\u0006Às\u0092÷\u0081\u0011\u009cF\u007føê4\n,\u008cÏY\u0090³ M\u001e°";
                  var4 = "\u0007ÅßÑÌ\u0006Às\u0092÷\u0081\u0011\u009cF\u007føê4\n,\u008cÏY\u0090³ M\u001e°".length();
                  var1 = 18;
                  var9 = -1;
            }

            var10000 = 21;
            var10001 = var2.substring(++var9, var9 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 17910) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 2;
            case 1 -> 23;
            case 2 -> 71;
            case 3 -> 229;
            case 4 -> 156;
            case 5 -> 238;
            case 6 -> 171;
            case 7 -> 250;
            case 8 -> 28;
            case 9 -> 226;
            case 10 -> 189;
            case 11 -> 111;
            case 12 -> 181;
            case 13 -> 163;
            case 14 -> 15;
            case 15 -> 158;
            case 16 -> 221;
            case 17 -> 200;
            case 18 -> 76;
            case 19 -> 107;
            case 20 -> 29;
            case 21 -> 66;
            case 22 -> 115;
            case 23 -> 82;
            case 24 -> 214;
            case 25 -> 185;
            case 26 -> 1;
            case 27 -> 51;
            case 28 -> 166;
            case 29 -> 164;
            case 30 -> 35;
            case 31 -> 114;
            case 32 -> 110;
            case 33 -> 40;
            case 34 -> 165;
            case 35 -> 140;
            case 36 -> 203;
            case 37 -> 57;
            case 38 -> 121;
            case 39 -> 187;
            case 40 -> 179;
            case 41 -> 160;
            case 42 -> 4;
            case 43 -> 48;
            case 44 -> 234;
            case 45 -> 136;
            case 46 -> 128;
            case 47 -> 78;
            case 48 -> 63;
            case 49 -> 94;
            case 50 -> 252;
            case 51 -> 162;
            case 52 -> 125;
            case 53 -> 169;
            case 54 -> 149;
            case 55 -> 249;
            case 56 -> 231;
            case 57 -> 148;
            case 58 -> 180;
            case 59 -> 72;
            case 60 -> 90;
            case 61 -> 239;
            case 62 -> 253;
            case 63 -> 22;
            case 64 -> 150;
            case 65 -> 184;
            case 66 -> 243;
            case 67 -> 43;
            case 68 -> 104;
            case 69 -> 247;
            case 70 -> 153;
            case 71 -> 142;
            case 72 -> 41;
            case 73 -> 206;
            case 74 -> 255;
            case 75 -> 129;
            case 76 -> 11;
            case 77 -> 237;
            case 78 -> 224;
            case 79 -> 198;
            case 80 -> 132;
            case 81 -> 47;
            case 82 -> 194;
            case 83 -> 96;
            case 84 -> 192;
            case 85 -> 208;
            case 86 -> 242;
            case 87 -> 154;
            case 88 -> 80;
            case 89 -> 56;
            case 90 -> 64;
            case 91 -> 210;
            case 92 -> 139;
            case 93 -> 74;
            case 94 -> 70;
            case 95 -> 141;
            case 96 -> 100;
            case 97 -> 46;
            case 98 -> 92;
            case 99 -> 134;
            case 100 -> 88;
            case 101 -> 146;
            case 102 -> 174;
            case 103 -> 183;
            case 104 -> 32;
            case 105 -> 97;
            case 106 -> 103;
            case 107 -> 12;
            case 108 -> 113;
            case 109 -> 9;
            case 110 -> 109;
            case 111 -> 144;
            case 112 -> 173;
            case 113 -> 245;
            case 114 -> 25;
            case 115 -> 99;
            case 116 -> 24;
            case 117 -> 172;
            case 118 -> 81;
            case 119 -> 112;
            case 120 -> 5;
            case 121 -> 230;
            case 122 -> 33;
            case 123 -> 55;
            case 124 -> 67;
            case 125 -> 197;
            case 126 -> 204;
            case 127 -> 182;
            case 128 -> 45;
            case 129 -> 232;
            case 130 -> 68;
            case 131 -> 8;
            case 132 -> 240;
            case 133 -> 155;
            case 134 -> 213;
            case 135 -> 228;
            case 136 -> 186;
            case 137 -> 119;
            case 138 -> 191;
            case 139 -> 222;
            case 140 -> 27;
            case 141 -> 254;
            case 142 -> 60;
            case 143 -> 117;
            case 144 -> 89;
            case 145 -> 73;
            case 146 -> 246;
            case 147 -> 126;
            case 148 -> 10;
            case 149 -> 77;
            case 150 -> 31;
            case 151 -> 201;
            case 152 -> 69;
            case 153 -> 131;
            case 154 -> 138;
            case 155 -> 123;
            case 156 -> 195;
            case 157 -> 54;
            case 158 -> 130;
            case 159 -> 220;
            case 160 -> 167;
            case 161 -> 157;
            case 162 -> 161;
            case 163 -> 120;
            case 164 -> 133;
            case 165 -> 18;
            case 166 -> 227;
            case 167 -> 248;
            case 168 -> 233;
            case 169 -> 106;
            case 170 -> 168;
            case 171 -> 75;
            case 172 -> 199;
            case 173 -> 53;
            case 174 -> 223;
            case 175 -> 215;
            case 176 -> 251;
            case 177 -> 225;
            case 178 -> 83;
            case 179 -> 236;
            case 180 -> 84;
            case 181 -> 39;
            case 182 -> 13;
            case 183 -> 44;
            case 184 -> 36;
            case 185 -> 0;
            case 186 -> 42;
            case 187 -> 176;
            case 188 -> 127;
            case 189 -> 177;
            case 190 -> 14;
            case 191 -> 209;
            case 192 -> 101;
            case 193 -> 49;
            case 194 -> 143;
            case 195 -> 91;
            case 196 -> 116;
            case 197 -> 102;
            case 198 -> 151;
            case 199 -> 218;
            case 200 -> 241;
            case 201 -> 219;
            case 202 -> 7;
            case 203 -> 202;
            case 204 -> 26;
            case 205 -> 86;
            case 206 -> 124;
            case 207 -> 211;
            case 208 -> 93;
            case 209 -> 20;
            case 210 -> 105;
            case 211 -> 98;
            case 212 -> 190;
            case 213 -> 188;
            case 214 -> 95;
            case 215 -> 175;
            case 216 -> 170;
            case 217 -> 108;
            case 218 -> 212;
            case 219 -> 145;
            case 220 -> 87;
            case 221 -> 52;
            case 222 -> 118;
            case 223 -> 159;
            case 224 -> 137;
            case 225 -> 16;
            case 226 -> 61;
            case 227 -> 205;
            case 228 -> 59;
            case 229 -> 30;
            case 230 -> 178;
            case 231 -> 3;
            case 232 -> 19;
            case 233 -> 193;
            case 234 -> 17;
            case 235 -> 244;
            case 236 -> 217;
            case 237 -> 65;
            case 238 -> 6;
            case 239 -> 50;
            case 240 -> 152;
            case 241 -> 216;
            case 242 -> 38;
            case 243 -> 62;
            case 244 -> 135;
            case 245 -> 235;
            case 246 -> 122;
            case 247 -> 85;
            case 248 -> 58;
            case 249 -> 196;
            case 250 -> 207;
            case 251 -> 34;
            case 252 -> 21;
            case 253 -> 37;
            case 254 -> 147;
            default -> 79;
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
      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(DefaultConstructorMarker var1) {
         this();
      }
   }
}
