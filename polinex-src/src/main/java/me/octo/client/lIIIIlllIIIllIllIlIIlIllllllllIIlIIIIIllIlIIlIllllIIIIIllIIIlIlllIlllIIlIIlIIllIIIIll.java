package me.octo.client;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class lIIIIlllIIIllIllIlIIlIllllllllIIlIIIIIllIlIIlIllllIIIIIllIIIlIlllIlllIIlIIlIIllIIIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public lIIIIlllIIIllIllIlIIlIllllllllIIlIIIIIllIlIIlIllllIIIIIllIIIlIlllIlllIIlIIlIIllIIIIll(Object... px) {
           this((Map<String, String>)null, (Set<String>)null); // PX-FIX: 委托主构造器（final 字段初始化）
        }

   @NotNull
   private final Map<String, String> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final Set<String> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] a;
   private static String[] b;

   public lIIIIlllIIIllIllIlIIlIllllllllIIlIIIIIllIlIIlIllllIIIIIllIIIlIlllIlllIIlIIlIIllIIIIll(@NotNull Map<String, String> var1, @NotNull Set<String> var2) {
      short var10001 = -32340;
      short var10002 = -3913;
      Intrinsics.checkNotNullParameter(var1, "slots");
      var10001 = -32344;
      var10002 = -15723;
      Intrinsics.checkNotNullParameter(var2, "disabled");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
   }

   public lIIIIlllIIIllIllIlIIlIllllllllIIlIIIIIllIlIIlIllllIIIIIllIIIlIlllIlllIIlIIlIIllIIIIll(@NotNull Map<String, String> var1, @NotNull Set<String> var2, int var3, kotlin.jvm.internal.DefaultConstructorMarker var4) {
      if ((var3 & 1) != 0) {
         var1 = new java.util.HashMap<String, String>();
      }

      if ((var3 & 2) != 0) {
         var2 = new java.util.HashSet<String>();
      }

      this(var1, var2);
   }

   public static lIIIIlllIIIllIllIlIIlIllllllllIIlIIIIIllIlIIlIllllIIIIIllIIIlIlllIlllIIlIIlIIllIIIIll a(lIIIIlllIIIllIllIlIIlIllllllllIIlIIIIIllIlIIlIllllIIIIIllIIIlIlllIlllIIlIIlIIllIIIIll var0, @NotNull Map<String, String> var1, @NotNull Set<String> var2, int var3, Object var4) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var5 = IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.s();
      if ((var3 & 1) != 0) {
         var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      if ((var3 & 2) != 0) {
         var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      return var0.a(var1, var2);
   }

   @NotNull
   public final Map<String, String> a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public final Set<String> b() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final Map<String, String> c() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public final Set<String> d() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final lIIIIlllIIIllIllIlIIlIllllllllIIlIIIIIllIlIIlIllllIIIIIllIIIlIlllIlllIIlIIlIIllIIIIll a(
      @NotNull Map<String, String> var1, @NotNull Set<String> var2
   ) {
      short var10001 = -32339;
      short var10002 = -12427;
      Intrinsics.checkNotNullParameter(var1, "slots");
      var10001 = -32343;
      var10002 = -21648;
      Intrinsics.checkNotNullParameter(var2, "disabled");
      return new lIIIIlllIIIllIllIlIIlIllllllllIIlIIIIIllIlIIlIllllIIIIIllIIIlIlllIlllIIlIIlIIllIIIIll(var1, var2);
   }

   @NotNull
   @Override
   public String toString() {
      short var10002 = -32337;
      short var10003 = -24014;
      var10003 = -32338;
      short var10004 = -5910;
      return "AutoForgeSelectionData(slots="
         + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         + ", disabled="
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
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.s();
      Object var10000 = this;
      if (var2 == null) {
         if (this == var1) {
            return true;
         }

         var10000 = var1;
      }

      if (var2 == null) {
         if (!(var10000 instanceof lIIIIlllIIIllIllIlIIlIllllllllIIlIIIIIllIlIIlIllllIIIIIllIIIlIlllIlllIIlIIlIIllIIIIll)) {
            return false;
         }

         var10000 = var1;
      }

      lIIIIlllIIIllIllIlIIlIllllllllIIlIIIIIllIlIIlIllllIIIIIllIIIlIlllIlllIIlIIlIIllIIIIll var3 = (lIIIIlllIIIllIllIlIIlIllllllllIIlIIIIIllIlIIlIllllIIIIIllIIIlIlllIlllIIlIIlIIllIIIIll)var10000;
      boolean var4 = Intrinsics.areEqual(
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
      );
      if (var2 == null) {
         if (!var4) {
            return false;
         }

         var4 = Intrinsics.areEqual(
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         );
      }

      if (var2 == null) {
         if (!var4) {
            return false;
         }

         var4 = true;
      }

      return var4;
   }

   public lIIIIlllIIIllIllIlIIlIllllllllIIlIIIIIllIlIIlIllllIIIIIllIIIlIlllIlllIIlIIlIIllIIIIll() {
      this(null, null, 3, null);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "e×\u0089B\u008f\u0005Ã\u000e]y\u0015\u001dÅJòÐ\u00adÙ\u0095z\u008bÀð\u0002\u009c\u001e\u008aÅ\u0093¿û\u001b\u001bëÑ\u0014V¿qÚM\u000bÞÛA\u001büh<\u0088¬ÃL";
      int var4 = "e×\u0089B\u008f\u0005Ã\u000e]y\u0015\u001dÅJòÐ\u00adÙ\u0095z\u008bÀð\u0002\u009c\u001e\u008aÅ\u0093¿û\u001b\u001bëÑ\u0014V¿qÚM\u000bÞÛA\u001büh<\u0088¬ÃL"
         .length();
      char var1 = 5;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 9;
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
                     case 0 -> 105;
                     case 1 -> 98;
                     case 2 -> 82;
                     case 3 -> 73;
                     case 4 -> 45;
                     case 5 -> 47;
                     default -> 81;
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

                  var2 = "\u0095Öó_Ãib\u0081\b\u0012I\u0003¬Ý\u0017¡N";
                  var4 = "\u0095Öó_Ãib\u0081\b\u0012I\u0003¬Ý\u0017¡N".length();
                  var1 = '\b';
                  var8 = -1;
            }

            var10000 = 5;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -32339) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 194;
            case 1 -> 110;
            case 2 -> 192;
            case 3 -> 74;
            case 4 -> 118;
            case 5 -> 255;
            case 6 -> 63;
            case 7 -> 94;
            case 8 -> 29;
            case 9 -> 220;
            case 10 -> 41;
            case 11 -> 89;
            case 12 -> 204;
            case 13 -> 167;
            case 14 -> 51;
            case 15 -> 126;
            case 16 -> 230;
            case 17 -> 249;
            case 18 -> 115;
            case 19 -> 114;
            case 20 -> 185;
            case 21 -> 37;
            case 22 -> 203;
            case 23 -> 200;
            case 24 -> 19;
            case 25 -> 56;
            case 26 -> 141;
            case 27 -> 31;
            case 28 -> 12;
            case 29 -> 108;
            case 30 -> 15;
            case 31 -> 59;
            case 32 -> 234;
            case 33 -> 14;
            case 34 -> 70;
            case 35 -> 36;
            case 36 -> 145;
            case 37 -> 135;
            case 38 -> 109;
            case 39 -> 195;
            case 40 -> 166;
            case 41 -> 242;
            case 42 -> 229;
            case 43 -> 54;
            case 44 -> 116;
            case 45 -> 150;
            case 46 -> 222;
            case 47 -> 179;
            case 48 -> 5;
            case 49 -> 28;
            case 50 -> 7;
            case 51 -> 39;
            case 52 -> 90;
            case 53 -> 133;
            case 54 -> 239;
            case 55 -> 134;
            case 56 -> 8;
            case 57 -> 144;
            case 58 -> 147;
            case 59 -> 3;
            case 60 -> 75;
            case 61 -> 228;
            case 62 -> 184;
            case 63 -> 68;
            case 64 -> 65;
            case 65 -> 168;
            case 66 -> 57;
            case 67 -> 240;
            case 68 -> 251;
            case 69 -> 214;
            case 70 -> 182;
            case 71 -> 152;
            case 72 -> 46;
            case 73 -> 47;
            case 74 -> 125;
            case 75 -> 73;
            case 76 -> 40;
            case 77 -> 16;
            case 78 -> 155;
            case 79 -> 121;
            case 80 -> 162;
            case 81 -> 52;
            case 82 -> 176;
            case 83 -> 187;
            case 84 -> 154;
            case 85 -> 245;
            case 86 -> 175;
            case 87 -> 102;
            case 88 -> 48;
            case 89 -> 190;
            case 90 -> 43;
            case 91 -> 243;
            case 92 -> 53;
            case 93 -> 212;
            case 94 -> 62;
            case 95 -> 67;
            case 96 -> 143;
            case 97 -> 198;
            case 98 -> 165;
            case 99 -> 156;
            case 100 -> 183;
            case 101 -> 45;
            case 102 -> 93;
            case 103 -> 104;
            case 104 -> 137;
            case 105 -> 189;
            case 106 -> 6;
            case 107 -> 169;
            case 108 -> 98;
            case 109 -> 99;
            case 110 -> 34;
            case 111 -> 11;
            case 112 -> 112;
            case 113 -> 140;
            case 114 -> 201;
            case 115 -> 120;
            case 116 -> 237;
            case 117 -> 4;
            case 118 -> 241;
            case 119 -> 113;
            case 120 -> 244;
            case 121 -> 174;
            case 122 -> 253;
            case 123 -> 81;
            case 124 -> 69;
            case 125 -> 248;
            case 126 -> 123;
            case 127 -> 139;
            case 128 -> 35;
            case 129 -> 26;
            case 130 -> 83;
            case 131 -> 205;
            case 132 -> 232;
            case 133 -> 136;
            case 134 -> 129;
            case 135 -> 163;
            case 136 -> 153;
            case 137 -> 207;
            case 138 -> 131;
            case 139 -> 217;
            case 140 -> 38;
            case 141 -> 86;
            case 142 -> 250;
            case 143 -> 20;
            case 144 -> 210;
            case 145 -> 227;
            case 146 -> 82;
            case 147 -> 60;
            case 148 -> 76;
            case 149 -> 180;
            case 150 -> 33;
            case 151 -> 177;
            case 152 -> 107;
            case 153 -> 224;
            case 154 -> 18;
            case 155 -> 221;
            case 156 -> 196;
            case 157 -> 193;
            case 158 -> 87;
            case 159 -> 199;
            case 160 -> 171;
            case 161 -> 235;
            case 162 -> 85;
            case 163 -> 231;
            case 164 -> 226;
            case 165 -> 78;
            case 166 -> 132;
            case 167 -> 159;
            case 168 -> 1;
            case 169 -> 72;
            case 170 -> 111;
            case 171 -> 219;
            case 172 -> 58;
            case 173 -> 160;
            case 174 -> 149;
            case 175 -> 172;
            case 176 -> 164;
            case 177 -> 223;
            case 178 -> 80;
            case 179 -> 151;
            case 180 -> 252;
            case 181 -> 142;
            case 182 -> 236;
            case 183 -> 77;
            case 184 -> 161;
            case 185 -> 188;
            case 186 -> 247;
            case 187 -> 91;
            case 188 -> 197;
            case 189 -> 216;
            case 190 -> 88;
            case 191 -> 208;
            case 192 -> 0;
            case 193 -> 101;
            case 194 -> 213;
            case 195 -> 148;
            case 196 -> 202;
            case 197 -> 95;
            case 198 -> 100;
            case 199 -> 103;
            case 200 -> 146;
            case 201 -> 42;
            case 202 -> 2;
            case 203 -> 24;
            case 204 -> 22;
            case 205 -> 124;
            case 206 -> 96;
            case 207 -> 130;
            case 208 -> 186;
            case 209 -> 30;
            case 210 -> 106;
            case 211 -> 105;
            case 212 -> 128;
            case 213 -> 49;
            case 214 -> 50;
            case 215 -> 254;
            case 216 -> 178;
            case 217 -> 173;
            case 218 -> 181;
            case 219 -> 233;
            case 220 -> 122;
            case 221 -> 218;
            case 222 -> 209;
            case 223 -> 191;
            case 224 -> 138;
            case 225 -> 215;
            case 226 -> 32;
            case 227 -> 206;
            case 228 -> 158;
            case 229 -> 64;
            case 230 -> 170;
            case 231 -> 238;
            case 232 -> 66;
            case 233 -> 157;
            case 234 -> 61;
            case 235 -> 84;
            case 236 -> 79;
            case 237 -> 17;
            case 238 -> 10;
            case 239 -> 55;
            case 240 -> 127;
            case 241 -> 97;
            case 242 -> 44;
            case 243 -> 25;
            case 244 -> 9;
            case 245 -> 92;
            case 246 -> 23;
            case 247 -> 119;
            case 248 -> 27;
            case 249 -> 211;
            case 250 -> 13;
            case 251 -> 246;
            case 252 -> 21;
            case 253 -> 71;
            case 254 -> 117;
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

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }
}
