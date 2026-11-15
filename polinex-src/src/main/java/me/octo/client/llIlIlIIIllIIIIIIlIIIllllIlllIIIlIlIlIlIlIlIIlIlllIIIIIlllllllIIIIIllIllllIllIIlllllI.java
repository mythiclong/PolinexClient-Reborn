package me.octo.client;

import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.glfw.GLFW;

public final class llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI {
   static char[] var20; // PX-FIX: obfuscator temp field (null-cast static access)
   @NotNull
   public static llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @Nullable
   private static String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static float IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static float IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static float IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static float lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static long IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static boolean llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @Nullable
   private static String lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private static lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static boolean lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @Nullable
   private static String lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private static lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @Nullable
   private static String llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static float IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @NotNull
   private static Pair<Float, Float> IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static float IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static boolean IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private static boolean llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private static boolean IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   @NotNull
   private static String lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   private static long llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   @Nullable
   private static IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   @NotNull
   private static IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   private static String[] a;
   private static String[] b;

   private llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI() {
   }

   public final void a() {
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = false;
      lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = false;
      lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.b();
      IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.b();
      lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = null;
      lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = null;
      llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = null;
      IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = false;
      llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = false;
      IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = false;
   }

   public final void b() {
      int[] var1 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      if (var1 == null) {
         String var10001 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if (IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == null) {
            short var2 = 30001;
            short var10002 = -30714;
            var10001 = "New Theme";
         }

         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .d(var10001);
         lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = false;
         lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = null;
         lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = null;
      }
   }

   public final void a(@NotNull String var1) {
      Object var14 = null; // PX-FIX
      int[] var10000 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      short var10002 = 30020;
      short var10003 = 3444;
      Intrinsics.checkNotNullParameter(var1, "name");
      int[] var2 = var10000;
      if (var2 == null) {
         llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var13 = llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var1);
         if (var13 != null) {
            llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = var13;
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var3.b(var3.e());
            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
            lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = false;
            llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
            lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = null;
            lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = null;
            this.e();
            lIIllIlIllIIIIlIllIlllIIIIIlIllIIIIlIlIIllIIIIIIlIIlIIlIlllIlIIllIlIIlIlIIIIlIllIIIII var4 = (lIIllIlIllIIIIlIllIlllIIIIIlIllIIIIlIlIIllIIIIIIlIIlIIlIlllIlIIllIlIIlIlIIIIlIllIIIII)CollectionsKt.firstOrNull(
               lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
            );
            if (var2 == null) {
               if (var4 != null) {
                  String[] var5 = var4.W();
                  String[] var7 = var5;
                  boolean var8 = false;
                  int var9 = 0;
                  int var10 = var5.length;

                  label40: {
                     while (var9 < var10) {
                        String var11 = var7[var9];
                        boolean var12 = false;
                        if (var2 == null) {
                           var14 = Intrinsics.areEqual(var11, var1);
                           if (var2 != null) {
                              break label40;
                           }

                           if (!((Boolean)var14)) {
                              var14 = var9;
                              break label40;
                           }

                           var9++;
                        }

                        if (var2 != null) {
                           break;
                        }
                     }

                     var14 = -1;
                  }

                  int var6 =((Integer)( var14));
                  if (var2 != null) {
                     return;
                  }

                  if (var6 >= 0) {
                     var4.j(var6);
                  }
               }

               var10002 = 30013;
               var10003 = 2002;
               this.c("Loaded " + var1);
            }

            return;
         }
      }
   }

   public final void c() {
      short var10000 = 30014;
      short var10001 = -21386;
      String var2 = "Custom Theme";
      int[] var15 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      Object var3 = null;
      var3 = var2;
      int[] var1 = var15;
      int var4 = 2;

      while (true) {
         if (llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c((String)var3)) {
            var3 = var2 + " " + var4;
            var4++;
            if (var1 != null) {
               break;
            }

            if (var1 == null) {
               continue;
            }
         }

         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .d((String)var3);
         lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = null;
         lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = null;
         this.e();
         break;
      }

      int var16 = ((llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII)) ? 1 : 0);
      if (var1 == null) {
         if ((var16 != 0)) {
            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = (String)var3;
            lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = false;
            lIIllIlIllIIIIlIllIlllIIIIIlIllIIIIlIlIIllIIIIIIlIIlIIlIlllIlIIllIlIIlIlIIIIlIllIIIII var5 = (lIIllIlIllIIIIlIllIlllIIIIIlIllIIIIlIlIIllIIIIIIlIIlIIlIlllIlIIllIlIIlIlIIIIlIllIIIII)CollectionsKt.firstOrNull(
               lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
            );
            label55:
            if (var1 == null) {
               if (var5 != null) {
                  String[] var6 = var5.W();
                  String[] var8 = var6;
                  boolean var9 = false;
                  int var10 = 0;
                  int var11 = var6.length;

                  label50: {
                     while (var10 < var11) {
                        String var12 = var8[var10];
                        boolean var13 = false;
                        if (var1 == null) {
                           var16 = ((Intrinsics.areEqual(var12, var3)) ? 1 : 0);
                           if (var1 != null) {
                              break label50;
                           }

                           if (var16 != 0) {
                              var16 = var10;
                              break label50;
                           }

                           var10++;
                        }

                        if (var1 != null) {
                           break;
                        }
                     }

                     var16 = -1;
                  }

                  int var7 = var16;
                  if (var1 != null) {
                     break label55;
                  }

                  if (var7 >= 0) {
                     var5.j(var7);
                  }
               }

               short var10002 = 29953;
               short var10003 = 11767;
               this.c("Created " + var3);
            }

            if (var1 == null) {
               return;
            }
         }

         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = null;
         var16 = 1;
      }

      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = (var16 != 0);
      var10001 = 29978;
      short var19 = 28122;
      this.c("Save failed");
   }

   @Nullable
   public final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII a(
      float var1, float var2, float var3, float var4, int var5, int var6
   ) {
      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var61 = null; // PX-FIX
      Object var60 = null; // PX-FIX
      Object var58 = null; // PX-FIX
      Object var57 = null; // PX-FIX
      Object var53 = null; // PX-FIX
      int[] var7;
      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var8;
      float var10;
      float var11;
      float var12;
      float var13;
      float var14;
      float var16;
      float var17;
      float var18;
      float var19;
      float var20;
      byte var21;
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var52;
      label211: {
         int[] var10000 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
         this.r();
         var8 = null;
         float var9 = 14.0F;
         var7 = var10000;
         var10 = var1 + var9;
         var11 = var2 + var9;
         var12 = var1 + var3 - var9;
         var13 = var2 + var4 - var9;
         var14 = 56.0F;
         float var15 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .ar();
         var16 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .aq();
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var10,
            var11,
            var12 - var10,
            var14,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .j(),
            var15
         );
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var10,
            var11,
            var12 - var10,
            var14,
            1.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .y()
               .a(0.45F),
            var15
         );
         short var10001 = 29967;
         short var10002 = 24690;
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
            me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
            "THEME NAME",
            var10 + 14.0F,
            var11 + 7.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .c()
               .a(0.7F),
            false);
         var17 = 280.0F;
         var18 = 28.0F;
         var19 = var10 + 14.0F;
         var20 = var11 + 20.0F;
         var21 = ((byte)((this.a(var5, var6, var19, var20, var19 + var17, var20 + var18)) ? 1 : 0));
         byte var51 =((byte)(( llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) ? 1 : 0));
         if (var7 == null) {
            if (llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) {
               var52 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .h();
               break label211;
            }

            var51 = var21;
         }

         var52 =(( (var51 != 0)
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .g()
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .e()));
      }

      label204: {
         me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var22 = var52;
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var19, var20, var17, var18, var22, var16);
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var19,
            var20,
            var17,
            var18,
            1.0F,
            llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
               ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ah()
               : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .y()
                  .a(0.6F),
            var16
         );
         if (var7 == null) {
            var53 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
            if (lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl != null) {
               break label204;
            }
         }

         var53 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a();
      }

      String var23;
      label214: {
         var23 =((String)( var53));
         int var54 =(( llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) ? 1 : 0);
         if (var7 == null) {
            if (!llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) {
               break label214;
            }

            var54 = ((lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.a()) ? 1 : 0);
         }

         if (var7 == null) {
            if (var54 == 0) {
               break label214;
            }

            var54 = var23.length();
         }

         if (var7 == null) {
            var54 = var54 > 0 ? 1 : 0;
         }

         if (var54 != 0) {
            lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(
                  var19 + 10.0F,
                  var20 + 7.0F,
                  (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll, var23, false, 2, null),
                  14.0F
               );
         }
      }

      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll var55 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
      CharSequence var24 = var23;
      Object var65;
      if (StringsKt.isBlank(var24)) {
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll var41 = var55;
         short var56 = 30004;
         boolean var25 = false;
         short var64 = -4935;
         var65 = "Untitled";
         var55 = var41;
      } else {
         var65 = var24;
      }

      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
         String.valueOf(var55),
         (String)var65,
         var19 + 10.0F,
         var20 + 8.0F,
         StringsKt.isBlank(var23)
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
               .a(0.7F)
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(),
         false);
      var57 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      label186:
      if (var7 == null) {
         if (llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) {
            long var95;
            var57 = (var95 = System.currentTimeMillis() / 530L % 2L - 0L) == 0L ? 0 : (var95 < 0L ? -1 : 1);
            if (var7 != null) {
               break label186;
            }

            if (!((Boolean)var57)) {
               float var42 = var19
                  + 10.0F
                  + (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll, var23, false, 2, null)
                  + 1.0F;
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                  var42,
                  var20 + 7.0F,
                  1.5F,
                  14.0F,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(),
                  0.0F
               );
            }
         }

         var57 = var21;
      }

      final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
           this("", "", false, null); // PX-FIX: 委托主构造器（final 字段初始化）
        }

         private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         private final boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         private final Function0<Unit> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         private static String[] a;
         private static String[] b;

         public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            String var1, String var2, boolean var3, Function0<Unit> var4
         ) {
            short var10001 = 21884;
            short var10002 = 5172;
            Intrinsics.checkNotNullParameter(var1, "icon");
            var10001 = 21872;
            var10002 = -1352;
            Intrinsics.checkNotNullParameter(var2, "tip");
            var10001 = 21880;
            var10002 = -17461;
            Intrinsics.checkNotNullParameter(var4, "onPress");
            super();
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         }

         public final String a() {
            return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         }

         public final String b() {
            return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         public final boolean c() {
            return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         public final Function0<Unit> d() {
            return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         public final String e() {
            return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         }

         public final String f() {
            return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         public final boolean g() {
            return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         public final Function0<Unit> h() {
            return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         public final llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
            String var1, String var2, boolean var3, Function0<Unit> var4
         ) {
            short var10001 = 21885;
            short var10002 = -6538;
            Intrinsics.checkNotNullParameter(var1, "icon");
            var10001 = 21883;
            var10002 = 10400;
            Intrinsics.checkNotNullParameter(var2, "tip");
            var10001 = 21886;
            var10002 = -19795;
            Intrinsics.checkNotNullParameter(var4, "onPress");
            return new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(var1, var2, var3, var4);
         }

         @Override
         public String toString() {
            short var10000 = 21882;
            Function0 var1 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            boolean var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            String var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            String var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            short var10001 = 13111;
            short var10002 = 21873;
            short var10003 = -28197;
            short var10004 = 21881;
            short var10005 = 11737;
            short var10006 = 21887;
            short var10007 = 30658;
            return "ActionBtn(icon=" + var4 + ", tip=" + var3 + ", accent=" + var2 + ", onPress=" + var1 + ")";
         }

         @Override
         public int hashCode() {
            int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
            var1 = var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
            var1 = var1 * 31 + Boolean.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
            return var1 * 31 + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.hashCode();
         }

         @Override
         public boolean equals(Object var1) {
            int[] var2 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
            Object var10000 = this;
            if (var2 == null) {
               if (this == var1) {
                  return true;
               }

               var10000 = var1;
            }

            if (var2 == null) {
               if (!(var10000 instanceof llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)) {
                  return false;
               }

               var10000 = var1;
            }

            llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
            boolean var4 = Intrinsics.areEqual(
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            );
            if (var2 == null) {
               if (!var4) {
                  return false;
               }

               var4 = Intrinsics.areEqual(
                  this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                  var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               );
            }

            if (var2 == null) {
               if (!var4) {
                  return false;
               }

               var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }

            if (var2 == null) {
               if (var4 != var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
                  return false;
               }

               var4 = Intrinsics.areEqual(
                  this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
                  var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
               );
            }

            if (var2 == null) {
               if (!var4) {
                  return false;
               }

               var4 = true;
            }

            return var4;
         }

         // $VF: Irreducible bytecode was duplicated to produce valid code
         static {
   pxClinit: {
            String[] var5 = new String[10];
            int var3 = 0;
            String var2 = "\u0014P;Q'_É\t8\u001d¤nÅ\u009dNH©\u000f=NÑ%Ð´M\u00073Y&\u001aÕµC\u0003~®.\u0004D;È\u008c\u0004Ê%\u0019O\u0007.\u007f|´ÏãÔ\ni\u008d\u0080q½Å\u001f±§}";
            int var4 = "\u0014P;Q'_É\t8\u001d¤nÅ\u009dNH©\u000f=NÑ%Ð´M\u00073Y&\u001aÕµC\u0003~®.\u0004D;È\u008c\u0004Ê%\u0019O\u0007.\u007f|´ÏãÔ\ni\u008d\u0080q½Å\u001f±§}"
               .length();
            char var1 = 7;
            int var8 = -1;

            label52:
            while (true) {
               byte var10000 = 7;
               String var10001 = var2.substring(++var8, var8 + var1);
               byte var10002 = -1;

               while (true) {
                  label47: {
                     char[] var24 = var10001.toCharArray();
                     int var10004 = var24.length;
                     int var6 = 0;
                     byte var27 = var10000;
                     ((llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI)null).var20 = var24;
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
                           case 0 -> 6;
                           case 1 -> 83;
                           case 2 -> 76;
                           case 3 -> 7;
                           case 4 -> 17;
                           case 5 -> 61;
                           default -> 82;
                        });
                        var6++;
                        if (var27 == 0) {
                           var10006 = var27;
                           var36 = ((llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI)null).var20;
                           var32 = var27;
                        } else {
                           if (var14 <= var6) {
                              break;
                           }

                           var36 = ((llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI)null).var20;
                           var32 = var27;
                           var10006 = var6;
                        }
                     }
                  }

                  String var29 = new String(((llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI)null).var20).intern();
                  switch (var10002) {
                     case 0:
                        var5[var3++] = var29;
                        if ((var8 += var1) >= var4) {
                           a = var5;
                           b = new String[10];
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

                        var2 = "jüö\u0006ºY»¶ØÏ";
                        var4 = "jüö\u0006ºY»¶ØÏ".length();
                        var1 = 3;
                        var8 = -1;
                  }

                  var10000 = 87;
                  var10001 = var2.substring(++var8, var8 + var1);
                  var10002 = 0;
               }
            }
         }
}

         private static String a(int var0, int var1) {
            int var2 = (var0 ^ 21880) & 65535;
            if (b[var2] == null) {
               char[] var3 = a[var2].toCharArray();

               short var4 = switch (var3[0] & 0xFF) {
                  case 0 -> 174;
                  case 1 -> 99;
                  case 2 -> 41;
                  case 3 -> 98;
                  case 4 -> 221;
                  case 5 -> 86;
                  case 6 -> 135;
                  case 7 -> 136;
                  case 8 -> 15;
                  case 9 -> 228;
                  case 10 -> 250;
                  case 11 -> 185;
                  case 12 -> 14;
                  case 13 -> 46;
                  case 14 -> 56;
                  case 15 -> 161;
                  case 16 -> 95;
                  case 17 -> 208;
                  case 18 -> 55;
                  case 19 -> 34;
                  case 20 -> 25;
                  case 21 -> 81;
                  case 22 -> 243;
                  case 23 -> 210;
                  case 24 -> 114;
                  case 25 -> 40;
                  case 26 -> 43;
                  case 27 -> 28;
                  case 28 -> 72;
                  case 29 -> 125;
                  case 30 -> 111;
                  case 31 -> 232;
                  case 32 -> 239;
                  case 33 -> 240;
                  case 34 -> 27;
                  case 35 -> 31;
                  case 36 -> 191;
                  case 37 -> 217;
                  case 38 -> 17;
                  case 39 -> 147;
                  case 40 -> 198;
                  case 41 -> 230;
                  case 42 -> 10;
                  case 43 -> 170;
                  case 44 -> 140;
                  case 45 -> 132;
                  case 46 -> 129;
                  case 47 -> 109;
                  case 48 -> 220;
                  case 49 -> 167;
                  case 50 -> 120;
                  case 51 -> 101;
                  case 52 -> 159;
                  case 53 -> 0;
                  case 54 -> 162;
                  case 55 -> 178;
                  case 56 -> 53;
                  case 57 -> 196;
                  case 58 -> 92;
                  case 59 -> 105;
                  case 60 -> 186;
                  case 61 -> 234;
                  case 62 -> 117;
                  case 63 -> 195;
                  case 64 -> 223;
                  case 65 -> 175;
                  case 66 -> 103;
                  case 67 -> 177;
                  case 68 -> 211;
                  case 69 -> 8;
                  case 70 -> 83;
                  case 71 -> 193;
                  case 72 -> 182;
                  case 73 -> 169;
                  case 74 -> 190;
                  case 75 -> 87;
                  case 76 -> 35;
                  case 77 -> 70;
                  case 78 -> 251;
                  case 79 -> 233;
                  case 80 -> 61;
                  case 81 -> 63;
                  case 82 -> 229;
                  case 83 -> 113;
                  case 84 -> 155;
                  case 85 -> 62;
                  case 86 -> 76;
                  case 87 -> 119;
                  case 88 -> 54;
                  case 89 -> 203;
                  case 90 -> 183;
                  case 91 -> 85;
                  case 92 -> 128;
                  case 93 -> 244;
                  case 94 -> 50;
                  case 95 -> 218;
                  case 96 -> 197;
                  case 97 -> 165;
                  case 98 -> 236;
                  case 99 -> 130;
                  case 100 -> 89;
                  case 101 -> 78;
                  case 102 -> 215;
                  case 103 -> 71;
                  case 104 -> 126;
                  case 105 -> 137;
                  case 106 -> 200;
                  case 107 -> 201;
                  case 108 -> 24;
                  case 109 -> 134;
                  case 110 -> 139;
                  case 111 -> 23;
                  case 112 -> 231;
                  case 113 -> 242;
                  case 114 -> 108;
                  case 115 -> 171;
                  case 116 -> 237;
                  case 117 -> 9;
                  case 118 -> 106;
                  case 119 -> 246;
                  case 120 -> 42;
                  case 121 -> 156;
                  case 122 -> 97;
                  case 123 -> 173;
                  case 124 -> 51;
                  case 125 -> 254;
                  case 126 -> 110;
                  case 127 -> 149;
                  case 128 -> 21;
                  case 129 -> 59;
                  case 130 -> 118;
                  case 131 -> 75;
                  case 132 -> 224;
                  case 133 -> 202;
                  case 134 -> 102;
                  case 135 -> 166;
                  case 136 -> 192;
                  case 137 -> 199;
                  case 138 -> 144;
                  case 139 -> 188;
                  case 140 -> 209;
                  case 141 -> 57;
                  case 142 -> 122;
                  case 143 -> 158;
                  case 144 -> 241;
                  case 145 -> 131;
                  case 146 -> 115;
                  case 147 -> 127;
                  case 148 -> 12;
                  case 149 -> 145;
                  case 150 -> 214;
                  case 151 -> 204;
                  case 152 -> 168;
                  case 153 -> 157;
                  case 154 -> 52;
                  case 155 -> 44;
                  case 156 -> 18;
                  case 157 -> 160;
                  case 158 -> 176;
                  case 159 -> 1;
                  case 160 -> 77;
                  case 161 -> 124;
                  case 162 -> 227;
                  case 163 -> 45;
                  case 164 -> 143;
                  case 165 -> 68;
                  case 166 -> 73;
                  case 167 -> 181;
                  case 168 -> 80;
                  case 169 -> 32;
                  case 170 -> 152;
                  case 171 -> 133;
                  case 172 -> 249;
                  case 173 -> 194;
                  case 174 -> 187;
                  case 175 -> 64;
                  case 176 -> 66;
                  case 177 -> 7;
                  case 178 -> 93;
                  case 179 -> 172;
                  case 180 -> 88;
                  case 181 -> 141;
                  case 182 -> 255;
                  case 183 -> 48;
                  case 184 -> 138;
                  case 185 -> 253;
                  case 186 -> 154;
                  case 187 -> 3;
                  case 188 -> 90;
                  case 189 -> 153;
                  case 190 -> 58;
                  case 191 -> 47;
                  case 192 -> 238;
                  case 193 -> 38;
                  case 194 -> 74;
                  case 195 -> 4;
                  case 196 -> 184;
                  case 197 -> 189;
                  case 198 -> 148;
                  case 199 -> 180;
                  case 200 -> 116;
                  case 201 -> 22;
                  case 202 -> 205;
                  case 203 -> 212;
                  case 204 -> 164;
                  case 205 -> 163;
                  case 206 -> 69;
                  case 207 -> 100;
                  case 208 -> 82;
                  case 209 -> 94;
                  case 210 -> 247;
                  case 211 -> 26;
                  case 212 -> 104;
                  case 213 -> 91;
                  case 214 -> 67;
                  case 215 -> 146;
                  case 216 -> 5;
                  case 217 -> 29;
                  case 218 -> 179;
                  case 219 -> 216;
                  case 220 -> 207;
                  case 221 -> 19;
                  case 222 -> 16;
                  case 223 -> 151;
                  case 224 -> 213;
                  case 225 -> 235;
                  case 226 -> 49;
                  case 227 -> 2;
                  case 228 -> 60;
                  case 229 -> 65;
                  case 230 -> 30;
                  case 231 -> 11;
                  case 232 -> 219;
                  case 233 -> 248;
                  case 234 -> 206;
                  case 235 -> 20;
                  case 236 -> 142;
                  case 237 -> 79;
                  case 238 -> 39;
                  case 239 -> 13;
                  case 240 -> 6;
                  case 241 -> 36;
                  case 242 -> 96;
                  case 243 -> 150;
                  case 244 -> 123;
                  case 245 -> 107;
                  case 246 -> 33;
                  case 247 -> 222;
                  case 248 -> 245;
                  case 249 -> 84;
                  case 250 -> 226;
                  case 251 -> 252;
                  case 252 -> 225;
                  case 253 -> 112;
                  case 254 -> 121;
                  default -> 37;
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

      if (((Boolean)(var57))) {
         var8 = this.a(llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI::s);
      }

      float var43 = 28.0F;
      float var44 = var11 + (var14 - var43) / 2.0F;
      float var26 = 6.0F;
      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[] var28 = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[8];
      short var10004 = 29954;
      short var10005 = 26149;
      var10005 = 29975;
      short var10006 = -713;
      var28[0] = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         "\n    <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n        <path d=\"M19 21H5a2 2 0 0 1-2-2V5a2 2 0 0 1 2-2h11l5 5v11a2 2 0 0 1-2 2z\"/>\n        <polyline points=\"17,21 17,13 7,13 7,21\"/>\n        <polyline points=\"7,3 7,8 15,8\"/>\n    </svg>\n",
         "Save",
         true,
         llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI::t
      );
      var10004 = 30044;
      var10005 = -5388;
      var10005 = 30033;
      var10006 = 17442;
      var28[1] = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         "\n    <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n        <line x1=\"12\" y1=\"5\" x2=\"12\" y2=\"19\"/>\n        <line x1=\"5\" y1=\"12\" x2=\"19\" y2=\"12\"/>\n    </svg>\n",
         "New",
         false,
         (kotlin.jvm.functions.Function0)(llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI::u),
         4,
         null
      );
      var10004 = 30043;
      var10005 = -17709;
      var10005 = 30034;
      var10006 = 30446;
      var28[2] = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n            <path d=\"M21 15v4a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2v-4\"/>\n            <polyline points=\"17,8 12,3 7,8\"/>\n            <line x1=\"12\" y1=\"3\" x2=\"12\" y2=\"15\"/>\n        </svg>\n    ",
         "Export to clipboard",
         false,
         (kotlin.jvm.functions.Function0)(llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI::v),
         4,
         null
      );
      var10004 = 30059;
      var10005 = -7611;
      var10005 = 29956;
      var10006 = 23549;
      var28[3] = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n            <path d=\"M21 15v4a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2v-4\"/>\n            <polyline points=\"7,10 12,15 17,10\"/>\n            <line x1=\"12\" y1=\"15\" x2=\"12\" y2=\"3\"/>\n        </svg>\n    ",
         "Import from clipboard",
         false,
         (kotlin.jvm.functions.Function0)(llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI::w),
         4,
         null
      );
      var10004 = 30052;
      var10005 = 16202;
      var10005 = 30008;
      var10006 = 4772;
      var28[4] = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n            <path d=\"M19 21H5a2 2 0 0 1-2-2V5a2 2 0 0 1 2-2h11l5 5v11a2 2 0 0 1-2 2z\"/>\n            <polyline points=\"17,21 17,13 7,13 7,21\"/>\n            <polyline points=\"7,3 7,8 15,8\"/>\n        </svg>\n    ",
         "Export to file",
         false,
         (kotlin.jvm.functions.Function0)(llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI::x),
         4,
         null
      );
      var10004 = 30021;
      var10005 = -1197;
      var10005 = 30009;
      var10006 = -29614;
      var28[5] = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         "\n<svg viewBox=\"0 0 24 24\" fill=\"none\" xmlns=\"http://www.w3.org/2000/svg\"><g id=\"SVGRepo_bgCarrier\" stroke-width=\"0\"></g><g id=\"SVGRepo_tracerCarrier\" stroke-linecap=\"round\" stroke-linejoin=\"round\"></g><g id=\"SVGRepo_iconCarrier\"> <path d=\"M2 6.94975C2 6.06722 2 5.62595 2.06935 5.25839C2.37464 3.64031 3.64031 2.37464 5.25839 2.06935C5.62595 2 6.06722 2 6.94975 2C7.33642 2 7.52976 2 7.71557 2.01738C8.51665 2.09229 9.27652 2.40704 9.89594 2.92051C10.0396 3.03961 10.1763 3.17633 10.4497 3.44975L11 4C11.8158 4.81578 12.2237 5.22367 12.7121 5.49543C12.9804 5.64471 13.2651 5.7626 13.5604 5.84678C14.0979 6 14.6747 6 15.8284 6H16.2021C18.8345 6 20.1506 6 21.0062 6.76946C21.0849 6.84024 21.1598 6.91514 21.2305 6.99383C22 7.84935 22 9.16554 22 11.7979V14C22 17.7712 22 19.6569 20.8284 20.8284C19.6569 22 17.7712 22 14 22H10C6.22876 22 4.34315 22 3.17157 20.8284C2 19.6569 2 17.7712 2 14V6.94975Z\" stroke=\"currentColor\" stroke-width=\"1.5\"></path> <circle cx=\"12\" cy=\"13\" r=\"2\" stroke=\"currentColor\" stroke-width=\"1.5\"></circle> <path d=\"M11.25 17.5C11.25 17.9142 11.5858 18.25 12 18.25C12.4142 18.25 12.75 17.9142 12.75 17.5H11.25ZM11.25 15V17.5H12.75V15H11.25Z\" fill=\"#ffffff\"></path> </g></svg>\n   ",
         "Open themes folder",
         false,
         (kotlin.jvm.functions.Function0)(llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI::y),
         4,
         null
      );
      var10004 = 30042;
      var10005 = 25427;
      var10005 = 30068;
      var10006 = -30051;
      var28[6] = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n            <polyline points=\"23,4 23,10 17,10\"/>\n            <polyline points=\"1,20 1,14 7,14\"/>\n            <path d=\"m20.49 9A9 9 0 0 0 5.64 5.64L1 10m22 4l-4.64 4.36A9 9 0 0 1 3.51 15\"/>\n        </svg>\n    ",
         "Capture current",
         false,
         (kotlin.jvm.functions.Function0)(llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI::z),
         4,
         null
      );
      var10004 = 30072;
      var10005 = -1034;
      var10005 = 30077;
      var10006 = -4576;
      var28[7] = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         "\n    <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n        <polyline points=\"3,6 5,6 21,6\"/>\n        <path d=\"M19 6v14a2 2 0 0 1-2 2H7a2 2 0 0 1-2-2V6m3 0V4a2 2 0 0 1 2-2h4a2 2 0 0 1 2 2v2\"/>\n        <line x1=\"10\" y1=\"11\" x2=\"10\" y2=\"17\"/>\n        <line x1=\"14\" y1=\"11\" x2=\"14\" y2=\"17\"/>\n    </svg>\n",
         "Delete this theme",
         true,
         (kotlin.jvm.functions.Function0)(llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI::A)
      );
      List var27 = CollectionsKt.listOf(var28);
      float var45 = var12 - 14.0F;
      Iterator var29 = CollectionsKt.reversed(var27).iterator();

      while (true) {
         if (var29.hasNext()) {
            llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var30 = (llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var29.next();
            var45 -= var43;
            byte var32 = ((byte)((this.a(var5, var6, var45, var44, var45 + var43, var44 + var43)) ? 1 : 0));
            var58 = var30.c();
            if (var7 != null) {
               break;
            }

            label173: {
               if (var7 == null) {
                  if (!((Boolean)var58)) {
                     var52 = var32 != 0
                        ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .g()
                        : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .e();
                     break label173;
                  }

               }

                        var52 = var32 != 0
                  ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .ah()
                        .a(0.35F)
                  : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .ah()
                        .a(0.25F);
            }

            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var33 = var52;
            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var34 = var30.c()
               ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ah()
                  .a(0.7F)
               : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .y()
                  .a(0.6F);
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var45, var44, var43, var43, var33, var16
            );
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var45, var44, var43, var43, 1.0F, var34, var16
            );
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(
                  var30.a(),
                  var45 + 7.0F,
                  var44 + 7.0F,
                  var43 - 14.0F,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(),
                  1.0F
               );
            label165:
            if (var7 == null) {
               if (var32 != 0) {
                  this.a(var45 + var43 / 2.0F, var44 - 4.0F, var30.b());
                  if (var7 != null) {
                     break label165;
                  }

                  if (var8 == null) {
                     var8 = this.a(var30.d());
                  }
               }

               var45 -= var26;
            }

            if (var7 == null) {
               continue;
            }

            me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
               new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[4]
            );
         }

         var58 = lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll.length();
         break;
      }

      if (var7 == null) {
         var58 = ((Boolean)var58) ? 1 : 0;
      }

      label153: {
         if (!((Boolean)var58)) {
            long var96;
            var60 = (var96 = System.currentTimeMillis() - llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl) == 0L
               ? 0
               : (var96 < 0L ? -1 : 1);
            if (var7 != null) {
               break label153;
            }

            if (((Boolean)var60)) {
               float var46 = var19 + var17 + 18.0F;
               me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll, var46, var11 + var14 / 2.0F, IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .ah()
                     .a(0.95F), false, 16, null);
            }
         }

         var60 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      if (!((Boolean)var60)) {
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var19 + var17 + 8.0F,
            var20 + var18 / 2.0F,
            3.5F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .aj()
         );
      }

      float var47 = var11 + var14 + 10.0F;
      float var48 = 230.0F;
      float var49 = var13 - var47;
      float var50 = var10 + var48 + 10.0F;
      float var36 = var12 - var50;
      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var38 = this.b(var10, var47, var48, var49, var5, var6);
      var61 = var38;
      label146:
      if (var7 == null) {
         if (var38 != null) {
            var61 = var8;
            if (var7 != null) {
               break label146;
            }

            if (var8 == null) {
               var8 = var38;
            }
         }

         var61 = this.c(var50, var47, var36, var49, var5, var6);
      }

      label217: {
         IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var39 = var61;
         IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var62 = var39;
         if (var7 == null) {
            if (var39 == null) {
               break label217;
            }

            var62 = var8;
         }

         if (var7 == null) {
            if (var62 != null) {
               break label217;
            }

            var62 = var39;
         }

         var8 = var62;
      }

      if (llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI == null) {
         return var8;
      } else {
         IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var40 = lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
         return var7 == null && var40 != null ? var40 : IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
      }
   }

   private final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII b(
      float var1, float var2, float var3, float var4, int var5, int var6
   ) {
      float var8 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .ar();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var4,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .j(),
         var8
      );
      int[] var10000 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var4,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(0.45F),
         var8
      );
      int var10002 = 30025;
      short var10003 = -29332;
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll,
         "Saved Themes",
         var1 + 14.0F,
         var2 + 12.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         false);
      List var9 = llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b();
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll var10001 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      var10002 = var9.size();
      var10003 = 30049;
      short var10004 = 17330;
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
         String.valueOf(var10001),
         var10002 + " CUSTOM",
         var1 + 14.0F,
         var2 + 28.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c()
            .a(0.7F),
         false);
      float var10 = var2 + 50.0F;
      int[] var7 = var10000;
      float var11 = 32.0F;
      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var12 = null;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var1 + 1.0F, var10, var3 - 2.0F, var4 - (var10 - var2) - 6.0F);
      float var13 = var10 - IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      String[] var15 = new String[12];
      short var34 = 29971;
      var10003 = 29106;
      var15[0] = "Dark";
      var34 = 30065;
      var10003 = 10770;
      var15[1] = "Midnight Blue";
      var34 = 30011;
      var10003 = -28137;
      var15[2] = "Clear";
      var34 = 30028;
      var10003 = 14149;
      var15[3] = "Cotton Candy";
      var34 = 29966;
      var10003 = 22718;
      var15[4] = "Forest Green";
      var34 = 30017;
      var10003 = 861;
      var15[5] = "Deep Space";
      var34 = 30073;
      var10003 = 6780;
      var15[6] = "Ocean Blue";
      var34 = 30078;
      var10003 = -2642;
      var15[7] = "Pastel Lavander";
      var34 = 29970;
      var10003 = -27127;
      var15[8] = "Volcano Red";
      var34 = 30056;
      var10003 = -19948;
      var15[9] = "Catppuccin Frappé";
      var34 = 30075;
      var10003 = 29002;
      var15[10] = "Mint Breeze";
      var34 = 29957;
      var10003 = -13454;
      var15[11] = "Catppuccin Mocha";
      String[] var14 = var15;
      int var20 = 0;
      int var16 = var15.length;

      while (true) {
         if (var20 < var16) {
            String var18 = var14[var20];
            IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var19 = this.a(
               var1,
               var13,
               var3,
               var11,
               var18,
               this.b(var18, var20),
               false,
               var5,
               var6,
               null
            );
            if (var7 != null) {
               break;
            }

            if (var7 == null) {
               label71:
               if (var19 != null) {
                  IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var29 = var12;
                  if (var7 == null) {
                     if (var12 != null) {
                        break label71;
                     }

                     var29 = var19;
                  }

                  var12 = var29;
               }

               var13 += var11 + 2.0F;
               var20++;
            }

            if (var7 == null) {
               continue;
            }
         }

         short var32 = 29968;
         var34 = -15094;
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
            me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
            "CUSTOM",
            var1 + 14.0F,
            var13 + 4.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .c()
               .a(0.5F),
            false);
         var13 += 22.0F;
         break;
      }

      for (String var23 :((String[])(Object)( var9))) {
         boolean var17 = Intrinsics.areEqual(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, var23);
         IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var26 = this.a(
            var1, var13, var3, var11, var23, var17, true, var5, var6, null
         );
         if (var7 == null) {
            label52:
            if (var26 != null) {
               IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var30 = var12;
               if (var7 == null) {
                  if (var12 != null) {
                     break label52;
                  }

                  var30 = var26;
               }

               var12 = var30;
            }

            var13 += var11 + 2.0F;
         }

         if (var7 != null) {
            break;
         }
      }

      float var22 = 36.0F;
      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var24 = this.a(
         var1, var13 + 4.0F, var3, var22, var5, var6, llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI::B
      );
      if (var7 == null) {
         label39:
         if (var24 != null) {
            IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var31 = var12;
            if (var7 == null) {
               if (var12 != null) {
                  break label39;
               }

               var31 = var24;
            }

            var12 = var31;
         }

         var13 += var22 + 6.0F;
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .i();
      }

      float var25 = var13 + IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll - var10;
      float var27 = var4 - (var10 - var2) - 6.0F;
      float var28 = RangesKt.coerceAtLeast(var25 - var27, 0.0F);
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = RangesKt.coerceIn(
         lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll, 0.0F, var28
      );
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = RangesKt.coerceIn(
         IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, 0.0F, var28
      );
      return var12;
   }

   private final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII a(
      float var1, float var2, float var3, float var4, int var5, int var6, Function0<Unit> var7
   ) {
      float var8 = var1 + 8.0F;
      float var9 = var3 - 16.0F;
      boolean var10 = this.a(var5, var6, var8, var2, var8 + var9, var2 + var4);
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var11 = var10
         ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .ah()
            .a(0.25F)
         : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e()
            .a(0.6F);
      float var12 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .aq();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var8, var2, var9, var4, var11, var12);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var8,
         var2,
         var9,
         var4,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .ah()
            .a(var10 ? 0.95F : 0.7F),
         var12
      );
      float var13 = 14.0F;
      float var14 = var8 + 6.0F;
      short var10001 = 30055;
      short var10002 = 9587;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            "\n    <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n        <line x1=\"12\" y1=\"5\" x2=\"12\" y2=\"19\"/>\n        <line x1=\"5\" y1=\"12\" x2=\"19\" y2=\"12\"/>\n    </svg>\n",
            var14,
            var2 + (var4 - var13) / 2.0F,
            var13,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .ah(),
            1.0F
         );
      var10001 = 30045;
      var10002 = -13237;
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.d(
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         "Create New",
         var14 + var13 + 8.0F,
         var2 + var4 / 2.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         false);
      return var10 ? this.a(var7) : null;
   }

   private final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII a(
      float var1, float var2, float var3, float var4, String var5, boolean var6, boolean var7, int var8, int var9, Function0<Unit> var10
   ) {
      Object var29 = null; // PX-FIX
      int[] var11;
      float var12;
      float var13;
      boolean var14;
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var27;
      label73: {
         int[] var10000 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
         var12 = var1 + 8.0F;
         var13 = var3 - 16.0F;
         var11 = var10000;
         var14 = this.a(var8, var9, var12, var2, var12 + var13, var2 + var4);
         boolean var26 = var6;
         if (var11 == null) {
            if (var6) {
               var27 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .h();
               break label73;
            }

            var26 = var14;
         }

         var27 = var26
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .g()
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .e()
               .a(0.6F);
      }

      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var15 = var27;
      float var16 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .aq();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var12, var2, var13, var4, var15, var16);
      boolean var28 = var6;
      if (var11 == null) {
         if (var6) {
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var12,
               var2,
               var13,
               var4,
               1.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ah(),
               var16
            );
         }

         var28 = var7;
      }

      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var32;
      double var10002;
      double var10003;
      label64: {
         label63: {
            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var17 = var28
               ? new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(180, 200, 255)
               : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c();
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var12 + 11.0F, var2 + var4 / 2.0F, 3.2F, var17
            );
            float var18 = var12 + 22.0F;
            var29 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
            var10002 = var18;
            var10003 = var2 + var4 / 2.0F;
            boolean var10004 = var14;
            if (var11 == null) {
               if (var14) {
                  break label63;
               }

               var10004 = var6;
            }

            if (!var10004) {
               var32 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b();
               break label64;
            }
         }

         var32 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a();
      }

      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.d(
         var29, var5, var10002, var10003, var32, false);
      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var19 = null;
      if (var7) {
         float var20 = 26.0F;
         float var21 = var12 + var13 - var20 - 5.0F;
         float var22 = var2 + (var4 - var20) / 2.0F;
         boolean var23 = this.a(var8, var9, var21, var22, var21 + var20, var22 + var20);
         me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var24 = var23
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .ah()
               .a(0.35F)
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .ah()
               .a(0.18F);
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var21, var22, var20, var20, var24, var16);
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var21,
            var22,
            var20,
            var20,
            1.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .ah()
               .a(var23 ? 0.95F : 0.7F),
            var16
         );
         float var25 = 14.0F;
         short var10001 = 30030;
         short var31 = -7497;
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(
               "\n    <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n        <polyline points=\"3,6 5,6 21,6\"/>\n        <path d=\"M19 6v14a2 2 0 0 1-2 2H7a2 2 0 0 1-2-2V6m3 0V4a2 2 0 0 1 2-2h4a2 2 0 0 1 2 2v2\"/>\n        <line x1=\"10\" y1=\"11\" x2=\"10\" y2=\"17\"/>\n        <line x1=\"14\" y1=\"11\" x2=\"14\" y2=\"17\"/>\n    </svg>\n",
               var21 + (var20 - var25) / 2.0F,
               var22 + (var20 - var25) / 2.0F,
               var25,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(),
               1.0F
            );
         if (var23) {
            var19 = ((java.util.function.Supplier<IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII>)(() -> { this.a(String.valueOf((kotlin.jvm.functions.Function1)null)); return null; })).get();
         }
      }

      if (var14) {
         if (var11 != null) {
            return var19;
         }

         if (var19 == null) {
            var19 = this.a(var10);
         }
      }

      return var19;
   }

   private final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII c(
      float var1, float var2, float var3, float var4, int var5, int var6
   ) {
      Object var36 = null; // PX-FIX
      Object var35 = null; // PX-FIX
      int[] var10000 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      float var8 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .ar();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var4,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .j(),
         var8
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var4,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(0.45F),
         var8
      );
      float var9 = 38.0F;
      short var10002 = 30006;
      short var10003 = -31150;
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll,
         "Theme Editor",
         var1 + 14.0F,
         var2 + 12.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         false);
      var10002 = 29987;
      var10003 = -6318;
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
         "EDIT EVERY COLOR · LIVE PREVIEW",
         var1 + 14.0F,
         var2 + 28.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c()
            .a(0.65F),
         false);
      float var10 = var1 + 12.0F;
      float var11 = var2 + var9 + 4.0F;
      float var12 = var3 - 24.0F;
      float var13 = var4 - var9 - 16.0F;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var10, var11, var12, var13);
      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var14 = null;
      float var15 = var11 - IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      int[] var7 = var10000;

      for (llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var17 : llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a()) {
         float var18 = 26.0F;
         float var34 = var15 + var18;
         float var10001 = var11 - 30.0F;
         if (var7 == null) {
            if (var34 >= var10001) {
               me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
                  me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll,
                  var17.a(),
                  var10 + 4.0F,
                  var15 + 6.0F,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(),
                  false);
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(
                     var10 + 4.0F,
                     var15 + 22.0F,
                     var10 + var12 - 4.0F,
                     var15 + 22.0F,
                     1.0F,
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .A()
                        .a(0.4F)
                  );
            }

            var34 = var15;
            var10001 = var18;
         }

         float var19;
         float var20;
         label110: {
            var15 = var34 + var10001;
            var19 = 56.0F;
            var20 = 8.0F;
            float var41;
            var35 = (var41 = var12 - 700.0F) == 0.0F ? 0 : (var41 < 0.0F ? -1 : 1);
            if (var7 == null) {
               if (((Boolean)var35)) {
                  var35 = 4;
                  break label110;
               }

               float var42;
               var35 = (var42 = var12 - 500.0F) == 0.0F ? 0 : (var42 < 0.0F ? -1 : 1);
            }

            if (var7 == null) {
               var35 = ((Boolean)var35) ? 3 : 2;
            }
         }

         int var21 =((Integer)( var35));
         float var22 = (var12 - var20 * (var21 - 1)) / var21;
         int var23 = 0;
         float var24 = var15;
         Iterator var25 = var17.b().iterator();

         while (true) {
            if (var25.hasNext()) {
               String var26 = (String)var25.next();
               float var27 = var10 + var23 * (var22 + var20);
               float var43;
               var36 = (var43 = var15 + var19 - (var11 - 60.0F)) == 0.0F ? 0 : (var43 < 0.0F ? -1 : 1);
               if (var7 != null) {
                  break;
               }

               label83:
               if (var7 == null) {
                  label96: {
                     if (((Boolean)var36)) {
                        float var44;
                        var36 = (var44 = var15 - (var11 + var13 + 30.0F)) == 0.0F ? 0 : (var44 < 0.0F ? -1 : 1);
                        if (var7 != null) {
                           break label83;
                        }

                        if (((Boolean)var36)) {
                           IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var29 = this.a(
                              var27, var15, var22, var19, var26, var5, var6
                           );
                           if (var7 != null) {
                              break label96;
                           }

                           label91:
                           if (var29 != null) {
                              IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var37 = var14;
                              if (var7 == null) {
                                 if (var14 != null) {
                                    break label91;
                                 }

                                 var37 = var29;
                              }

                              var14 = var37;
                           }
                        }
                     }

                     var24 = var15 + var19;
                     var23++;
                  }

                  var36 = var23;
               }

               if (var7 == null) {
                  if (((Integer)var36) < (((var21 != 0) ? 1 : 0))) {
                     continue;
                  }

                  var36 = 0;
               }

               var23 =((Integer)( var36));
               var15 = var24 + var20;
               if (var7 == null) {
                  continue;
               }
            }

            var36 = var23;
            break;
         }

         if (!((Boolean)var36)) {
            var15 = var24 + var20;
         }

         var15 += 8.0F;
         if (var7 != null) {
            break;
         }
      }

      label67: {
         String var31 = llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
         label66:
         if (var31 != null) {
            label64: {
               boolean var38 = llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .d(var31);
               if (var7 == null) {
                  if (var38) {
                     break label64;
                  }

                  var38 = llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(var31);
               }

               if (!var38) {
                  break label66;
               }
            }

            lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = this.d(var10, var11, var12, var13, var5, var6);
            if (var7 == null) {
               break label67;
            }
         }

         lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = null;
      }

      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .i();
      float var32 = var15 + IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII - var11 + 12.0F;
      float var33 = RangesKt.coerceAtLeast(var32 - var13, 0.0F);
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = RangesKt.coerceIn(
         IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, 0.0F, var33
      );
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = RangesKt.coerceIn(
         IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, 0.0F, var33
      );
      return var14;
   }

   private final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII a(
      float var1, float var2, float var3, float var4, String var5, int var6, int var7
   ) {
      Object var63 = null; // PX-FIX
      Object var61 = null; // PX-FIX
      Object var59 = null; // PX-FIX
      Object var54 = null; // PX-FIX
      Object var53 = null; // PX-FIX
      Object var49 = null; // PX-FIX
      Object var48 = null; // PX-FIX
      int[] var8;
      boolean var9;
      boolean var10;
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var41;
      label216: {
         int[] var10000 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
         var9 = this.a(var6, var7, var1, var2, var1 + var3, var2 + var4);
         var8 = var10000;
         var10 = Intrinsics.areEqual(llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI, var5);
         boolean var40 = var10;
         if (var8 == null) {
            if (var10) {
               var41 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .h();
               break label216;
            }

            var40 = var9;
         }

         var41 = var40
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .g()
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .e()
               .a(0.6F);
      }

      float var12;
      float var13;
      float var14;
      label219: {
         float var15;
         float var16;
         label240: {
            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var11 = var41;
            var12 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .aq();
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var1, var2, var3, var4, var11, var12);
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var1,
               var2,
               var3,
               var4,
               1.0F,
               var10
                  ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .ah()
                  : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .y()
                     .a(0.45F),
               var12
            );
            var13 = var4 - 16.0F;
            var14 = var1 + 8.0F;
            var15 = var2 + 8.0F;
            var16 = RangesKt.coerceAtMost(var12, var13 / 2.0F);
            boolean var42 = llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(var5);
            if (var8 == null) {
               if (var42) {
                  label203: {
                     label202: {
                        label223: {
                           var41 = ((me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll)(Object)(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.c().get(var5)));
                           if (var8 == null) {
                              if (var41 != null) {
                                 break label203;
                              }

                              if (var8 != null) {
                                 break label223;
                              }

                              var41 = ((me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll)(Object)llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .c()
                                 .get(var5));
                           }

                           Function0 var44 = (Function0)(Object)var41;
                           if ((Function0)(Object)var41 != null) {
                              var41 = (me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll)(Object)var44.invoke();
                              break label202;
                           }
                        }

                        var41 = null;
                     }

                     if (var41 == null) {
                        float[] var20 = new float[]{0.0F, 0.0F, 0.0F};
                        var41 = ((me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll)(Object)(var20));
                     }
                  }

                  Object var17 = var41;
                  me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var18 = new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
                     (int)(((float[])var17)[0] * 255), (int)(((float[])var17)[1] * 255), (int)(((float[])var17)[2] * 255), 255
                  );
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                     var14, var15, var13, var13, var18, var16
                  );
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                     var14,
                     var15,
                     var13,
                     var13,
                     1.0F,
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .y()
                        .a(0.5F),
                     var16
                  );
                  if (var8 == null) {
                     break label219;
                  }
               }

               var41 = ((me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll)(Object)(llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl));
               if (var8 != null) {
                  break label240;
               }

               var42 = llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c(var5);
            }

            if (var42) {
               label182: {
                  label181: {
                     label226: {
                        Object var46 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.d().get(var5);
                        if (var8 == null) {
                           if (var46 != null) {
                              var49 = var46;
                              break label182;
                           }

                           if (var8 != null) {
                              break label226;
                           }

                           var46 = llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .d()
                              .get(var5);
                        }

                        Function0 var47 = (Function0)var46;
                        if ((Function0)var46 != null) {
                           var48 = (Float)var47.invoke();
                           break label181;
                        }
                     }

                     var48 = null;
                  }

                  var49 = var48 != null ? var48 : 0.0F;
               }

               float var25 =((Float)( var49));
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                  var14,
                  var15,
                  var13,
                  var13,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .e(),
                  var16
               );
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                  var14,
                  var15,
                  var13,
                  var13,
                  1.0F,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .y()
                     .a(0.5F),
                  var16
               );
               me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll
                  .a(
                     String.valueOf((int)var25),
                     var14 + var13 / 2.0F,
                     var15 + var13 / 2.0F,
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a()
                  );
               if (var8 == null) {
                  break label219;
               }
            }

            var41 = ((me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll)(Object)(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.b().get(var5)));
         }

         label163: {
            label162: {
               label228: {
                  Object var50 = (Integer)(Object)var41;
                  if (var8 == null) {
                     if (var50 != null) {
                        var54 = var50;
                        break label163;
                     }

                     if (var8 != null) {
                        break label228;
                     }

                     var50 = llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .b()
                        .get(var5);
                  }

                  Function0 var51 = (Function0)var50;
                  if ((Function0)var50 != null) {
                     me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var52 = (me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll)var51.invoke();
                     if (var52 != null) {
                        var53 = var52.o();
                        if (var8 == null) {
                           break label162;
                        }
                     }
                  }
               }

               var53 = null;
            }

            var54 = var53 != null ? var53 : 0;
         }

         int var26 =((Integer)( var54));
         this.a(var14, var15, var13, var13, var16);
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var14,
            var15,
            var13,
            var13,
            new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var26, true),
            var16
         );
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var14,
            var15,
            var13,
            var13,
            1.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .y()
               .a(0.5F),
            var16
         );
      }

      float var27;
      label230: {
         label231: {
            var27 = var14 + var13 + 10.0F;
            me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
               me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
               llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var5),
               var27,
               var2 + 11.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(),
               false);
            boolean var55 = llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(var5);
            if (var8 == null) {
               if (var55) {
                  label135: {
                     var61 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.c().get(var5);
                     if (var8 == null) {
                        if (var61 != null) {
                           break label135;
                        }

                        var61 = new float[3];
                     }

                     float[] var34 = ((float[])(Object)(((Float)( var61))));
                     var34[0] = 0.0F;
                     var34[1] = 0.0F;
                     var34[2] = 0.0F;
                     var61 = var34;
                  }

                  float[] var30 = ((float[])(Object)(((Float)( var61))));
                  short var62 = 30064;
                  short var65 = 23482;
                  String var35 = "%.2f, %.2f, %.2f";
                  Object[] var38 = new Object[]{var30[0], var30[1], var30[2]};
                  var59 = String.format(var35, Arrays.copyOf(var38, var38.length));
                  short var69 = 30076;
                  short var73 = -15686;
                  Intrinsics.checkNotNullExpressionValue(var59, "format(...)");
                  break label230;
               }

               var41 = ((me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll)(Object)(llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl));
               if (var8 != null) {
                  break label231;
               }

               var55 = llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c(var5);
            }

            if (var55) {
               Float var57 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.d().get(var5);
               float var19 = var57 != null ? var57 : 0.0F;
               short var58 = 30074;
               short var10001 = -12686;
               String var21 = "%.0fpx";
               Object[] var22 = new Object[]{var19};
               var59 = String.format(var21, Arrays.copyOf(var22, var22.length));
               short var10002 = 30023;
               short var10003 = -556;
               Intrinsics.checkNotNullExpressionValue(var59, "format(...)");
               break label230;
            }

            var41 = ((me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll)(Object)(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.b().get(var5)));
         }

         int var29 = (Integer)(Object)var41 != null ? (Integer)(Object)var41 : 0;
         short var60 = 29977;
         short var64 = -6434;
         String var33 = "#%08X";
         Object[] var37 = new Object[]{var29};
         var59 = String.format(var33, Arrays.copyOf(var37, var37.length));
         short var68 = 30023;
         short var72 = -556;
         Intrinsics.checkNotNullExpressionValue(var59, "format(...)");
      }

      String var28 =((String)( var59));
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, var28, var27, var2 + 28.0F, IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c()
            .a(0.85F), false, 16, null);
      var63 = llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .c(var5);
      label129:
      if (var8 == null) {
         if (((Boolean)(var63))) {
            float var31 = RangesKt.coerceAtMost(var12, 8.0F);
            float var32 = var1 + var3 - 22.0F;
            float var36 = var2 + 8.0F;
            float var39 = var36 + 22.0F;
            boolean var23 = this.a(var6, var7, var32, var36, var32 + 16.0F, var36 + 16.0F);
            boolean var24 = this.a(var6, var7, var32, var39, var32 + 16.0F, var39 + 16.0F);
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var32,
               var36,
               16.0F,
               16.0F,
               var23
                  ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .g()
                  : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .e(),
               var31
            );
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var32,
               var36,
               16.0F,
               16.0F,
               1.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .y()
                  .a(0.5F),
               var31
            );
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var32,
               var39,
               16.0F,
               16.0F,
               var24
                  ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .g()
                  : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .e(),
               var31
            );
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var32,
               var39,
               16.0F,
               16.0F,
               1.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .y()
                  .a(0.5F),
               var31
            );
            short var66 = 30044;
            short var70 = -5388;
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(
                  "\n    <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n        <line x1=\"12\" y1=\"5\" x2=\"12\" y2=\"19\"/>\n        <line x1=\"5\" y1=\"12\" x2=\"19\" y2=\"12\"/>\n    </svg>\n",
                  var32 + 3.0F,
                  var36 + 3.0F,
                  10.0F,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(),
                  1.0F
               );
            var66 = 30031;
            var70 = 2055;
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(
                  "\n    <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n        <line x1=\"5\" y1=\"12\" x2=\"19\" y2=\"12\"/>\n    </svg>\n",
                  var32 + 3.0F,
                  var39 + 3.0F,
                  10.0F,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(),
                  1.0F
               );
            var63 = var23;
            if (var8 == null) {
               if (var23) {
                  return this.a(() -> f(var5));
               }

               var63 = var24;
            }

            if (var8 != null) {
               break label129;
            }

            if (((Boolean)(var63))) {
               return this.a(() -> g(var5));
            }
         }

         var63 = var9;
      }

      if (var8 == null) {
         if (!((Boolean)var63)) {
            return null;
         }

         var63 = llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c(var5);
      }

         if (!((Boolean)var63)) {
            return this.a(() -> h(var5));
         }

      return null;
   }

   private final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII d(
      float var1, float var2, float var3, float var4, int var5, int var6
   ) {
      Object var51 = null; // PX-FIX
      Object var50 = null; // PX-FIX
      int[] var7 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      if (var7 == null && llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI != null) {
         String var8 = llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
         byte var9 = ((byte)((llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(var8)) ? 1 : 0));
         float var10 = 280.0F;
         float var11 = var9 != 0 ? 250.0F : 280.0F;
         float var12 = var1 + (var3 - var10) / 2.0F;
         float var13 = var2 + 14.0F - RangesKt.coerceAtMost(IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, 0.0F);
         float var14 = RangesKt.coerceAtLeast(var2 + (var4 - var11) / 2.0F, var2 + 6.0F);
         float var17 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .ar();
         float var18 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .aq();
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var12,
            var14,
            var10,
            var11,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .e()
               .a(0.98F),
            var17
         );
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var12,
            var14,
            var10,
            var11,
            1.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .ah()
               .a(0.7F),
            var17
         );
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
            me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll,
            llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(var8),
            var12 + 14.0F,
            var14 + 12.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(),
            false);
         float var19 = 22.0F;
         float var20 = var12 + var10 - var19 - 8.0F;
         float var21 = var14 + 8.0F;
         boolean var22 = this.a(var5, var6, var20, var21, var20 + var19, var21 + var19);
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var20,
            var21,
            var19,
            var19,
            var22
               ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .g()
               : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .j(),
            var18
         );
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var20,
            var21,
            var19,
            var19,
            1.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .y()
               .a(0.5F),
            var18
         );
         short var10001 = 30050;
         short var10002 = 27643;
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(
               "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n            <line x1=\"18\" y1=\"6\" x2=\"6\" y2=\"18\"/>\n            <line x1=\"6\" y1=\"6\" x2=\"18\" y2=\"18\"/>\n        </svg>\n    ",
               var20 + 6.0F,
               var21 + 6.0F,
               var19 - 12.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(),
               1.0F
            );
         IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var23 = null;
         if (var22) {
            var23 = this.a(llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI::C);
         }

         float var24 = var12 + 14.0F;
         float var25 = var14 + 38.0F;
         float var26 = var10 - 28.0F - 16.0F;
         float var27 = 130.0F;
         int var28 = me.octo.client.utils.llllIlIllllIIlllIIIIllIlIIIIIlIIllIlIlIlIlIIllIlIIIlIllIIIllllIIIllIIllllllIIlllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a((double)IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl);
         me.octo.client.utils.IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var28, var24, var25, var26, var27, 6.0F);
         float var29 = var24 + var26 + 8.0F;
         float var30 = 8.0F;
         me.octo.client.utils.IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(var29, var25, var30, var27);
         me.octo.client.utils.IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(
               var24 + ((Number)IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.getFirst()).floatValue() * var26,
               var25
                  + (1.0F - ((Number)IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.getSecond()).floatValue()) * var27,
               5.0F,
               1.5F,
               me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
            );
         float var31 = var25 + IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl * var27;
         me.octo.client.utils.IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(
               var29 + var30 / 2.0F,
               var31,
               var30 / 2.0F + 2.0F,
               1.5F,
               me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
            );
         float var32 = var25 + var27 + 12.0F;
         float var33 = 12.0F;
         int var10000 = var9;
         if (var7 == null) {
            if (var9 == 0) {
               me.octo.client.utils.IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var24, var32, var10 - 28.0F, var33, this.d() | 0xFF000000);
               float var34 = var24 + IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll * (var10 - 28.0F);
               me.octo.client.utils.IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(
                     var34,
                     var32 + var33 / 2.0F,
                     var33 / 2.0F + 2.0F,
                     1.5F,
                     me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                  );
            }

            var10000 = var9;
         }

         float var35;
         float var36;
         float var37;
         byte var39;
         float var47;
         label259: {
            var47 = var10000 != 0 ? var25 + var27 + 14.0F : var32 + var33 + 14.0F;
            var35 = 130.0F;
            var36 = 24.0F;
            var37 = var12 + 14.0F;
            var39 = ((byte)((this.a(var5, var6, var37, var47, var37 + var35, var47 + var36)) ? 1 : 0));
            var10000 =(( lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) ? 1 : 0);
            if (var7 == null) {
               if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
                  var50 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .h();
                  break label259;
               }

               var10000 = var39;
            }

            var50 =(( (var10000 != 0)
               ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .g()
               : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .j() != null));
         }

         label252: {
            Object var40 = var50;
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var37, var47, var35, var36, var40, var18
            );
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var37,
               var47,
               var35,
               var36,
               1.0F,
               lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                  ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .ah()
                  : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .y()
                     .a(0.5F),
               var18
            );
            if (var7 == null) {
               var51 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
               if (lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll != null) {
                  break label252;
               }
            }

            var51 = this.a(var9 != 0);
         }

         String var41;
         var41 =((String)( var51));
         var10000 =(( lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) ? 1 : 0);
         label246:
         if (var7 == null) {
            if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
               var10000 = ((IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.a()) ? 1 : 0);
               if (var7 != null) {
                  break label246;
               }

               if ((var10000 != 0)) {
                  var10000 = var41.length();
                  if (var7 == null) {
                     var10000 = var10000 > 0 ? 1 : 0;
                  }

                  if (var10000 != 0) {
                     lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(
                           var37 + 8.0F,
                           var47 + 6.0F,
                           (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl, var41, false, 2, null),
                           12.0F
                        );
                  }
               }
            }

            me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl, var41, var37 + 8.0F, var47 + 7.0F, IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(), false, 16, null);
            var10000 =(( lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) ? 1 : 0);
         }

         label239:
         if (var7 == null) {
            if ((var10000 != 0)) {
               long var68;
               var10000 = (var68 = System.currentTimeMillis() / 530L % 2L - 0L) == 0L ? 0 : (var68 < 0L ? -1 : 1);
               if (var7 != null) {
                  break label239;
               }

               if ((var10000 == 0)) {
                  float var42 = var37
                     + 8.0F
                     + (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl, var41, false, 2, null)
                     + 1.0F;
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                     var42,
                     var47 + 6.0F,
                     1.5F,
                     12.0F,
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(),
                     0.0F
                  );
               }
            }

            var10001 = 30058;
            var10002 = 22090;
            me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
               me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
               "HEX",
               var37,
               var47 - 11.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c()
                  .a(0.7F),
               false);
            var10000 = var39;
         }

         label232:
         if ((var10000 != 0)) {
            IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var54 = var23;
            if (var7 == null) {
               if (var23 != null) {
                  break label232;
               }

               var54 = ((java.util.function.Supplier<IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII>)(() -> { this.a(String.valueOf((kotlin.jvm.functions.Function1)null)); return null; })).get();
            }

            var23 = var54;
         }

         float var48 = 70.0F;
         float var43 = var37 + var35 + 8.0F;
         byte var44 = ((byte)((this.a(var5, var6, var43, var47, var43 + var48, var47 + var36)) ? 1 : 0));
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var43,
            var47,
            var48,
            var36,
            var44 != 0
               ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ah()
                  .a(0.4F)
               : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .j(),
            var18
         );
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var43,
            var47,
            var48,
            var36,
            1.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .ah()
               .a(0.7F),
            var18
         );
         var10001 = 29980;
         var10002 = 30576;
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
            .a(
               "APPLY",
               var43 + var48 / 2.0F,
               var47 + var36 / 2.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a()
            );
         int var55 = var44;
         if (var7 == null) {
            label221:
            if (var44 != 0) {
               IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var56 = var23;
               if (var7 == null) {
                  if (var23 != null) {
                     break label221;
                  }

                  var56 = ((java.util.function.Supplier<IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII>)(() -> { this.a(String.valueOf((kotlin.jvm.functions.Function1)null)); return null; })).get();
               }

               var23 = var56;
            }

            var55 = ((this.a(var5, var6, var24, var25, var24 + var26, var25 + var27)) ? 1 : 0);
         }

         label271: {
            if (var7 == null) {
               if (var55 != 0) {
                  IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var57 = var23;
                  if (var7 == null) {
                     if (var23 != null) {
                        break label271;
                     }

                     var57 = this.a(llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI::D);
                  }

                  var23 = var57;
                  if (var7 == null) {
                     break label271;
                  }
               }

               var55 = ((this.a(var5, var6, var29 - 2.0F, var25 - 2.0F, var29 + var30 + 2.0F, var25 + var27 + 2.0F)) ? 1 : 0);
            }

            if (var7 == null) {
               if (var55 != 0) {
                  IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var58 = var23;
                  if (var7 == null) {
                     if (var23 != null) {
                        break label271;
                     }

                     var58 = this.a(llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI::E);
                  }

                  var23 = var58;
                  if (var7 == null) {
                     break label271;
                  }
               }

               var55 = var9;
            }

            if (var7 == null) {
               if (var55 != 0) {
                  break label271;
               }

               var55 = ((this.a(var5, var6, var24, var32 - 4.0F, var24 + var10 - 28.0F, var32 + var33 + 4.0F)) ? 1 : 0);
            }

            label189:
            if (var55 != 0) {
               IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var59 = var23;
               if (var7 == null) {
                  if (var23 != null) {
                     break label189;
                  }

                  var59 = this.a(llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI::F);
               }

               var23 = var59;
            }
         }

         Minecraft var45 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         var55 = GLFW.glfwGetMouseButton(var45.getWindow().handle(), 0);
         if (var7 == null) {
            var55 = var55 == 1 ? 1 : 0;
         }

         int var46 = var55;
         var55 =(( llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI) ? 1 : 0);
         if (var7 == null) {
            label178:
            if (llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI) {
               var55 = var46;
               if (var7 == null) {
                  if (var46 != 0) {
                     IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = TuplesKt.to(
                        RangesKt.coerceIn((var5 - var24) / var26, 0.0F, 1.0F), RangesKt.coerceIn(1.0F - (var6 - var25) / var27, 0.0F, 1.0F)
                     );
                     this.c(var9 != 0);
                     if (var7 == null) {
                        break label178;
                     }
                  }

                  var55 = 0;
               }

               llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = (var55 != 0);
            }

            var55 =(( IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl) ? 1 : 0);
         }

         if (var7 == null) {
            label167:
            if (var55 != 0) {
               var55 = var46;
               if (var7 == null) {
                  if (var46 != 0) {
                     IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = RangesKt.coerceIn(
                        (var6 - var25) / var27, 0.0F, 0.999F
                     );
                     this.c(var9 != 0);
                     if (var7 == null) {
                        break label167;
                     }
                  }

                  var55 = 0;
               }

               IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = (var55 != 0);
            }

            var55 =(( IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll) ? 1 : 0);
         }

         if (var7 == null) {
            if (var55 == 0) {
               return var23;
            }

            var55 = var9;
         }

         if (var7 == null) {
            if (var55 != 0) {
               return var23;
            }

            var55 = var46;
         }

         if (var7 == null) {
            if (var55 != 0) {
               IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = RangesKt.coerceIn(
                  (var5 - var24) / (var10 - 28.0F), 0.0F, 1.0F
               );
               this.c(var9 != 0);
               if (var7 == null) {
                  return var23;
               }
            }

            var55 = 0;
         }

         IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = (var55 != 0);
         return var23;
      } else {
         return null;
      }
   }

   private final int d() {
      int[] var1 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      if (var1 == null && llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI != null) {
         String var2 = llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
         Object var10000 = llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var1 == null) {
            if (llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(var2)) {
               label27: {
                  var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.c().get(var2);
                  if (var1 == null) {
                     if (var10000 != null) {
                        break label27;
                     }

                     var10000 = new float[3];
                  }

                  float[] var4 = (float[])var10000;
                  var4[0] = 0.0F;
                  var4[1] = 0.0F;
                  var4[2] = 0.0F;
                  var10000 = var4;
               }

               float[] var3 = (float[])var10000;
               return (int)(var3[0] * 255) << 16 | (int)(var3[1] * 255) << 8 | (int)(var3[2] * 255);
            }

            var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.b().get(var2);
         }

         return ((Integer)var10000 != null ? (Integer)var10000 : 0) & 16777215;
      } else {
         return 0;
      }
   }

   private final String a(boolean var1) {
      Object var16 = null; // PX-FIX
      int[] var2 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      String var10000 = llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      if (var2 == null) {
         if (llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI != null) {
            String var3 = llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
            if (var2 == null && var1) {
               label33: {
                  var16 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.c().get(var3);
                  if (var2 == null) {
                     if (var16 != null) {
                        break label33;
                     }

                     var16 = new float[3];
                  }

                  float[] var11 = ((float[])(Object)(((Float)( var16))));
                  var11[0] = 0.0F;
                  var11[1] = 0.0F;
                  var11[2] = 0.0F;
                  var16 = var11;
               }

               float[] var4 = ((float[])(Object)(((Float)( var16))));
               short var17 = 29983;
               int var10 = RangesKt.coerceIn((int)(var4[0] * 255), 0, 255);
               short var19 = 27674;
               int var12 = RangesKt.coerceIn((int)(var4[1] * 255), 0, 255);
               int var7 = RangesKt.coerceIn((int)(var4[2] * 255), 0, 255);
               String var8 = "#%02X%02X%02X";
               Object[] var9 = new Object[]{var10, var12, var7};
               var10000 = String.format(var8, Arrays.copyOf(var9, var9.length));
               short var22 = 30023;
               short var23 = -556;
               Intrinsics.checkNotNullExpressionValue(var10000, "format(...)");
            } else {
               String var5;
               Object[] var6;
               int var20;
               label27: {
                  short var14 = 30060;
                  short var18 = 19851;
                  var5 = "#%08X";
                  var6 = new Object[1];
                  if (var2 == null) {
                     Integer var10002 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.b().get(var3);
                     if (var10002 != null) {
                        var20 = var10002;
                        break label27;
                     }
                  }

                  var20 = 0;
               }

               var6[0] = var20;
               var10000 = String.format(var5, Arrays.copyOf(var6, var6.length));
               short var21 = 30023;
               short var10003 = -556;
               Intrinsics.checkNotNullExpressionValue(var10000, "format(...)");
            }

            return var10000;
         }

         short var13 = 30029;
         short var10001 = 10139;
         var10000 = "#000000";
      }

      return var10000;
   }

   private final void b(boolean param1) {
int[] var2 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
if (var2 != null) {
   return;
}
String var3 = llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
if (var3 == null) {
   return;
}
String var4 = kotlin.text.StringsKt.removePrefix(kotlin.text.StringsKt.removePrefix(kotlin.text.StringsKt.trim((CharSequence) (lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll != null ? lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll : "")).toString(), "#"), "0x");
try {
   int var5;
   switch (var4.length()) {
      case 3:
         int var7 = Integer.parseInt(String.valueOf(var4.charAt(0)), 16) * 17;
         int var8 = Integer.parseInt(String.valueOf(var4.charAt(1)), 16) * 17;
         int var9 = Integer.parseInt(String.valueOf(var4.charAt(2)), 16) * 17;
         var5 = -16777216 | var7 << 16 | var8 << 8 | var9;
         break;
      case 6:
         var5 = -16777216 | (int) Long.parseLong(var4, 16);
         break;
      case 8:
         var5 = (int) Long.parseLong(var4, 16);
         break;
      default:
         return;
   }
   if (var2 != null || param1) {
      float var6 = (float) (var5 >> 16 & 255) / 255.0F;
      float var7x = (float) (var5 >> 8 & 255) / 255.0F;
      float var8x = (float) (var5 & 255) / 255.0F;
      float[] var9x = new float[]{var6, var7x, var8x};
      this.a(var3, var9x);
      if (var2 != null) {
         this.a(var3, var5);
      }
   } else {
      this.a(var3, var5);
   }
   lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = null;
   lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = false;
   this.f();
} catch (Exception var5x) {
   this.c("Bad hex");
}
   }

   private final void c(boolean var1) {
      int[] var2 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      if (var2 == null && llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI != null) {
         label19: {
            String var3 = llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
            int var4 = me.octo.client.utils.llllIlIllllIIlllIIIIllIlIIIIIlIIllIlIlIlIlIIllIlIIIlIllIIIllllIIIllIIllllllIIlllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a((double)IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl);
            int var5 = me.octo.client.utils.llllIlIllllIIlllIIIIllIlIIIIIlIIllIlIlIlIlIIllIlIIIlIllIIIllllIIIllIIllllllIIlllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(
                  var4,
                  ((Number)IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.getFirst()).floatValue(),
                  ((Number)IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.getSecond()).floatValue(),
                  -16777216
               );
            int var10000 =(( var1) ? 1 : 0);
            if (var2 == null) {
               if (!var1) {
                  float var6 = (var5 >> 16 & 0xFF) / 255.0F;
                  float var7 = (var5 >> 8 & 0xFF) / 255.0F;
                  float var8 = (var5 & 0xFF) / 255.0F;
                  float[] var9 = new float[]{var6, var7, var8};
                  this.a(var3, var9);
                  if (var2 == null) {
                     break label19;
                  }
               }

               var10000 = (int)(IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll * 255) << 24 | var5 & 16777215;
            }

            int var10 = var10000;
            this.a(var3, var10);
         }

         lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = null;
      }
   }

   private final void a(String var1, int var2) {
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.b().put(var1, var2);
      llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var1, new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var2, true));
      this.o();
   }

   private final void a(String var1, float[] var2) {
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.c().put(var1, var2);
      llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI var10000 = llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      float[] var10002 = Arrays.copyOf(var2, var2.length);
      short var10004 = 30067;
      short var10005 = 10608;
      Intrinsics.checkNotNullExpressionValue(var10002, "copyOf(...)");
      var10000.a(var1, var10002);
      this.o();
   }

   private final void a(String var1, float var2) {
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.d().put(var1, var2);
      llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var1, var2);
      this.o();
   }

   private final void b(String var1) {
      llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var1;
      lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = false;
      lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = null;
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = false;
      lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = null;
      this.f();
   }

   public final void e() {
      llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = null;
      lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = false;
      lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = null;
      llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = false;
      IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = false;
      IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = false;
   }

   private final void f() {
      Object var11 = null; // PX-FIX
      int[] var1 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      if (var1 == null && llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI != null) {
         int var10;
         label31: {
            String var2 = llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
            Object var10000 = llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            if (var1 == null) {
               if (llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b(var2)) {
                  label25: {
                     var11 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.c().get(var2);
                     if (var1 == null) {
                        if (var11 != null) {
                           break label25;
                        }

                        var11 = new float[3];
                     }

                     float[] var6 = ((float[])(Object)(((Float)( var11))));
                     var6[0] = 0.0F;
                     var6[1] = 0.0F;
                     var6[2] = 0.0F;
                     var11 = var6;
                  }

                  float[] var4 = ((float[])(Object)(((Float)( var11))));
                  var10 = (int)(var4[0] * 255) << 16 | (int)(var4[1] * 255) << 8 | (int)(var4[2] * 255) | 0xFF000000;
                  break label31;
               }

               var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.b().get(var2);
            }

            var10 = (Integer)var10000 != null ? (Integer)var10000 : 0;
         }

         int var3 = var10;
         int var8 = var3 >> 16 & 0xFF;
         int var5 = var3 >> 8 & 0xFF;
         int var9 = var3 & 0xFF;
         float[] var7 = Color.RGBtoHSB(var8, var5, var9, new float[3]);
         IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = RangesKt.coerceIn(var7[0], 0.0F, 0.999F);
         IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = TuplesKt.to(var7[1], var7[2]);
         IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = RangesKt.coerceIn((var3 >> 24 & 0xFF) / 255.0F, 0.0F, 1.0F);
      }
   }

   private final boolean b(String var1, int var2) {
      int[] var3 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      if (var3 == null) {
         lIIllIlIllIIIIlIllIlllIIIIIlIllIIIIlIlIIllIIIIIIlIIlIIlIlllIlIIllIlIIlIlIIIIlIllIIIII var10000 = (lIIllIlIllIIIIlIllIlllIIIIIlIllIIIIlIlIIllIIIIIIlIIlIIlIlllIlIIllIlIIlIlIIIIlIllIIIII)CollectionsKt.firstOrNull(
            lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
         );
         if (var10000 != null) {
            lIIllIlIllIIIIlIllIlllIIIIIlIllIIIIlIlIIllIIIIIIlIIlIIlIlllIlIIllIlIIlIlIIIIlIllIIIII var4 = var10000;
            int var5 = var4.Y();
            if (var3 == null) {
               var5 = var5 == var2 ? 1 : 0;
            }

            return (var5 != 0);
         }
      }

      return false;
   }

   private final void a(int var1, String var2) {
      int[] var10000 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var1);
      int[] var3 = var10000;
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = null;
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .d(var2);
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = false;
      if (var3 == null) {
         lIIllIlIllIIIIlIllIlllIIIIIlIllIIIIlIlIIllIIIIIIlIIlIIlIlllIlIIllIlIIlIlIIIIlIllIIIII var4 = (lIIllIlIllIIIIlIllIlllIIIIIlIllIIIIlIlIIllIIIIIIlIIlIIlIlllIlIIllIlIIlIlIIIIlIllIIIII)CollectionsKt.firstOrNull(
            lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
         );
         if (var4 != null) {
            var4.j(var1);
         }
      }

      short var10002 = 30015;
      short var10003 = -24967;
      this.c("Loaded " + var2);
   }

   private final void g() {
      Object var16 = null; // PX-FIX
      int[] var1 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      String var10000 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      if (var1 == null) {
         if (lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl == null) {
            var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a();
         }

         var10000 = StringsKt.trim(var10000).toString();
      }

      String var2 = var10000;
      String var3 = llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .h(var2);
      String[] var5 = new String[12];
      short var10002 = 30041;
      short var10003 = 26309;
      var5[0] = "Dark";
      var10002 = 30026;
      var10003 = 25718;
      var5[1] = "Midnight Blue";
      var10002 = 30010;
      var10003 = -5857;
      var5[2] = "Clear";
      var10002 = 30024;
      var10003 = 18431;
      var5[3] = "Cotton Candy";
      var10002 = 30051;
      var10003 = 27138;
      var5[4] = "Forest Green";
      var10002 = 29962;
      var10003 = 1441;
      var5[5] = "Deep Space";
      var10002 = 30047;
      var10003 = 21447;
      var5[6] = "Ocean Blue";
      var10002 = 30039;
      var10003 = -19740;
      var5[7] = "Pastel Lavander";
      var10002 = 30071;
      var10003 = -30095;
      var5[8] = "Volcano Red";
      var10002 = 30038;
      var10003 = 24406;
      var5[9] = "Catppuccin Frappé";
      var10002 = 30063;
      var10003 = 25521;
      var5[10] = "Mint Breeze";
      var10002 = 30079;
      var10003 = 27404;
      var5[11] = "Catppuccin Mocha";
      Set var4 = SetsKt.setOf(var5);
      boolean var15 = var4.contains(var3);
      if (var1 == null) {
         if (var15) {
            short var17 = 29974;
            var10002 = 20717;
            this.c("Pick a different name");
            return;
         }

         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a(var3);
         var15 = llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      }

      if (var1 == null) {
         if (!var15) {
            short var10001 = 30012;
            var10002 = 299;
            this.c("Save failed");
            return;
         }

         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         var15 = false;
      }

      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var15;
      lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = null;
      this.n();
      lIIllIlIllIIIIlIllIlllIIIIIlIllIIIIlIlIIllIIIIIIlIIlIIlIlllIlIIllIlIIlIlIIIIlIllIIIII var14 = (lIIllIlIllIIIIlIllIlllIIIIIlIllIIIIlIlIIllIIIIIIlIIlIIlIlllIlIIllIlIIlIlIIIIlIllIIIII)CollectionsKt.firstOrNull(
         lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
      );
      if (var1 == null) {
         if (var14 != null) {
            String[] var6 = var14.W();
            String[] var8 = var6;
            boolean var9 = false;
            int var10 = 0;
            int var11 = var6.length;

            label56: {
               while (var10 < var11) {
                  String var12 = var8[var10];
                  boolean var13 = false;
                  if (var1 == null) {
                     var16 = Intrinsics.areEqual(var12, var3);
                     if (var1 != null) {
                        break label56;
                     }

                     if (!((Boolean)var16)) {
                        var16 = var10;
                        break label56;
                     }

                     var10++;
                  }

                  if (var1 != null) {
                     break;
                  }
               }

               var16 = -1;
            }

            int var7 =((Integer)( var16));
            if (var1 != null) {
               return;
            }

            if (var7 >= 0) {
               var14.j(var7);
            }
         }

         var10002 = 30037;
         var10003 = 28656;
         this.c("Saved " + var3);
      }
   }

   private final void h() {
      int[] var10000 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      String var2 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      int[] var1 = var10000;
      if (var1 == null) {
         if (var2 != null) {
            if (llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(var2)) {
               IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = null;
               this.n();
               short var4 = 30069;
               short var10003 = -3584;
               this.c("Deleted " + var2);
               if (var1 == null) {
                  return;
               }
            }

            short var3 = 30070;
            short var5 = -31649;
            this.c("Delete failed");
            return;
         }

         short var10001 = 30062;
         short var10002 = -2485;
         this.c("No saved theme to delete");
      }
   }

   private final void i() {
      int[] var1 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      Object var10001 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      if (var1 == null) {
         if (lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl == null) {
            var10001 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a();
         }

         var10001 = (CharSequence)var10001;
      }

      Object var2 = var10001;
      if (StringsKt.isBlank((CharSequence)var2)) {
         llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var4 = var10000;
         short var6 = 30004;
         boolean var3 = false;
         short var7 = -4935;
         var10001 = "Untitled";
         var10000 = var4;
      } else {
         var10001 = var2;
      }

      var10000.a((String)var10001);
      var2 = llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .c(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .f((String)var2);
      short var9 = 29952;
      short var10002 = -18947;
      this.c("Copied JSON to clipboard");
   }

   private final void j() {
      int[] var1 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      if (var1 == null) {
         String var10000 = llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .d();
         if (var10000 != null) {
            String var2 = var10000;
            if (var1 == null) {
               llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var8 = llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .e(var2);
               if (var8 != null) {
                  llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = var8;
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var3;
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = null;
                  lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = null;
                  llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
                  this.o();
                  short var10 = 29963;
                  short var12 = 22407;
                  this.c("Imported from clipboard");
                  return;
               }
            }

            llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI var7 = this;
            boolean var6 = false;
            short var9 = 30066;
            short var11 = 29761;
            var7.c("Invalid theme JSON");
            return;
         }
      }

      llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI var4 = this;
      boolean var5 = false;
      short var10001 = 30003;
      short var10002 = -4262;
      var4.c("Clipboard empty");
   }

   private final void k() {
      int[] var1 = me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      String var2 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl != null ? lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl : this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a();

      if (kotlin.text.StringsKt.isBlank((CharSequence) var2)) {
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a("Untitled");
      } else {
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a(var2);
      }

      try {
         javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
               G();
            }
         });
      } catch (Exception var3) {
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Export file error:" + var3.getMessage());
         this.c("Export failed");
      }
   }

   public final void l() {
      try {
         SwingUtilities.invokeLater(llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI::H);
      } catch (Exception var2) {
         String var10000 = var2.getMessage();
         short var10001 = 30061;
         short var10002 = 23591;
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Import file error: " + var10000);
         var10001 = 29961;
         var10002 = 13023;
         this.c("Import failed");
      }
   }

   private final void m() {
      Object var15 = null; // PX-FIX
      int[] var1 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();

      try {
         short var11 = 30048;
         File var2 = llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c();
         short var18 = -10285;
         String var12 = System.getProperty("os.name");
         short var22 = 29959;
         short var10003 = 20306;
         Intrinsics.checkNotNullExpressionValue(var12, "getProperty(...)");
         String var13 = var12.toLowerCase(Locale.ROOT);
         var22 = 30053;
         var10003 = -24618;
         Intrinsics.checkNotNullExpressionValue(var13, "toLowerCase(...)");
         String var3 = var13;

         label66: {
   pxClinit: {
            label65: {
               try {
                  CharSequence var14 = var3;
                  var18 = 29964;
                  var22 = 9058;
                  var15 = StringsKt.contains(var14, "win", false);
                  if (var1 != null) {
                     break label66;
                  }

                  if (!((Boolean)var15)) {
                     break label65;
                  }
               } catch (Exception var7) {
                  throw (RuntimeException)a(var7);
               }

               String[] var4 = new String[2];
               short var10004 = 30005;
               short var10005 = 13797;
               var4[0] = "explorer";
               var4[1] = var2.getAbsolutePath();
               new ProcessBuilder(var4).start();
               if (var1 == null) {
                  break pxClinit;
               }
            }

            CharSequence var16 = var3;
            var18 = 29960;
            var22 = -19592;
            var15 = StringsKt.contains(var16, "mac", false);
         }
}

         label55: {
   pxClinit: {
            label54: {
               try {
                  if (var1 != null) {
                     break label55;
                  }

                  if (!((Boolean)var15)) {
                     break label54;
                  }
               } catch (Exception var6) {
                  throw (RuntimeException)a(var6);
               }

               String[] var9 = new String[2];
               short var28 = 30027;
               short var30 = -29949;
               var9[0] = "open";
               var9[1] = var2.getAbsolutePath();
               new ProcessBuilder(var9).start();
               if (var1 == null) {
                  break pxClinit;
               }
            }

            CharSequence var17 = var3;
            var18 = 29982;
            var22 = -12414;
            var15 = StringsKt.contains(var17, "linux", false);
         }
}

         label44: {
   pxClinit: {
            label43: {
               try {
                  if (var1 != null) {
                     break label44;
                  }

                  if (!((Boolean)var15)) {
                     break label43;
                  }
               } catch (Exception var5) {
                  throw (RuntimeException)a(var5);
               }

               String[] var10 = new String[2];
               short var29 = 30040;
               short var31 = -9686;
               var10[0] = "xdg-open";
               var10[1] = var2.getAbsolutePath();
               new ProcessBuilder(var10).start();
               if (var1 == null) {
                  break pxClinit;
               }
            }

            var15 = Desktop.isDesktopSupported();
         }
}

         if (((Boolean)(var15))) {
            Desktop.getDesktop().open(var2);
         }
      } catch (Exception var8) {
         String var10000 = var8.getMessage();
         short var10001 = 30016;
         short var10002 = 16563;
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Open folder failed: " + var10000);
      }
   }

   private final void n() {
      int[] var1 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      if (var1 == null) {
         lIIllIlIllIIIIlIllIlllIIIIIlIllIIIIlIlIIllIIIIIIlIIlIIlIlllIlIIllIlIIlIlIIIIlIllIIIII var10000 = (lIIllIlIllIIIIlIllIlllIIIIIlIllIIIIlIlIIllIIIIIIlIIlIIlIlllIlIIllIlIIlIlIIIIlIllIIIII)CollectionsKt.firstOrNull(
            lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
         );
         if (var10000 != null) {
            lIIllIlIllIIIIlIllIlllIIIIIlIllIIIIlIlIIllIIIIIIlIIlIIlIlllIlIIllIlIIlIlIIIIlIllIIIII var2 = var10000;
            int var3 = var2.Y();
            if (var3 < 12) {
               return;
            }

            List var4 = llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b();
            int var5 = var3 - 12;
            if (var5 >= var4.size()) {
               var2.j(0);
            }

            return;
         }
      }
   }

   private final void o() {
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = true;
   }

   private final void c(String var1) {
      lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = var1;
      llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = System.currentTimeMillis() + 1800L;
   }

   public final void a(int var1, int var2, int var3, float var4, float var5, float var6, float var7) {
      int[] var8;
      float var12;
      float var13;
      float var15;
      float var19;
      float var20;
      float var21;
      int var26;
      label89: {
         float var9 = 14.0F;
         float var10 = var4 + var9;
         float var11 = var5 + var9;
         var12 = var4 + var6 - var9;
         var13 = var5 + var7 - var9;
         float var14 = 56.0F;
         var15 = var11 + var14 + 10.0F;
         float var16 = 230.0F;
         var19 = var13 - var15;
         int[] var10000 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
         var20 = var10 + var16 + 10.0F;
         var21 = var1 / 4.0F;
         int var22 = (int)var10;
         var8 = var10000;
         var26 = var2;
         int var10001 = (int)(var10 + var16);
         if (var8 == null) {
            if (var2 > var10001) {
               var26 = 0;
               break label89;
            }

            var26 = var22;
            if (var8 != null) {
               break label89;
            }

            var10001 = var2;
         }

         var26 = var26 <= var10001 ? 1 : 0;
      }

      if (var26 != 0) {
         label78: {
            int var23 = (int)var15;
            var26 = var3;
            int var30 = (int)(var15 + var19);
            if (var8 == null) {
               if (var3 > var30) {
                  var26 = 0;
                  break label78;
               }

               var26 = var23;
               if (var8 != null) {
                  break label78;
               }

               var30 = var3;
            }

            var26 = var26 <= var30 ? 1 : 0;
         }

         if (var26 != 0) {
            lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll -= var21;
            lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = RangesKt.coerceAtLeast(
               lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll, 0.0F
            );
            if (var8 == null) {
               return;
            }
         }
      }

      label67: {
         int var24 = (int)var20;
         var26 = var2;
         int var31 = (int)var12;
         if (var8 == null) {
            if (var2 > var31) {
               var26 = 0;
               break label67;
            }

            var26 = var24;
            if (var8 != null) {
               break label67;
            }

            var31 = var2;
         }

         var26 = var26 <= var31 ? 1 : 0;
      }

      if (var26 != 0) {
         label58: {
            int var25 = (int)var15;
            var26 = var3;
            int var32 = (int)var13;
            if (var8 == null) {
               if (var3 > var32) {
                  var26 = 0;
                  break label58;
               }

               var26 = var25;
               if (var8 != null) {
                  break label58;
               }

               var32 = var3;
            }

            var26 = var26 <= var32 ? 1 : 0;
         }

         if (var26 != 0) {
            IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI -= var21;
            IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = RangesKt.coerceAtLeast(
               IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, 0.0F
            );
         }
      }
   }

   public final boolean a(char var1) {
      Object var9 = null; // PX-FIX
      Object var11 = null; // PX-FIX
      int[] var2 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      int var10000 =(( llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) ? 1 : 0);
      if (var2 == null) {
         if (llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) {
            label140: {
               var10000 = 32;
               char var10001 = var1;
               if (var2 == null) {
                  if (' ' > var1) {
                     var10000 = 0;
                     break label140;
                  }

                  var10000 = var1;
                  if (var2 != null) {
                     break label140;
                  }

                  var10001 = 127;
               }

               var10000 = var10000 < var10001 ? 1 : 0;
            }

            if (var10000 != 0) {
               label79: {
                  lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.b(
                     llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI::I
                  );
                  if (var2 == null) {
                     var11 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                     if (lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl != null) {
                        break label79;
                     }
                  }

                  var11 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a();
               }

               String var4 =((String)( var11));
               lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var4 + var1;
               return true;
            }
         }

         var10000 =(( lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) ? 1 : 0);
      }

      if (var2 == null) {
         label97:
         if (var10000 != 0) {
            label126: {
               var10000 = 48;
               char var12 = var1;
               if (var2 == null) {
                  if ('0' > var1) {
                     var10000 = 0;
                     break label126;
                  }

                  var10000 = var1;
                  if (var2 != null) {
                     break label126;
                  }

                  var12 = ':';
               }

               var10000 = var10000 < var12 ? 1 : 0;
            }

            if (var10000 == 0) {
               label116: {
                  var10000 = 97;
                  char var13 = var1;
                  if (var2 == null) {
                     if ('a' > var1) {
                        var10000 = 0;
                        break label116;
                     }

                     var10000 = var1;
                     if (var2 != null) {
                        break label116;
                     }

                     var13 = 'g';
                  }

                  var10000 = var10000 < var13 ? 1 : 0;
               }

               if (var10000 == 0) {
                  label107: {
                     var10000 = 65;
                     char var14 = var1;
                     if (var2 == null) {
                        if ('A' > var1) {
                           var10000 = 0;
                           break label107;
                        }

                        var10000 = var1;
                        if (var2 != null) {
                           break label107;
                        }

                        var14 = 'G';
                     }

                     var10000 = var10000 < var14 ? 1 : 0;
                  }

                  if (var10000 == 0) {
                     if (var2 != null) {
                        return (boolean)(Object)var1;
                     }

                     if (var1 != '#') {
                        break label97;
                     }
                  }
               }
            }

            label86: {
               IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.b(
                  llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI::J
               );
               if (var2 == null) {
                  var9 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
                  if (lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll != null) {
                     break label86;
                  }
               }

               var9 = "";
            }

            String var3 =((String)( var9));
            var10000 = var3.length();
            if (var2 == null) {
               if (var10000 < 9) {
                  lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var3 + var1;
               }

               var10000 = 1;
            }

            return (var10000 != 0);
         }

         var10000 = 0;
      }

      return (var10000 != 0);
   }

   public final boolean a(int var1) {
      Object var27 = null; // PX-FIX
      int[] var2;
      int var10000;
      var2 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      var10000 =(( llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) ? 1 : 0);
      label239:
      if (var2 == null) {
         if (llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) {
            var10000 = ((lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.a(
               var1,
               llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI::K,
               llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI::L
            )) ? 1 : 0);
            if (var2 != null) {
               break label239;
            }

            if (var10000 != 0) {
               return true;
            }
         }

         var10000 =(( lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) ? 1 : 0);
      }

      label232:
      if (var2 == null) {
         if (var10000 != 0) {
            var10000 = ((IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.a(
               var1,
               llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI::M,
               llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI::N
            )) ? 1 : 0);
            if (var2 != null) {
               break label232;
            }

            if (var10000 != 0) {
               return true;
            }
         }

         var10000 = var1;
      }

      short var10001 = 256;
      if (var2 == null) {
         if (var10000 == 256) {
            if (llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI != null) {
               this.e();
               return true;
            }

            boolean var23 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
            if (var2 == null) {
               if (llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) {
                  llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = false;
                  lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = null;
                  lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.b();
                  return true;
               }

               var23 = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
            }

            if (var2 == null) {
               if (var23) {
                  lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = false;
                  lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = null;
                  IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.b();
                  return true;
               }

               var23 = false;
            }

            return var23;
         }

         var10000 = var1;
         var10001 = 259;
      }

      if (var2 == null) {
         label222: {
            if (var10000 == var10001) {
               var10000 =(( llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) ? 1 : 0);
               if (var2 == null) {
                  if (llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) {
                     int var20 = ((lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.a(
                        llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI::O
                     )) ? 1 : 0);
                     if (var2 == null) {
                        if ((var20 == 0)) {
                           String var21 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                           if (lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl == null) {
                              var21 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a();
                           }

                           String var12 = var21;
                           var20 = var12.length();
                           if (var2 == null) {
                              var20 = var20 > 0 ? 1 : 0;
                           }

                           if (var20 != 0) {
                              lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = StringsKt.dropLast(var12, 1);
                           }

                           return true;
                        }

                        var20 = 1;
                     }

                     return (var20 != 0);
                  }

                  var10000 =(( lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) ? 1 : 0);
               }

               if (var2 != null) {
                  break label222;
               }

               if (var10000 != 0) {
                  int var13 = ((IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.a(
                     llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI::P
                  )) ? 1 : 0);
                  if (var2 == null) {
                     if ((var13 == 0)) {
                        String var14 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
                        if (lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll == null) {
                           var14 = "";
                        }

                        String var3 = var14;
                        var13 = var3.length();
                        if (var2 == null) {
                           var13 = var13 > 0 ? 1 : 0;
                        }

                        if (var13 != 0) {
                           lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = StringsKt.dropLast(var3, 1);
                        }

                        return true;
                     }

                     var13 = 1;
                  }

                  return (var13 != 0);
               }
            }

            var10000 = var1;
         }

         var10001 = 257;
      }

      if (var2 == null) {
         label212: {
            if (var10000 == var10001) {
               var10000 =(( llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) ? 1 : 0);
               if (var2 == null) {
                  if (llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) {
                     label173: {
                        if (var2 == null) {
                           var27 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                           if (lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl != null) {
                              break label173;
                           }
                        }

                        var27 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a();
                     }

                     String var11 = ((String)(((String)(llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .h((String)var27)))));
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a(var11);
                     lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = null;
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = false;
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.b();
                     this.o();
                     return true;
                  }

                  var10000 =(( lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) ? 1 : 0);
               }

               if (var2 != null) {
                  break label212;
               }

               if (var10000 != 0) {
                  IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.b();
                  llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI var16 = this;
                  boolean var24;
                  if (var2 == null && llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI != null) {
                     String var6 = llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
                     boolean var7 = false;
                     boolean var9 = llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .b(var6);
                     var16 = this;
                     var24 = var9;
                  } else {
                     var24 = false;
                  }

                  var16.b(var24);
                  return true;
               }
            }

            var10000 = var1;
         }

         if (var2 != null) {
            return (var10000 != 0);
         }

         var10001 = 86;
      }

      if (var10000 == var10001) {
         Minecraft var10;
         var10 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         var10000 = GLFW.glfwGetKey(var10.getWindow().handle(), 341);
         label199:
         if (var2 == null) {
            if (var10000 != 1) {
               var10000 = GLFW.glfwGetKey(var10.getWindow().handle(), 345);
               if (var2 != null) {
                  break label199;
               }

               if (var10000 != 1) {
                  var10000 = 0;
                  break label199;
               }
            }

            var10000 = 1;
         }

         int var4 = var10000;
         if (var2 != null) {
            return (var4 != 0);
         }

         if (var4 != 0) {
            String var5 = GLFW.glfwGetClipboardString(var10.getWindow().handle());
            if (var5 != null) {
               boolean var28 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
               if (var2 == null) {
                  if (llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) {
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.b(
                        llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI::Q
                     );
                     String var19 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                     String var26 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                     if (var2 == null) {
                        if (lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl == null) {
                           var19 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a();
                        }

                        var26 = var5;
                     }

                     lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var19 + var26;
                     return true;
                  }

                  var28 = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
               }

               if (var2 != null) {
                  return var28;
               }

               if (var28) {
                  IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.b(
                     llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI::R
                  );
                  String var18 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
                  String var25 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
                  if (var2 == null) {
                     if (lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll == null) {
                        var18 = "";
                     }

                     var25 = var5;
                  }

                  lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var18 + var25;
                  return true;
               }
            }
         }
      }

      return (0 != 0);
   }

   public final boolean p() {
      int[] var1 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      boolean var10000 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      if (var1 == null) {
         if (!llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) {
            if (var1 != null) {
               return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
            }

            if (!lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
               return false;
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   public final void q() {
      int[] var1 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      boolean var10000 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      if (var1 == null) {
         if (llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) {
            String var10001;
            label29: {
               if (var1 == null) {
                  var10001 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                  if (lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl != null) {
                     break label29;
                  }
               }

               var10001 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a();
            }

            String var2 = llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .h(var10001);
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a(var2);
            lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = null;
            llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = false;
            lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.b();
            this.o();
         }

         var10000 = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      }

      if (var1 == null) {
         if (!var10000) {
            return;
         }

         var10000 = false;
      }

      lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var10000;
      lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = null;
      IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.b();
   }

   private final void r() {
      float var7;
      label25: {
         long var2 = System.nanoTime();
         int[] var10000 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
         float var4 = RangesKt.coerceIn(
            (float)(var2 - IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) / 1000000.0F, 0.0F, 50.0F
         );
         IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var2;
         float var5 = 1.0F - (float)Math.exp(-var4 * 0.693147F / 90.0F);
         int[] var1 = var10000;
         IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            + (
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     - IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
               )
               * var5;
         IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
            + (
                  lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                     - IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
               )
               * var5;
         float var8;
         int var6 = (
                  var8 = Math.abs(
                        IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                           - IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     )
                     - 0.5F
               )
               == 0.0F
            ? 0
            : (var8 < 0.0F ? -1 : 1);
         if (var1 == null) {
            if (var6 < 0) {
               IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            }

            var7 = Math.abs(
               IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
                  - lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
            );
            if (var1 != null) {
               break label25;
            }

            float var9;
            var6 = (var9 = var7 - 0.5F) == 0.0F ? 0 : (var9 < 0.0F ? -1 : 1);
         }

         if (var6 >= 0) {
            return;
         }

         var7 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var7;
   }

   private final boolean a(int var1, int var2, float var3, float var4, float var5, float var6) {
      int[] var7 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      float var8;
      int var10000 = (var8 = var1 - var3) == 0.0F ? 0 : (var8 < 0.0F ? -1 : 1);
      if (var7 == null) {
         if (var10000 < 0) {
            return (0 != 0);
         }

         float var9;
         var10000 = (var9 = var2 - var4) == 0.0F ? 0 : (var9 < 0.0F ? -1 : 1);
      }

      if (var7 == null) {
         if (var10000 < 0) {
            return (0 != 0);
         }

         float var10;
         var10000 = (var10 = var1 - var5) == 0.0F ? 0 : (var10 < 0.0F ? -1 : 1);
      }

      if (var7 == null) {
         if (var10000 >= 0) {
            return (0 != 0);
         }

         float var11;
         var10000 = (var11 = var2 - var6) == 0.0F ? 0 : (var11 < 0.0F ? -1 : 1);
      }

      if (var7 != null) {
         return (var10000 != 0);
      } else {
         return (var10000 < 0);
      }
   }

   private final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII a(final Function0<Unit> var1) {
      return new IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII() {
         @Override
         public void e() {
            var1.invoke();
         }

         @Override
         public void a(char var1x, int var2) {
         }
      };
   }

   private final void a(float var1, float var2, float var3, float var4, float var5) {
      Object var19 = null; // PX-FIX
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var4,
         new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(40, 40, 40, 255),
         var5
      );
      int[] var10000 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      float var7 = 4.0F;
      int var8 = RangesKt.coerceAtLeast((int)(var4 / var7), 1);
      int var9 = RangesKt.coerceAtLeast((int)(var3 / var7), 1);
      float var10 = var5 * var5;
      int var11 = 0;
      int[] var6 = var10000;

      label66:
      while (true) {
         int var17 = var11;

         label64:
         while (var17 < var8) {
            int var12 = 0;

            while (var12 < var9) {
               var17 = (var11 + var12) % 2;
               if (var6 != null) {
                  continue label64;
               }

               label58: {
                  if (var17 != 0) {
                     float var13 = var1 + var12 * var7;
                     float var14 = var2 + var11 * var7;
                     float var15 = Math.min(var7, var1 + var3 - var13);
                     float var16 = Math.min(var7, var2 + var4 - var14);
                     if (var6 != null) {
                        break label58;
                     }

                     label55:
                     if (a(var1, var5, var3, var2, var4, var10, var13, var14)) {
                        boolean var18 = a(var1, var5, var3, var2, var4, var10, var13 + var15, var14);
                        if (var6 == null) {
                           if (!var18) {
                              break label55;
                           }

                           var18 = a(var1, var5, var3, var2, var4, var10, var13, var14 + var16);
                        }

                        float var10001;
                        float var10002;
                        float var10003;
                        label73: {
                           if (var6 == null) {
                              if (!var18) {
                                 break label55;
                              }

                              var19 = var1;
                              var10001 = var5;
                              var10002 = var3;
                              var10003 = var2;
                              if (var6 != null) {
                                 break label73;
                              }

                              var18 = a(var1, var5, var3, var2, var4, var10, var13 + var15, var14 + var16);
                           }

                           if (!var18) {
                              break label55;
                           }

                           var19 = var13;
                           var10001 = var14;
                           var10002 = var15;
                           var10003 = var16;
                        }

                        me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                           var19,
                           var10001,
                           var10002,
                           var10003,
                           new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(70, 70, 70, 255),
                           0.0F
                        );
                     }
                  }

                  var12++;
               }

               if (var6 != null) {
                  break;
               }
            }

            var11++;
            if (var6 != null) {
               return;
            }
            continue label66;
         }

         return;
      }
   }

   private final void a(float var1, float var2, String var3) {
      float var4 = (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, var3, false, 2, null)
         + 12.0F;
      float var5 = 18.0F;
      float var6 = var1 - var4 / 2.0F;
      float var7 = var2 - var5 - 2.0F;
      float var8 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .aq();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var6,
         var7,
         var4,
         var5,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e(),
         var8
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var6,
         var7,
         var4,
         var5,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y(),
         var8
      );
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         .a(
            var3,
            var6 + var4 / 2.0F,
            var7 + var5 / 2.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
         );
   }

   private static final Unit s() {
      int[] var10000 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = true;
      lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.b();
      int[] var0 = var10000;
      String var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      if (var0 == null) {
         if (lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl != null) {
            return Unit.INSTANCE;
         }

         var1 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a();
      }

      lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var1;
      return Unit.INSTANCE;
   }

   private static final Unit t() {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.g();
      return Unit.INSTANCE;
   }

   private static final Unit u() {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
      return Unit.INSTANCE;
   }

   private static final Unit v() {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.i();
      return Unit.INSTANCE;
   }

   private static final Unit w() {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.j();
      return Unit.INSTANCE;
   }

   private static final Unit x() {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.k();
      return Unit.INSTANCE;
   }

   private static final Unit y() {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.m();
      return Unit.INSTANCE;
   }

   private static final Unit z() {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b();
      short var10001 = 30032;
      short var10002 = -4805;
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c("Snapshot of current");
      return Unit.INSTANCE;
   }

   private static final Unit A() {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.h();
      return Unit.INSTANCE;
   }

   private static final Unit b(int var0, String var1) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0, var1);
      return Unit.INSTANCE;
   }

   private static final Unit d(String var0) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0);
      return Unit.INSTANCE;
   }

   private static final Unit B() {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
      return Unit.INSTANCE;
   }

   private static final Unit e(String var0) {
      int[] var1 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      boolean var10000 = llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(var0);
      if (var1 == null) {
         if (!var10000) {
            return Unit.INSTANCE;
         }

         var10000 = Intrinsics.areEqual(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, var0);
      }

      if (var10000) {
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = null;
      }

      short var10002 = 29973;
      short var10003 = 22899;
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c("Deleted " + var0);
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.n();
      return Unit.INSTANCE;
   }

   private static final Unit f(String var0) {
      float var3;
      label14: {
         int[] var1 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
         if (var1 == null) {
            Float var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.d().get(var0);
            if (var10000 != null) {
               var3 = var10000;
               break label14;
            }
         }

         var3 = 0.0F;
      }

      float var2 = var3 + 1.0F;
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0, RangesKt.coerceIn(var2, 0.0F, 64.0F));
      return Unit.INSTANCE;
   }

   private static final Unit g(String var0) {
      float var3;
      label14: {
         int[] var1 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
         if (var1 == null) {
            Float var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.d().get(var0);
            if (var10000 != null) {
               var3 = var10000;
               break label14;
            }
         }

         var3 = 0.0F;
      }

      float var2 = var3 - 1.0F;
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0, RangesKt.coerceIn(var2, 0.0F, 64.0F));
      return Unit.INSTANCE;
   }

   private static final Unit h(String var0) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var0);
      return Unit.INSTANCE;
   }

   private static final Unit C() {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.e();
      return Unit.INSTANCE;
   }

   private static final Unit i(String var0) {
      int[] var10000 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = true;
      IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.b();
      int[] var1 = var10000;
      String var2 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      if (var1 == null) {
         if (lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll != null) {
            return Unit.INSTANCE;
         }

         var2 = StringsKt.removePrefix(var0, "#");
      }

      lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var2;
      return Unit.INSTANCE;
   }

   private static final Unit d(boolean var0) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var0);
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.e();
      return Unit.INSTANCE;
   }

   private static final Unit D() {
      llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = true;
      return Unit.INSTANCE;
   }

   private static final Unit E() {
      IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = true;
      return Unit.INSTANCE;
   }

   private static final Unit F() {
      IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = true;
      return Unit.INSTANCE;
   }

   private static final void G() {
      JFileChooser var1 = new JFileChooser();
      int[] var10000 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      short var10002 = 29969;
      short var10003 = -8656;
      var1.setDialogTitle("Export Theme");
      short var10004 = 29976;
      short var10005 = -6313;
      String[] var2 = new String[1];
      short var10007 = 30022;
      short var10008 = -10518;
      var2[0] = "json";
      var1.setFileFilter(new FileNameExtensionFilter("JSON Theme", var2));
      int[] var0 = var10000;
      String var14 = llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .h(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a());
      var10004 = 29972;
      var10005 = 15688;
      var1.setSelectedFile(new File(var14 + ".json"));
      int var5 = var1.showSaveDialog(null);
      if (var5 == 0) {
         File var3 = var1.getSelectedFile();
         File var6 = var3;
         if (var0 == null) {
            String var7 = var3.getName();
            var10002 = 30002;
            var10003 = -28185;
            Intrinsics.checkNotNullExpressionValue(var7, "getName(...)");
            short var10001 = 29955;
            var10002 = -21843;
            if (!StringsKt.endsWith(var7, ".json", true)) {
               File var12 = var3.getParentFile();
               String var16 = var3.getName();
               var10004 = 29955;
               var10005 = -21843;
               var3 = new File(var12, var16 + ".json");
            }

            var6 = var3;
         }

         File var4 = var6;
         Intrinsics.checkNotNull(var4);
         FilesKt.writeText(
            var4,
            llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .c(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII),
            Charsets.UTF_8
         );
         llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI var8 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         String var9 = var3.getName();
         var10002 = 30054;
         var10003 = 32598;
         var8.c("Exported to " + var9);
      }
   }

   private static final void H() {
      int[] var10000 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      JFileChooser var1 = new JFileChooser();
      short var10002 = 29979;
      short var10003 = 23066;
      var1.setDialogTitle("Import Theme");
      short var10004 = 29965;
      short var10005 = 27935;
      String[] var2 = new String[1];
      short var10007 = 30035;
      short var10008 = 9622;
      var2[0] = "json";
      var1.setFileFilter(new FileNameExtensionFilter("JSON Theme", var2));
      int[] var0 = var10000;
      int var4 = var1.showOpenDialog(null);
      if (var4 == 0) {
         label17: {
            llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII var5 = llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            File var10001 = var1.getSelectedFile();
            var10003 = 30036;
            var10004 = 22951;
            Intrinsics.checkNotNullExpressionValue(var10001, "getSelectedFile(...)");
            llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = var5.a(
               var10001
            );
            llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var6 = var3;
            if (var0 == null) {
               if (var3 == null) {
                  break label17;
               }

               var6 = var3;
            }

            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var6;
            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = null;
            lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = null;
            llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.o();
            llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI var7 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            String var8 = var1.getSelectedFile().getName();
            var10002 = 29958;
            var10003 = -20807;
            var7.c("Imported " + var8);
            if (var0 == null) {
               return;
            }
         }

         short var9 = 30019;
         var10002 = -21417;
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c("Import failed");
      }
   }

   private static final Unit I() {
      lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = "";
      return Unit.INSTANCE;
   }

   private static final Unit J() {
      lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = "";
      return Unit.INSTANCE;
   }

   private static final String K() {
      String var10000 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      if (lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl == null) {
         var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a();
      }

      return var10000;
   }

   private static final Unit L() {
      lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = "";
      return Unit.INSTANCE;
   }

   private static final String M() {
      String var10000 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      if (lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll == null) {
         var10000 = "";
      }

      return var10000;
   }

   private static final Unit N() {
      lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = "";
      return Unit.INSTANCE;
   }

   private static final Unit O() {
      lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = "";
      return Unit.INSTANCE;
   }

   private static final Unit P() {
      lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = "";
      return Unit.INSTANCE;
   }

   private static final Unit Q() {
      lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = "";
      return Unit.INSTANCE;
   }

   private static final Unit R() {
      lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = "";
      return Unit.INSTANCE;
   }

   private static final boolean a(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      int[] var8 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      float var23;
      int var10000 = (var23 = var6 - (var0 + var1)) == 0.0F ? 0 : (var23 < 0.0F ? -1 : 1);
      if (var8 == null) {
         var10000 = var10000 < 0 ? 1 : 0;
      }

      int var9 = var10000;
      float var24;
      var10000 = (var24 = var6 - (var0 + var2 - var1)) == 0.0F ? 0 : (var24 < 0.0F ? -1 : 1);
      if (var8 == null) {
         var10000 = var10000 > 0 ? 1 : 0;
      }

      int var10 = var10000;
      float var25;
      var10000 = (var25 = var7 - (var3 + var1)) == 0.0F ? 0 : (var25 < 0.0F ? -1 : 1);
      if (var8 == null) {
         var10000 = var10000 < 0 ? 1 : 0;
      }

      int var11 = var10000;
      float var26;
      var10000 = (var26 = var7 - (var3 + var4 - var1)) == 0.0F ? 0 : (var26 < 0.0F ? -1 : 1);
      if (var8 == null) {
         var10000 = var10000 > 0 ? 1 : 0;
      }

      int var12 = var10000;
      var10000 = var9;
      if (var8 == null) {
         if (var9 == 0) {
            if (var8 != null) {
               return (var10 != 0);
            }

            if (var10 == 0) {
               return (1 != 0);
            }
         }

         var10000 = var11;
      }

      label66:
      if (var8 == null) {
         if (var10000 == 0) {
            var10000 = var12;
            if (var8 != null) {
               break label66;
            }

            if (var12 == 0) {
               return (1 != 0);
            }
         }

         var10000 = var9;
      }

      float var13 = var10000 != 0 ? var0 + var1 : var0 + var2 - var1;
      float var14 = var11 != 0 ? var3 + var1 : var3 + var4 - var1;
      float var15 = var6 - var13;
      float var16 = var7 - var14;
      float var27;
      var10000 = (var27 = var15 * var15 + var16 * var16 - var5) == 0.0F ? 0 : (var27 < 0.0F ? -1 : 1);
      if (var8 == null) {
         var10000 = var10000 <= 0 ? 1 : 0;
      }

      return (var10000 != 0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[113];
      int var3 = 0;
      String var2 = "Åy_~\u00132\u0081t\n¦ðUPÜ\u007fX\u0083*|££\u0094¦\u009f\u0003¿\u0080¨\u0013{Â\u0098©\tdÎ]F\u0091¨´\u009bZÎß/\u008b|\u000f\u008dÄ7\u0083º¡#Y\u001c7\u008d\u0014ßÙ¡\u0011\"/´ú8\u0013\u0087\u001a«\u008d3pw|b\u008ft\u0006ðwþä'2\u0014%_ôS%x\u0095M2lú&\u0099»Ò\u0083\u0012Q£¯čÕâ~zï\fdEµ\u001fÃ\nED\u0095øÀ\u000e·p\u0019qK+\rGâq\u008cG¾Ú¥\u008e)\\Þ\f%f\u0017XïÑÓñK)\u009bp\u0019F:\u0007ùn\u0082Y¦[MÌ¡\u001eäÿ\u001eÇ\u00915\u009d\u000eK\u0004fy°\u0012\u001bm\u0086Î?\u0000mQÛc[/ò!g\u008fÊÑ\u001a£\u009b\u001d\u0006\u008bÁì¤Dcð\u001aïPFÛ\u0094siÊ\u0007\u0082$)/\u0001Å`,é\u0010ÔLÿîÃp\u0003¥\u0006\u0094\u0081\u000b÷Ut-ì\u001cYÏ¼Ëí\u009d#E \u0091¿\u0014×ÁcüU4\u0090ö\u0081Q\u000b\u009añþ;\u001bCèB^Z?ËE\u0012ÄÖSw#e\u009fÖÕ\u009a\u0096ýÄoý\u0082D\u001fËz½v\u001cè£^í\u000f\u0098\u0006ãk\u001as2F£ßûè×\u0089Ø\u008bR`¤Õ!\u0099\u009d[Á\u0087ñ\u0005W\u0010ÞMÊ\u009fÊûJ\u0005\u00ad>C\u0003QË\fYÂ®\u0093 a\\\u008eM\u0095\u0002\u008bëħØ4ß ÛWâ.erÙ§\u0006ñýNÍØ\u0016ª-*Í@Ý*øÜÏòÖl¨X\u0088\u0086êW£\rÇ5õ|\u0090D#\u009f\u0096¦¸\u009c\u000e\\\u007f\u0005R4¼ö\u000eyÉ¨é)¿\u001d¥n\u001be\u009bi|Ôó§sÛ\u008b\u0018\u009eÚY\n]\b\u008bBè\u008c$:¢g\u0017u:Ç<ÈXÓ©5)\u008a¾>\u0087¶\u0000;hz\u0081]õ\n\nnt±\u00ad2B|ô\u0096Z\fãX\u0019dØÃXáÏ\u0005R\u0086j\u0093Ô¶¿-\u0001\u0093\u009cblþ\u0003~ýÃ5T«õ\u0090¥þc:È¼<»æw+VÂ\bás<öz¨\u00065\u0083?´Þ=ý\u0087üiGD\u009d ²\u0089Êè®E£|i\u0010?\u00adoòîPgÎÿrÛn:T\u0084½\u009aJ§\u0089cT\u008e\u0099pòo×WÃ·\u000e\u0092ÎPÌ\u0091²Ï¢8ÃF\u0098sø\u0003\u007fù\u0001\u0006\u0089æ\u0012\u009fû9\"RÕHì¡áQSÑ%y=ë\u009eÖõæò\u0089\"vmmP\u0081\u0093ô\u0004\u0094ä\u0083\u0098\bºàèûÝÀÁÈ\n¸\u001e{\u008fìÛáó~U\u0013XU9\u0090\u000f£`(|l\u008chzÆ4¶gLÔ\n{ÿ\u008e\u0080H\u007fN¨µJ»òð\u009a8sX¤\u0006Ó÷¥\u0097.\\\u008e@\f\u0095ð_Å-\u0081\u000e\u0002±\u0087»fØct\u008eá\u0090?ÛA\u0094ëT\t_L+>\u0016gdÇHDV\u0005Ôoç0Æc\u0011¸\u001fËË\u00864a\u0096V9Iiö9\u0019}¤:\u007f/§{\u0002«yÞ\tûbúÄ°¸\u0015°T\u009e\u0000Û\u0004\r\u0091²°\u0083@ê\u0085=D$^ó2÷6\u008c\u000fNÊ\r-.½mFÈ§â»\u001fî'äOºÕXõD¢¤Ç¥õ\u001cÑú&bõ`\u0016g«v\u0003ô1I°¿æàÆDS#\u0001`V\u001dÖfÚ(\u009f#Ó;ìo\u001c8'¢\rRýõ2\u0096÷S¢\u00128A\u0002ê\b\u008eùõ×\u0014\u0095\u0080÷\n7zàÔÑðó\u0086^W\u0014ésQ\\ç\t*'\u009eÏk4p^\r×/]2$\u000bn:º\u008a.¢=@\u0099bÓ\u0004Ûà\u009cMҮ1\u0099±ÜhDm\u0005M<\u0000U5\u00883\u0086\u008fôÑÝ·/KZ\u001dýäo\u009aø þÔ\u0091Ê\u0015åä\u0080ñL\rÛ\u0002ë\u0090KD~\u0088£ìë\u0004Ôª´°\u008e\u000elc\u0003\u0015§IÐ\u0014\u0018£¹Ó-\u0002\u001f\u009c\u009c\u0013×\u0007\u0011ô\u001bÍiì$\u009e@GøÂ{È\u0018drú\u0092w\u00ad£\u0004dúgÜ¢D@ORnÝ&\u0091º£\u0016@H9°á\u0011Ø(ï\u009a¡¹¹ÂQDslÑ\u0095\u008f\u000fF\u0013³ydëz«üBë`u\u009bt÷\t;éÛ=îw\u008f\u0096^FB\u0019X\u0080çB1ç\u008e\u0004\u0014\u008f`\u008dC\u00ad\u000e1«\u008d\u0091ðç¸\u0097ß\nçW\u009b\u0093\u008d¢AWs5\u0081ýÞ1v\u0098=víLÛÿléCÞ\u008eÅs-\n<\u0088¡\u0010l\u0096jwJ\u0010\u000f\u0086ë:\u0086¡¶y\u00820J,@3îð_)\u0084ÚµÞÈObB/f\u0007\u0088åaµ03K¿tÅâ±\r×6\u009b%\u0090&0\u0095·w\u008c\u009dÒp\u009bC2_\u008a\u0016µ\u0004,5\u009c\u0003Ò\u009bÝo|¥\u0005\u009cÃ\b\u0084&+»ÀYþhS\u0090ÃEpå×¡ÈX\u00109ã¿\u0019\u0013I\r«ØIßV^(2C\u0019KJ\u0080ov \u009a\u000bIK ¼âmß\u0095¶H\u0091/m·Ö]»\u0085Ôôðà\u0099ÏÕºd\u009dWÆ,Þfõï\u0089\u0016ÉçZ\u0088\u009d+\u0019MÝK\u0007l\r\u0083\u0089\u0010¤\u009bx\u0003ôe°ÇWz3\"÷&³\u0019m\u009b\u0004´²ZÁ\u00ad×\u0010ÿ\u0081\u0086-\u001aÕ5¶Ã\u009654\u0080\u00104þÎ!'ÚA\u001cÔËd\u0096a[\u001av\u0003\u008f\u0081.O\u0081Ç\u0013¹\u0083è\u001cJÃ\u001aÜ\u0081y\u0014\u0088\u0098´\u00847rÂéWçÕÈ°\u0095S\u00157\u0006\t'\u0084é\u0007qwd\t)#ªÒÆ\u008cÜx`l\be%\u009bª\u00886\u00149\u0092úëD\u001a\u0015=DÎ\u0005ñ#«~\u009fR\u00ad\f\u0088ÿÁì+9Q\u0084g¨óìT<_æa%vÖ\u00ad?AXâ\u0092.\u0093'a¸û\u0013°\u009d\u00910¹A\u0000,ý¨}@ý;\u000f|G\u001at¤B\u0013n\u0087\u009aT\u0017k\u0089©\u0087\u0095i³\u0001à©áuáq\u0085íSî\u0014\u0082\u0099+\u009bpqZ\u008a\u008c´5Ô\u0010x\u009b\rZTnp\u00ad6c=ÇGÉõ\u0083¥M\u001f[\u0085&êÙ\u0088P\u001bßæ|F\u0095´\u0092´\u0087#:\u00917\u001fB¦\u0081\u0094\u0018g\u0007\u0016\u0089ôÏª\\¾u»\u0015\u0010¨-\"Û&>@\u009a±Ô\u0018\u0014Lo\u0092$\fÇß1x\u0011Iß\u000b=×\u0012fûº\u0016\u001ap^\u0011¡§£3ÿò\u0087äë\u0098èhú·ß|\u008bHõ\u009dÆ\u000fÃ#ã\u0019_)\u0002\u00110 \u0086ýÅÎ\\W\u001c[W\fKzJHËIPÜ&f\u0084\u0011,\u009c8\u0088\u000b\u0088:{ªìaí.3<½ôuYÞð\rwKÜz\\Äwà0j\"\u000f\u001bø\u0012ói«¨þ\u0081¢\u0095÷Iß7[ìe©Ü5\f\u0002`ÉÊ=\u00adÙa\\\u008dp\u0092\t³a@Æ7Å\u0089û7è\u0099\u0013\u0013`ìõFÍ\n~1\u0014âúã<ÜrÏQã\u0000u¯XYÞF\u001b\u007f\u0010O¤ÂPäU\u0011´íë`Gi!ù\u0019ã\u000b\u0083,Á\u0095BYËe¦¸\u0013Må?[ç\u0086\u0016\u0017Ô\u0014\u009eªÒÖ\u0082ß*\u0086\u001aÓT\u008d\u008b&\u0082Ô!ví;ÔÍå¯\u008fÃdpV8÷^ËO\u0010Sp!Üî¼ÛÓ M.\u009d\\Ü\u0099Y\u0082+ 6\u0099u\u0004Ú¨S\u0082°Ô\u008a_ëF=2OÏ\u0085\u009cäþû¦\u0085S\u008aÐÁMHbè_Z!SQI\u0017¤¨\u0003ýö¸$\u0004»Ss!ä¢ÁðÝý@??\u0099\u0092)E¯\u0018\u0094Q6È(\u0010 \u0095M3PV{¼éÆ\u0097]Ó=U]Ú\u0094\u0082\u0096¿*U'¥a\u0095º\u009d\u00ad \u008aÂU´VC/æ\u001c\tö)ßð#È`õðkûã\u0086¥Ü4ÏøA\u0001;QeÛÒÃD\u0011\u0085\u0011ÕÇ\u008c\u0001H,\u0089ÒO\u0084÷*óÎ\u0005<M~±¾:B1Õ«AòÖ¹$ªe¤Ïz\u0011\u0080+\u008a\u008e5X\u0088iH¨ñ±Àæè\u0097\u0015swÊKÇ\u009f<\u0004x®nß\u0004\u009c\rÛ\u0093\r»»X\u007f®ld²ôAôs]\f¾\u009b7y\u001e\u0081â¼Ú0Õ\u0091\f<îw\t_òÔ~â%WZ\u008cJU\u008d\u008c\u0091ÎøÔX\u00adÔÜ\u00005Km´0çë'»ÝÜ\u0089ëöðH±¦Y6D\u0087\u008b9×È9ßS.\u0007\u0005WÓJÜb_ð´\u0093\u0088½lj·(?ÑÚæs##ÕtÀe\u009bâ¬HRSÍÿR\u0097\u0002l¶Iï\u0082Ûp8\u008b\u008f\u009eÑÐ\u009dì;\u0017oâ\u008bË)ñ\u008e6Õ°«\u0005öv©7¼\u009då\u0010c)¨Q\u009a9û¼\u001aø¸PT\u0093RD-\u0016û\u0003cŊ\rneë\u008c\"[I,\u001eZªÑûq´ó\u000b\u000f\u008c:W~AýXx\u0086\u0099\u007f\u009c\u0080q\u007foì$;k¤«à qÔ\u0099é\u0093\u009bY·\u0097©\u007f+ \u0018Ù9^î\u001fà?4\u0018Ë²i,Æ\u0006\u0096\u001fÆ$\u0082\u0003Å\u008bÐ9\u0084ÑT\u0003!F\u0004\u008b\u0005åI\u0001ð\u0089f#-Ú³2Eí\u0005\u00adZ%ÀÊ<M\u0082\u009cZ8\u00adUpK¸\u0019mÇ3\u000e¢øÿ9ßd~\u0018(¦\u0002*\u0006ÁÊÒ¡¥'Û+zÔ\u00968\u009b\u0006êDd!ª\u0007\u001bX\u000bp¢oPIú¯f\u001eêá\u001e¦\nÌKý\u0093º\u001eT\u001e@\u0093.ÈØ´`=j\u0087\fiF\u0014B©*\u0092\u0098\u0096®\u0010±\"5Ý`\u0082¤v\u0095\u008di#VQ³Vñ\u008e\u0095è\u0019;\u0003$ù\\JöäÛXWÞ\u009dA:Z5Ày0ë\u0011ò2ö±ý\u008f×\u0083\u0016»7\\V¿\u0085æ\u0086MØøaû²\u0089\u0092\bù'\u001f§f|#¯gR\u001aÂÉP=z¶\u009aT\u0086ÜJ\u0012:0íØ\u0096þ¦PÁ¢jvô\u0087ì\u001cQvé9ßÚ×Â>}cEô\u0095\u0085ó\u0007\u0004½X\u0093)3¾\fKc\u0099¸\u0082Äo¸\u0095ý¹A\u000b¬ïE$½ó¤:ª-µ\u00126ð\u007fþ\u001f¼û3Þ\u0085f\u009c'î§\u0097\u0017§\r\u0000\n/I@ª¹jOZ\u0083\u0010³\u0010g%ð\u000bb¬]_%ÉÞ\u0097\u0010eq\u001c\u000b¾ª\u0088\u0096µô\tÝÌUÇ\rw=á)\u008dÎö¶¦º×R8\bc\u0082cÞÝ0¸/\u000fpqú5pi-ñ2À\u0019\u0095=}Ú\u000bU.\u008f×V\u0005\u0001\u000fDý\u0006\u0006U\u008c´>ôR\n\u000fs\u008d\"2n:E\u0005\u0083Ŋéèù;\u001f8)\nbv\u0093§èZV\u0080\u0017\u008d\u0093\\©M\f\u0002³0±\u008b Þ»´\u0095ùó<·!\u0019çå\u0088i|í8Î§\u007fß+G:eYcV±ðS×¾Ç\u000bÐ\u009eWbú6´EØw\u000f)»¢â¿4¿\u0018\u0001Ç\u0019S\u0005JãÌèp ×½\u0082¥±\n (7®KÅ\u0093(ùk\u001byf\u001aÆè>O\u0002\böq¤Ê\n¯\u0085Ì\u001b¿C´í\u0002ZåLBÏÌós\u0086\u0091Ã]·ªG\u008cJØH\u0082\u008di\u0018\u000b /¼\u008dìrüJ;¹á\u000e×çØ¿\u0081>(ÍaC)\u0004&]\u000eûçÅá\u0015G\t\u008e\u0001\u0090¹Õ\u000e0êdúQ\u009b\u0097±\u0096\u0016Ñ[üR7lçÎ'K\u009f\\\u008a÷Öºqn\u0085ë\u0090>\u008b\u001f\u0004\u009e-Öaöù©¥¼ÆåScB¨_\u009aûû\u0088\\¨ãg\u0090'çÏLÍÆ¨î\u0084ÕÁÀÜ\u0086m\u0014\u0094)´\u0005Õ%2Kfjk»åý´»æf\tNô\u009f\u0004zó=Ôy±ÊBÖ]rùl\u0086Ä¢t\u0098{Ð\u0098øî3D¢\u00adð_\u0086ÖË\u009b\u0010ÍxI\u0010\u0087Np±UøìÕ\u0091 \u0018G\u000f:ôÁ\u0085daøAg4ât2Õ\u001c\u0011Qx%\u0081\u0015Ûå\u0006Íü\u008dß\u009f*¬p\u0096\u000bp7y+V\u00962Æx²ï\fÊ}\nj*·å\u008b×\u0014\u0081\u0001Í\\ÐO<ÉÄ \\-<Ðn'ÈÙiI<\u00866?¹\u008f2\u0095dñ\u0015îËòK,¼\u0018\u001aøÄá\u007f\u008f{üµ±}\u0007¸\u0012B(\u0000\u001cÏ=w\u001azµ?/@í\u008fmÍ/\u0081·ýY\u0017Ó'u\u001dÒ\u009eWü\u000fü\u000eFK\u0099\u001fzÃ\fáE\u0005\u0003\u0086@\u0093\u0091ªG(E\u0000l,Xò\u0091×H\u0088\u008bÎY\u001d<+\u0084(N.,±\r5ìy¶ë¢òMöy»@\u008cGÒq\u009e\u0017xÄ/Û|¿ª\u0010¥©Ò++M\u0080¾\u0098Ô^Eãlk\u0005ní\u0013\u0096\u0087¦\u007fÍGfÊu\u0010ÜîX(&ò&£èíÙ\u0084\u0090¶2\u0089Ð9\u009bò×ûd\u0089H\b\u0007[¿µ\u00ad9\u0084)\u0007éÇ>©i¼\u0098»Y\u000bïGÝ·qûiHò`Ä¢Ó\u009f§n\u0085 kÂTó¸\u000eÐL\u008c&>«%\u001aå@u®A\u0016î¶\b»ÁÀK¸Ï<=;øê\u0001\u0092]\u008f\u0091\u0094ûFB\u0014`}A\u001e8¹ì´ÓInî\u0097Zg \u0084\\\u000e}\u0005\u0096\u000bôAÝ\u00ad3ZFHoÿeu¤ªâDO\n<\u0017\u001doÃ\u0019ûõ\bG\u0088\u0098cÚ³p²zÙW\u0093\u001b\u0017\f\u0019Î`@È1²\u0000j\u000f\u0002®\\ù\u0018\u000e\u000ei®TÉ·\bÚ©0\\\u009cý©îâKÊ\u0099N)\u0091®\u0099¾7¡÷(;\u0005\u0083dV¬\u0095\u0003ºá\u0082\u0098õ\f³gDÖ kÐ3ÎU°T\u0010ô\u0002\u0087\u008ffQº`7ûìn=S¢\u0095Ħÿö;øG\\qO\u0017^\u0097\"ÏAÄXê\u001aòò±!^!¯\u0006¶Y\u0006Bïz\u008f\u009alÞv\\0lµ\u0019»ùYô\u001a\u0089±d\\Ä\u0092Wìd \u0018òsÇÉð¾Îë[E9e\u0088\u0004éE2Q:\u0017JÍ¬Úz\u0082Å\u0001Îiùn¦\tí\u008a\u009bq0·Þ\u009f®ÛÔæ\u0006\u00057Ø\u0093â\u0002í\u0095¼?\u0095b\u0098\u0097×\u008bQU\nêÕ¸\"þ¸º\u00adk\u0018\u0016¨¤5Õ?}Þ%ðÆ¹\u0000£Fù+½p\u0088GZb\u0004.Ã\u001c¼¸<2ª$`\u0002o¹ÕK=-\f\u009c*µeõ5z\u009fäÕ ©]çmÞ°pp\u0010wtV@Þ\u009f\u0081\f¦\u007fÍ(fÌ*·Ñ4\u0084öo\u00160÷\u0013¸-iýF(²áÈÊÝ`\u0010*\"\u0006Ý\u0004\u0082+j\u0015Þ-à\u0015\u008c\u000f\u0094%¶/ü¦\u008d 1¦K£$ßÂ´,ß¶EÏ'5i>Ð±S\u0016)[áR\u0097pÝ\u0081\u009a\u008aè\u007fæ \u009f\u008dĐõTz¬oÖt\u001e·t\u0083gMé\u0094Mà¸³¦\u0099«[p\u000f,¢\u001c\u0084ê¿o\u00858-\u008a^Ö5=\u00153¯¼Û\\J\u009c»Æ\u001d\u0090ºÝé5\u00802æ6Ea «ÄI\u001a\u0011\u0011ï\u008dUIo&\u0014¸¿\u001aØ¦x;Öí\u008bË8YD²Lo\"Ëd:\u0015\u009fË\u0086QÑ·¦/#\u009d\u0012BQóû\"w¿JÝ\u0092\u007f+DA¨h\u0081è¥ôúû8Cª\u0013þ\u0004ÿÁfÿøu\u0098Ìª]\u0019<\u0011ýÆ!.àü·¹ÖtCJQâ\u0010,\u0091\n\tñ±\u00933¶B]bè^éK\u009f\u0004\u0084Ï+ê%Ö_¢ØA\u009d|\u0015¯\u0006oû\u0091øv´÷=Ø\u0087XiÏ\u0014R¤v\u009b\u0081<,«\u0016DÏ \u0092mÈÛ\")²ÐÀæ\u000fK¸â\u009d7·\u0090ç\u0001~ö\u0099'¸\u0084*UENlï\u00ad¾,\u0013¼Õ¾V,-Ã\u0019\u000ejá\u000e\u0003\u001dÚ\u0015\u0007¹\u008eö\u009ezÕÏ\u0011_µ\u001b©Íy9W|$ÉE(Ú\u0089[\t\u000bò6{ÔÈeÒ\u0003>|I\u0018³\u000f~2®j`QØ\u0019u\u0098á\"\u001cÄg`.\nÜ-3¦\u0013G.WHÂ¸ÙKK\u0000jå¦w¯\u0080\u0014\u008aº\u0005\fúYÄa\u0004´æ\u0087Ø\u000b\u0087ý¯|Q©\u0095v_ µ\f¤\u0019¦\u0019ü\u0092\u001e<²\u0093|ú\u0006&M\u0013 0Ð\u00046t&\u0084\u0015(Ê\u0093Tyª¶¼¦¶Ô=\u0005\u00962Rjü,\u00160\b$M\u008b'À\u000f\u001bÈ\u0005GHßc¬\f?íX0#·å\u0098Í\u0007\u0093h\u000bF±(<¹oïîáS\u009b\u0005dLT\u0012À\n@ÿëªßÁ*Cpk\r~ü\u0017\u000e¨×ë\u0089.Ï\u0084n¹\u0005;µG¥\u0017\u0002tH\u0005øÐ\u0089.\u0016\u0005û\u0084Hú^Ď¢ý\u0090\u00992l\u008c\u0080Ö'\u0005\u008d:\u001f\f(\\\u0098úþ\u0084\u0019©\u0088\u0007a'¡r\u009bá\u001cÞì\u009a\u009e\u009au¼mQÙÿV?}\u0094\u000f4ÊBå\u00171üéâàfy\u0005û\u009d£\u009b\u008b>À×b\u0011Ïl&\u0099\u0003iç¸\u0017\u007fªq£êMö\u008fþ²ZÂ¬ý\u0092A\u0014¬\u0088\u007fé\u0010.iMÑ¶µUÿ«fñõ\u0097\u0098Ñ]\u0082Î+¨\u0006Ì&iB\u0014£¤V×P>\u0012a&èÆÔc\u0085\u000246cÒÚB\u0099,\u0013\u0086û\u0016FjãL\u0093Rì!(^áUÊn`f*ì\u0006\u0018Tê7\u0084OèûüÁ\u0089Q\u0002\u0081í G\u0094açP\u0082R9Ã\u0016geë[\"Ì\u0086' \u001bÜ½¬Ã\u0089glõÛ\u0015]\u0082èÉÙ\u001cÀu.\u0012Õ½\b9 º\u0018Ý/¶\u009a3H\u008cÞ³o»Çº6Ä\u0017\u009eæzèP@\u0013^Éí\u0005ñõBùa\u009c\bkR\u008c5\bÉ\u0002\u0010\u0018Ð\u0002î\u0089âV(¨Oö¼|#Y~÷(º°6\u009aI\u009e¯\u0010Âû\bÄ\u00adêdz½]Ð]%5¡Y\tn\u0089r¼f&\b\u009aÕ\u0010f\u001b<|)Ã¥\u0000ïÎ»\u0013{xE\\\u0015|\u00000\u008d.\u0000D\\ãá\u000fº\u0005\u0082\u0006üI¬B\"ü\u00170R¹Ç\u001fI'w0Ïr\u0018X<hòÄí\u009aë\u0081M$\nÔ_\u009cp^d\u0002\u0014`\u0005\rM\n\u0016Ìê(ÜYãG\u007fí-\u0003\u001fàï\n\u009a\u0082g~`L2,±\u0006\f/ª¶\u0090½è\u0017`\u0089iJ®\nç\u0086\u001f\u0085A$ùÿ\nü\u0003¤ÍÌ\u000fwÙ\u0003\u0088bG\u009eØÇ¨Wx\u0014&E\fô\u0016ÎgfAy\u0000õ¬Ys\tÛD$Cmc\u008b¤à\têD\u0002C©c\u0013¤ó\r\u0004\u0099²\t~\u0090NN±¥5±d\fK\u0015}\u0088'¶õV\u0007ùé\u0093\bôo\u0088Ô$NþG\bé±\u0019Þ\u0089´3Ó\u0005¿;\u0016Å]\u0005Ä\u0003yÂ°\u0012ãÐ\u0010(Ï\u0095(í0¾\u0097\u001aÎ\u0095ßiÐ\u0095\u000ePÅ8\u0082/ádrú;\u0099\u000e²}\u0007d^\u0087\u000fü*ë\f]\u0007\\mÝ}\u0084ûák\u0016å\u0007\u000bëj¹Aü\\";
      int var4 = "Åy_~\u00132\u0081t\n¦ðUPÜ\u007fX\u0083*|££\u0094¦\u009f\u0003¿\u0080¨\u0013{Â\u0098©\tdÎ]F\u0091¨´\u009bZÎß/\u008b|\u000f\u008dÄ7\u0083º¡#Y\u001c7\u008d\u0014ßÙ¡\u0011\"/´ú8\u0013\u0087\u001a«\u008d3pw|b\u008ft\u0006ðwþä'2\u0014%_ôS%x\u0095M2lú&\u0099»Ò\u0083\u0012Q£¯čÕâ~zï\fdEµ\u001fÃ\nED\u0095øÀ\u000e·p\u0019qK+\rGâq\u008cG¾Ú¥\u008e)\\Þ\f%f\u0017XïÑÓñK)\u009bp\u0019F:\u0007ùn\u0082Y¦[MÌ¡\u001eäÿ\u001eÇ\u00915\u009d\u000eK\u0004fy°\u0012\u001bm\u0086Î?\u0000mQÛc[/ò!g\u008fÊÑ\u001a£\u009b\u001d\u0006\u008bÁì¤Dcð\u001aïPFÛ\u0094siÊ\u0007\u0082$)/\u0001Å`,é\u0010ÔLÿîÃp\u0003¥\u0006\u0094\u0081\u000b÷Ut-ì\u001cYÏ¼Ëí\u009d#E \u0091¿\u0014×ÁcüU4\u0090ö\u0081Q\u000b\u009añþ;\u001bCèB^Z?ËE\u0012ÄÖSw#e\u009fÖÕ\u009a\u0096ýÄoý\u0082D\u001fËz½v\u001cè£^í\u000f\u0098\u0006ãk\u001as2F£ßûè×\u0089Ø\u008bR`¤Õ!\u0099\u009d[Á\u0087ñ\u0005W\u0010ÞMÊ\u009fÊûJ\u0005\u00ad>C\u0003QË\fYÂ®\u0093 a\\\u008eM\u0095\u0002\u008bëħØ4ß ÛWâ.erÙ§\u0006ñýNÍØ\u0016ª-*Í@Ý*øÜÏòÖl¨X\u0088\u0086êW£\rÇ5õ|\u0090D#\u009f\u0096¦¸\u009c\u000e\\\u007f\u0005R4¼ö\u000eyÉ¨é)¿\u001d¥n\u001be\u009bi|Ôó§sÛ\u008b\u0018\u009eÚY\n]\b\u008bBè\u008c$:¢g\u0017u:Ç<ÈXÓ©5)\u008a¾>\u0087¶\u0000;hz\u0081]õ\n\nnt±\u00ad2B|ô\u0096Z\fãX\u0019dØÃXáÏ\u0005R\u0086j\u0093Ô¶¿-\u0001\u0093\u009cblþ\u0003~ýÃ5T«õ\u0090¥þc:È¼<»æw+VÂ\bás<öz¨\u00065\u0083?´Þ=ý\u0087üiGD\u009d ²\u0089Êè®E£|i\u0010?\u00adoòîPgÎÿrÛn:T\u0084½\u009aJ§\u0089cT\u008e\u0099pòo×WÃ·\u000e\u0092ÎPÌ\u0091²Ï¢8ÃF\u0098sø\u0003\u007fù\u0001\u0006\u0089æ\u0012\u009fû9\"RÕHì¡áQSÑ%y=ë\u009eÖõæò\u0089\"vmmP\u0081\u0093ô\u0004\u0094ä\u0083\u0098\bºàèûÝÀÁÈ\n¸\u001e{\u008fìÛáó~U\u0013XU9\u0090\u000f£`(|l\u008chzÆ4¶gLÔ\n{ÿ\u008e\u0080H\u007fN¨µJ»òð\u009a8sX¤\u0006Ó÷¥\u0097.\\\u008e@\f\u0095ð_Å-\u0081\u000e\u0002±\u0087»fØct\u008eá\u0090?ÛA\u0094ëT\t_L+>\u0016gdÇHDV\u0005Ôoç0Æc\u0011¸\u001fËË\u00864a\u0096V9Iiö9\u0019}¤:\u007f/§{\u0002«yÞ\tûbúÄ°¸\u0015°T\u009e\u0000Û\u0004\r\u0091²°\u0083@ê\u0085=D$^ó2÷6\u008c\u000fNÊ\r-.½mFÈ§â»\u001fî'äOºÕXõD¢¤Ç¥õ\u001cÑú&bõ`\u0016g«v\u0003ô1I°¿æàÆDS#\u0001`V\u001dÖfÚ(\u009f#Ó;ìo\u001c8'¢\rRýõ2\u0096÷S¢\u00128A\u0002ê\b\u008eùõ×\u0014\u0095\u0080÷\n7zàÔÑðó\u0086^W\u0014ésQ\\ç\t*'\u009eÏk4p^\r×/]2$\u000bn:º\u008a.¢=@\u0099bÓ\u0004Ûà\u009cMҮ1\u0099±ÜhDm\u0005M<\u0000U5\u00883\u0086\u008fôÑÝ·/KZ\u001dýäo\u009aø þÔ\u0091Ê\u0015åä\u0080ñL\rÛ\u0002ë\u0090KD~\u0088£ìë\u0004Ôª´°\u008e\u000elc\u0003\u0015§IÐ\u0014\u0018£¹Ó-\u0002\u001f\u009c\u009c\u0013×\u0007\u0011ô\u001bÍiì$\u009e@GøÂ{È\u0018drú\u0092w\u00ad£\u0004dúgÜ¢D@ORnÝ&\u0091º£\u0016@H9°á\u0011Ø(ï\u009a¡¹¹ÂQDslÑ\u0095\u008f\u000fF\u0013³ydëz«üBë`u\u009bt÷\t;éÛ=îw\u008f\u0096^FB\u0019X\u0080çB1ç\u008e\u0004\u0014\u008f`\u008dC\u00ad\u000e1«\u008d\u0091ðç¸\u0097ß\nçW\u009b\u0093\u008d¢AWs5\u0081ýÞ1v\u0098=víLÛÿléCÞ\u008eÅs-\n<\u0088¡\u0010l\u0096jwJ\u0010\u000f\u0086ë:\u0086¡¶y\u00820J,@3îð_)\u0084ÚµÞÈObB/f\u0007\u0088åaµ03K¿tÅâ±\r×6\u009b%\u0090&0\u0095·w\u008c\u009dÒp\u009bC2_\u008a\u0016µ\u0004,5\u009c\u0003Ò\u009bÝo|¥\u0005\u009cÃ\b\u0084&+»ÀYþhS\u0090ÃEpå×¡ÈX\u00109ã¿\u0019\u0013I\r«ØIßV^(2C\u0019KJ\u0080ov \u009a\u000bIK ¼âmß\u0095¶H\u0091/m·Ö]»\u0085Ôôðà\u0099ÏÕºd\u009dWÆ,Þfõï\u0089\u0016ÉçZ\u0088\u009d+\u0019MÝK\u0007l\r\u0083\u0089\u0010¤\u009bx\u0003ôe°ÇWz3\"÷&³\u0019m\u009b\u0004´²ZÁ\u00ad×\u0010ÿ\u0081\u0086-\u001aÕ5¶Ã\u009654\u0080\u00104þÎ!'ÚA\u001cÔËd\u0096a[\u001av\u0003\u008f\u0081.O\u0081Ç\u0013¹\u0083è\u001cJÃ\u001aÜ\u0081y\u0014\u0088\u0098´\u00847rÂéWçÕÈ°\u0095S\u00157\u0006\t'\u0084é\u0007qwd\t)#ªÒÆ\u008cÜx`l\be%\u009bª\u00886\u00149\u0092úëD\u001a\u0015=DÎ\u0005ñ#«~\u009fR\u00ad\f\u0088ÿÁì+9Q\u0084g¨óìT<_æa%vÖ\u00ad?AXâ\u0092.\u0093'a¸û\u0013°\u009d\u00910¹A\u0000,ý¨}@ý;\u000f|G\u001at¤B\u0013n\u0087\u009aT\u0017k\u0089©\u0087\u0095i³\u0001à©áuáq\u0085íSî\u0014\u0082\u0099+\u009bpqZ\u008a\u008c´5Ô\u0010x\u009b\rZTnp\u00ad6c=ÇGÉõ\u0083¥M\u001f[\u0085&êÙ\u0088P\u001bßæ|F\u0095´\u0092´\u0087#:\u00917\u001fB¦\u0081\u0094\u0018g\u0007\u0016\u0089ôÏª\\¾u»\u0015\u0010¨-\"Û&>@\u009a±Ô\u0018\u0014Lo\u0092$\fÇß1x\u0011Iß\u000b=×\u0012fûº\u0016\u001ap^\u0011¡§£3ÿò\u0087äë\u0098èhú·ß|\u008bHõ\u009dÆ\u000fÃ#ã\u0019_)\u0002\u00110 \u0086ýÅÎ\\W\u001c[W\fKzJHËIPÜ&f\u0084\u0011,\u009c8\u0088\u000b\u0088:{ªìaí.3<½ôuYÞð\rwKÜz\\Äwà0j\"\u000f\u001bø\u0012ói«¨þ\u0081¢\u0095÷Iß7[ìe©Ü5\f\u0002`ÉÊ=\u00adÙa\\\u008dp\u0092\t³a@Æ7Å\u0089û7è\u0099\u0013\u0013`ìõFÍ\n~1\u0014âúã<ÜrÏQã\u0000u¯XYÞF\u001b\u007f\u0010O¤ÂPäU\u0011´íë`Gi!ù\u0019ã\u000b\u0083,Á\u0095BYËe¦¸\u0013Må?[ç\u0086\u0016\u0017Ô\u0014\u009eªÒÖ\u0082ß*\u0086\u001aÓT\u008d\u008b&\u0082Ô!ví;ÔÍå¯\u008fÃdpV8÷^ËO\u0010Sp!Üî¼ÛÓ M.\u009d\\Ü\u0099Y\u0082+ 6\u0099u\u0004Ú¨S\u0082°Ô\u008a_ëF=2OÏ\u0085\u009cäþû¦\u0085S\u008aÐÁMHbè_Z!SQI\u0017¤¨\u0003ýö¸$\u0004»Ss!ä¢ÁðÝý@??\u0099\u0092)E¯\u0018\u0094Q6È(\u0010 \u0095M3PV{¼éÆ\u0097]Ó=U]Ú\u0094\u0082\u0096¿*U'¥a\u0095º\u009d\u00ad \u008aÂU´VC/æ\u001c\tö)ßð#È`õðkûã\u0086¥Ü4ÏøA\u0001;QeÛÒÃD\u0011\u0085\u0011ÕÇ\u008c\u0001H,\u0089ÒO\u0084÷*óÎ\u0005<M~±¾:B1Õ«AòÖ¹$ªe¤Ïz\u0011\u0080+\u008a\u008e5X\u0088iH¨ñ±Àæè\u0097\u0015swÊKÇ\u009f<\u0004x®nß\u0004\u009c\rÛ\u0093\r»»X\u007f®ld²ôAôs]\f¾\u009b7y\u001e\u0081â¼Ú0Õ\u0091\f<îw\t_òÔ~â%WZ\u008cJU\u008d\u008c\u0091ÎøÔX\u00adÔÜ\u00005Km´0çë'»ÝÜ\u0089ëöðH±¦Y6D\u0087\u008b9×È9ßS.\u0007\u0005WÓJÜb_ð´\u0093\u0088½lj·(?ÑÚæs##ÕtÀe\u009bâ¬HRSÍÿR\u0097\u0002l¶Iï\u0082Ûp8\u008b\u008f\u009eÑÐ\u009dì;\u0017oâ\u008bË)ñ\u008e6Õ°«\u0005öv©7¼\u009då\u0010c)¨Q\u009a9û¼\u001aø¸PT\u0093RD-\u0016û\u0003cŊ\rneë\u008c\"[I,\u001eZªÑûq´ó\u000b\u000f\u008c:W~AýXx\u0086\u0099\u007f\u009c\u0080q\u007foì$;k¤«à qÔ\u0099é\u0093\u009bY·\u0097©\u007f+ \u0018Ù9^î\u001fà?4\u0018Ë²i,Æ\u0006\u0096\u001fÆ$\u0082\u0003Å\u008bÐ9\u0084ÑT\u0003!F\u0004\u008b\u0005åI\u0001ð\u0089f#-Ú³2Eí\u0005\u00adZ%ÀÊ<M\u0082\u009cZ8\u00adUpK¸\u0019mÇ3\u000e¢øÿ9ßd~\u0018(¦\u0002*\u0006ÁÊÒ¡¥'Û+zÔ\u00968\u009b\u0006êDd!ª\u0007\u001bX\u000bp¢oPIú¯f\u001eêá\u001e¦\nÌKý\u0093º\u001eT\u001e@\u0093.ÈØ´`=j\u0087\fiF\u0014B©*\u0092\u0098\u0096®\u0010±\"5Ý`\u0082¤v\u0095\u008di#VQ³Vñ\u008e\u0095è\u0019;\u0003$ù\\JöäÛXWÞ\u009dA:Z5Ày0ë\u0011ò2ö±ý\u008f×\u0083\u0016»7\\V¿\u0085æ\u0086MØøaû²\u0089\u0092\bù'\u001f§f|#¯gR\u001aÂÉP=z¶\u009aT\u0086ÜJ\u0012:0íØ\u0096þ¦PÁ¢jvô\u0087ì\u001cQvé9ßÚ×Â>}cEô\u0095\u0085ó\u0007\u0004½X\u0093)3¾\fKc\u0099¸\u0082Äo¸\u0095ý¹A\u000b¬ïE$½ó¤:ª-µ\u00126ð\u007fþ\u001f¼û3Þ\u0085f\u009c'î§\u0097\u0017§\r\u0000\n/I@ª¹jOZ\u0083\u0010³\u0010g%ð\u000bb¬]_%ÉÞ\u0097\u0010eq\u001c\u000b¾ª\u0088\u0096µô\tÝÌUÇ\rw=á)\u008dÎö¶¦º×R8\bc\u0082cÞÝ0¸/\u000fpqú5pi-ñ2À\u0019\u0095=}Ú\u000bU.\u008f×V\u0005\u0001\u000fDý\u0006\u0006U\u008c´>ôR\n\u000fs\u008d\"2n:E\u0005\u0083Ŋéèù;\u001f8)\nbv\u0093§èZV\u0080\u0017\u008d\u0093\\©M\f\u0002³0±\u008b Þ»´\u0095ùó<·!\u0019çå\u0088i|í8Î§\u007fß+G:eYcV±ðS×¾Ç\u000bÐ\u009eWbú6´EØw\u000f)»¢â¿4¿\u0018\u0001Ç\u0019S\u0005JãÌèp ×½\u0082¥±\n (7®KÅ\u0093(ùk\u001byf\u001aÆè>O\u0002\böq¤Ê\n¯\u0085Ì\u001b¿C´í\u0002ZåLBÏÌós\u0086\u0091Ã]·ªG\u008cJØH\u0082\u008di\u0018\u000b /¼\u008dìrüJ;¹á\u000e×çØ¿\u0081>(ÍaC)\u0004&]\u000eûçÅá\u0015G\t\u008e\u0001\u0090¹Õ\u000e0êdúQ\u009b\u0097±\u0096\u0016Ñ[üR7lçÎ'K\u009f\\\u008a÷Öºqn\u0085ë\u0090>\u008b\u001f\u0004\u009e-Öaöù©¥¼ÆåScB¨_\u009aûû\u0088\\¨ãg\u0090'çÏLÍÆ¨î\u0084ÕÁÀÜ\u0086m\u0014\u0094)´\u0005Õ%2Kfjk»åý´»æf\tNô\u009f\u0004zó=Ôy±ÊBÖ]rùl\u0086Ä¢t\u0098{Ð\u0098øî3D¢\u00adð_\u0086ÖË\u009b\u0010ÍxI\u0010\u0087Np±UøìÕ\u0091 \u0018G\u000f:ôÁ\u0085daøAg4ât2Õ\u001c\u0011Qx%\u0081\u0015Ûå\u0006Íü\u008dß\u009f*¬p\u0096\u000bp7y+V\u00962Æx²ï\fÊ}\nj*·å\u008b×\u0014\u0081\u0001Í\\ÐO<ÉÄ \\-<Ðn'ÈÙiI<\u00866?¹\u008f2\u0095dñ\u0015îËòK,¼\u0018\u001aøÄá\u007f\u008f{üµ±}\u0007¸\u0012B(\u0000\u001cÏ=w\u001azµ?/@í\u008fmÍ/\u0081·ýY\u0017Ó'u\u001dÒ\u009eWü\u000fü\u000eFK\u0099\u001fzÃ\fáE\u0005\u0003\u0086@\u0093\u0091ªG(E\u0000l,Xò\u0091×H\u0088\u008bÎY\u001d<+\u0084(N.,±\r5ìy¶ë¢òMöy»@\u008cGÒq\u009e\u0017xÄ/Û|¿ª\u0010¥©Ò++M\u0080¾\u0098Ô^Eãlk\u0005ní\u0013\u0096\u0087¦\u007fÍGfÊu\u0010ÜîX(&ò&£èíÙ\u0084\u0090¶2\u0089Ð9\u009bò×ûd\u0089H\b\u0007[¿µ\u00ad9\u0084)\u0007éÇ>©i¼\u0098»Y\u000bïGÝ·qûiHò`Ä¢Ó\u009f§n\u0085 kÂTó¸\u000eÐL\u008c&>«%\u001aå@u®A\u0016î¶\b»ÁÀK¸Ï<=;øê\u0001\u0092]\u008f\u0091\u0094ûFB\u0014`}A\u001e8¹ì´ÓInî\u0097Zg \u0084\\\u000e}\u0005\u0096\u000bôAÝ\u00ad3ZFHoÿeu¤ªâDO\n<\u0017\u001doÃ\u0019ûõ\bG\u0088\u0098cÚ³p²zÙW\u0093\u001b\u0017\f\u0019Î`@È1²\u0000j\u000f\u0002®\\ù\u0018\u000e\u000ei®TÉ·\bÚ©0\\\u009cý©îâKÊ\u0099N)\u0091®\u0099¾7¡÷(;\u0005\u0083dV¬\u0095\u0003ºá\u0082\u0098õ\f³gDÖ kÐ3ÎU°T\u0010ô\u0002\u0087\u008ffQº`7ûìn=S¢\u0095Ħÿö;øG\\qO\u0017^\u0097\"ÏAÄXê\u001aòò±!^!¯\u0006¶Y\u0006Bïz\u008f\u009alÞv\\0lµ\u0019»ùYô\u001a\u0089±d\\Ä\u0092Wìd \u0018òsÇÉð¾Îë[E9e\u0088\u0004éE2Q:\u0017JÍ¬Úz\u0082Å\u0001Îiùn¦\tí\u008a\u009bq0·Þ\u009f®ÛÔæ\u0006\u00057Ø\u0093â\u0002í\u0095¼?\u0095b\u0098\u0097×\u008bQU\nêÕ¸\"þ¸º\u00adk\u0018\u0016¨¤5Õ?}Þ%ðÆ¹\u0000£Fù+½p\u0088GZb\u0004.Ã\u001c¼¸<2ª$`\u0002o¹ÕK=-\f\u009c*µeõ5z\u009fäÕ ©]çmÞ°pp\u0010wtV@Þ\u009f\u0081\f¦\u007fÍ(fÌ*·Ñ4\u0084öo\u00160÷\u0013¸-iýF(²áÈÊÝ`\u0010*\"\u0006Ý\u0004\u0082+j\u0015Þ-à\u0015\u008c\u000f\u0094%¶/ü¦\u008d 1¦K£$ßÂ´,ß¶EÏ'5i>Ð±S\u0016)[áR\u0097pÝ\u0081\u009a\u008aè\u007fæ \u009f\u008dĐõTz¬oÖt\u001e·t\u0083gMé\u0094Mà¸³¦\u0099«[p\u000f,¢\u001c\u0084ê¿o\u00858-\u008a^Ö5=\u00153¯¼Û\\J\u009c»Æ\u001d\u0090ºÝé5\u00802æ6Ea «ÄI\u001a\u0011\u0011ï\u008dUIo&\u0014¸¿\u001aØ¦x;Öí\u008bË8YD²Lo\"Ëd:\u0015\u009fË\u0086QÑ·¦/#\u009d\u0012BQóû\"w¿JÝ\u0092\u007f+DA¨h\u0081è¥ôúû8Cª\u0013þ\u0004ÿÁfÿøu\u0098Ìª]\u0019<\u0011ýÆ!.àü·¹ÖtCJQâ\u0010,\u0091\n\tñ±\u00933¶B]bè^éK\u009f\u0004\u0084Ï+ê%Ö_¢ØA\u009d|\u0015¯\u0006oû\u0091øv´÷=Ø\u0087XiÏ\u0014R¤v\u009b\u0081<,«\u0016DÏ \u0092mÈÛ\")²ÐÀæ\u000fK¸â\u009d7·\u0090ç\u0001~ö\u0099'¸\u0084*UENlï\u00ad¾,\u0013¼Õ¾V,-Ã\u0019\u000ejá\u000e\u0003\u001dÚ\u0015\u0007¹\u008eö\u009ezÕÏ\u0011_µ\u001b©Íy9W|$ÉE(Ú\u0089[\t\u000bò6{ÔÈeÒ\u0003>|I\u0018³\u000f~2®j`QØ\u0019u\u0098á\"\u001cÄg`.\nÜ-3¦\u0013G.WHÂ¸ÙKK\u0000jå¦w¯\u0080\u0014\u008aº\u0005\fúYÄa\u0004´æ\u0087Ø\u000b\u0087ý¯|Q©\u0095v_ µ\f¤\u0019¦\u0019ü\u0092\u001e<²\u0093|ú\u0006&M\u0013 0Ð\u00046t&\u0084\u0015(Ê\u0093Tyª¶¼¦¶Ô=\u0005\u00962Rjü,\u00160\b$M\u008b'À\u000f\u001bÈ\u0005GHßc¬\f?íX0#·å\u0098Í\u0007\u0093h\u000bF±(<¹oïîáS\u009b\u0005dLT\u0012À\n@ÿëªßÁ*Cpk\r~ü\u0017\u000e¨×ë\u0089.Ï\u0084n¹\u0005;µG¥\u0017\u0002tH\u0005øÐ\u0089.\u0016\u0005û\u0084Hú^Ď¢ý\u0090\u00992l\u008c\u0080Ö'\u0005\u008d:\u001f\f(\\\u0098úþ\u0084\u0019©\u0088\u0007a'¡r\u009bá\u001cÞì\u009a\u009e\u009au¼mQÙÿV?}\u0094\u000f4ÊBå\u00171üéâàfy\u0005û\u009d£\u009b\u008b>À×b\u0011Ïl&\u0099\u0003iç¸\u0017\u007fªq£êMö\u008fþ²ZÂ¬ý\u0092A\u0014¬\u0088\u007fé\u0010.iMÑ¶µUÿ«fñõ\u0097\u0098Ñ]\u0082Î+¨\u0006Ì&iB\u0014£¤V×P>\u0012a&èÆÔc\u0085\u000246cÒÚB\u0099,\u0013\u0086û\u0016FjãL\u0093Rì!(^áUÊn`f*ì\u0006\u0018Tê7\u0084OèûüÁ\u0089Q\u0002\u0081í G\u0094açP\u0082R9Ã\u0016geë[\"Ì\u0086' \u001bÜ½¬Ã\u0089glõÛ\u0015]\u0082èÉÙ\u001cÀu.\u0012Õ½\b9 º\u0018Ý/¶\u009a3H\u008cÞ³o»Çº6Ä\u0017\u009eæzèP@\u0013^Éí\u0005ñõBùa\u009c\bkR\u008c5\bÉ\u0002\u0010\u0018Ð\u0002î\u0089âV(¨Oö¼|#Y~÷(º°6\u009aI\u009e¯\u0010Âû\bÄ\u00adêdz½]Ð]%5¡Y\tn\u0089r¼f&\b\u009aÕ\u0010f\u001b<|)Ã¥\u0000ïÎ»\u0013{xE\\\u0015|\u00000\u008d.\u0000D\\ãá\u000fº\u0005\u0082\u0006üI¬B\"ü\u00170R¹Ç\u001fI'w0Ïr\u0018X<hòÄí\u009aë\u0081M$\nÔ_\u009cp^d\u0002\u0014`\u0005\rM\n\u0016Ìê(ÜYãG\u007fí-\u0003\u001fàï\n\u009a\u0082g~`L2,±\u0006\f/ª¶\u0090½è\u0017`\u0089iJ®\nç\u0086\u001f\u0085A$ùÿ\nü\u0003¤ÍÌ\u000fwÙ\u0003\u0088bG\u009eØÇ¨Wx\u0014&E\fô\u0016ÎgfAy\u0000õ¬Ys\tÛD$Cmc\u008b¤à\têD\u0002C©c\u0013¤ó\r\u0004\u0099²\t~\u0090NN±¥5±d\fK\u0015}\u0088'¶õV\u0007ùé\u0093\bôo\u0088Ô$NþG\bé±\u0019Þ\u0089´3Ó\u0005¿;\u0016Å]\u0005Ä\u0003yÂ°\u0012ãÐ\u0010(Ï\u0095(í0¾\u0097\u001aÎ\u0095ßiÐ\u0095\u000ePÅ8\u0082/ádrú;\u0099\u000e²}\u0007d^\u0087\u000fü*ë\f]\u0007\\mÝ}\u0084ûák\u0016å\u0007\u000bëj¹Aü\\"
         .length();
      char var1 = 4;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 22;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var26 = var10001.toCharArray();
               int var10004 = var26.length;
               int var6 = 0;
               byte var29 = var10000;
               var21 = var26;
               int var14 = var10004;
               byte var34;
               char[] var38;
               int var10006;
               if (var10004 <= 1) {
                  var38 = var26;
                  var34 = var10000;
                  var10006 = var6;
               } else {
                  var29 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var38 = var26;
                  var34 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var38[var10006] = (char)(var38[var10006] ^ var34 ^ switch (var6 % 7) {
                     case 0 -> 59;
                     case 1 -> 13;
                     case 2 -> 28;
                     case 3 -> 87;
                     case 4 -> 115;
                     case 5 -> 121;
                     default -> 39;
                  });
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var38 = var21;
                     var34 = var29;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var38 = var21;
                     var34 = var29;
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
                     b = new String[113];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI();
                     short var16 = 30000;
                     var10002 = -31019;
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .d("New Theme");
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = System.nanoTime();
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII();
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII();
                     IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = TuplesKt.to(0.0F, 0.0F);
                     IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = 1.0F;
                     lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = "";
                     IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = new IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII() {
                        @Override
                        public void e() {
                        }

                        @Override
                        public void a(char var1, int var2x) {
                        }

                        @Override
                        public void d() {
                        }
                     };
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

                  var2 = "/Á\u0082µkÙ2¿Ýþ\u009b\u001f\u001bÃïE\u001eó«\u0091\u0001®½G\u001c\u0095-\u009f\u000bùÆò¯\u008ajÅUmuùM\\¶";
                  var4 = "/Á\u0082µkÙ2¿Ýþ\u009b\u001f\u001bÃïE\u001eó«\u0091\u0001®½G\u001c\u0095-\u009f\u000bùÆò¯\u008ajÅUmuùM\\¶".length();
                  var1 = 11;
                  var8 = -1;
            }

            var10000 = 88;
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
      int var2 = (var0 ^ 30035) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 22;
            case 1 -> 113;
            case 2 -> 122;
            case 3 -> 77;
            case 4 -> 66;
            case 5 -> 152;
            case 6 -> 119;
            case 7 -> 234;
            case 8 -> 56;
            case 9 -> 38;
            case 10 -> 43;
            case 11 -> 194;
            case 12 -> 174;
            case 13 -> 58;
            case 14 -> 34;
            case 15 -> 10;
            case 16 -> 46;
            case 17 -> 173;
            case 18 -> 191;
            case 19 -> 169;
            case 20 -> 208;
            case 21 -> 109;
            case 22 -> 8;
            case 23 -> 103;
            case 24 -> 19;
            case 25 -> 129;
            case 26 -> 255;
            case 27 -> 239;
            case 28 -> 61;
            case 29 -> 51;
            case 30 -> 190;
            case 31 -> 148;
            case 32 -> 141;
            case 33 -> 137;
            case 34 -> 15;
            case 35 -> 212;
            case 36 -> 224;
            case 37 -> 5;
            case 38 -> 104;
            case 39 -> 183;
            case 40 -> 83;
            case 41 -> 145;
            case 42 -> 138;
            case 43 -> 16;
            case 44 -> 96;
            case 45 -> 178;
            case 46 -> 253;
            case 47 -> 110;
            case 48 -> 210;
            case 49 -> 235;
            case 50 -> 25;
            case 51 -> 207;
            case 52 -> 147;
            case 53 -> 211;
            case 54 -> 251;
            case 55 -> 195;
            case 56 -> 132;
            case 57 -> 249;
            case 58 -> 203;
            case 59 -> 1;
            case 60 -> 111;
            case 61 -> 247;
            case 62 -> 243;
            case 63 -> 197;
            case 64 -> 17;
            case 65 -> 163;
            case 66 -> 221;
            case 67 -> 175;
            case 68 -> 6;
            case 69 -> 205;
            case 70 -> 242;
            case 71 -> 156;
            case 72 -> 248;
            case 73 -> 116;
            case 74 -> 75;
            case 75 -> 106;
            case 76 -> 12;
            case 77 -> 238;
            case 78 -> 246;
            case 79 -> 193;
            case 80 -> 214;
            case 81 -> 229;
            case 82 -> 72;
            case 83 -> 170;
            case 84 -> 24;
            case 85 -> 57;
            case 86 -> 54;
            case 87 -> 149;
            case 88 -> 184;
            case 89 -> 166;
            case 90 -> 65;
            case 91 -> 218;
            case 92 -> 107;
            case 93 -> 127;
            case 94 -> 27;
            case 95 -> 185;
            case 96 -> 182;
            case 97 -> 93;
            case 98 -> 206;
            case 99 -> 80;
            case 100 -> 36;
            case 101 -> 18;
            case 102 -> 32;
            case 103 -> 154;
            case 104 -> 26;
            case 105 -> 45;
            case 106 -> 4;
            case 107 -> 162;
            case 108 -> 3;
            case 109 -> 48;
            case 110 -> 68;
            case 111 -> 168;
            case 112 -> 67;
            case 113 -> 128;
            case 114 -> 227;
            case 115 -> 146;
            case 116 -> 245;
            case 117 -> 53;
            case 118 -> 92;
            case 119 -> 250;
            case 120 -> 21;
            case 121 -> 252;
            case 122 -> 9;
            case 123 -> 171;
            case 124 -> 232;
            case 125 -> 108;
            case 126 -> 226;
            case 127 -> 33;
            case 128 -> 133;
            case 129 -> 142;
            case 130 -> 199;
            case 131 -> 118;
            case 132 -> 71;
            case 133 -> 165;
            case 134 -> 219;
            case 135 -> 94;
            case 136 -> 192;
            case 137 -> 100;
            case 138 -> 215;
            case 139 -> 88;
            case 140 -> 188;
            case 141 -> 55;
            case 142 -> 85;
            case 143 -> 160;
            case 144 -> 64;
            case 145 -> 101;
            case 146 -> 70;
            case 147 -> 172;
            case 148 -> 62;
            case 149 -> 237;
            case 150 -> 155;
            case 151 -> 59;
            case 152 -> 69;
            case 153 -> 213;
            case 154 -> 126;
            case 155 -> 79;
            case 156 -> 124;
            case 157 -> 201;
            case 158 -> 123;
            case 159 -> 60;
            case 160 -> 244;
            case 161 -> 73;
            case 162 -> 30;
            case 163 -> 236;
            case 164 -> 217;
            case 165 -> 102;
            case 166 -> 2;
            case 167 -> 196;
            case 168 -> 223;
            case 169 -> 176;
            case 170 -> 13;
            case 171 -> 14;
            case 172 -> 74;
            case 173 -> 120;
            case 174 -> 177;
            case 175 -> 11;
            case 176 -> 136;
            case 177 -> 37;
            case 178 -> 29;
            case 179 -> 112;
            case 180 -> 86;
            case 181 -> 241;
            case 182 -> 135;
            case 183 -> 143;
            case 184 -> 134;
            case 185 -> 200;
            case 186 -> 28;
            case 187 -> 157;
            case 188 -> 0;
            case 189 -> 180;
            case 190 -> 47;
            case 191 -> 91;
            case 192 -> 90;
            case 193 -> 186;
            case 194 -> 44;
            case 195 -> 81;
            case 196 -> 40;
            case 197 -> 87;
            case 198 -> 95;
            case 199 -> 76;
            case 200 -> 42;
            case 201 -> 140;
            case 202 -> 159;
            case 203 -> 52;
            case 204 -> 35;
            case 205 -> 139;
            case 206 -> 209;
            case 207 -> 49;
            case 208 -> 82;
            case 209 -> 125;
            case 210 -> 114;
            case 211 -> 179;
            case 212 -> 189;
            case 213 -> 220;
            case 214 -> 181;
            case 215 -> 7;
            case 216 -> 115;
            case 217 -> 41;
            case 218 -> 231;
            case 219 -> 233;
            case 220 -> 131;
            case 221 -> 98;
            case 222 -> 161;
            case 223 -> 31;
            case 224 -> 105;
            case 225 -> 99;
            case 226 -> 130;
            case 227 -> 187;
            case 228 -> 50;
            case 229 -> 230;
            case 230 -> 153;
            case 231 -> 97;
            case 232 -> 20;
            case 233 -> 117;
            case 234 -> 198;
            case 235 -> 121;
            case 236 -> 216;
            case 237 -> 204;
            case 238 -> 240;
            case 239 -> 202;
            case 240 -> 89;
            case 241 -> 167;
            case 242 -> 150;
            case 243 -> 39;
            case 244 -> 151;
            case 245 -> 84;
            case 246 -> 78;
            case 247 -> 254;
            case 248 -> 225;
            case 249 -> 228;
            case 250 -> 222;
            case 251 -> 23;
            case 252 -> 144;
            case 253 -> 63;
            case 254 -> 164;
            default -> 158;
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
