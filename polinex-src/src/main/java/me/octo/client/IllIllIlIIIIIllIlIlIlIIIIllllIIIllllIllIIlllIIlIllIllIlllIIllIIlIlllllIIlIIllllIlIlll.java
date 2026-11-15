package me.octo.client;

import java.util.ArrayList;
import java.util.List;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll
   extends lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll {
    public static <T> T e(Object p0) { return null; } // PX-FIX mr4
    public static <T> T b(Object p0) { return null; } // PX-FIX mr4
    public static <T> T g(Object p0) { return null; } // PX-FIX mr3
    public static <T> T f(Object p0) { return null; } // PX-FIX mr3

   public Object receiver; // PX-FIX kotlin lambda receiver

   @NotNull
   public static IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   @NotNull
   private final BlockPos IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
   @Nullable
   private BlockPos IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
   private boolean lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
   @NotNull
   private static IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
   private static String[] j;
   private static String[] k;

   public static final IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll by() {
      return IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
   }

   public static final void a(IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll var0, IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      var0.a(var1);
   }

   public IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll() {
      short var10001 = -14195;
      short var10002 = -16880;
      var10002 = -14198;
      short var10003 = 19775;
      me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      short var10004 = -14205;
      short var10005 = -20904;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         IlllllIIlIIIlllIIllIIIllIIlIIIIlIIlllIIlIIllllIlIIllIlIIlllllllllIlIIllIlIllIlIIllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a()
      };
      super(
         "Sludge Macro",
         "Grinds powder in the Crystal Hollows, specifically in the Jungle to take advantage of the jungle pickaxe ability.",
         var3,
         "Crystal Hollows",
         null,
         null,
         false,
         var1,
         112,
         null
      );
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = new BlockPos(448, 122, 458);
      this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
   }

   @Override
   public boolean c() {
      return true;
   }

   @Override
   protected void aD() {
      Object receiver = null; // PX-FIX
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var10000 = this;
      short var10001 = -14204;
      short var10002 = 1187;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10000),
         "Sludge travel",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         null,
         5000L,
         false,
         false,
         (kotlin.jvm.functions.Function1)(IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll::b),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = -8447;
                  short var10005 = -12585;
                  var10005 = -8445;
                  short var10006 = 14625;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001x = -8448;
                  short var10002x = -13343;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "\\\u001c»\u0099vÐül\u00113\u00ad%\u0003\u0099ÿht\u0002¼Úz\"stt\u008fmÃÛöÅQû\u009cB\f\u0013\nvÅà\u0098 w\u0096+|Þî®yj6>$ôÔP\u00ad\u0091öuöq5½\u0099PÐ\u0086aº\u001bh î\t\u0083nãs¾\u008dÿÊ1K½«Õxäe*¶\u0006\u0091ÍíÓ\u000bE\"nl\u0012CÑóø\u001c7Ý\r\r\u009eâ\u0015Q}@<\u0012E\u0005¥Zû|äÌÛ\u0094¤Ý\"\u0005\u0007Cía·\u001d";
                  int var4 = "\\\u001c»\u0099vÐül\u00113\u00ad%\u0003\u0099ÿht\u0002¼Úz\"stt\u008fmÃÛöÅQû\u009cB\f\u0013\nvÅà\u0098 w\u0096+|Þî®yj6>$ôÔP\u00ad\u0091öuöq5½\u0099PÐ\u0086aº\u001bh î\t\u0083nãs¾\u008dÿÊ1K½«Õxäe*¶\u0006\u0091ÍíÓ\u000bE\"nl\u0012CÑóø\u001c7Ý\r\r\u009eâ\u0015Q}@<\u0012E\u0005¥Zû|äÌÛ\u0094¤Ý\"\u0005\u0007Cía·\u001d"
                     .length();
                  char var1 = 17;
                  int var0 = -1;

                  while (true) {
                     char[] var10002x;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 23;
                        var10002x = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 23;
                           var10006 = var6;
                        } else {
                           var13 = 23;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 23;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 100;
                              case 1 -> 84;
                              case 2 -> 66;
                              case 3 -> 76;
                              case 4 -> 115;
                              case 5 -> 18;
                              default -> 27;
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
                  int var2 = (var0 ^ -8447) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 134;
                        case 1 -> 184;
                        case 2 -> 44;
                        case 3 -> 64;
                        case 4 -> 115;
                        case 5 -> 150;
                        case 6 -> 160;
                        case 7 -> 91;
                        case 8 -> 53;
                        case 9 -> 191;
                        case 10 -> 75;
                        case 11 -> 183;
                        case 12 -> 97;
                        case 13 -> 89;
                        case 14 -> 35;
                        case 15 -> 152;
                        case 16 -> 245;
                        case 17 -> 58;
                        case 18 -> 132;
                        case 19 -> 27;
                        case 20 -> 180;
                        case 21 -> 103;
                        case 22 -> 218;
                        case 23 -> 172;
                        case 24 -> 26;
                        case 25 -> 24;
                        case 26 -> 66;
                        case 27 -> 185;
                        case 28 -> 33;
                        case 29 -> 246;
                        case 30 -> 70;
                        case 31 -> 84;
                        case 32 -> 223;
                        case 33 -> 121;
                        case 34 -> 220;
                        case 35 -> 213;
                        case 36 -> 125;
                        case 37 -> 242;
                        case 38 -> 2;
                        case 39 -> 137;
                        case 40 -> 7;
                        case 41 -> 95;
                        case 42 -> 239;
                        case 43 -> 170;
                        case 44 -> 253;
                        case 45 -> 19;
                        case 46 -> 227;
                        case 47 -> 144;
                        case 48 -> 77;
                        case 49 -> 10;
                        case 50 -> 102;
                        case 51 -> 111;
                        case 52 -> 226;
                        case 53 -> 38;
                        case 54 -> 12;
                        case 55 -> 164;
                        case 56 -> 189;
                        case 57 -> 197;
                        case 58 -> 142;
                        case 59 -> 186;
                        case 60 -> 69;
                        case 61 -> 15;
                        case 62 -> 136;
                        case 63 -> 129;
                        case 64 -> 168;
                        case 65 -> 46;
                        case 66 -> 128;
                        case 67 -> 47;
                        case 68 -> 234;
                        case 69 -> 116;
                        case 70 -> 42;
                        case 71 -> 112;
                        case 72 -> 9;
                        case 73 -> 106;
                        case 74 -> 138;
                        case 75 -> 249;
                        case 76 -> 51;
                        case 77 -> 16;
                        case 78 -> 117;
                        case 79 -> 28;
                        case 80 -> 123;
                        case 81 -> 232;
                        case 82 -> 216;
                        case 83 -> 167;
                        case 84 -> 175;
                        case 85 -> 169;
                        case 86 -> 163;
                        case 87 -> 237;
                        case 88 -> 107;
                        case 89 -> 76;
                        case 90 -> 87;
                        case 91 -> 212;
                        case 92 -> 161;
                        case 93 -> 251;
                        case 94 -> 153;
                        case 95 -> 68;
                        case 96 -> 231;
                        case 97 -> 30;
                        case 98 -> 199;
                        case 99 -> 98;
                        case 100 -> 90;
                        case 101 -> 60;
                        case 102 -> 157;
                        case 103 -> 94;
                        case 104 -> 124;
                        case 105 -> 114;
                        case 106 -> 224;
                        case 107 -> 83;
                        case 108 -> 119;
                        case 109 -> 148;
                        case 110 -> 96;
                        case 111 -> 156;
                        case 112 -> 63;
                        case 113 -> 154;
                        case 114 -> 215;
                        case 115 -> 206;
                        case 116 -> 62;
                        case 117 -> 79;
                        case 118 -> 5;
                        case 119 -> 14;
                        case 120 -> 104;
                        case 121 -> 177;
                        case 122 -> 13;
                        case 123 -> 195;
                        case 124 -> 241;
                        case 125 -> 243;
                        case 126 -> 203;
                        case 127 -> 146;
                        case 128 -> 130;
                        case 129 -> 173;
                        case 130 -> 22;
                        case 131 -> 135;
                        case 132 -> 187;
                        case 133 -> 55;
                        case 134 -> 122;
                        case 135 -> 140;
                        case 136 -> 131;
                        case 137 -> 67;
                        case 138 -> 194;
                        case 139 -> 49;
                        case 140 -> 25;
                        case 141 -> 80;
                        case 142 -> 166;
                        case 143 -> 32;
                        case 144 -> 209;
                        case 145 -> 159;
                        case 146 -> 198;
                        case 147 -> 141;
                        case 148 -> 3;
                        case 149 -> 50;
                        case 150 -> 0;
                        case 151 -> 147;
                        case 152 -> 229;
                        case 153 -> 188;
                        case 154 -> 41;
                        case 155 -> 171;
                        case 156 -> 52;
                        case 157 -> 40;
                        case 158 -> 81;
                        case 159 -> 73;
                        case 160 -> 20;
                        case 161 -> 23;
                        case 162 -> 155;
                        case 163 -> 236;
                        case 164 -> 4;
                        case 165 -> 202;
                        case 166 -> 86;
                        case 167 -> 1;
                        case 168 -> 208;
                        case 169 -> 120;
                        case 170 -> 190;
                        case 171 -> 254;
                        case 172 -> 196;
                        case 173 -> 225;
                        case 174 -> 247;
                        case 175 -> 201;
                        case 176 -> 11;
                        case 177 -> 71;
                        case 178 -> 228;
                        case 179 -> 101;
                        case 180 -> 233;
                        case 181 -> 48;
                        case 182 -> 21;
                        case 183 -> 252;
                        case 184 -> 210;
                        case 185 -> 178;
                        case 186 -> 217;
                        case 187 -> 118;
                        case 188 -> 230;
                        case 189 -> 149;
                        case 190 -> 127;
                        case 191 -> 151;
                        case 192 -> 36;
                        case 193 -> 56;
                        case 194 -> 72;
                        case 195 -> 59;
                        case 196 -> 211;
                        case 197 -> 126;
                        case 198 -> 108;
                        case 199 -> 181;
                        case 200 -> 214;
                        case 201 -> 18;
                        case 202 -> 165;
                        case 203 -> 29;
                        case 204 -> 45;
                        case 205 -> 204;
                        case 206 -> 182;
                        case 207 -> 34;
                        case 208 -> 8;
                        case 209 -> 222;
                        case 210 -> 176;
                        case 211 -> 133;
                        case 212 -> 219;
                        case 213 -> 82;
                        case 214 -> 207;
                        case 215 -> 99;
                        case 216 -> 145;
                        case 217 -> 61;
                        case 218 -> 105;
                        case 219 -> 85;
                        case 220 -> 113;
                        case 221 -> 31;
                        case 222 -> 139;
                        case 223 -> 221;
                        case 224 -> 238;
                        case 225 -> 179;
                        case 226 -> 74;
                        case 227 -> 255;
                        case 228 -> 248;
                        case 229 -> 54;
                        case 230 -> 110;
                        case 231 -> 100;
                        case 232 -> 205;
                        case 233 -> 174;
                        case 234 -> 250;
                        case 235 -> 78;
                        case 236 -> 244;
                        case 237 -> 88;
                        case 238 -> 37;
                        case 239 -> 162;
                        case 240 -> 235;
                        case 241 -> 39;
                        case 242 -> 158;
                        case 243 -> 143;
                        case 244 -> 93;
                        case 245 -> 43;
                        case 246 -> 65;
                        case 247 -> 57;
                        case 248 -> 240;
                        case 249 -> 6;
                        case 250 -> 200;
                        case 251 -> 193;
                        case 252 -> 17;
                        case 253 -> 109;
                        case 254 -> 192;
                        default -> 92;
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
      var10001 = -14208;
      var10002 = 1284;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10000),
         "Sludge command",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII,
         30000L,
         0L,
         true,
         false,
         null,
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = 18063;
                  short var10005 = -31895;
                  var10005 = 18062;
                  short var10006 = 26723;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = 18060;
                  short var10002 = 23913;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "HZ2\u00ad\u0094\u0080\u0005\u0092:ç4læ\u0015·ívU\u0099R¶\u0082¦ÉíDÐL\u009b9ÇÂXl\u009d)i\u0019J³Øû0\u0080\u009eÓçOÕfÄð[\u008e^yat´Ì\u0087¬}\u001auZÉZ\u008dã\u001b\u0002Þ¦KEÁ\u0083FÍ\u000b)q¨\u0005Ï8\u009e\u0016gOF\u0016u\u0001>0o-\u0093=\u0094¶\u0003~n\u0094ñõ®/}ÎôdÜ\u001c®+({?\u0011Ï¾Â1\u008a\u0013ÆàB©;¥\u0007,\u008bÊñ\u0002\u009að";
                  int var4 = "HZ2\u00ad\u0094\u0080\u0005\u0092:ç4læ\u0015·ívU\u0099R¶\u0082¦ÉíDÐL\u009b9ÇÂXl\u009d)i\u0019J³Øû0\u0080\u009eÓçOÕfÄð[\u008e^yat´Ì\u0087¬}\u001auZÉZ\u008dã\u001b\u0002Þ¦KEÁ\u0083FÍ\u000b)q¨\u0005Ï8\u009e\u0016gOF\u0016u\u0001>0o-\u0093=\u0094¶\u0003~n\u0094ñõ®/}ÎôdÜ\u001c®+({?\u0011Ï¾Â1\u008a\u0013ÆàB©;¥\u0007,\u008bÊñ\u0002\u009að"
                     .length();
                  char var1 = 'z';
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 5;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 5;
                           var10006 = var6;
                        } else {
                           var13 = 5;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 5;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 5;
                              case 1 -> 27;
                              case 2 -> 53;
                              case 3 -> 9;
                              case 4 -> 30;
                              case 5 -> 60;
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
                  int var2 = (var0 ^ 18062) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 153;
                        case 1 -> 205;
                        case 2 -> 110;
                        case 3 -> 150;
                        case 4 -> 81;
                        case 5 -> 140;
                        case 6 -> 109;
                        case 7 -> 176;
                        case 8 -> 11;
                        case 9 -> 77;
                        case 10 -> 185;
                        case 11 -> 117;
                        case 12 -> 3;
                        case 13 -> 216;
                        case 14 -> 203;
                        case 15 -> 27;
                        case 16 -> 49;
                        case 17 -> 253;
                        case 18 -> 71;
                        case 19 -> 252;
                        case 20 -> 225;
                        case 21 -> 220;
                        case 22 -> 250;
                        case 23 -> 206;
                        case 24 -> 223;
                        case 25 -> 163;
                        case 26 -> 155;
                        case 27 -> 125;
                        case 28 -> 141;
                        case 29 -> 82;
                        case 30 -> 196;
                        case 31 -> 131;
                        case 32 -> 39;
                        case 33 -> 139;
                        case 34 -> 42;
                        case 35 -> 209;
                        case 36 -> 159;
                        case 37 -> 167;
                        case 38 -> 8;
                        case 39 -> 18;
                        case 40 -> 17;
                        case 41 -> 187;
                        case 42 -> 229;
                        case 43 -> 58;
                        case 44 -> 128;
                        case 45 -> 212;
                        case 46 -> 116;
                        case 47 -> 22;
                        case 48 -> 219;
                        case 49 -> 88;
                        case 50 -> 228;
                        case 51 -> 184;
                        case 52 -> 26;
                        case 53 -> 84;
                        case 54 -> 210;
                        case 55 -> 165;
                        case 56 -> 226;
                        case 57 -> 244;
                        case 58 -> 61;
                        case 59 -> 126;
                        case 60 -> 224;
                        case 61 -> 227;
                        case 62 -> 132;
                        case 63 -> 231;
                        case 64 -> 181;
                        case 65 -> 45;
                        case 66 -> 232;
                        case 67 -> 199;
                        case 68 -> 179;
                        case 69 -> 98;
                        case 70 -> 171;
                        case 71 -> 7;
                        case 72 -> 67;
                        case 73 -> 89;
                        case 74 -> 21;
                        case 75 -> 239;
                        case 76 -> 95;
                        case 77 -> 170;
                        case 78 -> 130;
                        case 79 -> 175;
                        case 80 -> 113;
                        case 81 -> 189;
                        case 82 -> 119;
                        case 83 -> 136;
                        case 84 -> 240;
                        case 85 -> 230;
                        case 86 -> 80;
                        case 87 -> 145;
                        case 88 -> 44;
                        case 89 -> 254;
                        case 90 -> 191;
                        case 91 -> 248;
                        case 92 -> 186;
                        case 93 -> 142;
                        case 94 -> 121;
                        case 95 -> 115;
                        case 96 -> 68;
                        case 97 -> 12;
                        case 98 -> 48;
                        case 99 -> 152;
                        case 100 -> 10;
                        case 101 -> 6;
                        case 102 -> 102;
                        case 103 -> 192;
                        case 104 -> 79;
                        case 105 -> 23;
                        case 106 -> 168;
                        case 107 -> 188;
                        case 108 -> 146;
                        case 109 -> 133;
                        case 110 -> 66;
                        case 111 -> 32;
                        case 112 -> 105;
                        case 113 -> 122;
                        case 114 -> 200;
                        case 115 -> 236;
                        case 116 -> 172;
                        case 117 -> 40;
                        case 118 -> 0;
                        case 119 -> 202;
                        case 120 -> 94;
                        case 121 -> 72;
                        case 122 -> 92;
                        case 123 -> 164;
                        case 124 -> 108;
                        case 125 -> 211;
                        case 126 -> 60;
                        case 127 -> 78;
                        case 128 -> 37;
                        case 129 -> 34;
                        case 130 -> 143;
                        case 131 -> 160;
                        case 132 -> 137;
                        case 133 -> 157;
                        case 134 -> 251;
                        case 135 -> 63;
                        case 136 -> 123;
                        case 137 -> 86;
                        case 138 -> 69;
                        case 139 -> 234;
                        case 140 -> 180;
                        case 141 -> 85;
                        case 142 -> 28;
                        case 143 -> 38;
                        case 144 -> 166;
                        case 145 -> 235;
                        case 146 -> 96;
                        case 147 -> 55;
                        case 148 -> 24;
                        case 149 -> 118;
                        case 150 -> 65;
                        case 151 -> 195;
                        case 152 -> 100;
                        case 153 -> 151;
                        case 154 -> 127;
                        case 155 -> 193;
                        case 156 -> 97;
                        case 157 -> 135;
                        case 158 -> 70;
                        case 159 -> 41;
                        case 160 -> 35;
                        case 161 -> 198;
                        case 162 -> 59;
                        case 163 -> 54;
                        case 164 -> 214;
                        case 165 -> 4;
                        case 166 -> 90;
                        case 167 -> 255;
                        case 168 -> 9;
                        case 169 -> 218;
                        case 170 -> 30;
                        case 171 -> 73;
                        case 172 -> 204;
                        case 173 -> 47;
                        case 174 -> 19;
                        case 175 -> 245;
                        case 176 -> 241;
                        case 177 -> 99;
                        case 178 -> 50;
                        case 179 -> 76;
                        case 180 -> 103;
                        case 181 -> 56;
                        case 182 -> 161;
                        case 183 -> 2;
                        case 184 -> 129;
                        case 185 -> 5;
                        case 186 -> 91;
                        case 187 -> 237;
                        case 188 -> 33;
                        case 189 -> 43;
                        case 190 -> 217;
                        case 191 -> 57;
                        case 192 -> 53;
                        case 193 -> 178;
                        case 194 -> 74;
                        case 195 -> 138;
                        case 196 -> 148;
                        case 197 -> 112;
                        case 198 -> 46;
                        case 199 -> 144;
                        case 200 -> 249;
                        case 201 -> 83;
                        case 202 -> 243;
                        case 203 -> 182;
                        case 204 -> 183;
                        case 205 -> 156;
                        case 206 -> 190;
                        case 207 -> 194;
                        case 208 -> 221;
                        case 209 -> 134;
                        case 210 -> 107;
                        case 211 -> 15;
                        case 212 -> 20;
                        case 213 -> 174;
                        case 214 -> 114;
                        case 215 -> 62;
                        case 216 -> 93;
                        case 217 -> 158;
                        case 218 -> 169;
                        case 219 -> 222;
                        case 220 -> 36;
                        case 221 -> 208;
                        case 222 -> 233;
                        case 223 -> 201;
                        case 224 -> 25;
                        case 225 -> 124;
                        case 226 -> 52;
                        case 227 -> 197;
                        case 228 -> 64;
                        case 229 -> 147;
                        case 230 -> 246;
                        case 231 -> 154;
                        case 232 -> 101;
                        case 233 -> 14;
                        case 234 -> 247;
                        case 235 -> 104;
                        case 236 -> 13;
                        case 237 -> 242;
                        case 238 -> 215;
                        case 239 -> 207;
                        case 240 -> 29;
                        case 241 -> 149;
                        case 242 -> 177;
                        case 243 -> 162;
                        case 244 -> 87;
                        case 245 -> 75;
                        case 246 -> 173;
                        case 247 -> 31;
                        case 248 -> 111;
                        case 249 -> 120;
                        case 250 -> 106;
                        case 251 -> 1;
                        case 252 -> 51;
                        case 253 -> 213;
                        case 254 -> 16;
                        default -> 238;
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
      var10001 = -14202;
      var10002 = 18325;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10000),
         "Sludge move",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
         60000L,
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
                  short var10004 = -12457;
                  short var10005 = 14911;
                  var10005 = -12460;
                  short var10006 = 26816;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = -12458;
                  short var10002 = 16114;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "éY\u0011Â\u008a¬2O\u001f¥\u0000ûz\u0089×=¹\u00ad\u00adúz\u0083v\u0084\u00adJì\u0005~ïµ\u000b.m\u0086§J»$(\u0010[«Î#e\u0011\u00ad=UÂÑ8\u0092_\u001f.ì6\u007f^\u0012\u009d\b\u0099Vuö÷,\u0010.ñ\u0083¦)§îz\u008a\u0088HH_çä*~\\\u0017ø)´WõrC=\"\f6Ç^\u0084\u009dÚ¼\fu\u0098vE\u0005\u0082Ò\u0016Â¾+\u009dÎäº\u0085ªÃ:ö´<\u000ez²\u0005ØÒÜÂÂ+Ä®m";
                  int var4 = "éY\u0011Â\u008a¬2O\u001f¥\u0000ûz\u0089×=¹\u00ad\u00adúz\u0083v\u0084\u00adJì\u0005~ïµ\u000b.m\u0086§J»$(\u0010[«Î#e\u0011\u00ad=UÂÑ8\u0092_\u001f.ì6\u007f^\u0012\u009d\b\u0099Vuö÷,\u0010.ñ\u0083¦)§îz\u008a\u0088HH_çä*~\\\u0017ø)´WõrC=\"\f6Ç^\u0084\u009dÚ¼\fu\u0098vE\u0005\u0082Ò\u0016Â¾+\u009dÎäº\u0085ªÃ:ö´<\u000ez²\u0005ØÒÜÂÂ+Ä®m"
                     .length();
                  char var1 = 2;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 13;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 13;
                           var10006 = var6;
                        } else {
                           var13 = 13;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 13;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 104;
                              case 1 -> 44;
                              case 2 -> 94;
                              case 3 -> 99;
                              case 4 -> 114;
                              case 5 -> 20;
                              default -> 28;
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
                  int var2 = (var0 ^ -12458) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 229;
                        case 1 -> 235;
                        case 2 -> 164;
                        case 3 -> 117;
                        case 4 -> 126;
                        case 5 -> 141;
                        case 6 -> 185;
                        case 7 -> 208;
                        case 8 -> 41;
                        case 9 -> 158;
                        case 10 -> 202;
                        case 11 -> 228;
                        case 12 -> 184;
                        case 13 -> 45;
                        case 14 -> 132;
                        case 15 -> 40;
                        case 16 -> 137;
                        case 17 -> 226;
                        case 18 -> 123;
                        case 19 -> 27;
                        case 20 -> 55;
                        case 21 -> 254;
                        case 22 -> 171;
                        case 23 -> 196;
                        case 24 -> 48;
                        case 25 -> 98;
                        case 26 -> 131;
                        case 27 -> 116;
                        case 28 -> 239;
                        case 29 -> 252;
                        case 30 -> 162;
                        case 31 -> 156;
                        case 32 -> 9;
                        case 33 -> 165;
                        case 34 -> 107;
                        case 35 -> 29;
                        case 36 -> 221;
                        case 37 -> 222;
                        case 38 -> 28;
                        case 39 -> 134;
                        case 40 -> 115;
                        case 41 -> 114;
                        case 42 -> 135;
                        case 43 -> 255;
                        case 44 -> 227;
                        case 45 -> 21;
                        case 46 -> 38;
                        case 47 -> 65;
                        case 48 -> 18;
                        case 49 -> 93;
                        case 50 -> 253;
                        case 51 -> 78;
                        case 52 -> 199;
                        case 53 -> 17;
                        case 54 -> 52;
                        case 55 -> 36;
                        case 56 -> 224;
                        case 57 -> 216;
                        case 58 -> 200;
                        case 59 -> 250;
                        case 60 -> 190;
                        case 61 -> 251;
                        case 62 -> 191;
                        case 63 -> 163;
                        case 64 -> 138;
                        case 65 -> 54;
                        case 66 -> 133;
                        case 67 -> 136;
                        case 68 -> 204;
                        case 69 -> 147;
                        case 70 -> 172;
                        case 71 -> 22;
                        case 72 -> 94;
                        case 73 -> 183;
                        case 74 -> 56;
                        case 75 -> 19;
                        case 76 -> 92;
                        case 77 -> 103;
                        case 78 -> 80;
                        case 79 -> 177;
                        case 80 -> 176;
                        case 81 -> 212;
                        case 82 -> 236;
                        case 83 -> 205;
                        case 84 -> 105;
                        case 85 -> 64;
                        case 86 -> 143;
                        case 87 -> 149;
                        case 88 -> 248;
                        case 89 -> 49;
                        case 90 -> 174;
                        case 91 -> 244;
                        case 92 -> 23;
                        case 93 -> 111;
                        case 94 -> 151;
                        case 95 -> 182;
                        case 96 -> 46;
                        case 97 -> 30;
                        case 98 -> 130;
                        case 99 -> 15;
                        case 100 -> 62;
                        case 101 -> 69;
                        case 102 -> 187;
                        case 103 -> 237;
                        case 104 -> 215;
                        case 105 -> 25;
                        case 106 -> 95;
                        case 107 -> 125;
                        case 108 -> 16;
                        case 109 -> 57;
                        case 110 -> 238;
                        case 111 -> 167;
                        case 112 -> 73;
                        case 113 -> 140;
                        case 114 -> 233;
                        case 115 -> 230;
                        case 116 -> 193;
                        case 117 -> 144;
                        case 118 -> 157;
                        case 119 -> 14;
                        case 120 -> 102;
                        case 121 -> 219;
                        case 122 -> 217;
                        case 123 -> 43;
                        case 124 -> 209;
                        case 125 -> 194;
                        case 126 -> 173;
                        case 127 -> 122;
                        case 128 -> 81;
                        case 129 -> 189;
                        case 130 -> 108;
                        case 131 -> 203;
                        case 132 -> 82;
                        case 133 -> 223;
                        case 134 -> 7;
                        case 135 -> 39;
                        case 136 -> 85;
                        case 137 -> 79;
                        case 138 -> 34;
                        case 139 -> 96;
                        case 140 -> 246;
                        case 141 -> 127;
                        case 142 -> 42;
                        case 143 -> 10;
                        case 144 -> 84;
                        case 145 -> 59;
                        case 146 -> 83;
                        case 147 -> 3;
                        case 148 -> 210;
                        case 149 -> 91;
                        case 150 -> 121;
                        case 151 -> 35;
                        case 152 -> 4;
                        case 153 -> 160;
                        case 154 -> 166;
                        case 155 -> 206;
                        case 156 -> 242;
                        case 157 -> 32;
                        case 158 -> 8;
                        case 159 -> 72;
                        case 160 -> 110;
                        case 161 -> 197;
                        case 162 -> 170;
                        case 163 -> 241;
                        case 164 -> 195;
                        case 165 -> 119;
                        case 166 -> 51;
                        case 167 -> 112;
                        case 168 -> 1;
                        case 169 -> 2;
                        case 170 -> 198;
                        case 171 -> 87;
                        case 172 -> 37;
                        case 173 -> 231;
                        case 174 -> 169;
                        case 175 -> 24;
                        case 176 -> 179;
                        case 177 -> 124;
                        case 178 -> 192;
                        case 179 -> 86;
                        case 180 -> 68;
                        case 181 -> 232;
                        case 182 -> 152;
                        case 183 -> 66;
                        case 184 -> 90;
                        case 185 -> 188;
                        case 186 -> 97;
                        case 187 -> 178;
                        case 188 -> 243;
                        case 189 -> 67;
                        case 190 -> 247;
                        case 191 -> 76;
                        case 192 -> 12;
                        case 193 -> 26;
                        case 194 -> 142;
                        case 195 -> 240;
                        case 196 -> 180;
                        case 197 -> 47;
                        case 198 -> 161;
                        case 199 -> 218;
                        case 200 -> 150;
                        case 201 -> 106;
                        case 202 -> 6;
                        case 203 -> 154;
                        case 204 -> 129;
                        case 205 -> 75;
                        case 206 -> 153;
                        case 207 -> 181;
                        case 208 -> 77;
                        case 209 -> 61;
                        case 210 -> 225;
                        case 211 -> 74;
                        case 212 -> 113;
                        case 213 -> 186;
                        case 214 -> 53;
                        case 215 -> 70;
                        case 216 -> 88;
                        case 217 -> 5;
                        case 218 -> 145;
                        case 219 -> 101;
                        case 220 -> 201;
                        case 221 -> 20;
                        case 222 -> 249;
                        case 223 -> 104;
                        case 224 -> 148;
                        case 225 -> 11;
                        case 226 -> 159;
                        case 227 -> 118;
                        case 228 -> 0;
                        case 229 -> 71;
                        case 230 -> 50;
                        case 231 -> 213;
                        case 232 -> 146;
                        case 233 -> 63;
                        case 234 -> 155;
                        case 235 -> 13;
                        case 236 -> 120;
                        case 237 -> 99;
                        case 238 -> 33;
                        case 239 -> 175;
                        case 240 -> 31;
                        case 241 -> 100;
                        case 242 -> 44;
                        case 243 -> 89;
                        case 244 -> 214;
                        case 245 -> 139;
                        case 246 -> 168;
                        case 247 -> 58;
                        case 248 -> 60;
                        case 249 -> 128;
                        case 250 -> 207;
                        case 251 -> 211;
                        case 252 -> 109;
                        case 253 -> 234;
                        case 254 -> 245;
                        default -> 220;
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
      var10001 = -14201;
      var10002 = -30205;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10000,
         "Sludge mine",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         60000L,
         0L,
         null,
         false,
         false,
         (kotlin.jvm.functions.Function1)(IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll::e),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = 26707;
                  short var10005 = 1996;
                  var10005 = 26706;
                  short var10006 = 14461;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = 26704;
                  short var10002 = 18660;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "7\\\u0097Q,=\u0086\rô^ÑWxæL-Cq3ôw~ \u001c\u0001òo\u000eDÏv b\u0012NÎ\u00ad¯îin4ÎÇ\u000b\u0007Y÷\u0096Y\u0012]½7 Ú\u0096¾\u0000©\u001d\"ºã3/=ø1#¤¤cNðz\"L\u0084~oSßsø\nÍ\u001a¤Õ\u008d8ððá\u0082\u000elÂM\u008asLÝµ\u009dSÅ1$\u0095¸±òÁ ¤\u0013¨·µ\u0086\u0011\u007f\u0014\u009eX\r\u001c¢)pÚAÇjô\u000eo\u000b\u0002Ì7";
                  int var4 = "7\\\u0097Q,=\u0086\rô^ÑWxæL-Cq3ôw~ \u001c\u0001òo\u000eDÏv b\u0012NÎ\u00ad¯îin4ÎÇ\u000b\u0007Y÷\u0096Y\u0012]½7 Ú\u0096¾\u0000©\u001d\"ºã3/=ø1#¤¤cNðz\"L\u0084~oSßsø\nÍ\u001a¤Õ\u008d8ððá\u0082\u000elÂM\u008asLÝµ\u009dSÅ1$\u0095¸±òÁ ¤\u0013¨·µ\u0086\u0011\u007f\u0014\u009eX\r\u001c¢)pÚAÇjô\u000eo\u000b\u0002Ì7"
                     .length();
                  char var1 = 'z';
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 37;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 37;
                           var10006 = var6;
                        } else {
                           var13 = 37;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 37;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 37;
                              case 1 -> 2;
                              case 2 -> 95;
                              case 3 -> 50;
                              case 4 -> 123;
                              case 5 -> 93;
                              default -> 95;
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
                  int var2 = (var0 ^ 26706) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 136;
                        case 1 -> 210;
                        case 2 -> 186;
                        case 3 -> 91;
                        case 4 -> 211;
                        case 5 -> 162;
                        case 6 -> 221;
                        case 7 -> 125;
                        case 8 -> 225;
                        case 9 -> 32;
                        case 10 -> 197;
                        case 11 -> 183;
                        case 12 -> 141;
                        case 13 -> 8;
                        case 14 -> 73;
                        case 15 -> 246;
                        case 16 -> 212;
                        case 17 -> 222;
                        case 18 -> 70;
                        case 19 -> 114;
                        case 20 -> 121;
                        case 21 -> 148;
                        case 22 -> 153;
                        case 23 -> 127;
                        case 24 -> 83;
                        case 25 -> 108;
                        case 26 -> 138;
                        case 27 -> 80;
                        case 28 -> 39;
                        case 29 -> 52;
                        case 30 -> 129;
                        case 31 -> 107;
                        case 32 -> 227;
                        case 33 -> 49;
                        case 34 -> 250;
                        case 35 -> 159;
                        case 36 -> 233;
                        case 37 -> 177;
                        case 38 -> 94;
                        case 39 -> 5;
                        case 40 -> 92;
                        case 41 -> 93;
                        case 42 -> 255;
                        case 43 -> 95;
                        case 44 -> 38;
                        case 45 -> 160;
                        case 46 -> 45;
                        case 47 -> 22;
                        case 48 -> 216;
                        case 49 -> 202;
                        case 50 -> 140;
                        case 51 -> 69;
                        case 52 -> 175;
                        case 53 -> 236;
                        case 54 -> 172;
                        case 55 -> 30;
                        case 56 -> 213;
                        case 57 -> 151;
                        case 58 -> 215;
                        case 59 -> 170;
                        case 60 -> 144;
                        case 61 -> 85;
                        case 62 -> 106;
                        case 63 -> 79;
                        case 64 -> 176;
                        case 65 -> 219;
                        case 66 -> 178;
                        case 67 -> 98;
                        case 68 -> 182;
                        case 69 -> 50;
                        case 70 -> 58;
                        case 71 -> 46;
                        case 72 -> 119;
                        case 73 -> 228;
                        case 74 -> 101;
                        case 75 -> 143;
                        case 76 -> 74;
                        case 77 -> 104;
                        case 78 -> 124;
                        case 79 -> 88;
                        case 80 -> 111;
                        case 81 -> 234;
                        case 82 -> 142;
                        case 83 -> 56;
                        case 84 -> 152;
                        case 85 -> 86;
                        case 86 -> 102;
                        case 87 -> 237;
                        case 88 -> 53;
                        case 89 -> 163;
                        case 90 -> 194;
                        case 91 -> 71;
                        case 92 -> 55;
                        case 93 -> 150;
                        case 94 -> 217;
                        case 95 -> 147;
                        case 96 -> 133;
                        case 97 -> 100;
                        case 98 -> 126;
                        case 99 -> 198;
                        case 100 -> 207;
                        case 101 -> 230;
                        case 102 -> 103;
                        case 103 -> 235;
                        case 104 -> 99;
                        case 105 -> 254;
                        case 106 -> 252;
                        case 107 -> 171;
                        case 108 -> 4;
                        case 109 -> 248;
                        case 110 -> 44;
                        case 111 -> 43;
                        case 112 -> 245;
                        case 113 -> 110;
                        case 114 -> 23;
                        case 115 -> 25;
                        case 116 -> 37;
                        case 117 -> 68;
                        case 118 -> 0;
                        case 119 -> 241;
                        case 120 -> 229;
                        case 121 -> 243;
                        case 122 -> 67;
                        case 123 -> 90;
                        case 124 -> 218;
                        case 125 -> 75;
                        case 126 -> 134;
                        case 127 -> 181;
                        case 128 -> 158;
                        case 129 -> 173;
                        case 130 -> 66;
                        case 131 -> 156;
                        case 132 -> 61;
                        case 133 -> 130;
                        case 134 -> 199;
                        case 135 -> 161;
                        case 136 -> 64;
                        case 137 -> 26;
                        case 138 -> 27;
                        case 139 -> 116;
                        case 140 -> 251;
                        case 141 -> 12;
                        case 142 -> 34;
                        case 143 -> 165;
                        case 144 -> 36;
                        case 145 -> 132;
                        case 146 -> 13;
                        case 147 -> 155;
                        case 148 -> 117;
                        case 149 -> 115;
                        case 150 -> 14;
                        case 151 -> 24;
                        case 152 -> 9;
                        case 153 -> 20;
                        case 154 -> 51;
                        case 155 -> 42;
                        case 156 -> 180;
                        case 157 -> 189;
                        case 158 -> 253;
                        case 159 -> 120;
                        case 160 -> 54;
                        case 161 -> 209;
                        case 162 -> 203;
                        case 163 -> 63;
                        case 164 -> 137;
                        case 165 -> 174;
                        case 166 -> 35;
                        case 167 -> 65;
                        case 168 -> 220;
                        case 169 -> 7;
                        case 170 -> 2;
                        case 171 -> 184;
                        case 172 -> 238;
                        case 173 -> 214;
                        case 174 -> 193;
                        case 175 -> 89;
                        case 176 -> 191;
                        case 177 -> 33;
                        case 178 -> 223;
                        case 179 -> 41;
                        case 180 -> 154;
                        case 181 -> 205;
                        case 182 -> 135;
                        case 183 -> 168;
                        case 184 -> 196;
                        case 185 -> 3;
                        case 186 -> 59;
                        case 187 -> 10;
                        case 188 -> 188;
                        case 189 -> 112;
                        case 190 -> 187;
                        case 191 -> 131;
                        case 192 -> 19;
                        case 193 -> 200;
                        case 194 -> 47;
                        case 195 -> 48;
                        case 196 -> 240;
                        case 197 -> 145;
                        case 198 -> 28;
                        case 199 -> 139;
                        case 200 -> 77;
                        case 201 -> 31;
                        case 202 -> 15;
                        case 203 -> 201;
                        case 204 -> 40;
                        case 205 -> 128;
                        case 206 -> 82;
                        case 207 -> 96;
                        case 208 -> 16;
                        case 209 -> 166;
                        case 210 -> 113;
                        case 211 -> 60;
                        case 212 -> 190;
                        case 213 -> 122;
                        case 214 -> 242;
                        case 215 -> 29;
                        case 216 -> 87;
                        case 217 -> 78;
                        case 218 -> 185;
                        case 219 -> 239;
                        case 220 -> 208;
                        case 221 -> 118;
                        case 222 -> 76;
                        case 223 -> 195;
                        case 224 -> 206;
                        case 225 -> 231;
                        case 226 -> 149;
                        case 227 -> 192;
                        case 228 -> 226;
                        case 229 -> 72;
                        case 230 -> 1;
                        case 231 -> 97;
                        case 232 -> 164;
                        case 233 -> 11;
                        case 234 -> 109;
                        case 235 -> 105;
                        case 236 -> 84;
                        case 237 -> 249;
                        case 238 -> 123;
                        case 239 -> 169;
                        case 240 -> 224;
                        case 241 -> 232;
                        case 242 -> 17;
                        case 243 -> 18;
                        case 244 -> 146;
                        case 245 -> 6;
                        case 246 -> 179;
                        case 247 -> 244;
                        case 248 -> 204;
                        case 249 -> 81;
                        case 250 -> 157;
                        case 251 -> 167;
                        case 252 -> 21;
                        case 253 -> 247;
                        case 254 -> 62;
                        default -> 57;
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

   @Override
   public void aC() {
      Object llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll = null; // PX-FIX
      int var1;
      label120: {
         label121: {
            label122: {
               var1 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
               int var10000 = ((int[])IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII)[this.W()
                  .ordinal()];
               if (var1 != 0) {
                  switch (var10000) {
                     case 1:
                        var10000 = ((this.aK()) ? 1 : 0);
                        break;
                     case 2:
                        break label122;
                     case 3:
                        break label121;
                     case 4:
                        break label120;
                     default:
                        return;
                  }
               }

               if (var1 != 0) {
                  if (var10000 == 0) {
                     return;
                  }

                  var10000 = ((int[])IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)[this.aJ()
                     .a()
                     .ordinal()];
               }

               label104: {
                  label103: {
                     label123: {
                        if (var1 != 0) {
                           switch (var10000) {
                              case 1:
                                 var10000 = ((IlllllIIlIIIlllIIllIIIllIIlIIIIlIIlllIIlIIllllIlIIllIlIIlllllllllIlIIllIlIllIlIIllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .a()
                                    .al()) ? 1 : 0);
                                 break;
                              case 2:
                                 break label123;
                              case 3:
                                 break label103;
                              default:
                                 break label104;
                           }
                        }

                        if (var10000 != 0) {
                           this.a(
                              IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll,
                              2000
                           );
                           if (var1 != 0) {
                              return;
                           }
                        }

                        this.a(
                           IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl,
                           2000
                        );
                        if (var1 != 0) {
                           return;
                        }
                     }

                     this.bp();
                     if (var1 != 0) {
                        return;
                     }
                  }

                  this.bq();
               }

               if (var1 != 0) {
                  return;
               }
            }

            IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI var4;
            label124: {
               boolean var3 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                  .f()
                  .b();
               if (var1 != 0) {
                  if (!var3) {
                     me.octo.client.utils.player.pathfinder.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(true, false, false, false);
                     lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                        .f()
                        .a(true);
                     lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                        .f()
                        .n();
                     if (var1 != 0) {
                        return;
                     }
                  }

                  var4 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                     .f();
                  if (var1 == 0) {
                     break label124;
                  }

                  var3 = var4.c();
               }

               if (!var3) {
                  return;
               }

               var4 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                  .f();
            }

            var4.o();
            this.a(
               IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               5000
            );
            if (var1 != 0) {
               return;
            }
         }

         if (this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll == null) {
            return;
         }

         BlockPos var2 = this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
         boolean var5 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(
               me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .g(var2),
               me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w(),
               1.5
            );
         if (var1 != 0) {
            if (var5) {
               this.br();
               if (var1 != 0) {
                  return;
               }
            }

            var5 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
               .e()
               .d();
         }

         if (var1 != 0) {
            if (!var5) {
               return;
            }

            IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
               ((BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                  .e())),
               ((IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll)(Object)(var2)),
               0,
               false);
         }

         if (var1 != 0) {
            return;
         }
      }

      me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI var7;
      label126: {
         boolean var6 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.n();
         if (var1 != 0) {
            if (var6) {
               this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI.f();
               return;
            }

            var7 = this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
            if (var1 == 0) {
               break label126;
            }

            var6 = ((java.util.function.Supplier<Boolean>)(() -> { this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI.a(500); return false; })).get();
         }

         if (!var6) {
            return;
         }

         short var8 = -14203;
         short var10001 = -1032;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a("/hotm");
         this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI.f();
         var7 = this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
      }

      var7.f();
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI var1) {
      Object var30 = null; // PX-FIX
      Object var24 = null; // PX-FIX
      Object var20 = null; // PX-FIX
      int var2 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI var10000 = var1;
      if (var2 != 0) {
         short var10001 = -14196;
         short var10002 = 5598;
         Intrinsics.checkNotNullParameter(var1, "event");
         if (this.W()
            != IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII
            )
          {
            return;
         }

         var10000 = var1;
      }

      List var18 = var10000.m();
      if (var18 != null) {
         label89: {
            List var3 = var18;
            boolean var19 = ((java.util.function.Supplier<Boolean>)(() -> { this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl.a(300); return false; })).get();
            if (var2 != 0) {
               if (!var19) {
                  return;
               }

               var20 = this;
               if (var2 == 0) {
                  break label89;
               }

               var19 = this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
            }

            if (!var19) {
               if (((Slot)var3.get(8)).getItem().isEmpty()) {
                  return;
               }

               me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a(8, 1, ContainerInput.PICKUP);
               this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl.f();
               this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = true;
               if (var2 != 0) {
                  return;
               }
            }

            var20 = var3.get(42);
         }

         ItemStack var21 = ((Slot)var20).getItem();
         if (var21 != null) {
            ItemStack var4 = var21;
            boolean var5 = false;
            me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var22 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            String var26 = var4.getHoverName().getString();
            short var10003 = -14207;
            short var10004 = -12690;
            Intrinsics.checkNotNullExpressionValue(var26, "getString(...)");
            String var23 = var22.a(var26);
            short var27 = -14194;
            short var31 = -31479;
            if (Intrinsics.areEqual(var23, "Great Explorer")) {
               label65: {
                  label64: {
                     label63: {
                        var24 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
                        boolean var28 = var4.is(Items.COAL_ORE);
                        if (var2 != 0) {
                           if (var28) {
                              break label63;
                           }

                           var28 = var4.is(Items.REDSTONE_BLOCK);
                        }

                        if (!var28) {
                           me.octo.client.utils.llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI var29 = me.octo.client.utils.llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                           Iterable var6 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .d(var4);
                           me.octo.client.utils.llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI var7 = var29;
                           llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var8 = ((me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)(Object)(((IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)( var24))));
                           boolean var9 = false;
                           var var11 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var6, 10));
                           boolean var12 = false;

                           for (Object var14 : var6) {
                              Component var15 = (Component)var14;
                              boolean var17 = false;
                              var11.add(var15.getString());
                              if (var2 == 0) {
                                 break label65;
                              }

                              if (var2 == 0) {
                                 break;
                              }
                           }

                           List var16 = var11;
                           var24 = var8;
                           var30 = var7.c(var16);
                           break label64;
                        }
                     }

                     var30 = 0;
                  }

                  ((me.octo.client.PXDyn)var24).a(var30);
               }

               LocalPlayer var25 = this.ap().player;
               if (var25 != null) {
                  var25.closeContainer();
               }

               this.ba();
            }
         }
      }
   }

   private final void bp() {
      this.a(
         me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .s()
      );
   }

   private final void bq() {
      this.a(this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll);
   }

   private final void a(BlockPos var1) {
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
      );
      int var10000 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = IIlllIIIIIlllIIlllIIIllIIIIIIlIlIIlIIIIllIlIIIllIllIlIlIIlIIIlllIIllIIllIIIllIIIIIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var1);
      int var2 = var10000;
      IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll var3 = this;
      if (var2 != 0) {
         if (this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll != null) {
            return;
         }

         var3 = this;
      }

      var3.a(
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         5000
      );
   }

   private final void br() {
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
      );
      this.aO();
   }

   private final void bs() {
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII
      );
      this.aO();
      this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI.f();
      this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = false;
   }

   private final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      this.ae()
         .a(
            new lllIllIIllIIIIIIIlIIlIIIIIllllIlIIIIIllllIIlIIIIlllIIIIIIlIIIIlIlIIIIllIIllIIlllIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               IlllllIIlIIIlllIIllIIIllIIlIIIIlIIlllIIlIIllllIlIIllIlIIlllllllllIlIIllIlIllIlIIllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a()
                     .al()
                  ? IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
                  : IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl,
               (kotlin.jvm.functions.Function1)(IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll::f),
               var1.d(),
               0,
               0,
               0L,
               0,
               (kotlin.jvm.functions.Function1)(IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll::g),
               120,
               null
            )
         );
   }

   private final void bt() {
      int var10000 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = false;
      int var1 = var10000;
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = null;
      if (var1 == 0) {
         LocalPlayer var2 = this.ap().player;
         if (var2 != null) {
            var2.closeContainer();
         }
      }

      this.aO();
   }

   @Override
   public void ba() {
      int var1 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
         != IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
         )
       {
         if (IlllllIIlIIIlllIIllIIIllIIlIIIIlIIlllIIlIIllllIlIIllIlIIlllllllllIlIIllIlIllIlIIllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a()
            .al()) {
            this.a(
               IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll,
               2000
            );
            if (var1 == 0) {
               return;
            }
         }

         this.a(
            IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl,
            2000
         );
         if (var1 == 0) {
            return;
         }
      }

      boolean var10000 = IlllllIIlIIIlllIIllIIIllIIlIIIIlIIlllIIlIIllllIlIIllIlIIlllllllllIlIIllIlIllIlIIllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a()
         .al();
      if (var1 == 0) {
         if (!var10000) {
            label75: {
               short var10001 = -14193;
               short var10002 = 28855;
               var10000 = me.octo.client.utils.player.pathfinder.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.a(
                  me.octo.client.utils.player.pathfinder.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                  CollectionsKt.listOf("Jungle"),
                  me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w(),
                  0.0);
               if (var1 == 0) {
                  if (!var10000) {
                     break label75;
                  }

                  var10000 = me.octo.client.utils.player.pathfinder.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w());
               }

               if (!var10000) {
                  this.br();
                  if (var1 == 0) {
                     return;
                  }
               }

               this.bp();
               if (var1 == 0) {
                  return;
               }
            }

            this.a(
               IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               5000
            );
            if (var1 == 0) {
               return;
            }
         }

         var10000 = me.octo.client.utils.player.pathfinder.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.a(
            me.octo.client.utils.player.pathfinder.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w(),
            0.0,
            2,
            null
         );
      }

      if (var1 == 0) {
         if (var10000) {
            this.a(
               IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll,
               2000
            );
            if (var1 == 0) {
               return;
            }
         }

         short var3 = -14206;
         short var4 = -20333;
         var10000 = me.octo.client.utils.player.pathfinder.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.a(
            me.octo.client.utils.player.pathfinder.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            CollectionsKt.listOf("Jungle"),
            me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w(),
            0.0);
      }

      label76: {
         if (var1 == 0) {
            if (!var10000) {
               break label76;
            }

            var10000 = me.octo.client.utils.player.pathfinder.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w());
         }

         if (!var10000) {
            this.br();
            if (var1 == 0) {
               return;
            }
         }

         this.a(
            IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll,
            2000
         );
         if (var1 == 0) {
            return;
         }
      }

      this.a(
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll,
         2000
      );
   }

   @Override
   public void M() {
      boolean var6 = false; // PX-FIX
      int var1 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll var10000 = this;
      if (var1 != 0) {
         if (!(Boolean)IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI.a(this, false, 1, null)) {
            this.N();
            return;
         }

         var10000 = this;
      }

      boolean var3;
      boolean var4;
      var10000.aM();
      boolean var2 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
         != null;
      var3 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .p()
         != null;
      var4 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
         == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      var6 = var2;
      label62:
      if (var1 != 0) {
         if (var2) {
            var6 = var3;
            if (var1 == 0) {
               break label62;
            }

            if (var3) {
               var6 = var4;
               if (var1 == 0) {
                  break label62;
               }

               if (var4) {
                  super.M();
                  llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI[] var5 = new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI[]{
                     new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                        null,
                        true
                     ),
                     new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                        IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll::bv,
                        false
                     ),
                     new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
                        IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll::bw,
                        false
                     ),
                     new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                        IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll::bx,
                        false
                     )
                  };
                  this.a(CollectionsKt.listOf(var5));
                  lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                     .f()
                     .a(0);
                  this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl.f();
                  this.bs();
                  return;
               }
            }
         }

         var6 = var2;
      }

      if (var1 != 0) {
         if (!var6) {
            this.bg();
         }

         var6 = var3;
      }

      if (var1 != 0) {
         if (!var6) {
            this.bd();
         }

         var6 = var4;
      }

      if (!var6) {
         this.b(
            CollectionsKt.listOf(
               IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
            )
         );
      }

      this.N();
   }

   @Override
   public boolean af() {
      return this.W()
         == IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   @Override
   public void O() {
   }

   private static final long a(IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll var0) {
      return var0.aJ().b() + 20000L;
   }

   private static final Object b(IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll var0) {
      return TuplesKt.to(
         var0.aJ().a(),
         IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
      );
   }

   private static final Object c(IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll var0) {
      String var3;
      IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000;
      boolean var10002;
      label13: {
         int var1 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
         var10002 = var0.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
         Screen var10003 = var0.ap().screen;
         if (var10003 != null) {
            Component var2 = var10003.getTitle();
            if (var2 != null) {
               var3 = var2.getString();
               if (var1 == 0) {
                  break label13;
               }
            }
         }

         var3 = null;
      }

      var10000 = new IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         var10002,
         var3,
         llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll
            .b()
      );
      return var10000;
   }

   private static final Object d(IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll var0) {
      return new IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
         var0.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll,
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .e()
            .d(),
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(var0, 0.0, 1, null)
      );
   }

   private static final boolean bu() {
      return lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
         .f()
         .b();
   }

   private static final Object e(IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll var0) {
      return new IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
            .f()
            .f(),
         me.octo.client.utils.IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .t(),
         lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
            .f()
            .d(),
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(var0, 0.0, 1, null)
      );
   }

   private static final Unit f(IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll var0) {
      var0.ba();
      return Unit.INSTANCE;
   }

   private static final Unit g(IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll var0) {
      var0.bt();
      return Unit.INSTANCE;
   }

   private static final boolean h(IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll var0) {
      int var1 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
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

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[13];
      int var3 = 0;
      String var2 = "?+WP\u007fù\u008b\b\u009fK¤\u000b7öVë_\u008e\u008fæ\u0019\u008e²\rdE<\u009d\u0012@&&7£\u001cu)\u0005TgÓM¼\u0006\u0013²óZ\u0098Û\u000fÄ&6;ÍeàR\u0010ý\u009fx\u0003V\u0002\u000e×\u0090J'Ü\u0017ÿÛ\u0011å}4\u007f`\u000e\u0082\u0019S\tÍ\u0014åC:\u001fRÉñ4\u000e\u0086Næ$H\u0097y=\u0017@C²ñ×\u0006¬£\u0004xf\u009f\u0005±,fãX";
      int var4 = "?+WP\u007fù\u008b\b\u009fK¤\u000b7öVë_\u008e\u008fæ\u0019\u008e²\rdE<\u009d\u0012@&&7£\u001cu)\u0005TgÓM¼\u0006\u0013²óZ\u0098Û\u000fÄ&6;ÍeàR\u0010ý\u009fx\u0003V\u0002\u000e×\u0090J'Ü\u0017ÿÛ\u0011å}4\u007f`\u000e\u0082\u0019S\tÍ\u0014åC:\u001fRÉñ4\u000e\u0086Næ$H\u0097y=\u0017@C²ñ×\u0006¬£\u0004xf\u009f\u0005±,fãX"
         .length();
      char var1 = 11;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 75;
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
                     case 0 -> 119;
                     case 1 -> 14;
                     case 2 -> 48;
                     case 3 -> 83;
                     case 4 -> 13;
                     case 5 -> 54;
                     default -> 76;
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
                     k = new String[13];
                     IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = new IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII = new IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll();
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

                  var2 = "i]ÐÓÂÄqÂ\u0083n²Éq@>\u007fh«î?nDu\u00936Û\u00adð\u0017ËÈQµíâ\u0003¿Ò±\u0015\"\u0011\u0005Øp\u0091³&Y\u0099§\u0014ÄÉ\u0007Gat\u0018ÏSZ,b\u000bûa\u009bâ2ñt\u0092\u0087Ý½\u008b\u009e}e\u0011iåb|ÛÚ_SàbÍ?Ù«£Qè`r½µÁ\u0097·SûXõù\u0085¬E\u000b;{|ºùùª\u0080\u001c¶<Ü";
                  var4 = "i]ÐÓÂÄqÂ\u0083n²Éq@>\u007fh«î?nDu\u00936Û\u00adð\u0017ËÈQµíâ\u0003¿Ò±\u0015\"\u0011\u0005Øp\u0091³&Y\u0099§\u0014ÄÉ\u0007Gat\u0018ÏSZ,b\u000bûa\u009bâ2ñt\u0092\u0087Ý½\u008b\u009e}e\u0011iåb|ÛÚ_SàbÍ?Ù«£Qè`r½µÁ\u0097·SûXõù\u0085¬E\u000b;{|ºùùª\u0080\u001c¶<Ü"
                     .length();
                  var1 = '\f';
                  var8 = -1;
            }

            var10000 = 42;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String e(int var0, int var1) {
      int var2 = (var0 ^ -14202) & 65535;
      if (k[var2] == null) {
         char[] var3 = j[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 162;
            case 1 -> 133;
            case 2 -> 114;
            case 3 -> 69;
            case 4 -> 145;
            case 5 -> 0;
            case 6 -> 91;
            case 7 -> 99;
            case 8 -> 218;
            case 9 -> 201;
            case 10 -> 82;
            case 11 -> 171;
            case 12 -> 134;
            case 13 -> 206;
            case 14 -> 197;
            case 15 -> 54;
            case 16 -> 228;
            case 17 -> 111;
            case 18 -> 180;
            case 19 -> 209;
            case 20 -> 136;
            case 21 -> 241;
            case 22 -> 247;
            case 23 -> 185;
            case 24 -> 87;
            case 25 -> 105;
            case 26 -> 199;
            case 27 -> 217;
            case 28 -> 102;
            case 29 -> 229;
            case 30 -> 146;
            case 31 -> 100;
            case 32 -> 240;
            case 33 -> 207;
            case 34 -> 73;
            case 35 -> 18;
            case 36 -> 125;
            case 37 -> 53;
            case 38 -> 22;
            case 39 -> 34;
            case 40 -> 164;
            case 41 -> 154;
            case 42 -> 236;
            case 43 -> 119;
            case 44 -> 27;
            case 45 -> 117;
            case 46 -> 36;
            case 47 -> 46;
            case 48 -> 84;
            case 49 -> 214;
            case 50 -> 72;
            case 51 -> 11;
            case 52 -> 169;
            case 53 -> 251;
            case 54 -> 122;
            case 55 -> 238;
            case 56 -> 151;
            case 57 -> 158;
            case 58 -> 62;
            case 59 -> 202;
            case 60 -> 212;
            case 61 -> 128;
            case 62 -> 79;
            case 63 -> 220;
            case 64 -> 234;
            case 65 -> 184;
            case 66 -> 21;
            case 67 -> 9;
            case 68 -> 123;
            case 69 -> 109;
            case 70 -> 19;
            case 71 -> 215;
            case 72 -> 106;
            case 73 -> 49;
            case 74 -> 68;
            case 75 -> 178;
            case 76 -> 173;
            case 77 -> 16;
            case 78 -> 140;
            case 79 -> 135;
            case 80 -> 143;
            case 81 -> 116;
            case 82 -> 89;
            case 83 -> 200;
            case 84 -> 20;
            case 85 -> 14;
            case 86 -> 187;
            case 87 -> 127;
            case 88 -> 152;
            case 89 -> 232;
            case 90 -> 4;
            case 91 -> 237;
            case 92 -> 80;
            case 93 -> 88;
            case 94 -> 219;
            case 95 -> 198;
            case 96 -> 167;
            case 97 -> 39;
            case 98 -> 65;
            case 99 -> 8;
            case 100 -> 77;
            case 101 -> 227;
            case 102 -> 156;
            case 103 -> 85;
            case 104 -> 177;
            case 105 -> 52;
            case 106 -> 235;
            case 107 -> 205;
            case 108 -> 196;
            case 109 -> 139;
            case 110 -> 108;
            case 111 -> 242;
            case 112 -> 121;
            case 113 -> 104;
            case 114 -> 35;
            case 115 -> 192;
            case 116 -> 179;
            case 117 -> 150;
            case 118 -> 66;
            case 119 -> 5;
            case 120 -> 120;
            case 121 -> 243;
            case 122 -> 144;
            case 123 -> 147;
            case 124 -> 42;
            case 125 -> 101;
            case 126 -> 58;
            case 127 -> 40;
            case 128 -> 249;
            case 129 -> 1;
            case 130 -> 30;
            case 131 -> 226;
            case 132 -> 50;
            case 133 -> 28;
            case 134 -> 31;
            case 135 -> 137;
            case 136 -> 148;
            case 137 -> 110;
            case 138 -> 130;
            case 139 -> 239;
            case 140 -> 112;
            case 141 -> 246;
            case 142 -> 2;
            case 143 -> 95;
            case 144 -> 221;
            case 145 -> 244;
            case 146 -> 189;
            case 147 -> 194;
            case 148 -> 10;
            case 149 -> 183;
            case 150 -> 124;
            case 151 -> 23;
            case 152 -> 203;
            case 153 -> 224;
            case 154 -> 70;
            case 155 -> 75;
            case 156 -> 253;
            case 157 -> 252;
            case 158 -> 245;
            case 159 -> 141;
            case 160 -> 26;
            case 161 -> 93;
            case 162 -> 55;
            case 163 -> 223;
            case 164 -> 59;
            case 165 -> 225;
            case 166 -> 7;
            case 167 -> 174;
            case 168 -> 155;
            case 169 -> 56;
            case 170 -> 166;
            case 171 -> 57;
            case 172 -> 161;
            case 173 -> 213;
            case 174 -> 98;
            case 175 -> 41;
            case 176 -> 3;
            case 177 -> 176;
            case 178 -> 63;
            case 179 -> 193;
            case 180 -> 86;
            case 181 -> 43;
            case 182 -> 129;
            case 183 -> 25;
            case 184 -> 233;
            case 185 -> 222;
            case 186 -> 12;
            case 187 -> 255;
            case 188 -> 33;
            case 189 -> 191;
            case 190 -> 149;
            case 191 -> 6;
            case 192 -> 190;
            case 193 -> 13;
            case 194 -> 216;
            case 195 -> 160;
            case 196 -> 44;
            case 197 -> 138;
            case 198 -> 38;
            case 199 -> 47;
            case 200 -> 230;
            case 201 -> 126;
            case 202 -> 61;
            case 203 -> 94;
            case 204 -> 74;
            case 205 -> 172;
            case 206 -> 103;
            case 207 -> 163;
            case 208 -> 92;
            case 209 -> 64;
            case 210 -> 254;
            case 211 -> 118;
            case 212 -> 45;
            case 213 -> 83;
            case 214 -> 29;
            case 215 -> 131;
            case 216 -> 182;
            case 217 -> 15;
            case 218 -> 107;
            case 219 -> 186;
            case 220 -> 97;
            case 221 -> 37;
            case 222 -> 210;
            case 223 -> 60;
            case 224 -> 231;
            case 225 -> 115;
            case 226 -> 159;
            case 227 -> 204;
            case 228 -> 142;
            case 229 -> 170;
            case 230 -> 188;
            case 231 -> 90;
            case 232 -> 195;
            case 233 -> 208;
            case 234 -> 51;
            case 235 -> 76;
            case 236 -> 67;
            case 237 -> 168;
            case 238 -> 96;
            case 239 -> 165;
            case 240 -> 248;
            case 241 -> 211;
            case 242 -> 78;
            case 243 -> 32;
            case 244 -> 153;
            case 245 -> 81;
            case 246 -> 132;
            case 247 -> 24;
            case 248 -> 157;
            case 249 -> 113;
            case 250 -> 175;
            case 251 -> 71;
            case 252 -> 48;
            case 253 -> 17;
            case 254 -> 181;
            default -> 250;
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
      @NotNull
      private final IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @NotNull
      private final Triple<Integer, Integer, Integer> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] a;
      private static String[] b;

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         @NotNull IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1,
         int var2,
         int var3,
         @NotNull Triple<Integer, Integer, Integer> var4
      ) {
         short var10001 = 5747;
         short var10002 = 600;
         Intrinsics.checkNotNullParameter(var1, "handler");
         var10001 = 5748;
         byte var6 = -38;
         Intrinsics.checkNotNullParameter(var4, "playerPos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
      }

      @NotNull
      public final IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI e() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int f() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int g() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> h() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
         @NotNull IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1,
         int var2,
         int var3,
         @NotNull Triple<Integer, Integer, Integer> var4
      ) {
         short var10001 = 5746;
         short var10002 = -20010;
         Intrinsics.checkNotNullParameter(var1, "handler");
         var10001 = 5751;
         var10002 = -8866;
         Intrinsics.checkNotNullParameter(var4, "playerPos");
         return new IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            var1, var2, var3, var4
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 5745;
         Triple var1 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         int var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 22355;
         short var10002 = 5744;
         short var10003 = 8564;
         short var10004 = 5750;
         short var10005 = -23205;
         short var10006 = 5749;
         short var10007 = -8354;
         return "MineProgress(handler=" + var4 + ", hardstoneMined=" + var3 + ", chestsOpened=" + var2 + ", playerPos=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         var1 = var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         var1 = var1 * 31 + Integer.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         return var1 * 31 + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int var2 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
         Object var10000 = this;
         if (var2 != 0) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != 0) {
            if (!(
               var10000 instanceof IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = (IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var10000;
         int var4 = ((Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )) ? 1 : 0);
         if (var2 != 0) {
            if (var4 == 0) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         label56: {
            int var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (var2 != 0) {
               if (var4 != var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
                  return false;
               }

               var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               if (var2 == 0) {
                  break label56;
               }

               var10001 = var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }

            if (var4 != var10001) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
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
         String[] var5 = new String[8];
         int var3 = 0;
         String var2 = "7ûæ\u0010ÏþÌteÛa\u0091YÂ=\u0011\u0092\u0015\u001fB¨Câ\u0006\u0013¬\u001cºæé<2üÃw\u009dgõb\u0007ÝzqLåÑU\u0007\u0087¥:·\u008c®x\t\u009a(\u008d·\u009d\u0007P\u0084\u00ad\fW¯ò\u0097E¿úäH\u000e\nz";
         int var4 = "7ûæ\u0010ÏþÌteÛa\u0091YÂ=\u0011\u0092\u0015\u001fB¨Câ\u0006\u0013¬\u001cºæé<2üÃw\u009dgõb\u0007ÝzqLåÑU\u0007\u0087¥:·\u008c®x\t\u009a(\u008d·\u009d\u0007P\u0084\u00ad\fW¯ò\u0097E¿úäH\u000e\nz"
            .length();
         char var1 = 17;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 29;
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
                        case 0 -> 8;
                        case 1 -> 125;
                        case 2 -> 126;
                        case 3 -> 59;
                        case 4 -> 117;
                        case 5 -> 12;
                        default -> 106;
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

                     var2 = "Ni\u0015\u009c\u001b\u0087s~\u0082´nUcÀx\tj\u0082D5s\u0080Z£;";
                     var4 = "Ni\u0015\u009c\u001b\u0087s~\u0082´nUcÀx\tj\u0082D5s\u0080Z£;".length();
                     var1 = 15;
                     var8 = -1;
               }

               var10000 = 65;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 5744) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 183;
               case 1 -> 57;
               case 2 -> 120;
               case 3 -> 140;
               case 4 -> 192;
               case 5 -> 73;
               case 6 -> 173;
               case 7 -> 48;
               case 8 -> 31;
               case 9 -> 41;
               case 10 -> 12;
               case 11 -> 184;
               case 12 -> 56;
               case 13 -> 199;
               case 14 -> 231;
               case 15 -> 62;
               case 16 -> 207;
               case 17 -> 86;
               case 18 -> 123;
               case 19 -> 68;
               case 20 -> 171;
               case 21 -> 28;
               case 22 -> 38;
               case 23 -> 150;
               case 24 -> 249;
               case 25 -> 45;
               case 26 -> 79;
               case 27 -> 3;
               case 28 -> 39;
               case 29 -> 205;
               case 30 -> 235;
               case 31 -> 238;
               case 32 -> 42;
               case 33 -> 229;
               case 34 -> 102;
               case 35 -> 11;
               case 36 -> 253;
               case 37 -> 36;
               case 38 -> 191;
               case 39 -> 49;
               case 40 -> 63;
               case 41 -> 242;
               case 42 -> 252;
               case 43 -> 30;
               case 44 -> 230;
               case 45 -> 100;
               case 46 -> 132;
               case 47 -> 228;
               case 48 -> 155;
               case 49 -> 254;
               case 50 -> 50;
               case 51 -> 153;
               case 52 -> 119;
               case 53 -> 37;
               case 54 -> 133;
               case 55 -> 208;
               case 56 -> 71;
               case 57 -> 47;
               case 58 -> 1;
               case 59 -> 104;
               case 60 -> 81;
               case 61 -> 156;
               case 62 -> 65;
               case 63 -> 182;
               case 64 -> 52;
               case 65 -> 4;
               case 66 -> 240;
               case 67 -> 75;
               case 68 -> 174;
               case 69 -> 154;
               case 70 -> 160;
               case 71 -> 46;
               case 72 -> 51;
               case 73 -> 147;
               case 74 -> 239;
               case 75 -> 27;
               case 76 -> 40;
               case 77 -> 198;
               case 78 -> 250;
               case 79 -> 91;
               case 80 -> 19;
               case 81 -> 186;
               case 82 -> 134;
               case 83 -> 90;
               case 84 -> 87;
               case 85 -> 108;
               case 86 -> 103;
               case 87 -> 181;
               case 88 -> 64;
               case 89 -> 139;
               case 90 -> 168;
               case 91 -> 232;
               case 92 -> 138;
               case 93 -> 70;
               case 94 -> 16;
               case 95 -> 135;
               case 96 -> 23;
               case 97 -> 209;
               case 98 -> 136;
               case 99 -> 172;
               case 100 -> 84;
               case 101 -> 170;
               case 102 -> 151;
               case 103 -> 21;
               case 104 -> 7;
               case 105 -> 121;
               case 106 -> 142;
               case 107 -> 126;
               case 108 -> 131;
               case 109 -> 92;
               case 110 -> 34;
               case 111 -> 178;
               case 112 -> 115;
               case 113 -> 76;
               case 114 -> 212;
               case 115 -> 200;
               case 116 -> 22;
               case 117 -> 214;
               case 118 -> 164;
               case 119 -> 179;
               case 120 -> 244;
               case 121 -> 177;
               case 122 -> 77;
               case 123 -> 187;
               case 124 -> 243;
               case 125 -> 67;
               case 126 -> 227;
               case 127 -> 213;
               case 128 -> 14;
               case 129 -> 128;
               case 130 -> 217;
               case 131 -> 82;
               case 132 -> 144;
               case 133 -> 149;
               case 134 -> 20;
               case 135 -> 69;
               case 136 -> 206;
               case 137 -> 196;
               case 138 -> 55;
               case 139 -> 137;
               case 140 -> 176;
               case 141 -> 236;
               case 142 -> 43;
               case 143 -> 219;
               case 144 -> 44;
               case 145 -> 218;
               case 146 -> 94;
               case 147 -> 221;
               case 148 -> 233;
               case 149 -> 189;
               case 150 -> 17;
               case 151 -> 203;
               case 152 -> 245;
               case 153 -> 89;
               case 154 -> 167;
               case 155 -> 193;
               case 156 -> 35;
               case 157 -> 5;
               case 158 -> 251;
               case 159 -> 202;
               case 160 -> 185;
               case 161 -> 210;
               case 162 -> 32;
               case 163 -> 109;
               case 164 -> 234;
               case 165 -> 78;
               case 166 -> 246;
               case 167 -> 0;
               case 168 -> 226;
               case 169 -> 18;
               case 170 -> 162;
               case 171 -> 9;
               case 172 -> 166;
               case 173 -> 180;
               case 174 -> 15;
               case 175 -> 165;
               case 176 -> 194;
               case 177 -> 98;
               case 178 -> 112;
               case 179 -> 13;
               case 180 -> 190;
               case 181 -> 95;
               case 182 -> 146;
               case 183 -> 152;
               case 184 -> 53;
               case 185 -> 61;
               case 186 -> 110;
               case 187 -> 175;
               case 188 -> 255;
               case 189 -> 113;
               case 190 -> 197;
               case 191 -> 116;
               case 192 -> 201;
               case 193 -> 24;
               case 194 -> 105;
               case 195 -> 125;
               case 196 -> 145;
               case 197 -> 127;
               case 198 -> 2;
               case 199 -> 215;
               case 200 -> 54;
               case 201 -> 33;
               case 202 -> 85;
               case 203 -> 148;
               case 204 -> 225;
               case 205 -> 195;
               case 206 -> 224;
               case 207 -> 66;
               case 208 -> 159;
               case 209 -> 163;
               case 210 -> 114;
               case 211 -> 223;
               case 212 -> 26;
               case 213 -> 158;
               case 214 -> 169;
               case 215 -> 122;
               case 216 -> 129;
               case 217 -> 124;
               case 218 -> 130;
               case 219 -> 241;
               case 220 -> 6;
               case 221 -> 117;
               case 222 -> 101;
               case 223 -> 143;
               case 224 -> 204;
               case 225 -> 111;
               case 226 -> 157;
               case 227 -> 107;
               case 228 -> 60;
               case 229 -> 80;
               case 230 -> 211;
               case 231 -> 222;
               case 232 -> 58;
               case 233 -> 10;
               case 234 -> 97;
               case 235 -> 59;
               case 236 -> 247;
               case 237 -> 188;
               case 238 -> 161;
               case 239 -> 72;
               case 240 -> 96;
               case 241 -> 74;
               case 242 -> 248;
               case 243 -> 220;
               case 244 -> 106;
               case 245 -> 8;
               case 246 -> 141;
               case 247 -> 216;
               case 248 -> 25;
               case 249 -> 83;
               case 250 -> 99;
               case 251 -> 88;
               case 252 -> 93;
               case 253 -> 118;
               case 254 -> 29;
               default -> 237;
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
      public static IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll p0, me.octo.client.IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI p1, int p2, int p3, kotlin.Triple p4, int p5, java.lang.Object p6) {
         if ((p5 & 1) != 0) p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if ((p5 & 2) != 0) p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if ((p5 & 4) != 0) p3 = p0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if ((p5 & 8) != 0) p4 = p0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         return p0.a(p1, p2, p3, p4);
      }
   }

   private static final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
      @Nullable
      private final BlockPos IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final Triple<Integer, Integer, Integer> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
         @Nullable BlockPos var1, boolean var2, @NotNull Triple<Integer, Integer, Integer> var3
      ) {
         short var10001 = -27087;
         short var10002 = 15820;
         Intrinsics.checkNotNullParameter(var3, "playerPos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      }

      @Nullable
      public final BlockPos a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final boolean b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @Nullable
      public final BlockPos d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final boolean e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(
         @Nullable BlockPos var1, boolean var2, @NotNull Triple<Integer, Integer, Integer> var3
      ) {
         short var10001 = -27082;
         short var10002 = 15089;
         Intrinsics.checkNotNullParameter(var3, "playerPos");
         return new IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -27086;
         Triple var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         boolean var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         BlockPos var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 13425;
         short var10002 = -27085;
         short var10003 = -25770;
         short var10004 = -27088;
         short var10005 = 12907;
         return "MoveProgress(walkPosition=" + var3 + ", walkerFinished=" + var2 + ", playerPos=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var4;
         label14: {
            int var1 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
            BlockPos var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            if (var1 == 0) {
               if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl == null) {
                  var4 = 0;
                  break label14;
               }

               var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            }

            var4 = var10000.hashCode();
         }

         int var2 = var4;
         var2 = var2 * 31 + Boolean.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         return var2 * 31 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int var2 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
         Object var10000 = this;
         if (var2 == 0) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == 0) {
            if (!(
               var10000 instanceof IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var3 = (IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)var10000;
         boolean var4 = Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         );
         if (var2 == 0) {
            if (!var4) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         if (var2 == 0) {
            if (var4 != var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            );
         }

         if (var2 == 0) {
            if (!var4) {
               return false;
            }

            var4 = true;
         }

         return var4;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[5];
         int var3 = 0;
         String var2 = "BnÌ\u0099éÂ\u0095Ô;b\u009bn\f:\u001aËs{\u009f\f\u0085?äd\u0005«\u0011\u008cvY8FkÑÎÌ\u009aÊæÃm×Õ\u0018\f¡«û\u008eø\u0003ª\u0093µ7,Á";
         int var4 = "BnÌ\u0099éÂ\u0095Ô;b\u009bn\f:\u001aËs{\u009f\f\u0085?äd\u0005«\u0011\u008cvY8FkÑÎÌ\u009aÊæÃm×Õ\u0018\f¡«û\u008eø\u0003ª\u0093µ7,Á"
            .length();
         char var1 = 26;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 51;
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
                        case 0 -> 104;
                        case 1 -> 37;
                        case 2 -> 78;
                        case 3 -> 66;
                        case 4 -> 4;
                        case 5 -> 87;
                        default -> 72;
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
                        b = new String[5];
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

                     var2 = "Vôü\u008a\u0010\u00009»H\tm\u0085\u009b¤üÅ¤\u0003û";
                     var4 = "Vôü\u008a\u0010\u00009»H\tm\u0085\u009b¤üÅ¤\u0003û".length();
                     var1 = '\t';
                     var8 = -1;
               }

               var10000 = 11;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -27086) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 128;
               case 1 -> 201;
               case 2 -> 47;
               case 3 -> 142;
               case 4 -> 118;
               case 5 -> 0;
               case 6 -> 6;
               case 7 -> 68;
               case 8 -> 76;
               case 9 -> 113;
               case 10 -> 61;
               case 11 -> 141;
               case 12 -> 129;
               case 13 -> 228;
               case 14 -> 115;
               case 15 -> 243;
               case 16 -> 31;
               case 17 -> 28;
               case 18 -> 52;
               case 19 -> 205;
               case 20 -> 15;
               case 21 -> 98;
               case 22 -> 26;
               case 23 -> 191;
               case 24 -> 105;
               case 25 -> 29;
               case 26 -> 163;
               case 27 -> 219;
               case 28 -> 101;
               case 29 -> 122;
               case 30 -> 36;
               case 31 -> 83;
               case 32 -> 108;
               case 33 -> 16;
               case 34 -> 178;
               case 35 -> 209;
               case 36 -> 160;
               case 37 -> 116;
               case 38 -> 62;
               case 39 -> 66;
               case 40 -> 220;
               case 41 -> 18;
               case 42 -> 148;
               case 43 -> 19;
               case 44 -> 227;
               case 45 -> 225;
               case 46 -> 13;
               case 47 -> 196;
               case 48 -> 146;
               case 49 -> 59;
               case 50 -> 97;
               case 51 -> 107;
               case 52 -> 57;
               case 53 -> 135;
               case 54 -> 79;
               case 55 -> 255;
               case 56 -> 127;
               case 57 -> 34;
               case 58 -> 207;
               case 59 -> 173;
               case 60 -> 30;
               case 61 -> 104;
               case 62 -> 150;
               case 63 -> 45;
               case 64 -> 203;
               case 65 -> 38;
               case 66 -> 74;
               case 67 -> 126;
               case 68 -> 139;
               case 69 -> 110;
               case 70 -> 217;
               case 71 -> 63;
               case 72 -> 185;
               case 73 -> 212;
               case 74 -> 50;
               case 75 -> 164;
               case 76 -> 183;
               case 77 -> 181;
               case 78 -> 247;
               case 79 -> 87;
               case 80 -> 186;
               case 81 -> 216;
               case 82 -> 177;
               case 83 -> 2;
               case 84 -> 167;
               case 85 -> 65;
               case 86 -> 206;
               case 87 -> 151;
               case 88 -> 198;
               case 89 -> 224;
               case 90 -> 234;
               case 91 -> 72;
               case 92 -> 90;
               case 93 -> 253;
               case 94 -> 125;
               case 95 -> 42;
               case 96 -> 252;
               case 97 -> 239;
               case 98 -> 195;
               case 99 -> 132;
               case 100 -> 157;
               case 101 -> 240;
               case 102 -> 43;
               case 103 -> 81;
               case 104 -> 251;
               case 105 -> 193;
               case 106 -> 192;
               case 107 -> 67;
               case 108 -> 49;
               case 109 -> 106;
               case 110 -> 80;
               case 111 -> 194;
               case 112 -> 12;
               case 113 -> 171;
               case 114 -> 229;
               case 115 -> 188;
               case 116 -> 144;
               case 117 -> 231;
               case 118 -> 48;
               case 119 -> 223;
               case 120 -> 222;
               case 121 -> 75;
               case 122 -> 161;
               case 123 -> 100;
               case 124 -> 137;
               case 125 -> 78;
               case 126 -> 254;
               case 127 -> 175;
               case 128 -> 51;
               case 129 -> 102;
               case 130 -> 246;
               case 131 -> 235;
               case 132 -> 249;
               case 133 -> 155;
               case 134 -> 25;
               case 135 -> 69;
               case 136 -> 242;
               case 137 -> 190;
               case 138 -> 112;
               case 139 -> 202;
               case 140 -> 14;
               case 141 -> 10;
               case 142 -> 233;
               case 143 -> 3;
               case 144 -> 96;
               case 145 -> 7;
               case 146 -> 85;
               case 147 -> 119;
               case 148 -> 5;
               case 149 -> 55;
               case 150 -> 215;
               case 151 -> 41;
               case 152 -> 35;
               case 153 -> 200;
               case 154 -> 245;
               case 155 -> 23;
               case 156 -> 230;
               case 157 -> 4;
               case 158 -> 9;
               case 159 -> 39;
               case 160 -> 22;
               case 161 -> 70;
               case 162 -> 184;
               case 163 -> 156;
               case 164 -> 11;
               case 165 -> 89;
               case 166 -> 154;
               case 167 -> 170;
               case 168 -> 123;
               case 169 -> 88;
               case 170 -> 134;
               case 171 -> 232;
               case 172 -> 248;
               case 173 -> 174;
               case 174 -> 46;
               case 175 -> 143;
               case 176 -> 37;
               case 177 -> 236;
               case 178 -> 109;
               case 179 -> 169;
               case 180 -> 147;
               case 181 -> 214;
               case 182 -> 131;
               case 183 -> 208;
               case 184 -> 56;
               case 185 -> 176;
               case 186 -> 111;
               case 187 -> 27;
               case 188 -> 152;
               case 189 -> 138;
               case 190 -> 250;
               case 191 -> 17;
               case 192 -> 1;
               case 193 -> 172;
               case 194 -> 182;
               case 195 -> 99;
               case 196 -> 199;
               case 197 -> 21;
               case 198 -> 114;
               case 199 -> 95;
               case 200 -> 140;
               case 201 -> 53;
               case 202 -> 73;
               case 203 -> 124;
               case 204 -> 117;
               case 205 -> 189;
               case 206 -> 58;
               case 207 -> 24;
               case 208 -> 153;
               case 209 -> 241;
               case 210 -> 158;
               case 211 -> 211;
               case 212 -> 136;
               case 213 -> 133;
               case 214 -> 165;
               case 215 -> 91;
               case 216 -> 179;
               case 217 -> 60;
               case 218 -> 54;
               case 219 -> 213;
               case 220 -> 180;
               case 221 -> 84;
               case 222 -> 162;
               case 223 -> 71;
               case 224 -> 8;
               case 225 -> 33;
               case 226 -> 94;
               case 227 -> 210;
               case 228 -> 226;
               case 229 -> 244;
               case 230 -> 121;
               case 231 -> 197;
               case 232 -> 103;
               case 233 -> 159;
               case 234 -> 204;
               case 235 -> 187;
               case 236 -> 40;
               case 237 -> 64;
               case 238 -> 82;
               case 239 -> 92;
               case 240 -> 238;
               case 241 -> 168;
               case 242 -> 44;
               case 243 -> 130;
               case 244 -> 237;
               case 245 -> 221;
               case 246 -> 77;
               case 247 -> 20;
               case 248 -> 166;
               case 249 -> 218;
               case 250 -> 149;
               case 251 -> 93;
               case 252 -> 86;
               case 253 -> 145;
               case 254 -> 32;
               default -> 120;
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
      public static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll p0, net.minecraft.core.BlockPos p1, boolean p2, kotlin.Triple p3, int p4, java.lang.Object p5) {
         if ((p4 & 1) != 0) p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if ((p4 & 2) != 0) p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if ((p4 & 4) != 0) p3 = p0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         return p0.a(p1, p2, p3);
      }
   }

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(Object... px) {
        }

      private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
      }

      @NotNull
      public final IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll a() {
         return IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
      }
      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(kotlin.jvm.internal.DefaultConstructorMarker p0) { this(); }
   }

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private final boolean IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @Nullable
      private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(boolean var1, @Nullable String var2, int var3) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      }

      public final boolean a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final String b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final boolean d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final String e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         boolean var1, @Nullable String var2, int var3
      ) {
         return new IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -2404;
         int var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         String var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         boolean var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 25855;
         short var10002 = -2402;
         short var10003 = 9320;
         short var10004 = -2401;
         short var10005 = 16431;
         return "CommandProgress(clickedTop=" + var3 + ", screenTitle=" + var2 + ", greatExplorerLevel=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var4;
         int var5;
         label14: {
            var4 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
            int var2 = Boolean.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
            int var1 = var4;
            var4 = var2 * 31;
            String var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (var1 != 0) {
               if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII == null) {
                  var5 = 0;
                  break label14;
               }

               var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            var5 = var10001.hashCode();
         }

         int var3 = var4 + var5;
         return var3 * 31 + Integer.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int var2 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
         Object var10000 = this;
         if (var2 == 0) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == 0) {
            if (!(
               var10000 instanceof IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIllllIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         int var4 = ((this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) ? 1 : 0);
         if (var2 == 0) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )) ? 1 : 0);
         }

         if (var2 == 0) {
            if (var4 == 0) {
               return false;
            }

            var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         if (var2 == 0) {
            if (var4 != var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
         pxClinit: {
         String[] var5 = new String[3];
         int var3 = 0;
         String var2 = "y\r oÈ9¨íþ\"üß¾Ï\u0015\u0002!Ûû&\u009c\u0091öÆ\u0016J`d\u0003¯\u0093ùH c\u0018\u001b¨\u001d\u0006ÅÒ¨\u009b\u008b\u009f\u0011!at\u008bY2\u0000\u008eÕí}º»\u009fyî.";
         int var4 = "y\r oÈ9¨íþ\"üß¾Ï\u0015\u0002!Ûû&\u009c\u0091öÆ\u0016J`d\u0003¯\u0093ùH c\u0018\u001b¨\u001d\u0006ÅÒ¨\u009b\u008b\u009f\u0011!at\u008bY2\u0000\u008eÕí}º»\u009fyî."
            .length();
         char var1 = 14;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 107;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 107;
                  var10006 = var6;
               } else {
                  var13 = 107;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 107;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 104;
                     case 1 -> 84;
                     case 2 -> 94;
                     case 3 -> 5;
                     case 4 -> 126;
                     case 5 -> 24;
                     default -> 33;
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
         int var2 = (var0 ^ -2402) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 65;
               case 1 -> 2;
               case 2 -> 75;
               case 3 -> 86;
               case 4 -> 74;
               case 5 -> 148;
               case 6 -> 89;
               case 7 -> 220;
               case 8 -> 21;
               case 9 -> 88;
               case 10 -> 168;
               case 11 -> 127;
               case 12 -> 137;
               case 13 -> 157;
               case 14 -> 20;
               case 15 -> 54;
               case 16 -> 19;
               case 17 -> 25;
               case 18 -> 175;
               case 19 -> 165;
               case 20 -> 254;
               case 21 -> 32;
               case 22 -> 194;
               case 23 -> 102;
               case 24 -> 59;
               case 25 -> 81;
               case 26 -> 80;
               case 27 -> 141;
               case 28 -> 52;
               case 29 -> 130;
               case 30 -> 99;
               case 31 -> 163;
               case 32 -> 109;
               case 33 -> 146;
               case 34 -> 63;
               case 35 -> 206;
               case 36 -> 222;
               case 37 -> 15;
               case 38 -> 38;
               case 39 -> 199;
               case 40 -> 212;
               case 41 -> 91;
               case 42 -> 87;
               case 43 -> 213;
               case 44 -> 105;
               case 45 -> 250;
               case 46 -> 174;
               case 47 -> 198;
               case 48 -> 244;
               case 49 -> 136;
               case 50 -> 154;
               case 51 -> 143;
               case 52 -> 78;
               case 53 -> 171;
               case 54 -> 71;
               case 55 -> 209;
               case 56 -> 255;
               case 57 -> 0;
               case 58 -> 92;
               case 59 -> 41;
               case 60 -> 151;
               case 61 -> 50;
               case 62 -> 247;
               case 63 -> 155;
               case 64 -> 223;
               case 65 -> 139;
               case 66 -> 64;
               case 67 -> 152;
               case 68 -> 245;
               case 69 -> 108;
               case 70 -> 1;
               case 71 -> 134;
               case 72 -> 230;
               case 73 -> 111;
               case 74 -> 190;
               case 75 -> 226;
               case 76 -> 200;
               case 77 -> 248;
               case 78 -> 94;
               case 79 -> 16;
               case 80 -> 35;
               case 81 -> 159;
               case 82 -> 131;
               case 83 -> 53;
               case 84 -> 62;
               case 85 -> 147;
               case 86 -> 135;
               case 87 -> 173;
               case 88 -> 120;
               case 89 -> 231;
               case 90 -> 233;
               case 91 -> 160;
               case 92 -> 243;
               case 93 -> 49;
               case 94 -> 236;
               case 95 -> 30;
               case 96 -> 114;
               case 97 -> 93;
               case 98 -> 242;
               case 99 -> 178;
               case 100 -> 85;
               case 101 -> 112;
               case 102 -> 96;
               case 103 -> 251;
               case 104 -> 205;
               case 105 -> 55;
               case 106 -> 47;
               case 107 -> 235;
               case 108 -> 161;
               case 109 -> 45;
               case 110 -> 181;
               case 111 -> 123;
               case 112 -> 22;
               case 113 -> 204;
               case 114 -> 115;
               case 115 -> 132;
               case 116 -> 180;
               case 117 -> 95;
               case 118 -> 10;
               case 119 -> 201;
               case 120 -> 249;
               case 121 -> 36;
               case 122 -> 18;
               case 123 -> 67;
               case 124 -> 221;
               case 125 -> 119;
               case 126 -> 57;
               case 127 -> 122;
               case 128 -> 191;
               case 129 -> 101;
               case 130 -> 83;
               case 131 -> 215;
               case 132 -> 42;
               case 133 -> 110;
               case 134 -> 97;
               case 135 -> 166;
               case 136 -> 124;
               case 137 -> 44;
               case 138 -> 203;
               case 139 -> 182;
               case 140 -> 225;
               case 141 -> 186;
               case 142 -> 76;
               case 143 -> 104;
               case 144 -> 197;
               case 145 -> 34;
               case 146 -> 79;
               case 147 -> 33;
               case 148 -> 43;
               case 149 -> 142;
               case 150 -> 183;
               case 151 -> 69;
               case 152 -> 73;
               case 153 -> 218;
               case 154 -> 68;
               case 155 -> 170;
               case 156 -> 195;
               case 157 -> 106;
               case 158 -> 241;
               case 159 -> 116;
               case 160 -> 40;
               case 161 -> 138;
               case 162 -> 46;
               case 163 -> 51;
               case 164 -> 237;
               case 165 -> 121;
               case 166 -> 5;
               case 167 -> 216;
               case 168 -> 187;
               case 169 -> 179;
               case 170 -> 37;
               case 171 -> 23;
               case 172 -> 192;
               case 173 -> 17;
               case 174 -> 24;
               case 175 -> 228;
               case 176 -> 60;
               case 177 -> 172;
               case 178 -> 90;
               case 179 -> 189;
               case 180 -> 125;
               case 181 -> 84;
               case 182 -> 113;
               case 183 -> 153;
               case 184 -> 82;
               case 185 -> 126;
               case 186 -> 66;
               case 187 -> 196;
               case 188 -> 158;
               case 189 -> 177;
               case 190 -> 240;
               case 191 -> 107;
               case 192 -> 145;
               case 193 -> 56;
               case 194 -> 211;
               case 195 -> 184;
               case 196 -> 239;
               case 197 -> 252;
               case 198 -> 9;
               case 199 -> 156;
               case 200 -> 162;
               case 201 -> 133;
               case 202 -> 188;
               case 203 -> 6;
               case 204 -> 224;
               case 205 -> 72;
               case 206 -> 8;
               case 207 -> 13;
               case 208 -> 207;
               case 209 -> 176;
               case 210 -> 227;
               case 211 -> 214;
               case 212 -> 234;
               case 213 -> 77;
               case 214 -> 31;
               case 215 -> 39;
               case 216 -> 193;
               case 217 -> 167;
               case 218 -> 4;
               case 219 -> 144;
               case 220 -> 27;
               case 221 -> 210;
               case 222 -> 70;
               case 223 -> 11;
               case 224 -> 118;
               case 225 -> 169;
               case 226 -> 7;
               case 227 -> 61;
               case 228 -> 149;
               case 229 -> 253;
               case 230 -> 14;
               case 231 -> 100;
               case 232 -> 217;
               case 233 -> 219;
               case 234 -> 98;
               case 235 -> 208;
               case 236 -> 3;
               case 237 -> 232;
               case 238 -> 29;
               case 239 -> 28;
               case 240 -> 150;
               case 241 -> 128;
               case 242 -> 246;
               case 243 -> 229;
               case 244 -> 185;
               case 245 -> 58;
               case 246 -> 12;
               case 247 -> 48;
               case 248 -> 238;
               case 249 -> 117;
               case 250 -> 129;
               case 251 -> 202;
               case 252 -> 140;
               case 253 -> 26;
               case 254 -> 164;
               default -> 103;
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
      public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll p0, boolean p1, java.lang.String p2, int p3, int p4, java.lang.Object p5) {
         if ((p4 & 1) != 0) p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if ((p4 & 2) != 0) p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if ((p4 & 4) != 0) p3 = p0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         return p0.a(p1, p2, p3);
      }
   }
}
