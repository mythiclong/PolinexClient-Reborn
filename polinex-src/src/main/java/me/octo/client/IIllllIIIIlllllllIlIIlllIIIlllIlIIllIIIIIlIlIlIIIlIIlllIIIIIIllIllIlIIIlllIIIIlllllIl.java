package me.octo.client;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import org.jetbrains.annotations.NotNull;

public final class IIllllIIIIlllllllIlIIlllIIIlllIlIIllIIIIIlIlIlIIIlIIlllIIIIIIllIllIlIIIlllIIIIlllllIl
   extends lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll {
    public static <T> T b(Object p0) { return null; } // PX-FIX mr3

   public Object receiver; // PX-FIX kotlin lambda receiver

   @NotNull
   public static IIllllIIIIlllllllIlIIlllIIIlllIlIIllIIIIIlIlIlIIIlIIlllIIIIIIllIllIlIIIlllIIIIlllllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
   private int lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   @NotNull
   private static IIllllIIIIlllllllIlIIlllIIIlllIlIIllIIIIIlIlIlIIIlIIlllIIIIIIllIllIlIIIlllIIIIlllllIl IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
   private static String[] j;
   private static String[] k;

   public IIllllIIIIlllllllIlIIlllIIIlllIlIIllIIIIIlIlIlIIIlIIlllIIIIIIllIllIlIIIlllIIIIlllllIl() {
      byte var10001 = -69;
      short var10002 = 10506;
      byte var2 = -71;
      short var10003 = -21180;
      me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      byte var10004 = -67;
      short var10005 = 23032;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         IlIIIIlIlIIllllllIlIllIllIlIllIllIllIIIIIllllIIIIlllllIIlIIlIIlIIIIlllIIIllIIIIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a()
      };
      super(
         "Lobby Hopper",
         "Hops between Crystal Hollows lobbies until it finds a lobby under your minimum days.",
         var3,
         "Crystal Hollows",
         null,
         null,
         false,
         var1,
         112,
         null
      );
   }

   public final int bp() {
      return this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   }

   public final void e(int var1) {
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = var1;
   }

   @Override
   protected void aD() {
      Object receiver = null; // PX-FIX
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var10000 = this;
      byte var10001 = -78;
      byte var10002 = 48;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10000),
         "Stuck",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         null,
         0L,
         false,
         false,
         (kotlin.jvm.functions.Function1)(IIllllIIIIlllllllIlIIlllIIIlllIlIIllIIIIIlIlIlIIIlIIlllIIIIIIllIllIlIIIlllIIIIlllllIl::a),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = -27497;
                  short var10005 = 12659;
                  var10005 = -27499;
                  short var10006 = 13956;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001x = -27500;
                  short var10002x = 3821;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IIllllIIIIlllllllIlIIlllIIIlllIlIIllIIIIIlIlIlIIIlIIlllIIIIIIllIllIlIIIlllIIIIlllllIl)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "\u00adøC`Ê\u008aWk\u0092pS\u001eC,mêwAÃ\u00834JðB(ðï\u001b\u000787ì\u0007\u0001æ\u0018ôzv°#ÍJÛ±¶\u0014¿QÀVÚüy9Ü\u0010ÃÀN\u001a4¬\u0083úÁ`\u0010ñg \u008eµTÑ\u0002÷Ø\u0010Q\u0090Üm9+)_]öªÎ|6\u008a©";
                  int var4 = "\u00adøC`Ê\u008aWk\u0092pS\u001eC,mêwAÃ\u00834JðB(ðï\u001b\u000787ì\u0007\u0001æ\u0018ôzv°#ÍJÛ±¶\u0014¿QÀVÚüy9Ü\u0010ÃÀN\u001a4¬\u0083úÁ`\u0010ñg \u008eµTÑ\u0002÷Ø\u0010Q\u0090Üm9+)_]öªÎ|6\u008a©"
                     .length();
                  char var1 = 'K';
                  int var0 = -1;

                  while (true) {
                     char[] var10002x;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 25;
                        var10002x = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 25;
                           var10006 = var6;
                        } else {
                           var13 = 25;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 25;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 36;
                              case 1 -> 42;
                              case 2 -> 67;
                              case 3 -> 41;
                              case 4 -> 63;
                              case 5 -> 20;
                              default -> 126;
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
                  int var2 = (var0 ^ -27499) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 156;
                        case 1 -> 178;
                        case 2 -> 131;
                        case 3 -> 203;
                        case 4 -> 89;
                        case 5 -> 86;
                        case 6 -> 125;
                        case 7 -> 218;
                        case 8 -> 244;
                        case 9 -> 174;
                        case 10 -> 221;
                        case 11 -> 121;
                        case 12 -> 33;
                        case 13 -> 99;
                        case 14 -> 159;
                        case 15 -> 36;
                        case 16 -> 101;
                        case 17 -> 247;
                        case 18 -> 60;
                        case 19 -> 217;
                        case 20 -> 193;
                        case 21 -> 43;
                        case 22 -> 80;
                        case 23 -> 254;
                        case 24 -> 243;
                        case 25 -> 220;
                        case 26 -> 47;
                        case 27 -> 235;
                        case 28 -> 3;
                        case 29 -> 64;
                        case 30 -> 21;
                        case 31 -> 17;
                        case 32 -> 2;
                        case 33 -> 74;
                        case 34 -> 25;
                        case 35 -> 136;
                        case 36 -> 239;
                        case 37 -> 32;
                        case 38 -> 82;
                        case 39 -> 42;
                        case 40 -> 71;
                        case 41 -> 93;
                        case 42 -> 92;
                        case 43 -> 184;
                        case 44 -> 87;
                        case 45 -> 132;
                        case 46 -> 255;
                        case 47 -> 153;
                        case 48 -> 177;
                        case 49 -> 251;
                        case 50 -> 143;
                        case 51 -> 96;
                        case 52 -> 209;
                        case 53 -> 170;
                        case 54 -> 183;
                        case 55 -> 141;
                        case 56 -> 225;
                        case 57 -> 68;
                        case 58 -> 104;
                        case 59 -> 34;
                        case 60 -> 202;
                        case 61 -> 12;
                        case 62 -> 119;
                        case 63 -> 91;
                        case 64 -> 97;
                        case 65 -> 179;
                        case 66 -> 48;
                        case 67 -> 115;
                        case 68 -> 214;
                        case 69 -> 124;
                        case 70 -> 23;
                        case 71 -> 191;
                        case 72 -> 133;
                        case 73 -> 155;
                        case 74 -> 128;
                        case 75 -> 190;
                        case 76 -> 175;
                        case 77 -> 157;
                        case 78 -> 112;
                        case 79 -> 229;
                        case 80 -> 219;
                        case 81 -> 198;
                        case 82 -> 129;
                        case 83 -> 200;
                        case 84 -> 163;
                        case 85 -> 30;
                        case 86 -> 26;
                        case 87 -> 122;
                        case 88 -> 195;
                        case 89 -> 16;
                        case 90 -> 84;
                        case 91 -> 59;
                        case 92 -> 15;
                        case 93 -> 212;
                        case 94 -> 8;
                        case 95 -> 130;
                        case 96 -> 29;
                        case 97 -> 145;
                        case 98 -> 168;
                        case 99 -> 188;
                        case 100 -> 165;
                        case 101 -> 1;
                        case 102 -> 105;
                        case 103 -> 46;
                        case 104 -> 20;
                        case 105 -> 44;
                        case 106 -> 146;
                        case 107 -> 106;
                        case 108 -> 111;
                        case 109 -> 62;
                        case 110 -> 41;
                        case 111 -> 230;
                        case 112 -> 151;
                        case 113 -> 13;
                        case 114 -> 149;
                        case 115 -> 204;
                        case 116 -> 118;
                        case 117 -> 226;
                        case 118 -> 50;
                        case 119 -> 248;
                        case 120 -> 90;
                        case 121 -> 57;
                        case 122 -> 61;
                        case 123 -> 72;
                        case 124 -> 55;
                        case 125 -> 83;
                        case 126 -> 144;
                        case 127 -> 185;
                        case 128 -> 135;
                        case 129 -> 108;
                        case 130 -> 160;
                        case 131 -> 11;
                        case 132 -> 172;
                        case 133 -> 167;
                        case 134 -> 22;
                        case 135 -> 249;
                        case 136 -> 53;
                        case 137 -> 117;
                        case 138 -> 37;
                        case 139 -> 252;
                        case 140 -> 100;
                        case 141 -> 154;
                        case 142 -> 241;
                        case 143 -> 120;
                        case 144 -> 140;
                        case 145 -> 78;
                        case 146 -> 228;
                        case 147 -> 81;
                        case 148 -> 69;
                        case 149 -> 171;
                        case 150 -> 189;
                        case 151 -> 137;
                        case 152 -> 54;
                        case 153 -> 0;
                        case 154 -> 205;
                        case 155 -> 253;
                        case 156 -> 207;
                        case 157 -> 10;
                        case 158 -> 109;
                        case 159 -> 77;
                        case 160 -> 4;
                        case 161 -> 123;
                        case 162 -> 176;
                        case 163 -> 102;
                        case 164 -> 234;
                        case 165 -> 196;
                        case 166 -> 227;
                        case 167 -> 169;
                        case 168 -> 231;
                        case 169 -> 75;
                        case 170 -> 70;
                        case 171 -> 110;
                        case 172 -> 27;
                        case 173 -> 39;
                        case 174 -> 181;
                        case 175 -> 40;
                        case 176 -> 242;
                        case 177 -> 126;
                        case 178 -> 148;
                        case 179 -> 147;
                        case 180 -> 134;
                        case 181 -> 180;
                        case 182 -> 14;
                        case 183 -> 238;
                        case 184 -> 127;
                        case 185 -> 173;
                        case 186 -> 182;
                        case 187 -> 85;
                        case 188 -> 88;
                        case 189 -> 216;
                        case 190 -> 45;
                        case 191 -> 152;
                        case 192 -> 24;
                        case 193 -> 5;
                        case 194 -> 213;
                        case 195 -> 94;
                        case 196 -> 232;
                        case 197 -> 139;
                        case 198 -> 250;
                        case 199 -> 38;
                        case 200 -> 138;
                        case 201 -> 73;
                        case 202 -> 51;
                        case 203 -> 206;
                        case 204 -> 208;
                        case 205 -> 186;
                        case 206 -> 199;
                        case 207 -> 28;
                        case 208 -> 210;
                        case 209 -> 19;
                        case 210 -> 58;
                        case 211 -> 192;
                        case 212 -> 79;
                        case 213 -> 107;
                        case 214 -> 158;
                        case 215 -> 187;
                        case 216 -> 31;
                        case 217 -> 113;
                        case 218 -> 240;
                        case 219 -> 246;
                        case 220 -> 164;
                        case 221 -> 9;
                        case 222 -> 18;
                        case 223 -> 67;
                        case 224 -> 76;
                        case 225 -> 95;
                        case 226 -> 66;
                        case 227 -> 7;
                        case 228 -> 142;
                        case 229 -> 223;
                        case 230 -> 215;
                        case 231 -> 194;
                        case 232 -> 237;
                        case 233 -> 161;
                        case 234 -> 150;
                        case 235 -> 65;
                        case 236 -> 49;
                        case 237 -> 166;
                        case 238 -> 63;
                        case 239 -> 236;
                        case 240 -> 233;
                        case 241 -> 197;
                        case 242 -> 222;
                        case 243 -> 103;
                        case 244 -> 52;
                        case 245 -> 98;
                        case 246 -> 6;
                        case 247 -> 245;
                        case 248 -> 211;
                        case 249 -> 201;
                        case 250 -> 56;
                        case 251 -> 35;
                        case 252 -> 114;
                        case 253 -> 224;
                        case 254 -> 116;
                        default -> 162;
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
   }

   private final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      this.ae()
         .a(
            new lllIllIIllIIIIIIIlIIlIIIIIllllIlIIIIIllllIIlIIIIlllIIIIIIlIIIIlIlIIIIllIIllIIlllIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               (kotlin.jvm.functions.Function1)(IIllllIIIIlllllllIlIIlllIIIlllIlIIllIIIIIlIlIlIIIlIIlllIIIIIIllIllIlIIIlllIIIIlllllIl::b),
               var1.d(),
               0,
               0,
               0L,
               0,
               null,
               248,
               null
            )
         );
   }

   @Override
   public void aC() {
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      int var1 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      IIllllIIIIlllllllIlIIlllIIIlllIlIIllIIIIIlIlIlIIIlIIlllIIIIIIllIllIlIIIlllIIIIlllllIl var10000 = this;
      if (var1 == 0) {
         if (this.W()
            != IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )
          {
            return;
         }

         var10000 = this;
      }

      label30: {
         label29: {
            int var2 = ((var10000.aK()) ? 1 : 0);
            if (var1 == 0) {
               if (var2 == 0) {
                  return;
               }

               var10000 = this;
               if (var1 != 0) {
                  break label29;
               }

               var2 = ((int[])IIllllIIIIlllllllIlIIlllIIIlllIlIIllIIIIIlIlIlIIIlIIlllIIIIIIllIllIlIIIlllIIIIlllllIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)[this.aJ()
                  .a()
                  .ordinal()];
            }

            switch (var2) {
               case 1:
                  var10000 = this;
                  break;
               case 2:
                  break label30;
               default:
                  return;
            }
         }

         var10000.bq();
         if (var1 == 0) {
            return;
         }
      }

      this.bq();
   }

   @Override
   public void M() {
      this.aM();
      super.M();
      this.a(CollectionsKt.emptyList());
      this.bq();
   }

   private final void bq() {
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      int var1 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      if (var1 != 0) {
         ClientLevel var10000 = this.ap().level;
         if (var10000 != null) {
            ClientLevel var2 = var10000;
            if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .g()
               == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
               )
             {
               double var3 = Math.floor(var2.getOverworldClockTime() / 24000L);
               byte var10001 = -80;
               short var10002 = 3918;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Days " + var3);
               if (var1 != 0) {
                  if (var3
                     <= IlIIIIlIlIIllllllIlIllIllIlIllIllIllIIIIIllllIIIIlllllIIlIIlIIlIIIIlllIIIllIIIIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a()
                        .O()) {
                     byte var5 = -77;
                     short var10003 = 3995;
                     this.a(
                        "Found a lobby on day " + var3,
                        me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                     );
                     this.N();
                     return;
                  }

                  this.bs();
               }

               if (var1 != 0) {
                  return;
               }
            }

            this.br();
            return;
         }
      }
   }

   @SubscribeEvent
   public final void c(@NotNull me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      int var10000 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      short var10002 = -79;
      short var10003 = 20112;
      Intrinsics.checkNotNullParameter(var1, "event");
      int var2 = var10000;
      Packet var3 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      int var6 = ((var3 instanceof ClientboundSystemChatPacket) ? 1 : 0);
      if (var2 != 0) {
         if ((var6 == 0)) {
            return;
         }

         var6 = ((((ClientboundSystemChatPacket)var3).overlay() ? 1 : 0));
      }

      if ((var6 == 0)) {
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var7 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         String var10001 = ((ClientboundSystemChatPacket)var3).content().getString();
         short var17 = -72;
         short var10004 = -10861;
         Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
         String var4 = StringsKt.trim(var7.a(var10001)).toString();
         String var8 = ((ClientboundSystemChatPacket)var3).content().getString();
         var10002 = (byte)-65;
         var17 = 470;
         Intrinsics.checkNotNullExpressionValue(var8, "getString(...)");
         byte var12 = -66;
         var10002 = -14217;
         var6 = ((StringsKt.startsWith(var4, "You do not have an active Crystal Hollows pass!", false)) ? 1 : 0);
         if (var2 != 0) {
            if (var6 == 0) {
               return;
            }

            double var19;
            var6 = (
                     var19 = me.octo.client.utils.IlllIIlIIlIllIIIIIIllIIllIlIllllIIIIlIIlIlIlIIlllIlIIIlIIIIIlIlIIllllIlllIlllIllIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .a()
                        - 20000.0
                  )
                  == 0.0
               ? 0
               : (var19 < 0.0 ? -1 : 1);
         }

         if (var6 < 0) {
            IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll.E();
            byte var11 = -70;
            short var14 = 25297;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "ur too poor to buy a pass wow this is lowkey sad"
            );
         } else {
            byte var10 = -73;
            short var13 = 3172;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b("purchasecrystallhollowspass");
            new Thread(IIllllIIIIlllllllIlIIlllIIIlllIlIIllIIIIIlIlIlIIIlIIlllIIIIIIllIllIlIIIlllIIIIlllllIl::bu);
         }
      }
   }

   private final void br() {
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      int var1 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var10001 = IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      int var10003 = ((IlIIIIlIlIIllllllIlIllIllIlIllIllIllIIIIIllllIIIIlllllIIlIIlIIlIIIIlllIIIllIIIIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b()
         .ae()) ? 1 : 0);
      if (var1 != 0) {
         var10003 = var10003 != 0
            ? me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .c(
                  IlIIIIlIlIIllllllIlIllIllIlIllIllIllIIIIIllllIIIIlllllIIlIIlIIlIIIIlllIIIllIIIIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .c()
                     .Q(),
                  IlIIIIlIlIIllllllIlIllIllIlIllIllIllIIIIIllllIIIIlllllIIlIIlIIlIIIIlllIIIllIIIIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .c()
                     .R()
               )
            : 0;
      }

      this.a(var10001, 4000 + var10003);
   }

   private final void bs() {
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      int var1 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var10001 = IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      int var10003 = ((IlIIIIlIlIIllllllIlIllIllIlIllIllIllIIIIIllllIIIIlllllIIlIIlIIlIIIIlllIIIllIIIIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b()
         .ae()) ? 1 : 0);
      if (var1 != 0) {
         var10003 = var10003 != 0
            ? me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .c(
                  IlIIIIlIlIIllllllIlIllIllIlIllIllIllIIIIIllllIIIIlllllIIlIIlIIlIIIIlllIIIllIIIIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .c()
                     .Q(),
                  IlIIIIlIlIIllllllIlIllIllIlIllIllIllIIIIIllllIIIIlllllIIlIIlIIlIIIIlllIIIllIIIIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .c()
                     .R()
               )
            : 0;
      }

      this.a(var10001, 4000 + var10003);
   }

   private static final long bt() {
      return 25000L;
   }

   private static final Object a(IIllllIIIIlllllllIlIIlllIIIlllIlIIllIIIIIlIlIlIIIlIIlllIIIIIIllIllIlIIIlllIIIIlllllIl var0) {
      return var0.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   }

   private static final Unit b(IIllllIIIIlllllllIlIIlllIIIlllIlIIllIIIIIlIlIlIIIlIIlllIIIIIIllIllIlIIIlllIIIIlllllIl var0) {
      var0.br();
      return Unit.INSTANCE;
   }

   private static final void bu() {
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      byte var10000 = -68;
      try {
         Thread.sleep(5000L);
      }
      catch (InterruptedException interruptedException) {
         throw new RuntimeException(interruptedException);
      }
      short var10001 = -13348;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b("warp ch");
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[13];
      int var3 = 0;
      String var2 = "\u0081¾Þ\u0018ü}\u0014*\nþu£0eê\u001e:ø¢(h÷U!x\u001cÑ\u0097cê\u0014ÖÅKK\u0095-£ènÃíc\u0019\u000fÀ\u0087éJÓd$·b\u008a~\u0097oøØ\u0016T¦\r¬\u007f»à£\u0088sÇ½/.\u0090]ù\u00ad2¹ Ïs\u000b\n ¿ò\u0093)º'ûtHPðZ?.8\u007f\u0004E±±}Ú\u0092\n¼(\u0016V¶\u009b\b>XÙ*h\u007f'çÇ\\\u0092°\u0001s\u0015\u0086¦Q\u0089\u0094\u0095ñðÓt\u009bÀ\u009e\u000e\u0007|V:4|\u0080\u0013\u008a ÛgÎ»\u000e\u0099õ\u0085\u000bNZÏ×c8ætiÙ/^\u0082\u0085Ý\u007f\u0080²2¤Ø\u0019ù\u0016¹$\u0016e§±Fä?C\"f¬6VZ< Ôâ\u0087`u\u0098\t²Ç×ÔYfoÝ¡\u000fÔ?\u0081\u0087büO<ù\u0085=.YÆ\u0014\u0007¬\u00927@\u008ae\u0088\u0015\u0082ìâ^\u00938nÍU»\u0006ççg\u000b\u001f\u008a\u000bd\u0080t\u00051ý#\t¤\u0005\u008ed4uK";
      int var4 = "\u0081¾Þ\u0018ü}\u0014*\nþu£0eê\u001e:ø¢(h÷U!x\u001cÑ\u0097cê\u0014ÖÅKK\u0095-£ènÃíc\u0019\u000fÀ\u0087éJÓd$·b\u008a~\u0097oøØ\u0016T¦\r¬\u007f»à£\u0088sÇ½/.\u0090]ù\u00ad2¹ Ïs\u000b\n ¿ò\u0093)º'ûtHPðZ?.8\u007f\u0004E±±}Ú\u0092\n¼(\u0016V¶\u009b\b>XÙ*h\u007f'çÇ\\\u0092°\u0001s\u0015\u0086¦Q\u0089\u0094\u0095ñðÓt\u009bÀ\u009e\u000e\u0007|V:4|\u0080\u0013\u008a ÛgÎ»\u000e\u0099õ\u0085\u000bNZÏ×c8ætiÙ/^\u0082\u0085Ý\u007f\u0080²2¤Ø\u0019ù\u0016¹$\u0016e§±Fä?C\"f¬6VZ< Ôâ\u0087`u\u0098\t²Ç×ÔYfoÝ¡\u000fÔ?\u0081\u0087büO<ù\u0085=.YÆ\u0014\u0007¬\u00927@\u008ae\u0088\u0015\u0082ìâ^\u00938nÍU»\u0006ççg\u000b\u001f\u008a\u000bd\u0080t\u00051ý#\t¤\u0005\u008ed4uK"
         .length();
      char var1 = '\f';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 2;
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
                     case 1 -> 120;
                     case 2 -> 99;
                     case 3 -> 98;
                     case 4 -> 94;
                     case 5 -> 126;
                     default -> 28;
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
                     IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = new IIllllIIIIlllllllIlIIlllIIIlllIlIIllIIIIIlIlIlIIIlIIlllIIIIIIllIllIlIIIlllIIIIlllllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = new IIllllIIIIlllllllIlIIlllIIIlllIlIIllIIIIIlIlIlIIIlIIlllIIIIIIllIllIlIIIlllIIIIlllllIl();
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

                  var2 = "\u0091È^\u0098]\u001b®ø\u0000\u0018´\u008d\u0085Çç\u009a5üdæDÔØ«ò{Õ§bÄ\u008fu/";
                  var4 = "\u0091È^\u0098]\u001b®ø\u0000\u0018´\u008d\u0085Çç\u009a5üdæDÔØ«ò{Õ§bÄ\u008fu/".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 125;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String e(int var0, int var1) {
      int var2 = (var0 ^ -69) & 65535;
      if (k[var2] == null) {
         char[] var3 = j[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 72;
            case 1 -> 77;
            case 2 -> 12;
            case 3 -> 1;
            case 4 -> 94;
            case 5 -> 251;
            case 6 -> 20;
            case 7 -> 124;
            case 8 -> 197;
            case 9 -> 166;
            case 10 -> 201;
            case 11 -> 171;
            case 12 -> 125;
            case 13 -> 98;
            case 14 -> 133;
            case 15 -> 183;
            case 16 -> 213;
            case 17 -> 54;
            case 18 -> 74;
            case 19 -> 204;
            case 20 -> 85;
            case 21 -> 17;
            case 22 -> 233;
            case 23 -> 15;
            case 24 -> 207;
            case 25 -> 242;
            case 26 -> 238;
            case 27 -> 33;
            case 28 -> 6;
            case 29 -> 47;
            case 30 -> 177;
            case 31 -> 49;
            case 32 -> 11;
            case 33 -> 210;
            case 34 -> 95;
            case 35 -> 43;
            case 36 -> 128;
            case 37 -> 148;
            case 38 -> 179;
            case 39 -> 162;
            case 40 -> 211;
            case 41 -> 227;
            case 42 -> 28;
            case 43 -> 50;
            case 44 -> 223;
            case 45 -> 234;
            case 46 -> 137;
            case 47 -> 218;
            case 48 -> 0;
            case 49 -> 87;
            case 50 -> 142;
            case 51 -> 193;
            case 52 -> 9;
            case 53 -> 216;
            case 54 -> 208;
            case 55 -> 252;
            case 56 -> 176;
            case 57 -> 235;
            case 58 -> 131;
            case 59 -> 112;
            case 60 -> 184;
            case 61 -> 73;
            case 62 -> 146;
            case 63 -> 118;
            case 64 -> 90;
            case 65 -> 224;
            case 66 -> 57;
            case 67 -> 168;
            case 68 -> 14;
            case 69 -> 138;
            case 70 -> 114;
            case 71 -> 127;
            case 72 -> 194;
            case 73 -> 164;
            case 74 -> 18;
            case 75 -> 116;
            case 76 -> 156;
            case 77 -> 79;
            case 78 -> 243;
            case 79 -> 140;
            case 80 -> 70;
            case 81 -> 147;
            case 82 -> 161;
            case 83 -> 158;
            case 84 -> 69;
            case 85 -> 92;
            case 86 -> 102;
            case 87 -> 93;
            case 88 -> 21;
            case 89 -> 46;
            case 90 -> 239;
            case 91 -> 134;
            case 92 -> 221;
            case 93 -> 199;
            case 94 -> 145;
            case 95 -> 231;
            case 96 -> 187;
            case 97 -> 150;
            case 98 -> 170;
            case 99 -> 246;
            case 100 -> 108;
            case 101 -> 110;
            case 102 -> 71;
            case 103 -> 159;
            case 104 -> 215;
            case 105 -> 141;
            case 106 -> 109;
            case 107 -> 172;
            case 108 -> 202;
            case 109 -> 154;
            case 110 -> 245;
            case 111 -> 130;
            case 112 -> 13;
            case 113 -> 205;
            case 114 -> 84;
            case 115 -> 5;
            case 116 -> 10;
            case 117 -> 139;
            case 118 -> 117;
            case 119 -> 36;
            case 120 -> 62;
            case 121 -> 56;
            case 122 -> 253;
            case 123 -> 19;
            case 124 -> 122;
            case 125 -> 2;
            case 126 -> 219;
            case 127 -> 31;
            case 128 -> 104;
            case 129 -> 81;
            case 130 -> 185;
            case 131 -> 16;
            case 132 -> 153;
            case 133 -> 174;
            case 134 -> 78;
            case 135 -> 119;
            case 136 -> 248;
            case 137 -> 83;
            case 138 -> 192;
            case 139 -> 237;
            case 140 -> 123;
            case 141 -> 198;
            case 142 -> 226;
            case 143 -> 76;
            case 144 -> 132;
            case 145 -> 188;
            case 146 -> 60;
            case 147 -> 26;
            case 148 -> 232;
            case 149 -> 34;
            case 150 -> 101;
            case 151 -> 203;
            case 152 -> 24;
            case 153 -> 3;
            case 154 -> 190;
            case 155 -> 27;
            case 156 -> 222;
            case 157 -> 37;
            case 158 -> 65;
            case 159 -> 48;
            case 160 -> 100;
            case 161 -> 44;
            case 162 -> 59;
            case 163 -> 173;
            case 164 -> 152;
            case 165 -> 29;
            case 166 -> 111;
            case 167 -> 163;
            case 168 -> 45;
            case 169 -> 157;
            case 170 -> 143;
            case 171 -> 96;
            case 172 -> 68;
            case 173 -> 107;
            case 174 -> 39;
            case 175 -> 99;
            case 176 -> 155;
            case 177 -> 52;
            case 178 -> 7;
            case 179 -> 195;
            case 180 -> 209;
            case 181 -> 160;
            case 182 -> 220;
            case 183 -> 115;
            case 184 -> 217;
            case 185 -> 32;
            case 186 -> 241;
            case 187 -> 196;
            case 188 -> 91;
            case 189 -> 206;
            case 190 -> 86;
            case 191 -> 53;
            case 192 -> 126;
            case 193 -> 229;
            case 194 -> 106;
            case 195 -> 22;
            case 196 -> 63;
            case 197 -> 228;
            case 198 -> 30;
            case 199 -> 151;
            case 200 -> 178;
            case 201 -> 191;
            case 202 -> 40;
            case 203 -> 75;
            case 204 -> 135;
            case 205 -> 38;
            case 206 -> 165;
            case 207 -> 230;
            case 208 -> 247;
            case 209 -> 186;
            case 210 -> 250;
            case 211 -> 105;
            case 212 -> 113;
            case 213 -> 182;
            case 214 -> 144;
            case 215 -> 82;
            case 216 -> 23;
            case 217 -> 58;
            case 218 -> 240;
            case 219 -> 80;
            case 220 -> 200;
            case 221 -> 212;
            case 222 -> 244;
            case 223 -> 129;
            case 224 -> 61;
            case 225 -> 25;
            case 226 -> 88;
            case 227 -> 180;
            case 228 -> 249;
            case 229 -> 55;
            case 230 -> 97;
            case 231 -> 149;
            case 232 -> 236;
            case 233 -> 67;
            case 234 -> 4;
            case 235 -> 254;
            case 236 -> 35;
            case 237 -> 66;
            case 238 -> 89;
            case 239 -> 121;
            case 240 -> 181;
            case 241 -> 42;
            case 242 -> 214;
            case 243 -> 136;
            case 244 -> 8;
            case 245 -> 189;
            case 246 -> 255;
            case 247 -> 103;
            case 248 -> 169;
            case 249 -> 64;
            case 250 -> 41;
            case 251 -> 225;
            case 252 -> 175;
            case 253 -> 120;
            case 254 -> 167;
            default -> 51;
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final IIllllIIIIlllllllIlIIlllIIIlllIlIIllIIIIIlIlIlIIIlIIlllIIIIIIllIllIlIIIlllIIIIlllllIl a() {
         return IIllllIIIIlllllllIlIIlllIIIlllIlIIllIIIIIlIlIlIIIlIIlllIIIIIIllIllIlIIIlllIIIIlllllIl.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
      }
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker p0) { this(); }
   }

   public static final void a(
      me.octo.client.IIllllIIIIlllllllIlIIlllIIIlllIlIIllIIIIIlIlIlIIIlIIlllIIIIIIllIllIlIIIlllIIIIlllllIl var0,
      me.octo.client.IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1
   ) {
      var0.a(var1);
   }

   public static final me.octo.client.IIllllIIIIlllllllIlIIlllIIIlllIlIIllIIIIIlIlIlIIIlIIlllIIIIIIllIllIlIIIlllIIIIlllllIl bv(
   ) {
      return IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
   }
}
