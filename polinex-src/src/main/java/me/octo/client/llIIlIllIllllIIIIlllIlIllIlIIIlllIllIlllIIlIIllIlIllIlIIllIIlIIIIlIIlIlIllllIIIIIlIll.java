package me.octo.client;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import java.util.function.Supplier;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.renderer.MappableRingBuffer;
import org.jetbrains.annotations.NotNull;

public enum llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll {

   IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
   lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
   IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
   IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
   IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   public static <T> T b(Object p0, Object p1) { return null; } // PX-FIX ovld

   public static EnumEntries<llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll> IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;

   llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll(Object... pxVarargs) {
      this("", 0); // PX-FIX: 委托主构造器（final 字段初始化）
   }


   @NotNull
   private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] a;
   private static String[] b;

   private llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll(String var3, int var4) {
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var3;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var4;
   }

   @NotNull
   public final String a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   public final int b() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final String c() {
      short var10002 = -16707;
      short var10003 = 26133;
      var10003 = -16710;
      short var10004 = -17105;
      var10004 = -16736;
      short var10005 = 25788;
      return "Polinex Uniform "
         + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         + " ("
         + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         + "b)";
   }

   @JvmOverloads
   @NotNull
   public final GpuBufferSlice a(@NotNull Supplier<String> var1) {
      short var10001 = -16714;
      short var10002 = 16085;
      Intrinsics.checkNotNullParameter(var1, "labelGetter");
      GpuBufferSlice var10000 = lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.a()
         .createBuffer(var1, 130, this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII)
         .slice();
      var10002 = -16706;
      short var10003 = 371;
      Intrinsics.checkNotNullExpressionValue(var10000, "slice(...)");
      return var10000;
   }

   @JvmOverloads
   @NotNull
   public final MappableRingBuffer b(@NotNull Supplier<String> var1) {
      short var10001 = -16712;
      short var10002 = -31559;
      Intrinsics.checkNotNullParameter(var1, "labelGetter");
      return new MappableRingBuffer(var1, 130, this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
   }

   public static llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll[] d() {
         return (llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll[])lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.clone();
   }

   public static llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll a(String var0) {
      return Enum.valueOf(llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.class, var0);
   }

   @NotNull
   public static EnumEntries<llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll> e() {
         return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   @JvmOverloads
   @NotNull
   public final GpuBufferSlice f() {
      return (GpuBufferSlice)(Object)a(((Integer)(Object)(this)), 0);
   }

   @JvmOverloads
   @NotNull
   public final MappableRingBuffer g() {
      return b(this, null);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static final llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll[] lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll[]{IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll};

   private static UnsupportedOperationException a(UnsupportedOperationException var0) {
      return var0;
   }

   private static final llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll[] h() {
      llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll[] var0 = new llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll[5];
      var0[0] = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      var0[1] = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      var0[2] = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      var0[3] = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      var0[4] = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      return var0;
   }

   public static GpuBufferSlice a(llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll var0, Supplier<String> var1, int var2, Object var3) {
      try {
         if (var3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSingleBuffer");
         }

         if ((var2 & 1) != 0) {
            var1 = new Supplier<String>() {
               public String get() {
                  return var0.c();
               }
            };
         }
      } catch (UnsupportedOperationException var4) {
         throw a(var4);
      }

      return var0.a(var1);
   }

   public static MappableRingBuffer b(llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll var0, Supplier<String> var1, int var2, Object var3) {
      try {
         if (var3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createRingBuffer");
         }

         if ((var2 & 1) != 0) {
            var1 = new Supplier<String>() {
               public String get() {
                  return var0.c();
               }
            };
         }
      } catch (UnsupportedOperationException var4) {
         throw a(var4);
      }

      return var0.b(var1);
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -16719) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 89;
            case 1 -> 85;
            case 2 -> 156;
            case 3 -> 155;
            case 4 -> 240;
            case 5 -> 243;
            case 6 -> 151;
            case 7 -> 217;
            case 8 -> 124;
            case 9 -> 92;
            case 10 -> 112;
            case 11 -> 32;
            case 12 -> 78;
            case 13 -> 18;
            case 14 -> 46;
            case 15 -> 11;
            case 16 -> 27;
            case 17 -> 101;
            case 18 -> 30;
            case 19 -> 147;
            case 20 -> 111;
            case 21 -> 134;
            case 22 -> 129;
            case 23 -> 185;
            case 24 -> 83;
            case 25 -> 16;
            case 26 -> 235;
            case 27 -> 227;
            case 28 -> 57;
            case 29 -> 141;
            case 30 -> 39;
            case 31 -> 113;
            case 32 -> 142;
            case 33 -> 172;
            case 34 -> 180;
            case 35 -> 189;
            case 36 -> 178;
            case 37 -> 140;
            case 38 -> 40;
            case 39 -> 56;
            case 40 -> 130;
            case 41 -> 222;
            case 42 -> 234;
            case 43 -> 239;
            case 44 -> 65;
            case 45 -> 144;
            case 46 -> 173;
            case 47 -> 188;
            case 48 -> 95;
            case 49 -> 25;
            case 50 -> 175;
            case 51 -> 38;
            case 52 -> 197;
            case 53 -> 176;
            case 54 -> 203;
            case 55 -> 123;
            case 56 -> 171;
            case 57 -> 60;
            case 58 -> 77;
            case 59 -> 70;
            case 60 -> 80;
            case 61 -> 204;
            case 62 -> 157;
            case 63 -> 24;
            case 64 -> 167;
            case 65 -> 43;
            case 66 -> 22;
            case 67 -> 168;
            case 68 -> 252;
            case 69 -> 109;
            case 70 -> 150;
            case 71 -> 87;
            case 72 -> 48;
            case 73 -> 4;
            case 74 -> 236;
            case 75 -> 164;
            case 76 -> 159;
            case 77 -> 41;
            case 78 -> 187;
            case 79 -> 229;
            case 80 -> 35;
            case 81 -> 20;
            case 82 -> 216;
            case 83 -> 200;
            case 84 -> 36;
            case 85 -> 166;
            case 86 -> 64;
            case 87 -> 128;
            case 88 -> 1;
            case 89 -> 184;
            case 90 -> 214;
            case 91 -> 241;
            case 92 -> 119;
            case 93 -> 6;
            case 94 -> 66;
            case 95 -> 145;
            case 96 -> 170;
            case 97 -> 244;
            case 98 -> 179;
            case 99 -> 191;
            case 100 -> 202;
            case 101 -> 215;
            case 102 -> 193;
            case 103 -> 253;
            case 104 -> 99;
            case 105 -> 55;
            case 106 -> 47;
            case 107 -> 26;
            case 108 -> 206;
            case 109 -> 103;
            case 110 -> 14;
            case 111 -> 94;
            case 112 -> 118;
            case 113 -> 181;
            case 114 -> 76;
            case 115 -> 177;
            case 116 -> 207;
            case 117 -> 58;
            case 118 -> 210;
            case 119 -> 117;
            case 120 -> 225;
            case 121 -> 233;
            case 122 -> 201;
            case 123 -> 174;
            case 124 -> 5;
            case 125 -> 115;
            case 126 -> 213;
            case 127 -> 138;
            case 128 -> 116;
            case 129 -> 84;
            case 130 -> 28;
            case 131 -> 96;
            case 132 -> 238;
            case 133 -> 45;
            case 134 -> 248;
            case 135 -> 37;
            case 136 -> 152;
            case 137 -> 69;
            case 138 -> 143;
            case 139 -> 102;
            case 140 -> 114;
            case 141 -> 86;
            case 142 -> 67;
            case 143 -> 232;
            case 144 -> 196;
            case 145 -> 247;
            case 146 -> 146;
            case 147 -> 17;
            case 148 -> 31;
            case 149 -> 8;
            case 150 -> 220;
            case 151 -> 254;
            case 152 -> 195;
            case 153 -> 190;
            case 154 -> 224;
            case 155 -> 125;
            case 156 -> 33;
            case 157 -> 208;
            case 158 -> 226;
            case 159 -> 127;
            case 160 -> 68;
            case 161 -> 15;
            case 162 -> 211;
            case 163 -> 137;
            case 164 -> 246;
            case 165 -> 53;
            case 166 -> 218;
            case 167 -> 72;
            case 168 -> 81;
            case 169 -> 223;
            case 170 -> 242;
            case 171 -> 160;
            case 172 -> 163;
            case 173 -> 3;
            case 174 -> 255;
            case 175 -> 0;
            case 176 -> 135;
            case 177 -> 10;
            case 178 -> 192;
            case 179 -> 237;
            case 180 -> 126;
            case 181 -> 106;
            case 182 -> 19;
            case 183 -> 250;
            case 184 -> 91;
            case 185 -> 42;
            case 186 -> 100;
            case 187 -> 29;
            case 188 -> 49;
            case 189 -> 104;
            case 190 -> 75;
            case 191 -> 50;
            case 192 -> 228;
            case 193 -> 107;
            case 194 -> 122;
            case 195 -> 90;
            case 196 -> 209;
            case 197 -> 162;
            case 198 -> 108;
            case 199 -> 148;
            case 200 -> 79;
            case 201 -> 9;
            case 202 -> 73;
            case 203 -> 34;
            case 204 -> 59;
            case 205 -> 212;
            case 206 -> 139;
            case 207 -> 7;
            case 208 -> 161;
            case 209 -> 230;
            case 210 -> 251;
            case 211 -> 110;
            case 212 -> 199;
            case 213 -> 153;
            case 214 -> 71;
            case 215 -> 23;
            case 216 -> 13;
            case 217 -> 74;
            case 218 -> 88;
            case 219 -> 131;
            case 220 -> 2;
            case 221 -> 136;
            case 222 -> 133;
            case 223 -> 21;
            case 224 -> 219;
            case 225 -> 44;
            case 226 -> 194;
            case 227 -> 245;
            case 228 -> 249;
            case 229 -> 54;
            case 230 -> 186;
            case 231 -> 205;
            case 232 -> 98;
            case 233 -> 165;
            case 234 -> 62;
            case 235 -> 51;
            case 236 -> 132;
            case 237 -> 120;
            case 238 -> 231;
            case 239 -> 82;
            case 240 -> 63;
            case 241 -> 182;
            case 242 -> 221;
            case 243 -> 105;
            case 244 -> 183;
            case 245 -> 149;
            case 246 -> 158;
            case 247 -> 121;
            case 248 -> 93;
            case 249 -> 52;
            case 250 -> 169;
            case 251 -> 61;
            case 252 -> 12;
            case 253 -> 154;
            case 254 -> 97;
            default -> 198;
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


   // PX-FIX: original <clinit> does putstatic IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = EnumEntriesKt.enumEntries(lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll)
   static {
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = EnumEntriesKt.enumEntries(lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll);
   }
}
