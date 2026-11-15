package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import me.octo.client.utils.ore.PolinexOreForgeRecovery;
import me.octo.client.utils.player.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI
   extends lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll {
    public static <T> T bu(Object p0) { return null; } // PX-FIX mr4
    public static <T> T d(Object p0) { return null; } // PX-FIX mr3
   public Object receiver; // PX-FIX kotlin lambda receiver

   @NotNull
   public static lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
   @NotNull
   private ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   @NotNull
   private ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
   @NotNull
   private lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
   private boolean lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
   @NotNull
   private static lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
   private static String[] j;
   private static String[] k;

   public lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI() {
      short var10001 = 13914;
      short var10002 = 10860;
      var10002 = 13905;
      short var10003 = 19020;
      me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      short var10004 = 13917;
      short var10005 = -12594;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         IIIIlIlIIIlllIIllIlllIIIllIIIllIIlllIIlIIlIIIlIIllllIIIllIIIIllllIIlIIlllIllIlIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         IIIIlIlIIIlllIIllIlllIIIllIIIllIIlllIIlIIlIIIlIIllllIIIllIIIIllllIIlIIlllIllIlIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         IIIIlIlIIIlllIIllIlllIIIllIIIllIIlllIIlIIlIIIlIIllllIIIllIIIIllllIIlIIlllIllIlIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c(),
         IIIIlIlIIIlllIIllIlllIIIllIIIllIIlllIIlIIlIIIlIIllllIIIllIIIIllllIIlIIlllIllIlIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .d(),
         IIIIlIlIIIlllIIllIlllIIIllIIIllIIlllIIlIIlIIIlIIllllIIIllIIIIllllIIlIIlllIllIlIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e(),
         IIIIlIlIIIlllIIllIlllIIIllIIIllIIlllIIlIIlIIIlIIllllIIIllIIIIllllIIlIIlllIllIlIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .f()
      };
      super("Ore Macro", "Mines pure ores in the Dwarven Mines with a custom route.", var3, "Dwarven Mines", null, null, true, var1, 48, null);
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = new ArrayList<>();
      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = new ArrayList<>();
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = true;
   }

   @Override
   public final boolean c() {
      return true;
   }

   @Override
   protected void aD() {
      Object receiver = null; // PX-FIX
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var10000 = this;
      short var10001 = 13903;
      short var10002 = -25780;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         this,
         "Ore travel",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         (Function0)(() -> a(this)),
         5000L,
         false,
         false,
         (Function0)(() -> b(this)),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = 27320;
                  short var10005 = -21526;
                  var10005 = 27323;
                  short var10006 = -6172;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001x = 27322;
                  short var10002x = -10862;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "l¦y§â>Gª\u009a]´\u0099=úÊ ³Ñ7Ü\u009ey\u008cfk\u0094ZÀ<\u0006\u0087ú\u0085´?¸«2%»ÍÈ2Nì¼ÄZ\u0083d\u0083\u0082\u0084\u00ad]\n\u00843»·.ºûx(\u0001UøÃ!ÖVñ>B/÷n\u008cge\u0090a\u00ad&ân\f\u0094è¬³Â]-×hE\u0007ÚJ¯\u0010\u001d<(õ\u008ao¬\u0084*\u001b7É7Eª\u0017z\u00903\u0086\u009d\u0010xqÅ5ÕÔ²}d\u0004EíWW/«";
                  int var4 = "l¦y§â>Gª\u009a]´\u0099=úÊ ³Ñ7Ü\u009ey\u008cfk\u0094ZÀ<\u0006\u0087ú\u0085´?¸«2%»ÍÈ2Nì¼ÄZ\u0083d\u0083\u0082\u0084\u00ad]\n\u00843»·.ºûx(\u0001UøÃ!ÖVñ>B/÷n\u008cge\u0090a\u00ad&ân\f\u0094è¬³Â]-×hE\u0007ÚJ¯\u0010\u001d<(õ\u008ao¬\u0084*\u001b7É7Eª\u0017z\u00903\u0086\u009d\u0010xqÅ5ÕÔ²}d\u0004EíWW/«"
                     .length();
                  char var1 = 2;
                  int var0 = -1;

                  while (true) {
                     char[] var10002x;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 26;
                        var10002x = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 26;
                           var10006 = var6;
                        } else {
                           var13 = 26;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 26;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 109;
                              case 1 -> 34;
                              case 2 -> 53;
                              case 3 -> 47;
                              case 4 -> 93;
                              case 5 -> 67;
                              default -> 84;
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
                  int var2 = (var0 ^ 27322) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 93;
                        case 1 -> 10;
                        case 2 -> 17;
                        case 3 -> 164;
                        case 4 -> 208;
                        case 5 -> 94;
                        case 6 -> 128;
                        case 7 -> 247;
                        case 8 -> 72;
                        case 9 -> 240;
                        case 10 -> 76;
                        case 11 -> 73;
                        case 12 -> 75;
                        case 13 -> 155;
                        case 14 -> 170;
                        case 15 -> 131;
                        case 16 -> 87;
                        case 17 -> 135;
                        case 18 -> 203;
                        case 19 -> 47;
                        case 20 -> 30;
                        case 21 -> 237;
                        case 22 -> 12;
                        case 23 -> 35;
                        case 24 -> 251;
                        case 25 -> 211;
                        case 26 -> 3;
                        case 27 -> 39;
                        case 28 -> 223;
                        case 29 -> 21;
                        case 30 -> 117;
                        case 31 -> 167;
                        case 32 -> 27;
                        case 33 -> 146;
                        case 34 -> 143;
                        case 35 -> 232;
                        case 36 -> 97;
                        case 37 -> 153;
                        case 38 -> 219;
                        case 39 -> 61;
                        case 40 -> 54;
                        case 41 -> 233;
                        case 42 -> 25;
                        case 43 -> 198;
                        case 44 -> 114;
                        case 45 -> 132;
                        case 46 -> 165;
                        case 47 -> 252;
                        case 48 -> 145;
                        case 49 -> 83;
                        case 50 -> 7;
                        case 51 -> 78;
                        case 52 -> 179;
                        case 53 -> 69;
                        case 54 -> 226;
                        case 55 -> 159;
                        case 56 -> 62;
                        case 57 -> 43;
                        case 58 -> 195;
                        case 59 -> 245;
                        case 60 -> 166;
                        case 61 -> 0;
                        case 62 -> 172;
                        case 63 -> 236;
                        case 64 -> 124;
                        case 65 -> 59;
                        case 66 -> 207;
                        case 67 -> 180;
                        case 68 -> 209;
                        case 69 -> 249;
                        case 70 -> 158;
                        case 71 -> 70;
                        case 72 -> 136;
                        case 73 -> 101;
                        case 74 -> 15;
                        case 75 -> 181;
                        case 76 -> 46;
                        case 77 -> 19;
                        case 78 -> 234;
                        case 79 -> 102;
                        case 80 -> 175;
                        case 81 -> 161;
                        case 82 -> 1;
                        case 83 -> 200;
                        case 84 -> 228;
                        case 85 -> 5;
                        case 86 -> 152;
                        case 87 -> 100;
                        case 88 -> 238;
                        case 89 -> 177;
                        case 90 -> 214;
                        case 91 -> 157;
                        case 92 -> 126;
                        case 93 -> 189;
                        case 94 -> 80;
                        case 95 -> 204;
                        case 96 -> 113;
                        case 97 -> 96;
                        case 98 -> 108;
                        case 99 -> 163;
                        case 100 -> 190;
                        case 101 -> 122;
                        case 102 -> 176;
                        case 103 -> 253;
                        case 104 -> 186;
                        case 105 -> 9;
                        case 106 -> 88;
                        case 107 -> 229;
                        case 108 -> 51;
                        case 109 -> 222;
                        case 110 -> 40;
                        case 111 -> 49;
                        case 112 -> 45;
                        case 113 -> 48;
                        case 114 -> 26;
                        case 115 -> 71;
                        case 116 -> 225;
                        case 117 -> 127;
                        case 118 -> 215;
                        case 119 -> 28;
                        case 120 -> 116;
                        case 121 -> 118;
                        case 122 -> 141;
                        case 123 -> 81;
                        case 124 -> 125;
                        case 125 -> 119;
                        case 126 -> 171;
                        case 127 -> 201;
                        case 128 -> 55;
                        case 129 -> 242;
                        case 130 -> 37;
                        case 131 -> 205;
                        case 132 -> 140;
                        case 133 -> 58;
                        case 134 -> 183;
                        case 135 -> 224;
                        case 136 -> 196;
                        case 137 -> 230;
                        case 138 -> 206;
                        case 139 -> 98;
                        case 140 -> 110;
                        case 141 -> 254;
                        case 142 -> 42;
                        case 143 -> 6;
                        case 144 -> 2;
                        case 145 -> 57;
                        case 146 -> 24;
                        case 147 -> 244;
                        case 148 -> 248;
                        case 149 -> 23;
                        case 150 -> 18;
                        case 151 -> 79;
                        case 152 -> 65;
                        case 153 -> 52;
                        case 154 -> 92;
                        case 155 -> 33;
                        case 156 -> 50;
                        case 157 -> 246;
                        case 158 -> 103;
                        case 159 -> 129;
                        case 160 -> 86;
                        case 161 -> 63;
                        case 162 -> 147;
                        case 163 -> 150;
                        case 164 -> 105;
                        case 165 -> 184;
                        case 166 -> 239;
                        case 167 -> 220;
                        case 168 -> 68;
                        case 169 -> 221;
                        case 170 -> 41;
                        case 171 -> 156;
                        case 172 -> 202;
                        case 173 -> 235;
                        case 174 -> 138;
                        case 175 -> 67;
                        case 176 -> 144;
                        case 177 -> 193;
                        case 178 -> 111;
                        case 179 -> 8;
                        case 180 -> 4;
                        case 181 -> 56;
                        case 182 -> 188;
                        case 183 -> 149;
                        case 184 -> 85;
                        case 185 -> 213;
                        case 186 -> 151;
                        case 187 -> 241;
                        case 188 -> 66;
                        case 189 -> 216;
                        case 190 -> 174;
                        case 191 -> 191;
                        case 192 -> 212;
                        case 193 -> 109;
                        case 194 -> 210;
                        case 195 -> 120;
                        case 196 -> 194;
                        case 197 -> 104;
                        case 198 -> 139;
                        case 199 -> 160;
                        case 200 -> 64;
                        case 201 -> 168;
                        case 202 -> 187;
                        case 203 -> 112;
                        case 204 -> 217;
                        case 205 -> 173;
                        case 206 -> 74;
                        case 207 -> 231;
                        case 208 -> 44;
                        case 209 -> 107;
                        case 210 -> 29;
                        case 211 -> 115;
                        case 212 -> 243;
                        case 213 -> 34;
                        case 214 -> 130;
                        case 215 -> 178;
                        case 216 -> 90;
                        case 217 -> 14;
                        case 218 -> 38;
                        case 219 -> 154;
                        case 220 -> 137;
                        case 221 -> 77;
                        case 222 -> 121;
                        case 223 -> 133;
                        case 224 -> 162;
                        case 225 -> 148;
                        case 226 -> 182;
                        case 227 -> 32;
                        case 228 -> 99;
                        case 229 -> 169;
                        case 230 -> 197;
                        case 231 -> 11;
                        case 232 -> 192;
                        case 233 -> 134;
                        case 234 -> 89;
                        case 235 -> 123;
                        case 236 -> 82;
                        case 237 -> 142;
                        case 238 -> 84;
                        case 239 -> 22;
                        case 240 -> 250;
                        case 241 -> 31;
                        case 242 -> 199;
                        case 243 -> 53;
                        case 244 -> 36;
                        case 245 -> 60;
                        case 246 -> 95;
                        case 247 -> 13;
                        case 248 -> 185;
                        case 249 -> 16;
                        case 250 -> 255;
                        case 251 -> 227;
                        case 252 -> 91;
                        case 253 -> 106;
                        case 254 -> 218;
                        default -> 20;
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
         ),
         48,
         null
      );
      var10000 = this;
      var10001 = 13902;
      var10002 = 4859;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         this,
         "Ore route",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI,
         15000L,
         0L,
         false,
         false,
         (Function0)(() -> c(this)),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = -32118;
                  short var10005 = 5248;
                  var10005 = -32117;
                  short var10006 = 32002;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = -32120;
                  short var10002 = 4156;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "Aò®%Î8»å\u0001[\u0089p \u008eÄÔy,ì\u0003æ{@\rê×ºSL{\t¯$_\u009c\u007f\"Ì»\u0085\f\u0082\u0080 z+~Â \u0000¦O\u0081P\u0015Õ_\u0003+\u0010x\u0083t)\u0093A\u0083\u0091ñíg!\u00adð¨\u001eK\u009aÐ7OzÌ\u0011A¾i&\u0015`}ñ3þ\u0097çs#\u0012Ý\u0082îMø÷ÇG¹\u0098\u000f\u0092>.[\u0005\u009a½÷é\u0003¡\u0085à\t9þÚC\u009b¼K\u0097¶«JcØÓ\u0002Ç\u0015";
                  int var4 = "Aò®%Î8»å\u0001[\u0089p \u008eÄÔy,ì\u0003æ{@\rê×ºSL{\t¯$_\u009c\u007f\"Ì»\u0085\f\u0082\u0080 z+~Â \u0000¦O\u0081P\u0015Õ_\u0003+\u0010x\u0083t)\u0093A\u0083\u0091ñíg!\u00adð¨\u001eK\u009aÐ7OzÌ\u0011A¾i&\u0015`}ñ3þ\u0097çs#\u0012Ý\u0082îMø÷ÇG¹\u0098\u000f\u0092>.[\u0005\u009a½÷é\u0003¡\u0085à\t9þÚC\u009b¼K\u0097¶«JcØÓ\u0002Ç\u0015"
                     .length();
                  char var1 = 16;
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
                              case 0 -> 57;
                              case 1 -> 127;
                              case 2 -> 105;
                              case 3 -> 126;
                              case 4 -> 58;
                              case 5 -> 29;
                              default -> 72;
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
                  int var2 = (var0 ^ -32118) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 36;
                        case 1 -> 225;
                        case 2 -> 190;
                        case 3 -> 110;
                        case 4 -> 47;
                        case 5 -> 69;
                        case 6 -> 111;
                        case 7 -> 167;
                        case 8 -> 171;
                        case 9 -> 7;
                        case 10 -> 18;
                        case 11 -> 145;
                        case 12 -> 217;
                        case 13 -> 96;
                        case 14 -> 151;
                        case 15 -> 222;
                        case 16 -> 252;
                        case 17 -> 144;
                        case 18 -> 226;
                        case 19 -> 40;
                        case 20 -> 39;
                        case 21 -> 3;
                        case 22 -> 204;
                        case 23 -> 177;
                        case 24 -> 27;
                        case 25 -> 101;
                        case 26 -> 5;
                        case 27 -> 37;
                        case 28 -> 219;
                        case 29 -> 240;
                        case 30 -> 41;
                        case 31 -> 78;
                        case 32 -> 77;
                        case 33 -> 64;
                        case 34 -> 153;
                        case 35 -> 138;
                        case 36 -> 236;
                        case 37 -> 72;
                        case 38 -> 215;
                        case 39 -> 9;
                        case 40 -> 201;
                        case 41 -> 17;
                        case 42 -> 130;
                        case 43 -> 107;
                        case 44 -> 91;
                        case 45 -> 254;
                        case 46 -> 74;
                        case 47 -> 12;
                        case 48 -> 0;
                        case 49 -> 231;
                        case 50 -> 168;
                        case 51 -> 248;
                        case 52 -> 79;
                        case 53 -> 108;
                        case 54 -> 152;
                        case 55 -> 140;
                        case 56 -> 75;
                        case 57 -> 21;
                        case 58 -> 54;
                        case 59 -> 214;
                        case 60 -> 139;
                        case 61 -> 224;
                        case 62 -> 55;
                        case 63 -> 228;
                        case 64 -> 49;
                        case 65 -> 16;
                        case 66 -> 164;
                        case 67 -> 82;
                        case 68 -> 235;
                        case 69 -> 150;
                        case 70 -> 48;
                        case 71 -> 179;
                        case 72 -> 221;
                        case 73 -> 195;
                        case 74 -> 87;
                        case 75 -> 205;
                        case 76 -> 247;
                        case 77 -> 2;
                        case 78 -> 65;
                        case 79 -> 83;
                        case 80 -> 89;
                        case 81 -> 52;
                        case 82 -> 127;
                        case 83 -> 141;
                        case 84 -> 95;
                        case 85 -> 211;
                        case 86 -> 70;
                        case 87 -> 104;
                        case 88 -> 122;
                        case 89 -> 81;
                        case 90 -> 207;
                        case 91 -> 233;
                        case 92 -> 203;
                        case 93 -> 244;
                        case 94 -> 102;
                        case 95 -> 73;
                        case 96 -> 175;
                        case 97 -> 176;
                        case 98 -> 160;
                        case 99 -> 186;
                        case 100 -> 46;
                        case 101 -> 188;
                        case 102 -> 200;
                        case 103 -> 93;
                        case 104 -> 239;
                        case 105 -> 192;
                        case 106 -> 154;
                        case 107 -> 183;
                        case 108 -> 197;
                        case 109 -> 198;
                        case 110 -> 98;
                        case 111 -> 249;
                        case 112 -> 148;
                        case 113 -> 22;
                        case 114 -> 250;
                        case 115 -> 132;
                        case 116 -> 220;
                        case 117 -> 121;
                        case 118 -> 159;
                        case 119 -> 28;
                        case 120 -> 84;
                        case 121 -> 1;
                        case 122 -> 25;
                        case 123 -> 86;
                        case 124 -> 10;
                        case 125 -> 97;
                        case 126 -> 143;
                        case 127 -> 45;
                        case 128 -> 63;
                        case 129 -> 92;
                        case 130 -> 29;
                        case 131 -> 53;
                        case 132 -> 56;
                        case 133 -> 66;
                        case 134 -> 166;
                        case 135 -> 218;
                        case 136 -> 20;
                        case 137 -> 51;
                        case 138 -> 116;
                        case 139 -> 232;
                        case 140 -> 114;
                        case 141 -> 134;
                        case 142 -> 253;
                        case 143 -> 146;
                        case 144 -> 234;
                        case 145 -> 202;
                        case 146 -> 169;
                        case 147 -> 113;
                        case 148 -> 85;
                        case 149 -> 173;
                        case 150 -> 94;
                        case 151 -> 99;
                        case 152 -> 57;
                        case 153 -> 35;
                        case 154 -> 13;
                        case 155 -> 88;
                        case 156 -> 187;
                        case 157 -> 62;
                        case 158 -> 126;
                        case 159 -> 43;
                        case 160 -> 30;
                        case 161 -> 106;
                        case 162 -> 216;
                        case 163 -> 61;
                        case 164 -> 129;
                        case 165 -> 230;
                        case 166 -> 155;
                        case 167 -> 103;
                        case 168 -> 125;
                        case 169 -> 142;
                        case 170 -> 42;
                        case 171 -> 135;
                        case 172 -> 213;
                        case 173 -> 59;
                        case 174 -> 162;
                        case 175 -> 90;
                        case 176 -> 117;
                        case 177 -> 15;
                        case 178 -> 174;
                        case 179 -> 184;
                        case 180 -> 182;
                        case 181 -> 210;
                        case 182 -> 243;
                        case 183 -> 206;
                        case 184 -> 189;
                        case 185 -> 68;
                        case 186 -> 180;
                        case 187 -> 212;
                        case 188 -> 157;
                        case 189 -> 131;
                        case 190 -> 165;
                        case 191 -> 223;
                        case 192 -> 44;
                        case 193 -> 31;
                        case 194 -> 158;
                        case 195 -> 227;
                        case 196 -> 58;
                        case 197 -> 24;
                        case 198 -> 196;
                        case 199 -> 119;
                        case 200 -> 149;
                        case 201 -> 133;
                        case 202 -> 163;
                        case 203 -> 199;
                        case 204 -> 115;
                        case 205 -> 14;
                        case 206 -> 11;
                        case 207 -> 255;
                        case 208 -> 105;
                        case 209 -> 238;
                        case 210 -> 19;
                        case 211 -> 137;
                        case 212 -> 100;
                        case 213 -> 112;
                        case 214 -> 251;
                        case 215 -> 123;
                        case 216 -> 156;
                        case 217 -> 147;
                        case 218 -> 80;
                        case 219 -> 32;
                        case 220 -> 67;
                        case 221 -> 178;
                        case 222 -> 109;
                        case 223 -> 6;
                        case 224 -> 208;
                        case 225 -> 23;
                        case 226 -> 76;
                        case 227 -> 8;
                        case 228 -> 241;
                        case 229 -> 161;
                        case 230 -> 246;
                        case 231 -> 71;
                        case 232 -> 60;
                        case 233 -> 229;
                        case 234 -> 4;
                        case 235 -> 128;
                        case 236 -> 124;
                        case 237 -> 193;
                        case 238 -> 26;
                        case 239 -> 191;
                        case 240 -> 170;
                        case 241 -> 237;
                        case 242 -> 38;
                        case 243 -> 136;
                        case 244 -> 33;
                        case 245 -> 209;
                        case 246 -> 185;
                        case 247 -> 245;
                        case 248 -> 242;
                        case 249 -> 50;
                        case 250 -> 118;
                        case 251 -> 120;
                        case 252 -> 194;
                        case 253 -> 181;
                        case 254 -> 34;
                        default -> 172;
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
         ),
         56,
         null
      );
      var10000 = this;
      var10001 = 13899;
      var10002 = 24405;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         this,
         "Ore mined progress",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI,
         20000L,
         0L,
         (Function0)(() -> bt()),
         false,
         false,
         (Function0)(() -> bu()),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = -28155;
                  short var10005 = -4397;
                  var10005 = -28153;
                  short var10006 = -5684;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = -28154;
                  short var10002 = -6609;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "ó\u0004õ\u0013Ós\u0014í\u0088WP\u0087\u0096|söÉ.ÛùT¡êB\u0087?\u008d\u0081ï}W¨Ä:Ûs¾FàC(¤\u0014õ\u000e-î5µ6sJYf:\u0081òQS\u009cE§ÀÀø0©¨$X\u0014O+ÞîÊ\u0011Éfµû¼K[]\n\u0083÷ÞÊ\u0096H\u0096\u0085åº\u00ad\u009b%\u0012\rô*\u008f¬DP =\u009f¶?c£aC\u0003yzß\u008c\u0002ùé\u0010b\u0095Ç!\u00955Ü%\u0091Ns¤ò\u0018ÿz";
                  int var4 = "ó\u0004õ\u0013Ós\u0014í\u0088WP\u0087\u0096|söÉ.ÛùT¡êB\u0087?\u008d\u0081ï}W¨Ä:Ûs¾FàC(¤\u0014õ\u000e-î5µ6sJYf:\u0081òQS\u009cE§ÀÀø0©¨$X\u0014O+ÞîÊ\u0011Éfµû¼K[]\n\u0083÷ÞÊ\u0096H\u0096\u0085åº\u00ad\u009b%\u0012\rô*\u008f¬DP =\u009f¶?c£aC\u0003yzß\u008c\u0002ùé\u0010b\u0095Ç!\u00955Ü%\u0091Ns¤ò\u0018ÿz"
                     .length();
                  char var1 = 'y';
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 93;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 93;
                           var10006 = var6;
                        } else {
                           var13 = 93;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 93;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 42;
                              case 1 -> 49;
                              case 2 -> 51;
                              case 3 -> 106;
                              case 4 -> 50;
                              case 5 -> 39;
                              default -> 112;
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
                  int var2 = (var0 ^ -28153) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 26;
                        case 1 -> 134;
                        case 2 -> 146;
                        case 3 -> 96;
                        case 4 -> 73;
                        case 5 -> 62;
                        case 6 -> 55;
                        case 7 -> 27;
                        case 8 -> 234;
                        case 9 -> 52;
                        case 10 -> 28;
                        case 11 -> 102;
                        case 12 -> 64;
                        case 13 -> 91;
                        case 14 -> 180;
                        case 15 -> 46;
                        case 16 -> 101;
                        case 17 -> 136;
                        case 18 -> 36;
                        case 19 -> 238;
                        case 20 -> 233;
                        case 21 -> 86;
                        case 22 -> 154;
                        case 23 -> 92;
                        case 24 -> 71;
                        case 25 -> 126;
                        case 26 -> 208;
                        case 27 -> 138;
                        case 28 -> 118;
                        case 29 -> 222;
                        case 30 -> 38;
                        case 31 -> 176;
                        case 32 -> 152;
                        case 33 -> 89;
                        case 34 -> 231;
                        case 35 -> 159;
                        case 36 -> 74;
                        case 37 -> 1;
                        case 38 -> 162;
                        case 39 -> 205;
                        case 40 -> 34;
                        case 41 -> 68;
                        case 42 -> 248;
                        case 43 -> 215;
                        case 44 -> 206;
                        case 45 -> 82;
                        case 46 -> 212;
                        case 47 -> 130;
                        case 48 -> 5;
                        case 49 -> 179;
                        case 50 -> 211;
                        case 51 -> 133;
                        case 52 -> 237;
                        case 53 -> 185;
                        case 54 -> 42;
                        case 55 -> 249;
                        case 56 -> 11;
                        case 57 -> 255;
                        case 58 -> 129;
                        case 59 -> 244;
                        case 60 -> 143;
                        case 61 -> 72;
                        case 62 -> 151;
                        case 63 -> 29;
                        case 64 -> 65;
                        case 65 -> 227;
                        case 66 -> 160;
                        case 67 -> 24;
                        case 68 -> 141;
                        case 69 -> 192;
                        case 70 -> 98;
                        case 71 -> 6;
                        case 72 -> 13;
                        case 73 -> 172;
                        case 74 -> 181;
                        case 75 -> 88;
                        case 76 -> 145;
                        case 77 -> 16;
                        case 78 -> 197;
                        case 79 -> 127;
                        case 80 -> 125;
                        case 81 -> 110;
                        case 82 -> 105;
                        case 83 -> 150;
                        case 84 -> 31;
                        case 85 -> 158;
                        case 86 -> 223;
                        case 87 -> 183;
                        case 88 -> 149;
                        case 89 -> 240;
                        case 90 -> 201;
                        case 91 -> 177;
                        case 92 -> 0;
                        case 93 -> 33;
                        case 94 -> 30;
                        case 95 -> 95;
                        case 96 -> 25;
                        case 97 -> 193;
                        case 98 -> 147;
                        case 99 -> 167;
                        case 100 -> 157;
                        case 101 -> 32;
                        case 102 -> 218;
                        case 103 -> 78;
                        case 104 -> 56;
                        case 105 -> 161;
                        case 106 -> 100;
                        case 107 -> 44;
                        case 108 -> 228;
                        case 109 -> 79;
                        case 110 -> 216;
                        case 111 -> 90;
                        case 112 -> 77;
                        case 113 -> 20;
                        case 114 -> 115;
                        case 115 -> 84;
                        case 116 -> 50;
                        case 117 -> 39;
                        case 118 -> 194;
                        case 119 -> 7;
                        case 120 -> 178;
                        case 121 -> 59;
                        case 122 -> 120;
                        case 123 -> 70;
                        case 124 -> 40;
                        case 125 -> 43;
                        case 126 -> 164;
                        case 127 -> 67;
                        case 128 -> 142;
                        case 129 -> 83;
                        case 130 -> 186;
                        case 131 -> 2;
                        case 132 -> 224;
                        case 133 -> 140;
                        case 134 -> 210;
                        case 135 -> 165;
                        case 136 -> 202;
                        case 137 -> 139;
                        case 138 -> 242;
                        case 139 -> 85;
                        case 140 -> 80;
                        case 141 -> 87;
                        case 142 -> 49;
                        case 143 -> 63;
                        case 144 -> 94;
                        case 145 -> 203;
                        case 146 -> 104;
                        case 147 -> 41;
                        case 148 -> 254;
                        case 149 -> 156;
                        case 150 -> 97;
                        case 151 -> 23;
                        case 152 -> 108;
                        case 153 -> 191;
                        case 154 -> 3;
                        case 155 -> 144;
                        case 156 -> 163;
                        case 157 -> 225;
                        case 158 -> 48;
                        case 159 -> 204;
                        case 160 -> 251;
                        case 161 -> 229;
                        case 162 -> 236;
                        case 163 -> 213;
                        case 164 -> 250;
                        case 165 -> 109;
                        case 166 -> 174;
                        case 167 -> 214;
                        case 168 -> 75;
                        case 169 -> 135;
                        case 170 -> 122;
                        case 171 -> 114;
                        case 172 -> 132;
                        case 173 -> 239;
                        case 174 -> 253;
                        case 175 -> 57;
                        case 176 -> 119;
                        case 177 -> 219;
                        case 178 -> 10;
                        case 179 -> 137;
                        case 180 -> 15;
                        case 181 -> 190;
                        case 182 -> 169;
                        case 183 -> 195;
                        case 184 -> 182;
                        case 185 -> 81;
                        case 186 -> 189;
                        case 187 -> 166;
                        case 188 -> 123;
                        case 189 -> 217;
                        case 190 -> 66;
                        case 191 -> 69;
                        case 192 -> 99;
                        case 193 -> 131;
                        case 194 -> 173;
                        case 195 -> 168;
                        case 196 -> 12;
                        case 197 -> 54;
                        case 198 -> 4;
                        case 199 -> 112;
                        case 200 -> 76;
                        case 201 -> 232;
                        case 202 -> 171;
                        case 203 -> 196;
                        case 204 -> 18;
                        case 205 -> 153;
                        case 206 -> 252;
                        case 207 -> 14;
                        case 208 -> 184;
                        case 209 -> 220;
                        case 210 -> 245;
                        case 211 -> 53;
                        case 212 -> 199;
                        case 213 -> 241;
                        case 214 -> 200;
                        case 215 -> 93;
                        case 216 -> 8;
                        case 217 -> 116;
                        case 218 -> 170;
                        case 219 -> 113;
                        case 220 -> 247;
                        case 221 -> 37;
                        case 222 -> 45;
                        case 223 -> 207;
                        case 224 -> 148;
                        case 225 -> 246;
                        case 226 -> 155;
                        case 227 -> 61;
                        case 228 -> 106;
                        case 229 -> 226;
                        case 230 -> 107;
                        case 231 -> 187;
                        case 232 -> 230;
                        case 233 -> 124;
                        case 234 -> 60;
                        case 235 -> 103;
                        case 236 -> 188;
                        case 237 -> 128;
                        case 238 -> 198;
                        case 239 -> 22;
                        case 240 -> 243;
                        case 241 -> 175;
                        case 242 -> 221;
                        case 243 -> 47;
                        case 244 -> 51;
                        case 245 -> 111;
                        case 246 -> 17;
                        case 247 -> 117;
                        case 248 -> 209;
                        case 249 -> 35;
                        case 250 -> 121;
                        case 251 -> 21;
                        case 252 -> 19;
                        case 253 -> 58;
                        case 254 -> 9;
                        default -> 235;
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
         ),
         104,
         null
      );
   }

   public void polinex$oreTickOriginal() {
      Object var66 = null; // PX-FIX
      Object var65 = null; // PX-FIX
      boolean var59 = false; // PX-FIX
      boolean var54 = false; // PX-FIX
      boolean var48 = false; // PX-FIX
      boolean var47 = false; // PX-FIX
      Object var46 = null; // PX-FIX
      Object var43 = null; // PX-FIX
      Object var37 = null; // PX-FIX
      int var55;
      label472: {
         label409: {
            int var1;
            label410: {
               var1 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
               var55 = ((int[])(Object)(lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl))[this.W()
                  .ordinal()];
               if (var1 != 0) {
                  switch (var55) {
                     case 1:
                        var55 = ((this.aK()) ? 1 : 0);
                        break;
                     case 2:
                        break label410;
                     default:
                        return;
                  }
               }

               label396: {
                  label395: {
                     label394: {
                        if (var1 != 0) {
                           if (var55 == 0) {
                              return;
                           }

                           var37 = this;
                           if (var1 == 0) {
                              break label394;
                           }

                           var55 = ((int[])(Object)(lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl))[this.aJ()
                              .a()
                              .ordinal()];
                        }

                        switch (var55) {
                           case 1:
                              var37 = this;
                              break;
                           case 2:
                              break label395;
                           default:
                              break label396;
                        }
                     }

                     this.a(
                        IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI,
                        2000
                     );
                     if (var1 != 0) {
                        return;
                     }
                  }

                  this.bq();
                  this.ba();
                  PolinexOreForgeRecovery.onForgeArrival(this);
               }

               if (var1 != 0) {
                  return;
               }
            }

            ClientLevel var38 = this.ap().level;
            if (var38 == null) {
               return;
            }

            ClientLevel var2 = var38;
            if (var1 == 0) {
               return;
            }

            LocalPlayer var39 = this.ap().player;
            if (var39 == null) {
               return;
            }

            LocalPlayer var3 = var39;
            Object var40 = this;
            if (var1 != 0) {
               if (this.a9() > CollectionsKt.getLastIndex(this.ac())) {
                  lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI var41 = this;
                  if (var1 != 0) {
                     if (this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll
                        == lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        )
                      {
                        String var19;
                        label414: {
                           List var42 = var2.players();
                           short var10002 = 13898;
                           short var10003 = 15058;
                           Intrinsics.checkNotNullExpressionValue(var42, "players(...)");
                           List var4 = var42;
                           var19 = null;
                           var19 = "";
                           var var6 = var4;
                           boolean var7 = false;
                           var43 = var6;
                           label372:
                           if (var1 != 0) {
                              if (var6 instanceof Collection) {
                                 var43 = (Collection)var6;
                                 if (var1 == 0) {
                                    break label372;
                                 }

                                 if (((me.octo.client.PXDyn)var43).isEmpty()) {
                                    var55 = 0;
                                    break label414;
                                 }
                              }

                              var43 = var6;
                           }

                           Iterator var8 = ((me.octo.client.PXDyn)var43).iterator();

                           label363:
                           while (true) {
                              if (!var8.hasNext()) {
                                 var55 = 0;
                                 break;
                              }

                              Object var9 = var8.next();
                              AbstractClientPlayer var10 = (AbstractClientPlayer)var9;
                              boolean var11 = false;
                              me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var45 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                              String var10001 = var10.getName().getString();
                              var10003 = 13897;
                              short var10004 = 2727;
                              Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
                              var19 = var45.a(var10001);
                              var55 = var10.getId();

                              while (true) {
                                 label359: {
                                    if (var55 != var3.getId()) {
                                       label417: {
                                          var var12 = this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
                                          boolean var13 = false;
                                          var46 = var12;
                                          label355:
                                          if (var1 != 0) {
                                             if (var12 instanceof Collection) {
                                                var46 = var12;
                                                if (var1 == 0) {
                                                   break label355;
                                                }

                                                if (((me.octo.client.PXDyn)var46).isEmpty()) {
                                                   var47 = false;
                                                   break label417;
                                                }
                                             }

                                             var46 = var12;
                                          }

                                          Iterator var14 = ((me.octo.client.PXDyn)var46).iterator();

                                          label348:
                                          while (true) {
                                             if (!var14.hasNext()) {
                                                var47 = false;
                                                break;
                                             }

                                             Object var15 = var14.next();
                                             IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var16 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var15;
                                             boolean var17 = false;
                                             Intrinsics.checkNotNull(var10);
                                             var47 = this.a(
                                                var16,
                                                4.0,
                                                me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(
                                                   var10
                                                )
                                             );

                                             while (var47) {
                                                var47 = true;
                                                if (var1 != 0) {
                                                   break label348;
                                                }
                                             }
                                          }
                                       }

                                       if (var47) {
                                          var48 = true;
                                          break label359;
                                       }
                                    }

                                    var48 = false;
                                 }

                                 if (!var48) {
                                    break;
                                 }

                                 var55 = 1;
                                 if (var1 != 0) {
                                    break label363;
                                 }
                              }
                           }
                        }

                        if (var55 != 0) {
                           this.a(
                              IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
                              10000
                           );
                           short var77 = 13896;
                           short var81 = 19439;
                           var81 = 13915;
                           short var83 = -20706;
                           this.a(
                              "Found player " + var19 + " on the route",
                              me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                           );
                           return;
                        }
                     }

                     this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                     this.a(0);
                     var41 = this;
                  }

                  var41.a(this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll);
               }

               var40 = this.ac().get(this.a9());
               short var74 = 13907;
               short var79 = -23841;
               Intrinsics.checkNotNullExpressionValue(var40, "get(...)");
            }

            label419: {
               label473: {
                  IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var18;
                  label440: {
                     label422: {
                        label423: {
                           var18 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var40;
                           switch (((int[])(Object)(lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII))[var18.b()
                              .ordinal()]) {
                              case 1:
                                 double var20;
                                 Vec3 var27;
                                 label310: {
                                    label425: {
                                       var20 = Double.MAX_VALUE;
                                       var27 = this.bp();
                                       if (var1 != 0) {
                                          if (var27 == null) {
                                             break label425;
                                          }

                                          var20 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                             .b(var27, true);
                                       }

                                       double var84;
                                       var55 = (var84 = var20 - 12.0) == 0.0 ? 0 : (var84 < 0.0 ? -1 : 1);
                                       if (var1 == 0) {
                                          break label310;
                                       }

                                       if (var55 < 0) {
                                          IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                             .e()
                                             .a(var27);
                                       }
                                    }

                                    var55 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a(
                                       this, var18, 0.0, null);
                                 }

                                 label300: {
                                    label299: {
                                       if (var1 != 0) {
                                          if (var55 == 0) {
                                             double var85;
                                             var55 = (var85 = var20 - 3.0) == 0.0 ? 0 : (var85 < 0.0 ? -1 : 1);
                                             if (var1 == 0) {
                                                break label300;
                                             }

                                             if (var55 >= 0) {
                                                break label299;
                                             }
                                          }

                                          var55 = this.a9();
                                       }

                                       int var32 = var55;
                                       this.a(var32 + 1);
                                       IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                          .e()
                                          .k();
                                       if (var1 != 0) {
                                          return;
                                       }
                                    }

                                    var55 = ((IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                       .e()
                                       .d()) ? 1 : 0);
                                 }

                                 if (var1 != 0) {
                                    if (var55 == 0) {
                                       return;
                                    }

                                    IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                                       ((BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                          .e())),
                                       ((IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll)(Object)(var18.a())),
                                       var27,
                                       false);
                                 }

                                 if (var1 != 0) {
                                    return;
                                 }
                              case 2:
                                 label288: {
                                    var55 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a(
                                       this, var18, 0.0, null);
                                    if (var1 != 0) {
                                       if (var55 == 0) {
                                          break label288;
                                       }

                                       var55 = this.a9();
                                    }

                                    int var21 = var55;
                                    this.a(var21 + 1);
                                    me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                       .g();
                                    if (var1 != 0) {
                                       return;
                                    }
                                 }

                                 me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(
                                    me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                                    var18.c(),
                                    false);
                                 short var69 = 13909;
                                 short var75 = -23151;
                                 me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                    .a(
                                       "jump",
                                       me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                          .j()
                                    );
                                 Vec3 var52 = var18.c()
                                    .add(0.0, 0.5, 0.0)
                                    .add(me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.g());
                                 var75 = 13906;
                                 short var80 = -11994;
                                 Intrinsics.checkNotNullExpressionValue(var52, "add(...)");
                                 me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.a(var52);
                                 if (var1 != 0) {
                                    return;
                                 }
                              case 3:
                                 break;
                              case 4:
                                 break label423;
                              case 5:
                                 break label422;
                              case 6:
                              case 7:
                                 break label440;
                              default:
                                 return;
                           }

                           var55 = (llIlIlIIlIIlIlIllIIIIIIIIlIIIIlIIlIIllllllIIIllIIllllIlIlllIIIIllIIIIlllllIlIIllllIIl.a(
                              IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                 .f(),
                              var18.a(),
                              null,
                              2,
                              null
                           ) ? 1 : 0);
                           if (var1 != 0) {
                              if (var55 == 0) {
                                 return;
                              }

                              var55 = this.a9();
                           }

                           int var22 = var55;
                           this.a(var22 + 1);
                           if (var1 != 0) {
                              return;
                           }
                        }

                        me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var23 = this.a7();
                        boolean var25 = IIIIlIlIIIlllIIllIlllIIIllIIIllIIlllIIlIIlIIIlIIllllIIIllIIIIllllIIlIIlllIllIlIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .b()
                           .al();
                        var54 = var25;
                        if (var1 == 0) {
                           break label473;
                        }

                        if (!var25 || var23 == null) {
                           var54 = var25;
                           break label473;
                        }

                        var55 = ((this.a(var18.a())) ? 1 : 0);
                        if (var1 == 0) {
                           break label472;
                        }

                        if (var55 != 0) {
                           var55 = this.a9();
                           break label472;
                        }

                        Vec3 var28 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .g(var18.a());
                        if (var1 != 0) {
                           if (me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .b(var28, true)
                              < 4.5) {
                              me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .p();
                              me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll var56 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                              if (var1 != 0) {
                                 if (me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                       .K()
                                    != var23.b()) {
                                    me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                       .b(var23.b());
                                    return;
                                 }

                                 me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a(var28);
                                 var56 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                              }

                              BlockHitResult var33 = var56.I();
                              BlockHitResult var57 = var33;
                              if (var1 != 0) {
                                 if (var33 == null) {
                                    return;
                                 }

                                 var57 = var33;
                              }

                              var55 = ((Intrinsics.areEqual(var57.getBlockPos(), var18.a())) ? 1 : 0);
                              if (var1 != 0) {
                                 if (var55 == 0) {
                                    return;
                                 }

                                 var55 = ((me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                    .j()) ? 1 : 0);
                              }

                              if (var1 != 0) {
                                 if (var55 == 0) {
                                    return;
                                 }

                                 me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                    .g();
                                 var55 = this.a9();
                              }

                              int var35 = var55;
                              this.a(var35 + 1);
                              if (var1 != 0) {
                                 return;
                              }
                           }

                           me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(
                              me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                              llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(var3),
                              var28,
                              false,
                              0.0);
                        }

                        if (var1 != 0) {
                           return;
                        }
                     }

                     me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var24 = this.a8();
                     boolean var26 = IIIIlIlIIIlllIIllIlllIIIllIIIllIIlllIIlIIlIIIlIIllllIIIllIIIIllllIIlIIlllIllIlIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .c()
                        .al();
                     var59 = var26;
                     if (var1 == 0) {
                        break label419;
                     }

                     if (!var26 || var24 == null) {
                        var59 = var26;
                        break label419;
                     }

                     var55 = ((this.b(var18.a())) ? 1 : 0);
                     if (var1 == 0) {
                        break label409;
                     }

                     if (var55 != 0) {
                        var55 = this.a9();
                        break label409;
                     }

                     Vec3 var29 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .g(var18.a());
                     if (var1 != 0) {
                        if (me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .b(var29, true)
                           < 4.5) {
                           me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .p();
                           me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll var61 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                           if (var1 != 0) {
                              if (me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                    .K()
                                 != var24.b()) {
                                 me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                    .b(var24.b());
                                 return;
                              }

                              me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a(var29);
                              var61 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                           }

                           BlockHitResult var34 = var61.I();
                           BlockHitResult var62 = var34;
                           if (var1 != 0) {
                              if (var34 == null) {
                                 return;
                              }

                              var62 = var34;
                           }

                           var55 = ((Intrinsics.areEqual(var62.getBlockPos(), var18.a())) ? 1 : 0);
                           if (var1 != 0) {
                              if (var55 == 0) {
                                 return;
                              }

                              var55 = ((me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .j()) ? 1 : 0);
                           }

                           if (var1 != 0) {
                              if (var55 == 0) {
                                 return;
                              }

                              me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .g();
                              var55 = this.a9();
                           }

                           int var36 = var55;
                           this.a(var36 + 1);
                           if (var1 != 0) {
                              return;
                           }
                        }

                        me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(
                           me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                           llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(var3),
                           var29,
                           false,
                           0.0);
                     }

                     if (var1 != 0) {
                        return;
                     }
                  }

                  label429: {
                     boolean var64 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                        .c()
                        .b();
                     if (var1 != 0) {
                        if (!var64) {
                           ArrayList var71;
                           label189: {
                              var65 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                                 .c();
                              lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI var70 = this;
                              if (var1 != 0) {
                                 ((me.octo.client.PXDyn)var65).k(this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI);
                                 var65 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                                    .c();
                                 if (var18.b()
                                    == me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                    )
                                  {
                                    var71 = new ArrayList();
                                    break label189;
                                 }

                                 var70 = this;
                              }

                              var71 = var70.a(
                                 me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                              );
                           }

                           ((me.octo.client.PXDyn)var65).b(var71);
                           lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                              .c()
                              .c(
                                 IIIIlIlIIIlllIIllIlllIIIllIIIllIIlllIIlIIlIIIlIIllllIIIllIIIIllllIIlIIlllIllIlIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .a()
                                    .al()
                              );
                           lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                              .c()
                              .c(
                                 me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                    .t()
                              );
                           if (var1 != 0) {
                              return;
                           }
                        }

                        var66 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                           .c();
                        if (var1 == 0) {
                           break label429;
                        }

                        var64 = ((me.octo.client.PXDyn)var66).c();
                     }

                     if (!var64) {
                        return;
                     }

                     var66 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                        .c();
                  }

                  ((me.octo.client.PXDyn)var66).j(false);
                  this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = true;
                  this.a(
                     this.e(
                        Math.max(
                           1,
                           lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                              .c()
                              .W()
                              .size()
                        )
                     )
                  );
                  return;
               }

               if (var54) {
                  short var68 = 13918;
                  short var73 = 9722;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                     "No regeneration orb found in your hotbar!"
                  );
               }

               this.a(
                  this.e(
                     this.a(
                           me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                        )
                        .size()
                  )
               );
               return;
            }

            if (var59) {
               short var67 = 13943;
               short var72 = -11805;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                  "No lantern found in your hotbar!"
               );
            }

            this.a(
               this.e(
                  this.a(
                        me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                     )
                     .size()
               )
            );
            return;
         }

         int var30 = var55;
         this.a(var30 + 1);
         return;
      }

      int var31 = var55;
      this.a(var31 + 1);
   }

   @SubscribeEvent
   public final void c(@NotNull me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      int var10000 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      short var10002 = 13892;
      short var10003 = 15413;
      Intrinsics.checkNotNullParameter(var1, "event");
      Packet var3 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      int var2 = var10000;
      int var5 = ((var3 instanceof ClientboundSystemChatPacket) ? 1 : 0);
      if (var2 == 0) {
         if ((var5 == 0)) {
            return;
         }

         var5 = ((((ClientboundSystemChatPacket)var3).overlay() ? 1 : 0));
      }

      if ((var5 != 0)) {
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var6 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         String var10001 = ((ClientboundSystemChatPacket)var3).content().getString();
         var10003 = 13897;
         short var10004 = 2727;
         Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
         String var4 = var6.a(var10001);
         var5 = var4.length();
         if (var2 == 0) {
            if (var5 < 3) {
               return;
            }

            CharSequence var8 = var4;
            short var9 = 13940;
            var10002 = 1577;
            var5 = ((StringsKt.contains(var8, "NOT ENOUGH MANA", false)) ? 1 : 0);
         }

         if (var5 != 0) {
            this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = false;
         }
      }
   }

   private final boolean a(BlockPos var1) {
      int var2 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      if (var2 == 0) {
         ClientLevel var10000 = this.ap().level;
         if (var10000 != null) {
            ClientLevel var3 = var10000;
            AABB var9 = AABB.ofSize(var1.getCenter(), 10.0, 10.0, 10.0);
            short var10002 = 13895;
            short var10003 = -7744;
            Intrinsics.checkNotNullExpressionValue(var9, "ofSize(...)");
            AABB var4 = var9;
            List var10 = var3.getEntitiesOfClass(
               ArmorStand.class, var4, lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI::a
            );
            var10002 = 13900;
            var10003 = -26845;
            Intrinsics.checkNotNullExpressionValue(var10, "getEntitiesOfClass(...)");

            label43:
            for (Object var11 : var10) {
               var10002 = 13904;
               var10003 = -27226;
               Intrinsics.checkNotNullExpressionValue(var11, "next(...)");
               ArmorStand var7 = (ArmorStand)var11;
               String var12 = var7.getName().getString();
               var10002 = 13916;
               var10003 = -1879;
               Intrinsics.checkNotNullExpressionValue(var12, "getString(...)");
               String var8 = var12;
               CharSequence var13 = var8;
               short var10001 = 13908;
               var10002 = 19310;
               boolean var14 = StringsKt.contains(var13, "Radiant", false);

               while (var2 == 0) {
                  if (!var14) {
                     CharSequence var15 = var8;
                     var10001 = 13894;
                     var10002 = -20455;
                     boolean var34 = StringsKt.contains(var15, "Mana", false);
                     if (var2 != 0) {
                        return var34;
                     }

                     if (!var34) {
                        CharSequence var16 = var8;
                        var10001 = 13889;
                        var10002 = 19255;
                        boolean var35 = StringsKt.contains(var16, "Overflux", false);
                        if (var2 != 0) {
                           return var35;
                        }

                        if (!var35) {
                           CharSequence var17 = var8;
                           var10001 = 13919;
                           var10002 = -28258;
                           boolean var36 = StringsKt.contains(var17, "Plasma", false);
                           if (var2 != 0) {
                              return var36;
                           }

                           if (!var36) {
                              CharSequence var18 = var8;
                              var10001 = 13911;
                              var10002 = -20988;
                              if (!StringsKt.contains(var18, "Flare", false)) {
                                 continue label43;
                              }
                           }
                        }
                     }
                  }

                  var14 = true;
                  if (var2 == 0) {
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

   private final boolean b(BlockPos var1) {
      int var2 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      if (var2 == 0) {
         ClientLevel var10000 = this.ap().level;
         if (var10000 != null) {
            ClientLevel var3 = var10000;
            AABB var9 = AABB.ofSize(var1.getCenter(), 10.0, 10.0, 10.0);
            short var10002 = 13910;
            short var10003 = 26306;
            Intrinsics.checkNotNullExpressionValue(var9, "ofSize(...)");
            AABB var4 = var9;
            List var10 = var3.getEntitiesOfClass(
               ArmorStand.class, var4, lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI::b
            );
            var10002 = 13901;
            var10003 = 11801;
            Intrinsics.checkNotNullExpressionValue(var10, "getEntitiesOfClass(...)");

            label28:
            for (Object var11 : var10) {
               var10002 = 13912;
               var10003 = -30482;
               Intrinsics.checkNotNullExpressionValue(var11, "next(...)");
               ArmorStand var7 = (ArmorStand)var11;
               String var12 = var7.getName().getString();
               var10002 = 13897;
               var10003 = 2727;
               Intrinsics.checkNotNullExpressionValue(var12, "getString(...)");
               String var8 = var12;
               CharSequence var13 = var8;
               short var10001 = 13893;
               var10002 = -11135;
               boolean var14 = StringsKt.contains(var13, "Lantern", false);

               while (var2 == 0) {
                  if (!var14) {
                     CharSequence var15 = var8;
                     var10001 = 13890;
                     var10002 = -15101;
                     if (!StringsKt.contains(var15, "Will-o'-wisp", false)) {
                        continue label28;
                     }
                  }

                  var14 = true;
                  if (var2 == 0) {
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

   private final Vec3 bp() {
      Vec3 var2 = null;
      int var10000 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      double var3 = Double.MAX_VALUE;
      int var1 = var10000;
      int var5 = 1;
      int var6 = Math.min(this.ac().size(), 15);
      if (var5 <= var6) {
         do {
            int var7 = (this.a9() + var5) % this.ac().size();
            Object var11 = this.ac().get(var7);
            short var10002 = 13888;
            short var10003 = -10470;
            Intrinsics.checkNotNullExpressionValue(var11, "get(...)");
            IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var8 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var11;
            if (var8.b()
               == me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
               )
             {
               break;
            }

            label35: {
               label42: {
                  label33: {
                     me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var12 = var8.b();
                     me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var10001 = me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                     if (var1 == 0) {
                        if (var12
                           == me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                           )
                         {
                           break label33;
                        }

                        var12 = var8.b();
                        var10001 = me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                     }

                     if (var12 != var10001) {
                        break label42;
                     }
                  }

                  double var9 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(var8.c(), true);
                  double var14;
                  var10000 = (var14 = var9 - var3) == 0.0 ? 0 : (var14 < 0.0 ? -1 : 1);
                  if (var1 != 0) {
                     break label35;
                  }

                  if (var10000 < 0) {
                     var3 = var9;
                     var2 = var8.c();
                  }
               }

               var10000 =((Integer)( var5));
            }

            if (var10000 == var6) {
               break;
            }

            var5++;
         } while (var1 == 0);
      }

      return var2;
   }

   private final ArrayList<BlockPos> a(me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var1) {
      BlockPos[] var4 = new BlockPos[]{this.ac().get(this.a9()).a()};
      ArrayList var3 = CollectionsKt.arrayListOf(var4);
      Integer[] var5 = new Integer[]{this.a9()};
      int var10000 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      ArrayList var8 = CollectionsKt.arrayListOf(var5);
      int var9 = 1;
      int var6 = this.e(var9);
      int var2 = var10000;
      Object var10 = this.ac().get(var6);
      short var10002 = 13907;
      short var10003 = -23841;
      Intrinsics.checkNotNullExpressionValue(var10, "get(...)");
      IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var7 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var10;

      while (!var8.contains(var6)) {
         Object var11 = var7.b();
         Object var10001 = var1;
         if (var2 != 0) {
            if (var11 != var1) {
               break;
            }

            var3.add(var7.a());
            var8.add(var6);
            var6 = this.e(++var9);
            var11 = this.ac().get(var6);
            var10001 = var11;
         }

         var10002 = 13907;
         var10003 = -23841;
         Intrinsics.checkNotNullExpressionValue(var10001, "get(...)");
         var7 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var11;
         if (var2 == 0) {
            break;
         }
      }

      return var3;
   }

   private final int e(int var1) {
      int var2 = this.ac().size();
      return (this.a9() + var1) % var2;
   }

   private final void bq() {
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      this.a(this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl);
      lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a(this, 0.0, 1, null);
   }

   private final void br() {
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      this.a(this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll);
      lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a(this, 0.0, 1, null);
   }

   private final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      this.ae()
         .a(
            new lllIllIIllIIIIIIIlIIlIIIIIllllIlIIIIIllllIIlIIIIlllIIIIIIlIIIIlIlIIIIllIIllIIlllIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI,
               (kotlin.jvm.functions.Function0)(() -> d(this)),
               var1.d(),
               5000,
               2000,
               30000L,
               3,
               (kotlin.jvm.functions.Function0)(() -> e(this))
            )
         );
   }

   private final void bs() {
      this.aO();
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .p();
      short var10001 = 13913;
      short var10002 = 25640;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("attack", false);
      this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = true;
      me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .g();
      me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .g();
   }

   @Override
   public void ba() {
      Object var9 = null; // PX-FIX
      int var1;
      int var10;
      label52: {
         var10 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
         var var2 = this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
         var1 = var10;
         boolean var3 = false;
         var9 = var2;
         label48:
         if (var1 == 0) {
            if (var2 instanceof Collection) {
               var9 = var2;
               if (var1 != 0) {
                  break label48;
               }

               if (((me.octo.client.PXDyn)var9).isEmpty()) {
                  var10 = 0;
                  break label52;
               }
            }

            var9 = var2;
         }

         Iterator var4 = ((me.octo.client.PXDyn)var9).iterator();

         label39:
         while (true) {
            if (!var4.hasNext()) {
               var10 = 0;
               break;
            }

            Object var5 = var4.next();
            IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var6 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var5;
            boolean var7 = false;
            var10 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a(this, var6, 0.0, null);

            while ((var10 != 0)) {
               var10 = 1;
               if (var1 == 0) {
                  break label39;
               }
            }
         }
      }

      if ((var10 != 0)) {
         this.br();
      } else {
         int var8 = this.b(this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl);
         if (var1 == 0) {
            if (var8 >= 0) {
               this.bq();
               this.a(var8);
               return;
            }

            this.a(
               IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI,
               2000
            );
         }
      }
   }

   @Override
   public void M() {
      boolean var28 = false; // PX-FIX
      boolean var27 = false; // PX-FIX
      boolean var25 = false; // PX-FIX
      Object var24 = null; // PX-FIX
      boolean var22 = false; // PX-FIX
      Object var21 = null; // PX-FIX
      PolinexOreForgeRecovery.onMacroStart(this);
      int var1 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI var10000 = this;
      if (var1 != 0) {
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
      boolean var6;
      label212: {
         var10000.aM();
         var2 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g()
            != null;
         var3 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .q()
            != null;
         var4 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g()
            == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
         this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = llIllIIIIIIIlllIIIIlIlllIlllIIIIIIIlIlllIIlIIlIIlIllIIlIllIIllIlIlIllIlIIlIlIIIlIlIll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
            .a(0);
         this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = llIllIIIIIIIlllIIIIlIlllIlllIIIIIIIlIlllIIlIIlIIlIllIIlIllIIllIlIlIllIlIIlIlIIIlIlIll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
            .a(1);
         var5 = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl.isEmpty();
         var6 = this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll.isEmpty();
         var var8 = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
         boolean var9 = false;
         var21 = var8;
         label205:
         if (var1 != 0) {
            if (var8 instanceof Collection) {
               var21 = var8;
               if (var1 == 0) {
                  break label205;
               }

               if (((me.octo.client.PXDyn)var21).isEmpty()) {
                  var22 = false;
                  break label212;
               }
            }

            var21 = var8;
         }

         Iterator var10 = ((me.octo.client.PXDyn)var21).iterator();

         label196:
         while (true) {
            if (!var10.hasNext()) {
               var22 = false;
               break;
            }

            Object var11 = var10.next();
            IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var12 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var11;
            boolean var23 = false;

            while (
               var12.b()
                  == me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            ) {
               var22 = true;
               if (var1 != 0) {
                  break label196;
               }
            }
         }
      }

      label184: {
         if (!var22) {
            label215: {
               var var14 = this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
               boolean var16 = false;
               var24 = var14;
               label180:
               if (var1 != 0) {
                  if (var14 instanceof Collection) {
                     var24 = var14;
                     if (var1 == 0) {
                        break label180;
                     }

                     if (((me.octo.client.PXDyn)var24).isEmpty()) {
                        var25 = false;
                        break label215;
                     }
                  }

                  var24 = var14;
               }

               Iterator var18 = ((me.octo.client.PXDyn)var24).iterator();

               label173:
               while (true) {
                  if (!var18.hasNext()) {
                     var25 = false;
                     break;
                  }

                  Object var19 = var18.next();
                  IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var20 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var19;
                  boolean var26 = false;

                  while (
                     var20.b()
                        == me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                  ) {
                     var25 = true;
                     if (var1 != 0) {
                        break label173;
                     }
                  }
               }
            }

            if (!var25) {
               var27 = false;
               break label184;
            }
         }

         var27 = true;
      }

      boolean var7;
      boolean var15;
      var7 = var27;
      var15 = this.X() != null;
      var28 = var2;
      label157:
      if (var1 != 0) {
         if (var2) {
            var28 = var3;
            if (var1 == 0) {
               break label157;
            }

            label153:
            if (var3) {
               var28 = var7;
               if (var1 != 0) {
                  if (var7) {
                     var28 = var15;
                     if (var1 == 0) {
                        break label157;
                     }

                     if (!var15) {
                        break label153;
                     }
                  }

                  var28 = var4;
               }

               if (var1 == 0) {
                  break label157;
               }

               if (var28) {
                  var28 = var5;
                  if (var1 == 0) {
                     break label157;
                  }

                  if (!var5) {
                     var28 = var6;
                     if (var1 == 0) {
                        break label157;
                     }

                     if (!var6) {
                        super.M();
                        llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI[] var17 = new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI[]{
                           new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
                              llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                              null,
                              true
                           ),
                           new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
                              llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                              lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI::bv,
                              false
                           ),
                           new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
                              llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
                              lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI::bw,
                              false
                           ),
                           new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
                              llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                              lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI::bx,
                              false
                           ),
                           new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
                              llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
                              null,
                              false
                           )
                        };
                        this.a(CollectionsKt.listOf(var17));
                        this.ba();
                        return;
                     }
                  }
               }
            }
         }

         var28 = var2;
      }

      if (var1 != 0) {
         if (!var28) {
            this.bg();
         }

         var28 = var3;
      }

      if (var1 != 0) {
         if (!var28) {
            this.c(4);
         }

         var28 = var7;
      }

      label130:
      if (var1 != 0) {
         if (var28) {
            var28 = var15;
            if (var1 == 0) {
               break label130;
            }

            if (!var15) {
               this.aP();
            }
         }

         var28 = var4;
      }

      if (var1 != 0) {
         if (!var28) {
            this.b(
               CollectionsKt.listOf(
                  IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
               )
            );
         }

         var28 = var5;
      }

      if (var1 != 0) {
         if (var28) {
            llIllIIIIIIIlllIIIIlIlllIlllIIIIIIIlIlllIIlIIlIIlIllIIlIllIIllIlIlIllIlIIlIlIIIlIlIll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
               .c(0);
         }

         var28 = var6;
      }

      if (var28) {
         llIllIIIIIIIlllIIIIlIlllIlllIIIIIIIlIlllIIlIIlIIlIllIIlIllIIllIlIlIllIlIIlIlIIIlIlIll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
            .c(1);
      }

      this.N();
   }

   @Override
   public boolean af() {
      return this.W()
         == IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   private static final long a(lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI var0) {
      return var0.aJ().b() + 15000L;
   }

   private static final Object b(lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI var0) {
      return TuplesKt.to(
         var0.aJ().a(),
         IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
      );
   }

   private static final Object c(lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI var0) {
      return new lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         var0.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll,
         var0.a9(),
         var0.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI,
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(var0, 0.0, 1, null)
      );
   }

   private static final boolean bt() {
      return lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
         .c()
         .b();
   }

   private static final Object bu() {
      return me.octo.client.utils.IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .q();
   }

   private static final boolean a(ArmorStand var0) {
      short var10001 = 13891;
      short var10002 = -5294;
      Intrinsics.checkNotNullParameter(var0, "it");
      return true;
   }

   private static final boolean a(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final boolean b(ArmorStand var0) {
      short var10001 = 13941;
      short var10002 = -25542;
      Intrinsics.checkNotNullParameter(var0, "it");
      return true;
   }

   private static final boolean b(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final Unit d(lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI var0) {
      var0.ba();
      return Unit.INSTANCE;
   }

   private static final Unit e(lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI var0) {
      var0.bs();
      return Unit.INSTANCE;
   }

   private static final boolean f(lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI var0) {
      int var1 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      boolean var10000 = var0.af();
      if (var1 == 0) {
         if (!var10000) {
            return false;
         }

         var10000 = lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            .b();
      }

      return var1 != 0 ? var10000 : var10000;
   }

   private static final boolean bv() {
      return IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .e();
   }

   private static final boolean bw() {
      return IlllIIIIlIlllIlllllIlIlIIllIlllIlIIllllllIlllllIllIllllIllIIIllIIlIlIlllIIlIllIIlIlll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .a();
   }

   private static final boolean bx() {
      return IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .a();
   }

   private static final boolean g(lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI var0) {
      int var1 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
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
      String[] var5 = new String[35];
      int var3 = 0;
      String var2 = "-\u0002mÆ\u0007X\bõ\b\u0006Îw\u0005ø¬r+W\u000bóZ-¥×pi\u001f\\¤d9£\u008d|½n».Ð»&FS{\u0003Öû,\u0018Ð1ØO,æû@q½\u0081\u0013[¡\u0017[MM2A&ô\rÊS/Æ\u0099\u0095yNN\u0019ùEG»ØU\t7Ë¿é\u0099\f¾²g\bs0\u0013Ê\u0087¿»Ã\bl2&«3\u0093-F\r'\u0010ËÄs$6\u009bZ¼ì\u0087¨\u000e\f½ü\u0000 ®\u0019qr'ÆÖø\u0096\u0006\u00105»\u0019fº)ï\u001dØ~kqO=7ôcç\u00adçi,cþ½&qy\u0083Aâ\u009a8\u0097\u0095Z{E®¶\u000fk\u0082\u000fæ\u008cU\u0006£öÏhQÎ\t\u0017þ»O\u0019Ø®(e\rÜ\u0000S\u008f\u008cX\u0080¸ÙÞ_\u001c°\t\u0095jó|Ë/p,\u001c\u0007¥#\u009dpDc¡\u0005âòr¥Â\u000b1\u001fu\rÜe\b½pðá\u0004BÝ@º\bì-ÜB\u0005ýñÐ\b\bÃ|´jp\u0006:\u0002\u0098\u0018\f?;´bk'L½OÔ.\u009f\u0017\u0092\u0081/\u0091@NL±Ö+ÀÒ\u00861à\u001e\fÐ\u0085Ì=ª\u0017\u0017\u001b©\u001e\u0094fî\u0088¥N©Ó\u0082ä;¬_\u0085ø´É\u001b\nÓ\nõ\u001dÿ\u0092sá{\u00805F\t\u001b;\"VÎd\u001e\u008c\u000f\u000e}\u0086ÒgåB¡ìe\u0094$ ¤X\rZ\u009b2²È0\u000f¸\u008c\r\u0094´\u009e\u0012ýÎþèJµia\u0098G¦\u008f $\u0002\u0018\u008d\u0094\f\u0002²Ýã¢½`UM+A\u0096\u0002Nõ";
      int var4 = "-\u0002mÆ\u0007X\bõ\b\u0006Îw\u0005ø¬r+W\u000bóZ-¥×pi\u001f\\¤d9£\u008d|½n».Ð»&FS{\u0003Öû,\u0018Ð1ØO,æû@q½\u0081\u0013[¡\u0017[MM2A&ô\rÊS/Æ\u0099\u0095yNN\u0019ùEG»ØU\t7Ë¿é\u0099\f¾²g\bs0\u0013Ê\u0087¿»Ã\bl2&«3\u0093-F\r'\u0010ËÄs$6\u009bZ¼ì\u0087¨\u000e\f½ü\u0000 ®\u0019qr'ÆÖø\u0096\u0006\u00105»\u0019fº)ï\u001dØ~kqO=7ôcç\u00adçi,cþ½&qy\u0083Aâ\u009a8\u0097\u0095Z{E®¶\u000fk\u0082\u000fæ\u008cU\u0006£öÏhQÎ\t\u0017þ»O\u0019Ø®(e\rÜ\u0000S\u008f\u008cX\u0080¸ÙÞ_\u001c°\t\u0095jó|Ë/p,\u001c\u0007¥#\u009dpDc¡\u0005âòr¥Â\u000b1\u001fu\rÜe\b½pðá\u0004BÝ@º\bì-ÜB\u0005ýñÐ\b\bÃ|´jp\u0006:\u0002\u0098\u0018\f?;´bk'L½OÔ.\u009f\u0017\u0092\u0081/\u0091@NL±Ö+ÀÒ\u00861à\u001e\fÐ\u0085Ì=ª\u0017\u0017\u001b©\u001e\u0094fî\u0088¥N©Ó\u0082ä;¬_\u0085ø´É\u001b\nÓ\nõ\u001dÿ\u0092sá{\u00805F\t\u001b;\"VÎd\u001e\u008c\u000f\u000e}\u0086ÒgåB¡ìe\u0094$ ¤X\rZ\u009b2²È0\u000f¸\u008c\r\u0094´\u009e\u0012ýÎþèJµia\u0098G¦\u008f $\u0002\u0018\u008d\u0094\f\u0002²Ýã¢½`UM+A\u0096\u0002Nõ"
         .length();
      char var1 = 4;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 20;
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
                     case 0 -> 67;
                     case 1 -> 71;
                     case 2 -> 124;
                     case 3 -> 83;
                     case 4 -> 40;
                     case 5 -> 25;
                     default -> 29;
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
                     k = new String[35];
                     IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = new lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl = new lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI();
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

                  var2 = "\"DpFÁ\"q\u0005ØðÜF~\u0089t \u0082µ\u0010\u0010\u0013\r°ô\u0089ÞeJg}\u0093\u0007\u0016)ÜÁªàa\u000b\u009fa8ÖtV5î";
                  var4 = "\"DpFÁ\"q\u0005ØðÜF~\u0089t \u0082µ\u0010\u0010\u0013\r°ô\u0089ÞeJg}\u0093\u0007\u0016)ÜÁªàa\u000b\u009fa8ÖtV5î".length();
                  var1 = 15;
                  var8 = -1;
            }

            var10000 = 124;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String e(int var0, int var1) {
      int var2 = (var0 ^ 13909) & 65535;
      if (k[var2] == null) {
         char[] var3 = j[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 76;
            case 1 -> 71;
            case 2 -> 246;
            case 3 -> 133;
            case 4 -> 251;
            case 5 -> 99;
            case 6 -> 9;
            case 7 -> 140;
            case 8 -> 163;
            case 9 -> 166;
            case 10 -> 23;
            case 11 -> 91;
            case 12 -> 237;
            case 13 -> 164;
            case 14 -> 126;
            case 15 -> 17;
            case 16 -> 49;
            case 17 -> 219;
            case 18 -> 37;
            case 19 -> 122;
            case 20 -> 32;
            case 21 -> 193;
            case 22 -> 245;
            case 23 -> 5;
            case 24 -> 120;
            case 25 -> 202;
            case 26 -> 235;
            case 27 -> 224;
            case 28 -> 123;
            case 29 -> 214;
            case 30 -> 209;
            case 31 -> 138;
            case 32 -> 59;
            case 33 -> 42;
            case 34 -> 81;
            case 35 -> 177;
            case 36 -> 156;
            case 37 -> 148;
            case 38 -> 218;
            case 39 -> 47;
            case 40 -> 161;
            case 41 -> 28;
            case 42 -> 90;
            case 43 -> 26;
            case 44 -> 117;
            case 45 -> 175;
            case 46 -> 2;
            case 47 -> 102;
            case 48 -> 40;
            case 49 -> 73;
            case 50 -> 127;
            case 51 -> 55;
            case 52 -> 52;
            case 53 -> 233;
            case 54 -> 142;
            case 55 -> 190;
            case 56 -> 134;
            case 57 -> 63;
            case 58 -> 171;
            case 59 -> 204;
            case 60 -> 176;
            case 61 -> 114;
            case 62 -> 144;
            case 63 -> 77;
            case 64 -> 192;
            case 65 -> 104;
            case 66 -> 143;
            case 67 -> 157;
            case 68 -> 239;
            case 69 -> 211;
            case 70 -> 22;
            case 71 -> 135;
            case 72 -> 145;
            case 73 -> 170;
            case 74 -> 203;
            case 75 -> 213;
            case 76 -> 248;
            case 77 -> 252;
            case 78 -> 180;
            case 79 -> 241;
            case 80 -> 141;
            case 81 -> 149;
            case 82 -> 228;
            case 83 -> 58;
            case 84 -> 51;
            case 85 -> 173;
            case 86 -> 187;
            case 87 -> 199;
            case 88 -> 13;
            case 89 -> 97;
            case 90 -> 94;
            case 91 -> 109;
            case 92 -> 84;
            case 93 -> 60;
            case 94 -> 234;
            case 95 -> 226;
            case 96 -> 152;
            case 97 -> 137;
            case 98 -> 139;
            case 99 -> 222;
            case 100 -> 124;
            case 101 -> 7;
            case 102 -> 183;
            case 103 -> 78;
            case 104 -> 196;
            case 105 -> 217;
            case 106 -> 236;
            case 107 -> 75;
            case 108 -> 178;
            case 109 -> 96;
            case 110 -> 253;
            case 111 -> 68;
            case 112 -> 154;
            case 113 -> 92;
            case 114 -> 87;
            case 115 -> 53;
            case 116 -> 110;
            case 117 -> 121;
            case 118 -> 15;
            case 119 -> 167;
            case 120 -> 116;
            case 121 -> 86;
            case 122 -> 129;
            case 123 -> 207;
            case 124 -> 189;
            case 125 -> 107;
            case 126 -> 72;
            case 127 -> 242;
            case 128 -> 250;
            case 129 -> 20;
            case 130 -> 174;
            case 131 -> 118;
            case 132 -> 210;
            case 133 -> 43;
            case 134 -> 24;
            case 135 -> 93;
            case 136 -> 201;
            case 137 -> 197;
            case 138 -> 150;
            case 139 -> 115;
            case 140 -> 6;
            case 141 -> 125;
            case 142 -> 205;
            case 143 -> 85;
            case 144 -> 232;
            case 145 -> 66;
            case 146 -> 225;
            case 147 -> 88;
            case 148 -> 62;
            case 149 -> 29;
            case 150 -> 65;
            case 151 -> 130;
            case 152 -> 146;
            case 153 -> 230;
            case 154 -> 238;
            case 155 -> 103;
            case 156 -> 48;
            case 157 -> 184;
            case 158 -> 19;
            case 159 -> 34;
            case 160 -> 136;
            case 161 -> 64;
            case 162 -> 95;
            case 163 -> 61;
            case 164 -> 247;
            case 165 -> 113;
            case 166 -> 243;
            case 167 -> 46;
            case 168 -> 155;
            case 169 -> 80;
            case 170 -> 112;
            case 171 -> 162;
            case 172 -> 221;
            case 173 -> 215;
            case 174 -> 200;
            case 175 -> 27;
            case 176 -> 89;
            case 177 -> 100;
            case 178 -> 41;
            case 179 -> 30;
            case 180 -> 159;
            case 181 -> 101;
            case 182 -> 79;
            case 183 -> 206;
            case 184 -> 4;
            case 185 -> 45;
            case 186 -> 158;
            case 187 -> 67;
            case 188 -> 82;
            case 189 -> 240;
            case 190 -> 132;
            case 191 -> 165;
            case 192 -> 8;
            case 193 -> 169;
            case 194 -> 223;
            case 195 -> 181;
            case 196 -> 33;
            case 197 -> 119;
            case 198 -> 182;
            case 199 -> 35;
            case 200 -> 83;
            case 201 -> 14;
            case 202 -> 1;
            case 203 -> 70;
            case 204 -> 255;
            case 205 -> 151;
            case 206 -> 31;
            case 207 -> 172;
            case 208 -> 16;
            case 209 -> 216;
            case 210 -> 254;
            case 211 -> 74;
            case 212 -> 21;
            case 213 -> 153;
            case 214 -> 57;
            case 215 -> 231;
            case 216 -> 44;
            case 217 -> 25;
            case 218 -> 10;
            case 219 -> 36;
            case 220 -> 194;
            case 221 -> 0;
            case 222 -> 229;
            case 223 -> 185;
            case 224 -> 208;
            case 225 -> 56;
            case 226 -> 244;
            case 227 -> 188;
            case 228 -> 227;
            case 229 -> 38;
            case 230 -> 179;
            case 231 -> 69;
            case 232 -> 212;
            case 233 -> 50;
            case 234 -> 106;
            case 235 -> 220;
            case 236 -> 12;
            case 237 -> 198;
            case 238 -> 186;
            case 239 -> 191;
            case 240 -> 54;
            case 241 -> 98;
            case 242 -> 195;
            case 243 -> 18;
            case 244 -> 147;
            case 245 -> 3;
            case 246 -> 128;
            case 247 -> 111;
            case 248 -> 105;
            case 249 -> 168;
            case 250 -> 131;
            case 251 -> 108;
            case 252 -> 249;
            case 253 -> 160;
            case 254 -> 39;
            default -> 11;
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

   @Override
   public void aC() {
      this.polinex$oreTickOriginal();
      PolinexOreForgeRecovery.afterTick(this);
   }

   public static enum IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

      public static lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI[] a() {
         return (lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI[])IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.clone();
      }

      public static lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI a(
         String var0
      ) {
         return Enum.valueOf(
            lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI> b() {
         return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI[]{IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII};
      private static final EnumEntries<IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = kotlin.enums.EnumEntriesKt.enumEntries(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      public static IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI[] c() {
         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI[] var0 = new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI[2];
         var0[0] = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         var0[1] = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         return var0;
      }
   }

   private static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      @NotNull
      private final lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @NotNull
      private final Triple<Integer, Integer, Integer> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         @NotNull lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var1,
         int var2,
         boolean var3,
         @NotNull Triple<Integer, Integer, Integer> var4
      ) {
         short var10001 = -10625;
         short var10002 = 15515;
         Intrinsics.checkNotNullParameter(var1, "routeType");
         var10001 = -10626;
         var10002 = 16592;
         Intrinsics.checkNotNullParameter(var4, "playerPos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
      }

      @NotNull
      public final lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI e() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int f() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean g() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> h() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         @NotNull lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var1,
         int var2,
         boolean var3,
         @NotNull Triple<Integer, Integer, Integer> var4
      ) {
         short var10001 = -10631;
         short var10002 = -9972;
         Intrinsics.checkNotNullParameter(var1, "routeType");
         var10001 = -10628;
         var10002 = 23242;
         Intrinsics.checkNotNullParameter(var4, "playerPos");
         return new lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var2, var3, var4
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -10630;
         Triple var1 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         boolean var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -24215;
         short var10002 = -10629;
         short var10003 = 1948;
         short var10004 = -10627;
         short var10005 = 2687;
         short var10006 = -10632;
         short var10007 = -32664;
         return "RouteProgress(routeType=" + var4 + ", currentIndex=" + var3 + ", enoughMana=" + var2 + ", playerPos=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         var1 = var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         var1 = var1 * 31 + Boolean.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         return var1 * 31 + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
      Object var5 = null; // PX-FIX
         int var2 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
         lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var10000 = this;
         if (var2 == 0) {
            if (this == var1) {
               return true;
            }

            var10000 = (lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var1;
         }

         if (var2 == 0) {
            if (!(
               var10000 instanceof lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = (lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var1;
         }

         lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = var10000;
         var10000 = this;
         if (var2 == 0) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var10000 = this;
         }

         label56: {
            var5 = var10000.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            int var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (var2 == 0) {
               if (var10000.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  != var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
                  return false;
               }

               var5 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               if (var2 != 0) {
                  break label56;
               }

               var10001 = ((var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) ? 1 : 0);
            }

            if ((Boolean)var5 != ((var10001 == 0))) {
               return false;
            }

            var5 = Intrinsics.areEqual(
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            );
         }

         if (var2 == 0) {
            if (((Boolean)(var5))) {
               return false;
            }

            var5 = 1;
         }

         return (boolean)var5;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[8];
         int var3 = 0;
         String var2 = "=í8ã\u008d¿é\r±\tC\u0085¡\u0080(Yt,\u0018\r¹\u0012- 7¯ë\u0012\u0004\u0090¢\n§\t±wÿÞã\u0092\rU7\u000f¤\u0019\u0088ÚX\u009fºõU\u0082\u0096`yt\u008f\u0018L\u00932,ÌBÊ)½\u0003ñ\u001bé¾\u0006*_\u001ba tî\u0002H";
         int var4 = "=í8ã\u008d¿é\r±\tC\u0085¡\u0080(Yt,\u0018\r¹\u0012- 7¯ë\u0012\u0004\u0090¢\n§\t±wÿÞã\u0092\rU7\u000f¤\u0019\u0088ÚX\u009fºõU\u0082\u0096`yt\u008f\u0018L\u00932,ÌBÊ)½\u0003ñ\u001bé¾\u0006*_\u001ba tî\u0002H"
            .length();
         char var1 = '\t';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 113;
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
                        case 0 -> 5;
                        case 1 -> 47;
                        case 2 -> 41;
                        case 3 -> 18;
                        case 4 -> 78;
                        case 5 -> 112;
                        default -> 126;
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
                        b = new String[8];
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

                     var2 = "Î\u0086u½\u0017G\u0089!\u008e\fõ»\u0082¤HRú\tJ\u0097ûJ";
                     var4 = "Î\u0086u½\u0017G\u0089!\u008e\fõ»\u0082¤HRú\tJ\u0097ûJ".length();
                     var1 = '\t';
                     var8 = -1;
               }

               var10000 = 96;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -10625) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 133;
               case 1 -> 50;
               case 2 -> 210;
               case 3 -> 29;
               case 4 -> 176;
               case 5 -> 85;
               case 6 -> 216;
               case 7 -> 69;
               case 8 -> 3;
               case 9 -> 35;
               case 10 -> 91;
               case 11 -> 184;
               case 12 -> 94;
               case 13 -> 120;
               case 14 -> 191;
               case 15 -> 70;
               case 16 -> 115;
               case 17 -> 182;
               case 18 -> 86;
               case 19 -> 218;
               case 20 -> 231;
               case 21 -> 5;
               case 22 -> 1;
               case 23 -> 186;
               case 24 -> 109;
               case 25 -> 131;
               case 26 -> 189;
               case 27 -> 105;
               case 28 -> 178;
               case 29 -> 28;
               case 30 -> 27;
               case 31 -> 173;
               case 32 -> 42;
               case 33 -> 132;
               case 34 -> 63;
               case 35 -> 195;
               case 36 -> 129;
               case 37 -> 33;
               case 38 -> 48;
               case 39 -> 215;
               case 40 -> 141;
               case 41 -> 193;
               case 42 -> 177;
               case 43 -> 163;
               case 44 -> 17;
               case 45 -> 87;
               case 46 -> 222;
               case 47 -> 97;
               case 48 -> 71;
               case 49 -> 244;
               case 50 -> 204;
               case 51 -> 205;
               case 52 -> 228;
               case 53 -> 49;
               case 54 -> 15;
               case 55 -> 137;
               case 56 -> 255;
               case 57 -> 202;
               case 58 -> 239;
               case 59 -> 25;
               case 60 -> 121;
               case 61 -> 207;
               case 62 -> 201;
               case 63 -> 213;
               case 64 -> 79;
               case 65 -> 146;
               case 66 -> 243;
               case 67 -> 117;
               case 68 -> 58;
               case 69 -> 150;
               case 70 -> 76;
               case 71 -> 159;
               case 72 -> 41;
               case 73 -> 96;
               case 74 -> 252;
               case 75 -> 45;
               case 76 -> 122;
               case 77 -> 237;
               case 78 -> 190;
               case 79 -> 194;
               case 80 -> 157;
               case 81 -> 30;
               case 82 -> 226;
               case 83 -> 224;
               case 84 -> 74;
               case 85 -> 106;
               case 86 -> 246;
               case 87 -> 40;
               case 88 -> 6;
               case 89 -> 221;
               case 90 -> 143;
               case 91 -> 225;
               case 92 -> 211;
               case 93 -> 54;
               case 94 -> 90;
               case 95 -> 181;
               case 96 -> 88;
               case 97 -> 18;
               case 98 -> 82;
               case 99 -> 57;
               case 100 -> 145;
               case 101 -> 110;
               case 102 -> 130;
               case 103 -> 152;
               case 104 -> 66;
               case 105 -> 124;
               case 106 -> 200;
               case 107 -> 161;
               case 108 -> 44;
               case 109 -> 144;
               case 110 -> 16;
               case 111 -> 138;
               case 112 -> 167;
               case 113 -> 118;
               case 114 -> 219;
               case 115 -> 81;
               case 116 -> 254;
               case 117 -> 100;
               case 118 -> 13;
               case 119 -> 102;
               case 120 -> 134;
               case 121 -> 114;
               case 122 -> 24;
               case 123 -> 119;
               case 124 -> 112;
               case 125 -> 232;
               case 126 -> 208;
               case 127 -> 9;
               case 128 -> 183;
               case 129 -> 68;
               case 130 -> 101;
               case 131 -> 234;
               case 132 -> 128;
               case 133 -> 64;
               case 134 -> 147;
               case 135 -> 59;
               case 136 -> 83;
               case 137 -> 61;
               case 138 -> 34;
               case 139 -> 77;
               case 140 -> 2;
               case 141 -> 31;
               case 142 -> 127;
               case 143 -> 26;
               case 144 -> 172;
               case 145 -> 98;
               case 146 -> 22;
               case 147 -> 107;
               case 148 -> 249;
               case 149 -> 168;
               case 150 -> 165;
               case 151 -> 199;
               case 152 -> 46;
               case 153 -> 56;
               case 154 -> 67;
               case 155 -> 197;
               case 156 -> 0;
               case 157 -> 175;
               case 158 -> 153;
               case 159 -> 180;
               case 160 -> 8;
               case 161 -> 65;
               case 162 -> 93;
               case 163 -> 92;
               case 164 -> 36;
               case 165 -> 99;
               case 166 -> 78;
               case 167 -> 12;
               case 168 -> 126;
               case 169 -> 148;
               case 170 -> 235;
               case 171 -> 51;
               case 172 -> 196;
               case 173 -> 188;
               case 174 -> 212;
               case 175 -> 209;
               case 176 -> 140;
               case 177 -> 179;
               case 178 -> 171;
               case 179 -> 19;
               case 180 -> 136;
               case 181 -> 116;
               case 182 -> 23;
               case 183 -> 164;
               case 184 -> 230;
               case 185 -> 14;
               case 186 -> 247;
               case 187 -> 185;
               case 188 -> 156;
               case 189 -> 7;
               case 190 -> 75;
               case 191 -> 53;
               case 192 -> 139;
               case 193 -> 214;
               case 194 -> 251;
               case 195 -> 155;
               case 196 -> 108;
               case 197 -> 21;
               case 198 -> 89;
               case 199 -> 123;
               case 200 -> 233;
               case 201 -> 52;
               case 202 -> 248;
               case 203 -> 223;
               case 204 -> 20;
               case 205 -> 158;
               case 206 -> 103;
               case 207 -> 149;
               case 208 -> 160;
               case 209 -> 169;
               case 210 -> 206;
               case 211 -> 72;
               case 212 -> 174;
               case 213 -> 250;
               case 214 -> 39;
               case 215 -> 37;
               case 216 -> 166;
               case 217 -> 111;
               case 218 -> 125;
               case 219 -> 245;
               case 220 -> 10;
               case 221 -> 154;
               case 222 -> 253;
               case 223 -> 151;
               case 224 -> 60;
               case 225 -> 84;
               case 226 -> 238;
               case 227 -> 135;
               case 228 -> 240;
               case 229 -> 220;
               case 230 -> 242;
               case 231 -> 198;
               case 232 -> 38;
               case 233 -> 192;
               case 234 -> 104;
               case 235 -> 217;
               case 236 -> 236;
               case 237 -> 142;
               case 238 -> 203;
               case 239 -> 162;
               case 240 -> 73;
               case 241 -> 55;
               case 242 -> 62;
               case 243 -> 4;
               case 244 -> 32;
               case 245 -> 113;
               case 246 -> 170;
               case 247 -> 47;
               case 248 -> 241;
               case 249 -> 229;
               case 250 -> 11;
               case 251 -> 43;
               case 252 -> 80;
               case 253 -> 227;
               case 254 -> 187;
               default -> 95;
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
      public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI p0, me.octo.client.lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI p1, int p2, boolean p3, kotlin.Triple p4, int p5, java.lang.Object p6) {
         if ((p5 & 1) != 0) {
            p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         }

         if ((p5 & 2) != 0) {
            p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         if ((p5 & 4) != 0) {
            p3 = p0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         if ((p5 & 8) != 0) {
            p4 = p0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         return p0.a(p1, p2, p3, p4);
      }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI a() {
         return lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
      }
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker p0) { this(); }
   }
    static int a(me.octo.client.lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI var0, int var1, int var2, java.lang.Object var3) {
        int var4 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
        if ((var2 & 1) != 0 && var4 == 0) {
            var1 = 1;
        }
        return var0.e(var1);
    }

    public static final void a(me.octo.client.lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI var0, me.octo.client.IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
        var0.a(var1);
    }

    public static final me.octo.client.lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlIlIIIIlI by() {
        return llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
    }

}
