package me.octo.client;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl {
   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10) { return null; } // PX-FIX ovld

   @SerializedName("id")
   @NotNull
   private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @SerializedName("name")
   @NotNull
   private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @SerializedName("type")
   @NotNull
   private final String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @SerializedName("points")
   private final int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @SerializedName("hasEtherwarp")
   private final boolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @SerializedName("author")
   @NotNull
   private final String IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @SerializedName("downloads")
   private final int IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @SerializedName("dateCreated")
   private final long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @SerializedName("lastUpdated")
   @Nullable
   private final Long IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @SerializedName("userRating")
   @Nullable
   private final Integer llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static boolean lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static String[] a;
   private static String[] b;

   public IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl(String var1, String var2, String var3, int var4, boolean var5, String var6, int var7, long var8, Long var10, Integer var11, int var12, kotlin.jvm.internal.DefaultConstructorMarker var13) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, (var12 & 256) != 0 ? null : var10, (var12 & 512) != 0 ? null : var11);
   }

   public static IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl a(IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var0, String var1, String var2, String var3, int var4, boolean var5, String var6, int var7, long var8, Long var10, Integer var11, int var12, Object var13) {
      if ((var12 & 1) != 0) {
         var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }
      if ((var12 & 2) != 0) {
         var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }
      if ((var12 & 4) != 0) {
         var3 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }
      if ((var12 & 8) != 0) {
         var4 = var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }
      if ((var12 & 16) != 0) {
         var5 = var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }
      if ((var12 & 32) != 0) {
         var6 = var0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }
      if ((var12 & 64) != 0) {
         var7 = var0.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }
      if ((var12 & 128) != 0) {
         var8 = var0.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }
      if ((var12 & 256) != 0) {
         var10 = var0.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }
      if ((var12 & 512) != 0) {
         var11 = var0.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }
      return var0.a(var1, var2, var3, var4, var5, var6, var7, var8, var10, var11);
   }

   public IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl(
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII @NotNull String var1,
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII @NotNull String var2,
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII @NotNull String var3,
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII int var4,
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII boolean var5,
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII @NotNull String var6,
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII int var7,
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII long var8,
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII @Nullable Long var10,
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII @Nullable Integer var11
   ) {
      short var10001 = -18209;
      short var10002 = -31881;
      Intrinsics.checkNotNullParameter(var1, "id");
      var10001 = -18240;
      var10002 = -26946;
      Intrinsics.checkNotNullParameter(var2, "name");
      var10001 = -18236;
      var10002 = 9506;
      Intrinsics.checkNotNullParameter(var3, "type");
      var10001 = -18210;
      var10002 = -14426;
      Intrinsics.checkNotNullParameter(var6, "author");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var6;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var7;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var8;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var10;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var11;
   }

   @NotNull
   public final String a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public final String b() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final String c() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final int d() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   public final boolean e() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @NotNull
   public final String f() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   public final int g() {
      return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   public final long h() {
      return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   @Nullable
   public final Long i() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   @Nullable
   public final Integer j() {
      return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   @NotNull
   public final llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll k() {
      return llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
   }

   @NotNull
   public final String l() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public final String m() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final String n() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final int o() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   public final boolean p() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @NotNull
   public final String q() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   public final int r() {
      return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   public final long s() {
      return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   @Nullable
   public final Long t() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   @Nullable
   public final Integer u() {
      return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   @NotNull
   public final IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl a(
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII @NotNull String var1,
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII @NotNull String var2,
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII @NotNull String var3,
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII int var4,
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII boolean var5,
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII @NotNull String var6,
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII int var7,
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII long var8,
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII @Nullable Long var10,
      @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII @Nullable Integer var11
   ) {
      short var10001 = -18234;
      short var10002 = -22889;
      Intrinsics.checkNotNullParameter(var1, "id");
      var10001 = -18229;
      var10002 = 8041;
      Intrinsics.checkNotNullParameter(var2, "name");
      var10001 = -18228;
      var10002 = 7678;
      Intrinsics.checkNotNullParameter(var3, "type");
      var10001 = -18235;
      var10002 = -14796;
      Intrinsics.checkNotNullParameter(var6, "author");
      return new IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl(
         var1, var2, var3, var4, var5, var6, var7, var8, var10, var11
      );
   }

   @NotNull
   @Override
   public String toString() {
      short var10000 = -18226;
      Integer var1 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      Long var2 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      long var3 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      int var5 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      String var6 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      boolean var7 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      int var8 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      String var9 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      String var10 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      String var11 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      short var10001 = -2501;
      short var10002 = -18225;
      short var10003 = -30679;
      short var10004 = -18230;
      short var10005 = 27792;
      short var10006 = -18233;
      short var10007 = -16999;
      short var10008 = -18238;
      short var10009 = -3815;
      short var10010 = -18239;
      short var10011 = -21549;
      short var10012 = -18231;
      short var10013 = -31381;
      short var10014 = -18237;
      short var10015 = 27559;
      short var10016 = -18227;
      short var10017 = -22659;
      short var10018 = -18232;
      short var10019 = 23936;
      return "RouteData(id="
         + var11
         + ", name="
         + var10
         + ", type="
         + var9
         + ", points="
         + var8
         + ", hasEtherwarp="
         + var7
         + ", author="
         + var6
         + ", downloads="
         + var5
         + ", dateCreated="
         + var3
         + ", lastUpdated="
         + var2
         + ", userRating="
         + var1
         + ")";
   }

   @Override
   public int hashCode() {
      boolean var1;
      int var12;
      int var14;
      label29: {
         int var2 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         var2 = var2 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
         var2 = var2 * 31 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.hashCode();
         boolean var10000 = v();
         var2 = var2 * 31 + Integer.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         var2 = var2 * 31 + Boolean.hashCode(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         var2 = var2 * 31 + this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.hashCode();
         var2 = var2 * 31 + Integer.hashCode(this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll);
         var1 = var10000;
         var2 = var2 * 31 + Long.hashCode(this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll);
         var12 = var2 * 31;
         Long var10001 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
         if (!var1) {
            if (this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII == null) {
               var14 = 0;
               break label29;
            }

            var10001 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
         }

         var14 = var10001.hashCode();
      }

      label23: {
         int var10 = var12 + var14;
         var12 = var10 * 31;
         Integer var15 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
         if (!var1) {
            if (this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI == null) {
               var14 = 0;
               break label23;
            }

            var15 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
         }

         var14 = var15.hashCode();
      }

      int var11 = var12 + var14;
      if (var1) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[3]
         );
      }

      return var11;
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      boolean var2 = w();
      Object var10000 = this;
      if (var2) {
         if (this == var1) {
            return true;
         }

         var10000 = var1;
      }

      if (var2) {
         if (!(var10000 instanceof IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl)) {
            return false;
         }

         var10000 = var1;
      }

      IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var3 = (IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl)var10000;
      int var4 = ((Intrinsics.areEqual(
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
      )) ? 1 : 0);
      if (var2) {
         if (var4 == 0) {
            return false;
         }

         var4 = ((Intrinsics.areEqual(
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         )) ? 1 : 0);
      }

      if (var2) {
         if (var4 == 0) {
            return false;
         }

         var4 = ((Intrinsics.areEqual(
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
            var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         )) ? 1 : 0);
      }

      if (var2) {
         if (var4 == 0) {
            return false;
         }

         var4 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      label104: {
         int var10001 = var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         if (var2) {
            if (var4 != var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
               return false;
            }

            var4 = ((this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) ? 1 : 0);
            if (!var2) {
               break label104;
            }

            var10001 = ((var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) ? 1 : 0);
         }

         if (var4 != var10001) {
            return false;
         }

         var4 = ((Intrinsics.areEqual(
            this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
            var3.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         )) ? 1 : 0);
      }

      if (var2) {
         if (var4 == 0) {
            return false;
         }

         var4 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      if (var2) {
         if (var4 != var3.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
            return false;
         }

         long var5;
         var4 = (
                  var5 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                     - var3.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
               )
               == 0L
            ? 0
            : (var5 < 0L ? -1 : 1);
      }

      if (var2) {
         if (var4 != 0) {
            return false;
         }

         var4 = ((Intrinsics.areEqual(
            this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
            var3.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         )) ? 1 : 0);
      }

      if (var2) {
         if (var4 == 0) {
            return false;
         }

         var4 = ((Intrinsics.areEqual(
            this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
            var3.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
         )) ? 1 : 0);
      }

      if (var2) {
         if (var4 == 0) {
            return false;
         }

         var4 = 1;
      }

      return (var4 != 0);
   }

   public static void b(boolean var0) {
      lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var0;
   }

   public static boolean v() {
      return lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   public static boolean w() {
      boolean var0 = v();
      return !var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[18];
      int var3 = 0;
      b(false);
      String var2 = "ò\bßkYW?\r]t\u0080WÂF\u0019uµ:½bÜ\u000e=\u008e$»z\\î\u0004üÙ,\u007f\tò\u0004¢\u0099\u0098/\u0004ÞÚS\\\u0007\u0015$9öÁÿ\u0092\fÉ²²2¥¸¨Þ/{ôÖ\rRêÐ%ÈÙkc»\u000eÌ\u008e\u0015\tæßC\u009f\u0013\r»t\n\u0002Øµ\u0006Ë\u001c\u0006\u001f9æ\u0004\u0086Ù\u001c'\u000e\u0083\u0082û:\u008f}¡\u0011À9\u008acÝq\u000f\u0091¤µþÌÅ\u00198\u0006VQûÓ«~\t%P*t\u0010/~÷Ê\u0004\u0003µè±";
      int var4 = "ò\bßkYW?\r]t\u0080WÂF\u0019uµ:½bÜ\u000e=\u008e$»z\\î\u0004üÙ,\u007f\tò\u0004¢\u0099\u0098/\u0004ÞÚS\\\u0007\u0015$9öÁÿ\u0092\fÉ²²2¥¸¨Þ/{ôÖ\rRêÐ%ÈÙkc»\u000eÌ\u008e\u0015\tæßC\u009f\u0013\r»t\n\u0002Øµ\u0006Ë\u001c\u0006\u001f9æ\u0004\u0086Ù\u001c'\u000e\u0083\u0082û:\u008f}¡\u0011À9\u008acÝq\u000f\u0091¤µþÌÅ\u00198\u0006VQûÓ«~\t%P*t\u0010/~÷Ê\u0004\u0003µè±"
         .length();
      char var1 = 7;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 2;
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
                     case 0 -> 96;
                     case 1 -> 49;
                     case 2 -> 8;
                     case 3 -> 75;
                     case 4 -> 47;
                     case 5 -> 57;
                     default -> 78;
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
                     b = new String[18];
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

                  var2 = "q1\u0006Ö²\u0096ù\u0018\t";
                  var4 = "q1\u0006Ö²\u0096ù\u0018\t".length();
                  var1 = 2;
                  var8 = -1;
            }

            var10000 = 19;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -18225) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 129;
            case 1 -> 6;
            case 2 -> 12;
            case 3 -> 70;
            case 4 -> 105;
            case 5 -> 55;
            case 6 -> 91;
            case 7 -> 25;
            case 8 -> 36;
            case 9 -> 235;
            case 10 -> 51;
            case 11 -> 90;
            case 12 -> 89;
            case 13 -> 161;
            case 14 -> 215;
            case 15 -> 186;
            case 16 -> 79;
            case 17 -> 118;
            case 18 -> 125;
            case 19 -> 1;
            case 20 -> 9;
            case 21 -> 117;
            case 22 -> 67;
            case 23 -> 234;
            case 24 -> 150;
            case 25 -> 19;
            case 26 -> 231;
            case 27 -> 106;
            case 28 -> 145;
            case 29 -> 45;
            case 30 -> 142;
            case 31 -> 50;
            case 32 -> 217;
            case 33 -> 134;
            case 34 -> 128;
            case 35 -> 225;
            case 36 -> 3;
            case 37 -> 14;
            case 38 -> 167;
            case 39 -> 172;
            case 40 -> 80;
            case 41 -> 133;
            case 42 -> 191;
            case 43 -> 103;
            case 44 -> 116;
            case 45 -> 78;
            case 46 -> 250;
            case 47 -> 64;
            case 48 -> 100;
            case 49 -> 163;
            case 50 -> 26;
            case 51 -> 230;
            case 52 -> 86;
            case 53 -> 107;
            case 54 -> 40;
            case 55 -> 197;
            case 56 -> 30;
            case 57 -> 28;
            case 58 -> 18;
            case 59 -> 198;
            case 60 -> 188;
            case 61 -> 223;
            case 62 -> 208;
            case 63 -> 206;
            case 64 -> 156;
            case 65 -> 84;
            case 66 -> 2;
            case 67 -> 194;
            case 68 -> 48;
            case 69 -> 174;
            case 70 -> 52;
            case 71 -> 104;
            case 72 -> 4;
            case 73 -> 27;
            case 74 -> 111;
            case 75 -> 200;
            case 76 -> 98;
            case 77 -> 143;
            case 78 -> 8;
            case 79 -> 210;
            case 80 -> 180;
            case 81 -> 140;
            case 82 -> 169;
            case 83 -> 130;
            case 84 -> 29;
            case 85 -> 20;
            case 86 -> 233;
            case 87 -> 202;
            case 88 -> 66;
            case 89 -> 147;
            case 90 -> 127;
            case 91 -> 157;
            case 92 -> 95;
            case 93 -> 21;
            case 94 -> 204;
            case 95 -> 10;
            case 96 -> 120;
            case 97 -> 175;
            case 98 -> 137;
            case 99 -> 124;
            case 100 -> 42;
            case 101 -> 41;
            case 102 -> 136;
            case 103 -> 0;
            case 104 -> 155;
            case 105 -> 38;
            case 106 -> 62;
            case 107 -> 254;
            case 108 -> 102;
            case 109 -> 219;
            case 110 -> 75;
            case 111 -> 93;
            case 112 -> 159;
            case 113 -> 144;
            case 114 -> 34;
            case 115 -> 240;
            case 116 -> 246;
            case 117 -> 173;
            case 118 -> 61;
            case 119 -> 53;
            case 120 -> 213;
            case 121 -> 176;
            case 122 -> 187;
            case 123 -> 69;
            case 124 -> 22;
            case 125 -> 112;
            case 126 -> 236;
            case 127 -> 131;
            case 128 -> 205;
            case 129 -> 138;
            case 130 -> 185;
            case 131 -> 193;
            case 132 -> 241;
            case 133 -> 212;
            case 134 -> 97;
            case 135 -> 94;
            case 136 -> 148;
            case 137 -> 123;
            case 138 -> 224;
            case 139 -> 44;
            case 140 -> 149;
            case 141 -> 245;
            case 142 -> 113;
            case 143 -> 132;
            case 144 -> 109;
            case 145 -> 99;
            case 146 -> 222;
            case 147 -> 158;
            case 148 -> 209;
            case 149 -> 207;
            case 150 -> 255;
            case 151 -> 37;
            case 152 -> 49;
            case 153 -> 181;
            case 154 -> 5;
            case 155 -> 253;
            case 156 -> 232;
            case 157 -> 59;
            case 158 -> 54;
            case 159 -> 201;
            case 160 -> 92;
            case 161 -> 101;
            case 162 -> 154;
            case 163 -> 57;
            case 164 -> 237;
            case 165 -> 226;
            case 166 -> 177;
            case 167 -> 238;
            case 168 -> 152;
            case 169 -> 108;
            case 170 -> 72;
            case 171 -> 228;
            case 172 -> 76;
            case 173 -> 82;
            case 174 -> 121;
            case 175 -> 32;
            case 176 -> 46;
            case 177 -> 247;
            case 178 -> 135;
            case 179 -> 122;
            case 180 -> 220;
            case 181 -> 244;
            case 182 -> 211;
            case 183 -> 162;
            case 184 -> 171;
            case 185 -> 68;
            case 186 -> 196;
            case 187 -> 243;
            case 188 -> 151;
            case 189 -> 229;
            case 190 -> 83;
            case 191 -> 96;
            case 192 -> 74;
            case 193 -> 60;
            case 194 -> 31;
            case 195 -> 184;
            case 196 -> 115;
            case 197 -> 203;
            case 198 -> 189;
            case 199 -> 214;
            case 200 -> 239;
            case 201 -> 252;
            case 202 -> 24;
            case 203 -> 39;
            case 204 -> 242;
            case 205 -> 195;
            case 206 -> 88;
            case 207 -> 178;
            case 208 -> 166;
            case 209 -> 81;
            case 210 -> 249;
            case 211 -> 168;
            case 212 -> 216;
            case 213 -> 85;
            case 214 -> 13;
            case 215 -> 16;
            case 216 -> 179;
            case 217 -> 141;
            case 218 -> 119;
            case 219 -> 199;
            case 220 -> 17;
            case 221 -> 15;
            case 222 -> 190;
            case 223 -> 227;
            case 224 -> 192;
            case 225 -> 218;
            case 226 -> 77;
            case 227 -> 47;
            case 228 -> 146;
            case 229 -> 126;
            case 230 -> 251;
            case 231 -> 153;
            case 232 -> 56;
            case 233 -> 73;
            case 234 -> 170;
            case 235 -> 183;
            case 236 -> 182;
            case 237 -> 71;
            case 238 -> 7;
            case 239 -> 65;
            case 240 -> 164;
            case 241 -> 11;
            case 242 -> 139;
            case 243 -> 58;
            case 244 -> 23;
            case 245 -> 160;
            case 246 -> 43;
            case 247 -> 248;
            case 248 -> 114;
            case 249 -> 87;
            case 250 -> 63;
            case 251 -> 221;
            case 252 -> 165;
            case 253 -> 33;
            case 254 -> 35;
            default -> 110;
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
