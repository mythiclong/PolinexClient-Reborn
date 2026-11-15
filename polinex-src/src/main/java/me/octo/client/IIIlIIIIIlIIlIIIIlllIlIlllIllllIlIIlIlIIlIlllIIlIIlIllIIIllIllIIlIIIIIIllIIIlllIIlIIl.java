package me.octo.client;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Map.Entry;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import kotlin.text.CharsKt;
import net.minecraft.client.Minecraft;
import kotlin.Pair;
import me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
import me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
import me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
import me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI;
import me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII;

public final class IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl {
   @NotNull
   public static IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @Nullable
   private static IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static Map<String, ? extends List<IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl>> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static String lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static boolean IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static long IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static float lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static float IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static float llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static float lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static float lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static float lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static float lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static float IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static float llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static float IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static float IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static float IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static float IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private static float llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private static float IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   private static float lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   private static int llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   private static volatile boolean lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   private static volatile boolean IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   @NotNull
   private static volatile String IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   private static boolean IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   private static int llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   private static int lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   private static float IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   private static float IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   private static float lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   private static float lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
   private static float IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
   private static float IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
   private static float IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI;
   private static float IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII;
   private static float IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII;
   private static String[] a;
   private static String[] b;

   private IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl() {
   }

   private final List<IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl> a() {
      java.util.List var1 = (java.util.List)IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.get(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      return var1 != null ? var1 : java.util.Collections.emptyList();
   }

   public final void a(@NotNull IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl param1) {
      int[] var2 = me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      Intrinsics.checkNotNullParameter(param1, "route");
      String var3 = var2 == null ? (lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII != null ? lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a() : null) : null;
      boolean var4 = Intrinsics.areEqual(var3, param1.a());
      if (var2 == null) {
         if (var4 && !IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
            return;
         }
      } else {
         IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = false;
         this.b(param1);
         return;
      }
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = param1;
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = kotlin.collections.MapsKt.emptyMap();
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = "";
      lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = false;
      IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = false;
      this.h();
      llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 2.62f;
      IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = 2.62f;
      IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 0.49f;
      IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = 0.49f;
      IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 1.55f;
      llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = 1.55f;
      IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = 0.0f;
      lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = 0.0f;
      llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = -1;
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = System.currentTimeMillis();
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = false;
      this.b(param1);
   }

   private final Map<String, List<IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl>> a(String var1) {
      Collection var33 = null; // PX-FIX
      Collection var10000 = null; // PX-FIX
      int[] var2 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();

      List var4;
      try {
         me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII var22 = me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         boolean var6 = false;
         var4 = ((IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll)me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .fromJson(var1, IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll.class))
            .a();
      } catch (Exception var16) {
         var4 = null;
      }

      List var3 = var4;
      Collection var23 = var4;

      boolean var31;
      label112: {
         label116: {
            label110: {
               try {
                  var10000 = var23;
                  if (var2 != null) {
                     break label110;
                  }

                  if (var23 == null) {
                     break label116;
                  }
               } catch (Exception var21) {
                  throw (RuntimeException)a(var21);
               }

               var10000 = var23;
            }

            try {
               var31 = var10000.isEmpty();
               if (var2 != null) {
                  break label112;
               }

               if (var31) {
                  break label116;
               }
            } catch (Exception var20) {
               throw (RuntimeException)a(var20);
            }

            var31 = false;
            break label112;
         }

         var31 = true;
      }

      try {
         if (!var31) {
            return MapsKt.<String, List<IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl>>mapOf(TuplesKt.<String, List<IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl>>to("", (List<IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl>)var3));
         }
      } catch (Exception var19) {
         throw (RuntimeException)a(var19);
      }

      JsonObject var25;
      try {
         me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII var5 = me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         boolean var7 = false;
         var25 = (JsonObject)me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .fromJson(var1, JsonObject.class);
      } catch (Exception var15) {
         return MapsKt.emptyMap();
      }

      LinkedHashMap var26 = new LinkedHashMap();

      for (Entry var28 : var25.entrySet()) {
         Intrinsics.checkNotNull(var28);
         String var8 = (String)var28.getKey();
         JsonElement var9 = (JsonElement)var28.getValue();

         List var11;
         try {
            me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII var29 = me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            String var32 = var9.toString();
            short var10002 = 16072;
            short var10003 = 11650;
            Intrinsics.checkNotNullExpressionValue(var32, "toString(...)");
            String var12 = var32;
            boolean var13 = false;
            var11 = ((IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll)me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .fromJson(var12, IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll.class))
               .a();
         } catch (Exception var14) {
            var11 = null;
         }

         Collection var30 = var11;

         label86: {
            label118: {
               label84: {
                  try {
                     var33 = var30;
                     if (var2 != null) {
                        break label84;
                     }

                     if (var30 == null) {
                        break label118;
                     }
                  } catch (Exception var18) {
                     throw (RuntimeException)a(var18);
                  }

                  var33 = var30;
               }

               try {
                  var31 = var33.isEmpty();
                  if (var2 != null) {
                     break label86;
                  }

                  if (var31) {
                     break label118;
                  }
               } catch (Exception var17) {
                  throw (RuntimeException)a(var17);
               }

               var31 = false;
               break label86;
            }

            var31 = true;
         }

         if (!var31) {
            var26.put(var8, var11);
            if (var2 != null) {
               break;
            }
         }
      }

      return var26;
   }

   private final void a(Map<String, ? extends List<IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl>> param1) {
      int[] var2 = me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = param1;
      if (var2 != null) {
         String var3 = (String)kotlin.collections.CollectionsKt.firstOrNull(param1.keySet());
         lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var3 != null ? var3 : "";
         this.h();
      }
   }

   private final void b(IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var1) {
      Object var19 = null; // PX-FIX
      int[] var2 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();

      String var4;
      try {
         var4 = llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .f(var1.a());
      } catch (Exception var13) {
         var4 = null;
      }

      String var3 = var4;

      String var10000;
      label70: {
         label74: {
            try {
               var10000 = var3;
               if (var2 != null) {
                  break label70;
               }

               if (var3 == null) {
                  break label74;
               }
            } catch (Exception var16) {
               throw (RuntimeException)a(var16);
            }

            Map var17 = this.a(var4);

            label62: {
               label61: {
                  try {
                     var19 = var17.isEmpty();
                     if (var2 != null) {
                        break label62;
                     }

                     if (!(me.octo.client.PxTruth.truth(var19))) {
                        break label61;
                     }
                  } catch (Exception var15) {
                     throw (RuntimeException)a(var15);
                  }

                  var19 = false;
                  break label62;
               }

               var19 = true;
            }

            if ((me.octo.client.PxTruth.truth(var19))) {
               Iterable var5 = var17.values();
               int var6 = 0;
               Iterator var7 = var5.iterator();

               while (true) {
                  if (var7.hasNext()) {
                     Object var8 = var7.next();
                     List var9 = (List)var8;
                     boolean var10 = false;
                     int var12 = var9.size();
                     var6 += var12;

                     try {
                        if (var2 != null) {
                           break;
                        }

                        if (var2 == null) {
                           continue;
                        }
                     } catch (Exception var14) {
                        throw (RuntimeException)a(var14);
                     }
                  }

                  String var10001 = var1.a();
                  short var10002 = 16092;
                  short var10003 = 18771;
                  var10003 = 16071;
                  short var10004 = -13082;
                  me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.e(
                     "[Routes/Preview] loaded " + var6 + " waypoints from local copy for " + var10001
                  );
                  this.a(var17);
                  break;
               }

               return;
            }
         }

         var10000 = var1.a();
         short var21 = 16086;
         short var22 = -32074;
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.e(
            "[Routes/Preview] fetching payload from server for " + var10000
         );
         lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = true;
         IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = var1.a();
         var10000 = var1.a();
      }

      var4 = var10000;
      final var var4f = var10000; // PX-FIX: lambda 捕获 final 副本
      new Thread(() -> d(var4f)).start();
   }

   public final void b() {
      if (lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII != null) {
         IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = true;
         IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = System.currentTimeMillis();
      }
   }

   @Nullable
   public final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII a(
      @NotNull GuiGraphicsExtractor param1, float param2, float param3, float param4, float param5, int param6, int param7
   ) {
      int[] var8 = me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) param1, "context");
      if (var8 != null) {
         return null;
      }
      me.octo.client.IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var9 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      if (var9 == null) {
         return null;
      }
      float var10 = this.f();
      if (var8 == null && var10 <= 0.001f && IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
         return null;
      }
      this.j();
      me.octo.client.IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var11 = null;
      float var12 = (1.0f - var10) * param4;
      float var13 = param2 + var12;
      float var14 = param3;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var10);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(param2, param3, param4, param5);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var13, var14, param4, param5, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.e().a(0.98f), me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.aq());
      float var15 = 22.0f;
      float var16 = var13 + var15;
      float var17 = var13 + param4 - var15;
      float var18 = var14 + var15;
      float var19 = 36.0f;
      float var20 = var16;
      float var21 = var18;
      boolean var22 = (float)param6 >= var20 && (float)param6 <= var20 + var19 && (float)param7 >= var21 && (float)param7 <= var21 + var19;
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var23 = var22 ? me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.g() : me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.j();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var20, var21, var19, var19, var23, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.aq());
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var20, var21, var19, var19, 1.0f, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.y().a(0.4f), me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.aq());
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b("\n    <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n        <polyline points=\"15,18 9,12 15,6\"/>\n    </svg>\n", var20 + 10.0f, var21 + 10.0f, 16.0f, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(), 1.0f);
      if (var22) {
         var11 = new me.octo.client.IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI();
      }
      java.lang.String var24 = var9.b();
      float var25 = 28.0f;
      float var26 = (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI, var24, false, 2, null);
      float var27 = var26 + var25 * 2.0f;
      float var28 = var19;
      float var29 = var13 + (param4 - var27) / 2.0f;
      float var30 = var21;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var29, var30, var27, var28, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.j().a(0.85f), me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.ar());
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var29, var30, var27, var28, 1.0f, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.y().a(0.35f), me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.ar());
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.b(var24, (int)(var29 + var27 / 2.0f), (int)(var30 + var28 / 2.0f), me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c());
      float var31 = var17 - 140.0f;
      float var32 = var18;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var31, var32, 140.0f, var19, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.j().a(0.85f), me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.ar());
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var31, var32, 140.0f, var19, 1.0f, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.y().a(0.35f), me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.ar());
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b("\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n            <path d=\"M21 10c0 7-9 13-9 13s-9-6-9-13a9 9 0 0 1 18 0z\"/>\n            <circle cx=\"12\" cy=\"10\" r=\"3\"/>\n        </svg>\n    ", var31 + 12.0f, var32 + 11.0f, 14.0f, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(), 1.0f);
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl, this.a().size() + " waypoints", var31 + 32.0f, var32 + 13.0f, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(), false, 16, (java.lang.Object)null);
      boolean var33 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.size() > 1;
      float var34, var35, var36, var37;
      if (var33) {
         var34 = var18 + var19 + 8.0f;
         var35 = 24.0f;
         var36 = 14.0f;
         var37 = 6.0f;
         java.util.List<java.lang.String> var38 = kotlin.collections.CollectionsKt.toList((java.lang.Iterable<java.lang.String>)IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.keySet());
         java.util.Collection<java.lang.Float> var39c = new java.util.ArrayList<java.lang.Float>(kotlin.collections.CollectionsKt.collectionSizeOrDefault((java.lang.Iterable<java.lang.String>)var38, 10));
         for (java.lang.String var45 : (java.lang.Iterable<java.lang.String>)var38) {
            var39c.add((float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl, me.octo.client.IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var45), false, 2, null) + var36 * 2.0f);
         }
         java.util.List<java.lang.Float> var39 = (java.util.List<java.lang.Float>)var39c;
         float var40 = kotlin.collections.CollectionsKt.sumOfFloat((java.lang.Iterable<java.lang.Float>)var39) + var37 * (float)(var38.size() - 1);
         float var41 = var13 + (param4 - var40) / 2.0f;
         java.util.Iterator<java.lang.String> var42 = ((java.lang.Iterable<java.lang.String>)var38).iterator();
         int var43 = 0;
         while (var42.hasNext()) {
            int var44 = var43++;
            java.lang.String var45 = var42.next();
            java.lang.Number var46 = (java.lang.Number)var39.get(var44);
            float var46f = var46.floatValue();
            boolean var47 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object)var45, (java.lang.Object)lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
            boolean var48 = (float)param6 >= var41 && (float)param6 <= var41 + var46f && (float)param7 >= var34 && (float)param7 <= var34 + var35;
            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var49 = var47 ? me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.ah().a(0.8f) : (var48 ? me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.g() : me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.j().a(0.7f));
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var41, var34, var46f, var35, var49, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.aq());
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var41, var34, var46f, var35, 1.0f, var47 ? me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.ah().a(0.45f) : me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.y().a(0.3f), me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.aq());
            me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.a(this.b(var45), (int)(var41 + var46f / 2.0f), (int)(var34 + var35 / 2.0f - 4.0f), var47 ? me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a() : me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b());
            if (var48 && !var47) {
               var11 = new me.octo.client.IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll((java.lang.String)var45);
            }
            var41 = var41 + var46f + var37;
         }
      }
      var34 = var18 + var19 + (var33 ? 40.0f : 18.0f);
      var35 = 26.0f;
      var36 = var14 + param5 - var15 - var35;
      IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = var16;
      IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = var34;
      lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI = param4 - var15 * 2.0f;
      lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI = var36 - var34;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll, IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI, lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI, lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.e().a(0.92f), me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.aq());
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll, IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI, lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI, lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI, 1.0f, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.y().a(0.4f), me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.aq());
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll + 1.0f, IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI + 1.0f, lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI - 2.0f, lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI - 2.0f);
      this.a(param6, param7);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.i();
      var37 = var36 + 6.0f;
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.a("Drag to rotate  \u2022  Scroll to zoom  \u2022  Esc to close", (int)(IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll + lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI / 2.0f), (int)var37, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c().a(0.7f));
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.i();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
      return var11;
   }

   // $VF: Couldn't set local class definition as local class statement was null
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private final void a(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 0000: invokestatic me/octo/client/llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n ()[I
      // 0003: astore 3
      // 0004: aload 0
      // 0005: invokespecial me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a ()Ljava/util/List;
      // 0008: invokeinterface java/util/List.isEmpty ()Z 1
      // 000d: aload 3
      // 000e: ifnonnull 0026
      // 0011: ifeq 0090
      // 0014: goto 001b
      // 0017: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 001a: athrow
      // 001b: nop
      // 001c: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll Z
      // 001f: goto 0026
      // 0022: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0025: athrow
      // 0026: aload 3
      // 0027: ifnonnull 0048
      // 002a: ifeq 0045
      // 002d: goto 0034
      // 0030: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0033: athrow
      // 0034: sipush 16064
      // 0037: sipush -671
      // 003a: pop2
      // 003b: ldc_w "Loading route..."
      // 003e: goto 0066
      // 0041: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0044: athrow
      // 0045: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll Z
      // 0048: ifeq 005c
      // 004b: sipush 16065
      // 004e: sipush 29285
      // 0051: pop2
      // 0052: ldc_w "Failed to load route"
      // 0055: goto 0066
      // 0058: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 005b: athrow
      // 005c: sipush 16077
      // 005f: sipush -8281
      // 0062: pop2
      // 0063: ldc_w "No waypoint data"
      // 0066: astore 4
      // 0068: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 006b: aload 4
      // 006d: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll F
      // 0070: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI F
      // 0073: fconst_2
      // 0074: fdiv
      // 0075: fadd
      // 0076: f2i
      // 0077: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI F
      // 007a: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI F
      // 007d: fconst_2
      // 007e: fdiv
      // 007f: fadd
      // 0080: ldc_w 4.0
      // 0083: fsub
      // 0084: f2i
      // 0085: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 0088: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.c ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 008b: invokevirtual me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a (Ljava/lang/String;IILme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;)D
      // 008e: pop2
      // 008f: return
      // 0090: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll F
      // 0093: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI F
      // 0096: fconst_2
      // 0097: fdiv
      // 0098: fadd
      // 0099: fstore 4
      // 009b: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI F
      // 009e: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI F
      // 00a1: fconst_2
      // 00a2: fdiv
      // 00a3: fadd
      // 00a4: fstore 5
      // 00a6: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI F
      // 00a9: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI F
      // 00ac: invokestatic java/lang/Math.min (FF)F
      // 00af: ldc_w 0.42
      // 00b2: fmul
      // 00b3: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII F
      // 00b6: fconst_1
      // 00b7: invokestatic java/lang/Math.max (FF)F
      // 00ba: fdiv
      // 00bb: fstore 6
      // 00bd: fload 6
      // 00bf: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl F
      // 00c2: fmul
      // 00c3: fstore 7
      // 00c5: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI F
      // 00c8: f2d
      // 00c9: invokestatic java/lang/Math.cos (D)D
      // 00cc: d2f
      // 00cd: fstore 8
      // 00cf: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI F
      // 00d2: f2d
      // 00d3: invokestatic java/lang/Math.sin (D)D
      // 00d6: d2f
      // 00d7: fstore 9
      // 00d9: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl F
      // 00dc: f2d
      // 00dd: invokestatic java/lang/Math.cos (D)D
      // 00e0: d2f
      // 00e1: fstore 10
      // 00e3: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl F
      // 00e6: f2d
      // 00e7: invokestatic java/lang/Math.sin (D)D
      // 00ea: d2f
      // 00eb: fstore 11
      // 00ed: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI F
      // 00f0: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI F
      // 00f3: fmul
      // 00f4: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI F
      // 00f7: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI F
      // 00fa: fmul
      // 00fb: fadd
      // 00fc: f2d
      // 00fd: invokestatic java/lang/Math.sqrt (D)D
      // 0100: d2f
      // 0101: fstore 12
      // 0103: fload 12
      // 0105: ldc_w 0.6
      // 0108: fmul
      // 0109: fload 7
      // 010b: fdiv
      // 010c: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII F
      // 010f: ldc_w 1.4
      // 0112: fmul
      // 0113: invokestatic java/lang/Math.max (FF)F
      // 0116: fstore 13
      // 0118: nop
      // 0119: fload 13
      // 011b: ldc_w 300.0
      // 011e: fcmpl
      // 011f: aload 3
      // 0120: ifnonnull 013d
      // 0123: ifle 0137
      // 0126: goto 012d
      // 0129: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 012c: athrow
      // 012d: ldc_w 40.0
      // 0130: goto 018e
      // 0133: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0136: athrow
      // 0137: fload 13
      // 0139: ldc_w 150.0
      // 013c: fcmpl
      // 013d: aload 3
      // 013e: ifnonnull 015b
      // 0141: ifle 0155
      // 0144: goto 014b
      // 0147: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 014a: athrow
      // 014b: ldc_w 20.0
      // 014e: goto 018e
      // 0151: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0154: athrow
      // 0155: fload 13
      // 0157: ldc_w 60.0
      // 015a: fcmpl
      // 015b: aload 3
      // 015c: ifnonnull 0184
      // 015f: ifle 0173
      // 0162: goto 0169
      // 0165: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0168: athrow
      // 0169: ldc_w 10.0
      // 016c: goto 018e
      // 016f: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0172: athrow
      // 0173: fload 13
      // 0175: aload 3
      // 0176: ifnonnull 018a
      // 0179: ldc_w 25.0
      // 017c: fcmpl
      // 017d: goto 0184
      // 0180: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0183: athrow
      // 0184: ifle 018d
      // 0187: ldc_w 5.0
      // 018a: goto 018e
      // 018d: fconst_2
      // 018e: fstore 14
      // 0190: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI F
      // 0193: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI F
      // 0196: invokestatic java/lang/Math.max (FF)F
      // 0199: ldc_w 0.45
      // 019c: fmul
      // 019d: fstore 15
      // 019f: fload 13
      // 01a1: fneg
      // 01a2: fstore 16
      // 01a4: fload 16
      // 01a6: fload 13
      // 01a8: ldc_w 0.01
      // 01ab: fadd
      // 01ac: fcmpg
      // 01ad: ifgt 034c
      // 01b0: fload 16
      // 01b2: invokestatic java/lang/Math.abs (F)F
      // 01b5: ldc_w 0.01
      // 01b8: fcmpg
      // 01b9: aload 3
      // 01ba: ifnonnull 01c8
      // 01bd: ifge 01cb
      // 01c0: goto 01c7
      // 01c3: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01c6: athrow
      // 01c7: bipush 1
      // 01c8: goto 01cc
      // 01cb: bipush 0
      // 01cc: istore 17
      // 01ce: iload 17
      // 01d0: ifeq 01dc
      // 01d3: ldc 0.18
      // 01d5: goto 01df
      // 01d8: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01db: athrow
      // 01dc: ldc_w 0.07
      // 01df: fstore 18
      // 01e1: iload 17
      // 01e3: ifeq 01f0
      // 01e6: ldc_w 1.2
      // 01e9: goto 01f3
      // 01ec: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01ef: athrow
      // 01f0: ldc_w 0.6
      // 01f3: fstore 19
      // 01f5: fload 8
      // 01f7: fload 9
      // 01f9: fload 10
      // 01fb: fload 11
      // 01fd: fload 7
      // 01ff: fload 16
      // 0201: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII F
      // 0204: fload 13
      // 0206: fneg
      // 0207: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (FFFFFFFF)Lkotlin/Triple;
      // 020a: astore 20
      // 020c: fload 8
      // 020e: fload 9
      // 0210: fload 10
      // 0212: fload 11
      // 0214: fload 7
      // 0216: fload 16
      // 0218: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII F
      // 021b: fload 13
      // 021d: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (FFFFFFFF)Lkotlin/Triple;
      // 0220: astore 21
      // 0222: fload 8
      // 0224: fload 9
      // 0226: fload 10
      // 0228: fload 11
      // 022a: fload 7
      // 022c: fload 13
      // 022e: fneg
      // 022f: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII F
      // 0232: fload 16
      // 0234: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (FFFFFFFF)Lkotlin/Triple;
      // 0237: astore 22
      // 0239: fload 8
      // 023b: fload 9
      // 023d: fload 10
      // 023f: fload 11
      // 0241: fload 7
      // 0243: fload 13
      // 0245: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII F
      // 0248: fload 16
      // 024a: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (FFFFFFFF)Lkotlin/Triple;
      // 024d: astore 23
      // 024f: fload 4
      // 0251: aload 20
      // 0253: invokevirtual kotlin/Triple.getFirst ()Ljava/lang/Object;
      // 0256: checkcast java/lang/Number
      // 0259: invokevirtual java/lang/Number.floatValue ()F
      // 025c: fadd
      // 025d: fstore 24
      // 025f: fload 5
      // 0261: aload 20
      // 0263: invokevirtual kotlin/Triple.getSecond ()Ljava/lang/Object;
      // 0266: checkcast java/lang/Number
      // 0269: invokevirtual java/lang/Number.floatValue ()F
      // 026c: fadd
      // 026d: fstore 25
      // 026f: fload 4
      // 0271: aload 21
      // 0273: invokevirtual kotlin/Triple.getFirst ()Ljava/lang/Object;
      // 0276: checkcast java/lang/Number
      // 0279: invokevirtual java/lang/Number.floatValue ()F
      // 027c: fadd
      // 027d: fstore 26
      // 027f: fload 5
      // 0281: aload 21
      // 0283: invokevirtual kotlin/Triple.getSecond ()Ljava/lang/Object;
      // 0286: checkcast java/lang/Number
      // 0289: invokevirtual java/lang/Number.floatValue ()F
      // 028c: fadd
      // 028d: fstore 27
      // 028f: fload 4
      // 0291: aload 22
      // 0293: invokevirtual kotlin/Triple.getFirst ()Ljava/lang/Object;
      // 0296: checkcast java/lang/Number
      // 0299: invokevirtual java/lang/Number.floatValue ()F
      // 029c: fadd
      // 029d: fstore 28
      // 029f: fload 5
      // 02a1: aload 22
      // 02a3: invokevirtual kotlin/Triple.getSecond ()Ljava/lang/Object;
      // 02a6: checkcast java/lang/Number
      // 02a9: invokevirtual java/lang/Number.floatValue ()F
      // 02ac: fadd
      // 02ad: fstore 29
      // 02af: fload 4
      // 02b1: aload 23
      // 02b3: invokevirtual kotlin/Triple.getFirst ()Ljava/lang/Object;
      // 02b6: checkcast java/lang/Number
      // 02b9: invokevirtual java/lang/Number.floatValue ()F
      // 02bc: fadd
      // 02bd: fstore 30
      // 02bf: fload 5
      // 02c1: aload 23
      // 02c3: invokevirtual kotlin/Triple.getSecond ()Ljava/lang/Object;
      // 02c6: checkcast java/lang/Number
      // 02c9: invokevirtual java/lang/Number.floatValue ()F
      // 02cc: fadd
      // 02cd: fstore 31
      // 02cf: fload 4
      // 02d1: fload 5
      // 02d3: fload 15
      // 02d5: fload 24
      // 02d7: fload 26
      // 02d9: fadd
      // 02da: ldc 0.5
      // 02dc: fmul
      // 02dd: fload 25
      // 02df: fload 27
      // 02e1: fadd
      // 02e2: ldc 0.5
      // 02e4: fmul
      // 02e5: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (FFFFF)F
      // 02e8: fstore 32
      // 02ea: fload 4
      // 02ec: fload 5
      // 02ee: fload 15
      // 02f0: fload 28
      // 02f2: fload 30
      // 02f4: fadd
      // 02f5: ldc 0.5
      // 02f7: fmul
      // 02f8: fload 29
      // 02fa: fload 31
      // 02fc: fadd
      // 02fd: ldc 0.5
      // 02ff: fmul
      // 0300: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (FFFFF)F
      // 0303: fstore 33
      // 0305: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
      // 0308: fload 24
      // 030a: fload 25
      // 030c: fload 26
      // 030e: fload 27
      // 0310: fload 19
      // 0312: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 0315: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.a ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 0318: fload 18
      // 031a: fload 32
      // 031c: fmul
      // 031d: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 0320: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;)V
      // 0323: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
      // 0326: fload 28
      // 0328: fload 29
      // 032a: fload 30
      // 032c: fload 31
      // 032e: fload 19
      // 0330: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 0333: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.a ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 0336: fload 18
      // 0338: fload 33
      // 033a: fmul
      // 033b: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 033e: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;)V
      // 0341: fload 16
      // 0343: fload 14
      // 0345: fadd
      // 0346: fstore 16
      // 0348: aload 3
      // 0349: ifnull 01a4
      // 034c: aload 0
      // 034d: invokespecial me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a ()Ljava/util/List;
      // 0350: checkcast java/lang/Iterable
      // 0353: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 0358: astore 19
      // 035a: aload 19
      // 035c: aload 3
      // 035d: ifnonnull 0382
      // 0360: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0365: ifne 037b
      // 0368: goto 036f
      // 036b: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 036e: athrow
      // 036f: new java/util/NoSuchElementException
      // 0372: dup
      // 0373: invokespecial java/util/NoSuchElementException.<init> ()V
      // 0376: athrow
      // 0377: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 037a: athrow
      // 037b: aload 19
      // 037d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0382: checkcast me/octo/client/IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl
      // 0385: astore 20
      // 0387: bipush 0
      // 0388: istore 21
      // 038a: aload 20
      // 038c: invokevirtual me/octo/client/IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl.a ()I
      // 038f: istore 20
      // 0391: aload 19
      // 0393: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0398: ifeq 03d6
      // 039b: aload 19
      // 039d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 03a2: checkcast me/octo/client/IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl
      // 03a5: astore 21
      // 03a7: bipush 0
      // 03a8: istore 22
      // 03aa: aload 21
      // 03ac: invokevirtual me/octo/client/IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl.a ()I
      // 03af: istore 21
      // 03b1: iload 20
      // 03b3: aload 3
      // 03b4: ifnonnull 03d8
      // 03b7: aload 3
      // 03b8: ifnonnull 03d0
      // 03bb: goto 03c2
      // 03be: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03c1: athrow
      // 03c2: iload 21
      // 03c4: if_icmpge 0391
      // 03c7: goto 03ce
      // 03ca: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03cd: athrow
      // 03ce: iload 21
      // 03d0: istore 20
      // 03d2: aload 3
      // 03d3: ifnull 0391
      // 03d6: iload 20
      // 03d8: aload 0
      // 03d9: invokespecial me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a ()Ljava/util/List;
      // 03dc: checkcast java/lang/Iterable
      // 03df: astore 18
      // 03e1: istore 60
      // 03e3: aload 18
      // 03e5: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 03ea: astore 19
      // 03ec: aload 19
      // 03ee: aload 3
      // 03ef: ifnonnull 0414
      // 03f2: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 03f7: ifne 040d
      // 03fa: goto 0401
      // 03fd: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0400: athrow
      // 0401: new java/util/NoSuchElementException
      // 0404: dup
      // 0405: invokespecial java/util/NoSuchElementException.<init> ()V
      // 0408: athrow
      // 0409: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 040c: athrow
      // 040d: aload 19
      // 040f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0414: checkcast me/octo/client/IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl
      // 0417: astore 20
      // 0419: bipush 0
      // 041a: istore 21
      // 041c: aload 20
      // 041e: invokevirtual me/octo/client/IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl.a ()I
      // 0421: istore 20
      // 0423: aload 19
      // 0425: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 042a: ifeq 0468
      // 042d: aload 19
      // 042f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0434: checkcast me/octo/client/IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl
      // 0437: astore 21
      // 0439: bipush 0
      // 043a: istore 22
      // 043c: aload 21
      // 043e: invokevirtual me/octo/client/IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl.a ()I
      // 0441: istore 21
      // 0443: iload 20
      // 0445: aload 3
      // 0446: ifnonnull 046a
      // 0449: aload 3
      // 044a: ifnonnull 0462
      // 044d: goto 0454
      // 0450: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0453: athrow
      // 0454: iload 21
      // 0456: if_icmple 0423
      // 0459: goto 0460
      // 045c: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 045f: athrow
      // 0460: iload 21
      // 0462: istore 20
      // 0464: aload 3
      // 0465: ifnull 0423
      // 0468: iload 20
      // 046a: istore 61
      // 046c: iload 60
      // 046e: iload 61
      // 0470: isub
      // 0471: i2f
      // 0472: ldc 0.5
      // 0474: fmul
      // 0475: fstore 17
      // 0477: aload 0
      // 0478: invokespecial me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a ()Ljava/util/List;
      // 047b: checkcast java/lang/Iterable
      // 047e: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 0483: astore 20
      // 0485: aload 20
      // 0487: aload 3
      // 0488: ifnonnull 04ad
      // 048b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0490: ifne 04a6
      // 0493: goto 049a
      // 0496: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0499: athrow
      // 049a: new java/util/NoSuchElementException
      // 049d: dup
      // 049e: invokespecial java/util/NoSuchElementException.<init> ()V
      // 04a1: athrow
      // 04a2: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04a5: athrow
      // 04a6: aload 20
      // 04a8: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 04ad: checkcast me/octo/client/IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl
      // 04b0: astore 21
      // 04b2: bipush 0
      // 04b3: istore 22
      // 04b5: aload 21
      // 04b7: invokevirtual me/octo/client/IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl.c ()I
      // 04ba: istore 21
      // 04bc: aload 20
      // 04be: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 04c3: ifeq 0501
      // 04c6: aload 20
      // 04c8: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 04cd: checkcast me/octo/client/IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl
      // 04d0: astore 22
      // 04d2: bipush 0
      // 04d3: istore 23
      // 04d5: aload 22
      // 04d7: invokevirtual me/octo/client/IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl.c ()I
      // 04da: istore 22
      // 04dc: iload 21
      // 04de: aload 3
      // 04df: ifnonnull 0503
      // 04e2: aload 3
      // 04e3: ifnonnull 04fb
      // 04e6: goto 04ed
      // 04e9: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04ec: athrow
      // 04ed: iload 22
      // 04ef: if_icmpge 04bc
      // 04f2: goto 04f9
      // 04f5: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04f8: athrow
      // 04f9: iload 22
      // 04fb: istore 21
      // 04fd: aload 3
      // 04fe: ifnull 04bc
      // 0501: iload 21
      // 0503: aload 0
      // 0504: invokespecial me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a ()Ljava/util/List;
      // 0507: checkcast java/lang/Iterable
      // 050a: astore 19
      // 050c: istore 60
      // 050e: aload 19
      // 0510: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 0515: astore 20
      // 0517: aload 20
      // 0519: aload 3
      // 051a: ifnonnull 053f
      // 051d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0522: ifne 0538
      // 0525: goto 052c
      // 0528: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 052b: athrow
      // 052c: new java/util/NoSuchElementException
      // 052f: dup
      // 0530: invokespecial java/util/NoSuchElementException.<init> ()V
      // 0533: athrow
      // 0534: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0537: athrow
      // 0538: aload 20
      // 053a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 053f: checkcast me/octo/client/IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl
      // 0542: astore 21
      // 0544: bipush 0
      // 0545: istore 22
      // 0547: aload 21
      // 0549: invokevirtual me/octo/client/IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl.c ()I
      // 054c: istore 21
      // 054e: aload 20
      // 0550: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0555: ifeq 0593
      // 0558: aload 20
      // 055a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 055f: checkcast me/octo/client/IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl
      // 0562: astore 22
      // 0564: bipush 0
      // 0565: istore 23
      // 0567: aload 22
      // 0569: invokevirtual me/octo/client/IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl.c ()I
      // 056c: istore 22
      // 056e: iload 21
      // 0570: aload 3
      // 0571: ifnonnull 058d
      // 0574: iload 22
      // 0576: aload 3
      // 0577: ifnonnull 059b
      // 057a: goto 0581
      // 057d: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0580: athrow
      // 0581: if_icmple 054e
      // 0584: goto 058b
      // 0587: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 058a: athrow
      // 058b: iload 22
      // 058d: istore 21
      // 058f: aload 3
      // 0590: ifnull 054e
      // 0593: iload 21
      // 0595: istore 61
      // 0597: iload 60
      // 0599: iload 61
      // 059b: isub
      // 059c: i2f
      // 059d: ldc 0.5
      // 059f: fmul
      // 05a0: fstore 18
      // 05a2: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 05a5: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.c ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 05a8: ldc_w 0.35
      // 05ab: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 05ae: astore 19
      // 05b0: bipush 4
      // 05b1: anewarray 614
      // 05b4: astore 21
      // 05b6: aload 21
      // 05b8: bipush 0
      // 05b9: fload 8
      // 05bb: fload 9
      // 05bd: fload 10
      // 05bf: fload 11
      // 05c1: fload 7
      // 05c3: fload 17
      // 05c5: fneg
      // 05c6: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII F
      // 05c9: fload 18
      // 05cb: fneg
      // 05cc: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (FFFFFFFF)Lkotlin/Triple;
      // 05cf: aastore
      // 05d0: aload 21
      // 05d2: bipush 1
      // 05d3: fload 8
      // 05d5: fload 9
      // 05d7: fload 10
      // 05d9: fload 11
      // 05db: fload 7
      // 05dd: fload 17
      // 05df: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII F
      // 05e2: fload 18
      // 05e4: fneg
      // 05e5: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (FFFFFFFF)Lkotlin/Triple;
      // 05e8: aastore
      // 05e9: aload 21
      // 05eb: bipush 2
      // 05ec: fload 8
      // 05ee: fload 9
      // 05f0: fload 10
      // 05f2: fload 11
      // 05f4: fload 7
      // 05f6: fload 17
      // 05f8: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII F
      // 05fb: fload 18
      // 05fd: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (FFFFFFFF)Lkotlin/Triple;
      // 0600: aastore
      // 0601: aload 21
      // 0603: bipush 3
      // 0604: fload 8
      // 0606: fload 9
      // 0608: fload 10
      // 060a: fload 11
      // 060c: fload 7
      // 060e: fload 17
      // 0610: fneg
      // 0611: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII F
      // 0614: fload 18
      // 0616: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (FFFFFFFF)Lkotlin/Triple;
      // 0619: aastore
      // 061a: aload 21
      // 061c: invokestatic kotlin/collections/CollectionsKt.listOf ([Ljava/lang/Object;)Ljava/util/List;
      // 061f: astore 20
      // 0621: bipush 0
      // 0622: istore 21
      // 0624: aload 20
      // 0626: checkcast java/util/Collection
      // 0629: invokeinterface java/util/Collection.size ()I 1
      // 062e: istore 22
      // 0630: iload 21
      // 0632: iload 22
      // 0634: if_icmpge 06a9
      // 0637: aload 20
      // 0639: iload 21
      // 063b: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0640: checkcast kotlin/Triple
      // 0643: astore 23
      // 0645: aload 20
      // 0647: aload 3
      // 0648: ifnonnull 06b0
      // 064b: iload 21
      // 064d: bipush 1
      // 064e: iadd
      // 064f: aload 20
      // 0651: invokeinterface java/util/List.size ()I 1
      // 0656: irem
      // 0657: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 065c: checkcast kotlin/Triple
      // 065f: astore 24
      // 0661: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
      // 0664: fload 4
      // 0666: aload 23
      // 0668: invokevirtual kotlin/Triple.getFirst ()Ljava/lang/Object;
      // 066b: checkcast java/lang/Number
      // 066e: invokevirtual java/lang/Number.floatValue ()F
      // 0671: fadd
      // 0672: fload 5
      // 0674: aload 23
      // 0676: invokevirtual kotlin/Triple.getSecond ()Ljava/lang/Object;
      // 0679: checkcast java/lang/Number
      // 067c: invokevirtual java/lang/Number.floatValue ()F
      // 067f: fadd
      // 0680: fload 4
      // 0682: aload 24
      // 0684: invokevirtual kotlin/Triple.getFirst ()Ljava/lang/Object;
      // 0687: checkcast java/lang/Number
      // 068a: invokevirtual java/lang/Number.floatValue ()F
      // 068d: fadd
      // 068e: fload 5
      // 0690: aload 24
      // 0692: invokevirtual kotlin/Triple.getSecond ()Ljava/lang/Object;
      // 0695: checkcast java/lang/Number
      // 0698: invokevirtual java/lang/Number.floatValue ()F
      // 069b: fadd
      // 069c: fconst_1
      // 069d: aload 19
      // 069f: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;)V
      // 06a2: iinc 21 1
      // 06a5: aload 3
      // 06a6: ifnull 0630
      // 06a9: aload 0
      // 06aa: invokespecial me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a ()Ljava/util/List;
      // 06ad: checkcast java/lang/Iterable
      // 06b0: astore 22
      // 06b2: bipush 0
      // 06b3: istore 23
      // 06b5: aload 22
      // 06b7: astore 24
      // 06b9: new java/util/ArrayList
      // 06bc: dup
      // 06bd: aload 22
      // 06bf: bipush 10
      // 06c1: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
      // 06c4: invokespecial java/util/ArrayList.<init> (I)V
      // 06c7: checkcast java/util/Collection
      // 06ca: astore 25
      // 06cc: bipush 0
      // 06cd: istore 26
      // 06cf: bipush 0
      // 06d0: istore 27
      // 06d2: aload 24
      // 06d4: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 06d9: astore 28
      // 06db: aload 28
      // 06dd: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 06e2: ifeq 0782
      // 06e5: aload 28
      // 06e7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 06ec: astore 29
      // 06ee: aload 25
      // 06f0: iload 27
      // 06f2: iinc 27 1
      // 06f5: istore 30
      // 06f7: aload 3
      // 06f8: ifnonnull 0784
      // 06fb: iload 30
      // 06fd: aload 3
      // 06fe: ifnonnull 0717
      // 0701: goto 0708
      // 0704: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0707: athrow
      // 0708: ifge 0715
      // 070b: goto 0712
      // 070e: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0711: athrow
      // 0712: invokestatic kotlin/collections/CollectionsKt.throwIndexOverflow ()V
      // 0715: iload 30
      // 0717: aload 29
      // 0719: checkcast me/octo/client/IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl
      // 071c: astore 31
      // 071e: istore 32
      // 0720: astore 60
      // 0722: bipush 0
      // 0723: istore 33
      // 0725: fload 8
      // 0727: fload 9
      // 0729: fload 10
      // 072b: fload 11
      // 072d: fload 7
      // 072f: aload 31
      // 0731: invokevirtual me/octo/client/IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl.a ()I
      // 0734: i2f
      // 0735: aload 31
      // 0737: invokevirtual me/octo/client/IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl.b ()I
      // 073a: i2f
      // 073b: aload 31
      // 073d: invokevirtual me/octo/client/IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl.c ()I
      // 0740: i2f
      // 0741: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.b (FFFFFFFF)Lkotlin/Triple;
      // 0744: astore 34
      // 0746: new me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 0749: dup
      // 074a: aload 34
      // 074c: invokevirtual kotlin/Triple.getFirst ()Ljava/lang/Object;
      // 074f: checkcast java/lang/Number
      // 0752: invokevirtual java/lang/Number.floatValue ()F
      // 0755: aload 34
      // 0757: invokevirtual kotlin/Triple.getSecond ()Ljava/lang/Object;
      // 075a: checkcast java/lang/Number
      // 075d: invokevirtual java/lang/Number.floatValue ()F
      // 0760: aload 34
      // 0762: invokevirtual kotlin/Triple.getThird ()Ljava/lang/Object;
      // 0765: checkcast java/lang/Number
      // 0768: invokevirtual java/lang/Number.floatValue ()F
      // 076b: aload 31
      // 076d: invokevirtual me/octo/client/IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl.d ()Ljava/lang/String;
      // 0770: iload 32
      // 0772: invokespecial me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.<init> (FFFLjava/lang/String;I)V
      // 0775: aload 60
      // 0777: swap
      // 0778: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 077d: pop
      // 077e: aload 3
      // 077f: ifnull 06db
      // 0782: aload 25
      // 0784: checkcast java/util/List
      // 0787: nop
      // 0788: astore 21
      // 078a: bipush -1
      // 078b: istore 22
      // 078d: ldc_w 3.4028235E38
      // 0790: fstore 23
      // 0792: ldc_w 14.0
      // 0795: fstore 24
      // 0797: aload 21
      // 0799: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 079e: astore 25
      // 07a0: aload 25
      // 07a2: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 07a7: ifeq 080a
      // 07aa: aload 25
      // 07ac: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 07b1: checkcast me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 07b4: astore 26
      // 07b6: fload 4
      // 07b8: aload 26
      // 07ba: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()F
      // 07bd: fadd
      // 07be: iload 1
      // 07bf: i2f
      // 07c0: fsub
      // 07c1: fstore 27
      // 07c3: fload 5
      // 07c5: aload 26
      // 07c7: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()F
      // 07ca: fadd
      // 07cb: iload 2
      // 07cc: i2f
      // 07cd: fsub
      // 07ce: fstore 28
      // 07d0: fload 27
      // 07d2: fload 27
      // 07d4: fmul
      // 07d5: fload 28
      // 07d7: fload 28
      // 07d9: fmul
      // 07da: fadd
      // 07db: fstore 29
      // 07dd: fload 29
      // 07df: fload 23
      // 07e1: fcmpg
      // 07e2: aload 3
      // 07e3: ifnonnull 0812
      // 07e6: aload 3
      // 07e7: ifnonnull 0804
      // 07ea: goto 07f1
      // 07ed: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07f0: athrow
      // 07f1: ifge 07a0
      // 07f4: goto 07fb
      // 07f7: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07fa: athrow
      // 07fb: fload 29
      // 07fd: fstore 23
      // 07ff: aload 26
      // 0801: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()I
      // 0804: istore 22
      // 0806: aload 3
      // 0807: ifnull 07a0
      // 080a: fload 23
      // 080c: fload 24
      // 080e: fload 24
      // 0810: fmul
      // 0811: fcmpg
      // 0812: aload 3
      // 0813: ifnonnull 0822
      // 0816: ifgt 0825
      // 0819: goto 0820
      // 081c: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 081f: athrow
      // 0820: iload 22
      // 0822: goto 0826
      // 0825: bipush -1
      // 0826: putstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl I
      // 0829: aload 21
      // 082b: checkcast java/lang/Iterable
      // 082e: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 0833: astore 27
      // 0835: aload 27
      // 0837: aload 3
      // 0838: ifnonnull 085d
      // 083b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0840: ifne 0856
      // 0843: goto 084a
      // 0846: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0849: athrow
      // 084a: new java/util/NoSuchElementException
      // 084d: dup
      // 084e: invokespecial java/util/NoSuchElementException.<init> ()V
      // 0851: athrow
      // 0852: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0855: athrow
      // 0856: aload 27
      // 0858: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 085d: checkcast me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 0860: astore 28
      // 0862: bipush 0
      // 0863: istore 29
      // 0865: aload 28
      // 0867: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()F
      // 086a: fstore 28
      // 086c: aload 27
      // 086e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0873: ifeq 089d
      // 0876: aload 27
      // 0878: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 087d: checkcast me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 0880: astore 29
      // 0882: bipush 0
      // 0883: istore 30
      // 0885: aload 29
      // 0887: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()F
      // 088a: fstore 29
      // 088c: fload 28
      // 088e: fload 29
      // 0890: invokestatic java/lang/Math.min (FF)F
      // 0893: aload 3
      // 0894: ifnonnull 089f
      // 0897: fstore 28
      // 0899: aload 3
      // 089a: ifnull 086c
      // 089d: fload 28
      // 089f: fstore 25
      // 08a1: aload 21
      // 08a3: checkcast java/lang/Iterable
      // 08a6: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 08ab: astore 28
      // 08ad: aload 28
      // 08af: aload 3
      // 08b0: ifnonnull 08d5
      // 08b3: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 08b8: ifne 08ce
      // 08bb: goto 08c2
      // 08be: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08c1: athrow
      // 08c2: new java/util/NoSuchElementException
      // 08c5: dup
      // 08c6: invokespecial java/util/NoSuchElementException.<init> ()V
      // 08c9: athrow
      // 08ca: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08cd: athrow
      // 08ce: aload 28
      // 08d0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 08d5: checkcast me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 08d8: astore 29
      // 08da: bipush 0
      // 08db: istore 30
      // 08dd: aload 29
      // 08df: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()F
      // 08e2: fstore 29
      // 08e4: aload 28
      // 08e6: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 08eb: ifeq 0915
      // 08ee: aload 28
      // 08f0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 08f5: checkcast me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 08f8: astore 30
      // 08fa: bipush 0
      // 08fb: istore 31
      // 08fd: aload 30
      // 08ff: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()F
      // 0902: fstore 30
      // 0904: fload 29
      // 0906: fload 30
      // 0908: invokestatic java/lang/Math.max (FF)F
      // 090b: aload 3
      // 090c: ifnonnull 0917
      // 090f: fstore 29
      // 0911: aload 3
      // 0912: ifnull 08e4
      // 0915: fload 29
      // 0917: fstore 26
      // 0919: fload 26
      // 091b: fload 25
      // 091d: fsub
      // 091e: ldc_w 0.01
      // 0921: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 0924: fstore 27
      // 0926: aload 3
      // 0927: ifnonnull 094e
      // 092a: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl;
      // 092d: dup
      // 092e: ifnull 0946
      // 0931: goto 0938
      // 0934: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0937: athrow
      // 0938: invokevirtual me/octo/client/IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl.c ()Ljava/lang/String;
      // 093b: dup
      // 093c: ifnonnull 0950
      // 093f: goto 0946
      // 0942: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0945: athrow
      // 0946: pop
      // 0947: goto 094e
      // 094a: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 094d: athrow
      // 094e: ldc ""
      // 0950: astore 28
      // 0952: aload 0
      // 0953: aload 28
      // 0955: invokespecial me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.c (Ljava/lang/String;)Z
      // 0958: istore 29
      // 095a: new java/util/ArrayList
      // 095d: dup
      // 095e: invokespecial java/util/ArrayList.<init> ()V
      // 0961: checkcast java/util/List
      // 0964: astore 30
      // 0966: new java/util/ArrayList
      // 0969: dup
      // 096a: invokespecial java/util/ArrayList.<init> ()V
      // 096d: checkcast java/util/List
      // 0970: astore 31
      // 0972: iload 29
      // 0974: aload 3
      // 0975: ifnonnull 09c3
      // 0978: ifeq 09c2
      // 097b: goto 0982
      // 097e: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0981: athrow
      // 0982: bipush 0
      // 0983: istore 32
      // 0985: aload 0
      // 0986: invokespecial me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a ()Ljava/util/List;
      // 0989: invokeinterface java/util/List.size ()I 1
      // 098e: bipush 1
      // 098f: isub
      // 0990: istore 33
      // 0992: iload 32
      // 0994: iload 33
      // 0996: if_icmpge 0ae8
      // 0999: aload 30
      // 099b: iload 32
      // 099d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 09a0: iload 32
      // 09a2: bipush 1
      // 09a3: iadd
      // 09a4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 09a7: invokestatic kotlin/TuplesKt.to (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
      // 09aa: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 09af: pop
      // 09b0: iinc 32 1
      // 09b3: aload 3
      // 09b4: ifnonnull 0afd
      // 09b7: aload 3
      // 09b8: ifnull 0992
      // 09bb: goto 09c2
      // 09be: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09c1: athrow
      // 09c2: bipush -1
      // 09c3: istore 32
      // 09c5: bipush 0
      // 09c6: istore 33
      // 09c8: aload 0
      // 09c9: invokespecial me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a ()Ljava/util/List;
      // 09cc: checkcast java/util/Collection
      // 09cf: invokeinterface java/util/Collection.size ()I 1
      // 09d4: istore 34
      // 09d6: iload 33
      // 09d8: iload 34
      // 09da: if_icmpge 0a4c
      // 09dd: aload 0
      // 09de: invokespecial me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a ()Ljava/util/List;
      // 09e1: iload 33
      // 09e3: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 09e8: checkcast me/octo/client/IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl
      // 09eb: invokevirtual me/octo/client/IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl.d ()Ljava/lang/String;
      // 09ee: sipush 16088
      // 09f1: sipush -19755
      // 09f4: pop2
      // 09f5: ldc_w "MINE"
      // 09f8: bipush 1
      // 09f9: invokestatic kotlin/text/StringsKt.equals (Ljava/lang/String;Ljava/lang/String;Z)Z
      // 09fc: aload 3
      // 09fd: ifnonnull 0a5e
      // 0a00: aload 3
      // 0a01: ifnonnull 0a17
      // 0a04: goto 0a0b
      // 0a07: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a0a: athrow
      // 0a0b: ifne 0a45
      // 0a0e: goto 0a15
      // 0a11: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a14: athrow
      // 0a15: iload 32
      // 0a17: aload 3
      // 0a18: ifnonnull 0a43
      // 0a1b: iflt 0a41
      // 0a1e: goto 0a25
      // 0a21: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a24: athrow
      // 0a25: aload 30
      // 0a27: iload 32
      // 0a29: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a2c: iload 33
      // 0a2e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a31: invokestatic kotlin/TuplesKt.to (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
      // 0a34: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0a39: pop
      // 0a3a: goto 0a41
      // 0a3d: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a40: athrow
      // 0a41: iload 33
      // 0a43: istore 32
      // 0a45: iinc 33 1
      // 0a48: aload 3
      // 0a49: ifnull 09d6
      // 0a4c: bipush -1
      // 0a4d: istore 33
      // 0a4f: bipush 0
      // 0a50: istore 34
      // 0a52: aload 0
      // 0a53: invokespecial me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a ()Ljava/util/List;
      // 0a56: checkcast java/util/Collection
      // 0a59: invokeinterface java/util/Collection.size ()I 1
      // 0a5e: istore 35
      // 0a60: iload 34
      // 0a62: iload 35
      // 0a64: if_icmpge 0ae8
      // 0a67: aload 0
      // 0a68: invokespecial me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a ()Ljava/util/List;
      // 0a6b: iload 34
      // 0a6d: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0a72: checkcast me/octo/client/IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl
      // 0a75: invokevirtual me/octo/client/IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl.d ()Ljava/lang/String;
      // 0a78: sipush 16068
      // 0a7b: sipush -5765
      // 0a7e: pop2
      // 0a7f: ldc_w "MINE"
      // 0a82: bipush 1
      // 0a83: invokestatic kotlin/text/StringsKt.equals (Ljava/lang/String;Ljava/lang/String;Z)Z
      // 0a86: aload 3
      // 0a87: ifnonnull 0aeb
      // 0a8a: aload 3
      // 0a8b: ifnonnull 0adf
      // 0a8e: goto 0a95
      // 0a91: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a94: athrow
      // 0a95: ifeq 0ad6
      // 0a98: goto 0a9f
      // 0a9b: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a9e: athrow
      // 0a9f: iload 33
      // 0aa1: aload 3
      // 0aa2: ifnonnull 0ad1
      // 0aa5: goto 0aac
      // 0aa8: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0aab: athrow
      // 0aac: iflt 0ae1
      // 0aaf: goto 0ab6
      // 0ab2: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ab5: athrow
      // 0ab6: aload 31
      // 0ab8: iload 33
      // 0aba: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0abd: iload 34
      // 0abf: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ac2: invokestatic kotlin/TuplesKt.to (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
      // 0ac5: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0aca: goto 0ad1
      // 0acd: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ad0: athrow
      // 0ad1: pop
      // 0ad2: aload 3
      // 0ad3: ifnull 0ae1
      // 0ad6: iload 34
      // 0ad8: goto 0adf
      // 0adb: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ade: athrow
      // 0adf: istore 33
      // 0ae1: iinc 34 1
      // 0ae4: aload 3
      // 0ae5: ifnull 0a60
      // 0ae8: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl I
      // 0aeb: aload 3
      // 0aec: ifnonnull 0afa
      // 0aef: iflt 0afd
      // 0af2: goto 0af9
      // 0af5: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0af8: athrow
      // 0af9: bipush 1
      // 0afa: goto 0afe
      // 0afd: bipush 0
      // 0afe: istore 32
      // 0b00: new java/util/HashSet
      // 0b03: dup
      // 0b04: invokespecial java/util/HashSet.<init> ()V
      // 0b07: astore 33
      // 0b09: iload 32
      // 0b0b: aload 3
      // 0b0c: ifnonnull 0b2b
      // 0b0f: ifeq 0c37
      // 0b12: goto 0b19
      // 0b15: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b18: athrow
      // 0b19: aload 33
      // 0b1b: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl I
      // 0b1e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b21: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 0b24: goto 0b2b
      // 0b27: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b2a: athrow
      // 0b2b: pop
      // 0b2c: aload 30
      // 0b2e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0b33: astore 34
      // 0b35: aload 34
      // 0b37: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0b3c: ifeq 0bb7
      // 0b3f: aload 34
      // 0b41: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0b46: checkcast kotlin/Pair
      // 0b49: astore 35
      // 0b4b: aload 35
      // 0b4d: invokevirtual kotlin/Pair.component1 ()Ljava/lang/Object;
      // 0b50: checkcast java/lang/Number
      // 0b53: invokevirtual java/lang/Number.intValue ()I
      // 0b56: istore 36
      // 0b58: aload 35
      // 0b5a: invokevirtual kotlin/Pair.component2 ()Ljava/lang/Object;
      // 0b5d: checkcast java/lang/Number
      // 0b60: invokevirtual java/lang/Number.intValue ()I
      // 0b63: istore 37
      // 0b65: iload 36
      // 0b67: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl I
      // 0b6a: aload 3
      // 0b6b: ifnonnull 0bf5
      // 0b6e: aload 3
      // 0b6f: ifnonnull 0ba5
      // 0b72: goto 0b79
      // 0b75: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b78: athrow
      // 0b79: if_icmpne 0b95
      // 0b7c: goto 0b83
      // 0b7f: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b82: athrow
      // 0b83: aload 33
      // 0b85: iload 37
      // 0b87: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b8a: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 0b8d: pop
      // 0b8e: goto 0b95
      // 0b91: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b94: athrow
      // 0b95: iload 37
      // 0b97: aload 3
      // 0b98: ifnonnull 0bb2
      // 0b9b: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl I
      // 0b9e: goto 0ba5
      // 0ba1: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ba4: athrow
      // 0ba5: if_icmpne 0b35
      // 0ba8: aload 33
      // 0baa: iload 36
      // 0bac: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0baf: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 0bb2: pop
      // 0bb3: aload 3
      // 0bb4: ifnull 0b35
      // 0bb7: aload 31
      // 0bb9: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0bbe: astore 34
      // 0bc0: aload 34
      // 0bc2: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0bc7: ifeq 0c37
      // 0bca: aload 34
      // 0bcc: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0bd1: checkcast kotlin/Pair
      // 0bd4: astore 35
      // 0bd6: aload 35
      // 0bd8: invokevirtual kotlin/Pair.component1 ()Ljava/lang/Object;
      // 0bdb: checkcast java/lang/Number
      // 0bde: invokevirtual java/lang/Number.intValue ()I
      // 0be1: istore 36
      // 0be3: aload 35
      // 0be5: invokevirtual kotlin/Pair.component2 ()Ljava/lang/Object;
      // 0be8: checkcast java/lang/Number
      // 0beb: invokevirtual java/lang/Number.intValue ()I
      // 0bee: istore 37
      // 0bf0: iload 36
      // 0bf2: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl I
      // 0bf5: aload 3
      // 0bf6: ifnonnull 0c25
      // 0bf9: if_icmpne 0c15
      // 0bfc: goto 0c03
      // 0bff: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c02: athrow
      // 0c03: aload 33
      // 0c05: iload 37
      // 0c07: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c0a: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 0c0d: pop
      // 0c0e: goto 0c15
      // 0c11: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c14: athrow
      // 0c15: iload 37
      // 0c17: aload 3
      // 0c18: ifnonnull 0c32
      // 0c1b: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl I
      // 0c1e: goto 0c25
      // 0c21: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c24: athrow
      // 0c25: if_icmpne 0bc0
      // 0c28: aload 33
      // 0c2a: iload 36
      // 0c2c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c2f: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 0c32: pop
      // 0c33: aload 3
      // 0c34: ifnull 0bc0
      // 0c37: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 0c3a: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.c ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 0c3d: astore 34
      // 0c3f: aload 31
      // 0c41: checkcast java/lang/Iterable
      // 0c44: astore 36
      // 0c46: bipush 0
      // 0c47: istore 37
      // 0c49: aload 36
      // 0c4b: astore 38
      // 0c4d: new java/util/LinkedHashMap
      // 0c50: dup
      // 0c51: invokespecial java/util/LinkedHashMap.<init> ()V
      // 0c54: checkcast java/util/Map
      // 0c57: astore 39
      // 0c59: bipush 0
      // 0c5a: istore 40
      // 0c5c: aload 38
      // 0c5e: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 0c63: astore 41
      // 0c65: aload 41
      // 0c67: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0c6c: ifeq 0ce7
      // 0c6f: aload 41
      // 0c71: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0c76: astore 42
      // 0c78: aload 42
      // 0c7a: checkcast kotlin/Pair
      // 0c7d: astore 43
      // 0c7f: bipush 0
      // 0c80: istore 44
      // 0c82: aload 43
      // 0c84: invokevirtual kotlin/Pair.getFirst ()Ljava/lang/Object;
      // 0c87: checkcast java/lang/Number
      // 0c8a: invokevirtual java/lang/Number.intValue ()I
      // 0c8d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c90: astore 45
      // 0c92: aload 39
      // 0c94: astore 46
      // 0c96: aload 45
      // 0c98: astore 47
      // 0c9a: bipush 0
      // 0c9b: istore 48
      // 0c9d: aload 46
      // 0c9f: aload 3
      // 0ca0: ifnonnull 0cea
      // 0ca3: aload 47
      // 0ca5: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0caa: astore 49
      // 0cac: aload 49
      // 0cae: ifnonnull 0cd1
      // 0cb1: bipush 0
      // 0cb2: istore 50
      // 0cb4: new java/util/ArrayList
      // 0cb7: dup
      // 0cb8: invokespecial java/util/ArrayList.<init> ()V
      // 0cbb: checkcast java/util/List
      // 0cbe: astore 50
      // 0cc0: aload 46
      // 0cc2: aload 47
      // 0cc4: aload 50
      // 0cc6: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0ccb: pop
      // 0ccc: aload 50
      // 0cce: goto 0cd3
      // 0cd1: aload 49
      // 0cd3: nop
      // 0cd4: checkcast java/util/List
      // 0cd7: astore 43
      // 0cd9: aload 43
      // 0cdb: aload 42
      // 0cdd: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0ce2: pop
      // 0ce3: aload 3
      // 0ce4: ifnull 0c65
      // 0ce7: aload 39
      // 0ce9: nop
      // 0cea: astore 35
      // 0cec: aload 35
      // 0cee: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 0cf3: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0cf8: astore 36
      // 0cfa: aload 36
      // 0cfc: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0d01: ifeq 0f20
      // 0d04: aload 36
      // 0d06: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0d0b: checkcast java/util/Map$Entry
      // 0d0e: astore 37
      // 0d10: aload 37
      // 0d12: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 0d17: checkcast java/lang/Number
      // 0d1a: invokevirtual java/lang/Number.intValue ()I
      // 0d1d: istore 38
      // 0d1f: aload 37
      // 0d21: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 0d26: checkcast java/util/List
      // 0d29: astore 39
      // 0d2b: aload 39
      // 0d2d: invokeinterface java/util/List.size ()I 1
      // 0d32: istore 40
      // 0d34: aload 39
      // 0d36: checkcast java/lang/Iterable
      // 0d39: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 0d3e: astore 41
      // 0d40: bipush 0
      // 0d41: istore 42
      // 0d43: aload 41
      // 0d45: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0d4a: ifeq 0cfa
      // 0d4d: iload 42
      // 0d4f: istore 43
      // 0d51: iload 42
      // 0d53: bipush 1
      // 0d54: iadd
      // 0d55: istore 42
      // 0d57: aload 41
      // 0d59: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0d5e: checkcast kotlin/Pair
      // 0d61: astore 44
      // 0d63: aload 44
      // 0d65: invokevirtual kotlin/Pair.getSecond ()Ljava/lang/Object;
      // 0d68: checkcast java/lang/Number
      // 0d6b: invokevirtual java/lang/Number.intValue ()I
      // 0d6e: istore 45
      // 0d70: aload 21
      // 0d72: iload 38
      // 0d74: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0d79: checkcast me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 0d7c: astore 46
      // 0d7e: aload 21
      // 0d80: iload 45
      // 0d82: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0d87: checkcast me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 0d8a: astore 47
      // 0d8c: fload 4
      // 0d8e: aload 46
      // 0d90: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()F
      // 0d93: fadd
      // 0d94: fstore 48
      // 0d96: fload 5
      // 0d98: aload 46
      // 0d9a: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()F
      // 0d9d: fadd
      // 0d9e: fstore 49
      // 0da0: fload 4
      // 0da2: aload 47
      // 0da4: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()F
      // 0da7: fadd
      // 0da8: fstore 50
      // 0daa: fload 5
      // 0dac: aload 47
      // 0dae: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()F
      // 0db1: fadd
      // 0db2: fstore 51
      // 0db4: aload 46
      // 0db6: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()F
      // 0db9: aload 47
      // 0dbb: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()F
      // 0dbe: fadd
      // 0dbf: ldc 0.5
      // 0dc1: fmul
      // 0dc2: fstore 52
      // 0dc4: aload 46
      // 0dc6: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()I
      // 0dc9: aload 3
      // 0dca: ifnonnull 0d41
      // 0dcd: aload 3
      // 0dce: ifnonnull 0d01
      // 0dd1: aload 3
      // 0dd2: ifnonnull 0e07
      // 0dd5: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl I
      // 0dd8: if_icmpeq 0dff
      // 0ddb: goto 0de2
      // 0dde: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0de1: athrow
      // 0de2: aload 47
      // 0de4: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()I
      // 0de7: aload 3
      // 0de8: ifnonnull 0e07
      // 0deb: goto 0df2
      // 0dee: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0df1: athrow
      // 0df2: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl I
      // 0df5: if_icmpne 0e0a
      // 0df8: goto 0dff
      // 0dfb: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dfe: athrow
      // 0dff: bipush 1
      // 0e00: goto 0e07
      // 0e03: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e06: athrow
      // 0e07: goto 0e0b
      // 0e0a: bipush 0
      // 0e0b: istore 53
      // 0e0d: iload 32
      // 0e0f: aload 3
      // 0e10: ifnonnull 0e62
      // 0e13: ifeq 0e61
      // 0e16: goto 0e1d
      // 0e19: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e1c: athrow
      // 0e1d: aload 33
      // 0e1f: aload 46
      // 0e21: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()I
      // 0e24: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e27: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 0e2a: aload 3
      // 0e2b: ifnonnull 0e62
      // 0e2e: goto 0e35
      // 0e31: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e34: athrow
      // 0e35: ifne 0e61
      // 0e38: goto 0e3f
      // 0e3b: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e3e: athrow
      // 0e3f: aload 33
      // 0e41: aload 47
      // 0e43: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()I
      // 0e46: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e49: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 0e4c: aload 3
      // 0e4d: ifnonnull 0e62
      // 0e50: goto 0e57
      // 0e53: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e56: athrow
      // 0e57: ifeq 0e65
      // 0e5a: goto 0e61
      // 0e5d: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e60: athrow
      // 0e61: bipush 1
      // 0e62: goto 0e66
      // 0e65: bipush 0
      // 0e66: istore 54
      // 0e68: iload 54
      // 0e6a: ifeq 0e75
      // 0e6d: fconst_1
      // 0e6e: goto 0e78
      // 0e71: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e74: athrow
      // 0e75: ldc_w 0.22
      // 0e78: fstore 55
      // 0e7a: iload 53
      // 0e7c: ifeq 0e89
      // 0e7f: ldc_w 0.95
      // 0e82: goto 0e94
      // 0e85: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e88: athrow
      // 0e89: fload 25
      // 0e8b: fload 27
      // 0e8d: fload 52
      // 0e8f: ldc 0.5
      // 0e91: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (FFFF)F
      // 0e94: fload 55
      // 0e96: fmul
      // 0e97: fstore 56
      // 0e99: iload 53
      // 0e9b: ifeq 0ea7
      // 0e9e: ldc 1.6
      // 0ea0: goto 0eaa
      // 0ea3: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ea6: athrow
      // 0ea7: ldc_w 1.15
      // 0eaa: fconst_1
      // 0eab: fmul
      // 0eac: fstore 57
      // 0eae: iload 40
      // 0eb0: aload 3
      // 0eb1: ifnonnull 0ec8
      // 0eb4: bipush 1
      // 0eb5: if_icmple 0ed7
      // 0eb8: goto 0ebf
      // 0ebb: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ebe: athrow
      // 0ebf: iload 43
      // 0ec1: goto 0ec8
      // 0ec4: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ec7: athrow
      // 0ec8: i2f
      // 0ec9: iload 40
      // 0ecb: bipush 1
      // 0ecc: isub
      // 0ecd: i2f
      // 0ece: fdiv
      // 0ecf: ldc 0.5
      // 0ed1: fsub
      // 0ed2: fconst_2
      // 0ed3: fmul
      // 0ed4: goto 0ed8
      // 0ed7: fconst_0
      // 0ed8: fstore 58
      // 0eda: fload 58
      // 0edc: ldc 0.18
      // 0ede: fmul
      // 0edf: fstore 59
      // 0ee1: aload 0
      // 0ee2: fload 48
      // 0ee4: fload 49
      // 0ee6: fload 50
      // 0ee8: fload 51
      // 0eea: fload 59
      // 0eec: aload 34
      // 0eee: fload 56
      // 0ef0: ldc_w 0.7
      // 0ef3: aload 3
      // 0ef4: ifnonnull 0f13
      // 0ef7: fmul
      // 0ef8: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 0efb: fload 57
      // 0efd: iload 53
      // 0eff: ifeq 0f16
      // 0f02: goto 0f09
      // 0f05: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f08: athrow
      // 0f09: ldc_w 5.5
      // 0f0c: goto 0f13
      // 0f0f: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f12: athrow
      // 0f13: goto 0f19
      // 0f16: ldc_w 4.5
      // 0f19: invokespecial me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (FFFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;FF)V
      // 0f1c: aload 3
      // 0f1d: ifnull 0d43
      // 0f20: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 0f23: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.a ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 0f26: astore 36
      // 0f28: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 0f2b: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.a ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 0f2e: astore 37
      // 0f30: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 0f33: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.c ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 0f36: astore 38
      // 0f38: aload 30
      // 0f3a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0f3f: astore 39
      // 0f41: aload 39
      // 0f43: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0f48: ifeq 11dc
      // 0f4b: aload 39
      // 0f4d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0f52: checkcast kotlin/Pair
      // 0f55: astore 40
      // 0f57: aload 40
      // 0f59: invokevirtual kotlin/Pair.component1 ()Ljava/lang/Object;
      // 0f5c: checkcast java/lang/Number
      // 0f5f: invokevirtual java/lang/Number.intValue ()I
      // 0f62: istore 41
      // 0f64: aload 40
      // 0f66: invokevirtual kotlin/Pair.component2 ()Ljava/lang/Object;
      // 0f69: checkcast java/lang/Number
      // 0f6c: invokevirtual java/lang/Number.intValue ()I
      // 0f6f: istore 42
      // 0f71: aload 21
      // 0f73: iload 41
      // 0f75: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0f7a: checkcast me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 0f7d: astore 43
      // 0f7f: aload 21
      // 0f81: iload 42
      // 0f83: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0f88: checkcast me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 0f8b: astore 44
      // 0f8d: fload 4
      // 0f8f: aload 43
      // 0f91: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()F
      // 0f94: fadd
      // 0f95: fstore 45
      // 0f97: fload 5
      // 0f99: aload 43
      // 0f9b: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()F
      // 0f9e: fadd
      // 0f9f: fstore 46
      // 0fa1: fload 4
      // 0fa3: aload 44
      // 0fa5: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()F
      // 0fa8: fadd
      // 0fa9: fstore 47
      // 0fab: fload 5
      // 0fad: aload 44
      // 0faf: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()F
      // 0fb2: fadd
      // 0fb3: fstore 48
      // 0fb5: aload 43
      // 0fb7: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()F
      // 0fba: aload 44
      // 0fbc: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()F
      // 0fbf: fadd
      // 0fc0: ldc 0.5
      // 0fc2: fmul
      // 0fc3: fstore 49
      // 0fc5: aload 43
      // 0fc7: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()I
      // 0fca: aload 3
      // 0fcb: ifnonnull 1000
      // 0fce: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl I
      // 0fd1: if_icmpeq 0ff8
      // 0fd4: goto 0fdb
      // 0fd7: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fda: athrow
      // 0fdb: aload 44
      // 0fdd: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()I
      // 0fe0: aload 3
      // 0fe1: ifnonnull 1000
      // 0fe4: goto 0feb
      // 0fe7: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fea: athrow
      // 0feb: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl I
      // 0fee: if_icmpne 1003
      // 0ff1: goto 0ff8
      // 0ff4: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ff7: athrow
      // 0ff8: bipush 1
      // 0ff9: goto 1000
      // 0ffc: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fff: athrow
      // 1000: goto 1004
      // 1003: bipush 0
      // 1004: istore 50
      // 1006: iload 32
      // 1008: aload 3
      // 1009: ifnonnull 105b
      // 100c: ifeq 105a
      // 100f: goto 1016
      // 1012: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1015: athrow
      // 1016: aload 33
      // 1018: aload 43
      // 101a: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()I
      // 101d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1020: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 1023: aload 3
      // 1024: ifnonnull 105b
      // 1027: goto 102e
      // 102a: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 102d: athrow
      // 102e: ifne 105a
      // 1031: goto 1038
      // 1034: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1037: athrow
      // 1038: aload 33
      // 103a: aload 44
      // 103c: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()I
      // 103f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1042: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 1045: aload 3
      // 1046: ifnonnull 105b
      // 1049: goto 1050
      // 104c: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 104f: athrow
      // 1050: ifeq 105e
      // 1053: goto 105a
      // 1056: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1059: athrow
      // 105a: bipush 1
      // 105b: goto 105f
      // 105e: bipush 0
      // 105f: istore 51
      // 1061: iload 51
      // 1063: ifeq 106e
      // 1066: fconst_1
      // 1067: goto 1071
      // 106a: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 106d: athrow
      // 106e: ldc_w 0.22
      // 1071: fstore 52
      // 1073: aload 44
      // 1075: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d ()Ljava/lang/String;
      // 1078: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 107b: invokevirtual java/lang/String.toUpperCase (Ljava/util/Locale;)Ljava/lang/String;
      // 107e: dup
      // 107f: sipush 16070
      // 1082: sipush 8425
      // 1085: pop2
      // 1086: ldc_w "toUpperCase(...)"
      // 1089: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 108c: astore 53
      // 108e: aload 53
      // 1090: sipush 16080
      // 1093: sipush 25393
      // 1096: pop2
      // 1097: ldc_w "WARP"
      // 109a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 109d: aload 3
      // 109e: ifnonnull 1113
      // 10a1: ifeq 1104
      // 10a4: goto 10ab
      // 10a7: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10aa: athrow
      // 10ab: iload 50
      // 10ad: ifeq 10bf
      // 10b0: goto 10b7
      // 10b3: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10b6: athrow
      // 10b7: fconst_1
      // 10b8: goto 10cb
      // 10bb: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10be: athrow
      // 10bf: fload 25
      // 10c1: fload 27
      // 10c3: fload 49
      // 10c5: ldc_w 0.95
      // 10c8: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (FFFF)F
      // 10cb: fload 52
      // 10cd: fmul
      // 10ce: fstore 54
      // 10d0: iload 50
      // 10d2: ifeq 10de
      // 10d5: ldc 1.6
      // 10d7: goto 10df
      // 10da: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10dd: athrow
      // 10de: fconst_1
      // 10df: ldc 0.5
      // 10e1: fmul
      // 10e2: ldc_w 1.1
      // 10e5: fmul
      // 10e6: fstore 55
      // 10e8: aload 0
      // 10e9: fload 45
      // 10eb: fload 46
      // 10ed: fload 47
      // 10ef: fload 48
      // 10f1: aload 36
      // 10f3: fload 54
      // 10f5: ldc_w 0.55
      // 10f8: fmul
      // 10f9: fload 54
      // 10fb: fload 55
      // 10fd: invokespecial me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (FFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;FFF)V
      // 1100: aload 3
      // 1101: ifnull 0f41
      // 1104: aload 53
      // 1106: sipush 16095
      // 1109: sipush -26036
      // 110c: pop2
      // 110d: ldc_w "WALK"
      // 1110: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 1113: aload 3
      // 1114: ifnonnull 1188
      // 1117: ifeq 1186
      // 111a: goto 1121
      // 111d: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1120: athrow
      // 1121: iload 50
      // 1123: ifeq 1137
      // 1126: goto 112d
      // 1129: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 112c: athrow
      // 112d: ldc_w 0.95
      // 1130: goto 1143
      // 1133: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1136: athrow
      // 1137: fload 25
      // 1139: fload 27
      // 113b: fload 49
      // 113d: ldc_w 0.55
      // 1140: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (FFFF)F
      // 1143: fload 52
      // 1145: fmul
      // 1146: fstore 54
      // 1148: aload 0
      // 1149: fload 45
      // 114b: fload 46
      // 114d: fload 47
      // 114f: fload 48
      // 1151: aload 38
      // 1153: fload 54
      // 1155: ldc_w 0.75
      // 1158: fmul
      // 1159: aload 3
      // 115a: ifnonnull 1176
      // 115d: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 1160: iload 50
      // 1162: ifeq 1179
      // 1165: goto 116c
      // 1168: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 116b: athrow
      // 116c: ldc_w 1.8
      // 116f: goto 1176
      // 1172: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1175: athrow
      // 1176: goto 117c
      // 1179: ldc_w 1.3
      // 117c: ldc_w 5.5
      // 117f: invokespecial me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (FFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;FF)V
      // 1182: aload 3
      // 1183: ifnull 0f41
      // 1186: iload 50
      // 1188: ifeq 1193
      // 118b: fconst_1
      // 118c: goto 119f
      // 118f: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1192: athrow
      // 1193: fload 25
      // 1195: fload 27
      // 1197: fload 49
      // 1199: ldc_w 0.72
      // 119c: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (FFFF)F
      // 119f: fload 52
      // 11a1: fmul
      // 11a2: fstore 54
      // 11a4: iload 50
      // 11a6: ifeq 11b2
      // 11a9: ldc 1.6
      // 11ab: goto 11b3
      // 11ae: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11b1: athrow
      // 11b2: fconst_1
      // 11b3: ldc 0.5
      // 11b5: fmul
      // 11b6: fstore 55
      // 11b8: aload 0
      // 11b9: fload 45
      // 11bb: fload 46
      // 11bd: fload 47
      // 11bf: fload 48
      // 11c1: aload 37
      // 11c3: fload 54
      // 11c5: ldc_w 0.55
      // 11c8: fmul
      // 11c9: ldc_w 0.85
      // 11cc: fmul
      // 11cd: fload 54
      // 11cf: ldc_w 0.85
      // 11d2: fmul
      // 11d3: fload 55
      // 11d5: invokespecial me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (FFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;FFF)V
      // 11d8: aload 3
      // 11d9: ifnull 0f41
      // 11dc: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 11df: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.e ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 11e2: ldc_w 0.85
      // 11e5: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 11e8: astore 39
      // 11ea: aload 21
      // 11ec: checkcast java/lang/Iterable
      // 11ef: astore 41
      // 11f1: bipush 0
      // 11f2: istore 42
      // 11f4: aload 41
      // 11f6: new me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 11f9: dup
      // 11fa: invokespecial me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.<init> ()V
      // 11fd: checkcast java/util/Comparator
      // 1200: invokestatic kotlin/collections/CollectionsKt.sortedWith (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
      // 1203: astore 40
      // 1205: aload 40
      // 1207: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 120c: astore 41
      // 120e: aload 41
      // 1210: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1215: ifeq 156d
      // 1218: aload 41
      // 121a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 121f: checkcast me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 1222: astore 42
      // 1224: aload 42
      // 1226: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()I
      // 1229: aload 3
      // 122a: ifnonnull 1246
      // 122d: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl I
      // 1230: aload 3
      // 1231: ifnonnull 165d
      // 1234: goto 123b
      // 1237: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 123a: athrow
      // 123b: if_icmpne 1249
      // 123e: goto 1245
      // 1241: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1244: athrow
      // 1245: bipush 1
      // 1246: goto 124a
      // 1249: bipush 0
      // 124a: istore 43
      // 124c: iload 32
      // 124e: aload 3
      // 124f: ifnonnull 127f
      // 1252: ifeq 127e
      // 1255: goto 125c
      // 1258: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 125b: athrow
      // 125c: aload 33
      // 125e: aload 42
      // 1260: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()I
      // 1263: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1266: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 1269: aload 3
      // 126a: ifnonnull 127f
      // 126d: goto 1274
      // 1270: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1273: athrow
      // 1274: ifeq 1282
      // 1277: goto 127e
      // 127a: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 127d: athrow
      // 127e: bipush 1
      // 127f: goto 1283
      // 1282: bipush 0
      // 1283: istore 44
      // 1285: aload 42
      // 1287: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d ()Ljava/lang/String;
      // 128a: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 128d: invokevirtual java/lang/String.toUpperCase (Ljava/util/Locale;)Ljava/lang/String;
      // 1290: dup
      // 1291: sipush 16085
      // 1294: sipush -7838
      // 1297: pop2
      // 1298: ldc_w "toUpperCase(...)"
      // 129b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 129e: astore 46
      // 12a0: aload 46
      // 12a2: invokevirtual java/lang/String.hashCode ()I
      // 12a5: aload 3
      // 12a6: ifnonnull 12e6
      // 12a9: lookupswitch 135 3 2366547 92 2656713 67 2656904 39
      // 12cc: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12cf: athrow
      // 12d0: aload 46
      // 12d2: sipush 16082
      // 12d5: sipush 22234
      // 12d8: pop2
      // 12d9: ldc_w "WARP"
      // 12dc: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 12df: goto 12e6
      // 12e2: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12e5: athrow
      // 12e6: ifne 131e
      // 12e9: goto 1330
      // 12ec: aload 46
      // 12ee: sipush 16067
      // 12f1: sipush 16157
      // 12f4: pop2
      // 12f5: ldc_w "WALK"
      // 12f8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 12fb: ifne 132a
      // 12fe: goto 1330
      // 1301: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1304: athrow
      // 1305: aload 46
      // 1307: sipush 16068
      // 130a: sipush -5765
      // 130d: pop2
      // 130e: ldc_w "MINE"
      // 1311: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1314: ifne 1324
      // 1317: goto 1330
      // 131a: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 131d: athrow
      // 131e: ldc_w 5.6
      // 1321: goto 1333
      // 1324: ldc_w 4.0
      // 1327: goto 1333
      // 132a: ldc_w 3.2
      // 132d: goto 1333
      // 1330: ldc_w 3.6
      // 1333: fstore 45
      // 1335: aload 42
      // 1337: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d ()Ljava/lang/String;
      // 133a: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 133d: invokevirtual java/lang/String.toUpperCase (Ljava/util/Locale;)Ljava/lang/String;
      // 1340: dup
      // 1341: sipush 16085
      // 1344: sipush -7838
      // 1347: pop2
      // 1348: ldc_w "toUpperCase(...)"
      // 134b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 134e: astore 47
      // 1350: aload 47
      // 1352: invokevirtual java/lang/String.hashCode ()I
      // 1355: aload 3
      // 1356: ifnonnull 1396
      // 1359: lookupswitch 135 3 2366547 92 2656713 67 2656904 39
      // 137c: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 137f: athrow
      // 1380: aload 47
      // 1382: sipush 16082
      // 1385: sipush 22234
      // 1388: pop2
      // 1389: ldc_w "WARP"
      // 138c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 138f: goto 1396
      // 1392: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1395: athrow
      // 1396: ifne 13ce
      // 1399: goto 13e0
      // 139c: aload 47
      // 139e: sipush 16067
      // 13a1: sipush 16157
      // 13a4: pop2
      // 13a5: ldc_w "WALK"
      // 13a8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 13ab: ifne 13da
      // 13ae: goto 13e0
      // 13b1: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13b4: athrow
      // 13b5: aload 47
      // 13b7: sipush 16068
      // 13ba: sipush -5765
      // 13bd: pop2
      // 13be: ldc_w "MINE"
      // 13c1: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 13c4: ifne 13d4
      // 13c7: goto 13e0
      // 13ca: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13cd: athrow
      // 13ce: ldc_w 0.96
      // 13d1: goto 13e3
      // 13d4: ldc_w 0.78
      // 13d7: goto 13e3
      // 13da: ldc_w 0.55
      // 13dd: goto 13e3
      // 13e0: ldc_w 0.78
      // 13e3: fstore 46
      // 13e5: fload 45
      // 13e7: ldc 1.6
      // 13e9: fmul
      // 13ea: fstore 45
      // 13ec: fload 25
      // 13ee: fload 27
      // 13f0: aload 42
      // 13f2: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()F
      // 13f5: fload 46
      // 13f7: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (FFFF)F
      // 13fa: fstore 47
      // 13fc: nop
      // 13fd: iload 43
      // 13ff: aload 3
      // 1400: ifnonnull 1417
      // 1403: ifeq 1415
      // 1406: goto 140d
      // 1409: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 140c: athrow
      // 140d: fconst_1
      // 140e: goto 1429
      // 1411: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1414: athrow
      // 1415: iload 44
      // 1417: ifeq 1423
      // 141a: fload 47
      // 141c: goto 1429
      // 141f: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1422: athrow
      // 1423: fload 47
      // 1425: ldc_w 0.22
      // 1428: fmul
      // 1429: fstore 48
      // 142b: iload 43
      // 142d: ifeq 143d
      // 1430: fload 45
      // 1432: ldc_w 1.7
      // 1435: fmul
      // 1436: goto 143f
      // 1439: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 143c: athrow
      // 143d: fload 45
      // 143f: fstore 49
      // 1441: fload 4
      // 1443: aload 42
      // 1445: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()F
      // 1448: fadd
      // 1449: fstore 50
      // 144b: fload 5
      // 144d: aload 42
      // 144f: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()F
      // 1452: fadd
      // 1453: fstore 51
      // 1455: fload 50
      // 1457: fload 51
      // 1459: fload 49
      // 145b: ldc 1.6
      // 145d: fadd
      // 145e: aload 39
      // 1460: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;)V
      // 1463: aload 42
      // 1465: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d ()Ljava/lang/String;
      // 1468: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 146b: invokevirtual java/lang/String.toUpperCase (Ljava/util/Locale;)Ljava/lang/String;
      // 146e: dup
      // 146f: sipush 16085
      // 1472: sipush -7838
      // 1475: pop2
      // 1476: ldc_w "toUpperCase(...)"
      // 1479: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 147c: astore 52
      // 147e: aload 52
      // 1480: sipush 16067
      // 1483: sipush 16157
      // 1486: pop2
      // 1487: ldc_w "WALK"
      // 148a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 148d: aload 3
      // 148e: ifnonnull 14d3
      // 1491: ifeq 14bd
      // 1494: goto 149b
      // 1497: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 149a: athrow
      // 149b: fload 50
      // 149d: fload 51
      // 149f: fload 49
      // 14a1: ldc_w 1.3
      // 14a4: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 14a7: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.a ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 14aa: fload 48
      // 14ac: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 14af: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b (FFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;)V
      // 14b2: aload 3
      // 14b3: ifnull 152f
      // 14b6: goto 14bd
      // 14b9: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14bc: athrow
      // 14bd: aload 52
      // 14bf: sipush 16082
      // 14c2: sipush 22234
      // 14c5: pop2
      // 14c6: ldc_w "WARP"
      // 14c9: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 14cc: goto 14d3
      // 14cf: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14d2: athrow
      // 14d3: ifeq 1514
      // 14d6: fload 50
      // 14d8: fload 51
      // 14da: fload 49
      // 14dc: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 14df: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.a ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 14e2: fload 48
      // 14e4: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 14e7: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;)V
      // 14ea: fload 50
      // 14ec: fload 51
      // 14ee: fload 49
      // 14f0: ldc_w 2.3
      // 14f3: fadd
      // 14f4: ldc_w 0.9
      // 14f7: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 14fa: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.a ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 14fd: fload 48
      // 14ff: ldc_w 0.55
      // 1502: fmul
      // 1503: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 1506: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b (FFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;)V
      // 1509: aload 3
      // 150a: ifnull 152f
      // 150d: goto 1514
      // 1510: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1513: athrow
      // 1514: fload 50
      // 1516: fload 51
      // 1518: fload 49
      // 151a: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 151d: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.a ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 1520: fload 48
      // 1522: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 1525: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;)V
      // 1528: goto 152f
      // 152b: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 152e: athrow
      // 152f: iload 43
      // 1531: aload 3
      // 1532: ifnonnull 1215
      // 1535: ifeq 120e
      // 1538: fload 50
      // 153a: fload 51
      // 153c: fload 49
      // 153e: ldc_w 3.0
      // 1541: fadd
      // 1542: ldc_w 1.4
      // 1545: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 1548: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.ah ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 154b: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b (FFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;)V
      // 154e: fload 50
      // 1550: fload 51
      // 1552: fload 49
      // 1554: ldc_w 7.0
      // 1557: fadd
      // 1558: ldc_w 0.9
      // 155b: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 155e: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.ah ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 1561: ldc 0.5
      // 1563: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 1566: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b (FFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;)V
      // 1569: aload 3
      // 156a: ifnull 120e
      // 156d: aload 21
      // 156f: checkcast java/util/Collection
      // 1572: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 1577: aload 3
      // 1578: ifnonnull 1586
      // 157b: ifne 1589
      // 157e: goto 1585
      // 1581: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1584: athrow
      // 1585: bipush 1
      // 1586: goto 158a
      // 1589: bipush 0
      // 158a: ifeq 163c
      // 158d: aload 21
      // 158f: invokestatic kotlin/collections/CollectionsKt.first (Ljava/util/List;)Ljava/lang/Object;
      // 1592: checkcast me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 1595: astore 41
      // 1597: aload 21
      // 1599: invokestatic kotlin/collections/CollectionsKt.last (Ljava/util/List;)Ljava/lang/Object;
      // 159c: checkcast me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 159f: astore 42
      // 15a1: fload 4
      // 15a3: aload 41
      // 15a5: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()F
      // 15a8: fadd
      // 15a9: fstore 43
      // 15ab: fload 5
      // 15ad: aload 41
      // 15af: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()F
      // 15b2: fadd
      // 15b3: fstore 44
      // 15b5: fload 4
      // 15b7: aload 42
      // 15b9: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()F
      // 15bc: fadd
      // 15bd: fstore 45
      // 15bf: fload 5
      // 15c1: aload 42
      // 15c3: invokevirtual me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$drawCanvasContent$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()F
      // 15c6: fadd
      // 15c7: fstore 46
      // 15c9: fload 43
      // 15cb: fload 44
      // 15cd: ldc_w 9.0
      // 15d0: ldc_w 1.4
      // 15d3: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 15d6: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.ah ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 15d9: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b (FFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;)V
      // 15dc: fload 43
      // 15de: fload 44
      // 15e0: ldc_w 13.0
      // 15e3: ldc_w 0.8
      // 15e6: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 15e9: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.ah ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 15ec: ldc_w 0.4
      // 15ef: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 15f2: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b (FFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;)V
      // 15f5: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 15f8: ldc_w "S"
      // 15fb: fload 43
      // 15fd: f2i
      // 15fe: fload 44
      // 1600: ldc_w 20.0
      // 1603: fsub
      // 1604: f2i
      // 1605: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 1608: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.ah ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 160b: invokevirtual me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a (Ljava/lang/String;IILme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;)D
      // 160e: pop2
      // 160f: fload 45
      // 1611: fload 46
      // 1613: ldc_w 9.0
      // 1616: ldc_w 1.4
      // 1619: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 161c: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.a ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 161f: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b (FFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;)V
      // 1622: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 1625: ldc_w "E"
      // 1628: fload 45
      // 162a: f2i
      // 162b: fload 46
      // 162d: ldc_w 20.0
      // 1630: fsub
      // 1631: f2i
      // 1632: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 1635: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.a ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 1638: invokevirtual me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a (Ljava/lang/String;IILme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;)D
      // 163b: pop2
      // 163c: aload 0
      // 163d: invokespecial me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.g ()V
      // 1640: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl I
      // 1643: aload 3
      // 1644: ifnonnull 1654
      // 1647: iflt 17ab
      // 164a: goto 1651
      // 164d: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1650: athrow
      // 1651: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl I
      // 1654: aload 0
      // 1655: invokespecial me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a ()Ljava/util/List;
      // 1658: invokeinterface java/util/List.size ()I 1
      // 165d: if_icmpge 17ab
      // 1660: aload 0
      // 1661: invokespecial me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a ()Ljava/util/List;
      // 1664: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl I
      // 1667: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 166c: checkcast me/octo/client/IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl
      // 166f: astore 41
      // 1671: aload 41
      // 1673: invokevirtual me/octo/client/IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl.d ()Ljava/lang/String;
      // 1676: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 1679: invokevirtual java/lang/String.toUpperCase (Ljava/util/Locale;)Ljava/lang/String;
      // 167c: dup
      // 167d: sipush 16085
      // 1680: sipush -7838
      // 1683: pop2
      // 1684: ldc_w "toUpperCase(...)"
      // 1687: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 168a: astore 42
      // 168c: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl I
      // 168f: bipush 1
      // 1690: iadd
      // 1691: aload 0
      // 1692: invokespecial me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a ()Ljava/util/List;
      // 1695: invokeinterface java/util/List.size ()I 1
      // 169a: aload 41
      // 169c: invokevirtual me/octo/client/IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl.a ()I
      // 169f: aload 41
      // 16a1: invokevirtual me/octo/client/IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl.b ()I
      // 16a4: aload 41
      // 16a6: invokevirtual me/octo/client/IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl.c ()I
      // 16a9: istore 62
      // 16ab: istore 63
      // 16ad: istore 64
      // 16af: istore 65
      // 16b1: istore 66
      // 16b3: ldc_w "#"
      // 16b6: iload 66
      // 16b8: sipush 16089
      // 16bb: sipush -10882
      // 16be: pop2
      // 16bf: ldc_w " / "
      // 16c2: iload 65
      // 16c4: sipush 16078
      // 16c7: sipush -10342
      // 16ca: pop2
      // 16cb: ldc_w "   "
      // 16ce: iload 64
      // 16d0: sipush 16081
      // 16d3: sipush 16783
      // 16d6: pop2
      // 16d7: ldc_w ", "
      // 16da: iload 63
      // 16dc: sipush 16125
      // 16df: sipush -2232
      // 16e2: pop2
      // 16e3: ldc_w ", "
      // 16e6: iload 62
      // 16e8: invokedynamic makeConcatWithConstants (Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" ]
      // 16ed: astore 43
      // 16ef: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 16f2: aload 42
      // 16f4: bipush 0
      // 16f5: bipush 2
      // 16f6: aconst_null
      // 16f7: invokestatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a (Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;Ljava/lang/String;ZILjava/lang/Object;)D
      // 16fa: d2f
      // 16fb: fstore 44
      // 16fd: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 1700: aload 43
      // 1702: bipush 0
      // 1703: bipush 2
      // 1704: aconst_null
      // 1705: invokestatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a (Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;Ljava/lang/String;ZILjava/lang/Object;)D
      // 1708: d2f
      // 1709: fstore 45
      // 170b: fload 44
      // 170d: fload 45
      // 170f: invokestatic java/lang/Math.max (FF)F
      // 1712: ldc_w 36.0
      // 1715: fadd
      // 1716: fstore 46
      // 1718: ldc_w 54.0
      // 171b: fstore 47
      // 171d: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll F
      // 1720: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI F
      // 1723: fload 46
      // 1725: fsub
      // 1726: fconst_2
      // 1727: fdiv
      // 1728: fadd
      // 1729: fstore 48
      // 172b: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI F
      // 172e: ldc_w 14.0
      // 1731: fadd
      // 1732: fstore 49
      // 1734: fload 48
      // 1736: fload 49
      // 1738: fload 46
      // 173a: fload 47
      // 173c: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 173f: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.j ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 1742: ldc_w 0.92
      // 1745: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 1748: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 174b: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.ar ()F
      // 174e: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;F)V
      // 1751: fload 48
      // 1753: fload 49
      // 1755: fload 46
      // 1757: fload 47
      // 1759: fconst_1
      // 175a: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 175d: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.y ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 1760: ldc_w 0.6
      // 1763: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 1766: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 1769: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.ar ()F
      // 176c: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;F)V
      // 176f: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 1772: aload 42
      // 1774: fload 48
      // 1776: fload 46
      // 1778: fconst_2
      // 1779: fdiv
      // 177a: fadd
      // 177b: f2i
      // 177c: fload 49
      // 177e: ldc_w 18.0
      // 1781: fadd
      // 1782: f2i
      // 1783: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 1786: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.a ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 1789: invokevirtual me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b (Ljava/lang/String;IILme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;)D
      // 178c: pop2
      // 178d: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 1790: aload 43
      // 1792: fload 48
      // 1794: fload 46
      // 1796: fconst_2
      // 1797: fdiv
      // 1798: fadd
      // 1799: f2i
      // 179a: fload 49
      // 179c: ldc_w 36.0
      // 179f: fadd
      // 17a0: f2i
      // 17a1: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 17a4: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.c ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 17a7: invokevirtual me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a (Ljava/lang/String;IILme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;)D
      // 17aa: pop2
      // 17ab: return
   }

    private final void a(
       float param1,
       float param2,
       float param3,
       float param4,
       me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll param5,
       float param6,
       float param7
    ) {
       float dx = param3 - param1;
       float dy = param4 - param2;
       float dist = (float) java.lang.Math.sqrt((double) (dx * dx + dy * dy));
       if (dist < 0.5F) return;
       int steps = java.lang.Math.max(1, (int) (dist / param7));
       for (int i = 0; i <= steps; i++) {
          float t = (float) i / (float) steps;
          float x = param1 + dx * t;
          float y = param2 + dy * t;
          lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(x, y, param6, param5);
       }
    }

   private final void a(
      float var1,
      float var2,
      float var3,
      float var4,
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var5,
      float var6,
      float var7,
      float var8
   ) {
      int[] var10000 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      byte var10 = 8;
      float var11 = var1;
      int[] var9 = var10000;
      float var12 = var2;
      int var13 = 1;

      do {
         float var14 = (float)var13 / var10;
         float var15 = var1 + (var3 - var1) * var14;
         float var16 = var2 + (var4 - var2) * var14;
         float var17 = (var13 - 0.5F) / var10;
         float var18 = var6 + (var7 - var6) * var17;
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var11, var12, var15, var16, var8, var5.a(RangesKt.coerceIn(var18, 0.0F, 1.0F)));
         var11 = var15;
         var12 = var16;
         if (var13 == var10) {
            break;
         }

         var13++;
      } while (var9 == null);
   }

   private final void a(
      float param1,
      float param2,
      float param3,
      float param4,
      float param5,
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll param6,
      float param7,
      float param8
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n ()[I
      // 003: fload 3
      // 004: fload 1
      // 005: fsub
      // 006: fstore 10
      // 008: fload 4
      // 00a: fload 2
      // 00b: fsub
      // 00c: fstore 11
      // 00e: astore 9
      // 010: fload 10
      // 012: fload 10
      // 014: fmul
      // 015: fload 11
      // 017: fload 11
      // 019: fmul
      // 01a: fadd
      // 01b: f2d
      // 01c: invokestatic java/lang/Math.sqrt (D)D
      // 01f: d2f
      // 020: fstore 12
      // 022: fload 12
      // 024: ldc 0.5
      // 026: fcmpg
      // 027: aload 9
      // 029: ifnonnull 04c
      // 02c: ifge 037
      // 02f: goto 036
      // 032: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 035: athrow
      // 036: return
      // 037: fload 5
      // 039: invokestatic java/lang/Math.abs (F)F
      // 03c: ldc_w 0.005
      // 03f: aload 9
      // 041: ifnonnull 09f
      // 044: fcmpg
      // 045: goto 04c
      // 048: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04b: athrow
      // 04c: ifge 09a
      // 04f: fload 10
      // 051: fload 12
      // 053: fdiv
      // 054: fstore 13
      // 056: fload 11
      // 058: fload 12
      // 05a: fdiv
      // 05b: fstore 14
      // 05d: fload 3
      // 05e: fload 13
      // 060: fload 8
      // 062: fmul
      // 063: ldc_w 0.6
      // 066: fmul
      // 067: fsub
      // 068: fstore 15
      // 06a: fload 4
      // 06c: fload 14
      // 06e: fload 8
      // 070: fmul
      // 071: ldc_w 0.6
      // 074: fmul
      // 075: fsub
      // 076: fstore 16
      // 078: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
      // 07b: fload 1
      // 07c: fload 2
      // 07d: fload 15
      // 07f: fload 16
      // 081: fload 7
      // 083: aload 6
      // 085: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;)V
      // 088: aload 0
      // 089: fload 3
      // 08a: fload 4
      // 08c: fload 13
      // 08e: fload 14
      // 090: aload 6
      // 092: fload 7
      // 094: fload 8
      // 096: invokespecial me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.b (FFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;FF)V
      // 099: return
      // 09a: fload 1
      // 09b: fload 3
      // 09c: fadd
      // 09d: ldc 0.5
      // 09f: fmul
      // 0a0: fstore 13
      // 0a2: fload 2
      // 0a3: fload 4
      // 0a5: fadd
      // 0a6: ldc 0.5
      // 0a8: fmul
      // 0a9: fstore 14
      // 0ab: fload 11
      // 0ad: fneg
      // 0ae: fload 12
      // 0b0: fdiv
      // 0b1: fstore 15
      // 0b3: fload 10
      // 0b5: fload 12
      // 0b7: fdiv
      // 0b8: fstore 16
      // 0ba: fload 13
      // 0bc: fload 15
      // 0be: fload 5
      // 0c0: fmul
      // 0c1: fload 12
      // 0c3: fmul
      // 0c4: fadd
      // 0c5: fstore 17
      // 0c7: fload 14
      // 0c9: fload 16
      // 0cb: fload 5
      // 0cd: fmul
      // 0ce: fload 12
      // 0d0: fmul
      // 0d1: fadd
      // 0d2: fstore 18
      // 0d4: bipush 20
      // 0d6: istore 19
      // 0d8: fload 1
      // 0d9: fstore 20
      // 0db: fload 2
      // 0dc: fstore 21
      // 0de: iload 19
      // 0e0: i2f
      // 0e1: ldc_w 0.92
      // 0e4: fmul
      // 0e5: f2i
      // 0e6: istore 22
      // 0e8: bipush 1
      // 0e9: istore 23
      // 0eb: iload 23
      // 0ed: aload 9
      // 0ef: ifnonnull 107
      // 0f2: iload 22
      // 0f4: if_icmpgt 17d
      // 0f7: goto 0fe
      // 0fa: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fd: athrow
      // 0fe: iload 23
      // 100: goto 107
      // 103: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 106: athrow
      // 107: i2f
      // 108: iload 19
      // 10a: i2f
      // 10b: fdiv
      // 10c: fstore 24
      // 10e: fconst_1
      // 10f: fload 24
      // 111: fsub
      // 112: fstore 25
      // 114: fload 25
      // 116: fload 25
      // 118: fmul
      // 119: fload 1
      // 11a: fmul
      // 11b: fconst_2
      // 11c: fload 25
      // 11e: fmul
      // 11f: fload 24
      // 121: fmul
      // 122: fload 17
      // 124: fmul
      // 125: fadd
      // 126: fload 24
      // 128: fload 24
      // 12a: fmul
      // 12b: fload 3
      // 12c: fmul
      // 12d: fadd
      // 12e: fstore 26
      // 130: fload 25
      // 132: fload 25
      // 134: fmul
      // 135: fload 2
      // 136: fmul
      // 137: fconst_2
      // 138: fload 25
      // 13a: fmul
      // 13b: fload 24
      // 13d: fmul
      // 13e: fload 18
      // 140: fmul
      // 141: fadd
      // 142: fload 24
      // 144: fload 24
      // 146: fmul
      // 147: fload 4
      // 149: fmul
      // 14a: fadd
      // 14b: fstore 27
      // 14d: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
      // 150: fload 20
      // 152: fload 21
      // 154: fload 26
      // 156: fload 27
      // 158: fload 7
      // 15a: aload 6
      // 15c: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;)V
      // 15f: fload 26
      // 161: fstore 20
      // 163: fload 27
      // 165: fstore 21
      // 167: iload 23
      // 169: iload 22
      // 16b: if_icmpeq 17d
      // 16e: iinc 23 1
      // 171: aload 9
      // 173: ifnull 0fe
      // 176: goto 17d
      // 179: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17c: athrow
      // 17d: fload 3
      // 17e: fload 17
      // 180: fsub
      // 181: fstore 23
      // 183: fload 4
      // 185: fload 18
      // 187: fsub
      // 188: fstore 24
      // 18a: fload 23
      // 18c: fload 23
      // 18e: fmul
      // 18f: fload 24
      // 191: fload 24
      // 193: fmul
      // 194: fadd
      // 195: f2d
      // 196: invokestatic java/lang/Math.sqrt (D)D
      // 199: d2f
      // 19a: ldc_w 0.001
      // 19d: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 1a0: fstore 25
      // 1a2: fload 23
      // 1a4: fload 25
      // 1a6: fdiv
      // 1a7: fstore 26
      // 1a9: fload 24
      // 1ab: fload 25
      // 1ad: fdiv
      // 1ae: fstore 27
      // 1b0: fload 3
      // 1b1: fload 26
      // 1b3: fload 8
      // 1b5: fmul
      // 1b6: ldc_w 0.6
      // 1b9: fmul
      // 1ba: fsub
      // 1bb: fstore 28
      // 1bd: fload 4
      // 1bf: fload 27
      // 1c1: fload 8
      // 1c3: fmul
      // 1c4: ldc_w 0.6
      // 1c7: fmul
      // 1c8: fsub
      // 1c9: fstore 29
      // 1cb: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
      // 1ce: fload 20
      // 1d0: fload 21
      // 1d2: fload 28
      // 1d4: fload 29
      // 1d6: fload 7
      // 1d8: aload 6
      // 1da: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;)V
      // 1dd: aload 0
      // 1de: fload 3
      // 1df: fload 4
      // 1e1: fload 26
      // 1e3: fload 27
      // 1e5: aload 6
      // 1e7: fload 7
      // 1e9: fload 8
      // 1eb: invokespecial me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.b (FFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;FF)V
      // 1ee: return
   }

   private final void b(
      float var1,
      float var2,
      float var3,
      float var4,
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var5,
      float var6,
      float var7
   ) {
      float var8 = 0.866F;
      float var9 = 0.5F;
      float var10 = -var3 * var8 + var4 * var9;
      float var11 = -var3 * var9 - var4 * var8;
      float var12 = -var3 * var8 - var4 * var9;
      float var13 = var3 * var9 - var4 * var8;
      float var14 = var1 + var10 * var7;
      float var15 = var2 + var11 * var7;
      float var16 = var1 + var12 * var7;
      float var17 = var2 + var13 * var7;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var1, var2, var14, var15, var6, var5);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var1, var2, var16, var17, var6, var5);
   }

   private final void g() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll F
      // 003: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI F
      // 006: fadd
      // 007: ldc_w 48.0
      // 00a: fsub
      // 00b: fstore 2
      // 00c: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI F
      // 00f: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI F
      // 012: fadd
      // 013: ldc_w 48.0
      // 016: fsub
      // 017: fstore 3
      // 018: ldc_w 26.0
      // 01b: fstore 4
      // 01d: fload 2
      // 01e: fload 3
      // 01f: fload 4
      // 021: fconst_1
      // 022: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 025: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.c ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 028: ldc_w 0.45
      // 02b: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 02e: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b (FFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;)V
      // 031: invokestatic me/octo/client/llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n ()[I
      // 034: fload 2
      // 035: fload 3
      // 036: ldc_w 1.8
      // 039: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 03c: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.c ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 03f: ldc_w 0.6
      // 042: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 045: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;)V
      // 048: ldc_w 6.2831855
      // 04b: fstore 5
      // 04d: ldc_w 1.5707964
      // 050: fstore 6
      // 052: astore 1
      // 053: bipush 0
      // 054: istore 7
      // 056: iload 7
      // 058: bipush 8
      // 05a: if_icmpge 12e
      // 05d: iload 7
      // 05f: i2f
      // 060: ldc_w 8.0
      // 063: fdiv
      // 064: fload 5
      // 066: fmul
      // 067: fload 6
      // 069: fsub
      // 06a: fstore 8
      // 06c: aload 1
      // 06d: ifnonnull 149
      // 070: iload 7
      // 072: bipush 2
      // 073: irem
      // 074: aload 1
      // 075: ifnonnull 08a
      // 078: goto 07f
      // 07b: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07e: athrow
      // 07f: ifne 08d
      // 082: goto 089
      // 085: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 088: athrow
      // 089: bipush 1
      // 08a: goto 08e
      // 08d: bipush 0
      // 08e: istore 9
      // 090: iload 9
      // 092: ifeq 0a2
      // 095: fload 4
      // 097: ldc_w 5.0
      // 09a: fsub
      // 09b: goto 0a8
      // 09e: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a1: athrow
      // 0a2: fload 4
      // 0a4: ldc_w 2.5
      // 0a7: fsub
      // 0a8: fstore 10
      // 0aa: fload 2
      // 0ab: fload 8
      // 0ad: f2d
      // 0ae: invokestatic java/lang/Math.cos (D)D
      // 0b1: d2f
      // 0b2: fload 10
      // 0b4: fmul
      // 0b5: fadd
      // 0b6: fstore 11
      // 0b8: fload 3
      // 0b9: fload 8
      // 0bb: f2d
      // 0bc: invokestatic java/lang/Math.sin (D)D
      // 0bf: d2f
      // 0c0: fload 10
      // 0c2: fmul
      // 0c3: fadd
      // 0c4: fstore 12
      // 0c6: fload 2
      // 0c7: fload 8
      // 0c9: f2d
      // 0ca: invokestatic java/lang/Math.cos (D)D
      // 0cd: d2f
      // 0ce: fload 4
      // 0d0: fmul
      // 0d1: fadd
      // 0d2: fstore 13
      // 0d4: fload 3
      // 0d5: fload 8
      // 0d7: f2d
      // 0d8: invokestatic java/lang/Math.sin (D)D
      // 0db: d2f
      // 0dc: fload 4
      // 0de: fmul
      // 0df: fadd
      // 0e0: fstore 14
      // 0e2: iload 9
      // 0e4: ifeq 0f9
      // 0e7: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 0ea: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.c ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 0ed: ldc 0.5
      // 0ef: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 0f2: goto 105
      // 0f5: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f8: athrow
      // 0f9: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 0fc: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.c ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 0ff: ldc_w 0.25
      // 102: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 105: astore 15
      // 107: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
      // 10a: fload 11
      // 10c: fload 12
      // 10e: fload 13
      // 110: fload 14
      // 112: iload 9
      // 114: ifeq 11f
      // 117: fconst_1
      // 118: goto 122
      // 11b: invokestatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11e: athrow
      // 11f: ldc_w 0.7
      // 122: aload 15
      // 124: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;)V
      // 127: iinc 7 1
      // 12a: aload 1
      // 12b: ifnull 056
      // 12e: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 131: ldc_w "N"
      // 134: fload 2
      // 135: f2i
      // 136: fload 3
      // 137: fload 4
      // 139: fsub
      // 13a: ldc_w 10.0
      // 13d: fsub
      // 13e: f2i
      // 13f: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 142: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.c ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 145: invokevirtual me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a (Ljava/lang/String;IILme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;)D
      // 148: pop2
      // 149: getstatic me/octo/client/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI F
      // 14c: fload 6
      // 14e: fsub
      // 14f: fstore 7
      // 151: fload 2
      // 152: fload 7
      // 154: f2d
      // 155: invokestatic java/lang/Math.cos (D)D
      // 158: d2f
      // 159: fload 4
      // 15b: ldc_w 5.0
      // 15e: fsub
      // 15f: fmul
      // 160: fadd
      // 161: fstore 8
      // 163: fload 3
      // 164: fload 7
      // 166: f2d
      // 167: invokestatic java/lang/Math.sin (D)D
      // 16a: d2f
      // 16b: fload 4
      // 16d: ldc_w 5.0
      // 170: fsub
      // 171: fmul
      // 172: fadd
      // 173: fstore 9
      // 175: fload 2
      // 176: fload 7
      // 178: f2d
      // 179: invokestatic java/lang/Math.cos (D)D
      // 17c: d2f
      // 17d: fload 4
      // 17f: ldc_w 11.0
      // 182: fsub
      // 183: fmul
      // 184: fsub
      // 185: fstore 10
      // 187: fload 3
      // 188: fload 7
      // 18a: f2d
      // 18b: invokestatic java/lang/Math.sin (D)D
      // 18e: d2f
      // 18f: fload 4
      // 191: ldc_w 11.0
      // 194: fsub
      // 195: fmul
      // 196: fsub
      // 197: fstore 11
      // 199: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
      // 19c: fload 10
      // 19e: fload 11
      // 1a0: fload 8
      // 1a2: fload 9
      // 1a4: ldc 1.6
      // 1a6: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 1a9: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.a ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 1ac: ldc_w 0.9
      // 1af: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 1b2: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;)V
      // 1b5: fload 8
      // 1b7: fload 9
      // 1b9: ldc_w 2.4
      // 1bc: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 1bf: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.a ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 1c2: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;)V
      // 1c5: return
   }

   private final String b(String var1) {
      CharSequence var10000 = StringsKt.replace(var1, '_', ' ', false);
      char[] var2 = new char[]{' '};
      return CollectionsKt.joinToString(
         StringsKt.split(var10000, var2, false, 0),
         " ",
         "",
         "",
         -1,
         "...",
         IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl::e
      );
   }

   private final boolean c(String param1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 5[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
   }

   private final void h() {
      if (this.a().isEmpty()) {
         this.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl = 0.0f;
         this.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI = 0.0f;
         this.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI = 0.0f;
         this.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII = 1.0f;
         this.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII = 0.0f;
         return;
      }
      float var2 = Float.POSITIVE_INFINITY;
      float var3 = Float.NEGATIVE_INFINITY;
      float var4 = Float.POSITIVE_INFINITY;
      float var5 = Float.NEGATIVE_INFINITY;
      float var6 = Float.POSITIVE_INFINITY;
      float var7 = Float.NEGATIVE_INFINITY;
      for (var var13 : this.a()) {
         float var14 = (float) var13.a();
         float var15 = (float) var13.b();
         float var16 = (float) var13.c();
         var2 = java.lang.Math.min(var2, var14);
         var3 = java.lang.Math.max(var3, var14);
         var4 = java.lang.Math.min(var4, var15);
         var5 = java.lang.Math.max(var5, var15);
         var6 = java.lang.Math.min(var6, var16);
         var7 = java.lang.Math.max(var7, var16);
      }
      this.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl = (var2 + var3) * 0.5f;
      this.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI = (var4 + var5) * 0.5f;
      this.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI = (var6 + var7) * 0.5f;
      float var8 = (var3 - var2) * 0.5f;
      float var9 = (var5 - var4) * 0.5f;
      float var10 = (var7 - var6) * 0.5f;
      this.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII = kotlin.ranges.RangesKt.coerceAtLeast(java.lang.Math.max(java.lang.Math.max(var8, var9), var10), 1.0f);
      this.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII = var4 - this.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
   }

   private static final void a(String param0, Map param1) {
      int[] var2 = me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();

      if (!kotlin.jvm.internal.Intrinsics.areEqual(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII != null ? lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a() : null, param0)) {
         return;
      }

      if (!param1.isEmpty()) {
         int var4 = 0;

         for (Object var6 : param1.values()) {
            java.util.List var7 = (java.util.List)var6;
            var4 += var7.size();
         }

         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.e("[Routes/Preview] rendering " + var4 + " waypoints for " + param0);
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(param1);
         IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = false;
      } else {
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("[Routes/Preview] no waypoints for " + param0 + " \u2014 showing error state");
         IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = true;
      }

      lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = false;
   }

   public final boolean d() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII != null;
   }

   public final boolean c() {
      if (lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII == null) {
         return false;
      }
      return !IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   public final float e() {
      if (lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII == null) {
         return 0.0F;
      }
      if (IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
         float f2 = (float)(System.currentTimeMillis() - IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) / 380.0F;
         float f3 = RangesKt.coerceIn(f2, 0.0F, 1.0F);
         return 1.0F - this.a(f3);
      }
      float f2 = (float)(System.currentTimeMillis() - IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) / 380.0F;
      float f3 = RangesKt.coerceIn(f2, 0.0F, 1.0F);
      return this.a(f3);
   }

   private final float f() {
      float f2 = this.e();
      if (IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
         float f3 = RangesKt.coerceIn((float)(System.currentTimeMillis() - IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) / 380.0F, 0.0F, 1.0F);
         if (f3 >= 1.0F) {
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = null;
            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = MapsKt.emptyMap();
            lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = "";
            IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = false;
            IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = false;
         }
      }
      return f2;
   }

   private final float a(float var1) {
      if (var1 < 0.5F) {
         return 4.0F * var1 * var1 * var1;
      }
      float f1 = -2.0F * var1 + 2.0F;
      return 1.0F - f1 * f1 * f1 / 2.0F;
   }

   public final void a(int var1) {
      float f2 = var1 > 0 ? 1.12F : 0.89285713F;
      llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = RangesKt.coerceIn(llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI * f2, 0.25F, 5.0F);
   }

   public final boolean b(int var1, int var2) {
      return (float)var1 >= IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll
         && (float)var1 <= IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll + lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI
         && (float)var2 >= IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI
         && (float)var2 <= IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI + lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
   }

   public final void c(int var1, int var2) {
      if (!IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll) {
         return;
      }
      int i1 = var1 - llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
      int i2 = var2 - lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
      llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = var1;
      lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = var2;
      float f3 = 0.011F;
      IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll += (float)i1 * f3;
      IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl += (float)i2 * f3;
      IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = RangesKt.coerceIn(IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl, -1.5F, 1.5F);
      IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = (float)i1 * f3 * 0.5F;
      lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = (float)i2 * f3 * 0.5F;
   }

   public final void d(int var1, int var2) {
      IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = true;
      llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = var1;
      lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = var2;
      IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = 0.0F;
      lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = 0.0F;
   }

   public final void i() {
      IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = false;
   }

   private final void j() {
      float f1 = 0.18F;
      llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI += (IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll - llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI) * f1;
      IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl += (IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl - IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl) * f1;
      IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl += (llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI - IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl) * f1;
      if (!IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll) {
         IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll += IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
         IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl += lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
         IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll *= 0.92F;
         lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll *= 0.92F;
         if (Math.abs(IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll) < 5.0E-4F) {
            IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = 0.0F;
         }
         if (Math.abs(lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll) < 5.0E-4F) {
            lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = 0.0F;
         }
      }
      IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = RangesKt.coerceIn(IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl, -1.5F, 1.5F);
      IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = RangesKt.coerceIn(IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl, -1.5F, 1.5F);
   }

   public static final void f(String var0) {
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var0;
   }

   public static final void b(float var0) {
      llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var0;
   }

   public static final void c(float var0) {
      IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = var0;
   }

   public static final void d(float var0) {
      IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = var0;
   }

   public static final void e(float var0) {
      IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = var0;
   }

   public static final void f(float var0) {
      IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var0;
   }

   public static final void g(float var0) {
      llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = var0;
   }

   public static final void a(IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl var0) {
      var0.h();
   }

   static void a(IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl var0, float var1, float var2, float var3, float var4, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var5, float var6, float var7, int var8, Object var9) {
      if ((var8 & 32) != 0) {
         var6 = 1.1F;
      }
      if ((var8 & 64) != 0) {
         var7 = 5.0F;
      }
      var0.a(var1, var2, var3, var4, var5, var6, var7);
   }

   static void a(IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl var0, float var1, float var2, float var3, float var4, float var5, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6, float var7, float var8, int var9, Object var10) {
      if ((var9 & 128) != 0) {
         var8 = 5.0F;
      }
      var0.a(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   private static final void d(String param0) {
      var var1 = me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      String var3;
      try {
        var3 = me.octo.client.IIllIIIllllllIIllIIIlIllIllIIlIIlIlllIlllIIIIllIIlIIIIllIlIllIIlllIllllIllIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(param0);
      } catch (Exception var4) {
        me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("[Routes/Preview] getRoutePayload threw:" + var4.getMessage());
        var3 = null;
      }
      String var2 = var3;
      if (var1 == null && !kotlin.jvm.internal.Intrinsics.areEqual(param0, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII != null ? lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a() : null)) {
        return;
      }
      var var5 = var2 != null ? IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var2) : kotlin.collections.MapsKt.emptyMap();
      net.minecraft.client.Minecraft.getInstance().execute(new java.lang.Runnable() {
        public void run() {
          IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a(param0, var5);
        }
      });
   }

   private static final Triple<Float, Float, Float> a(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = var5 * var0 - var7 * var1;
      float var9 = var5 * var1 + var7 * var0;
      float var10 = var6 * var2 - var9 * var3;
      float var11 = var6 * var3 + var9 * var2;
      return new Triple(var8 * var4, -var10 * var4, var11);
   }

   private static final Triple<Float, Float, Float> b(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      return a(
         var0,
         var1,
         var2,
         var3,
         var4,
         var5 - IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl,
         var6 - IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI,
         var7 - IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI
      );
   }

   private static final float a(float var0, float var1, float var2, float var3, float var4) {
      float var5 = (float)Math.sqrt((var3 - var0) * (var3 - var0) + (var4 - var1) * (var4 - var1));
      return RangesKt.coerceAtLeast(1.0F - var5 / var2 * 0.75F, 0.0F);
   }

   private static final float a(float var0, float var1, float var2, float var3) {
      float var4 = (var2 - var0) / var1;
      return var3 * (0.55F + 0.45F * var4);
   }

   private static final CharSequence e(String param0) {
      Intrinsics.checkNotNullParameter(param0, "word");
      if (param0.length() > 0) {
         StringBuilder var2 = new StringBuilder();
         char var3 = param0.charAt(0);
         var2.append(Character.isLowerCase(var3) ? kotlin.text.CharsKt.titlecase(var3) : String.valueOf(var3));
         var2.append(param0.substring(1));
         return var2.toString();
      }
      return param0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[36];
      int var3 = 0;
      String var2 = "\u009c\u001c\u0005I9içÅ\u0011Éº\u001c\t\u0017\u001cÖóùP\u0093îºç>\t\u008b\\\u0004=0\u009f\u0083\u0018\u008eØGÑqzî§0\u0085\u009e\u0095\u008d&\u008cðá#\u0018\u001a¬e¹\u008c\u000f@¦\u0084\u0093Âµ\u0006TP\u0093wf[]Ç\u000b\u0004\u0016$\u0085©\u0005î\u0013\u000f?¡\u0004\nhcL\u0004\u0015¿Áu\u0003ß\"623§ð>\u0087\u00870\u0018ëråkâùa\u000b\\V¥êWÁ,ú\u0001³%z\u00adÎEþ!LãÑ\u0019¢&\u0088{7Þ\u001fØ\u00ad.\u0000T¬\"ºCÁ¢¡\u0014ôjs<ö¢\u0080À-,Õº\u009e*o\u000e\u00ad5+Þw¢0.´)!y2\u0017\u007f\u0086\u0013ÒcX¸[\u0095\u0084>à¦È\u009d⃖\u0010ó\u008bp4Î\u001f\u0090My«û-ýX?WN⃢mÓkB\u001d<ÖlÉË\u001eç\u0018\u0015\u0010ó\"\u0018\u0011ãÇ9|Ú\u001eÔ\u0099\u0083y»M\u0004\f×§d\u000eXU½¥\u0082%\u008aøÒ]XÇ0s\u0004) \u0003\u009a\u0002;(\u0003\u009d\t~ÜÉ\u008d\u009b\u0012\u0018¸N\u001dmr]ì/L\u0016dÖ\u0018>\u000büÐjy¬Fo\u0085óD7?ß\u008b²20§}X¥Kw.¦\u008b®ßó`\u0089\"\u00adÀ²B%A4ÝT¥Vý\u0087å÷Ï\u0015àÃ)æe\u0098ì»nç\u0084\u009c¸Å\u001aü\u008f\u008f=\u009a]\u001e¡gùOT\u0013Çt\f\u009d,ù¡w#\u0084zcõÆÑÂî\u0097U\u009c]2\rÉ\u007f¤ìÂûA»\u0099ôùHÓÎ\u007f?óþìû´ÛqØGá¦6R\u0013Ú\u0002û\u001dk[d\u0015\u0088X\\\u0001/íFÖ2\u0097LJ\u0007<ò^G¯\u0089\u0096Ê\u008fò\u0013\u0004÷\u001d\\\u0091G\u000fM\u0017USÑ\u008dm\u0016IqÖ\u0081ý\u0012µæ{\u007f\u0004\u0015Ñ§R\u0081\u0097Ù\u008d«ÔÑW\u0016·₋;3DêÓ¸-ý\u0081>\u00985NH¢ák¾ªñ\u0010Þ~µ\u009d\u009c\u00adç\u0082KuþB¿De\u0004(;\u0097ñ8§G4\u0000kqõ\u000bàõ!\u008aTg¤íF&\u0005û¹ºa=\u0003>)\u0086'²áÐ\u009c\u0098ÇÅ\u008a`l®.¾#É§ã¥&\u0096ç¨yC\u0094p¨Z\u001aCç¥K\u008f\u0017¨º'\u009e\u000ez\u0017Ú/\u000f%\u008b,\u000e%ÚTý¸\u0087\u000e\u0082$\t^û\rØº¨\u0017I\u0002«-\u009c·&o\f\u0017(L \u0097,¨ÚkÕ$²\t»\"Pf\u0000hÍ®Ò/\u000b¿\u0015,þg\u001e*ìfí Å\u0016Á\u001c_uç\u00929¹¸ Ø»[\u0012\u0015\t\u0013Ó`\u009e-Âk!Ï\u0087\u0092\u0016\u0010\u0004\u001e3â\u0088\r\nµ!ç\u0000\u0091\u001b\u001fH\u008f\u00ad[\u0089\u0005\u0095R2\u001b\u0097\u0010\t\fGÔ\b\u007fDkuü!Å=òl<\u001fï\u001bq$|CÑ\u008aªH(\u001d\u00ad/êç8\u0010ê\u001fw\u0080Ì\u0092AÆ\u0088¡TLá\u0004d\u009fïq\u0004\u001f4Y\b\u0007ï\u00adUä\u0003à\u0094\u0004qÈ\u0016\u009c\u0010=³Ê7\u0012\u009e(^\\Ie°ì\u008bt\u0014\u0014;XI\u008dgÊLËbj\u0005iÞ\u0082¸j\u0095£+4\b.K¡\u001eÇO%\u0000\n\"=ÈàKÛ7\u0099v*";
      int var4 = "\u009c\u001c\u0005I9içÅ\u0011Éº\u001c\t\u0017\u001cÖóùP\u0093îºç>\t\u008b\\\u0004=0\u009f\u0083\u0018\u008eØGÑqzî§0\u0085\u009e\u0095\u008d&\u008cðá#\u0018\u001a¬e¹\u008c\u000f@¦\u0084\u0093Âµ\u0006TP\u0093wf[]Ç\u000b\u0004\u0016$\u0085©\u0005î\u0013\u000f?¡\u0004\nhcL\u0004\u0015¿Áu\u0003ß\"623§ð>\u0087\u00870\u0018ëråkâùa\u000b\\V¥êWÁ,ú\u0001³%z\u00adÎEþ!LãÑ\u0019¢&\u0088{7Þ\u001fØ\u00ad.\u0000T¬\"ºCÁ¢¡\u0014ôjs<ö¢\u0080À-,Õº\u009e*o\u000e\u00ad5+Þw¢0.´)!y2\u0017\u007f\u0086\u0013ÒcX¸[\u0095\u0084>à¦È\u009d⃖\u0010ó\u008bp4Î\u001f\u0090My«û-ýX?WN⃢mÓkB\u001d<ÖlÉË\u001eç\u0018\u0015\u0010ó\"\u0018\u0011ãÇ9|Ú\u001eÔ\u0099\u0083y»M\u0004\f×§d\u000eXU½¥\u0082%\u008aøÒ]XÇ0s\u0004) \u0003\u009a\u0002;(\u0003\u009d\t~ÜÉ\u008d\u009b\u0012\u0018¸N\u001dmr]ì/L\u0016dÖ\u0018>\u000büÐjy¬Fo\u0085óD7?ß\u008b²20§}X¥Kw.¦\u008b®ßó`\u0089\"\u00adÀ²B%A4ÝT¥Vý\u0087å÷Ï\u0015àÃ)æe\u0098ì»nç\u0084\u009c¸Å\u001aü\u008f\u008f=\u009a]\u001e¡gùOT\u0013Çt\f\u009d,ù¡w#\u0084zcõÆÑÂî\u0097U\u009c]2\rÉ\u007f¤ìÂûA»\u0099ôùHÓÎ\u007f?óþìû´ÛqØGá¦6R\u0013Ú\u0002û\u001dk[d\u0015\u0088X\\\u0001/íFÖ2\u0097LJ\u0007<ò^G¯\u0089\u0096Ê\u008fò\u0013\u0004÷\u001d\\\u0091G\u000fM\u0017USÑ\u008dm\u0016IqÖ\u0081ý\u0012µæ{\u007f\u0004\u0015Ñ§R\u0081\u0097Ù\u008d«ÔÑW\u0016·₋;3DêÓ¸-ý\u0081>\u00985NH¢ák¾ªñ\u0010Þ~µ\u009d\u009c\u00adç\u0082KuþB¿De\u0004(;\u0097ñ8§G4\u0000kqõ\u000bàõ!\u008aTg¤íF&\u0005û¹ºa=\u0003>)\u0086'²áÐ\u009c\u0098ÇÅ\u008a`l®.¾#É§ã¥&\u0096ç¨yC\u0094p¨Z\u001aCç¥K\u008f\u0017¨º'\u009e\u000ez\u0017Ú/\u000f%\u008b,\u000e%ÚTý¸\u0087\u000e\u0082$\t^û\rØº¨\u0017I\u0002«-\u009c·&o\f\u0017(L \u0097,¨ÚkÕ$²\t»\"Pf\u0000hÍ®Ò/\u000b¿\u0015,þg\u001e*ìfí Å\u0016Á\u001c_uç\u00929¹¸ Ø»[\u0012\u0015\t\u0013Ó`\u009e-Âk!Ï\u0087\u0092\u0016\u0010\u0004\u001e3â\u0088\r\nµ!ç\u0000\u0091\u001b\u001fH\u008f\u00ad[\u0089\u0005\u0095R2\u001b\u0097\u0010\t\fGÔ\b\u007fDkuü!Å=òl<\u001fï\u001bq$|CÑ\u008aªH(\u001d\u00ad/êç8\u0010ê\u001fw\u0080Ì\u0092AÆ\u0088¡TLá\u0004d\u009fïq\u0004\u001f4Y\b\u0007ï\u00adUä\u0003à\u0094\u0004qÈ\u0016\u009c\u0010=³Ê7\u0012\u009e(^\\Ie°ì\u008bt\u0014\u0014;XI\u008dgÊLËbj\u0005iÞ\u0082¸j\u0095£+4\b.K¡\u001eÇO%\u0000\n\"=ÈàKÛ7\u0099v*"
         .length();
      char var1 = 27;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 29;
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
                     case 0 -> 80;
                     case 1 -> 25;
                     case 2 -> 125;
                     case 3 -> 58;
                     case 4 -> 126;
                     case 5 -> 7;
                     default -> 56;
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
                     b = new String[36];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl();
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = MapsKt.emptyMap();
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = "";
                     llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 2.62F;
                     IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 0.49F;
                     IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 1.55F;
                     IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = 2.62F;
                     IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = 0.49F;
                     llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = 1.55F;
                     llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = -1;
                     IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = "";
                     IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII = 1.0F;
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

                  var2 = "\u001e ý\u001f#»\u0087²L\u0086GË°r\u009cm\u0002+Ý";
                  var4 = "\u001e ý\u001f#»\u0087²L\u0086GË°r\u009cm\u0002+Ý".length();
                  var1 = 16;
                  var8 = -1;
            }

            var10000 = 85;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String e(int var0, int var1) {
      int var2 = (var0 ^ 16094) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 34;
            case 1 -> 26;
            case 2 -> 203;
            case 3 -> 50;
            case 4 -> 181;
            case 5 -> 1;
            case 6 -> 74;
            case 7 -> 80;
            case 8 -> 232;
            case 9 -> 230;
            case 10 -> 153;
            case 11 -> 58;
            case 12 -> 168;
            case 13 -> 166;
            case 14 -> 175;
            case 15 -> 82;
            case 16 -> 54;
            case 17 -> 118;
            case 18 -> 246;
            case 19 -> 36;
            case 20 -> 231;
            case 21 -> 171;
            case 22 -> 211;
            case 23 -> 157;
            case 24 -> 17;
            case 25 -> 191;
            case 26 -> 44;
            case 27 -> 116;
            case 28 -> 19;
            case 29 -> 253;
            case 30 -> 78;
            case 31 -> 234;
            case 32 -> 173;
            case 33 -> 136;
            case 34 -> 218;
            case 35 -> 85;
            case 36 -> 169;
            case 37 -> 189;
            case 38 -> 244;
            case 39 -> 159;
            case 40 -> 251;
            case 41 -> 23;
            case 42 -> 86;
            case 43 -> 65;
            case 44 -> 47;
            case 45 -> 235;
            case 46 -> 70;
            case 47 -> 103;
            case 48 -> 5;
            case 49 -> 56;
            case 50 -> 165;
            case 51 -> 73;
            case 52 -> 219;
            case 53 -> 105;
            case 54 -> 42;
            case 55 -> 35;
            case 56 -> 146;
            case 57 -> 72;
            case 58 -> 45;
            case 59 -> 106;
            case 60 -> 178;
            case 61 -> 46;
            case 62 -> 115;
            case 63 -> 213;
            case 64 -> 228;
            case 65 -> 196;
            case 66 -> 0;
            case 67 -> 52;
            case 68 -> 185;
            case 69 -> 30;
            case 70 -> 208;
            case 71 -> 79;
            case 72 -> 120;
            case 73 -> 15;
            case 74 -> 239;
            case 75 -> 38;
            case 76 -> 167;
            case 77 -> 127;
            case 78 -> 43;
            case 79 -> 227;
            case 80 -> 83;
            case 81 -> 201;
            case 82 -> 172;
            case 83 -> 107;
            case 84 -> 8;
            case 85 -> 97;
            case 86 -> 2;
            case 87 -> 59;
            case 88 -> 192;
            case 89 -> 98;
            case 90 -> 109;
            case 91 -> 139;
            case 92 -> 158;
            case 93 -> 122;
            case 94 -> 13;
            case 95 -> 121;
            case 96 -> 237;
            case 97 -> 66;
            case 98 -> 252;
            case 99 -> 84;
            case 100 -> 254;
            case 101 -> 89;
            case 102 -> 68;
            case 103 -> 104;
            case 104 -> 148;
            case 105 -> 142;
            case 106 -> 216;
            case 107 -> 9;
            case 108 -> 249;
            case 109 -> 28;
            case 110 -> 156;
            case 111 -> 182;
            case 112 -> 37;
            case 113 -> 63;
            case 114 -> 223;
            case 115 -> 48;
            case 116 -> 224;
            case 117 -> 113;
            case 118 -> 53;
            case 119 -> 197;
            case 120 -> 161;
            case 121 -> 49;
            case 122 -> 108;
            case 123 -> 184;
            case 124 -> 194;
            case 125 -> 110;
            case 126 -> 145;
            case 127 -> 111;
            case 128 -> 102;
            case 129 -> 134;
            case 130 -> 7;
            case 131 -> 12;
            case 132 -> 226;
            case 133 -> 119;
            case 134 -> 209;
            case 135 -> 186;
            case 136 -> 154;
            case 137 -> 55;
            case 138 -> 217;
            case 139 -> 33;
            case 140 -> 155;
            case 141 -> 193;
            case 142 -> 149;
            case 143 -> 245;
            case 144 -> 3;
            case 145 -> 101;
            case 146 -> 204;
            case 147 -> 202;
            case 148 -> 215;
            case 149 -> 16;
            case 150 -> 147;
            case 151 -> 88;
            case 152 -> 200;
            case 153 -> 133;
            case 154 -> 29;
            case 155 -> 96;
            case 156 -> 177;
            case 157 -> 132;
            case 158 -> 247;
            case 159 -> 39;
            case 160 -> 233;
            case 161 -> 250;
            case 162 -> 100;
            case 163 -> 242;
            case 164 -> 71;
            case 165 -> 20;
            case 166 -> 236;
            case 167 -> 129;
            case 168 -> 205;
            case 169 -> 90;
            case 170 -> 24;
            case 171 -> 144;
            case 172 -> 151;
            case 173 -> 125;
            case 174 -> 212;
            case 175 -> 14;
            case 176 -> 22;
            case 177 -> 21;
            case 178 -> 4;
            case 179 -> 140;
            case 180 -> 162;
            case 181 -> 229;
            case 182 -> 131;
            case 183 -> 199;
            case 184 -> 6;
            case 185 -> 67;
            case 186 -> 195;
            case 187 -> 57;
            case 188 -> 41;
            case 189 -> 11;
            case 190 -> 152;
            case 191 -> 164;
            case 192 -> 61;
            case 193 -> 143;
            case 194 -> 112;
            case 195 -> 187;
            case 196 -> 240;
            case 197 -> 117;
            case 198 -> 248;
            case 199 -> 25;
            case 200 -> 123;
            case 201 -> 94;
            case 202 -> 241;
            case 203 -> 179;
            case 204 -> 87;
            case 205 -> 255;
            case 206 -> 92;
            case 207 -> 77;
            case 208 -> 170;
            case 209 -> 135;
            case 210 -> 221;
            case 211 -> 124;
            case 212 -> 64;
            case 213 -> 150;
            case 214 -> 160;
            case 215 -> 31;
            case 216 -> 27;
            case 217 -> 93;
            case 218 -> 91;
            case 219 -> 137;
            case 220 -> 225;
            case 221 -> 243;
            case 222 -> 198;
            case 223 -> 238;
            case 224 -> 176;
            case 225 -> 51;
            case 226 -> 62;
            case 227 -> 183;
            case 228 -> 76;
            case 229 -> 141;
            case 230 -> 214;
            case 231 -> 32;
            case 232 -> 60;
            case 233 -> 10;
            case 234 -> 81;
            case 235 -> 114;
            case 236 -> 126;
            case 237 -> 69;
            case 238 -> 138;
            case 239 -> 180;
            case 240 -> 75;
            case 241 -> 130;
            case 242 -> 190;
            case 243 -> 206;
            case 244 -> 163;
            case 245 -> 220;
            case 246 -> 210;
            case 247 -> 99;
            case 248 -> 207;
            case 249 -> 95;
            case 250 -> 174;
            case 251 -> 40;
            case 252 -> 188;
            case 253 -> 18;
            case 254 -> 128;
            default -> 222;
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
