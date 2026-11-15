package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlin.jvm.JvmStatic;

@Serializable
public final class lIlIlllIIIlllIIIllllIIlIIIllIlllllIIllIIlIIIlllIlIIIllIIIllIllllIllIIIIIIIllIlIIlIIIl {

   @NotNull
   public static lIlIlllIIIlllIIIllllIIlIIIllIlllllIIllIIlIIIlllIlIIIllIIIllIllllIllIIIIIIIllIlIIlIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private final boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final lllIlIIlIllIIIIIlIIlIlIIIIIlIIlIIIlllllIIllIlIlIIIllIIlIIlIlIlIlIlllIIIIllIlIlIIlIIII IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @Nullable
   private final String lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static String[] a;
   private static String[] b;

   public lIlIlllIIIlllIIIllllIIlIIIllIlllllIIllIIlIIIlllIlIIIllIIIllIllllIllIIIIIIIllIlIIlIIIl(
      boolean var1, @NotNull lllIlIIlIllIIIIIlIIlIlIIIIIlIIlIIIlllllIIllIlIlIIIllIIlIIlIlIlIlIlllIIIIllIlIlIIlIIII var2, @Nullable String var3
   ) {
      short var10001 = 17866;
      short var10002 = 28923;
      Intrinsics.checkNotNullParameter(var2, "data");
      super();
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var2;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var3;
   }

   public final boolean a() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final lllIlIIlIllIIIIIlIIlIlIIIIIlIIlIIIlllllIIllIlIlIIIllIIlIIlIlIlIlIlllIIIIllIlIlIIlIIII c() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @Nullable
   public final String e() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   public final boolean g() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final lllIlIIlIllIIIIIlIIlIlIIIIIlIIlIIIlllllIIllIlIlIIIllIIlIIlIlIlIlIlllIIIIllIlIlIIlIIII h() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @Nullable
   public final String i() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @NotNull
   public final lIlIlllIIIlllIIIllllIIlIIIllIlllllIIllIIlIIIlllIlIIIllIIIllIllllIllIIIIIIIllIlIIlIIIl a(
      boolean var1, @NotNull lllIlIIlIllIIIIIlIIlIlIIIIIlIIlIIIlllllIIllIlIlIIIllIIlIIlIlIlIlIlllIIIIllIlIlIIlIIII var2, @Nullable String var3
   ) {
      short var10001 = 17864;
      short var10002 = -6979;
      Intrinsics.checkNotNullParameter(var2, "data");
      return new lIlIlllIIIlllIIIllllIIlIIIllIlllllIIllIIlIIIlllIlIIIllIIIllIllllIllIIIIIIIllIlIIlIIIl(var1, var2, var3);
   }

   @NotNull
   @Override
   public String toString() {
      short var10000 = 17867;
      String var1 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      lllIlIIlIllIIIIIlIIlIlIIIIIlIIlIIIlllllIIllIlIlIIIllIIlIIlIlIlIlIlllIIIIllIlIlIIlIIII var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      boolean var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      short var10001 = 7862;
      short var10002 = 17865;
      short var10003 = -12091;
      short var10004 = 17870;
      short var10005 = 10319;
      return "MuseumRoot(ok=" + var3 + ", data=" + var2 + ", hash=" + var1 + ")";
   }

   @Override
   public int hashCode() {
      int var2 = Boolean.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      String var10000 = lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll.g();
      var2 = var2 * 31 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.hashCode();
      String var1 = var10000;
      int var4 = var2 * 31;
      String var10001 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      if (var1 != null) {
         if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI == null) {
            return var4 + 0;
         }

         var10001 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      return var4 + var10001.hashCode();
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      String var2 = lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll.g();
      Object var10000 = this;
      if (var2 != null) {
         if (this == var1) {
            return true;
         }

         var10000 = var1;
      }

      if (var2 != null) {
         if (!(var10000 instanceof lIlIlllIIIlllIIIllllIIlIIIllIlllllIIllIIlIIIlllIlIIIllIIIllIllllIllIIIIIIIllIlIIlIIIl)) {
            return false;
         }

         var10000 = var1;
      }

      lIlIlllIIIlllIIIllllIIlIIIllIlllllIIllIIlIIIlllIlIIIllIIIllIllllIllIIIIIIIllIlIIlIIIl var3 = (lIlIlllIIIlllIIIllllIIlIIIllIlllllIIllIIlIIIlllIlIIIllIIIllIllllIllIIIIIIIllIlIIlIIIl)var10000;
      boolean var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      if (var2 != null) {
         if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            != var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
            return false;
         }

         var4 = Intrinsics.areEqual(
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
            var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         );
      }

      if (var2 != null) {
         if (!var4) {
            return false;
         }

         var4 = Intrinsics.areEqual(
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
            var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
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
      String[] var5 = new String[5];
      int var3 = 0;
      String var2 = "¬\u001eÄn\u000e>Ö\u009dåN#T\u0005Z\u009b`sqÅ\u0004.J\u0094ä";
      int var4 = "¬\u001eÄn\u000e>Ö\u009dåN#T\u0005Z\u009b`sqÅ\u0004.J\u0094ä".length();
      char var1 = 4;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 112;
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
                     case 0 -> 125;
                     case 1 -> 53;
                     case 2 -> 28;
                     case 3 -> 89;
                     case 4 -> 104;
                     case 5 -> 110;
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
                     b = new String[5];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIlIlllIIIlllIIIllllIIlIIIllIlllllIIllIIlIIIlllIlIIIllIIIllIllllIllIIIIIIIllIlIIlIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
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

                  var2 = "Èû\u00ad\u000f\bBf\u0007vÛv\u000bùË¿";
                  var4 = "Èû\u00ad\u000f\bBf\u0007vÛv\u000bùË¿".length();
                  var1 = 7;
                  var8 = -1;
            }

            var10000 = 47;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 17866) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 238;
            case 1 -> 156;
            case 2 -> 218;
            case 3 -> 227;
            case 4 -> 55;
            case 5 -> 107;
            case 6 -> 21;
            case 7 -> 205;
            case 8 -> 4;
            case 9 -> 48;
            case 10 -> 187;
            case 11 -> 222;
            case 12 -> 165;
            case 13 -> 66;
            case 14 -> 242;
            case 15 -> 175;
            case 16 -> 10;
            case 17 -> 93;
            case 18 -> 215;
            case 19 -> 201;
            case 20 -> 85;
            case 21 -> 6;
            case 22 -> 141;
            case 23 -> 144;
            case 24 -> 142;
            case 25 -> 75;
            case 26 -> 163;
            case 27 -> 249;
            case 28 -> 49;
            case 29 -> 102;
            case 30 -> 204;
            case 31 -> 124;
            case 32 -> 79;
            case 33 -> 52;
            case 34 -> 154;
            case 35 -> 118;
            case 36 -> 71;
            case 37 -> 179;
            case 38 -> 237;
            case 39 -> 162;
            case 40 -> 136;
            case 41 -> 241;
            case 42 -> 64;
            case 43 -> 176;
            case 44 -> 3;
            case 45 -> 34;
            case 46 -> 27;
            case 47 -> 181;
            case 48 -> 195;
            case 49 -> 221;
            case 50 -> 88;
            case 51 -> 56;
            case 52 -> 217;
            case 53 -> 104;
            case 54 -> 44;
            case 55 -> 170;
            case 56 -> 80;
            case 57 -> 113;
            case 58 -> 245;
            case 59 -> 228;
            case 60 -> 65;
            case 61 -> 120;
            case 62 -> 38;
            case 63 -> 20;
            case 64 -> 59;
            case 65 -> 247;
            case 66 -> 117;
            case 67 -> 77;
            case 68 -> 103;
            case 69 -> 40;
            case 70 -> 224;
            case 71 -> 244;
            case 72 -> 28;
            case 73 -> 1;
            case 74 -> 209;
            case 75 -> 83;
            case 76 -> 174;
            case 77 -> 161;
            case 78 -> 57;
            case 79 -> 207;
            case 80 -> 76;
            case 81 -> 239;
            case 82 -> 112;
            case 83 -> 158;
            case 84 -> 134;
            case 85 -> 73;
            case 86 -> 194;
            case 87 -> 68;
            case 88 -> 235;
            case 89 -> 25;
            case 90 -> 96;
            case 91 -> 225;
            case 92 -> 188;
            case 93 -> 46;
            case 94 -> 70;
            case 95 -> 243;
            case 96 -> 35;
            case 97 -> 62;
            case 98 -> 152;
            case 99 -> 72;
            case 100 -> 198;
            case 101 -> 168;
            case 102 -> 61;
            case 103 -> 184;
            case 104 -> 23;
            case 105 -> 189;
            case 106 -> 143;
            case 107 -> 173;
            case 108 -> 51;
            case 109 -> 252;
            case 110 -> 53;
            case 111 -> 90;
            case 112 -> 146;
            case 113 -> 148;
            case 114 -> 135;
            case 115 -> 82;
            case 116 -> 236;
            case 117 -> 133;
            case 118 -> 42;
            case 119 -> 248;
            case 120 -> 108;
            case 121 -> 97;
            case 122 -> 169;
            case 123 -> 58;
            case 124 -> 149;
            case 125 -> 67;
            case 126 -> 126;
            case 127 -> 33;
            case 128 -> 159;
            case 129 -> 254;
            case 130 -> 203;
            case 131 -> 119;
            case 132 -> 164;
            case 133 -> 145;
            case 134 -> 129;
            case 135 -> 19;
            case 136 -> 110;
            case 137 -> 197;
            case 138 -> 151;
            case 139 -> 180;
            case 140 -> 177;
            case 141 -> 128;
            case 142 -> 99;
            case 143 -> 22;
            case 144 -> 255;
            case 145 -> 240;
            case 146 -> 190;
            case 147 -> 186;
            case 148 -> 50;
            case 149 -> 106;
            case 150 -> 153;
            case 151 -> 226;
            case 152 -> 219;
            case 153 -> 138;
            case 154 -> 15;
            case 155 -> 167;
            case 156 -> 199;
            case 157 -> 89;
            case 158 -> 109;
            case 159 -> 140;
            case 160 -> 14;
            case 161 -> 54;
            case 162 -> 30;
            case 163 -> 150;
            case 164 -> 16;
            case 165 -> 200;
            case 166 -> 132;
            case 167 -> 9;
            case 168 -> 18;
            case 169 -> 155;
            case 170 -> 251;
            case 171 -> 87;
            case 172 -> 7;
            case 173 -> 147;
            case 174 -> 172;
            case 175 -> 37;
            case 176 -> 171;
            case 177 -> 26;
            case 178 -> 183;
            case 179 -> 210;
            case 180 -> 115;
            case 181 -> 196;
            case 182 -> 121;
            case 183 -> 84;
            case 184 -> 78;
            case 185 -> 130;
            case 186 -> 101;
            case 187 -> 214;
            case 188 -> 92;
            case 189 -> 116;
            case 190 -> 45;
            case 191 -> 122;
            case 192 -> 166;
            case 193 -> 43;
            case 194 -> 91;
            case 195 -> 213;
            case 196 -> 223;
            case 197 -> 47;
            case 198 -> 13;
            case 199 -> 192;
            case 200 -> 31;
            case 201 -> 230;
            case 202 -> 2;
            case 203 -> 100;
            case 204 -> 32;
            case 205 -> 0;
            case 206 -> 41;
            case 207 -> 178;
            case 208 -> 114;
            case 209 -> 29;
            case 210 -> 137;
            case 211 -> 229;
            case 212 -> 60;
            case 213 -> 127;
            case 214 -> 39;
            case 215 -> 233;
            case 216 -> 81;
            case 217 -> 182;
            case 218 -> 125;
            case 219 -> 123;
            case 220 -> 74;
            case 221 -> 212;
            case 222 -> 98;
            case 223 -> 69;
            case 224 -> 111;
            case 225 -> 246;
            case 226 -> 94;
            case 227 -> 157;
            case 228 -> 211;
            case 229 -> 63;
            case 230 -> 253;
            case 231 -> 139;
            case 232 -> 12;
            case 233 -> 216;
            case 234 -> 105;
            case 235 -> 206;
            case 236 -> 95;
            case 237 -> 220;
            case 238 -> 193;
            case 239 -> 250;
            case 240 -> 36;
            case 241 -> 17;
            case 242 -> 208;
            case 243 -> 234;
            case 244 -> 191;
            case 245 -> 24;
            case 246 -> 86;
            case 247 -> 160;
            case 248 -> 232;
            case 249 -> 8;
            case 250 -> 5;
            case 251 -> 231;
            case 252 -> 11;
            case 253 -> 202;
            case 254 -> 185;
            default -> 131;
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


   // PX-RESTORE TOPc: Kotlin @Serializable 合成成员，语义按 jar 字节码还原（javap -p -c）。
   public lIlIlllIIIlllIIIllllIIlIIIllIlllllIIllIIlIIIlllIlIIIllIIIllIllllIllIIIIIIIllIlIIlIIIl(boolean var1, lllIlIIlIllIIIIIlIIlIlIIIIIlIIlIIIlllllIIllIlIlIIIllIIlIIlIlIlIlIlllIIIIllIlIlIIlIIII var2, String var3, int var4, DefaultConstructorMarker var5) {
      if ((var4 & 4) != 0) {
         var3 = null;
      }
      this(var1, var2, var3);
   }

   public lIlIlllIIIlllIIIllllIIlIIIllIlllllIIllIIlIIIlllIlIIIllIIIllIllllIllIIIIIIIllIlIIlIIIl(int var1, boolean var2, lllIlIIlIllIIIIIlIIlIlIIIIIlIIlIIIlllllIIllIlIlIIIllIIlIIlIlIlIlIlllIIIIllIlIlIIlIIII var3, String var4, SerializationConstructorMarker var5) {
      if (3 != (3 & var1)) {
         PluginExceptionsKt.throwMissingFieldException(var1, 3, ((GeneratedSerializer)lIlIlllIIIlllIIIllllIIlIIIllIlllllIIllIIlIIIlllIlIIIllIIIllIllllIllIIIIIIIllIlIIlIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl).getDescriptor());
      }
      super();
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = (var1 & 4) != 0 ? var4 : null;
   }

   public static final void a(@NotNull lIlIlllIIIlllIIIllllIIlIIIllIlllllIIllIIlIIIlllIlIIIllIIIllIllllIllIIIIIIIllIlIIlIIIl var0, @NotNull CompositeEncoder var1, @NotNull SerialDescriptor var2) {
      var1.encodeBooleanElement(var2, 0, var0.a());
      var1.encodeSerializableElement(var2, 1, (SerializationStrategy)(Object)lllIlIIlIllIIIIIlIIlIlIIIIIlIIlIIIlllllIIllIlIlIIIllIIlIIlIlIlIlIlllIIIIllIlIlIIlIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, var0.c());
      if (var1.shouldEncodeElementDefault(var2, 2) || var0.e() != null) {
         var1.encodeNullableSerializableElement(var2, 2, (SerializationStrategy)StringSerializer.INSTANCE, var0.e());
      }
   }

   @JvmStatic
   public static lIlIlllIIIlllIIIllllIIlIIIllIlllllIIllIIlIIIlllIlIIIllIIIllIllllIllIIIIIIIllIlIIlIIIl a(@NotNull lIlIlllIIIlllIIIllllIIlIIIllIlllllIIllIIlIIIlllIlIIIllIIIllIllllIllIIIIIIIllIlIIlIIIl var0, boolean var1, lllIlIIlIllIIIIIlIIlIlIIIIIlIIlIIIlllllIIllIlIlIIIllIIlIIlIlIlIlIlllIIIIllIlIlIIlIIII var2, String var3, int var4, Object var5) {
      if ((var4 & 1) != 0) {
         var1 = var0.g();
      }
      if ((var4 & 2) != 0) {
         var2 = var0.h();
      }
      if ((var4 & 4) != 0) {
         var3 = var0.i();
      }
      return var0.a(var1, var2, var3);
   }

   // PX-FIX annotation-only: jar carries @kotlinx.serialization.SerialName("ok"),
   // which has Java @Target(TYPE) and cannot be placed on a method by javac.
   public static void b() {
   }

   // PX-FIX annotation-only: jar carries @kotlinx.serialization.SerialName("data"),
   // which has Java @Target(TYPE) and cannot be placed on a method by javac.
   public static void d() {
   }

   // PX-FIX annotation-only: jar carries @kotlinx.serialization.SerialName("hash"),
   // which has Java @Target(TYPE) and cannot be placed on a method by javac.
   public static void f() {
   }

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(Object... px) {
        }
        public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(kotlin.jvm.internal.DefaultConstructorMarker pxMarker) {
           this();
        }


      private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
      }

      @NotNull
      public final KSerializer<lIlIlllIIIlllIIIllllIIlIIIllIlllllIIllIIlIIIlllIlIIIllIIIllIllllIllIIIIIIIllIlIIlIIIl> a() {
      Object llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll = null; // PX-FIX
         return (KSerializer<lIlIlllIIIlllIIIllllIIlIIIllIlllllIIllIIlIIIlllIlIIIllIIIllIllllIllIIIIIIIllIlIIlIIIl>)lIlIlllIIIlllIIIllllIIlIIIllIlllllIIllIIlIIIlllIlIIIllIIIllIllllIllIIIIIIIllIlIIlIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }
   }
}
