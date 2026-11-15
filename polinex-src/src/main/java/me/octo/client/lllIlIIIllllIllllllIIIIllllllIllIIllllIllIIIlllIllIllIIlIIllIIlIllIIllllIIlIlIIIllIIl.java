package me.octo.client;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll;
import me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
import me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import me.octo.client.utils.player.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl
   extends IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI {
   @NotNull
   public static lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI;
   private boolean lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll;
   private boolean llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
   private boolean IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII;
   private int llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
   @Nullable
   private IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
   private int IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   private int lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
   @Nullable
   private Vec3 llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
   @NotNull
   private static lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
   @NotNull
   private static BlockPos IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
   @NotNull
   private static lIllllIlIlIlIlIIIlIlIllIIlIIIlIIIIIllllIllllIIlIllIlIIllIlIlIIIllllIllIIlIIIlllIIllII lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   @NotNull
   private static lIIIIIIIIlIlIlIlIIIlIlIllIIIlIIllIIllIlIlIIlIIIlIlIIIIIIIIllIllIIllllllIlIIlIIllIIlIl IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
   @NotNull
   private static Set<? extends lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll> IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
   @Nullable
   private static lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
   @Nullable
   private static String llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
   @NotNull
   private static Set<String> lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
   @NotNull
   private static lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
   @NotNull
   private static List<ItemStack> lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl;
   private static boolean IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll;
   private static String[] h;
   private static String[] i;

   private lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl() {
      short var10001 = -15326;
      short var10002 = 2698;
      var10002 = -15299;
      short var10003 = 4276;
      me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      short var10004 = -15295;
      short var10005 = 10246;
      List var4 = CollectionsKt.emptyList();
      List var10006 = CollectionsKt.emptyList();
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         IlIIIlIIIlIIIlIIlIIllIIIIlIllIllIlIlIIllllIIlIIIIIllIIIlIlllIIIlIIllIllIlIlllIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         IlIIIlIIIlIIIlIIlIIllIIIIlIllIllIlIlIIllllIIlIIIIIllIIIlIlllIIIlIIllIllIlIlllIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         IlIIIlIIIlIIIlIIlIIllIIIIlIllIllIlIlIIllllIIlIIIIIllIIIlIlllIIIlIIllIllIlIlllIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c(),
         IlIIIlIIIlIIIlIIlIIllIIIIlIllIllIlIlIIllllIIlIIIIIllIIIlIlllIIIlIIllIllIlIlllIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .d()
      };
      super("Museum Macro", "Grows your museum automatically.", var3, "Rift", var4, var10006, false, var1);
      this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = true;
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = -1;
      this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
   }

   public final boolean a5() {
      return this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
   }

   public final void e(boolean var1) {
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = var1;
   }

   @NotNull
   public final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI a6() {
      return this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
   }

   @NotNull
   public final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI a7() {
      return this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll;
   }

   public final boolean a8() {
      return this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
   }

   public final void f(boolean var1) {
      this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = var1;
   }

   public final boolean a9() {
      return this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII;
   }

   public final void g(boolean var1) {
      this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = var1;
   }

   public final int a_() {
      return this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
   }

   public final void a(int var1) {
      this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl = var1;
   }

   @Override
   public void aC() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 0000: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.k ()[Lme/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
      // 0003: astore 1
      // 0004: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll Z
      // 0007: ifeq 0073
      // 000a: aload 0
      // 000b: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.W ()Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 000e: aload 1
      // 000f: ifnull 0034
      // 0012: goto 0019
      // 0015: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0018: athrow
      // 0019: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI Lme/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll;
      // 001c: dup
      // 001d: ifnull 0033
      // 0020: goto 0027
      // 0023: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0026: athrow
      // 0027: invokeinterface me/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll.a ()Ljava/lang/String; 1
      // 002c: goto 0035
      // 002f: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0032: athrow
      // 0033: pop
      // 0034: aconst_null
      // 0035: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 0038: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.g ()Z
      // 003b: istore 20
      // 003d: astore 21
      // 003f: astore 22
      // 0041: sipush -15252
      // 0044: sipush -11577
      // 0047: pop2
      // 0048: ldc "MuseumMacro requested stop. state="
      // 004a: aload 22
      // 004c: sipush -15261
      // 004f: sipush -740
      // 0052: pop2
      // 0053: ldc " toBuy="
      // 0055: aload 21
      // 0057: sipush -15266
      // 005a: sipush -929
      // 005d: pop2
      // 005e: ldc " itemBought="
      // 0060: iload 20
      // 0062: invokedynamic makeConcatWithConstants (Ljava/lang/String;Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001\u0001" ]
      // 0067: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g (Ljava/lang/String;)V
      // 006a: bipush 0
      // 006b: putstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll Z
      // 006e: aload 0
      // 006f: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.N ()V
      // 0072: return
      // 0073: aload 0
      // 0074: getfield me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 0077: aload 1
      // 0078: ifnull 0178
      // 007b: aload 0
      // 007c: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.W ()Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 007f: if_acmpeq 0174
      // 0082: goto 0089
      // 0085: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0088: athrow
      // 0089: aload 0
      // 008a: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.W ()Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 008d: aload 1
      // 008e: ifnull 00ca
      // 0091: goto 0098
      // 0094: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0097: athrow
      // 0098: invokestatic me/octo/client/llIIlIlllIlIllIllIllIlIlIlllllIlllIIIIlIIllIIIlIllIlIlIlIIIIIIlllIlIlllIlllIllIlIlIIl.a ()Lme/octo/client/IlIlIIIllIIlIIlllIlIlIlIIlIIIlIllIllIIIllIIlIlIIllIIlIIlIlllIIIlllIlIIlIIIIlIllIlIlII;
      // 009b: dup
      // 009c: ifnull 00c2
      // 009f: goto 00a6
      // 00a2: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 00a5: athrow
      // 00a6: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 00a9: dup
      // 00aa: ifnull 00c2
      // 00ad: goto 00b4
      // 00b0: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 00b3: athrow
      // 00b4: invokevirtual java/lang/Class.getSimpleName ()Ljava/lang/String;
      // 00b7: dup
      // 00b8: ifnonnull 00d3
      // 00bb: goto 00c2
      // 00be: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 00c1: athrow
      // 00c2: pop
      // 00c3: goto 00ca
      // 00c6: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 00c9: athrow
      // 00ca: sipush -15308
      // 00cd: sipush -21283
      // 00d0: pop2
      // 00d1: ldc "none"
      // 00d3: aload 0
      // 00d4: getfield me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII Z
      // 00d7: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 00da: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.e ()Z
      // 00dd: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 00e0: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.f ()Z
      // 00e3: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 00e6: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.g ()Z
      // 00e9: aload 1
      // 00ea: ifnull 0108
      // 00ed: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI Lme/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll;
      // 00f0: dup
      // 00f1: ifnull 0107
      // 00f4: goto 00fb
      // 00f7: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 00fa: athrow
      // 00fb: invokeinterface me/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll.a ()Ljava/lang/String; 1
      // 0100: goto 0109
      // 0103: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0106: athrow
      // 0107: pop
      // 0108: aconst_null
      // 0109: astore 23
      // 010b: istore 24
      // 010d: istore 25
      // 010f: istore 26
      // 0111: istore 27
      // 0113: astore 28
      // 0115: astore 29
      // 0117: sipush -15296
      // 011a: sipush 11326
      // 011d: pop2
      // 011e: ldc "MuseumMacro state -> "
      // 0120: aload 29
      // 0122: sipush -15240
      // 0125: sipush 9282
      // 0128: pop2
      // 0129: ldc " | helper="
      // 012b: aload 28
      // 012d: sipush -15282
      // 0130: sipush 23439
      // 0133: pop2
      // 0134: ldc " travelStarted="
      // 0136: iload 27
      // 0138: sipush -15291
      // 013b: sipush 21661
      // 013e: pop2
      // 013f: ldc " museumScanned="
      // 0141: iload 26
      // 0143: sipush -15317
      // 0146: sipush 24522
      // 0149: pop2
      // 014a: ldc " needGui="
      // 014c: iload 25
      // 014e: sipush -15266
      // 0151: sipush -929
      // 0154: pop2
      // 0155: ldc " itemBought="
      // 0157: iload 24
      // 0159: sipush -15267
      // 015c: sipush -31352
      // 015f: pop2
      // 0160: ldc " toBuy="
      // 0162: aload 23
      // 0164: invokedynamic makeConcatWithConstants (Ljava/lang/String;Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" ]
      // 0169: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g (Ljava/lang/String;)V
      // 016c: aload 0
      // 016d: aload 0
      // 016e: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.W ()Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 0171: putfield me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 0174: aload 0
      // 0175: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.W ()Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 0178: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl [I
      // 017b: swap
      // 017c: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.ordinal ()I
      // 017f: iaload
      // 0180: aload 1
      // 0181: ifnull 01b5
      // 0184: tableswitch 4372 1 4 36 2468 2575 3063
      // 01a4: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 01a7: athrow
      // 01a8: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl Lme/octo/client/lIllllIlIlIlIlIIIlIlIllIIlIIIlIIIIIllllIllllIIlIllIlIIllIlIlIIIllllIllIIlIIIlllIIllII;
      // 01ab: invokevirtual me/octo/client/lIllllIlIlIlIlIIIlIlIllIIlIIIlIIIIIllllIllllIIlIllIlIIllIlIlIIIllllIllIIlIIIlllIIllII.a ()Z
      // 01ae: goto 01b5
      // 01b1: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 01b4: athrow
      // 01b5: aload 1
      // 01b6: ifnull 01eb
      // 01b9: ifeq 01de
      // 01bc: goto 01c3
      // 01bf: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 01c2: athrow
      // 01c3: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl Lme/octo/client/lIllllIlIlIlIlIIIlIlIllIIlIIIlIIIIIllllIllllIIlIllIlIIllIlIlIIIllllIllIIlIIIlllIIllII;
      // 01c6: invokevirtual me/octo/client/lIllllIlIlIlIlIIIlIlIllIIlIIIlIIIIIllllIllllIIlIllIlIIllIlIlIIIllllIllIIlIIIlllIIllII.c ()Z
      // 01c9: aload 1
      // 01ca: ifnull 021b
      // 01cd: goto 01d4
      // 01d0: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 01d3: athrow
      // 01d4: ifne 0217
      // 01d7: goto 01de
      // 01da: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 01dd: athrow
      // 01de: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 01e1: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.a ()Z
      // 01e4: goto 01eb
      // 01e7: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 01ea: athrow
      // 01eb: ifne 0216
      // 01ee: invokestatic me/octo/client/llIIlIlllIlIllIllIllIlIlIlllllIlllIIIIlIIllIIIlIllIlIlIlIIIIIIlllIlIlllIlllIllIlIlIIl.a ()Lme/octo/client/IlIlIIIllIIlIIlllIlIlIlIIlIIIlIllIllIIIllIIlIlIIllIIlIIlIlllIIIlllIlIIlIIIIlIllIlIlII;
      // 01f1: ifnonnull 0216
      // 01f4: goto 01fb
      // 01f7: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 01fa: athrow
      // 01fb: sipush -15260
      // 01fe: sipush 15412
      // 0201: pop2
      // 0202: ldc_w "MuseumMacro requesting bank scan before travel"
      // 0205: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g (Ljava/lang/String;)V
      // 0208: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 020b: bipush 1
      // 020c: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.a (Z)V
      // 020f: goto 0216
      // 0212: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0215: athrow
      // 0216: return
      // 0217: aload 0
      // 0218: getfield me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII Z
      // 021b: aload 1
      // 021c: ifnull 0263
      // 021f: ifne 025d
      // 0222: goto 0229
      // 0225: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0228: athrow
      // 0229: sipush -15234
      // 022c: sipush -5723
      // 022f: pop2
      // 0230: ldc_w "MuseumMacro starting travel to museum"
      // 0233: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g (Ljava/lang/String;)V
      // 0236: aload 0
      // 0237: getstatic me/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 023a: sipush 1000
      // 023d: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;I)V
      // 0240: aload 0
      // 0241: bipush 1
      // 0242: putfield me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII Z
      // 0245: aload 0
      // 0246: aconst_null
      // 0247: putfield me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI Lnet/minecraft/world/phys/Vec3;
      // 024a: aload 0
      // 024b: bipush 0
      // 024c: putfield me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII I
      // 024f: aload 0
      // 0250: getfield me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0253: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 0256: goto 025d
      // 0259: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 025c: athrow
      // 025d: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 0260: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.f ()Z
      // 0263: aload 1
      // 0264: ifnull 0291
      // 0267: ifne 028b
      // 026a: goto 0271
      // 026d: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0270: athrow
      // 0271: aload 0
      // 0272: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.aK ()Z
      // 0275: aload 1
      // 0276: ifnull 0291
      // 0279: goto 0280
      // 027c: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 027f: athrow
      // 0280: ifne 028b
      // 0283: goto 028a
      // 0286: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0289: athrow
      // 028a: return
      // 028b: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 028e: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.f ()Z
      // 0291: aload 1
      // 0292: ifnull 02db
      // 0295: ifne 02d8
      // 0298: goto 029f
      // 029b: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 029e: athrow
      // 029f: invokestatic me/octo/client/llIIlIlllIlIllIllIllIlIlIlllllIlllIIIIlIIllIIIlIllIlIlIlIIIIIIlllIlIlllIlllIllIlIlIIl.a ()Lme/octo/client/IlIlIIIllIIlIIlllIlIlIlIIlIIIlIllIllIIIllIIlIlIIllIIlIIlIlllIIIlllIlIIlIIIIlIllIlIlII;
      // 02a2: ifnonnull 02d8
      // 02a5: goto 02ac
      // 02a8: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 02ab: athrow
      // 02ac: sipush -15323
      // 02af: sipush 5651
      // 02b2: pop2
      // 02b3: ldc_w "MuseumMacro travel completed, preparing Eleanor interaction"
      // 02b6: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g (Ljava/lang/String;)V
      // 02b9: aload 0
      // 02ba: sipush -15251
      // 02bd: sipush -3097
      // 02c0: pop2
      // 02c1: ldc_w "Checking your balance..."
      // 02c4: getstatic me/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 02c7: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/lang/String;Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 02ca: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 02cd: bipush 1
      // 02ce: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.f (Z)V
      // 02d1: goto 02d8
      // 02d4: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 02d7: athrow
      // 02d8: invokestatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.n ()Z
      // 02db: ifeq 03b1
      // 02de: aload 0
      // 02df: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.ap ()Lnet/minecraft/client/Minecraft;
      // 02e2: getfield net/minecraft/client/Minecraft.screen Lnet/minecraft/client/gui/screens/Screen;
      // 02e5: dup
      // 02e6: ifnull 0317
      // 02e9: goto 02f0
      // 02ec: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 02ef: athrow
      // 02f0: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 02f3: dup
      // 02f4: ifnull 0317
      // 02f7: goto 02fe
      // 02fa: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 02fd: athrow
      // 02fe: invokevirtual java/lang/Class.getSimpleName ()Ljava/lang/String;
      // 0301: aload 1
      // 0302: ifnull 0375
      // 0305: goto 030c
      // 0308: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 030b: athrow
      // 030c: dup
      // 030d: ifnonnull 0329
      // 0310: goto 0317
      // 0313: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0316: athrow
      // 0317: pop
      // 0318: sipush -15277
      // 031b: sipush -18709
      // 031e: pop2
      // 031f: ldc_w "null"
      // 0322: goto 0329
      // 0325: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0328: athrow
      // 0329: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 032c: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.e ()Z
      // 032f: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 0332: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.f ()Z
      // 0335: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 0338: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.g ()Z
      // 033b: istore 30
      // 033d: istore 31
      // 033f: istore 32
      // 0341: astore 33
      // 0343: sipush -15249
      // 0346: sipush -6936
      // 0349: pop2
      // 034a: ldc_w "MuseumMacro returning because screen="
      // 034d: aload 33
      // 034f: sipush -15291
      // 0352: sipush 21661
      // 0355: pop2
      // 0356: ldc " museumScanned="
      // 0358: iload 32
      // 035a: sipush -15317
      // 035d: sipush 24522
      // 0360: pop2
      // 0361: ldc " needGui="
      // 0363: iload 31
      // 0365: sipush -15266
      // 0368: sipush -929
      // 036b: pop2
      // 036c: ldc " itemBought="
      // 036e: iload 30
      // 0370: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Z)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" ]
      // 0375: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g (Ljava/lang/String;)V
      // 0378: aload 0
      // 0379: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 037c: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.e ()Z
      // 037f: aload 1
      // 0380: ifnull 039d
      // 0383: ifne 0397
      // 0386: goto 038d
      // 0389: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 038c: athrow
      // 038d: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 0390: goto 03ad
      // 0393: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0396: athrow
      // 0397: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 039a: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.g ()Z
      // 039d: ifeq 03aa
      // 03a0: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 03a3: goto 03ad
      // 03a6: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 03a9: athrow
      // 03aa: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 03ad: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 03b0: return
      // 03b1: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 03b4: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll Lnet/minecraft/core/BlockPos;
      // 03b7: invokevirtual net/minecraft/core/BlockPos.getCenter ()Lnet/minecraft/world/phys/Vec3;
      // 03ba: dup
      // 03bb: sipush -15303
      // 03be: sipush -13793
      // 03c1: pop2
      // 03c2: ldc_w "getCenter(...)"
      // 03c5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 03c8: bipush 0
      // 03c9: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.b (Lnet/minecraft/world/phys/Vec3;Z)D
      // 03cc: dstore 2
      // 03cd: dload 2
      // 03ce: ldc2_w 4.0
      // 03d1: dcmpl
      // 03d2: aload 1
      // 03d3: ifnull 0454
      // 03d6: iflt 0440
      // 03d9: goto 03e0
      // 03dc: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 03df: athrow
      // 03e0: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 03e3: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()Lme/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll;
      // 03e6: invokevirtual me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.d ()Z
      // 03e9: aload 1
      // 03ea: ifnull 0415
      // 03ed: goto 03f4
      // 03f0: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 03f3: athrow
      // 03f4: ifeq 043f
      // 03f7: goto 03fe
      // 03fa: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 03fd: athrow
      // 03fe: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0401: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()Lme/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll;
      // 0404: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll Lnet/minecraft/core/BlockPos;
      // 0407: aconst_null
      // 0408: bipush 1
      // 0409: bipush 2
      // 040a: aconst_null
      // 040b: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lme/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll;Ljava/lang/Object;Lnet/minecraft/world/phys/Vec3;ZILjava/lang/Object;)Z
      // 040e: goto 0415
      // 0411: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0414: athrow
      // 0415: istore 4
      // 0417: aload 1
      // 0418: ifnull 043b
      // 041b: iload 4
      // 041d: ifne 043f
      // 0420: goto 0427
      // 0423: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0426: athrow
      // 0427: sipush -15248
      // 042a: sipush 17973
      // 042d: pop2
      // 042e: ldc_w "Couldn't path to Eleanor."
      // 0431: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.h (Ljava/lang/String;)V
      // 0434: goto 043b
      // 0437: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 043a: athrow
      // 043b: aload 0
      // 043c: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.N ()V
      // 043f: return
      // 0440: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0443: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()Lme/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll;
      // 0446: aload 1
      // 0447: ifnull 0464
      // 044a: invokevirtual me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.d ()Z
      // 044d: goto 0454
      // 0450: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0453: athrow
      // 0454: ifne 0467
      // 0457: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 045a: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()Lme/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll;
      // 045d: goto 0464
      // 0460: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0463: athrow
      // 0464: invokevirtual me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.k ()V
      // 0467: aload 0
      // 0468: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.ap ()Lnet/minecraft/client/Minecraft;
      // 046b: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 046e: astore 5
      // 0470: aload 5
      // 0472: aload 1
      // 0473: ifnull 0482
      // 0476: ifnull 0539
      // 0479: goto 0480
      // 047c: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 047f: athrow
      // 0480: aload 5
      // 0482: invokevirtual net/minecraft/client/multiplayer/ClientLevel.entitiesForRendering ()Ljava/lang/Iterable;
      // 0485: astore 6
      // 0487: aload 6
      // 0489: aload 1
      // 048a: ifnull 0499
      // 048d: ifnull 0539
      // 0490: goto 0497
      // 0493: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0496: athrow
      // 0497: aload 6
      // 0499: invokestatic kotlin/collections/CollectionsKt.asSequence (Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;
      // 049c: astore 8
      // 049e: aload 8
      // 04a0: aload 1
      // 04a1: ifnull 04bf
      // 04a4: ifnull 0539
      // 04a7: goto 04ae
      // 04aa: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 04ad: athrow
      // 04ae: aload 8
      // 04b0: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Lnet/minecraft/world/entity/Entity;)Lkotlin/Triple;, (Lnet/minecraft/world/entity/Entity;)Lkotlin/Triple; ]
      // 04b5: invokestatic kotlin/sequences/SequencesKt.map (Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
      // 04b8: goto 04bf
      // 04bb: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 04be: athrow
      // 04bf: astore 9
      // 04c1: aload 9
      // 04c3: aload 1
      // 04c4: ifnull 04e2
      // 04c7: ifnull 0539
      // 04ca: goto 04d1
      // 04cd: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 04d0: athrow
      // 04d1: aload 9
      // 04d3: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Lkotlin/Triple;)Z, (Lkotlin/Triple;)Ljava/lang/Boolean; ]
      // 04d8: invokestatic kotlin/sequences/SequencesKt.filter (Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
      // 04db: goto 04e2
      // 04de: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 04e1: athrow
      // 04e2: astore 11
      // 04e4: aload 11
      // 04e6: aload 1
      // 04e7: ifnull 04f6
      // 04ea: ifnull 0539
      // 04ed: goto 04f4
      // 04f0: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 04f3: athrow
      // 04f4: aload 11
      // 04f6: astore 14
      // 04f8: nop
      // 04f9: bipush 0
      // 04fa: istore 15
      // 04fc: aload 14
      // 04fe: new me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
      // 0501: dup
      // 0502: invokespecial me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.<init> ()V
      // 0505: checkcast java/util/Comparator
      // 0508: invokestatic kotlin/sequences/SequencesKt.sortedWith (Lkotlin/sequences/Sequence;Ljava/util/Comparator;)Lkotlin/sequences/Sequence;
      // 050b: astore 12
      // 050d: aload 12
      // 050f: aload 1
      // 0510: ifnull 051f
      // 0513: ifnull 0539
      // 0516: goto 051d
      // 0519: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 051c: athrow
      // 051d: aload 12
      // 051f: invokestatic kotlin/sequences/SequencesKt.toList (Lkotlin/sequences/Sequence;)Ljava/util/List;
      // 0522: astore 14
      // 0524: aload 14
      // 0526: aload 1
      // 0527: ifnull 0536
      // 052a: ifnull 0539
      // 052d: goto 0534
      // 0530: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0533: athrow
      // 0534: aload 14
      // 0536: goto 053c
      // 0539: invokestatic kotlin/collections/CollectionsKt.emptyList ()Ljava/util/List;
      // 053c: astore 4
      // 053e: aload 4
      // 0540: checkcast java/lang/Iterable
      // 0543: sipush -15305
      // 0546: sipush -18889
      // 0549: pop2
      // 054a: ldc_w " | "
      // 054d: checkcast java/lang/CharSequence
      // 0550: aconst_null
      // 0551: aconst_null
      // 0552: bipush 0
      // 0553: aconst_null
      // 0554: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.b (Lkotlin/Triple;)Ljava/lang/CharSequence;, (Lkotlin/Triple;)Ljava/lang/CharSequence; ]
      // 0559: bipush 30
      // 055b: aconst_null
      // 055c: invokestatic kotlin/collections/CollectionsKt.joinToString$default (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
      // 055f: sipush -15328
      // 0562: sipush -19546
      // 0565: pop2
      // 0566: ldc_w "MuseumMacro nearby Eleanor-like entities="
      // 0569: swap
      // 056a: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 056f: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g (Ljava/lang/String;)V
      // 0572: aload 1
      // 0573: ifnull 064b
      // 0576: aload 0
      // 0577: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.ap ()Lnet/minecraft/client/Minecraft;
      // 057a: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 057d: dup
      // 057e: ifnull 0643
      // 0581: goto 0588
      // 0584: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0587: athrow
      // 0588: invokevirtual net/minecraft/client/multiplayer/ClientLevel.entitiesForRendering ()Ljava/lang/Iterable;
      // 058b: dup
      // 058c: ifnull 0643
      // 058f: goto 0596
      // 0592: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0595: athrow
      // 0596: astore 9
      // 0598: bipush 0
      // 0599: istore 11
      // 059b: aload 9
      // 059d: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 05a2: astore 12
      // 05a4: aload 12
      // 05a6: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 05ab: ifeq 063b
      // 05ae: aload 12
      // 05b0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 05b5: astore 14
      // 05b7: aload 14
      // 05b9: checkcast net/minecraft/world/entity/Entity
      // 05bc: astore 15
      // 05be: bipush 0
      // 05bf: istore 16
      // 05c1: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // 05c4: aload 15
      // 05c6: invokevirtual net/minecraft/world/entity/Entity.getName ()Lnet/minecraft/network/chat/Component;
      // 05c9: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 05ce: dup
      // 05cf: sipush -15264
      // 05d2: sipush 7267
      // 05d5: pop2
      // 05d6: ldc_w "getString(...)"
      // 05d9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 05dc: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // 05df: astore 17
      // 05e1: aload 17
      // 05e3: checkcast java/lang/CharSequence
      // 05e6: sipush -15280
      // 05e9: sipush 24694
      // 05ec: pop2
      // 05ed: ldc_w "Eleanor"
      // 05f0: checkcast java/lang/CharSequence
      // 05f3: bipush 0
      // 05f4: bipush 2
      // 05f5: aconst_null
      // 05f6: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 05f9: aload 1
      // 05fa: ifnull 061c
      // 05fd: ifeq 062e
      // 0600: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 0603: aload 15
      // 0605: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 0608: aload 15
      // 060a: invokestatic me/octo/client/utils/player/llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 060d: bipush 1
      // 060e: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.b (Lnet/minecraft/world/phys/Vec3;Z)D
      // 0611: ldc2_w 10.0
      // 0614: dcmpg
      // 0615: goto 061c
      // 0618: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 061b: athrow
      // 061c: aload 1
      // 061d: ifnull 062b
      // 0620: ifge 062e
      // 0623: goto 062a
      // 0626: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0629: athrow
      // 062a: bipush 1
      // 062b: goto 062f
      // 062e: bipush 0
      // 062f: ifeq 05a4
      // 0632: aload 14
      // 0634: aload 1
      // 0635: ifnull 05b9
      // 0638: goto 063c
      // 063b: aconst_null
      // 063c: checkcast net/minecraft/world/entity/Entity
      // 063f: aload 1
      // 0640: ifnonnull 064c
      // 0643: pop
      // 0644: goto 064b
      // 0647: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 064a: athrow
      // 064b: aconst_null
      // 064c: astore 5
      // 064e: aload 5
      // 0650: ifnonnull 0722
      // 0653: aload 0
      // 0654: getfield me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl I
      // 0657: istore 6
      // 0659: aload 0
      // 065a: iload 6
      // 065c: bipush 1
      // 065d: iadd
      // 065e: putfield me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl I
      // 0661: aload 0
      // 0662: getfield me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl I
      // 0665: aload 1
      // 0666: ifnull 069b
      // 0669: bipush 1
      // 066a: if_icmpeq 0690
      // 066d: goto 0674
      // 0670: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0673: athrow
      // 0674: aload 0
      // 0675: getfield me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl I
      // 0678: bipush 20
      // 067a: irem
      // 067b: aload 1
      // 067c: ifnull 06f6
      // 067f: goto 0686
      // 0682: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0685: athrow
      // 0686: ifne 06e7
      // 0689: goto 0690
      // 068c: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 068f: athrow
      // 0690: aload 0
      // 0691: getfield me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl I
      // 0694: goto 069b
      // 0697: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 069a: athrow
      // 069b: aload 1
      // 069c: ifnull 06bf
      // 069f: aload 0
      // 06a0: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.ap ()Lnet/minecraft/client/Minecraft;
      // 06a3: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 06a6: dup
      // 06a7: ifnull 06be
      // 06aa: goto 06b1
      // 06ad: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 06b0: athrow
      // 06b1: checkcast net/minecraft/world/entity/Entity
      // 06b4: invokestatic me/octo/client/utils/player/llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 06b7: goto 06c0
      // 06ba: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 06bd: athrow
      // 06be: pop
      // 06bf: aconst_null
      // 06c0: sipush -15318
      // 06c3: sipush -3155
      // 06c6: pop2
      // 06c7: ldc_w "MuseumMacro could not find Eleanor near approach pos. retries="
      // 06ca: dup_x2
      // 06cb: pop
      // 06cc: sipush -15257
      // 06cf: sipush 16709
      // 06d2: pop2
      // 06d3: ldc_w " playerPos="
      // 06d6: swap
      // 06d7: invokedynamic makeConcatWithConstants (Ljava/lang/String;ILjava/lang/String;Lnet/minecraft/world/phys/Vec3;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001" ]
      // 06dc: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g (Ljava/lang/String;)V
      // 06df: aload 0
      // 06e0: aload 0
      // 06e1: getfield me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl I
      // 06e4: putfield me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI I
      // 06e7: aload 0
      // 06e8: aload 1
      // 06e9: ifnull 071e
      // 06ec: getfield me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl I
      // 06ef: goto 06f6
      // 06f2: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 06f5: athrow
      // 06f6: sipush 200
      // 06f9: if_icmple 0721
      // 06fc: sipush -15258
      // 06ff: sipush -3959
      // 0702: pop2
      // 0703: ldc_w "Couldn't find Eleanor near the museum desk."
      // 0706: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.h (Ljava/lang/String;)V
      // 0709: sipush -15314
      // 070c: sipush -26856
      // 070f: pop2
      // 0710: ldc_w "MuseumMacro disabling because Eleanor was not found near approach position"
      // 0713: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g (Ljava/lang/String;)V
      // 0716: aload 0
      // 0717: goto 071e
      // 071a: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 071d: athrow
      // 071e: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.N ()V
      // 0721: return
      // 0722: aload 0
      // 0723: getfield me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI I
      // 0726: aload 1
      // 0727: ifnull 0740
      // 072a: bipush -1
      // 072b: if_icmpeq 076e
      // 072e: goto 0735
      // 0731: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0734: athrow
      // 0735: aload 0
      // 0736: getfield me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl I
      // 0739: goto 0740
      // 073c: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 073f: athrow
      // 0740: aload 5
      // 0742: invokestatic me/octo/client/utils/player/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 0745: sipush -15289
      // 0748: sipush 12687
      // 074b: pop2
      // 074c: ldc_w "MuseumMacro found Eleanor after "
      // 074f: dup_x2
      // 0750: pop
      // 0751: sipush -15325
      // 0754: sipush 5942
      // 0757: pop2
      // 0758: ldc_w " retries at "
      // 075b: swap
      // 075c: invokedynamic makeConcatWithConstants (Ljava/lang/String;ILjava/lang/String;Lnet/minecraft/world/phys/Vec3;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001" ]
      // 0761: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g (Ljava/lang/String;)V
      // 0764: aload 0
      // 0765: bipush -1
      // 0766: putfield me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI I
      // 0769: aload 0
      // 076a: bipush 0
      // 076b: putfield me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl I
      // 076e: aload 5
      // 0770: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0773: invokevirtual java/lang/Class.getSimpleName ()Ljava/lang/String;
      // 0776: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // 0779: aload 5
      // 077b: invokevirtual net/minecraft/world/entity/Entity.getName ()Lnet/minecraft/network/chat/Component;
      // 077e: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 0783: dup
      // 0784: sipush -15264
      // 0787: sipush 7267
      // 078a: pop2
      // 078b: ldc_w "getString(...)"
      // 078e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0791: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // 0794: aload 5
      // 0796: invokestatic me/octo/client/utils/player/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 0799: astore 34
      // 079b: astore 35
      // 079d: astore 36
      // 079f: sipush -15244
      // 07a2: sipush -21790
      // 07a5: pop2
      // 07a6: ldc_w "MuseumMacro selected Eleanor class="
      // 07a9: aload 36
      // 07ab: sipush -15236
      // 07ae: sipush 13940
      // 07b1: pop2
      // 07b2: ldc_w " name="
      // 07b5: aload 35
      // 07b7: sipush -15321
      // 07ba: sipush -31024
      // 07bd: pop2
      // 07be: ldc_w " pos="
      // 07c1: aload 34
      // 07c3: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnet/minecraft/world/phys/Vec3;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001\u0001" ]
      // 07c8: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g (Ljava/lang/String;)V
      // 07cb: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 07ce: aload 5
      // 07d0: invokestatic me/octo/client/utils/player/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 07d3: bipush 1
      // 07d4: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.b (Lnet/minecraft/world/phys/Vec3;Z)D
      // 07d7: dstore 6
      // 07d9: aload 1
      // 07da: ifnull 07f9
      // 07dd: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 07e0: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.H ()Lnet/minecraft/world/phys/EntityHitResult;
      // 07e3: dup
      // 07e4: ifnull 07f8
      // 07e7: goto 07ee
      // 07ea: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 07ed: athrow
      // 07ee: invokevirtual net/minecraft/world/phys/EntityHitResult.getEntity ()Lnet/minecraft/world/entity/Entity;
      // 07f1: goto 07fa
      // 07f4: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 07f7: athrow
      // 07f8: pop
      // 07f9: aconst_null
      // 07fa: astore 9
      // 07fc: aload 1
      // 07fd: ifnull 0850
      // 0800: aload 9
      // 0802: dup
      // 0803: ifnull 0848
      // 0806: goto 080d
      // 0809: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 080c: athrow
      // 080d: invokevirtual net/minecraft/world/entity/Entity.getName ()Lnet/minecraft/network/chat/Component;
      // 0810: dup
      // 0811: ifnull 0848
      // 0814: goto 081b
      // 0817: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 081a: athrow
      // 081b: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 0820: aload 1
      // 0821: ifnull 0844
      // 0824: goto 082b
      // 0827: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 082a: athrow
      // 082b: dup
      // 082c: ifnull 0848
      // 082f: goto 0836
      // 0832: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0835: athrow
      // 0836: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // 0839: swap
      // 083a: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // 083d: goto 0844
      // 0840: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0843: athrow
      // 0844: aload 1
      // 0845: ifnonnull 0851
      // 0848: pop
      // 0849: goto 0850
      // 084c: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 084f: athrow
      // 0850: aconst_null
      // 0851: astore 11
      // 0853: aload 1
      // 0854: ifnull 0928
      // 0857: aload 9
      // 0859: dup
      // 085a: ifnull 0927
      // 085d: goto 0864
      // 0860: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0863: athrow
      // 0864: astore 15
      // 0866: bipush 0
      // 0867: istore 16
      // 0869: aload 15
      // 086b: invokestatic me/octo/client/utils/player/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 086e: aload 5
      // 0870: invokestatic me/octo/client/utils/player/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 0873: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 0876: aload 1
      // 0877: ifnull 0907
      // 087a: ifne 0906
      // 087d: goto 0884
      // 0880: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0883: athrow
      // 0884: aload 11
      // 0886: dup
      // 0887: aload 1
      // 0888: ifnull 08b3
      // 088b: goto 0892
      // 088e: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0891: athrow
      // 0892: ifnull 08d4
      // 0895: goto 089c
      // 0898: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 089b: athrow
      // 089c: checkcast java/lang/CharSequence
      // 089f: sipush -15280
      // 08a2: sipush 24694
      // 08a5: pop2
      // 08a6: ldc_w "Eleanor"
      // 08a9: checkcast java/lang/CharSequence
      // 08ac: goto 08b3
      // 08af: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 08b2: athrow
      // 08b3: bipush 0
      // 08b4: bipush 2
      // 08b5: aconst_null
      // 08b6: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 08b9: aload 1
      // 08ba: ifnull 08d1
      // 08bd: bipush 1
      // 08be: if_icmpne 08d0
      // 08c1: goto 08c8
      // 08c4: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 08c7: athrow
      // 08c8: bipush 1
      // 08c9: goto 08d6
      // 08cc: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 08cf: athrow
      // 08d0: bipush 0
      // 08d1: goto 08d6
      // 08d4: pop
      // 08d5: bipush 0
      // 08d6: ifeq 090a
      // 08d9: aload 11
      // 08db: checkcast java/lang/CharSequence
      // 08de: sipush -15283
      // 08e1: sipush -3971
      // 08e4: pop2
      // 08e5: ldc_w "Goldsworth"
      // 08e8: checkcast java/lang/CharSequence
      // 08eb: bipush 0
      // 08ec: bipush 2
      // 08ed: aconst_null
      // 08ee: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 08f1: aload 1
      // 08f2: ifnull 0907
      // 08f5: goto 08fc
      // 08f8: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 08fb: athrow
      // 08fc: ifeq 090a
      // 08ff: goto 0906
      // 0902: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0905: athrow
      // 0906: bipush 1
      // 0907: goto 090b
      // 090a: bipush 0
      // 090b: nop
      // 090c: aload 1
      // 090d: ifnull 0924
      // 0910: bipush 1
      // 0911: if_icmpne 0923
      // 0914: goto 091b
      // 0917: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 091a: athrow
      // 091b: bipush 1
      // 091c: goto 0929
      // 091f: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0922: athrow
      // 0923: bipush 0
      // 0924: goto 0929
      // 0927: pop
      // 0928: bipush 0
      // 0929: istore 12
      // 092b: dload 6
      // 092d: aload 1
      // 092e: ifnull 0986
      // 0931: aload 11
      // 0933: dup
      // 0934: ifnonnull 0950
      // 0937: goto 093e
      // 093a: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 093d: athrow
      // 093e: pop
      // 093f: sipush -15237
      // 0942: sipush 11492
      // 0945: pop2
      // 0946: ldc_w "null"
      // 0949: goto 0950
      // 094c: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 094f: athrow
      // 0950: iload 12
      // 0952: istore 37
      // 0954: astore 38
      // 0956: dstore 39
      // 0958: sipush -15238
      // 095b: sipush -27302
      // 095e: pop2
      // 095f: ldc_w "MuseumMacro distanceToEleanor="
      // 0962: dload 39
      // 0964: sipush -15293
      // 0967: sipush 29005
      // 096a: pop2
      // 096b: ldc_w " mouseOver="
      // 096e: aload 38
      // 0970: sipush -15319
      // 0973: sipush -25087
      // 0976: pop2
      // 0977: ldc_w " hoveringEleanor="
      // 097a: iload 37
      // 097c: invokedynamic makeConcatWithConstants (Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001\u0001" ]
      // 0981: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g (Ljava/lang/String;)V
      // 0984: dload 6
      // 0986: ldc2_w 4.0
      // 0989: dcmpg
      // 098a: aload 1
      // 098b: ifnull 09df
      // 098e: ifge 09dd
      // 0991: goto 0998
      // 0994: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0997: athrow
      // 0998: getstatic me/octo/client/utils/player/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI;
      // 099b: invokevirtual me/octo/client/utils/player/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.i ()Z
      // 099e: aload 1
      // 099f: ifnull 09df
      // 09a2: goto 09a9
      // 09a5: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 09a8: athrow
      // 09a9: ifne 09dd
      // 09ac: goto 09b3
      // 09af: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 09b2: athrow
      // 09b3: sipush -15255
      // 09b6: sipush 1362
      // 09b9: pop2
      // 09ba: ldc_w "MuseumMacro reached Eleanor range, rotating to interact"
      // 09bd: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g (Ljava/lang/String;)V
      // 09c0: new me/octo/client/IlllIIIIlIIIllIIlIllIIIllIIlIllIIIllIIlIIlIlIlIIIIllIlIIlIIIIIIIlIIlIIIlIlIIIlIIllIII
      // 09c3: dup
      // 09c4: aconst_null
      // 09c5: lconst_0
      // 09c6: bipush 3
      // 09c7: aconst_null
      // 09c8: invokespecial me/octo/client/IlllIIIIlIIIllIIlIllIIIllIIlIllIIIllIIlIIlIlIlIIIIllIlIIlIIIIIIIlIIlIIIlIlIIIlIIllIII.<init> (Lnet/minecraft/client/Minecraft;JILkotlin/jvm/internal/DefaultConstructorMarker;)V
      // 09cb: aload 5
      // 09cd: checkcast net/minecraft/world/entity/LivingEntity
      // 09d0: invokevirtual me/octo/client/IlllIIIIlIIIllIIlIllIIIllIIlIllIIIllIIlIIlIlIlIIIIllIlIIlIIIIIIIlIIlIIIlIlIIIlIIllIII.a (Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/phys/Vec3;
      // 09d3: invokestatic me/octo/client/utils/player/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.a (Lnet/minecraft/world/phys/Vec3;)V
      // 09d6: goto 09dd
      // 09d9: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 09dc: athrow
      // 09dd: iload 12
      // 09df: aload 1
      // 09e0: ifnull 09fa
      // 09e3: ifeq 1298
      // 09e6: goto 09ed
      // 09e9: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 09ec: athrow
      // 09ed: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 09f0: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.f ()Z
      // 09f3: goto 09fa
      // 09f6: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 09f9: athrow
      // 09fa: aload 1
      // 09fb: ifnull 0a4b
      // 09fe: ifne 0a3e
      // 0a01: goto 0a08
      // 0a04: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0a07: athrow
      // 0a08: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 0a0b: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.e ()Z
      // 0a0e: aload 1
      // 0a0f: ifnull 0a4b
      // 0a12: goto 0a19
      // 0a15: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0a18: athrow
      // 0a19: ifeq 0a3e
      // 0a1c: goto 0a23
      // 0a1f: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0a22: athrow
      // 0a23: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 0a26: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.g ()Z
      // 0a29: aload 1
      // 0a2a: ifnull 0a4b
      // 0a2d: goto 0a34
      // 0a30: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0a33: athrow
      // 0a34: ifeq 1298
      // 0a37: goto 0a3e
      // 0a3a: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0a3d: athrow
      // 0a3e: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 0a41: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.e ()Z
      // 0a44: goto 0a4b
      // 0a47: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0a4a: athrow
      // 0a4b: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 0a4e: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.f ()Z
      // 0a51: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 0a54: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.g ()Z
      // 0a57: istore 41
      // 0a59: istore 42
      // 0a5b: istore 43
      // 0a5d: sipush -15241
      // 0a60: sipush 29322
      // 0a63: pop2
      // 0a64: ldc_w "MuseumMacro interacting with Eleanor in TRAVEL. museumScanned="
      // 0a67: iload 43
      // 0a69: sipush -15317
      // 0a6c: sipush 24522
      // 0a6f: pop2
      // 0a70: ldc " needGui="
      // 0a72: iload 42
      // 0a74: sipush -15266
      // 0a77: sipush -929
      // 0a7a: pop2
      // 0a7b: ldc " itemBought="
      // 0a7d: iload 41
      // 0a7f: invokedynamic makeConcatWithConstants (Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Z)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001\u0001" ]
      // 0a84: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g (Ljava/lang/String;)V
      // 0a87: getstatic me/octo/client/utils/player/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI;
      // 0a8a: invokevirtual me/octo/client/utils/player/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.g ()V
      // 0a8d: aload 1
      // 0a8e: ifnull 0aae
      // 0a91: aload 0
      // 0a92: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.ap ()Lnet/minecraft/client/Minecraft;
      // 0a95: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 0a98: dup
      // 0a99: ifnull 0aad
      // 0a9c: goto 0aa3
      // 0a9f: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0aa2: athrow
      // 0aa3: invokevirtual net/minecraft/client/player/LocalPlayer.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 0aa6: goto 0aaf
      // 0aa9: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0aac: athrow
      // 0aad: pop
      // 0aae: aconst_null
      // 0aaf: astore 14
      // 0ab1: aload 1
      // 0ab2: ifnull 0b27
      // 0ab5: aload 14
      // 0ab7: ifnull 0b20
      // 0aba: goto 0ac1
      // 0abd: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0ac0: athrow
      // 0ac1: bipush 0
      // 0ac2: istore 15
      // 0ac4: iload 15
      // 0ac6: bipush 9
      // 0ac8: if_icmpge 0b20
      // 0acb: aload 14
      // 0acd: iload 15
      // 0acf: invokevirtual net/minecraft/world/entity/player/Inventory.getItem (I)Lnet/minecraft/world/item/ItemStack;
      // 0ad2: dup
      // 0ad3: sipush -15288
      // 0ad6: sipush -21861
      // 0ad9: pop2
      // 0ada: ldc_w "getItem(...)"
      // 0add: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0ae0: astore 16
      // 0ae2: aload 1
      // 0ae3: ifnull 0b1c
      // 0ae6: aload 16
      // 0ae8: invokevirtual net/minecraft/world/item/ItemStack.isEmpty ()Z
      // 0aeb: aload 1
      // 0aec: ifnull 0b26
      // 0aef: goto 0af6
      // 0af2: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0af5: athrow
      // 0af6: ifeq 0b12
      // 0af9: goto 0b00
      // 0afc: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0aff: athrow
      // 0b00: aload 14
      // 0b02: iload 15
      // 0b04: invokevirtual net/minecraft/world/entity/player/Inventory.setSelectedSlot (I)V
      // 0b07: aload 1
      // 0b08: ifnonnull 0b20
      // 0b0b: goto 0b12
      // 0b0e: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0b11: athrow
      // 0b12: iinc 15 1
      // 0b15: goto 0b1c
      // 0b18: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0b1b: athrow
      // 0b1c: aload 1
      // 0b1d: ifnonnull 0ac4
      // 0b20: getstatic me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 0b23: invokevirtual me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.j ()Z
      // 0b26: pop
      // 0b27: return
      // 0b28: invokestatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.n ()Z
      // 0b2b: aload 1
      // 0b2c: ifnull 0b4b
      // 0b2f: ifne 0b45
      // 0b32: goto 0b39
      // 0b35: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0b38: athrow
      // 0b39: aload 0
      // 0b3a: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 0b3d: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 0b40: return
      // 0b41: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0b44: athrow
      // 0b45: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 0b48: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.e ()Z
      // 0b4b: aload 1
      // 0b4c: ifnull 0b71
      // 0b4f: ifne 1298
      // 0b52: goto 0b59
      // 0b55: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0b58: athrow
      // 0b59: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 0b5c: aload 1
      // 0b5d: ifnull 0b8b
      // 0b60: goto 0b67
      // 0b63: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0b66: athrow
      // 0b67: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.b ()Z
      // 0b6a: goto 0b71
      // 0b6d: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0b70: athrow
      // 0b71: ifne 1298
      // 0b74: sipush -15285
      // 0b77: sipush -569
      // 0b7a: pop2
      // 0b7b: ldc_w "MuseumMacro requesting museum scan helper"
      // 0b7e: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g (Ljava/lang/String;)V
      // 0b81: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 0b84: goto 0b8b
      // 0b87: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0b8a: athrow
      // 0b8b: bipush 1
      // 0b8c: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.b (Z)V
      // 0b8f: aload 1
      // 0b90: ifnonnull 1298
      // 0b93: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 0b96: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.g ()Z
      // 0b99: aload 1
      // 0b9a: ifnull 0bc5
      // 0b9d: goto 0ba4
      // 0ba0: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0ba3: athrow
      // 0ba4: ifne 0bba
      // 0ba7: goto 0bae
      // 0baa: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0bad: athrow
      // 0bae: aload 0
      // 0baf: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 0bb2: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 0bb5: return
      // 0bb6: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0bb9: athrow
      // 0bba: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll Ljava/util/Set;
      // 0bbd: checkcast java/util/Collection
      // 0bc0: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 0bc5: aload 1
      // 0bc6: ifnull 0bd4
      // 0bc9: ifne 0bd7
      // 0bcc: goto 0bd3
      // 0bcf: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0bd2: athrow
      // 0bd3: bipush 1
      // 0bd4: goto 0bd8
      // 0bd7: bipush 0
      // 0bd8: ifeq 0d32
      // 0bdb: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 0bde: bipush 0
      // 0bdf: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.g (Z)V
      // 0be2: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll Ljava/util/Set;
      // 0be5: checkcast java/lang/Iterable
      // 0be8: astore 2
      // 0be9: bipush 0
      // 0bea: istore 3
      // 0beb: aload 2
      // 0bec: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 0bf1: astore 4
      // 0bf3: aload 4
      // 0bf5: aload 1
      // 0bf6: ifnull 0c1b
      // 0bf9: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0bfe: ifne 0c14
      // 0c01: goto 0c08
      // 0c04: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0c07: athrow
      // 0c08: new java/util/NoSuchElementException
      // 0c0b: dup
      // 0c0c: invokespecial java/util/NoSuchElementException.<init> ()V
      // 0c0f: athrow
      // 0c10: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0c13: athrow
      // 0c14: aload 4
      // 0c16: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0c1b: astore 5
      // 0c1d: aload 4
      // 0c1f: aload 1
      // 0c20: ifnull 0c3d
      // 0c23: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0c28: ifne 0c3b
      // 0c2b: goto 0c32
      // 0c2e: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0c31: athrow
      // 0c32: aload 5
      // 0c34: goto 0c9a
      // 0c37: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0c3a: athrow
      // 0c3b: aload 5
      // 0c3d: checkcast me/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll
      // 0c40: astore 6
      // 0c42: bipush 0
      // 0c43: istore 8
      // 0c45: aload 6
      // 0c47: invokeinterface me/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll.c ()Ljava/lang/Double; 1
      // 0c4c: dup
      // 0c4d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 0c50: invokevirtual java/lang/Double.doubleValue ()D
      // 0c53: dstore 6
      // 0c55: aload 4
      // 0c57: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0c5c: astore 8
      // 0c5e: aload 8
      // 0c60: checkcast me/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll
      // 0c63: astore 9
      // 0c65: bipush 0
      // 0c66: istore 11
      // 0c68: aload 9
      // 0c6a: invokeinterface me/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll.c ()Ljava/lang/Double; 1
      // 0c6f: dup
      // 0c70: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 0c73: invokevirtual java/lang/Double.doubleValue ()D
      // 0c76: dstore 9
      // 0c78: dload 6
      // 0c7a: dload 9
      // 0c7c: invokestatic java/lang/Double.compare (DD)I
      // 0c7f: ifle 0c8a
      // 0c82: aload 8
      // 0c84: astore 5
      // 0c86: dload 9
      // 0c88: dstore 6
      // 0c8a: aload 4
      // 0c8c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0c91: ifne 0c55
      // 0c94: aload 1
      // 0c95: ifnull 0c86
      // 0c98: aload 5
      // 0c9a: checkcast me/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll
      // 0c9d: putstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI Lme/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll;
      // 0ca0: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll Ljava/util/Set;
      // 0ca3: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI Lme/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll;
      // 0ca6: dup
      // 0ca7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 0caa: invokestatic kotlin/collections/SetsKt.minus (Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;
      // 0cad: putstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll Ljava/util/Set;
      // 0cb0: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl Ljava/util/List;
      // 0cb3: invokeinterface java/util/List.clear ()V 1
      // 0cb8: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl Ljava/util/List;
      // 0cbb: aload 0
      // 0cbc: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.ap ()Lnet/minecraft/client/Minecraft;
      // 0cbf: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 0cc2: dup
      // 0cc3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 0cc6: invokevirtual net/minecraft/client/player/LocalPlayer.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 0cc9: dup
      // 0cca: sipush -15246
      // 0ccd: sipush -22390
      // 0cd0: pop2
      // 0cd1: ldc_w "null cannot be cast to non-null type me.octo.client.mixin.accessors.InventoryAccessor"
      // 0cd4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
      // 0cd7: checkcast me/octo/client/mixin/accessors/InventoryAccessor
      // 0cda: invokeinterface me/octo/client/mixin/accessors/InventoryAccessor.getItems ()Lnet/minecraft/core/NonNullList; 1
      // 0cdf: dup
      // 0ce0: sipush -15278
      // 0ce3: sipush -7896
      // 0ce6: pop2
      // 0ce7: ldc_w "getItems(...)"
      // 0cea: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0ced: checkcast java/util/Collection
      // 0cf0: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 0cf5: pop
      // 0cf6: aload 0
      // 0cf7: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.ap ()Lnet/minecraft/client/Minecraft;
      // 0cfa: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 0cfd: dup
      // 0cfe: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 0d01: invokevirtual net/minecraft/client/player/LocalPlayer.closeContainer ()V
      // 0d04: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 0d07: bipush 0
      // 0d08: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.f (Z)V
      // 0d0b: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 0d0e: bipush 1
      // 0d0f: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.c (Z)V
      // 0d12: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI Lme/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll;
      // 0d15: dup
      // 0d16: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 0d19: invokeinterface me/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll.a ()Ljava/lang/String; 1
      // 0d1e: sipush -15259
      // 0d21: sipush -9365
      // 0d24: pop2
      // 0d25: ldc_w "MuseumMacro MUSEUM_INPUT requesting BIN helper for queued armor piece "
      // 0d28: swap
      // 0d29: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 0d2e: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g (Ljava/lang/String;)V
      // 0d31: return
      // 0d32: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI Lme/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll;
      // 0d35: dup
      // 0d36: ifnull 0d45
      // 0d39: invokeinterface me/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll.a ()Ljava/lang/String; 1
      // 0d3e: goto 0d47
      // 0d41: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0d44: athrow
      // 0d45: pop
      // 0d46: aconst_null
      // 0d47: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl Ljava/lang/String;
      // 0d4a: sipush -15287
      // 0d4d: sipush -19971
      // 0d50: pop2
      // 0d51: ldc_w "MuseumMacro requesting add-item helper for bought item "
      // 0d54: dup_x2
      // 0d55: pop
      // 0d56: sipush -15242
      // 0d59: sipush -17616
      // 0d5c: pop2
      // 0d5d: ldc_w " uuid="
      // 0d60: swap
      // 0d61: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001" ]
      // 0d66: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g (Ljava/lang/String;)V
      // 0d69: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 0d6c: bipush 0
      // 0d6d: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.g (Z)V
      // 0d70: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 0d73: bipush 1
      // 0d74: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.d (Z)V
      // 0d77: aload 1
      // 0d78: ifnonnull 1298
      // 0d7b: aload 0
      // 0d7c: getfield me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0d7f: ldc_w 120000
      // 0d82: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0d85: checkcast java/lang/Number
      // 0d88: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 0d8b: aload 1
      // 0d8c: ifnull 0dc4
      // 0d8f: goto 0d96
      // 0d92: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0d95: athrow
      // 0d96: ifne 0db9
      // 0d99: goto 0da0
      // 0d9c: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0d9f: athrow
      // 0da0: aload 0
      // 0da1: getfield me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll Z
      // 0da4: aload 1
      // 0da5: ifnull 0def
      // 0da8: goto 0daf
      // 0dab: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0dae: athrow
      // 0daf: ifeq 0de9
      // 0db2: goto 0db9
      // 0db5: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0db8: athrow
      // 0db9: aload 0
      // 0dba: getfield me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll Z
      // 0dbd: goto 0dc4
      // 0dc0: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0dc3: athrow
      // 0dc4: sipush -15324
      // 0dc7: sipush -9197
      // 0dca: pop2
      // 0dcb: ldc_w "MuseumMacro refreshing museum cache. firstRefresh="
      // 0dce: swap
      // 0dcf: invokedynamic makeConcatWithConstants (Ljava/lang/String;Z)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 0dd4: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g (Ljava/lang/String;)V
      // 0dd7: aload 0
      // 0dd8: bipush 0
      // 0dd9: putfield me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll Z
      // 0ddc: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII Lme/octo/client/lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll;
      // 0ddf: invokevirtual me/octo/client/lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll.d ()V
      // 0de2: aload 0
      // 0de3: getfield me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0de6: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 0de9: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 0dec: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.g ()Z
      // 0def: ifeq 0dfe
      // 0df2: aload 0
      // 0df3: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 0df6: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 0df9: return
      // 0dfa: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0dfd: athrow
      // 0dfe: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI Lme/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll;
      // 0e01: ifnonnull 1298
      // 0e04: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII Lme/octo/client/lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll;
      // 0e07: invokevirtual me/octo/client/lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll.f ()Lme/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll;
      // 0e0a: astore 2
      // 0e0b: aload 2
      // 0e0c: aload 1
      // 0e0d: ifnull 0e83
      // 0e10: ifnonnull 0e3e
      // 0e13: goto 0e1a
      // 0e16: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0e19: athrow
      // 0e1a: sipush -15253
      // 0e1d: sipush -9440
      // 0e20: pop2
      // 0e21: ldc_w "MuseumMacro found no candidate item, reparsing museum cache"
      // 0e24: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g (Ljava/lang/String;)V
      // 0e27: aload 0
      // 0e28: bipush 0
      // 0e29: putfield me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll Z
      // 0e2c: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII Lme/octo/client/lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll;
      // 0e2f: invokevirtual me/octo/client/lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll.d ()V
      // 0e32: aload 0
      // 0e33: getfield me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0e36: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 0e39: return
      // 0e3a: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0e3d: athrow
      // 0e3e: aload 2
      // 0e3f: invokeinterface me/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll.a ()Ljava/lang/String; 1
      // 0e44: aload 2
      // 0e45: invokeinterface me/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll.c ()Ljava/lang/Double; 1
      // 0e4a: aload 2
      // 0e4b: invokeinterface me/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll.d ()I 1
      // 0e50: istore 44
      // 0e52: astore 45
      // 0e54: astore 46
      // 0e56: sipush -15307
      // 0e59: sipush 18284
      // 0e5c: pop2
      // 0e5d: ldc_w "MuseumMacro evaluating candidate "
      // 0e60: aload 46
      // 0e62: sipush -15301
      // 0e65: sipush 18189
      // 0e68: pop2
      // 0e69: ldc_w " price="
      // 0e6c: aload 45
      // 0e6e: sipush -15276
      // 0e71: sipush -6129
      // 0e74: pop2
      // 0e75: ldc_w " xp="
      // 0e78: iload 44
      // 0e7a: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001\u0001" ]
      // 0e7f: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g (Ljava/lang/String;)V
      // 0e82: aload 2
      // 0e83: aload 1
      // 0e84: ifnull 0f1b
      // 0e87: invokeinterface me/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll.c ()Ljava/lang/Double; 1
      // 0e8c: dup
      // 0e8d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 0e90: invokevirtual java/lang/Double.doubleValue ()D
      // 0e93: getstatic me/octo/client/IlIIIlIIIlIIIlIIlIIllIIIIlIllIllIlIlIIllllIIlIIIIIllIIIlIlllIIIlIIllIllIlIlllIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IlIIIlIIIlIIIlIIlIIllIIIIlIllIllIlIlIIllllIIlIIIIIllIIIlIlllIIIlIIllIllIlIlllIllIllIl;
      // 0e96: invokevirtual me/octo/client/IlIIIlIIIlIIIlIIlIIllIIIIlIllIllIlIlIIllllIIlIIIIIllIIIlIlllIIIlIIllIllIlIlllIllIllIl.a ()Lme/octo/client/IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl;
      // 0e99: invokevirtual me/octo/client/IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl.M ()I
      // 0e9c: i2l
      // 0e9d: ldc2_w 1000000
      // 0ea0: lmul
      // 0ea1: l2d
      // 0ea2: dcmpl
      // 0ea3: ifgt 0f1a
      // 0ea6: goto 0ead
      // 0ea9: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0eac: athrow
      // 0ead: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl Lme/octo/client/lIllllIlIlIlIlIIIlIlIllIIlIIIlIIIIIllllIllllIIlIllIlIIllIlIlIIIllllIllIIlIIIlllIIllII;
      // 0eb0: invokevirtual me/octo/client/lIllllIlIlIlIlIIIlIlIllIIlIIIlIIIIIllllIllllIIlIllIlIIllIlIlIIIllllIllIIlIIIlllIIllII.d ()Ljava/math/BigDecimal;
      // 0eb3: new java/math/BigDecimal
      // 0eb6: dup
      // 0eb7: aload 2
      // 0eb8: invokeinterface me/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll.c ()Ljava/lang/Double; 1
      // 0ebd: dup
      // 0ebe: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 0ec1: invokevirtual java/lang/Double.doubleValue ()D
      // 0ec4: invokespecial java/math/BigDecimal.<init> (D)V
      // 0ec7: invokevirtual java/math/BigDecimal.add (Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
      // 0eca: new java/math/BigDecimal
      // 0ecd: dup
      // 0ece: getstatic me/octo/client/IlIIIlIIIlIIIlIIlIIllIIIIlIllIllIlIlIIllllIIlIIIIIllIIIlIlllIIIlIIllIllIlIlllIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IlIIIlIIIlIIIlIIlIIllIIIIlIllIllIlIlIIllllIIlIIIIIllIIIlIlllIIIlIIllIllIlIlllIllIllIl;
      // 0ed1: invokevirtual me/octo/client/IlIIIlIIIlIIIlIIlIIllIIIIlIllIllIlIlIIllllIIlIIIIIllIIIlIlllIIIlIIllIllIlIlllIllIllIl.d ()Lme/octo/client/IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl;
      // 0ed4: invokevirtual me/octo/client/IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl.M ()I
      // 0ed7: i2l
      // 0ed8: ldc2_w 1000000
      // 0edb: lmul
      // 0edc: invokespecial java/math/BigDecimal.<init> (J)V
      // 0edf: invokevirtual java/math/BigDecimal.compareTo (Ljava/math/BigDecimal;)I
      // 0ee2: aload 1
      // 0ee3: ifnull 0f0c
      // 0ee6: goto 0eed
      // 0ee9: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0eec: athrow
      // 0eed: ifgt 0f1a
      // 0ef0: goto 0ef7
      // 0ef3: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0ef6: athrow
      // 0ef7: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII Ljava/util/Set;
      // 0efa: aload 2
      // 0efb: invokeinterface me/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll.a ()Ljava/lang/String; 1
      // 0f00: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 0f05: goto 0f0c
      // 0f08: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0f0b: athrow
      // 0f0c: aload 1
      // 0f0d: ifnull 102c
      // 0f10: ifeq 1028
      // 0f13: goto 0f1a
      // 0f16: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0f19: athrow
      // 0f1a: aload 2
      // 0f1b: invokeinterface me/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll.a ()Ljava/lang/String; 1
      // 0f20: aload 2
      // 0f21: invokeinterface me/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll.c ()Ljava/lang/Double; 1
      // 0f26: dup
      // 0f27: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 0f2a: invokevirtual java/lang/Double.doubleValue ()D
      // 0f2d: getstatic me/octo/client/IlIIIlIIIlIIIlIIlIIllIIIIlIllIllIlIlIIllllIIlIIIIIllIIIlIlllIIIlIIllIllIlIlllIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IlIIIlIIIlIIIlIIlIIllIIIIlIllIllIlIlIIllllIIlIIIIIllIIIlIlllIIIlIIllIllIlIlllIllIllIl;
      // 0f30: invokevirtual me/octo/client/IlIIIlIIIlIIIlIIlIIllIIIIlIllIllIlIlIIllllIIlIIIIIllIIIlIlllIIIlIIllIllIlIlllIllIllIl.a ()Lme/octo/client/IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl;
      // 0f33: invokevirtual me/octo/client/IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl.M ()I
      // 0f36: i2l
      // 0f37: ldc2_w 1000000
      // 0f3a: lmul
      // 0f3b: l2d
      // 0f3c: dcmpl
      // 0f3d: aload 1
      // 0f3e: ifnull 0f4c
      // 0f41: ifle 0f4f
      // 0f44: goto 0f4b
      // 0f47: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0f4a: athrow
      // 0f4b: bipush 1
      // 0f4c: goto 0f50
      // 0f4f: bipush 0
      // 0f50: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl Lme/octo/client/lIllllIlIlIlIlIIIlIlIllIIlIIIlIIIIIllllIllllIIlIllIlIIllIlIlIIIllllIllIIlIIIlllIIllII;
      // 0f53: invokevirtual me/octo/client/lIllllIlIlIlIlIIIlIlIllIIlIIIlIIIIIllllIllllIIlIllIlIIllIlIlIIIllllIllIIlIIIlllIIllII.d ()Ljava/math/BigDecimal;
      // 0f56: new java/math/BigDecimal
      // 0f59: dup
      // 0f5a: aload 2
      // 0f5b: invokeinterface me/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll.c ()Ljava/lang/Double; 1
      // 0f60: dup
      // 0f61: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 0f64: invokevirtual java/lang/Double.doubleValue ()D
      // 0f67: invokespecial java/math/BigDecimal.<init> (D)V
      // 0f6a: invokevirtual java/math/BigDecimal.add (Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
      // 0f6d: new java/math/BigDecimal
      // 0f70: dup
      // 0f71: getstatic me/octo/client/IlIIIlIIIlIIIlIIlIIllIIIIlIllIllIlIlIIllllIIlIIIIIllIIIlIlllIIIlIIllIllIlIlllIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IlIIIlIIIlIIIlIIlIIllIIIIlIllIllIlIlIIllllIIlIIIIIllIIIlIlllIIIlIIllIllIlIlllIllIllIl;
      // 0f74: invokevirtual me/octo/client/IlIIIlIIIlIIIlIIlIIllIIIIlIllIllIlIlIIllllIIlIIIIIllIIIlIlllIIIlIIllIllIlIlllIllIllIl.d ()Lme/octo/client/IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl;
      // 0f77: invokevirtual me/octo/client/IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl.M ()I
      // 0f7a: i2l
      // 0f7b: ldc2_w 1000000
      // 0f7e: lmul
      // 0f7f: invokespecial java/math/BigDecimal.<init> (J)V
      // 0f82: invokevirtual java/math/BigDecimal.compareTo (Ljava/math/BigDecimal;)I
      // 0f85: aload 1
      // 0f86: ifnull 0f94
      // 0f89: ifle 0f97
      // 0f8c: goto 0f93
      // 0f8f: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0f92: athrow
      // 0f93: bipush 1
      // 0f94: goto 0f98
      // 0f97: bipush 0
      // 0f98: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII Ljava/util/Set;
      // 0f9b: aload 2
      // 0f9c: invokeinterface me/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll.a ()Ljava/lang/String; 1
      // 0fa1: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 0fa6: istore 47
      // 0fa8: istore 48
      // 0faa: istore 49
      // 0fac: astore 50
      // 0fae: sipush -15274
      // 0fb1: sipush 22901
      // 0fb4: pop2
      // 0fb5: ldc_w "MuseumMacro rejecting candidate "
      // 0fb8: aload 50
      // 0fba: sipush -15269
      // 0fbd: sipush 13070
      // 0fc0: pop2
      // 0fc1: ldc_w " priceTooHigh="
      // 0fc4: iload 49
      // 0fc6: sipush -15245
      // 0fc9: sipush 17959
      // 0fcc: pop2
      // 0fcd: ldc_w " budgetExceeded="
      // 0fd0: iload 48
      // 0fd2: sipush -15256
      // 0fd5: sipush -9255
      // 0fd8: pop2
      // 0fd9: ldc_w " skipItem="
      // 0fdc: iload 47
      // 0fde: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Z)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" ]
      // 0fe3: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g (Ljava/lang/String;)V
      // 0fe6: aload 1
      // 0fe7: ifnull 1020
      // 0fea: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII Lme/octo/client/lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll;
      // 0fed: aload 2
      // 0fee: invokevirtual me/octo/client/lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll.a (Lme/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll;)Z
      // 0ff1: ifeq 1024
      // 0ff4: goto 0ffb
      // 0ff7: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0ffa: athrow
      // 0ffb: sipush -15239
      // 0ffe: sipush -17492
      // 1001: pop2
      // 1002: ldc_w "You don't have enough money."
      // 1005: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.h (Ljava/lang/String;)V
      // 1008: sipush -15272
      // 100b: sipush 9794
      // 100e: pop2
      // 100f: ldc_w "MuseumMacro disabling because cheapest candidate is not affordable"
      // 1012: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g (Ljava/lang/String;)V
      // 1015: aload 0
      // 1016: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.N ()V
      // 1019: goto 1020
      // 101c: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 101f: athrow
      // 1020: aload 1
      // 1021: ifnonnull 0dfe
      // 1024: aload 1
      // 1025: ifnonnull 0dfe
      // 1028: aload 2
      // 1029: instanceof me/octo/client/IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl
      // 102c: aload 1
      // 102d: ifnull 125b
      // 1030: ifeq 1212
      // 1033: goto 103a
      // 1036: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 1039: athrow
      // 103a: aload 2
      // 103b: checkcast me/octo/client/IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl
      // 103e: invokevirtual me/octo/client/IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl.k ()Ljava/util/Set;
      // 1041: astore 3
      // 1042: aload 3
      // 1043: checkcast java/lang/Iterable
      // 1046: astore 4
      // 1048: bipush 0
      // 1049: istore 5
      // 104b: aload 4
      // 104d: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 1052: astore 6
      // 1054: aload 6
      // 1056: aload 1
      // 1057: ifnull 107c
      // 105a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 105f: ifne 1075
      // 1062: goto 1069
      // 1065: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 1068: athrow
      // 1069: new java/util/NoSuchElementException
      // 106c: dup
      // 106d: invokespecial java/util/NoSuchElementException.<init> ()V
      // 1070: athrow
      // 1071: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 1074: athrow
      // 1075: aload 6
      // 1077: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 107c: astore 8
      // 107e: aload 6
      // 1080: aload 1
      // 1081: ifnull 109e
      // 1084: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1089: ifne 109c
      // 108c: goto 1093
      // 108f: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 1092: athrow
      // 1093: aload 8
      // 1095: goto 10f7
      // 1098: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 109b: athrow
      // 109c: aload 8
      // 109e: checkcast me/octo/client/IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII
      // 10a1: astore 9
      // 10a3: bipush 0
      // 10a4: istore 11
      // 10a6: aload 9
      // 10a8: invokevirtual me/octo/client/IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII.c ()Ljava/lang/Double;
      // 10ab: dup
      // 10ac: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 10af: invokevirtual java/lang/Double.doubleValue ()D
      // 10b2: dstore 9
      // 10b4: aload 6
      // 10b6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 10bb: astore 11
      // 10bd: aload 11
      // 10bf: checkcast me/octo/client/IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII
      // 10c2: astore 12
      // 10c4: bipush 0
      // 10c5: istore 14
      // 10c7: aload 12
      // 10c9: invokevirtual me/octo/client/IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII.c ()Ljava/lang/Double;
      // 10cc: dup
      // 10cd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 10d0: invokevirtual java/lang/Double.doubleValue ()D
      // 10d3: dstore 12
      // 10d5: dload 9
      // 10d7: dload 12
      // 10d9: invokestatic java/lang/Double.compare (DD)I
      // 10dc: ifle 10e7
      // 10df: aload 11
      // 10e1: astore 8
      // 10e3: dload 12
      // 10e5: dstore 9
      // 10e7: aload 6
      // 10e9: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 10ee: ifne 10b4
      // 10f1: aload 1
      // 10f2: ifnull 10e3
      // 10f5: aload 8
      // 10f7: checkcast me/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll
      // 10fa: putstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI Lme/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll;
      // 10fd: aload 3
      // 10fe: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI Lme/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll;
      // 1101: dup
      // 1102: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 1105: invokestatic kotlin/collections/SetsKt.minus (Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;
      // 1108: putstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll Ljava/util/Set;
      // 110b: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl Ljava/util/List;
      // 110e: invokeinterface java/util/List.clear ()V 1
      // 1113: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl Ljava/util/List;
      // 1116: aload 0
      // 1117: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.ap ()Lnet/minecraft/client/Minecraft;
      // 111a: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 111d: dup
      // 111e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 1121: invokevirtual net/minecraft/client/player/LocalPlayer.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 1124: dup
      // 1125: sipush -15316
      // 1128: sipush 11412
      // 112b: pop2
      // 112c: ldc_w "null cannot be cast to non-null type me.octo.client.mixin.accessors.InventoryAccessor"
      // 112f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
      // 1132: checkcast me/octo/client/mixin/accessors/InventoryAccessor
      // 1135: invokeinterface me/octo/client/mixin/accessors/InventoryAccessor.getItems ()Lnet/minecraft/core/NonNullList; 1
      // 113a: dup
      // 113b: sipush -15273
      // 113e: sipush -14615
      // 1141: pop2
      // 1142: ldc_w "getItems(...)"
      // 1145: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1148: checkcast java/util/Collection
      // 114b: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 1150: pop
      // 1151: aload 0
      // 1152: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.ap ()Lnet/minecraft/client/Minecraft;
      // 1155: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 1158: dup
      // 1159: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 115c: invokevirtual net/minecraft/client/player/LocalPlayer.closeContainer ()V
      // 115f: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 1162: bipush 0
      // 1163: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.f (Z)V
      // 1166: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 1169: bipush 1
      // 116a: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.c (Z)V
      // 116d: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI Lme/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll;
      // 1170: dup
      // 1171: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 1174: invokeinterface me/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll.a ()Ljava/lang/String; 1
      // 1179: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll Ljava/util/Set;
      // 117c: checkcast java/lang/Iterable
      // 117f: astore 4
      // 1181: astore 18
      // 1183: bipush 0
      // 1184: istore 5
      // 1186: aload 4
      // 1188: astore 6
      // 118a: new java/util/ArrayList
      // 118d: dup
      // 118e: aload 4
      // 1190: bipush 10
      // 1192: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
      // 1195: invokespecial java/util/ArrayList.<init> (I)V
      // 1198: checkcast java/util/Collection
      // 119b: astore 8
      // 119d: bipush 0
      // 119e: istore 9
      // 11a0: aload 6
      // 11a2: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 11a7: astore 11
      // 11a9: aload 11
      // 11ab: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 11b0: ifeq 11e9
      // 11b3: aload 11
      // 11b5: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 11ba: astore 12
      // 11bc: aload 8
      // 11be: aload 12
      // 11c0: checkcast me/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll
      // 11c3: astore 14
      // 11c5: astore 19
      // 11c7: bipush 0
      // 11c8: istore 15
      // 11ca: aload 14
      // 11cc: invokeinterface me/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll.a ()Ljava/lang/String; 1
      // 11d1: aload 19
      // 11d3: swap
      // 11d4: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 11d9: pop
      // 11da: aload 1
      // 11db: ifnull 1211
      // 11de: aload 1
      // 11df: ifnonnull 11a9
      // 11e2: goto 11e9
      // 11e5: invokestatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 11e8: athrow
      // 11e9: aload 8
      // 11eb: checkcast java/util/List
      // 11ee: nop
      // 11ef: aload 18
      // 11f1: swap
      // 11f2: sipush -15281
      // 11f5: sipush -10531
      // 11f8: pop2
      // 11f9: ldc_w "MuseumMacro requesting BIN helper for armor set piece "
      // 11fc: dup_x2
      // 11fd: pop
      // 11fe: sipush -15275
      // 1201: sipush 8163
      // 1204: pop2
      // 1205: ldc_w "; queued="
      // 1208: swap
      // 1209: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001" ]
      // 120e: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g (Ljava/lang/String;)V
      // 1211: return
      // 1212: aload 2
      // 1213: putstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI Lme/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll;
      // 1216: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl Ljava/util/List;
      // 1219: invokeinterface java/util/List.clear ()V 1
      // 121e: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl Ljava/util/List;
      // 1221: aload 0
      // 1222: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.ap ()Lnet/minecraft/client/Minecraft;
      // 1225: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 1228: dup
      // 1229: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 122c: invokevirtual net/minecraft/client/player/LocalPlayer.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 122f: dup
      // 1230: sipush -15316
      // 1233: sipush 11412
      // 1236: pop2
      // 1237: ldc_w "null cannot be cast to non-null type me.octo.client.mixin.accessors.InventoryAccessor"
      // 123a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
      // 123d: checkcast me/octo/client/mixin/accessors/InventoryAccessor
      // 1240: invokeinterface me/octo/client/mixin/accessors/InventoryAccessor.getItems ()Lnet/minecraft/core/NonNullList; 1
      // 1245: dup
      // 1246: sipush -15273
      // 1249: sipush -14615
      // 124c: pop2
      // 124d: ldc_w "getItems(...)"
      // 1250: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1253: checkcast java/util/Collection
      // 1256: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 125b: pop
      // 125c: aload 0
      // 125d: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.ap ()Lnet/minecraft/client/Minecraft;
      // 1260: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 1263: dup
      // 1264: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 1267: invokevirtual net/minecraft/client/player/LocalPlayer.closeContainer ()V
      // 126a: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 126d: bipush 0
      // 126e: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.f (Z)V
      // 1271: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 1274: bipush 1
      // 1275: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.c (Z)V
      // 1278: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI Lme/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll;
      // 127b: dup
      // 127c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 127f: invokeinterface me/octo/client/lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll.a ()Ljava/lang/String; 1
      // 1284: sipush -15304
      // 1287: sipush -4024
      // 128a: pop2
      // 128b: ldc_w "MuseumMacro requesting BIN helper for "
      // 128e: swap
      // 128f: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 1294: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g (Ljava/lang/String;)V
      // 1297: return
      // 1298: return
   }

   @SubscribeEvent
   public final void c(@NotNull IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll param1) {
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "event");
      Object var2 = param1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      if (!(var2 instanceof net.minecraft.network.protocol.game.ClientboundSystemChatPacket)) {
         return;
      }
      String var3 = ((net.minecraft.network.protocol.game.ClientboundSystemChatPacket)var2).content().getString();
      kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var3, "getString(...)");
      if (!var3.startsWith("You need the Cookie Buff active to use this feature!") && !var3.startsWith("You can only open the personal bank every")) {
         return;
      }
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.h("Personal bank not available. Disable the \"Use Bank\" feature.");
      this.N();
   }

   @SubscribeEvent
   public final void a(@NotNull llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI param1) {
      var var2 = me.octo.client.lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.k();
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "event");
      boolean var4;
      if (var2 == null) {
        var4 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m();
      } else {
        if (!me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m()) {
          return;
        }
        var4 = this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.a(java.lang.Integer.valueOf(500));
      }
      if (!var4) {
        return;
      }
      var var3 = param1.m();
   }

   @Override
   public void M() {
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("MuseumMacro enabled");
      this.a(new me.octo.client.lIllllIllllIIllIlIllIlIlIIIIlIIlllllllIlIIIIIIlIlIlIIIlIIIIllIllllIllllIIIlllIIIIlIlI(me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, 2000, new net.minecraft.world.phys.Vec3(-29.5D, 72.0D, 1.5D), "/warp museum"));
      me.octo.client.lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = new me.octo.client.lIllllIlIlIlIlIIIlIlIllIIlIIIlIIIIIllllIllllIIlIllIlIIllIlIlIIIllllIllIIlIIIlllIIllII(false, java.math.BigDecimal.ZERO, false, java.math.BigDecimal.ZERO);
      me.octo.client.lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = new me.octo.client.lIIIIIIIIlIlIlIlIIIlIlIllIIIlIIllIIllIlIlIIlIIIlIlIIIIIIIIllIllIIllllllIlIIlIIllIIlIl(0, 0, (me.octo.client.IIlIIIIlIIlllIIllIlIIllIllllllIIIIIIllIIIIIllIlllllIIllIIlIlIlllllIIIllIIIIIllIIIllIl) null);
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = false;
      me.octo.client.llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.e(false);
      me.octo.client.llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.f(false);
      me.octo.client.llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.g(false);
      me.octo.client.lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl = null;
      this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.d();
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = me.octo.client.lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.k();
      this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = false;
      this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl = 0;
      this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = (me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll) null;
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = -1;
      this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = 0;
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = (net.minecraft.world.phys.Vec3) null;
      this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII.f();
      if (var1 != null) {
         if (!me.octo.client.IlIIIlIIIlIIIlIIlIIllIIIIlIllIllIlIlIIllllIIlIIIIIllIIIlIlllIIIlIIllIllIlIlllIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b().ae()) {
            me.octo.client.lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl.a(true);
         }
         this.aM();
      }
      me.octo.client.llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI[] var2 = new me.octo.client.llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI[4];
      var2[0] = new me.octo.client.llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(me.octo.client.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII, () -> ba(), true);
      var2[1] = new me.octo.client.llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(me.octo.client.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI, () -> bb(), true);
      var2[2] = new me.octo.client.llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(me.octo.client.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, () -> bc(), true);
      var2[3] = new me.octo.client.llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(me.octo.client.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI, () -> bd(), true);
      this.a(kotlin.collections.CollectionsKt.listOf(var2));
      super.M();
      me.octo.client.lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl.clear();
      me.octo.client.lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = null;
      me.octo.client.lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = kotlin.collections.SetsKt.emptySet();
      me.octo.client.lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = new java.util.LinkedHashSet();
      this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll.f();
      this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = true;
      this.a(me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      if (var1 == null) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[5]);
      }
   }

   @Override
   public void ah() {
      boolean var2 = me.octo.client.llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a();
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = me.octo.client.lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.k();
      boolean var3 = me.octo.client.llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b();
      boolean var4 = me.octo.client.llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
      boolean var5 = me.octo.client.llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d();
      String var9 = var1 != null
            ? me.octo.client.llIIlIlllIlIllIllIllIlIlIlllllIlllIIIIlIIllIIIlIllIlIlIlIIIIIIlllIlIlllIlllIllIlIlIIl.a().getClass().getSimpleName()
            : "none";
      boolean var8 = me.octo.client.llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.e();
      boolean var7 = me.octo.client.llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.f();
      boolean var6 = me.octo.client.llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.g();
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("MuseumMacro helper completed. currentHelper=" + var9 + " museumScanned=" + var8 + " needGui=" + var7 + " itemBought=" + var6);
      me.octo.client.llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(false);
      me.octo.client.llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(false);
      me.octo.client.llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(false);
      me.octo.client.llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d(false);
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var10 = var2 ? IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII : (var3 ? IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll : (var4 ? IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll : (var5 ? IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll : IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII)));
      this.a(var10);
   }

   @Override
   public void N() {
      Object var1 = this.W();
      boolean var4 = this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII;
      int var7 = this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
      boolean var5 = llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.e();
      boolean var6 = llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.f();
      boolean var8 = llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.g();
      String var2 = this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
      String var3 = var1 == null
         ? null
         : ((me.octo.client.lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll) this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI).a();
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
         "MuseumMacro onDisable. state=" + var1 + " travelStarted=" + var8 + " eleanorRetries=" + var7
            + " museumScanned=" + var6 + " needGui=" + var5 + " itemBought=" + var4 + " toBuy=" + var3
            + " boughtItemUUID=" + var2);
      this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.d();
      this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll.d();
      llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(false);
      llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(false);
      llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(false);
      llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d(false);
      llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.e(false);
      llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.f(false);
      llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.g(false);
      this.a(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = false;
      this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl = 0;
      this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = null;
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = -1;
      this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = 0;
      this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = 0;
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = null;
      this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII.f();
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = false;
      lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl = null;
      lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = null;
      lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = kotlin.collections.SetsKt.emptySet();
      lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl.clear();
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .e().k();
      me.octo.client.utils.player.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g();
      this.aN();
      super.N();
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[3]);
      }
   }

   private static final Triple a(Entity var0) {
      short var10001 = -15262;
      short var10002 = 17875;
      Intrinsics.checkNotNullParameter(var0, "entity");
      IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var10000 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      String var2 = var0.getName().getString();
      short var10003 = -15264;
      short var10004 = 7267;
      Intrinsics.checkNotNullExpressionValue(var2, "getString(...)");
      String var1 = var10000.a(var2);
      return new Triple(
         var0,
         var1,
         IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(var0), true)
      );
   }

   private static final boolean a(Triple param0) {
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param0, "<destruct>");
      String var2 = (String) param0.component2();
      double var3 = ((Number) param0.component3()).doubleValue();
      if (var3 >= 12.0) { return false; }
      if (kotlin.text.StringsKt.contains(var2, "Eleanor", false)) { return true; }
      if (kotlin.text.StringsKt.contains(var2, "Goldsworth", false)) { return true; }
      return false;
   }

   private static final CharSequence b(Triple var0) {
      short var10001 = -15235;
      short var10002 = -29707;
      Intrinsics.checkNotNullParameter(var0, "<destruct>");
      Object var10000 = var0.component1();
      var10002 = -15315;
      short var10003 = -2747;
      Intrinsics.checkNotNullExpressionValue(var10000, "component1(...)");
      Entity var1 = (Entity)var10000;
      String var2 = (String)var0.component2();
      double var3 = ((Number)var0.component3()).doubleValue();
      var10000 = var1.getClass().getSimpleName();
      var10002 = -15320;
      var10003 = 29595;
      String var5 = "%.2f";
      Object[] var6 = new Object[]{var3};
      String var13 = String.format(var5, Arrays.copyOf(var6, var6.length));
      short var10004 = -15300;
      short var10005 = 21653;
      Intrinsics.checkNotNullExpressionValue(var13, "format(...)");
      Vec3 var7 = llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(var1);
      String var8 = var13;
      var10005 = -15247;
      short var10006 = -30374;
      return var10000 + ":" + var2 + "@" + var8 + " pos=" + var7;
   }

   private static final boolean ba() {
      return llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
   }

   private static final boolean bb() {
      return llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b();
   }

   private static final boolean bc() {
      return llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .c();
   }

   private static final boolean bd() {
      return llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .d();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[92];
      int var3 = 0;
      String var2 = "ûëî\u0001\u0083§\u0085\u0089\u0006\bb+\u009fGgebÛ/\u0095¥ílú\u0002Á\u0019eA \u0094\u0091Ë{C\u0014\u00ad)\u009b¥rÔÀü\u001a.¾\u0089ûÝ\u009dá;êqvÏ¡\u0005\u00ad(òËÒ\tJ\u001e·¨·f\u0095\u0089ícé\u0002ÁÓ\u0018gT¤N\u0000\u008c\u000bnÓ9ó2\u00adÞ7¯¢\u001bín\u00180ÕÅ\"³²ç*¢Â¡%\u0082\u009dò\u0099\u008d\u0011 ¯8\u009f\u008c¨l 'RTö\u0005ãä\u001dæïÂ\u0019;\u0082ÑÁFfO9\u0094\u0091«\u0090_ÕÃ¹¥\u008eõaÖÌçí\u009bV\u008fe·ìïA\u009fNñ=\u0007v=MÝ\"Ô¦þ¡>\u0081\u0002\u0002/Ï\u008b\u009f¼s±Þ\"·\fÈÑ´\u0013\u009d]Ã&ú|õ\u001d7\nQÐVDM}Ô\u0019£\u0081^ãéý¦\u009c|¤EZ<ò\u0001;4\u0095G \u009cP{úëÕzÀ\u00019\u0098 äû.\u0086L<A®Ä\"\u0016.«ß\nö\u0097\u0097D²¦?\rAS\u000bt\fÀ\\¶\u0080\u0091UP\u0085w+\r¤ù¸¶»z|\u009d\u0015<P\u0084êá$²ÆÇÙJE*ïEpæ%L\nÊ'>t\u001a:Öº¼ /Å\nF_ûz\u0003\u0011ç×\u0081L\t+\u000b\u0089sZå!Þ²UÏF\u001aÀ^\u0082©~UÄ\u0004çÂK\u00186û\u00adùÃóZ«Ã÷¶!¯\fñ\u0012uÑ¢·\u009b\u0095«=á±Lç÷\u0081µé§²¸.ÝÑ*F\u001bO\u0096\u0094d«._\u0016ÉS´VüAÈßæI3®\u0010Ðâ³*\fæÚ>yS¸´2¼Ø¢\\/¥ó\u0007?fª¶\u0094\u0086\u0017\u0006ËrÂFàÖ\nóO¦°_Z\u0007È~.\u000e¦Á-`\u001ddS\u0002xÍh\u008cë0\u0007¾ÓY8º\u0006å%\u000b£ð\b@\u0086ý\u00ad\t\u008c\u0083»¢Dô1¡±\u009662å!!¬:bÍ\u0005Ã|Uè:Àó\u008d\n\u008eP\tSª&¹G©ß\u0006ÏãºpIÐ\u0004³L¿ü\u001eÊ\u0099ÈOGn\u001d°\u0015/\u0000ÏÅ×ÿû\u0085)¨À-b\u000f¤«\"ñ\u00053.\u001c7\u001cçãu\u0014Kû\u008f\u009a¡ \u0004OÄtÔêz\u009b\u009f\u0004ÊÍ5h_\u0089\n¹ë5$Ñ®à\u008d!C>&ZU7ôakQÛ\u0013ÙHó \u0092óÜ\u0014ò\u0098[[yî\u0011¦ì\u009b\u009bb=\u0006\u0011Dc\u0085ÿãw.:Ð\u0004eª¾ \u0011ñ¯¼M=;\f§\u0005¤\u0085\u0090AÅ\u0006N\u0082\u009e Z^\u000f\u009b\u000f$\u0090\fYF\u007fZ±è#øÀ7#n\u0082\\,Õ\u0002O=_\u009eIùû\u001dÒ>Þ¸\u0087ªz$6\n\u0084Ð\u0091¨L{ÇÃ\\eÈ\u0010^\u0011\u009cª\u0019û¿/DmXñ\u0085ñàûUj;\u0084\u0012gãÊÁKò|Ê4{TôÉ 6\u001a+Ô\u008epXõ\u0087\u0010Ñü\u008b\u009cÒí³R\u0019è Å\u0091S\u0018;ÑD\u008bÍ\u0096O^b\u009eøHQÌq]d³ÅiÞn²þr¨¨ßâ+#\u009fÏkXi\u0007\u0085ª)D\u0096\u0005\u0001\"m\u008b$\u0019}b÷`w B\u001f\u009aoÔÑ\u009c\u0083^\n\u0017D\u009c#p\u001f\u001d4Í6\u009d\u0082\",\u001a\u0002¶=`\u009e®ù\u0006\u001dQ.\u0016¯I¢Þ«iº\u0082%3(û=Àá\"ö}IF\u008dWÑé\nSÒ#Ù;ñ\u008e¯ûÔ\u0011\u0083\u000f\u001c°ÓO\u0006âw\u001aJ\u001d\u0003¬\u001ahk\n<ÏBÝì\u0007\u008c×V¨\u0013D\u0001\u0019\\}\fZüý¦\u001dþgö\u0098.4L5)³\u009dçÏ¢~¡²\u0082oòÇ\u008dÚ Ö8°\u008cAf×~\u001a\\Æ\u0016Óº°â\u0093\u00160Ì\u0011é-F\u0017ç\u0004î¹\u0016\u00127ä$\røÿ\u0098\nn÷ô\\´X´\u009a\u001bo\tfv;1ÕÊ8Fá*\u001cU\u0012\u0081ÜRñ/\u008bïZ\u0091#\u0089\u001a^\u000eR\u0012ÚÞÂy\u000eÌ`S\fPmóïÆÛ,FZÍLM Ò(Ëy'¨\u0011h\u009440¬Á½;jÞ\f@êã\u0001ê\u0004N\u0014·£\u0013\u008aìz\tÏµ¾²Lûwe9\u000f\u0080(Gt`ÅËìëÃÞm>\tï\u000fK\u000f9¸[\u001cÜÅ?æ\u00adÓÏ\u0087Ñ\u000b¿²º!\u0090¹#T\u0096Fä\fç\"ª§ô\\R(\u009e°îx\u0004$\rüS\u00159[¶\u0017\u0088eäÑ*\u0003çJ.zeð\u0082\u0006\u0082ù\u009b\u00101:h)»¡69'xJ\u0082ùjÔ\u0088\fC\u008b>\u0092fú\u0000üÔ*§+\u0007«Î8£Æ$]\u00102Ú\u000bÂ²ÈÊéæ>\u0089m\u0087x\u0097c\u000e-<õR×HÂsØ¢2DI]\u0004Ì\u0086Ü°\u0004ü ÚtBWg{\u00901\u0095ÓÏÌÀ;2¢h\u0013\u0019\u001bÀ\u0012´\u0002É\u0098~\u009cQÊw;âËÒ%}~[óÐ\u0081µV´?mmJ\u0007BY4Mä\u0018á÷ý¹Ì\u001a\u009e\u00ad\u0016\u008b\u0094aß\ruxWMR\u008f¾\u0097\u000eÇ\u0000\u000bá ²ÊÇ%¦#!\u0019\u0092\u001aðiÍ\u000f3|$ðÔ©Új\u0082\u000eóÞ\u00974\u000b+O}\tÕ&\u0091W>g\b\u008fÄ\u0004\u008b\u0006#H\u0004àâÕ)\rW²\u0013\u0014Ú¤¯ò,kD\u009ei<\fP¯r\u0090\u001e\u0092Ð\u000e\u009fF\u0085ÍP\rppn£¼;\u009awp¯\u0019\u009d\u008f\u0086o\u009b\u0090`NN^9p©§S|Ç«d\u008a17!\u001c\u0094£P\u0003â¾¸n¯\u001d\u0007KXçIm(\u001f\u0005¥ä\u001e\u0088HJ\u0099\f¢ý\n8´z v¦ä\u0011²eBÕ«ËÙ9dÿËpçW¡\u00888\u009b\u008dÍ\u0012}¼O3`\u0015Å¬\u0017ï3\u009dÌÛ%K*ì\u0001êÁ\u0085\u0089ÜcdV¾ôê\u008at\u0086óþöjÂÞ°\u000f\u009a\n7q\u007f\u001dk²áÂ,W¥LªUPÿÃ\u008a\u008fð×£è¾\bCºJ\u0085Òóäq\u0082ÃÇ\u0093\u0012û¹ó\u0099_ÍZºè)ôÊñû½§2\u001fl²_uZë¬\u008b\u0019úvëU3o=)í=ô¸øTv¹ê@»Â\u0080\u0088oëFåi¸!¿nnÜ~\tÌ\u0011Þ&@iö7\t>Ì\u009e\b¯_r\u001e3u_\fÁC\u0010ÎÝ`¸¼\u007f#\u0091Éy?9Gé|\u0084\tõ5Lg\u0007\u009c$êß#Ì\u0085¤§\u000b#g(%\u007f¯\u0081þ\u008aýÅ5-=¤p\u0011\u008eI\u009cøBö\u008bPcêIã\u008a¸¯÷L\u0004\u0098g¦£\u0005aKa¦¥\n\u001c\u001fFÇlD\u009c¿T¥;N]X×U}_Ò]c\tFôýÙÄ\u0015\u008e}p\u0087°3¼¿4x{6\u0096\u0019F\u000e§\n$TÐk¯\u0080ÞDj)\u00adÂ4n\u0010ÌÂÓÆ\u0006\u0082zôc2NcX\u0010U\u0085_Í]\u0080\t:òeØ&ÒIÍ~Ñ0\u0088æ\u0082YÍ ÁÎ\u009d^éÍ4.^ND'\u009cÏ\u0000Wx\u0093ö\u001e\u001c?\f\u0093\f5\u000b+Ñ_Ñ3@ôS\f\u009e\nB=\u0016 ZU?+\u001a3,\u0000Õ\u0091Æl_x\u0096¹ë\u0095W{Èº\u0091Õüeã\u0084ÂSò³ýùB\u0004±\u000e¥\u008a>kIáÄa\u0083¶\u0097\u00067)®\u0087D\u008cÖ\u0016/¿SÎÈóÖ\\Ä\u0001±§\u000eÄêÌì8}à#/Y^\f/\u001b\u008c½\u0087\bÛ\\z\\\u001d\u0096PCv6I3TÐ³¸\\Ù¢!¯\u009d\u0012ú@w\u001b6ýTõ'õÿ46\u0095ÇÒ{8Êv\u0081T¾#±\u008d¡ÄÛ±.q-£øÏW\u0004\u008eÚkæJ\u0086Â¸á<Z?´lù}õúÃÜ\u0085\u0005ëôò\u0085 'Ò\"Ó\u0083àw\u008bü\u0087¦\u0097¦\"¶\u001dt\u009a\u0019!yL\u0089lG\u009fRµõ¦ Ù\u000bú\u001e\u0081î[JmA\u009fëó\u0007yÿ\u007f*\u0086G\u0081\u0005³\u0094Ü\u0086\u0010\u000e\u0006s9&\u008e¢\u000fNX.Ûð\u009d¿&\u008cÀ\u0000d^\u000b>\u001cqº\u008c}B\u008dÙ<\u0007íkê\u009a¢á\u009b\u0093\u0001\u0011¬¿\u00adHó3´_\u0001\u0002\u0084\u0003¤U\u0096\u000e\u009fs\n6ù®Ï[ëæ\u001aé¥\u009c";
      int var4 = "ûëî\u0001\u0083§\u0085\u0089\u0006\bb+\u009fGgebÛ/\u0095¥ílú\u0002Á\u0019eA \u0094\u0091Ë{C\u0014\u00ad)\u009b¥rÔÀü\u001a.¾\u0089ûÝ\u009dá;êqvÏ¡\u0005\u00ad(òËÒ\tJ\u001e·¨·f\u0095\u0089ícé\u0002ÁÓ\u0018gT¤N\u0000\u008c\u000bnÓ9ó2\u00adÞ7¯¢\u001bín\u00180ÕÅ\"³²ç*¢Â¡%\u0082\u009dò\u0099\u008d\u0011 ¯8\u009f\u008c¨l 'RTö\u0005ãä\u001dæïÂ\u0019;\u0082ÑÁFfO9\u0094\u0091«\u0090_ÕÃ¹¥\u008eõaÖÌçí\u009bV\u008fe·ìïA\u009fNñ=\u0007v=MÝ\"Ô¦þ¡>\u0081\u0002\u0002/Ï\u008b\u009f¼s±Þ\"·\fÈÑ´\u0013\u009d]Ã&ú|õ\u001d7\nQÐVDM}Ô\u0019£\u0081^ãéý¦\u009c|¤EZ<ò\u0001;4\u0095G \u009cP{úëÕzÀ\u00019\u0098 äû.\u0086L<A®Ä\"\u0016.«ß\nö\u0097\u0097D²¦?\rAS\u000bt\fÀ\\¶\u0080\u0091UP\u0085w+\r¤ù¸¶»z|\u009d\u0015<P\u0084êá$²ÆÇÙJE*ïEpæ%L\nÊ'>t\u001a:Öº¼ /Å\nF_ûz\u0003\u0011ç×\u0081L\t+\u000b\u0089sZå!Þ²UÏF\u001aÀ^\u0082©~UÄ\u0004çÂK\u00186û\u00adùÃóZ«Ã÷¶!¯\fñ\u0012uÑ¢·\u009b\u0095«=á±Lç÷\u0081µé§²¸.ÝÑ*F\u001bO\u0096\u0094d«._\u0016ÉS´VüAÈßæI3®\u0010Ðâ³*\fæÚ>yS¸´2¼Ø¢\\/¥ó\u0007?fª¶\u0094\u0086\u0017\u0006ËrÂFàÖ\nóO¦°_Z\u0007È~.\u000e¦Á-`\u001ddS\u0002xÍh\u008cë0\u0007¾ÓY8º\u0006å%\u000b£ð\b@\u0086ý\u00ad\t\u008c\u0083»¢Dô1¡±\u009662å!!¬:bÍ\u0005Ã|Uè:Àó\u008d\n\u008eP\tSª&¹G©ß\u0006ÏãºpIÐ\u0004³L¿ü\u001eÊ\u0099ÈOGn\u001d°\u0015/\u0000ÏÅ×ÿû\u0085)¨À-b\u000f¤«\"ñ\u00053.\u001c7\u001cçãu\u0014Kû\u008f\u009a¡ \u0004OÄtÔêz\u009b\u009f\u0004ÊÍ5h_\u0089\n¹ë5$Ñ®à\u008d!C>&ZU7ôakQÛ\u0013ÙHó \u0092óÜ\u0014ò\u0098[[yî\u0011¦ì\u009b\u009bb=\u0006\u0011Dc\u0085ÿãw.:Ð\u0004eª¾ \u0011ñ¯¼M=;\f§\u0005¤\u0085\u0090AÅ\u0006N\u0082\u009e Z^\u000f\u009b\u000f$\u0090\fYF\u007fZ±è#øÀ7#n\u0082\\,Õ\u0002O=_\u009eIùû\u001dÒ>Þ¸\u0087ªz$6\n\u0084Ð\u0091¨L{ÇÃ\\eÈ\u0010^\u0011\u009cª\u0019û¿/DmXñ\u0085ñàûUj;\u0084\u0012gãÊÁKò|Ê4{TôÉ 6\u001a+Ô\u008epXõ\u0087\u0010Ñü\u008b\u009cÒí³R\u0019è Å\u0091S\u0018;ÑD\u008bÍ\u0096O^b\u009eøHQÌq]d³ÅiÞn²þr¨¨ßâ+#\u009fÏkXi\u0007\u0085ª)D\u0096\u0005\u0001\"m\u008b$\u0019}b÷`w B\u001f\u009aoÔÑ\u009c\u0083^\n\u0017D\u009c#p\u001f\u001d4Í6\u009d\u0082\",\u001a\u0002¶=`\u009e®ù\u0006\u001dQ.\u0016¯I¢Þ«iº\u0082%3(û=Àá\"ö}IF\u008dWÑé\nSÒ#Ù;ñ\u008e¯ûÔ\u0011\u0083\u000f\u001c°ÓO\u0006âw\u001aJ\u001d\u0003¬\u001ahk\n<ÏBÝì\u0007\u008c×V¨\u0013D\u0001\u0019\\}\fZüý¦\u001dþgö\u0098.4L5)³\u009dçÏ¢~¡²\u0082oòÇ\u008dÚ Ö8°\u008cAf×~\u001a\\Æ\u0016Óº°â\u0093\u00160Ì\u0011é-F\u0017ç\u0004î¹\u0016\u00127ä$\røÿ\u0098\nn÷ô\\´X´\u009a\u001bo\tfv;1ÕÊ8Fá*\u001cU\u0012\u0081ÜRñ/\u008bïZ\u0091#\u0089\u001a^\u000eR\u0012ÚÞÂy\u000eÌ`S\fPmóïÆÛ,FZÍLM Ò(Ëy'¨\u0011h\u009440¬Á½;jÞ\f@êã\u0001ê\u0004N\u0014·£\u0013\u008aìz\tÏµ¾²Lûwe9\u000f\u0080(Gt`ÅËìëÃÞm>\tï\u000fK\u000f9¸[\u001cÜÅ?æ\u00adÓÏ\u0087Ñ\u000b¿²º!\u0090¹#T\u0096Fä\fç\"ª§ô\\R(\u009e°îx\u0004$\rüS\u00159[¶\u0017\u0088eäÑ*\u0003çJ.zeð\u0082\u0006\u0082ù\u009b\u00101:h)»¡69'xJ\u0082ùjÔ\u0088\fC\u008b>\u0092fú\u0000üÔ*§+\u0007«Î8£Æ$]\u00102Ú\u000bÂ²ÈÊéæ>\u0089m\u0087x\u0097c\u000e-<õR×HÂsØ¢2DI]\u0004Ì\u0086Ü°\u0004ü ÚtBWg{\u00901\u0095ÓÏÌÀ;2¢h\u0013\u0019\u001bÀ\u0012´\u0002É\u0098~\u009cQÊw;âËÒ%}~[óÐ\u0081µV´?mmJ\u0007BY4Mä\u0018á÷ý¹Ì\u001a\u009e\u00ad\u0016\u008b\u0094aß\ruxWMR\u008f¾\u0097\u000eÇ\u0000\u000bá ²ÊÇ%¦#!\u0019\u0092\u001aðiÍ\u000f3|$ðÔ©Új\u0082\u000eóÞ\u00974\u000b+O}\tÕ&\u0091W>g\b\u008fÄ\u0004\u008b\u0006#H\u0004àâÕ)\rW²\u0013\u0014Ú¤¯ò,kD\u009ei<\fP¯r\u0090\u001e\u0092Ð\u000e\u009fF\u0085ÍP\rppn£¼;\u009awp¯\u0019\u009d\u008f\u0086o\u009b\u0090`NN^9p©§S|Ç«d\u008a17!\u001c\u0094£P\u0003â¾¸n¯\u001d\u0007KXçIm(\u001f\u0005¥ä\u001e\u0088HJ\u0099\f¢ý\n8´z v¦ä\u0011²eBÕ«ËÙ9dÿËpçW¡\u00888\u009b\u008dÍ\u0012}¼O3`\u0015Å¬\u0017ï3\u009dÌÛ%K*ì\u0001êÁ\u0085\u0089ÜcdV¾ôê\u008at\u0086óþöjÂÞ°\u000f\u009a\n7q\u007f\u001dk²áÂ,W¥LªUPÿÃ\u008a\u008fð×£è¾\bCºJ\u0085Òóäq\u0082ÃÇ\u0093\u0012û¹ó\u0099_ÍZºè)ôÊñû½§2\u001fl²_uZë¬\u008b\u0019úvëU3o=)í=ô¸øTv¹ê@»Â\u0080\u0088oëFåi¸!¿nnÜ~\tÌ\u0011Þ&@iö7\t>Ì\u009e\b¯_r\u001e3u_\fÁC\u0010ÎÝ`¸¼\u007f#\u0091Éy?9Gé|\u0084\tõ5Lg\u0007\u009c$êß#Ì\u0085¤§\u000b#g(%\u007f¯\u0081þ\u008aýÅ5-=¤p\u0011\u008eI\u009cøBö\u008bPcêIã\u008a¸¯÷L\u0004\u0098g¦£\u0005aKa¦¥\n\u001c\u001fFÇlD\u009c¿T¥;N]X×U}_Ò]c\tFôýÙÄ\u0015\u008e}p\u0087°3¼¿4x{6\u0096\u0019F\u000e§\n$TÐk¯\u0080ÞDj)\u00adÂ4n\u0010ÌÂÓÆ\u0006\u0082zôc2NcX\u0010U\u0085_Í]\u0080\t:òeØ&ÒIÍ~Ñ0\u0088æ\u0082YÍ ÁÎ\u009d^éÍ4.^ND'\u009cÏ\u0000Wx\u0093ö\u001e\u001c?\f\u0093\f5\u000b+Ñ_Ñ3@ôS\f\u009e\nB=\u0016 ZU?+\u001a3,\u0000Õ\u0091Æl_x\u0096¹ë\u0095W{Èº\u0091Õüeã\u0084ÂSò³ýùB\u0004±\u000e¥\u008a>kIáÄa\u0083¶\u0097\u00067)®\u0087D\u008cÖ\u0016/¿SÎÈóÖ\\Ä\u0001±§\u000eÄêÌì8}à#/Y^\f/\u001b\u008c½\u0087\bÛ\\z\\\u001d\u0096PCv6I3TÐ³¸\\Ù¢!¯\u009d\u0012ú@w\u001b6ýTõ'õÿ46\u0095ÇÒ{8Êv\u0081T¾#±\u008d¡ÄÛ±.q-£øÏW\u0004\u008eÚkæJ\u0086Â¸á<Z?´lù}õúÃÜ\u0085\u0005ëôò\u0085 'Ò\"Ó\u0083àw\u008bü\u0087¦\u0097¦\"¶\u001dt\u009a\u0019!yL\u0089lG\u009fRµõ¦ Ù\u000bú\u001e\u0081î[JmA\u009fëó\u0007yÿ\u007f*\u0086G\u0081\u0005³\u0094Ü\u0086\u0010\u000e\u0006s9&\u008e¢\u000fNX.Ûð\u009d¿&\u008cÀ\u0000d^\u000b>\u001cqº\u008c}B\u008dÙ<\u0007íkê\u009a¢á\u009b\u0093\u0001\u0011¬¿\u00adHó3´_\u0001\u0002\u0084\u0003¤U\u0096\u000e\u009fs\n6ù®Ï[ëæ\u001aé¥\u009c"
         .length();
      char var1 = '%';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 123;
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
               byte var33;
               char[] var37;
               int var10006;
               if (var10004 <= 1) {
                  var37 = var24;
                  var33 = var10000;
                  var10006 = var6;
               } else {
                  var27 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var37 = var24;
                  var33 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var37[var10006] = (char)(var37[var10006] ^ var33 ^ switch (var6 % 7) {
                     case 0 -> 66;
                     case 1 -> 110;
                     case 2 -> 90;
                     case 3 -> 27;
                     case 4 -> 105;
                     case 5 -> 84;
                     default -> 90;
                  });
                  var6++;
                  if (var27 == 0) {
                     var10006 = var27;
                     var37 = var20;
                     var33 = var27;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var37 = var20;
                     var33 = var27;
                     var10006 = var6;
                  }
               }
            }

            String var29 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var29;
                  if ((var8 += var1) >= var4) {
                     h = var5;
                     i = new String[92];
                     lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = new lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII = new lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl();
                     IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = new BlockPos(33, 72, 11);
                     BigDecimal var30 = BigDecimal.ZERO;
                     short var41 = -15271;
                     short var46 = -32207;
                     Intrinsics.checkNotNullExpressionValue(BigDecimal.ZERO, "ZERO");
                     BigDecimal var42 = BigDecimal.ZERO;
                     short var49 = -15271;
                     short var52 = -32207;
                     Intrinsics.checkNotNullExpressionValue(BigDecimal.ZERO, "ZERO");
                     lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = new lIllllIlIlIlIlIIIlIlIllIIlIIIlIIIIIllllIllllIIlIllIlIIllIlIlIIIllllIllIIlIIIlllIIllII(
                        false, var30, false, var42
                     );
                     IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = new lIIIIIIIIlIlIlIlIIIlIlIllIIIlIIllIIllIlIlIIlIIIlIlIIIIIIIIllIllIIllllllIlIIlIIllIIlIl(
                        0, 0, null, 6, null
                     );
                     IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = SetsKt.emptySet();
                     lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = new LinkedHashSet<>();
                     IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII = new lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll();
                     lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl = new ArrayList<>();
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

                  var2 = "\u0084O=©Å\u008eq\u0090¤\u0017\nô¹\u0093\u007f«í\u000b\u0018ZÈ\u0088\u0097ÃI\u0013\u001f÷\u008fÖW\f:\u0004\u009f\u0081\u0004)";
                  var4 = "\u0084O=©Å\u008eq\u0090¤\u0017\nô¹\u0093\u007f«í\u000b\u0018ZÈ\u0088\u0097ÃI\u0013\u001f÷\u008fÖW\f:\u0004\u009f\u0081\u0004)"
                     .length();
                  var1 = '!';
                  var8 = -1;
            }

            var10000 = 9;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static NoSuchElementException a(NoSuchElementException var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -15249) & 65535;
      if (i[var2] == null) {
         char[] var3 = h[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 241;
            case 1 -> 22;
            case 2 -> 185;
            case 3 -> 157;
            case 4 -> 161;
            case 5 -> 59;
            case 6 -> 246;
            case 7 -> 37;
            case 8 -> 231;
            case 9 -> 118;
            case 10 -> 48;
            case 11 -> 198;
            case 12 -> 221;
            case 13 -> 126;
            case 14 -> 85;
            case 15 -> 140;
            case 16 -> 78;
            case 17 -> 170;
            case 18 -> 110;
            case 19 -> 237;
            case 20 -> 218;
            case 21 -> 249;
            case 22 -> 151;
            case 23 -> 255;
            case 24 -> 8;
            case 25 -> 62;
            case 26 -> 13;
            case 27 -> 230;
            case 28 -> 57;
            case 29 -> 183;
            case 30 -> 91;
            case 31 -> 56;
            case 32 -> 54;
            case 33 -> 92;
            case 34 -> 131;
            case 35 -> 196;
            case 36 -> 228;
            case 37 -> 138;
            case 38 -> 30;
            case 39 -> 124;
            case 40 -> 169;
            case 41 -> 17;
            case 42 -> 69;
            case 43 -> 14;
            case 44 -> 236;
            case 45 -> 254;
            case 46 -> 209;
            case 47 -> 100;
            case 48 -> 184;
            case 49 -> 11;
            case 50 -> 38;
            case 51 -> 212;
            case 52 -> 18;
            case 53 -> 76;
            case 54 -> 238;
            case 55 -> 44;
            case 56 -> 66;
            case 57 -> 83;
            case 58 -> 50;
            case 59 -> 129;
            case 60 -> 20;
            case 61 -> 251;
            case 62 -> 232;
            case 63 -> 199;
            case 64 -> 173;
            case 65 -> 148;
            case 66 -> 189;
            case 67 -> 252;
            case 68 -> 46;
            case 69 -> 174;
            case 70 -> 222;
            case 71 -> 25;
            case 72 -> 127;
            case 73 -> 73;
            case 74 -> 226;
            case 75 -> 144;
            case 76 -> 190;
            case 77 -> 216;
            case 78 -> 112;
            case 79 -> 128;
            case 80 -> 192;
            case 81 -> 67;
            case 82 -> 134;
            case 83 -> 77;
            case 84 -> 29;
            case 85 -> 94;
            case 86 -> 225;
            case 87 -> 200;
            case 88 -> 88;
            case 89 -> 58;
            case 90 -> 186;
            case 91 -> 9;
            case 92 -> 253;
            case 93 -> 24;
            case 94 -> 202;
            case 95 -> 177;
            case 96 -> 210;
            case 97 -> 111;
            case 98 -> 36;
            case 99 -> 163;
            case 100 -> 51;
            case 101 -> 28;
            case 102 -> 64;
            case 103 -> 224;
            case 104 -> 130;
            case 105 -> 141;
            case 106 -> 68;
            case 107 -> 119;
            case 108 -> 250;
            case 109 -> 120;
            case 110 -> 31;
            case 111 -> 152;
            case 112 -> 132;
            case 113 -> 6;
            case 114 -> 63;
            case 115 -> 99;
            case 116 -> 180;
            case 117 -> 19;
            case 118 -> 33;
            case 119 -> 217;
            case 120 -> 168;
            case 121 -> 178;
            case 122 -> 5;
            case 123 -> 136;
            case 124 -> 117;
            case 125 -> 219;
            case 126 -> 97;
            case 127 -> 191;
            case 128 -> 162;
            case 129 -> 7;
            case 130 -> 213;
            case 131 -> 182;
            case 132 -> 101;
            case 133 -> 72;
            case 134 -> 167;
            case 135 -> 27;
            case 136 -> 108;
            case 137 -> 40;
            case 138 -> 0;
            case 139 -> 175;
            case 140 -> 10;
            case 141 -> 207;
            case 142 -> 211;
            case 143 -> 197;
            case 144 -> 171;
            case 145 -> 220;
            case 146 -> 214;
            case 147 -> 187;
            case 148 -> 93;
            case 149 -> 61;
            case 150 -> 79;
            case 151 -> 204;
            case 152 -> 1;
            case 153 -> 16;
            case 154 -> 87;
            case 155 -> 147;
            case 156 -> 47;
            case 157 -> 122;
            case 158 -> 105;
            case 159 -> 107;
            case 160 -> 43;
            case 161 -> 23;
            case 162 -> 176;
            case 163 -> 133;
            case 164 -> 244;
            case 165 -> 65;
            case 166 -> 115;
            case 167 -> 160;
            case 168 -> 26;
            case 169 -> 104;
            case 170 -> 172;
            case 171 -> 159;
            case 172 -> 137;
            case 173 -> 239;
            case 174 -> 75;
            case 175 -> 195;
            case 176 -> 149;
            case 177 -> 165;
            case 178 -> 125;
            case 179 -> 229;
            case 180 -> 243;
            case 181 -> 80;
            case 182 -> 223;
            case 183 -> 106;
            case 184 -> 166;
            case 185 -> 4;
            case 186 -> 235;
            case 187 -> 42;
            case 188 -> 181;
            case 189 -> 74;
            case 190 -> 96;
            case 191 -> 102;
            case 192 -> 193;
            case 193 -> 142;
            case 194 -> 89;
            case 195 -> 240;
            case 196 -> 45;
            case 197 -> 146;
            case 198 -> 155;
            case 199 -> 113;
            case 200 -> 121;
            case 201 -> 179;
            case 202 -> 81;
            case 203 -> 32;
            case 204 -> 70;
            case 205 -> 247;
            case 206 -> 49;
            case 207 -> 234;
            case 208 -> 34;
            case 209 -> 98;
            case 210 -> 103;
            case 211 -> 206;
            case 212 -> 35;
            case 213 -> 90;
            case 214 -> 145;
            case 215 -> 203;
            case 216 -> 71;
            case 217 -> 52;
            case 218 -> 194;
            case 219 -> 2;
            case 220 -> 201;
            case 221 -> 109;
            case 222 -> 227;
            case 223 -> 135;
            case 224 -> 123;
            case 225 -> 143;
            case 226 -> 116;
            case 227 -> 3;
            case 228 -> 139;
            case 229 -> 248;
            case 230 -> 82;
            case 231 -> 154;
            case 232 -> 55;
            case 233 -> 84;
            case 234 -> 114;
            case 235 -> 233;
            case 236 -> 12;
            case 237 -> 242;
            case 238 -> 150;
            case 239 -> 208;
            case 240 -> 95;
            case 241 -> 21;
            case 242 -> 60;
            case 243 -> 156;
            case 244 -> 188;
            case 245 -> 245;
            case 246 -> 158;
            case 247 -> 153;
            case 248 -> 164;
            case 249 -> 15;
            case 250 -> 215;
            case 251 -> 205;
            case 252 -> 86;
            case 253 -> 39;
            case 254 -> 53;
            default -> 41;
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

         i[var2] = new String(var3).intern();
      }

      return i[var2];
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private static String[] a;
      private static String[] b;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl a() {
         return lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
      }

      @NotNull
      public final lIllllIlIlIlIlIIIlIlIllIIlIIIlIIIIIllllIllllIIlIllIlIIllIlIlIIIllllIllIIlIIIlllIIllII b() {
         return lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
      }

      public final void a(@NotNull lIllllIlIlIlIlIIIlIlIllIIlIIIlIIIIIllllIllllIIlIllIlIIllIlIlIIIllllIllIIlIIIlllIIllII var1) {
         short var10001 = -26081;
         short var10002 = 25997;
         Intrinsics.checkNotNullParameter(var1, "<set-?>");
         lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = var1;
      }

      @NotNull
      public final lIIIIIIIIlIlIlIlIIIlIlIllIIIlIIllIIllIlIlIIlIIIlIlIIIIIIIIllIllIIllllllIlIIlIIllIIlIl c() {
         return lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
      }

      public final void a(@NotNull lIIIIIIIIlIlIlIlIIIlIlIllIIIlIIllIIllIlIlIIlIIIlIlIIIIIIIIllIllIIllllllIlIIlIIllIIlIl var1) {
         short var10001 = -26081;
         short var10002 = 25997;
         Intrinsics.checkNotNullParameter(var1, "<set-?>");
         lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = var1;
      }

      @NotNull
      public final Set<lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll> d() {
         return ((Set<lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll>)(Object)(lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll));
      }

      public final void a(@NotNull Set<? extends lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll> var1) {
         short var10001 = -26082;
         short var10002 = 15325;
         Intrinsics.checkNotNullParameter(var1, "<set-?>");
         lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = var1;
      }

      @Nullable
      public final lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll e() {
         return lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
      }

      public final void a(@Nullable lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll var1) {
         lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = var1;
      }

      @Nullable
      public final String f() {
         return lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
      }

      public final void a(@Nullable String var1) {
         lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl = var1;
      }

      @NotNull
      public final Set<String> g() {
         return lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
      }

      public final void b(@NotNull Set<String> var1) {
         short var10001 = -26081;
         short var10002 = 25997;
         Intrinsics.checkNotNullParameter(var1, "<set-?>");
         lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = var1;
      }

      @NotNull
      public final lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll h() {
         return lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
      }

      public final void a(@NotNull lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll var1) {
         short var10001 = -26081;
         short var10002 = 25997;
         Intrinsics.checkNotNullParameter(var1, "<set-?>");
         lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII = var1;
      }

      @NotNull
      public final List<ItemStack> i() {
         return lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl;
      }

      public final boolean j() {
         return lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll;
      }

      public final void a(boolean var1) {
         lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll = var1;
      }

      public static void b(lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var0) {
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var0;
      }

      public static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] k() {
         return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: {
         String[] var5 = new String[2];
         lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[2];
         int var3 = 0;
         String var2 = "í\u0089\u001ci\u0097ÂY\u00076DgÐøõ´";
         int var4 = "í\u0089\u001ci\u0097ÂY\u00076DgÐøõ´".length();
         b(var10000);
         char var1 = 7;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 114;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 114;
                  var10006 = var6;
               } else {
                  var13 = 114;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 114;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 113;
                     case 1 -> 34;
                     case 2 -> 109;
                     case 3 -> 73;
                     case 4 -> 97;
                     case 5 -> 63;
                     default -> 13;
                  });
                  var6++;
                  if (var13 == 0) {
                     var10006 = var13;
                     var10005 = var10002;
                     var16 = var13;
                  } else {
                     if (var8 <= var6) {
                        break;
                     }

                     var10005 = var10002;
                     var16 = var13;
                     var10006 = var6;
                  }
               }
            }

            String var15 = new String(var10002).intern();
            byte var10 = -1;
            var5[var3++] = var15;
            if ((var0 += var1) >= var4) {
               a = var5;
               b = new String[2];
               break pxClinit;
            }

            var1 = var2.charAt(var0);
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -26081) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 218;
               case 1 -> 79;
               case 2 -> 123;
               case 3 -> 60;
               case 4 -> 177;
               case 5 -> 184;
               case 6 -> 78;
               case 7 -> 64;
               case 8 -> 80;
               case 9 -> 241;
               case 10 -> 62;
               case 11 -> 130;
               case 12 -> 6;
               case 13 -> 76;
               case 14 -> 150;
               case 15 -> 158;
               case 16 -> 68;
               case 17 -> 31;
               case 18 -> 186;
               case 19 -> 4;
               case 20 -> 164;
               case 21 -> 166;
               case 22 -> 41;
               case 23 -> 199;
               case 24 -> 135;
               case 25 -> 22;
               case 26 -> 202;
               case 27 -> 26;
               case 28 -> 53;
               case 29 -> 242;
               case 30 -> 157;
               case 31 -> 36;
               case 32 -> 95;
               case 33 -> 136;
               case 34 -> 148;
               case 35 -> 55;
               case 36 -> 223;
               case 37 -> 159;
               case 38 -> 221;
               case 39 -> 18;
               case 40 -> 72;
               case 41 -> 1;
               case 42 -> 182;
               case 43 -> 210;
               case 44 -> 200;
               case 45 -> 255;
               case 46 -> 189;
               case 47 -> 227;
               case 48 -> 54;
               case 49 -> 238;
               case 50 -> 67;
               case 51 -> 14;
               case 52 -> 102;
               case 53 -> 212;
               case 54 -> 100;
               case 55 -> 129;
               case 56 -> 188;
               case 57 -> 105;
               case 58 -> 176;
               case 59 -> 243;
               case 60 -> 77;
               case 61 -> 229;
               case 62 -> 153;
               case 63 -> 167;
               case 64 -> 73;
               case 65 -> 12;
               case 66 -> 140;
               case 67 -> 134;
               case 68 -> 20;
               case 69 -> 66;
               case 70 -> 197;
               case 71 -> 240;
               case 72 -> 133;
               case 73 -> 63;
               case 74 -> 254;
               case 75 -> 246;
               case 76 -> 2;
               case 77 -> 233;
               case 78 -> 245;
               case 79 -> 87;
               case 80 -> 93;
               case 81 -> 8;
               case 82 -> 48;
               case 83 -> 117;
               case 84 -> 250;
               case 85 -> 49;
               case 86 -> 81;
               case 87 -> 137;
               case 88 -> 92;
               case 89 -> 174;
               case 90 -> 252;
               case 91 -> 141;
               case 92 -> 201;
               case 93 -> 90;
               case 94 -> 30;
               case 95 -> 57;
               case 96 -> 156;
               case 97 -> 180;
               case 98 -> 121;
               case 99 -> 172;
               case 100 -> 112;
               case 101 -> 213;
               case 102 -> 58;
               case 103 -> 138;
               case 104 -> 91;
               case 105 -> 195;
               case 106 -> 225;
               case 107 -> 219;
               case 108 -> 206;
               case 109 -> 139;
               case 110 -> 165;
               case 111 -> 98;
               case 112 -> 42;
               case 113 -> 181;
               case 114 -> 61;
               case 115 -> 249;
               case 116 -> 205;
               case 117 -> 50;
               case 118 -> 24;
               case 119 -> 170;
               case 120 -> 52;
               case 121 -> 74;
               case 122 -> 106;
               case 123 -> 32;
               case 124 -> 13;
               case 125 -> 97;
               case 126 -> 237;
               case 127 -> 37;
               case 128 -> 45;
               case 129 -> 231;
               case 130 -> 190;
               case 131 -> 236;
               case 132 -> 65;
               case 133 -> 175;
               case 134 -> 251;
               case 135 -> 145;
               case 136 -> 108;
               case 137 -> 230;
               case 138 -> 196;
               case 139 -> 169;
               case 140 -> 152;
               case 141 -> 111;
               case 142 -> 86;
               case 143 -> 226;
               case 144 -> 204;
               case 145 -> 161;
               case 146 -> 120;
               case 147 -> 220;
               case 148 -> 207;
               case 149 -> 143;
               case 150 -> 43;
               case 151 -> 10;
               case 152 -> 15;
               case 153 -> 19;
               case 154 -> 179;
               case 155 -> 119;
               case 156 -> 162;
               case 157 -> 40;
               case 158 -> 208;
               case 159 -> 185;
               case 160 -> 125;
               case 161 -> 7;
               case 162 -> 131;
               case 163 -> 70;
               case 164 -> 39;
               case 165 -> 99;
               case 166 -> 228;
               case 167 -> 28;
               case 168 -> 83;
               case 169 -> 3;
               case 170 -> 69;
               case 171 -> 154;
               case 172 -> 47;
               case 173 -> 21;
               case 174 -> 183;
               case 175 -> 215;
               case 176 -> 118;
               case 177 -> 82;
               case 178 -> 16;
               case 179 -> 89;
               case 180 -> 5;
               case 181 -> 23;
               case 182 -> 232;
               case 183 -> 211;
               case 184 -> 85;
               case 185 -> 198;
               case 186 -> 124;
               case 187 -> 56;
               case 188 -> 94;
               case 189 -> 116;
               case 190 -> 33;
               case 191 -> 29;
               case 192 -> 214;
               case 193 -> 84;
               case 194 -> 244;
               case 195 -> 38;
               case 196 -> 128;
               case 197 -> 146;
               case 198 -> 71;
               case 199 -> 171;
               case 200 -> 203;
               case 201 -> 216;
               case 202 -> 224;
               case 203 -> 103;
               case 204 -> 115;
               case 205 -> 122;
               case 206 -> 178;
               case 207 -> 234;
               case 208 -> 27;
               case 209 -> 194;
               case 210 -> 75;
               case 211 -> 168;
               case 212 -> 35;
               case 213 -> 235;
               case 214 -> 151;
               case 215 -> 192;
               case 216 -> 11;
               case 217 -> 126;
               case 218 -> 44;
               case 219 -> 127;
               case 220 -> 160;
               case 221 -> 217;
               case 222 -> 25;
               case 223 -> 193;
               case 224 -> 59;
               case 225 -> 9;
               case 226 -> 113;
               case 227 -> 104;
               case 228 -> 191;
               case 229 -> 222;
               case 230 -> 110;
               case 231 -> 114;
               case 232 -> 96;
               case 233 -> 239;
               case 234 -> 247;
               case 235 -> 142;
               case 236 -> 132;
               case 237 -> 163;
               case 238 -> 187;
               case 239 -> 109;
               case 240 -> 101;
               case 241 -> 147;
               case 242 -> 51;
               case 243 -> 0;
               case 244 -> 17;
               case 245 -> 34;
               case 246 -> 209;
               case 247 -> 149;
               case 248 -> 107;
               case 249 -> 248;
               case 250 -> 88;
               case 251 -> 173;
               case 252 -> 144;
               case 253 -> 46;
               case 254 -> 253;
               default -> 155;
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

    // --- Phase A S1b: hand-written synthetic accessors/bridges (jar flags 0x1019) ---
    // javac cannot emit ACC_SYNTHETIC/ACC_BRIDGE; acceptance is descriptor-exact (name+descriptor).
    public static final me.octo.client.lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl be() { return lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */
    public static final me.octo.client.lIllllIlIlIlIlIIIlIlIllIIlIIIlIIIIIllllIllllIIlIllIlIIllIlIlIIIllllIllIIlIIIlllIIllII bf() { return lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */
    public static final me.octo.client.lIIIIIIIIlIlIlIlIIIlIlIllIIIlIIllIIllIlIlIIlIIIlIlIIIIIIIIllIllIIllllllIlIIlIIllIIlIl bg() { return IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */
    public static final java.util.Set bh() { return IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */
    public static final me.octo.client.lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll bi() { return lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */
    public static final java.lang.String bj() { return llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */
    public static final java.util.Set bk() { return lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */
    public static final me.octo.client.lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll bl() { return IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */
    public static final java.util.List bm() { return lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */
    public static final boolean bn() { return IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */
    public static final void a(java.util.Set p0) { IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = p0; }   /* same-family gap: jar access 0x1019, absent from the S1b dispatch list */
    public static final void a(me.octo.client.lIIIIIIIIlIlIlIlIIIlIlIllIIIlIIllIIllIlIlIIlIIIlIlIIIIIIIIllIllIIllllllIlIIlIIllIIlIl p0) { IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = p0; }   /* same-family gap: jar access 0x1019, absent from the S1b dispatch list */
    public static final void a(me.octo.client.lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll p0) { IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII = p0; }   /* same-family gap: jar access 0x1019, absent from the S1b dispatch list */
    public static final void a(me.octo.client.lIllllIlIlIlIlIIIlIlIllIIlIIIlIIIIIllllIllllIIlIllIlIIllIlIlIIIllllIllIIlIIIlllIIllII p0) { lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = p0; }   /* same-family gap: jar access 0x1019, absent from the S1b dispatch list */
    public static final void a(me.octo.client.lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll p0) { lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = p0; }   /* same-family gap: jar access 0x1019, absent from the S1b dispatch list */
    public static final void b(java.util.Set p0) { lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = p0; }   /* same-family gap: jar access 0x1019, absent from the S1b dispatch list */
    public static final void e(java.lang.String p0) { llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl = p0; }   /* same-family gap: jar access 0x1019, absent from the S1b dispatch list */
    public static final void h(boolean p0) { IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll = p0; }   /* same-family gap: jar access 0x1019, absent from the S1b dispatch list */
}
