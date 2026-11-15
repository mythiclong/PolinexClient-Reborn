package me.octo.client.mixin.entity;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import java.util.function.Predicate;
import me.octo.client.IIIIllIllIIlllIIIlllIIllllIllIlllIIllIlIlllIlIllIIIllllIIlllIlIIIIIlIIlIllIIIlIllllll;
import me.octo.client.IllIlllIlllIIllIlIlIIIIlIlIIlllIllIIlIIlllllIIlIIlIIllllIIIllllIlllIIlIIlIIlIIIIIIIII;
import me.octo.client.lIlIllllIllIIlIIIIIIlIIIlllllIIIIllIIIIIIllllIIIIIIlllIlIllIIIIIIIIllllIIlllllIllIlII;
import me.octo.client.llIIIllIlllIlIIlllIlIllIlIIIIIllIIIIlIllIIllIlIIIIIIlIlIIIIllIlIIIIIlIIIllIlIlIlllllI;
import me.octo.client.lllIlIlIllIllIllIIllllIllIlIIlllllllIIlIIlIlIlIIIlIllIllIlIIIlIllllllIIllIIIllIlIlIll;
import me.octo.client.utils.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII;
import me.octo.client.utils.llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.player.RemotePlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.monster.Endermite;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin({LocalPlayer.class})
public class EntityRaycastMixin {
   @WrapOperation(
      method = {"pick(Lnet/minecraft/world/entity/Entity;DDF)Lnet/minecraft/world/phys/HitResult;"},
      require = 0,
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/world/entity/projectile/ProjectileUtil;getEntityHitResult(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;D)Lnet/minecraft/world/phys/EntityHitResult;"
      )}
   )
   private static EntityHitResult modifyEntityRaycast(
      Entity var0, Vec3 var1, Vec3 var2, AABB var3, Predicate<Entity> var4, double var5, Operation<EntityHitResult> var7
   ) {
      llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      boolean var8 = lIlIllllIllIIlIIIIIIlIIIlllllIIIIllIIIIIIllllIIIIIIlllIlIllIIIIIIIIllllIIlllllIllIlII.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
            .ae()
         || lIlIllllIllIIlIIIIIIlIIIlllllIIIIllIIIIIIllllIIIIIIlllIlIllIIIIIIIIllllIIlllllIllIlII.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      boolean var9 = lIlIllllIllIIlIIIIIIlIIIlllllIIIIllIIIIIIllllIIIIIIlllIlIllIIIIIIIIllllIIlllllIllIlII.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      boolean var10 = IllIlllIlllIIllIlIlIIIIlIlIIlllIllIIlIIlllllIIlIIlIIllllIIIllllIlllIIlIIlIIlIIIIIIIII.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
         .ae();
      boolean var11 = IIIIllIllIIlllIIIlllIIllllIllIlllIIllIlIlllIlIllIIIllllIIlllIlIIIIIlIIlIllIIIlIllllll.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
         .ae();
      boolean var12 = llIIIllIlllIlIIlllIlIllIlIIIIIllIIIIlIllIIllIlIIIIIIlIlIIIIllIlIIIIIlIIIllIlIlIlllllI.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
         .ae();
      boolean var13 = lllIlIlIllIllIllIIllllIllIlIIlllllllIIlIIlIlIlIIIlIllIllIlIIIlIllllllIIllIIIllIlIlIll.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
         .ae();
      if (!var8 && !var10 && !var11 && !var12 && !var13) {
         return (EntityHitResult)var7.call(new Object[]{var0, var1, var2, var3, var4, var5});
      } else {
         Predicate var14 = new Predicate<Entity>() {
            public boolean test(Entity var7x) {
               return lambda$modifyEntityRaycast$0(var4, var10, var12, var13, var11, var8, var9, var7x);
            }
         };
         return (EntityHitResult)var7.call(new Object[]{var0, var1, var2, var3, var14, var5});
      }
   }
   private static boolean lambda$modifyEntityRaycast$0(
      Predicate var0,
      boolean var1,
      boolean var2,
      boolean var3,
      boolean var4,
      boolean var5,
      boolean var6,
      Entity var7
   ) {
      // PX-FIX PhaseA-RESe: exact jar lambda body, transcribed from javap
      //   descriptor (Ljava/util/function/Predicate;ZZZZZZLnet/minecraft/world/entity/Entity;)Z
      if (!var0.test(var7)) {
         return false;
      } else if (var1 && var7 instanceof Endermite) {
         return false;
      } else if (var2 && var7 instanceof ArmorStand && llIIIllIlllIlIIlllIlIllIlIIIIIllIIIIlIllIIllIlIIIIIIlIlIIIIllIlIIIIIlIIIllIlIlIlllllI.a(var7.getId())) {
         return false;
      } else if (var3 && var7 instanceof ArmorStand && lllIlIlIllIllIllIIllllIllIlIIlllllllIIlIIlIlIlIIIlIllIllIlIIIlIllllllIIllIIIllIlIlIll.a(var7.getId())) {
         return false;
      } else {
         if (var4 && var7 instanceof RemotePlayer) {
            String var8 = ((me.octo.client.PXDyn)(Object)(((me.octo.client.PXDyn)(Object)var7).getName())).getString();
            if (var8.contains("Golden Goblin") || var8.contains("Diamond Goblin")) {
               return false;
            }
         }
         if (!var5) {
            return true;
         } else if (var6 && var7 instanceof RemotePlayer) {
            RemotePlayer var9 = (RemotePlayer)var7;
            boolean var10 = lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g().containsKey(var9.getUUID());
            return !var10;
         } else {
            return false;
         }
      }
   }
}
