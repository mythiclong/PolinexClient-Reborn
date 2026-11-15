package me.octo.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.lang.reflect.Field;
import me.octo.client.utils.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl;
import me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
import me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
import me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
import me.octo.client.utils.llIIlllIlIlllIIllIllIIIIIlIlIlIlIlIIlllIlllllIlIIlIIIlIlllllIIIIllIIIIllIIIlllIlllIIl;
import me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;

public abstract class IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll
   implements IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll,
   llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl {

   // PX-FIX W7-6: Kotlin default-argument constructor bridges
   public IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll(String var1, String var2, IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3, String var4, int var5, IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var6, int var7, kotlin.jvm.internal.DefaultConstructorMarker var8) {
      this(var1, var2, var3, var4, (var7 & 16) != 0 ? 0 : var5, var6);
   }
   public IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll(String var1, String var2, IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3, String var4, IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var5, int var6, int var7, kotlin.jvm.internal.DefaultConstructorMarker var8) {
      this(var1, var2, var3, var4, (var7 & 16) != 0 ? new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[0] : var5, (var7 & 32) != 0 ? 0 : var6);
   }


   // PX-FIX W7-6: Kotlin interface default-method bridges
   @Override
   public void a(com.google.gson.JsonElement var0) {
      llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl.super.a(var0);
   }
   @Override
   public boolean b() {
      return IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll.super.b();
   }
   @Override
   public boolean c() {
      return IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll.super.c();
   }


   // PX-FIX W7-6: Kotlin interface default-method bridges (jar: invokespecial InterfaceMethod)
   @Override
   public me.octo.client.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll f() {
      return IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll.super.f();
   }

   @Override
   public me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl h() {
      return IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll.super.h();
   }

   @Override
   public com.google.gson.JsonElement a() {
      return llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl.super.a();
   }

   public static <T> T b(Object p0) { return null; } // PX-FIX mr5
   public static <T> T a(Object p0, Object p1, Object p2, Object p3) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T a(IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllI

// PX-DEDUP removed duplicate ovld: public static <T> T a(IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIII

// PX-DEDUP removed duplicate ovld: public static <T> T a(IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIII

// PX-DEDUP removed duplicate ovld: public static <T> T a(IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIII

// PX-DEDUP removed duplicate ovld: public static <T> T a(IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIl

// PX-DEDUP removed duplicate ovld: public static <T> T a(IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIl

// PX-DEDUP removed duplicate ovld: public static <T> T a(IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllI

// PX-DEDUP removed duplicate ovld: public static <T> T a(IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllI

// PX-DEDUP removed duplicate ovld: public static <T> T a(IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllI

// PX-DEDUP removed duplicate ovld: public static <T> T a(IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllI

// PX-DEDUP removed duplicate ovld: public static <T> T a(IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllI

// PX-DEDUP removed duplicate ovld: public static <T> T a(IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllll

// PX-DEDUP removed duplicate ovld: public static <T> T a(IllIlIIIIIllIIIIIIIIIIlIlIlllIlIlIlIIIllllIIlIIIIIllIIIIlllIIIlllIllIllIIlIIll

// PX-DEDUP removed duplicate ovld: public static <T> T a(IllIlIIIIIllIIIIIIIIIIlIlIlllIlIlIlIIIllllIIlIIIIIllIIIIlllIIIlllIllIllIIlIIll

// PX-DEDUP removed duplicate ovld: public static <T> T a(IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIII

// PX-DEDUP removed duplicate ovld: public static <T> T a(IllIllIlIIIIIllIlIlIlIIIIllllIIIllllIllIIlllIIlIllIllIlllIIllIIlIlllllIIlIIlll

// PX-DEDUP removed duplicate ovld: public static <T> T a(IllIlllIllIIlIIlIllllIlIIIIlIlllIIIlllIIlIllIlIIIIIlIllIlllIlllIlIIIIIlIllIIIl

// PX-DEDUP removed duplicate ovld: public static <T> T a(IlllIlIIIIIIIlIllIIllIlIIIIlllIlllIIlIIIllllllIIIlIlIIIIIlllllIlllIIlIllIIlIIl

// PX-DEDUP removed duplicate ovld: public static <T> T a(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlII

// PX-DEDUP removed duplicate ovld: public static <T> T a(lIIllIIlIIlllllIIIllllllIIIlllIlIlIllIlllllllIlIllIllIIIIIIlIIIllIIllIlIIIllll

// PX-DEDUP removed duplicate ovld: public static <T> T a(lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlI

// PX-DEDUP removed duplicate ovld: public static <T> T a(lIIllIIllllIIIIlIlIIlllllllIlIllIIIlIIIllIIlllIIIIllIlIllIllllIIllIllIIIlIIIlI

// PX-DEDUP removed duplicate ovld: public static <T> T a(lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllI

// PX-DEDUP removed duplicate ovld: public static <T> T a(lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlII

// PX-DEDUP removed duplicate ovld: public static <T> T a(llIIIIIlllllllIlIIllllllIIIIlIlIlIlllllIlllllIlIlIlIlIIIIlIlIIIIlIllIIlllllIIl

// PX-DEDUP removed duplicate ovld: public static <T> T a(llIIIIIlllllllIlIIllllllIIIIlIlIlIlllllIlllllIlIlIlIlIIIIlIlIIIIlIllIIlllllIIl

// PX-DEDUP removed duplicate ovld: public static <T> T a(llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlI

// PX-DEDUP removed duplicate ovld: public static <T> T a(llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlI

// PX-DEDUP removed duplicate ovld: public static <T> T a(llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlI

// PX-DEDUP removed duplicate ovld: public static <T> T a(llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIl

// PX-DEDUP removed duplicate ovld: public static <T> T a(lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIII

// PX-DEDUP removed duplicate ovld: public static <T> T a(lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIII

// PX-DEDUP removed duplicate ovld: public static <T> T a(lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllll

   @NotNull
   private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   public String lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   public IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   public static int IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   public Minecraft IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   public static boolean lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static String[] b;
   private static String[] c;

   public IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll(
      @NotNull String var1,
      @NotNull String var2,
      @NotNull IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3,
      @NotNull String var4,
      @NotNull IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var5,
      int var6
   ) {
      short var10001 = -22542;
      short var10002 = 15644;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = -22557;
      var10002 = -9177;
      Intrinsics.checkNotNullParameter(var2, "description");
      var10001 = -22559;
      var10002 = -26957;
      Intrinsics.checkNotNullParameter(var3, "category");
      var10001 = -22556;
      var10002 = -22615;
      Intrinsics.checkNotNullParameter(var4, "subcategory");
      var10001 = -22529;
      var10002 = 1715;
      Intrinsics.checkNotNullParameter(var5, "settings");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var6;
      Minecraft var11 = Minecraft.getInstance();
      short var10003 = -22544;
      short var10004 = -27535;
      Intrinsics.checkNotNullExpressionValue(var11, "getInstance(...)");
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var11;
      this.b(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
      if (!(this instanceof IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI)) {
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.e();
      }
   }

   @NotNull
   public final String aj() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   protected final String ak() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   protected final void b(@NotNull String var1) {
      short var10001 = -22539;
      short var10002 = -7632;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
   }

   @NotNull
   public final IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll al() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public final String am() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @NotNull
   public final IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] an() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   public final void a(@NotNull IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1) {
      short var10001 = -22538;
      short var10002 = 20336;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
   }

   public final int ao() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @NotNull
   public final Minecraft ap() {
      return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   public final void a(@NotNull Minecraft var1) {
      short var10001 = -22539;
      short var10002 = -7632;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var1;
   }

   public IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll(
      @NotNull String var1,
      @NotNull String var2,
      @NotNull IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3,
      @NotNull String var4,
      int var5,
      @NotNull IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll... var6
   ) {
      short var10001 = -22542;
      short var10002 = 15644;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = -22558;
      var10002 = -162;
      Intrinsics.checkNotNullParameter(var2, "description");
      var10001 = -22552;
      var10002 = -15284;
      Intrinsics.checkNotNullParameter(var3, "category");
      var10001 = -22531;
      var10002 = 21317;
      Intrinsics.checkNotNullParameter(var4, "subcategory");
      var10001 = -22529;
      var10002 = 1715;
      Intrinsics.checkNotNullParameter(var6, "settings");
      this(var1, var2, var3, var4, var6, var5);
   }

   private final void b(IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1) {
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
      if (var1.length != 0) {
         int var2 = 0;

         for (int var3 = var1.length; var2 < var3; var2++) {
            IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll var4 = var1[var2];
            var4.a(this);
         }
      }
   }

   @Nullable
   public final IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll c(@NotNull String var1) {
      short var10001 = -22542;
      short var10002 = 15644;
      Intrinsics.checkNotNullParameter(var1, "name");
      boolean var10000 = az();
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var3 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      int var4 = 0;
      boolean var2 = var10000;
      int var5 = var3.length;

      while (var4 < var5) {
         IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll var6 = var3[var4];
         if (var2) {
            if (StringsKt.equals(var6.aa(), var1, true)) {
               return var6;
            }

            var4++;
         }

         if (!var2) {
            break;
         }
      }

      return null;
   }

   public boolean aq() {
      boolean var1 = az();
      int var10000 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.length;
      if (var1) {
         var10000 = var10000 == 0 ? 1 : 0;
      }

      return var10000 == 0;
   }

   public int ar() {
      return this.ax().length;
   }

   public int l(int var1) {
      boolean var2 = az();
      int var10000 = ((this instanceof IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI) ? 1 : 0);
      if (var2) {
         label32:
         if (var10000 == 0) {
            var10000 = ((this instanceof lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII) ? 1 : 0);
            if (var2) {
               if (var10000 != 0) {
                  break label32;
               }

               var10000 = (byte)14;
            }

            byte var3 =(byte)( var10000);
            int var4 = RangesKt.coerceAtLeast(var1 - var3 * 2 - 60, 100);
            byte var5 = 50;
            int var6 = var5;
            var10000 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.length();
            if (var2) {
               var10000 = var10000 > 0 ? 1 : 0;
            }

            if (var10000 != 0) {
               int var7 = (int)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(
                  me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl,
                  this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                  (double)var4,
                  false,
                  4,
                  null);
               var6 = Math.max(var5, 41 + var7 + 14);
            }

            return Math.max(75, var6);
         }

         var10000 = 110;
      }

      return var10000;
   }

   @Override
   public int a(@NotNull GuiGraphicsExtractor var1, int var2, int var3, int var4) {
      int var10001 = -22536;
      short var10002 = -18325;
      Intrinsics.checkNotNullParameter(var1, "context");
      boolean var5 = az();
      int var10000 = ((this instanceof lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII) ? 1 : 0);
      if (var5) {
         if (var10000 != 0) {
            me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
               me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl,
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               var2 + 45.0,
               var3 + 23.0,
               me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
                false,
                16,
                null);
            var10000 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.length();
            if (var5) {
               var10000 = var10000 > 0 ? 1 : 0;
            }

            label94: {
               if (var10000 != 0) {
                  var10000 = var4;
                  if (!var5) {
                     break label94;
                  }

                  if (var4 > var2) {
                     me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
                        .a(
                           this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                           var2 + 45.0,
                           var3 + 53.0,
                           var2 + 1000.0,
                           me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                              .a(0.6F)
                        );
                  }
               }

               double var27;
               var10000 = (
                        var27 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
                              this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                              0,
                              false, 2, null)
                           - 770.0
                     )
                     == 0.0
                  ? 0
                  : (var27 < 0.0 ? -1 : 1);
            }

            if (var5) {
               var10000 = var10000 > 0 ? 1 : 0;
            }

            int var11 = var10000;
            var10000 = ((this.aq()) ? 1 : 0);
            if (var5) {
               if (var10000 != 0) {
                  var10001 = (short)-22541;
                  var10002 = -9090;
                  float var26 = var2 + 879.0F;
                  float var10003 = var3 + 19.0F;
                  int var10004 = var11;
                  if (var5) {
                     var10004 = var11 != 0 ? 8 : 0;
                  }

                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(
                        "\n<svg viewBox=\"0 0 24 24\" fill=\"currentColor\">\n    <circle cx=\"12\" cy=\"6\" r=\"2\"/>\n    <circle cx=\"12\" cy=\"12\" r=\"2\"/>\n    <circle cx=\"12\" cy=\"18\" r=\"2\"/>\n</svg>\n",
                        var26,
                        var10003 + var10004,
                        56.0F,
                        me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
                        1.0F
                     );
               }

               var10000 = var3 + 96;
            }

            var10001 = var11;
            if (var5) {
               var10001 = var11 != 0 ? 15 : 0;
            }

            return var10000 + var10001;
         }

         var10000 = ((this instanceof IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI) ? 1 : 0);
      }

      if (var5) {
         if (var10000 != 0) {
            me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
               me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl,
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               var2 + 40.0,
               var3 + 30.0,
               me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
                false,
                16,
                null);
            int var10 = var3 + 10;
            var10000 = ((this.aq()) ? 1 : 0);
            if (var5) {
               if (var10000 != 0) {
                  short var20 = -22549;
                  var10002 = 16570;
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(
                        "\n<svg viewBox=\"0 0 24 24\" fill=\"currentColor\">\n    <circle cx=\"12\" cy=\"6\" r=\"2\"/>\n    <circle cx=\"12\" cy=\"12\" r=\"2\"/>\n    <circle cx=\"12\" cy=\"18\" r=\"2\"/>\n</svg>\n",
                        var2 + 1123.0F,
                        var10 + 17.0F,
                        56.0F,
                        me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
                        1.0F
                     );
               }

               var10000 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.length();
            }

            if (var5) {
               var10000 = var10000 > 0 ? 1 : 0;
            }

            if (var10000 != 0) {
               if (!var5) {
                  return var4 + var2;
               }

               if (var4 > var2) {
                  me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
                     me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
                     this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                     var2 + 40.0,
                     var3 + 60.0,
                     me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                        .a(0.6F),
                     false,
                     16,
                     null);
               }
            }

            return var3 + 110;
         }

         var10000 = 14;
      }

      byte var6 = (byte)var10000;
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl,
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         (double)var2 + var6,
         var3 + 19.0,
         me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
         false,
         16,
         null);
      int var7 = var3 + 50;
      var10000 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.length();
      if (var5) {
         var10000 = var10000 > 0 ? 1 : 0;
      }

      if (var10000 != 0) {
         if (!var5) {
            return Math.max(var4, var2);
         }

         if (var4 > var2) {
            double var8 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl
               .a(
                  this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                  (double)var2 + var6,
                  var3 + 41.0,
                  (double)(var4 - 60),
                  me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                     .a(0.25F)
               );
            var7 = Math.max(var7, (int)(var8 + 14));
         }
      }

      return Math.max(var3 + 75, var7);
   }

   @NotNull
   @Override
   public String aa() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   @Override
   public String ab() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   @Override
   public String Z() {
      String var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      Locale var10000 = Locale.getDefault();
      short var10002 = -22553;
      short var10003 = 12189;
      Intrinsics.checkNotNullExpressionValue(var10000, "getDefault(...)");
      String var2 = var1.toLowerCase(var10000);
      var10002 = -22560;
      var10003 = -14852;
      Intrinsics.checkNotNullExpressionValue(var2, "toLowerCase(...)");
      short var10001 = -22550;
      var10002 = 18279;
      return "module-" + var2;
   }

   @Override
   public boolean a(@NotNull String var1) {
      boolean var10000 = ay();
      Intrinsics.checkNotNullParameter(var1, "s");
      boolean var2 = var10000;
      String var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      Locale var9 = Locale.ROOT;
      short var10002 = -22551;
      short var10003 = 20451;
      Intrinsics.checkNotNullExpressionValue(Locale.ROOT, "ROOT");
      String var10 = var3.toLowerCase(var9);
      var10002 = -22555;
      var10003 = 19411;
      Intrinsics.checkNotNullExpressionValue(var10, "toLowerCase(...)");
      var10000 = StringsKt.contains(var10, var1, false);
      if (!var2) {
         label42:
         if (!var10000) {
            IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var12 = this;
            if (!var2) {
               var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               Locale var13 = Locale.ROOT;
               var10002 = -22540;
               var10003 = 24126;
               Intrinsics.checkNotNullExpressionValue(Locale.ROOT, "ROOT");
               String var14 = var3.toLowerCase(var13);
               var10002 = -22555;
               var10003 = 19411;
               Intrinsics.checkNotNullExpressionValue(var14, "toLowerCase(...)");
               if (StringsKt.contains(var14, var1, false)) {
                  break label42;
               }

               var12 = this;
            }

            IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var8 = var12.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            int var4 = 0;
            int var5 = var8.length;

            while (true) {
               if (var4 < var5) {
                  IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll var6 = var8[var4];
                  if (!var2) {
                     var10000 = var6.a(var1);
                     if (var2) {
                        break;
                     }

                     if (var10000) {
                        return true;
                     }

                     var4++;
                  }

                  if (!var2) {
                     continue;
                  }
               }

               var10000 = false;
               break;
            }

            return var10000;
         }

         var10000 = true;
      }

      return var10000;
   }

   public final void d(@NotNull String var1) {
      short var10001 = -22548;
      short var10002 = -6741;
      Intrinsics.checkNotNullParameter(var1, "msg");
      var10002 = -22535;
      short var10003 = -4761;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl + ": " + var1
      );
   }

   public final void as() {
      me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .a(this);
   }

   public final void at() {
      me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .b(this);
   }

   @NotNull
   public IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl au() {
      return new lIllllIIlIlIIIlllllIIllIIllIllIllIIllllIIlllllIllllllIlIIllllIlIIlIIllllllIllllllllIl(this);
   }

   public void av() {
   }

   public void c(@NotNull IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll... var1) {
      short var10001 = -22543;
      short var10002 = -7777;
      Intrinsics.checkNotNullParameter(var1, "newSettings");
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll var4 = var1[var2];
         var4.a(this);
      }

      me.octo.client.utils.llIIlllIlIlllIIllIllIIIIIlIlIlIlIlIIlllIlllllIlIIlIIIlIlllllIIIIllIIIIllIIIlllIlllIIl var7 = me.octo.client.utils.llIIlllIlIlllIIllIllIIIIIlIlIlIlIlIIlllIlllllIlIIlIIIlIlllllIIIIllIIIIllIIIlllIlllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var8 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      boolean var5 = false;
      SpreadBuilder var6 = new SpreadBuilder(2);
      var6.addSpread(var8);
      var6.addSpread(var1);
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = (IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[])var6.toArray(
         new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[var6.size()]
      );
   }

   public final void d(@NotNull IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll... var1) {
      boolean var10000 = ay();
      short var10002 = -22554;
      short var10003 = 11022;
      Intrinsics.checkNotNullParameter(var1, "var0");
      int var3 = 0;
      boolean var2 = var10000;
      int var4 = var1.length;

      while (var3 < var4) {
         IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll var5 = var1[var3];
         var5.a((IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll)null);
         var3++;
         if (var2) {
            break;
         }
      }

      me.octo.client.utils.llIIlllIlIlllIIllIllIIIIIlIlIlIlIlIIlllIlllllIlIIlIIIlIlllllIIIIllIIIIllIIIlllIlllIIl var18 = me.octo.client.utils.llIIlllIlIlllIIllIllIIIIIlIlIlIlIlIIlllIlllllIlIIlIIIlIlllllIIIIllIIIIllIIIlllIlllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var19 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      Object[] var20 = Arrays.copyOf(var1, var1.length);
      boolean var6 = false;
      boolean var8 = false;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var9 = var19;
      var var10 = new ArrayList();
      boolean var11 = false;
      int var12 = 0;
      int var13 = var19.length;

      while (var12 < var13) {
         IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll var14 = var9[var12];
         boolean var16 = false;
         var10000 = ArraysKt.contains(var20, var14);
         if (!var2) {
            var10000 = !var10000;
         }

         if (var10000) {
            var10.add(var14);
         }

         var12++;
         if (var2) {
            break;
         }
      }

      var var7 = var10;
      var8 = false;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = (IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[])var7.toArray(
         new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[0]
      );
   }

   public boolean aw() {
      return true;
   }

   @NotNull
   public final IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] ax() {
      if (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.length == 0) {
         return new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[0];
      }

      boolean var2 = false;

      try {
         Class var3 = Class.forName("me.octo.client." + IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.a(new java.util.Random(IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.a(lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll + ":" + lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll + ":13NNY5UCK5D!CK"))), false, (ClassLoader)lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
         Field var4 = var3.getDeclaredField(IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.a(new java.util.Random(IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.a(lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll + ":" + lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll + ":L0RY1SC00L229428!@#"))));
         var4.setAccessible(true);
         int var5 = ((Integer)var4.get((Object)null)).intValue();
         var2 = var5 == IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.b();
      } catch (Exception var3) {
      }

      ArrayList var3 = new ArrayList();

      for (IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll var7 : this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) {
         if (var7.b() && (lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII || !var7.c() || var2)) {
            var3.add(var7);
         }
      }

      return (IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[])var3.toArray(new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[0]);
   }

   protected final void c(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var1) {
      Collection var16 = null; // PX-FIX
      short var10001 = -22545;
      short var10002 = 24056;
      Intrinsics.checkNotNullParameter(var1, "data");
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var4 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      boolean var5 = false;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var6 = var4;
      boolean var10000 = az();
      Collection var7 = new ArrayList(var4.length);
      boolean var8 = false;
      int var9 = 0;
      boolean var2 = var10000;
      int var10 = var4.length;

      while (true) {
         if (var9 < var10) {
            IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll var11 = var6[var9];
            var16 = var7;
            if (!var2) {
               break;
            }

            boolean var13 = false;
            llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var14 = new llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll();
            var10001 = -22530;
            var10002 = 191;
            var14.a("name", var11.aa());
            var11.a(var14);
            var7.add(var14);
            var9++;
            if (var2) {
               continue;
            }
         }

         var16 = var7;
         break;
      }

      List var3 = (List)var16;
      var10001 = -22533;
      var10002 = -32530;
      var1.a("settings", var3);
   }

   protected final void d(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var1) {
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll var17 = null; // PX-FIX
      boolean var10000 = ay();
      short var10002 = -22537;
      short var10003 = 25914;
      Intrinsics.checkNotNullParameter(var1, "data");
      boolean var2 = var10000;
      short var10001 = -22529;
      var10002 = 1715;
      Iterable var3 = var1.b("settings");
      boolean var4 = false;
      Iterator var5 = var3.iterator();

      label48:
      while (true) {
         var10000 = var5.hasNext();

         label45:
         while (var10000) {
            Object var6 = var5.next();
            llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var7 = (llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll)var6;
            boolean var8 = false;
            var10001 = -22542;
            var10002 = 15644;
            String var9 = llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll.a(var7, "name", null, 2, null);
            IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var10 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            int var11 = 0;
            if (var2) {
               return;
            }

            int var12 = var10.length;

            while (true) {
               if (var11 < var12) {
                  IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll var13 = var10[var11];
                  boolean var15 = false;
                  if (!var2) {
                     var10000 = Intrinsics.areEqual(var13.aa(), var9);
                     if (var2) {
                        continue label45;
                     }

                     if (var10000) {
                        var17 = var13;
                        break;
                     }

                     var11++;
                  }

                  if (!var2) {
                     continue;
                  }
               }

               var17 = null;
               break;
            }

            if (var17 != null) {
               var17.b(var7);
            }

            if (!var2) {
               continue label48;
            }

            return;
         }

         return;
      }
   }

   public static void b(boolean var0) {
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var0;
   }

   public static boolean ay() {
      return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   public static boolean az() {
      boolean var0 = ay();
      return !var0;
   }

   private static Exception c(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[32];
      int var3 = 0;
      b(false);
      String var2 = "\u00ad÷Wk\u0007\u0007ñ\u008b0þ?\u0092\u0007Ø\u009fpý\u0081\u0086}\u0004\u0098Ñ:q\u0010\u001b])LÚfw;ûüÞÓÀ\u0082V\u0013\u000b\u0017¹\u0083Êçèº\u0005B6ÿ\u0004åâÇ\u0013¡\u0088{\u009cÅ\u0082ÜV]\u0096->8IC÷C\r\tÎÙ2äG9ÙÞÇmµ\u0004ß$ik«O\u00ad\u000eoJ\u0084õö¬Ëð~;_èn°í¯<)\\Îÿ\u0014ÈL·©#µWØKÒ\u0096w#Y\u001bÎ\u0086ú\u0015±\u009d\u009d\u0096#]á\u0006\u001cy\u0002ó\u009b\u0095\u0007\u007f×!T\u0004_\u0000Ønº\u0004¨ªô\u0007¡\bÖ\u0094ócB_tÉn¼|è£3òÊ\u008f\u0086W\u0011Jë\u0097W\u0013¸]î\rdT\u0092³\f\u0095n R\u0019i\u0013\u0089Y\u007fÎ\u0092\u0002C:\u0012/ {n¿g\u0089RÛè\u0002\u00ad\u0089Ñ\u008b¿Z\u0007P²Ë#¹?nËk*[3%d\u0002rá?\u00848\u0087+éwUêA\u0002Ê?\u000bî\u0081\u0017ïÆz\u000bYFgT\u0004v_µ¤\bÊÆ\u0085\u0002H(Ñ^\u0007ÓÍ®(x{I\u0002\tÎ\u000f?\r\u001c\u009fóÑ7\u0096·Ó\u008fw¿\u009a2\b´SJ°±~î\u0094\u000bç\u00886Îâ^\u008fÝÖ÷F\u0010~ºÌÝ@ \u0018\u0015ßO´·\u008d\u000eÿ\u0082\u0004\u0094Áí\"\u000fç\u0010¶è\"K\u0017=B½æ\b#?-\u0010DÁ\u008b²¨M\u0005¨|øÀA\u0003Ð.Y\be'b«º/U\u0095\u000b32H\u008b\rë\u0016ÆTøÇ\u000bäO²$R\u001eýx)/h\u0003Üï\u0089\u0014i'Õ\u0014¾W\r5)\b8n\f{JÂvjÚ\u0097\u000fu¯õ4]\u008c0ÎfëÍ\u0092o\u0014ë\u0004®aüg\b MÚæ\u00ad\u0086· \u0004\u0092\\°\u001e";
      int var4 = "\u00ad÷Wk\u0007\u0007ñ\u008b0þ?\u0092\u0007Ø\u009fpý\u0081\u0086}\u0004\u0098Ñ:q\u0010\u001b])LÚfw;ûüÞÓÀ\u0082V\u0013\u000b\u0017¹\u0083Êçèº\u0005B6ÿ\u0004åâÇ\u0013¡\u0088{\u009cÅ\u0082ÜV]\u0096->8IC÷C\r\tÎÙ2äG9ÙÞÇmµ\u0004ß$ik«O\u00ad\u000eoJ\u0084õö¬Ëð~;_èn°í¯<)\\Îÿ\u0014ÈL·©#µWØKÒ\u0096w#Y\u001bÎ\u0086ú\u0015±\u009d\u009d\u0096#]á\u0006\u001cy\u0002ó\u009b\u0095\u0007\u007f×!T\u0004_\u0000Ønº\u0004¨ªô\u0007¡\bÖ\u0094ócB_tÉn¼|è£3òÊ\u008f\u0086W\u0011Jë\u0097W\u0013¸]î\rdT\u0092³\f\u0095n R\u0019i\u0013\u0089Y\u007fÎ\u0092\u0002C:\u0012/ {n¿g\u0089RÛè\u0002\u00ad\u0089Ñ\u008b¿Z\u0007P²Ë#¹?nËk*[3%d\u0002rá?\u00848\u0087+éwUêA\u0002Ê?\u000bî\u0081\u0017ïÆz\u000bYFgT\u0004v_µ¤\bÊÆ\u0085\u0002H(Ñ^\u0007ÓÍ®(x{I\u0002\tÎ\u000f?\r\u001c\u009fóÑ7\u0096·Ó\u008fw¿\u009a2\b´SJ°±~î\u0094\u000bç\u00886Îâ^\u008fÝÖ÷F\u0010~ºÌÝ@ \u0018\u0015ßO´·\u008d\u000eÿ\u0082\u0004\u0094Áí\"\u000fç\u0010¶è\"K\u0017=B½æ\b#?-\u0010DÁ\u008b²¨M\u0005¨|øÀA\u0003Ð.Y\be'b«º/U\u0095\u000b32H\u008b\rë\u0016ÆTøÇ\u000bäO²$R\u001eýx)/h\u0003Üï\u0089\u0014i'Õ\u0014¾W\r5)\b8n\f{JÂvjÚ\u0097\u000fu¯õ4]\u008c0ÎfëÍ\u0092o\u0014ë\u0004®aüg\b MÚæ\u00ad\u0086· \u0004\u0092\\°\u001e"
         .length();
      char var1 = 4;
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
                     case 0 -> 6;
                     case 1 -> 97;
                     case 2 -> 26;
                     case 3 -> 36;
                     case 4 -> 71;
                     case 5 -> 23;
                     default -> 124;
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
                     b = var5;
                     c = new String[32];
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

                  var2 = "\u008d\u0088}\\\u009d\u0014Y¡Õ\u001aê4\u0091?éü¼Ä¦Ø\u0087\u0082ó¦Ph¸(!\u0007ø\u0098ó7_\u008d{ÅÛÁ4\nÝ¾¾íÐë®\u001cnL\u00051zÞ\u0002\u0089\u0018AþL\u0083\u0088v'gô\u0006\u008d³L~Ô!)X1)Ö\t°\u0083.H;\u0011TÀüàÒN\u0002¹½Sëk{[Æ{2|5r®\u0013;Ñ\u001b.A2\u0014É`\f3É\u0092\u0015³L\u0097vÏ\u0096\u0095pCý3ÎjÛ6g»øtè²\u0092´víª\u0095\u0096VQô\u0018ÑAúÖ²£°ç.\\ÃGßO";
                  var4 = "\u008d\u0088}\\\u009d\u0014Y¡Õ\u001aê4\u0091?éü¼Ä¦Ø\u0087\u0082ó¦Ph¸(!\u0007ø\u0098ó7_\u008d{ÅÛÁ4\nÝ¾¾íÐë®\u001cnL\u00051zÞ\u0002\u0089\u0018AþL\u0083\u0088v'gô\u0006\u008d³L~Ô!)X1)Ö\t°\u0083.H;\u0011TÀüàÒN\u0002¹½Sëk{[Æ{2|5r®\u0013;Ñ\u001b.A2\u0014É`\f3É\u0092\u0015³L\u0097vÏ\u0096\u0095pCý3ÎjÛ6g»øtè²\u0092´víª\u0095\u0096VQô\u0018ÑAúÖ²£°ç.\\ÃGßO"
                     .length();
                  var1 = 7;
                  var8 = -1;
            }

            var10000 = 52;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ -22540) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 70;
            case 1 -> 189;
            case 2 -> 165;
            case 3 -> 180;
            case 4 -> 112;
            case 5 -> 48;
            case 6 -> 11;
            case 7 -> 192;
            case 8 -> 153;
            case 9 -> 55;
            case 10 -> 24;
            case 11 -> 53;
            case 12 -> 156;
            case 13 -> 226;
            case 14 -> 56;
            case 15 -> 225;
            case 16 -> 38;
            case 17 -> 164;
            case 18 -> 132;
            case 19 -> 171;
            case 20 -> 78;
            case 21 -> 109;
            case 22 -> 89;
            case 23 -> 136;
            case 24 -> 144;
            case 25 -> 188;
            case 26 -> 43;
            case 27 -> 86;
            case 28 -> 240;
            case 29 -> 161;
            case 30 -> 118;
            case 31 -> 227;
            case 32 -> 69;
            case 33 -> 140;
            case 34 -> 255;
            case 35 -> 239;
            case 36 -> 223;
            case 37 -> 72;
            case 38 -> 174;
            case 39 -> 81;
            case 40 -> 211;
            case 41 -> 82;
            case 42 -> 209;
            case 43 -> 25;
            case 44 -> 163;
            case 45 -> 191;
            case 46 -> 166;
            case 47 -> 100;
            case 48 -> 200;
            case 49 -> 197;
            case 50 -> 121;
            case 51 -> 58;
            case 52 -> 47;
            case 53 -> 84;
            case 54 -> 85;
            case 55 -> 33;
            case 56 -> 67;
            case 57 -> 20;
            case 58 -> 68;
            case 59 -> 74;
            case 60 -> 175;
            case 61 -> 28;
            case 62 -> 196;
            case 63 -> 229;
            case 64 -> 187;
            case 65 -> 235;
            case 66 -> 4;
            case 67 -> 110;
            case 68 -> 244;
            case 69 -> 54;
            case 70 -> 83;
            case 71 -> 242;
            case 72 -> 97;
            case 73 -> 137;
            case 74 -> 21;
            case 75 -> 39;
            case 76 -> 202;
            case 77 -> 206;
            case 78 -> 105;
            case 79 -> 178;
            case 80 -> 115;
            case 81 -> 234;
            case 82 -> 173;
            case 83 -> 170;
            case 84 -> 120;
            case 85 -> 186;
            case 86 -> 16;
            case 87 -> 36;
            case 88 -> 135;
            case 89 -> 13;
            case 90 -> 139;
            case 91 -> 233;
            case 92 -> 102;
            case 93 -> 44;
            case 94 -> 15;
            case 95 -> 6;
            case 96 -> 2;
            case 97 -> 238;
            case 98 -> 203;
            case 99 -> 246;
            case 100 -> 230;
            case 101 -> 184;
            case 102 -> 201;
            case 103 -> 73;
            case 104 -> 224;
            case 105 -> 66;
            case 106 -> 5;
            case 107 -> 40;
            case 108 -> 249;
            case 109 -> 236;
            case 110 -> 80;
            case 111 -> 94;
            case 112 -> 90;
            case 113 -> 213;
            case 114 -> 108;
            case 115 -> 158;
            case 116 -> 147;
            case 117 -> 35;
            case 118 -> 76;
            case 119 -> 10;
            case 120 -> 111;
            case 121 -> 71;
            case 122 -> 219;
            case 123 -> 133;
            case 124 -> 99;
            case 125 -> 222;
            case 126 -> 114;
            case 127 -> 126;
            case 128 -> 157;
            case 129 -> 107;
            case 130 -> 18;
            case 131 -> 62;
            case 132 -> 131;
            case 133 -> 51;
            case 134 -> 245;
            case 135 -> 23;
            case 136 -> 214;
            case 137 -> 17;
            case 138 -> 194;
            case 139 -> 155;
            case 140 -> 93;
            case 141 -> 122;
            case 142 -> 116;
            case 143 -> 41;
            case 144 -> 9;
            case 145 -> 49;
            case 146 -> 143;
            case 147 -> 57;
            case 148 -> 65;
            case 149 -> 19;
            case 150 -> 217;
            case 151 -> 221;
            case 152 -> 3;
            case 153 -> 26;
            case 154 -> 150;
            case 155 -> 190;
            case 156 -> 142;
            case 157 -> 198;
            case 158 -> 87;
            case 159 -> 159;
            case 160 -> 77;
            case 161 -> 103;
            case 162 -> 45;
            case 163 -> 176;
            case 164 -> 208;
            case 165 -> 125;
            case 166 -> 162;
            case 167 -> 61;
            case 168 -> 7;
            case 169 -> 34;
            case 170 -> 12;
            case 171 -> 79;
            case 172 -> 212;
            case 173 -> 101;
            case 174 -> 232;
            case 175 -> 183;
            case 176 -> 138;
            case 177 -> 92;
            case 178 -> 152;
            case 179 -> 113;
            case 180 -> 106;
            case 181 -> 231;
            case 182 -> 220;
            case 183 -> 154;
            case 184 -> 64;
            case 185 -> 151;
            case 186 -> 8;
            case 187 -> 42;
            case 188 -> 29;
            case 189 -> 250;
            case 190 -> 247;
            case 191 -> 149;
            case 192 -> 95;
            case 193 -> 167;
            case 194 -> 148;
            case 195 -> 228;
            case 196 -> 22;
            case 197 -> 141;
            case 198 -> 145;
            case 199 -> 128;
            case 200 -> 123;
            case 201 -> 117;
            case 202 -> 50;
            case 203 -> 241;
            case 204 -> 185;
            case 205 -> 216;
            case 206 -> 124;
            case 207 -> 251;
            case 208 -> 96;
            case 209 -> 252;
            case 210 -> 27;
            case 211 -> 204;
            case 212 -> 215;
            case 213 -> 193;
            case 214 -> 253;
            case 215 -> 0;
            case 216 -> 254;
            case 217 -> 146;
            case 218 -> 218;
            case 219 -> 91;
            case 220 -> 104;
            case 221 -> 243;
            case 222 -> 129;
            case 223 -> 179;
            case 224 -> 199;
            case 225 -> 75;
            case 226 -> 248;
            case 227 -> 181;
            case 228 -> 195;
            case 229 -> 60;
            case 230 -> 30;
            case 231 -> 205;
            case 232 -> 52;
            case 233 -> 210;
            case 234 -> 237;
            case 235 -> 182;
            case 236 -> 31;
            case 237 -> 32;
            case 238 -> 46;
            case 239 -> 169;
            case 240 -> 14;
            case 241 -> 127;
            case 242 -> 37;
            case 243 -> 59;
            case 244 -> 168;
            case 245 -> 134;
            case 246 -> 177;
            case 247 -> 160;
            case 248 -> 98;
            case 249 -> 119;
            case 250 -> 130;
            case 251 -> 88;
            case 252 -> 172;
            case 253 -> 63;
            case 254 -> 1;
            default -> 207;
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }
}
