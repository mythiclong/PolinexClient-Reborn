package me.octo.client;

import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.world.entity.Entity;
import org.jetbrains.annotations.NotNull;

public final class IlIIlIlllIllIIIlIlIlIIIllllIlllIlIIIIIIlllIIIIIlIIllIIIIIIIllIIIIllIIIlllIIlIIlllIIII {
   @NotNull
   public static IlIIlIlllIllIIIlIlIlIIIllllIlllIlIIIIIIlllIIIIIlIIllIIIIIIIllIIIIllIIIlllIIlIIlllIIII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static IntOpenHashSet lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static Object IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String[] a;
   private static String[] b;

   private IlIIlIlllIllIIIlIlIlIIIllllIlllIlIIIIIIlllIIIIIlIIllIIIIIIIllIIIIllIIIlllIIlIIlllIIII() {
   }

   // $VF: Extended synchronized range to monitorexit
   @JvmStatic
   public static final void a(@NotNull Entity var0) {
      short var10001 = -16389;
      short var10002 = 10630;
      Intrinsics.checkNotNullParameter(var0, "entity");
      Object var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      synchronized (var1) {
         boolean var2 = false;
         var2 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.add(var0.getId());
      }
   }

   // $VF: Extended synchronized range to monitorexit
   @JvmStatic
   public static final void b(@NotNull Entity var0) {
      me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.g();
      short var10002 = -16392;
      short var10003 = -14650;
      Intrinsics.checkNotNullParameter(var0, "entity");
      Object var2 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      synchronized (var2) {
         boolean var3 = false;
         var3 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.remove(var0.getId());
      }

      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[2]
         );
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @JvmStatic
   public static final boolean c(@NotNull Entity var0) {
      short var10001 = -16389;
      short var10002 = 10630;
      Intrinsics.checkNotNullParameter(var0, "entity");
      Object var2 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.g();
      synchronized (var2){} // $VF: monitorenter 
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var10000;

      boolean var5;
      try {
         boolean var3 = false;
         var5 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.contains(var0.getId());
      } finally {
         // $VF: monitorexit
      }

      if (var1 != null) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[5]
         );
      }

      return var5;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @JvmStatic
   public static final boolean a() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.g();
      Object var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      synchronized (var1){} // $VF: monitorenter 
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var0 = var10000;

      int var4;
      try {
         boolean var2 = false;
         int var7 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.size();
         if (var0 == null) {
            var7 = var7 != 0 ? 1 : 0;
         }

         var4 = var7;
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
      short var10001 = -16391;
      short var10002 = -31765;
      Intrinsics.checkNotNullParameter(var1, "event");
      b();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "ô\f#cô\u0006\u008fÇ]\u0006\bK\u0006\u0015>\u000e9b¬";
      int var4 = "ô\f#cô\u0006\u008fÇ]\u0006\bK\u0006\u0015>\u000e9b¬".length();
      char var1 = 5;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 109;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 109;
               var10006 = var6;
            } else {
               var13 = 109;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 109;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 101;
                  case 1 -> 38;
                  case 2 -> 125;
                  case 3 -> 48;
                  case 4 -> 66;
                  case 5 -> 112;
                  default -> 80;
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
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IlIIlIlllIllIIIlIlIlIIIllllIlllIlIIIIIIlllIIIIIlIIllIIIIIIIllIIIIllIIIlllIIlIIlllIIII();
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new IntOpenHashSet();
            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new Object();
            llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .a(IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -16391) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 131;
            case 1 -> 179;
            case 2 -> 230;
            case 3 -> 57;
            case 4 -> 191;
            case 5 -> 19;
            case 6 -> 189;
            case 7 -> 184;
            case 8 -> 99;
            case 9 -> 103;
            case 10 -> 202;
            case 11 -> 152;
            case 12 -> 20;
            case 13 -> 15;
            case 14 -> 91;
            case 15 -> 106;
            case 16 -> 224;
            case 17 -> 215;
            case 18 -> 203;
            case 19 -> 115;
            case 20 -> 51;
            case 21 -> 153;
            case 22 -> 188;
            case 23 -> 218;
            case 24 -> 164;
            case 25 -> 102;
            case 26 -> 61;
            case 27 -> 194;
            case 28 -> 107;
            case 29 -> 14;
            case 30 -> 178;
            case 31 -> 50;
            case 32 -> 85;
            case 33 -> 117;
            case 34 -> 33;
            case 35 -> 155;
            case 36 -> 112;
            case 37 -> 242;
            case 38 -> 80;
            case 39 -> 94;
            case 40 -> 142;
            case 41 -> 120;
            case 42 -> 239;
            case 43 -> 38;
            case 44 -> 193;
            case 45 -> 181;
            case 46 -> 81;
            case 47 -> 64;
            case 48 -> 248;
            case 49 -> 162;
            case 50 -> 90;
            case 51 -> 2;
            case 52 -> 122;
            case 53 -> 237;
            case 54 -> 130;
            case 55 -> 104;
            case 56 -> 58;
            case 57 -> 6;
            case 58 -> 139;
            case 59 -> 255;
            case 60 -> 41;
            case 61 -> 138;
            case 62 -> 93;
            case 63 -> 149;
            case 64 -> 37;
            case 65 -> 183;
            case 66 -> 206;
            case 67 -> 97;
            case 68 -> 229;
            case 69 -> 0;
            case 70 -> 69;
            case 71 -> 8;
            case 72 -> 73;
            case 73 -> 9;
            case 74 -> 171;
            case 75 -> 165;
            case 76 -> 134;
            case 77 -> 101;
            case 78 -> 148;
            case 79 -> 13;
            case 80 -> 233;
            case 81 -> 98;
            case 82 -> 71;
            case 83 -> 182;
            case 84 -> 27;
            case 85 -> 3;
            case 86 -> 54;
            case 87 -> 243;
            case 88 -> 44;
            case 89 -> 175;
            case 90 -> 49;
            case 91 -> 150;
            case 92 -> 124;
            case 93 -> 144;
            case 94 -> 198;
            case 95 -> 159;
            case 96 -> 79;
            case 97 -> 208;
            case 98 -> 1;
            case 99 -> 11;
            case 100 -> 53;
            case 101 -> 23;
            case 102 -> 28;
            case 103 -> 219;
            case 104 -> 167;
            case 105 -> 67;
            case 106 -> 207;
            case 107 -> 200;
            case 108 -> 42;
            case 109 -> 161;
            case 110 -> 63;
            case 111 -> 34;
            case 112 -> 26;
            case 113 -> 111;
            case 114 -> 40;
            case 115 -> 222;
            case 116 -> 231;
            case 117 -> 75;
            case 118 -> 174;
            case 119 -> 89;
            case 120 -> 21;
            case 121 -> 170;
            case 122 -> 18;
            case 123 -> 172;
            case 124 -> 232;
            case 125 -> 95;
            case 126 -> 196;
            case 127 -> 190;
            case 128 -> 185;
            case 129 -> 251;
            case 130 -> 96;
            case 131 -> 52;
            case 132 -> 154;
            case 133 -> 132;
            case 134 -> 227;
            case 135 -> 228;
            case 136 -> 211;
            case 137 -> 244;
            case 138 -> 204;
            case 139 -> 180;
            case 140 -> 119;
            case 141 -> 46;
            case 142 -> 4;
            case 143 -> 209;
            case 144 -> 137;
            case 145 -> 83;
            case 146 -> 186;
            case 147 -> 56;
            case 148 -> 76;
            case 149 -> 74;
            case 150 -> 29;
            case 151 -> 140;
            case 152 -> 141;
            case 153 -> 110;
            case 154 -> 250;
            case 155 -> 147;
            case 156 -> 226;
            case 157 -> 30;
            case 158 -> 246;
            case 159 -> 22;
            case 160 -> 176;
            case 161 -> 213;
            case 162 -> 216;
            case 163 -> 146;
            case 164 -> 88;
            case 165 -> 127;
            case 166 -> 145;
            case 167 -> 220;
            case 168 -> 70;
            case 169 -> 45;
            case 170 -> 195;
            case 171 -> 65;
            case 172 -> 109;
            case 173 -> 143;
            case 174 -> 105;
            case 175 -> 245;
            case 176 -> 62;
            case 177 -> 151;
            case 178 -> 128;
            case 179 -> 187;
            case 180 -> 66;
            case 181 -> 160;
            case 182 -> 87;
            case 183 -> 77;
            case 184 -> 217;
            case 185 -> 253;
            case 186 -> 223;
            case 187 -> 92;
            case 188 -> 113;
            case 189 -> 55;
            case 190 -> 47;
            case 191 -> 125;
            case 192 -> 60;
            case 193 -> 247;
            case 194 -> 133;
            case 195 -> 240;
            case 196 -> 168;
            case 197 -> 48;
            case 198 -> 7;
            case 199 -> 254;
            case 200 -> 17;
            case 201 -> 158;
            case 202 -> 163;
            case 203 -> 114;
            case 204 -> 86;
            case 205 -> 12;
            case 206 -> 234;
            case 207 -> 249;
            case 208 -> 25;
            case 209 -> 78;
            case 210 -> 43;
            case 211 -> 173;
            case 212 -> 126;
            case 213 -> 135;
            case 214 -> 169;
            case 215 -> 201;
            case 216 -> 199;
            case 217 -> 123;
            case 218 -> 100;
            case 219 -> 241;
            case 220 -> 177;
            case 221 -> 72;
            case 222 -> 238;
            case 223 -> 205;
            case 224 -> 31;
            case 225 -> 39;
            case 226 -> 10;
            case 227 -> 136;
            case 228 -> 16;
            case 229 -> 221;
            case 230 -> 84;
            case 231 -> 121;
            case 232 -> 214;
            case 233 -> 210;
            case 234 -> 192;
            case 235 -> 5;
            case 236 -> 236;
            case 237 -> 116;
            case 238 -> 235;
            case 239 -> 36;
            case 240 -> 59;
            case 241 -> 32;
            case 242 -> 212;
            case 243 -> 35;
            case 244 -> 118;
            case 245 -> 166;
            case 246 -> 24;
            case 247 -> 252;
            case 248 -> 129;
            case 249 -> 157;
            case 250 -> 156;
            case 251 -> 108;
            case 252 -> 82;
            case 253 -> 68;
            case 254 -> 225;
            default -> 197;
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
