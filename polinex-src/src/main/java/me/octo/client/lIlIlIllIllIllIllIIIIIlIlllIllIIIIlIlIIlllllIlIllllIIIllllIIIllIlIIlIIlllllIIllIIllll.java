package me.octo.client;

import com.mojang.blaze3d.platform.Window;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import java.util.Collection;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.Camera;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector4f;

public final class lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll {
   @NotNull
   public static lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static ObjectArrayList<lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static ObjectArrayList<lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static Object lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static Matrix4f IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static volatile double IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static volatile double IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static volatile double lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static boolean IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private static Vector4f llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static String[] a;
   private static String[] b;

   private lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll() {
   }

   @JvmStatic
   public static final void a(@NotNull Matrix4fc var0, @NotNull Matrix4fc var1) {
      boolean var10000 = IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.b();
      short var10002 = 5902;
      short var10003 = 17453;
      Intrinsics.checkNotNullParameter(var0, "projection");
      boolean var2 = var10000;
      short var10001 = 5892;
      var10002 = 21698;
      Intrinsics.checkNotNullParameter(var1, "viewRotation");
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.set(var0).mul(var1);
      if (var2
         && me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .gameRenderer
            != null) {
         Camera var4 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .gameRenderer
            .getMainCamera();
         if (var4 != null) {
            Vec3 var5 = var4.position();
            if (var5 != null) {
               Vec3 var3 = var5;
               IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var3.x;
               IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var3.y;
               lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var3.z;
               return;
            }
         }
      }
   }

   // $VF: Extended synchronized range to monitorexit
   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Vec3 var0,
      @NotNull String var1,
      float var2,
      @NotNull me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var3,
      @NotNull me.octo.client.utils.IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl var4,
      boolean var5
   ) {
      lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var14 = null; // PX-FIX
      int var10000 = ((IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.c()) ? 1 : 0);
      short var10002 = 5900;
      short var10003 = 27718;
      Intrinsics.checkNotNullParameter(var0, "pos");
      var10002 = 5889;
      var10003 = -4300;
      Intrinsics.checkNotNullParameter(var1, "text");
      var10002 = 5901;
      var10003 = -31306;
      Intrinsics.checkNotNullParameter(var3, "color");
      var10002 = 5910;
      var10003 = 6486;
      Intrinsics.checkNotNullParameter(var4, "font");
      boolean var6 = (var10000 != 0);
      var10000 = var1.length();
      if (!var6) {
         var10000 = var10000 == 0 ? 1 : 0;
      }

      if (var10000 == 0) {
         Object var7 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         synchronized (var7) {
            label30: {
               boolean var8 = false;
               Object var13 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               if (!var6) {
                  if (lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.isEmpty()) {
                     var14 = new lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        null, null, 0.0F, null, null, false, 63, null
                     );
                     break label30;
                  }

                  var13 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.removeLast();
               }

               var14 = (lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var13;
            }

            lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var9 = var14;
            var9.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var0;
            var9.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
            var9.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var2;
            var9.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var3;
            var9.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var4;
            var9.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var5;
            boolean var11 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.add(var9);
         }
      }
   }

   // $VF: Extended synchronized range to monitorexit
   @JvmStatic
   public static final void a() {
      Object var0 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      synchronized (var0) {
         boolean var1 = false;
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.addAll(
            (ObjectList)IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         );
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.clear();
         Unit var4 = Unit.INSTANCE;
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      short var10001 = 5896;
      short var10002 = -11424;
      Intrinsics.checkNotNullParameter(var1, "event");
      a();
   }

   // $VF: Extended synchronized range to monitorexit
   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @SubscribeEvent
   public final void a(@NotNull IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl var1) {
      boolean var2 = IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.b();
      IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl var10000 = var1;
      if (var2) {
         short var10001 = 5891;
         short var10002 = 6480;
         Intrinsics.checkNotNullParameter(var1, "event");
         if (me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .level
            == null) {
            return;
         }

         var10000 = var1;
      }

      if (var10000.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI != null) {
         GuiGraphicsExtractor var3 = var10000.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         ObjectRef var4 = new ObjectRef();
         IntRef var5 = new IntRef();
         Object var6 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         synchronized (var6) {
            boolean var7 = false;
            byte var37 = ((byte)((IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.isEmpty()) ? 1 : 0));
            if (var2) {
               if (var37 != 0) {
                  return;
               }

               var4.element = new lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.size()];
               var37 = 0;
            }

            int var8 = var37;
            int var9 = ((Collection)IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl).size();

            while (true) {
               if (var8 < var9) {
                  ((lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[])var4.element)[var8] = (lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.get(
                     var8
                  );
                  var8++;
                  if (!var2) {
                     break;
                  }

                  if (var2) {
                     continue;
                  }
               }

               var5.element = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.size();
               IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.clear();
               break;
            }

            Unit var25 = Unit.INSTANCE;
         }

         boolean var16 = false /* VF: Semaphore variable */;

         try {
            var16 = true;
            me.octo.client.utils.llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(
                  var3,
                  0,
                  0,
                  var1.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
                  var1.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
                  () -> a(var5, var4)
               );
            var16 = false;
         } finally {
            if (var16) {
               Object var27 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
               synchronized (var27) {
                  boolean var30 = false;

                  for (int var10 = 0; var10 < var5.element && var2; var10++) {
                     if (((lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[])var4.element)[var10]
                        != null) {
                        lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var11 = ((lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[])var4.element)[var10];
                        lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.add(var11);
                     }
                     break;
                  }

                  Unit var31 = Unit.INSTANCE;
               }
            }
         }

         Object var26 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         synchronized (var26) {
            boolean var28 = false;

            for (int var32 = 0; var32 < var5.element && var2; var32++) {
               if (((lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[])var4.element)[var32]
                  != null) {
                  lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var33 = ((lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[])var4.element)[var32];
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.add(var33);
               }
               break;
            }

            Unit var29 = Unit.INSTANCE;
         }
      }
   }

   private final void a(
      lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1,
      float var2,
      float var3
   ) {
      boolean var10000 = IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.b();
      float var5 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         var1.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
         var1.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
      float var6 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b(
         var1.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         var1.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
         var1.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
      boolean var4 = var10000;
      float var7 = 6.0F;
      float var8 = 3.0F;
      float var9 = var2 - var5 * 0.5F - var7;
      float var10 = var3 - var6 * 0.5F - var8;
      float var11 = var5 + var7 * 2.0F;
      float var12 = var6 + var8 * 2.0F;
      float var13 = 4.0F;
      float var14 = var1.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.t();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var9,
         var10,
         var11,
         var12,
         me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
            .a(0.7F * var14),
         var13
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var9,
         var10,
         var11,
         var12,
         1.5F,
         me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
            .a(var14),
         var13
      );
      float var15 = var2 - var5 * 0.5F;
      float var16 = var3 - var6 * 0.5F;
      lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var18 = var1;
      if (var4) {
         if (var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var17 = new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
               0,
               0,
               0,
               RangesKt.coerceIn((int)(var1.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.d() * 0.55F), 0, 255)
            );
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var1.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var15 + 1.0F,
               var16 + 1.0F,
               var1.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var17,
               var1.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            );
         }

         var18 = var1;
      }

      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var18.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         var15,
         var16,
         var1.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
         var1.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         var1.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
   }

   private final lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
      Vec3 var1
   ) {
      int var10000 = ((IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.b()) ? 1 : 0);
      Vector4f var3 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.set(
         (float)(var1.x - IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI),
         (float)(var1.y - IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll),
         (float)(var1.z - lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll),
         1.0F
      );
      boolean var2 = (var10000 != 0);
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.transform(var3);
      float var9 = var3.w;
      float var10001 = 0.0F;
      if (var2) {
         if (var3.w <= 0.0F) {
            return null;
         }

         var9 = var3.x;
         var10001 = var3.w;
      }

      float var4 = var9 / var10001;
      float var5 = var3.y / var3.w;
      float var14;
      var10000 = (var14 = var4 - -1.0F) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
      if (var2) {
         if (var10000 < 0) {
            return null;
         }

         float var15;
         var10000 = (var15 = var4 - 1.0F) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
      }

      if (var2) {
         if (var10000 > 0) {
            return null;
         }

         float var16;
         var10000 = (var16 = var5 - -1.0F) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1);
      }

      if (var2) {
         if (var10000 < 0) {
            return null;
         }

         float var17;
         var10000 = (var17 = var5 - 1.0F) == 0.0F ? 0 : (var17 < 0.0F ? -1 : 1);
      }

      if (var10000 <= 0) {
         Window var11 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .getWindow();
         short var10002 = 5898;
         short var10003 = 12330;
         Intrinsics.checkNotNullExpressionValue(var11, "getWindow(...)");
         Window var6 = var11;
         var10000 =(( IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) ? 1 : 0);
         if (var2) {
            var10000 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII ? var6.getScreenWidth() : var6.getWidth();
         }

         int var7 = var10000;
         var10000 =(( IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) ? 1 : 0);
         if (var2) {
            var10000 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII ? var6.getScreenHeight() : var6.getHeight();
         }

         int var8 = var10000;
         return new lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            (var4 * 0.5F + 0.5F) * var7, (1.0F - (var5 * 0.5F + 0.5F)) * var8
         );
      } else {
         return null;
      }
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Vec3 var0,
      @NotNull String var1,
      float var2,
      @NotNull me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var3,
      @NotNull me.octo.client.utils.IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl var4
   ) {
      short var10001 = 5900;
      short var10002 = 27718;
      Intrinsics.checkNotNullParameter(var0, "pos");
      var10001 = 5889;
      var10002 = -4300;
      Intrinsics.checkNotNullParameter(var1, "text");
      var10001 = 5895;
      var10002 = 1422;
      Intrinsics.checkNotNullParameter(var3, "color");
      var10001 = 5897;
      var10002 = 25666;
      Intrinsics.checkNotNullParameter(var4, "font");
      a(var0, var1, var2, var3, var4, false);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Vec3 var0,
      @NotNull String var1,
      float var2,
      @NotNull me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var3
   ) {
      short var10001 = 5900;
      short var10002 = 27718;
      Intrinsics.checkNotNullParameter(var0, "pos");
      var10001 = 5889;
      var10002 = -4300;
      Intrinsics.checkNotNullParameter(var1, "text");
      var10001 = 5901;
      var10002 = -31306;
      Intrinsics.checkNotNullParameter(var3, "color");
      a(var0, var1, var2, var3, null, false);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(@NotNull Vec3 var0, @NotNull String var1, float var2) {
      short var10001 = 5899;
      short var10002 = 7725;
      Intrinsics.checkNotNullParameter(var0, "pos");
      var10001 = 5894;
      var10002 = -13555;
      Intrinsics.checkNotNullParameter(var1, "text");
      a(var0, var1, var2, null, null, false);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(@NotNull Vec3 var0, @NotNull String var1) {
      short var10001 = 5900;
      short var10002 = 27718;
      Intrinsics.checkNotNullParameter(var0, "pos");
      var10001 = 5889;
      var10002 = -4300;
      Intrinsics.checkNotNullParameter(var1, "text");
      a(var0, var1, 0.0F, null, null, false);
   }

   private static final Unit a(IntRef var0, ObjectRef var1) {
      boolean var10000 = IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.b();
      int var3 = 0;
      boolean var2 = var10000;

      while (var3 < var0.element) {
         lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var6 = ((lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[])var1.element)[var3];
         Intrinsics.checkNotNull(
            ((lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[])var1.element)[var3]
         );
         lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var4 = var6;
         if (var2) {
            lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var7 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
               var4.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            );
            if (var7 != null) {
               lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var5 = var7;
               IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var4, var5.a(), var5.b());
            }
         }

         var3++;
         if (!var2) {
            break;
         }
      }

      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var26 = null; // PX-FIX
      String[] var5 = new String[17];
      int var3 = 0;
      String var2 = "ÿë\u0017\u0004\u0005\\¬\u0082¼°\fõ\u001b\t\u0094É\u009cY*W\u000b»8\u0007¤$R3³PR\u0010\u009a\u0001\u008f\t0>á\u0017\u0093Ð\u009e\\Ì\u0084\u0006 \u0005Ç¬>\u0087\t\u0010.äPÁñõ~\u00031·§Wtå\u0011\u008c\u0004\f§i\u008d\n\u0015?Ùu¯\u0012D~ï\u008f\u0003i\"ä\u0003÷u\u0099\u0005\u0081û9VÇ\u000eé¦¨\u008eõú\u0092É?ù\u0094O¯'\u0003\u0015\\Å\u0005\u0098\u007fÕýt";
      int var4 = "ÿë\u0017\u0004\u0005\\¬\u0082¼°\fõ\u001b\t\u0094É\u009cY*W\u000b»8\u0007¤$R3³PR\u0010\u009a\u0001\u008f\t0>á\u0017\u0093Ð\u009e\\Ì\u0084\u0006 \u0005Ç¬>\u0087\t\u0010.äPÁñõ~\u00031·§Wtå\u0011\u008c\u0004\f§i\u008d\n\u0015?Ùu¯\u0012D~ï\u008f\u0003i\"ä\u0003÷u\u0099\u0005\u0081û9VÇ\u000eé¦¨\u008eõú\u0092É?ù\u0094O¯'\u0003\u0015\\Å\u0005\u0098\u007fÕýt"
         .length();
      char var1 = 4;
      int var8 = -1;

      label52:
while (true) {
         short var10000 = 93;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var33 = var10001.toCharArray();
               int var10004 = var33.length;
               int var6 = 0;
               byte var36 = (byte)var10000;
               var26 = var33;
               int var18 = var10004;
               byte var43;
               char[] var47;
               int var10006;
               if (var10004 <= 1) {
                  var47 = var33;
                  var43 = (byte)var10000;
                  var10006 = var6;
               } else {
                  var36 = (byte)var10000;
                  var18 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var47 = var33;
                  var43 = (byte)var10000;
                  var10006 = var6;
               }

               while (true) {
                  var47[var10006] = (char)(var47[var10006] ^ var43 ^ switch (var6 % 7) {
                     case 0 -> 4;
                     case 1 -> 67;
                     case 2 -> 28;
                     case 3 -> 90;
                     case 4 -> 6;
                     case 5 -> 69;
                     default -> 58;
                  });
                  var6++;
                  if (var36 == 0) {
                     var10006 = var36;
                     var47 = var26;
                     var43 = var36;
                  } else {
                     if (var18 <= var6) {
                        break;
                     }

                     var47 = var26;
                     var43 = var36;
                     var10006 = var6;
                  }
               }
            }

            String var38 = new String(var26).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var38;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[17];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll();
                     var10000 = 5893;
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new ObjectArrayList();
                     short var20 = -26656;
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new ObjectArrayList();
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new Object();
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new Matrix4f();
                     String var11 = System.getProperty("os.name");
                     var10002 = 5888;
                     short var39 = 14762;
                     Intrinsics.checkNotNullExpressionValue(var11, "getProperty(...)");
                     String var12 = var11.toLowerCase(Locale.ROOT);
                     var10002 = 5890;
                     short var40 = 20374;
                     Intrinsics.checkNotNullExpressionValue(var12, "toLowerCase(...)");
                     CharSequence var13 = var12;
                     short var21 = 5903;
                     var10002 = 9509;
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = StringsKt.contains(
                        var13, "mac", false);
                     me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        .a(IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new Vector4f();
                     break label52;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var38;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "\u001bw7&\u0004© aÜ";
                  var4 = "\u001bw7&\u0004© aÜ".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 41;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 5894) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 53;
            case 1 -> 210;
            case 2 -> 169;
            case 3 -> 56;
            case 4 -> 73;
            case 5 -> 40;
            case 6 -> 28;
            case 7 -> 34;
            case 8 -> 90;
            case 9 -> 229;
            case 10 -> 146;
            case 11 -> 254;
            case 12 -> 176;
            case 13 -> 106;
            case 14 -> 50;
            case 15 -> 3;
            case 16 -> 114;
            case 17 -> 120;
            case 18 -> 172;
            case 19 -> 96;
            case 20 -> 194;
            case 21 -> 7;
            case 22 -> 144;
            case 23 -> 79;
            case 24 -> 52;
            case 25 -> 195;
            case 26 -> 248;
            case 27 -> 12;
            case 28 -> 129;
            case 29 -> 236;
            case 30 -> 159;
            case 31 -> 125;
            case 32 -> 204;
            case 33 -> 162;
            case 34 -> 36;
            case 35 -> 91;
            case 36 -> 115;
            case 37 -> 81;
            case 38 -> 74;
            case 39 -> 99;
            case 40 -> 206;
            case 41 -> 31;
            case 42 -> 214;
            case 43 -> 140;
            case 44 -> 68;
            case 45 -> 247;
            case 46 -> 93;
            case 47 -> 111;
            case 48 -> 200;
            case 49 -> 193;
            case 50 -> 218;
            case 51 -> 127;
            case 52 -> 132;
            case 53 -> 89;
            case 54 -> 242;
            case 55 -> 158;
            case 56 -> 38;
            case 57 -> 237;
            case 58 -> 107;
            case 59 -> 15;
            case 60 -> 108;
            case 61 -> 46;
            case 62 -> 44;
            case 63 -> 220;
            case 64 -> 199;
            case 65 -> 88;
            case 66 -> 228;
            case 67 -> 105;
            case 68 -> 240;
            case 69 -> 64;
            case 70 -> 5;
            case 71 -> 49;
            case 72 -> 141;
            case 73 -> 9;
            case 74 -> 170;
            case 75 -> 110;
            case 76 -> 241;
            case 77 -> 17;
            case 78 -> 205;
            case 79 -> 189;
            case 80 -> 212;
            case 81 -> 29;
            case 82 -> 33;
            case 83 -> 27;
            case 84 -> 117;
            case 85 -> 19;
            case 86 -> 142;
            case 87 -> 253;
            case 88 -> 75;
            case 89 -> 135;
            case 90 -> 244;
            case 91 -> 178;
            case 92 -> 8;
            case 93 -> 30;
            case 94 -> 113;
            case 95 -> 126;
            case 96 -> 102;
            case 97 -> 35;
            case 98 -> 203;
            case 99 -> 1;
            case 100 -> 191;
            case 101 -> 2;
            case 102 -> 55;
            case 103 -> 164;
            case 104 -> 54;
            case 105 -> 157;
            case 106 -> 201;
            case 107 -> 166;
            case 108 -> 62;
            case 109 -> 231;
            case 110 -> 246;
            case 111 -> 207;
            case 112 -> 234;
            case 113 -> 222;
            case 114 -> 69;
            case 115 -> 71;
            case 116 -> 215;
            case 117 -> 13;
            case 118 -> 21;
            case 119 -> 154;
            case 120 -> 211;
            case 121 -> 121;
            case 122 -> 235;
            case 123 -> 109;
            case 124 -> 245;
            case 125 -> 20;
            case 126 -> 95;
            case 127 -> 22;
            case 128 -> 32;
            case 129 -> 82;
            case 130 -> 98;
            case 131 -> 177;
            case 132 -> 116;
            case 133 -> 208;
            case 134 -> 197;
            case 135 -> 134;
            case 136 -> 171;
            case 137 -> 196;
            case 138 -> 42;
            case 139 -> 255;
            case 140 -> 112;
            case 141 -> 124;
            case 142 -> 167;
            case 143 -> 139;
            case 144 -> 18;
            case 145 -> 97;
            case 146 -> 77;
            case 147 -> 213;
            case 148 -> 103;
            case 149 -> 219;
            case 150 -> 26;
            case 151 -> 48;
            case 152 -> 70;
            case 153 -> 145;
            case 154 -> 87;
            case 155 -> 136;
            case 156 -> 76;
            case 157 -> 100;
            case 158 -> 85;
            case 159 -> 148;
            case 160 -> 86;
            case 161 -> 60;
            case 162 -> 4;
            case 163 -> 147;
            case 164 -> 122;
            case 165 -> 163;
            case 166 -> 59;
            case 167 -> 227;
            case 168 -> 221;
            case 169 -> 198;
            case 170 -> 131;
            case 171 -> 39;
            case 172 -> 232;
            case 173 -> 239;
            case 174 -> 104;
            case 175 -> 230;
            case 176 -> 83;
            case 177 -> 61;
            case 178 -> 183;
            case 179 -> 14;
            case 180 -> 130;
            case 181 -> 66;
            case 182 -> 151;
            case 183 -> 252;
            case 184 -> 0;
            case 185 -> 243;
            case 186 -> 165;
            case 187 -> 16;
            case 188 -> 10;
            case 189 -> 23;
            case 190 -> 174;
            case 191 -> 175;
            case 192 -> 150;
            case 193 -> 188;
            case 194 -> 249;
            case 195 -> 223;
            case 196 -> 128;
            case 197 -> 160;
            case 198 -> 133;
            case 199 -> 152;
            case 200 -> 181;
            case 201 -> 67;
            case 202 -> 202;
            case 203 -> 137;
            case 204 -> 186;
            case 205 -> 47;
            case 206 -> 58;
            case 207 -> 43;
            case 208 -> 149;
            case 209 -> 225;
            case 210 -> 37;
            case 211 -> 161;
            case 212 -> 185;
            case 213 -> 57;
            case 214 -> 233;
            case 215 -> 80;
            case 216 -> 251;
            case 217 -> 179;
            case 218 -> 138;
            case 219 -> 238;
            case 220 -> 92;
            case 221 -> 72;
            case 222 -> 217;
            case 223 -> 143;
            case 224 -> 123;
            case 225 -> 182;
            case 226 -> 192;
            case 227 -> 224;
            case 228 -> 101;
            case 229 -> 155;
            case 230 -> 45;
            case 231 -> 119;
            case 232 -> 63;
            case 233 -> 209;
            case 234 -> 226;
            case 235 -> 168;
            case 236 -> 184;
            case 237 -> 250;
            case 238 -> 6;
            case 239 -> 25;
            case 240 -> 153;
            case 241 -> 51;
            case 242 -> 173;
            case 243 -> 190;
            case 244 -> 94;
            case 245 -> 180;
            case 246 -> 41;
            case 247 -> 65;
            case 248 -> 156;
            case 249 -> 118;
            case 250 -> 216;
            case 251 -> 187;
            case 252 -> 84;
            case 253 -> 78;
            case 254 -> 24;
            default -> 11;
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

   private static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      private final float IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final float lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(float var1, float var2) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      }

      public final float a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final float b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final float c() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final float d() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         float var1, float var2
      ) {
         return new lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var2
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10002 = -11676;
         short var10003 = -9294;
         var10003 = -11675;
         short var10004 = 6248;
         return "ScreenPos(x="
            + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            + ", y="
            + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Float.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         return var1 * 31 + Float.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         boolean var2 = IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.c();
         Object var10000 = this;
         if (!var2) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (!var2) {
            if (!(
               var10000 instanceof lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
         int var4 = Float.compare(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         );
         if (!var2) {
            if (var4 != 0) {
               return false;
            }

            var4 = Float.compare(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
         }

         if (!var2) {
            if (var4 != 0) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
         pxClinit: {
         String[] var5 = new String[2];
         int var3 = 0;
         String var2 = "\rzb\f\f²Â\u000ehÏ\tÔ\u001d\u008f\u001aÎ\u0004";
         int var4 = "\rzb\f\f²Â\u000ehÏ\tÔ\u001d\u008f\u001aÎ\u0004".length();
         char var1 = 4;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 49;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 49;
                  var10006 = var6;
               } else {
                  var13 = 49;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 49;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 97;
                     case 1 -> 74;
                     case 2 -> 40;
                     case 3 -> 4;
                     case 4 -> 69;
                     case 5 -> 52;
                     default -> 11;
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
               b = new String[2];
               break pxClinit;
            }

            var1 = var2.charAt(var0);
         }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -11675) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 76;
               case 1 -> 182;
               case 2 -> 189;
               case 3 -> 5;
               case 4 -> 66;
               case 5 -> 168;
               case 6 -> 94;
               case 7 -> 170;
               case 8 -> 87;
               case 9 -> 216;
               case 10 -> 71;
               case 11 -> 64;
               case 12 -> 228;
               case 13 -> 204;
               case 14 -> 102;
               case 15 -> 75;
               case 16 -> 32;
               case 17 -> 245;
               case 18 -> 246;
               case 19 -> 83;
               case 20 -> 196;
               case 21 -> 132;
               case 22 -> 178;
               case 23 -> 135;
               case 24 -> 24;
               case 25 -> 164;
               case 26 -> 254;
               case 27 -> 158;
               case 28 -> 85;
               case 29 -> 208;
               case 30 -> 69;
               case 31 -> 90;
               case 32 -> 156;
               case 33 -> 35;
               case 34 -> 239;
               case 35 -> 28;
               case 36 -> 166;
               case 37 -> 169;
               case 38 -> 251;
               case 39 -> 97;
               case 40 -> 198;
               case 41 -> 58;
               case 42 -> 226;
               case 43 -> 92;
               case 44 -> 220;
               case 45 -> 68;
               case 46 -> 177;
               case 47 -> 200;
               case 48 -> 84;
               case 49 -> 197;
               case 50 -> 162;
               case 51 -> 56;
               case 52 -> 184;
               case 53 -> 40;
               case 54 -> 185;
               case 55 -> 95;
               case 56 -> 181;
               case 57 -> 207;
               case 58 -> 45;
               case 59 -> 157;
               case 60 -> 249;
               case 61 -> 123;
               case 62 -> 188;
               case 63 -> 141;
               case 64 -> 215;
               case 65 -> 9;
               case 66 -> 211;
               case 67 -> 57;
               case 68 -> 73;
               case 69 -> 7;
               case 70 -> 232;
               case 71 -> 4;
               case 72 -> 243;
               case 73 -> 10;
               case 74 -> 6;
               case 75 -> 38;
               case 76 -> 111;
               case 77 -> 17;
               case 78 -> 129;
               case 79 -> 31;
               case 80 -> 113;
               case 81 -> 118;
               case 82 -> 22;
               case 83 -> 244;
               case 84 -> 131;
               case 85 -> 0;
               case 86 -> 86;
               case 87 -> 160;
               case 88 -> 43;
               case 89 -> 12;
               case 90 -> 180;
               case 91 -> 222;
               case 92 -> 165;
               case 93 -> 247;
               case 94 -> 53;
               case 95 -> 155;
               case 96 -> 48;
               case 97 -> 252;
               case 98 -> 179;
               case 99 -> 190;
               case 100 -> 234;
               case 101 -> 30;
               case 102 -> 238;
               case 103 -> 149;
               case 104 -> 139;
               case 105 -> 99;
               case 106 -> 236;
               case 107 -> 63;
               case 108 -> 191;
               case 109 -> 241;
               case 110 -> 194;
               case 111 -> 93;
               case 112 -> 199;
               case 113 -> 227;
               case 114 -> 33;
               case 115 -> 114;
               case 116 -> 122;
               case 117 -> 11;
               case 118 -> 89;
               case 119 -> 148;
               case 120 -> 203;
               case 121 -> 242;
               case 122 -> 146;
               case 123 -> 59;
               case 124 -> 13;
               case 125 -> 172;
               case 126 -> 23;
               case 127 -> 112;
               case 128 -> 224;
               case 129 -> 195;
               case 130 -> 65;
               case 131 -> 80;
               case 132 -> 15;
               case 133 -> 25;
               case 134 -> 67;
               case 135 -> 176;
               case 136 -> 223;
               case 137 -> 144;
               case 138 -> 96;
               case 139 -> 255;
               case 140 -> 41;
               case 141 -> 235;
               case 142 -> 250;
               case 143 -> 120;
               case 144 -> 142;
               case 145 -> 126;
               case 146 -> 14;
               case 147 -> 161;
               case 148 -> 52;
               case 149 -> 214;
               case 150 -> 121;
               case 151 -> 140;
               case 152 -> 186;
               case 153 -> 106;
               case 154 -> 60;
               case 155 -> 105;
               case 156 -> 151;
               case 157 -> 8;
               case 158 -> 21;
               case 159 -> 201;
               case 160 -> 192;
               case 161 -> 202;
               case 162 -> 50;
               case 163 -> 101;
               case 164 -> 49;
               case 165 -> 150;
               case 166 -> 81;
               case 167 -> 213;
               case 168 -> 136;
               case 169 -> 77;
               case 170 -> 51;
               case 171 -> 20;
               case 172 -> 206;
               case 173 -> 175;
               case 174 -> 218;
               case 175 -> 117;
               case 176 -> 221;
               case 177 -> 212;
               case 178 -> 79;
               case 179 -> 2;
               case 180 -> 138;
               case 181 -> 143;
               case 182 -> 47;
               case 183 -> 109;
               case 184 -> 115;
               case 185 -> 39;
               case 186 -> 152;
               case 187 -> 72;
               case 188 -> 18;
               case 189 -> 229;
               case 190 -> 44;
               case 191 -> 210;
               case 192 -> 147;
               case 193 -> 108;
               case 194 -> 98;
               case 195 -> 183;
               case 196 -> 230;
               case 197 -> 217;
               case 198 -> 159;
               case 199 -> 116;
               case 200 -> 145;
               case 201 -> 74;
               case 202 -> 253;
               case 203 -> 171;
               case 204 -> 209;
               case 205 -> 127;
               case 206 -> 240;
               case 207 -> 173;
               case 208 -> 100;
               case 209 -> 55;
               case 210 -> 167;
               case 211 -> 193;
               case 212 -> 46;
               case 213 -> 61;
               case 214 -> 37;
               case 215 -> 163;
               case 216 -> 107;
               case 217 -> 82;
               case 218 -> 137;
               case 219 -> 119;
               case 220 -> 248;
               case 221 -> 26;
               case 222 -> 54;
               case 223 -> 174;
               case 224 -> 231;
               case 225 -> 134;
               case 226 -> 1;
               case 227 -> 88;
               case 228 -> 27;
               case 229 -> 153;
               case 230 -> 237;
               case 231 -> 19;
               case 232 -> 205;
               case 233 -> 219;
               case 234 -> 125;
               case 235 -> 225;
               case 236 -> 16;
               case 237 -> 42;
               case 238 -> 34;
               case 239 -> 3;
               case 240 -> 103;
               case 241 -> 110;
               case 242 -> 128;
               case 243 -> 70;
               case 244 -> 29;
               case 245 -> 124;
               case 246 -> 91;
               case 247 -> 104;
               case 248 -> 78;
               case 249 -> 187;
               case 250 -> 233;
               case 251 -> 130;
               case 252 -> 62;
               case 253 -> 154;
               case 254 -> 36;
               default -> 133;
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
   
    public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var0, float var1, float var2, int var3, Object var4) {
        if ((var3 & 1) != 0) {
            var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        }
        if ((var3 & 2) != 0) {
            var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
        }
        return var0.a(var1, var2);
    }}

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX RC4-224: masked default-arg constructor restored from jar bytecode (descriptor (Lnet/minecraft/world/phys/Vec3;Ljava/lang/String;FLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;Lme/octo/client/utils/IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V)
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(net.minecraft.world.phys.Vec3 p1, java.lang.String p2, float p3, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll p4, me.octo.client.utils.IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl p5, boolean p6, int mask, kotlin.jvm.internal.DefaultConstructorMarker marker) {
      if ((mask & 1) != 0) { p1 = net.minecraft.world.phys.Vec3.ZERO; }
      if ((mask & 2) != 0) { p2 = ""; }
      if ((mask & 4) != 0) { p3 = 14F; }
      if ((mask & 8) != 0) { p4 = me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI; }
      if ((mask & 16) != 0) { p5 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII; }
      if ((mask & 32) != 0) { p6 = true; }
      this(p1, p2, p3, p4, p5, p6);
        }
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

      @JvmField
      @NotNull
      public Vec3 IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @JvmField
      @NotNull
      public String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @JvmField
      public float IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @JvmField
      @NotNull
      public me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      @JvmField
      @NotNull
      public me.octo.client.utils.IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      @JvmField
      public boolean IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         @NotNull Vec3 var1,
         @NotNull String var2,
         float var3,
         @NotNull me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4,
         @NotNull me.octo.client.utils.IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl var5,
         boolean var6
      ) {
         short var10001 = -11805;
         short var10002 = -12637;
         Intrinsics.checkNotNullParameter(var1, "pos");
         var10001 = -11806;
         var10002 = -14632;
         Intrinsics.checkNotNullParameter(var2, "text");
         var10001 = -11807;
         var10002 = 15268;
         Intrinsics.checkNotNullParameter(var4, "color");
         var10001 = -11808;
         var10002 = -25845;
         Intrinsics.checkNotNullParameter(var5, "font");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var6;
      }

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
         this(null, null, 0.0F, null, null, false, 63, null);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[5];
         int var3 = 0;
         String var2 = "õÕÞ\u0004#,\u008be\u00054\u008f\u0088A|";
         int var4 = "õÕÞ\u0004#,\u008be\u00054\u008f\u0088A|".length();
         char var1 = 3;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 8;
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
                        case 0 -> 11;
                        case 1 -> 3;
                        case 2 -> 5;
                        case 3 -> 52;
                        case 4 -> 87;
                        case 5 -> 93;
                        default -> 22;
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
                        b = new String[5];
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

                     var2 = "nÿ&\u0016\u0004\u0004¶ìk";
                     var4 = "nÿ&\u0016\u0004\u0004¶ìk".length();
                     var1 = 4;
                     var8 = -1;
               }

               var10000 = 10;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -11805) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 6;
               case 1 -> 45;
               case 2 -> 60;
               case 3 -> 68;
               case 4 -> 183;
               case 5 -> 217;
               case 6 -> 160;
               case 7 -> 52;
               case 8 -> 207;
               case 9 -> 10;
               case 10 -> 168;
               case 11 -> 161;
               case 12 -> 55;
               case 13 -> 246;
               case 14 -> 225;
               case 15 -> 212;
               case 16 -> 118;
               case 17 -> 162;
               case 18 -> 120;
               case 19 -> 172;
               case 20 -> 79;
               case 21 -> 205;
               case 22 -> 211;
               case 23 -> 154;
               case 24 -> 103;
               case 25 -> 3;
               case 26 -> 245;
               case 27 -> 5;
               case 28 -> 128;
               case 29 -> 19;
               case 30 -> 74;
               case 31 -> 175;
               case 32 -> 132;
               case 33 -> 37;
               case 34 -> 112;
               case 35 -> 253;
               case 36 -> 202;
               case 37 -> 34;
               case 38 -> 236;
               case 39 -> 121;
               case 40 -> 78;
               case 41 -> 46;
               case 42 -> 23;
               case 43 -> 228;
               case 44 -> 234;
               case 45 -> 64;
               case 46 -> 191;
               case 47 -> 13;
               case 48 -> 243;
               case 49 -> 82;
               case 50 -> 254;
               case 51 -> 86;
               case 52 -> 170;
               case 53 -> 209;
               case 54 -> 92;
               case 55 -> 80;
               case 56 -> 11;
               case 57 -> 233;
               case 58 -> 203;
               case 59 -> 221;
               case 60 -> 232;
               case 61 -> 242;
               case 62 -> 165;
               case 63 -> 4;
               case 64 -> 81;
               case 65 -> 76;
               case 66 -> 108;
               case 67 -> 32;
               case 68 -> 116;
               case 69 -> 62;
               case 70 -> 33;
               case 71 -> 125;
               case 72 -> 42;
               case 73 -> 149;
               case 74 -> 61;
               case 75 -> 47;
               case 76 -> 8;
               case 77 -> 237;
               case 78 -> 147;
               case 79 -> 0;
               case 80 -> 184;
               case 81 -> 229;
               case 82 -> 18;
               case 83 -> 167;
               case 84 -> 113;
               case 85 -> 130;
               case 86 -> 17;
               case 87 -> 114;
               case 88 -> 189;
               case 89 -> 35;
               case 90 -> 186;
               case 91 -> 157;
               case 92 -> 75;
               case 93 -> 255;
               case 94 -> 152;
               case 95 -> 158;
               case 96 -> 210;
               case 97 -> 171;
               case 98 -> 59;
               case 99 -> 83;
               case 100 -> 192;
               case 101 -> 198;
               case 102 -> 139;
               case 103 -> 227;
               case 104 -> 178;
               case 105 -> 215;
               case 106 -> 155;
               case 107 -> 101;
               case 108 -> 213;
               case 109 -> 1;
               case 110 -> 43;
               case 111 -> 2;
               case 112 -> 134;
               case 113 -> 247;
               case 114 -> 153;
               case 115 -> 230;
               case 116 -> 164;
               case 117 -> 71;
               case 118 -> 190;
               case 119 -> 166;
               case 120 -> 41;
               case 121 -> 249;
               case 122 -> 222;
               case 123 -> 138;
               case 124 -> 197;
               case 125 -> 216;
               case 126 -> 176;
               case 127 -> 88;
               case 128 -> 206;
               case 129 -> 87;
               case 130 -> 89;
               case 131 -> 122;
               case 132 -> 196;
               case 133 -> 204;
               case 134 -> 105;
               case 135 -> 27;
               case 136 -> 248;
               case 137 -> 7;
               case 138 -> 93;
               case 139 -> 150;
               case 140 -> 70;
               case 141 -> 137;
               case 142 -> 145;
               case 143 -> 16;
               case 144 -> 30;
               case 145 -> 159;
               case 146 -> 136;
               case 147 -> 200;
               case 148 -> 26;
               case 149 -> 180;
               case 150 -> 218;
               case 151 -> 208;
               case 152 -> 104;
               case 153 -> 28;
               case 154 -> 25;
               case 155 -> 135;
               case 156 -> 96;
               case 157 -> 226;
               case 158 -> 124;
               case 159 -> 223;
               case 160 -> 156;
               case 161 -> 98;
               case 162 -> 131;
               case 163 -> 21;
               case 164 -> 188;
               case 165 -> 195;
               case 166 -> 57;
               case 167 -> 129;
               case 168 -> 214;
               case 169 -> 241;
               case 170 -> 69;
               case 171 -> 53;
               case 172 -> 90;
               case 173 -> 91;
               case 174 -> 85;
               case 175 -> 107;
               case 176 -> 15;
               case 177 -> 194;
               case 178 -> 12;
               case 179 -> 50;
               case 180 -> 127;
               case 181 -> 231;
               case 182 -> 181;
               case 183 -> 94;
               case 184 -> 219;
               case 185 -> 51;
               case 186 -> 146;
               case 187 -> 199;
               case 188 -> 240;
               case 189 -> 239;
               case 190 -> 169;
               case 191 -> 49;
               case 192 -> 56;
               case 193 -> 20;
               case 194 -> 72;
               case 195 -> 177;
               case 196 -> 99;
               case 197 -> 123;
               case 198 -> 63;
               case 199 -> 65;
               case 200 -> 54;
               case 201 -> 140;
               case 202 -> 141;
               case 203 -> 163;
               case 204 -> 109;
               case 205 -> 40;
               case 206 -> 102;
               case 207 -> 148;
               case 208 -> 97;
               case 209 -> 133;
               case 210 -> 106;
               case 211 -> 250;
               case 212 -> 179;
               case 213 -> 110;
               case 214 -> 115;
               case 215 -> 14;
               case 216 -> 44;
               case 217 -> 174;
               case 218 -> 31;
               case 219 -> 142;
               case 220 -> 58;
               case 221 -> 38;
               case 222 -> 143;
               case 223 -> 185;
               case 224 -> 22;
               case 225 -> 251;
               case 226 -> 48;
               case 227 -> 182;
               case 228 -> 244;
               case 229 -> 238;
               case 230 -> 77;
               case 231 -> 39;
               case 232 -> 9;
               case 233 -> 193;
               case 234 -> 144;
               case 235 -> 36;
               case 236 -> 235;
               case 237 -> 220;
               case 238 -> 126;
               case 239 -> 187;
               case 240 -> 100;
               case 241 -> 95;
               case 242 -> 66;
               case 243 -> 84;
               case 244 -> 67;
               case 245 -> 201;
               case 246 -> 29;
               case 247 -> 151;
               case 248 -> 252;
               case 249 -> 73;
               case 250 -> 119;
               case 251 -> 224;
               case 252 -> 24;
               case 253 -> 117;
               case 254 -> 111;
               default -> 173;
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

  // PX-FIX synth restored from jar bytecode
  public static void a(net.minecraft.world.phys.Vec3 p0, java.lang.String p1, float p2, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll p3, me.octo.client.utils.IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl p4, boolean p5, int p6, java.lang.Object p7) {
    if ((p6 & 4) != 0) { p2 = 14.0f; }
    if ((p6 & 8) != 0) { p3 = me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI; }
    if ((p6 & 16) != 0) { p4 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII; }
    if ((p6 & 32) != 0) { p5 = true; }
    a(p0, p1, p2, p3, p4, p5);
  }
}
