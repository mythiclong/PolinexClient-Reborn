package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import me.octo.client.utils.IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;

public final class IIIIlIIllIIIIIIlllIllIIIllIllllIllllIIlIlIlIlIIlllIlIIllIIIlIlIlIIlIllIIlIllIIIIlIIIl
   extends llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII {
   @NotNull
   public static IIIIlIIllIIIIIIlllIllIIIllIllllIllllIIlIlIlIlIIlllIlIIllIIIlIlIlIIlIllIIlIllIIIIlIIIl llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   @NotNull
   private static HashMap<String, llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl> lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   private static String[] c;
   private static String[] d;

   private IIIIlIIllIIIIIIlllIllIIIllIllllIllllIIlIlIlIlIIlllIlIIllIIIlIlIlIIlIllIIlIllIIIIlIIIl() {
      short var10001 = 8125;
      short var10002 = -31399;
      var10002 = 8112;
      short var10003 = -14369;
      var10003 = 8127;
      short var10004 = 32317;
      var10004 = 8122;
      short var10005 = -28962;
      IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI[] var1 = new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI[]{
         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
      };
      List var6 = CollectionsKt.arrayListOf(var1);
      short var10006 = 8119;
      short var10007 = 12241;
      llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var7 = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      String[] var2 = new String[7];
      short var10011 = 8118;
      short var10012 = -30044;
      var2[0] = "Lava Springs";
      var10011 = 8116;
      var10012 = -4824;
      var2[1] = "Upper Mines";
      var10011 = 8123;
      short var15 = -86;
      var2[2] = "Royal Mines";
      var10011 = 8113;
      var15 = -21862;
      var2[3] = "Cliffside Veins";
      var10011 = 8121;
      var15 = -7395;
      var2[4] = "Rampart's Quarry";
      var10011 = 8117;
      var15 = -10434;
      var2[5] = "Goblin Slayer";
      var10011 = 8124;
      var15 = -610;
      var2[6] = "Glacite Walker Slayer";
      super(
         "Dwarven Commission Editor",
         "DwarvenCommissionMacroV2-Routes",
         "DwarvenCommissionMacroV2",
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
                string2 = IlIllIlIlllIlIIIIIIIlIIlIllIllIIlllIIIIIIIlIllllIlIlIlIIlIIllIIlIIIIllIIllllIIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.i().V();
                lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.e();
                try {
                    try {
                        string = string2;
                        if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray != null) break block4;
                        if (!Intrinsics.areEqual((Object)string, (Object)"Polinex-Routes")) break block5;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        throw IIIIlIIllIIIIIIlllIllIIIllIllllIllllIIlIlIlIlIIlllIlIIllIIIlIlIlIIlIllIIlIllIIIIlIIIl.a(noSuchElementException);
                    }
                    return null;
                }
                catch (NoSuchElementException noSuchElementException) {
                    throw IIIIlIIllIIIIIIlllIllIIIllIllllIllllIIlIlIlIlIIlllIlIIllIIIlIlIlIIlIllIIlIllIIIIlIIIl.a(noSuchElementException);
                }
            }
            string = string2;
        }
        return string;
   }

   @Nullable
   @Override
   public String E() {
      String var1 = IlIllIlIlllIlIIIIIIIlIIlIllIllIIlllIIIIIIIlIllllIlIlIlIIlIIllIIlIIIIllIIllllIIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .h()
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
        Collection collection;
        block14: {
            llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl2;
            lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray;
            block13: {
                block12: {
                    String string;
                    block11: {
                        block10: {
                            lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.e();
                            try {
                                try {
                                    if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray != null) break block10;
                                    string = this.E();
                                    if (string != null) break block11;
                                }
                                catch (NoSuchElementException noSuchElementException) {
                                    throw IIIIlIIllIIIIIIlllIllIIIllIllllIllllIIlIlIlIlIIlllIlIIllIIIlIlIlIIlIllIIlIllIIIIlIIIl.a(noSuchElementException);
                                }
                            }
                            catch (NoSuchElementException noSuchElementException) {
                                throw IIIIlIIllIIIIIIlllIllIIIllIllllIllllIIlIlIlIlIIlllIlIIllIIIlIlIlIIlIllIIlIllIIIIlIIIl.a(noSuchElementException);
                            }
                        }
                        return new ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll>();
                    }
                    String string2 = string;
                    try {
                        try {
                            if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray != null) break block12;
                            llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl2 = lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.get(string2);
                            if (llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl2 != null) break block13;
                        }
                        catch (NoSuchElementException noSuchElementException) {
                            throw IIIIlIIllIIIIIIlllIllIIIllIllllIllllIIlIlIlIlIIlllIlIIllIIIlIlIlIIlIllIIlIllIIIIlIIIl.a(noSuchElementException);
                        }
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        throw IIIIlIIllIIIIIIlllIllIIIllIllllIllllIIlIlIlIlIIlllIlIIllIIIlIlIlIIlIllIIlIllIIIIlIIIl.a(noSuchElementException);
                    }
                }
                return new ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll>();
            }
            llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl3 = llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl2;
            Iterable iterable = llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl3.c();
            Collection collection2 = new ArrayList();
            boolean bl = false;
            for (Object t : iterable) {
                collection = collection2;
                lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll2 = (lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll)t;
                if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray == null) {
                    Collection collection3 = collection;
                    boolean bl2 = false;
                    collection3.add(new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll2.a(), IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl));
                    if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray == null) continue;
                }
                break block14;
            }
            collection = collection2;
        }
        return (ArrayList)collection;
   }

   @Nullable
   @Override
   public ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> b(int param1) {
        Collection collection;
        block14: {
            llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl2;
            lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray;
            block13: {
                block12: {
                    String string;
                    block11: {
                        block10: {
                            lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.e();
                            try {
                                try {
                                    if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray != null) break block10;
                                    string = (String)CollectionsKt.getOrNull(this.i(), (int)param1);
                                    if (string != null) break block11;
                                }
                                catch (NoSuchElementException noSuchElementException) {
                                    throw IIIIlIIllIIIIIIlllIllIIIllIllllIllllIIlIlIlIlIIlllIlIIllIIIlIlIlIIlIllIIlIllIIIIlIIIl.a(noSuchElementException);
                                }
                            }
                            catch (NoSuchElementException noSuchElementException) {
                                throw IIIIlIIllIIIIIIlllIllIIIllIllllIllllIIlIlIlIlIIlllIlIIllIIIlIlIlIIlIllIIlIllIIIIlIIIl.a(noSuchElementException);
                            }
                        }
                        return null;
                    }
                    String string2 = string;
                    try {
                        try {
                            if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray != null) break block12;
                            llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl2 = lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.get(string2);
                            if (llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl2 != null) break block13;
                        }
                        catch (NoSuchElementException noSuchElementException) {
                            throw IIIIlIIllIIIIIIlllIllIIIllIllllIllllIIlIlIlIlIIlllIlIIllIIIlIlIlIIlIllIIlIllIIIIlIIIl.a(noSuchElementException);
                        }
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        throw IIIIlIIllIIIIIIlllIllIIIllIllllIllllIIlIlIlIlIIlllIlIIllIIIlIlIlIIlIllIIlIllIIIIlIIIl.a(noSuchElementException);
                    }
                }
                return null;
            }
            llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl3 = llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl2;
            Iterable iterable = llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl3.c();
            Collection collection2 = new ArrayList();
            boolean bl = false;
            for (Object t : iterable) {
                collection = collection2;
                lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll2 = (lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll)t;
                if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray == null) {
                    Collection collection3 = collection;
                    boolean bl2 = false;
                    collection3.add(new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll2.a(), IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl));
                    if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray == null) continue;
                }
                break block14;
            }
            collection = collection2;
        }
        return (ArrayList)collection;
   }

   @NotNull
   @Override
   public IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl J() {
      return IlIllIlIlllIlIIIIIIIlIIlIllIllIIlllIIIIIIIlIllllIlIlIlIIlIIllIIlIIIIllIIllllIIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .i();
   }

   @Nullable
   public final llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl o(@NotNull String var1) {
      boolean var62 = false; // PX-FIX
      Collection var61 = null; // PX-FIX
      Object var60 = null; // PX-FIX
      boolean var59 = false; // PX-FIX
      Collection var57 = null; // PX-FIX
      Object var55 = null; // PX-FIX
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.e();
      short var10002 = 8120;
      short var10003 = -3342;
      Intrinsics.checkNotNullParameter(var1, "commissionName");
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      Iterable var6 = CollectionsKt.withIndex(this.i());
      Iterator var7 = var6.iterator();

      label171:
      while (true) {
         if (var7.hasNext()) {
            Object var8 = var7.next();
            var10000 = (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[])var8;

            while (true) {
               IndexedValue var9 = (IndexedValue)(Object)var10000;
               boolean var10 = false;
               if (!StringsKt.contains(var1, (CharSequence)var9.getValue(), false)) {
                  continue label171;
               }

               var10000 = (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[])var8;
               if (var2 == null) {
                  break label171;
               }
            }
         }

         var10000 = null;
         break;
      }

      label161: {
         try {
            IndexedValue var54 = (IndexedValue)(Object)var10000;
            if ((IndexedValue)(Object)var10000 != null) {
               var55 = var54.getIndex();
               break label161;
            }
         } catch (NoSuchElementException var25) {
            throw (RuntimeException)a(var25);
         }

         var55 = null;
      }

      Integer var3 =((Integer)( var55));

      try {
         if (var3 == null) {
            return null;
         }
      } catch (NoSuchElementException var24) {
         throw (RuntimeException)a(var24);
      }

      String var4 = IlIllIlIlllIlIIIIIIIlIIlIllIllIIlllIIIIIIIlIllllIlIlIlIIlIIllIIlIIIIllIIllllIIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .i()
         .V();
      var10000 = ((lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[])(Object)(lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.get(this.i().get(var3))));
      Intrinsics.checkNotNull(var10000);
      llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl var5 = (llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl)(Object)var10000;

      try {
         short var10001 = 8115;
         var10002 = 30308;
         if (Intrinsics.areEqual(var4, "Polinex-Routes")) {
            return var5;
         }
      } catch (NoSuchElementException var23) {
         throw (RuntimeException)a(var23);
      }

      Iterable var27 = this.a(var3);
      boolean var29 = false;
      Iterable var31 = var27;
      Collection var34 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var27, 10));
      boolean var11 = false;

      label138: {
         for (Object var13 : var27) {
            var57 = var34;
            IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var14 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var13;
            if (var2 != null) {
               break label138;
            }

            boolean var15 = false;
            var34.add(var14.a());
            if (var2 != null) {
               break;
            }
         }

         var57 = var34;
      }

      List var26 = (List)var57;
      boolean var28 = var26.isEmpty();

      label177: {
         label178: {
            label125: {
               try {
                  if (var2 != null) {
                     break label125;
                  }

                  if (var28) {
                     break label178;
                  }
               } catch (NoSuchElementException var22) {
                  throw (RuntimeException)a(var22);
               }

               var31 = var26;
               boolean var58 = false;
            }

            Collection var39 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var31, 10));
            boolean var41 = false;
            Iterator var44 = var31.iterator();

            while (true) {
               if (var44.hasNext()) {
                  Object var47 = var44.next();
                  var61 = var39;
                  BlockPos var49 = (BlockPos)var47;
                  if (var2 != null) {
                     break;
                  }

                  boolean var51 = false;
                  var39.add(
                     new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                        var49,
                        IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                        var5.a()
                     )
                  );
                  if (var2 == null) {
                     continue;
                  }
               }

               var61 = var39;
               break;
            }

            var60 = (List)var61;
            break label177;
         }

         var31 = var5.c();
         boolean var35 = false;
         var var38 = new ArrayList();
         boolean var40 = false;

         for (Object var46 : var31) {
            lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll var16 = (lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll)var46;
            boolean var17 = false;

            label104: {
               try {
                  if (var16.b()
                     == IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     )
                   {
                     var59 = true;
                     break label104;
                  }
               } catch (NoSuchElementException var21) {
                  throw (RuntimeException)a(var21);
               }

               var59 = false;
            }

            if (var59) {
               var38.add(var46);
               if (var2 != null) {
                  break;
               }
            }
         }

         var60 = var38;
      }

      List var30 =((List)( var60));
      List var63;
      if (!var28) {
         var63 = CollectionsKt.emptyList();
      } else {
         Iterable var36 = var5.c();
         var11 = false;
         var var42 = new ArrayList();
         boolean var45 = false;

         for (Object var50 : var36) {
            lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll var52 = (lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll)var50;
            boolean var18 = false;

            label85: {
               try {
                  if (var52.b()
                     == IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     )
                   {
                     var62 = true;
                     break label85;
                  }
               } catch (NoSuchElementException var20) {
                  throw (RuntimeException)a(var20);
               }

               var62 = false;
            }

            if (var62) {
               var42.add(var50);
               if (var2 != null) {
                  break;
               }
            }
         }

         var63 = var42;
      }

      List var33 = var63;
      return new llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl(
         var5.a(), var5.b(), CollectionsKt.plus(var30, var33), var5.d()
      );
   }

   @NotNull
   public final IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll S() {
      double var2 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w().y;
      Collection var7 = new ArrayList();

      for (me.octo.client.llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl var17 : lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.values()) {
         var var19 = var17.b();
         if (var19 != null) {
            var7.add(var19);
         }
      }

      Iterator var25 = ((List)var7).iterator();
      if (!var25.hasNext()) {
         throw new NoSuchElementException();
      }

      var var26 = (me.octo.client.utils.IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll)var25.next();
      double var27 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var26.b(), true) + Math.abs(var2 - var26.b().y) * 3.0;

      while (var25.hasNext()) {
         var var28 = (me.octo.client.utils.IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll)var25.next();
         double var29 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var28.b(), true) + Math.abs(var2 - var28.b().y) * 3.0;
         if (Double.compare(var27, var29) > 0) {
            var26 = var28;
            var27 = var29;
         }
      }

      return var26;
   }

   private static final boolean T() {
      return IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .j();
   }

   private static final boolean U() {
      return IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .k();
   }

   private static final boolean V() {
      return IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .l();
   }

   private static final boolean W() {
      return IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .m();
   }

   private static final boolean X() {
      return IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .n();
   }

   private static final boolean Y() {
      return IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .p();
   }

   private static final boolean Z() {
      return IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .o();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var40 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[16];
      int var3 = 0;
      String var2 = "Zx÷\u0095\u0006¤©ó?He\u0092\u0096_û\u001fce?Z\u0006Ý¼/p]üØã\u0086\u0016\u0089\u0016ãÚ4Îø\u0098Q¿Öß\u001d\u00136\u0015\u000e\u0015\u0001jÖ\u00184r|@\u0096xþ~ü\u0011$=¤Eªë\u0016·Ñ\u008c\u008f¼\u000bê|³³\r\u008b\u0017B\u0011Õbt¢íò8¬ì\u000b\u0092í#»²Q\u008dy\u0010ðÏ\u0007ð\u009cieÌ:å\f\u001dGîÙ\u009fê\r\b\u009d\u00ad\u008d¿\u0010>*LeòoÍè\u001b\u00002\u008b\u0093rS \u000eÂÓÄ\u0088ëmàÇE,y\u009d\n1\u000b°-\u0089[ÑÉ<j&\u0092\t\u0012]£Ü\u0082zÆ3P\u008d/ÎÐ¿\u0003Þ?WÐ\u0019²p\u0005øA\u0089TÆAms\u0098\b\n(\u001e\u0089ôI·ÃlÏXl\u0015©0\u0005\u0099^\u0087@4½={[$µsòØ\u001bY\u0084¥";
      int var4 = "Zx÷\u0095\u0006¤©ó?He\u0092\u0096_û\u001fce?Z\u0006Ý¼/p]üØã\u0086\u0016\u0089\u0016ãÚ4Îø\u0098Q¿Öß\u001d\u00136\u0015\u000e\u0015\u0001jÖ\u00184r|@\u0096xþ~ü\u0011$=¤Eªë\u0016·Ñ\u008c\u008f¼\u000bê|³³\r\u008b\u0017B\u0011Õbt¢íò8¬ì\u000b\u0092í#»²Q\u008dy\u0010ðÏ\u0007ð\u009cieÌ:å\f\u001dGîÙ\u009fê\r\b\u009d\u00ad\u008d¿\u0010>*LeòoÍè\u001b\u00002\u008b\u0093rS \u000eÂÓÄ\u0088ëmàÇE,y\u009d\n1\u000b°-\u0089[ÑÉ<j&\u0092\t\u0012]£Ü\u0082zÆ3P\u008d/ÎÐ¿\u0003Þ?WÐ\u0019²p\u0005øA\u0089TÆAms\u0098\b\n(\u001e\u0089ôI·ÃlÏXl\u0015©0\u0005\u0099^\u0087@4½={[$µsòØ\u001bY\u0084¥"
         .length();
      char var1 = 15;
      int var11 = -1;

      label52:
      while (true) {
         byte var10000 = 41;
         String var10001 = var2.substring(++var11, var11 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var48 = var10001.toCharArray();
               int var10004 = var48.length;
               int var6 = 0;
               byte var51 = var10000;
               var40 = var48;
               int var34 = var10004;
               byte var60;
               char[] var64;
               int var10006;
               if (var10004 <= 1) {
                  var64 = var48;
                  var60 = var10000;
                  var10006 = var6;
               } else {
                  var51 = var10000;
                  var34 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var64 = var48;
                  var60 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var64[var10006] = (char)(var64[var10006] ^ var60 ^ switch (var6 % 7) {
                     case 0 -> 63;
                     case 1 -> 34;
                     case 2 -> 21;
                     case 3 -> 85;
                     case 4 -> 116;
                     case 5 -> 105;
                     default -> 40;
                  });
                  var6++;
                  if (var51 == 0) {
                     var10006 = var51;
                     var64 = var40;
                     var60 = var51;
                  } else {
                     if (var34 <= var6) {
                        break;
                     }

                     var64 = var40;
                     var60 = var51;
                     var10006 = var6;
                  }
               }
            }

            String var53 = new String(var40).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var53;
                  if ((var11 += var1) >= var4) {
                     c = var5;
                     d = new String[16];
                     llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = new IIIIlIIllIIIIIIlllIllIIIllIllllIllllIIlIlIlIlIIlllIlIIllIIIlIlIlIIlIllIIlIllIIIIlIIIl();
                     lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = new HashMap<>();
                     Map var7 = lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
                     Object var8 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(0);
                     String var44 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(0);
                     IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll var54 = new IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll(
                        new BlockPos(58, 197, -10), new Vec3(58.5, 199.52, -8.5)
                     );
                     lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll[] var9 = new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll[]{
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(53, 197, -24),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(0)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(43, 197, -19),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(0)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(41, 197, -12),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(0)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(51, 215, -30),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(0)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(53, 205, 16),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(0)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(43, 201, -24),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(0)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(69, 217, 8),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(0)
                        )
                     };
                     llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl var20 = new llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl(
                        var44, var54, CollectionsKt.listOf(var9), IIIIlIIllIIIIIIlllIllIIIllIllllIllllIIlIlIlIlIIlllIlIIllIIIlIlIlIIlIllIIlIllIIIIlIIIl::T
                     );
                     var7.put(var8, var20);
                     var7 = lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
                     var8 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(1);
                     String var45 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(1);
                     IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll var55 = new IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll(
                        new BlockPos(-132, 173, -52), new Vec3(-132.5, 175.52, -50.5)
                     );
                     var9 = new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll[]{
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(-111, 166, -75),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(1)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(-124, 170, -74),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(1)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(-143, 167, -30),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(1)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(-131, 167, -25),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(1)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(-78, 187, -71),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(1)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(-97, 194, -75),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(1)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(-91, 201, -77),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(1)
                        )
                     };
                     llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl var22 = new llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl(
                        var45, var55, CollectionsKt.listOf(var9), IIIIlIIllIIIIIIlllIllIIIllIllllIllllIIlIlIlIlIIlllIlIIllIIIlIlIlIIlIllIIlIllIIIIlIIIl::U
                     );
                     var7.put(var8, var22);
                     var7 = lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
                     var8 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(2);
                     String var46 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(2);
                     IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll var56 = new IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll(
                        new BlockPos(170, 149, 32), new Vec3(171.5, 151.52, 31.5)
                     );
                     var9 = new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll[]{
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(114, 153, 43),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(2)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(140, 152, 26),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(2)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(146, 151, 30),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(2)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(176, 151, 23),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(2)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(171, 149, 82),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(2)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(106, 163, 31),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(2)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(110, 159, 24),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(2)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(166, 160, 19),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(2)
                        )
                     };
                     llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl var24 = new llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl(
                        var46, var56, CollectionsKt.listOf(var9), IIIIlIIllIIIIIIlllIllIIIllIllllIllllIIlIlIlIlIIlllIlIIllIIIlIlIlIIlIllIIlIllIIIIlIIIl::V
                     );
                     var7.put(var8, var24);
                     var7 = lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
                     var8 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(3);
                     String var47 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(3);
                     IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll var57 = new IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll(
                        new BlockPos(43, 134, 21), new Vec3(42.5, 136.02, 22.5)
                     );
                     var9 = new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll[]{
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(24, 127, 33),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(3)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(46, 127, 24),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(3)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(14, 127, 37),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(3)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(7, 128, 39),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(3)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(67, 140, 21),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(3)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(51, 142, 6),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(3)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(-8, 135, 35),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(3)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(27, 138, 22),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(3)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(16, 167, 34),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(3)
                        )
                     };
                     llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl var26 = new llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl(
                        var47, var57, CollectionsKt.listOf(var9), IIIIlIIllIIIIIIlllIllIIIllIllllIllllIIlIlIlIlIIlllIlIIllIIIlIlIlIIlIllIIlIllIIIIlIIIl::W
                     );
                     var7.put(var8, var26);
                     var7 = lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
                     var8 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(4);
                     var9 = new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll[]{
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(-91, 146, -6),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(4)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(-88, 146, -13),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(4)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(-85, 153, -17),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(4)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(-114, 151, -32),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(4)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(-91, 159, -60),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(4)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(-105, 148, 14),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(4)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(-115, 150, -24),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(4)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(-74, 169, -59),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(4)
                        ),
                        new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                           new BlockPos(-69, 178, -60),
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(4)
                        )
                     };
                     llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl var28 = new llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl(
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(4),
                        null,
                        CollectionsKt.listOf(var9),
                        IIIIlIIllIIIIIIlllIllIIIllIllllIllllIIlIlIlIlIIlllIlIIllIIIlIlIlIIlIllIIlIllIIIIlIIIl::X
                     );
                     var7.put(var8, var28);
                     lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.put(
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(5),
                        new llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl(
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(5),
                           null,
                           CollectionsKt.listOf(
                              new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                                 new BlockPos(-104, 144, 139),
                                 IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                                 llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(5)
                              )
                           ),
                           IIIIlIIllIIIIIIlllIllIIIllIllllIllllIIlIlIlIlIIlllIlIIllIIIlIlIlIIlIllIIlIllIIIIlIIIl::Y
                        )
                     );
                     lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.put(
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(6),
                        new llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl(
                           llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(6),
                           null,
                           CollectionsKt.listOf(
                              new lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll(
                                 new BlockPos(5, 127, 151),
                                 IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                                 llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.i().get(6)
                              )
                           ),
                           IIIIlIIllIIIIIIlllIllIIIllIllllIllllIIlIlIlIlIIlllIlIIllIIIlIlIlIIlIllIIlIllIIIIlIIIl::Z
                        )
                     );
                     break pxClinit;
                  }

                  var1 = var2.charAt(var11);
                  break;
               default:
                  var5[var3++] = var53;
                  if ((var11 += var1) < var4) {
                     var1 = var2.charAt(var11);
                     continue label52;
                  }

                  var2 = "+úÔK\u0099\u001d\u00adÕ°à\u0006\u008d^ÎCb^|1%Q8\u0089«\u000ed×¦îcÑÿ\"\u0013¿ð9\u008dæ";
                  var4 = "+úÔK\u0099\u001d\u00adÕ°à\u0006\u008d^ÎCb^|1%Q8\u0089«\u000ed×¦îcÑÿ\"\u0013¿ð9\u008dæ".length();
                  var1 = 24;
                  var11 = -1;
            }

            var10000 = 15;
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
      int var2 = (var0 ^ 8113) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 142;
            case 1 -> 146;
            case 2 -> 80;
            case 3 -> 17;
            case 4 -> 111;
            case 5 -> 173;
            case 6 -> 176;
            case 7 -> 124;
            case 8 -> 194;
            case 9 -> 165;
            case 10 -> 2;
            case 11 -> 93;
            case 12 -> 148;
            case 13 -> 64;
            case 14 -> 109;
            case 15 -> 202;
            case 16 -> 26;
            case 17 -> 172;
            case 18 -> 133;
            case 19 -> 153;
            case 20 -> 207;
            case 21 -> 12;
            case 22 -> 231;
            case 23 -> 221;
            case 24 -> 179;
            case 25 -> 82;
            case 26 -> 113;
            case 27 -> 222;
            case 28 -> 101;
            case 29 -> 140;
            case 30 -> 20;
            case 31 -> 149;
            case 32 -> 154;
            case 33 -> 208;
            case 34 -> 241;
            case 35 -> 71;
            case 36 -> 76;
            case 37 -> 200;
            case 38 -> 22;
            case 39 -> 186;
            case 40 -> 163;
            case 41 -> 151;
            case 42 -> 228;
            case 43 -> 66;
            case 44 -> 50;
            case 45 -> 94;
            case 46 -> 254;
            case 47 -> 203;
            case 48 -> 192;
            case 49 -> 106;
            case 50 -> 206;
            case 51 -> 72;
            case 52 -> 128;
            case 53 -> 92;
            case 54 -> 81;
            case 55 -> 47;
            case 56 -> 185;
            case 57 -> 130;
            case 58 -> 95;
            case 59 -> 158;
            case 60 -> 5;
            case 61 -> 217;
            case 62 -> 46;
            case 63 -> 204;
            case 64 -> 3;
            case 65 -> 86;
            case 66 -> 49;
            case 67 -> 38;
            case 68 -> 235;
            case 69 -> 218;
            case 70 -> 210;
            case 71 -> 125;
            case 72 -> 160;
            case 73 -> 13;
            case 74 -> 247;
            case 75 -> 175;
            case 76 -> 139;
            case 77 -> 220;
            case 78 -> 39;
            case 79 -> 122;
            case 80 -> 242;
            case 81 -> 97;
            case 82 -> 19;
            case 83 -> 37;
            case 84 -> 68;
            case 85 -> 31;
            case 86 -> 119;
            case 87 -> 226;
            case 88 -> 114;
            case 89 -> 183;
            case 90 -> 58;
            case 91 -> 126;
            case 92 -> 230;
            case 93 -> 8;
            case 94 -> 216;
            case 95 -> 115;
            case 96 -> 107;
            case 97 -> 24;
            case 98 -> 91;
            case 99 -> 178;
            case 100 -> 250;
            case 101 -> 150;
            case 102 -> 156;
            case 103 -> 4;
            case 104 -> 7;
            case 105 -> 41;
            case 106 -> 197;
            case 107 -> 110;
            case 108 -> 136;
            case 109 -> 88;
            case 110 -> 152;
            case 111 -> 161;
            case 112 -> 251;
            case 113 -> 55;
            case 114 -> 243;
            case 115 -> 201;
            case 116 -> 223;
            case 117 -> 174;
            case 118 -> 219;
            case 119 -> 25;
            case 120 -> 134;
            case 121 -> 237;
            case 122 -> 43;
            case 123 -> 48;
            case 124 -> 252;
            case 125 -> 61;
            case 126 -> 36;
            case 127 -> 84;
            case 128 -> 35;
            case 129 -> 246;
            case 130 -> 40;
            case 131 -> 195;
            case 132 -> 87;
            case 133 -> 198;
            case 134 -> 214;
            case 135 -> 104;
            case 136 -> 117;
            case 137 -> 193;
            case 138 -> 205;
            case 139 -> 63;
            case 140 -> 67;
            case 141 -> 90;
            case 142 -> 52;
            case 143 -> 171;
            case 144 -> 137;
            case 145 -> 118;
            case 146 -> 229;
            case 147 -> 0;
            case 148 -> 89;
            case 149 -> 53;
            case 150 -> 14;
            case 151 -> 11;
            case 152 -> 255;
            case 153 -> 245;
            case 154 -> 108;
            case 155 -> 30;
            case 156 -> 234;
            case 157 -> 100;
            case 158 -> 10;
            case 159 -> 215;
            case 160 -> 199;
            case 161 -> 74;
            case 162 -> 129;
            case 163 -> 236;
            case 164 -> 121;
            case 165 -> 29;
            case 166 -> 182;
            case 167 -> 189;
            case 168 -> 144;
            case 169 -> 60;
            case 170 -> 102;
            case 171 -> 187;
            case 172 -> 18;
            case 173 -> 98;
            case 174 -> 196;
            case 175 -> 244;
            case 176 -> 209;
            case 177 -> 6;
            case 178 -> 75;
            case 179 -> 181;
            case 180 -> 51;
            case 181 -> 167;
            case 182 -> 211;
            case 183 -> 42;
            case 184 -> 21;
            case 185 -> 240;
            case 186 -> 123;
            case 187 -> 249;
            case 188 -> 248;
            case 189 -> 141;
            case 190 -> 239;
            case 191 -> 166;
            case 192 -> 233;
            case 193 -> 73;
            case 194 -> 32;
            case 195 -> 65;
            case 196 -> 9;
            case 197 -> 85;
            case 198 -> 99;
            case 199 -> 127;
            case 200 -> 120;
            case 201 -> 168;
            case 202 -> 227;
            case 203 -> 16;
            case 204 -> 180;
            case 205 -> 159;
            case 206 -> 83;
            case 207 -> 191;
            case 208 -> 54;
            case 209 -> 34;
            case 210 -> 77;
            case 211 -> 131;
            case 212 -> 59;
            case 213 -> 138;
            case 214 -> 224;
            case 215 -> 188;
            case 216 -> 28;
            case 217 -> 45;
            case 218 -> 70;
            case 219 -> 33;
            case 220 -> 23;
            case 221 -> 232;
            case 222 -> 225;
            case 223 -> 15;
            case 224 -> 184;
            case 225 -> 164;
            case 226 -> 27;
            case 227 -> 105;
            case 228 -> 253;
            case 229 -> 96;
            case 230 -> 79;
            case 231 -> 57;
            case 232 -> 56;
            case 233 -> 213;
            case 234 -> 145;
            case 235 -> 212;
            case 236 -> 157;
            case 237 -> 170;
            case 238 -> 69;
            case 239 -> 132;
            case 240 -> 62;
            case 241 -> 190;
            case 242 -> 162;
            case 243 -> 177;
            case 244 -> 44;
            case 245 -> 238;
            case 246 -> 155;
            case 247 -> 116;
            case 248 -> 147;
            case 249 -> 135;
            case 250 -> 169;
            case 251 -> 1;
            case 252 -> 103;
            case 253 -> 78;
            case 254 -> 112;
            default -> 143;
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
