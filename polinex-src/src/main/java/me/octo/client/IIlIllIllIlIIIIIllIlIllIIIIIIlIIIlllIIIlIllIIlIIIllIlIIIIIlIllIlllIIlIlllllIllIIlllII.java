package me.octo.client;

import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.ItemLore;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIlIllIllIlIIIIIllIlIllIIIIIIlIIIlllIIIlIllIIlIIIllIlIIIIIlIllIlllIIlIlllllIllIIlllII
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static IIlIllIllIlIIIIIllIlIllIIIIIIlIIIlllIIIlIllIIlIIIllIlIIIIIlIllIlllIIlIlllllIllIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @JvmField
   @NotNull
   public static IIlIllIllIlIIIIIllIlIllIIIIIIlIIIlllIIIlIllIIlIIIllIlIIIIIlIllIlllIIlIlllllIllIIlllII lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] f;
   private static String[] g;

   private IIlIllIllIlIIIIIllIlIllIIIIIIlIIIlllIIIlIllIIlIIIllIlIIIIIlIllIlllIIlIlllllIllIIlllII() {
      short var10001 = -28412;
      short var10002 = 27344;
      var10002 = -28410;
      short var10003 = -3048;
      short var10004 = -28409;
      short var10005 = -4845;
      super(
         "No Drill Reset",
         "Prevents your drill from resetting due to lore updates.",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
         "Misc"
      );
   }

   @JvmStatic
   public static final boolean a(@NotNull BlockPos var0, @Nullable ItemStack var1, @Nullable BlockPos var2) {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.a(var0, var1, var2);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static { byte var13 = (byte)0; // PX-FIX hoist
         byte var10 = (byte)0; // PX-FIX hoist
        
      pxClinit: {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "[füf$«?Ë\u008eµz\u0082\u000e\u00ad÷P×ºÅ'9ÜQbhéýt}TºùÔ\u00ad\u001f4\u0001£;Þ\u009d\u00073\u0018]\u0004 \u008dF`d8D\u0099Þ\u0004Øý$x\u000e\u0013ãmZì_Ë\u00ad\u000b®À©\u0005Z";
      int var4 = "[füf$«?Ë\u008eµz\u0082\u000e\u00ad÷P×ºÅ'9ÜQbhéýt}TºùÔ\u00ad\u001f4\u0001£;Þ\u009d\u00073\u0018]\u0004 \u008dF`d8D\u0099Þ\u0004Øý$x\u000e\u0013ãmZì_Ë\u00ad\u000b®À©\u0005Z"
         .length();
      char var1 = '7';
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
             var13 = 60;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 60;
               var10006 = var6;
            } else {
               var13 = 60;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 60;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 120;
                  case 1 -> 3;
                  case 2 -> 28;
                  case 3 -> 59;
                  case 4 -> 47;
                  case 5 -> 109;
                  default -> 88;
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
          var10 = -1;
         var5[var3++] = var15;
         if ((var0 += var1) >= var4) {
            f = var5;
            g = new String[3];
            lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IIlIllIllIlIIIIIllIlIllIIIIIIlIIIlllIIIlIllIIlIIIllIlIIIIIlIllIlllIIlIlllllIllIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                (kotlin.jvm.internal.DefaultConstructorMarker) null
            );
            lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new IIlIllIllIlIIIIIllIlIllIIIIIIlIIIlllIIIlIllIIlIIIllIlIIIIIlIllIlllIIlIlllllIllIIlllII();
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -28410) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 99;
            case 1 -> 253;
            case 2 -> 103;
            case 3 -> 52;
            case 4 -> 233;
            case 5 -> 83;
            case 6 -> 190;
            case 7 -> 216;
            case 8 -> 223;
            case 9 -> 113;
            case 10 -> 141;
            case 11 -> 67;
            case 12 -> 220;
            case 13 -> 124;
            case 14 -> 242;
            case 15 -> 45;
            case 16 -> 15;
            case 17 -> 22;
            case 18 -> 11;
            case 19 -> 155;
            case 20 -> 167;
            case 21 -> 245;
            case 22 -> 59;
            case 23 -> 162;
            case 24 -> 5;
            case 25 -> 3;
            case 26 -> 161;
            case 27 -> 211;
            case 28 -> 207;
            case 29 -> 195;
            case 30 -> 81;
            case 31 -> 201;
            case 32 -> 214;
            case 33 -> 232;
            case 34 -> 237;
            case 35 -> 252;
            case 36 -> 30;
            case 37 -> 61;
            case 38 -> 177;
            case 39 -> 17;
            case 40 -> 206;
            case 41 -> 75;
            case 42 -> 156;
            case 43 -> 110;
            case 44 -> 174;
            case 45 -> 50;
            case 46 -> 7;
            case 47 -> 14;
            case 48 -> 107;
            case 49 -> 116;
            case 50 -> 234;
            case 51 -> 120;
            case 52 -> 147;
            case 53 -> 255;
            case 54 -> 152;
            case 55 -> 215;
            case 56 -> 196;
            case 57 -> 44;
            case 58 -> 251;
            case 59 -> 204;
            case 60 -> 136;
            case 61 -> 134;
            case 62 -> 158;
            case 63 -> 192;
            case 64 -> 53;
            case 65 -> 41;
            case 66 -> 114;
            case 67 -> 4;
            case 68 -> 98;
            case 69 -> 168;
            case 70 -> 239;
            case 71 -> 123;
            case 72 -> 27;
            case 73 -> 47;
            case 74 -> 19;
            case 75 -> 68;
            case 76 -> 54;
            case 77 -> 193;
            case 78 -> 140;
            case 79 -> 79;
            case 80 -> 173;
            case 81 -> 199;
            case 82 -> 2;
            case 83 -> 60;
            case 84 -> 39;
            case 85 -> 109;
            case 86 -> 202;
            case 87 -> 183;
            case 88 -> 238;
            case 89 -> 164;
            case 90 -> 231;
            case 91 -> 243;
            case 92 -> 217;
            case 93 -> 143;
            case 94 -> 169;
            case 95 -> 129;
            case 96 -> 151;
            case 97 -> 43;
            case 98 -> 65;
            case 99 -> 229;
            case 100 -> 105;
            case 101 -> 122;
            case 102 -> 153;
            case 103 -> 148;
            case 104 -> 138;
            case 105 -> 74;
            case 106 -> 128;
            case 107 -> 127;
            case 108 -> 84;
            case 109 -> 171;
            case 110 -> 247;
            case 111 -> 25;
            case 112 -> 97;
            case 113 -> 185;
            case 114 -> 175;
            case 115 -> 130;
            case 116 -> 184;
            case 117 -> 186;
            case 118 -> 63;
            case 119 -> 200;
            case 120 -> 254;
            case 121 -> 16;
            case 122 -> 157;
            case 123 -> 100;
            case 124 -> 56;
            case 125 -> 77;
            case 126 -> 126;
            case 127 -> 86;
            case 128 -> 91;
            case 129 -> 71;
            case 130 -> 181;
            case 131 -> 20;
            case 132 -> 235;
            case 133 -> 95;
            case 134 -> 12;
            case 135 -> 133;
            case 136 -> 208;
            case 137 -> 236;
            case 138 -> 187;
            case 139 -> 241;
            case 140 -> 112;
            case 141 -> 49;
            case 142 -> 145;
            case 143 -> 222;
            case 144 -> 90;
            case 145 -> 224;
            case 146 -> 189;
            case 147 -> 226;
            case 148 -> 73;
            case 149 -> 159;
            case 150 -> 104;
            case 151 -> 197;
            case 152 -> 146;
            case 153 -> 121;
            case 154 -> 40;
            case 155 -> 29;
            case 156 -> 66;
            case 157 -> 250;
            case 158 -> 178;
            case 159 -> 221;
            case 160 -> 180;
            case 161 -> 249;
            case 162 -> 92;
            case 163 -> 106;
            case 164 -> 198;
            case 165 -> 46;
            case 166 -> 23;
            case 167 -> 139;
            case 168 -> 57;
            case 169 -> 212;
            case 170 -> 163;
            case 171 -> 35;
            case 172 -> 176;
            case 173 -> 230;
            case 174 -> 58;
            case 175 -> 166;
            case 176 -> 165;
            case 177 -> 194;
            case 178 -> 32;
            case 179 -> 80;
            case 180 -> 96;
            case 181 -> 26;
            case 182 -> 191;
            case 183 -> 8;
            case 184 -> 150;
            case 185 -> 33;
            case 186 -> 93;
            case 187 -> 102;
            case 188 -> 111;
            case 189 -> 88;
            case 190 -> 36;
            case 191 -> 240;
            case 192 -> 119;
            case 193 -> 1;
            case 194 -> 0;
            case 195 -> 70;
            case 196 -> 118;
            case 197 -> 117;
            case 198 -> 170;
            case 199 -> 48;
            case 200 -> 31;
            case 201 -> 205;
            case 202 -> 179;
            case 203 -> 228;
            case 204 -> 85;
            case 205 -> 62;
            case 206 -> 87;
            case 207 -> 101;
            case 208 -> 10;
            case 209 -> 131;
            case 210 -> 18;
            case 211 -> 132;
            case 212 -> 225;
            case 213 -> 69;
            case 214 -> 82;
            case 215 -> 218;
            case 216 -> 72;
            case 217 -> 78;
            case 218 -> 154;
            case 219 -> 209;
            case 220 -> 137;
            case 221 -> 38;
            case 222 -> 248;
            case 223 -> 244;
            case 224 -> 144;
            case 225 -> 246;
            case 226 -> 219;
            case 227 -> 37;
            case 228 -> 89;
            case 229 -> 42;
            case 230 -> 160;
            case 231 -> 213;
            case 232 -> 51;
            case 233 -> 108;
            case 234 -> 142;
            case 235 -> 172;
            case 236 -> 55;
            case 237 -> 76;
            case 238 -> 135;
            case 239 -> 24;
            case 240 -> 182;
            case 241 -> 64;
            case 242 -> 28;
            case 243 -> 188;
            case 244 -> 115;
            case 245 -> 34;
            case 246 -> 203;
            case 247 -> 13;
            case 248 -> 149;
            case 249 -> 210;
            case 250 -> 6;
            case 251 -> 9;
            case 252 -> 227;
            case 253 -> 125;
            case 254 -> 21;
            default -> 94;
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
   public static me.octo.client.PXDyn var13 = null; // PX-FIX missing field v2
   
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private static String[] a;
      private static String[] b;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @JvmStatic
      public final boolean a(@NotNull BlockPos var1, @Nullable ItemStack var2, @Nullable BlockPos var3) { LocalPlayer var10 = null; // PX-FIX hoist
        
      Object var18 = null; // PX-FIX
      Object var12 = null; // PX-FIX
      boolean var13 = false; // PX-FIX hoist
         int[] var10000 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
         short var10002 = 7636;
         short var10003 = 11987;
         Intrinsics.checkNotNullParameter(var1, "blockPos");
         int[] var4 = var10000;
         boolean var9 = IIlIllIllIlIIIIIllIlIllIIIIIIlIIIlllIIIlIllIIlIIIllIlIIIIIlIllIlllIIlIlllllIllIIlllII.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
            .ae();
         if (var4 != null) {
            if (var9) {
                var10 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a()
                  .player;
               if (var10 == null) {
                  return false;
               }

               boolean var7;
               label98: {
                  label106: {
                     ItemStack var6;
                     LocalPlayer var5 = var10;
                     ItemStack var11 = var5.getMainHandItem();
                     var10002 = 7637;
                     var10003 = 10490;
                     Intrinsics.checkNotNullExpressionValue(var11, "getMainHandItem(...)");
                     var6 = var11;
                     var7 = false;
                     var12 = var2;
                     label96:
                     if (var4 != null) {
                        if (var2 == null) {
                           var12 = var6;
                           if (var4 == null) {
                              break label96;
                           }

                           if (var6.isEmpty()) {
                              var7 = true;
                              if (var4 != null) {
                                 break label106;
                              }
                           }
                        }

                        var12 = var2;
                     }

                     if (var4 != null) {
                        if (var12 == null) {
                           break label106;
                        }

                        var12 = var6;
                     }

                     var13 = ((java.util.Collection)var12).isEmpty();
                     if (var4 == null) {
                        break label98;
                     }

                     if (!var13) {
                        label79: {
                           label107: {
                              String var8 = this.a(var6);
                              var10000 = (int[])(Object)var8;
                              if (var4 != null) {
                                 if (var8 == null) {
                                    break label107;
                                 }

                                 var10000 = (int[])(Object)var8;
                              }

                              label108: {
                                 short var10001 = 7634;
                                 var10002 = 1022;
                                 boolean var15 = StringsKt.contains((CharSequence)var8, "GEMSTONE GAUNTLET", false);
                                 if (var4 != null) {
                                    if (var15) {
                                       break label108;
                                    }

                                    CharSequence var16 = var8;
                                    var10001 = 7635;
                                    var10002 = -30671;
                                    var15 = StringsKt.contains(var16, "DRILL", false);
                                 }

                                 if (var4 != null) {
                                    if (var15) {
                                       break label108;
                                    }

                                    CharSequence var17 = var8;
                                    var10001 = 7633;
                                    var10002 = -3634;
                                    var15 = StringsKt.contains(var17, "PICKAXE", false);
                                 }

                                 if (!var15) {
                                    break label107;
                                 }
                              }

                              var18 = var6.getItem() == var2.getItem();
                              break label79;
                           }

                           var18 = ItemStack.matches(var6, var2);
                        }

                        var7 =((Boolean)( var18));
                     }
                  }

                  var13 = Intrinsics.areEqual(var1, var3);
               }

               if (var4 != null) {
                  if (!var13) {
                     return false;
                  }

                  var13 = var7;
               }

               if (var4 == null) {
                  return ((Boolean)(Object)(var13));
               }

               if (((Boolean)(Object)(var13))) {
                  return true;
               }

               return false;
            }

            var9 = this.b(var1, var2, var3);
         }

         return var9;
      }

      private final boolean b(BlockPos var1, ItemStack var2, BlockPos var3) {
          boolean var10 = false; // PX-FIX decl var10
      Object var9 = null; // PX-FIX
         int[] var4 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
         if (var4 != null) {
            LocalPlayer var10000 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a()
               .player;
            if (var10000 != null) {
               boolean var7;
               label60: {
                  label67: {
                     ItemStack var6;
                     LocalPlayer var5 = var10000;
                     ItemStack var8 = var5.getMainHandItem();
                     short var10002 = 7638;
                     short var10003 = -29023;
                     Intrinsics.checkNotNullExpressionValue(var8, "getMainHandItem(...)");
                     var6 = var8;
                     var7 = false;
                     var9 = var2;
                     label58:
                     if (var4 != null) {
                        if (var2 == null) {
                           var9 = var6;
                           if (var4 == null) {
                              break label58;
                           }

                           if (var6.isEmpty()) {
                              var7 = true;
                              if (var4 != null) {
                                 break label67;
                              }
                           }
                        }

                        var9 = var2;
                     }

                     if (var4 != null) {
                        if (var9 == null) {
                           break label67;
                        }

                        var9 = var6;
                     }

                     var10 = ((me.octo.client.PXDyn)var9).isEmpty();
                     if (var4 == null) {
                        break label60;
                     }

                     if (!var10) {
                        var7 = ItemStack.matches(var6, var2);
                     }
                  }

                  var10 = Intrinsics.areEqual(var1, var3);
               }

               if (var4 != null) {
                  if (!var10) {
                     return false;
                  }

                  var10 = var7;
               }

               if (var4 == null) {
                  return var10;
               }

               if (var10) {
                  return true;
               }

               return false;
            }
         }

         return false;
      }

      private final String a(ItemStack var1) {
         int[] var2 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
         if (var2 != null) {
            ItemLore var10000 = var1.get(DataComponents.LORE);
            if (var10000 != null) {
               ItemLore var3 = var10000;
               StringBuilder var4 = new StringBuilder();
               StringBuilder var5 = var4;
               boolean var6 = false;

               for (Object var9 : var3.lines()) {
                  short var10002 = 7632;
                  short var10003 = -21838;
                  Intrinsics.checkNotNullExpressionValue(var9, "next(...)");
                  Component var8 = (Component)var9;
                  var5.append(var8.getString());
                  var5.append(" ");
                  if (var2 != null && var2 != null) {
                     continue;
                  }
                  break;
               }

               return var4.toString();
            }
         }

         return null;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[7];
         int var3 = 0;
         String var2 = "ÌÊ=k\u0095\u0090¦\u0012\u0015\u00072\t \u0085\u0003ã[\u0011\u009d\u009f.Â\u0018\u0007\u0084Æ4\rl6\u0083z~×!\u00056N<\u0012Æ\b\u0099ï\rð%hÚá";
         int var4 = "ÌÊ=k\u0095\u0090¦\u0012\u0015\u00072\t \u0085\u0003ã[\u0011\u009d\u009f.Â\u0018\u0007\u0084Æ4\rl6\u0083z~×!\u00056N<\u0012Æ\b\u0099ï\rð%hÚá"
            .length();
         char var1 = '\t';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 65;
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
                        case 0 -> 41;
                        case 1 -> 44;
                        case 2 -> 51;
                        case 3 -> 99;
                        case 4 -> 98;
                        case 5 -> 44;
                        default -> 50;
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
                        b = new String[7];
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

                     var2 = "Ng2\u009cËL6;|LRu\u0084Ç¹aÝÛhë\u0014¾\u0094,â\b\u0083NÂss³\u0092¸;>þ-(v\u0095";
                     var4 = "Ng2\u009cËL6;|LRu\u0084Ç¹aÝÛhë\u0014¾\u0094,â\b\u0083NÂss³\u0092¸;>þ-(v\u0095".length();
                     var1 = 20;
                     var8 = -1;
               }

               var10000 = 16;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 7632) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 195;
               case 1 -> 58;
               case 2 -> 90;
               case 3 -> 3;
               case 4 -> 46;
               case 5 -> 170;
               case 6 -> 253;
               case 7 -> 31;
               case 8 -> 249;
               case 9 -> 132;
               case 10 -> 80;
               case 11 -> 89;
               case 12 -> 240;
               case 13 -> 221;
               case 14 -> 209;
               case 15 -> 83;
               case 16 -> 85;
               case 17 -> 226;
               case 18 -> 248;
               case 19 -> 1;
               case 20 -> 225;
               case 21 -> 50;
               case 22 -> 175;
               case 23 -> 207;
               case 24 -> 179;
               case 25 -> 14;
               case 26 -> 204;
               case 27 -> 146;
               case 28 -> 60;
               case 29 -> 136;
               case 30 -> 149;
               case 31 -> 47;
               case 32 -> 159;
               case 33 -> 190;
               case 34 -> 36;
               case 35 -> 74;
               case 36 -> 88;
               case 37 -> 69;
               case 38 -> 138;
               case 39 -> 118;
               case 40 -> 161;
               case 41 -> 218;
               case 42 -> 199;
               case 43 -> 129;
               case 44 -> 167;
               case 45 -> 181;
               case 46 -> 187;
               case 47 -> 127;
               case 48 -> 142;
               case 49 -> 102;
               case 50 -> 57;
               case 51 -> 81;
               case 52 -> 114;
               case 53 -> 109;
               case 54 -> 54;
               case 55 -> 108;
               case 56 -> 2;
               case 57 -> 125;
               case 58 -> 42;
               case 59 -> 91;
               case 60 -> 160;
               case 61 -> 97;
               case 62 -> 61;
               case 63 -> 27;
               case 64 -> 145;
               case 65 -> 224;
               case 66 -> 212;
               case 67 -> 38;
               case 68 -> 242;
               case 69 -> 255;
               case 70 -> 100;
               case 71 -> 72;
               case 72 -> 157;
               case 73 -> 140;
               case 74 -> 115;
               case 75 -> 30;
               case 76 -> 154;
               case 77 -> 192;
               case 78 -> 208;
               case 79 -> 183;
               case 80 -> 137;
               case 81 -> 151;
               case 82 -> 152;
               case 83 -> 20;
               case 84 -> 139;
               case 85 -> 153;
               case 86 -> 184;
               case 87 -> 254;
               case 88 -> 62;
               case 89 -> 40;
               case 90 -> 196;
               case 91 -> 0;
               case 92 -> 205;
               case 93 -> 182;
               case 94 -> 23;
               case 95 -> 18;
               case 96 -> 101;
               case 97 -> 178;
               case 98 -> 180;
               case 99 -> 104;
               case 100 -> 210;
               case 101 -> 166;
               case 102 -> 177;
               case 103 -> 5;
               case 104 -> 123;
               case 105 -> 201;
               case 106 -> 82;
               case 107 -> 78;
               case 108 -> 12;
               case 109 -> 39;
               case 110 -> 15;
               case 111 -> 251;
               case 112 -> 168;
               case 113 -> 44;
               case 114 -> 112;
               case 115 -> 37;
               case 116 -> 165;
               case 117 -> 28;
               case 118 -> 29;
               case 119 -> 234;
               case 120 -> 33;
               case 121 -> 67;
               case 122 -> 141;
               case 123 -> 135;
               case 124 -> 49;
               case 125 -> 164;
               case 126 -> 43;
               case 127 -> 98;
               case 128 -> 103;
               case 129 -> 53;
               case 130 -> 73;
               case 131 -> 244;
               case 132 -> 65;
               case 133 -> 113;
               case 134 -> 216;
               case 135 -> 193;
               case 136 -> 150;
               case 137 -> 252;
               case 138 -> 219;
               case 139 -> 130;
               case 140 -> 121;
               case 141 -> 128;
               case 142 -> 110;
               case 143 -> 203;
               case 144 -> 186;
               case 145 -> 235;
               case 146 -> 48;
               case 147 -> 32;
               case 148 -> 238;
               case 149 -> 236;
               case 150 -> 35;
               case 151 -> 147;
               case 152 -> 247;
               case 153 -> 206;
               case 154 -> 239;
               case 155 -> 155;
               case 156 -> 59;
               case 157 -> 169;
               case 158 -> 176;
               case 159 -> 126;
               case 160 -> 55;
               case 161 -> 16;
               case 162 -> 233;
               case 163 -> 111;
               case 164 -> 232;
               case 165 -> 156;
               case 166 -> 213;
               case 167 -> 99;
               case 168 -> 4;
               case 169 -> 13;
               case 170 -> 7;
               case 171 -> 8;
               case 172 -> 171;
               case 173 -> 217;
               case 174 -> 79;
               case 175 -> 197;
               case 176 -> 107;
               case 177 -> 250;
               case 178 -> 52;
               case 179 -> 17;
               case 180 -> 131;
               case 181 -> 119;
               case 182 -> 95;
               case 183 -> 243;
               case 184 -> 92;
               case 185 -> 68;
               case 186 -> 223;
               case 187 -> 70;
               case 188 -> 10;
               case 189 -> 96;
               case 190 -> 9;
               case 191 -> 26;
               case 192 -> 41;
               case 193 -> 222;
               case 194 -> 11;
               case 195 -> 202;
               case 196 -> 230;
               case 197 -> 86;
               case 198 -> 194;
               case 199 -> 77;
               case 200 -> 162;
               case 201 -> 163;
               case 202 -> 231;
               case 203 -> 45;
               case 204 -> 174;
               case 205 -> 144;
               case 206 -> 19;
               case 207 -> 22;
               case 208 -> 215;
               case 209 -> 173;
               case 210 -> 34;
               case 211 -> 51;
               case 212 -> 241;
               case 213 -> 71;
               case 214 -> 237;
               case 215 -> 158;
               case 216 -> 133;
               case 217 -> 122;
               case 218 -> 189;
               case 219 -> 214;
               case 220 -> 200;
               case 221 -> 220;
               case 222 -> 105;
               case 223 -> 245;
               case 224 -> 185;
               case 225 -> 143;
               case 226 -> 6;
               case 227 -> 66;
               case 228 -> 198;
               case 229 -> 116;
               case 230 -> 227;
               case 231 -> 211;
               case 232 -> 229;
               case 233 -> 75;
               case 234 -> 106;
               case 235 -> 21;
               case 236 -> 24;
               case 237 -> 87;
               case 238 -> 148;
               case 239 -> 25;
               case 240 -> 120;
               case 241 -> 64;
               case 242 -> 124;
               case 243 -> 93;
               case 244 -> 191;
               case 245 -> 76;
               case 246 -> 228;
               case 247 -> 117;
               case 248 -> 172;
               case 249 -> 134;
               case 250 -> 246;
               case 251 -> 63;
               case 252 -> 94;
               case 253 -> 56;
               case 254 -> 188;
               default -> 84;
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
}
