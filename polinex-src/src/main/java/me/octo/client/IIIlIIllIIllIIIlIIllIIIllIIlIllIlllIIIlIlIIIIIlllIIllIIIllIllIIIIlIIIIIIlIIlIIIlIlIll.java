package me.octo.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;
import me.octo.client.events.impl.llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import me.octo.client.utils.lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIIlIIllIIllIIIlIIllIIIllIIlIllIlllIIIlIlIIIIIlllIIllIIIllIllIIIIlIIIIIIlIIlIIIlIlIll
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static IIIlIIllIIllIIIlIIllIIIllIIlIllIlllIIIlIlIIIIIlllIIllIIIllIllIIIIlIIIIIIlIIlIIIlIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private long lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private final HashMap<Integer, Integer> lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private final ArrayList<Integer> IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private int llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private boolean IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private int IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @NotNull
   private final HashMap<Integer, ItemStack> IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   @NotNull
   private final HashMap<Integer, Integer> IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   @Nullable
   private Pair<Integer, Integer> llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   @NotNull
   private HashSet<Integer> IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   @NotNull
   private String lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   private long llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   @NotNull
   private static IIIlIIllIIllIIIlIIllIIIllIIlIllIlllIIIlIlIIIIIlllIIllIIIllIllIIIIlIIIIIIlIIlIIIlIlIll lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   private static String[] f;
   private static String[] g;

   private IIIlIIllIIllIIIlIIllIIIllIIlIllIlllIIIlIlIIIIIlllIIllIIIllIllIIIIlIIIIIIlIIlIIIlIlIll() {
      short var10001 = 31664;
      short var10002 = 29044;
      var10002 = 31675;
      short var10003 = -12618;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      short var10004 = 31674;
      short var10005 = -647;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         lIIlllllIllllIlIIlIIIIlllIlllIlIIIlIlllIlIIIlIIIlllIlIIIIIIIIIIlllllIlIIllllllIIIllIl.a(),
         lIIlllllIllllIlIIlIIIIlllIlllIlIIIlIlllIlIIIlIIIlllIlIIIIIIIIIIlllllIlIIllllllIIIllIl.b(),
         lIIlllllIllllIlIIlIIIIlllIlllIlIIIlIlllIlIIIlIIIlllIlIIIIIIIIIIlllllIlIIllllllIIIllIl.c()
      };
      super("Experiment Solver", "Automatically completes Ultrasequencer and Chronomatron experiments.", var3, "Misc", var1);
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap<>();
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new ArrayList<>(28);
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = new HashMap<>();
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = new HashMap<>();
      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = new HashSet<>();
      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = "";
   }

   public void aB() {
      super.aB();
      this.ag();
   }

   public void aC() {
      super.aC();
      this.ag();
   }

   private final void ag() {
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.clear();
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.clear();
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll.clear();
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.clear();
      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.clear();
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 0;
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = false;
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 0;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 0L;
      this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = 0L;
      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = null;
      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = "";
      short var10001 = 31679;
      short var10002 = -25093;
      lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a("superpairs");
   }

   @SubscribeEvent
   public final void a(@NotNull llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI var1) {
      int[] var10000 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      short var10002 = 31666;
      short var10003 = 26858;
      Intrinsics.checkNotNullParameter(var1, "event");
      int[] var2 = var10000;
      int var3 = this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll.length();
      if (var2 == null) {
         var3 = var3 == 0 ? 1 : 0;
      }

      if (var3 == 0) {
         this.ag();
      }
   }

   @SubscribeEvent
   public final void a(@NotNull llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI var1) {
      int[] var10000 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      short var10002 = 31667;
      short var10003 = 27275;
      Intrinsics.checkNotNullParameter(var1, "event");
      int[] var2 = var10000;
      if (this.aA()) {
         if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g()
            == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            )
          {
            String var5 = var1.k();
            if (var5 != null) {
               String var3 = var5;
               if (var2 == null) {
                  List var6 = var1.m();
                  if (var6 != null) {
                     List var4 = var6;
                     int var7 = var4.size();
                     if (var2 == null) {
                        if (var7 <= 49) {
                           return;
                        }

                        var7 = ((((Slot)var4.get(49)).hasItem() ? 1 : 0));
                     }

                     if (var2 == null) {
                        if (var7 == 0) {
                           return;
                        }

                        var7 = ((Intrinsics.areEqual(this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll, var3)) ? 1 : 0);
                     }

                     label96:
                     if (var2 == null) {
                        if (var7 == 0) {
                           int var8 = this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll.length();
                           if (var2 == null) {
                              var8 = var8 == 0 ? 1 : 0;
                           }

                           if (var8 == 0) {
                              this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.clear();
                              this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.clear();
                              this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll.clear();
                              this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.clear();
                              this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 0;
                              this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = false;
                              this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 0;
                              short var10001 = 31668;
                              var10002 = 5726;
                              lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .a("superpairs");
                           }

                           this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = var3;
                           short var9 = 31671;
                           var10002 = 16193;
                           var7 = ((StringsKt.startsWith(var3, "Chronomatron (", false)) ? 1 : 0);
                           if (var2 != null) {
                              break label96;
                           }

                           if (var7 != 0) {
                              this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = true;
                           }
                        }

                        short var10 = 31665;
                        var10002 = 30053;
                        var7 = ((StringsKt.startsWith(var3, "Ultrasequencer (", false)) ? 1 : 0);
                     }

                     if (var2 == null) {
                        if (var7 != 0) {
                           this.a(var4);
                           if (var2 == null) {
                              return;
                           }
                        }

                        short var11 = 31670;
                        var10002 = -11360;
                        var7 = ((StringsKt.startsWith(var3, "Chronomatron (", false)) ? 1 : 0);
                     }

                     if (var2 == null) {
                        if (var7 != 0) {
                           this.b(var4);
                           if (var2 == null) {
                              return;
                           }
                        }

                        short var12 = 31676;
                        var10002 = -12457;
                        var7 = ((StringsKt.startsWith(var3, "Superpairs (", false)) ? 1 : 0);
                     }

                     if (var2 == null) {
                        if (var7 != 0) {
                           this.c(var4);
                           if (var2 == null) {
                              return;
                           }
                        }

                        var7 = this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll.length();
                     }

                     if (var2 == null) {
                        var7 = var7 == 0 ? 1 : 0;
                     }

                     if (var7 == 0) {
                        this.ag();
                     }

                     return;
                  }
               }
            }
         }
      }
   }

   private final void a(List<? extends Slot> var1) {
      Object var23 = null; // PX-FIX
      Object var19 = null; // PX-FIX
      Object var18 = null; // PX-FIX
      int[] var10000 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      int var3 = 9 - (Integer)((me.octo.client.PXDyn)(Object)(lIIlllllIllllIlIIlIIIIlllIlllIlIIIlIlllIlIIIlIIIlllIlIIIIIIIIIIlllllIlIIllllllIIIllIl.c())).M();
      int[] var2 = var10000;
      Slot var4 = (Slot)var1.get(49);
      if (var2 == null) {
         ItemStack var16 = var4.getItem();
         if (var16 != null) {
            ItemStack var5;
            label180: {
               var5 = var16;
               if (var2 == null) {
                  Component var17 = var5.getHoverName();
                  if (var17 != null) {
                     var18 = var17.getString();
                     if (var18 != null) {
                        break label180;
                     }
                  }
               }

               var18 = "";
            }

            label173: {
               String var6;
               label187: {
                  var6 =((String)( var18));
                  int var10001 = 31677;
                  short var10002 = -6487;
                  var19 = Intrinsics.areEqual(var6, "Remember the pattern!");
                  if (var2 == null) {
                     if (((Boolean)(var19))) {
                        var19 = Intrinsics.areEqual(var5.getItem(), Items.GLOWSTONE);
                        if (var2 != null) {
                           break label173;
                        }

                        if (((Boolean)(var19))) {
                           break label187;
                        }
                     }

                     long var32;
                     var19 = (
                              var32 = System.currentTimeMillis()
                                 - this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl
                                 - 500L
                           )
                           == 0L
                        ? 0
                        : (var32 < 0L ? -1 : 1);
                  }

                  if (var2 != null) {
                     break label173;
                  }

                  if (((Boolean)var19)) {
                     this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.clear();
                     this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 0;

                     label189: {
                        for (Slot var8 : var1) {
                           int var9 = var8.index;
                           var19 = 9;
                           var10001 = var9;
                           if (var2 != null) {
                              break label189;
                           }

                           label157: {
                              if (var2 == null) {
                                 if (9 > var9) {
                                    var19 = 0;
                                    break label157;
                                 }

                                 var19 = var9;
                                 if (var2 != null) {
                                    break label157;
                                 }

                                 var10001 = 45;
                              }

                              var19 = ((Integer)var19) < (((var10001 != 0) ? 1 : 0)) ? 1 : 0;
                           }

                           if (!((Boolean)var19)) {
                              Slot var20 = var8;
                              if (var2 == null) {
                                 if (!var8.hasItem()) {
                                    continue;
                                 }

                                 var20 = var8;
                              }

                              ItemStack var21 = var20.getItem();
                              if (var21 != null) {
                                 label145: {
                                    ItemStack var12 = var21;
                                    if (var2 == null) {
                                       Component var22 = var12.getHoverName();
                                       if (var22 != null) {
                                          var23 = var22.getString();
                                          if (var23 != null) {
                                             break label145;
                                          }
                                       }
                                    }

                                    var23 = "";
                                 }

                                 String var10 =((String)( var23));
                                 Integer var11 = StringsKt.toIntOrNull(var10);
                                 Integer var24 = var11;
                                 if (var2 == null) {
                                    if (var11 == null) {
                                       continue;
                                    }

                                    var24 = var11;
                                 }

                                 if (var2 == null) {
                                    if (var24 <= 0) {
                                       continue;
                                    }

                                    this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var11 - 1, var8.index);
                                 }

                                 if (var2 != null) {
                                    break;
                                 }
                              }
                           }
                        }

                        boolean var25 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.isEmpty();
                        if (var2 == null) {
                           var25 = !var25;
                        }

                        if (var25) {
                           this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = System.currentTimeMillis();
                        }

                        var19 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.size();
                        if (var2 != null) {
                           break label173;
                        }

                        var10001 = var3;
                     }

                     if (((Integer)var19) > (((var10001 != 0) ? 1 : 0))) {
                        var19 = ((me.octo.client.PXDyn)(Object)(lIIlllllIllllIlIIlIIIIlllIlllIlIIIlIlllIlIIIlIIIlllIlIIIIIIIIIIlllllIlIIllllllIIIllIl.a())).al();
                        if (var2 != null) {
                           break label173;
                        }

                        if (!((Boolean)var19)) {
                           LocalPlayer var26 = this.ap().player;
                           if (var26 != null) {
                              var26.closeContainer();
                           }
                        }
                     }
                  }
               }

               short var30 = 31669;
               short var31 = 3963;
               var19 = StringsKt.startsWith(var6, "Timer:", false);
            }

            if (var2 == null) {
               if (((Boolean)(var19))) {
                  return;
               }

               var19 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.isEmpty();
            }

            if (var2 == null) {
               var19 =((Boolean)(Object)( (Boolean)var19 ? 1 : 0));
            }

            if (!((Boolean)var19)) {
               int var27 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
               if (var2 == null) {
                  if (this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
                     >= this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.size()) {
                     return;
                  }

                  long var33;
                  var27 = (
                           var33 = System.currentTimeMillis()
                              - this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                              - (Long)((me.octo.client.PXDyn)(Object)(lIIlllllIllllIlIIlIIIIlllIlllIlIIIlIlllIlIIIlIIIlllIlIIIIIIIIIIlllllIlIIllllllIIIllIl.b())).M()
                        )
                        == 0L
                     ? 0
                     : (var33 < 0L ? -1 : 1);
               }

               if (var27 >= 0) {
                  Object var28 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
                     .get(this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI);
                  if (var2 == null) {
                     if (var28 == null) {
                        return;
                     }

                     var28 = (Number)var28;
                  }

                  int var13 = ((me.octo.client.PXDyn)var28).intValue();
                  boolean var14 = false;
                  me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a(var13, 0, ContainerInput.CLONE);
                  this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = System.currentTimeMillis();
                  int var15 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI++;
               }
            }

            return;
         }
      }
   }

   private final void b(List<? extends Slot> var1) {
      Object var26 = null; // PX-FIX
      int var17 = 0; // PX-FIX
      int[] var10000 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      int var3 = 11 - (Integer)((me.octo.client.PXDyn)(Object)(lIIlllllIllllIlIIlIIIIlllIlllIlIIIlIlllIlIIIlIIIlllIlIIIIIIIIIIlllllIlIIllllllIIIllIl.c())).M();
      int[] var2 = var10000;
      Slot var4 = (Slot)var1.get(49);
      if (var2 == null) {
         ItemStack var14 = var4.getItem();
         if (var14 != null) {
            Slot var8;
            label208: {
               ItemStack var5 = var14;
               Item var6 = var5.getItem();
               int var15 = ((Intrinsics.areEqual(var6, Items.CLOCK)) ? 1 : 0);
               if (var2 == null) {
                  if (var15 != 0) {
                     label185: {
                        int var10001;
                        label186: {
                           boolean var16 = this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
                           if (var2 == null) {
                              if (this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl) {
                                 for (Slot var61 : var1) { // PX-FIX
                                    var8 = var61;
                                    int var9 = var61.index;
                                    var17 = 10;
                                    var10001 = var9;
                                    if (var2 != null) {
                                       break label186;
                                    }

                                    label150: {
                                       if (var2 == null) {
                                          if (10 > var9) {
                                             var17 = 0;
                                             break label150;
                                          }

                                          var17 = var9;
                                          if (var2 != null) {
                                             break label150;
                                          }

                                          var10001 = 44;
                                       }

                                       var17 = var17 < var10001 ? 1 : 0;
                                    }

                                    if (var17 != 0) {
                                       Slot var18 = var61;
                                       if (var2 == null) {
                                          if (!var61.hasItem()) {
                                             continue;
                                          }

                                          var18 = var61;
                                       }

                                       ItemStack var19 = var18.getItem();
                                       if (var19 != null) {
                                          ItemStack var13 = var19;
                                          int var20 = ((var13.hasFoil()) ? 1 : 0);
                                          if (var2 == null) {
                                             if (var20 == 0) {
                                                continue;
                                             }

                                             var20 = var61.index;
                                          }

                                          if (var2 != null) {
                                             break label208;
                                          }

                                          if (var20 != this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl) {
                                             this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.add(var61.index);
                                             break label208;
                                          }
                                       }
                                    }
                                 }
                              }

                              var16 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.isEmpty();
                           }

                           if (var2 == null) {
                              var16 = !var16;
                           }

                           if (!var16) {
                              return;
                           }

                           var17 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
                           if (var2 != null) {
                              break label185;
                           }

                           var10001 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.size();
                        }

                        if (var17 >= var10001) {
                           return;
                        }

                        long var30;
                        var17 = (
                                 var30 = System.currentTimeMillis()
                                    - this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                                    - (Long)((me.octo.client.PXDyn)(Object)(lIIlllllIllllIlIIlIIIIlllIlllIlIIIlIlllIlIIIlIIIlllIlIIIIIIIIIIlllllIlIIllllllIIIllIl.b())).M()
                              )
                              == 0L
                           ? 0
                           : (var30 < 0L ? -1 : 1);
                     }

                     if (var2 == null) {
                        if (var17 < 0) {
                           return;
                        }

                        Integer var10007 = null; // PX-FIX var-split (var10000=int[] 声明 vs Integer 用途)
                        var10007 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
                           .get(this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI);
                        short var10002 = 31678;
                        short var10003 = -20605;
                        Intrinsics.checkNotNullExpressionValue(var10007, "get(...)");
                        var17 = ((Number)(Object)var10007).intValue();
                     }

                     int var10 = var17;
                     me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a(var10, 0, ContainerInput.CLONE);
                     this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = System.currentTimeMillis();
                     int var12 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI++;
                     if (var2 == null) {
                        return;
                     }
                  }

                  var15 = ((Intrinsics.areEqual(var6, Items.GLOWSTONE)) ? 1 : 0);
               }

               if (var2 == null) {
                  if (var15 == 0) {
                     return;
                  }

                  var15 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
               }

               label191: {
                  if (var2 == null) {
                     if (var15 == 0) {
                        this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = true;
                        this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 0;
                        if (var2 == null) {
                           return;
                        }
                     }

                     var10000 = (int[])(Object)this;
                     if (var2 != null) {
                        break label191;
                     }

                     var15 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
                  }

                  if (var15 >= var1.size()) {
                     return;
                  }

                  var10000 = (int[])(Object)(var1.get(this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl));
               }

               ItemStack var23 = ((Slot)(Object)var10000).getItem();
               short var28 = 31672;
               short var29 = -22324;
               Intrinsics.checkNotNullExpressionValue(var23, "getItem(...)");
               ItemStack var11 = var23;
               boolean var24 = var11.hasFoil();
               if (var2 == null) {
                  var24 = !var24;
               }

               if (var24) {
                  label95: {
                     label94: {
                        int var25 = ((me.octo.client.PXDyn)(Object)(lIIlllllIllllIlIIlIIIIlllIlllIlIIIlIlllIlIIIlIIIlllIlIIIIIIIIIIlllllIlIIllllllIIIllIl.a())).al();
                        if (var2 == null) {
                           if (var25 == 0) {
                              break label94;
                           }

                           var26 = this;
                           if (var2 != null) {
                              break label95;
                           }

                           var25 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.size();
                        }

                        if (var25 > var3) {
                           LocalPlayer var27 = this.ap().player;
                           if (var27 != null) {
                              var27.closeContainer();
                           }
                        }
                     }

                     this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = true;
                     var26 = this;
                  }

                  this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 0;
               }

               return;
            }

            this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var8.index;
            this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = false;
            return;
         }
      }
   }

   private final void c(List<? extends Slot> param1) {
      HashSet<Integer> var3 = new HashSet<>();
      ArrayList var4 = new ArrayList();
      for (Slot var6 : param1) {
         int var7 = var6.index;
         if (9 <= var7 && var7 < 45) {
            if (var6.hasItem()) {
               ItemStack var8 = var6.getItem();
               Intrinsics.checkNotNullExpressionValue(var8, "getItem(...)");
               if (!Intrinsics.areEqual(var8.getItem(), Items.BLACK_STAINED_GLASS_PANE) && !Intrinsics.areEqual(var8.getItem(), Items.AIR) && !Intrinsics.areEqual(var8.getItem(), Items.CYAN_STAINED_GLASS)) {
                  var3.add(var6.index);
                  if (!this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll.containsKey(var6.index)) {
                     this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll.put(var6.index, var8.copy());

                     for (java.util.Map.Entry<Integer, ItemStack> var9 : this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll.entrySet()) {
                        int var10 = var9.getKey();
                        ItemStack var11 = var9.getValue();
                        if (var10 != var6.index && ItemStack.isSameItemSameComponents(var8, var11)) {
                           this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.put(var6.index, var10);
                           this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.put(var10, var6.index);
                        }
                     }
                  }
               }
            }
         }
      }

      java.util.Set<Integer> var5 = kotlin.collections.SetsKt.minus(var3, this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll);
      if (!var5.isEmpty()) {
         int var6 = ((Number)kotlin.collections.CollectionsKt.first((Iterable)var5)).intValue();
         Integer var7 = this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.get(var6);
         this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = var7 == null ? null : new Pair<>(var6, var7);
      }

      if (this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI != null && !var3.contains(this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI.getFirst()) && !var3.contains(this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI.getSecond())) {
         this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = null;
      }

      for (Slot var7 : param1) {
         int var8 = var7.index;
         if (9 <= var8 && var8 < 45) {
            if (var7.hasItem()) {
               ItemStack var9 = var7.getItem();
               Intrinsics.checkNotNullExpressionValue(var9, "getItem(...)");
               if (Intrinsics.areEqual(var9.getItem(), Items.CYAN_STAINED_GLASS)) {
                  Pair<Integer, Integer> var12 = this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
                  boolean var13 = false;
                  boolean var10 = var12 != null && (var7.index == var12.getFirst() || var7.index == var12.getSecond());
                  if (var10) {
                     ItemStack var11 = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll.get(var7.index);
                     if (var11 != null) {
                        try {
                           int var14 = var7.getContainerSlot();
                           var7.container.setItem(var14, var11.copy());
                        } catch (Exception var15) {
                           continue;
                        }
                     }
                  }
               }
            }
         }
      }

      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.clear();
      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.addAll(var3);

      for (java.util.Map.Entry<Integer, Integer> var7 : this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.entrySet()) {
         int var8 = var7.getKey();
         int var9 = var7.getValue();
         int var10 = this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI != null && (var8 == this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI.getFirst() || var8 == this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI.getSecond()) ? -2130706688 : -2147418368;
         var4.add(new lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(var8, var10));
      }

      lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a("superpairs", var4);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[16];
      int var3 = 0;
      String var2 = "\u0010¸o¶\u009bt\nÁ\u001e\u008bý¹W3ÑxÓ\u000eaM«#ãØëÔè{\bùòí\u000e\u009db4Æ\u0010d\u0095C'\u0089ñ§Í&\u0010+ã0oYóZ>Ö#ï\nje\u0088\u0099\u0011\u0095ªñÇö\tÖ,Uæ©±/:=â³\u0005\u0096£ \"m\u0005ÙII\u007fP\u0015\u0017\u001cI¯@\u000fô\u0091V¤\u0006ÏÔ\u0019ó\b\u0099\u001e\u007f5«\fßpl0Eî¬æ\u008b5íW\nµ\u0010\u0005<ho\tÖ?3\bÖ\u0081ûQoxqá\f\u0091Ã\u0013x([Ë¦¶\t\u0093'\fo\u0088Ì\u0011Óv´\u0003Y½n±";
      int var4 = "\u0010¸o¶\u009bt\nÁ\u001e\u008bý¹W3ÑxÓ\u000eaM«#ãØëÔè{\bùòí\u000e\u009db4Æ\u0010d\u0095C'\u0089ñ§Í&\u0010+ã0oYóZ>Ö#ï\nje\u0088\u0099\u0011\u0095ªñÇö\tÖ,Uæ©±/:=â³\u0005\u0096£ \"m\u0005ÙII\u007fP\u0015\u0017\u001cI¯@\u000fô\u0091V¤\u0006ÏÔ\u0019ó\b\u0099\u001e\u007f5«\fßpl0Eî¬æ\u008b5íW\nµ\u0010\u0005<ho\tÖ?3\bÖ\u0081ûQoxqá\f\u0091Ã\u0013x([Ë¦¶\t\u0093'\fo\u0088Ì\u0011Óv´\u0003Y½n±"
         .length();
      char var1 = 6;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 72;
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
                     case 0 -> 79;
                     case 1 -> 78;
                     case 2 -> 118;
                     case 3 -> 8;
                     case 4 -> 75;
                     case 5 -> 17;
                     default -> 113;
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
                     f = var5;
                     g = new String[16];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IIIlIIllIIllIIIlIIllIIIllIIlIllIlllIIIlIlIIIIIlllIIllIIIllIllIIIIlIIIIIIlIIlIIIlIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = new IIIlIIllIIllIIIlIIllIIIllIIlIllIlllIIIlIlIIIIIlllIIllIIIllIllIIIIlIIIIIIlIIlIIIlIlIll();
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

                  var2 = "»æ(tÊ (\u0080!w[\u0097>öB(hëù«oiÙ\u0086oÀ«N^;¡\u0017Ð\u0015j¸6(3\u0000áì\u000f\u008bï4¯\u0019Ý]å]\u009ffl«û\u0094\u0084\u009cÄþ\fN\u00926\u009eJ\u0004¹\u0010â9";
                  var4 = "»æ(tÊ (\u0080!w[\u0097>öB(hëù«oiÙ\u0086oÀ«N^;¡\u0017Ð\u0015j¸6(3\u0000áì\u000f\u008bï4¯\u0019Ý]å]\u009ffl«û\u0094\u0084\u009cÄþ\fN\u00926\u009eJ\u0004¹\u0010â9"
                     .length();
                  var1 = 'D';
                  var8 = -1;
            }

            var10000 = 30;
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
      int var2 = (var0 ^ 31669) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 249;
            case 1 -> 158;
            case 2 -> 197;
            case 3 -> 240;
            case 4 -> 141;
            case 5 -> 185;
            case 6 -> 78;
            case 7 -> 129;
            case 8 -> 153;
            case 9 -> 96;
            case 10 -> 99;
            case 11 -> 118;
            case 12 -> 178;
            case 13 -> 207;
            case 14 -> 194;
            case 15 -> 4;
            case 16 -> 103;
            case 17 -> 114;
            case 18 -> 87;
            case 19 -> 228;
            case 20 -> 16;
            case 21 -> 80;
            case 22 -> 25;
            case 23 -> 56;
            case 24 -> 2;
            case 25 -> 82;
            case 26 -> 195;
            case 27 -> 231;
            case 28 -> 200;
            case 29 -> 70;
            case 30 -> 206;
            case 31 -> 215;
            case 32 -> 44;
            case 33 -> 188;
            case 34 -> 1;
            case 35 -> 246;
            case 36 -> 85;
            case 37 -> 54;
            case 38 -> 89;
            case 39 -> 255;
            case 40 -> 248;
            case 41 -> 26;
            case 42 -> 180;
            case 43 -> 39;
            case 44 -> 236;
            case 45 -> 160;
            case 46 -> 90;
            case 47 -> 128;
            case 48 -> 163;
            case 49 -> 101;
            case 50 -> 40;
            case 51 -> 152;
            case 52 -> 74;
            case 53 -> 120;
            case 54 -> 149;
            case 55 -> 71;
            case 56 -> 137;
            case 57 -> 27;
            case 58 -> 21;
            case 59 -> 225;
            case 60 -> 220;
            case 61 -> 67;
            case 62 -> 244;
            case 63 -> 211;
            case 64 -> 76;
            case 65 -> 95;
            case 66 -> 59;
            case 67 -> 48;
            case 68 -> 144;
            case 69 -> 130;
            case 70 -> 241;
            case 71 -> 9;
            case 72 -> 145;
            case 73 -> 18;
            case 74 -> 84;
            case 75 -> 64;
            case 76 -> 15;
            case 77 -> 93;
            case 78 -> 203;
            case 79 -> 177;
            case 80 -> 115;
            case 81 -> 86;
            case 82 -> 98;
            case 83 -> 127;
            case 84 -> 123;
            case 85 -> 75;
            case 86 -> 105;
            case 87 -> 201;
            case 88 -> 187;
            case 89 -> 175;
            case 90 -> 196;
            case 91 -> 53;
            case 92 -> 62;
            case 93 -> 5;
            case 94 -> 34;
            case 95 -> 247;
            case 96 -> 166;
            case 97 -> 0;
            case 98 -> 132;
            case 99 -> 43;
            case 100 -> 42;
            case 101 -> 37;
            case 102 -> 28;
            case 103 -> 162;
            case 104 -> 189;
            case 105 -> 63;
            case 106 -> 210;
            case 107 -> 20;
            case 108 -> 41;
            case 109 -> 36;
            case 110 -> 61;
            case 111 -> 24;
            case 112 -> 254;
            case 113 -> 91;
            case 114 -> 250;
            case 115 -> 73;
            case 116 -> 222;
            case 117 -> 171;
            case 118 -> 234;
            case 119 -> 174;
            case 120 -> 182;
            case 121 -> 46;
            case 122 -> 184;
            case 123 -> 45;
            case 124 -> 104;
            case 125 -> 57;
            case 126 -> 83;
            case 127 -> 31;
            case 128 -> 161;
            case 129 -> 227;
            case 130 -> 239;
            case 131 -> 14;
            case 132 -> 190;
            case 133 -> 181;
            case 134 -> 49;
            case 135 -> 243;
            case 136 -> 202;
            case 137 -> 253;
            case 138 -> 229;
            case 139 -> 79;
            case 140 -> 108;
            case 141 -> 19;
            case 142 -> 125;
            case 143 -> 159;
            case 144 -> 72;
            case 145 -> 151;
            case 146 -> 157;
            case 147 -> 242;
            case 148 -> 3;
            case 149 -> 213;
            case 150 -> 126;
            case 151 -> 68;
            case 152 -> 176;
            case 153 -> 88;
            case 154 -> 199;
            case 155 -> 29;
            case 156 -> 134;
            case 157 -> 102;
            case 158 -> 23;
            case 159 -> 224;
            case 160 -> 192;
            case 161 -> 122;
            case 162 -> 139;
            case 163 -> 106;
            case 164 -> 55;
            case 165 -> 117;
            case 166 -> 69;
            case 167 -> 168;
            case 168 -> 133;
            case 169 -> 97;
            case 170 -> 10;
            case 171 -> 214;
            case 172 -> 131;
            case 173 -> 12;
            case 174 -> 237;
            case 175 -> 218;
            case 176 -> 13;
            case 177 -> 156;
            case 178 -> 58;
            case 179 -> 217;
            case 180 -> 252;
            case 181 -> 245;
            case 182 -> 232;
            case 183 -> 111;
            case 184 -> 51;
            case 185 -> 165;
            case 186 -> 112;
            case 187 -> 124;
            case 188 -> 138;
            case 189 -> 198;
            case 190 -> 100;
            case 191 -> 155;
            case 192 -> 135;
            case 193 -> 221;
            case 194 -> 226;
            case 195 -> 148;
            case 196 -> 8;
            case 197 -> 107;
            case 198 -> 169;
            case 199 -> 7;
            case 200 -> 251;
            case 201 -> 33;
            case 202 -> 208;
            case 203 -> 92;
            case 204 -> 143;
            case 205 -> 219;
            case 206 -> 77;
            case 207 -> 113;
            case 208 -> 170;
            case 209 -> 205;
            case 210 -> 191;
            case 211 -> 179;
            case 212 -> 186;
            case 213 -> 164;
            case 214 -> 22;
            case 215 -> 30;
            case 216 -> 204;
            case 217 -> 65;
            case 218 -> 38;
            case 219 -> 230;
            case 220 -> 66;
            case 221 -> 193;
            case 222 -> 47;
            case 223 -> 60;
            case 224 -> 233;
            case 225 -> 167;
            case 226 -> 154;
            case 227 -> 223;
            case 228 -> 119;
            case 229 -> 109;
            case 230 -> 32;
            case 231 -> 52;
            case 232 -> 212;
            case 233 -> 235;
            case 234 -> 11;
            case 235 -> 172;
            case 236 -> 140;
            case 237 -> 110;
            case 238 -> 183;
            case 239 -> 6;
            case 240 -> 147;
            case 241 -> 209;
            case 242 -> 50;
            case 243 -> 116;
            case 244 -> 142;
            case 245 -> 94;
            case 246 -> 136;
            case 247 -> 238;
            case 248 -> 173;
            case 249 -> 35;
            case 250 -> 81;
            case 251 -> 150;
            case 252 -> 216;
            case 253 -> 17;
            case 254 -> 121;
            default -> 146;
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

         g[var2] = new String(var3).intern();
      }

      return g[var2];
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final IIIlIIllIIllIIIlIIllIIIllIIlIllIlllIIIlIlIIIIIlllIIllIIIllIllIIIIlIIIIIIlIIlIIIlIlIll a() {
         return IIIlIIllIIllIIIlIIllIIIllIIlIllIlllIIIlIlIIIIIlllIIllIIIllIllIIIIlIIIIIIlIIlIIIlIlIll.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
      }
   }

  // PX-FIX synth restored from jar bytecode
  // PX-FIX synth restored from jar bytecode: getstatic + return
  public static me.octo.client.IIIlIIllIIllIIIlIIllIIIllIIlIllIlllIIIlIlIIIIIlllIIllIIIllIllIIIIlIIIIIIlIIlIIIlIlIll ah() { return lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll; }
}
