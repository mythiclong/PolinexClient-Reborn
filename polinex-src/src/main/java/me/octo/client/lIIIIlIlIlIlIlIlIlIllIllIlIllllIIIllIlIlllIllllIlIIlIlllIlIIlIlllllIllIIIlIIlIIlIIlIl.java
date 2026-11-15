package me.octo.client;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.decoration.ArmorStand;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.util.Collection;
import java.util.Iterator;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;

public final class lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private final List<IIlIIlIlllllIIlIIIlIIllIIIIIIlIIlIlIIIllIlIlIIIIllllIIIIIIIIlIIIllIlllIlIIllIIllIIIlI> lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @JvmField
   @NotNull
   public static lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static String[] f;
   private static String[] g;

   private lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl() {
      short var10001 = 19878;
      short var10002 = -317;
      var10002 = 19893;
      short var10003 = 8248;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      short var10004 = 19894;
      short var10005 = -12429;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         IIIlIlllIllIIlllIIlIlllIIllllIIIIlIllIIlIIIlIIlIlllIIlllllllIIllllIlllllllIIIIIIlIlII.d(),
         IIIlIlllIllIIlllIIlIlllIIllllIIIIlIllIIlIIIlIIlIlllIIlllllllIIllllIlllllllIIIIIIlIlII.e(),
         IIIlIlllIllIIlllIIlIlllIIllllIIIIlIllIIlIIIlIIlIlllIIlllllllIIllllIlllllllIIIIIIlIlII.f(),
         IIIlIlllIllIIlllIIlIlllIIllllIIIIlIllIIlIIIlIIlIlllIIlllllllIIllllIlllllllIIIIIIlIlII.g(),
         IIIlIlllIllIIlllIIlIlllIIllllIIIIlIllIIlIIIlIIlIlllIIlllllllIIllllIlllllllIIIIIIlIlII.h(),
         IIIlIlllIllIIlllIIlIlllIIllllIIIIlIllIIlIIIlIIlIlllIIlllllllIIllllIlllllllIIIIIIlIlII.i(),
         IIIlIlllIllIIlllIIlIlllIIllllIIIIlIllIIlIIIlIIlIlllIIlllllllIIllllIlllllllIIIIIIlIlII.j(),
         IIIlIlllIllIIlllIIlIlllIIllllIIIIlIllIIlIIIlIIlIlllIIlllllllIIllllIlllllllIIIIIIlIlII.k(),
         IIIlIlllIllIIlllIIlIlllIIllllIIIIlIllIIlIIIlIIlIlllIIlllllllIIllllIlllllllIIIIIIlIlII.l(),
         IIIlIlllIllIIlllIIlIlllIIllllIIIIlIllIIlIIIlIIlIlllIIlllllllIIllllIlllllllIIIIIIlIlII.m(),
         IIIlIlllIllIIlllIIlIlllIIllllIIIIlIllIIlIIIlIIlIlllIIlllllllIIllllIlllllllIIIIIIlIlII.n()
      };
      super("CustomESP", "Custom entity ESP. Use .pn esp to manage entries.", var3, "Misc", var1);
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new ArrayList<>();
   }

   @NotNull
   public final List<IIlIIlIlllllIIlIIIlIIllIIIIIIlIIlIlIIIllIlIlIIIIllllIIIIIIIIlIIIllIlllIlIIllIIllIIIlI> ag() {
      return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   public final void a(
      @NotNull String var1, @Nullable Integer var2, @NotNull IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll var3
   ) {
      short var10001 = 19884;
      short var10002 = 11403;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = 19844;
      var10002 = -31232;
      Intrinsics.checkNotNullParameter(var3, "matchMode");
      CollectionsKt.removeAll(
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl,
         (t) -> a(var1, (IIlIIlIlllllIIlIIIlIIllIIIIIIlIIlIlIIIllIlIlIIIIllllIIIIIIIIlIIIllIlllIlIIllIIllIIIlI)t)
      );
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
         .add(new IIlIIlIlllllIIlIIIlIIllIIIIIIlIIlIlIIIllIlIlIIIIllllIIIIIIIIlIIIllIlllIlIIllIIllIIIlI(var1, var2, var3));
      llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .e();
   }

   public final boolean e(@NotNull String param1) {
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "name");
      int var3 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.size();
      kotlin.collections.CollectionsKt.removeAll(this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl, element -> a(param1, element));
      boolean var4 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.size() != var3;
      if (var4) {
         me.octo.client.llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.e();
      }
      return var4;
   }

   public final void ah() {
      String var1 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      List var2 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      if (var1 != null || !var2.isEmpty()) {
         var2.clear();
      }
      llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.e();
   }

   public void aC() {
      super.aC();
      IIlIlIIIIlIllllIIllIlIllIIllIlllIIIIIllIIIllllllIllIIllIIIlIIIlllllIIIIIlIIllllllIIII.a();
   }

   private final boolean a(String var1, String var2) {
      return StringsKt.contains(
         IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(var1),
         IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(var2),
         true
      );
   }

   private final Pair<IIlIIlIlllllIIlIIIlIIllIIIIIIlIIlIlIIIllIlIlIIIIllllIIIIIIIIlIIIllIlllIlIIllIIllIIIlI, ArmorStand> a(Entity param1) {
      String var2 = me.octo.client.lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      String var3 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(param1.getName().getString());
      String var4;
      if (var2 != null) {
         var4 = null;
      } else {
         net.minecraft.network.chat.Component var10000 = param1.getCustomName();
         if (var10000 != null) {
            String var10001 = var10000.getString();
            var4 = var10001 != null
               ? IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var10001)
               : null;
         } else {
            var4 = null;
         }
      }

      for (IIlIIlIlllllIIlIIIlIIllIIIIIIlIIlIlIIIllIlIlIIIIllllIIIIIIIIlIIIllIlllIlIIllIIllIIIlI var6 : this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
         switch (var6.c()) {
            case IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl:
               if (this.a(var3, var6.a())) {
                  return kotlin.TuplesKt.to(var6, null);
               }
               break;
            case lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII:
               if (this.a(var3, var6.a())) {
                  return kotlin.TuplesKt.to(var6, null);
               }
               if (var4 != null && this.a(var4, var6.a())) {
                  return kotlin.TuplesKt.to(var6, null);
               }
               break;
            default:
               throw new kotlin.NoWhenBranchMatchedException();
         }
      }

      List<IIlIIlIlllllIIlIIIlIIllIIIIIIlIIlIlIIIllIlIlIIIIllllIIIIIIIIlIIIllIlllIlIIllIIllIIIlI> var5 = new ArrayList<>();
      for (IIlIIlIlllllIIlIIIlIIllIIIIIIlIIlIlIIIllIlIlIIIIllllIIIIIIIIlIIIllIlllIlIIllIIllIIIlI var13 : this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
         if (var13.c() == IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
            var5.add(var13);
         }
      }

      if (var5.isEmpty()) {
         return null;
      }

      net.minecraft.client.multiplayer.ClientLevel var14 = this.ap().level;
      if (var14 == null) {
         return null;
      }

      net.minecraft.world.phys.AABB var7 = param1.getBoundingBox().inflate(0.5, 3.0, 0.5);
      for (ArmorStand var9 : var14.getEntitiesOfClass(ArmorStand.class, var7, lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl::a)) {
         net.minecraft.network.chat.Component var10002 = var9.getCustomName();
         String var10 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(
            (var10002 != null ? var10002 : var9.getName()).getString()
         );
         for (IIlIIlIlllllIIlIIIlIIllIIIIIIlIIlIlIIIllIlIlIIIIllllIIIIIIIIlIIIllIlllIlIIllIIllIIIlI var12 : var5) {
            if (this.a(var10, var12.a())) {
               return kotlin.TuplesKt.to(var12, var9);
            }
         }
      }

      return null;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l ()Ljava/lang/String;
      // 003: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // 006: aload 1
      // 007: invokevirtual net/minecraft/world/entity/Entity.getName ()Lnet/minecraft/network/chat/Component;
      // 00a: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 00f: dup
      // 010: sipush 19874
      // 013: sipush 21943
      // 016: pop2
      // 017: ldc "getString(...)"
      // 019: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 01c: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // 01f: astore 3
      // 020: astore 2
      // 021: aload 2
      // 022: ifnonnull 069
      // 025: aload 1
      // 026: invokevirtual net/minecraft/world/entity/Entity.getCustomName ()Lnet/minecraft/network/chat/Component;
      // 029: dup
      // 02a: ifnull 061
      // 02d: goto 034
      // 030: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 033: athrow
      // 034: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 039: aload 2
      // 03a: ifnonnull 05d
      // 03d: goto 044
      // 040: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 043: athrow
      // 044: dup
      // 045: ifnull 061
      // 048: goto 04f
      // 04b: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04e: athrow
      // 04f: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // 052: swap
      // 053: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // 056: goto 05d
      // 059: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05c: athrow
      // 05d: aload 2
      // 05e: ifnull 06a
      // 061: pop
      // 062: goto 069
      // 065: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 068: athrow
      // 069: aconst_null
      // 06a: astore 4
      // 06c: aload 0
      // 06d: getfield me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Ljava/util/List;
      // 070: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 075: astore 5
      // 077: aload 5
      // 079: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 07e: ifeq 111
      // 081: aload 5
      // 083: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 088: checkcast me/octo/client/IIlIIlIlllllIIlIIIlIIllIIIIIIlIIlIlIIIllIlIlIIIIllllIIIIIIIIlIIIllIlllIlIIllIIllIIIlI
      // 08b: astore 6
      // 08d: aload 6
      // 08f: invokevirtual me/octo/client/IIlIIlIlllllIIlIIIlIIllIIIIIIlIIlIlIIIllIlIlIIIIllllIIIIIIIIlIIIllIlllIlIIllIIllIIIlI.c ()Lme/octo/client/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 092: getstatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl [I
      // 095: swap
      // 096: invokevirtual me/octo/client/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.ordinal ()I
      // 099: iaload
      // 09a: aload 2
      // 09b: ifnonnull 0c5
      // 09e: tableswitch 107 1 2 22 53
      // 0b4: aload 0
      // 0b5: aload 3
      // 0b6: aload 6
      // 0b8: invokevirtual me/octo/client/IIlIIlIlllllIIlIIIlIIllIIIIIIlIIlIlIIIllIlIlIIIIllllIIIIIIIIlIIIllIlllIlIIllIIllIIIlI.a ()Ljava/lang/String;
      // 0bb: invokespecial me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/String;Ljava/lang/String;)Z
      // 0be: goto 0c5
      // 0c1: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c4: athrow
      // 0c5: ifeq 077
      // 0c8: aload 6
      // 0ca: aconst_null
      // 0cb: invokestatic kotlin/TuplesKt.to (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
      // 0ce: aload 2
      // 0cf: ifnonnull 088
      // 0d2: areturn
      // 0d3: aload 0
      // 0d4: aload 3
      // 0d5: aload 6
      // 0d7: invokevirtual me/octo/client/IIlIIlIlllllIIlIIIlIIllIIIIIIlIIlIlIIIllIlIlIIIIllllIIIIIIIIlIIIllIlllIlIIllIIllIIIlI.a ()Ljava/lang/String;
      // 0da: invokespecial me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/String;Ljava/lang/String;)Z
      // 0dd: ifeq 0eb
      // 0e0: aload 6
      // 0e2: aconst_null
      // 0e3: invokestatic kotlin/TuplesKt.to (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
      // 0e6: areturn
      // 0e7: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ea: athrow
      // 0eb: aload 4
      // 0ed: ifnull 077
      // 0f0: aload 0
      // 0f1: aload 4
      // 0f3: aload 6
      // 0f5: invokevirtual me/octo/client/IIlIIlIlllllIIlIIIlIIllIIIIIIlIIlIlIIIllIlIlIIIIllllIIIIIIIIlIIIllIlllIlIIllIIllIIIlI.a ()Ljava/lang/String;
      // 0f8: invokespecial me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/String;Ljava/lang/String;)Z
      // 0fb: aload 2
      // 0fc: ifnonnull 07e
      // 0ff: ifeq 077
      // 102: aload 6
      // 104: aconst_null
      // 105: invokestatic kotlin/TuplesKt.to (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
      // 108: areturn
      // 109: new kotlin/NoWhenBranchMatchedException
      // 10c: dup
      // 10d: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
      // 110: athrow
      // 111: aload 0
      // 112: getfield me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Ljava/util/List;
      // 115: checkcast java/lang/Iterable
      // 118: astore 6
      // 11a: bipush 0
      // 11b: istore 7
      // 11d: aload 6
      // 11f: astore 8
      // 121: new java/util/ArrayList
      // 124: dup
      // 125: invokespecial java/util/ArrayList.<init> ()V
      // 128: checkcast java/util/Collection
      // 12b: astore 9
      // 12d: bipush 0
      // 12e: istore 10
      // 130: aload 8
      // 132: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 137: astore 11
      // 139: aload 11
      // 13b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 140: ifeq 17b
      // 143: aload 11
      // 145: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 14a: astore 12
      // 14c: aload 12
      // 14e: checkcast me/octo/client/IIlIIlIlllllIIlIIIlIIllIIIIIIlIIlIlIIIllIlIlIIIIllllIIIIIIIIlIIIllIlllIlIIllIIllIIIlI
      // 151: astore 13
      // 153: bipush 0
      // 154: istore 14
      // 156: aload 13
      // 158: invokevirtual me/octo/client/IIlIIlIlllllIIlIIIlIIllIIIIIIlIIlIlIIIllIlIlIIIIllllIIIIIIIIlIIIllIlllIlIIllIIllIIIlI.c ()Lme/octo/client/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 15b: getstatic me/octo/client/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 15e: if_acmpne 169
      // 161: bipush 1
      // 162: goto 16a
      // 165: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 168: athrow
      // 169: bipush 0
      // 16a: ifeq 139
      // 16d: aload 9
      // 16f: aload 12
      // 171: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 176: pop
      // 177: aload 2
      // 178: ifnull 139
      // 17b: aload 9
      // 17d: checkcast java/util/List
      // 180: nop
      // 181: astore 5
      // 183: aload 5
      // 185: invokeinterface java/util/List.isEmpty ()Z 1
      // 18a: ifeq 193
      // 18d: aconst_null
      // 18e: areturn
      // 18f: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 192: athrow
      // 193: aload 0
      // 194: invokevirtual me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.ap ()Lnet/minecraft/client/Minecraft;
      // 197: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 19a: dup
      // 19b: ifnonnull 1a5
      // 19e: pop
      // 19f: aconst_null
      // 1a0: areturn
      // 1a1: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a4: athrow
      // 1a5: astore 6
      // 1a7: aload 1
      // 1a8: invokevirtual net/minecraft/world/entity/Entity.getBoundingBox ()Lnet/minecraft/world/phys/AABB;
      // 1ab: ldc2_w 0.5
      // 1ae: ldc2_w 3.0
      // 1b1: ldc2_w 0.5
      // 1b4: invokevirtual net/minecraft/world/phys/AABB.inflate (DDD)Lnet/minecraft/world/phys/AABB;
      // 1b7: dup
      // 1b8: sipush 19879
      // 1bb: sipush -13602
      // 1be: pop2
      // 1bf: ldc_w "inflate(...)"
      // 1c2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1c5: astore 7
      // 1c7: aload 6
      // 1c9: ldc_w net/minecraft/world/entity/decoration/ArmorStand
      // 1cc: aload 7
      // 1ce: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Lnet/minecraft/world/entity/decoration/ArmorStand;)Z, (Lnet/minecraft/world/entity/decoration/ArmorStand;)Ljava/lang/Boolean; ]
      // 1d3: invokedynamic test (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z, (Ljava/lang/Object;)Z ]
      // 1d8: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getEntitiesOfClass (Ljava/lang/Class;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;)Ljava/util/List;
      // 1db: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1e0: astore 8
      // 1e2: aload 8
      // 1e4: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1e9: ifeq 299
      // 1ec: aload 8
      // 1ee: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1f3: dup
      // 1f4: sipush 19842
      // 1f7: sipush -32174
      // 1fa: pop2
      // 1fb: ldc_w "next(...)"
      // 1fe: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 201: checkcast net/minecraft/world/entity/decoration/ArmorStand
      // 204: astore 9
      // 206: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // 209: aload 9
      // 20b: invokevirtual net/minecraft/world/entity/decoration/ArmorStand.getCustomName ()Lnet/minecraft/network/chat/Component;
      // 20e: aload 2
      // 20f: ifnonnull 245
      // 212: dup
      // 213: ifnull 238
      // 216: goto 21d
      // 219: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21c: athrow
      // 21d: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 222: dup
      // 223: aload 2
      // 224: ifnonnull 24b
      // 227: goto 22e
      // 22a: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22d: athrow
      // 22e: ifnonnull 257
      // 231: goto 238
      // 234: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 237: athrow
      // 238: pop
      // 239: aload 9
      // 23b: invokevirtual net/minecraft/world/entity/decoration/ArmorStand.getName ()Lnet/minecraft/network/chat/Component;
      // 23e: goto 245
      // 241: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 244: athrow
      // 245: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 24a: dup
      // 24b: sipush 19899
      // 24e: sipush -23188
      // 251: pop2
      // 252: ldc "getString(...)"
      // 254: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 257: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // 25a: astore 10
      // 25c: aload 5
      // 25e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 263: astore 11
      // 265: aload 11
      // 267: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 26c: ifeq 1e2
      // 26f: aload 11
      // 271: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 276: checkcast me/octo/client/IIlIIlIlllllIIlIIIlIIllIIIIIIlIIlIlIIIllIlIlIIIIllllIIIIIIIIlIIIllIlllIlIIllIIllIIIlI
      // 279: astore 12
      // 27b: aload 0
      // 27c: aload 10
      // 27e: aload 12
      // 280: invokevirtual me/octo/client/IIlIIlIlllllIIlIIIlIIllIIIIIIlIIlIlIIIllIlIlIIIIllllIIIIIIIIlIIIllIlllIlIIllIIllIIIlI.a ()Ljava/lang/String;
      // 283: invokespecial me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/String;Ljava/lang/String;)Z
      // 286: aload 2
      // 287: ifnonnull 26c
      // 28a: ifeq 265
      // 28d: aload 12
      // 28f: aload 9
      // 291: invokestatic kotlin/TuplesKt.to (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
      // 294: aload 2
      // 295: ifnonnull 276
      // 298: areturn
      // 299: aconst_null
      // 29a: areturn
   }

   @SubscribeEvent(
      priority = EventPriority.HIGH
   )
   public final void a(@NotNull IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l ()Ljava/lang/String;
      // 003: aload 1
      // 004: sipush 19900
      // 007: sipush 23738
      // 00a: pop2
      // 00b: ldc_w "event"
      // 00e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 011: astore 2
      // 012: aload 0
      // 013: aload 2
      // 014: ifnonnull 02f
      // 017: getfield me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Ljava/util/List;
      // 01a: invokeinterface java/util/List.isEmpty ()Z 1
      // 01f: ifeq 02e
      // 022: goto 029
      // 025: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 028: athrow
      // 029: return
      // 02a: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02d: athrow
      // 02e: aload 0
      // 02f: invokevirtual me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.ap ()Lnet/minecraft/client/Minecraft;
      // 032: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 035: dup
      // 036: ifnonnull 03f
      // 039: pop
      // 03a: return
      // 03b: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03e: athrow
      // 03f: astore 3
      // 040: aload 2
      // 041: ifnonnull 05e
      // 044: aload 0
      // 045: invokevirtual me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.ap ()Lnet/minecraft/client/Minecraft;
      // 048: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 04b: dup
      // 04c: ifnonnull 05f
      // 04f: goto 056
      // 052: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 055: athrow
      // 056: pop
      // 057: goto 05e
      // 05a: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05d: athrow
      // 05e: return
      // 05f: astore 4
      // 061: invokestatic me/octo/client/IIIlIlllIllIIlllIIlIlllIIllllIIIIlIllIIlIIIlIIlIlllIIlllllllIIllllIlllllllIIIIIIlIlII.e ()Lme/octo/client/lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII;
      // 064: invokevirtual me/octo/client/lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII.B ()Ljava/lang/String;
      // 067: astore 5
      // 069: invokestatic me/octo/client/IIIlIlllIllIIlllIIlIlllIIllllIIIIlIllIIlIIIlIIlIlllIIlllllllIIllllIlllllllIIIIIIlIlII.d ()Lme/octo/client/lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII;
      // 06c: sipush 19845
      // 06f: sipush -9732
      // 072: pop2
      // 073: ldc_w "Box"
      // 076: invokevirtual me/octo/client/lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII.c (Ljava/lang/String;)Z
      // 079: istore 6
      // 07b: invokestatic me/octo/client/IIIlIlllIllIIlllIIlIlllIIllllIIIIlIllIIlIIIlIIlIlllIIlllllllIIllllIlllllllIIIIIIlIlII.f ()Lme/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl;
      // 07e: invokevirtual me/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ae ()Z
      // 081: istore 7
      // 083: invokestatic me/octo/client/IIIlIlllIllIIlllIIlIlllIIllllIIIIlIllIIlIIIlIIlIlllIIlllllllIIllllIlllllllIIIIIIlIlII.h ()Lme/octo/client/IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl;
      // 086: invokevirtual me/octo/client/IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl.M ()I
      // 089: i2d
      // 08a: dstore 11
      // 08c: bipush 0
      // 08d: istore 13
      // 08f: dload 11
      // 091: dload 11
      // 093: dmul
      // 094: nop
      // 095: dstore 8
      // 097: aload 1
      // 098: invokevirtual me/octo/client/events/impl/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.m ()F
      // 09b: fstore 10
      // 09d: invokestatic me/octo/client/IIIlIlllIllIIlllIIlIlllIIllllIIIIlIllIIlIIIlIIlIlllIIlllllllIIllllIlllllllIIIIIIlIlII.i ()Lme/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII;
      // 0a0: invokevirtual me/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII.n ()F
      // 0a3: fstore 11
      // 0a5: invokestatic me/octo/client/IIIlIlllIllIIlllIIlIlllIIllllIIIIlIllIIlIIIlIIlIlllIIlllllllIIllllIlllllllIIIIIIlIlII.j ()Lme/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII;
      // 0a8: invokevirtual me/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII.n ()F
      // 0ab: fstore 12
      // 0ad: invokestatic me/octo/client/IIIlIlllIllIIlllIIlIlllIIllllIIIIlIllIIlIIIlIIlIlllIIlllllllIIllllIlllllllIIIIIIlIlII.k ()Lme/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII;
      // 0b0: invokevirtual me/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII.n ()F
      // 0b3: fstore 13
      // 0b5: invokestatic me/octo/client/IIIlIlllIllIIlllIIlIlllIIllllIIIIlIllIIlIIIlIIlIlllIIlllllllIIllllIlllllllIIIIIIlIlII.l ()Lme/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII;
      // 0b8: invokevirtual me/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII.n ()F
      // 0bb: ldc_w 255.0
      // 0be: fmul
      // 0bf: f2i
      // 0c0: bipush 0
      // 0c1: sipush 255
      // 0c4: invokestatic kotlin/ranges/RangesKt.coerceIn (III)I
      // 0c7: istore 14
      // 0c9: aload 3
      // 0ca: invokevirtual net/minecraft/client/multiplayer/ClientLevel.entitiesForRendering ()Ljava/lang/Iterable;
      // 0cd: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 0d2: astore 15
      // 0d4: aload 15
      // 0d6: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0db: ifeq 739
      // 0de: aload 15
      // 0e0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0e5: dup
      // 0e6: sipush 19903
      // 0e9: sipush -24307
      // 0ec: pop2
      // 0ed: ldc_w "next(...)"
      // 0f0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0f3: checkcast net/minecraft/world/entity/Entity
      // 0f6: astore 16
      // 0f8: aload 16
      // 0fa: aload 4
      // 0fc: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 0ff: aload 2
      // 100: ifnonnull 112
      // 103: ifne 0d4
      // 106: goto 10d
      // 109: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10c: athrow
      // 10d: aload 16
      // 10f: invokevirtual net/minecraft/world/entity/Entity.isAlive ()Z
      // 112: aload 2
      // 113: ifnonnull 125
      // 116: ifeq 0d4
      // 119: goto 120
      // 11c: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11f: athrow
      // 120: aload 16
      // 122: instanceof net/minecraft/world/entity/decoration/ArmorStand
      // 125: aload 2
      // 126: ifnonnull 140
      // 129: ifne 0d4
      // 12c: goto 133
      // 12f: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 132: athrow
      // 133: aload 16
      // 135: aload 4
      // 137: checkcast net/minecraft/world/entity/Entity
      // 13a: invokevirtual net/minecraft/world/entity/Entity.distanceToSqr (Lnet/minecraft/world/entity/Entity;)D
      // 13d: dload 8
      // 13f: dcmpl
      // 140: aload 2
      // 141: ifnonnull 0db
      // 144: ifgt 0d4
      // 147: aload 0
      // 148: aload 16
      // 14a: invokespecial me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Lnet/minecraft/world/entity/Entity;)Lkotlin/Pair;
      // 14d: dup
      // 14e: ifnonnull 159
      // 151: pop
      // 152: goto 0d4
      // 155: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 158: athrow
      // 159: astore 17
      // 15b: aload 17
      // 15d: invokevirtual kotlin/Pair.getFirst ()Ljava/lang/Object;
      // 160: checkcast me/octo/client/IIlIIlIlllllIIlIIIlIIllIIIIIIlIIlIlIIIllIlIlIIIIllllIIIIIIIIlIIIllIlllIlIIllIIllIIIlI
      // 163: astore 18
      // 165: aload 16
      // 167: invokestatic me/octo/client/IIlIlIIIIlIllllIIllIlIllIIllIlllIIIIIllIIIllllllIllIIllIIIlIIIlllllIIIIIlIIllllllIIII.a (Lnet/minecraft/world/entity/Entity;)V
      // 16a: aload 2
      // 16b: ifnonnull 192
      // 16e: aload 17
      // 170: invokevirtual kotlin/Pair.getSecond ()Ljava/lang/Object;
      // 173: checkcast net/minecraft/world/entity/decoration/ArmorStand
      // 176: dup
      // 177: ifnull 191
      // 17a: goto 181
      // 17d: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 180: athrow
      // 181: astore 21
      // 183: bipush 0
      // 184: istore 22
      // 186: aload 21
      // 188: checkcast net/minecraft/world/entity/Entity
      // 18b: invokestatic me/octo/client/IIlIlIIIIlIllllIIllIlIllIIllIlllIIIIIllIIIllllllIllIIllIIIlIIIlllllIIIIIlIIllllllIIII.a (Lnet/minecraft/world/entity/Entity;)V
      // 18e: goto 193
      // 191: pop
      // 192: nop
      // 193: aload 18
      // 195: invokevirtual me/octo/client/IIlIIlIlllllIIlIIIlIIllIIIIIIlIIlIlIIIllIlIlIIIIllllIIIIIIIIlIIIllIlllIlIIllIIllIIIlI.b ()Ljava/lang/Integer;
      // 198: dup
      // 199: ifnull 1a6
      // 19c: invokevirtual java/lang/Integer.intValue ()I
      // 19f: goto 1ad
      // 1a2: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a5: athrow
      // 1a6: pop
      // 1a7: invokestatic me/octo/client/IIIlIlllIllIIlllIIlIlllIIllllIIIIlIllIIlIIIlIIlIlllIIlllllllIIllllIlllllllIIIIIIlIlII.g ()Lme/octo/client/llllIIllIIlIlIlIIIllIlIllIIlIlllllIIlllllIIIlIllIlIIllllIlIIIIllIlIlIllIIlllIlIIlllII;
      // 1aa: invokevirtual me/octo/client/llllIIllIIlIlIlIIIllIlIllIIlIlllllIIlllllIIIlIllIlIIllllIlIIIIllIlIlIllIIlllIlIIlllII.j ()I
      // 1ad: ldc_w 16777215
      // 1b0: iand
      // 1b1: istore 19
      // 1b3: new me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll
      // 1b6: dup
      // 1b7: ldc_w -16777216
      // 1ba: iload 19
      // 1bc: ior
      // 1bd: invokespecial me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.<init> (I)V
      // 1c0: astore 20
      // 1c2: iload 14
      // 1c4: ifle 1dd
      // 1c7: new me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll
      // 1ca: dup
      // 1cb: iload 14
      // 1cd: bipush 24
      // 1cf: ishl
      // 1d0: iload 19
      // 1d2: ior
      // 1d3: invokespecial me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.<init> (I)V
      // 1d6: goto 1de
      // 1d9: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1dc: athrow
      // 1dd: aconst_null
      // 1de: astore 21
      // 1e0: iload 6
      // 1e2: aload 2
      // 1e3: ifnonnull 224
      // 1e6: ifeq 222
      // 1e9: goto 1f0
      // 1ec: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ef: athrow
      // 1f0: iload 7
      // 1f2: aload 2
      // 1f3: ifnonnull 224
      // 1f6: goto 1fd
      // 1f9: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1fc: athrow
      // 1fd: ifeq 222
      // 200: goto 207
      // 203: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 206: athrow
      // 207: aload 16
      // 209: aconst_null
      // 20a: fconst_0
      // 20b: aconst_null
      // 20c: fconst_0
      // 20d: fconst_0
      // 20e: bipush 0
      // 20f: aconst_null
      // 210: fconst_0
      // 211: fconst_0
      // 212: bipush 0
      // 213: bipush 1
      // 214: sipush 2046
      // 217: aconst_null
      // 218: invokestatic me/octo/client/IIIIIlIlIIlIIllllllIlllllIlIlIIIIIIIIlIlllllIlIIlIlIIlIIIIIIIlllIIIlllIIIlllllIlIIlII.a (Lnet/minecraft/world/entity/Entity;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FFZLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FFZZILjava/lang/Object;)V
      // 21b: goto 222
      // 21e: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 221: athrow
      // 222: iload 6
      // 224: ifeq 3f1
      // 227: aload 16
      // 229: fload 10
      // 22b: invokevirtual net/minecraft/world/entity/Entity.getPosition (F)Lnet/minecraft/world/phys/Vec3;
      // 22e: dup
      // 22f: sipush 19841
      // 232: sipush 16025
      // 235: pop2
      // 236: ldc_w "getPosition(...)"
      // 239: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 23c: astore 22
      // 23e: aload 16
      // 240: invokevirtual net/minecraft/world/entity/Entity.getBoundingBox ()Lnet/minecraft/world/phys/AABB;
      // 243: aload 22
      // 245: getfield net/minecraft/world/phys/Vec3.x D
      // 248: aload 16
      // 24a: invokevirtual net/minecraft/world/entity/Entity.getX ()D
      // 24d: dsub
      // 24e: aload 22
      // 250: getfield net/minecraft/world/phys/Vec3.y D
      // 253: aload 16
      // 255: invokevirtual net/minecraft/world/entity/Entity.getY ()D
      // 258: dsub
      // 259: aload 22
      // 25b: getfield net/minecraft/world/phys/Vec3.z D
      // 25e: aload 16
      // 260: invokevirtual net/minecraft/world/entity/Entity.getZ ()D
      // 263: dsub
      // 264: invokevirtual net/minecraft/world/phys/AABB.move (DDD)Lnet/minecraft/world/phys/AABB;
      // 267: dup
      // 268: sipush 19889
      // 26b: sipush -20932
      // 26e: pop2
      // 26f: ldc_w "move(...)"
      // 272: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 275: astore 23
      // 277: aload 5
      // 279: astore 24
      // 27b: aload 2
      // 27c: ifnonnull 3ed
      // 27f: aload 24
      // 281: invokevirtual java/lang/String.hashCode ()I
      // 284: lookupswitch 335 5 -405395281 56 2222509 113 558407714 88 843064335 163 2104334722 138
      // 2b8: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2bb: athrow
      // 2bc: aload 24
      // 2be: sipush 19885
      // 2c1: sipush -30313
      // 2c4: pop2
      // 2c5: ldc_w "Glow Outline"
      // 2c8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2cb: ifne 376
      // 2ce: goto 2d5
      // 2d1: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d4: athrow
      // 2d5: goto 3d3
      // 2d8: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2db: athrow
      // 2dc: aload 24
      // 2de: sipush 19886
      // 2e1: sipush 5220
      // 2e4: pop2
      // 2e5: ldc_w "Outline"
      // 2e8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2eb: ifne 340
      // 2ee: goto 3d3
      // 2f1: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f4: athrow
      // 2f5: aload 24
      // 2f7: sipush 19895
      // 2fa: sipush -27838
      // 2fd: pop2
      // 2fe: ldc_w "Glow"
      // 301: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 304: ifne 357
      // 307: goto 3d3
      // 30a: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30d: athrow
      // 30e: aload 24
      // 310: sipush 19890
      // 313: sipush -20272
      // 316: pop2
      // 317: ldc_w "Filled"
      // 31a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 31d: ifne 397
      // 320: goto 3d3
      // 323: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 326: athrow
      // 327: aload 24
      // 329: sipush 19898
      // 32c: sipush 19065
      // 32f: pop2
      // 330: ldc_w "Filled + Outline"
      // 333: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 336: ifne 3b4
      // 339: goto 3d3
      // 33c: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33f: athrow
      // 340: aload 23
      // 342: aconst_null
      // 343: aload 20
      // 345: fload 11
      // 347: aconst_null
      // 348: aconst_null
      // 349: fconst_0
      // 34a: bipush 0
      // 34b: fconst_0
      // 34c: sipush 498
      // 34f: aconst_null
      // 350: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lnet/minecraft/world/phys/AABB;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FZFILjava/lang/Object;)V
      // 353: aload 2
      // 354: ifnull 593
      // 357: aload 23
      // 359: aconst_null
      // 35a: aconst_null
      // 35b: fconst_0
      // 35c: aconst_null
      // 35d: aload 20
      // 35f: fload 12
      // 361: bipush 0
      // 362: fload 13
      // 364: sipush 158
      // 367: aconst_null
      // 368: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lnet/minecraft/world/phys/AABB;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FZFILjava/lang/Object;)V
      // 36b: aload 2
      // 36c: ifnull 593
      // 36f: goto 376
      // 372: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 375: athrow
      // 376: aload 23
      // 378: aconst_null
      // 379: aload 20
      // 37b: fload 11
      // 37d: aconst_null
      // 37e: aload 20
      // 380: fload 12
      // 382: bipush 0
      // 383: fload 13
      // 385: sipush 146
      // 388: aconst_null
      // 389: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lnet/minecraft/world/phys/AABB;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FZFILjava/lang/Object;)V
      // 38c: aload 2
      // 38d: ifnull 593
      // 390: goto 397
      // 393: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 396: athrow
      // 397: aload 23
      // 399: aload 21
      // 39b: aconst_null
      // 39c: fconst_0
      // 39d: aconst_null
      // 39e: aconst_null
      // 39f: fconst_0
      // 3a0: bipush 0
      // 3a1: fconst_0
      // 3a2: sipush 508
      // 3a5: aconst_null
      // 3a6: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lnet/minecraft/world/phys/AABB;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FZFILjava/lang/Object;)V
      // 3a9: aload 2
      // 3aa: ifnull 593
      // 3ad: goto 3b4
      // 3b0: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b3: athrow
      // 3b4: aload 23
      // 3b6: aload 21
      // 3b8: aload 20
      // 3ba: fload 11
      // 3bc: aconst_null
      // 3bd: aconst_null
      // 3be: fconst_0
      // 3bf: bipush 0
      // 3c0: fconst_0
      // 3c1: sipush 496
      // 3c4: aconst_null
      // 3c5: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lnet/minecraft/world/phys/AABB;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FZFILjava/lang/Object;)V
      // 3c8: aload 2
      // 3c9: ifnull 593
      // 3cc: goto 3d3
      // 3cf: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d2: athrow
      // 3d3: aload 23
      // 3d5: aconst_null
      // 3d6: aload 20
      // 3d8: fload 11
      // 3da: aconst_null
      // 3db: aconst_null
      // 3dc: fconst_0
      // 3dd: bipush 0
      // 3de: fconst_0
      // 3df: sipush 498
      // 3e2: aconst_null
      // 3e3: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lnet/minecraft/world/phys/AABB;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FZFILjava/lang/Object;)V
      // 3e6: goto 3ed
      // 3e9: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ec: athrow
      // 3ed: aload 2
      // 3ee: ifnull 593
      // 3f1: aload 21
      // 3f3: dup
      // 3f4: ifnonnull 408
      // 3f7: goto 3fe
      // 3fa: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3fd: athrow
      // 3fe: pop
      // 3ff: aload 20
      // 401: goto 408
      // 404: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 407: athrow
      // 408: astore 22
      // 40a: aload 5
      // 40c: astore 23
      // 40e: aload 23
      // 410: invokevirtual java/lang/String.hashCode ()I
      // 413: aload 2
      // 414: ifnonnull 462
      // 417: lookupswitch 352 5 -405395281 53 2222509 106 558407714 81 843064335 156 2104334722 131
      // 448: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44b: athrow
      // 44c: aload 23
      // 44e: sipush 19846
      // 451: sipush -9372
      // 454: pop2
      // 455: ldc_w "Glow Outline"
      // 458: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 45b: goto 462
      // 45e: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 461: athrow
      // 462: ifne 50a
      // 465: goto 577
      // 468: aload 23
      // 46a: sipush 19877
      // 46d: sipush 16738
      // 470: pop2
      // 471: ldc_w "Outline"
      // 474: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 477: ifne 4cc
      // 47a: goto 577
      // 47d: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 480: athrow
      // 481: aload 23
      // 483: sipush 19851
      // 486: sipush -10893
      // 489: pop2
      // 48a: ldc_w "Glow"
      // 48d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 490: ifne 4e7
      // 493: goto 577
      // 496: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 499: athrow
      // 49a: aload 23
      // 49c: sipush 19901
      // 49f: sipush 19222
      // 4a2: pop2
      // 4a3: ldc_w "Filled"
      // 4a6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4a9: ifne 52f
      // 4ac: goto 577
      // 4af: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b2: athrow
      // 4b3: aload 23
      // 4b5: sipush 19880
      // 4b8: sipush -754
      // 4bb: pop2
      // 4bc: ldc_w "Filled + Outline"
      // 4bf: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4c2: ifne 552
      // 4c5: goto 577
      // 4c8: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4cb: athrow
      // 4cc: aload 16
      // 4ce: aload 20
      // 4d0: fload 11
      // 4d2: aconst_null
      // 4d3: fconst_0
      // 4d4: fconst_0
      // 4d5: bipush 0
      // 4d6: aconst_null
      // 4d7: fconst_0
      // 4d8: fconst_0
      // 4d9: bipush 0
      // 4da: iload 7
      // 4dc: sipush 2040
      // 4df: aconst_null
      // 4e0: invokestatic me/octo/client/IIIIIlIlIIlIIllllllIlllllIlIlIIIIIIIIlIlllllIlIIlIlIIlIIIIIIIlllIIIlllIIIlllllIlIIlII.a (Lnet/minecraft/world/entity/Entity;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FFZLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FFZZILjava/lang/Object;)V
      // 4e3: aload 2
      // 4e4: ifnull 593
      // 4e7: aload 16
      // 4e9: aconst_null
      // 4ea: fconst_0
      // 4eb: aload 20
      // 4ed: fload 12
      // 4ef: fload 13
      // 4f1: bipush 0
      // 4f2: aconst_null
      // 4f3: fconst_0
      // 4f4: fconst_0
      // 4f5: bipush 0
      // 4f6: iload 7
      // 4f8: sipush 1990
      // 4fb: aconst_null
      // 4fc: invokestatic me/octo/client/IIIIIlIlIIlIIllllllIlllllIlIlIIIIIIIIlIlllllIlIIlIlIIlIIIIIIIlllIIIlllIIIlllllIlIIlII.a (Lnet/minecraft/world/entity/Entity;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FFZLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FFZZILjava/lang/Object;)V
      // 4ff: aload 2
      // 500: ifnull 593
      // 503: goto 50a
      // 506: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 509: athrow
      // 50a: aload 16
      // 50c: aload 20
      // 50e: fload 11
      // 510: aload 20
      // 512: fload 12
      // 514: fload 13
      // 516: bipush 0
      // 517: aconst_null
      // 518: fconst_0
      // 519: fconst_0
      // 51a: bipush 0
      // 51b: iload 7
      // 51d: sipush 1984
      // 520: aconst_null
      // 521: invokestatic me/octo/client/IIIIIlIlIIlIIllllllIlllllIlIlIIIIIIIIlIlllllIlIIlIlIIlIIIIIIIlllIIIlllIIIlllllIlIIlII.a (Lnet/minecraft/world/entity/Entity;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FFZLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FFZZILjava/lang/Object;)V
      // 524: aload 2
      // 525: ifnull 593
      // 528: goto 52f
      // 52b: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52e: athrow
      // 52f: aload 16
      // 531: aconst_null
      // 532: fconst_0
      // 533: aload 22
      // 535: fload 12
      // 537: fload 13
      // 539: bipush 0
      // 53a: aconst_null
      // 53b: fconst_0
      // 53c: fconst_0
      // 53d: bipush 0
      // 53e: iload 7
      // 540: sipush 1926
      // 543: aconst_null
      // 544: invokestatic me/octo/client/IIIIIlIlIIlIIllllllIlllllIlIlIIIIIIIIlIlllllIlIIlIlIIlIIIIIIIlllIIIlllIIIlllllIlIIlII.a (Lnet/minecraft/world/entity/Entity;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FFZLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FFZZILjava/lang/Object;)V
      // 547: aload 2
      // 548: ifnull 593
      // 54b: goto 552
      // 54e: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 551: athrow
      // 552: aload 16
      // 554: aload 20
      // 556: fload 11
      // 558: aload 22
      // 55a: fload 12
      // 55c: fload 13
      // 55e: bipush 0
      // 55f: aconst_null
      // 560: fconst_0
      // 561: fconst_0
      // 562: bipush 0
      // 563: iload 7
      // 565: sipush 1920
      // 568: aconst_null
      // 569: invokestatic me/octo/client/IIIIIlIlIIlIIllllllIlllllIlIlIIIIIIIIlIlllllIlIIlIlIIlIIIIIIIlllIIIlllIIIlllllIlIIlII.a (Lnet/minecraft/world/entity/Entity;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FFZLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FFZZILjava/lang/Object;)V
      // 56c: aload 2
      // 56d: ifnull 593
      // 570: goto 577
      // 573: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 576: athrow
      // 577: aload 16
      // 579: aconst_null
      // 57a: fconst_0
      // 57b: aconst_null
      // 57c: fconst_0
      // 57d: fconst_0
      // 57e: bipush 0
      // 57f: aconst_null
      // 580: fconst_0
      // 581: fconst_0
      // 582: bipush 0
      // 583: iload 7
      // 585: sipush 2046
      // 588: aconst_null
      // 589: invokestatic me/octo/client/IIIIIlIlIIlIIllllllIlllllIlIlIIIIIIIIlIlllllIlIIlIlIIlIIIIIIIlllIIIlllIIIlllllIlIIlII.a (Lnet/minecraft/world/entity/Entity;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FFZLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FFZZILjava/lang/Object;)V
      // 58c: goto 593
      // 58f: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 592: athrow
      // 593: invokestatic me/octo/client/IIIlIlllIllIIlllIIlIlllIIllllIIIIlIllIIlIIIlIIlIlllIIlllllllIIllllIlllllllIIIIIIlIlII.m ()Lme/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl;
      // 596: invokevirtual me/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ae ()Z
      // 599: aload 2
      // 59a: ifnonnull 0db
      // 59d: ifeq 0d4
      // 5a0: aload 16
      // 5a2: fload 10
      // 5a4: invokevirtual net/minecraft/world/entity/Entity.getPosition (F)Lnet/minecraft/world/phys/Vec3;
      // 5a7: dup
      // 5a8: sipush 19881
      // 5ab: sipush -15216
      // 5ae: pop2
      // 5af: ldc_w "getPosition(...)"
      // 5b2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 5b5: astore 22
      // 5b7: new net/minecraft/world/phys/Vec3
      // 5ba: dup
      // 5bb: aload 22
      // 5bd: getfield net/minecraft/world/phys/Vec3.x D
      // 5c0: aload 22
      // 5c2: getfield net/minecraft/world/phys/Vec3.y D
      // 5c5: aload 16
      // 5c7: invokevirtual net/minecraft/world/entity/Entity.getBbHeight ()F
      // 5ca: f2d
      // 5cb: ldc2_w 0.5
      // 5ce: dmul
      // 5cf: dadd
      // 5d0: aload 22
      // 5d2: getfield net/minecraft/world/phys/Vec3.z D
      // 5d5: invokespecial net/minecraft/world/phys/Vec3.<init> (DDD)V
      // 5d8: astore 23
      // 5da: ldc_w -16777216
      // 5dd: iload 19
      // 5df: ior
      // 5e0: istore 24
      // 5e2: invokestatic me/octo/client/IIIlIlllIllIIlllIIlIlllIIllllIIIIlIllIIlIIIlIIlIlllIIlllllllIIllllIlllllllIIIIIIlIlII.n ()Lme/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII;
      // 5e5: invokevirtual me/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII.n ()F
      // 5e8: fstore 25
      // 5ea: aload 1
      // 5eb: invokevirtual me/octo/client/events/impl/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.k ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 5ee: astore 26
      // 5f0: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 5f3: invokevirtual net/minecraft/client/Minecraft.getMainRenderTarget ()Lcom/mojang/blaze3d/pipeline/RenderTarget;
      // 5f6: dup
      // 5f7: sipush 19840
      // 5fa: sipush -16106
      // 5fd: pop2
      // 5fe: ldc_w "getMainRenderTarget(...)"
      // 601: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 604: astore 27
      // 606: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 609: astore 28
      // 60b: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 60e: getfield net/minecraft/client/Minecraft.gameRenderer Lnet/minecraft/client/renderer/GameRenderer;
      // 611: invokevirtual net/minecraft/client/renderer/GameRenderer.getMainCamera ()Lnet/minecraft/client/Camera;
      // 614: dup
      // 615: sipush 19847
      // 618: sipush -4176
      // 61b: pop2
      // 61c: ldc_w "getMainCamera(...)"
      // 61f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 622: astore 29
      // 624: bipush 0
      // 625: istore 30
      // 627: sipush 2848
      // 62a: invokestatic org/lwjgl/opengl/GL11C.glEnable (I)V
      // 62d: getstatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 630: aload 27
      // 632: aload 26
      // 634: aload 29
      // 636: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b (Lcom/mojang/blaze3d/pipeline/RenderTarget;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/Camera;)Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;
      // 639: astore 31
      // 63b: nop
      // 63c: aload 28
      // 63e: getstatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl [I
      // 641: swap
      // 642: invokevirtual me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.ordinal ()I
      // 645: iaload
      // 646: tableswitch 196 1 2 22 109
      // 65c: aload 31
      // 65e: astore 32
      // 660: bipush 0
      // 661: istore 33
      // 663: aload 32
      // 665: astore 34
      // 667: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 66a: astore 35
      // 66c: bipush 0
      // 66d: istore 36
      // 66f: aload 34
      // 671: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.d ()Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 674: astore 37
      // 676: aload 34
      // 678: aload 35
      // 67a: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 67d: nop
      // 67e: aload 34
      // 680: astore 38
      // 682: bipush 0
      // 683: istore 39
      // 685: aload 38
      // 687: fconst_0
      // 688: fconst_0
      // 689: ldc_w 0.9
      // 68c: aload 23
      // 68e: iload 24
      // 690: fload 25
      // 692: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;FFFLnet/minecraft/world/phys/Vec3;IF)V
      // 695: nop
      // 696: nop
      // 697: aload 34
      // 699: aload 37
      // 69b: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 69e: goto 6ad
      // 6a1: astore 40
      // 6a3: aload 34
      // 6a5: aload 37
      // 6a7: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 6aa: aload 40
      // 6ac: athrow
      // 6ad: nop
      // 6ae: nop
      // 6af: aload 2
      // 6b0: ifnull 716
      // 6b3: aload 31
      // 6b5: astore 32
      // 6b7: bipush 0
      // 6b8: istore 33
      // 6ba: aload 32
      // 6bc: astore 34
      // 6be: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 6c1: astore 35
      // 6c3: bipush 0
      // 6c4: istore 36
      // 6c6: aload 34
      // 6c8: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.d ()Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 6cb: astore 37
      // 6cd: aload 34
      // 6cf: aload 35
      // 6d1: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 6d4: nop
      // 6d5: aload 34
      // 6d7: astore 38
      // 6d9: bipush 0
      // 6da: istore 39
      // 6dc: aload 38
      // 6de: fconst_0
      // 6df: fconst_0
      // 6e0: ldc_w 0.9
      // 6e3: aload 23
      // 6e5: iload 24
      // 6e7: fload 25
      // 6e9: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;FFFLnet/minecraft/world/phys/Vec3;IF)V
      // 6ec: nop
      // 6ed: nop
      // 6ee: aload 34
      // 6f0: aload 37
      // 6f2: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 6f5: goto 704
      // 6f8: astore 40
      // 6fa: aload 34
      // 6fc: aload 37
      // 6fe: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 701: aload 40
      // 703: athrow
      // 704: nop
      // 705: nop
      // 706: aload 2
      // 707: ifnull 716
      // 70a: new kotlin/NoWhenBranchMatchedException
      // 70d: dup
      // 70e: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
      // 711: athrow
      // 712: invokestatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 715: athrow
      // 716: aload 31
      // 718: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.f ()V
      // 71b: sipush 2848
      // 71e: invokestatic org/lwjgl/opengl/GL11C.glDisable (I)V
      // 721: goto 734
      // 724: astore 41
      // 726: aload 31
      // 728: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.f ()V
      // 72b: sipush 2848
      // 72e: invokestatic org/lwjgl/opengl/GL11C.glDisable (I)V
      // 731: aload 41
      // 733: athrow
      // 734: nop
      // 735: aload 2
      // 736: ifnull 0d4
      // 739: return
   }

   public void a(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll param1) {
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "data");
      super.a(param1);
      Iterable var4 = (Iterable)this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      String var2 = me.octo.client.lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      java.util.Collection var7 = (java.util.Collection)new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(var4, 10));
      for (Object var10 : var4) {
         me.octo.client.IIlIIlIlllllIIlIIIlIIllIIIIIIlIIlIlIIIllIlIlIIIIllllIIIIIIIIlIIIllIlllIlIIllIIllIIIlI var11 = (me.octo.client.IIlIIlIlllllIIlIIIlIIllIIIIIIlIIlIlIIIllIlIlIIIIllllIIIIIIIIlIIIllIlllIlIIllIIllIIIlI)var10;
         me.octo.client.llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var13 = new me.octo.client.llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll();
         var13.a("name", var11.a());
         var13.a("hasColor", Boolean.valueOf(var11.b() != null));
         if (var11.b() != null) {
            var13.a("color", var11.b());
         }
         var13.a("mode", var11.c().name());
         var7.add(var13);
      }
      java.util.List var3 = (java.util.List)var7;
      param1.a("esp_entries", var3);
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         me.octo.client.lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b("BVyFE");
      }
   }

   public void b(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll param1) {
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "data");
      super.b(param1);
      String var2 = me.octo.client.lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.clear();
      java.util.Iterator var3 = param1.b("esp_entries").iterator();
      while (var3.hasNext()) {
         me.octo.client.llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var4 = (me.octo.client.llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll) var3.next();
         String var5 = var4.aString("name", (String) null);
         boolean var6 = var4.a("hasColor", true);
         java.lang.Integer var7 = var6 ? java.lang.Integer.valueOf(var4.a("color", me.octo.client.IIIlIlllIllIIlllIIlIlllIIllllIIIIlIllIIlIIIlIIlIlllIIlllllllIIllllIlllllllIIIIIIlIlII.g().j())) : null;
         me.octo.client.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll var8;
         try {
            var8 = me.octo.client.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.a(var4.aString("mode", "NAME"));
         } catch (java.lang.Exception var10) {
            var8 = me.octo.client.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         }
         if (var5.length() > 0) {
            this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.add(new me.octo.client.IIlIIlIlllllIIlIIIlIIllIIIIIIlIIlIlIIIllIlIlIIIIllllIIIIIIIIlIIIllIlllIlIIllIIllIIIlI(var5, var7, var8));
         }
      }
   }

   private static final boolean a(
      String param0,
      IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll param1,
      IIlIIlIlllllIIlIIIlIIllIIIIIIlIIlIlIIIllIlIlIIIIllllIIIIIIIIlIIIllIlllIlIIllIIllIIIlI param2
   ) {
      String var3 = me.octo.client.lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param2, "it");
      if (var3 == null && !kotlin.text.StringsKt.equals(param0, param2.a(), true)) {
         return false;
      }
      return param2.c() == param1;
   }

   private static final boolean a(String var0, IIlIIlIlllllIIlIIIlIIllIIIIIIlIIlIlIIIllIlIlIIIIllllIIIIIIIIlIIIllIlllIlIIllIIllIIIlI var1) {
      short var10001 = 19888;
      short var10002 = 32143;
      Intrinsics.checkNotNullParameter(var1, "it");
      return StringsKt.equals(var1.a(), var0, true);
   }

   private static final boolean a(ArmorStand var0) {
      short var10001 = 19873;
      short var10002 = -15348;
      Intrinsics.checkNotNullParameter(var0, "it");
      return true;
   }

   private static final boolean a(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[41];
      int var3 = 0;
      String var2 = "äv<¶\u001cRu«»5z\u000eü`y¬!\u0080ür:ÜØ\u0018\u0080\u008a\u0002Wò\u0004Æ\u0088]\u0007\f\u0086åëI6â¥¾ÕÍEû\töõ\u009f+\u0001¬¬6®\u0007Ä¯SxyÞE\b\u0017\u008aíeOµO\u0015\u0004}ñ\u0012ã\u0004Ý\u0098l\u0001\u0010øÆù{*\u0018åZ\u0017ÇòÒ\u008d\u0012D\u0006\u0010\u0007I\u001b;g¼NdK\u0094\u0002À©À\u008a¿\b0ö\têÓDÜ+\u0007\u009f¥89\u0014öè\füUF\u0006êHGëÙ÷\u008e_\u0004\u0001Ý÷©\u0004X;\u008eq\u0006\u0084ûkmiv\t\u0091m\u009dp£·<\u0003Ã\u0002¢Ñ\u0004$\u008c]=\u0004¢\u0012Ú_1º\u0084\u0016\u00050iï¸1³Öx¹\u009e\u0014\"&i>ÍÛ\u0013À\u009cv\u0096Î_¾ÔóªµÑ\u0012OjÜ³3\u0083\u0081\n\u000b\u0089Èèp±\u000b\u0019³\u0083\u000eëE\u008bIdi\u0081\u000e\u0004\u00adf\u0015Â·\u0080\u0094µ\u0000)\u0083¾ù\u0010ós\u0085|´T4y\u00047ë´\u0094N-n\u0004=\u008ftç\u0004¿¹Jê\tT»HðÖ\u0094\u0092g\u0016\u0005z[5¼µ\u0006#§\u009fæ÷\u0007\u0005bãù\u0090\u0002\u0005Wò\u0090\u0089\u0001\t\u007ft-\tz«\u0007\u0080¤\u0010\n#§Çá\u008f\u009c¨8\u0099\u0017\u00191kÓ)\u0018çz\u001añXíc\u009b,\u001c\u0012Å\u0086n½ç\u0084\u009fïLbº\u000f\u008c\u0012QdÌ2\u0082\u00958\u0085CïzÏ¹¦dQPÒ\f\u001eÌ\u001a5a.6'÷nKl\u00033\r\r";
      int var4 = "äv<¶\u001cRu«»5z\u000eü`y¬!\u0080ür:ÜØ\u0018\u0080\u008a\u0002Wò\u0004Æ\u0088]\u0007\f\u0086åëI6â¥¾ÕÍEû\töõ\u009f+\u0001¬¬6®\u0007Ä¯SxyÞE\b\u0017\u008aíeOµO\u0015\u0004}ñ\u0012ã\u0004Ý\u0098l\u0001\u0010øÆù{*\u0018åZ\u0017ÇòÒ\u008d\u0012D\u0006\u0010\u0007I\u001b;g¼NdK\u0094\u0002À©À\u008a¿\b0ö\têÓDÜ+\u0007\u009f¥89\u0014öè\füUF\u0006êHGëÙ÷\u008e_\u0004\u0001Ý÷©\u0004X;\u008eq\u0006\u0084ûkmiv\t\u0091m\u009dp£·<\u0003Ã\u0002¢Ñ\u0004$\u008c]=\u0004¢\u0012Ú_1º\u0084\u0016\u00050iï¸1³Öx¹\u009e\u0014\"&i>ÍÛ\u0013À\u009cv\u0096Î_¾ÔóªµÑ\u0012OjÜ³3\u0083\u0081\n\u000b\u0089Èèp±\u000b\u0019³\u0083\u000eëE\u008bIdi\u0081\u000e\u0004\u00adf\u0015Â·\u0080\u0094µ\u0000)\u0083¾ù\u0010ós\u0085|´T4y\u00047ë´\u0094N-n\u0004=\u008ftç\u0004¿¹Jê\tT»HðÖ\u0094\u0092g\u0016\u0005z[5¼µ\u0006#§\u009fæ÷\u0007\u0005bãù\u0090\u0002\u0005Wò\u0090\u0089\u0001\t\u007ft-\tz«\u0007\u0080¤\u0010\n#§Çá\u008f\u009c¨8\u0099\u0017\u00191kÓ)\u0018çz\u001añXíc\u009b,\u001c\u0012Å\u0086n½ç\u0084\u009fïLbº\u000f\u008c\u0012QdÌ2\u0082\u00958\u0085CïzÏ¹¦dQPÒ\f\u001eÌ\u001a5a.6'÷nKl\u00033\r\r"
         .length();
      char var1 = 11;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 24;
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
                     case 0 -> 42;
                     case 1 -> 90;
                     case 2 -> 71;
                     case 3 -> 106;
                     case 4 -> 115;
                     case 5 -> 8;
                     default -> 62;
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
                     g = new String[41];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl();
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "í\u0017\bî\u000bÙ8\u0093~\u0004/\u0016$v";
                  var4 = "í\u0017\bî\u000bÙ8\u0093~\u0004/\u0016$v".length();
                  var1 = '\t';
                  var8 = -1;
            }

            var10000 = 74;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 19875) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 101;
            case 1 -> 185;
            case 2 -> 177;
            case 3 -> 129;
            case 4 -> 204;
            case 5 -> 170;
            case 6 -> 43;
            case 7 -> 201;
            case 8 -> 30;
            case 9 -> 154;
            case 10 -> 41;
            case 11 -> 175;
            case 12 -> 145;
            case 13 -> 216;
            case 14 -> 77;
            case 15 -> 220;
            case 16 -> 152;
            case 17 -> 191;
            case 18 -> 144;
            case 19 -> 183;
            case 20 -> 142;
            case 21 -> 89;
            case 22 -> 241;
            case 23 -> 239;
            case 24 -> 17;
            case 25 -> 59;
            case 26 -> 108;
            case 27 -> 195;
            case 28 -> 54;
            case 29 -> 143;
            case 30 -> 44;
            case 31 -> 137;
            case 32 -> 188;
            case 33 -> 13;
            case 34 -> 65;
            case 35 -> 56;
            case 36 -> 88;
            case 37 -> 68;
            case 38 -> 87;
            case 39 -> 173;
            case 40 -> 136;
            case 41 -> 103;
            case 42 -> 52;
            case 43 -> 184;
            case 44 -> 249;
            case 45 -> 236;
            case 46 -> 15;
            case 47 -> 157;
            case 48 -> 199;
            case 49 -> 85;
            case 50 -> 126;
            case 51 -> 46;
            case 52 -> 210;
            case 53 -> 155;
            case 54 -> 27;
            case 55 -> 165;
            case 56 -> 58;
            case 57 -> 19;
            case 58 -> 50;
            case 59 -> 209;
            case 60 -> 149;
            case 61 -> 217;
            case 62 -> 134;
            case 63 -> 7;
            case 64 -> 55;
            case 65 -> 139;
            case 66 -> 38;
            case 67 -> 72;
            case 68 -> 24;
            case 69 -> 187;
            case 70 -> 40;
            case 71 -> 84;
            case 72 -> 234;
            case 73 -> 222;
            case 74 -> 64;
            case 75 -> 81;
            case 76 -> 62;
            case 77 -> 47;
            case 78 -> 48;
            case 79 -> 107;
            case 80 -> 133;
            case 81 -> 10;
            case 82 -> 215;
            case 83 -> 219;
            case 84 -> 200;
            case 85 -> 99;
            case 86 -> 212;
            case 87 -> 238;
            case 88 -> 244;
            case 89 -> 42;
            case 90 -> 28;
            case 91 -> 96;
            case 92 -> 193;
            case 93 -> 121;
            case 94 -> 128;
            case 95 -> 39;
            case 96 -> 49;
            case 97 -> 23;
            case 98 -> 119;
            case 99 -> 172;
            case 100 -> 156;
            case 101 -> 0;
            case 102 -> 5;
            case 103 -> 124;
            case 104 -> 253;
            case 105 -> 75;
            case 106 -> 97;
            case 107 -> 163;
            case 108 -> 61;
            case 109 -> 162;
            case 110 -> 105;
            case 111 -> 240;
            case 112 -> 226;
            case 113 -> 167;
            case 114 -> 208;
            case 115 -> 250;
            case 116 -> 76;
            case 117 -> 140;
            case 118 -> 123;
            case 119 -> 246;
            case 120 -> 254;
            case 121 -> 159;
            case 122 -> 53;
            case 123 -> 174;
            case 124 -> 51;
            case 125 -> 248;
            case 126 -> 166;
            case 127 -> 213;
            case 128 -> 205;
            case 129 -> 202;
            case 130 -> 11;
            case 131 -> 160;
            case 132 -> 255;
            case 133 -> 8;
            case 134 -> 176;
            case 135 -> 78;
            case 136 -> 109;
            case 137 -> 63;
            case 138 -> 83;
            case 139 -> 237;
            case 140 -> 218;
            case 141 -> 32;
            case 142 -> 141;
            case 143 -> 115;
            case 144 -> 150;
            case 145 -> 94;
            case 146 -> 71;
            case 147 -> 189;
            case 148 -> 146;
            case 149 -> 125;
            case 150 -> 117;
            case 151 -> 82;
            case 152 -> 181;
            case 153 -> 4;
            case 154 -> 194;
            case 155 -> 229;
            case 156 -> 79;
            case 157 -> 161;
            case 158 -> 9;
            case 159 -> 247;
            case 160 -> 74;
            case 161 -> 114;
            case 162 -> 203;
            case 163 -> 110;
            case 164 -> 92;
            case 165 -> 182;
            case 166 -> 221;
            case 167 -> 168;
            case 168 -> 98;
            case 169 -> 26;
            case 170 -> 33;
            case 171 -> 67;
            case 172 -> 198;
            case 173 -> 130;
            case 174 -> 148;
            case 175 -> 112;
            case 176 -> 132;
            case 177 -> 21;
            case 178 -> 192;
            case 179 -> 69;
            case 180 -> 1;
            case 181 -> 197;
            case 182 -> 224;
            case 183 -> 104;
            case 184 -> 86;
            case 185 -> 113;
            case 186 -> 31;
            case 187 -> 3;
            case 188 -> 90;
            case 189 -> 206;
            case 190 -> 233;
            case 191 -> 37;
            case 192 -> 93;
            case 193 -> 242;
            case 194 -> 228;
            case 195 -> 106;
            case 196 -> 60;
            case 197 -> 211;
            case 198 -> 135;
            case 199 -> 66;
            case 200 -> 2;
            case 201 -> 243;
            case 202 -> 227;
            case 203 -> 186;
            case 204 -> 35;
            case 205 -> 179;
            case 206 -> 14;
            case 207 -> 164;
            case 208 -> 190;
            case 209 -> 232;
            case 210 -> 91;
            case 211 -> 138;
            case 212 -> 158;
            case 213 -> 100;
            case 214 -> 16;
            case 215 -> 29;
            case 216 -> 18;
            case 217 -> 25;
            case 218 -> 73;
            case 219 -> 225;
            case 220 -> 120;
            case 221 -> 127;
            case 222 -> 251;
            case 223 -> 45;
            case 224 -> 230;
            case 225 -> 214;
            case 226 -> 80;
            case 227 -> 122;
            case 228 -> 20;
            case 229 -> 196;
            case 230 -> 118;
            case 231 -> 171;
            case 232 -> 245;
            case 233 -> 6;
            case 234 -> 57;
            case 235 -> 70;
            case 236 -> 36;
            case 237 -> 153;
            case 238 -> 235;
            case 239 -> 12;
            case 240 -> 207;
            case 241 -> 102;
            case 242 -> 178;
            case 243 -> 180;
            case 244 -> 223;
            case 245 -> 116;
            case 246 -> 169;
            case 247 -> 131;
            case 248 -> 34;
            case 249 -> 147;
            case 250 -> 95;
            case 251 -> 111;
            case 252 -> 231;
            case 253 -> 22;
            case 254 -> 151;
            default -> 252;
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

  // PX-FIX synth restored from jar bytecode
  public static void a(me.octo.client.lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl p0, java.lang.String p1, java.lang.Integer p2, me.octo.client.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll p3, int p4, java.lang.Object p5) {
    if ((p4 & 2) != 0) { p2 = null; }
    if ((p4 & 4) != 0) { p3 = me.octo.client.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
    p0.a(p1, p2, p3);
  }
}
