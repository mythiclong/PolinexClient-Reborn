package me.octo.client;

import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.world.entity.Entity;
import org.jetbrains.annotations.NotNull;

public final class IIlIlIIIIlIllllIIllIlIllIIllIlllIIIIIllIIIllllllIllIIllIIIlIIIlllllIIIIIlIIllllllIIII {
   @NotNull
   public static IIlIlIIIIlIllllIIllIlIllIIllIlllIIIIIllIIIllllllIllIIllIIIlIIIlllllIIIIIlIIllllllIIII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static IntOpenHashSet lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static Object IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String[] a;
   private static String[] b;

   private IIlIlIIIIlIllllIIllIlIllIIllIlllIIIIIllIIIllllllIllIIllIIIlIIIlllllIIIIIlIIllllllIIII() {
   }

   // $VF: Extended synchronized range to monitorexit
   @JvmStatic
   public static final void a(@NotNull Entity var0) {
      short var10001 = -12439;
      short var10002 = -28049;
      Intrinsics.checkNotNullParameter(var0, "entity");
      Object var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      synchronized (var1) {
         boolean var2 = false;
         var2 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.add(var0.getId());
      }
   }

   // $VF: Extended synchronized range to monitorexit
   @JvmStatic
   public static final void a(int var0) {
      Object var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      synchronized (var1) {
         boolean var2 = false;
         var2 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.add(var0);
      }
   }

   // $VF: Extended synchronized range to monitorexit
   @JvmStatic
   public static final boolean b(@NotNull Entity var0) {
      short var10001 = -12440;
      short var10002 = -15749;
      Intrinsics.checkNotNullParameter(var0, "entity");
      Object var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      synchronized (var1) {
         boolean var2 = false;
         return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.contains(var0.getId());
      }
   }

   // $VF: Extended synchronized range to monitorexit
   @JvmStatic
   public static final void a() {
      Object var0 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      synchronized (var0) {
         boolean var1 = false;
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.clear();
         Unit var4 = Unit.INSTANCE;
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      short var10001 = -12438;
      short var10002 = -4147;
      Intrinsics.checkNotNullParameter(var1, "event");
      a();
   }

   @SubscribeEvent(
      priority = EventPriority.HIGHEST
   )
   public final void a(@NotNull me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var1) {
      short var10001 = -12437;
      short var10002 = -32317;
      Intrinsics.checkNotNullParameter(var1, "event");
      a();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "âX\u0082)Åy\u0006°ÊÈ{\u008c3";
      int var4 = "âX\u0082)Åy\u0006°ÊÈ{\u008c3".length();
      char var1 = 6;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 87;
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
                     case 0 -> 12;
                     case 1 -> 66;
                     case 2 -> 95;
                     case 3 -> 29;
                     case 4 -> 77;
                     case 5 -> 127;
                     default -> 84;
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
                     b = new String[4];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIlIlIIIIlIllllIIllIlIllIIllIlllIIIIIllIIIllllllIllIIllIIIlIIIlllllIIIIIlIIllllllIIII();
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new IntOpenHashSet();
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new Object();
                     llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        .a(IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
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

                  var2 = "¿\u0084LÚ[\u0005¬\u000f.«\u0017";
                  var4 = "¿\u0084LÚ[\u0005¬\u000f.«\u0017".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 101;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -12440) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 146;
            case 1 -> 24;
            case 2 -> 5;
            case 3 -> 177;
            case 4 -> 184;
            case 5 -> 151;
            case 6 -> 82;
            case 7 -> 70;
            case 8 -> 104;
            case 9 -> 206;
            case 10 -> 80;
            case 11 -> 121;
            case 12 -> 79;
            case 13 -> 192;
            case 14 -> 1;
            case 15 -> 149;
            case 16 -> 118;
            case 17 -> 212;
            case 18 -> 186;
            case 19 -> 219;
            case 20 -> 78;
            case 21 -> 205;
            case 22 -> 57;
            case 23 -> 102;
            case 24 -> 153;
            case 25 -> 125;
            case 26 -> 156;
            case 27 -> 217;
            case 28 -> 40;
            case 29 -> 187;
            case 30 -> 45;
            case 31 -> 31;
            case 32 -> 143;
            case 33 -> 216;
            case 34 -> 116;
            case 35 -> 107;
            case 36 -> 7;
            case 37 -> 15;
            case 38 -> 173;
            case 39 -> 96;
            case 40 -> 52;
            case 41 -> 169;
            case 42 -> 223;
            case 43 -> 49;
            case 44 -> 119;
            case 45 -> 42;
            case 46 -> 155;
            case 47 -> 19;
            case 48 -> 198;
            case 49 -> 224;
            case 50 -> 175;
            case 51 -> 236;
            case 52 -> 189;
            case 53 -> 232;
            case 54 -> 76;
            case 55 -> 123;
            case 56 -> 69;
            case 57 -> 126;
            case 58 -> 114;
            case 59 -> 160;
            case 60 -> 178;
            case 61 -> 182;
            case 62 -> 124;
            case 63 -> 68;
            case 64 -> 238;
            case 65 -> 90;
            case 66 -> 21;
            case 67 -> 240;
            case 68 -> 37;
            case 69 -> 210;
            case 70 -> 137;
            case 71 -> 154;
            case 72 -> 97;
            case 73 -> 47;
            case 74 -> 113;
            case 75 -> 2;
            case 76 -> 127;
            case 77 -> 64;
            case 78 -> 81;
            case 79 -> 29;
            case 80 -> 252;
            case 81 -> 235;
            case 82 -> 131;
            case 83 -> 10;
            case 84 -> 0;
            case 85 -> 174;
            case 86 -> 63;
            case 87 -> 120;
            case 88 -> 145;
            case 89 -> 66;
            case 90 -> 111;
            case 91 -> 244;
            case 92 -> 144;
            case 93 -> 72;
            case 94 -> 136;
            case 95 -> 99;
            case 96 -> 77;
            case 97 -> 134;
            case 98 -> 249;
            case 99 -> 253;
            case 100 -> 166;
            case 101 -> 100;
            case 102 -> 214;
            case 103 -> 9;
            case 104 -> 203;
            case 105 -> 171;
            case 106 -> 218;
            case 107 -> 91;
            case 108 -> 36;
            case 109 -> 20;
            case 110 -> 239;
            case 111 -> 141;
            case 112 -> 179;
            case 113 -> 248;
            case 114 -> 180;
            case 115 -> 13;
            case 116 -> 115;
            case 117 -> 30;
            case 118 -> 167;
            case 119 -> 234;
            case 120 -> 50;
            case 121 -> 246;
            case 122 -> 201;
            case 123 -> 85;
            case 124 -> 157;
            case 125 -> 211;
            case 126 -> 84;
            case 127 -> 89;
            case 128 -> 71;
            case 129 -> 172;
            case 130 -> 191;
            case 131 -> 60;
            case 132 -> 254;
            case 133 -> 103;
            case 134 -> 39;
            case 135 -> 93;
            case 136 -> 237;
            case 137 -> 140;
            case 138 -> 133;
            case 139 -> 247;
            case 140 -> 222;
            case 141 -> 59;
            case 142 -> 196;
            case 143 -> 28;
            case 144 -> 227;
            case 145 -> 251;
            case 146 -> 87;
            case 147 -> 200;
            case 148 -> 86;
            case 149 -> 132;
            case 150 -> 33;
            case 151 -> 3;
            case 152 -> 230;
            case 153 -> 62;
            case 154 -> 53;
            case 155 -> 44;
            case 156 -> 129;
            case 157 -> 112;
            case 158 -> 245;
            case 159 -> 194;
            case 160 -> 16;
            case 161 -> 213;
            case 162 -> 14;
            case 163 -> 109;
            case 164 -> 6;
            case 165 -> 22;
            case 166 -> 43;
            case 167 -> 11;
            case 168 -> 168;
            case 169 -> 46;
            case 170 -> 34;
            case 171 -> 94;
            case 172 -> 148;
            case 173 -> 139;
            case 174 -> 56;
            case 175 -> 110;
            case 176 -> 152;
            case 177 -> 185;
            case 178 -> 242;
            case 179 -> 161;
            case 180 -> 197;
            case 181 -> 142;
            case 182 -> 231;
            case 183 -> 147;
            case 184 -> 229;
            case 185 -> 159;
            case 186 -> 27;
            case 187 -> 92;
            case 188 -> 51;
            case 189 -> 117;
            case 190 -> 105;
            case 191 -> 163;
            case 192 -> 65;
            case 193 -> 73;
            case 194 -> 241;
            case 195 -> 207;
            case 196 -> 243;
            case 197 -> 35;
            case 198 -> 74;
            case 199 -> 128;
            case 200 -> 101;
            case 201 -> 135;
            case 202 -> 38;
            case 203 -> 170;
            case 204 -> 54;
            case 205 -> 220;
            case 206 -> 8;
            case 207 -> 83;
            case 208 -> 233;
            case 209 -> 181;
            case 210 -> 199;
            case 211 -> 32;
            case 212 -> 48;
            case 213 -> 75;
            case 214 -> 26;
            case 215 -> 188;
            case 216 -> 195;
            case 217 -> 193;
            case 218 -> 158;
            case 219 -> 209;
            case 220 -> 208;
            case 221 -> 250;
            case 222 -> 183;
            case 223 -> 150;
            case 224 -> 17;
            case 225 -> 58;
            case 226 -> 204;
            case 227 -> 18;
            case 228 -> 95;
            case 229 -> 88;
            case 230 -> 122;
            case 231 -> 67;
            case 232 -> 23;
            case 233 -> 226;
            case 234 -> 4;
            case 235 -> 225;
            case 236 -> 108;
            case 237 -> 25;
            case 238 -> 215;
            case 239 -> 41;
            case 240 -> 130;
            case 241 -> 55;
            case 242 -> 164;
            case 243 -> 190;
            case 244 -> 165;
            case 245 -> 176;
            case 246 -> 202;
            case 247 -> 61;
            case 248 -> 228;
            case 249 -> 221;
            case 250 -> 12;
            case 251 -> 98;
            case 252 -> 162;
            case 253 -> 138;
            case 254 -> 106;
            default -> 255;
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
