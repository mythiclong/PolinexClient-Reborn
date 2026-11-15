package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import org.graalvm.polyglot.HostAccess.Export;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIIlIlIIIIlIlIlIlllIIlIIlIIIIIlIIIlIIlIllIllIlIIIlIlIlIlIlIIIlIIIllIIlIllIIlllIIIIlI {
   @NotNull
   private final lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static String[] a;
   private static String[] b;

   public lIIIlIlIIIIlIlIlIlllIIlIIlIIIIIlIIIlIIlIllIllIlIIIlIlIlIlIlIIIlIIIllIIlIllIIlllIIIIlI(
      @NotNull lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII var1
   ) {
      short var10001 = -8074;
      short var10002 = -4199;
      Intrinsics.checkNotNullParameter(var1, "scriptModule");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
   }

   @Export
   public final boolean a() {
      String[] var10000 = IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.b();
      IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var2 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .ah();
      String[] var1 = var10000;
      boolean var3 = var2 instanceof llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl;
      if (var1 != null) {
         var3 = var3 ? ((llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl)var2).aA() : true;
      }

      return var3;
   }

   @Export
   @Nullable
   public final IIlllIIllIllllIlIIIIIIlllIIlIIIlllllIlIlllllIlIIIlIllllIIllIlIlIlIIlIIIIIlIIllIlllIlI a(@NotNull String var1) {
      String[] var10000 = IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.b();
      short var10002 = -8073;
      short var10003 = 1539;
      Intrinsics.checkNotNullParameter(var1, "name");
      String[] var2 = var10000;
      if (var2 != null) {
         IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .ah()
            .c(var1);
         if (var4 != null) {
            IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll var3 = var4;
            return new IIlllIIllIllllIlIIIIIIlllIIlIIIlllllIlIlllllIlIIIlIllllIIllIlIlIlIIlIIIIIlIIllIlllIlI(var3);
         }
      }

      return null;
   }

   @Export
   @Nullable
   public final String b() {
      String[] var10000 = IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.b();
      IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var2 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .ah();
      String[] var1 = var10000;
      IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var3 = var2;
      if (var1 != null) {
         if (!(var2 instanceof IIIIlIlIllIIllIlllllIlIlIlIlllllIIIllIIlIIIlIlIIIIIlllIlllIlIllllllIIllIIlIIlIlIlIIll)) {
            return null;
         }

         var3 = var2;
      }

      return ((IIIIlIlIllIIllIlllllIlIlIlIlllllIIIllIIlIIIlIlIIIIIlllIlllIlIllllllIIllIIlIIlIlIlIIll)var3).y();
   }

   @Export
   @Nullable
   public final Integer c() {
      String[] var10000 = IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.b();
      IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var2 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .ah();
      String[] var1 = var10000;
      int var3 = ((var2 instanceof IIIIlIlIllIIllIlllllIlIlIlIlllllIIIllIIlIIIlIlIIIIIlllIlllIlIllllllIIllIIlIIlIlIlIIll) ? 1 : 0);
      if (var1 != null) {
         if (var3 == 0) {
            return null;
         }

         var3 = ((IIIIlIlIllIIllIlllllIlIlIlIlllllIIIllIIlIIIlIlIIIIIlllIlllIlIllllllIIllIIlIIlIlIlIIll)var2).x();
      }

      return var3;
   }

   @Export
   @Nullable
   public final Object d() {
      String[] var10000 = IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.b();
      IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var2 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .ah();
      String[] var1 = var10000;
      boolean var3 = var2 instanceof lIlIllIIlIIIlllIIIllIIIIlIIIIllIIIIIlIIIIllIllIlIIlllIllIIlllllIlllllIIIlllllIIllIIIl;
      if (var1 != null) {
         if (var3) {
            return ((lIlIllIIlIIIlllIIIllIIIIlIIIIllIIIIIlIIIIllIllIlIIlllIllIIlllllIlllllIIIlllllIIllIIIl)var2).M();
         }

         if (var1 == null) {
            return ((IlIlIlllIlllIIlIllIIIlIIIIlIIIIIIllIlIIlIlIIlIllIlIIIllIIIlIlIlIllllllIIIllIIlIllllII)var2).n();
         }

         var3 = var2 instanceof IlIlIlllIlllIIlIllIIIlIIIIlIIIIIIllIlIIlIlIIlIllIlIIIllIIIlIlIlIllllllIIIllIIlIllllII;
      }

      return !var3 ? null : ((IlIlIlllIlllIIlIllIIIlIIIIlIIIIIIllIlIIlIlIIlIllIlIIIllIIIlIlIlIllllllIIIllIIlIllllII)var2).n();
   }

   @Export
   @Nullable
   public final Object e() {
      String[] var10000 = IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.b();
      IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var2 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .ah();
      String[] var1 = var10000;
      boolean var3 = var2 instanceof llllllIlIlIIlIlIIIlIllllIIllllIlllIlIIIlIIllIlIIIIllllIlIlIllllIllIIlIIlIlIlIlIllllll;
      if (var1 != null) {
         if (var3) {
            return ((llllllIlIlIIlIlIIIlIllllIIllllIlllIlIIIlIIllIlIIIIllllIlIlIllllIllIIlIIlIlIlIlIllllll)var2).Q();
         }

         if (var1 == null) {
            return ((lIIIllIlIlIIllIIlIlIlIlIlIlIlIlIIlIlIlIIlIllIIllIlIIllIIlIllllllllllIIlIIlIIIllllIlII)var2).s();
         }

         var3 = var2 instanceof lIIIllIlIlIIllIIlIlIlIlIlIlIlIlIIlIlIlIIlIllIIllIlIIllIIlIllllllllllIIlIIlIIIllllIlII;
      }

      return !var3 ? null : ((lIIIllIlIlIIllIIlIlIlIlIlIlIlIlIIlIlIlIIlIllIIllIlIIllIIlIllllllllllIIlIIlIIIllllIlII)var2).s();
   }

   @Export
   @Nullable
   public final Object f() {
      String[] var10000 = IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.b();
      IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var2 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .ah();
      String[] var1 = var10000;
      boolean var3 = var2 instanceof llllllIlIlIIlIlIIIlIllllIIllllIlllIlIIIlIIllIlIIIIllllIlIlIllllIllIIlIIlIlIlIlIllllll;
      if (var1 != null) {
         if (var3) {
            return ((llllllIlIlIIlIlIIIlIllllIIllllIlllIlIIIlIIllIlIIIIllllIlIlIllllIllIIlIIlIlIlIlIllllll)var2).R();
         }

         if (var1 == null) {
            return ((lIIIllIlIlIIllIIlIlIlIlIlIlIlIlIIlIlIlIIlIllIIllIlIIllIIlIllllllllllIIlIIlIIIllllIlII)var2).t();
         }

         var3 = var2 instanceof lIIIllIlIlIIllIIlIlIlIlIlIlIlIlIIlIlIlIIlIllIIllIlIIllIIlIllllllllllIIlIIlIIIllllIlII;
      }

      return !var3 ? null : ((lIIIllIlIlIIllIIlIlIlIlIlIlIlIlIIlIlIlIIlIllIIllIlIIllIIlIllllllllllIIlIIlIIIllllIlII)var2).t();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "I\u0012ªt\fj÷o\u0086LDä¥Ù\u000e¡\u0092";
      int var4 = "I\u0012ªt\fj÷o\u0086LDä¥Ù\u000e¡\u0092".length();
      char var1 = 4;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 123;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 123;
               var10006 = var6;
            } else {
               var13 = 123;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 123;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 42;
                  case 1 -> 113;
                  case 2 -> 28;
                  case 3 -> 36;
                  case 4 -> 122;
                  case 5 -> 52;
                  default -> 5;
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
            b = new String[2];
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -8073) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 96;
            case 1 -> 26;
            case 2 -> 32;
            case 3 -> 146;
            case 4 -> 154;
            case 5 -> 216;
            case 6 -> 143;
            case 7 -> 152;
            case 8 -> 211;
            case 9 -> 53;
            case 10 -> 39;
            case 11 -> 233;
            case 12 -> 178;
            case 13 -> 158;
            case 14 -> 164;
            case 15 -> 182;
            case 16 -> 234;
            case 17 -> 36;
            case 18 -> 149;
            case 19 -> 86;
            case 20 -> 167;
            case 21 -> 63;
            case 22 -> 190;
            case 23 -> 18;
            case 24 -> 141;
            case 25 -> 197;
            case 26 -> 49;
            case 27 -> 145;
            case 28 -> 84;
            case 29 -> 28;
            case 30 -> 46;
            case 31 -> 93;
            case 32 -> 74;
            case 33 -> 107;
            case 34 -> 16;
            case 35 -> 9;
            case 36 -> 227;
            case 37 -> 201;
            case 38 -> 245;
            case 39 -> 166;
            case 40 -> 123;
            case 41 -> 215;
            case 42 -> 254;
            case 43 -> 101;
            case 44 -> 184;
            case 45 -> 59;
            case 46 -> 100;
            case 47 -> 148;
            case 48 -> 22;
            case 49 -> 2;
            case 50 -> 1;
            case 51 -> 189;
            case 52 -> 50;
            case 53 -> 156;
            case 54 -> 75;
            case 55 -> 225;
            case 56 -> 113;
            case 57 -> 87;
            case 58 -> 76;
            case 59 -> 81;
            case 60 -> 55;
            case 61 -> 48;
            case 62 -> 134;
            case 63 -> 177;
            case 64 -> 241;
            case 65 -> 19;
            case 66 -> 70;
            case 67 -> 111;
            case 68 -> 250;
            case 69 -> 242;
            case 70 -> 195;
            case 71 -> 132;
            case 72 -> 108;
            case 73 -> 198;
            case 74 -> 14;
            case 75 -> 112;
            case 76 -> 89;
            case 77 -> 88;
            case 78 -> 188;
            case 79 -> 35;
            case 80 -> 236;
            case 81 -> 176;
            case 82 -> 202;
            case 83 -> 68;
            case 84 -> 92;
            case 85 -> 183;
            case 86 -> 69;
            case 87 -> 169;
            case 88 -> 144;
            case 89 -> 194;
            case 90 -> 117;
            case 91 -> 172;
            case 92 -> 238;
            case 93 -> 119;
            case 94 -> 181;
            case 95 -> 240;
            case 96 -> 47;
            case 97 -> 249;
            case 98 -> 7;
            case 99 -> 126;
            case 100 -> 40;
            case 101 -> 114;
            case 102 -> 3;
            case 103 -> 43;
            case 104 -> 121;
            case 105 -> 224;
            case 106 -> 163;
            case 107 -> 120;
            case 108 -> 252;
            case 109 -> 248;
            case 110 -> 21;
            case 111 -> 135;
            case 112 -> 91;
            case 113 -> 11;
            case 114 -> 209;
            case 115 -> 136;
            case 116 -> 193;
            case 117 -> 80;
            case 118 -> 173;
            case 119 -> 239;
            case 120 -> 170;
            case 121 -> 155;
            case 122 -> 174;
            case 123 -> 243;
            case 124 -> 208;
            case 125 -> 104;
            case 126 -> 212;
            case 127 -> 58;
            case 128 -> 232;
            case 129 -> 153;
            case 130 -> 159;
            case 131 -> 162;
            case 132 -> 186;
            case 133 -> 137;
            case 134 -> 0;
            case 135 -> 64;
            case 136 -> 214;
            case 137 -> 118;
            case 138 -> 125;
            case 139 -> 133;
            case 140 -> 147;
            case 141 -> 110;
            case 142 -> 246;
            case 143 -> 171;
            case 144 -> 228;
            case 145 -> 180;
            case 146 -> 187;
            case 147 -> 151;
            case 148 -> 229;
            case 149 -> 15;
            case 150 -> 191;
            case 151 -> 13;
            case 152 -> 213;
            case 153 -> 175;
            case 154 -> 44;
            case 155 -> 150;
            case 156 -> 139;
            case 157 -> 179;
            case 158 -> 115;
            case 159 -> 90;
            case 160 -> 199;
            case 161 -> 61;
            case 162 -> 57;
            case 163 -> 206;
            case 164 -> 51;
            case 165 -> 255;
            case 166 -> 27;
            case 167 -> 25;
            case 168 -> 97;
            case 169 -> 54;
            case 170 -> 106;
            case 171 -> 78;
            case 172 -> 218;
            case 173 -> 140;
            case 174 -> 45;
            case 175 -> 95;
            case 176 -> 205;
            case 177 -> 20;
            case 178 -> 42;
            case 179 -> 127;
            case 180 -> 142;
            case 181 -> 71;
            case 182 -> 77;
            case 183 -> 221;
            case 184 -> 30;
            case 185 -> 161;
            case 186 -> 103;
            case 187 -> 10;
            case 188 -> 157;
            case 189 -> 41;
            case 190 -> 226;
            case 191 -> 4;
            case 192 -> 24;
            case 193 -> 131;
            case 194 -> 237;
            case 195 -> 253;
            case 196 -> 79;
            case 197 -> 34;
            case 198 -> 6;
            case 199 -> 67;
            case 200 -> 196;
            case 201 -> 66;
            case 202 -> 109;
            case 203 -> 165;
            case 204 -> 200;
            case 205 -> 235;
            case 206 -> 128;
            case 207 -> 33;
            case 208 -> 192;
            case 209 -> 222;
            case 210 -> 160;
            case 211 -> 217;
            case 212 -> 82;
            case 213 -> 220;
            case 214 -> 204;
            case 215 -> 207;
            case 216 -> 37;
            case 217 -> 247;
            case 218 -> 105;
            case 219 -> 244;
            case 220 -> 17;
            case 221 -> 65;
            case 222 -> 12;
            case 223 -> 129;
            case 224 -> 31;
            case 225 -> 99;
            case 226 -> 168;
            case 227 -> 116;
            case 228 -> 94;
            case 229 -> 122;
            case 230 -> 5;
            case 231 -> 73;
            case 232 -> 210;
            case 233 -> 231;
            case 234 -> 62;
            case 235 -> 223;
            case 236 -> 130;
            case 237 -> 124;
            case 238 -> 203;
            case 239 -> 8;
            case 240 -> 138;
            case 241 -> 251;
            case 242 -> 85;
            case 243 -> 83;
            case 244 -> 56;
            case 245 -> 29;
            case 246 -> 185;
            case 247 -> 23;
            case 248 -> 98;
            case 249 -> 219;
            case 250 -> 230;
            case 251 -> 38;
            case 252 -> 52;
            case 253 -> 72;
            case 254 -> 60;
            default -> 102;
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
