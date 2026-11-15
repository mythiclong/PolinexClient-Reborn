package me.octo.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIllIlIIIIlIIIIllllIIlllllIIIIIIlIlllIIIIlIIlIlIIIIllIIlIllIIllIlIlllIllllllllIIIIlll {
   public static int var10 = 0; // PX-FIX (retyped int) missing field v2
   
   @NotNull
   public static lIllIlIIIIlIIIIllllIIlllllIIIIIIlIlllIIIIlIIlIlIIIIllIIlIllIIllIlIlllIllllllllIIIIlll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Regex lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] a;
   private static String[] b;

   private lIllIlIIIIlIIIIllllIIlllllIIIIIIlIlllIIIIlIIlIlIIIIllIIlIllIIllIlIlllIllllllllIIIIlll() {
   }

   @NotNull
   public final List<lIllIlIIIIlIIIIllllIIlllllIIIIIIlIlllIIIIlIIlIlIIIIllIIlIllIIllIlIlllIllllllllIIIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> a(
      @NotNull String var1
   ) {
      int var20 = 0; // PX-FIX
      String var10000 = llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.u();
      short var10002 = 25961;
      short var10003 = 15536;
      Intrinsics.checkNotNullParameter(var1, "synced");
      String var2 = var10000;
      List var3 = new ArrayList();

      label58:
      for (String var5 : StringsKt.lines(var1)) {
         List var6 = SequencesKt.toList(
            (lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII).findAll( var5, 0)
         );
         if (var2 == null || !var6.isEmpty()) {
            var10000 = var5.substring(((MatchResult)CollectionsKt.last(var6)).getRange().getLast() + 1);
            String var10001 = var10000;

            while (true) {
               var10002 = 25960;
               var10003 = -7362;
               Intrinsics.checkNotNullExpressionValue(var10001, "substring(...)");
               String var7 = StringsKt.trim(var10000).toString();
               Iterator var8 = var6.iterator();

               while (true) {
                  if (!var8.hasNext()) {
                     continue label58;
                  }

                  int var10;
                  int var11;
                  label51: {
                     MatchResult var9 = (MatchResult)var8.next();
                     var10 = Integer.parseInt((String)var9.getGroupValues().get(1));
                     var11 = Integer.parseInt((String)var9.getGroupValues().get(2));
                     if (var2 != null) {
                        var10000 = (String)CollectionsKt.getOrNull(var9.getGroupValues(), 3);
                        var10001 = var10000;
                        if (var2 == null || var2 == null) {
                           break;
                        }

                        if (var10000 != null) {
                           break label51;
                        }
                     }

                     var10000 = "";
                  }

                  label44: {
                     String var12 = var10000;
                     var10000 = var12;
                     if (var2 != null) {
                        switch (var12.length()) {
                           case 0:
                              var20 = 0;
                              break label44;
                           case 1:
                              var20 = Integer.parseInt(var12) * 100;
                              break label44;
                           case 2:
                              var20 = Integer.parseInt(var12) * 10;
                              break label44;
                           default:
                              var10000 = var12.substring(0, 3);
                              var10002 = 25962;
                              var10003 = 20766;
                              Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
                        }
                     }

                     var20 = Integer.parseInt(var10000);
                  }

                  int var13 = var20;
                  long var14 = (var10 * 60L + var11) * 1000L + var13;
                  var3.add(
                     new lIllIlIIIIlIIIIllllIIlllllIIIIIIlIlllIIIIlIIlIlIIIIllIIlIllIIllIlIlllIllllllllIIIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        var14, var7
                     )
                  );
                  if (var2 == null) {
                     break label58;
                  }
               }
            }
         }
      }

      Iterable var16 = var3;
      boolean var17 = false;
      return CollectionsKt.sortedWith(
         var16,
         new lIllIlIIIIlIIIIllllIIlllllIIIIIIlIlllIIIIlIIlIlIIIIllIIlIllIIllIlIlllIllllllllIIIIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI()
      );
   }

   public final int a(
      @NotNull List<lIllIlIIIIlIIIIllllIIlllllIIIIIIlIlllIIIIlIIlIlIIIIllIIlIllIIllIlIlllIllllllllIIIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> var1,
      long var2
   ) {
      String var10000 = llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.u();
      short var10002 = 25963;
      short var10003 = 17798;
      Intrinsics.checkNotNullParameter(var1, "lines");
      String var4 = var10000;
      byte var9 = ((byte)((var1.isEmpty()) ? 1 : 0));
      if (var4 != null) {
         if (var9 != 0) {
            return -1;
         }

         var9 = 0;
      }

      int var5 = var9;
      int var6 = var1.size() - 1;
      int var7 = -1;

      while (true) {
         if (var5 <= var6) {
            int var8 = var5 + var6 >>> 1;
            long var11;
            var10 = (
                     var11 = ((lIllIlIIIIlIIIIllllIIlllllIIIIIIlIlllIIIIlIIlIlIIIIllIIlIllIIllIlIlllIllllllllIIIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var1.get(
                              var8
                           ))
                           .a()
                        - var2
                  )
                  == 0L
               ? 0
               : (var11 < 0L ? -1 : 1);
            if (var4 == null) {
               break;
            }

            if (var4 != null) {
               if (var10 <= 0) {
                  var7 = var8;
                  var5 = var8 + 1;
                  if (var4 != null) {
                     continue;
                  }
               }

               var10 = var8 - 1;
            }

            var6 = var10;
            if (var4 != null) {
               continue;
            }
         }

         var10 = var7;
         break;
      }

      return var10;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[5];
      int var3 = 0;
      String var2 = "VPð\u001c\u0093¾¼fB\u0002S\u0094ý\r\u0006&åò7Oß\u000e\u0012\u001axU\u0082\u0097\u009eC\u0006¦Û\u0000ì\u009f";
      int var4 = "VPð\u001c\u0093¾¼fB\u0002S\u0094ý\r\u0006&åò7Oß\u000e\u0012\u001axU\u0082\u0097\u009eC\u0006¦Û\u0000ì\u009f".length();
      char var1 = 14;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 112;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var25 = var10001.toCharArray();
               int var10004 = var25.length;
               int var6 = 0;
               byte var28 = var10000;
               var20 = var25;
               int var14 = var10004;
               byte var34;
               char[] var38;
               int var10006;
               if (var10004 <= 1) {
                  var38 = var25;
                  var34 = var10000;
                  var10006 = var6;
               } else {
                  var28 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var38 = var25;
                  var34 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var38[var10006] = (char)(var38[var10006] ^ var34 ^ switch (var6 % 7) {
                     case 0 -> 57;
                     case 1 -> 68;
                     case 2 -> 28;
                     case 3 -> 72;
                     case 4 -> 42;
                     case 5 -> 37;
                     default -> 102;
                  });
                  var6++;
                  if (var28 == 0) {
                     var10006 = var28;
                     var38 = var20;
                     var34 = var28;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var38 = var20;
                     var34 = var28;
                     var10006 = var6;
                  }
               }
            }

            String var30 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var30;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[5];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIllIlIIIIlIIIIllllIIlllllIIIIIIlIlllIIIIlIIlIlIIIIllIIlIllIIllIlIlllIllllllllIIIIlll();
                     var10002 = 25964;
                     short var31 = 26253;
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new Regex(
                        "\\[(\\d{1,2}):(\\d{2})(?:\\.(\\d{1,3}))?]"
                     );
                     break label52;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var30;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "\u0003ºÒ°%$\u0085\u0010r¨¨\u0093éÑ\u0096ÓI='£6V!eÖ|Ì\u0003\u0093\u000eKÙ\n²\u0003ày\u000eü\u0010\u0089È";
                  var4 = "\u0003ºÒ°%$\u0085\u0010r¨¨\u0093éÑ\u0096ÓI='£6V!eÖ|Ì\u0003\u0093\u000eKÙ\n²\u0003ày\u000eü\u0010\u0089È".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 107;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 25960) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 135;
            case 1 -> 77;
            case 2 -> 69;
            case 3 -> 89;
            case 4 -> 200;
            case 5 -> 219;
            case 6 -> 60;
            case 7 -> 202;
            case 8 -> 49;
            case 9 -> 185;
            case 10 -> 239;
            case 11 -> 63;
            case 12 -> 38;
            case 13 -> 122;
            case 14 -> 84;
            case 15 -> 92;
            case 16 -> 123;
            case 17 -> 177;
            case 18 -> 10;
            case 19 -> 88;
            case 20 -> 201;
            case 21 -> 179;
            case 22 -> 29;
            case 23 -> 23;
            case 24 -> 86;
            case 25 -> 244;
            case 26 -> 65;
            case 27 -> 240;
            case 28 -> 190;
            case 29 -> 191;
            case 30 -> 120;
            case 31 -> 210;
            case 32 -> 68;
            case 33 -> 144;
            case 34 -> 100;
            case 35 -> 25;
            case 36 -> 98;
            case 37 -> 181;
            case 38 -> 242;
            case 39 -> 126;
            case 40 -> 192;
            case 41 -> 171;
            case 42 -> 150;
            case 43 -> 235;
            case 44 -> 71;
            case 45 -> 27;
            case 46 -> 16;
            case 47 -> 83;
            case 48 -> 121;
            case 49 -> 228;
            case 50 -> 8;
            case 51 -> 13;
            case 52 -> 149;
            case 53 -> 221;
            case 54 -> 164;
            case 55 -> 26;
            case 56 -> 37;
            case 57 -> 131;
            case 58 -> 109;
            case 59 -> 108;
            case 60 -> 141;
            case 61 -> 156;
            case 62 -> 230;
            case 63 -> 160;
            case 64 -> 5;
            case 65 -> 105;
            case 66 -> 74;
            case 67 -> 30;
            case 68 -> 116;
            case 69 -> 101;
            case 70 -> 209;
            case 71 -> 102;
            case 72 -> 66;
            case 73 -> 17;
            case 74 -> 243;
            case 75 -> 72;
            case 76 -> 129;
            case 77 -> 52;
            case 78 -> 82;
            case 79 -> 9;
            case 80 -> 41;
            case 81 -> 73;
            case 82 -> 175;
            case 83 -> 36;
            case 84 -> 111;
            case 85 -> 184;
            case 86 -> 220;
            case 87 -> 113;
            case 88 -> 125;
            case 89 -> 172;
            case 90 -> 224;
            case 91 -> 246;
            case 92 -> 22;
            case 93 -> 187;
            case 94 -> 90;
            case 95 -> 166;
            case 96 -> 59;
            case 97 -> 97;
            case 98 -> 46;
            case 99 -> 215;
            case 100 -> 45;
            case 101 -> 159;
            case 102 -> 212;
            case 103 -> 248;
            case 104 -> 54;
            case 105 -> 67;
            case 106 -> 151;
            case 107 -> 222;
            case 108 -> 247;
            case 109 -> 139;
            case 110 -> 157;
            case 111 -> 148;
            case 112 -> 104;
            case 113 -> 64;
            case 114 -> 55;
            case 115 -> 62;
            case 116 -> 176;
            case 117 -> 168;
            case 118 -> 33;
            case 119 -> 253;
            case 120 -> 241;
            case 121 -> 106;
            case 122 -> 53;
            case 123 -> 229;
            case 124 -> 75;
            case 125 -> 99;
            case 126 -> 231;
            case 127 -> 31;
            case 128 -> 234;
            case 129 -> 174;
            case 130 -> 20;
            case 131 -> 195;
            case 132 -> 110;
            case 133 -> 42;
            case 134 -> 40;
            case 135 -> 15;
            case 136 -> 127;
            case 137 -> 251;
            case 138 -> 80;
            case 139 -> 153;
            case 140 -> 81;
            case 141 -> 124;
            case 142 -> 6;
            case 143 -> 61;
            case 144 -> 193;
            case 145 -> 197;
            case 146 -> 76;
            case 147 -> 167;
            case 148 -> 94;
            case 149 -> 44;
            case 150 -> 114;
            case 151 -> 161;
            case 152 -> 118;
            case 153 -> 140;
            case 154 -> 154;
            case 155 -> 245;
            case 156 -> 85;
            case 157 -> 152;
            case 158 -> 205;
            case 159 -> 103;
            case 160 -> 24;
            case 161 -> 237;
            case 162 -> 119;
            case 163 -> 70;
            case 164 -> 91;
            case 165 -> 57;
            case 166 -> 206;
            case 167 -> 93;
            case 168 -> 173;
            case 169 -> 145;
            case 170 -> 207;
            case 171 -> 4;
            case 172 -> 112;
            case 173 -> 50;
            case 174 -> 21;
            case 175 -> 132;
            case 176 -> 133;
            case 177 -> 87;
            case 178 -> 204;
            case 179 -> 188;
            case 180 -> 249;
            case 181 -> 218;
            case 182 -> 146;
            case 183 -> 236;
            case 184 -> 1;
            case 185 -> 170;
            case 186 -> 11;
            case 187 -> 194;
            case 188 -> 142;
            case 189 -> 107;
            case 190 -> 196;
            case 191 -> 226;
            case 192 -> 58;
            case 193 -> 214;
            case 194 -> 254;
            case 195 -> 39;
            case 196 -> 3;
            case 197 -> 213;
            case 198 -> 128;
            case 199 -> 252;
            case 200 -> 96;
            case 201 -> 18;
            case 202 -> 203;
            case 203 -> 199;
            case 204 -> 178;
            case 205 -> 225;
            case 206 -> 19;
            case 207 -> 183;
            case 208 -> 255;
            case 209 -> 79;
            case 210 -> 47;
            case 211 -> 182;
            case 212 -> 78;
            case 213 -> 250;
            case 214 -> 0;
            case 215 -> 2;
            case 216 -> 14;
            case 217 -> 162;
            case 218 -> 136;
            case 219 -> 189;
            case 220 -> 137;
            case 221 -> 227;
            case 222 -> 117;
            case 223 -> 216;
            case 224 -> 7;
            case 225 -> 147;
            case 226 -> 134;
            case 227 -> 43;
            case 228 -> 12;
            case 229 -> 28;
            case 230 -> 180;
            case 231 -> 163;
            case 232 -> 232;
            case 233 -> 155;
            case 234 -> 32;
            case 235 -> 51;
            case 236 -> 233;
            case 237 -> 48;
            case 238 -> 223;
            case 239 -> 95;
            case 240 -> 34;
            case 241 -> 198;
            case 242 -> 169;
            case 243 -> 211;
            case 244 -> 217;
            case 245 -> 56;
            case 246 -> 143;
            case 247 -> 115;
            case 248 -> 165;
            case 249 -> 130;
            case 250 -> 138;
            case 251 -> 238;
            case 252 -> 158;
            case 253 -> 186;
            case 254 -> 208;
            default -> 35;
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private final long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(long var1, @NotNull String var3) {
         short var10001 = -19892;
         short var10002 = 11279;
         Intrinsics.checkNotNullParameter(var3, "text");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var3;
      }

      public final long a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final String b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final long c() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final String d() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final lIllIlIIIIlIIIIllllIIlllllIIIIIIlIlllIIIIlIIlIlIIIIllIIlIllIIllIlIlllIllllllllIIIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         long var1, @NotNull String var3
      ) {
         short var10001 = -19890;
         short var10002 = 17362;
         Intrinsics.checkNotNullParameter(var3, "text");
         return new lIllIlIIIIlIIIIllllIIlllllIIIIIIlIlllIIIIlIIlIlIIIIllIIlIllIIllIlIlllIllllllllIIIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -19891;
         String var1 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         long var2 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 30881;
         short var10002 = -19889;
         short var10003 = -17271;
         return "LrcLine(timeMs=" + var2 + ", text=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Long.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         return var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.u();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof lIllIlIIIIlIIIIllllIIlllllIIIIIIlIlllIIIIlIIlIlIIIIllIIlIllIIllIlIlllIllllllllIIIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIllIlIIIIlIIIIllllIIlllllIIIIIIlIlllIIIIlIIlIlIIIIllIIlIllIIllIlIlllIllllllllIIIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (lIllIlIIIIlIIIIllllIIlllllIIIIIIlIlllIIIIlIIlIlIIIIllIIlIllIIllIlIlllIllllllllIIIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         long var5;
         int var4 = (
                  var5 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     - var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               )
               == 0L
            ? 0
            : (var5 < 0L ? -1 : 1);
         if (var2 != null) {
            if ((var4 != 0)) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if ((var4 == 0)) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[4];
         int var3 = 0;
         String var2 = "×E\u0099\u009d\u0007À\u008b$¸Ì\u008eJ";
         int var4 = "×E\u0099\u009d\u0007À\u008b$¸Ì\u008eJ".length();
         char var1 = 4;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 42;
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
                        case 0 -> 76;
                        case 1 -> 60;
                        case 2 -> 7;
                        case 3 -> 96;
                        case 4 -> 69;
                        case 5 -> 71;
                        default -> 94;
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

                     var2 = "c?H\u0095\u000f;Ngv\u0007\u0006\u001fÇ\u0081\u001ahïã\u0099)";
                     var4 = "c?H\u0095\u000f;Ngv\u0007\u0006\u001fÇ\u0081\u001ahïã\u0099)".length();
                     var1 = 4;
                     var8 = -1;
               }

               var10000 = 9;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -19890) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 129;
               case 1 -> 9;
               case 2 -> 176;
               case 3 -> 151;
               case 4 -> 139;
               case 5 -> 254;
               case 6 -> 200;
               case 7 -> 204;
               case 8 -> 175;
               case 9 -> 52;
               case 10 -> 130;
               case 11 -> 196;
               case 12 -> 68;
               case 13 -> 181;
               case 14 -> 102;
               case 15 -> 141;
               case 16 -> 180;
               case 17 -> 14;
               case 18 -> 171;
               case 19 -> 94;
               case 20 -> 220;
               case 21 -> 193;
               case 22 -> 153;
               case 23 -> 215;
               case 24 -> 142;
               case 25 -> 110;
               case 26 -> 44;
               case 27 -> 167;
               case 28 -> 22;
               case 29 -> 177;
               case 30 -> 70;
               case 31 -> 62;
               case 32 -> 10;
               case 33 -> 226;
               case 34 -> 23;
               case 35 -> 60;
               case 36 -> 144;
               case 37 -> 55;
               case 38 -> 189;
               case 39 -> 6;
               case 40 -> 131;
               case 41 -> 162;
               case 42 -> 93;
               case 43 -> 216;
               case 44 -> 120;
               case 45 -> 156;
               case 46 -> 242;
               case 47 -> 0;
               case 48 -> 11;
               case 49 -> 73;
               case 50 -> 20;
               case 51 -> 248;
               case 52 -> 199;
               case 53 -> 165;
               case 54 -> 197;
               case 55 -> 233;
               case 56 -> 150;
               case 57 -> 232;
               case 58 -> 191;
               case 59 -> 208;
               case 60 -> 2;
               case 61 -> 16;
               case 62 -> 246;
               case 63 -> 124;
               case 64 -> 127;
               case 65 -> 164;
               case 66 -> 58;
               case 67 -> 53;
               case 68 -> 185;
               case 69 -> 249;
               case 70 -> 219;
               case 71 -> 173;
               case 72 -> 169;
               case 73 -> 5;
               case 74 -> 103;
               case 75 -> 109;
               case 76 -> 39;
               case 77 -> 97;
               case 78 -> 251;
               case 79 -> 31;
               case 80 -> 67;
               case 81 -> 228;
               case 82 -> 41;
               case 83 -> 158;
               case 84 -> 18;
               case 85 -> 57;
               case 86 -> 231;
               case 87 -> 82;
               case 88 -> 80;
               case 89 -> 222;
               case 90 -> 186;
               case 91 -> 168;
               case 92 -> 202;
               case 93 -> 235;
               case 94 -> 143;
               case 95 -> 114;
               case 96 -> 247;
               case 97 -> 33;
               case 98 -> 152;
               case 99 -> 136;
               case 100 -> 172;
               case 101 -> 161;
               case 102 -> 179;
               case 103 -> 224;
               case 104 -> 148;
               case 105 -> 207;
               case 106 -> 163;
               case 107 -> 32;
               case 108 -> 34;
               case 109 -> 252;
               case 110 -> 3;
               case 111 -> 77;
               case 112 -> 43;
               case 113 -> 253;
               case 114 -> 37;
               case 115 -> 170;
               case 116 -> 106;
               case 117 -> 40;
               case 118 -> 234;
               case 119 -> 24;
               case 120 -> 166;
               case 121 -> 146;
               case 122 -> 218;
               case 123 -> 29;
               case 124 -> 250;
               case 125 -> 38;
               case 126 -> 111;
               case 127 -> 54;
               case 128 -> 217;
               case 129 -> 147;
               case 130 -> 89;
               case 131 -> 133;
               case 132 -> 237;
               case 133 -> 187;
               case 134 -> 66;
               case 135 -> 135;
               case 136 -> 79;
               case 137 -> 210;
               case 138 -> 221;
               case 139 -> 230;
               case 140 -> 69;
               case 141 -> 86;
               case 142 -> 211;
               case 143 -> 132;
               case 144 -> 145;
               case 145 -> 182;
               case 146 -> 174;
               case 147 -> 239;
               case 148 -> 178;
               case 149 -> 198;
               case 150 -> 63;
               case 151 -> 122;
               case 152 -> 243;
               case 153 -> 137;
               case 154 -> 240;
               case 155 -> 236;
               case 156 -> 238;
               case 157 -> 64;
               case 158 -> 42;
               case 159 -> 244;
               case 160 -> 78;
               case 161 -> 149;
               case 162 -> 213;
               case 163 -> 1;
               case 164 -> 17;
               case 165 -> 15;
               case 166 -> 255;
               case 167 -> 96;
               case 168 -> 125;
               case 169 -> 48;
               case 170 -> 195;
               case 171 -> 7;
               case 172 -> 108;
               case 173 -> 90;
               case 174 -> 91;
               case 175 -> 88;
               case 176 -> 123;
               case 177 -> 13;
               case 178 -> 140;
               case 179 -> 50;
               case 180 -> 214;
               case 181 -> 8;
               case 182 -> 35;
               case 183 -> 121;
               case 184 -> 75;
               case 185 -> 154;
               case 186 -> 59;
               case 187 -> 26;
               case 188 -> 138;
               case 189 -> 65;
               case 190 -> 160;
               case 191 -> 159;
               case 192 -> 112;
               case 193 -> 104;
               case 194 -> 192;
               case 195 -> 183;
               case 196 -> 4;
               case 197 -> 19;
               case 198 -> 95;
               case 199 -> 28;
               case 200 -> 72;
               case 201 -> 84;
               case 202 -> 128;
               case 203 -> 83;
               case 204 -> 241;
               case 205 -> 113;
               case 206 -> 81;
               case 207 -> 134;
               case 208 -> 36;
               case 209 -> 49;
               case 210 -> 98;
               case 211 -> 206;
               case 212 -> 101;
               case 213 -> 117;
               case 214 -> 61;
               case 215 -> 74;
               case 216 -> 184;
               case 217 -> 92;
               case 218 -> 203;
               case 219 -> 188;
               case 220 -> 107;
               case 221 -> 47;
               case 222 -> 116;
               case 223 -> 223;
               case 224 -> 71;
               case 225 -> 30;
               case 226 -> 87;
               case 227 -> 100;
               case 228 -> 56;
               case 229 -> 76;
               case 230 -> 229;
               case 231 -> 205;
               case 232 -> 51;
               case 233 -> 115;
               case 234 -> 201;
               case 235 -> 212;
               case 236 -> 194;
               case 237 -> 45;
               case 238 -> 225;
               case 239 -> 85;
               case 240 -> 118;
               case 241 -> 119;
               case 242 -> 190;
               case 243 -> 25;
               case 244 -> 209;
               case 245 -> 227;
               case 246 -> 245;
               case 247 -> 157;
               case 248 -> 27;
               case 249 -> 21;
               case 250 -> 155;
               case 251 -> 126;
               case 252 -> 12;
               case 253 -> 99;
               case 254 -> 105;
               default -> 46;
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
         public static me.octo.client.lIllIlIIIIlIIIIllllIIlllllIIIIIIlIlllIIIIlIIlIlIIIIllIIlIllIIllIlIlllIllllllllIIIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(me.octo.client.lIllIlIIIIlIIIIllllIIlllllIIIIIIlIlllIIIIlIIlIlIIIIllIIlIllIIllIlIlllIllllllllIIIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll p0, long p1, java.lang.String p2, int mask, java.lang.Object marker) {
         if ((mask & 1) != 0) { p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
         if ((mask & 2) != 0) { p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
         return p0.a(p1, p2);
      }
}
}
