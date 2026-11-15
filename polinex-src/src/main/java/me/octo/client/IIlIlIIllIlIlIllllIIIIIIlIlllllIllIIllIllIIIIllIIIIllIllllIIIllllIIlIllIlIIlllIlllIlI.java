package me.octo.client;

import java.util.Arrays;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundSoundPacket;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import org.jetbrains.annotations.NotNull;

public final class IIlIlIIllIlIlIllllIIIIIIlIlllllIllIIllIllIIIIllIIIIllIllllIIIllllIIlIllIlIIlllIlllIlI
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static IIlIlIIllIlIlIllllIIIIIIlIlllllIllIIllIllIIIIllIIIIllIllllIIIllllIIlIllIlIIlllIlllIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @JvmField
   @NotNull
   public static IIlIlIIllIlIlIllllIIIIIIlIlllllIllIIllIllIIIIllIIIIllIllllIIIllllIIlIllIlIIlllIlllIlI lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] f;
   private static String[] g;

   public IIlIlIIllIlIlIllllIIIIIIlIlllllIllIIllIllIIIIllIIIIllIllllIIIllllIIlIllIlIIlllIlllIlI() {
      short var10001 = 19594;
      short var10002 = -20398;
      var10002 = 19597;
      short var10003 = 25118;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      short var10004 = 19592;
      short var10005 = 12274;
      IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl[] var1 = IlllllllIllIlIIIIIllIlllIllIIlIllllIIlIIllIIllIIIllllIllIllIllIllIIlIIllllIllIIIlllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .c();
      super("Annoyance Remover", "Removes annoying Skyblock quirks.", var3, "Misc", Arrays.copyOf(var1, var1.length));
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      int[] var2 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var10000 = var1;
      if (var2 == null) {
         short var10001 = 19598;
         short var10002 = 23698;
         Intrinsics.checkNotNullParameter(var1, "event");
         if (!IlllllllIllIlIIIIIllIlllIllIIlIllllIIlIIllIIllIIIllllIllIllIllIllIIlIIllllIllIIIlllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a()
            .ae()) {
            return;
         }

         var10000 = var1;
      }

      Packet var3 = var10000.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      boolean var6 = var3 instanceof ClientboundSystemChatPacket;
      if (var2 == null) {
         if (var6) {
            String var7 = ((ClientboundSystemChatPacket)var3).content().getString();
            short var12 = 19595;
            short var10003 = 30008;
            Intrinsics.checkNotNullExpressionValue(var7, "getString(...)");
            String var5 = var7;
            CharSequence var8 = var5;
            var12 = 19599;
            var10003 = -8952;
            var1.a(StringsKt.contains(var8, "There are blocks in the way!", false));
            if (var2 == null) {
               return;
            }
         }

         var6 = var3 instanceof ClientboundSoundPacket;
      }

      if (var6) {
         boolean var11;
         label45: {
            label55: {
               String var9 = ((ClientboundSoundPacket)var3).getSound().value().location().toString();
               short var16 = 19593;
               short var10004 = -18197;
               Intrinsics.checkNotNullExpressionValue(var9, "toString(...)");
               CharSequence var10 = var9;
               short var14 = 19596;
               var16 = 23975;
               var11 = StringsKt.contains(var10, "orb", false);
               if (var2 == null) {
                  if (!var11) {
                     break label55;
                  }

                  var11 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .q();
               }

               if (var2 != null) {
                  break label45;
               }

               if (var11) {
                  var11 = true;
                  break label45;
               }
            }

            var11 = false;
         }

         var1.a(var11);
         if (var2 == null) {
            ;
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[8];
      int var3 = 0;
      String var2 = "z¨í4Í$\u0012£Èé½7(móx*PÌ\u000f\u009d\u0015\u0004÷î\u0017ïÓ\u0005%Xlå\u0003³]A\u001c:è+\u008d\u000fè)\u0085û{SánÞêQ¬Ù\u0019\u001a\u0094ÁûªFÖmÖ\u0005=áÜmà\r\u009ek\u00ad\u001c8U5GÛ\u009aÿPx\u00046n\u0086m";
      int var4 = "z¨í4Í$\u0012£Èé½7(móx*PÌ\u000f\u009d\u0015\u0004÷î\u0017ïÓ\u0005%Xlå\u0003³]A\u001c:è+\u008d\u000fè)\u0085û{SánÞêQ¬Ù\u0019\u001a\u0094ÁûªFÖmÖ\u0005=áÜmà\r\u009ek\u00ad\u001c8U5GÛ\u009aÿPx\u00046n\u0086m"
         .length();
      char var1 = '!';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 59;
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
                     case 0 -> 124;
                     case 1 -> 69;
                     case 2 -> 4;
                     case 3 -> 115;
                     case 4 -> 26;
                     case 5 -> 119;
                     default -> 127;
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
                     g = new String[8];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IIlIlIIllIlIlIllllIIIIIIlIlllllIllIIllIllIIIIllIIIIllIllllIIIllllIIlIllIlIIlllIlllIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new IIlIlIIllIlIlIllllIIIIIIlIlllllIllIIllIllIIIIllIIIIllIllllIIIllllIIlIllIlIIlllIlllIlI();
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

                  var2 = "ú\u0004\u008ed`{\u0006\nìäF ±O\u0011²Æ\u007fj\n\u0012à[Õj_3\"YÅÃ\\";
                  var4 = "ú\u0004\u008ed`{\u0006\nìäF ±O\u0011²Æ\u007fj\n\u0012à[Õj_3\"YÅÃ\\".length();
                  var1 = 14;
                  var8 = -1;
            }

            var10000 = 5;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 19597) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 63;
            case 1 -> 235;
            case 2 -> 33;
            case 3 -> 36;
            case 4 -> 140;
            case 5 -> 22;
            case 6 -> 214;
            case 7 -> 109;
            case 8 -> 133;
            case 9 -> 78;
            case 10 -> 43;
            case 11 -> 97;
            case 12 -> 6;
            case 13 -> 107;
            case 14 -> 157;
            case 15 -> 23;
            case 16 -> 137;
            case 17 -> 101;
            case 18 -> 118;
            case 19 -> 59;
            case 20 -> 58;
            case 21 -> 226;
            case 22 -> 11;
            case 23 -> 99;
            case 24 -> 201;
            case 25 -> 232;
            case 26 -> 93;
            case 27 -> 74;
            case 28 -> 152;
            case 29 -> 238;
            case 30 -> 192;
            case 31 -> 197;
            case 32 -> 202;
            case 33 -> 180;
            case 34 -> 81;
            case 35 -> 144;
            case 36 -> 185;
            case 37 -> 30;
            case 38 -> 253;
            case 39 -> 181;
            case 40 -> 145;
            case 41 -> 186;
            case 42 -> 55;
            case 43 -> 194;
            case 44 -> 17;
            case 45 -> 27;
            case 46 -> 128;
            case 47 -> 219;
            case 48 -> 166;
            case 49 -> 34;
            case 50 -> 143;
            case 51 -> 96;
            case 52 -> 134;
            case 53 -> 1;
            case 54 -> 228;
            case 55 -> 254;
            case 56 -> 29;
            case 57 -> 159;
            case 58 -> 210;
            case 59 -> 91;
            case 60 -> 161;
            case 61 -> 175;
            case 62 -> 38;
            case 63 -> 135;
            case 64 -> 241;
            case 65 -> 132;
            case 66 -> 72;
            case 67 -> 250;
            case 68 -> 14;
            case 69 -> 225;
            case 70 -> 139;
            case 71 -> 245;
            case 72 -> 236;
            case 73 -> 70;
            case 74 -> 163;
            case 75 -> 19;
            case 76 -> 229;
            case 77 -> 16;
            case 78 -> 113;
            case 79 -> 222;
            case 80 -> 54;
            case 81 -> 13;
            case 82 -> 123;
            case 83 -> 167;
            case 84 -> 77;
            case 85 -> 18;
            case 86 -> 102;
            case 87 -> 191;
            case 88 -> 56;
            case 89 -> 121;
            case 90 -> 176;
            case 91 -> 95;
            case 92 -> 149;
            case 93 -> 243;
            case 94 -> 117;
            case 95 -> 65;
            case 96 -> 71;
            case 97 -> 156;
            case 98 -> 216;
            case 99 -> 151;
            case 100 -> 184;
            case 101 -> 177;
            case 102 -> 126;
            case 103 -> 7;
            case 104 -> 94;
            case 105 -> 37;
            case 106 -> 160;
            case 107 -> 172;
            case 108 -> 131;
            case 109 -> 237;
            case 110 -> 100;
            case 111 -> 45;
            case 112 -> 246;
            case 113 -> 182;
            case 114 -> 47;
            case 115 -> 187;
            case 116 -> 46;
            case 117 -> 92;
            case 118 -> 239;
            case 119 -> 64;
            case 120 -> 129;
            case 121 -> 154;
            case 122 -> 115;
            case 123 -> 213;
            case 124 -> 141;
            case 125 -> 223;
            case 126 -> 50;
            case 127 -> 234;
            case 128 -> 116;
            case 129 -> 35;
            case 130 -> 249;
            case 131 -> 84;
            case 132 -> 52;
            case 133 -> 204;
            case 134 -> 82;
            case 135 -> 190;
            case 136 -> 189;
            case 137 -> 203;
            case 138 -> 224;
            case 139 -> 61;
            case 140 -> 41;
            case 141 -> 242;
            case 142 -> 73;
            case 143 -> 26;
            case 144 -> 20;
            case 145 -> 104;
            case 146 -> 69;
            case 147 -> 51;
            case 148 -> 227;
            case 149 -> 212;
            case 150 -> 155;
            case 151 -> 183;
            case 152 -> 24;
            case 153 -> 124;
            case 154 -> 158;
            case 155 -> 25;
            case 156 -> 42;
            case 157 -> 21;
            case 158 -> 207;
            case 159 -> 211;
            case 160 -> 221;
            case 161 -> 251;
            case 162 -> 174;
            case 163 -> 122;
            case 164 -> 4;
            case 165 -> 68;
            case 166 -> 85;
            case 167 -> 112;
            case 168 -> 165;
            case 169 -> 49;
            case 170 -> 87;
            case 171 -> 248;
            case 172 -> 9;
            case 173 -> 217;
            case 174 -> 196;
            case 175 -> 168;
            case 176 -> 39;
            case 177 -> 136;
            case 178 -> 218;
            case 179 -> 150;
            case 180 -> 215;
            case 181 -> 3;
            case 182 -> 138;
            case 183 -> 130;
            case 184 -> 171;
            case 185 -> 231;
            case 186 -> 195;
            case 187 -> 120;
            case 188 -> 162;
            case 189 -> 169;
            case 190 -> 57;
            case 191 -> 75;
            case 192 -> 199;
            case 193 -> 198;
            case 194 -> 220;
            case 195 -> 2;
            case 196 -> 98;
            case 197 -> 148;
            case 198 -> 40;
            case 199 -> 28;
            case 200 -> 0;
            case 201 -> 5;
            case 202 -> 88;
            case 203 -> 200;
            case 204 -> 80;
            case 205 -> 67;
            case 206 -> 188;
            case 207 -> 252;
            case 208 -> 230;
            case 209 -> 53;
            case 210 -> 255;
            case 211 -> 173;
            case 212 -> 32;
            case 213 -> 125;
            case 214 -> 105;
            case 215 -> 83;
            case 216 -> 142;
            case 217 -> 62;
            case 218 -> 110;
            case 219 -> 178;
            case 220 -> 31;
            case 221 -> 208;
            case 222 -> 244;
            case 223 -> 170;
            case 224 -> 108;
            case 225 -> 111;
            case 226 -> 247;
            case 227 -> 240;
            case 228 -> 10;
            case 229 -> 86;
            case 230 -> 103;
            case 231 -> 193;
            case 232 -> 164;
            case 233 -> 205;
            case 234 -> 90;
            case 235 -> 60;
            case 236 -> 66;
            case 237 -> 48;
            case 238 -> 119;
            case 239 -> 79;
            case 240 -> 153;
            case 241 -> 206;
            case 242 -> 179;
            case 243 -> 44;
            case 244 -> 12;
            case 245 -> 146;
            case 246 -> 127;
            case 247 -> 209;
            case 248 -> 89;
            case 249 -> 76;
            case 250 -> 15;
            case 251 -> 233;
            case 252 -> 8;
            case 253 -> 114;
            case 254 -> 147;
            default -> 106;
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
