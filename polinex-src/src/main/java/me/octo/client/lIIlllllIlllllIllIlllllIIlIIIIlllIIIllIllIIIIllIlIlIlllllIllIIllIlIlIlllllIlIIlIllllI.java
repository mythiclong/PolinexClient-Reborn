package me.octo.client;

import java.util.List;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIlllllIlllllIllIlllllIIlIIIIlllIIIllIllIIIIllIlIlIlllllIllIIllIlIlIlllllIlIIlIllllI
   implements lIIIlIllIllIIIllIIIlIlllllllIlIlllIIlIIllIIIIlIIlIllllllllllIllIlIlIIlllIlIIIIIllIlII {
   @NotNull
   public static lIIlllllIlllllIllIlllllIIlIIIIlllIIIllIllIIIIllIlIlIlllllIllIIllIlIlIlllllIlIIlIllllI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @Nullable
   private static volatile Boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String[] a;
   private static String[] b;

   private lIIlllllIlllllIllIlllllIIlIIIIlllIIIllIllIIIIllIlIlIlllllIllIIllIlIlIlllllIlIIlIllllI() {
   }

   public boolean a() {
      try {
         boolean var1 = new ProcessBuilder(new String[]{"playerctl", "--version"}).redirectErrorStream(true).start().waitFor(800L, java.util.concurrent.TimeUnit.MILLISECONDS);
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
         return var1;
      } catch (Exception var3) {
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = Boolean.valueOf(false);
         return false;
      }
   }

   @Nullable
   public llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll b() {
      String var25 = null; // PX-FIX
      Long var23 = null; // PX-FIX
      Long var21 = null; // PX-FIX
      String var1 = llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.u();
      lIIlllllIlllllIllIlllllIIlIIIIlllIIIllIllIIIIllIlIlIlllllIllIIllIlIlIlllllIlIIlIllllI var10000 = this;
      if (var1 != null) {
         if (!this.a()) {
            return null;
         }

         var10000 = this;
      }

      String[] var4 = new String[3];
      short var10003 = 10320;
      short var10004 = 19357;
      var4[0] = "metadata";
      var10003 = 10325;
      var10004 = 23337;
      var4[1] = "--format";
      var10003 = 10333;
      var10004 = 28169;
      var4[2] = "{{artist}}\t{{title}}\t{{album}}\t{{mpris:length}}\t{{position}}\t{{status}}\t{{playerName}}\t{{xesam:url}}";
      String var16 = var10000.a(var4);
      if (var16 == null) {
         return null;
      } else {
         String var2 = var16;
         CharSequence var17 = var2;
         if (var1 != null) {
            if (StringsKt.isBlank(var17)) {
               return null;
            }

            var17 = var2;
         }

         char[] var14 = new char[]{'\t'};
         List var3 = (StringsKt.split(var17, var14, false, 0));
         Long var18 = ((Long)(Object)(var3));
         if (var1 != null) {
            if (var3.size() < 7) {
               return null;
            }

            var18 = (Long)var3.get(0);
         }

         String var18x = (String)(Object)var18;
         String var15 = StringsKt.trim((String & CharSequence)var18x).toString();
         String var5 = StringsKt.trim((String & CharSequence)var3.get(1)).toString();
         int var19 = var5.length();
         if (var1 != null) {
            var19 = var19 == 0 ? 1 : 0;
         }

         if (var19 != 0) {
            return null;
         } else {
            String var6;
            label67: {
               var6 = StringsKt.trim((String & CharSequence)var3.get(2)).toString();
               if (var1 != null) {
                  var18 = StringsKt.toLongOrNull(StringsKt.trim((String & CharSequence)var3.get(3)).toString());
                  if (var18 != null) {
                     var21 = var18;
                     break label67;
                  }
               }

               var21 = 0L;
            }

            long var7;
            label61: {
               var7 =((Long)( var21));
               if (var1 != null) {
                  var18 = StringsKt.toLongOrNull(StringsKt.trim((String & CharSequence)var3.get(4)).toString());
                  if (var18 != null) {
                     var23 = var18;
                     break label61;
                  }
               }

               var23 = 0L;
            }

            long var9;
            String var11;
            String var12;
            label55: {
               var9 = var23;
               var11 = StringsKt.trim((String & CharSequence)var3.get(5)).toString();
               var12 = StringsKt.trim((String & CharSequence)var3.get(6)).toString();
               var18 = ((Long)(Object)(var3));
               if (var1 != null) {
                  if (var3.size() < 8) {
                     var25 = "";
                     break label55;
                  }

                  var18 = (Long)var3.get(7);
               }

               String var18y = (String)(Object)var18;
               var25 = StringsKt.trim((String & CharSequence)var18y).toString();
            }

            String var13 = var25;
            long var10005 = var7 / 1000L;
            long var10006 = var9 / 1000L;
            short var10008 = 10327;
            short var10009 = 21104;
            return new llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll(
               var15, var5, var6, var10005, var10006, StringsKt.equals(var11, "Playing", true), var12, var13, null, 256, null
            );
         }
      }
   }

   public void c() {
      String[] var1 = new String[1];
      short var10003 = 10332;
      short var10004 = 12121;
      var1[0] = "play-pause";
      this.a(var1);
   }

   public void d() {
      String[] var1 = new String[1];
      short var10003 = 10326;
      short var10004 = 11222;
      var1[0] = "next";
      this.a(var1);
   }

   public void e() {
      String[] var1 = new String[1];
      short var10003 = 10335;
      short var10004 = -3004;
      var1[0] = "previous";
      this.a(var1);
   }

   public void f() {
      String[] var1 = new String[2];
      short var10003 = 10334;
      short var10004 = -22241;
      var1[0] = "position";
      var1[1] = "0";
      this.a(var1);
   }

   public void a(long var1) {
      long var9 = 0; // PX-FIX
      String var10;
      label24: {
         label26: {
            var10 = llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.u();
            long var4 = var1 / 1000L;
            String var3 = var10;
            long var11;
            int var8 = (var11 = var4 - 0L) == 0L ? 0 : (var11 < 0L ? -1 : 1);
            if (var3 != null) {
               if (var8 == 0) {
                  return;
               }

               var9 = var4;
               if (var3 == null) {
                  break label26;
               }

               long var12;
               var8 = (var12 = var4 - 0L) == 0L ? 0 : (var12 < 0L ? -1 : 1);
            }

            if (var8 > 0) {
               var10 = var4 + "+";
               break label24;
            }

            var9 = -var4;
         }

         var10 = var9 + "-";
      }

      String var6 = var10;
      String[] var7 = new String[2];
      short var10003 = 10328;
      short var10004 = -7145;
      var7[0] = "position";
      var7[1] = var6;
      this.a(var7);
   }

   private final String a(String... param1) {
      try {
         java.util.List var1 = kotlin.collections.CollectionsKt.mutableListOf(new String[]{"playerctl"});
         kotlin.collections.CollectionsKt.addAll(var1, param1);
         Process var2 = new ProcessBuilder(var1).redirectErrorStream(true).start();
         if (var2.waitFor(700L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
            return null;
         }
         java.io.Reader var3 = new java.io.InputStreamReader(var2.getInputStream(), kotlin.text.Charsets.UTF_8);
         java.io.Reader var4 = var3 instanceof java.io.BufferedReader ? var3 : new java.io.BufferedReader(var3, 8192);
         return kotlin.text.StringsKt.trimEnd(kotlin.io.TextStreamsKt.readText(var4)).toString();
      } catch (Exception var5) {
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("playerctl invocation failed: " + var5.getMessage());
         return null;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var22 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[15];
      int var3 = 0;
      String var2 = "wíÀP\u0007~*\u0001\u008d\u0095âu\ta6'{¿¾FÜ\u0015\b.®Þb\u0092ÈëÔ\u0013¯\u0014ÿRú1mUÒÑA4\u001eÆßÁ\r\u00adòdWÇjÎåçÑµ\u00adÄ> ÿ\u0090ûk¢¢Y\u008b\u0014¡&´ì(b¢\u0093\u001e\\:IU©aÕ\u0096\u00942á-ë\u0085kgä\\Ñ¡©ºh-\u000fl\rP«\u0084?RPT\u009d\u0003mÉO{ðCBk½~L.V\u0014\u001dN\"\u0005\u0080ã>\u0085\u0005·5\u008bùô\u0018ºg\u0004Ôë\b¨0Tþ\u0085\u0098ÈF\tþ05Î\u001f\u0096\u00adã!\bÆ\t \u009aü\u0015îñ\bvj W5VsB\n\u0005\u0081Jø¸R\u001a8\u008aLd4\u0011\u0006\u0014h¼`Þ\u009b©ø\r'%àÝÁt5Q\u0099ú\u0097ßÚE¤\u000fK«G\u008c*\u0083Å»XÍ%Y×@-(³Òÿê²wÅ`åv¾\u0007;=m)ççKâþÕ\u0001\u0013Â A(t\u0006{Ó\u0094\u009bM¢~\u0098Nß\r¸\u008fî3Úó&!A\u0003\f\u0004Ò¸1\tY\u0098ÁÛ\u00814~·[";
      int var4 = "wíÀP\u0007~*\u0001\u008d\u0095âu\ta6'{¿¾FÜ\u0015\b.®Þb\u0092ÈëÔ\u0013¯\u0014ÿRú1mUÒÑA4\u001eÆßÁ\r\u00adòdWÇjÎåçÑµ\u00adÄ> ÿ\u0090ûk¢¢Y\u008b\u0014¡&´ì(b¢\u0093\u001e\\:IU©aÕ\u0096\u00942á-ë\u0085kgä\\Ñ¡©ºh-\u000fl\rP«\u0084?RPT\u009d\u0003mÉO{ðCBk½~L.V\u0014\u001dN\"\u0005\u0080ã>\u0085\u0005·5\u008bùô\u0018ºg\u0004Ôë\b¨0Tþ\u0085\u0098ÈF\tþ05Î\u001f\u0096\u00adã!\bÆ\t \u009aü\u0015îñ\bvj W5VsB\n\u0005\u0081Jø¸R\u001a8\u008aLd4\u0011\u0006\u0014h¼`Þ\u009b©ø\r'%àÝÁt5Q\u0099ú\u0097ßÚE¤\u000fK«G\u008c*\u0083Å»XÍ%Y×@-(³Òÿê²wÅ`åv¾\u0007;=m)ççKâþÕ\u0001\u0013Â A(t\u0006{Ó\u0094\u009bM¢~\u0098Nß\r¸\u008fî3Úó&!A\u0003\f\u0004Ò¸1\tY\u0098ÁÛ\u00814~·["
         .length();
      char var1 = 4;
      int var8 = -1;

      label52:
      while (true) {
         short var10000 = 80;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var26 = var10001.toCharArray();
               int var10004 = var26.length;
               int var6 = 0;
               byte var29 = (byte)var10000;
               var22 = var26;
               int var15 = var10004;
               byte var34;
               char[] var38;
               int var10006;
               if (var10004 <= 1) {
                  var38 = var26;
                  var34 = (byte)var10000;
                  var10006 = var6;
               } else {
                  var29 = (byte)var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var38 = var26;
                  var34 = (byte)var10000;
                  var10006 = var6;
               }

               while (true) {
                  var38[var10006] = (char)(var38[var10006] ^ var34 ^ switch (var6 % 7) {
                     case 0 -> 12;
                     case 1 -> 66;
                     case 2 -> 46;
                     case 3 -> 66;
                     case 4 -> 14;
                     case 5 -> 121;
                     default -> 127;
                  });
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var38 = var22;
                     var34 = var29;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var38 = var22;
                     var34 = var29;
                     var10006 = var6;
                  }
               }
            }

            String var31 = new String(var22).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var31;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[15];
                     var10000 = 10323;
                     short var17 = 25895;
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = "{{artist}}\t{{title}}\t{{album}}\t{{mpris:length}}\t{{position}}\t{{status}}\t{{playerName}}\t{{xesam:url}}";
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIIlllllIlllllIllIlllllIIlIIIIlllIIIllIllIIIIllIlIlIlllllIllIIllIlIlIlllllIlIIlIllllI();
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var31;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "©Fa¾+&\u0095K\u0098øuzIÙ5\u0091\u0096øhàõ\u001e²K\u0099gcEc\b\u0013\u008f$ôÂf\u0097!";
                  var4 = "©Fa¾+&\u0095K\u0098øuzIÙ5\u0091\u0096øhàõ\u001e²K\u0099gcEc\b\u0013\u008f$ôÂf\u0097!".length();
                  var1 = 29;
                  var8 = -1;
            }

            var10000 = 77;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 10326) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 165;
            case 1 -> 153;
            case 2 -> 34;
            case 3 -> 176;
            case 4 -> 223;
            case 5 -> 204;
            case 6 -> 189;
            case 7 -> 175;
            case 8 -> 211;
            case 9 -> 104;
            case 10 -> 82;
            case 11 -> 183;
            case 12 -> 57;
            case 13 -> 68;
            case 14 -> 173;
            case 15 -> 78;
            case 16 -> 120;
            case 17 -> 36;
            case 18 -> 229;
            case 19 -> 139;
            case 20 -> 166;
            case 21 -> 94;
            case 22 -> 150;
            case 23 -> 206;
            case 24 -> 52;
            case 25 -> 5;
            case 26 -> 89;
            case 27 -> 47;
            case 28 -> 15;
            case 29 -> 192;
            case 30 -> 224;
            case 31 -> 186;
            case 32 -> 99;
            case 33 -> 76;
            case 34 -> 254;
            case 35 -> 178;
            case 36 -> 138;
            case 37 -> 171;
            case 38 -> 214;
            case 39 -> 208;
            case 40 -> 160;
            case 41 -> 41;
            case 42 -> 234;
            case 43 -> 145;
            case 44 -> 253;
            case 45 -> 169;
            case 46 -> 79;
            case 47 -> 100;
            case 48 -> 217;
            case 49 -> 194;
            case 50 -> 216;
            case 51 -> 93;
            case 52 -> 11;
            case 53 -> 174;
            case 54 -> 66;
            case 55 -> 129;
            case 56 -> 148;
            case 57 -> 20;
            case 58 -> 201;
            case 59 -> 180;
            case 60 -> 193;
            case 61 -> 238;
            case 62 -> 127;
            case 63 -> 118;
            case 64 -> 198;
            case 65 -> 85;
            case 66 -> 51;
            case 67 -> 17;
            case 68 -> 147;
            case 69 -> 177;
            case 70 -> 188;
            case 71 -> 149;
            case 72 -> 190;
            case 73 -> 137;
            case 74 -> 116;
            case 75 -> 42;
            case 76 -> 141;
            case 77 -> 215;
            case 78 -> 84;
            case 79 -> 142;
            case 80 -> 32;
            case 81 -> 168;
            case 82 -> 245;
            case 83 -> 232;
            case 84 -> 179;
            case 85 -> 21;
            case 86 -> 43;
            case 87 -> 12;
            case 88 -> 209;
            case 89 -> 48;
            case 90 -> 23;
            case 91 -> 228;
            case 92 -> 157;
            case 93 -> 167;
            case 94 -> 109;
            case 95 -> 241;
            case 96 -> 187;
            case 97 -> 63;
            case 98 -> 252;
            case 99 -> 119;
            case 100 -> 13;
            case 101 -> 10;
            case 102 -> 110;
            case 103 -> 170;
            case 104 -> 246;
            case 105 -> 199;
            case 106 -> 6;
            case 107 -> 111;
            case 108 -> 92;
            case 109 -> 88;
            case 110 -> 242;
            case 111 -> 218;
            case 112 -> 1;
            case 113 -> 136;
            case 114 -> 202;
            case 115 -> 124;
            case 116 -> 146;
            case 117 -> 212;
            case 118 -> 56;
            case 119 -> 213;
            case 120 -> 9;
            case 121 -> 222;
            case 122 -> 235;
            case 123 -> 249;
            case 124 -> 182;
            case 125 -> 29;
            case 126 -> 75;
            case 127 -> 164;
            case 128 -> 55;
            case 129 -> 130;
            case 130 -> 106;
            case 131 -> 67;
            case 132 -> 132;
            case 133 -> 207;
            case 134 -> 163;
            case 135 -> 24;
            case 136 -> 144;
            case 137 -> 86;
            case 138 -> 205;
            case 139 -> 248;
            case 140 -> 59;
            case 141 -> 49;
            case 142 -> 158;
            case 143 -> 62;
            case 144 -> 81;
            case 145 -> 39;
            case 146 -> 156;
            case 147 -> 50;
            case 148 -> 230;
            case 149 -> 231;
            case 150 -> 60;
            case 151 -> 236;
            case 152 -> 102;
            case 153 -> 135;
            case 154 -> 53;
            case 155 -> 143;
            case 156 -> 73;
            case 157 -> 220;
            case 158 -> 151;
            case 159 -> 115;
            case 160 -> 95;
            case 161 -> 77;
            case 162 -> 125;
            case 163 -> 74;
            case 164 -> 239;
            case 165 -> 2;
            case 166 -> 126;
            case 167 -> 226;
            case 168 -> 181;
            case 169 -> 240;
            case 170 -> 70;
            case 171 -> 185;
            case 172 -> 123;
            case 173 -> 40;
            case 174 -> 155;
            case 175 -> 117;
            case 176 -> 237;
            case 177 -> 191;
            case 178 -> 210;
            case 179 -> 196;
            case 180 -> 37;
            case 181 -> 225;
            case 182 -> 133;
            case 183 -> 0;
            case 184 -> 233;
            case 185 -> 22;
            case 186 -> 103;
            case 187 -> 69;
            case 188 -> 244;
            case 189 -> 25;
            case 190 -> 105;
            case 191 -> 172;
            case 192 -> 35;
            case 193 -> 14;
            case 194 -> 18;
            case 195 -> 28;
            case 196 -> 112;
            case 197 -> 19;
            case 198 -> 247;
            case 199 -> 98;
            case 200 -> 195;
            case 201 -> 8;
            case 202 -> 72;
            case 203 -> 87;
            case 204 -> 203;
            case 205 -> 65;
            case 206 -> 152;
            case 207 -> 16;
            case 208 -> 38;
            case 209 -> 7;
            case 210 -> 3;
            case 211 -> 64;
            case 212 -> 90;
            case 213 -> 83;
            case 214 -> 113;
            case 215 -> 54;
            case 216 -> 227;
            case 217 -> 161;
            case 218 -> 243;
            case 219 -> 26;
            case 220 -> 61;
            case 221 -> 96;
            case 222 -> 184;
            case 223 -> 221;
            case 224 -> 31;
            case 225 -> 27;
            case 226 -> 101;
            case 227 -> 140;
            case 228 -> 58;
            case 229 -> 250;
            case 230 -> 162;
            case 231 -> 107;
            case 232 -> 46;
            case 233 -> 154;
            case 234 -> 128;
            case 235 -> 114;
            case 236 -> 255;
            case 237 -> 33;
            case 238 -> 122;
            case 239 -> 30;
            case 240 -> 251;
            case 241 -> 108;
            case 242 -> 71;
            case 243 -> 197;
            case 244 -> 4;
            case 245 -> 134;
            case 246 -> 91;
            case 247 -> 121;
            case 248 -> 200;
            case 249 -> 45;
            case 250 -> 44;
            case 251 -> 80;
            case 252 -> 219;
            case 253 -> 97;
            case 254 -> 159;
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
}
