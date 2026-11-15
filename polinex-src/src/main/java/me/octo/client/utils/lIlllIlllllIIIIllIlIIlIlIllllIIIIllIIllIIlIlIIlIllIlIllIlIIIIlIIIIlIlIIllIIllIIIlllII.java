package me.octo.client.utils;

import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

public final class lIlllIlllllIIIIllIlIIlIlIllllIIIIllIIllIIlIlIIlIllIlIllIlIIIIlIIIIlIlIIllIIllIIIlllII {
   @NotNull
   public static lIlllIlllllIIIIllIlIIlIlIllllIIIIllIIllIIlIlIIlIllIlIllIlIIIIlIIIIlIlIIllIIllIIIlllII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIlllIlllllIIIIllIlIIlIlIllllIIIIllIIllIIlIlIIlIllIlIllIlIIIIlIIIIlIlIIllIIllIIIlllII();
   @JvmField
   @NotNull
   public static lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII<java.util.HashMap<java.lang.Object, java.lang.Object>> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII<>(
      lIlllIlllllIIIIllIlIIlIlIllllIIIIllIIllIIlIlIIlIllIlIllIlIIIIlIIIIlIlIIllIIllIIIlllII::a,
      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
   );
   @JvmField
   @NotNull
   public static lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII<java.util.HashSet<java.lang.Object>> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII<>(
      lIlllIlllllIIIIllIlIIlIlIllllIIIIllIIllIIlIlIIlIllIlIllIlIIIIlIIIIlIlIIllIIllIIIlllII::b,
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
   );

   private lIlllIlllllIIIIllIlIIlIlIllllIIIIllIIllIIlIlIIlIllIlIllIlIIIIlIIIIlIlIIllIIllIIIlllII() {
   }

   private static final HashMap a() {
      return new HashMap();
   }

   private static final HashSet b() {
      return new HashSet();
   }

   // PX-FIX PhaseA-inline: jar-only nested class restored from ext2/row3.javap.txt bytecode (see phaseA-nested-inline-BD2.md).
   static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
         extends kotlin.jvm.internal.FunctionReferenceImpl
         implements kotlin.jvm.functions.Function1 {
      // PX-FIX PhaseA-pending: the a[]/b[] string tables and the private static decryptor are
      // unreachable from anywhere in the jar (no call sites); their bytecode is preserved in
      // descriptor and control-flow shape, but the table *contents* are equivalent, not literal.
      public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private static java.lang.String[] a;
      private static java.lang.String[] b;

      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
         super(1, java.util.HashSet.class, "clear", "clear()V", 0);
         return;
      }

      public final void a(java.util.HashSet<java.lang.Object> var1) {
         kotlin.jvm.internal.Intrinsics.checkNotNullParameter(var1, "p0");
         var1.clear();
         return;
      }

      public java.lang.Object invoke(java.lang.Object var1) {
         this.a((java.util.HashSet)var1);
         return kotlin.Unit.INSTANCE;
      }

      static {
         a = new String[3];
         b = new String[3];
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI();
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -16852) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();
            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 140;
               case 1 -> 157;
               case 2 -> 126;
               case 3 -> 122;
               case 4 -> 74;
               case 5 -> 93;
               case 6 -> 109;
               case 7 -> 198;
               case 8 -> 124;
               case 9 -> 35;
               case 10 -> 228;
               case 11 -> 5;
               case 12 -> 147;
               case 13 -> 148;
               case 14 -> 42;
               case 15 -> 73;
               case 16 -> 154;
               case 17 -> 82;
               case 18 -> 41;
               case 19 -> 252;
               case 20 -> 210;
               case 21 -> 199;
               case 22 -> 200;
               case 23 -> 86;
               case 24 -> 75;
               case 25 -> 206;
               case 26 -> 11;
               case 27 -> 176;
               case 28 -> 182;
               case 29 -> 8;
               case 30 -> 188;
               case 31 -> 62;
               case 32 -> 16;
               case 33 -> 65;
               case 34 -> 117;
               case 35 -> 162;
               case 36 -> 135;
               case 37 -> 53;
               case 38 -> 104;
               case 39 -> 56;
               case 40 -> 213;
               case 41 -> 57;
               case 42 -> 112;
               case 43 -> 102;
               case 44 -> 194;
               case 45 -> 149;
               case 46 -> 163;
               case 47 -> 143;
               case 48 -> 26;
               case 49 -> 127;
               case 50 -> 128;
               case 51 -> 60;
               case 52 -> 225;
               case 53 -> 196;
               case 54 -> 115;
               case 55 -> 237;
               case 56 -> 229;
               case 57 -> 187;
               case 58 -> 172;
               case 59 -> 55;
               case 60 -> 39;
               case 61 -> 191;
               case 62 -> 164;
               case 63 -> 77;
               case 64 -> 92;
               case 65 -> 120;
               case 66 -> 159;
               case 67 -> 6;
               case 68 -> 19;
               case 69 -> 87;
               case 70 -> 29;
               case 71 -> 203;
               case 72 -> 186;
               case 73 -> 174;
               case 74 -> 245;
               case 75 -> 14;
               case 76 -> 167;
               case 77 -> 175;
               case 78 -> 133;
               case 79 -> 217;
               case 80 -> 224;
               case 81 -> 105;
               case 82 -> 15;
               case 83 -> 84;
               case 84 -> 7;
               case 85 -> 238;
               case 86 -> 243;
               case 87 -> 171;
               case 88 -> 38;
               case 89 -> 3;
               case 90 -> 249;
               case 91 -> 31;
               case 92 -> 197;
               case 93 -> 202;
               case 94 -> 80;
               case 95 -> 123;
               case 96 -> 160;
               case 97 -> 208;
               case 98 -> 118;
               case 99 -> 177;
               case 100 -> 185;
               case 101 -> 144;
               case 102 -> 91;
               case 103 -> 233;
               case 104 -> 218;
               case 105 -> 76;
               case 106 -> 107;
               case 107 -> 181;
               case 108 -> 226;
               case 109 -> 51;
               case 110 -> 142;
               case 111 -> 83;
               case 112 -> 78;
               case 113 -> 232;
               case 114 -> 152;
               case 115 -> 155;
               case 116 -> 49;
               case 117 -> 71;
               case 118 -> 247;
               case 119 -> 190;
               case 120 -> 250;
               case 121 -> 240;
               case 122 -> 98;
               case 123 -> 110;
               case 124 -> 137;
               case 125 -> 59;
               case 126 -> 141;
               case 127 -> 131;
               case 128 -> 66;
               case 129 -> 85;
               case 130 -> 244;
               case 131 -> 108;
               case 132 -> 106;
               case 133 -> 253;
               case 134 -> 32;
               case 135 -> 48;
               case 136 -> 129;
               case 137 -> 94;
               case 138 -> 151;
               case 139 -> 95;
               case 140 -> 146;
               case 141 -> 212;
               case 142 -> 24;
               case 143 -> 251;
               case 144 -> 97;
               case 145 -> 0;
               case 146 -> 180;
               case 147 -> 248;
               case 148 -> 170;
               case 149 -> 2;
               case 150 -> 61;
               case 151 -> 47;
               case 152 -> 125;
               case 153 -> 183;
               case 154 -> 68;
               case 155 -> 70;
               case 156 -> 145;
               case 157 -> 168;
               case 158 -> 12;
               case 159 -> 216;
               case 160 -> 72;
               case 161 -> 111;
               case 162 -> 88;
               case 163 -> 13;
               case 164 -> 201;
               case 165 -> 234;
               case 166 -> 67;
               case 167 -> 64;
               case 168 -> 37;
               case 169 -> 81;
               case 170 -> 192;
               case 171 -> 184;
               case 172 -> 179;
               case 173 -> 114;
               case 174 -> 130;
               case 175 -> 220;
               case 176 -> 10;
               case 177 -> 4;
               case 178 -> 214;
               case 179 -> 40;
               case 180 -> 231;
               case 181 -> 116;
               case 182 -> 46;
               case 183 -> 27;
               case 184 -> 36;
               case 185 -> 189;
               case 186 -> 230;
               case 187 -> 158;
               case 188 -> 236;
               case 189 -> 211;
               case 190 -> 18;
               case 191 -> 139;
               case 192 -> 239;
               case 193 -> 205;
               case 194 -> 101;
               case 195 -> 161;
               case 196 -> 28;
               case 197 -> 17;
               case 198 -> 33;
               case 199 -> 63;
               case 200 -> 255;
               case 201 -> 45;
               case 202 -> 54;
               case 203 -> 103;
               case 204 -> 223;
               case 205 -> 254;
               case 206 -> 193;
               case 207 -> 121;
               case 208 -> 204;
               case 209 -> 50;
               case 210 -> 89;
               case 211 -> 150;
               case 212 -> 99;
               case 213 -> 221;
               case 214 -> 153;
               case 215 -> 246;
               case 216 -> 58;
               case 217 -> 21;
               case 218 -> 43;
               case 219 -> 69;
               case 220 -> 169;
               case 221 -> 195;
               case 222 -> 138;
               case 223 -> 20;
               case 224 -> 209;
               case 225 -> 242;
               case 226 -> 79;
               case 227 -> 96;
               case 228 -> 219;
               case 229 -> 30;
               case 230 -> 113;
               case 231 -> 52;
               case 232 -> 100;
               case 233 -> 119;
               case 234 -> 1;
               case 235 -> 22;
               case 236 -> 90;
               case 237 -> 25;
               case 238 -> 222;
               case 239 -> 178;
               case 240 -> 23;
               case 241 -> 134;
               case 242 -> 207;
               case 243 -> 215;
               case 244 -> 241;
               case 245 -> 136;
               case 246 -> 165;
               case 247 -> 166;
               case 248 -> 227;
               case 249 -> 173;
               case 250 -> 34;
               case 251 -> 132;
               case 252 -> 156;
               case 253 -> 9;
               case 254 -> 44;
               default -> 235;
            };
            int var5 = (var1 & 0xFF) - var4;
            if (var5 < 0) { var5 += 256; }
            int var6 = ((var1 & 65535) >>> 8) - var4;
            if (var6 < 0) { var6 += 256; }
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

   // PX-FIX PhaseA-inline: jar-only nested class restored from ext2/row4.javap.txt bytecode (see phaseA-nested-inline-BD2.md).
   static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
         extends kotlin.jvm.internal.FunctionReferenceImpl
         implements kotlin.jvm.functions.Function1 {
      // PX-FIX PhaseA-pending: the a[]/b[] string tables and the private static decryptor are
      // unreachable from anywhere in the jar (no call sites); their bytecode is preserved in
      // descriptor and control-flow shape, but the table *contents* are equivalent, not literal.
      public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private static java.lang.String[] a;
      private static java.lang.String[] b;

      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
         super(1, java.util.HashMap.class, "clear", "clear()V", 0);
         return;
      }

      public final void a(java.util.HashMap<java.lang.Object, java.lang.Object> var1) {
         kotlin.jvm.internal.Intrinsics.checkNotNullParameter(var1, "p0");
         var1.clear();
         return;
      }

      public java.lang.Object invoke(java.lang.Object var1) {
         this.a((java.util.HashMap)var1);
         return kotlin.Unit.INSTANCE;
      }

      static {
         a = new String[3];
         b = new String[3];
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll();
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 16995) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();
            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 185;
               case 1 -> 216;
               case 2 -> 160;
               case 3 -> 68;
               case 4 -> 225;
               case 5 -> 150;
               case 6 -> 47;
               case 7 -> 224;
               case 8 -> 5;
               case 9 -> 103;
               case 10 -> 56;
               case 11 -> 4;
               case 12 -> 134;
               case 13 -> 37;
               case 14 -> 211;
               case 15 -> 197;
               case 16 -> 152;
               case 17 -> 53;
               case 18 -> 34;
               case 19 -> 135;
               case 20 -> 82;
               case 21 -> 117;
               case 22 -> 190;
               case 23 -> 80;
               case 24 -> 1;
               case 25 -> 42;
               case 26 -> 99;
               case 27 -> 94;
               case 28 -> 146;
               case 29 -> 188;
               case 30 -> 191;
               case 31 -> 166;
               case 32 -> 60;
               case 33 -> 32;
               case 34 -> 243;
               case 35 -> 217;
               case 36 -> 113;
               case 37 -> 39;
               case 38 -> 171;
               case 39 -> 109;
               case 40 -> 133;
               case 41 -> 163;
               case 42 -> 169;
               case 43 -> 85;
               case 44 -> 115;
               case 45 -> 213;
               case 46 -> 250;
               case 47 -> 121;
               case 48 -> 126;
               case 49 -> 59;
               case 50 -> 247;
               case 51 -> 87;
               case 52 -> 195;
               case 53 -> 244;
               case 54 -> 212;
               case 55 -> 18;
               case 56 -> 208;
               case 57 -> 196;
               case 58 -> 236;
               case 59 -> 141;
               case 60 -> 105;
               case 61 -> 10;
               case 62 -> 182;
               case 63 -> 24;
               case 64 -> 128;
               case 65 -> 237;
               case 66 -> 54;
               case 67 -> 176;
               case 68 -> 246;
               case 69 -> 221;
               case 70 -> 66;
               case 71 -> 228;
               case 72 -> 203;
               case 73 -> 181;
               case 74 -> 186;
               case 75 -> 93;
               case 76 -> 95;
               case 77 -> 179;
               case 78 -> 151;
               case 79 -> 35;
               case 80 -> 255;
               case 81 -> 29;
               case 82 -> 102;
               case 83 -> 180;
               case 84 -> 108;
               case 85 -> 174;
               case 86 -> 73;
               case 87 -> 167;
               case 88 -> 201;
               case 89 -> 209;
               case 90 -> 189;
               case 91 -> 38;
               case 92 -> 86;
               case 93 -> 140;
               case 94 -> 198;
               case 95 -> 76;
               case 96 -> 75;
               case 97 -> 67;
               case 98 -> 251;
               case 99 -> 90;
               case 100 -> 219;
               case 101 -> 218;
               case 102 -> 45;
               case 103 -> 254;
               case 104 -> 194;
               case 105 -> 120;
               case 106 -> 64;
               case 107 -> 84;
               case 108 -> 230;
               case 109 -> 161;
               case 110 -> 51;
               case 111 -> 6;
               case 112 -> 239;
               case 113 -> 69;
               case 114 -> 199;
               case 115 -> 106;
               case 116 -> 48;
               case 117 -> 36;
               case 118 -> 223;
               case 119 -> 143;
               case 120 -> 41;
               case 121 -> 50;
               case 122 -> 215;
               case 123 -> 31;
               case 124 -> 110;
               case 125 -> 165;
               case 126 -> 96;
               case 127 -> 154;
               case 128 -> 107;
               case 129 -> 206;
               case 130 -> 157;
               case 131 -> 123;
               case 132 -> 9;
               case 133 -> 205;
               case 134 -> 83;
               case 135 -> 245;
               case 136 -> 232;
               case 137 -> 61;
               case 138 -> 17;
               case 139 -> 57;
               case 140 -> 43;
               case 141 -> 238;
               case 142 -> 63;
               case 143 -> 119;
               case 144 -> 241;
               case 145 -> 170;
               case 146 -> 164;
               case 147 -> 130;
               case 148 -> 129;
               case 149 -> 91;
               case 150 -> 226;
               case 151 -> 79;
               case 152 -> 147;
               case 153 -> 144;
               case 154 -> 100;
               case 155 -> 114;
               case 156 -> 2;
               case 157 -> 253;
               case 158 -> 240;
               case 159 -> 177;
               case 160 -> 162;
               case 161 -> 3;
               case 162 -> 21;
               case 163 -> 13;
               case 164 -> 104;
               case 165 -> 8;
               case 166 -> 70;
               case 167 -> 153;
               case 168 -> 58;
               case 169 -> 248;
               case 170 -> 101;
               case 171 -> 173;
               case 172 -> 168;
               case 173 -> 252;
               case 174 -> 125;
               case 175 -> 65;
               case 176 -> 178;
               case 177 -> 72;
               case 178 -> 207;
               case 179 -> 74;
               case 180 -> 7;
               case 181 -> 131;
               case 182 -> 148;
               case 183 -> 227;
               case 184 -> 0;
               case 185 -> 172;
               case 186 -> 175;
               case 187 -> 97;
               case 188 -> 46;
               case 189 -> 158;
               case 190 -> 184;
               case 191 -> 233;
               case 192 -> 77;
               case 193 -> 111;
               case 194 -> 214;
               case 195 -> 122;
               case 196 -> 136;
               case 197 -> 11;
               case 198 -> 89;
               case 199 -> 88;
               case 200 -> 40;
               case 201 -> 23;
               case 202 -> 137;
               case 203 -> 229;
               case 204 -> 138;
               case 205 -> 132;
               case 206 -> 16;
               case 207 -> 249;
               case 208 -> 25;
               case 209 -> 220;
               case 210 -> 92;
               case 211 -> 12;
               case 212 -> 139;
               case 213 -> 156;
               case 214 -> 200;
               case 215 -> 234;
               case 216 -> 112;
               case 217 -> 183;
               case 218 -> 28;
               case 219 -> 222;
               case 220 -> 210;
               case 221 -> 26;
               case 222 -> 142;
               case 223 -> 22;
               case 224 -> 242;
               case 225 -> 55;
               case 226 -> 202;
               case 227 -> 118;
               case 228 -> 124;
               case 229 -> 98;
               case 230 -> 19;
               case 231 -> 78;
               case 232 -> 235;
               case 233 -> 193;
               case 234 -> 52;
               case 235 -> 155;
               case 236 -> 116;
               case 237 -> 187;
               case 238 -> 192;
               case 239 -> 231;
               case 240 -> 127;
               case 241 -> 27;
               case 242 -> 204;
               case 243 -> 30;
               case 244 -> 81;
               case 245 -> 14;
               case 246 -> 62;
               case 247 -> 44;
               case 248 -> 49;
               case 249 -> 20;
               case 250 -> 71;
               case 251 -> 15;
               case 252 -> 159;
               case 253 -> 145;
               case 254 -> 33;
               default -> 149;
            };
            int var5 = (var1 & 0xFF) - var4;
            if (var5 < 0) { var5 += 256; }
            int var6 = ((var1 & 65535) >>> 8) - var4;
            if (var6 < 0) { var6 += 256; }
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
}
