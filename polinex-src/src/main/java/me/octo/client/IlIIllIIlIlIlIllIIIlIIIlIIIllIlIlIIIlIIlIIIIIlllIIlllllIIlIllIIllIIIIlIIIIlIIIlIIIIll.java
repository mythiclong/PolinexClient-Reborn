package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll {
   @NotNull
   private final BlockPos IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final BlockState lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] a;
   private static String[] b;

   public IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll(@NotNull BlockPos var1, @NotNull BlockState var2) {
      short var10001 = 15994;
      short var10002 = -21567;
      Intrinsics.checkNotNullParameter(var1, "pos");
      var10001 = 15997;
      var10002 = -12953;
      Intrinsics.checkNotNullParameter(var2, "state");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
   }

   @NotNull
   public final BlockPos a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public final BlockState b() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final BlockPos c() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public final BlockState d() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll a(@NotNull BlockPos var1, @NotNull BlockState var2) {
      short var10001 = 15999;
      short var10002 = -22727;
      Intrinsics.checkNotNullParameter(var1, "pos");
      var10001 = 15996;
      var10002 = -17042;
      Intrinsics.checkNotNullParameter(var2, "state");
      return new IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll(var1, var2);
   }

   @NotNull
   @Override
   public String toString() {
      short var10002 = 15998;
      short var10003 = 5165;
      var10003 = 15995;
      short var10004 = 18642;
      return "Berry(pos="
         + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         + ", state="
         + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         + ")";
   }

   @Override
   public int hashCode() {
      int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
      return var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      String var2 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      Object var10000 = this;
      if (var2 != null) {
         if (this == var1) {
            return true;
         }

         var10000 = var1;
      }

      if (var2 != null) {
         if (!(var10000 instanceof IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll)) {
            return false;
         }

         var10000 = var1;
      }

      IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll var3 = (IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll)var10000;
      boolean var4 = Intrinsics.areEqual(
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
      );
      if (var2 != null) {
         if (!var4) {
            return false;
         }

         var4 = Intrinsics.areEqual(
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         );
      }

      if (var2 != null) {
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
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "\u00ad\u009dBs±úæ\u0091\u0014\u0002\u0003Ä[\u001a\u0005\u001cdpy\u009a\u0005ÜOh\u001c\u0099";
      int var4 = "\u00ad\u009dBs±úæ\u0091\u0014\u0002\u0003Ä[\u001a\u0005\u001cdpy\u009a\u0005ÜOh\u001c\u0099".length();
      char var1 = '\n';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 77;
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
                     case 1 -> 39;
                     case 2 -> 74;
                     case 3 -> 123;
                     case 4 -> 17;
                     case 5 -> 11;
                     default -> 48;
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

                  var2 = "\u0092Éh\b&\u0092)Á]\u008eÍ\"";
                  var4 = "\u0092Éh\b&\u0092)Á]\u008eÍ\"".length();
                  var1 = 3;
                  var8 = -1;
            }

            var10000 = 59;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 15998) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 106;
            case 1 -> 242;
            case 2 -> 201;
            case 3 -> 12;
            case 4 -> 159;
            case 5 -> 9;
            case 6 -> 120;
            case 7 -> 49;
            case 8 -> 11;
            case 9 -> 56;
            case 10 -> 206;
            case 11 -> 18;
            case 12 -> 165;
            case 13 -> 97;
            case 14 -> 225;
            case 15 -> 174;
            case 16 -> 192;
            case 17 -> 180;
            case 18 -> 69;
            case 19 -> 227;
            case 20 -> 154;
            case 21 -> 166;
            case 22 -> 102;
            case 23 -> 103;
            case 24 -> 234;
            case 25 -> 38;
            case 26 -> 146;
            case 27 -> 7;
            case 28 -> 61;
            case 29 -> 173;
            case 30 -> 91;
            case 31 -> 176;
            case 32 -> 134;
            case 33 -> 119;
            case 34 -> 83;
            case 35 -> 186;
            case 36 -> 207;
            case 37 -> 25;
            case 38 -> 92;
            case 39 -> 254;
            case 40 -> 107;
            case 41 -> 132;
            case 42 -> 129;
            case 43 -> 34;
            case 44 -> 43;
            case 45 -> 211;
            case 46 -> 112;
            case 47 -> 40;
            case 48 -> 36;
            case 49 -> 248;
            case 50 -> 96;
            case 51 -> 122;
            case 52 -> 160;
            case 53 -> 55;
            case 54 -> 133;
            case 55 -> 10;
            case 56 -> 245;
            case 57 -> 128;
            case 58 -> 214;
            case 59 -> 220;
            case 60 -> 48;
            case 61 -> 178;
            case 62 -> 2;
            case 63 -> 72;
            case 64 -> 81;
            case 65 -> 21;
            case 66 -> 95;
            case 67 -> 167;
            case 68 -> 218;
            case 69 -> 191;
            case 70 -> 177;
            case 71 -> 142;
            case 72 -> 204;
            case 73 -> 28;
            case 74 -> 8;
            case 75 -> 90;
            case 76 -> 194;
            case 77 -> 47;
            case 78 -> 210;
            case 79 -> 46;
            case 80 -> 217;
            case 81 -> 223;
            case 82 -> 236;
            case 83 -> 22;
            case 84 -> 138;
            case 85 -> 24;
            case 86 -> 231;
            case 87 -> 58;
            case 88 -> 67;
            case 89 -> 108;
            case 90 -> 109;
            case 91 -> 84;
            case 92 -> 157;
            case 93 -> 183;
            case 94 -> 163;
            case 95 -> 27;
            case 96 -> 235;
            case 97 -> 226;
            case 98 -> 150;
            case 99 -> 203;
            case 100 -> 99;
            case 101 -> 247;
            case 102 -> 64;
            case 103 -> 85;
            case 104 -> 74;
            case 105 -> 171;
            case 106 -> 222;
            case 107 -> 149;
            case 108 -> 105;
            case 109 -> 80;
            case 110 -> 188;
            case 111 -> 68;
            case 112 -> 52;
            case 113 -> 249;
            case 114 -> 98;
            case 115 -> 30;
            case 116 -> 26;
            case 117 -> 140;
            case 118 -> 172;
            case 119 -> 243;
            case 120 -> 139;
            case 121 -> 182;
            case 122 -> 151;
            case 123 -> 200;
            case 124 -> 228;
            case 125 -> 15;
            case 126 -> 89;
            case 127 -> 233;
            case 128 -> 73;
            case 129 -> 101;
            case 130 -> 117;
            case 131 -> 209;
            case 132 -> 175;
            case 133 -> 62;
            case 134 -> 148;
            case 135 -> 199;
            case 136 -> 240;
            case 137 -> 137;
            case 138 -> 168;
            case 139 -> 114;
            case 140 -> 13;
            case 141 -> 94;
            case 142 -> 111;
            case 143 -> 224;
            case 144 -> 116;
            case 145 -> 152;
            case 146 -> 35;
            case 147 -> 82;
            case 148 -> 75;
            case 149 -> 187;
            case 150 -> 161;
            case 151 -> 51;
            case 152 -> 124;
            case 153 -> 71;
            case 154 -> 110;
            case 155 -> 53;
            case 156 -> 54;
            case 157 -> 57;
            case 158 -> 250;
            case 159 -> 42;
            case 160 -> 241;
            case 161 -> 141;
            case 162 -> 184;
            case 163 -> 212;
            case 164 -> 156;
            case 165 -> 60;
            case 166 -> 202;
            case 167 -> 115;
            case 168 -> 147;
            case 169 -> 65;
            case 170 -> 189;
            case 171 -> 121;
            case 172 -> 104;
            case 173 -> 100;
            case 174 -> 193;
            case 175 -> 0;
            case 176 -> 63;
            case 177 -> 32;
            case 178 -> 113;
            case 179 -> 123;
            case 180 -> 197;
            case 181 -> 79;
            case 182 -> 169;
            case 183 -> 253;
            case 184 -> 239;
            case 185 -> 86;
            case 186 -> 216;
            case 187 -> 144;
            case 188 -> 229;
            case 189 -> 41;
            case 190 -> 198;
            case 191 -> 126;
            case 192 -> 205;
            case 193 -> 155;
            case 194 -> 238;
            case 195 -> 232;
            case 196 -> 127;
            case 197 -> 70;
            case 198 -> 45;
            case 199 -> 44;
            case 200 -> 143;
            case 201 -> 88;
            case 202 -> 1;
            case 203 -> 213;
            case 204 -> 145;
            case 205 -> 20;
            case 206 -> 131;
            case 207 -> 3;
            case 208 -> 237;
            case 209 -> 219;
            case 210 -> 221;
            case 211 -> 14;
            case 212 -> 77;
            case 213 -> 162;
            case 214 -> 135;
            case 215 -> 37;
            case 216 -> 33;
            case 217 -> 230;
            case 218 -> 246;
            case 219 -> 4;
            case 220 -> 185;
            case 221 -> 5;
            case 222 -> 164;
            case 223 -> 19;
            case 224 -> 244;
            case 225 -> 31;
            case 226 -> 17;
            case 227 -> 208;
            case 228 -> 16;
            case 229 -> 170;
            case 230 -> 87;
            case 231 -> 136;
            case 232 -> 181;
            case 233 -> 130;
            case 234 -> 23;
            case 235 -> 118;
            case 236 -> 93;
            case 237 -> 125;
            case 238 -> 78;
            case 239 -> 195;
            case 240 -> 179;
            case 241 -> 29;
            case 242 -> 153;
            case 243 -> 76;
            case 244 -> 66;
            case 245 -> 158;
            case 246 -> 252;
            case 247 -> 190;
            case 248 -> 196;
            case 249 -> 255;
            case 250 -> 251;
            case 251 -> 50;
            case 252 -> 39;
            case 253 -> 215;
            case 254 -> 59;
            default -> 6;
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

  // PX-FIX synth restored from jar bytecode
  // PX-FIX synth restored from jar bytecode: Kotlin default-argument bridge
  public me.octo.client.IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll a(me.octo.client.IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll p0, net.minecraft.core.BlockPos p1, net.minecraft.world.level.block.state.BlockState p2, int p3, java.lang.Object p4) {
     String var5 = me.octo.client.IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
     if ((p3 & 1) != 0) {
       p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
     }
     if ((p3 & 2) != 0) {
       p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
     }
     return p0.a(p1, p2);
  }
}
