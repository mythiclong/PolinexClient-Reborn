package me.octo.client;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.fabricmc.fabric.api.client.rendering.v1.level.LevelRenderContext;
import net.minecraft.core.BlockPos;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI
   implements lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl {
   @Nullable
   private List<? extends BlockPos> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static String[] a;
   private static String[] b;

   public IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI() {
      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .a(this);
   }

   @NotNull
   @Override
   public IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI a() {
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      short var10001 = -13141;
      short var10002 = -31777;
      var10002 = -13144;
      short var10003 = 5615;
      var10000 = var10000.a("powder", "Powder algorithms");
      IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2 = IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      var10002 = -13139;
      var10003 = 6671;
      return var10000.a(
            var2.a("ignoreOre")
               .a(
                  IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
               )
               .b()
         )
         .a((kotlin.jvm.functions.Function1)null)
         .a();
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIllIlllIIIIIllllIlllIIllIIIlIIllIIllIIlIllIIllIIIlIllIIlIIIIIlIIIIlIlIIIIIIlIlllIllI var1) {
      String[] var10000 = IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.c();
      short var10002 = -13142;
      short var10003 = -11327;
      Intrinsics.checkNotNullParameter(var1, "event");
      String[] var2 = var10000;
      if (var2 != null) {
         LevelRenderContext var10 = var1.k();
         if (var10 != null) {
            LevelRenderContext var3 = var10;
            if (var2 != null && this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl != null) {
               Iterable var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
               boolean var5 = false;

               for (Object var7 : var4) {
                  BlockPos var8 = (BlockPos)var7;
                  boolean var9 = false;
                  me.octo.client.utils.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                     var3,
                     var8,
                     me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI,
                     1.0,
                     true);
                  if (var2 == null || var2 == null) {
                     break;
                  }
               }
            }

            return;
         }
      }
   }

   private static final Unit a(
      IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI var0,
      llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var1
   ) {
      Object var19 = null; // PX-FIX
      short var10001 = -13140;
      short var10002 = 20101;
      Intrinsics.checkNotNullParameter(var1, "context");
      int var10000 = -13143;
      llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var4 = var1;
      var10001 = 18007;
      String var5 = "ignoreOre";
      boolean var6 = false;
      String[] var16 = IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.c();
      Iterable var7 = var1.a().b();
      String[] var2 = var16;
      boolean var8 = false;
      int var9 = 0;
      Iterator var10 = var7.iterator();

      label44: {
         while (true) {
            if (var10.hasNext()) {
               Object var11 = var10.next();
               int var12 = var9++;
               var10000 = var12;
               if (var2 == null) {
                  break label44;
               }

               if (var2 != null) {
                  if (var12 < 0) {
                     CollectionsKt.throwIndexOverflow();
                  }

                  var10000 = var12;
               }

               IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll var13 = (IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll)var11;
               int var14 = var10000;
               boolean var15 = false;
               if (var2 != null && Intrinsics.areEqual(var13.a(), var5) && var14 < var4.b().length) {
                  Object var20 = var4.b()[var14];
                  if (!(var20 instanceof Boolean)) {
                     var20 = null;
                  }

                  var19 = (Boolean)var20;
                  break;
               }

               if (var2 != null) {
                  continue;
               }
            }

            var19 = null;
            break;
         }

         var10000 = var19 != null && (Boolean)var19 ? 1 : 0;
      }

      int var3 = var10000;
      var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = me.octo.client.utils.player.pathfinder.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var3 != 0);
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "BRì\u0002|\u0004´Y\u0017\u0088Âõm$\u0005Ú?\ta\u001d\u008fé=\u0004\u0006¿Ê\u0005¥©\u0091M\u0092\u0006]'+¬\u0084Ñ";
      int var4 = "BRì\u0002|\u0004´Y\u0017\u0088Âõm$\u0005Ú?\ta\u001d\u008fé=\u0004\u0006¿Ê\u0005¥©\u0091M\u0092\u0006]'+¬\u0084Ñ".length();
      char var1 = 17;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 19;
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
                     case 0 -> 85;
                     case 1 -> 84;
                     case 2 -> 82;
                     case 3 -> 85;
                     case 4 -> 38;
                     case 5 -> 5;
                     default -> 103;
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

                  var2 = "\u0003×!\u000bV\u0094\f\tgcæ\u008f¹a?ºD";
                  var4 = "\u0003×!\u000bV\u0094\f\tgcæ\u008f¹a?ºD".length();
                  var1 = 7;
                  var8 = -1;
            }

            var10000 = 63;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -13144) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 99;
            case 1 -> 97;
            case 2 -> 101;
            case 3 -> 181;
            case 4 -> 155;
            case 5 -> 111;
            case 6 -> 140;
            case 7 -> 54;
            case 8 -> 93;
            case 9 -> 153;
            case 10 -> 121;
            case 11 -> 242;
            case 12 -> 78;
            case 13 -> 171;
            case 14 -> 11;
            case 15 -> 18;
            case 16 -> 0;
            case 17 -> 205;
            case 18 -> 198;
            case 19 -> 81;
            case 20 -> 253;
            case 21 -> 156;
            case 22 -> 36;
            case 23 -> 80;
            case 24 -> 175;
            case 25 -> 63;
            case 26 -> 220;
            case 27 -> 116;
            case 28 -> 68;
            case 29 -> 64;
            case 30 -> 139;
            case 31 -> 25;
            case 32 -> 39;
            case 33 -> 230;
            case 34 -> 218;
            case 35 -> 204;
            case 36 -> 130;
            case 37 -> 252;
            case 38 -> 114;
            case 39 -> 9;
            case 40 -> 89;
            case 41 -> 124;
            case 42 -> 133;
            case 43 -> 143;
            case 44 -> 251;
            case 45 -> 91;
            case 46 -> 128;
            case 47 -> 226;
            case 48 -> 238;
            case 49 -> 214;
            case 50 -> 186;
            case 51 -> 254;
            case 52 -> 168;
            case 53 -> 75;
            case 54 -> 169;
            case 55 -> 225;
            case 56 -> 126;
            case 57 -> 206;
            case 58 -> 250;
            case 59 -> 246;
            case 60 -> 104;
            case 61 -> 163;
            case 62 -> 236;
            case 63 -> 29;
            case 64 -> 222;
            case 65 -> 15;
            case 66 -> 71;
            case 67 -> 227;
            case 68 -> 92;
            case 69 -> 243;
            case 70 -> 147;
            case 71 -> 202;
            case 72 -> 112;
            case 73 -> 28;
            case 74 -> 65;
            case 75 -> 185;
            case 76 -> 90;
            case 77 -> 107;
            case 78 -> 13;
            case 79 -> 223;
            case 80 -> 137;
            case 81 -> 188;
            case 82 -> 108;
            case 83 -> 138;
            case 84 -> 170;
            case 85 -> 199;
            case 86 -> 22;
            case 87 -> 180;
            case 88 -> 245;
            case 89 -> 215;
            case 90 -> 33;
            case 91 -> 231;
            case 92 -> 45;
            case 93 -> 70;
            case 94 -> 87;
            case 95 -> 152;
            case 96 -> 244;
            case 97 -> 24;
            case 98 -> 161;
            case 99 -> 224;
            case 100 -> 58;
            case 101 -> 209;
            case 102 -> 149;
            case 103 -> 187;
            case 104 -> 177;
            case 105 -> 123;
            case 106 -> 7;
            case 107 -> 119;
            case 108 -> 189;
            case 109 -> 195;
            case 110 -> 176;
            case 111 -> 157;
            case 112 -> 62;
            case 113 -> 32;
            case 114 -> 38;
            case 115 -> 249;
            case 116 -> 174;
            case 117 -> 164;
            case 118 -> 118;
            case 119 -> 134;
            case 120 -> 88;
            case 121 -> 136;
            case 122 -> 233;
            case 123 -> 85;
            case 124 -> 10;
            case 125 -> 217;
            case 126 -> 4;
            case 127 -> 52;
            case 128 -> 144;
            case 129 -> 51;
            case 130 -> 46;
            case 131 -> 19;
            case 132 -> 228;
            case 133 -> 193;
            case 134 -> 200;
            case 135 -> 142;
            case 136 -> 37;
            case 137 -> 221;
            case 138 -> 77;
            case 139 -> 49;
            case 140 -> 21;
            case 141 -> 237;
            case 142 -> 16;
            case 143 -> 148;
            case 144 -> 167;
            case 145 -> 23;
            case 146 -> 197;
            case 147 -> 40;
            case 148 -> 135;
            case 149 -> 1;
            case 150 -> 172;
            case 151 -> 141;
            case 152 -> 208;
            case 153 -> 69;
            case 154 -> 131;
            case 155 -> 191;
            case 156 -> 232;
            case 157 -> 110;
            case 158 -> 2;
            case 159 -> 98;
            case 160 -> 96;
            case 161 -> 44;
            case 162 -> 229;
            case 163 -> 184;
            case 164 -> 203;
            case 165 -> 178;
            case 166 -> 196;
            case 167 -> 122;
            case 168 -> 66;
            case 169 -> 150;
            case 170 -> 76;
            case 171 -> 173;
            case 172 -> 241;
            case 173 -> 17;
            case 174 -> 34;
            case 175 -> 47;
            case 176 -> 42;
            case 177 -> 146;
            case 178 -> 74;
            case 179 -> 239;
            case 180 -> 166;
            case 181 -> 194;
            case 182 -> 212;
            case 183 -> 182;
            case 184 -> 234;
            case 185 -> 106;
            case 186 -> 201;
            case 187 -> 56;
            case 188 -> 219;
            case 189 -> 103;
            case 190 -> 154;
            case 191 -> 6;
            case 192 -> 5;
            case 193 -> 94;
            case 194 -> 160;
            case 195 -> 79;
            case 196 -> 83;
            case 197 -> 248;
            case 198 -> 207;
            case 199 -> 8;
            case 200 -> 43;
            case 201 -> 41;
            case 202 -> 213;
            case 203 -> 67;
            case 204 -> 255;
            case 205 -> 129;
            case 206 -> 247;
            case 207 -> 100;
            case 208 -> 53;
            case 209 -> 179;
            case 210 -> 72;
            case 211 -> 125;
            case 212 -> 102;
            case 213 -> 235;
            case 214 -> 190;
            case 215 -> 105;
            case 216 -> 115;
            case 217 -> 165;
            case 218 -> 210;
            case 219 -> 95;
            case 220 -> 48;
            case 221 -> 57;
            case 222 -> 14;
            case 223 -> 117;
            case 224 -> 127;
            case 225 -> 30;
            case 226 -> 159;
            case 227 -> 59;
            case 228 -> 113;
            case 229 -> 61;
            case 230 -> 145;
            case 231 -> 60;
            case 232 -> 240;
            case 233 -> 151;
            case 234 -> 55;
            case 235 -> 192;
            case 236 -> 3;
            case 237 -> 50;
            case 238 -> 158;
            case 239 -> 162;
            case 240 -> 86;
            case 241 -> 216;
            case 242 -> 26;
            case 243 -> 73;
            case 244 -> 82;
            case 245 -> 31;
            case 246 -> 211;
            case 247 -> 84;
            case 248 -> 120;
            case 249 -> 35;
            case 250 -> 12;
            case 251 -> 132;
            case 252 -> 109;
            case 253 -> 20;
            case 254 -> 183;
            default -> 27;
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
