package me.octo.client.utils.player;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatchGroupCollection;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import net.minecraft.ChatFormatting;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.component.ItemLore;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI
   extends me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   public static <T> T a(Object p0, Object p1) { return null; } // PX-FIX ovld

   public static <T> T b(Object p0, Object p1) { return null; } // PX-FIX ovld

   @NotNull
   public static IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static String IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private static String lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private static List<String> IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private static List<String> llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private static List<String> lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private static List<String> lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private static List<String> lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private static List<String> lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private static List<String> IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private static List<String> llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @NotNull
   private static Regex IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static int[] IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static String[] c;
   private static String[] d;

   private IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI() {
   }

   @NotNull
   public final List<String> g() {
      return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   @NotNull
   public final List<String> h() {
      return lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   @NotNull
   public final List<String> i() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   @NotNull
   public final List<String> j() {
      return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   @NotNull
   public final List<String> k() {
      return lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   }

   @NotNull
   public final List<String> l() {
      return IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   }

   @NotNull
   public final List<String> m() {
      return llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   }

   @NotNull
   public final CompoundTag a(@NotNull ItemStack var1) {
      short var10001 = 19997;
      short var10002 = -37;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      CompoundTag var10000 = var1.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag();
      var10002 = 20189;
      short var10003 = -4432;
      Intrinsics.checkNotNullExpressionValue(var10000, "copyTag(...)");
      return var10000;
   }

   @NotNull
   public final String b(@NotNull ItemStack var1) {
      short var10001 = 19997;
      short var10002 = -37;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      CompoundTag var10000 = this.a(var1);
      var10001 = 20155;
      var10002 = 8860;
      String var2 = var10000.getStringOr("id", "");
      var10002 = 20018;
      short var10003 = -1014;
      Intrinsics.checkNotNullExpressionValue(var2, "getStringOr(...)");
      return var2;
   }

   @NotNull
   public final String a(@NotNull CompoundTag var1) {
      short var10001 = 19997;
      short var10002 = -37;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      var10001 = 20004;
      var10002 = -14055;
      String var10000 = var1.getStringOr("id", "");
      var10002 = 20215;
      short var10003 = 15363;
      Intrinsics.checkNotNullExpressionValue(var10000, "getStringOr(...)");
      return var10000;
   }

   @NotNull
   public final String c(@NotNull ItemStack var1) {
      short var10001 = 19997;
      short var10002 = -37;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      CompoundTag var10000 = this.a(var1);
      var10001 = 20139;
      var10002 = 15227;
      String var2 = var10000.getStringOr("uuid", "");
      var10002 = 20018;
      short var10003 = -1014;
      Intrinsics.checkNotNullExpressionValue(var2, "getStringOr(...)");
      return var2;
   }

   @NotNull
   public final List<Component> d(@NotNull ItemStack var1) {
      short var10001 = 19997;
      short var10002 = -37;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      List var10000 = var1.getOrDefault(DataComponents.LORE, ItemLore.EMPTY).styledLines();
      var10002 = 20097;
      short var10003 = 18192;
      Intrinsics.checkNotNullExpressionValue(var10000, "styledLines(...)");
      return var10000;
   }

   @NotNull
   public final List<String> e(@NotNull ItemStack var1) { Component var10 = null; // PX-FIX hoist
        
      Collection var13 = null; // PX-FIX
      short var10001 = 20040;
      short var10002 = -4626;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      Iterable var3 = this.d(var1);
      boolean var4 = false;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      Collection var6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var3, 10));
      boolean var7 = false;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      Iterator var8 = var3.iterator();

      while (true) {
         if (var8.hasNext()) {
            Object var9 = var8.next();
            var13 = var6;
             var10 = (Component)var9;
            if (var2 == null) {
               break;
            }

            boolean var11 = false;
            var6.add(var10.getString());
            if (var2 != null) {
               continue;
            }
         }

         var13 = var6;
         break;
      }

      return (List<String>)var13;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Nullable
   public final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll f(
      @NotNull ItemStack var1
   ) { IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var10 = null; // PX-FIX hoist
        
      short var10001 = 19997;
      byte var10002 = -37;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      List var3 = this.e(var1);
      int var4 = var3.size() + -1;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      int var12 = 0;
      if (var2 != null) {
         if (0 > var4) {
            return null;
         }

         var12 = var4;
      }

      while (true) {
         int var5 = var12;
         var4--;
         MatchResult var13 = IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.find((CharSequence)var3.get(var5), 0);
         if (var13 != null) {
            MatchGroupCollection var14 = var13.getGroups();
            if (var14 != null) {
               MatchGroup var15 = var14.get(1);
               if (var15 != null) {
                  String var16 = var15.getValue();
                  if (var16 != null) {
                     String var6 = var16;

                     label30:
                     for (Object var9 : (Iterable)IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e()) {
                        var10000 = (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[])var9;

                        do {
                            var10 = (IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var9;
                           boolean var11 = false;
                           if (!Intrinsics.areEqual(var10.a(), var6)) {
                              continue label30;
                           }

                           var10000 = (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[])var9;
                        } while (var2 == null);

                        return (IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var9;
                     }

                     return (IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)null;
                  }
               }
            }
         }

         if (0 > var4) {
            return null;
         }

         var12 = var4;
      }
   }

   @Nullable
   public final String g(@Nullable ItemStack var1) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      Object var10000 = var1;
      if (var2 != null) {
         if (var1 == null) {
            return null;
         }

         var10000 = var1;
      }

      if (var2 != null) {
         if (((me.octo.client.PXDyn)var10000).isEmpty()) {
            return null;
         }

         var10000 = var1.get(DataComponents.CUSTOM_DATA);
      }

      var10000 = (CustomData)var10000;
      if ((CustomData)var10000 == null) {
         return null;
      } else {
         CustomData var3 = (CustomData)var10000;
         var10000 = var3.copyTag();
         short var10002 = 20031;
         short var10003 = 19760;
         Intrinsics.checkNotNullExpressionValue(var10000, "copyTag(...)");
         CompoundTag var4 = (CompoundTag)var10000;
         short var10001 = 20221;
         var10002 = 11486;
         kotlin.jvm.functions.Function1<CompoundTag, Optional> var10004 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI::b;
         return (String)var4.getCompound("ExtraAttributes")
            .<String>flatMap((java.util.function.Function)(var10005 -> a(var10004, var10005)))
            .orElse(null);
      }
   }

   @Nullable
   public final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
      @NotNull String var1
   ) { me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var10 = null; // PX-FIX hoist
        
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      short var10002 = 20068;
      short var10003 = -30414;
      Intrinsics.checkNotNullParameter(var1, "name");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      if (var2 != null) {
         LocalPlayer var7 = this.a().player;
         if (var7 != null) {
            Inventory var8 = var7.getInventory();
            if (var8 != null) {
               Inventory var3 = var8;
               int var4 = 0;

               while (var4 < 9) {
                  ItemStack var9 = var3.getItem(var4);
                  var10002 = 20065;
                  var10003 = -30680;
                  Intrinsics.checkNotNullExpressionValue(var9, "getItem(...)");
                  ItemStack var5 = var9;
                  label28:
                  if (var2 != null) {
                     if (!var5.isEmpty()) {
                         var10 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                        String var10001 = var5.getHoverName().getString();
                        var10003 = 20079;
                        short var10004 = 10269;
                        Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
                        String var6 = var10.a(var10001);
                        if (var2 == null) {
                           break label28;
                        }

                        if (StringsKt.contains(var6, var1, true)) {
                           return new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                              var5, var4, this.h(var5)
                           );
                        }
                     }

                     var4++;
                  }

                  if (var2 == null) {
                     break;
                  }
               }

               return null;
            }
         }
      }

      return null;
   }

   @Nullable
   public final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
      @NotNull List<String> var1
   ) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      short var10002 = 20027;
      short var10003 = 11868;
      Intrinsics.checkNotNullParameter(var1, "names");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      if (var2 != null) {
         LocalPlayer var13 = this.a().player;
         if (var13 != null) {
            Inventory var14 = var13.getInventory();
            if (var14 != null) {
               Inventory var3 = var14;
               int var4 = 0;

               label52:
               while (true) {
                  int var15 = var4;

                  label50:
                  while (var15 < 9) {
                     ItemStack var16 = var3.getItem(var4);
                     var10002 = 20158;
                     var10003 = -12485;
                     Intrinsics.checkNotNullExpressionValue(var16, "getItem(...)");
                     ItemStack var5 = var16;
                     if (var2 != null) {
                        if (!var5.isEmpty()) {
                           me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var17 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                           String var10001 = var5.getHoverName().getString();
                           var10003 = 20133;
                           short var10004 = 29744;
                           Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
                           String var6 = var17.a(var10001);
                           Iterable var7 = var1;
                           boolean var8 = false;

                           for (Object var10 : var7) {
                              String var11 = (String)var10;
                              boolean var12 = false;
                              if (var2 != null) {
                                 var15 = ((StringsKt.contains(var6, var11, true)) ? 1 : 0);
                                 if (var2 == null) {
                                    continue label50;
                                 }

                                 if (var15 != 0) {
                                    return new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                                       var5, var4, IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.h(var5)
                                    );
                                 }
                              }

                              if (var2 == null) {
                                 break;
                              }
                           }
                        }

                        var4++;
                     }

                     if (var2 == null) {
                        return null;
                     }
                     continue label52;
                  }

                  return null;
               }
            }
         }
      }

      return null;
   }

   public final int b(@NotNull String var1) {
       int var10 = 0; // PX-FIX decl var10
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      short var10002 = 20002;
      short var10003 = 29300;
      Intrinsics.checkNotNullParameter(var1, "name");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      if (var2 != null) {
         LocalPlayer var7 = this.a().player;
         if (var7 != null) {
            Inventory var8 = var7.getInventory();
            if (var8 != null) {
               Inventory var3 = var8;
               int var4 = 0;

               while (true) {
                  if (var4 < 9) {
                     ItemStack var9 = var3.getItem(var4);
                     var10002 = 20065;
                     var10003 = -30680;
                     Intrinsics.checkNotNullExpressionValue(var9, "getItem(...)");
                     ItemStack var5 = var9;
                     label31:
                     if (var2 != null) {
                        var10 = (int)(var5.isEmpty() ? 1 : 0);
                        if (var2 == null) {
                           break;
                        }

                        if (var10 == 0) {
                           me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var11 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                           String var10001 = var5.getHoverName().getString();
                           var10003 = 20079;
                           short var10004 = 10269;
                           Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
                           String var6 = var11.a(var10001);
                           if (var2 == null) {
                              break label31;
                           }

                           if (StringsKt.contains(var6, var1, true)) {
                              return var5.getCount();
                           }
                        }

                        var4++;
                     }

                     if (var2 != null) {
                        continue;
                     }
                  }

                  var10 = 0;
                  break;
               }

               return var10;
            }
         }
      }

      return 0;
   }

   public final void b(int var1) {
      LocalPlayer var10000 = this.a().player;
      if (var10000 != null) {
         Inventory var2 = var10000.getInventory();
         if (var2 != null) {
            var2.setSelectedSlot(var1);
         }
      }
   }

   public final boolean c(@NotNull String var1) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      short var10002 = 20068;
      short var10003 = -30414;
      Intrinsics.checkNotNullParameter(var1, "name");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      if (var2 != null) {
         LocalPlayer var4 = this.a().player;
         if (var4 != null) {
            ItemStack var5 = var4.getMainHandItem();
            if (var5 != null) {
               ItemStack var3 = var5;
               me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var6 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
               String var10001 = var3.getHoverName().getString();
               var10003 = 20079;
               short var10004 = 10269;
               Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
               return StringsKt.contains(var6.a(var10001), var1, true);
            }
         }
      }

      return false;
   }

   @Nullable
   public final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
      boolean var1
   ) { String var10 = null; // PX-FIX hoist
        
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      if (var2 != null) {
         LocalPlayer var10000 = this.a().player;
         if (var10000 != null) {
            Inventory var6 = var10000.getInventory();
            if (var6 != null) {
               Inventory var3 = var6;
               int var4 = 0;

               while (var4 < 9) {
                  ItemStack var7 = var3.getItem(var4);
                  short var10002 = 20065;
                  short var10003 = -30680;
                  Intrinsics.checkNotNullExpressionValue(var7, "getItem(...)");
                  ItemStack var5 = var7;
                  if (var2 != null) {
                     label40:
                     if (!var5.isEmpty()) {
                        boolean var8 = var5.is(Items.FISHING_ROD);
                        if (var2 != null) {
                           if (!var8) {
                              break label40;
                           }

                           var8 = var1;
                        }

                        if (var2 != null) {
                           if (!var8) {
                              return new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                                 var5,
                                 var4,
                                 IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                              );
                           }

                           me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var9 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                           String var10001 = var5.getHoverName().getString();
                           var10003 = 20079;
                           short var10004 = 10269;
                           Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
                            var10 = var9.a(var10001).toLowerCase(Locale.ROOT);
                           var10002 = 20078;
                           var10003 = 29166;
                           Intrinsics.checkNotNullExpressionValue(var10, "toLowerCase(...)");
                           CharSequence var11 = var10;
                           short var12 = 19989;
                           var10002 = 24437;
                           var8 = StringsKt.contains(var11, "rod", false);
                        }

                        if (var8) {
                           return new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                              var5,
                              var4,
                              IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                           );
                        }
                     }

                     var4++;
                  }

                  if (var2 == null) {
                     break;
                  }
               }

               return null;
            }
         }
      }

      return null;
   }

   @Nullable
   public final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll b(
      @NotNull List<String> var1
   ) { Inventory var10 = null; // PX-FIX hoist
        
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      short var10002 = 20152;
      short var10003 = -15257;
      Intrinsics.checkNotNullParameter(var1, "names");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      if (var2 != null) {
         LocalPlayer var9 = this.a().player;
         if (var9 != null) {
             var10 = var9.getInventory();
            if (var10 != null) {
               Inventory var3 = var10;
               int var4 = 0;

               while (var4 < 8) {
                  Iterator var5 = var1.iterator();

                  label41:
                  while (true) {
                     boolean var11 = var5.hasNext();

                     label39:
                     while (var11) {
                        Object var12 = var5.next();

                        do {
                           String var6 = (String)var12;
                           ItemStack var13 = var3.getItem(var4);
                           var10002 = 20065;
                           var10003 = -30680;
                           Intrinsics.checkNotNullExpressionValue(var13, "getItem(...)");
                           ItemStack var7 = var13;
                           var11 = var7.isEmpty();
                           if (var2 == null) {
                              continue label39;
                           }

                           if (var11) {
                              continue label41;
                           }

                           me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var14 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                           String var10001 = var7.getHoverName().getString();
                           var10003 = 20079;
                           short var10004 = 10269;
                           Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
                           String var8 = var14.a(var10001);
                           if (!StringsKt.contains(var8, var6, true)) {
                              continue label41;
                           }

                           var12 = new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                              var7, var4, this.h(var7)
                           );
                        } while (var2 == null);

                        return (IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var12;
                     }

                     var4++;
                     if (var2 == null) {
                        return null;
                     }
                     break;
                  }
               }

               return null;
            }
         }
      }

      return null;
   }

   @Nullable
   public final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll c(
      @NotNull List<String> var1
   ) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      short var10002 = 20161;
      short var10003 = -24576;
      Intrinsics.checkNotNullParameter(var1, "skyblockIds");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      LocalPlayer var7 = this.a().player;
      Intrinsics.checkNotNull(var7);
      Inventory var8 = var7.getInventory();
      var10002 = 20205;
      var10003 = -22589;
      Intrinsics.checkNotNullExpressionValue(var8, "getInventory(...)");
      Inventory var3 = var8;
      int var4 = 0;

      while (var4 < 8) {
         ItemStack var9 = var3.getItem(var4);
         var10002 = 20065;
         var10003 = -30680;
         Intrinsics.checkNotNullExpressionValue(var9, "getItem(...)");
         ItemStack var5 = var9;
         label23:
         if (var2 != null) {
            if (!var5.isEmpty()) {
               String var6 = this.g(var5);
               if (var2 == null) {
                  break label23;
               }

               if (CollectionsKt.contains(var1, var6)) {
                  return new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     var5, var4, this.h(var5)
                  );
               }
            }

            var4++;
         }

         if (var2 == null) {
            break;
         }
      }

      return null;
   }

   private final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll d(
      List<? extends Item> var1
   ) { Item var10 = null; // PX-FIX hoist
        
      boolean var15 = false; // PX-FIX
      Object var14 = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      if (var2 != null) {
         LocalPlayer var10000 = this.a().player;
         if (var10000 != null) {
            Inventory var12 = var10000.getInventory();
            if (var12 != null) {
               Inventory var3 = var12;
               int var4 = 0;

               while (var4 < 8) {
                  ItemStack var13 = var3.getItem(var4);
                  short var10002 = 20065;
                  short var10003 = -30680;
                  Intrinsics.checkNotNullExpressionValue(var13, "getItem(...)");
                  ItemStack var5 = var13;
                  if (var2 != null) {
                     if (!var5.isEmpty()) {
                        label74: {
                           var var6 = var1;
                           boolean var7 = false;
                           var14 = var6;
                           label55:
                           if (var2 != null) {
                              if (var6 instanceof Collection) {
                                 var14 = (Collection)var6;
                                 if (var2 == null) {
                                    break label55;
                                 }

                                 if (((me.octo.client.PXDyn)var14).isEmpty()) {
                                    var15 = false;
                                    break label74;
                                 }
                              }

                              var14 = var6;
                           }

                           Iterator var8 = ((me.octo.client.PXDyn)var14).iterator();

                           label46:
                           while (true) {
                              if (!var8.hasNext()) {
                                 var15 = false;
                                 break;
                              }

                              Object var9 = var8.next();
                               var10 = (Item)var9;
                              boolean var11 = false;
                              var15 = var5.is(var10);

                              while (var15) {
                                 var15 = true;
                                 if (var2 != null) {
                                    break label46;
                                 }
                              }
                           }
                        }

                        if (var15) {
                           return new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                              var5, var4, this.h(var5)
                           );
                        }
                     }

                     var4++;
                  }

                  if (var2 == null) {
                     break;
                  }
               }

               return null;
            }
         }
      }

      return null;
   }

   @Nullable
   public final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll d(
      @NotNull String var1
   ) { Component var10 = null; // PX-FIX hoist
        
      boolean var16 = false; // PX-FIX
      Object var15 = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      short var10002 = 19969;
      short var10003 = 28876;
      Intrinsics.checkNotNullParameter(var1, "line");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      if (var2 != null) {
         LocalPlayer var12 = this.a().player;
         if (var12 != null) {
            Inventory var13 = var12.getInventory();
            if (var13 != null) {
               Inventory var3 = var13;
               int var4 = 0;

               while (var4 < 8) {
                  ItemStack var14 = var3.getItem(var4);
                  var10002 = 20065;
                  var10003 = -30680;
                  Intrinsics.checkNotNullExpressionValue(var14, "getItem(...)");
                  ItemStack var5 = var14;
                  if (var2 != null) {
                     if (!var5.isEmpty()) {
                        label74: {
                           var var6 = this.d(var5);
                           boolean var7 = false;
                           var15 = var6;
                           label55:
                           if (var2 != null) {
                              if (var6 instanceof Collection) {
                                 var15 = (Collection)var6;
                                 if (var2 == null) {
                                    break label55;
                                 }

                                 if (((me.octo.client.PXDyn)var15).isEmpty()) {
                                    var16 = false;
                                    break label74;
                                 }
                              }

                              var15 = var6;
                           }

                           Iterator var8 = ((me.octo.client.PXDyn)var15).iterator();

                           label46:
                           while (true) {
                              if (!var8.hasNext()) {
                                 var16 = false;
                                 break;
                              }

                              Object var9 = var8.next();
                               var10 = (Component)var9;
                              boolean var11 = false;
                              me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var17 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                              String var10001 = var10.getString();
                              var10003 = 20079;
                              short var10004 = 10269;
                              Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
                              var16 = StringsKt.contains(var17.a(var10001), var1, true);

                              while (var16) {
                                 var16 = true;
                                 if (var2 != null) {
                                    break label46;
                                 }
                              }
                           }
                        }

                        if (var16) {
                           return new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                              var5, var4, this.h(var5)
                           );
                        }
                     }

                     var4++;
                  }

                  if (var2 == null) {
                     break;
                  }
               }

               return null;
            }
         }
      }

      return null;
   }

   private final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI h(
      ItemStack var1
   ) {
      Object var27 = null; // PX-FIX
      Object var25 = null; // PX-FIX
      Object var22 = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2;
      String var3;
      boolean var23;
      label117: {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var10001 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         String var10002 = var1.getHoverName().getString();
         short var10004 = 20079;
         short var10005 = 10269;
         Intrinsics.checkNotNullExpressionValue(var10002, "getString(...)");
         var3 = var10001.a(var10002);
         var2 = var10000;
         var var4 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
         boolean var5 = false;
         var22 = var4;
         label113:
         if (var2 != null) {
            if (var4 instanceof Collection) {
               var22 = (Collection)var4;
               if (var2 == null) {
                  break label113;
               }

               if (((me.octo.client.PXDyn)var22).isEmpty()) {
                  var23 = false;
                  break label117;
               }
            }

            var22 = var4;
         }

         Iterator var6 = ((me.octo.client.PXDyn)var22).iterator();

         label104:
         while (true) {
            if (!var6.hasNext()) {
               var23 = false;
               break;
            }

            Object var7 = var6.next();
            String var8 = (String)var7;
            boolean var9 = false;
            var23 = StringsKt.contains(var3, var8, true);

            while (var23) {
               var23 = true;
               if (var2 != null) {
                  break label104;
               }
            }
         }
      }

      IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var24;
      if (var23) {
         var24 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      } else {
         label119: { Object var10 = null; // PX-FIX hoist
        
             var10 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
            boolean var12 = false;
            var25 = var10;
            label90:
            if (var2 != null) {
               if (var10 instanceof Collection) {
                  var25 = (Collection)var10;
                  if (var2 == null) {
                     break label90;
                  }

                  if (((me.octo.client.PXDyn)var25).isEmpty()) {
                     var23 = false;
                     break label119;
                  }
               }

               var25 = var10;
            }

            Iterator var14 = ((me.octo.client.PXDyn)var25).iterator();

            label83:
            while (true) {
               if (!var14.hasNext()) {
                  var23 = false;
                  break;
               }

               Object var16 = var14.next();
               String var18 = (String)var16;
               boolean var20 = false;
               var23 = StringsKt.contains(var3, var18, true);

               while (var23) {
                  var23 = true;
                  if (var2 != null) {
                     break label83;
                  }
               }
            }
         }

         if (var23) {
            var24 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         } else {
            label121: {
               var var11 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
               boolean var13 = false;
               var27 = var11;
               label69:
               if (var2 != null) {
                  if (var11 instanceof Collection) {
                     var27 = (Collection)var11;
                     if (var2 == null) {
                        break label69;
                     }

                     if (((me.octo.client.PXDyn)var27).isEmpty()) {
                        var23 = false;
                        break label121;
                     }
                  }

                  var27 = var11;
               }

               Iterator var15 = ((me.octo.client.PXDyn)var27).iterator();

               label62:
               while (true) {
                  if (!var15.hasNext()) {
                     var23 = false;
                     break;
                  }

                  Object var17 = var15.next();
                  String var19 = (String)var17;
                  boolean var21 = false;
                  var23 = StringsKt.contains(var3, var19, true);

                  while (var23) {
                     var23 = true;
                     if (var2 != null) {
                        break label62;
                     }
                  }
               }
            }

            var24 = var23
               ? IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               : IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }
      }

      return var24;
   }

   @Nullable
   public final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll n() {
      short var10001 = 20099;
      short var10002 = 15084;
      return this.d("Ether Transmission");
   }

   @Nullable
   public final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll o() {
      String[] var1 = new String[2];
      short var10003 = 20037;
      short var10004 = -14225;
      var1[0] = "Aspect of the Void";
      var10003 = 20151;
      var10004 = 16488;
      var1[1] = "Aspect of the End";
      return this.b(CollectionsKt.listOf(var1));
   }

   @Nullable
   public final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll p() {
      Item[] var1 = new Item[]{Items.WOODEN_AXE, Items.STONE_AXE, Items.IRON_AXE, Items.GOLDEN_AXE, Items.DIAMOND_AXE};
      return this.d(CollectionsKt.listOf(var1));
   }

   @Nullable
   public final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll q() { Iterator var10 = null; // PX-FIX hoist
        
      boolean var20 = false; // PX-FIX
      Object var19 = null; // PX-FIX
      Object var17 = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      if (var1 != null) {
         LocalPlayer var10000 = this.a().player;
         if (var10000 != null) {
            Inventory var15 = var10000.getInventory();
            if (var15 != null) {
               Inventory var2 = var15;
               List var3 = new ArrayList();
               List var4 = new ArrayList();
               int var5 = 0;

               while (true) {
                  if (var5 < 8) {
                     ItemStack var16 = var2.getItem(var5);
                     short var10002 = 20065;
                     short var10003 = -30680;
                     Intrinsics.checkNotNullExpressionValue(var16, "getItem(...)");
                     ItemStack var6 = var16;
                     if (var1 != null) {
                        var17 = var6;
                        if (var1 == null) {
                           break;
                        }

                        if (!var6.isEmpty()) {
                           String var7;
                           label102: {
                              me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var18 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                              String var10001 = var6.getHoverName().getString();
                              var10003 = 20079;
                              short var10004 = 10269;
                              Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
                              var7 = var18.a(var10001);
                              var var8 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
                              boolean var9 = false;
                              var19 = var8;
                              label83:
                              if (var1 != null) {
                                 if (var8 instanceof Collection) {
                                    var19 = (Collection)var8;
                                    if (var1 == null) {
                                       break label83;
                                    }

                                    if (((me.octo.client.PXDyn)var19).isEmpty()) {
                                       var20 = false;
                                       break label102;
                                    }
                                 }

                                 var19 = var8;
                              }

                               var10 = ((me.octo.client.PXDyn)var19).iterator();

                              label76:
                              while (true) {
                                 if (!var10.hasNext()) {
                                    var20 = false;
                                    break;
                                 }

                                 Object var11 = var10.next();
                                 String var12 = (String)var11;
                                 boolean var13 = false;
                                 var20 = StringsKt.contains(var7, var12, true);

                                 while (var20) {
                                    var20 = true;
                                    if (var1 != null) {
                                       break label76;
                                    }
                                 }
                              }
                           }

                           if (var20) {
                              IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var14 = new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                                 var6, var5, this.h(var6)
                              );
                              CharSequence var21 = var7;
                              short var26 = 20037;
                              var10002 = -14225;
                              boolean var22 = StringsKt.contains(var21, "Aspect of the Void", true);
                              label62:
                              if (var1 != null) {
                                 if (!var22) {
                                    CharSequence var23 = var7;
                                    var26 = 20151;
                                    var10002 = 16488;
                                    boolean var24 = StringsKt.contains(var23, "Aspect of the End", true);
                                    if (var1 == null) {
                                       break label62;
                                    }

                                    if (!var24) {
                                       var3.add(var14);
                                       break label62;
                                    }
                                 }

                                 var4.add(var14);
                              }
                           }
                        }

                        var5++;
                     }

                     if (var1 != null) {
                        continue;
                     }
                  }

                  var17 = CollectionsKt.firstOrNull(var3);
                  break;
               }

               Object var25 = (IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var17;
               if (var1 != null) {
                  if (var25 != null) {
                     return (IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var25;
                  }

                  var25 = CollectionsKt.firstOrNull(var4);
               }

               return (IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var25;
            }
         }
      }

      return null;
   }

   @Nullable
   public final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll r() {
      String[] var1 = new String[5];
      short var10003 = 20134;
      short var10004 = -17821;
      var1[0] = "Radiant";
      var10003 = 20199;
      var10004 = -25663;
      var1[1] = "Mana";
      var10003 = 20147;
      var10004 = -6246;
      var1[2] = "Overflux";
      var10003 = 20149;
      var10004 = 25079;
      var1[3] = "Plasma";
      var10003 = 19972;
      var10004 = 12394;
      var1[4] = "Flare";
      return this.b(CollectionsKt.listOf(var1));
   }

   @Nullable
   public final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll s() {
      String[] var1 = new String[5];
      short var10003 = 20020;
      short var10004 = -11824;
      var1[0] = "Glacite Lantern";
      var10003 = 20072;
      var10004 = 15966;
      var1[1] = "Will-o'-wisp";
      var10003 = 20186;
      var10004 = 25221;
      var1[2] = "Titanium Lantern";
      var10003 = 20087;
      var10004 = -24192;
      var1[3] = "Mithril Lantern";
      var10003 = 20023;
      var10004 = -10857;
      var1[4] = "Dwarven Lantern";
      return this.b(CollectionsKt.listOf(var1));
   }

   @Nullable
   public final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll t() {
      String[] var1 = new String[5];
      short var10003 = 20128;
      short var10004 = -30874;
      var1[0] = "Plasmaflux";
      var10003 = 19978;
      var10004 = -31788;
      var1[1] = "Overflux";
      var10003 = 20144;
      var10004 = -30483;
      var1[2] = "Manaflux";
      var10003 = 19995;
      var10004 = -18822;
      var1[3] = "SOS Flare";
      var10003 = 20131;
      var10004 = 5746;
      var1[4] = "Alert Flare";
      return this.b(CollectionsKt.listOf(var1));
   }

   @Nullable
   public final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll u() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var10000 = this;
      short var10001 = 20187;
      short var10002 = 7180;
      List var3 = CollectionsKt.listOf("AATROX_BATPHONE");
      if (var1 != null) {
         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2 = this.c(
            var3
         );
         if (var2 != null) {
            return var2;
         }

         var10000 = this;
         var10001 = 20185;
         var10002 = -4552;
         var3 = CollectionsKt.listOf("Maddox");
      }

      return var10000.b(var3);
   }

   @Nullable
   public final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll v() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var10000 = this;
      List var10001 = llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      if (var1 != null) {
         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2 = this.c(
            llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
         );
         if (var2 != null) {
            return var2;
         }

         var10000 = this;
         short var3 = 20021;
         short var10002 = -6375;
         var10001 = CollectionsKt.listOf("Abiphone");
      }

      return var10000.b(var10001);
   }

   @Nullable
   public final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll w() {
      return this.b(lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI);
   }

   private static final CharSequence a(
      IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var0
   ) {
      short var10001 = 20105;
      short var10002 = 28696;
      Intrinsics.checkNotNullParameter(var0, "it");
      return var0.a();
   }

   private static final Optional b(CompoundTag var0) {
      short var10001 = 20155;
      short var10002 = 8860;
      return var0.getString("id");
   }

   private static final Optional a(Function1 var0, Object var1) {
      return (Optional<? extends String>)var0.invoke(var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var33 = null; // PX-FIX
      String[] var5 = new String[235];
      int var3 = 0;
      String var2 = "Éÿ\u000b;BPÜ\u009b:ã\u0016©;\u001ck¨3(5£\u001aßZ\u0099F°Cv\u0007ß¸Ú\u0082\u0015¾3N\u001cBÄ*L\u009eÖ \u0089gÂîZÀ\u001c âE\u000bê\nX\u0084µÇ8\u0000\u0096\u009a¬\u0015vµçº×\tÇr^ìeYr&òA\u0087\u009bw]ú\u000e\u0083\u0014\u0086N]É\nÛ\u001cùp?\u0080\u0017\u0007»\u0018\u0002qÊOR\u0016ú)üV\b¥å-9('£ÿn\u008e\u0016®u\u0096Y\u0086\u001c\u00134ón»%dò\u008ek¤Û>{\u0091E\u001f÷^\u001b\u0015àq5\"\u008d\u001a\u008c\u00107 HÐ×\u0017^}\u0006J\u00ad\u00929\u0010\u001cÚ³\"\u0015g{\u00927îí%Ù\u0082Ï(\u0004_¶P?\u000b\u0010=^ÃLùRõqWR\u0013\u008a\u0017xî$\u0083¹#\u0091Ø\u0099\u001dG]¹Ý\u0091¹.\bsnb´Ñ\u0098Û\u008a\u000f\u009fæÇ±j=\u0086\u0006[\u0097\u0004gÞÑ\u0088\bè\b\u009e{\u0015\u0005O\u0089\u0010>ñý'\u0095Ó2îjõ\u00986\u0010\u009f7¥\rË\u00ad¾Éíö\u0006\u008dðë\u001e\u0095n\bbÅ\u0086$|\u009fbÚ\u0010±ÀEì¥ÄÐ\u008d4\u0090\u0011¤\u0015Upi\u0006\u0089v\u0003\nCv\u0007gÚøb\u0087^î\u0011L¯\u0099Û-\u008d¸\u0094+9íhiz\u0011{¢\u0005\\×L\u00849\u0016\u001d\u0091ø(>\u0010Xÿ¼Ú^O%\u0088\u0087\u0089åÜì\u0086D\u0086\u0016@µ!º\u000f\tÜr=ò\fGãåü$\u0083\u0095\u0092\u0004\u0088\u0011\u0002\u001a¤\u0015`á\u0095F9\u008fE%sû\u009d,Ðv\u0018Ì\u001eÎ{¸>\u0015MEbDû±ÙaÆ¨Ø³\u0000lq^Wu\u0002_Ó\f3´\u0090@\u009fFV\u0099Z9Øæ\nò\u0002û²)³2\u0011\u001a£\r\u001f\u0095\u000b¢\u0085DkÈTP§7 \u0010T3ç¦Ì\u001a.r\u0010f\u0084.èôh\"\u0010$ç´\u0085õ\u0093g\f´=\u009d_×Í\u000eÁ\u0012\fÚ\r\u0092µðìø\\DãEC)ï/\u0086\u0099\u0012\u0089°\u0018\u001a(\u001d8ð¡¢\u009fR\u0087¦¸á\u0098H\u000b\u0010\u0081t\u0091c\u0082Ä³°\u0094¦\r\u009eå;¬\u0083\u0085«ðLW¤×@\u0016\u009eCp\u001b\u0099\f×\u0018\u007f\u008eïwæô\u00adEÊ\u001f\u001a\u0013\u0017²\u0004\u0094÷)\u0017\u0002GË\f?É]Btg\u0010\u0019×\u0000Bú\f\u001bÁêKÅH·)ØtÑ¦\fÄ³íÀ\u0017\u0018´)»zÊª\u0012OÃÀt3Ð[IÍ\u0095\u0012«6f\u008f\u0099Y=\u0012ñu\u0017¢É\n\u0004\u0012&þoÆ\u008fÕk1#\\\u0016\r$\u0002÷×\u0091\u001e«FøÈ¹\u0002-1~YxhÿY/\u0011\\\u0085~ÇÐ<~Üè!ç2-$Mf\u008b\u0011¾\u0094+\"U\u0086mFWµUÂ¤<\bm$\u0017^ú¼©P_ÿ²$\u0012Bm\u008b\u0093\u0091h\u008a\u0016k¦1\u001ap\u0012¥\r\u0013\u0014e¤ïr&\u0017º ¶U\u0016Vâ&\b¾µ.Æ^çÆ\u0015\r\bôl0B_\u008b¸AN&V¤\u0011\u0086\u0088·ë#\u009e\u009bZ\u008eþÂ>=|qû\r\n¾\u0012+ò\u0002®!3±\u0089\u000f\u008fkU`\u008b¢á\u0014\u000eÝ\u0080N\u0005nI\u0002Ó\u0010\u000b\u009d\u000e\u009aÓwù#a\u000f*T\u000f\u008bµ\u0007\u0013M\u00134;m,Y`-\u009e\"\u0011\u009f\u009eÚßp¥3çÀ@³\u0007\u001a4\u0019¥\u0089\u0014\u001d!\u008a(z[r8è¥³p¨\u0003»øó\u0016[h\u000b2 z³¦\u0012Ð¡2Öö\u0007@FO\u001eU R\u0019¹?\bZ\u0090,X4\u009c3\u0088Ï\u007f_{COÅz¾DH\u0098~m\u0013\u0011\u001b\u000boJ³t%(\u0018®\u0005¡Ab±\u0013N£\fZ\u000f\u0012\u00ad`d×S×5GC\u0011\u0002·iú\u0006\u0001ýs\u0019Ò\u0088Cseî4Á\f×Xh\u009b\u0087\u0095¯¹Øh¦è\u000eO¹\u008dÝ}\u001e\\ê¸mnÀø\u0002\u0010}\u0088Âd\u0097\"+:=û¬\u0087ñÖÊ¢\u0004Ï$zþ\u000e\u0005N¡\u0007\u000e¼\u007f\u0006\tB? )\u001e\u000fBÁ\u0014AM w>\u001deoüðFH\u000e?Þ \u000f#Ä~E\u0003æv¤»9\fØ\u0007/\u009f\f\u0016Þ\u0082ö\u000fc\u0004\u0012*ªQV ¤U\b\u001be\u0087ãíYû\u000bãn\u0011\u0097\u0098\u0004Å\u0017å\u0016Ú\u0001\u009eþ+\u0080/£^¿\u0015\u0083ÔY\u0096\u0000\u008c=Â\u0001ä\u008b\u0085\u0005£é&\u00847\u0014¿\u0096\u000f%O$<<\u009cã·å|pß\u0013\"4\u000ek»D{£1Iu\u008f\u0012L@3f\f×Ä\u0088kh´\u0081\u001bÁ/\u008eÌ\u0012÷¡>N[\u0095°} âÒ¶|±l\u001eos\u0010\u0013^\u0011?/¾\u0081Â\u001eyT\u0099½òe\u009d\u000ePÿs\u0094\u0015Õyr\u0007âæwVe\u0004H\u009düÄ\u0019ÐÊüP¥;\u000eiçÍ\u000f÷:à\u007fn¶ÿdù\u0087 àcb\u0010ß\u008d\r},¯$\u0017Ù\u0007\u0094mË\u009c\f/\u0014ÔDø[4è\u0012ï\u009e*ÉÙ7\u0096\u001d\\K]\u000bÂ\u0015T¤ÿ\"UDü²ª\u0019ì\u0081x+y\u0081Ï\r¶>ñ\u0011Ðò÷³\u009dlb\u0093\u001c½¨]1ÊÀÌ÷\u0012?a@\u0099\u000f\u0015¢D\u008fÑ\u008fø\u0010NÂ5xJ\u0014ë$\"9¡p\u0081üìn\u008a ¶òÎµôu·\u0014\u000fëMíú%i¯\u0080\u0003\u008ahc\u001càº\u000e«\u0087\f\u009bú4\u0084N¸e\u0011\u0087¨{\u0010ËMãÖ\u0094\u001cø\u009dì\u0011Fd(\u0094[\u0015\u0013+}¤¤@÷àÝ)Î\u0093sr8d*Óø\u009f\u000bË\u001a\u0014q»$ÇÝÀÐ]\f® \u00ad{\u0097¾)\b\b^¼.\f \u0093U,\u0085`ïLÐÖ§?\f\u0018\u0005\u0011BoàÃ²V\u0007\u0000È\u0013ðÌºrq\u008b\u000bRSw'áFv=\u001b\u0084Ûj\u000bSª ä\u009b>Ò$rfþ\u0016Iâ\u008a/Æ\u008a<È\u0002\u0094@4\u0013\u009c\u0013H\u001d¾à H3\u0010;æF³\u0094×Î@\u0099£<2g^²L\u0016Öé¯\u008b_q½\u0004\u0082Üà\u0010Ú\u0006\u0002Á\u00181·öVP\u000fD\u0091ðßX¡\fd\u0099\u008eDQMIØ\u000eyËv#àgJõpë'Ã£Õ\u000f¨»«Ô[Wu¥\u0095\u0003¡ÈUÅã\u000e´\u0018\u009azÊP ¥?Ð°\\\u008e\u0090\t®ÍUl\u0012\u0095&é\\\u0016§\u0081\u0096Éµ¨\u0086è\u00041B\u0001Õ;ñ\u0089z^cî E\u001c8\u001d.¯î«à&ºfù\bá\f\u0086\u0007Ö y5årDª¢;ð¸\n¤¸ùbðàÇ/·°\u0010¢}\nÎ\u0084ê\u0000A\nÈx]\u0004â\u000e½\u000fü¬¶\u0099ým\u0082þöcc~ß¢Ë\u0010U\u007f\u0083ýT<GÙ\u0083=Å|NEv@\u0011kò¦²coÊº¤Ð\u0087Ã\u0098ål]\u0011\nmÕ¢L\u008dÕÐ\\\u008fd\u0014tk\u0000\u001ee\u0083¿C\u00070wþU¡L]v£Xf\ræ\u0000¼ø\u0093Ü\f}èP\u0015\u009c°\u0006\u008cß\u0018\u0084\u0087K\u0010Ù*\u00986\u0084©t¬\u000b\u0010rª<¡¿í\u000f\u000e\u0017õ\u008f,úNþB\u0088'\u0084º\u00ad\u0004\u000bS\u00ad\u0083Í©Ý\u0002Xhé½\fþ\u009d©\u001e\u001c¿\b\"ÚNÈ\b\u0011\u00116g° Ðµ\u0002\u0088aÄ¢\u0096ÍH)ù\u000b\u008a\u001f<R\u0007\u009a\u0093\u009a³rê\r¦\u0004gó9_Å¸\u009fH\u0000Zc\rÁ¢\u008b'¤Åvëé\"Î\u0017º\u0004\u008d©vK\r0ÒF²Çôµf\u0086E9\u0083¦\u0002\u001fK\u000f×Ø\u008aôzÙ\u0094ñ©ÕM0\u0084>\n\r`\u0090|ý¤øOÀÐQ7\u00172\u0019]{\u0094Ò\u0003=*\u0016ÒwAGFN\\a«\u0081æ6×Yê\\#\fÃ¯!¯\nö\u0017ÇÏ§D\u0011\u000eþ\u0098\u0086Iþ*\u0089\\\bÞ(eB\u0001\rkË\u008aÝ\u000fâ¾Fì\u0097çe\u009b\tæþ\u0099gË\u0011\u0007F\u008b\fº\bqøëÜ¦\\àÉ\u008f\u001b\rÒ\u0019\u0005\bQ\u001f\tyýÃ¢\u009cñ\u0010F\u000ek²ú9»¾òNEóÌ\"W\u0012\u000bö|Hà^\u008dÏMß·\u0084\u0011Ág\u0011à\tB\u001c\u001b%ß\u000fâ\u0095CóµÛ\u000f\u0013-\u0097Òí\u009eÞ\u009f\u0007æ³\u008fe_7\u0010\u0099\u008cÅ]5«\u0007\u0097½\u0017\u0018oZÜ>'\tÁÒ\u0098Q½@\u0002+Ø\u000f]^l\u001fªÓF\u00103N\u009bóþÄÈ\bÃ;qo\u0001·\u0019¡\u0015\u0096\u009f\u0019\u001f\u0094Ú4\f{\u0005o\u0006öÚ¯\u0088\u008c¯y\u0004¼\u000f¦~pr6\\\"ÒÕ\u0016Gøe¥»\u000fª^¾ ]Ú\u008e\u0007³\u0018ayÞ5g\u001f\u0099\u0014\u001a\u008eh\u008f0¢ è©\u001d\u0086\u009eö\r½\u0013È0\u008fÜ£¤¢g»Fî'ú\u0017FGáä\u0017Âß\u000b]Ý\u0000´~\\Ôb\f]¸\u0000E\"á\u00052F\u0081¶\u0080\tÇ\\´5C¸èõ@\u0017I=^Q\f@tQUnlâNb)V\u009dÑ\u0089^m\u0005û\u0018®\u0094ü\u009e´\u008d«âÓþÔ\u001bDn2K@©«\u000b¦Z\u0014\u0097\fB\b>¬îéVè\u0011\u0017±#\u0016Áw\u009b\u009däÜx\u0002\u008aÍQ\u001f1ùWä\u0095+ñ\u0090jg\u0004\u0010P\u0084}\rRÿç\u0010ÛYj\u0018ëY}Ã\u0002\u000eö|~ðdÑ\u0086\u0018UU´ÂXB\u0005>{!ª\u000f\u0012@$!\u0088\u000fOÜº=ë\fró\u008dðn\u009d\t\u0011~\f\f\u008a?w|\n§YK\u008aw0\b\u0093î\ruÁ\u0094b\u0012kmî{\u00986Ïü\fh\bÄGuX?êàû2ô\u0011Õ´\u000eù¤í\u008bc%\u000f\"\u0001AAÎ½6\bþ\u001f\u0015\u007f\u000eô,·\u000b^o\u009aºr\u0083Þ\u001fô\u0016j\u0016¿«T\u0006\u001d¯Glm\u0000\u00ad¦®Î¤\u0002ë÷>\b\u0093\u0017\u001bÅì\u0091\u0091\u0019l\u001eÞeg\u0007ê\u0094¶Ø\nÇü¬eR¼OfôI÷\r3>Ñ·%øÞå=\u0095È\u0003µ\u0010åþ\u001f¬tújÆÈA\u0002\u0012$\u001eJ\u0095\u0019\\Km`\u0097=H©/Õ\u0016ô\u0019\u0080\u001bb:~õÉµ¦¦£ª\u0017-&\u008cÈºGj»ëËÖ`®\u0013\u0094¿7QÏ\u009a¬\n|\u0011X\u0002À¬¯¬SÂ\u0097ßá\"TÙõÚ\"\u0005\u0083¸/Õ\u000f\r\u0003wá\n\u0097Zé:é\u0006\u0000Fc\u0003&h\u0095\u0016(ä¦ïC\u0092\u008cË\u0014ô\u00828K\u001d\u0018x|¸ÌâÍ)\u000ff:0÷$9\u0018\u001aÖÈÉL^/W\u000f\u0089È\u0018\u0015(ü8Ì¡%\u0089¤\u0082©v\u0016y\\MrÎßé\u0006éìÿºbL\u0007g¤\u0083¸U[2\u000eÊP=àk¹\u009e\u001eàóe\u0013\u0099x\tæ\u0097¿\"\u008bG¬ËÃ\b´£®\u0011ÚÉ:£\u0006\u0083\u008eª\u0014@³\u0013Z\u0083>ÆmØû)KgûÃË\u000f`ÌS$\u008f\u0015PO#åOâÔ\u000f<],\u00adñ^t\u0017R_\u001e\u0011\u0004\u000e¦s\u0013ºEr²\u0093\u009a<EÿÝR\fó¸\u0088Á\u009cv6\u009fVùYþ\u000f#»û\u008b%[>\n\u008dTâÚA\u0082~\u0015F+Q\u001f¡¤V@\u0011WÑ¹YÄ)\u009a8\u0004¾á§\u0004\u001b\u0094¤ì\u000f3QÿPtMì}Rë%Q\u0081f¨\u0011ðy\u000e\u0001ßÖæÿàT\u0094ÅFÏôÍ\u001e\t*\u008eÃ\"'æ¸'\u0015\f«\u009c\u00adízxÒ\u0010\u0090ê®j\u00185ýËÀ¸Ü\rÄ64Ý\u0015Ü\u0018'-\u0089B\u007f:ò\u0099^\u0012\u0015BRXd\u0015z¿jËæñ\u0093ê\u0005`\u0088¨\u001c4-E\u0010\u00034oG\u001f\u0013 ÅÿÕ\u0018ü\u001e\u0081çb\u000f\u0085\u000fX!ï\u0084&søÅ·í\u0016ÇÁ\frjÇ>`æ\u0003üMÀ\u0014ý\u0010*\u0097úIî\u0085\u0004\u008a£\u0000\n6í÷ÈB\u000e\u0019%Õh7\rGCµêE]&[\u0007´\u0085\u0000$XçÀ\t§\u0082\u0082%¹>'(s\u0010A+E\u0010g¬5ëþÁÔÀþ>+¿\u000fÇ\u0016a¸§P\u0096Þ\u001d\u009fÌß¼·\u000f\u0005t\u009a\u008fZÔ\u001c/²ÌZ²\u0015kñË\u0082ÒV.!\u008fø-¢ñ®ùÅ(P[¦tù\u0019Û°R\u001aa\u001d\u0011ð\u0084¼>S\u0019g\u0099j5\u008d\u0005\u0085jÁ¡Ò\u008d\u000f/Ã|\u0002\u0004\u0007â4\u008fÊ\fc\fÖ\u0096\u0015mÞ4¡\rsÃº£\b\u0087R\u0093¹p5\u0013ñÛ_\u000b\u0011!Ö\rÖ\u008a\u0084lÃ+ÄÎ\u0097§8ïîk\u000fØ¥BîfÞ\u009aÂa\u0007m\u0015¸\u0005þ\u0016\u0097°Qe½ÃSáï±ý\u0090¤\båÚÃì;k3{\u0018\u008e0¼yVëÐ\"\u008dèª\u008e2kúC2\u008f\b\u0083\u001c®\u0083ô\u000bñ/³9]'XÐ0\u0094x\f\u000e\u0080\u009dg?\u001aVMõ\rU\u0087\t\u0015ýI\u0000\u0098\u0018wXv\u0012\u0085¸ 9\nÑ\\\u001f·H~F\u001b¿LÂuè\fýJú)õO\u0090Ã?'Z\u0001\rª \u0092hhÅ\u0086@à\u0081õ\u001b?\u0017{?K\u009eîÄB4±ÍÂd_!\u001eÀ\u0086\u0005Ó³åKN\u0006¶<\u009f²Ê\u009d\u0012ü¼\u008f¹ïÁà\u001d \b\u008cNE¾\u0087â\fì\u0013H\u0011V\u009f/¤PfÖ-ÉÈ\u001f\u008b\u0012/î\u008aW\u000ej\u0097 \u001fwúy?²±H^ÇÑ\u0006#C¾\u00adÂ\u0084";
      int var4 = "Éÿ\u000b;BPÜ\u009b:ã\u0016©;\u001ck¨3(5£\u001aßZ\u0099F°Cv\u0007ß¸Ú\u0082\u0015¾3N\u001cBÄ*L\u009eÖ \u0089gÂîZÀ\u001c âE\u000bê\nX\u0084µÇ8\u0000\u0096\u009a¬\u0015vµçº×\tÇr^ìeYr&òA\u0087\u009bw]ú\u000e\u0083\u0014\u0086N]É\nÛ\u001cùp?\u0080\u0017\u0007»\u0018\u0002qÊOR\u0016ú)üV\b¥å-9('£ÿn\u008e\u0016®u\u0096Y\u0086\u001c\u00134ón»%dò\u008ek¤Û>{\u0091E\u001f÷^\u001b\u0015àq5\"\u008d\u001a\u008c\u00107 HÐ×\u0017^}\u0006J\u00ad\u00929\u0010\u001cÚ³\"\u0015g{\u00927îí%Ù\u0082Ï(\u0004_¶P?\u000b\u0010=^ÃLùRõqWR\u0013\u008a\u0017xî$\u0083¹#\u0091Ø\u0099\u001dG]¹Ý\u0091¹.\bsnb´Ñ\u0098Û\u008a\u000f\u009fæÇ±j=\u0086\u0006[\u0097\u0004gÞÑ\u0088\bè\b\u009e{\u0015\u0005O\u0089\u0010>ñý'\u0095Ó2îjõ\u00986\u0010\u009f7¥\rË\u00ad¾Éíö\u0006\u008dðë\u001e\u0095n\bbÅ\u0086$|\u009fbÚ\u0010±ÀEì¥ÄÐ\u008d4\u0090\u0011¤\u0015Upi\u0006\u0089v\u0003\nCv\u0007gÚøb\u0087^î\u0011L¯\u0099Û-\u008d¸\u0094+9íhiz\u0011{¢\u0005\\×L\u00849\u0016\u001d\u0091ø(>\u0010Xÿ¼Ú^O%\u0088\u0087\u0089åÜì\u0086D\u0086\u0016@µ!º\u000f\tÜr=ò\fGãåü$\u0083\u0095\u0092\u0004\u0088\u0011\u0002\u001a¤\u0015`á\u0095F9\u008fE%sû\u009d,Ðv\u0018Ì\u001eÎ{¸>\u0015MEbDû±ÙaÆ¨Ø³\u0000lq^Wu\u0002_Ó\f3´\u0090@\u009fFV\u0099Z9Øæ\nò\u0002û²)³2\u0011\u001a£\r\u001f\u0095\u000b¢\u0085DkÈTP§7 \u0010T3ç¦Ì\u001a.r\u0010f\u0084.èôh\"\u0010$ç´\u0085õ\u0093g\f´=\u009d_×Í\u000eÁ\u0012\fÚ\r\u0092µðìø\\DãEC)ï/\u0086\u0099\u0012\u0089°\u0018\u001a(\u001d8ð¡¢\u009fR\u0087¦¸á\u0098H\u000b\u0010\u0081t\u0091c\u0082Ä³°\u0094¦\r\u009eå;¬\u0083\u0085«ðLW¤×@\u0016\u009eCp\u001b\u0099\f×\u0018\u007f\u008eïwæô\u00adEÊ\u001f\u001a\u0013\u0017²\u0004\u0094÷)\u0017\u0002GË\f?É]Btg\u0010\u0019×\u0000Bú\f\u001bÁêKÅH·)ØtÑ¦\fÄ³íÀ\u0017\u0018´)»zÊª\u0012OÃÀt3Ð[IÍ\u0095\u0012«6f\u008f\u0099Y=\u0012ñu\u0017¢É\n\u0004\u0012&þoÆ\u008fÕk1#\\\u0016\r$\u0002÷×\u0091\u001e«FøÈ¹\u0002-1~YxhÿY/\u0011\\\u0085~ÇÐ<~Üè!ç2-$Mf\u008b\u0011¾\u0094+\"U\u0086mFWµUÂ¤<\bm$\u0017^ú¼©P_ÿ²$\u0012Bm\u008b\u0093\u0091h\u008a\u0016k¦1\u001ap\u0012¥\r\u0013\u0014e¤ïr&\u0017º ¶U\u0016Vâ&\b¾µ.Æ^çÆ\u0015\r\bôl0B_\u008b¸AN&V¤\u0011\u0086\u0088·ë#\u009e\u009bZ\u008eþÂ>=|qû\r\n¾\u0012+ò\u0002®!3±\u0089\u000f\u008fkU`\u008b¢á\u0014\u000eÝ\u0080N\u0005nI\u0002Ó\u0010\u000b\u009d\u000e\u009aÓwù#a\u000f*T\u000f\u008bµ\u0007\u0013M\u00134;m,Y`-\u009e\"\u0011\u009f\u009eÚßp¥3çÀ@³\u0007\u001a4\u0019¥\u0089\u0014\u001d!\u008a(z[r8è¥³p¨\u0003»øó\u0016[h\u000b2 z³¦\u0012Ð¡2Öö\u0007@FO\u001eU R\u0019¹?\bZ\u0090,X4\u009c3\u0088Ï\u007f_{COÅz¾DH\u0098~m\u0013\u0011\u001b\u000boJ³t%(\u0018®\u0005¡Ab±\u0013N£\fZ\u000f\u0012\u00ad`d×S×5GC\u0011\u0002·iú\u0006\u0001ýs\u0019Ò\u0088Cseî4Á\f×Xh\u009b\u0087\u0095¯¹Øh¦è\u000eO¹\u008dÝ}\u001e\\ê¸mnÀø\u0002\u0010}\u0088Âd\u0097\"+:=û¬\u0087ñÖÊ¢\u0004Ï$zþ\u000e\u0005N¡\u0007\u000e¼\u007f\u0006\tB? )\u001e\u000fBÁ\u0014AM w>\u001deoüðFH\u000e?Þ \u000f#Ä~E\u0003æv¤»9\fØ\u0007/\u009f\f\u0016Þ\u0082ö\u000fc\u0004\u0012*ªQV ¤U\b\u001be\u0087ãíYû\u000bãn\u0011\u0097\u0098\u0004Å\u0017å\u0016Ú\u0001\u009eþ+\u0080/£^¿\u0015\u0083ÔY\u0096\u0000\u008c=Â\u0001ä\u008b\u0085\u0005£é&\u00847\u0014¿\u0096\u000f%O$<<\u009cã·å|pß\u0013\"4\u000ek»D{£1Iu\u008f\u0012L@3f\f×Ä\u0088kh´\u0081\u001bÁ/\u008eÌ\u0012÷¡>N[\u0095°} âÒ¶|±l\u001eos\u0010\u0013^\u0011?/¾\u0081Â\u001eyT\u0099½òe\u009d\u000ePÿs\u0094\u0015Õyr\u0007âæwVe\u0004H\u009düÄ\u0019ÐÊüP¥;\u000eiçÍ\u000f÷:à\u007fn¶ÿdù\u0087 àcb\u0010ß\u008d\r},¯$\u0017Ù\u0007\u0094mË\u009c\f/\u0014ÔDø[4è\u0012ï\u009e*ÉÙ7\u0096\u001d\\K]\u000bÂ\u0015T¤ÿ\"UDü²ª\u0019ì\u0081x+y\u0081Ï\r¶>ñ\u0011Ðò÷³\u009dlb\u0093\u001c½¨]1ÊÀÌ÷\u0012?a@\u0099\u000f\u0015¢D\u008fÑ\u008fø\u0010NÂ5xJ\u0014ë$\"9¡p\u0081üìn\u008a ¶òÎµôu·\u0014\u000fëMíú%i¯\u0080\u0003\u008ahc\u001càº\u000e«\u0087\f\u009bú4\u0084N¸e\u0011\u0087¨{\u0010ËMãÖ\u0094\u001cø\u009dì\u0011Fd(\u0094[\u0015\u0013+}¤¤@÷àÝ)Î\u0093sr8d*Óø\u009f\u000bË\u001a\u0014q»$ÇÝÀÐ]\f® \u00ad{\u0097¾)\b\b^¼.\f \u0093U,\u0085`ïLÐÖ§?\f\u0018\u0005\u0011BoàÃ²V\u0007\u0000È\u0013ðÌºrq\u008b\u000bRSw'áFv=\u001b\u0084Ûj\u000bSª ä\u009b>Ò$rfþ\u0016Iâ\u008a/Æ\u008a<È\u0002\u0094@4\u0013\u009c\u0013H\u001d¾à H3\u0010;æF³\u0094×Î@\u0099£<2g^²L\u0016Öé¯\u008b_q½\u0004\u0082Üà\u0010Ú\u0006\u0002Á\u00181·öVP\u000fD\u0091ðßX¡\fd\u0099\u008eDQMIØ\u000eyËv#àgJõpë'Ã£Õ\u000f¨»«Ô[Wu¥\u0095\u0003¡ÈUÅã\u000e´\u0018\u009azÊP ¥?Ð°\\\u008e\u0090\t®ÍUl\u0012\u0095&é\\\u0016§\u0081\u0096Éµ¨\u0086è\u00041B\u0001Õ;ñ\u0089z^cî E\u001c8\u001d.¯î«à&ºfù\bá\f\u0086\u0007Ö y5årDª¢;ð¸\n¤¸ùbðàÇ/·°\u0010¢}\nÎ\u0084ê\u0000A\nÈx]\u0004â\u000e½\u000fü¬¶\u0099ým\u0082þöcc~ß¢Ë\u0010U\u007f\u0083ýT<GÙ\u0083=Å|NEv@\u0011kò¦²coÊº¤Ð\u0087Ã\u0098ål]\u0011\nmÕ¢L\u008dÕÐ\\\u008fd\u0014tk\u0000\u001ee\u0083¿C\u00070wþU¡L]v£Xf\ræ\u0000¼ø\u0093Ü\f}èP\u0015\u009c°\u0006\u008cß\u0018\u0084\u0087K\u0010Ù*\u00986\u0084©t¬\u000b\u0010rª<¡¿í\u000f\u000e\u0017õ\u008f,úNþB\u0088'\u0084º\u00ad\u0004\u000bS\u00ad\u0083Í©Ý\u0002Xhé½\fþ\u009d©\u001e\u001c¿\b\"ÚNÈ\b\u0011\u00116g° Ðµ\u0002\u0088aÄ¢\u0096ÍH)ù\u000b\u008a\u001f<R\u0007\u009a\u0093\u009a³rê\r¦\u0004gó9_Å¸\u009fH\u0000Zc\rÁ¢\u008b'¤Åvëé\"Î\u0017º\u0004\u008d©vK\r0ÒF²Çôµf\u0086E9\u0083¦\u0002\u001fK\u000f×Ø\u008aôzÙ\u0094ñ©ÕM0\u0084>\n\r`\u0090|ý¤øOÀÐQ7\u00172\u0019]{\u0094Ò\u0003=*\u0016ÒwAGFN\\a«\u0081æ6×Yê\\#\fÃ¯!¯\nö\u0017ÇÏ§D\u0011\u000eþ\u0098\u0086Iþ*\u0089\\\bÞ(eB\u0001\rkË\u008aÝ\u000fâ¾Fì\u0097çe\u009b\tæþ\u0099gË\u0011\u0007F\u008b\fº\bqøëÜ¦\\àÉ\u008f\u001b\rÒ\u0019\u0005\bQ\u001f\tyýÃ¢\u009cñ\u0010F\u000ek²ú9»¾òNEóÌ\"W\u0012\u000bö|Hà^\u008dÏMß·\u0084\u0011Ág\u0011à\tB\u001c\u001b%ß\u000fâ\u0095CóµÛ\u000f\u0013-\u0097Òí\u009eÞ\u009f\u0007æ³\u008fe_7\u0010\u0099\u008cÅ]5«\u0007\u0097½\u0017\u0018oZÜ>'\tÁÒ\u0098Q½@\u0002+Ø\u000f]^l\u001fªÓF\u00103N\u009bóþÄÈ\bÃ;qo\u0001·\u0019¡\u0015\u0096\u009f\u0019\u001f\u0094Ú4\f{\u0005o\u0006öÚ¯\u0088\u008c¯y\u0004¼\u000f¦~pr6\\\"ÒÕ\u0016Gøe¥»\u000fª^¾ ]Ú\u008e\u0007³\u0018ayÞ5g\u001f\u0099\u0014\u001a\u008eh\u008f0¢ è©\u001d\u0086\u009eö\r½\u0013È0\u008fÜ£¤¢g»Fî'ú\u0017FGáä\u0017Âß\u000b]Ý\u0000´~\\Ôb\f]¸\u0000E\"á\u00052F\u0081¶\u0080\tÇ\\´5C¸èõ@\u0017I=^Q\f@tQUnlâNb)V\u009dÑ\u0089^m\u0005û\u0018®\u0094ü\u009e´\u008d«âÓþÔ\u001bDn2K@©«\u000b¦Z\u0014\u0097\fB\b>¬îéVè\u0011\u0017±#\u0016Áw\u009b\u009däÜx\u0002\u008aÍQ\u001f1ùWä\u0095+ñ\u0090jg\u0004\u0010P\u0084}\rRÿç\u0010ÛYj\u0018ëY}Ã\u0002\u000eö|~ðdÑ\u0086\u0018UU´ÂXB\u0005>{!ª\u000f\u0012@$!\u0088\u000fOÜº=ë\fró\u008dðn\u009d\t\u0011~\f\f\u008a?w|\n§YK\u008aw0\b\u0093î\ruÁ\u0094b\u0012kmî{\u00986Ïü\fh\bÄGuX?êàû2ô\u0011Õ´\u000eù¤í\u008bc%\u000f\"\u0001AAÎ½6\bþ\u001f\u0015\u007f\u000eô,·\u000b^o\u009aºr\u0083Þ\u001fô\u0016j\u0016¿«T\u0006\u001d¯Glm\u0000\u00ad¦®Î¤\u0002ë÷>\b\u0093\u0017\u001bÅì\u0091\u0091\u0019l\u001eÞeg\u0007ê\u0094¶Ø\nÇü¬eR¼OfôI÷\r3>Ñ·%øÞå=\u0095È\u0003µ\u0010åþ\u001f¬tújÆÈA\u0002\u0012$\u001eJ\u0095\u0019\\Km`\u0097=H©/Õ\u0016ô\u0019\u0080\u001bb:~õÉµ¦¦£ª\u0017-&\u008cÈºGj»ëËÖ`®\u0013\u0094¿7QÏ\u009a¬\n|\u0011X\u0002À¬¯¬SÂ\u0097ßá\"TÙõÚ\"\u0005\u0083¸/Õ\u000f\r\u0003wá\n\u0097Zé:é\u0006\u0000Fc\u0003&h\u0095\u0016(ä¦ïC\u0092\u008cË\u0014ô\u00828K\u001d\u0018x|¸ÌâÍ)\u000ff:0÷$9\u0018\u001aÖÈÉL^/W\u000f\u0089È\u0018\u0015(ü8Ì¡%\u0089¤\u0082©v\u0016y\\MrÎßé\u0006éìÿºbL\u0007g¤\u0083¸U[2\u000eÊP=àk¹\u009e\u001eàóe\u0013\u0099x\tæ\u0097¿\"\u008bG¬ËÃ\b´£®\u0011ÚÉ:£\u0006\u0083\u008eª\u0014@³\u0013Z\u0083>ÆmØû)KgûÃË\u000f`ÌS$\u008f\u0015PO#åOâÔ\u000f<],\u00adñ^t\u0017R_\u001e\u0011\u0004\u000e¦s\u0013ºEr²\u0093\u009a<EÿÝR\fó¸\u0088Á\u009cv6\u009fVùYþ\u000f#»û\u008b%[>\n\u008dTâÚA\u0082~\u0015F+Q\u001f¡¤V@\u0011WÑ¹YÄ)\u009a8\u0004¾á§\u0004\u001b\u0094¤ì\u000f3QÿPtMì}Rë%Q\u0081f¨\u0011ðy\u000e\u0001ßÖæÿàT\u0094ÅFÏôÍ\u001e\t*\u008eÃ\"'æ¸'\u0015\f«\u009c\u00adízxÒ\u0010\u0090ê®j\u00185ýËÀ¸Ü\rÄ64Ý\u0015Ü\u0018'-\u0089B\u007f:ò\u0099^\u0012\u0015BRXd\u0015z¿jËæñ\u0093ê\u0005`\u0088¨\u001c4-E\u0010\u00034oG\u001f\u0013 ÅÿÕ\u0018ü\u001e\u0081çb\u000f\u0085\u000fX!ï\u0084&søÅ·í\u0016ÇÁ\frjÇ>`æ\u0003üMÀ\u0014ý\u0010*\u0097úIî\u0085\u0004\u008a£\u0000\n6í÷ÈB\u000e\u0019%Õh7\rGCµêE]&[\u0007´\u0085\u0000$XçÀ\t§\u0082\u0082%¹>'(s\u0010A+E\u0010g¬5ëþÁÔÀþ>+¿\u000fÇ\u0016a¸§P\u0096Þ\u001d\u009fÌß¼·\u000f\u0005t\u009a\u008fZÔ\u001c/²ÌZ²\u0015kñË\u0082ÒV.!\u008fø-¢ñ®ùÅ(P[¦tù\u0019Û°R\u001aa\u001d\u0011ð\u0084¼>S\u0019g\u0099j5\u008d\u0005\u0085jÁ¡Ò\u008d\u000f/Ã|\u0002\u0004\u0007â4\u008fÊ\fc\fÖ\u0096\u0015mÞ4¡\rsÃº£\b\u0087R\u0093¹p5\u0013ñÛ_\u000b\u0011!Ö\rÖ\u008a\u0084lÃ+ÄÎ\u0097§8ïîk\u000fØ¥BîfÞ\u009aÂa\u0007m\u0015¸\u0005þ\u0016\u0097°Qe½ÃSáï±ý\u0090¤\båÚÃì;k3{\u0018\u008e0¼yVëÐ\"\u008dèª\u008e2kúC2\u008f\b\u0083\u001c®\u0083ô\u000bñ/³9]'XÐ0\u0094x\f\u000e\u0080\u009dg?\u001aVMõ\rU\u0087\t\u0015ýI\u0000\u0098\u0018wXv\u0012\u0085¸ 9\nÑ\\\u001f·H~F\u001b¿LÂuè\fýJú)õO\u0090Ã?'Z\u0001\rª \u0092hhÅ\u0086@à\u0081õ\u001b?\u0017{?K\u009eîÄB4±ÍÂd_!\u001eÀ\u0086\u0005Ó³åKN\u0006¶<\u009f²Ê\u009d\u0012ü¼\u008f¹ïÁà\u001d \b\u008cNE¾\u0087â\fì\u0013H\u0011V\u009f/¤PfÖ-ÉÈ\u001f\u008b\u0012/î\u008aW\u000ej\u0097 \u001fwúy?²±H^ÇÑ\u0006#C¾\u00adÂ\u0084"
         .length();
      char var1 = '\n';
      b((CompoundTag)null);
      int var9 = -1;

      label52:
      while (true) {
         short var10000 = 71;
         String var10001 = var2.substring(++var9, var9 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var233 = var10001.toCharArray();
               int var10004 = var233.length;
               int var6 = 0;
               byte var236 = (byte)var10000;
               var33 = var233;
               int var24 = var10004;
               byte var438;
               char[] var443;
               int var10006;
               if (var10004 <= 1) {
                  var443 = var233;
                  var438 = (byte)var10000;
                  var10006 = var6;
               } else {
                  var236 = (byte)var10000;
                  var24 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var443 = var233;
                  var438 = (byte)var10000;
                  var10006 = var6;
               }

               while (true) {
                  var443[var10006] = (char)(var443[var10006] ^ var438 ^ switch (var6 % 7) {
                     case 0 -> 95;
                     case 1 -> 118;
                     case 2 -> 77;
                     case 3 -> 55;
                     case 4 -> 5;
                     case 5 -> 2;
                     default -> 61;
                  });
                  var6++;
                  if (var236 == 0) {
                     var10006 = var236;
                     var443 = var33;
                     var438 = var236;
                  } else {
                     if (var24 <= var6) {
                        break;
                     }

                     var443 = var33;
                     var438 = var236;
                     var10006 = var6;
                  }
               }
            }

            String var238 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var238;
                  if ((var9 += var1) >= var4) {
                     c = var5;
                     d = new String[235];
                     var10000 = 20121;
                     short var26 = -5561;
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = "id";
                     var10000 = 20104;
                     short var27 = 14205;
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = "uuid";
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI();
                     var10000 = 20213;
                     short var28 = 5478;
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = CollectionsKt.listOf("Fire");
                     String[] var7 = new String[100];
                     var10002 = 20188;
                     short var239 = -19517;
                     var7[0] = "Fancy Sword";
                     var10002 = 20101;
                     short var240 = 18370;
                     var7[1] = "Rogue Sword";
                     var10002 = 20194;
                     short var241 = 10218;
                     var7[2] = "Spider Sword";
                     var10002 = 20196;
                     short var242 = -27095;
                     var7[3] = "Undead Sword";
                     var10002 = 20127;
                     short var243 = 23130;
                     var7[4] = "Cleaver";
                     var10002 = 20174;
                     short var244 = -1959;
                     var7[5] = "End Sword";
                     var10002 = 20012;
                     short var245 = -13977;
                     var7[6] = "Hunter Knife";
                     var10002 = 20145;
                     short var246 = -17280;
                     var7[7] = "Prismarine Blade";
                     var10002 = 20140;
                     short var247 = -12861;
                     var7[8] = "Silver Fang";
                     var10002 = 20033;
                     short var248 = -8309;
                     var7[9] = "Squire Sword";
                     var10002 = 20038;
                     short var249 = -22701;
                     var7[10] = "Sword of Bad Health";
                     var10002 = 20113;
                     short var250 = -15640;
                     var7[11] = "Voidwalker Katana";
                     var10002 = 20070;
                     short var251 = -28675;
                     var7[12] = "Aspect of the End";
                     var10002 = 20177;
                     short var252 = 8768;
                     var7[13] = "Bingolibur";
                     var10002 = 20216;
                     short var253 = 5000;
                     var7[14] = "Blade of the Volcano";
                     var10002 = 20117;
                     short var254 = 18672;
                     var7[15] = "Bonzo's Staff";
                     var10002 = 20028;
                     short var255 = 10177;
                     var7[16] = "Conjuring";
                     var10002 = 20093;
                     short var256 = 30890;
                     var7[17] = "Edible Mace";
                     var10002 = 20041;
                     short var257 = 988;
                     var7[18] = "Firedust Dagger";
                     var10002 = 20102;
                     short var258 = -14110;
                     var7[19] = "Frozen Scythe";
                     var10002 = 20166;
                     short var259 = -21822;
                     var7[20] = "Golem Sword";
                     var10002 = 20173;
                     short var260 = 7865;
                     var7[21] = "Ice Spray Wand";
                     var10002 = 20066;
                     short var261 = -10659;
                     var7[22] = "Mercenary Sword";
                     var10002 = 20162;
                     short var262 = -10678;
                     var7[23] = "Raider Sword";
                     var10002 = 20209;
                     short var263 = 7980;
                     var7[24] = "Recluse Fang";
                     var10002 = 20118;
                     short var264 = -29572;
                     var7[25] = "Revenant Falchion";
                     var10002 = 20094;
                     short var265 = -29190;
                     var7[26] = "Silent Death";
                     var10002 = 20003;
                     short var266 = 22332;
                     var7[27] = "Super Cleaver";
                     var10002 = 19977;
                     short var267 = -30659;
                     var7[28] = "Tactician's Sword";
                     var10002 = 20172;
                     short var268 = -9021;
                     var7[29] = "Twilight Dagger";
                     var10002 = 19991;
                     short var269 = 30009;
                     var7[30] = "Voidedge Katana";
                     var10002 = 20169;
                     short var270 = 18469;
                     var7[31] = "Zombie Soldier Cutlass";
                     var10002 = 20108;
                     short var271 = -31715;
                     var7[32] = "Zombie Sword";
                     var10002 = 20200;
                     short var272 = -17412;
                     var7[33] = "Adaptive Blade";
                     var10002 = 20084;
                     short var273 = -26131;
                     var7[34] = "Arack";
                     var10002 = 20032;
                     short var274 = -25474;
                     var7[35] = "Aspect of the Void";
                     var10002 = 20191;
                     short var275 = 29699;
                     var7[36] = "Bone Reaver";
                     var10002 = 20153;
                     short var276 = 3200;
                     var7[37] = "Crypt Witherlord Sword";
                     var10002 = 20015;
                     short var277 = 28654;
                     var7[38] = "Earth Shard";
                     var10002 = 20071;
                     short var278 = 31263;
                     var7[39] = "Ember Rod";
                     var10002 = 19988;
                     short var279 = -27449;
                     var7[40] = "Emerald Blade";
                     var10002 = 20207;
                     short var280 = 22720;
                     var7[41] = "End Stone Sword";
                     var10002 = 20080;
                     short var281 = -20803;
                     var7[42] = "Enrager";
                     var10002 = 20095;
                     short var282 = -15772;
                     var7[43] = "Fel Sword";
                     var10002 = 20112;
                     short var283 = 6719;
                     var7[44] = "Fire Freeze Staff";
                     var10002 = 20017;
                     short var284 = -13148;
                     var7[45] = "Fire Fury Staff";
                     var10002 = 19976;
                     short var285 = -5167;
                     var7[46] = "Ghoul Buster";
                     var10002 = 20034;
                     short var286 = -24676;
                     var7[47] = "Giant Cleaver";
                     var10002 = 20202;
                     short var287 = 4333;
                     var7[48] = "Glacial Scythe";
                     var10002 = 20042;
                     short var288 = -19310;
                     var7[49] = "Hyper Cleaver";
                     var10002 = 20142;
                     short var289 = -21615;
                     var7[50] = "Ice Wand";
                     var10002 = 20170;
                     short var290 = -23821;
                     var7[51] = "Jerry-chine Gun";
                     var10002 = 20190;
                     short var291 = -23689;
                     var7[52] = "Kindlebane Dagger";
                     var10002 = 19970;
                     short var292 = -22011;
                     var7[53] = "Leaping Sword";
                     var10002 = 20223;
                     short var293 = 32254;
                     var7[54] = "Mawdredge Dagger";
                     var10002 = 20160;
                     short var294 = 18309;
                     var7[55] = "Ornate Zombie Sword";
                     var10002 = 20081;
                     short var295 = -16679;
                     var7[56] = "Ragnarock";
                     var10002 = 20005;
                     short var296 = 6956;
                     var7[57] = "Reaper Falchion";
                     var10002 = 20013;
                     short var297 = -1464;
                     var7[58] = "Scorpion Foil";
                     var10002 = 20163;
                     short var298 = 24577;
                     var7[59] = "Shaman Sword";
                     var10002 = 20178;
                     short var299 = -15224;
                     var7[60] = "Sinseeker Scythe";
                     var10002 = 20008;
                     short var300 = 27911;
                     var7[61] = "Spirit Sword";
                     var10002 = 20220;
                     short var301 = -30008;
                     var7[62] = "Sword of Revelations";
                     var10002 = 20119;
                     short var302 = 17640;
                     var7[63] = "Void Sword";
                     var10002 = 20010;
                     short var303 = -2169;
                     var7[64] = "Vorpal Katana";
                     var10002 = 20210;
                     short var304 = 12784;
                     var7[65] = "Wither Cloak Sword";
                     var10002 = 20217;
                     short var305 = -13337;
                     var7[66] = "Zombie Commander Whip";
                     var10002 = 19998;
                     short var306 = -18703;
                     var7[67] = "Zombie Knight Sword";
                     var10002 = 20074;
                     short var307 = 1810;
                     var7[68] = "Aspect of the Dragons";
                     var10002 = 20150;
                     short var308 = -31445;
                     var7[69] = "Astraea";
                     var10002 = 20075;
                     short var309 = -9533;
                     var7[70] = "Atomsplit Katana";
                     var10002 = 20164;
                     short var310 = 13107;
                     var7[71] = "Aurora Staff";
                     var10002 = 20123;
                     short var311 = 11282;
                     var7[72] = "Bouquet of Lies";
                     var10002 = 19971;
                     short var312 = 28653;
                     var7[73] = "Daedalus Blade";
                     var10002 = 19982;
                     short var313 = 23902;
                     var7[74] = "Dark Claymore";
                     var10002 = 20165;
                     short var314 = -5120;
                     var7[75] = "Deathtripper Dagger";
                     var10002 = 20024;
                     short var315 = -20069;
                     var7[76] = "Felthorn Reaper";
                     var10002 = 20136;
                     short var316 = 6870;
                     var7[77] = "Florid Zombie Sword";
                     var10002 = 20076;
                     short var317 = -2947;
                     var7[78] = "Flower of Truth";
                     var10002 = 20181;
                     short var318 = 2198;
                     var7[79] = "Gemstone Gauntlet";
                     var10002 = 20146;
                     short var319 = 22004;
                     var7[80] = "Giant's Sword";
                     var10002 = 19974;
                     short var320 = -20350;
                     var7[81] = "Great Spook Sword";
                     var10002 = 20035;
                     short var321 = 23833;
                     var7[82] = "Halberd of the Shredded";
                     var10002 = 19996;
                     short var322 = -16456;
                     var7[83] = "Hyperion";
                     var10002 = 20106;
                     short var323 = 7928;
                     var7[84] = "Livid Dagger";
                     var10002 = 20107;
                     short var324 = 24083;
                     var7[85] = "Midas' Staff";
                     var10002 = 20077;
                     short var325 = 15923;
                     var7[86] = "Midas' Sword";
                     var10002 = 20218;
                     short var326 = 11019;
                     var7[87] = "Necromancer Sword";
                     var10002 = 20039;
                     short var327 = -14528;
                     var7[88] = "Necron's Blade";
                     var10002 = 20203;
                     short var328 = 21123;
                     var7[89] = "Pigman Sword";
                     var10002 = 20126;
                     short var329 = -26990;
                     var7[90] = "Pooch Sword";
                     var10002 = 20168;
                     short var330 = 27697;
                     var7[91] = "Pyrochaos Dagger";
                     var10002 = 20006;
                     short var331 = -18145;
                     var7[92] = "Reaper Scythe";
                     var10002 = 20036;
                     short var332 = -7567;
                     var7[93] = "Scylla";
                     var10002 = 19979;
                     short var333 = -7487;
                     var7[94] = "Shadow Fury";
                     var10002 = 20201;
                     short var334 = -28672;
                     var7[95] = "Silk-Edge Sword";
                     var10002 = 20011;
                     short var335 = 28026;
                     var7[96] = "Soul Whip";
                     var10002 = 20171;
                     short var336 = 21242;
                     var7[97] = "Spirit Sceptre";
                     var10002 = 20116;
                     short var337 = -8728;
                     var7[98] = "Valkyrie";
                     var10002 = 20182;
                     short var338 = -8310;
                     var7[99] = "Yeti Sword";
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = CollectionsKt.listOf(var7);
                     var7 = new String[6];
                     var10002 = 20204;
                     short var339 = -28389;
                     var7[0] = "Artisanal Shortbow";
                     var10002 = 20120;
                     short var340 = 1199;
                     var7[1] = "Dragon Shortbow";
                     var10002 = 20183;
                     short var341 = -1055;
                     var7[2] = "Machine Gun Shortbow";
                     var10002 = 20184;
                     short var342 = 4481;
                     var7[3] = "Juju Shortbow";
                     var10002 = 20090;
                     short var343 = -10362;
                     var7[4] = "Spirit Shortbow";
                     var10002 = 20159;
                     short var344 = 29659;
                     var7[5] = "Terminator";
                     lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = CollectionsKt.listOf(var7);
                     var7 = new String[4];
                     var10002 = 20096;
                     short var345 = -32276;
                     var7[0] = "Frozen Scythe";
                     var10002 = 20064;
                     short var346 = -13418;
                     var7[1] = "Glacial Scythe";
                     var10002 = 20009;
                     short var347 = 1248;
                     var7[2] = "Spirit Sceptre";
                     var10002 = 20019;
                     short var348 = -24918;
                     var7[3] = "Dreadlord";
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = CollectionsKt.plus(
                        CollectionsKt.listOf(var7), lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
                     );
                     var7 = new String[23];
                     var10002 = 19984;
                     short var349 = 17727;
                     var7[0] = "Fractured Mithril Pickaxe";
                     var10002 = 20073;
                     short var350 = -16511;
                     var7[1] = "Bandaged Mithril Pickaxe";
                     var10002 = 20083;
                     short var351 = 29623;
                     var7[2] = "Mithril Pickaxe";
                     var10002 = 19994;
                     short var352 = 12211;
                     var7[3] = "Jungle Pickaxe";
                     var10002 = 20114;
                     short var353 = 23232;
                     var7[4] = "Refined Mithril Pickaxe";
                     var10002 = 20175;
                     short var354 = -20007;
                     var7[5] = "Rusty Titanium Pickaxe";
                     var10002 = 19983;
                     short var355 = 10026;
                     var7[6] = "Titanium Pickaxe";
                     var10002 = 20007;
                     short var356 = -3101;
                     var7[7] = "Polished Titanium Pickaxe";
                     var10002 = 19987;
                     short var357 = 12796;
                     var7[8] = "Stonk";
                     var10002 = 20138;
                     short var358 = 210;
                     var7[9] = "Pickonimbus 2000";
                     var10002 = 20082;
                     short var359 = 18929;
                     var7[10] = "Bingonimbus 2000";
                     var10002 = 19986;
                     short var360 = 15597;
                     var7[11] = "Gemstone Gauntlet";
                     var10002 = 20088;
                     short var361 = -7018;
                     var7[12] = "Mithril Drill SX-R226";
                     var10002 = 20130;
                     short var362 = 25571;
                     var7[13] = "Mithril Drill SX-R326";
                     var10002 = 20111;
                     short var363 = -15737;
                     var7[14] = "Titanium Drill DR-X355";
                     var10002 = 20135;
                     short var364 = 16774;
                     var7[15] = "Titanium Drill DR-X455";
                     var10002 = 20091;
                     short var365 = -15434;
                     var7[16] = "Titanium Drill DR-X555";
                     var10002 = 19990;
                     short var366 = 13275;
                     var7[17] = "Titanium Drill DR-X655";
                     var10002 = 20000;
                     short var367 = -1641;
                     var7[18] = "Divan's Drill";
                     var10002 = 20211;
                     short var368 = 29104;
                     var7[19] = "Ruby Drill TX-15";
                     var10002 = 20022;
                     short var369 = -31100;
                     var7[20] = "Gemstone Drill LT-522";
                     var10002 = 20115;
                     short var370 = -8588;
                     var7[21] = "Topaz Drill KGR-12";
                     var10002 = 20212;
                     short var371 = -28702;
                     var7[22] = "Jasper Drill X";
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = CollectionsKt.listOf(var7);
                     var7 = new String[22];
                     var10002 = 20214;
                     short var372 = 3603;
                     var7[0] = "Fractured Mithril Pickaxe";
                     var10002 = 20092;
                     short var373 = -22757;
                     var7[1] = "Bandaged Mithril Pickaxe";
                     var10002 = 20069;
                     short var374 = -1963;
                     var7[2] = "Mithril Pickaxe";
                     var10002 = 20197;
                     short var375 = 6971;
                     var7[3] = "Jungle Pickaxe";
                     var10002 = 20029;
                     short var376 = 411;
                     var7[4] = "Refined Mithril Pickaxe";
                     var10002 = 19993;
                     short var377 = -7941;
                     var7[5] = "Rusty Titanium Pickaxe";
                     var10002 = 20014;
                     short var378 = 4292;
                     var7[6] = "Titanium Pickaxe";
                     var10002 = 20192;
                     short var379 = -23243;
                     var7[7] = "Polished Titanium Pickaxe";
                     var10002 = 20098;
                     short var380 = -12420;
                     var7[8] = "Pickonimbus 2000";
                     var10002 = 20198;
                     short var381 = -14819;
                     var7[9] = "Bingonimbus 2000";
                     var10002 = 19986;
                     short var382 = 15597;
                     var7[10] = "Gemstone Gauntlet";
                     var10002 = 20067;
                     short var383 = 11725;
                     var7[11] = "Mithril Drill SX-R226";
                     var10002 = 20156;
                     short var384 = -20950;
                     var7[12] = "Mithril Drill SX-R326";
                     var10002 = 20103;
                     short var385 = 15860;
                     var7[13] = "Titanium Drill DR-X355";
                     var10002 = 20167;
                     short var386 = 21149;
                     var7[14] = "Titanium Drill DR-X455";
                     var10002 = 19980;
                     short var387 = -27500;
                     var7[15] = "Titanium Drill DR-X555";
                     var10002 = 19968;
                     short var388 = 15514;
                     var7[16] = "Titanium Drill DR-X655";
                     var10002 = 20001;
                     short var389 = 1962;
                     var7[17] = "Divan's Drill";
                     var10002 = 20148;
                     short var390 = -20955;
                     var7[18] = "Ruby Drill TX-15";
                     var10002 = 20157;
                     short var391 = -12850;
                     var7[19] = "Gemstone Drill LT-522";
                     var10002 = 20219;
                     short var392 = -13312;
                     var7[20] = "Topaz Drill KGR-12";
                     var10002 = 20222;
                     short var393 = 20851;
                     var7[21] = "Jasper Drill X";
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = CollectionsKt.listOf(var7);
                     var7 = new String[10];
                     var10002 = 20156;
                     short var394 = -20950;
                     var7[0] = "Mithril Drill SX-R326";
                     var10002 = 20103;
                     short var395 = 15860;
                     var7[1] = "Titanium Drill DR-X355";
                     var10002 = 20167;
                     short var396 = 21149;
                     var7[2] = "Titanium Drill DR-X455";
                     var10002 = 19980;
                     short var397 = -27500;
                     var7[3] = "Titanium Drill DR-X555";
                     var10002 = 19968;
                     short var398 = 15514;
                     var7[4] = "Titanium Drill DR-X655";
                     var10002 = 20001;
                     short var399 = 1962;
                     var7[5] = "Divan's Drill";
                     var10002 = 20148;
                     short var400 = -20955;
                     var7[6] = "Ruby Drill TX-15";
                     var10002 = 20157;
                     short var401 = -12850;
                     var7[7] = "Gemstone Drill LT-522";
                     var10002 = 20219;
                     short var402 = -13312;
                     var7[8] = "Topaz Drill KGR-12";
                     var10002 = 20222;
                     short var403 = 20851;
                     var7[9] = "Jasper Drill X";
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = CollectionsKt.listOf(var7);
                     var7 = new String[31];
                     var10002 = 20143;
                     short var404 = 24977;
                     var7[0] = "AATROX_BATPHONE";
                     var10002 = 20208;
                     short var405 = 10900;
                     var7[1] = "ABIPHONE_X_RED";
                     var10002 = 20179;
                     short var406 = -22161;
                     var7[2] = "ABIPHONE_X_BLUE";
                     var10002 = 19992;
                     short var407 = -3834;
                     var7[3] = "ABIPHONE_X_PLUS";
                     var10002 = 20025;
                     short var408 = -29724;
                     var7[4] = "ABIPHONE_X_PLUS_SPECIAL_EDITION";
                     var10002 = 19973;
                     short var409 = -27048;
                     var7[5] = "ABIPHONE_XI_YELLOW";
                     var10002 = 20124;
                     short var410 = -18287;
                     var7[6] = "ABIPHONE_XI_GREEN";
                     var10002 = 20089;
                     short var411 = 6893;
                     var7[7] = "ABIPHONE_XI_ULTRA";
                     var10002 = 20026;
                     short var412 = -4391;
                     var7[8] = "ABIPHONE_XI_ULTRA_STYLE";
                     var10002 = 20109;
                     short var413 = -12748;
                     var7[9] = "ABIPHONE_XII_AMBER";
                     var10002 = 20206;
                     short var414 = -9458;
                     var7[10] = "ABIPHONE_XII_AMETHYST";
                     var10002 = 20016;
                     short var415 = 8613;
                     var7[11] = "ABIPHONE_XII_MEGA";
                     var10002 = 19985;
                     short var416 = -30810;
                     var7[12] = "ABIPHONE_XII_MEGA_COLOR";
                     var10002 = 20110;
                     short var417 = 1190;
                     var7[13] = "ABIPHONE_XIII_JADE";
                     var10002 = 20129;
                     short var418 = 21499;
                     var7[14] = "ABIPHONE_XIII_SAPPHIRE";
                     var10002 = 20195;
                     short var419 = 1179;
                     var7[15] = "ABIPHONE_XIII_PRO";
                     var10002 = 20154;
                     short var420 = 1368;
                     var7[16] = "ABIPHONE_XIII_PRO_GIGA";
                     var10002 = 20193;
                     short var421 = -25219;
                     var7[17] = "ABIPHONE_XIV_ORANGE";
                     var10002 = 20100;
                     short var422 = -1786;
                     var7[18] = "ABIPHONE_XIV_BLACK";
                     var10002 = 20141;
                     short var423 = -26874;
                     var7[19] = "ABIPHONE_XIV_PURPLE";
                     var10002 = 19999;
                     short var424 = 7401;
                     var7[20] = "ABIPHONE_XIV_ENORMOUS";
                     var10002 = 20085;
                     short var425 = -14468;
                     var7[21] = "ABIPHONE_XIV_ENORMOUS_PURPLE";
                     var10002 = 19981;
                     short var426 = 25440;
                     var7[22] = "ABIPHONE_XIV_ENORMOUS_BLACK";
                     var10002 = 20125;
                     short var427 = -29570;
                     var7[23] = "ABIPHONE_FLIP_DRAGON";
                     var10002 = 20137;
                     short var428 = 5837;
                     var7[24] = "ABIPHONE_FLIP_NUCLEUS";
                     var10002 = 20132;
                     short var429 = 31459;
                     var7[25] = "ABIPHONE_FLIP_VOLCANO";
                     var10002 = 20086;
                     short var430 = -24224;
                     var7[26] = "ABIPHONE_FLIP_PLUS_FLOWER";
                     var10002 = 20176;
                     short var431 = -16462;
                     var7[27] = "ABIPHONE_FLIP_PLUS_CLOCKWORK";
                     var10002 = 20030;
                     short var432 = 19805;
                     var7[28] = "ABIPHONE_FLIP_PLUS_LUNAR";
                     var10002 = 20122;
                     short var433 = -2756;
                     var7[29] = "ABINGOPHONE";
                     var10002 = 20180;
                     short var434 = 3341;
                     var7[30] = "ABINGOPHONE_PLUS";
                     llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = CollectionsKt.listOf(var7);
                     var238 = CollectionsKt.joinToString(
                        (Iterable)IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e(),
                        "|",
                        null,
                        null,
                        0,
                        null,
                        IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI::aPX);
                     short var442 = 19975;
                     short var447 = 20676;
                     IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new Regex("(" + var238 + ") ?([A-Z ]+)?");
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var9);
                  break;
               default:
                  var5[var3++] = var238;
                  if ((var9 += var1) < var4) {
                     var1 = var2.charAt(var9);
                     continue label52;
                  }

                  var2 = "G&\n¤\rt\u001f\u0086·pò±(ý[\r3\rIÓ1Ï|\u0016¨\\ë·ë";
                  var4 = "G&\n¤\rt\u001f\u0086·pò±(ý[\r3\rIÓ1Ï|\u0016¨\\ë·ë".length();
                  var1 = 15;
                  var9 = -1;
            }

            var10000 = 118;
            var10001 = var2.substring(++var9, var9 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   public static void b(int[] var0) {
      IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var0;
   }

   public static int[] x() {
      return IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 20128) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 242;
            case 1 -> 183;
            case 2 -> 49;
            case 3 -> 197;
            case 4 -> 126;
            case 5 -> 58;
            case 6 -> 118;
            case 7 -> 171;
            case 8 -> 104;
            case 9 -> 53;
            case 10 -> 46;
            case 11 -> 87;
            case 12 -> 211;
            case 13 -> 25;
            case 14 -> 78;
            case 15 -> 89;
            case 16 -> 158;
            case 17 -> 244;
            case 18 -> 227;
            case 19 -> 173;
            case 20 -> 155;
            case 21 -> 70;
            case 22 -> 181;
            case 23 -> 140;
            case 24 -> 79;
            case 25 -> 178;
            case 26 -> 64;
            case 27 -> 105;
            case 28 -> 185;
            case 29 -> 160;
            case 30 -> 253;
            case 31 -> 93;
            case 32 -> 81;
            case 33 -> 77;
            case 34 -> 5;
            case 35 -> 190;
            case 36 -> 134;
            case 37 -> 153;
            case 38 -> 10;
            case 39 -> 141;
            case 40 -> 193;
            case 41 -> 100;
            case 42 -> 24;
            case 43 -> 239;
            case 44 -> 108;
            case 45 -> 18;
            case 46 -> 33;
            case 47 -> 0;
            case 48 -> 119;
            case 49 -> 8;
            case 50 -> 168;
            case 51 -> 9;
            case 52 -> 113;
            case 53 -> 50;
            case 54 -> 19;
            case 55 -> 6;
            case 56 -> 150;
            case 57 -> 117;
            case 58 -> 201;
            case 59 -> 231;
            case 60 -> 16;
            case 61 -> 72;
            case 62 -> 41;
            case 63 -> 233;
            case 64 -> 230;
            case 65 -> 14;
            case 66 -> 217;
            case 67 -> 146;
            case 68 -> 61;
            case 69 -> 206;
            case 70 -> 172;
            case 71 -> 73;
            case 72 -> 224;
            case 73 -> 195;
            case 74 -> 255;
            case 75 -> 182;
            case 76 -> 209;
            case 77 -> 1;
            case 78 -> 249;
            case 79 -> 210;
            case 80 -> 80;
            case 81 -> 152;
            case 82 -> 216;
            case 83 -> 112;
            case 84 -> 83;
            case 85 -> 188;
            case 86 -> 235;
            case 87 -> 30;
            case 88 -> 63;
            case 89 -> 214;
            case 90 -> 247;
            case 91 -> 86;
            case 92 -> 221;
            case 93 -> 90;
            case 94 -> 186;
            case 95 -> 226;
            case 96 -> 136;
            case 97 -> 200;
            case 98 -> 28;
            case 99 -> 238;
            case 100 -> 215;
            case 101 -> 246;
            case 102 -> 97;
            case 103 -> 234;
            case 104 -> 124;
            case 105 -> 35;
            case 106 -> 12;
            case 107 -> 111;
            case 108 -> 192;
            case 109 -> 128;
            case 110 -> 180;
            case 111 -> 123;
            case 112 -> 154;
            case 113 -> 138;
            case 114 -> 4;
            case 115 -> 98;
            case 116 -> 163;
            case 117 -> 94;
            case 118 -> 44;
            case 119 -> 218;
            case 120 -> 245;
            case 121 -> 137;
            case 122 -> 101;
            case 123 -> 75;
            case 124 -> 31;
            case 125 -> 131;
            case 126 -> 17;
            case 127 -> 237;
            case 128 -> 177;
            case 129 -> 36;
            case 130 -> 147;
            case 131 -> 207;
            case 132 -> 85;
            case 133 -> 120;
            case 134 -> 34;
            case 135 -> 203;
            case 136 -> 45;
            case 137 -> 103;
            case 138 -> 92;
            case 139 -> 62;
            case 140 -> 132;
            case 141 -> 194;
            case 142 -> 187;
            case 143 -> 219;
            case 144 -> 170;
            case 145 -> 54;
            case 146 -> 51;
            case 147 -> 65;
            case 148 -> 95;
            case 149 -> 121;
            case 150 -> 71;
            case 151 -> 220;
            case 152 -> 59;
            case 153 -> 241;
            case 154 -> 22;
            case 155 -> 52;
            case 156 -> 32;
            case 157 -> 162;
            case 158 -> 176;
            case 159 -> 7;
            case 160 -> 232;
            case 161 -> 68;
            case 162 -> 125;
            case 163 -> 114;
            case 164 -> 91;
            case 165 -> 148;
            case 166 -> 248;
            case 167 -> 161;
            case 168 -> 252;
            case 169 -> 42;
            case 170 -> 88;
            case 171 -> 251;
            case 172 -> 212;
            case 173 -> 82;
            case 174 -> 116;
            case 175 -> 149;
            case 176 -> 223;
            case 177 -> 11;
            case 178 -> 167;
            case 179 -> 122;
            case 180 -> 55;
            case 181 -> 60;
            case 182 -> 102;
            case 183 -> 2;
            case 184 -> 228;
            case 185 -> 76;
            case 186 -> 159;
            case 187 -> 106;
            case 188 -> 66;
            case 189 -> 139;
            case 190 -> 157;
            case 191 -> 236;
            case 192 -> 243;
            case 193 -> 240;
            case 194 -> 184;
            case 195 -> 222;
            case 196 -> 144;
            case 197 -> 174;
            case 198 -> 179;
            case 199 -> 99;
            case 200 -> 133;
            case 201 -> 135;
            case 202 -> 175;
            case 203 -> 165;
            case 204 -> 250;
            case 205 -> 164;
            case 206 -> 145;
            case 207 -> 143;
            case 208 -> 69;
            case 209 -> 229;
            case 210 -> 27;
            case 211 -> 96;
            case 212 -> 166;
            case 213 -> 204;
            case 214 -> 3;
            case 215 -> 39;
            case 216 -> 57;
            case 217 -> 13;
            case 218 -> 21;
            case 219 -> 127;
            case 220 -> 151;
            case 221 -> 196;
            case 222 -> 198;
            case 223 -> 37;
            case 224 -> 23;
            case 225 -> 142;
            case 226 -> 208;
            case 227 -> 115;
            case 228 -> 202;
            case 229 -> 213;
            case 230 -> 43;
            case 231 -> 109;
            case 232 -> 84;
            case 233 -> 254;
            case 234 -> 29;
            case 235 -> 156;
            case 236 -> 26;
            case 237 -> 110;
            case 238 -> 67;
            case 239 -> 56;
            case 240 -> 48;
            case 241 -> 225;
            case 242 -> 191;
            case 243 -> 40;
            case 244 -> 38;
            case 245 -> 199;
            case 246 -> 15;
            case 247 -> 130;
            case 248 -> 20;
            case 249 -> 47;
            case 250 -> 169;
            case 251 -> 189;
            case 252 -> 107;
            case 253 -> 129;
            case 254 -> 205;
            default -> 74;
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

   public static enum IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
      lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
      lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;

      private static IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = {lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll, IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII, llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI, lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI};
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(Object... px) {
           this("", "", (ChatFormatting)null); // PX-FIX: 委托主构造器（final 字段初始化）
        }

      @NotNull
      private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final ChatFormatting IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;

      private IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(String var3, String var4, ChatFormatting var5) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var3;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var4;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var5;
      }

      @NotNull
      public final String a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final String b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final ChatFormatting c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public static IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] d() {
         return (IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[])lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.clone();
      }

      public static IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
         String var0
      ) {
         return Enum.valueOf(
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> e() {
         return lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final EnumEntries<IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = kotlin.enums.EnumEntriesKt.enumEntries(lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl);
   
      // PX-FIX-ok: synthetic array factory (jar: anewarray + getstatic fill + areturn)
      private static final me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] f() {
         return new me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[]{
            lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
            IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
            IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
            IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
            lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
            IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
            llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
            lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
            lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
         };
      }
}

   public static enum IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;

      public static IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] a() {
         return (IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[])IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.clone();
      }

      public static IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         String var0
      ) {
         return Enum.valueOf(
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> b() {
         return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[]{IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI};
      private static final EnumEntries<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = kotlin.enums.EnumEntriesKt.enumEntries(IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
   
      // PX-FIX-ok: synthetic array factory (jar: anewarray + getstatic fill + areturn)
      private static final me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] c() {
         return new me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[]{
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
            lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         };
      }
}

   public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
      IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var0, boolean var1, int var2, Object var3
   ) { // SYNB1-defaultarg
      if ((var2 & 1) != 0) {
         var1 = false;
      }

      return var0.a(var1);
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @NotNull
      public static IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.PXEvBase IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final ItemStack lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @NotNull
      private final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      @NotNull
      private static IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         @NotNull ItemStack var1,
         int var2,
         @NotNull IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3
      ) {
         short var10001 = -30548;
         short var10002 = -21790;
         Intrinsics.checkNotNullParameter(var1, "item");
         var10001 = -30552;
         var10002 = 2779;
         Intrinsics.checkNotNullParameter(var3, "type");
         super();
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var2;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var3;
      }

      @NotNull
      public final ItemStack a() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int b() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI c() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final ItemStack d() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int e() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI f() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         @NotNull ItemStack var1,
         int var2,
         @NotNull IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3
      ) {
         short var10001 = -30551;
         short var10002 = -24835;
         Intrinsics.checkNotNullParameter(var1, "item");
         var10001 = -30546;
         var10002 = 11482;
         Intrinsics.checkNotNullParameter(var3, "type");
         return new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -30549;
         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         int var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         ItemStack var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         short var10001 = 4680;
         short var10002 = -30545;
         short var10003 = -5660;
         short var10004 = -30547;
         short var10005 = 30391;
         return "InventoryItem(item=" + var3 + ", slot=" + var2 + ", type=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
         var1 = var1 * 31 + Integer.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         return var1 * 31 + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = h();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         int var4 = ((Intrinsics.areEqual(
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         )) ? 1 : 0);
         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            if (var2 == null) {
               return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                  == var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            }

            var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         return var4 != var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            ? false
            : this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
               == var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: { // PX-FIX
      char[] var21 = null; // PX-FIX
         String[] var5 = new String[8];
         int var3 = 0;
         String var2 = ".\n§²\u0004oÍ$î\u0005Ð@Oxî\u0013\u0011dÜ\u008aI\u008d\u0011\u0089÷¬\u001c\u0094u\u0087·\u0087?§\u0017\u0004U\u0098cD\u0007v#ûùñm\u0089";
         int var4 = ".\n§²\u0004oÍ$î\u0005Ð@Oxî\u0013\u0011dÜ\u008aI\u008d\u0011\u0089÷¬\u001c\u0094u\u0087·\u0087?§\u0017\u0004U\u0098cD\u0007v#ûùñm\u0089"
            .length();
         char var1 = 4;
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[5];
         int var8 = -1;
         b(var10000);

         label52:
         while (true) {
            byte var9 = 101;
            String var10001 = var2.substring(++var8, var8 + var1);
            byte var10002 = -1;

            while (true) {
               label47: {
                  char[] var26 = var10001.toCharArray();
                  int var10004 = var26.length;
                  int var6 = 0;
                  byte var29 = var9;
                  var21 = var26;
                  int var15 = var10004;
                  byte var34;
                  char[] var39;
                  int var10006;
                  if (var10004 <= 1) {
                     var39 = var26;
                     var34 = var9;
                     var10006 = var6;
                  } else {
                     var29 = var9;
                     var15 = var10004;
                     if (var10004 <= var6) {
                        break label47;
                     }

                     var39 = var26;
                     var34 = var9;
                     var10006 = var6;
                  }

                  while (true) {
                     var39[var10006] = (char)(var39[var10006] ^ var34 ^ switch (var6 % 7) {
                        case 0 -> 120;
                        case 1 -> 96;
                        case 2 -> 46;
                        case 3 -> 5;
                        case 4 -> 8;
                        case 5 -> 8;
                        default -> 60;
                     });
                     var6++;
                     if (var29 == 0) {
                        var10006 = var29;
                        var39 = var21;
                        var34 = var29;
                     } else {
                        if (var15 <= var6) {
                           break;
                        }

                        var39 = var21;
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
                        b = new String[8];
                        IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.PXEvBase(
            (kotlin.jvm.internal.DefaultConstructorMarker)null
                        );
                        ItemStack var25 = ItemStack.EMPTY;
                        short var38 = -30550;
                        short var43 = -2185;
                        Intrinsics.checkNotNullExpressionValue(ItemStack.EMPTY, "EMPTY");
                        IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                           var25,
                           0,
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                        );
                        break pxClinit; // PX-FIX
                     }

                     var1 = var2.charAt(var8);
                     break;
                  default:
                     var5[var3++] = var31;
                     if ((var8 += var1) < var4) {
                        var1 = var2.charAt(var8);
                        continue label52;
                     }

                     var2 = "3Hû\u0005\u0007\u001aó\u008e\tX*¿";
                     var4 = "3Hû\u0005\u0007\u001aó\u008e\tX*¿".length();
                     var1 = 4;
                     var8 = -1;
               }

               var9 = 48;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
   } // PX-FIX end pxClinit
      }

      public static void b(me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var0) {
         IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var0;
      }

      public static me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] h() {
         return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -30552) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 243;
               case 1 -> 26;
               case 2 -> 200;
               case 3 -> 179;
               case 4 -> 40;
               case 5 -> 125;
               case 6 -> 61;
               case 7 -> 70;
               case 8 -> 12;
               case 9 -> 129;
               case 10 -> 211;
               case 11 -> 77;
               case 12 -> 3;
               case 13 -> 194;
               case 14 -> 53;
               case 15 -> 131;
               case 16 -> 228;
               case 17 -> 100;
               case 18 -> 99;
               case 19 -> 142;
               case 20 -> 63;
               case 21 -> 245;
               case 22 -> 241;
               case 23 -> 178;
               case 24 -> 201;
               case 25 -> 127;
               case 26 -> 223;
               case 27 -> 48;
               case 28 -> 175;
               case 29 -> 253;
               case 30 -> 188;
               case 31 -> 34;
               case 32 -> 57;
               case 33 -> 37;
               case 34 -> 151;
               case 35 -> 160;
               case 36 -> 114;
               case 37 -> 30;
               case 38 -> 44;
               case 39 -> 128;
               case 40 -> 184;
               case 41 -> 88;
               case 42 -> 144;
               case 43 -> 103;
               case 44 -> 11;
               case 45 -> 46;
               case 46 -> 242;
               case 47 -> 62;
               case 48 -> 49;
               case 49 -> 172;
               case 50 -> 180;
               case 51 -> 148;
               case 52 -> 237;
               case 53 -> 199;
               case 54 -> 76;
               case 55 -> 27;
               case 56 -> 31;
               case 57 -> 41;
               case 58 -> 50;
               case 59 -> 42;
               case 60 -> 220;
               case 61 -> 58;
               case 62 -> 81;
               case 63 -> 157;
               case 64 -> 122;
               case 65 -> 208;
               case 66 -> 156;
               case 67 -> 22;
               case 68 -> 173;
               case 69 -> 6;
               case 70 -> 119;
               case 71 -> 94;
               case 72 -> 193;
               case 73 -> 16;
               case 74 -> 248;
               case 75 -> 149;
               case 76 -> 108;
               case 77 -> 170;
               case 78 -> 93;
               case 79 -> 219;
               case 80 -> 166;
               case 81 -> 21;
               case 82 -> 102;
               case 83 -> 134;
               case 84 -> 109;
               case 85 -> 217;
               case 86 -> 14;
               case 87 -> 150;
               case 88 -> 121;
               case 89 -> 240;
               case 90 -> 216;
               case 91 -> 238;
               case 92 -> 191;
               case 93 -> 145;
               case 94 -> 236;
               case 95 -> 2;
               case 96 -> 202;
               case 97 -> 126;
               case 98 -> 82;
               case 99 -> 65;
               case 100 -> 255;
               case 101 -> 116;
               case 102 -> 195;
               case 103 -> 210;
               case 104 -> 43;
               case 105 -> 251;
               case 106 -> 35;
               case 107 -> 112;
               case 108 -> 234;
               case 109 -> 23;
               case 110 -> 146;
               case 111 -> 132;
               case 112 -> 244;
               case 113 -> 89;
               case 114 -> 226;
               case 115 -> 196;
               case 116 -> 231;
               case 117 -> 0;
               case 118 -> 141;
               case 119 -> 130;
               case 120 -> 5;
               case 121 -> 1;
               case 122 -> 97;
               case 123 -> 203;
               case 124 -> 140;
               case 125 -> 221;
               case 126 -> 117;
               case 127 -> 143;
               case 128 -> 249;
               case 129 -> 158;
               case 130 -> 115;
               case 131 -> 161;
               case 132 -> 74;
               case 133 -> 47;
               case 134 -> 168;
               case 135 -> 110;
               case 136 -> 8;
               case 137 -> 186;
               case 138 -> 163;
               case 139 -> 139;
               case 140 -> 15;
               case 141 -> 107;
               case 142 -> 55;
               case 143 -> 155;
               case 144 -> 218;
               case 145 -> 133;
               case 146 -> 247;
               case 147 -> 227;
               case 148 -> 75;
               case 149 -> 209;
               case 150 -> 176;
               case 151 -> 162;
               case 152 -> 171;
               case 153 -> 64;
               case 154 -> 90;
               case 155 -> 153;
               case 156 -> 51;
               case 157 -> 197;
               case 158 -> 164;
               case 159 -> 4;
               case 160 -> 198;
               case 161 -> 59;
               case 162 -> 19;
               case 163 -> 87;
               case 164 -> 80;
               case 165 -> 229;
               case 166 -> 96;
               case 167 -> 174;
               case 168 -> 28;
               case 169 -> 185;
               case 170 -> 101;
               case 171 -> 215;
               case 172 -> 206;
               case 173 -> 13;
               case 174 -> 254;
               case 175 -> 73;
               case 176 -> 68;
               case 177 -> 187;
               case 178 -> 204;
               case 179 -> 230;
               case 180 -> 10;
               case 181 -> 250;
               case 182 -> 60;
               case 183 -> 95;
               case 184 -> 167;
               case 185 -> 24;
               case 186 -> 120;
               case 187 -> 177;
               case 188 -> 36;
               case 189 -> 183;
               case 190 -> 106;
               case 191 -> 105;
               case 192 -> 72;
               case 193 -> 113;
               case 194 -> 165;
               case 195 -> 154;
               case 196 -> 135;
               case 197 -> 235;
               case 198 -> 92;
               case 199 -> 152;
               case 200 -> 138;
               case 201 -> 118;
               case 202 -> 190;
               case 203 -> 233;
               case 204 -> 137;
               case 205 -> 239;
               case 206 -> 104;
               case 207 -> 66;
               case 208 -> 181;
               case 209 -> 85;
               case 210 -> 224;
               case 211 -> 71;
               case 212 -> 98;
               case 213 -> 45;
               case 214 -> 56;
               case 215 -> 38;
               case 216 -> 67;
               case 217 -> 91;
               case 218 -> 182;
               case 219 -> 33;
               case 220 -> 225;
               case 221 -> 111;
               case 222 -> 205;
               case 223 -> 54;
               case 224 -> 83;
               case 225 -> 86;
               case 226 -> 39;
               case 227 -> 18;
               case 228 -> 246;
               case 229 -> 52;
               case 230 -> 189;
               case 231 -> 7;
               case 232 -> 69;
               case 233 -> 169;
               case 234 -> 123;
               case 235 -> 29;
               case 236 -> 84;
               case 237 -> 232;
               case 238 -> 25;
               case 239 -> 79;
               case 240 -> 136;
               case 241 -> 192;
               case 242 -> 214;
               case 243 -> 147;
               case 244 -> 78;
               case 245 -> 159;
               case 246 -> 17;
               case 247 -> 207;
               case 248 -> 124;
               case 249 -> 222;
               case 250 -> 212;
               case 251 -> 32;
               case 252 -> 252;
               case 253 -> 9;
               case 254 -> 20;
               default -> 213;
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

      public static final class PXEvBase {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public PXEvBase(Object... px) {
        }

         private PXEvBase() {
         }

         @NotNull
         public final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a() {
            return IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         }
      
      // PX-FIX-ok: Kotlin synthetic default-ctor bridge (jar: <init>(DefaultConstructorMarker)V -> this())
      public PXEvBase(kotlin.jvm.internal.DefaultConstructorMarker var1) {
         this();
      }
}
   
      // PX-FIX-ok: synthetic accessor (jar: getstatic/areturn)
      public static final me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll g() {
         return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      // PX-FIX-ok: Kotlin $default bridge (synthetic; jar body translated 1:1)
      public static final me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0, net.minecraft.world.item.ItemStack var1, int var2, me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3, int var4, java.lang.Object var5) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var6 = h();
         if ((var4 & 1) != 0) {
            if (var6 != null) {
               var1 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }
         }
         if ((var4 & 2) != 0) {
            if (var6 != null) {
               var2 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }
         }
         if ((var4 & 4) != 0) {
            var3 = var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }
         return var0.a(var1, var2, var3);
      }
}
}
