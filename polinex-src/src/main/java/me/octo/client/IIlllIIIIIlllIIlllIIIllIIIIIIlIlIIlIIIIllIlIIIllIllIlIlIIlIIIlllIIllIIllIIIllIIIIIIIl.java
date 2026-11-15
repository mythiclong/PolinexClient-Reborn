package me.octo.client;

import it.unimi.dsi.fastutil.longs.Long2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIlllIIIIIlllIIlllIIIllIIIIIIlIlIIlIIIIllIlIIIllIllIlIlIIlIIIlllIIllIIllIIIllIIIIIIIl {
   @NotNull
   public static IIlllIIIIIlllIIlllIIIllIIIIIIlIlIIlIIIIllIlIIIllIllIlIlIIlIIIlllIIllIIllIIIllIIIIIIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Minecraft lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String[] a;
   private static String[] b;

   private IIlllIIIIIlllIIlllIIIllIIIIIIlIlIIlIIIIllIlIIIllIllIlIlIIlIIIlllIIllIIllIIIllIIIIIIIl() {
   }

   @Nullable
   public final BlockPos a(@NotNull BlockPos var1) {
       BlockPos var40 = null; // PX-FIX decl var40
      Object var69 = null; // PX-FIX
      Object var60 = null; // PX-FIX
      int var10000 = c();
      short var10002 = 3857;
      short var10003 = -27092;
      Intrinsics.checkNotNullParameter(var1, "start");
      int var2 = var10000;
      if (var2 == 0 && lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.level != null) {
         ClientLevel var3 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.level;
         me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI var55 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         Vec3 var75 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g(var1)
            .add(0.0, 1.27, 0.0);
         short var10005 = 3862;
         short var10006 = -20830;
         Intrinsics.checkNotNullExpressionValue(var75, "add(...)");
         Iterable var5 = var55.a(10.0, 30.0, var75, var1);
         boolean var6 = false;
         Iterable var7 = var5;
         var var8 = new ArrayList();
         boolean var9 = false;
         Iterator var10 = var5.iterator();

         while (true) {
            if (var10.hasNext()) {
               Object var11 = var10.next();
               BlockPos var12 = (BlockPos)var11;
               boolean var13 = false;
               me.octo.client.utils.player.pathfinder.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII var56 = me.octo.client.utils.player.pathfinder.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
               Vec3 var10001 = var12.getCenter();
               var10003 = 3859;
               short var10004 = 12488;
               Intrinsics.checkNotNullExpressionValue(var10001, "getCenter(...)");
               boolean var57 = var56.a(var10001);
               if (var2 != 0) {
                  break;
               }

               label219: {
                  label233: {
                     if (var2 == 0) {
                        if (var57) {
                           break label233;
                        }

                        me.octo.client.utils.player.pathfinder.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII var58 = me.octo.client.utils.player.pathfinder.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                        var10001 = var12.getCenter();
                        var10003 = 3863;
                        var10004 = 10582;
                        Intrinsics.checkNotNullExpressionValue(var10001, "getCenter(...)");
                        var57 = var58.a(var10001, 3.0);
                     }

                     if (var2 != 0) {
                        break label219;
                     }

                     if (!var57) {
                        var57 = true;
                        break label219;
                     }
                  }

                  var57 = false;
               }

               if (!var57) {
                  continue;
               }

               var8.add(var11);
               if (var2 == 0) {
                  continue;
               }
            }

            var5 = (Iterable & List)var8;
            var6 = false;
            var7 = var5;
            var8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var5, 10));
            boolean var59 = false;
            break;
         }

         var10 = var7.iterator();

         while (true) {
            if (var10.hasNext()) {
               Object var36 = var10.next();
               var60 = var8;
               BlockPos var41 = (BlockPos)var36;
               if (var2 != 0) {
                  break;
               }

               boolean var45 = false;
               var8.add(
                  me.octo.client.utils.IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a(var41)
               );
               if (var2 == 0) {
                  continue;
               }
            }

            var60 = var8;
            break;
         }

         List var4 = (List)var60;
         Long2BooleanOpenHashMap var22 = new Long2BooleanOpenHashMap();
         Long2IntOpenHashMap var24 = new Long2IntOpenHashMap();
         Iterator var25 = var4.iterator();

         label193:
         while (true) {
            int var61 = ((var25.hasNext()) ? 1 : 0);

            label191:
            while (true) {
               if (var61 == 0) {
                  break label193;
               }

               long var27 = ((Number)var25.next()).longValue();
               int var34 = 0;
               int var37 = -1;

               label188:
               while (true) {
                  var61 = var37;

                  label185:
                  while (var61 < 2) {
                     var61 = (byte)-1;
                     if (var2 != 0) {
                        break label188;
                     }

                     int var42 = -1;

                     label182:
                     while (true) {
                        var61 = var42;

                        label180:
                        while (true) {
                           if (var61 >= 2) {
                              break label182;
                           }

                           var61 = -5;
                           if (var2 != 0) {
                              continue label185;
                           }

                           int var46 = -5;

                           while (var46 < 1) {
                              long var14 = me.octo.client.utils.IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .a(var27, var37, var46, var42);
                              var61 = ((((Map)var22).containsKey(var14) ? 1 : 0));
                              if (var2 != 0) {
                                 continue label180;
                              }

                              if (var2 == 0) {
                                 if (var61 == 0) {
                                    Map var16 = (Map)var22;
                                    Long var17 = var14;
                                    me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl var65 = me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                                    Block var73 = var3.getBlockState(
                                          me.octo.client.utils.IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                             .e(var14)
                                       )
                                       .getBlock();
                                    var10003 = 3856;
                                    short var81 = -25071;
                                    Intrinsics.checkNotNullExpressionValue(var73, "getBlock(...)");
                                    Boolean var18 = var65.a(var73);
                                    var16.put(var17, var18);
                                 }

                                 var61 = ((var22.get(var14)) ? 1 : 0);
                              }

                              if (var61 != 0) {
                                 var34--;
                              }

                              var46++;
                              if (var2 != 0) {
                                 break;
                              }
                           }

                           var42++;
                           if (var2 != 0) {
                              break label182;
                           }
                           break;
                        }
                     }

                     var37++;
                     if (var2 == 0) {
                        continue label188;
                     }
                     break;
                  }

                  var61 = (byte)-3;
                  break;
               }

               var37 = var61;

               label151:
               while (true) {
                  var61 = var37;

                  label149:
                  while (true) {
                     if (var61 >= 4) {
                        break label151;
                     }

                     var61 = -3;
                     if (var2 != 0) {
                        continue label191;
                     }

                     int var43 = -3;

                     label146:
                     while (true) {
                        var61 = var43;

                        label144:
                        while (true) {
                           if (var61 >= 4) {
                              break label146;
                           }

                           var61 = 0;
                           if (var2 != 0) {
                              continue label149;
                           }

                           int var47 = 0;

                           while (var47 < 4) {
                              long var49 = me.octo.client.utils.IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .a(var27, var37, var47, var43);
                              var61 = ((((Map)var22).containsKey(var49) ? 1 : 0));
                              if (var2 != 0) {
                                 continue label144;
                              }

                              if (var2 == 0) {
                                 if (var61 == 0) {
                                    Map var51 = (Map)var22;
                                    Long var53 = var49;
                                    me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl var68 = me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                                    Block var74 = var3.getBlockState(
                                          me.octo.client.utils.IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                             .e(var49)
                                       )
                                       .getBlock();
                                    var10003 = 3858;
                                    short var82 = 23378;
                                    Intrinsics.checkNotNullExpressionValue(var74, "getBlock(...)");
                                    Boolean var54 = var68.a(var74);
                                    var51.put(var53, var54);
                                 }

                                 var61 = ((var22.get(var49)) ? 1 : 0);
                              }

                              if (var61 != 0) {
                                 var34--;
                              }

                              var47++;
                              if (var2 != 0) {
                                 break;
                              }
                           }

                           var43++;
                           if (var2 != 0) {
                              break label146;
                           }
                           break;
                        }
                     }

                     var37++;
                     if (var2 != 0) {
                        break label151;
                     }
                     break;
                  }
               }

               ((Map)var24).put(var27, var34);
               if (var2 != 0) {
                  break label193;
               }
               break;
            }
         }

         Map var28 = (Map)var24;
         var9 = false;
         var var39 = new ArrayList(var28.size());
         boolean var44 = false;
         Iterator var48 = var28.entrySet().iterator();

         while (true) {
            if (var48.hasNext()) {
               Entry var50 = (Entry)var48.next();
               var69 = var39;
               if (var2 != 0) {
                  break;
               }

               boolean var52 = false;
               var39.add(TuplesKt.to(var50.getKey(), var50.getValue()));
               if (var2 == 0) {
                  continue;
               }
            }

            var69 = var39;
            break;
         }

         Object var29 = var69;
         var9 = false;
         List var26 = CollectionsKt.sortedWith(
            (Iterable)var29,
            new IIlllIIIIIlllIIlllIIIllIIIIIIlIlIIlIIIIllIlIIIllIllIlIlIIlIIIlllIIllIIllIIIllIIIIIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll()
         );
         var29 = var26.iterator();

         label102:
         while (((me.octo.client.PXDyn)var29).hasNext()) {
            Long var35 = (Long)((Pair)((me.octo.client.PXDyn)var29).next()).component1();
            me.octo.client.utils.IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII var70 = me.octo.client.utils.IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            Intrinsics.checkNotNull(var35);
            BlockPos var71 = var70.e(var35);

            do {
               var40 = var71;
               if (!(Boolean)me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.a(
                  me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                  var40,
                  false,
                  2,
                  null
               )) {
                  continue label102;
               }

               var71 = var40;
            } while (var2 != 0);

            return var40;
         }

         if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
            b(++var2);
         }

         return null;
      } else {
         return null;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
      String[] var5 = new String[7];
      int var3 = 0;
      String var2 = "³\tÃ\u0092\u001b\u0097Å\u0019â\u0088wî«\u0004\r\u000e\u0005t\u0012ä§\u00050Ud\u0090µP\u0005#\u009eRb\u008f\r¢%á\u0016V'S \u009ffÉõ{\u000eôÑ+\u0089\u0006ôfu\u0096\u0005ù_z2";
      int var4 = "³\tÃ\u0092\u001b\u0097Å\u0019â\u0088wî«\u0004\r\u000e\u0005t\u0012ä§\u00050Ud\u0090µP\u0005#\u009eRb\u008f\r¢%á\u0016V'S \u009ffÉõ{\u000eôÑ+\u0089\u0006ôfu\u0096\u0005ù_z2"
         .length();
      b(33);
      char var1 = 14;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 111;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var26 = var10001.toCharArray();
               int var10004 = var26.length;
               int var6 = 0;
               byte var29 = var10000;
               var21 = var26;
               int var15 = var10004;
               byte var35;
               char[] var39;
               int var10006;
               if (var10004 <= 1) {
                  var39 = var26;
                  var35 = var10000;
                  var10006 = var6;
               } else {
                  var29 = var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var39 = var26;
                  var35 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var39[var10006] = (char)(var39[var10006] ^ var35 ^ switch (var6 % 7) {
                     case 0 -> 14;
                     case 1 -> 30;
                     case 2 -> 9;
                     case 3 -> 120;
                     case 4 -> 95;
                     case 5 -> 13;
                     default -> 114;
                  });
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var39 = var21;
                     var35 = var29;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var39 = var21;
                     var35 = var29;
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
                     b = new String[7];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIlllIIIIIlllIIlllIIIllIIIIIIlIlIIlIIIIllIlIIIllIllIlIlIIlIIIlllIIllIIllIIIllIIIIIIIl();
                     Minecraft var10 = Minecraft.getInstance();
                     var10002 = 3861;
                     short var32 = 27758;
                     Intrinsics.checkNotNullExpressionValue(var10, "getInstance(...)");
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var10;
                     break label52;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var31;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "¡¨\u001c§ò<Ë#\u0010×Ç\u0004\n£\u0099ó)s\nÚÑwiMv";
                  var4 = "¡¨\u001c§ò<Ë#\u0010×Ç\u0004\n£\u0099ó)s\nÚÑwiMv".length();
                  var1 = '\b';
                  var8 = -1;
            }

            var10000 = 101;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   public static void b(int var0) {
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var0;
   }

   public static int b() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public static int c() {
      int var0 = b();
      return var0 == 0 ? 47 : 0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 3859) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 70;
            case 1 -> 129;
            case 2 -> 156;
            case 3 -> 176;
            case 4 -> 157;
            case 5 -> 0;
            case 6 -> 245;
            case 7 -> 165;
            case 8 -> 138;
            case 9 -> 186;
            case 10 -> 34;
            case 11 -> 62;
            case 12 -> 254;
            case 13 -> 167;
            case 14 -> 63;
            case 15 -> 11;
            case 16 -> 71;
            case 17 -> 84;
            case 18 -> 6;
            case 19 -> 49;
            case 20 -> 181;
            case 21 -> 97;
            case 22 -> 115;
            case 23 -> 199;
            case 24 -> 64;
            case 25 -> 66;
            case 26 -> 124;
            case 27 -> 12;
            case 28 -> 168;
            case 29 -> 69;
            case 30 -> 9;
            case 31 -> 126;
            case 32 -> 38;
            case 33 -> 229;
            case 34 -> 65;
            case 35 -> 178;
            case 36 -> 111;
            case 37 -> 236;
            case 38 -> 15;
            case 39 -> 86;
            case 40 -> 191;
            case 41 -> 189;
            case 42 -> 82;
            case 43 -> 158;
            case 44 -> 222;
            case 45 -> 106;
            case 46 -> 77;
            case 47 -> 27;
            case 48 -> 96;
            case 49 -> 112;
            case 50 -> 132;
            case 51 -> 184;
            case 52 -> 81;
            case 53 -> 58;
            case 54 -> 41;
            case 55 -> 197;
            case 56 -> 242;
            case 57 -> 99;
            case 58 -> 253;
            case 59 -> 232;
            case 60 -> 131;
            case 61 -> 50;
            case 62 -> 159;
            case 63 -> 134;
            case 64 -> 182;
            case 65 -> 137;
            case 66 -> 251;
            case 67 -> 28;
            case 68 -> 142;
            case 69 -> 101;
            case 70 -> 56;
            case 71 -> 80;
            case 72 -> 113;
            case 73 -> 110;
            case 74 -> 43;
            case 75 -> 187;
            case 76 -> 103;
            case 77 -> 239;
            case 78 -> 53;
            case 79 -> 130;
            case 80 -> 95;
            case 81 -> 171;
            case 82 -> 220;
            case 83 -> 234;
            case 84 -> 243;
            case 85 -> 205;
            case 86 -> 30;
            case 87 -> 224;
            case 88 -> 226;
            case 89 -> 217;
            case 90 -> 60;
            case 91 -> 21;
            case 92 -> 153;
            case 93 -> 1;
            case 94 -> 210;
            case 95 -> 164;
            case 96 -> 37;
            case 97 -> 188;
            case 98 -> 72;
            case 99 -> 192;
            case 100 -> 94;
            case 101 -> 233;
            case 102 -> 198;
            case 103 -> 246;
            case 104 -> 255;
            case 105 -> 230;
            case 106 -> 214;
            case 107 -> 117;
            case 108 -> 8;
            case 109 -> 190;
            case 110 -> 212;
            case 111 -> 74;
            case 112 -> 5;
            case 113 -> 143;
            case 114 -> 241;
            case 115 -> 139;
            case 116 -> 177;
            case 117 -> 57;
            case 118 -> 218;
            case 119 -> 52;
            case 120 -> 163;
            case 121 -> 16;
            case 122 -> 140;
            case 123 -> 170;
            case 124 -> 174;
            case 125 -> 196;
            case 126 -> 76;
            case 127 -> 195;
            case 128 -> 102;
            case 129 -> 98;
            case 130 -> 173;
            case 131 -> 208;
            case 132 -> 2;
            case 133 -> 54;
            case 134 -> 87;
            case 135 -> 36;
            case 136 -> 32;
            case 137 -> 160;
            case 138 -> 125;
            case 139 -> 194;
            case 140 -> 29;
            case 141 -> 219;
            case 142 -> 120;
            case 143 -> 127;
            case 144 -> 237;
            case 145 -> 150;
            case 146 -> 203;
            case 147 -> 136;
            case 148 -> 200;
            case 149 -> 100;
            case 150 -> 252;
            case 151 -> 206;
            case 152 -> 119;
            case 153 -> 46;
            case 154 -> 73;
            case 155 -> 59;
            case 156 -> 213;
            case 157 -> 108;
            case 158 -> 85;
            case 159 -> 107;
            case 160 -> 248;
            case 161 -> 31;
            case 162 -> 209;
            case 163 -> 79;
            case 164 -> 240;
            case 165 -> 193;
            case 166 -> 22;
            case 167 -> 13;
            case 168 -> 83;
            case 169 -> 4;
            case 170 -> 215;
            case 171 -> 45;
            case 172 -> 48;
            case 173 -> 122;
            case 174 -> 133;
            case 175 -> 202;
            case 176 -> 90;
            case 177 -> 175;
            case 178 -> 238;
            case 179 -> 161;
            case 180 -> 118;
            case 181 -> 18;
            case 182 -> 128;
            case 183 -> 221;
            case 184 -> 155;
            case 185 -> 40;
            case 186 -> 235;
            case 187 -> 91;
            case 188 -> 147;
            case 189 -> 250;
            case 190 -> 146;
            case 191 -> 152;
            case 192 -> 33;
            case 193 -> 42;
            case 194 -> 204;
            case 195 -> 109;
            case 196 -> 24;
            case 197 -> 10;
            case 198 -> 180;
            case 199 -> 216;
            case 200 -> 14;
            case 201 -> 47;
            case 202 -> 247;
            case 203 -> 183;
            case 204 -> 51;
            case 205 -> 228;
            case 206 -> 93;
            case 207 -> 231;
            case 208 -> 17;
            case 209 -> 44;
            case 210 -> 19;
            case 211 -> 179;
            case 212 -> 201;
            case 213 -> 149;
            case 214 -> 78;
            case 215 -> 172;
            case 216 -> 35;
            case 217 -> 68;
            case 218 -> 104;
            case 219 -> 7;
            case 220 -> 169;
            case 221 -> 61;
            case 222 -> 55;
            case 223 -> 92;
            case 224 -> 23;
            case 225 -> 145;
            case 226 -> 67;
            case 227 -> 144;
            case 228 -> 154;
            case 229 -> 148;
            case 230 -> 225;
            case 231 -> 116;
            case 232 -> 207;
            case 233 -> 26;
            case 234 -> 3;
            case 235 -> 25;
            case 236 -> 39;
            case 237 -> 244;
            case 238 -> 89;
            case 239 -> 185;
            case 240 -> 166;
            case 241 -> 211;
            case 242 -> 223;
            case 243 -> 249;
            case 244 -> 151;
            case 245 -> 141;
            case 246 -> 123;
            case 247 -> 20;
            case 248 -> 105;
            case 249 -> 135;
            case 250 -> 121;
            case 251 -> 162;
            case 252 -> 227;
            case 253 -> 114;
            case 254 -> 75;
            default -> 88;
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
