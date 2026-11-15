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

public final class lllIlIlIllIllIllIIllllIllIlIIlllllllIIlIIlIlIlIIIlIllIllIlIIIlIllllllIIllIIIllIlIlIll
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static lllIlIlIllIllIllIIllllIllIlIIlllllllIIlIIlIlIlIIIlIllIllIlIIIlIllllllIIllIIIllIlIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static double lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @JvmField
   @NotNull
   public static lllIlIlIllIllIllIIllllIllIlIIlllllllIIlIIlIlIlIIIlIllIllIlIIIlIllllllIIllIIIllIlIlIll lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private static volatile Set<Integer> IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static String[] f;
   private static String[] g;

   private lllIlIlIllIllIllIIllllIllIlIIlllllllIIlIIlIlIlIIIlIllIllIlIIIlIllllllIIllIIIllIlIlIll() {
      short var10001 = -29252;
      short var10002 = 20827;
      var10002 = -29253;
      short var10003 = 2502;
      short var10004 = -29258;
      short var10005 = -2984;
      super(
         "Ignore Orbs",
         "Lets you mine through armor stands near placed regeneration orbs.",
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
                     lllIlIlIllIllIllIIllllIllIlIIlllllllIIlIIlIlIlIIIlIllIllIlIIIlIllllllIIllIIIllIlIlIll::a
                  );
                  short var10002 = -29257;
                  short var10003 = -29134;
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
                     var10003 = -29256;
                     short var10004 = -7123;
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
                              var10002 = -29250;
                              var10003 = 12481;
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
                                    var10002 = -29260;
                                    var10003 = -7312;
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
      short var10001 = -29255;
      short var10002 = -31924;
      boolean var3 = StringsKt.contains(var10000, "Radiant", false);
      if (var2 != null) {
         if (!var3) {
            var10000 = var1;
            var10001 = -29259;
            var10002 = -6740;
            boolean var16 = StringsKt.contains(var10000, "Mana", false);
            if (var2 == null) {
               return var16;
            }

            if (!var16) {
               var10000 = var1;
               var10001 = -29254;
               var10002 = 9937;
               boolean var17 = StringsKt.contains(var10000, "Overflux", false);
               if (var2 == null) {
                  return var17;
               }

               if (!var17) {
                  var10000 = var1;
                  var10001 = -29249;
                  var10002 = 28070;
                  boolean var18 = StringsKt.contains(var10000, "Plasma", false);
                  if (var2 == null) {
                     return var18;
                  }

                  if (!var18) {
                     var10000 = var1;
                     var10001 = -29263;
                     var10002 = 28855;
                     boolean var19 = StringsKt.contains(var10000, "Flare", false);
                     if (var2 == null) {
                        return var19;
                     }

                     if (!var19) {
                        return false;
                     }
                  }
               }
            }
         }

         var3 = true;
      }

      return var3;
   }

   private static final boolean a(ArmorStand var0) {
      short var10001 = -29251;
      short var10002 = -7718;
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
      String[] var5 = new String[13];
      int var3 = 0;
      String var2 = "ÄÉ\u000b\u0089°£9È\u0001¢\u0007ú¸Û\u0006 z£\u00169\u007f\t´5ÑÐ\b\u000f¥\u0085\u008e\u0007C \u0088ëõ\u0096 \u000e\u0098Úp\níË\u0089\u008aêF3¦b±AI<\u0004ö7{\ní\u001b\u0097å1\\\u0002\u0097ôæ_øÏ\u000bó\u009d´X¨x\u0010áªÜ\nßP\u0094Ø+E\u0015¨/ú[%ß\u0004\u007fÛ\t\u0081uIÉ\u0095P]\u008fÆG±I¡nÚ5\b>ñ\u0098?ÑvBö\u0004dj\u009aª\t\u0094\u0019ÕU\u0088¿µ\u0093\u008c\u0017j-.â<\u0004ê¯\u0088öí5\u0007ä\u0087.þ0\u0087ôTú°";
      int var4 = "ÄÉ\u000b\u0089°£9È\u0001¢\u0007ú¸Û\u0006 z£\u00169\u007f\t´5ÑÐ\b\u000f¥\u0085\u008e\u0007C \u0088ëõ\u0096 \u000e\u0098Úp\níË\u0089\u008aêF3¦b±AI<\u0004ö7{\ní\u001b\u0097å1\\\u0002\u0097ôæ_øÏ\u000bó\u009d´X¨x\u0010áªÜ\nßP\u0094Ø+E\u0015¨/ú[%ß\u0004\u007fÛ\t\u0081uIÉ\u0095P]\u008fÆG±I¡nÚ5\b>ñ\u0098?ÑvBö\u0004dj\u009aª\t\u0094\u0019ÕU\u0088¿µ\u0093\u008c\u0017j-.â<\u0004ê¯\u0088öí5\u0007ä\u0087.þ0\u0087ôTú°"
         .length();
      char var1 = 2;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 3;
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
                     case 0 -> 47;
                     case 1 -> 54;
                     case 2 -> 26;
                     case 3 -> 110;
                     case 4 -> 77;
                     case 5 -> 111;
                     default -> 109;
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
                     g = new String[13];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lllIlIlIllIllIllIIllllIllIlIIlllllllIIlIIlIlIlIIIlIllIllIlIIIlIllllllIIllIIIllIlIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new lllIlIlIllIllIllIIllllIllIlIIlllllllIIlIIlIlIlIIIlIllIllIlIIIlIllllllIIllIIIllIlIlIll();
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

                  var2 = "\u001cÅ£\u007f\u0005L\u0004ÑóT";
                  var4 = "\u001cÅ£\u007f\u0005L\u0004ÑóT".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 64;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -29251) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 68;
            case 1 -> 163;
            case 2 -> 94;
            case 3 -> 173;
            case 4 -> 213;
            case 5 -> 239;
            case 6 -> 242;
            case 7 -> 109;
            case 8 -> 204;
            case 9 -> 169;
            case 10 -> 20;
            case 11 -> 176;
            case 12 -> 74;
            case 13 -> 246;
            case 14 -> 62;
            case 15 -> 182;
            case 16 -> 42;
            case 17 -> 236;
            case 18 -> 116;
            case 19 -> 126;
            case 20 -> 218;
            case 21 -> 91;
            case 22 -> 13;
            case 23 -> 44;
            case 24 -> 135;
            case 25 -> 156;
            case 26 -> 119;
            case 27 -> 67;
            case 28 -> 38;
            case 29 -> 92;
            case 30 -> 124;
            case 31 -> 59;
            case 32 -> 34;
            case 33 -> 188;
            case 34 -> 131;
            case 35 -> 82;
            case 36 -> 149;
            case 37 -> 181;
            case 38 -> 99;
            case 39 -> 37;
            case 40 -> 207;
            case 41 -> 5;
            case 42 -> 238;
            case 43 -> 48;
            case 44 -> 87;
            case 45 -> 133;
            case 46 -> 158;
            case 47 -> 252;
            case 48 -> 159;
            case 49 -> 27;
            case 50 -> 237;
            case 51 -> 170;
            case 52 -> 46;
            case 53 -> 79;
            case 54 -> 221;
            case 55 -> 60;
            case 56 -> 139;
            case 57 -> 144;
            case 58 -> 136;
            case 59 -> 150;
            case 60 -> 166;
            case 61 -> 209;
            case 62 -> 47;
            case 63 -> 177;
            case 64 -> 77;
            case 65 -> 35;
            case 66 -> 191;
            case 67 -> 7;
            case 68 -> 80;
            case 69 -> 95;
            case 70 -> 17;
            case 71 -> 228;
            case 72 -> 167;
            case 73 -> 70;
            case 74 -> 180;
            case 75 -> 212;
            case 76 -> 56;
            case 77 -> 230;
            case 78 -> 215;
            case 79 -> 190;
            case 80 -> 193;
            case 81 -> 151;
            case 82 -> 29;
            case 83 -> 220;
            case 84 -> 143;
            case 85 -> 104;
            case 86 -> 122;
            case 87 -> 130;
            case 88 -> 137;
            case 89 -> 160;
            case 90 -> 147;
            case 91 -> 227;
            case 92 -> 214;
            case 93 -> 45;
            case 94 -> 28;
            case 95 -> 4;
            case 96 -> 198;
            case 97 -> 102;
            case 98 -> 24;
            case 99 -> 57;
            case 100 -> 132;
            case 101 -> 157;
            case 102 -> 23;
            case 103 -> 234;
            case 104 -> 168;
            case 105 -> 55;
            case 106 -> 118;
            case 107 -> 39;
            case 108 -> 195;
            case 109 -> 18;
            case 110 -> 2;
            case 111 -> 15;
            case 112 -> 96;
            case 113 -> 75;
            case 114 -> 224;
            case 115 -> 26;
            case 116 -> 129;
            case 117 -> 233;
            case 118 -> 210;
            case 119 -> 123;
            case 120 -> 81;
            case 121 -> 105;
            case 122 -> 178;
            case 123 -> 202;
            case 124 -> 171;
            case 125 -> 33;
            case 126 -> 10;
            case 127 -> 140;
            case 128 -> 247;
            case 129 -> 253;
            case 130 -> 32;
            case 131 -> 192;
            case 132 -> 174;
            case 133 -> 53;
            case 134 -> 51;
            case 135 -> 148;
            case 136 -> 103;
            case 137 -> 164;
            case 138 -> 0;
            case 139 -> 43;
            case 140 -> 31;
            case 141 -> 248;
            case 142 -> 211;
            case 143 -> 72;
            case 144 -> 71;
            case 145 -> 250;
            case 146 -> 117;
            case 147 -> 244;
            case 148 -> 138;
            case 149 -> 110;
            case 150 -> 146;
            case 151 -> 107;
            case 152 -> 203;
            case 153 -> 197;
            case 154 -> 83;
            case 155 -> 153;
            case 156 -> 194;
            case 157 -> 40;
            case 158 -> 98;
            case 159 -> 189;
            case 160 -> 41;
            case 161 -> 64;
            case 162 -> 229;
            case 163 -> 222;
            case 164 -> 52;
            case 165 -> 111;
            case 166 -> 76;
            case 167 -> 232;
            case 168 -> 120;
            case 169 -> 121;
            case 170 -> 65;
            case 171 -> 6;
            case 172 -> 251;
            case 173 -> 240;
            case 174 -> 54;
            case 175 -> 84;
            case 176 -> 25;
            case 177 -> 219;
            case 178 -> 172;
            case 179 -> 11;
            case 180 -> 90;
            case 181 -> 50;
            case 182 -> 141;
            case 183 -> 78;
            case 184 -> 154;
            case 185 -> 226;
            case 186 -> 206;
            case 187 -> 49;
            case 188 -> 1;
            case 189 -> 223;
            case 190 -> 165;
            case 191 -> 114;
            case 192 -> 19;
            case 193 -> 199;
            case 194 -> 216;
            case 195 -> 30;
            case 196 -> 101;
            case 197 -> 69;
            case 198 -> 12;
            case 199 -> 225;
            case 200 -> 127;
            case 201 -> 231;
            case 202 -> 100;
            case 203 -> 179;
            case 204 -> 112;
            case 205 -> 85;
            case 206 -> 93;
            case 207 -> 152;
            case 208 -> 73;
            case 209 -> 61;
            case 210 -> 8;
            case 211 -> 36;
            case 212 -> 155;
            case 213 -> 88;
            case 214 -> 16;
            case 215 -> 217;
            case 216 -> 128;
            case 217 -> 249;
            case 218 -> 162;
            case 219 -> 97;
            case 220 -> 187;
            case 221 -> 108;
            case 222 -> 245;
            case 223 -> 63;
            case 224 -> 113;
            case 225 -> 3;
            case 226 -> 254;
            case 227 -> 21;
            case 228 -> 243;
            case 229 -> 235;
            case 230 -> 208;
            case 231 -> 175;
            case 232 -> 89;
            case 233 -> 185;
            case 234 -> 201;
            case 235 -> 145;
            case 236 -> 106;
            case 237 -> 200;
            case 238 -> 241;
            case 239 -> 66;
            case 240 -> 205;
            case 241 -> 186;
            case 242 -> 184;
            case 243 -> 125;
            case 244 -> 161;
            case 245 -> 183;
            case 246 -> 86;
            case 247 -> 14;
            case 248 -> 255;
            case 249 -> 58;
            case 250 -> 115;
            case 251 -> 142;
            case 252 -> 196;
            case 253 -> 9;
            case 254 -> 22;
            default -> 134;
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
         return lllIlIlIllIllIllIIllllIllIlIIlllllllIIlIIlIlIlIIIlIllIllIlIIIlIllllllIIllIIIllIlIlIll.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      }

      public final void a(@NotNull Set<Integer> var1) {
         Intrinsics.checkNotNullParameter(var1, a);
         lllIlIlIllIllIllIIllllIllIlIIlllllllIIlIIlIlIlIIIlIllIllIlIIIlIllllllIIllIIIllIlIlIll.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var1;
      }

      @JvmStatic
      public final boolean a(int var1) {
         return this.a().contains(var1);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
         pxClinit: {
         char[] var10003 = "v@\u00064U3P".toCharArray();
         int var10004 = var10003.length;
         int var0 = 0;
         byte var6 = 71;
         char[] var10002 = var10003;
         int var1 = var10004;
         byte var10;
         char[] var10005;
         int var10006;
         if (var10004 <= 1) {
            var10005 = var10003;
            var10 = 71;
            var10006 = var0;
         } else {
            var6 = 71;
            var1 = var10004;
            if (var10004 <= var0) {
               String var9 = new String(var10003).intern();
               byte var4 = -1;
               a = var9;
               break pxClinit;
            }

            var10005 = var10003;
            var10 = 71;
            var10006 = var0;
         }

         while (true) {
            var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
               case 0 -> 13;
               case 1 -> 116;
               case 2 -> 36;
               case 3 -> 7;
               case 4 -> 63;
               case 5 -> 75;
               default -> 41;
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
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker p0) { this(); }
      public static void b() {  }
   }
}
