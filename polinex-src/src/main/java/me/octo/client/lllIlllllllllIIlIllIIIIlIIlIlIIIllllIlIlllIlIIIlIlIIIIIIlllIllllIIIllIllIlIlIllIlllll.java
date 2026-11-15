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

public final class lllIlllllllllIIlIllIIIIlIIlIlIIIllllIlIlllIlIIIlIlIIIIIIlllIllllIIIllIllIlIlIllIlllll {
   public static int var11 = 0; // PX-FIX (retyped int) missing field v2
   
   public Object receiver; // PX-FIX kotlin lambda receiver

   @NotNull
   private final Minecraft IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private ArrayList<lllIlllllllllIIlIllIIIIlIIlIlIIIllllIlIlllIlIIIlIlIIIIIIlllIllllIIIllIllIlIlIllIlllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
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
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private Vec3 lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private double lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private int lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private boolean IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private boolean llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static String[] a;
   private static String[] b;

   public lllIlllllllllIIlIllIIIIlIIlIlIIIllllIlIlllIlIIIlIlIIIIIIlllIllllIIIllIllIlIlIllIlllll() {
      Minecraft var10001 = Minecraft.getInstance();
      short var10003 = 20364;
      short var10004 = 12352;
      Intrinsics.checkNotNullExpressionValue(var10001, "getInstance(...)");
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var10001;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new ArrayList<>();
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new ArrayList<>();
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = 35.0F;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      Vec3 var1 = Vec3.ZERO;
      var10003 = 20376;
      var10004 = 19149;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var1;
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
      short var10001 = 20359;
      short var10002 = 21937;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
   }

   public final boolean c() {
      return this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   }

   public final void b(boolean var1) {
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var1;
   }

   private final void d() { Object var9 = null; // PX-FIX hoist
         boolean var11 = false; // PX-FIX hoist
        
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

             var11 = false;
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
                  short var10004 = -12369;
                  short var10005 = -14058;
                  var10005 = -12370;
                  short var10006 = 8377;
               }

               public final Boolean a(Vec3 var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = -12372;
                  short var10002 = 21176;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  return ((lllIlllllllllIIlIllIIIIlIIlIlIIIllllIlIlllIlIIIlIlIIIIIIlllIllllIIIllIllIlIlIllIlllll)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3x = 0;
                  String var2x = "ÿ\"æq;\u0015ä\r\u009d@Ê4Ü_\u001a\\\"fÎr'\rA\u000fÏ\t'³/\u001eÑ\u000f~Z\r\u0000ËÃ¨\u0013\f]]Ò\tì\u0012·\u0017U\u0010ñä'©\u0003\u000eãn},Ö¹_îjj\u0002\u009a\u0018";
                  int var4x = "ÿ\"æq;\u0015ä\r\u009d@Ê4Ü_\u001a\\\"fÎr'\rA\u000fÏ\t'³/\u001eÑ\u000f~Z\r\u0000ËÃ¨\u0013\f]]Ò\tì\u0012·\u0017U\u0010ñä'©\u0003\u000eãn},Ö¹_îjj\u0002\u009a\u0018"
                     .length();
                  char var1x = '2';
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2x.substring(++var0, var0 + var1x).toCharArray();
                        int var10004 = var10003.length;
                        int var6x = 0;
                        byte var13 = 40;
                        var10002 = var10003;
                        int var8x = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 40;
                           var10006 = var6x;
                        } else {
                           var13 = 40;
                           var8x = var10004;
                           if (var10004 <= var6x) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 40;
                           var10006 = var6x;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6x % 7) {
                              case 0 -> 98;
                              case 1 -> 58;
                              case 2 -> 108;
                              case 3 -> 35;
                              case 4 -> 105;
                              case 5 -> 87;
                              default -> 41;
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
                  int var2x = (var0 ^ -12370) & 65535;
                  if (b[var2x] == null) {
                     char[] var3 = a[var2x].toCharArray();

                     short var4x = switch (var3[0] & 0xFF) {
                        case 0 -> 28;
                        case 1 -> 21;
                        case 2 -> 252;
                        case 3 -> 167;
                        case 4 -> 14;
                        case 5 -> 47;
                        case 6 -> 57;
                        case 7 -> 75;
                        case 8 -> 230;
                        case 9 -> 48;
                        case 10 -> 128;
                        case 11 -> 139;
                        case 12 -> 182;
                        case 13 -> 226;
                        case 14 -> 51;
                        case 15 -> 10;
                        case 16 -> 98;
                        case 17 -> 42;
                        case 18 -> 176;
                        case 19 -> 211;
                        case 20 -> 192;
                        case 21 -> 12;
                        case 22 -> 3;
                        case 23 -> 63;
                        case 24 -> 195;
                        case 25 -> 222;
                        case 26 -> 181;
                        case 27 -> 155;
                        case 28 -> 145;
                        case 29 -> 9;
                        case 30 -> 248;
                        case 31 -> 219;
                        case 32 -> 143;
                        case 33 -> 69;
                        case 34 -> 6;
                        case 35 -> 236;
                        case 36 -> 231;
                        case 37 -> 39;
                        case 38 -> 114;
                        case 39 -> 147;
                        case 40 -> 160;
                        case 41 -> 130;
                        case 42 -> 224;
                        case 43 -> 109;
                        case 44 -> 213;
                        case 45 -> 210;
                        case 46 -> 40;
                        case 47 -> 122;
                        case 48 -> 247;
                        case 49 -> 36;
                        case 50 -> 204;
                        case 51 -> 35;
                        case 52 -> 179;
                        case 53 -> 173;
                        case 54 -> 183;
                        case 55 -> 118;
                        case 56 -> 27;
                        case 57 -> 104;
                        case 58 -> 249;
                        case 59 -> 105;
                        case 60 -> 66;
                        case 61 -> 158;
                        case 62 -> 108;
                        case 63 -> 76;
                        case 64 -> 129;
                        case 65 -> 254;
                        case 66 -> 16;
                        case 67 -> 215;
                        case 68 -> 217;
                        case 69 -> 148;
                        case 70 -> 20;
                        case 71 -> 44;
                        case 72 -> 191;
                        case 73 -> 223;
                        case 74 -> 123;
                        case 75 -> 103;
                        case 76 -> 92;
                        case 77 -> 159;
                        case 78 -> 102;
                        case 79 -> 209;
                        case 80 -> 174;
                        case 81 -> 239;
                        case 82 -> 180;
                        case 83 -> 71;
                        case 84 -> 95;
                        case 85 -> 140;
                        case 86 -> 228;
                        case 87 -> 216;
                        case 88 -> 94;
                        case 89 -> 134;
                        case 90 -> 58;
                        case 91 -> 157;
                        case 92 -> 115;
                        case 93 -> 31;
                        case 94 -> 201;
                        case 95 -> 250;
                        case 96 -> 45;
                        case 97 -> 171;
                        case 98 -> 172;
                        case 99 -> 169;
                        case 100 -> 86;
                        case 101 -> 162;
                        case 102 -> 7;
                        case 103 -> 242;
                        case 104 -> 235;
                        case 105 -> 163;
                        case 106 -> 194;
                        case 107 -> 240;
                        case 108 -> 170;
                        case 109 -> 22;
                        case 110 -> 83;
                        case 111 -> 120;
                        case 112 -> 72;
                        case 113 -> 125;
                        case 114 -> 202;
                        case 115 -> 116;
                        case 116 -> 144;
                        case 117 -> 5;
                        case 118 -> 253;
                        case 119 -> 37;
                        case 120 -> 25;
                        case 121 -> 1;
                        case 122 -> 18;
                        case 123 -> 153;
                        case 124 -> 188;
                        case 125 -> 30;
                        case 126 -> 54;
                        case 127 -> 65;
                        case 128 -> 110;
                        case 129 -> 101;
                        case 130 -> 206;
                        case 131 -> 38;
                        case 132 -> 165;
                        case 133 -> 175;
                        case 134 -> 244;
                        case 135 -> 50;
                        case 136 -> 91;
                        case 137 -> 53;
                        case 138 -> 190;
                        case 139 -> 251;
                        case 140 -> 255;
                        case 141 -> 88;
                        case 142 -> 96;
                        case 143 -> 135;
                        case 144 -> 99;
                        case 145 -> 43;
                        case 146 -> 189;
                        case 147 -> 74;
                        case 148 -> 227;
                        case 149 -> 4;
                        case 150 -> 81;
                        case 151 -> 152;
                        case 152 -> 203;
                        case 153 -> 41;
                        case 154 -> 220;
                        case 155 -> 243;
                        case 156 -> 73;
                        case 157 -> 208;
                        case 158 -> 90;
                        case 159 -> 149;
                        case 160 -> 200;
                        case 161 -> 13;
                        case 162 -> 78;
                        case 163 -> 61;
                        case 164 -> 161;
                        case 165 -> 49;
                        case 166 -> 196;
                        case 167 -> 241;
                        case 168 -> 185;
                        case 169 -> 106;
                        case 170 -> 218;
                        case 171 -> 166;
                        case 172 -> 193;
                        case 173 -> 77;
                        case 174 -> 113;
                        case 175 -> 212;
                        case 176 -> 151;
                        case 177 -> 93;
                        case 178 -> 184;
                        case 179 -> 87;
                        case 180 -> 146;
                        case 181 -> 221;
                        case 182 -> 17;
                        case 183 -> 112;
                        case 184 -> 126;
                        case 185 -> 127;
                        case 186 -> 89;
                        case 187 -> 68;
                        case 188 -> 198;
                        case 189 -> 132;
                        case 190 -> 168;
                        case 191 -> 186;
                        case 192 -> 156;
                        case 193 -> 67;
                        case 194 -> 233;
                        case 195 -> 2;
                        case 196 -> 32;
                        case 197 -> 197;
                        case 198 -> 124;
                        case 199 -> 225;
                        case 200 -> 187;
                        case 201 -> 138;
                        case 202 -> 33;
                        case 203 -> 59;
                        case 204 -> 177;
                        case 205 -> 238;
                        case 206 -> 207;
                        case 207 -> 121;
                        case 208 -> 24;
                        case 209 -> 229;
                        case 210 -> 214;
                        case 211 -> 246;
                        case 212 -> 164;
                        case 213 -> 234;
                        case 214 -> 34;
                        case 215 -> 178;
                        case 216 -> 26;
                        case 217 -> 79;
                        case 218 -> 117;
                        case 219 -> 205;
                        case 220 -> 0;
                        case 221 -> 131;
                        case 222 -> 85;
                        case 223 -> 64;
                        case 224 -> 23;
                        case 225 -> 154;
                        case 226 -> 84;
                        case 227 -> 46;
                        case 228 -> 8;
                        case 229 -> 29;
                        case 230 -> 111;
                        case 231 -> 55;
                        case 232 -> 15;
                        case 233 -> 232;
                        case 234 -> 11;
                        case 235 -> 136;
                        case 236 -> 199;
                        case 237 -> 137;
                        case 238 -> 107;
                        case 239 -> 62;
                        case 240 -> 133;
                        case 241 -> 237;
                        case 242 -> 80;
                        case 243 -> 56;
                        case 244 -> 245;
                        case 245 -> 141;
                        case 246 -> 19;
                        case 247 -> 97;
                        case 248 -> 119;
                        case 249 -> 82;
                        case 250 -> 150;
                        case 251 -> 142;
                        case 252 -> 52;
                        case 253 -> 60;
                        case 254 -> 70;
                        default -> 100;
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
                  new lllIlllllllllIIlIllIIIIlIIlIlIIIllllIlIlllIlIIIlIlIIIIIIlllIllllIIIllIllIlIlIllIlllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
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
         short var10001 = 20371;
         short var10002 = 9002;
         var10002 = 20362;
         short var10003 = 4706;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
            "§aGenerated smooth path with " + var20 + " points"
         );
         break;
      }
   }

   private final boolean a(Vec3 var1, Vec3 var2) { BlockPos var11 = null; // PX-FIX hoist
        
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
                  short var10002 = 20378;
                  short var10003 = -24445;
                  Intrinsics.checkNotNullExpressionValue(var13, "containing(...)");
                  var7 = var13;
                  BlockPos var14 = BlockPos.containing(var2);
                  var10002 = 20357;
                  var10003 = -8774;
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
               short var19 = 20353;
               short var22 = 17254;
               Intrinsics.checkNotNullExpressionValue(var16, "offset(...)");
                var11 = var16;
               BlockState var17 = var4.getBlockState(var11);
               var19 = 20383;
               var22 = -19102;
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
         boolean var11 = false; // PX-FIX hoist
        
      String var2 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var2 != null && this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level != null) {
         ClientLevel var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level;
         BlockPos var10000 = BlockPos.containing(var1);
         short var10002 = 20357;
         short var10003 = -8774;
         Intrinsics.checkNotNullExpressionValue(var10000, "containing(...)");
         BlockPos var4 = var10000;
         BlockState var8 = var3.getBlockState(var4.below());
         var10002 = 20380;
         var10003 = 30620;
         Intrinsics.checkNotNullExpressionValue(var8, "getBlockState(...)");
         BlockState var5 = var8;
          var9 = var3.getBlockState(var4);
         var10002 = 20380;
         var10003 = 30620;
         Intrinsics.checkNotNullExpressionValue(var9, "getBlockState(...)");
         BlockState var6 = var9;
         BlockState var10 = var3.getBlockState(var4.above());
         var10002 = 20380;
         var10003 = 30620;
         Intrinsics.checkNotNullExpressionValue(var10, "getBlockState(...)");
         BlockState var7 = var10;
          var11 = var5.isAir();
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
        
      int var53 = 0; // PX-FIX
      byte var52 = 0; // PX-FIX
      int var51 = 0; // PX-FIX
      Object var50 = null; // PX-FIX
      double var48 = 0; // PX-FIX
      Object var47 = null; // PX-FIX
      byte var46 = 0; // PX-FIX
      int var44 = 0; // PX-FIX
      Object var39 = null; // PX-FIX
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      short var10002 = 20367;
      short var10003 = 26399;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("sneak", false);
      String var1 = var10000;
      if (var1 != null) {
         label293:
         if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
            boolean var32 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.isEmpty();
            if (var1 != null) {
               if (var32) {
                  break label293;
               }

               var32 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.n();
            }

            if (var32) {
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .p();
               return;
            }

            lllIlllllllllIIlIllIIIIlIIlIlIIIllllIlIlllIlIIIlIlIIIIIIlllIllllIIIllIllIlIlIllIlllll var33 = this;
            if (var1 != null) {
               if (this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl != null) {
                  this.g();
               }

               var33 = this;
            }

            int var34 = ((var33.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.isEmpty()) ? 1 : 0);
            if (var1 != null) {
               if (var34 != 0) {
                  this.d();
                  this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = this.f();
                  this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.f();
               }

               var34 = ((this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.isEmpty()) ? 1 : 0);
            }

            if (var1 != null) {
               if (var34 != 0) {
                  short var55 = 20366;
                  short var62 = 20706;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
                     "§c[CobblestoneBot] No valid path generated, fix waypoints or contact support."
                  );
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .p();
                  return;
               }

               var34 = ((java.util.function.Supplier<Integer>)(() -> { this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.a(2000); return 0; })).get();
            }

            label323: {
               if (var1 != null) {
                  if (var34 == 0) {
                     break label323;
                  }

                  var34 = this.f();
               }

               int var2 = var34;
               Vec3 var3 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var2).a();
               double var4 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var3, false);
               if (var1 == null || var4 > 4.0) {
                  short var35 = 20382;
                  short var10001 = 28985;
                  String var7 = "%.1f";
                  Object[] var8 = new Object[]{var4};
                  var10000 = String.format(var7, Arrays.copyOf(var8, var8.length));
                  var10002 = 20354;
                  var10003 = 332;
                  Intrinsics.checkNotNullExpressionValue(var10000, "format(...)");
                  var10001 = 20363;
                  var10002 = 16669;
                  var10002 = 20360;
                  var10003 = -3562;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                     "§e[CobblestoneBot] Off-route detected! Resyncing... (" + var10000 + "m from path)"
                  );
                  this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var2;
                  this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 0;
                  me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .g();
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .p();
               }

               this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.f();
            }

            Vec3 var18 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
            int var37 = ((java.util.function.Supplier<Integer>)(() -> { this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.a(1000); return 0; })).get();
            if (var1 != null) {
               if (var37 != 0) {
                  label261: {
                     label260: {
                        label302: {
                           double var19 = var18.distanceTo(this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI);
                           double var73;
                           int var38 = (var73 = var19 - 0.2) == 0.0 ? 0 : (var73 < 0.0 ? -1 : 1);
                           if (var1 != null) {
                              if (var38 >= 0) {
                                 break label302;
                              }

                              var38 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
                           }

                           int var5 = var38;
                           this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var5 + 1;
                           var39 = this;
                           if (var1 == null) {
                              break label261;
                           }

                           if (this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll < 3) {
                              break label260;
                           }

                           short var40 = 20379;
                           short var57 = -9173;
                           me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                              "§c[CobblestoneBot] Stuck detected! Finding nearest path point..."
                           );
                           this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = this.f();
                           this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 0;
                           me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .g();
                           me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .p();
                           if (var1 != null) {
                              break label260;
                           }
                        }

                        this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 0;
                     }

                     var39 = this;
                  }

                  this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var18;
               }

               var37 = (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII + 4)
                  % this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.size();
            }

            label322: {
               int var20 = var37;
               double var21 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var20).a(), false);
               double var74;
               int var41 = (var74 = var21 - 1.75) == 0.0 ? 0 : (var74 < 0.0 ? -1 : 1);
               if (var1 != null) {
                  if (var41 < 0) {
                     this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = (
                           this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII + 4
                        )
                        % this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.size();
                     this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 0;
                  }

                  var10000 = String.valueOf(me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
                  if (var1 == null) {
                     break label322;
                  }

                  var41 = ((me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .i()) ? 1 : 0);
               }

               if (var41 == 0) {
                  label235: {
                     byte var43 = ((byte)((this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI) ? 1 : 0));
                     if (var1 != null) {
                        if (this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI) {
                           var44 = 10;
                           break label235;
                        }

                        var43 = 8;
                     }

                     var44 = var43 + Random.Default.nextInt(4);
                  }

                  int var6 = var44;
                  int var23 = (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII + var6)
                     % this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.size();
                  Vec3 var25 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var23).a();
                   var9 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a(var25)
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

            byte var24;
            label227: {
               label226: {
                  label306: {
                     Vec3 var22;
                     var22 = ((lllIlllllllllIIlIllIIIIlIIlIlIIIllllIlIlllIlIIIlIlIIIIIIlllIllllIIIllIllIlIlIllIlllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)(Object)var10000)
                        .a();
                     LocalPlayer var45 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.player;
                     Intrinsics.checkNotNull(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.player);
                     var24 = ((byte)((var45.horizontalCollision) ? 1 : 0));
                     var46 = var24;
                     label224:
                     if (var1 != null) {
                        if (var24 != 0) {
                           var46 = ((byte)((this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) ? 1 : 0));
                           if (var1 == null) {
                              break label224;
                           }

                           if (!this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) {
                              this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.f();
                           }
                        }

                        this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = (var24 != 0);
                        if (var1 == null) {
                           break label306;
                        }

                        var46 = var24;
                     }

                     if (var46 != 0) {
                        var47 = this;
                        if (var1 == null) {
                           break label226;
                        }

                        if (((java.util.function.Supplier<Boolean>)(() -> { this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.a(500); return false; })).get()) {
                           int var26 = this.f();
                           Vec3 var28 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var26).a();
                           double var10 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .a(var28, false);
                           var48 = var10;
                           if (var1 == null) {
                              break label227;
                           }

                           if (var10 < 3.0) {
                              this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var26;
                              var22 = var28;
                           }
                        }
                     }

                     me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(
                        me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                        var22,
                        false);
                  }

                  var47 = this;
               }

               LocalPlayer var49 = ((LocalPlayer)(Object)(((me.octo.client.PXDyn)(Object)((me.octo.client.PXDyn)var47).IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl).player));
               Intrinsics.checkNotNull(((me.octo.client.PXDyn)(Object)((me.octo.client.PXDyn)var47).IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl).player);
               var48 = var49.getY();
            }

            double var27 = var48;
            if (var1 != null) {
               if (var27 > this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl + 0.2) {
                  this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.f();
               }

               this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var27;
            }

            label308: {
               List var29 = this.a(5);
               var var12 = var29;
               boolean var13 = false;
               var50 = var12;
               label203:
               if (var1 != null) {
                  if (var12 instanceof Collection) {
                     var50 = (Collection)var12;
                     if (var1 == null) {
                        break label203;
                     }

                     if (((me.octo.client.PXDyn)var50).isEmpty()) {
                        var51 = 0;
                        break label308;
                     }
                  }

                  var50 = var12;
               }

               Iterator var14 = ((me.octo.client.PXDyn)var50).iterator();

               label194:
               while (true) {
                  if (!var14.hasNext()) {
                     var51 = 0;
                     break;
                  }

                  Object var15 = var14.next();
                  lllIlllllllllIIlIllIIIIlIIlIlIIIllllIlIlllIlIIIlIlIIIIIIlllIllllIIIllIllIlIlIllIlllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var16 = (lllIlllllllllIIlIllIIIIlIIlIlIIIllllIlIlllIlIIIlIlIIIIIIlllIllllIIIllIllIlIlIllIlllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var15;
                  boolean var17 = false;
                  var51 = ((var16.b()) ? 1 : 0);

                  while (true) {
                     label190: {
                        label311: {
                           if (var1 != null) {
                              if (var51 == 0) {
                                 break label311;
                              }

                              double var75;
                              var51 = (
                                       var75 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                             .a(var16.a(), false)
                                          - 2.5
                                    )
                                    == 0.0
                                 ? 0
                                 : (var75 < 0.0 ? -1 : 1);
                           }

                           if (var1 != null) {
                              if (var51 >= 0) {
                                 break label311;
                              }

                              double var76;
                              var51 = (var76 = var16.a().y - (var27 + 0.1)) == 0.0 ? 0 : (var76 < 0.0 ? -1 : 1);
                           }

                           if (var1 == null) {
                              break label190;
                           }

                           if (var51 > 0) {
                              var51 = 1;
                              break label190;
                           }
                        }

                        var51 = 0;
                     }

                     if (var51 == 0) {
                        break;
                     }

                     var51 = 1;
                     if (var1 != null) {
                        break label194;
                     }
                  }
               }
            }

            int var11;
            label167: {
               label312: {
                  var11 = var51;
                  var52 = var24;
                  if (var1 != null) {
                     if (var24 == 0) {
                        break label312;
                     }

                     var52 = ((java.util.function.Supplier<Byte>)(() -> { this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.a(200); return 0; })).get();
                  }

                  if (var1 == null) {
                     break label167;
                  }

                  if (var52 != 0) {
                     var52 = 1;
                     break label167;
                  }
               }

               var52 = 0;
            }

            label156: {
               label313: {
                  byte var30 = var52;
                  var53 = var11;
                  label154:
                  if (var1 != null) {
                     if (var11 == 0) {
                        var53 = var30;
                        if (var1 == null) {
                           break label154;
                        }

                        if (var30 == 0) {
                           break label313;
                        }
                     }

                     var53 = ((java.util.function.Supplier<Integer>)(() -> { this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.a(400); return 0; })).get();
                  }

                  if (var1 == null) {
                     break label156;
                  }

                  if (var53 != 0) {
                     var53 = 1;
                     break label156;
                  }
               }

               var53 = 0;
            }

            int var31 = var53;
            short var58 = 20377;
            var10002 = -3957;
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a("jump", (var31 != 0));
            var58 = 20365;
            var10002 = 31425;
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a("sprint", true);
            var58 = 20358;
            var10002 = -3878;
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a("sneak", false);
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var54 = me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            var58 = 20356;
            var10002 = 28243;
            boolean var70 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .j();
            if (var1 != null) {
               var70 = !var70;
            }

            var54.a("attack", var70);
            return;
         }

         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .p();
      }
   }

   private final List<lllIlllllllllIIlIllIIIIlIIlIlIIIllllIlIlllIlIIIlIlIIIIIIlllIllllIIIllIllIlIlIllIlllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> a(
      int var1
   ) {
      ArrayList var7 = null; // PX-FIX
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      ArrayList var3 = new ArrayList();
      String var2 = var10000;
      int var4 = 0;
      int var5 = RangesKt.coerceAtMost(var1, this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.size());

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

      return (List<lllIlllllllllIIlIllIIIIlIIlIlIIIllllIlIlllIlIIIlIlIIIIIIlllIllllIIIllIllIlIlIllIlllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll>)var7;
   }

   private final int f() {
       int var9 = 0; // PX-FIX decl var9
      int var2 = 0;
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      double var3 = Double.MAX_VALUE;
      String var1 = var10000;
      int var5 = 0;
      int var6 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.size();

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

   private final int b(Vec3 var1) { double var9 = 0.0; // PX-FIX hoist
        
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      int var3 = 0;
      String var2 = var10000;
      double var4 = Double.MAX_VALUE;
      int var6 = 0;
      int var7 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.size();

      while (true) {
         if (var6 < var7) {
            Vec3 var8 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.get(var6).a());
             var9 = var1.distanceTo(var8);
            if (var2 != null) {
               double var12;
               var11 = (var12 = var9 - var4) == 0.0 ? 0 : (var12 < 0.0 ? -1 : 1);
               if (var2 == null) {
                  break;
               }

               if (var11 < 0) {
                  var4 = var9;
                  var3 = var6;
               }

               var6++;
            }

            if (var2 != null) {
               continue;
            }
         }

         var11 = var3;
         break;
      }

      return var11;
   }

   private final void g() { boolean var9 = false; // PX-FIX hoist
         me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var11 = null; // PX-FIX hoist
        
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII var10000 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      if (var1 != null) {
         if (!(Boolean)me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a(
            me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
            false)) {
            return;
         }

         var10000 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10 = var10000.q();
      if (var10 != null) {
         me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2 = var10;
         ArrayList var3 = new ArrayList();
         if (var1 != null && this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll != null) {
            me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var4 = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
            boolean var5 = false;
            var3.add(var4.b());
         }

         if (this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl != null) {
            me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var6 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
            boolean var8 = false;
            var3.add(var6.b());
         }

          var11 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .o();
         if (var11 != null) {
            me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var7 = var11;
             var9 = false;
            if (var1 != null && var2.b() != var7.b()) {
               var3.add(var7.b());
            }
         }

         var3.add(var2.b());
         me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .w();
         me.octo.client.utils.player.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(2, lllIlllllllllIIlIllIIIIlIIlIlIIIllllIlIlllIlIIIlIlIIIIIIlllIllllIIIllIllIlIlIllIlllll::l, CollectionsKt.toList(var3), var2.b());
      }
   }

   public final void a(@NotNull List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> var1) {
      short var10001 = 20381;
      short var10002 = 1932;
      Intrinsics.checkNotNullParameter(var1, "startWaypoints");
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = true;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.clear();
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.addAll(var1);
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clear();
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 0;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.f();
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.f();
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.f();
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.f();
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w()
         .y;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 0;
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = false;
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .q();
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.a(
         me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
         false);
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .t();
   }

   public final void h() {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = false;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .p();
      short var10001 = 20361;
      short var10002 = 18593;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("attack", false);
      var10001 = 20355;
      var10002 = 6217;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("sprint", false);
      var10001 = 20352;
      var10002 = 22831;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("jump", false);
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clear();
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 0;
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = false;
   }

   @NotNull
   public final List<Vec3> i() { lllIlllllllllIIlIllIIIIlIIlIlIIIllllIlIlllIlIIIlIlIIIIIIlllIllllIIIllIllIlIlIllIlllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var9 = null; // PX-FIX hoist
        
      Collection var12 = null; // PX-FIX
      Iterable var2 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      boolean var3 = false;
      Collection var5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var2, 10));
      String var1 = var10000;
      boolean var6 = false;
      Iterator var7 = var2.iterator();

      while (true) {
         if (var7.hasNext()) {
            Object var8 = var7.next();
            var12 = var5;
             var9 = (lllIlllllllllIIlIllIIIIlIIlIlIIIllllIlIlllIlIIIlIlIIIIIIlllIllllIIIllIllIlIlIllIlllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var8;
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
      String var2 = "ó\u0093¬\u0085 ù\u0087\u0092\u009b\u001a³ÛâÿRyî\u008dí\b\u009c.4Ç\u001c[u¶\u009b[è\u008a[Èµ\u009c\b¡´\u0089×9¥t[9à\u0004òÊ»HÉ\u0007®HDc\u008e\\b\u0006·\u0083\u0015\u0096Ñô\f\u000bl\u001d¦\u008c\u0085Pïo-µ\u009c\u0005Dg*S\rM\"\u0012\u0096sg'oI\u0086a\u0010´\u0096\u0012ÜÄ?:×ÿÒ·\u008eixã\u008a{&\n\u0014\u0019²!t.\u0002Î\u0095{\u009a\u0092Yº>gÿ\u0088\u009c»S\u0090.ï)®\u001a/ëÎ5\u0086\u008e^\u0007Ó\u0004©¯ßK¶\u0018ºå¡Í\u0006êhèg¥Ü\u0010ô »é\t.\u0095V\u0006>{\n\u0088!;Æ\u0006\u000405l\u001e½\u000bÜN\u0099[\u0084ß\u0096Àñ\u0007\u0081\u000bî\u0082ãôY÷©Å\u0016§}\u0004yz¿\u0099\u0007Ëf}Ø¡Þá\u0005>\u007fePä\u000fÆ©c¾DDÈJô°hY\u000e\u008dì\u0006o'\u000e\u0002²f@Îó\u000bOÔ \u0019¹H\u007fÉw\u00adj»ËÓÛJÞzxöe\u008c$Ð{YÖLÍýQ\u0014\u0086ïê }\u0092ï>8\\¸Ú?wµóæF<í>G¬%\u0004~\rx\u008b\u000f+\u0084Þ\u001bóð>Ü*b³\u0003uÆ\u0083\u0004Ìð\tÈ\u0004É\u0017 =\u0012ëøXéwX\u000f\r\u009d\t\u0096Eú\u0019W\u0000õ¿\u0004\u008døÛï\u000eYc\u008d\u0099bX´ \u008bç\u001búSì";
      int var4 = "ó\u0093¬\u0085 ù\u0087\u0092\u009b\u001a³ÛâÿRyî\u008dí\b\u009c.4Ç\u001c[u¶\u009b[è\u008a[Èµ\u009c\b¡´\u0089×9¥t[9à\u0004òÊ»HÉ\u0007®HDc\u008e\\b\u0006·\u0083\u0015\u0096Ñô\f\u000bl\u001d¦\u008c\u0085Pïo-µ\u009c\u0005Dg*S\rM\"\u0012\u0096sg'oI\u0086a\u0010´\u0096\u0012ÜÄ?:×ÿÒ·\u008eixã\u008a{&\n\u0014\u0019²!t.\u0002Î\u0095{\u009a\u0092Yº>gÿ\u0088\u009c»S\u0090.ï)®\u001a/ëÎ5\u0086\u008e^\u0007Ó\u0004©¯ßK¶\u0018ºå¡Í\u0006êhèg¥Ü\u0010ô »é\t.\u0095V\u0006>{\n\u0088!;Æ\u0006\u000405l\u001e½\u000bÜN\u0099[\u0084ß\u0096Àñ\u0007\u0081\u000bî\u0082ãôY÷©Å\u0016§}\u0004yz¿\u0099\u0007Ëf}Ø¡Þá\u0005>\u007fePä\u000fÆ©c¾DDÈJô°hY\u000e\u008dì\u0006o'\u000e\u0002²f@Îó\u000bOÔ \u0019¹H\u007fÉw\u00adj»ËÓÛJÞzxöe\u008c$Ð{YÖLÍýQ\u0014\u0086ïê }\u0092ï>8\\¸Ú?wµóæF<í>G¬%\u0004~\rx\u008b\u000f+\u0084Þ\u001bóð>Ü*b³\u0003uÆ\u0083\u0004Ìð\tÈ\u0004É\u0017 =\u0012ëøXéwX\u000f\r\u009d\t\u0096Eú\u0019W\u0000õ¿\u0004\u008døÛï\u000eYc\u008d\u0099bX´ \u008bç\u001búSì"
         .length();
      char var1 = '5';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 109;
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
                     case 0 -> 67;
                     case 1 -> 5;
                     case 2 -> 114;
                     case 3 -> 29;
                     case 4 -> 100;
                     case 5 -> 99;
                     default -> 47;
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

                  var2 = "\u0096\u000fb\u0082¥ À\u0087ñÍ\u008eHl-\u0010\u0013\u0088H\u001d\u001c\u0093Ø²¥o\u0093?\u008f\u0080\u0087\u0086þo×÷CüÍ\u001f\n\u0093ÑçÀÎ`\u0003¬";
                  var4 = "\u0096\u000fb\u0082¥ À\u0087ñÍ\u008eHl-\u0010\u0013\u0088H\u001d\u001c\u0093Ø²¥o\u0093?\u008f\u0080\u0087\u0086þo×÷CüÍ\u001f\n\u0093ÑçÀÎ`\u0003¬"
                     .length();
                  var1 = 18;
                  var8 = -1;
            }

            var10000 = 51;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 20363) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 186;
            case 1 -> 128;
            case 2 -> 11;
            case 3 -> 5;
            case 4 -> 23;
            case 5 -> 29;
            case 6 -> 101;
            case 7 -> 103;
            case 8 -> 225;
            case 9 -> 254;
            case 10 -> 215;
            case 11 -> 253;
            case 12 -> 55;
            case 13 -> 60;
            case 14 -> 190;
            case 15 -> 44;
            case 16 -> 119;
            case 17 -> 56;
            case 18 -> 185;
            case 19 -> 17;
            case 20 -> 85;
            case 21 -> 126;
            case 22 -> 196;
            case 23 -> 90;
            case 24 -> 152;
            case 25 -> 117;
            case 26 -> 63;
            case 27 -> 172;
            case 28 -> 4;
            case 29 -> 189;
            case 30 -> 252;
            case 31 -> 65;
            case 32 -> 251;
            case 33 -> 153;
            case 34 -> 50;
            case 35 -> 26;
            case 36 -> 133;
            case 37 -> 206;
            case 38 -> 214;
            case 39 -> 219;
            case 40 -> 20;
            case 41 -> 160;
            case 42 -> 240;
            case 43 -> 76;
            case 44 -> 122;
            case 45 -> 229;
            case 46 -> 188;
            case 47 -> 224;
            case 48 -> 223;
            case 49 -> 127;
            case 50 -> 255;
            case 51 -> 174;
            case 52 -> 46;
            case 53 -> 232;
            case 54 -> 245;
            case 55 -> 115;
            case 56 -> 2;
            case 57 -> 81;
            case 58 -> 104;
            case 59 -> 138;
            case 60 -> 204;
            case 61 -> 171;
            case 62 -> 75;
            case 63 -> 195;
            case 64 -> 134;
            case 65 -> 51;
            case 66 -> 201;
            case 67 -> 180;
            case 68 -> 217;
            case 69 -> 199;
            case 70 -> 227;
            case 71 -> 231;
            case 72 -> 48;
            case 73 -> 210;
            case 74 -> 96;
            case 75 -> 181;
            case 76 -> 209;
            case 77 -> 137;
            case 78 -> 212;
            case 79 -> 147;
            case 80 -> 105;
            case 81 -> 22;
            case 82 -> 25;
            case 83 -> 114;
            case 84 -> 157;
            case 85 -> 35;
            case 86 -> 178;
            case 87 -> 242;
            case 88 -> 197;
            case 89 -> 53;
            case 90 -> 111;
            case 91 -> 237;
            case 92 -> 89;
            case 93 -> 193;
            case 94 -> 135;
            case 95 -> 142;
            case 96 -> 143;
            case 97 -> 238;
            case 98 -> 162;
            case 99 -> 116;
            case 100 -> 109;
            case 101 -> 230;
            case 102 -> 74;
            case 103 -> 202;
            case 104 -> 149;
            case 105 -> 221;
            case 106 -> 6;
            case 107 -> 145;
            case 108 -> 95;
            case 109 -> 100;
            case 110 -> 164;
            case 111 -> 37;
            case 112 -> 155;
            case 113 -> 139;
            case 114 -> 187;
            case 115 -> 80;
            case 116 -> 200;
            case 117 -> 220;
            case 118 -> 61;
            case 119 -> 136;
            case 120 -> 120;
            case 121 -> 102;
            case 122 -> 113;
            case 123 -> 36;
            case 124 -> 69;
            case 125 -> 108;
            case 126 -> 73;
            case 127 -> 87;
            case 128 -> 194;
            case 129 -> 21;
            case 130 -> 249;
            case 131 -> 203;
            case 132 -> 112;
            case 133 -> 99;
            case 134 -> 198;
            case 135 -> 78;
            case 136 -> 148;
            case 137 -> 12;
            case 138 -> 244;
            case 139 -> 24;
            case 140 -> 42;
            case 141 -> 158;
            case 142 -> 86;
            case 143 -> 146;
            case 144 -> 132;
            case 145 -> 83;
            case 146 -> 82;
            case 147 -> 77;
            case 148 -> 67;
            case 149 -> 72;
            case 150 -> 150;
            case 151 -> 110;
            case 152 -> 207;
            case 153 -> 169;
            case 154 -> 41;
            case 155 -> 213;
            case 156 -> 28;
            case 157 -> 57;
            case 158 -> 39;
            case 159 -> 31;
            case 160 -> 141;
            case 161 -> 218;
            case 162 -> 129;
            case 163 -> 179;
            case 164 -> 168;
            case 165 -> 14;
            case 166 -> 176;
            case 167 -> 40;
            case 168 -> 182;
            case 169 -> 92;
            case 170 -> 161;
            case 171 -> 52;
            case 172 -> 71;
            case 173 -> 93;
            case 174 -> 62;
            case 175 -> 97;
            case 176 -> 58;
            case 177 -> 156;
            case 178 -> 45;
            case 179 -> 191;
            case 180 -> 118;
            case 181 -> 144;
            case 182 -> 235;
            case 183 -> 19;
            case 184 -> 248;
            case 185 -> 123;
            case 186 -> 125;
            case 187 -> 246;
            case 188 -> 0;
            case 189 -> 177;
            case 190 -> 9;
            case 191 -> 170;
            case 192 -> 183;
            case 193 -> 243;
            case 194 -> 167;
            case 195 -> 79;
            case 196 -> 10;
            case 197 -> 192;
            case 198 -> 241;
            case 199 -> 7;
            case 200 -> 30;
            case 201 -> 59;
            case 202 -> 222;
            case 203 -> 247;
            case 204 -> 159;
            case 205 -> 166;
            case 206 -> 91;
            case 207 -> 208;
            case 208 -> 49;
            case 209 -> 130;
            case 210 -> 32;
            case 211 -> 84;
            case 212 -> 151;
            case 213 -> 124;
            case 214 -> 175;
            case 215 -> 236;
            case 216 -> 121;
            case 217 -> 98;
            case 218 -> 131;
            case 219 -> 239;
            case 220 -> 88;
            case 221 -> 163;
            case 222 -> 140;
            case 223 -> 211;
            case 224 -> 228;
            case 225 -> 33;
            case 226 -> 3;
            case 227 -> 43;
            case 228 -> 154;
            case 229 -> 216;
            case 230 -> 27;
            case 231 -> 16;
            case 232 -> 47;
            case 233 -> 1;
            case 234 -> 205;
            case 235 -> 66;
            case 236 -> 54;
            case 237 -> 18;
            case 238 -> 233;
            case 239 -> 70;
            case 240 -> 107;
            case 241 -> 165;
            case 242 -> 184;
            case 243 -> 250;
            case 244 -> 173;
            case 245 -> 13;
            case 246 -> 15;
            case 247 -> 234;
            case 248 -> 94;
            case 249 -> 226;
            case 250 -> 38;
            case 251 -> 8;
            case 252 -> 68;
            case 253 -> 34;
            case 254 -> 64;
            default -> 106;
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
         short var10001 = -210;
         short var10002 = 32539;
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
      public final lllIlllllllllIIlIllIIIIlIIlIlIIIllllIlIlllIlIIIlIlIIIIIIlllIllllIIIllIllIlIlIllIlllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         @NotNull Vec3 var1, boolean var2
      ) {
         short var10001 = -211;
         short var10002 = -6332;
         Intrinsics.checkNotNullParameter(var1, "pos");
         return new lllIlllllllllIIlIllIIIIlIIlIlIIIllllIlIlllIlIIIlIlIIIIIIlllIllllIIIllIllIlIlIllIlllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10002 = -212;
         short var10003 = 24481;
         var10003 = -209;
         short var10004 = 9853;
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
               var10000 instanceof lllIlllllllllIIlIllIIIIlIIlIlIIIllllIlIlllIlIIIlIlIIIIIIlllIllllIIIllIllIlIlIllIlllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         lllIlllllllllIIlIllIIIIlIIlIlIIIllllIlIlllIlIIIlIlIIIIIIlllIllllIIIllIllIlIlIllIlllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (lllIlllllllllIIlIllIIIIlIIlIlIIIllllIlIlllIlIIIlIlIIIIIIlllIllllIIIllIllIlIlIllIlllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
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
         String var2 = "s\u000eÕD\u0003q\u0004vÇÐÒK¤\u0081\u0003§Wl";
         int var4 = "s\u000eÕD\u0003q\u0004vÇÐÒK¤\u0081\u0003§Wl".length();
         char var1 = 14;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 61;
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
                        case 1 -> 65;
                        case 2 -> 102;
                        case 3 -> 18;
                        case 4 -> 69;
                        case 5 -> 43;
                        default -> 101;
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

                     var2 = "cê\u0086\u0007\u008c=µ$\u009d®k";
                     var4 = "cê\u0086\u0007\u008c=µ$\u009d®k".length();
                     var1 = 3;
                     var8 = -1;
               }

               var10000 = 100;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -212) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 244;
               case 1 -> 71;
               case 2 -> 136;
               case 3 -> 96;
               case 4 -> 241;
               case 5 -> 76;
               case 6 -> 152;
               case 7 -> 195;
               case 8 -> 65;
               case 9 -> 240;
               case 10 -> 237;
               case 11 -> 142;
               case 12 -> 168;
               case 13 -> 216;
               case 14 -> 213;
               case 15 -> 228;
               case 16 -> 85;
               case 17 -> 17;
               case 18 -> 151;
               case 19 -> 22;
               case 20 -> 132;
               case 21 -> 127;
               case 22 -> 97;
               case 23 -> 247;
               case 24 -> 103;
               case 25 -> 91;
               case 26 -> 134;
               case 27 -> 224;
               case 28 -> 81;
               case 29 -> 51;
               case 30 -> 207;
               case 31 -> 227;
               case 32 -> 157;
               case 33 -> 80;
               case 34 -> 15;
               case 35 -> 23;
               case 36 -> 72;
               case 37 -> 102;
               case 38 -> 164;
               case 39 -> 88;
               case 40 -> 174;
               case 41 -> 236;
               case 42 -> 118;
               case 43 -> 189;
               case 44 -> 82;
               case 45 -> 138;
               case 46 -> 181;
               case 47 -> 113;
               case 48 -> 222;
               case 49 -> 62;
               case 50 -> 35;
               case 51 -> 124;
               case 52 -> 55;
               case 53 -> 12;
               case 54 -> 30;
               case 55 -> 196;
               case 56 -> 1;
               case 57 -> 185;
               case 58 -> 212;
               case 59 -> 137;
               case 60 -> 0;
               case 61 -> 139;
               case 62 -> 182;
               case 63 -> 201;
               case 64 -> 39;
               case 65 -> 45;
               case 66 -> 74;
               case 67 -> 220;
               case 68 -> 170;
               case 69 -> 231;
               case 70 -> 143;
               case 71 -> 226;
               case 72 -> 159;
               case 73 -> 129;
               case 74 -> 218;
               case 75 -> 5;
               case 76 -> 223;
               case 77 -> 188;
               case 78 -> 78;
               case 79 -> 186;
               case 80 -> 59;
               case 81 -> 36;
               case 82 -> 123;
               case 83 -> 255;
               case 84 -> 32;
               case 85 -> 122;
               case 86 -> 194;
               case 87 -> 37;
               case 88 -> 161;
               case 89 -> 128;
               case 90 -> 87;
               case 91 -> 98;
               case 92 -> 64;
               case 93 -> 235;
               case 94 -> 9;
               case 95 -> 158;
               case 96 -> 131;
               case 97 -> 107;
               case 98 -> 19;
               case 99 -> 31;
               case 100 -> 110;
               case 101 -> 250;
               case 102 -> 63;
               case 103 -> 215;
               case 104 -> 89;
               case 105 -> 109;
               case 106 -> 54;
               case 107 -> 177;
               case 108 -> 243;
               case 109 -> 167;
               case 110 -> 93;
               case 111 -> 8;
               case 112 -> 147;
               case 113 -> 86;
               case 114 -> 90;
               case 115 -> 234;
               case 116 -> 57;
               case 117 -> 172;
               case 118 -> 200;
               case 119 -> 47;
               case 120 -> 198;
               case 121 -> 149;
               case 122 -> 25;
               case 123 -> 145;
               case 124 -> 2;
               case 125 -> 199;
               case 126 -> 204;
               case 127 -> 205;
               case 128 -> 100;
               case 129 -> 249;
               case 130 -> 141;
               case 131 -> 46;
               case 132 -> 150;
               case 133 -> 83;
               case 134 -> 246;
               case 135 -> 79;
               case 136 -> 114;
               case 137 -> 53;
               case 138 -> 230;
               case 139 -> 69;
               case 140 -> 180;
               case 141 -> 221;
               case 142 -> 233;
               case 143 -> 20;
               case 144 -> 61;
               case 145 -> 21;
               case 146 -> 77;
               case 147 -> 7;
               case 148 -> 94;
               case 149 -> 245;
               case 150 -> 67;
               case 151 -> 34;
               case 152 -> 105;
               case 153 -> 146;
               case 154 -> 28;
               case 155 -> 24;
               case 156 -> 29;
               case 157 -> 202;
               case 158 -> 176;
               case 159 -> 253;
               case 160 -> 171;
               case 161 -> 112;
               case 162 -> 135;
               case 163 -> 238;
               case 164 -> 232;
               case 165 -> 133;
               case 166 -> 43;
               case 167 -> 33;
               case 168 -> 140;
               case 169 -> 206;
               case 170 -> 197;
               case 171 -> 52;
               case 172 -> 38;
               case 173 -> 50;
               case 174 -> 126;
               case 175 -> 156;
               case 176 -> 173;
               case 177 -> 44;
               case 178 -> 208;
               case 179 -> 121;
               case 180 -> 175;
               case 181 -> 120;
               case 182 -> 27;
               case 183 -> 6;
               case 184 -> 49;
               case 185 -> 217;
               case 186 -> 242;
               case 187 -> 166;
               case 188 -> 252;
               case 189 -> 251;
               case 190 -> 116;
               case 191 -> 169;
               case 192 -> 130;
               case 193 -> 154;
               case 194 -> 192;
               case 195 -> 104;
               case 196 -> 75;
               case 197 -> 101;
               case 198 -> 108;
               case 199 -> 248;
               case 200 -> 153;
               case 201 -> 3;
               case 202 -> 225;
               case 203 -> 239;
               case 204 -> 119;
               case 205 -> 84;
               case 206 -> 254;
               case 207 -> 60;
               case 208 -> 210;
               case 209 -> 163;
               case 210 -> 106;
               case 211 -> 165;
               case 212 -> 125;
               case 213 -> 48;
               case 214 -> 160;
               case 215 -> 26;
               case 216 -> 191;
               case 217 -> 95;
               case 218 -> 162;
               case 219 -> 155;
               case 220 -> 68;
               case 221 -> 115;
               case 222 -> 73;
               case 223 -> 13;
               case 224 -> 229;
               case 225 -> 111;
               case 226 -> 148;
               case 227 -> 179;
               case 228 -> 66;
               case 229 -> 184;
               case 230 -> 144;
               case 231 -> 4;
               case 232 -> 99;
               case 233 -> 70;
               case 234 -> 41;
               case 235 -> 183;
               case 236 -> 58;
               case 237 -> 42;
               case 238 -> 92;
               case 239 -> 209;
               case 240 -> 178;
               case 241 -> 187;
               case 242 -> 219;
               case 243 -> 10;
               case 244 -> 117;
               case 245 -> 11;
               case 246 -> 193;
               case 247 -> 211;
               case 248 -> 18;
               case 249 -> 190;
               case 250 -> 56;
               case 251 -> 214;
               case 252 -> 14;
               case 253 -> 16;
               case 254 -> 40;
               default -> 203;
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

      // PX-FIX PhaseA: Kotlin copy-default (static bridge) restored from jar bytecode
      public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0, Vec3 var1, boolean var2, int var3, Object var4) {
         if ((var3 & 1) != 0) { var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
         if ((var3 & 2) != 0) { var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
         return var0.a(var1, var2);
      }
      // PX-FIX PhaseA: Kotlin synthetic default-args constructor restored from jar bytecode
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Vec3 var1, boolean var2, int var3, kotlin.jvm.internal.DefaultConstructorMarker var4) {
         this(var1, (var3 & 2) != 0 ? false : var2);
      }
   }

  // PX-FIX synth restored from jar bytecode
  public static boolean a(me.octo.client.lllIlllllllllIIlIllIIIIlIIlIlIIIllllIlIlllIlIIIlIlIIIIIIlllIllllIIIllIllIlIlIllIlllll p0, net.minecraft.world.phys.Vec3 p1) { return p0.a(p1); }
}
