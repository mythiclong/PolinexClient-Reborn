package me.octo.client;

import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.world.entity.Entity;
import org.jetbrains.annotations.NotNull;

public final class IlIIlllllllllIllllIlllIllIlIIlIIIIIlIIllIIIllllIllIlIlIIllllllIIIIlIIllIIIlIIIIllIIII {
   @NotNull
   public static IlIIlllllllllIllllIlllIllIlIIlIIIIIlIIllIIIllllIllIlIlIIllllllIIIIlIIllIIIlIIIIllIIII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Int2IntOpenHashMap lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static Object IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String[] a;
   private static String[] b;

   private IlIIlllllllllIllllIlllIllIlIIlIIIIIlIIllIIIllllIllIlIlIIllllllIIIIlIIllIIIlIIIIllIIII() {
   }

   // $VF: Extended synchronized range to monitorexit
   @JvmStatic
   public static final void a(@NotNull Entity var0, int var1) {
      short var10001 = -7423;
      short var10002 = 9493;
      Intrinsics.checkNotNullParameter(var0, "entity");
      Object var2 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      synchronized (var2) {
         int var3 = 0;
         var3 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.put(var0.getId(), var1);
      }
   }

   @JvmStatic
   public static final void a(
      @NotNull Entity var0, @NotNull me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1
   ) {
      short var10001 = -7423;
      short var10002 = 9493;
      Intrinsics.checkNotNullParameter(var0, "entity");
      var10001 = -7419;
      var10002 = -31036;
      Intrinsics.checkNotNullParameter(var1, "color");
      a(var0, var1.o());
   }

   @JvmStatic
   public static final void a(@NotNull Entity var0, @NotNull llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1) {
      short var10001 = -7423;
      short var10002 = 9493;
      Intrinsics.checkNotNullParameter(var0, "entity");
      var10001 = -7424;
      var10002 = -21829;
      Intrinsics.checkNotNullParameter(var1, "color");
      a(var0, var1.h());
   }

   // $VF: Extended synchronized range to monitorexit
   @JvmStatic
   public static final void a(@NotNull Entity var0) {
      short var10001 = -7421;
      short var10002 = 28691;
      Intrinsics.checkNotNullParameter(var0, "entity");
      Object var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      synchronized (var1) {
         int var2 = 0;
         var2 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.remove(var0.getId());
      }
   }

   // $VF: Extended synchronized range to monitorexit
   @JvmStatic
   public static final boolean b(@NotNull Entity var0) {
      short var10001 = -7423;
      short var10002 = 9493;
      Intrinsics.checkNotNullParameter(var0, "entity");
      Object var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      synchronized (var1) {
         boolean var2 = false;
         return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.containsKey(var0.getId());
      }
   }

   // $VF: Extended synchronized range to monitorexit
   @JvmStatic
   public static final int c(@NotNull Entity var0) {
      short var10001 = -7423;
      short var10002 = 9493;
      Intrinsics.checkNotNullParameter(var0, "entity");
      Object var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      synchronized (var1) {
         boolean var2 = false;
         return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.get(var0.getId());
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @JvmStatic
   public static final boolean a() {
      int var10000 = ((IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.c()) ? 1 : 0);
      Object var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      synchronized (var1){} // $VF: monitorenter 
      boolean var0 = (var10000 != 0);

      int var4;
      try {
         boolean var2 = false;
         var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.size();
         if (!var0) {
            var10000 = var10000 != 0 ? 1 : 0;
         }

         var4 = var10000;
      } finally {
         // $VF: monitorexit
      }

      return (var4 != 0);
   }

   // $VF: Extended synchronized range to monitorexit
   @JvmStatic
   public static final void b() {
      Object var0 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      synchronized (var0) {
         boolean var1 = false;
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.clear();
         Unit var4 = Unit.INSTANCE;
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      short var10001 = -7422;
      short var10002 = 20904;
      Intrinsics.checkNotNullParameter(var1, "event");
      b();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var23 = null; // PX-FIX
      String[] var5 = new String[5];
      int var3 = 0;
      String var2 = "¼\u0082îä\u0088}\u0005n\u0096jA\u0005\u0006ö\u009b§Ç¡\u0019";
      int var4 = "¼\u0082îä\u0088}\u0005n\u0096jA\u0005\u0006ö\u009b§Ç¡\u0019".length();
      char var1 = 6;
      int var11 = -1;

      label52:
while (true) {
         byte var10000 = 76;
         String var10001 = var2.substring(++var11, var11 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var27 = var10001.toCharArray();
               int var10004 = var27.length;
               int var6 = 0;
               byte var30 = var10000;
               var23 = var27;
               int var17 = var10004;
               byte var35;
               char[] var39;
               int var10006;
               if (var10004 <= 1) {
                  var39 = var27;
                  var35 = var10000;
                  var10006 = var6;
               } else {
                  var30 = var10000;
                  var17 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var39 = var27;
                  var35 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var39[var10006] = (char)(var39[var10006] ^ var35 ^ switch (var6 % 7) {
                     case 0 -> 72;
                     case 1 -> 77;
                     case 2 -> 8;
                     case 3 -> 18;
                     case 4 -> 31;
                     case 5 -> 91;
                     default -> 85;
                  });
                  var6++;
                  if (var30 == 0) {
                     var10006 = var30;
                     var39 = var23;
                     var35 = var30;
                  } else {
                     if (var17 <= var6) {
                        break;
                     }

                     var39 = var23;
                     var35 = var30;
                     var10006 = var6;
                  }
               }
            }

            String var32 = new String(var23).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var32;
                  if ((var11 += var1) >= var4) {
                     a = var5;
                     b = new String[5];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IlIIlllllllllIllllIlllIllIlIIlIIIIIlIIllIIIllllIllIlIlIIllllllIIIIlIIllIIIlIIIIllIIII();
                     Int2IntOpenHashMap var7 = new Int2IntOpenHashMap();
                     boolean var9 = false;
                     var7.defaultReturnValue(0);
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var7;
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new Object();
                     llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        .a(IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
                     break label52;
                  }

                  var1 = var2.charAt(var11);
                  break;
               default:
                  var5[var3++] = var32;
                  if ((var11 += var1) < var4) {
                     var1 = var2.charAt(var11);
                     continue label52;
                  }

                  var2 = " ïØáÉ\u0005#ìwº\u0012";
                  var4 = " ïØáÉ\u0005#ìwº\u0012".length();
                  var1 = 5;
                  var11 = -1;
            }

            var10000 = 19;
            var10001 = var2.substring(++var11, var11 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -7423) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 2;
            case 1 -> 201;
            case 2 -> 123;
            case 3 -> 235;
            case 4 -> 197;
            case 5 -> 184;
            case 6 -> 99;
            case 7 -> 104;
            case 8 -> 165;
            case 9 -> 43;
            case 10 -> 161;
            case 11 -> 85;
            case 12 -> 195;
            case 13 -> 215;
            case 14 -> 38;
            case 15 -> 70;
            case 16 -> 53;
            case 17 -> 37;
            case 18 -> 98;
            case 19 -> 108;
            case 20 -> 11;
            case 21 -> 116;
            case 22 -> 89;
            case 23 -> 46;
            case 24 -> 113;
            case 25 -> 156;
            case 26 -> 62;
            case 27 -> 141;
            case 28 -> 52;
            case 29 -> 39;
            case 30 -> 87;
            case 31 -> 67;
            case 32 -> 231;
            case 33 -> 16;
            case 34 -> 180;
            case 35 -> 177;
            case 36 -> 176;
            case 37 -> 76;
            case 38 -> 5;
            case 39 -> 80;
            case 40 -> 20;
            case 41 -> 134;
            case 42 -> 42;
            case 43 -> 253;
            case 44 -> 236;
            case 45 -> 122;
            case 46 -> 199;
            case 47 -> 107;
            case 48 -> 234;
            case 49 -> 225;
            case 50 -> 158;
            case 51 -> 45;
            case 52 -> 94;
            case 53 -> 208;
            case 54 -> 112;
            case 55 -> 209;
            case 56 -> 188;
            case 57 -> 69;
            case 58 -> 97;
            case 59 -> 125;
            case 60 -> 144;
            case 61 -> 31;
            case 62 -> 96;
            case 63 -> 66;
            case 64 -> 0;
            case 65 -> 1;
            case 66 -> 92;
            case 67 -> 232;
            case 68 -> 220;
            case 69 -> 7;
            case 70 -> 143;
            case 71 -> 230;
            case 72 -> 174;
            case 73 -> 249;
            case 74 -> 50;
            case 75 -> 83;
            case 76 -> 167;
            case 77 -> 219;
            case 78 -> 74;
            case 79 -> 163;
            case 80 -> 166;
            case 81 -> 222;
            case 82 -> 224;
            case 83 -> 213;
            case 84 -> 60;
            case 85 -> 228;
            case 86 -> 148;
            case 87 -> 237;
            case 88 -> 90;
            case 89 -> 63;
            case 90 -> 106;
            case 91 -> 41;
            case 92 -> 51;
            case 93 -> 100;
            case 94 -> 203;
            case 95 -> 128;
            case 96 -> 95;
            case 97 -> 248;
            case 98 -> 75;
            case 99 -> 32;
            case 100 -> 18;
            case 101 -> 171;
            case 102 -> 23;
            case 103 -> 10;
            case 104 -> 187;
            case 105 -> 121;
            case 106 -> 178;
            case 107 -> 216;
            case 108 -> 227;
            case 109 -> 12;
            case 110 -> 189;
            case 111 -> 34;
            case 112 -> 153;
            case 113 -> 211;
            case 114 -> 135;
            case 115 -> 120;
            case 116 -> 3;
            case 117 -> 160;
            case 118 -> 155;
            case 119 -> 250;
            case 120 -> 169;
            case 121 -> 168;
            case 122 -> 204;
            case 123 -> 138;
            case 124 -> 149;
            case 125 -> 214;
            case 126 -> 246;
            case 127 -> 172;
            case 128 -> 71;
            case 129 -> 186;
            case 130 -> 173;
            case 131 -> 101;
            case 132 -> 57;
            case 133 -> 8;
            case 134 -> 238;
            case 135 -> 162;
            case 136 -> 117;
            case 137 -> 49;
            case 138 -> 19;
            case 139 -> 145;
            case 140 -> 131;
            case 141 -> 72;
            case 142 -> 119;
            case 143 -> 55;
            case 144 -> 47;
            case 145 -> 191;
            case 146 -> 29;
            case 147 -> 68;
            case 148 -> 36;
            case 149 -> 152;
            case 150 -> 182;
            case 151 -> 15;
            case 152 -> 27;
            case 153 -> 126;
            case 154 -> 226;
            case 155 -> 86;
            case 156 -> 21;
            case 157 -> 194;
            case 158 -> 58;
            case 159 -> 91;
            case 160 -> 140;
            case 161 -> 114;
            case 162 -> 175;
            case 163 -> 13;
            case 164 -> 81;
            case 165 -> 254;
            case 166 -> 133;
            case 167 -> 48;
            case 168 -> 9;
            case 169 -> 218;
            case 170 -> 78;
            case 171 -> 33;
            case 172 -> 247;
            case 173 -> 210;
            case 174 -> 206;
            case 175 -> 109;
            case 176 -> 14;
            case 177 -> 82;
            case 178 -> 93;
            case 179 -> 77;
            case 180 -> 54;
            case 181 -> 183;
            case 182 -> 130;
            case 183 -> 102;
            case 184 -> 56;
            case 185 -> 147;
            case 186 -> 26;
            case 187 -> 217;
            case 188 -> 207;
            case 189 -> 196;
            case 190 -> 242;
            case 191 -> 150;
            case 192 -> 255;
            case 193 -> 105;
            case 194 -> 198;
            case 195 -> 142;
            case 196 -> 241;
            case 197 -> 61;
            case 198 -> 239;
            case 199 -> 40;
            case 200 -> 151;
            case 201 -> 251;
            case 202 -> 193;
            case 203 -> 245;
            case 204 -> 132;
            case 205 -> 202;
            case 206 -> 115;
            case 207 -> 185;
            case 208 -> 111;
            case 209 -> 192;
            case 210 -> 110;
            case 211 -> 127;
            case 212 -> 24;
            case 213 -> 164;
            case 214 -> 146;
            case 215 -> 243;
            case 216 -> 35;
            case 217 -> 212;
            case 218 -> 244;
            case 219 -> 136;
            case 220 -> 137;
            case 221 -> 6;
            case 222 -> 229;
            case 223 -> 73;
            case 224 -> 200;
            case 225 -> 181;
            case 226 -> 79;
            case 227 -> 44;
            case 228 -> 157;
            case 229 -> 139;
            case 230 -> 170;
            case 231 -> 84;
            case 232 -> 223;
            case 233 -> 28;
            case 234 -> 64;
            case 235 -> 88;
            case 236 -> 240;
            case 237 -> 252;
            case 238 -> 129;
            case 239 -> 154;
            case 240 -> 233;
            case 241 -> 59;
            case 242 -> 124;
            case 243 -> 4;
            case 244 -> 30;
            case 245 -> 25;
            case 246 -> 221;
            case 247 -> 179;
            case 248 -> 159;
            case 249 -> 205;
            case 250 -> 65;
            case 251 -> 17;
            case 252 -> 22;
            case 253 -> 190;
            case 254 -> 103;
            default -> 118;
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
