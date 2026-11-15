package me.octo.client.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl {
   @NotNull
   private final List<IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static String[] a;
   private static String[] b;

   public lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl(
      @NotNull List<IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll> var1
   ) {
      short var10001 = -29063;
      short var10002 = 22343;
      Intrinsics.checkNotNullParameter(var1, "tiles");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
   }

   @NotNull
   public final List<IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll> a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   public final int b() {
      int[] var1 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      Iterator var2 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.iterator();
      int var3 = ((IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll)var2.next()).a();
      while (var2.hasNext()) {
         int var5 = ((IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll)var2.next()).a();
         if (var5 > var3) {
            var3 = var5;
         }
      }
      Iterator var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.iterator();
      int var6 = ((IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll)var4.next()).a();
      while (var4.hasNext()) {
         int var7 = ((IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll)var4.next()).a();
         if (var7 < var6) {
            var6 = var7;
         }
      }
      return var3 - var6;
   }

   public final int c() {
      int[] var1 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      Iterator var2 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.iterator();
      int var3 = ((IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll)var2.next()).b();
      while (var2.hasNext()) {
         int var5 = ((IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll)var2.next()).b();
         if (var5 > var3) {
            var3 = var5;
         }
      }
      Iterator var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.iterator();
      int var6 = ((IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll)var4.next()).b();
      while (var4.hasNext()) {
         int var7 = ((IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll)var4.next()).b();
         if (var7 < var6) {
            var6 = var7;
         }
      }
      return var3 - var6;
   }

   @NotNull
   public final lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl a(int var1, int var2) {
      Collection var15 = null; // PX-FIX
      int[] var10000 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      Iterable var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var5 = false;
      Collection var7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var4, 10));
      boolean var8 = false;
      int[] var3 = var10000;
      Iterator var9 = var4.iterator();

      while (true) {
         if (var9.hasNext()) {
            Object var10 = var9.next();
            var15 = var7;
            IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var11 = (IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll)var10;
            if (var3 == null) {
               break;
            }

            boolean var12 = false;
            var7.add(new IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll(var11.a() + var1, var11.b() + var2));
            if (var3 != null) {
               continue;
            }
         }

         var15 = var7;
         break;
      }

      List var14 = (List)var15;
      return new lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl(var14);
   }

   // $VF: Could not properly define all variable types!
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @NotNull
   public final lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl a(int var1) {
      int var3 = this.b();
      int var4 = this.c();
      Object /* PX-FIX */ var10000;
      Object /* PX-FIX */ var2 = null /* PX-FIX */;

      IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      return switch (var1) {
         case 90 -> {
            Iterable var19 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            boolean var21 = false;
            Collection var23 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var19, 10));
            boolean var25 = false;

            Collection var37;
            label55: {
               for (Object var29 : var19) {
                  var37 = var23;
                  IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var31 = (IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll)var29;
                  if (var2 == null) {
                     break label55;
                  }

                  boolean var33 = false;
                  var23.add(new IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll(var31.b(), var3 - var31.a()));
                  if (var2 == null) {
                     break;
                  }
               }

               var37 = var23;
            }

            List var15 = (List)var37;
            yield new lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl(var15);
         }
         case 180 -> {
            Iterable var18 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            boolean var20 = false;
            Collection var22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var18, 10));
            boolean var24 = false;

            Collection var36;
            label44: {
               for (Object var28 : var18) {
                  var36 = var22;
                  IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var30 = (IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll)var28;
                  if (var2 == null) {
                     break label44;
                  }

                  boolean var32 = false;
                  var22.add(new IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll(var3 - var30.a(), var4 - var30.b()));
                  if (var2 == null) {
                     break;
                  }
               }

               var36 = var22;
            }

            List var16 = (List)var36;
            yield new lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl(var16);
         }
         case 270 -> {
            Iterable var5 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            boolean var6 = false;
            Collection var8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var5, 10));
            boolean var9 = false;

            Collection var35;
            label33: {
               for (Object var11 : var5) {
                  var35 = var8;
                  IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var12 = (IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll)var11;
                  if (var2 == null) {
                     break label33;
                  }

                  boolean var13 = false;
                  var8.add(new IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll(var4 - var12.b(), var12.a()));
                  if (var2 == null) {
                     break;
                  }
               }

               var35 = var8;
            }

            List var17 = (List)var35;
            yield new lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl(var17);
         }
         default -> this;
      };
   }

   @NotNull
   public final lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl d() {
      Collection var14 = null; // PX-FIX
      int var2 = this.c();
      int[] var10000 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      Iterable var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var4 = false;
      int[] var1 = var10000;
      Collection var6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var3, 10));
      boolean var7 = false;
      Iterator var8 = var3.iterator();

      while (true) {
         if (var8.hasNext()) {
            Object var9 = var8.next();
            var14 = var6;
            IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var10 = (IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll)var9;
            if (var1 == null) {
               break;
            }

            boolean var11 = false;
            var6.add(new IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll(var10.a(), var2 - var10.b()));
            if (var1 != null) {
               continue;
            }
         }

         var14 = var6;
         break;
      }

      List var13 = (List)var14;
      return new lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl(var13);
   }

   @NotNull
   public final List<IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll> e() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public final lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl a(
      @NotNull List<IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll> var1
   ) {
      short var10001 = -29062;
      short var10002 = -27105;
      Intrinsics.checkNotNullParameter(var1, "tiles");
      return new lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl(var1);
   }

   @NotNull
   @Override
   public String toString() {
      short var10001 = -29064;
      short var10002 = 16228;
      return "FossilShape(tiles=" + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl + ")";
   }

   @Override
   public int hashCode() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
   }

   @Override
   public boolean equals(@Nullable Object param1) {
        boolean bl;
        block16: {
            block17: {
                Object object2;
                int[] nArray;
                block14: {
                    block15: {
                        block12: {
                            block13: {
                                nArray = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
                                try {
                                    try {
                                        object2 = this;
                                        if (nArray == null) break block12;
                                        if (object2 != param1) break block13;
                                    }
                                    catch (NoSuchElementException noSuchElementException) {
                                        throw lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl.a(noSuchElementException);
                                    }
                                    return true;
                                }
                                catch (NoSuchElementException noSuchElementException) {
                                    throw lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl.a(noSuchElementException);
                                }
                            }
                            object2 = param1;
                        }
                        try {
                            try {
                                if (nArray == null) break block14;
                                if (object2 instanceof lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl) break block15;
                            }
                            catch (NoSuchElementException noSuchElementException) {
                                throw lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl.a(noSuchElementException);
                            }
                            return false;
                        }
                        catch (NoSuchElementException noSuchElementException) {
                            throw lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl.a(noSuchElementException);
                        }
                    }
                    object2 = param1;
                }
                lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl2 = (lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl)object2;
                try {
                    try {
                        bl = Intrinsics.areEqual(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl2.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
                        if (nArray == null) break block16;
                        if (bl) break block17;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        throw lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl.a(noSuchElementException);
                    }
                    return false;
                }
                catch (NoSuchElementException noSuchElementException) {
                    throw lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl.a(noSuchElementException);
                }
            }
            bl = true;
        }
        return bl;
   }

   private static NoSuchElementException a(NoSuchElementException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "\u0089 \u0004\u0003½¬^\u0015©\u007fûð\u007f¤p\u008fTã\u0005ò¤\u0000SÛ\u0005d«Ò²\u0081";
      int var4 = "\u0089 \u0004\u0003½¬^\u0015©\u007fûð\u007f¤p\u008fTã\u0005ò¤\u0000SÛ\u0005d«Ò²\u0081".length();
      char var1 = 18;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 117;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 117;
               var10006 = var6;
            } else {
               var13 = 117;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 117;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 122;
                  case 1 -> 33;
                  case 2 -> 92;
                  case 3 -> 25;
                  case 4 -> 25;
                  case 5 -> 69;
                  default -> 6;
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
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
   }
}

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ -29064) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 151;
            case 1 -> 175;
            case 2 -> 124;
            case 3 -> 192;
            case 4 -> 65;
            case 5 -> 179;
            case 6 -> 234;
            case 7 -> 129;
            case 8 -> 176;
            case 9 -> 24;
            case 10 -> 96;
            case 11 -> 152;
            case 12 -> 44;
            case 13 -> 10;
            case 14 -> 130;
            case 15 -> 87;
            case 16 -> 106;
            case 17 -> 100;
            case 18 -> 18;
            case 19 -> 156;
            case 20 -> 108;
            case 21 -> 126;
            case 22 -> 187;
            case 23 -> 92;
            case 24 -> 112;
            case 25 -> 89;
            case 26 -> 177;
            case 27 -> 217;
            case 28 -> 59;
            case 29 -> 39;
            case 30 -> 13;
            case 31 -> 135;
            case 32 -> 14;
            case 33 -> 247;
            case 34 -> 95;
            case 35 -> 244;
            case 36 -> 150;
            case 37 -> 132;
            case 38 -> 148;
            case 39 -> 167;
            case 40 -> 172;
            case 41 -> 224;
            case 42 -> 6;
            case 43 -> 178;
            case 44 -> 75;
            case 45 -> 199;
            case 46 -> 64;
            case 47 -> 4;
            case 48 -> 223;
            case 49 -> 116;
            case 50 -> 102;
            case 51 -> 245;
            case 52 -> 160;
            case 53 -> 31;
            case 54 -> 153;
            case 55 -> 80;
            case 56 -> 141;
            case 57 -> 83;
            case 58 -> 107;
            case 59 -> 165;
            case 60 -> 254;
            case 61 -> 168;
            case 62 -> 34;
            case 63 -> 184;
            case 64 -> 222;
            case 65 -> 109;
            case 66 -> 232;
            case 67 -> 133;
            case 68 -> 27;
            case 69 -> 88;
            case 70 -> 147;
            case 71 -> 181;
            case 72 -> 94;
            case 73 -> 237;
            case 74 -> 22;
            case 75 -> 81;
            case 76 -> 139;
            case 77 -> 212;
            case 78 -> 191;
            case 79 -> 35;
            case 80 -> 16;
            case 81 -> 226;
            case 82 -> 29;
            case 83 -> 86;
            case 84 -> 47;
            case 85 -> 114;
            case 86 -> 143;
            case 87 -> 82;
            case 88 -> 93;
            case 89 -> 7;
            case 90 -> 240;
            case 91 -> 208;
            case 92 -> 20;
            case 93 -> 142;
            case 94 -> 37;
            case 95 -> 174;
            case 96 -> 113;
            case 97 -> 144;
            case 98 -> 54;
            case 99 -> 122;
            case 100 -> 231;
            case 101 -> 42;
            case 102 -> 85;
            case 103 -> 121;
            case 104 -> 189;
            case 105 -> 66;
            case 106 -> 51;
            case 107 -> 0;
            case 108 -> 236;
            case 109 -> 105;
            case 110 -> 26;
            case 111 -> 239;
            case 112 -> 218;
            case 113 -> 233;
            case 114 -> 207;
            case 115 -> 78;
            case 116 -> 72;
            case 117 -> 50;
            case 118 -> 21;
            case 119 -> 131;
            case 120 -> 248;
            case 121 -> 104;
            case 122 -> 251;
            case 123 -> 206;
            case 124 -> 162;
            case 125 -> 145;
            case 126 -> 158;
            case 127 -> 159;
            case 128 -> 180;
            case 129 -> 188;
            case 130 -> 249;
            case 131 -> 36;
            case 132 -> 56;
            case 133 -> 120;
            case 134 -> 164;
            case 135 -> 123;
            case 136 -> 186;
            case 137 -> 45;
            case 138 -> 62;
            case 139 -> 98;
            case 140 -> 227;
            case 141 -> 211;
            case 142 -> 57;
            case 143 -> 11;
            case 144 -> 49;
            case 145 -> 99;
            case 146 -> 149;
            case 147 -> 73;
            case 148 -> 204;
            case 149 -> 101;
            case 150 -> 161;
            case 151 -> 229;
            case 152 -> 215;
            case 153 -> 198;
            case 154 -> 221;
            case 155 -> 97;
            case 156 -> 67;
            case 157 -> 246;
            case 158 -> 173;
            case 159 -> 163;
            case 160 -> 170;
            case 161 -> 169;
            case 162 -> 213;
            case 163 -> 193;
            case 164 -> 166;
            case 165 -> 216;
            case 166 -> 32;
            case 167 -> 140;
            case 168 -> 250;
            case 169 -> 128;
            case 170 -> 77;
            case 171 -> 43;
            case 172 -> 138;
            case 173 -> 137;
            case 174 -> 61;
            case 175 -> 171;
            case 176 -> 118;
            case 177 -> 154;
            case 178 -> 146;
            case 179 -> 23;
            case 180 -> 68;
            case 181 -> 201;
            case 182 -> 209;
            case 183 -> 119;
            case 184 -> 196;
            case 185 -> 200;
            case 186 -> 1;
            case 187 -> 76;
            case 188 -> 185;
            case 189 -> 194;
            case 190 -> 136;
            case 191 -> 110;
            case 192 -> 134;
            case 193 -> 79;
            case 194 -> 71;
            case 195 -> 74;
            case 196 -> 46;
            case 197 -> 48;
            case 198 -> 40;
            case 199 -> 253;
            case 200 -> 41;
            case 201 -> 155;
            case 202 -> 182;
            case 203 -> 210;
            case 204 -> 255;
            case 205 -> 235;
            case 206 -> 60;
            case 207 -> 8;
            case 208 -> 225;
            case 209 -> 19;
            case 210 -> 202;
            case 211 -> 115;
            case 212 -> 70;
            case 213 -> 55;
            case 214 -> 242;
            case 215 -> 15;
            case 216 -> 9;
            case 217 -> 53;
            case 218 -> 117;
            case 219 -> 17;
            case 220 -> 28;
            case 221 -> 84;
            case 222 -> 91;
            case 223 -> 230;
            case 224 -> 63;
            case 225 -> 238;
            case 226 -> 58;
            case 227 -> 25;
            case 228 -> 52;
            case 229 -> 90;
            case 230 -> 183;
            case 231 -> 157;
            case 232 -> 220;
            case 233 -> 69;
            case 234 -> 252;
            case 235 -> 197;
            case 236 -> 195;
            case 237 -> 5;
            case 238 -> 38;
            case 239 -> 214;
            case 240 -> 103;
            case 241 -> 127;
            case 242 -> 203;
            case 243 -> 111;
            case 244 -> 241;
            case 245 -> 228;
            case 246 -> 33;
            case 247 -> 125;
            case 248 -> 12;
            case 249 -> 2;
            case 250 -> 3;
            case 251 -> 243;
            case 252 -> 219;
            case 253 -> 190;
            case 254 -> 30;
            default -> 205;
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
  public static me.octo.client.utils.lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl a(me.octo.client.utils.lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl p0, java.util.List p1, int p2, java.lang.Object p3) {
      if ((p2 & 1) != 0) { p1 = (p0).IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
      return p0.a(p1);
   }
}
