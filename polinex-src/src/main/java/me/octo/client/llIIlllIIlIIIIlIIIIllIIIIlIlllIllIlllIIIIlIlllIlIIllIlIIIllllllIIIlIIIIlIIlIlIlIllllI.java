package me.octo.client;

import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
import me.octo.client.utils.IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.utils.IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI;
import me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
import me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
import me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
import me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
import me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
import me.octo.client.utils.player.etherwarp.PolinexGlaciteTunnelEtherwarpCompatibility;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI
   extends lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll {
    public static <T> T d(Object p0) { return null; } // PX-FIX mr4
    public static <T> T b(Object p0) { return null; } // PX-FIX mr4
    public static <T> T f(Object p0) { return null; } // PX-FIX mr3
    public static <T> T e(Object p0) { return null; } // PX-FIX mr3

   public Object receiver; // PX-FIX kotlin lambda receiver

   @NotNull
   public static llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
   private int lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   @NotNull
   private static llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;

   public static final llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI bx() {
      return IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
   }

   public static final void a(llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI var0, IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      var0.a(var1);
   }
   private static String[] j;
   private static String[] k;

   public llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI() {
      short var10001 = -14212;
      short var10002 = -25375;
      var10002 = -14215;
      short var10003 = -18535;
      me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      short var10004 = -14210;
      short var10005 = 1035;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         IllIIIIllllIIllIlIIlIlIlIIlIIIIlllIIllIlIllIllllIIllIIllllllIIllIIllIIlIIllIlIIIIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         IllIIIIllllIIllIlIIlIlIlIIlIIIIlllIIllIlIllIllllIIllIIllllllIIllIIllIIlIIllIlIIIIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         IllIIIIllllIIllIlIIlIlIlIIlIIIIlllIIllIlIllIllllIIllIIllllllIIllIIllIIlIIllIlIIIIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .d(),
         IllIIIIllllIIllIlIIlIlIlIIlIIIIlllIIllIlIllIllllIIllIIllllllIIllIIllIIlIIllIlIIIIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c(),
         IllIIIIllllIIllIlIIlIlIlIIlIIIIlllIIllIlIllIllllIIllIIllllllIIllIIllIIlIIllIlIIIIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e(),
         IllIIIIllllIIllIlIIlIlIlIIlIIIIlllIIllIlIllIllllIIllIIllllllIIllIIllIIlIIllIlIIIIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .f(),
         IllIIIIllllIIllIlIIlIlIlIIlIIIIlllIIllIlIllIllllIIllIIllllllIIllIIllIIlIIllIlIIIIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .g(),
         IllIIIIllllIIllIlIIlIlIlIIlIIIIlllIIllIlIllIllllIIllIIllllllIIllIIllIIlIIllIlIIIIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .h()
      };
      super(
         "Tunnel Miner",
         "Mines umber, tungsten, or gemstones in the Glacite Tunnels with a custom route.",
         var3,
         "Glacite Tunnels",
         null,
         null,
         true,
         var1,
         48,
         null
      );
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = 1;
   }

   @Override
   public boolean c() {
      return true;
   }

   @Override
   protected void aD() {
      Object receiver = null; // PX-FIX
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var10000 = this;
      short var10001 = -14211;
      short var10002 = 17716;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10000),
         "Tunnel Miner travel",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         null,
         5000L,
         false,
         false,
         (kotlin.jvm.functions.Function1)(llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI::b),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = -20931;
                  short var10005 = -10277;
                  var10005 = -20932;
                  short var10006 = 30058;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001x = -20930;
                  short var10002x = 3476;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
   pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "ÿ\u008e\u001d\u0094ª\u0090ý\u001d¿ÿ]ö K-ø\u009dé=þ#Üó8Ra*\u0097_´b/kÌ\u0016®X\u0081ëEq¹\u0091/V ¤\u0097 é¨ýôu¹\u001b\u0088ßu\u001aåA,3¸\u0083ö\u001eùÒ¥BQ(a\u0007\u0099Þª¿\u0010¼\u0081\"\u000eø¥ÛÚøJ\u0004QeJÂKlW1\u008eâ\u009aßæàEùít\u001b\u001eÜÛÿ>´D\u0006¶ý²^\u001d\u009evj\u0016\u0014\u0084`Õ\u0005¸\b\u0018\u0001_\u008aâZÉr¨vã@¿\u008cô\u0002ýG";
                  int var4 = "ÿ\u008e\u001d\u0094ª\u0090ý\u001d¿ÿ]ö K-ø\u009dé=þ#Üó8Ra*\u0097_´b/kÌ\u0016®X\u0081ëEq¹\u0091/V ¤\u0097 é¨ýôu¹\u001b\u0088ßu\u001aåA,3¸\u0083ö\u001eùÒ¥BQ(a\u0007\u0099Þª¿\u0010¼\u0081\"\u000eø¥ÛÚøJ\u0004QeJÂKlW1\u008eâ\u009aßæàEùít\u001b\u001eÜÛÿ>´D\u0006¶ý²^\u001d\u009evj\u0016\u0014\u0084`Õ\u0005¸\b\u0018\u0001_\u008aâZÉr¨vã@¿\u008cô\u0002ýG"
                     .length();
                  char var1 = 127;
                  int var0 = -1;

                  while (true) {
                     char[] var10002x;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 12;
                        var10002x = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 12;
                           var10006 = var6;
                        } else {
                           var13 = 12;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 12;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 114;
                              case 1 -> 23;
                              case 2 -> 42;
                              case 3 -> 3;
                              case 4 -> 14;
                              case 5 -> 98;
                              default -> 81;
                           });
                           var6++;
                           if (var13 == 0) {
                              var10006 = var13;
                              var10005 = var10002x;
                              var16 = var13;
                           } else {
                              if (var8 <= var6) {
                                 break;
                              }

                              var10005 = var10002x;
                              var16 = var13;
                              var10006 = var6;
                           }
                        }
                     }

                     String var15 = new String(var10002x).intern();
                     byte var10 = -1;
                     var5[var3++] = var15;
                     if ((var0 += var1) >= var4) {
                        a = var5;
                        b = new String[3];
                        break pxClinit;
                     }

                     var1 = var2.charAt(var0);
                  }
               }
}

               private static String a(int var0, int var1) {
                  int var2 = (var0 ^ -20932) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 221;
                        case 1 -> 79;
                        case 2 -> 191;
                        case 3 -> 253;
                        case 4 -> 83;
                        case 5 -> 70;
                        case 6 -> 150;
                        case 7 -> 42;
                        case 8 -> 119;
                        case 9 -> 153;
                        case 10 -> 64;
                        case 11 -> 39;
                        case 12 -> 126;
                        case 13 -> 219;
                        case 14 -> 107;
                        case 15 -> 172;
                        case 16 -> 61;
                        case 17 -> 243;
                        case 18 -> 146;
                        case 19 -> 6;
                        case 20 -> 185;
                        case 21 -> 82;
                        case 22 -> 40;
                        case 23 -> 237;
                        case 24 -> 0;
                        case 25 -> 173;
                        case 26 -> 54;
                        case 27 -> 37;
                        case 28 -> 187;
                        case 29 -> 62;
                        case 30 -> 3;
                        case 31 -> 110;
                        case 32 -> 218;
                        case 33 -> 178;
                        case 34 -> 226;
                        case 35 -> 201;
                        case 36 -> 209;
                        case 37 -> 203;
                        case 38 -> 202;
                        case 39 -> 193;
                        case 40 -> 52;
                        case 41 -> 167;
                        case 42 -> 93;
                        case 43 -> 138;
                        case 44 -> 181;
                        case 45 -> 97;
                        case 46 -> 132;
                        case 47 -> 212;
                        case 48 -> 248;
                        case 49 -> 157;
                        case 50 -> 87;
                        case 51 -> 130;
                        case 52 -> 66;
                        case 53 -> 41;
                        case 54 -> 149;
                        case 55 -> 63;
                        case 56 -> 94;
                        case 57 -> 155;
                        case 58 -> 196;
                        case 59 -> 200;
                        case 60 -> 57;
                        case 61 -> 250;
                        case 62 -> 207;
                        case 63 -> 249;
                        case 64 -> 98;
                        case 65 -> 224;
                        case 66 -> 160;
                        case 67 -> 213;
                        case 68 -> 177;
                        case 69 -> 59;
                        case 70 -> 31;
                        case 71 -> 165;
                        case 72 -> 89;
                        case 73 -> 95;
                        case 74 -> 114;
                        case 75 -> 227;
                        case 76 -> 241;
                        case 77 -> 211;
                        case 78 -> 113;
                        case 79 -> 123;
                        case 80 -> 229;
                        case 81 -> 75;
                        case 82 -> 13;
                        case 83 -> 117;
                        case 84 -> 7;
                        case 85 -> 67;
                        case 86 -> 74;
                        case 87 -> 55;
                        case 88 -> 189;
                        case 89 -> 105;
                        case 90 -> 152;
                        case 91 -> 231;
                        case 92 -> 147;
                        case 93 -> 51;
                        case 94 -> 175;
                        case 95 -> 27;
                        case 96 -> 58;
                        case 97 -> 91;
                        case 98 -> 125;
                        case 99 -> 205;
                        case 100 -> 208;
                        case 101 -> 230;
                        case 102 -> 73;
                        case 103 -> 65;
                        case 104 -> 53;
                        case 105 -> 4;
                        case 106 -> 217;
                        case 107 -> 206;
                        case 108 -> 38;
                        case 109 -> 182;
                        case 110 -> 8;
                        case 111 -> 81;
                        case 112 -> 144;
                        case 113 -> 242;
                        case 114 -> 170;
                        case 115 -> 151;
                        case 116 -> 96;
                        case 117 -> 76;
                        case 118 -> 184;
                        case 119 -> 131;
                        case 120 -> 246;
                        case 121 -> 17;
                        case 122 -> 228;
                        case 123 -> 50;
                        case 124 -> 127;
                        case 125 -> 245;
                        case 126 -> 186;
                        case 127 -> 121;
                        case 128 -> 240;
                        case 129 -> 129;
                        case 130 -> 236;
                        case 131 -> 161;
                        case 132 -> 106;
                        case 133 -> 56;
                        case 134 -> 34;
                        case 135 -> 136;
                        case 136 -> 18;
                        case 137 -> 90;
                        case 138 -> 192;
                        case 139 -> 16;
                        case 140 -> 22;
                        case 141 -> 5;
                        case 142 -> 198;
                        case 143 -> 220;
                        case 144 -> 78;
                        case 145 -> 84;
                        case 146 -> 244;
                        case 147 -> 48;
                        case 148 -> 168;
                        case 149 -> 10;
                        case 150 -> 214;
                        case 151 -> 247;
                        case 152 -> 77;
                        case 153 -> 85;
                        case 154 -> 252;
                        case 155 -> 109;
                        case 156 -> 176;
                        case 157 -> 45;
                        case 158 -> 47;
                        case 159 -> 122;
                        case 160 -> 21;
                        case 161 -> 134;
                        case 162 -> 142;
                        case 163 -> 232;
                        case 164 -> 11;
                        case 165 -> 163;
                        case 166 -> 20;
                        case 167 -> 49;
                        case 168 -> 108;
                        case 169 -> 80;
                        case 170 -> 68;
                        case 171 -> 111;
                        case 172 -> 154;
                        case 173 -> 139;
                        case 174 -> 235;
                        case 175 -> 133;
                        case 176 -> 72;
                        case 177 -> 135;
                        case 178 -> 19;
                        case 179 -> 145;
                        case 180 -> 158;
                        case 181 -> 102;
                        case 182 -> 180;
                        case 183 -> 169;
                        case 184 -> 36;
                        case 185 -> 162;
                        case 186 -> 35;
                        case 187 -> 15;
                        case 188 -> 199;
                        case 189 -> 137;
                        case 190 -> 166;
                        case 191 -> 12;
                        case 192 -> 188;
                        case 193 -> 197;
                        case 194 -> 115;
                        case 195 -> 112;
                        case 196 -> 140;
                        case 197 -> 210;
                        case 198 -> 215;
                        case 199 -> 239;
                        case 200 -> 255;
                        case 201 -> 86;
                        case 202 -> 88;
                        case 203 -> 1;
                        case 204 -> 251;
                        case 205 -> 238;
                        case 206 -> 60;
                        case 207 -> 116;
                        case 208 -> 32;
                        case 209 -> 104;
                        case 210 -> 23;
                        case 211 -> 190;
                        case 212 -> 99;
                        case 213 -> 69;
                        case 214 -> 254;
                        case 215 -> 71;
                        case 216 -> 118;
                        case 217 -> 44;
                        case 218 -> 148;
                        case 219 -> 43;
                        case 220 -> 92;
                        case 221 -> 194;
                        case 222 -> 103;
                        case 223 -> 100;
                        case 224 -> 183;
                        case 225 -> 223;
                        case 226 -> 234;
                        case 227 -> 222;
                        case 228 -> 204;
                        case 229 -> 9;
                        case 230 -> 33;
                        case 231 -> 24;
                        case 232 -> 164;
                        case 233 -> 159;
                        case 234 -> 128;
                        case 235 -> 25;
                        case 236 -> 179;
                        case 237 -> 26;
                        case 238 -> 30;
                        case 239 -> 174;
                        case 240 -> 233;
                        case 241 -> 29;
                        case 242 -> 171;
                        case 243 -> 28;
                        case 244 -> 143;
                        case 245 -> 195;
                        case 246 -> 2;
                        case 247 -> 46;
                        case 248 -> 14;
                        case 249 -> 225;
                        case 250 -> 101;
                        case 251 -> 216;
                        case 252 -> 120;
                        case 253 -> 141;
                        case 254 -> 124;
                        default -> 156;
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
                        char var10002x = var3[var7];
                        if (var8 == 0) {
                           var3[var7] = (char)(var10002x ^ var5);
                           var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
                        } else {
                           var3[var7] = (char)(var10002x ^ var6);
                           var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
                        }
                     }

                     b[var2] = new String(var3).intern();
                  }

                  return b[var2];
               }
            }
         ));
      var10000 = this;
      var10001 = -14235;
      var10002 = 7848;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10000),
         "Tunnel Miner route",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI,
         35000L,
         0L,
         false,
         false,
         null,
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = 27609;
                  short var10005 = -20379;
                  var10005 = 27608;
                  short var10006 = -7471;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = 27611;
                  short var10002 = -31068;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
   pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "ó<\u0013¤Î\u008b¹uU}f\u0003Ú=iT\u009a\u001ax\u009dC»\u007fËú\u0014|.\u0090¥\u0016Ö\u0011\u0016\u008eÔ\u008c¨b¢Ü\u007fE£ \u00818zÄ2ëWYìô\u001fªPiòöØ\u000e\n\u0018õyU\fa\u001fÐóÄ1\u001fIÙT\u008fT\u001a\r\u00ad¾íÇâ\u0092Û\u0099Aê¹']âECÕ]A@\u000bæÿ¡Êê²ÿ\u009daj<7íàv\u00032U\u0098A±Æ¨¥\u0005OÊÊ·â®è¯öÖ0D^½\u0094\\\u0015eê±ï\u0002ï\u0086";
                  int var4 = "ó<\u0013¤Î\u008b¹uU}f\u0003Ú=iT\u009a\u001ax\u009dC»\u007fËú\u0014|.\u0090¥\u0016Ö\u0011\u0016\u008eÔ\u008c¨b¢Ü\u007fE£ \u00818zÄ2ëWYìô\u001fªPiòöØ\u000e\n\u0018õyU\fa\u001fÐóÄ1\u001fIÙT\u008fT\u001a\r\u00ad¾íÇâ\u0092Û\u0099Aê¹']âECÕ]A@\u000bæÿ¡Êê²ÿ\u009daj<7íàv\u00032U\u0098A±Æ¨¥\u0005OÊÊ·â®è¯öÖ0D^½\u0094\\\u0015eê±ï\u0002ï\u0086"
                     .length();
                  char var1 = 22;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 54;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 54;
                           var10006 = var6;
                        } else {
                           var13 = 54;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 54;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 76;
                              case 1 -> 71;
                              case 2 -> 31;
                              case 3 -> 18;
                              case 4 -> 112;
                              case 5 -> 32;
                              default -> 43;
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
                        break pxClinit;
                     }

                     var1 = var2.charAt(var0);
                  }
               }
}

               private static String a(int var0, int var1) {
                  int var2 = (var0 ^ 27609) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 238;
                        case 1 -> 215;
                        case 2 -> 82;
                        case 3 -> 121;
                        case 4 -> 39;
                        case 5 -> 245;
                        case 6 -> 142;
                        case 7 -> 221;
                        case 8 -> 123;
                        case 9 -> 161;
                        case 10 -> 201;
                        case 11 -> 168;
                        case 12 -> 162;
                        case 13 -> 231;
                        case 14 -> 1;
                        case 15 -> 225;
                        case 16 -> 158;
                        case 17 -> 5;
                        case 18 -> 36;
                        case 19 -> 113;
                        case 20 -> 217;
                        case 21 -> 130;
                        case 22 -> 107;
                        case 23 -> 96;
                        case 24 -> 131;
                        case 25 -> 145;
                        case 26 -> 3;
                        case 27 -> 44;
                        case 28 -> 105;
                        case 29 -> 155;
                        case 30 -> 0;
                        case 31 -> 48;
                        case 32 -> 68;
                        case 33 -> 70;
                        case 34 -> 226;
                        case 35 -> 169;
                        case 36 -> 239;
                        case 37 -> 40;
                        case 38 -> 100;
                        case 39 -> 59;
                        case 40 -> 60;
                        case 41 -> 143;
                        case 42 -> 93;
                        case 43 -> 22;
                        case 44 -> 2;
                        case 45 -> 164;
                        case 46 -> 235;
                        case 47 -> 47;
                        case 48 -> 117;
                        case 49 -> 218;
                        case 50 -> 26;
                        case 51 -> 106;
                        case 52 -> 97;
                        case 53 -> 134;
                        case 54 -> 138;
                        case 55 -> 209;
                        case 56 -> 237;
                        case 57 -> 11;
                        case 58 -> 90;
                        case 59 -> 234;
                        case 60 -> 80;
                        case 61 -> 199;
                        case 62 -> 205;
                        case 63 -> 73;
                        case 64 -> 188;
                        case 65 -> 178;
                        case 66 -> 37;
                        case 67 -> 203;
                        case 68 -> 69;
                        case 69 -> 127;
                        case 70 -> 55;
                        case 71 -> 195;
                        case 72 -> 224;
                        case 73 -> 79;
                        case 74 -> 10;
                        case 75 -> 229;
                        case 76 -> 210;
                        case 77 -> 35;
                        case 78 -> 76;
                        case 79 -> 223;
                        case 80 -> 25;
                        case 81 -> 65;
                        case 82 -> 220;
                        case 83 -> 95;
                        case 84 -> 50;
                        case 85 -> 232;
                        case 86 -> 144;
                        case 87 -> 187;
                        case 88 -> 243;
                        case 89 -> 78;
                        case 90 -> 255;
                        case 91 -> 183;
                        case 92 -> 51;
                        case 93 -> 228;
                        case 94 -> 102;
                        case 95 -> 129;
                        case 96 -> 64;
                        case 97 -> 34;
                        case 98 -> 212;
                        case 99 -> 62;
                        case 100 -> 139;
                        case 101 -> 157;
                        case 102 -> 29;
                        case 103 -> 163;
                        case 104 -> 125;
                        case 105 -> 193;
                        case 106 -> 244;
                        case 107 -> 24;
                        case 108 -> 98;
                        case 109 -> 120;
                        case 110 -> 118;
                        case 111 -> 124;
                        case 112 -> 61;
                        case 113 -> 200;
                        case 114 -> 253;
                        case 115 -> 136;
                        case 116 -> 87;
                        case 117 -> 108;
                        case 118 -> 8;
                        case 119 -> 52;
                        case 120 -> 137;
                        case 121 -> 56;
                        case 122 -> 92;
                        case 123 -> 85;
                        case 124 -> 181;
                        case 125 -> 252;
                        case 126 -> 91;
                        case 127 -> 202;
                        case 128 -> 77;
                        case 129 -> 9;
                        case 130 -> 251;
                        case 131 -> 46;
                        case 132 -> 153;
                        case 133 -> 99;
                        case 134 -> 83;
                        case 135 -> 190;
                        case 136 -> 249;
                        case 137 -> 132;
                        case 138 -> 171;
                        case 139 -> 170;
                        case 140 -> 119;
                        case 141 -> 28;
                        case 142 -> 154;
                        case 143 -> 75;
                        case 144 -> 206;
                        case 145 -> 101;
                        case 146 -> 66;
                        case 147 -> 185;
                        case 148 -> 128;
                        case 149 -> 191;
                        case 150 -> 16;
                        case 151 -> 112;
                        case 152 -> 159;
                        case 153 -> 184;
                        case 154 -> 53;
                        case 155 -> 236;
                        case 156 -> 141;
                        case 157 -> 156;
                        case 158 -> 122;
                        case 159 -> 242;
                        case 160 -> 180;
                        case 161 -> 20;
                        case 162 -> 33;
                        case 163 -> 216;
                        case 164 -> 179;
                        case 165 -> 160;
                        case 166 -> 147;
                        case 167 -> 254;
                        case 168 -> 18;
                        case 169 -> 227;
                        case 170 -> 247;
                        case 171 -> 186;
                        case 172 -> 246;
                        case 173 -> 151;
                        case 174 -> 94;
                        case 175 -> 198;
                        case 176 -> 167;
                        case 177 -> 248;
                        case 178 -> 110;
                        case 179 -> 104;
                        case 180 -> 208;
                        case 181 -> 135;
                        case 182 -> 166;
                        case 183 -> 89;
                        case 184 -> 88;
                        case 185 -> 19;
                        case 186 -> 6;
                        case 187 -> 149;
                        case 188 -> 196;
                        case 189 -> 115;
                        case 190 -> 30;
                        case 191 -> 54;
                        case 192 -> 116;
                        case 193 -> 173;
                        case 194 -> 13;
                        case 195 -> 192;
                        case 196 -> 42;
                        case 197 -> 31;
                        case 198 -> 43;
                        case 199 -> 172;
                        case 200 -> 133;
                        case 201 -> 45;
                        case 202 -> 114;
                        case 203 -> 222;
                        case 204 -> 109;
                        case 205 -> 86;
                        case 206 -> 49;
                        case 207 -> 12;
                        case 208 -> 126;
                        case 209 -> 67;
                        case 210 -> 57;
                        case 211 -> 194;
                        case 212 -> 72;
                        case 213 -> 41;
                        case 214 -> 140;
                        case 215 -> 81;
                        case 216 -> 23;
                        case 217 -> 146;
                        case 218 -> 165;
                        case 219 -> 14;
                        case 220 -> 204;
                        case 221 -> 213;
                        case 222 -> 148;
                        case 223 -> 174;
                        case 224 -> 241;
                        case 225 -> 21;
                        case 226 -> 197;
                        case 227 -> 71;
                        case 228 -> 152;
                        case 229 -> 7;
                        case 230 -> 177;
                        case 231 -> 84;
                        case 232 -> 189;
                        case 233 -> 15;
                        case 234 -> 38;
                        case 235 -> 214;
                        case 236 -> 250;
                        case 237 -> 230;
                        case 238 -> 240;
                        case 239 -> 27;
                        case 240 -> 211;
                        case 241 -> 111;
                        case 242 -> 175;
                        case 243 -> 176;
                        case 244 -> 103;
                        case 245 -> 150;
                        case 246 -> 74;
                        case 247 -> 4;
                        case 248 -> 32;
                        case 249 -> 182;
                        case 250 -> 233;
                        case 251 -> 63;
                        case 252 -> 207;
                        case 253 -> 219;
                        case 254 -> 17;
                        default -> 58;
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
         ));
      var10000 = this;
      var10001 = -14222;
      var10002 = -11557;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10000,
         "Tunnel Miner mined progress",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         30000L,
         0L,
         null,
         false,
         false,
         (kotlin.jvm.functions.Function1)(llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI::d),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = -27836;
                  short var10005 = 31640;
                  var10005 = -27834;
                  short var10006 = -13289;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = -27835;
                  short var10002 = 6606;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
   pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "\u0015LÑV\u008aZ¢EMe\u0099\u001cªMm!\u0004H·X)\t\u0002G¯\u007f¯\u0010\u0086Ý`+ÿkæ ì¤\u0004Z¸Ã¾\u0014àÓÃxö=hxÿïä¢\u0084w\u000eUá\u009c¿V\u008d\u0006/\u008a[P\u009eÕ\u0004«ïoX¼pä»rÉëÌ\u0006kP¦\u0010ðve\u0019\u0019i¸,c\u007f\u009e\u007f=Ð'ï;\u000fv\u000fñDËÖ®Ë\u009fcò\u0018¤Ô\u0004õ¿\u001b\u0002=²¶¸Ì\u0097í-O\u0091\"\u008cEdw~ÿ\u0004À¤íïO:gÿ";
                  int var4 = "\u0015LÑV\u008aZ¢EMe\u0099\u001cªMm!\u0004H·X)\t\u0002G¯\u007f¯\u0010\u0086Ý`+ÿkæ ì¤\u0004Z¸Ã¾\u0014àÓÃxö=hxÿïä¢\u0084w\u000eUá\u009c¿V\u008d\u0006/\u008a[P\u009eÕ\u0004«ïoX¼pä»rÉëÌ\u0006kP¦\u0010ðve\u0019\u0019i¸,c\u007f\u009e\u007f=Ð'ï;\u000fv\u000fñDËÖ®Ë\u009fcò\u0018¤Ô\u0004õ¿\u001b\u0002=²¶¸Ì\u0097í-O\u0091\"\u008cEdw~ÿ\u0004À¤íïO:gÿ"
                     .length();
                  char var1 = 22;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 39;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 39;
                           var10006 = var6;
                        } else {
                           var13 = 39;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 39;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 127;
                              case 1 -> 2;
                              case 2 -> 84;
                              case 3 -> 117;
                              case 4 -> 54;
                              case 5 -> 112;
                              default -> 67;
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
                        break pxClinit;
                     }

                     var1 = var2.charAt(var0);
                  }
               }
}

               private static String a(int var0, int var1) {
                  int var2 = (var0 ^ -27836) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 76;
                        case 1 -> 201;
                        case 2 -> 101;
                        case 3 -> 153;
                        case 4 -> 149;
                        case 5 -> 131;
                        case 6 -> 188;
                        case 7 -> 28;
                        case 8 -> 233;
                        case 9 -> 234;
                        case 10 -> 22;
                        case 11 -> 247;
                        case 12 -> 166;
                        case 13 -> 128;
                        case 14 -> 85;
                        case 15 -> 91;
                        case 16 -> 214;
                        case 17 -> 116;
                        case 18 -> 255;
                        case 19 -> 53;
                        case 20 -> 71;
                        case 21 -> 174;
                        case 22 -> 159;
                        case 23 -> 49;
                        case 24 -> 168;
                        case 25 -> 124;
                        case 26 -> 67;
                        case 27 -> 129;
                        case 28 -> 108;
                        case 29 -> 46;
                        case 30 -> 180;
                        case 31 -> 95;
                        case 32 -> 191;
                        case 33 -> 148;
                        case 34 -> 66;
                        case 35 -> 125;
                        case 36 -> 160;
                        case 37 -> 199;
                        case 38 -> 30;
                        case 39 -> 9;
                        case 40 -> 47;
                        case 41 -> 84;
                        case 42 -> 27;
                        case 43 -> 104;
                        case 44 -> 68;
                        case 45 -> 80;
                        case 46 -> 98;
                        case 47 -> 132;
                        case 48 -> 25;
                        case 49 -> 239;
                        case 50 -> 194;
                        case 51 -> 123;
                        case 52 -> 147;
                        case 53 -> 5;
                        case 54 -> 16;
                        case 55 -> 14;
                        case 56 -> 105;
                        case 57 -> 181;
                        case 58 -> 246;
                        case 59 -> 77;
                        case 60 -> 220;
                        case 61 -> 113;
                        case 62 -> 100;
                        case 63 -> 162;
                        case 64 -> 109;
                        case 65 -> 218;
                        case 66 -> 103;
                        case 67 -> 39;
                        case 68 -> 225;
                        case 69 -> 82;
                        case 70 -> 151;
                        case 71 -> 210;
                        case 72 -> 212;
                        case 73 -> 221;
                        case 74 -> 92;
                        case 75 -> 2;
                        case 76 -> 156;
                        case 77 -> 115;
                        case 78 -> 219;
                        case 79 -> 107;
                        case 80 -> 102;
                        case 81 -> 60;
                        case 82 -> 83;
                        case 83 -> 34;
                        case 84 -> 121;
                        case 85 -> 226;
                        case 86 -> 204;
                        case 87 -> 127;
                        case 88 -> 206;
                        case 89 -> 43;
                        case 90 -> 237;
                        case 91 -> 79;
                        case 92 -> 114;
                        case 93 -> 203;
                        case 94 -> 40;
                        case 95 -> 164;
                        case 96 -> 208;
                        case 97 -> 42;
                        case 98 -> 167;
                        case 99 -> 90;
                        case 100 -> 170;
                        case 101 -> 44;
                        case 102 -> 135;
                        case 103 -> 61;
                        case 104 -> 15;
                        case 105 -> 161;
                        case 106 -> 227;
                        case 107 -> 169;
                        case 108 -> 195;
                        case 109 -> 251;
                        case 110 -> 176;
                        case 111 -> 23;
                        case 112 -> 99;
                        case 113 -> 93;
                        case 114 -> 157;
                        case 115 -> 215;
                        case 116 -> 89;
                        case 117 -> 193;
                        case 118 -> 152;
                        case 119 -> 41;
                        case 120 -> 179;
                        case 121 -> 110;
                        case 122 -> 229;
                        case 123 -> 13;
                        case 124 -> 88;
                        case 125 -> 241;
                        case 126 -> 70;
                        case 127 -> 207;
                        case 128 -> 205;
                        case 129 -> 111;
                        case 130 -> 58;
                        case 131 -> 130;
                        case 132 -> 230;
                        case 133 -> 196;
                        case 134 -> 224;
                        case 135 -> 252;
                        case 136 -> 6;
                        case 137 -> 38;
                        case 138 -> 36;
                        case 139 -> 213;
                        case 140 -> 216;
                        case 141 -> 126;
                        case 142 -> 48;
                        case 143 -> 118;
                        case 144 -> 244;
                        case 145 -> 33;
                        case 146 -> 133;
                        case 147 -> 154;
                        case 148 -> 137;
                        case 149 -> 150;
                        case 150 -> 209;
                        case 151 -> 8;
                        case 152 -> 165;
                        case 153 -> 50;
                        case 154 -> 94;
                        case 155 -> 86;
                        case 156 -> 62;
                        case 157 -> 155;
                        case 158 -> 72;
                        case 159 -> 163;
                        case 160 -> 175;
                        case 161 -> 145;
                        case 162 -> 64;
                        case 163 -> 35;
                        case 164 -> 178;
                        case 165 -> 182;
                        case 166 -> 254;
                        case 167 -> 197;
                        case 168 -> 63;
                        case 169 -> 245;
                        case 170 -> 65;
                        case 171 -> 235;
                        case 172 -> 7;
                        case 173 -> 78;
                        case 174 -> 139;
                        case 175 -> 200;
                        case 176 -> 31;
                        case 177 -> 171;
                        case 178 -> 222;
                        case 179 -> 0;
                        case 180 -> 240;
                        case 181 -> 232;
                        case 182 -> 10;
                        case 183 -> 119;
                        case 184 -> 55;
                        case 185 -> 190;
                        case 186 -> 238;
                        case 187 -> 242;
                        case 188 -> 75;
                        case 189 -> 112;
                        case 190 -> 250;
                        case 191 -> 122;
                        case 192 -> 19;
                        case 193 -> 29;
                        case 194 -> 185;
                        case 195 -> 140;
                        case 196 -> 56;
                        case 197 -> 69;
                        case 198 -> 32;
                        case 199 -> 217;
                        case 200 -> 12;
                        case 201 -> 211;
                        case 202 -> 106;
                        case 203 -> 20;
                        case 204 -> 117;
                        case 205 -> 172;
                        case 206 -> 173;
                        case 207 -> 144;
                        case 208 -> 87;
                        case 209 -> 74;
                        case 210 -> 17;
                        case 211 -> 45;
                        case 212 -> 198;
                        case 213 -> 143;
                        case 214 -> 52;
                        case 215 -> 138;
                        case 216 -> 248;
                        case 217 -> 192;
                        case 218 -> 1;
                        case 219 -> 51;
                        case 220 -> 26;
                        case 221 -> 158;
                        case 222 -> 228;
                        case 223 -> 37;
                        case 224 -> 243;
                        case 225 -> 134;
                        case 226 -> 223;
                        case 227 -> 57;
                        case 228 -> 231;
                        case 229 -> 186;
                        case 230 -> 97;
                        case 231 -> 81;
                        case 232 -> 54;
                        case 233 -> 141;
                        case 234 -> 189;
                        case 235 -> 24;
                        case 236 -> 3;
                        case 237 -> 96;
                        case 238 -> 249;
                        case 239 -> 4;
                        case 240 -> 136;
                        case 241 -> 21;
                        case 242 -> 177;
                        case 243 -> 202;
                        case 244 -> 18;
                        case 245 -> 184;
                        case 246 -> 187;
                        case 247 -> 120;
                        case 248 -> 183;
                        case 249 -> 236;
                        case 250 -> 59;
                        case 251 -> 253;
                        case 252 -> 11;
                        case 253 -> 146;
                        case 254 -> 73;
                        default -> 142;
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
         ));
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Override
   public void aC() { Vec3 var9 = null; // PX-FIX hoist
        
      Object var88 = null; // PX-FIX
      Object var86 = null; // PX-FIX
      Object var85 = null; // PX-FIX
      Object var79 = null; // PX-FIX
      Object var70 = null; // PX-FIX
      Iterator var69 = null; // PX-FIX
      Object var66 = null; // PX-FIX
      IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var65 = null; // PX-FIX
      Object var59 = null; // PX-FIX
      Object var50 = null; // PX-FIX
      Object var10000 = null; // PX-FIX
      Object IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll = null; // PX-FIX
      int var1;
      int var49;
      label491: {
         label490: {
            label494: {
               label488: {
                  PolinexGlaciteTunnelEtherwarpCompatibility.markActive("Tunnel Miner");
                  var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
                  var10000 = this.W();
                  IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var10001 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
                  if (var1 == 0) {
                     if (var10000
                        == IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
                        )
                      {
                        break label488;
                     }

                     var10000 = this.W();
                     if (var1 != 0) {
                        break label490;
                     }

                     var10001 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
                  }

                  if (var10000 != var10001) {
                     break label494;
                  }
               }

               var49 = IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .g();
               if (var1 != 0) {
                  break label491;
               }

               if (var49
                  >= IllIIIIllllIIllIlIIlIlIlIIlIIIIlllIIllIlIllIllllIIllIIllllllIIllIIllIIlIIllIlIIIIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .e()
                     .O()) {
                  this.a(
                     IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl,
                     2000
                  );
               }
            }

            var10000 = this.W();
         }

         var49 = ((int[])llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl)[((me.octo.client.PXDyn)var10000).ordinal()];
      }

      label555: {
         label496: {
            label556: {
               label498: {
                  label499: {
                     if (var1 == 0) {
                        switch (var49) {
                           case 1:
                              var49 = ((this.aK()) ? 1 : 0);
                              break;
                           case 2:
                              break label499;
                           case 3:
                              break label498;
                           default:
                              return;
                        }
                     }

                     label500: {
                        if (var1 == 0) {
                           if (var49 == 0) {
                              return;
                           }

                           var50 = this;
                           if (var1 != 0) {
                              break label500;
                           }

                           var49 = ((int[])llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)[this.aJ()
                              .a()
                              .ordinal()];
                        }

                        if (var49 != 1) {
                           return;
                        }

                        var50 = this;
                     }

                     lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a(
                        (lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll)var50, 0.0, 1, null
                     );
                     if (var1 == 0) {
                        return;
                     }
                  }

                  Object var51 = this;
                  if (var1 == 0) {
                     if (this.a9() == this.ac().size()) {
                        this.a(
                           IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl,
                           2000
                        );
                        return;
                     }

                     var51 = this.ac().get(this.a9());
                     short var10002 = -14234;
                     short var10003 = -1586;
                     Intrinsics.checkNotNullExpressionValue(var51, "get(...)");
                  }

                  label524: {
                     label503: {
                        IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var2;
                        label504: {
                           var2 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var51;
                           var49 = ((int[])llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII)[var2.b()
                              .ordinal()];
                           if (var1 == 0) {
                              switch (var49) {
                                 case 1:
                                    var49 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a(
                                       this, var2, 3.0, null);
                                    break;
                                 case 2:
                                    break label504;
                                 case 3:
                                    me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var5 = this.a8();
                                    var49 = ((IllIIIIllllIIllIlIIlIlIlIIlIIIIlllIIllIlIllIllllIIllIIllllllIIllIIllIIlIIllIlIIIIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                       .b()
                                       .al()) ? 1 : 0);
                                    if (var1 != 0) {
                                       break label556;
                                    }

                                    if (var49 == 0) {
                                       var49 = ((IllIIIIllllIIllIlIIlIlIlIIlIIIIlllIIllIlIllIllllIIllIIllllllIIllIIllIIlIIllIlIIIIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                          .b()
                                          .al()) ? 1 : 0);
                                       break label556;
                                    }

                                    if (var5 == null) {
                                       var49 = ((IllIIIIllllIIllIlIIlIlIlIIlIIIIlllIIllIlIllIllllIIllIIllllllIIllIIllIIlIIllIlIIIIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                          .b()
                                          .al()) ? 1 : 0);
                                       break label556;
                                    }

                                    var49 = ((this.b(var2.a())) ? 1 : 0);
                                    if (var1 != 0) {
                                       break label555;
                                    }

                                    if (var49 != 0) {
                                       IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                          .e()
                                          .k();
                                       var49 = this.a9();
                                       break label555;
                                    }

                                    Vec3 var6 = lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                       .g(var2.a());
                                    double var103;
                                    var49 = (
                                             var103 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                                   .b(var6, true)
                                                - 4.5
                                          )
                                          == 0.0
                                       ? 0
                                       : (var103 < 0.0 ? -1 : 1);
                                    if (var1 == 0) {
                                       if (var49 < 0) {
                                          IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                             .e()
                                             .k();
                                          llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                             .p();
                                          IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll var56 = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                                          if (var1 == 0) {
                                             if (IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                                   .K()
                                                != var5.b()) {
                                                IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                                   .b(var5.b());
                                                return;
                                             }

                                             IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a(var6);
                                             var56 = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                                          }

                                          BlockHitResult var7 = var56.I();
                                          BlockHitResult var57 = var7;
                                          if (var1 == 0) {
                                             if (var7 == null) {
                                                return;
                                             }

                                             var57 = var7;
                                          }

                                          var49 = ((Intrinsics.areEqual(var57.getBlockPos(), var2.a())) ? 1 : 0);
                                          if (var1 == 0) {
                                             if (var49 == 0) {
                                                return;
                                             }

                                             var49 = ((me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                                .j()) ? 1 : 0);
                                          }

                                          if (var1 == 0) {
                                             if (var49 == 0) {
                                                return;
                                             }

                                             IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                                .g();
                                             var49 = this.a9();
                                          }

                                          int var8 = var49;
                                          this.a(var8 + 1);
                                          if (var1 == 0) {
                                             return;
                                          }
                                       }

                                       var49 = ((IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                          .e()
                                          .d()) ? 1 : 0);
                                    }

                                    if (var49 == 0) {
                                       return;
                                    }

                                    var59 = this;
                                    if (var1 != 0) {
                                       break label496;
                                    }

                                    BlockPos var60 = this.c(var2.a());
                                    if (var60 == null) {
                                       var59 = this;
                                       break label496;
                                    }

                                    BlockPos var32 = var60;
                                    IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                                       ((BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                          .e())),
                                       ((IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll)(Object)(var32)),
                                       var6,
                                       false);
                                    if (var1 == 0) {
                                       return;
                                    }
                                 case 4:
                                 case 5:
                                    break label503;
                                 default:
                                    break label524;
                              }
                           }

                           if (var1 == 0) {
                              if (var49 != 0) {
                                 int var24 = this.a9();
                                 this.a(var24 + 1);
                                 IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                    .e()
                                    .k();
                                 if (var1 == 0) {
                                    return;
                                 }
                              }

                              var49 = ((IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                 .e()
                                 .d()) ? 1 : 0);
                           }

                           if (var49 == 0) {
                              return;
                           }

                           BlockPos var61 = this.c(var2.a());
                           if (var61 == null) {
                              return;
                           }

                           BlockPos var25;
                           label436: {
                              var25 = var61;
                              var49 = this.a9();
                              int var90 = CollectionsKt.getLastIndex(this.ac());
                              if (var1 == 0) {
                                 if (var49 == var90) {
                                    var49 = 0;
                                    break label436;
                                 }

                                 var49 = this.a9();
                                 var90 = 1;
                              }

                              var49 += var90;
                           }

                           label505: {
                              IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var33;
                              int var28 = var49;
                              Object var64 = this.ac().get(var28);
                              short var94 = -14219;
                              short var98 = 11178;
                              Intrinsics.checkNotNullExpressionValue(var64, "get(...)");
                              var33 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var64;
                              var65 = var33;
                              label429:
                              if (var1 == 0) {
                                 if (var33.b()
                                    != IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                                    )
                                  {
                                    var65 = var33;
                                    if (var1 != 0) {
                                       break label429;
                                    }

                                    if (var33.b()
                                       != IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                       )
                                     {
                                       var66 = null;
                                       break label505;
                                    }
                                 }

                                 var65 = var2;
                              }

                              Vec3 var67 = var65.d().add(0.0, 1.27, 0.0);
                              var94 = -14231;
                              var98 = 12027;
                              Intrinsics.checkNotNullExpressionValue(var67, "add(...)");
                               var9 = var67;
                              Iterable var10 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                                 .e()
                                 .g(var33.a());
                              boolean var11 = false;
                              var var13 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var10, 10));
                              boolean var14 = false;
                              Iterator var16 = var10.iterator();

                              while (true) {
                                 if (var16.hasNext()) {
                                    Object var17 = var16.next();
                                    BlockPos var19 = (BlockPos)var17;
                                    boolean var20 = false;
                                    var13.add(var19.getCenter());
                                    if (var1 != 0) {
                                       break;
                                    }

                                    if (var1 == 0) {
                                       continue;
                                    }
                                 }

                                 var10 = (Iterable & List)var13;
                                 var11 = false;
                                 break;
                              }

                              label506: {
                                 Iterator var12;
                                 label507: {
                                    var12 = var10.iterator();
                                    boolean var68 = var12.hasNext();
                                    if (var1 == 0) {
                                       if (!var68) {
                                          var70 = null;
                                          break label506;
                                       }

                                       var13 = ((ArrayList)(var12.next()));
                                       var69 = var12;
                                       if (var1 != 0) {
                                          break label507;
                                       }

                                       var68 = var12.hasNext();
                                    }

                                    if (!var68) {
                                       var70 = var13;
                                       break label506;
                                    }

                                    var69 = ((Iterator)(Object)(var13));
                                 }

                                 Vec3 var42 = (Vec3)var69;
                                 boolean var44 = false;
                                 IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var71 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                                 Intrinsics.checkNotNull(var42);
                                 double var43 = var71.b(var9, var42);

                                 label400:
                                 while (true) {
                                    Object var45 = var12.next();
                                    Vec3 var46 = (Vec3)var45;
                                    boolean var48 = false;
                                    IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var72 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                                    Intrinsics.checkNotNull(var46);
                                    double var47 = var72.b(var9, var46);
                                    if (Double.compare(var43, var47) > 0) {
                                       var13 =((ArrayList)( var45));
                                       var43 = var47;
                                    }

                                    while (!var12.hasNext()) {
                                       if (var1 == 0) {
                                          var70 = var13;
                                          break label400;
                                       }

                                       var43 = var47;
                                    }
                                 }
                              }

                              var66 = (Vec3)var70;
                           }

                           Vec3 var36 =((Vec3)( var66));
                           IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                              ((BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                 .e())),
                              ((IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll)(Object)(var25)),
                              var36,
                              false);
                           if (var1 == 0) {
                              return;
                           }
                        }

                        var49 = (llIlIlIIlIIlIlIllIIIIIIIIlIIIIlIIlIIllllllIIIllIIllllIlIlllIIIIllIIIIlllllIlIIllllIIl.a(
                           IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                              .f(),
                           var2.a(),
                           null,
                           2,
                           null
                        ) ? 1 : 0);
                        if (var1 == 0) {
                           if (var49 == 0) {
                              return;
                           }

                           var49 = this.a9();
                        }

                        int var26 = var49;
                        this.a(var26 + 1);
                        if (var1 == 0) {
                           return;
                        }

                        me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var27 = this.a8();
                        var49 = ((IllIIIIllllIIllIlIIlIlIlIIlIIIIlllIIllIlIllIllllIIllIIllllllIIllIIllIIlIIllIlIIIIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .b()
                           .al()) ? 1 : 0);
                        if (var1 != 0) {
                           break label556;
                        }

                        if (var49 == 0) {
                           var49 = ((IllIIIIllllIIllIlIIlIlIlIIlIIIIlllIIllIlIllIllllIIllIIllllllIIllIIllIIlIIllIlIIIIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .b()
                              .al()) ? 1 : 0);
                           break label556;
                        }

                        if (var27 == null) {
                           var49 = ((IllIIIIllllIIllIlIIlIlIlIIlIIIIlllIIllIlIllIllllIIllIIllllllIIllIIllIIlIIllIlIIIIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .b()
                              .al()) ? 1 : 0);
                           break label556;
                        }

                        var49 = ((this.b(var2.a())) ? 1 : 0);
                        if (var1 != 0) {
                           break label555;
                        }

                        if (var49 != 0) {
                           IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                              .e()
                              .k();
                           var49 = this.a9();
                           break label555;
                        }

                        Vec3 var29 = lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .g(var2.a());
                        double var102;
                        var49 = (
                                 var102 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                       .b(var29, true)
                                    - 4.5
                              )
                              == 0.0
                           ? 0
                           : (var102 < 0.0 ? -1 : 1);
                        if (var1 == 0) {
                           if (var49 < 0) {
                              IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                 .e()
                                 .k();
                              llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .p();
                              IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll var75 = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                              if (var1 == 0) {
                                 if (IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                       .K()
                                    != var27.b()) {
                                    IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                       .b(var27.b());
                                    return;
                                 }

                                 IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a(var29);
                                 var75 = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                              }

                              BlockHitResult var34 = var75.I();
                              BlockHitResult var76 = var34;
                              if (var1 == 0) {
                                 if (var34 == null) {
                                    return;
                                 }

                                 var76 = var34;
                              }

                              var49 = ((Intrinsics.areEqual(var76.getBlockPos(), var2.a())) ? 1 : 0);
                              if (var1 == 0) {
                                 if (var49 == 0) {
                                    return;
                                 }

                                 var49 = ((me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                    .j()) ? 1 : 0);
                              }

                              if (var1 == 0) {
                                 if (var49 == 0) {
                                    return;
                                 }

                                 IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                    .g();
                                 var49 = this.a9();
                              }

                              int var37 = var49;
                              this.a(var37 + 1);
                              if (var1 == 0) {
                                 return;
                              }
                           }

                           var49 = ((IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                              .e()
                              .d()) ? 1 : 0);
                        }

                        if (var49 == 0) {
                           return;
                        }

                        var59 = this;
                        if (var1 != 0) {
                           break label496;
                        }

                        BlockPos var78 = this.c(var2.a());
                        if (var78 == null) {
                           var59 = this;
                           break label496;
                        }

                        BlockPos var35 = var78;
                        IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                           ((BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                              .e())),
                           ((IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll)(Object)(var35)),
                           var29,
                           false);
                        if (var1 == 0) {
                           return;
                        }
                     }

                     this.bp();
                  }

                  if (var1 == 0) {
                     return;
                  }
               }

               var79 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                  .e()
                  .b();
               label258:
               if (var1 == 0) {
                  if (!((Boolean)var79)) {
                     var79 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                        .a()
                        .b();
                     if (var1 != 0) {
                        break label258;
                     }

                     if (!((Boolean)var79)) {
                        label513: {
                           Object var80 = this.ac().get(this.a9());
                           short var96 = -14219;
                           short var100 = 11178;
                           Intrinsics.checkNotNullExpressionValue(var80, "get(...)");
                           IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var22 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var80;
                           BlockPos var3 = var22.a();
                           llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI var81 = this;
                           if (var1 == 0) {
                              if (this.a(var3)) {
                                 short var82 = -14220;
                                 short var91 = 18749;
                                 me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                                    "Mithril vein"
                                 );
                                 this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = 1;
                                 lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                                    .a()
                                    .c(
                                       IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                          .t()
                                    );
                                 if (var1 == 0) {
                                    break label513;
                                 }
                              }

                              var81 = this;
                           }

                           ArrayList var4;
                           label250: {
                              var4 = var81.a(var22.b());
                              this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = var4.size();
                              if (var1 == 0) {
                                 if (var22.b()
                                    != IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                    )
                                  {
                                    break label250;
                                 }

                                 lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                                    .e()
                                    .e(var4);
                              }

                              if (var1 == 0) {
                                 break label513;
                              }
                           }

                           lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                              .e()
                              .f(var4);
                        }

                        short var83 = ((short)((IllIIIIllllIIllIlIIlIlIlIIlIIIIlllIIllIlIllIllllIIllIIllllllIIllIIllIIlIIllIlIIIIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .h()
                           .ae()) ? 1 : 0));
                        if (var1 == 0) {
                           if ((var83 == 0)) {
                              return;
                           }

                           var83 = ((short)((this.bs()) ? 1 : 0));
                        }

                        if (var1 == 0) {
                           if ((var83 == 0)) {
                              return;
                           }

                           var83 = -14217;
                           short var92 = -16368;
                           me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                              "§eFound player near mine waypoint! Skipping..."
                           );
                           var83 = ((short)((lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                              .a()
                              .b()) ? 1 : 0));
                        }

                        label235: {
                           label514: {
                              if (var1 == 0) {
                                 if ((var83 != 0)) {
                                    lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                                       .a()
                                       .j(false);
                                 }

                                 var85 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                                    .e();
                                 if (var1 != 0) {
                                    break label514;
                                 }

                                 var83 = ((me.octo.client.PXDyn)var85).b();
                              }

                              if ((var83 == 0)) {
                                 break label235;
                              }

                              var85 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                                 .e();
                           }

                           ((me.octo.client.PXDyn)var85).j(false);
                        }

                        this.a(this.a9() + this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl);
                        this.a(
                           IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
                        );
                        if (var1 == 0) {
                           return;
                        }
                     }
                  }

                  var79 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                     .e()
                     .b();
               }

               label215: {
                  label516: {
                     if (var1 == 0) {
                        if (((Boolean)(var79))) {
                           var86 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                              .e();
                           if (var1 != 0) {
                              break label215;
                           }

                           if (((IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII)var86).c()) {
                              break label516;
                           }
                        }

                        var79 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                           .a()
                           .b();
                     }

                     if (var1 == 0) {
                        if (!((Boolean)var79)) {
                           return;
                        }

                        var86 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                           .a();
                        if (var1 != 0) {
                           break label215;
                        }

                        var79 = ((me.octo.client.PXDyn)var86).c();
                     }

                     if (!((Boolean)var79)) {
                        return;
                     }
                  }

                  this.a(this.a9() + this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl);
                  this.a(
                     IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
                  );
                  var86 = this.ac().get(Math.min(CollectionsKt.getLastIndex(this.ac()), this.a9()));
                  short var97 = -14219;
                  short var101 = 11178;
                  Intrinsics.checkNotNullExpressionValue(var86, "get(...)");
               }

               IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var23;
               label518: {
                  var23 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var86;
                  boolean var87 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                     .a()
                     .b();
                  if (var1 == 0) {
                     if (var87) {
                        lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                           .a()
                           .j(
                              var23.b()
                                 != IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                           );
                     }

                     var88 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                        .e();
                     if (var1 != 0) {
                        break label518;
                     }

                     var87 = ((me.octo.client.PXDyn)var88).b();
                  }

                  if (!var87) {
                     return;
                  }

                  var88 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                     .e();
               }

               ((me.octo.client.PXDyn)var88).j(
                  var23.b()
                     != IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
               );
               return;
            }

            if (var1 == 0) {
               if (var49 != 0) {
                  short var89 = -14237;
                  short var93 = 5887;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                     "No lantern found in your hotbar!"
                  );
               }

               IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                  .e()
                  .k();
               var49 = this.a9();
            }

            int var31 = var49;
            this.a(var31 + 1);
            return;
         }

         llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI var38 =((llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI)( var59));
         boolean var40 = false;
         int var41 = var38.a9();
         var38.a(var41 + 1);
         return;
      }

      int var30 = var49;
      this.a(var30 + 1);
   }

   private final boolean a(BlockPos var1) {
      int var2 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      boolean var10000 = IllIIIIllllIIllIlIIlIlIlIIlIIIIlllIIllIlIllIllllIIllIIllllllIIllIIllIIlIIllIlIIIIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .f()
         .e(4);
      if (var2 != 0) {
         if (var10000) {
            ClientLevel var4 = this.ap().level;
            if (var4 == null) {
               return false;
            }

            ClientLevel var3 = var4;
            IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl var5 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            BlockState var10001 = var3.getBlockState(var1);
            short var10003 = -14213;
            short var10004 = 26231;
            Intrinsics.checkNotNullExpressionValue(var10001, "getBlockState(...)");
            return var5.p(var10001);
         }

         var10000 = false;
      }

      return var10000;
   }

   private final boolean b(BlockPos var1) { AABB var9 = null; // PX-FIX hoist
        
      int var2 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      if (var2 != 0) {
         ClientLevel var10000 = this.ap().level;
         if (var10000 != null) {
            ClientLevel var3 = var10000;
             var9 = AABB.ofSize(var1.getCenter(), 10.0, 10.0, 10.0);
            short var10002 = -14221;
            short var10003 = 28879;
            Intrinsics.checkNotNullExpressionValue(var9, "ofSize(...)");
            AABB var4 = var9;
            List var10 = var3.getEntitiesOfClass(
               ArmorStand.class, var4, llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI::a
            );
            var10002 = -14216;
            var10003 = 1291;
            Intrinsics.checkNotNullExpressionValue(var10, "getEntitiesOfClass(...)");

            label28:
            for (Object var11 : var10) {
               var10002 = -14240;
               var10003 = 32207;
               Intrinsics.checkNotNullExpressionValue(var11, "next(...)");
               ArmorStand var7 = (ArmorStand)var11;
               String var12 = var7.getName().getString();
               var10002 = -14229;
               var10003 = 5032;
               Intrinsics.checkNotNullExpressionValue(var12, "getString(...)");
               String var8 = var12;
               CharSequence var13 = var8;
               short var10001 = -14214;
               var10002 = 20204;
               boolean var14 = StringsKt.contains(var13, "Lantern", false);

               while (var2 != 0) {
                  if (!var14) {
                     CharSequence var15 = var8;
                     var10001 = -14209;
                     var10002 = -32550;
                     if (!StringsKt.contains(var15, "Will-o'-wisp", false)) {
                        continue label28;
                     }
                  }

                  var14 = true;
                  if (var2 != 0) {
                     return true;
                  }
               }

               return var14;
            }

            return false;
         }
      }

      return false;
   }

   private final BlockPos c(BlockPos var1) {
      int var2 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      if (var2 != 0) {
         ClientLevel var10000 = this.ap().level;
         if (var10000 != null) {
            ClientLevel var3 = var10000;
            int var4 = -2;

            while (var4 < 3) {
               BlockPos var6 = var1.offset(0, var4, 0);
               short var10002 = -14233;
               short var10003 = -8607;
               Intrinsics.checkNotNullExpressionValue(var6, "offset(...)");
               BlockPos var5 = var6;
               if (var2 != 0) {
                  if (a(var3, var5)) {
                     return var5;
                  }

                  var4++;
               }

               if (var2 == 0) {
                  break;
               }
            }

            return null;
         }
      }

      return null;
   }

   private final ArrayList<BlockPos> a(IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var1) {
       ArrayList<BlockPos> var9 = null; // PX-FIX decl var9
      int var10000 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      BlockPos[] var4 = new BlockPos[]{this.ac().get(this.a9()).a()};
      int var2 = var10000;
      ArrayList var3 = CollectionsKt.arrayListOf(var4);
      if (var2 == 0) {
         IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var8 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
            .e()
            .f(this.ac().get(this.a9()).a());
         if (var8 != null) {
            IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var7 = var8;
            int var5 = this.a9() + 1;

            while (true) {
               if (var5 < this.ac().size()) {
                  var9 = ((ArrayList<BlockPos>)(Object)(this.ac()));
                  if (var2 != 0 || var2 != 0) {
                     break;
                  }

                  Object var10 = var9.get(var5);
                  short var10002 = -14219;
                  short var10003 = 11178;
                  Intrinsics.checkNotNullExpressionValue(var10, "get(...)");
                  IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var6 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var10;
                  if (var6.b() == var1
                     && !this.a(var6.a())
                     && lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                           .e()
                           .f(var6.a())
                        == var7) {
                     var3.add(var6.a());
                     var5++;
                     if (var2 == 0) {
                        continue;
                     }
                  }
               }

               var9 = var3;
               break;
            }

            return var9;
         }
      }

      return var3;
   }

   private final void bp() {
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
      );
      int var10000 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
         .e()
         .V()
         .clear();
      int var1 = var10000;
      lIlIlIlIlllIlIlIllIIIllIIIllIIlIlIlIllllIIlIlIIIIIIIIlIIlIlIlIllllllIllllIIIlIIIIIlII var2 = IllIIIIllllIIllIlIIlIlIlIIlIIIIlllIIllIlIllIllllIIllIIllllllIIllIIllIIlIIllIlIIIIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .f();
      boolean var3 = IllIIIIllllIIllIlIIlIlIlIIlIIIIlllIIllIlIllIllllIIllIIllllllIIllIIllIIlIIllIlIIIIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a()
         .ae();
      if (var1 == 0) {
         if (var3) {
            lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
               .e()
               .c(true);
         }

         var3 = var2.e(0);
      }

      if (var1 == 0) {
         if (var3) {
            lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
               .e()
               .V()
               .add(
                  IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               );
         }

         var3 = var2.e(1);
      }

      if (var1 == 0) {
         if (var3) {
            lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
               .e()
               .V()
               .add(
                  IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               );
         }

         var3 = var2.e(2);
      }

      if (var1 == 0) {
         if (var3) {
            lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
               .e()
               .V()
               .add(
                  IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
               );
         }

         var3 = var2.e(3);
      }

      if (var1 == 0 && var3) {
         lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
            .e()
            .V()
            .add(
               IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            );
      }

      lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
         .e()
         .k(
            IllIIIIllllIIllIlIIlIlIlIIlIIIIlllIIllIlIllIllllIIllIIllllllIIllIIllIIlIIllIlIIIIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .g()
               .al()
         );
   }

   private final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      this.ae()
         .a(
            new lllIllIIllIIIIIIIlIIlIIIIIllllIlIIIIIllllIIlIIIIlllIIIIIIlIIIIlIlIIIIllIIllIIlllIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl,
               (kotlin.jvm.functions.Function1)(llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI::e),
               var1.d(),
               0,
               0,
               0L,
               0,
               (kotlin.jvm.functions.Function1)(llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI::f),
               120,
               null
            )
         );
   }

   private final void bq() {
      this.aO();
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .p();
      short var10001 = -14238;
      short var10002 = -3714;
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("attack", false);
   }

   private final int br() {
      return IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .n()
         + IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .o()
         + IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .p()
         + IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .m()
         + IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .l()
         + IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .k();
   }

   @Override
   public void ba() {
      llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI var10000;
      double var10001;
      label24: {
         label23: {
            int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
            if (var1 == 0) {
               if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .g()
                  == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                  )
                {
                  var10000 = this;
                  var10001 = 5.0;
                  if (var1 != 0) {
                     break label24;
                  }

                  if (this.c(5.0)) {
                     break label23;
                  }
               }

               this.a(
                  IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl,
                  1000
               );
            }

            if (var1 == 0) {
               return;
            }
         }

         var10000 = this;
         var10001 = 5.0;
      }

      var10000.b(var10001);
   }

   @Override
   public void M() { Iterator var9 = null; // PX-FIX hoist
        
      boolean var19 = false; // PX-FIX
      boolean var18 = false; // PX-FIX
      boolean var16 = false; // PX-FIX
      Object var15 = null; // PX-FIX
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI var10000 = this;
      if (var1 == 0) {
         if (!(Boolean)IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI.a(this, false, 1, null)) {
            this.N();
            return;
         }

         var10000 = this;
      }

      boolean var2;
      boolean var3;
      boolean var4;
      boolean var5;
      label141: {
         label147: {
            var10000.aM();
            var2 = lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .g()
               != null;
            var3 = lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .q()
               != null;
            var4 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .g()
               == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
            this.a(
               IllllIlIllllIlIIIlIIlIIIIllIlIlllIIllIIIIIlIIIlllIIlllIllIlIIlIlIIllIlllIlllllIllIIII.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
                  .o()
            );
            var5 = this.ac().isEmpty();
            var10000 = this;
            if (var1 == 0) {
               if (this.X() != null) {
                  break label147;
               }

               var10000 = this;
            }

            label148: {
               var var7 = var10000.ac();
               boolean var8 = false;
               var15 = var7;
               label133:
               if (var1 == 0) {
                  if (var7 instanceof Collection) {
                     var15 = var7;
                     if (var1 != 0) {
                        break label133;
                     }

                     if (((me.octo.client.PXDyn)var15).isEmpty()) {
                        var16 = true;
                        break label148;
                     }
                  }

                  var15 = var7;
               }

                var9 = ((me.octo.client.PXDyn)var15).iterator();

               label126:
               while (true) {
                  if (!var9.hasNext()) {
                     var16 = true;
                     break;
                  }

                  Object var10 = var9.next();
                  IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var11 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var10;
                  boolean var17 = false;

                  while (
                     var11.b()
                        == IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                  ) {
                     var16 = false;
                     if (var1 == 0) {
                        break label126;
                     }
                  }
               }
            }

            if (!var16) {
               var18 = false;
               break label141;
            }
         }

         var18 = true;
      }

      boolean var6;
      var6 = var18;
      var19 = var2;
      label111:
      if (var1 == 0) {
         if (var2) {
            var19 = var3;
            if (var1 != 0) {
               break label111;
            }

            if (var3) {
               var19 = var6;
               if (var1 != 0) {
                  break label111;
               }

               if (var6) {
                  var19 = var4;
                  if (var1 != 0) {
                     break label111;
                  }

                  if (var4) {
                     var19 = var5;
                     if (var1 != 0) {
                        break label111;
                     }

                     if (!var5) {
                        super.M();
                        llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI[] var13 = new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI[]{
                           new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
                              me.octo.client.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                              null,
                              true
                           ),
                           new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
                              me.octo.client.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                              llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI::bu,
                              false
                           ),
                           new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
                              me.octo.client.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
                              llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI::bv,
                              false
                           ),
                           new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
                              me.octo.client.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                              llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI::bw,
                              false
                           ),
                           new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
                              me.octo.client.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
                              null,
                              false
                           )
                        };
                        this.a(CollectionsKt.listOf(var13));
                        this.ba();
                        return;
                     }
                  }
               }
            }
         }

         var19 = var2;
      }

      if (var1 == 0) {
         if (!var19) {
            this.bg();
         }

         var19 = var3;
      }

      if (var1 == 0) {
         if (!var19) {
            this.c(4);
         }

         var19 = var6;
      }

      if (var1 == 0) {
         if (!var19) {
            this.aP();
         }

         var19 = var4;
      }

      if (var1 == 0) {
         if (!var19) {
            this.b(
               CollectionsKt.listOf(
                  IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
               )
            );
         }

         var19 = var5;
      }

      if (var19) {
         IllllIlIllllIlIIIlIIlIIIIllIlIlllIIllIIIIIlIIIlllIIlllIllIlIIlIlIIllIlllIlllllIllIIII.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
            .O();
      }

      this.N();
   }

   @Override
   public void O() {
      short var10001 = -14227;
      short var10002 = -5863;
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.a(String.valueOf(
         llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl),
         "Session Info");
      int var10000 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.b(
         lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
         0,
         false);
      lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .h(0);
      int var1 = var10000;
      lIlIlIlIlllIlIlIllIIIllIIIllIIlIlIlIllllIIlIlIIIIIIIIlIIlIlIlIllllllIllllIIIlIIIIIlII var2 = IllIIIIllllIIllIlIIlIlIlIIlIIIIlllIIllIlIllIllllIIllIIllllllIIllIIllIIlIIllIlIIIIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .f();
      var10001 = -14236;
      var10002 = 9565;
      boolean var3 = var2.b("Glacite");
      if (var1 == 0) {
         if (var3) {
            lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .m(0);
            lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .d(0);
         }

         var10001 = -14218;
         var10002 = 19459;
         llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.a(String.valueOf(
            llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl),
            "Mining Info");
         lIlIlIlIlllIlIlIllIIIllIIIllIIlIlIlIllllIIlIlIIIIIIIIlIIlIlIlIllllllIllllIIIlIIIIIlII var4 = IllIIIIllllIIllIlIIlIlIlIIlIIIIlllIIllIlIllIllllIIllIIllllllIIllIIllIIlIIllIlIIIIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .f();
         var10001 = -14228;
         var10002 = 3487;
         var3 = var4.b("Umber");
      }

      if (var1 == 0) {
         if (var3) {
            lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .l(1);
            lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .k(1);
         }

         lIlIlIlIlllIlIlIllIIIllIIIllIIlIlIlIllllIIlIlIIIIIIIIlIIlIlIlIllllllIllllIIIlIIIIIlII var5 = IllIIIIllllIIllIlIIlIlIlIIlIIIIlllIIllIlIllIllllIIllIIllllllIIllIIllIIlIIllIlIIIIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .f();
         var10001 = -14224;
         var10002 = -12316;
         var3 = var5.b("Glacite");
      }

      if (var1 == 0) {
         if (var3) {
            lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .m(1);
         }

         lIlIlIlIlllIlIlIllIIIllIIIllIIlIlIlIllllIIlIlIIIIIIIIlIIlIlIlIllllllIllllIIIlIIIIIlII var6 = IllIIIIllllIIllIlIIlIlIlIIlIIIIlllIIllIlIllIllllIIllIIllllllIIllIIllIIlIIllIlIIIIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .f();
         var10001 = -14232;
         var10002 = 18247;
         var3 = var6.b("Gemstone");
      }

      if (var3) {
         lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .j(1);
      }
   }

   @Override
   public boolean af() {
      return this.W()
         == IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   private final boolean bs() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:722)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
   }

   private static final long a(llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI var0) {
      return var0.aJ().b() + 15000L;
   }

   private static final Object b(llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI var0) {
      return TuplesKt.to(
         var0.aJ().a(),
         IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
      );
   }

   private static final Object c(llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI var0) {
      return new llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         var0.a9(), IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(var0, 0.0, 1, null)
      );
   }

   private static final boolean bt() {
      int var0 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      boolean var10000 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
         .e()
         .b();
      if (var0 == 0) {
         if (!var10000) {
            var10000 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
               .a()
               .b();
            if (var0 != 0) {
               return var10000;
            }

            if (!var10000) {
               return false;
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   private static final Object d(llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI var0) {
      return new llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         var0.a9(),
         var0.br(),
         lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
            .e()
            .b(),
         lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
            .a()
            .b(),
         lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
            .e()
            .c(),
         lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
            .a()
            .c()
      );
   }

   private static final boolean a(ArmorStand var0) {
      short var10001 = -14230;
      short var10002 = 11221;
      Intrinsics.checkNotNullParameter(var0, "it");
      return true;
   }

   private static final boolean a(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final boolean a(ClientLevel var0, BlockPos var1) { byte var9 = (byte)0; // PX-FIX hoist
        
      int var10000 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      long var3 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(var1);
      int var2 = var10000;
       var9 = ((byte)((var0.isLoaded(var1)) ? 1 : 0));
      if (var2 != 0) {
         if ((var9 != 0)) {
            return lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .i(var1);
         }

         var9 = (byte)((0 != 0) ? 1 : 0);
      }

      byte var6 = 7;
      Long2ByteOpenHashMap var7 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .l();
      byte var8 = var7.get(var3);
      var9 = var8;
      if (var2 != 0) {
         if (var8 != 0) {
            if (var2 == 0) {
               return (var8 != 0);
            }

            if (var8 != var6) {
               var9 = var7.get(
                  IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a(var3, 0, 1, 0)
               );
               if (var2 == 0) {
                  return (var9 != 0);
               }

               if (var9 == 0) {
                  var9 = var7.get(
                     IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a(var3, 0, 2, 0)
                  );
                  if (var2 == 0) {
                     return (var9 != 0);
                  }

                  if (var9 == 0) {
                     return (1 != 0);
                  }
               }
            }
         }

         var9 = 0;
      }

      return (var9 != 0);
   }

   private static final Unit e(llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI var0) {
      var0.ba();
      return Unit.INSTANCE;
   }

   private static final Unit f(llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI var0) {
      var0.bq();
      return Unit.INSTANCE;
   }

   private static final boolean g(llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI var0) {
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      boolean var10000 = var0.af();
      if (var1 != 0) {
         if (!var10000) {
            return false;
         }

         var10000 = lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            .b();
      }

      return var1 == 0 ? var10000 : var10000;
   }

   private static final boolean bu() {
      return IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .e();
   }

   private static final boolean bv() {
      return IlllIIIIlIlllIlllllIlIlIIllIlllIlIIllllllIlllllIllIllllIllIIIllIIlIlIlllIIlIllIIlIlll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .a();
   }

   private static final boolean bw() {
      return IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .a();
   }

   private static final boolean h(llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI var0) {
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      boolean var10000 = var0.af();
      if (var1 == 0) {
         if (!var10000) {
            return false;
         }

         var10000 = lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            .b();
      }

      return var1 != 0 ? var10000 : var10000;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[33];
      int var3 = 0;
      String var2 = "\u0092°Òå~\u0099\u008d¯\bø!#Lv\u001b(Ù¿\u0007ísi/Y-LO©zÀ\u0016zkçQ ð0IZ4o÷.V\u0088òEÎÎ`÷\u001cå\u0002/\u001f.éã\u009alÏ\u001cÌ\u009füÿÀÏsÎØé\u007f\u0086»ï\u0095Ô°o\u0010W]T¹u\u009aBü©äc\u007fP\u0080\rb|\u0086vÙøð.\u0017\u0004\u0019\u0000×&#Î\u009f\u0011\u0013mV\u0096ïaRÁ\f¿ò4î¡\f:{é?C)\u0007ÿ±a¤ª\u000fFwy\u0014¹¹Ö\u0098¢=\u009c \u0015\u001bm\u0013Þß\u00146öI÷ðVë\u0093\u001eÛKX\u0017>²¡\fi\u009câ^(D,Q-ßü\u0098\u000b\fs/Õ\u0014Û_é\r\u0087\u001b\u001b_v$\u0003ðï7$Nq\u0090M»8OL·6\u00ad\u001e#§Ú{Í\u0092C\u0010¬E\\=\u008b\u0000ZÿóØ.\u009cbPü-\u000776W<|¼n.Ü\u007fñ1w\u008a\u0091§OÃ\u008eR¹®«bKö`ó\u009dFø\u0096äÞ\u0099û{£\u0007àbÞVø`0\u0002\u0080\u0017À´pL³\u000b\u0001ýÕêÅ>ûpÐw®\b:ªÇÌ\u009eÚÖì\f}T@Þ2\u0097Öã¨B¼]\u000e?Çg\u001aÐHI.ï1 \u0097\u0081ð\u0002Zü\bòÓ\bÂu\u001b«Ô\b\\o6/À×Lh\u0006*ýÓ)\u008fê\u0013V\u0086J$xLÉZõß¯d fÛ¤\u0007)\u0090\fÛ\fNC\u000fZ\u000b\u009cn¦³ª\u0005K\u0010\u008bß\u009f »b¯Ú\u0002\u0094¹!Zü/èî\u0002D\u001atºvsÔP\\\u0085\bV\n\u001bÔ\u001d¹·\u0006\u001e§\u0085\u0017\u009b\u0084\u000eJ¤Év\u0005Åó\u009f¸\u0007ÊQÜ(\ttÜ*^¨_Ö[ý\u000b\r\u0098:²:\u007ffN*sÿ\b\u009e`S\u0095\fñ\u0084\u0089\u0012ØvÔ\u0003îïô$6q\u009fMZ'uH'Ï";
      int var4 = "\u0092°Òå~\u0099\u008d¯\bø!#Lv\u001b(Ù¿\u0007ísi/Y-LO©zÀ\u0016zkçQ ð0IZ4o÷.V\u0088òEÎÎ`÷\u001cå\u0002/\u001f.éã\u009alÏ\u001cÌ\u009füÿÀÏsÎØé\u007f\u0086»ï\u0095Ô°o\u0010W]T¹u\u009aBü©äc\u007fP\u0080\rb|\u0086vÙøð.\u0017\u0004\u0019\u0000×&#Î\u009f\u0011\u0013mV\u0096ïaRÁ\f¿ò4î¡\f:{é?C)\u0007ÿ±a¤ª\u000fFwy\u0014¹¹Ö\u0098¢=\u009c \u0015\u001bm\u0013Þß\u00146öI÷ðVë\u0093\u001eÛKX\u0017>²¡\fi\u009câ^(D,Q-ßü\u0098\u000b\fs/Õ\u0014Û_é\r\u0087\u001b\u001b_v$\u0003ðï7$Nq\u0090M»8OL·6\u00ad\u001e#§Ú{Í\u0092C\u0010¬E\\=\u008b\u0000ZÿóØ.\u009cbPü-\u000776W<|¼n.Ü\u007fñ1w\u008a\u0091§OÃ\u008eR¹®«bKö`ó\u009dFø\u0096äÞ\u0099û{£\u0007àbÞVø`0\u0002\u0080\u0017À´pL³\u000b\u0001ýÕêÅ>ûpÐw®\b:ªÇÌ\u009eÚÖì\f}T@Þ2\u0097Öã¨B¼]\u000e?Çg\u001aÐHI.ï1 \u0097\u0081ð\u0002Zü\bòÓ\bÂu\u001b«Ô\b\\o6/À×Lh\u0006*ýÓ)\u008fê\u0013V\u0086J$xLÉZõß¯d fÛ¤\u0007)\u0090\fÛ\fNC\u000fZ\u000b\u009cn¦³ª\u0005K\u0010\u008bß\u009f »b¯Ú\u0002\u0094¹!Zü/èî\u0002D\u001atºvsÔP\\\u0085\bV\n\u001bÔ\u001d¹·\u0006\u001e§\u0085\u0017\u009b\u0084\u000eJ¤Év\u0005Åó\u009f¸\u0007ÊQÜ(\ttÜ*^¨_Ö[ý\u000b\r\u0098:²:\u007ffN*sÿ\b\u009e`S\u0095\fñ\u0084\u0089\u0012ØvÔ\u0003îïô$6q\u009fMZ'uH'Ï"
         .length();
      char var1 = 18;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 32;
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
                     case 0 -> 56;
                     case 1 -> 41;
                     case 2 -> 92;
                     case 3 -> 121;
                     case 4 -> 29;
                     case 5 -> 75;
                     default -> 71;
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
                     j = var5;
                     k = new String[33];
                     IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = new llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (Object) null
                     );
                     IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = new llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI();
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "l\u001e\u0012\u0017ú÷\u0090\f\u0090Ë\\·?¼³Ø\u008eIBw";
                  var4 = "l\u001e\u0012\u0017ú÷\u0090\f\u0090Ë\\·?¼³Ø\u008eIBw".length();
                  var1 = 7;
                  var8 = -1;
            }

            var10000 = 66;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String e(int var0, int var1) {
      int var2 = (var0 ^ -14213) & 65535;
      if (k[var2] == null) {
         char[] var3 = j[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 45;
            case 1 -> 166;
            case 2 -> 163;
            case 3 -> 49;
            case 4 -> 106;
            case 5 -> 42;
            case 6 -> 23;
            case 7 -> 54;
            case 8 -> 2;
            case 9 -> 147;
            case 10 -> 192;
            case 11 -> 27;
            case 12 -> 251;
            case 13 -> 78;
            case 14 -> 41;
            case 15 -> 202;
            case 16 -> 249;
            case 17 -> 233;
            case 18 -> 19;
            case 19 -> 77;
            case 20 -> 84;
            case 21 -> 231;
            case 22 -> 12;
            case 23 -> 229;
            case 24 -> 244;
            case 25 -> 175;
            case 26 -> 89;
            case 27 -> 169;
            case 28 -> 144;
            case 29 -> 6;
            case 30 -> 247;
            case 31 -> 187;
            case 32 -> 143;
            case 33 -> 16;
            case 34 -> 101;
            case 35 -> 67;
            case 36 -> 189;
            case 37 -> 151;
            case 38 -> 240;
            case 39 -> 104;
            case 40 -> 212;
            case 41 -> 14;
            case 42 -> 1;
            case 43 -> 38;
            case 44 -> 80;
            case 45 -> 128;
            case 46 -> 184;
            case 47 -> 124;
            case 48 -> 211;
            case 49 -> 8;
            case 50 -> 121;
            case 51 -> 91;
            case 52 -> 210;
            case 53 -> 156;
            case 54 -> 118;
            case 55 -> 69;
            case 56 -> 190;
            case 57 -> 28;
            case 58 -> 5;
            case 59 -> 181;
            case 60 -> 213;
            case 61 -> 48;
            case 62 -> 26;
            case 63 -> 7;
            case 64 -> 30;
            case 65 -> 22;
            case 66 -> 170;
            case 67 -> 141;
            case 68 -> 68;
            case 69 -> 203;
            case 70 -> 215;
            case 71 -> 200;
            case 72 -> 65;
            case 73 -> 73;
            case 74 -> 56;
            case 75 -> 122;
            case 76 -> 0;
            case 77 -> 191;
            case 78 -> 254;
            case 79 -> 96;
            case 80 -> 127;
            case 81 -> 70;
            case 82 -> 83;
            case 83 -> 153;
            case 84 -> 109;
            case 85 -> 224;
            case 86 -> 130;
            case 87 -> 114;
            case 88 -> 93;
            case 89 -> 232;
            case 90 -> 225;
            case 91 -> 223;
            case 92 -> 10;
            case 93 -> 195;
            case 94 -> 242;
            case 95 -> 228;
            case 96 -> 248;
            case 97 -> 167;
            case 98 -> 204;
            case 99 -> 46;
            case 100 -> 102;
            case 101 -> 21;
            case 102 -> 57;
            case 103 -> 199;
            case 104 -> 125;
            case 105 -> 131;
            case 106 -> 9;
            case 107 -> 72;
            case 108 -> 205;
            case 109 -> 43;
            case 110 -> 217;
            case 111 -> 61;
            case 112 -> 179;
            case 113 -> 188;
            case 114 -> 230;
            case 115 -> 142;
            case 116 -> 123;
            case 117 -> 113;
            case 118 -> 4;
            case 119 -> 117;
            case 120 -> 186;
            case 121 -> 40;
            case 122 -> 25;
            case 123 -> 159;
            case 124 -> 99;
            case 125 -> 201;
            case 126 -> 208;
            case 127 -> 196;
            case 128 -> 209;
            case 129 -> 198;
            case 130 -> 47;
            case 131 -> 235;
            case 132 -> 206;
            case 133 -> 44;
            case 134 -> 237;
            case 135 -> 246;
            case 136 -> 119;
            case 137 -> 108;
            case 138 -> 138;
            case 139 -> 214;
            case 140 -> 238;
            case 141 -> 55;
            case 142 -> 154;
            case 143 -> 15;
            case 144 -> 255;
            case 145 -> 36;
            case 146 -> 148;
            case 147 -> 207;
            case 148 -> 39;
            case 149 -> 17;
            case 150 -> 171;
            case 151 -> 139;
            case 152 -> 174;
            case 153 -> 172;
            case 154 -> 180;
            case 155 -> 111;
            case 156 -> 176;
            case 157 -> 193;
            case 158 -> 66;
            case 159 -> 94;
            case 160 -> 168;
            case 161 -> 220;
            case 162 -> 245;
            case 163 -> 18;
            case 164 -> 146;
            case 165 -> 95;
            case 166 -> 226;
            case 167 -> 34;
            case 168 -> 197;
            case 169 -> 182;
            case 170 -> 116;
            case 171 -> 132;
            case 172 -> 234;
            case 173 -> 126;
            case 174 -> 97;
            case 175 -> 165;
            case 176 -> 178;
            case 177 -> 157;
            case 178 -> 160;
            case 179 -> 120;
            case 180 -> 239;
            case 181 -> 3;
            case 182 -> 194;
            case 183 -> 60;
            case 184 -> 86;
            case 185 -> 81;
            case 186 -> 58;
            case 187 -> 115;
            case 188 -> 135;
            case 189 -> 35;
            case 190 -> 62;
            case 191 -> 92;
            case 192 -> 20;
            case 193 -> 236;
            case 194 -> 88;
            case 195 -> 137;
            case 196 -> 173;
            case 197 -> 227;
            case 198 -> 162;
            case 199 -> 98;
            case 200 -> 221;
            case 201 -> 155;
            case 202 -> 134;
            case 203 -> 79;
            case 204 -> 52;
            case 205 -> 145;
            case 206 -> 53;
            case 207 -> 103;
            case 208 -> 185;
            case 209 -> 149;
            case 210 -> 222;
            case 211 -> 253;
            case 212 -> 136;
            case 213 -> 129;
            case 214 -> 33;
            case 215 -> 74;
            case 216 -> 105;
            case 217 -> 59;
            case 218 -> 150;
            case 219 -> 183;
            case 220 -> 85;
            case 221 -> 64;
            case 222 -> 252;
            case 223 -> 32;
            case 224 -> 241;
            case 225 -> 82;
            case 226 -> 140;
            case 227 -> 90;
            case 228 -> 161;
            case 229 -> 24;
            case 230 -> 177;
            case 231 -> 250;
            case 232 -> 29;
            case 233 -> 50;
            case 234 -> 112;
            case 235 -> 11;
            case 236 -> 71;
            case 237 -> 164;
            case 238 -> 107;
            case 239 -> 219;
            case 240 -> 110;
            case 241 -> 218;
            case 242 -> 13;
            case 243 -> 152;
            case 244 -> 100;
            case 245 -> 51;
            case 246 -> 37;
            case 247 -> 31;
            case 248 -> 133;
            case 249 -> 243;
            case 250 -> 76;
            case 251 -> 87;
            case 252 -> 216;
            case 253 -> 158;
            case 254 -> 63;
            default -> 75;
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

         k[var2] = new String(var3).intern();
      }

      return k[var2];
   }

   private static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final Triple<Integer, Integer, Integer> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] a;
      private static String[] b;

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(int var1, @NotNull Triple<Integer, Integer, Integer> var2) {
         short var10001 = 14042;
         short var10002 = 18934;
         Intrinsics.checkNotNullParameter(var2, "playerPos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      }

      public final int a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int c() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> d() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
         int var1, @NotNull Triple<Integer, Integer, Integer> var2
      ) {
         short var10001 = 14043;
         short var10002 = 4799;
         Intrinsics.checkNotNullParameter(var2, "playerPos");
         return new llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            var1, var2
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10002 = 14041;
         short var10003 = 25713;
         var10003 = 14040;
         short var10004 = 21236;
         return "RouteProgress(currentIndex="
            + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            + ", playerPos="
            + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         return var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int var2 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
         Object var10000 = this;
         if (var2 != 0) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != 0) {
            if (!(
               var10000 instanceof llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = (llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var10000;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var2 != 0) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )) ? 1 : 0);
         }

         if (var2 != 0) {
            if (var4 == 0) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[4];
         int var3 = 0;
         String var2 = "v\u0000\u0094,k?å#Î\tö\u0080\u0084<i=¥cÆ";
         int var4 = "v\u0000\u0094,k?å#Î\tö\u0080\u0084<i=¥cÆ".length();
         char var1 = '\t';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 93;
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
                        case 0 -> 69;
                        case 1 -> 64;
                        case 2 -> 27;
                        case 3 -> 74;
                        case 4 -> 68;
                        case 5 -> 33;
                        default -> 111;
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
                        break pxClinit;
                     }

                     var1 = var2.charAt(var8);
                     break;
                  default:
                     var5[var3++] = var29;
                     if ((var8 += var1) < var4) {
                        var1 = var2.charAt(var8);
                        continue label52;
                     }

                     var2 = "`\u000fùt\u0098áCæÃ£\u008cs\u001bÖã\u009bWu·m=Ä{«\u00988^\u0087¡¡@Õ\u00ad\u007f¡I\u001c2«E";
                     var4 = "`\u000fùt\u0098áCæÃ£\u008cs\u001bÖã\u009bWu·m=Ä{«\u00988^\u0087¡¡@Õ\u00ad\u007f¡I\u001c2«E".length();
                     var1 = '\f';
                     var8 = -1;
               }

               var10000 = 28;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 14042) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 5;
               case 1 -> 94;
               case 2 -> 135;
               case 3 -> 68;
               case 4 -> 142;
               case 5 -> 219;
               case 6 -> 181;
               case 7 -> 66;
               case 8 -> 138;
               case 9 -> 92;
               case 10 -> 30;
               case 11 -> 34;
               case 12 -> 89;
               case 13 -> 128;
               case 14 -> 200;
               case 15 -> 38;
               case 16 -> 189;
               case 17 -> 243;
               case 18 -> 242;
               case 19 -> 126;
               case 20 -> 110;
               case 21 -> 163;
               case 22 -> 76;
               case 23 -> 23;
               case 24 -> 91;
               case 25 -> 39;
               case 26 -> 167;
               case 27 -> 244;
               case 28 -> 50;
               case 29 -> 107;
               case 30 -> 235;
               case 31 -> 69;
               case 32 -> 220;
               case 33 -> 236;
               case 34 -> 56;
               case 35 -> 160;
               case 36 -> 15;
               case 37 -> 85;
               case 38 -> 241;
               case 39 -> 103;
               case 40 -> 247;
               case 41 -> 186;
               case 42 -> 133;
               case 43 -> 164;
               case 44 -> 70;
               case 45 -> 22;
               case 46 -> 124;
               case 47 -> 206;
               case 48 -> 229;
               case 49 -> 49;
               case 50 -> 61;
               case 51 -> 246;
               case 52 -> 165;
               case 53 -> 194;
               case 54 -> 95;
               case 55 -> 44;
               case 56 -> 156;
               case 57 -> 223;
               case 58 -> 37;
               case 59 -> 176;
               case 60 -> 222;
               case 61 -> 131;
               case 62 -> 67;
               case 63 -> 59;
               case 64 -> 174;
               case 65 -> 233;
               case 66 -> 215;
               case 67 -> 79;
               case 68 -> 27;
               case 69 -> 201;
               case 70 -> 100;
               case 71 -> 60;
               case 72 -> 42;
               case 73 -> 82;
               case 74 -> 169;
               case 75 -> 217;
               case 76 -> 234;
               case 77 -> 249;
               case 78 -> 1;
               case 79 -> 29;
               case 80 -> 203;
               case 81 -> 74;
               case 82 -> 245;
               case 83 -> 154;
               case 84 -> 183;
               case 85 -> 171;
               case 86 -> 99;
               case 87 -> 21;
               case 88 -> 184;
               case 89 -> 155;
               case 90 -> 88;
               case 91 -> 170;
               case 92 -> 13;
               case 93 -> 4;
               case 94 -> 18;
               case 95 -> 17;
               case 96 -> 253;
               case 97 -> 191;
               case 98 -> 32;
               case 99 -> 117;
               case 100 -> 121;
               case 101 -> 114;
               case 102 -> 190;
               case 103 -> 146;
               case 104 -> 161;
               case 105 -> 54;
               case 106 -> 192;
               case 107 -> 141;
               case 108 -> 111;
               case 109 -> 210;
               case 110 -> 216;
               case 111 -> 24;
               case 112 -> 198;
               case 113 -> 237;
               case 114 -> 125;
               case 115 -> 139;
               case 116 -> 113;
               case 117 -> 90;
               case 118 -> 46;
               case 119 -> 2;
               case 120 -> 208;
               case 121 -> 134;
               case 122 -> 8;
               case 123 -> 101;
               case 124 -> 26;
               case 125 -> 36;
               case 126 -> 119;
               case 127 -> 71;
               case 128 -> 105;
               case 129 -> 212;
               case 130 -> 132;
               case 131 -> 151;
               case 132 -> 178;
               case 133 -> 145;
               case 134 -> 218;
               case 135 -> 3;
               case 136 -> 158;
               case 137 -> 199;
               case 138 -> 96;
               case 139 -> 62;
               case 140 -> 55;
               case 141 -> 185;
               case 142 -> 196;
               case 143 -> 148;
               case 144 -> 136;
               case 145 -> 0;
               case 146 -> 87;
               case 147 -> 221;
               case 148 -> 250;
               case 149 -> 226;
               case 150 -> 109;
               case 151 -> 239;
               case 152 -> 188;
               case 153 -> 31;
               case 154 -> 16;
               case 155 -> 12;
               case 156 -> 81;
               case 157 -> 63;
               case 158 -> 197;
               case 159 -> 11;
               case 160 -> 41;
               case 161 -> 48;
               case 162 -> 228;
               case 163 -> 240;
               case 164 -> 10;
               case 165 -> 147;
               case 166 -> 35;
               case 167 -> 182;
               case 168 -> 80;
               case 169 -> 130;
               case 170 -> 57;
               case 171 -> 53;
               case 172 -> 72;
               case 173 -> 225;
               case 174 -> 168;
               case 175 -> 172;
               case 176 -> 227;
               case 177 -> 52;
               case 178 -> 97;
               case 179 -> 83;
               case 180 -> 47;
               case 181 -> 106;
               case 182 -> 7;
               case 183 -> 195;
               case 184 -> 193;
               case 185 -> 129;
               case 186 -> 252;
               case 187 -> 51;
               case 188 -> 25;
               case 189 -> 9;
               case 190 -> 78;
               case 191 -> 162;
               case 192 -> 202;
               case 193 -> 6;
               case 194 -> 140;
               case 195 -> 149;
               case 196 -> 75;
               case 197 -> 230;
               case 198 -> 175;
               case 199 -> 232;
               case 200 -> 58;
               case 201 -> 214;
               case 202 -> 20;
               case 203 -> 98;
               case 204 -> 19;
               case 205 -> 143;
               case 206 -> 173;
               case 207 -> 150;
               case 208 -> 180;
               case 209 -> 152;
               case 210 -> 93;
               case 211 -> 224;
               case 212 -> 187;
               case 213 -> 122;
               case 214 -> 73;
               case 215 -> 116;
               case 216 -> 86;
               case 217 -> 211;
               case 218 -> 137;
               case 219 -> 238;
               case 220 -> 127;
               case 221 -> 209;
               case 222 -> 153;
               case 223 -> 65;
               case 224 -> 177;
               case 225 -> 144;
               case 226 -> 207;
               case 227 -> 251;
               case 228 -> 102;
               case 229 -> 28;
               case 230 -> 248;
               case 231 -> 112;
               case 232 -> 84;
               case 233 -> 118;
               case 234 -> 40;
               case 235 -> 213;
               case 236 -> 179;
               case 237 -> 115;
               case 238 -> 33;
               case 239 -> 43;
               case 240 -> 14;
               case 241 -> 166;
               case 242 -> 231;
               case 243 -> 204;
               case 244 -> 159;
               case 245 -> 104;
               case 246 -> 157;
               case 247 -> 123;
               case 248 -> 77;
               case 249 -> 255;
               case 250 -> 254;
               case 251 -> 120;
               case 252 -> 64;
               case 253 -> 45;
               case 254 -> 108;
               default -> 205;
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
         public static me.octo.client.llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(me.octo.client.llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll p0, int p1, kotlin.Triple p2, int mask, java.lang.Object marker) {
         if ((mask & 1) != 0) { p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
         if ((mask & 2) != 0) { p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
         return p0.a(p1, p2);
      }
}

   private static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final boolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private final boolean IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         int var1, int var2, boolean var3, boolean var4, boolean var5, boolean var6
      ) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var6;
      }

      public final int a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final boolean d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final boolean e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final boolean f() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final int g() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int h() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean i() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final boolean j() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final boolean k() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final boolean l() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @NotNull
      public final llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         int var1, int var2, boolean var3, boolean var4, boolean var5, boolean var6
      ) {
         return new llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var2, var3, var4, var5, var6
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 32410;
         boolean var1 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         boolean var2 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         boolean var3 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         boolean var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var5 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var6 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -16518;
         short var10002 = 32408;
         short var10003 = -29414;
         short var10004 = 32411;
         short var10005 = -24484;
         short var10006 = 32414;
         short var10007 = 21405;
         short var10008 = 32415;
         short var10009 = -18335;
         short var10010 = 32409;
         short var10011 = -6577;
         return "MiningProgress(currentIndex="
            + var6
            + ", minedBlocks="
            + var5
            + ", tunnelEnabled="
            + var4
            + ", mithrilEnabled="
            + var3
            + ", tunnelFinished="
            + var2
            + ", mithrilFinished="
            + var1
            + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var1 = var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         var1 = var1 * 31 + Boolean.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         var1 = var1 * 31 + Boolean.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         var1 = var1 * 31 + Boolean.hashCode(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         return var1 * 31 + Boolean.hashCode(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int var2 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
         Object var10000 = this;
         if (var2 != 0) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != 0) {
            if (!(
               var10000 instanceof llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = var1;
         }

         llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         int var10001 = var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var2 != 0) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         if (var2 != 0) {
            if (var4 != var10001) {
               return false;
            }

            var4 = ((this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) ? 1 : 0);
            var10001 = ((var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) ? 1 : 0);
         }

         if (var2 != 0) {
            if (var4 != var10001) {
               return false;
            }

            var4 = ((this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0);
            var10001 = ((var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0);
         }

         if (var2 != 0) {
            if (var4 != var10001) {
               return false;
            }

            var4 = ((this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) ? 1 : 0);
            var10001 = ((var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) ? 1 : 0);
         }

         if (var2 != 0) {
            if (var4 != var10001) {
               return false;
            }

            var4 = ((this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) ? 1 : 0);
            if (var2 == 0) {
               return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            }

            var10001 = ((var3.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) ? 1 : 0);
         }

         return !(var4 != var10001);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[6];
         int var3 = 0;
         String var2 = "}ó\u008a-\u001b\u0088³\u001d\u0098W\u009d\u0083òé\u009e\u0098$\u0010ªU$âµgÌ\u00ad\u0007b\u0010\u007fX\u009d$ ?ñÝi\u009bß5ÔÎêö\u000e¼$ü·¶Ù2E\u0019bß\"\u0089\\\u0012\u0016\u0016©ñ\u0006\u001ckzæâ*;f\u0094\u00151\f¬";
         int var4 = "}ó\u008a-\u001b\u0088³\u001d\u0098W\u009d\u0083òé\u009e\u0098$\u0010ªU$âµgÌ\u00ad\u0007b\u0010\u007fX\u009d$ ?ñÝi\u009bß5ÔÎêö\u000e¼$ü·¶Ù2E\u0019bß\"\u0089\\\u0012\u0016\u0016©ñ\u0006\u001ckzæâ*;f\u0094\u00151\f¬"
            .length();
         char var1 = 28;
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
                        case 0 -> 16;
                        case 1 -> 119;
                        case 2 -> 97;
                        case 3 -> 92;
                        case 4 -> 103;
                        case 5 -> 73;
                        default -> 3;
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
                        b = new String[6];
                        break pxClinit;
                     }

                     var1 = var2.charAt(var8);
                     break;
                  default:
                     var5[var3++] = var29;
                     if ((var8 += var1) < var4) {
                        var1 = var2.charAt(var8);
                        continue label52;
                     }

                     var2 = "¾\u0003\u0004ë\u000bçr½}¡æ\u0087«Js¯\u008d\u0011\u008d¿{`Ä\u000fÅcTó¬ló:K%\u008a";
                     var4 = "¾\u0003\u0004ë\u000bçr½}¡æ\u0087«Js¯\u008d\u0011\u008d¿{`Ä\u000fÅcTó¬ló:K%\u008a".length();
                     var1 = 17;
                     var8 = -1;
               }

               var10000 = 50;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 32410) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 203;
               case 1 -> 192;
               case 2 -> 97;
               case 3 -> 30;
               case 4 -> 195;
               case 5 -> 4;
               case 6 -> 159;
               case 7 -> 133;
               case 8 -> 95;
               case 9 -> 217;
               case 10 -> 218;
               case 11 -> 250;
               case 12 -> 118;
               case 13 -> 243;
               case 14 -> 193;
               case 15 -> 3;
               case 16 -> 113;
               case 17 -> 60;
               case 18 -> 83;
               case 19 -> 158;
               case 20 -> 138;
               case 21 -> 240;
               case 22 -> 228;
               case 23 -> 126;
               case 24 -> 101;
               case 25 -> 167;
               case 26 -> 9;
               case 27 -> 176;
               case 28 -> 196;
               case 29 -> 128;
               case 30 -> 5;
               case 31 -> 142;
               case 32 -> 129;
               case 33 -> 141;
               case 34 -> 186;
               case 35 -> 29;
               case 36 -> 234;
               case 37 -> 114;
               case 38 -> 144;
               case 39 -> 79;
               case 40 -> 212;
               case 41 -> 22;
               case 42 -> 221;
               case 43 -> 85;
               case 44 -> 168;
               case 45 -> 251;
               case 46 -> 56;
               case 47 -> 172;
               case 48 -> 102;
               case 49 -> 59;
               case 50 -> 181;
               case 51 -> 93;
               case 52 -> 182;
               case 53 -> 11;
               case 54 -> 107;
               case 55 -> 50;
               case 56 -> 169;
               case 57 -> 2;
               case 58 -> 68;
               case 59 -> 131;
               case 60 -> 94;
               case 61 -> 124;
               case 62 -> 164;
               case 63 -> 23;
               case 64 -> 109;
               case 65 -> 57;
               case 66 -> 225;
               case 67 -> 205;
               case 68 -> 53;
               case 69 -> 155;
               case 70 -> 111;
               case 71 -> 202;
               case 72 -> 115;
               case 73 -> 219;
               case 74 -> 64;
               case 75 -> 247;
               case 76 -> 170;
               case 77 -> 223;
               case 78 -> 194;
               case 79 -> 189;
               case 80 -> 21;
               case 81 -> 135;
               case 82 -> 52;
               case 83 -> 82;
               case 84 -> 25;
               case 85 -> 10;
               case 86 -> 27;
               case 87 -> 16;
               case 88 -> 62;
               case 89 -> 127;
               case 90 -> 45;
               case 91 -> 145;
               case 92 -> 73;
               case 93 -> 134;
               case 94 -> 112;
               case 95 -> 49;
               case 96 -> 38;
               case 97 -> 96;
               case 98 -> 215;
               case 99 -> 122;
               case 100 -> 173;
               case 101 -> 190;
               case 102 -> 18;
               case 103 -> 33;
               case 104 -> 204;
               case 105 -> 108;
               case 106 -> 206;
               case 107 -> 19;
               case 108 -> 209;
               case 109 -> 40;
               case 110 -> 163;
               case 111 -> 198;
               case 112 -> 183;
               case 113 -> 244;
               case 114 -> 28;
               case 115 -> 179;
               case 116 -> 143;
               case 117 -> 232;
               case 118 -> 149;
               case 119 -> 146;
               case 120 -> 154;
               case 121 -> 31;
               case 122 -> 103;
               case 123 -> 153;
               case 124 -> 119;
               case 125 -> 239;
               case 126 -> 178;
               case 127 -> 54;
               case 128 -> 220;
               case 129 -> 241;
               case 130 -> 254;
               case 131 -> 88;
               case 132 -> 105;
               case 133 -> 200;
               case 134 -> 188;
               case 135 -> 161;
               case 136 -> 248;
               case 137 -> 69;
               case 138 -> 199;
               case 139 -> 130;
               case 140 -> 110;
               case 141 -> 43;
               case 142 -> 20;
               case 143 -> 230;
               case 144 -> 255;
               case 145 -> 229;
               case 146 -> 76;
               case 147 -> 231;
               case 148 -> 116;
               case 149 -> 37;
               case 150 -> 7;
               case 151 -> 106;
               case 152 -> 78;
               case 153 -> 66;
               case 154 -> 184;
               case 155 -> 26;
               case 156 -> 237;
               case 157 -> 213;
               case 158 -> 249;
               case 159 -> 152;
               case 160 -> 81;
               case 161 -> 224;
               case 162 -> 51;
               case 163 -> 42;
               case 164 -> 24;
               case 165 -> 226;
               case 166 -> 236;
               case 167 -> 171;
               case 168 -> 92;
               case 169 -> 91;
               case 170 -> 136;
               case 171 -> 63;
               case 172 -> 35;
               case 173 -> 210;
               case 174 -> 6;
               case 175 -> 222;
               case 176 -> 72;
               case 177 -> 17;
               case 178 -> 253;
               case 179 -> 0;
               case 180 -> 39;
               case 181 -> 99;
               case 182 -> 74;
               case 183 -> 211;
               case 184 -> 77;
               case 185 -> 246;
               case 186 -> 36;
               case 187 -> 121;
               case 188 -> 148;
               case 189 -> 207;
               case 190 -> 245;
               case 191 -> 87;
               case 192 -> 165;
               case 193 -> 13;
               case 194 -> 80;
               case 195 -> 32;
               case 196 -> 70;
               case 197 -> 242;
               case 198 -> 75;
               case 199 -> 185;
               case 200 -> 214;
               case 201 -> 84;
               case 202 -> 177;
               case 203 -> 227;
               case 204 -> 140;
               case 205 -> 156;
               case 206 -> 160;
               case 207 -> 1;
               case 208 -> 137;
               case 209 -> 162;
               case 210 -> 151;
               case 211 -> 8;
               case 212 -> 187;
               case 213 -> 44;
               case 214 -> 12;
               case 215 -> 14;
               case 216 -> 238;
               case 217 -> 41;
               case 218 -> 191;
               case 219 -> 235;
               case 220 -> 208;
               case 221 -> 15;
               case 222 -> 104;
               case 223 -> 65;
               case 224 -> 123;
               case 225 -> 139;
               case 226 -> 90;
               case 227 -> 61;
               case 228 -> 216;
               case 229 -> 98;
               case 230 -> 34;
               case 231 -> 100;
               case 232 -> 86;
               case 233 -> 201;
               case 234 -> 47;
               case 235 -> 125;
               case 236 -> 55;
               case 237 -> 132;
               case 238 -> 166;
               case 239 -> 157;
               case 240 -> 150;
               case 241 -> 48;
               case 242 -> 67;
               case 243 -> 71;
               case 244 -> 175;
               case 245 -> 197;
               case 246 -> 120;
               case 247 -> 174;
               case 248 -> 252;
               case 249 -> 58;
               case 250 -> 46;
               case 251 -> 89;
               case 252 -> 117;
               case 253 -> 233;
               case 254 -> 180;
               default -> 147;
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
         public static me.octo.client.llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(me.octo.client.llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI p0, int p1, int p2, boolean p3, boolean p4, boolean p5, boolean p6, int mask, java.lang.Object marker) {
         if ((mask & 1) != 0) { p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
         if ((mask & 2) != 0) { p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
         if ((mask & 4) != 0) { p3 = p0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl; }
         if ((mask & 8) != 0) { p4 = p0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI; }
         if ((mask & 16) != 0) { p5 = p0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII; }
         if ((mask & 32) != 0) { p6 = p0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI; }
         return p0.a(p1, p2, p3, p4, p5, p6);
      }
}

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }
        // PX-FIX DCM: kotlin-synthesized <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
           this();
        }


      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI a() {
         return llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
      }
   }
}
