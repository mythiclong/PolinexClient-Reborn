package me.octo.client;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.player.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.phys.AABB;
import org.jetbrains.annotations.NotNull;

public final class llIIIllIlllIlIIlllIlIllIlIIIIIllIIIIlIllIIllIlIIIIIIlIlIIIIllIlIIIIIlIIIllIlIlIlllllI
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static llIIIllIlllIlIIlllIlIllIlIIIIIllIIIIlIllIIllIlIIIIIIlIlIIIIllIlIIIIIlIIIllIlIlIlllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static double lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @JvmField
   @NotNull
   public static llIIIllIlllIlIIlllIlIllIlIIIIIllIIIIlIllIIllIlIIIIIIlIlIIIIllIlIIIIIlIIIllIlIlIlllllI lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private static volatile Set<Integer> IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static String[] f;
   private static String[] g;

   private llIIIllIlllIlIIlllIlIllIlIIIIIllIIIIlIllIIllIlIIIIIIlIlIIIIllIlIIIIIlIIIllIlIlIlllllI() {
      short var10001 = 16338;
      short var10002 = -2720;
      var10002 = 16336;
      short var10003 = 25194;
      short var10004 = 16350;
      short var10005 = 13352;
      super(
         "Ignore Lanterns",
         "Lets you mine through armor stands near placed lanterns.",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
         "Misc"
      );
   }

   @SubscribeEvent
   public final void a(@NotNull lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI var1) {
      Object var19 = null; // PX-FIX
      int[] var10000 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      Intrinsics.checkNotNullParameter(var1, "e");
      int[] var2 = var10000;
      if (var2 != null) {
         if (me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m()) {
            ClientLevel var20 = this.ap().level;
            if (var20 == null) {
               return;
            }

            ClientLevel var3 = var20;
            if (var2 != null) {
               LocalPlayer var21 = this.ap().player;
               if (var21 != null) {
                  LocalPlayer var4 = var21;
                  List var22 = var3.getEntitiesOfClass(
                     ArmorStand.class,
                     AABB.ofSize(llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(var4), 32.0, 32.0, 32.0),
                     llIIIllIlllIlIIlllIlIllIlIIIIIllIIIIlIllIIllIlIIIIIIlIlIIIIllIlIIIIIlIIIllIlIlIlllllI::a
                  );
                  short var10002 = 16340;
                  short var10003 = -18565;
                  Intrinsics.checkNotNullExpressionValue(var22, "getEntitiesOfClass(...)");
                  List var5 = var22;
                  Iterable var7 = var5;
                  boolean var8 = false;
                  var var10 = new ArrayList();
                  boolean var11 = false;

                  for (Object var13 : var7) {
                     ArmorStand var14 = (ArmorStand)var13;
                     boolean var15 = false;
                     String var10001 = var14.getName().getString();
                     var10003 = 16341;
                     short var10004 = -8530;
                     Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
                     boolean var23 = this.e(var10001);
                     if (var2 != null) {
                        if (!var23) {
                           continue;
                        }

                        var10.add(var13);
                     }

                     if (var2 == null) {
                        break;
                     }
                  }

                  List var6 = var10;
                  if (var2 != null) {
                     if (!var6.isEmpty()) {
                        HashSet var16 = new HashSet();
                        Iterator var17 = var6.iterator();

                        label61:
                        while (true) {
                           int var24 = ((var17.hasNext()) ? 1 : 0);

                           while (true) {
                              if (var24 == 0) {
                                 break label61;
                              }

                              var10000 = (int[])var17.next();
                              var10002 = 16342;
                              var10003 = -31412;
                              Intrinsics.checkNotNullExpressionValue(var10000, "next(...)");
                              ArmorStand var9 = (ArmorStand)(Object)var10000;
                              Iterator var18 = var5.iterator();

                              while (true) {
                                 var24 = ((var18.hasNext()) ? 1 : 0);

                                 do {
                                    if (var24 == 0) {
                                       continue label61;
                                    }

                                    var10000 = (int[])var18.next();
                                    var10002 = 16343;
                                    var10003 = 4450;
                                    Intrinsics.checkNotNullExpressionValue(var10000, "next(...)");
                                    var19 = (ArmorStand)(Object)var10000;
                                    double var32;
                                    var24 = (
                                             var32 = llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(var9)
                                                   .distanceToSqr(
                                                      llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a((Entity)var19)
                                                   )
                                                - 9.0
                                          )
                                          == 0.0
                                       ? 0
                                       : (var32 < 0.0 ? -1 : 1);
                                 } while (var2 == null);

                                 if (var2 == null) {
                                    break;
                                 }

                                 if (var2 != null) {
                                    if (var24 > 0) {
                                       continue;
                                    }

                                    var16.add(((me.octo.client.PXDyn)var19).getId());
                                 }

                                 if (var2 == null) {
                                    break label61;
                                 }
                              }
                           }
                        }

                        IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var16;
                        return;
                     }

                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = SetsKt.emptySet();
                  }

                  return;
               }
            }

            return;
         }

         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = SetsKt.emptySet();
      }
   }

   @Override
   public void aC() {
      IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = SetsKt.emptySet();
      super.aC();
   }

   private final boolean e(String var1) {
      int[] var2 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      CharSequence var10000 = var1;
      short var10001 = 16337;
      short var10002 = 18950;
      boolean var3 = StringsKt.contains(var10000, "Lantern", false);
      if (var2 != null) {
         if (!var3) {
            var10000 = var1;
            var10001 = 16351;
            var10002 = -14056;
            boolean var7 = StringsKt.contains(var10000, "Will-o'-wisp", false);
            if (var2 == null) {
               return var7;
            }

            if (!var7) {
               return false;
            }
         }

         var3 = true;
      }

      return var3;
   }

   private static final boolean a(ArmorStand var0) {
      short var10001 = 16339;
      short var10002 = 17914;
      Intrinsics.checkNotNullParameter(var0, "it");
      return true;
   }

   private static final boolean a(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   @NotNull
   public static final Set<Integer> ag() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.a();
   }

   public static final void a(@NotNull Set<Integer> var0) {
      lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.a(var0);
   }

   @NotNull
   public static final Set<Integer> ah() {
      return IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   }

   public static final void b(Set<Integer> var0) {
      IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var0;
   }

   @JvmStatic
   public static final boolean a(int var0) {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.a(var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[10];
      int var3 = 0;
      String var2 = "¥\u0012)µ\u0088\u008dc\u0019\u001b\tCÊõ®\u0013î\u0010uu\u0017\u0091$\u008bB\u0017>Y$³]\u000bßõo\u0015\u0012v6\t\u001aSë\u001d\u000e\u0011°\u009bÆ\u000f|\u0003°öÛ1\u008a\fâ\u000fV \u0082ºs_\u0003\u0003\u0090\u008da\u0085KfK\u0002Ñ\u00048!sÓ\u009eRXpE\u0019X$WJ\u0018\u0099úý\u001f\u0004éBûùoUL÷ZÜ®¡\u000bï^DÕ|>~Xl2ÿq\u0091\u000f)\u008a\u0011³®ö\u0017\u008bB\u008d\u0007¬6xµ;Ñ±";
      int var4 = "¥\u0012)µ\u0088\u008dc\u0019\u001b\tCÊõ®\u0013î\u0010uu\u0017\u0091$\u008bB\u0017>Y$³]\u000bßõo\u0015\u0012v6\t\u001aSë\u001d\u000e\u0011°\u009bÆ\u000f|\u0003°öÛ1\u008a\fâ\u000fV \u0082ºs_\u0003\u0003\u0090\u008da\u0085KfK\u0002Ñ\u00048!sÓ\u009eRXpE\u0019X$WJ\u0018\u0099úý\u001f\u0004éBûùoUL÷ZÜ®¡\u000bï^DÕ|>~Xl2ÿq\u0091\u000f)\u008a\u0011³®ö\u0017\u008bB\u008d\u0007¬6xµ;Ñ±"
         .length();
      char var1 = '\t';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 51;
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
                     case 0 -> 51;
                     case 1 -> 64;
                     case 2 -> 117;
                     case 3 -> 23;
                     case 4 -> 9;
                     case 5 -> 88;
                     default -> 5;
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
                     g = new String[10];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new llIIIllIlllIlIIlllIlIllIlIIIIIllIIIIlIllIIllIlIIIIIIlIlIIIIllIlIIIIIlIIIllIlIlIlllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new llIIIllIlllIlIIlllIlIllIlIIIIIllIIIIlIllIIllIlIIIIIIlIlIIIIllIlIIIIIlIIIllIlIlIlllllI();
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = SetsKt.emptySet();
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

                  var2 = "{ (ÿ\fbÜMo\u0001\u001ah\u0017\u009aÓe*";
                  var4 = "{ (ÿ\fbÜMo\u0001\u001ah\u0017\u009aÓe*".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 39;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 16342) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 235;
            case 1 -> 8;
            case 2 -> 18;
            case 3 -> 89;
            case 4 -> 189;
            case 5 -> 227;
            case 6 -> 32;
            case 7 -> 153;
            case 8 -> 14;
            case 9 -> 208;
            case 10 -> 196;
            case 11 -> 186;
            case 12 -> 94;
            case 13 -> 23;
            case 14 -> 232;
            case 15 -> 211;
            case 16 -> 99;
            case 17 -> 56;
            case 18 -> 168;
            case 19 -> 148;
            case 20 -> 11;
            case 21 -> 199;
            case 22 -> 236;
            case 23 -> 106;
            case 24 -> 128;
            case 25 -> 125;
            case 26 -> 206;
            case 27 -> 57;
            case 28 -> 210;
            case 29 -> 118;
            case 30 -> 185;
            case 31 -> 19;
            case 32 -> 73;
            case 33 -> 253;
            case 34 -> 88;
            case 35 -> 54;
            case 36 -> 192;
            case 37 -> 203;
            case 38 -> 17;
            case 39 -> 42;
            case 40 -> 121;
            case 41 -> 231;
            case 42 -> 75;
            case 43 -> 145;
            case 44 -> 9;
            case 45 -> 166;
            case 46 -> 254;
            case 47 -> 156;
            case 48 -> 237;
            case 49 -> 84;
            case 50 -> 67;
            case 51 -> 105;
            case 52 -> 86;
            case 53 -> 131;
            case 54 -> 169;
            case 55 -> 144;
            case 56 -> 229;
            case 57 -> 71;
            case 58 -> 113;
            case 59 -> 214;
            case 60 -> 120;
            case 61 -> 100;
            case 62 -> 112;
            case 63 -> 25;
            case 64 -> 72;
            case 65 -> 102;
            case 66 -> 152;
            case 67 -> 53;
            case 68 -> 12;
            case 69 -> 249;
            case 70 -> 49;
            case 71 -> 162;
            case 72 -> 240;
            case 73 -> 219;
            case 74 -> 92;
            case 75 -> 22;
            case 76 -> 108;
            case 77 -> 140;
            case 78 -> 238;
            case 79 -> 26;
            case 80 -> 1;
            case 81 -> 179;
            case 82 -> 117;
            case 83 -> 93;
            case 84 -> 116;
            case 85 -> 143;
            case 86 -> 65;
            case 87 -> 138;
            case 88 -> 165;
            case 89 -> 34;
            case 90 -> 243;
            case 91 -> 216;
            case 92 -> 164;
            case 93 -> 47;
            case 94 -> 239;
            case 95 -> 220;
            case 96 -> 62;
            case 97 -> 109;
            case 98 -> 209;
            case 99 -> 101;
            case 100 -> 252;
            case 101 -> 205;
            case 102 -> 119;
            case 103 -> 228;
            case 104 -> 222;
            case 105 -> 45;
            case 106 -> 191;
            case 107 -> 35;
            case 108 -> 170;
            case 109 -> 63;
            case 110 -> 193;
            case 111 -> 6;
            case 112 -> 50;
            case 113 -> 176;
            case 114 -> 82;
            case 115 -> 255;
            case 116 -> 188;
            case 117 -> 233;
            case 118 -> 247;
            case 119 -> 241;
            case 120 -> 39;
            case 121 -> 223;
            case 122 -> 31;
            case 123 -> 111;
            case 124 -> 114;
            case 125 -> 132;
            case 126 -> 7;
            case 127 -> 97;
            case 128 -> 183;
            case 129 -> 139;
            case 130 -> 40;
            case 131 -> 61;
            case 132 -> 123;
            case 133 -> 48;
            case 134 -> 55;
            case 135 -> 242;
            case 136 -> 202;
            case 137 -> 43;
            case 138 -> 78;
            case 139 -> 142;
            case 140 -> 159;
            case 141 -> 77;
            case 142 -> 127;
            case 143 -> 224;
            case 144 -> 15;
            case 145 -> 133;
            case 146 -> 204;
            case 147 -> 200;
            case 148 -> 44;
            case 149 -> 10;
            case 150 -> 141;
            case 151 -> 244;
            case 152 -> 201;
            case 153 -> 215;
            case 154 -> 136;
            case 155 -> 245;
            case 156 -> 181;
            case 157 -> 178;
            case 158 -> 90;
            case 159 -> 251;
            case 160 -> 161;
            case 161 -> 64;
            case 162 -> 137;
            case 163 -> 98;
            case 164 -> 2;
            case 165 -> 129;
            case 166 -> 83;
            case 167 -> 248;
            case 168 -> 20;
            case 169 -> 197;
            case 170 -> 36;
            case 171 -> 4;
            case 172 -> 38;
            case 173 -> 52;
            case 174 -> 27;
            case 175 -> 91;
            case 176 -> 0;
            case 177 -> 213;
            case 178 -> 46;
            case 179 -> 146;
            case 180 -> 147;
            case 181 -> 76;
            case 182 -> 5;
            case 183 -> 160;
            case 184 -> 226;
            case 185 -> 126;
            case 186 -> 51;
            case 187 -> 135;
            case 188 -> 3;
            case 189 -> 33;
            case 190 -> 107;
            case 191 -> 173;
            case 192 -> 30;
            case 193 -> 172;
            case 194 -> 246;
            case 195 -> 167;
            case 196 -> 115;
            case 197 -> 230;
            case 198 -> 154;
            case 199 -> 150;
            case 200 -> 96;
            case 201 -> 198;
            case 202 -> 124;
            case 203 -> 59;
            case 204 -> 225;
            case 205 -> 234;
            case 206 -> 174;
            case 207 -> 182;
            case 208 -> 21;
            case 209 -> 66;
            case 210 -> 207;
            case 211 -> 212;
            case 212 -> 28;
            case 213 -> 190;
            case 214 -> 79;
            case 215 -> 217;
            case 216 -> 68;
            case 217 -> 104;
            case 218 -> 187;
            case 219 -> 163;
            case 220 -> 149;
            case 221 -> 218;
            case 222 -> 24;
            case 223 -> 175;
            case 224 -> 158;
            case 225 -> 130;
            case 226 -> 69;
            case 227 -> 250;
            case 228 -> 151;
            case 229 -> 110;
            case 230 -> 13;
            case 231 -> 134;
            case 232 -> 177;
            case 233 -> 70;
            case 234 -> 29;
            case 235 -> 194;
            case 236 -> 157;
            case 237 -> 95;
            case 238 -> 58;
            case 239 -> 171;
            case 240 -> 221;
            case 241 -> 184;
            case 242 -> 37;
            case 243 -> 122;
            case 244 -> 87;
            case 245 -> 155;
            case 246 -> 41;
            case 247 -> 195;
            case 248 -> 180;
            case 249 -> 16;
            case 250 -> 85;
            case 251 -> 103;
            case 252 -> 81;
            case 253 -> 74;
            case 254 -> 60;
            default -> 80;
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

      private static String a;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final Set<Integer> a() {
         return llIIIllIlllIlIIlllIlIllIlIIIIIllIIIIlIllIIllIlIIIIIIlIlIIIIllIlIIIIIlIIIllIlIlIlllllI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      }

      public final void a(@NotNull Set<Integer> var1) {
         Intrinsics.checkNotNullParameter(var1, a);
         llIIIllIlllIlIIlllIlIllIlIIIIIllIIIIlIllIIllIlIIIIIIlIlIIIIllIlIIIIIlIIIllIlIlIlllllI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var1;
      }

      @JvmStatic
      public final boolean a(int var1) {
         return this.a().contains(var1);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
         pxClinit: {
         char[] var10003 = "q\u000f(_\r\\a".toCharArray();
         int var10004 = var10003.length;
         int var0 = 0;
         byte var6 = 47;
         char[] var10002 = var10003;
         int var1 = var10004;
         byte var10;
         char[] var10005;
         int var10006;
         if (var10004 <= 1) {
            var10005 = var10003;
            var10 = 47;
            var10006 = var0;
         } else {
            var6 = 47;
            var1 = var10004;
            if (var10004 <= var0) {
               String var9 = new String(var10003).intern();
               byte var4 = -1;
               a = var9;
               break pxClinit;
            }

            var10005 = var10003;
            var10 = 47;
            var10006 = var0;
         }

         while (true) {
            var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
               case 0 -> 98;
               case 1 -> 83;
               case 2 -> 98;
               case 3 -> 4;
               case 4 -> 15;
               case 5 -> 76;
               default -> 112;
            });
            var0++;
            if (var6 == 0) {
               var10006 = var6;
               var10005 = var10002;
               var10 = var6;
            } else {
               if (var1 <= var0) {
                  String var8 = new String(var10002).intern();
                  byte var3 = -1;
                  a = var8;
                  break pxClinit;
               }

               var10005 = var10002;
               var10 = var6;
               var10006 = var0;
            }
         }
         }
      }
   
   public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker p0) {
      this();
   }
   public static void b() {
   }
}
}
