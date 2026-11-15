package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.events.impl.lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
import net.minecraft.core.BlockPos;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.comparisons.ComparisonsKt;
import java.nio.file.Files;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import java.util.Locale;
import net.minecraft.client.Minecraft;
import kotlin.io.path.PathsKt;
import kotlin.ranges.RangesKt;
import me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
import me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
import me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
import me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
import me.octo.client.utils.llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI;

public final class llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII {
   @NotNull
   public static llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @Nullable
   private static llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.PXEvMid IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static String[] a;
   private static String[] b;

   @Nullable
   public final llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII c() {
      int var1 = k();
      if (var1 != 0 || this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == null) {
         return null;
      }
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.b();
   }

   @Nullable
   public final String d() {
      int var1 = j();
      if (var1 == 0 || this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == null) {
         return null;
      }
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.c();
   }

   @NotNull
   public final List<IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI> e() {
      int var1 = j();
      if (var1 == 0 || this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == null) {
         return CollectionsKt.emptyList();
      }
      List<IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI> var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.b().e();
      return var2 != null ? var2 : CollectionsKt.emptyList();
   }

   public final void f() {
      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a(this);
   }

   @NotNull
   public final List<IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI> g() {
      ArrayList<IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI> var1 = new ArrayList<>();
      for (IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var9 : lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
         if (IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var9) != null && IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var9) != null) {
            var1.add(var9);
         }
      }
      return var1;
   }

   @Nullable
   public final Object a(@NotNull IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI macro) {
      Intrinsics.checkNotNullParameter(macro, "macro");
      for (IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll var6 : macro.ax()) {
         if (var6 instanceof IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII) {
            return var6;
         }
         if (var6 instanceof IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl) {
            return var6;
         }
      }
      return null;
   }

   private llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII() {
   }

   public final boolean a() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @Nullable
   public final IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI b() {
      int var1 = k();
      if (var1 != 0 || this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == null) {
         return null;
      }
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.a();
   }

   @Nullable
   public final llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII b(
      @NotNull IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI param1
   ) {
      int var2 = k();
      if (var2 != 0) {
         return null;
      }
      Object var3 = this.a(param1);
      if (var3 == null) {
         return null;
      }
      for (llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var8 : llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII) {
         if (var8.K() == var3 || var8.J() == var3) {
            return var8;
         }
      }
      return null;
   }

   private final boolean a(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII param1) {
      int var2 = k();
      if (var2 != 0) {
         return param1.i().isEmpty();
      }
      return param1.g() == llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII && param1.i().isEmpty() && !param1.h().isEmpty();
   }

   private final List<String> a(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII param1, String param2) {
      int var3 = k();
      java.nio.file.Path var4 = lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(param1.b(), param2);
      if (var3 != 0) {
         return CollectionsKt.emptyList();
      }
      if (!Files.exists(var4)) {
         return CollectionsKt.emptyList();
      }
      List<String> var5;
      try {
         ArrayList<String> var8 = new ArrayList<>();
         for (java.nio.file.Path var12 : PathsKt.listDirectoryEntries(var4, "*.json")) {
            var8.add(PathsKt.getNameWithoutExtension(var12));
         }
         var5 = var8;
      } catch (Exception var6) {
         var5 = CollectionsKt.emptyList();
      }
      return var5;
   }

   public final boolean b(@NotNull llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII param1, @NotNull String param2) {
      int var3 = j();
      Intrinsics.checkNotNullParameter(param1, "editor");
      Intrinsics.checkNotNullParameter(param2, "routeName");
      int var4 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl[param1.g().ordinal()];
      if (var3 == 0) {
         return var4 != 0;
      }
      switch (var4) {
         case 1:
            if (param1.u().containsKey(param2)) {
               return true;
            }
            java.nio.file.Path routeFile = lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(
               param1.b(), param2 + ".json"
            );
            return Files.exists(routeFile);
         case 2:
            return param1.v().containsKey(param2);
         case 3:
            return false;
         default:
            throw new NoWhenBranchMatchedException();
      }
   }

   public final boolean a(@NotNull IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI param1, @NotNull String param2) {
      int var3 = j();
      Intrinsics.checkNotNullParameter(param1, "macro");
      Intrinsics.checkNotNullParameter(param2, "routeName");
      if (var3 == 0) {
         return false;
      }
      Object var4 = this.a(param1);
      if (var4 == null) {
         return false;
      }
      String[] var5;
      if (var4 instanceof IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII) {
         var5 = ((IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII)var4).A();
      } else if (var4 instanceof IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl) {
         var5 = ((IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl)var4).A();
      } else {
         return false;
      }
      int var6 = ArraysKt.indexOf(var5, param2);
      if (var6 < 0) {
         return false;
      }
      if (var4 instanceof IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII) {
         ((IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII)var4).c(var6);
      } else if (var4 instanceof IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl) {
         ((IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl)var4).c(var6);
      }
      return true;
   }

   @Nullable
   public final String c(@NotNull IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI param1) {
      int var2 = j();
      Intrinsics.checkNotNullParameter(param1, "macro");
      if (var2 == 0) {
         return null;
      }
      Object var3 = this.a(param1);
      if (var3 == null) {
         return null;
      }
      if (var3 instanceof IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII) {
         return ((IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII)var3).T();
      }
      return var3 instanceof IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl ? ((IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl)var3).V() : null;
   }

   @NotNull
   public final List<String> d(@NotNull IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI param1) {
      int var2 = k();
      Intrinsics.checkNotNullParameter(param1, "macro");
      llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var3 = this.b(param1);
      if (var2 == 0 && var3 != null && this.a(var3)) {
         List var6 = var3.h();
         ArrayList<String> var7 = new ArrayList<>();
         for (Object var10 : var6) {
            String var11 = (String)var10;
            List var13 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var3, var11);
            ArrayList<String> var16 = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(var13, 10));
            for (Object var19 : var13) {
               String var20 = (String)var19;
               var16.add(var11 + "/" + var20);
            }
            CollectionsKt.addAll(var7, var16);
         }
         return var7;
      }
      Object var4 = var2 != 0 ? (Object)var3 : this.a(param1);
      if (var4 == null) {
         return CollectionsKt.emptyList();
      }
      if (var4 instanceof IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII) {
         return ArraysKt.toList(((IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII)var4).A());
      }
      return var4 instanceof IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl ? ArraysKt.toList(((IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl)var4).A()) : CollectionsKt.emptyList();
   }

   public final int b(@NotNull IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI param1, @NotNull String param2) {
int var2 = k();
Intrinsics.checkNotNullParameter(param1, "macro");
Intrinsics.checkNotNullParameter(param2, "routeName");
if (var2 != 0) { return 0; }
llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var4 = this.b(param1);
int var5;
try {
   if (this.a(var4)) {
      List var6 = StringsKt.split((CharSequence)param2, new char[]{'/'}, false, 2);
      if (var6.size() != 2) { return 0; }
      IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll var7 = new llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI(var4.b()).a((String)var6.get(0), (String)var6.get(1));
      List var8 = var7 == null ? null : var7.a();
      var5 = var8 == null ? 0 : var8.size();
   } else if (var4.g() == llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
      IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll var9 = new llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI(var4.b()).a(param2);
      List var10 = var9 == null ? null : var9.a();
      var5 = var10 == null ? 0 : var10.size();
   } else if (var4.g() == llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
      llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI var11 = new llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI(var4.b());
      int var12 = 0;
      for (Object var13 : var4.i()) {
         IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll var14 = var11.a(param2, (String)var13);
         int var15 = var14 == null ? 0 : (var14.a() == null ? 0 : var14.a().size());
         var12 = var12 + var15;
      }
      var5 = var12;
   } else { var5 = 0; }
} catch (Exception var16) { var5 = 0; }
return var5;
   }

   public final void c(@NotNull IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI param1, @NotNull String param2) {
      int var3 = k();
      Intrinsics.checkNotNullParameter(param1, "macro");
      Intrinsics.checkNotNullParameter(param2, "routeName");

      if (var3 != 0) {
         return;
      }

      llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var4 = this.b(param1);
      if (var4 == null) {
         return;
      }

      PXEvMid var5 = PXEvMid.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(param1, var4, param2);
      if (var5 == null) {
         a(this, "Unsupported route target type for this macro", null, 2, null);
         return;
      }

      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var5;
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clear();
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.addAll(var5.d());
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = true;
      Minecraft.getInstance().setScreen(null);
      this.a("Editing route: " + var5.c() + " (" + lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.size() + " waypoints)", me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
   }

   public final void h() { short var10002 = (short)0; // PX-FIX hoist
        
      try {
         if (!lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
            return;
         }
      } catch (NoWhenBranchMatchedException var3) {
         throw (RuntimeException)a(var3);
      }

      String var10000;
      label32: {
         try {
            if (IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl != null) {
               var10000 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.c();
               break label32;
            }
         } catch (NoWhenBranchMatchedException var4) {
            throw (RuntimeException)a(var4);
         }

         var10000 = null;
      }

      String var1 = var10000;

      try {
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = false;
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = null;
         lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clear();
         if (var1 != null) {
            short var10001 = 8041;
             var10002 = 29897;
            this.a(
               "Exited route edit mode",
               me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            );
         }
      } catch (NoWhenBranchMatchedException var2) {
         throw (RuntimeException)a(var2);
      }
   }

   public final int i() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.size();
   }

   public final void a(@NotNull BlockPos param1, @NotNull IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI param2, int param3) {
      int var4 = j();
      Intrinsics.checkNotNullParameter(param1, "pos");
      Intrinsics.checkNotNullParameter(param2, "type");

      if (var4 == 0) {
         return;
      }

      PXEvMid var5 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      if (var5 == null) {
         return;
      }

      int var6;
      if (var4 == 0) {
         var6 = param3;
      } else if (param3 < 0) {
         var6 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.size();
      } else if (param3 <= lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.size()) {
         var6 = param3;
      } else {
         var6 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.size();
      }

      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.add(var6, new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(param1, param2));
      var5.a(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      this.a("Added " + param2.a() + " at #" + (var6 + 1), me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
   }

   @Nullable
   public final String e(@NotNull IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI param1) {
int var2 = j();
Intrinsics.checkNotNullParameter(param1, "macro");
if (var2 == 0) { return null; }
Object var3 = this.a(param1);
if (var2 == 0) { return null; }
me.octo.client.llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var4 = this.b(param1);
java.util.Set var5 = CollectionsKt.toSet(this.d(param1));
String var6 = "new_route";
int var7 = 1;
String var8 = var6;
while (var5.contains(var8)) { var7 = var7 + 1; var8 = var6 + "_" + var7; }
boolean var9;
if (var3 instanceof me.octo.client.IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII) { var9 = ((me.octo.client.IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII)var3).h(var8); }
else if (var3 instanceof me.octo.client.IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl) { var9 = ((me.octo.client.IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl)var3).a(var8, var4.i()); }
else { throw new NoWhenBranchMatchedException(); }
if (!var9) { this.a("Failed to create new route", me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII); return null; }
if (var3 instanceof me.octo.client.IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII) { ((me.octo.client.IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII)var3).F(); }
if (var3 instanceof me.octo.client.IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl) { ((me.octo.client.IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl)var3).F(); }
return var8;
   }

   public final boolean a(@NotNull BlockPos param1) {
      int var2 = k();
      if (var2 != 0) {
         return false;
      }
      PXEvMid var3 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      if (var3 == null) {
         return false;
      }
      int var4 = -1;
      int var7 = 0;
      for (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var10 : lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
         if (Intrinsics.areEqual(var10.a(), param1)) {
            var4 = var7;
            break;
         }
         var7++;
      }
      if (var4 < 0) {
         return false;
      }
      IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var5 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.remove(var4);
      var3.a(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      this.a("Removed" + var5.b().a() + " #" + (var4 + 1), me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      return true;
   }

   @SubscribeEvent
   public final void a(@NotNull lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl param1) {
      int var2 = k();
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "event");
      if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII && param1.n()) {
         if (net.minecraft.client.Minecraft.getInstance().screen == null) {
            net.minecraft.world.phys.BlockHitResult var4 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.I();
            if (var4 != null) {
               net.minecraft.core.BlockPos var3 = var4.getBlockPos();
               switch (param1.k()) {
                  case 0:
                     param1.a(true);
                     net.minecraft.client.Minecraft.getInstance().setScreen((net.minecraft.client.gui.screens.Screen) new me.octo.client.lllIIIIIIIlIllIlIllIIIlllIllIIlIIIllIlIIIlllIIllllllIIllIlIIIlIIlIIlIIIIllIlIIIllIllI(var3));
                     if (var2 != 0 && this.a(var3)) {
                        param1.a(true);
                     }
                     break;
                  case 1:
                     if (this.a(var3)) {
                        param1.a(true);
                     }
                     break;
               }
            }
         }
      }
   }

   @SubscribeEvent(
      priority = EventPriority.HIGH
   )
   public final void a(@NotNull IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl param1) {
      int var2 = j();
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "event");

      if (!lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
         // Original bytecode reads this slot through a Kotlin safe-call; null means edit mode is inactive.
         if (IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == null) {
            return;
         }

         me.octo.client.llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var3 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.b();

         if (var3 != null) {
            me.octo.client.llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a(var3, param1.k(), new java.util.ArrayList((java.util.Collection) lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI),
                  new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(120, 200, 255),
                  new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(60, 140, 200),
                  0.32f, false, 32, (Object) null);
         }
      }
   }

   @SubscribeEvent
   public final void a(@NotNull IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl param1) {
      int var2 = k();
      Intrinsics.checkNotNullParameter(param1, "event");

      if (!lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
         return;
      }

      GuiGraphicsExtractor var3 = param1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      if (var3 == null) {
         return;
      }

      String var10000 = System.getProperty("os.name");
      Intrinsics.checkNotNullExpressionValue(var10000, "getProperty(...)");
      String var10001 = var10000.toLowerCase(Locale.ROOT);
      Intrinsics.checkNotNullExpressionValue(var10001, "toLowerCase(...)");
      boolean var4 = var10001.contains("mac");

      Minecraft var10002 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      float var5;
      if (var2 == 0) {
         var5 = var4 ? (float)var10002.getWindow().getScreenWidth() : (float)var10002.getWindow().getWidth();
      } else {
         var5 = var4 ? 1.0F : 0.0F;
      }

      float var6;
      if (var2 == 0) {
         var6 = var4 ? (float)var10002.getWindow().getScreenHeight() : (float)var10002.getWindow().getHeight();
      } else {
         var6 = var4 ? 1.0F : 0.0F;
      }

      llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var3, 0, 0, var3.guiWidth(), var3.guiHeight(), new kotlin.jvm.functions.Function0<Unit>() { public Unit invoke() { return c(var5, var6); } });
   }

   // $VF: Couldn't set local class definition as local class statement was null
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private final void a(float param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.k ()I
      // 003: istore 3
      // 004: iload 3
      // 005: ifne 01e
      // 008: getstatic me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 00b: dup
      // 00c: ifnonnull 01f
      // 00f: goto 016
      // 012: invokestatic me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 015: athrow
      // 016: pop
      // 017: goto 01e
      // 01a: invokestatic me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01d: athrow
      // 01e: return
      // 01f: astore 4
      // 021: ldc_w 14.0
      // 024: fstore 5
      // 026: ldc_w 14.0
      // 029: fstore 6
      // 02b: ldc_w 14.0
      // 02e: fstore 7
      // 030: ldc_w 12.0
      // 033: fstore 8
      // 035: aload 4
      // 037: invokevirtual me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Lme/octo/client/IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI;
      // 03a: invokevirtual me/octo/client/IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI.aj ()Ljava/lang/String;
      // 03d: astore 9
      // 03f: aload 4
      // 041: invokevirtual me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()Ljava/lang/String;
      // 044: astore 10
      // 046: aload 4
      // 048: invokevirtual me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII;
      // 04b: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.e ()Ljava/util/List;
      // 04e: checkcast java/lang/Iterable
      // 051: astore 12
      // 053: bipush 0
      // 054: istore 13
      // 056: aload 12
      // 058: astore 14
      // 05a: new java/util/ArrayList
      // 05d: dup
      // 05e: aload 12
      // 060: bipush 10
      // 062: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
      // 065: invokespecial java/util/ArrayList.<init> (I)V
      // 068: checkcast java/util/Collection
      // 06b: astore 15
      // 06d: bipush 0
      // 06e: istore 16
      // 070: aload 14
      // 072: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 077: astore 17
      // 079: aload 17
      // 07b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 080: ifeq 0b0
      // 083: aload 17
      // 085: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 08a: astore 18
      // 08c: aload 15
      // 08e: aload 18
      // 090: checkcast me/octo/client/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI
      // 093: astore 19
      // 095: iload 3
      // 096: ifne 0b2
      // 099: astore 51
      // 09b: bipush 0
      // 09c: istore 20
      // 09e: aload 19
      // 0a0: invokevirtual me/octo/client/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.a ()Ljava/lang/String;
      // 0a3: aload 51
      // 0a5: swap
      // 0a6: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 0ab: pop
      // 0ac: iload 3
      // 0ad: ifeq 079
      // 0b0: aload 15
      // 0b2: checkcast java/util/List
      // 0b5: nop
      // 0b6: astore 11
      // 0b8: getstatic me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0bb: instanceof me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
      // 0be: istore 12
      // 0c0: invokestatic kotlin/collections/CollectionsKt.createListBuilder ()Ljava/util/List;
      // 0c3: astore 14
      // 0c5: aload 14
      // 0c7: astore 15
      // 0c9: bipush 0
      // 0ca: istore 16
      // 0cc: aload 15
      // 0ce: new me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII$drawInfoHud$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 0d1: dup
      // 0d2: sipush 8062
      // 0d5: sipush -2685
      // 0d8: pop2
      // 0d9: ldc_w "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"1.7\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\n            <path d=\"M11.5 3.2 C 8.3 3.7 6 6.3 6 9.5 V 11 L 11.5 11 Z\" fill=\"currentColor\" stroke=\"none\"/>\n            <rect x=\"6\" y=\"3\" width=\"12\" height=\"18\" rx=\"6\"/>\n            <line x1=\"6\" y1=\"11\" x2=\"18\" y2=\"11\"/>\n            <line x1=\"12\" y1=\"3\" x2=\"12\" y2=\"11\"/>\n        </svg>\n    "
      // 0dc: sipush 8058
      // 0df: sipush -32003
      // 0e2: pop2
      // 0e3: ldc_w "Add waypoint"
      // 0e6: invokespecial me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII$drawInfoHud$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 0e9: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0ee: pop
      // 0ef: aload 15
      // 0f1: new me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII$drawInfoHud$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 0f4: dup
      // 0f5: sipush 8043
      // 0f8: sipush 3398
      // 0fb: pop2
      // 0fc: ldc_w "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"1.7\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\n            <path d=\"M12.5 3.2 C 15.7 3.7 18 6.3 18 9.5 V 11 L 12.5 11 Z\" fill=\"currentColor\" stroke=\"none\"/>\n            <rect x=\"6\" y=\"3\" width=\"12\" height=\"18\" rx=\"6\"/>\n            <line x1=\"6\" y1=\"11\" x2=\"18\" y2=\"11\"/>\n            <line x1=\"12\" y1=\"3\" x2=\"12\" y2=\"11\"/>\n        </svg>\n    "
      // 0ff: sipush 8002
      // 102: sipush -22368
      // 105: pop2
      // 106: ldc_w "Remove waypoint"
      // 109: invokespecial me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII$drawInfoHud$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 10c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 111: pop
      // 112: iload 12
      // 114: iload 3
      // 115: ifne 16e
      // 118: ifeq 14c
      // 11b: goto 122
      // 11e: invokestatic me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 121: athrow
      // 122: aload 15
      // 124: new me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII$drawInfoHud$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 127: dup
      // 128: sipush 8013
      // 12b: sipush -25692
      // 12e: pop2
      // 12f: ldc_w "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\n            <polyline points=\"5,10 3,12 5,14\"/>\n            <polyline points=\"19,14 21,12 19,10\"/>\n            <line x1=\"12\" y1=\"6\" x2=\"12\" y2=\"18\"/>\n            <line x1=\"8\" y1=\"12\" x2=\"3\" y2=\"12\"/>\n            <line x1=\"16\" y1=\"12\" x2=\"21\" y2=\"12\"/>\n        </svg>\n    "
      // 132: sipush 8044
      // 135: sipush 25448
      // 138: pop2
      // 139: ldc_w "Cycle route type"
      // 13c: invokespecial me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII$drawInfoHud$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 13f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 144: pop
      // 145: goto 14c
      // 148: invokestatic me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14b: athrow
      // 14c: aload 15
      // 14e: new me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII$drawInfoHud$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 151: dup
      // 152: sipush 8051
      // 155: sipush -12900
      // 158: pop2
      // 159: ldc_w "\n    <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"1.9\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\n        <path d=\"M12 15L15 12L12 9\"/>\n        <line x1=\"15\" y1=\"12\" x2=\"4\" y2=\"12\"/>\n        <path d=\"M4 7.2 C 4 5.5 4.4 4.7 5.1 4.2 C 5.5 4 6.1 4 7.2 4 H 16.8 C 17.9 4 18.5 4 18.9 4.2 C 19.6 4.7 20 5.5 20 7.2 V 16.8 C 20 18.5 19.6 19.3 18.9 19.8 C 18.5 20 17.9 20 16.8 20 H 7.2 C 6.1 20 5.5 20 5.1 19.8 C 4.4 19.3 4 18.5 4 16.8\"/>\n    </svg>\n"
      // 15c: sipush 8034
      // 15f: sipush 27406
      // 162: pop2
      // 163: ldc_w "/routeedit exit"
      // 166: invokespecial me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII$drawInfoHud$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 169: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 16e: pop
      // 16f: nop
      // 170: aload 14
      // 172: invokestatic kotlin/collections/CollectionsKt.build (Ljava/util/List;)Ljava/util/List;
      // 175: astore 13
      // 177: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 17a: sipush 8037
      // 17d: sipush -29287
      // 180: pop2
      // 181: ldc_w "ROUTE EDIT MODE"
      // 184: bipush 0
      // 185: bipush 2
      // 186: aconst_null
      // 187: invokestatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a (Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;Ljava/lang/String;ZILjava/lang/Object;)D
      // 18a: d2f
      // 18b: fstore 14
      // 18d: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 190: aload 9
      // 192: bipush 0
      // 193: bipush 2
      // 194: aconst_null
      // 195: invokestatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a (Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;Ljava/lang/String;ZILjava/lang/Object;)D
      // 198: d2f
      // 199: fstore 15
      // 19b: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 19e: aload 10
      // 1a0: bipush 0
      // 1a1: bipush 2
      // 1a2: aconst_null
      // 1a3: invokestatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a (Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;Ljava/lang/String;ZILjava/lang/Object;)D
      // 1a6: d2f
      // 1a7: fstore 16
      // 1a9: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 1ac: astore 17
      // 1ae: ldc_w 7.0
      // 1b1: fstore 18
      // 1b3: ldc_w 15.0
      // 1b6: fstore 19
      // 1b8: ldc_w 5.0
      // 1bb: fstore 20
      // 1bd: aload 11
      // 1bf: checkcast java/lang/Iterable
      // 1c2: astore 22
      // 1c4: bipush 0
      // 1c5: istore 23
      // 1c7: aload 22
      // 1c9: astore 24
      // 1cb: new java/util/ArrayList
      // 1ce: dup
      // 1cf: aload 22
      // 1d1: bipush 10
      // 1d3: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
      // 1d6: invokespecial java/util/ArrayList.<init> (I)V
      // 1d9: checkcast java/util/Collection
      // 1dc: astore 25
      // 1de: bipush 0
      // 1df: istore 26
      // 1e1: aload 24
      // 1e3: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 1e8: astore 27
      // 1ea: aload 27
      // 1ec: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1f1: ifeq 22f
      // 1f4: aload 27
      // 1f6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1fb: astore 28
      // 1fd: aload 25
      // 1ff: aload 28
      // 201: checkcast java/lang/String
      // 204: astore 29
      // 206: iload 3
      // 207: ifne 231
      // 20a: astore 51
      // 20c: bipush 0
      // 20d: istore 30
      // 20f: aload 17
      // 211: aload 29
      // 213: bipush 0
      // 214: bipush 2
      // 215: aconst_null
      // 216: invokestatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a (Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;Ljava/lang/String;ZILjava/lang/Object;)D
      // 219: d2f
      // 21a: fload 18
      // 21c: fconst_2
      // 21d: fmul
      // 21e: fadd
      // 21f: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 222: aload 51
      // 224: swap
      // 225: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 22a: pop
      // 22b: iload 3
      // 22c: ifeq 1ea
      // 22f: aload 25
      // 231: checkcast java/util/List
      // 234: nop
      // 235: astore 21
      // 237: aload 21
      // 239: checkcast java/lang/Iterable
      // 23c: invokestatic kotlin/collections/CollectionsKt.sumOfFloat (Ljava/lang/Iterable;)F
      // 23f: fload 20
      // 241: aload 11
      // 243: invokeinterface java/util/List.size ()I 1
      // 248: bipush 1
      // 249: isub
      // 24a: bipush 0
      // 24b: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (II)I
      // 24e: i2f
      // 24f: fmul
      // 250: fadd
      // 251: fstore 22
      // 253: ldc_w 16.0
      // 256: fstore 23
      // 258: ldc_w 8.0
      // 25b: fstore 24
      // 25d: aload 13
      // 25f: checkcast java/lang/Iterable
      // 262: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 267: astore 27
      // 269: aload 27
      // 26b: iload 3
      // 26c: ifne 291
      // 26f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 274: ifne 28a
      // 277: goto 27e
      // 27a: invokestatic me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27d: athrow
      // 27e: new java/util/NoSuchElementException
      // 281: dup
      // 282: invokespecial java/util/NoSuchElementException.<init> ()V
      // 285: athrow
      // 286: invokestatic me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 289: athrow
      // 28a: aload 27
      // 28c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 291: checkcast me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII$drawInfoHud$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 294: astore 28
      // 296: bipush 0
      // 297: istore 29
      // 299: fload 23
      // 29b: fload 24
      // 29d: fadd
      // 29e: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 2a1: aload 28
      // 2a3: invokevirtual me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII$drawInfoHud$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()Ljava/lang/String;
      // 2a6: bipush 0
      // 2a7: bipush 2
      // 2a8: aconst_null
      // 2a9: invokestatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a (Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;Ljava/lang/String;ZILjava/lang/Object;)D
      // 2ac: d2f
      // 2ad: fadd
      // 2ae: fstore 28
      // 2b0: aload 27
      // 2b2: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2b7: ifeq 2f1
      // 2ba: aload 27
      // 2bc: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2c1: checkcast me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII$drawInfoHud$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 2c4: astore 29
      // 2c6: bipush 0
      // 2c7: istore 30
      // 2c9: fload 23
      // 2cb: fload 24
      // 2cd: fadd
      // 2ce: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 2d1: aload 29
      // 2d3: invokevirtual me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII$drawInfoHud$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()Ljava/lang/String;
      // 2d6: bipush 0
      // 2d7: bipush 2
      // 2d8: aconst_null
      // 2d9: invokestatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a (Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;Ljava/lang/String;ZILjava/lang/Object;)D
      // 2dc: d2f
      // 2dd: fadd
      // 2de: fstore 29
      // 2e0: fload 28
      // 2e2: fload 29
      // 2e4: invokestatic java/lang/Math.max (FF)F
      // 2e7: iload 3
      // 2e8: ifne 2f3
      // 2eb: fstore 28
      // 2ed: iload 3
      // 2ee: ifeq 2b0
      // 2f1: fload 28
      // 2f3: fstore 25
      // 2f5: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 2f8: getstatic me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Ljava/util/List;
      // 2fb: invokeinterface java/util/List.size ()I 1
      // 300: sipush 8001
      // 303: sipush 20738
      // 306: pop2
      // 307: ldc_w " waypoints"
      // 30a: invokedynamic makeConcatWithConstants (ILjava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 30f: bipush 0
      // 310: bipush 2
      // 311: aconst_null
      // 312: invokestatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a (Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;Ljava/lang/String;ZILjava/lang/Object;)D
      // 315: d2f
      // 316: fstore 26
      // 318: ldc_w 178.0
      // 31b: fstore 27
      // 31d: fload 14
      // 31f: bipush 5
      // 320: newarray 6
      // 322: astore 29
      // 324: aload 29
      // 326: bipush 0
      // 327: fload 15
      // 329: fastore
      // 32a: aload 29
      // 32c: bipush 1
      // 32d: fload 16
      // 32f: fastore
      // 330: aload 29
      // 332: bipush 2
      // 333: fload 26
      // 335: fastore
      // 336: aload 29
      // 338: bipush 3
      // 339: fload 25
      // 33b: fastore
      // 33c: aload 29
      // 33e: bipush 4
      // 33f: fload 27
      // 341: fastore
      // 342: aload 29
      // 344: invokestatic kotlin/comparisons/ComparisonsKt.maxOf (F[F)F
      // 347: fstore 28
      // 349: fload 28
      // 34b: fload 22
      // 34d: ldc_w 260.0
      // 350: invokestatic java/lang/Math.min (FF)F
      // 353: invokestatic java/lang/Math.max (FF)F
      // 356: fstore 29
      // 358: fload 29
      // 35a: fload 7
      // 35c: fconst_2
      // 35d: fmul
      // 35e: fadd
      // 35f: fstore 30
      // 361: ldc_w 14.0
      // 364: fstore 31
      // 366: ldc_w 17.0
      // 369: fstore 32
      // 36b: ldc_w 3.0
      // 36e: fstore 33
      // 370: ldc_w 10.0
      // 373: fstore 34
      // 375: ldc_w 8.0
      // 378: fstore 35
      // 37a: ldc_w 17.0
      // 37d: fstore 36
      // 37f: aload 0
      // 380: aload 11
      // 382: aload 21
      // 384: fload 29
      // 386: fload 20
      // 388: invokespecial me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.a (Ljava/util/List;Ljava/util/List;FF)Ljava/util/List;
      // 38b: astore 37
      // 38d: aload 37
      // 38f: invokeinterface java/util/List.size ()I 1
      // 394: i2f
      // 395: fload 19
      // 397: fmul
      // 398: aload 37
      // 39a: invokeinterface java/util/List.size ()I 1
      // 39f: bipush 1
      // 3a0: isub
      // 3a1: bipush 0
      // 3a2: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (II)I
      // 3a5: i2f
      // 3a6: ldc_w 4.0
      // 3a9: fmul
      // 3aa: fadd
      // 3ab: fstore 38
      // 3ad: fload 8
      // 3af: fload 31
      // 3b1: fadd
      // 3b2: fconst_2
      // 3b3: fadd
      // 3b4: fload 32
      // 3b6: fadd
      // 3b7: fload 33
      // 3b9: fadd
      // 3ba: fload 31
      // 3bc: fadd
      // 3bd: fload 34
      // 3bf: fadd
      // 3c0: fload 31
      // 3c2: fadd
      // 3c3: ldc_w 4.0
      // 3c6: fadd
      // 3c7: fload 38
      // 3c9: fadd
      // 3ca: fload 35
      // 3cc: fadd
      // 3cd: fconst_2
      // 3ce: fadd
      // 3cf: fload 36
      // 3d1: aload 13
      // 3d3: invokeinterface java/util/List.size ()I 1
      // 3d8: i2f
      // 3d9: fmul
      // 3da: fadd
      // 3db: fload 8
      // 3dd: fadd
      // 3de: fstore 39
      // 3e0: fload 5
      // 3e2: fload 6
      // 3e4: fload 30
      // 3e6: fload 39
      // 3e8: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 3eb: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.e ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 3ee: ldc_w 0.78
      // 3f1: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 3f4: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 3f7: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.aq ()F
      // 3fa: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;F)V
      // 3fd: fload 5
      // 3ff: fload 6
      // 401: fload 30
      // 403: fload 39
      // 405: fconst_1
      // 406: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 409: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.y ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 40c: ldc_w 0.55
      // 40f: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 412: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 415: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.aq ()F
      // 418: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;F)V
      // 41b: fload 6
      // 41d: fload 8
      // 41f: fadd
      // 420: fstore 40
      // 422: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 425: sipush 8015
      // 428: sipush -6444
      // 42b: pop2
      // 42c: ldc_w "ROUTE EDIT MODE"
      // 42f: fload 5
      // 431: fload 7
      // 433: fadd
      // 434: f2d
      // 435: fload 40
      // 437: f2d
      // 438: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 43b: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.ah ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 43e: ldc_w 0.9
      // 441: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 444: bipush 0
      // 445: bipush 16
      // 447: aconst_null
      // 448: invokestatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b (Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;Ljava/lang/String;DDLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;ZILjava/lang/Object;)D
      // 44b: pop2
      // 44c: getstatic me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Ljava/util/List;
      // 44f: invokeinterface java/util/List.size ()I 1
      // 454: sipush 8053
      // 457: sipush 29411
      // 45a: pop2
      // 45b: ldc_w " waypoints"
      // 45e: invokedynamic makeConcatWithConstants (ILjava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 463: astore 41
      // 465: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 468: aload 41
      // 46a: bipush 0
      // 46b: bipush 2
      // 46c: aconst_null
      // 46d: invokestatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a (Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;Ljava/lang/String;ZILjava/lang/Object;)D
      // 470: d2f
      // 471: fstore 42
      // 473: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 476: aload 41
      // 478: fload 5
      // 47a: fload 30
      // 47c: fadd
      // 47d: fload 7
      // 47f: fsub
      // 480: fload 42
      // 482: fsub
      // 483: f2d
      // 484: fload 40
      // 486: f2d
      // 487: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 48a: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.b ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 48d: bipush 0
      // 48e: bipush 16
      // 490: aconst_null
      // 491: invokestatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b (Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;Ljava/lang/String;DDLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;ZILjava/lang/Object;)D
      // 494: pop2
      // 495: fload 40
      // 497: fload 31
      // 499: fconst_2
      // 49a: fadd
      // 49b: fadd
      // 49c: fstore 40
      // 49e: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 4a1: aload 9
      // 4a3: fload 5
      // 4a5: fload 7
      // 4a7: fadd
      // 4a8: f2d
      // 4a9: fload 40
      // 4ab: f2d
      // 4ac: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 4af: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.a ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 4b2: bipush 0
      // 4b3: bipush 16
      // 4b5: aconst_null
      // 4b6: invokestatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b (Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;Ljava/lang/String;DDLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;ZILjava/lang/Object;)D
      // 4b9: pop2
      // 4ba: fload 40
      // 4bc: fload 32
      // 4be: fload 33
      // 4c0: fadd
      // 4c1: fadd
      // 4c2: fstore 40
      // 4c4: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 4c7: aload 10
      // 4c9: fload 5
      // 4cb: fload 7
      // 4cd: fadd
      // 4ce: f2d
      // 4cf: fload 40
      // 4d1: f2d
      // 4d2: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 4d5: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.c ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 4d8: bipush 0
      // 4d9: bipush 16
      // 4db: aconst_null
      // 4dc: invokestatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b (Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;Ljava/lang/String;DDLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;ZILjava/lang/Object;)D
      // 4df: pop2
      // 4e0: fload 40
      // 4e2: fload 31
      // 4e4: fadd
      // 4e5: fstore 40
      // 4e7: fload 40
      // 4e9: fload 34
      // 4eb: fconst_2
      // 4ec: fdiv
      // 4ed: fadd
      // 4ee: fstore 40
      // 4f0: fload 5
      // 4f2: fload 7
      // 4f4: fadd
      // 4f5: fload 40
      // 4f7: fload 30
      // 4f9: fload 7
      // 4fb: fconst_2
      // 4fc: fmul
      // 4fd: fsub
      // 4fe: fconst_1
      // 4ff: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 502: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.y ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 505: ldc_w 0.35
      // 508: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 50b: ldc_w 0.5
      // 50e: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;F)V
      // 511: fload 40
      // 513: fload 34
      // 515: fconst_2
      // 516: fdiv
      // 517: fadd
      // 518: fstore 40
      // 51a: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 51d: sipush 8040
      // 520: sipush -17510
      // 523: pop2
      // 524: ldc_w "Allowed waypoint types"
      // 527: fload 5
      // 529: fload 7
      // 52b: fadd
      // 52c: f2d
      // 52d: fload 40
      // 52f: f2d
      // 530: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 533: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.c ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 536: ldc_w 0.7
      // 539: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 53c: bipush 0
      // 53d: bipush 16
      // 53f: aconst_null
      // 540: invokestatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b (Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;Ljava/lang/String;DDLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;ZILjava/lang/Object;)D
      // 543: pop2
      // 544: fload 40
      // 546: fload 31
      // 548: ldc_w 4.0
      // 54b: fadd
      // 54c: fadd
      // 54d: fstore 40
      // 54f: aload 37
      // 551: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 556: astore 43
      // 558: aload 43
      // 55a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 55f: ifeq 645
      // 562: aload 43
      // 564: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 569: checkcast java/util/List
      // 56c: astore 44
      // 56e: fload 5
      // 570: fload 7
      // 572: fadd
      // 573: fstore 45
      // 575: aload 44
      // 577: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 57c: iload 3
      // 57d: ifne 65d
      // 580: astore 46
      // 582: aload 46
      // 584: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 589: ifeq 636
      // 58c: aload 46
      // 58e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 593: checkcast java/lang/Number
      // 596: invokevirtual java/lang/Number.intValue ()I
      // 599: istore 47
      // 59b: aload 11
      // 59d: iload 47
      // 59f: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 5a4: checkcast java/lang/String
      // 5a7: astore 48
      // 5a9: aload 17
      // 5ab: aload 48
      // 5ad: bipush 0
      // 5ae: bipush 2
      // 5af: aconst_null
      // 5b0: invokestatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a (Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;Ljava/lang/String;ZILjava/lang/Object;)D
      // 5b3: d2f
      // 5b4: fstore 49
      // 5b6: fload 49
      // 5b8: fload 18
      // 5ba: fconst_2
      // 5bb: fmul
      // 5bc: fadd
      // 5bd: fstore 50
      // 5bf: fload 45
      // 5c1: fload 40
      // 5c3: fload 50
      // 5c5: fload 19
      // 5c7: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 5ca: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.ah ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 5cd: ldc_w 0.16
      // 5d0: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 5d3: fload 19
      // 5d5: fconst_2
      // 5d6: fdiv
      // 5d7: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;F)V
      // 5da: fload 45
      // 5dc: fload 40
      // 5de: fload 50
      // 5e0: fload 19
      // 5e2: ldc_w 0.8
      // 5e5: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 5e8: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.ah ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 5eb: ldc_w 0.45
      // 5ee: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 5f1: fload 19
      // 5f3: fconst_2
      // 5f4: fdiv
      // 5f5: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;F)V
      // 5f8: aload 17
      // 5fa: aload 48
      // 5fc: fload 45
      // 5fe: fload 18
      // 600: fadd
      // 601: f2d
      // 602: fload 40
      // 604: ldc_w 2.5
      // 607: fadd
      // 608: f2d
      // 609: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 60c: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.a ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 60f: ldc_w 0.95
      // 612: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 615: bipush 0
      // 616: bipush 16
      // 618: aconst_null
      // 619: invokestatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b (Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;Ljava/lang/String;DDLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;ZILjava/lang/Object;)D
      // 61c: pop2
      // 61d: fload 45
      // 61f: fload 50
      // 621: fload 20
      // 623: fadd
      // 624: fadd
      // 625: fstore 45
      // 627: iload 3
      // 628: ifne 641
      // 62b: iload 3
      // 62c: ifeq 582
      // 62f: goto 636
      // 632: invokestatic me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 635: athrow
      // 636: fload 40
      // 638: fload 19
      // 63a: ldc_w 4.0
      // 63d: fadd
      // 63e: fadd
      // 63f: fstore 40
      // 641: iload 3
      // 642: ifeq 558
      // 645: fload 40
      // 647: fload 35
      // 649: ldc_w 4.0
      // 64c: fsub
      // 64d: fadd
      // 64e: fstore 40
      // 650: fload 40
      // 652: fconst_2
      // 653: fadd
      // 654: fstore 40
      // 656: aload 13
      // 658: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 65d: astore 43
      // 65f: aload 43
      // 661: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 666: ifeq 6d3
      // 669: aload 43
      // 66b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 670: checkcast me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII$drawInfoHud$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 673: astore 44
      // 675: fload 5
      // 677: fload 7
      // 679: fadd
      // 67a: fstore 45
      // 67c: fload 40
      // 67e: fconst_1
      // 67f: fsub
      // 680: fstore 46
      // 682: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
      // 685: aload 44
      // 687: invokevirtual me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII$drawInfoHud$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Ljava/lang/String;
      // 68a: fload 45
      // 68c: fload 46
      // 68e: fload 23
      // 690: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 693: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.b ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 696: ldc_w 0.85
      // 699: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 69c: fconst_1
      // 69d: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b (Ljava/lang/String;FFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;F)V
      // 6a0: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 6a3: aload 44
      // 6a5: invokevirtual me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII$drawInfoHud$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()Ljava/lang/String;
      // 6a8: fload 45
      // 6aa: fload 23
      // 6ac: fadd
      // 6ad: fload 24
      // 6af: fadd
      // 6b0: f2d
      // 6b1: fload 40
      // 6b3: f2d
      // 6b4: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 6b7: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.b ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 6ba: ldc_w 0.85
      // 6bd: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 6c0: bipush 0
      // 6c1: bipush 16
      // 6c3: aconst_null
      // 6c4: invokestatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b (Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;Ljava/lang/String;DDLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;ZILjava/lang/Object;)D
      // 6c7: pop2
      // 6c8: fload 40
      // 6ca: fload 36
      // 6cc: fadd
      // 6cd: fstore 40
      // 6cf: iload 3
      // 6d0: ifeq 65f
      // 6d3: return
   }

   private final List<List<Integer>> a(List<String> param1, List<Float> param2, float param3, float param4) {
      int var5 = k();
      List<List<Integer>> var6 = new ArrayList<>();
      List<Integer> var7 = new ArrayList<>();
      float var8 = 0.0F;
      int var9 = 0;
      int var10 = param1.size();
      while (var9 < var10) {
         float var11 = ((Number)param2.get(var9)).floatValue();
         if (var5 != 0) {
            break;
         }
         float var12 = var7.isEmpty() ? var11 : var8 + param4 + var11;
         if (var12 > param3 && !var7.isEmpty()) {
            var6.add(var7);
            var7 = new ArrayList<>();
            var8 = 0.0F;
         }
         var7.add(var9);
         if (var8 != 0.0F) {
            var8 = var8 + param4 + var11;
         } else {
            var8 = var11;
         }
         var9++;
      }
      if (!var7.isEmpty()) {
         var6.add(var7);
      }
      return var6;
   }

   private final void b(float param1, float param2) {
int var3 = j();
PXEvMid var6 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
PXEvMid.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var20;
if (var3 == 0) {
   var20 = (PXEvMid.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var6;
} else if (var6 instanceof PXEvMid.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll) {
   var20 = (PXEvMid.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var6;
} else {
   var20 = null;
}
String var4 = var20 == null ? null : var20.g();
String var5 = "EDIT MODE";
boolean var21 = var4 != null;
float var7 = 14.0F;
float var8 = 7.0F;
float var9 = 11.0F;
float var10 = 9.0F;
float var11 = 3.0F;
float var12 = (float)lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.a(var5, false);
float var13 = var21 ? (float)lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.a(var4, false) : 0.0F;
float var14 = Math.max(var12, var13) + var7 * 2.0F;
float var15 = var8 * 2.0F + var9 + (var3 != 0 ? (var21 ? var11 + var10 : 0.0F) : 0.0F);
float var16 = param1 / 2.0F;
float var17 = param2 / 2.0F - 36.0F;
float var18 = var16 - var14 / 2.0F;
float var19 = var17 - var15 / 2.0F;
lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var18, var19, var14, var15, IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.e().a(0.7F), 6.0F);
lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var18, var19, var14, var15, 1.0F, IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.ah().a(0.6F), 6.0F);
if (var21 && var4 != null) {
   lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.a(var5, (int)var16, (int)(var19 + var8), IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().a(0.92F));
   lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.a(var5, (int)var16, (int)(var19 + var8 + var9 + var11), IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.ah().a(0.9F));
} else {
   lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.b(var5, (int)var16, (int)var17, IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().a(0.92F));
}
   }

   private final void a(String var1, me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var2) { short var10003 = (short)0; // PX-FIX hoist
         short var10002 = (short)0; // PX-FIX hoist
        
       var10002 = 8061;
       var10003 = 19803;
      IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(3500L, "Route Edit", var1, var2);
   }

   public final void a(int param1) {
      int var2 = j();
      PXEvMid.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3;
      if (var2 == 0) {
         var3 = (PXEvMid.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      } else if (IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl instanceof PXEvMid.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll) {
         var3 = (PXEvMid.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      } else {
         var3 = null;
      }

      if (var3 == null) {
         this.a("This macro has only one route file", me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         return;
      }

      List<String> var4 = var3.b().i();
      if (var2 != 0 && var4.size() < 2) {
         this.a("This macro has only one route file", me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         return;
      }

      int var5 = ((var3.f() + param1) % var4.size() + var4.size()) % var4.size();
      var3.a(var5);
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clear();
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.addAll(var3.d());
      this.a("Switched to " + var3.g() + "  (" + var4.size() + " waypoints)", me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
   }

   public final boolean b(int param1) {
      int var2 = j();
      if (var2 == 0) {
         return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      } else if (!lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
         return false;
      } else if (lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.screen != null) {
         return false;
      } else {
         switch (param1) {
            case 262:
               this.a(1);
               return true;
            case 263:
               this.a(-1);
               return true;
            default:
               return false;
         }
      }
   }

   private static final Unit c(float var0, float var1) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0, var1);
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var0, var1);
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static { byte var10002 = (byte)0; // PX-FIX hoist
        
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[46];
      int var3 = 0;
      String var2 = "\u0015âjë\u001e\u0082\u001bkåi\u00ad\u0083\u0005\u009bRH/\u001d\t~ \u001e¸\tÎ;\t \u000flZXãÅï¢§\u009fôéy;=¾\u000f·\u0010Ë\u0011ûñR©\u00851\u008eÍà«%\u0005Î2\u0011q\u008f\u0003À!\u008c\u000bÕTg0¥R\u0011\u009c}Û&\u0005\u000e°õ\u009aw\u0005Ô\u0018¡f \u0010\u009eF\u0003¨~¹ÆFþ¦;z· FH\u000f\u009câ\u008f\u009a¨ª\u0084ì\u0006NÓK©\u001bæ\tçÂÀ\u009a,\u00ad\\/\u0007Ƭ\u008cþb\u0081<Y1\u0015M\"¤ý\u0083\u0095·\u0090³{\u0089ôñ\u001b\u0004Q\u009cXú½u\u008c¶Ûô\u0084,ç,L\u0003>ù|È\u0007\u0000SaWñE\u0006×¡e \rSg«ä¼\u0011°_\u0094àhtulûw°SI¹zð\u0010\u0006\u009fó5\u0084¼6þ\u0089û3X\u000b\u0083Ò\u008fÏ\u0013j\u0098\u008aô{¶êm..â\u001eà»þ\"%\u008b\u0019.ë\u0096È\u009cHo3l\u00ad62WUrx}ã¬=¤×ýL\u0081â¬\u0002å)\n\u0007z¢\u001f\u0005T\u0013©ÇzõíêN¬\u0006\u0007ý_å]\u009cÕ2Dù\u0007\u0087¸ToÌ®ýmF\t4gÅ\u0087\u0000á¤aÊõ!;E\fÄÍÕ\u0095Ã*\u0002êW/¶W¡C\u0084î'IEnn\fÅH5.ÛGp\u0012f:.\u0012?\u008dZþÍ\u0099\u008a\u0091.éW\b\u0098â\u0017À¼hþ»á\u001c ÝdÎh==\u0082Ò¦.3SM\"ì)\u0084>îÝT¬\u0003ÈRäb¯B´q*U&\u009c²\u0018ciý\u001c\u0012Æ\"é÷R=\u0096\"þé´lý\u0011áRUü\u0094ô\u000eÀ\u00ad=Õ\u0012ôYuJ\u0089Î§ò¼\u001böeY=\u0013\n\u000f+\u009a\u009d?w!\u0081OBM\u0019\u0090\u0010\u001fC¶\u0082,æv\u0082¾9a\u0019G¿¶\u0087¿Z\u0085ö§¥\u0003hÇ}¢\u009cZÒr÷aú\u0081¬\u0000\u008d¬\u009d°}ç\u008f¤\u0017±\u009bÅ\u007fgÕk¸ZOÈöph0f\u009a\u0092?4\u009d\u0000¦\u001e\u000fnç{Â\u0016o¼pCìâÒ\u008fª,ïÌ©<ãØgÏÅ\u001e9ô\u0016ZÕWã¿\u008f¬Q±û\u009aµä¨æÚØeø\u008a\t\u008c\tæ\u000f\rMkpwÞ©\u000bsY³\u0091?fB\u001a\u0017\u000bk\u001a\u001dBÜ3Î\u008e\u0082wt¬5·¡\u0019³d4q³\u0097-#\u0081µ\u009c|\nr\u00ad\u0093\u000f;µÂ`\u0007D\u0003¸È\u0082ǚi\u000fÞ¿«\u0082\u0090§\u0007ôG§Xuº7½\u0003\u0096§&È¯\u0085¿\u0090\u001a°/ë}j\u001d\bÍø\"\u008eÓB\u0096\u0013ý]Hd*\u0006Ì\u0011\u000f©Æèìý\u001a0N\u001bP\u009d\u0018\u0095yz\u001a®y\u0080>Á¾\u009f\u0093\u001e\u0007¾$\u0007ð]M\fÃ\u0081u==á°çöEDt\u009aL5\u000e7Ò~\u0088üãå´\u0089w\u000b»p½wb»èciïÌ&\u0005 [Â»Aû0ËßG\u0090tLþàur\u001bÜ\u001c5ï\r\r\u0019n¯\u008eÝrÚ\u00833\u001d°Øÿdg#û\u0016#(\u009e³ (tl8³lö\u009fx\u0011\u009c\u009bMþ¹\u009eñ21\u009a¡\u001c+Û|\u0015Õnþ¯ø\u0011\u008b\t{d\r\u008aEÀ\u0093µs\u009aÃ8)l¹ÓG\u0013^@ðJN\u0018~°ì³Ò~ê'å=\u0018\b]jÂxhÆ^%µOÏU\u009c·\u0002f'Ü\u0015×0 ¹^\u0081ïUÃ;«\u000eCñÆm¡ÝÜ\u0003BÄ\u0090Æ\u009c±Q\u001e|\u0093\u001ezªç|ªÿÄ¡ñ\u0005\u0018ö\u0091Oá\u0080\r6÷XoU\u008a\u0098 K\u0088)xq\u0095ß\u0019iü\u0092\u0011ôLò\u001b¢Ü\u0098=}É=\u0080\u0018_µ|Ë.ëzlù®D\u0019ÕKîÑ,÷\u0000\u009d\\\u0015ø\u0085I\u0005¸°f\u009dð\u0017©¥xÿv¹¥µòû9\u0006¼»[*\f\u0011ÛÓ8ö\t\u00ad^>9c²\"vWx¦j¯Ü¶òyn\u0081\u009eO³ÐÇ*1\u0016Ý¢\u0082å`q_R\u0082\u001eÄ2\u008bÚ4%mÝ\u0014É#NÛÅÍ\u0001Ê\u0081\t\u008fëGÄ\u00959 \u009ay¹Õ\u0081InY¸\u0092å\u0081^ì>\u0006íM\u0085oï\b\"b,cÉ|$x\u001d_[\u00adõ\u009d\u001aä^N\u007fgCg\u0018d\u0018m<\u0089ÃµÍ\u0081®\u0082\u0099Ʃðwí°Í\u007f\u000fÑ\u008aº\\î\u009c÷TÜÏò\u0006Å\u0000=:\u0095[À\u0002®jîU\u0097\u0088\r£ÖÝj=ú>ä0\u0014\u001f1\u0082\u001b\u008dÌ\u0089æPC\u009eÉ\u0094ÿS÷£sS\u0013èiçE\u0084JÅ³wË±ªe\u0092óJãzºµM\u0010ÀM<« \u0018\u009c°l\u0083oã\u0017»\u0005]\u0088.ª¶Öñ\u0001\u0082X²^¬\u0004(ßÍ¨\f[Ð\u0097 sÏÕ~+ÜýI\u008cÅ\u0092ùcO\u0005_\u009e\u0080ON\u0099 \u00856\u008b\u0084!Á\u0093\u008bQÔe\u0097\r¦1%é6\u0000yZ\u0099bVØ[\t\fñp¶\u0092J,çü¥ôåÎã\u007f\u000bÑ£·\u0019ÙJ}fùv®\u0018\u00ad\u0086Â¹ñm\u0007\u0006z&ã¥5½b\\$Yüä¬\u001c´\u0019å®¶Î.<\u0018ÓpÔs:;üî_GFî~ã¤àÊl0;8\f\u0087\u008dZ\u0083Dee-£}]Í\u008eÏ=\n\u0097YQ\\¸#Í×\u0093ã\u001c&O\u0090Üs\u0087x`Ï\u008e&âCy\u0013ë9\\æ}9\u0098\u007f\u0090ð{¨Q~¶\u0091¦[bU;zï´±§½\u008ee¾tþìúç¬\u0093JHÎ\u0004¨\u000e\u0005ãf\u0090Ãbÿ\u0000à;\u0005\núá]\u0088\u001fÈÝr'\u0010\u0094k$Sïö¿âHa\u0012ÀkWS²s84ËÃ\u0018~\u0084\\»f3®A1¹\u001d\u009a\u00ad8ÎÞµ\u001fy\u008cc¤\u001ewÇr¦>½q\u0089Y¢¹\u009c §¿B\u0004\u0016ð\u0010@\u0012o\u0081\u0011hÜÐø?\u0000A\u0015\u0099]\u009e\u0006îªH\u0082ñÔ\nqAÛ\u0084±'\b\u009eê×\f=\u00822Â\u00adpç\tª®ã\u0091\u0002¿H\u0003¯\u008c`\u0005ckXáÂ,°\u008e\u0002]Ym\u0088\u009b\u0088²ÕËM\u0080Ú\u0089}±f\u001eöÓè\u001d®Yå\u0013µS\u0081{\u009c ibÑÂ\u0004\\¨\u009a\u0010\\\u0006\u0094\u0005\u000fbÝR\b'Ù\tÇãr\u0012\u009d\u0003X\\0\u000f»\u009b\u009a\u008f\u0091{\u0018ë)\u0005Bí2ãL\"t\u009c¡ß$æsE>P\u0081\u0094\u00186TÛXÏ¥U?Úo@\f7¥¢0á1+\u0094)\u0010ñV\u0010}Ä%Á\u0014\nB3\tì\u0090b¿\n\u0010\u008bßË²-ós!&\u0007â\u001ehêóþä\u000fµÅc\u0010¢\u0091Nh\u0002\rZFMÚp\tô´ÒZÅýCs¹ƔXbø\u0012o+[[\u0000ë\rÄ¶²\u0011tgç\u0013g¢in\u001fÑ\u0091S\u0084@«\u0010? \u0018¶t\u007f>ip´µa>5tÇ³%Ù\u009cDò\u0017ÊC\u001e®\u0002Ý\u00896\u0016»@|òç&\u001e\u00919ý\u009aà\u0080O×¶âKo¬\u001bû\u0019·\u0016\u0017ø·\u000e<¸RBçR¹Uó\u0018\u0003'>a)|j«OR\u0084Â#§ñ\u0016\u00ad1|ð9\u0013Ë8J!=ÁR\u0083\u0094\u0093\u0096î\u008c\u00adø\u0003!\u000b¸?g\u0092\n¼<ôPÕè)¤óG3p;l\u009aÝd«Z\u0081Î\u000f¾\u001d\u0016àî¦E&\u0005\u0003\u008cÍúè4\u0081Ø@r¾p¼\u0092É>\u0000¡( \u0010qùb\u000eÏåv\n\u008aü$\u009a@\u0094iÉÝ¼\u0001íàÁób\u0089keÚo\u001a\u0099©É\u0083Ê.)¬\u0093«\u0019é}MÆ\u0003ªÝBÀ¿ÄPèP.\u0004\u0084¹=\u0018£®\u0082åí\u0010\u0091'ü\u0015¿ú\u0011z[¼gHß\u008eÑæb_S\u0082ÜnðQ@Zaý\u0012È\u0092\u0091©~\u0004DúZ0\u009d/\u001eÀ¹ëX¢2Ó(\u000b\u008bqSê\u009c\u0012ãÌM»o\u0091â\u0006\u009cZ>Mq\u0097Enö½·\u0001ÈK\u0099{\u0095\u008d!\bú\u008cOÐ/øê Ú[D3\u0091\bhÍIÛ\u000e\u009fSË¤\u0014ÿù&S\u0000¦oûØ\rø¥\u0083ê\u00004¶¸¡\u0084¦XÃ?ÃQ\u008bt\u0001";
      int var4 = "\u0015âjë\u001e\u0082\u001bkåi\u00ad\u0083\u0005\u009bRH/\u001d\t~ \u001e¸\tÎ;\t \u000flZXãÅï¢§\u009fôéy;=¾\u000f·\u0010Ë\u0011ûñR©\u00851\u008eÍà«%\u0005Î2\u0011q\u008f\u0003À!\u008c\u000bÕTg0¥R\u0011\u009c}Û&\u0005\u000e°õ\u009aw\u0005Ô\u0018¡f \u0010\u009eF\u0003¨~¹ÆFþ¦;z· FH\u000f\u009câ\u008f\u009a¨ª\u0084ì\u0006NÓK©\u001bæ\tçÂÀ\u009a,\u00ad\\/\u0007Ƭ\u008cþb\u0081<Y1\u0015M\"¤ý\u0083\u0095·\u0090³{\u0089ôñ\u001b\u0004Q\u009cXú½u\u008c¶Ûô\u0084,ç,L\u0003>ù|È\u0007\u0000SaWñE\u0006×¡e \rSg«ä¼\u0011°_\u0094àhtulûw°SI¹zð\u0010\u0006\u009fó5\u0084¼6þ\u0089û3X\u000b\u0083Ò\u008fÏ\u0013j\u0098\u008aô{¶êm..â\u001eà»þ\"%\u008b\u0019.ë\u0096È\u009cHo3l\u00ad62WUrx}ã¬=¤×ýL\u0081â¬\u0002å)\n\u0007z¢\u001f\u0005T\u0013©ÇzõíêN¬\u0006\u0007ý_å]\u009cÕ2Dù\u0007\u0087¸ToÌ®ýmF\t4gÅ\u0087\u0000á¤aÊõ!;E\fÄÍÕ\u0095Ã*\u0002êW/¶W¡C\u0084î'IEnn\fÅH5.ÛGp\u0012f:.\u0012?\u008dZþÍ\u0099\u008a\u0091.éW\b\u0098â\u0017À¼hþ»á\u001c ÝdÎh==\u0082Ò¦.3SM\"ì)\u0084>îÝT¬\u0003ÈRäb¯B´q*U&\u009c²\u0018ciý\u001c\u0012Æ\"é÷R=\u0096\"þé´lý\u0011áRUü\u0094ô\u000eÀ\u00ad=Õ\u0012ôYuJ\u0089Î§ò¼\u001böeY=\u0013\n\u000f+\u009a\u009d?w!\u0081OBM\u0019\u0090\u0010\u001fC¶\u0082,æv\u0082¾9a\u0019G¿¶\u0087¿Z\u0085ö§¥\u0003hÇ}¢\u009cZÒr÷aú\u0081¬\u0000\u008d¬\u009d°}ç\u008f¤\u0017±\u009bÅ\u007fgÕk¸ZOÈöph0f\u009a\u0092?4\u009d\u0000¦\u001e\u000fnç{Â\u0016o¼pCìâÒ\u008fª,ïÌ©<ãØgÏÅ\u001e9ô\u0016ZÕWã¿\u008f¬Q±û\u009aµä¨æÚØeø\u008a\t\u008c\tæ\u000f\rMkpwÞ©\u000bsY³\u0091?fB\u001a\u0017\u000bk\u001a\u001dBÜ3Î\u008e\u0082wt¬5·¡\u0019³d4q³\u0097-#\u0081µ\u009c|\nr\u00ad\u0093\u000f;µÂ`\u0007D\u0003¸È\u0082ǚi\u000fÞ¿«\u0082\u0090§\u0007ôG§Xuº7½\u0003\u0096§&È¯\u0085¿\u0090\u001a°/ë}j\u001d\bÍø\"\u008eÓB\u0096\u0013ý]Hd*\u0006Ì\u0011\u000f©Æèìý\u001a0N\u001bP\u009d\u0018\u0095yz\u001a®y\u0080>Á¾\u009f\u0093\u001e\u0007¾$\u0007ð]M\fÃ\u0081u==á°çöEDt\u009aL5\u000e7Ò~\u0088üãå´\u0089w\u000b»p½wb»èciïÌ&\u0005 [Â»Aû0ËßG\u0090tLþàur\u001bÜ\u001c5ï\r\r\u0019n¯\u008eÝrÚ\u00833\u001d°Øÿdg#û\u0016#(\u009e³ (tl8³lö\u009fx\u0011\u009c\u009bMþ¹\u009eñ21\u009a¡\u001c+Û|\u0015Õnþ¯ø\u0011\u008b\t{d\r\u008aEÀ\u0093µs\u009aÃ8)l¹ÓG\u0013^@ðJN\u0018~°ì³Ò~ê'å=\u0018\b]jÂxhÆ^%µOÏU\u009c·\u0002f'Ü\u0015×0 ¹^\u0081ïUÃ;«\u000eCñÆm¡ÝÜ\u0003BÄ\u0090Æ\u009c±Q\u001e|\u0093\u001ezªç|ªÿÄ¡ñ\u0005\u0018ö\u0091Oá\u0080\r6÷XoU\u008a\u0098 K\u0088)xq\u0095ß\u0019iü\u0092\u0011ôLò\u001b¢Ü\u0098=}É=\u0080\u0018_µ|Ë.ëzlù®D\u0019ÕKîÑ,÷\u0000\u009d\\\u0015ø\u0085I\u0005¸°f\u009dð\u0017©¥xÿv¹¥µòû9\u0006¼»[*\f\u0011ÛÓ8ö\t\u00ad^>9c²\"vWx¦j¯Ü¶òyn\u0081\u009eO³ÐÇ*1\u0016Ý¢\u0082å`q_R\u0082\u001eÄ2\u008bÚ4%mÝ\u0014É#NÛÅÍ\u0001Ê\u0081\t\u008fëGÄ\u00959 \u009ay¹Õ\u0081InY¸\u0092å\u0081^ì>\u0006íM\u0085oï\b\"b,cÉ|$x\u001d_[\u00adõ\u009d\u001aä^N\u007fgCg\u0018d\u0018m<\u0089ÃµÍ\u0081®\u0082\u0099Ʃðwí°Í\u007f\u000fÑ\u008aº\\î\u009c÷TÜÏò\u0006Å\u0000=:\u0095[À\u0002®jîU\u0097\u0088\r£ÖÝj=ú>ä0\u0014\u001f1\u0082\u001b\u008dÌ\u0089æPC\u009eÉ\u0094ÿS÷£sS\u0013èiçE\u0084JÅ³wË±ªe\u0092óJãzºµM\u0010ÀM<« \u0018\u009c°l\u0083oã\u0017»\u0005]\u0088.ª¶Öñ\u0001\u0082X²^¬\u0004(ßÍ¨\f[Ð\u0097 sÏÕ~+ÜýI\u008cÅ\u0092ùcO\u0005_\u009e\u0080ON\u0099 \u00856\u008b\u0084!Á\u0093\u008bQÔe\u0097\r¦1%é6\u0000yZ\u0099bVØ[\t\fñp¶\u0092J,çü¥ôåÎã\u007f\u000bÑ£·\u0019ÙJ}fùv®\u0018\u00ad\u0086Â¹ñm\u0007\u0006z&ã¥5½b\\$Yüä¬\u001c´\u0019å®¶Î.<\u0018ÓpÔs:;üî_GFî~ã¤àÊl0;8\f\u0087\u008dZ\u0083Dee-£}]Í\u008eÏ=\n\u0097YQ\\¸#Í×\u0093ã\u001c&O\u0090Üs\u0087x`Ï\u008e&âCy\u0013ë9\\æ}9\u0098\u007f\u0090ð{¨Q~¶\u0091¦[bU;zï´±§½\u008ee¾tþìúç¬\u0093JHÎ\u0004¨\u000e\u0005ãf\u0090Ãbÿ\u0000à;\u0005\núá]\u0088\u001fÈÝr'\u0010\u0094k$Sïö¿âHa\u0012ÀkWS²s84ËÃ\u0018~\u0084\\»f3®A1¹\u001d\u009a\u00ad8ÎÞµ\u001fy\u008cc¤\u001ewÇr¦>½q\u0089Y¢¹\u009c §¿B\u0004\u0016ð\u0010@\u0012o\u0081\u0011hÜÐø?\u0000A\u0015\u0099]\u009e\u0006îªH\u0082ñÔ\nqAÛ\u0084±'\b\u009eê×\f=\u00822Â\u00adpç\tª®ã\u0091\u0002¿H\u0003¯\u008c`\u0005ckXáÂ,°\u008e\u0002]Ym\u0088\u009b\u0088²ÕËM\u0080Ú\u0089}±f\u001eöÓè\u001d®Yå\u0013µS\u0081{\u009c ibÑÂ\u0004\\¨\u009a\u0010\\\u0006\u0094\u0005\u000fbÝR\b'Ù\tÇãr\u0012\u009d\u0003X\\0\u000f»\u009b\u009a\u008f\u0091{\u0018ë)\u0005Bí2ãL\"t\u009c¡ß$æsE>P\u0081\u0094\u00186TÛXÏ¥U?Úo@\f7¥¢0á1+\u0094)\u0010ñV\u0010}Ä%Á\u0014\nB3\tì\u0090b¿\n\u0010\u008bßË²-ós!&\u0007â\u001ehêóþä\u000fµÅc\u0010¢\u0091Nh\u0002\rZFMÚp\tô´ÒZÅýCs¹ƔXbø\u0012o+[[\u0000ë\rÄ¶²\u0011tgç\u0013g¢in\u001fÑ\u0091S\u0084@«\u0010? \u0018¶t\u007f>ip´µa>5tÇ³%Ù\u009cDò\u0017ÊC\u001e®\u0002Ý\u00896\u0016»@|òç&\u001e\u00919ý\u009aà\u0080O×¶âKo¬\u001bû\u0019·\u0016\u0017ø·\u000e<¸RBçR¹Uó\u0018\u0003'>a)|j«OR\u0084Â#§ñ\u0016\u00ad1|ð9\u0013Ë8J!=ÁR\u0083\u0094\u0093\u0096î\u008c\u00adø\u0003!\u000b¸?g\u0092\n¼<ôPÕè)¤óG3p;l\u009aÝd«Z\u0081Î\u000f¾\u001d\u0016àî¦E&\u0005\u0003\u008cÍúè4\u0081Ø@r¾p¼\u0092É>\u0000¡( \u0010qùb\u000eÏåv\n\u008aü$\u009a@\u0094iÉÝ¼\u0001íàÁób\u0089keÚo\u001a\u0099©É\u0083Ê.)¬\u0093«\u0019é}MÆ\u0003ªÝBÀ¿ÄPèP.\u0004\u0084¹=\u0018£®\u0082åí\u0010\u0091'ü\u0015¿ú\u0011z[¼gHß\u008eÑæb_S\u0082ÜnðQ@Zaý\u0012È\u0092\u0091©~\u0004DúZ0\u009d/\u001eÀ¹ëX¢2Ó(\u000b\u008bqSê\u009c\u0012ãÌM»o\u0091â\u0006\u009cZ>Mq\u0097Enö½·\u0001ÈK\u0099{\u0095\u008d!\bú\u008cOÐ/øê Ú[D3\u0091\bhÍIÛ\u000e\u009fSË¤\u0014ÿù&S\u0000¦oûØ\rø¥\u0083ê\u00004¶¸¡\u0084¦XÃ?ÃQ\u008bt\u0001"
         .length();
      c(25);
      char var1 = '\f';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 110;
         String var10001 = var2.substring(++var8, var8 + var1);
          var10002 = -1;

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
                     case 0 -> 48;
                     case 1 -> 47;
                     case 2 -> 61;
                     case 3 -> 28;
                     case 4 -> 112;
                     case 5 -> 77;
                     default -> 31;
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
                     b = new String[46];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII();
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new ArrayList<>();
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "\u008béÒå\u0002éß";
                  var4 = "\u008béÒå\u0002éß".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 16;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   public static void c(int var0) {
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var0;
   }

   public static int j() {
      return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   public static int k() {
      int var0 = j();

      try {
         return var0 == 0 ? 63 : 0;
      } catch (NoWhenBranchMatchedException var1) {
         throw (RuntimeException)a(var1);
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String a(int var0, int var1) { char var10002 = '\0'; // PX-FIX hoist
        
      int var2 = (var0 ^ 8038) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 130;
            case 1 -> 19;
            case 2 -> 53;
            case 3 -> 126;
            case 4 -> 136;
            case 5 -> 137;
            case 6 -> 152;
            case 7 -> 116;
            case 8 -> 191;
            case 9 -> 168;
            case 10 -> 217;
            case 11 -> 147;
            case 12 -> 47;
            case 13 -> 64;
            case 14 -> 251;
            case 15 -> 97;
            case 16 -> 7;
            case 17 -> 18;
            case 18 -> 135;
            case 19 -> 129;
            case 20 -> 89;
            case 21 -> 160;
            case 22 -> 9;
            case 23 -> 234;
            case 24 -> 41;
            case 25 -> 20;
            case 26 -> 69;
            case 27 -> 99;
            case 28 -> 193;
            case 29 -> 16;
            case 30 -> 124;
            case 31 -> 179;
            case 32 -> 185;
            case 33 -> 204;
            case 34 -> 83;
            case 35 -> 141;
            case 36 -> 104;
            case 37 -> 170;
            case 38 -> 153;
            case 39 -> 139;
            case 40 -> 49;
            case 41 -> 122;
            case 42 -> 184;
            case 43 -> 171;
            case 44 -> 215;
            case 45 -> 15;
            case 46 -> 190;
            case 47 -> 222;
            case 48 -> 46;
            case 49 -> 42;
            case 50 -> 57;
            case 51 -> 188;
            case 52 -> 107;
            case 53 -> 181;
            case 54 -> 13;
            case 55 -> 95;
            case 56 -> 0;
            case 57 -> 210;
            case 58 -> 142;
            case 59 -> 240;
            case 60 -> 75;
            case 61 -> 11;
            case 62 -> 65;
            case 63 -> 73;
            case 64 -> 187;
            case 65 -> 252;
            case 66 -> 117;
            case 67 -> 26;
            case 68 -> 175;
            case 69 -> 158;
            case 70 -> 155;
            case 71 -> 250;
            case 72 -> 52;
            case 73 -> 173;
            case 74 -> 169;
            case 75 -> 156;
            case 76 -> 226;
            case 77 -> 10;
            case 78 -> 148;
            case 79 -> 203;
            case 80 -> 63;
            case 81 -> 55;
            case 82 -> 146;
            case 83 -> 40;
            case 84 -> 131;
            case 85 -> 149;
            case 86 -> 103;
            case 87 -> 244;
            case 88 -> 145;
            case 89 -> 82;
            case 90 -> 221;
            case 91 -> 112;
            case 92 -> 249;
            case 93 -> 144;
            case 94 -> 86;
            case 95 -> 36;
            case 96 -> 34;
            case 97 -> 164;
            case 98 -> 127;
            case 99 -> 219;
            case 100 -> 81;
            case 101 -> 255;
            case 102 -> 87;
            case 103 -> 183;
            case 104 -> 80;
            case 105 -> 85;
            case 106 -> 74;
            case 107 -> 96;
            case 108 -> 79;
            case 109 -> 84;
            case 110 -> 163;
            case 111 -> 159;
            case 112 -> 212;
            case 113 -> 214;
            case 114 -> 161;
            case 115 -> 115;
            case 116 -> 213;
            case 117 -> 194;
            case 118 -> 59;
            case 119 -> 100;
            case 120 -> 151;
            case 121 -> 246;
            case 122 -> 76;
            case 123 -> 177;
            case 124 -> 118;
            case 125 -> 172;
            case 126 -> 31;
            case 127 -> 67;
            case 128 -> 195;
            case 129 -> 6;
            case 130 -> 2;
            case 131 -> 232;
            case 132 -> 8;
            case 133 -> 14;
            case 134 -> 242;
            case 135 -> 25;
            case 136 -> 48;
            case 137 -> 66;
            case 138 -> 143;
            case 139 -> 140;
            case 140 -> 44;
            case 141 -> 198;
            case 142 -> 247;
            case 143 -> 235;
            case 144 -> 162;
            case 145 -> 54;
            case 146 -> 199;
            case 147 -> 24;
            case 148 -> 111;
            case 149 -> 254;
            case 150 -> 167;
            case 151 -> 109;
            case 152 -> 30;
            case 153 -> 120;
            case 154 -> 166;
            case 155 -> 211;
            case 156 -> 43;
            case 157 -> 88;
            case 158 -> 134;
            case 159 -> 93;
            case 160 -> 12;
            case 161 -> 98;
            case 162 -> 106;
            case 163 -> 154;
            case 164 -> 108;
            case 165 -> 125;
            case 166 -> 50;
            case 167 -> 236;
            case 168 -> 225;
            case 169 -> 56;
            case 170 -> 230;
            case 171 -> 206;
            case 172 -> 62;
            case 173 -> 128;
            case 174 -> 223;
            case 175 -> 192;
            case 176 -> 102;
            case 177 -> 119;
            case 178 -> 241;
            case 179 -> 4;
            case 180 -> 243;
            case 181 -> 101;
            case 182 -> 237;
            case 183 -> 197;
            case 184 -> 196;
            case 185 -> 218;
            case 186 -> 71;
            case 187 -> 3;
            case 188 -> 1;
            case 189 -> 207;
            case 190 -> 60;
            case 191 -> 123;
            case 192 -> 229;
            case 193 -> 174;
            case 194 -> 248;
            case 195 -> 22;
            case 196 -> 245;
            case 197 -> 114;
            case 198 -> 45;
            case 199 -> 253;
            case 200 -> 94;
            case 201 -> 35;
            case 202 -> 58;
            case 203 -> 224;
            case 204 -> 202;
            case 205 -> 51;
            case 206 -> 29;
            case 207 -> 17;
            case 208 -> 231;
            case 209 -> 209;
            case 210 -> 110;
            case 211 -> 176;
            case 212 -> 182;
            case 213 -> 70;
            case 214 -> 189;
            case 215 -> 38;
            case 216 -> 113;
            case 217 -> 105;
            case 218 -> 138;
            case 219 -> 33;
            case 220 -> 133;
            case 221 -> 23;
            case 222 -> 68;
            case 223 -> 220;
            case 224 -> 200;
            case 225 -> 21;
            case 226 -> 132;
            case 227 -> 201;
            case 228 -> 37;
            case 229 -> 233;
            case 230 -> 165;
            case 231 -> 90;
            case 232 -> 39;
            case 233 -> 72;
            case 234 -> 216;
            case 235 -> 27;
            case 236 -> 92;
            case 237 -> 238;
            case 238 -> 78;
            case 239 -> 91;
            case 240 -> 180;
            case 241 -> 205;
            case 242 -> 32;
            case 243 -> 228;
            case 244 -> 227;
            case 245 -> 61;
            case 246 -> 121;
            case 247 -> 208;
            case 248 -> 5;
            case 249 -> 28;
            case 250 -> 157;
            case 251 -> 150;
            case 252 -> 186;
            case 253 -> 77;
            case 254 -> 239;
            default -> 178;
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
             var10002 = var3[var7];
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

   private abstract static sealed class PXEvMid
      permits llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI,
      llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.PXEvMid.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll,
      llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.PXEvMid.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public PXEvMid(Object... px) {
           this(null, null); // PX-FIX: 委托主构造器（final 字段初始化）
        }

      @NotNull
      public static llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.PXEvMid.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.PXEvMid.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
         (Object[]) null
      );
      @NotNull
      private final IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;

      // PX-FIX jar member (row4): Kotlin synthetic ctor <init>(LIllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI;LllIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
      public PXEvMid(
         IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var1,
         llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var2,
         kotlin.jvm.internal.DefaultConstructorMarker var3
      ) {
         this(var1, var2);
      }

      private PXEvMid(
         IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var1,
         llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var2
      ) {
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var2;
      }

      @NotNull
      public final IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI a() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII b() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public abstract String c();

      @NotNull
      public abstract List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> d();

      public abstract void a(@NotNull List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> var1);

      public static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
         extends llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.PXEvMid {
         @NotNull
         private final String lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         private int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         @NotNull
         private final llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         private static String[] a;
         private static String[] b;

         public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            @NotNull IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var1,
            @NotNull llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var2,
            @NotNull String var3
         ) { short var10002 = (short)0; // PX-FIX hoist
        
            short var10001 = -30203;
             var10002 = -19337;
            Intrinsics.checkNotNullParameter(var1, "macro");
            var10001 = -30204;
            var10002 = -15344;
            Intrinsics.checkNotNullParameter(var2, "editor");
            var10001 = -30207;
            var10002 = 26111;
            Intrinsics.checkNotNullParameter(var3, "folderName");
            super(var1, var2, null);
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var3;
            this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI(
               var2.b()
            );
         }

         @NotNull
         public final String e() {
            return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         public final int f() {
            return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         }

         public final void a(int var1) {
            this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
         }

         @NotNull
         public final String g() {
            List var2;
            int var3;
            int var6;
            label26: {
               var6 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.k();
               var2 = this.b().i();
               int var1 = var6;
               var3 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
               var6 = 0;
               int var10001 = var3;
               if (var1 == 0) {
                  if (0 > var3) {
                     var6 = 0;
                     break label26;
                  }

                  var6 = var3;
                  if (var1 != 0) {
                     break label26;
                  }

                  var10001 = var2.size();
               }

               var6 = var6 < var10001 ? 1 : 0;
            }

            Object var7;
            if (var6 != 0) {
               var7 = var2.get(var3);
            } else {
               short var8 = -30201;
               boolean var5 = false;
               short var9 = 11053;
               var7 = "route";
            }

            return (String)var7;
         }

         @NotNull
         @Override
         public String c() { short var10003 = (short)0; // PX-FIX hoist
         short var10002 = (short)0; // PX-FIX hoist
        
            String var10000 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            String var10001 = this.g();
             var10002 = -30202;
             var10003 = 14186;
            return var10000 + " / " + var10001;
         }

         @NotNull
         @Override
         public List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> d() { IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var10003 = null; // PX-FIX hoist
         BlockPos var10002 = null; // PX-FIX hoist
        
      Collection var13 = null; // PX-FIX
            int var1 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.k();
            if (var1 == 0) {
               IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll var10000 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, this.g());
               if (var10000 != null) {
                  IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll var2 = var10000;
                  Iterable var3 = var2.a();
                  boolean var4 = false;
                  Collection var6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var3, 10));
                  boolean var7 = false;
                  Iterator var8 = var3.iterator();

                  while (true) {
                     if (var8.hasNext()) {
                        Object var9 = var8.next();
                        var13 = var6;
                        IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl var10 = (IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl)var9;
                        if (var1 != 0) {
                           break;
                        }

                        boolean var11 = false;
                        if (var1 == 0) {
                            BlockPos pos = var10.e();
                            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI type =
                               IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                  .a(var10.d());
                            if (type == null) {
                               type = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
                            }
                            var6.add(new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(pos, type));
                        }

                        if (var1 == 0) {
                           continue;
                        }
                     }

                     var13 = var6;
                     break;
                  }

                  return (List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll>)var13;
               }
            }

            return CollectionsKt.emptyList();
         }

         @Override
         public void a(@NotNull List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> var1) { short var10002 = (short)0; // PX-FIX hoist
        
      Collection var20 = null; // PX-FIX
            short var10001 = -30208;
             var10002 = 16751;
            Intrinsics.checkNotNullParameter(var1, "waypoints");
            Iterable var4 = var1;
            boolean var5 = false;
            int var10000 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.k();
            Collection var7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var4, 10));
            int var2 = var10000;
            boolean var8 = false;
            Iterator var9 = var4.iterator();

            while (true) {
               if (var9.hasNext()) {
                  Object var10 = var9.next();
                  var20 = var7;
                  IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var11 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var10;
                  if (var2 != 0) {
                     break;
                  }

                  boolean var12 = false;
                  var7.add(
                     IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(var11.a(), var11.b().a())
                  );
                  if (var2 == 0) {
                     continue;
                  }
               }

               var20 = var7;
               break;
            }

            List var21 = (List)var20;
            Object var14 = null;
            byte var15 = 14;
            Object var16 = null;
            Object var17 = null;
            Object var18 = null;
            List var19 = var21;
            IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll var3 = new IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll(
               var19,
               (String)var18,
               (IIIllIlIIlIllIlIlllIlIllIIllIIlIlIllIlIlllIlIlIllIIIIIlIlIllllIlIlIIIIIIlIIIIllllIllI)var17,
               (lIIIllIlllIlIIIlIIlIIlIIlIlIlIIllIlIlllIIlIlllllIllllIIIllllllIIllllIIIIIIIlIlIllIlll)var16,
               var15,
               (DefaultConstructorMarker)var14
            );
            this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, this.g(), var3);
         }

         // $VF: Irreducible bytecode was duplicated to produce valid code
         static { byte var10002 = (byte)0; // PX-FIX hoist
      char[] var20 = null; // PX-FIX
   pxClinit: {
            String[] var5 = new String[6];
            int var3 = 0;
            String var2 = "Ì\u001d\u0085snI\u0005Ú\u0097D\u0081\u001d\u00030Ô¾\u0005+,\u0090?Y";
            int var4 = "Ì\u001d\u0085snI\u0005Ú\u0097D\u0081\u001d\u00030Ô¾\u0005+,\u0090?Y".length();
            char var1 = 6;
            int var8 = -1;

            label52:
            while (true) {
               byte var10000 = 44;
               String var10001 = var2.substring(++var8, var8 + var1);
                var10002 = -1;

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
                           case 0 -> 41;
                           case 1 -> 53;
                           case 2 -> 48;
                           case 3 -> 67;
                           case 4 -> 90;
                           case 5 -> 110;
                           default -> 95;
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
                           break pxClinit;
                        }

                        var1 = var2.charAt(var8);
                        break;
                     default:
                        var5[var3++] = var29;
                        if ((var8 += var1) < var4) {
                           var1 = var2.charAt(var8);
                           continue label52;
                        }

                        var2 = "¢ú\u009e¸\u00899öÌï\n\u0095*^y,\u008c)\u0017.à";
                        var4 = "¢ú\u009e¸\u00899öÌï\n\u0095*^y,\u008c)\u0017.à".length();
                        var1 = '\t';
                        var8 = -1;
                  }

                  var10000 = 56;
                  var10001 = var2.substring(++var8, var8 + var1);
                  var10002 = 0;
               }
            }
         }
}

         private static String a(int var0, int var1) { char var10002 = '\0'; // PX-FIX hoist
        
            int var2 = (var0 ^ -30204) & 65535;
            if (b[var2] == null) {
               char[] var3 = a[var2].toCharArray();

               short var4 = switch (var3[0] & 0xFF) {
                  case 0 -> 98;
                  case 1 -> 28;
                  case 2 -> 56;
                  case 3 -> 245;
                  case 4 -> 17;
                  case 5 -> 189;
                  case 6 -> 166;
                  case 7 -> 96;
                  case 8 -> 224;
                  case 9 -> 117;
                  case 10 -> 156;
                  case 11 -> 238;
                  case 12 -> 221;
                  case 13 -> 170;
                  case 14 -> 249;
                  case 15 -> 76;
                  case 16 -> 8;
                  case 17 -> 237;
                  case 18 -> 191;
                  case 19 -> 186;
                  case 20 -> 146;
                  case 21 -> 12;
                  case 22 -> 187;
                  case 23 -> 39;
                  case 24 -> 99;
                  case 25 -> 196;
                  case 26 -> 11;
                  case 27 -> 226;
                  case 28 -> 201;
                  case 29 -> 77;
                  case 30 -> 179;
                  case 31 -> 252;
                  case 32 -> 107;
                  case 33 -> 135;
                  case 34 -> 55;
                  case 35 -> 236;
                  case 36 -> 51;
                  case 37 -> 4;
                  case 38 -> 246;
                  case 39 -> 94;
                  case 40 -> 255;
                  case 41 -> 1;
                  case 42 -> 132;
                  case 43 -> 235;
                  case 44 -> 59;
                  case 45 -> 20;
                  case 46 -> 209;
                  case 47 -> 173;
                  case 48 -> 69;
                  case 49 -> 116;
                  case 50 -> 41;
                  case 51 -> 53;
                  case 52 -> 38;
                  case 53 -> 85;
                  case 54 -> 141;
                  case 55 -> 185;
                  case 56 -> 137;
                  case 57 -> 227;
                  case 58 -> 223;
                  case 59 -> 2;
                  case 60 -> 10;
                  case 61 -> 60;
                  case 62 -> 92;
                  case 63 -> 66;
                  case 64 -> 167;
                  case 65 -> 234;
                  case 66 -> 200;
                  case 67 -> 244;
                  case 68 -> 136;
                  case 69 -> 21;
                  case 70 -> 217;
                  case 71 -> 30;
                  case 72 -> 159;
                  case 73 -> 57;
                  case 74 -> 27;
                  case 75 -> 188;
                  case 76 -> 153;
                  case 77 -> 150;
                  case 78 -> 125;
                  case 79 -> 219;
                  case 80 -> 206;
                  case 81 -> 148;
                  case 82 -> 142;
                  case 83 -> 36;
                  case 84 -> 128;
                  case 85 -> 158;
                  case 86 -> 182;
                  case 87 -> 144;
                  case 88 -> 163;
                  case 89 -> 50;
                  case 90 -> 112;
                  case 91 -> 229;
                  case 92 -> 157;
                  case 93 -> 172;
                  case 94 -> 233;
                  case 95 -> 164;
                  case 96 -> 90;
                  case 97 -> 178;
                  case 98 -> 231;
                  case 99 -> 152;
                  case 100 -> 72;
                  case 101 -> 52;
                  case 102 -> 111;
                  case 103 -> 130;
                  case 104 -> 64;
                  case 105 -> 239;
                  case 106 -> 195;
                  case 107 -> 127;
                  case 108 -> 193;
                  case 109 -> 105;
                  case 110 -> 58;
                  case 111 -> 216;
                  case 112 -> 225;
                  case 113 -> 138;
                  case 114 -> 215;
                  case 115 -> 177;
                  case 116 -> 161;
                  case 117 -> 124;
                  case 118 -> 25;
                  case 119 -> 168;
                  case 120 -> 147;
                  case 121 -> 62;
                  case 122 -> 15;
                  case 123 -> 151;
                  case 124 -> 49;
                  case 125 -> 44;
                  case 126 -> 242;
                  case 127 -> 48;
                  case 128 -> 93;
                  case 129 -> 230;
                  case 130 -> 80;
                  case 131 -> 134;
                  case 132 -> 29;
                  case 133 -> 26;
                  case 134 -> 183;
                  case 135 -> 75;
                  case 136 -> 194;
                  case 137 -> 181;
                  case 138 -> 89;
                  case 139 -> 180;
                  case 140 -> 82;
                  case 141 -> 102;
                  case 142 -> 88;
                  case 143 -> 253;
                  case 144 -> 211;
                  case 145 -> 121;
                  case 146 -> 243;
                  case 147 -> 22;
                  case 148 -> 6;
                  case 149 -> 95;
                  case 150 -> 220;
                  case 151 -> 5;
                  case 152 -> 114;
                  case 153 -> 213;
                  case 154 -> 154;
                  case 155 -> 241;
                  case 156 -> 207;
                  case 157 -> 97;
                  case 158 -> 139;
                  case 159 -> 202;
                  case 160 -> 86;
                  case 161 -> 67;
                  case 162 -> 169;
                  case 163 -> 101;
                  case 164 -> 254;
                  case 165 -> 133;
                  case 166 -> 13;
                  case 167 -> 198;
                  case 168 -> 122;
                  case 169 -> 203;
                  case 170 -> 192;
                  case 171 -> 123;
                  case 172 -> 115;
                  case 173 -> 248;
                  case 174 -> 222;
                  case 175 -> 218;
                  case 176 -> 23;
                  case 177 -> 70;
                  case 178 -> 110;
                  case 179 -> 171;
                  case 180 -> 250;
                  case 181 -> 210;
                  case 182 -> 65;
                  case 183 -> 46;
                  case 184 -> 78;
                  case 185 -> 109;
                  case 186 -> 174;
                  case 187 -> 0;
                  case 188 -> 31;
                  case 189 -> 119;
                  case 190 -> 19;
                  case 191 -> 103;
                  case 192 -> 83;
                  case 193 -> 145;
                  case 194 -> 3;
                  case 195 -> 113;
                  case 196 -> 40;
                  case 197 -> 162;
                  case 198 -> 212;
                  case 199 -> 37;
                  case 200 -> 74;
                  case 201 -> 100;
                  case 202 -> 81;
                  case 203 -> 106;
                  case 204 -> 108;
                  case 205 -> 68;
                  case 206 -> 79;
                  case 207 -> 214;
                  case 208 -> 24;
                  case 209 -> 175;
                  case 210 -> 228;
                  case 211 -> 16;
                  case 212 -> 184;
                  case 213 -> 143;
                  case 214 -> 7;
                  case 215 -> 232;
                  case 216 -> 71;
                  case 217 -> 120;
                  case 218 -> 140;
                  case 219 -> 32;
                  case 220 -> 104;
                  case 221 -> 199;
                  case 222 -> 131;
                  case 223 -> 197;
                  case 224 -> 91;
                  case 225 -> 165;
                  case 226 -> 118;
                  case 227 -> 160;
                  case 228 -> 73;
                  case 229 -> 45;
                  case 230 -> 240;
                  case 231 -> 247;
                  case 232 -> 190;
                  case 233 -> 47;
                  case 234 -> 61;
                  case 235 -> 251;
                  case 236 -> 14;
                  case 237 -> 155;
                  case 238 -> 208;
                  case 239 -> 149;
                  case 240 -> 43;
                  case 241 -> 84;
                  case 242 -> 63;
                  case 243 -> 35;
                  case 244 -> 33;
                  case 245 -> 34;
                  case 246 -> 129;
                  case 247 -> 87;
                  case 248 -> 54;
                  case 249 -> 176;
                  case 250 -> 9;
                  case 251 -> 42;
                  case 252 -> 126;
                  case 253 -> 204;
                  case 254 -> 205;
                  default -> 18;
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
                   var10002 = var3[var7];
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

      public static final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll
         extends llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.PXEvMid {
         @NotNull
         private final String lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         @NotNull
         private final String IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         @NotNull
         private final llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         private static String[] a;
         private static String[] b;

         public IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
            @NotNull IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var1,
            @NotNull llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var2,
            @NotNull String var3,
            @NotNull String var4
         ) { short var10002 = (short)0; // PX-FIX hoist
        
            short var10001 = -17138;
             var10002 = 18052;
            Intrinsics.checkNotNullParameter(var1, "macro");
            var10001 = -17137;
            var10002 = -9591;
            Intrinsics.checkNotNullParameter(var2, "editor");
            var10001 = -17139;
            var10002 = -5248;
            Intrinsics.checkNotNullParameter(var3, "folderName");
            var10001 = -17144;
            var10002 = 4342;
            Intrinsics.checkNotNullParameter(var4, "fileName");
            super(var1, var2, null);
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var3;
            this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var4;
            this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI(
               var2.b()
            );
         }

         @NotNull
         public final String e() {
            return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         @NotNull
         public final String f() {
            return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         }

         @NotNull
         @Override
         public String c() { short var10003 = (short)0; // PX-FIX hoist
         short var10002 = (short)0; // PX-FIX hoist
        
             var10002 = -17140;
             var10003 = -22874;
            return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
               + " / "
               + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         }

         @NotNull
         @Override
         public List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> d() { IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var10003 = null; // PX-FIX hoist
         BlockPos var10002 = null; // PX-FIX hoist
        
      Collection var13 = null; // PX-FIX
            int var1 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.k();
            if (var1 == 0) {
               IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll var10000 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a(
                     this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
                     this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                  );
               if (var10000 != null) {
                  IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll var2 = var10000;
                  Iterable var3 = var2.a();
                  boolean var4 = false;
                  Collection var6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var3, 10));
                  boolean var7 = false;
                  Iterator var8 = var3.iterator();

                  while (true) {
                     if (var8.hasNext()) {
                        Object var9 = var8.next();
                        var13 = var6;
                        IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl var10 = (IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl)var9;
                        if (var1 != 0) {
                           break;
                        }

                        boolean var11 = false;
                        if (var1 == 0) {
                            BlockPos pos = var10.e();
                            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI type =
                               IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                  .a(var10.d());
                            if (type == null) {
                               type = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
                            }
                            var6.add(new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(pos, type));
                        }

                        if (var1 == 0) {
                           continue;
                        }
                     }

                     var13 = var6;
                     break;
                  }

                  return (List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll>)var13;
               }
            }

            return CollectionsKt.emptyList();
         }

         @Override
         public void a(@NotNull List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> var1) { short var10003 = (short)0; // PX-FIX hoist
         short var10002 = (short)0; // PX-FIX hoist
        
      Collection var20 = null; // PX-FIX
            int var10000 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.j();
             var10002 = -17143;
             var10003 = -26487;
            Intrinsics.checkNotNullParameter(var1, "waypoints");
            int var2 = var10000;
            Iterable var4 = var1;
            boolean var5 = false;
            Collection var7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var4, 10));
            boolean var8 = false;
            Iterator var9 = var4.iterator();

            while (true) {
               if (var9.hasNext()) {
                  Object var10 = var9.next();
                  var20 = var7;
                  IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var11 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var10;
                  if (var2 == 0) {
                     break;
                  }

                  boolean var12 = false;
                  var7.add(
                     IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(var11.a(), var11.b().a())
                  );
                  if (var2 != 0) {
                     continue;
                  }
               }

               var20 = var7;
               break;
            }

            List var21 = (List)var20;
            Object var14 = null;
            byte var15 = 14;
            Object var16 = null;
            Object var17 = null;
            Object var18 = null;
            List var19 = var21;
            IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll var3 = new IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll(
               var19,
               (String)var18,
               (IIIllIlIIlIllIlIlllIlIllIIllIIlIlIllIlIlllIlIlIllIIIIIlIlIllllIlIlIIIIIIlIIIIllllIllI)var17,
               (lIIIllIlllIlIIIlIIlIIlIIlIlIlIIllIlIlllIIlIlllllIllllIIIllllllIIllllIIIIIIIlIlIllIlll)var16,
               var15,
               (DefaultConstructorMarker)var14
            );
            this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a(
                  this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
                  this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
                  var3
               );
         }

         // $VF: Irreducible bytecode was duplicated to produce valid code
         static { byte var10002 = (byte)0; // PX-FIX hoist
        
      char[] var20 = null; // PX-FIX
   pxClinit: {
            String[] var5 = new String[6];
            int var3 = 0;
            String var2 = "j½xÙ\u0011M4¦\u009d\u000f\u0003f(;\u0006± e\u0000\u001dd\u0005ÏÀ©¯Ï";
            int var4 = "j½xÙ\u0011M4¦\u009d\u000f\u0003f(;\u0006± e\u0000\u001dd\u0005ÏÀ©¯Ï".length();
            char var1 = '\n';
            int var8 = -1;

            label52:
            while (true) {
               byte var10000 = 82;
               String var10001 = var2.substring(++var8, var8 + var1);
                var10002 = -1;

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
                           case 0 -> 36;
                           case 1 -> 101;
                           case 2 -> 111;
                           case 3 -> 60;
                           case 4 -> 111;
                           case 5 -> 115;
                           default -> 100;
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
                           break pxClinit;
                        }

                        var1 = var2.charAt(var8);
                        break;
                     default:
                        var5[var3++] = var29;
                        if ((var8 += var1) < var4) {
                           var1 = var2.charAt(var8);
                           continue label52;
                        }

                        var2 = "\u0097÷£\t\u0095\u0098\u008d3Ò\bÄ¬ï~\u008aÉh\u0001";
                        var4 = "\u0097÷£\t\u0095\u0098\u008d3Ò\bÄ¬ï~\u008aÉh\u0001".length();
                        var1 = '\t';
                        var8 = -1;
                  }

                  var10000 = 80;
                  var10001 = var2.substring(++var8, var8 + var1);
                  var10002 = 0;
               }
            }
         }
}

         private static String a(int var0, int var1) { char var10002 = '\0'; // PX-FIX hoist
        
            int var2 = (var0 ^ -17139) & 65535;
            if (b[var2] == null) {
               char[] var3 = a[var2].toCharArray();

               short var4 = switch (var3[0] & 0xFF) {
                  case 0 -> 103;
                  case 1 -> 157;
                  case 2 -> 121;
                  case 3 -> 230;
                  case 4 -> 8;
                  case 5 -> 35;
                  case 6 -> 233;
                  case 7 -> 134;
                  case 8 -> 38;
                  case 9 -> 139;
                  case 10 -> 218;
                  case 11 -> 255;
                  case 12 -> 116;
                  case 13 -> 148;
                  case 14 -> 45;
                  case 15 -> 204;
                  case 16 -> 118;
                  case 17 -> 9;
                  case 18 -> 213;
                  case 19 -> 115;
                  case 20 -> 125;
                  case 21 -> 29;
                  case 22 -> 13;
                  case 23 -> 225;
                  case 24 -> 47;
                  case 25 -> 65;
                  case 26 -> 250;
                  case 27 -> 205;
                  case 28 -> 6;
                  case 29 -> 15;
                  case 30 -> 114;
                  case 31 -> 10;
                  case 32 -> 189;
                  case 33 -> 69;
                  case 34 -> 200;
                  case 35 -> 11;
                  case 36 -> 43;
                  case 37 -> 99;
                  case 38 -> 61;
                  case 39 -> 72;
                  case 40 -> 34;
                  case 41 -> 22;
                  case 42 -> 156;
                  case 43 -> 158;
                  case 44 -> 217;
                  case 45 -> 1;
                  case 46 -> 152;
                  case 47 -> 101;
                  case 48 -> 143;
                  case 49 -> 131;
                  case 50 -> 44;
                  case 51 -> 238;
                  case 52 -> 168;
                  case 53 -> 107;
                  case 54 -> 170;
                  case 55 -> 122;
                  case 56 -> 206;
                  case 57 -> 190;
                  case 58 -> 33;
                  case 59 -> 63;
                  case 60 -> 18;
                  case 61 -> 196;
                  case 62 -> 123;
                  case 63 -> 60;
                  case 64 -> 201;
                  case 65 -> 154;
                  case 66 -> 212;
                  case 67 -> 136;
                  case 68 -> 197;
                  case 69 -> 142;
                  case 70 -> 140;
                  case 71 -> 40;
                  case 72 -> 128;
                  case 73 -> 56;
                  case 74 -> 46;
                  case 75 -> 155;
                  case 76 -> 106;
                  case 77 -> 94;
                  case 78 -> 199;
                  case 79 -> 0;
                  case 80 -> 92;
                  case 81 -> 119;
                  case 82 -> 70;
                  case 83 -> 17;
                  case 84 -> 216;
                  case 85 -> 173;
                  case 86 -> 184;
                  case 87 -> 165;
                  case 88 -> 39;
                  case 89 -> 104;
                  case 90 -> 19;
                  case 91 -> 54;
                  case 92 -> 25;
                  case 93 -> 71;
                  case 94 -> 77;
                  case 95 -> 81;
                  case 96 -> 149;
                  case 97 -> 243;
                  case 98 -> 68;
                  case 99 -> 227;
                  case 100 -> 84;
                  case 101 -> 50;
                  case 102 -> 248;
                  case 103 -> 234;
                  case 104 -> 202;
                  case 105 -> 223;
                  case 106 -> 188;
                  case 107 -> 211;
                  case 108 -> 164;
                  case 109 -> 96;
                  case 110 -> 124;
                  case 111 -> 20;
                  case 112 -> 49;
                  case 113 -> 91;
                  case 114 -> 95;
                  case 115 -> 105;
                  case 116 -> 27;
                  case 117 -> 171;
                  case 118 -> 174;
                  case 119 -> 85;
                  case 120 -> 97;
                  case 121 -> 151;
                  case 122 -> 144;
                  case 123 -> 21;
                  case 124 -> 62;
                  case 125 -> 228;
                  case 126 -> 220;
                  case 127 -> 198;
                  case 128 -> 67;
                  case 129 -> 3;
                  case 130 -> 162;
                  case 131 -> 133;
                  case 132 -> 244;
                  case 133 -> 181;
                  case 134 -> 219;
                  case 135 -> 14;
                  case 136 -> 26;
                  case 137 -> 112;
                  case 138 -> 120;
                  case 139 -> 239;
                  case 140 -> 193;
                  case 141 -> 215;
                  case 142 -> 224;
                  case 143 -> 12;
                  case 144 -> 208;
                  case 145 -> 214;
                  case 146 -> 78;
                  case 147 -> 132;
                  case 148 -> 229;
                  case 149 -> 203;
                  case 150 -> 179;
                  case 151 -> 207;
                  case 152 -> 138;
                  case 153 -> 41;
                  case 154 -> 5;
                  case 155 -> 147;
                  case 156 -> 175;
                  case 157 -> 2;
                  case 158 -> 183;
                  case 159 -> 127;
                  case 160 -> 79;
                  case 161 -> 192;
                  case 162 -> 75;
                  case 163 -> 247;
                  case 164 -> 150;
                  case 165 -> 241;
                  case 166 -> 182;
                  case 167 -> 226;
                  case 168 -> 153;
                  case 169 -> 191;
                  case 170 -> 102;
                  case 171 -> 42;
                  case 172 -> 209;
                  case 173 -> 161;
                  case 174 -> 240;
                  case 175 -> 16;
                  case 176 -> 32;
                  case 177 -> 126;
                  case 178 -> 195;
                  case 179 -> 24;
                  case 180 -> 58;
                  case 181 -> 249;
                  case 182 -> 242;
                  case 183 -> 180;
                  case 184 -> 31;
                  case 185 -> 176;
                  case 186 -> 166;
                  case 187 -> 36;
                  case 188 -> 246;
                  case 189 -> 87;
                  case 190 -> 129;
                  case 191 -> 4;
                  case 192 -> 177;
                  case 193 -> 83;
                  case 194 -> 57;
                  case 195 -> 23;
                  case 196 -> 186;
                  case 197 -> 113;
                  case 198 -> 74;
                  case 199 -> 231;
                  case 200 -> 232;
                  case 201 -> 88;
                  case 202 -> 236;
                  case 203 -> 146;
                  case 204 -> 111;
                  case 205 -> 117;
                  case 206 -> 254;
                  case 207 -> 93;
                  case 208 -> 76;
                  case 209 -> 109;
                  case 210 -> 86;
                  case 211 -> 48;
                  case 212 -> 7;
                  case 213 -> 137;
                  case 214 -> 80;
                  case 215 -> 167;
                  case 216 -> 53;
                  case 217 -> 135;
                  case 218 -> 163;
                  case 219 -> 185;
                  case 220 -> 28;
                  case 221 -> 159;
                  case 222 -> 37;
                  case 223 -> 251;
                  case 224 -> 235;
                  case 225 -> 221;
                  case 226 -> 110;
                  case 227 -> 245;
                  case 228 -> 222;
                  case 229 -> 98;
                  case 230 -> 210;
                  case 231 -> 172;
                  case 232 -> 253;
                  case 233 -> 66;
                  case 234 -> 64;
                  case 235 -> 52;
                  case 236 -> 237;
                  case 237 -> 55;
                  case 238 -> 100;
                  case 239 -> 141;
                  case 240 -> 108;
                  case 241 -> 90;
                  case 242 -> 169;
                  case 243 -> 73;
                  case 244 -> 178;
                  case 245 -> 160;
                  case 246 -> 82;
                  case 247 -> 194;
                  case 248 -> 252;
                  case 249 -> 89;
                  case 250 -> 130;
                  case 251 -> 51;
                  case 252 -> 187;
                  case 253 -> 30;
                  case 254 -> 59;
                  default -> 145;
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
                   var10002 = var3[var7];
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

      public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
         extends llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.PXEvMid {
         @NotNull
         private final String lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         @NotNull
         private final llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
          public static int[] IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         private static String[] a;
         private static String[] b;

         public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            @NotNull IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var1,
            @NotNull llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var2,
            @NotNull String var3
         ) { short var10002 = (short)0; // PX-FIX hoist
        
            short var10001 = -13471;
             var10002 = 120;
            Intrinsics.checkNotNullParameter(var1, "macro");
            var10001 = -13472;
            var10002 = 27363;
            Intrinsics.checkNotNullParameter(var2, "editor");
            var10001 = -13470;
            var10002 = 17644;
            Intrinsics.checkNotNullParameter(var3, "routeName");
            super(var1, var2, null);
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var3;
            this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI(
               var2.b()
            );
         }

         @NotNull
         public final String e() {
            return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         @NotNull
         @Override
         public String c() {
            return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         @NotNull
         @Override
         public List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> d() { IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var10003 = null; // PX-FIX hoist
         BlockPos var10002 = null; // PX-FIX hoist
        
      Collection var13 = null; // PX-FIX
            int var1 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.j();
            if (var1 != 0) {
               IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll var10000 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                  .a(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
               if (var10000 != null) {
                  IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll var2 = var10000;
                  Iterable var3 = var2.a();
                  boolean var4 = false;
                  Collection var6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var3, 10));
                  boolean var7 = false;
                  Iterator var8 = var3.iterator();

                  while (true) {
                     if (var8.hasNext()) {
                        Object var9 = var8.next();
                        var13 = var6;
                        IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl var10 = (IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl)var9;
                        if (var1 == 0) {
                           break;
                        }

                        boolean var11 = false;
                        if (var1 != 0) {
                            BlockPos pos = var10.e();
                            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI type =
                               IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                  .a(var10.d());
                            if (type == null) {
                               type = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
                            }
                            var6.add(new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(pos, type));
                        }

                        if (var1 != 0) {
                           continue;
                        }
                     }

                     var13 = var6;
                     break;
                  }

                  return (List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll>)var13;
               }
            }

            return CollectionsKt.emptyList();
         }

         @Override
         public void a(@NotNull List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> var1) { short var10002 = (short)0; // PX-FIX hoist
        
      Collection var20 = null; // PX-FIX
            short var10001 = -13469;
             var10002 = -15336;
            Intrinsics.checkNotNullParameter(var1, "waypoints");
            Iterable var4 = var1;
            boolean var5 = false;
            int var10000 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.j();
            Collection var7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var4, 10));
            boolean var8 = false;
            int var2 = var10000;
            Iterator var9 = var4.iterator();

            while (true) {
               if (var9.hasNext()) {
                  Object var10 = var9.next();
                  var20 = var7;
                  IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var11 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var10;
                  if (var2 == 0) {
                     break;
                  }

                  boolean var12 = false;
                  var7.add(
                     IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(var11.a(), var11.b().a())
                  );
                  if (var2 != 0) {
                     continue;
                  }
               }

               var20 = var7;
               break;
            }

            List var21 = (List)var20;
            Object var14 = null;
            byte var15 = 14;
            Object var16 = null;
            Object var17 = null;
            Object var18 = null;
            List var19 = var21;
            IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll var3 = new IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll(
               var19,
               (String)var18,
               (IIIllIlIIlIllIlIlllIlIllIIllIIlIlIllIlIlllIlIlIllIIIIIlIlIllllIlIlIIIIIIlIIIIllllIllI)var17,
               (lIIIllIlllIlIIIlIIlIIlIIlIlIlIIllIlIlllIIlIlllllIllllIIIllllllIIllllIIIIIIIlIlIllIlll)var16,
               var15,
               (DefaultConstructorMarker)var14
            );
            this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
               .a(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, var3);
         }

         // $VF: Irreducible bytecode was duplicated to produce valid code
         static { byte var10002 = (byte)0; // PX-FIX hoist
            int[] switchMap = new int[llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.values().length];
            try {
               switchMap[llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.ordinal()] = 1;
            } catch (NoSuchFieldError ignored) {
            }
            try {
               switchMap[llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.ordinal()] = 2;
            } catch (NoSuchFieldError ignored) {
            }
            try {
               switchMap[llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.ordinal()] = 3;
            } catch (NoSuchFieldError ignored) {
            }
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = switchMap;

      char[] var20 = null; // PX-FIX
   pxClinit: {
            String[] var5 = new String[4];
            int var3 = 0;
            String var2 = "\u0088+Z\u0092Ð\u0083\u0018~Ñ\tï3\u001fZÿ9¹ó\u001d";
            int var4 = "\u0088+Z\u0092Ð\u0083\u0018~Ñ\tï3\u001fZÿ9¹ó\u001d".length();
            char var1 = '\t';
            int var8 = -1;

            label52:
            while (true) {
               byte var10000 = 24;
               String var10001 = var2.substring(++var8, var8 + var1);
                var10002 = -1;

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
                           case 0 -> 102;
                           case 1 -> 127;
                           case 2 -> 124;
                           case 3 -> 62;
                           case 4 -> 54;
                           case 5 -> 26;
                           default -> 51;
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
                           break pxClinit;
                        }

                        var1 = var2.charAt(var8);
                        break;
                     default:
                        var5[var3++] = var29;
                        if ((var8 += var1) < var4) {
                           var1 = var2.charAt(var8);
                           continue label52;
                        }

                        var2 = "@Í?s\u001a\u0006¬-¡Ì\u0082è";
                        var4 = "@Í?s\u001a\u0006¬-¡Ì\u0082è".length();
                        var1 = 5;
                        var8 = -1;
                  }

                  var10000 = 32;
                  var10001 = var2.substring(++var8, var8 + var1);
                  var10002 = 0;
               }
            }
         }
}

         private static String a(int var0, int var1) { char var10002 = '\0'; // PX-FIX hoist
        
            int var2 = (var0 ^ -13469) & 65535;
            if (b[var2] == null) {
               char[] var3 = a[var2].toCharArray();

               short var4 = switch (var3[0] & 0xFF) {
                  case 0 -> 25;
                  case 1 -> 184;
                  case 2 -> 6;
                  case 3 -> 176;
                  case 4 -> 24;
                  case 5 -> 237;
                  case 6 -> 13;
                  case 7 -> 214;
                  case 8 -> 222;
                  case 9 -> 221;
                  case 10 -> 123;
                  case 11 -> 26;
                  case 12 -> 190;
                  case 13 -> 74;
                  case 14 -> 216;
                  case 15 -> 175;
                  case 16 -> 140;
                  case 17 -> 33;
                  case 18 -> 71;
                  case 19 -> 78;
                  case 20 -> 142;
                  case 21 -> 165;
                  case 22 -> 179;
                  case 23 -> 89;
                  case 24 -> 119;
                  case 25 -> 163;
                  case 26 -> 171;
                  case 27 -> 87;
                  case 28 -> 63;
                  case 29 -> 114;
                  case 30 -> 148;
                  case 31 -> 204;
                  case 32 -> 244;
                  case 33 -> 39;
                  case 34 -> 153;
                  case 35 -> 211;
                  case 36 -> 126;
                  case 37 -> 134;
                  case 38 -> 113;
                  case 39 -> 149;
                  case 40 -> 121;
                  case 41 -> 37;
                  case 42 -> 186;
                  case 43 -> 76;
                  case 44 -> 146;
                  case 45 -> 217;
                  case 46 -> 100;
                  case 47 -> 240;
                  case 48 -> 28;
                  case 49 -> 229;
                  case 50 -> 107;
                  case 51 -> 125;
                  case 52 -> 3;
                  case 53 -> 98;
                  case 54 -> 94;
                  case 55 -> 41;
                  case 56 -> 138;
                  case 57 -> 31;
                  case 58 -> 234;
                  case 59 -> 141;
                  case 60 -> 69;
                  case 61 -> 200;
                  case 62 -> 102;
                  case 63 -> 224;
                  case 64 -> 111;
                  case 65 -> 32;
                  case 66 -> 62;
                  case 67 -> 210;
                  case 68 -> 251;
                  case 69 -> 83;
                  case 70 -> 57;
                  case 71 -> 160;
                  case 72 -> 196;
                  case 73 -> 181;
                  case 74 -> 209;
                  case 75 -> 15;
                  case 76 -> 135;
                  case 77 -> 178;
                  case 78 -> 23;
                  case 79 -> 235;
                  case 80 -> 233;
                  case 81 -> 198;
                  case 82 -> 40;
                  case 83 -> 144;
                  case 84 -> 5;
                  case 85 -> 133;
                  case 86 -> 185;
                  case 87 -> 66;
                  case 88 -> 213;
                  case 89 -> 159;
                  case 90 -> 86;
                  case 91 -> 212;
                  case 92 -> 35;
                  case 93 -> 177;
                  case 94 -> 232;
                  case 95 -> 139;
                  case 96 -> 60;
                  case 97 -> 99;
                  case 98 -> 124;
                  case 99 -> 85;
                  case 100 -> 11;
                  case 101 -> 97;
                  case 102 -> 167;
                  case 103 -> 104;
                  case 104 -> 254;
                  case 105 -> 194;
                  case 106 -> 193;
                  case 107 -> 116;
                  case 108 -> 34;
                  case 109 -> 203;
                  case 110 -> 253;
                  case 111 -> 245;
                  case 112 -> 92;
                  case 113 -> 246;
                  case 114 -> 208;
                  case 115 -> 7;
                  case 116 -> 54;
                  case 117 -> 82;
                  case 118 -> 91;
                  case 119 -> 130;
                  case 120 -> 169;
                  case 121 -> 180;
                  case 122 -> 103;
                  case 123 -> 137;
                  case 124 -> 95;
                  case 125 -> 236;
                  case 126 -> 197;
                  case 127 -> 220;
                  case 128 -> 45;
                  case 129 -> 191;
                  case 130 -> 27;
                  case 131 -> 157;
                  case 132 -> 132;
                  case 133 -> 22;
                  case 134 -> 226;
                  case 135 -> 75;
                  case 136 -> 110;
                  case 137 -> 21;
                  case 138 -> 20;
                  case 139 -> 189;
                  case 140 -> 59;
                  case 141 -> 56;
                  case 142 -> 166;
                  case 143 -> 241;
                  case 144 -> 223;
                  case 145 -> 9;
                  case 146 -> 18;
                  case 147 -> 173;
                  case 148 -> 182;
                  case 149 -> 250;
                  case 150 -> 249;
                  case 151 -> 215;
                  case 152 -> 43;
                  case 153 -> 30;
                  case 154 -> 143;
                  case 155 -> 156;
                  case 156 -> 201;
                  case 157 -> 161;
                  case 158 -> 12;
                  case 159 -> 147;
                  case 160 -> 206;
                  case 161 -> 106;
                  case 162 -> 77;
                  case 163 -> 65;
                  case 164 -> 112;
                  case 165 -> 158;
                  case 166 -> 80;
                  case 167 -> 131;
                  case 168 -> 53;
                  case 169 -> 252;
                  case 170 -> 88;
                  case 171 -> 58;
                  case 172 -> 101;
                  case 173 -> 205;
                  case 174 -> 150;
                  case 175 -> 79;
                  case 176 -> 170;
                  case 177 -> 48;
                  case 178 -> 117;
                  case 179 -> 218;
                  case 180 -> 136;
                  case 181 -> 19;
                  case 182 -> 36;
                  case 183 -> 55;
                  case 184 -> 238;
                  case 185 -> 73;
                  case 186 -> 243;
                  case 187 -> 70;
                  case 188 -> 51;
                  case 189 -> 164;
                  case 190 -> 248;
                  case 191 -> 219;
                  case 192 -> 10;
                  case 193 -> 202;
                  case 194 -> 14;
                  case 195 -> 118;
                  case 196 -> 2;
                  case 197 -> 195;
                  case 198 -> 108;
                  case 199 -> 247;
                  case 200 -> 120;
                  case 201 -> 230;
                  case 202 -> 0;
                  case 203 -> 127;
                  case 204 -> 145;
                  case 205 -> 109;
                  case 206 -> 122;
                  case 207 -> 105;
                  case 208 -> 225;
                  case 209 -> 47;
                  case 210 -> 90;
                  case 211 -> 115;
                  case 212 -> 93;
                  case 213 -> 231;
                  case 214 -> 29;
                  case 215 -> 38;
                  case 216 -> 46;
                  case 217 -> 188;
                  case 218 -> 155;
                  case 219 -> 128;
                  case 220 -> 81;
                  case 221 -> 154;
                  case 222 -> 207;
                  case 223 -> 199;
                  case 224 -> 187;
                  case 225 -> 67;
                  case 226 -> 168;
                  case 227 -> 255;
                  case 228 -> 44;
                  case 229 -> 64;
                  case 230 -> 72;
                  case 231 -> 8;
                  case 232 -> 228;
                  case 233 -> 49;
                  case 234 -> 84;
                  case 235 -> 42;
                  case 236 -> 61;
                  case 237 -> 52;
                  case 238 -> 174;
                  case 239 -> 129;
                  case 240 -> 96;
                  case 241 -> 239;
                  case 242 -> 50;
                  case 243 -> 192;
                  case 244 -> 1;
                  case 245 -> 17;
                  case 246 -> 151;
                  case 247 -> 162;
                  case 248 -> 68;
                  case 249 -> 16;
                  case 250 -> 242;
                  case 251 -> 4;
                  case 252 -> 183;
                  case 253 -> 152;
                  case 254 -> 227;
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
                   var10002 = var3[var7];
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

       public static final class llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll {
   
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(Object... px) {
        }

         private static String[] a;
         private static String[] b;

         // PX-FIX jar member (row8): Kotlin synthetic ctor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
         public llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(kotlin.jvm.internal.DefaultConstructorMarker var1) {
            this();
         }

         private llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll() {
         }

         @Nullable
         public final llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.PXEvMid a(
            @NotNull IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var1,
            @NotNull llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var2,
            @NotNull String var3
         ) { short var10003 = (short)0; // PX-FIX hoist
         short var10002 = (short)0; // PX-FIX hoist
        
      Object var14 = null; // PX-FIX
      Object var13 = null; // PX-FIX
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
            int var10000 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.j();
             var10002 = 25894;
             var10003 = -20305;
            Intrinsics.checkNotNullParameter(var1, "macro");
            int var4 = var10000;

            try {
               short var10001 = 25893;
               var10002 = 11231;
               Intrinsics.checkNotNullParameter(var2, "editor");
               var10001 = 25895;
               var10002 = -6218;
               Intrinsics.checkNotNullParameter(var3, "routeName");
                switch (llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl[var2.g()
                  .ordinal()]) {
                  case 1:
                     return new llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                        var1, var2, var3
                     );
                  case 2:
                     break;
                  case 3:
                     return null;
                  default:
                     throw new NoWhenBranchMatchedException();
               }
            } catch (NoWhenBranchMatchedException var11) {
               throw (RuntimeException)a(var11);
            }

            label69: {
               label68: {
                  try {
                     var13 = var2.i().isEmpty();
                     if (var4 == 0) {
                        break label69;
                     }

                     if (!((Boolean)var13)) {
                        break label68;
                     }
                  } catch (NoWhenBranchMatchedException var10) {
                     throw (RuntimeException)a(var10);
                  }

                  var13 = false;
                  break label69;
               }

               var13 = true;
            }

            try {
               if (((Boolean)(var13))) {
                  return new llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.PXEvMid.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
                     var1, var2, var3
                  );
               }
            } catch (NoWhenBranchMatchedException var7) {
               throw (RuntimeException)a(var7);
            }

            label59: {
               label58: {
                  try {
                     var14 = var2.h().isEmpty();
                     if (var4 == 0) {
                        break label59;
                     }

                     if (!((Boolean)var14)) {
                        break label58;
                     }
                  } catch (NoWhenBranchMatchedException var9) {
                     throw (RuntimeException)a(var9);
                  }

                  var14 = false;
                  break label59;
               }

               var14 = true;
            }

            if (((Boolean)(var14))) {
               CharSequence var15 = var3;
               char[] var6 = new char[]{'/'};
               List var5 = (StringsKt.split(var15, var6, false, 0));

               try {
                  if (var5.size() != 2) {
                     return null;
                  }
               } catch (NoWhenBranchMatchedException var8) {
                  throw (RuntimeException)a(var8);
               }

               return new llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.PXEvMid.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
                  var1, var2, (String)var5.get(0), (String)var5.get(1)
               );
            } else {
               return null;
            }
         }

         private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
            return var0;
         }

         // $VF: Irreducible bytecode was duplicated to produce valid code
         static { char[] var10003 = null; // PX-FIX hoist
        
   pxClinit: {
            String[] var5 = new String[3];
            int var3 = 0;
            String var2 = "Nº\u0014Å¸uá\u0001\u008a\u0005Zi|vk\u0006Ö]îSr\u009b";
            int var4 = "Nº\u0014Å¸uá\u0001\u008a\u0005Zi|vk\u0006Ö]îSr\u009b".length();
            char var1 = '\t';
            int var0 = -1;

            while (true) {
               char[] var10002;
               label38: {
                   var10003 = var2.substring(++var0, var0 + var1).toCharArray();
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
                        case 0 -> 50;
                        case 1 -> 12;
                        case 2 -> 9;
                        case 3 -> 62;
                        case 4 -> 126;
                        case 5 -> 101;
                        default -> 74;
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

         private static String a(int var0, int var1) { char var10002 = '\0'; // PX-FIX hoist
        
            int var2 = (var0 ^ 25895) & 65535;
            if (b[var2] == null) {
               char[] var3 = a[var2].toCharArray();

               short var4 = switch (var3[0] & 0xFF) {
                  case 0 -> 166;
                  case 1 -> 70;
                  case 2 -> 137;
                  case 3 -> 200;
                  case 4 -> 168;
                  case 5 -> 220;
                  case 6 -> 167;
                  case 7 -> 43;
                  case 8 -> 54;
                  case 9 -> 59;
                  case 10 -> 100;
                  case 11 -> 173;
                  case 12 -> 52;
                  case 13 -> 8;
                  case 14 -> 228;
                  case 15 -> 65;
                  case 16 -> 159;
                  case 17 -> 211;
                  case 18 -> 162;
                  case 19 -> 192;
                  case 20 -> 135;
                  case 21 -> 243;
                  case 22 -> 237;
                  case 23 -> 44;
                  case 24 -> 119;
                  case 25 -> 60;
                  case 26 -> 46;
                  case 27 -> 126;
                  case 28 -> 51;
                  case 29 -> 63;
                  case 30 -> 104;
                  case 31 -> 91;
                  case 32 -> 69;
                  case 33 -> 24;
                  case 34 -> 87;
                  case 35 -> 191;
                  case 36 -> 234;
                  case 37 -> 17;
                  case 38 -> 205;
                  case 39 -> 153;
                  case 40 -> 214;
                  case 41 -> 146;
                  case 42 -> 30;
                  case 43 -> 84;
                  case 44 -> 225;
                  case 45 -> 201;
                  case 46 -> 117;
                  case 47 -> 5;
                  case 48 -> 248;
                  case 49 -> 134;
                  case 50 -> 72;
                  case 51 -> 144;
                  case 52 -> 232;
                  case 53 -> 171;
                  case 54 -> 48;
                  case 55 -> 127;
                  case 56 -> 3;
                  case 57 -> 155;
                  case 58 -> 151;
                  case 59 -> 229;
                  case 60 -> 47;
                  case 61 -> 12;
                  case 62 -> 161;
                  case 63 -> 40;
                  case 64 -> 176;
                  case 65 -> 81;
                  case 66 -> 188;
                  case 67 -> 109;
                  case 68 -> 49;
                  case 69 -> 216;
                  case 70 -> 190;
                  case 71 -> 219;
                  case 72 -> 128;
                  case 73 -> 23;
                  case 74 -> 25;
                  case 75 -> 113;
                  case 76 -> 64;
                  case 77 -> 239;
                  case 78 -> 96;
                  case 79 -> 101;
                  case 80 -> 249;
                  case 81 -> 42;
                  case 82 -> 152;
                  case 83 -> 6;
                  case 84 -> 186;
                  case 85 -> 254;
                  case 86 -> 28;
                  case 87 -> 182;
                  case 88 -> 148;
                  case 89 -> 187;
                  case 90 -> 115;
                  case 91 -> 95;
                  case 92 -> 255;
                  case 93 -> 170;
                  case 94 -> 149;
                  case 95 -> 131;
                  case 96 -> 41;
                  case 97 -> 195;
                  case 98 -> 253;
                  case 99 -> 18;
                  case 100 -> 78;
                  case 101 -> 194;
                  case 102 -> 114;
                  case 103 -> 158;
                  case 104 -> 90;
                  case 105 -> 169;
                  case 106 -> 142;
                  case 107 -> 212;
                  case 108 -> 111;
                  case 109 -> 83;
                  case 110 -> 204;
                  case 111 -> 26;
                  case 112 -> 21;
                  case 113 -> 73;
                  case 114 -> 218;
                  case 115 -> 138;
                  case 116 -> 93;
                  case 117 -> 203;
                  case 118 -> 55;
                  case 119 -> 132;
                  case 120 -> 215;
                  case 121 -> 236;
                  case 122 -> 252;
                  case 123 -> 185;
                  case 124 -> 85;
                  case 125 -> 178;
                  case 126 -> 14;
                  case 127 -> 94;
                  case 128 -> 31;
                  case 129 -> 177;
                  case 130 -> 105;
                  case 131 -> 20;
                  case 132 -> 122;
                  case 133 -> 29;
                  case 134 -> 33;
                  case 135 -> 11;
                  case 136 -> 231;
                  case 137 -> 67;
                  case 138 -> 50;
                  case 139 -> 181;
                  case 140 -> 133;
                  case 141 -> 89;
                  case 142 -> 32;
                  case 143 -> 99;
                  case 144 -> 124;
                  case 145 -> 235;
                  case 146 -> 74;
                  case 147 -> 107;
                  case 148 -> 120;
                  case 149 -> 4;
                  case 150 -> 22;
                  case 151 -> 45;
                  case 152 -> 163;
                  case 153 -> 112;
                  case 154 -> 193;
                  case 155 -> 57;
                  case 156 -> 27;
                  case 157 -> 16;
                  case 158 -> 61;
                  case 159 -> 160;
                  case 160 -> 175;
                  case 161 -> 139;
                  case 162 -> 39;
                  case 163 -> 7;
                  case 164 -> 76;
                  case 165 -> 250;
                  case 166 -> 86;
                  case 167 -> 125;
                  case 168 -> 136;
                  case 169 -> 157;
                  case 170 -> 184;
                  case 171 -> 71;
                  case 172 -> 150;
                  case 173 -> 172;
                  case 174 -> 103;
                  case 175 -> 174;
                  case 176 -> 116;
                  case 177 -> 202;
                  case 178 -> 2;
                  case 179 -> 206;
                  case 180 -> 123;
                  case 181 -> 129;
                  case 182 -> 198;
                  case 183 -> 98;
                  case 184 -> 77;
                  case 185 -> 247;
                  case 186 -> 179;
                  case 187 -> 183;
                  case 188 -> 141;
                  case 189 -> 37;
                  case 190 -> 145;
                  case 191 -> 210;
                  case 192 -> 199;
                  case 193 -> 92;
                  case 194 -> 143;
                  case 195 -> 34;
                  case 196 -> 147;
                  case 197 -> 75;
                  case 198 -> 238;
                  case 199 -> 79;
                  case 200 -> 165;
                  case 201 -> 154;
                  case 202 -> 224;
                  case 203 -> 233;
                  case 204 -> 88;
                  case 205 -> 246;
                  case 206 -> 227;
                  case 207 -> 38;
                  case 208 -> 244;
                  case 209 -> 223;
                  case 210 -> 118;
                  case 211 -> 164;
                  case 212 -> 130;
                  case 213 -> 106;
                  case 214 -> 108;
                  case 215 -> 1;
                  case 216 -> 156;
                  case 217 -> 209;
                  case 218 -> 13;
                  case 219 -> 56;
                  case 220 -> 58;
                  case 221 -> 230;
                  case 222 -> 221;
                  case 223 -> 10;
                  case 224 -> 208;
                  case 225 -> 15;
                  case 226 -> 207;
                  case 227 -> 80;
                  case 228 -> 140;
                  case 229 -> 222;
                  case 230 -> 180;
                  case 231 -> 36;
                  case 232 -> 197;
                  case 233 -> 53;
                  case 234 -> 68;
                  case 235 -> 35;
                  case 236 -> 242;
                  case 237 -> 19;
                  case 238 -> 110;
                  case 239 -> 226;
                  case 240 -> 245;
                  case 241 -> 189;
                  case 242 -> 66;
                  case 243 -> 97;
                  case 244 -> 240;
                  case 245 -> 251;
                  case 246 -> 196;
                  case 247 -> 217;
                  case 248 -> 241;
                  case 249 -> 121;
                  case 250 -> 62;
                  case 251 -> 102;
                  case 252 -> 213;
                  case 253 -> 82;
                  case 254 -> 9;
                  default -> 0;
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
                   var10002 = var3[var7];
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
      // ===== PX-FIX begin: convention (b) N3 alias (agent B2) =====
      static interface PXWhenMappings {
         int[] IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = java.util.Arrays.copyOf(new int[]{3, 2, 1}, me.octo.client.llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a().length);
      }
      // ===== PX-FIX end: convention (b) N3 alias (agent B2) =====
      }
   }
   // ===== PX-FIX begin: convention (b) nested-inline recovery (agent B2) =====

   static interface IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      int[] IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = java.util.Arrays.copyOf(new int[]{3, 2, 1}, me.octo.client.llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a().length);
   }

   public static final class drawInfoHud$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] a;
      private static String[] b;

      public drawInfoHud$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(String var1, String var2) {
         Intrinsics.checkNotNullParameter(var1, "icon");
         Intrinsics.checkNotNullParameter(var2, "label");
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      }

      public final String a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final String b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final String c() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final String d() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final drawInfoHud$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(String var1, String var2) {
         Intrinsics.checkNotNullParameter(var1, "icon");
         Intrinsics.checkNotNullParameter(var2, "label");
         return new drawInfoHud$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(var1, var2);
      }

      public static drawInfoHud$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(drawInfoHud$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0, String var1, String var2, int var3, Object var4) {
         int var5 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.k();
         if ((var3 & 1) != 0) {
            var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         }

         if ((var3 & 2) != 0) {
            var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         return var0.a(var1, var2);
      }

      public String toString() {
         return "Ctrl(icon=" + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl + ", label=" + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII + ")";
      }

      public int hashCode() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode() * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
      }

      public boolean equals(Object var0) {
         if (this == var0) {
            return true;
         } else if (!(var0 instanceof drawInfoHud$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)) {
            return false;
         } else {
            drawInfoHud$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1 = (drawInfoHud$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var0;
            return Intrinsics.areEqual(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, var1.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) && Intrinsics.areEqual(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, var1.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         }
      }

      static {
         a = new String[]{"", "", "", "", "", ""}; // PX-FIX: obfuscated string table not reconstructed
         b = new String[6];
      }

      private static String a(int var0, int var1) { char var10002 = '\0'; // PX-FIX hoist
        
         int var2 = (var0 ^ -11729) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 162;
               case 1 -> 82;
               case 2 -> 61;
               case 3 -> 210;
               case 4 -> 83;
               case 5 -> 255;
               case 6 -> 45;
               case 7 -> 141;
               case 8 -> 243;
               case 9 -> 67;
               case 10 -> 6;
               case 11 -> 178;
               case 12 -> 120;
               case 13 -> 216;
               case 14 -> 24;
               case 15 -> 134;
               case 16 -> 155;
               case 17 -> 80;
               case 18 -> 149;
               case 19 -> 104;
               case 20 -> 197;
               case 21 -> 31;
               case 22 -> 223;
               case 23 -> 47;
               case 24 -> 62;
               case 25 -> 32;
               case 26 -> 19;
               case 27 -> 70;
               case 28 -> 37;
               case 29 -> 55;
               case 30 -> 129;
               case 31 -> 242;
               case 32 -> 42;
               case 33 -> 44;
               case 34 -> 98;
               case 35 -> 109;
               case 36 -> 7;
               case 37 -> 26;
               case 38 -> 103;
               case 39 -> 41;
               case 40 -> 90;
               case 41 -> 20;
               case 42 -> 170;
               case 43 -> 235;
               case 44 -> 193;
               case 45 -> 2;
               case 46 -> 113;
               case 47 -> 138;
               case 48 -> 233;
               case 49 -> 225;
               case 50 -> 14;
               case 51 -> 126;
               case 52 -> 23;
               case 53 -> 190;
               case 54 -> 63;
               case 55 -> 64;
               case 56 -> 38;
               case 57 -> 135;
               case 58 -> 211;
               case 59 -> 213;
               case 60 -> 232;
               case 61 -> 10;
               case 62 -> 175;
               case 63 -> 203;
               case 64 -> 49;
               case 65 -> 71;
               case 66 -> 51;
               case 67 -> 59;
               case 68 -> 43;
               case 69 -> 119;
               case 70 -> 112;
               case 71 -> 146;
               case 72 -> 218;
               case 73 -> 139;
               case 74 -> 97;
               case 75 -> 58;
               case 76 -> 237;
               case 77 -> 108;
               case 78 -> 144;
               case 79 -> 187;
               case 80 -> 221;
               case 81 -> 202;
               case 82 -> 18;
               case 83 -> 30;
               case 84 -> 169;
               case 85 -> 76;
               case 86 -> 117;
               case 87 -> 74;
               case 88 -> 157;
               case 89 -> 15;
               case 90 -> 12;
               case 91 -> 214;
               case 92 -> 17;
               case 93 -> 127;
               case 94 -> 99;
               case 95 -> 78;
               case 96 -> 160;
               case 97 -> 228;
               case 98 -> 105;
               case 99 -> 140;
               case 100 -> 93;
               case 101 -> 229;
               case 102 -> 201;
               case 103 -> 154;
               case 104 -> 81;
               case 105 -> 219;
               case 106 -> 35;
               case 107 -> 116;
               case 108 -> 111;
               case 109 -> 53;
               case 110 -> 159;
               case 111 -> 246;
               case 112 -> 147;
               case 113 -> 177;
               case 114 -> 240;
               case 115 -> 156;
               case 116 -> 215;
               case 117 -> 25;
               case 118 -> 48;
               case 119 -> 239;
               case 120 -> 148;
               case 121 -> 150;
               case 122 -> 106;
               case 123 -> 96;
               case 124 -> 179;
               case 125 -> 9;
               case 126 -> 28;
               case 127 -> 247;
               case 128 -> 1;
               case 129 -> 249;
               case 130 -> 238;
               case 131 -> 250;
               case 132 -> 73;
               case 133 -> 183;
               case 134 -> 254;
               case 135 -> 195;
               case 136 -> 87;
               case 137 -> 234;
               case 138 -> 176;
               case 139 -> 50;
               case 140 -> 166;
               case 141 -> 174;
               case 142 -> 69;
               case 143 -> 142;
               case 144 -> 244;
               case 145 -> 209;
               case 146 -> 92;
               case 147 -> 118;
               case 148 -> 4;
               case 149 -> 205;
               case 150 -> 222;
               case 151 -> 185;
               case 152 -> 21;
               case 153 -> 110;
               case 154 -> 52;
               case 155 -> 153;
               case 156 -> 189;
               case 157 -> 66;
               case 158 -> 212;
               case 159 -> 151;
               case 160 -> 65;
               case 161 -> 75;
               case 162 -> 13;
               case 163 -> 198;
               case 164 -> 200;
               case 165 -> 95;
               case 166 -> 226;
               case 167 -> 132;
               case 168 -> 231;
               case 169 -> 101;
               case 170 -> 165;
               case 171 -> 158;
               case 172 -> 184;
               case 173 -> 173;
               case 174 -> 33;
               case 175 -> 121;
               case 176 -> 34;
               case 177 -> 85;
               case 178 -> 27;
               case 179 -> 115;
               case 180 -> 236;
               case 181 -> 182;
               case 182 -> 94;
               case 183 -> 194;
               case 184 -> 145;
               case 185 -> 84;
               case 186 -> 46;
               case 187 -> 5;
               case 188 -> 143;
               case 189 -> 77;
               case 190 -> 114;
               case 191 -> 188;
               case 192 -> 206;
               case 193 -> 0;
               case 194 -> 245;
               case 195 -> 136;
               case 196 -> 79;
               case 197 -> 252;
               case 198 -> 137;
               case 199 -> 16;
               case 200 -> 207;
               case 201 -> 199;
               case 202 -> 251;
               case 203 -> 224;
               case 204 -> 163;
               case 205 -> 88;
               case 206 -> 107;
               case 207 -> 8;
               case 208 -> 164;
               case 209 -> 227;
               case 210 -> 128;
               case 211 -> 57;
               case 212 -> 241;
               case 213 -> 86;
               case 214 -> 130;
               case 215 -> 171;
               case 216 -> 196;
               case 217 -> 208;
               case 218 -> 204;
               case 219 -> 40;
               case 220 -> 91;
               case 221 -> 22;
               case 222 -> 60;
               case 223 -> 102;
               case 224 -> 39;
               case 225 -> 131;
               case 226 -> 89;
               case 227 -> 192;
               case 228 -> 54;
               case 229 -> 186;
               case 230 -> 220;
               case 231 -> 191;
               case 232 -> 100;
               case 233 -> 133;
               case 234 -> 230;
               case 235 -> 152;
               case 236 -> 217;
               case 237 -> 56;
               case 238 -> 248;
               case 239 -> 161;
               case 240 -> 125;
               case 241 -> 72;
               case 242 -> 3;
               case 243 -> 167;
               case 244 -> 180;
               case 245 -> 253;
               case 246 -> 124;
               case 247 -> 68;
               case 248 -> 122;
               case 249 -> 181;
               case 250 -> 36;
               case 251 -> 11;
               case 252 -> 29;
               case 253 -> 123;
               case 254 -> 168;
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
                var10002 = var3[var7];
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

   public static void a(llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII var0, int var1, int var2, Object var3) {
      int var4 = k();
      if ((var2 & 1) != 0) {
         var1 = 1;
      }

      var0.a(var1);
   }
   static void a(llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII var0, String var1, me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      var0.a(var1, var2);
   }
   public static void a(llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII var0, BlockPos var1, me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var2, int var3, int var4, Object var5) {
      int var6 = j();
      if ((var4 & 4) != 0) {
         var3 = -1;
      }

      var0.a(var1, var2, var3);
   }

   // ===== PX-FIX end: convention (b) nested-inline recovery (agent B2) =====
}
