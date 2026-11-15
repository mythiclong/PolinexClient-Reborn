package me.octo.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import me.octo.client.utils.IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII;
import me.octo.client.utils.IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;

public final class IIIIlllIlIlIIllllIlIlIIlIlIllIlIllllIIIIIlIIIIIIIlIIIlIIIlIllIlIIlIIllllIlIlllllIllIl
   extends llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII {
   @NotNull
   public static IIIIlllIlIlIIllllIlIlIIlIlIllIlIllllIIIIIlIIIIIIIlIIIlIIIlIllIlIIlIIllllIlIlllllIllIl llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   @NotNull
   private static HashMap<String, IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII> lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   private static String[] c;
   private static String[] d;

   private IIIIlllIlIlIIllllIlIlIIlIlIllIlIllllIIIIIlIIIIIIIlIIIlIIIlIllIlIIlIIllllIlIlllllIllIl() {
      short var10001 = -28115;
      short var10002 = 1903;
      var10002 = -28116;
      short var10003 = -12773;
      var10003 = -28113;
      short var10004 = 8466;
      var10004 = -28123;
      short var10005 = 11266;
      IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI[] var1 = new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI[]{
         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
      };
      List var6 = CollectionsKt.arrayListOf(var1);
      short var10006 = -28125;
      short var10007 = 10617;
      llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var7 = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      String[] var2 = new String[7];
      short var10011 = -28117;
      short var10012 = 15439;
      var2[0] = "Lava Springs";
      var10011 = -28118;
      var10012 = -19050;
      var2[1] = "Upper Mines";
      var10011 = -28124;
      var10012 = 30563;
      var2[2] = "Royal Mines";
      var10011 = -28127;
      var10012 = -12912;
      var2[3] = "Cliffside Veins";
      var10011 = -28128;
      var10012 = -13202;
      var2[4] = "Rampart's Quarry";
      var10011 = -28120;
      var10012 = 12056;
      var2[5] = "Goblin Slayer";
      var10011 = -28119;
      var10012 = -12558;
      var2[6] = "Glacite Walker Slayer";
      super(
         "Dwarven Commission Editor",
         "DwarvenCommissionMacro-Routes",
         "DwarvenCommissionMacro",
         "dwarven_commission",
         var6,
         "dwarven",
         var7,
         null,
         CollectionsKt.listOf(var2),
         false,
         false,
         false,
         false,
         7808,
         null
      );
   }

   @Override
   public boolean G() {
      return false;
   }

   @Override
   public boolean I() {
      try {
         if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g()
            == me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
            )
          {
            return true;
         }
      } catch (NoSuchElementException var1) {
         throw (RuntimeException)a(var1);
      }

      return false;
   }

   @Nullable
   @Override
   public String D() {
        String string;
        block4: {
            String string2;
            block5: {
                string2 = IIlIlIllllIlllIIlIIlIlIlllIIIIlllllllIIIIIIIIllIIllIlllllIIIllIlIlIIIlIlIlllIllIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.g().V();
                lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.e();
                try {
                    try {
                        string = string2;
                        if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray != null) break block4;
                        if (!Intrinsics.areEqual((Object)string, (Object)"Polinex-Routes")) break block5;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        throw IIIIlllIlIlIIllllIlIlIIlIlIllIlIllllIIIIIlIIIIIIIlIIIlIIIlIllIlIIlIIllllIlIlllllIllIl.a(noSuchElementException);
                    }
                    return null;
                }
                catch (NoSuchElementException noSuchElementException) {
                    throw IIIIlllIlIlIIllllIlIlIIlIlIllIlIllllIIIIIlIIIIIIIlIIIlIIIlIllIlIIlIIllllIlIlllllIllIl.a(noSuchElementException);
                }
            }
            string = string2;
        }
        return string;
   }

   @Nullable
   @Override
   public String E() {
      String var1 = IIlIlIllllIlllIIlIIlIlIlllIIIIlllllllIIIIIIIIllIIllIlllllIIIllIlIlIIIlIlIlllIllIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .f()
         .y();

      try {
         if (this.i().contains(var1)) {
            return var1;
         }
      } catch (NoSuchElementException var2) {
         throw (RuntimeException)a(var2);
      }

      return null;
   }

   @NotNull
   @Override
   public ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> B() {
      String var2 = this.E();
      if (var2 == null) {
         return new ArrayList();
      }
      var var3 = lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.get(var2);
      if (var3 == null) {
         return new ArrayList();
      }
      var3.j();
      ArrayList var5 = new ArrayList();
      for (BlockPos var9 : var3.i()) {
         var5.add(new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(var9, IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl));
      }
      return var5;
   }

   @Nullable
   @Override
   public ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> b(int param1) {
      String var2 = CollectionsKt.getOrNull(this.i(), param1);
      if (var2 == null) {
         return null;
      }

      me.octo.client.utils.IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII var3 = lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.get(var2);
      if (var3 == null) {
         return null;
      }

      var3.j();
      ArrayList<BlockPos> var4 = var3.i();
      ArrayList<me.octo.client.IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> var5 = new ArrayList<>();
      for (BlockPos var6 : var4) {
         var5.add(new me.octo.client.IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(var6, me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl));
      }

      return var5;
   }

   @NotNull
   @Override
   public IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl J() {
      return IIlIlIllllIlllIIlIIlIlIlllIIIIlllllllIIIIIIIIllIIllIlllllIIIllIlIlIIIlIlIlllIllIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .g();
   }

   @Nullable
   public final IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII o(@NotNull String param1) {
      Intrinsics.checkNotNullParameter(param1, "commissionName");
      java.util.Iterator var2 = CollectionsKt.withIndex((Iterable)this.i()).iterator();
      Integer var3 = null;
      while (var2.hasNext()) {
         kotlin.collections.IndexedValue var4 = (kotlin.collections.IndexedValue)var2.next();
         if (param1.contains((CharSequence)var4.getValue())) {
            var3 = var4.getIndex();
            break;
         }
      }
      if (var3 == null) {
         return null;
      }
      String var6 = IIlIlIllllIlllIIlIIlIlIlllIIIIlllllllIIIIIIIIllIIllIlllllIIIllIlIlIIIlIlIlllIllIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.g().V();
      IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII var7 = lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.get(this.i().get(var3));
      Intrinsics.checkNotNull((Object)var7);
      var7.j();
      if (Intrinsics.areEqual((Object)var6, (Object)"Polinex-Routes")) {
         return var7;
      }
      ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> var8 = this.a(var3);
      List<BlockPos> var9 = new ArrayList<BlockPos>();
      for (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var10 : var8) {
         var9.add(var10.a());
      }
      boolean var11 = var9.isEmpty();
      return new IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII(var7.a(), var7.b(), var11 ? var7.c() : var9, var11 ? var7.d() : CollectionsKt.<BlockPos>emptyList(), var7.e());
   }

   @NotNull
   public final IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll S() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.e();
      double var2 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w().y;
      java.util.Collection var3 = lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.values();
      Intrinsics.checkNotNullExpressionValue(var3, "<get-values>(...)");
      java.lang.Iterable var4 = var3;
      java.util.Collection var5 = new java.util.ArrayList();
      for (java.lang.Object var6 : var4) {
         me.octo.client.utils.IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII var7 = (me.octo.client.utils.IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII)var6;
         me.octo.client.utils.IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll var8 = var7.b();
         if (var8 != null) {
            var5.add(var8);
         }
      }
      java.util.Iterator var9 = var5.iterator();
      if (!var9.hasNext()) {
         throw new NoSuchElementException();
      }
      me.octo.client.utils.IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll var10 = (me.octo.client.utils.IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll)var9.next();
      if (!var9.hasNext()) {
         return var10;
      }
      double var11 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var10.b(), true) + Math.abs(var2 - var10.b().y) * 3.0;
      do {
         me.octo.client.utils.IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll var12 = (me.octo.client.utils.IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll)var9.next();
         double var13 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var12.b(), true) + Math.abs(var2 - var12.b().y) * 3.0;
         if (Double.compare(var11, var13) > 0) {
            var10 = var12;
            var11 = var13;
         }
      } while (var9.hasNext());
      return var10;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var42 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[16];
      int var3 = 0;
      String var2 = "f\u0093«Ã\u0016\u00138\u000e\u000f4m3\\ç\u0090\u001c\tG·r.J\u000f+ñÉãC\u0097\u0087\u001f¸ÅÒ¡\u009d¿\u0010\u0010ù\u009a¤4m¸¸\u0098÷\u001eèÊ5Ü\r·\u000e®\f\r0v\u00159ÒkSZÄÇ=\u000e\u0097\u008f*@\u0092\u001b¥\u0013øk(Ã\u0089Ý\u0012Ç¸\u009f¦\u0090¿èõ´\u008b®ÆNGjõÑÎ\u000btK\u0001ÐBEÈqúáÕ\fõ\u001bã\u0015¼\u008eï\u000e\u0083}\t'\u000bóÁ\u001fy·ô«G\u0096'X\u0015\u008e·ñ.B\u008cEß_P`tºÖ*Üã\u0099¼)\u009f\rS$I06»\u008e\u0013ðÔÜê\u008d\u0016£\u00997\u0082\u0085;Jyì\u0087(\u0001\u0084;p|Ê\u001aÃök*\u0011ÚÕk\u001fÑ]ÿë®\u0017'MãRëæQ";
      int var4 = "f\u0093«Ã\u0016\u00138\u000e\u000f4m3\\ç\u0090\u001c\tG·r.J\u000f+ñÉãC\u0097\u0087\u001f¸ÅÒ¡\u009d¿\u0010\u0010ù\u009a¤4m¸¸\u0098÷\u001eèÊ5Ü\r·\u000e®\f\r0v\u00159ÒkSZÄÇ=\u000e\u0097\u008f*@\u0092\u001b¥\u0013øk(Ã\u0089Ý\u0012Ç¸\u009f¦\u0090¿èõ´\u008b®ÆNGjõÑÎ\u000btK\u0001ÐBEÈqúáÕ\fõ\u001bã\u0015¼\u008eï\u000e\u0083}\t'\u000bóÁ\u001fy·ô«G\u0096'X\u0015\u008e·ñ.B\u008cEß_P`tºÖ*Üã\u0099¼)\u009f\rS$I06»\u008e\u0013ðÔÜê\u008d\u0016£\u00997\u0082\u0085;Jyì\u0087(\u0001\u0084;p|Ê\u001aÃök*\u0011ÚÕk\u001fÑ]ÿë®\u0017'MãRëæQ"
         .length();
      char var1 = 7;
      int var11 = -1;

      label52:
      while (true) {
         byte var10000 = 46;
         String var10001 = var2.substring(++var11, var11 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var51 = var10001.toCharArray();
               int var10004 = var51.length;
               int var6 = 0;
               byte var54 = var10000;
               var42 = var51;
               int var36 = var10004;
               byte var63;
               char[] var70;
               int var10006;
               if (var10004 <= 1) {
                  var70 = var51;
                  var63 = var10000;
                  var10006 = var6;
               } else {
                  var54 = var10000;
                  var36 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var70 = var51;
                  var63 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var70[var10006] = (char)(var70[var10006] ^ var63 ^ switch (var6 % 7) {
                     case 0 -> 17;
                     case 1 -> 39;
                     case 2 -> 39;
                     case 3 -> 85;
                     case 4 -> 87;
                     case 5 -> 115;
                     default -> 45;
                  });
                  var6++;
                  if (var54 == 0) {
                     var10006 = var54;
                     var70 = var42;
                     var63 = var54;
                  } else {
                     if (var36 <= var6) {
                        break;
                     }

                     var70 = var42;
                     var63 = var54;
                     var10006 = var6;
                  }
               }
            }

            String var56 = new String(var42).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var56;
                  if ((var11 += var1) >= var4) {
                     c = var5;
                     d = new String[16];
                     llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = new IIIIlllIlIlIIllllIlIlIIlIlIllIlIllllIIIIIlIIIIIIIlIIIlIIIlIllIlIIlIIllllIlIlllllIllIl();
                     lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = new HashMap<>();
                     Map var7 = lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
                     Object var8 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(0);
                     String var46 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(0);
                     IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll var57 = new IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll(
                        new BlockPos(58, 197, -10), new Vec3(58.5, 199.52, -8.5)
                     );
                     BlockPos[] var9 = new BlockPos[]{new BlockPos(52, 197, -25), new BlockPos(43, 197, -19), new BlockPos(60, 220, -30)};
                     List var67 = CollectionsKt.listOf(var9);
                     var9 = new BlockPos[]{new BlockPos(52, 214, -30), new BlockPos(52, 205, 16)};
                     IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII var21 = new IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII(
                        var46,
                        var57,
                        var67,
                        CollectionsKt.listOf(var9),
                        IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI::j
                     );
                     var7.put(var8, var21);
                     var7 = lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
                     var8 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(1);
                     String var47 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(1);
                     IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll var58 = new IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll(
                        new BlockPos(-132, 173, -52), new Vec3(-132.5, 175.52, -50.5)
                     );
                     var9 = new BlockPos[]{new BlockPos(-111, 166, -75), new BlockPos(-124, 170, -74), new BlockPos(-77, 187, -71)};
                     IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII var23 = new IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII(
                        var47,
                        var58,
                        CollectionsKt.listOf(var9),
                        CollectionsKt.emptyList(),
                        IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI::k
                     );
                     var7.put(var8, var23);
                     var7 = lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
                     var8 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(2);
                     String var48 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(2);
                     IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll var59 = new IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll(
                        new BlockPos(170, 149, 32), new Vec3(171.5, 151.52, 31.5)
                     );
                     var9 = new BlockPos[]{new BlockPos(140, 152, 30), new BlockPos(141, 152, 26), new BlockPos(167, 148, 87)};
                     var67 = CollectionsKt.listOf(var9);
                     var9 = new BlockPos[]{new BlockPos(114, 158, 23), new BlockPos(106, 163, 31)};
                     IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII var26 = new IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII(
                        var48,
                        var59,
                        var67,
                        CollectionsKt.listOf(var9),
                        IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI::l
                     );
                     var7.put(var8, var26);
                     var7 = lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
                     var8 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(3);
                     String var49 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(3);
                     IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll var60 = new IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll(
                        new BlockPos(43, 134, 21), new Vec3(42.5, 136.02, 22.5)
                     );
                     var9 = new BlockPos[]{new BlockPos(13, 127, 37), new BlockPos(-14, 126, 34), new BlockPos(8, 128, 39)};
                     IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII var28 = new IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII(
                        var49,
                        var60,
                        CollectionsKt.listOf(var9),
                        CollectionsKt.listOf(new BlockPos(-8, 135, 35)),
                        IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI::m
                     );
                     var7.put(var8, var28);
                     var7 = lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
                     var8 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(4);
                     String var50 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(4);
                     var67 = CollectionsKt.listOf(new BlockPos(-89, 146, -13));
                     var9 = new BlockPos[]{new BlockPos(-74, 169, -59), new BlockPos(-70, 178, -60)};
                     IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII var30 = new IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII(
                        var50,
                        null,
                        var67,
                        CollectionsKt.listOf(var9),
                        IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI::n
                     );
                     var7.put(var8, var30);
                     lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.put(
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(5),
                        new IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII(
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(5),
                           null,
                           CollectionsKt.listOf(new BlockPos(-104, 144, 139)),
                           CollectionsKt.emptyList(),
                           IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI::p
                        )
                     );
                     lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.put(
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(6),
                        new IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII(
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(6),
                           null,
                           CollectionsKt.listOf(new BlockPos(5, 127, 151)),
                           CollectionsKt.emptyList(),
                           IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI::o
                        )
                     );
                     break pxClinit;
                  }

                  var1 = var2.charAt(var11);
                  break;
               default:
                  var5[var3++] = var56;
                  if ((var11 += var1) < var4) {
                     var1 = var2.charAt(var11);
                     continue label52;
                  }

                  var2 = "Hõ\rH\u0085%\r\u009eo1¶Ö\n\u0002¥\u001aotP\u001d!ô\u0096\u001cG\u001d½Å³NRå÷å\u001cSqÜèÇº¤ÔFG:¼ô¨çï\u008e~\u0004\u0095";
                  var4 = "Hõ\rH\u0085%\r\u009eo1¶Ö\n\u0002¥\u001aotP\u001d!ô\u0096\u001cG\u001d½Å³NRå÷å\u001cSqÜèÇº¤ÔFG:¼ô¨çï\u008e~\u0004\u0095".length();
                  var1 = 25;
                  var11 = -1;
            }

            var10000 = 13;
            var10001 = var2.substring(++var11, var11 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static NoSuchElementException a(NoSuchElementException var0) {
      return var0;
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ -28125) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 43;
            case 1 -> 175;
            case 2 -> 96;
            case 3 -> 2;
            case 4 -> 205;
            case 5 -> 69;
            case 6 -> 115;
            case 7 -> 161;
            case 8 -> 139;
            case 9 -> 41;
            case 10 -> 134;
            case 11 -> 193;
            case 12 -> 255;
            case 13 -> 78;
            case 14 -> 7;
            case 15 -> 195;
            case 16 -> 8;
            case 17 -> 166;
            case 18 -> 157;
            case 19 -> 120;
            case 20 -> 57;
            case 21 -> 186;
            case 22 -> 22;
            case 23 -> 200;
            case 24 -> 235;
            case 25 -> 138;
            case 26 -> 250;
            case 27 -> 225;
            case 28 -> 65;
            case 29 -> 97;
            case 30 -> 204;
            case 31 -> 6;
            case 32 -> 160;
            case 33 -> 248;
            case 34 -> 129;
            case 35 -> 72;
            case 36 -> 148;
            case 37 -> 177;
            case 38 -> 71;
            case 39 -> 163;
            case 40 -> 131;
            case 41 -> 207;
            case 42 -> 241;
            case 43 -> 181;
            case 44 -> 150;
            case 45 -> 108;
            case 46 -> 93;
            case 47 -> 229;
            case 48 -> 75;
            case 49 -> 82;
            case 50 -> 170;
            case 51 -> 146;
            case 52 -> 1;
            case 53 -> 76;
            case 54 -> 230;
            case 55 -> 124;
            case 56 -> 167;
            case 57 -> 217;
            case 58 -> 64;
            case 59 -> 30;
            case 60 -> 89;
            case 61 -> 202;
            case 62 -> 137;
            case 63 -> 238;
            case 64 -> 136;
            case 65 -> 55;
            case 66 -> 247;
            case 67 -> 140;
            case 68 -> 142;
            case 69 -> 199;
            case 70 -> 153;
            case 71 -> 187;
            case 72 -> 19;
            case 73 -> 109;
            case 74 -> 80;
            case 75 -> 74;
            case 76 -> 173;
            case 77 -> 9;
            case 78 -> 90;
            case 79 -> 228;
            case 80 -> 39;
            case 81 -> 156;
            case 82 -> 223;
            case 83 -> 165;
            case 84 -> 95;
            case 85 -> 4;
            case 86 -> 123;
            case 87 -> 111;
            case 88 -> 158;
            case 89 -> 60;
            case 90 -> 15;
            case 91 -> 44;
            case 92 -> 144;
            case 93 -> 189;
            case 94 -> 227;
            case 95 -> 127;
            case 96 -> 79;
            case 97 -> 66;
            case 98 -> 11;
            case 99 -> 145;
            case 100 -> 31;
            case 101 -> 162;
            case 102 -> 5;
            case 103 -> 240;
            case 104 -> 197;
            case 105 -> 178;
            case 106 -> 183;
            case 107 -> 53;
            case 108 -> 237;
            case 109 -> 126;
            case 110 -> 232;
            case 111 -> 119;
            case 112 -> 211;
            case 113 -> 14;
            case 114 -> 154;
            case 115 -> 12;
            case 116 -> 68;
            case 117 -> 52;
            case 118 -> 133;
            case 119 -> 25;
            case 120 -> 70;
            case 121 -> 224;
            case 122 -> 36;
            case 123 -> 114;
            case 124 -> 141;
            case 125 -> 254;
            case 126 -> 104;
            case 127 -> 10;
            case 128 -> 18;
            case 129 -> 63;
            case 130 -> 103;
            case 131 -> 128;
            case 132 -> 179;
            case 133 -> 147;
            case 134 -> 92;
            case 135 -> 239;
            case 136 -> 246;
            case 137 -> 233;
            case 138 -> 215;
            case 139 -> 61;
            case 140 -> 185;
            case 141 -> 35;
            case 142 -> 77;
            case 143 -> 27;
            case 144 -> 226;
            case 145 -> 3;
            case 146 -> 191;
            case 147 -> 198;
            case 148 -> 13;
            case 149 -> 149;
            case 150 -> 231;
            case 151 -> 110;
            case 152 -> 91;
            case 153 -> 87;
            case 154 -> 122;
            case 155 -> 0;
            case 156 -> 58;
            case 157 -> 20;
            case 158 -> 28;
            case 159 -> 117;
            case 160 -> 86;
            case 161 -> 54;
            case 162 -> 105;
            case 163 -> 49;
            case 164 -> 84;
            case 165 -> 16;
            case 166 -> 206;
            case 167 -> 182;
            case 168 -> 21;
            case 169 -> 42;
            case 170 -> 180;
            case 171 -> 214;
            case 172 -> 99;
            case 173 -> 23;
            case 174 -> 159;
            case 175 -> 107;
            case 176 -> 251;
            case 177 -> 252;
            case 178 -> 56;
            case 179 -> 249;
            case 180 -> 194;
            case 181 -> 244;
            case 182 -> 116;
            case 183 -> 94;
            case 184 -> 81;
            case 185 -> 29;
            case 186 -> 48;
            case 187 -> 37;
            case 188 -> 45;
            case 189 -> 38;
            case 190 -> 192;
            case 191 -> 40;
            case 192 -> 98;
            case 193 -> 112;
            case 194 -> 171;
            case 195 -> 24;
            case 196 -> 62;
            case 197 -> 168;
            case 198 -> 218;
            case 199 -> 184;
            case 200 -> 47;
            case 201 -> 152;
            case 202 -> 201;
            case 203 -> 219;
            case 204 -> 253;
            case 205 -> 118;
            case 206 -> 196;
            case 207 -> 100;
            case 208 -> 169;
            case 209 -> 50;
            case 210 -> 130;
            case 211 -> 210;
            case 212 -> 26;
            case 213 -> 143;
            case 214 -> 113;
            case 215 -> 234;
            case 216 -> 176;
            case 217 -> 236;
            case 218 -> 88;
            case 219 -> 155;
            case 220 -> 174;
            case 221 -> 132;
            case 222 -> 221;
            case 223 -> 135;
            case 224 -> 17;
            case 225 -> 188;
            case 226 -> 209;
            case 227 -> 33;
            case 228 -> 46;
            case 229 -> 59;
            case 230 -> 32;
            case 231 -> 242;
            case 232 -> 106;
            case 233 -> 164;
            case 234 -> 190;
            case 235 -> 73;
            case 236 -> 245;
            case 237 -> 101;
            case 238 -> 216;
            case 239 -> 125;
            case 240 -> 203;
            case 241 -> 85;
            case 242 -> 67;
            case 243 -> 222;
            case 244 -> 51;
            case 245 -> 121;
            case 246 -> 243;
            case 247 -> 220;
            case 248 -> 102;
            case 249 -> 212;
            case 250 -> 83;
            case 251 -> 172;
            case 252 -> 208;
            case 253 -> 34;
            case 254 -> 213;
            default -> 151;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }
}
