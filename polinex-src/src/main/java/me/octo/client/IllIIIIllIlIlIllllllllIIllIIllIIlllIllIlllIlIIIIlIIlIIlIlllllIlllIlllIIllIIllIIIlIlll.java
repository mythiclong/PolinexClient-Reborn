package me.octo.client;

import java.util.List;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll
   extends lIIllIIlIIlllllIIIllllllIIIlllIlIlIllIlllllllIlIllIllIIIIIIlIIIllIIllIlIIIllllIlIlIIl {
    public static <T> T d(Object p0) { return null; } // PX-FIX mr4
    public static <T> T g(Object p0) { return null; } // PX-FIX mr3
    public static <T> T f(Object p0) { return null; } // PX-FIX mr3
   public Object receiver; // PX-FIX kotlin lambda receiver

   @NotNull
   public static IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
   private boolean IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
   @NotNull
   private static IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;

   public static final IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll bg() {
      return lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
   }

   public static final void a(IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll var0, IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      var0.a(var1);
   }
   private static String[] j;
   private static String[] k;

   public IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll() { me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var5 = null; // PX-FIX hoist
        
      short var10001 = -19551;
      short var10002 = -20780;
      var10002 = -19526;
      short var10003 = 17714;
       var5 = me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      short var10004 = -19547;
      short var10005 = 4103;
      String[] var1 = new String[3];
      short var10007 = -19541;
      short var10008 = -19466;
      var1[0] = "1. Create a route with TREE waypoints";
      var10007 = -19544;
      var10008 = -18142;
      var1[1] = "2. Add WALK/WARP waypoints to navigate";
      var10007 = -19538;
      var10008 = -22489;
      var1[2] = "3. Enable the macro";
      List var6 = CollectionsKt.listOf(var1);
      var1 = new String[2];
      var10008 = -19539;
      short var10009 = -9617;
      var1[0] = "Place TREE waypoints directly on tree logs";
      var10008 = -19521;
      var10009 = 7255;
      var1[1] = "The bot will find safe ground near each tree";
      List var10006 = CollectionsKt.listOf(var1);
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var3 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         lIIllllIlllllIIIIlllIIIlllllllIllllllIIIIlIlIIIIllIIlIlIlllIIlIllIIlIIIlIlllllIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c(),
         lIIllllIlllllIIIIlllIIIlllllllIllllllIIIIlIlIIIIllIIlIlIlllIIlIllIIlIIIlIlllllIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         lIIllllIlllllIIIIlllIIIlllllllIllllllIIIIlIlIIIIllIIlIlIlllIIlIllIIlIIIlIlllllIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a()
      };
      super("Galatea Tree Macro", "Mines trees based on a route.", var5, "Foraging", var6, var10006, true, var3);
      this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
   }

   @Override
   protected void aD() {
      Object receiver = null; // PX-FIX
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var10000 = this;
      short var10001 = -19523;
      short var10002 = 26330;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10000),
         "Galatea Tree travel",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         null,
         5000L,
         false,
         false,
         (kotlin.jvm.functions.Function1)(IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll::b),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = 15995;
                  short var10005 = -13365;
                  var10005 = 15994;
                  short var10006 = -8011;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001x = 15992;
                  short var10002x = -6707;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static { String[] var5 = null; // PX-FIX hoist
        
                  pxClinit: {
                   var5 = new String[3];
                  int var3 = 0;
                  String var2 = "ã.ï\u000e§\u0013øh\b¹v\u008a\naÚ´ZÄù\u008dÕ³\u0081H{jP2I4×àEþ\u008eÎ\u0086M>\u0094\u0015\u0011¨ú¤\u0015\rÔ\u00864¬¶{O½Î\u0098\u0080\u0006ZØ\u0018<\tûµ´\u008bÅ×\u0097£Â\u001bä±\u001f\u0019;\u0013\bûÓ}pw\u009a¤nÇkò4ïédï\u008eÒ\tjkñ>½èJ\b§<&\u0004ëXhd\u0015^\u0085ä¾Ì?\u0012:\u0002Ô\u008bÀ£\u0014~\u0095{ÅÒ|j\u0014Õ\u0083è\u0002ãz";
                  int var4 = "ã.ï\u000e§\u0013øh\b¹v\u008a\naÚ´ZÄù\u008dÕ³\u0081H{jP2I4×àEþ\u008eÎ\u0086M>\u0094\u0015\u0011¨ú¤\u0015\rÔ\u00864¬¶{O½Î\u0098\u0080\u0006ZØ\u0018<\tûµ´\u008bÅ×\u0097£Â\u001bä±\u001f\u0019;\u0013\bûÓ}pw\u009a¤nÇkò4ïédï\u008eÒ\tjkñ>½èJ\b§<&\u0004ëXhd\u0015^\u0085ä¾Ì?\u0012:\u0002Ô\u008bÀ£\u0014~\u0095{ÅÒ|j\u0014Õ\u0083è\u0002ãz"
                     .length();
                  char var1 = '{';
                  int var0 = -1;

                  while (true) {
                     char[] var10002x;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 101;
                        var10002x = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 101;
                           var10006 = var6;
                        } else {
                           var13 = 101;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 101;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 9;
                              case 1 -> 56;
                              case 2 -> 112;
                              case 3 -> 44;
                              case 4 -> 82;
                              case 5 -> 19;
                              default -> 41;
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

               private static String a(int var0, int var1) { int var5 = 0; // PX-FIX hoist
        
                  int var2 = (var0 ^ 15994) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 77;
                        case 1 -> 162;
                        case 2 -> 176;
                        case 3 -> 49;
                        case 4 -> 48;
                        case 5 -> 220;
                        case 6 -> 81;
                        case 7 -> 222;
                        case 8 -> 94;
                        case 9 -> 109;
                        case 10 -> 147;
                        case 11 -> 145;
                        case 12 -> 223;
                        case 13 -> 12;
                        case 14 -> 254;
                        case 15 -> 239;
                        case 16 -> 20;
                        case 17 -> 243;
                        case 18 -> 97;
                        case 19 -> 44;
                        case 20 -> 146;
                        case 21 -> 177;
                        case 22 -> 111;
                        case 23 -> 190;
                        case 24 -> 64;
                        case 25 -> 103;
                        case 26 -> 175;
                        case 27 -> 183;
                        case 28 -> 92;
                        case 29 -> 110;
                        case 30 -> 203;
                        case 31 -> 196;
                        case 32 -> 137;
                        case 33 -> 38;
                        case 34 -> 10;
                        case 35 -> 30;
                        case 36 -> 52;
                        case 37 -> 58;
                        case 38 -> 117;
                        case 39 -> 221;
                        case 40 -> 191;
                        case 41 -> 235;
                        case 42 -> 86;
                        case 43 -> 21;
                        case 44 -> 24;
                        case 45 -> 17;
                        case 46 -> 126;
                        case 47 -> 60;
                        case 48 -> 234;
                        case 49 -> 2;
                        case 50 -> 139;
                        case 51 -> 238;
                        case 52 -> 226;
                        case 53 -> 15;
                        case 54 -> 154;
                        case 55 -> 153;
                        case 56 -> 233;
                        case 57 -> 37;
                        case 58 -> 178;
                        case 59 -> 123;
                        case 60 -> 217;
                        case 61 -> 130;
                        case 62 -> 241;
                        case 63 -> 150;
                        case 64 -> 41;
                        case 65 -> 213;
                        case 66 -> 197;
                        case 67 -> 174;
                        case 68 -> 134;
                        case 69 -> 227;
                        case 70 -> 201;
                        case 71 -> 173;
                        case 72 -> 148;
                        case 73 -> 133;
                        case 74 -> 212;
                        case 75 -> 54;
                        case 76 -> 252;
                        case 77 -> 250;
                        case 78 -> 204;
                        case 79 -> 187;
                        case 80 -> 36;
                        case 81 -> 55;
                        case 82 -> 85;
                        case 83 -> 95;
                        case 84 -> 0;
                        case 85 -> 22;
                        case 86 -> 141;
                        case 87 -> 231;
                        case 88 -> 164;
                        case 89 -> 140;
                        case 90 -> 160;
                        case 91 -> 170;
                        case 92 -> 198;
                        case 93 -> 205;
                        case 94 -> 131;
                        case 95 -> 33;
                        case 96 -> 6;
                        case 97 -> 13;
                        case 98 -> 1;
                        case 99 -> 69;
                        case 100 -> 61;
                        case 101 -> 88;
                        case 102 -> 46;
                        case 103 -> 195;
                        case 104 -> 218;
                        case 105 -> 67;
                        case 106 -> 72;
                        case 107 -> 74;
                        case 108 -> 112;
                        case 109 -> 240;
                        case 110 -> 166;
                        case 111 -> 159;
                        case 112 -> 230;
                        case 113 -> 62;
                        case 114 -> 144;
                        case 115 -> 179;
                        case 116 -> 3;
                        case 117 -> 255;
                        case 118 -> 180;
                        case 119 -> 116;
                        case 120 -> 120;
                        case 121 -> 171;
                        case 122 -> 102;
                        case 123 -> 31;
                        case 124 -> 149;
                        case 125 -> 156;
                        case 126 -> 132;
                        case 127 -> 181;
                        case 128 -> 82;
                        case 129 -> 224;
                        case 130 -> 121;
                        case 131 -> 157;
                        case 132 -> 208;
                        case 133 -> 26;
                        case 134 -> 91;
                        case 135 -> 70;
                        case 136 -> 136;
                        case 137 -> 185;
                        case 138 -> 66;
                        case 139 -> 57;
                        case 140 -> 18;
                        case 141 -> 219;
                        case 142 -> 242;
                        case 143 -> 206;
                        case 144 -> 246;
                        case 145 -> 169;
                        case 146 -> 192;
                        case 147 -> 75;
                        case 148 -> 118;
                        case 149 -> 34;
                        case 150 -> 35;
                        case 151 -> 186;
                        case 152 -> 189;
                        case 153 -> 127;
                        case 154 -> 128;
                        case 155 -> 4;
                        case 156 -> 214;
                        case 157 -> 27;
                        case 158 -> 14;
                        case 159 -> 80;
                        case 160 -> 73;
                        case 161 -> 7;
                        case 162 -> 229;
                        case 163 -> 53;
                        case 164 -> 28;
                        case 165 -> 51;
                        case 166 -> 158;
                        case 167 -> 98;
                        case 168 -> 99;
                        case 169 -> 119;
                        case 170 -> 232;
                        case 171 -> 87;
                        case 172 -> 248;
                        case 173 -> 45;
                        case 174 -> 193;
                        case 175 -> 89;
                        case 176 -> 39;
                        case 177 -> 16;
                        case 178 -> 125;
                        case 179 -> 247;
                        case 180 -> 207;
                        case 181 -> 115;
                        case 182 -> 106;
                        case 183 -> 143;
                        case 184 -> 100;
                        case 185 -> 200;
                        case 186 -> 129;
                        case 187 -> 19;
                        case 188 -> 59;
                        case 189 -> 228;
                        case 190 -> 211;
                        case 191 -> 32;
                        case 192 -> 71;
                        case 193 -> 161;
                        case 194 -> 29;
                        case 195 -> 65;
                        case 196 -> 251;
                        case 197 -> 40;
                        case 198 -> 78;
                        case 199 -> 245;
                        case 200 -> 42;
                        case 201 -> 23;
                        case 202 -> 105;
                        case 203 -> 202;
                        case 204 -> 216;
                        case 205 -> 155;
                        case 206 -> 76;
                        case 207 -> 152;
                        case 208 -> 168;
                        case 209 -> 210;
                        case 210 -> 83;
                        case 211 -> 90;
                        case 212 -> 182;
                        case 213 -> 63;
                        case 214 -> 101;
                        case 215 -> 79;
                        case 216 -> 194;
                        case 217 -> 151;
                        case 218 -> 225;
                        case 219 -> 68;
                        case 220 -> 135;
                        case 221 -> 113;
                        case 222 -> 124;
                        case 223 -> 107;
                        case 224 -> 138;
                        case 225 -> 114;
                        case 226 -> 244;
                        case 227 -> 84;
                        case 228 -> 209;
                        case 229 -> 236;
                        case 230 -> 56;
                        case 231 -> 249;
                        case 232 -> 184;
                        case 233 -> 47;
                        case 234 -> 215;
                        case 235 -> 50;
                        case 236 -> 104;
                        case 237 -> 5;
                        case 238 -> 167;
                        case 239 -> 165;
                        case 240 -> 163;
                        case 241 -> 253;
                        case 242 -> 96;
                        case 243 -> 93;
                        case 244 -> 43;
                        case 245 -> 199;
                        case 246 -> 108;
                        case 247 -> 142;
                        case 248 -> 8;
                        case 249 -> 122;
                        case 250 -> 11;
                        case 251 -> 25;
                        case 252 -> 237;
                        case 253 -> 9;
                        case 254 -> 188;
                        default -> 172;
                     };
                      var5 = (var1 & 0xFF) - var4;
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
      var10001 = -19524;
      var10002 = -959;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10000),
         "Galatea Tree route",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI,
         null,
         0L,
         false,
         false,
         (kotlin.jvm.functions.Function1)(IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll::d),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = 20998;
                  short var10005 = 8504;
                  var10005 = 20996;
                  short var10006 = 31533;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = 20999;
                  short var10002 = 19007;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static { String[] var5 = null; // PX-FIX hoist
        
                  pxClinit: {
                   var5 = new String[3];
                  int var3 = 0;
                  String var2 = "]QÆ·\u008cJy\u009dîùü\u008c5Eãæ\u0083Ø\u0002\u0081â{¤cùñk\u0082\u0085\u0084qÚ\u000fèKÉ,wzêó&p\u0018ãÃa\u0015}92\u0083F@y\u0084í_<\u0081?\u0003[\u0007¿î¸Á\u0080 ÓtÐ@¢\u009fè0ì\u0089v-Ø\u0098ØÇ±\u0092«aHnøBÑq\u0088\u0092v£Àº!À\u0098þÇÑ\u0092&aùnëB2qÑ\u0092Ü£\u0095º®åèÛìPv²ýêØ¬\u0015~\u009bÙÏø\bÇ¯F";
                  int var4 = "]QÆ·\u008cJy\u009dîùü\u008c5Eãæ\u0083Ø\u0002\u0081â{¤cùñk\u0082\u0085\u0084qÚ\u000fèKÉ,wzêó&p\u0018ãÃa\u0015}92\u0083F@y\u0084í_<\u0081?\u0003[\u0007¿î¸Á\u0080 ÓtÐ@¢\u009fè0ì\u0089v-Ø\u0098ØÇ±\u0092«aHnøBÑq\u0088\u0092v£Àº!À\u0098þÇÑ\u0092&aùnëB2qÑ\u0092Ü£\u0095º®åèÛìPv²ýêØ¬\u0015~\u009bÙÏø\bÇ¯F"
                     .length();
                  char var1 = 18;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 21;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 21;
                           var10006 = var6;
                        } else {
                           var13 = 21;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 21;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 14;
                              case 1 -> 50;
                              case 2 -> 16;
                              case 3 -> 69;
                              case 4 -> 46;
                              case 5 -> 46;
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

               private static String a(int var0, int var1) { int var5 = 0; // PX-FIX hoist
        
                  int var2 = (var0 ^ 20998) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 41;
                        case 1 -> 162;
                        case 2 -> 212;
                        case 3 -> 139;
                        case 4 -> 142;
                        case 5 -> 8;
                        case 6 -> 230;
                        case 7 -> 51;
                        case 8 -> 133;
                        case 9 -> 157;
                        case 10 -> 45;
                        case 11 -> 235;
                        case 12 -> 20;
                        case 13 -> 216;
                        case 14 -> 191;
                        case 15 -> 98;
                        case 16 -> 18;
                        case 17 -> 83;
                        case 18 -> 213;
                        case 19 -> 254;
                        case 20 -> 79;
                        case 21 -> 174;
                        case 22 -> 215;
                        case 23 -> 109;
                        case 24 -> 80;
                        case 25 -> 14;
                        case 26 -> 144;
                        case 27 -> 102;
                        case 28 -> 241;
                        case 29 -> 143;
                        case 30 -> 36;
                        case 31 -> 161;
                        case 32 -> 122;
                        case 33 -> 108;
                        case 34 -> 247;
                        case 35 -> 3;
                        case 36 -> 177;
                        case 37 -> 116;
                        case 38 -> 131;
                        case 39 -> 12;
                        case 40 -> 126;
                        case 41 -> 87;
                        case 42 -> 180;
                        case 43 -> 74;
                        case 44 -> 242;
                        case 45 -> 202;
                        case 46 -> 160;
                        case 47 -> 59;
                        case 48 -> 196;
                        case 49 -> 82;
                        case 50 -> 76;
                        case 51 -> 252;
                        case 52 -> 96;
                        case 53 -> 99;
                        case 54 -> 44;
                        case 55 -> 64;
                        case 56 -> 207;
                        case 57 -> 89;
                        case 58 -> 124;
                        case 59 -> 4;
                        case 60 -> 145;
                        case 61 -> 7;
                        case 62 -> 171;
                        case 63 -> 253;
                        case 64 -> 37;
                        case 65 -> 187;
                        case 66 -> 6;
                        case 67 -> 189;
                        case 68 -> 38;
                        case 69 -> 209;
                        case 70 -> 10;
                        case 71 -> 204;
                        case 72 -> 118;
                        case 73 -> 155;
                        case 74 -> 163;
                        case 75 -> 90;
                        case 76 -> 183;
                        case 77 -> 48;
                        case 78 -> 34;
                        case 79 -> 73;
                        case 80 -> 106;
                        case 81 -> 119;
                        case 82 -> 232;
                        case 83 -> 78;
                        case 84 -> 39;
                        case 85 -> 70;
                        case 86 -> 129;
                        case 87 -> 113;
                        case 88 -> 251;
                        case 89 -> 50;
                        case 90 -> 201;
                        case 91 -> 71;
                        case 92 -> 190;
                        case 93 -> 23;
                        case 94 -> 93;
                        case 95 -> 19;
                        case 96 -> 229;
                        case 97 -> 40;
                        case 98 -> 95;
                        case 99 -> 111;
                        case 100 -> 49;
                        case 101 -> 172;
                        case 102 -> 56;
                        case 103 -> 150;
                        case 104 -> 166;
                        case 105 -> 208;
                        case 106 -> 214;
                        case 107 -> 75;
                        case 108 -> 221;
                        case 109 -> 24;
                        case 110 -> 153;
                        case 111 -> 21;
                        case 112 -> 42;
                        case 113 -> 115;
                        case 114 -> 35;
                        case 115 -> 211;
                        case 116 -> 15;
                        case 117 -> 105;
                        case 118 -> 168;
                        case 119 -> 184;
                        case 120 -> 178;
                        case 121 -> 16;
                        case 122 -> 199;
                        case 123 -> 43;
                        case 124 -> 239;
                        case 125 -> 217;
                        case 126 -> 245;
                        case 127 -> 29;
                        case 128 -> 88;
                        case 129 -> 128;
                        case 130 -> 120;
                        case 131 -> 27;
                        case 132 -> 195;
                        case 133 -> 68;
                        case 134 -> 52;
                        case 135 -> 11;
                        case 136 -> 127;
                        case 137 -> 158;
                        case 138 -> 65;
                        case 139 -> 236;
                        case 140 -> 175;
                        case 141 -> 67;
                        case 142 -> 63;
                        case 143 -> 220;
                        case 144 -> 173;
                        case 145 -> 9;
                        case 146 -> 138;
                        case 147 -> 55;
                        case 148 -> 47;
                        case 149 -> 123;
                        case 150 -> 159;
                        case 151 -> 58;
                        case 152 -> 147;
                        case 153 -> 2;
                        case 154 -> 85;
                        case 155 -> 92;
                        case 156 -> 205;
                        case 157 -> 219;
                        case 158 -> 179;
                        case 159 -> 227;
                        case 160 -> 194;
                        case 161 -> 200;
                        case 162 -> 60;
                        case 163 -> 112;
                        case 164 -> 81;
                        case 165 -> 103;
                        case 166 -> 149;
                        case 167 -> 28;
                        case 168 -> 250;
                        case 169 -> 54;
                        case 170 -> 234;
                        case 171 -> 114;
                        case 172 -> 141;
                        case 173 -> 224;
                        case 174 -> 237;
                        case 175 -> 66;
                        case 176 -> 156;
                        case 177 -> 77;
                        case 178 -> 62;
                        case 179 -> 100;
                        case 180 -> 226;
                        case 181 -> 185;
                        case 182 -> 244;
                        case 183 -> 110;
                        case 184 -> 1;
                        case 185 -> 181;
                        case 186 -> 69;
                        case 187 -> 132;
                        case 188 -> 186;
                        case 189 -> 125;
                        case 190 -> 148;
                        case 191 -> 86;
                        case 192 -> 101;
                        case 193 -> 22;
                        case 194 -> 134;
                        case 195 -> 107;
                        case 196 -> 248;
                        case 197 -> 222;
                        case 198 -> 30;
                        case 199 -> 169;
                        case 200 -> 57;
                        case 201 -> 146;
                        case 202 -> 137;
                        case 203 -> 117;
                        case 204 -> 154;
                        case 205 -> 223;
                        case 206 -> 32;
                        case 207 -> 218;
                        case 208 -> 33;
                        case 209 -> 31;
                        case 210 -> 0;
                        case 211 -> 61;
                        case 212 -> 140;
                        case 213 -> 188;
                        case 214 -> 84;
                        case 215 -> 130;
                        case 216 -> 240;
                        case 217 -> 210;
                        case 218 -> 25;
                        case 219 -> 165;
                        case 220 -> 231;
                        case 221 -> 167;
                        case 222 -> 91;
                        case 223 -> 255;
                        case 224 -> 243;
                        case 225 -> 104;
                        case 226 -> 233;
                        case 227 -> 203;
                        case 228 -> 26;
                        case 229 -> 198;
                        case 230 -> 46;
                        case 231 -> 151;
                        case 232 -> 206;
                        case 233 -> 225;
                        case 234 -> 97;
                        case 235 -> 135;
                        case 236 -> 121;
                        case 237 -> 238;
                        case 238 -> 136;
                        case 239 -> 246;
                        case 240 -> 192;
                        case 241 -> 197;
                        case 242 -> 176;
                        case 243 -> 53;
                        case 244 -> 170;
                        case 245 -> 152;
                        case 246 -> 94;
                        case 247 -> 13;
                        case 248 -> 249;
                        case 249 -> 5;
                        case 250 -> 182;
                        case 251 -> 193;
                        case 252 -> 228;
                        case 253 -> 72;
                        case 254 -> 164;
                        default -> 17;
                     };
                      var5 = (var1 & 0xFF) - var4;
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
      var10001 = -19527;
      var10002 = -23678;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10000),
         "Galatea Tree reposition",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll,
         5000L,
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
                  short var10004 = -3621;
                  short var10005 = 28500;
                  var10005 = -3622;
                  short var10006 = -20451;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = -3624;
                  short var10002 = 15272;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static { String[] var5 = null; // PX-FIX hoist
        
                  pxClinit: {
                   var5 = new String[3];
                  int var3 = 0;
                  String var2 = "\u0084%F¼W\u009bi\u008d¯@Qp0±i;iæZ\u0017.\u0014kùõ\u0099_Ã\\\u009f0F|ô&{\u0006¾ý/³é\u0088på\u0097àZ´\u0011\u007fWÒ¶V~\u0011\u0003rù\u0093²Ú¨²ÄN`D%Sh\u001f±\u009a:_\u009c¦æh\u0080\u0001\u009dÞþ\nF¹E\u001eV\u000f>]\u009b§þ/\u0092\u0090ËkôaEDøµçºð\u008cSÁÖåÖ\u0014\u0001\u00195\u0018\u0012\u0097¬$\u008d\u001b½àI\u009eØwcôÓñwzo\u0002a£";
                  int var4 = "\u0084%F¼W\u009bi\u008d¯@Qp0±i;iæZ\u0017.\u0014kùõ\u0099_Ã\\\u009f0F|ô&{\u0006¾ý/³é\u0088på\u0097àZ´\u0011\u007fWÒ¶V~\u0011\u0003rù\u0093²Ú¨²ÄN`D%Sh\u001f±\u009a:_\u009c¦æh\u0080\u0001\u009dÞþ\nF¹E\u001eV\u000f>]\u009b§þ/\u0092\u0090ËkôaEDøµçºð\u008cSÁÖåÖ\u0014\u0001\u00195\u0018\u0012\u0097¬$\u008d\u001b½àI\u009eØwcôÓñwzo\u0002a£"
                     .length();
                  char var1 = '{';
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 114;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 114;
                           var10006 = var6;
                        } else {
                           var13 = 114;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 114;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 68;
                              case 1 -> 91;
                              case 2 -> 105;
                              case 3 -> 102;
                              case 4 -> 65;
                              case 5 -> 113;
                              default -> 49;
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

               private static String a(int var0, int var1) { int var5 = 0; // PX-FIX hoist
        
                  int var2 = (var0 ^ -3622) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 251;
                        case 1 -> 227;
                        case 2 -> 131;
                        case 3 -> 69;
                        case 4 -> 212;
                        case 5 -> 72;
                        case 6 -> 217;
                        case 7 -> 180;
                        case 8 -> 118;
                        case 9 -> 2;
                        case 10 -> 185;
                        case 11 -> 218;
                        case 12 -> 182;
                        case 13 -> 48;
                        case 14 -> 113;
                        case 15 -> 208;
                        case 16 -> 43;
                        case 17 -> 172;
                        case 18 -> 247;
                        case 19 -> 151;
                        case 20 -> 133;
                        case 21 -> 93;
                        case 22 -> 45;
                        case 23 -> 60;
                        case 24 -> 53;
                        case 25 -> 62;
                        case 26 -> 37;
                        case 27 -> 88;
                        case 28 -> 176;
                        case 29 -> 0;
                        case 30 -> 32;
                        case 31 -> 162;
                        case 32 -> 204;
                        case 33 -> 250;
                        case 34 -> 214;
                        case 35 -> 149;
                        case 36 -> 132;
                        case 37 -> 134;
                        case 38 -> 35;
                        case 39 -> 211;
                        case 40 -> 142;
                        case 41 -> 236;
                        case 42 -> 13;
                        case 43 -> 85;
                        case 44 -> 128;
                        case 45 -> 18;
                        case 46 -> 109;
                        case 47 -> 235;
                        case 48 -> 17;
                        case 49 -> 252;
                        case 50 -> 198;
                        case 51 -> 138;
                        case 52 -> 22;
                        case 53 -> 82;
                        case 54 -> 205;
                        case 55 -> 56;
                        case 56 -> 63;
                        case 57 -> 194;
                        case 58 -> 224;
                        case 59 -> 213;
                        case 60 -> 201;
                        case 61 -> 28;
                        case 62 -> 164;
                        case 63 -> 81;
                        case 64 -> 226;
                        case 65 -> 165;
                        case 66 -> 231;
                        case 67 -> 145;
                        case 68 -> 54;
                        case 69 -> 26;
                        case 70 -> 71;
                        case 71 -> 228;
                        case 72 -> 122;
                        case 73 -> 78;
                        case 74 -> 7;
                        case 75 -> 111;
                        case 76 -> 199;
                        case 77 -> 123;
                        case 78 -> 64;
                        case 79 -> 40;
                        case 80 -> 188;
                        case 81 -> 21;
                        case 82 -> 41;
                        case 83 -> 141;
                        case 84 -> 99;
                        case 85 -> 79;
                        case 86 -> 207;
                        case 87 -> 129;
                        case 88 -> 119;
                        case 89 -> 220;
                        case 90 -> 31;
                        case 91 -> 137;
                        case 92 -> 100;
                        case 93 -> 102;
                        case 94 -> 11;
                        case 95 -> 147;
                        case 96 -> 197;
                        case 97 -> 65;
                        case 98 -> 50;
                        case 99 -> 170;
                        case 100 -> 187;
                        case 101 -> 154;
                        case 102 -> 42;
                        case 103 -> 152;
                        case 104 -> 177;
                        case 105 -> 36;
                        case 106 -> 15;
                        case 107 -> 253;
                        case 108 -> 203;
                        case 109 -> 249;
                        case 110 -> 39;
                        case 111 -> 192;
                        case 112 -> 233;
                        case 113 -> 186;
                        case 114 -> 202;
                        case 115 -> 112;
                        case 116 -> 94;
                        case 117 -> 70;
                        case 118 -> 74;
                        case 119 -> 90;
                        case 120 -> 44;
                        case 121 -> 91;
                        case 122 -> 209;
                        case 123 -> 156;
                        case 124 -> 136;
                        case 125 -> 57;
                        case 126 -> 58;
                        case 127 -> 175;
                        case 128 -> 140;
                        case 129 -> 55;
                        case 130 -> 73;
                        case 131 -> 46;
                        case 132 -> 243;
                        case 133 -> 135;
                        case 134 -> 84;
                        case 135 -> 171;
                        case 136 -> 153;
                        case 137 -> 124;
                        case 138 -> 146;
                        case 139 -> 221;
                        case 140 -> 181;
                        case 141 -> 230;
                        case 142 -> 14;
                        case 143 -> 77;
                        case 144 -> 155;
                        case 145 -> 195;
                        case 146 -> 200;
                        case 147 -> 52;
                        case 148 -> 20;
                        case 149 -> 47;
                        case 150 -> 83;
                        case 151 -> 4;
                        case 152 -> 144;
                        case 153 -> 190;
                        case 154 -> 51;
                        case 155 -> 25;
                        case 156 -> 96;
                        case 157 -> 1;
                        case 158 -> 101;
                        case 159 -> 163;
                        case 160 -> 248;
                        case 161 -> 139;
                        case 162 -> 160;
                        case 163 -> 150;
                        case 164 -> 148;
                        case 165 -> 16;
                        case 166 -> 89;
                        case 167 -> 27;
                        case 168 -> 191;
                        case 169 -> 216;
                        case 170 -> 167;
                        case 171 -> 237;
                        case 172 -> 115;
                        case 173 -> 254;
                        case 174 -> 107;
                        case 175 -> 75;
                        case 176 -> 106;
                        case 177 -> 161;
                        case 178 -> 67;
                        case 179 -> 117;
                        case 180 -> 239;
                        case 181 -> 86;
                        case 182 -> 49;
                        case 183 -> 255;
                        case 184 -> 245;
                        case 185 -> 126;
                        case 186 -> 29;
                        case 187 -> 6;
                        case 188 -> 34;
                        case 189 -> 59;
                        case 190 -> 5;
                        case 191 -> 184;
                        case 192 -> 38;
                        case 193 -> 232;
                        case 194 -> 242;
                        case 195 -> 105;
                        case 196 -> 223;
                        case 197 -> 179;
                        case 198 -> 219;
                        case 199 -> 143;
                        case 200 -> 116;
                        case 201 -> 80;
                        case 202 -> 166;
                        case 203 -> 114;
                        case 204 -> 92;
                        case 205 -> 178;
                        case 206 -> 234;
                        case 207 -> 169;
                        case 208 -> 229;
                        case 209 -> 110;
                        case 210 -> 3;
                        case 211 -> 130;
                        case 212 -> 222;
                        case 213 -> 215;
                        case 214 -> 24;
                        case 215 -> 95;
                        case 216 -> 66;
                        case 217 -> 30;
                        case 218 -> 108;
                        case 219 -> 19;
                        case 220 -> 97;
                        case 221 -> 174;
                        case 222 -> 238;
                        case 223 -> 104;
                        case 224 -> 121;
                        case 225 -> 183;
                        case 226 -> 240;
                        case 227 -> 193;
                        case 228 -> 168;
                        case 229 -> 206;
                        case 230 -> 9;
                        case 231 -> 61;
                        case 232 -> 189;
                        case 233 -> 33;
                        case 234 -> 103;
                        case 235 -> 120;
                        case 236 -> 225;
                        case 237 -> 244;
                        case 238 -> 246;
                        case 239 -> 10;
                        case 240 -> 210;
                        case 241 -> 127;
                        case 242 -> 159;
                        case 243 -> 98;
                        case 244 -> 68;
                        case 245 -> 241;
                        case 246 -> 8;
                        case 247 -> 196;
                        case 248 -> 87;
                        case 249 -> 23;
                        case 250 -> 125;
                        case 251 -> 76;
                        case 252 -> 158;
                        case 253 -> 12;
                        case 254 -> 157;
                        default -> 173;
                     };
                      var5 = (var1 & 0xFF) - var4;
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
   public void aC() { String var5 = null; // PX-FIX hoist
        
      Object var14 = null; // PX-FIX
      Object var13 = null; // PX-FIX
      Object var10 = null; // PX-FIX
      String var1;
      label204: {
         label190: {
            String var10000 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
            this.bb();
            var1 = var10000;
            int var9 = ((int[])(Object)(IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl))[this.W()
               .ordinal()];
            if (var1 != null) {
               switch (var9) {
                  case 1:
                     var9 = ((this.aK()) ? 1 : 0);
                     break;
                  case 2:
                     break label190;
                  case 3:
                     break label204;
                  default:
                     return;
               }
            }

            label176: {
               label175: {
                  label174: {
                     if (var1 != null) {
                        if (var9 == 0) {
                           return;
                        }

                        var10 = this;
                        if (var1 == null) {
                           break label174;
                        }

                        var9 = ((int[])(Object)(IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII))[this.aJ()
                           .a()
                           .ordinal()];
                     }

                     switch (var9) {
                        case 1:
                           var10 = this;
                           break;
                        case 2:
                           break label175;
                        default:
                           break label176;
                     }
                  }

                  this.a9();
                  if (var1 != null) {
                     return;
                  }
               }

               this.a(
                  IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
                  2000
               );
            }

            if (var1 != null) {
               return;
            }
         }

         llIlIlIIlIIlIlIllIIIIIIIIlIIIIlIIlIIllllllIIIllIIllllIlIlllIIIIllIIIIlllllIlIIllllIIl var11 = ((llIlIlIIlIIlIlIllIIIIIIIIlIIIIlIIlIIllllllIIIllIIllllIlIlllIIIIllIIIIlllllIlIIllllIIl)(Object)(this));
         if (var1 != null) {
            if (this.a6() > CollectionsKt.getLastIndex(this.ac())) {
               this.a(0);
               return;
            }

            var11 = ((llIlIlIIlIIlIlIllIIIIIIIIlIIIIlIIlIIllllllIIIllIIllllIlIlllIIIIllIIIIlllllIlIIllllIIl)(Object)(this.ac().get(this.a6())));
            short var10002 = -19528;
            short var10003 = -19678;
            Intrinsics.checkNotNullExpressionValue(var11, "get(...)");
         }

         IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var2 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)(Object)var11;
         int var12 = ((int[])(Object)(IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl))[var2.b()
            .ordinal()];
         if (var1 != null) {
            label193: {
               switch (var12) {
                  case 2:
                     var13 = lIIllIIlIIlllllIIIllllllIIIlllIlIlIllIlllllllIlIllIllIIIIIIlIIIllIIllIlIIIllllIlIlIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                        .a()
                        .a();
                     label128:
                     if (var1 != null) {
                        if ((me.octo.client.PxTruth.truth(var13))) {
                           var13 = this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII;
                           if (var1 == null) {
                              break label128;
                           }

                           if (!this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII) {
                              Object var29;
                              BlockPos var10001;
                              label147: {
                                 label206: {
                                    this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = true;
                                    var14 = lIIllIIlIIlllllIIIllllllIIIlllIlIlIllIlllllllIlIllIllIIIIIIlIIIllIIllIlIIIllllIlIlIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                                       .a();
                                    var10001 = var2.a();
                                    var29 = ((BlockPos)(Object)(this));
                                    label134:
                                    if (var1 != null) {
                                       label143: {
                                          if (this.a6() > 0) {
                                             var29 = ((BlockPos)(Object)(this.ac().get(this.a6() - 1).b()));
                                             if (var1 == null) {
                                                break label206;
                                             }

                                             if (var29
                                                == IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                                                )
                                              {
                                                break label143;
                                             }

                                             var29 = ((BlockPos)(Object)(this.ac().get(this.a6() - 1).b()));
                                             if (var1 == null) {
                                                break label134;
                                             }

                                             if (var29
                                                == IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                                                )
                                              {
                                                break label143;
                                             }
                                          }

                                          var29 = ((BlockPos)(Object)(this.ac().get(this.a6())));
                                          break label134;
                                       }

                                       var29 = ((BlockPos)(Object)(this.ac().get(this.a6() - 1)));
                                       break label206;
                                    }

                                    var29 = ((IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)(Object)var29).a();
                                    break label147;
                                 }

                                 var29 = ((IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)(Object)var29).a();
                              }

                              ((me.octo.client.PXDyn)var14).a(var10001, var29);
                              if (var1 != null) {
                                 return;
                              }
                           }
                        }

                        var13 = lIIllIIlIIlllllIIIllllllIIIlllIlIlIllIlllllllIlIllIllIIIIIIlIIIllIIllIlIIIllllIlIlIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                           .a()
                           .b();
                     }

                     if (var1 != null) {
                        if ((me.octo.client.PxTruth.truth(var13))) {
                           return;
                        }

                        this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = false;
                        lIIllIIlIIlllllIIIllllllIIIlllIlIlIllIlllllllIlIllIllIIIIIIlIIIllIIllIlIIIllllIlIlIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                           .a()
                           .f();
                        var13 = this.a6();
                     }

                     int var4 =((Integer)( var13));
                     this.a(var4 + 1);
                     if (var1 != null) {
                        return;
                     }
                  case 1:
                     BlockPos var22;
                     Integer var31;
                     label123: {
                        var11 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                           .f();
                        var22 = var2.a();
                        if (var1 != null) {
                           me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var30 = this.X();
                           if (var30 != null) {
                              var31 = var30.b();
                              break label123;
                           }
                        }

                        var31 = null;
                     }

                     boolean var16 = var11.a(var22, var31);
                     if (var1 != null) {
                        if (var16) {
                           int var6 = this.a6();
                           this.a(var6 + 1);
                        }

                        var16 = ((java.util.function.Supplier<Boolean>)(() -> { this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.a(30000); return false; })).get();
                     }

                     if (!var16) {
                        return;
                     }

                     IIlIllIIIlIIIlIIIIllllIlIllIIlIIIIlllIIlllIlllIllllIIIlIIlIIIlIlIIIIIlIIIlIIIlIllIlIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
                        .a(true);
                     if (var1 != null) {
                        return;
                     }
                  case 3:
                     break;
                  default:
                     break label193;
               }

               boolean var17 = lIIllIIlIIlllllIIIllllllIIIlllIlIlIllIlllllllIlIllIllIIIIIIlIIIllIIllIlIIIllllIlIlIIl.a(this, var2, 0.0, null);
               if (var1 != null) {
                  if (var17) {
                     int var7 = this.a6();
                     this.a(var7 + 1);
                     IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                        .e()
                        .k();
                     if (var1 != null) {
                        return;
                     }
                  }

                  var17 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                     .e()
                     .d();
               }

               if (var1 != null) {
                  if (!var17) {
                     return;
                  }

                  IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                     ((BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                        .e())),
                     ((IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll)(Object)(var2.a())),
                     0,
                     false);
               }

               if (var1 != null) {
                  return;
               }
            }

            var12 = this.a6();
         }

         int var8 = var12;
         this.a(var8 + 1);
         if (var1 != null) {
            return;
         }
      }

      String var20;
      label199: {
          var5 = lIIllllIlllllIIIIlllIIIlllllllIllllllIIIIlIlIIIIllIIlIlIlllIIlIllIIlIIIlIlllllIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a()
            .y();
         short var23 = -19522;
         short var32 = 14666;
         boolean var18 = Intrinsics.areEqual(var5, "Skip");
         if (var1 != null) {
            if (var18) {
               short var19 = -19543;
               var23 = 16715;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                  "Skipping regenerating tree..."
               );
               lIIllIIlIIlllllIIIllllllIIIlllIlIlIllIlllllllIlIllIllIIIIIIlIIIllIIllIlIIIllllIlIlIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                  .a()
                  .f();
               this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = false;
               int var3 = this.a6();
               this.a(var3 + 1);
               this.a(
                  IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
               );
               if (var1 != null) {
                  return;
               }
            }

            var20 = var5;
            if (var1 == null) {
               break label199;
            }

            var23 = -19550;
            var32 = -4486;
            var18 = Intrinsics.areEqual(var5, "Swap Lobbies");
         }

         if (!var18) {
            return;
         }

         short var21 = -19537;
         var23 = -31189;
         var20 = "Regenerating tree, swapping lobbies...";
      }

      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(var20);
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
      );
      this.a(
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         5000
      );
   }

   @Override
   public void a9() {
      String var1;
      label32: {
         IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll var2;
         label36: {
            var1 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
            boolean var10000 = this.ac().isEmpty();
            if (var1 != null) {
               if (var10000) {
                  short var3 = -19540;
                  short var10001 = -15009;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                     "§cRoute is empty! Cannot start foraging."
                  );
                  this.N();
                  return;
               }

               var2 = this;
               if (var1 == null) {
                  break label36;
               }

               var10000 = this.a8();
            }

            if (!var10000) {
               break label32;
            }

            var2 = this;
         }

         var2.a7();
         if (var1 != null) {
            return;
         }
      }

      if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
         == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
         )
       {
         this.a7();
         if (var1 != null) {
            return;
         }
      }

      this.a(
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         2000
      );
   }

   private final void bb() {
      if (IIlIllIIIlIIIlIIIIllllIlIllIIlIIIIlllIIlllIlllIllllIIIlIIlIIIlIlIIIIIlIIIlIIIlIllIlIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            .a()
         && IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g()
            == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         )
       {
         this.a(
            IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
            10000
         );
         IIlIllIIIlIIIlIIIIllllIlIllIIlIIIIlllIIlllIlllIllllIIIlIIlIIIlIlIIIIIlIIIlIIIlIllIlIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            .a(false);
      }
   }

   private final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      this.ae()
         .a(
            new lllIllIIllIIIIIIIlIIlIIIIIllllIlIIIIIllllIIlIIIIlllIIIIIIlIIIIlIlIIIIllIIllIIlllIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
               (kotlin.jvm.functions.Function1)(IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll::f),
               var1.d(),
               0,
               0,
               0L,
               0,
               (kotlin.jvm.functions.Function1)(IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll::g),
               120,
               null
            )
         );
   }

   private final void bc() {
      this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = false;
      this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.f();
      lIIllIIlIIlllllIIIllllllIIIlllIlIlIllIlllllllIlIllIllIIIIIIlIIIllIIllIlIIIllllIlIlIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
         .a()
         .f();
      this.aO();
   }

   @Override
   public void M() {
      String var1;
      boolean var3;
      boolean var4;
      boolean var5;
      boolean var7;
      String var10000 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      this.aM();
      var1 = var10000;
      boolean var2 = this.a5() != null;
      var3 = this.X() != null;
      var4 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
         == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      this.a(
         IlIIllIIIIlIllIlIlIlIIIlllIIIIIIlllllIlllIlllllIlIlllllIIIIIIlIlIIIllIIllIIlIllIllIIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
            .o()
      );
      var5 = this.ac().isEmpty();
      this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.f();
      var7 = var2;
      label77:
      if (var1 != null) {
         if (var2) {
            var7 = var3;
            if (var1 == null) {
               break label77;
            }

            if (var3) {
               var7 = var4;
               if (var1 == null) {
                  break label77;
               }

               if (var4) {
                  var7 = var5;
                  if (var1 == null) {
                     break label77;
                  }

                  if (!var5) {
                     super.M();
                     llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI[] var6 = new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI[]{
                        new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
                           llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                           null,
                           true
                        ),
                        new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
                           llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                           IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll::bd,
                           false
                        ),
                        new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
                           llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
                           IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll::be,
                           false
                        ),
                        new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
                           llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
                           IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll::bf,
                           false
                        )
                     };
                     this.a(CollectionsKt.listOf(var6));
                     this.a9();
                     return;
                  }
               }
            }
         }

         var7 = var2;
      }

      if (var1 != null) {
         if (!var7) {
            this.a_();
         }

         var7 = var3;
      }

      if (var1 != null) {
         if (!var7) {
            this.aP();
         }

         var7 = var4;
      }

      if (var1 != null) {
         if (!var7) {
            this.b(
               CollectionsKt.listOf(
                  IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
               )
            );
         }

         var7 = var5;
      }

      label60: {
         if (var1 != null) {
            if (!var7) {
               break label60;
            }

            var7 = var4;
         }

         if (var7) {
            String var8 = IlIIllIIIIlIllIlIlIlIIIlllIIIIIIlllllIlllIlllllIlIlllllIIIIIIlIlIIIllIIllIIlIllIllIIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
               .f();
            short var10001 = -19548;
            short var10002 = -26694;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "§cRoute is empty! Create one with /" + var8
            );
         }
      }

      this.N();
   }

   @SubscribeEvent
   public final void c(@NotNull me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      String var10000 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      short var10002 = -19545;
      short var10003 = 30582;
      Intrinsics.checkNotNullParameter(var1, "event");
      String var2 = var10000;
      Packet var4 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      if (var2 != null) {
         if (!(var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI instanceof ClientboundSystemChatPacket)) {
            return;
         }

         var4 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      var10000 = ((ClientboundSystemChatPacket)var4).content().getString();
      var10002 = -19546;
      var10003 = 1425;
      Intrinsics.checkNotNullExpressionValue(var10000, "getString(...)");
      String var3 = var10000;
      short var10001 = -19542;
      var10002 = 19340;
      if (StringsKt.startsWith(var3, "You cannot damage a tree while it is regenerating!", false)) {
         this.a(
            IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll
         );
      }
   }

   @SubscribeEvent
   public final void d(@NotNull me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      String var2 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var10000 = var1;
      if (var2 != null) {
         short var10001 = -19552;
         short var10002 = -12450;
         Intrinsics.checkNotNullParameter(var1, "event");
         if (!me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m()) {
            return;
         }

         var10000 = var1;
      }

      if (var10000.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI != null) {
         IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll var4 = this;
         if (var2 != null) {
            if (this.W()
               == IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
               )
             {
               var10000 = ((me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll)(Object)(this.ac().get(this.a6())));
               short var6 = -19549;
               short var10003 = 11134;
               Intrinsics.checkNotNullExpressionValue(var10000, "get(...)");
               IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var3 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)(Object)var10000;
               if (var2 != null) {
                  if (var3.b()
                     == IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                     )
                   {
                     if (!(
                        var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI instanceof ClientboundPlayerPositionPacket
                     )) {
                        return;
                     }

                     this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.f();
                     if (var2 != null) {
                        return;
                     }
                  }

                  this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.f();
               }

               if (var2 != null) {
                  return;
               }
            }

            var4 = this;
         }

         var4.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.f();
      }
   }

   @Override
   public boolean af() {
      return this.W()
         == IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   }

   @Override
   public void N() {
      this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = false;
      this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.f();
      lIIllIIlIIlllllIIIllllllIIIlllIlIlIllIlllllllIlIllIllIIIIIIlIIIllIIllIlIIIllllIlIlIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
         .a()
         .f();
      this.aN();
      super.N();
   }

   private static final long a(IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll var0) {
      return var0.aJ().b() + 15000L;
   }

   private static final Object b(IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll var0) {
      return TuplesKt.to(
         var0.aJ().a(),
         IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
      );
   }

   private static final long c(IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll var0) {
      IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var2;
      label25: {
         String var1 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
         if (var1 != null) {
            IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var10000 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)CollectionsKt.getOrNull(
               var0.ac(), var0.a6()
            );
            if (var10000 != null) {
               var2 = var10000.b();
               break label25;
            }
         }

         var2 = null;
      }
      return switch (var2 == null
         ? -1
         : ((int[])(Object)(IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl))[var2.ordinal()]) {
         case 1 -> 35000L;
         case 2 -> 45000L;
         default -> 25000L;
      };
   }

   private static final Object d(IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll var0) {
      IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var10003 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)CollectionsKt.getOrNull(
         var0.ac(), var0.a6()
      );
      return new IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         var0.a6(),
         var10003 != null ? var10003.b() : null,
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .e()
            .d(),
         var0.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII,
         lIIllIIlIIlllllIIIllllllIIIlllIlIlIllIlllllllIlIllIllIIIIIIlIIIllIIllIlIIIllllIlIlIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
            .a()
            .c(),
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(var0, 0.0, 1, null)
      );
   }

   private static final Object e(IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll var0) {
      return TuplesKt.to(
         lIIllllIlllllIIIIlllIIIlllllllIllllllIIIIlIlIIIIllIIlIlIlllIIlIllIIlIIIlIlllllIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a()
            .y(),
         var0.a6()
      );
   }

   private static final Unit f(IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll var0) {
      var0.a9();
      return Unit.INSTANCE;
   }

   private static final Unit g(IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll var0) {
      var0.bc();
      return Unit.INSTANCE;
   }

   private static final boolean h(IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll var0) {
      String var1 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      boolean var10000 = var0.af();
      if (var1 != null) {
         if (!var10000) {
            return false;
         }

         var10000 = lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            .b();
      }

      return var1 == null ? var10000 : var10000;
   }

   private static final boolean bd() {
      return IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .e();
   }

   private static final boolean be() {
      return IlllIIIIlIlllIlllllIlIlIIllIlllIlIIllllllIlllllIllIllllIllIIIllIIlIlIlllIIlIllIIlIlll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .a();
   }

   private static final boolean bf() {
      return IIlIllIIIlIIIlIIIIllllIlIllIIlIIIIlllIIlllIlllIllllIIIlIIlIIIlIlIIIIIlIIIlIIIlIllIlIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .b();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static { String[] var5 = null; // PX-FIX hoist
        
      char[] var20 = null; // PX-FIX
       var5 = new String[23];
      int var3 = 0;
      String var2 = "\t\u0013\"ªµ¶\"Ë\u0019,ïa¡¿G\r1\u007fü¿ð\u0013/·ïã¸*X\u0081\u0015\u0004uMg55A-9*:_~Á{\u0002Øñ}aÊ*\t\u008fÛ5nâa\u0099Ü\u008d+)ìæ5\u0095â\u008eg3Ò¤&Ì`r\u0001\u0099³è\u0013\u0003©\u001734ÿm\u0019\u001bàvÌDöëfÜ[g&Ës\u0004jùôÄñ-\u0018\u0099¼¥B%*ÿ\b\u008aÎ(b\u0011s\u009dâ\u0085õ\u0090\b\u0093I©w(ÎË\u001e&PÑ\\8W\u001f\b\u009b\u0099\u0080¹fWmÂib¨\u0095à¥â^²S\u001a¥\u00008'é\tt\u0010{àm6\u001dÖÔ\u0088D¹\u008a\rµßM\u0012nû\u0002\u0014l(m½,¾ÁÕl\u008dHCÄj2\u008dN´Ã²(\u001dá\u0092éX?[H\u0080S:is<}\u0016Í\u0099ø\u0011Fø\u0006Ã\u0003p¬\u007f,\u007f\u001c\u0082j\u0097ô=õ\u008b\u0014\u0091:³N3%6Xó\u000b´:á=é\u007f=w\u008d\u008f?ú[-IýîTú¹\u00810xáR\u0084¨\u0005°¢Ð£7#-þ¦\u0017%\u00010=[ò§º¨Äfb\u0015\u0092x\u0011k¸-=×\u009d¥~ð\u008cQÔ\u009aU3\bëÿ\u0083´·§9\u0010\u000eÒh§?æ¹e¢rÝC$¸l\u0005f@bvm\u0005Ó{Ô\u0011»\u0012\u0016.\u0003Ai\u0015\u009c\u008cwÅý}C\u0001êZ`\u0083\f\u0082\u0006\n\u0081°\u0017w\u0082ó\u0015\u009d\t\bIÌÔÐÒ\fµ\u0084\u0012¥zuË§DE¦L\u0080\u009aÕ¯+yÑÛ,\u0013\u0000\u0086ÁT1·\u0097Ø\u0016OÑ,Æ\u0012I$a\u0004d\u0004c~>\u0011,\u0019Ü\u009avd\u0090üwï¡ \u0080À½\u0092\u008epú\t\u000fp\u000eymÑÕf|´ñ\u0012×\u001cTÄ\u0014 *\u0089ö5¢þð\b3ö\u009b\u0097;ä\u0088\u0099";
      int var4 = "\t\u0013\"ªµ¶\"Ë\u0019,ïa¡¿G\r1\u007fü¿ð\u0013/·ïã¸*X\u0081\u0015\u0004uMg55A-9*:_~Á{\u0002Øñ}aÊ*\t\u008fÛ5nâa\u0099Ü\u008d+)ìæ5\u0095â\u008eg3Ò¤&Ì`r\u0001\u0099³è\u0013\u0003©\u001734ÿm\u0019\u001bàvÌDöëfÜ[g&Ës\u0004jùôÄñ-\u0018\u0099¼¥B%*ÿ\b\u008aÎ(b\u0011s\u009dâ\u0085õ\u0090\b\u0093I©w(ÎË\u001e&PÑ\\8W\u001f\b\u009b\u0099\u0080¹fWmÂib¨\u0095à¥â^²S\u001a¥\u00008'é\tt\u0010{àm6\u001dÖÔ\u0088D¹\u008a\rµßM\u0012nû\u0002\u0014l(m½,¾ÁÕl\u008dHCÄj2\u008dN´Ã²(\u001dá\u0092éX?[H\u0080S:is<}\u0016Í\u0099ø\u0011Fø\u0006Ã\u0003p¬\u007f,\u007f\u001c\u0082j\u0097ô=õ\u008b\u0014\u0091:³N3%6Xó\u000b´:á=é\u007f=w\u008d\u008f?ú[-IýîTú¹\u00810xáR\u0084¨\u0005°¢Ð£7#-þ¦\u0017%\u00010=[ò§º¨Äfb\u0015\u0092x\u0011k¸-=×\u009d¥~ð\u008cQÔ\u009aU3\bëÿ\u0083´·§9\u0010\u000eÒh§?æ¹e¢rÝC$¸l\u0005f@bvm\u0005Ó{Ô\u0011»\u0012\u0016.\u0003Ai\u0015\u009c\u008cwÅý}C\u0001êZ`\u0083\f\u0082\u0006\n\u0081°\u0017w\u0082ó\u0015\u009d\t\bIÌÔÐÒ\fµ\u0084\u0012¥zuË§DE¦L\u0080\u009aÕ¯+yÑÛ,\u0013\u0000\u0086ÁT1·\u0097Ø\u0016OÑ,Æ\u0012I$a\u0004d\u0004c~>\u0011,\u0019Ü\u009avd\u0090üwï¡ \u0080À½\u0092\u008epú\t\u000fp\u000eymÑÕf|´ñ\u0012×\u001cTÄ\u0014 *\u0089ö5¢þð\b3ö\u009b\u0097;ä\u0088\u0099"
         .length();
      char var1 = '(';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 94;
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
                     case 0 -> 55;
                     case 1 -> 3;
                     case 2 -> 113;
                     case 3 -> 93;
                     case 4 -> 39;
                     case 5 -> 43;
                     default -> 91;
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
                     k = new String[23];
                     llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = new IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
                     lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = new IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll();
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

                  var2 = "Õ¤x\u0013\u0005\\\u0012¦¥\u0083¤¶kDè:ºá#C`9Ø\u001d\u007fZdÁÃÇ8jf\u0015ÝÔÒöÃ\b\u0000C\u00184\u0088\u0080ë.\u009d\u0013Sõz";
                  var4 = "Õ¤x\u0013\u0005\\\u0012¦¥\u0083¤¶kDè:ºá#C`9Ø\u001d\u007fZdÁÃÇ8jf\u0015ÝÔÒöÃ\b\u0000C\u00184\u0088\u0080ë.\u009d\u0013Sõz".length();
                  var1 = 23;
                  var8 = -1;
            }

            var10000 = 20;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String e(int var0, int var1) { int var5 = 0; // PX-FIX hoist
        
      int var2 = (var0 ^ -19540) & 65535;
      if (k[var2] == null) {
         char[] var3 = j[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 15;
            case 1 -> 139;
            case 2 -> 168;
            case 3 -> 103;
            case 4 -> 243;
            case 5 -> 161;
            case 6 -> 226;
            case 7 -> 58;
            case 8 -> 180;
            case 9 -> 88;
            case 10 -> 241;
            case 11 -> 71;
            case 12 -> 197;
            case 13 -> 249;
            case 14 -> 148;
            case 15 -> 12;
            case 16 -> 253;
            case 17 -> 56;
            case 18 -> 34;
            case 19 -> 77;
            case 20 -> 163;
            case 21 -> 10;
            case 22 -> 114;
            case 23 -> 100;
            case 24 -> 228;
            case 25 -> 141;
            case 26 -> 183;
            case 27 -> 113;
            case 28 -> 129;
            case 29 -> 133;
            case 30 -> 22;
            case 31 -> 8;
            case 32 -> 55;
            case 33 -> 237;
            case 34 -> 238;
            case 35 -> 122;
            case 36 -> 117;
            case 37 -> 231;
            case 38 -> 57;
            case 39 -> 17;
            case 40 -> 62;
            case 41 -> 50;
            case 42 -> 1;
            case 43 -> 147;
            case 44 -> 218;
            case 45 -> 80;
            case 46 -> 232;
            case 47 -> 255;
            case 48 -> 107;
            case 49 -> 203;
            case 50 -> 13;
            case 51 -> 222;
            case 52 -> 195;
            case 53 -> 18;
            case 54 -> 193;
            case 55 -> 138;
            case 56 -> 199;
            case 57 -> 23;
            case 58 -> 72;
            case 59 -> 64;
            case 60 -> 173;
            case 61 -> 178;
            case 62 -> 205;
            case 63 -> 26;
            case 64 -> 134;
            case 65 -> 30;
            case 66 -> 166;
            case 67 -> 208;
            case 68 -> 215;
            case 69 -> 135;
            case 70 -> 36;
            case 71 -> 189;
            case 72 -> 96;
            case 73 -> 137;
            case 74 -> 201;
            case 75 -> 234;
            case 76 -> 157;
            case 77 -> 116;
            case 78 -> 244;
            case 79 -> 66;
            case 80 -> 35;
            case 81 -> 20;
            case 82 -> 184;
            case 83 -> 108;
            case 84 -> 105;
            case 85 -> 217;
            case 86 -> 242;
            case 87 -> 90;
            case 88 -> 251;
            case 89 -> 106;
            case 90 -> 229;
            case 91 -> 124;
            case 92 -> 33;
            case 93 -> 43;
            case 94 -> 216;
            case 95 -> 136;
            case 96 -> 152;
            case 97 -> 42;
            case 98 -> 44;
            case 99 -> 247;
            case 100 -> 121;
            case 101 -> 87;
            case 102 -> 185;
            case 103 -> 27;
            case 104 -> 85;
            case 105 -> 172;
            case 106 -> 206;
            case 107 -> 24;
            case 108 -> 40;
            case 109 -> 128;
            case 110 -> 140;
            case 111 -> 39;
            case 112 -> 51;
            case 113 -> 170;
            case 114 -> 45;
            case 115 -> 145;
            case 116 -> 132;
            case 117 -> 76;
            case 118 -> 186;
            case 119 -> 223;
            case 120 -> 167;
            case 121 -> 69;
            case 122 -> 78;
            case 123 -> 4;
            case 124 -> 164;
            case 125 -> 82;
            case 126 -> 176;
            case 127 -> 156;
            case 128 -> 246;
            case 129 -> 221;
            case 130 -> 67;
            case 131 -> 144;
            case 132 -> 37;
            case 133 -> 112;
            case 134 -> 46;
            case 135 -> 143;
            case 136 -> 204;
            case 137 -> 98;
            case 138 -> 196;
            case 139 -> 154;
            case 140 -> 99;
            case 141 -> 16;
            case 142 -> 153;
            case 143 -> 187;
            case 144 -> 236;
            case 145 -> 146;
            case 146 -> 6;
            case 147 -> 192;
            case 148 -> 198;
            case 149 -> 70;
            case 150 -> 202;
            case 151 -> 94;
            case 152 -> 91;
            case 153 -> 89;
            case 154 -> 7;
            case 155 -> 177;
            case 156 -> 32;
            case 157 -> 60;
            case 158 -> 41;
            case 159 -> 47;
            case 160 -> 49;
            case 161 -> 142;
            case 162 -> 59;
            case 163 -> 213;
            case 164 -> 219;
            case 165 -> 68;
            case 166 -> 191;
            case 167 -> 92;
            case 168 -> 61;
            case 169 -> 73;
            case 170 -> 54;
            case 171 -> 235;
            case 172 -> 188;
            case 173 -> 214;
            case 174 -> 0;
            case 175 -> 252;
            case 176 -> 239;
            case 177 -> 63;
            case 178 -> 115;
            case 179 -> 227;
            case 180 -> 29;
            case 181 -> 224;
            case 182 -> 160;
            case 183 -> 245;
            case 184 -> 225;
            case 185 -> 211;
            case 186 -> 127;
            case 187 -> 181;
            case 188 -> 31;
            case 189 -> 109;
            case 190 -> 25;
            case 191 -> 95;
            case 192 -> 190;
            case 193 -> 162;
            case 194 -> 93;
            case 195 -> 210;
            case 196 -> 131;
            case 197 -> 79;
            case 198 -> 159;
            case 199 -> 151;
            case 200 -> 179;
            case 201 -> 38;
            case 202 -> 220;
            case 203 -> 97;
            case 204 -> 182;
            case 205 -> 104;
            case 206 -> 110;
            case 207 -> 2;
            case 208 -> 248;
            case 209 -> 5;
            case 210 -> 250;
            case 211 -> 11;
            case 212 -> 165;
            case 213 -> 230;
            case 214 -> 86;
            case 215 -> 3;
            case 216 -> 155;
            case 217 -> 130;
            case 218 -> 254;
            case 219 -> 171;
            case 220 -> 149;
            case 221 -> 233;
            case 222 -> 212;
            case 223 -> 14;
            case 224 -> 74;
            case 225 -> 118;
            case 226 -> 19;
            case 227 -> 28;
            case 228 -> 207;
            case 229 -> 53;
            case 230 -> 84;
            case 231 -> 21;
            case 232 -> 48;
            case 233 -> 174;
            case 234 -> 158;
            case 235 -> 194;
            case 236 -> 119;
            case 237 -> 75;
            case 238 -> 169;
            case 239 -> 200;
            case 240 -> 125;
            case 241 -> 123;
            case 242 -> 102;
            case 243 -> 120;
            case 244 -> 111;
            case 245 -> 81;
            case 246 -> 209;
            case 247 -> 65;
            case 248 -> 9;
            case 249 -> 150;
            case 250 -> 83;
            case 251 -> 52;
            case 252 -> 126;
            case 253 -> 175;
            case 254 -> 101;
            default -> 240;
         };
          var5 = (var1 & 0xFF) - var4;
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

   private static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
public static me.octo.client.IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(me.octo.client.IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1, int var2, me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var3, boolean var4, boolean var5, me.octo.client.IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var6, Triple<Integer, Integer, Integer> var7, int var8, Object var9) {
   if ((var8 & 1) != 0) {
      var2 = var1.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }
   if ((var8 & 2) != 0) {
      var3 = var1.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }
   if ((var8 & 4) != 0) {
      var4 = var1.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }
   if ((var8 & 8) != 0) {
      var5 = var1.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }
   if ((var8 & 16) != 0) {
      var6 = var1.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }
   if ((var8 & 32) != 0) {
      var7 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }
   return var1.a(var2, var3, var4, var5, var6, var7);
}
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @Nullable
      private final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      @NotNull
      private final IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      @NotNull
      private final Triple<Integer, Integer, Integer> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         int var1,
         @Nullable IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var2,
         boolean var3,
         boolean var4,
         @NotNull IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var5,
         @NotNull Triple<Integer, Integer, Integer> var6
      ) {
         short var10001 = 9215;
         short var10002 = -8390;
         Intrinsics.checkNotNullParameter(var5, "treeBot");
         var10001 = 9209;
         var10002 = 15902;
         Intrinsics.checkNotNullParameter(var6, "playerPos");
         super();
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

      @Nullable
      public final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final boolean d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> f() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final int g() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI h() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean i() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final boolean j() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll k() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> l() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @NotNull
      public final IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         int var1,
         @Nullable IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var2,
         boolean var3,
         boolean var4,
         @NotNull IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var5,
         @NotNull Triple<Integer, Integer, Integer> var6
      ) {
         short var10001 = 9212;
         short var10002 = -2325;
         Intrinsics.checkNotNullParameter(var5, "treeBot");
         var10001 = 9213;
         var10002 = 31344;
         Intrinsics.checkNotNullParameter(var6, "playerPos");
         return new IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var2, var3, var4, var5, var6
         );
      }

      @NotNull
      @Override
      public String toString() { IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var5 = null; // PX-FIX hoist
        
         short var10000 = 9208;
         Triple var1 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         boolean var3 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         boolean var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
          var5 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var6 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 15619;
         short var10002 = 9211;
         short var10003 = -18882;
         short var10004 = 9214;
         short var10005 = -15076;
         short var10006 = 9201;
         short var10007 = 15507;
         short var10008 = 9210;
         short var10009 = 174;
         short var10010 = 9200;
         short var10011 = -27393;
         return "RouteProgress(index="
            + var6
            + ", waypointType="
            + var5
            + ", walkerFinished="
            + var4
            + ", treebotStarted="
            + var3
            + ", treeBot="
            + var2
            + ", playerPos="
            + var1
            + ")";
      }

      @Override
      public int hashCode() {
         int var7;
         int var8;
         label14: {
            String var10000 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
            int var2 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
            String var1 = var10000;
            var7 = var2 * 31;
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (var1 != null) {
               if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII == null) {
                  var8 = 0;
                  break label14;
               }

               var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            var8 = var10001.hashCode();
         }

         int var3 = var7 + var8;
         var3 = var3 * 31 + Boolean.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         var3 = var3 * 31 + Boolean.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         var3 = var3 * 31 + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.hashCode();
         return var3 * 31 + this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
          boolean var5 = false; // PX-FIX decl var5
         String var2 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
         IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = (IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = (IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var1;
         }

         IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = var10000;
         var10000 = this;
         if (var2 != null) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var10000 = this;
         }

         if (var2 != null) {
            if (var10000.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               != var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
               return false;
            }

            var10000 = this;
         }

         label72: {
            var5 = var10000.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            boolean var10001 = var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            if (var2 != null) {
               if (var10000.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                  != var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
                  return false;
               }

               var5 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
               if (var2 == null) {
                  break label72;
               }

               var10001 = var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            }

            if (var5 != var10001) {
               return false;
            }

            var5 = Intrinsics.areEqual(
               this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
               var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            );
         }

         if (var2 != null) {
            if (!var5) {
               return false;
            }

            var5 = Intrinsics.areEqual(
               this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
               var3.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            );
         }

         if (var2 != null) {
            if (!var5) {
               return false;
            }

            var5 = true;
         }

         return var5;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static { String[] var5 = null; // PX-FIX hoist
        
      char[] var20 = null; // PX-FIX
          var5 = new String[10];
         int var3 = 0;
         String var2 = "V\u0000\u0084V\u009b3\u008d\u00069\u0013i\u0098Äc¹ü4ù£\u0098\tã²@n\u0095ºnQ7\n\u0014c|\u009a¥YzØâ\u0087\u000fiÐÐÿO\u0091\u0095p\u008d\u001dæ\u0095!Ä2\u0007¸d«uK[R\t\u008c«\u00adM(ÞÙÝÁ\u0011\u0001÷Ý\u001bû\u0016¾ã\u008b\n1Ù¥R\u0099\u0098ä\u0007S×Ö\u0003ä\u0095§";
         int var4 = "V\u0000\u0084V\u009b3\u008d\u00069\u0013i\u0098Äc¹ü4ù£\u0098\tã²@n\u0095ºnQ7\n\u0014c|\u009a¥YzØâ\u0087\u000fiÐÐÿO\u0091\u0095p\u008d\u001dæ\u0095!Ä2\u0007¸d«uK[R\t\u008c«\u00adM(ÞÙÝÁ\u0011\u0001÷Ý\u001bû\u0016¾ã\u008b\n1Ù¥R\u0099\u0098ä\u0007S×Ö\u0003ä\u0095§"
            .length();
         char var1 = 20;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 24;
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
                        case 0 -> 42;
                        case 1 -> 7;
                        case 2 -> 125;
                        case 3 -> 91;
                        case 4 -> 1;
                        case 5 -> 35;
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
                        b = new String[10];
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

                     var2 = "\u0094^û°FN6+\u001f\u0086ùI\u0011Ñ©WPS\u0093\u0017\u0012ø#¢\u001a\u001c¬\u001cKÇ";
                     var4 = "\u0094^û°FN6+\u001f\u0086ùI\u0011Ñ©WPS\u0093\u0017\u0012ø#¢\u001a\u001c¬\u001cKÇ".length();
                     var1 = '\f';
                     var8 = -1;
               }

               var10000 = 45;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) { int var5 = 0; // PX-FIX hoist
        
         int var2 = (var0 ^ 9208) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 224;
               case 1 -> 23;
               case 2 -> 17;
               case 3 -> 148;
               case 4 -> 38;
               case 5 -> 254;
               case 6 -> 34;
               case 7 -> 139;
               case 8 -> 115;
               case 9 -> 142;
               case 10 -> 99;
               case 11 -> 215;
               case 12 -> 29;
               case 13 -> 175;
               case 14 -> 242;
               case 15 -> 3;
               case 16 -> 189;
               case 17 -> 56;
               case 18 -> 183;
               case 19 -> 30;
               case 20 -> 146;
               case 21 -> 188;
               case 22 -> 240;
               case 23 -> 6;
               case 24 -> 219;
               case 25 -> 76;
               case 26 -> 120;
               case 27 -> 171;
               case 28 -> 27;
               case 29 -> 131;
               case 30 -> 117;
               case 31 -> 112;
               case 32 -> 55;
               case 33 -> 39;
               case 34 -> 132;
               case 35 -> 103;
               case 36 -> 252;
               case 37 -> 102;
               case 38 -> 164;
               case 39 -> 249;
               case 40 -> 169;
               case 41 -> 230;
               case 42 -> 233;
               case 43 -> 246;
               case 44 -> 49;
               case 45 -> 35;
               case 46 -> 204;
               case 47 -> 82;
               case 48 -> 66;
               case 49 -> 15;
               case 50 -> 74;
               case 51 -> 253;
               case 52 -> 43;
               case 53 -> 196;
               case 54 -> 206;
               case 55 -> 245;
               case 56 -> 217;
               case 57 -> 25;
               case 58 -> 179;
               case 59 -> 53;
               case 60 -> 16;
               case 61 -> 195;
               case 62 -> 59;
               case 63 -> 57;
               case 64 -> 201;
               case 65 -> 227;
               case 66 -> 118;
               case 67 -> 198;
               case 68 -> 173;
               case 69 -> 161;
               case 70 -> 177;
               case 71 -> 208;
               case 72 -> 130;
               case 73 -> 187;
               case 74 -> 31;
               case 75 -> 67;
               case 76 -> 212;
               case 77 -> 211;
               case 78 -> 58;
               case 79 -> 157;
               case 80 -> 36;
               case 81 -> 210;
               case 82 -> 92;
               case 83 -> 122;
               case 84 -> 141;
               case 85 -> 223;
               case 86 -> 134;
               case 87 -> 190;
               case 88 -> 185;
               case 89 -> 60;
               case 90 -> 98;
               case 91 -> 199;
               case 92 -> 65;
               case 93 -> 107;
               case 94 -> 126;
               case 95 -> 203;
               case 96 -> 250;
               case 97 -> 37;
               case 98 -> 158;
               case 99 -> 77;
               case 100 -> 205;
               case 101 -> 1;
               case 102 -> 26;
               case 103 -> 191;
               case 104 -> 119;
               case 105 -> 91;
               case 106 -> 214;
               case 107 -> 9;
               case 108 -> 136;
               case 109 -> 235;
               case 110 -> 200;
               case 111 -> 154;
               case 112 -> 20;
               case 113 -> 234;
               case 114 -> 86;
               case 115 -> 239;
               case 116 -> 52;
               case 117 -> 73;
               case 118 -> 202;
               case 119 -> 44;
               case 120 -> 40;
               case 121 -> 166;
               case 122 -> 83;
               case 123 -> 75;
               case 124 -> 160;
               case 125 -> 222;
               case 126 -> 181;
               case 127 -> 150;
               case 128 -> 184;
               case 129 -> 42;
               case 130 -> 216;
               case 131 -> 101;
               case 132 -> 144;
               case 133 -> 155;
               case 134 -> 135;
               case 135 -> 221;
               case 136 -> 113;
               case 137 -> 72;
               case 138 -> 237;
               case 139 -> 54;
               case 140 -> 241;
               case 141 -> 80;
               case 142 -> 238;
               case 143 -> 149;
               case 144 -> 244;
               case 145 -> 228;
               case 146 -> 10;
               case 147 -> 64;
               case 148 -> 79;
               case 149 -> 96;
               case 150 -> 109;
               case 151 -> 138;
               case 152 -> 194;
               case 153 -> 85;
               case 154 -> 145;
               case 155 -> 12;
               case 156 -> 197;
               case 157 -> 81;
               case 158 -> 5;
               case 159 -> 78;
               case 160 -> 159;
               case 161 -> 63;
               case 162 -> 167;
               case 163 -> 247;
               case 164 -> 248;
               case 165 -> 51;
               case 166 -> 88;
               case 167 -> 13;
               case 168 -> 0;
               case 169 -> 116;
               case 170 -> 218;
               case 171 -> 232;
               case 172 -> 94;
               case 173 -> 14;
               case 174 -> 243;
               case 175 -> 45;
               case 176 -> 110;
               case 177 -> 7;
               case 178 -> 93;
               case 179 -> 180;
               case 180 -> 28;
               case 181 -> 100;
               case 182 -> 41;
               case 183 -> 226;
               case 184 -> 48;
               case 185 -> 71;
               case 186 -> 22;
               case 187 -> 163;
               case 188 -> 225;
               case 189 -> 104;
               case 190 -> 162;
               case 191 -> 178;
               case 192 -> 33;
               case 193 -> 236;
               case 194 -> 4;
               case 195 -> 68;
               case 196 -> 137;
               case 197 -> 255;
               case 198 -> 124;
               case 199 -> 182;
               case 200 -> 174;
               case 201 -> 8;
               case 202 -> 129;
               case 203 -> 172;
               case 204 -> 220;
               case 205 -> 209;
               case 206 -> 192;
               case 207 -> 97;
               case 208 -> 186;
               case 209 -> 125;
               case 210 -> 165;
               case 211 -> 121;
               case 212 -> 231;
               case 213 -> 90;
               case 214 -> 153;
               case 215 -> 140;
               case 216 -> 70;
               case 217 -> 50;
               case 218 -> 61;
               case 219 -> 156;
               case 220 -> 46;
               case 221 -> 69;
               case 222 -> 193;
               case 223 -> 89;
               case 224 -> 111;
               case 225 -> 62;
               case 226 -> 2;
               case 227 -> 151;
               case 228 -> 152;
               case 229 -> 84;
               case 230 -> 147;
               case 231 -> 106;
               case 232 -> 24;
               case 233 -> 133;
               case 234 -> 229;
               case 235 -> 87;
               case 236 -> 21;
               case 237 -> 128;
               case 238 -> 108;
               case 239 -> 47;
               case 240 -> 251;
               case 241 -> 143;
               case 242 -> 105;
               case 243 -> 11;
               case 244 -> 32;
               case 245 -> 213;
               case 246 -> 176;
               case 247 -> 114;
               case 248 -> 207;
               case 249 -> 168;
               case 250 -> 18;
               case 251 -> 170;
               case 252 -> 19;
               case 253 -> 123;
               case 254 -> 127;
               default -> 95;
            };
             var5 = (var1 & 0xFF) - var4;
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

    // PX-FIX TOP5F: Kotlin synthetic no-arg marker ctor (jar: <init>(DefaultConstructorMarker))
    public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker marker) {
        this();
    }

      private static String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll a() {
         return IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
      }

      public static void b(String var0) {
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var0;
      }

      public static String b() {
         return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      static {
         if (b() == null) {
            b("b5H65");
         }
      }
   }
}
