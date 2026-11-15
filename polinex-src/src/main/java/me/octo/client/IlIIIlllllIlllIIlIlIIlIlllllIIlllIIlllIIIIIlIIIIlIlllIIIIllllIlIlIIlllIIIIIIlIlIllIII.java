package me.octo.client;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.network.protocol.game.ClientboundSetTimePacket;
import org.jetbrains.annotations.NotNull;

public final class IlIIIlllllIlllIIlIlIIlIlllllIIlllIIlllIIIIIlIIIIlIlllIIIIllllIlIlIIlllIIIIIIlIlIllIII
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static IlIIIlllllIlllIIlIlIIlIlllllIIlllIIlllIIIIIlIIIIlIlllIIIIllllIlIlIIlllIIIIIIlIlIllIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private long lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @JvmField
   @NotNull
   public static IlIIIlllllIlllIIlIlIIlIlllllIIlllIIlllIIIIIlIIIIlIlllIIIIllllIlIlIIlllIIIIIIlIlIllIII lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static String[] f;
   private static String[] g;

   private IlIIIlllllIlllIIlIlIIlIlllllIIlllIIlllIIIIIlIIIIlIlllIIIIllllIlIlIIlllIIIIIIlIlIllIII() {
      short var10001 = 22854;
      short var10002 = 20175;
      var10002 = 22855;
      short var10003 = 17437;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      short var10004 = 22853;
      short var10005 = 8758;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         IIlllllIlIlIlIIIIIlllIIlIlIlllIIIIlIllIlIIlIlIllIIlllIIIIllIIlllIIlIlIIIlIlIlIlIlllIl.a()
      };
      super("Time Changer", "Makes you able to set a custom time.", var3, "Visual", var1);
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      Intrinsics.checkNotNullParameter(var1, "e");
      if (var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI instanceof ClientboundSetTimePacket) {
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = ((ClientboundSetTimePacket)var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI)
            .gameTime();
      }
   }

   @SubscribeEvent
   public final void a(@NotNull lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI var1) {
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      Intrinsics.checkNotNullParameter(var1, "e");
      String var2 = var10000;
      if (var1.c()) {
         ClientLevel var3 = this.ap().level;
         if (var2 == null) {
            if (var3 == null) {
               return;
            }

            var3 = this.ap().level;
            Intrinsics.checkNotNull(var3);
         }

         var3.setTimeFromServer(IIlllllIlIlIlIIIIIlllIIlIlIlllIIIIlIllIlIIlIlIllIIlllIIIIllIIlllIIlIlIIIlIlIlIlIlllIl.a().M() * 100L);
      }
   }

   @Override
   public boolean ae() {
      return this.aA();
   }

   @Override
   public void aB() {
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      this.as();
      String var1 = var10000;
      IlIIIlllllIlllIIlIlIIlIlllllIIlllIIlllIIIIIlIIIIlIlllIIIIllllIlIlIIlllIIIIIIlIlIllIII var2 = this;
      if (var1 == null) {
         if (this.ap().level == null) {
            return;
         }

         var2 = this;
      }

      ClientLevel var10001 = this.ap().level;
      Intrinsics.checkNotNull(var10001);
      var2.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var10001.getOverworldClockTime();
   }

   @Override
   public void aC() {
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      this.at();
      String var1 = var10000;
      ClientLevel var2 = this.ap().level;
      if (var1 == null) {
         if (var2 == null) {
            return;
         }

         var2 = this.ap().level;
         Intrinsics.checkNotNull(var2);
      }

      var2.setTimeFromServer(this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "d»'\u000bz]Úm\u0097+\u001cÈw£¢&;J}Ý7ß\u0092Û(Á¬fj´Ëvß\u008c+ò\f\nºÖ\"Ñ\u001b\u0087¤\u0014\u009a\u0010A\u0006Ëê²8Áe";
      int var4 = "d»'\u000bz]Úm\u0097+\u001cÈw£¢&;J}Ý7ß\u0092Û(Á¬fj´Ëvß\u008c+ò\f\nºÖ\"Ñ\u001b\u0087¤\u0014\u009a\u0010A\u0006Ëê²8Áe".length();
      char var1 = '$';
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 94;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 94;
               var10006 = var6;
            } else {
               var13 = 94;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 94;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 28;
                  case 1 -> 22;
                  case 2 -> 50;
                  case 3 -> 3;
                  case 4 -> 56;
                  case 5 -> 32;
                  default -> 99;
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
            f = var5;
            g = new String[3];
            lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IlIIIlllllIlllIIlIlIIlIlllllIIlllIIlllIIIIIlIIIIlIlllIIIIllllIlIlIIlllIIIIIIlIlIllIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
            lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new IlIIIlllllIlllIIlIlIIlIlllllIIlllIIlllIIIIIlIIIIlIlllIIIIllllIlIlIIlllIIIIIIlIlIllIII();
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 22855) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 0;
            case 1 -> 84;
            case 2 -> 212;
            case 3 -> 16;
            case 4 -> 14;
            case 5 -> 61;
            case 6 -> 53;
            case 7 -> 101;
            case 8 -> 190;
            case 9 -> 127;
            case 10 -> 240;
            case 11 -> 150;
            case 12 -> 25;
            case 13 -> 138;
            case 14 -> 42;
            case 15 -> 232;
            case 16 -> 226;
            case 17 -> 80;
            case 18 -> 65;
            case 19 -> 238;
            case 20 -> 12;
            case 21 -> 245;
            case 22 -> 4;
            case 23 -> 167;
            case 24 -> 198;
            case 25 -> 40;
            case 26 -> 200;
            case 27 -> 205;
            case 28 -> 183;
            case 29 -> 239;
            case 30 -> 90;
            case 31 -> 216;
            case 32 -> 243;
            case 33 -> 213;
            case 34 -> 194;
            case 35 -> 26;
            case 36 -> 123;
            case 37 -> 46;
            case 38 -> 178;
            case 39 -> 231;
            case 40 -> 79;
            case 41 -> 148;
            case 42 -> 49;
            case 43 -> 57;
            case 44 -> 59;
            case 45 -> 115;
            case 46 -> 15;
            case 47 -> 155;
            case 48 -> 96;
            case 49 -> 121;
            case 50 -> 41;
            case 51 -> 76;
            case 52 -> 187;
            case 53 -> 66;
            case 54 -> 22;
            case 55 -> 78;
            case 56 -> 235;
            case 57 -> 197;
            case 58 -> 186;
            case 59 -> 221;
            case 60 -> 94;
            case 61 -> 7;
            case 62 -> 73;
            case 63 -> 17;
            case 64 -> 51;
            case 65 -> 103;
            case 66 -> 27;
            case 67 -> 122;
            case 68 -> 209;
            case 69 -> 81;
            case 70 -> 69;
            case 71 -> 154;
            case 72 -> 179;
            case 73 -> 126;
            case 74 -> 196;
            case 75 -> 45;
            case 76 -> 193;
            case 77 -> 2;
            case 78 -> 118;
            case 79 -> 55;
            case 80 -> 250;
            case 81 -> 144;
            case 82 -> 134;
            case 83 -> 164;
            case 84 -> 220;
            case 85 -> 6;
            case 86 -> 85;
            case 87 -> 176;
            case 88 -> 9;
            case 89 -> 99;
            case 90 -> 95;
            case 91 -> 104;
            case 92 -> 170;
            case 93 -> 139;
            case 94 -> 107;
            case 95 -> 173;
            case 96 -> 10;
            case 97 -> 124;
            case 98 -> 11;
            case 99 -> 208;
            case 100 -> 195;
            case 101 -> 166;
            case 102 -> 227;
            case 103 -> 50;
            case 104 -> 185;
            case 105 -> 54;
            case 106 -> 241;
            case 107 -> 24;
            case 108 -> 110;
            case 109 -> 58;
            case 110 -> 116;
            case 111 -> 47;
            case 112 -> 3;
            case 113 -> 142;
            case 114 -> 224;
            case 115 -> 244;
            case 116 -> 255;
            case 117 -> 215;
            case 118 -> 117;
            case 119 -> 36;
            case 120 -> 189;
            case 121 -> 98;
            case 122 -> 249;
            case 123 -> 89;
            case 124 -> 181;
            case 125 -> 234;
            case 126 -> 132;
            case 127 -> 29;
            case 128 -> 152;
            case 129 -> 211;
            case 130 -> 247;
            case 131 -> 102;
            case 132 -> 128;
            case 133 -> 77;
            case 134 -> 34;
            case 135 -> 210;
            case 136 -> 171;
            case 137 -> 87;
            case 138 -> 30;
            case 139 -> 1;
            case 140 -> 161;
            case 141 -> 72;
            case 142 -> 248;
            case 143 -> 202;
            case 144 -> 97;
            case 145 -> 143;
            case 146 -> 93;
            case 147 -> 44;
            case 148 -> 105;
            case 149 -> 222;
            case 150 -> 153;
            case 151 -> 74;
            case 152 -> 119;
            case 153 -> 136;
            case 154 -> 21;
            case 155 -> 71;
            case 156 -> 206;
            case 157 -> 67;
            case 158 -> 35;
            case 159 -> 88;
            case 160 -> 158;
            case 161 -> 254;
            case 162 -> 223;
            case 163 -> 184;
            case 164 -> 141;
            case 165 -> 135;
            case 166 -> 156;
            case 167 -> 48;
            case 168 -> 237;
            case 169 -> 111;
            case 170 -> 162;
            case 171 -> 62;
            case 172 -> 251;
            case 173 -> 233;
            case 174 -> 160;
            case 175 -> 147;
            case 176 -> 64;
            case 177 -> 157;
            case 178 -> 31;
            case 179 -> 5;
            case 180 -> 37;
            case 181 -> 109;
            case 182 -> 201;
            case 183 -> 18;
            case 184 -> 146;
            case 185 -> 108;
            case 186 -> 252;
            case 187 -> 39;
            case 188 -> 114;
            case 189 -> 172;
            case 190 -> 219;
            case 191 -> 23;
            case 192 -> 100;
            case 193 -> 33;
            case 194 -> 242;
            case 195 -> 163;
            case 196 -> 43;
            case 197 -> 174;
            case 198 -> 165;
            case 199 -> 175;
            case 200 -> 38;
            case 201 -> 246;
            case 202 -> 113;
            case 203 -> 13;
            case 204 -> 32;
            case 205 -> 168;
            case 206 -> 182;
            case 207 -> 82;
            case 208 -> 106;
            case 209 -> 129;
            case 210 -> 180;
            case 211 -> 225;
            case 212 -> 52;
            case 213 -> 130;
            case 214 -> 169;
            case 215 -> 192;
            case 216 -> 131;
            case 217 -> 56;
            case 218 -> 207;
            case 219 -> 120;
            case 220 -> 229;
            case 221 -> 204;
            case 222 -> 137;
            case 223 -> 177;
            case 224 -> 75;
            case 225 -> 68;
            case 226 -> 28;
            case 227 -> 230;
            case 228 -> 203;
            case 229 -> 145;
            case 230 -> 19;
            case 231 -> 92;
            case 232 -> 191;
            case 233 -> 20;
            case 234 -> 70;
            case 235 -> 8;
            case 236 -> 236;
            case 237 -> 228;
            case 238 -> 149;
            case 239 -> 63;
            case 240 -> 159;
            case 241 -> 188;
            case 242 -> 151;
            case 243 -> 83;
            case 244 -> 91;
            case 245 -> 214;
            case 246 -> 112;
            case 247 -> 217;
            case 248 -> 140;
            case 249 -> 218;
            case 250 -> 253;
            case 251 -> 60;
            case 252 -> 125;
            case 253 -> 133;
            case 254 -> 86;
            default -> 199;
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

    // PX-FIX TOP5F: Kotlin synthetic no-arg marker ctor (jar: <init>(DefaultConstructorMarker))
    public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker marker) {
        this();
    }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }
}
