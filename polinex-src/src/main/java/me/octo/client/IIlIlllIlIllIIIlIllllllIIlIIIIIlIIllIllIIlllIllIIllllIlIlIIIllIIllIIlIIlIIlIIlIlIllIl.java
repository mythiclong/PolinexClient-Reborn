package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl
   extends lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll {
    public static <T> T d(Object p0) { return null; } // PX-FIX mr4
    public static <T> T bv(Object p0) { return null; } // PX-FIX mr4
    public static <T> T b(Object p0) { return null; } // PX-FIX mr4
    public static <T> T g(Object p0) { return null; } // PX-FIX mr3
    public static <T> T f(Object p0) { return null; } // PX-FIX mr3

   public Object receiver; // PX-FIX kotlin lambda receiver

   @NotNull
   public static IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   @NotNull
   private ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
   @NotNull
   private ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
   @NotNull
   private IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
   @NotNull
   private static IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
   @NotNull
   private static IlIIlIIIIllIlIIIllllIIlIIIIIIlIlIIlIllIIIIIIllllllllIlIlIllIIIIIIIIIlIIIlIIlIIlIlIIII lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
   private static String[] j;
   private static String[] k;

   public IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl() {
      short var10001 = -11458;
      short var10002 = 12155;
      var10002 = -11463;
      short var10003 = 9843;
      me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      short var10004 = -11471;
      short var10005 = 2971;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         IIlIIIllIIIllIlIIlIllIlIllIIlIIIIIllllIlIIIlIlIlIIIIIlIIlIlIllIIlllIIIllllIIllIlIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         IIlIIIllIIIllIlIIlIllIlIllIIlIIIIIllllIlIIIlIlIlIIIIIlIIlIlIllIIlllIIIllllIIllIlIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         IIlIIIllIIIllIlIIlIllIlIllIIlIIIIIllllIlIIIlIlIlIIIIIlIIlIlIllIIlllIIIllllIIllIlIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c(),
         IIlIIIllIIIllIlIIlIllIlIllIIlIIIIIllllIlIIIlIlIlIIIIIlIIlIlIllIIlllIIIllllIIllIlIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .d(),
         IIlIIIllIIIllIlIIlIllIlIllIIlIIIIIllllIlIIIlIlIlIIIIIlIIlIlIllIIlllIIIllllIIllIlIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e(),
         IIlIIIllIIIllIlIIlIllIlIllIIlIIIIIllllIlIIIlIlIlIIIIIlIIlIlIllIIlllIIIllllIIllIlIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .f()
      };
      super("Crimson Mining Macro", "Mines red sand in the Crimson Isle using a smooth path route.", var3, "Crimson Isle", null, null, true, var1, 48, null);
      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = new ArrayList<>();
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = new ArrayList<>();
      this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @Override
   protected void aD() {
      Object receiver = null; // PX-FIX
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var10000 = this;
      short var10001 = -11457;
      short var10002 = -5239;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10000),
         "Crimson mining travel",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         null,
         5000L,
         false,
         false,
         (kotlin.jvm.functions.Function1)(IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl::b),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = -16775;
                  short var10005 = 23639;
                  var10005 = -16774;
                  short var10006 = 13384;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001x = -16773;
                  short var10002x = -15146;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "^\u0010{?\u001eâ\u0005\u0097d\\f%\u0093|Ùµæ0|\u0091Ð\u0011\u0019nÒÎò\u009f¬ÚLëÃ\u0015\u0013\u008c\u0096\u00110M\u0004J,\u008d Hô.ÙÍ[86C`\u008b\u0004µ\u0001jAÎoP¨\u008bì5\u009f`_Iëõ\u001c\u0018á.øàÃüÞýÓ{Þ\u0096;Ð ¶AÖÑ»\u001d\u0015«fÑ\u0010Ú¤\u001c¹Æ\u0012\u0004\u0087\u0003\u0013Ì¦¼\bw\u0082\u008cÙUºva\bÉ\u0012qa+ê®\u0099{ÙÁdà'&9B\u0087ß¯";
                  int var4 = "^\u0010{?\u001eâ\u0005\u0097d\\f%\u0093|Ùµæ0|\u0091Ð\u0011\u0019nÒÎò\u009f¬ÚLëÃ\u0015\u0013\u008c\u0096\u00110M\u0004J,\u008d Hô.ÙÍ[86C`\u008b\u0004µ\u0001jAÎoP¨\u008bì5\u009f`_Iëõ\u001c\u0018á.øàÃüÞýÓ{Þ\u0096;Ð ¶AÖÑ»\u001d\u0015«fÑ\u0010Ú¤\u001c¹Æ\u0012\u0004\u0087\u0003\u0013Ì¦¼\bw\u0082\u008cÙUºva\bÉ\u0012qa+ê®\u0099{ÙÁdà'&9B\u0087ß¯"
                     .length();
                  char var1 = 2;
                  int var0 = -1;

                  while (true) {
                     char[] var10002x;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 73;
                        var10002x = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 73;
                           var10006 = var6;
                        } else {
                           var13 = 73;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 73;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 56;
                              case 1 -> 36;
                              case 2 -> 105;
                              case 3 -> 11;
                              case 4 -> 73;
                              case 5 -> 72;
                              default -> 69;
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
                  int var2 = (var0 ^ -16773) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 239;
                        case 1 -> 216;
                        case 2 -> 89;
                        case 3 -> 177;
                        case 4 -> 2;
                        case 5 -> 110;
                        case 6 -> 108;
                        case 7 -> 55;
                        case 8 -> 231;
                        case 9 -> 202;
                        case 10 -> 157;
                        case 11 -> 182;
                        case 12 -> 234;
                        case 13 -> 188;
                        case 14 -> 103;
                        case 15 -> 19;
                        case 16 -> 129;
                        case 17 -> 85;
                        case 18 -> 178;
                        case 19 -> 144;
                        case 20 -> 90;
                        case 21 -> 229;
                        case 22 -> 214;
                        case 23 -> 100;
                        case 24 -> 40;
                        case 25 -> 172;
                        case 26 -> 9;
                        case 27 -> 152;
                        case 28 -> 43;
                        case 29 -> 102;
                        case 30 -> 242;
                        case 31 -> 127;
                        case 32 -> 215;
                        case 33 -> 245;
                        case 34 -> 135;
                        case 35 -> 29;
                        case 36 -> 36;
                        case 37 -> 254;
                        case 38 -> 11;
                        case 39 -> 1;
                        case 40 -> 133;
                        case 41 -> 16;
                        case 42 -> 140;
                        case 43 -> 126;
                        case 44 -> 91;
                        case 45 -> 175;
                        case 46 -> 255;
                        case 47 -> 119;
                        case 48 -> 4;
                        case 49 -> 240;
                        case 50 -> 186;
                        case 51 -> 21;
                        case 52 -> 24;
                        case 53 -> 75;
                        case 54 -> 225;
                        case 55 -> 244;
                        case 56 -> 145;
                        case 57 -> 49;
                        case 58 -> 115;
                        case 59 -> 246;
                        case 60 -> 197;
                        case 61 -> 184;
                        case 62 -> 27;
                        case 63 -> 232;
                        case 64 -> 73;
                        case 65 -> 146;
                        case 66 -> 209;
                        case 67 -> 101;
                        case 68 -> 23;
                        case 69 -> 60;
                        case 70 -> 249;
                        case 71 -> 118;
                        case 72 -> 160;
                        case 73 -> 48;
                        case 74 -> 38;
                        case 75 -> 201;
                        case 76 -> 136;
                        case 77 -> 30;
                        case 78 -> 34;
                        case 79 -> 67;
                        case 80 -> 117;
                        case 81 -> 87;
                        case 82 -> 161;
                        case 83 -> 221;
                        case 84 -> 207;
                        case 85 -> 156;
                        case 86 -> 163;
                        case 87 -> 92;
                        case 88 -> 235;
                        case 89 -> 128;
                        case 90 -> 208;
                        case 91 -> 164;
                        case 92 -> 79;
                        case 93 -> 71;
                        case 94 -> 219;
                        case 95 -> 77;
                        case 96 -> 199;
                        case 97 -> 147;
                        case 98 -> 83;
                        case 99 -> 226;
                        case 100 -> 37;
                        case 101 -> 166;
                        case 102 -> 46;
                        case 103 -> 7;
                        case 104 -> 130;
                        case 105 -> 50;
                        case 106 -> 138;
                        case 107 -> 12;
                        case 108 -> 159;
                        case 109 -> 241;
                        case 110 -> 165;
                        case 111 -> 13;
                        case 112 -> 193;
                        case 113 -> 26;
                        case 114 -> 170;
                        case 115 -> 44;
                        case 116 -> 105;
                        case 117 -> 88;
                        case 118 -> 5;
                        case 119 -> 203;
                        case 120 -> 250;
                        case 121 -> 114;
                        case 122 -> 236;
                        case 123 -> 171;
                        case 124 -> 10;
                        case 125 -> 93;
                        case 126 -> 116;
                        case 127 -> 52;
                        case 128 -> 53;
                        case 129 -> 176;
                        case 130 -> 227;
                        case 131 -> 120;
                        case 132 -> 228;
                        case 133 -> 33;
                        case 134 -> 18;
                        case 135 -> 185;
                        case 136 -> 20;
                        case 137 -> 35;
                        case 138 -> 61;
                        case 139 -> 15;
                        case 140 -> 212;
                        case 141 -> 168;
                        case 142 -> 76;
                        case 143 -> 107;
                        case 144 -> 31;
                        case 145 -> 69;
                        case 146 -> 174;
                        case 147 -> 22;
                        case 148 -> 149;
                        case 149 -> 47;
                        case 150 -> 86;
                        case 151 -> 112;
                        case 152 -> 96;
                        case 153 -> 32;
                        case 154 -> 194;
                        case 155 -> 113;
                        case 156 -> 106;
                        case 157 -> 97;
                        case 158 -> 238;
                        case 159 -> 122;
                        case 160 -> 196;
                        case 161 -> 78;
                        case 162 -> 72;
                        case 163 -> 180;
                        case 164 -> 252;
                        case 165 -> 179;
                        case 166 -> 247;
                        case 167 -> 8;
                        case 168 -> 198;
                        case 169 -> 153;
                        case 170 -> 62;
                        case 171 -> 131;
                        case 172 -> 150;
                        case 173 -> 39;
                        case 174 -> 210;
                        case 175 -> 74;
                        case 176 -> 167;
                        case 177 -> 181;
                        case 178 -> 132;
                        case 179 -> 82;
                        case 180 -> 41;
                        case 181 -> 6;
                        case 182 -> 218;
                        case 183 -> 151;
                        case 184 -> 237;
                        case 185 -> 191;
                        case 186 -> 104;
                        case 187 -> 190;
                        case 188 -> 42;
                        case 189 -> 248;
                        case 190 -> 94;
                        case 191 -> 230;
                        case 192 -> 134;
                        case 193 -> 155;
                        case 194 -> 54;
                        case 195 -> 51;
                        case 196 -> 59;
                        case 197 -> 173;
                        case 198 -> 121;
                        case 199 -> 64;
                        case 200 -> 28;
                        case 201 -> 187;
                        case 202 -> 65;
                        case 203 -> 58;
                        case 204 -> 211;
                        case 205 -> 204;
                        case 206 -> 111;
                        case 207 -> 124;
                        case 208 -> 222;
                        case 209 -> 81;
                        case 210 -> 220;
                        case 211 -> 17;
                        case 212 -> 223;
                        case 213 -> 253;
                        case 214 -> 148;
                        case 215 -> 189;
                        case 216 -> 99;
                        case 217 -> 68;
                        case 218 -> 154;
                        case 219 -> 57;
                        case 220 -> 84;
                        case 221 -> 213;
                        case 222 -> 169;
                        case 223 -> 158;
                        case 224 -> 233;
                        case 225 -> 206;
                        case 226 -> 192;
                        case 227 -> 162;
                        case 228 -> 14;
                        case 229 -> 25;
                        case 230 -> 200;
                        case 231 -> 195;
                        case 232 -> 123;
                        case 233 -> 139;
                        case 234 -> 45;
                        case 235 -> 205;
                        case 236 -> 63;
                        case 237 -> 3;
                        case 238 -> 141;
                        case 239 -> 143;
                        case 240 -> 183;
                        case 241 -> 95;
                        case 242 -> 70;
                        case 243 -> 224;
                        case 244 -> 142;
                        case 245 -> 125;
                        case 246 -> 98;
                        case 247 -> 56;
                        case 248 -> 109;
                        case 249 -> 217;
                        case 250 -> 0;
                        case 251 -> 137;
                        case 252 -> 251;
                        case 253 -> 80;
                        case 254 -> 243;
                        default -> 66;
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
      var10001 = -11485;
      var10002 = -4864;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10000),
         "Crimson mining route",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI,
         15000L,
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
                  short var10004 = 22336;
                  short var10005 = 25891;
                  var10005 = 22337;
                  short var10006 = 31368;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = 22338;
                  short var10002 = -17470;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "økEBY\u0013\u001dC¦hå\u009c\u0019ÖnÑ\u0005\u008c{pSTE{óY_.ëôì;Ø*\u0010\u008d´¨\nÁ{\u0090\u0098½Û\u0001:[¦\\V\u009f¡ë\u001d¹þ=Iü\u0094\u00adÙÍ\u0095\u008bMh?â\u001eVñ\u0091'%.xk¼·\u008eÄ>Åè.Ç]ïa\u0004§\u0097¯Oâ¢¥ß\u0086 ì&Ö\u0099t¥T,¸Oobß\u0017Çõ³GØÿÁB/&9Î±\u0082\u008bG:4Ì5Â¿OjpA\u0002\u0090\u0081";
                  int var4 = "økEBY\u0013\u001dC¦hå\u009c\u0019ÖnÑ\u0005\u008c{pSTE{óY_.ëôì;Ø*\u0010\u008d´¨\nÁ{\u0090\u0098½Û\u0001:[¦\\V\u009f¡ë\u001d¹þ=Iü\u0094\u00adÙÍ\u0095\u008bMh?â\u001eVñ\u0091'%.xk¼·\u008eÄ>Åè.Ç]ïa\u0004§\u0097¯Oâ¢¥ß\u0086 ì&Ö\u0099t¥T,¸Oobß\u0017Çõ³GØÿÁB/&9Î±\u0082\u008bG:4Ì5Â¿OjpA\u0002\u0090\u0081"
                     .length();
                  char var1 = 18;
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
                              case 0 -> 85;
                              case 1 -> 13;
                              case 2 -> 87;
                              case 3 -> 11;
                              case 4 -> 120;
                              case 5 -> 27;
                              default -> 55;
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
                  int var2 = (var0 ^ 22336) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 95;
                        case 1 -> 112;
                        case 2 -> 85;
                        case 3 -> 111;
                        case 4 -> 56;
                        case 5 -> 12;
                        case 6 -> 231;
                        case 7 -> 99;
                        case 8 -> 100;
                        case 9 -> 192;
                        case 10 -> 199;
                        case 11 -> 28;
                        case 12 -> 37;
                        case 13 -> 105;
                        case 14 -> 34;
                        case 15 -> 71;
                        case 16 -> 38;
                        case 17 -> 238;
                        case 18 -> 205;
                        case 19 -> 146;
                        case 20 -> 144;
                        case 21 -> 148;
                        case 22 -> 60;
                        case 23 -> 252;
                        case 24 -> 141;
                        case 25 -> 145;
                        case 26 -> 79;
                        case 27 -> 68;
                        case 28 -> 197;
                        case 29 -> 155;
                        case 30 -> 235;
                        case 31 -> 32;
                        case 32 -> 150;
                        case 33 -> 163;
                        case 34 -> 171;
                        case 35 -> 86;
                        case 36 -> 46;
                        case 37 -> 67;
                        case 38 -> 52;
                        case 39 -> 24;
                        case 40 -> 72;
                        case 41 -> 43;
                        case 42 -> 87;
                        case 43 -> 213;
                        case 44 -> 191;
                        case 45 -> 115;
                        case 46 -> 106;
                        case 47 -> 8;
                        case 48 -> 50;
                        case 49 -> 117;
                        case 50 -> 223;
                        case 51 -> 125;
                        case 52 -> 161;
                        case 53 -> 36;
                        case 54 -> 70;
                        case 55 -> 128;
                        case 56 -> 55;
                        case 57 -> 19;
                        case 58 -> 80;
                        case 59 -> 247;
                        case 60 -> 173;
                        case 61 -> 23;
                        case 62 -> 90;
                        case 63 -> 93;
                        case 64 -> 218;
                        case 65 -> 168;
                        case 66 -> 130;
                        case 67 -> 89;
                        case 68 -> 158;
                        case 69 -> 169;
                        case 70 -> 187;
                        case 71 -> 9;
                        case 72 -> 204;
                        case 73 -> 136;
                        case 74 -> 5;
                        case 75 -> 160;
                        case 76 -> 190;
                        case 77 -> 29;
                        case 78 -> 228;
                        case 79 -> 189;
                        case 80 -> 164;
                        case 81 -> 65;
                        case 82 -> 26;
                        case 83 -> 210;
                        case 84 -> 157;
                        case 85 -> 224;
                        case 86 -> 203;
                        case 87 -> 61;
                        case 88 -> 15;
                        case 89 -> 167;
                        case 90 -> 126;
                        case 91 -> 137;
                        case 92 -> 116;
                        case 93 -> 156;
                        case 94 -> 129;
                        case 95 -> 172;
                        case 96 -> 76;
                        case 97 -> 2;
                        case 98 -> 234;
                        case 99 -> 175;
                        case 100 -> 11;
                        case 101 -> 198;
                        case 102 -> 139;
                        case 103 -> 186;
                        case 104 -> 45;
                        case 105 -> 13;
                        case 106 -> 183;
                        case 107 -> 142;
                        case 108 -> 114;
                        case 109 -> 108;
                        case 110 -> 3;
                        case 111 -> 184;
                        case 112 -> 102;
                        case 113 -> 246;
                        case 114 -> 35;
                        case 115 -> 42;
                        case 116 -> 31;
                        case 117 -> 250;
                        case 118 -> 30;
                        case 119 -> 216;
                        case 120 -> 122;
                        case 121 -> 249;
                        case 122 -> 159;
                        case 123 -> 208;
                        case 124 -> 124;
                        case 125 -> 17;
                        case 126 -> 196;
                        case 127 -> 40;
                        case 128 -> 96;
                        case 129 -> 138;
                        case 130 -> 48;
                        case 131 -> 140;
                        case 132 -> 132;
                        case 133 -> 0;
                        case 134 -> 113;
                        case 135 -> 195;
                        case 136 -> 255;
                        case 137 -> 1;
                        case 138 -> 202;
                        case 139 -> 211;
                        case 140 -> 94;
                        case 141 -> 120;
                        case 142 -> 207;
                        case 143 -> 88;
                        case 144 -> 248;
                        case 145 -> 83;
                        case 146 -> 215;
                        case 147 -> 57;
                        case 148 -> 59;
                        case 149 -> 123;
                        case 150 -> 33;
                        case 151 -> 16;
                        case 152 -> 240;
                        case 153 -> 73;
                        case 154 -> 147;
                        case 155 -> 185;
                        case 156 -> 220;
                        case 157 -> 133;
                        case 158 -> 77;
                        case 159 -> 103;
                        case 160 -> 91;
                        case 161 -> 193;
                        case 162 -> 98;
                        case 163 -> 181;
                        case 164 -> 225;
                        case 165 -> 245;
                        case 166 -> 53;
                        case 167 -> 62;
                        case 168 -> 22;
                        case 169 -> 149;
                        case 170 -> 109;
                        case 171 -> 200;
                        case 172 -> 219;
                        case 173 -> 82;
                        case 174 -> 222;
                        case 175 -> 18;
                        case 176 -> 221;
                        case 177 -> 47;
                        case 178 -> 251;
                        case 179 -> 162;
                        case 180 -> 58;
                        case 181 -> 180;
                        case 182 -> 209;
                        case 183 -> 14;
                        case 184 -> 201;
                        case 185 -> 134;
                        case 186 -> 178;
                        case 187 -> 127;
                        case 188 -> 154;
                        case 189 -> 236;
                        case 190 -> 104;
                        case 191 -> 166;
                        case 192 -> 143;
                        case 193 -> 64;
                        case 194 -> 194;
                        case 195 -> 177;
                        case 196 -> 237;
                        case 197 -> 21;
                        case 198 -> 92;
                        case 199 -> 239;
                        case 200 -> 10;
                        case 201 -> 66;
                        case 202 -> 174;
                        case 203 -> 69;
                        case 204 -> 217;
                        case 205 -> 49;
                        case 206 -> 51;
                        case 207 -> 254;
                        case 208 -> 97;
                        case 209 -> 188;
                        case 210 -> 75;
                        case 211 -> 4;
                        case 212 -> 233;
                        case 213 -> 41;
                        case 214 -> 182;
                        case 215 -> 153;
                        case 216 -> 81;
                        case 217 -> 151;
                        case 218 -> 20;
                        case 219 -> 110;
                        case 220 -> 232;
                        case 221 -> 74;
                        case 222 -> 7;
                        case 223 -> 165;
                        case 224 -> 179;
                        case 225 -> 39;
                        case 226 -> 227;
                        case 227 -> 131;
                        case 228 -> 170;
                        case 229 -> 243;
                        case 230 -> 121;
                        case 231 -> 101;
                        case 232 -> 152;
                        case 233 -> 44;
                        case 234 -> 119;
                        case 235 -> 244;
                        case 236 -> 230;
                        case 237 -> 229;
                        case 238 -> 63;
                        case 239 -> 206;
                        case 240 -> 118;
                        case 241 -> 212;
                        case 242 -> 176;
                        case 243 -> 27;
                        case 244 -> 242;
                        case 245 -> 253;
                        case 246 -> 78;
                        case 247 -> 241;
                        case 248 -> 135;
                        case 249 -> 107;
                        case 250 -> 6;
                        case 251 -> 54;
                        case 252 -> 214;
                        case 253 -> 226;
                        case 254 -> 84;
                        default -> 25;
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
      var10001 = -11482;
      var10002 = 10875;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10000,
         "Crimson mining path",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         15000L,
         0L,
         null,
         false,
         false,
         (kotlin.jvm.functions.Function1)(IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl::d),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = 30077;
                  short var10005 = 12561;
                  var10005 = 30076;
                  short var10006 = 13207;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = 30078;
                  short var10002 = 9333;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "U¼õ\u0011Aì\u0002t5\u008b>î÷\u0084{ë¢bCE ZÌ¹\u009fñÐc©ý\u0007\u0094úl[lßÕX\"ÅåB\u00875÷\u009a\u0094VÌUe\t\u0090ï\u0017\"X\u009d\f\u000eÎÄ#\u0007<f\u001f\u0083g¯V\tè8Ó¦¥ïHß55\u0086\\ëÓzâ\u0000Øú¡\"\u0016x\f/^Þ7ÜÿÔ^EÕq\u0019¶íwbÕ\u0095\u0098\u000fÝädq\u0010\u008b\u0012tYÑ\u00adÅ{\u0092\u0086'Õ|%¿ýrÄ\u0083\u0087\u0002ò'";
                  int var4 = "U¼õ\u0011Aì\u0002t5\u008b>î÷\u0084{ë¢bCE ZÌ¹\u009fñÐc©ý\u0007\u0094úl[lßÕX\"ÅåB\u00875÷\u009a\u0094VÌUe\t\u0090ï\u0017\"X\u009d\f\u000eÎÄ#\u0007<f\u001f\u0083g¯V\tè8Ó¦¥ïHß55\u0086\\ëÓzâ\u0000Øú¡\"\u0016x\f/^Þ7ÜÿÔ^EÕq\u0019¶íwbÕ\u0095\u0098\u000fÝädq\u0010\u008b\u0012tYÑ\u00adÅ{\u0092\u0086'Õ|%¿ýrÄ\u0083\u0087\u0002ò'"
                     .length();
                  char var1 = '{';
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 126;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 126;
                           var10006 = var6;
                        } else {
                           var13 = 126;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 126;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 69;
                              case 1 -> 1;
                              case 2 -> 77;
                              case 3 -> 62;
                              case 4 -> 40;
                              case 5 -> 53;
                              default -> 60;
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
                  int var2 = (var0 ^ 30076) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 8;
                        case 1 -> 26;
                        case 2 -> 41;
                        case 3 -> 76;
                        case 4 -> 192;
                        case 5 -> 118;
                        case 6 -> 141;
                        case 7 -> 190;
                        case 8 -> 198;
                        case 9 -> 19;
                        case 10 -> 105;
                        case 11 -> 43;
                        case 12 -> 10;
                        case 13 -> 150;
                        case 14 -> 62;
                        case 15 -> 218;
                        case 16 -> 42;
                        case 17 -> 99;
                        case 18 -> 135;
                        case 19 -> 93;
                        case 20 -> 222;
                        case 21 -> 229;
                        case 22 -> 27;
                        case 23 -> 238;
                        case 24 -> 124;
                        case 25 -> 239;
                        case 26 -> 253;
                        case 27 -> 52;
                        case 28 -> 74;
                        case 29 -> 59;
                        case 30 -> 142;
                        case 31 -> 181;
                        case 32 -> 92;
                        case 33 -> 147;
                        case 34 -> 1;
                        case 35 -> 203;
                        case 36 -> 230;
                        case 37 -> 172;
                        case 38 -> 72;
                        case 39 -> 140;
                        case 40 -> 127;
                        case 41 -> 117;
                        case 42 -> 107;
                        case 43 -> 161;
                        case 44 -> 58;
                        case 45 -> 94;
                        case 46 -> 103;
                        case 47 -> 28;
                        case 48 -> 169;
                        case 49 -> 82;
                        case 50 -> 214;
                        case 51 -> 115;
                        case 52 -> 121;
                        case 53 -> 136;
                        case 54 -> 139;
                        case 55 -> 87;
                        case 56 -> 152;
                        case 57 -> 210;
                        case 58 -> 129;
                        case 59 -> 57;
                        case 60 -> 207;
                        case 61 -> 184;
                        case 62 -> 250;
                        case 63 -> 100;
                        case 64 -> 132;
                        case 65 -> 201;
                        case 66 -> 86;
                        case 67 -> 173;
                        case 68 -> 187;
                        case 69 -> 167;
                        case 70 -> 251;
                        case 71 -> 226;
                        case 72 -> 56;
                        case 73 -> 32;
                        case 74 -> 148;
                        case 75 -> 211;
                        case 76 -> 49;
                        case 77 -> 202;
                        case 78 -> 15;
                        case 79 -> 234;
                        case 80 -> 131;
                        case 81 -> 79;
                        case 82 -> 217;
                        case 83 -> 65;
                        case 84 -> 183;
                        case 85 -> 194;
                        case 86 -> 102;
                        case 87 -> 245;
                        case 88 -> 91;
                        case 89 -> 157;
                        case 90 -> 71;
                        case 91 -> 216;
                        case 92 -> 37;
                        case 93 -> 205;
                        case 94 -> 128;
                        case 95 -> 0;
                        case 96 -> 96;
                        case 97 -> 97;
                        case 98 -> 66;
                        case 99 -> 174;
                        case 100 -> 34;
                        case 101 -> 162;
                        case 102 -> 61;
                        case 103 -> 119;
                        case 104 -> 109;
                        case 105 -> 44;
                        case 106 -> 63;
                        case 107 -> 47;
                        case 108 -> 186;
                        case 109 -> 81;
                        case 110 -> 145;
                        case 111 -> 130;
                        case 112 -> 23;
                        case 113 -> 255;
                        case 114 -> 215;
                        case 115 -> 221;
                        case 116 -> 46;
                        case 117 -> 25;
                        case 118 -> 249;
                        case 119 -> 153;
                        case 120 -> 213;
                        case 121 -> 224;
                        case 122 -> 155;
                        case 123 -> 247;
                        case 124 -> 176;
                        case 125 -> 90;
                        case 126 -> 54;
                        case 127 -> 114;
                        case 128 -> 108;
                        case 129 -> 39;
                        case 130 -> 133;
                        case 131 -> 204;
                        case 132 -> 48;
                        case 133 -> 75;
                        case 134 -> 182;
                        case 135 -> 243;
                        case 136 -> 36;
                        case 137 -> 51;
                        case 138 -> 160;
                        case 139 -> 165;
                        case 140 -> 84;
                        case 141 -> 55;
                        case 142 -> 159;
                        case 143 -> 35;
                        case 144 -> 212;
                        case 145 -> 68;
                        case 146 -> 12;
                        case 147 -> 233;
                        case 148 -> 83;
                        case 149 -> 106;
                        case 150 -> 113;
                        case 151 -> 178;
                        case 152 -> 7;
                        case 153 -> 78;
                        case 154 -> 185;
                        case 155 -> 110;
                        case 156 -> 156;
                        case 157 -> 116;
                        case 158 -> 191;
                        case 159 -> 227;
                        case 160 -> 80;
                        case 161 -> 163;
                        case 162 -> 197;
                        case 163 -> 137;
                        case 164 -> 5;
                        case 165 -> 95;
                        case 166 -> 177;
                        case 167 -> 73;
                        case 168 -> 242;
                        case 169 -> 64;
                        case 170 -> 149;
                        case 171 -> 196;
                        case 172 -> 175;
                        case 173 -> 14;
                        case 174 -> 223;
                        case 175 -> 9;
                        case 176 -> 168;
                        case 177 -> 122;
                        case 178 -> 126;
                        case 179 -> 225;
                        case 180 -> 53;
                        case 181 -> 200;
                        case 182 -> 98;
                        case 183 -> 180;
                        case 184 -> 195;
                        case 185 -> 40;
                        case 186 -> 219;
                        case 187 -> 206;
                        case 188 -> 179;
                        case 189 -> 248;
                        case 190 -> 50;
                        case 191 -> 246;
                        case 192 -> 6;
                        case 193 -> 101;
                        case 194 -> 17;
                        case 195 -> 154;
                        case 196 -> 164;
                        case 197 -> 38;
                        case 198 -> 220;
                        case 199 -> 189;
                        case 200 -> 228;
                        case 201 -> 188;
                        case 202 -> 144;
                        case 203 -> 254;
                        case 204 -> 237;
                        case 205 -> 67;
                        case 206 -> 193;
                        case 207 -> 69;
                        case 208 -> 171;
                        case 209 -> 252;
                        case 210 -> 88;
                        case 211 -> 123;
                        case 212 -> 125;
                        case 213 -> 22;
                        case 214 -> 2;
                        case 215 -> 236;
                        case 216 -> 16;
                        case 217 -> 30;
                        case 218 -> 231;
                        case 219 -> 143;
                        case 220 -> 24;
                        case 221 -> 209;
                        case 222 -> 29;
                        case 223 -> 20;
                        case 224 -> 111;
                        case 225 -> 166;
                        case 226 -> 18;
                        case 227 -> 240;
                        case 228 -> 70;
                        case 229 -> 151;
                        case 230 -> 21;
                        case 231 -> 45;
                        case 232 -> 33;
                        case 233 -> 244;
                        case 234 -> 77;
                        case 235 -> 241;
                        case 236 -> 170;
                        case 237 -> 85;
                        case 238 -> 3;
                        case 239 -> 199;
                        case 240 -> 120;
                        case 241 -> 104;
                        case 242 -> 158;
                        case 243 -> 4;
                        case 244 -> 134;
                        case 245 -> 89;
                        case 246 -> 112;
                        case 247 -> 11;
                        case 248 -> 235;
                        case 249 -> 232;
                        case 250 -> 138;
                        case 251 -> 208;
                        case 252 -> 31;
                        case 253 -> 60;
                        case 254 -> 13;
                        default -> 146;
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
      var10001 = -11462;
      var10002 = 10474;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10000,
         "Crimson mining block progress",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         20000L,
         0L,
         null,
         false,
         false,
         (kotlin.jvm.functions.Function1)(IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl::bv),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = -22097;
                  short var10005 = 16807;
                  var10005 = -22098;
                  short var10006 = 7031;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = -22100;
                  short var10002 = -4643;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "\u001cæâ~>\u008fLA2\u0013ú`áôà+ï^wL\u0087\"æ\u0088þJrµ¤é\u00982\u009467~\u009c©\u00140Â\u0006û5<\u0085&T`\u008d]s,ÏÅ]>ß Ø$Ú øUy\b*À`\u009ex\u0011\t¦aÔªo\u0097ëS=ë\u0004\u0088æ2Ù\u0087\u001eS·)ð\u0084^\u0011M×kÙéú=ÙwÜi\u009emÓ+\u008f\u0082÷p¾ªQv\u0088O\u0012×+\u009bÇ\u0011¸©§\u008eÏmû\u0013\u0087¾E$\u0093\u0002ÿð";
                  int var4 = "\u001cæâ~>\u008fLA2\u0013ú`áôà+ï^wL\u0087\"æ\u0088þJrµ¤é\u00982\u009467~\u009c©\u00140Â\u0006û5<\u0085&T`\u008d]s,ÏÅ]>ß Ø$Ú øUy\b*À`\u009ex\u0011\t¦aÔªo\u0097ëS=ë\u0004\u0088æ2Ù\u0087\u001eS·)ð\u0084^\u0011M×kÙéú=ÙwÜi\u009emÓ+\u008f\u0082÷p¾ªQv\u0088O\u0012×+\u009bÇ\u0011¸©§\u008eÏmû\u0013\u0087¾E$\u0093\u0002ÿð"
                     .length();
                  char var1 = '{';
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 123;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 123;
                           var10006 = var6;
                        } else {
                           var13 = 123;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 123;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 89;
                              case 1 -> 6;
                              case 2 -> 85;
                              case 3 -> 95;
                              case 4 -> 19;
                              case 5 -> 50;
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
                  int var2 = (var0 ^ -22098) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 18;
                        case 1 -> 13;
                        case 2 -> 109;
                        case 3 -> 19;
                        case 4 -> 250;
                        case 5 -> 235;
                        case 6 -> 225;
                        case 7 -> 251;
                        case 8 -> 148;
                        case 9 -> 66;
                        case 10 -> 37;
                        case 11 -> 179;
                        case 12 -> 108;
                        case 13 -> 87;
                        case 14 -> 202;
                        case 15 -> 3;
                        case 16 -> 55;
                        case 17 -> 110;
                        case 18 -> 242;
                        case 19 -> 219;
                        case 20 -> 118;
                        case 21 -> 182;
                        case 22 -> 241;
                        case 23 -> 208;
                        case 24 -> 166;
                        case 25 -> 158;
                        case 26 -> 252;
                        case 27 -> 226;
                        case 28 -> 165;
                        case 29 -> 246;
                        case 30 -> 5;
                        case 31 -> 0;
                        case 32 -> 188;
                        case 33 -> 2;
                        case 34 -> 52;
                        case 35 -> 218;
                        case 36 -> 214;
                        case 37 -> 125;
                        case 38 -> 163;
                        case 39 -> 200;
                        case 40 -> 198;
                        case 41 -> 6;
                        case 42 -> 144;
                        case 43 -> 173;
                        case 44 -> 161;
                        case 45 -> 101;
                        case 46 -> 139;
                        case 47 -> 117;
                        case 48 -> 59;
                        case 49 -> 249;
                        case 50 -> 103;
                        case 51 -> 159;
                        case 52 -> 72;
                        case 53 -> 196;
                        case 54 -> 32;
                        case 55 -> 128;
                        case 56 -> 46;
                        case 57 -> 12;
                        case 58 -> 119;
                        case 59 -> 35;
                        case 60 -> 127;
                        case 61 -> 30;
                        case 62 -> 33;
                        case 63 -> 40;
                        case 64 -> 45;
                        case 65 -> 64;
                        case 66 -> 120;
                        case 67 -> 57;
                        case 68 -> 23;
                        case 69 -> 116;
                        case 70 -> 177;
                        case 71 -> 58;
                        case 72 -> 90;
                        case 73 -> 20;
                        case 74 -> 141;
                        case 75 -> 169;
                        case 76 -> 31;
                        case 77 -> 130;
                        case 78 -> 231;
                        case 79 -> 151;
                        case 80 -> 217;
                        case 81 -> 41;
                        case 82 -> 124;
                        case 83 -> 193;
                        case 84 -> 212;
                        case 85 -> 15;
                        case 86 -> 61;
                        case 87 -> 99;
                        case 88 -> 36;
                        case 89 -> 135;
                        case 90 -> 114;
                        case 91 -> 162;
                        case 92 -> 140;
                        case 93 -> 236;
                        case 94 -> 160;
                        case 95 -> 191;
                        case 96 -> 43;
                        case 97 -> 97;
                        case 98 -> 69;
                        case 99 -> 227;
                        case 100 -> 248;
                        case 101 -> 229;
                        case 102 -> 115;
                        case 103 -> 223;
                        case 104 -> 122;
                        case 105 -> 11;
                        case 106 -> 145;
                        case 107 -> 47;
                        case 108 -> 247;
                        case 109 -> 172;
                        case 110 -> 138;
                        case 111 -> 154;
                        case 112 -> 93;
                        case 113 -> 228;
                        case 114 -> 63;
                        case 115 -> 180;
                        case 116 -> 155;
                        case 117 -> 95;
                        case 118 -> 42;
                        case 119 -> 168;
                        case 120 -> 201;
                        case 121 -> 157;
                        case 122 -> 207;
                        case 123 -> 60;
                        case 124 -> 86;
                        case 125 -> 132;
                        case 126 -> 4;
                        case 127 -> 178;
                        case 128 -> 102;
                        case 129 -> 170;
                        case 130 -> 206;
                        case 131 -> 255;
                        case 132 -> 107;
                        case 133 -> 76;
                        case 134 -> 51;
                        case 135 -> 195;
                        case 136 -> 175;
                        case 137 -> 164;
                        case 138 -> 28;
                        case 139 -> 98;
                        case 140 -> 186;
                        case 141 -> 92;
                        case 142 -> 34;
                        case 143 -> 203;
                        case 144 -> 216;
                        case 145 -> 16;
                        case 146 -> 230;
                        case 147 -> 50;
                        case 148 -> 113;
                        case 149 -> 233;
                        case 150 -> 237;
                        case 151 -> 143;
                        case 152 -> 62;
                        case 153 -> 189;
                        case 154 -> 205;
                        case 155 -> 221;
                        case 156 -> 220;
                        case 157 -> 9;
                        case 158 -> 14;
                        case 159 -> 68;
                        case 160 -> 126;
                        case 161 -> 187;
                        case 162 -> 17;
                        case 163 -> 150;
                        case 164 -> 84;
                        case 165 -> 106;
                        case 166 -> 254;
                        case 167 -> 147;
                        case 168 -> 73;
                        case 169 -> 129;
                        case 170 -> 83;
                        case 171 -> 22;
                        case 172 -> 96;
                        case 173 -> 204;
                        case 174 -> 49;
                        case 175 -> 156;
                        case 176 -> 8;
                        case 177 -> 85;
                        case 178 -> 146;
                        case 179 -> 190;
                        case 180 -> 25;
                        case 181 -> 44;
                        case 182 -> 24;
                        case 183 -> 78;
                        case 184 -> 136;
                        case 185 -> 104;
                        case 186 -> 211;
                        case 187 -> 71;
                        case 188 -> 53;
                        case 189 -> 240;
                        case 190 -> 75;
                        case 191 -> 112;
                        case 192 -> 149;
                        case 193 -> 153;
                        case 194 -> 70;
                        case 195 -> 133;
                        case 196 -> 137;
                        case 197 -> 194;
                        case 198 -> 197;
                        case 199 -> 152;
                        case 200 -> 38;
                        case 201 -> 7;
                        case 202 -> 88;
                        case 203 -> 174;
                        case 204 -> 134;
                        case 205 -> 77;
                        case 206 -> 21;
                        case 207 -> 94;
                        case 208 -> 176;
                        case 209 -> 82;
                        case 210 -> 232;
                        case 211 -> 253;
                        case 212 -> 91;
                        case 213 -> 239;
                        case 214 -> 209;
                        case 215 -> 234;
                        case 216 -> 171;
                        case 217 -> 54;
                        case 218 -> 213;
                        case 219 -> 1;
                        case 220 -> 199;
                        case 221 -> 48;
                        case 222 -> 56;
                        case 223 -> 67;
                        case 224 -> 192;
                        case 225 -> 222;
                        case 226 -> 215;
                        case 227 -> 210;
                        case 228 -> 238;
                        case 229 -> 142;
                        case 230 -> 105;
                        case 231 -> 224;
                        case 232 -> 245;
                        case 233 -> 183;
                        case 234 -> 185;
                        case 235 -> 131;
                        case 236 -> 121;
                        case 237 -> 244;
                        case 238 -> 81;
                        case 239 -> 39;
                        case 240 -> 243;
                        case 241 -> 111;
                        case 242 -> 181;
                        case 243 -> 26;
                        case 244 -> 29;
                        case 245 -> 10;
                        case 246 -> 100;
                        case 247 -> 80;
                        case 248 -> 65;
                        case 249 -> 167;
                        case 250 -> 27;
                        case 251 -> 89;
                        case 252 -> 79;
                        case 253 -> 184;
                        case 254 -> 74;
                        default -> 123;
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
      Object var14 = null; // PX-FIX
      Object IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll = null; // PX-FIX
      int var1 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      int var10000 = ((this.G()) ? 1 : 0);
      if (var1 == 0) {
         if (var10000 == 0) {
            return;
         }

         var10000 = ((me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m()) ? 1 : 0);
      }

      if (var1 == 0) {
         if (var10000 == 0) {
            return;
         }

         var10000 = ((int[])IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl)[this.W()
            .ordinal()];
      }

      label187: {
         label176: {
            if (var1 == 0) {
               switch (var10000) {
                  case 1:
                     var10000 = ((this.aK()) ? 1 : 0);
                     break;
                  case 2:
                     break label176;
                  case 3:
                     break label187;
                  default:
                     return;
               }
            }

            label151: {
               label150: {
                  label149: {
                     if (var1 == 0) {
                        if (var10000 == 0) {
                           return;
                        }

                        var14 = this;
                        if (var1 != 0) {
                           break label149;
                        }

                        var10000 = ((int[])IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)[this.aJ()
                           .a()
                           .ordinal()];
                     }

                     switch (var10000) {
                        case 1:
                           var14 = this;
                           break;
                        case 2:
                           break label150;
                        default:
                           break label151;
                     }
                  }

                  this.a(
                     IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI,
                     5000
                  );
                  if (var1 == 0) {
                     return;
                  }
               }

               me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(3000L, null);
            }

            if (var1 == 0) {
               return;
            }
         }

         IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl var15 = this;
         if (var1 == 0) {
            if (this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI
               == IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               )
             {
               Object var16 = this;
               if (var1 == 0) {
                  if (this.a9() > CollectionsKt.getLastIndex(this.ac())) {
                     IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl var21 = this;
                     if (var1 == 0) {
                        if (this.a_()) {
                           short var22 = -11461;
                           short var23 = -31860;
                           this.a(
                              "Player on route, swapping lobbies",
                              me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                           );
                           this.a(
                              IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
                              5000
                           );
                           return;
                        }

                        var21 = this;
                     }

                     var21.bq();
                     return;
                  }

                  var16 = this.ac().get(this.a9());
                  short var10002 = -11470;
                  short var10003 = -12954;
                  Intrinsics.checkNotNullExpressionValue(var16, "get(...)");
               }

               label180: {
                  IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var2;
                  label181: {
                     var2 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var16;
                     var10000 = ((int[])IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII)[var2.b()
                        .ordinal()];
                     if (var1 == 0) {
                        switch (var10000) {
                           case 1:
                              var10000 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a(this, var2, 0.0, null);
                              break;
                           case 2:
                              break label181;
                           default:
                              break label180;
                        }
                     }

                     if (var1 == 0) {
                        if (var10000 != 0) {
                           int var5 = this.a9();
                           this.a(var5 + 1);
                           IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                              .e()
                              .k();
                           if (var1 == 0) {
                              return;
                           }
                        }

                        var10000 = ((IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                           .e()
                           .d()) ? 1 : 0);
                     }

                     if (var1 == 0) {
                        if (var10000 == 0) {
                           return;
                        }

                        IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                           ((net.minecraft.core.BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                              .e())),
                           var2.a(),
                           null,
                           false);
                     }

                     if (var1 == 0) {
                        return;
                     }
                  }

                  var10000 = (llIlIlIIlIIlIlIllIIIIIIIIlIIIIlIIlIIllllllIIIllIIllllIlIlllIIIIllIIIIlllllIlIIllllIIl.a(
                     IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                        .f(),
                     var2.a(),
                     null,
                     2,
                     null
                  ) ? 1 : 0);
                  if (var1 == 0) {
                     if (var10000 == 0) {
                        return;
                     }

                     var10000 = this.a9();
                  }

                  int var13 = var10000;
                  this.a(var13 + 1);
               }

               if (var1 == 0) {
                  return;
               }
            }

            var15 = this;
         }

         var15.a(
            IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
         );
         if (var1 == 0) {
            return;
         }
      }

      IlIIlIIIIllIlIIIllllIIlIIIIIIlIlIIlIllIIIIIIllllllllIlIlIllIIIIIIIIIlIIIlIIlIIlIlIIII var19 = lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
      if (var1 == 0) {
         if (!lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.a()) {
            IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
               .e()
               .k();
            Iterable var3 = this.ac();
            boolean var4 = false;
            var var6 = new ArrayList();
            boolean var7 = false;

            for (Object var9 : var3) {
               IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var10 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var9;
               boolean var11 = false;
               if (var1 != 0) {
                  return;
               }

               if (var10.b()
                  == IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                  )
                {
                  var6.add(var9);
                  if (var1 != 0) {
                     break;
                  }
               }
            }

            List var12 = var6;
            if (var1 == 0) {
               if (var12.isEmpty()) {
                  short var20 = -11481;
                  short var10001 = 7818;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                     "§cNo MINE waypoints found in route!"
                  );
                  this.N();
                  return;
               }

               lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.b(
                  IIlIIIllIIIllIlIIlIllIlIllIIlIIIIIllllIlIIIlIlIlIIIIIlIIlIlIllIIlllIIIllllIIllIlIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .e()
                     .al()
               );
               lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.c(
                  IIlIIIllIIIllIlIIlIllIlIllIIlIIIIIllllIlIIIlIlIlIIIIIlIIlIlIllIIlllIIIllllIIllIlIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .c()
                     .al()
               );
               lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.d(
                  IIlIIIllIIIllIlIIlIllIlIllIIlIIIIIllllIlIIIlIlIlIIIIIlIIlIlIllIIlllIIIllllIIllIlIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .d()
                     .al()
               );
               lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.a(
                  var12, this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl
               );
            }

            if (var1 == 0) {
               return;
            }
         }

         var19 = lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
      }

      var19.g();
   }

   private final void bp() {
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .e()
         .k();
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
      );
      this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      this.a(this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll);
      this.a(0);
   }

   private final void bq() {
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .e()
         .k();
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
      );
      this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      this.a(this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll);
      this.a(0);
   }

   private final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      this.ae()
         .a(
            new lllIllIIllIIIIIIIlIIlIIIIIllllIlIIIIIllllIIlIIIIlllIIIIIIlIIIIlIlIIIIllIIllIIlllIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI,
               (kotlin.jvm.functions.Function1)(IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl::f),
               var1.d(),
               0,
               0,
               0L,
               0,
               (kotlin.jvm.functions.Function1)(IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl::g),
               120,
               null
            )
         );
   }

   private final void br() {
      int var1 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      if (var1 == 0) {
         if (lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.a()) {
            lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.k();
         }

         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .p();
         short var10001 = -11460;
         short var10002 = 18968;
         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a("attack", false);
      }
   }

   @Override
   public void ba() {
      Object var10000 = null; // PX-FIX
      int var1 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
         == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI
         )
       {
         boolean var9;
         label94: {
            var var2 = this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
            boolean var3 = false;
            var10000 = var2;
            label86:
            if (var1 == 0) {
               if (var2 instanceof Collection) {
                  var10000 = var2;
                  if (var1 != 0) {
                     break label86;
                  }

                  if (((me.octo.client.PXDyn)var10000).isEmpty()) {
                     var9 = false;
                     break label94;
                  }
               }

               var10000 = var2;
            }

            Iterator var4 = ((me.octo.client.PXDyn)var10000).iterator();

            label65:
            while (true) {
               if (var4.hasNext()) {
                  Object var5 = var4.next();
                  IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var6 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var5;
                  boolean var7 = false;
                  var9 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a(this, var6, 2.0, null);

                  while (true) {
                     if (!var9) {
                        continue label65;
                     }

                     var9 = true;
                     if (var1 == 0) {
                        break label65;
                     }
                  }
               }

               var9 = false;
               break;
            }
         }

         if (var9) {
            this.a(
               IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
            );
            return;
         }

         var9 = this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll.isEmpty();
         if (var1 == 0) {
            var9 = !var9;
         }

         label76: {
            if (var9) {
               var9 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a(
                  this,
                  (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)CollectionsKt.last(
                     this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll
                  ),
                  0.0);
               if (var1 != 0) {
                  break label76;
               }

               if (var9) {
                  IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                     ((net.minecraft.core.BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                        .e())),
                     ((IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)CollectionsKt.last(
                           this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll
                        ))
                        .a(),
                     null,
                     false);
                  this.a(
                     IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
                  );
                  return;
               }
            }

            var9 = this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll.isEmpty();
         }

         if (var1 == 0) {
            var9 = !var9;
         }

         if (var9) {
            int var8 = this.b(this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll);
            if (var1 == 0) {
               if (var8 >= 0) {
                  this.bp();
                  this.a(var8);
                  if (var1 == 0) {
                     return;
                  }
               }

               this.bp();
            }

            return;
         }

         this.a(
            IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
         );
         if (var1 == 0) {
            return;
         }
      }

      this.a(
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI,
         5000
      );
   }

   @Override
   public void M() {
      Object var19 = null; // PX-FIX
      int var10000 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      this.aM();
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = this.bs();
      int var1 = var10000;
      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = lllIlIIllIIllllllIlllllIIllllllIllIlllIIIIIlllIIllIlIIIIlIlIllIllIllIIIIllIIllIlllIII.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
         .a(0);
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = lllIlIIllIIllllllIlllllIIllllllIllIlllIIIIIlllIIllIlIIIIlIlIllIllIllIIIIllIIllIlllIII.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
         .a(1);
      boolean var2 = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl != null;
      short var18 = ((short)((this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll.isEmpty()) ? 1 : 0));
      if (var1 == 0) {
         var18 = (((short)((var18 == 0) ? 1 : 0)));
      }

      boolean var3;
      label155: {
         var3 = (var18 != 0);
         var var5 = this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
         boolean var6 = false;
         var19 = var5;
         label150:
         if (var1 == 0) {
            if (var5 instanceof Collection) {
               var19 = var5;
               if (var1 != 0) {
                  break label150;
               }

               if (((me.octo.client.PXDyn)var19).isEmpty()) {
                  var18 = (short)((0 != 0) ? 1 : 0);
                  break label155;
               }
            }

            var19 = var5;
         }

         Iterator var7 = ((me.octo.client.PXDyn)var19).iterator();

         label141:
         while (true) {
            if (!var7.hasNext()) {
               var18 = (short)((0 != 0) ? 1 : 0);
               break;
            }

            Object var8 = var7.next();
            IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var9 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var8;
            var18 = (short)((0 != 0) ? 1 : 0);

            while (
               var9.b()
                  == IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            ) {
               var18 = (short)((1 != 0) ? 1 : 0);
               if (var1 == 0) {
                  break label141;
               }
            }
         }
      }

      boolean var4;
      var4 =( var18 != 0);
      var18 = ((short)((IIlIIIllIIIllIlIIlIllIlIllIIlIIIIIllllIlIIIlIlIlIIIIIlIIlIlIllIIlllIIIllllIIllIlIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .c()
         .al()) ? 1 : 0));
      label129:
      if (var1 == 0) {
         if ((var18 != 0)) {
            short var10001 = -11469;
            short var10002 = 5387;
            if (me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a("Rogue Sword")
               == null) {
               var18 = (short)((0 != 0) ? 1 : 0);
               break label129;
            }
         }

         var18 = (short)((1 != 0) ? 1 : 0);
      }

      boolean var12;
      var12 =( var18 != 0);
      var18 = ((short)((IIlIIIllIIIllIlIIlIllIlIllIIlIIIIIllllIlIIIlIlIlIIIIIlIIlIlIllIIlllIIIllllIIllIlIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .d()
         .al()) ? 1 : 0));
      label123:
      if (var1 == 0) {
         if ((var18 != 0)) {
            me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var24 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            String[] var14 = new String[2];
            short var10003 = -11486;
            short var10004 = 28104;
            var14[0] = "Weird Tuba";
            var10003 = -11466;
            var10004 = 16539;
            var14[1] = "Weirder Tuba";
            if (var24.b(CollectionsKt.listOf(var14)) == null) {
               var18 = (short)((0 != 0) ? 1 : 0);
               break label123;
            }
         }

         var18 = (short)((1 != 0) ? 1 : 0);
      }

      boolean var13;
      var13 =( var18 != 0);
      var18 =((short)(( var2) ? 1 : 0));
      label117:
      if (var1 == 0) {
         if (var2) {
            var18 =((short)(( var3) ? 1 : 0));
            if (var1 != 0) {
               break label117;
            }

            if (var3) {
               var18 =((short)(( var4) ? 1 : 0));
               if (var1 != 0) {
                  break label117;
               }

               if (var4) {
                  var18 =((short)(( var12) ? 1 : 0));
                  if (var1 != 0) {
                     break label117;
                  }

                  if (var12) {
                     var18 =((short)(( var13) ? 1 : 0));
                     if (var1 != 0) {
                        break label117;
                     }

                     if (var13) {
                        ArrayList var15 = new ArrayList();
                        boolean var17 = false;
                        var15.addAll(this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll);
                        var15.addAll(this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll);
                        this.a((java.util.ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll>)var15);
                        llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI[] var16 = new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI[]{
                           new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
                              llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                              null,
                              true
                           ),
                           new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
                              llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                              IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl::bw,
                              false
                           ),
                           new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
                              llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
                              IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl::bx,
                              false
                           )
                        };
                        this.a(CollectionsKt.listOf(var16));
                        super.M();
                        this.ba();
                        return;
                     }
                  }
               }
            }
         }

         var18 =((short)(( var2) ? 1 : 0));
      }

      if (var1 == 0) {
         if ((var18 == 0)) {
            me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII var26 = me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            String var38 = this.aj();
            short var43 = -11483;
            short var48 = 14992;
            var26.b(
               5000L,
               var38,
               "No shovel found in hotbar!",
               me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            );
            var18 = -11476;
            short var34 = 794;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "§cPlease put a shovel in your hotbar"
            );
         }

         var18 =((short)(( var12) ? 1 : 0));
      }

      if (var1 == 0) {
         if ((var18 == 0)) {
            me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII var28 = me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            String var39 = this.aj();
            short var44 = -11464;
            short var49 = -30060;
            var28.b(
               5000L,
               var39,
               "No Rogue Sword found in hotbar!",
               me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            );
            var18 = -11473;
            short var35 = 26051;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "§cPlease put a Rogue Sword in your hotbar or disable the setting"
            );
         }

         var18 =((short)(( var13) ? 1 : 0));
      }

      if (var1 == 0) {
         if ((var18 == 0)) {
            me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII var30 = me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            String var40 = this.aj();
            short var45 = -11487;
            short var50 = -17157;
            var30.b(
               5000L,
               var40,
               "No Weird/Weirder Tuba found in hotbar!",
               me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            );
            var18 = -11468;
            short var36 = 14374;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "§cPlease put a Weird/Weirder Tuba in your hotbar or disable the setting"
            );
         }

         var18 =((short)(( var3) ? 1 : 0));
      }

      if (var1 == 0) {
         if ((var18 == 0)) {
            lllIlIIllIIllllllIlllllIIllllllIllIlllIIIIIlllIIllIlIIIIlIlIllIllIllIIIIllIIllIlllIII.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
               .c(1);
         }

         var18 =((short)(( var4) ? 1 : 0));
      }

      label95: {
         if (var1 == 0) {
            if ((var18 != 0)) {
               break label95;
            }

            var18 =((short)(( var3) ? 1 : 0));
         }

         if ((var18 != 0)) {
            var18 = -11488;
            short var37 = 18686;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "§cmine_route must have MINE waypoints!"
            );
            me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII var33 = me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            String var41 = this.aj();
            short var46 = -11484;
            short var51 = 13252;
            var33.b(
               5000L,
               var41,
               "No MINE waypoints in mine_route",
               me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            );
         }
      }

      this.N();
   }

   @Override
   public void N() {
      this.br();
      super.N();
   }

   @Override
   public void aN() {
      this.br();
      super.aN();
   }

   @SubscribeEvent(
      priority = EventPriority.HIGH
   )
   public final void a(@NotNull me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var1) {
      int var10000 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      short var10002 = -11472;
      short var10003 = -9778;
      Intrinsics.checkNotNullParameter(var1, "event");
      int var2 = var10000;
      boolean var3 = this.G();
      if (var2 == 0) {
         if (!var3) {
            return;
         }

         var3 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
            .a(
               IIlIIIllIIIllIlIIlIllIlIllIIlIIIIIllllIlIIIlIlIlIIIIIlIIlIlIllIIlllIIIllllIIllIlIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .f()
                  .al()
            );
      }

      if (var2 == 0) {
         if (!var3) {
            return;
         }

         var3 = lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.a();
      }

      if (var3) {
         lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
            .a(
               var1.k(),
               lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.l(),
               lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.n()
            );
         lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
            .a(
               this.ac(),
               lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.m(),
               IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            );
      }
   }

   @Override
   public boolean af() {
      return this.W()
         == IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   private final me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll bs() {
      int var1 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      if (var1 == 0) {
         LocalPlayer var10000 = this.ap().player;
         if (var10000 != null) {
            Inventory var6 = var10000.getInventory();
            if (var6 != null) {
               Inventory var2 = var6;
               int var3 = 0;

               while (var3 < 9) {
                  ItemStack var7 = var2.getItem(var3);
                  short var10002 = -11467;
                  short var10003 = 26524;
                  Intrinsics.checkNotNullExpressionValue(var7, "getItem(...)");
                  ItemStack var4 = var7;
                  label28:
                  if (var1 == 0) {
                     if (!var4.isEmpty()) {
                        String var8 = var4.getHoverName().getString();
                        var10002 = -11465;
                        var10003 = -15027;
                        Intrinsics.checkNotNullExpressionValue(var8, "getString(...)");
                        String var9 = var8.toLowerCase(Locale.ROOT);
                        var10002 = -11459;
                        var10003 = 14632;
                        Intrinsics.checkNotNullExpressionValue(var9, "toLowerCase(...)");
                        String var5 = var9;
                        if (var1 != 0) {
                           break label28;
                        }

                        CharSequence var10 = var5;
                        short var10001 = -11474;
                        var10002 = 6093;
                        if (StringsKt.contains(var10, "shovel", false)) {
                           return new me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                              var4,
                              var3,
                              me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                           );
                        }
                     }

                     var3++;
                  }

                  if (var1 != 0) {
                     break;
                  }
               }

               return null;
            }
         }
      }

      return null;
   }

   private static final long a(IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl var0) {
      return var0.aJ().b() + 15000L;
   }

   private static final Object b(IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl var0) {
      return TuplesKt.to(
         var0.aJ().a(),
         IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
      );
   }

   private static final Object c(IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl var0) {
      return new IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         var0.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI,
         var0.a9(),
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(var0, 0.0, 1, null)
      );
   }

   private static final boolean bt() {
      return lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.a();
   }

   private static final Object d(IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl var0) {
      return new IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.n(),
         lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.m(),
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(var0, 0.0, 1, null)
      );
   }

   private static final boolean bu() {
      return lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.a();
   }

   private static final Object bv() {
      return me.octo.client.utils.IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .w()
         + me.octo.client.utils.IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .x();
   }

   private static final Unit e(IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl var0) {
      if (var0.G()
         && IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g()
            == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI
         )
       {
         var0.ba();
      }

      return Unit.INSTANCE;
   }

   private static final Unit f(IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl var0) {
      var0.ba();
      return Unit.INSTANCE;
   }

   private static final Unit g(IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl var0) {
      var0.br();
      return Unit.INSTANCE;
   }

   private static final boolean h(IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl var0) {
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

   private static final boolean bw() {
      return IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .e();
   }

   private static final boolean bx() {
      return IlllIIIIlIlllIlllllIlIlIIllIlllIlIIllllllIlllllIllIllllIllIIIllIIlIlIlllIIlIllIIlIlll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .a();
   }

   @NotNull
   public static final IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl by() {
      return IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll.a();
   }

   @NotNull
   public static final IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl bz() {
      return llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
   }

   @NotNull
   public static final IlIIlIIIIllIlIIIllllIIlIIIIIIlIlIIlIllIIIIIIllllllllIlIlIllIIIIIIIIIlIIIlIIlIIlIlIIII bA() {
      return lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
   }

   public static final void a(IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl var0, me.octo.client.IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      var0.a(var1);
   }


   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[27];
      int var3 = 0;
      String var2 = "0¤¶.É,I*®ph\u008b\u000e>¿\\l:v>Ú\u000b´ÅªÍ}G7\n\u0081#0TVä\u0018AS\u001d!Òf¯é ¹\u0094Îk\u0099Ý\u0089¤Øä´\u001b£Þñeð \u0095ªøI_8ù£J\u0095í^:Þþ\u001d\u0086ÑûõFpçÎ~%º§\u0002Ñ(¸&i¡\ff$W\u0005[\u0015\u0016\u0005ÃÇ¼\u0005\b}í4]m\u0018\u0082\u0087\u000b\u0006:Û±ª}%º\u001dØD\u0005\u0088\u008bÙ¦¹\fm§\u008b¤y\u008b¶\u0095Ó\u0081ww\u0014\u000eøçOôö\u0007:án·ß\u008b2´o·kö½\u0015JÒo\nå^%/\u0085Ì\u001f\u008b\u009e¸\u0016\u0007ðzk×S\u00066v\u009bTÕ\u001c\u0010_^9'ª³Tº8k.g\u0092\u0005Ñ\u008d\u001d\u008fó×.òÚÇ¿ÙÞ\u0094Éïð8\u0018+CØ1Þ\u0016b·\u00169\u009c\u0082o!çË£àc\u0088o\u0004HFÙ¼Â\u008b H\u0099Ò_\u0096è©åA\u009e\u0094\u00843Ui\u0089g9\u001f:\u000e\u0084\u0010äÍ\u0081\u0011$ÜÖò\u0081Rj+b»\u009fx\u009aÈö\u0019\u0014W#à¹¯?=\tÛÏ[\u00162GA_¥qÎí\u001ax-!ÀÌäì\u009føÁ\\V\f\u008f´¼\u0018Á0ð-ä\u001dJÑU\tªc\u0084Aã¸:\u0017Û\u0018Z\bQk×`\\\u009e48\u0013çlÚÝS¤óp_'Döõ\u0017{öNÕÓ#Ë¨\u0000t\u0098ñ\u0094ÒX\u0099\u0090IBþ7'nÕ\"ÐÕ\u0017\u008ajïñÌ\u009e»íXõÂ°i\u001f\u0012©\u0081ûbe\u0083M\u0005\u0088A\u0013¡\u009f\u009e,g^§1z®í\u001f\u009d ¸5\u0018¿Ù\u001a\u0091mñ]MiP\u008c1\u001c ÷{ø\u0096s7%½ß\u0016¬Íjä\u001e\n\u001bÝÓ\u0001e\u008cú\u0086\f\u000e\u0014ó¦X\u0084\u0003\u008fù\u0015\u001e\u008blcð¥Û¢T\u001cC\u008d&äeÆËIè?àÓ1\u008d§Ûºl\u000bF]e^U¥ÝT×\u001fo®1\u007f¢ÓRÝLÍ¶\u0006&PEÉ|Gë¹\u001bË¸×üñU!ß©\u0092[^;\u0083£_ª8Zn\u008ch\u0091ÇFYÂöëÖ\u0006©\u0007#ò¼:";
      int var4 = "0¤¶.É,I*®ph\u008b\u000e>¿\\l:v>Ú\u000b´ÅªÍ}G7\n\u0081#0TVä\u0018AS\u001d!Òf¯é ¹\u0094Îk\u0099Ý\u0089¤Øä´\u001b£Þñeð \u0095ªøI_8ù£J\u0095í^:Þþ\u001d\u0086ÑûõFpçÎ~%º§\u0002Ñ(¸&i¡\ff$W\u0005[\u0015\u0016\u0005ÃÇ¼\u0005\b}í4]m\u0018\u0082\u0087\u000b\u0006:Û±ª}%º\u001dØD\u0005\u0088\u008bÙ¦¹\fm§\u008b¤y\u008b¶\u0095Ó\u0081ww\u0014\u000eøçOôö\u0007:án·ß\u008b2´o·kö½\u0015JÒo\nå^%/\u0085Ì\u001f\u008b\u009e¸\u0016\u0007ðzk×S\u00066v\u009bTÕ\u001c\u0010_^9'ª³Tº8k.g\u0092\u0005Ñ\u008d\u001d\u008fó×.òÚÇ¿ÙÞ\u0094Éïð8\u0018+CØ1Þ\u0016b·\u00169\u009c\u0082o!çË£àc\u0088o\u0004HFÙ¼Â\u008b H\u0099Ò_\u0096è©åA\u009e\u0094\u00843Ui\u0089g9\u001f:\u000e\u0084\u0010äÍ\u0081\u0011$ÜÖò\u0081Rj+b»\u009fx\u009aÈö\u0019\u0014W#à¹¯?=\tÛÏ[\u00162GA_¥qÎí\u001ax-!ÀÌäì\u009føÁ\\V\f\u008f´¼\u0018Á0ð-ä\u001dJÑU\tªc\u0084Aã¸:\u0017Û\u0018Z\bQk×`\\\u009e48\u0013çlÚÝS¤óp_'Döõ\u0017{öNÕÓ#Ë¨\u0000t\u0098ñ\u0094ÒX\u0099\u0090IBþ7'nÕ\"ÐÕ\u0017\u008ajïñÌ\u009e»íXõÂ°i\u001f\u0012©\u0081ûbe\u0083M\u0005\u0088A\u0013¡\u009f\u009e,g^§1z®í\u001f\u009d ¸5\u0018¿Ù\u001a\u0091mñ]MiP\u008c1\u001c ÷{ø\u0096s7%½ß\u0016¬Íjä\u001e\n\u001bÝÓ\u0001e\u008cú\u0086\f\u000e\u0014ó¦X\u0084\u0003\u008fù\u0015\u001e\u008blcð¥Û¢T\u001cC\u008d&äeÆËIè?àÓ1\u008d§Ûºl\u000bF]e^U¥ÝT×\u001fo®1\u007f¢ÓRÝLÍ¶\u0006&PEÉ|Gë¹\u001bË¸×üñU!ß©\u0092[^;\u0083£_ª8Zn\u008ch\u0091ÇFYÂöëÖ\u0006©\u0007#ò¼:"
         .length();
      char var1 = '\f';
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
                     case 0 -> 37;
                     case 1 -> 46;
                     case 2 -> 12;
                     case 3 -> 8;
                     case 4 -> 114;
                     case 5 -> 125;
                     default -> 104;
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
                     k = new String[27];
                     IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = new IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI((kotlin.jvm.internal.DefaultConstructorMarker) null);
                     llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl = new IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl();
                     lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = new IlIIlIIIIllIlIIIllllIIlIIIIIIlIlIIlIllIIIIIIllllllllIlIlIllIIIIIIIIIlIIIlIIlIIlIlIIII();
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

                  var2 = "Æ¯ôÜÕà¡9\u00ad±®HÕ3³Ý\u0012\u008eÁÄb\u000f»\u0098Ö\u0081=\u0010àÂéYj \u0017]\r\u0095\u000b]Æg\u0086\u001e]Ñ\u0092ZÖ9_C`¡»\n?_\u0089Èøq*\u0000$ä\u0012°k]\u0016°ç\u008fjê3]\\¢\u00117\u001a\u0081_E\u000f\u0084\u0084¾>gE\u0011÷YÿNäóÍ";
                  var4 = "Æ¯ôÜÕà¡9\u00ad±®HÕ3³Ý\u0012\u008eÁÄb\u000f»\u0098Ö\u0081=\u0010àÂéYj \u0017]\r\u0095\u000b]Æg\u0086\u001e]Ñ\u0092ZÖ9_C`¡»\n?_\u0089Èøq*\u0000$ä\u0012°k]\u0016°ç\u008fjê3]\\¢\u00117\u001a\u0081_E\u000f\u0084\u0084¾>gE\u0011÷YÿNäóÍ"
                     .length();
                  var1 = '@';
                  var8 = -1;
            }

            var10000 = 78;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String e(int var0, int var1) {
      int var2 = (var0 ^ -11466) & 65535;
      if (k[var2] == null) {
         char[] var3 = j[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 105;
            case 1 -> 77;
            case 2 -> 128;
            case 3 -> 101;
            case 4 -> 81;
            case 5 -> 51;
            case 6 -> 138;
            case 7 -> 60;
            case 8 -> 87;
            case 9 -> 178;
            case 10 -> 16;
            case 11 -> 218;
            case 12 -> 76;
            case 13 -> 169;
            case 14 -> 28;
            case 15 -> 145;
            case 16 -> 236;
            case 17 -> 0;
            case 18 -> 239;
            case 19 -> 140;
            case 20 -> 154;
            case 21 -> 253;
            case 22 -> 109;
            case 23 -> 158;
            case 24 -> 136;
            case 25 -> 137;
            case 26 -> 204;
            case 27 -> 67;
            case 28 -> 235;
            case 29 -> 221;
            case 30 -> 152;
            case 31 -> 133;
            case 32 -> 63;
            case 33 -> 11;
            case 34 -> 130;
            case 35 -> 168;
            case 36 -> 195;
            case 37 -> 30;
            case 38 -> 161;
            case 39 -> 159;
            case 40 -> 19;
            case 41 -> 9;
            case 42 -> 26;
            case 43 -> 33;
            case 44 -> 198;
            case 45 -> 55;
            case 46 -> 117;
            case 47 -> 82;
            case 48 -> 52;
            case 49 -> 124;
            case 50 -> 100;
            case 51 -> 246;
            case 52 -> 177;
            case 53 -> 194;
            case 54 -> 121;
            case 55 -> 129;
            case 56 -> 191;
            case 57 -> 232;
            case 58 -> 190;
            case 59 -> 134;
            case 60 -> 201;
            case 61 -> 141;
            case 62 -> 222;
            case 63 -> 31;
            case 64 -> 92;
            case 65 -> 68;
            case 66 -> 132;
            case 67 -> 120;
            case 68 -> 209;
            case 69 -> 162;
            case 70 -> 131;
            case 71 -> 71;
            case 72 -> 34;
            case 73 -> 199;
            case 74 -> 20;
            case 75 -> 48;
            case 76 -> 106;
            case 77 -> 197;
            case 78 -> 103;
            case 79 -> 203;
            case 80 -> 29;
            case 81 -> 149;
            case 82 -> 86;
            case 83 -> 12;
            case 84 -> 184;
            case 85 -> 14;
            case 86 -> 53;
            case 87 -> 226;
            case 88 -> 170;
            case 89 -> 230;
            case 90 -> 96;
            case 91 -> 127;
            case 92 -> 251;
            case 93 -> 5;
            case 94 -> 171;
            case 95 -> 21;
            case 96 -> 115;
            case 97 -> 181;
            case 98 -> 237;
            case 99 -> 248;
            case 100 -> 165;
            case 101 -> 45;
            case 102 -> 150;
            case 103 -> 214;
            case 104 -> 78;
            case 105 -> 50;
            case 106 -> 118;
            case 107 -> 255;
            case 108 -> 24;
            case 109 -> 108;
            case 110 -> 208;
            case 111 -> 79;
            case 112 -> 234;
            case 113 -> 72;
            case 114 -> 200;
            case 115 -> 135;
            case 116 -> 23;
            case 117 -> 176;
            case 118 -> 44;
            case 119 -> 116;
            case 120 -> 249;
            case 121 -> 252;
            case 122 -> 155;
            case 123 -> 229;
            case 124 -> 4;
            case 125 -> 3;
            case 126 -> 89;
            case 127 -> 196;
            case 128 -> 95;
            case 129 -> 43;
            case 130 -> 142;
            case 131 -> 151;
            case 132 -> 17;
            case 133 -> 220;
            case 134 -> 182;
            case 135 -> 123;
            case 136 -> 244;
            case 137 -> 80;
            case 138 -> 13;
            case 139 -> 94;
            case 140 -> 46;
            case 141 -> 10;
            case 142 -> 228;
            case 143 -> 242;
            case 144 -> 91;
            case 145 -> 175;
            case 146 -> 47;
            case 147 -> 167;
            case 148 -> 212;
            case 149 -> 247;
            case 150 -> 189;
            case 151 -> 163;
            case 152 -> 65;
            case 153 -> 219;
            case 154 -> 27;
            case 155 -> 2;
            case 156 -> 37;
            case 157 -> 56;
            case 158 -> 7;
            case 159 -> 38;
            case 160 -> 211;
            case 161 -> 146;
            case 162 -> 110;
            case 163 -> 8;
            case 164 -> 58;
            case 165 -> 183;
            case 166 -> 35;
            case 167 -> 73;
            case 168 -> 119;
            case 169 -> 241;
            case 170 -> 125;
            case 171 -> 90;
            case 172 -> 99;
            case 173 -> 185;
            case 174 -> 15;
            case 175 -> 6;
            case 176 -> 62;
            case 177 -> 157;
            case 178 -> 126;
            case 179 -> 49;
            case 180 -> 227;
            case 181 -> 104;
            case 182 -> 40;
            case 183 -> 206;
            case 184 -> 166;
            case 185 -> 113;
            case 186 -> 188;
            case 187 -> 1;
            case 188 -> 192;
            case 189 -> 57;
            case 190 -> 213;
            case 191 -> 153;
            case 192 -> 186;
            case 193 -> 74;
            case 194 -> 69;
            case 195 -> 216;
            case 196 -> 36;
            case 197 -> 93;
            case 198 -> 238;
            case 199 -> 84;
            case 200 -> 18;
            case 201 -> 243;
            case 202 -> 180;
            case 203 -> 111;
            case 204 -> 245;
            case 205 -> 240;
            case 206 -> 217;
            case 207 -> 207;
            case 208 -> 83;
            case 209 -> 59;
            case 210 -> 139;
            case 211 -> 107;
            case 212 -> 193;
            case 213 -> 112;
            case 214 -> 187;
            case 215 -> 39;
            case 216 -> 173;
            case 217 -> 174;
            case 218 -> 160;
            case 219 -> 179;
            case 220 -> 144;
            case 221 -> 156;
            case 222 -> 122;
            case 223 -> 172;
            case 224 -> 98;
            case 225 -> 164;
            case 226 -> 97;
            case 227 -> 215;
            case 228 -> 42;
            case 229 -> 143;
            case 230 -> 254;
            case 231 -> 114;
            case 232 -> 75;
            case 233 -> 66;
            case 234 -> 148;
            case 235 -> 70;
            case 236 -> 223;
            case 237 -> 102;
            case 238 -> 61;
            case 239 -> 54;
            case 240 -> 210;
            case 241 -> 250;
            case 242 -> 25;
            case 243 -> 64;
            case 244 -> 32;
            case 245 -> 88;
            case 246 -> 202;
            case 247 -> 205;
            case 248 -> 85;
            case 249 -> 231;
            case 250 -> 22;
            case 251 -> 147;
            case 252 -> 41;
            case 253 -> 233;
            case 254 -> 224;
            default -> 225;
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
      private final IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final Triple<Integer, Integer, Integer> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         @NotNull IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll var1,
         int var2,
         @NotNull Triple<Integer, Integer, Integer> var3
      ) {
         short var10001 = 25131;
         short var10002 = -26083;
         Intrinsics.checkNotNullParameter(var1, "routeType");
         var10001 = 25132;
         var10002 = 4935;
         Intrinsics.checkNotNullParameter(var3, "playerPos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      }

      @NotNull
      public final IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
         @NotNull IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll var1,
         int var2,
         @NotNull Triple<Integer, Integer, Integer> var3
      ) {
         short var10001 = 25133;
         short var10002 = -785;
         Intrinsics.checkNotNullParameter(var1, "routeType");
         var10001 = 25129;
         var10002 = -32345;
         Intrinsics.checkNotNullParameter(var3, "playerPos");
         return new IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 25135;
         Triple var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 7377;
         short var10002 = 25130;
         short var10003 = 27701;
         short var10004 = 25134;
         short var10005 = -12734;
         return "RouteProgress(routeType=" + var3 + ", currentIndex=" + var2 + ", playerPos=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         var1 = var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         return var1 * 31 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int var2 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
         IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var10000 = this;
         if (var2 == 0) {
            if (this == var1) {
               return true;
            }

            var10000 = (IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var1;
         }

         if (var2 == 0) {
            if (!(
               var10000 instanceof IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
            )) {
               return false;
            }

            var10000 = (IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var1;
         }

         IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = var10000;
         var10000 = this;
         if (var2 == 0) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var10000 = this;
         }

         int var5 = var10000.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if (var2 == 0) {
            if (var10000.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               != var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
               return false;
            }

            var5 = ((Intrinsics.areEqual(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            )) ? 1 : 0);
         }

         if (var2 == 0) {
            if (var5 == 0) {
               return false;
            }

            var5 = 1;
         }

         return (var5 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[7];
         int var3 = 0;
         String var2 = "\u0096\r\næ\u008eõep\u009aK\fW¸Ð\u00835\u008cá^\u0011twÐ\u0018\f«À\u0019áM'\u008e;%\u0081<þ\t\u009f\u0094\u000fÕ.\u0097z§\u0011\tn%g\u008dµ\u0016 j@\tÉJÅ\u000ewìQÈt";
         int var4 = "\u0096\r\næ\u008eõep\u009aK\fW¸Ð\u00835\u008cá^\u0011twÐ\u0018\f«À\u0019áM'\u008e;%\u0081<þ\t\u009f\u0094\u000fÕ.\u0097z§\u0011\tn%g\u008dµ\u0016 j@\tÉJÅ\u000ewìQÈt"
            .length();
         char var1 = 24;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 27;
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
                        case 0 -> 100;
                        case 1 -> 127;
                        case 2 -> 65;
                        case 3 -> 38;
                        case 4 -> 33;
                        case 5 -> 63;
                        default -> 83;
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

                     var2 = "\u0085k\u009aØ\ndBpÍ\u0004É )Þ\u007f\t>ç8\u0080\u000bâ¢¡E";
                     var4 = "\u0085k\u009aØ\ndBpÍ\u0004É )Þ\u007f\t>ç8\u0080\u000bâ¢¡E".length();
                     var1 = 15;
                     var8 = -1;
               }

               var10000 = 40;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 25135) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 166;
               case 1 -> 49;
               case 2 -> 193;
               case 3 -> 254;
               case 4 -> 224;
               case 5 -> 13;
               case 6 -> 146;
               case 7 -> 153;
               case 8 -> 169;
               case 9 -> 235;
               case 10 -> 116;
               case 11 -> 40;
               case 12 -> 121;
               case 13 -> 241;
               case 14 -> 174;
               case 15 -> 243;
               case 16 -> 99;
               case 17 -> 230;
               case 18 -> 50;
               case 19 -> 222;
               case 20 -> 205;
               case 21 -> 185;
               case 22 -> 7;
               case 23 -> 24;
               case 24 -> 35;
               case 25 -> 83;
               case 26 -> 37;
               case 27 -> 70;
               case 28 -> 53;
               case 29 -> 207;
               case 30 -> 48;
               case 31 -> 119;
               case 32 -> 131;
               case 33 -> 45;
               case 34 -> 176;
               case 35 -> 184;
               case 36 -> 186;
               case 37 -> 18;
               case 38 -> 2;
               case 39 -> 88;
               case 40 -> 149;
               case 41 -> 249;
               case 42 -> 65;
               case 43 -> 108;
               case 44 -> 212;
               case 45 -> 245;
               case 46 -> 63;
               case 47 -> 4;
               case 48 -> 162;
               case 49 -> 113;
               case 50 -> 106;
               case 51 -> 103;
               case 52 -> 123;
               case 53 -> 200;
               case 54 -> 109;
               case 55 -> 79;
               case 56 -> 154;
               case 57 -> 233;
               case 58 -> 17;
               case 59 -> 78;
               case 60 -> 182;
               case 61 -> 29;
               case 62 -> 239;
               case 63 -> 66;
               case 64 -> 191;
               case 65 -> 41;
               case 66 -> 8;
               case 67 -> 244;
               case 68 -> 104;
               case 69 -> 159;
               case 70 -> 183;
               case 71 -> 126;
               case 72 -> 61;
               case 73 -> 47;
               case 74 -> 98;
               case 75 -> 118;
               case 76 -> 178;
               case 77 -> 155;
               case 78 -> 55;
               case 79 -> 125;
               case 80 -> 181;
               case 81 -> 214;
               case 82 -> 10;
               case 83 -> 242;
               case 84 -> 5;
               case 85 -> 216;
               case 86 -> 105;
               case 87 -> 187;
               case 88 -> 197;
               case 89 -> 15;
               case 90 -> 135;
               case 91 -> 247;
               case 92 -> 160;
               case 93 -> 167;
               case 94 -> 179;
               case 95 -> 236;
               case 96 -> 252;
               case 97 -> 140;
               case 98 -> 107;
               case 99 -> 1;
               case 100 -> 206;
               case 101 -> 39;
               case 102 -> 220;
               case 103 -> 100;
               case 104 -> 0;
               case 105 -> 19;
               case 106 -> 54;
               case 107 -> 192;
               case 108 -> 6;
               case 109 -> 199;
               case 110 -> 23;
               case 111 -> 58;
               case 112 -> 138;
               case 113 -> 173;
               case 114 -> 165;
               case 115 -> 44;
               case 116 -> 215;
               case 117 -> 229;
               case 118 -> 76;
               case 119 -> 137;
               case 120 -> 101;
               case 121 -> 255;
               case 122 -> 189;
               case 123 -> 143;
               case 124 -> 42;
               case 125 -> 30;
               case 126 -> 133;
               case 127 -> 164;
               case 128 -> 188;
               case 129 -> 52;
               case 130 -> 36;
               case 131 -> 145;
               case 132 -> 226;
               case 133 -> 237;
               case 134 -> 31;
               case 135 -> 12;
               case 136 -> 112;
               case 137 -> 175;
               case 138 -> 57;
               case 139 -> 21;
               case 140 -> 180;
               case 141 -> 59;
               case 142 -> 67;
               case 143 -> 211;
               case 144 -> 16;
               case 145 -> 134;
               case 146 -> 139;
               case 147 -> 201;
               case 148 -> 92;
               case 149 -> 84;
               case 150 -> 210;
               case 151 -> 56;
               case 152 -> 85;
               case 153 -> 227;
               case 154 -> 151;
               case 155 -> 81;
               case 156 -> 26;
               case 157 -> 25;
               case 158 -> 253;
               case 159 -> 95;
               case 160 -> 32;
               case 161 -> 248;
               case 162 -> 20;
               case 163 -> 209;
               case 164 -> 219;
               case 165 -> 203;
               case 166 -> 150;
               case 167 -> 87;
               case 168 -> 161;
               case 169 -> 82;
               case 170 -> 142;
               case 171 -> 204;
               case 172 -> 127;
               case 173 -> 141;
               case 174 -> 240;
               case 175 -> 171;
               case 176 -> 172;
               case 177 -> 218;
               case 178 -> 71;
               case 179 -> 202;
               case 180 -> 168;
               case 181 -> 136;
               case 182 -> 89;
               case 183 -> 208;
               case 184 -> 11;
               case 185 -> 110;
               case 186 -> 69;
               case 187 -> 225;
               case 188 -> 196;
               case 189 -> 38;
               case 190 -> 228;
               case 191 -> 34;
               case 192 -> 73;
               case 193 -> 158;
               case 194 -> 72;
               case 195 -> 114;
               case 196 -> 148;
               case 197 -> 250;
               case 198 -> 170;
               case 199 -> 163;
               case 200 -> 195;
               case 201 -> 80;
               case 202 -> 190;
               case 203 -> 234;
               case 204 -> 86;
               case 205 -> 221;
               case 206 -> 132;
               case 207 -> 28;
               case 208 -> 120;
               case 209 -> 102;
               case 210 -> 122;
               case 211 -> 213;
               case 212 -> 74;
               case 213 -> 27;
               case 214 -> 128;
               case 215 -> 147;
               case 216 -> 129;
               case 217 -> 231;
               case 218 -> 232;
               case 219 -> 115;
               case 220 -> 194;
               case 221 -> 60;
               case 222 -> 14;
               case 223 -> 217;
               case 224 -> 93;
               case 225 -> 46;
               case 226 -> 94;
               case 227 -> 91;
               case 228 -> 177;
               case 229 -> 77;
               case 230 -> 90;
               case 231 -> 43;
               case 232 -> 144;
               case 233 -> 22;
               case 234 -> 157;
               case 235 -> 68;
               case 236 -> 111;
               case 237 -> 223;
               case 238 -> 96;
               case 239 -> 117;
               case 240 -> 62;
               case 241 -> 9;
               case 242 -> 64;
               case 243 -> 152;
               case 244 -> 33;
               case 245 -> 238;
               case 246 -> 124;
               case 247 -> 97;
               case 248 -> 3;
               case 249 -> 130;
               case 250 -> 51;
               case 251 -> 251;
               case 252 -> 246;
               case 253 -> 75;
               case 254 -> 198;
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
   
      // PX-FIX-ok: Kotlin $default bridge (synthetic; jar body translated 1:1)
      public static final me.octo.client.IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(me.octo.client.IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var0, me.octo.client.IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll var1, int var2, kotlin.Triple var3, int var4, java.lang.Object var5) {
         int var6 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
         if ((var4 & 1) != 0) {
            if (var6 != 0) {
               var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            }
         }
         if ((var4 & 2) != 0) {
            if (var6 != 0) {
               var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }
         }
         if ((var4 & 4) != 0) {
            var3 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }
         return var0.a(var1, var2, var3);
      }
}

   private static enum IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

      // PX-FIX TOP5F: jar private static final <Self>[] c() (values array builder)
      private static final IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll[] c() {
         return new IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll[]{ IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII };
      }

      public static IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll[] a() {
         return (IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll[])IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.clone();
      }

      public static IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll a(
         String var0
      ) {
         return Enum.valueOf(
            IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll> b() {
         return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll[]{IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII};
      private static final EnumEntries<IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = kotlin.enums.EnumEntriesKt.enumEntries(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
   }

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(Object... px) {
        }

    // PX-FIX TOP5F: Kotlin synthetic no-arg marker ctor (jar: <init>(DefaultConstructorMarker))
    public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(kotlin.jvm.internal.DefaultConstructorMarker marker) {
        this();
    }

    // PX-FIX TOP5F: jar public static void b() (empty body)
    public static void b() {
    }

      private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
      }

      @NotNull
      public final IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl a() {
         return IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
      }

      @NotNull
      public final IlIIlIIIIllIlIIIllllIIlIIIIIIlIlIIlIllIIIIIIllllllllIlIlIllIIIIIIIIIlIIIlIIlIIlIlIIII c() {
         return IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
      }
   }

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final Triple<Integer, Integer, Integer> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         int var1, int var2, @NotNull Triple<Integer, Integer, Integer> var3
      ) {
         short var10001 = -17096;
         short var10002 = 21956;
         Intrinsics.checkNotNullParameter(var3, "playerPos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      }

      public final int a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final int d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         int var1, int var2, @NotNull Triple<Integer, Integer, Integer> var3
      ) {
         short var10001 = -17094;
         short var10002 = -14922;
         Intrinsics.checkNotNullParameter(var3, "playerPos");
         return new IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -17095;
         Triple var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -30075;
         short var10002 = -17093;
         short var10003 = -29901;
         short var10004 = -17089;
         short var10005 = -12281;
         return "BotProgress(pathIndex=" + var3 + ", waypointIndex=" + var2 + ", playerPos=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var1 = var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         return var1 * 31 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
      Object var4 = null; // PX-FIX
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
               var10000 instanceof IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         label48: {
            IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
            var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            int var10001 = var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            if (var2 != 0) {
               if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
                  return false;
               }

               var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               if (var2 == 0) {
                  break label48;
               }

               var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            if ((Boolean)var4 != ((var10001 == 0))) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            );
         }

         if (var2 != 0) {
            if (((Boolean)(var4))) {
               return false;
            }

            var4 = 1;
         }

         return (boolean)var4;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[5];
         int var3 = 0;
         String var2 = "C°ä\u008f9Ró6\u0000¤6E\\\u0083p\u0016\tÄxÕK×Ó\u008eBj\u0016'RÈDÔ#,ÿùâY,Ø$z3®±\u0094nïR";
         int var4 = "C°ä\u008f9Ró6\u0000¤6E\\\u0083p\u0016\tÄxÕK×Ó\u008eBj\u0016'RÈDÔ#,ÿùâY,Ø$z3®±\u0094nïR".length();
         char var1 = 16;
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
                        case 0 -> 4;
                        case 1 -> 83;
                        case 2 -> 30;
                        case 3 -> 122;
                        case 4 -> 74;
                        case 5 -> 29;
                        default -> 104;
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

                     var2 = "rª¥·\u007fê=Ãº\f_=Æ\u0095$\u0012ç«QÒy\u0006";
                     var4 = "rª¥·\u007fê=Ãº\f_=Æ\u0095$\u0012ç«QÒy\u0006".length();
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
         int var2 = (var0 ^ -17093) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 46;
               case 1 -> 237;
               case 2 -> 118;
               case 3 -> 4;
               case 4 -> 62;
               case 5 -> 69;
               case 6 -> 249;
               case 7 -> 81;
               case 8 -> 197;
               case 9 -> 58;
               case 10 -> 190;
               case 11 -> 90;
               case 12 -> 54;
               case 13 -> 209;
               case 14 -> 65;
               case 15 -> 211;
               case 16 -> 147;
               case 17 -> 233;
               case 18 -> 182;
               case 19 -> 231;
               case 20 -> 219;
               case 21 -> 149;
               case 22 -> 94;
               case 23 -> 245;
               case 24 -> 167;
               case 25 -> 178;
               case 26 -> 52;
               case 27 -> 165;
               case 28 -> 131;
               case 29 -> 41;
               case 30 -> 13;
               case 31 -> 27;
               case 32 -> 53;
               case 33 -> 16;
               case 34 -> 216;
               case 35 -> 155;
               case 36 -> 7;
               case 37 -> 158;
               case 38 -> 235;
               case 39 -> 162;
               case 40 -> 120;
               case 41 -> 71;
               case 42 -> 115;
               case 43 -> 77;
               case 44 -> 5;
               case 45 -> 208;
               case 46 -> 179;
               case 47 -> 100;
               case 48 -> 195;
               case 49 -> 222;
               case 50 -> 129;
               case 51 -> 61;
               case 52 -> 128;
               case 53 -> 143;
               case 54 -> 76;
               case 55 -> 43;
               case 56 -> 109;
               case 57 -> 108;
               case 58 -> 60;
               case 59 -> 45;
               case 60 -> 152;
               case 61 -> 163;
               case 62 -> 40;
               case 63 -> 0;
               case 64 -> 225;
               case 65 -> 29;
               case 66 -> 31;
               case 67 -> 221;
               case 68 -> 20;
               case 69 -> 241;
               case 70 -> 87;
               case 71 -> 33;
               case 72 -> 193;
               case 73 -> 21;
               case 74 -> 72;
               case 75 -> 22;
               case 76 -> 251;
               case 77 -> 82;
               case 78 -> 229;
               case 79 -> 228;
               case 80 -> 139;
               case 81 -> 212;
               case 82 -> 156;
               case 83 -> 180;
               case 84 -> 34;
               case 85 -> 200;
               case 86 -> 201;
               case 87 -> 63;
               case 88 -> 213;
               case 89 -> 166;
               case 90 -> 226;
               case 91 -> 55;
               case 92 -> 130;
               case 93 -> 189;
               case 94 -> 117;
               case 95 -> 80;
               case 96 -> 121;
               case 97 -> 217;
               case 98 -> 238;
               case 99 -> 234;
               case 100 -> 18;
               case 101 -> 239;
               case 102 -> 11;
               case 103 -> 96;
               case 104 -> 12;
               case 105 -> 79;
               case 106 -> 181;
               case 107 -> 253;
               case 108 -> 122;
               case 109 -> 97;
               case 110 -> 157;
               case 111 -> 146;
               case 112 -> 59;
               case 113 -> 73;
               case 114 -> 176;
               case 115 -> 150;
               case 116 -> 168;
               case 117 -> 174;
               case 118 -> 151;
               case 119 -> 142;
               case 120 -> 175;
               case 121 -> 28;
               case 122 -> 26;
               case 123 -> 116;
               case 124 -> 112;
               case 125 -> 183;
               case 126 -> 1;
               case 127 -> 199;
               case 128 -> 10;
               case 129 -> 248;
               case 130 -> 202;
               case 131 -> 74;
               case 132 -> 194;
               case 133 -> 124;
               case 134 -> 223;
               case 135 -> 36;
               case 136 -> 23;
               case 137 -> 32;
               case 138 -> 42;
               case 139 -> 119;
               case 140 -> 48;
               case 141 -> 51;
               case 142 -> 14;
               case 143 -> 145;
               case 144 -> 19;
               case 145 -> 126;
               case 146 -> 67;
               case 147 -> 44;
               case 148 -> 164;
               case 149 -> 6;
               case 150 -> 127;
               case 151 -> 159;
               case 152 -> 105;
               case 153 -> 169;
               case 154 -> 196;
               case 155 -> 240;
               case 156 -> 89;
               case 157 -> 88;
               case 158 -> 86;
               case 159 -> 242;
               case 160 -> 191;
               case 161 -> 114;
               case 162 -> 186;
               case 163 -> 232;
               case 164 -> 140;
               case 165 -> 84;
               case 166 -> 204;
               case 167 -> 3;
               case 168 -> 185;
               case 169 -> 250;
               case 170 -> 47;
               case 171 -> 110;
               case 172 -> 252;
               case 173 -> 220;
               case 174 -> 35;
               case 175 -> 160;
               case 176 -> 30;
               case 177 -> 37;
               case 178 -> 184;
               case 179 -> 92;
               case 180 -> 247;
               case 181 -> 172;
               case 182 -> 137;
               case 183 -> 177;
               case 184 -> 144;
               case 185 -> 99;
               case 186 -> 98;
               case 187 -> 188;
               case 188 -> 17;
               case 189 -> 25;
               case 190 -> 68;
               case 191 -> 93;
               case 192 -> 49;
               case 193 -> 148;
               case 194 -> 227;
               case 195 -> 154;
               case 196 -> 70;
               case 197 -> 106;
               case 198 -> 187;
               case 199 -> 91;
               case 200 -> 141;
               case 201 -> 9;
               case 202 -> 205;
               case 203 -> 113;
               case 204 -> 255;
               case 205 -> 24;
               case 206 -> 75;
               case 207 -> 224;
               case 208 -> 192;
               case 209 -> 123;
               case 210 -> 170;
               case 211 -> 136;
               case 212 -> 57;
               case 213 -> 214;
               case 214 -> 107;
               case 215 -> 218;
               case 216 -> 133;
               case 217 -> 101;
               case 218 -> 173;
               case 219 -> 254;
               case 220 -> 207;
               case 221 -> 125;
               case 222 -> 161;
               case 223 -> 50;
               case 224 -> 243;
               case 225 -> 38;
               case 226 -> 111;
               case 227 -> 95;
               case 228 -> 134;
               case 229 -> 64;
               case 230 -> 15;
               case 231 -> 230;
               case 232 -> 39;
               case 233 -> 198;
               case 234 -> 78;
               case 235 -> 103;
               case 236 -> 153;
               case 237 -> 8;
               case 238 -> 206;
               case 239 -> 85;
               case 240 -> 135;
               case 241 -> 66;
               case 242 -> 83;
               case 243 -> 104;
               case 244 -> 56;
               case 245 -> 138;
               case 246 -> 244;
               case 247 -> 102;
               case 248 -> 210;
               case 249 -> 171;
               case 250 -> 2;
               case 251 -> 215;
               case 252 -> 132;
               case 253 -> 246;
               case 254 -> 236;
               default -> 203;
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
   
      // PX-FIX-ok: Kotlin $default bridge (synthetic; jar body translated 1:1)
      public static final me.octo.client.IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(me.octo.client.IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIlIlIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0, int var1, int var2, kotlin.Triple var3, int var4, java.lang.Object var5) {
         int var6 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
         if ((var4 & 1) != 0) {
            if (var6 == 0) {
               var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            }
         }
         if ((var4 & 2) != 0) {
            if (var6 == 0) {
               var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }
         }
         if ((var4 & 4) != 0) {
            var3 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }
         return var0.a(var1, var2, var3);
      }
}
}
