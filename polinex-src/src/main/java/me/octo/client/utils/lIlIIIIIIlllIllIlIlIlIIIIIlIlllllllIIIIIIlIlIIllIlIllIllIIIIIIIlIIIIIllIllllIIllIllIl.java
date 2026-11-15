package me.octo.client.utils;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket;
import net.minecraft.network.protocol.game.ClientboundSetEntityMotionPacket;
import net.minecraft.network.protocol.game.ClientboundSetHeldSlotPacket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIlIIIIIIlllIllIlIlIlIIIIIlIlllllllIIIIIIlIlIIllIlIllIllIIIIIIIlIIIIIllIllllIIllIllIl {
   @NotNull
   public static lIlIIIIIIlllIllIlIlIlIIIIIlIlllllllIIIIIIlIlIIllIlIllIllIIIIIIIlIIIIIllIllllIIllIllIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   public static long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static List<lIlIIIIIIlllIllIlIlIlIIIIIlIlllllllIIIIIIlIlIIllIlIllIllIIIIIIIlIIIIIllIllllIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String[] a;
   private static String[] b;

   private lIlIIIIIIlllIllIlIlIlIIIIIlIlllllllIIIIIIlIlIIllIlIllIllIIIIIIIlIIIIIllIllllIIllIllIl() {
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      boolean var10000 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i();
      short var10002 = -21062;
      short var10003 = -20839;
      Intrinsics.checkNotNullParameter(var1, "event");
      boolean var2 = var10000;
      Packet var3 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      var10000 = var3 instanceof ClientboundPlayerPositionPacket;
      if (var2) {
         if (var10000) {
            long var7 = System.currentTimeMillis();
            short var10004 = -21066;
            short var10005 = 26898;
            Pair[] var4 = new Pair[8];
            var4[0] = TuplesKt.to("x", String.valueOf(((ClientboundPlayerPositionPacket)var3).change().position().x));
            var4[1] = TuplesKt.to("y", String.valueOf(((ClientboundPlayerPositionPacket)var3).change().position().y));
            var4[2] = TuplesKt.to("z", String.valueOf(((ClientboundPlayerPositionPacket)var3).change().position().z));
            short var10007 = -21059;
            short var10008 = -2949;
            var4[3] = TuplesKt.to("yaw", String.valueOf(((ClientboundPlayerPositionPacket)var3).change().yRot()));
            var10007 = -21064;
            var10008 = 3584;
            var4[4] = TuplesKt.to("pitch", String.valueOf(((ClientboundPlayerPositionPacket)var3).change().xRot()));
            var10007 = -21067;
            var10008 = -32409;
            var4[5] = TuplesKt.to("deltaX", String.valueOf(((ClientboundPlayerPositionPacket)var3).change().deltaMovement().x));
            var10007 = -21068;
            var10008 = 10557;
            var4[6] = TuplesKt.to("deltaY", String.valueOf(((ClientboundPlayerPositionPacket)var3).change().deltaMovement().y));
            var10007 = -21071;
            var10008 = -25539;
            var4[7] = TuplesKt.to("deltaZ", String.valueOf(((ClientboundPlayerPositionPacket)var3).change().deltaMovement().z));
            this.a(
               new lIlIIIIIIlllIllIlIlIlIIIIIlIlllllllIIIIIIlIlIIllIlIllIllIIIIIIIlIIIIIllIllllIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                  var7, "S08PacketPlayerPosLook", CollectionsKt.listOf(var4)
               )
            );
            if (var2) {
               return;
            }
         }

         var10000 = var3 instanceof ClientboundSetHeldSlotPacket;
      }

      if (var2) {
         if (var10000) {
            long var8 = System.currentTimeMillis();
            short var10 = -21063;
            short var12 = -22740;
            var12 = -21077;
            short var10006 = -30273;
            this.a(
               new lIlIIIIIIlllIllIlIlIlIIIIIlIlllllllIIIIIIlIlIIllIlIllIllIIIIIIIlIIIIIllIllllIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                  var8, "S09PacketHeldItemChange", CollectionsKt.listOf(TuplesKt.to("slot", String.valueOf(((ClientboundSetHeldSlotPacket)var3).slot())))
               )
            );
            if (var2) {
               return;
            }
         }

         var10000 = var3 instanceof ClientboundSetEntityMotionPacket;
      }

      if (var10000) {
         long var9 = System.currentTimeMillis();
         short var11 = -21060;
         short var14 = -20163;
         Pair[] var5 = new Pair[4];
         short var19 = -21057;
         short var27 = 30564;
         var5[0] = TuplesKt.to("entityId", String.valueOf(((ClientboundSetEntityMotionPacket)var3).id()));
         var19 = -21072;
         var27 = -2242;
         var5[1] = TuplesKt.to("motionX", String.valueOf(((ClientboundSetEntityMotionPacket)var3).movement().x));
         var19 = -21058;
         var27 = -15729;
         var5[2] = TuplesKt.to("motionY", String.valueOf(((ClientboundSetEntityMotionPacket)var3).movement().y));
         var19 = -21065;
         var27 = 27204;
         var5[3] = TuplesKt.to("motionZ", String.valueOf(((ClientboundSetEntityMotionPacket)var3).movement().z));
         this.a(
            new lIlIIIIIIlllIllIlIlIlIIIIIlIlllllllIIIIIIlIlIIllIlIllIllIIIIIIIlIIIIIllIllllIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               var9, "S12PacketEntityVelocity", CollectionsKt.listOf(var5)
            )
         );
      }
   }

   public final void a(
      @NotNull lIlIIIIIIlllIllIlIlIlIIIIIlIlllllllIIIIIIlIlIIllIlIllIllIIIIIIIlIIIIIllIllllIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      short var10001 = -21070;
      short var10002 = 5962;
      Intrinsics.checkNotNullParameter(var1, "packet");
      List var2 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      boolean var4 = false;
      var2.add(var1);
      var2.removeIf(null);
   }

   @NotNull
   public final List<lIlIIIIIIlllIllIlIlIlIIIIIlIlllllllIIIIIIlIlIIllIlIllIllIIIIIIIlIIIIIllIllllIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> a() {
      List var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      boolean var3 = false;
      var1.removeIf(null);
      return var1;
   }

   private static final boolean b(
      lIlIIIIIIlllIllIlIlIlIIIIIlIlllllllIIIIIIlIlIIllIlIllIllIIIIIIIlIIIIIllIllllIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0
   ) {
      int var10000 = ((IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i()) ? 1 : 0);
      short var10002 = -21061;
      short var10003 = -15417;
      Intrinsics.checkNotNullParameter(var0, "it");
      boolean var1 = (var10000 != 0);
      long var3;
      var10000 = (var3 = var0.a() - (System.currentTimeMillis() - 300000L)) == 0L ? 0 : (var3 < 0L ? -1 : 1);
      if (var1) {
         var10000 = var10000 < 0 ? 1 : 0;
      }

      return (var10000 != 0);
   }

   private static final boolean a(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final boolean c(
      lIlIIIIIIlllIllIlIlIlIIIIIlIlllllllIIIIIIlIlIIllIlIllIllIIIIIIIlIIIIIllIllllIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0
   ) {
      int var10000 = ((IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i()) ? 1 : 0);
      short var10002 = -21069;
      short var10003 = 11299;
      Intrinsics.checkNotNullParameter(var0, "it");
      boolean var1 = (var10000 != 0);
      long var3;
      var10000 = (var3 = var0.a() - (System.currentTimeMillis() - 300000L)) == 0L ? 0 : (var3 < 0L ? -1 : 1);
      if (var1) {
         var10000 = var10000 < 0 ? 1 : 0;
      }

      return (var10000 != 0);
   }

   private static final boolean b(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[17];
      int var3 = 0;
      String var2 = "W\u0089\u0005\u0011(Y¾\u0095\u0017x¡Ø?g\u0003\u0080¹\fas\u0002\u001e¢ì?Ý\u0000\u0010\u0097CkÀ\u0005\u0099\u0089î{L\bj+'Âi¸Ô\u0096\u0007È z\u0092Ù¥ª\u0003±\u000fÀ\u0017\rä}¶¹2[\u009fw¨\u0017\u008fõ50dâ\u0011ù}\u009eg\u0080\u0002\u0089\u0092\u0006\u0085ôzÕ&\u0015\u0006\u001eÃ\u0090¨\u0091h\u0007x\u008elW\u001b\u001dó\u0007\u0015\u0006ÁF®?G\u0016¡\u0016âÉ\u0001ÝLb\u0095\u0002Ixlm\u001aZÇ\u000f5NF\u0093\u0006\u008f\u0097¢\"×;";
      int var4 = "W\u0089\u0005\u0011(Y¾\u0095\u0017x¡Ø?g\u0003\u0080¹\fas\u0002\u001e¢ì?Ý\u0000\u0010\u0097CkÀ\u0005\u0099\u0089î{L\bj+'Âi¸Ô\u0096\u0007È z\u0092Ù¥ª\u0003±\u000fÀ\u0017\rä}¶¹2[\u009fw¨\u0017\u008fõ50dâ\u0011ù}\u009eg\u0080\u0002\u0089\u0092\u0006\u0085ôzÕ&\u0015\u0006\u001eÃ\u0090¨\u0091h\u0007x\u008elW\u001b\u001dó\u0007\u0015\u0006ÁF®?G\u0016¡\u0016âÉ\u0001ÝLb\u0095\u0002Ixlm\u001aZÇ\u000f5NF\u0093\u0006\u008f\u0097¢\"×;"
         .length();
      char var1 = 2;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 82;
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
                     case 0 -> 110;
                     case 1 -> 81;
                     case 2 -> 2;
                     case 3 -> 95;
                     case 4 -> 91;
                     case 5 -> 46;
                     default -> 57;
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
                     b = new String[17];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIlIIIIIIlllIllIlIlIlIIIIIlIlllllllIIIIIIlIlIIllIlIllIllIIIIIIIlIIIIIllIllllIIllIllIl();
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new ArrayList<>();
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

                  var2 = "\u001dW\u0093Y\u00926\u0004\u0006x\u0006\u0094";
                  var4 = "\u001dW\u0093Y\u00926\u0004\u0006x\u0006\u0094".length();
                  var1 = 6;
                  var8 = -1;
            }

            var10000 = 81;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -21061) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 221;
            case 1 -> 136;
            case 2 -> 133;
            case 3 -> 226;
            case 4 -> 177;
            case 5 -> 173;
            case 6 -> 16;
            case 7 -> 30;
            case 8 -> 102;
            case 9 -> 59;
            case 10 -> 189;
            case 11 -> 223;
            case 12 -> 58;
            case 13 -> 46;
            case 14 -> 98;
            case 15 -> 125;
            case 16 -> 3;
            case 17 -> 216;
            case 18 -> 152;
            case 19 -> 131;
            case 20 -> 224;
            case 21 -> 55;
            case 22 -> 127;
            case 23 -> 85;
            case 24 -> 25;
            case 25 -> 83;
            case 26 -> 15;
            case 27 -> 106;
            case 28 -> 96;
            case 29 -> 237;
            case 30 -> 156;
            case 31 -> 195;
            case 32 -> 206;
            case 33 -> 4;
            case 34 -> 247;
            case 35 -> 138;
            case 36 -> 244;
            case 37 -> 20;
            case 38 -> 84;
            case 39 -> 250;
            case 40 -> 146;
            case 41 -> 0;
            case 42 -> 213;
            case 43 -> 53;
            case 44 -> 142;
            case 45 -> 81;
            case 46 -> 9;
            case 47 -> 182;
            case 48 -> 194;
            case 49 -> 219;
            case 50 -> 119;
            case 51 -> 180;
            case 52 -> 236;
            case 53 -> 61;
            case 54 -> 39;
            case 55 -> 175;
            case 56 -> 143;
            case 57 -> 117;
            case 58 -> 72;
            case 59 -> 140;
            case 60 -> 230;
            case 61 -> 108;
            case 62 -> 116;
            case 63 -> 17;
            case 64 -> 77;
            case 65 -> 210;
            case 66 -> 187;
            case 67 -> 13;
            case 68 -> 21;
            case 69 -> 239;
            case 70 -> 31;
            case 71 -> 169;
            case 72 -> 121;
            case 73 -> 87;
            case 74 -> 240;
            case 75 -> 66;
            case 76 -> 10;
            case 77 -> 78;
            case 78 -> 26;
            case 79 -> 231;
            case 80 -> 207;
            case 81 -> 154;
            case 82 -> 103;
            case 83 -> 171;
            case 84 -> 228;
            case 85 -> 36;
            case 86 -> 49;
            case 87 -> 42;
            case 88 -> 190;
            case 89 -> 118;
            case 90 -> 97;
            case 91 -> 120;
            case 92 -> 161;
            case 93 -> 176;
            case 94 -> 114;
            case 95 -> 126;
            case 96 -> 24;
            case 97 -> 124;
            case 98 -> 99;
            case 99 -> 211;
            case 100 -> 215;
            case 101 -> 181;
            case 102 -> 166;
            case 103 -> 245;
            case 104 -> 196;
            case 105 -> 11;
            case 106 -> 101;
            case 107 -> 197;
            case 108 -> 183;
            case 109 -> 48;
            case 110 -> 8;
            case 111 -> 52;
            case 112 -> 148;
            case 113 -> 234;
            case 114 -> 37;
            case 115 -> 38;
            case 116 -> 12;
            case 117 -> 145;
            case 118 -> 40;
            case 119 -> 105;
            case 120 -> 86;
            case 121 -> 65;
            case 122 -> 225;
            case 123 -> 82;
            case 124 -> 141;
            case 125 -> 153;
            case 126 -> 198;
            case 127 -> 200;
            case 128 -> 67;
            case 129 -> 134;
            case 130 -> 170;
            case 131 -> 130;
            case 132 -> 100;
            case 133 -> 28;
            case 134 -> 255;
            case 135 -> 6;
            case 136 -> 242;
            case 137 -> 1;
            case 138 -> 214;
            case 139 -> 222;
            case 140 -> 92;
            case 141 -> 135;
            case 142 -> 45;
            case 143 -> 70;
            case 144 -> 34;
            case 145 -> 205;
            case 146 -> 157;
            case 147 -> 186;
            case 148 -> 79;
            case 149 -> 168;
            case 150 -> 95;
            case 151 -> 227;
            case 152 -> 80;
            case 153 -> 7;
            case 154 -> 232;
            case 155 -> 33;
            case 156 -> 203;
            case 157 -> 68;
            case 158 -> 137;
            case 159 -> 88;
            case 160 -> 238;
            case 161 -> 150;
            case 162 -> 199;
            case 163 -> 155;
            case 164 -> 41;
            case 165 -> 43;
            case 166 -> 159;
            case 167 -> 172;
            case 168 -> 122;
            case 169 -> 208;
            case 170 -> 191;
            case 171 -> 132;
            case 172 -> 109;
            case 173 -> 19;
            case 174 -> 251;
            case 175 -> 69;
            case 176 -> 27;
            case 177 -> 22;
            case 178 -> 243;
            case 179 -> 144;
            case 180 -> 254;
            case 181 -> 71;
            case 182 -> 111;
            case 183 -> 174;
            case 184 -> 50;
            case 185 -> 129;
            case 186 -> 2;
            case 187 -> 164;
            case 188 -> 32;
            case 189 -> 115;
            case 190 -> 18;
            case 191 -> 233;
            case 192 -> 139;
            case 193 -> 112;
            case 194 -> 110;
            case 195 -> 123;
            case 196 -> 160;
            case 197 -> 91;
            case 198 -> 107;
            case 199 -> 29;
            case 200 -> 151;
            case 201 -> 248;
            case 202 -> 179;
            case 203 -> 167;
            case 204 -> 163;
            case 205 -> 241;
            case 206 -> 56;
            case 207 -> 76;
            case 208 -> 253;
            case 209 -> 128;
            case 210 -> 47;
            case 211 -> 74;
            case 212 -> 23;
            case 213 -> 217;
            case 214 -> 209;
            case 215 -> 51;
            case 216 -> 54;
            case 217 -> 184;
            case 218 -> 75;
            case 219 -> 218;
            case 220 -> 201;
            case 221 -> 185;
            case 222 -> 44;
            case 223 -> 63;
            case 224 -> 193;
            case 225 -> 158;
            case 226 -> 249;
            case 227 -> 162;
            case 228 -> 104;
            case 229 -> 235;
            case 230 -> 62;
            case 231 -> 14;
            case 232 -> 252;
            case 233 -> 149;
            case 234 -> 229;
            case 235 -> 113;
            case 236 -> 94;
            case 237 -> 93;
            case 238 -> 5;
            case 239 -> 178;
            case 240 -> 202;
            case 241 -> 35;
            case 242 -> 64;
            case 243 -> 90;
            case 244 -> 246;
            case 245 -> 89;
            case 246 -> 60;
            case 247 -> 188;
            case 248 -> 212;
            case 249 -> 57;
            case 250 -> 73;
            case 251 -> 147;
            case 252 -> 204;
            case 253 -> 165;
            case 254 -> 220;
            default -> 192;
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
   public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll p0, long p1, String p2, List p3, int m, Object mk) {
      if ((m & 1) != 0) {
         p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }
      if ((m & 2) != 0) {
         p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }
      if ((m & 4) != 0) {
         p3 = p0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }
      return new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(p1, p2, p3);
   }

      private final long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final List<Pair<String, String>> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         long var1, @NotNull String var3, @NotNull List<Pair<String, String>> var4
      ) {
         short var10001 = -19736;
         short var10002 = -5288;
         Intrinsics.checkNotNullParameter(var3, "name");
         var10001 = -19729;
         var10002 = -12183;
         Intrinsics.checkNotNullParameter(var4, "data");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var3;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var4;
      }

      public final long a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final String b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final List<Pair<String, String>> c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final long d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final String e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final List<Pair<String, String>> f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final lIlIIIIIIlllIllIlIlIlIIIIIlIlllllllIIIIIIlIlIIllIlIllIllIIIIIIIlIIIIIllIllllIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         long var1, @NotNull String var3, @NotNull List<Pair<String, String>> var4
      ) {
         short var10001 = -19731;
         short var10002 = -18908;
         Intrinsics.checkNotNullParameter(var3, "name");
         var10001 = -19730;
         var10002 = -2694;
         Intrinsics.checkNotNullParameter(var4, "data");
         return new lIlIIIIIIlllIllIlIlIlIIIIIlIlllllllIIIIIIlIlIIllIlIllIllIIIIIIIlIIIIIllIllllIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var3, var4
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -19733;
         List var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         String var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         long var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -22990;
         short var10002 = -19734;
         short var10003 = -30296;
         short var10004 = -19735;
         short var10005 = 12150;
         return "LoggedPacket(timestamp=" + var3 + ", name=" + var2 + ", data=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Long.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var1 = var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
         return var1 * 31 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         boolean var2 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.h();
         Object var10000 = this;
         if (!var2) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (!var2) {
            if (!(
               var10000 instanceof lIlIIIIIIlllIllIlIlIlIIIIIlIlllllllIIIIIIlIlIIllIlIllIllIIIIIIIlIIIIIllIllllIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIlIIIIIIlllIllIlIlIlIIIIIlIlllllllIIIIIIlIlIIllIlIllIllIIIIIIIlIIIIIllIllllIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (lIlIIIIIIlllIllIlIlIlIIIIIlIlllllllIIIIIIlIlIIllIlIllIllIIIIIIIlIIIIIllIllllIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         long var5;
         int var4 = (
                  var5 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     - var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               )
               == 0L
            ? 0
            : (var5 < 0L ? -1 : 1);
         if (!var2) {
            if ((var4 != 0)) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )) ? 1 : 0);
         }

         if (!var2) {
            if ((var4 == 0)) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            )) ? 1 : 0);
         }

         if (!var2) {
            if ((var4 == 0)) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[7];
         int var3 = 0;
         String var2 = "ï<*\u0080#/\u0014ØÁH°ó'\u0019\u0014ÎÖ\u0088ï½\u0083>÷\u0007áæ\u008e{\u0097\u0097æ\u0007·dN+Ý\u0099\u0095\u0004\u0096ji\u0087\u0004êä´R";
         int var4 = "ï<*\u0080#/\u0014ØÁH°ó'\u0019\u0014ÎÖ\u0088ï½\u0083>÷\u0007áæ\u008e{\u0097\u0097æ\u0007·dN+Ý\u0099\u0095\u0004\u0096ji\u0087\u0004êä´R"
            .length();
         char var1 = 23;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 68;
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
                        case 0 -> 94;
                        case 1 -> 58;
                        case 2 -> 114;
                        case 3 -> 105;
                        case 4 -> 10;
                        case 5 -> 49;
                        default -> 100;
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
                        b = new String[7];
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

                     var2 = "\u009a|\u0086}\u0004rkÉ\u009b";
                     var4 = "\u009a|\u0086}\u0004rkÉ\u009b".length();
                     var1 = 4;
                     var8 = -1;
               }

               var10000 = 54;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
   } // PX-FIX end pxClinit
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -19733) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 90;
               case 1 -> 200;
               case 2 -> 120;
               case 3 -> 9;
               case 4 -> 191;
               case 5 -> 183;
               case 6 -> 58;
               case 7 -> 174;
               case 8 -> 168;
               case 9 -> 50;
               case 10 -> 95;
               case 11 -> 69;
               case 12 -> 206;
               case 13 -> 136;
               case 14 -> 214;
               case 15 -> 177;
               case 16 -> 6;
               case 17 -> 148;
               case 18 -> 38;
               case 19 -> 187;
               case 20 -> 47;
               case 21 -> 246;
               case 22 -> 225;
               case 23 -> 192;
               case 24 -> 4;
               case 25 -> 132;
               case 26 -> 176;
               case 27 -> 233;
               case 28 -> 20;
               case 29 -> 63;
               case 30 -> 25;
               case 31 -> 45;
               case 32 -> 61;
               case 33 -> 77;
               case 34 -> 107;
               case 35 -> 34;
               case 36 -> 19;
               case 37 -> 16;
               case 38 -> 137;
               case 39 -> 189;
               case 40 -> 167;
               case 41 -> 26;
               case 42 -> 114;
               case 43 -> 141;
               case 44 -> 42;
               case 45 -> 40;
               case 46 -> 219;
               case 47 -> 128;
               case 48 -> 54;
               case 49 -> 152;
               case 50 -> 129;
               case 51 -> 207;
               case 52 -> 73;
               case 53 -> 254;
               case 54 -> 169;
               case 55 -> 110;
               case 56 -> 197;
               case 57 -> 116;
               case 58 -> 237;
               case 59 -> 22;
               case 60 -> 226;
               case 61 -> 211;
               case 62 -> 240;
               case 63 -> 135;
               case 64 -> 193;
               case 65 -> 53;
               case 66 -> 111;
               case 67 -> 224;
               case 68 -> 24;
               case 69 -> 126;
               case 70 -> 64;
               case 71 -> 201;
               case 72 -> 223;
               case 73 -> 78;
               case 74 -> 178;
               case 75 -> 218;
               case 76 -> 235;
               case 77 -> 23;
               case 78 -> 122;
               case 79 -> 68;
               case 80 -> 48;
               case 81 -> 8;
               case 82 -> 180;
               case 83 -> 37;
               case 84 -> 93;
               case 85 -> 13;
               case 86 -> 71;
               case 87 -> 140;
               case 88 -> 18;
               case 89 -> 182;
               case 90 -> 104;
               case 91 -> 131;
               case 92 -> 241;
               case 93 -> 212;
               case 94 -> 194;
               case 95 -> 84;
               case 96 -> 125;
               case 97 -> 30;
               case 98 -> 33;
               case 99 -> 196;
               case 100 -> 123;
               case 101 -> 82;
               case 102 -> 35;
               case 103 -> 138;
               case 104 -> 205;
               case 105 -> 217;
               case 106 -> 55;
               case 107 -> 166;
               case 108 -> 59;
               case 109 -> 83;
               case 110 -> 27;
               case 111 -> 151;
               case 112 -> 170;
               case 113 -> 97;
               case 114 -> 115;
               case 115 -> 155;
               case 116 -> 199;
               case 117 -> 195;
               case 118 -> 165;
               case 119 -> 130;
               case 120 -> 3;
               case 121 -> 216;
               case 122 -> 15;
               case 123 -> 142;
               case 124 -> 227;
               case 125 -> 103;
               case 126 -> 204;
               case 127 -> 100;
               case 128 -> 198;
               case 129 -> 7;
               case 130 -> 72;
               case 131 -> 52;
               case 132 -> 244;
               case 133 -> 31;
               case 134 -> 113;
               case 135 -> 234;
               case 136 -> 215;
               case 137 -> 221;
               case 138 -> 229;
               case 139 -> 66;
               case 140 -> 118;
               case 141 -> 248;
               case 142 -> 236;
               case 143 -> 139;
               case 144 -> 231;
               case 145 -> 17;
               case 146 -> 74;
               case 147 -> 153;
               case 148 -> 41;
               case 149 -> 175;
               case 150 -> 91;
               case 151 -> 85;
               case 152 -> 29;
               case 153 -> 247;
               case 154 -> 98;
               case 155 -> 154;
               case 156 -> 202;
               case 157 -> 163;
               case 158 -> 39;
               case 159 -> 2;
               case 160 -> 46;
               case 161 -> 144;
               case 162 -> 134;
               case 163 -> 242;
               case 164 -> 159;
               case 165 -> 133;
               case 166 -> 105;
               case 167 -> 28;
               case 168 -> 203;
               case 169 -> 150;
               case 170 -> 99;
               case 171 -> 190;
               case 172 -> 253;
               case 173 -> 245;
               case 174 -> 112;
               case 175 -> 252;
               case 176 -> 81;
               case 177 -> 232;
               case 178 -> 108;
               case 179 -> 210;
               case 180 -> 162;
               case 181 -> 12;
               case 182 -> 80;
               case 183 -> 185;
               case 184 -> 96;
               case 185 -> 208;
               case 186 -> 32;
               case 187 -> 60;
               case 188 -> 21;
               case 189 -> 149;
               case 190 -> 88;
               case 191 -> 222;
               case 192 -> 5;
               case 193 -> 158;
               case 194 -> 157;
               case 195 -> 14;
               case 196 -> 57;
               case 197 -> 101;
               case 198 -> 67;
               case 199 -> 230;
               case 200 -> 65;
               case 201 -> 119;
               case 202 -> 243;
               case 203 -> 94;
               case 204 -> 161;
               case 205 -> 79;
               case 206 -> 147;
               case 207 -> 255;
               case 208 -> 56;
               case 209 -> 106;
               case 210 -> 251;
               case 211 -> 10;
               case 212 -> 109;
               case 213 -> 146;
               case 214 -> 160;
               case 215 -> 250;
               case 216 -> 179;
               case 217 -> 92;
               case 218 -> 76;
               case 219 -> 62;
               case 220 -> 127;
               case 221 -> 87;
               case 222 -> 102;
               case 223 -> 173;
               case 224 -> 75;
               case 225 -> 145;
               case 226 -> 186;
               case 227 -> 238;
               case 228 -> 249;
               case 229 -> 239;
               case 230 -> 171;
               case 231 -> 164;
               case 232 -> 43;
               case 233 -> 86;
               case 234 -> 70;
               case 235 -> 181;
               case 236 -> 156;
               case 237 -> 36;
               case 238 -> 184;
               case 239 -> 44;
               case 240 -> 213;
               case 241 -> 188;
               case 242 -> 228;
               case 243 -> 124;
               case 244 -> 49;
               case 245 -> 121;
               case 246 -> 89;
               case 247 -> 220;
               case 248 -> 11;
               case 249 -> 143;
               case 250 -> 0;
               case 251 -> 209;
               case 252 -> 117;
               case 253 -> 172;
               case 254 -> 51;
               default -> 1;
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
}
