package me.octo.client;

import com.mojang.authlib.properties.Property;
import java.util.Iterator;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.component.ResolvableProfile;
import net.minecraft.world.phys.AABB;
import org.jetbrains.annotations.NotNull;

public final class IlIIIllIllIIIIIllIIllllIlIIlIIIlIIIIllllIllIlllIllIlIlllIllIllIlIlllllIlllllIlIlIIllI
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static IlIIIllIllIIIIIllIIllllIlIIlIIIlIIIIllllIllIlllIllIlIlllIllIllIlIlllllIlllllIlIlIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @JvmField
   @NotNull
   public static IlIIIllIllIIIIIllIIllllIlIIlIIIlIIIIllllIllIlllIllIlIlllIllIllIlIlllllIlllllIlIlIIllI lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private static String lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static String[] f;
   private static String[] g;

   private IlIIIllIllIIIIIllIIllllIlIIlIIIlIIIIllllIllIlllIllIlIlllIllIllIlIlllllIlllllIlIlIIllI() {
      short var10001 = -8890;
      short var10002 = -790;
      var10002 = -8885;
      short var10003 = 1291;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      short var10004 = -8883;
      short var10005 = -16341;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         lIlIllIIlIIllIlIllllllllllIlIIlIIllIlIIIlIIlllIllIllIIlIIIlIIIlIlIllIlllIIllIIlIlllII.a()
      };
      super("Fairy Soul ESP", "Shows Fairy Soul locations", var3, "ESP", var1);
   }

   @SubscribeEvent(
      priority = EventPriority.HIGH
   )
   public final void a(@NotNull me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var1) {
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      short var10002 = -8882;
      short var10003 = -19606;
      Intrinsics.checkNotNullParameter(var1, "event");
      String var2 = var10000;
      if (var2 == null) {
         ClientLevel var14 = this.ap().level;
         if (var14 != null) {
            ClientLevel var3 = var14;
            int var4 = new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
                  ((me.octo.client.PXDyn)(Object)(lIlIllIIlIIllIlIllllllllllIlIIlIIllIlIIIlIIlllIllIllIIlIIIlIIIlIlIllIlllIIllIIlIlllII.a())).j()
               )
               .o();
            Iterator var5 = var3.entitiesForRendering().iterator();

            label31:
            while (true) {
               boolean var15 = var5.hasNext();

               Entity var6;
               do {
                  if (!var15) {
                     return;
                  }

                  var10000 = (String)var5.next();
                  var10002 = -8894;
                  var10003 = 3720;
                  Intrinsics.checkNotNullExpressionValue(var10000, "next(...)");
                  var6 = (Entity)(Object)var10000;
                  var15 = var6 instanceof ArmorStand;
                  if (var2 == null) {
                     if (!var15) {
                        continue label31;
                     }

                     var15 = this.a((ArmorStand)var6);
                  }
               } while (var2 != null);

               if (var15) {
                  double var7 = ((ArmorStand)var6).getX();
                  double var9 = ((ArmorStand)var6).getY();
                  double var11 = ((ArmorStand)var6).getZ();
                  AABB var13 = new AABB(var7 - 0.5, var9 + 1.5, var11 - 0.5, var7 + 0.5, var9 + 2.5, var11 + 0.5);
                  IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a(
                     var13,
                     null,
                     new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(var4),
                     1.5F,
                     null,
                     null,
                     0.0F,
                     false,
                     0.0F);
                  if (var2 != null) {
                     return;
                  }
               }
            }
         }
      }
   }

   private final boolean a(ArmorStand var1) {
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      ItemStack var10001 = var1.getItemBySlot(EquipmentSlot.HEAD);
      short var10003 = -8889;
      short var10004 = -15248;
      Intrinsics.checkNotNullExpressionValue(var10001, "getItemBySlot(...)");
      ItemStack var3 = var10001;
      String var2 = var10000;
      boolean var13 = var3.isEmpty();
      if (var2 == null) {
         label64:
         if (!var13) {
            var10000 = String.valueOf(var3.getItem());
            if (var2 == null) {
               if (!Intrinsics.areEqual(var10000, Items.PLAYER_HEAD)) {
                  break label64;
               }

               var10000 = (String)(Object)(var3.get(DataComponents.PROFILE));
            }

            ResolvableProfile var4 = (ResolvableProfile)(Object)var10000;
            var10000 = String.valueOf(var4);
            if (var2 == null) {
               if (var4 != null) {
                  label51:
                  for (Property var6 : var4.partialProfile().properties().values()) {
                     var10000 = var6.name();
                     short var27 = -8875;
                     short var10002 = -26165;
                     boolean var17 = Intrinsics.areEqual(var10000, "textures");

                     do {
                        if (var2 == null) {
                           if (!var17) {
                              continue label51;
                           }

                           var10000 = var6.value();
                           short var28 = -8892;
                           var10002 = 18279;
                           var17 = Intrinsics.areEqual(
                              var10000,
                              "eyJ0aW1lc3RhbXAiOjE1ODY2NjcxNjgzNzksInByb2ZpbGVJZCI6ImJlY2RkYjI4YTJjODQ5YjRhOWIwOTIyYTU4MDUxNDIwIiwicHJvZmlsZU5hbWUiOiJTdFR2Iiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yOTllYTEyMGJkODNkMGM4MWEzYzQ2MjdmNWJjZTFiMTJmYjAzYmNiNTc3NzljNjNkY2M3N2UzZjRhZThhNzkzIn19fQ=="
                           );
                        }

                        if (!var17) {
                           continue label51;
                        }

                        var17 = true;
                     } while (var2 != null);

                     return true;
                  }
               }

               var10000 = (String)(Object)(var3.get(DataComponents.CUSTOM_DATA));
            }

            CustomData var19 = (CustomData)(Object)var10000;
            if ((CustomData)(Object)var10000 == null) {
               return false;
            }

            CustomData var11 = var19;
            CompoundTag var20 = var11.copyTag();
            short var35 = -8893;
            var10003 = -27830;
            Intrinsics.checkNotNullExpressionValue(var20, "copyTag(...)");
            CompoundTag var12 = var20;
            short var29 = -8895;
            var35 = -27253;
            CompoundTag var21 = var12.getCompoundOrEmpty("SkullOwner");
            var35 = -8887;
            var10003 = 30932;
            Intrinsics.checkNotNullExpressionValue(var21, "getCompoundOrEmpty(...)");
            CompoundTag var7 = var21;
            short var30 = -8884;
            var35 = 15695;
            CompoundTag var22 = var7.getCompoundOrEmpty("Properties");
            var35 = -8876;
            var10003 = -27298;
            Intrinsics.checkNotNullExpressionValue(var22, "getCompoundOrEmpty(...)");
            CompoundTag var8 = var22;
            short var31 = -8881;
            var35 = 24523;
            ListTag var23 = var8.getListOrEmpty("textures");
            var35 = -8888;
            var10003 = 32144;
            Intrinsics.checkNotNullExpressionValue(var23, "getListOrEmpty(...)");
            ListTag var9 = var23;
            ListTag var24 = var9;
            if (var2 == null) {
               if (var9.isEmpty()) {
                  return false;
               }

               var24 = var9;
            }

            CompoundTag var25 = var24.getCompoundOrEmpty(0);
            var35 = -8876;
            var10003 = -27298;
            Intrinsics.checkNotNullExpressionValue(var25, "getCompoundOrEmpty(...)");
            CompoundTag var10 = var25;
            short var32 = -8891;
            var35 = -13991;
            var10000 = var10.getStringOr("Value", "");
            short var33 = -8886;
            var35 = 18902;
            return Intrinsics.areEqual(
               var10000,
               "eyJ0aW1lc3RhbXAiOjE1ODY2NjcxNjgzNzksInByb2ZpbGVJZCI6ImJlY2RkYjI4YTJjODQ5YjRhOWIwOTIyYTU4MDUxNDIwIiwicHJvZmlsZU5hbWUiOiJTdFR2Iiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yOTllYTEyMGJkODNkMGM4MWEzYzQ2MjdmNWJjZTFiMTJmYjAzYmNiNTc3NzljNjNkY2M3N2UzZjRhZThhNzkzIn19fQ=="
            );
         }

         var13 = false;
      }

      return var13;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var22 = null; // PX-FIX
      String[] var5 = new String[18];
      int var3 = 0;
      String var2 = "ì\u0083Â\u0098\u001a)»¯ÀûËbXõ?G\u001dH`D*\u0080y2\u009dx\fÔ\u009bDO[\f\u007féò±ñ\u009aÄ`x#ÈË®!kfvW\u000fM\\Ø£\u001ad¿\u001d\u0096\u0094mÚWa\\¸\u009cð?$\u0019ó#j·$Ú\u0092ú¿ëÔ\u001f[\u0018\u000f\u0091L\u0007f\u0092#\u0012ÿ0\u008bJ\u009foq\u0088BÌÆ'·Ñ\u009eEÀ\u0002éçgl\u009aå\u0018\u0018G7tì\u0017Ñ\f\u001cyÀn\u001fXH'mªTî\u0087\u0092\u0085dh÷\raÙñõÊÑ÷\u0095ç\u0012sßûÉWÈùê¶\u009d\"\u0093ý÷\u008b\u000buõåJÝé6²Ò\u0000\u000f!EÑ9Ç`\u0099ð÷Iªãí³~\u0089\u0094\u0018vâÃ\u000bax\n\"\u0081÷\u0097\n\u008b %\u0017\u0093\u008e\u0089â\u0012ræÇIÛã£%q®q\u001b+'\u001e\u0001\u009b\u0004\u0007\u001e\u0083\u0081.ÚY¥\t%\u0017G\u0094\u0003»à=68I\u0099O´xSý2Ê-Ø9+3\u0085½\b\u0089Úÿ¦«Å,Á\u00adëY}ç\u008foðÃvæ\"\nX³F=ï\u00962Ýö`*\u0082P\u0092ô=%»ÍÌå·B-P)\u0094\u009aË¾Ö\u0093õá\u007fGåö\u0096R\u0099\u0082\u0005\u0091e\u001e\u001ag\u000em'\u0096UÏíx\u00ad\u0080\u0087et\u0080·\u0012{~LÁ'f÷\u001c\u0084\u0006$¶JøÆßÁ·Ŕ\u000eÍ\u009eQ\u0091\u0010Ê\u0088î\u001f\u000eþàf(5ÿ\u0006<\u008d¡¹\b\u0015³\u009cÉH#×X)î1µ;:ÈëãN\u009cæTs=6\u0019\u00848\u000bÆÆe©\u00844\u0080z\u0081.\u0007z¨µ/\u0000q\u0017ÉN\u00037\u0017æö\u000f·Íà\u0018ñ·\u001d\u0094bi(¿¨Âú*°\u0005\u008dÒÅ\u0016VäHùeâ\"â+i\rR²à§»®ç£\u0094?6£òèT\u0084Æ~þ7\u009c§\u0094a9\u0000CN\u0091r?\u0001\u0092\u0016\u008a¹Q¨RÈ\u0084íÿ\u0013P{ªàÈ\u0089+\u0019\u00940a\u008fì\u0005½\u00192\u0017³æâ\u0097¨\u0093µÿ9ëq(\u000f¡\u0014¥\u007fó\u008e\u0082\u0015\u0007ö*f\u008a\u000f®ºü³~{\u0098v\nèlÝ>\u001c3ú\u0087\u000bóV\u00121q\u0005\u0000\u0004\u0089\u0015\u0012h\u009aTV\u0080\u0095Þ·\u009f\u008d\u0016éæIBJ\n\u0017«~\u008bíà\u008bÿ\u0007\u0014É\u0002sjñÂ >\u0093V·8®r¾ÏKÉ}Ùt\u0083°«Ø\u0088O\u0000°y>ü+\u009f©Ó¦{ú\u0007Á\fî\u009d/þ®øäÐ\u0093ª©¡»!µÚÙà'u_òÅ c\fà\u001f£º\u0099øw0}ÇÔò\u0084t\u001cÅK\n«Êå½+BwÛÑv\tw¡é\u0007BoÏsø\fLZ*>O«ÔKü¶Ô4\nµÚ_\u0099,d¼\u0082Ë»\u0003Oñ\u0088\u0005íæÍ\u0084$\b±\u0087hÃ/«ßa\u0013\u0093½Q¼\u0099z\u0087F»÷¨CúëÖÆ\u0005\u0093B\u0017\u0096{ñk\u008bp\u0007ú(o4!GCâ64OtÊ\tÇ Ŕ8ÄXpI4Ñ\f\u008d\u008fbìm$\u0099}É\u000fú¬y\u009d\u0013\u0091Ð\f¥Z®\u0095éaØ8s\u001aâìðg-\f\u008aFþ\u007f\u0087Q²1Íç\u001eA²\u0000W\u0010\u0016\u0093£EËà\u0083&ÆPÏíU\u0087T\u0087\u008aä\u0082õ|¨.øq<LFr¬Ü8®è§ò´ÅäÌÐw<lâá\u0081²\u008e9äOãúÖ®}\u008f?\u0087\u008f»U3\u009eúÙÆw6È>Z\u0086LE\"\u0084 Þý`²C#^¼°\u0097\u0089\u008aì\u009fi\u009c\u0083<i'¢yÁ\u001d\u0010R\u0011¹«÷\u0081Þ\u0089^\u0005>¤Sß\u009e\u009asÞáÏj¬l1x·ò±?Ê#\u000e0\u000b¾®\u0014*ÙlßlöÚÇBÞe\u001b\u001fÄ\u0017á\u0003hc:\u0000¼3´H2\u0080Ó3°¾OÒã\u0005²¥\u0012Ï§¡Ð@\u0084kÒ3°úè}\u008c\u0099rE¥\u00814z¬Ð\u001a\u0084%\u00175'T¼ÿü~\u0003ÿt\u001fU[\u0094°\\ëßl¢ô|Mc© \u0015\u0087£Þ\u001cEo~ñ=sìI¬æ\u009al\u0088y\u009f:1¹I\u008c5ø\u001dC\u008d\u0096jÊÁÇ\u0087¡\u001d\u009bç\\oJ\u0096CÌB\u0015\u0003j\u001a\u008eÜ[\u0007º\u0002\u0088^5(\u00159üè\u008806\u0005\u00adyÒ\u000f½¨\u0013Ä";
      int var4 = "ì\u0083Â\u0098\u001a)»¯ÀûËbXõ?G\u001dH`D*\u0080y2\u009dx\fÔ\u009bDO[\f\u007féò±ñ\u009aÄ`x#ÈË®!kfvW\u000fM\\Ø£\u001ad¿\u001d\u0096\u0094mÚWa\\¸\u009cð?$\u0019ó#j·$Ú\u0092ú¿ëÔ\u001f[\u0018\u000f\u0091L\u0007f\u0092#\u0012ÿ0\u008bJ\u009foq\u0088BÌÆ'·Ñ\u009eEÀ\u0002éçgl\u009aå\u0018\u0018G7tì\u0017Ñ\f\u001cyÀn\u001fXH'mªTî\u0087\u0092\u0085dh÷\raÙñõÊÑ÷\u0095ç\u0012sßûÉWÈùê¶\u009d\"\u0093ý÷\u008b\u000buõåJÝé6²Ò\u0000\u000f!EÑ9Ç`\u0099ð÷Iªãí³~\u0089\u0094\u0018vâÃ\u000bax\n\"\u0081÷\u0097\n\u008b %\u0017\u0093\u008e\u0089â\u0012ræÇIÛã£%q®q\u001b+'\u001e\u0001\u009b\u0004\u0007\u001e\u0083\u0081.ÚY¥\t%\u0017G\u0094\u0003»à=68I\u0099O´xSý2Ê-Ø9+3\u0085½\b\u0089Úÿ¦«Å,Á\u00adëY}ç\u008foðÃvæ\"\nX³F=ï\u00962Ýö`*\u0082P\u0092ô=%»ÍÌå·B-P)\u0094\u009aË¾Ö\u0093õá\u007fGåö\u0096R\u0099\u0082\u0005\u0091e\u001e\u001ag\u000em'\u0096UÏíx\u00ad\u0080\u0087et\u0080·\u0012{~LÁ'f÷\u001c\u0084\u0006$¶JøÆßÁ·Ŕ\u000eÍ\u009eQ\u0091\u0010Ê\u0088î\u001f\u000eþàf(5ÿ\u0006<\u008d¡¹\b\u0015³\u009cÉH#×X)î1µ;:ÈëãN\u009cæTs=6\u0019\u00848\u000bÆÆe©\u00844\u0080z\u0081.\u0007z¨µ/\u0000q\u0017ÉN\u00037\u0017æö\u000f·Íà\u0018ñ·\u001d\u0094bi(¿¨Âú*°\u0005\u008dÒÅ\u0016VäHùeâ\"â+i\rR²à§»®ç£\u0094?6£òèT\u0084Æ~þ7\u009c§\u0094a9\u0000CN\u0091r?\u0001\u0092\u0016\u008a¹Q¨RÈ\u0084íÿ\u0013P{ªàÈ\u0089+\u0019\u00940a\u008fì\u0005½\u00192\u0017³æâ\u0097¨\u0093µÿ9ëq(\u000f¡\u0014¥\u007fó\u008e\u0082\u0015\u0007ö*f\u008a\u000f®ºü³~{\u0098v\nèlÝ>\u001c3ú\u0087\u000bóV\u00121q\u0005\u0000\u0004\u0089\u0015\u0012h\u009aTV\u0080\u0095Þ·\u009f\u008d\u0016éæIBJ\n\u0017«~\u008bíà\u008bÿ\u0007\u0014É\u0002sjñÂ >\u0093V·8®r¾ÏKÉ}Ùt\u0083°«Ø\u0088O\u0000°y>ü+\u009f©Ó¦{ú\u0007Á\fî\u009d/þ®øäÐ\u0093ª©¡»!µÚÙà'u_òÅ c\fà\u001f£º\u0099øw0}ÇÔò\u0084t\u001cÅK\n«Êå½+BwÛÑv\tw¡é\u0007BoÏsø\fLZ*>O«ÔKü¶Ô4\nµÚ_\u0099,d¼\u0082Ë»\u0003Oñ\u0088\u0005íæÍ\u0084$\b±\u0087hÃ/«ßa\u0013\u0093½Q¼\u0099z\u0087F»÷¨CúëÖÆ\u0005\u0093B\u0017\u0096{ñk\u008bp\u0007ú(o4!GCâ64OtÊ\tÇ Ŕ8ÄXpI4Ñ\f\u008d\u008fbìm$\u0099}É\u000fú¬y\u009d\u0013\u0091Ð\f¥Z®\u0095éaØ8s\u001aâìðg-\f\u008aFþ\u007f\u0087Q²1Íç\u001eA²\u0000W\u0010\u0016\u0093£EËà\u0083&ÆPÏíU\u0087T\u0087\u008aä\u0082õ|¨.øq<LFr¬Ü8®è§ò´ÅäÌÐw<lâá\u0081²\u008e9äOãúÖ®}\u008f?\u0087\u008f»U3\u009eúÙÆw6È>Z\u0086LE\"\u0084 Þý`²C#^¼°\u0097\u0089\u008aì\u009fi\u009c\u0083<i'¢yÁ\u001d\u0010R\u0011¹«÷\u0081Þ\u0089^\u0005>¤Sß\u009e\u009asÞáÏj¬l1x·ò±?Ê#\u000e0\u000b¾®\u0014*ÙlßlöÚÇBÞe\u001b\u001fÄ\u0017á\u0003hc:\u0000¼3´H2\u0080Ó3°¾OÒã\u0005²¥\u0012Ï§¡Ð@\u0084kÒ3°úè}\u008c\u0099rE¥\u00814z¬Ð\u001a\u0084%\u00175'T¼ÿü~\u0003ÿt\u001fU[\u0094°\\ëßl¢ô|Mc© \u0015\u0087£Þ\u001cEo~ñ=sìI¬æ\u009al\u0088y\u009f:1¹I\u008c5ø\u001dC\u008d\u0096jÊÁÇ\u0087¡\u001d\u009bç\\oJ\u0096CÌB\u0015\u0003j\u001a\u008eÜ[\u0007º\u0002\u0088^5(\u00159üè\u008806\u0005\u00adyÒ\u000f½¨\u0013Ä"
         .length();
      char var1 = 340;
      int var8 = -1;

      label52:
while (true) {
         short var10000 = 33;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var26 = var10001.toCharArray();
               int var10004 = var26.length;
               int var6 = 0;
               byte var29 = (byte)var10000;
               var22 = var26;
               int var15 = var10004;
               byte var34;
               char[] var38;
               int var10006;
               if (var10004 <= 1) {
                  var38 = var26;
                  var34 = (byte)var10000;
                  var10006 = var6;
               } else {
                  var29 = (byte)var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var38 = var26;
                  var34 = (byte)var10000;
                  var10006 = var6;
               }

               while (true) {
                  var38[var10006] = (char)(var38[var10006] ^ var34 ^ switch (var6 % 7) {
                     case 0 -> 28;
                     case 1 -> 79;
                     case 2 -> 90;
                     case 3 -> 98;
                     case 4 -> 110;
                     case 5 -> 18;
                     default -> 76;
                  });
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var38 = var22;
                     var34 = var29;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var38 = var22;
                     var34 = var29;
                     var10006 = var6;
                  }
               }
            }

            String var31 = new String(var22).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var31;
                  if ((var8 += var1) >= var4) {
                     f = var5;
                     g = new String[18];
                     var10000 = -8896;
                     short var17 = -17609;
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = "eyJ0aW1lc3RhbXAiOjE1ODY2NjcxNjgzNzksInByb2ZpbGVJZCI6ImJlY2RkYjI4YTJjODQ5YjRhOWIwOTIyYTU4MDUxNDIwIiwicHJvZmlsZU5hbWUiOiJTdFR2Iiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yOTllYTEyMGJkODNkMGM4MWEzYzQ2MjdmNWJjZTFiMTJmYjAzYmNiNTc3NzljNjNkY2M3N2UzZjRhZThhNzkzIn19fQ==";
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IlIIIllIllIIIIIllIIllllIlIIlIIIlIIIIllllIllIlllIllIlIlllIllIllIlIlllllIlllllIlIlIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new IlIIIllIllIIIIIllIIllllIlIIlIIIlIIIIllllIllIlllIllIlIlllIllIllIlIlllllIlllllIlIlIIllI();
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

                  var2 = "¿9c\u0094n8\fDþ\u000fY\u009a]\u0083\u0016\u0099\u001d\ræ5ì\u008f+\bÿo\u0016iWIg\u008a";
                  var4 = "¿9c\u0094n8\fDþ\u000fY\u009a]\u0083\u0016\u0099\u001d\ræ5ì\u008f+\bÿo\u0016iWIg\u008a".length();
                  var1 = 23;
                  var8 = -1;
            }

            var10000 = 52;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -8892) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 36;
            case 1 -> 191;
            case 2 -> 55;
            case 3 -> 32;
            case 4 -> 57;
            case 5 -> 118;
            case 6 -> 82;
            case 7 -> 59;
            case 8 -> 154;
            case 9 -> 91;
            case 10 -> 152;
            case 11 -> 201;
            case 12 -> 243;
            case 13 -> 141;
            case 14 -> 42;
            case 15 -> 38;
            case 16 -> 195;
            case 17 -> 208;
            case 18 -> 50;
            case 19 -> 151;
            case 20 -> 12;
            case 21 -> 215;
            case 22 -> 108;
            case 23 -> 62;
            case 24 -> 222;
            case 25 -> 74;
            case 26 -> 117;
            case 27 -> 129;
            case 28 -> 237;
            case 29 -> 120;
            case 30 -> 176;
            case 31 -> 247;
            case 32 -> 194;
            case 33 -> 81;
            case 34 -> 19;
            case 35 -> 124;
            case 36 -> 127;
            case 37 -> 177;
            case 38 -> 75;
            case 39 -> 207;
            case 40 -> 174;
            case 41 -> 196;
            case 42 -> 214;
            case 43 -> 166;
            case 44 -> 93;
            case 45 -> 94;
            case 46 -> 227;
            case 47 -> 115;
            case 48 -> 64;
            case 49 -> 249;
            case 50 -> 86;
            case 51 -> 225;
            case 52 -> 171;
            case 53 -> 241;
            case 54 -> 16;
            case 55 -> 242;
            case 56 -> 80;
            case 57 -> 92;
            case 58 -> 121;
            case 59 -> 24;
            case 60 -> 28;
            case 61 -> 202;
            case 62 -> 246;
            case 63 -> 17;
            case 64 -> 213;
            case 65 -> 41;
            case 66 -> 61;
            case 67 -> 172;
            case 68 -> 143;
            case 69 -> 210;
            case 70 -> 79;
            case 71 -> 140;
            case 72 -> 220;
            case 73 -> 183;
            case 74 -> 100;
            case 75 -> 185;
            case 76 -> 180;
            case 77 -> 130;
            case 78 -> 200;
            case 79 -> 113;
            case 80 -> 212;
            case 81 -> 22;
            case 82 -> 161;
            case 83 -> 73;
            case 84 -> 33;
            case 85 -> 167;
            case 86 -> 67;
            case 87 -> 69;
            case 88 -> 26;
            case 89 -> 229;
            case 90 -> 103;
            case 91 -> 116;
            case 92 -> 173;
            case 93 -> 175;
            case 94 -> 54;
            case 95 -> 14;
            case 96 -> 197;
            case 97 -> 150;
            case 98 -> 147;
            case 99 -> 128;
            case 100 -> 18;
            case 101 -> 136;
            case 102 -> 245;
            case 103 -> 216;
            case 104 -> 137;
            case 105 -> 102;
            case 106 -> 29;
            case 107 -> 51;
            case 108 -> 190;
            case 109 -> 76;
            case 110 -> 248;
            case 111 -> 83;
            case 112 -> 21;
            case 113 -> 56;
            case 114 -> 244;
            case 115 -> 226;
            case 116 -> 9;
            case 117 -> 146;
            case 118 -> 49;
            case 119 -> 204;
            case 120 -> 149;
            case 121 -> 139;
            case 122 -> 155;
            case 123 -> 134;
            case 124 -> 178;
            case 125 -> 254;
            case 126 -> 25;
            case 127 -> 66;
            case 128 -> 63;
            case 129 -> 72;
            case 130 -> 165;
            case 131 -> 65;
            case 132 -> 4;
            case 133 -> 239;
            case 134 -> 240;
            case 135 -> 168;
            case 136 -> 119;
            case 137 -> 31;
            case 138 -> 112;
            case 139 -> 68;
            case 140 -> 211;
            case 141 -> 192;
            case 142 -> 88;
            case 143 -> 85;
            case 144 -> 114;
            case 145 -> 157;
            case 146 -> 188;
            case 147 -> 13;
            case 148 -> 71;
            case 149 -> 252;
            case 150 -> 198;
            case 151 -> 110;
            case 152 -> 0;
            case 153 -> 163;
            case 154 -> 205;
            case 155 -> 125;
            case 156 -> 105;
            case 157 -> 45;
            case 158 -> 23;
            case 159 -> 234;
            case 160 -> 233;
            case 161 -> 232;
            case 162 -> 3;
            case 163 -> 135;
            case 164 -> 203;
            case 165 -> 223;
            case 166 -> 37;
            case 167 -> 84;
            case 168 -> 159;
            case 169 -> 224;
            case 170 -> 235;
            case 171 -> 8;
            case 172 -> 95;
            case 173 -> 122;
            case 174 -> 199;
            case 175 -> 52;
            case 176 -> 101;
            case 177 -> 1;
            case 178 -> 98;
            case 179 -> 43;
            case 180 -> 170;
            case 181 -> 238;
            case 182 -> 27;
            case 183 -> 96;
            case 184 -> 39;
            case 185 -> 70;
            case 186 -> 189;
            case 187 -> 138;
            case 188 -> 228;
            case 189 -> 11;
            case 190 -> 106;
            case 191 -> 58;
            case 192 -> 156;
            case 193 -> 158;
            case 194 -> 209;
            case 195 -> 144;
            case 196 -> 142;
            case 197 -> 15;
            case 198 -> 99;
            case 199 -> 46;
            case 200 -> 182;
            case 201 -> 164;
            case 202 -> 217;
            case 203 -> 111;
            case 204 -> 35;
            case 205 -> 89;
            case 206 -> 123;
            case 207 -> 184;
            case 208 -> 181;
            case 209 -> 179;
            case 210 -> 148;
            case 211 -> 6;
            case 212 -> 2;
            case 213 -> 221;
            case 214 -> 78;
            case 215 -> 40;
            case 216 -> 104;
            case 217 -> 169;
            case 218 -> 7;
            case 219 -> 219;
            case 220 -> 230;
            case 221 -> 90;
            case 222 -> 193;
            case 223 -> 34;
            case 224 -> 133;
            case 225 -> 20;
            case 226 -> 30;
            case 227 -> 253;
            case 228 -> 126;
            case 229 -> 60;
            case 230 -> 218;
            case 231 -> 47;
            case 232 -> 87;
            case 233 -> 162;
            case 234 -> 236;
            case 235 -> 231;
            case 236 -> 53;
            case 237 -> 187;
            case 238 -> 153;
            case 239 -> 255;
            case 240 -> 10;
            case 241 -> 250;
            case 242 -> 251;
            case 243 -> 107;
            case 244 -> 206;
            case 245 -> 97;
            case 246 -> 145;
            case 247 -> 48;
            case 248 -> 77;
            case 249 -> 132;
            case 250 -> 160;
            case 251 -> 109;
            case 252 -> 44;
            case 253 -> 186;
            case 254 -> 5;
            default -> 131;
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
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }
}
