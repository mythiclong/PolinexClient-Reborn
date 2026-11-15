package me.octo.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
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
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll
   extends lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll {

   @NotNull
   public static llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   @NotNull
   private final HashMap<String, BlockPos> IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
   @Nullable
   private BlockPos IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
   private boolean lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
   @NotNull
   private static llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
   private static int lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl;
   private static String[] j;
   private static String[] k;

   public llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll() {
      short var10001 = 13746;
      short var10002 = -4804;
      var10002 = 13739;
      short var10003 = -15510;
      me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var4 = me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      short var10004 = 13744;
      short var10005 = -21798;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c()
      };
      super("Powder Macro", "Automatically grinds powder in the Crystal Hollows.", var4, "Crystal Hollows", null, null, false, var1, 112, null);
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      Pair[] var2 = new Pair[4];
      var10003 = 13733;
      var10004 = 10063;
      var2[0] = TuplesKt.to("Jungle", new BlockPos(448, 122, 458));
      var10003 = 13751;
      var10004 = 29947;
      var2[1] = TuplesKt.to("Mithril Deposits", new BlockPos(564, 118, 462));
      var10003 = 13749;
      var10004 = -10902;
      var2[2] = TuplesKt.to("Precursor Remnants", new BlockPos(564, 118, 562));
      var10003 = 13731;
      var10004 = 4370;
      var2[3] = TuplesKt.to("Goblin Holdout", new BlockPos(461, 119, 563));
      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = MapsKt.hashMapOf(var2);
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
      short var10001 = 13745;
      short var10002 = 11854;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10000),
         "Powder travel",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         null,
         5000L,
         false,
         false,
         (kotlin.jvm.functions.Function1)(llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll::b),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { this.a(p0); return Unit.INSTANCE; }

      public Object receiver = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.this; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = -10958;
                  short var10005 = -665;
                  var10005 = -10959;
                  short var10006 = -12368;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001x = -10957;
                  short var10002x = -29825;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "Íó\u0011\u0010å\t\u008aêº2\u0000\u0017æ\u0001BÜÞ&>tz\t\u000b*W\u008e\u0001¾w\u0086\b3\u009f\u009aeîIm\u0011ã\u0004\u0002\u009e\u009azº+äZËQý\u001f\u0006\t\u00adSÅf\u000fE®Þ(\u008e\u00adÂ\u0098³Á/ìé\u008e´:Å;IÏ»ñ\u009cHÊyp\u0098\u0006y\u0093S¦çâu\u0013ý\u009fk~~F\u0001¾Ý§\u0013Cj\u0002;<2\nUÈdJq\u009d\u0086\u0085ØÿH'øè¨\u0094ZÁ¶É[«â\u009e\u000føU\u0015";
                  int var4 = "Íó\u0011\u0010å\t\u008aêº2\u0000\u0017æ\u0001BÜÞ&>tz\t\u000b*W\u008e\u0001¾w\u0086\b3\u009f\u009aeîIm\u0011ã\u0004\u0002\u009e\u009azº+äZËQý\u001f\u0006\t\u00adSÅf\u000fE®Þ(\u008e\u00adÂ\u0098³Á/ìé\u008e´:Å;IÏ»ñ\u009cHÊyp\u0098\u0006y\u0093S¦çâu\u0013ý\u009fk~~F\u0001¾Ý§\u0013Cj\u0002;<2\nUÈdJq\u009d\u0086\u0085ØÿH'øè¨\u0094ZÁ¶É[«â\u009e\u000føU\u0015"
                     .length();
                  char var1 = 2;
                  int var0 = -1;

                  while (true) {
                     char[] var10002x;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 112;
                        var10002x = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 112;
                           var10006 = var6;
                        } else {
                           var13 = 112;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 112;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 40;
                              case 1 -> 66;
                              case 2 -> 123;
                              case 3 -> 41;
                              case 4 -> 21;
                              case 5 -> 61;
                              default -> 2;
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
                  int var2 = (var0 ^ -10957) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 253;
                        case 1 -> 107;
                        case 2 -> 101;
                        case 3 -> 24;
                        case 4 -> 115;
                        case 5 -> 202;
                        case 6 -> 94;
                        case 7 -> 150;
                        case 8 -> 31;
                        case 9 -> 252;
                        case 10 -> 209;
                        case 11 -> 255;
                        case 12 -> 105;
                        case 13 -> 204;
                        case 14 -> 149;
                        case 15 -> 231;
                        case 16 -> 197;
                        case 17 -> 77;
                        case 18 -> 243;
                        case 19 -> 244;
                        case 20 -> 89;
                        case 21 -> 53;
                        case 22 -> 174;
                        case 23 -> 178;
                        case 24 -> 219;
                        case 25 -> 67;
                        case 26 -> 85;
                        case 27 -> 86;
                        case 28 -> 218;
                        case 29 -> 12;
                        case 30 -> 239;
                        case 31 -> 123;
                        case 32 -> 122;
                        case 33 -> 190;
                        case 34 -> 153;
                        case 35 -> 167;
                        case 36 -> 87;
                        case 37 -> 226;
                        case 38 -> 166;
                        case 39 -> 111;
                        case 40 -> 172;
                        case 41 -> 75;
                        case 42 -> 245;
                        case 43 -> 121;
                        case 44 -> 103;
                        case 45 -> 132;
                        case 46 -> 90;
                        case 47 -> 155;
                        case 48 -> 8;
                        case 49 -> 100;
                        case 50 -> 206;
                        case 51 -> 138;
                        case 52 -> 182;
                        case 53 -> 2;
                        case 54 -> 64;
                        case 55 -> 127;
                        case 56 -> 120;
                        case 57 -> 205;
                        case 58 -> 104;
                        case 59 -> 91;
                        case 60 -> 225;
                        case 61 -> 194;
                        case 62 -> 193;
                        case 63 -> 117;
                        case 64 -> 11;
                        case 65 -> 198;
                        case 66 -> 65;
                        case 67 -> 84;
                        case 68 -> 17;
                        case 69 -> 211;
                        case 70 -> 78;
                        case 71 -> 13;
                        case 72 -> 71;
                        case 73 -> 106;
                        case 74 -> 156;
                        case 75 -> 179;
                        case 76 -> 124;
                        case 77 -> 61;
                        case 78 -> 21;
                        case 79 -> 54;
                        case 80 -> 164;
                        case 81 -> 119;
                        case 82 -> 133;
                        case 83 -> 171;
                        case 84 -> 109;
                        case 85 -> 126;
                        case 86 -> 142;
                        case 87 -> 39;
                        case 88 -> 145;
                        case 89 -> 144;
                        case 90 -> 30;
                        case 91 -> 232;
                        case 92 -> 180;
                        case 93 -> 169;
                        case 94 -> 161;
                        case 95 -> 195;
                        case 96 -> 118;
                        case 97 -> 74;
                        case 98 -> 98;
                        case 99 -> 141;
                        case 100 -> 217;
                        case 101 -> 183;
                        case 102 -> 248;
                        case 103 -> 216;
                        case 104 -> 236;
                        case 105 -> 3;
                        case 106 -> 146;
                        case 107 -> 7;
                        case 108 -> 159;
                        case 109 -> 191;
                        case 110 -> 251;
                        case 111 -> 200;
                        case 112 -> 186;
                        case 113 -> 37;
                        case 114 -> 143;
                        case 115 -> 26;
                        case 116 -> 14;
                        case 117 -> 230;
                        case 118 -> 58;
                        case 119 -> 18;
                        case 120 -> 110;
                        case 121 -> 135;
                        case 122 -> 49;
                        case 123 -> 192;
                        case 124 -> 23;
                        case 125 -> 116;
                        case 126 -> 241;
                        case 127 -> 62;
                        case 128 -> 140;
                        case 129 -> 134;
                        case 130 -> 240;
                        case 131 -> 224;
                        case 132 -> 129;
                        case 133 -> 237;
                        case 134 -> 254;
                        case 135 -> 57;
                        case 136 -> 63;
                        case 137 -> 60;
                        case 138 -> 22;
                        case 139 -> 210;
                        case 140 -> 187;
                        case 141 -> 5;
                        case 142 -> 55;
                        case 143 -> 247;
                        case 144 -> 227;
                        case 145 -> 35;
                        case 146 -> 9;
                        case 147 -> 229;
                        case 148 -> 97;
                        case 149 -> 154;
                        case 150 -> 228;
                        case 151 -> 19;
                        case 152 -> 213;
                        case 153 -> 162;
                        case 154 -> 214;
                        case 155 -> 131;
                        case 156 -> 125;
                        case 157 -> 52;
                        case 158 -> 147;
                        case 159 -> 130;
                        case 160 -> 29;
                        case 161 -> 152;
                        case 162 -> 188;
                        case 163 -> 10;
                        case 164 -> 136;
                        case 165 -> 72;
                        case 166 -> 93;
                        case 167 -> 185;
                        case 168 -> 212;
                        case 169 -> 221;
                        case 170 -> 181;
                        case 171 -> 175;
                        case 172 -> 28;
                        case 173 -> 199;
                        case 174 -> 45;
                        case 175 -> 96;
                        case 176 -> 48;
                        case 177 -> 177;
                        case 178 -> 158;
                        case 179 -> 163;
                        case 180 -> 20;
                        case 181 -> 168;
                        case 182 -> 50;
                        case 183 -> 88;
                        case 184 -> 128;
                        case 185 -> 68;
                        case 186 -> 25;
                        case 187 -> 173;
                        case 188 -> 51;
                        case 189 -> 95;
                        case 190 -> 137;
                        case 191 -> 92;
                        case 192 -> 4;
                        case 193 -> 112;
                        case 194 -> 46;
                        case 195 -> 38;
                        case 196 -> 108;
                        case 197 -> 249;
                        case 198 -> 148;
                        case 199 -> 170;
                        case 200 -> 44;
                        case 201 -> 27;
                        case 202 -> 56;
                        case 203 -> 70;
                        case 204 -> 32;
                        case 205 -> 238;
                        case 206 -> 234;
                        case 207 -> 165;
                        case 208 -> 36;
                        case 209 -> 208;
                        case 210 -> 69;
                        case 211 -> 250;
                        case 212 -> 42;
                        case 213 -> 222;
                        case 214 -> 59;
                        case 215 -> 184;
                        case 216 -> 73;
                        case 217 -> 40;
                        case 218 -> 215;
                        case 219 -> 41;
                        case 220 -> 83;
                        case 221 -> 16;
                        case 222 -> 203;
                        case 223 -> 160;
                        case 224 -> 79;
                        case 225 -> 113;
                        case 226 -> 235;
                        case 227 -> 6;
                        case 228 -> 176;
                        case 229 -> 99;
                        case 230 -> 242;
                        case 231 -> 66;
                        case 232 -> 233;
                        case 233 -> 102;
                        case 234 -> 139;
                        case 235 -> 151;
                        case 236 -> 43;
                        case 237 -> 1;
                        case 238 -> 15;
                        case 239 -> 80;
                        case 240 -> 189;
                        case 241 -> 47;
                        case 242 -> 157;
                        case 243 -> 196;
                        case 244 -> 207;
                        case 245 -> 201;
                        case 246 -> 114;
                        case 247 -> 220;
                        case 248 -> 223;
                        case 249 -> 246;
                        case 250 -> 0;
                        case 251 -> 82;
                        case 252 -> 34;
                        case 253 -> 33;
                        case 254 -> 81;
                        default -> 76;
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
      var10001 = 13737;
      var10002 = -32685;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10000),
         "Powder command",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII,
         30000L,
         0L,
         true,
         false,
         null,
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { this.a(p0); return Unit.INSTANCE; }

      public Object receiver = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.this; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = -10339;
                  short var10005 = 16841;
                  var10005 = -10337;
                  short var10006 = 25017;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = -10340;
                  short var10002 = 31497;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "É0]rðvw\u000edH-\u0007\u008ap{0°\u0002\u0085\u001fz\u00018DsÓV\u0013\nèÈ¼\u0017¸r=pxtÑ{BæI\u001a\u0082·0ÏÆ83pO7\u0082\u0003û\u0003\u008ayÍ_Óe½ý\n\u0087\u0095>½¤æ\u008dääw¶)\u0006½øÇÑS|\u009f\u0017J·¢ù¶KÏõ¬Ô\u009ax\u0002\u0016]²ÁýÿJgð\u009cõ\u001d\\ò\u0092C\u0007\u0002ï\u0087\u0089h\u00adXú!<Ñ\u009e¦\u0086¾ú5\u008f¿É¢\u0085;Õ";
                  int var4 = "É0]rðvw\u000edH-\u0007\u008ap{0°\u0002\u0085\u001fz\u00018DsÓV\u0013\nèÈ¼\u0017¸r=pxtÑ{BæI\u001a\u0082·0ÏÆ83pO7\u0082\u0003û\u0003\u008ayÍ_Óe½ý\n\u0087\u0095>½¤æ\u008dääw¶)\u0006½øÇÑS|\u009f\u0017J·¢ù¶KÏõ¬Ô\u009ax\u0002\u0016]²ÁýÿJgð\u009cõ\u001d\\ò\u0092C\u0007\u0002ï\u0087\u0089h\u00adXú!<Ñ\u009e¦\u0086¾ú5\u008f¿É¢\u0085;Õ"
                     .length();
                  char var1 = 17;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 78;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 78;
                           var10006 = var6;
                        } else {
                           var13 = 78;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 78;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 79;
                              case 1 -> 7;
                              case 2 -> 1;
                              case 3 -> 58;
                              case 4 -> 51;
                              case 5 -> 117;
                              default -> 57;
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
                  int var2 = (var0 ^ -10339) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 81;
                        case 1 -> 5;
                        case 2 -> 181;
                        case 3 -> 30;
                        case 4 -> 75;
                        case 5 -> 183;
                        case 6 -> 91;
                        case 7 -> 23;
                        case 8 -> 241;
                        case 9 -> 203;
                        case 10 -> 164;
                        case 11 -> 77;
                        case 12 -> 249;
                        case 13 -> 199;
                        case 14 -> 119;
                        case 15 -> 240;
                        case 16 -> 22;
                        case 17 -> 102;
                        case 18 -> 68;
                        case 19 -> 84;
                        case 20 -> 233;
                        case 21 -> 18;
                        case 22 -> 36;
                        case 23 -> 130;
                        case 24 -> 103;
                        case 25 -> 208;
                        case 26 -> 201;
                        case 27 -> 192;
                        case 28 -> 179;
                        case 29 -> 6;
                        case 30 -> 196;
                        case 31 -> 229;
                        case 32 -> 52;
                        case 33 -> 104;
                        case 34 -> 95;
                        case 35 -> 45;
                        case 36 -> 47;
                        case 37 -> 14;
                        case 38 -> 12;
                        case 39 -> 97;
                        case 40 -> 222;
                        case 41 -> 231;
                        case 42 -> 19;
                        case 43 -> 128;
                        case 44 -> 27;
                        case 45 -> 1;
                        case 46 -> 230;
                        case 47 -> 248;
                        case 48 -> 126;
                        case 49 -> 74;
                        case 50 -> 25;
                        case 51 -> 150;
                        case 52 -> 237;
                        case 53 -> 66;
                        case 54 -> 57;
                        case 55 -> 217;
                        case 56 -> 112;
                        case 57 -> 143;
                        case 58 -> 155;
                        case 59 -> 154;
                        case 60 -> 145;
                        case 61 -> 182;
                        case 62 -> 176;
                        case 63 -> 165;
                        case 64 -> 253;
                        case 65 -> 80;
                        case 66 -> 33;
                        case 67 -> 40;
                        case 68 -> 67;
                        case 69 -> 238;
                        case 70 -> 69;
                        case 71 -> 194;
                        case 72 -> 166;
                        case 73 -> 138;
                        case 74 -> 223;
                        case 75 -> 56;
                        case 76 -> 175;
                        case 77 -> 60;
                        case 78 -> 87;
                        case 79 -> 180;
                        case 80 -> 124;
                        case 81 -> 190;
                        case 82 -> 116;
                        case 83 -> 149;
                        case 84 -> 245;
                        case 85 -> 219;
                        case 86 -> 121;
                        case 87 -> 63;
                        case 88 -> 125;
                        case 89 -> 115;
                        case 90 -> 216;
                        case 91 -> 133;
                        case 92 -> 167;
                        case 93 -> 252;
                        case 94 -> 58;
                        case 95 -> 243;
                        case 96 -> 51;
                        case 97 -> 20;
                        case 98 -> 228;
                        case 99 -> 188;
                        case 100 -> 83;
                        case 101 -> 210;
                        case 102 -> 2;
                        case 103 -> 239;
                        case 104 -> 202;
                        case 105 -> 120;
                        case 106 -> 162;
                        case 107 -> 184;
                        case 108 -> 159;
                        case 109 -> 105;
                        case 110 -> 146;
                        case 111 -> 3;
                        case 112 -> 90;
                        case 113 -> 7;
                        case 114 -> 71;
                        case 115 -> 72;
                        case 116 -> 108;
                        case 117 -> 43;
                        case 118 -> 218;
                        case 119 -> 172;
                        case 120 -> 191;
                        case 121 -> 86;
                        case 122 -> 46;
                        case 123 -> 151;
                        case 124 -> 147;
                        case 125 -> 135;
                        case 126 -> 214;
                        case 127 -> 141;
                        case 128 -> 144;
                        case 129 -> 59;
                        case 130 -> 171;
                        case 131 -> 15;
                        case 132 -> 21;
                        case 133 -> 61;
                        case 134 -> 122;
                        case 135 -> 118;
                        case 136 -> 29;
                        case 137 -> 16;
                        case 138 -> 38;
                        case 139 -> 250;
                        case 140 -> 79;
                        case 141 -> 88;
                        case 142 -> 255;
                        case 143 -> 106;
                        case 144 -> 8;
                        case 145 -> 158;
                        case 146 -> 93;
                        case 147 -> 123;
                        case 148 -> 169;
                        case 149 -> 246;
                        case 150 -> 132;
                        case 151 -> 113;
                        case 152 -> 174;
                        case 153 -> 65;
                        case 154 -> 78;
                        case 155 -> 236;
                        case 156 -> 244;
                        case 157 -> 206;
                        case 158 -> 11;
                        case 159 -> 131;
                        case 160 -> 227;
                        case 161 -> 152;
                        case 162 -> 156;
                        case 163 -> 226;
                        case 164 -> 140;
                        case 165 -> 235;
                        case 166 -> 89;
                        case 167 -> 17;
                        case 168 -> 0;
                        case 169 -> 224;
                        case 170 -> 129;
                        case 171 -> 185;
                        case 172 -> 247;
                        case 173 -> 173;
                        case 174 -> 94;
                        case 175 -> 54;
                        case 176 -> 232;
                        case 177 -> 161;
                        case 178 -> 44;
                        case 179 -> 39;
                        case 180 -> 31;
                        case 181 -> 205;
                        case 182 -> 55;
                        case 183 -> 160;
                        case 184 -> 98;
                        case 185 -> 204;
                        case 186 -> 49;
                        case 187 -> 153;
                        case 188 -> 76;
                        case 189 -> 53;
                        case 190 -> 134;
                        case 191 -> 26;
                        case 192 -> 178;
                        case 193 -> 34;
                        case 194 -> 198;
                        case 195 -> 28;
                        case 196 -> 200;
                        case 197 -> 212;
                        case 198 -> 127;
                        case 199 -> 187;
                        case 200 -> 41;
                        case 201 -> 193;
                        case 202 -> 163;
                        case 203 -> 9;
                        case 204 -> 96;
                        case 205 -> 111;
                        case 206 -> 197;
                        case 207 -> 107;
                        case 208 -> 211;
                        case 209 -> 32;
                        case 210 -> 221;
                        case 211 -> 177;
                        case 212 -> 142;
                        case 213 -> 37;
                        case 214 -> 13;
                        case 215 -> 114;
                        case 216 -> 62;
                        case 217 -> 117;
                        case 218 -> 82;
                        case 219 -> 101;
                        case 220 -> 73;
                        case 221 -> 42;
                        case 222 -> 136;
                        case 223 -> 168;
                        case 224 -> 85;
                        case 225 -> 215;
                        case 226 -> 220;
                        case 227 -> 110;
                        case 228 -> 170;
                        case 229 -> 242;
                        case 230 -> 48;
                        case 231 -> 64;
                        case 232 -> 251;
                        case 233 -> 234;
                        case 234 -> 24;
                        case 235 -> 137;
                        case 236 -> 207;
                        case 237 -> 148;
                        case 238 -> 209;
                        case 239 -> 50;
                        case 240 -> 92;
                        case 241 -> 139;
                        case 242 -> 213;
                        case 243 -> 109;
                        case 244 -> 4;
                        case 245 -> 157;
                        case 246 -> 195;
                        case 247 -> 225;
                        case 248 -> 10;
                        case 249 -> 186;
                        case 250 -> 189;
                        case 251 -> 70;
                        case 252 -> 35;
                        case 253 -> 99;
                        case 254 -> 254;
                        default -> 100;
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
      var10001 = 13735;
      var10002 = 32060;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10000),
         "Powder move",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
         60000L,
         0L,
         false,
         false,
         null,
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { this.a(p0); return Unit.INSTANCE; }

      public Object receiver = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.this; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = 6416;
                  short var10005 = -8179;
                  var10005 = 6417;
                  short var10006 = -21123;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = 6419;
                  short var10002 = -18848;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "óI<SÓ&\r\u007f»@Ø\t@¯Y[Ò\u001f\u008bb\u0017¾s7Ë\u001dm\u0084\u0016Á\u000fAÇe\u008d2\u008a\u0003ªv½ ¦\n5\u001e\u0014\u008fHD\u0096Í\u008d¯ý¾/m\u0004s\u0017\"\u008cñª^®\\\u0018À\u0093\u0087¶\u008aÀ¹S&õ\u0000á\u0016U¬»®\u0096.E\bÆ\u0091Æö\u0087È\u0099R\"Õ¥À#ð/*_\u0000\u0010\u0016ê\u0089L\u008bM¯¿¹¼ðh]\u0011½$õþê\u0093*É_\u0096DÓÓô+0\u009c\u0002rË";
                  int var4 = "óI<SÓ&\r\u007f»@Ø\t@¯Y[Ò\u001f\u008bb\u0017¾s7Ë\u001dm\u0084\u0016Á\u000fAÇe\u008d2\u008a\u0003ªv½ ¦\n5\u001e\u0014\u008fHD\u0096Í\u008d¯ý¾/m\u0004s\u0017\"\u008cñª^®\\\u0018À\u0093\u0087¶\u008aÀ¹S&õ\u0000á\u0016U¬»®\u0096.E\bÆ\u0091Æö\u0087È\u0099R\"Õ¥À#ð/*_\u0000\u0010\u0016ê\u0089L\u008bM¯¿¹¼ðh]\u0011½$õþê\u0093*É_\u0096DÓÓô+0\u009c\u0002rË"
                     .length();
                  char var1 = 'z';
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 53;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 53;
                           var10006 = var6;
                        } else {
                           var13 = 53;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 53;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 68;
                              case 1 -> 7;
                              case 2 -> 82;
                              case 3 -> 32;
                              case 4 -> 66;
                              case 5 -> 86;
                              default -> 29;
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
                  int var2 = (var0 ^ 6417) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 239;
                        case 1 -> 211;
                        case 2 -> 187;
                        case 3 -> 237;
                        case 4 -> 34;
                        case 5 -> 18;
                        case 6 -> 135;
                        case 7 -> 148;
                        case 8 -> 40;
                        case 9 -> 30;
                        case 10 -> 209;
                        case 11 -> 213;
                        case 12 -> 184;
                        case 13 -> 181;
                        case 14 -> 88;
                        case 15 -> 234;
                        case 16 -> 93;
                        case 17 -> 22;
                        case 18 -> 221;
                        case 19 -> 56;
                        case 20 -> 117;
                        case 21 -> 3;
                        case 22 -> 19;
                        case 23 -> 172;
                        case 24 -> 6;
                        case 25 -> 79;
                        case 26 -> 129;
                        case 27 -> 42;
                        case 28 -> 104;
                        case 29 -> 35;
                        case 30 -> 59;
                        case 31 -> 65;
                        case 32 -> 5;
                        case 33 -> 138;
                        case 34 -> 163;
                        case 35 -> 126;
                        case 36 -> 191;
                        case 37 -> 201;
                        case 38 -> 207;
                        case 39 -> 253;
                        case 40 -> 202;
                        case 41 -> 98;
                        case 42 -> 220;
                        case 43 -> 133;
                        case 44 -> 90;
                        case 45 -> 235;
                        case 46 -> 189;
                        case 47 -> 38;
                        case 48 -> 145;
                        case 49 -> 144;
                        case 50 -> 153;
                        case 51 -> 44;
                        case 52 -> 130;
                        case 53 -> 37;
                        case 54 -> 91;
                        case 55 -> 2;
                        case 56 -> 216;
                        case 57 -> 11;
                        case 58 -> 25;
                        case 59 -> 171;
                        case 60 -> 110;
                        case 61 -> 197;
                        case 62 -> 97;
                        case 63 -> 226;
                        case 64 -> 9;
                        case 65 -> 252;
                        case 66 -> 51;
                        case 67 -> 247;
                        case 68 -> 193;
                        case 69 -> 212;
                        case 70 -> 57;
                        case 71 -> 198;
                        case 72 -> 149;
                        case 73 -> 54;
                        case 74 -> 43;
                        case 75 -> 20;
                        case 76 -> 17;
                        case 77 -> 190;
                        case 78 -> 55;
                        case 79 -> 16;
                        case 80 -> 101;
                        case 81 -> 124;
                        case 82 -> 75;
                        case 83 -> 137;
                        case 84 -> 61;
                        case 85 -> 4;
                        case 86 -> 195;
                        case 87 -> 127;
                        case 88 -> 230;
                        case 89 -> 63;
                        case 90 -> 94;
                        case 91 -> 118;
                        case 92 -> 188;
                        case 93 -> 214;
                        case 94 -> 236;
                        case 95 -> 68;
                        case 96 -> 162;
                        case 97 -> 115;
                        case 98 -> 109;
                        case 99 -> 154;
                        case 100 -> 119;
                        case 101 -> 47;
                        case 102 -> 52;
                        case 103 -> 120;
                        case 104 -> 21;
                        case 105 -> 248;
                        case 106 -> 15;
                        case 107 -> 53;
                        case 108 -> 224;
                        case 109 -> 45;
                        case 110 -> 82;
                        case 111 -> 223;
                        case 112 -> 179;
                        case 113 -> 141;
                        case 114 -> 157;
                        case 115 -> 58;
                        case 116 -> 255;
                        case 117 -> 66;
                        case 118 -> 208;
                        case 119 -> 72;
                        case 120 -> 205;
                        case 121 -> 116;
                        case 122 -> 169;
                        case 123 -> 113;
                        case 124 -> 238;
                        case 125 -> 229;
                        case 126 -> 227;
                        case 127 -> 62;
                        case 128 -> 10;
                        case 129 -> 123;
                        case 130 -> 147;
                        case 131 -> 254;
                        case 132 -> 128;
                        case 133 -> 222;
                        case 134 -> 28;
                        case 135 -> 41;
                        case 136 -> 139;
                        case 137 -> 161;
                        case 138 -> 160;
                        case 139 -> 219;
                        case 140 -> 143;
                        case 141 -> 241;
                        case 142 -> 36;
                        case 143 -> 96;
                        case 144 -> 152;
                        case 145 -> 107;
                        case 146 -> 24;
                        case 147 -> 86;
                        case 148 -> 164;
                        case 149 -> 99;
                        case 150 -> 158;
                        case 151 -> 173;
                        case 152 -> 83;
                        case 153 -> 103;
                        case 154 -> 29;
                        case 155 -> 210;
                        case 156 -> 92;
                        case 157 -> 159;
                        case 158 -> 155;
                        case 159 -> 106;
                        case 160 -> 176;
                        case 161 -> 250;
                        case 162 -> 0;
                        case 163 -> 89;
                        case 164 -> 111;
                        case 165 -> 67;
                        case 166 -> 60;
                        case 167 -> 77;
                        case 168 -> 122;
                        case 169 -> 170;
                        case 170 -> 151;
                        case 171 -> 121;
                        case 172 -> 180;
                        case 173 -> 136;
                        case 174 -> 23;
                        case 175 -> 199;
                        case 176 -> 14;
                        case 177 -> 166;
                        case 178 -> 73;
                        case 179 -> 245;
                        case 180 -> 249;
                        case 181 -> 183;
                        case 182 -> 194;
                        case 183 -> 225;
                        case 184 -> 196;
                        case 185 -> 140;
                        case 186 -> 244;
                        case 187 -> 84;
                        case 188 -> 69;
                        case 189 -> 146;
                        case 190 -> 7;
                        case 191 -> 206;
                        case 192 -> 233;
                        case 193 -> 70;
                        case 194 -> 33;
                        case 195 -> 74;
                        case 196 -> 31;
                        case 197 -> 156;
                        case 198 -> 48;
                        case 199 -> 87;
                        case 200 -> 200;
                        case 201 -> 8;
                        case 202 -> 64;
                        case 203 -> 142;
                        case 204 -> 105;
                        case 205 -> 182;
                        case 206 -> 215;
                        case 207 -> 114;
                        case 208 -> 243;
                        case 209 -> 12;
                        case 210 -> 50;
                        case 211 -> 192;
                        case 212 -> 168;
                        case 213 -> 240;
                        case 214 -> 246;
                        case 215 -> 204;
                        case 216 -> 132;
                        case 217 -> 32;
                        case 218 -> 39;
                        case 219 -> 217;
                        case 220 -> 46;
                        case 221 -> 242;
                        case 222 -> 80;
                        case 223 -> 167;
                        case 224 -> 78;
                        case 225 -> 26;
                        case 226 -> 175;
                        case 227 -> 231;
                        case 228 -> 76;
                        case 229 -> 81;
                        case 230 -> 186;
                        case 231 -> 174;
                        case 232 -> 100;
                        case 233 -> 218;
                        case 234 -> 203;
                        case 235 -> 185;
                        case 236 -> 134;
                        case 237 -> 108;
                        case 238 -> 13;
                        case 239 -> 251;
                        case 240 -> 165;
                        case 241 -> 150;
                        case 242 -> 177;
                        case 243 -> 1;
                        case 244 -> 112;
                        case 245 -> 27;
                        case 246 -> 131;
                        case 247 -> 85;
                        case 248 -> 71;
                        case 249 -> 49;
                        case 250 -> 178;
                        case 251 -> 228;
                        case 252 -> 125;
                        case 253 -> 95;
                        case 254 -> 232;
                        default -> 102;
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
      var10001 = 13742;
      var10002 = 18439;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10000,
         "Powder mine",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         60000L,
         0L,
         null,
         false,
         false,
         (kotlin.jvm.functions.Function1<me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll, java.lang.Object>)(llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll::e),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { this.a(p0); return Unit.INSTANCE; }

      public Object receiver = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.this; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = 5331;
                  short var10005 = 2828;
                  var10005 = 5328;
                  short var10006 = 1417;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = 5330;
                  short var10002 = 20492;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "\u0091\u0016\u0011\u0002q¤ù\u008dÿúFPÁ\btÖ<\u0089<nz½CS¿s7%_«âw\u00109°t\u00adÑl¦\u0080\u008eàUZ¢ýÌ¤ ÐoÎ\u0086\u0018\u0099\u009f\u001d\u0010õYÚyH$Nv6\u000e0v\u008c-cþ¬¨\u0007º§$.D\u0097?Ü!Íþø¨\u008d\u009fÓ$!àS\u000fà\u0083î+87\u0014ÈÅOb¨\u001e\u0087È\u0092ë\t\u0098V\u0000@Gß2\u009f1Å\u0089[g0\u0088q\u0002\u0081\"C\u001f¨\u0094Ðxÿ";
                  int var4 = "\u0091\u0016\u0011\u0002q¤ù\u008dÿúFPÁ\btÖ<\u0089<nz½CS¿s7%_«âw\u00109°t\u00adÑl¦\u0080\u008eàUZ¢ýÌ¤ ÐoÎ\u0086\u0018\u0099\u009f\u001d\u0010õYÚyH$Nv6\u000e0v\u008c-cþ¬¨\u0007º§$.D\u0097?Ü!Íþø¨\u008d\u009fÓ$!àS\u000fà\u0083î+87\u0014ÈÅOb¨\u001e\u0087È\u0092ë\t\u0098V\u0000@Gß2\u009f1Å\u0089[g0\u0088q\u0002\u0081\"C\u001f¨\u0094Ðxÿ"
                     .length();
                  char var1 = 2;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 110;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 110;
                           var10006 = var6;
                        } else {
                           var13 = 110;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 110;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 49;
                              case 1 -> 74;
                              case 2 -> 106;
                              case 3 -> 20;
                              case 4 -> 56;
                              case 5 -> 108;
                              default -> 94;
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
                  int var2 = (var0 ^ 5330) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 212;
                        case 1 -> 60;
                        case 2 -> 213;
                        case 3 -> 139;
                        case 4 -> 174;
                        case 5 -> 99;
                        case 6 -> 229;
                        case 7 -> 76;
                        case 8 -> 230;
                        case 9 -> 11;
                        case 10 -> 45;
                        case 11 -> 97;
                        case 12 -> 27;
                        case 13 -> 84;
                        case 14 -> 34;
                        case 15 -> 175;
                        case 16 -> 96;
                        case 17 -> 173;
                        case 18 -> 12;
                        case 19 -> 25;
                        case 20 -> 20;
                        case 21 -> 134;
                        case 22 -> 35;
                        case 23 -> 220;
                        case 24 -> 147;
                        case 25 -> 140;
                        case 26 -> 252;
                        case 27 -> 41;
                        case 28 -> 58;
                        case 29 -> 24;
                        case 30 -> 141;
                        case 31 -> 189;
                        case 32 -> 178;
                        case 33 -> 44;
                        case 34 -> 69;
                        case 35 -> 16;
                        case 36 -> 181;
                        case 37 -> 167;
                        case 38 -> 228;
                        case 39 -> 43;
                        case 40 -> 89;
                        case 41 -> 164;
                        case 42 -> 105;
                        case 43 -> 149;
                        case 44 -> 106;
                        case 45 -> 183;
                        case 46 -> 79;
                        case 47 -> 125;
                        case 48 -> 73;
                        case 49 -> 67;
                        case 50 -> 247;
                        case 51 -> 109;
                        case 52 -> 150;
                        case 53 -> 246;
                        case 54 -> 184;
                        case 55 -> 207;
                        case 56 -> 208;
                        case 57 -> 231;
                        case 58 -> 40;
                        case 59 -> 39;
                        case 60 -> 42;
                        case 61 -> 209;
                        case 62 -> 72;
                        case 63 -> 204;
                        case 64 -> 195;
                        case 65 -> 48;
                        case 66 -> 254;
                        case 67 -> 50;
                        case 68 -> 136;
                        case 69 -> 107;
                        case 70 -> 7;
                        case 71 -> 240;
                        case 72 -> 234;
                        case 73 -> 52;
                        case 74 -> 23;
                        case 75 -> 74;
                        case 76 -> 70;
                        case 77 -> 49;
                        case 78 -> 66;
                        case 79 -> 249;
                        case 80 -> 235;
                        case 81 -> 19;
                        case 82 -> 227;
                        case 83 -> 224;
                        case 84 -> 90;
                        case 85 -> 103;
                        case 86 -> 157;
                        case 87 -> 80;
                        case 88 -> 210;
                        case 89 -> 161;
                        case 90 -> 112;
                        case 91 -> 95;
                        case 92 -> 65;
                        case 93 -> 215;
                        case 94 -> 185;
                        case 95 -> 241;
                        case 96 -> 94;
                        case 97 -> 169;
                        case 98 -> 171;
                        case 99 -> 153;
                        case 100 -> 100;
                        case 101 -> 131;
                        case 102 -> 61;
                        case 103 -> 198;
                        case 104 -> 166;
                        case 105 -> 113;
                        case 106 -> 81;
                        case 107 -> 194;
                        case 108 -> 248;
                        case 109 -> 87;
                        case 110 -> 116;
                        case 111 -> 186;
                        case 112 -> 110;
                        case 113 -> 138;
                        case 114 -> 218;
                        case 115 -> 13;
                        case 116 -> 127;
                        case 117 -> 179;
                        case 118 -> 156;
                        case 119 -> 46;
                        case 120 -> 148;
                        case 121 -> 170;
                        case 122 -> 2;
                        case 123 -> 168;
                        case 124 -> 64;
                        case 125 -> 14;
                        case 126 -> 8;
                        case 127 -> 251;
                        case 128 -> 222;
                        case 129 -> 28;
                        case 130 -> 160;
                        case 131 -> 163;
                        case 132 -> 119;
                        case 133 -> 47;
                        case 134 -> 77;
                        case 135 -> 6;
                        case 136 -> 154;
                        case 137 -> 4;
                        case 138 -> 144;
                        case 139 -> 223;
                        case 140 -> 151;
                        case 141 -> 38;
                        case 142 -> 216;
                        case 143 -> 165;
                        case 144 -> 250;
                        case 145 -> 129;
                        case 146 -> 191;
                        case 147 -> 57;
                        case 148 -> 193;
                        case 149 -> 92;
                        case 150 -> 63;
                        case 151 -> 37;
                        case 152 -> 126;
                        case 153 -> 118;
                        case 154 -> 62;
                        case 155 -> 86;
                        case 156 -> 54;
                        case 157 -> 10;
                        case 158 -> 237;
                        case 159 -> 130;
                        case 160 -> 244;
                        case 161 -> 201;
                        case 162 -> 182;
                        case 163 -> 17;
                        case 164 -> 219;
                        case 165 -> 143;
                        case 166 -> 32;
                        case 167 -> 53;
                        case 168 -> 196;
                        case 169 -> 225;
                        case 170 -> 91;
                        case 171 -> 211;
                        case 172 -> 135;
                        case 173 -> 221;
                        case 174 -> 22;
                        case 175 -> 1;
                        case 176 -> 172;
                        case 177 -> 122;
                        case 178 -> 238;
                        case 179 -> 36;
                        case 180 -> 21;
                        case 181 -> 236;
                        case 182 -> 124;
                        case 183 -> 239;
                        case 184 -> 142;
                        case 185 -> 190;
                        case 186 -> 121;
                        case 187 -> 226;
                        case 188 -> 137;
                        case 189 -> 187;
                        case 190 -> 68;
                        case 191 -> 133;
                        case 192 -> 31;
                        case 193 -> 146;
                        case 194 -> 206;
                        case 195 -> 93;
                        case 196 -> 83;
                        case 197 -> 18;
                        case 198 -> 132;
                        case 199 -> 205;
                        case 200 -> 26;
                        case 201 -> 197;
                        case 202 -> 162;
                        case 203 -> 101;
                        case 204 -> 51;
                        case 205 -> 0;
                        case 206 -> 78;
                        case 207 -> 158;
                        case 208 -> 3;
                        case 209 -> 128;
                        case 210 -> 59;
                        case 211 -> 152;
                        case 212 -> 55;
                        case 213 -> 123;
                        case 214 -> 9;
                        case 215 -> 202;
                        case 216 -> 159;
                        case 217 -> 199;
                        case 218 -> 243;
                        case 219 -> 30;
                        case 220 -> 176;
                        case 221 -> 85;
                        case 222 -> 177;
                        case 223 -> 214;
                        case 224 -> 200;
                        case 225 -> 245;
                        case 226 -> 255;
                        case 227 -> 217;
                        case 228 -> 192;
                        case 229 -> 188;
                        case 230 -> 203;
                        case 231 -> 33;
                        case 232 -> 253;
                        case 233 -> 180;
                        case 234 -> 233;
                        case 235 -> 242;
                        case 236 -> 75;
                        case 237 -> 117;
                        case 238 -> 56;
                        case 239 -> 108;
                        case 240 -> 102;
                        case 241 -> 5;
                        case 242 -> 71;
                        case 243 -> 98;
                        case 244 -> 114;
                        case 245 -> 145;
                        case 246 -> 82;
                        case 247 -> 29;
                        case 248 -> 155;
                        case 249 -> 115;
                        case 250 -> 232;
                        case 251 -> 15;
                        case 252 -> 111;
                        case 253 -> 88;
                        case 254 -> 104;
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
            }
         ));
   }

   @Override
   public void aC() {
      me.octo.client.utils.player.pathfinder.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII var4 = null;
      Object llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll = null; // PX-FIX
      int var1;
      label212: {
         label213: {
            label214: {
               var1 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
               int var10000 = ((int[])llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII)[this.W()
                  .ordinal()];
               if (var1 == 0) {
                  switch (var10000) {
                     case 1:
                        var10000 = ((this.aK()) ? 1 : 0);
                        break;
                     case 2:
                        break label214;
                     case 3:
                        break label213;
                     case 4:
                        break label212;
                     default:
                        return;
                  }
               }

               if (var1 == 0) {
                  if (var10000 == 0) {
                     return;
                  }

                  var10000 = ((int[])llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)[this.aJ()
                     .a()
                     .ordinal()];
               }

               label196: {
                  label195: {
                     label215: {
                        if (var1 == 0) {
                           switch (var10000) {
                              case 1:
                                 var10000 = ((lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .b()
                                    .al()) ? 1 : 0);
                                 break;
                              case 2:
                                 break label215;
                              case 3:
                                 break label195;
                              default:
                                 break label196;
                           }
                        }

                        if (var10000 != 0) {
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

                     this.bp();
                     if (var1 == 0) {
                        return;
                     }
                  }

                  this.bq();
               }

               if (var1 == 0) {
                  return;
               }
            }

            IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI var5;
            label216: {
               boolean var3 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                  .f()
                  .b();
               if (var1 == 0) {
                  if (!var3) {
                     boolean var10001;
                     label178: {
                        label219: {
                           var4 = me.octo.client.utils.player.pathfinder.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                           var10001 = lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .a()
                              .al();
                           if (var1 == 0) {
                              if (var10001) {
                                 var10001 = lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .b()
                                    .al();
                                 if (var1 != 0) {
                                    break label178;
                                 }

                                 if (!var10001) {
                                    break label219;
                                 }
                              }

                              lIlIlIlIlllIlIlIllIIIllIIIllIIlIlIlIllllIIlIlIIIIIIIIlIIlIlIlIllllllIllllIIIlIIIIIlII var10 = lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .c();
                              short var10002 = 13743;
                              short var10003 = 2740;
                              var10001 = var10.b("Jungle");
                           }

                           label220: {
                              if (var1 == 0) {
                                 if (!var10001) {
                                    break label220;
                                 }

                                 var10001 = lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .b()
                                    .al();
                              }

                              if (var1 != 0) {
                                 break label178;
                              }

                              if (var10001) {
                                 break label219;
                              }
                           }

                           var10001 = false;
                           break label178;
                        }

                        var10001 = true;
                     }

                     boolean var13;
                     label158: {
                        label221: {
                           lIlIlIlIlllIlIlIllIIIllIIIllIIlIlIlIllllIIlIlIIIIIIIIlIIlIlIlIllllllIllllIIIlIIIIIlII var12 = lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .c();
                           short var14 = 13732;
                           short var10004 = -26941;
                           var13 = var12.b("Goblin Holdout");
                           if (var1 == 0) {
                              if (!var13) {
                                 break label221;
                              }

                              var13 = lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .b()
                                 .al();
                           }

                           if (var1 != 0) {
                              break label158;
                           }

                           if (var13) {
                              var13 = true;
                              break label158;
                           }
                        }

                        var13 = false;
                     }

                     boolean var16;
                     label147: {
                        label222: {
                           lIlIlIlIlllIlIlIllIIIllIIIllIIlIlIlIllllIIlIlIIIIIIIIlIIlIlIlIllllllIllllIIIlIIIIIlII var15 = lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .c();
                           short var17 = 13740;
                           short var10005 = 9542;
                           var16 = var15.b("Precursor Remnants");
                           if (var1 == 0) {
                              if (!var16) {
                                 break label222;
                              }

                              var16 = lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .b()
                                 .al();
                           }

                           if (var1 != 0) {
                              break label147;
                           }

                           if (var16) {
                              var16 = true;
                              break label147;
                           }
                        }

                        var16 = false;
                     }

                     boolean var19;
                     label136: {
                        label223: {
                           lIlIlIlIlllIlIlIllIIIllIIIllIIlIlIlIllllIIlIlIIIIIIIIlIIlIlIlIllllllIllllIIIlIIIIIlII var18 = lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .c();
                           short var20 = 13734;
                           short var10006 = 31896;
                           var19 = var18.b("Mithril Deposits");
                           if (var1 == 0) {
                              if (!var19) {
                                 break label223;
                              }

                              var19 = lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .b()
                                 .al();
                           }

                           if (var1 != 0) {
                              break label136;
                           }

                           if (var19) {
                              var19 = true;
                              break label136;
                           }
                        }

                        var19 = false;
                     }

                     var4.a(var10001, var13, var16, var19);
                     lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                        .f()
                        .a(false);
                     lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                        .f()
                        .n();
                     if (var1 == 0) {
                        return;
                     }
                  }

                  var5 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                     .f();
                  if (var1 != 0) {
                     break label216;
                  }

                  var3 = var5.c();
               }

               if (!var3) {
                  return;
               }

               var5 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                  .f();
            }

            var5.o();
            this.a(
               IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               5000
            );
            if (var1 == 0) {
               return;
            }
         }

         if (this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll == null) {
            return;
         }

         BlockPos var2 = this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
         boolean var6 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(
               me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .g(var2),
               me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w(),
               1.5
            );
         if (var1 == 0) {
            if (var6) {
               this.br();
               if (var1 == 0) {
                  return;
               }
            }

            var6 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
               .e()
               .d();
         }

         if (var1 == 0) {
            if (!var6) {
               return;
            }

            IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
               ((BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                  .e())),
               ((IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll)(Object)(var2)),
               0,
               false);
         }

         if (var1 == 0) {
            return;
         }
      }

      me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI var8;
      label224: {
         boolean var7 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.n();
         if (var1 == 0) {
            if (var7) {
               this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI.f();
               return;
            }

            var8 = this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
            if (var1 != 0) {
               break label224;
            }

            var7 = ((java.util.function.Supplier<Boolean>)(() -> { this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI.a(500); return false; })).get();
         }

         if (!var7) {
            return;
         }

         short var9 = 13747;
         short var11 = -23687;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a("/hotm");
         this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI.f();
         var8 = this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
      }

      var8.f();
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI var1) {
      Object var25 = null; // PX-FIX
      Object var19 = null; // PX-FIX
      int var2 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI var10000 = var1;
      if (var2 != 0) {
         short var10001 = 13759;
         short var10002 = -19367;
         Intrinsics.checkNotNullParameter(var1, "event");
         if (this.W()
            != IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII
            )
          {
            return;
         }

         var10000 = var1;
      }

      List var17 = var10000.m();
      if (var17 != null) {
         label93: {
            List var3 = var17;
            boolean var18 = ((java.util.function.Supplier<Boolean>)(() -> { this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl.a(300); return false; })).get();
            if (var2 != 0) {
               if (!var18) {
                  return;
               }

               var19 = this;
               if (var2 == 0) {
                  break label93;
               }

               var18 = this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
            }

            if (!var18) {
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

            var19 = var3.get(42);
         }

         ItemStack var20 = ((Slot)var19).getItem();
         if (var20 != null) {
            ItemStack var4 = var20;
            boolean var5 = false;
            me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var21 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            String var27 = var4.getHoverName().getString();
            short var10003 = 13730;
            short var10004 = -888;
            Intrinsics.checkNotNullExpressionValue(var27, "getString(...)");
            String var22 = var21.a(var27);
            short var28 = 13728;
            short var29 = -11100;
            boolean var23 = Intrinsics.areEqual(var22, "Great Explorer");
            if (var2 != 0) {
               if (!var23) {
                  return;
               }

               var23 = var4.is(Items.COAL_ORE);
            }

            label69: {
               label68: {
                  label67: {
                     if (var2 != 0) {
                        if (var23) {
                           break label67;
                        }

                        var23 = var4.is(Items.REDSTONE_BLOCK);
                     }

                     if (!var23) {
                        me.octo.client.utils.llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI var24 = me.octo.client.utils.llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                        Iterable var6 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .d(var4);
                        me.octo.client.utils.llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI var7 = var24;
                        boolean var8 = false;
                        var var10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var6, 10));
                        boolean var11 = false;

                        for (Object var13 : var6) {
                           Component var14 = (Component)var13;
                           boolean var16 = false;
                           var10.add(var14.getString());
                           if (var2 == 0) {
                              break label69;
                           }

                           if (var2 == 0) {
                              break;
                           }
                        }

                        var25 = var7.c(var10);
                        break label68;
                     }
                  }

                  var25 = 0;
               }

               lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl =((Integer)( var25));
            }

            LocalPlayer var26 = this.ap().player;
            if (var26 != null) {
               var26.closeContainer();
            }

            this.ba();
         }
      }
   }

   private final void bp() {
      this.c(
         CollectionsKt.listOf(
            me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .s()
         )
      );
   }

   private final void bq() {
      List var2 = lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .c()
         .I();
      int var10000 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      ArrayList var3 = new ArrayList();
      Iterable var4 = var2;
      boolean var5 = false;
      Iterator var6 = var4.iterator();
      int var1 = var10000;

      while (var6.hasNext()) {
         Object var7 = var6.next();
         String var8 = (String)var7;
         boolean var9 = false;
         Object var10001 = this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll.get(var8);
         Intrinsics.checkNotNull(var10001);
         var3.add(var10001);
         if (var1 != 0 && var1 != 0) {
            continue;
         }
         break;
      }

      llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll var13 = this;
      Collection var11 = var3;
      Object var15;
      if (var11.isEmpty()) {
         var5 = false;
         Collection var14 = this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll.values();
         short var10002 = 13750;
         short var10003 = 20124;
         Intrinsics.checkNotNullExpressionValue(var14, "<get-values>(...)");
         var15 = CollectionsKt.toList(var14);
         var13 = this;
      } else {
         var15 = var11;
      }

      var13.c((List<? extends BlockPos>)var15);
   }

   private final void c(List<? extends BlockPos> var1) {
      int var10000 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
      );
      Iterator var3 = var1.iterator();
      int var2 = var10000;

      label27:
      while (var3.hasNext()) {
         BlockPos var4 = (BlockPos)var3.next();
         this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = IIlllIIIIIlllIIlllIIIllIIIIIIlIlIIlIIIIllIlIIIllIllIlIlIIlIIIlllIIllIIllIIIllIIIIIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var4);

         while (this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll != null) {
            if (var2 == 0) {
               break label27;
            }
         }
      }

      llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll var5 = this;
      if (var2 == 0) {
         if (this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll != null) {
            return;
         }

         var5 = this;
      }

      var5.a(
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
               lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b()
                     .al()
                  ? IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
                  : IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl,
               (kotlin.jvm.functions.Function1<me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll, kotlin.Unit>)((powder) -> llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.f(powder)),
               var1.d(),
               0,
               0,
               0L,
               0,
               (kotlin.jvm.functions.Function1<me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll, kotlin.Unit>)((powder) -> llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.g(powder)),
               120,
               null
            )
         );
   }

   private final void bt() {
      this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = false;
      int var10000 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = null;
      int var1 = var10000;
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
      Vec3 var2 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
      boolean var3 = lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b()
         .al();
      int var1 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
         != IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
         )
       {
         this.a(
            var3
               ? IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
               : IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl,
            2000
         );
         if (var1 == 0) {
            return;
         }
      }

      boolean var10000 = var3;
      if (var1 == 0) {
         if (!var3) {
            var10000 = me.octo.client.utils.player.pathfinder.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.a(
               me.octo.client.utils.player.pathfinder.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               var2,
               0.0,
               2,
               null
            );
            if (var1 == 0) {
               if (var10000) {
                  this.a(
                     IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
                     2000
                  );
                  if (var1 == 0) {
                     return;
                  }
               }

               short var10001 = 13743;
               short var10002 = 2740;
               var10000 = me.octo.client.utils.player.pathfinder.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.a(
                  me.octo.client.utils.player.pathfinder.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                  CollectionsKt.listOf("Jungle"),
                  var2,
                  0.0,
                  4,
                  null);
            }

            label90: {
               label75:
               if (var1 == 0) {
                  if (!var10000) {
                     var10000 = lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a()
                        .al();
                     if (var1 != 0) {
                        break label75;
                     }

                     if (var10000) {
                        break label90;
                     }
                  }

                  var10000 = me.octo.client.utils.player.pathfinder.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(var2);
               }

               if (var10000) {
                  this.bp();
                  if (var1 == 0) {
                     return;
                  }
               }

               this.br();
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
            var2,
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

         var10000 = me.octo.client.utils.player.pathfinder.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.a(
            me.octo.client.utils.player.pathfinder.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .c()
               .I(),
            var2,
            0.0,
            4,
            null);
      }

      label91: {
         if (var1 == 0) {
            if (!var10000) {
               break label91;
            }

            var10000 = me.octo.client.utils.player.pathfinder.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(var2);
         }

         if (var10000) {
            this.a(
               IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll,
               2000
            );
            if (var1 == 0) {
               return;
            }
         }

         this.br();
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
      llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll var10000 = this;
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
                        llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll::bv,
                        false
                     ),
                     new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
                        llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll::bw,
                        false
                     ),
                     new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                        llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll::bx,
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
      short var10001 = 13736;
      short var10002 = 7022;
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.a(String.valueOf(
         llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl),
         "Chest info");
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll::by, 16777215, 0);
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(() -> i(this), 16777215, 0);
      var10001 = 13758;
      var10002 = 5971;
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.a(String.valueOf(
         llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl),
         "Powder info");
      me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .b(1);
      me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .f(1);
   }

   private static final long a(llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll var0) {
      return var0.aJ().b() + 20000L;
   }

   private static final Object b(llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll var0) {
      return TuplesKt.to(
         var0.aJ().a(),
         IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
      );
   }

   private static final Object c(llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll var0) {
      String var3;
      llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000;
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

      var10000 = new llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         var10002, var3, lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl
      );
      return var10000;
   }

   private static final Object d(llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll var0) {
      return new llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
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

   private static final Object e(llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll var0) {
      return new llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
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

   private static final Unit f(llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll var0) {
      var0.ba();
      return Unit.INSTANCE;
   }

   private static final Unit g(llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll var0) {
      var0.bt();
      return Unit.INSTANCE;
   }

   private static final boolean h(llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll var0) {
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

   private static final String by() {
      String var10000 = String.valueOf(((me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl)null).a(
         lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
            .f()
            .d()
      ));
      short var10001 = 13741;
      short var10002 = -13991;
      return "Chests opened: " + var10000;
   }

   private static final String i(llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll var0) {
      short var10000 = 13748;
      short var10001 = 16204;
      String var1 = "%.1f";
      Object[] var2 = new Object[]{
         lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
               .f()
               .d()
            / (var0.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl.b() / 3600000.0)
      };
      String var3 = String.format(var1, Arrays.copyOf(var2, var2.length));
      short var10002 = 13729;
      short var10003 = -10684;
      Intrinsics.checkNotNullExpressionValue(var3, "format(...)");
      var10001 = 13738;
      var10002 = -25057;
      return "Chests / hr: " + var3;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[26];
      int var3 = 0;
      String var2 = "ÂÌç$q5\u009d\u0096g¼Á4\u0088\u008e,\u0097\u000b0Î\u0004®yò%[\u009eò¥\u000eU®HªKgîSçh\u008b\u0086QÅ\u0006î?\u009fÊ9\n\u000ebê\u009cV\u0018<s\u0081<\u0094³\u0094\u000e³\u000e\n'£\u009b6AA\u0097\u0012ð5\u0095\u0086§\u000e;8\u0082Ëè©A=Ä\u0093\u0018äY1\u000bÃb\u008f2©O³i\u0004ÇÓ\u000b¨V\u0017½\u001b\u0090i\u0017\u0011c\u0092\u0006ÁNzä\u0085Ï\u0012÷4îHdÉÇ>æJ#\r¬å`\u0000\u001aA\u000f°mw*V\u0096óô[Vêc'|x\rrÜ/\u001c]P\u0092l'\u0000#ZÅ3ÍX\u008b.ã\u009b+\u0003\u008djCiM\u000fÌÆT\u001b¯\u000eÞøá9KÞNÑÈ\u0001Rf\u0003îÆ\u0003ÿ\u001d!\u0084åå\u0085dÔ0q5[\u0003\u00ad\nf\u009e\u00adT\r\nÑ_i\b\u000eÿ\u0093ý\u0005F\u0087Âûb22âU\u0096\u0011³<\u0087é\u0011\f(\u0001L\u008b°\u0083\u009eD\u0084<}\u0010dß3FëyÎ\u001f\r\u008d\u008c\u0012!J\u0019\u000f\u0004\u0014î\u001dÁ\u0012\u0098\u0011\u0003ìÙ]p¬\u0010\u0018ýGw¬\u001b)ud\f0^\u0004¼y°%3\u0090Î¼¼\u0005R%À$ò\u000fEBÕ\u0096\u009d\u0013Æ[\u0000\u000f¼\n¤41\rÃÚz,¶¢ÜH¼½L\u009aà";
      int var4 = "ÂÌç$q5\u009d\u0096g¼Á4\u0088\u008e,\u0097\u000b0Î\u0004®yò%[\u009eò¥\u000eU®HªKgîSçh\u008b\u0086QÅ\u0006î?\u009fÊ9\n\u000ebê\u009cV\u0018<s\u0081<\u0094³\u0094\u000e³\u000e\n'£\u009b6AA\u0097\u0012ð5\u0095\u0086§\u000e;8\u0082Ëè©A=Ä\u0093\u0018äY1\u000bÃb\u008f2©O³i\u0004ÇÓ\u000b¨V\u0017½\u001b\u0090i\u0017\u0011c\u0092\u0006ÁNzä\u0085Ï\u0012÷4îHdÉÇ>æJ#\r¬å`\u0000\u001aA\u000f°mw*V\u0096óô[Vêc'|x\rrÜ/\u001c]P\u0092l'\u0000#ZÅ3ÍX\u008b.ã\u009b+\u0003\u008djCiM\u000fÌÆT\u001b¯\u000eÞøá9KÞNÑÈ\u0001Rf\u0003îÆ\u0003ÿ\u001d!\u0084åå\u0085dÔ0q5[\u0003\u00ad\nf\u009e\u00adT\r\nÑ_i\b\u000eÿ\u0093ý\u0005F\u0087Âûb22âU\u0096\u0011³<\u0087é\u0011\f(\u0001L\u008b°\u0083\u009eD\u0084<}\u0010dß3FëyÎ\u001f\r\u008d\u008c\u0012!J\u0019\u000f\u0004\u0014î\u001dÁ\u0012\u0098\u0011\u0003ìÙ]p¬\u0010\u0018ýGw¬\u001b)ud\f0^\u0004¼y°%3\u0090Î¼¼\u0005R%À$ò\u000fEBÕ\u0096\u009d\u0013Æ[\u0000\u000f¼\n¤41\rÃÚz,¶¢ÜH¼½L\u009aà"
         .length();
      char var1 = 16;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 122;
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
                     case 0 -> 65;
                     case 1 -> 71;
                     case 2 -> 50;
                     case 3 -> 76;
                     case 4 -> 118;
                     case 5 -> 1;
                     default -> 24;
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
                     k = new String[26];
                     IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = new llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII = new llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll();
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

                  var2 = "#ÞA\u008böqó\bb+6\u0005}\u0085\u000bÐþ";
                  var4 = "#ÞA\u008böqó\bb+6\u0005}\u0085\u000bÐþ".length();
                  var1 = 11;
                  var8 = -1;
            }

            var10000 = 16;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String e(int var0, int var1) {
      int var2 = (var0 ^ 13734) & 65535;
      if (k[var2] == null) {
         char[] var3 = j[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 93;
            case 1 -> 57;
            case 2 -> 26;
            case 3 -> 108;
            case 4 -> 47;
            case 5 -> 109;
            case 6 -> 32;
            case 7 -> 70;
            case 8 -> 151;
            case 9 -> 14;
            case 10 -> 46;
            case 11 -> 225;
            case 12 -> 214;
            case 13 -> 114;
            case 14 -> 175;
            case 15 -> 7;
            case 16 -> 91;
            case 17 -> 251;
            case 18 -> 128;
            case 19 -> 82;
            case 20 -> 184;
            case 21 -> 180;
            case 22 -> 182;
            case 23 -> 252;
            case 24 -> 103;
            case 25 -> 195;
            case 26 -> 1;
            case 27 -> 245;
            case 28 -> 102;
            case 29 -> 155;
            case 30 -> 2;
            case 31 -> 238;
            case 32 -> 134;
            case 33 -> 77;
            case 34 -> 34;
            case 35 -> 174;
            case 36 -> 111;
            case 37 -> 146;
            case 38 -> 95;
            case 39 -> 127;
            case 40 -> 183;
            case 41 -> 84;
            case 42 -> 87;
            case 43 -> 15;
            case 44 -> 16;
            case 45 -> 168;
            case 46 -> 167;
            case 47 -> 66;
            case 48 -> 197;
            case 49 -> 156;
            case 50 -> 239;
            case 51 -> 13;
            case 52 -> 169;
            case 53 -> 186;
            case 54 -> 72;
            case 55 -> 249;
            case 56 -> 31;
            case 57 -> 48;
            case 58 -> 98;
            case 59 -> 123;
            case 60 -> 121;
            case 61 -> 40;
            case 62 -> 5;
            case 63 -> 81;
            case 64 -> 201;
            case 65 -> 236;
            case 66 -> 206;
            case 67 -> 110;
            case 68 -> 25;
            case 69 -> 101;
            case 70 -> 165;
            case 71 -> 140;
            case 72 -> 189;
            case 73 -> 21;
            case 74 -> 213;
            case 75 -> 113;
            case 76 -> 210;
            case 77 -> 67;
            case 78 -> 222;
            case 79 -> 97;
            case 80 -> 124;
            case 81 -> 253;
            case 82 -> 132;
            case 83 -> 60;
            case 84 -> 148;
            case 85 -> 215;
            case 86 -> 254;
            case 87 -> 120;
            case 88 -> 19;
            case 89 -> 74;
            case 90 -> 41;
            case 91 -> 221;
            case 92 -> 188;
            case 93 -> 80;
            case 94 -> 0;
            case 95 -> 233;
            case 96 -> 153;
            case 97 -> 104;
            case 98 -> 35;
            case 99 -> 18;
            case 100 -> 200;
            case 101 -> 62;
            case 102 -> 106;
            case 103 -> 75;
            case 104 -> 234;
            case 105 -> 51;
            case 106 -> 211;
            case 107 -> 122;
            case 108 -> 235;
            case 109 -> 227;
            case 110 -> 154;
            case 111 -> 141;
            case 112 -> 150;
            case 113 -> 137;
            case 114 -> 49;
            case 115 -> 50;
            case 116 -> 83;
            case 117 -> 129;
            case 118 -> 64;
            case 119 -> 89;
            case 120 -> 248;
            case 121 -> 76;
            case 122 -> 242;
            case 123 -> 116;
            case 124 -> 139;
            case 125 -> 90;
            case 126 -> 157;
            case 127 -> 246;
            case 128 -> 99;
            case 129 -> 160;
            case 130 -> 220;
            case 131 -> 158;
            case 132 -> 240;
            case 133 -> 73;
            case 134 -> 3;
            case 135 -> 23;
            case 136 -> 232;
            case 137 -> 53;
            case 138 -> 163;
            case 139 -> 145;
            case 140 -> 61;
            case 141 -> 118;
            case 142 -> 192;
            case 143 -> 209;
            case 144 -> 243;
            case 145 -> 100;
            case 146 -> 193;
            case 147 -> 68;
            case 148 -> 177;
            case 149 -> 172;
            case 150 -> 24;
            case 151 -> 36;
            case 152 -> 30;
            case 153 -> 63;
            case 154 -> 198;
            case 155 -> 125;
            case 156 -> 237;
            case 157 -> 71;
            case 158 -> 230;
            case 159 -> 105;
            case 160 -> 207;
            case 161 -> 217;
            case 162 -> 22;
            case 163 -> 119;
            case 164 -> 216;
            case 165 -> 117;
            case 166 -> 112;
            case 167 -> 149;
            case 168 -> 162;
            case 169 -> 147;
            case 170 -> 181;
            case 171 -> 38;
            case 172 -> 219;
            case 173 -> 135;
            case 174 -> 144;
            case 175 -> 138;
            case 176 -> 12;
            case 177 -> 187;
            case 178 -> 164;
            case 179 -> 88;
            case 180 -> 171;
            case 181 -> 212;
            case 182 -> 203;
            case 183 -> 17;
            case 184 -> 247;
            case 185 -> 194;
            case 186 -> 20;
            case 187 -> 115;
            case 188 -> 96;
            case 189 -> 208;
            case 190 -> 196;
            case 191 -> 205;
            case 192 -> 11;
            case 193 -> 224;
            case 194 -> 85;
            case 195 -> 136;
            case 196 -> 191;
            case 197 -> 8;
            case 198 -> 226;
            case 199 -> 37;
            case 200 -> 42;
            case 201 -> 79;
            case 202 -> 229;
            case 203 -> 204;
            case 204 -> 170;
            case 205 -> 29;
            case 206 -> 45;
            case 207 -> 65;
            case 208 -> 161;
            case 209 -> 126;
            case 210 -> 131;
            case 211 -> 244;
            case 212 -> 133;
            case 213 -> 176;
            case 214 -> 43;
            case 215 -> 159;
            case 216 -> 255;
            case 217 -> 218;
            case 218 -> 28;
            case 219 -> 202;
            case 220 -> 86;
            case 221 -> 44;
            case 222 -> 178;
            case 223 -> 55;
            case 224 -> 10;
            case 225 -> 241;
            case 226 -> 142;
            case 227 -> 54;
            case 228 -> 78;
            case 229 -> 190;
            case 230 -> 152;
            case 231 -> 223;
            case 232 -> 185;
            case 233 -> 58;
            case 234 -> 173;
            case 235 -> 92;
            case 236 -> 199;
            case 237 -> 39;
            case 238 -> 130;
            case 239 -> 33;
            case 240 -> 143;
            case 241 -> 107;
            case 242 -> 27;
            case 243 -> 56;
            case 244 -> 52;
            case 245 -> 69;
            case 246 -> 179;
            case 247 -> 6;
            case 248 -> 166;
            case 249 -> 228;
            case 250 -> 4;
            case 251 -> 250;
            case 252 -> 94;
            case 253 -> 231;
            case 254 -> 9;
            default -> 59;
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
         short var10001 = -5320;
         short var10002 = -3315;
         Intrinsics.checkNotNullParameter(var1, "handler");
         var10001 = -5315;
         var10002 = -13758;
         Intrinsics.checkNotNullParameter(var4, "playerPos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI =((Triple)( var4));
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
      public final llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
         @NotNull IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1,
         int var2,
         int var3,
         @NotNull Triple<Integer, Integer, Integer> var4
      ) {
         short var10001 = -5314;
         short var10002 = -28024;
         Intrinsics.checkNotNullParameter(var1, "handler");
         var10001 = -5318;
         var10002 = -21446;
         Intrinsics.checkNotNullParameter(var4, "playerPos");
         return new llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            var1, var2, var3,((Triple)( var4
         )));
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -5316;
         Triple var1 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         int var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -32418;
         short var10002 = -5317;
         short var10003 = -20588;
         short var10004 = -5313;
         short var10005 = -14937;
         short var10006 = -5319;
         short var10007 = -16868;
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
               var10000 instanceof llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = (llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var10000;
         int var4 = ((Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )) ? 1 : 0);
         if (var2 == 0) {
            if (var4 == 0) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         label56: {
            int var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (var2 == 0) {
               if (var4 != var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
                  return false;
               }

               var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               if (var2 != 0) {
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

         if (var2 == 0) {
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
         String var2 = "÷\u0081\u008ea¡Î\u0001\fg\u0095Ó\u008b\u0016\u0004\u0000<Ó8tÍz\t?Ô\u0002rë3ä»\u0002\u0007k\u000b\u009c8ßÓh\u000fmx\u009d3Z)öÅÜ/(vð\td\u0007\u008e\u0002 \u0019H÷\u009a\fÍ\u001c\u009a»Ï¶Ñ|\u0014&Ûø";
         int var4 = "÷\u0081\u008ea¡Î\u0001\fg\u0095Ó\u008b\u0016\u0004\u0000<Ó8tÍz\t?Ô\u0002rë3ä»\u0002\u0007k\u000b\u009c8ßÓh\u000fmx\u009d3Z)öÅÜ/(vð\td\u0007\u008e\u0002 \u0019H÷\u009a\fÍ\u001c\u009a»Ï¶Ñ|\u0014&Ûø"
            .length();
         char var1 = 21;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 81;
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
                        case 0 -> 60;
                        case 1 -> 67;
                        case 2 -> 6;
                        case 3 -> 99;
                        case 4 -> 56;
                        case 5 -> 78;
                        default -> 124;
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

                     var2 = "\tø\u0089º×g.|\u0016\u0011è°kn´ð\u0094A\u001a\u000b\u0099A\u0087ï\u0012À\u0001";
                     var4 = "\tø\u0089º×g.|\u0016\u0011è°kn´ð\u0094A\u001a\u000b\u0099A\u0087ï\u0012À\u0001".length();
                     var1 = '\t';
                     var8 = -1;
               }

               var10000 = 48;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -5316) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 123;
               case 1 -> 141;
               case 2 -> 3;
               case 3 -> 89;
               case 4 -> 104;
               case 5 -> 197;
               case 6 -> 26;
               case 7 -> 43;
               case 8 -> 246;
               case 9 -> 215;
               case 10 -> 76;
               case 11 -> 187;
               case 12 -> 105;
               case 13 -> 174;
               case 14 -> 95;
               case 15 -> 245;
               case 16 -> 15;
               case 17 -> 111;
               case 18 -> 101;
               case 19 -> 29;
               case 20 -> 117;
               case 21 -> 118;
               case 22 -> 90;
               case 23 -> 62;
               case 24 -> 218;
               case 25 -> 125;
               case 26 -> 195;
               case 27 -> 216;
               case 28 -> 168;
               case 29 -> 31;
               case 30 -> 138;
               case 31 -> 9;
               case 32 -> 38;
               case 33 -> 235;
               case 34 -> 212;
               case 35 -> 221;
               case 36 -> 68;
               case 37 -> 143;
               case 38 -> 140;
               case 39 -> 242;
               case 40 -> 88;
               case 41 -> 114;
               case 42 -> 223;
               case 43 -> 74;
               case 44 -> 225;
               case 45 -> 188;
               case 46 -> 83;
               case 47 -> 214;
               case 48 -> 20;
               case 49 -> 234;
               case 50 -> 166;
               case 51 -> 113;
               case 52 -> 154;
               case 53 -> 177;
               case 54 -> 66;
               case 55 -> 70;
               case 56 -> 191;
               case 57 -> 243;
               case 58 -> 81;
               case 59 -> 201;
               case 60 -> 148;
               case 61 -> 57;
               case 62 -> 196;
               case 63 -> 160;
               case 64 -> 248;
               case 65 -> 237;
               case 66 -> 208;
               case 67 -> 98;
               case 68 -> 103;
               case 69 -> 165;
               case 70 -> 5;
               case 71 -> 48;
               case 72 -> 222;
               case 73 -> 82;
               case 74 -> 231;
               case 75 -> 157;
               case 76 -> 92;
               case 77 -> 39;
               case 78 -> 53;
               case 79 -> 77;
               case 80 -> 93;
               case 81 -> 137;
               case 82 -> 32;
               case 83 -> 129;
               case 84 -> 8;
               case 85 -> 87;
               case 86 -> 19;
               case 87 -> 27;
               case 88 -> 227;
               case 89 -> 119;
               case 90 -> 149;
               case 91 -> 158;
               case 92 -> 65;
               case 93 -> 169;
               case 94 -> 23;
               case 95 -> 99;
               case 96 -> 46;
               case 97 -> 152;
               case 98 -> 224;
               case 99 -> 207;
               case 100 -> 120;
               case 101 -> 240;
               case 102 -> 220;
               case 103 -> 112;
               case 104 -> 132;
               case 105 -> 0;
               case 106 -> 86;
               case 107 -> 44;
               case 108 -> 35;
               case 109 -> 42;
               case 110 -> 205;
               case 111 -> 133;
               case 112 -> 25;
               case 113 -> 122;
               case 114 -> 229;
               case 115 -> 51;
               case 116 -> 189;
               case 117 -> 145;
               case 118 -> 150;
               case 119 -> 40;
               case 120 -> 142;
               case 121 -> 45;
               case 122 -> 254;
               case 123 -> 106;
               case 124 -> 116;
               case 125 -> 162;
               case 126 -> 63;
               case 127 -> 2;
               case 128 -> 102;
               case 129 -> 126;
               case 130 -> 13;
               case 131 -> 73;
               case 132 -> 64;
               case 133 -> 252;
               case 134 -> 59;
               case 135 -> 181;
               case 136 -> 11;
               case 137 -> 170;
               case 138 -> 200;
               case 139 -> 94;
               case 140 -> 28;
               case 141 -> 156;
               case 142 -> 171;
               case 143 -> 91;
               case 144 -> 75;
               case 145 -> 172;
               case 146 -> 182;
               case 147 -> 194;
               case 148 -> 17;
               case 149 -> 247;
               case 150 -> 78;
               case 151 -> 253;
               case 152 -> 184;
               case 153 -> 164;
               case 154 -> 135;
               case 155 -> 155;
               case 156 -> 226;
               case 157 -> 250;
               case 158 -> 18;
               case 159 -> 58;
               case 160 -> 144;
               case 161 -> 159;
               case 162 -> 41;
               case 163 -> 7;
               case 164 -> 241;
               case 165 -> 217;
               case 166 -> 16;
               case 167 -> 236;
               case 168 -> 56;
               case 169 -> 72;
               case 170 -> 6;
               case 171 -> 30;
               case 172 -> 71;
               case 173 -> 233;
               case 174 -> 151;
               case 175 -> 198;
               case 176 -> 147;
               case 177 -> 107;
               case 178 -> 186;
               case 179 -> 128;
               case 180 -> 146;
               case 181 -> 175;
               case 182 -> 213;
               case 183 -> 239;
               case 184 -> 79;
               case 185 -> 50;
               case 186 -> 249;
               case 187 -> 185;
               case 188 -> 34;
               case 189 -> 55;
               case 190 -> 251;
               case 191 -> 12;
               case 192 -> 61;
               case 193 -> 69;
               case 194 -> 37;
               case 195 -> 110;
               case 196 -> 180;
               case 197 -> 21;
               case 198 -> 206;
               case 199 -> 161;
               case 200 -> 179;
               case 201 -> 219;
               case 202 -> 153;
               case 203 -> 139;
               case 204 -> 163;
               case 205 -> 190;
               case 206 -> 60;
               case 207 -> 36;
               case 208 -> 232;
               case 209 -> 176;
               case 210 -> 33;
               case 211 -> 127;
               case 212 -> 124;
               case 213 -> 22;
               case 214 -> 84;
               case 215 -> 10;
               case 216 -> 238;
               case 217 -> 14;
               case 218 -> 228;
               case 219 -> 24;
               case 220 -> 199;
               case 221 -> 52;
               case 222 -> 202;
               case 223 -> 109;
               case 224 -> 167;
               case 225 -> 49;
               case 226 -> 131;
               case 227 -> 130;
               case 228 -> 204;
               case 229 -> 192;
               case 230 -> 203;
               case 231 -> 100;
               case 232 -> 121;
               case 233 -> 108;
               case 234 -> 85;
               case 235 -> 193;
               case 236 -> 136;
               case 237 -> 54;
               case 238 -> 1;
               case 239 -> 80;
               case 240 -> 115;
               case 241 -> 178;
               case 242 -> 209;
               case 243 -> 210;
               case 244 -> 67;
               case 245 -> 211;
               case 246 -> 134;
               case 247 -> 230;
               case 248 -> 255;
               case 249 -> 96;
               case 250 -> 183;
               case 251 -> 4;
               case 252 -> 173;
               case 253 -> 97;
               case 254 -> 244;
               default -> 47;
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
   
public static me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll p0, me.octo.client.IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI p1, int p2, int p3, kotlin.Triple p4, int p5, java.lang.Object p6) {
         return (me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll) null;
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
         short var10001 = -31041;
         short var10002 = -22598;
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
      public final llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(
         @Nullable BlockPos var1, boolean var2, @NotNull Triple<Integer, Integer, Integer> var3
      ) {
         short var10001 = -31046;
         short var10002 = -29315;
         Intrinsics.checkNotNullParameter(var3, "playerPos");
         return new llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -31047;
         Triple var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         boolean var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         BlockPos var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -2967;
         short var10002 = -31045;
         short var10003 = 26860;
         short var10004 = -31048;
         short var10005 = -12407;
         return "MoveProgress(walkPosition=" + var3 + ", walkerFinished=" + var2 + ", playerPos=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var4;
         label14: {
            int var1 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
            BlockPos var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            if (var1 != 0) {
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
               var10000 instanceof llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var3 = (llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)var10000;
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
         String var2 = "´bÒksÝ%í\u0090r\u0090¿T\u0014Ð8t\t¬\u009e\u0010)ö\u0097\u0088\u0083\u0083\u001a\u009dj»ÈC4\u0092ÿ\u0019\u008b\u000e\u0017bG\"¦ø\u0007ª_q ¸\u001b_\u0000";
         int var4 = "´bÒksÝ%í\u0090r\u0090¿T\u0014Ð8t\t¬\u009e\u0010)ö\u0097\u0088\u0083\u0083\u001a\u009dj»ÈC4\u0092ÿ\u0019\u008b\u000e\u0017bG\"¦ø\u0007ª_q ¸\u001b_\u0000"
            .length();
         char var1 = 17;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 109;
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
                        case 0 -> 9;
                        case 1 -> 87;
                        case 2 -> 123;
                        case 3 -> 72;
                        case 4 -> 115;
                        case 5 -> 95;
                        default -> 97;
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

                     var2 = "{on\u0085Lü,Ûåðµ?\t¯ò2æð,\n¶\u0091";
                     var4 = "{on\u0085Lü,Ûåðµ?\t¯ò2æð,\n¶\u0091".length();
                     var1 = '\f';
                     var8 = -1;
               }

               var10000 = 111;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -31045) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 170;
               case 1 -> 198;
               case 2 -> 79;
               case 3 -> 234;
               case 4 -> 211;
               case 5 -> 114;
               case 6 -> 54;
               case 7 -> 108;
               case 8 -> 55;
               case 9 -> 168;
               case 10 -> 225;
               case 11 -> 146;
               case 12 -> 239;
               case 13 -> 244;
               case 14 -> 69;
               case 15 -> 102;
               case 16 -> 126;
               case 17 -> 80;
               case 18 -> 134;
               case 19 -> 238;
               case 20 -> 3;
               case 21 -> 186;
               case 22 -> 23;
               case 23 -> 66;
               case 24 -> 38;
               case 25 -> 230;
               case 26 -> 92;
               case 27 -> 119;
               case 28 -> 159;
               case 29 -> 88;
               case 30 -> 49;
               case 31 -> 24;
               case 32 -> 19;
               case 33 -> 241;
               case 34 -> 5;
               case 35 -> 58;
               case 36 -> 135;
               case 37 -> 15;
               case 38 -> 164;
               case 39 -> 144;
               case 40 -> 107;
               case 41 -> 59;
               case 42 -> 22;
               case 43 -> 228;
               case 44 -> 248;
               case 45 -> 65;
               case 46 -> 121;
               case 47 -> 140;
               case 48 -> 42;
               case 49 -> 11;
               case 50 -> 141;
               case 51 -> 14;
               case 52 -> 104;
               case 53 -> 252;
               case 54 -> 40;
               case 55 -> 156;
               case 56 -> 247;
               case 57 -> 36;
               case 58 -> 125;
               case 59 -> 143;
               case 60 -> 6;
               case 61 -> 85;
               case 62 -> 87;
               case 63 -> 158;
               case 64 -> 52;
               case 65 -> 172;
               case 66 -> 86;
               case 67 -> 100;
               case 68 -> 20;
               case 69 -> 43;
               case 70 -> 210;
               case 71 -> 212;
               case 72 -> 178;
               case 73 -> 246;
               case 74 -> 136;
               case 75 -> 217;
               case 76 -> 71;
               case 77 -> 45;
               case 78 -> 190;
               case 79 -> 199;
               case 80 -> 191;
               case 81 -> 204;
               case 82 -> 72;
               case 83 -> 243;
               case 84 -> 16;
               case 85 -> 101;
               case 86 -> 113;
               case 87 -> 130;
               case 88 -> 75;
               case 89 -> 68;
               case 90 -> 227;
               case 91 -> 133;
               case 92 -> 110;
               case 93 -> 253;
               case 94 -> 77;
               case 95 -> 47;
               case 96 -> 161;
               case 97 -> 163;
               case 98 -> 183;
               case 99 -> 124;
               case 100 -> 64;
               case 101 -> 37;
               case 102 -> 188;
               case 103 -> 96;
               case 104 -> 25;
               case 105 -> 82;
               case 106 -> 214;
               case 107 -> 78;
               case 108 -> 81;
               case 109 -> 207;
               case 110 -> 216;
               case 111 -> 67;
               case 112 -> 180;
               case 113 -> 10;
               case 114 -> 242;
               case 115 -> 74;
               case 116 -> 208;
               case 117 -> 95;
               case 118 -> 192;
               case 119 -> 182;
               case 120 -> 29;
               case 121 -> 18;
               case 122 -> 150;
               case 123 -> 41;
               case 124 -> 12;
               case 125 -> 176;
               case 126 -> 219;
               case 127 -> 91;
               case 128 -> 4;
               case 129 -> 249;
               case 130 -> 215;
               case 131 -> 48;
               case 132 -> 148;
               case 133 -> 187;
               case 134 -> 116;
               case 135 -> 205;
               case 136 -> 231;
               case 137 -> 213;
               case 138 -> 61;
               case 139 -> 83;
               case 140 -> 226;
               case 141 -> 155;
               case 142 -> 165;
               case 143 -> 147;
               case 144 -> 33;
               case 145 -> 222;
               case 146 -> 84;
               case 147 -> 93;
               case 148 -> 193;
               case 149 -> 233;
               case 150 -> 224;
               case 151 -> 206;
               case 152 -> 112;
               case 153 -> 195;
               case 154 -> 60;
               case 155 -> 31;
               case 156 -> 39;
               case 157 -> 149;
               case 158 -> 8;
               case 159 -> 139;
               case 160 -> 13;
               case 161 -> 73;
               case 162 -> 129;
               case 163 -> 250;
               case 164 -> 111;
               case 165 -> 145;
               case 166 -> 109;
               case 167 -> 27;
               case 168 -> 35;
               case 169 -> 28;
               case 170 -> 103;
               case 171 -> 56;
               case 172 -> 196;
               case 173 -> 245;
               case 174 -> 122;
               case 175 -> 174;
               case 176 -> 218;
               case 177 -> 17;
               case 178 -> 2;
               case 179 -> 7;
               case 180 -> 175;
               case 181 -> 171;
               case 182 -> 97;
               case 183 -> 123;
               case 184 -> 220;
               case 185 -> 62;
               case 186 -> 137;
               case 187 -> 89;
               case 188 -> 152;
               case 189 -> 138;
               case 190 -> 153;
               case 191 -> 0;
               case 192 -> 232;
               case 193 -> 44;
               case 194 -> 120;
               case 195 -> 128;
               case 196 -> 177;
               case 197 -> 32;
               case 198 -> 221;
               case 199 -> 90;
               case 200 -> 197;
               case 201 -> 1;
               case 202 -> 223;
               case 203 -> 131;
               case 204 -> 70;
               case 205 -> 255;
               case 206 -> 76;
               case 207 -> 162;
               case 208 -> 240;
               case 209 -> 202;
               case 210 -> 105;
               case 211 -> 203;
               case 212 -> 236;
               case 213 -> 235;
               case 214 -> 237;
               case 215 -> 9;
               case 216 -> 98;
               case 217 -> 185;
               case 218 -> 142;
               case 219 -> 115;
               case 220 -> 229;
               case 221 -> 189;
               case 222 -> 50;
               case 223 -> 151;
               case 224 -> 51;
               case 225 -> 173;
               case 226 -> 254;
               case 227 -> 26;
               case 228 -> 166;
               case 229 -> 30;
               case 230 -> 106;
               case 231 -> 160;
               case 232 -> 57;
               case 233 -> 157;
               case 234 -> 99;
               case 235 -> 46;
               case 236 -> 200;
               case 237 -> 184;
               case 238 -> 169;
               case 239 -> 194;
               case 240 -> 209;
               case 241 -> 118;
               case 242 -> 127;
               case 243 -> 167;
               case 244 -> 63;
               case 245 -> 251;
               case 246 -> 179;
               case 247 -> 94;
               case 248 -> 34;
               case 249 -> 181;
               case 250 -> 154;
               case 251 -> 21;
               case 252 -> 53;
               case 253 -> 117;
               case 254 -> 201;
               default -> 132;
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
   
public static me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll p0, net.minecraft.core.BlockPos p1, boolean p2, kotlin.Triple p3, int p4, java.lang.Object p5) {
         return (me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll) null;
      }
}

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(Object... px) {
        }

      private static int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

      private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
      }

      @NotNull
      public final llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll a() {
         return llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
      }

      public final int b() {
         return llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl;
      }

      public final void a(int var1) {
         llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl = var1;
      }

      public static void b(int var0) {
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var0;
      }

      public static int c() {
         return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public static int d() {
         int var0 = c();
         return var0 == 0 ? 109 : 0;
      }

      static {
         if (d() != 0) {
            b(59);
         }
      }
   
   public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(kotlin.jvm.internal.DefaultConstructorMarker p0) {
      this();
   }
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
      public final llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         boolean var1, @Nullable String var2, int var3
      ) {
         return new llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 621;
         int var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         String var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         boolean var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 32134;
         short var10002 = 620;
         short var10003 = 27955;
         short var10004 = 622;
         short var10005 = 29003;
         return "CommandProgress(clickedTop=" + var3 + ", screenTitle=" + var2 + ", greatExplorerLevel=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var4;
         int var5;
         label14: {
            var4 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
            int var2 = Boolean.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
            int var1 = var4;
            var4 = var2 * 31;
            String var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (var1 == 0) {
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
               var10000 instanceof llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
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
         String var2 = "é7\u0012\u009bÑ+Aw\u0083Ñàî±#\u001b\u001a3ð³Cêc\u001bÀ£yxóbqO¥\u0092.âÈ\u0083M\u0018\u0014Q\u000f\u0015ß1ÀJ\n&ÞyoGÌ\u00058eü\u001f3j6«\u0010";
         int var4 = "é7\u0012\u009bÑ+Aw\u0083Ñàî±#\u001b\u001a3ð³Cêc\u001bÀ£yxóbqO¥\u0092.âÈ\u0083M\u0018\u0014Q\u000f\u0015ß1ÀJ\n&ÞyoGÌ\u00058eü\u001f3j6«\u0010"
            .length();
         char var1 = 14;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 88;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 88;
                  var10006 = var6;
               } else {
                  var13 = 88;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 88;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 78;
                     case 1 -> 66;
                     case 2 -> 111;
                     case 3 -> 33;
                     case 4 -> 66;
                     case 5 -> 69;
                     default -> 57;
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
         int var2 = (var0 ^ 620) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 94;
               case 1 -> 239;
               case 2 -> 152;
               case 3 -> 129;
               case 4 -> 75;
               case 5 -> 42;
               case 6 -> 0;
               case 7 -> 35;
               case 8 -> 21;
               case 9 -> 43;
               case 10 -> 208;
               case 11 -> 3;
               case 12 -> 55;
               case 13 -> 62;
               case 14 -> 84;
               case 15 -> 151;
               case 16 -> 228;
               case 17 -> 39;
               case 18 -> 107;
               case 19 -> 10;
               case 20 -> 82;
               case 21 -> 146;
               case 22 -> 187;
               case 23 -> 240;
               case 24 -> 242;
               case 25 -> 4;
               case 26 -> 54;
               case 27 -> 186;
               case 28 -> 132;
               case 29 -> 204;
               case 30 -> 245;
               case 31 -> 2;
               case 32 -> 189;
               case 33 -> 26;
               case 34 -> 51;
               case 35 -> 83;
               case 36 -> 13;
               case 37 -> 209;
               case 38 -> 36;
               case 39 -> 17;
               case 40 -> 103;
               case 41 -> 46;
               case 42 -> 65;
               case 43 -> 157;
               case 44 -> 24;
               case 45 -> 195;
               case 46 -> 5;
               case 47 -> 117;
               case 48 -> 160;
               case 49 -> 174;
               case 50 -> 22;
               case 51 -> 73;
               case 52 -> 167;
               case 53 -> 44;
               case 54 -> 105;
               case 55 -> 8;
               case 56 -> 237;
               case 57 -> 232;
               case 58 -> 128;
               case 59 -> 19;
               case 60 -> 20;
               case 61 -> 215;
               case 62 -> 92;
               case 63 -> 227;
               case 64 -> 114;
               case 65 -> 193;
               case 66 -> 28;
               case 67 -> 253;
               case 68 -> 207;
               case 69 -> 155;
               case 70 -> 234;
               case 71 -> 135;
               case 72 -> 178;
               case 73 -> 241;
               case 74 -> 138;
               case 75 -> 69;
               case 76 -> 171;
               case 77 -> 125;
               case 78 -> 127;
               case 79 -> 229;
               case 80 -> 198;
               case 81 -> 37;
               case 82 -> 88;
               case 83 -> 154;
               case 84 -> 104;
               case 85 -> 246;
               case 86 -> 133;
               case 87 -> 33;
               case 88 -> 115;
               case 89 -> 29;
               case 90 -> 61;
               case 91 -> 220;
               case 92 -> 147;
               case 93 -> 141;
               case 94 -> 250;
               case 95 -> 206;
               case 96 -> 140;
               case 97 -> 23;
               case 98 -> 89;
               case 99 -> 213;
               case 100 -> 106;
               case 101 -> 212;
               case 102 -> 121;
               case 103 -> 139;
               case 104 -> 134;
               case 105 -> 153;
               case 106 -> 235;
               case 107 -> 130;
               case 108 -> 52;
               case 109 -> 116;
               case 110 -> 172;
               case 111 -> 164;
               case 112 -> 201;
               case 113 -> 190;
               case 114 -> 70;
               case 115 -> 214;
               case 116 -> 32;
               case 117 -> 170;
               case 118 -> 217;
               case 119 -> 45;
               case 120 -> 100;
               case 121 -> 77;
               case 122 -> 156;
               case 123 -> 191;
               case 124 -> 238;
               case 125 -> 188;
               case 126 -> 50;
               case 127 -> 202;
               case 128 -> 196;
               case 129 -> 183;
               case 130 -> 15;
               case 131 -> 185;
               case 132 -> 7;
               case 133 -> 197;
               case 134 -> 124;
               case 135 -> 111;
               case 136 -> 150;
               case 137 -> 97;
               case 138 -> 243;
               case 139 -> 87;
               case 140 -> 112;
               case 141 -> 168;
               case 142 -> 148;
               case 143 -> 244;
               case 144 -> 109;
               case 145 -> 86;
               case 146 -> 248;
               case 147 -> 137;
               case 148 -> 247;
               case 149 -> 180;
               case 150 -> 222;
               case 151 -> 176;
               case 152 -> 145;
               case 153 -> 223;
               case 154 -> 72;
               case 155 -> 101;
               case 156 -> 179;
               case 157 -> 159;
               case 158 -> 166;
               case 159 -> 224;
               case 160 -> 236;
               case 161 -> 53;
               case 162 -> 211;
               case 163 -> 225;
               case 164 -> 203;
               case 165 -> 120;
               case 166 -> 200;
               case 167 -> 254;
               case 168 -> 216;
               case 169 -> 6;
               case 170 -> 98;
               case 171 -> 142;
               case 172 -> 233;
               case 173 -> 118;
               case 174 -> 31;
               case 175 -> 149;
               case 176 -> 169;
               case 177 -> 74;
               case 178 -> 177;
               case 179 -> 218;
               case 180 -> 110;
               case 181 -> 182;
               case 182 -> 68;
               case 183 -> 40;
               case 184 -> 18;
               case 185 -> 255;
               case 186 -> 90;
               case 187 -> 231;
               case 188 -> 205;
               case 189 -> 11;
               case 190 -> 12;
               case 191 -> 57;
               case 192 -> 27;
               case 193 -> 48;
               case 194 -> 47;
               case 195 -> 173;
               case 196 -> 78;
               case 197 -> 131;
               case 198 -> 163;
               case 199 -> 161;
               case 200 -> 162;
               case 201 -> 102;
               case 202 -> 136;
               case 203 -> 66;
               case 204 -> 99;
               case 205 -> 251;
               case 206 -> 123;
               case 207 -> 158;
               case 208 -> 249;
               case 209 -> 76;
               case 210 -> 41;
               case 211 -> 95;
               case 212 -> 181;
               case 213 -> 49;
               case 214 -> 14;
               case 215 -> 184;
               case 216 -> 64;
               case 217 -> 91;
               case 218 -> 67;
               case 219 -> 108;
               case 220 -> 59;
               case 221 -> 175;
               case 222 -> 58;
               case 223 -> 119;
               case 224 -> 25;
               case 225 -> 230;
               case 226 -> 30;
               case 227 -> 63;
               case 228 -> 165;
               case 229 -> 79;
               case 230 -> 34;
               case 231 -> 252;
               case 232 -> 194;
               case 233 -> 93;
               case 234 -> 192;
               case 235 -> 38;
               case 236 -> 113;
               case 237 -> 143;
               case 238 -> 122;
               case 239 -> 221;
               case 240 -> 226;
               case 241 -> 16;
               case 242 -> 80;
               case 243 -> 60;
               case 244 -> 9;
               case 245 -> 219;
               case 246 -> 126;
               case 247 -> 85;
               case 248 -> 71;
               case 249 -> 210;
               case 250 -> 1;
               case 251 -> 199;
               case 252 -> 56;
               case 253 -> 144;
               case 254 -> 81;
               default -> 96;
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
   
public static me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll p0, boolean p1, java.lang.String p2, int p3, int p4, java.lang.Object p5) {
         return (me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll) null;
      }
}
   // >>> PX-FIX PhaseA-top-e row2 restored synthetic bridges/getters
   public static final void a(me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll p0, me.octo.client.IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p1) { p0.a(p1); }
   public static final int bA() { return lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl; }
   public static final me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll bz() { return IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII; }
   public static final void e(int p0) { lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl = p0; }
   // <<< PX-FIX PhaseA-top-e row2
}
