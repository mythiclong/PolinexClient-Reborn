package me.octo.client;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.core.BlockPos;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl {
   @NotNull
   public static IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @SerializedName("x")
   private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @SerializedName("y")
   private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @SerializedName("z")
   private final int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @SerializedName("type")
   @NotNull
   private final String IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static String[] a;
   private static String[] b;

   public IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl(
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII int var1,
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII int var2,
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII int var3,
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII @NotNull String var4
   ) {
      short var10001 = 27974;
      short var10002 = -11781;
      Intrinsics.checkNotNullParameter(var4, "type");
      super();
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var2;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var3;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var4;
   }

   public final int a() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final int b() {
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
   public final BlockPos e() {
      return new BlockPos(
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
      );
   }

   public final int f() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final int g() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final int h() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @NotNull
   public final String i() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @NotNull
   public final IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl a(
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII int var1,
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII int var2,
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII int var3,
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII @NotNull String var4
   ) {
      short var10001 = 27972;
      short var10002 = 6303;
      Intrinsics.checkNotNullParameter(var4, "type");
      return new IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl(var1, var2, var3, var4);
   }

   @NotNull
   @Override
   public String toString() {
      short var10000 = 27973;
      String var1 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      int var2 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      int var3 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      int var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      short var10001 = -2075;
      short var10002 = 27968;
      short var10003 = 2520;
      short var10004 = 27969;
      short var10005 = -30760;
      short var10006 = 27975;
      short var10007 = 9011;
      return "WaypointData(x=" + var4 + ", y=" + var3 + ", z=" + var2 + ", type=" + var1 + ")";
   }

   @Override
   public int hashCode() {
      int var1 = Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      var1 = var1 * 31 + Integer.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      var1 = var1 * 31 + Integer.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      return var1 * 31 + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.hashCode();
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      boolean var2 = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.R();
      Object var10000 = this;
      if (!var2) {
         if (this == var1) {
            return true;
         }

         var10000 = var1;
      }

      if (!var2) {
         if (!(var10000 instanceof IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl)) {
            return false;
         }

         var10000 = var1;
      }

      IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl var3 = (IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl)var10000;
      int var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      int var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      if (!var2) {
         if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            != var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
            return false;
         }

         var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         var10001 = var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      label56: {
         if (!var2) {
            if (var4 != var10001) {
               return false;
            }

            var4 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            if (var2) {
               break label56;
            }

            var10001 = var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         if (var4 != var10001) {
            return false;
         }

         var4 = ((Intrinsics.areEqual(
            this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
            var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         )) ? 1 : 0);
      }

      if (!var2) {
         if (var4 == 0) {
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
      String var2 = "¦\u0007¼\u0092\u000f÷ÖØ¦µ\u008c{\u009d\u001dÊZâÖHö\u0004\u0005ÃÈ\n\u0007F\u007f÷óã\u0002\u001e";
      int var4 = "¦\u0007¼\u0092\u000f÷ÖØ¦µ\u008c{\u009d\u001dÊZâÖHö\u0004\u0005ÃÈ\n\u0007F\u007f÷óã\u0002\u001e".length();
      char var1 = 4;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 52;
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
                     case 0 -> 72;
                     case 1 -> 109;
                     case 2 -> 89;
                     case 3 -> 94;
                     case 4 -> 14;
                     case 5 -> 54;
                     default -> 82;
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
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
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

                  var2 = "5Í\u0007r\u00045³\u0004½";
                  var4 = "5Í\u0007r\u00045³\u0004½".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 1;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 27972) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 234;
            case 1 -> 64;
            case 2 -> 243;
            case 3 -> 158;
            case 4 -> 23;
            case 5 -> 233;
            case 6 -> 197;
            case 7 -> 13;
            case 8 -> 90;
            case 9 -> 0;
            case 10 -> 229;
            case 11 -> 193;
            case 12 -> 189;
            case 13 -> 215;
            case 14 -> 45;
            case 15 -> 224;
            case 16 -> 143;
            case 17 -> 24;
            case 18 -> 236;
            case 19 -> 192;
            case 20 -> 144;
            case 21 -> 33;
            case 22 -> 188;
            case 23 -> 83;
            case 24 -> 36;
            case 25 -> 91;
            case 26 -> 46;
            case 27 -> 71;
            case 28 -> 218;
            case 29 -> 249;
            case 30 -> 21;
            case 31 -> 245;
            case 32 -> 56;
            case 33 -> 157;
            case 34 -> 40;
            case 35 -> 196;
            case 36 -> 112;
            case 37 -> 126;
            case 38 -> 84;
            case 39 -> 178;
            case 40 -> 19;
            case 41 -> 248;
            case 42 -> 207;
            case 43 -> 100;
            case 44 -> 120;
            case 45 -> 209;
            case 46 -> 194;
            case 47 -> 147;
            case 48 -> 174;
            case 49 -> 7;
            case 50 -> 62;
            case 51 -> 98;
            case 52 -> 155;
            case 53 -> 97;
            case 54 -> 63;
            case 55 -> 246;
            case 56 -> 86;
            case 57 -> 30;
            case 58 -> 29;
            case 59 -> 99;
            case 60 -> 1;
            case 61 -> 133;
            case 62 -> 177;
            case 63 -> 95;
            case 64 -> 103;
            case 65 -> 109;
            case 66 -> 181;
            case 67 -> 75;
            case 68 -> 49;
            case 69 -> 154;
            case 70 -> 230;
            case 71 -> 159;
            case 72 -> 108;
            case 73 -> 127;
            case 74 -> 251;
            case 75 -> 208;
            case 76 -> 55;
            case 77 -> 70;
            case 78 -> 117;
            case 79 -> 35;
            case 80 -> 186;
            case 81 -> 53;
            case 82 -> 180;
            case 83 -> 74;
            case 84 -> 203;
            case 85 -> 25;
            case 86 -> 130;
            case 87 -> 22;
            case 88 -> 138;
            case 89 -> 28;
            case 90 -> 76;
            case 91 -> 173;
            case 92 -> 247;
            case 93 -> 20;
            case 94 -> 50;
            case 95 -> 206;
            case 96 -> 12;
            case 97 -> 222;
            case 98 -> 51;
            case 99 -> 68;
            case 100 -> 148;
            case 101 -> 18;
            case 102 -> 47;
            case 103 -> 198;
            case 104 -> 255;
            case 105 -> 5;
            case 106 -> 26;
            case 107 -> 242;
            case 108 -> 122;
            case 109 -> 101;
            case 110 -> 110;
            case 111 -> 8;
            case 112 -> 146;
            case 113 -> 171;
            case 114 -> 240;
            case 115 -> 89;
            case 116 -> 59;
            case 117 -> 41;
            case 118 -> 176;
            case 119 -> 66;
            case 120 -> 125;
            case 121 -> 238;
            case 122 -> 54;
            case 123 -> 119;
            case 124 -> 136;
            case 125 -> 172;
            case 126 -> 3;
            case 127 -> 129;
            case 128 -> 11;
            case 129 -> 142;
            case 130 -> 201;
            case 131 -> 82;
            case 132 -> 85;
            case 133 -> 195;
            case 134 -> 200;
            case 135 -> 67;
            case 136 -> 161;
            case 137 -> 58;
            case 138 -> 113;
            case 139 -> 9;
            case 140 -> 213;
            case 141 -> 102;
            case 142 -> 223;
            case 143 -> 214;
            case 144 -> 226;
            case 145 -> 145;
            case 146 -> 182;
            case 147 -> 93;
            case 148 -> 184;
            case 149 -> 16;
            case 150 -> 137;
            case 151 -> 254;
            case 152 -> 202;
            case 153 -> 116;
            case 154 -> 205;
            case 155 -> 2;
            case 156 -> 237;
            case 157 -> 14;
            case 158 -> 217;
            case 159 -> 48;
            case 160 -> 17;
            case 161 -> 168;
            case 162 -> 199;
            case 163 -> 42;
            case 164 -> 231;
            case 165 -> 52;
            case 166 -> 185;
            case 167 -> 150;
            case 168 -> 210;
            case 169 -> 153;
            case 170 -> 87;
            case 171 -> 88;
            case 172 -> 57;
            case 173 -> 151;
            case 174 -> 104;
            case 175 -> 149;
            case 176 -> 81;
            case 177 -> 94;
            case 178 -> 118;
            case 179 -> 190;
            case 180 -> 175;
            case 181 -> 179;
            case 182 -> 219;
            case 183 -> 65;
            case 184 -> 132;
            case 185 -> 244;
            case 186 -> 15;
            case 187 -> 79;
            case 188 -> 253;
            case 189 -> 228;
            case 190 -> 78;
            case 191 -> 106;
            case 192 -> 162;
            case 193 -> 4;
            case 194 -> 204;
            case 195 -> 107;
            case 196 -> 170;
            case 197 -> 235;
            case 198 -> 166;
            case 199 -> 77;
            case 200 -> 216;
            case 201 -> 187;
            case 202 -> 250;
            case 203 -> 227;
            case 204 -> 34;
            case 205 -> 220;
            case 206 -> 225;
            case 207 -> 163;
            case 208 -> 92;
            case 209 -> 80;
            case 210 -> 131;
            case 211 -> 221;
            case 212 -> 111;
            case 213 -> 239;
            case 214 -> 252;
            case 215 -> 69;
            case 216 -> 169;
            case 217 -> 135;
            case 218 -> 241;
            case 219 -> 156;
            case 220 -> 211;
            case 221 -> 38;
            case 222 -> 43;
            case 223 -> 73;
            case 224 -> 105;
            case 225 -> 10;
            case 226 -> 134;
            case 227 -> 191;
            case 228 -> 44;
            case 229 -> 96;
            case 230 -> 167;
            case 231 -> 183;
            case 232 -> 139;
            case 233 -> 60;
            case 234 -> 124;
            case 235 -> 140;
            case 236 -> 115;
            case 237 -> 164;
            case 238 -> 6;
            case 239 -> 114;
            case 240 -> 123;
            case 241 -> 31;
            case 242 -> 141;
            case 243 -> 152;
            case 244 -> 165;
            case 245 -> 39;
            case 246 -> 32;
            case 247 -> 72;
            case 248 -> 128;
            case 249 -> 27;
            case 250 -> 121;
            case 251 -> 160;
            case 252 -> 212;
            case 253 -> 61;
            case 254 -> 37;
            default -> 232;
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
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

      private static String[] a;
      private static String[] b;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl a(@NotNull BlockPos var1, @NotNull String var2) {
         short var10001 = 2361;
         short var10002 = 21292;
         Intrinsics.checkNotNullParameter(var1, "pos");
         var10001 = 2360;
         var10002 = -23346;
         Intrinsics.checkNotNullParameter(var2, "type");
         return new IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl(var1.getX(), var1.getY(), var1.getZ(), var2);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
         pxClinit: {
         String[] var5 = new String[2];
         int var3 = 0;
         String var2 = "÷ø-\u0095\u0003ð°J";
         int var4 = "÷ø-\u0095\u0003ð°J".length();
         char var1 = 4;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 112;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 112;
                  var10006 = var6;
               } else {
                  var13 = 112;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 112;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 34;
                     case 1 -> 86;
                     case 2 -> 99;
                     case 3 -> 13;
                     case 4 -> 52;
                     case 5 -> 91;
                     default -> 85;
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
               b = new String[2];
               break pxClinit;
            }

            var1 = var2.charAt(var0);
         }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 2360) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 179;
               case 1 -> 201;
               case 2 -> 172;
               case 3 -> 156;
               case 4 -> 45;
               case 5 -> 135;
               case 6 -> 30;
               case 7 -> 20;
               case 8 -> 125;
               case 9 -> 185;
               case 10 -> 124;
               case 11 -> 207;
               case 12 -> 50;
               case 13 -> 228;
               case 14 -> 37;
               case 15 -> 11;
               case 16 -> 210;
               case 17 -> 16;
               case 18 -> 61;
               case 19 -> 17;
               case 20 -> 217;
               case 21 -> 169;
               case 22 -> 65;
               case 23 -> 157;
               case 24 -> 15;
               case 25 -> 0;
               case 26 -> 34;
               case 27 -> 166;
               case 28 -> 149;
               case 29 -> 188;
               case 30 -> 245;
               case 31 -> 127;
               case 32 -> 70;
               case 33 -> 53;
               case 34 -> 196;
               case 35 -> 3;
               case 36 -> 80;
               case 37 -> 195;
               case 38 -> 250;
               case 39 -> 229;
               case 40 -> 10;
               case 41 -> 176;
               case 42 -> 104;
               case 43 -> 214;
               case 44 -> 134;
               case 45 -> 38;
               case 46 -> 123;
               case 47 -> 94;
               case 48 -> 141;
               case 49 -> 224;
               case 50 -> 136;
               case 51 -> 164;
               case 52 -> 193;
               case 53 -> 116;
               case 54 -> 167;
               case 55 -> 248;
               case 56 -> 81;
               case 57 -> 108;
               case 58 -> 25;
               case 59 -> 161;
               case 60 -> 111;
               case 61 -> 106;
               case 62 -> 83;
               case 63 -> 162;
               case 64 -> 220;
               case 65 -> 110;
               case 66 -> 190;
               case 67 -> 54;
               case 68 -> 46;
               case 69 -> 102;
               case 70 -> 221;
               case 71 -> 32;
               case 72 -> 191;
               case 73 -> 122;
               case 74 -> 216;
               case 75 -> 92;
               case 76 -> 249;
               case 77 -> 154;
               case 78 -> 238;
               case 79 -> 41;
               case 80 -> 144;
               case 81 -> 51;
               case 82 -> 118;
               case 83 -> 150;
               case 84 -> 165;
               case 85 -> 44;
               case 86 -> 77;
               case 87 -> 170;
               case 88 -> 47;
               case 89 -> 78;
               case 90 -> 64;
               case 91 -> 69;
               case 92 -> 63;
               case 93 -> 213;
               case 94 -> 103;
               case 95 -> 79;
               case 96 -> 14;
               case 97 -> 1;
               case 98 -> 189;
               case 99 -> 254;
               case 100 -> 206;
               case 101 -> 12;
               case 102 -> 215;
               case 103 -> 43;
               case 104 -> 147;
               case 105 -> 130;
               case 106 -> 142;
               case 107 -> 100;
               case 108 -> 237;
               case 109 -> 76;
               case 110 -> 68;
               case 111 -> 243;
               case 112 -> 19;
               case 113 -> 75;
               case 114 -> 148;
               case 115 -> 137;
               case 116 -> 146;
               case 117 -> 239;
               case 118 -> 155;
               case 119 -> 223;
               case 120 -> 97;
               case 121 -> 219;
               case 122 -> 109;
               case 123 -> 233;
               case 124 -> 241;
               case 125 -> 27;
               case 126 -> 177;
               case 127 -> 93;
               case 128 -> 132;
               case 129 -> 235;
               case 130 -> 39;
               case 131 -> 84;
               case 132 -> 71;
               case 133 -> 131;
               case 134 -> 86;
               case 135 -> 159;
               case 136 -> 40;
               case 137 -> 98;
               case 138 -> 227;
               case 139 -> 117;
               case 140 -> 21;
               case 141 -> 242;
               case 142 -> 198;
               case 143 -> 119;
               case 144 -> 209;
               case 145 -> 204;
               case 146 -> 24;
               case 147 -> 234;
               case 148 -> 35;
               case 149 -> 218;
               case 150 -> 226;
               case 151 -> 60;
               case 152 -> 139;
               case 153 -> 115;
               case 154 -> 202;
               case 155 -> 112;
               case 156 -> 31;
               case 157 -> 5;
               case 158 -> 7;
               case 159 -> 55;
               case 160 -> 200;
               case 161 -> 48;
               case 162 -> 90;
               case 163 -> 232;
               case 164 -> 126;
               case 165 -> 253;
               case 166 -> 59;
               case 167 -> 13;
               case 168 -> 153;
               case 169 -> 231;
               case 170 -> 178;
               case 171 -> 163;
               case 172 -> 182;
               case 173 -> 82;
               case 174 -> 2;
               case 175 -> 183;
               case 176 -> 33;
               case 177 -> 230;
               case 178 -> 222;
               case 179 -> 212;
               case 180 -> 56;
               case 181 -> 175;
               case 182 -> 252;
               case 183 -> 28;
               case 184 -> 73;
               case 185 -> 87;
               case 186 -> 105;
               case 187 -> 9;
               case 188 -> 114;
               case 189 -> 96;
               case 190 -> 173;
               case 191 -> 52;
               case 192 -> 18;
               case 193 -> 113;
               case 194 -> 192;
               case 195 -> 66;
               case 196 -> 89;
               case 197 -> 240;
               case 198 -> 49;
               case 199 -> 72;
               case 200 -> 8;
               case 201 -> 6;
               case 202 -> 180;
               case 203 -> 194;
               case 204 -> 205;
               case 205 -> 22;
               case 206 -> 133;
               case 207 -> 58;
               case 208 -> 36;
               case 209 -> 199;
               case 210 -> 101;
               case 211 -> 197;
               case 212 -> 74;
               case 213 -> 42;
               case 214 -> 247;
               case 215 -> 186;
               case 216 -> 88;
               case 217 -> 187;
               case 218 -> 160;
               case 219 -> 128;
               case 220 -> 255;
               case 221 -> 208;
               case 222 -> 121;
               case 223 -> 225;
               case 224 -> 145;
               case 225 -> 62;
               case 226 -> 120;
               case 227 -> 211;
               case 228 -> 171;
               case 229 -> 236;
               case 230 -> 151;
               case 231 -> 4;
               case 232 -> 26;
               case 233 -> 203;
               case 234 -> 158;
               case 235 -> 168;
               case 236 -> 138;
               case 237 -> 29;
               case 238 -> 181;
               case 239 -> 184;
               case 240 -> 23;
               case 241 -> 91;
               case 242 -> 143;
               case 243 -> 95;
               case 244 -> 174;
               case 245 -> 251;
               case 246 -> 85;
               case 247 -> 57;
               case 248 -> 152;
               case 249 -> 246;
               case 250 -> 107;
               case 251 -> 140;
               case 252 -> 244;
               case 253 -> 67;
               case 254 -> 129;
               default -> 99;
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
   
   public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker p0) {
      this();
   }
}

public static me.octo.client.IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl a(me.octo.client.IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl p0, int p1, int p2, int p3, java.lang.String p4, int p5, java.lang.Object p6) {
         return (me.octo.client.IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl) null;
      }
}
