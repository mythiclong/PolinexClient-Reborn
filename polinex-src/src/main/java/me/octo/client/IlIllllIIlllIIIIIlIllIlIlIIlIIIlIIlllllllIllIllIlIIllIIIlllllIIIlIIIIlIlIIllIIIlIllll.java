package me.octo.client;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;

public final class IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll
   extends IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll {
   public static int var13 = 0; // PX-FIX (retyped int) missing field v2
   
   private final float IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   private float IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   private float lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   private float lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
   @NotNull
   private Set<String> IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
   private static String[] d;
   private static String[] e;

   public IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll(
      @NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var1,
      @NotNull IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var2,
      boolean var3
   ) {
      short var10001 = -14781;
      short var10002 = 31215;
      Intrinsics.checkNotNullParameter(var1, "resolution");
      var10001 = -14776;
      var10002 = 2836;
      Intrinsics.checkNotNullParameter(var2, "category");
      super(var1, var2, var3);
      this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = 20.0F;
      this.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = 20.0F;
      this.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI = 40.0F;
      this.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI = 48.0F;
      this.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl = new LinkedHashSet<>();
   }

   @Override
   protected float r() {
      return this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   }

   @Override
   public void a(@NotNull List<? extends IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl> var1) { Object var13 = null; // PX-FIX hoist
        
      Object var23 = null; // PX-FIX
      int[] var10000 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      short var10002 = -14769;
      short var10003 = -32673;
      Intrinsics.checkNotNullParameter(var1, "categories");
      int[] var2 = var10000;
      Collection var3 = var1;
      boolean var4 = false;
      this.a(var3.toArray(new IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl[0]));
      Arrays.sort(this.f(), IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll::a);
      this.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl.clear();
      Map var15 = new LinkedHashMap();
      IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl[] var16 = this.f();
      int var5 = 0;
      int var6 = var16.length;

      while (var5 < var6) {
         label51: {
            IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl var7 = var16[var5];
            IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var10 = var7.m();
            IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var22 = var10;
            if (var2 == null) {
               if (!(var10 instanceof IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI)) {
                  var23 = null;
                  break label51;
               }

               var22 = var10;
            }

            var23 = (IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI)var22;
         }

         if (var23 != null) {
            IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var8 =((IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI)( var23));
            String var9 = lllIIllIIlllIlIIlIlIIIllllllllllllllIIIIIlIlIIIIIIIIIlIlIlIlIIllllllllIllllIIIlIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(var8);
            boolean var12 = false;
             var13 = var15.get(var9);
            if (var13 == null) {
               boolean var14 = false;
               Set var21 = new LinkedHashSet();
               var15.put(var9, var21);
               var10000 = (int[])(Object)var21;
            } else {
               var10000 = (int[])var13;
            }

            ((Set)(Object)var10000).add(var8.am());
         }

         var5++;
         if (var2 != null) {
            break;
         }
      }

      Iterator var17 = var15.entrySet().iterator();

      while (true) {
         if (var17.hasNext()) {
            Entry var18 = (Entry)var17.next();
            String var19 = (String)var18.getKey();
            Set var20 = (Set)var18.getValue();
            if (var2 != null) {
               break;
            }

            int var25 = var20.size();
            if (var2 == null) {
               if (var25 > 1) {
                  continue;
               }

               this.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl.add(var19);
            }

            if (var2 == null) {
               continue;
            }
         }

         this.F();
         this.c(false);
         break;
      }
   }

   private final void K() {
      // Recovered from the original K()V bytecode. Builds the two-column layout map
      // consumed by the renderer for the macro/feature panel.
      this.B().clear();
      int[] marker = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      if (marker != null) {
         return;
      }

      float leftY = 0.0F;
      float rightY = 0.0F;
      String lastLabel = null;
      String lastGroup = null;
      boolean lastLabelHasSingleGroup = false;

      for (IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl category : this.f()) {
         IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll module = category.m();
         if (!(module instanceof IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI)) {
            continue;
         }
         IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI skill =
            (IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI)module;

         boolean hidden = false;
         try {
            String className = IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.a(
               new java.util.Random(
                  me.octo.client.utils.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.a(
                     me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
                        + ":"
                        + me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                        + ":13NNY5UCK5D!CK"
                  )
               )
            );
            Class<?> hiddenClass = Class.forName(
               "me.octo.client." + className,
               false,
               (ClassLoader)me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            );
            String fieldName = IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.a(
               new java.util.Random(
                  me.octo.client.utils.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.a(
                     me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
                        + ":"
                        + me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                        + ":L0RY1SC00L229428!@#"
                  )
               )
            );
            java.lang.reflect.Field hiddenField = hiddenClass.getDeclaredField(fieldName);
            hiddenField.setAccessible(true);
            Object hiddenValue = hiddenField.get(null);
            Intrinsics.checkNotNull(hiddenValue, "null cannot be cast to non-null type kotlin.Int");
            hidden = ((Integer)hiddenValue).intValue() == IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.b();
         } catch (Exception ignored) {
            // The original renderer treats a failed optional hidden-item lookup as not hidden.
         }

         if (!me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            && skill.c()
            && !hidden) {
            continue;
         }
         if (!skill.b()) {
            continue;
         }

         String label = lllIIllIIlllIlIIlIlIIIllllllllllllllIIIIIlIlIIIIIIIIIlIlIlIlIIllllllllIllllIIIlIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(skill);
         if (!Intrinsics.areEqual(label, lastLabel)) {
            boolean hasSingleGroup = this.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl.contains(label);
            float labelY = Math.max(leftY, rightY)
               + this.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI
               + (hasSingleGroup ? this.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI : 0.0F);
            leftY = labelY;
            rightY = labelY;
            lastLabel = label;
            lastGroup = null;
            lastLabelHasSingleGroup = hasSingleGroup;
         }

         String group = skill.am();
         if (!Intrinsics.areEqual(group, lastGroup)) {
            lastGroup = group;
            if (!lastLabelHasSingleGroup) {
               float groupY = Math.max(leftY, rightY)
                  + this.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
               leftY = groupY;
               rightY = groupY;
            }
         }

         boolean leftColumn = leftY <= rightY;
         float itemY = leftColumn ? leftY : rightY;
         this.B().put(skill.aj(), new kotlin.Pair<Boolean, Integer>(Boolean.valueOf(leftColumn), Integer.valueOf((int)itemY)));
         float itemHeight = (float)this.a((IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll)skill, category)
            + this.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
         if (leftColumn) {
            leftY += itemHeight;
         } else {
            rightY += itemHeight;
         }
      }

      this.c(true);
   }

   private final void a(float var1, float var2, float var3, String var4, float var5) { float var13 = 0.0f; // PX-FIX hoist
        
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .c()
         .a(0.7F);
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var7 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .A()
         .a(0.55F);
      float var8 = (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, var4, false, 2, null);
      float var9 = 14.0F;
      float var10 = (var1 + var2) / 2.0F;
      float var11 = var10 - var8 / 2.0F;
      float var12 = var10 + var8 / 2.0F;
       var13 = var3 + 9.0F;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(var5);
      this.a(var1, var13, var11 - var9, var13, var7);
      this.a(var12 + var9, var13, var2, var13, var7);
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, var4, var11, var3, var6, false, 16, null);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
   }

   private final void a(
      float var1,
      float var2,
      float var3,
      float var4,
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var5
   ) {
      float var7 = 3.0F;
      int[] var10000 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      float var8 = 4.0F;
      int[] var6 = var10000;
      float var9 = var7 + var8;
      float var10 = var1;

      while (var10 < var3) {
         float var11 = Math.min(var7, var3 - var10);
         float var12 = var11;
         float var10001 = 0.0F;
         if (var6 == null) {
            if (var11 <= 0.0F) {
               break;
            }

            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var10, var2, var11, 1.0F, var5, 0.0F);
            var12 = var10;
            var10001 = var9;
         }

         var10 = var12 + var10001;
         if (var6 != null) {
            break;
         }
      }
   }

   @Override
   public boolean a(@NotNull GuiGraphicsExtractor param1, int param2, int param3, float param4) {
      int[] pad = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      Intrinsics.checkNotNullParameter(param1, "context");
      long startNanos = System.nanoTime();
      float delta = kotlin.ranges.RangesKt.coerceIn((float)(startNanos - this.A()) / 1000000.0F, 0.0F, 50.0F);
      this.a(startNanos);
      int step = Math.max(1, (int)(delta / 16.0F * 1.33F));

      for (int i = 0; i < step; i++) {
         this.g().e();
      }

      if (!this.C()) {
         this.K();
      }

      this.b((IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII)null);
      int scroll = this.g().d();
      long nowMs = System.currentTimeMillis();
      int baseY = (int)this.p() + 15;
      String lastSub = null;
      String lastHover = null;
      this.t().clear();
      float x = this.o();
      float yTotal = this.o() + this.s() + this.r();
      int topY = baseY + scroll;
      int bottomY = baseY + scroll;
      long openTime = System.currentTimeMillis();
      boolean animating = this.z();
      if (this.z()) {
         this.b(false);
      }

      float panelX = this.k() + 5.0F;
      float panelY = this.l() + 5.0F;
      float panelW = this.a().e() - panelX - 5.0F;
      float panelH = this.n() - 10.0F;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(panelX, panelY, panelW, panelH);
      int drawnCount = 0;
      int index = 0;

      for (IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl cat : this.f()) {
         IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll obj = cat.m();
         if (!(obj instanceof IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI)) {
            continue;
         }

         IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI skill = (IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI)obj;
         boolean hidden = false;
         try {
         Class<?> clazz = Class.forName(
            "me.octo.client." + IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.a(new java.util.Random(me.octo.client.utils.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.a(me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
               + ":" + me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll + ":13NNY5UCK5D!CK"))),
            false,
            (ClassLoader)me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         );
         java.lang.reflect.Field reflectedField = clazz.getDeclaredField(
            IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.a(new java.util.Random(me.octo.client.utils.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.a(me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
               + ":" + me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll + ":L0RY1SC00L229428!@#")))
         );
         reflectedField.setAccessible(true);
         Object reflectedValue = reflectedField.get((Object)null);
         Intrinsics.checkNotNull(reflectedValue, "null cannot be cast to non-null type kotlin.Int");
         int reflectedInt = ((Integer)reflectedValue).intValue();
         if (reflectedInt == IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.b()) {
            hidden = true;
         }
         } catch (Exception varReflection) {
         }

         if (!me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII && skill.c() && !hidden) {
            continue;
         }

         if (!skill.b()) {
            continue;
         }

         llIlllIIIIlllllllIIllIIlIIllIlIIlIlllllIllIIIIIIIIlIIllllllIllIIIllIllIIIIlllllIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a((IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll)skill, nowMs);
         String name = skill.am();
         boolean draw = false;
         int hoverChanged = 0;
         String tooltip = me.octo.client.lllIIllIIlllIlIIlIlIIIllllllllllllllIIIIIlIlIIIIIIIIIlIlIlIlIIllllllllIllllIIIlIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(skill);
         kotlin.Pair<Boolean, Integer> pair = this.B().get(skill.aj());
         if (pair == null) {
            pair = new kotlin.Pair<Boolean, Integer>(Boolean.valueOf(topY <= bottomY), Integer.valueOf(0));
         }

         boolean firstColumn = pair.getFirst().booleanValue();
         float rowY = firstColumn ? x : yTotal;
         float pairY = (float)(baseY + ((Number)pair.getSecond()).intValue());
         int rowTop = (int)(pairY + (float)scroll);
         if (!Intrinsics.areEqual(tooltip, lastHover)) {
            hoverChanged = 1;
            lastHover = tooltip;
            lastSub = null;
         }

         if (!Intrinsics.areEqual(name, lastSub)) {
            index = 0;
            draw = true;
            this.t().put(name, Integer.valueOf(rowTop - 14));
            lastSub = name;
            drawnCount++;
         }

         boolean inHiddenSet = this.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl.contains(tooltip);
         if (draw && !inHiddenSet) {
            String subKey = "sub_" + name;
            float subX = pairY;
            Map<String, IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl> subMap = this.w();
            IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl subAnim = subMap.get(subKey);
            if (subAnim == null) {
               subAnim = new IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl(subX, rowY, subX, rowY, nowMs, 0L, 0L, 64, (kotlin.jvm.internal.DefaultConstructorMarker)null);
               subMap.put(subKey, subAnim);
            }

            IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl sub = subAnim;
            sub.a(subX, rowY, nowMs, 0L);
            int subBottom = (int)(sub.f(nowMs) + (float)scroll);
            if (param4 > 0.0F) {
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.g();
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(param4 * 0.7F);
               float labelY = (float)(subBottom - 26);
               float barY = labelY + 9.0F;
               String upper = name.toUpperCase(java.util.Locale.ROOT);
               Intrinsics.checkNotNullExpressionValue(upper, "toUpperCase(...)");
               float textWidth = (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, upper, false, 2, (Object)null);
               me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, upper, (double)x, (double)labelY, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(), false, 16, (Object)null);
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(x + textWidth + 12.0F, barY, yTotal + this.s() - (x + textWidth + 12.0F), 1.0F, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.A().a(0.6F), 0.5F);
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.h();
            }
         }

         if (hoverChanged != 0) {
            String skillKey = "skill_" + name;
            float skillX = pairY;
            Map<String, IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl> skillMap = this.w();
            IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl skillAnim = skillMap.get(skillKey);
            if (skillAnim == null) {
               skillAnim = new IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl(skillX, x, skillX, x, nowMs, 0L, 0L, 64, (kotlin.jvm.internal.DefaultConstructorMarker)null);
               skillMap.put(skillKey, skillAnim);
            }

            IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl skillSlide = skillAnim;
            skillSlide.a(skillX, x, nowMs, 0L);
            int skillBottom = (int)(skillSlide.f(nowMs) + (float)scroll);
            if (param4 > 0.0F) {
               this.a(x, yTotal + this.s(), (float)(skillBottom - 46), tooltip, param4);
            }
         }

         IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl hoverAnim = this.v().get(skill.aj());
         if (hoverAnim == null) {
            hoverAnim = new IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl(pairY, rowY, pairY, rowY, nowMs, 0L, 0L, 64, (kotlin.jvm.internal.DefaultConstructorMarker)null);
            this.v().put(skill.aj(), hoverAnim);
         }

         hoverAnim.a(pairY, rowY, nowMs, 0L);
         float hoverF = hoverAnim.f(nowMs);
         float hoverG = hoverAnim.g(nowMs);
         float hoverH = hoverAnim.h(nowMs);
         int hoverTop = (int)(hoverF + (float)scroll);
         llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll bounds = this.a().a(hoverG, this.l(), hoverG + this.s(), this.l() + this.n());
         float alpha = param4;
         float fade = 1.0F;
         if (animating) {
            long delay = (long)drawnCount * 100L + (long)index * 50L;
            long elapsed = openTime - this.x() - delay;
            if (elapsed < 0L) {
               fade = 0.0F;
               alpha = 0.0F;
            } else if (elapsed < this.y()) {
               float ratio = me.octo.client.utils.player.IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.m((float)elapsed / (float)this.y());
               fade = ratio;
               alpha = param4 * ratio;
            }
         }

         boolean highlighted = fade > 0.9F && param4 > 0.9F;
         Integer selectedValue = IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().get(skill.aj());
         int selected;
         if (selectedValue != null) {
            selected = selectedValue.intValue();
         } else {
            int computed = cat.b(this.a());
            IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().put(skill.aj(), Integer.valueOf(computed));
            selected = computed;
         }

         int rowHeight = selected;
         if (!((float)(hoverTop + rowHeight) > this.l() + 5.0F && (float)hoverTop < this.l() + this.n() - 5.0F)) {
            int nextY = rowTop + rowHeight + 8;
            if (firstColumn) {
               topY = nextY;
            } else {
               bottomY = nextY;
            }

            index++;
            continue;
         }

         boolean mouseOver = (float)param2 >= hoverG
            && (float)param2 <= hoverG + this.s()
            && param3 >= hoverTop
            && param3 <= hoverTop + rowHeight
            && (float)param3 > this.l() + 5.0F
            && (float)param3 < this.l() + this.n() - 5.0F;
         me.octo.client.utils.llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll glow = this.u().get(skill.aj());
         if (glow == null) {
            glow = new me.octo.client.utils.llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll(200);
            this.u().put(skill.aj(), glow);
         }

         if (mouseOver && !me.octo.client.llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a()) {
            glow.a(1.0F);
         } else {
            glow.a(0.0F);
         }

         float glowSize = glow.e() * 10.0F;
         float centerX = hoverG + this.s() / 2.0F;
         float centerY = (float)hoverTop + (float)rowHeight / 2.0F;
         boolean expanding = hoverH < 0.999F;
         float pulse = 1.0F + glow.e() * 0.01F;
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.g();
         if (!expanding || glow.e() > 0.01F) {
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(centerX, centerY);
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(hoverH * pulse, hoverH * pulse);
         }

         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(-centerX, -centerY);
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(alpha);
         if (alpha > 0.0F) {
            var shadow = me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.j().b(0.92F).b(glowSize, glowSize, glowSize);
            float radius = me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.ar();
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(hoverG, (float)hoverTop, this.s(), (float)rowHeight, shadow, radius);
            var border = me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.y().a(0.35F + 0.45F * glow.e());
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(hoverG, (int)hoverTop, this.s(), (int)rowHeight, 1.0F, border, radius);
         }

         lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll result = cat.a(param1, bounds, hoverTop, param2, param3);
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.h();
         int resultOffset = result.a() - hoverTop;
         Integer storedOffset = IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().get(skill.aj());
         int previousOffset = storedOffset != null ? storedOffset.intValue() : 0;
         if (Math.abs(resultOffset - previousOffset) > 2) {
            IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().put(skill.aj(), Integer.valueOf(resultOffset));
            this.c(false);
         }

         if (!IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d().contains(skill.aj())) {
            ((java.util.Collection)IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d()).add(skill.aj());
            this.c(false);
         }

         if (highlighted && result.c() && (float)param3 > this.l() + 5.0F && (float)param3 < this.l() + this.n() - 5.0F) {
            this.b(result.b());
         }

         int afterY = rowTop + (result.a() - hoverTop) + 8;
         if (firstColumn) {
            topY = afterY;
         } else {
            bottomY = afterY;
         }

         index++;
      }

      int contentHeight = Math.max(topY, bottomY) - 30;
      this.a(-(int)(((float)(contentHeight - scroll) - (this.l() + this.n() - 10.0F)) + 30.0F));
      int listTop = (int)this.p() + 15;
      Integer maxValue = kotlin.collections.CollectionsKt.maxOrNull(this.t().values());
      if (maxValue != null) {
         int tallest = ((Number)maxValue).intValue();
         int unused = 0;
         int wanted = listTop - tallest + scroll;
         if (wanted < this.h()) {
            this.a(wanted);
         }
      }

      if (this.h() < 0) {
         if ((float)this.h() > this.g().h()) {
            this.g().a((float)this.h());
         }
      }

      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.i();
      boolean hasPlayer = this.j() != null;
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.b(new int[5]);
      }

      return hasPlayer;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n ()[I
      // 003: aload 1
      // 004: sipush -14782
      // 007: sipush 360
      // 00a: pop2
      // 00b: ldc_w "context"
      // 00e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 011: invokestatic java/lang/System.nanoTime ()J
      // 014: lstore 6
      // 016: lload 6
      // 018: aload 0
      // 019: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.A ()J
      // 01c: lsub
      // 01d: l2f
      // 01e: ldc_w 1000000.0
      // 021: fdiv
      // 022: fconst_0
      // 023: ldc_w 50.0
      // 026: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 029: fstore 8
      // 02b: aload 0
      // 02c: lload 6
      // 02e: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (J)V
      // 031: astore 5
      // 033: bipush 1
      // 034: istore 10
      // 036: fload 8
      // 038: ldc_w 16.0
      // 03b: fdiv
      // 03c: ldc_w 1.33
      // 03f: fmul
      // 040: f2i
      // 041: istore 11
      // 043: iload 10
      // 045: iload 11
      // 047: invokestatic java/lang/Math.max (II)I
      // 04a: istore 9
      // 04c: bipush 0
      // 04d: istore 10
      // 04f: iload 10
      // 051: iload 9
      // 053: if_icmpge 079
      // 056: iload 10
      // 058: istore 11
      // 05a: bipush 0
      // 05b: istore 12
      // 05d: aload 0
      // 05e: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.g ()Lme/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll;
      // 061: invokevirtual me/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll.e ()F
      // 064: pop
      // 065: iinc 10 1
      // 068: aload 5
      // 06a: ifnonnull 0a5
      // 06d: aload 5
      // 06f: ifnull 04f
      // 072: goto 079
      // 075: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 078: athrow
      // 079: aload 0
      // 07a: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.C ()Z
      // 07d: aload 5
      // 07f: ifnonnull 0a3
      // 082: ifne 097
      // 085: goto 08c
      // 088: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08b: athrow
      // 08c: aload 0
      // 08d: invokespecial me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.K ()V
      // 090: goto 097
      // 093: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 096: athrow
      // 097: aload 0
      // 098: aconst_null
      // 099: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.b (Lme/octo/client/IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII;)V
      // 09c: aload 0
      // 09d: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.g ()Lme/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll;
      // 0a0: invokevirtual me/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll.d ()I
      // 0a3: istore 10
      // 0a5: invokestatic java/lang/System.currentTimeMillis ()J
      // 0a8: lstore 11
      // 0aa: aload 0
      // 0ab: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.p ()F
      // 0ae: f2i
      // 0af: bipush 15
      // 0b1: iadd
      // 0b2: istore 13
      // 0b4: aconst_null
      // 0b5: astore 14
      // 0b7: aconst_null
      // 0b8: astore 15
      // 0ba: aload 0
      // 0bb: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.t ()Ljava/util/Map;
      // 0be: invokeinterface java/util/Map.clear ()V 1
      // 0c3: aload 0
      // 0c4: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.o ()F
      // 0c7: fstore 16
      // 0c9: aload 0
      // 0ca: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.o ()F
      // 0cd: aload 0
      // 0ce: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.s ()F
      // 0d1: fadd
      // 0d2: aload 0
      // 0d3: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.r ()F
      // 0d6: fadd
      // 0d7: fstore 17
      // 0d9: iload 13
      // 0db: iload 10
      // 0dd: iadd
      // 0de: istore 18
      // 0e0: iload 13
      // 0e2: iload 10
      // 0e4: iadd
      // 0e5: istore 19
      // 0e7: invokestatic java/lang/System.currentTimeMillis ()J
      // 0ea: lstore 20
      // 0ec: aload 0
      // 0ed: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.z ()Z
      // 0f0: istore 22
      // 0f2: aload 0
      // 0f3: aload 5
      // 0f5: ifnonnull 112
      // 0f8: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.z ()Z
      // 0fb: ifeq 111
      // 0fe: goto 105
      // 101: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 104: athrow
      // 105: aload 0
      // 106: bipush 0
      // 107: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.b (Z)V
      // 10a: goto 111
      // 10d: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 110: athrow
      // 111: aload 0
      // 112: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.k ()F
      // 115: bipush 5
      // 116: i2f
      // 117: fadd
      // 118: fstore 23
      // 11a: aload 0
      // 11b: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.l ()F
      // 11e: bipush 5
      // 11f: i2f
      // 120: fadd
      // 121: fstore 24
      // 123: aload 0
      // 124: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a ()Lme/octo/client/llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll;
      // 127: invokevirtual me/octo/client/llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.e ()F
      // 12a: fload 23
      // 12c: fsub
      // 12d: bipush 5
      // 12e: i2f
      // 12f: fsub
      // 130: fstore 25
      // 132: aload 0
      // 133: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.n ()F
      // 136: bipush 10
      // 138: i2f
      // 139: fsub
      // 13a: fstore 26
      // 13c: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
      // 13f: fload 23
      // 141: fload 24
      // 143: fload 25
      // 145: fload 26
      // 147: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFF)V
      // 14a: bipush 0
      // 14b: istore 27
      // 14d: bipush 0
      // 14e: istore 28
      // 150: aload 0
      // 151: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.f ()[Lme/octo/client/IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl;
      // 154: astore 29
      // 156: bipush 0
      // 157: istore 30
      // 159: aload 29
      // 15b: arraylength
      // 15c: istore 31
      // 15e: iload 30
      // 160: iload 31
      // 162: if_icmpge bf1
      // 165: aload 29
      // 167: iload 30
      // 169: aaload
      // 16a: astore 32
      // 16c: aload 32
      // 16e: invokeinterface me/octo/client/IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.m ()Lme/octo/client/IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll; 1
      // 173: astore 35
      // 175: aload 35
      // 177: aload 5
      // 179: ifnonnull 197
      // 17c: instanceof me/octo/client/IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI
      // 17f: aload 5
      // 181: ifnonnull bfb
      // 184: goto 18b
      // 187: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18a: athrow
      // 18b: ifeq 19d
      // 18e: goto 195
      // 191: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 194: athrow
      // 195: aload 35
      // 197: checkcast me/octo/client/IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI
      // 19a: goto 19e
      // 19d: aconst_null
      // 19e: dup
      // 19f: ifnonnull 1aa
      // 1a2: pop
      // 1a3: goto be9
      // 1a6: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a9: athrow
      // 1aa: astore 33
      // 1ac: bipush 0
      // 1ad: istore 34
      // 1af: nop
      // 1b0: new java/util/Random
      // 1b3: dup
      // 1b4: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll J
      // 1b7: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Ljava/lang/String;
      // 1ba: ldc ":"
      // 1bc: swap
      // 1bd: sipush -14779
      // 1c0: sipush 7215
      // 1c3: pop2
      // 1c4: ldc ":13NNY5UCK5D!CK"
      // 1c6: invokedynamic makeConcatWithConstants (JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001" ]
      // 1cb: invokestatic me/octo/client/utils/IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.a (Ljava/lang/String;)J
      // 1ce: invokespecial java/util/Random.<init> (J)V
      // 1d1: invokestatic me/octo/client/IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.a (Ljava/util/Random;)Ljava/lang/String;
      // 1d4: sipush -14771
      // 1d7: sipush -17812
      // 1da: pop2
      // 1db: ldc_w "me.octo.client."
      // 1de: swap
      // 1df: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 1e4: bipush 0
      // 1e5: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 1e8: checkcast java/lang/ClassLoader
      // 1eb: invokestatic java/lang/Class.forName (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
      // 1ee: astore 35
      // 1f0: aload 35
      // 1f2: new java/util/Random
      // 1f5: dup
      // 1f6: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll J
      // 1f9: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Ljava/lang/String;
      // 1fc: ldc ":"
      // 1fe: swap
      // 1ff: sipush -14770
      // 202: sipush -20586
      // 205: pop2
      // 206: ldc_w ":L0RY1SC00L229428!@#"
      // 209: invokedynamic makeConcatWithConstants (JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001" ]
      // 20e: invokestatic me/octo/client/utils/IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.a (Ljava/lang/String;)J
      // 211: invokespecial java/util/Random.<init> (J)V
      // 214: invokestatic me/octo/client/IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.a (Ljava/util/Random;)Ljava/lang/String;
      // 217: invokevirtual java/lang/Class.getDeclaredField (Ljava/lang/String;)Ljava/lang/reflect/Field;
      // 21a: astore 36
      // 21c: aload 36
      // 21e: bipush 1
      // 21f: invokevirtual java/lang/reflect/Field.setAccessible (Z)V
      // 222: aload 36
      // 224: aconst_null
      // 225: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 228: dup
      // 229: sipush -14775
      // 22c: sipush 17143
      // 22f: pop2
      // 230: ldc_w "null cannot be cast to non-null type kotlin.Int"
      // 233: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
      // 236: checkcast java/lang/Integer
      // 239: invokevirtual java/lang/Integer.intValue ()I
      // 23c: istore 37
      // 23e: iload 37
      // 240: aload 5
      // 242: ifnonnull 25d
      // 245: invokestatic me/octo/client/IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.b ()I
      // 248: if_icmpne 25a
      // 24b: goto 252
      // 24e: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 251: athrow
      // 252: bipush 1
      // 253: istore 34
      // 255: goto 25a
      // 258: astore 35
      // 25a: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Z
      // 25d: aload 5
      // 25f: ifnonnull 2b7
      // 262: ifne 29f
      // 265: goto 26c
      // 268: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26b: athrow
      // 26c: aload 33
      // 26e: invokevirtual me/octo/client/IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI.c ()Z
      // 271: aload 5
      // 273: ifnonnull 2b7
      // 276: goto 27d
      // 279: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27c: athrow
      // 27d: ifeq 29f
      // 280: goto 287
      // 283: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 286: athrow
      // 287: iload 34
      // 289: aload 5
      // 28b: ifnonnull 2b7
      // 28e: goto 295
      // 291: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 294: athrow
      // 295: ifeq be9
      // 298: goto 29f
      // 29b: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29e: athrow
      // 29f: aload 33
      // 2a1: aload 5
      // 2a3: ifnonnull 2cc
      // 2a6: goto 2ad
      // 2a9: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ac: athrow
      // 2ad: invokevirtual me/octo/client/IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI.b ()Z
      // 2b0: goto 2b7
      // 2b3: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b6: athrow
      // 2b7: ifne 2bd
      // 2ba: goto be9
      // 2bd: getstatic me/octo/client/llIlllIIIIlllllllIIllIIlIIllIlIIlIlllllIllIIIIIIIIlIIllllllIllIIIllIllIIIIlllllIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llIlllIIIIlllllllIIllIIlIIllIlIIlIlllllIllIIIIIIIIlIIllllllIllIIIllIllIIIIlllllIIlIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 2c0: aload 33
      // 2c2: checkcast me/octo/client/IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll
      // 2c5: lload 11
      // 2c7: invokevirtual me/octo/client/llIlllIIIIlllllllIIllIIlIIllIlIIlIlllllIllIIIIIIIIlIIllllllIllIIIllIllIIIIlllllIIlIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lme/octo/client/IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll;J)V
      // 2ca: aload 33
      // 2cc: invokevirtual me/octo/client/IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI.am ()Ljava/lang/String;
      // 2cf: astore 35
      // 2d1: bipush 0
      // 2d2: istore 36
      // 2d4: bipush 0
      // 2d5: istore 37
      // 2d7: getstatic me/octo/client/lllIIllIIlllIlIIlIlIIIllllllllllllllIIIIIlIlIIIIIIIIIlIlIlIlIIllllllllIllllIIIlIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lllIIllIIlllIlIIlIlIIIllllllllllllllIIIIIlIlIIIIIIIIIlIlIlIlIIllllllllIllllIIIlIIlllI;
      // 2da: aload 33
      // 2dc: invokevirtual me/octo/client/lllIIllIIlllIlIIlIlIIIllllllllllllllIIIIIlIlIIIIIIIIIlIlIlIlIIllllllllIllllIIIlIIlllI.a (Lme/octo/client/IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI;)Ljava/lang/String;
      // 2df: astore 38
      // 2e1: aload 5
      // 2e3: ifnonnull 30a
      // 2e6: aload 0
      // 2e7: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.B ()Ljava/util/Map;
      // 2ea: aload 33
      // 2ec: invokevirtual me/octo/client/IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI.aj ()Ljava/lang/String;
      // 2ef: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2f4: checkcast kotlin/Pair
      // 2f7: dup
      // 2f8: ifnonnull 328
      // 2fb: goto 302
      // 2fe: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 301: athrow
      // 302: pop
      // 303: goto 30a
      // 306: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 309: athrow
      // 30a: new kotlin/Pair
      // 30d: dup
      // 30e: iload 18
      // 310: iload 19
      // 312: if_icmpgt 31d
      // 315: bipush 1
      // 316: goto 31e
      // 319: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31c: athrow
      // 31d: bipush 0
      // 31e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 321: bipush 0
      // 322: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 325: invokespecial kotlin/Pair.<init> (Ljava/lang/Object;Ljava/lang/Object;)V
      // 328: astore 39
      // 32a: aload 39
      // 32c: invokevirtual kotlin/Pair.getFirst ()Ljava/lang/Object;
      // 32f: checkcast java/lang/Boolean
      // 332: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 335: istore 40
      // 337: iload 40
      // 339: ifeq 345
      // 33c: fload 16
      // 33e: goto 347
      // 341: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 344: athrow
      // 345: fload 17
      // 347: fstore 41
      // 349: iload 13
      // 34b: aload 39
      // 34d: invokevirtual kotlin/Pair.getSecond ()Ljava/lang/Object;
      // 350: checkcast java/lang/Number
      // 353: invokevirtual java/lang/Number.intValue ()I
      // 356: iadd
      // 357: i2f
      // 358: fstore 42
      // 35a: fload 42
      // 35c: iload 10
      // 35e: i2f
      // 35f: fadd
      // 360: f2i
      // 361: istore 43
      // 363: aload 38
      // 365: aload 15
      // 367: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 36a: aload 5
      // 36c: ifnonnull 38a
      // 36f: ifne 383
      // 372: goto 379
      // 375: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 378: athrow
      // 379: bipush 1
      // 37a: istore 37
      // 37c: aload 38
      // 37e: astore 15
      // 380: aconst_null
      // 381: astore 14
      // 383: aload 35
      // 385: aload 14
      // 387: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 38a: aload 5
      // 38c: ifnonnull 3d0
      // 38f: ifne 3c5
      // 392: goto 399
      // 395: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 398: athrow
      // 399: bipush 0
      // 39a: istore 28
      // 39c: bipush 1
      // 39d: istore 36
      // 39f: aload 0
      // 3a0: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.t ()Ljava/util/Map;
      // 3a3: astore 44
      // 3a5: iload 43
      // 3a7: bipush 14
      // 3a9: isub
      // 3aa: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3ad: astore 45
      // 3af: aload 44
      // 3b1: aload 35
      // 3b3: aload 45
      // 3b5: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 3ba: pop
      // 3bb: aload 35
      // 3bd: astore 14
      // 3bf: iload 27
      // 3c1: iinc 27 1
      // 3c4: pop
      // 3c5: aload 0
      // 3c6: getfield me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl Ljava/util/Set;
      // 3c9: aload 38
      // 3cb: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 3d0: istore 44
      // 3d2: iload 36
      // 3d4: aload 5
      // 3d6: ifnonnull 523
      // 3d9: ifeq 521
      // 3dc: goto 3e3
      // 3df: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e2: athrow
      // 3e3: iload 44
      // 3e5: aload 5
      // 3e7: ifnonnull 523
      // 3ea: goto 3f1
      // 3ed: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f0: athrow
      // 3f1: ifne 521
      // 3f4: goto 3fb
      // 3f7: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3fa: athrow
      // 3fb: aload 35
      // 3fd: sipush -14772
      // 400: sipush -25147
      // 403: pop2
      // 404: ldc_w "sub_"
      // 407: swap
      // 408: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 40d: astore 45
      // 40f: fload 42
      // 411: fstore 46
      // 413: aload 0
      // 414: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.w ()Ljava/util/Map;
      // 417: astore 48
      // 419: aload 45
      // 41b: astore 49
      // 41d: bipush 0
      // 41e: istore 50
      // 420: aload 48
      // 422: aload 49
      // 424: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 429: astore 51
      // 42b: aload 51
      // 42d: ifnonnull 45c
      // 430: bipush 0
      // 431: istore 52
      // 433: new me/octo/client/IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl
      // 436: dup
      // 437: fload 46
      // 439: fload 41
      // 43b: fload 46
      // 43d: fload 41
      // 43f: lload 11
      // 441: lconst_0
      // 442: lconst_0
      // 443: bipush 64
      // 445: aconst_null
      // 446: invokespecial me/octo/client/IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl.<init> (FFFFJJJILkotlin/jvm/internal/DefaultConstructorMarker;)V
      // 449: astore 53
      // 44b: aload 48
      // 44d: aload 49
      // 44f: aload 53
      // 451: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 456: pop
      // 457: aload 53
      // 459: goto 45e
      // 45c: aload 51
      // 45e: nop
      // 45f: checkcast me/octo/client/IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl
      // 462: astore 47
      // 464: aload 47
      // 466: fload 46
      // 468: fload 41
      // 46a: lload 11
      // 46c: lconst_0
      // 46d: invokevirtual me/octo/client/IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl.a (FFJJ)V
      // 470: aload 47
      // 472: lload 11
      // 474: invokevirtual me/octo/client/IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl.f (J)F
      // 477: iload 10
      // 479: i2f
      // 47a: fadd
      // 47b: f2i
      // 47c: istore 48
      // 47e: fload 4
      // 480: fconst_0
      // 481: fcmpl
      // 482: aload 5
      // 484: ifnonnull 523
      // 487: ifle 521
      // 48a: goto 491
      // 48d: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 490: athrow
      // 491: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g ()V
      // 494: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
      // 497: fload 4
      // 499: ldc_w 0.7
      // 49c: fmul
      // 49d: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b (F)V
      // 4a0: iload 48
      // 4a2: bipush 26
      // 4a4: isub
      // 4a5: i2f
      // 4a6: fstore 49
      // 4a8: fload 49
      // 4aa: ldc_w 9.0
      // 4ad: fadd
      // 4ae: fstore 50
      // 4b0: aload 35
      // 4b2: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 4b5: invokevirtual java/lang/String.toUpperCase (Ljava/util/Locale;)Ljava/lang/String;
      // 4b8: dup
      // 4b9: sipush -14755
      // 4bc: sipush -18878
      // 4bf: pop2
      // 4c0: ldc_w "toUpperCase(...)"
      // 4c3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 4c6: astore 51
      // 4c8: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 4cb: aload 51
      // 4cd: bipush 0
      // 4ce: bipush 2
      // 4cf: aconst_null
      // 4d0: invokestatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a (Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;Ljava/lang/String;ZILjava/lang/Object;)D
      // 4d3: d2f
      // 4d4: fstore 52
      // 4d6: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 4d9: aload 51
      // 4db: fload 16
      // 4dd: f2d
      // 4de: fload 49
      // 4e0: f2d
      // 4e1: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 4e4: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.c ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 4e7: bipush 0
      // 4e8: bipush 16
      // 4ea: aconst_null
      // 4eb: invokestatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b (Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;Ljava/lang/String;DDLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;ZILjava/lang/Object;)D
      // 4ee: pop2
      // 4ef: fload 16
      // 4f1: fload 52
      // 4f3: fadd
      // 4f4: ldc_w 12.0
      // 4f7: fadd
      // 4f8: fload 50
      // 4fa: fload 17
      // 4fc: aload 0
      // 4fd: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.s ()F
      // 500: fadd
      // 501: fload 16
      // 503: fload 52
      // 505: fadd
      // 506: ldc_w 12.0
      // 509: fadd
      // 50a: fsub
      // 50b: fconst_1
      // 50c: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 50f: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.A ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 512: ldc_w 0.6
      // 515: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 518: ldc_w 0.5
      // 51b: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;F)V
      // 51e: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h ()V
      // 521: iload 37
      // 523: ifeq 5ce
      // 526: aload 38
      // 528: sipush -14774
      // 52b: sipush -18310
      // 52e: pop2
      // 52f: ldc_w "skill_"
      // 532: swap
      // 533: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 538: astore 45
      // 53a: fload 42
      // 53c: fstore 46
      // 53e: aload 0
      // 53f: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.w ()Ljava/util/Map;
      // 542: astore 48
      // 544: aload 45
      // 546: astore 49
      // 548: bipush 0
      // 549: istore 50
      // 54b: aload 48
      // 54d: aload 49
      // 54f: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 554: astore 51
      // 556: aload 51
      // 558: ifnonnull 587
      // 55b: bipush 0
      // 55c: istore 52
      // 55e: new me/octo/client/IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl
      // 561: dup
      // 562: fload 46
      // 564: fload 16
      // 566: fload 46
      // 568: fload 16
      // 56a: lload 11
      // 56c: lconst_0
      // 56d: lconst_0
      // 56e: bipush 64
      // 570: aconst_null
      // 571: invokespecial me/octo/client/IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl.<init> (FFFFJJJILkotlin/jvm/internal/DefaultConstructorMarker;)V
      // 574: astore 53
      // 576: aload 48
      // 578: aload 49
      // 57a: aload 53
      // 57c: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 581: pop
      // 582: aload 53
      // 584: goto 589
      // 587: aload 51
      // 589: nop
      // 58a: checkcast me/octo/client/IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl
      // 58d: astore 47
      // 58f: aload 47
      // 591: fload 46
      // 593: fload 16
      // 595: lload 11
      // 597: lconst_0
      // 598: invokevirtual me/octo/client/IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl.a (FFJJ)V
      // 59b: aload 47
      // 59d: lload 11
      // 59f: invokevirtual me/octo/client/IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl.f (J)F
      // 5a2: iload 10
      // 5a4: i2f
      // 5a5: fadd
      // 5a6: f2i
      // 5a7: istore 48
      // 5a9: fload 4
      // 5ab: fconst_0
      // 5ac: fcmpl
      // 5ad: ifle 5ce
      // 5b0: aload 0
      // 5b1: fload 16
      // 5b3: fload 17
      // 5b5: aload 0
      // 5b6: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.s ()F
      // 5b9: fadd
      // 5ba: iload 48
      // 5bc: bipush 46
      // 5be: isub
      // 5bf: i2f
      // 5c0: aload 38
      // 5c2: fload 4
      // 5c4: invokespecial me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (FFFLjava/lang/String;F)V
      // 5c7: goto 5ce
      // 5ca: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5cd: athrow
      // 5ce: aload 0
      // 5cf: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.v ()Ljava/util/Map;
      // 5d2: astore 46
      // 5d4: aload 33
      // 5d6: invokevirtual me/octo/client/IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI.aj ()Ljava/lang/String;
      // 5d9: astore 47
      // 5db: bipush 0
      // 5dc: istore 48
      // 5de: aload 46
      // 5e0: aload 47
      // 5e2: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 5e7: astore 49
      // 5e9: aload 49
      // 5eb: ifnonnull 61a
      // 5ee: bipush 0
      // 5ef: istore 50
      // 5f1: new me/octo/client/IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl
      // 5f4: dup
      // 5f5: fload 42
      // 5f7: fload 41
      // 5f9: fload 42
      // 5fb: fload 41
      // 5fd: lload 11
      // 5ff: lconst_0
      // 600: lconst_0
      // 601: bipush 64
      // 603: aconst_null
      // 604: invokespecial me/octo/client/IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl.<init> (FFFFJJJILkotlin/jvm/internal/DefaultConstructorMarker;)V
      // 607: astore 51
      // 609: aload 46
      // 60b: aload 47
      // 60d: aload 51
      // 60f: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 614: pop
      // 615: aload 51
      // 617: goto 61c
      // 61a: aload 49
      // 61c: nop
      // 61d: checkcast me/octo/client/IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl
      // 620: astore 45
      // 622: aload 45
      // 624: fload 42
      // 626: fload 41
      // 628: lload 11
      // 62a: lconst_0
      // 62b: invokevirtual me/octo/client/IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl.a (FFJJ)V
      // 62e: aload 45
      // 630: lload 11
      // 632: invokevirtual me/octo/client/IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl.f (J)F
      // 635: fstore 46
      // 637: aload 45
      // 639: lload 11
      // 63b: invokevirtual me/octo/client/IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl.g (J)F
      // 63e: fstore 47
      // 640: aload 45
      // 642: lload 11
      // 644: invokevirtual me/octo/client/IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl.h (J)F
      // 647: fstore 48
      // 649: fload 46
      // 64b: iload 10
      // 64d: i2f
      // 64e: fadd
      // 64f: f2i
      // 650: istore 49
      // 652: aload 0
      // 653: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a ()Lme/octo/client/llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll;
      // 656: fload 47
      // 658: aload 0
      // 659: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.l ()F
      // 65c: fload 47
      // 65e: aload 0
      // 65f: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.s ()F
      // 662: fadd
      // 663: aload 0
      // 664: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.l ()F
      // 667: aload 0
      // 668: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.n ()F
      // 66b: fadd
      // 66c: invokevirtual me/octo/client/llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.a (FFFF)Lme/octo/client/llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll;
      // 66f: astore 50
      // 671: fload 4
      // 673: fstore 51
      // 675: fconst_1
      // 676: fstore 52
      // 678: iload 22
      // 67a: aload 5
      // 67c: ifnonnull 700
      // 67f: ifeq 6fa
      // 682: goto 689
      // 685: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 688: athrow
      // 689: iload 27
      // 68b: i2l
      // 68c: ldc2_w 100
      // 68f: lmul
      // 690: iload 28
      // 692: i2l
      // 693: ldc2_w 50
      // 696: lmul
      // 697: ladd
      // 698: lstore 53
      // 69a: lload 20
      // 69c: aload 0
      // 69d: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.x ()J
      // 6a0: lsub
      // 6a1: lload 53
      // 6a3: lsub
      // 6a4: lstore 55
      // 6a6: lload 55
      // 6a8: lconst_0
      // 6a9: lcmp
      // 6aa: aload 5
      // 6ac: ifnonnull 6d2
      // 6af: ifge 6c4
      // 6b2: goto 6b9
      // 6b5: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6b8: athrow
      // 6b9: fconst_0
      // 6ba: fstore 52
      // 6bc: fconst_0
      // 6bd: fstore 51
      // 6bf: aload 5
      // 6c1: ifnull 6fa
      // 6c4: lload 55
      // 6c6: aload 0
      // 6c7: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.y ()J
      // 6ca: lcmp
      // 6cb: goto 6d2
      // 6ce: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6d1: athrow
      // 6d2: aload 5
      // 6d4: ifnonnull 700
      // 6d7: ifge 6fa
      // 6da: goto 6e1
      // 6dd: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6e0: athrow
      // 6e1: lload 55
      // 6e3: l2f
      // 6e4: aload 0
      // 6e5: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.y ()J
      // 6e8: l2f
      // 6e9: fdiv
      // 6ea: invokestatic me/octo/client/utils/player/IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.m (F)F
      // 6ed: fstore 57
      // 6ef: fload 57
      // 6f1: fstore 52
      // 6f3: fload 4
      // 6f5: fload 57
      // 6f7: fmul
      // 6f8: fstore 51
      // 6fa: fload 52
      // 6fc: ldc_w 0.9
      // 6ff: fcmpl
      // 700: aload 5
      // 702: ifnonnull 71c
      // 705: ifle 72f
      // 708: goto 70f
      // 70b: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 70e: athrow
      // 70f: fload 4
      // 711: ldc_w 0.9
      // 714: fcmpl
      // 715: goto 71c
      // 718: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 71b: athrow
      // 71c: aload 5
      // 71e: ifnonnull 72c
      // 721: ifle 72f
      // 724: goto 72b
      // 727: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 72a: athrow
      // 72b: bipush 1
      // 72c: goto 730
      // 72f: bipush 0
      // 730: istore 53
      // 732: aload 5
      // 734: ifnonnull 760
      // 737: getstatic me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 73a: invokevirtual me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Ljava/util/Map;
      // 73d: aload 33
      // 73f: invokevirtual me/octo/client/IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI.aj ()Ljava/lang/String;
      // 742: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 747: checkcast java/lang/Integer
      // 74a: dup
      // 74b: ifnull 75f
      // 74e: goto 755
      // 751: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 754: athrow
      // 755: invokevirtual java/lang/Integer.intValue ()I
      // 758: goto 78d
      // 75b: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 75e: athrow
      // 75f: pop
      // 760: aload 32
      // 762: aload 0
      // 763: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a ()Lme/octo/client/llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll;
      // 766: invokeinterface me/octo/client/IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.b (Lme/octo/client/llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll;)I 2
      // 76b: istore 56
      // 76d: iload 56
      // 76f: istore 57
      // 771: bipush 0
      // 772: istore 58
      // 774: getstatic me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 777: invokevirtual me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Ljava/util/Map;
      // 77a: aload 33
      // 77c: invokevirtual me/octo/client/IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI.aj ()Ljava/lang/String;
      // 77f: iload 57
      // 781: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 784: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 789: pop
      // 78a: nop
      // 78b: iload 56
      // 78d: istore 54
      // 78f: iload 54
      // 791: istore 55
      // 793: iload 49
      // 795: iload 55
      // 797: iadd
      // 798: i2f
      // 799: fload 24
      // 79b: fcmpg
      // 79c: aload 5
      // 79e: ifnonnull 7d9
      // 7a1: ifle 7ca
      // 7a4: goto 7ab
      // 7a7: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7aa: athrow
      // 7ab: iload 49
      // 7ad: i2f
      // 7ae: fload 24
      // 7b0: fload 26
      // 7b2: fadd
      // 7b3: fcmpl
      // 7b4: aload 5
      // 7b6: ifnonnull 817
      // 7b9: goto 7c0
      // 7bc: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7bf: athrow
      // 7c0: iflt 80b
      // 7c3: goto 7ca
      // 7c6: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7c9: athrow
      // 7ca: iload 43
      // 7cc: iload 55
      // 7ce: iadd
      // 7cf: bipush 8
      // 7d1: iadd
      // 7d2: goto 7d9
      // 7d5: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7d8: athrow
      // 7d9: istore 56
      // 7db: iload 40
      // 7dd: aload 5
      // 7df: ifnonnull 7fe
      // 7e2: ifeq 7f5
      // 7e5: goto 7ec
      // 7e8: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7eb: athrow
      // 7ec: iload 56
      // 7ee: istore 18
      // 7f0: aload 5
      // 7f2: ifnull 800
      // 7f5: iload 56
      // 7f7: goto 7fe
      // 7fa: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7fd: athrow
      // 7fe: istore 19
      // 800: iload 28
      // 802: iinc 28 1
      // 805: pop
      // 806: aload 5
      // 808: ifnull be9
      // 80b: iload 2
      // 80c: i2f
      // 80d: fload 47
      // 80f: fcmpl
      // 810: goto 817
      // 813: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 816: athrow
      // 817: aload 5
      // 819: ifnonnull 837
      // 81c: iflt 8bd
      // 81f: goto 826
      // 822: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 825: athrow
      // 826: iload 2
      // 827: i2f
      // 828: fload 47
      // 82a: aload 0
      // 82b: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.s ()F
      // 82e: fadd
      // 82f: fcmpg
      // 830: goto 837
      // 833: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 836: athrow
      // 837: aload 5
      // 839: ifnonnull 847
      // 83c: ifgt 8bd
      // 83f: goto 846
      // 842: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 845: athrow
      // 846: iload 3
      // 847: iload 49
      // 849: aload 5
      // 84b: ifnonnull 871
      // 84e: if_icmplt 8bd
      // 851: goto 858
      // 854: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 857: athrow
      // 858: iload 3
      // 859: aload 5
      // 85b: ifnonnull 885
      // 85e: goto 865
      // 861: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 864: athrow
      // 865: iload 49
      // 867: iload 55
      // 869: iadd
      // 86a: goto 871
      // 86d: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 870: athrow
      // 871: if_icmpgt 8bd
      // 874: iload 3
      // 875: i2f
      // 876: aload 0
      // 877: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.l ()F
      // 87a: bipush 5
      // 87b: i2f
      // 87c: fadd
      // 87d: fcmpl
      // 87e: goto 885
      // 881: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 884: athrow
      // 885: aload 5
      // 887: ifnonnull 8aa
      // 88a: ifle 8bd
      // 88d: goto 894
      // 890: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 893: athrow
      // 894: iload 3
      // 895: i2f
      // 896: aload 0
      // 897: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.l ()F
      // 89a: aload 0
      // 89b: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.n ()F
      // 89e: fadd
      // 89f: bipush 5
      // 8a0: i2f
      // 8a1: fsub
      // 8a2: fcmpg
      // 8a3: goto 8aa
      // 8a6: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8a9: athrow
      // 8aa: aload 5
      // 8ac: ifnonnull 8ba
      // 8af: ifge 8bd
      // 8b2: goto 8b9
      // 8b5: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8b8: athrow
      // 8b9: bipush 1
      // 8ba: goto 8be
      // 8bd: bipush 0
      // 8be: istore 56
      // 8c0: aload 0
      // 8c1: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.u ()Ljava/util/Map;
      // 8c4: astore 58
      // 8c6: aload 33
      // 8c8: invokevirtual me/octo/client/IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI.aj ()Ljava/lang/String;
      // 8cb: astore 59
      // 8cd: bipush 0
      // 8ce: istore 60
      // 8d0: aload 58
      // 8d2: aload 59
      // 8d4: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 8d9: astore 61
      // 8db: aload 61
      // 8dd: ifnonnull 900
      // 8e0: bipush 0
      // 8e1: istore 62
      // 8e3: new me/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll
      // 8e6: dup
      // 8e7: sipush 200
      // 8ea: invokespecial me/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll.<init> (I)V
      // 8ed: astore 62
      // 8ef: aload 58
      // 8f1: aload 59
      // 8f3: aload 62
      // 8f5: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 8fa: pop
      // 8fb: aload 62
      // 8fd: goto 902
      // 900: aload 61
      // 902: nop
      // 903: checkcast me/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll
      // 906: astore 57
      // 908: iload 56
      // 90a: aload 5
      // 90c: ifnonnull 926
      // 90f: ifeq 93b
      // 912: goto 919
      // 915: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 918: athrow
      // 919: getstatic me/octo/client/llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI;
      // 91c: invokevirtual me/octo/client/llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.a ()Z
      // 91f: goto 926
      // 922: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 925: athrow
      // 926: ifne 93b
      // 929: aload 57
      // 92b: fconst_1
      // 92c: invokevirtual me/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll.a (F)V
      // 92f: aload 5
      // 931: ifnull 948
      // 934: goto 93b
      // 937: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 93a: athrow
      // 93b: aload 57
      // 93d: fconst_0
      // 93e: invokevirtual me/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll.a (F)V
      // 941: goto 948
      // 944: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 947: athrow
      // 948: aload 57
      // 94a: invokevirtual me/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll.e ()F
      // 94d: ldc_w 10.0
      // 950: fmul
      // 951: fstore 58
      // 953: fload 47
      // 955: aload 0
      // 956: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.s ()F
      // 959: fconst_2
      // 95a: fdiv
      // 95b: fadd
      // 95c: fstore 59
      // 95e: iload 49
      // 960: i2f
      // 961: iload 55
      // 963: i2f
      // 964: fconst_2
      // 965: fdiv
      // 966: fadd
      // 967: fstore 60
      // 969: fload 48
      // 96b: ldc_w 0.999
      // 96e: fcmpg
      // 96f: aload 5
      // 971: ifnonnull 97f
      // 974: ifge 982
      // 977: goto 97e
      // 97a: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 97d: athrow
      // 97e: bipush 1
      // 97f: goto 983
      // 982: bipush 0
      // 983: istore 61
      // 985: fconst_1
      // 986: aload 57
      // 988: invokevirtual me/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll.e ()F
      // 98b: ldc_w 0.01
      // 98e: fmul
      // 98f: fadd
      // 990: fstore 62
      // 992: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g ()V
      // 995: aload 5
      // 997: ifnonnull 9e6
      // 99a: iload 61
      // 99c: ifne 9c5
      // 99f: goto 9a6
      // 9a2: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9a5: athrow
      // 9a6: aload 57
      // 9a8: invokevirtual me/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll.e ()F
      // 9ab: ldc_w 0.01
      // 9ae: fcmpl
      // 9af: aload 5
      // 9b1: ifnonnull 9fe
      // 9b4: goto 9bb
      // 9b7: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9ba: athrow
      // 9bb: ifle 9f2
      // 9be: goto 9c5
      // 9c1: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9c4: athrow
      // 9c5: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
      // 9c8: fload 59
      // 9ca: fload 60
      // 9cc: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b (FF)V
      // 9cf: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
      // 9d2: fload 48
      // 9d4: fload 62
      // 9d6: fmul
      // 9d7: fload 48
      // 9d9: fload 62
      // 9db: fmul
      // 9dc: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FF)V
      // 9df: goto 9e6
      // 9e2: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9e5: athrow
      // 9e6: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
      // 9e9: fload 59
      // 9eb: fneg
      // 9ec: fload 60
      // 9ee: fneg
      // 9ef: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b (FF)V
      // 9f2: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
      // 9f5: fload 51
      // 9f7: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b (F)V
      // 9fa: fload 51
      // 9fc: fconst_0
      // 9fd: fcmpl
      // 9fe: ifle a5f
      // a01: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // a04: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.j ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // a07: ldc_w 0.92
      // a0a: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.b (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // a0d: fload 58
      // a0f: fload 58
      // a11: fload 58
      // a13: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.b (FFF)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // a16: astore 63
      // a18: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // a1b: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.ar ()F
      // a1e: fstore 64
      // a20: fload 47
      // a22: iload 49
      // a24: i2f
      // a25: aload 0
      // a26: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.s ()F
      // a29: iload 55
      // a2b: i2f
      // a2c: aload 63
      // a2e: fload 64
      // a30: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;F)V
      // a33: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // a36: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.y ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // a39: ldc_w 0.35
      // a3c: ldc_w 0.45
      // a3f: aload 57
      // a41: invokevirtual me/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll.e ()F
      // a44: fmul
      // a45: fadd
      // a46: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // a49: astore 65
      // a4b: fload 47
      // a4d: iload 49
      // a4f: i2f
      // a50: aload 0
      // a51: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.s ()F
      // a54: iload 55
      // a56: i2f
      // a57: fconst_1
      // a58: aload 65
      // a5a: fload 64
      // a5c: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;F)V
      // a5f: aload 32
      // a61: aload 1
      // a62: aload 50
      // a64: iload 49
      // a66: iload 2
      // a67: iload 3
      // a68: invokeinterface me/octo/client/IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.a (Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lme/octo/client/llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll;III)Lme/octo/client/lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll; 6
      // a6d: astore 63
      // a6f: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h ()V
      // a72: aload 63
      // a74: invokevirtual me/octo/client/lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll.a ()I
      // a77: iload 49
      // a79: isub
      // a7a: istore 64
      // a7c: aload 5
      // a7e: ifnonnull aaa
      // a81: getstatic me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // a84: invokevirtual me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Ljava/util/Map;
      // a87: aload 33
      // a89: invokevirtual me/octo/client/IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI.aj ()Ljava/lang/String;
      // a8c: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // a91: checkcast java/lang/Integer
      // a94: dup
      // a95: ifnull aa9
      // a98: goto a9f
      // a9b: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a9e: athrow
      // a9f: invokevirtual java/lang/Integer.intValue ()I
      // aa2: goto aab
      // aa5: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // aa8: athrow
      // aa9: pop
      // aaa: bipush 0
      // aab: istore 65
      // aad: iload 64
      // aaf: iload 65
      // ab1: isub
      // ab2: invokestatic java/lang/Math.abs (I)I
      // ab5: aload 5
      // ab7: ifnonnull afc
      // aba: bipush 2
      // abb: if_icmple aec
      // abe: goto ac5
      // ac1: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ac4: athrow
      // ac5: getstatic me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // ac8: invokevirtual me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Ljava/util/Map;
      // acb: astore 66
      // acd: aload 33
      // acf: invokevirtual me/octo/client/IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI.aj ()Ljava/lang/String;
      // ad2: astore 67
      // ad4: iload 64
      // ad6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // ad9: astore 68
      // adb: aload 66
      // add: aload 67
      // adf: aload 68
      // ae1: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // ae6: pop
      // ae7: aload 0
      // ae8: bipush 0
      // ae9: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.c (Z)V
      // aec: getstatic me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // aef: invokevirtual me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d ()Ljava/util/Set;
      // af2: aload 33
      // af4: invokevirtual me/octo/client/IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI.aj ()Ljava/lang/String;
      // af7: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // afc: aload 5
      // afe: ifnonnull b2b
      // b01: ifne b29
      // b04: goto b0b
      // b07: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b0a: athrow
      // b0b: getstatic me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // b0e: invokevirtual me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d ()Ljava/util/Set;
      // b11: checkcast java/util/Collection
      // b14: astore 66
      // b16: aload 33
      // b18: invokevirtual me/octo/client/IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI.aj ()Ljava/lang/String;
      // b1b: aload 66
      // b1d: swap
      // b1e: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // b23: pop
      // b24: aload 0
      // b25: bipush 0
      // b26: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.c (Z)V
      // b29: iload 53
      // b2b: aload 5
      // b2d: ifnonnull bb2
      // b30: ifeq baa
      // b33: goto b3a
      // b36: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b39: athrow
      // b3a: aload 63
      // b3c: invokevirtual me/octo/client/lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll.c ()Z
      // b3f: aload 5
      // b41: ifnonnull bb2
      // b44: goto b4b
      // b47: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b4a: athrow
      // b4b: ifeq baa
      // b4e: goto b55
      // b51: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b54: athrow
      // b55: iload 3
      // b56: i2f
      // b57: aload 0
      // b58: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.l ()F
      // b5b: bipush 5
      // b5c: i2f
      // b5d: fadd
      // b5e: fcmpl
      // b5f: aload 5
      // b61: ifnonnull bb2
      // b64: goto b6b
      // b67: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b6a: athrow
      // b6b: ifle baa
      // b6e: goto b75
      // b71: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b74: athrow
      // b75: iload 3
      // b76: i2f
      // b77: aload 0
      // b78: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.l ()F
      // b7b: aload 0
      // b7c: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.n ()F
      // b7f: fadd
      // b80: bipush 5
      // b81: i2f
      // b82: fsub
      // b83: fcmpg
      // b84: aload 5
      // b86: ifnonnull bb2
      // b89: goto b90
      // b8c: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b8f: athrow
      // b90: ifge baa
      // b93: goto b9a
      // b96: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b99: athrow
      // b9a: aload 0
      // b9b: aload 63
      // b9d: invokevirtual me/octo/client/lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll.b ()Lme/octo/client/IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII;
      // ba0: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.b (Lme/octo/client/IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII;)V
      // ba3: goto baa
      // ba6: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ba9: athrow
      // baa: aload 63
      // bac: invokevirtual me/octo/client/lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll.a ()I
      // baf: iload 49
      // bb1: isub
      // bb2: istore 66
      // bb4: iload 43
      // bb6: iload 66
      // bb8: iadd
      // bb9: bipush 8
      // bbb: iadd
      // bbc: istore 67
      // bbe: iload 40
      // bc0: aload 5
      // bc2: ifnonnull be1
      // bc5: ifeq bd8
      // bc8: goto bcf
      // bcb: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // bce: athrow
      // bcf: iload 67
      // bd1: istore 18
      // bd3: aload 5
      // bd5: ifnull be3
      // bd8: iload 67
      // bda: goto be1
      // bdd: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // be0: athrow
      // be1: istore 19
      // be3: iload 28
      // be5: iinc 28 1
      // be8: pop
      // be9: iinc 30 1
      // bec: aload 5
      // bee: ifnull 15e
      // bf1: iload 18
      // bf3: iload 19
      // bf5: invokestatic java/lang/Math.max (II)I
      // bf8: bipush 30
      // bfa: isub
      // bfb: istore 29
      // bfd: aload 0
      // bfe: iload 29
      // c00: iload 10
      // c02: isub
      // c03: i2f
      // c04: aload 0
      // c05: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.l ()F
      // c08: aload 0
      // c09: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.n ()F
      // c0c: fadd
      // c0d: bipush 10
      // c0f: i2f
      // c10: fsub
      // c11: fsub
      // c12: bipush 30
      // c14: i2f
      // c15: fadd
      // c16: f2i
      // c17: ineg
      // c18: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (I)V
      // c1b: aload 0
      // c1c: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.p ()F
      // c1f: f2i
      // c20: bipush 15
      // c22: iadd
      // c23: istore 30
      // c25: aload 5
      // c27: ifnonnull c8a
      // c2a: aload 0
      // c2b: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.t ()Ljava/util/Map;
      // c2e: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // c33: checkcast java/lang/Iterable
      // c36: invokestatic kotlin/collections/CollectionsKt.maxOrNull (Ljava/lang/Iterable;)Ljava/lang/Comparable;
      // c39: checkcast java/lang/Integer
      // c3c: dup
      // c3d: ifnull c89
      // c40: goto c47
      // c43: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c46: athrow
      // c47: checkcast java/lang/Number
      // c4a: invokevirtual java/lang/Number.intValue ()I
      // c4d: istore 33
      // c4f: bipush 0
      // c50: istore 34
      // c52: iload 30
      // c54: iload 33
      // c56: isub
      // c57: iload 10
      // c59: iadd
      // c5a: istore 35
      // c5c: aload 5
      // c5e: ifnonnull c83
      // c61: iload 35
      // c63: aload 0
      // c64: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.h ()I
      // c67: if_icmpge c7e
      // c6a: goto c71
      // c6d: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c70: athrow
      // c71: aload 0
      // c72: iload 35
      // c74: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (I)V
      // c77: goto c7e
      // c7a: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c7d: athrow
      // c7e: nop
      // c7f: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // c82: pop
      // c83: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // c86: goto c8b
      // c89: pop
      // c8a: aconst_null
      // c8b: pop
      // c8c: aload 0
      // c8d: aload 5
      // c8f: ifnonnull cdf
      // c92: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.h ()I
      // c95: ifge cd5
      // c98: goto c9f
      // c9b: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c9e: athrow
      // c9f: aload 0
      // ca0: aload 5
      // ca2: ifnonnull cdf
      // ca5: goto cac
      // ca8: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // cab: athrow
      // cac: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.h ()I
      // caf: i2f
      // cb0: aload 0
      // cb1: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.g ()Lme/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll;
      // cb4: invokevirtual me/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll.h ()F
      // cb7: fcmpl
      // cb8: ifle cd5
      // cbb: goto cc2
      // cbe: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // cc1: athrow
      // cc2: aload 0
      // cc3: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.g ()Lme/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll;
      // cc6: aload 0
      // cc7: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.h ()I
      // cca: i2f
      // ccb: invokevirtual me/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll.a (F)V
      // cce: goto cd5
      // cd1: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // cd4: athrow
      // cd5: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
      // cd8: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.i ()V
      // cdb: aload 0
      // cdc: invokevirtual me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.j ()Lme/octo/client/IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII;
      // cdf: ifnull cea
      // ce2: bipush 1
      // ce3: goto ceb
      // ce6: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ce9: athrow
      // cea: bipush 0
      // ceb: invokestatic me/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f ()[Lme/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
      // cee: ifnonnull cfe
      // cf1: bipush 5
      // cf2: newarray 10
      // cf4: invokestatic me/octo/client/llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.b ([I)V
      // cf7: goto cfe
      // cfa: invokestatic me/octo/client/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // cfd: athrow
      // cfe: ireturn
   }

   private static final int a(
      IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl var0,
      IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl var1
   ) {
      IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var10000 = var0.m();
      short var10002 = -14784;
      short var10003 = -31618;
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type me.octo.client.gui.clickgui.modules.impl.MacroModule");
      IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var3 = (IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI)var10000;
      var10000 = var1.m();
      var10002 = -14756;
      var10003 = -2533;
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type me.octo.client.gui.clickgui.modules.impl.MacroModule");
      IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var4 = (IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI)var10000;
      int[] var11 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      String var5 = lllIIllIIlllIlIIlIlIIIllllllllllllllIIIIIlIlIIIIIIIIIlIlIlIlIIllllllllIllllIIIlIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var3);
      String var6 = lllIIllIIlllIlIIlIlIIIllllllllllllllIIIIIlIlIIIIIIIIIlIlIlIlIIllllllllIllllIIIlIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var4);
      int[] var2 = var11;
      int var7 = Intrinsics.compare(
         lllIIllIIlllIlIIlIlIIIllllllllllllllIIIIIlIlIIIIIIIIIlIlIlIlIIllllllllIllllIIIlIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var5),
         lllIIllIIlllIlIIlIlIIIllllllllllllllIIIIIlIlIIIIIIIIIlIlIlIlIIllllllllIllllIIIlIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var6)
      );
      int var12 = var7;
      if (var2 == null) {
         if (var7 != 0) {
            return var7;
         }

         short var10001 = -14773;
         var10002 = -21321;
         var12 = ((Intrinsics.areEqual(var5, "MINING")) ? 1 : 0);
      }

      int var8;
      label42: {
         if (var2 == null) {
            if (var12 != 0) {
               var8 = Intrinsics.compare(
                  lllIIllIIlllIlIIlIlIIIllllllllllllllIIIIIlIlIIIIIIIIIlIlIlIlIIllllllllIllllIIIlIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(var3.am()),
                  lllIIllIIlllIlIIlIlIIIllllllllllllllIIIIIlIlIIIIIIIIIlIlIlIlIIllllllllIllllIIIlIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(var4.am())
               );
               var13 = var8;
               if (var2 != null) {
                  break label42;
               }

               if (var8 != 0) {
                  return var8;
               }
            }

            var12 = var3.am().compareTo(var4.am());
         }

         var8 = var12;
         var13 = var8;
      }

      if (var2 == null) {
         if (var13 != 0) {
            return var8;
         }

         var13 = Intrinsics.compare(var4.ao(), var3.ao());
      }

      int var9 = var13;
      int var14 = var9;
      if (var2 == null) {
         if (var9 != 0) {
            return var9;
         }

         var14 = var3.aj().compareTo(var4.aj());
      }

      return var14;
   }

   private static final int a(Function2 var0, Object var1, Object var2) {
      return ((Number)var0.invoke(var1, var2)).intValue();
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[18];
      int var3 = 0;
      String var2 = "¶÷\u00065\u000f\u0019\u0000bé\u009f\u0019\u0086üý·\u0096)*\u008dÃ\u0014Üêy\u0085\u001bKW6/rÐ\u0011?z¬¯°ï2\t\nÃ\u008d¬ÖS®\u00865E>\bìºI0ïr\u0011¾/8ñgÆv\u0088\u009e{<\f\u001fx©[0\rì\u0092ÿ½d÷\u009a½W!\u0097ü\u0004\u009c\u0098\u001dÝ,$½\u0016ºÆ~äI\u0018\u008fF;\u0087\u0006Uàq9]K\u0006hv\b¨\u0093à\u000fY?Êñ\u00192\u0084j\u008cVÀ÷xdJ\u000f\u0012\u0001£64Ê!u8µV\u008bªë\u0010\u000f\u0090>S.¹áBãeT\u0085UH\u0002\u008f/®\bµù,oÕ\u0087U\u00932\u008b\f%\u0084Âzk-\u0082>\u0010ÑA>¾º\u000f¡â,ÒKÕö\u0082L]\u008d\u0082\u008dÖ5|ãE3Y@>h?\u0097·¢\u009c»ðïç·¨ós\u0094]ðD\u0085È¦ZÐÝgc\u001ao[c¥ã+D÷\u0083ðÅj%°\bm¯qA¿\t\u0086\u0003\u0002¥pT\"Á\u008dõÅ\u0004Þiâ«\u0097\u008a×ÀOF¡óé\u0098\u0084Hð,ÖáhXëG%#A\u0014Bßª#a\u009f\u0018¬Æ!í{\u00987X\u0006.Úá¯\u0007Î4\u0017?\u007f·G\nz\u0088¯øß:{þ6Z";
      int var4 = "¶÷\u00065\u000f\u0019\u0000bé\u009f\u0019\u0086üý·\u0096)*\u008dÃ\u0014Üêy\u0085\u001bKW6/rÐ\u0011?z¬¯°ï2\t\nÃ\u008d¬ÖS®\u00865E>\bìºI0ïr\u0011¾/8ñgÆv\u0088\u009e{<\f\u001fx©[0\rì\u0092ÿ½d÷\u009a½W!\u0097ü\u0004\u009c\u0098\u001dÝ,$½\u0016ºÆ~äI\u0018\u008fF;\u0087\u0006Uàq9]K\u0006hv\b¨\u0093à\u000fY?Êñ\u00192\u0084j\u008cVÀ÷xdJ\u000f\u0012\u0001£64Ê!u8µV\u008bªë\u0010\u000f\u0090>S.¹áBãeT\u0085UH\u0002\u008f/®\bµù,oÕ\u0087U\u00932\u008b\f%\u0084Âzk-\u0082>\u0010ÑA>¾º\u000f¡â,ÒKÕö\u0082L]\u008d\u0082\u008dÖ5|ãE3Y@>h?\u0097·¢\u009c»ðïç·¨ós\u0094]ðD\u0085È¦ZÐÝgc\u001ao[c¥ã+D÷\u0083ðÅj%°\bm¯qA¿\t\u0086\u0003\u0002¥pT\"Á\u008dõÅ\u0004Þiâ«\u0097\u008a×ÀOF¡óé\u0098\u0084Hð,ÖáhXëG%#A\u0014Bßª#a\u009f\u0018¬Æ!í{\u00987X\u0006.Úá¯\u0007Î4\u0017?\u007f·G\nz\u0088¯øß:{þ6Z"
         .length();
      char var1 = 4;
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
                     case 0 -> 17;
                     case 1 -> 126;
                     case 2 -> 126;
                     case 3 -> 115;
                     case 4 -> 103;
                     case 5 -> 79;
                     default -> 10;
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
                     d = var5;
                     e = new String[18];
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

                  var2 = "^\u0001æ\u0095\u000b¯|Ò-tp:\t^ià\u008ab~î\u0019Ðx\u0014FYø¾¤\u0099Áð»Ü¥îk\u009b.\u008bü¡/ÕÓYëÒ¡6\b©\u009e½®\u001a´E\u0012({òDúü\u0094\u0019 KØ\u0091\b7wvE:¾j¿ÈÞæòw_ûm×\u00106Î\u008b)è¡Iøõ¥\u0094\u0097ê©Þv";
                  var4 = "^\u0001æ\u0095\u000b¯|Ò-tp:\t^ià\u008ab~î\u0019Ðx\u0014FYø¾¤\u0099Áð»Ü¥îk\u009b.\u008bü¡/ÕÓYëÒ¡6\b©\u009e½®\u001a´E\u0012({òDúü\u0094\u0019 KØ\u0091\b7wvE:¾j¿ÈÞæòw_ûm×\u00106Î\u008b)è¡Iøõ¥\u0094\u0097ê©Þv"
                     .length();
                  var1 = 'Y';
                  var8 = -1;
            }

            var10000 = 29;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ -14772) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 15;
            case 1 -> 5;
            case 2 -> 185;
            case 3 -> 16;
            case 4 -> 254;
            case 5 -> 111;
            case 6 -> 95;
            case 7 -> 130;
            case 8 -> 207;
            case 9 -> 8;
            case 10 -> 129;
            case 11 -> 190;
            case 12 -> 2;
            case 13 -> 166;
            case 14 -> 245;
            case 15 -> 149;
            case 16 -> 174;
            case 17 -> 85;
            case 18 -> 196;
            case 19 -> 62;
            case 20 -> 134;
            case 21 -> 6;
            case 22 -> 200;
            case 23 -> 138;
            case 24 -> 82;
            case 25 -> 217;
            case 26 -> 139;
            case 27 -> 117;
            case 28 -> 101;
            case 29 -> 84;
            case 30 -> 213;
            case 31 -> 26;
            case 32 -> 246;
            case 33 -> 65;
            case 34 -> 30;
            case 35 -> 3;
            case 36 -> 92;
            case 37 -> 191;
            case 38 -> 126;
            case 39 -> 171;
            case 40 -> 119;
            case 41 -> 209;
            case 42 -> 118;
            case 43 -> 121;
            case 44 -> 222;
            case 45 -> 59;
            case 46 -> 193;
            case 47 -> 235;
            case 48 -> 179;
            case 49 -> 71;
            case 50 -> 13;
            case 51 -> 67;
            case 52 -> 158;
            case 53 -> 27;
            case 54 -> 241;
            case 55 -> 38;
            case 56 -> 47;
            case 57 -> 211;
            case 58 -> 244;
            case 59 -> 140;
            case 60 -> 155;
            case 61 -> 153;
            case 62 -> 199;
            case 63 -> 169;
            case 64 -> 77;
            case 65 -> 141;
            case 66 -> 197;
            case 67 -> 210;
            case 68 -> 14;
            case 69 -> 231;
            case 70 -> 230;
            case 71 -> 160;
            case 72 -> 228;
            case 73 -> 145;
            case 74 -> 236;
            case 75 -> 122;
            case 76 -> 4;
            case 77 -> 64;
            case 78 -> 192;
            case 79 -> 127;
            case 80 -> 42;
            case 81 -> 123;
            case 82 -> 223;
            case 83 -> 238;
            case 84 -> 105;
            case 85 -> 188;
            case 86 -> 206;
            case 87 -> 184;
            case 88 -> 103;
            case 89 -> 154;
            case 90 -> 150;
            case 91 -> 165;
            case 92 -> 131;
            case 93 -> 28;
            case 94 -> 55;
            case 95 -> 46;
            case 96 -> 18;
            case 97 -> 156;
            case 98 -> 33;
            case 99 -> 151;
            case 100 -> 221;
            case 101 -> 90;
            case 102 -> 9;
            case 103 -> 229;
            case 104 -> 214;
            case 105 -> 58;
            case 106 -> 250;
            case 107 -> 248;
            case 108 -> 159;
            case 109 -> 21;
            case 110 -> 252;
            case 111 -> 54;
            case 112 -> 242;
            case 113 -> 43;
            case 114 -> 142;
            case 115 -> 97;
            case 116 -> 83;
            case 117 -> 173;
            case 118 -> 128;
            case 119 -> 22;
            case 120 -> 132;
            case 121 -> 68;
            case 122 -> 110;
            case 123 -> 147;
            case 124 -> 74;
            case 125 -> 41;
            case 126 -> 107;
            case 127 -> 234;
            case 128 -> 88;
            case 129 -> 50;
            case 130 -> 23;
            case 131 -> 31;
            case 132 -> 19;
            case 133 -> 45;
            case 134 -> 163;
            case 135 -> 98;
            case 136 -> 152;
            case 137 -> 251;
            case 138 -> 7;
            case 139 -> 94;
            case 140 -> 239;
            case 141 -> 108;
            case 142 -> 79;
            case 143 -> 224;
            case 144 -> 249;
            case 145 -> 72;
            case 146 -> 205;
            case 147 -> 12;
            case 148 -> 52;
            case 149 -> 102;
            case 150 -> 203;
            case 151 -> 218;
            case 152 -> 25;
            case 153 -> 208;
            case 154 -> 233;
            case 155 -> 53;
            case 156 -> 136;
            case 157 -> 80;
            case 158 -> 34;
            case 159 -> 73;
            case 160 -> 99;
            case 161 -> 204;
            case 162 -> 125;
            case 163 -> 168;
            case 164 -> 176;
            case 165 -> 113;
            case 166 -> 226;
            case 167 -> 24;
            case 168 -> 181;
            case 169 -> 120;
            case 170 -> 220;
            case 171 -> 183;
            case 172 -> 240;
            case 173 -> 135;
            case 174 -> 146;
            case 175 -> 232;
            case 176 -> 161;
            case 177 -> 11;
            case 178 -> 144;
            case 179 -> 182;
            case 180 -> 104;
            case 181 -> 143;
            case 182 -> 212;
            case 183 -> 180;
            case 184 -> 106;
            case 185 -> 87;
            case 186 -> 237;
            case 187 -> 164;
            case 188 -> 124;
            case 189 -> 247;
            case 190 -> 60;
            case 191 -> 37;
            case 192 -> 216;
            case 193 -> 243;
            case 194 -> 89;
            case 195 -> 175;
            case 196 -> 35;
            case 197 -> 36;
            case 198 -> 227;
            case 199 -> 194;
            case 200 -> 61;
            case 201 -> 69;
            case 202 -> 187;
            case 203 -> 202;
            case 204 -> 10;
            case 205 -> 186;
            case 206 -> 39;
            case 207 -> 114;
            case 208 -> 1;
            case 209 -> 78;
            case 210 -> 157;
            case 211 -> 137;
            case 212 -> 109;
            case 213 -> 51;
            case 214 -> 148;
            case 215 -> 177;
            case 216 -> 178;
            case 217 -> 219;
            case 218 -> 116;
            case 219 -> 29;
            case 220 -> 225;
            case 221 -> 17;
            case 222 -> 170;
            case 223 -> 0;
            case 224 -> 75;
            case 225 -> 70;
            case 226 -> 32;
            case 227 -> 195;
            case 228 -> 76;
            case 229 -> 48;
            case 230 -> 167;
            case 231 -> 63;
            case 232 -> 56;
            case 233 -> 20;
            case 234 -> 133;
            case 235 -> 100;
            case 236 -> 198;
            case 237 -> 253;
            case 238 -> 57;
            case 239 -> 91;
            case 240 -> 40;
            case 241 -> 115;
            case 242 -> 201;
            case 243 -> 215;
            case 244 -> 189;
            case 245 -> 66;
            case 246 -> 255;
            case 247 -> 96;
            case 248 -> 93;
            case 249 -> 162;
            case 250 -> 86;
            case 251 -> 49;
            case 252 -> 112;
            case 253 -> 44;
            case 254 -> 172;
            default -> 81;
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

         e[var2] = new String(var3).intern();
      }

      return e[var2];
   }

   public IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll(me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var1, me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var2, boolean var3, int var4, kotlin.jvm.internal.DefaultConstructorMarker var5) {
      if ((var4 & 4) != 0) {
         var3 = false;
      }

      this(var1, var2, var3);
   }

}
