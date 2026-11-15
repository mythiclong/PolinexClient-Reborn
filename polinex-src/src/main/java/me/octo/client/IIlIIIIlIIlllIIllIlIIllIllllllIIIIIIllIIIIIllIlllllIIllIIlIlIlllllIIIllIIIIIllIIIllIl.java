package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIlIIIIlIIlllIIllIlIIllIllllllIIIIIIllIIIIIllIlllllIIllIIlIlIlllllIIIllIIIIIllIIIllIl {
   @NotNull
   private final List<IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @Nullable
   private String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String[] a;
   private static String[] b;

   public IIlIIIIlIIlllIIllIlIIllIllllllIIIIIIllIIIIIllIlllllIIllIIlIlIlllllIIIllIIIIIllIIIllIl() {
      IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI[] var1 = new IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI[7];
      short var10005 = 21890;
      short var10006 = 25144;
      var1[0] = new IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI(
         "Combat", 20, 0, 0, null, null, null, Items.STONE_SWORD, 124, null
      );
      var10005 = 21895;
      var10006 = 5652;
      var1[1] = new IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI(
         "Farming", 21, 0, 0, null, null, null, Items.GOLDEN_HOE, 124, null
      );
      var10005 = 21899;
      var10006 = -20389;
      var1[2] = new IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI(
         "Mining", 22, 0, 0, null, null, null, Items.STONE_PICKAXE, 124, null
      );
      var10005 = 21892;
      var10006 = 6740;
      var1[3] = new IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI(
         "Fishing", 23, 0, 0, null, null, null, Items.FISHING_ROD, 124, null
      );
      var10005 = 21889;
      var10006 = -1596;
      var1[4] = new IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI(
         "Foraging", 24, 0, 0, null, null, null, Items.JUNGLE_SAPLING, 124, null
      );
      var10005 = 21891;
      var10006 = -5873;
      var1[5] = new IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI(
         "Dungeoneering", 30, 0, 0, null, null, null, Items.PLAYER_HEAD, 124, null
      );
      var10005 = 21893;
      var10006 = -32761;
      var1[6] = new IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI(
         "Hunting", 31, 0, 0, null, null, null, Items.LEAD, 124, null
      );
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = CollectionsKt.listOf(var1);
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = -1;
   }

   @NotNull
   public final List<IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI> a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   public final int b() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final void a(int var1) {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
   }

   @Nullable
   public final String c() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final void a(@Nullable String var1) {
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
   }

   public final void d() {
      String var10000 = lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll.g();
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII++;
      String var1 = var10000;
      IIlIIIIlIIlllIIllIlIIllIllllllIIIIIIllIIIIIllIlllllIIllIIlIlIlllllIIIllIIIIIllIIIllIl var2 = this;
      if (var1 != null) {
         if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            >= this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.size()) {
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = -1;
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = null;
            if (var1 != null) {
               return;
            }
         }

         var2 = this;
      }

      var2.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .get(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII)
         .a();
   }

   @Nullable
   public final IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI e() {
      String var1 = lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll.g();
      IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI var10000;
      if (var1 != null && this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl != null) {
         String var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         boolean var3 = false;
         var10000 = this.b(var2);
      } else {
         var10000 = null;
      }

      return var10000;
   }

   public final boolean f() {
      String var1 = lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll.g();
      int var10000 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      if (var1 != null) {
         var10000 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               == this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.size() - 1
            ? 1
            : 0;
      }

      return (var10000 != 0);
   }

   @Nullable
   public final IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI b(@NotNull String var1) {
      String var10000 = lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll.g();
      short var10002 = 21894;
      short var10003 = -21369;
      Intrinsics.checkNotNullParameter(var1, "name");
      Iterable var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      String var2 = var10000;

      label20:
      for (Object var5 : var3) {
         var10000 = (String)var5;

         do {
            IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI var6 = (IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI)(Object)var10000;
            boolean var7 = false;
            if (!Intrinsics.areEqual(var6.a(), var1)) {
               continue label20;
            }

            var10000 = (String)var5;
         } while (var2 == null);

         return (IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI)var5;
      }

      return (IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI)null;
   }

   @Nullable
   public final IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI a(@NotNull Item var1) {
      String var10000 = lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll.g();
      short var10002 = 21898;
      short var10003 = -28162;
      Intrinsics.checkNotNullParameter(var1, "item");
      String var2 = var10000;

      label20:
      for (Object var5 : this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
         var10000 = (String)var5;

         do {
            IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI var6 = (IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI)(Object)var10000;
            boolean var7 = false;
            if (!Intrinsics.areEqual(var6.h(), var1)) {
               continue label20;
            }

            var10000 = (String)var5;
         } while (var2 == null);

         return (IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI)var5;
      }

      return (IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI)null;
   }

   @Nullable
   public final IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI b(int var1) {
      Iterable var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      String var10000 = lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll.g();
      Iterator var4 = var3.iterator();
      String var2 = var10000;

      label28:
      while (var4.hasNext()) {
         Object var5 = var4.next();
         var10000 = (String)var5;

         do {
            IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI var6 = (IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI)(Object)var10000;
            boolean var7 = false;
            int var9 = var6.b();
            if (var2 != null) {
               var9 = var9 == var1 ? 1 : 0;
            }

            if (var9 == 0) {
               continue label28;
            }

            var10000 = (String)var5;
         } while (var2 == null);

         return (IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI)var5;
      }

      return (IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI)null;
   }

   @Nullable
   public final Item c(@NotNull String var1) {
      String var10000 = lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll.g();
      short var10002 = 21888;
      short var10003 = -17787;
      Intrinsics.checkNotNullParameter(var1, "name");
      String var2 = var10000;
      if (var2 != null) {
         IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI var3 = this.b(var1);
         if (var3 != null) {
            return var3.h();
         }
      }

      return null;
   }

   @Nullable
   public final Integer d(@NotNull String var1) {
      String var10000 = lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll.g();
      short var10002 = 21888;
      short var10003 = -17787;
      Intrinsics.checkNotNullParameter(var1, "name");
      String var2 = var10000;
      if (var2 != null) {
         IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI var3 = this.b(var1);
         if (var3 != null) {
            return var3.b();
         }
      }

      return null;
   }

   @NotNull
   public final List<Integer> g() {
      Iterable var2 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var3 = false;
      String var1 = lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll.g();
      Collection var5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var2, 10));
      boolean var6 = false;
      Iterator var7 = var2.iterator();

      Collection var10000;
      while (true) {
         if (var7.hasNext()) {
            Object var8 = var7.next();
            var10000 = var5;
            IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI var9 = (IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI)var8;
            if (var1 == null) {
               break;
            }

            boolean var10 = false;
            var5.add(var9.b());
            if (var1 != null) {
               continue;
            }
         }

         var10000 = var5;
         break;
      }

      return (List<Integer>)var10000;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[10];
      int var3 = 0;
      String var2 = "f~[¢1z\r¾ÿ¤Î©IÁNÍ£\u0094ÝÅ\u0004\u009eVÌo\bª¬xû¯/CF\u0004Eo·H\u0007\u001eÝî\u0016s\u0018\u001e\u0007\u0096éþ\u009cPìz\u0007µ\u001dH\u00818Ðw";
      int var4 = "f~[¢1z\r¾ÿ¤Î©IÁNÍ£\u0094ÝÅ\u0004\u009eVÌo\bª¬xû¯/CF\u0004Eo·H\u0007\u001eÝî\u0016s\u0018\u001e\u0007\u0096éþ\u009cPìz\u0007µ\u001dH\u00818Ðw"
         .length();
      char var1 = 6;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 96;
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
                     case 0 -> 70;
                     case 1 -> 92;
                     case 2 -> 117;
                     case 3 -> 106;
                     case 4 -> 57;
                     case 5 -> 85;
                     default -> 24;
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
                     b = new String[10];
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

                  var2 = "ýWÇx\u0006ª9\u0086\u000fn>";
                  var4 = "ýWÇx\u0006ª9\u0086\u000fn>".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 77;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 21890) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 151;
            case 1 -> 216;
            case 2 -> 217;
            case 3 -> 212;
            case 4 -> 254;
            case 5 -> 58;
            case 6 -> 71;
            case 7 -> 214;
            case 8 -> 55;
            case 9 -> 65;
            case 10 -> 168;
            case 11 -> 172;
            case 12 -> 224;
            case 13 -> 136;
            case 14 -> 80;
            case 15 -> 24;
            case 16 -> 191;
            case 17 -> 176;
            case 18 -> 63;
            case 19 -> 100;
            case 20 -> 195;
            case 21 -> 87;
            case 22 -> 231;
            case 23 -> 32;
            case 24 -> 180;
            case 25 -> 102;
            case 26 -> 138;
            case 27 -> 74;
            case 28 -> 179;
            case 29 -> 156;
            case 30 -> 189;
            case 31 -> 148;
            case 32 -> 253;
            case 33 -> 38;
            case 34 -> 228;
            case 35 -> 84;
            case 36 -> 105;
            case 37 -> 208;
            case 38 -> 9;
            case 39 -> 34;
            case 40 -> 170;
            case 41 -> 234;
            case 42 -> 15;
            case 43 -> 203;
            case 44 -> 158;
            case 45 -> 72;
            case 46 -> 40;
            case 47 -> 59;
            case 48 -> 149;
            case 49 -> 163;
            case 50 -> 92;
            case 51 -> 184;
            case 52 -> 255;
            case 53 -> 115;
            case 54 -> 206;
            case 55 -> 68;
            case 56 -> 150;
            case 57 -> 137;
            case 58 -> 251;
            case 59 -> 133;
            case 60 -> 78;
            case 61 -> 154;
            case 62 -> 215;
            case 63 -> 62;
            case 64 -> 53;
            case 65 -> 6;
            case 66 -> 56;
            case 67 -> 4;
            case 68 -> 182;
            case 69 -> 7;
            case 70 -> 108;
            case 71 -> 237;
            case 72 -> 155;
            case 73 -> 36;
            case 74 -> 223;
            case 75 -> 230;
            case 76 -> 46;
            case 77 -> 110;
            case 78 -> 196;
            case 79 -> 91;
            case 80 -> 198;
            case 81 -> 247;
            case 82 -> 169;
            case 83 -> 64;
            case 84 -> 3;
            case 85 -> 219;
            case 86 -> 35;
            case 87 -> 186;
            case 88 -> 88;
            case 89 -> 204;
            case 90 -> 207;
            case 91 -> 167;
            case 92 -> 232;
            case 93 -> 79;
            case 94 -> 104;
            case 95 -> 126;
            case 96 -> 226;
            case 97 -> 152;
            case 98 -> 18;
            case 99 -> 122;
            case 100 -> 144;
            case 101 -> 153;
            case 102 -> 116;
            case 103 -> 243;
            case 104 -> 225;
            case 105 -> 190;
            case 106 -> 0;
            case 107 -> 37;
            case 108 -> 52;
            case 109 -> 17;
            case 110 -> 89;
            case 111 -> 188;
            case 112 -> 85;
            case 113 -> 82;
            case 114 -> 54;
            case 115 -> 248;
            case 116 -> 200;
            case 117 -> 213;
            case 118 -> 194;
            case 119 -> 57;
            case 120 -> 178;
            case 121 -> 187;
            case 122 -> 16;
            case 123 -> 121;
            case 124 -> 11;
            case 125 -> 162;
            case 126 -> 124;
            case 127 -> 132;
            case 128 -> 209;
            case 129 -> 139;
            case 130 -> 127;
            case 131 -> 99;
            case 132 -> 90;
            case 133 -> 244;
            case 134 -> 109;
            case 135 -> 134;
            case 136 -> 205;
            case 137 -> 181;
            case 138 -> 193;
            case 139 -> 73;
            case 140 -> 250;
            case 141 -> 19;
            case 142 -> 97;
            case 143 -> 14;
            case 144 -> 2;
            case 145 -> 123;
            case 146 -> 67;
            case 147 -> 44;
            case 148 -> 70;
            case 149 -> 39;
            case 150 -> 241;
            case 151 -> 96;
            case 152 -> 51;
            case 153 -> 202;
            case 154 -> 183;
            case 155 -> 50;
            case 156 -> 192;
            case 157 -> 130;
            case 158 -> 201;
            case 159 -> 227;
            case 160 -> 42;
            case 161 -> 111;
            case 162 -> 86;
            case 163 -> 171;
            case 164 -> 233;
            case 165 -> 220;
            case 166 -> 173;
            case 167 -> 146;
            case 168 -> 28;
            case 169 -> 160;
            case 170 -> 246;
            case 171 -> 125;
            case 172 -> 235;
            case 173 -> 47;
            case 174 -> 75;
            case 175 -> 245;
            case 176 -> 94;
            case 177 -> 45;
            case 178 -> 177;
            case 179 -> 48;
            case 180 -> 20;
            case 181 -> 30;
            case 182 -> 41;
            case 183 -> 43;
            case 184 -> 175;
            case 185 -> 118;
            case 186 -> 106;
            case 187 -> 141;
            case 188 -> 25;
            case 189 -> 166;
            case 190 -> 238;
            case 191 -> 10;
            case 192 -> 242;
            case 193 -> 221;
            case 194 -> 164;
            case 195 -> 77;
            case 196 -> 135;
            case 197 -> 185;
            case 198 -> 143;
            case 199 -> 29;
            case 200 -> 107;
            case 201 -> 81;
            case 202 -> 199;
            case 203 -> 5;
            case 204 -> 142;
            case 205 -> 23;
            case 206 -> 27;
            case 207 -> 101;
            case 208 -> 114;
            case 209 -> 131;
            case 210 -> 69;
            case 211 -> 66;
            case 212 -> 197;
            case 213 -> 13;
            case 214 -> 22;
            case 215 -> 211;
            case 216 -> 240;
            case 217 -> 129;
            case 218 -> 140;
            case 219 -> 157;
            case 220 -> 26;
            case 221 -> 119;
            case 222 -> 112;
            case 223 -> 222;
            case 224 -> 61;
            case 225 -> 117;
            case 226 -> 49;
            case 227 -> 145;
            case 228 -> 236;
            case 229 -> 83;
            case 230 -> 161;
            case 231 -> 60;
            case 232 -> 33;
            case 233 -> 210;
            case 234 -> 21;
            case 235 -> 159;
            case 236 -> 120;
            case 237 -> 147;
            case 238 -> 128;
            case 239 -> 249;
            case 240 -> 252;
            case 241 -> 239;
            case 242 -> 113;
            case 243 -> 8;
            case 244 -> 103;
            case 245 -> 165;
            case 246 -> 95;
            case 247 -> 31;
            case 248 -> 1;
            case 249 -> 229;
            case 250 -> 76;
            case 251 -> 93;
            case 252 -> 98;
            case 253 -> 218;
            case 254 -> 174;
            default -> 12;
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
