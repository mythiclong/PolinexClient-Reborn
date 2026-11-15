package me.octo.client;

import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.player.RemotePlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public final class IIIIllIllIIlllIIIlllIIllllIllIlllIIllIlIlllIlIllIIIllllIIlllIlIIIIIlIIlIllIIIlIllllll
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {

   @NotNull
   public static IIIIllIllIIlllIIIlllIIllllIllIlllIIllIlIlllIlIllIIIllllIIlllIlIIIIIlIIlIllIIIlIllllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private List<String> lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @JvmField
   @NotNull
   public static IIIIllIllIIlllIIIlllIIllllIllIlllIIllIlIlllIlIllIIIllllIIlllIlIIIIIlIIlIllIIIlIllllll lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static String[] f;
   private static String[] g;

   private IIIIllIllIIlllIIIlllIIllllIllIlllIIllIlIlllIlIllIIIllllIIlllIlIIIIIlIIlIllIIIlIllllll() {
      short var10001 = -17748;
      short var10002 = -15735;
      var10002 = -17754;
      short var10003 = -21710;
      short var10004 = -17759;
      short var10005 = 27037;
      super(
         "Goblin Hider",
         "Stops Goblins from rendering!",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
         "Misc"
      );
      String[] var1 = new String[3];
      var10003 = -17753;
      var10004 = -20152;
      var1[0] = "goblin";
      var10003 = -17756;
      var10004 = 9476;
      var1[1] = "knifethrower";
      var10003 = -17760;
      var10004 = -29311;
      var1[2] = "fireslinger";
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = CollectionsKt.listOf(var1);
   }

   @NotNull
   public final List<String> ag() {
      return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var1) {
      Object var7 = null; // PX-FIX
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      int[] var10000 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      short var10002 = -17758;
      short var10003 = 2946;
      Intrinsics.checkNotNullParameter(var1, "event");
      int[] var2 = var10000;
      if (var2 != null) {
         LivingEntity var6 = var1.k();
         if (var6 != null) {
            LivingEntity var3;
            var3 = var6;
            var7 = var3 instanceof RemotePlayer;
            label33:
            if (var2 != null) {
               if (!(me.octo.client.PxTruth.truth(var7))) {
                  var7 = var3 instanceof ArmorStand;
                  if (var2 == null) {
                     break label33;
                  }

                  if (!(me.octo.client.PxTruth.truth(var7))) {
                     return;
                  }
               }

               var7 = this.a(var3);
            }

            if ((me.octo.client.PxTruth.truth(var7))) {
               var3.setInvisible(true);

               for (EquipmentSlot var5 : IIIIllIllIIlllIIIlllIIllllIllIlllIIllIlIlllIlIllIIIllllIIlllIlIIIIIlIIlIllIIIlIllllll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
                  var3.setItemSlot(var5, ItemStack.EMPTY);
                  if (var2 == null) {
                     break;
                  }
               }
            }

            return;
         }
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.lIlIlIlIIIlIIIIIllIlIIIIllllIIIlllIIlllIllIlllllIIIllIIlllIllIlIlllIllIlIIlIIllllIlll var1) {
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      boolean var4;
      int[] var10000 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      short var10002 = -17747;
      short var10003 = 4935;
      Intrinsics.checkNotNullParameter(var1, "event");
      int[] var2 = var10000;
      Entity var3 = var1.k();
      var4 = var3 instanceof RemotePlayer;
      label20:
      if (var2 != null) {
         if (!var4) {
            var4 = var3 instanceof ArmorStand;
            if (var2 == null) {
               break label20;
            }

            if (!var4) {
               return;
            }
         }

         var4 = this.a((LivingEntity)var3);
      }

      if (var4) {
         var1.a(true);
      }
   }

   private final boolean a(LivingEntity var1) {
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      int[] var2;
      String var3;
      Object var11;
      var11 = var1.getName().getString();
      short var10002 = -17757;
      short var10003 = 15636;
      Intrinsics.checkNotNullExpressionValue(var11, "getString(...)");
      var3 = (String)var11;
      var11 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      var var4 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      boolean var5 = false;
      var2 = (int[])var11;
      var11 = var4;
      label36:
      if (var2 != null) {
         if (var4 instanceof Collection) {
            var11 = (Collection)var4;
            if (var2 == null) {
               break label36;
            }

            if (((me.octo.client.PXDyn)var11).isEmpty()) {
               return false;
            }
         }

         var11 = var4;
      }

      for (Object var7 : (Iterable<?>)(var11)) {
         String var8 = (String)var7;
         boolean var9 = false;
         var11 = var3.toLowerCase(Locale.ROOT);
         var10002 = -17755;
         var10003 = 5869;
         Intrinsics.checkNotNullExpressionValue(var11, "toLowerCase(...)");
         boolean var12 = StringsKt.contains((CharSequence)var11, var8, false);

         while (var12) {
            var12 = true;
            if (var2 != null) {
               return true;
            }
         }
      }

      return false;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[10];
      int var3 = 0;
      String var2 = "ª¬÷\u009e\u000frÓ\u0090I\u0094\u0000©\u0010\u009cNèê\u007fÅ\u0097d\u0096\u00194Æ\u001eHPò\u001d\u0002\u008eÛ\u0095Z\u0093\u0082o¤Î\u001d\u0086ëÀPw\u0002q2ã\u0094x\u0006\u0004\u0094ð¿®#\u0006\u0014\u0087¦ÐCê\u000bPa\u001fÃ|¢h\u008d\u0017ºÕ\u0004kQ7Ã\u0005\u00908s\u001f\u0003\u000e¢[f?\u0092ÓR~P\u0089aâ\u0096\r";
      int var4 = "ª¬÷\u009e\u000frÓ\u0090I\u0094\u0000©\u0010\u009cNèê\u007fÅ\u0097d\u0096\u00194Æ\u001eHPò\u001d\u0002\u008eÛ\u0095Z\u0093\u0082o¤Î\u001d\u0086ëÀPw\u0002q2ã\u0094x\u0006\u0004\u0094ð¿®#\u0006\u0014\u0087¦ÐCê\u000bPa\u001fÃ|¢h\u008d\u0017ºÕ\u0004kQ7Ã\u0005\u00908s\u001f\u0003\u000e¢[f?\u0092ÓR~P\u0089aâ\u0096\r"
         .length();
      char var1 = '\f';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 64;
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
                     case 0 -> 93;
                     case 1 -> 127;
                     case 2 -> 46;
                     case 3 -> 105;
                     case 4 -> 93;
                     case 5 -> 26;
                     default -> 112;
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
                     g = new String[10];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IIIIllIllIIlllIIIlllIIllllIllIlllIIllIlIlllIlIllIIIllllIIlllIlIIIIIlIIlIllIIIlIllllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new IIIIllIllIIlllIIIlllIIllllIllIlllIIllIlIlllIlIllIIIllllIIlllIlIIIIIlIIlIllIIIlIllllll();
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

                  var2 = "\u001dî`>Xô?àP7&o\u0005gjN\u0096g";
                  var4 = "\u001dî`>Xô?àP7&o\u0005gjN\u0096g".length();
                  var1 = '\f';
                  var8 = -1;
            }

            var10000 = 103;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -17756) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 2;
            case 1 -> 94;
            case 2 -> 138;
            case 3 -> 46;
            case 4 -> 113;
            case 5 -> 52;
            case 6 -> 164;
            case 7 -> 252;
            case 8 -> 205;
            case 9 -> 218;
            case 10 -> 148;
            case 11 -> 158;
            case 12 -> 75;
            case 13 -> 21;
            case 14 -> 91;
            case 15 -> 38;
            case 16 -> 143;
            case 17 -> 139;
            case 18 -> 63;
            case 19 -> 134;
            case 20 -> 65;
            case 21 -> 235;
            case 22 -> 150;
            case 23 -> 66;
            case 24 -> 238;
            case 25 -> 4;
            case 26 -> 122;
            case 27 -> 228;
            case 28 -> 74;
            case 29 -> 163;
            case 30 -> 0;
            case 31 -> 230;
            case 32 -> 26;
            case 33 -> 93;
            case 34 -> 69;
            case 35 -> 175;
            case 36 -> 203;
            case 37 -> 239;
            case 38 -> 204;
            case 39 -> 41;
            case 40 -> 187;
            case 41 -> 210;
            case 42 -> 25;
            case 43 -> 181;
            case 44 -> 102;
            case 45 -> 168;
            case 46 -> 186;
            case 47 -> 5;
            case 48 -> 220;
            case 49 -> 142;
            case 50 -> 216;
            case 51 -> 33;
            case 52 -> 6;
            case 53 -> 24;
            case 54 -> 131;
            case 55 -> 155;
            case 56 -> 166;
            case 57 -> 27;
            case 58 -> 195;
            case 59 -> 97;
            case 60 -> 229;
            case 61 -> 118;
            case 62 -> 126;
            case 63 -> 188;
            case 64 -> 215;
            case 65 -> 99;
            case 66 -> 120;
            case 67 -> 9;
            case 68 -> 81;
            case 69 -> 114;
            case 70 -> 70;
            case 71 -> 56;
            case 72 -> 254;
            case 73 -> 80;
            case 74 -> 208;
            case 75 -> 90;
            case 76 -> 157;
            case 77 -> 86;
            case 78 -> 207;
            case 79 -> 22;
            case 80 -> 213;
            case 81 -> 48;
            case 82 -> 141;
            case 83 -> 58;
            case 84 -> 145;
            case 85 -> 106;
            case 86 -> 140;
            case 87 -> 189;
            case 88 -> 165;
            case 89 -> 152;
            case 90 -> 72;
            case 91 -> 221;
            case 92 -> 137;
            case 93 -> 15;
            case 94 -> 197;
            case 95 -> 199;
            case 96 -> 237;
            case 97 -> 196;
            case 98 -> 107;
            case 99 -> 219;
            case 100 -> 130;
            case 101 -> 42;
            case 102 -> 76;
            case 103 -> 253;
            case 104 -> 214;
            case 105 -> 151;
            case 106 -> 190;
            case 107 -> 68;
            case 108 -> 132;
            case 109 -> 34;
            case 110 -> 245;
            case 111 -> 162;
            case 112 -> 49;
            case 113 -> 178;
            case 114 -> 184;
            case 115 -> 144;
            case 116 -> 128;
            case 117 -> 61;
            case 118 -> 98;
            case 119 -> 121;
            case 120 -> 7;
            case 121 -> 10;
            case 122 -> 233;
            case 123 -> 87;
            case 124 -> 79;
            case 125 -> 71;
            case 126 -> 83;
            case 127 -> 185;
            case 128 -> 44;
            case 129 -> 248;
            case 130 -> 176;
            case 131 -> 240;
            case 132 -> 109;
            case 133 -> 234;
            case 134 -> 12;
            case 135 -> 54;
            case 136 -> 201;
            case 137 -> 223;
            case 138 -> 231;
            case 139 -> 232;
            case 140 -> 88;
            case 141 -> 154;
            case 142 -> 95;
            case 143 -> 104;
            case 144 -> 172;
            case 145 -> 156;
            case 146 -> 3;
            case 147 -> 11;
            case 148 -> 64;
            case 149 -> 14;
            case 150 -> 45;
            case 151 -> 20;
            case 152 -> 159;
            case 153 -> 28;
            case 154 -> 51;
            case 155 -> 19;
            case 156 -> 136;
            case 157 -> 16;
            case 158 -> 85;
            case 159 -> 105;
            case 160 -> 146;
            case 161 -> 108;
            case 162 -> 209;
            case 163 -> 251;
            case 164 -> 77;
            case 165 -> 92;
            case 166 -> 96;
            case 167 -> 117;
            case 168 -> 177;
            case 169 -> 135;
            case 170 -> 112;
            case 171 -> 153;
            case 172 -> 127;
            case 173 -> 13;
            case 174 -> 124;
            case 175 -> 78;
            case 176 -> 250;
            case 177 -> 147;
            case 178 -> 119;
            case 179 -> 129;
            case 180 -> 192;
            case 181 -> 217;
            case 182 -> 225;
            case 183 -> 40;
            case 184 -> 244;
            case 185 -> 100;
            case 186 -> 53;
            case 187 -> 236;
            case 188 -> 170;
            case 189 -> 36;
            case 190 -> 179;
            case 191 -> 60;
            case 192 -> 211;
            case 193 -> 116;
            case 194 -> 206;
            case 195 -> 18;
            case 196 -> 47;
            case 197 -> 169;
            case 198 -> 246;
            case 199 -> 55;
            case 200 -> 37;
            case 201 -> 125;
            case 202 -> 149;
            case 203 -> 89;
            case 204 -> 193;
            case 205 -> 180;
            case 206 -> 173;
            case 207 -> 194;
            case 208 -> 31;
            case 209 -> 200;
            case 210 -> 222;
            case 211 -> 191;
            case 212 -> 57;
            case 213 -> 249;
            case 214 -> 242;
            case 215 -> 43;
            case 216 -> 39;
            case 217 -> 50;
            case 218 -> 17;
            case 219 -> 32;
            case 220 -> 161;
            case 221 -> 247;
            case 222 -> 110;
            case 223 -> 183;
            case 224 -> 73;
            case 225 -> 1;
            case 226 -> 202;
            case 227 -> 243;
            case 228 -> 212;
            case 229 -> 62;
            case 230 -> 103;
            case 231 -> 133;
            case 232 -> 171;
            case 233 -> 174;
            case 234 -> 226;
            case 235 -> 8;
            case 236 -> 224;
            case 237 -> 67;
            case 238 -> 167;
            case 239 -> 84;
            case 240 -> 198;
            case 241 -> 30;
            case 242 -> 101;
            case 243 -> 241;
            case 244 -> 23;
            case 245 -> 160;
            case 246 -> 227;
            case 247 -> 255;
            case 248 -> 182;
            case 249 -> 29;
            case 250 -> 59;
            case 251 -> 111;
            case 252 -> 123;
            case 253 -> 115;
            case 254 -> 35;
            default -> 82;
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

   // PX-RESTORE: EquipmentSlot.entries holder (jar: IIIIllIllIIlllIII...$IllllIIlll...)
   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      public static kotlin.enums.EnumEntries<EquipmentSlot> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

      static {
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = kotlin.enums.EnumEntriesKt.enumEntries(EquipmentSlot.values());
      }
   }
}
