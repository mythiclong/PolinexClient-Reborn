package me.octo.client.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.mixin.accessors.AbstractContainerScreenAccessor;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.world.inventory.Slot;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl {
   @NotNull
   public static lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Map<String, List<lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll>> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] a;
   private static String[] b;

   private lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl() {
   }

   public final void a(
      @NotNull String var1,
      @NotNull List<lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> var2
   ) {
      short var10001 = -6923;
      short var10002 = -11969;
      Intrinsics.checkNotNullParameter(var1, "key");
      var10001 = -6914;
      var10002 = 2661;
      Intrinsics.checkNotNullParameter(var2, "highlights");
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.put(var1, var2);
   }

   public final void a(@NotNull String var1, int var2, int var3) {
      List var7;
      label15: {
         int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
         short var10002 = -6913;
         short var10003 = -5935;
         Intrinsics.checkNotNullParameter(var1, "key");
         int[] var4 = var10000;
         if (var4 != null) {
            var7 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.get(var1);
            if (var7 != null) {
               var7 = CollectionsKt.toMutableList(var7);
               if (var7 != null) {
                  break label15;
               }
            }
         }

         var7 = new ArrayList();
      }

      List var5 = var7;
      var5.add(
         new lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var2, var3
         )
      );
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.put(var1, var5);
   }

   public final void a(@NotNull String var1) {
      short var10001 = -6923;
      short var10002 = -11969;
      Intrinsics.checkNotNullParameter(var1, "key");
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.remove(var1);
   }

   public final void a() {
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.clear();
   }

   public final void a(@NotNull GuiGraphicsExtractor var1, @NotNull AbstractContainerScreen<?> var2) {
      short var10001 = -6928;
      short var10002 = 5094;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = -6925;
      var10002 = -20291;
      Intrinsics.checkNotNullParameter(var2, "screen");
      Iterable var4 = CollectionsKt.flatten(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.values());
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      boolean var5 = false;
      Iterator var6 = var4.iterator();
      int[] var3 = var10000;

      while (var6.hasNext()) {
         Object var7 = var6.next();
         lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var8 = (lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var7;
         boolean var9 = false;
         if (var3 != null) {
            if (var3 != null && var8.a() < var2.getMenu().slots.size()) {
               Slot var11 = var2.getMenu().getSlot(var8.a());
               var10002 = -6924;
               short var10003 = -5670;
               Intrinsics.checkNotNullExpressionValue(var11, "getSlot(...)");
               Slot var10 = var11;
               IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var1, var2, var10, var8.b());
            }

            if (var3 != null) {
               continue;
            }
         }
         break;
      }
   }

   public final void a(@NotNull GuiGraphicsExtractor var1, @NotNull AbstractContainerScreen<?> var2, @NotNull Slot var3, int var4) {
      short var10001 = -6921;
      short var10002 = 16929;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = -6926;
      var10002 = -2879;
      Intrinsics.checkNotNullParameter(var2, "screen");
      var10001 = -6922;
      var10002 = 11130;
      Intrinsics.checkNotNullParameter(var3, "slot");
      AbstractContainerScreenAccessor var5 = (AbstractContainerScreenAccessor)var2;
      int var6 = var3.x + var5.getLeftPos();
      int var7 = var3.y + var5.getTopPos();
      var1.fill(var6, var7, var6 + 16, var7 + 16, var4);
   }

   public final void a(@NotNull GuiGraphicsExtractor var1, @NotNull AbstractContainerScreen<?> var2, @NotNull Slot var3, int var4, int var5) {
      short var10001 = -6928;
      short var10002 = 5094;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = -6925;
      var10002 = -20291;
      Intrinsics.checkNotNullParameter(var2, "screen");
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      var10002 = -6927;
      short var10003 = -13531;
      Intrinsics.checkNotNullParameter(var3, "slot");
      int[] var6 = var10000;
      AbstractContainerScreenAccessor var7 = (AbstractContainerScreenAccessor)var2;
      int var8 = var3.x + var7.getLeftPos();
      int var9 = var3.y + var7.getTopPos();
      int var10 = 0;

      while (var10 < var5) {
         var1.fill(var8 - var10, var9 - var10, var8 + 16 + var10, var9 - var10 + 1, var4);
         var1.fill(var8 - var10, var9 + 16 + var10 - 1, var8 + 16 + var10, var9 + 16 + var10, var4);
         var1.fill(var8 - var10, var9 - var10 + 1, var8 - var10 + 1, var9 + 16 + var10 - 1, var4);
         var1.fill(var8 + 16 + var10 - 1, var9 - var10 + 1, var8 + 16 + var10, var9 + 16 + var10 - 1, var4);
         var10++;
         if (var6 == null) {
            break;
         }
      }
   }

   @Nullable
   public final lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
      @NotNull String var1, int var2
   ) {
      Object var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      short var10002 = -6923;
      short var10003 = -11969;
      Intrinsics.checkNotNullParameter(var1, "key");
      Object var3 = var10000;
      if (var3 != null) {
         List var9 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.get(var1);
         if (var9 != null) {
            label34:
            for (Object var6 : var9) {
               var10000 = var6;

               do {
                  lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var7 = (lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
                  boolean var8 = false;
                  int var12 = var7.a();
                  if (var3 != null) {
                     var12 = var12 == var2 ? 1 : 0;
                  }

                  if (var12 == 0) {
                     continue label34;
                  }

                  var10000 = var6;
               } while (var3 == null);

               return (lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var6;
            }

            return (lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)null;
         }
      }

      return null;
   }

   public final boolean b(@NotNull String var1) {
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      short var10002 = -6923;
      short var10003 = -11969;
      Intrinsics.checkNotNullParameter(var1, "key");
      int[] var2 = var10000;
      Map var3 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      String var10001 = var1;
      if (var2 != null) {
         if (!lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.containsKey(var1)) {
            return false;
         }

         var3 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         var10001 = var1;
      }

      Object var4 = (List)var3.get(var10001);
      if (var2 != null) {
         if (var4 == null) {
            return false;
         }

         var4 = (Collection)var4;
      }

      boolean var5 = ((me.octo.client.PXDyn)var4).isEmpty();
      if (var2 != null) {
         var5 = !var5;
      }

      return var5;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[10];
      int var3 = 0;
      String var2 = "@ôÆ\u009f·í8\u0004Áôåü\u0003¤AD\fØ\u008cKüVU,\u0010½®\u0085¾\u0006\u0013W¢w¤Õ\u0006\u0090\u008aÒÌª¢\u0004~\u0092\u00120\u0007ñ\u0093ðsqpà";
      int var4 = "@ôÆ\u009f·í8\u0004Áôåü\u0003¤AD\fØ\u008cKüVU,\u0010½®\u0085¾\u0006\u0013W¢w¤Õ\u0006\u0090\u008aÒÌª¢\u0004~\u0092\u00120\u0007ñ\u0093ðsqpà"
         .length();
      char var1 = 7;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 18;
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
                     case 0 -> 77;
                     case 1 -> 20;
                     case 2 -> 86;
                     case 3 -> 37;
                     case 4 -> 51;
                     case 5 -> 104;
                     default -> 69;
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
                     b = new String[10];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl();
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new LinkedHashMap<>();
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "iW\u0015\nðC[[Í\u0013¤¶o\u0087";
                  var4 = "iW\u0015\nðC[[Í\u0013¤¶o\u0087".length();
                  var1 = 3;
                  var8 = -1;
            }

            var10000 = 118;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -6921) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 159;
            case 1 -> 70;
            case 2 -> 229;
            case 3 -> 111;
            case 4 -> 198;
            case 5 -> 41;
            case 6 -> 46;
            case 7 -> 184;
            case 8 -> 154;
            case 9 -> 122;
            case 10 -> 196;
            case 11 -> 166;
            case 12 -> 171;
            case 13 -> 81;
            case 14 -> 130;
            case 15 -> 204;
            case 16 -> 85;
            case 17 -> 239;
            case 18 -> 169;
            case 19 -> 18;
            case 20 -> 96;
            case 21 -> 158;
            case 22 -> 134;
            case 23 -> 34;
            case 24 -> 191;
            case 25 -> 55;
            case 26 -> 180;
            case 27 -> 173;
            case 28 -> 2;
            case 29 -> 208;
            case 30 -> 230;
            case 31 -> 165;
            case 32 -> 202;
            case 33 -> 211;
            case 34 -> 227;
            case 35 -> 163;
            case 36 -> 86;
            case 37 -> 150;
            case 38 -> 53;
            case 39 -> 157;
            case 40 -> 185;
            case 41 -> 75;
            case 42 -> 124;
            case 43 -> 79;
            case 44 -> 72;
            case 45 -> 241;
            case 46 -> 7;
            case 47 -> 128;
            case 48 -> 161;
            case 49 -> 115;
            case 50 -> 74;
            case 51 -> 54;
            case 52 -> 69;
            case 53 -> 133;
            case 54 -> 48;
            case 55 -> 35;
            case 56 -> 84;
            case 57 -> 82;
            case 58 -> 83;
            case 59 -> 222;
            case 60 -> 40;
            case 61 -> 186;
            case 62 -> 251;
            case 63 -> 188;
            case 64 -> 99;
            case 65 -> 223;
            case 66 -> 61;
            case 67 -> 30;
            case 68 -> 117;
            case 69 -> 144;
            case 70 -> 149;
            case 71 -> 192;
            case 72 -> 200;
            case 73 -> 95;
            case 74 -> 156;
            case 75 -> 116;
            case 76 -> 126;
            case 77 -> 187;
            case 78 -> 121;
            case 79 -> 51;
            case 80 -> 49;
            case 81 -> 148;
            case 82 -> 152;
            case 83 -> 177;
            case 84 -> 37;
            case 85 -> 87;
            case 86 -> 238;
            case 87 -> 56;
            case 88 -> 193;
            case 89 -> 67;
            case 90 -> 140;
            case 91 -> 94;
            case 92 -> 136;
            case 93 -> 233;
            case 94 -> 201;
            case 95 -> 195;
            case 96 -> 143;
            case 97 -> 168;
            case 98 -> 8;
            case 99 -> 27;
            case 100 -> 129;
            case 101 -> 52;
            case 102 -> 210;
            case 103 -> 132;
            case 104 -> 236;
            case 105 -> 212;
            case 106 -> 170;
            case 107 -> 44;
            case 108 -> 131;
            case 109 -> 151;
            case 110 -> 45;
            case 111 -> 23;
            case 112 -> 101;
            case 113 -> 73;
            case 114 -> 92;
            case 115 -> 242;
            case 116 -> 36;
            case 117 -> 1;
            case 118 -> 213;
            case 119 -> 19;
            case 120 -> 38;
            case 121 -> 57;
            case 122 -> 26;
            case 123 -> 76;
            case 124 -> 90;
            case 125 -> 12;
            case 126 -> 155;
            case 127 -> 183;
            case 128 -> 160;
            case 129 -> 253;
            case 130 -> 17;
            case 131 -> 203;
            case 132 -> 63;
            case 133 -> 78;
            case 134 -> 29;
            case 135 -> 250;
            case 136 -> 214;
            case 137 -> 182;
            case 138 -> 205;
            case 139 -> 16;
            case 140 -> 225;
            case 141 -> 42;
            case 142 -> 88;
            case 143 -> 179;
            case 144 -> 245;
            case 145 -> 62;
            case 146 -> 234;
            case 147 -> 105;
            case 148 -> 22;
            case 149 -> 255;
            case 150 -> 162;
            case 151 -> 113;
            case 152 -> 252;
            case 153 -> 235;
            case 154 -> 112;
            case 155 -> 106;
            case 156 -> 217;
            case 157 -> 190;
            case 158 -> 141;
            case 159 -> 172;
            case 160 -> 114;
            case 161 -> 240;
            case 162 -> 248;
            case 163 -> 58;
            case 164 -> 167;
            case 165 -> 181;
            case 166 -> 146;
            case 167 -> 39;
            case 168 -> 164;
            case 169 -> 89;
            case 170 -> 33;
            case 171 -> 24;
            case 172 -> 6;
            case 173 -> 109;
            case 174 -> 25;
            case 175 -> 120;
            case 176 -> 28;
            case 177 -> 98;
            case 178 -> 231;
            case 179 -> 43;
            case 180 -> 68;
            case 181 -> 237;
            case 182 -> 244;
            case 183 -> 91;
            case 184 -> 10;
            case 185 -> 60;
            case 186 -> 219;
            case 187 -> 249;
            case 188 -> 15;
            case 189 -> 206;
            case 190 -> 103;
            case 191 -> 123;
            case 192 -> 13;
            case 193 -> 80;
            case 194 -> 102;
            case 195 -> 178;
            case 196 -> 199;
            case 197 -> 138;
            case 198 -> 220;
            case 199 -> 31;
            case 200 -> 176;
            case 201 -> 197;
            case 202 -> 174;
            case 203 -> 194;
            case 204 -> 108;
            case 205 -> 77;
            case 206 -> 246;
            case 207 -> 5;
            case 208 -> 232;
            case 209 -> 139;
            case 210 -> 97;
            case 211 -> 64;
            case 212 -> 9;
            case 213 -> 71;
            case 214 -> 207;
            case 215 -> 118;
            case 216 -> 215;
            case 217 -> 32;
            case 218 -> 11;
            case 219 -> 218;
            case 220 -> 147;
            case 221 -> 50;
            case 222 -> 104;
            case 223 -> 4;
            case 224 -> 59;
            case 225 -> 125;
            case 226 -> 100;
            case 227 -> 47;
            case 228 -> 21;
            case 229 -> 228;
            case 230 -> 135;
            case 231 -> 243;
            case 232 -> 216;
            case 233 -> 209;
            case 234 -> 153;
            case 235 -> 142;
            case 236 -> 65;
            case 237 -> 14;
            case 238 -> 93;
            case 239 -> 145;
            case 240 -> 189;
            case 241 -> 119;
            case 242 -> 20;
            case 243 -> 221;
            case 244 -> 110;
            case 245 -> 127;
            case 246 -> 247;
            case 247 -> 137;
            case 248 -> 0;
            case 249 -> 224;
            case 250 -> 226;
            case 251 -> 175;
            case 252 -> 107;
            case 253 -> 66;
            case 254 -> 254;
            default -> 3;
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(int var1, int var2) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      }

      public final int a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int c() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int d() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         int var1, int var2
      ) {
         return new lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10002 = -24595;
         short var10003 = 21313;
         var10003 = -24596;
         short var10004 = -22314;
         return "SlotHighlight(slotId="
            + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            + ", color="
            + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         return var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int[] var2 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         int var10001 = var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var2 != null) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (var2 == null) {
               return (boolean)(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII != 0);
            }

            var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         return !(var4 != var10001);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: { // PX-FIX
         String[] var5 = new String[2];
         int var3 = 0;
         String var2 = "Û×\u008c'hxpõ}\u0013a}Ü¹ÄâK\u0081\u0091¡4\b³`\u001d\u000fó\u0003¶\t";
         int var4 = "Û×\u008c'hxpõ}\u0013a}Ü¹ÄâK\u0081\u0091¡4\b³`\u001d\u000fó\u0003¶\t".length();
         char var1 = 21;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 121;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 121;
                  var10006 = var6;
               } else {
                  var13 = 121;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 121;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 102;
                     case 1 -> 107;
                     case 2 -> 59;
                     case 3 -> 115;
                     case 4 -> 2;
                     case 5 -> 55;
                     default -> 77;
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
               break pxClinit; // PX-FIX
            }

            var1 = var2.charAt(var0);
         }
   } // PX-FIX end pxClinit
      }

      private static String b(int var0, int var1) {
         int var2 = (var0 ^ -24595) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 166;
               case 1 -> 134;
               case 2 -> 225;
               case 3 -> 176;
               case 4 -> 151;
               case 5 -> 222;
               case 6 -> 64;
               case 7 -> 63;
               case 8 -> 232;
               case 9 -> 66;
               case 10 -> 209;
               case 11 -> 2;
               case 12 -> 40;
               case 13 -> 45;
               case 14 -> 70;
               case 15 -> 138;
               case 16 -> 117;
               case 17 -> 220;
               case 18 -> 242;
               case 19 -> 80;
               case 20 -> 226;
               case 21 -> 10;
               case 22 -> 47;
               case 23 -> 102;
               case 24 -> 211;
               case 25 -> 147;
               case 26 -> 179;
               case 27 -> 62;
               case 28 -> 196;
               case 29 -> 77;
               case 30 -> 149;
               case 31 -> 227;
               case 32 -> 205;
               case 33 -> 164;
               case 34 -> 197;
               case 35 -> 195;
               case 36 -> 9;
               case 37 -> 163;
               case 38 -> 253;
               case 39 -> 178;
               case 40 -> 202;
               case 41 -> 180;
               case 42 -> 28;
               case 43 -> 72;
               case 44 -> 69;
               case 45 -> 213;
               case 46 -> 156;
               case 47 -> 22;
               case 48 -> 169;
               case 49 -> 21;
               case 50 -> 90;
               case 51 -> 56;
               case 52 -> 16;
               case 53 -> 224;
               case 54 -> 221;
               case 55 -> 245;
               case 56 -> 42;
               case 57 -> 20;
               case 58 -> 74;
               case 59 -> 60;
               case 60 -> 157;
               case 61 -> 252;
               case 62 -> 34;
               case 63 -> 171;
               case 64 -> 204;
               case 65 -> 15;
               case 66 -> 159;
               case 67 -> 48;
               case 68 -> 120;
               case 69 -> 248;
               case 70 -> 54;
               case 71 -> 142;
               case 72 -> 184;
               case 73 -> 216;
               case 74 -> 137;
               case 75 -> 116;
               case 76 -> 251;
               case 77 -> 208;
               case 78 -> 84;
               case 79 -> 30;
               case 80 -> 106;
               case 81 -> 103;
               case 82 -> 240;
               case 83 -> 158;
               case 84 -> 57;
               case 85 -> 153;
               case 86 -> 58;
               case 87 -> 189;
               case 88 -> 207;
               case 89 -> 255;
               case 90 -> 46;
               case 91 -> 44;
               case 92 -> 155;
               case 93 -> 26;
               case 94 -> 36;
               case 95 -> 105;
               case 96 -> 31;
               case 97 -> 81;
               case 98 -> 18;
               case 99 -> 192;
               case 100 -> 128;
               case 101 -> 133;
               case 102 -> 67;
               case 103 -> 101;
               case 104 -> 108;
               case 105 -> 118;
               case 106 -> 190;
               case 107 -> 254;
               case 108 -> 185;
               case 109 -> 177;
               case 110 -> 135;
               case 111 -> 98;
               case 112 -> 100;
               case 113 -> 199;
               case 114 -> 78;
               case 115 -> 129;
               case 116 -> 206;
               case 117 -> 233;
               case 118 -> 219;
               case 119 -> 32;
               case 120 -> 65;
               case 121 -> 76;
               case 122 -> 12;
               case 123 -> 247;
               case 124 -> 125;
               case 125 -> 140;
               case 126 -> 201;
               case 127 -> 141;
               case 128 -> 132;
               case 129 -> 38;
               case 130 -> 131;
               case 131 -> 94;
               case 132 -> 174;
               case 133 -> 13;
               case 134 -> 244;
               case 135 -> 99;
               case 136 -> 236;
               case 137 -> 85;
               case 138 -> 200;
               case 139 -> 73;
               case 140 -> 11;
               case 141 -> 212;
               case 142 -> 82;
               case 143 -> 228;
               case 144 -> 161;
               case 145 -> 110;
               case 146 -> 52;
               case 147 -> 79;
               case 148 -> 210;
               case 149 -> 191;
               case 150 -> 214;
               case 151 -> 193;
               case 152 -> 114;
               case 153 -> 218;
               case 154 -> 88;
               case 155 -> 186;
               case 156 -> 33;
               case 157 -> 6;
               case 158 -> 143;
               case 159 -> 123;
               case 160 -> 53;
               case 161 -> 249;
               case 162 -> 234;
               case 163 -> 144;
               case 164 -> 139;
               case 165 -> 111;
               case 166 -> 115;
               case 167 -> 119;
               case 168 -> 246;
               case 169 -> 39;
               case 170 -> 136;
               case 171 -> 217;
               case 172 -> 86;
               case 173 -> 250;
               case 174 -> 7;
               case 175 -> 194;
               case 176 -> 239;
               case 177 -> 121;
               case 178 -> 188;
               case 179 -> 1;
               case 180 -> 243;
               case 181 -> 231;
               case 182 -> 172;
               case 183 -> 51;
               case 184 -> 162;
               case 185 -> 237;
               case 186 -> 215;
               case 187 -> 68;
               case 188 -> 0;
               case 189 -> 241;
               case 190 -> 148;
               case 191 -> 97;
               case 192 -> 238;
               case 193 -> 27;
               case 194 -> 35;
               case 195 -> 3;
               case 196 -> 170;
               case 197 -> 49;
               case 198 -> 71;
               case 199 -> 23;
               case 200 -> 24;
               case 201 -> 43;
               case 202 -> 235;
               case 203 -> 91;
               case 204 -> 59;
               case 205 -> 55;
               case 206 -> 167;
               case 207 -> 198;
               case 208 -> 165;
               case 209 -> 113;
               case 210 -> 127;
               case 211 -> 130;
               case 212 -> 173;
               case 213 -> 230;
               case 214 -> 223;
               case 215 -> 168;
               case 216 -> 124;
               case 217 -> 41;
               case 218 -> 181;
               case 219 -> 109;
               case 220 -> 187;
               case 221 -> 25;
               case 222 -> 112;
               case 223 -> 152;
               case 224 -> 83;
               case 225 -> 126;
               case 226 -> 104;
               case 227 -> 203;
               case 228 -> 160;
               case 229 -> 182;
               case 230 -> 145;
               case 231 -> 95;
               case 232 -> 5;
               case 233 -> 92;
               case 234 -> 107;
               case 235 -> 75;
               case 236 -> 183;
               case 237 -> 89;
               case 238 -> 96;
               case 239 -> 29;
               case 240 -> 17;
               case 241 -> 37;
               case 242 -> 87;
               case 243 -> 93;
               case 244 -> 19;
               case 245 -> 50;
               case 246 -> 154;
               case 247 -> 8;
               case 248 -> 229;
               case 249 -> 150;
               case 250 -> 175;
               case 251 -> 146;
               case 252 -> 122;
               case 253 -> 61;
               case 254 -> 14;
               default -> 4;
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
   
    public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0, int var1, int var2, int var3, Object var4) {
        if ((var3 & 1) != 0) {
            var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        }
        if ((var3 & 2) != 0) {
            var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
        }
        return var0.a(var1, var2);
    }}

   // PX-FIX synth restored from jar bytecode
  public static void a(me.octo.client.utils.lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl p0, net.minecraft.client.gui.GuiGraphicsExtractor p1, net.minecraft.client.gui.screens.inventory.AbstractContainerScreen p2, net.minecraft.world.inventory.Slot p3, int p4, int p5, int p6, java.lang.Object p7) {
      int[] pxmask = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      if ((pxmask != null) || (p6 & 16) != 0) { p5 = 1; }
      p0.a(p1, p2, p3, p4, p5);
   }
}
