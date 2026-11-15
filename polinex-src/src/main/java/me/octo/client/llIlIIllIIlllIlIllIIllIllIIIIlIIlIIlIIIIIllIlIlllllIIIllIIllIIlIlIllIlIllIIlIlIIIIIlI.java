package me.octo.client;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.io.path.PathsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI {
   @NotNull
   private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final Lazy lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] a;
   private static String[] b;

   public llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI(@NotNull String var1) {
      short var10001 = -2108;
      short var10002 = 19611;
      Intrinsics.checkNotNullParameter(var1, "parentFolderName");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = LazyKt.lazy(
         () -> a(this)
      );
   }

   @NotNull
   public final String a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public final Path b() {
      Lazy var1 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      return (Path)var1.getValue();
   }

   @Nullable
   public final IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll a(@NotNull String param1) {
      boolean var101 = me.octo.client.llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.R();
      Path var100 = me.octo.client.lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, param1);
      if (!var101 && !Files.exists(var100)) {
         return null;
      }
      IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll var102;
      try {
         File var103 = var100.toFile();
         Intrinsics.checkNotNullExpressionValue(var103, "toFile(...)");
         var102 = (IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll) me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.fromJson(FilesKt.readText(var103, kotlin.text.Charsets.UTF_8), IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll.class);
      } catch (Exception var104) {
         var102 = null;
      }
      return var102;
   }

   @Nullable
   public final IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll a(@NotNull String param1, @NotNull String param2) {
      boolean var101 = me.octo.client.llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.R();
      Path var100 = me.octo.client.lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, param1, param2);
      if (!var101 && !Files.exists(var100)) {
         return null;
      }
      IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll var102;
      try {
         File var103 = var100.toFile();
         Intrinsics.checkNotNullExpressionValue(var103, "toFile(...)");
         var102 = (IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll) me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.fromJson(FilesKt.readText(var103, kotlin.text.Charsets.UTF_8), IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll.class);
      } catch (Exception var104) {
         var102 = null;
      }
      return var102;
   }

   @Nullable
   public final IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll a(
      @NotNull String param1, @NotNull String param2, @NotNull String param3
   ) {
      boolean var101 = me.octo.client.llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.Q();
      Path var100 = me.octo.client.lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, param1, param2, param3);
      if (var101 && !Files.exists(var100)) {
         return null;
      }
      IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll var102;
      try {
         File var103 = var100.toFile();
         Intrinsics.checkNotNullExpressionValue(var103, "toFile(...)");
         var102 = (IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll) me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.fromJson(FilesKt.readText(var103, kotlin.text.Charsets.UTF_8), IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll.class);
      } catch (Exception var104) {
         var102 = null;
      }
      return var102;
   }

   public final boolean a(@NotNull String param1, @NotNull IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll param2) {
      Intrinsics.checkNotNullParameter(param1, "fileName");
      boolean var10000 = me.octo.client.llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.R();
      Intrinsics.checkNotNullParameter(param2, "route");
      boolean var101 = var10000;
      Path var100 = me.octo.client.lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, param1);
      try {
         if (!var101) { Path var102 = var100.getParent(); if (var102 != null) { java.nio.file.attribute.FileAttribute[] var103 = new java.nio.file.attribute.FileAttribute[0]; Path var104 = Files.createDirectories(var102, Arrays.copyOf(var103, var103.length)); Intrinsics.checkNotNullExpressionValue(var104, "createDirectories(...)"); } }
         File var105 = var100.toFile();
         Intrinsics.checkNotNullExpressionValue(var105, "toFile(...)");
         me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(param2, var105, true);
         return true;
      } catch (Exception var106) { return false; }
   }

   public final boolean a(
      @NotNull String param1, @NotNull String param2, @NotNull IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll param3
   ) {
      Intrinsics.checkNotNullParameter(param1, "folderName");
      boolean var10000 = me.octo.client.llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.Q();
      Intrinsics.checkNotNullParameter(param2, "fileName");
      Intrinsics.checkNotNullParameter(param3, "route");
      boolean var101 = var10000;
      Path var100 = me.octo.client.lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, param1, param2);
      try {
         if (var101) { Path var102 = var100.getParent(); if (var102 != null) { java.nio.file.attribute.FileAttribute[] var103 = new java.nio.file.attribute.FileAttribute[0]; Path var104 = Files.createDirectories(var102, Arrays.copyOf(var103, var103.length)); Intrinsics.checkNotNullExpressionValue(var104, "createDirectories(...)"); } }
         File var105 = var100.toFile();
         Intrinsics.checkNotNullExpressionValue(var105, "toFile(...)");
         me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(param3, var105, true);
         return true;
      } catch (Exception var106) { return false; }
   }

   public final boolean a(
      @NotNull String param1,
      @NotNull String param2,
      @NotNull String param3,
      @NotNull IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll param4
   ) {
      boolean var10000 = me.octo.client.llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.R();
      Intrinsics.checkNotNullParameter(param1, "folderName");
      boolean var101 = var10000;
      Intrinsics.checkNotNullParameter(param2, "subFolderName");
      Intrinsics.checkNotNullParameter(param3, "fileName");
      Intrinsics.checkNotNullParameter(param4, "route");
      Path var100 = me.octo.client.lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, param1, param2, param3);
      try {
         if (!var101) { Path var102 = var100.getParent(); if (var102 != null) { java.nio.file.attribute.FileAttribute[] var103 = new java.nio.file.attribute.FileAttribute[0]; Path var104 = Files.createDirectories(var102, Arrays.copyOf(var103, var103.length)); Intrinsics.checkNotNullExpressionValue(var104, "createDirectories(...)"); } }
         File var105 = var100.toFile();
         Intrinsics.checkNotNullExpressionValue(var105, "toFile(...)");
         me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(param4, var105, true);
         return true;
      } catch (Exception var106) { return false; }
   }

   public final boolean b(@NotNull String param1) {
boolean var2 = me.octo.client.llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.Q();
Intrinsics.checkNotNullParameter(param1, "folderName");
Path var3 = me.octo.client.lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, param1);
boolean var4;
try { if (!var2 && !Files.exists(var3, Arrays.copyOf(new LinkOption[0], 0))) { Files.createDirectories(var3, Arrays.copyOf(new java.nio.file.attribute.FileAttribute[0], 0)); } var4 = true; } catch (Exception var5) { var4 = false; }
return var4;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public final boolean c(@NotNull String var1) {
      boolean var10000 = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.Q();
      short var10002 = -2105;
      short var10003 = -26995;
      Intrinsics.checkNotNullParameter(var1, "folderName");
      Path var3 = lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, var1);
      boolean var2 = var10000;

      label30: {
         try {
            LinkOption[] var10001 = new LinkOption[0];
            var10000 = Files.exists(var3, Arrays.copyOf(var10001, var10001.length));
            if (!var2) {
               break label30;
            }

            if (!var10000) {
               return false;
            }
         } catch (Exception var8) {
            throw (RuntimeException)a(var8);
         }

         try {
            File var10 = var3.toFile();
            var10002 = -2097;
            var10003 = 13203;
            Intrinsics.checkNotNullExpressionValue(var10, "toFile(...)");
            FilesKt.deleteRecursively(var10);
            var10000 = true;
         } catch (Exception var7) {
            return false;
         }
      }

      boolean var4;
      try {
         var4 = var10000;
      } catch (Exception var6) {
         var4 = false;
      }

      return var4;
   }

   public final boolean d(@NotNull String param1) {
boolean var2 = me.octo.client.llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.Q();
Intrinsics.checkNotNullParameter(param1, "fileName");
Path var3 = me.octo.client.lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, param1);
boolean var4;
try { FilesKt.deleteRecursively(var3.toFile()); var4 = true; } catch (Exception var5) { var4 = false; }
return var4;
   }

   public final boolean e(@NotNull String var1) {
      short var10001 = -2111;
      short var10002 = 19837;
      Intrinsics.checkNotNullParameter(var1, "fileName");
      Path var10000 = lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, var1);
      LinkOption[] var2 = new LinkOption[0];
      return Files.exists(var10000, Arrays.copyOf(var2, var2.length));
   }

   @NotNull
   public final List<String> c() {
      Collection var14 = null; // PX-FIX
      boolean var1 = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.Q();

      List var2;
      try {
         Path var10000 = this.b();
         short var10001 = -2109;
         short var10002 = -7247;
         Iterable var13 = PathsKt.listDirectoryEntries(var10000, "*.json");
         boolean var3 = false;
         Collection var5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var13, 10));
         boolean var6 = false;

         label24: {
            for (Object var8 : var13) {
               var14 = var5;
               Path var9 = (Path)var8;
               if (!var1) {
                  break label24;
               }

               boolean var10 = false;
               var5.add(PathsKt.getNameWithoutExtension(var9));
               if (!var1) {
                  break;
               }
            }

            var14 = var5;
         }

         var2 = (List)var14;
      } catch (Exception var12) {
         var2 = CollectionsKt.emptyList();
      }

      return var2;
   }

   @NotNull
   public final List<String> d() {
try { final List var4 = PathsKt.listDirectoryEntries(this.b(), "*.json"); ArrayList var5 = new ArrayList(); for (Object var7 : var4) { Path var8 = (Path)var7; var5.add(PathsKt.getNameWithoutExtension(var8)); } List var2 = (List)var5; return var2; } catch (Exception var6) { return CollectionsKt.emptyList(); }
   }

   private static final Path a(llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI var0) {
      return lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[14];
      int var3 = 0;
      String var2 = ")]¥r\u0095\u0011àfæ¢\rÇ\u0002ÁâÜ{¨ò\u009f\u009f\u0091¼ß\n\u0007O`0-Y÷o\u0004\u0083\u0010´>ÜÐlb½ÀE¸\u0013( \u008d÷\u0089\u0006^b\u0088ëüË\u0005Ú>T\u000e\u0091\bª\u001fÕý°Ò)k\r\u0014¸»µ\u0093\u0091A¯¢46É+\u000b\u0015¤X@Lì\u0095c¡ïÉ\u000bvy4ûÁ\u009b$\u008d\u00972\u000f\u0005\u0089\u009d>zÜ\b\u0087£pj\u0004 ¿5";
      int var4 = ")]¥r\u0095\u0011àfæ¢\rÇ\u0002ÁâÜ{¨ò\u009f\u009f\u0091¼ß\n\u0007O`0-Y÷o\u0004\u0083\u0010´>ÜÐlb½ÀE¸\u0013( \u008d÷\u0089\u0006^b\u0088ëüË\u0005Ú>T\u000e\u0091\bª\u001fÕý°Ò)k\r\u0014¸»µ\u0093\u0091A¯¢46É+\u000b\u0015¤X@Lì\u0095c¡ïÉ\u000bvy4ûÁ\u009b$\u008d\u00972\u000f\u0005\u0089\u009d>zÜ\b\u0087£pj\u0004 ¿5"
         .length();
      char var1 = '\n';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 42;
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
                     case 0 -> 122;
                     case 1 -> 48;
                     case 2 -> 102;
                     case 3 -> 86;
                     case 4 -> 6;
                     case 5 -> 96;
                     default -> 122;
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
                     b = new String[14];
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

                  var2 = "\u001dßÓÅ>\tðÄì£¡0Í\u0007\u0017õÏ<3\u001d*$\u0016¿y\u0087\u0011´\u0093¡\u0097ÆÉä}e®\u0002Àm\u009agÉ ¾";
                  var4 = "\u001dßÓÅ>\tðÄì£¡0Í\u0007\u0017õÏ<3\u001d*$\u0016¿y\u0087\u0011´\u0093¡\u0097ÆÉä}e®\u0002Àm\u009agÉ ¾".length();
                  var1 = 22;
                  var8 = -1;
            }

            var10000 = 17;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -2105) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 140;
            case 1 -> 1;
            case 2 -> 23;
            case 3 -> 153;
            case 4 -> 6;
            case 5 -> 228;
            case 6 -> 208;
            case 7 -> 222;
            case 8 -> 232;
            case 9 -> 171;
            case 10 -> 9;
            case 11 -> 197;
            case 12 -> 250;
            case 13 -> 93;
            case 14 -> 141;
            case 15 -> 216;
            case 16 -> 119;
            case 17 -> 182;
            case 18 -> 4;
            case 19 -> 253;
            case 20 -> 234;
            case 21 -> 27;
            case 22 -> 190;
            case 23 -> 188;
            case 24 -> 78;
            case 25 -> 73;
            case 26 -> 42;
            case 27 -> 173;
            case 28 -> 207;
            case 29 -> 68;
            case 30 -> 22;
            case 31 -> 46;
            case 32 -> 104;
            case 33 -> 35;
            case 34 -> 108;
            case 35 -> 61;
            case 36 -> 166;
            case 37 -> 155;
            case 38 -> 14;
            case 39 -> 224;
            case 40 -> 239;
            case 41 -> 64;
            case 42 -> 123;
            case 43 -> 219;
            case 44 -> 114;
            case 45 -> 244;
            case 46 -> 89;
            case 47 -> 30;
            case 48 -> 151;
            case 49 -> 81;
            case 50 -> 152;
            case 51 -> 235;
            case 52 -> 221;
            case 53 -> 94;
            case 54 -> 144;
            case 55 -> 33;
            case 56 -> 249;
            case 57 -> 18;
            case 58 -> 160;
            case 59 -> 227;
            case 60 -> 174;
            case 61 -> 67;
            case 62 -> 44;
            case 63 -> 101;
            case 64 -> 88;
            case 65 -> 126;
            case 66 -> 159;
            case 67 -> 55;
            case 68 -> 215;
            case 69 -> 98;
            case 70 -> 109;
            case 71 -> 203;
            case 72 -> 131;
            case 73 -> 13;
            case 74 -> 2;
            case 75 -> 111;
            case 76 -> 84;
            case 77 -> 74;
            case 78 -> 147;
            case 79 -> 252;
            case 80 -> 138;
            case 81 -> 199;
            case 82 -> 15;
            case 83 -> 34;
            case 84 -> 185;
            case 85 -> 51;
            case 86 -> 238;
            case 87 -> 58;
            case 88 -> 240;
            case 89 -> 107;
            case 90 -> 176;
            case 91 -> 106;
            case 92 -> 248;
            case 93 -> 181;
            case 94 -> 91;
            case 95 -> 180;
            case 96 -> 127;
            case 97 -> 85;
            case 98 -> 214;
            case 99 -> 241;
            case 100 -> 202;
            case 101 -> 149;
            case 102 -> 105;
            case 103 -> 45;
            case 104 -> 130;
            case 105 -> 218;
            case 106 -> 11;
            case 107 -> 220;
            case 108 -> 212;
            case 109 -> 162;
            case 110 -> 247;
            case 111 -> 59;
            case 112 -> 16;
            case 113 -> 242;
            case 114 -> 243;
            case 115 -> 209;
            case 116 -> 37;
            case 117 -> 52;
            case 118 -> 237;
            case 119 -> 69;
            case 120 -> 21;
            case 121 -> 110;
            case 122 -> 112;
            case 123 -> 53;
            case 124 -> 223;
            case 125 -> 79;
            case 126 -> 56;
            case 127 -> 217;
            case 128 -> 164;
            case 129 -> 31;
            case 130 -> 254;
            case 131 -> 255;
            case 132 -> 29;
            case 133 -> 128;
            case 134 -> 47;
            case 135 -> 170;
            case 136 -> 28;
            case 137 -> 115;
            case 138 -> 179;
            case 139 -> 161;
            case 140 -> 49;
            case 141 -> 76;
            case 142 -> 122;
            case 143 -> 229;
            case 144 -> 99;
            case 145 -> 19;
            case 146 -> 137;
            case 147 -> 210;
            case 148 -> 175;
            case 149 -> 71;
            case 150 -> 139;
            case 151 -> 143;
            case 152 -> 50;
            case 153 -> 0;
            case 154 -> 158;
            case 155 -> 136;
            case 156 -> 205;
            case 157 -> 77;
            case 158 -> 195;
            case 159 -> 230;
            case 160 -> 95;
            case 161 -> 125;
            case 162 -> 206;
            case 163 -> 36;
            case 164 -> 118;
            case 165 -> 54;
            case 166 -> 236;
            case 167 -> 129;
            case 168 -> 102;
            case 169 -> 245;
            case 170 -> 8;
            case 171 -> 57;
            case 172 -> 39;
            case 173 -> 48;
            case 174 -> 3;
            case 175 -> 142;
            case 176 -> 145;
            case 177 -> 87;
            case 178 -> 189;
            case 179 -> 233;
            case 180 -> 148;
            case 181 -> 5;
            case 182 -> 124;
            case 183 -> 100;
            case 184 -> 113;
            case 185 -> 103;
            case 186 -> 60;
            case 187 -> 10;
            case 188 -> 70;
            case 189 -> 187;
            case 190 -> 90;
            case 191 -> 177;
            case 192 -> 213;
            case 193 -> 97;
            case 194 -> 204;
            case 195 -> 196;
            case 196 -> 183;
            case 197 -> 200;
            case 198 -> 193;
            case 199 -> 157;
            case 200 -> 211;
            case 201 -> 184;
            case 202 -> 62;
            case 203 -> 66;
            case 204 -> 72;
            case 205 -> 12;
            case 206 -> 186;
            case 207 -> 192;
            case 208 -> 201;
            case 209 -> 168;
            case 210 -> 154;
            case 211 -> 167;
            case 212 -> 194;
            case 213 -> 25;
            case 214 -> 117;
            case 215 -> 116;
            case 216 -> 246;
            case 217 -> 133;
            case 218 -> 135;
            case 219 -> 20;
            case 220 -> 43;
            case 221 -> 120;
            case 222 -> 65;
            case 223 -> 80;
            case 224 -> 191;
            case 225 -> 251;
            case 226 -> 169;
            case 227 -> 41;
            case 228 -> 7;
            case 229 -> 92;
            case 230 -> 24;
            case 231 -> 231;
            case 232 -> 172;
            case 233 -> 150;
            case 234 -> 96;
            case 235 -> 146;
            case 236 -> 82;
            case 237 -> 198;
            case 238 -> 121;
            case 239 -> 134;
            case 240 -> 132;
            case 241 -> 32;
            case 242 -> 156;
            case 243 -> 86;
            case 244 -> 40;
            case 245 -> 26;
            case 246 -> 17;
            case 247 -> 83;
            case 248 -> 75;
            case 249 -> 165;
            case 250 -> 225;
            case 251 -> 38;
            case 252 -> 163;
            case 253 -> 63;
            case 254 -> 226;
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
