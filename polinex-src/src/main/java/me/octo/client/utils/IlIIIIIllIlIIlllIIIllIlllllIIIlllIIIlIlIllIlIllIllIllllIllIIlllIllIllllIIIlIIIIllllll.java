package me.octo.client.utils;

import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.AABB;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IlIIIIIllIlIIlllIIIllIlllllIIIlllIIIlIlIllIlIllIllIllllIllIIlllIllIllllIIIlIIIIllllll {
   @NotNull
   private final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private ArrayList<IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final Pair<BlockPos, BlockPos> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private final AABB lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private final BlockPos IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private final int IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] a;
   private static String[] b;

   public IlIIIIIllIlIIlllIIIllIlllllIIIlllIIIlIlIllIlIllIllIllllIllIIlllIllIllllIIIlIIIIllllll(
      @NotNull IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var1,
      @NotNull ArrayList<IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII> var2,
      @NotNull Pair<? extends BlockPos, ? extends BlockPos> var3,
      @NotNull AABB var4,
      @NotNull BlockPos var5,
      int var6
   ) {
      short var10001 = 27673;
      short var10002 = -3538;
      Intrinsics.checkNotNullParameter(var1, "type");
      var10001 = 27670;
      var10002 = -9440;
      Intrinsics.checkNotNullParameter(var2, "blocks");
      var10001 = 27679;
      var10002 = -29413;
      Intrinsics.checkNotNullParameter(var3, "bounds");
      var10001 = 27672;
      var10002 = -6595;
      Intrinsics.checkNotNullParameter(var4, "boundingBox");
      var10001 = 27667;
      var10002 = 13851;
      Intrinsics.checkNotNullParameter(var5, "center");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = ((Pair<BlockPos,BlockPos>)(Object)(var3));
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var6;
   }

   @NotNull
   public final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public final ArrayList<IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII> b() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final void a(@NotNull ArrayList<IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII> var1) {
      short var10001 = 27664;
      short var10002 = -25086;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
   }

   @NotNull
   public final Pair<BlockPos, BlockPos> c() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public final AABB d() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @NotNull
   public final BlockPos e() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   public final int f() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @NotNull
   public final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI g() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public final ArrayList<IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII> h() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final Pair<BlockPos, BlockPos> i() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public final AABB j() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @NotNull
   public final BlockPos k() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   public final int l() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @NotNull
   public final IlIIIIIllIlIIlllIIIllIlllllIIIlllIIIlIlIllIlIllIllIllllIllIIlllIllIllllIIIlIIIIllllll a(
      @NotNull IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var1,
      @NotNull ArrayList<IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII> var2,
      @NotNull Pair<? extends BlockPos, ? extends BlockPos> var3,
      @NotNull AABB var4,
      @NotNull BlockPos var5,
      int var6
   ) {
      short var10001 = 27668;
      short var10002 = 532;
      Intrinsics.checkNotNullParameter(var1, "type");
      var10001 = 27651;
      var10002 = -9343;
      Intrinsics.checkNotNullParameter(var2, "blocks");
      var10001 = 27678;
      var10002 = -9383;
      Intrinsics.checkNotNullParameter(var3, "bounds");
      var10001 = 27675;
      var10002 = 29284;
      Intrinsics.checkNotNullParameter(var4, "boundingBox");
      var10001 = 27677;
      var10002 = -9335;
      Intrinsics.checkNotNullParameter(var5, "center");
      return new IlIIIIIllIlIIlllIIIllIlllllIIIlllIIIlIlIllIlIllIllIllllIllIIlllIllIllllIIIlIIIIllllll(var1, var2, var3, var4, var5, var6);
   }

   @NotNull
   @Override
   public String toString() {
      short var10000 = 27669;
      int var1 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      BlockPos var2 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      AABB var3 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      Pair var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      ArrayList var5 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var6 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      short var10001 = 21603;
      short var10002 = 27676;
      short var10003 = -13473;
      short var10004 = 27671;
      short var10005 = 3121;
      short var10006 = 27665;
      short var10007 = 22687;
      short var10008 = 27674;
      short var10009 = -14834;
      short var10010 = 27666;
      short var10011 = 17903;
      return "Tree(type=" + var6 + ", blocks=" + var5 + ", bounds=" + var4 + ", boundingBox=" + var3 + ", center=" + var2 + ", size=" + var1 + ")";
   }

   @Override
   public int hashCode() {
      IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.d();
      int var2 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
      var2 = var2 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
      var2 = var2 * 31 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.hashCode();
      var2 = var2 * 31 + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.hashCode();
      var2 = var2 * 31 + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.hashCode();
      var2 = var2 * 31 + Integer.hashCode(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
      if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.b(new int[4]);
      }

      return var2;
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      int[] var2 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.d();
      Object var10000 = this;
      if (var2 != null) {
         if (this == var1) {
            return true;
         }

         var10000 = var1;
      }

      if (var2 != null) {
         if (!(var10000 instanceof IlIIIIIllIlIIlllIIIllIlllllIIIlllIIIlIlIllIlIllIllIllllIllIIlllIllIllllIIIlIIIIllllll)) {
            return false;
         }

         var10000 = var1;
      }

      IlIIIIIllIlIIlllIIIllIlllllIIIlllIIIlIlIllIlIllIllIllllIllIIlllIllIllllIIIlIIIIllllll var3 = (IlIIIIIllIlIIlllIIIllIlllllIIIlllIIIlIlIllIlIllIllIllllIllIIlllIllIllllIIIlIIIIllllll)var10000;
      var10000 = this;
      if (var2 != null) {
         if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
            return false;
         }

         var10000 = this;
      }

      int var5 = ((Intrinsics.areEqual(
         ((IlIIIIIllIlIIlllIIIllIlllllIIIlllIIIlIlIllIlIllIllIllllIllIIlllIllIllllIIIlIIIIllllll)var10000).lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
      )) ? 1 : 0);
      if (var2 != null) {
         if (var5 == 0) {
            return false;
         }

         var5 = ((Intrinsics.areEqual(
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
            var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         )) ? 1 : 0);
      }

      if (var2 != null) {
         if (var5 == 0) {
            return false;
         }

         var5 = ((Intrinsics.areEqual(
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
            var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         )) ? 1 : 0);
      }

      if (var2 != null) {
         if (var5 == 0) {
            return false;
         }

         var5 = ((Intrinsics.areEqual(
            this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
            var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         )) ? 1 : 0);
      }

      if (var2 != null) {
         if (var5 == 0) {
            return false;
         }

         var5 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      if (var2 != null) {
         if (var5 != var3.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
            return false;
         }

         var5 = 1;
      }

      return (var5 != 0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[17];
      int var3 = 0;
      String var2 = "7\u001d\u009e0]k\u0007ÁlûîP\u0019\u0001\u000e\u0012Ü\u0090þ\u0001Ö\u009c\u008aàkÓÁí\u0084\u0007¯w2©ê\u0015è\t«I§Lç\u0080@Z(\u0006©ám\u0090\f\u008b\nÄ\u0018:tîÖ\u008aÊ\u0097\u0003\u0004\u008b»âj\u000b&\u0012\u0086\u0080'?a^86[\tt;]\b\u0082Y\u00959³\u0004®ìF\u0080\u000buØìÙj\u0014È;\r\u009aý\u0006w\u000f¬#bQ\u0006FÎ\u008a\u001b¦V\u0006À\u007f`|\u0082â";
      int var4 = "7\u001d\u009e0]k\u0007ÁlûîP\u0019\u0001\u000e\u0012Ü\u0090þ\u0001Ö\u009c\u008aàkÓÁí\u0084\u0007¯w2©ê\u0015è\t«I§Lç\u0080@Z(\u0006©ám\u0090\f\u008b\nÄ\u0018:tîÖ\u008aÊ\u0097\u0003\u0004\u008b»âj\u000b&\u0012\u0086\u0080'?a^86[\tt;]\b\u0082Y\u00959³\u0004®ìF\u0080\u000buØìÙj\u0014È;\r\u009aý\u0006w\u000f¬#bQ\u0006FÎ\u008a\u001b¦V\u0006À\u007f`|\u0082â"
         .length();
      char var1 = 6;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 123;
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
                     case 0 -> 105;
                     case 1 -> 98;
                     case 2 -> 32;
                     case 3 -> 118;
                     case 4 -> 88;
                     case 5 -> 63;
                     default -> 28;
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
                     b = new String[17];
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "jÑG\u00849/\u0015Û´\u0006\u0004ï\u0000\u0089yp";
                  var4 = "jÑG\u00849/\u0015Û´\u0006\u0004ï\u0000\u0089yp".length();
                  var1 = '\t';
                  var8 = -1;
            }

            var10000 = 68;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 27667) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 115;
            case 1 -> 161;
            case 2 -> 135;
            case 3 -> 130;
            case 4 -> 47;
            case 5 -> 48;
            case 6 -> 13;
            case 7 -> 169;
            case 8 -> 132;
            case 9 -> 70;
            case 10 -> 207;
            case 11 -> 221;
            case 12 -> 198;
            case 13 -> 133;
            case 14 -> 58;
            case 15 -> 141;
            case 16 -> 237;
            case 17 -> 251;
            case 18 -> 51;
            case 19 -> 228;
            case 20 -> 25;
            case 21 -> 75;
            case 22 -> 15;
            case 23 -> 118;
            case 24 -> 6;
            case 25 -> 68;
            case 26 -> 226;
            case 27 -> 127;
            case 28 -> 171;
            case 29 -> 235;
            case 30 -> 189;
            case 31 -> 45;
            case 32 -> 145;
            case 33 -> 215;
            case 34 -> 4;
            case 35 -> 157;
            case 36 -> 245;
            case 37 -> 213;
            case 38 -> 67;
            case 39 -> 155;
            case 40 -> 81;
            case 41 -> 54;
            case 42 -> 209;
            case 43 -> 131;
            case 44 -> 112;
            case 45 -> 65;
            case 46 -> 224;
            case 47 -> 148;
            case 48 -> 11;
            case 49 -> 119;
            case 50 -> 63;
            case 51 -> 10;
            case 52 -> 14;
            case 53 -> 120;
            case 54 -> 57;
            case 55 -> 210;
            case 56 -> 87;
            case 57 -> 23;
            case 58 -> 113;
            case 59 -> 72;
            case 60 -> 2;
            case 61 -> 107;
            case 62 -> 85;
            case 63 -> 242;
            case 64 -> 214;
            case 65 -> 46;
            case 66 -> 172;
            case 67 -> 229;
            case 68 -> 9;
            case 69 -> 92;
            case 70 -> 239;
            case 71 -> 244;
            case 72 -> 181;
            case 73 -> 159;
            case 74 -> 124;
            case 75 -> 247;
            case 76 -> 236;
            case 77 -> 232;
            case 78 -> 238;
            case 79 -> 125;
            case 80 -> 248;
            case 81 -> 41;
            case 82 -> 105;
            case 83 -> 184;
            case 84 -> 35;
            case 85 -> 204;
            case 86 -> 218;
            case 87 -> 7;
            case 88 -> 83;
            case 89 -> 197;
            case 90 -> 93;
            case 91 -> 182;
            case 92 -> 250;
            case 93 -> 160;
            case 94 -> 249;
            case 95 -> 223;
            case 96 -> 62;
            case 97 -> 254;
            case 98 -> 147;
            case 99 -> 178;
            case 100 -> 186;
            case 101 -> 20;
            case 102 -> 196;
            case 103 -> 56;
            case 104 -> 69;
            case 105 -> 222;
            case 106 -> 31;
            case 107 -> 139;
            case 108 -> 116;
            case 109 -> 142;
            case 110 -> 78;
            case 111 -> 174;
            case 112 -> 149;
            case 113 -> 158;
            case 114 -> 36;
            case 115 -> 164;
            case 116 -> 230;
            case 117 -> 60;
            case 118 -> 183;
            case 119 -> 97;
            case 120 -> 165;
            case 121 -> 138;
            case 122 -> 84;
            case 123 -> 163;
            case 124 -> 43;
            case 125 -> 241;
            case 126 -> 42;
            case 127 -> 24;
            case 128 -> 34;
            case 129 -> 202;
            case 130 -> 90;
            case 131 -> 82;
            case 132 -> 49;
            case 133 -> 5;
            case 134 -> 53;
            case 135 -> 64;
            case 136 -> 79;
            case 137 -> 234;
            case 138 -> 28;
            case 139 -> 86;
            case 140 -> 217;
            case 141 -> 136;
            case 142 -> 203;
            case 143 -> 191;
            case 144 -> 106;
            case 145 -> 153;
            case 146 -> 211;
            case 147 -> 243;
            case 148 -> 114;
            case 149 -> 206;
            case 150 -> 108;
            case 151 -> 22;
            case 152 -> 1;
            case 153 -> 39;
            case 154 -> 95;
            case 155 -> 177;
            case 156 -> 219;
            case 157 -> 126;
            case 158 -> 208;
            case 159 -> 88;
            case 160 -> 179;
            case 161 -> 167;
            case 162 -> 195;
            case 163 -> 61;
            case 164 -> 66;
            case 165 -> 187;
            case 166 -> 12;
            case 167 -> 89;
            case 168 -> 98;
            case 169 -> 74;
            case 170 -> 146;
            case 171 -> 37;
            case 172 -> 227;
            case 173 -> 16;
            case 174 -> 94;
            case 175 -> 252;
            case 176 -> 101;
            case 177 -> 212;
            case 178 -> 121;
            case 179 -> 109;
            case 180 -> 38;
            case 181 -> 152;
            case 182 -> 193;
            case 183 -> 27;
            case 184 -> 190;
            case 185 -> 156;
            case 186 -> 91;
            case 187 -> 71;
            case 188 -> 102;
            case 189 -> 129;
            case 190 -> 175;
            case 191 -> 220;
            case 192 -> 77;
            case 193 -> 246;
            case 194 -> 144;
            case 195 -> 96;
            case 196 -> 73;
            case 197 -> 205;
            case 198 -> 137;
            case 199 -> 21;
            case 200 -> 52;
            case 201 -> 194;
            case 202 -> 185;
            case 203 -> 26;
            case 204 -> 117;
            case 205 -> 170;
            case 206 -> 111;
            case 207 -> 18;
            case 208 -> 8;
            case 209 -> 199;
            case 210 -> 216;
            case 211 -> 240;
            case 212 -> 44;
            case 213 -> 0;
            case 214 -> 225;
            case 215 -> 99;
            case 216 -> 33;
            case 217 -> 151;
            case 218 -> 29;
            case 219 -> 80;
            case 220 -> 122;
            case 221 -> 173;
            case 222 -> 176;
            case 223 -> 150;
            case 224 -> 140;
            case 225 -> 201;
            case 226 -> 123;
            case 227 -> 55;
            case 228 -> 110;
            case 229 -> 104;
            case 230 -> 19;
            case 231 -> 100;
            case 232 -> 59;
            case 233 -> 255;
            case 234 -> 76;
            case 235 -> 180;
            case 236 -> 253;
            case 237 -> 231;
            case 238 -> 17;
            case 239 -> 192;
            case 240 -> 3;
            case 241 -> 200;
            case 242 -> 168;
            case 243 -> 143;
            case 244 -> 233;
            case 245 -> 103;
            case 246 -> 162;
            case 247 -> 166;
            case 248 -> 30;
            case 249 -> 40;
            case 250 -> 188;
            case 251 -> 128;
            case 252 -> 50;
            case 253 -> 32;
            case 254 -> 154;
            default -> 134;
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

   // PX-FIX synth restored from jar bytecode
  public static me.octo.client.utils.IlIIIIIllIlIIlllIIIllIlllllIIIlllIIIlIlIllIlIllIllIllllIllIIlllIllIllllIIIlIIIIllllll a(me.octo.client.utils.IlIIIIIllIlIIlllIIIllIlllllIIIlllIIIlIlIllIlIllIllIllllIllIIlllIllIllllIIIlIIIIllllll p0, me.octo.client.utils.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI p1, java.util.ArrayList p2, kotlin.Pair p3, net.minecraft.world.phys.AABB p4, net.minecraft.core.BlockPos p5, int p6, int p7, java.lang.Object p8) {
      int[] pxmask = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.d();
      if ((pxmask != null) || (p7 & 1) != 0) { p1 = (p0).IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
      if ((pxmask != null) || (p7 & 2) != 0) { p2 = (p0).lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
      if ((pxmask != null) || (p7 & 4) != 0) { p3 = (p0).IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl; }
      if ((pxmask != null) || (p7 & 8) != 0) { p4 = (p0).lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI; }
      if ((pxmask != null) || (p7 & 16) != 0) { p5 = (p0).IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII; }
      if ((pxmask != null) || (p7 & 32) != 0) { p6 = (p0).IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI; }
      return p0.a(p1, p2, p3, p4, p5, p6);
   }
}
