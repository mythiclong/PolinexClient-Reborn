package me.octo.client.utils;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public enum llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll {
   IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
   lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
   IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
   llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
   lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
   lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
   lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl,
   lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   public static EnumEntries<llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll> llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;

        // PX-FIX varargs-ctor: entry args lost by obfuscator
        llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(Object... px) {
           this("", null, 0, "", null); // PX-FIX: 委托主构造器（final 字段初始化）
        }


   @NotNull
   public static llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private final int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private final String IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private final List<Block> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] a;
   private static String[] b;

   private llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
      String var3,
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var4,
      int var5,
      String var6,
      List<? extends Block> var7
   ) {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var3;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var4;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var5;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var6;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = ((List<Block>)(Object)(var7));
   }

   @NotNull
   public final String a() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI b() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final int c() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @NotNull
   public final String d() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @NotNull
   public final List<Block> e() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   public final boolean a(@NotNull Block var1) {
      String var2;
      Object var9;
      short var10001 = -14863;
      short var10002 = -20350;
      Intrinsics.checkNotNullParameter(var1, "block");
      var9 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
      var var3 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      boolean var4 = false;
      var2 = (String)var9;
      var9 = var3;
      label36:
      if (var2 != null) {
         if (var3 instanceof Collection) {
            var9 = (Collection)var3;
            if (var2 == null) {
               break label36;
            }

            if (((me.octo.client.PXDyn)var9).isEmpty()) {
               return false;
            }
         }

         var9 = var3;
      }

      for (Object var6 : (Iterable<?>)(var9)) {
         Block var7 = (Block)var6;
         boolean var8 = false;
         boolean var10 = Intrinsics.areEqual(var7, var1);

         while (var10) {
            var10 = true;
            if (var2 != null) {
               return true;
            }
         }
      }

      return false;
   }

   public static llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll[] f() {
         return (llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll[])IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.clone();
   }

   public static llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll a(String var0) {
      return Enum.valueOf(llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.class, var0);
   }

   @NotNull
   public static EnumEntries<llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll> g() {
         return llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static final llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll[] IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll[]{IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll, IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII, llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI, lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI, lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl, lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll};

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -14849) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 122;
            case 1 -> 31;
            case 2 -> 206;
            case 3 -> 83;
            case 4 -> 112;
            case 5 -> 165;
            case 6 -> 170;
            case 7 -> 54;
            case 8 -> 47;
            case 9 -> 228;
            case 10 -> 77;
            case 11 -> 118;
            case 12 -> 244;
            case 13 -> 169;
            case 14 -> 39;
            case 15 -> 21;
            case 16 -> 194;
            case 17 -> 172;
            case 18 -> 93;
            case 19 -> 66;
            case 20 -> 51;
            case 21 -> 70;
            case 22 -> 200;
            case 23 -> 250;
            case 24 -> 89;
            case 25 -> 5;
            case 26 -> 202;
            case 27 -> 74;
            case 28 -> 180;
            case 29 -> 121;
            case 30 -> 199;
            case 31 -> 217;
            case 32 -> 240;
            case 33 -> 248;
            case 34 -> 110;
            case 35 -> 103;
            case 36 -> 157;
            case 37 -> 253;
            case 38 -> 109;
            case 39 -> 129;
            case 40 -> 162;
            case 41 -> 40;
            case 42 -> 4;
            case 43 -> 234;
            case 44 -> 252;
            case 45 -> 201;
            case 46 -> 1;
            case 47 -> 95;
            case 48 -> 137;
            case 49 -> 138;
            case 50 -> 188;
            case 51 -> 156;
            case 52 -> 247;
            case 53 -> 100;
            case 54 -> 8;
            case 55 -> 94;
            case 56 -> 148;
            case 57 -> 58;
            case 58 -> 185;
            case 59 -> 210;
            case 60 -> 227;
            case 61 -> 173;
            case 62 -> 168;
            case 63 -> 176;
            case 64 -> 107;
            case 65 -> 88;
            case 66 -> 215;
            case 67 -> 115;
            case 68 -> 24;
            case 69 -> 32;
            case 70 -> 38;
            case 71 -> 69;
            case 72 -> 207;
            case 73 -> 111;
            case 74 -> 220;
            case 75 -> 22;
            case 76 -> 67;
            case 77 -> 160;
            case 78 -> 167;
            case 79 -> 131;
            case 80 -> 65;
            case 81 -> 101;
            case 82 -> 233;
            case 83 -> 154;
            case 84 -> 84;
            case 85 -> 97;
            case 86 -> 104;
            case 87 -> 141;
            case 88 -> 82;
            case 89 -> 181;
            case 90 -> 214;
            case 91 -> 20;
            case 92 -> 33;
            case 93 -> 45;
            case 94 -> 44;
            case 95 -> 124;
            case 96 -> 189;
            case 97 -> 113;
            case 98 -> 238;
            case 99 -> 105;
            case 100 -> 175;
            case 101 -> 155;
            case 102 -> 241;
            case 103 -> 221;
            case 104 -> 203;
            case 105 -> 187;
            case 106 -> 117;
            case 107 -> 243;
            case 108 -> 53;
            case 109 -> 230;
            case 110 -> 226;
            case 111 -> 222;
            case 112 -> 27;
            case 113 -> 52;
            case 114 -> 35;
            case 115 -> 79;
            case 116 -> 55;
            case 117 -> 232;
            case 118 -> 127;
            case 119 -> 212;
            case 120 -> 86;
            case 121 -> 213;
            case 122 -> 174;
            case 123 -> 239;
            case 124 -> 191;
            case 125 -> 144;
            case 126 -> 78;
            case 127 -> 46;
            case 128 -> 135;
            case 129 -> 41;
            case 130 -> 193;
            case 131 -> 3;
            case 132 -> 196;
            case 133 -> 128;
            case 134 -> 251;
            case 135 -> 195;
            case 136 -> 223;
            case 137 -> 190;
            case 138 -> 139;
            case 139 -> 102;
            case 140 -> 242;
            case 141 -> 161;
            case 142 -> 36;
            case 143 -> 23;
            case 144 -> 184;
            case 145 -> 178;
            case 146 -> 208;
            case 147 -> 125;
            case 148 -> 57;
            case 149 -> 231;
            case 150 -> 0;
            case 151 -> 151;
            case 152 -> 108;
            case 153 -> 159;
            case 154 -> 218;
            case 155 -> 11;
            case 156 -> 98;
            case 157 -> 182;
            case 158 -> 64;
            case 159 -> 136;
            case 160 -> 114;
            case 161 -> 119;
            case 162 -> 126;
            case 163 -> 14;
            case 164 -> 183;
            case 165 -> 166;
            case 166 -> 7;
            case 167 -> 186;
            case 168 -> 177;
            case 169 -> 116;
            case 170 -> 254;
            case 171 -> 142;
            case 172 -> 63;
            case 173 -> 15;
            case 174 -> 18;
            case 175 -> 147;
            case 176 -> 171;
            case 177 -> 71;
            case 178 -> 192;
            case 179 -> 73;
            case 180 -> 68;
            case 181 -> 149;
            case 182 -> 43;
            case 183 -> 143;
            case 184 -> 30;
            case 185 -> 75;
            case 186 -> 28;
            case 187 -> 25;
            case 188 -> 59;
            case 189 -> 19;
            case 190 -> 246;
            case 191 -> 229;
            case 192 -> 245;
            case 193 -> 12;
            case 194 -> 80;
            case 195 -> 72;
            case 196 -> 134;
            case 197 -> 16;
            case 198 -> 209;
            case 199 -> 152;
            case 200 -> 219;
            case 201 -> 92;
            case 202 -> 205;
            case 203 -> 99;
            case 204 -> 62;
            case 205 -> 96;
            case 206 -> 13;
            case 207 -> 198;
            case 208 -> 50;
            case 209 -> 204;
            case 210 -> 216;
            case 211 -> 158;
            case 212 -> 76;
            case 213 -> 153;
            case 214 -> 224;
            case 215 -> 49;
            case 216 -> 9;
            case 217 -> 237;
            case 218 -> 179;
            case 219 -> 132;
            case 220 -> 225;
            case 221 -> 249;
            case 222 -> 6;
            case 223 -> 146;
            case 224 -> 130;
            case 225 -> 197;
            case 226 -> 150;
            case 227 -> 145;
            case 228 -> 85;
            case 229 -> 42;
            case 230 -> 255;
            case 231 -> 211;
            case 232 -> 17;
            case 233 -> 163;
            case 234 -> 60;
            case 235 -> 29;
            case 236 -> 235;
            case 237 -> 91;
            case 238 -> 87;
            case 239 -> 120;
            case 240 -> 26;
            case 241 -> 81;
            case 242 -> 133;
            case 243 -> 34;
            case 244 -> 236;
            case 245 -> 2;
            case 246 -> 140;
            case 247 -> 48;
            case 248 -> 90;
            case 249 -> 37;
            case 250 -> 164;
            case 251 -> 56;
            case 252 -> 123;
            case 253 -> 10;
            case 254 -> 61;
            default -> 106;
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
      private static String a;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @Nullable
      public final llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll a(@NotNull Block var1) {
         String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
         Intrinsics.checkNotNullParameter(var1, a);
         String var2 = var10000;
         Iterable var3 = (Iterable)llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.g();
         boolean var4 = false;

         label20:
         for (Object var6 : var3) {
            var10000 = (String)var6;

            do {
               llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var7 = (llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll)(Object)var10000;
               boolean var8 = false;
               if (!var7.a(var1)) {
                  continue label20;
               }

               var10000 = (String)var6;
            } while (var2 == null);

            return (llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll)var6;
         }

         return (llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll)null;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: { // PX-FIX
         char[] var10003 = "mpw\u001b\u0010".toCharArray();
         int var10004 = var10003.length;
         int var0 = 0;
         byte var6 = 17;
         char[] var10002 = var10003;
         int var1 = var10004;
         byte var10;
         char[] var10005;
         int var10006;
         if (var10004 <= 1) {
            var10005 = var10003;
            var10 = 17;
            var10006 = var0;
         } else {
            var6 = 17;
            var1 = var10004;
            if (var10004 <= var0) {
               String var9 = new String(var10003).intern();
               byte var4 = -1;
               a = var9;
               break pxClinit; // PX-FIX
            }

            var10005 = var10003;
            var10 = 17;
            var10006 = var0;
         }

         while (true) {
            var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
               case 0 -> 30;
               case 1 -> 13;
               case 2 -> 9;
               case 3 -> 105;
               case 4 -> 106;
               case 5 -> 108;
               default -> 62;
            });
            var0++;
            if (var6 == 0) {
               var10006 = var6;
               var10005 = var10002;
               var10 = var6;
            } else {
               if (var1 <= var0) {
                  String var8 = new String(var10002).intern();
                  byte var3 = -1;
                  a = var8;
                  break pxClinit; // PX-FIX
               }

               var10005 = var10002;
               var10 = var6;
               var10006 = var0;
            }
         }
   } // PX-FIX end pxClinit
      }
       public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker var1) { this(); }
   }
    private static final me.octo.client.utils.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll[] h() {
        me.octo.client.utils.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll[] var0 = new me.octo.client.utils.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll[8];
        var0[0] = me.octo.client.utils.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
        var0[1] = me.octo.client.utils.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
        var0[2] = me.octo.client.utils.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
        var0[3] = me.octo.client.utils.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
        var0[4] = me.octo.client.utils.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
        var0[5] = me.octo.client.utils.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
        var0[6] = me.octo.client.utils.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
        var0[7] = me.octo.client.utils.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
        return var0;
    }


   // PX-FIX: original <clinit> does putstatic llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = EnumEntriesKt.enumEntries(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl)
   static {
      llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = EnumEntriesKt.enumEntries(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
   }
}
