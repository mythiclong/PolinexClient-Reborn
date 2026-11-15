package me.octo.client;

import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import java.util.Base64;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.RemotePlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class llllIIIlIIlIIIllllIllIIllIIIllIlIIllIIIIlllIIlllIlIIIIIIIlllIIllIlIllIlIlIIIIlIIlIlll
   implements lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl {
   private static String[] a;
   private static String[] b;

   @NotNull
   @Override
   public IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI a() {
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      short var10001 = 6258;
      short var10002 = -11575;
      var10002 = 6226;
      short var10003 = -28177;
      var10000 = var10000.a("world", "World debug and position commands");
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var6 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      var10002 = 6225;
      var10003 = 9227;
      var10003 = 6234;
      short var10004 = -31917;
      var10000 = var10000.a(
         var6.a("debug", "Debug world entities").a(llllIIIlIIlIIIllllIllIIllIIIllIlIIllIIIIlllIIlllIlIIIIIIIlllIIllIlIllIlIlIIIIlIIlIlll::a).a()
      );
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var7 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      var10002 = 6215;
      var10003 = -26950;
      var10003 = 6233;
      var10004 = -16611;
      var10000 = var10000.a(
         var7.a("pos", "Get BlockPos below player").a(llllIIIlIIlIIIllllIllIIllIIIllIlIIllIIIIlllIIlllIlIIIIIIIlllIIllIlIllIlIlIIIIlIIlIlll::b).a()
      );
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var8 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      var10002 = 6224;
      var10003 = -23079;
      var10003 = 6227;
      var10004 = -5669;
      var10000 = var10000.a(
         var8.a("ppos", "Get plain position below player").a(llllIIIlIIlIIIllllIllIIllIIIllIlIIllIIIIlllIIlllIlIIIIIIIlllIIllIlIllIlIlIIIIlIIlIlll::c).a()
      );
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var9 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      var10002 = 6271;
      var10003 = -12533;
      var10003 = 6214;
      var10004 = 7319;
      var10000 = var10000.a(
         var9.a("3pos", "Get floored Vec3 position below player")
            .a(llllIIIlIIlIIIllllIllIIllIIIllIlIIllIIIIlllIIlllIlIIIIIIIlllIIllIlIllIlIlIIIIlIIlIlll::d)
            .a()
      );
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      var10002 = 6208;
      var10003 = 996;
      var10003 = 6212;
      var10004 = -4317;
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var11 = var10.a(
         "mouseover", "Gets some data from the entity you are hovering over"
      );
      IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var18 = IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      var10003 = 6264;
      var10004 = 18629;
      return var10000.a(
            var11.a(
                  var18.a("copy")
                     .a(
                        IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                     )
                     .b()
               )
               .a(llllIIIlIIlIIIllllIllIIllIIIllIlIIllIIIIlllIIlllIlIIIIIIIlllIIllIlIllIlIlIIIIlIIlIlll::e)
               .a()
         )
         .a();
   }

   private static final Unit a(llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var0) {
      Entity var10 = null; // PX-FIX
      int var10001 = 6259;
      short var10002 = 4811;
      Intrinsics.checkNotNullParameter(var0, "<unused var>");
      String[] var10000 = IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.c();
      ClientLevel var13 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a()
         .level;
      Intrinsics.checkNotNull(var13);
      Iterator var2 = var13.entitiesForRendering().iterator();
      String[] var1 = var10000;

      while (var2.hasNext()) {
         Entity var3;
         label39: {
            var10000 = (String[])var2.next();
            var10002 = 6209;
            short var10003 = -15990;
            Intrinsics.checkNotNullExpressionValue(var10000, "next(...)");
            var3 = (Entity)(Object)var10000;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("-");
            String var5 = var3.getClass().getSimpleName();
            var10001 = (short)6236;
            var10002 = -29787;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("Class: " + var5);
            String var6 = var3.getName().getString();
            var10001 = (short)6229;
            var10002 = -3988;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("Name: " + var6);
            boolean var7 = var3 instanceof RemotePlayer;
            if (var1 != null) {
               if (var7) {
                  float var8 = ((LivingEntity)var3).getHealth();
                  var10001 = (short)6217;
                  var10002 = 11509;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("Health: " + var8);
                  UUID var9 = ((RemotePlayer)var3).getUUID();
                  var10001 = ((RemotePlayer)var3).getUUID().version();
                  var10002 = 6262;
                  var10003 = 31793;
                  var10003 = 6267;
                  short var10004 = -27667;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
                     "UUID: " + var9 + " | Version: " + var10001
                  );
               }

               var10 = var3;
               if (var1 == null) {
                  break label39;
               }

               var7 = var3 instanceof ArmorStand;
            }

            if (!var7) {
               continue;
            }

            var10 = var3;
         }

         Component var11 = ((ArmorStand)var10).getCustomName();
         String var12 = var11 != null ? var11.getString() : null;
         Vec3 var18 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var3);
         var10002 = 6261;
         short var27 = -15815;
         var27 = 6269;
         short var29 = -26973;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
            "CustomName: " + var12 + ", Pos: " + var18
         );
         if (var1 == null) {
            break;
         }
      }

      return Unit.INSTANCE;
   }

   private static final Unit b(llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var0) {
      short var10001 = 6259;
      int var10002 = 4811;
      Intrinsics.checkNotNullParameter(var0, "<unused var>");
      short var10000 = 6223;
      BlockPos var1 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .s();
      var10001 = 3354;
      var10002 = var1.getX();
      int var3 = var1.getZ();
      int var4 = var1.getY();
      int var5 = var10002;
      short var11 = 6237;
      short var10003 = 10844;
      short var10004 = 6237;
      short var10005 = 10844;
      String var2 = "BlockPos(" + var5 + ", " + var4 + ", " + var3 + ")";
      me.octo.client.utils.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(var2);
      var10001 = 6220;
      var11 = 5492;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("BlockPos below: " + var2);
      var10000 = 6260;
      var10001 = 13636;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("Copied to clipboard!");
      return Unit.INSTANCE;
   }

   private static final Unit c(llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var0) {
      short var10001 = 6263;
      short var10002 = -22715;
      Intrinsics.checkNotNullParameter(var0, "<unused var>");
      BlockPos var1 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .s();
      String var2 = var1.getX() + " " + var1.getY() + " " + var1.getZ();
      me.octo.client.utils.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(var2);
      var10001 = 6257;
      var10002 = -11750;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("Pos below: " + var2);
      short var10000 = 6216;
      var10001 = -19744;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("Copied to clipboard!");
      return Unit.INSTANCE;
   }

   private static final Unit d(llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var0) {
      int var10001 = 6259;
      int var10002 = 4811;
      Intrinsics.checkNotNullParameter(var0, "<unused var>");
      BlockPos var1 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .s();
      int var10000 = var1.getX();
      var10001 = var1.getY();
      var10002 = var1.getZ();
      short var10003 = 6268;
      short var10004 = 30682;
      var10004 = 6270;
      short var10005 = 28780;
      var10005 = 6256;
      short var10006 = -202;
      String var2 = var10000 + ".0, " + var10001 + ".0, " + var10002 + ".0,";
      me.octo.client.utils.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(var2);
      short var5 = 6228;
      short var8 = 10491;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("Pos below: " + var2);
      short var3 = 6260;
      var5 = 13636;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("Copied to clipboard!");
      return Unit.INSTANCE;
   }

   private static final Unit e(llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var0) {
      Object var45 = null; // PX-FIX
      Object var41 = null; // PX-FIX
      String[] var1;
      Entity var34;
      label113: {
         String[] var10000 = IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.c();
         short var10002 = 6235;
         short var10003 = -26608;
         Intrinsics.checkNotNullParameter(var0, "context");
         var1 = var10000;
         if (var1 != null) {
            EntityHitResult var33 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .H();
            if (var33 != null) {
               var34 = var33.getEntity();
               break label113;
            }
         }

         var34 = null;
      }

      Entity var2 = var34;
      var34 = var2;
      if (var1 != null) {
         if (var2 == null) {
            short var53 = 6222;
            short var64 = 7743;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("No entity over your mouse");
            return Unit.INSTANCE;
         }

         var34 = var2;
      }

      label124: {
         if (var1 != null) {
            if (!(var34 instanceof RemotePlayer)) {
               break label124;
            }

            PropertyMap var36 = ((RemotePlayer)var2).getGameProfile().properties();
            short var10001 = 6218;
            short var65 = -3772;
            Collection var37 = var36.get("textures");
            var65 = 6266;
            short var75 = 12438;
            Intrinsics.checkNotNullExpressionValue(var37, "get(...)");
            var34 = (Entity)CollectionsKt.firstOrNull(var37);
         }

         Property var3 = (Property)(Object)var34;
         if (var3 != null) {
            label98: {
               byte[] var38 = Base64.getDecoder().decode(var3.value());
               short var67 = 6221;
               short var76 = 12965;
               Intrinsics.checkNotNullExpressionValue(var38, "decode(...)");
               byte[] var5 = var38;
               String var4 = new String(var5, Charsets.UTF_8);
               var67 = 6231;
               var76 = 24073;
               Regex var32 = new Regex("\"url\"\\s*:\\s*\"http://textures\\.minecraft\\.net/texture/([a-f0-9]+)\"");
               if (var1 != null) {
                  MatchResult var39 = (var32).find( var4, 0);
                  label94:
                  if (var39 != null) {
                     Object var40 = var39.getGroupValues();
                     if (var1 != null) {
                        if (var40 == null) {
                           break label94;
                        }

                        var40 = ((me.octo.client.PXDyn)var40).get(1);
                     }

                     var41 = (String)var40;
                     if (var1 != null) {
                        break label98;
                     }
                  }
               }

               var41 = null;
            }

            String var6 =((String)( var41));
            short var54 = 6210;
            short var69 = -9771;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Entity skin hash: " + var6);
            if (var1 != null && var6 != null) {
               short var42 = 6230;
               boolean var8 = false;
               var54 = -8629;
               llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var9 = var0;
               String var10 = "copy";
               boolean var11 = false;
               Iterable var12 = var0.a().b();
               boolean var13 = false;
               int var14 = 0;

               label80: {
                  for (Object var16 : var12) {
                     int var17 = var14++;
                     if (var1 != null) {
                        int var44 = var17;
                        if (var1 != null) {
                           if (var17 < 0) {
                              CollectionsKt.throwIndexOverflow();
                           }

                           var44 = var17;
                        }

                        IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll var18 = (IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll)var16;
                        int var19 = var44;
                        boolean var20 = false;
                        if (var1 != null && Intrinsics.areEqual(var18.a(), var10) && var19 < var9.b().length) {
                           var34 = (Entity)var9.b()[var19];
                           if (!((Object)var34 instanceof Boolean)) {
                              var34 = null;
                           }

                           var45 = (Boolean)(Object)var34;
                           break label80;
                        }

                        if (var1 != null) {
                           continue;
                        }
                     }
                     break;
                  }

                  var45 = null;
               }

               Boolean var21 =((Boolean)( var45));
               if (var1 != null && Intrinsics.areEqual(var21, true)) {
                  me.octo.client.utils.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a(var6);
                  short var47 = 6239;
                  var54 = 5975;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                     "Copied hash to clipboard"
                  );
               }
            }
         }

         String var48 = ((RemotePlayer)var2).getStringUUID();
         short var57 = 6211;
         short var70 = -24932;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Entity UUID: " + var48);
      }

      BlockPos var31 = new BlockPos((int)Math.floor(var2.getX()), (int)Math.floor(var2.getY() - 0.5), (int)Math.floor(var2.getZ()));
      short var49 = 6219;
      int var58 = var31.getX();
      int var22 = var31.getZ();
      int var23 = var31.getY();
      int var24 = var58;
      short var59 = -25150;
      short var71 = 6265;
      short var78 = -6830;
      short var10004 = 6237;
      short var10005 = 10844;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
         "Pos below: BlockPos(" + var24 + ", " + var23 + ", " + var22 + ")"
      );
      float var50 = var2.getYRot();
      var59 = 6232;
      var71 = 32268;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Yaw: " + var50);
      float var51 = var2.getXRot();
      var59 = 6213;
      var71 = 31661;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Pitch: " + var51);
      short var52 = 6238;
      double var62 = var2.getX();
      double var25 = var2.getZ();
      double var27 = var2.getY();
      double var29 = var62;
      var59 = 18431;
      var71 = 6237;
      var78 = 10844;
      var10004 = 6237;
      var10005 = 10844;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
         "Pos: Vec3d(" + var29 + ", " + var27 + ", " + var25 + ")"
      );
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[48];
      int var3 = 0;
      String var2 = "N¬$[Ïz)Ù½\u009b·\u001eÖ±\u0016\n<\u0002FWà³1é\u000b¸A\u0088µ|¬÷|ÙRc\u0002cS\u0007s¬\u0092\"<R\u0083\u0007¸2À\u0095\u008e\u0001U\u0014\u0090O\npXÄÎÅïà\u0080\u008d¬Â>Oÿá0:\u0019T\u0086ç\u001c\u0014úÞËï\u0090±k¥+ãúlì\u007fE\u009e¡\u0096ªÓ\u0005_ÿX\u00adâA\u009c\u009e1Ah¤!\u007fÞjðà\u0010\"\u0006\u0088üô\u009eýT\u0006ÕË\u009d¡<B\u0004¦\u008cso~\u0014b1 :²¢ÖÌÐÉ±Æ\u0085\\¤Þ\u009cí\"\u001d1¨Ð\u001b¸<ó\u008b·À\u0004\u0083,¹[\u0006Iìu\u0090\u0004Ê\u000b\u008bOînò½%\u0007ïîa\u001f!?I+ó\u001cX\u001dõqH55tÙ~\u0018ÀñèFI³\tñ\u0098G5fS^!S\u0087\u0013;j\u0097ø¥H¾e|wüÑÁ\u0014Vß\u0010«9=» ç~§6\u0088Þ\u001d[\u0005¸¬+\f|\u0004¿ýP\u0097\tø%Ì\u0003 \u000eTþý\u0019\u0082\u008cAS2æµDVäÖ\u009e\f ~\u009c2\u0095æx´Rþ\rD\u000bM÷\u0094}©yÌÞG¨\u000f\u0010\u000eM\u0012\u000eû¯/Ê\u009a\u00907\u0000q¯\u0080\u0091\u0014.BZÏd\u0089÷\u0081µ>*¨<I\u0013\u001d\u008bï\bf\bø\b+\u00997\u008aa\b\b=)1¥O\f\u0010Ò\u0014±ýÛq0?ÖmLÁM þ¬ïY\u0004þùó\u0003|Q4&{Ð\u0002Ö\u008c£mì\u0080Ìm \"|\u00ad¨,\u0015\u009e\u009e\u0001¬Ð¶\u0015$Rü\u001eäã\u001bÅ\u001a\u009eÍ&+\u00077r~L\r\u008dÝ4/w\u0088q\u009bq\u0001H\u001a_ËþÔÊV¯*\u0015D1\u0005|â|Õ\u00956A^È§\u0013ïpf¢GÊÑ¨@?ùð)iV\u009f\u0017·Ø\u008a\raF\u0003'¾è4\b*\u0001Û*¦\u0012.\u0007ê\u000f\u0083í\u0093\u008eà\u0013QVÐ¶\u001a.Ò¥\tÂ\u009e5K©\u008c\u000fBþ\t\u009aµPbä\u000f\u001a\u0010T\u00048¹\u008b\u001f\u0004»¯\u0006Æ\u0007rE\u0001ÆYQ/\u0004\u0092\u001d#\u0090\f³\u001bÄã\u0089£²7ùz¢\u009c\bEïá9¸\u0015ëv\u0002\u0098\u000f\u0004¥\"}\u009a\f\u0006/£nôBÞ·\u0098\u0005ü\u0083\u0006`5\f8\u008bÚ\f\u0012³¬ü·9\u0003\u0090W\u008c5(\u0014ÚÉ¶÷\u009dïcwú\u0082\u009bH$¡´øoÊ\u0094u\fÐ^y@¯\u0087µ\u000fõ\u0012Qa\u0005\u008e\u0091\u008cù\u0099";
      int var4 = "N¬$[Ïz)Ù½\u009b·\u001eÖ±\u0016\n<\u0002FWà³1é\u000b¸A\u0088µ|¬÷|ÙRc\u0002cS\u0007s¬\u0092\"<R\u0083\u0007¸2À\u0095\u008e\u0001U\u0014\u0090O\npXÄÎÅïà\u0080\u008d¬Â>Oÿá0:\u0019T\u0086ç\u001c\u0014úÞËï\u0090±k¥+ãúlì\u007fE\u009e¡\u0096ªÓ\u0005_ÿX\u00adâA\u009c\u009e1Ah¤!\u007fÞjðà\u0010\"\u0006\u0088üô\u009eýT\u0006ÕË\u009d¡<B\u0004¦\u008cso~\u0014b1 :²¢ÖÌÐÉ±Æ\u0085\\¤Þ\u009cí\"\u001d1¨Ð\u001b¸<ó\u008b·À\u0004\u0083,¹[\u0006Iìu\u0090\u0004Ê\u000b\u008bOînò½%\u0007ïîa\u001f!?I+ó\u001cX\u001dõqH55tÙ~\u0018ÀñèFI³\tñ\u0098G5fS^!S\u0087\u0013;j\u0097ø¥H¾e|wüÑÁ\u0014Vß\u0010«9=» ç~§6\u0088Þ\u001d[\u0005¸¬+\f|\u0004¿ýP\u0097\tø%Ì\u0003 \u000eTþý\u0019\u0082\u008cAS2æµDVäÖ\u009e\f ~\u009c2\u0095æx´Rþ\rD\u000bM÷\u0094}©yÌÞG¨\u000f\u0010\u000eM\u0012\u000eû¯/Ê\u009a\u00907\u0000q¯\u0080\u0091\u0014.BZÏd\u0089÷\u0081µ>*¨<I\u0013\u001d\u008bï\bf\bø\b+\u00997\u008aa\b\b=)1¥O\f\u0010Ò\u0014±ýÛq0?ÖmLÁM þ¬ïY\u0004þùó\u0003|Q4&{Ð\u0002Ö\u008c£mì\u0080Ìm \"|\u00ad¨,\u0015\u009e\u009e\u0001¬Ð¶\u0015$Rü\u001eäã\u001bÅ\u001a\u009eÍ&+\u00077r~L\r\u008dÝ4/w\u0088q\u009bq\u0001H\u001a_ËþÔÊV¯*\u0015D1\u0005|â|Õ\u00956A^È§\u0013ïpf¢GÊÑ¨@?ùð)iV\u009f\u0017·Ø\u008a\raF\u0003'¾è4\b*\u0001Û*¦\u0012.\u0007ê\u000f\u0083í\u0093\u008eà\u0013QVÐ¶\u001a.Ò¥\tÂ\u009e5K©\u008c\u000fBþ\t\u009aµPbä\u000f\u001a\u0010T\u00048¹\u008b\u001f\u0004»¯\u0006Æ\u0007rE\u0001ÆYQ/\u0004\u0092\u001d#\u0090\f³\u001bÄã\u0089£²7ùz¢\u009c\bEïá9¸\u0015ëv\u0002\u0098\u000f\u0004¥\"}\u009a\f\u0006/£nôBÞ·\u0098\u0005ü\u0083\u0006`5\f8\u008bÚ\f\u0012³¬ü·9\u0003\u0090W\u008c5(\u0014ÚÉ¶÷\u009dïcwú\u0082\u009bH$¡´øoÊ\u0094u\fÐ^y@¯\u0087µ\u000fõ\u0012Qa\u0005\u008e\u0091\u008cù\u0099"
         .length();
      char var1 = 24;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 126;
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
                     case 1 -> 77;
                     case 2 -> 111;
                     case 3 -> 61;
                     case 4 -> 12;
                     case 5 -> 39;
                     default -> 9;
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
                     b = new String[48];
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

                  var2 = "ó\nAf§\u001c/\u0093\u000eÜý\u0003p7ß";
                  var4 = "ó\nAf§\u001c/\u0093\u000eÜý\u0003p7ß".length();
                  var1 = 11;
                  var8 = -1;
            }

            var10000 = 90;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 6239) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 173;
            case 1 -> 8;
            case 2 -> 139;
            case 3 -> 31;
            case 4 -> 88;
            case 5 -> 213;
            case 6 -> 4;
            case 7 -> 198;
            case 8 -> 177;
            case 9 -> 143;
            case 10 -> 83;
            case 11 -> 146;
            case 12 -> 186;
            case 13 -> 122;
            case 14 -> 59;
            case 15 -> 68;
            case 16 -> 18;
            case 17 -> 243;
            case 18 -> 206;
            case 19 -> 127;
            case 20 -> 54;
            case 21 -> 216;
            case 22 -> 215;
            case 23 -> 241;
            case 24 -> 71;
            case 25 -> 52;
            case 26 -> 254;
            case 27 -> 0;
            case 28 -> 128;
            case 29 -> 118;
            case 30 -> 29;
            case 31 -> 192;
            case 32 -> 2;
            case 33 -> 12;
            case 34 -> 153;
            case 35 -> 132;
            case 36 -> 170;
            case 37 -> 141;
            case 38 -> 115;
            case 39 -> 158;
            case 40 -> 221;
            case 41 -> 101;
            case 42 -> 93;
            case 43 -> 87;
            case 44 -> 108;
            case 45 -> 38;
            case 46 -> 73;
            case 47 -> 205;
            case 48 -> 48;
            case 49 -> 40;
            case 50 -> 225;
            case 51 -> 3;
            case 52 -> 103;
            case 53 -> 33;
            case 54 -> 175;
            case 55 -> 238;
            case 56 -> 75;
            case 57 -> 223;
            case 58 -> 233;
            case 59 -> 62;
            case 60 -> 86;
            case 61 -> 185;
            case 62 -> 237;
            case 63 -> 53;
            case 64 -> 245;
            case 65 -> 137;
            case 66 -> 144;
            case 67 -> 248;
            case 68 -> 217;
            case 69 -> 180;
            case 70 -> 150;
            case 71 -> 164;
            case 72 -> 32;
            case 73 -> 195;
            case 74 -> 120;
            case 75 -> 168;
            case 76 -> 125;
            case 77 -> 230;
            case 78 -> 152;
            case 79 -> 64;
            case 80 -> 211;
            case 81 -> 136;
            case 82 -> 148;
            case 83 -> 80;
            case 84 -> 142;
            case 85 -> 47;
            case 86 -> 246;
            case 87 -> 224;
            case 88 -> 66;
            case 89 -> 189;
            case 90 -> 156;
            case 91 -> 171;
            case 92 -> 131;
            case 93 -> 41;
            case 94 -> 234;
            case 95 -> 85;
            case 96 -> 1;
            case 97 -> 100;
            case 98 -> 209;
            case 99 -> 247;
            case 100 -> 91;
            case 101 -> 14;
            case 102 -> 135;
            case 103 -> 226;
            case 104 -> 81;
            case 105 -> 239;
            case 106 -> 46;
            case 107 -> 162;
            case 108 -> 154;
            case 109 -> 188;
            case 110 -> 182;
            case 111 -> 69;
            case 112 -> 145;
            case 113 -> 214;
            case 114 -> 116;
            case 115 -> 39;
            case 116 -> 50;
            case 117 -> 49;
            case 118 -> 36;
            case 119 -> 163;
            case 120 -> 119;
            case 121 -> 28;
            case 122 -> 229;
            case 123 -> 244;
            case 124 -> 16;
            case 125 -> 61;
            case 126 -> 179;
            case 127 -> 55;
            case 128 -> 27;
            case 129 -> 45;
            case 130 -> 231;
            case 131 -> 240;
            case 132 -> 98;
            case 133 -> 42;
            case 134 -> 196;
            case 135 -> 114;
            case 136 -> 67;
            case 137 -> 90;
            case 138 -> 242;
            case 139 -> 197;
            case 140 -> 17;
            case 141 -> 57;
            case 142 -> 63;
            case 143 -> 111;
            case 144 -> 167;
            case 145 -> 25;
            case 146 -> 252;
            case 147 -> 109;
            case 148 -> 56;
            case 149 -> 51;
            case 150 -> 219;
            case 151 -> 218;
            case 152 -> 202;
            case 153 -> 10;
            case 154 -> 130;
            case 155 -> 178;
            case 156 -> 253;
            case 157 -> 60;
            case 158 -> 184;
            case 159 -> 187;
            case 160 -> 9;
            case 161 -> 134;
            case 162 -> 165;
            case 163 -> 157;
            case 164 -> 82;
            case 165 -> 201;
            case 166 -> 20;
            case 167 -> 26;
            case 168 -> 200;
            case 169 -> 95;
            case 170 -> 6;
            case 171 -> 169;
            case 172 -> 84;
            case 173 -> 106;
            case 174 -> 65;
            case 175 -> 89;
            case 176 -> 113;
            case 177 -> 194;
            case 178 -> 212;
            case 179 -> 5;
            case 180 -> 13;
            case 181 -> 191;
            case 182 -> 21;
            case 183 -> 74;
            case 184 -> 235;
            case 185 -> 176;
            case 186 -> 155;
            case 187 -> 183;
            case 188 -> 232;
            case 189 -> 97;
            case 190 -> 110;
            case 191 -> 78;
            case 192 -> 140;
            case 193 -> 23;
            case 194 -> 15;
            case 195 -> 92;
            case 196 -> 104;
            case 197 -> 147;
            case 198 -> 149;
            case 199 -> 159;
            case 200 -> 124;
            case 201 -> 35;
            case 202 -> 117;
            case 203 -> 102;
            case 204 -> 121;
            case 205 -> 30;
            case 206 -> 251;
            case 207 -> 207;
            case 208 -> 228;
            case 209 -> 107;
            case 210 -> 34;
            case 211 -> 208;
            case 212 -> 22;
            case 213 -> 44;
            case 214 -> 174;
            case 215 -> 199;
            case 216 -> 126;
            case 217 -> 193;
            case 218 -> 43;
            case 219 -> 19;
            case 220 -> 99;
            case 221 -> 166;
            case 222 -> 70;
            case 223 -> 151;
            case 224 -> 181;
            case 225 -> 190;
            case 226 -> 133;
            case 227 -> 79;
            case 228 -> 72;
            case 229 -> 172;
            case 230 -> 76;
            case 231 -> 160;
            case 232 -> 24;
            case 233 -> 220;
            case 234 -> 96;
            case 235 -> 94;
            case 236 -> 123;
            case 237 -> 250;
            case 238 -> 138;
            case 239 -> 227;
            case 240 -> 105;
            case 241 -> 58;
            case 242 -> 203;
            case 243 -> 204;
            case 244 -> 129;
            case 245 -> 161;
            case 246 -> 222;
            case 247 -> 255;
            case 248 -> 11;
            case 249 -> 37;
            case 250 -> 112;
            case 251 -> 236;
            case 252 -> 77;
            case 253 -> 210;
            case 254 -> 7;
            default -> 249;
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
