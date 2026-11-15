package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.core.BlockPos;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll {

   public lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll(BlockPos var1, int var2, long var3, long var5, int var7, kotlin.jvm.internal.DefaultConstructorMarker var8) {
      if ((var7 & 2) != 0) {
         var2 = 0;
      }

      if ((var7 & 4) != 0) {
         var3 = System.currentTimeMillis();
      }

      if ((var7 & 8) != 0) {
         var5 = 0L;
      }

      this(var1, var2, var3, var5);
   }

   @NotNull
   private final BlockPos IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static String[] a;
   private static String[] b;

   public lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll(@NotNull BlockPos var1, int var2, long var3, long var5) {
      short var10001 = 2139;
      short var10002 = -9316;
      Intrinsics.checkNotNullParameter(var1, "pos");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var5;
   }

   @NotNull
   public final BlockPos a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   public final int b() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final void a(int var1) {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
   }

   public final long c() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final void a(long var1) {
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
   }

   public final long d() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   public final void b(long var1) {
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var1;
   }

   public final boolean e() {
      String var1 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      long var2;
      int var10000 = (var2 = System.currentTimeMillis() - this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) == 0L
         ? 0
         : (var2 < 0L ? -1 : 1);
      if (var1 != null) {
         var10000 = var10000 < 0 ? 1 : 0;
      }

      return (var10000 != 0);
   }

   public final boolean f() {
      String var1 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      long var2;
      int var10000 = (var2 = System.currentTimeMillis() - this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl - 5000L)
            == 0L
         ? 0
         : (var2 < 0L ? -1 : 1);
      if (var1 != null) {
         var10000 = var10000 < 0 ? 1 : 0;
      }

      return (var10000 != 0);
   }

   public final void b(int var1) {
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = System.currentTimeMillis() + var1 * 1000L;
   }

   public final void g() {
      int var1 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII++;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = System.currentTimeMillis();
   }

   @NotNull
   public final BlockPos h() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   public final int i() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final long j() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final long k() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   public static lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll a(lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll var0, BlockPos var1, int var2, long var3, long var5, int var7, Object var8) {
      if ((var7 & 1) != 0) {
         var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      if ((var7 & 2) != 0) {
         var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      if ((var7 & 4) != 0) {
         var3 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      if ((var7 & 8) != 0) {
         var5 = var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      return var0.a(var1, var2, var3, var5);
   }

   @NotNull
   public final lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll a(@NotNull BlockPos var1, int var2, long var3, long var5) {
      short var10001 = 2141;
      short var10002 = 2921;
      Intrinsics.checkNotNullParameter(var1, "pos");
      return new lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll(var1, var2, var3, var5);
   }

   @NotNull
   @Override
   public String toString() {
      short var10000 = 2138;
      long var1 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      long var3 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      int var5 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      BlockPos var6 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      short var10001 = 23559;
      short var10002 = 2140;
      short var10003 = -29062;
      short var10004 = 2137;
      short var10005 = -6403;
      short var10006 = 2136;
      short var10007 = 32716;
      return "GlowingMushroom(pos=" + var6 + ", particleCount=" + var5 + ", lastParticleTime=" + var3 + ", blacklistedUntil=" + var1 + ")";
   }

   @Override
   public int hashCode() {
      int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
      var1 = var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      var1 = var1 * 31 + Long.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      return var1 * 31 + Long.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      String var2 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      Object var10000 = this;
      if (var2 != null) {
         if (this == var1) {
            return true;
         }

         var10000 = var1;
      }

      if (var2 != null) {
         if (!(var10000 instanceof lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll)) {
            return false;
         }

         var10000 = var1;
      }

      lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll var3 = (lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll)var10000;
      int var4 = ((Intrinsics.areEqual(
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
      )) ? 1 : 0);
      if (var2 != null) {
         if (var4 == 0) {
            return false;
         }

         var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      if (var2 != null) {
         if (var4 != var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
            return false;
         }

         long var5;
         var4 = (
                  var5 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                     - var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
               )
               == 0L
            ? 0
            : (var5 < 0L ? -1 : 1);
      }

      if (var2 != null) {
         if (var4 != 0) {
            return false;
         }

         long var6;
         var4 = (
                  var6 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                     - var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
               )
               == 0L
            ? 0
            : (var6 < 0L ? -1 : 1);
      }

      if (var2 != null) {
         if (var4 != 0) {
            return false;
         }

         var4 = 1;
      }

      return (var4 != 0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "\u001f\u0012\u001cþ 1¾Ï£úØ÷äc[\u0090âÊ\u0090\u0013b\u008f½@É]èº.ÿ\f¶È½í`Mcá\u0003c\u0093[\u0014Ò\b nÎí\r!\u0003\u0089*o\u0098I\u008eß[@W`";
      int var4 = "\u001f\u0012\u001cþ 1¾Ï£úØ÷äc[\u0090âÊ\u0090\u0013b\u008f½@É]èº.ÿ\f¶È½í`Mcá\u0003c\u0093[\u0014Ò\b nÎí\r!\u0003\u0089*o\u0098I\u008eß[@W`"
         .length();
      char var1 = 19;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 33;
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
                     case 0 -> 113;
                     case 1 -> 95;
                     case 2 -> 17;
                     case 3 -> 23;
                     case 4 -> 22;
                     case 5 -> 48;
                     default -> 48;
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
                     b = new String[6];
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

                  var2 = "\u001bL\u0007\u0010Z\u0094û}\u0011\u0012Óú]\\£O®¡[¥";
                  var4 = "\u001bL\u0007\u0010Z\u0094û}\u0011\u0012Óú]\\£O®¡[¥".length();
                  var1 = 3;
                  var8 = -1;
            }

            var10000 = 121;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 2137) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 47;
            case 1 -> 198;
            case 2 -> 213;
            case 3 -> 204;
            case 4 -> 17;
            case 5 -> 115;
            case 6 -> 170;
            case 7 -> 1;
            case 8 -> 135;
            case 9 -> 243;
            case 10 -> 248;
            case 11 -> 189;
            case 12 -> 110;
            case 13 -> 190;
            case 14 -> 68;
            case 15 -> 71;
            case 16 -> 147;
            case 17 -> 177;
            case 18 -> 202;
            case 19 -> 6;
            case 20 -> 14;
            case 21 -> 144;
            case 22 -> 255;
            case 23 -> 197;
            case 24 -> 60;
            case 25 -> 124;
            case 26 -> 212;
            case 27 -> 0;
            case 28 -> 231;
            case 29 -> 18;
            case 30 -> 94;
            case 31 -> 69;
            case 32 -> 22;
            case 33 -> 232;
            case 34 -> 148;
            case 35 -> 188;
            case 36 -> 136;
            case 37 -> 236;
            case 38 -> 118;
            case 39 -> 97;
            case 40 -> 211;
            case 41 -> 70;
            case 42 -> 223;
            case 43 -> 15;
            case 44 -> 233;
            case 45 -> 82;
            case 46 -> 96;
            case 47 -> 192;
            case 48 -> 9;
            case 49 -> 73;
            case 50 -> 174;
            case 51 -> 89;
            case 52 -> 86;
            case 53 -> 121;
            case 54 -> 90;
            case 55 -> 139;
            case 56 -> 25;
            case 57 -> 208;
            case 58 -> 35;
            case 59 -> 92;
            case 60 -> 105;
            case 61 -> 10;
            case 62 -> 180;
            case 63 -> 138;
            case 64 -> 39;
            case 65 -> 131;
            case 66 -> 165;
            case 67 -> 226;
            case 68 -> 254;
            case 69 -> 65;
            case 70 -> 46;
            case 71 -> 216;
            case 72 -> 125;
            case 73 -> 107;
            case 74 -> 166;
            case 75 -> 38;
            case 76 -> 114;
            case 77 -> 26;
            case 78 -> 48;
            case 79 -> 154;
            case 80 -> 93;
            case 81 -> 242;
            case 82 -> 252;
            case 83 -> 179;
            case 84 -> 241;
            case 85 -> 240;
            case 86 -> 120;
            case 87 -> 45;
            case 88 -> 126;
            case 89 -> 132;
            case 90 -> 88;
            case 91 -> 116;
            case 92 -> 12;
            case 93 -> 57;
            case 94 -> 153;
            case 95 -> 62;
            case 96 -> 129;
            case 97 -> 245;
            case 98 -> 99;
            case 99 -> 111;
            case 100 -> 185;
            case 101 -> 207;
            case 102 -> 159;
            case 103 -> 200;
            case 104 -> 43;
            case 105 -> 72;
            case 106 -> 175;
            case 107 -> 36;
            case 108 -> 215;
            case 109 -> 225;
            case 110 -> 149;
            case 111 -> 169;
            case 112 -> 193;
            case 113 -> 16;
            case 114 -> 2;
            case 115 -> 119;
            case 116 -> 250;
            case 117 -> 91;
            case 118 -> 209;
            case 119 -> 58;
            case 120 -> 151;
            case 121 -> 64;
            case 122 -> 28;
            case 123 -> 67;
            case 124 -> 63;
            case 125 -> 52;
            case 126 -> 229;
            case 127 -> 155;
            case 128 -> 7;
            case 129 -> 221;
            case 130 -> 66;
            case 131 -> 183;
            case 132 -> 163;
            case 133 -> 20;
            case 134 -> 203;
            case 135 -> 168;
            case 136 -> 4;
            case 137 -> 79;
            case 138 -> 51;
            case 139 -> 171;
            case 140 -> 162;
            case 141 -> 84;
            case 142 -> 55;
            case 143 -> 227;
            case 144 -> 150;
            case 145 -> 34;
            case 146 -> 219;
            case 147 -> 237;
            case 148 -> 178;
            case 149 -> 218;
            case 150 -> 100;
            case 151 -> 122;
            case 152 -> 142;
            case 153 -> 238;
            case 154 -> 235;
            case 155 -> 137;
            case 156 -> 167;
            case 157 -> 117;
            case 158 -> 146;
            case 159 -> 247;
            case 160 -> 194;
            case 161 -> 199;
            case 162 -> 112;
            case 163 -> 77;
            case 164 -> 134;
            case 165 -> 76;
            case 166 -> 244;
            case 167 -> 13;
            case 168 -> 37;
            case 169 -> 253;
            case 170 -> 49;
            case 171 -> 101;
            case 172 -> 102;
            case 173 -> 228;
            case 174 -> 164;
            case 175 -> 33;
            case 176 -> 128;
            case 177 -> 172;
            case 178 -> 42;
            case 179 -> 104;
            case 180 -> 54;
            case 181 -> 201;
            case 182 -> 32;
            case 183 -> 251;
            case 184 -> 61;
            case 185 -> 195;
            case 186 -> 152;
            case 187 -> 113;
            case 188 -> 217;
            case 189 -> 41;
            case 190 -> 246;
            case 191 -> 181;
            case 192 -> 173;
            case 193 -> 78;
            case 194 -> 187;
            case 195 -> 158;
            case 196 -> 108;
            case 197 -> 123;
            case 198 -> 186;
            case 199 -> 103;
            case 200 -> 53;
            case 201 -> 56;
            case 202 -> 161;
            case 203 -> 40;
            case 204 -> 205;
            case 205 -> 141;
            case 206 -> 230;
            case 207 -> 50;
            case 208 -> 156;
            case 209 -> 8;
            case 210 -> 30;
            case 211 -> 234;
            case 212 -> 5;
            case 213 -> 222;
            case 214 -> 74;
            case 215 -> 143;
            case 216 -> 133;
            case 217 -> 59;
            case 218 -> 29;
            case 219 -> 11;
            case 220 -> 75;
            case 221 -> 80;
            case 222 -> 85;
            case 223 -> 27;
            case 224 -> 21;
            case 225 -> 23;
            case 226 -> 31;
            case 227 -> 206;
            case 228 -> 140;
            case 229 -> 176;
            case 230 -> 196;
            case 231 -> 184;
            case 232 -> 191;
            case 233 -> 109;
            case 234 -> 3;
            case 235 -> 95;
            case 236 -> 220;
            case 237 -> 44;
            case 238 -> 127;
            case 239 -> 182;
            case 240 -> 224;
            case 241 -> 106;
            case 242 -> 19;
            case 243 -> 24;
            case 244 -> 83;
            case 245 -> 249;
            case 246 -> 87;
            case 247 -> 210;
            case 248 -> 239;
            case 249 -> 81;
            case 250 -> 157;
            case 251 -> 160;
            case 252 -> 98;
            case 253 -> 145;
            case 254 -> 214;
            default -> 130;
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
