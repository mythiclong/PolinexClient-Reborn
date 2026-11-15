package me.octo.client;

import com.google.gson.JsonObject;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.io.path.PathsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI {
   @NotNull
   public static llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Minecraft lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static Lazy IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static Lazy lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static Map<String, llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static boolean IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] a;
   private static String[] b;

   private llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI() {
   }

   private final Path a() {
      Lazy var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      Object var10000 = var1.getValue();
      short var10002 = 2007;
      short var10003 = 31527;
      Intrinsics.checkNotNullExpressionValue(var10000, "getValue(...)");
      return (Path)var10000;
   }

   private final Path b() {
      Lazy var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      Object var10000 = var1.getValue();
      short var10002 = 1989;
      short var10003 = 22127;
      Intrinsics.checkNotNullExpressionValue(var10000, "getValue(...)");
      return (Path)var10000;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private final synchronized void c() {
      boolean var1 = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.Q();

      boolean var10000;
      label59: {
         try {
            var10000 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            if (!var1) {
               break label59;
            }

            if (IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
               return;
            }
         } catch (Exception var12) {
            throw (RuntimeException)a(var12);
         }

         IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = true;

         try {
            Path var18 = this.b();
            LinkOption[] var10001 = new LinkOption[0];
            var10000 = Files.exists(var18, Arrays.copyOf(var10001, var10001.length));
         } catch (Exception var11) {
            IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.clear();
            return;
         }
      }

      try {
         if (var10000) {
            llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII var3 = llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            Path var4 = this.b();
            boolean var5 = false;
            String var7 = PathsKt.readText(var4, null);
            boolean var8 = false;
            List var2 = (List)llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .fromJson(var7, List.class);
            IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.clear();
            Iterable var13 = var2;
            boolean var14 = false;

            for (Object var6 : var13) {
               llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var16 = (llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var6;
               var8 = false;

               try {
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.put(var16.a().a(), var16);
                  if (!var1 || !var1) {
                     break;
                  }
               } catch (Exception var9) {
                  throw (RuntimeException)a(var9);
               }
            }
         }
      } catch (Exception var10) {
         IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.clear();
      }
   }

   private final synchronized void d() {
      try {
         Path var10000 = this.a();
         FileAttribute[] var10001 = new FileAttribute[0];
         Path var3 = Files.createDirectories(var10000, Arrays.copyOf(var10001, var10001.length));
         short var10002 = 1988;
         short var10003 = 19298;
         Intrinsics.checkNotNullExpressionValue(var3, "createDirectories(...)");
         llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(CollectionsKt.toList(IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.values()), this.b(), true);
      } catch (Exception var2) {
      }
   }

   public final boolean a(@NotNull String var1) {
      short var10001 = 1986;
      short var10002 = -25541;
      Intrinsics.checkNotNullParameter(var1, "routeId");
      this.c();
      return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.containsKey(var1);
   }

   @Nullable
   public final llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll b(
      @NotNull String var1
   ) {
      short var10001 = 2004;
      short var10002 = -14533;
      Intrinsics.checkNotNullParameter(var1, "routeId");
      this.c();
      return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.get(var1);
   }

   @NotNull
   public final List<llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> e() {
      this.c();
      Iterable var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.values();
      boolean var2 = false;
      return CollectionsKt.sortedWith(
         var1,
         new llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll()
      );
   }

   @Nullable
   public final String a(@NotNull String var1, @NotNull String var2) {
      llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var18 = null; // PX-FIX
      Object var16 = null; // PX-FIX
      boolean var10000 = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.Q();
      short var10002 = 2002;
      short var10003 = -30342;
      Intrinsics.checkNotNullParameter(var1, "parentFolder");
      var10002 = 2015;
      var10003 = -25413;
      Intrinsics.checkNotNullParameter(var2, "fileName");
      this.c();
      Iterable var5 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.values();
      boolean var3 = var10000;
      boolean var6 = false;
      Iterator var7 = var5.iterator();

      label86:
      while (true) {
         if (!var7.hasNext()) {
            var16 = null;
            break;
         }

         Object var8 = var7.next();
         var16 = var8;

         while (true) {
            label82: {
               label81: {
                  label80: {
                     llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var9 = (llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var16;
                     boolean var10 = false;
                     var10000 = Intrinsics.areEqual(var9.d(), var1);
                     if (var3) {
                        try {
                           if (!var10000) {
                              break label80;
                           }

                           var10000 = Intrinsics.areEqual(var9.h(), var2);
                        } catch (NoWhenBranchMatchedException var14) {
                           throw (RuntimeException)a(var14);
                        }
                     }

                     try {
                        if (!var3) {
                           break label82;
                        }

                        if (var10000) {
                           break label81;
                        }
                     } catch (NoWhenBranchMatchedException var13) {
                        throw (RuntimeException)a(var13);
                     }
                  }

                  var10000 = false;
                  break label82;
               }

               var10000 = true;
            }

            if (!var10000) {
               break;
            }

            var16 = var8;
            if (var3) {
               break label86;
            }
         }
      }

      llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var4 = (llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var16;

      label57: {
         try {
            var18 = var4;
            if (!var3) {
               break label57;
            }

            if (var4 == null) {
               return null;
            }
         } catch (NoWhenBranchMatchedException var12) {
            throw (RuntimeException)a(var12);
         }

         var18 = var4;
      }

      IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var15 = var18.a();

      try {
         if (!var3) {
            return var15.b();
         }

         if (var15 == null) {
            return null;
         }
      } catch (NoWhenBranchMatchedException var11) {
         throw (RuntimeException)a(var11);
      }

      return var15.b();
   }

   private final String c(String var1) {
      CharSequence var3 = StringsKt.trim(var1).toString();
      int var10000 = ((llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.Q()) ? 1 : 0);
      short var10003 = 2011;
      short var10004 = -5811;
      Regex var4 = new Regex("[^A-Za-z0-9_-]");
      String var5 = "_";
      var3 = var4.replace(var3, var5);
      boolean var2 = (var10000 != 0);

      label27: {
         label26: {
            try {
               var10000 = var3.length();
               if (!var2) {
                  break label27;
               }

               if (var10000 == 0) {
                  break label26;
               }
            } catch (NoWhenBranchMatchedException var6) {
               throw (RuntimeException)a(var6);
            }

            var10000 = 0;
            break label27;
         }

         var10000 = 1;
      }

      Object var11;
      if (var10000 != 0) {
         boolean var8 = false;
         short var10 = 2010;
         short var10001 = 24225;
         var11 = "route";
      } else {
         var11 = var3;
      }

      return (String)var11;
   }

   private final llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII d(String var1) {
      boolean var10000 = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.R();
      Iterable var3 = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
      boolean var2 = var10000;
      boolean var4 = false;

      label20:
      for (Object var6 : var3) {
         Object var9 = var6;

         do {
            llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var7 = (llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII)var9;
            boolean var8 = false;
            if (!StringsKt.equals(var7.d(), var1, true)) {
               continue label20;
            }

            var9 = var6;
         } while (var2);

         return (llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII)var6;
      }

      return (llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII)null;
   }


   @Nullable
   public final llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
      @NotNull IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var1,
      @NotNull String var2
   ) {
      Intrinsics.checkNotNullParameter(var1, "route");
      Intrinsics.checkNotNullParameter(var2, "payloadJson");
      this.c();
      boolean var3 = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.R();
      llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var4 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.get(var1.a());
      if (var3) {
         return null;
      }

      llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var5 = this.d(var1.c());
      if (var5 == null) {
         return null;
      }

      llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI var6 = new llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI(var5.b());
      String var7 = this.c(var1.b()) + "_" + StringsKt.takeLast(var1.a(), 6);
      boolean var8 = false;
      String var9 = null;
      String var10 = null;
      String var11 = var5.g().name();

      switch (var5.g().ordinal()) {
         case 2: {
            IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll var14;
            try {
               var14 = llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .fromJson(var2, IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll.class);
            } catch (Exception var16) {
               return null;
            }

            var8 = var6.a(var7, var14);
            break;
         }

         case 1: {
            if (var5.i().size() > 1) {
               JsonObject var14 = null;

               try {
                  var14 = llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     .fromJson(var2, JsonObject.class);
               } catch (Exception var18) {
                  var14 = null;
               }

               Map<String, IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll> var15 = null;
               if (var14 != null) {
                  boolean var17 = true;

                  for (String var19 : var5.i()) {
                     if (!var14.has(var19)) {
                        var17 = false;
                        break;
                     }
                  }

                  if (var17) {
                     try {
                        var15 = new LinkedHashMap<>();

                        for (String var19 : var5.i()) {
                           var15.put(
                              var19,
                              llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                                 .fromJson(var14.get(var19).toString(), IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll.class)
                           );
                        }
                     } catch (Exception var21) {
                        var15 = null;
                     }
                  }
               }

               if (var15 != null) {
                  var8 = false;

                  for (Map.Entry<String, IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll> var20 : var15.entrySet()) {
                     if (var6.a(var7, var20.getKey(), var20.getValue())) {
                        var8 = true;
                     }
                  }
               } else {
                  IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll var22;
                  try {
                     var22 = llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        .fromJson(var2, IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll.class);
                  } catch (Exception var23) {
                     return null;
                  }

                  var8 = var6.a(var7, (String)CollectionsKt.first(var5.i()), var22);
               }
            } else {
               IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll var14;
               try {
                  var14 = llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     .fromJson(var2, IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll.class);
               } catch (Exception var19) {
                  return null;
               }

               String var15 = (String)CollectionsKt.firstOrNull(var5.i());
               if (var15 == null) {
                  return null;
               }

               var8 = var6.a(var7, var15, var14);
            }

            var9 = var7;
            var10 = null;
            break;
         }

         case 0: {
            IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll var14;
            try {
               var14 = llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .fromJson(var2, IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll.class);
            } catch (Exception var16) {
               return null;
            }

            String var15 = (String)CollectionsKt.firstOrNull(var5.h());
            if (var15 == null) {
               return null;
            }

            var8 = var6.a(var7, var15, var7, var14);
            var9 = var7;
            var10 = var15;
            break;
         }

         default:
            throw new NoWhenBranchMatchedException();
      }

      if (!var8) {
         return null;
      }

      long var12 = System.currentTimeMillis();
      Long var24 = var1.i();
      if (var24 != null) {
         var12 = var24;
      }

      long var25 = System.currentTimeMillis();
      if (var4 != null) {
         var25 = var4.b();
      }

      llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var13 = new llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         var1, var25, var12, var5.b(), var11, var9, var10, var7
      );
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.put(var1.a(), var13);
      this.d();
      return var13;
   }

   public final boolean e(@NotNull String param1) {
      boolean var2 = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.R();
      Intrinsics.checkNotNullParameter(param1, "routeId");
      this.c();
      if (var2) {
         return false;
      }

      llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll) IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.remove(param1);
      if (var3 == null) {
         return false;
      }

      try {
         String var4 = var3.e();
         switch (var4.hashCode()) {
            case 2157948:
               if (var4.equals("FILE")) {
                  Files.deleteIfExists(
                     lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(var3.d(), var3.h())
                  );
               }
               break;
            case 1408640877:
               if (var4.equals("SUB_FOLDER")) {
                  String var10 = var3.f();
                  String var5 = var10 != null ? var10 : var3.h();
                  Path var6 = lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(var3.d(), var5);
                  if (Files.exists(var6)) {
                     FilesKt.deleteRecursively(var6.toFile());
                  }
               }
               break;
            case 2079330414:
               if (var4.equals("FOLDER")) {
                  String var10 = var3.f();
                  String var5 = var10 != null ? var10 : var3.h();
                  Path var6 = lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(var3.d(), var5);
                  if (Files.exists(var6)) {
                     FilesKt.deleteRecursively(var6.toFile());
                  }
               }
               break;
         }
      } catch (Exception var8) {
         // 原字节码 offset 482 捕获并吞掉，直接落 d()
      }

      this.d();
      return true;
   }

   @Nullable
   public final String f(@NotNull String param1) {
      boolean var2 = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.R();
      Intrinsics.checkNotNullParameter(param1, "routeId");
      this.c();
      if (var2) {
         return null;
      }

      llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll) IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.get(param1);
      if (var3 == null) {
         return null;
      }

      llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI var4 = new llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI(var3.d());
      String var5 = var3.e();
      switch (var5.hashCode()) {
         case 2157948:
            if (var5.equals("FILE")) {
               IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll var10 = var4.a(var3.h());
               if (var10 != null) {
                  return llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var10);
               }
               return null;
            }
            return null;
         case 1408640877:
            if (var5.equals("SUB_FOLDER")) {
               String var11 = var3.f();
               String var6 = var11 != null ? var11 : var3.h();
               String var18 = var3.g();
               if (var18 == null) {
                  return null;
               }
               IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll var12 = var4.a(var6, var18, var3.h());
               if (var12 != null) {
                  return llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var12);
               }
               return null;
            }
            return null;
         case 2079330414:
            if (var5.equals("FOLDER")) {
               String var11 = var3.f();
               String var6 = var11 != null ? var11 : var3.h();
               llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var20 = null;
               for (llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var13 : llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII) {
                  if (Intrinsics.areEqual(var13.b(), var3.d())) {
                     var20 = var13;
                     break;
                  }
               }
               if (var20 != null && var20.i().size() > 1) {
                  com.google.gson.JsonObject var8 = new com.google.gson.JsonObject();
                  for (String var14 : var20.i()) {
                     IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll var15 = var4.a(var6, var14);
                     if (var15 == null) {
                        var15 = new IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll(CollectionsKt.emptyList(), null, null, null, 14, null);
                     }
                     var8.add(var14, llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(var15));
                  }
                  return llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a((Object) var8);
               }
               List<String> var21 = var20 != null ? var20.i() : null;
               String var16 = var21 == null || var21.isEmpty() ? null : var21.get(0);
               if (var16 == null) {
                  return null;
               }
               IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll var17 = var4.a(var6, var16);
               if (var17 != null) {
                  return llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var17);
               }
               return null;
            }
            return null;
         default:
            return null;
      }
   }

   private static final Path f() {
      Path var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.gameDirectory.toPath();
      short var10001 = 1985;
      short var10002 = 2482;
      Path var0 = var10000.resolve("polinex");
      boolean var2 = false;
      Intrinsics.checkNotNull(var0);
      FileAttribute[] var3 = new FileAttribute[0];
      Path var4;
      try {
         var4 = Files.createDirectories(var0, Arrays.copyOf(var3, var3.length));
      }
      catch (java.io.IOException iOException) {
         throw new RuntimeException(iOException);
      }
      var10002 = 2001;
      short var10003 = 22173;
      Intrinsics.checkNotNullExpressionValue(var4, "createDirectories(...)");
      return var0;
   }

   private static final Path g() {
      Path var10000 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a();
      short var10001 = 1984;
      short var10002 = 7383;
      return var10000.resolve("downloads_index.json");
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[24];
      int var3 = 0;
      String var2 = "*8Nt²íOXqK_\u0012Àm¶Ò\u0080\u0095åúÞØ\u0005\u000b\u0081IèQ\u000b\tùüú»5\u0019\u0004\u0006$,\f\u0098Ò~\\[})\u007fáh\u0096Q\nk\bw\u008fdAé\u008f\u009b\u000e\u0007\u0018Ó+¢\u001d¬©\r\u0007\u009b~Â\u0092ãÍ½l1 %\u009d\u000b@¶Õ\u0013\u009e\b½£\u0092Ð¾\u0006æñ\u007fò©\u008b\r¢n\u009c\u0015\u001ez6)ká@?\u0081\u000e\u000f$ñ\u0012ËàânÂ´y\u0087W¾\u0005@Ô B|\u0004\u0015X\u0001\u0000\u00067wE\"î\u0091\bë\u008fÚþ2<\u000bê\u00100Ô\u00984AÞXâ¹\u0013ß\u0083WÔj~\u0007¼@äÍÕÓÆ\u0014x\u0086ñ\u0012\rÅ\u0086\u001bÈµCª\u00034µGÊ^×ó\n\u0019u9 \u00ad´Ð1¼Ù\u0007\u0018¨+Í\u001dA©\r\u0097¶lgÐW\u0085+eã\u0081\u007f¹\u0016øº\u0014$ùç&\u0019\\cú\u0017tÍ ÆR\u0017¿ª\u0095Ò";
      int var4 = "*8Nt²íOXqK_\u0012Àm¶Ò\u0080\u0095åúÞØ\u0005\u000b\u0081IèQ\u000b\tùüú»5\u0019\u0004\u0006$,\f\u0098Ò~\\[})\u007fáh\u0096Q\nk\bw\u008fdAé\u008f\u009b\u000e\u0007\u0018Ó+¢\u001d¬©\r\u0007\u009b~Â\u0092ãÍ½l1 %\u009d\u000b@¶Õ\u0013\u009e\b½£\u0092Ð¾\u0006æñ\u007fò©\u008b\r¢n\u009c\u0015\u001ez6)ká@?\u0081\u000e\u000f$ñ\u0012ËàânÂ´y\u0087W¾\u0005@Ô B|\u0004\u0015X\u0001\u0000\u00067wE\"î\u0091\bë\u008fÚþ2<\u000bê\u00100Ô\u00984AÞXâ¹\u0013ß\u0083WÔj~\u0007¼@äÍÕÓÆ\u0014x\u0086ñ\u0012\rÅ\u0086\u001bÈµCª\u00034µGÊ^×ó\n\u0019u9 \u00ad´Ð1¼Ù\u0007\u0018¨+Í\u001dA©\r\u0097¶lgÐW\u0085+eã\u0081\u007f¹\u0016øº\u0014$ùç&\u0019\\cú\u0017tÍ ÆR\u0017¿ª\u0095Ò"
         .length();
      char var1 = 22;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 16;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var26 = var10001.toCharArray();
               int var10004 = var26.length;
               int var6 = 0;
               byte var29 = var10000;
               var21 = var26;
               int var15 = var10004;
               byte var35;
               char[] var39;
               int var10006;
               if (var10004 <= 1) {
                  var39 = var26;
                  var35 = var10000;
                  var10006 = var6;
               } else {
                  var29 = var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var39 = var26;
                  var35 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var39[var10006] = (char)(var39[var10006] ^ var35 ^ switch (var6 % 7) {
                     case 0 -> 49;
                     case 1 -> 123;
                     case 2 -> 85;
                     case 3 -> 83;
                     case 4 -> 126;
                     case 5 -> 51;
                     default -> 122;
                  });
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var39 = var21;
                     var35 = var29;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var39 = var21;
                     var35 = var29;
                     var10006 = var6;
                  }
               }
            }

            String var31 = new String(var21).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var31;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[24];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI();
                     Minecraft var10 = Minecraft.getInstance();
                     var10002 = 2014;
                     short var32 = 18403;
                     Intrinsics.checkNotNullExpressionValue(var10, "getInstance(...)");
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var10;
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = LazyKt.lazy(
                        llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI::f
                     );
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = LazyKt.lazy(
                        llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI::g
                     );
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new LinkedHashMap<>();
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var31;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "ÿ¡:Y\u000b\u008dµ±ß¯VÒî\u0081¶\u000b";
                  var4 = "ÿ¡:Y\u000b\u008dµ±ß¯VÒî\u0081¶\u000b".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 50;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 2001) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 193;
            case 1 -> 210;
            case 2 -> 86;
            case 3 -> 93;
            case 4 -> 162;
            case 5 -> 127;
            case 6 -> 180;
            case 7 -> 3;
            case 8 -> 254;
            case 9 -> 116;
            case 10 -> 219;
            case 11 -> 53;
            case 12 -> 148;
            case 13 -> 248;
            case 14 -> 184;
            case 15 -> 134;
            case 16 -> 246;
            case 17 -> 109;
            case 18 -> 126;
            case 19 -> 41;
            case 20 -> 122;
            case 21 -> 153;
            case 22 -> 50;
            case 23 -> 123;
            case 24 -> 188;
            case 25 -> 78;
            case 26 -> 195;
            case 27 -> 247;
            case 28 -> 136;
            case 29 -> 166;
            case 30 -> 76;
            case 31 -> 31;
            case 32 -> 115;
            case 33 -> 200;
            case 34 -> 232;
            case 35 -> 25;
            case 36 -> 38;
            case 37 -> 213;
            case 38 -> 230;
            case 39 -> 9;
            case 40 -> 70;
            case 41 -> 104;
            case 42 -> 67;
            case 43 -> 125;
            case 44 -> 12;
            case 45 -> 215;
            case 46 -> 216;
            case 47 -> 42;
            case 48 -> 234;
            case 49 -> 13;
            case 50 -> 238;
            case 51 -> 222;
            case 52 -> 129;
            case 53 -> 137;
            case 54 -> 253;
            case 55 -> 223;
            case 56 -> 179;
            case 57 -> 240;
            case 58 -> 171;
            case 59 -> 241;
            case 60 -> 119;
            case 61 -> 225;
            case 62 -> 97;
            case 63 -> 44;
            case 64 -> 205;
            case 65 -> 16;
            case 66 -> 79;
            case 67 -> 62;
            case 68 -> 55;
            case 69 -> 103;
            case 70 -> 208;
            case 71 -> 81;
            case 72 -> 48;
            case 73 -> 88;
            case 74 -> 214;
            case 75 -> 110;
            case 76 -> 69;
            case 77 -> 24;
            case 78 -> 52;
            case 79 -> 209;
            case 80 -> 10;
            case 81 -> 174;
            case 82 -> 75;
            case 83 -> 89;
            case 84 -> 163;
            case 85 -> 150;
            case 86 -> 144;
            case 87 -> 203;
            case 88 -> 235;
            case 89 -> 154;
            case 90 -> 107;
            case 91 -> 132;
            case 92 -> 131;
            case 93 -> 186;
            case 94 -> 106;
            case 95 -> 83;
            case 96 -> 101;
            case 97 -> 142;
            case 98 -> 152;
            case 99 -> 149;
            case 100 -> 133;
            case 101 -> 143;
            case 102 -> 105;
            case 103 -> 202;
            case 104 -> 17;
            case 105 -> 118;
            case 106 -> 155;
            case 107 -> 224;
            case 108 -> 71;
            case 109 -> 20;
            case 110 -> 30;
            case 111 -> 176;
            case 112 -> 160;
            case 113 -> 220;
            case 114 -> 207;
            case 115 -> 169;
            case 116 -> 239;
            case 117 -> 96;
            case 118 -> 218;
            case 119 -> 54;
            case 120 -> 90;
            case 121 -> 229;
            case 122 -> 237;
            case 123 -> 99;
            case 124 -> 6;
            case 125 -> 37;
            case 126 -> 182;
            case 127 -> 35;
            case 128 -> 60;
            case 129 -> 56;
            case 130 -> 172;
            case 131 -> 198;
            case 132 -> 87;
            case 133 -> 190;
            case 134 -> 19;
            case 135 -> 249;
            case 136 -> 59;
            case 137 -> 36;
            case 138 -> 194;
            case 139 -> 189;
            case 140 -> 46;
            case 141 -> 84;
            case 142 -> 27;
            case 143 -> 159;
            case 144 -> 243;
            case 145 -> 114;
            case 146 -> 82;
            case 147 -> 85;
            case 148 -> 165;
            case 149 -> 138;
            case 150 -> 170;
            case 151 -> 201;
            case 152 -> 183;
            case 153 -> 196;
            case 154 -> 66;
            case 155 -> 11;
            case 156 -> 181;
            case 157 -> 197;
            case 158 -> 68;
            case 159 -> 112;
            case 160 -> 233;
            case 161 -> 227;
            case 162 -> 217;
            case 163 -> 108;
            case 164 -> 7;
            case 165 -> 255;
            case 166 -> 175;
            case 167 -> 18;
            case 168 -> 141;
            case 169 -> 95;
            case 170 -> 43;
            case 171 -> 74;
            case 172 -> 228;
            case 173 -> 231;
            case 174 -> 212;
            case 175 -> 91;
            case 176 -> 187;
            case 177 -> 26;
            case 178 -> 173;
            case 179 -> 146;
            case 180 -> 130;
            case 181 -> 226;
            case 182 -> 158;
            case 183 -> 157;
            case 184 -> 47;
            case 185 -> 177;
            case 186 -> 167;
            case 187 -> 102;
            case 188 -> 199;
            case 189 -> 92;
            case 190 -> 139;
            case 191 -> 164;
            case 192 -> 94;
            case 193 -> 28;
            case 194 -> 63;
            case 195 -> 39;
            case 196 -> 33;
            case 197 -> 22;
            case 198 -> 49;
            case 199 -> 4;
            case 200 -> 252;
            case 201 -> 145;
            case 202 -> 15;
            case 203 -> 245;
            case 204 -> 113;
            case 205 -> 251;
            case 206 -> 250;
            case 207 -> 64;
            case 208 -> 5;
            case 209 -> 14;
            case 210 -> 221;
            case 211 -> 121;
            case 212 -> 51;
            case 213 -> 45;
            case 214 -> 117;
            case 215 -> 178;
            case 216 -> 98;
            case 217 -> 168;
            case 218 -> 192;
            case 219 -> 100;
            case 220 -> 0;
            case 221 -> 73;
            case 222 -> 204;
            case 223 -> 191;
            case 224 -> 211;
            case 225 -> 65;
            case 226 -> 135;
            case 227 -> 23;
            case 228 -> 40;
            case 229 -> 21;
            case 230 -> 128;
            case 231 -> 29;
            case 232 -> 147;
            case 233 -> 8;
            case 234 -> 61;
            case 235 -> 161;
            case 236 -> 206;
            case 237 -> 57;
            case 238 -> 77;
            case 239 -> 244;
            case 240 -> 140;
            case 241 -> 236;
            case 242 -> 124;
            case 243 -> 120;
            case 244 -> 1;
            case 245 -> 242;
            case 246 -> 156;
            case 247 -> 34;
            case 248 -> 80;
            case 249 -> 151;
            case 250 -> 58;
            case 251 -> 72;
            case 252 -> 32;
            case 253 -> 185;
            case 254 -> 111;
            default -> 2;
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
      // PX-FIX RC4-209: Kotlin default-args bridge restored from jar bytecode (descriptor (Lme/octo/client/llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;Lme/octo/client/IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lme/octo/client/llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;)
      public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll self, me.octo.client.IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl p1, long p2, long p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, int mask, java.lang.Object marker) {
      if ((mask & 1) != 0) { p1 = self.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
      if ((mask & 2) != 0) { p2 = self.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
      if ((mask & 4) != 0) { p3 = self.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl; }
      if ((mask & 8) != 0) { p4 = self.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI; }
      if ((mask & 16) != 0) { p5 = self.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII; }
      if ((mask & 32) != 0) { p6 = self.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI; }
      if ((mask & 64) != 0) { p7 = self.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll; }
      if ((mask & 128) != 0) { p8 = self.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll; }
      return self.a(p1, p2, p3, p4, p5, p6, p7, p8);
      }
      @NotNull
      private final IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @NotNull
      private final String lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      @NotNull
      private final String IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      @Nullable
      private final String IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      @Nullable
      private final String IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      @NotNull
      private final String lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         @NotNull IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var1,
         long var2,
         long var4,
         @NotNull String var6,
         @NotNull String var7,
         @Nullable String var8,
         @Nullable String var9,
         @NotNull String var10
      ) {
         short var10001 = 20128;
         short var10002 = 30764;
         Intrinsics.checkNotNullParameter(var1, "route");
         var10001 = 20134;
         var10002 = -26682;
         Intrinsics.checkNotNullParameter(var6, "parentFolder");
         var10001 = 20130;
         var10002 = -14467;
         Intrinsics.checkNotNullParameter(var7, "targetType");
         var10001 = 20133;
         var10002 = 12979;
         Intrinsics.checkNotNullParameter(var10, "fileName");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var4;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var6;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var7;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var8;
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var9;
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var10;
      }

      @NotNull
      public final IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final long b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final long c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final String d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final String e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @Nullable
      public final String f() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @Nullable
      public final String g() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      @NotNull
      public final String h() {
         return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      @NotNull
      public final IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl i() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final long j() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final long k() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final String l() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final String m() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @Nullable
      public final String n() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @Nullable
      public final String o() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      @NotNull
      public final String p() {
         return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      @NotNull
      public final llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         @NotNull IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var1,
         long var2,
         long var4,
         @NotNull String var6,
         @NotNull String var7,
         @Nullable String var8,
         @Nullable String var9,
         @NotNull String var10
      ) {
         short var10001 = 20140;
         short var10002 = -19879;
         Intrinsics.checkNotNullParameter(var1, "route");
         var10001 = 20131;
         var10002 = 18832;
         Intrinsics.checkNotNullParameter(var6, "parentFolder");
         var10001 = 20135;
         var10002 = -14597;
         Intrinsics.checkNotNullParameter(var7, "targetType");
         var10001 = 20143;
         var10002 = -24872;
         Intrinsics.checkNotNullParameter(var10, "fileName");
         return new llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2, var4, var6, var7, var8, var9, var10
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 20139;
         String var1 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
         String var2 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         String var3 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         String var4 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         String var5 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         long var6 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         long var8 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var10 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 22391;
         short var10002 = 20137;
         short var10003 = -3752;
         short var10004 = 20142;
         short var10005 = 15089;
         short var10006 = 20129;
         short var10007 = 7587;
         short var10008 = 20141;
         short var10009 = -9161;
         short var10010 = 20132;
         short var10011 = -18178;
         short var10012 = 20138;
         short var10013 = -22164;
         short var10014 = 20136;
         short var10015 = -32043;
         return "Entry(route="
            + var10
            + ", downloadedAt="
            + var8
            + ", localVersion="
            + var6
            + ", parentFolder="
            + var5
            + ", targetType="
            + var4
            + ", folder="
            + var3
            + ", subFolder="
            + var2
            + ", fileName="
            + var1
            + ")";
      }

      @Override
      public int hashCode() {
         boolean var1;
         int var9;
         int var11;
         label25: {
            boolean var10000 = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.Q();
            int var2 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
            var2 = var2 * 31 + Long.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
            var2 = var2 * 31 + Long.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
            var1 = var10000;
            var2 = var2 * 31 + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.hashCode();
            var2 = var2 * 31 + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.hashCode();
            var9 = var2 * 31;
            String var10001 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            if (var1) {
               if (this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI == null) {
                  var11 = 0;
                  break label25;
               }

               var10001 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            }

            var11 = var10001.hashCode();
         }

         label19: {
            int var7 = var9 + var11;
            var9 = var7 * 31;
            String var12 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
            if (var1) {
               if (this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll == null) {
                  var11 = 0;
                  break label19;
               }

               var12 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
            }

            var11 = var12.hashCode();
         }

         int var8 = var9 + var11;
         return var8 * 31 + this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.hashCode();
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
            if (!(
               var10000 instanceof llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         int var4 = ((Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )) ? 1 : 0);
         if (!var2) {
            if ((var4 == 0)) {
               return false;
            }

            long var5;
            var4 = (
                     var5 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        - var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  )
                  == 0L
               ? 0
               : (var5 < 0L ? -1 : 1);
         }

         if (!var2) {
            if ((var4 != 0)) {
               return false;
            }

            long var6;
            var4 = (
                     var6 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        - var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                  )
                  == 0L
               ? 0
               : (var6 < 0L ? -1 : 1);
         }

         if (!var2) {
            if ((var4 != 0)) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            )) ? 1 : 0);
         }

         if (!var2) {
            if ((var4 == 0)) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
               var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            )) ? 1 : 0);
         }

         if (!var2) {
            if ((var4 == 0)) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
               var3.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            )) ? 1 : 0);
         }

         if (!var2) {
            if ((var4 == 0)) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
               var3.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
            )) ? 1 : 0);
         }

         if (!var2) {
            if ((var4 == 0)) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
               var3.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
            )) ? 1 : 0);
         }

         if (!var2) {
            if ((var4 == 0)) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[16];
         int var3 = 0;
         String var2 = "3·óÓX»\t\u0010\u000f0Ê\u0090\u0016\u0019H¨]\u0017\u0016\\\u001e\u0090\u0001â\r \u0096\u009a\u0093R1û\u0096d\u0002&úî\u0005Ë~c=[\f¶<\u001cR\u00897ýëpØ´U\fàî\u0095\u0088Då!\u0011Dõ\u0016Ã\u000f\u00ady+`s\u0089s²hã!yÅ[£\u000b\u0005õ<÷È¶^1§]\r\n¨ÉÎ\u0017\ttTB¢(\fYXt'U0§Ü\u0090.\u0092Ö\b6ùS\u001aL\u0082\u008b7\t70zI\u0000¦l\u0001ÿ\frY\u0011\u0007ù42\\\">ÄÔ\n\\ÖPôÚ\b.ÍíÙ";
         int var4 = "3·óÓX»\t\u0010\u000f0Ê\u0090\u0016\u0019H¨]\u0017\u0016\\\u001e\u0090\u0001â\r \u0096\u009a\u0093R1û\u0096d\u0002&úî\u0005Ë~c=[\f¶<\u001cR\u00897ýëpØ´U\fàî\u0095\u0088Då!\u0011Dõ\u0016Ã\u000f\u00ady+`s\u0089s²hã!yÅ[£\u000b\u0005õ<÷È¶^1§]\r\n¨ÉÎ\u0017\ttTB¢(\fYXt'U0§Ü\u0090.\u0092Ö\b6ùS\u001aL\u0082\u008b7\t70zI\u0000¦l\u0001ÿ\frY\u0011\u0007ù42\\\">ÄÔ\n\\ÖPôÚ\b.ÍíÙ"
            .length();
         char var1 = '\b';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 98;
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
                        case 0 -> 1;
                        case 1 -> 64;
                        case 2 -> 93;
                        case 3 -> 34;
                        case 4 -> 12;
                        case 5 -> 3;
                        default -> 71;
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
                        b = new String[16];
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

                     var2 = "ô'tÅk\u0099·¡õ\u00928]\u008a¹\u008a\u0005\u008a\u001a+Ñ2";
                     var4 = "ô'tÅk\u0099·¡õ\u00928]\u008a¹\u008a\u0005\u008a\u001a+Ñ2".length();
                     var1 = 15;
                     var8 = -1;
               }

               var10000 = 43;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 20143) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 237;
               case 1 -> 69;
               case 2 -> 89;
               case 3 -> 122;
               case 4 -> 100;
               case 5 -> 141;
               case 6 -> 45;
               case 7 -> 121;
               case 8 -> 160;
               case 9 -> 59;
               case 10 -> 105;
               case 11 -> 169;
               case 12 -> 23;
               case 13 -> 106;
               case 14 -> 228;
               case 15 -> 8;
               case 16 -> 93;
               case 17 -> 47;
               case 18 -> 137;
               case 19 -> 24;
               case 20 -> 96;
               case 21 -> 197;
               case 22 -> 15;
               case 23 -> 44;
               case 24 -> 65;
               case 25 -> 238;
               case 26 -> 248;
               case 27 -> 6;
               case 28 -> 108;
               case 29 -> 129;
               case 30 -> 11;
               case 31 -> 131;
               case 32 -> 167;
               case 33 -> 94;
               case 34 -> 213;
               case 35 -> 149;
               case 36 -> 193;
               case 37 -> 43;
               case 38 -> 215;
               case 39 -> 46;
               case 40 -> 13;
               case 41 -> 174;
               case 42 -> 165;
               case 43 -> 9;
               case 44 -> 219;
               case 45 -> 225;
               case 46 -> 168;
               case 47 -> 83;
               case 48 -> 155;
               case 49 -> 97;
               case 50 -> 198;
               case 51 -> 217;
               case 52 -> 232;
               case 53 -> 252;
               case 54 -> 208;
               case 55 -> 73;
               case 56 -> 245;
               case 57 -> 233;
               case 58 -> 124;
               case 59 -> 125;
               case 60 -> 68;
               case 61 -> 227;
               case 62 -> 250;
               case 63 -> 50;
               case 64 -> 161;
               case 65 -> 244;
               case 66 -> 186;
               case 67 -> 99;
               case 68 -> 156;
               case 69 -> 51;
               case 70 -> 229;
               case 71 -> 42;
               case 72 -> 48;
               case 73 -> 185;
               case 74 -> 76;
               case 75 -> 33;
               case 76 -> 153;
               case 77 -> 10;
               case 78 -> 234;
               case 79 -> 206;
               case 80 -> 162;
               case 81 -> 12;
               case 82 -> 224;
               case 83 -> 114;
               case 84 -> 134;
               case 85 -> 128;
               case 86 -> 5;
               case 87 -> 251;
               case 88 -> 176;
               case 89 -> 57;
               case 90 -> 41;
               case 91 -> 210;
               case 92 -> 87;
               case 93 -> 112;
               case 94 -> 0;
               case 95 -> 201;
               case 96 -> 144;
               case 97 -> 80;
               case 98 -> 243;
               case 99 -> 35;
               case 100 -> 4;
               case 101 -> 230;
               case 102 -> 139;
               case 103 -> 181;
               case 104 -> 140;
               case 105 -> 147;
               case 106 -> 182;
               case 107 -> 84;
               case 108 -> 16;
               case 109 -> 143;
               case 110 -> 175;
               case 111 -> 179;
               case 112 -> 172;
               case 113 -> 246;
               case 114 -> 222;
               case 115 -> 146;
               case 116 -> 199;
               case 117 -> 241;
               case 118 -> 74;
               case 119 -> 28;
               case 120 -> 132;
               case 121 -> 61;
               case 122 -> 180;
               case 123 -> 223;
               case 124 -> 39;
               case 125 -> 207;
               case 126 -> 116;
               case 127 -> 135;
               case 128 -> 214;
               case 129 -> 81;
               case 130 -> 247;
               case 131 -> 189;
               case 132 -> 92;
               case 133 -> 88;
               case 134 -> 249;
               case 135 -> 77;
               case 136 -> 32;
               case 137 -> 195;
               case 138 -> 218;
               case 139 -> 159;
               case 140 -> 126;
               case 141 -> 56;
               case 142 -> 82;
               case 143 -> 163;
               case 144 -> 37;
               case 145 -> 21;
               case 146 -> 209;
               case 147 -> 221;
               case 148 -> 204;
               case 149 -> 158;
               case 150 -> 142;
               case 151 -> 25;
               case 152 -> 235;
               case 153 -> 255;
               case 154 -> 240;
               case 155 -> 117;
               case 156 -> 173;
               case 157 -> 2;
               case 158 -> 14;
               case 159 -> 254;
               case 160 -> 90;
               case 161 -> 70;
               case 162 -> 200;
               case 163 -> 63;
               case 164 -> 7;
               case 165 -> 236;
               case 166 -> 85;
               case 167 -> 103;
               case 168 -> 127;
               case 169 -> 151;
               case 170 -> 115;
               case 171 -> 54;
               case 172 -> 138;
               case 173 -> 242;
               case 174 -> 38;
               case 175 -> 188;
               case 176 -> 154;
               case 177 -> 205;
               case 178 -> 119;
               case 179 -> 157;
               case 180 -> 203;
               case 181 -> 239;
               case 182 -> 102;
               case 183 -> 55;
               case 184 -> 164;
               case 185 -> 152;
               case 186 -> 79;
               case 187 -> 91;
               case 188 -> 212;
               case 189 -> 191;
               case 190 -> 110;
               case 191 -> 101;
               case 192 -> 17;
               case 193 -> 170;
               case 194 -> 30;
               case 195 -> 72;
               case 196 -> 40;
               case 197 -> 52;
               case 198 -> 133;
               case 199 -> 1;
               case 200 -> 192;
               case 201 -> 202;
               case 202 -> 3;
               case 203 -> 60;
               case 204 -> 104;
               case 205 -> 220;
               case 206 -> 118;
               case 207 -> 66;
               case 208 -> 166;
               case 209 -> 190;
               case 210 -> 194;
               case 211 -> 31;
               case 212 -> 18;
               case 213 -> 231;
               case 214 -> 130;
               case 215 -> 120;
               case 216 -> 26;
               case 217 -> 27;
               case 218 -> 196;
               case 219 -> 211;
               case 220 -> 178;
               case 221 -> 111;
               case 222 -> 177;
               case 223 -> 22;
               case 224 -> 136;
               case 225 -> 29;
               case 226 -> 20;
               case 227 -> 253;
               case 228 -> 75;
               case 229 -> 36;
               case 230 -> 184;
               case 231 -> 67;
               case 232 -> 49;
               case 233 -> 183;
               case 234 -> 58;
               case 235 -> 216;
               case 236 -> 19;
               case 237 -> 34;
               case 238 -> 62;
               case 239 -> 109;
               case 240 -> 86;
               case 241 -> 171;
               case 242 -> 71;
               case 243 -> 148;
               case 244 -> 95;
               case 245 -> 123;
               case 246 -> 113;
               case 247 -> 98;
               case 248 -> 107;
               case 249 -> 150;
               case 250 -> 64;
               case 251 -> 226;
               case 252 -> 187;
               case 253 -> 145;
               case 254 -> 78;
               default -> 53;
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
}