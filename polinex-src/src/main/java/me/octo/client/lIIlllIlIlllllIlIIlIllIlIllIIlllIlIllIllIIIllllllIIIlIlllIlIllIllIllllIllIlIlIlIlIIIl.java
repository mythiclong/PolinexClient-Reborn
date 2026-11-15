package me.octo.client;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.core.Direction;
import net.minecraft.world.phys.AABB;
import org.jetbrains.annotations.NotNull;

public enum lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl {

   IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl {
      private final llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll delegate = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll("", 0);

      public void a(
         @NotNull AABB var1,
         @NotNull lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var2
      ) {
         this.delegate.a(var1, var2);
      }

      public int a(@NotNull Direction var1) {
         return this.delegate.a(var1);
      }
   },
   lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII {
      private final IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI delegate = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI("", 0);

      public void a(
         @NotNull AABB var1,
         @NotNull lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var2
      ) {
         this.delegate.a(var1, var2);
      }

      public int a(@NotNull Direction var1) {
         return this.delegate.a(var1);
      }
   };


   public static EnumEntries<lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;

   lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl(Object... pxVarargs) { } // PX-FIX varargs ctor


      /* PX-FIX PhaseA TOP3d2 (SOURCE-LEVEL UNREACHABLE): the jar has a synthetic enum constructor
      <init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V (access 4097, body: aload_0;
      aload_1; iload_2; invokespecial <init>(Ljava/lang/String;I)V; return). javac PREPENDS the implicit
      enum parameters String name,int ordinal to EVERY declared enum constructor (verified experimentally:
      scripts .analysis/agents/TOP3d2/enumtest*.py, and an explicit super(name,ordinal) is rejected with
      "error: call to super not allowed in enum constructor"), so the 3-parameter descriptor cannot be emitted
      from Java source. Same class of wall as phaseA-pass161-recovery-R1.md / -R3.md. This member is therefore
      left unrestored; it is the ONLY remaining MISSING for this class. */

   private static String[] a;
   private static String[] b;

   private lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl() {
   }

   public abstract void a(
      @NotNull AABB var1,
      @NotNull lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var2
   );

   public abstract int a(@NotNull Direction var1);

   public final int a(@NotNull Iterable<? extends Direction> var1) {
      int var10000 = ((IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.c()) ? 1 : 0);
      short var10002 = 16787;
      short var10003 = 574;
      Intrinsics.checkNotNullParameter(var1, "sides");
      int var3 = 0;
      Iterator var4 = var1.iterator();
      boolean var2 = (var10000 != 0);

      while (true) {
         if (var4.hasNext()) {
            Direction var5 = (Direction)var4.next();
            var10000 = var3 | this.a(var5);
            if (var2) {
               break;
            }

            var3 = var10000;
            if (!var2) {
               continue;
            }
         }

         var10000 = var3;
         break;
      }

      return var10000;
   }

   public static lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl[] a() {
         return (lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl[])IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.clone();
   }

   public static lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl a(String var0) {
      return Enum.valueOf(lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.class, var0);
   }

   @NotNull
   public static EnumEntries<lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl> b() {
         return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static final lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl[]{IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII};

   // PX-FIX PhaseA TOP3d2: jar values-array builder (private static final, descriptor ()[Lme/octo/client/lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl;)
   private static final lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl[] c() {
      lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl[] var0 = new lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl[2];
      var0[0] = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      var0[1] = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 16786) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 59;
            case 1 -> 170;
            case 2 -> 97;
            case 3 -> 24;
            case 4 -> 23;
            case 5 -> 178;
            case 6 -> 156;
            case 7 -> 102;
            case 8 -> 219;
            case 9 -> 143;
            case 10 -> 247;
            case 11 -> 26;
            case 12 -> 251;
            case 13 -> 55;
            case 14 -> 16;
            case 15 -> 202;
            case 16 -> 226;
            case 17 -> 117;
            case 18 -> 173;
            case 19 -> 94;
            case 20 -> 168;
            case 21 -> 224;
            case 22 -> 166;
            case 23 -> 107;
            case 24 -> 14;
            case 25 -> 243;
            case 26 -> 126;
            case 27 -> 92;
            case 28 -> 132;
            case 29 -> 64;
            case 30 -> 133;
            case 31 -> 176;
            case 32 -> 158;
            case 33 -> 145;
            case 34 -> 197;
            case 35 -> 124;
            case 36 -> 22;
            case 37 -> 30;
            case 38 -> 183;
            case 39 -> 177;
            case 40 -> 193;
            case 41 -> 137;
            case 42 -> 27;
            case 43 -> 175;
            case 44 -> 115;
            case 45 -> 111;
            case 46 -> 9;
            case 47 -> 152;
            case 48 -> 7;
            case 49 -> 10;
            case 50 -> 164;
            case 51 -> 165;
            case 52 -> 86;
            case 53 -> 239;
            case 54 -> 155;
            case 55 -> 13;
            case 56 -> 244;
            case 57 -> 195;
            case 58 -> 93;
            case 59 -> 54;
            case 60 -> 98;
            case 61 -> 29;
            case 62 -> 0;
            case 63 -> 191;
            case 64 -> 83;
            case 65 -> 238;
            case 66 -> 81;
            case 67 -> 174;
            case 68 -> 198;
            case 69 -> 91;
            case 70 -> 157;
            case 71 -> 60;
            case 72 -> 96;
            case 73 -> 20;
            case 74 -> 68;
            case 75 -> 230;
            case 76 -> 76;
            case 77 -> 70;
            case 78 -> 125;
            case 79 -> 153;
            case 80 -> 122;
            case 81 -> 41;
            case 82 -> 95;
            case 83 -> 205;
            case 84 -> 161;
            case 85 -> 222;
            case 86 -> 118;
            case 87 -> 116;
            case 88 -> 28;
            case 89 -> 90;
            case 90 -> 215;
            case 91 -> 162;
            case 92 -> 72;
            case 93 -> 229;
            case 94 -> 25;
            case 95 -> 71;
            case 96 -> 234;
            case 97 -> 99;
            case 98 -> 223;
            case 99 -> 31;
            case 100 -> 146;
            case 101 -> 235;
            case 102 -> 114;
            case 103 -> 12;
            case 104 -> 194;
            case 105 -> 119;
            case 106 -> 208;
            case 107 -> 4;
            case 108 -> 189;
            case 109 -> 151;
            case 110 -> 50;
            case 111 -> 89;
            case 112 -> 180;
            case 113 -> 221;
            case 114 -> 104;
            case 115 -> 80;
            case 116 -> 130;
            case 117 -> 169;
            case 118 -> 43;
            case 119 -> 201;
            case 120 -> 213;
            case 121 -> 44;
            case 122 -> 46;
            case 123 -> 21;
            case 124 -> 245;
            case 125 -> 140;
            case 126 -> 225;
            case 127 -> 120;
            case 128 -> 227;
            case 129 -> 18;
            case 130 -> 129;
            case 131 -> 112;
            case 132 -> 217;
            case 133 -> 105;
            case 134 -> 135;
            case 135 -> 32;
            case 136 -> 142;
            case 137 -> 134;
            case 138 -> 240;
            case 139 -> 66;
            case 140 -> 49;
            case 141 -> 216;
            case 142 -> 19;
            case 143 -> 87;
            case 144 -> 33;
            case 145 -> 110;
            case 146 -> 147;
            case 147 -> 58;
            case 148 -> 37;
            case 149 -> 248;
            case 150 -> 192;
            case 151 -> 220;
            case 152 -> 250;
            case 153 -> 101;
            case 154 -> 56;
            case 155 -> 74;
            case 156 -> 108;
            case 157 -> 154;
            case 158 -> 236;
            case 159 -> 47;
            case 160 -> 253;
            case 161 -> 79;
            case 162 -> 8;
            case 163 -> 34;
            case 164 -> 61;
            case 165 -> 40;
            case 166 -> 186;
            case 167 -> 204;
            case 168 -> 53;
            case 169 -> 255;
            case 170 -> 103;
            case 171 -> 179;
            case 172 -> 57;
            case 173 -> 172;
            case 174 -> 5;
            case 175 -> 188;
            case 176 -> 254;
            case 177 -> 73;
            case 178 -> 150;
            case 179 -> 196;
            case 180 -> 160;
            case 181 -> 149;
            case 182 -> 228;
            case 183 -> 184;
            case 184 -> 15;
            case 185 -> 51;
            case 186 -> 6;
            case 187 -> 63;
            case 188 -> 127;
            case 189 -> 35;
            case 190 -> 190;
            case 191 -> 200;
            case 192 -> 159;
            case 193 -> 212;
            case 194 -> 78;
            case 195 -> 209;
            case 196 -> 167;
            case 197 -> 45;
            case 198 -> 38;
            case 199 -> 211;
            case 200 -> 128;
            case 201 -> 163;
            case 202 -> 84;
            case 203 -> 252;
            case 204 -> 3;
            case 205 -> 42;
            case 206 -> 48;
            case 207 -> 210;
            case 208 -> 106;
            case 209 -> 203;
            case 210 -> 148;
            case 211 -> 233;
            case 212 -> 67;
            case 213 -> 207;
            case 214 -> 75;
            case 215 -> 141;
            case 216 -> 85;
            case 217 -> 242;
            case 218 -> 171;
            case 219 -> 249;
            case 220 -> 82;
            case 221 -> 144;
            case 222 -> 185;
            case 223 -> 136;
            case 224 -> 88;
            case 225 -> 182;
            case 226 -> 109;
            case 227 -> 113;
            case 228 -> 214;
            case 229 -> 187;
            case 230 -> 123;
            case 231 -> 181;
            case 232 -> 241;
            case 233 -> 138;
            case 234 -> 11;
            case 235 -> 62;
            case 236 -> 199;
            case 237 -> 100;
            case 238 -> 65;
            case 239 -> 69;
            case 240 -> 231;
            case 241 -> 52;
            case 242 -> 1;
            case 243 -> 131;
            case 244 -> 232;
            case 245 -> 121;
            case 246 -> 206;
            case 247 -> 17;
            case 248 -> 246;
            case 249 -> 2;
            case 250 -> 139;
            case 251 -> 237;
            case 252 -> 36;
            case 253 -> 77;
            case 254 -> 39;
            default -> 218;
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

   public interface IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      void a(int var1, double var2, double var4, double var6);
   }

   static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
 /* PX-FIX: illegal extends lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl */ {
   public static me.octo.client.PXDyn llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll = null; // PX-FIX missing field v2
   
      private static String[] c;
      private static String[] d;

      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(String var1, int var2) {
         /* PX-FIX removed super call */
      }

      public void a(
         @NotNull AABB var1,
         @NotNull lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var2
      ) {
         short var10001 = -25570;
         short var10002 = 15759;
         Intrinsics.checkNotNullParameter(var1, "box");
         var10001 = -25571;
         var10002 = -5541;
         Intrinsics.checkNotNullParameter(var2, "consumer");
         boolean var4 = false;
         int var5 = 0;
         int var10000 = var5++;
         double var6 = var1.minZ;
         double var8 = var1.minY;
         double var10 = var1.minX;
         int var12 = var10000;
         boolean var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.minZ;
         var8 = var1.minY;
         var10 = var1.maxX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.minZ;
         var8 = var1.minY;
         var10 = var1.maxX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.maxZ;
         var8 = var1.minY;
         var10 = var1.maxX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.maxZ;
         var8 = var1.minY;
         var10 = var1.maxX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.maxZ;
         var8 = var1.minY;
         var10 = var1.minX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.maxZ;
         var8 = var1.minY;
         var10 = var1.minX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.minZ;
         var8 = var1.minY;
         var10 = var1.minX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.minZ;
         var8 = var1.minY;
         var10 = var1.minX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.minZ;
         var8 = var1.maxY;
         var10 = var1.minX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.minZ;
         var8 = var1.minY;
         var10 = var1.maxX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.minZ;
         var8 = var1.maxY;
         var10 = var1.maxX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.maxZ;
         var8 = var1.minY;
         var10 = var1.maxX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.maxZ;
         var8 = var1.maxY;
         var10 = var1.maxX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.maxZ;
         var8 = var1.minY;
         var10 = var1.minX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.maxZ;
         var8 = var1.maxY;
         var10 = var1.minX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.minZ;
         var8 = var1.maxY;
         var10 = var1.minX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.minZ;
         var8 = var1.maxY;
         var10 = var1.maxX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.minZ;
         var8 = var1.maxY;
         var10 = var1.maxX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.maxZ;
         var8 = var1.maxY;
         var10 = var1.maxX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.maxZ;
         var8 = var1.maxY;
         var10 = var1.maxX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.maxZ;
         var8 = var1.maxY;
         var10 = var1.minX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.maxZ;
         var8 = var1.maxY;
         var10 = var1.minX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.minZ;
         var8 = var1.maxY;
         var10 = var1.minX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
      }

      public int a(@NotNull Direction var1) {
         int var10000 = ((IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.b()) ? 1 : 0);
         short var10002 = -25572;
         short var10003 = -20375;
         Intrinsics.checkNotNullParameter(var1, "side");
         boolean var2 = (var10000 != 0);

         try {
            var10000 = ((int[])lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)[var1.ordinal()];
            if (!var2) {
               return var10000;
            } else {
               switch (var10000) {
                  case 1:
                     return 255;
                  case 2:
                     return 16711680;
                  case 3:
                     return 200451;
                  case 4:
                     return 801804;
                  case 5:
                     return 3207216;
                  case 6:
                     return 12633024;
                  default:
                     throw new NoWhenBranchMatchedException();
               }
            }
         } catch (NoWhenBranchMatchedException var3) {
            throw (RuntimeException)a(var3);
         }
      }

      private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
         return var0;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: { // PX-FIX
         String[] var5 = new String[3];
         int var3 = 0;
         String var2 = "Ë^ð\u008a\b\u009cÕ\u0002+\u0088¨\u009e\u008e\u0003\u0082Éö";
         int var4 = "Ë^ð\u008a\b\u009cÕ\u0002+\u0088¨\u009e\u008e\u0003\u0082Éö".length();
         char var1 = 4;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 59;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 59;
                  var10006 = var6;
               } else {
                  var13 = 59;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 59;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 61;
                     case 1 -> 9;
                     case 2 -> 11;
                     case 3 -> 29;
                     case 4 -> 35;
                     case 5 -> 66;
                     default -> 9;
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
               c = var5;
               d = new String[3];
               break pxClinit; // PX-FIX
            }

            var1 = var2.charAt(var0);
         }
   } // PX-FIX end pxClinit
      }

      private static String b(int var0, int var1) {
         int var2 = (var0 ^ -25572) & 65535;
         if (d[var2] == null) {
            char[] var3 = c[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 51;
               case 1 -> 129;
               case 2 -> 79;
               case 3 -> 214;
               case 4 -> 12;
               case 5 -> 177;
               case 6 -> 195;
               case 7 -> 41;
               case 8 -> 69;
               case 9 -> 240;
               case 10 -> 139;
               case 11 -> 6;
               case 12 -> 1;
               case 13 -> 173;
               case 14 -> 15;
               case 15 -> 206;
               case 16 -> 74;
               case 17 -> 31;
               case 18 -> 143;
               case 19 -> 249;
               case 20 -> 33;
               case 21 -> 109;
               case 22 -> 49;
               case 23 -> 3;
               case 24 -> 154;
               case 25 -> 212;
               case 26 -> 97;
               case 27 -> 100;
               case 28 -> 61;
               case 29 -> 239;
               case 30 -> 102;
               case 31 -> 38;
               case 32 -> 120;
               case 33 -> 119;
               case 34 -> 175;
               case 35 -> 94;
               case 36 -> 226;
               case 37 -> 254;
               case 38 -> 122;
               case 39 -> 20;
               case 40 -> 163;
               case 41 -> 83;
               case 42 -> 244;
               case 43 -> 237;
               case 44 -> 65;
               case 45 -> 184;
               case 46 -> 152;
               case 47 -> 248;
               case 48 -> 45;
               case 49 -> 25;
               case 50 -> 218;
               case 51 -> 230;
               case 52 -> 80;
               case 53 -> 63;
               case 54 -> 124;
               case 55 -> 136;
               case 56 -> 56;
               case 57 -> 187;
               case 58 -> 209;
               case 59 -> 228;
               case 60 -> 36;
               case 61 -> 180;
               case 62 -> 95;
               case 63 -> 68;
               case 64 -> 174;
               case 65 -> 96;
               case 66 -> 192;
               case 67 -> 59;
               case 68 -> 35;
               case 69 -> 224;
               case 70 -> 157;
               case 71 -> 77;
               case 72 -> 140;
               case 73 -> 48;
               case 74 -> 53;
               case 75 -> 11;
               case 76 -> 201;
               case 77 -> 24;
               case 78 -> 75;
               case 79 -> 229;
               case 80 -> 186;
               case 81 -> 253;
               case 82 -> 19;
               case 83 -> 131;
               case 84 -> 179;
               case 85 -> 141;
               case 86 -> 43;
               case 87 -> 85;
               case 88 -> 132;
               case 89 -> 242;
               case 90 -> 23;
               case 91 -> 30;
               case 92 -> 71;
               case 93 -> 162;
               case 94 -> 118;
               case 95 -> 182;
               case 96 -> 18;
               case 97 -> 211;
               case 98 -> 57;
               case 99 -> 34;
               case 100 -> 39;
               case 101 -> 42;
               case 102 -> 112;
               case 103 -> 89;
               case 104 -> 47;
               case 105 -> 235;
               case 106 -> 164;
               case 107 -> 58;
               case 108 -> 137;
               case 109 -> 197;
               case 110 -> 165;
               case 111 -> 50;
               case 112 -> 67;
               case 113 -> 145;
               case 114 -> 17;
               case 115 -> 66;
               case 116 -> 87;
               case 117 -> 64;
               case 118 -> 144;
               case 119 -> 150;
               case 120 -> 27;
               case 121 -> 168;
               case 122 -> 196;
               case 123 -> 167;
               case 124 -> 207;
               case 125 -> 88;
               case 126 -> 247;
               case 127 -> 130;
               case 128 -> 62;
               case 129 -> 158;
               case 130 -> 215;
               case 131 -> 46;
               case 132 -> 169;
               case 133 -> 121;
               case 134 -> 14;
               case 135 -> 217;
               case 136 -> 208;
               case 137 -> 219;
               case 138 -> 232;
               case 139 -> 236;
               case 140 -> 13;
               case 141 -> 189;
               case 142 -> 78;
               case 143 -> 202;
               case 144 -> 70;
               case 145 -> 101;
               case 146 -> 200;
               case 147 -> 21;
               case 148 -> 243;
               case 149 -> 93;
               case 150 -> 205;
               case 151 -> 185;
               case 152 -> 91;
               case 153 -> 86;
               case 154 -> 98;
               case 155 -> 44;
               case 156 -> 4;
               case 157 -> 156;
               case 158 -> 227;
               case 159 -> 193;
               case 160 -> 107;
               case 161 -> 133;
               case 162 -> 114;
               case 163 -> 116;
               case 164 -> 225;
               case 165 -> 26;
               case 166 -> 127;
               case 167 -> 190;
               case 168 -> 2;
               case 169 -> 138;
               case 170 -> 123;
               case 171 -> 203;
               case 172 -> 81;
               case 173 -> 252;
               case 174 -> 146;
               case 175 -> 222;
               case 176 -> 5;
               case 177 -> 147;
               case 178 -> 221;
               case 179 -> 9;
               case 180 -> 151;
               case 181 -> 160;
               case 182 -> 213;
               case 183 -> 84;
               case 184 -> 181;
               case 185 -> 155;
               case 186 -> 204;
               case 187 -> 161;
               case 188 -> 142;
               case 189 -> 16;
               case 190 -> 37;
               case 191 -> 170;
               case 192 -> 92;
               case 193 -> 245;
               case 194 -> 99;
               case 195 -> 103;
               case 196 -> 216;
               case 197 -> 52;
               case 198 -> 104;
               case 199 -> 220;
               case 200 -> 255;
               case 201 -> 210;
               case 202 -> 90;
               case 203 -> 188;
               case 204 -> 246;
               case 205 -> 171;
               case 206 -> 113;
               case 207 -> 29;
               case 208 -> 7;
               case 209 -> 60;
               case 210 -> 250;
               case 211 -> 159;
               case 212 -> 234;
               case 213 -> 73;
               case 214 -> 149;
               case 215 -> 126;
               case 216 -> 166;
               case 217 -> 72;
               case 218 -> 176;
               case 219 -> 28;
               case 220 -> 125;
               case 221 -> 183;
               case 222 -> 238;
               case 223 -> 110;
               case 224 -> 153;
               case 225 -> 32;
               case 226 -> 199;
               case 227 -> 148;
               case 228 -> 128;
               case 229 -> 8;
               case 230 -> 251;
               case 231 -> 194;
               case 232 -> 111;
               case 233 -> 10;
               case 234 -> 54;
               case 235 -> 233;
               case 236 -> 105;
               case 237 -> 231;
               case 238 -> 82;
               case 239 -> 0;
               case 240 -> 117;
               case 241 -> 191;
               case 242 -> 55;
               case 243 -> 76;
               case 244 -> 115;
               case 245 -> 178;
               case 246 -> 106;
               case 247 -> 134;
               case 248 -> 108;
               case 249 -> 135;
               case 250 -> 40;
               case 251 -> 223;
               case 252 -> 198;
               case 253 -> 241;
               case 254 -> 22;
               default -> 172;
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

            d[var2] = new String(var3).intern();
         }

         return d[var2];
      }
   }

   static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
 /* PX-FIX: illegal extends lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl */ {
   public static me.octo.client.PXDyn IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX missing field v2
   
      private static String[] c;
      private static String[] d;

      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(String var1, int var2) {
         /* PX-FIX removed super call */
      }

      public void a(
         @NotNull AABB var1,
         @NotNull lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var2
      ) {
         short var10001 = 23906;
         short var10002 = -19979;
         Intrinsics.checkNotNullParameter(var1, "box");
         var10001 = 23904;
         var10002 = 29282;
         Intrinsics.checkNotNullParameter(var2, "consumer");
         boolean var4 = false;
         int var5 = 0;
         int var10000 = var5++;
         double var6 = var1.minZ;
         double var8 = var1.minY;
         double var10 = var1.minX;
         int var12 = var10000;
         boolean var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.minZ;
         var8 = var1.minY;
         var10 = var1.maxX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.maxZ;
         var8 = var1.minY;
         var10 = var1.maxX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.maxZ;
         var8 = var1.minY;
         var10 = var1.minX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.minZ;
         var8 = var1.maxY;
         var10 = var1.minX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.maxZ;
         var8 = var1.maxY;
         var10 = var1.minX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.maxZ;
         var8 = var1.maxY;
         var10 = var1.maxX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.minZ;
         var8 = var1.maxY;
         var10 = var1.maxX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.minZ;
         var8 = var1.minY;
         var10 = var1.minX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.minZ;
         var8 = var1.maxY;
         var10 = var1.minX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.minZ;
         var8 = var1.maxY;
         var10 = var1.maxX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.minZ;
         var8 = var1.minY;
         var10 = var1.maxX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.minZ;
         var8 = var1.minY;
         var10 = var1.maxX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.minZ;
         var8 = var1.maxY;
         var10 = var1.maxX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.maxZ;
         var8 = var1.maxY;
         var10 = var1.maxX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.maxZ;
         var8 = var1.minY;
         var10 = var1.maxX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.maxZ;
         var8 = var1.minY;
         var10 = var1.minX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.maxZ;
         var8 = var1.minY;
         var10 = var1.maxX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.maxZ;
         var8 = var1.maxY;
         var10 = var1.maxX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.maxZ;
         var8 = var1.maxY;
         var10 = var1.minX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.minZ;
         var8 = var1.minY;
         var10 = var1.minX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.maxZ;
         var8 = var1.minY;
         var10 = var1.minX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.maxZ;
         var8 = var1.maxY;
         var10 = var1.minX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
         var10000 = var5++;
         var6 = var1.minZ;
         var8 = var1.maxY;
         var10 = var1.minX;
         var12 = var10000;
         var13 = false;
         var2.a(var12, var10, var8, var6);
      }

      public int a(@NotNull Direction var1) {
         int var10000 = ((IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.b()) ? 1 : 0);
         short var10002 = 23905;
         short var10003 = -27406;
         Intrinsics.checkNotNullParameter(var1, "side");
         boolean var2 = (var10000 != 0);

         try {
            var10000 = ((int[])lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)[var1.ordinal()];
            if (!var2) {
               return var10000;
            } else {
               switch (var10000) {
                  case 1:
                     return 15;
                  case 2:
                     return 240;
                  case 3:
                     return 3840;
                  case 4:
                     return 61440;
                  case 5:
                     return 983040;
                  case 6:
                     return 15728640;
                  default:
                     throw new NoWhenBranchMatchedException();
               }
            }
         } catch (NoWhenBranchMatchedException var3) {
            throw (RuntimeException)a(var3);
         }
      }

      private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
         return var0;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: { // PX-FIX
         String[] var5 = new String[3];
         int var3 = 0;
         String var2 = "?%ú¿\u0002ý°\u001f\u0004Ï±üý\u0003¤k¾";
         int var4 = "?%ú¿\u0002ý°\u001f\u0004Ï±üý\u0003¤k¾".length();
         char var1 = '\b';
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 127;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 127;
                  var10006 = var6;
               } else {
                  var13 = 127;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 127;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 38;
                     case 1 -> 32;
                     case 2 -> 40;
                     case 3 -> 126;
                     case 4 -> 30;
                     case 5 -> 37;
                     default -> 29;
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
               c = var5;
               d = new String[3];
               break pxClinit; // PX-FIX
            }

            var1 = var2.charAt(var0);
         }
   } // PX-FIX end pxClinit
      }

      private static String b(int var0, int var1) {
         int var2 = (var0 ^ 23904) & 65535;
         if (d[var2] == null) {
            char[] var3 = c[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 14;
               case 1 -> 84;
               case 2 -> 198;
               case 3 -> 9;
               case 4 -> 66;
               case 5 -> 225;
               case 6 -> 35;
               case 7 -> 52;
               case 8 -> 1;
               case 9 -> 53;
               case 10 -> 184;
               case 11 -> 58;
               case 12 -> 19;
               case 13 -> 20;
               case 14 -> 131;
               case 15 -> 237;
               case 16 -> 227;
               case 17 -> 97;
               case 18 -> 222;
               case 19 -> 151;
               case 20 -> 6;
               case 21 -> 232;
               case 22 -> 253;
               case 23 -> 140;
               case 24 -> 183;
               case 25 -> 134;
               case 26 -> 241;
               case 27 -> 154;
               case 28 -> 142;
               case 29 -> 205;
               case 30 -> 216;
               case 31 -> 67;
               case 32 -> 39;
               case 33 -> 187;
               case 34 -> 238;
               case 35 -> 85;
               case 36 -> 189;
               case 37 -> 190;
               case 38 -> 178;
               case 39 -> 152;
               case 40 -> 125;
               case 41 -> 41;
               case 42 -> 68;
               case 43 -> 77;
               case 44 -> 95;
               case 45 -> 136;
               case 46 -> 235;
               case 47 -> 29;
               case 48 -> 91;
               case 49 -> 245;
               case 50 -> 153;
               case 51 -> 30;
               case 52 -> 193;
               case 53 -> 117;
               case 54 -> 75;
               case 55 -> 137;
               case 56 -> 180;
               case 57 -> 236;
               case 58 -> 110;
               case 59 -> 192;
               case 60 -> 249;
               case 61 -> 157;
               case 62 -> 34;
               case 63 -> 196;
               case 64 -> 197;
               case 65 -> 87;
               case 66 -> 112;
               case 67 -> 199;
               case 68 -> 254;
               case 69 -> 228;
               case 70 -> 135;
               case 71 -> 132;
               case 72 -> 105;
               case 73 -> 106;
               case 74 -> 89;
               case 75 -> 100;
               case 76 -> 16;
               case 77 -> 31;
               case 78 -> 210;
               case 79 -> 61;
               case 80 -> 226;
               case 81 -> 171;
               case 82 -> 17;
               case 83 -> 143;
               case 84 -> 64;
               case 85 -> 72;
               case 86 -> 138;
               case 87 -> 94;
               case 88 -> 96;
               case 89 -> 12;
               case 90 -> 161;
               case 91 -> 176;
               case 92 -> 251;
               case 93 -> 48;
               case 94 -> 244;
               case 95 -> 141;
               case 96 -> 47;
               case 97 -> 54;
               case 98 -> 207;
               case 99 -> 10;
               case 100 -> 43;
               case 101 -> 159;
               case 102 -> 93;
               case 103 -> 55;
               case 104 -> 255;
               case 105 -> 15;
               case 106 -> 240;
               case 107 -> 38;
               case 108 -> 150;
               case 109 -> 71;
               case 110 -> 211;
               case 111 -> 102;
               case 112 -> 32;
               case 113 -> 144;
               case 114 -> 5;
               case 115 -> 185;
               case 116 -> 221;
               case 117 -> 83;
               case 118 -> 229;
               case 119 -> 69;
               case 120 -> 26;
               case 121 -> 128;
               case 122 -> 2;
               case 123 -> 50;
               case 124 -> 219;
               case 125 -> 203;
               case 126 -> 8;
               case 127 -> 28;
               case 128 -> 44;
               case 129 -> 11;
               case 130 -> 42;
               case 131 -> 181;
               case 132 -> 166;
               case 133 -> 107;
               case 134 -> 223;
               case 135 -> 243;
               case 136 -> 25;
               case 137 -> 4;
               case 138 -> 252;
               case 139 -> 239;
               case 140 -> 168;
               case 141 -> 115;
               case 142 -> 119;
               case 143 -> 90;
               case 144 -> 63;
               case 145 -> 37;
               case 146 -> 123;
               case 147 -> 121;
               case 148 -> 200;
               case 149 -> 45;
               case 150 -> 13;
               case 151 -> 126;
               case 152 -> 74;
               case 153 -> 70;
               case 154 -> 73;
               case 155 -> 148;
               case 156 -> 217;
               case 157 -> 158;
               case 158 -> 78;
               case 159 -> 174;
               case 160 -> 182;
               case 161 -> 60;
               case 162 -> 208;
               case 163 -> 98;
               case 164 -> 82;
               case 165 -> 124;
               case 166 -> 179;
               case 167 -> 3;
               case 168 -> 146;
               case 169 -> 80;
               case 170 -> 133;
               case 171 -> 59;
               case 172 -> 233;
               case 173 -> 204;
               case 174 -> 250;
               case 175 -> 79;
               case 176 -> 81;
               case 177 -> 57;
               case 178 -> 65;
               case 179 -> 62;
               case 180 -> 114;
               case 181 -> 49;
               case 182 -> 130;
               case 183 -> 56;
               case 184 -> 139;
               case 185 -> 122;
               case 186 -> 36;
               case 187 -> 191;
               case 188 -> 129;
               case 189 -> 212;
               case 190 -> 104;
               case 191 -> 108;
               case 192 -> 195;
               case 193 -> 27;
               case 194 -> 167;
               case 195 -> 0;
               case 196 -> 242;
               case 197 -> 120;
               case 198 -> 201;
               case 199 -> 213;
               case 200 -> 177;
               case 201 -> 88;
               case 202 -> 188;
               case 203 -> 230;
               case 204 -> 234;
               case 205 -> 194;
               case 206 -> 101;
               case 207 -> 231;
               case 208 -> 173;
               case 209 -> 118;
               case 210 -> 23;
               case 211 -> 127;
               case 212 -> 186;
               case 213 -> 33;
               case 214 -> 156;
               case 215 -> 109;
               case 216 -> 111;
               case 217 -> 246;
               case 218 -> 21;
               case 219 -> 160;
               case 220 -> 147;
               case 221 -> 92;
               case 222 -> 165;
               case 223 -> 7;
               case 224 -> 164;
               case 225 -> 214;
               case 226 -> 99;
               case 227 -> 218;
               case 228 -> 162;
               case 229 -> 22;
               case 230 -> 202;
               case 231 -> 220;
               case 232 -> 170;
               case 233 -> 145;
               case 234 -> 103;
               case 235 -> 24;
               case 236 -> 206;
               case 237 -> 172;
               case 238 -> 175;
               case 239 -> 51;
               case 240 -> 209;
               case 241 -> 40;
               case 242 -> 163;
               case 243 -> 46;
               case 244 -> 76;
               case 245 -> 149;
               case 246 -> 248;
               case 247 -> 116;
               case 248 -> 113;
               case 249 -> 215;
               case 250 -> 247;
               case 251 -> 169;
               case 252 -> 18;
               case 253 -> 86;
               case 254 -> 224;
               default -> 155;
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

            d[var2] = new String(var3).intern();
         }

         return d[var2];
      }
   }
      private lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl(kotlin.jvm.internal.DefaultConstructorMarker p0) {
         this();
      }


   // PX-FIX: original <clinit> does putstatic lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = EnumEntriesKt.enumEntries(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl)
   static {
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = EnumEntriesKt.enumEntries(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
   }
}
