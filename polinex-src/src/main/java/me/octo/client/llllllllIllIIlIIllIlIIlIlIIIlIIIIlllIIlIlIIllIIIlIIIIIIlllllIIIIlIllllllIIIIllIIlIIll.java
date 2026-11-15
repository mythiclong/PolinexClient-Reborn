package me.octo.client;

import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.ResolvableProfile;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class llllllllIllIIlIIllIlIIlIlIIIlIIIIlllIIlIlIIllIIIlIIIIIIlllllIIIIlIllllllIIIIllIIlIIll
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static llllllllIllIIlIIllIlIIlIlIIIlIIIIlllIIlIlIIllIIIlIIIIIIlllllIIIIlIllllllIIIIllIIlIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private final List<String> lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private ArrayList<Vec3> lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private final List<BlockPos> IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private static llllllllIllIIlIIllIlIIlIlIIIlIIIIlllIIlIlIIllIIIlIIIIIIlllllIIIIlIllllllIIIIllIIlIIll llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static String[] f;
   private static String[] g;

   public llllllllIllIIlIIllIlIIlIlIIIlIIIIlllIIlIlIIllIIIlIIIIIIlllllIIIIlIllllllIIIIllIIlIIll() {
      short var10001 = -10661;
      short var10002 = 29545;
      var10002 = -10682;
      short var10003 = 13074;
      short var10004 = -10688;
      short var10005 = -11428;
      super(
         "DevESP",
         "DevESP.",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
         "Hub"
      );
      String[] var1 = new String[7];
      var10003 = -10684;
      var10004 = 15185;
      var1[0] = "0f0b3b3e0bce4485be658a860a0c8fd6";
      var10003 = -10662;
      var10004 = 25104;
      var1[1] = "0e2921d3d8bb4737bcb27ec6475f45d1";
      var10003 = -10676;
      var10004 = 6671;
      var1[2] = "aa06ab805cec4ca6a998abc62e1a9fde";
      var10003 = -10663;
      var10004 = 3472;
      var1[3] = "ab224520f010423aa9983a4bc3d6eebf";
      var10003 = -10664;
      var10004 = 31554;
      var1[4] = "fdc27f969de345e582981a3ae3098baa";
      var10003 = -10683;
      var10004 = 15159;
      var1[5] = "a81fec2ccc6348a6844b89a4faffb951";
      var10003 = -10685;
      var10004 = 16295;
      var1[6] = "63e108d5548b488a860369a34a6dc714";
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = CollectionsKt.listOf(var1);
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new ArrayList<>();
      BlockPos[] var2 = new BlockPos[]{
         new BlockPos(-3, 78, 14),
         new BlockPos(-26, 54, -12),
         new BlockPos(62, 67, 5),
         new BlockPos(7, 60, -48),
         new BlockPos(-22, 62, -35),
         new BlockPos(-70, 69, -60),
         new BlockPos(-125, 72, -30)
      };
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = CollectionsKt.listOf(var2);
   }

   @Override
   public boolean b() {
      return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.contains("");
   }

   @SubscribeEvent
   public final void a(@NotNull llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII var1) {
      Object var59 = null; // PX-FIX
      Object var56 = null; // PX-FIX
      Object var55 = null; // PX-FIX
      int var53 = 0; // PX-FIX
      Object var52 = null; // PX-FIX
      Object var49 = null; // PX-FIX
      ItemStack var39 = null; // PX-FIX
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      short var10002 = -10673;
      short var10003 = -28733;
      Intrinsics.checkNotNullParameter(var1, "event");
      String var2 = var10000;
      String var3 = "";
      llllllllIllIIlIIllIlIIlIlIIIlIIIIlllIIlIlIIllIIIlIIIIIIlllllIIIIlIllllllIIIIllIIlIIll var43 = this;
      if (var2 == null) {
         if (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.contains(var3)) {
            if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .g()
               != IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
               )
             {
               return;
            }

            ClientLevel var44 = this.ap().level;
            if (var44 == null) {
               return;
            }

            ClientLevel var4 = var44;
            Iterable var45 = var4.entitiesForRendering();
            var10002 = -10681;
            var10003 = 6498;
            Intrinsics.checkNotNullExpressionValue(var45, "entitiesForRendering(...)");
            Iterable var6 = var45;
            boolean var7 = false;
            Iterable var8 = var6;
            var var9 = new ArrayList();
            boolean var10 = false;
            Iterator var11 = var6.iterator();

            while (true) {
               if (var11.hasNext()) {
                  Object var12 = var11.next();
                  boolean var46 = var12 instanceof ArmorStand;
                  if (var2 != null) {
                     break;
                  }

                  if (var2 == null) {
                     if (!var46) {
                        continue;
                     }

                     var9.add(var12);
                  }

                  if (var2 == null) {
                     continue;
                  }
               }

               var6 = var9;
               var7 = false;
               var8 = var6;
               var9 = new ArrayList();
               boolean var47 = false;
               break;
            }

            for (Object var33 : var8) {
               label209: {
                  label235: {
                     ArmorStand var13 = (ArmorStand)var33;
                     boolean var14 = false;
                     me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var48 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                     String var10001 = var13.getName().getString();
                     var10003 = -10687;
                     short var10004 = 2201;
                     Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
                     String var15 = var48.a(var10001);
                     short var63 = -10677;
                     var10002 = 21655;
                     var49 = StringsKt.startsWith(var15, "[Lv", false);
                     if (var2 == null) {
                        if (((Boolean)(var49))) {
                           short var64 = -10686;
                           var10002 = -24445;
                           var49 = StringsKt.endsWith(var15, "Rat", false);
                           if (var2 != null) {
                              break label209;
                           }

                           if (((Boolean)(var49))) {
                              break label235;
                           }
                        }

                        short var65 = -10680;
                        var10002 = -10315;
                        var49 = StringsKt.startsWith(var15, "[RAT] ", false);
                     }

                     if (var2 != null) {
                        break label209;
                     }

                     if (!((Boolean)var49)) {
                        var49 = false;
                        break label209;
                     }
                  }

                  var49 = true;
               }

               if (((Boolean)(var49))) {
                  var9.add(var33);
                  if (var2 != null) {
                     break;
                  }
               }
            }

            List var5 = var9;
            Iterable var50 = var4.entitiesForRendering();
            var10002 = -10679;
            var10003 = 26671;
            Intrinsics.checkNotNullExpressionValue(var50, "entitiesForRendering(...)");
            Iterable var23 = var50;
            boolean var25 = false;
            var var28 = new ArrayList();
            boolean var31 = false;

            for (Object var36 : var23) {
               boolean var51 = var36 instanceof LivingEntity;
               if (var2 == null) {
                  if (!var51) {
                     continue;
                  }

                  var28.add(var36);
               }

               if (var2 != null) {
                  break;
               }
            }

            List var21 = var28;
            this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.clear();
            Iterable var24 = var21;
            boolean var26 = false;

            for (Object var29 : var24) {
               LivingEntity var32 = (LivingEntity)var29;
               boolean var35 = false;
               Vec3 var37 = me.octo.client.utils.player.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(var32);
               var var38 = var5;
               boolean var40 = false;
               if (var2 == null) {
                  label238: {
                     var52 = var38;
                     label172:
                     if (var2 == null) {
                        if (var38 instanceof Collection) {
                           var52 = (Collection)var38;
                           if (var2 != null) {
                              break label172;
                           }

                           if (((me.octo.client.PXDyn)var52).isEmpty()) {
                              var53 = 0;
                              break label238;
                           }
                        }

                        var52 = var38;
                     }

                     Iterator var16 = ((me.octo.client.PXDyn)var52).iterator();

                     label165:
                     while (true) {
                        if (!var16.hasNext()) {
                           var53 = 0;
                           break;
                        }

                        Object var17 = var16.next();
                        ArmorStand var18 = (ArmorStand)var17;
                        boolean var19 = false;
                        double var80;
                        var53 = (
                                 var80 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                       .b(
                                          var37,
                                          me.octo.client.utils.player.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(
                                             var18
                                          )
                                       )
                                    - 9.0
                              )
                              == 0.0
                           ? 0
                           : (var80 < 0.0 ? -1 : 1);

                        while (true) {
                           if (var2 == null) {
                              var53 = var53 < 0 ? 1 : 0;
                           }

                           if (var53 == 0) {
                              break;
                           }

                           var53 = 1;
                           if (var2 == null) {
                              break label165;
                           }
                        }
                     }
                  }

                  label107:
                  if (var53 == 0 || var2 != null) {
                     label243: {
                        label244: {
                           label147: {
                              ItemStack var54 = var32.getItemBySlot(EquipmentSlot.HEAD);
                              var10002 = -10674;
                              var10003 = -7629;
                              Intrinsics.checkNotNullExpressionValue(var54, "getItemBySlot(...)");
                              var39 = var54;
                              if (!var39.isEmpty()) {
                                 Component var67;
                                 label144: {
                                    var55 = var32.getName();
                                    if (var2 == null) {
                                       LocalPlayer var66 = this.ap().player;
                                       if (var66 != null) {
                                          var67 = var66.getName();
                                          break label144;
                                       }
                                    }

                                    var67 = null;
                                 }

                                 var56 = Intrinsics.areEqual(var55, var67);
                                 if (var2 != null) {
                                    break label244;
                                 }

                                 if (!((Boolean)var56)) {
                                    break label147;
                                 }
                              }

                              if (var2 == null) {
                                 break label107;
                              }
                           }

                           var10000 = String.valueOf(var39);
                           if (var2 != null) {
                              break label243;
                           }

                           var56 = var39.is(Items.PLAYER_HEAD);
                        }

                        if (!((Boolean)var56)) {
                           break label107;
                        }

                        var10000 = (String)(Object)(var39.get(DataComponents.PROFILE));
                     }

                     label127: {
                        ResolvableProfile var41 = (ResolvableProfile)(Object)var10000;
                        if (var2 == null && var41 != null) {
                           GameProfile var58 = var41.partialProfile();
                           if (var58 != null) {
                              var59 = var58.id();
                              if (var2 == null) {
                                 break label127;
                              }
                           }
                        }

                        var59 = null;
                     }

                     label118: {
                        label246: {
                           UUID var42 =((UUID)( var59));
                           UUID var60 = var42;
                           if (var2 == null) {
                              if (var42 == null) {
                                 break label246;
                              }

                              var60 = var42;
                           }

                           var10000 = var60.toString();
                           short var68 = -10678;
                           var10002 = -16618;
                           boolean var62 = Intrinsics.areEqual(var10000, "8842a457-5e25-3ad0-958e-dfbebbb1129c");
                           if (var2 != null) {
                              break label107;
                           }

                           if (var62) {
                              break label118;
                           }
                        }

                        if (var2 == null) {
                           break label107;
                        }
                     }

                     this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.add(var37);
                  }

                  if (var2 == null) {
                     continue;
                  }
               }
               break;
            }

            return;
         }

         var43 = this;
      }

      var43.af();
   }

   @SubscribeEvent(
      priority = EventPriority.HIGH
   )
   public final void a(@NotNull me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var1) {
      short var10001 = -10675;
      short var10002 = -6251;
      Intrinsics.checkNotNullParameter(var1, "event");
      double var3 = 0.5;
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      String var5 = String.valueOf(this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.size());
      llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var6 = new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(
         1291780096
      );
      Iterable var7 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      boolean var8 = false;
      Iterator var9 = var7.iterator();
      String var2 = var10000;

      while (var9.hasNext()) {
         Object var10 = var9.next();
         Vec3 var11 = (Vec3)var10;
         boolean var12 = false;
         double var13 = var11.y + 1.62;
         IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a(
            new AABB(var11.x - var3, var13 - var3, var11.z - var3, var11.x + var3, var13 + var3, var11.z + var3),
            var6,
            null,
            0.0F,
            null,
            null,
            0.0F,
            false,
            0.0F);
         me.octo.client.utils.IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.a(
            var5,
            new Vec3(var11.x, var13 + 0.4, var11.z),
            5.0F,
            false,
            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl,
            null,
            0.0F,
            null);
         if (var2 == null && var2 == null) {
            continue;
         }
         break;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[20];
      int var3 = 0;
      String var2 = "Û{?$Z¹B8^\u0083\u0018s\u0094\u0088}u\u0097\\ÔK©\u00165\t°\u0081É \u0096/\u009c\u0081Y²eKv\u0088K\u0080\u0019\u0015\u008d\u001dyèÆ)i\u0083]\u008e¾L\n¢®Ìw\u000e\tá\u0002\u0016\u0087\u0002\u0006ú\u009f,½t\u008d\u0005CÎÆ\r \u0012\töÜ\\ÐJ&DTÓ²é\u0007<²\u00ad\u0091u\u0005\u008f\u0004_T\u0093 \u001d`Üu\tøÿ\u0087Ü§o]ÔlÏ\u009d×xKí½f°Ö)\u008a¤R<HÿÄ ð'\u0089\u0082\r»XûÿÚVN\u0005t¬ù\u0090FØÏ°\u0013®M®X\u0095\u0089§ÇÈ\u001f\u0003\u0091÷\\\u000eB{µ÷ýq\u0087úúÖø\u001c\u001eê\u0003\u0015ë\u0083\u0019\u008b\u0085Îx\u0092æfmjÝ³®ë\bVîR\u007fÝ\b\u009b\"Y\u0083ë\u0007ý±\u0007¸Îne ØÏe¢\u001bY3ÁXV03\u0006 \u00954Å@v\u001cï\u0012\u008ajx[\u0007ë®ÇÌÕ \u0007ñäô\\\u0016F\u000f\u0084HÇ\u0087\u0007¦ìzÂ»\u0085OÓ\u009dTÊ\u0087\r2$ÎÄ\u0080\u0006\u0006\u0010\u008dº?y\u009e Â/^\u0017H\t²\u0083ó\u001fö{\u0000Ý\u0007tÕ>3>ÔP\u0001÷\u0019ü`\u0083-Æqx";
      int var4 = "Û{?$Z¹B8^\u0083\u0018s\u0094\u0088}u\u0097\\ÔK©\u00165\t°\u0081É \u0096/\u009c\u0081Y²eKv\u0088K\u0080\u0019\u0015\u008d\u001dyèÆ)i\u0083]\u008e¾L\n¢®Ìw\u000e\tá\u0002\u0016\u0087\u0002\u0006ú\u009f,½t\u008d\u0005CÎÆ\r \u0012\töÜ\\ÐJ&DTÓ²é\u0007<²\u00ad\u0091u\u0005\u008f\u0004_T\u0093 \u001d`Üu\tøÿ\u0087Ü§o]ÔlÏ\u009d×xKí½f°Ö)\u008a¤R<HÿÄ ð'\u0089\u0082\r»XûÿÚVN\u0005t¬ù\u0090FØÏ°\u0013®M®X\u0095\u0089§ÇÈ\u001f\u0003\u0091÷\\\u000eB{µ÷ýq\u0087úúÖø\u001c\u001eê\u0003\u0015ë\u0083\u0019\u008b\u0085Îx\u0092æfmjÝ³®ë\bVîR\u007fÝ\b\u009b\"Y\u0083ë\u0007ý±\u0007¸Îne ØÏe¢\u001bY3ÁXV03\u0006 \u00954Å@v\u001cï\u0012\u008ajx[\u0007ë®ÇÌÕ \u0007ñäô\\\u0016F\u000f\u0084HÇ\u0087\u0007¦ìzÂ»\u0085OÓ\u009dTÊ\u0087\r2$ÎÄ\u0080\u0006\u0006\u0010\u008dº?y\u009e Â/^\u0017H\t²\u0083ó\u001fö{\u0000Ý\u0007tÕ>3>ÔP\u0001÷\u0019ü`\u0083-Æqx"
         .length();
      char var1 = 3;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 83;
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
                     case 0 -> 113;
                     case 1 -> 59;
                     case 2 -> 21;
                     case 3 -> 92;
                     case 4 -> 94;
                     case 5 -> 118;
                     default -> 89;
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
                     g = new String[20];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new llllllllIllIIlIIllIlIIlIlIIIlIIIIlllIIlIlIIllIIIlIIIIIIlllllIIIIlIllllllIIIIllIIlIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (Object) null
                     );
                     llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new llllllllIllIIlIIllIlIIlIlIIIlIIIIlllIIlIlIIllIIIlIIIIIIlllllIIIIlIllllllIIIIllIIlIIll();
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

                  var2 = "3Ç\tô¶\tï\u0016ÔÔ\u0011K×Ôï´Ùò\u0098®\u0087\u001fªÜ\u0094Q/ðü°$© \u0098\u0019Êé¶ù\u00877ìbö@õÑý§^E\u001a2Õ\u008c¥\u00ad\u0094\u001c½V-\u008dëî";
                  var4 = "3Ç\tô¶\tï\u0016ÔÔ\u0011K×Ôï´Ùò\u0098®\u0087\u001fªÜ\u0094Q/ðü°$© \u0098\u0019Êé¶ù\u00877ìbö@õÑý§^E\u001a2Õ\u008c¥\u00ad\u0094\u001c½V-\u008dëî"
                     .length();
                  var1 = ' ';
                  var8 = -1;
            }

            var10000 = 67;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -10677) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 190;
            case 1 -> 48;
            case 2 -> 22;
            case 3 -> 155;
            case 4 -> 167;
            case 5 -> 20;
            case 6 -> 136;
            case 7 -> 223;
            case 8 -> 174;
            case 9 -> 0;
            case 10 -> 170;
            case 11 -> 154;
            case 12 -> 3;
            case 13 -> 143;
            case 14 -> 125;
            case 15 -> 29;
            case 16 -> 72;
            case 17 -> 249;
            case 18 -> 138;
            case 19 -> 248;
            case 20 -> 99;
            case 21 -> 184;
            case 22 -> 96;
            case 23 -> 24;
            case 24 -> 203;
            case 25 -> 19;
            case 26 -> 227;
            case 27 -> 104;
            case 28 -> 199;
            case 29 -> 224;
            case 30 -> 228;
            case 31 -> 182;
            case 32 -> 84;
            case 33 -> 215;
            case 34 -> 121;
            case 35 -> 192;
            case 36 -> 73;
            case 37 -> 60;
            case 38 -> 225;
            case 39 -> 63;
            case 40 -> 81;
            case 41 -> 102;
            case 42 -> 111;
            case 43 -> 231;
            case 44 -> 254;
            case 45 -> 168;
            case 46 -> 85;
            case 47 -> 122;
            case 48 -> 237;
            case 49 -> 180;
            case 50 -> 243;
            case 51 -> 61;
            case 52 -> 17;
            case 53 -> 252;
            case 54 -> 53;
            case 55 -> 221;
            case 56 -> 235;
            case 57 -> 218;
            case 58 -> 124;
            case 59 -> 94;
            case 60 -> 30;
            case 61 -> 216;
            case 62 -> 98;
            case 63 -> 177;
            case 64 -> 7;
            case 65 -> 88;
            case 66 -> 66;
            case 67 -> 186;
            case 68 -> 145;
            case 69 -> 166;
            case 70 -> 116;
            case 71 -> 75;
            case 72 -> 47;
            case 73 -> 76;
            case 74 -> 78;
            case 75 -> 149;
            case 76 -> 250;
            case 77 -> 148;
            case 78 -> 219;
            case 79 -> 49;
            case 80 -> 242;
            case 81 -> 23;
            case 82 -> 31;
            case 83 -> 129;
            case 84 -> 74;
            case 85 -> 200;
            case 86 -> 171;
            case 87 -> 107;
            case 88 -> 153;
            case 89 -> 188;
            case 90 -> 62;
            case 91 -> 131;
            case 92 -> 130;
            case 93 -> 56;
            case 94 -> 197;
            case 95 -> 54;
            case 96 -> 146;
            case 97 -> 191;
            case 98 -> 115;
            case 99 -> 196;
            case 100 -> 213;
            case 101 -> 217;
            case 102 -> 189;
            case 103 -> 165;
            case 104 -> 108;
            case 105 -> 207;
            case 106 -> 239;
            case 107 -> 209;
            case 108 -> 82;
            case 109 -> 247;
            case 110 -> 92;
            case 111 -> 93;
            case 112 -> 109;
            case 113 -> 57;
            case 114 -> 58;
            case 115 -> 12;
            case 116 -> 70;
            case 117 -> 77;
            case 118 -> 194;
            case 119 -> 185;
            case 120 -> 214;
            case 121 -> 32;
            case 122 -> 169;
            case 123 -> 4;
            case 124 -> 127;
            case 125 -> 144;
            case 126 -> 38;
            case 127 -> 16;
            case 128 -> 151;
            case 129 -> 105;
            case 130 -> 5;
            case 131 -> 18;
            case 132 -> 44;
            case 133 -> 134;
            case 134 -> 198;
            case 135 -> 91;
            case 136 -> 67;
            case 137 -> 157;
            case 138 -> 45;
            case 139 -> 232;
            case 140 -> 183;
            case 141 -> 163;
            case 142 -> 87;
            case 143 -> 15;
            case 144 -> 210;
            case 145 -> 246;
            case 146 -> 164;
            case 147 -> 234;
            case 148 -> 236;
            case 149 -> 212;
            case 150 -> 160;
            case 151 -> 46;
            case 152 -> 51;
            case 153 -> 86;
            case 154 -> 8;
            case 155 -> 103;
            case 156 -> 37;
            case 157 -> 26;
            case 158 -> 28;
            case 159 -> 123;
            case 160 -> 202;
            case 161 -> 2;
            case 162 -> 9;
            case 163 -> 179;
            case 164 -> 211;
            case 165 -> 176;
            case 166 -> 13;
            case 167 -> 95;
            case 168 -> 175;
            case 169 -> 150;
            case 170 -> 118;
            case 171 -> 55;
            case 172 -> 204;
            case 173 -> 205;
            case 174 -> 128;
            case 175 -> 117;
            case 176 -> 40;
            case 177 -> 241;
            case 178 -> 39;
            case 179 -> 162;
            case 180 -> 34;
            case 181 -> 11;
            case 182 -> 178;
            case 183 -> 187;
            case 184 -> 139;
            case 185 -> 106;
            case 186 -> 244;
            case 187 -> 173;
            case 188 -> 137;
            case 189 -> 112;
            case 190 -> 21;
            case 191 -> 52;
            case 192 -> 27;
            case 193 -> 133;
            case 194 -> 120;
            case 195 -> 1;
            case 196 -> 135;
            case 197 -> 147;
            case 198 -> 226;
            case 199 -> 68;
            case 200 -> 140;
            case 201 -> 36;
            case 202 -> 59;
            case 203 -> 220;
            case 204 -> 14;
            case 205 -> 83;
            case 206 -> 255;
            case 207 -> 80;
            case 208 -> 159;
            case 209 -> 193;
            case 210 -> 195;
            case 211 -> 240;
            case 212 -> 79;
            case 213 -> 25;
            case 214 -> 201;
            case 215 -> 142;
            case 216 -> 50;
            case 217 -> 132;
            case 218 -> 110;
            case 219 -> 141;
            case 220 -> 97;
            case 221 -> 222;
            case 222 -> 152;
            case 223 -> 119;
            case 224 -> 64;
            case 225 -> 100;
            case 226 -> 181;
            case 227 -> 206;
            case 228 -> 35;
            case 229 -> 251;
            case 230 -> 238;
            case 231 -> 10;
            case 232 -> 90;
            case 233 -> 42;
            case 234 -> 65;
            case 235 -> 69;
            case 236 -> 6;
            case 237 -> 114;
            case 238 -> 33;
            case 239 -> 172;
            case 240 -> 113;
            case 241 -> 253;
            case 242 -> 43;
            case 243 -> 161;
            case 244 -> 101;
            case 245 -> 229;
            case 246 -> 89;
            case 247 -> 41;
            case 248 -> 71;
            case 249 -> 245;
            case 250 -> 156;
            case 251 -> 230;
            case 252 -> 158;
            case 253 -> 126;
            case 254 -> 208;
            default -> 233;
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

      @NotNull
      public final llllllllIllIIlIIllIlIIlIlIIIlIIIIlllIIlIlIIllIIIlIIIIIIlllllIIIIlIllllllIIIIllIIlIIll a() {
         return llllllllIllIIlIIllIlIIlIlIIIlIIIIlllIIlIlIIllIIIlIIIIIIlllllIIIIlIllllllIIIIllIIlIIll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      }
   }
      public static final me.octo.client.llllllllIllIIlIIllIlIIlIlIIIlIIIIlllIIlIlIIllIIIlIIIIIIlllllIIIIlIllllllIIIIllIIlIIll ag() {
         return llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      }
}
