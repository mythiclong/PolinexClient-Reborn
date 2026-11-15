package me.octo.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.RangesKt;
import me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIllIIIllIllllllIIIIIlIIIIIlIllIIlllIllIIllIlIIIIIIIlIlllIlIIIllIIlIlIIIIIIlIlIIlIIlI {
   public Object receiver; // PX-FIX kotlin lambda receiver

   @NotNull
   private final Minecraft IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private ArrayList<lIllIIIllIllllllIIIIIlIIIIIlIllIIlllIllIIllIlIIIIIIIlIlllIlIIIllIIlIlIIIIIIlIlIIlIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private final float IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private Vec3 lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private double lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private int lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private boolean lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private boolean IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static String[] a;
   private static String[] b;

   public lIllIIIllIllllllIIIIIlIIIIIlIllIIlllIllIIllIlIIIIIIIlIlllIlIIIllIIlIlIIIIIIlIlIIlIIlI() {
      Minecraft var10001 = Minecraft.getInstance();
      short var10003 = -6069;
      short var10004 = -7866;
      Intrinsics.checkNotNullExpressionValue(var10001, "getInstance(...)");
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var10001;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new ArrayList<>();
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new ArrayList<>();
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = 33.0F;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      Vec3 var1 = Vec3.ZERO;
      var10003 = -6071;
      var10004 = 8497;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var1;
   }

   public final boolean a() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final void a(boolean var1) {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
   }

   @NotNull
   public final ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> b() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final void a(@NotNull ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> var1) {
      short var10001 = -6055;
      short var10002 = 6817;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
   }

   public final boolean c() {
      return this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   }

   public final void b(boolean var1) {
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var1;
   }

   private final void d() { Object var9 = null; // PX-FIX hoist
        
      Collection var19 = null; // PX-FIX
      Object receiver = null; // PX-FIX
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clear();
      String var1 = var10000;
      var10000 = String.valueOf(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      if (var1 != null) {
         if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.isEmpty()) {
            return;
         }

         var10000 = String.valueOf((Iterable)this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      }

      List var3 = ((List)(Object)(var10000));
      int var4 = 0;
      Collection var6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var3, 10));
      boolean var7 = false;
      Iterator var8 = var3.iterator();

      while (true) {
         if (var8.hasNext()) {
             var9 = var8.next();
            var19 = var6;
            IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var10 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var9;
            if (var1 == null) {
               break;
            }

            boolean var11 = false;
            var6.add(
               me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .g(var10.a())
            );
            if (var1 != null) {
               continue;
            }
         }

         var19 = var6;
         break;
      }

      List var2 = (List)var19;
      var3 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a(
         var2,
         0.0,
         0,
         (Function1)(
            new Function1<Vec3, Boolean>() {
   public Boolean invoke(Vec3 p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = -6989;
                  short var10005 = -21640;
                  var10005 = -6991;
                  short var10006 = 26914;
               }

               public final Boolean a(Vec3 var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = -6990;
                  short var10002 = -5432;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  return ((lIllIIIllIllllllIIIIIlIIIIIlIllIIlllIllIIllIlIIIIIIIlIlllIlIIIllIIlIlIIIIIIlIlIIlIIlI)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3x = 0;
                  String var2x = "¯ã^Þ8\u0094+÷ö\u00ad0\u009d÷Åµ\u009d\u0002\u001a[2Õe\u0011\u000eÑ\u008e\u0016´QÅÄ\u0090idf©\u001fO}#þíè¡mÈ\u0007$á~º\u0094\u0007]\u008d*I4où\u0080¯\u0006\u001eÐâ=\u0002])";
                  int var4x = "¯ã^Þ8\u0094+÷ö\u00ad0\u009d÷Åµ\u009d\u0002\u001a[2Õe\u0011\u000eÑ\u008e\u0016´QÅÄ\u0090idf©\u001fO}#þíè¡mÈ\u0007$á~º\u0094\u0007]\u008d*I4où\u0080¯\u0006\u001eÐâ=\u0002])"
                     .length();
                  char var1x = 16;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2x.substring(++var0, var0 + var1x).toCharArray();
                        int var10004 = var10003.length;
                        int var6x = 0;
                        byte var13 = 65;
                        var10002 = var10003;
                        int var8x = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 65;
                           var10006 = var6x;
                        } else {
                           var13 = 65;
                           var8x = var10004;
                           if (var10004 <= var6x) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 65;
                           var10006 = var6x;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6x % 7) {
                              case 0 -> 14;
                              case 1 -> 109;
                              case 2 -> 23;
                              case 3 -> 26;
                              case 4 -> 86;
                              case 5 -> 64;
                              default -> 37;
                           });
                           var6x++;
                           if (var13 == 0) {
                              var10006 = var13;
                              var10005 = var10002;
                              var16 = var13;
                           } else {
                              if (var8x <= var6x) {
                                 break;
                              }

                              var10005 = var10002;
                              var16 = var13;
                              var10006 = var6x;
                           }
                        }
                     }

                     String var15 = new String(var10002).intern();
                     byte var10x = -1;
                     var5[var3x++] = var15;
                     if ((var0 += var1x) >= var4x) {
                        a = var5;
                        b = new String[3];
                        break pxClinit;
                     }

                     var1x = var2x.charAt(var0);
                  }
                  }
               }

               private static String a(int var0, int var1x) {
                  int var2x = (var0 ^ -6989) & 65535;
                  if (b[var2x] == null) {
                     char[] var3 = a[var2x].toCharArray();

                     short var4x = switch (var3[0] & 0xFF) {
                        case 0 -> 179;
                        case 1 -> 38;
                        case 2 -> 10;
                        case 3 -> 137;
                        case 4 -> 121;
                        case 5 -> 232;
                        case 6 -> 80;
                        case 7 -> 92;
                        case 8 -> 249;
                        case 9 -> 126;
                        case 10 -> 103;
                        case 11 -> 86;
                        case 12 -> 168;
                        case 13 -> 93;
                        case 14 -> 247;
                        case 15 -> 0;
                        case 16 -> 237;
                        case 17 -> 177;
                        case 18 -> 174;
                        case 19 -> 49;
                        case 20 -> 97;
                        case 21 -> 125;
                        case 22 -> 124;
                        case 23 -> 175;
                        case 24 -> 60;
                        case 25 -> 227;
                        case 26 -> 218;
                        case 27 -> 64;
                        case 28 -> 73;
                        case 29 -> 6;
                        case 30 -> 122;
                        case 31 -> 202;
                        case 32 -> 82;
                        case 33 -> 39;
                        case 34 -> 94;
                        case 35 -> 56;
                        case 36 -> 215;
                        case 37 -> 143;
                        case 38 -> 187;
                        case 39 -> 183;
                        case 40 -> 157;
                        case 41 -> 205;
                        case 42 -> 29;
                        case 43 -> 224;
                        case 44 -> 160;
                        case 45 -> 127;
                        case 46 -> 211;
                        case 47 -> 46;
                        case 48 -> 7;
                        case 49 -> 110;
                        case 50 -> 172;
                        case 51 -> 5;
                        case 52 -> 144;
                        case 53 -> 98;
                        case 54 -> 96;
                        case 55 -> 185;
                        case 56 -> 57;
                        case 57 -> 178;
                        case 58 -> 182;
                        case 59 -> 240;
                        case 60 -> 186;
                        case 61 -> 112;
                        case 62 -> 159;
                        case 63 -> 22;
                        case 64 -> 101;
                        case 65 -> 74;
                        case 66 -> 149;
                        case 67 -> 195;
                        case 68 -> 176;
                        case 69 -> 44;
                        case 70 -> 4;
                        case 71 -> 196;
                        case 72 -> 111;
                        case 73 -> 118;
                        case 74 -> 17;
                        case 75 -> 203;
                        case 76 -> 32;
                        case 77 -> 136;
                        case 78 -> 219;
                        case 79 -> 102;
                        case 80 -> 12;
                        case 81 -> 151;
                        case 82 -> 213;
                        case 83 -> 59;
                        case 84 -> 77;
                        case 85 -> 163;
                        case 86 -> 139;
                        case 87 -> 2;
                        case 88 -> 76;
                        case 89 -> 244;
                        case 90 -> 166;
                        case 91 -> 154;
                        case 92 -> 75;
                        case 93 -> 189;
                        case 94 -> 108;
                        case 95 -> 37;
                        case 96 -> 115;
                        case 97 -> 106;
                        case 98 -> 230;
                        case 99 -> 246;
                        case 100 -> 117;
                        case 101 -> 208;
                        case 102 -> 107;
                        case 103 -> 20;
                        case 104 -> 61;
                        case 105 -> 54;
                        case 106 -> 200;
                        case 107 -> 40;
                        case 108 -> 242;
                        case 109 -> 171;
                        case 110 -> 63;
                        case 111 -> 152;
                        case 112 -> 223;
                        case 113 -> 35;
                        case 114 -> 129;
                        case 115 -> 84;
                        case 116 -> 206;
                        case 117 -> 67;
                        case 118 -> 26;
                        case 119 -> 48;
                        case 120 -> 234;
                        case 121 -> 50;
                        case 122 -> 78;
                        case 123 -> 243;
                        case 124 -> 131;
                        case 125 -> 226;
                        case 126 -> 191;
                        case 127 -> 250;
                        case 128 -> 34;
                        case 129 -> 229;
                        case 130 -> 16;
                        case 131 -> 95;
                        case 132 -> 170;
                        case 133 -> 8;
                        case 134 -> 109;
                        case 135 -> 147;
                        case 136 -> 42;
                        case 137 -> 28;
                        case 138 -> 89;
                        case 139 -> 69;
                        case 140 -> 23;
                        case 141 -> 53;
                        case 142 -> 43;
                        case 143 -> 15;
                        case 144 -> 169;
                        case 145 -> 233;
                        case 146 -> 216;
                        case 147 -> 225;
                        case 148 -> 180;
                        case 149 -> 45;
                        case 150 -> 181;
                        case 151 -> 85;
                        case 152 -> 30;
                        case 153 -> 217;
                        case 154 -> 47;
                        case 155 -> 134;
                        case 156 -> 79;
                        case 157 -> 207;
                        case 158 -> 198;
                        case 159 -> 36;
                        case 160 -> 123;
                        case 161 -> 252;
                        case 162 -> 197;
                        case 163 -> 88;
                        case 164 -> 153;
                        case 165 -> 158;
                        case 166 -> 145;
                        case 167 -> 68;
                        case 168 -> 192;
                        case 169 -> 24;
                        case 170 -> 128;
                        case 171 -> 55;
                        case 172 -> 162;
                        case 173 -> 100;
                        case 174 -> 1;
                        case 175 -> 173;
                        case 176 -> 167;
                        case 177 -> 65;
                        case 178 -> 165;
                        case 179 -> 228;
                        case 180 -> 210;
                        case 181 -> 90;
                        case 182 -> 221;
                        case 183 -> 235;
                        case 184 -> 91;
                        case 185 -> 150;
                        case 186 -> 248;
                        case 187 -> 254;
                        case 188 -> 3;
                        case 189 -> 119;
                        case 190 -> 87;
                        case 191 -> 220;
                        case 192 -> 161;
                        case 193 -> 138;
                        case 194 -> 105;
                        case 195 -> 18;
                        case 196 -> 62;
                        case 197 -> 164;
                        case 198 -> 58;
                        case 199 -> 193;
                        case 200 -> 140;
                        case 201 -> 113;
                        case 202 -> 255;
                        case 203 -> 190;
                        case 204 -> 135;
                        case 205 -> 104;
                        case 206 -> 194;
                        case 207 -> 184;
                        case 208 -> 251;
                        case 209 -> 204;
                        case 210 -> 241;
                        case 211 -> 33;
                        case 212 -> 21;
                        case 213 -> 201;
                        case 214 -> 70;
                        case 215 -> 99;
                        case 216 -> 31;
                        case 217 -> 222;
                        case 218 -> 209;
                        case 219 -> 72;
                        case 220 -> 19;
                        case 221 -> 231;
                        case 222 -> 41;
                        case 223 -> 116;
                        case 224 -> 239;
                        case 225 -> 81;
                        case 226 -> 245;
                        case 227 -> 66;
                        case 228 -> 146;
                        case 229 -> 212;
                        case 230 -> 130;
                        case 231 -> 51;
                        case 232 -> 13;
                        case 233 -> 238;
                        case 234 -> 14;
                        case 235 -> 141;
                        case 236 -> 156;
                        case 237 -> 132;
                        case 238 -> 114;
                        case 239 -> 155;
                        case 240 -> 253;
                        case 241 -> 25;
                        case 242 -> 11;
                        case 243 -> 27;
                        case 244 -> 120;
                        case 245 -> 142;
                        case 246 -> 83;
                        case 247 -> 133;
                        case 248 -> 188;
                        case 249 -> 71;
                        case 250 -> 148;
                        case 251 -> 199;
                        case 252 -> 9;
                        case 253 -> 214;
                        case 254 -> 236;
                        default -> 52;
                     };
                     int var5 = (var1x & 0xFF) - var4x;
                     if (var5 < 0) {
                        var5 += 256;
                     }

                     int var6x = ((var1x & 65535) >>> 8) - var4x;
                     if (var6x < 0) {
                        var6x += 256;
                     }

                     for (int var7x = 0; var7x < var3.length; var7x++) {
                        int var8x = var7x % 2;
                        char var10002 = var3[var7x];
                        if (var8x == 0) {
                           var3[var7x] = (char)(var10002 ^ var5);
                           var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7x]) & 0xFF;
                        } else {
                           var3[var7x] = (char)(var10002 ^ var6x);
                           var6x = ((var6x >>> 3 | var6x << 5) ^ var3[var7x]) & 0xFF;
                        }
                     }

                     b[var2x] = new String(var3).intern();
                  }

                  return b[var2x];
               }
            }
         ));
      var4 = 0;
      int var5 = var3.size();

      while (true) {
         if (var4 < var5) {
            Vec3 var15 = (Vec3)var3.get(var4);
            Vec3 var16 = (Vec3)var3.get((var4 + 1) % var3.size());
            boolean var17 = this.a(var15, var16);
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
               .add(
                  new lIllIIIllIllllllIIIIIlIIIIIlIllIIlllIllIIllIlIIIIIIIlIlllIlIIIllIIlIlIIIIIIlIlIIlIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     var15, var17
                  )
               );
            var4++;
            if (var1 == null) {
               break;
            }

            if (var1 != null) {
               continue;
            }
         }

         int var20 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.size();
         short var10001 = -6066;
         short var10002 = -18147;
         var10002 = -6050;
         short var10003 = 14824;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
            "§aGenerated smooth path with " + var20 + " points"
         );
         break;
      }
   }

   private final boolean a(Vec3 var1, Vec3 var2) {
      String var3 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var3 != null && this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level != null) {
         ClientLevel var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level;
         double var5 = var2.y - var1.y;
         double var24;
         int var10000 = (var24 = var5 - 0.3) == 0.0 ? 0 : (var24 < 0.0 ? -1 : 1);
         if (var3 != null) {
            if (var10000 <= 0) {
               BlockPos var7;
               int var9;
               int var10;
               label52: {
                  BlockPos var13 = BlockPos.containing(var1);
                  short var10002 = -6061;
                  short var10003 = 21818;
                  Intrinsics.checkNotNullExpressionValue(var13, "containing(...)");
                  var7 = var13;
                  BlockPos var14 = BlockPos.containing(var2);
                  var10002 = -6061;
                  var10003 = 21818;
                  Intrinsics.checkNotNullExpressionValue(var14, "containing(...)");
                  BlockPos var8 = var14;
                  var9 = var8.getX() - var7.getX();
                  var10 = var8.getZ() - var7.getZ();
                  var10000 = var9;
                  if (var3 != null) {
                     if (var9 != 0) {
                        break label52;
                     }

                     var10000 = var10;
                  }

                  if (var3 == null) {
                     return (var10000 != 0);
                  }

                  if (var10000 == 0) {
                     return (0 != 0);
                  }
               }

               BlockPos var16 = var7.offset(RangesKt.coerceIn(var9, -1, 1), 0, RangesKt.coerceIn(var10, -1, 1));
               short var19 = -6060;
               short var22 = 29244;
               Intrinsics.checkNotNullExpressionValue(var16, "offset(...)");
               BlockPos var11 = var16;
               BlockState var17 = var4.getBlockState(var11);
               var19 = -6068;
               var22 = 25113;
               Intrinsics.checkNotNullExpressionValue(var17, "getBlockState(...)");
               BlockState var12 = var17;
               boolean var25 = var12.isAir();
               if (var3 == null) {
                  return var25;
               }

               if (!var25) {
                  var25 = var12.getBlock().defaultBlockState().canBeReplaced();
                  if (var3 == null) {
                     return var25;
                  }

                  if (!var25) {
                     return true;
                  }
               }

               return (0 != 0);
            }

            var10000 = 1;
         }

         return (var10000 != 0);
      } else {
         return false;
      }
   }

   private final boolean a(Vec3 var1) { BlockState var9 = null; // PX-FIX hoist
        
      String var2 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var2 != null && this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level != null) {
         ClientLevel var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level;
         BlockPos var10000 = BlockPos.containing(var1);
         short var10002 = -6053;
         short var10003 = -23274;
         Intrinsics.checkNotNullExpressionValue(var10000, "containing(...)");
         BlockPos var4 = var10000;
         BlockState var8 = var3.getBlockState(var4.below());
         var10002 = -6054;
         var10003 = 6157;
         Intrinsics.checkNotNullExpressionValue(var8, "getBlockState(...)");
         BlockState var5 = var8;
          var9 = var3.getBlockState(var4);
         var10002 = -6068;
         var10003 = 25113;
         Intrinsics.checkNotNullExpressionValue(var9, "getBlockState(...)");
         BlockState var6 = var9;
         BlockState var10 = var3.getBlockState(var4.above());
         var10002 = -6068;
         var10003 = 25113;
         Intrinsics.checkNotNullExpressionValue(var10, "getBlockState(...)");
         BlockState var7 = var10;
         boolean var11 = var5.isAir();
         if (var2 != null) {
            if (var11) {
               return false;
            }

            var11 = var6.isAir();
         }

         label42:
         if (var2 != null) {
            if (!var11) {
               var11 = var6.getBlock().defaultBlockState().canBeReplaced();
               if (var2 == null) {
                  break label42;
               }

               if (!var11) {
                  return false;
               }
            }

            var11 = var7.isAir();
         }

         if (var2 != null) {
            if (!var11) {
               boolean var18 = var7.getBlock().defaultBlockState().canBeReplaced();
               if (var2 == null) {
                  return var18;
               }

               if (!var18) {
                  return false;
               }
            }

            var11 = true;
         }

         return var11;
      } else {
         return false;
      }
   }

   public final void e() { float var9 = 0.0f; // PX-FIX hoist
        
      int var55 = 0; // PX-FIX
      byte var54 = 0; // PX-FIX
      int var53 = 0; // PX-FIX
      Object var52 = null; // PX-FIX
      double var50 = 0; // PX-FIX
      Object var49 = null; // PX-FIX
      byte var48 = 0; // PX-FIX
      int var46 = 0; // PX-FIX
      Object var41 = null; // PX-FIX
      Object var36 = null; // PX-FIX
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      short var10002 = -6056;
      short var10003 = -16997;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("sneak", false);
      String var1 = var10000;
      if (var1 != null) {
         label319:
         if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
            boolean var34 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.isEmpty();
            if (var1 != null) {
               if (var34) {
                  break label319;
               }

               var34 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.n();
            }

            if (var34) {
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .p();
               return;
            }

            label308: {
               lIllIIIllIllllllIIIIIlIIIIIlIllIIlllIllIIllIlIIIIIIIlIlllIlIIIllIIlIlIIIIIIlIlIIlIIlI var35 = this;
               if (var1 != null) {
                  if (this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI == null) {
                     break label308;
                  }

                  var35 = this;
               }

               var35.g();
            }

            var36 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .j();
            label302:
            if (var1 != null) {
               if (((Boolean)(var36))) {
                  var36 = ((java.util.function.Supplier<Object>)(() -> { me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .k()
                     .a(100); return null; })).get();
                  if (var1 == null) {
                     break label302;
                  }

                  if (!((Boolean)var36)) {
                     if (this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI != null) {
                        me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var4 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
                        boolean var5 = false;
                        if (var1 != null
                           && me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .K()
                              != var4.b()) {
                           me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .b(var4.b());
                        }
                     }
                  }
               }

               var36 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.isEmpty();
            }

            if (var1 != null) {
               if (!((Boolean)var36)) {
                  this.d();
                  this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = this.f();
                  this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.f();
               }

               var36 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.isEmpty();
            }

            if (var1 != null) {
               if (!((Boolean)var36)) {
                  short var57 = -6051;
                  short var64 = 20981;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
                     "§c[EndStoneBot] No valid path generated, fix waypoints or contact support."
                  );
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .p();
                  return;
               }

               var36 = ((java.util.function.Supplier<Object>)(() -> { this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.a(2000); return null; })).get();
            }

            label349: {
               if (var1 != null) {
                  if (((Boolean)(var36))) {
                     break label349;
                  }

                  var36 = this.f();
               }

               int var2 =((Integer)( var36));
               Vec3 var3 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var2).a();
               double var21 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var3, false);
               if (var1 == null || var21 > 4.0) {
                  short var37 = -6065;
                  short var10001 = -30878;
                  String var7 = "%.1f";
                  Object[] var8 = new Object[]{var21};
                  var10000 = String.format(var7, Arrays.copyOf(var8, var8.length));
                  var10002 = -6072;
                  var10003 = 19800;
                  Intrinsics.checkNotNullExpressionValue(var10000, "format(...)");
                  var10001 = -6057;
                  var10002 = -16241;
                  var10002 = -6067;
                  var10003 = -23350;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                     "§e[EndStoneBot] Off-route detected! Resyncing... (" + var10000 + "m from path)"
                  );
                  this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var2;
                  this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 0;
                  me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .g();
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .p();
               }

               this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.f();
            }

            Vec3 var18 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
            int var39 = ((java.util.function.Supplier<Integer>)(() -> { this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.a(1000); return 0; })).get();
            if (var1 != null) {
               if (var39 != 0) {
                  label276: {
                     label275: {
                        label328: {
                           double var19 = var18.distanceTo(this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl);
                           double var75;
                           int var40 = (var75 = var19 - 0.2) == 0.0 ? 0 : (var75 < 0.0 ? -1 : 1);
                           if (var1 != null) {
                              if (var40 >= 0) {
                                 break label328;
                              }

                              var40 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                           }

                           int var23 = var40;
                           this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var23 + 1;
                           var41 = this;
                           if (var1 == null) {
                              break label276;
                           }

                           if (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl < 3) {
                              break label275;
                           }

                           short var42 = -6059;
                           short var59 = 25347;
                           me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                              "§c[EndStoneBot] Stuck detected! Finding nearest path point..."
                           );
                           this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = this.f();
                           this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 0;
                           me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .g();
                           me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .p();
                           if (var1 != null) {
                              break label275;
                           }
                        }

                        this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 0;
                     }

                     var41 = this;
                  }

                  this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var18;
               }

               var39 = (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII + 4)
                  % this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.size();
            }

            label348: {
               int var20 = var39;
               double var22 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var20).a(), false);
               double var76;
               int var43 = (var76 = var22 - 1.75) == 0.0 ? 0 : (var76 < 0.0 ? -1 : 1);
               if (var1 != null) {
                  if (var43 < 0) {
                     this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = (
                           this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII + 4
                        )
                        % this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.size();
                     this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 0;
                  }

                  var10000 = String.valueOf(me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
                  if (var1 == null) {
                     break label348;
                  }

                  var43 = ((me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .i()) ? 1 : 0);
               }

               if (var43 == 0) {
                  label250: {
                     byte var45 = ((byte)((this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) ? 1 : 0));
                     if (var1 != null) {
                        if (this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) {
                           var46 = 10;
                           break label250;
                        }

                        var45 = 8;
                     }

                     var46 = var45 + Random.Default.nextInt(4);
                  }

                  int var6 = var46;
                  int var25 = (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII + var6)
                     % this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.size();
                  Vec3 var27 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var25).a();
                   var9 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a(var27)
                     .a();
                  me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.a(
                     new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(
                        var9,
                        this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI + (float)Random.Default.nextLong(-2L, 2L)
                     )
                  );
               }

               var10000 = String.valueOf(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var20));
            }

            byte var26;
            label242: {
               label241: {
                  label332: {
                     Vec3 var24;
                     var24 = ((lIllIIIllIllllllIIIIIlIIIIIlIllIIlllIllIIllIlIIIIIIIlIlllIlIIIllIIlIlIIIIIIlIlIIlIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)(Object)var10000)
                        .a();
                     LocalPlayer var47 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.player;
                     Intrinsics.checkNotNull(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.player);
                     var26 = ((byte)((var47.horizontalCollision) ? 1 : 0));
                     var48 = var26;
                     label239:
                     if (var1 != null) {
                        if (var26 != 0) {
                           var48 = ((byte)((this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll) ? 1 : 0));
                           if (var1 == null) {
                              break label239;
                           }

                           if (!this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll) {
                              this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.f();
                           }
                        }

                        this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = (var26 != 0);
                        if (var1 == null) {
                           break label332;
                        }

                        var48 = var26;
                     }

                     if (var48 != 0) {
                        var49 = this;
                        if (var1 == null) {
                           break label241;
                        }

                        if (((java.util.function.Supplier<Boolean>)(() -> { this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.a(500); return false; })).get()) {
                           int var28 = this.f();
                           Vec3 var30 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var28).a();
                           double var10 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .a(var30, false);
                           var50 = var10;
                           if (var1 == null) {
                              break label242;
                           }

                           if (var10 < 3.0) {
                              this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var28;
                              var24 = var30;
                           }
                        }
                     }

                     me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(
                        me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                        var24,
                        false);
                  }

                  var49 = this;
               }

               LocalPlayer var51 = ((LocalPlayer)(Object)(((me.octo.client.PXDyn)(Object)((me.octo.client.PXDyn)var49).IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl).player));
               Intrinsics.checkNotNull(((me.octo.client.PXDyn)(Object)((me.octo.client.PXDyn)var49).IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl).player);
               var50 = var51.getY();
            }

            double var29 = var50;
            if (var1 != null) {
               if (var29 > this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI + 0.2) {
                  this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.f();
               }

               this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var29;
            }

            label334: {
               List var31 = this.a(5);
               var var12 = var31;
               boolean var13 = false;
               var52 = var12;
               label218:
               if (var1 != null) {
                  if (var12 instanceof Collection) {
                     var52 = (Collection)var12;
                     if (var1 == null) {
                        break label218;
                     }

                     if (((me.octo.client.PXDyn)var52).isEmpty()) {
                        var53 = 0;
                        break label334;
                     }
                  }

                  var52 = var12;
               }

               Iterator var14 = ((me.octo.client.PXDyn)var52).iterator();

               label209:
               while (true) {
                  if (!var14.hasNext()) {
                     var53 = 0;
                     break;
                  }

                  Object var15 = var14.next();
                  lIllIIIllIllllllIIIIIlIIIIIlIllIIlllIllIIllIlIIIIIIIlIlllIlIIIllIIlIlIIIIIIlIlIIlIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var16 = (lIllIIIllIllllllIIIIIlIIIIIlIllIIlllIllIIllIlIIIIIIIlIlllIlIIIllIIlIlIIIIIIlIlIIlIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var15;
                  boolean var17 = false;
                  var53 = ((var16.b()) ? 1 : 0);

                  while (true) {
                     label205: {
                        label337: {
                           if (var1 != null) {
                              if (var53 == 0) {
                                 break label337;
                              }

                              double var77;
                              var53 = (
                                       var77 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                             .a(var16.a(), false)
                                          - 2.5
                                    )
                                    == 0.0
                                 ? 0
                                 : (var77 < 0.0 ? -1 : 1);
                           }

                           if (var1 != null) {
                              if (var53 >= 0) {
                                 break label337;
                              }

                              double var78;
                              var53 = (var78 = var16.a().y - (var29 + 0.1)) == 0.0 ? 0 : (var78 < 0.0 ? -1 : 1);
                           }

                           if (var1 == null) {
                              break label205;
                           }

                           if (var53 > 0) {
                              var53 = 1;
                              break label205;
                           }
                        }

                        var53 = 0;
                     }

                     if (var53 == 0) {
                        break;
                     }

                     var53 = 1;
                     if (var1 != null) {
                        break label209;
                     }
                  }
               }
            }

            int var11;
            label182: {
               label338: {
                  var11 = var53;
                  var54 = var26;
                  if (var1 != null) {
                     if (var26 == 0) {
                        break label338;
                     }

                     var54 = ((java.util.function.Supplier<Byte>)(() -> { this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.a(200); return 0; })).get();
                  }

                  if (var1 == null) {
                     break label182;
                  }

                  if (var54 != 0) {
                     var54 = 1;
                     break label182;
                  }
               }

               var54 = 0;
            }

            label171: {
               label339: {
                  byte var32 = var54;
                  var55 = var11;
                  label169:
                  if (var1 != null) {
                     if (var11 == 0) {
                        var55 = var32;
                        if (var1 == null) {
                           break label169;
                        }

                        if (var32 == 0) {
                           break label339;
                        }
                     }

                     var55 = ((java.util.function.Supplier<Integer>)(() -> { this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.a(400); return 0; })).get();
                  }

                  if (var1 == null) {
                     break label171;
                  }

                  if (var55 != 0) {
                     var55 = 1;
                     break label171;
                  }
               }

               var55 = 0;
            }

            int var33 = var55;
            short var60 = -6063;
            var10002 = 1333;
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a("jump", (var33 != 0));
            var60 = -6058;
            var10002 = 13454;
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a("sprint", true);
            var60 = -6062;
            var10002 = 31547;
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a("sneak", false);
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var56 = me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            var60 = -6078;
            var10002 = -11072;
            boolean var72 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .j();
            if (var1 != null) {
               var72 = !var72;
            }

            var56.a("attack", var72);
            return;
         }

         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .p();
      }
   }

   private final List<lIllIIIllIllllllIIIIIlIIIIIlIllIIlllIllIIllIlIIIIIIIlIlllIlIIIllIIlIlIIIIIIlIlIIlIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> a(
      int var1
   ) {
      ArrayList var7 = null; // PX-FIX
      ArrayList var3 = new ArrayList();
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      int var4 = 0;
      int var5 = RangesKt.coerceAtMost(var1, this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.size());
      String var2 = var10000;

      while (true) {
         if (var4 < var5) {
            int var6 = (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII + var4)
               % this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.size();
            var7 = var3;
            if (var2 == null) {
               break;
            }

            var3.add(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var6));
            var4++;
            if (var2 != null) {
               continue;
            }
         }

         var7 = var3;
         break;
      }

      return (List<lIllIIIllIllllllIIIIIlIIIIIlIllIIlllIllIIllIlIIIIIIIlIlllIlIIIllIIlIlIIIIIIlIlIIlIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll>)var7;
   }

   private final int f() {
       int var9 = 0; // PX-FIX decl var9
      int var2 = 0;
      double var3 = Double.MAX_VALUE;
      int var5 = 0;
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      int var6 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.size();
      String var1 = var10000;

      while (true) {
         if (var5 < var6) {
            double var7 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var5).a(), false);
            if (var1 != null) {
               double var10;
               var9 = (var10 = var7 - var3) == 0.0 ? 0 : (var10 < 0.0 ? -1 : 1);
               if (var1 == null) {
                  break;
               }

               if (var9 < 0) {
                  var3 = var7;
                  var2 = var5;
               }

               var5++;
            }

            if (var1 != null) {
               continue;
            }
         }

         var9 = var2;
         break;
      }

      return var9;
   }

   private final void g() { boolean var9 = false; // PX-FIX hoist
        
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a(
         me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
         false)) {
         if (this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI == null) {
            return;
         }

         me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
         if (var1 == null) {
            return;
         }

         me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .q();
         if (var10000 == null) {
            return;
         }

         me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = var10000;
         ArrayList var4 = new ArrayList();
         if (var1 != null && this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl != null) {
            me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var5 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
            boolean var6 = false;
            var4.add(var5.b());
         }

         if (this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl != null) {
            me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var7 = this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
             var9 = false;
            var4.add(var7.b());
         }

         var10000 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .o();
         if (var10000 != null) {
            me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var8 = var10000;
            boolean var10 = false;
            if (var1 != null && var3.b() != var8.b()) {
               var4.add(var8.b());
            }
         }

         var4.add(var3.b());
         me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .w();
         me.octo.client.utils.player.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(2, lIllIIIllIllllllIIIIIlIIIIIlIllIIlllIllIIllIlIIIIIIIlIlllIlIIIllIIlIlIIIIIIlIlIIlIIlI::l, CollectionsKt.toList(var4), var2.b());
      }
   }

   public final void a(
      @NotNull List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> var1,
      @Nullable me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2
   ) {
      short var10001 = -6070;
      short var10002 = -20336;
      Intrinsics.checkNotNullParameter(var1, "startWaypoints");
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = true;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.clear();
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.addAll(var1);
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clear();
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 0;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.f();
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.f();
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.f();
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.f();
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w()
         .y;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 0;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = false;
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var2;
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.a(
         me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
         false);
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .t();
   }

   public final void h() {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = false;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .p();
      short var10001 = -6052;
      short var10002 = -28798;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("attack", false);
      var10001 = -6049;
      var10002 = 28573;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("sprint", false);
      var10001 = -6064;
      var10002 = -24637;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("jump", false);
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clear();
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 0;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = false;
   }

   @NotNull
   public final List<Vec3> i() { lIllIIIllIllllllIIIIIlIIIIIlIllIIlllIllIIllIlIIIIIIIlIlllIlIIIllIIlIlIIIIIIlIlIIlIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var9 = null; // PX-FIX hoist
        
      Collection var12 = null; // PX-FIX
      Iterable var2 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      boolean var3 = false;
      Collection var5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var2, 10));
      boolean var6 = false;
      Iterator var7 = var2.iterator();
      String var1 = var10000;

      while (true) {
         if (var7.hasNext()) {
            Object var8 = var7.next();
            var12 = var5;
             var9 = (lIllIIIllIllllllIIIIIlIIIIIlIllIIlllIllIIllIlIIIIIIIlIlllIlIIIllIIlIlIIIIIIlIlIIlIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var8;
            if (var1 == null) {
               break;
            }

            boolean var10 = false;
            var5.add(var9.a());
            if (var1 != null) {
               continue;
            }
         }

         var12 = var5;
         break;
      }

      return (List<Vec3>)var12;
   }

   public final int j() { double var9 = 0.0; // PX-FIX hoist
        
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      int var10000 = ((this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.isEmpty()) ? 1 : 0);
      if (var1 != null) {
         if (var10000 != 0) {
            return 0;
         }

         var10000 = 0;
      }

      int var2 = var10000;
      double var3 = Double.MAX_VALUE;
      Vec3 var5 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
      int var6 = 0;
      int var7 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.size();

      while (true) {
         if (var6 < var7) {
            Vec3 var8 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.get(var6).a());
             var9 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .c(var5, var8);
            if (var1 != null) {
               double var12;
               var10000 = (var12 = var9 - var3) == 0.0 ? 0 : (var12 < 0.0 ? -1 : 1);
               if (var1 == null) {
                  break;
               }

               if (var10000 < 0) {
                  var3 = var9;
                  var2 = var6;
               }

               var6++;
            }

            if (var1 != null) {
               continue;
            }
         }

         var10000 = var2;
         break;
      }

      return var10000;
   }

   public final int k() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   private static final Unit l() {
      me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .x();
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[25];
      int var3 = 0;
      String var2 = "¦ÒÆþ×M\u001e7By?88³\u0097¨Úø\u000f.àIÅrÜ\u000bÁqö\u008aâ¥ÿ\u0001\u0005\u0002°Õû\u0081\u0007há>zº}\u0087\u0007Näo¤\u0098S¥\u0006¨¸\u0097/9\"\u0006\rZuÿ®.Jv\u001b+\u0006¢¾Â<Óþ²§\u0007ìH\u009a\\7µå\u0095\u001fK\u008b\"pöb\u008cK~\u0007³»Á¨\u00adÐ\u0004f¿eÍ£0[Ú|\u0000ÁÊ9FnåÙ\u009dD\u0001ìØ\u009c¿}\u0013mÄe\u0002a&ýß\u0082\u0005¹)¢Èo\u000fÔú\u0016\u0086\u0099´vÌÞW\u007fÖ\u001byÖ\u0004pÆ©\\\u0004ûyØ«\u0006Ö~X÷À92øFúk\u0098\u0013\u0085\u0089;H¯q¤6<ÁÓU#ÚÚËÏbh\u000fWÆ\u0001©T§y\u009d¡\f¾-\u0093\u008cöÂcä¢>hõ \n\u000b\u009e\u0014Út\r\u0010&¡\u001a\u001c®=\u0099°Ös\u001d\u00105é-Dmðü\u00067Ç®\u0087\u0000\u009eÖ\u008beÝ\u001f\u008e\u008d\n¬\u0002\u0090§ÈN\u009f\u009eä¸\u0090\r\u0000\u0086µ¶s¶J\u001c¥±cþ\u0099S\u008f\u001bj\u008e-*ù\u000eì\u0086\fw!rÙýÛkC\u0018¯µ\u0010\u008a¾Cxeë\u001dvê\r´\u001f\u0086\u0086bÏ\u000be,\u0099E÷ëýÞaóÁ\u0004\n(ï\u0088\u001di^ÔÌÂÂï\u0087h5¼ÖûõzÌT\\Éi\u001aP»=JsS$Ç\u0004\u001d4þ$\u0012«/gAãº\u0098É\u0092¦%Ã{ÌÿG×\u0005";
      int var4 = "¦ÒÆþ×M\u001e7By?88³\u0097¨Úø\u000f.àIÅrÜ\u000bÁqö\u008aâ¥ÿ\u0001\u0005\u0002°Õû\u0081\u0007há>zº}\u0087\u0007Näo¤\u0098S¥\u0006¨¸\u0097/9\"\u0006\rZuÿ®.Jv\u001b+\u0006¢¾Â<Óþ²§\u0007ìH\u009a\\7µå\u0095\u001fK\u008b\"pöb\u008cK~\u0007³»Á¨\u00adÐ\u0004f¿eÍ£0[Ú|\u0000ÁÊ9FnåÙ\u009dD\u0001ìØ\u009c¿}\u0013mÄe\u0002a&ýß\u0082\u0005¹)¢Èo\u000fÔú\u0016\u0086\u0099´vÌÞW\u007fÖ\u001byÖ\u0004pÆ©\\\u0004ûyØ«\u0006Ö~X÷À92øFúk\u0098\u0013\u0085\u0089;H¯q¤6<ÁÓU#ÚÚËÏbh\u000fWÆ\u0001©T§y\u009d¡\f¾-\u0093\u008cöÂcä¢>hõ \n\u000b\u009e\u0014Út\r\u0010&¡\u001a\u001c®=\u0099°Ös\u001d\u00105é-Dmðü\u00067Ç®\u0087\u0000\u009eÖ\u008beÝ\u001f\u008e\u008d\n¬\u0002\u0090§ÈN\u009f\u009eä¸\u0090\r\u0000\u0086µ¶s¶J\u001c¥±cþ\u0099S\u008f\u001bj\u008e-*ù\u000eì\u0086\fw!rÙýÛkC\u0018¯µ\u0010\u008a¾Cxeë\u001dvê\r´\u001f\u0086\u0086bÏ\u000be,\u0099E÷ëýÞaóÁ\u0004\n(ï\u0088\u001di^ÔÌÂÂï\u0087h5¼ÖûõzÌT\\Éi\u001aP»=JsS$Ç\u0004\u001d4þ$\u0012«/gAãº\u0098É\u0092¦%Ã{ÌÿG×\u0005"
         .length();
      char var1 = 18;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 5;
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
                     case 0 -> 24;
                     case 1 -> 85;
                     case 2 -> 75;
                     case 3 -> 32;
                     case 4 -> 85;
                     case 5 -> 86;
                     default -> 105;
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
                     b = new String[25];
                     break label52;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "¡\u009b[.\u0013G\u0082\u000bì¢³:\u0006\u0096Ú\"Ë`\u008c";
                  var4 = "¡\u009b[.\u0013G\u0082\u000bì¢³:\u0006\u0096Ú\"Ë`\u008c".length();
                  var1 = '\f';
                  var8 = -1;
            }

            var10000 = 37;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -6054) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 61;
            case 1 -> 84;
            case 2 -> 53;
            case 3 -> 65;
            case 4 -> 106;
            case 5 -> 30;
            case 6 -> 212;
            case 7 -> 96;
            case 8 -> 31;
            case 9 -> 241;
            case 10 -> 252;
            case 11 -> 244;
            case 12 -> 184;
            case 13 -> 231;
            case 14 -> 155;
            case 15 -> 138;
            case 16 -> 17;
            case 17 -> 99;
            case 18 -> 9;
            case 19 -> 178;
            case 20 -> 240;
            case 21 -> 44;
            case 22 -> 64;
            case 23 -> 228;
            case 24 -> 145;
            case 25 -> 19;
            case 26 -> 120;
            case 27 -> 190;
            case 28 -> 36;
            case 29 -> 142;
            case 30 -> 153;
            case 31 -> 47;
            case 32 -> 4;
            case 33 -> 238;
            case 34 -> 223;
            case 35 -> 123;
            case 36 -> 203;
            case 37 -> 93;
            case 38 -> 98;
            case 39 -> 101;
            case 40 -> 82;
            case 41 -> 110;
            case 42 -> 185;
            case 43 -> 219;
            case 44 -> 85;
            case 45 -> 207;
            case 46 -> 1;
            case 47 -> 204;
            case 48 -> 180;
            case 49 -> 2;
            case 50 -> 186;
            case 51 -> 198;
            case 52 -> 71;
            case 53 -> 149;
            case 54 -> 95;
            case 55 -> 159;
            case 56 -> 205;
            case 57 -> 151;
            case 58 -> 12;
            case 59 -> 42;
            case 60 -> 125;
            case 61 -> 229;
            case 62 -> 152;
            case 63 -> 175;
            case 64 -> 24;
            case 65 -> 104;
            case 66 -> 239;
            case 67 -> 141;
            case 68 -> 46;
            case 69 -> 216;
            case 70 -> 75;
            case 71 -> 81;
            case 72 -> 194;
            case 73 -> 133;
            case 74 -> 11;
            case 75 -> 187;
            case 76 -> 114;
            case 77 -> 16;
            case 78 -> 134;
            case 79 -> 163;
            case 80 -> 0;
            case 81 -> 161;
            case 82 -> 174;
            case 83 -> 117;
            case 84 -> 196;
            case 85 -> 232;
            case 86 -> 113;
            case 87 -> 70;
            case 88 -> 8;
            case 89 -> 105;
            case 90 -> 183;
            case 91 -> 15;
            case 92 -> 111;
            case 93 -> 251;
            case 94 -> 45;
            case 95 -> 147;
            case 96 -> 13;
            case 97 -> 146;
            case 98 -> 103;
            case 99 -> 5;
            case 100 -> 157;
            case 101 -> 28;
            case 102 -> 162;
            case 103 -> 60;
            case 104 -> 192;
            case 105 -> 73;
            case 106 -> 182;
            case 107 -> 41;
            case 108 -> 140;
            case 109 -> 188;
            case 110 -> 131;
            case 111 -> 247;
            case 112 -> 249;
            case 113 -> 109;
            case 114 -> 51;
            case 115 -> 59;
            case 116 -> 74;
            case 117 -> 88;
            case 118 -> 245;
            case 119 -> 43;
            case 120 -> 58;
            case 121 -> 200;
            case 122 -> 25;
            case 123 -> 191;
            case 124 -> 222;
            case 125 -> 29;
            case 126 -> 202;
            case 127 -> 10;
            case 128 -> 233;
            case 129 -> 234;
            case 130 -> 102;
            case 131 -> 80;
            case 132 -> 224;
            case 133 -> 172;
            case 134 -> 211;
            case 135 -> 170;
            case 136 -> 250;
            case 137 -> 255;
            case 138 -> 130;
            case 139 -> 97;
            case 140 -> 243;
            case 141 -> 193;
            case 142 -> 119;
            case 143 -> 128;
            case 144 -> 27;
            case 145 -> 171;
            case 146 -> 79;
            case 147 -> 236;
            case 148 -> 57;
            case 149 -> 237;
            case 150 -> 78;
            case 151 -> 86;
            case 152 -> 118;
            case 153 -> 83;
            case 154 -> 136;
            case 155 -> 209;
            case 156 -> 217;
            case 157 -> 122;
            case 158 -> 22;
            case 159 -> 208;
            case 160 -> 181;
            case 161 -> 154;
            case 162 -> 121;
            case 163 -> 108;
            case 164 -> 100;
            case 165 -> 235;
            case 166 -> 76;
            case 167 -> 90;
            case 168 -> 91;
            case 169 -> 34;
            case 170 -> 197;
            case 171 -> 246;
            case 172 -> 18;
            case 173 -> 221;
            case 174 -> 177;
            case 175 -> 226;
            case 176 -> 55;
            case 177 -> 218;
            case 178 -> 3;
            case 179 -> 20;
            case 180 -> 179;
            case 181 -> 215;
            case 182 -> 72;
            case 183 -> 168;
            case 184 -> 112;
            case 185 -> 189;
            case 186 -> 40;
            case 187 -> 49;
            case 188 -> 23;
            case 189 -> 48;
            case 190 -> 135;
            case 191 -> 32;
            case 192 -> 94;
            case 193 -> 115;
            case 194 -> 201;
            case 195 -> 166;
            case 196 -> 176;
            case 197 -> 213;
            case 198 -> 89;
            case 199 -> 210;
            case 200 -> 160;
            case 201 -> 144;
            case 202 -> 253;
            case 203 -> 214;
            case 204 -> 66;
            case 205 -> 150;
            case 206 -> 173;
            case 207 -> 158;
            case 208 -> 220;
            case 209 -> 124;
            case 210 -> 107;
            case 211 -> 52;
            case 212 -> 126;
            case 213 -> 54;
            case 214 -> 148;
            case 215 -> 35;
            case 216 -> 132;
            case 217 -> 248;
            case 218 -> 33;
            case 219 -> 69;
            case 220 -> 63;
            case 221 -> 227;
            case 222 -> 242;
            case 223 -> 206;
            case 224 -> 116;
            case 225 -> 6;
            case 226 -> 167;
            case 227 -> 87;
            case 228 -> 143;
            case 229 -> 77;
            case 230 -> 169;
            case 231 -> 156;
            case 232 -> 199;
            case 233 -> 62;
            case 234 -> 56;
            case 235 -> 254;
            case 236 -> 39;
            case 237 -> 165;
            case 238 -> 225;
            case 239 -> 195;
            case 240 -> 137;
            case 241 -> 14;
            case 242 -> 92;
            case 243 -> 37;
            case 244 -> 67;
            case 245 -> 21;
            case 246 -> 164;
            case 247 -> 139;
            case 248 -> 7;
            case 249 -> 26;
            case 250 -> 230;
            case 251 -> 127;
            case 252 -> 50;
            case 253 -> 129;
            case 254 -> 38;
            default -> 68;
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
      @NotNull
      private final Vec3 IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(@NotNull Vec3 var1, boolean var2) {
         short var10001 = 3587;
         short var10002 = 6680;
         Intrinsics.checkNotNullParameter(var1, "pos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      }

      @NotNull
      public final Vec3 a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final boolean b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final Vec3 c() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final boolean d() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final lIllIIIllIllllllIIIIIlIIIIIlIllIIlllIllIIllIlIIIIIIIlIlllIlIIIllIIlIlIIIIIIlIlIIlIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         @NotNull Vec3 var1, boolean var2
      ) {
         short var10001 = 3586;
         short var10002 = -3103;
         Intrinsics.checkNotNullParameter(var1, "pos");
         return new lIllIIIllIllllllIIIIIlIIIIIlIllIIlllIllIIllIlIIIIIIIlIlllIlIIIllIIlIlIIIIIIlIlIIlIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10002 = 3584;
         short var10003 = 14218;
         var10003 = 3585;
         short var10004 = 26204;
         return "PathPoint(pos="
            + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            + ", jump="
            + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         return var1 * 31 + Boolean.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof lIllIIIllIllllllIIIIIlIIIIIlIllIIlllIllIIllIlIIIIIIIlIlllIlIIIllIIlIlIIIIIIlIlIIlIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIllIIIllIllllllIIIIIlIIIIIlIllIIlllIllIIllIlIIIIIIIlIlllIlIIIllIIlIlIIIIIIlIlIIlIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (lIllIIIllIllllllIIIIIlIIIIIlIllIIlllIllIIllIlIIIIIIIlIlllIlIIIllIIlIlIIIIIIlIlIIlIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         boolean var4 = Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         );
         if (var2 != null) {
            if (!var4) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         if (var2 != null) {
            if (var4 != var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
               return false;
            }

            var4 = true;
         }

         return var4;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[4];
         int var3 = 0;
         String var2 = "ÔÏë\u0003N¹¸";
         int var4 = "ÔÏë\u0003N¹¸".length();
         char var1 = 3;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 60;
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
                        case 0 -> 118;
                        case 1 -> 108;
                        case 2 -> 9;
                        case 3 -> 75;
                        case 4 -> 78;
                        case 5 -> 102;
                        default -> 67;
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
                        b = new String[4];
                        break label52;
                     }

                     var1 = var2.charAt(var8);
                     break;
                  default:
                     var5[var3++] = var29;
                     if ((var8 += var1) < var4) {
                        var1 = var2.charAt(var8);
                        continue label52;
                     }

                     var2 = "×ËWGfå\u0012\u000e<ÂÇ\u0012\u0094î\u0082\"Í¡\\° \u008a";
                     var4 = "×ËWGfå\u0012\u000e<ÂÇ\u0012\u0094î\u0082\"Í¡\\° \u008a".length();
                     var1 = 7;
                     var8 = -1;
               }

               var10000 = 44;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 3587) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 58;
               case 1 -> 37;
               case 2 -> 209;
               case 3 -> 57;
               case 4 -> 109;
               case 5 -> 56;
               case 6 -> 170;
               case 7 -> 55;
               case 8 -> 19;
               case 9 -> 162;
               case 10 -> 121;
               case 11 -> 252;
               case 12 -> 75;
               case 13 -> 32;
               case 14 -> 125;
               case 15 -> 224;
               case 16 -> 150;
               case 17 -> 77;
               case 18 -> 126;
               case 19 -> 192;
               case 20 -> 50;
               case 21 -> 29;
               case 22 -> 100;
               case 23 -> 249;
               case 24 -> 153;
               case 25 -> 3;
               case 26 -> 136;
               case 27 -> 131;
               case 28 -> 71;
               case 29 -> 241;
               case 30 -> 31;
               case 31 -> 208;
               case 32 -> 49;
               case 33 -> 205;
               case 34 -> 193;
               case 35 -> 210;
               case 36 -> 62;
               case 37 -> 244;
               case 38 -> 103;
               case 39 -> 141;
               case 40 -> 168;
               case 41 -> 91;
               case 42 -> 76;
               case 43 -> 230;
               case 44 -> 163;
               case 45 -> 92;
               case 46 -> 70;
               case 47 -> 155;
               case 48 -> 104;
               case 49 -> 87;
               case 50 -> 98;
               case 51 -> 107;
               case 52 -> 113;
               case 53 -> 171;
               case 54 -> 61;
               case 55 -> 128;
               case 56 -> 204;
               case 57 -> 97;
               case 58 -> 181;
               case 59 -> 231;
               case 60 -> 186;
               case 61 -> 250;
               case 62 -> 59;
               case 63 -> 96;
               case 64 -> 17;
               case 65 -> 194;
               case 66 -> 161;
               case 67 -> 173;
               case 68 -> 138;
               case 69 -> 238;
               case 70 -> 225;
               case 71 -> 232;
               case 72 -> 174;
               case 73 -> 139;
               case 74 -> 8;
               case 75 -> 74;
               case 76 -> 73;
               case 77 -> 24;
               case 78 -> 134;
               case 79 -> 51;
               case 80 -> 154;
               case 81 -> 144;
               case 82 -> 13;
               case 83 -> 28;
               case 84 -> 115;
               case 85 -> 39;
               case 86 -> 175;
               case 87 -> 85;
               case 88 -> 69;
               case 89 -> 1;
               case 90 -> 80;
               case 91 -> 140;
               case 92 -> 169;
               case 93 -> 203;
               case 94 -> 147;
               case 95 -> 130;
               case 96 -> 202;
               case 97 -> 30;
               case 98 -> 26;
               case 99 -> 106;
               case 100 -> 211;
               case 101 -> 152;
               case 102 -> 84;
               case 103 -> 53;
               case 104 -> 81;
               case 105 -> 197;
               case 106 -> 78;
               case 107 -> 178;
               case 108 -> 156;
               case 109 -> 196;
               case 110 -> 135;
               case 111 -> 41;
               case 112 -> 165;
               case 113 -> 133;
               case 114 -> 247;
               case 115 -> 108;
               case 116 -> 2;
               case 117 -> 143;
               case 118 -> 27;
               case 119 -> 83;
               case 120 -> 129;
               case 121 -> 180;
               case 122 -> 201;
               case 123 -> 229;
               case 124 -> 79;
               case 125 -> 120;
               case 126 -> 36;
               case 127 -> 16;
               case 128 -> 6;
               case 129 -> 160;
               case 130 -> 86;
               case 131 -> 0;
               case 132 -> 112;
               case 133 -> 94;
               case 134 -> 46;
               case 135 -> 88;
               case 136 -> 89;
               case 137 -> 213;
               case 138 -> 119;
               case 139 -> 68;
               case 140 -> 216;
               case 141 -> 187;
               case 142 -> 237;
               case 143 -> 21;
               case 144 -> 245;
               case 145 -> 60;
               case 146 -> 149;
               case 147 -> 35;
               case 148 -> 190;
               case 149 -> 222;
               case 150 -> 34;
               case 151 -> 228;
               case 152 -> 40;
               case 153 -> 43;
               case 154 -> 185;
               case 155 -> 183;
               case 156 -> 246;
               case 157 -> 72;
               case 158 -> 42;
               case 159 -> 151;
               case 160 -> 9;
               case 161 -> 176;
               case 162 -> 65;
               case 163 -> 234;
               case 164 -> 38;
               case 165 -> 15;
               case 166 -> 66;
               case 167 -> 242;
               case 168 -> 236;
               case 169 -> 142;
               case 170 -> 215;
               case 171 -> 166;
               case 172 -> 124;
               case 173 -> 44;
               case 174 -> 200;
               case 175 -> 132;
               case 176 -> 254;
               case 177 -> 218;
               case 178 -> 93;
               case 179 -> 11;
               case 180 -> 184;
               case 181 -> 159;
               case 182 -> 207;
               case 183 -> 167;
               case 184 -> 110;
               case 185 -> 114;
               case 186 -> 20;
               case 187 -> 137;
               case 188 -> 191;
               case 189 -> 158;
               case 190 -> 179;
               case 191 -> 235;
               case 192 -> 5;
               case 193 -> 214;
               case 194 -> 105;
               case 195 -> 47;
               case 196 -> 243;
               case 197 -> 240;
               case 198 -> 198;
               case 199 -> 116;
               case 200 -> 48;
               case 201 -> 122;
               case 202 -> 182;
               case 203 -> 189;
               case 204 -> 212;
               case 205 -> 195;
               case 206 -> 239;
               case 207 -> 95;
               case 208 -> 146;
               case 209 -> 18;
               case 210 -> 101;
               case 211 -> 102;
               case 212 -> 206;
               case 213 -> 251;
               case 214 -> 248;
               case 215 -> 54;
               case 216 -> 67;
               case 217 -> 52;
               case 218 -> 22;
               case 219 -> 157;
               case 220 -> 117;
               case 221 -> 221;
               case 222 -> 45;
               case 223 -> 220;
               case 224 -> 223;
               case 225 -> 64;
               case 226 -> 219;
               case 227 -> 90;
               case 228 -> 177;
               case 229 -> 82;
               case 230 -> 145;
               case 231 -> 99;
               case 232 -> 253;
               case 233 -> 14;
               case 234 -> 123;
               case 235 -> 63;
               case 236 -> 4;
               case 237 -> 227;
               case 238 -> 127;
               case 239 -> 25;
               case 240 -> 164;
               case 241 -> 188;
               case 242 -> 226;
               case 243 -> 199;
               case 244 -> 148;
               case 245 -> 172;
               case 246 -> 23;
               case 247 -> 10;
               case 248 -> 255;
               case 249 -> 12;
               case 250 -> 233;
               case 251 -> 217;
               case 252 -> 118;
               case 253 -> 7;
               case 254 -> 33;
               default -> 111;
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
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(net.minecraft.world.phys.Vec3 var1, boolean var2, int var3, kotlin.jvm.internal.DefaultConstructorMarker var4) {
      this(var1, (var3 & 2) != 0 ? false : var2);
      }
      public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll o, net.minecraft.world.phys.Vec3 var1, boolean var2, int var3, Object var4) {
         short mask = 0;
         if ((mask & 1) != 0) var1 = o.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if ((mask & 2) != 0) var2 = o.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         return o.a(var1, var2);
      }
   }

  // PX-FIX synth restored from jar bytecode
  public static boolean a(me.octo.client.lIllIIIllIllllllIIIIIlIIIIIlIllIIlllIllIIllIlIIIIIIIlIlllIlIIIllIIlIlIIIIIIlIlIIlIIlI p0, net.minecraft.world.phys.Vec3 p1) { return p0.a(p1); }
}
