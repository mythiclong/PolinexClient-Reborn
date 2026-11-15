package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIllIIIIlIIlIIllIIlIllIIllIllIlIIlllIllIIIlIIllIlIIllIIlIIIlllIllIlIlIllIIlllIlIlllI {
   private final boolean IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private final boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @Nullable
   private final String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @Nullable
   private final String lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static String[] a;
   private static String[] b;

   public lIIllIIIIlIIlIIllIIlIllIIllIllIlIIlllIllIIIlIIllIlIIllIIlIIIlllIllIlIlIllIIlllIlIlllI(
      boolean var1, boolean var2, @Nullable String var3, @Nullable String var4
   ) {
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
   }

   public lIIllIIIIlIIlIIllIIlIllIIllIllIlIIlllIllIIIlIIllIlIIllIIlIIIlllIllIlIlIllIIlllIlIlllI(
      boolean var1, boolean var2, @Nullable String var3, @Nullable String var4, int var5, @Nullable kotlin.jvm.internal.DefaultConstructorMarker var6
   ) {
      if ((var5 & 8) != 0) {
         var4 = null;
      }

      this(var1, var2, var3, var4);
   }

   // PX-FIX PhaseA TOP3d2: Kotlin default-args bridge (jar descriptor ZZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)
   @Nullable
   public static lIIllIIIIlIIlIIllIIlIllIIllIllIlIIlllIllIIIlIIllIlIIllIIlIIIlllIllIlIlIllIIlllIlIlllI a(
      lIIllIIIIlIIlIIllIIlIllIIllIllIlIIlllIllIIIlIIllIlIIllIIlIIIlllIllIlIlIllIIlllIlIlllI var0, boolean var1, boolean var2, @Nullable String var3, @Nullable String var4, int var5, @Nullable Object var6
   ) {
      boolean var7 = IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl.w();
      if ((var5 & 1) != 0 && var7) {
         var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      if ((var5 & 2) != 0 && var7) {
         var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      if ((var5 & 4) != 0 && var7) {
         var3 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      if ((var5 & 8) != 0) {
         var4 = var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      return var0.a(var1, var2, var3, var4);
   }

   public final boolean a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   public final boolean b() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @Nullable
   public final String c() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @Nullable
   public final String d() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   public final boolean e() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   public final boolean f() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @Nullable
   public final String g() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @Nullable
   public final String h() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @NotNull
   public final lIIllIIIIlIIlIIllIIlIllIIllIllIlIIlllIllIIIlIIllIlIIllIIlIIIlllIllIlIlIllIIlllIlIlllI a(
      boolean var1, boolean var2, @Nullable String var3, @Nullable String var4
   ) {
      return new lIIllIIIIlIIlIIllIIlIllIIllIllIlIIlllIllIIIlIIllIlIIllIIlIIIlllIllIlIlIllIIlllIlIlllI(var1, var2, var3, var4);
   }

   @NotNull
   @Override
   public String toString() { boolean var4 = false; // PX-FIX hoist
        
      short var10000 = 29710;
      String var1 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      String var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      boolean var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
       var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      short var10001 = 30602;
      short var10002 = 29711;
      short var10003 = 11586;
      short var10004 = 29709;
      short var10005 = -25111;
      short var10006 = 29708;
      short var10007 = -14733;
      return "UploadRouteResponse(success=" + var4 + ", duplicate=" + var3 + ", message=" + var2 + ", id=" + var1 + ")";
   }

   @Override
   public int hashCode() { int var4 = 0; // PX-FIX hoist
        
      boolean var1;
      int var5;
      int var7;
      label25: {
         boolean var10000 = IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl.v();
         int var2 = Boolean.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var2 = var2 * 31 + Boolean.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         var1 = var10000;
         var5 = var2 * 31;
         String var10001 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if (!var1) {
            if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == null) {
               var7 = 0;
               break label25;
            }

            var10001 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         var7 = var10001.hashCode();
      }

       var4 = var5 + var7;
      var5 = var4 * 31;
      String var8 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      if (!var1) {
         if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI == null) {
            return var5 + 0;
         }

         var8 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      return var5 + var8.hashCode();
   }

   @Override
   public boolean equals(@Nullable Object var1) {
       boolean var4 = false; // PX-FIX decl var4
      boolean var2 = IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl.v();
      Object var10000 = this;
      if (!var2) {
         if (this == var1) {
            return true;
         }

         var10000 = var1;
      }

      if (!var2) {
         if (!(var10000 instanceof lIIllIIIIlIIlIIllIIlIllIIllIllIlIIlllIllIIIlIIllIlIIllIIlIIIlllIllIlIlIllIIlllIlIlllI)) {
            return false;
         }

         var10000 = var1;
      }

      lIIllIIIIlIIlIIllIIlIllIIllIllIlIIlllIllIIIlIIllIlIIllIIlIIIlllIllIlIlIllIIlllIlIlllI var3;
      label56: {
         var3 = (lIIllIIIIlIIlIIllIIlIllIIllIllIlIIlllIllIIIlIIllIlIIllIIlIIIlllIllIlIlIllIIlllIlIlllI)var10000;
         var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         boolean var10001 = var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (!var2) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (var2) {
               break label56;
            }

            var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         if (var4 != var10001) {
            return false;
         }

         var4 = Intrinsics.areEqual(
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
            var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         );
      }

      if (!var2) {
         if (!var4) {
            return false;
         }

         var4 = Intrinsics.areEqual(
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
            var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         );
      }

      if (!var2) {
         if (!var4) {
            return false;
         }

         var4 = true;
      }

      return var4;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static { int var4 = 0; // PX-FIX hoist
        
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "i´²\u009f~\nÞ\u0084@\u0098êw\u009dÖ_3";
       var4 = "i´²\u009f~\nÞ\u0084@\u0098êw\u009dÖ_3".length();
      char var1 = 5;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 10;
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
                     case 0 -> 35;
                     case 1 -> 33;
                     case 2 -> 112;
                     case 3 -> 38;
                     case 4 -> 20;
                     case 5 -> 81;
                     default -> 117;
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

                  var2 = "OUW\u0080IZøüÄD\u001d\u0003£Åý|\u0082Eµ1ÂN\u0090\\CÔ~t\fèÍýÓ\u0004aY\u009e¸\u0085\u0004T";
                  var4 = "OUW\u0080IZøüÄD\u001d\u0003£Åý|\u0082Eµ1ÂN\u0090\\CÔ~t\fèÍýÓ\u0004aY\u009e¸\u0085\u0004T".length();
                  var1 = 28;
                  var8 = -1;
            }

            var10000 = 83;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) { short var4 = (short)0; // PX-FIX hoist
        
      int var2 = (var0 ^ 29708) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

          var4 = switch (var3[0] & 0xFF) {
            case 0 -> 193;
            case 1 -> 56;
            case 2 -> 184;
            case 3 -> 161;
            case 4 -> 108;
            case 5 -> 123;
            case 6 -> 162;
            case 7 -> 29;
            case 8 -> 213;
            case 9 -> 120;
            case 10 -> 77;
            case 11 -> 144;
            case 12 -> 119;
            case 13 -> 24;
            case 14 -> 244;
            case 15 -> 73;
            case 16 -> 122;
            case 17 -> 231;
            case 18 -> 34;
            case 19 -> 91;
            case 20 -> 121;
            case 21 -> 35;
            case 22 -> 239;
            case 23 -> 188;
            case 24 -> 105;
            case 25 -> 26;
            case 26 -> 0;
            case 27 -> 74;
            case 28 -> 134;
            case 29 -> 82;
            case 30 -> 63;
            case 31 -> 40;
            case 32 -> 141;
            case 33 -> 186;
            case 34 -> 181;
            case 35 -> 180;
            case 36 -> 237;
            case 37 -> 164;
            case 38 -> 11;
            case 39 -> 20;
            case 40 -> 19;
            case 41 -> 81;
            case 42 -> 76;
            case 43 -> 227;
            case 44 -> 233;
            case 45 -> 17;
            case 46 -> 112;
            case 47 -> 33;
            case 48 -> 253;
            case 49 -> 159;
            case 50 -> 204;
            case 51 -> 130;
            case 52 -> 75;
            case 53 -> 149;
            case 54 -> 232;
            case 55 -> 87;
            case 56 -> 145;
            case 57 -> 3;
            case 58 -> 39;
            case 59 -> 93;
            case 60 -> 54;
            case 61 -> 94;
            case 62 -> 154;
            case 63 -> 32;
            case 64 -> 7;
            case 65 -> 43;
            case 66 -> 111;
            case 67 -> 113;
            case 68 -> 44;
            case 69 -> 124;
            case 70 -> 171;
            case 71 -> 59;
            case 72 -> 219;
            case 73 -> 69;
            case 74 -> 216;
            case 75 -> 192;
            case 76 -> 153;
            case 77 -> 18;
            case 78 -> 52;
            case 79 -> 96;
            case 80 -> 167;
            case 81 -> 226;
            case 82 -> 9;
            case 83 -> 102;
            case 84 -> 106;
            case 85 -> 146;
            case 86 -> 12;
            case 87 -> 30;
            case 88 -> 139;
            case 89 -> 41;
            case 90 -> 212;
            case 91 -> 66;
            case 92 -> 31;
            case 93 -> 148;
            case 94 -> 191;
            case 95 -> 199;
            case 96 -> 248;
            case 97 -> 209;
            case 98 -> 88;
            case 99 -> 65;
            case 100 -> 80;
            case 101 -> 206;
            case 102 -> 126;
            case 103 -> 61;
            case 104 -> 116;
            case 105 -> 150;
            case 106 -> 229;
            case 107 -> 173;
            case 108 -> 4;
            case 109 -> 252;
            case 110 -> 178;
            case 111 -> 208;
            case 112 -> 15;
            case 113 -> 243;
            case 114 -> 129;
            case 115 -> 179;
            case 116 -> 50;
            case 117 -> 174;
            case 118 -> 45;
            case 119 -> 89;
            case 120 -> 189;
            case 121 -> 168;
            case 122 -> 157;
            case 123 -> 92;
            case 124 -> 241;
            case 125 -> 235;
            case 126 -> 197;
            case 127 -> 220;
            case 128 -> 230;
            case 129 -> 214;
            case 130 -> 165;
            case 131 -> 151;
            case 132 -> 190;
            case 133 -> 42;
            case 134 -> 16;
            case 135 -> 5;
            case 136 -> 99;
            case 137 -> 245;
            case 138 -> 234;
            case 139 -> 140;
            case 140 -> 13;
            case 141 -> 118;
            case 142 -> 48;
            case 143 -> 115;
            case 144 -> 210;
            case 145 -> 185;
            case 146 -> 100;
            case 147 -> 27;
            case 148 -> 200;
            case 149 -> 6;
            case 150 -> 236;
            case 151 -> 58;
            case 152 -> 142;
            case 153 -> 195;
            case 154 -> 155;
            case 155 -> 117;
            case 156 -> 86;
            case 157 -> 101;
            case 158 -> 23;
            case 159 -> 242;
            case 160 -> 95;
            case 161 -> 215;
            case 162 -> 223;
            case 163 -> 203;
            case 164 -> 143;
            case 165 -> 53;
            case 166 -> 246;
            case 167 -> 152;
            case 168 -> 104;
            case 169 -> 183;
            case 170 -> 176;
            case 171 -> 177;
            case 172 -> 163;
            case 173 -> 175;
            case 174 -> 128;
            case 175 -> 170;
            case 176 -> 64;
            case 177 -> 1;
            case 178 -> 147;
            case 179 -> 38;
            case 180 -> 251;
            case 181 -> 55;
            case 182 -> 62;
            case 183 -> 194;
            case 184 -> 228;
            case 185 -> 158;
            case 186 -> 36;
            case 187 -> 37;
            case 188 -> 201;
            case 189 -> 46;
            case 190 -> 131;
            case 191 -> 21;
            case 192 -> 135;
            case 193 -> 114;
            case 194 -> 8;
            case 195 -> 218;
            case 196 -> 90;
            case 197 -> 107;
            case 198 -> 254;
            case 199 -> 207;
            case 200 -> 127;
            case 201 -> 79;
            case 202 -> 109;
            case 203 -> 250;
            case 204 -> 110;
            case 205 -> 98;
            case 206 -> 67;
            case 207 -> 60;
            case 208 -> 238;
            case 209 -> 84;
            case 210 -> 247;
            case 211 -> 205;
            case 212 -> 25;
            case 213 -> 22;
            case 214 -> 97;
            case 215 -> 217;
            case 216 -> 172;
            case 217 -> 71;
            case 218 -> 49;
            case 219 -> 225;
            case 220 -> 2;
            case 221 -> 28;
            case 222 -> 156;
            case 223 -> 85;
            case 224 -> 137;
            case 225 -> 211;
            case 226 -> 221;
            case 227 -> 198;
            case 228 -> 224;
            case 229 -> 255;
            case 230 -> 68;
            case 231 -> 51;
            case 232 -> 125;
            case 233 -> 160;
            case 234 -> 169;
            case 235 -> 133;
            case 236 -> 57;
            case 237 -> 182;
            case 238 -> 72;
            case 239 -> 103;
            case 240 -> 187;
            case 241 -> 132;
            case 242 -> 136;
            case 243 -> 222;
            case 244 -> 47;
            case 245 -> 10;
            case 246 -> 240;
            case 247 -> 14;
            case 248 -> 138;
            case 249 -> 166;
            case 250 -> 202;
            case 251 -> 249;
            case 252 -> 83;
            case 253 -> 196;
            case 254 -> 78;
            default -> 70;
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
