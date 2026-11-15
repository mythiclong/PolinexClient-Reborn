package me.octo.client;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.ByteBufferBuilder;
import java.util.Collection;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class lIIllllIIIIIIIIlIllIllIIlIIIlIlIlIIIllIIlIlIIIIIIllllIIIllIllIIIlllIllIIllllllllIllll {
   @NotNull
   public static lIIllllIIIIIIIIlIllIllIIlIIIlIlIlIIIllIIlIlIIIIIIllllIIIllIllIIIlllIllIIllllllllIllll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @JvmField
   @NotNull
   public static ByteBufferBuilder IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static me.octo.client.utils.lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII<ByteBufferBuilder> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static String[] a;
   private static String[] b;

   private lIIllllIIIIIIIIlIllIllIIlIIIlIlIlIIIllIIlIlIIIIIIllllIIIllIllIIIlllIllIIllllllllIllll() {
   }

   @JvmStatic
   @NotNull
   public static final BufferBuilder a(@NotNull RenderPipeline var0, @NotNull Collection<ByteBufferBuilder> var1) {
      short var10001 = -27267;
      short var10002 = -29323;
      Intrinsics.checkNotNullParameter(var0, "pipeline");
      var10001 = -27265;
      var10002 = 5302;
      Intrinsics.checkNotNullParameter(var1, "allocatorInUse");
      ByteBufferBuilder var2 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a();
      var1.add(var2);
      boolean var5 = false;
      return new BufferBuilder(var2, var0.getVertexFormatMode(), var0.getVertexFormat());
   }

   @JvmStatic
   public static final void a(@NotNull Iterable<? extends ByteBufferBuilder> var0) {
      short var10001 = -27268;
      short var10002 = 17715;
      Intrinsics.checkNotNullParameter(var0, "allocatorInUse");
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a(var0);
   }

   private static final ByteBufferBuilder a() {
      return new ByteBufferBuilder(786432);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "\u009dØø¯$\u0081\u0019·\u000e\u008dæÕÇ\u0011ÏK}·!18\"\u008f\u000e*ñ!%\u008f\u0093\u0098öÍP~\u0016ËJ";
      int var4 = "\u009dØø¯$\u0081\u0019·\u000e\u008dæÕÇ\u0011ÏK}·!18\"\u008f\u000e*ñ!%\u008f\u0093\u0098öÍP~\u0016ËJ".length();
      char var1 = '\b';
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 12;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 12;
               var10006 = var6;
            } else {
               var13 = 12;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 12;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 108;
                  case 1 -> 24;
                  case 2 -> 69;
                  case 3 -> 27;
                  case 4 -> 12;
                  case 5 -> 58;
                  default -> 30;
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
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIIllllIIIIIIIIlIllIllIIlIIIlIlIlIIIllIIlIlIIIIIIllllIIIllIllIIIlllIllIIllllllllIllll();
            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new ByteBufferBuilder(786432);
            lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new me.octo.client.utils.lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII<ByteBufferBuilder>(
               lIIllllIIIIIIIIlIllIllIIlIIIlIlIlIIIllIIlIlIIIIIIllllIIIllIllIIIlllIllIIllllllllIllll::a,
               lIIllllIIIIIIIIlIllIllIIlIIIlIlIlIIIllIIlIlIIIIIIllllIIIllIllIIIlllIllIIllllllllIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            );
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -27267) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 194;
            case 1 -> 162;
            case 2 -> 109;
            case 3 -> 25;
            case 4 -> 4;
            case 5 -> 251;
            case 6 -> 218;
            case 7 -> 176;
            case 8 -> 18;
            case 9 -> 255;
            case 10 -> 243;
            case 11 -> 100;
            case 12 -> 163;
            case 13 -> 38;
            case 14 -> 39;
            case 15 -> 98;
            case 16 -> 101;
            case 17 -> 81;
            case 18 -> 156;
            case 19 -> 195;
            case 20 -> 125;
            case 21 -> 105;
            case 22 -> 2;
            case 23 -> 221;
            case 24 -> 237;
            case 25 -> 108;
            case 26 -> 82;
            case 27 -> 196;
            case 28 -> 204;
            case 29 -> 122;
            case 30 -> 51;
            case 31 -> 84;
            case 32 -> 121;
            case 33 -> 226;
            case 34 -> 88;
            case 35 -> 15;
            case 36 -> 168;
            case 37 -> 90;
            case 38 -> 69;
            case 39 -> 36;
            case 40 -> 143;
            case 41 -> 124;
            case 42 -> 7;
            case 43 -> 120;
            case 44 -> 111;
            case 45 -> 53;
            case 46 -> 54;
            case 47 -> 170;
            case 48 -> 166;
            case 49 -> 70;
            case 50 -> 89;
            case 51 -> 30;
            case 52 -> 192;
            case 53 -> 48;
            case 54 -> 131;
            case 55 -> 193;
            case 56 -> 50;
            case 57 -> 21;
            case 58 -> 183;
            case 59 -> 115;
            case 60 -> 104;
            case 61 -> 205;
            case 62 -> 172;
            case 63 -> 43;
            case 64 -> 13;
            case 65 -> 200;
            case 66 -> 110;
            case 67 -> 171;
            case 68 -> 92;
            case 69 -> 213;
            case 70 -> 164;
            case 71 -> 151;
            case 72 -> 22;
            case 73 -> 160;
            case 74 -> 139;
            case 75 -> 79;
            case 76 -> 27;
            case 77 -> 225;
            case 78 -> 118;
            case 79 -> 44;
            case 80 -> 146;
            case 81 -> 97;
            case 82 -> 73;
            case 83 -> 222;
            case 84 -> 78;
            case 85 -> 12;
            case 86 -> 23;
            case 87 -> 245;
            case 88 -> 3;
            case 89 -> 129;
            case 90 -> 138;
            case 91 -> 186;
            case 92 -> 209;
            case 93 -> 169;
            case 94 -> 8;
            case 95 -> 91;
            case 96 -> 134;
            case 97 -> 103;
            case 98 -> 240;
            case 99 -> 187;
            case 100 -> 63;
            case 101 -> 57;
            case 102 -> 182;
            case 103 -> 94;
            case 104 -> 199;
            case 105 -> 119;
            case 106 -> 197;
            case 107 -> 202;
            case 108 -> 29;
            case 109 -> 41;
            case 110 -> 206;
            case 111 -> 130;
            case 112 -> 158;
            case 113 -> 80;
            case 114 -> 16;
            case 115 -> 137;
            case 116 -> 145;
            case 117 -> 106;
            case 118 -> 1;
            case 119 -> 5;
            case 120 -> 241;
            case 121 -> 228;
            case 122 -> 253;
            case 123 -> 85;
            case 124 -> 235;
            case 125 -> 155;
            case 126 -> 45;
            case 127 -> 93;
            case 128 -> 184;
            case 129 -> 201;
            case 130 -> 191;
            case 131 -> 148;
            case 132 -> 198;
            case 133 -> 173;
            case 134 -> 149;
            case 135 -> 117;
            case 136 -> 238;
            case 137 -> 71;
            case 138 -> 58;
            case 139 -> 217;
            case 140 -> 112;
            case 141 -> 10;
            case 142 -> 14;
            case 143 -> 181;
            case 144 -> 231;
            case 145 -> 49;
            case 146 -> 52;
            case 147 -> 31;
            case 148 -> 133;
            case 149 -> 42;
            case 150 -> 248;
            case 151 -> 203;
            case 152 -> 142;
            case 153 -> 28;
            case 154 -> 47;
            case 155 -> 35;
            case 156 -> 132;
            case 157 -> 190;
            case 158 -> 136;
            case 159 -> 135;
            case 160 -> 224;
            case 161 -> 214;
            case 162 -> 234;
            case 163 -> 236;
            case 164 -> 177;
            case 165 -> 247;
            case 166 -> 144;
            case 167 -> 175;
            case 168 -> 9;
            case 169 -> 188;
            case 170 -> 68;
            case 171 -> 207;
            case 172 -> 46;
            case 173 -> 208;
            case 174 -> 252;
            case 175 -> 180;
            case 176 -> 189;
            case 177 -> 126;
            case 178 -> 246;
            case 179 -> 123;
            case 180 -> 239;
            case 181 -> 56;
            case 182 -> 141;
            case 183 -> 254;
            case 184 -> 83;
            case 185 -> 87;
            case 186 -> 76;
            case 187 -> 185;
            case 188 -> 244;
            case 189 -> 55;
            case 190 -> 65;
            case 191 -> 227;
            case 192 -> 140;
            case 193 -> 99;
            case 194 -> 223;
            case 195 -> 215;
            case 196 -> 62;
            case 197 -> 6;
            case 198 -> 0;
            case 199 -> 102;
            case 200 -> 11;
            case 201 -> 66;
            case 202 -> 249;
            case 203 -> 34;
            case 204 -> 77;
            case 205 -> 161;
            case 206 -> 210;
            case 207 -> 212;
            case 208 -> 86;
            case 209 -> 220;
            case 210 -> 157;
            case 211 -> 250;
            case 212 -> 72;
            case 213 -> 230;
            case 214 -> 242;
            case 215 -> 37;
            case 216 -> 60;
            case 217 -> 24;
            case 218 -> 159;
            case 219 -> 154;
            case 220 -> 64;
            case 221 -> 216;
            case 222 -> 128;
            case 223 -> 174;
            case 224 -> 17;
            case 225 -> 26;
            case 226 -> 179;
            case 227 -> 75;
            case 228 -> 147;
            case 229 -> 19;
            case 230 -> 211;
            case 231 -> 67;
            case 232 -> 150;
            case 233 -> 74;
            case 234 -> 20;
            case 235 -> 59;
            case 236 -> 32;
            case 237 -> 167;
            case 238 -> 152;
            case 239 -> 153;
            case 240 -> 178;
            case 241 -> 33;
            case 242 -> 61;
            case 243 -> 165;
            case 244 -> 95;
            case 245 -> 127;
            case 246 -> 114;
            case 247 -> 229;
            case 248 -> 107;
            case 249 -> 113;
            case 250 -> 233;
            case 251 -> 219;
            case 252 -> 96;
            case 253 -> 232;
            case 254 -> 116;
            default -> 40;
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll implements kotlin.jvm.functions.Function1<com.mojang.blaze3d.vertex.ByteBufferBuilder, kotlin.Unit> /* PX-FIX: extends FunctionReferenceImpl 泛型冲突（javac 严格），Phase A 复核 */ {
      private static String[] a;
      private static String[] b;
      public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

      public final void a(com.mojang.blaze3d.vertex.ByteBufferBuilder var0) {
         kotlin.jvm.internal.Intrinsics.checkNotNullParameter(var0, "p0");
         var0.clear();
      }

      public kotlin.Unit invoke(com.mojang.blaze3d.vertex.ByteBufferBuilder var0) { return kotlin.Unit.INSTANCE; }

      static { /* PX-FIX clinit Phase A */ }

      private static String a(int var0, int var1) {
         int var2x = (var0 ^ 6598) & 65535;
         if (b[var2x] == null) {
            char[] var3 = a[var2x].toCharArray();

            short var4x = switch (var3[0] & 0xFF) {
            case 0 -> 25;
            case 1 -> 230;
            case 2 -> 104;
            case 3 -> 214;
            case 4 -> 253;
            case 5 -> 184;
            case 6 -> 11;
            case 7 -> 10;
            case 8 -> 237;
            case 9 -> 85;
            case 10 -> 213;
            case 11 -> 116;
            case 12 -> 231;
            case 13 -> 30;
            case 14 -> 185;
            case 15 -> 61;
            case 16 -> 37;
            case 17 -> 212;
            case 18 -> 178;
            case 19 -> 35;
            case 20 -> 26;
            case 21 -> 240;
            case 22 -> 190;
            case 23 -> 169;
            case 24 -> 129;
            case 25 -> 241;
            case 26 -> 47;
            case 27 -> 182;
            case 28 -> 122;
            case 29 -> 57;
            case 30 -> 51;
            case 31 -> 202;
            case 32 -> 109;
            case 33 -> 215;
            case 34 -> 55;
            case 35 -> 234;
            case 36 -> 1;
            case 37 -> 113;
            case 38 -> 14;
            case 39 -> 207;
            case 40 -> 176;
            case 41 -> 21;
            case 42 -> 159;
            case 43 -> 233;
            case 44 -> 33;
            case 45 -> 130;
            case 46 -> 99;
            case 47 -> 18;
            case 48 -> 23;
            case 49 -> 238;
            case 50 -> 117;
            case 51 -> 155;
            case 52 -> 157;
            case 53 -> 235;
            case 54 -> 89;
            case 55 -> 201;
            case 56 -> 245;
            case 57 -> 19;
            case 58 -> 225;
            case 59 -> 142;
            case 60 -> 165;
            case 61 -> 45;
            case 62 -> 118;
            case 63 -> 205;
            case 64 -> 138;
            case 65 -> 236;
            case 66 -> 120;
            case 67 -> 69;
            case 68 -> 198;
            case 69 -> 223;
            case 70 -> 196;
            case 71 -> 168;
            case 72 -> 228;
            case 73 -> 63;
            case 74 -> 162;
            case 75 -> 154;
            case 76 -> 152;
            case 77 -> 150;
            case 78 -> 42;
            case 79 -> 144;
            case 80 -> 70;
            case 81 -> 31;
            case 82 -> 139;
            case 83 -> 210;
            case 84 -> 192;
            case 85 -> 206;
            case 86 -> 186;
            case 87 -> 219;
            case 88 -> 197;
            case 89 -> 64;
            case 90 -> 131;
            case 91 -> 149;
            case 92 -> 148;
            case 93 -> 15;
            case 94 -> 32;
            case 95 -> 127;
            case 96 -> 9;
            case 97 -> 88;
            case 98 -> 208;
            case 99 -> 143;
            case 100 -> 251;
            case 101 -> 87;
            case 102 -> 125;
            case 103 -> 82;
            case 104 -> 16;
            case 105 -> 29;
            case 106 -> 111;
            case 107 -> 135;
            case 108 -> 191;
            case 109 -> 248;
            case 110 -> 52;
            case 111 -> 38;
            case 112 -> 95;
            case 113 -> 115;
            case 114 -> 48;
            case 115 -> 24;
            case 116 -> 252;
            case 117 -> 179;
            case 118 -> 67;
            case 119 -> 66;
            case 120 -> 224;
            case 121 -> 36;
            case 122 -> 132;
            case 123 -> 27;
            case 124 -> 86;
            case 125 -> 203;
            case 126 -> 136;
            case 127 -> 183;
            case 128 -> 140;
            case 129 -> 209;
            case 130 -> 108;
            case 131 -> 13;
            case 132 -> 239;
            case 133 -> 255;
            case 134 -> 145;
            case 135 -> 34;
            case 136 -> 121;
            case 137 -> 0;
            case 138 -> 229;
            case 139 -> 167;
            case 140 -> 7;
            case 141 -> 98;
            case 142 -> 243;
            case 143 -> 222;
            case 144 -> 188;
            case 145 -> 94;
            case 146 -> 174;
            case 147 -> 92;
            case 148 -> 172;
            case 149 -> 244;
            case 150 -> 102;
            case 151 -> 133;
            case 152 -> 181;
            case 153 -> 12;
            case 154 -> 46;
            case 155 -> 173;
            case 156 -> 53;
            case 157 -> 200;
            case 158 -> 79;
            case 159 -> 189;
            case 160 -> 220;
            case 161 -> 5;
            case 162 -> 68;
            case 163 -> 56;
            case 164 -> 22;
            case 165 -> 193;
            case 166 -> 227;
            case 167 -> 8;
            case 168 -> 84;
            case 169 -> 54;
            case 170 -> 175;
            case 171 -> 43;
            case 172 -> 126;
            case 173 -> 20;
            case 174 -> 153;
            case 175 -> 119;
            case 176 -> 187;
            case 177 -> 72;
            case 178 -> 2;
            case 179 -> 195;
            case 180 -> 101;
            case 181 -> 91;
            case 182 -> 242;
            case 183 -> 28;
            case 184 -> 249;
            case 185 -> 194;
            case 186 -> 199;
            case 187 -> 103;
            case 188 -> 40;
            case 189 -> 110;
            case 190 -> 107;
            case 191 -> 141;
            case 192 -> 204;
            case 193 -> 73;
            case 194 -> 137;
            case 195 -> 226;
            case 196 -> 78;
            case 197 -> 3;
            case 198 -> 170;
            case 199 -> 39;
            case 200 -> 177;
            case 201 -> 114;
            case 202 -> 218;
            case 203 -> 60;
            case 204 -> 90;
            case 205 -> 77;
            case 206 -> 216;
            case 207 -> 158;
            case 208 -> 80;
            case 209 -> 221;
            case 210 -> 166;
            case 211 -> 246;
            case 212 -> 124;
            case 213 -> 134;
            case 214 -> 146;
            case 215 -> 83;
            case 216 -> 74;
            case 217 -> 17;
            case 218 -> 4;
            case 219 -> 71;
            case 220 -> 100;
            case 221 -> 49;
            case 222 -> 58;
            case 223 -> 250;
            case 224 -> 161;
            case 225 -> 160;
            case 226 -> 96;
            case 227 -> 151;
            case 228 -> 171;
            case 229 -> 59;
            case 230 -> 164;
            case 231 -> 50;
            case 232 -> 62;
            case 233 -> 105;
            case 234 -> 254;
            case 235 -> 156;
            case 236 -> 247;
            case 237 -> 97;
            case 238 -> 93;
            case 239 -> 76;
            case 240 -> 128;
            case 241 -> 112;
            case 242 -> 123;
            case 243 -> 232;
            case 244 -> 75;
            case 245 -> 44;
            case 246 -> 106;
            case 247 -> 163;
            case 248 -> 180;
            case 249 -> 211;
            case 250 -> 6;
            case 251 -> 41;
            case 252 -> 147;
            case 253 -> 217;
            case 254 -> 65;
            default -> 57;
         };
            int var5x = (var1 & 0xFF) - var4x;
            if (var5x < 0) {
               var5x += 256;
            }

            int var6 = ((var1 & 65535) >>> 8) - var4x;
            if (var6 < 0) {
               var6 += 256;
            }

            for (int var7 = 0; var7 < var3.length; var7++) {
               int var8x = var7 % 2;
               char var10002x = var3[var7];
               if (var8x == 0) {
                  var3[var7] = (char)(var10002x ^ var5x);
                  var5x = ((var5x >>> 3 | var5x << 5) ^ var3[var7]) & 0xFF;
               } else {
                  var3[var7] = (char)(var10002x ^ var6);
                  var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
               }
            }

            b[var2x] = new String(var3).intern();
         }

         return b[var2x];
      }

   }
}
