package me.octo.client;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
import me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
import me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public final class IIIIIIllIllIlIlllIlllIIIlllIIIlllllIIllllIIIIlIIlIlIIllIIllIllllllllIIIllllIIlIlllIIl {
   @NotNull
   public static IIIIIIllIllIlIlllIlllIIIlllIIIlllllIIllllIIIIlIIlIlIIllIIllIllllllllIIIllllIIlIlllIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Minecraft lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static Lazy IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static List<lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static String[] a;
   private static String[] b;

   private IIIIIIllIllIlIlllIlllIIIlllIIIlllllIIllllIIIIlIIlIlIIllIIllIllllllllIIIllllIIlIlllIIl() {
   }

   @NotNull
   public final File a() {
      Lazy var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      return (File)var1.getValue();
   }

   public final void b() {
      boolean var1 = lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.h();
      File[] var2 = this.a().listFiles((java.io.FilenameFilter)IIIIIIllIllIlIlllIlllIIIlllIIIlllllIIllllIIIIlIIlIlIIllIIllIllllllllIIIllllIIlIlllIIl::a);
      if (var1) {
         return;
      }
      if (var2 == null || var1 == (var2.length != 0)) {
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("No scripts found in " + this.a().getAbsolutePath());
         IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(2000L, "Script Manager", "No scripts found", IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         return;
      }

      int var3 = 0;
      int var4 = 0;
      File[] var5 = var2;
      int var6 = 0;
      int var7 = var5.length;
      while (var6 < var7) {
         File var8 = var5[var6];
         try {
            Intrinsics.checkNotNull(var8);
            lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll var9 = new lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll(var8);
            var9.e();
            lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.add(var9);
            var3++;
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Loaded script: " + var9.b());
            IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(1500L, "Script Manager", "Loaded " + var8.getName(), IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
            if (var1) {
               return;
            }
         } catch (Exception var9ex) {
            var4++;
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Failed to load script " + var8.getName() + ": " + var9ex.getMessage());
            var9ex.printStackTrace();
            IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(2000L, "Script Manager", "Failed to load " + var8.getName(), IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         }
         var6++;
         if (var1) {
            break;
         }
      }

      IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(3000L, "Script Manager", "Loaded " + var3 + " script(s)" + (var1 ? ", " + var4 + " failed" : (var4 > 0 ? ", " + var4 + " failed" : "")), var4 > 0 ? IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI : IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
   }

   public final void c() {
      boolean var10000 = lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.i();
      short var10001 = 23168;
      short var10002 = 674;
      lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Reloading all scripts...");
      boolean var1 = var10000;
      Iterable var2 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      boolean var3 = false;
      Iterator var4 = var2.iterator();

      while (true) {
         if (var4.hasNext()) {
            Object var5 = var4.next();
            lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll var6 = (lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll)var5;
            boolean var7 = false;

            label21: {
               try {
                  var6.g();
               } catch (Exception var9) {
                  String var10 = var6.b();
                  String var11 = var9.getMessage();
                  var10002 = 23184;
                  short var10003 = 14001;
                  var10003 = 23213;
                  short var10004 = -8418;
                  lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Error closing script " + var10 + ": " + var11);
                  break label21;
               }

               if (!var1) {
                  break;
               }
            }

            if (var1) {
               continue;
            }
         }

         lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clear();
         IllIIIlIlIIIIIIIIlllIIlIllIIlIllIllIIIIIlIlllIIIIlllIIIIIllIlIlIlIIIIIlllIIIIIIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b();
         this.b();
         var10002 = 23201;
         short var15 = -6078;
         var15 = 23224;
         short var17 = -8229;
         IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(
               2000L,
               "Script Manager",
               "Scripts reloaded!",
               IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            );
         break;
      }
   }

   public final void d() {
      Iterable var2 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      short var10000 = ((short)((lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.h()) ? 1 : 0));
      boolean var3 = false;
      boolean var1 = (var10000 != 0);
      Iterator var4 = var2.iterator();

      while (true) {
         if (var4.hasNext()) {
            Object var5 = var4.next();
            lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll var6 = (lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll)var5;
            boolean var7 = false;

            label21: {
               try {
                  var6.g();
               } catch (Exception var9) {
                  String var10 = var6.b();
                  String var10001 = var9.getMessage();
                  short var10002 = 23204;
                  short var10003 = 24343;
                  var10003 = 23191;
                  short var10004 = 16003;
                  lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Error closing script " + var10 + ": " + var10001);
                  break label21;
               }

               if (var1) {
                  break;
               }
            }

            if (!var1) {
               continue;
            }
         }

         var10000 = 23190;
         lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clear();
         short var12 = 18983;
         IllIIIlIlIIIIIIIIlllIIlIllIIlIllIllIIIIIlIlllIIIIlllIIIIIllIlIlIlIIIIIlllIIIIIIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b();
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("All scripts unloaded");
         break;
      }
   }

   @NotNull
   public final List<lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll> e() {
      return CollectionsKt.toList(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
   }

   @NotNull
   public final String a(@NotNull String param1) {
      boolean var2 = lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.h();
      Intrinsics.checkNotNullParameter(param1, "scriptName");
      String var3 = param1;
      if (!var2 && !StringsKt.endsWith(var3, ".js", false)) { var3 = var3 + ".js"; }
      lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll var4 = null;
      for (lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll var8 : lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) { if (Intrinsics.areEqual(var8.a().getName(), var3)) { var4 = var8; break; } }
      if (var2) { return "Stopped script: " + var4.b(); }
      if (var4 != null) { var4.f(); var4.g(); lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.remove(var4); me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Stopped script: " + var4.b()); me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(2000L, "Script Manager", "Stopped " + var4.b(), me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI); return "Stopped script: " + var4.b(); }
      File var5 = new File(this.a(), var3);
      if (!var5.exists()) { String var6 = "Script not found: " + var3; me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b(var6); me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(2000L, "Script Manager", var6, me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII); return var6; }
      try {
         lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll var6 = new lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll(var5);
         var6.e();
         lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.add(var6);
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Started script: " + var6.b());
         me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(2000L, "Script Manager", "Started " + var6.b(), me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         return "Started script: " + var6.b();
      } catch (Exception var7) { String var8 = "Failed to load script " + var3 + ": " + var7.getMessage(); me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b(var8); var7.printStackTrace(); me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(2000L, "Script Manager", "Failed to load " + var3, me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII); return var8; }
   }

   @NotNull
   public final String b(@NotNull String var1) {
      boolean var2;
      String var11;
      label48: {
         boolean var10000 = lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.h();
         short var10002 = 23215;
         short var10003 = 10926;
         Intrinsics.checkNotNullParameter(var1, "scriptName");
         var11 = null;
         var2 = var10000;
         var11 = var1;
         String var12 = var1;
         if (!var2) {
            short var10001 = 23175;
            var10002 = -1322;
            if (StringsKt.endsWith(var1, ".js", false)) {
               break label48;
            }

            var10001 = 23175;
            var10002 = -1322;
            var12 = var1 + ".js";
         }

         var11 = var12;
      }

      Iterable var6 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      Iterator var7 = var6.iterator();

      Object var13;
      label41:
      while (true) {
         if (var7.hasNext()) {
            Object var8 = var7.next();
            var13 = (lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll)var8;

            while (true) {
               lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll var9 =((lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll)( var13));
               boolean var10 = false;
               if (!Intrinsics.areEqual(var9.a().getName(), var11)) {
                  continue label41;
               }

               var13 = (lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll)var8;
               if (!var2) {
                  break label41;
               }
            }
         }

         var13 = null;
         break;
      }

      lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll var4 =((lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll)( var13));
      var13 = var4;
      if (!var2) {
         if (var4 == null) {
            short var22 = 23218;
            short var28 = 15310;
            String var5 = "Script not running: " + var11;
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b(var5);
            var28 = 23188;
            short var32 = -13931;
            IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(
                  2000L,
                  "Script Manager",
                  var5,
                  IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
               );
            return var5;
         }

         var4.f();
         var4.g();
         lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.remove(var4);
         String var15 = var4.b();
         short var20 = 23194;
         short var25 = 1890;
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Stopped script: " + var15);
         IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII var16 = IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         var25 = 23188;
         short var30 = -13931;
         String var31 = var4.b();
         short var10004 = 23226;
         short var10005 = 14891;
         var16.b(
            2000L,
            "Script Manager",
            "Stopped " + var31,
            IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         );
         var13 = var4;
      }

      String var17 = ((me.octo.client.PXDyn)var13).b();
      short var21 = 23194;
      short var27 = 1890;
      String var18 = "Stopped script: " + var17;
      if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.b(!var2);
      }

      return var18;
   }

   @NotNull
   public final String f() {
      Set var30 = null; // PX-FIX
      Object var29 = null; // PX-FIX
      label58: {
         int var10000 = ((lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.i()) ? 1 : 0);
         File[] var2 = this.a().listFiles((java.io.FilenameFilter)(IIIIIIllIllIlIlllIlllIIIlllIIIlllllIIllllIIIIlIIlIlIIllIIllIllllllllIIIllllIIlIlllIIl::b));
         boolean var1 = (var10000 != 0);
         File[] var27 = var2;
         if (var1) {
            if (var2 == null) {
               break label58;
            }

            var27 = var2;
         }

         var10000 = var27.length;
         if (var1) {
            var10000 = var10000 == 0 ? 1 : 0;
         }

         if (var10000 == 0) {
            Iterable var4 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            boolean var5 = false;
            var var7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var4, 10));
            boolean var8 = false;
            Iterator var9 = var4.iterator();

            while (true) {
               if (var9.hasNext()) {
                  Object var10 = var9.next();
                  var29 = var7;
                  lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll var11 = (lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll)var10;
                  if (!var1) {
                     break;
                  }

                  boolean var12 = false;
                  var7.add(var11.a().getName());
                  if (var1) {
                     continue;
                  }
               }

               var29 = var7;
               break;
            }

            Set var3 = CollectionsKt.toSet((Iterable)var29);
            boolean var6 = false;
            File[] var21 = var2;
            Collection var22 = new ArrayList(var2.length);
            boolean var23 = false;
            int var24 = 0;
            int var25 = var2.length;

            while (true) {
               if (var24 < var25) {
                  File var26 = var21[var24];
                  boolean var14 = false;
                  var30 = var3;
                  if (!var1) {
                     break;
                  }

                  boolean var15 = var3.contains(var26.getName());
                  Intrinsics.checkNotNull(var26);
                  String var31 = FilesKt.getNameWithoutExtension(var26);
                  String var34;
                  if (var15) {
                     short var10001 = 23200;
                     short var10002 = 7534;
                     var34 = " [RUNNING]";
                  } else {
                     var34 = "";
                  }

                  var22.add(var31 + var34);
                  var24++;
                  if (var1) {
                     continue;
                  }
               }

               var30 = ((Set)(Object)(var22));
               break;
            }

            List var20 = (List)var30;
            short var32 = 23183;
            int var35 = var2.length;
            int var38 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.size();
            String var17 = CollectionsKt.joinToString(var20, "\n", null, null, 0, null, null);
            int var18 = var38;
            int var19 = var35;
            short var36 = -32023;
            short var39 = 23187;
            short var10003 = -21129;
            short var10004 = 23170;
            short var10005 = 26614;
            return "Scripts (" + var19 + " total, " + var18 + " running):\n" + var17;
         }
      }

      String var33 = this.a().getAbsolutePath();
      short var37 = 23227;
      short var40 = -19882;
      return "No scripts found in " + var33;
   }

   @NotNull
   public final String c(@NotNull String var1) {
      boolean var2;
      String var12;
      label39: {
         boolean var10000 = lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.h();
         short var10002 = 23215;
         short var10003 = 10926;
         Intrinsics.checkNotNullParameter(var1, "scriptName");
         var2 = var10000;
         var12 = null;
         var12 = var1;
         String var17 = var1;
         if (!var2) {
            short var10001 = 23175;
            var10002 = -1322;
            if (StringsKt.endsWith(var1, ".js", false)) {
               break label39;
            }

            var10001 = 23175;
            var10002 = -1322;
            var17 = var1 + ".js";
         }

         var12 = var17;
      }

      Iterable var6 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      Iterator var7 = var6.iterator();

      Object var18;
      label32:
      while (true) {
         if (var7.hasNext()) {
            Object var8 = var7.next();
            var18 = (lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll)var8;

            while (true) {
               lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll var9 =((lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll)( var18));
               boolean var10 = false;
               if (!Intrinsics.areEqual(var9.a().getName(), var12)) {
                  continue label32;
               }

               var18 = (lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll)var8;
               if (!var2) {
                  break label32;
               }
            }
         }

         var18 = null;
         break;
      }

      lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll var4 =((lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll)( var18));
      var18 = var4;
      if (!var2) {
         if (var4 == null) {
            short var30 = 23216;
            short var41 = 25567;
            return "Script not running: " + var12;
         }

         var18 = var4;
      }

      lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var5 = ((me.octo.client.PXDyn)var18).d();
      StringBuilder var13 = new StringBuilder();
      boolean var14 = false;
      String var23 = var5.a();
      short var33 = 23208;
      short var42 = 32609;
      var13.append("Stats for " + var23 + ":").append('\n');
      long var24 = var5.b();
      var33 = 23176;
      var42 = 10828;
      var42 = 23221;
      short var10004 = 20160;
      var13.append("  Total Execution Time: " + var24 + "ms").append('\n');
      long var25 = var5.c();
      var33 = 23179;
      var42 = -28536;
      var13.append("  Execution Count: " + var25).append('\n');
      short var20 = 23212;
      short var26 = 6992;
      String var15 = "%.3f";
      Object[] var11 = new Object[]{var5.d()};
      String var21 = String.format(var15, Arrays.copyOf(var11, var11.length));
      var33 = 23195;
      var42 = 13566;
      Intrinsics.checkNotNullExpressionValue(var21, "format(...)");
      short var27 = 23172;
      var33 = -4697;
      var33 = 23221;
      var42 = 20160;
      var15 = "  Average Execution Time: " + var21 + "ms";
      var13.append(var15).append('\n');
      long var28 = var5.e();
      var33 = 23193;
      var42 = 2296;
      var42 = 23221;
      var10004 = 20160;
      var13.append("  Last Execution Time: " + var28 + "ms").append('\n');
      long var29 = var5.f();
      var33 = 23186;
      var42 = -10291;
      var42 = 23221;
      var10004 = 20160;
      var13.append("  Peak Execution Time: " + var29 + "ms").append('\n');
      return var13.toString();
   }

   @NotNull
   public final String g() {
      boolean var1 = lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.i();
      if (lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.isEmpty()) {
         short var18 = 23206;
         short var22 = 22522;
         return "No scripts running";
      } else {
         StringBuilder var2 = new StringBuilder();
         StringBuilder var3 = var2;
         boolean var4 = false;
         short var10001 = 23210;
         short var10002 = 14638;
         var2.append("Script Performance Stats:").append('\n');
         Iterable var5 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         boolean var6 = false;

         for (Object var8 : var5) {
            lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll var9 = (lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll)var8;
            boolean var10 = false;
            lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var11 = var9.d();
            String var10000 = var11.a();
            var10001 = 23197;
            var10002 = 6143;
            String var13 = "%.2f";
            Object[] var14 = new Object[]{var11.d()};
            String var20 = String.format(var13, Arrays.copyOf(var14, var14.length));
            short var10003 = 23205;
            short var10004 = 25989;
            Intrinsics.checkNotNullExpressionValue(var20, "format(...)");
            long var15 = var11.f();
            String var17 = var20;
            var10001 = 23171;
            var10002 = -7857;
            var10003 = 23174;
            var10004 = -32452;
            short var10005 = 23189;
            short var10006 = -2832;
            var3.append(var10000 + ": avg=" + var17 + "ms peak=" + var15 + "ms").append('\n');
            if (var1 && var1) {
               continue;
            }
            break;
         }

         return var2.toString();
      }
   }

   private static final File h() {
      boolean var10000 = lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.h();
      short var10004 = 23185;
      short var10005 = 22259;
      File var1 = new File(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.gameDirectory, "polinex/scripts");
      boolean var0 = var10000;
      boolean var3 = false;
      File var4 = var1;
      if (!var0) {
         if (!var1.exists()) {
            var1.mkdirs();
            String var5 = var1.getAbsolutePath();
            short var10001 = 23207;
            short var10002 = 28116;
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Created scripts directory: " + var5);
         }

         var4 = var1;
      }

      return var4;
   }

   private static final boolean a(File var0, String var1) {
      Intrinsics.checkNotNull(var1);
      short var10001 = 23181;
      short var10002 = 15880;
      return StringsKt.endsWith(var1, ".js", false);
   }

   private static final boolean b(File var0, String var1) {
      Intrinsics.checkNotNull(var1);
      short var10001 = 23175;
      short var10002 = -1322;
      return StringsKt.endsWith(var1, ".js", false);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[60];
      int var3 = 0;
      String var2 = "\bðþ§¸¸æ(ô\u001as\u0006\u0081Ì\u0082 ¨\u0007\u0018\u0002l\u009aÀ\u0001x8\u0095\u0086\u009fÑi\u009dÐ=ÿfrRø{×þ\u0091\u0007,^\u008fÆ\u000bÒ´\bî\u0004\u0093\u0006áY¢G\u0003\u0095\u0014\u0084\u001a\u0004ûKÆ·\u0094bÕÆ¿¿yù\u0007\u009f9ïY\u0005\u000fk°|\u0099\u009e\b\b²\u008d Òÿ\u0085]E\u0007\u0010{\bbûFª\u0013\u008bJ¾þ\u008dM1Î6â\u0007,\u0086ò\u0092\u0010Spb\u0018/t;.\u001f Ie/^\u0086\rêæóëú4zMÀ\u0094@Õ\bÛ\u0081\u0083QP·,\u0003\u0012\u0016\u0000'\u008dz\u0007-hLtÀÀÕûJb~o\tÎn<@\u0019¾\u0012\u0011Õ\u0010ÓÄs\u0082û¹%g6O÷@3ë\u0096`\u0003 \u0017\"\u0017\u001e9\u0019\u008dÊ\u0095\bíÿ\u009b\u0000\u001dý-6-Ê¹Æ\u0002Å¦ó\b\u009a=¶ÂçH¡Ô\u0015ÒYk\u0093ñV]\u009eiï-\\\u00004äc]á5\u008aÄ\u000fm¨\u0011\u0015\u007f\u0005\bZ§Lp=Ä«\u0089\u0014d\u0093'X¤ÊÇ#\u0016ú$Wj\u009cæýò²¤\\\u0002Û#\u000eù<Ú\nÅ÷ÚU¼\u008ePÇ¤=\u0002þÕ\u0010\u0094/j\u0084m\r\u008bTHc\u008dØ{\u00177\u009a\u000b\u000fq\u0097*}wö&\u007f¯Æ\u0016\u0014\u0096Ë\u0018\u008a\u0000\u0084\u0080yd*\u0015Cx\u00196ÊBí\u0082±\u0012\u0017ßö=pÃ±y\u0095Ñ\u0094ÅüE\u0011!ª(I\u009a\u001cNe\u0082\u0010\u0014\u0091ÓY<¾l·»vZ;*X\u009ck\u0002A<\u0010vÀ6yæ²ú£f\u009dH\u0007Ãì å\u0004\u0092¸Oq\u000fïB´\u0082eSyêÆ)Ý¼½MÆ\u000f\u0080³\u001a{¹eâ+¹¤º\ná9ú\nD×Pt\u008e¹#âá(\u000e\u0084'ui0\u009bdØk?ªñûû\u0012´\u000f\u009fûf\u0096\u0096\u0082@ó9Ãð\u0016·ª\u0095\u009d\u001b\u0003°\u0080 \u007fºM¢\u0090½\u0096\u0003\u0018l\u0012õ\u0095\u0018ú¤<5E\u0080¸Äç\u0015¬\u001a¤û\b[b?\u008eÛÑÚ\u009fä\u0017y#¢úâ=\u000bL\\ÿ\u008fpÃW°K}@\u0019eaI¡·\u0082\u0094æqZjÊ\u0013\u008a#]ä\u0086aÌ@Ý$+¯\u0007Ý¡P\u001cù$\u0086\nì\u0010kg\u0081°wA\u0094$\n°VÿNK\u0003e*\u0087ï\u0010ße\rÏJ&ë1DÏ\fMK¥1Ì\næ3\u001dë=Ë«þ=Y\u0004]º·1\u0002¬È\u0014 \u009cá\u001e¢u6&/½¬íBÓá\u0012_\u008a |\u0012\u001bF\u0086EN\u001e«K\u009c\u0010ÚL\u0096j\"Ps)\u0014É\\Ü\u0006\u0005vÂF±±\u007fl8ã®\u0014¶J\u009dd\u0014\u001ejÊWÌ\u0003Ã0ê¥l\u001d@@ø\u00152ÈÞû\nk{¬â\u000bêmÚåÝ\u0016\f\u0094ÈXê\b\u0088\u0081øD\u001a\u0011EøÙ&Ò@îÂÑ\u001a\u000f\u009fÇº2¤EA(Áq=·¡,E\u0002 ¹\b\r\u0002Y!\u000b¹GÂ\u0014iÍ$£\u0011\u009dxã\u009dß\u0082R\u009d©C(Eo0\u000f";
      int var4 = "\bðþ§¸¸æ(ô\u001as\u0006\u0081Ì\u0082 ¨\u0007\u0018\u0002l\u009aÀ\u0001x8\u0095\u0086\u009fÑi\u009dÐ=ÿfrRø{×þ\u0091\u0007,^\u008fÆ\u000bÒ´\bî\u0004\u0093\u0006áY¢G\u0003\u0095\u0014\u0084\u001a\u0004ûKÆ·\u0094bÕÆ¿¿yù\u0007\u009f9ïY\u0005\u000fk°|\u0099\u009e\b\b²\u008d Òÿ\u0085]E\u0007\u0010{\bbûFª\u0013\u008bJ¾þ\u008dM1Î6â\u0007,\u0086ò\u0092\u0010Spb\u0018/t;.\u001f Ie/^\u0086\rêæóëú4zMÀ\u0094@Õ\bÛ\u0081\u0083QP·,\u0003\u0012\u0016\u0000'\u008dz\u0007-hLtÀÀÕûJb~o\tÎn<@\u0019¾\u0012\u0011Õ\u0010ÓÄs\u0082û¹%g6O÷@3ë\u0096`\u0003 \u0017\"\u0017\u001e9\u0019\u008dÊ\u0095\bíÿ\u009b\u0000\u001dý-6-Ê¹Æ\u0002Å¦ó\b\u009a=¶ÂçH¡Ô\u0015ÒYk\u0093ñV]\u009eiï-\\\u00004äc]á5\u008aÄ\u000fm¨\u0011\u0015\u007f\u0005\bZ§Lp=Ä«\u0089\u0014d\u0093'X¤ÊÇ#\u0016ú$Wj\u009cæýò²¤\\\u0002Û#\u000eù<Ú\nÅ÷ÚU¼\u008ePÇ¤=\u0002þÕ\u0010\u0094/j\u0084m\r\u008bTHc\u008dØ{\u00177\u009a\u000b\u000fq\u0097*}wö&\u007f¯Æ\u0016\u0014\u0096Ë\u0018\u008a\u0000\u0084\u0080yd*\u0015Cx\u00196ÊBí\u0082±\u0012\u0017ßö=pÃ±y\u0095Ñ\u0094ÅüE\u0011!ª(I\u009a\u001cNe\u0082\u0010\u0014\u0091ÓY<¾l·»vZ;*X\u009ck\u0002A<\u0010vÀ6yæ²ú£f\u009dH\u0007Ãì å\u0004\u0092¸Oq\u000fïB´\u0082eSyêÆ)Ý¼½MÆ\u000f\u0080³\u001a{¹eâ+¹¤º\ná9ú\nD×Pt\u008e¹#âá(\u000e\u0084'ui0\u009bdØk?ªñûû\u0012´\u000f\u009fûf\u0096\u0096\u0082@ó9Ãð\u0016·ª\u0095\u009d\u001b\u0003°\u0080 \u007fºM¢\u0090½\u0096\u0003\u0018l\u0012õ\u0095\u0018ú¤<5E\u0080¸Äç\u0015¬\u001a¤û\b[b?\u008eÛÑÚ\u009fä\u0017y#¢úâ=\u000bL\\ÿ\u008fpÃW°K}@\u0019eaI¡·\u0082\u0094æqZjÊ\u0013\u008a#]ä\u0086aÌ@Ý$+¯\u0007Ý¡P\u001cù$\u0086\nì\u0010kg\u0081°wA\u0094$\n°VÿNK\u0003e*\u0087ï\u0010ße\rÏJ&ë1DÏ\fMK¥1Ì\næ3\u001dë=Ë«þ=Y\u0004]º·1\u0002¬È\u0014 \u009cá\u001e¢u6&/½¬íBÓá\u0012_\u008a |\u0012\u001bF\u0086EN\u001e«K\u009c\u0010ÚL\u0096j\"Ps)\u0014É\\Ü\u0006\u0005vÂF±±\u007fl8ã®\u0014¶J\u009dd\u0014\u001ejÊWÌ\u0003Ã0ê¥l\u001d@@ø\u00152ÈÞû\nk{¬â\u000bêmÚåÝ\u0016\f\u0094ÈXê\b\u0088\u0081øD\u001a\u0011EøÙ&Ò@îÂÑ\u001a\u000f\u009fÇº2¤EA(Áq=·¡,E\u0002 ¹\b\r\u0002Y!\u000b¹GÂ\u0014iÍ$£\u0011\u009dxã\u009dß\u0082R\u009d©C(Eo0\u000f"
         .length();
      char var1 = 11;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 101;
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
                     case 0 -> 48;
                     case 1 -> 9;
                     case 2 -> 97;
                     case 3 -> 3;
                     case 4 -> 55;
                     case 5 -> 47;
                     default -> 19;
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
                     b = new String[60];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIIIIIllIllIlIlllIlllIIIlllIIIlllllIIllllIIIIlIIlIlIIllIIllIllllllllIIIllllIIlIlllIIl();
                     Minecraft var10 = Minecraft.getInstance();
                     var10002 = 23198;
                     short var32 = 25328;
                     Intrinsics.checkNotNullExpressionValue(var10, "getInstance(...)");
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var10;
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = LazyKt.lazy(
                        IIIIIIllIllIlIlllIlllIIIlllIIIlllllIIllllIIIIlIIlIlIIllIIllIllllllllIIIllllIIlIlllIIl::h
                     );
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new ArrayList<>();
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

                  var2 = "¦«\u000bÂÅÔ³f\u0081\u0019±m\nMO½\u0095\u0010U\u0094fË\u001d\u009c;\\dX2\u0085¶\u0086´\u0092";
                  var4 = "¦«\u000bÂÅÔ³f\u0081\u0019±m\nMO½\u0095\u0010U\u0094fË\u001d\u009c;\\dX2\u0085¶\u0086´\u0092".length();
                  var1 = 17;
                  var8 = -1;
            }

            var10000 = 124;
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
      int var2 = (var0 ^ 23170) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 225;
            case 1 -> 195;
            case 2 -> 50;
            case 3 -> 90;
            case 4 -> 51;
            case 5 -> 118;
            case 6 -> 243;
            case 7 -> 72;
            case 8 -> 35;
            case 9 -> 217;
            case 10 -> 26;
            case 11 -> 125;
            case 12 -> 234;
            case 13 -> 124;
            case 14 -> 112;
            case 15 -> 198;
            case 16 -> 227;
            case 17 -> 61;
            case 18 -> 60;
            case 19 -> 190;
            case 20 -> 10;
            case 21 -> 180;
            case 22 -> 38;
            case 23 -> 5;
            case 24 -> 37;
            case 25 -> 6;
            case 26 -> 218;
            case 27 -> 209;
            case 28 -> 135;
            case 29 -> 230;
            case 30 -> 133;
            case 31 -> 189;
            case 32 -> 39;
            case 33 -> 175;
            case 34 -> 11;
            case 35 -> 21;
            case 36 -> 28;
            case 37 -> 80;
            case 38 -> 219;
            case 39 -> 233;
            case 40 -> 193;
            case 41 -> 204;
            case 42 -> 49;
            case 43 -> 186;
            case 44 -> 245;
            case 45 -> 139;
            case 46 -> 111;
            case 47 -> 55;
            case 48 -> 203;
            case 49 -> 183;
            case 50 -> 18;
            case 51 -> 156;
            case 52 -> 212;
            case 53 -> 167;
            case 54 -> 4;
            case 55 -> 128;
            case 56 -> 171;
            case 57 -> 160;
            case 58 -> 22;
            case 59 -> 13;
            case 60 -> 228;
            case 61 -> 48;
            case 62 -> 181;
            case 63 -> 248;
            case 64 -> 252;
            case 65 -> 202;
            case 66 -> 99;
            case 67 -> 113;
            case 68 -> 87;
            case 69 -> 240;
            case 70 -> 169;
            case 71 -> 101;
            case 72 -> 222;
            case 73 -> 43;
            case 74 -> 67;
            case 75 -> 98;
            case 76 -> 9;
            case 77 -> 176;
            case 78 -> 182;
            case 79 -> 116;
            case 80 -> 220;
            case 81 -> 54;
            case 82 -> 163;
            case 83 -> 210;
            case 84 -> 84;
            case 85 -> 66;
            case 86 -> 191;
            case 87 -> 157;
            case 88 -> 32;
            case 89 -> 89;
            case 90 -> 194;
            case 91 -> 134;
            case 92 -> 185;
            case 93 -> 121;
            case 94 -> 93;
            case 95 -> 122;
            case 96 -> 8;
            case 97 -> 131;
            case 98 -> 237;
            case 99 -> 215;
            case 100 -> 41;
            case 101 -> 170;
            case 102 -> 255;
            case 103 -> 162;
            case 104 -> 144;
            case 105 -> 36;
            case 106 -> 149;
            case 107 -> 153;
            case 108 -> 213;
            case 109 -> 64;
            case 110 -> 179;
            case 111 -> 223;
            case 112 -> 127;
            case 113 -> 63;
            case 114 -> 71;
            case 115 -> 2;
            case 116 -> 229;
            case 117 -> 168;
            case 118 -> 19;
            case 119 -> 46;
            case 120 -> 165;
            case 121 -> 174;
            case 122 -> 242;
            case 123 -> 123;
            case 124 -> 188;
            case 125 -> 114;
            case 126 -> 148;
            case 127 -> 201;
            case 128 -> 1;
            case 129 -> 141;
            case 130 -> 24;
            case 131 -> 83;
            case 132 -> 108;
            case 133 -> 137;
            case 134 -> 44;
            case 135 -> 239;
            case 136 -> 142;
            case 137 -> 23;
            case 138 -> 78;
            case 139 -> 86;
            case 140 -> 106;
            case 141 -> 173;
            case 142 -> 207;
            case 143 -> 151;
            case 144 -> 17;
            case 145 -> 235;
            case 146 -> 47;
            case 147 -> 178;
            case 148 -> 0;
            case 149 -> 221;
            case 150 -> 226;
            case 151 -> 85;
            case 152 -> 94;
            case 153 -> 25;
            case 154 -> 31;
            case 155 -> 33;
            case 156 -> 16;
            case 157 -> 146;
            case 158 -> 117;
            case 159 -> 199;
            case 160 -> 96;
            case 161 -> 57;
            case 162 -> 65;
            case 163 -> 187;
            case 164 -> 147;
            case 165 -> 74;
            case 166 -> 161;
            case 167 -> 15;
            case 168 -> 103;
            case 169 -> 73;
            case 170 -> 155;
            case 171 -> 42;
            case 172 -> 150;
            case 173 -> 177;
            case 174 -> 247;
            case 175 -> 76;
            case 176 -> 244;
            case 177 -> 20;
            case 178 -> 231;
            case 179 -> 238;
            case 180 -> 62;
            case 181 -> 110;
            case 182 -> 77;
            case 183 -> 104;
            case 184 -> 216;
            case 185 -> 119;
            case 186 -> 140;
            case 187 -> 102;
            case 188 -> 211;
            case 189 -> 206;
            case 190 -> 166;
            case 191 -> 172;
            case 192 -> 232;
            case 193 -> 208;
            case 194 -> 56;
            case 195 -> 246;
            case 196 -> 236;
            case 197 -> 59;
            case 198 -> 224;
            case 199 -> 29;
            case 200 -> 68;
            case 201 -> 30;
            case 202 -> 100;
            case 203 -> 53;
            case 204 -> 253;
            case 205 -> 241;
            case 206 -> 82;
            case 207 -> 136;
            case 208 -> 250;
            case 209 -> 192;
            case 210 -> 52;
            case 211 -> 132;
            case 212 -> 97;
            case 213 -> 154;
            case 214 -> 197;
            case 215 -> 105;
            case 216 -> 196;
            case 217 -> 12;
            case 218 -> 143;
            case 219 -> 145;
            case 220 -> 159;
            case 221 -> 109;
            case 222 -> 138;
            case 223 -> 81;
            case 224 -> 164;
            case 225 -> 75;
            case 226 -> 152;
            case 227 -> 70;
            case 228 -> 7;
            case 229 -> 158;
            case 230 -> 184;
            case 231 -> 92;
            case 232 -> 27;
            case 233 -> 58;
            case 234 -> 34;
            case 235 -> 129;
            case 236 -> 205;
            case 237 -> 115;
            case 238 -> 88;
            case 239 -> 107;
            case 240 -> 249;
            case 241 -> 95;
            case 242 -> 130;
            case 243 -> 200;
            case 244 -> 126;
            case 245 -> 45;
            case 246 -> 3;
            case 247 -> 69;
            case 248 -> 79;
            case 249 -> 91;
            case 250 -> 254;
            case 251 -> 120;
            case 252 -> 214;
            case 253 -> 40;
            case 254 -> 14;
            default -> 251;
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
