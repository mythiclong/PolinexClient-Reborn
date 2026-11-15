package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII;
import me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
import me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
import me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
import me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
import me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
import me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
import me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
import me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
import me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl {
   @NotNull
   private final Minecraft IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private ArrayList<lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private int IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private int lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private float IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private float llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private Vec3 lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private Vec3 lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private int lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @NotNull
   private Vec3 IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private int IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private boolean IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   @Nullable
   private BlockPos IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   @Nullable
   private BlockPos llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   private boolean IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   private boolean IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   private boolean IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   private boolean llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   private boolean lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   @Nullable
   private IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   private static String[] a;
   private static String[] b;

   public lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl() {
      Minecraft var10001 = Minecraft.getInstance();
      short var10003 = -27869;
      short var10004 = -26709;
      Intrinsics.checkNotNullExpressionValue(var10001, "getInstance(...)");
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var10001;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new ArrayList<>();
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new ArrayList<>();
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new ArrayList<>();
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 37.5F;
      Vec3 var1 = Vec3.ZERO;
      var10003 = -27866;
      var10004 = 452;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var1;
      Vec3 var2 = Vec3.ZERO;
      var10003 = -27866;
      var10004 = 452;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var2;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      Vec3 var3 = Vec3.ZERO;
      var10003 = -27866;
      var10004 = 452;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = var3;
      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
   }

   public final boolean a() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final void a(boolean var1) {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
   }

   public final boolean b() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final void b(boolean var1) {
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
   }

   private final synchronized void c() {
String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
try {
   this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.clear();
   ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> var2;
   if (var1 == null) {
      var2 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   } else if (!this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
      var2 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   } else if (((Collection)this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII).isEmpty()) {
      var2 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   } else {
      var2 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }
   if (var1 != null && var2.isEmpty()) {
      return;
   }
   Collection<Vec3> var4 = new ArrayList<Vec3>(CollectionsKt.collectionSizeOrDefault(var2, 10));
   Iterator<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> var5 = var2.iterator();
   while (var5.hasNext()) {
      IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var6 = var5.next();
      if (var1 == null) {
         break;
      }
      var4.add(lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g(var6.a()));
   }
   List<Vec3> var3 = (List<Vec3>)var4;
   List<Vec3> var7;
   if (var1 == null) {
      var7 = var3;
   } else if (var3.isEmpty()) {
      return;
   } else {
      var7 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a(var3, 0.0, 0, null);
   }
   if (var7.isEmpty()) {
      return;
   }
   Collection<llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> var8 = new ArrayList<llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll>(CollectionsKt.collectionSizeOrDefault(var7, 10));
   Iterator<Vec3> var9 = var7.iterator();
   while (var9.hasNext()) {
      Vec3 var10 = var9.next();
      var8.add(new lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(var10));
      if (var1 == null) {
         return;
      }
   }
   this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.addAll(var8);
} catch (Exception exception) {
   this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.clear();
}
   }

   private final lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
      Vec3 var1, Vec3 var2
   ) {
      Object var40 = null; // PX-FIX
      String var3;
      Vec3 var6;
      Vec3 var7;
      ArrayList var8;
      int var36;
      byte var45;
      byte var4 = 3;
      byte var5 = 3;
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      Vec3 var10001 = var2.add(0.0, 1.0, 0.0);
      short var10003 = -27868;
      short var10004 = 30619;
      Intrinsics.checkNotNullExpressionValue(var10001, "add(...)");
      var6 = var10001;
      var3 = var10000;
      Vec3 var35 = var2.subtract(var1).normalize();
      short var10002 = -27864;
      var10003 = 28492;
      Intrinsics.checkNotNullExpressionValue(var35, "normalize(...)");
      var7 = var35;
      var8 = new ArrayList();
      int var9 = -var4;
      var36 = var9;
      var45 = var4;
      label122:
      if (var3 != null) {
         if (var9 <= var4) {
            do {
               label117: {
                  label134: {
                     int var10 = -var4;
                     if (var10 <= var4) {
                        do {
                           var36 =((Integer)( var9));
                           if (var3 == null) {
                              break label134;
                           }

                           label111: {
                              label127: {
                                 if ((var9 != 0)) {
                                    var36 = var10;
                                    if (var3 == null || var3 == null) {
                                       break label111;
                                    }

                                    if (var10 == 0) {
                                       break label127;
                                    }
                                 }

                                 BlockPos var12;
                                 label104: {
                                    Vec3 var37 = ((Vec3)(Object)(((Double)(Object)(var6.add(var9, 0.0, var10)))));
                                    var10002 = -27841;
                                    var10003 = 17094;
                                    Intrinsics.checkNotNullExpressionValue(var37, "add(...)");
                                    Vec3 var11 = var37;
                                    BlockPos var38 = BlockPos.containing(var11);
                                    var10002 = -27861;
                                    var10003 = -24848;
                                    Intrinsics.checkNotNullExpressionValue(var38, "containing(...)");
                                    var12 = var38;
                                    if (var3 != null
                                       && this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level != null) {
                                       BlockState var39 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                          .level
                                          .getBlockState(var12);
                                       if (var39 != null) {
                                          var40 = var39.getBlock();
                                          if (var3 != null) {
                                             break label104;
                                          }
                                       }
                                    }

                                    var40 = null;
                                 }

                                 var36 = ((Intrinsics.areEqual(var40, Blocks.OBSIDIAN)) ? 1 : 0);
                                 if (var3 == null) {
                                    break label111;
                                 }

                                 if (var36 != 0) {
                                    var8.add(var12);
                                 }
                              }

                              var36 = var10;
                           }

                           var45 = var4;
                           if (var3 == null) {
                              break label117;
                           }

                           if (var36 == var4) {
                              break;
                           }

                           var10++;
                        } while (var3 != null);
                     }

                     var36 =((Integer)( var9));
                  }

                  var45 = var4;
               }

               if (var3 == null) {
                  break label122;
               }

               if (var36 == var45) {
                  break;
               }

               var9++;
            } while (var3 != null);
         }

         var36 = var8.size();
         var45 = var5;
      }

      if (var36 < var45) {
         return new lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            false, 0.0F, var8.size()
         );
      } else {
         double var30 = 0.0;
         double var31 = 0.0;
         double var13 = 0.0;
         Iterator var41 = var8.iterator();
         var10002 = -27863;
         var10003 = 13919;
         Intrinsics.checkNotNullExpressionValue(var41, "iterator(...)");
         Iterator var15 = var41;

         while (true) {
            if (var15.hasNext()) {
               Object var42 = var15.next();
               var10002 = -27858;
               var10003 = 12727;
               Intrinsics.checkNotNullExpressionValue(var42, "next(...)");
               BlockPos var16 = (BlockPos)var42;
               double var17 = var16.getX() - var6.x;
               double var19 = var16.getZ() - var6.z;
               double var21 = Math.sqrt(var17 * var17 + var19 * var19);
               double var57;
               var36 = (var57 = var21 - 0.0) == 0.0 ? 0 : (var57 < 0.0 ? -1 : 1);
               if (var3 == null) {
                  break;
               }

               if (var3 != null) {
                  var36 = (((var36 == 0) ? 1 : 0));
               }

               if ((var36 != 0)) {
                  continue;
               }

               Vec3 var44 = new Vec3(var17, 0.0, var19).normalize();
               var10002 = -27870;
               var10003 = -4802;
               Intrinsics.checkNotNullExpressionValue(var44, "normalize(...)");
               Vec3 var23 = var44;
               double var24 = var23.dot(var7);
               double var26 = 1.0 / (1.0 + var21 * 0.5);
               double var28 = Math.max(0.0, var24) * var26;
               var30 += var17 * var28;
               var31 += var19 * var28;
               var13 += var28;
               if (var3 != null) {
                  continue;
               }
            }

            double var58;
            var36 = (var58 = var13 - 0.0) == 0.0 ? 0 : (var58 < 0.0 ? -1 : 1);
            break;
         }

         if (var3 != null) {
            var36 = (((var36 == 0) ? 1 : 0));
         }

         if ((var36 != 0)) {
            return new lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
               false, 0.0F, var8.size()
            );
         } else {
            double var32 = var30 / var13;
            double var33 = var31 / var13;
            float var34 = (float)Math.toDegrees(Math.atan2(var33, var32)) - 90.0F;
            return new lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
               true, var34, var8.size()
            );
         }
      }
   }

   private final boolean d() {
      Object var9 = null; // PX-FIX
      Object var11 = null; // PX-FIX
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      boolean var10000 = this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
      if (var1 != null) {
         label65:
         if (this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll) {
            lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl var6 = this;
            if (var1 != null) {
               if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
                  break label65;
               }

               var6 = this;
            }

            label55:
            if (var6.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hitResult != null) {
               HitResult var4 = var6.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hitResult;
               boolean var5 = false;
               HitResult var8 = var4;
               if (var1 != null) {
                  if (var4.getType() != Type.BLOCK) {
                     var9 = null;
                     break label55;
                  }

                  var8 = var4;
               }

               var9 = ((BlockHitResult)var8).getBlockPos();
            } else {
               var9 = null;
            }

            BlockPos var2 =((BlockPos)( var9));
            if (var2 != null) {
               label45: {
                  if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level != null) {
                     BlockState var10 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level.getBlockState(var2);
                     if (var10 != null) {
                        var11 = var10.getBlock();
                        if (var1 != null) {
                           break label45;
                        }
                     }
                  }

                  var11 = null;
               }

               Block var3 =((Block)( var11));
               var10000 = Intrinsics.areEqual(var3, Blocks.OBSIDIAN);
               if (var1 == null) {
                  return var10000;
               }

               if (var10000) {
                  var10000 = Intrinsics.areEqual(var2, this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI);
                  if (var1 != null) {
                     if (var10000) {
                        return ((java.util.function.Supplier<Boolean>)(() -> { this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.a(150); return false; })).get();
                     }

                     this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = var2;
                     this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.f();
                     var10000 = true;
                  }

                  return var10000;
               }
            }

            return true;
         }

         var10000 = true;
      }

      return var10000;
   }

   public final void e() {
      Object var3 = null; // PX-FIX
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var1 != null) {
         label121:
         if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
            boolean var10000 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.isEmpty();
            if (var1 != null) {
               if (var10000) {
                  break label121;
               }

               var10000 = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.n();
            }

            if (var1 != null) {
               if (var10000) {
                  llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .p();
                  return;
               }

               var10000 = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
            }

            if (var1 != null) {
               if (var10000) {
                  this.f();
                  return;
               }

               this.g();
               this.s();
               var10000 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.isEmpty();
            }

            if (var1 != null) {
               if (var10000) {
                  this.c();
                  this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = this.u();
               }

               var10000 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.isEmpty();
            }

            if (var1 != null) {
               if (var10000) {
                  llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .p();
                  return;
               }

               this.i();
               var10000 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }

            if (var1 != null) {
               if (!var10000) {
                  this.j();
               }

               var10000 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }

            label104: {
               label103: {
                  label128: {
                     if (var1 != null) {
                        if (var10000) {
                           var10000 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.isEmpty();
                           if (var1 != null) {
                              var10000 = !var10000;
                           }

                           if (var10000) {
                              this.k();
                           }
                        }

                        this.l();
                        var3 = this;
                        if (var1 == null) {
                           break label128;
                        }

                        var10000 = this.d();
                     }

                     if (!var10000) {
                        break label103;
                     }

                     var3 = this;
                  }

                  this.p();
                  if (var1 != null) {
                     break label104;
                  }
               }

               llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .p();
            }

            short var7;
            label90: {
               label130: {
                  short var10001 = -27857;
                  var7 = -17946;
                  var7 = ((short)((this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) ? 1 : 0));
                  if (var1 != null) {
                     if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
                        break label130;
                     }

                     var7 = ((short)((this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI) ? 1 : 0));
                  }

                  if (var1 == null) {
                     break label90;
                  }

                  if ((var7 == 0)) {
                     var7 = 1;
                     break label90;
                  }
               }

               var7 = 0;
            }

            llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a("sneak", (var7 != 0));
            short var5 = -27859;
            var7 = -9835;
            llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a("sprint", this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
            llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var4 = llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            var5 = -27862;
            var7 = 5048;
            boolean var10 = lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .j();
            if (var1 != null) {
               var10 = !var10;
            }

            var4.a("attack", var10);
            return;
         }

         llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .p();
      }
   }

   private final void f() {
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      boolean var10000;
      if (var1 != null && this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll != null) {
         var10000 = this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll.d();
         if (var1 != null) {
            ;
         }
      } else {
         var10000 =( 0 != 0);
      }

      label71: {
         if (!var10000) {
            if (this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl != null) {
               BlockPos var2 = this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
               boolean var3 = false;
               double var11;
               var10000 = (
                        var11 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .a(
                                 lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                    .g(var2),
                                 false
                              )
                     )
                     < 2.0;

            } else {
               var10000 =( 0 != 0);
            }

            if (var10000) {
               break label71;
            }
         }

         this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = false;
         this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = null;
         if (var1 != null) {
            if (this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll != null) {
               this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll.k();
            }
         }

         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.clear();
         this.c();
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = this.u();
         if (var1 != null) {
            return;
         }
      }

      short var10001 = -27872;
      short var10002 = -16647;
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("sneak", true);
      var10001 = -27871;
      var10002 = 2332;
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("sprint", false);
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var5 = llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      var10001 = -27862;
      var10002 = 5048;
      boolean var10 = lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .j();
      if (var1 != null) {
         var10 = !var10;
      }

      var5.a("attack", var10);
   }

   private final void g() {
      Object var2 = null; // PX-FIX
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      boolean var10000 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      if (var1 != null) {
         if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
            return;
         }

         var10000 = lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .i();
      }

      label33: {
         if (var1 != null) {
            if (!var10000) {
               return;
            }

            var2 = this;
            if (var1 == null) {
               break label33;
            }

            var10000 = this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
         }

         if (!var10000) {
            return;
         }

         var2 = this;
      }

      this.q();
   }

   public final void h() {
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl var10000 = this;
      if (var1 != null) {
         if (!this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
            return;
         }

         var10000 = this;
      }

      var10000.r();
   }

   private final void i() {
      Object var9 = null; // PX-FIX
      Object var11 = null; // PX-FIX
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      int var10000 = ((this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) ? 1 : 0);
      if (var1 != null) {
         if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
            return;
         }

         var10000 = ((java.util.function.Supplier<Integer>)(() -> { this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.a(2000); return 0; })).get();
      }

      label77: {
         if (var1 != null) {
            if (var10000 == 0) {
               break label77;
            }

            var10000 = this.u();
         }

         label67: {
            label66: {
               int var2 = var10000;
               var10000 = var2;
               if (var1 != null) {
                  if (var2 < 0) {
                     break label66;
                  }

                  var10000 = var2;
               }

               if (var10000 < this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.size()) {
                  var9 = this;
                  if (var1 == null) {
                     break label67;
                  }

                  Vec3 var3 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.get(var2).a();
                  double var4 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(var3, false);
                  if (var4 > 4.0) {
                     this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var2;
                     this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 0;
                  }
               }
            }

            var9 = this;
         }

         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.f();
      }

      Vec3 var6 = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
      var10000 = ((java.util.function.Supplier<Integer>)(() -> { this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.a(1000); return 0; })).get();
      if (var1 != null) {
         if (var10000 == 0) {
            return;
         }

         double var12;
         var10000 = (var12 = var6.distanceTo(this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl) - 0.2) == 0.0
            ? 0
            : (var12 < 0.0 ? -1 : 1);
      }

      label50: {
         label49: {
            label79: {
               if (var1 != null) {
                  if (var10000 >= 0) {
                     break label79;
                  }

                  var10000 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
               }

               int var7 = var10000;
               this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var7 + 1;
               var11 = this;
               if (var1 == null) {
                  break label50;
               }

               if (this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl < 3) {
                  break label49;
               }

               this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = this.u();
               this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 0;
               if (var1 != null) {
                  break label49;
               }
            }

            this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 0;
         }

         var11 = this;
      }

      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = var6;
   }

   private final void j() {
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      int var10000 = ((this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.isEmpty()) ? 1 : 0);
      if (var1 != null) {
         if (var10000 != 0) {
            return;
         }

         var10000 = (this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll + 2)
            % this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.size();
      }

      int var2 = var10000;
      var10000 = var2;
      if (var1 != null) {
         if (var2 < 0) {
            return;
         }

         var10000 = var2;
      }

      if (var10000 < this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.size()) {
         double var3 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.get(var2).a(), false);
         double var9;
         var10000 = (var9 = var3 - 1.5) == 0.0 ? 0 : (var9 < 0.0 ? -1 : 1);
         if (var1 != null) {
            if (var10000 >= 0) {
               return;
            }

            this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = (
                  this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll + 2
               )
               % this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.size();
            this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 0;
            var10000 = ((this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.isEmpty()) ? 1 : 0);
         }

         if (var1 != null) {
            var10000 = var10000 == 0 ? 1 : 0;
         }

         if (var10000 != 0) {
            int var5 = (this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll + 1)
               % this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.size();
            Vec3 var6 = lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var5).a());
            if (IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var6, false)
               < 3.0) {
               this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var5;
            }
         }
      }
   }

   private final void k() {
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var1 != null) {
         if (!(
            IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI, false)
               < 0.75
         )) {
            return;
         }

         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = (
               this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl + 1
            )
            % this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.size();
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
         this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g(
               this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                  .get(this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl)
                  .a()
            );
      }

      lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var2 = this.a(
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
         this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
      );
      if (var1 != null) {
         if (!var2.a()) {
            this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 58.0F + Random.Default.nextFloat() * 7.0F;
            this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = Random.Default.nextFloat() * 4.0F;
            if (var1 != null) {
               return;
            }
         }

         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = Random.Default.nextFloat() * 7.0F;
      }

      lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var3 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(
            this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
            this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
         );
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var2.b() - var3.a();
   }

   private final void l() {
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      boolean var10000 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      if (var1 != null) {
         if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
            this.m();
            if (var1 != null) {
               return;
            }
         }

         var10000 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      if (var1 != null) {
         if (var10000) {
            return;
         }

         var10000 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.isEmpty();
      }

      if (var1 != null) {
         var10000 = !var10000;
      }

      if (var10000) {
         var10000 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.isEmpty();
         if (var1 != null) {
            var10000 = !var10000;
         }

         if (var10000) {
            lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl var3 = this;
            if (var1 != null) {
               if (this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll) {
                  this.n();
                  if (var1 != null) {
                     return;
                  }
               }

               var3 = this;
            }

            var3.o();
         }
      }
   }

   private final void m() {
      lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var1 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI);
      float var2 = var1.a() + this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      if (!IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .i()) {
         IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a(
               new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(
                  var2, this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
               )
            )
            .a(0.65F);
      }
   }

   private final void n() {
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      int var10000 = ((IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .i()) ? 1 : 0);
      if (var1 != null) {
         if (var10000 != 0) {
            return;
         }

         var10000 = 7;
      }

      byte var2 = (byte)var10000;
      int var3 = (this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll + var2)
         % this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.size();
      var10000 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      if (var1 != null) {
         if (this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll < 0) {
            return;
         }

         var10000 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      if (var1 != null) {
         if (var10000 >= this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.size()) {
            return;
         }

         var10000 = var3;
      }

      if (var1 != null) {
         if (var10000 < 0) {
            return;
         }

         var10000 = var3;
      }

      if (var10000 < this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.size()) {
         Vec3 var4 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .get(this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll)
            .a();
         Vec3 var5 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.get(var3).a();
         lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var6 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(var4, var5);
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 37.5F + Random.Default.nextFloat() * 1.5F;
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = Random.Default.nextFloat() * 4.0F;
         float var7 = var6.a() + this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
         IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a(
               new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(
                  var7, this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
               )
            )
            .a(0.375F);
      }
   }

   private final void o() {
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      int var10000 = ((IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .i()) ? 1 : 0);
      if (var1 != null) {
         if (var10000 != 0) {
            return;
         }

         var10000 = Random.Default.nextInt(450, 650);
      }

      long var2 = var10000;
      var10000 = ((java.util.function.Supplier<Integer>)(() -> { this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.a(var2); return 0; })).get();
      if (var1 != null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = (this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll + 1)
            % this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.size();
      }

      int var4 = var10000;
      Vec3 var5 = lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .g(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var4).a());
      float var6 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(var5)
         .a();
      float var7 = var1 != null && this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.player != null
         ? this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.player.getYRot()
         : 0.0F;
      float var8 = Math.abs(var6 - var7);
      float var11 = var8;
      float var10001 = 20.0F;
      if (var1 != null) {
         if (!(var8 > 20.0F)) {
            return;
         }

         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 37.5F + Random.Default.nextFloat() * 1.5F;
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = Random.Default.nextFloat() * 4.0F;
         var11 = var6;
         var10001 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      float var9 = var11 + var10001;
      IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a(
            new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(
               var9, this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
            )
         )
         .a(0.45F);
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.f();
   }

   private final void p() {
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      boolean var10000 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      if (var1 != null) {
         if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
            var10000 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.isEmpty();
            if (var1 != null) {
               var10000 = !var10000;
            }

            if (var10000) {
               llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(
                  llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                  this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
                  false);
               if (var1 != null) {
                  return;
               }
            }
         }

         var10000 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      label61: {
         if (var1 != null) {
            if (var10000) {
               break label61;
            }

            var10000 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.isEmpty();
         }

         if (var1 != null) {
            var10000 = !var10000;
         }

         if (var10000) {
            int var2 = (this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll + 2)
               % this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.size();
            if (var1 != null) {
               if (var2 >= 0 && var2 < this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.size()) {
                  llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(
                     llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                     this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.get(var2).a(),
                     false);
                  if (var1 != null) {
                     return;
                  }
               }

               llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .p();
            }

            if (var1 != null) {
               return;
            }
         }
      }

      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .p();
   }

   private final void q() {
      label15: {
         String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = true;
         String var1 = var10000;
         this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.f();
         IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g();
         IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g();
         Vec3 var2 = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = this.a(
            var2, this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         );
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var2;
         this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g(
               this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                  .get(this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl)
                  .a()
            );
         lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = this.a(
            this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
            this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
         );
         if (var1 != null) {
            if (!var3.a()) {
               this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 58.0F + Random.Default.nextFloat() * 7.0F;
               this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = Random.Default.nextFloat() * 4.0F;
               if (var1 != null) {
                  break label15;
               }
            }

            this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = Random.Default.nextFloat() * 7.0F;
         }

         lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var4 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(
               this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
               this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
            );
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var3.b() - var4.a();
      }

      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.clear();
      this.c();
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = this.u();
   }

   private final void r() {
      label27: {
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = false;
         short var10001 = -27867;
         short var10002 = -29410;
         llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a("attack", false);
         Vec3 var2 = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = this.a(
            var2, this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         );
         String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
         Object var6 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            .get(this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll);
         short var10003 = -27865;
         short var10004 = -28470;
         Intrinsics.checkNotNullExpressionValue(var6, "get(...)");
         IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var3 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var6;
         double var4 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(
               lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .g(var3.a()),
               false
            );
         String var1 = var10000;
         if (var1 != null) {
            if (var4 > 3.0) {
               this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = true;
               this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = var3.a();
               if (var1 != null && this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll != null) {
                  IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                     ((BlockPos)(Object)(this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll)), var3.a(), null, false);
                  break label27;
               }

               if (var1 != null) {
                  break label27;
               }
            }

            this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.clear();
            this.c();
         }

         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = this.u();
      }

      if (this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII) {
         IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(300L, null);
      }
   }

   private final void s() {
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a(
         lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
         false)) {
         if (this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll == null) {
            return;
         }

         me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2 = this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
         if (var1 == null) {
            return;
         }

         me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000 = lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .q();
         if (var10000 == null) {
            return;
         }

         me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = var10000;
         ArrayList var4 = new ArrayList();
         lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl var11 = this;
         if (var1 != null) {
            if (this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII) {
               if (this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl != null) {
                  me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var5 = this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
                  boolean var6 = false;
                  var4.add(var5.b());
               }
            }

            var11 = this;
         }

         if (var11.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll != null) {
            me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var7 = var11.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
            boolean var9 = false;
            var4.add(var7.b());
         }

         var10000 = lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .o();
         if (var10000 != null) {
            me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var8 = var10000;
            boolean var10 = false;
            if (var1 != null && var3.b() != var8.b()) {
               var4.add(var8.b());
            }
         }

         var4.add(var3.b());
         lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .w();
         me.octo.client.utils.player.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(2, lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl::z, CollectionsKt.toList(var4), var2.b());
      }
   }

   private final void t() {
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var1 != null && this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl != null) {
         me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2 = this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
         if (var1 != null && this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll != null) {
            me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
            int var4 = Random.Default.nextInt(60, 120);
            me.octo.client.utils.player.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a(var4, lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl::A, CollectionsKt.listOf(var2.b()), var3.b());
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final int u() {
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      Object var10000 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      if (var1 != null) {
         if (this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.isEmpty()) {
            return 0;
         }

         var10000 = (Iterable)CollectionsKt.getIndices(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
      }

      Object var2 = var10000;
      boolean var3 = false;
      Iterator var4 = ((me.octo.client.PXDyn)var2).iterator();
      var10000 = var4;
      if (var1 != null) {
         if (!var4.hasNext()) {
            return (Integer)null != null ? (Integer)null : 0;
         }

         var10000 = var4.next();
      }

      Object var5 = var10000;
      int var16 = ((var4.hasNext()) ? 1 : 0);
      if (var1 != null) {
         if (var16 == 0) {
            return (Integer)var5 != null ? (Integer)var5 : 0;
         }

         var16 = ((Number)var5).intValue();
      }

      int var6 = var16;
      boolean var8 = false;
      double var12 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.get(var6).a(), false);

      while (true) {
         Object var13 = var4.next();
         int var9 = ((Number)var13).intValue();
         boolean var11 = false;
         double var14 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.get(var9).a(), false);
         if (Double.compare(var12, var14) > 0) {
            var5 = var13;
            var12 = var14;
         }

         while (!var4.hasNext()) {
            if (var1 != null) {
               return (Integer)var5 != null ? (Integer)var5 : 0;
            }

            var12 = var14;
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final int a(Vec3 var1, List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> var2) {
      String var3 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      Object var10000 = var2;
      if (var3 != null) {
         if (var2.isEmpty()) {
            return 0;
         }

         var10000 = (Collection)(Iterable)CollectionsKt.getIndices(var2);
      }

      Object var4 = var10000;
      boolean var5 = false;
      Iterator var6 = ((me.octo.client.PXDyn)var4).iterator();
      var10000 = var6;
      if (var3 != null) {
         if (!var6.hasNext()) {
            return (Integer)null != null ? (Integer)null : 0;
         }

         var10000 = var6.next();
      }

      Object var7 = var10000;
      int var18 = ((var6.hasNext()) ? 1 : 0);
      if (var3 != null) {
         if (var18 == 0) {
            return (Integer)var7 != null ? (Integer)var7 : 0;
         }

         var18 = ((Number)var7).intValue();
      }

      int var8 = var18;
      boolean var10 = false;
      double var14 = var1.distanceTo(
         lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .d(((IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var2.get(var8)).a())
      );

      while (true) {
         Object var15 = var6.next();
         int var11 = ((Number)var15).intValue();
         boolean var13 = false;
         double var16 = var1.distanceTo(
            lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .d(((IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var2.get(var11)).a())
         );
         if (Double.compare(var14, var16) > 0) {
            var7 = var15;
            var14 = var16;
         }

         while (!var6.hasNext()) {
            if (var3 != null) {
               return (Integer)var7 != null ? (Integer)var7 : 0;
            }

            var14 = var16;
         }
      }
   }

   public final void a(
      @NotNull List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> var1,
      @NotNull List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> var2,
      @Nullable me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3,
      boolean var4,
      boolean var5,
      boolean var6,
      boolean var7,
      boolean var8,
      @NotNull IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll var9
   ) {
      short var10001 = -27842;
      short var10002 = 8024;
      Intrinsics.checkNotNullParameter(var1, "normalWaypoints");
      var10001 = -27843;
      var10002 = 14077;
      Intrinsics.checkNotNullParameter(var2, "boostWaypoints");
      var10001 = -27860;
      byte var14 = 95;
      Intrinsics.checkNotNullParameter(var9, "walkerInstance");
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = true;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clear();
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.addAll(var1);
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.clear();
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.addAll(var2);
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.clear();
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 0;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 0;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 0;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.f();
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.f();
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.f();
      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.f();
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 0;
      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = null;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = false;
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = false;
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = null;
      Vec3 var15 = Vec3.ZERO;
      short var10004 = -27844;
      short var10005 = -24404;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var15;
      Vec3 var16 = Vec3.ZERO;
      var10004 = -27866;
      var10005 = 452;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var16;
      this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = var4;
      this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = var7;
      this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = var5;
      this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = var6;
      this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = var8;
      String var10 = var10000;
      this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = var9;
      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = var3;
      this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.a(
         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
         false);
      this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .t();
      if (var10 == null) {
         lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[5]
         );
      }
   }

   // $VF: Extended synchronized range to monitorexit
   public final void v() {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = false;
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .p();
      short var10002 = -27862;
      short var10003 = 5048;
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("attack", false);
      var10002 = -27859;
      var10003 = -9835;
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("sprint", false);
      var10002 = -27857;
      var10003 = -17946;
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("sneak", false);
      IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .g();
      String var1 = var10000;
      IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .g();
      if (var1 != null) {
         if (this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll != null) {
            this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll.k();
         }
      }

      this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = null;
      synchronized (this) {
         boolean var3 = false;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.clear();
         Unit var6 = Unit.INSTANCE;
      }

      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 0;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = false;
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = false;
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = null;
      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = null;
   }

   @NotNull
   public final synchronized List<Vec3> w() {
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();

      List var2;
      try {
         Iterable var13 = CollectionsKt.toList(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
         boolean var3 = false;
         Collection var5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var13, 10));
         boolean var6 = false;

         Collection var10000;
         label24: {
            for (Object var8 : var13) {
               var10000 = var5;
               lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var9 = (lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var8;
               if (var1 == null) {
                  break label24;
               }

               boolean var10 = false;
               var5.add(var9.a());
               if (var1 == null) {
                  break;
               }
            }

            var10000 = var5;
         }

         var2 = (List)var10000;
      } catch (Exception var12) {
         var2 = CollectionsKt.emptyList();
      }

      return var2;
   }

   public final int x() {
      return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   public final int y() {
      return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   private static final Unit a(lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl var0) {
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl var10000 = var0;
      if (var1 != null) {
         if (!var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
            return Unit.INSTANCE;
         }

         var10000 = var0;
      }

      var10000.t();
      return Unit.INSTANCE;
   }

   private static final Unit z() {
      lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .x();
      return Unit.INSTANCE;
   }

   private static final Unit A() {
      return Unit.INSTANCE;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[20];
      int var3 = 0;
      String var2 = "±¨\u0091B-á\u000e8é:[\u008e\u0086,p\u0086\u0011ìû*Ä\u0005C\u0015Ø ô\t\u0092EAU:ç9Ëõ\røìöU;{8\u0015½xô\u0087Å\u000eÕ]£\u0004dµÕß\u008b.Ö\u008b\u0086Î\u000f\u0016\u0082kæâÖ\u0002\u0005\u009dKx\u0081\u0095\u0088\u0082\u0006)?Ô<N8\u0006k\u0089\u009cêGâ\b9¾ÆWSpÒ>\bûÙH\u009a\u0090Éª\t\u0004á]·I\u0006`p«Yj\u0082\u0005ìÒ-ØJ\u0010F6ÿ\u0006&JnÇI\u001e¯©\u008bKF»\u000eÜÊ\u0082ö@ëQ\u0014\u001bWÄ¤Ä+\u000e\u0096¶[gÐ?üÑ²Ë\u0001Ø\u0089¶\u0004\u008aÿÚ\u001d";
      int var4 = "±¨\u0091B-á\u000e8é:[\u008e\u0086,p\u0086\u0011ìû*Ä\u0005C\u0015Ø ô\t\u0092EAU:ç9Ëõ\røìöU;{8\u0015½xô\u0087Å\u000eÕ]£\u0004dµÕß\u008b.Ö\u008b\u0086Î\u000f\u0016\u0082kæâÖ\u0002\u0005\u009dKx\u0081\u0095\u0088\u0082\u0006)?Ô<N8\u0006k\u0089\u009cêGâ\b9¾ÆWSpÒ>\bûÙH\u009a\u0090Éª\t\u0004á]·I\u0006`p«Yj\u0082\u0005ìÒ-ØJ\u0010F6ÿ\u0006&JnÇI\u001e¯©\u008bKF»\u000eÜÊ\u0082ö@ëQ\u0014\u001bWÄ¤Ä+\u000e\u0096¶[gÐ?üÑ²Ë\u0001Ø\u0089¶\u0004\u008aÿÚ\u001d"
         .length();
      char var1 = 6;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 65;
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
                     case 0 -> 28;
                     case 1 -> 122;
                     case 2 -> 34;
                     case 3 -> 102;
                     case 4 -> 96;
                     case 5 -> 60;
                     default -> 24;
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
                     b = new String[20];
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

                  var2 = "ø\u0007CÝ^\u009cÎ\u001e\u000fgÉH+¤íNr \u0006Ð'Ò\u0014Å";
                  var4 = "ø\u0007CÝ^\u009cÎ\u001e\u000fgÉH+¤íNr \u0006Ð'Ò\u0014Å".length();
                  var1 = '\b';
                  var8 = -1;
            }

            var10000 = 22;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -27859) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 228;
            case 1 -> 226;
            case 2 -> 88;
            case 3 -> 97;
            case 4 -> 130;
            case 5 -> 250;
            case 6 -> 178;
            case 7 -> 50;
            case 8 -> 14;
            case 9 -> 54;
            case 10 -> 13;
            case 11 -> 66;
            case 12 -> 10;
            case 13 -> 211;
            case 14 -> 205;
            case 15 -> 173;
            case 16 -> 113;
            case 17 -> 89;
            case 18 -> 11;
            case 19 -> 96;
            case 20 -> 214;
            case 21 -> 58;
            case 22 -> 217;
            case 23 -> 174;
            case 24 -> 69;
            case 25 -> 221;
            case 26 -> 216;
            case 27 -> 47;
            case 28 -> 186;
            case 29 -> 230;
            case 30 -> 121;
            case 31 -> 118;
            case 32 -> 204;
            case 33 -> 245;
            case 34 -> 155;
            case 35 -> 116;
            case 36 -> 20;
            case 37 -> 129;
            case 38 -> 237;
            case 39 -> 143;
            case 40 -> 39;
            case 41 -> 67;
            case 42 -> 240;
            case 43 -> 101;
            case 44 -> 15;
            case 45 -> 127;
            case 46 -> 165;
            case 47 -> 191;
            case 48 -> 68;
            case 49 -> 192;
            case 50 -> 126;
            case 51 -> 46;
            case 52 -> 148;
            case 53 -> 144;
            case 54 -> 199;
            case 55 -> 30;
            case 56 -> 28;
            case 57 -> 184;
            case 58 -> 91;
            case 59 -> 175;
            case 60 -> 119;
            case 61 -> 206;
            case 62 -> 182;
            case 63 -> 122;
            case 64 -> 23;
            case 65 -> 86;
            case 66 -> 137;
            case 67 -> 17;
            case 68 -> 218;
            case 69 -> 72;
            case 70 -> 0;
            case 71 -> 207;
            case 72 -> 117;
            case 73 -> 44;
            case 74 -> 233;
            case 75 -> 200;
            case 76 -> 41;
            case 77 -> 248;
            case 78 -> 180;
            case 79 -> 156;
            case 80 -> 12;
            case 81 -> 220;
            case 82 -> 224;
            case 83 -> 35;
            case 84 -> 242;
            case 85 -> 158;
            case 86 -> 94;
            case 87 -> 75;
            case 88 -> 225;
            case 89 -> 202;
            case 90 -> 21;
            case 91 -> 243;
            case 92 -> 100;
            case 93 -> 63;
            case 94 -> 170;
            case 95 -> 93;
            case 96 -> 215;
            case 97 -> 4;
            case 98 -> 176;
            case 99 -> 27;
            case 100 -> 150;
            case 101 -> 77;
            case 102 -> 42;
            case 103 -> 146;
            case 104 -> 108;
            case 105 -> 90;
            case 106 -> 111;
            case 107 -> 135;
            case 108 -> 53;
            case 109 -> 85;
            case 110 -> 64;
            case 111 -> 115;
            case 112 -> 201;
            case 113 -> 25;
            case 114 -> 43;
            case 115 -> 8;
            case 116 -> 163;
            case 117 -> 52;
            case 118 -> 80;
            case 119 -> 177;
            case 120 -> 29;
            case 121 -> 16;
            case 122 -> 123;
            case 123 -> 151;
            case 124 -> 71;
            case 125 -> 109;
            case 126 -> 103;
            case 127 -> 251;
            case 128 -> 36;
            case 129 -> 79;
            case 130 -> 235;
            case 131 -> 145;
            case 132 -> 40;
            case 133 -> 244;
            case 134 -> 125;
            case 135 -> 61;
            case 136 -> 102;
            case 137 -> 49;
            case 138 -> 56;
            case 139 -> 128;
            case 140 -> 2;
            case 141 -> 95;
            case 142 -> 161;
            case 143 -> 131;
            case 144 -> 114;
            case 145 -> 208;
            case 146 -> 203;
            case 147 -> 227;
            case 148 -> 164;
            case 149 -> 3;
            case 150 -> 247;
            case 151 -> 5;
            case 152 -> 168;
            case 153 -> 162;
            case 154 -> 187;
            case 155 -> 209;
            case 156 -> 252;
            case 157 -> 159;
            case 158 -> 37;
            case 159 -> 32;
            case 160 -> 172;
            case 161 -> 59;
            case 162 -> 141;
            case 163 -> 255;
            case 164 -> 38;
            case 165 -> 147;
            case 166 -> 9;
            case 167 -> 65;
            case 168 -> 45;
            case 169 -> 241;
            case 170 -> 132;
            case 171 -> 169;
            case 172 -> 7;
            case 173 -> 70;
            case 174 -> 48;
            case 175 -> 179;
            case 176 -> 166;
            case 177 -> 55;
            case 178 -> 133;
            case 179 -> 188;
            case 180 -> 193;
            case 181 -> 190;
            case 182 -> 138;
            case 183 -> 124;
            case 184 -> 154;
            case 185 -> 120;
            case 186 -> 92;
            case 187 -> 104;
            case 188 -> 222;
            case 189 -> 19;
            case 190 -> 195;
            case 191 -> 157;
            case 192 -> 24;
            case 193 -> 210;
            case 194 -> 197;
            case 195 -> 232;
            case 196 -> 140;
            case 197 -> 112;
            case 198 -> 219;
            case 199 -> 231;
            case 200 -> 62;
            case 201 -> 136;
            case 202 -> 73;
            case 203 -> 84;
            case 204 -> 253;
            case 205 -> 76;
            case 206 -> 229;
            case 207 -> 22;
            case 208 -> 82;
            case 209 -> 98;
            case 210 -> 81;
            case 211 -> 213;
            case 212 -> 74;
            case 213 -> 194;
            case 214 -> 153;
            case 215 -> 31;
            case 216 -> 234;
            case 217 -> 87;
            case 218 -> 254;
            case 219 -> 212;
            case 220 -> 134;
            case 221 -> 110;
            case 222 -> 160;
            case 223 -> 105;
            case 224 -> 83;
            case 225 -> 99;
            case 226 -> 78;
            case 227 -> 152;
            case 228 -> 198;
            case 229 -> 196;
            case 230 -> 149;
            case 231 -> 239;
            case 232 -> 26;
            case 233 -> 236;
            case 234 -> 60;
            case 235 -> 6;
            case 236 -> 246;
            case 237 -> 238;
            case 238 -> 33;
            case 239 -> 1;
            case 240 -> 57;
            case 241 -> 189;
            case 242 -> 51;
            case 243 -> 223;
            case 244 -> 34;
            case 245 -> 183;
            case 246 -> 139;
            case 247 -> 142;
            case 248 -> 171;
            case 249 -> 107;
            case 250 -> 106;
            case 251 -> 167;
            case 252 -> 181;
            case 253 -> 185;
            case 254 -> 249;
            default -> 18;
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

   private static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      private final boolean IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final float lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(boolean var1, float var2, int var3) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      }

      public final boolean a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final float b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final boolean d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final float e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         boolean var1, float var2, int var3
      ) {
         return new lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -8294;
         int var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         float var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         boolean var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 26196;
         short var10002 = -8296;
         short var10003 = 7720;
         short var10004 = -8293;
         short var10005 = -3188;
         return "WallAnalysis(shouldMineWall=" + var3 + ", targetYaw=" + var2 + ", totalObsidian=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Boolean.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var1 = var1 * 31 + Float.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         return var1 * 31 + Integer.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
         int var4 = ((this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) ? 1 : 0);
         if (var2 != null) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = Float.compare(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
         }

         if (var2 != null) {
            if (var4 != 0) {
               return false;
            }

            var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         if (var2 != null) {
            if (var4 != var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: {
         String[] var5 = new String[3];
         int var3 = 0;
         String var2 = "áWØ\t\u0010nLÏj^°\u000eºéß\u0098Þ?Ï\u008b>61\u0007L\u009ahÉ\u0010¡,Ü\f¾¢\u0007\u009b´\u0093\u0013 \u008fÛ\u0016Ü\fY5Ã![ÎtëÉÓþ¡";
         int var4 = "áWØ\t\u0010nLÏj^°\u000eºéß\u0098Þ?Ï\u008b>61\u0007L\u009ahÉ\u0010¡,Ü\f¾¢\u0007\u009b´\u0093\u0013 \u008fÛ\u0016Ü\fY5Ã![ÎtëÉÓþ¡".length();
         char var1 = 28;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 34;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 34;
                  var10006 = var6;
               } else {
                  var13 = 34;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 34;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 99;
                     case 1 -> 29;
                     case 2 -> 63;
                     case 3 -> 7;
                     case 4 -> 42;
                     case 5 -> 70;
                     default -> 101;
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
               b = new String[3];
               break pxClinit;
            }

            var1 = var2.charAt(var0);
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -8294) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 155;
               case 1 -> 161;
               case 2 -> 41;
               case 3 -> 103;
               case 4 -> 77;
               case 5 -> 17;
               case 6 -> 181;
               case 7 -> 98;
               case 8 -> 111;
               case 9 -> 143;
               case 10 -> 153;
               case 11 -> 184;
               case 12 -> 73;
               case 13 -> 100;
               case 14 -> 89;
               case 15 -> 75;
               case 16 -> 157;
               case 17 -> 166;
               case 18 -> 218;
               case 19 -> 202;
               case 20 -> 246;
               case 21 -> 0;
               case 22 -> 26;
               case 23 -> 216;
               case 24 -> 244;
               case 25 -> 210;
               case 26 -> 125;
               case 27 -> 148;
               case 28 -> 188;
               case 29 -> 200;
               case 30 -> 38;
               case 31 -> 251;
               case 32 -> 214;
               case 33 -> 194;
               case 34 -> 62;
               case 35 -> 48;
               case 36 -> 139;
               case 37 -> 112;
               case 38 -> 174;
               case 39 -> 138;
               case 40 -> 91;
               case 41 -> 167;
               case 42 -> 30;
               case 43 -> 37;
               case 44 -> 43;
               case 45 -> 165;
               case 46 -> 204;
               case 47 -> 1;
               case 48 -> 106;
               case 49 -> 101;
               case 50 -> 207;
               case 51 -> 22;
               case 52 -> 168;
               case 53 -> 97;
               case 54 -> 180;
               case 55 -> 206;
               case 56 -> 252;
               case 57 -> 123;
               case 58 -> 47;
               case 59 -> 147;
               case 60 -> 223;
               case 61 -> 9;
               case 62 -> 56;
               case 63 -> 128;
               case 64 -> 164;
               case 65 -> 247;
               case 66 -> 63;
               case 67 -> 186;
               case 68 -> 51;
               case 69 -> 116;
               case 70 -> 31;
               case 71 -> 121;
               case 72 -> 182;
               case 73 -> 160;
               case 74 -> 185;
               case 75 -> 50;
               case 76 -> 172;
               case 77 -> 58;
               case 78 -> 28;
               case 79 -> 225;
               case 80 -> 90;
               case 81 -> 187;
               case 82 -> 67;
               case 83 -> 130;
               case 84 -> 199;
               case 85 -> 159;
               case 86 -> 240;
               case 87 -> 49;
               case 88 -> 13;
               case 89 -> 236;
               case 90 -> 255;
               case 91 -> 72;
               case 92 -> 74;
               case 93 -> 242;
               case 94 -> 231;
               case 95 -> 176;
               case 96 -> 71;
               case 97 -> 189;
               case 98 -> 52;
               case 99 -> 162;
               case 100 -> 129;
               case 101 -> 140;
               case 102 -> 224;
               case 103 -> 219;
               case 104 -> 141;
               case 105 -> 239;
               case 106 -> 87;
               case 107 -> 21;
               case 108 -> 228;
               case 109 -> 132;
               case 110 -> 55;
               case 111 -> 88;
               case 112 -> 66;
               case 113 -> 178;
               case 114 -> 234;
               case 115 -> 232;
               case 116 -> 70;
               case 117 -> 142;
               case 118 -> 60;
               case 119 -> 24;
               case 120 -> 221;
               case 121 -> 42;
               case 122 -> 53;
               case 123 -> 110;
               case 124 -> 241;
               case 125 -> 203;
               case 126 -> 61;
               case 127 -> 44;
               case 128 -> 215;
               case 129 -> 34;
               case 130 -> 136;
               case 131 -> 69;
               case 132 -> 233;
               case 133 -> 117;
               case 134 -> 118;
               case 135 -> 227;
               case 136 -> 173;
               case 137 -> 230;
               case 138 -> 23;
               case 139 -> 33;
               case 140 -> 80;
               case 141 -> 208;
               case 142 -> 113;
               case 143 -> 40;
               case 144 -> 2;
               case 145 -> 76;
               case 146 -> 179;
               case 147 -> 36;
               case 148 -> 212;
               case 149 -> 68;
               case 150 -> 18;
               case 151 -> 226;
               case 152 -> 59;
               case 153 -> 193;
               case 154 -> 253;
               case 155 -> 84;
               case 156 -> 135;
               case 157 -> 201;
               case 158 -> 163;
               case 159 -> 96;
               case 160 -> 93;
               case 161 -> 154;
               case 162 -> 191;
               case 163 -> 108;
               case 164 -> 196;
               case 165 -> 175;
               case 166 -> 122;
               case 167 -> 222;
               case 168 -> 81;
               case 169 -> 25;
               case 170 -> 156;
               case 171 -> 217;
               case 172 -> 15;
               case 173 -> 198;
               case 174 -> 190;
               case 175 -> 35;
               case 176 -> 229;
               case 177 -> 92;
               case 178 -> 65;
               case 179 -> 11;
               case 180 -> 177;
               case 181 -> 158;
               case 182 -> 19;
               case 183 -> 220;
               case 184 -> 149;
               case 185 -> 195;
               case 186 -> 46;
               case 187 -> 12;
               case 188 -> 120;
               case 189 -> 152;
               case 190 -> 134;
               case 191 -> 64;
               case 192 -> 78;
               case 193 -> 248;
               case 194 -> 4;
               case 195 -> 45;
               case 196 -> 114;
               case 197 -> 102;
               case 198 -> 85;
               case 199 -> 151;
               case 200 -> 213;
               case 201 -> 245;
               case 202 -> 99;
               case 203 -> 86;
               case 204 -> 124;
               case 205 -> 10;
               case 206 -> 32;
               case 207 -> 39;
               case 208 -> 170;
               case 209 -> 83;
               case 210 -> 115;
               case 211 -> 171;
               case 212 -> 146;
               case 213 -> 145;
               case 214 -> 107;
               case 215 -> 126;
               case 216 -> 183;
               case 217 -> 133;
               case 218 -> 29;
               case 219 -> 254;
               case 220 -> 57;
               case 221 -> 94;
               case 222 -> 209;
               case 223 -> 137;
               case 224 -> 192;
               case 225 -> 95;
               case 226 -> 150;
               case 227 -> 205;
               case 228 -> 211;
               case 229 -> 3;
               case 230 -> 250;
               case 231 -> 169;
               case 232 -> 243;
               case 233 -> 8;
               case 234 -> 5;
               case 235 -> 104;
               case 236 -> 109;
               case 237 -> 20;
               case 238 -> 127;
               case 239 -> 249;
               case 240 -> 235;
               case 241 -> 16;
               case 242 -> 82;
               case 243 -> 131;
               case 244 -> 197;
               case 245 -> 54;
               case 246 -> 79;
               case 247 -> 144;
               case 248 -> 27;
               case 249 -> 14;
               case 250 -> 6;
               case 251 -> 238;
               case 252 -> 119;
               case 253 -> 7;
               case 254 -> 237;
               default -> 105;
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
   
    public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var0, boolean var1, float var2, int var3, int var4, Object var5) {
        if ((var4 & 1) != 0) {
            var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        }
        if ((var4 & 2) != 0) {
            var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
        }
        if ((var4 & 4) != 0) {
            var3 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
        }
        return var0.a(var1, var2, var3);
    }}

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
   public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll p0, Vec3 p1, int m, Object mk) {
      if ((m & 1) != 0) {
         p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }
      return new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(p1);
   }

      @NotNull
      private final Vec3 IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(@NotNull Vec3 var1) {
         short var10001 = 24133;
         short var10002 = 15959;
         Intrinsics.checkNotNullParameter(var1, "pos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      }

      @NotNull
      public final Vec3 a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final Vec3 b() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         @NotNull Vec3 var1
      ) {
         short var10001 = 24134;
         short var10002 = 4255;
         Intrinsics.checkNotNullParameter(var1, "pos");
         return new lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10001 = 24135;
         short var10002 = 20674;
         return "PathPoint(pos=" + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl + ")";
      }

      @Override
      public int hashCode() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         boolean var4 = Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         );
         if (var2 != null) {
            if (!var4) {
               return false;
            }

            var4 = true;
         }

         return var4;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: {
         String[] var5 = new String[3];
         int var3 = 0;
         String var2 = "&\u0094C\u0089\u001a}ó \u00846$\\Ï·\u0003pÓª\u0003¦\u0093p";
         int var4 = "&\u0094C\u0089\u001a}ó \u00846$\\Ï·\u0003pÓª\u0003¦\u0093p".length();
         char var1 = 14;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 58;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 58;
                  var10006 = var6;
               } else {
                  var13 = 58;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 58;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 92;
                     case 1 -> 81;
                     case 2 -> 95;
                     case 3 -> 105;
                     case 4 -> 78;
                     case 5 -> 22;
                     default -> 55;
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
               b = new String[3];
               break pxClinit;
            }

            var1 = var2.charAt(var0);
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 24135) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 165;
               case 1 -> 219;
               case 2 -> 70;
               case 3 -> 230;
               case 4 -> 118;
               case 5 -> 215;
               case 6 -> 39;
               case 7 -> 213;
               case 8 -> 91;
               case 9 -> 207;
               case 10 -> 71;
               case 11 -> 10;
               case 12 -> 80;
               case 13 -> 154;
               case 14 -> 94;
               case 15 -> 0;
               case 16 -> 88;
               case 17 -> 84;
               case 18 -> 51;
               case 19 -> 122;
               case 20 -> 102;
               case 21 -> 62;
               case 22 -> 57;
               case 23 -> 196;
               case 24 -> 97;
               case 25 -> 170;
               case 26 -> 242;
               case 27 -> 151;
               case 28 -> 208;
               case 29 -> 14;
               case 30 -> 128;
               case 31 -> 173;
               case 32 -> 96;
               case 33 -> 116;
               case 34 -> 115;
               case 35 -> 45;
               case 36 -> 124;
               case 37 -> 160;
               case 38 -> 252;
               case 39 -> 255;
               case 40 -> 229;
               case 41 -> 149;
               case 42 -> 140;
               case 43 -> 210;
               case 44 -> 233;
               case 45 -> 222;
               case 46 -> 87;
               case 47 -> 130;
               case 48 -> 193;
               case 49 -> 145;
               case 50 -> 183;
               case 51 -> 77;
               case 52 -> 13;
               case 53 -> 19;
               case 54 -> 127;
               case 55 -> 93;
               case 56 -> 226;
               case 57 -> 141;
               case 58 -> 67;
               case 59 -> 216;
               case 60 -> 206;
               case 61 -> 76;
               case 62 -> 254;
               case 63 -> 136;
               case 64 -> 178;
               case 65 -> 209;
               case 66 -> 243;
               case 67 -> 4;
               case 68 -> 159;
               case 69 -> 2;
               case 70 -> 146;
               case 71 -> 189;
               case 72 -> 175;
               case 73 -> 81;
               case 74 -> 83;
               case 75 -> 27;
               case 76 -> 7;
               case 77 -> 217;
               case 78 -> 100;
               case 79 -> 177;
               case 80 -> 75;
               case 81 -> 109;
               case 82 -> 26;
               case 83 -> 50;
               case 84 -> 46;
               case 85 -> 25;
               case 86 -> 144;
               case 87 -> 172;
               case 88 -> 204;
               case 89 -> 188;
               case 90 -> 238;
               case 91 -> 126;
               case 92 -> 163;
               case 93 -> 117;
               case 94 -> 104;
               case 95 -> 228;
               case 96 -> 106;
               case 97 -> 201;
               case 98 -> 161;
               case 99 -> 52;
               case 100 -> 59;
               case 101 -> 186;
               case 102 -> 143;
               case 103 -> 132;
               case 104 -> 121;
               case 105 -> 212;
               case 106 -> 111;
               case 107 -> 133;
               case 108 -> 224;
               case 109 -> 9;
               case 110 -> 152;
               case 111 -> 112;
               case 112 -> 54;
               case 113 -> 179;
               case 114 -> 142;
               case 115 -> 41;
               case 116 -> 246;
               case 117 -> 218;
               case 118 -> 78;
               case 119 -> 150;
               case 120 -> 169;
               case 121 -> 180;
               case 122 -> 68;
               case 123 -> 22;
               case 124 -> 66;
               case 125 -> 195;
               case 126 -> 153;
               case 127 -> 8;
               case 128 -> 40;
               case 129 -> 135;
               case 130 -> 245;
               case 131 -> 34;
               case 132 -> 99;
               case 133 -> 147;
               case 134 -> 247;
               case 135 -> 220;
               case 136 -> 223;
               case 137 -> 162;
               case 138 -> 35;
               case 139 -> 156;
               case 140 -> 65;
               case 141 -> 211;
               case 142 -> 120;
               case 143 -> 79;
               case 144 -> 239;
               case 145 -> 17;
               case 146 -> 176;
               case 147 -> 137;
               case 148 -> 23;
               case 149 -> 168;
               case 150 -> 1;
               case 151 -> 28;
               case 152 -> 31;
               case 153 -> 244;
               case 154 -> 105;
               case 155 -> 48;
               case 156 -> 38;
               case 157 -> 200;
               case 158 -> 235;
               case 159 -> 181;
               case 160 -> 187;
               case 161 -> 16;
               case 162 -> 232;
               case 163 -> 119;
               case 164 -> 21;
               case 165 -> 114;
               case 166 -> 15;
               case 167 -> 20;
               case 168 -> 30;
               case 169 -> 72;
               case 170 -> 3;
               case 171 -> 202;
               case 172 -> 12;
               case 173 -> 192;
               case 174 -> 92;
               case 175 -> 69;
               case 176 -> 197;
               case 177 -> 250;
               case 178 -> 253;
               case 179 -> 155;
               case 180 -> 33;
               case 181 -> 58;
               case 182 -> 139;
               case 183 -> 47;
               case 184 -> 225;
               case 185 -> 5;
               case 186 -> 171;
               case 187 -> 203;
               case 188 -> 248;
               case 189 -> 6;
               case 190 -> 24;
               case 191 -> 64;
               case 192 -> 167;
               case 193 -> 237;
               case 194 -> 129;
               case 195 -> 55;
               case 196 -> 101;
               case 197 -> 190;
               case 198 -> 251;
               case 199 -> 231;
               case 200 -> 44;
               case 201 -> 98;
               case 202 -> 241;
               case 203 -> 107;
               case 204 -> 134;
               case 205 -> 56;
               case 206 -> 86;
               case 207 -> 42;
               case 208 -> 95;
               case 209 -> 74;
               case 210 -> 221;
               case 211 -> 198;
               case 212 -> 236;
               case 213 -> 123;
               case 214 -> 166;
               case 215 -> 227;
               case 216 -> 18;
               case 217 -> 205;
               case 218 -> 103;
               case 219 -> 37;
               case 220 -> 110;
               case 221 -> 82;
               case 222 -> 85;
               case 223 -> 157;
               case 224 -> 174;
               case 225 -> 182;
               case 226 -> 113;
               case 227 -> 240;
               case 228 -> 191;
               case 229 -> 63;
               case 230 -> 125;
               case 231 -> 138;
               case 232 -> 90;
               case 233 -> 234;
               case 234 -> 29;
               case 235 -> 148;
               case 236 -> 11;
               case 237 -> 61;
               case 238 -> 185;
               case 239 -> 36;
               case 240 -> 49;
               case 241 -> 53;
               case 242 -> 184;
               case 243 -> 131;
               case 244 -> 249;
               case 245 -> 60;
               case 246 -> 43;
               case 247 -> 89;
               case 248 -> 158;
               case 249 -> 194;
               case 250 -> 199;
               case 251 -> 164;
               case 252 -> 214;
               case 253 -> 32;
               case 254 -> 73;
               default -> 108;
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
}
