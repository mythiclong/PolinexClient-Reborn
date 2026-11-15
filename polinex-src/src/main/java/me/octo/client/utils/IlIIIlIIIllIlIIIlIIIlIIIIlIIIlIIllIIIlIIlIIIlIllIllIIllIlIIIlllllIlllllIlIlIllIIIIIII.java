package me.octo.client.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.utils.dwarven.PolinexDwarvenRouteRecovery;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII {
   @NotNull
   private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @Nullable
   private final IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final List<BlockPos> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private final List<BlockPos> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private final Callable<Boolean> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private String IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @Nullable
   private BlockPos IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @Nullable
   private BlockPos lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private ArrayList<BlockPos> IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static String[] a;
   private static String[] b;

   public IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII(
      @NotNull String var1,
      @Nullable IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll var2,
      @NotNull List<? extends BlockPos> var3,
      @NotNull List<? extends BlockPos> var4,
      @NotNull Callable<Boolean> var5
   ) {
      short var10001 = 22960;
      short var10002 = 22294;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = 22966;
      var10002 = 9736;
      Intrinsics.checkNotNullParameter(var3, "mineWalkPositions");
      var10001 = 22965;
      var10002 = -6417;
      Intrinsics.checkNotNullParameter(var4, "mineEtherwarpPositions");
      var10001 = 22964;
      var10002 = 325;
      Intrinsics.checkNotNullParameter(var5, "inArea");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = ((List<BlockPos>)(Object)(var3));
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = ((List<BlockPos>)(Object)(var4));
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = (BlockPos)CollectionsKt.firstOrNull(
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
      );
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new ArrayList<>();
   }

   @NotNull
   public final String a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @Nullable
   public final IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll b() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final List<BlockPos> c() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public final List<BlockPos> d() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @NotNull
   public final Callable<Boolean> e() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @NotNull
   public final String f() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   public final void a(@NotNull String var1) {
      short var10001 = 22967;
      short var10002 = 7114;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
   }

   @Nullable
   public final BlockPos g() {
      return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   public final void a(@Nullable BlockPos var1) {
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var1;
   }

   @Nullable
   public final BlockPos h() {
      return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   public final void b(@Nullable BlockPos var1) {
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var1;
   }

   @NotNull
   public final ArrayList<BlockPos> i() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   public final void a(@NotNull ArrayList<BlockPos> var1) {
      short var10001 = 22969;
      short var10002 = -21596;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var1;
   }

   public final void j() {
      int[] var1 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      boolean var2 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .n()
         != null;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = (ArrayList<BlockPos>)CollectionsKt.toCollection(
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, new ArrayList()
      );
      if (var1 != null && var2) {
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            .addAll(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public final void b(@NotNull ArrayList<BlockPos> var1) {
      short var10001 = 22961;
      short var10002 = -21250;
      Intrinsics.checkNotNullParameter(var1, "blacklistedVeins");
      int[] var10000 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      Iterable var3 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII var14 = this;
      boolean var4 = false;
      int[] var2 = var10000;
      var var6 = new ArrayList();
      boolean var7 = false;
      Iterator var9 = var3.iterator();

      while (true) {
         if (var9.hasNext()) {
            Object var10 = var9.next();
            BlockPos var12 = (BlockPos)var10;
            boolean var13 = false;
            boolean var24 = var1.contains(var12);
            if (var2 == null) {
               break;
            }

            if (var2 != null) {
               var24 = !var24;
            }

            if (!var24) {
               continue;
            }

            var6.add(var10);
            if (var2 != null) {
               continue;
            }
         }

         var3 = (Iterable & List)var6;
         var14 = this;
         boolean var25 = false;
         break;
      }

      label84: {
         Iterator var5;
         label85: {
            var5 = var3.iterator();
            boolean var26 = var5.hasNext();
            if (var2 != null) {
               if (!var26) {
                  var10000 = null;
                  break label84;
               }

               var6 = ((ArrayList)(var5.next()));
               var10000 = (int[])(Object)var5;
               if (var2 == null) {
                  break label85;
               }

               var26 = var5.hasNext();
            }

            if (!var26) {
               var10000 = (int[])(Object)var6;
               break label84;
            }

            var10000 = (int[])(Object)var6;
         }

         BlockPos var17 = (BlockPos)(Object)var10000;
         boolean var19 = false;
         IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var29 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         Vec3 var31 = var17.getCenter();
         short var10003 = 22963;
         short var10004 = 32121;
         Intrinsics.checkNotNullExpressionValue(var31, "getCenter(...)");
         double var18 = var29.b(var31, false);

         label55:
         while (true) {
            Object var20 = var5.next();
            BlockPos var21 = (BlockPos)var20;
            boolean var23 = false;
            IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var30 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            Vec3 var32 = var21.getCenter();
            var10003 = 22962;
            var10004 = 839;
            Intrinsics.checkNotNullExpressionValue(var32, "getCenter(...)");
            double var22 = var30.b(var32, false);
            if (Double.compare(var18, var22) > 0) {
               var6 =((ArrayList)( var20));
               var18 = var22;
            }

            while (!var5.hasNext()) {
               if (var2 != null) {
                  var10000 = (int[])(Object)var6;
                  break label55;
               }

               var18 = var22;
            }
         }
      }

      var14.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = (BlockPos)(Object)var10000;
      if (var2 != null && this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll != null) {
         BlockPos var15 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         boolean var16 = false;
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = (BlockPos)PolinexDwarvenRouteRecovery.resolveNearby(
            var15,
            me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a(var15)
         );
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[9];
      int var3 = 0;
      String var2 = "\u009aF\u008e³ä\u0089*;I\u008dN=Ø\u008b$z\u0004ó\u001d\"r\u000eâÄ1ëª¤1Ê\u0092*¹Un±\u000eÒ\u008c7âj\u0085)î\u0091®ÙÅb£\u0016\u009a\u0089oé\u0018\u001c_\u0084À¼¼o6XO\u001e\u0090S,cv\u0005\u0006Æ\u00adO\u009dör\u0007rn\u0002]·ò\u0099";
      int var4 = "\u009aF\u008e³ä\u0089*;I\u008dN=Ø\u008b$z\u0004ó\u001d\"r\u000eâÄ1ëª¤1Ê\u0092*¹Un±\u000eÒ\u008c7âj\u0085)î\u0091®ÙÅb£\u0016\u009a\u0089oé\u0018\u001c_\u0084À¼¼o6XO\u001e\u0090S,cv\u0005\u0006Æ\u00adO\u009dör\u0007rn\u0002]·ò\u0099"
         .length();
      char var1 = 16;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 1;
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
                     case 0 -> 86;
                     case 1 -> 118;
                     case 2 -> 121;
                     case 3 -> 22;
                     case 4 -> 29;
                     case 5 -> 127;
                     default -> 91;
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
                     b = new String[9];
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

                  var2 = "[]Cg\u009bÌo3t\u0089JÝ¨[\fiö\u0007\u0095óêú¾\u0012¬";
                  var4 = "[]Cg\u009bÌo3t\u0089JÝ¨[\fiö\u0007\u0095óêú¾\u0012¬".length();
                  var1 = 17;
                  var8 = -1;
            }

            var10000 = 122;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 22961) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 93;
            case 1 -> 217;
            case 2 -> 129;
            case 3 -> 183;
            case 4 -> 188;
            case 5 -> 98;
            case 6 -> 152;
            case 7 -> 252;
            case 8 -> 58;
            case 9 -> 189;
            case 10 -> 11;
            case 11 -> 190;
            case 12 -> 69;
            case 13 -> 1;
            case 14 -> 127;
            case 15 -> 2;
            case 16 -> 90;
            case 17 -> 111;
            case 18 -> 248;
            case 19 -> 130;
            case 20 -> 249;
            case 21 -> 192;
            case 22 -> 73;
            case 23 -> 108;
            case 24 -> 63;
            case 25 -> 170;
            case 26 -> 162;
            case 27 -> 132;
            case 28 -> 155;
            case 29 -> 12;
            case 30 -> 53;
            case 31 -> 128;
            case 32 -> 14;
            case 33 -> 36;
            case 34 -> 235;
            case 35 -> 142;
            case 36 -> 163;
            case 37 -> 177;
            case 38 -> 234;
            case 39 -> 114;
            case 40 -> 23;
            case 41 -> 197;
            case 42 -> 44;
            case 43 -> 227;
            case 44 -> 199;
            case 45 -> 50;
            case 46 -> 110;
            case 47 -> 88;
            case 48 -> 70;
            case 49 -> 95;
            case 50 -> 94;
            case 51 -> 204;
            case 52 -> 112;
            case 53 -> 102;
            case 54 -> 206;
            case 55 -> 104;
            case 56 -> 218;
            case 57 -> 66;
            case 58 -> 187;
            case 59 -> 105;
            case 60 -> 225;
            case 61 -> 150;
            case 62 -> 49;
            case 63 -> 17;
            case 64 -> 212;
            case 65 -> 56;
            case 66 -> 84;
            case 67 -> 237;
            case 68 -> 221;
            case 69 -> 134;
            case 70 -> 154;
            case 71 -> 55;
            case 72 -> 80;
            case 73 -> 205;
            case 74 -> 122;
            case 75 -> 194;
            case 76 -> 67;
            case 77 -> 48;
            case 78 -> 230;
            case 79 -> 116;
            case 80 -> 117;
            case 81 -> 10;
            case 82 -> 60;
            case 83 -> 244;
            case 84 -> 195;
            case 85 -> 168;
            case 86 -> 174;
            case 87 -> 196;
            case 88 -> 133;
            case 89 -> 240;
            case 90 -> 141;
            case 91 -> 176;
            case 92 -> 8;
            case 93 -> 144;
            case 94 -> 26;
            case 95 -> 83;
            case 96 -> 166;
            case 97 -> 147;
            case 98 -> 96;
            case 99 -> 165;
            case 100 -> 202;
            case 101 -> 45;
            case 102 -> 64;
            case 103 -> 99;
            case 104 -> 25;
            case 105 -> 220;
            case 106 -> 139;
            case 107 -> 126;
            case 108 -> 30;
            case 109 -> 138;
            case 110 -> 47;
            case 111 -> 13;
            case 112 -> 118;
            case 113 -> 253;
            case 114 -> 72;
            case 115 -> 159;
            case 116 -> 92;
            case 117 -> 124;
            case 118 -> 123;
            case 119 -> 238;
            case 120 -> 97;
            case 121 -> 74;
            case 122 -> 153;
            case 123 -> 7;
            case 124 -> 236;
            case 125 -> 214;
            case 126 -> 78;
            case 127 -> 41;
            case 128 -> 113;
            case 129 -> 164;
            case 130 -> 209;
            case 131 -> 254;
            case 132 -> 29;
            case 133 -> 101;
            case 134 -> 232;
            case 135 -> 37;
            case 136 -> 46;
            case 137 -> 211;
            case 138 -> 59;
            case 139 -> 208;
            case 140 -> 21;
            case 141 -> 0;
            case 142 -> 140;
            case 143 -> 146;
            case 144 -> 243;
            case 145 -> 77;
            case 146 -> 61;
            case 147 -> 184;
            case 148 -> 228;
            case 149 -> 6;
            case 150 -> 9;
            case 151 -> 39;
            case 152 -> 51;
            case 153 -> 85;
            case 154 -> 186;
            case 155 -> 57;
            case 156 -> 75;
            case 157 -> 18;
            case 158 -> 71;
            case 159 -> 81;
            case 160 -> 179;
            case 161 -> 137;
            case 162 -> 3;
            case 163 -> 87;
            case 164 -> 76;
            case 165 -> 215;
            case 166 -> 216;
            case 167 -> 210;
            case 168 -> 148;
            case 169 -> 213;
            case 170 -> 24;
            case 171 -> 43;
            case 172 -> 125;
            case 173 -> 54;
            case 174 -> 178;
            case 175 -> 89;
            case 176 -> 42;
            case 177 -> 229;
            case 178 -> 65;
            case 179 -> 222;
            case 180 -> 175;
            case 181 -> 167;
            case 182 -> 86;
            case 183 -> 145;
            case 184 -> 173;
            case 185 -> 31;
            case 186 -> 182;
            case 187 -> 119;
            case 188 -> 40;
            case 189 -> 169;
            case 190 -> 34;
            case 191 -> 107;
            case 192 -> 247;
            case 193 -> 231;
            case 194 -> 242;
            case 195 -> 4;
            case 196 -> 16;
            case 197 -> 15;
            case 198 -> 198;
            case 199 -> 38;
            case 200 -> 250;
            case 201 -> 28;
            case 202 -> 20;
            case 203 -> 120;
            case 204 -> 161;
            case 205 -> 79;
            case 206 -> 207;
            case 207 -> 193;
            case 208 -> 151;
            case 209 -> 226;
            case 210 -> 115;
            case 211 -> 160;
            case 212 -> 121;
            case 213 -> 109;
            case 214 -> 203;
            case 215 -> 156;
            case 216 -> 233;
            case 217 -> 255;
            case 218 -> 106;
            case 219 -> 245;
            case 220 -> 22;
            case 221 -> 68;
            case 222 -> 136;
            case 223 -> 103;
            case 224 -> 219;
            case 225 -> 200;
            case 226 -> 171;
            case 227 -> 52;
            case 228 -> 35;
            case 229 -> 135;
            case 230 -> 62;
            case 231 -> 32;
            case 232 -> 224;
            case 233 -> 19;
            case 234 -> 33;
            case 235 -> 158;
            case 236 -> 91;
            case 237 -> 131;
            case 238 -> 191;
            case 239 -> 251;
            case 240 -> 100;
            case 241 -> 201;
            case 242 -> 180;
            case 243 -> 185;
            case 244 -> 5;
            case 245 -> 157;
            case 246 -> 181;
            case 247 -> 149;
            case 248 -> 82;
            case 249 -> 239;
            case 250 -> 172;
            case 251 -> 223;
            case 252 -> 246;
            case 253 -> 241;
            case 254 -> 143;
            default -> 27;
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
