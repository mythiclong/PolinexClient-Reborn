package me.octo.client;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIIllIlllIlIIIlIIlIIlIIlIlIlIIllIlIlllIIlIlllllIllllIIIllllllIIllllIIIIIIIlIlIllIlll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public lIIIllIlllIlIIIlIIlIIlIIlIlIlIIllIlIlllIIlIlllllIllllIIIllllllIIllllIIIIIIIlIlIllIlll(Object... px) {
           this((String)null, (String)null, 0L, 0L, 0); // PX-FIX: 委托主构造器（final 字段初始化）
        }

   @SerializedName("name")
   @Nullable
   private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @SerializedName("author")
   @Nullable
   private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @SerializedName("created")
   private final long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @SerializedName("lastModified")
   private final long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @SerializedName("version")
   private final int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static String[] a;
   private static String[] b;

   public lIIIllIlllIlIIIlIIlIIlIIlIlIlIIllIlIlllIIlIlllllIllllIIIllllllIIllllIIIIIIIlIlIllIlll(
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII @Nullable String var1,
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII @Nullable String var2,
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII long var3,
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII long var5,
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII int var7
   ) {
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var5;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var7;
   }

   public lIIIllIlllIlIIIlIIlIIlIIlIlIlIIllIlIlllIIlIlllllIllllIIIllllllIIllllIIIIIIIlIlIllIlll(@Nullable String var1, @Nullable String var2, long var3, long var5, int var7, int var8, kotlin.jvm.internal.DefaultConstructorMarker var9) {
      if ((var8 & 1) != 0) {
         var1 = null;
      }

      if ((var8 & 2) != 0) {
         var2 = null;
      }

      if ((var8 & 4) != 0) {
         var3 = System.currentTimeMillis();
      }

      if ((var8 & 8) != 0) {
         var5 = System.currentTimeMillis();
      }

      if ((var8 & 16) != 0) {
         var7 = 1;
      }

      this(var1, var2, var3, var5, var7);
   }

   public static lIIIllIlllIlIIIlIIlIIlIIlIlIlIIllIlIlllIIlIlllllIllllIIIllllllIIllllIIIIIIIlIlIllIlll a(lIIIllIlllIlIIIlIIlIIlIIlIlIlIIllIlIlllIIlIlllllIllllIIIllllllIIllllIIIIIIIlIlIllIlll var0, @Nullable String var1, @Nullable String var2, long var3, long var5, int var7, int var8, Object var9) {
      boolean var10 = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.R();
      if ((var8 & 1) != 0) {
         var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      if ((var8 & 2) != 0) {
         var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      if ((var8 & 4) != 0) {
         var3 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      if ((var8 & 8) != 0) {
         var5 = var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      if ((var8 & 16) != 0) {
         var7 = var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      return var0.a(var1, var2, var3, var5, var7);
   }

   @Nullable
   public final String a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @Nullable
   public final String b() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final long c() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final long d() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   public final int e() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @Nullable
   public final String f() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @Nullable
   public final String g() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final long h() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final long i() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   public final int j() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @NotNull
   public final lIIIllIlllIlIIIlIIlIIlIIlIlIlIIllIlIlllIIlIlllllIllllIIIllllllIIllllIIIIIIIlIlIllIlll a(
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII @Nullable String var1,
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII @Nullable String var2,
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII long var3,
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII long var5,
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII int var7
   ) {
      return new lIIIllIlllIlIIIlIIlIIlIIlIlIlIIllIlIlllIIlIlllllIllllIIIllllllIIllllIIIIIIIlIlIllIlll(var1, var2, var3, var5, var7);
   }

   @NotNull
   @Override
   public String toString() {
      short var10000 = 30060;
      int var1 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      long var2 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      long var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      String var6 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      String var7 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      short var10001 = -15462;
      short var10002 = 30057;
      short var10003 = 6954;
      short var10004 = 30056;
      short var10005 = -14422;
      short var10006 = 30059;
      short var10007 = 10554;
      short var10008 = 30058;
      short var10009 = -9928;
      return "RouteMetadata(name=" + var7 + ", author=" + var6 + ", created=" + var4 + ", lastModified=" + var2 + ", version=" + var1 + ")";
   }

   @Override
   public int hashCode() {
      boolean var1;
      int var6;
      label25: {
         var1 = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.Q();
         String var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var1) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl == null) {
               var6 = 0;
               break label25;
            }

            var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         }

         var6 = var10000.hashCode();
      }

      int var8;
      label19: {
         int var2 = var6;
         var6 = var2 * 31;
         String var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if (var1) {
            if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII == null) {
               var8 = 0;
               break label19;
            }

            var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         var8 = var10001.hashCode();
      }

      int var3 = var6 + var8;
      var3 = var3 * 31 + Long.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      var3 = var3 * 31 + Long.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      return var3 * 31 + Integer.hashCode(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
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
         if (!(var10000 instanceof lIIIllIlllIlIIIlIIlIIlIIlIlIlIIllIlIlllIIlIlllllIllllIIIllllllIIllllIIIIIIIlIlIllIlll)) {
            return false;
         }

         var10000 = var1;
      }

      lIIIllIlllIlIIIlIIlIIlIIlIlIlIIllIlIlllIIlIlllllIllllIIIllllllIIllllIIIIIIIlIlIllIlll var3 = (lIIIllIlllIlIIIlIIlIIlIIlIlIlIIllIlIlllIIlIlllllIllllIIIllllllIIllllIIIIIIIlIlIllIlll)var10000;
      int var4 = ((Intrinsics.areEqual(
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
      )) ? 1 : 0);
      if (!var2) {
         if (var4 == 0) {
            return false;
         }

         var4 = ((Intrinsics.areEqual(
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         )) ? 1 : 0);
      }

      if (!var2) {
         if (var4 == 0) {
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

      if (!var2) {
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

      if (!var2) {
         if (var4 != 0) {
            return false;
         }

         var4 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      if (!var2) {
         if (var4 != var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) {
            return false;
         }

         var4 = 1;
      }

      return (var4 != 0);
   }

   public lIIIllIlllIlIIIlIIlIIlIIlIlIlIIllIlIlllIIlIlllllIllllIIIllllllIIllllIIIIIIIlIlIllIlll() {
      this(null, null, 0L, 0L, 0, 31, null);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[5];
      int var3 = 0;
      String var2 = "\u009dà*}à\u0095C°n±\t²ýÍÙOï\u009eÀô\nH·\u0085\u0080µÍ\u0001á\u0092Ð";
      int var4 = "\u009dà*}à\u0095C°n±\t²ýÍÙOï\u009eÀô\nH·\u0085\u0080µÍ\u0001á\u0092Ð".length();
      char var1 = '\n';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 108;
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
                     case 0 -> 78;
                     case 1 -> 28;
                     case 2 -> 123;
                     case 3 -> 85;
                     case 4 -> 65;
                     case 5 -> 44;
                     default -> 43;
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
                     b = new String[5];
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

                  var2 = "ûT\u009e\u008fùØúÓ0µÈ#ÆÑq\u0013\u0087ß¹M1\u000e\u001f\f¤;øC#/\u001aF© p";
                  var4 = "ûT\u009e\u008fùØúÓ0µÈ#ÆÑq\u0013\u0087ß¹M1\u000e\u001f\f¤;øC#/\u001aF© p".length();
                  var1 = 15;
                  var8 = -1;
            }

            var10000 = 20;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 30056) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 67;
            case 1 -> 121;
            case 2 -> 128;
            case 3 -> 52;
            case 4 -> 233;
            case 5 -> 222;
            case 6 -> 195;
            case 7 -> 108;
            case 8 -> 221;
            case 9 -> 111;
            case 10 -> 136;
            case 11 -> 131;
            case 12 -> 53;
            case 13 -> 83;
            case 14 -> 213;
            case 15 -> 35;
            case 16 -> 50;
            case 17 -> 72;
            case 18 -> 43;
            case 19 -> 250;
            case 20 -> 167;
            case 21 -> 197;
            case 22 -> 21;
            case 23 -> 116;
            case 24 -> 171;
            case 25 -> 199;
            case 26 -> 198;
            case 27 -> 137;
            case 28 -> 55;
            case 29 -> 200;
            case 30 -> 117;
            case 31 -> 109;
            case 32 -> 147;
            case 33 -> 62;
            case 34 -> 191;
            case 35 -> 7;
            case 36 -> 112;
            case 37 -> 223;
            case 38 -> 151;
            case 39 -> 70;
            case 40 -> 183;
            case 41 -> 40;
            case 42 -> 218;
            case 43 -> 79;
            case 44 -> 214;
            case 45 -> 157;
            case 46 -> 20;
            case 47 -> 10;
            case 48 -> 71;
            case 49 -> 203;
            case 50 -> 161;
            case 51 -> 69;
            case 52 -> 178;
            case 53 -> 240;
            case 54 -> 146;
            case 55 -> 217;
            case 56 -> 245;
            case 57 -> 100;
            case 58 -> 207;
            case 59 -> 34;
            case 60 -> 206;
            case 61 -> 123;
            case 62 -> 76;
            case 63 -> 98;
            case 64 -> 139;
            case 65 -> 152;
            case 66 -> 28;
            case 67 -> 60;
            case 68 -> 2;
            case 69 -> 119;
            case 70 -> 84;
            case 71 -> 192;
            case 72 -> 45;
            case 73 -> 3;
            case 74 -> 145;
            case 75 -> 107;
            case 76 -> 253;
            case 77 -> 133;
            case 78 -> 154;
            case 79 -> 73;
            case 80 -> 182;
            case 81 -> 64;
            case 82 -> 27;
            case 83 -> 22;
            case 84 -> 90;
            case 85 -> 118;
            case 86 -> 216;
            case 87 -> 96;
            case 88 -> 13;
            case 89 -> 47;
            case 90 -> 238;
            case 91 -> 114;
            case 92 -> 16;
            case 93 -> 229;
            case 94 -> 91;
            case 95 -> 159;
            case 96 -> 219;
            case 97 -> 42;
            case 98 -> 150;
            case 99 -> 226;
            case 100 -> 1;
            case 101 -> 165;
            case 102 -> 235;
            case 103 -> 115;
            case 104 -> 80;
            case 105 -> 99;
            case 106 -> 242;
            case 107 -> 74;
            case 108 -> 0;
            case 109 -> 51;
            case 110 -> 247;
            case 111 -> 249;
            case 112 -> 175;
            case 113 -> 97;
            case 114 -> 234;
            case 115 -> 6;
            case 116 -> 174;
            case 117 -> 185;
            case 118 -> 254;
            case 119 -> 169;
            case 120 -> 5;
            case 121 -> 244;
            case 122 -> 129;
            case 123 -> 44;
            case 124 -> 19;
            case 125 -> 41;
            case 126 -> 196;
            case 127 -> 124;
            case 128 -> 160;
            case 129 -> 252;
            case 130 -> 86;
            case 131 -> 122;
            case 132 -> 126;
            case 133 -> 164;
            case 134 -> 187;
            case 135 -> 193;
            case 136 -> 8;
            case 137 -> 33;
            case 138 -> 18;
            case 139 -> 24;
            case 140 -> 9;
            case 141 -> 30;
            case 142 -> 224;
            case 143 -> 68;
            case 144 -> 110;
            case 145 -> 255;
            case 146 -> 190;
            case 147 -> 180;
            case 148 -> 65;
            case 149 -> 140;
            case 150 -> 201;
            case 151 -> 208;
            case 152 -> 61;
            case 153 -> 181;
            case 154 -> 166;
            case 155 -> 236;
            case 156 -> 125;
            case 157 -> 48;
            case 158 -> 230;
            case 159 -> 75;
            case 160 -> 39;
            case 161 -> 173;
            case 162 -> 88;
            case 163 -> 127;
            case 164 -> 248;
            case 165 -> 225;
            case 166 -> 87;
            case 167 -> 194;
            case 168 -> 158;
            case 169 -> 241;
            case 170 -> 215;
            case 171 -> 132;
            case 172 -> 153;
            case 173 -> 134;
            case 174 -> 189;
            case 175 -> 89;
            case 176 -> 66;
            case 177 -> 144;
            case 178 -> 38;
            case 179 -> 209;
            case 180 -> 202;
            case 181 -> 46;
            case 182 -> 138;
            case 183 -> 113;
            case 184 -> 82;
            case 185 -> 186;
            case 186 -> 120;
            case 187 -> 156;
            case 188 -> 246;
            case 189 -> 4;
            case 190 -> 210;
            case 191 -> 23;
            case 192 -> 204;
            case 193 -> 103;
            case 194 -> 130;
            case 195 -> 179;
            case 196 -> 251;
            case 197 -> 57;
            case 198 -> 143;
            case 199 -> 95;
            case 200 -> 31;
            case 201 -> 188;
            case 202 -> 205;
            case 203 -> 14;
            case 204 -> 104;
            case 205 -> 184;
            case 206 -> 163;
            case 207 -> 78;
            case 208 -> 56;
            case 209 -> 162;
            case 210 -> 170;
            case 211 -> 85;
            case 212 -> 212;
            case 213 -> 77;
            case 214 -> 148;
            case 215 -> 228;
            case 216 -> 81;
            case 217 -> 36;
            case 218 -> 232;
            case 219 -> 231;
            case 220 -> 102;
            case 221 -> 11;
            case 222 -> 17;
            case 223 -> 63;
            case 224 -> 94;
            case 225 -> 176;
            case 226 -> 54;
            case 227 -> 49;
            case 228 -> 141;
            case 229 -> 237;
            case 230 -> 142;
            case 231 -> 29;
            case 232 -> 58;
            case 233 -> 92;
            case 234 -> 101;
            case 235 -> 227;
            case 236 -> 26;
            case 237 -> 220;
            case 238 -> 106;
            case 239 -> 149;
            case 240 -> 177;
            case 241 -> 155;
            case 242 -> 211;
            case 243 -> 135;
            case 244 -> 37;
            case 245 -> 59;
            case 246 -> 32;
            case 247 -> 15;
            case 248 -> 172;
            case 249 -> 168;
            case 250 -> 105;
            case 251 -> 93;
            case 252 -> 239;
            case 253 -> 12;
            case 254 -> 243;
            default -> 25;
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
