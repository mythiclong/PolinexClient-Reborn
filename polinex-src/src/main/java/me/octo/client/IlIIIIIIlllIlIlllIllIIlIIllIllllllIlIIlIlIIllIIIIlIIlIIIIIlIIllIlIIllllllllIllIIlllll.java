package me.octo.client;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI;
import org.jetbrains.annotations.NotNull;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;

public final class IlIIIIIIlllIlIlllIllIIlIIllIllllllIlIIlIlIIllIIIIlIIlIIIIIlIIllIlIIllllllllIllIIlllll
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl
   implements lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII {
   @NotNull
   private final String lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private final lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] f;
   private static String[] g;

   public IlIIIIIIlllIlIlllIllIIlIIllIllllllIlIIlIlIIllIIIIlIIlIIIIIlIIllIlIIllllllllIllIIlllll(
      @NotNull String var1,
      @NotNull String var2,
      @NotNull String var3,
      @NotNull String var4,
      boolean var5,
      @NotNull IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var6,
      @NotNull lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl var7
   ) {
      short var10001 = 7063;
      short var10002 = 17178;
      Intrinsics.checkNotNullParameter(var1, "scriptName");
      var10001 = 7057;
      var10002 = 30609;
      Intrinsics.checkNotNullParameter(var2, "name");
      var10001 = 7070;
      var10002 = 17484;
      Intrinsics.checkNotNullParameter(var3, "description");
      var10001 = 7060;
      var10002 = -6046;
      Intrinsics.checkNotNullParameter(var4, "subcategory");
      var10001 = 7056;
      var10002 = 25067;
      Intrinsics.checkNotNullParameter(var6, "settings");
      var10001 = 7067;
      var10002 = -2015;
      Intrinsics.checkNotNullParameter(var7, "callbacks");
      super(
         var2,
         var3,
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl,
         var4,
         var5,
         Arrays.copyOf(var6, var6.length)
      );
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var1;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var7;
   }

   @NotNull
   public String ag() {
      return this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   @NotNull
   public lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl ai() {
      return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   @NotNull
   public llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl ah() {
      return this;
   }

   public void aB() {
      super.aB();

      try {
         this.ai().a(this.ai().a(), new Object[0]);
      } catch (Exception var2) {
         String var10000 = this.ag();
         String var10001 = var2.getMessage();
         short var10002 = 7065;
         short var10003 = -8436;
         var10003 = 7059;
         short var10004 = 9997;
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b(
            "[Script: " + var10000 + "] Error in onEnable callback: " + var10001
         );
         var10001 = var2.getMessage();
         var10002 = 7058;
         var10003 = -13847;
         this.d("Error in onEnable: " + var10001);
      }
   }

   public void aC() {
      super.aC();

      try {
         this.ai().a(this.ai().b(), new Object[0]);
      } catch (Exception var2) {
         String var10000 = this.ag();
         String var10001 = var2.getMessage();
         short var10002 = 7066;
         short var10003 = -20546;
         var10003 = 7061;
         short var10004 = 12759;
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b(
            "[Script: " + var10000 + "] Error in onDisable callback: " + var10001
         );
         var10001 = var2.getMessage();
         var10002 = 7064;
         var10003 = 4790;
         this.d("Error in onDisable: " + var10001);
      }
   }

   public boolean b() {
        boolean bl;
        lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray = IlIIlllIIlIllIlIIllIIIIIIlllIlIlIllllllIIIlIIIIlllIIllIlllIllIllllIlIIIlIIlIIIIllIIlI.b();
        try {
            boolean bl2;
            Boolean bl3;
            block11: {
                block9: {
                    Object object;
                    block8: {
                        Object object2 = this.ai().a(this.ai().d(), new Object[0]);
                        object = object2;
                        if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray == null) break block8;
                        try {
                            block10: {
                                if (!(object instanceof Boolean)) break block9;
                                break block10;
                            }
                            object = object2;
                        }
                        catch (Exception exception) {
                            throw IlIIIIIIlllIlIlllIllIIlIIllIllllllIlIIlIlIIllIIIIlIIlIIIIIlIIllIlIIllllllllIllIIlllll.a(exception);
                        }
                    }
                    bl3 = (Boolean)object;
                    break block11;
                }
                bl3 = null;
            }
            try {
                bl2 = bl3 != null ? bl3 : true;
            }
            catch (Exception exception) {
                throw IlIIIIIIlllIlIlllIllIIlIIllIllllllIlIIlIlIIllIIIIlIIlIIIIIlIIllIlIIllllllllIllIIlllll.a(exception);
            }
            bl = bl2;
        }
        catch (Exception exception) {
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("[Script: " + this.ag() + "] Error in shouldRender callback: " + exception.getMessage());
            bl = true;
        }
        return bl;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[13];
      int var3 = 0;
      String var2 = "öF÷ãñ»óõVÄø\u001e·×ÿ\u0097\u0002Qè\u001e¶\u008aÓ\u007f¤ÙBQQÖ6Wéµ8vp\u0097\u0004V²Gy\u007fÔ.²{«\u0005\bÁ*ç\u0080.á~$\u0004ÂL Ù\"CÔm´s ¸~\u000e3Ý÷\u0092\u0014\u008a XÏÇêÍSo5Ê¢_í qïp\u0089M\nß\u0091\",IÐ\u0081I\u0096·\u000b4ßO;çyLzc\u0000ï\u001f\u0094$\u0097ª,cS\u0006s<r\na\u001f.\u0010V\u0005ª\u008e\f³\u0088£H¶ì\u0003s\u0019þ\t\nv¤ý³\u0096Þ^M\tÐLÏÐ;ÿ²\u0011f\u0014\u000fûÈT\u0016M\u000f+É\u001f\u000bdÎ«4F\u0011û¸ó";
      int var4 = "öF÷ãñ»óõVÄø\u001e·×ÿ\u0097\u0002Qè\u001e¶\u008aÓ\u007f¤ÙBQQÖ6Wéµ8vp\u0097\u0004V²Gy\u007fÔ.²{«\u0005\bÁ*ç\u0080.á~$\u0004ÂL Ù\"CÔm´s ¸~\u000e3Ý÷\u0092\u0014\u008a XÏÇêÍSo5Ê¢_í qïp\u0089M\nß\u0091\",IÐ\u0081I\u0096·\u000b4ßO;çyLzc\u0000ï\u001f\u0094$\u0097ª,cS\u0006s<r\na\u001f.\u0010V\u0005ª\u008e\f³\u0088£H¶ì\u0003s\u0019þ\t\nv¤ý³\u0096Þ^M\tÐLÏÐ;ÿ²\u0011f\u0014\u000fûÈT\u0016M\u000f+É\u001f\u000bdÎ«4F\u0011û¸ó"
         .length();
      char var1 = 19;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 78;
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
                     case 0 -> 106;
                     case 1 -> 13;
                     case 2 -> 124;
                     case 3 -> 94;
                     case 4 -> 73;
                     case 5 -> 41;
                     default -> 54;
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
                     f = var5;
                     g = new String[13];
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "\u001d'\b\u0099hTëH¥\u000b?A\u0084´ðÛ\u0084Í\u0085Ô¬";
                  var4 = "\u001d'\b\u0099hTëH¥\u000b?A\u0084´ðÛ\u0084Í\u0085Ô¬".length();
                  var1 = '\t';
                  var8 = -1;
            }

            var10000 = 101;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 7058) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 3;
            case 1 -> 249;
            case 2 -> 47;
            case 3 -> 144;
            case 4 -> 209;
            case 5 -> 139;
            case 6 -> 109;
            case 7 -> 214;
            case 8 -> 59;
            case 9 -> 247;
            case 10 -> 112;
            case 11 -> 254;
            case 12 -> 14;
            case 13 -> 215;
            case 14 -> 4;
            case 15 -> 143;
            case 16 -> 255;
            case 17 -> 126;
            case 18 -> 195;
            case 19 -> 196;
            case 20 -> 5;
            case 21 -> 131;
            case 22 -> 142;
            case 23 -> 157;
            case 24 -> 224;
            case 25 -> 100;
            case 26 -> 210;
            case 27 -> 207;
            case 28 -> 150;
            case 29 -> 76;
            case 30 -> 153;
            case 31 -> 127;
            case 32 -> 96;
            case 33 -> 93;
            case 34 -> 216;
            case 35 -> 52;
            case 36 -> 217;
            case 37 -> 194;
            case 38 -> 121;
            case 39 -> 101;
            case 40 -> 165;
            case 41 -> 203;
            case 42 -> 132;
            case 43 -> 72;
            case 44 -> 135;
            case 45 -> 220;
            case 46 -> 73;
            case 47 -> 172;
            case 48 -> 248;
            case 49 -> 149;
            case 50 -> 79;
            case 51 -> 189;
            case 52 -> 113;
            case 53 -> 68;
            case 54 -> 162;
            case 55 -> 148;
            case 56 -> 29;
            case 57 -> 191;
            case 58 -> 105;
            case 59 -> 60;
            case 60 -> 81;
            case 61 -> 202;
            case 62 -> 17;
            case 63 -> 118;
            case 64 -> 116;
            case 65 -> 192;
            case 66 -> 225;
            case 67 -> 160;
            case 68 -> 134;
            case 69 -> 83;
            case 70 -> 95;
            case 71 -> 175;
            case 72 -> 123;
            case 73 -> 119;
            case 74 -> 65;
            case 75 -> 110;
            case 76 -> 84;
            case 77 -> 28;
            case 78 -> 169;
            case 79 -> 80;
            case 80 -> 178;
            case 81 -> 156;
            case 82 -> 63;
            case 83 -> 55;
            case 84 -> 115;
            case 85 -> 186;
            case 86 -> 54;
            case 87 -> 147;
            case 88 -> 164;
            case 89 -> 27;
            case 90 -> 57;
            case 91 -> 177;
            case 92 -> 99;
            case 93 -> 239;
            case 94 -> 50;
            case 95 -> 238;
            case 96 -> 108;
            case 97 -> 187;
            case 98 -> 197;
            case 99 -> 70;
            case 100 -> 21;
            case 101 -> 43;
            case 102 -> 78;
            case 103 -> 53;
            case 104 -> 176;
            case 105 -> 199;
            case 106 -> 212;
            case 107 -> 104;
            case 108 -> 46;
            case 109 -> 75;
            case 110 -> 129;
            case 111 -> 206;
            case 112 -> 19;
            case 113 -> 22;
            case 114 -> 64;
            case 115 -> 170;
            case 116 -> 244;
            case 117 -> 34;
            case 118 -> 39;
            case 119 -> 252;
            case 120 -> 204;
            case 121 -> 222;
            case 122 -> 69;
            case 123 -> 158;
            case 124 -> 219;
            case 125 -> 44;
            case 126 -> 26;
            case 127 -> 88;
            case 128 -> 213;
            case 129 -> 145;
            case 130 -> 61;
            case 131 -> 180;
            case 132 -> 211;
            case 133 -> 208;
            case 134 -> 137;
            case 135 -> 136;
            case 136 -> 32;
            case 137 -> 89;
            case 138 -> 102;
            case 139 -> 48;
            case 140 -> 141;
            case 141 -> 229;
            case 142 -> 58;
            case 143 -> 243;
            case 144 -> 35;
            case 145 -> 30;
            case 146 -> 62;
            case 147 -> 36;
            case 148 -> 91;
            case 149 -> 227;
            case 150 -> 13;
            case 151 -> 250;
            case 152 -> 173;
            case 153 -> 205;
            case 154 -> 240;
            case 155 -> 67;
            case 156 -> 245;
            case 157 -> 94;
            case 158 -> 155;
            case 159 -> 163;
            case 160 -> 12;
            case 161 -> 11;
            case 162 -> 107;
            case 163 -> 128;
            case 164 -> 86;
            case 165 -> 246;
            case 166 -> 16;
            case 167 -> 130;
            case 168 -> 6;
            case 169 -> 122;
            case 170 -> 237;
            case 171 -> 25;
            case 172 -> 167;
            case 173 -> 38;
            case 174 -> 184;
            case 175 -> 51;
            case 176 -> 234;
            case 177 -> 1;
            case 178 -> 74;
            case 179 -> 18;
            case 180 -> 166;
            case 181 -> 37;
            case 182 -> 171;
            case 183 -> 230;
            case 184 -> 235;
            case 185 -> 45;
            case 186 -> 124;
            case 187 -> 231;
            case 188 -> 20;
            case 189 -> 133;
            case 190 -> 117;
            case 191 -> 253;
            case 192 -> 221;
            case 193 -> 41;
            case 194 -> 98;
            case 195 -> 49;
            case 196 -> 223;
            case 197 -> 242;
            case 198 -> 77;
            case 199 -> 159;
            case 200 -> 71;
            case 201 -> 179;
            case 202 -> 103;
            case 203 -> 7;
            case 204 -> 174;
            case 205 -> 201;
            case 206 -> 251;
            case 207 -> 161;
            case 208 -> 66;
            case 209 -> 236;
            case 210 -> 82;
            case 211 -> 31;
            case 212 -> 140;
            case 213 -> 56;
            case 214 -> 33;
            case 215 -> 120;
            case 216 -> 40;
            case 217 -> 185;
            case 218 -> 183;
            case 219 -> 200;
            case 220 -> 152;
            case 221 -> 190;
            case 222 -> 188;
            case 223 -> 226;
            case 224 -> 218;
            case 225 -> 181;
            case 226 -> 24;
            case 227 -> 42;
            case 228 -> 198;
            case 229 -> 85;
            case 230 -> 9;
            case 231 -> 106;
            case 232 -> 23;
            case 233 -> 97;
            case 234 -> 87;
            case 235 -> 15;
            case 236 -> 2;
            case 237 -> 151;
            case 238 -> 193;
            case 239 -> 233;
            case 240 -> 0;
            case 241 -> 125;
            case 242 -> 168;
            case 243 -> 228;
            case 244 -> 138;
            case 245 -> 90;
            case 246 -> 111;
            case 247 -> 232;
            case 248 -> 8;
            case 249 -> 10;
            case 250 -> 182;
            case 251 -> 146;
            case 252 -> 241;
            case 253 -> 92;
            case 254 -> 154;
            default -> 114;
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

         g[var2] = new String(var3).intern();
      }

      return g[var2];
   }
}
