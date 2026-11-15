package me.octo.client;

import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.core.RegistryAccess.Frozen;
import net.minecraft.resources.RegistryOps;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llIllIlIIIlIIllllIIllllIlIIIIIlIIlIlIllIIllllllIIlIIIIlllIIlIIlIlIIllIlIlIlIIlIllIIll {
   @NotNull
   public static llIllIlIIIlIIllllIIllllIlIIIIIlIIlIlIllIIllllllIIlIIIIlllIIlIIlIlIIllIlIlIlIIlIllIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static ConcurrentHashMap<String, ItemStack> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] a;
   private static String[] b;

   private llIllIlIIIlIIllllIIllllIlIIIIIlIIlIlIllIIllllllIIlIIIIlllIIlIIlIlIIllIlIlIlIIlIllIIll() {
   }

   @Nullable
   public final ItemStack a(@NotNull lIlllllIIIlllIlIllIIlllIIlIlIIIllIllllIlIIllIIlIlllIIllIIIIllIlIIlIlIlIllIllIlIllIIlI var1) {
      String var10000 = lIlllllIIIlllIlIllIIlllIIlIlIIIllIllllIlIIllIIlIlllIIllIIIIllIlIIlIlIlIllIllIlIllIIlI.i();
      short var10002 = 29611;
      short var10003 = 7698;
      Intrinsics.checkNotNullParameter(var1, "slot");
      String var2 = var10000;
      var10000 = var1.d().toString();
      var10002 = 29610;
      var10003 = -8424;
      Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
      String var3 = var10000;
      if (var2 != null) {
         ItemStack var10 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.get(var3);
         if (var10 != null) {
            ItemStack var8 = var10;
            boolean var7 = false;
            return var8;
         }
      }

      if (var2 != null) {
         ClientPacketListener var11 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .getConnection();
         if (var11 != null) {
            Frozen var12 = var11.registryAccess();
            if (var12 != null) {
               Frozen var4 = var12;
               RegistryOps var13 = RegistryOps.create((DynamicOps)JsonOps.INSTANCE, var4);
               var10002 = 29608;
               var10003 = 5279;
               Intrinsics.checkNotNullExpressionValue(var13, "create(...)");
               RegistryOps var5 = var13;
               if (var2 != null) {
                  ItemStack var14 = (ItemStack)ItemStack.CODEC.parse(var5, var1.d()).result().orElse(null);
                  if (var14 != null) {
                     ItemStack var6 = var14;
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.put(var3, var6);
                     return var6;
                  }
               }

               return null;
            }
         }
      }

      return null;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "\u0004-=ß]r¢²\u0094ç\u001d\u0088{\u0004+M\u0003°\u000b\u0089xOÞåé5\u0005îq\u0093";
      int var4 = "\u0004-=ß]r¢²\u0094ç\u001d\u0088{\u0004+M\u0003°\u000b\u0089xOÞåé5\u0005îq\u0093".length();
      char var1 = '\r';
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 8;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 8;
               var10006 = var6;
            } else {
               var13 = 8;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 8;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 16;
                  case 1 -> 101;
                  case 2 -> 31;
                  case 3 -> 41;
                  case 4 -> 91;
                  case 5 -> 54;
                  default -> 57;
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
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIllIlIIIlIIllllIIllllIlIIIIIlIIlIlIllIIllllllIIlIIIIlllIIlIIlIlIIllIlIlIlIIlIllIIll();
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new ConcurrentHashMap<>();
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 29610) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 217;
            case 1 -> 238;
            case 2 -> 243;
            case 3 -> 65;
            case 4 -> 215;
            case 5 -> 18;
            case 6 -> 130;
            case 7 -> 233;
            case 8 -> 51;
            case 9 -> 111;
            case 10 -> 59;
            case 11 -> 183;
            case 12 -> 193;
            case 13 -> 129;
            case 14 -> 25;
            case 15 -> 227;
            case 16 -> 81;
            case 17 -> 202;
            case 18 -> 90;
            case 19 -> 151;
            case 20 -> 69;
            case 21 -> 55;
            case 22 -> 22;
            case 23 -> 196;
            case 24 -> 225;
            case 25 -> 66;
            case 26 -> 197;
            case 27 -> 252;
            case 28 -> 176;
            case 29 -> 185;
            case 30 -> 208;
            case 31 -> 153;
            case 32 -> 78;
            case 33 -> 3;
            case 34 -> 101;
            case 35 -> 60;
            case 36 -> 236;
            case 37 -> 36;
            case 38 -> 241;
            case 39 -> 188;
            case 40 -> 6;
            case 41 -> 228;
            case 42 -> 44;
            case 43 -> 83;
            case 44 -> 209;
            case 45 -> 177;
            case 46 -> 242;
            case 47 -> 104;
            case 48 -> 154;
            case 49 -> 52;
            case 50 -> 165;
            case 51 -> 210;
            case 52 -> 198;
            case 53 -> 152;
            case 54 -> 187;
            case 55 -> 127;
            case 56 -> 41;
            case 57 -> 156;
            case 58 -> 179;
            case 59 -> 99;
            case 60 -> 15;
            case 61 -> 125;
            case 62 -> 170;
            case 63 -> 191;
            case 64 -> 115;
            case 65 -> 219;
            case 66 -> 1;
            case 67 -> 2;
            case 68 -> 50;
            case 69 -> 13;
            case 70 -> 132;
            case 71 -> 88;
            case 72 -> 159;
            case 73 -> 174;
            case 74 -> 244;
            case 75 -> 162;
            case 76 -> 131;
            case 77 -> 122;
            case 78 -> 142;
            case 79 -> 79;
            case 80 -> 38;
            case 81 -> 61;
            case 82 -> 114;
            case 83 -> 128;
            case 84 -> 70;
            case 85 -> 32;
            case 86 -> 57;
            case 87 -> 105;
            case 88 -> 48;
            case 89 -> 212;
            case 90 -> 232;
            case 91 -> 20;
            case 92 -> 246;
            case 93 -> 4;
            case 94 -> 205;
            case 95 -> 189;
            case 96 -> 11;
            case 97 -> 237;
            case 98 -> 27;
            case 99 -> 110;
            case 100 -> 89;
            case 101 -> 139;
            case 102 -> 249;
            case 103 -> 29;
            case 104 -> 147;
            case 105 -> 134;
            case 106 -> 178;
            case 107 -> 144;
            case 108 -> 194;
            case 109 -> 75;
            case 110 -> 103;
            case 111 -> 155;
            case 112 -> 42;
            case 113 -> 203;
            case 114 -> 126;
            case 115 -> 161;
            case 116 -> 80;
            case 117 -> 163;
            case 118 -> 8;
            case 119 -> 218;
            case 120 -> 23;
            case 121 -> 213;
            case 122 -> 206;
            case 123 -> 54;
            case 124 -> 108;
            case 125 -> 113;
            case 126 -> 190;
            case 127 -> 43;
            case 128 -> 86;
            case 129 -> 148;
            case 130 -> 9;
            case 131 -> 10;
            case 132 -> 141;
            case 133 -> 223;
            case 134 -> 175;
            case 135 -> 5;
            case 136 -> 226;
            case 137 -> 121;
            case 138 -> 143;
            case 139 -> 137;
            case 140 -> 76;
            case 141 -> 82;
            case 142 -> 16;
            case 143 -> 224;
            case 144 -> 200;
            case 145 -> 173;
            case 146 -> 195;
            case 147 -> 97;
            case 148 -> 30;
            case 149 -> 56;
            case 150 -> 7;
            case 151 -> 33;
            case 152 -> 62;
            case 153 -> 72;
            case 154 -> 250;
            case 155 -> 17;
            case 156 -> 119;
            case 157 -> 49;
            case 158 -> 145;
            case 159 -> 239;
            case 160 -> 58;
            case 161 -> 216;
            case 162 -> 77;
            case 163 -> 123;
            case 164 -> 47;
            case 165 -> 169;
            case 166 -> 107;
            case 167 -> 85;
            case 168 -> 96;
            case 169 -> 37;
            case 170 -> 94;
            case 171 -> 106;
            case 172 -> 19;
            case 173 -> 207;
            case 174 -> 230;
            case 175 -> 168;
            case 176 -> 255;
            case 177 -> 109;
            case 178 -> 35;
            case 179 -> 180;
            case 180 -> 222;
            case 181 -> 91;
            case 182 -> 28;
            case 183 -> 87;
            case 184 -> 229;
            case 185 -> 84;
            case 186 -> 171;
            case 187 -> 251;
            case 188 -> 211;
            case 189 -> 157;
            case 190 -> 93;
            case 191 -> 199;
            case 192 -> 0;
            case 193 -> 24;
            case 194 -> 172;
            case 195 -> 92;
            case 196 -> 45;
            case 197 -> 201;
            case 198 -> 102;
            case 199 -> 95;
            case 200 -> 181;
            case 201 -> 182;
            case 202 -> 133;
            case 203 -> 68;
            case 204 -> 118;
            case 205 -> 167;
            case 206 -> 220;
            case 207 -> 234;
            case 208 -> 116;
            case 209 -> 46;
            case 210 -> 71;
            case 211 -> 240;
            case 212 -> 63;
            case 213 -> 231;
            case 214 -> 120;
            case 215 -> 26;
            case 216 -> 39;
            case 217 -> 138;
            case 218 -> 53;
            case 219 -> 149;
            case 220 -> 14;
            case 221 -> 136;
            case 222 -> 117;
            case 223 -> 67;
            case 224 -> 192;
            case 225 -> 74;
            case 226 -> 21;
            case 227 -> 124;
            case 228 -> 40;
            case 229 -> 73;
            case 230 -> 184;
            case 231 -> 245;
            case 232 -> 253;
            case 233 -> 164;
            case 234 -> 112;
            case 235 -> 254;
            case 236 -> 31;
            case 237 -> 34;
            case 238 -> 204;
            case 239 -> 64;
            case 240 -> 135;
            case 241 -> 221;
            case 242 -> 186;
            case 243 -> 140;
            case 244 -> 98;
            case 245 -> 150;
            case 246 -> 235;
            case 247 -> 146;
            case 248 -> 248;
            case 249 -> 166;
            case 250 -> 158;
            case 251 -> 214;
            case 252 -> 160;
            case 253 -> 247;
            case 254 -> 100;
            default -> 12;
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
