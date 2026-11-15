package me.octo.client;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
import me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
import me.octo.client.utils.IllllllIllllIIIIIlIIlIlIIIllIlIllIIlllIIllIlllllllllIIIllIlIIlIIIllIIIIIllIIIIIllllIl;
import me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl;
import me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
import me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
import me.octo.client.utils.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;
import me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
import me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll {
   public static <T> T a(Object p0) { return null; } // PX-FIX mr5
   @NotNull
   private final Function1<lIIlIlIIllIlIllIlIllIllIlIlllllllllIIIIIlIIIIllIIIlllIIllllIIlIIIlIIIIIllIlllllIllIII, Unit> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final Function0<Unit> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String[] a;
   private static String[] b;

   public llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll(
      @NotNull Function1<? super lIIlIlIIllIlIllIlIllIllIlIlllllllllIIIIIlIIIIllIIIlllIIllllIIlIIIlIIIIIllIlllllIllIII, Unit> var1,
      @NotNull Function0<Unit> var2
   ) {
      short var10001 = 32453;
      short var10002 = 24020;
      Intrinsics.checkNotNullParameter(var1, "requestPopup");
      var10001 = 32498;
      var10002 = -3228;
      Intrinsics.checkNotNullParameter(var2, "dismissPopup");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = ((Function1<lIIlIlIIllIlIllIlIllIllIlIlllllllllIIIIIlIIIIllIIIlllIIllllIIlIIIlIIIIIllIlllllIllIII,Unit>)(Object)(var1));
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
   }

   private final List<llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> a() {
       List<llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> result = new ArrayList<>();
       IdentityHashMap<llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII, Boolean> seen = new IdentityHashMap<>();
       for (llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var5
             : llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII) {
          IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI matched = null;
          for (IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var10
                : lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
             if (llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var10) == var5) {
                matched = var10;
                break;
             }
          }
          if (matched != null && seen.put(var5, Boolean.TRUE) == null) {
             result.add(new llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(matched, var5));
          }
       }
       return result;
   }

   @Nullable
   public final IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI b() {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      if (var1 != null) {
         llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000 = (llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)CollectionsKt.getOrNull(
            this.a(), this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         );
         if (var10000 != null) {
            return var10000.a();
         }
      }

      return null;
   }

   @Nullable
   public final llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII c() {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      if (var1 != null) {
         llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000 = (llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)CollectionsKt.getOrNull(
            this.a(), this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         );
         if (var10000 != null) {
            return var10000.b();
         }
      }

      return null;
   }

   @Nullable
   public final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII a(
      float var1, float var2, float var3, float var4, int var5, int var6, float var7
   ) { IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var13 = null; // PX-FIX hoist
        
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var8;
      List var9;
      label65: {
         llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll var22;
         label68: {
            lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
            var9 = this.a();
            var8 = var10000;
            int var21 = ((var9.isEmpty()) ? 1 : 0);
            if (var8 != null) {
               if (var21 != 0) {
                  short var10001 = 32473;
                  short var10002 = 32244;
                  lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
                     .a(
                        "No editable macros found",
                        var1 + var3 / 2.0F,
                        var2 + var4 / 2.0F,
                        IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .c()
                     );
                  return null;
               }

               var22 = this;
               if (var8 == null) {
                  break label68;
               }

               var21 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }

            if (var21 < var9.size()) {
               break label65;
            }

            var22 = this;
         }

         var22.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 0;
      }

      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var10;
      float var11;
      float var12;
      label54: {
         var10 = null;
         var11 = var2 + 6.0F;
         var12 = 84.0F;
          var13 = this.a(
            var9, var1 + 8.0F, var11, var3 - 16.0F, var12, var5, var6
         );
         IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var23 = var13;
         if (var8 != null) {
            if (var13 == null) {
               break label54;
            }

            var23 = var13;
         }

         var10 = var23;
      }

      float var14;
      float var15;
      label70: {
         var14 = var11 + var12 + 10.0F;
         var15 = 34.0F;
         IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var16 = this.a(
            var1 + 8.0F, var14, var3 - 16.0F, var15, var5, var6
         );
         IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var24 = var16;
         if (var8 != null) {
            if (var16 == null) {
               break label70;
            }

            var24 = var10;
         }

         if (var8 != null) {
            if (var24 != null) {
               break label70;
            }

            var24 = var16;
         }

         var10 = var24;
      }

      float var17 = var14 + var15 + 10.0F;
      float var18 = var4 - (var17 - var2) - 8.0F;
      llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var19 = (llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var9.get(
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
      );
      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var20 = this.a(
         var19, var1 + 8.0F, var17, var3 - 16.0F, var18, var5, var6, var7
      );
      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var25 = var20;
      if (var8 != null) {
         if (var20 != null) {
            if (var8 == null) {
               return var10;
            }

            if (var10 == null) {
               var10 = var20;
            }
         }

         var25 = var10;
      }

      return var25;
   }

   private final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII a(
      List<llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> var1,
      float var2,
      float var3,
      float var4,
      float var5,
      int var6,
      int var7
   ) { float var13 = 0.0f; // PX-FIX hoist
        
      Object var41 = null; // PX-FIX
      Object var40 = null; // PX-FIX
      int var37;
      float var9 = 38.0F;
      float var10 = 6.0F;
      float var11 = 6.0F;
      float var12 = var2;
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
       var13 = var3;
      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var14 = null;
      float var15 = 34.0F;
      float var16 = 6.0F;
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var8 = var10000;
      float var17 = 6.0F;
      float var18 = 12.0F;
      Iterator var19 = var1.iterator();
      int var20 = 0;

      while (var19.hasNext()) {
         int var21;
         llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var22;
         String var23;
         String var24;
         float var25;
         float var27;
         var21 = var20++;
         var22 = (llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var19.next();
         var23 = var22.b().a();
         var24 = String.valueOf(
            llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .d(var22.a())
               .size()
         );
         var25 = (float)lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, var23, false, 2, null);
         float var26 = (float)lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, var24, false, 2, null);
         var27 = var16 + var15 + var17 + var25 + 6.0F + var26 + var18;
         if (var12 + var27 > var2 + var4) {
            var12 = var2;
            var13 += var9 + var11;
            if (var13 + var9 > var3 + var5) {
               break;
            }
         }

         var37 = var21 == this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ? 1 : 0;

         int var28 = var37;
         int var29 = var6 >= var12 && var6 <= var12 + var27
            && var7 >= var13 && var7 <= var13 + var9 ? 1 : 0;
         if (var28 != 0) {
            var40 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .h();
         } else {
            var40 = var29 != 0
               ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .g()
               : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .j();
         }

         float var33;
         float var34;
         float var42;
         List var10001;
         String var10002;
         label83: {
            label82: {
               llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var30 =((llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll)( var40));
               llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var31 = var28 != 0
                  ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .z()
                     .a(0.75F)
                  : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .y()
                     .a(0.35F);
               lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                  var12,
                  var13,
                  var27,
                  var9,
                  var30,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .aq()
               );
               lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                  var12,
                  var13,
                  var27,
                  var9,
                  1.0F,
                  var31,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .aq()
               );
               me.octo.client.IIIlllllIIllIlIllIIllIlIIllIIlIIlIIlllIlIIlIlIIIllllIllllllIIIIlIllIlllIIIIIIllIllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var32 = IIIlllllIIllIlIllIIllIlIIllIIlIIlIIlllIlIIlIlIIIllllIllllllIIIIlIllIlllIIIIIIllIllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c(var22.b().d());
               var33 = var12 + var16 - 2.0F;
               var34 = var13 + (var9 - var15) / 2.0F - 1.0F;
               var41 = IllllllIllllIIIIIlIIlIlIIIllIlIllIIlllIIllIlllllllllIIIllIlIIlIIIllIIIIIllIIIIIllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
               var10001 = var32.b();
               var10002 = var32.a();
               int var10006 = var28;
               if (var8 != null) {
                  if (var28 != 0) {
                     break label82;
                  }

                  var10006 = var29;
               }

               if (var10006 == 0) {
                  var42 = 0.9F;
                  break label83;
               }
            }

            var42 = 1.0F;
         }

         ((me.octo.client.utils.IllllllIllllIIIIIlIIlIlIIIllIlIllIIlllIIllIlllllllllIIIllIlIIlIIIllIIIIIllIIIIIllllIl)var41)
            .a(var10001, var10002, var33, var34, var15, var42, true);
         float var35 = var13 + var9 / 2.0F;
         lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.d(
            lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
            var23,
            var12 + var16 + var15 + var17,
            var35,
            var28 != 0
               ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a()
               : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b(),
            false);
         lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.d(
            lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
            var24,
            var12 + var16 + var15 + var17 + var25 + 6.0F,
            var35,
            var28 != 0
               ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c()
               : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c()
                  .a(0.55F),
            false);
         if (var8 != null) {
            if (var29 != 0 && var14 == null) {
               var14 = this.a(() -> a(this, var21));
            }

            var12 += var27 + var10;
         }

         if (var8 == null) {
            break;
         }
      }

      return var14;
   }

   private final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII a(
      float var1, float var2, float var3, float var4, int var5, int var6
   ) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var7;
      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var8;
      float var9;
      float var10;
      float var11;
      int var15;
      label95: {
         label98: {
            var8 = null;
            var9 = 128.0F;
            lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
            var10 = 128.0F;
            var7 = var10000;
            var11 = var1 + var3 - var9;
            float var24;
            var15 = (var24 = var5 - var11) == 0.0F ? 0 : (var24 < 0.0F ? -1 : 1);
            if (var7 != null) {
               if (var15 < 0) {
                  break label98;
               }

               float var25;
               var15 = (var25 = var5 - (var11 + var9)) == 0.0F ? 0 : (var25 < 0.0F ? -1 : 1);
            }

            if (var7 != null) {
               if (var15 > 0) {
                  break label98;
               }

               float var26;
               var15 = (var26 = var6 - var2) == 0.0F ? 0 : (var26 < 0.0F ? -1 : 1);
            }

            if (var7 != null) {
               if (var15 < 0) {
                  break label98;
               }

               float var27;
               var15 = (var27 = var6 - (var2 + var4)) == 0.0F ? 0 : (var27 < 0.0F ? -1 : 1);
            }

            if (var7 == null) {
               break label95;
            }

            if (var15 <= 0) {
               var15 = 1;
               break label95;
            }
         }

         var15 = 0;
      }

      label74: {
         int var12 = var15;
         llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll var16 = this;
         if (var7 != null) {
            short var10005 = 32468;
            short var10006 = -7447;
            var10006 = 32469;
            short var10007 = -2093;
            this.a(
               var11,
               var2,
               var9,
               var4,
               "\n    <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n        <line x1=\"12\" y1=\"5\" x2=\"12\" y2=\"19\"/>\n        <line x1=\"5\" y1=\"12\" x2=\"19\" y2=\"12\"/>\n    </svg>\n",
               "New route",
               (var12 != 0),
               true
            );
            if (var12 == 0) {
               break label74;
            }

            var16 = this;
         }

         var8 = var16.a(() -> {
            this.d();
            return Unit.INSTANCE;
         });
      }

      float var13;
      label68: {
         label99: {
            var13 = var11 - var10 - 8.0F;
            float var28;
            var15 = (var28 = var5 - var13) == 0.0F ? 0 : (var28 < 0.0F ? -1 : 1);
            if (var7 != null) {
               if (var15 < 0) {
                  break label99;
               }

               float var29;
               var15 = (var29 = var5 - (var13 + var10)) == 0.0F ? 0 : (var29 < 0.0F ? -1 : 1);
            }

            if (var7 != null) {
               if (var15 > 0) {
                  break label99;
               }

               float var30;
               var15 = (var30 = var6 - var2) == 0.0F ? 0 : (var30 < 0.0F ? -1 : 1);
            }

            if (var7 != null) {
               if (var15 < 0) {
                  break label99;
               }

               float var31;
               var15 = (var31 = var6 - (var2 + var4)) == 0.0F ? 0 : (var31 < 0.0F ? -1 : 1);
            }

            if (var7 == null) {
               break label68;
            }

            if (var15 <= 0) {
               var15 = 1;
               break label68;
            }
         }

         var15 = 0;
      }

      int var14 = var15;
      short var19 = 32461;
      short var21 = 21469;
      var21 = 32481;
      short var23 = 22290;
      this.a(
         var13,
         var2,
         var10,
         var4,
         "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n            <path d=\"M21 15v4a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2v-4\"/>\n            <polyline points=\"7,10 12,15 17,10\"/>\n            <line x1=\"12\" y1=\"15\" x2=\"12\" y2=\"3\"/>\n        </svg>\n    ",
         "Import",
         (var14 != 0),
         false
      );
      if (var14 != 0) {
         if (var7 == null) {
            return var8;
         }

         if (var8 == null) {
            var8 = this.a(() -> {
               this.e();
               return Unit.INSTANCE;
            });
         }
      }

      return var8;
   }

   private final void a(float var1, float var2, float var3, float var4, String var5, String var6, boolean var7, boolean var8) { llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var13 = null; // PX-FIX hoist
        
      Object var24 = null; // PX-FIX
      Object var22 = null; // PX-FIX
      Object var20 = null; // PX-FIX
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      short var10003 = 32467;
      short var10004 = -1660;
      float var10 = lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
         lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         "editortab:btn:" + var6,
         var7,
         0.0F,
         4,
         null
      );
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var9 = var10000;
      float var25;
      int var19 = (var25 = var10 - 0.01F) == 0.0F ? 0 : (var25 < 0.0F ? -1 : 1);
      if (var9 != null) {
         if (var19 > 0) {
            lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
               lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               var1,
               var2,
               var3,
               var4,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .aq(),
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ah(),
               var10 * (!var8 ? 0.6F : 0.45F),
               4.0F);
         }

         var19 =(( var8) ? 1 : 0);
      }

      label78: {
         label73:
         if (var9 != null) {
            if (var19 != 0) {
               var19 =(( var7) ? 1 : 0);
               if (var9 == null) {
                  break label73;
               }

               if (!var7) {
                  var20 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .g()
                     .b(6.0F, 6.0F, 6.0F);
                  break label78;
               }
            }

            var19 =(( var8) ? 1 : 0);
         }

         if (var9 != null) {
            if (var19 != 0) {
               var20 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .h();
               break label78;
            }

            var19 =(( var7) ? 1 : 0);
         }

         var20 = var19 != 0
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .g()
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .j();
      }

      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var11;
      label59: {
         label58: {
            var11 =((llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll)( var20));
            byte var21 =((byte)(( var8) ? 1 : 0));
            if (var9 != null) {
               if (!var8) {
                  break label58;
               }

               var21 =((byte)(( var7) ? 1 : 0));
            }

            if (var21 == 0) {
               var22 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .y()
                  .a(0.4F);
               break label59;
            }
         }

         var22 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .z()
            .a(0.7F);
      }

      label50: {
         label49: {
            llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var12 =((llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll)( var22));
            lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var1,
               var2,
               var3,
               var4,
               var11,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .aq()
            );
            lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var1,
               var2,
               var3,
               var4,
               1.0F,
               var12,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .aq()
            );
            byte var23 =((byte)(( var8) ? 1 : 0));
            if (var9 != null) {
               if (!var8) {
                  break label49;
               }

               var23 =((byte)(( var7) ? 1 : 0));
            }

            if (var23 == 0) {
               var24 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b();
               break label50;
            }
         }

         var24 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a();
      }

       var13 =((llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll)( var24));
      float var14 = 16.0F;
      float var15 = (float)lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, var6, false, 2, null);
      float var16 = var14 + 10.0F + var15;
      float var17 = var1 + (var3 - var16) / 2.0F;
      float var18 = var2 + var4 / 2.0F;
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(var5, var17, var18 - var14 / 2.0F + 0.5F, var14, var13, 1.0F);
      lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.d(
         lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         var6,
         var17 + var14 + 10.0F,
         var18,
         var13,
         false);
   }

   private final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII a(
      llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1,
      float var2,
      float var3,
      float var4,
      float var5,
      int var6,
      int var7,
      float var8
   ) {
      Object var48 = null; // PX-FIX
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var9;
      List var10;
      byte var11;
      float var12;
      float var13;
      float var14;
      float var15;
      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var16;
      int var42;
      label140: {
         label143: {
            var10 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .d(var1.a());
            lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
            var11 = 2;
            var9 = var10000;
            var12 = 10.0F;
            var13 = 10.0F;
            var14 = (var4 - var12) / var11;
            var15 = 70.0F;
            var16 = null;
            float var49;
            var42 = (var49 = var6 - var2) == 0.0F ? 0 : (var49 < 0.0F ? -1 : 1);
            if (var9 != null) {
               if (var42 < 0) {
                  break label143;
               }

               float var50;
               var42 = (var50 = var6 - (var2 + var14)) == 0.0F ? 0 : (var50 < 0.0F ? -1 : 1);
            }

            if (var9 != null) {
               if (var42 > 0) {
                  break label143;
               }

               float var51;
               var42 = (var51 = var7 - var3) == 0.0F ? 0 : (var51 < 0.0F ? -1 : 1);
            }

            if (var9 != null) {
               if (var42 < 0) {
                  break label143;
               }

               float var52;
               var42 = (var52 = var7 - (var3 + var15)) == 0.0F ? 0 : (var52 < 0.0F ? -1 : 1);
            }

            if (var9 == null) {
               break label140;
            }

            if (var42 <= 0) {
               var42 = 1;
               break label140;
            }
         }

         var42 = 0;
      }

      label119: {
         int var19 = var42;
         llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll var43 = this;
         if (var9 != null) {
            this.a(var2, var3, var14, var15, (var19 != 0));
            if (var19 == 0) {
               break label119;
            }

            var43 = this;
         }

         var16 = this.a(() -> c(this));
      }

      String var20 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .c(var1.a());
      Iterable var21 = var10;
      boolean var22 = false;
      int var23 = 0;

      for (Object var25 : var21) {
         int var26 = var23++;
         if (var9 != null) {
            var42 = var26;
            if (var9 != null) {
               if (var26 < 0) {
                  CollectionsKt.throwIndexOverflow();
               }

               var42 = var26;
            }

            String var27 = (String)var25;
            int var28 = var42;
            boolean var29 = false;
            int var30 = var28 + 1;
            int var31 = var30 % var11;
            int var32 = var30 / var11;
            float var33 = var2 + var31 * (var14 + var12);
            float var34 = var3 + var32 * (var15 + var13);
            if (var9 != null && !(var34 + var15 > var3 + var5)) {
               int var35;
               label103: {
                  label147: {
                     var35 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .b(var1.a(), var27);
                     float var53;
                     var42 = (var53 = var6 - var33) == 0.0F ? 0 : (var53 < 0.0F ? -1 : 1);
                     if (var9 != null) {
                        if (var42 < 0) {
                           break label147;
                        }

                        float var54;
                        var42 = (var54 = var6 - (var33 + var14)) == 0.0F ? 0 : (var54 < 0.0F ? -1 : 1);
                     }

                     if (var9 != null) {
                        if (var42 > 0) {
                           break label147;
                        }

                        float var55;
                        var42 = (var55 = var7 - var34) == 0.0F ? 0 : (var55 < 0.0F ? -1 : 1);
                     }

                     if (var9 != null) {
                        if (var42 < 0) {
                           break label147;
                        }

                        float var56;
                        var42 = (var56 = var7 - (var34 + var15)) == 0.0F ? 0 : (var56 < 0.0F ? -1 : 1);
                     }

                     if (var9 == null) {
                        break label103;
                     }

                     if (var42 <= 0) {
                        var42 = 1;
                        break label103;
                     }
                  }

                  var42 = 0;
               }

               int var36 = var42;
               byte var37 = ((byte)((llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b(var1.b(), var27)) ? 1 : 0));
               boolean var38 = Intrinsics.areEqual(var27, var20);
               int var39 = this.a(var33, var34, var14, var15, var27, var35, (var36 != 0), var6, var7, (var37 != 0), var38);
               if (var36 != 0 && var16 == null) {
                  label80: {
                     IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var40 = var1.a();
                     llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var41 = var1.b();
                     var42 = var37;
                     if (var9 != null) {
                        if (var37 != 0) {
                           var48 = this.a(() -> c(var40, var27));
                           break label80;
                        }

                        var42 = var39;
                     }

                     switch (var42) {
                        case 0:
                           var48 = this.a(() -> c(var40, var27));
                           break;
                        case 1:
                           var48 = this.a(() -> a(this, var41, var27));
                           break;
                        case 2:
                           var48 = this.a(() -> b(this, var41, var27));
                           break;
                        default:
                           var48 = this.a(() -> d(var40, var27));
                     }
                  }

                  var16 =((IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII)( var48));
               }
            }

            if (var9 != null) {
               continue;
            }
         }
         break;
      }

      return var16;
   }

   private final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII a(final Function0<Unit> var1) {
      return new IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII() {
         public void e() {
            var1.invoke();
         }

         public void a(char var1x, int var2) {
         }
      };
   }

   private final void a(float var1, float var2, float var3, float var4, boolean var5) { float var13 = 0.0f; // PX-FIX hoist
        
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      short var10002 = 32475;
      short var10003 = -17321;
      float var7 = lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
         lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         "editortab:createcard",
         var5,
         0.0F,
         4,
         null
      );
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var6 = var10000;
      float var19;
      int var15 = (var19 = var7 - 0.01F) == 0.0F ? 0 : (var19 < 0.0F ? -1 : 1);
      if (var6 != null) {
         if (var15 > 0) {
            lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
               lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               var1,
               var2,
               var3,
               var4,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .aq(),
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ah(),
               var7 * 0.4F,
               4.0F);
         }

         var15 =(( var5) ? 1 : 0);
      }

      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var8 = var15 != 0
         ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .g()
         : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e()
            .a(0.6F);
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var4,
         var8,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .aq()
      );
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var4,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(!var5 ? 0.8F : 0.35F),
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .aq()
      );
      short var16 = 32501;
      short var10001 = -32671;
      String var9 = "Create new route";
      float var10 = (float)lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, var9, false, 2, null);
      float var11 = 12.0F;
      float var12 = var11 + 8.0F + var10;
       var13 = var1 + (var3 - var12) / 2.0F;
      float var14 = var2 + var4 / 2.0F;
      var10001 = 32509;
      var10002 = -20693;
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            "\n    <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n        <line x1=\"12\" y1=\"5\" x2=\"12\" y2=\"19\"/>\n        <line x1=\"5\" y1=\"12\" x2=\"19\" y2=\"12\"/>\n    </svg>\n",
            var13,
            var14 - var11 / 2.0F,
            var11,
            !var5
               ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a()
               : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c(),
            1.0F
         );
      lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.d(
         lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         var9,
         var13 + var11 + 8.0F,
         var14,
         !var5
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .c(),
         false);
   }

   private final int a(float var1, float var2, float var3, float var4, String var5, int var6, boolean var7, int var8, int var9, boolean var10, boolean var11) { float var13 = 0.0f; // PX-FIX hoist
        
      float var48 = 0; // PX-FIX
      Object var41 = null; // PX-FIX
      Object var39 = null; // PX-FIX
      Object var36 = null; // PX-FIX
      Object var34 = null; // PX-FIX
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var12;
      short var46;
      String var10001;
      label139: {
         label142: {
            var12 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
            var46 = 32489;
            short var10003 = 27274;
            var10001 = "editortab:routecard:" + var5;
            var46 =((short)(( var7) ? 1 : 0));
            if (var12 != null) {
               if (var7) {
                  break label142;
               }

               var46 =((short)(( var11) ? 1 : 0));
            }

            if (var12 == null) {
               break label139;
            }

            if (var46 == 0) {
               var46 = 1;
               break label139;
            }
         }

         var46 = 0;
      }

      int var33;
      label128: {
         label143: {
             var13 = lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
                lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                var10001,
                (var46 != 0),
                0.0F,
                4,
                null
             );
            float var58;
            var33 = (var58 = var13 - 0.01F) == 0.0F ? 0 : (var58 < 0.0F ? -1 : 1);
            if (var12 != null) {
               if (var33 <= 0) {
                  var33 =(( var11) ? 1 : 0);
                  if (var12 == null) {
                     break label128;
                  }

                  if (var11) {
                     break label143;
                  }
               }

               var33 =(( var11) ? 1 : 0);
            }

            float var14 = var33 != 0 ? 0.55F : var13 * 0.4F;
            lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
               lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               var1,
               var2,
               var3,
               var4,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .aq(),
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ah(),
               var14,
               4.0F);
         }

         var33 =(( var11) ? 1 : 0);
      }

      label117: {
         if (var12 != null) {
            if (var33 != 0) {
               var34 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .h()
                  .a(0.35F);
               break label117;
            }

            var33 =(( var7) ? 1 : 0);
         }

         var34 = var33 != 0
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .g()
               .b(3.0F, 3.0F, 3.0F)
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .j();
      }

      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var31;
      label111: {
         var31 =((llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll)( var34));
         byte var35 =((byte)(( var11) ? 1 : 0));
         if (var12 != null) {
            if (!var11) {
               var36 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .z()
                  .a(0.9F);
               break label111;
            }

            var35 =((byte)(( var7) ? 1 : 0));
         }

         var36 = var35 != 0
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .z()
               .a(0.7F)
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .y()
               .a(0.35F);
      }

      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var15 =((llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll)( var36));
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var4,
         var31,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .aq()
      );
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var4,
         1.0F,
         var15,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .aq()
      );
      float var16 = var1 + 16.0F;
      float var17 = var2 + var4 / 2.0F;
      String var37 = var5;
      if (var12 != null) {
         if (var5.length() > 22) {
            String var38 = var5.substring(0, 21);
            var46 = 32455;
            short var51 = 18694;
            Intrinsics.checkNotNullExpressionValue(var38, "substring(...)");
            var37 = var38 + "…";
         } else {
            var37 = var5;
         }
      }

      String var18;
      double var52;
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var53;
      label104: {
         label103: {
            var18 = var37;
            var39 = lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
            var48 = var16;
            var52 = var17 - 9.0F;
            byte var10004 =((byte)(( var7) ? 1 : 0));
            if (var12 != null) {
               if (!var7) {
                  break label103;
               }

               var10004 =((byte)(( var11) ? 1 : 0));
            }

            if (var10004 == 0) {
               var53 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a()
                  .a(0.92F);
               break label104;
            }
         }

         var53 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a();
      }

      label95: {
         lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.d(var39, var18, var48, var52, var53, false);
         var33 =(( var10) ? 1 : 0);
         if (var12 != null) {
            if (!var10) {
               short var45 = 32494;
               var46 = 14613;
               var41 = var6 + " waypoints · preset";
               break label95;
            }

            var33 = var6;
         }

         short var44 = 32450;
         var46 = -18924;
         var41 = var33 + " waypoints";
      }

      String var19 =((String)( var41));
      lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.d(
         lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         var19,
         var16,
         var17 + 10.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c(),
         false);
      byte var42 =((byte)(( var10) ? 1 : 0));
      if (var12 != null) {
         if (var10) {
            float var20 = 54.0F;
            float var21 = 40.0F;
            float var22 = 28.0F;
            float var23 = 8.0F;
            float var24 = var1 + var3 - 16.0F;
            float var25 = var24 - var20;
            float var26 = var2 + (var4 - var21) / 2.0F;
            float var27 = var25 - var22 - var23;
            float var28 = var27 - var22 - var23;
            float var29 = var2 + (var4 - var22) / 2.0F;
            byte var30 = -1;
            short var54 = 32487;
            short var10005 = -1600;
            var42 = ((byte)((this.a(
               var28,
               var29,
               var22,
               "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n            <line x1=\"18\" y1=\"6\" x2=\"6\" y2=\"18\"/>\n            <line x1=\"6\" y1=\"6\" x2=\"18\" y2=\"18\"/>\n        </svg>\n    ",
               var8,
               var9
            )) ? 1 : 0));
            if (var12 != null) {
               if (var42 != 0) {
                  var30 = 2;
               }

               short var55 = 32465;
               var10005 = 18409;
               var42 = ((byte)((this.a(
                  var27,
                  var29,
                  var22,
                  "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n            <path d=\"M21 15v4a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2v-4\"/>\n            <polyline points=\"17,8 12,3 7,8\"/>\n            <line x1=\"12\" y1=\"3\" x2=\"12\" y2=\"15\"/>\n        </svg>\n    ",
                  var8,
                  var9
               )) ? 1 : 0));
            }

            if (var12 != null) {
               if (var42 != 0) {
                  var30 = 1;
               }

               var10005 = 32511;
               short var10006 = -3936;
               var42 = ((byte)((this.a(
                  var25,
                  var26,
                  var20,
                  var21,
                  "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n            <path d=\"M11 4H4a2 2 0 0 0-2 2v14a2 2 0 0 0 2 2h14a2 2 0 0 0 2-2v-7\"/>\n            <path d=\"m18.5 2.5 3 3L12 15l-4 1 1-4 9.5-9.5z\"/>\n        </svg>\n    ",
                  var8,
                  var9
               )) ? 1 : 0));
            }

            if (var12 != null) {
               if (var42 != 0) {
                  var30 = 0;
               }

               var42 = var30;
            }

            return var42;
         }

         var42 = -1;
      }

      return var42;
   }

   private final boolean a(float var1, float var2, float var3, float var4, String var5, int var6, int var7) { float var13 = 0.0f; // PX-FIX hoist
        
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var8;
      int var10000;
      label61: {
         label64: {
            var8 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
            float var15;
            var10000 = (var15 = var6 - var1) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
            if (var8 != null) {
               if (var10000 < 0) {
                  break label64;
               }

               float var16;
               var10000 = (var16 = var6 - (var1 + var3)) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1);
            }

            if (var8 != null) {
               if (var10000 > 0) {
                  break label64;
               }

               float var17;
               var10000 = (var17 = var7 - var2) == 0.0F ? 0 : (var17 < 0.0F ? -1 : 1);
            }

            if (var8 != null) {
               if (var10000 < 0) {
                  break label64;
               }

               float var18;
               var10000 = (var18 = var7 - (var2 + var4)) == 0.0F ? 0 : (var18 < 0.0F ? -1 : 1);
            }

            if (var8 == null) {
               break label61;
            }

            if (var10000 <= 0) {
               var10000 = 1;
               break label61;
            }
         }

         var10000 = 0;
      }

      int var9 = var10000;
      short var10003 = 32506;
      short var10004 = -20446;
      float var10 = var9 != 0 ? 1.0F : 0.0F;
      float var19;
      var10000 = (var19 = var10 - 0.01F) == 0.0F ? 0 : (var19 < 0.0F ? -1 : 1);
      if (var8 != null) {
         if (var10000 > 0) {
            lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
               lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               var1,
               var2,
               var3,
               var4,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .aq(),
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ah(),
               var10 * 0.55F,
               4.0F);
         }

         var10000 = var9;
      }

      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var11 = var10000 != 0
         ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .h()
            .b(8.0F, 8.0F, 8.0F)
         : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .h();
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var12 = var9 != 0
         ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .z()
            .a(0.8F)
         : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(0.5F);
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var4,
         var11,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .aq()
      );
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var4,
         1.0F,
         var12,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .aq()
      );
       var13 = 20.0F;
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            var5,
            var1 + (var3 - var13) / 2.0F,
            var2 + (var4 - var13) / 2.0F,
            var13,
            var9 != 0
               ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a()
               : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a()
                  .a(0.9F),
            1.0F
         );
      return (var9 != 0);
   }

   private final boolean a(float var1, float var2, float var3, String var4, int var5, int var6) {
      int var10000;
      label53: {
         label56: {
            lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var7 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
            float var11;
            var10000 = (var11 = var5 - var1) == 0.0F ? 0 : (var11 < 0.0F ? -1 : 1);
            if (var7 != null) {
               if (var10000 < 0) {
                  break label56;
               }

               float var12;
               var10000 = (var12 = var5 - (var1 + var3)) == 0.0F ? 0 : (var12 < 0.0F ? -1 : 1);
            }

            if (var7 != null) {
               if (var10000 > 0) {
                  break label56;
               }

               float var13;
               var10000 = (var13 = var6 - var2) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
            }

            if (var7 != null) {
               if (var10000 < 0) {
                  break label56;
               }

               float var14;
               var10000 = (var14 = var6 - (var2 + var3)) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
            }

            if (var7 == null) {
               break label53;
            }

            if (var10000 <= 0) {
               var10000 = 1;
               break label53;
            }
         }

         var10000 = 0;
      }

      int var8 = var10000;
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var9 = var8 != 0
         ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .g()
         : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e()
            .a(0.3F);
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var1, var2, var3, var3, var9, 6.0F);
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var3,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(var8 != 0 ? 0.5F : 0.2F),
         6.0F
      );
      float var10 = var3 - 14.0F;
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            var4,
            var1 + (var3 - var10) / 2.0F,
            var2 + (var3 - var10) / 2.0F,
            var10,
            var8 != 0
               ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a()
               : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b(),
            1.0F
         );
      return (var8 != 0);
   }

   private final void d() {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      if (var1 != null) {
         llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000 = (llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)CollectionsKt.getOrNull(
            this.a(), this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         );
         if (var10000 != null) {
            llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2 = var10000;
            Function1 var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            short var10003 = 32471;
            short var10004 = 17557;
            String var4 = var2.b().a();
            short var10005 = 32486;
            short var10006 = -1785;
            String var5 = var4 + " · New file";
            var10006 = 32502;
            short var10007 = -25934;
            var3.invoke(
               new lIIlIlIIllIlIllIlIllIllIlIlllllllllIIIIIlIIIIllIIIlllIIllllIIlIIIlIIIIIllIlllllIllIII(
                  "New route",
                  var5,
                  "",
                  "Create",
                  null,
                  (kotlin.jvm.functions.Function1<String, Unit>) name -> a(this, var2, name),
                  null,
                  this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                  80,
                  null
               )
            );
            return;
         }
      }
   }

   private final void e() { short var13 = (short)0; // PX-FIX hoist
        
      String var2;
      boolean var6;
      label30: {
         label33: {
            lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
            var2 = llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g();
            lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var10000;
            CharSequence var3 = var2;
            CharSequence var5 = var3;
            if (var1 != null) {
               if (var3 == null) {
                  break label33;
               }

               var5 = var3;
            }

            var6 = StringsKt.isBlank(var5);
            if (var1 == null) {
               break label30;
            }

            if (!var6) {
               var6 = false;
               break label30;
            }
         }

         var6 = true;
      }

      if (var6) {
         short var10002 = 32451;
         short var9 = 26054;
         var9 = 32464;
          var13 = 15979;
         IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(
               3000L,
               "Route editor",
               "Clipboard is empty",
               IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            );
      } else {
         llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var7 = (llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)CollectionsKt.getOrNull(
            this.a(), this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         );
         if (var7 != null) {
            llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var4 = var7;
            Function1 var8 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            short var10003 = 32496;
            short var10004 = -27068;
            String var11 = var4.b().a();
            short var10005 = 32463;
            short var10006 = -24902;
            String var12 = var11 + " · name the imported route";
            long var14 = System.currentTimeMillis() % 100000;
            var10006 = 32507;
            short var10007 = -2772;
            String var15 = "imported_" + var14;
            var10006 = 32497;
            var10007 = -27557;
            var8.invoke(
               new lIIlIlIIllIlIllIlIllIllIlIlllllllllIIIIIlIIIIllIIIlllIIllllIIlIIIlIIIIIllIlllllIllIII(
                  "Import from clipboard",
                  var12,
                  var15,
                  "Create",
                  null,
                  (kotlin.jvm.functions.Function1<String, Unit>) rawName -> a(this, var4, var2, rawName),
                  null,
                  this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                  80,
                  null
               )
            );
         }
      }
   }

   private final void a(IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var1, String var2) { String var13 = null; // PX-FIX hoist
        
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      String var4 = this.a(var2);
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = var10000;
      int var15 = var4.length();
      if (var3 != null) {
         var15 = var15 == 0 ? 1 : 0;
      }

      if (var15 != 0) {
         short var25 = 32451;
         short var32 = 26054;
         var32 = 32503;
         short var38 = -6002;
         IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(
               3000L,
               "Route editor",
               "Invalid name",
               IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            );
      } else {
         llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var16 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(var1);
         if (var16 != null) {
            llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var5 = var16;
            llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI var6 = new llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI(
               var5.b()
            );
            llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var17 = var5;
            if (var3 != null) {
               if (var5.g()
                  == llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                  )
                {
                  boolean var18 = var6.e(var4);
                  if (var3 != null) {
                     if (var18) {
                        short var24 = 32451;
                        short var30 = 26054;
                        var30 = 32499;
                        short var37 = -19573;
                        IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .b(
                              3000L,
                              "Route editor",
                              "Route already exists",
                              IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                           );
                        return;
                     }

                     var6.a(
                        var4,
                        new IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll(
                           CollectionsKt.emptyList(), null, null, null, 14, null
                        )
                     );
                  }

                  short var10002 = 32451;
                  short var10003 = 26054;
                  short var10004 = 32472;
                  short var10005 = 32575;
                  IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(
                        2500L,
                        "Route editor",
                        "Created " + var4,
                        IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                     );
                  llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .c(var1, var4);
                  if (var3 != null) {
                     return;
                  }
               }

               var17 = var5;
            }

            boolean var19 = var17.i().isEmpty();
            if (var3 != null) {
               var19 = !var19;
            }

            if (var19) {
               Iterable var7 = var5.i();
               boolean var8 = false;

               label67: {
                  for (Object var10 : var7) {
                     String var11 = (String)var10;
                     boolean var12 = false;
                     var6.a(
                        var4,
                        var11,
                        new IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll(
                           CollectionsKt.emptyList(), null, null, null, 14, null
                        )
                     );
                     if (var3 == null) {
                        break label67;
                     }

                     if (var3 == null) {
                        break;
                     }
                  }

                  short var21 = 32451;
                  short var26 = 26054;
                  short var34 = 32480;
                  short var39 = -31100;
                  IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(
                        2500L,
                        "Route editor",
                        "Created folder " + var4,
                        IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                     );
                  llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .c(var1, var4);
               }

               if (var3 != null) {
                  return;
               }
            }

            boolean var20 = var5.h().isEmpty();
            if (var3 != null) {
               var20 = !var20;
            }

            if (var20) {
                var13 = (String)CollectionsKt.first(var5.h());
               var6.a(
                  var13,
                  var4,
                  new IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll(
                     CollectionsKt.emptyList(), null, null, null, 14, null
                  )
               );
               String var14 = var13 + "/" + var4;
               short var22 = 32451;
               short var27 = 26054;
               short var35 = 32495;
               short var40 = -19396;
               IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b(
                     2500L,
                     "Route editor",
                     "Created " + var14,
                     IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                  );
               llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c(var1, var14);
               if (var3 != null) {
                  return;
               }
            }

            short var23 = 32451;
            short var28 = 26054;
            var28 = 32462;
            short var36 = -18692;
            IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(
                  3000L,
                  "Route editor",
                  "This editor has no save target",
                  IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
               );
         }
      }
   }

   private final void a(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII param1, String param2) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = me.octo.client.IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      me.octo.client.llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI var4 = new me.octo.client.llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI(param1.b());
      if (param2.contains("/") && param1.i().isEmpty()) {
         char[] var7c = new char[]{'/'};
         java.util.List var6 = java.util.Arrays.asList(param2.split("/"));
         java.nio.file.Path var7 = me.octo.client.lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(param1.b(), (String)var6.get(0), (String)var6.get(1));
         if (var7.toFile().exists()) {
         boolean var8;
         try {
            var8 = var7.toFile().delete();
         } catch (Exception var9) {
            var8 = false;
         }
         boolean var5 = param1.g() == me.octo.client.llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ? var4.d(param2) : var4.c(param2);
         if (var5) {
            me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(2500L, "Route editor", "Deleted " + param2, me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         } else {
            me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(3000L, "Route editor", "Delete failed", me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         }
         }
      }
   }

   private final void b(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i ()[Lme/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
      // 003: new me/octo/client/llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI
      // 006: dup
      // 007: aload 1
      // 008: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.b ()Ljava/lang/String;
      // 00b: invokespecial me/octo/client/llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI.<init> (Ljava/lang/String;)V
      // 00e: astore 4
      // 010: astore 3
      // 011: nop
      // 012: nop
      // 013: aload 2
      // 014: checkcast java/lang/CharSequence
      // 017: bipush 47
      // 019: bipush 0
      // 01a: bipush 2
      // 01b: aconst_null
      // 01c: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;CZILjava/lang/Object;)Z
      // 01f: aload 3
      // 020: ifnull 048
      // 023: ifeq 0a4
      // 026: goto 02d
      // 029: invokestatic me/octo/client/llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02c: athrow
      // 02d: aload 1
      // 02e: aload 3
      // 02f: ifnull 0a5
      // 032: goto 039
      // 035: invokestatic me/octo/client/llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 038: athrow
      // 039: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.i ()Ljava/util/List;
      // 03c: invokeinterface java/util/List.isEmpty ()Z 1
      // 041: goto 048
      // 044: invokestatic me/octo/client/llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 047: athrow
      // 048: ifeq 0a4
      // 04b: aload 2
      // 04c: checkcast java/lang/CharSequence
      // 04f: bipush 1
      // 050: newarray 5
      // 052: astore 7
      // 054: aload 7
      // 056: bipush 0
      // 057: bipush 47
      // 059: castore
      // 05a: aload 7
      // 05c: bipush 0
      // 05d: bipush 2
      // 05e: bipush 2
      // 05f: aconst_null
      // 060: invokestatic kotlin/text/StringsKt.split$default (Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;
      // 063: astore 6
      // 065: aload 3
      // 066: ifnull 0a0
      // 069: aload 4
      // 06b: aload 6
      // 06d: bipush 0
      // 06e: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 073: checkcast java/lang/String
      // 076: aload 6
      // 078: bipush 1
      // 079: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 07e: checkcast java/lang/String
      // 081: invokevirtual me/octo/client/llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI.a (Ljava/lang/String;Ljava/lang/String;)Lme/octo/client/IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll;
      // 084: dup
      // 085: ifnull 09f
      // 088: goto 08f
      // 08b: invokestatic me/octo/client/llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08e: athrow
      // 08f: astore 9
      // 091: bipush 0
      // 092: istore 10
      // 094: getstatic me/octo/client/utils/llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII;
      // 097: aload 9
      // 099: invokevirtual me/octo/client/utils/llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.a (Ljava/lang/Object;)Ljava/lang/String;
      // 09c: goto 1ef
      // 09f: pop
      // 0a0: aconst_null
      // 0a1: goto 1ef
      // 0a4: aload 1
      // 0a5: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.g ()Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 0a8: getstatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 0ab: aload 3
      // 0ac: ifnull 0e6
      // 0af: if_acmpne 0df
      // 0b2: goto 0b9
      // 0b5: invokestatic me/octo/client/llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b8: athrow
      // 0b9: aload 4
      // 0bb: aload 2
      // 0bc: invokevirtual me/octo/client/llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI.a (Ljava/lang/String;)Lme/octo/client/IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll;
      // 0bf: dup
      // 0c0: ifnull 0da
      // 0c3: goto 0ca
      // 0c6: invokestatic me/octo/client/llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c9: athrow
      // 0ca: astore 8
      // 0cc: bipush 0
      // 0cd: istore 9
      // 0cf: getstatic me/octo/client/utils/llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII;
      // 0d2: aload 8
      // 0d4: invokevirtual me/octo/client/utils/llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.a (Ljava/lang/Object;)Ljava/lang/String;
      // 0d7: goto 1ef
      // 0da: pop
      // 0db: aconst_null
      // 0dc: goto 1ef
      // 0df: aload 1
      // 0e0: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.g ()Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 0e3: getstatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 0e6: aload 3
      // 0e7: ifnull 1a2
      // 0ea: if_acmpne 190
      // 0ed: goto 0f4
      // 0f0: invokestatic me/octo/client/llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f3: athrow
      // 0f4: aload 1
      // 0f5: aload 3
      // 0f6: ifnull 191
      // 0f9: goto 100
      // 0fc: invokestatic me/octo/client/llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ff: athrow
      // 100: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.i ()Ljava/util/List;
      // 103: invokeinterface java/util/List.size ()I 1
      // 108: bipush 1
      // 109: if_icmple 190
      // 10c: goto 113
      // 10f: invokestatic me/octo/client/llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 112: athrow
      // 113: new com/google/gson/JsonObject
      // 116: dup
      // 117: invokespecial com/google/gson/JsonObject.<init> ()V
      // 11a: astore 6
      // 11c: aload 1
      // 11d: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.i ()Ljava/util/List;
      // 120: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 125: astore 7
      // 127: aload 7
      // 129: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 12e: ifeq 185
      // 131: aload 7
      // 133: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 138: checkcast java/lang/String
      // 13b: aload 3
      // 13c: ifnull 18d
      // 13f: astore 8
      // 141: aload 3
      // 142: ifnull 160
      // 145: aload 4
      // 147: aload 2
      // 148: aload 8
      // 14a: invokevirtual me/octo/client/llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI.a (Ljava/lang/String;Ljava/lang/String;)Lme/octo/client/IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll;
      // 14d: dup
      // 14e: ifnonnull 170
      // 151: goto 158
      // 154: invokestatic me/octo/client/llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 157: athrow
      // 158: pop
      // 159: goto 160
      // 15c: invokestatic me/octo/client/llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15f: athrow
      // 160: new me/octo/client/IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll
      // 163: dup
      // 164: invokestatic kotlin/collections/CollectionsKt.emptyList ()Ljava/util/List;
      // 167: aconst_null
      // 168: aconst_null
      // 169: aconst_null
      // 16a: bipush 14
      // 16c: aconst_null
      // 16d: invokespecial me/octo/client/IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll.<init> (Ljava/util/List;Ljava/lang/String;Lme/octo/client/IIIllIlIIlIllIlIlllIlIllIIllIIlIlIllIlIlllIlIlIllIIIIIlIlIllllIlIlIIIIIIlIIIIllllIllI;Lme/octo/client/lIIIllIlllIlIIIlIIlIIlIIlIlIlIIllIlIlllIIlIlllllIllllIIIllllllIIllllIIIIIIIlIlIllIlll;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
      // 170: astore 9
      // 172: aload 6
      // 174: aload 8
      // 176: getstatic me/octo/client/utils/llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII;
      // 179: aload 9
      // 17b: invokevirtual me/octo/client/utils/llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.c (Ljava/lang/Object;)Lcom/google/gson/JsonElement;
      // 17e: invokevirtual com/google/gson/JsonObject.add (Ljava/lang/String;Lcom/google/gson/JsonElement;)V
      // 181: aload 3
      // 182: ifnonnull 127
      // 185: getstatic me/octo/client/utils/llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII;
      // 188: aload 6
      // 18a: invokevirtual me/octo/client/utils/llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.a (Ljava/lang/Object;)Ljava/lang/String;
      // 18d: goto 1ef
      // 190: aload 1
      // 191: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.g ()Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 194: aload 3
      // 195: ifnull 1b3
      // 198: getstatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 19b: goto 1a2
      // 19e: invokestatic me/octo/client/llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a1: athrow
      // 1a2: if_acmpne 1ee
      // 1a5: aload 1
      // 1a6: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.i ()Ljava/util/List;
      // 1a9: invokestatic kotlin/collections/CollectionsKt.firstOrNull (Ljava/util/List;)Ljava/lang/Object;
      // 1ac: goto 1b3
      // 1af: invokestatic me/octo/client/llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b2: athrow
      // 1b3: checkcast java/lang/String
      // 1b6: dup
      // 1b7: ifnonnull 1c0
      // 1ba: pop
      // 1bb: return
      // 1bc: invokestatic me/octo/client/llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bf: athrow
      // 1c0: astore 6
      // 1c2: aload 3
      // 1c3: ifnull 1ea
      // 1c6: aload 4
      // 1c8: aload 2
      // 1c9: aload 6
      // 1cb: invokevirtual me/octo/client/llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI.a (Ljava/lang/String;Ljava/lang/String;)Lme/octo/client/IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll;
      // 1ce: dup
      // 1cf: ifnull 1e9
      // 1d2: goto 1d9
      // 1d5: invokestatic me/octo/client/llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d8: athrow
      // 1d9: astore 9
      // 1db: bipush 0
      // 1dc: istore 10
      // 1de: getstatic me/octo/client/utils/llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII;
      // 1e1: aload 9
      // 1e3: invokevirtual me/octo/client/utils/llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.a (Ljava/lang/Object;)Ljava/lang/String;
      // 1e6: goto 1ef
      // 1e9: pop
      // 1ea: aconst_null
      // 1eb: goto 1ef
      // 1ee: aconst_null
      // 1ef: astore 6
      // 1f1: goto 1f9
      // 1f4: astore 7
      // 1f6: aconst_null
      // 1f7: astore 6
      // 1f9: aload 6
      // 1fb: astore 5
      // 1fd: aload 5
      // 1ff: aload 3
      // 200: ifnull 253
      // 203: ifnonnull 232
      // 206: goto 20d
      // 209: invokestatic me/octo/client/llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20c: athrow
      // 20d: getstatic me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
      // 210: ldc2_w 3000
      // 213: sipush 32451
      // 216: sipush 26054
      // 219: pop2
      // 21a: ldc_w "Route editor"
      // 21d: sipush 32505
      // 220: sipush 27730
      // 223: pop2
      // 224: ldc_w "Couldn't read route"
      // 227: getstatic me/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 22a: invokevirtual me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.b (JLjava/lang/String;Ljava/lang/String;Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 22d: return
      // 22e: invokestatic me/octo/client/llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 231: athrow
      // 232: aload 2
      // 233: aload 1
      // 234: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.d ()Ljava/lang/String;
      // 237: sipush 32485
      // 23a: sipush 5139
      // 23d: pop2
      // 23e: ldc_w "[Routes/Editor] uploading '"
      // 241: dup_x2
      // 242: pop
      // 243: sipush 32508
      // 246: sipush 16480
      // 249: pop2
      // 24a: ldc_w "' type="
      // 24d: swap
      // 24e: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001" ]
      // 253: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.e (Ljava/lang/String;)V
      // 256: new java/lang/Thread
      // 259: dup
      // 25a: aload 2
      // 25b: aload 1
      // 25c: aload 5
      // 25e: aload 0
      // 25f: invokedynamic run (Ljava/lang/String;Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII;Ljava/lang/String;Lme/octo/client/llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, me/octo/client/llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.a (Ljava/lang/String;Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII;Ljava/lang/String;Lme/octo/client/llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll;)V, ()V ]
      // 264: invokespecial java/lang/Thread.<init> (Ljava/lang/Runnable;)V
      // 267: invokevirtual java/lang/Thread.start ()V
      // 26a: getstatic me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
      // 26d: ldc2_w 2000
      // 270: sipush 32451
      // 273: sipush 26054
      // 276: pop2
      // 277: ldc_w "Route editor"
      // 27a: sipush 32490
      // 27d: sipush 8655
      // 280: pop2
      // 281: ldc_w "Uploading…"
      // 284: getstatic me/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 287: invokevirtual me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.b (JLjava/lang/String;Ljava/lang/String;Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 28a: return
   }

   private final void a(
      lIIllIIIIlIIlIIllIIlIllIIllIllIlIIlllIllIIIlIIllIlIIllIIlIIIlllIllIlIlIllIIlllIlIlllI var1,
      llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var2,
      String var3,
      String var4
   ) { short var13 = (short)0; // PX-FIX hoist
        
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var5 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      lIIllIIIIlIIlIIllIIlIllIIllIllIlIIlllIllIIIlIIllIlIIllIIlIIIlllIllIlIlIllIIlllIlIlllI var10000 = var1;
      if (var5 != null) {
         if (var1 == null) {
            llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a(var4);
            short var9 = 32451;
            short var14 = 26054;
            var14 = 32452;
            short var19 = 21593;
            IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(
                  4000L,
                  "Route editor",
                  "Upload failed · copied JSON to clipboard",
                  IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
               );
            return;
         }

         var10000 = var1;
      }

      boolean var6 = var10000.a();
      if (var5 != null) {
         if (var6) {
            short var8 = 32451;
             var13 = 26054;
            short var18 = 32466;
            short var10005 = 23438;
            IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(
                  3500L,
                  "Route editor",
                  "Uploaded " + var3,
                  IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
               );
            return;
         }

         if (var5 == null) {
            return;
         }

         var6 = var1.b();
      }

      if (!var6) {
         String var11;
         label29: {
            short var10002 = 32451;
            short var10 = 26054;
            if (var5 != null) {
               var11 = var1.c();
               if (var11 != null) {
                  break label29;
               }
            }

            short var12 = 32484;
            short var17 = -13969;
            var11 = "Upload failed";
         }

         IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(
               3500L,
               "Route editor",
               var11,
               IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            );
      } else {
         short var10003 = 32474;
         short var10004 = -31071;
         short var10006 = 32488;
         short var10007 = -30889;
         String var16 = "'" + var3 + "' exists on the browser. Update it, rename, or cancel.";
         var10006 = 32454;
         var10007 = 8381;
         var10007 = 32460;
         short var10008 = 2418;
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .invoke(
               new lIIlIlIIllIlIllIlIllIllIlIlllllllllIIIIIlIIIIllIIIlllIIllllIIlIIIlIIIIIllIlllllIllIII(
                  "Route already uploaded",
                  var16,
                  var3,
                  "Rename & upload",
                  "Update existing",
                  null,
                  null,
                  this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               )
            );
      }
   }

   private final String a(String var1) {
      CharSequence var2 = StringsKt.trim(var1).toString();
      short var10002 = 32510;
      short var10003 = -26212;
      Regex var3 = new Regex("[^A-Za-z0-9_-]");
      String var4 = "_";
      return var3.replace(var2, var4);
   }

   private static final Unit a(llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll var0, int var1) {
      var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
      return Unit.INSTANCE;
   }

   private static final Unit a(llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll var0) {
      var0.d();
      return Unit.INSTANCE;
   }

   private static final Unit b(llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll var0) {
      var0.e();
      return Unit.INSTANCE;
   }

   private static final Unit b(IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var0, String var1) {
      llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var0, var1);
      return Unit.INSTANCE;
   }

   private static final Unit c(IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var0, String var1) {
      llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .c(var0, var1);
      return Unit.INSTANCE;
   }

   private static final Unit a(
      llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll var0,
      llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var1,
      String var2
   ) {
      var0.b(var1, var2);
      return Unit.INSTANCE;
   }

   private static final Unit b(
      llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll var0,
      llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var1,
      String var2
   ) {
      var0.a(var1, var2);
      return Unit.INSTANCE;
   }

   private static final Unit d(IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var0, String var1) {
      llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var0, var1);
      return Unit.INSTANCE;
   }

   private static final Unit c(llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll var0) {
      var0.d();
      return Unit.INSTANCE;
   }

   private static final Unit a(
      llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll var0,
      llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1,
      String var2
   ) {
      short var10001 = 32483;
      short var10002 = -32550;
      Intrinsics.checkNotNullParameter(var2, "name");
      var0.a(var1.a(), var2);
      return Unit.INSTANCE;
   }

   private static final Unit a(
      llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll var0,
      llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1,
      String var2,
      String var3
   ) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var4 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      Intrinsics.checkNotNullParameter(var3, "rawName");
      String var5 = var0.a(var3);
      llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI var6 = new llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI(
         var1.b().b()
      );

      try {
         IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll var7;
         me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII var8 = me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         String var9 = var2;
         {
            int var10 = 0;
         }
         var7 = (IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll)me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .fromJson(var9, IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll.class);
         if (var4 != null) {
            switch (var1.b().g()) {
               case IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl:
                  var6.a(var5, var7);
                  break;
               case lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII:
                  Iterable var10 = (Iterable)(Object)var1.b().i();
                  int var11 = 0;
                  Iterator var12 = var10.iterator();

                  while (var12.hasNext()) {
                     Object var13 = var12.next();
                     String var14 = (String)var13;
                     int var15 = 0;
                     var6.a(var5, var14, var7);
                  }
                  break;
               default:
                  break;
            }

            IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(
                  2500L,
                  "Route editor",
                  "Imported" + var5,
                  IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
               );
         }
      } catch (Exception var7) {
         IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(
               3500L,
               "Route editor",
               "Invalid route JSON",
               IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            );
      }

      return Unit.INSTANCE;
   }


   private static final void a(
      lIIllIIIIlIIlIIllIIlIllIIllIllIlIIlllIllIIIlIIllIlIIllIIlIIIlllIllIlIlIllIIlllIlIlllI var0,
      String var1,
      llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll var2,
      llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var3,
      String var4
   ) {
      label17: {
         label16: {
            lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var5 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
            if (var5 != null) {
               if (var0 != null) {
                  break label16;
               }

               short var10001 = 32482;
               short var10002 = 32742;
               var10002 = 32448;
               short var10003 = 956;
               lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("[Routes/Editor] upload '" + var1 + "' — null response");
            }

            if (var5 != null) {
               break label17;
            }
         }

         short var11 = ((short)((var0.a()) ? 1 : 0));
         short var14 = ((short)((var0.b()) ? 1 : 0));
         String var6 = var0.c();
         String var7 = var0.d();
         boolean var8 = (var14 != 0);
         boolean var9 = (var11 != 0);
         short var10000 = 32476;
         var11 = 12030;
         var14 = 32478;
         short var16 = -26195;
         short var10004 = 32493;
         short var10005 = 17850;
         short var10006 = 32470;
         short var10007 = 16520;
         short var10008 = 32456;
         short var10009 = 28475;
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.e(
            "[Routes/Editor] upload '" + var1 + "' — success=" + var9 + " duplicate=" + var8 + " id=" + var7 + " msg=" + var6
         );
      }

      var2.a(var0, var3, var1, var4);
   }

   private static final void a(
      String var0,
      llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var1,
      String var2,
      llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll var3
   ) {
      lIIllIIIIlIIlIIllIIlIllIIllIllIlIIlllIllIIIlIIllIlIIllIIlIIIlllIllIlIlIllIIlllIlIlllI var4 = IIllIIIllllllIIllIIIlIllIllIIlIIlIlllIlllIIIIllIIlIIIIllIlIllIIlllIllllIllIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var0, var1.d(), var2);
      Minecraft.getInstance().execute(null);
   }

   private static final void a(
      llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll var0,
      lIIllIIIIlIIlIIllIIlIllIIllIllIlIIlllIllIIIlIIllIlIIllIIlIIIlllIllIlIlIllIIlllIlIlllI var1,
      llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var2,
      String var3,
      String var4
   ) {
      var0.a(var1, var2, var3, var4);
   }

   private static final void b(
      String var0,
      llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var1,
      String var2,
      llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll var3
   ) {
      lIIllIIIIlIIlIIllIIlIllIIllIllIlIIlllIllIIIlIIllIlIIllIIlIIIlllIllIlIlIllIIlllIlIlllI var4 = IIllIIIllllllIIllIIIlIllIllIIlIIlIlllIlllIIIIllIIlIIIIllIlIllIIlllIllllIllIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var0, var1.d(), var2);
      Minecraft.getInstance().execute(null);
   }

   private static final void b(
      llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll var0,
      lIIllIIIIlIIlIIllIIlIllIIllIllIlIIlllIllIIIlIIllIlIIllIIlIIIlllIllIlIlIllIIlllIlIlllI var1,
      llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var2,
      String var3,
      String var4
   ) {
      var0.a(var1, var2, var3, var4);
   }

   private static final void a(
      String var0,
      String var1,
      llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll var2,
      llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var3,
      String var4
   ) {
      IIllIIIllllllIIllIIIlIllIllIIlIIlIlllIlllIIIIllIIlIIIIllIlIllIIlllIllllIllIIlllIlIlII var10000 = IIllIIIllllllIIllIIIlIllIllIIlIIlIlllIlllIIIIllIIlIIIIllIlIllIIlllIllllIllIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      Intrinsics.checkNotNull(var0);
      lIIllIIIIlIIlIIllIIlIllIIllIllIlIIlllIllIIIlIIllIlIIllIIlIIIlllIllIlIlIllIIlllIlIlllI var5 = var10000.a(var0, var1);
      Minecraft.getInstance().execute(null);
   }

   private static final Unit a(
      llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll var0,
      llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var1,
      String var2,
      String var3
   ) {
      short var10001 = 32477;
      short var10002 = 2291;
      Intrinsics.checkNotNullParameter(var3, "newName");
      String var4 = var0.a(var3);
      new Thread(() -> b(var2, var1, var4, var0)).start();
      return Unit.INSTANCE;
   }

   private static final Unit b(
      lIIllIIIIlIIlIIllIIlIllIIllIllIlIIlllIllIIIlIIllIlIIllIIlIIIlllIllIlIlIllIIlllIlIlllI var0,
      String var1,
      llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll var2,
      llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var3,
      String var4
   ) {
      String var5 = var0.d();
      new Thread(() -> a(var5, var1, var2, var3, var4)).start();
      return Unit.INSTANCE;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[61];
      int var3 = 0;
      String var2 = "\u001ae5É\u0006¿Ì<;¬\u0089\u0017-±\u0089y\u001dÿ\u0010n«ã\u008fµ{ågÅXö\u00947R¿Ì\u0006ù÷\u0011\u0004ë\n\fjð;{Çéôö ûm#\u0015¼!ç,\u0084Ñ\u0005\tÎ\u0084/Fä\tU\u0088ì§¦¦t\u0006JUgP%\u0080\f¾\u0015,,\u0085\u0094\u000ep\u008bD!ò\u0014?}êþ\u0097§Ó\u0013}\u0086U\t<`\u001bh£®0\u0019\u0007 PÓð\u0084\u008fZ»\f\u00ad\u008a\u0016!xúm\u001dUù\u0093@È,×\u0097âÓTµ#\u008a\u0000æ þ\u009d&\u0019¤É&³\u0091\u001aþ*µÖ\u0095º\b?\u000eÕâÿî»\u001c\u0004Y]Ðp\bÖô:\u0007vÉ}\u0014\u009fJ\u0012¼,\u0013\u0003ã:8eID¹¬Ú\u008d S¯V\u0091iB\u008bÙ\u0096Ñ=¼P\u0084\u0096uße\bí÷+D6ÝÎ\u008bÈæ ®\"Ùd¬Q%\u0004¯q*Óùä_<\u0095\u0098\u0014\u009e)ïA^D!Ó\u0004ccz\r§\u001dôßMCÈ¡¥0ØSè\u0000©ÃÌë¦ï\u009e@LÌçR\u000f\u000b\u0018°l÷\u0086] \u0011\u0096EV²ë£\u000eàï\râæ\u0017iz\u00ad7\u001dE2Èúé\u008463¶À[³W\u000e\u001ax\u009b\u001e!¶\u0099BÌ\u001cb\u0093!¸Åe\u001e!|Ho¾Ïçp\u001eð\u008beÆúX=ÔFÔ©hÓ7\u0015a>³\u009cìA\f\u0011tëÌaqùÝ8Ó°£ÖÙí{âs4<\u008eg±ß<6b\u0092õ\u009eÎuT\u0005¶Äuè\b\u0090¶~lbÜ4\u00130\u0090±â\u0097ÉXúµ\u001f\u0091úÖÒ1f@ozFÂÏ&Ë&\u0081\u00109ÀY|Èÿ½r\u001er§íÆS\u0014\u0094ÌrS|ÌB2v\"o4K\u0006\u0080\u0006)èûA®G4ã%\f\u0002\fë½\u0019\u0014S$û\u007f\u009d\u00851\u001e\u0085SÕ¥\u008dëüÕÝ´\u0089·]\"\r«f)[µZ\u0005¹±Úþ\u007f¯kuá>×j¥)\u0097,át*à¿U\u0081ùT\u009cú5Ò\rzÊ \u0091Ü=µF½kÇ\u0007\u008d%\u009a\u0000ßHZ\u0013ÒÇd±G\u001b®\u001b\u000e\u008b'XëïH\u008e \u0080Î\u0016º\u001a\u0097x\u00ad%ÊVùÝÆÀmÀ'\u0092° W\u009d\u0002¤\tf<\u0098\u008fk¥½\u0085\u0019\r2ªµãB8¬&èg\u009b¹T\u001b!<\u001bMáµ<ÿç1ßÎrØ>?$\u0014G1áo \u000b\u0080\u0096\u001e\u000bÕ[ÞÃî*½\u0015Â\u0004ÞÍâ W·\u009aPÞ¡çL\f0Y\u0017y\u0097\u0092f\u00ad\u0098N\u0003¤ªu'\bi¾A7\u009fÄÃ\u0011\u009aÜ\u001bàÔJ\u001a+\u009c\u0084ÝñIØ\u0013tå\u0012#\u0019þñN\u0007<)Å9PòùYW\u009c3SË]9ô;ö5ÖFºû]²N\u0002p\u008c~7BMtÍ-É\u0003´×æHô\\¿³M\u0004ü\u008cµ\u0006 p)\u0005·x\u0010V³ä\\mSK3ÙH0øÙã\u0087Ã\u0090Øl\u0004+\rÎ\u009d½\u0010Ç¤u?\u008eÏ¤\u0002\u0017Jüdµ\u001en%\u0094\u0014¿\u0089eéJdø¢5¥yH\u0093¹UAf\nÅ\u0096\"ú|8\"ÎÉr\u0005*\u00035Ú$<\u0000\u009d!F_*@y\u000f&\u001eê9\u0094\u00ad\u0085ó\u0006U¡8\u0012\u0014\u0004\u0006ß\u0013\u008bj\t\u0019\u0018\u001a\u00ad|\u007f\ró¡7T(©í¼¼ç³\u001f\u0085 \u0003\r)ô\u008a\u0004|Â!×\b\u0088ÒÑQÛ$lÂ\u000b\u0080N!öçk÷ç½´×\u0013r\u0016k\u0085$+\u001a&Kt\u0014P$²}u\u0080¥\r\b \u008e*+\u008cï\u0086»6Ù\u0099ýÈk¿Ô6xÔâL)L\u0015ôio\u0018\u0004{Ó8ý¼ua¼\u009c3Û\u001b¯\u0091\u0014GaÉÙåW\u001d©r\u0093¿¤\nX\u008f\u001dWgy\u0014\u0017!\"\u001f\u001bÉ\u001cË#n\u009f«\u0018\n\u0012à\u008aÆ\f|\n\u009eþ iði³\u0004m\u2065\töç®ô\u00adÊeh}»\u0003GkK\u001dÓ}\u0018íûçF\u0083rT\u0080\u0098\b2\t\u0089\u0088\ru\u0016\u008eàHå£Ü\u009e)YpGÂ\u00812£e\u0014\u0016êÍo\u009a¨áQýYeöW\u0005øxêïÄÌ±*\u001bu«O\u0080\u0087\u0094v\u0013\u0094&°\u008aþÁûÕgÁ\u000e\u0093ý\u0016\u001c²%ÇC\u0012\u0087Ä\u0007\u008b|\u0094\u0082Y£j\u0082Ûê(\b\r1°±¯DÃ\u0084X\u0007ÖPô\u0001oÿ\u0010C\u009c\b3\u007fyI¢\u0082h4®ê?\u0006ÇÙ\u001b-\u0002Mü©ãæÄ½Q\u000b.\r\u0090RxþÌ&\nûÓ5Ç9<ILÚÈ¢È;øl¼ý-=Â#BE½\tÐÀ\u008aVÎ#\u0019=¥\u0004\u000f)Áû\tUÆ:\u0096Ø;Û>ý\u0012^\u0019é\u0015o\u0011+}tÓ¨YÓÚ\u009cÚGûč>¡Ì\u0097éT°!*\\µ2nW\u009f\u009fNg6¸=\u0007Ê*¸7±k\u0089\u0001Ñ\u0097\u0018Â\u008aº¯\u001f\u008eT\u0087\n\u0092\u009e³\u009d\u0017A\u0004\u0012ïÅa'w~<^¾>\u001e\u0085ßX.øÂwï7=K\u0090)M9Áu0NfúÆ\u0092=\u0006\u001e\f³'ûOC\u008dËÁßµLÚ3ö7¦nb?û\u0014Þtt0×Á\u0084Ì_V@¶lwýK?ãwZ%~&ç\u0006\u0082¤³äÒ\u0011ò\u0013\u001b`QPú)ÍØF¯³\u0017ÝÞßx\u008b©ü\u009e£·ËÖ\u000fAµ\u009dé\u009bhR=®\u0088Y\u0086\u008fµG²\u0081\r~\\c\u0014øýöz¢\u0004V?ªG+÷ÃsÓR\u001eé³\u009bûØ_3\u009e\u009dP¹\u0014\u001a¨ÑÊÌåb\u009b9¿fü\u0001E\u0006Þ-ù¬â\u000f0\u009e·Ì\u0002»¼zK°ÝmY\u0006\u0017¤Aä\u008e\ruQr÷¼ÝÇ\u007fÄ\u008b\tÀ\u0087ëF\u0089\u008c\u0090²Ã\u000e\u0097\u00162ù\u0019\u0015\\P+\u001d\u008eÞ3\u0092\u0018Ã\rGkjqMgÉ\"\u001a¬Ê\u0094)¶Æ%\u001b\u0017j«\u0018Ú\u0007<\u00173Âê\u0010ü\fEi‟\u008er\"¹Sev±\u009a\r\"E\u0084£qz}OÒJÜ\u001c¼\b\u009fùÝÅr2Y\u0000\u0018\r¢f\u0014ø\u0080\n\u009aá\u0012Ð÷\u001c2\u008fAñÀèÁßH/Ö\u0016üù\u0092n\u0098µ2QAÎÒ\u0000ÌA\u0015Du>Z\u0083êS\u0014\u0000«ÀNGã\u0097\u008eRÆ £Ü \u0089\u0004È\u008f\u0010z(k\\\u009e='ã\u0000]}\b)T\u0002ê°aTÀ\u0081Q¢¥\u0085v`öÙÑgIVoö)Æ¬ñºi\n\fÔO·ò¸T#hÉGi\u0092\u000fökÈb£Æ\u001d\u0098\u009fä\u0000_³â?\u000e¯óêqsãt\u0081\u0095Û°\fqÊ\u0011\u001eÅ⁴\u001b\u0002\u0090\u0006\n9²Ám#VÛ\u0003Ý\f\u0095[¿:=?\u0082\bÈý\u0095C\nLâ¬\u001bÜø\u0005\\¨;\f®eØýÑÇ\u001f\u0017{\u001eã?\u000fã¸\u0087¯\u0018\u007fPìn]nï\u001bàïĐÕv±mF\u000bEÊ\u0094!b\u009d\u0094¢À!¥°KB\u0092X?Á\u0006JfÄsô\u008e)ó\u0015÷@\u0000@{¿9wE1IhHÿïÅ\u0092?Îx\u0082\u0095\u0082#i\u0091äp\u0080æÅ/¿\u008d@hÈ .T\u009a\u0096;\u0080oð\u008d-»h\u0092Yëç\rZ,à¹x\u0094\u007f4b1 \u009c©ÂMÐ\u001fèTî++ÊÛ\u0000¼~c\u0000£«\b\u0011 R±Ê¼É±ò\u0003ÜHYwO\r\u0099\u0005¾\bæDÞº\u0087\u0087Ób\u0087³D\rj\nq%\u008dÔ\u0017\u0017IÞMd\u0089úª\u000bà>4\u0092§b\u0010c\u008eûu\u001a\u0018Aq¨\u0010V§U`×ðjÈü«ÐÔO$Åæè\u0018!g\u0087\u009cV\u001eaÿH\\ea÷\fçbê-µ\u0019²O\u0003\u001a\u000bô\u0083\u0004ã³î±a©É[ò\u0098\u001fåu\u0005ý\u0096±âî\u008d²P]©Û\u0093öÙâCðÔ\u0000i)\u0094\u009c^ãm\u001eG&?u÷t7\u0081B{g¹\u001aûú*L©~f\u0003\bpù\u0014\u000e¨bã\u008b";
      int var4 = "\u001ae5É\u0006¿Ì<;¬\u0089\u0017-±\u0089y\u001dÿ\u0010n«ã\u008fµ{ågÅXö\u00947R¿Ì\u0006ù÷\u0011\u0004ë\n\fjð;{Çéôö ûm#\u0015¼!ç,\u0084Ñ\u0005\tÎ\u0084/Fä\tU\u0088ì§¦¦t\u0006JUgP%\u0080\f¾\u0015,,\u0085\u0094\u000ep\u008bD!ò\u0014?}êþ\u0097§Ó\u0013}\u0086U\t<`\u001bh£®0\u0019\u0007 PÓð\u0084\u008fZ»\f\u00ad\u008a\u0016!xúm\u001dUù\u0093@È,×\u0097âÓTµ#\u008a\u0000æ þ\u009d&\u0019¤É&³\u0091\u001aþ*µÖ\u0095º\b?\u000eÕâÿî»\u001c\u0004Y]Ðp\bÖô:\u0007vÉ}\u0014\u009fJ\u0012¼,\u0013\u0003ã:8eID¹¬Ú\u008d S¯V\u0091iB\u008bÙ\u0096Ñ=¼P\u0084\u0096uße\bí÷+D6ÝÎ\u008bÈæ ®\"Ùd¬Q%\u0004¯q*Óùä_<\u0095\u0098\u0014\u009e)ïA^D!Ó\u0004ccz\r§\u001dôßMCÈ¡¥0ØSè\u0000©ÃÌë¦ï\u009e@LÌçR\u000f\u000b\u0018°l÷\u0086] \u0011\u0096EV²ë£\u000eàï\râæ\u0017iz\u00ad7\u001dE2Èúé\u008463¶À[³W\u000e\u001ax\u009b\u001e!¶\u0099BÌ\u001cb\u0093!¸Åe\u001e!|Ho¾Ïçp\u001eð\u008beÆúX=ÔFÔ©hÓ7\u0015a>³\u009cìA\f\u0011tëÌaqùÝ8Ó°£ÖÙí{âs4<\u008eg±ß<6b\u0092õ\u009eÎuT\u0005¶Äuè\b\u0090¶~lbÜ4\u00130\u0090±â\u0097ÉXúµ\u001f\u0091úÖÒ1f@ozFÂÏ&Ë&\u0081\u00109ÀY|Èÿ½r\u001er§íÆS\u0014\u0094ÌrS|ÌB2v\"o4K\u0006\u0080\u0006)èûA®G4ã%\f\u0002\fë½\u0019\u0014S$û\u007f\u009d\u00851\u001e\u0085SÕ¥\u008dëüÕÝ´\u0089·]\"\r«f)[µZ\u0005¹±Úþ\u007f¯kuá>×j¥)\u0097,át*à¿U\u0081ùT\u009cú5Ò\rzÊ \u0091Ü=µF½kÇ\u0007\u008d%\u009a\u0000ßHZ\u0013ÒÇd±G\u001b®\u001b\u000e\u008b'XëïH\u008e \u0080Î\u0016º\u001a\u0097x\u00ad%ÊVùÝÆÀmÀ'\u0092° W\u009d\u0002¤\tf<\u0098\u008fk¥½\u0085\u0019\r2ªµãB8¬&èg\u009b¹T\u001b!<\u001bMáµ<ÿç1ßÎrØ>?$\u0014G1áo \u000b\u0080\u0096\u001e\u000bÕ[ÞÃî*½\u0015Â\u0004ÞÍâ W·\u009aPÞ¡çL\f0Y\u0017y\u0097\u0092f\u00ad\u0098N\u0003¤ªu'\bi¾A7\u009fÄÃ\u0011\u009aÜ\u001bàÔJ\u001a+\u009c\u0084ÝñIØ\u0013tå\u0012#\u0019þñN\u0007<)Å9PòùYW\u009c3SË]9ô;ö5ÖFºû]²N\u0002p\u008c~7BMtÍ-É\u0003´×æHô\\¿³M\u0004ü\u008cµ\u0006 p)\u0005·x\u0010V³ä\\mSK3ÙH0øÙã\u0087Ã\u0090Øl\u0004+\rÎ\u009d½\u0010Ç¤u?\u008eÏ¤\u0002\u0017Jüdµ\u001en%\u0094\u0014¿\u0089eéJdø¢5¥yH\u0093¹UAf\nÅ\u0096\"ú|8\"ÎÉr\u0005*\u00035Ú$<\u0000\u009d!F_*@y\u000f&\u001eê9\u0094\u00ad\u0085ó\u0006U¡8\u0012\u0014\u0004\u0006ß\u0013\u008bj\t\u0019\u0018\u001a\u00ad|\u007f\ró¡7T(©í¼¼ç³\u001f\u0085 \u0003\r)ô\u008a\u0004|Â!×\b\u0088ÒÑQÛ$lÂ\u000b\u0080N!öçk÷ç½´×\u0013r\u0016k\u0085$+\u001a&Kt\u0014P$²}u\u0080¥\r\b \u008e*+\u008cï\u0086»6Ù\u0099ýÈk¿Ô6xÔâL)L\u0015ôio\u0018\u0004{Ó8ý¼ua¼\u009c3Û\u001b¯\u0091\u0014GaÉÙåW\u001d©r\u0093¿¤\nX\u008f\u001dWgy\u0014\u0017!\"\u001f\u001bÉ\u001cË#n\u009f«\u0018\n\u0012à\u008aÆ\f|\n\u009eþ iði³\u0004m\u2065\töç®ô\u00adÊeh}»\u0003GkK\u001dÓ}\u0018íûçF\u0083rT\u0080\u0098\b2\t\u0089\u0088\ru\u0016\u008eàHå£Ü\u009e)YpGÂ\u00812£e\u0014\u0016êÍo\u009a¨áQýYeöW\u0005øxêïÄÌ±*\u001bu«O\u0080\u0087\u0094v\u0013\u0094&°\u008aþÁûÕgÁ\u000e\u0093ý\u0016\u001c²%ÇC\u0012\u0087Ä\u0007\u008b|\u0094\u0082Y£j\u0082Ûê(\b\r1°±¯DÃ\u0084X\u0007ÖPô\u0001oÿ\u0010C\u009c\b3\u007fyI¢\u0082h4®ê?\u0006ÇÙ\u001b-\u0002Mü©ãæÄ½Q\u000b.\r\u0090RxþÌ&\nûÓ5Ç9<ILÚÈ¢È;øl¼ý-=Â#BE½\tÐÀ\u008aVÎ#\u0019=¥\u0004\u000f)Áû\tUÆ:\u0096Ø;Û>ý\u0012^\u0019é\u0015o\u0011+}tÓ¨YÓÚ\u009cÚGûč>¡Ì\u0097éT°!*\\µ2nW\u009f\u009fNg6¸=\u0007Ê*¸7±k\u0089\u0001Ñ\u0097\u0018Â\u008aº¯\u001f\u008eT\u0087\n\u0092\u009e³\u009d\u0017A\u0004\u0012ïÅa'w~<^¾>\u001e\u0085ßX.øÂwï7=K\u0090)M9Áu0NfúÆ\u0092=\u0006\u001e\f³'ûOC\u008dËÁßµLÚ3ö7¦nb?û\u0014Þtt0×Á\u0084Ì_V@¶lwýK?ãwZ%~&ç\u0006\u0082¤³äÒ\u0011ò\u0013\u001b`QPú)ÍØF¯³\u0017ÝÞßx\u008b©ü\u009e£·ËÖ\u000fAµ\u009dé\u009bhR=®\u0088Y\u0086\u008fµG²\u0081\r~\\c\u0014øýöz¢\u0004V?ªG+÷ÃsÓR\u001eé³\u009bûØ_3\u009e\u009dP¹\u0014\u001a¨ÑÊÌåb\u009b9¿fü\u0001E\u0006Þ-ù¬â\u000f0\u009e·Ì\u0002»¼zK°ÝmY\u0006\u0017¤Aä\u008e\ruQr÷¼ÝÇ\u007fÄ\u008b\tÀ\u0087ëF\u0089\u008c\u0090²Ã\u000e\u0097\u00162ù\u0019\u0015\\P+\u001d\u008eÞ3\u0092\u0018Ã\rGkjqMgÉ\"\u001a¬Ê\u0094)¶Æ%\u001b\u0017j«\u0018Ú\u0007<\u00173Âê\u0010ü\fEi‟\u008er\"¹Sev±\u009a\r\"E\u0084£qz}OÒJÜ\u001c¼\b\u009fùÝÅr2Y\u0000\u0018\r¢f\u0014ø\u0080\n\u009aá\u0012Ð÷\u001c2\u008fAñÀèÁßH/Ö\u0016üù\u0092n\u0098µ2QAÎÒ\u0000ÌA\u0015Du>Z\u0083êS\u0014\u0000«ÀNGã\u0097\u008eRÆ £Ü \u0089\u0004È\u008f\u0010z(k\\\u009e='ã\u0000]}\b)T\u0002ê°aTÀ\u0081Q¢¥\u0085v`öÙÑgIVoö)Æ¬ñºi\n\fÔO·ò¸T#hÉGi\u0092\u000fökÈb£Æ\u001d\u0098\u009fä\u0000_³â?\u000e¯óêqsãt\u0081\u0095Û°\fqÊ\u0011\u001eÅ⁴\u001b\u0002\u0090\u0006\n9²Ám#VÛ\u0003Ý\f\u0095[¿:=?\u0082\bÈý\u0095C\nLâ¬\u001bÜø\u0005\\¨;\f®eØýÑÇ\u001f\u0017{\u001eã?\u000fã¸\u0087¯\u0018\u007fPìn]nï\u001bàïĐÕv±mF\u000bEÊ\u0094!b\u009d\u0094¢À!¥°KB\u0092X?Á\u0006JfÄsô\u008e)ó\u0015÷@\u0000@{¿9wE1IhHÿïÅ\u0092?Îx\u0082\u0095\u0082#i\u0091äp\u0080æÅ/¿\u008d@hÈ .T\u009a\u0096;\u0080oð\u008d-»h\u0092Yëç\rZ,à¹x\u0094\u007f4b1 \u009c©ÂMÐ\u001fèTî++ÊÛ\u0000¼~c\u0000£«\b\u0011 R±Ê¼É±ò\u0003ÜHYwO\r\u0099\u0005¾\bæDÞº\u0087\u0087Ób\u0087³D\rj\nq%\u008dÔ\u0017\u0017IÞMd\u0089úª\u000bà>4\u0092§b\u0010c\u008eûu\u001a\u0018Aq¨\u0010V§U`×ðjÈü«ÐÔO$Åæè\u0018!g\u0087\u009cV\u001eaÿH\\ea÷\fçbê-µ\u0019²O\u0003\u001a\u000bô\u0083\u0004ã³î±a©É[ò\u0098\u001fåu\u0005ý\u0096±âî\u008d²P]©Û\u0093öÙâCðÔ\u0000i)\u0094\u009c^ãm\u001eG&?u÷t7\u0081B{g¹\u001aûú*L©~f\u0003\bpù\u0014\u000e¨bã\u008b"
         .length();
      char var1 = 18;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 56;
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
                     case 0 -> 115;
                     case 1 -> 100;
                     case 2 -> 49;
                     case 3 -> 20;
                     case 4 -> 109;
                     case 5 -> 31;
                     default -> 27;
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
                     b = new String[61];
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

                  var2 = "S÷L4ú¨¼\u0018PmpÞNY\u0010þ,Ìêç\u007f\u008bÞ\u001aÈË\u0005m\u000bØ#\r";
                  var4 = "S÷L4ú¨¼\u0018PmpÞNY\u0010þ,Ìêç\u007f\u008bÞ\u001aÈË\u0005m\u000bØ#\r".length();
                  var1 = 26;
                  var8 = -1;
            }

            var10000 = 58;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 32500) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 183;
            case 1 -> 25;
            case 2 -> 145;
            case 3 -> 28;
            case 4 -> 46;
            case 5 -> 217;
            case 6 -> 5;
            case 7 -> 237;
            case 8 -> 215;
            case 9 -> 233;
            case 10 -> 71;
            case 11 -> 180;
            case 12 -> 164;
            case 13 -> 138;
            case 14 -> 132;
            case 15 -> 154;
            case 16 -> 98;
            case 17 -> 68;
            case 18 -> 62;
            case 19 -> 224;
            case 20 -> 75;
            case 21 -> 21;
            case 22 -> 156;
            case 23 -> 205;
            case 24 -> 66;
            case 25 -> 88;
            case 26 -> 128;
            case 27 -> 255;
            case 28 -> 121;
            case 29 -> 9;
            case 30 -> 69;
            case 31 -> 245;
            case 32 -> 228;
            case 33 -> 38;
            case 34 -> 96;
            case 35 -> 32;
            case 36 -> 55;
            case 37 -> 251;
            case 38 -> 140;
            case 39 -> 223;
            case 40 -> 17;
            case 41 -> 204;
            case 42 -> 123;
            case 43 -> 158;
            case 44 -> 253;
            case 45 -> 232;
            case 46 -> 91;
            case 47 -> 31;
            case 48 -> 77;
            case 49 -> 137;
            case 50 -> 175;
            case 51 -> 112;
            case 52 -> 143;
            case 53 -> 115;
            case 54 -> 78;
            case 55 -> 129;
            case 56 -> 65;
            case 57 -> 252;
            case 58 -> 52;
            case 59 -> 240;
            case 60 -> 250;
            case 61 -> 92;
            case 62 -> 63;
            case 63 -> 119;
            case 64 -> 50;
            case 65 -> 130;
            case 66 -> 103;
            case 67 -> 179;
            case 68 -> 36;
            case 69 -> 114;
            case 70 -> 236;
            case 71 -> 222;
            case 72 -> 167;
            case 73 -> 26;
            case 74 -> 82;
            case 75 -> 41;
            case 76 -> 85;
            case 77 -> 136;
            case 78 -> 225;
            case 79 -> 76;
            case 80 -> 131;
            case 81 -> 220;
            case 82 -> 161;
            case 83 -> 124;
            case 84 -> 12;
            case 85 -> 74;
            case 86 -> 148;
            case 87 -> 182;
            case 88 -> 239;
            case 89 -> 16;
            case 90 -> 107;
            case 91 -> 152;
            case 92 -> 81;
            case 93 -> 195;
            case 94 -> 149;
            case 95 -> 187;
            case 96 -> 108;
            case 97 -> 174;
            case 98 -> 93;
            case 99 -> 40;
            case 100 -> 8;
            case 101 -> 54;
            case 102 -> 194;
            case 103 -> 97;
            case 104 -> 118;
            case 105 -> 64;
            case 106 -> 226;
            case 107 -> 20;
            case 108 -> 184;
            case 109 -> 86;
            case 110 -> 146;
            case 111 -> 221;
            case 112 -> 210;
            case 113 -> 99;
            case 114 -> 127;
            case 115 -> 83;
            case 116 -> 101;
            case 117 -> 106;
            case 118 -> 208;
            case 119 -> 218;
            case 120 -> 70;
            case 121 -> 67;
            case 122 -> 4;
            case 123 -> 242;
            case 124 -> 58;
            case 125 -> 33;
            case 126 -> 27;
            case 127 -> 234;
            case 128 -> 59;
            case 129 -> 47;
            case 130 -> 229;
            case 131 -> 192;
            case 132 -> 151;
            case 133 -> 249;
            case 134 -> 3;
            case 135 -> 185;
            case 136 -> 43;
            case 137 -> 51;
            case 138 -> 39;
            case 139 -> 176;
            case 140 -> 89;
            case 141 -> 166;
            case 142 -> 159;
            case 143 -> 61;
            case 144 -> 170;
            case 145 -> 214;
            case 146 -> 162;
            case 147 -> 116;
            case 148 -> 53;
            case 149 -> 2;
            case 150 -> 23;
            case 151 -> 6;
            case 152 -> 186;
            case 153 -> 120;
            case 154 -> 201;
            case 155 -> 254;
            case 156 -> 0;
            case 157 -> 80;
            case 158 -> 73;
            case 159 -> 231;
            case 160 -> 133;
            case 161 -> 216;
            case 162 -> 248;
            case 163 -> 122;
            case 164 -> 135;
            case 165 -> 7;
            case 166 -> 163;
            case 167 -> 34;
            case 168 -> 117;
            case 169 -> 29;
            case 170 -> 202;
            case 171 -> 172;
            case 172 -> 126;
            case 173 -> 141;
            case 174 -> 42;
            case 175 -> 244;
            case 176 -> 19;
            case 177 -> 243;
            case 178 -> 193;
            case 179 -> 24;
            case 180 -> 238;
            case 181 -> 199;
            case 182 -> 144;
            case 183 -> 188;
            case 184 -> 219;
            case 185 -> 235;
            case 186 -> 147;
            case 187 -> 104;
            case 188 -> 109;
            case 189 -> 206;
            case 190 -> 197;
            case 191 -> 213;
            case 192 -> 125;
            case 193 -> 113;
            case 194 -> 56;
            case 195 -> 72;
            case 196 -> 60;
            case 197 -> 94;
            case 198 -> 171;
            case 199 -> 153;
            case 200 -> 200;
            case 201 -> 105;
            case 202 -> 95;
            case 203 -> 207;
            case 204 -> 35;
            case 205 -> 45;
            case 206 -> 191;
            case 207 -> 84;
            case 208 -> 173;
            case 209 -> 57;
            case 210 -> 247;
            case 211 -> 150;
            case 212 -> 168;
            case 213 -> 79;
            case 214 -> 22;
            case 215 -> 48;
            case 216 -> 198;
            case 217 -> 227;
            case 218 -> 155;
            case 219 -> 196;
            case 220 -> 203;
            case 221 -> 37;
            case 222 -> 189;
            case 223 -> 49;
            case 224 -> 165;
            case 225 -> 209;
            case 226 -> 178;
            case 227 -> 139;
            case 228 -> 111;
            case 229 -> 15;
            case 230 -> 190;
            case 231 -> 157;
            case 232 -> 230;
            case 233 -> 11;
            case 234 -> 30;
            case 235 -> 181;
            case 236 -> 102;
            case 237 -> 44;
            case 238 -> 10;
            case 239 -> 241;
            case 240 -> 90;
            case 241 -> 142;
            case 242 -> 13;
            case 243 -> 177;
            case 244 -> 18;
            case 245 -> 211;
            case 246 -> 212;
            case 247 -> 134;
            case 248 -> 14;
            case 249 -> 160;
            case 250 -> 1;
            case 251 -> 100;
            case 252 -> 169;
            case 253 -> 246;
            case 254 -> 110;
            default -> 87;
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
      // PX-FIX RC4-207: Kotlin default-args bridge restored from jar bytecode (descriptor (Lme/octo/client/llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;Lme/octo/client/IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI;Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII;ILjava/lang/Object;)Lme/octo/client/llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;)
      public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll self, me.octo.client.IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI p1, me.octo.client.llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII p2, int mask, java.lang.Object marker) {
      if ((mask & 1) != 0) { p1 = self.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
      if ((mask & 2) != 0) { p2 = self.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
      return self.a(p1, p2);
      }
      @NotNull
      private final IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         @NotNull IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var1,
         @NotNull llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var2
      ) {
         short var10001 = -17046;
         short var10002 = -10315;
         Intrinsics.checkNotNullParameter(var1, "macro");
         var10001 = -17043;
         var10002 = -7445;
         Intrinsics.checkNotNullParameter(var2, "editor");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      }

      @NotNull
      public final IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI c() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII d() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         @NotNull IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var1,
         @NotNull llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var2
      ) {
         short var10001 = -17042;
         short var10002 = 9673;
         Intrinsics.checkNotNullParameter(var1, "macro");
         var10001 = -17045;
         var10002 = -13840;
         Intrinsics.checkNotNullParameter(var2, "editor");
         return new llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10002 = -17041;
         short var10003 = -13482;
         var10003 = -17044;
         short var10004 = 12885;
         return "EditorEntry(macro="
            + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            + ", editor="
            + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         return var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (llIlIIIllIllIlIlIIlllIIIlIlllIlIIIIlllIIIlIllIlIlIllIIlllllllIIlllIIIIIIIIIIllIIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         boolean var4 = Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         );
         if (var2 != null) {
            if (!var4) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
         }

         if (var2 != null) {
            if (!var4) {
               return false;
            }

            var4 = true;
         }

         return var4;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[6];
         int var3 = 0;
         String var2 = "¡¶çÞê\u0002ì\u001e\u008dE¦\u0081¾\nx÷8k\u0005\u0007*\u0014îß\u0006®Õ\"²R\u008f\tÝa ø\u0099ÒnÞû";
         int var4 = "¡¶çÞê\u0002ì\u001e\u008dE¦\u0081¾\nx÷8k\u0005\u0007*\u0014îß\u0006®Õ\"²R\u008f\tÝa ø\u0099ÒnÞû".length();
         char var1 = 18;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 40;
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
                        case 0 -> 75;
                        case 1 -> 6;
                        case 2 -> 19;
                        case 3 -> 121;
                        case 4 -> 114;
                        case 5 -> 83;
                        default -> 21;
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

                     var2 = "î},¡\u0095ë\u0005¢Í¦\u0014\u008f";
                     var4 = "î},¡\u0095ë\u0005¢Í¦\u0014\u008f".length();
                     var1 = 6;
                     var8 = -1;
               }

               var10000 = 67;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -17041) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 59;
               case 1 -> 223;
               case 2 -> 103;
               case 3 -> 62;
               case 4 -> 194;
               case 5 -> 75;
               case 6 -> 14;
               case 7 -> 178;
               case 8 -> 233;
               case 9 -> 250;
               case 10 -> 197;
               case 11 -> 202;
               case 12 -> 242;
               case 13 -> 71;
               case 14 -> 139;
               case 15 -> 188;
               case 16 -> 120;
               case 17 -> 8;
               case 18 -> 112;
               case 19 -> 131;
               case 20 -> 84;
               case 21 -> 147;
               case 22 -> 182;
               case 23 -> 228;
               case 24 -> 211;
               case 25 -> 226;
               case 26 -> 159;
               case 27 -> 9;
               case 28 -> 230;
               case 29 -> 143;
               case 30 -> 77;
               case 31 -> 69;
               case 32 -> 114;
               case 33 -> 105;
               case 34 -> 162;
               case 35 -> 41;
               case 36 -> 0;
               case 37 -> 124;
               case 38 -> 221;
               case 39 -> 218;
               case 40 -> 153;
               case 41 -> 50;
               case 42 -> 237;
               case 43 -> 154;
               case 44 -> 191;
               case 45 -> 53;
               case 46 -> 252;
               case 47 -> 196;
               case 48 -> 60;
               case 49 -> 7;
               case 50 -> 102;
               case 51 -> 56;
               case 52 -> 15;
               case 53 -> 87;
               case 54 -> 247;
               case 55 -> 55;
               case 56 -> 248;
               case 57 -> 240;
               case 58 -> 25;
               case 59 -> 23;
               case 60 -> 6;
               case 61 -> 232;
               case 62 -> 163;
               case 63 -> 51;
               case 64 -> 44;
               case 65 -> 137;
               case 66 -> 88;
               case 67 -> 254;
               case 68 -> 176;
               case 69 -> 17;
               case 70 -> 96;
               case 71 -> 72;
               case 72 -> 169;
               case 73 -> 118;
               case 74 -> 212;
               case 75 -> 135;
               case 76 -> 64;
               case 77 -> 107;
               case 78 -> 156;
               case 79 -> 150;
               case 80 -> 98;
               case 81 -> 79;
               case 82 -> 148;
               case 83 -> 239;
               case 84 -> 189;
               case 85 -> 40;
               case 86 -> 164;
               case 87 -> 16;
               case 88 -> 80;
               case 89 -> 108;
               case 90 -> 78;
               case 91 -> 52;
               case 92 -> 136;
               case 93 -> 97;
               case 94 -> 146;
               case 95 -> 122;
               case 96 -> 22;
               case 97 -> 74;
               case 98 -> 36;
               case 99 -> 1;
               case 100 -> 192;
               case 101 -> 35;
               case 102 -> 151;
               case 103 -> 160;
               case 104 -> 215;
               case 105 -> 145;
               case 106 -> 34;
               case 107 -> 39;
               case 108 -> 219;
               case 109 -> 58;
               case 110 -> 26;
               case 111 -> 70;
               case 112 -> 28;
               case 113 -> 57;
               case 114 -> 234;
               case 115 -> 170;
               case 116 -> 243;
               case 117 -> 101;
               case 118 -> 93;
               case 119 -> 201;
               case 120 -> 30;
               case 121 -> 119;
               case 122 -> 82;
               case 123 -> 117;
               case 124 -> 244;
               case 125 -> 253;
               case 126 -> 38;
               case 127 -> 63;
               case 128 -> 130;
               case 129 -> 184;
               case 130 -> 133;
               case 131 -> 48;
               case 132 -> 27;
               case 133 -> 42;
               case 134 -> 246;
               case 135 -> 177;
               case 136 -> 185;
               case 137 -> 204;
               case 138 -> 37;
               case 139 -> 5;
               case 140 -> 91;
               case 141 -> 4;
               case 142 -> 174;
               case 143 -> 245;
               case 144 -> 181;
               case 145 -> 3;
               case 146 -> 104;
               case 147 -> 73;
               case 148 -> 43;
               case 149 -> 100;
               case 150 -> 66;
               case 151 -> 225;
               case 152 -> 140;
               case 153 -> 186;
               case 154 -> 241;
               case 155 -> 49;
               case 156 -> 208;
               case 157 -> 134;
               case 158 -> 206;
               case 159 -> 45;
               case 160 -> 65;
               case 161 -> 123;
               case 162 -> 116;
               case 163 -> 47;
               case 164 -> 144;
               case 165 -> 18;
               case 166 -> 183;
               case 167 -> 20;
               case 168 -> 33;
               case 169 -> 236;
               case 170 -> 238;
               case 171 -> 251;
               case 172 -> 94;
               case 173 -> 21;
               case 174 -> 173;
               case 175 -> 155;
               case 176 -> 198;
               case 177 -> 199;
               case 178 -> 158;
               case 179 -> 138;
               case 180 -> 19;
               case 181 -> 54;
               case 182 -> 187;
               case 183 -> 193;
               case 184 -> 214;
               case 185 -> 92;
               case 186 -> 220;
               case 187 -> 110;
               case 188 -> 235;
               case 189 -> 90;
               case 190 -> 195;
               case 191 -> 224;
               case 192 -> 210;
               case 193 -> 205;
               case 194 -> 207;
               case 195 -> 115;
               case 196 -> 99;
               case 197 -> 149;
               case 198 -> 83;
               case 199 -> 168;
               case 200 -> 95;
               case 201 -> 157;
               case 202 -> 190;
               case 203 -> 165;
               case 204 -> 121;
               case 205 -> 67;
               case 206 -> 229;
               case 207 -> 113;
               case 208 -> 11;
               case 209 -> 13;
               case 210 -> 167;
               case 211 -> 125;
               case 212 -> 217;
               case 213 -> 61;
               case 214 -> 132;
               case 215 -> 81;
               case 216 -> 200;
               case 217 -> 231;
               case 218 -> 175;
               case 219 -> 172;
               case 220 -> 106;
               case 221 -> 2;
               case 222 -> 166;
               case 223 -> 227;
               case 224 -> 255;
               case 225 -> 76;
               case 226 -> 31;
               case 227 -> 68;
               case 228 -> 216;
               case 229 -> 249;
               case 230 -> 109;
               case 231 -> 180;
               case 232 -> 126;
               case 233 -> 85;
               case 234 -> 86;
               case 235 -> 24;
               case 236 -> 12;
               case 237 -> 179;
               case 238 -> 222;
               case 239 -> 152;
               case 240 -> 128;
               case 241 -> 203;
               case 242 -> 141;
               case 243 -> 10;
               case 244 -> 161;
               case 245 -> 213;
               case 246 -> 129;
               case 247 -> 111;
               case 248 -> 29;
               case 249 -> 127;
               case 250 -> 46;
               case 251 -> 89;
               case 252 -> 209;
               case 253 -> 32;
               case 254 -> 142;
               default -> 171;
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
