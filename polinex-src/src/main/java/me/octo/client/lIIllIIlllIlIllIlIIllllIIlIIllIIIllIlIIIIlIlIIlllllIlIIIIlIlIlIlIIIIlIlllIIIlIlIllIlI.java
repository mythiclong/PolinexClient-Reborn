package me.octo.client;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.phys.AABB;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIllIIlllIlIllIlIIllllIIlIIllIIIllIlIIIIlIlIIlllllIlIIIIlIlIlIlIIIIlIlllIIIlIlIllIlI
   extends lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI {
   private static String[] c;
   private static String[] d;

   public lIIllIIlllIlIllIlIIllllIIlIIllIIIllIlIIIIlIlIIlllllIlIIIIlIlIlIlIIIIlIlllIIIlIlIllIlI() {
      int[] var1 = llIIIIlIIIIIIlllIIlIIIIIIlIIIlIIllIlllIlIIIlllIlIIIllIlIIIllIlIlIIlIIlIIIlIlIIllllIll.s();
      List var10003 = CollectionsKt.listOf(new AABB(-619.0, 6.0, -372.0, -527.0, 53.0, -287.0));
      List var10004 = CollectionsKt.listOf(new AABB(-571.0, 4.0, -329.0, -518.0, 20.0, -288.0));
      me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid var10005 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      List var10006 = CollectionsKt.listOf(EnderMan.class);
      short var10007 = 21708;
      short var10008 = -28577;
      List var3 = CollectionsKt.listOf("Enderman");
      String[] var2 = new String[4];
      short var10010 = 21711;
      short var10011 = -32013;
      var2[0] = "Voidling Devotee";
      var10010 = 21706;
      var10011 = -8108;
      var2[1] = "Voidling Radical";
      var10010 = 21698;
      var10011 = -6105;
      var2[2] = "Voidcrazed Maniac";
      var10010 = 21704;
      var10011 = 7765;
      var2[3] = "Voidling Extremist";
      List var4 = CollectionsKt.listOf(var2);
      List var10009 = CollectionsKt.emptyList();
      var10010 = 21709;
      var10011 = -26822;
      super(
         new IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII(
            var10003, var10004, var10005, var10006, var3, var4, var10009, CollectionsKt.listOf("Katana"), false, false, 768, null
         )
      );
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         llIIIIlIIIIIIlllIIlIIIIIIlIIIlIIllIlllIlIIIlllIlIIIllIlIIIllIlIlIIlIIlIIIlIlIIllllIll.a(new int[5]);
      }
   }

   @Override
   public boolean a(@NotNull Entity var1, @Nullable ArmorStand var2) {
      boolean var14 = false; // PX-FIX
      Object var13 = null; // PX-FIX
      int[] var3;
      String var12;
      label69: {
         int[] var10000 = llIIIIlIIIIIIlllIIlIIIIIIlIIIlIIllIlllIlIIIlllIlIIIllIlIIIllIlIlIIlIIlIIIlIlIIllllIll.s();
         short var10002 = 21707;
         short var10003 = 9955;
         Intrinsics.checkNotNullParameter(var1, "entity");
         var3 = var10000;
         if (var3 != null && var2 != null) {
            Component var11 = var2.getName();
            label63:
            if (var11 != null) {
               var12 = var11.getString();
               if (var3 != null) {
                  if (var12 == null) {
                     break label63;
                  }

                  var12 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a(var12);
               }

               if (var3 != null) {
                  break label69;
               }
            }
         }

         var12 = null;
      }

      String var4 = var12;
      if (var4 != null) {
         label73: {
            var var5 = this.a().f();
            boolean var6 = false;
            var13 = var5;
            label50:
            if (var3 != null) {
               if (var5 instanceof Collection) {
                  var13 = (Collection)var5;
                  if (var3 == null) {
                     break label50;
                  }

                  if (((me.octo.client.PXDyn)var13).isEmpty()) {
                     var14 = false;
                     break label73;
                  }
               }

               var13 = var5;
            }

            Iterator var7 = ((me.octo.client.PXDyn)var13).iterator();

            label43:
            while (true) {
               if (!var7.hasNext()) {
                  var14 = false;
                  break;
               }

               Object var8 = var7.next();
               String var9 = (String)var8;
               boolean var10 = false;
               var14 = StringsKt.contains(var4, var9, true);

               while (var14) {
                  var14 = true;
                  if (var3 != null) {
                     break label43;
                  }
               }
            }
         }

         if (var14) {
            return true;
         }
      }

      return false;
   }

   @Override
   public double a(
      @NotNull lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1,
      @NotNull LocalPlayer var2
   ) {
      int[] var10000 = llIIIIlIIIIIIlllIIlIIIIIIlIIIlIIllIlllIlIIIlllIlIIIllIlIIIllIlIlIIlIIlIIIlIlIIllllIll.s();
      short var10002 = 21710;
      short var10003 = -28943;
      Intrinsics.checkNotNullParameter(var1, "mob");
      var10002 = 21705;
      var10003 = -2743;
      Intrinsics.checkNotNullParameter(var2, "player");
      LivingEntity var4 = var1.a();
      int[] var3 = var10000;
      double var5 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var4), false);
      double var10001 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .d(me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var4))
         * 0.1;
      if (var3 != null) {
         var5 += var10001;
         var10001 = !var2.hasLineOfSight(var4) ? 10.0 : 0.0;
      }

      return var5 + var10001 + Math.abs(var2.getY() - var4.getY());
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[9];
      int var3 = 0;
      String var2 = "\u0099\u000b²e<><LS$Íº\u008eè\\)\u0006ò\u0005\u0097\u0088>?\u0012\u00078a\u0003FòsÕº\u0000éÛ+Ð\u009cíTo\u0006§P\u009fp\u00999\u00030èÐ\u0010'\u0092eVÆXc\u0080¸«´\u008d#I+á\b1jÛi£\u009a\u001dU";
      int var4 = "\u0099\u000b²e<><LS$Íº\u008eè\\)\u0006ò\u0005\u0097\u0088>?\u0012\u00078a\u0003FòsÕº\u0000éÛ+Ð\u009cíTo\u0006§P\u009fp\u00999\u00030èÐ\u0010'\u0092eVÆXc\u0080¸«´\u008d#I+á\b1jÛi£\u009a\u001dU"
         .length();
      char var1 = 16;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 88;
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
                     case 1 -> 12;
                     case 2 -> 65;
                     case 3 -> 48;
                     case 4 -> 57;
                     case 5 -> 70;
                     default -> 64;
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
                     c = var5;
                     d = new String[9];
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

                  var2 = "Lú^dèF\u0011?ú\u0093®â©ó.ô\u0015`°¯]\u008cË7";
                  var4 = "Lú^dèF\u0011?ú\u0093®â©ó.ô\u0015`°¯]\u008cË7".length();
                  var1 = 6;
                  var8 = -1;
            }

            var10000 = 79;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 21706) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 32;
            case 1 -> 21;
            case 2 -> 216;
            case 3 -> 108;
            case 4 -> 218;
            case 5 -> 16;
            case 6 -> 84;
            case 7 -> 57;
            case 8 -> 233;
            case 9 -> 144;
            case 10 -> 237;
            case 11 -> 232;
            case 12 -> 174;
            case 13 -> 12;
            case 14 -> 251;
            case 15 -> 71;
            case 16 -> 178;
            case 17 -> 14;
            case 18 -> 156;
            case 19 -> 82;
            case 20 -> 153;
            case 21 -> 76;
            case 22 -> 33;
            case 23 -> 28;
            case 24 -> 163;
            case 25 -> 133;
            case 26 -> 63;
            case 27 -> 126;
            case 28 -> 85;
            case 29 -> 239;
            case 30 -> 69;
            case 31 -> 51;
            case 32 -> 73;
            case 33 -> 159;
            case 34 -> 137;
            case 35 -> 183;
            case 36 -> 180;
            case 37 -> 240;
            case 38 -> 193;
            case 39 -> 255;
            case 40 -> 181;
            case 41 -> 115;
            case 42 -> 171;
            case 43 -> 45;
            case 44 -> 23;
            case 45 -> 65;
            case 46 -> 172;
            case 47 -> 194;
            case 48 -> 191;
            case 49 -> 134;
            case 50 -> 244;
            case 51 -> 60;
            case 52 -> 81;
            case 53 -> 203;
            case 54 -> 80;
            case 55 -> 211;
            case 56 -> 55;
            case 57 -> 111;
            case 58 -> 77;
            case 59 -> 169;
            case 60 -> 4;
            case 61 -> 230;
            case 62 -> 250;
            case 63 -> 36;
            case 64 -> 222;
            case 65 -> 168;
            case 66 -> 131;
            case 67 -> 18;
            case 68 -> 207;
            case 69 -> 154;
            case 70 -> 189;
            case 71 -> 130;
            case 72 -> 48;
            case 73 -> 195;
            case 74 -> 61;
            case 75 -> 185;
            case 76 -> 217;
            case 77 -> 117;
            case 78 -> 158;
            case 79 -> 129;
            case 80 -> 208;
            case 81 -> 34;
            case 82 -> 162;
            case 83 -> 100;
            case 84 -> 50;
            case 85 -> 197;
            case 86 -> 101;
            case 87 -> 40;
            case 88 -> 201;
            case 89 -> 20;
            case 90 -> 64;
            case 91 -> 187;
            case 92 -> 136;
            case 93 -> 104;
            case 94 -> 173;
            case 95 -> 223;
            case 96 -> 212;
            case 97 -> 234;
            case 98 -> 179;
            case 99 -> 13;
            case 100 -> 79;
            case 101 -> 161;
            case 102 -> 205;
            case 103 -> 59;
            case 104 -> 37;
            case 105 -> 7;
            case 106 -> 164;
            case 107 -> 167;
            case 108 -> 27;
            case 109 -> 182;
            case 110 -> 112;
            case 111 -> 52;
            case 112 -> 132;
            case 113 -> 98;
            case 114 -> 249;
            case 115 -> 54;
            case 116 -> 151;
            case 117 -> 224;
            case 118 -> 188;
            case 119 -> 62;
            case 120 -> 43;
            case 121 -> 106;
            case 122 -> 125;
            case 123 -> 72;
            case 124 -> 107;
            case 125 -> 157;
            case 126 -> 145;
            case 127 -> 210;
            case 128 -> 228;
            case 129 -> 17;
            case 130 -> 221;
            case 131 -> 127;
            case 132 -> 246;
            case 133 -> 116;
            case 134 -> 119;
            case 135 -> 220;
            case 136 -> 102;
            case 137 -> 89;
            case 138 -> 146;
            case 139 -> 150;
            case 140 -> 245;
            case 141 -> 105;
            case 142 -> 160;
            case 143 -> 10;
            case 144 -> 143;
            case 145 -> 8;
            case 146 -> 248;
            case 147 -> 58;
            case 148 -> 198;
            case 149 -> 2;
            case 150 -> 99;
            case 151 -> 252;
            case 152 -> 177;
            case 153 -> 231;
            case 154 -> 135;
            case 155 -> 26;
            case 156 -> 66;
            case 157 -> 142;
            case 158 -> 103;
            case 159 -> 109;
            case 160 -> 241;
            case 161 -> 190;
            case 162 -> 15;
            case 163 -> 152;
            case 164 -> 148;
            case 165 -> 94;
            case 166 -> 91;
            case 167 -> 206;
            case 168 -> 238;
            case 169 -> 196;
            case 170 -> 139;
            case 171 -> 229;
            case 172 -> 41;
            case 173 -> 155;
            case 174 -> 186;
            case 175 -> 86;
            case 176 -> 46;
            case 177 -> 88;
            case 178 -> 92;
            case 179 -> 120;
            case 180 -> 83;
            case 181 -> 38;
            case 182 -> 9;
            case 183 -> 236;
            case 184 -> 93;
            case 185 -> 35;
            case 186 -> 166;
            case 187 -> 202;
            case 188 -> 24;
            case 189 -> 78;
            case 190 -> 128;
            case 191 -> 209;
            case 192 -> 114;
            case 193 -> 165;
            case 194 -> 49;
            case 195 -> 192;
            case 196 -> 184;
            case 197 -> 199;
            case 198 -> 30;
            case 199 -> 110;
            case 200 -> 200;
            case 201 -> 97;
            case 202 -> 138;
            case 203 -> 123;
            case 204 -> 141;
            case 205 -> 124;
            case 206 -> 11;
            case 207 -> 113;
            case 208 -> 227;
            case 209 -> 215;
            case 210 -> 243;
            case 211 -> 95;
            case 212 -> 5;
            case 213 -> 75;
            case 214 -> 67;
            case 215 -> 147;
            case 216 -> 0;
            case 217 -> 42;
            case 218 -> 225;
            case 219 -> 122;
            case 220 -> 149;
            case 221 -> 213;
            case 222 -> 31;
            case 223 -> 118;
            case 224 -> 1;
            case 225 -> 96;
            case 226 -> 87;
            case 227 -> 44;
            case 228 -> 235;
            case 229 -> 214;
            case 230 -> 53;
            case 231 -> 3;
            case 232 -> 68;
            case 233 -> 56;
            case 234 -> 74;
            case 235 -> 25;
            case 236 -> 121;
            case 237 -> 254;
            case 238 -> 22;
            case 239 -> 70;
            case 240 -> 29;
            case 241 -> 175;
            case 242 -> 176;
            case 243 -> 253;
            case 244 -> 226;
            case 245 -> 6;
            case 246 -> 247;
            case 247 -> 90;
            case 248 -> 19;
            case 249 -> 140;
            case 250 -> 170;
            case 251 -> 39;
            case 252 -> 47;
            case 253 -> 204;
            case 254 -> 219;
            default -> 242;
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
