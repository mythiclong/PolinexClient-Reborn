package me.octo.client.events.impl;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public final class llllIlIIIlllIIlIIIlIIlIIllIlIlIlllIIIIIIIIlIlIIllIIlllIIIlIllIIIIllIllllIIIIIIIllIllI
   extends me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llllIlIIIlllIIlIIIlIIlIIllIlIlIlllIIIIIIIIlIlIIllIIlllIIIlIllIIIIllIllllIIIIIIIllIllI(Object... px) {
           this((Entity)null, (Level)null); // PX-FIX: 委托主构造器（final 字段初始化）
        }

   @Nullable
   private final Entity IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @Nullable
   private final Level IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;

   public llllIlIIIlllIIlIIIlIIlIIllIlIlIlllIIIIIIIIlIlIIllIIlllIIIlIllIIIIllIllllIIIIIIIllIllI(@Nullable Entity var1, @Nullable Level var2) {
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var2;
   }

   @Nullable
   public final Entity k() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @Nullable
   public final Level l() {
      return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   public llllIlIIIlllIIlIIIlIIlIIllIlIlIlllIIIIIIIIlIlIIllIIlllIIIlIllIIIIllIllllIIIIIIIllIllI() {
      this(null, null, 3, null);
   }
      public llllIlIIIlllIIlIIIlIIlIIllIlIlIlllIIIIIIIIlIlIIllIIlllIIIlIllIIIIllIllllIIIIIIIllIllI(net.minecraft.world.entity.Entity p0, net.minecraft.world.level.Level p1, int mask, kotlin.jvm.internal.DefaultConstructorMarker marker) {
         this((mask & 1) != 0 ? null : p0, (mask & 2) != 0 ? null : p1);
      }
}
