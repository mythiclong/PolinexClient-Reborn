package me.octo.client;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectCollection;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl;
import me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.world.entity.Entity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIIIIlIlIIlIIllllllIlllllIlIlIIIIIIIIlIlllllIlIIlIlIIlIIIIIIIlllIIIlllIIIlllllIlIIlII {
   
   @NotNull
   public static IIIIIlIlIIlIIllllllIlllllIlIlIIIIIIIIlIlllllIlIIlIlIIlIIIIIIIlllIIIlllIIIlllllIlIIlII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Int2ObjectOpenHashMap<IIIIIlIlIIlIIllllllIlllllIlIlIIIIIIIIlIlllllIlIIlIlIIlIIIIIIIlllIIIlllIIIlllllIlIIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static Int2ObjectOpenHashMap<IIIIIlIlIIlIIllllllIlllllIlIlIIIIIIIIlIlllllIlIIlIlIIlIIIIIIIlllIIIlllIIIlllllIlIIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static Object lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static String[] a;
   private static String[] b;

   private IIIIIlIlIIlIIllllllIlllllIlIlIIIIIIIIlIlllllIlIIlIlIIlIIIIIIIlllIIIlllIIIlllllIlIIlII() {
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Entity var0,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1,
      float var2,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3,
      float var4,
      float var5,
      boolean var6,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var7,
      float var8,
      float var9,
      boolean var10,
      boolean var11
   ) {
      Object var21 = null; // PX-FIX
      short var10001 = 22191;
      short var10002 = -6156;
      Intrinsics.checkNotNullParameter(var0, "entity");
      Object var12 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      synchronized (var12) {
         boolean var13 = false;
         Map var14 = (Map)lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         Integer var15 = var0.getId();

         IIIIIlIlIIlIIllllllIlllllIlIlIIIIIIIIlIlllllIlIIlIlIIlIIIIIIIlllIIIlllIIIlllllIlIIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000;
         int var10003;
         label33: {
            try {
               if (var1 != null) {
                  var10003 = var1.h();
               } else {
                  var10003 = 0;
               }
               var10000 = new IIIIIlIlIIlIIllllllIlllllIlIlIIIIIIIIlIlllllIlIIlIlIIlIIIIIIIlllIIIlllIIIlllllIlIIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                  
                  (Entity)var21, var10003, var2, var3 != null ? var3.h() : 0, var4, var5, var6, var7 != null ? var7.h() : 0, var8, var9, var10, var11); // PX-FIX
               var21 = var0;
            } catch (NoWhenBranchMatchedException var17) {
               throw (RuntimeException)a(var17);
            }
         }

         IIIIIlIlIIlIIllllllIlllllIlIlIIIIIIIIlIlllllIlIIlIlIIlIIIIIIIlllIIIlllIIIlllllIlIIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var16 = var10000;
         var14.put(var15, var16);
         Unit var19 = Unit.INSTANCE;
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @JvmStatic
   public static final void a() {
      Object var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      boolean var10000 = IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.c();
      synchronized (var1){} // $VF: monitorenter 
      boolean var0 = var10000;

      try {
         boolean var2 = false;
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.clear();
         ObjectIterator var10 = ((ObjectCollection)IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.values()).iterator();
         short var10002 = 22190;
         short var10003 = 18568;
         Intrinsics.checkNotNullExpressionValue(var10, "iterator(...)");
         ObjectIterator var3 = var10;

         while (true) {
            if (var3.hasNext()) {
               IIIIIlIlIIlIIllllllIlllllIlIlIIIIIIIIlIlllllIlIIlIlIIlIIIIIIIlllIIIlllIIIlllllIlIIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var4 = (IIIIIlIlIIlIIllllllIlllllIlIlIIIIIIIIlIlllllIlIIlIlIIlIIIIIIIlllIIIlllIIIlllllIlIIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var3.next();

               try {
                  IlIIlllllllllIllllIlllIllIlIIlIIIIIlIIllIIIllllIllIlIlIIllllllIIIIlIIllIIIlIIIIllIIII.a(var4.a());
                  IlIIlIlllIllIIIlIlIlIIIllllIlllIlIIIIIIlllIIIIIlIIllIIIIIIIllIIIIllIIIlllIIlIIlllIIII.b(var4.a());
                  if (var0) {
                     break;
                  }

                  if (!var0) {
                     continue;
                  }
               } catch (NoWhenBranchMatchedException var7) {
                  throw (RuntimeException)a(var7);
               }
            }

            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.clear();
            break;
         }

         Unit var9 = Unit.INSTANCE;
      } finally {
         // $VF: monitorexit
      }
   }

   @SubscribeEvent
   public final void a(@NotNull IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      short var10001 = 22177;
      short var10002 = -14787;
      Intrinsics.checkNotNullParameter(var1, "event");
      a();
   }

   @SubscribeEvent(
      priority = EventPriority.LOW
   )
   public final void a(@NotNull IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl param1) {
      if (me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.level == null) {
         return;
      }
      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[] var3 = null;
      Object var5 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      synchronized (var5) {
         boolean var6 = false;
         ObjectIterator var7 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.int2ObjectEntrySet().iterator();
         Intrinsics.checkNotNullExpressionValue(var7, "iterator(...)");
         while (var7.hasNext()) {
            it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry var8 = (it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry)var7.next();
            if (!lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.containsKey(var8.getIntKey())) {
               IlIIlllllllllIllllIlllIllIlIIlIIIIIlIIllIIIllllIllIlIlIIllllllIIIIlIIllIIIlIIIIllIIII.a(((llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var8.getValue()).a());
               IlIIlIlllIllIIIlIlIlIIIllllIlllIlIIIIIIlllIIIIIlIIllIIIIIIIllIIIIllIIIlllIIlIIlllIIII.b(((llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var8.getValue()).a());
               var7.remove();
            }
         }
         java.util.Collection var9 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.values();
         Intrinsics.checkNotNullExpressionValue(var9, "<get-values>(...)");
         var3 = (llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[])var9.toArray(new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[0]);
         for (int var10 = 0; var10 < var3.length; var10++) {
            llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var11 = var3[var10];
            ((Map)IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl).put(var11.a().getId(), var11);
         }
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.clear();
         Unit var19 = Unit.INSTANCE;
      }
      if (var3.length == 0) {
         return;
      }
      float var4 = 0.0F;
      float var5b = 0.0F;
      float var6b = 0.0F;
      boolean var7b = false;
      boolean var8b = true;
      boolean var9b = false;
      float var10b = 0.0F;
      float var11b = 0.0F;
      boolean var12 = true;
      for (llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var16 : var3) {
         if ((var16.b() >>> 24) != 0) {
            IlIIlllllllllIllllIlllIllIlIIlIIIIIlIIllIIIllllIllIlIlIIllllllIIIIlIIllIIIlIIIIllIIII.a(var16.a(), var16.b());
            if (var16.c() > var4) {
               var4 = var16.c();
            }
         } else if ((var16.d() >>> 24) != 0) {
            IlIIlllllllllIllllIlllIllIlIIlIIIIIlIIllIIIllllIllIlIlIIllllllIIIIlIIllIIIlIIIIllIIII.a(var16.a(), var16.d());
         } else {
            IlIIlllllllllIllllIlllIllIlIIlIIIIIlIIllIIIllllIllIlIlIIllllllIIIIlIIllIIIlIIIIllIIII.a(var16.a());
         }
         if ((var16.d() >>> 24) != 0) {
            var7b = true;
            if (var16.e() > var5b) {
               var5b = var16.e();
            }
            if (var16.f() > var6b) {
               var6b = var16.f();
            }
            if (!var16.g()) {
               var8b = false;
            }
         }
         if ((var16.h() >>> 24) != 0) {
            var9b = true;
            if (var16.i() > var10b) {
               var10b = var16.i();
            }
            if (var16.j() > var11b) {
               var11b = var16.j();
            }
            if (!var16.k()) {
               var12 = false;
            }
         }
         if (var16.l()) {
            IlIIlIlllIllIIIlIlIlIIIllllIlllIlIIIIIIlllIIIIIlIIllIIIIIIIllIIIIllIIIlllIIlIIlllIIII.a(var16.a());
         } else {
            IlIIlIlllIllIIIlIlIlIIIllllIlllIlIIIIIIlllIIIIIlIIllIIIIIIIllIIIIllIIIlllIIlIIlllIIII.b(var16.a());
         }
      }
      if (var4 > 0.0F) {
         lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.d(var4);
      }
      if (var7b) {
         lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.c(var6b);
         lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.e(var5b);
         lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a(var8b);
      }
      if (var9b) {
         lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.b(var10b);
         lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.c(var11b);
         lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a(var12);
      } else {
         return;
      }
      com.mojang.blaze3d.vertex.PoseStack var13 = param1.k();
      com.mojang.blaze3d.pipeline.RenderTarget var14 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getMainRenderTarget();
      Intrinsics.checkNotNullExpressionValue(var14, "getMainRenderTarget(...)");
      IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl var15 = IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      net.minecraft.client.Camera var16b = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.gameRenderer.getMainCamera();
      Intrinsics.checkNotNullExpressionValue(var16b, "getMainCamera(...)");
      org.lwjgl.opengl.GL11C.glEnable(2848);
      IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI var18 = IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var14, var13, var16b);
      try {
         if (var15 == IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
            IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI var21 = var18;
            IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl var24 = var21.d();
            var21.a(IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
            try {
               for (llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var30 : var3) {
                  if ((var30.h() >>> 24) == 0) {
                     continue;
                  }
                  net.minecraft.world.phys.AABB var31 = var30.a().getBoundingBox();
                  Intrinsics.checkNotNullExpressionValue(var31, "getBoundingBox(...)");
                  lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.b(var21, var31, new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(var30.h()));
               }
            } finally {
               var21.a(var24);
            }
         } else if (var15 == IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
            IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI var26 = var18;
            IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl var24b = var26.d();
            var26.a(IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
            try {
               for (llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var31b : var3) {
                  if ((var31b.h() >>> 24) == 0) {
                     continue;
                  }
                  net.minecraft.world.phys.AABB var32 = var31b.a().getBoundingBox();
                  Intrinsics.checkNotNullExpressionValue(var32, "getBoundingBox(...)");
                  lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.b(var26, var32, new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(var31b.h()));
               }
            } finally {
               var26.a(var24b);
            }
         } else {
            throw new NoWhenBranchMatchedException();
         }
      } finally {
         var18.f();
         org.lwjgl.opengl.GL11C.glDisable(2848);
      }
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Entity var0,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1,
      float var2,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3,
      float var4,
      float var5,
      boolean var6,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var7,
      float var8,
      float var9,
      boolean var10
   ) {
      short var10001 = 22191;
      short var10002 = -6156;
      Intrinsics.checkNotNullParameter(var0, "entity");
      a(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, false);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Entity var0,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1,
      float var2,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3,
      float var4,
      float var5,
      boolean var6,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var7,
      float var8,
      float var9
   ) {
      short var10001 = 22191;
      short var10002 = -6156;
      Intrinsics.checkNotNullParameter(var0, "entity");
      a(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, false, false);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Entity var0,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1,
      float var2,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3,
      float var4,
      float var5,
      boolean var6,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var7,
      float var8
   ) {
      short var10001 = 22188;
      short var10002 = -12429;
      Intrinsics.checkNotNullParameter(var0, "entity");
      a(var0, var1, var2, var3, var4, var5, var6, var7, var8, 0.0F, false, false);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Entity var0,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1,
      float var2,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3,
      float var4,
      float var5,
      boolean var6,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var7
   ) {
      short var10001 = 22191;
      short var10002 = -6156;
      Intrinsics.checkNotNullParameter(var0, "entity");
      a(var0, var1, var2, var3, var4, var5, var6, var7, 0.0F, 0.0F, false, false);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Entity var0,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1,
      float var2,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3,
      float var4,
      float var5,
      boolean var6
   ) {
      short var10001 = 22191;
      short var10002 = -6156;
      Intrinsics.checkNotNullParameter(var0, "entity");
      a(var0, var1, var2, var3, var4, var5, var6, null, 0.0F, 0.0F, false, false);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Entity var0,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1,
      float var2,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3,
      float var4,
      float var5
   ) {
      short var10001 = 22191;
      short var10002 = -6156;
      Intrinsics.checkNotNullParameter(var0, "entity");
      a(var0, var1, var2, var3, var4, var5, false, null, 0.0F, 0.0F, false, false);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Entity var0,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1,
      float var2,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3,
      float var4
   ) {
      short var10001 = 22191;
      short var10002 = -6156;
      Intrinsics.checkNotNullParameter(var0, "entity");
      a(var0, var1, var2, var3, var4, 0.0F, false, null, 0.0F, 0.0F, false, false);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Entity var0,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1,
      float var2,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3
   ) {
      short var10001 = 22191;
      short var10002 = -6156;
      Intrinsics.checkNotNullParameter(var0, "entity");
      a(var0, var1, var2, var3, 0.0F, 0.0F, false, null, 0.0F, 0.0F, false, false);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Entity var0, @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1, float var2
   ) {
      short var10001 = 22191;
      short var10002 = -6156;
      Intrinsics.checkNotNullParameter(var0, "entity");
      a(var0, var1, var2, null, 0.0F, 0.0F, false, null, 0.0F, 0.0F, false, false);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(@NotNull Entity var0, @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1) {
      short var10001 = 22191;
      short var10002 = -6156;
      Intrinsics.checkNotNullParameter(var0, "entity");
      a(var0, var1, 0.0F, null, 0.0F, 0.0F, false, null, 0.0F, 0.0F, false, false);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(@NotNull Entity var0) {
      short var10001 = 22191;
      short var10002 = -6156;
      Intrinsics.checkNotNullParameter(var0, "entity");
      a(var0, null, 0.0F, null, 0.0F, 0.0F, false, null, 0.0F, 0.0F, false, false);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static { char[] var20 = null; // PX-FIX hoist
        
       var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[11];
      int var3 = 0;
      String var2 = "\\&\\m´_éù:aÇN\u001d\búl]ùð¡\u00963Ö\u008c\u0012½\u0003`É3Ë\u0019z !\u00012÷\u000e\u0099\u0003Þ\u008f\u00052\u0091ÂÉA\u0013MV~lþ\u008do\næïÒ¸Á9\u0096¿ù\u001fY\u0013óT©,\u0004\u00850\u000b\rÏ¯¼n¹c¯G\u001d\u008e\u00068\u0097\u0092\u0015xà\u000615³A\\j\rq,' è3cê\u0007gÎ\u008dd\u0005÷\u009dzHV";
      int var4 = "\\&\\m´_éù:aÇN\u001d\búl]ùð¡\u00963Ö\u008c\u0012½\u0003`É3Ë\u0019z !\u00012÷\u000e\u0099\u0003Þ\u008f\u00052\u0091ÂÉA\u0013MV~lþ\u008do\næïÒ¸Á9\u0096¿ù\u001fY\u0013óT©,\u0004\u00850\u000b\rÏ¯¼n¹c¯G\u001d\u008e\u00068\u0097\u0092\u0015xà\u000615³A\\j\rq,' è3cê\u0007gÎ\u008dd\u0005÷\u009dzHV"
         .length();
      char var1 = 24;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 124;
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
                     case 0 -> 22;
                     case 1 -> 22;
                     case 2 -> 25;
                     case 3 -> 28;
                     case 4 -> 116;
                     case 5 -> 15;
                     default -> 33;
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
                     b = new String[11];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIIIIlIlIIlIIllllllIlllllIlIlIIIIIIIIlIlllllIlIIlIlIIlIIIIIIIlllIIIlllIIIlllllIlIIlII();
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new Int2ObjectOpenHashMap();
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new Int2ObjectOpenHashMap();
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new Object();
                     me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        .a(IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
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

                  var2 = "?B\u0088\u008b{ wîã\u008147]\u0011«ËåÍ\u009a,\u00803\u008f¬\u0012 nù¬]\u0019";
                  var4 = "?B\u0088\u008b{ wîã\u008147]\u0011«ËåÍ\u009a,\u00803\u008f¬\u0012 nù¬]\u0019".length();
                  var1 = '\r';
                  var8 = -1;
            }

            var10000 = 94;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 22185) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 191;
            case 1 -> 174;
            case 2 -> 229;
            case 3 -> 230;
            case 4 -> 202;
            case 5 -> 101;
            case 6 -> 223;
            case 7 -> 74;
            case 8 -> 32;
            case 9 -> 86;
            case 10 -> 78;
            case 11 -> 178;
            case 12 -> 70;
            case 13 -> 180;
            case 14 -> 160;
            case 15 -> 71;
            case 16 -> 10;
            case 17 -> 63;
            case 18 -> 163;
            case 19 -> 18;
            case 20 -> 136;
            case 21 -> 9;
            case 22 -> 134;
            case 23 -> 39;
            case 24 -> 79;
            case 25 -> 143;
            case 26 -> 53;
            case 27 -> 22;
            case 28 -> 157;
            case 29 -> 217;
            case 30 -> 204;
            case 31 -> 235;
            case 32 -> 255;
            case 33 -> 226;
            case 34 -> 120;
            case 35 -> 166;
            case 36 -> 254;
            case 37 -> 242;
            case 38 -> 181;
            case 39 -> 93;
            case 40 -> 158;
            case 41 -> 154;
            case 42 -> 241;
            case 43 -> 237;
            case 44 -> 231;
            case 45 -> 72;
            case 46 -> 122;
            case 47 -> 222;
            case 48 -> 189;
            case 49 -> 211;
            case 50 -> 112;
            case 51 -> 210;
            case 52 -> 97;
            case 53 -> 169;
            case 54 -> 159;
            case 55 -> 220;
            case 56 -> 190;
            case 57 -> 113;
            case 58 -> 125;
            case 59 -> 54;
            case 60 -> 49;
            case 61 -> 33;
            case 62 -> 66;
            case 63 -> 215;
            case 64 -> 227;
            case 65 -> 23;
            case 66 -> 21;
            case 67 -> 83;
            case 68 -> 109;
            case 69 -> 36;
            case 70 -> 105;
            case 71 -> 148;
            case 72 -> 198;
            case 73 -> 206;
            case 74 -> 162;
            case 75 -> 13;
            case 76 -> 73;
            case 77 -> 87;
            case 78 -> 193;
            case 79 -> 0;
            case 80 -> 11;
            case 81 -> 58;
            case 82 -> 60;
            case 83 -> 28;
            case 84 -> 192;
            case 85 -> 89;
            case 86 -> 77;
            case 87 -> 76;
            case 88 -> 2;
            case 89 -> 196;
            case 90 -> 96;
            case 91 -> 182;
            case 92 -> 129;
            case 93 -> 30;
            case 94 -> 245;
            case 95 -> 203;
            case 96 -> 194;
            case 97 -> 238;
            case 98 -> 173;
            case 99 -> 48;
            case 100 -> 249;
            case 101 -> 145;
            case 102 -> 19;
            case 103 -> 51;
            case 104 -> 52;
            case 105 -> 75;
            case 106 -> 167;
            case 107 -> 168;
            case 108 -> 161;
            case 109 -> 216;
            case 110 -> 177;
            case 111 -> 176;
            case 112 -> 119;
            case 113 -> 140;
            case 114 -> 253;
            case 115 -> 4;
            case 116 -> 147;
            case 117 -> 185;
            case 118 -> 209;
            case 119 -> 131;
            case 120 -> 110;
            case 121 -> 130;
            case 122 -> 117;
            case 123 -> 50;
            case 124 -> 239;
            case 125 -> 94;
            case 126 -> 135;
            case 127 -> 35;
            case 128 -> 244;
            case 129 -> 107;
            case 130 -> 195;
            case 131 -> 7;
            case 132 -> 29;
            case 133 -> 62;
            case 134 -> 199;
            case 135 -> 106;
            case 136 -> 47;
            case 137 -> 84;
            case 138 -> 99;
            case 139 -> 240;
            case 140 -> 92;
            case 141 -> 59;
            case 142 -> 213;
            case 143 -> 102;
            case 144 -> 88;
            case 145 -> 55;
            case 146 -> 91;
            case 147 -> 41;
            case 148 -> 65;
            case 149 -> 250;
            case 150 -> 67;
            case 151 -> 251;
            case 152 -> 81;
            case 153 -> 1;
            case 154 -> 214;
            case 155 -> 246;
            case 156 -> 138;
            case 157 -> 69;
            case 158 -> 137;
            case 159 -> 165;
            case 160 -> 121;
            case 161 -> 46;
            case 162 -> 164;
            case 163 -> 100;
            case 164 -> 152;
            case 165 -> 123;
            case 166 -> 243;
            case 167 -> 212;
            case 168 -> 127;
            case 169 -> 25;
            case 170 -> 200;
            case 171 -> 133;
            case 172 -> 188;
            case 173 -> 146;
            case 174 -> 98;
            case 175 -> 118;
            case 176 -> 221;
            case 177 -> 170;
            case 178 -> 236;
            case 179 -> 17;
            case 180 -> 12;
            case 181 -> 104;
            case 182 -> 219;
            case 183 -> 85;
            case 184 -> 3;
            case 185 -> 207;
            case 186 -> 68;
            case 187 -> 252;
            case 188 -> 40;
            case 189 -> 183;
            case 190 -> 201;
            case 191 -> 187;
            case 192 -> 142;
            case 193 -> 232;
            case 194 -> 218;
            case 195 -> 153;
            case 196 -> 24;
            case 197 -> 111;
            case 198 -> 228;
            case 199 -> 141;
            case 200 -> 126;
            case 201 -> 57;
            case 202 -> 56;
            case 203 -> 61;
            case 204 -> 44;
            case 205 -> 184;
            case 206 -> 156;
            case 207 -> 108;
            case 208 -> 132;
            case 209 -> 116;
            case 210 -> 37;
            case 211 -> 114;
            case 212 -> 115;
            case 213 -> 139;
            case 214 -> 171;
            case 215 -> 90;
            case 216 -> 27;
            case 217 -> 144;
            case 218 -> 150;
            case 219 -> 8;
            case 220 -> 38;
            case 221 -> 20;
            case 222 -> 149;
            case 223 -> 172;
            case 224 -> 5;
            case 225 -> 16;
            case 226 -> 175;
            case 227 -> 43;
            case 228 -> 233;
            case 229 -> 34;
            case 230 -> 225;
            case 231 -> 82;
            case 232 -> 234;
            case 233 -> 197;
            case 234 -> 205;
            case 235 -> 95;
            case 236 -> 124;
            case 237 -> 179;
            case 238 -> 103;
            case 239 -> 45;
            case 240 -> 248;
            case 241 -> 224;
            case 242 -> 6;
            case 243 -> 247;
            case 244 -> 80;
            case 245 -> 26;
            case 246 -> 186;
            case 247 -> 128;
            case 248 -> 15;
            case 249 -> 155;
            case 250 -> 42;
            case 251 -> 31;
            case 252 -> 14;
            case 253 -> 64;
            case 254 -> 151;
            default -> 208;
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

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @NotNull
      private Entity IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private float IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private float IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private float IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private boolean IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private int lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      private float IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      private float llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      private boolean lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      private boolean lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         @NotNull Entity var1,
         int var2,
         float var3,
         int var4,
         float var5,
         float var6,
         boolean var7,
         int var8,
         float var9,
         float var10,
         boolean var11,
         boolean var12
      ) {
         short var10001 = -403;
         short var10002 = 26380;
         Intrinsics.checkNotNullParameter(var1, "entity");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var6;
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var7;
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var8;
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var9;
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var10;
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var11;
         this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var12;
      }

      @NotNull
      public final Entity a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final void a(@NotNull Entity var1) {
         short var10001 = -404;
         short var10002 = 1602;
         Intrinsics.checkNotNullParameter(var1, "<set-?>");
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      }

      public final int b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final void a(int var1) {
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      }

      public final float c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final void a(float var1) {
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
      }

      public final int d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final void b(int var1) {
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var1;
      }

      public final float e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final void b(float var1) {
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
      }

      public final float f() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final void c(float var1) {
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
      }

      public final boolean g() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      public final void a(boolean var1) {
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var1;
      }

      public final int h() {
         return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      public final void c(int var1) {
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var1;
      }

      public final float i() {
         return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      public final void d(float var1) {
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var1;
      }

      public final float j() {
         return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }

      public final void e(float var1) {
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var1;
      }

      public final boolean k() {
         return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      }

      public final void b(boolean var1) {
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var1;
      }

      public final boolean l() {
         return this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      }

      public final void c(boolean var1) {
         this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var1;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: {
         String[] var5 = new String[2];
         int var3 = 0;
         String var2 = "\u0016\u008f\nº\u0017Ðo\u0006{\u0005ÄH¤v";
         int var4 = "\u0016\u008f\nº\u0017Ðo\u0006{\u0005ÄH¤v".length();
         char var1 = 7;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 118;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 118;
                  var10006 = var6;
               } else {
                  var13 = 118;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 118;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 102;
                     case 1 -> 116;
                     case 2 -> 98;
                     case 3 -> 20;
                     case 4 -> 70;
                     case 5 -> 120;
                     default -> 75;
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
         int var2 = (var0 ^ -404) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 96;
               case 1 -> 222;
               case 2 -> 213;
               case 3 -> 172;
               case 4 -> 56;
               case 5 -> 14;
               case 6 -> 8;
               case 7 -> 114;
               case 8 -> 175;
               case 9 -> 142;
               case 10 -> 246;
               case 11 -> 252;
               case 12 -> 23;
               case 13 -> 62;
               case 14 -> 63;
               case 15 -> 255;
               case 16 -> 21;
               case 17 -> 244;
               case 18 -> 111;
               case 19 -> 197;
               case 20 -> 39;
               case 21 -> 80;
               case 22 -> 237;
               case 23 -> 64;
               case 24 -> 232;
               case 25 -> 16;
               case 26 -> 78;
               case 27 -> 123;
               case 28 -> 186;
               case 29 -> 248;
               case 30 -> 84;
               case 31 -> 93;
               case 32 -> 106;
               case 33 -> 220;
               case 34 -> 26;
               case 35 -> 253;
               case 36 -> 76;
               case 37 -> 113;
               case 38 -> 201;
               case 39 -> 158;
               case 40 -> 43;
               case 41 -> 212;
               case 42 -> 173;
               case 43 -> 199;
               case 44 -> 51;
               case 45 -> 49;
               case 46 -> 166;
               case 47 -> 165;
               case 48 -> 219;
               case 49 -> 85;
               case 50 -> 65;
               case 51 -> 46;
               case 52 -> 228;
               case 53 -> 3;
               case 54 -> 87;
               case 55 -> 11;
               case 56 -> 247;
               case 57 -> 27;
               case 58 -> 110;
               case 59 -> 29;
               case 60 -> 20;
               case 61 -> 31;
               case 62 -> 230;
               case 63 -> 251;
               case 64 -> 124;
               case 65 -> 202;
               case 66 -> 200;
               case 67 -> 210;
               case 68 -> 9;
               case 69 -> 207;
               case 70 -> 36;
               case 71 -> 121;
               case 72 -> 42;
               case 73 -> 151;
               case 74 -> 192;
               case 75 -> 57;
               case 76 -> 149;
               case 77 -> 136;
               case 78 -> 146;
               case 79 -> 250;
               case 80 -> 81;
               case 81 -> 150;
               case 82 -> 2;
               case 83 -> 184;
               case 84 -> 18;
               case 85 -> 70;
               case 86 -> 6;
               case 87 -> 83;
               case 88 -> 4;
               case 89 -> 226;
               case 90 -> 140;
               case 91 -> 224;
               case 92 -> 33;
               case 93 -> 118;
               case 94 -> 44;
               case 95 -> 0;
               case 96 -> 10;
               case 97 -> 234;
               case 98 -> 47;
               case 99 -> 143;
               case 100 -> 58;
               case 101 -> 157;
               case 102 -> 215;
               case 103 -> 171;
               case 104 -> 134;
               case 105 -> 115;
               case 106 -> 164;
               case 107 -> 254;
               case 108 -> 170;
               case 109 -> 144;
               case 110 -> 221;
               case 111 -> 1;
               case 112 -> 249;
               case 113 -> 40;
               case 114 -> 25;
               case 115 -> 132;
               case 116 -> 95;
               case 117 -> 74;
               case 118 -> 242;
               case 119 -> 34;
               case 120 -> 79;
               case 121 -> 160;
               case 122 -> 59;
               case 123 -> 125;
               case 124 -> 204;
               case 125 -> 48;
               case 126 -> 108;
               case 127 -> 159;
               case 128 -> 245;
               case 129 -> 181;
               case 130 -> 156;
               case 131 -> 176;
               case 132 -> 130;
               case 133 -> 231;
               case 134 -> 88;
               case 135 -> 112;
               case 136 -> 196;
               case 137 -> 17;
               case 138 -> 102;
               case 139 -> 119;
               case 140 -> 169;
               case 141 -> 205;
               case 142 -> 227;
               case 143 -> 137;
               case 144 -> 235;
               case 145 -> 198;
               case 146 -> 104;
               case 147 -> 167;
               case 148 -> 133;
               case 149 -> 105;
               case 150 -> 187;
               case 151 -> 128;
               case 152 -> 141;
               case 153 -> 145;
               case 154 -> 126;
               case 155 -> 214;
               case 156 -> 77;
               case 157 -> 179;
               case 158 -> 178;
               case 159 -> 147;
               case 160 -> 209;
               case 161 -> 28;
               case 162 -> 161;
               case 163 -> 122;
               case 164 -> 180;
               case 165 -> 188;
               case 166 -> 243;
               case 167 -> 194;
               case 168 -> 174;
               case 169 -> 24;
               case 170 -> 86;
               case 171 -> 217;
               case 172 -> 12;
               case 173 -> 82;
               case 174 -> 189;
               case 175 -> 75;
               case 176 -> 155;
               case 177 -> 50;
               case 178 -> 195;
               case 179 -> 101;
               case 180 -> 55;
               case 181 -> 229;
               case 182 -> 223;
               case 183 -> 139;
               case 184 -> 148;
               case 185 -> 32;
               case 186 -> 131;
               case 187 -> 107;
               case 188 -> 53;
               case 189 -> 206;
               case 190 -> 185;
               case 191 -> 66;
               case 192 -> 154;
               case 193 -> 129;
               case 194 -> 7;
               case 195 -> 45;
               case 196 -> 103;
               case 197 -> 100;
               case 198 -> 68;
               case 199 -> 225;
               case 200 -> 52;
               case 201 -> 54;
               case 202 -> 92;
               case 203 -> 120;
               case 204 -> 208;
               case 205 -> 97;
               case 206 -> 177;
               case 207 -> 236;
               case 208 -> 60;
               case 209 -> 191;
               case 210 -> 98;
               case 211 -> 109;
               case 212 -> 216;
               case 213 -> 38;
               case 214 -> 183;
               case 215 -> 61;
               case 216 -> 69;
               case 217 -> 233;
               case 218 -> 73;
               case 219 -> 117;
               case 220 -> 37;
               case 221 -> 190;
               case 222 -> 99;
               case 223 -> 193;
               case 224 -> 138;
               case 225 -> 203;
               case 226 -> 238;
               case 227 -> 94;
               case 228 -> 152;
               case 229 -> 19;
               case 230 -> 13;
               case 231 -> 5;
               case 232 -> 182;
               case 233 -> 71;
               case 234 -> 241;
               case 235 -> 90;
               case 236 -> 72;
               case 237 -> 89;
               case 238 -> 239;
               case 239 -> 153;
               case 240 -> 168;
               case 241 -> 218;
               case 242 -> 67;
               case 243 -> 116;
               case 244 -> 41;
               case 245 -> 22;
               case 246 -> 162;
               case 247 -> 135;
               case 248 -> 30;
               case 249 -> 240;
               case 250 -> 91;
               case 251 -> 127;
               case 252 -> 15;
               case 253 -> 211;
               case 254 -> 35;
               default -> 163;
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
  // PX-FIX synth restored from jar bytecode: Kotlin default-argument bridge
  public void a(net.minecraft.world.entity.Entity p0, me.octo.client.llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll p1, float p2, me.octo.client.llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll p3, float p4, float p5, boolean p6, me.octo.client.llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll p7, float p8, float p9, boolean p10, boolean p11, int p12, java.lang.Object p13) {
    a(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
  }
}
