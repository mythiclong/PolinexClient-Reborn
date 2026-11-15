package me.octo.client.utils;

public class IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl {
   private static String[] a;
   private static String[] b;

   public static String a(String[] param0) {
      String string;
      block30: {
         StringBuilder stringBuilder = new StringBuilder();
         lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray = llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.f();
         try {
            String string2;
            Process process;
            block29: {
               block28: {
                  process = new ProcessBuilder(param0).redirectErrorStream(true).start();
                  Process process2 = process;
                  if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray != null) break block28;
                  try {
                     block36: {
                        if (process2.waitFor(2L, java.util.concurrent.TimeUnit.SECONDS)) break block29;
                        break block36;
                     }
                     process2 = process.destroyForcibly();
                  }
                  catch (Exception exception) {
                     throw IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl.a(exception);
                  }
               }
               return "";
            }
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(process.getInputStream()));
            while ((string2 = bufferedReader.readLine()) != null) {
               block32: {
                  boolean bl;
                  String string3;
                  block35: {
                     block34: {
                        block33: {
                           block31: {
                              block37: {
                                 string3 = string2.trim();
                                 string = string3;
                                 if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray != null) break block30;
                                 bl = string.isEmpty();
                                 if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray != null) break block31;
                                 break block37;
                              }
                              try {
                                 block38: {
                                    if (bl) break block32;
                                    break block38;
                                 }
                                 bl = string3.equalsIgnoreCase("SerialNumber");
                              }
                              catch (Exception exception) {
                                 throw IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl.a(exception);
                              }
                           }
                           if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray != null) break block33;
                           try {
                              block39: {
                                 if (bl) break block32;
                                 break block39;
                              }
                              bl = string3.equalsIgnoreCase("ProcessorId");
                           }
                           catch (Exception exception) {
                              throw IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl.a(exception);
                           }
                        }
                        if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray != null) break block34;
                        try {
                           block40: {
                              if (bl) break block32;
                              break block40;
                           }
                           bl = string3.contains("Permission denied");
                        }
                        catch (Exception exception) {
                           throw IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl.a(exception);
                        }
                     }
                     if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray != null) break block35;
                     try {
                        block41: {
                           if (bl) break block32;
                           break block41;
                        }
                        bl = string3.equals("(null)");
                     }
                     catch (Exception exception) {
                        throw IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl.a(exception);
                     }
                  }
                  try {
                     if (!bl) {
                        stringBuilder.append(string3);
                     }
                  }
                  catch (Exception exception) {
                     throw IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl.a(exception);
                  }
               }
               if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray == null) continue;
            }
            bufferedReader.close();
         }
         catch (Exception exception) {
            // empty catch block
         }
         string = stringBuilder.toString();
      }
      return string;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "Oe\u000eïý\u001a;*B\\\f\f\t\u000f¸]\u0091\u0018\u000f\u008cAú\u0091Ø";
      int var4 = "Oe\u000eïý\u001a;*B\\\f\f\t\u000f¸]\u0091\u0018\u000f\u008cAú\u0091Ø".length();
      char var1 = 11;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 12;
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
                     case 0 -> 48;
                     case 1 -> 68;
                     case 2 -> 89;
                     case 3 -> 25;
                     case 4 -> 125;
                     case 5 -> 53;
                     default -> 28;
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

                  var2 = "\u0013ÎÉ+t\u0017\u0011Þ\u0090\u0000\u008b¯xÝA¢ñË\u0003\u0082ùÊ\u0092\u008a";
                  var4 = "\u0013ÎÉ+t\u0017\u0011Þ\u0090\u0000\u008b¯xÝA¢ñË\u0003\u0082ùÊ\u0092\u008a".length();
                  var1 = 6;
                  var8 = -1;
            }

            var10000 = 13;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -30626) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 6;
            case 1 -> 143;
            case 2 -> 4;
            case 3 -> 179;
            case 4 -> 171;
            case 5 -> 140;
            case 6 -> 87;
            case 7 -> 250;
            case 8 -> 238;
            case 9 -> 132;
            case 10 -> 225;
            case 11 -> 249;
            case 12 -> 39;
            case 13 -> 253;
            case 14 -> 181;
            case 15 -> 5;
            case 16 -> 124;
            case 17 -> 122;
            case 18 -> 116;
            case 19 -> 105;
            case 20 -> 241;
            case 21 -> 35;
            case 22 -> 168;
            case 23 -> 82;
            case 24 -> 42;
            case 25 -> 19;
            case 26 -> 78;
            case 27 -> 107;
            case 28 -> 90;
            case 29 -> 30;
            case 30 -> 208;
            case 31 -> 155;
            case 32 -> 36;
            case 33 -> 33;
            case 34 -> 215;
            case 35 -> 224;
            case 36 -> 65;
            case 37 -> 20;
            case 38 -> 59;
            case 39 -> 217;
            case 40 -> 49;
            case 41 -> 133;
            case 42 -> 77;
            case 43 -> 172;
            case 44 -> 8;
            case 45 -> 93;
            case 46 -> 240;
            case 47 -> 57;
            case 48 -> 192;
            case 49 -> 47;
            case 50 -> 62;
            case 51 -> 220;
            case 52 -> 43;
            case 53 -> 108;
            case 54 -> 58;
            case 55 -> 198;
            case 56 -> 185;
            case 57 -> 7;
            case 58 -> 169;
            case 59 -> 17;
            case 60 -> 243;
            case 61 -> 177;
            case 62 -> 251;
            case 63 -> 201;
            case 64 -> 245;
            case 65 -> 174;
            case 66 -> 149;
            case 67 -> 146;
            case 68 -> 162;
            case 69 -> 199;
            case 70 -> 221;
            case 71 -> 117;
            case 72 -> 148;
            case 73 -> 214;
            case 74 -> 145;
            case 75 -> 226;
            case 76 -> 114;
            case 77 -> 9;
            case 78 -> 156;
            case 79 -> 34;
            case 80 -> 196;
            case 81 -> 139;
            case 82 -> 130;
            case 83 -> 26;
            case 84 -> 70;
            case 85 -> 32;
            case 86 -> 64;
            case 87 -> 150;
            case 88 -> 115;
            case 89 -> 56;
            case 90 -> 210;
            case 91 -> 88;
            case 92 -> 242;
            case 93 -> 218;
            case 94 -> 13;
            case 95 -> 234;
            case 96 -> 69;
            case 97 -> 191;
            case 98 -> 12;
            case 99 -> 255;
            case 100 -> 18;
            case 101 -> 165;
            case 102 -> 22;
            case 103 -> 153;
            case 104 -> 120;
            case 105 -> 151;
            case 106 -> 227;
            case 107 -> 125;
            case 108 -> 219;
            case 109 -> 103;
            case 110 -> 206;
            case 111 -> 248;
            case 112 -> 51;
            case 113 -> 41;
            case 114 -> 50;
            case 115 -> 205;
            case 116 -> 11;
            case 117 -> 189;
            case 118 -> 141;
            case 119 -> 100;
            case 120 -> 53;
            case 121 -> 230;
            case 122 -> 102;
            case 123 -> 170;
            case 124 -> 31;
            case 125 -> 204;
            case 126 -> 194;
            case 127 -> 237;
            case 128 -> 38;
            case 129 -> 223;
            case 130 -> 184;
            case 131 -> 110;
            case 132 -> 233;
            case 133 -> 3;
            case 134 -> 232;
            case 135 -> 147;
            case 136 -> 37;
            case 137 -> 91;
            case 138 -> 45;
            case 139 -> 176;
            case 140 -> 128;
            case 141 -> 16;
            case 142 -> 207;
            case 143 -> 252;
            case 144 -> 75;
            case 145 -> 106;
            case 146 -> 76;
            case 147 -> 236;
            case 148 -> 123;
            case 149 -> 164;
            case 150 -> 112;
            case 151 -> 160;
            case 152 -> 173;
            case 153 -> 0;
            case 154 -> 163;
            case 155 -> 111;
            case 156 -> 213;
            case 157 -> 144;
            case 158 -> 126;
            case 159 -> 118;
            case 160 -> 66;
            case 161 -> 68;
            case 162 -> 134;
            case 163 -> 71;
            case 164 -> 228;
            case 165 -> 138;
            case 166 -> 98;
            case 167 -> 180;
            case 168 -> 48;
            case 169 -> 109;
            case 170 -> 127;
            case 171 -> 97;
            case 172 -> 195;
            case 173 -> 235;
            case 174 -> 1;
            case 175 -> 137;
            case 176 -> 186;
            case 177 -> 247;
            case 178 -> 104;
            case 179 -> 92;
            case 180 -> 46;
            case 181 -> 24;
            case 182 -> 187;
            case 183 -> 200;
            case 184 -> 27;
            case 185 -> 135;
            case 186 -> 131;
            case 187 -> 80;
            case 188 -> 23;
            case 189 -> 21;
            case 190 -> 121;
            case 191 -> 74;
            case 192 -> 161;
            case 193 -> 99;
            case 194 -> 193;
            case 195 -> 85;
            case 196 -> 95;
            case 197 -> 166;
            case 198 -> 72;
            case 199 -> 94;
            case 200 -> 60;
            case 201 -> 52;
            case 202 -> 84;
            case 203 -> 222;
            case 204 -> 40;
            case 205 -> 216;
            case 206 -> 152;
            case 207 -> 28;
            case 208 -> 55;
            case 209 -> 15;
            case 210 -> 67;
            case 211 -> 136;
            case 212 -> 231;
            case 213 -> 203;
            case 214 -> 89;
            case 215 -> 211;
            case 216 -> 188;
            case 217 -> 54;
            case 218 -> 10;
            case 219 -> 119;
            case 220 -> 202;
            case 221 -> 129;
            case 222 -> 167;
            case 223 -> 83;
            case 224 -> 244;
            case 225 -> 44;
            case 226 -> 209;
            case 227 -> 113;
            case 228 -> 190;
            case 229 -> 63;
            case 230 -> 79;
            case 231 -> 25;
            case 232 -> 239;
            case 233 -> 175;
            case 234 -> 29;
            case 235 -> 254;
            case 236 -> 178;
            case 237 -> 183;
            case 238 -> 14;
            case 239 -> 154;
            case 240 -> 157;
            case 241 -> 2;
            case 242 -> 158;
            case 243 -> 197;
            case 244 -> 73;
            case 245 -> 182;
            case 246 -> 101;
            case 247 -> 229;
            case 248 -> 61;
            case 249 -> 81;
            case 250 -> 246;
            case 251 -> 159;
            case 252 -> 212;
            case 253 -> 142;
            case 254 -> 86;
            default -> 96;
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
