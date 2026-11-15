package me.octo.client;

import com.google.gson.JsonElement;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.core.RegistryAccess.Frozen;
import net.minecraft.resources.RegistryOps;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IllIllIIlllIlIIIllIllIIIIIllIIllIIIIllIllIllIlllIIIlllllIlIlIIllIlllIlllIIlllIIllllII
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static IllIllIIlllIlIIIllIllIIIIIllIIllIIIIllIllIllIlllIIIlllllIlIlIIllIlllIlllIIlllIIllllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @Nullable
   private String lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private String lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private int IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @JvmField
   @NotNull
   public static IllIllIIlllIlIIIllIllIIIIIllIIllIIIIllIllIllIlllIIIlllllIlIlIIllIlllIlllIIlllIIllllII llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static int IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static String[] f;
   private static String[] g;

   private IllIllIIlllIlIIIllIllIIIIIllIIllIIIIllIllIllIlllIIIlllllIlIlIIllIlllIlllIIlllIIllllII() {
      short var10001 = 3784;
      short var10002 = -14392;
      var10002 = 3790;
      short var10003 = -22548;
      short var10004 = 3789;
      short var10005 = -16569;
      super(
         "GUI Capture",
         "Logs each new container GUI (items, heads, ids) to polinex/guis so features like AutoForge can recreate them.",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
         "Misc",
         true,
         0
      , new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[0]);
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = "";
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI var1) {
      String var2 = lIlllllIIIlllIlIllIIlllIIlIlIIIllIllllIlIIllIIlIlllIIllIIIIllIlIIlIlIlIllIllIlIllIIlI.i();
      me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI var10000 = var1;
      if (var2 != null) {
         short var10001 = 3785;
         short var10002 = 1616;
         Intrinsics.checkNotNullParameter(var1, "event");
         if (!this.aA()) {
            return;
         }

         var10000 = var1;
      }

      String var33 = var10000.k();
      String var45 = var33;
      if (var2 != null) {
         if (var33 == null) {
            return;
         }

         var33 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(var33);
         var45 = var33;
      }

      if (var2 != null) {
         if (var45 == null) {
            return;
         }

         var33 = StringsKt.trim(var33).toString();
         var45 = var33;
      }

      if (var45 != null) {
         String var8 = var33;
         boolean var10 = false;
         int var34 = var8.length();
         if (var2 != null) {
            var34 = var34 > 0 ? 1 : 0;
         }

         String var35 = var34 != 0 ? var8 : null;
         if ((var34 != 0 ? var8 : null) != null) {
            String var3 = var35;
            if (var2 != null) {
               List var36 = var1.m();
               if (var36 != null) {
                  List var4 = var36;
                  if (var2 != null) {
                     ClientPacketListener var37 = this.ap().getConnection();
                     if (var37 != null) {
                        Frozen var38 = var37.registryAccess();
                        if (var38 != null) {
                           Frozen var5 = var38;
                           Iterable var7 = var4;
                           boolean var18 = false;
                           var var23 = new ArrayList();
                           boolean var11 = false;

                           for (Object var13 : var7) {
                              Slot var14 = (Slot)var13;
                              boolean var15 = false;
                              boolean var39 = var14.container instanceof Inventory;
                              if (var2 != null) {
                                 var39 = !var39;
                              }

                              if (var39) {
                                 var23.add(var13);
                                 if (var2 == null) {
                                    break;
                                 }
                              }
                           }

                           List var6 = var23;
                           Iterable var19 = var6;
                           int var9 = 0;
                           var var25 = new ArrayList();
                           boolean var27 = false;

                           for (Object var31 : var19) {
                              Slot var32 = (Slot)var31;
                              boolean var16 = false;
                              boolean var40 = var32.getItem().isEmpty();
                              if (var2 != null) {
                                 var40 = !var40;
                              }

                              if (var40) {
                                 var25.add(var31);
                                 if (var2 == null) {
                                    break;
                                 }
                              }
                           }

                           List var17 = var25;
                           Object var41 = var17;
                           if (var2 != null) {
                              if (var17.isEmpty()) {
                                 return;
                              }

                              var41 = var17;
                           }

                           var8 = CollectionsKt.joinToString(
                              (Iterable)var41,
                              "|",
                              null,
                              null,
                              0,
                              null,
                              (t) -> a((net.minecraft.world.inventory.Slot)t));
                           boolean var42 = llIIIIIllIlIIlllIlIlIlIlIIIIllIIlIIIIIIllIIlIllIIlIIIllIIIIlIIllIllIIIlllIIllllIIIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .a(var3, var8);
                           if (var2 != null) {
                              if (var42) {
                                 this.ag();
                                 return;
                              }

                              var42 = Intrinsics.areEqual(var3, this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl);
                           }

                           label125: {
                              label182: {
                                 if (var2 != null) {
                                    if (!var42) {
                                       break label182;
                                    }

                                    var42 = Intrinsics.areEqual(
                                       var8, this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
                                    );
                                 }

                                 if (var2 != null) {
                                    if (!var42) {
                                       break label182;
                                    }

                                    var9 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl++;
                                 }

                                 if (var2 != null) {
                                    break label125;
                                 }
                              }

                              this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var3;
                              this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var8;
                              this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 0;
                           }

                           if (this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl < 4) {
                              return;
                           }

                           var41 = RegistryOps.create((DynamicOps)JsonOps.INSTANCE, var5);
                           short var46 = 3783;
                           int var10003 = -2623;
                           Intrinsics.checkNotNullExpressionValue(var41, "create(...)");
                           RegistryOps var22 = (RegistryOps)var41;
                           ArrayList var24 = new ArrayList(var17.size());
                           Iterator var26 = var17.iterator();

                           while (true) {
                              if (var26.hasNext()) {
                                 Slot var28 = (Slot)var26.next();
                                 if (var2 == null) {
                                    break;
                                 }

                                 if (var2 == null) {
                                    continue;
                                 }

                                 var41 = (JsonElement)ItemStack.CODEC.encodeStart(var22, var28.getItem()).result().orElse(null);
                                 if (var41 == null) {
                                    continue;
                                 }

                                 JsonElement var30 = (JsonElement)var41;
                                 var10003 = var28.index;
                                 me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var10004 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                                 String var10005 = var28.getItem().getHoverName().getString();
                                 short var10007 = 3788;
                                 short var10008 = -18618;
                                 Intrinsics.checkNotNullExpressionValue(var10005, "getString(...)");
                                 String var48 = var10004.a(var10005);
                                 me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var49 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                                 ItemStack var10006 = var28.getItem();
                                 var10008 = 3782;
                                 short var10009 = 23676;
                                 Intrinsics.checkNotNullExpressionValue(var10006, "getItem(...)");
                                 var24.add(
                                    new lIlllllIIIlllIlIllIIlllIIlIlIIIllIllllIlIIllIIlIlllIIllIIIIllIlIIlIlIlIllIllIlIllIIlI(
                                       var10003, var48, var49.b(var10006), var30
                                    )
                                 );
                                 if (var2 != null) {
                                    continue;
                                 }
                              }

                              if (var24.isEmpty()) {
                                 this.ag();
                                 return;
                              }

                              llIIIIIllIlIIlllIlIlIlIlIIIIllIIlIIIIIIllIIlIllIIlIIIllIIIIlIIllIllIIIlllIIllllIIIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .a(
                                    new lIIIIllllIlIIIIlIlIllllIIllIlIlIIlIIIIlIIlllIlIIllllllIIlIIllIIlIIlllllIIllIIlllIIIII(
                                       var3, (var6.size() + 8) / 9, System.currentTimeMillis(), var8, var24
                                    )
                                 );
                              this.ag();
                              break;
                           }

                           return;
                        }
                     }
                  }

                  return;
               }
            }

            return;
         }
      }
   }

   private final void ag() {
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = null;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = "";
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 0;
   }

   private static final CharSequence a(Slot var0) {
      short var10001 = 3791;
      short var10002 = 2952;
      Intrinsics.checkNotNullParameter(var0, "it");
      int var10000 = var0.index;
      me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var1 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      ItemStack var3 = var0.getItem();
      short var10004 = 3786;
      short var10005 = -22949;
      Intrinsics.checkNotNullExpressionValue(var3, "getItem(...)");
      String var2 = var1.b(var3);
      me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var4 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      String var10003 = var0.getItem().getHoverName().getString();
      var10005 = 3787;
      short var10006 = 487;
      Intrinsics.checkNotNullExpressionValue(var10003, "getString(...)");
      return var10000 + ":" + var2 + ":" + var4.a(var10003);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[10];
      int var3 = 0;
      String var2 = "\u0099fmOtÙ@\u0004n\u001e¯SH^Ü\u0001©\u0012Ë±°`\u009bô\u009aú(\u001bà\u009b\u0018óûµaµ\u0088\u0081äDO³ÐV\u0005?Õ5²óuÝ-ÔÅî>(\u0093ì\u001cé¬\u0016i±\u0081íé¿M¨¹`º\u0016Ö\u0019-\u0089 \u000e·ØêT\u009böz¡\u008cEÖØ¸ëä/Ùº¿$(K\u0087Õ4Ü\u0002±Úî\u0004\u009cm\u0096µ\u000eq¿CRr\u001f\u0006yV6PQÑ3\u000eÝ¸Ö²À\u0003Pú\u009cF\t_úò\f\r\u0019Ì\u009c\u0083\u0088<8Ü\u0096a\u0084\u0005È<'nÍ\u000bì¢é´\u008aÍÑH\u0084\u0013\u0011";
      int var4 = "\u0099fmOtÙ@\u0004n\u001e¯SH^Ü\u0001©\u0012Ë±°`\u009bô\u009aú(\u001bà\u009b\u0018óûµaµ\u0088\u0081äDO³ÐV\u0005?Õ5²óuÝ-ÔÅî>(\u0093ì\u001cé¬\u0016i±\u0081íé¿M¨¹`º\u0016Ö\u0019-\u0089 \u000e·ØêT\u009böz¡\u008cEÖØ¸ëä/Ùº¿$(K\u0087Õ4Ü\u0002±Úî\u0004\u009cm\u0096µ\u000eq¿CRr\u001f\u0006yV6PQÑ3\u000eÝ¸Ö²À\u0003Pú\u009cF\t_úò\f\r\u0019Ì\u009c\u0083\u0088<8Ü\u0096a\u0084\u0005È<'nÍ\u000bì¢é´\u008aÍÑH\u0084\u0013\u0011"
         .length();
      char var1 = 2;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 49;
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
                     case 0 -> 95;
                     case 1 -> 2;
                     case 2 -> 110;
                     case 3 -> 104;
                     case 4 -> 78;
                     case 5 -> 4;
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
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IllIllIIlllIlIIIllIllIIIIIllIIllIIIIllIllIllIlllIIIlllllIlIlIIllIlllIlllIIlllIIllllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (Object) null
                     );
                     llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new IllIllIIlllIlIIIllIllIIIIIllIIllIIIIllIllIllIlllIIIlllllIlIlIIllIlllIlllIIlllIIllllII();
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

                  var2 = "6Nhýrß\u0011\u0082ÂQó\fûDDaÄa\u0082S]\u00ad\u0007µ";
                  var4 = "6Nhýrß\u0011\u0082ÂQó\fûDDaÄa\u0082S]\u00ad\u0007µ".length();
                  var1 = 11;
                  var8 = -1;
            }

            var10000 = 72;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 3791) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 113;
            case 1 -> 33;
            case 2 -> 135;
            case 3 -> 170;
            case 4 -> 2;
            case 5 -> 112;
            case 6 -> 48;
            case 7 -> 216;
            case 8 -> 78;
            case 9 -> 4;
            case 10 -> 1;
            case 11 -> 161;
            case 12 -> 132;
            case 13 -> 118;
            case 14 -> 23;
            case 15 -> 100;
            case 16 -> 212;
            case 17 -> 34;
            case 18 -> 192;
            case 19 -> 220;
            case 20 -> 74;
            case 21 -> 52;
            case 22 -> 84;
            case 23 -> 18;
            case 24 -> 232;
            case 25 -> 122;
            case 26 -> 179;
            case 27 -> 43;
            case 28 -> 191;
            case 29 -> 40;
            case 30 -> 156;
            case 31 -> 206;
            case 32 -> 143;
            case 33 -> 127;
            case 34 -> 254;
            case 35 -> 201;
            case 36 -> 20;
            case 37 -> 42;
            case 38 -> 213;
            case 39 -> 129;
            case 40 -> 44;
            case 41 -> 228;
            case 42 -> 106;
            case 43 -> 7;
            case 44 -> 50;
            case 45 -> 63;
            case 46 -> 90;
            case 47 -> 251;
            case 48 -> 98;
            case 49 -> 69;
            case 50 -> 211;
            case 51 -> 239;
            case 52 -> 72;
            case 53 -> 121;
            case 54 -> 230;
            case 55 -> 126;
            case 56 -> 66;
            case 57 -> 116;
            case 58 -> 14;
            case 59 -> 45;
            case 60 -> 39;
            case 61 -> 176;
            case 62 -> 134;
            case 63 -> 168;
            case 64 -> 221;
            case 65 -> 130;
            case 66 -> 29;
            case 67 -> 8;
            case 68 -> 97;
            case 69 -> 177;
            case 70 -> 79;
            case 71 -> 196;
            case 72 -> 12;
            case 73 -> 64;
            case 74 -> 93;
            case 75 -> 186;
            case 76 -> 80;
            case 77 -> 207;
            case 78 -> 242;
            case 79 -> 250;
            case 80 -> 101;
            case 81 -> 71;
            case 82 -> 21;
            case 83 -> 149;
            case 84 -> 68;
            case 85 -> 36;
            case 86 -> 185;
            case 87 -> 81;
            case 88 -> 65;
            case 89 -> 109;
            case 90 -> 187;
            case 91 -> 38;
            case 92 -> 218;
            case 93 -> 49;
            case 94 -> 125;
            case 95 -> 184;
            case 96 -> 137;
            case 97 -> 140;
            case 98 -> 222;
            case 99 -> 87;
            case 100 -> 240;
            case 101 -> 67;
            case 102 -> 225;
            case 103 -> 104;
            case 104 -> 37;
            case 105 -> 195;
            case 106 -> 147;
            case 107 -> 193;
            case 108 -> 9;
            case 109 -> 99;
            case 110 -> 119;
            case 111 -> 123;
            case 112 -> 10;
            case 113 -> 157;
            case 114 -> 223;
            case 115 -> 102;
            case 116 -> 210;
            case 117 -> 115;
            case 118 -> 76;
            case 119 -> 88;
            case 120 -> 217;
            case 121 -> 5;
            case 122 -> 25;
            case 123 -> 133;
            case 124 -> 131;
            case 125 -> 237;
            case 126 -> 70;
            case 127 -> 169;
            case 128 -> 16;
            case 129 -> 128;
            case 130 -> 3;
            case 131 -> 214;
            case 132 -> 189;
            case 133 -> 172;
            case 134 -> 229;
            case 135 -> 158;
            case 136 -> 246;
            case 137 -> 144;
            case 138 -> 226;
            case 139 -> 77;
            case 140 -> 155;
            case 141 -> 0;
            case 142 -> 208;
            case 143 -> 167;
            case 144 -> 235;
            case 145 -> 13;
            case 146 -> 59;
            case 147 -> 27;
            case 148 -> 197;
            case 149 -> 204;
            case 150 -> 139;
            case 151 -> 151;
            case 152 -> 85;
            case 153 -> 114;
            case 154 -> 60;
            case 155 -> 231;
            case 156 -> 24;
            case 157 -> 247;
            case 158 -> 145;
            case 159 -> 150;
            case 160 -> 15;
            case 161 -> 95;
            case 162 -> 202;
            case 163 -> 248;
            case 164 -> 153;
            case 165 -> 58;
            case 166 -> 141;
            case 167 -> 209;
            case 168 -> 11;
            case 169 -> 32;
            case 170 -> 41;
            case 171 -> 255;
            case 172 -> 200;
            case 173 -> 92;
            case 174 -> 22;
            case 175 -> 53;
            case 176 -> 203;
            case 177 -> 162;
            case 178 -> 173;
            case 179 -> 19;
            case 180 -> 107;
            case 181 -> 26;
            case 182 -> 180;
            case 183 -> 124;
            case 184 -> 120;
            case 185 -> 165;
            case 186 -> 108;
            case 187 -> 82;
            case 188 -> 178;
            case 189 -> 194;
            case 190 -> 227;
            case 191 -> 103;
            case 192 -> 47;
            case 193 -> 205;
            case 194 -> 252;
            case 195 -> 62;
            case 196 -> 117;
            case 197 -> 198;
            case 198 -> 166;
            case 199 -> 91;
            case 200 -> 152;
            case 201 -> 199;
            case 202 -> 57;
            case 203 -> 249;
            case 204 -> 86;
            case 205 -> 55;
            case 206 -> 238;
            case 207 -> 56;
            case 208 -> 190;
            case 209 -> 163;
            case 210 -> 146;
            case 211 -> 31;
            case 212 -> 215;
            case 213 -> 110;
            case 214 -> 75;
            case 215 -> 61;
            case 216 -> 164;
            case 217 -> 30;
            case 218 -> 154;
            case 219 -> 174;
            case 220 -> 35;
            case 221 -> 188;
            case 222 -> 89;
            case 223 -> 105;
            case 224 -> 94;
            case 225 -> 245;
            case 226 -> 171;
            case 227 -> 159;
            case 228 -> 51;
            case 229 -> 148;
            case 230 -> 142;
            case 231 -> 181;
            case 232 -> 233;
            case 233 -> 175;
            case 234 -> 253;
            case 235 -> 243;
            case 236 -> 241;
            case 237 -> 54;
            case 238 -> 96;
            case 239 -> 46;
            case 240 -> 183;
            case 241 -> 219;
            case 242 -> 136;
            case 243 -> 111;
            case 244 -> 244;
            case 245 -> 160;
            case 246 -> 182;
            case 247 -> 234;
            case 248 -> 73;
            case 249 -> 236;
            case 250 -> 6;
            case 251 -> 224;
            case 252 -> 83;
            case 253 -> 28;
            case 254 -> 17;
            default -> 138;
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
        // PX-FIX DCM: kotlin-synthesized <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
           this();
        }


      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }
}
