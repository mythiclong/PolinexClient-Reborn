package me.octo.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.StringsKt;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.projectile.FishingHook;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class llIlIIIIlIlIIlllIllIlIIIIIIIlIlIIlllIlIllIIIlllllIlllIlIIIIIIIllIIIlIIIlIIIlIIllllIll
   extends IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI {

   @NotNull
   public static llIlIIIIlIlIIlllIllIlIIIIIIIlIlIIlllIlIllIIIlllllIlllIlIIIIIIIllIIIlIIIlIIIlIIllllIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
   @NotNull
   private me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
   @NotNull
   private me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
   private int lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
   private float IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   private float lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
   @NotNull
   private BlockPos lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
   @NotNull
   private BlockPos lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
   private int IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
   private boolean lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   private boolean IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
   @NotNull
   private Set<Integer> IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
   @Nullable
   private FishingHook lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
   @NotNull
   private final IlIllllIIIlIIllIllIIIllllIIIlllIllIlllllIIIlllIIIIlIIIIIlIIlIIlllIlllIllIllIIllIlIlII llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
   @Nullable
   private lIllIlllIIIlllllIIIIIllllIIlIIlIlIIIIIIIlIIlIIIlIlIIIIIIIIllIlIlIlIIlIIIlIlIIllIIllII lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
   @NotNull
   private List<Integer> IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
   @NotNull
   private static IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl;
   @NotNull
   private static IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll;
   @NotNull
   private static IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI;
   @NotNull
   private static IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI;
   private static String[] h;
   private static String[] i;

   public static IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl bo() {
      return lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl;
   }
   public static IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl bp() {
      return IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll;
   }
   public static IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl bq() {
      return lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI;
   }
   public static IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl br() {
      return lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI;
   }
   public llIlIIIIlIlIIlllIllIlIIIIIIIlIlIIlllIlIllIIIlllllIlllIlIIIIIIIllIIIlIIIlIIIlIIllllIll(
      String var1,
      String var2,
      me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3,
      String var4,
      List<String> var5,
      List<String> var6,
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var7,
      int var8,
      kotlin.jvm.internal.DefaultConstructorMarker var9
   ) {
      this(var1, var2, var3, var4, (var8 & 16) != 0 ? kotlin.collections.CollectionsKt.<String>emptyList() : var5, (var8 & 32) != 0 ? kotlin.collections.CollectionsKt.<String>emptyList() : var6, var7);
   }

   public llIlIIIIlIlIIlllIllIlIIIIIIIlIlIIlllIlIllIIIlllllIlllIlIIIIIIIllIIIlIIIlIIIlIIllllIll(
      @NotNull String var1,
      @NotNull String var2,
      @NotNull me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3,
      @NotNull String var4,
      @NotNull List<String> var5,
      @NotNull List<String> var6,
      @NotNull IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll... var7
   ) { BlockPos var15 = null; // PX-FIX hoist
        
      short var10001 = -31504;
      short var10002 = -27752;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = -31507;
      var10002 = -21733;
      Intrinsics.checkNotNullParameter(var2, "description");
      var10001 = -31489;
      var10002 = -26700;
      Intrinsics.checkNotNullParameter(var3, "category");
      var10001 = -31516;
      var10002 = -11764;
      Intrinsics.checkNotNullParameter(var4, "subcategory");
      var10001 = -31514;
      var10002 = 11927;
      Intrinsics.checkNotNullParameter(var5, "instructions");
      var10001 = -31513;
      var10002 = 12776;
      Intrinsics.checkNotNullParameter(var6, "tips");
      var10001 = -31501;
      var10002 = 29965;
      Intrinsics.checkNotNullParameter(var7, "settings");
      super(var1, var2, var3, var4,((List)( var5)), var6, true, Arrays.copyOf(var7, var7.length));
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = Random.Default.nextInt(5000, 15000);
       var15 = BlockPos.ZERO;
      short var10003 = -31491;
      short var10004 = 11394;
      Intrinsics.checkNotNullExpressionValue(BlockPos.ZERO, "ZERO");
      this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = var15;
      BlockPos var16 = BlockPos.ZERO;
      var10003 = -31491;
      var10004 = 11394;
      Intrinsics.checkNotNullExpressionValue(BlockPos.ZERO, "ZERO");
      this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII = var16;
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = new LinkedHashSet<>();
      this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl = new IlIllllIIIlIIllIllIIIllllIIIlllIllIlllllIIIlllIIIIlIIIIIlIIlIIlllIlllIllIllIIllIlIlII();
      this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII = new ArrayList<>();
      llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI[] var8 = new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI[]{
         new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
            llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            () -> a(this),
            true
         ),
         new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
            llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            llIlIIIIlIlIIlllIllIlIIIIIIIlIlIIlllIlIllIIIlllllIlllIlIIIIIIIllIIIlIIIlIIIlIIllllIll::bn,
            false
         )
      };
      this.a(CollectionsKt.listOf(var8));
   }

   @NotNull
   @Override
   protected lIIllIIlIllIIllIIlIIIIIlIlIlllIIIlllllllllIlIllIIIIlllllllllIlIllIIIlIlllllllIlllIlll aL() {
      return new lIIllIIlIllIIllIIlIIIIIlIlIlllIIIlllllllllIlIllIIIIlllllllllIlIllIIIlIlllllllIlllIlll(true, true, true, false, true, null, 40, null);
   }

   @NotNull
   protected final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI a5() {
      return this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
   }

   @NotNull
   protected final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI a6() {
      return this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
   }

   @NotNull
   protected final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI a7() {
      return this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII;
   }

   @NotNull
   protected final BlockPos a8() {
      return this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
   }

   protected final void a(@NotNull BlockPos var1) {
      short var10001 = -31494;
      short var10002 = -2566;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = var1;
   }

   protected final boolean a9() {
      return this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   }

   protected final void e(boolean var1) {
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = var1;
   }

   protected final boolean a_() {
      return this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
   }

   protected final void f(boolean var1) {
      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = var1;
   }

   @NotNull
   public final IlIllllIIIlIIllIllIIIllllIIIlllIllIlllllIIIlllIIIIlIIIIIlIIlIIlllIlllIllIllIIllIlIlII ba() {
      return this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
   }

   @Nullable
   public final lIllIlllIIIlllllIIIIIllllIIlIIlIlIIIIIIIlIIlIIIlIlIIIIIIIIllIlIlIlIIlIIIlIlIIllIIllII bb() {
      return this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
   }

   public final void a(@Nullable lIllIlllIIIlllllIIIIIllllIIlIIlIlIIIIIIIlIIlIIIlIlIIIIIIIIllIlIlIlIIlIIIlIlIIllIIllII var1) {
      this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = var1;
   }

   @NotNull
   public final List<Integer> bc() {
      return this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
   }

   public final void c(@NotNull List<Integer> var1) {
      short var10001 = -31490;
      short var10002 = -9029;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII = var1;
   }

   @Override
   public void M() {
      this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl.d();
      this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII.clear();
      this.aM();
      super.M();
   }

   @Override
   public void N() {
      this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl.e();
      this.aN();
      BlockPos var10001 = BlockPos.ZERO;
      short var10003 = -31491;
      short var10004 = 11394;
      Intrinsics.checkNotNullExpressionValue(BlockPos.ZERO, "ZERO");
      this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII = var10001;
      super.N();
   }

   @Override
   public void aM() {
      Object IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll = null; // PX-FIX
      boolean var10000 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.d();
      this.a(
         me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .n()
      );
      boolean var1 = var10000;
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(true);
      llIlIIIIlIlIIlllIllIlIIIIIIIlIlIIlllIlIllIIIlllllIlllIlIIIIIIIllIIIlIIIlIIIlIIllllIll var5 = this;
      if (!var1) {
         if (this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI == null) {
            short var12 = -31502;
            short var13 = 25740;
            this.a(
               "Missing: Fishing Rod",
               me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            );
            this.N();
            return;
         }

         super.aM();
         var5 = this;
      }

      BlockPos var9;
      label61: {
         llIlIIIIlIlIIlllIllIlIIIIIIIlIlIIlllIlIllIIIlllllIlllIlIIIIIIIllIIIlIIIlIIIlIIllllIll var10001 = this;
         if (!var1) {
            if (!Intrinsics.areEqual(this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII, BlockPos.ZERO)) {
               var9 = this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
               break label61;
            }

            var10001 = this;
         }

         BlockPos var10002;
         label62: {
            LocalPlayer var7 = var10001.ap().player;
            if (var7 != null) {
               LocalPlayer var2 = var7;
               if (!var1) {
                  llIlIIIIlIlIIlllIllIlIIIIIIIlIlIIlllIlIllIIIlllllIlllIlIIIIIIIllIIIlIIIlIIIlIIllllIll var4 = var5;
                  boolean var3 = false;
                  Vec3 var8 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var2);
                  var5 = var4;
                  if (var8 != null) {
                     var9 = me.octo.client.utils.lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .f(var8);
                     var10002 = var9;
                     if (var1) {
                        break label62;
                     }

                     if (var9 != null) {
                        break label61;
                     }
                  }
               }
            }

            var9 = BlockPos.ZERO;
            var10002 = BlockPos.ZERO;
         }

         short var10003 = -31491;
         short var10004 = 11394;
         Intrinsics.checkNotNullExpressionValue(var10002, "ZERO");
      }

      var5.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = var9;
      this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = 0;
      LocalPlayer var10 = this.ap().player;
      Intrinsics.checkNotNull(var10);
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = var10.getYRot();
      LocalPlayer var11 = this.ap().player;
      Intrinsics.checkNotNull(var11);
      this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = var11.getXRot();
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = false;
      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = false;
      var10000 = this.ac().isEmpty();
      if (!var1) {
         var10000 = !var10000;
      }

      if (var10000) {
         this.a(
            IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
         );
         this.bd();
         if (!var1) {
            return;
         }
      }

      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
      );
   }

   @Override
   public void aN() {
      super.aN();
      this.bm();
   }

   @Override
   public void ag() {
      super.ag();
      if (this.W()
         == IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
         )
       {
         me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .j();
      }
   }

   @Override
   public void ah() {
      super.ah();
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
      );
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.f();
      this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII.f();
   }

   protected final void a(float var1, float var2) {
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = var1;
      this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = var2;
   }

   @Override
   public void aC() {
      Object var4 = null; // PX-FIX
      Object var3 = null; // PX-FIX
      Object IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll = null; // PX-FIX
      boolean var1 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      int var10000 = ((me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m()) ? 1 : 0);
      if (var1) {
         if (var10000 == 0) {
            return;
         }

         var10000 = ((IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll.ae()) ? 1 : 0);
      }

      label56: {
         label55: {
            label54:
            if (var1) {
               label61: {
                  if (var10000 != 0) {
                     var10000 = ((java.util.function.Supplier<Integer>)(() -> { this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll
                        .a((long)this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl); return 0; })).get();
                     if (!var1) {
                        break label54;
                     }

                     label49:
                     if (var10000 != 0) {
                        llIlIIIIlIlIIlllIllIlIIIIIIIlIlIIlllIlIllIIIlllllIlllIlIIIIIIIllIIIlIIIlIIIlIIllllIll var2 = this;
                        if (var1) {
                           if (this.W()
                              != IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                              )
                            {
                              var3 = this.W();
                              if (!var1) {
                                 break label61;
                              }

                              if (var3
                                 != IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
                                 )
                               {
                                 break label49;
                              }
                           }

                           var2 = this;
                        }

                        var2.bg();
                     }
                  }

                  var4 = this;
                  if (!var1) {
                     break label55;
                  }

                  var3 = this.W();
               }

               var10000 = ((int[])llIlIIIIlIlIIlllIllIlIIIIIIIlIlIIlllIlIllIIIlllllIlllIlIIIIIIIllIIIlIIIlIIIlIIllllIll$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)[((me.octo.client.PXDyn)var3).ordinal()];
            }

            switch (var10000) {
               case 1:
                  var4 = this;
                  break;
               case 2:
                  break label56;
               default:
                  return;
            }
         }

         this.be();
         if (var1) {
            return;
         }
      }

      this.bf();
   }

   private final void bd() {
      Object IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll = null; // PX-FIX
      boolean var1 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      llIlIIIIlIlIIlllIllIlIIIIIIIlIlIIlllIlIllIIIlllllIlllIlIIIIIIIllIIIlIIIlIIIlIIllllIll var10000 = this;
      if (var1) {
         if (this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll < this.ac().size()) {
            return;
         }

         this.a(
            IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         );
         var10000 = this;
      }

      BlockPos var3;
      label25: {
         BlockPos var10002;
         label24: {
            if (var1) {
               LocalPlayer var10001 = this.ap().player;
               Intrinsics.checkNotNull(var10001);
               Vec3 var2 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var10001);
               if (var2 != null) {
                  var3 = me.octo.client.utils.lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .f(var2);
                  var10002 = var3;
                  if (!var1) {
                     break label24;
                  }

                  if (var3 != null) {
                     break label25;
                  }
               }
            }

            var3 = BlockPos.ZERO;
            var10002 = BlockPos.ZERO;
         }

         short var10003 = -31520;
         short var10004 = -1840;
         Intrinsics.checkNotNullExpressionValue(var10002, "ZERO");
      }

      var10000.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = var3;
   }

   protected void be() { Object var15 = null; // PX-FIX hoist
        
       var15 = null; // PX-FIX
      Object IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll = null; // PX-FIX
      boolean var1 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.d();
      int var10000 = ((this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl) ? 1 : 0);
      if (!var1) {
         if (this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl) {
            llIlIIIIlIlIIlllIllIlIIIIIIIlIlIIlllIlIllIIIlllllIlllIlIIIIIIIllIIIlIIIlIIIlIIllllIll var11 = this;
            if (!var1) {
               LocalPlayer var12 = this.ap().player;
               Intrinsics.checkNotNull(var12);
               if (var12.getXRot() > 85.0F) {
                  boolean var17 = this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
                  if (!var1) {
                     if (!this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll) {
                        this.bh();
                        this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = true;
                     }

                     var17 = me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .i();
                  }

                  if (var17) {
                     return;
                  }

                  return;
               }

               this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = false;
               var11 = this;
            }

            var11.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = false;
         }

         me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var13 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10001 = this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
         Intrinsics.checkNotNull(this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI);
         String var18 = var10001.a().getHoverName().getString();
         short var10003 = -31511;
         short var10004 = -13431;
         Intrinsics.checkNotNullExpressionValue(var18, "getString(...)");
         var10000 = ((var13.c(var18)) ? 1 : 0);
      }

      if (!var1) {
         if (var10000 == 0) {
            me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var16 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var24 = this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
            Intrinsics.checkNotNull(this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI);
            var16.b(var24.b());
            this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.f();
            return;
         }

         var10000 = ((java.util.function.Supplier<Integer>)(() -> { this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.a(50); return 0; })).get();
      }

      if (!var1) {
         if (var10000 == 0) {
            return;
         }

         LocalPlayer var14 = this.ap().player;
         Intrinsics.checkNotNull(var14);
         float var27;
         var10000 = (var27 = Math.abs(var14.getXRot() - this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII) - 10.0F)
               == 0.0F
            ? 0
            : (var27 < 0.0F ? -1 : 1);
      }

      label112: {
         if (!var1) {
            if (var10000 > 0) {
               LocalPlayer var22 = this.ap().player;
               Intrinsics.checkNotNull(var22);
               this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = var22.getXRot();
               var22 = this.ap().player;
               Intrinsics.checkNotNull(var22);
               this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = var22.getYRot();
               this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.f();
               return;
            }

            var15 = this;
            if (var1) {
               break label112;
            }

            var10000 = ((java.util.function.Supplier<Integer>)(() -> { this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.a(150); return 0; })).get();
         }

         if (var10000 == 0) {
            return;
         }

         var15 = this;
      }

      BlockPos var21;
      label92: {
         label91: {
            if (!var1) {
               LocalPlayer var19 = this.ap().player;
               if (var19 != null) {
                  LocalPlayer var5 = var19;
                  if (!var1) {
                     llIlIIIIlIlIIlllIllIlIIIIIIIlIlIIlllIlIllIIIlllllIlllIlIIIIIIIllIIIlIIIlIIIlIIllllIll var8 =((llIlIIIIlIlIIlllIllIlIIIIIIIlIlIIlllIlIllIIIlllllIlllIlIIIIIIIllIIIlIIIlIIIlIIllllIll)( var15));
                     boolean var6 = false;
                     Vec3 var20 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var5);
                     var15 = var8;
                     if (var20 != null) {
                        var21 = me.octo.client.utils.lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .f(var20);
                        if (var1) {
                           break label92;
                        }

                        if (var21 != null) {
                           break label91;
                        }
                     }
                  }
               }
            }

            var21 = BlockPos.ZERO;
            short var25 = -31491;
            short var26 = 11394;
            Intrinsics.checkNotNullExpressionValue(BlockPos.ZERO, "ZERO");
         }

         this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = var21;
         var15 = this;
         var21 = this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
      }

      this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII = var21;
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll.clear();
      Iterable var2 = this.bi();
      boolean var3 = false;

      label76: {
         for (Object var9 : var2) {
            FishingHook var10 = (FishingHook)var9;
            boolean var7 = false;
            this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll.add(var10.getId());
            if (var1) {
               break label76;
            }

            if (var1) {
               break;
            }
         }

         this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = null;
         me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .j();
         this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll.f();
         this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII.f();
         this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.f();
         this.a(
            IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
         );
      }

      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.f();
   }

   protected void bf() {
      Object var5 = null; // PX-FIX
      Object var4 = null; // PX-FIX
      boolean var1;
      FishingHook var2;
      boolean var3;
      var3 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.d();
      var2 = this.bj();
      var1 = var3;
      var3 = this.bl();
      label59:
      if (!var1) {
         if (var3) {
            var3 = ((java.util.function.Supplier<Boolean>)(() -> { this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.a(200); return false; })).get();
            if (var1) {
               break label59;
            }

            if (var3) {
               me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .j();
               this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII.f();
               this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.f();
               this.a(
                  IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
               );
               this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = null;
               return;
            }
         }

         var3 = ((java.util.function.Supplier<Boolean>)(() -> { this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII
            .a((long)(lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl.M() * 1000)); return false; })).get();
      }

      label52:
      if (!var1) {
         if (var3) {
            var3 = this.bk();
            if (var1) {
               break label52;
            }

            if (!var3) {
               short var10001 = -31492;
               short var10002 = -29338;
               this.a(
                  "Desync detected, recasting",
                  me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
               );
               me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .j();
               this.a(
                  IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
               );
               this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.f();
               this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII.f();
               this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = null;
               return;
            }
         }

         var3 = ((java.util.function.Supplier<Boolean>)(() -> { this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.a(1000); return false; })).get();
      }

      if (var3) {
         label43: {
            label42: {
               label62: {
                  if (var2 != null) {
                     var4 = this;
                     if (var1) {
                        break label42;
                     }

                     if (this.a(var2)) {
                        break label62;
                     }
                  }

                  var5 = this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll;
                  if (var1) {
                     break label43;
                  }

                  if (((java.util.function.Supplier<Boolean>)(() -> { this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll.a(500); return null; })).get() && var2 == null) {
                     short var6 = -31517;
                     short var7 = 21905;
                     this.a(
                        "Bobber missing, recasting",
                        me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                     );
                     this.a(
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                     );
                     this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.f();
                     this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = null;
                  }
               }

               var4 = this;
            }

            var5 = this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
         }

         ((me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI)var5).f();
      }
   }

   private final void bg() {
      boolean var1 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      if (var1) {
         label22:
         if (IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll.ae()) {
            float var3;
            int var10000 = (var3 = Random.Default.nextFloat() - 0.5F) == 0.0F ? 0 : (var3 < 0.0F ? -1 : 1);
            if (var1) {
               if (var10000 >= 0) {
                  break label22;
               }

               LocalPlayer var2 = this.ap().player;
               Intrinsics.checkNotNull(var2);
               var10000 = ((var2.isShiftKeyDown()) ? 1 : 0);
            }

            label28: {
               if (var1) {
                  if (var10000 == 0) {
                     break label28;
                  }

                  float var4;
                  var10000 = (var4 = Random.Default.nextFloat() - 0.4F) == 0.0F ? 0 : (var4 < 0.0F ? -1 : 1);
               }

               if (var10000 < 0) {
                  short var10001 = -31512;
                  short var10002 = -4487;
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a("sneak", false);
                  return;
               }
            }

            me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(null);
         }

         this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = Random.Default
            .nextInt(
               lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI.M() * 500,
               lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI.M() * 1500
            );
         this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll.f();
      }
   }

   protected final void bh() {
      float var1 = this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII + (float)Random.Default.nextDouble(-1.0, 1.0);
      me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.a(
         this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI + (float)Random.Default.nextDouble(-1.0, 1.0), var1
      );
   }

   private final List<FishingHook> bi() {
      boolean var1 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      if (var1) {
         LocalPlayer var10000 = this.ap().player;
         if (var10000 != null) {
            LocalPlayer var2 = var10000;
            ClientLevel var11 = this.ap().level;
            Intrinsics.checkNotNull(var11);
            List var3 = var11.getEntities(
               var2, var2.getBoundingBox().inflate(30.0, 15.0, 30.0), null
            );
            short var10001 = -31509;
            short var10002 = 10738;
            Intrinsics.checkNotNullExpressionValue(var3, "getEntities(...)");
            Iterable var10 = var3;
            boolean var4 = false;
            var var6 = new ArrayList();
            boolean var7 = false;

            for (Object var9 : var10) {
               boolean var12 = var9 instanceof FishingHook;
               if (var1) {
                  if (!var12) {
                     continue;
                  }

                  var6.add(var9);
               }

               if (!var1) {
                  break;
               }
            }

            return var6;
         }
      }

      return CollectionsKt.emptyList();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Nullable
   protected final FishingHook bj() {
      Object var26 = null; // PX-FIX
      boolean var1;
      FishingHook var24;
      label122: {
         var1 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.d();
         if (!var1) {
            LocalPlayer var10000 = this.ap().player;
            if (var10000 != null) {
               var24 = var10000.fishing;
               break label122;
            }
         }

         var24 = null;
      }

      label125: {
         FishingHook var2 = var24;
         var24 = var2;
         label115:
         if (!var1) {
            if (var2 != null) {
               var24 = var2;
               if (var1) {
                  break label115;
               }

               if (var2.isAlive()) {
                  this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = var2;
                  return var2;
               }
            }

            var26 = this;
            if (var1) {
               break label125;
            }

            var24 = this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
         }

         if (var24 != null) {
            var26 = this;
            if (var1) {
               break label125;
            }

            var24 = this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
            Intrinsics.checkNotNull(this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI);
            if (var24.isAlive()) {
               return this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
            }
         }

         var26 = this;
      }

      List var3 = this.bi();
      Iterable var5 = var3;
      boolean var6 = false;
      Object var8 = new ArrayList();
      boolean var9 = false;
      Iterator var10 = var5.iterator();

      while (true) {
         if (var10.hasNext()) {
            Object var11 = var10.next();
            FishingHook var12 = (FishingHook)var11;
            boolean var13 = false;
            var24 = ((FishingHook)(Object)(this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll));
            if (var1) {
               break;
            }

            boolean var29 = this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll.contains(var12.getId());
            if (!var1) {
               var29 = !var29;
            }

            if (!var29) {
               continue;
            }

            ((me.octo.client.PXDyn)var8).add(var11);
            if (!var1) {
               continue;
            }
         }

         var24 = (FishingHook)var8;
         break;
      }

      List var4 = (List)var24;
      boolean var30 = var4.isEmpty();
      if (!var1) {
         var30 = !var30;
      }

      if (!var30) {
         return null;
      } else {
         label128: {
            Iterator var7;
            label129: {
               var5 = var4;
               var6 = false;
               var7 = var5.iterator();
               boolean var31 = var7.hasNext();
               if (!var1) {
                  if (!var31) {
                     var24 = null;
                     break label128;
                  }

                  var8 = var7.next();
                  var24 = ((FishingHook)(Object)(var7));
                  if (var1) {
                     break label129;
                  }

                  var31 = var7.hasNext();
               }

               if (!var31) {
                  var24 = (FishingHook)var8;
                  break label128;
               }

               var24 = (FishingHook)var8;
            }

            FishingHook var17 = var24;
            boolean var19 = false;
            LocalPlayer var10001 = this.ap().player;
            Intrinsics.checkNotNull(var10001);
            float var18 = var17.distanceTo(var10001);

            label72:
            while (true) {
               Object var20 = var7.next();
               FishingHook var21 = (FishingHook)var20;
               boolean var23 = false;
               var10001 = this.ap().player;
               Intrinsics.checkNotNull(var10001);
               float var22 = var21.distanceTo(var10001);
               if (Float.compare(var18, var22) > 0) {
                  var8 = var20;
                  var18 = var22;
               }

               while (!var7.hasNext()) {
                  if (!var1) {
                     var24 = (FishingHook)var8;
                     break label72;
                  }

                  var18 = var22;
               }
            }
         }

         this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = var24;
         return this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
      }
   }

   public final boolean a(@NotNull Entity var1) {
      boolean var10000 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.d();
      short var10002 = -31506;
      short var10003 = -21782;
      Intrinsics.checkNotNullParameter(var1, "bobber");
      boolean var2 = var10000;
      var10000 = var1.isInWater();
      if (!var2) {
         if (!var10000) {
            var10000 = var1.isUnderWater();
            if (var2) {
               return var10000;
            }

            if (!var10000) {
               var10000 = var1.isInLava();
               if (var2) {
                  return var10000;
               }

               if (!var10000) {
                  return false;
               }
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   protected final boolean bk() {
      return this.e("?");
   }

   protected final boolean bl() {
      return this.e("!");
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final boolean e(String var1) {
       boolean var15 = false; // PX-FIX decl var15
      Object var14 = null; // PX-FIX
      Object IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll = null; // PX-FIX
      boolean var2 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.d();
      if (!var2) {
         FishingHook var10000 = this.bj();
         if (var10000 != null) {
            Vec3 var4;
            FishingHook var3 = var10000;
            var4 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var3);
            ClientLevel var13 = this.ap().level;
            Intrinsics.checkNotNull(var13);
            List var6 = var13.getEntitiesOfClass(
               ArmorStand.class,
               var3.getBoundingBox().inflate(2.0, 3.0, 2.0),
               llIlIIIIlIlIIlllIllIlIIIIIIIlIlIIlllIlIllIIIlllllIlllIlIIIIIIIllIIIlIIIlIIIlIIllllIll::b
            );
            short var10001 = -31495;
            short var10002 = -29969;
            Intrinsics.checkNotNullExpressionValue(var6, "getEntitiesOfClass(...)");
            var var12 = var6;
            boolean var7 = false;
            var14 = var12;
            label130:
            if (!var2) {
               if (var12 instanceof Collection) {
                  var14 = (Collection)var12;
                  if (var2) {
                     break label130;
                  }

                  if (((me.octo.client.PXDyn)var14).isEmpty()) {
                     return false;
                  }
               }

               var14 = var12;
            }

            Iterator var8 = ((me.octo.client.PXDyn)var14).iterator();

            label121:
            while (true) {
               if (!var8.hasNext()) {
                  var15 = false;
                  break;
               }

               Object var9 = var8.next();
               ArmorStand var10 = (ArmorStand)var9;
               boolean var11 = false;
               if (!var2) {
                  var15 = var10.hasCustomName();
               } else {
                  Component var16 = var10.getCustomName();
                  boolean var18;
                  if (var16 != null) {
                     String var17 = var16.getString();
                     if (!var2) {
                        if (var17 != null) {
                           var18 = StringsKt.contains(var17, var1, false);
                           if (!var2) {
                              ;
                           }
                        } else {
                           var18 = false;
                        }
                     } else {
                        var18 = StringsKt.contains(var17, var17, false);
                        if (!var2) {
                           ;
                        }
                     }
                  } else {
                     var18 = false;
                  }

                  int var19;
                  if (var18) {
                     Intrinsics.checkNotNull(var10);
                     double var24;
                     var19 = (
                              var24 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var10)
                                    .distanceTo(var4)
                                 - 2.0
                           )
                           == 0.0
                        ? 0
                        : (var24 < 0.0 ? -1 : 1);
                     if (!var2) {
                        var19 = var19 < 0 ? 1 : 0;
                     }
                  } else {
                     var19 = 0;
                  }

                  if (var19 == 0) {
                     continue;
                  }

                  var15 = true;
                  if (!var2) {
                     break;
                  }
               }

               do {
                  while (!var15) {
                     if (true) {
                        continue label121;
                     }

                     var15 = true;
                     if (!var2) {
                        return true;
                     }
                  }

                  Component var20 = var10.getCustomName();
                  boolean var22;
                  if (var20 != null) {
                     String var21 = var20.getString();
                     if (!var2) {
                        if (var21 != null) {
                           var22 = StringsKt.contains(var21, var1, false);
                           if (!var2) {
                              ;
                           }
                        } else {
                           var22 = false;
                        }
                     } else {
                        var22 = StringsKt.contains(var21, var21, false);
                        if (!var2) {
                           ;
                        }
                     }
                  } else {
                     var22 = false;
                  }

                  int var23;
                  if (var22) {
                     Intrinsics.checkNotNull(var10);
                     double var25;
                     var23 = (
                              var25 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var10)
                                    .distanceTo(var4)
                                 - 2.0
                           )
                           == 0.0
                        ? 0
                        : (var25 < 0.0 ? -1 : 1);
                     if (!var2) {
                        var23 = var23 < 0 ? 1 : 0;
                     }
                  } else {
                     var23 = 0;
                  }

                  if (var23 == 0) {
                     continue label121;
                  }

                  var15 = true;
               } while (var2);

               return true;
            }

            return var15;
         }
      }

      return false;
   }

   protected void bm() {
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = 0.0F;
      this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = 0.0F;
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = false;
      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = false;
      this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = 0;
      this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = null;
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll.clear();
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.f();
      this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll.f();
      this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll.f();
      this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII.f();
      this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.f();
   }

   @Override
   public void aB() {
      boolean var10000 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
      );
      this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = 0;
      boolean var1 = var10000;
      var10000 = this.ac().isEmpty();
      if (var1) {
         var10000 = !var10000;
      }

      if (var10000) {
         this.bd();
         if (var1) {
            return;
         }
      }

      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
      );
   }

   private static final boolean a(llIlIIIIlIlIIlllIllIlIIIIIIIlIlIIlllIlIllIIIlllllIlllIlIIIIIIIllIIIlIIIlIIIlIIllllIll var0) {
      boolean var1 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.d();
      boolean var10000 = var0.af();
      if (!var1) {
         if (!var10000) {
            return false;
         }

         var10000 = lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            .b();
      }

      return var1 ? var10000 : var10000;
   }

   private static final boolean bn() {
      return IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .e();
   }

   private static final Unit b(llIlIIIIlIlIIlllIllIlIIIIIIIlIlIIlllIlIllIIIlllllIlllIlIIIIIIIllIIIlIIIlIIIlIIllllIll var0) {
      boolean var10000 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.d();
      short var10002 = -31505;
      short var10003 = -22230;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("sneak", true);
      try {
         Thread.sleep(250L);
      }
      catch (InterruptedException interruptedException) {
         throw new RuntimeException(interruptedException);
      }
      boolean var1 = var10000;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var2 = me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      Vec3 var10001 = new Vec3(var0.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII)
         .add(Random.Default.nextDouble(-0.2, 0.2), 0.0, Random.Default.nextDouble(-0.2, 0.2));
      var10003 = -31493;
      short var10004 = 30206;
      Intrinsics.checkNotNullExpressionValue(var10001, "add(...)");
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(var2, var10001, false);
      try {
         Thread.sleep(50L);
      }
      catch (InterruptedException interruptedException) {
         throw new RuntimeException(interruptedException);
      }
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var3 = me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      if (!var1) {
         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .p();
         try {
            Thread.sleep(150L);
         }
         catch (InterruptedException interruptedException) {
            throw new RuntimeException(interruptedException);
         }
         if (!(Random.Default.nextFloat() < 0.5F)) {
            return Unit.INSTANCE;
         }

         var3 = me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      short var4 = -31505;
      var10002 = -22230;
      var3.a("sneak", false);
      return Unit.INSTANCE;
   }

   private static final boolean b(Entity var0) {
      short var10001 = -31519;
      short var10002 = -21434;
      Intrinsics.checkNotNullParameter(var0, "entity");
      return var0 instanceof FishingHook;
   }

   private static final boolean a(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final boolean a(ArmorStand var0) {
      short var10001 = -31518;
      short var10002 = 2936;
      Intrinsics.checkNotNullParameter(var0, "it");
      return true;
   }

   private static final boolean b(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[27];
      int var3 = 0;
      String var2 = "Ë:\u009d4C\u0019y$Ç\u00029)·Þ#\u0090\u0006\u008d$Ï\u001cwÀÓKäå?©¼¸Å\u001c \\°#Eò£Ø«K\u008eLbaC1ýkæ\u009b\u008e·F¦{ûáþªÇ*\nÆé\u0011R\u001dè¾¢=¼r\u0098h\u0002\u0091u\n¡Ü\u0010æ\u0087ï ÊÊmÌéÊÖ\u001b®\u009e\u000bx\u0005\u0094$&\u009aÅ\u000e\u0007óÓ8W\u000b\u0087(ºB.èG!\u0006·Âvd&\u0097\u0005Êlí\u0093¼<K?\u0093\u0099%%ù\fy\\¾¿±é\u0090\u001f\u0004Êfî\u000b¢\u0090Ù\u0086>OÞî\tP¢\u0001oç\u0082\u0001¿\u007f¶êL\u0082«KCY$ö\u001cU\u0018\u0012Þ@_91\u0014±\u000bóZ)=é\u0086\u008fû\u008f&\u0007\u0002,¾\u0019ëÂÙdÓ\u0097m¸\u0089hÚÚo\u0086y\u00128ßû\u0014ý ¢L«\u0004 \u007f\u009b\u0091\u00069ðV\bç{\f\u008aÊªR\u0099\u0082\u0092ä]Å]ê\u0004Ç«¾\u009e\u000b¹ù\u0084[|WYlä¸»\u000b³X\u0005gp\u009es\u0093J\r´\u0007\u008cþ\u0083j7Ï®\b¹\rÒ½?óÜ§\b\u0092u\u0083¸\u0004U°\u0093\u0017·(ÅU\u008ftÅ\u001bü0t#²\u007f\u008bÌ/{s\u001b\u0093½Ù\u0007\u0085\u0093¢Ç\u0013z*\bOP^þõ>¹'\u001a\u00071\u0093J¢;)\u0017\r²ÑlÀ\u0019\u009d¯·ò\u0014FÔ¯ÊM\u0011)\u0004Ó\"õ:\u0014×#¡\u008fãÅ¡:ö°OH\u0082\u0083@:GB\u0000s";
      int var4 = "Ë:\u009d4C\u0019y$Ç\u00029)·Þ#\u0090\u0006\u008d$Ï\u001cwÀÓKäå?©¼¸Å\u001c \\°#Eò£Ø«K\u008eLbaC1ýkæ\u009b\u008e·F¦{ûáþªÇ*\nÆé\u0011R\u001dè¾¢=¼r\u0098h\u0002\u0091u\n¡Ü\u0010æ\u0087ï ÊÊmÌéÊÖ\u001b®\u009e\u000bx\u0005\u0094$&\u009aÅ\u000e\u0007óÓ8W\u000b\u0087(ºB.èG!\u0006·Âvd&\u0097\u0005Êlí\u0093¼<K?\u0093\u0099%%ù\fy\\¾¿±é\u0090\u001f\u0004Êfî\u000b¢\u0090Ù\u0086>OÞî\tP¢\u0001oç\u0082\u0001¿\u007f¶êL\u0082«KCY$ö\u001cU\u0018\u0012Þ@_91\u0014±\u000bóZ)=é\u0086\u008fû\u008f&\u0007\u0002,¾\u0019ëÂÙdÓ\u0097m¸\u0089hÚÚo\u0086y\u00128ßû\u0014ý ¢L«\u0004 \u007f\u009b\u0091\u00069ðV\bç{\f\u008aÊªR\u0099\u0082\u0092ä]Å]ê\u0004Ç«¾\u009e\u000b¹ù\u0084[|WYlä¸»\u000b³X\u0005gp\u009es\u0093J\r´\u0007\u008cþ\u0083j7Ï®\b¹\rÒ½?óÜ§\b\u0092u\u0083¸\u0004U°\u0093\u0017·(ÅU\u008ftÅ\u001bü0t#²\u007f\u008bÌ/{s\u001b\u0093½Ù\u0007\u0085\u0093¢Ç\u0013z*\bOP^þõ>¹'\u001a\u00071\u0093J¢;)\u0017\r²ÑlÀ\u0019\u009d¯·ò\u0014FÔ¯ÊM\u0011)\u0004Ó\"õ:\u0014×#¡\u008fãÅ¡:ö°OH\u0082\u0083@:GB\u0000s"
         .length();
      char var1 = 'T';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 9;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var26 = var10001.toCharArray();
               int var10004 = var26.length;
               int var6 = 0;
               byte var29 = var10000;
               var20 = var26;
               int var14 = var10004;
               byte var38;
               char[] var44;
               int var10006;
               if (var10004 <= 1) {
                  var44 = var26;
                  var38 = var10000;
                  var10006 = var6;
               } else {
                  var29 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var44 = var26;
                  var38 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var44[var10006] = (char)(var44[var10006] ^ var38 ^ switch (var6 % 7) {
                     case 0 -> 30;
                     case 1 -> 38;
                     case 2 -> 39;
                     case 3 -> 48;
                     case 4 -> 111;
                     case 5 -> 105;
                     default -> 59;
                  });
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var44 = var20;
                     var38 = var29;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var44 = var20;
                     var38 = var29;
                     var10006 = var6;
                  }
               }
            }

            String var31 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var31;
                  if ((var8 += var1) >= var4) {
                     h = var5;
                     i = new String[27];
                     lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = new llIlIIIIlIlIIlllIllIlIIIIIIIlIlIIlllIlIllIIIlllllIlllIlIIIIIIIllIIIlIIIlIIIlIIllllIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     var10002 = -31515;
                     short var32 = 8687;
                     short var33 = -31508;
                     short var42 = -8589;
                     lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl = new IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl(
                        "Desync Time", "How much time to wait before recasting if nothing is caught.", 10, 30, 20, 1
                     );
                     var10002 = -31496;
                     short var34 = -19131;
                     short var35 = -31510;
                     var42 = 24957;
                     IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll = new IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl(
                        "Anti-AFK", "Perform Anti-AFK actions, by default enables rotations to avoid skill XP loss et al.", true
                     );
                     lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI = new IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl("Anti-AFK Time", "How often to move around.", 5, 30, 10, 1) {
                        private static String[] f;
                        private static String[] g;

                        {
                           short var10001x = 4902;
                           short var10002x = 21194;
                           var10002x = 4903;
                           short var10003 = -28288;
                        }

                        @Override
                        public boolean b() {
                           return llIlIIIIlIlIIlllIllIlIIIIIIIlIlIIlllIlIllIIIlllllIlllIlIIIIIIIllIIIlIIIlIIIlIIllllIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                              .b()
                              .ae();
                        }

                        // $VF: Irreducible bytecode was duplicated to produce valid code
                        static { String var15 = null; // PX-FIX hoist
        
                           String[] var5 = new String[2];
                           int var3 = 0;
                           String var2 = "}\u0007*s\bÚÌk»7\u0091\u0016\u001e\u0016wÂºñD\u009e\u0091eh ±\r=Ö\t!M×\\'\u0093!\u000e,\u0016";
                           int var4 = "}\u0007*s\bÚÌk»7\u0091\u0016\u001e\u0016wÂºñD\u009e\u0091eh ±\r=Ö\t!M×\\'\u0093!\u000e,\u0016".length();
                           char var1 = 25;
                           int var0 = -1;

                           while (true) {
                              char[] var10002;
                              label38: {
                                 char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                                 int var10004 = var10003.length;
                                 int var6 = 0;
                                 byte var13 = 127;
                                 var10002 = var10003;
                                 int var8 = var10004;
                                 byte var16;
                                 char[] var10005;
                                 int var10006;
                                 if (var10004 <= 1) {
                                    var10005 = var10003;
                                    var16 = 127;
                                    var10006 = var6;
                                 } else {
                                    var13 = 127;
                                    var8 = var10004;
                                    if (var10004 <= var6) {
                                       break label38;
                                    }

                                    var10005 = var10003;
                                    var16 = 127;
                                    var10006 = var6;
                                 }

                                 while (true) {
                                    var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                                       case 0 -> 2;
                                       case 1 -> 78;
                                       case 2 -> 99;
                                       case 3 -> 104;
                                       case 4 -> 71;
                                       case 5 -> 107;
                                       default -> 67;
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

                               var15 = new String(var10002).intern();
                              byte var10 = -1;
                              var5[var3++] = var15;
                              if ((var0 += var1) >= var4) {
                                 f = var5;
                                 g = new String[2];
                                 break;
                              }

                              var1 = var2.charAt(var0);
                           }
                        }

                        private static String c(int var0, int var1x) {
                           int var2x = (var0 ^ 4903) & 65535;
                           if (g[var2x] == null) {
                              char[] var3 = f[var2x].toCharArray();

                              short var4x = switch (var3[0] & 0xFF) {
                                 case 0 -> 56;
                                 case 1 -> 23;
                                 case 2 -> 134;
                                 case 3 -> 240;
                                 case 4 -> 165;
                                 case 5 -> 29;
                                 case 6 -> 46;
                                 case 7 -> 214;
                                 case 8 -> 91;
                                 case 9 -> 209;
                                 case 10 -> 27;
                                 case 11 -> 185;
                                 case 12 -> 113;
                                 case 13 -> 66;
                                 case 14 -> 63;
                                 case 15 -> 60;
                                 case 16 -> 159;
                                 case 17 -> 97;
                                 case 18 -> 59;
                                 case 19 -> 18;
                                 case 20 -> 67;
                                 case 21 -> 252;
                                 case 22 -> 10;
                                 case 23 -> 188;
                                 case 24 -> 173;
                                 case 25 -> 246;
                                 case 26 -> 37;
                                 case 27 -> 77;
                                 case 28 -> 211;
                                 case 29 -> 216;
                                 case 30 -> 6;
                                 case 31 -> 70;
                                 case 32 -> 99;
                                 case 33 -> 131;
                                 case 34 -> 50;
                                 case 35 -> 78;
                                 case 36 -> 153;
                                 case 37 -> 231;
                                 case 38 -> 118;
                                 case 39 -> 190;
                                 case 40 -> 15;
                                 case 41 -> 193;
                                 case 42 -> 112;
                                 case 43 -> 137;
                                 case 44 -> 44;
                                 case 45 -> 170;
                                 case 46 -> 144;
                                 case 47 -> 106;
                                 case 48 -> 250;
                                 case 49 -> 35;
                                 case 50 -> 140;
                                 case 51 -> 179;
                                 case 52 -> 117;
                                 case 53 -> 14;
                                 case 54 -> 133;
                                 case 55 -> 164;
                                 case 56 -> 206;
                                 case 57 -> 235;
                                 case 58 -> 30;
                                 case 59 -> 195;
                                 case 60 -> 110;
                                 case 61 -> 100;
                                 case 62 -> 241;
                                 case 63 -> 226;
                                 case 64 -> 201;
                                 case 65 -> 203;
                                 case 66 -> 90;
                                 case 67 -> 212;
                                 case 68 -> 148;
                                 case 69 -> 36;
                                 case 70 -> 11;
                                 case 71 -> 49;
                                 case 72 -> 162;
                                 case 73 -> 196;
                                 case 74 -> 174;
                                 case 75 -> 169;
                                 case 76 -> 20;
                                 case 77 -> 208;
                                 case 78 -> 171;
                                 case 79 -> 139;
                                 case 80 -> 51;
                                 case 81 -> 175;
                                 case 82 -> 247;
                                 case 83 -> 87;
                                 case 84 -> 71;
                                 case 85 -> 218;
                                 case 86 -> 152;
                                 case 87 -> 158;
                                 case 88 -> 187;
                                 case 89 -> 248;
                                 case 90 -> 150;
                                 case 91 -> 103;
                                 case 92 -> 120;
                                 case 93 -> 5;
                                 case 94 -> 167;
                                 case 95 -> 17;
                                 case 96 -> 81;
                                 case 97 -> 85;
                                 case 98 -> 145;
                                 case 99 -> 96;
                                 case 100 -> 205;
                                 case 101 -> 8;
                                 case 102 -> 98;
                                 case 103 -> 86;
                                 case 104 -> 194;
                                 case 105 -> 224;
                                 case 106 -> 69;
                                 case 107 -> 236;
                                 case 108 -> 88;
                                 case 109 -> 41;
                                 case 110 -> 147;
                                 case 111 -> 136;
                                 case 112 -> 172;
                                 case 113 -> 80;
                                 case 114 -> 116;
                                 case 115 -> 180;
                                 case 116 -> 228;
                                 case 117 -> 202;
                                 case 118 -> 39;
                                 case 119 -> 83;
                                 case 120 -> 48;
                                 case 121 -> 213;
                                 case 122 -> 61;
                                 case 123 -> 249;
                                 case 124 -> 64;
                                 case 125 -> 38;
                                 case 126 -> 184;
                                 case 127 -> 72;
                                 case 128 -> 198;
                                 case 129 -> 233;
                                 case 130 -> 239;
                                 case 131 -> 183;
                                 case 132 -> 89;
                                 case 133 -> 242;
                                 case 134 -> 57;
                                 case 135 -> 181;
                                 case 136 -> 102;
                                 case 137 -> 197;
                                 case 138 -> 79;
                                 case 139 -> 94;
                                 case 140 -> 114;
                                 case 141 -> 146;
                                 case 142 -> 132;
                                 case 143 -> 121;
                                 case 144 -> 109;
                                 case 145 -> 225;
                                 case 146 -> 33;
                                 case 147 -> 176;
                                 case 148 -> 12;
                                 case 149 -> 232;
                                 case 150 -> 45;
                                 case 151 -> 220;
                                 case 152 -> 156;
                                 case 153 -> 32;
                                 case 154 -> 1;
                                 case 155 -> 34;
                                 case 156 -> 255;
                                 case 157 -> 223;
                                 case 158 -> 28;
                                 case 159 -> 141;
                                 case 160 -> 115;
                                 case 161 -> 177;
                                 case 162 -> 31;
                                 case 163 -> 135;
                                 case 164 -> 126;
                                 case 165 -> 182;
                                 case 166 -> 123;
                                 case 167 -> 13;
                                 case 168 -> 210;
                                 case 169 -> 95;
                                 case 170 -> 101;
                                 case 171 -> 62;
                                 case 172 -> 105;
                                 case 173 -> 160;
                                 case 174 -> 84;
                                 case 175 -> 19;
                                 case 176 -> 151;
                                 case 177 -> 74;
                                 case 178 -> 128;
                                 case 179 -> 155;
                                 case 180 -> 2;
                                 case 181 -> 3;
                                 case 182 -> 237;
                                 case 183 -> 127;
                                 case 184 -> 227;
                                 case 185 -> 189;
                                 case 186 -> 104;
                                 case 187 -> 108;
                                 case 188 -> 52;
                                 case 189 -> 21;
                                 case 190 -> 234;
                                 case 191 -> 229;
                                 case 192 -> 125;
                                 case 193 -> 4;
                                 case 194 -> 222;
                                 case 195 -> 215;
                                 case 196 -> 76;
                                 case 197 -> 75;
                                 case 198 -> 9;
                                 case 199 -> 221;
                                 case 200 -> 22;
                                 case 201 -> 142;
                                 case 202 -> 254;
                                 case 203 -> 143;
                                 case 204 -> 82;
                                 case 205 -> 163;
                                 case 206 -> 47;
                                 case 207 -> 157;
                                 case 208 -> 243;
                                 case 209 -> 129;
                                 case 210 -> 124;
                                 case 211 -> 154;
                                 case 212 -> 138;
                                 case 213 -> 186;
                                 case 214 -> 26;
                                 case 215 -> 54;
                                 case 216 -> 230;
                                 case 217 -> 130;
                                 case 218 -> 55;
                                 case 219 -> 199;
                                 case 220 -> 68;
                                 case 221 -> 204;
                                 case 222 -> 24;
                                 case 223 -> 92;
                                 case 224 -> 168;
                                 case 225 -> 251;
                                 case 226 -> 93;
                                 case 227 -> 161;
                                 case 228 -> 119;
                                 case 229 -> 149;
                                 case 230 -> 178;
                                 case 231 -> 192;
                                 case 232 -> 0;
                                 case 233 -> 111;
                                 case 234 -> 53;
                                 case 235 -> 244;
                                 case 236 -> 73;
                                 case 237 -> 25;
                                 case 238 -> 166;
                                 case 239 -> 40;
                                 case 240 -> 219;
                                 case 241 -> 217;
                                 case 242 -> 43;
                                 case 243 -> 42;
                                 case 244 -> 122;
                                 case 245 -> 253;
                                 case 246 -> 16;
                                 case 247 -> 191;
                                 case 248 -> 245;
                                 case 249 -> 107;
                                 case 250 -> 200;
                                 case 251 -> 207;
                                 case 252 -> 58;
                                 case 253 -> 65;
                                 case 254 -> 238;
                                 default -> 7;
                              };
                              int var5x = (var1x & 0xFF) - var4x;
                              if (var5x < 0) {
                                 var5x += 256;
                              }

                              int var6 = ((var1x & 65535) >>> 8) - var4x;
                              if (var6 < 0) {
                                 var6 += 256;
                              }

                              for (int var7 = 0; var7 < var3.length; var7++) {
                                 int var8x = var7 % 2;
                                 char var10002x = var3[var7];
                                 if (var8x == 0) {
                                    var3[var7] = (char)(var10002x ^ var5x);
                                    var5x = ((var5x >>> 3 | var5x << 5) ^ var3[var7]) & 0xFF;
                                 } else {
                                    var3[var7] = (char)(var10002x ^ var6);
                                    var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
                                 }
                              }

                              g[var2x] = new String(var3).intern();
                           }

                           return g[var2x];
                        }
                     };
                     lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI = new IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl("Anti-AFK Movement", "Moves to avoid being flagged as AFK.", true) {
                        private static String[] f;
                        private static String[] g;

                        {
                           short var10001 = 23164;
                           short var10002 = -27467;
                           var10002 = 23165;
                           short var10003 = -30455;
                        }

                        @Override
                        public boolean b() {
                           return llIlIIIIlIlIIlllIllIlIIIIIIIlIlIIlllIlIllIIIlllllIlllIlIIIIIIIllIIIlIIIlIIIlIIllllIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                              .b()
                              .ae();
                        }

                        // $VF: Irreducible bytecode was duplicated to produce valid code
                        static { String var15 = null; // PX-FIX hoist
        
                           String[] var5 = new String[2];
                           int var3 = 0;
                           String var2 = "g¡Ã\u0093<Wìa\u000brsãs\u0098ÊÕ¥½\u009cX\u0012&F²\u000eóã\u0093U·@ÛÛÕ[Ú\u00115Q\u0006 \u0098ÝßY\u0019ù(\".\u0093©\u00905";
                           int var4 = "g¡Ã\u0093<Wìa\u000brsãs\u0098ÊÕ¥½\u009cX\u0012&F²\u000eóã\u0093U·@ÛÛÕ[Ú\u00115Q\u0006 \u0098ÝßY\u0019ù(\".\u0093©\u00905"
                              .length();
                           char var1 = '$';
                           int var0 = -1;

                           while (true) {
                              char[] var10002;
                              label38: {
                                 char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                                 int var10004 = var10003.length;
                                 int var6 = 0;
                                 byte var13 = 111;
                                 var10002 = var10003;
                                 int var8 = var10004;
                                 byte var16;
                                 char[] var10005;
                                 int var10006;
                                 if (var10004 <= 1) {
                                    var10005 = var10003;
                                    var16 = 111;
                                    var10006 = var6;
                                 } else {
                                    var13 = 111;
                                    var8 = var10004;
                                    if (var10004 <= var6) {
                                       break label38;
                                    }

                                    var10005 = var10003;
                                    var16 = 111;
                                    var10006 = var6;
                                 }

                                 while (true) {
                                    var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                                       case 0 -> 35;
                                       case 1 -> 71;
                                       case 2 -> 91;
                                       case 3 -> 42;
                                       case 4 -> 102;
                                       case 5 -> 11;
                                       default -> 76;
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

                               var15 = new String(var10002).intern();
                              byte var10 = -1;
                              var5[var3++] = var15;
                              if ((var0 += var1) >= var4) {
                                 f = var5;
                                 g = new String[2];
                                 break;
                              }

                              var1 = var2.charAt(var0);
                           }
                        }

                        private static String c(int var0, int var1) {
                           int var2 = (var0 ^ 23165) & 65535;
                           if (g[var2] == null) {
                              char[] var3 = f[var2].toCharArray();

                              short var4 = switch (var3[0] & 0xFF) {
                                 case 0 -> 148;
                                 case 1 -> 249;
                                 case 2 -> 194;
                                 case 3 -> 155;
                                 case 4 -> 126;
                                 case 5 -> 180;
                                 case 6 -> 239;
                                 case 7 -> 247;
                                 case 8 -> 191;
                                 case 9 -> 26;
                                 case 10 -> 166;
                                 case 11 -> 76;
                                 case 12 -> 120;
                                 case 13 -> 156;
                                 case 14 -> 57;
                                 case 15 -> 63;
                                 case 16 -> 206;
                                 case 17 -> 161;
                                 case 18 -> 145;
                                 case 19 -> 144;
                                 case 20 -> 146;
                                 case 21 -> 158;
                                 case 22 -> 170;
                                 case 23 -> 243;
                                 case 24 -> 51;
                                 case 25 -> 114;
                                 case 26 -> 119;
                                 case 27 -> 41;
                                 case 28 -> 197;
                                 case 29 -> 61;
                                 case 30 -> 133;
                                 case 31 -> 3;
                                 case 32 -> 248;
                                 case 33 -> 92;
                                 case 34 -> 255;
                                 case 35 -> 109;
                                 case 36 -> 112;
                                 case 37 -> 218;
                                 case 38 -> 75;
                                 case 39 -> 50;
                                 case 40 -> 195;
                                 case 41 -> 188;
                                 case 42 -> 132;
                                 case 43 -> 163;
                                 case 44 -> 214;
                                 case 45 -> 183;
                                 case 46 -> 215;
                                 case 47 -> 45;
                                 case 48 -> 37;
                                 case 49 -> 136;
                                 case 50 -> 1;
                                 case 51 -> 29;
                                 case 52 -> 111;
                                 case 53 -> 25;
                                 case 54 -> 237;
                                 case 55 -> 123;
                                 case 56 -> 30;
                                 case 57 -> 83;
                                 case 58 -> 253;
                                 case 59 -> 86;
                                 case 60 -> 211;
                                 case 61 -> 27;
                                 case 62 -> 106;
                                 case 63 -> 20;
                                 case 64 -> 213;
                                 case 65 -> 142;
                                 case 66 -> 65;
                                 case 67 -> 134;
                                 case 68 -> 128;
                                 case 69 -> 66;
                                 case 70 -> 217;
                                 case 71 -> 219;
                                 case 72 -> 175;
                                 case 73 -> 13;
                                 case 74 -> 36;
                                 case 75 -> 235;
                                 case 76 -> 176;
                                 case 77 -> 49;
                                 case 78 -> 224;
                                 case 79 -> 241;
                                 case 80 -> 178;
                                 case 81 -> 18;
                                 case 82 -> 162;
                                 case 83 -> 72;
                                 case 84 -> 10;
                                 case 85 -> 58;
                                 case 86 -> 173;
                                 case 87 -> 116;
                                 case 88 -> 77;
                                 case 89 -> 150;
                                 case 90 -> 115;
                                 case 91 -> 233;
                                 case 92 -> 236;
                                 case 93 -> 141;
                                 case 94 -> 169;
                                 case 95 -> 56;
                                 case 96 -> 93;
                                 case 97 -> 28;
                                 case 98 -> 118;
                                 case 99 -> 222;
                                 case 100 -> 153;
                                 case 101 -> 189;
                                 case 102 -> 207;
                                 case 103 -> 19;
                                 case 104 -> 22;
                                 case 105 -> 220;
                                 case 106 -> 12;
                                 case 107 -> 16;
                                 case 108 -> 245;
                                 case 109 -> 64;
                                 case 110 -> 74;
                                 case 111 -> 81;
                                 case 112 -> 179;
                                 case 113 -> 91;
                                 case 114 -> 198;
                                 case 115 -> 129;
                                 case 116 -> 101;
                                 case 117 -> 107;
                                 case 118 -> 131;
                                 case 119 -> 185;
                                 case 120 -> 17;
                                 case 121 -> 125;
                                 case 122 -> 67;
                                 case 123 -> 98;
                                 case 124 -> 110;
                                 case 125 -> 89;
                                 case 126 -> 87;
                                 case 127 -> 196;
                                 case 128 -> 252;
                                 case 129 -> 31;
                                 case 130 -> 149;
                                 case 131 -> 168;
                                 case 132 -> 177;
                                 case 133 -> 127;
                                 case 134 -> 9;
                                 case 135 -> 205;
                                 case 136 -> 68;
                                 case 137 -> 210;
                                 case 138 -> 55;
                                 case 139 -> 21;
                                 case 140 -> 39;
                                 case 141 -> 221;
                                 case 142 -> 124;
                                 case 143 -> 154;
                                 case 144 -> 80;
                                 case 145 -> 250;
                                 case 146 -> 244;
                                 case 147 -> 122;
                                 case 148 -> 94;
                                 case 149 -> 82;
                                 case 150 -> 160;
                                 case 151 -> 24;
                                 case 152 -> 254;
                                 case 153 -> 99;
                                 case 154 -> 240;
                                 case 155 -> 202;
                                 case 156 -> 113;
                                 case 157 -> 85;
                                 case 158 -> 152;
                                 case 159 -> 100;
                                 case 160 -> 117;
                                 case 161 -> 38;
                                 case 162 -> 0;
                                 case 163 -> 186;
                                 case 164 -> 193;
                                 case 165 -> 192;
                                 case 166 -> 172;
                                 case 167 -> 73;
                                 case 168 -> 33;
                                 case 169 -> 90;
                                 case 170 -> 182;
                                 case 171 -> 225;
                                 case 172 -> 105;
                                 case 173 -> 95;
                                 case 174 -> 44;
                                 case 175 -> 164;
                                 case 176 -> 32;
                                 case 177 -> 242;
                                 case 178 -> 97;
                                 case 179 -> 2;
                                 case 180 -> 130;
                                 case 181 -> 203;
                                 case 182 -> 199;
                                 case 183 -> 40;
                                 case 184 -> 223;
                                 case 185 -> 104;
                                 case 186 -> 251;
                                 case 187 -> 14;
                                 case 188 -> 231;
                                 case 189 -> 139;
                                 case 190 -> 234;
                                 case 191 -> 227;
                                 case 192 -> 135;
                                 case 193 -> 43;
                                 case 194 -> 246;
                                 case 195 -> 159;
                                 case 196 -> 137;
                                 case 197 -> 53;
                                 case 198 -> 54;
                                 case 199 -> 103;
                                 case 200 -> 6;
                                 case 201 -> 88;
                                 case 202 -> 15;
                                 case 203 -> 228;
                                 case 204 -> 204;
                                 case 205 -> 200;
                                 case 206 -> 121;
                                 case 207 -> 138;
                                 case 208 -> 184;
                                 case 209 -> 171;
                                 case 210 -> 62;
                                 case 211 -> 201;
                                 case 212 -> 140;
                                 case 213 -> 212;
                                 case 214 -> 78;
                                 case 215 -> 69;
                                 case 216 -> 59;
                                 case 217 -> 34;
                                 case 218 -> 35;
                                 case 219 -> 52;
                                 case 220 -> 181;
                                 case 221 -> 157;
                                 case 222 -> 71;
                                 case 223 -> 23;
                                 case 224 -> 102;
                                 case 225 -> 165;
                                 case 226 -> 46;
                                 case 227 -> 70;
                                 case 228 -> 48;
                                 case 229 -> 5;
                                 case 230 -> 60;
                                 case 231 -> 238;
                                 case 232 -> 209;
                                 case 233 -> 167;
                                 case 234 -> 147;
                                 case 235 -> 7;
                                 case 236 -> 8;
                                 case 237 -> 11;
                                 case 238 -> 216;
                                 case 239 -> 187;
                                 case 240 -> 143;
                                 case 241 -> 79;
                                 case 242 -> 230;
                                 case 243 -> 208;
                                 case 244 -> 84;
                                 case 245 -> 226;
                                 case 246 -> 151;
                                 case 247 -> 229;
                                 case 248 -> 108;
                                 case 249 -> 96;
                                 case 250 -> 232;
                                 case 251 -> 47;
                                 case 252 -> 4;
                                 case 253 -> 190;
                                 case 254 -> 174;
                                 default -> 42;
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
                     };
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

                  var2 = "ìj°¤®Ï\u0080º\u0004\u0083±úJ";
                  var4 = "ìj°¤®Ï\u0080º\u0004\u0083±úJ".length();
                  var1 = '\b';
                  var8 = -1;
            }

            var10000 = 36;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -31510) & 65535;
      if (i[var2] == null) {
         char[] var3 = h[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 56;
            case 1 -> 183;
            case 2 -> 176;
            case 3 -> 55;
            case 4 -> 179;
            case 5 -> 12;
            case 6 -> 41;
            case 7 -> 252;
            case 8 -> 214;
            case 9 -> 245;
            case 10 -> 110;
            case 11 -> 161;
            case 12 -> 149;
            case 13 -> 105;
            case 14 -> 173;
            case 15 -> 127;
            case 16 -> 18;
            case 17 -> 206;
            case 18 -> 242;
            case 19 -> 188;
            case 20 -> 7;
            case 21 -> 200;
            case 22 -> 93;
            case 23 -> 50;
            case 24 -> 145;
            case 25 -> 159;
            case 26 -> 190;
            case 27 -> 61;
            case 28 -> 239;
            case 29 -> 25;
            case 30 -> 101;
            case 31 -> 218;
            case 32 -> 60;
            case 33 -> 178;
            case 34 -> 9;
            case 35 -> 213;
            case 36 -> 133;
            case 37 -> 125;
            case 38 -> 166;
            case 39 -> 97;
            case 40 -> 6;
            case 41 -> 96;
            case 42 -> 180;
            case 43 -> 135;
            case 44 -> 156;
            case 45 -> 57;
            case 46 -> 251;
            case 47 -> 82;
            case 48 -> 111;
            case 49 -> 65;
            case 50 -> 73;
            case 51 -> 177;
            case 52 -> 205;
            case 53 -> 234;
            case 54 -> 42;
            case 55 -> 99;
            case 56 -> 224;
            case 57 -> 91;
            case 58 -> 216;
            case 59 -> 38;
            case 60 -> 2;
            case 61 -> 134;
            case 62 -> 142;
            case 63 -> 147;
            case 64 -> 70;
            case 65 -> 223;
            case 66 -> 238;
            case 67 -> 116;
            case 68 -> 222;
            case 69 -> 123;
            case 70 -> 187;
            case 71 -> 75;
            case 72 -> 249;
            case 73 -> 19;
            case 74 -> 197;
            case 75 -> 192;
            case 76 -> 10;
            case 77 -> 141;
            case 78 -> 130;
            case 79 -> 168;
            case 80 -> 201;
            case 81 -> 72;
            case 82 -> 35;
            case 83 -> 207;
            case 84 -> 62;
            case 85 -> 172;
            case 86 -> 53;
            case 87 -> 195;
            case 88 -> 121;
            case 89 -> 185;
            case 90 -> 23;
            case 91 -> 46;
            case 92 -> 95;
            case 93 -> 66;
            case 94 -> 87;
            case 95 -> 71;
            case 96 -> 165;
            case 97 -> 217;
            case 98 -> 248;
            case 99 -> 144;
            case 100 -> 16;
            case 101 -> 131;
            case 102 -> 208;
            case 103 -> 26;
            case 104 -> 209;
            case 105 -> 153;
            case 106 -> 89;
            case 107 -> 136;
            case 108 -> 231;
            case 109 -> 76;
            case 110 -> 109;
            case 111 -> 219;
            case 112 -> 229;
            case 113 -> 154;
            case 114 -> 98;
            case 115 -> 236;
            case 116 -> 160;
            case 117 -> 184;
            case 118 -> 33;
            case 119 -> 220;
            case 120 -> 253;
            case 121 -> 85;
            case 122 -> 78;
            case 123 -> 194;
            case 124 -> 191;
            case 125 -> 17;
            case 126 -> 174;
            case 127 -> 32;
            case 128 -> 51;
            case 129 -> 27;
            case 130 -> 106;
            case 131 -> 137;
            case 132 -> 221;
            case 133 -> 129;
            case 134 -> 3;
            case 135 -> 254;
            case 136 -> 204;
            case 137 -> 79;
            case 138 -> 232;
            case 139 -> 63;
            case 140 -> 243;
            case 141 -> 52;
            case 142 -> 30;
            case 143 -> 102;
            case 144 -> 150;
            case 145 -> 58;
            case 146 -> 13;
            case 147 -> 48;
            case 148 -> 8;
            case 149 -> 115;
            case 150 -> 235;
            case 151 -> 140;
            case 152 -> 5;
            case 153 -> 108;
            case 154 -> 151;
            case 155 -> 83;
            case 156 -> 189;
            case 157 -> 163;
            case 158 -> 67;
            case 159 -> 84;
            case 160 -> 40;
            case 161 -> 74;
            case 162 -> 244;
            case 163 -> 158;
            case 164 -> 15;
            case 165 -> 146;
            case 166 -> 162;
            case 167 -> 122;
            case 168 -> 29;
            case 169 -> 54;
            case 170 -> 22;
            case 171 -> 80;
            case 172 -> 90;
            case 173 -> 246;
            case 174 -> 47;
            case 175 -> 59;
            case 176 -> 210;
            case 177 -> 88;
            case 178 -> 21;
            case 179 -> 0;
            case 180 -> 138;
            case 181 -> 64;
            case 182 -> 43;
            case 183 -> 227;
            case 184 -> 132;
            case 185 -> 193;
            case 186 -> 170;
            case 187 -> 139;
            case 188 -> 86;
            case 189 -> 107;
            case 190 -> 39;
            case 191 -> 20;
            case 192 -> 255;
            case 193 -> 143;
            case 194 -> 103;
            case 195 -> 1;
            case 196 -> 228;
            case 197 -> 167;
            case 198 -> 118;
            case 199 -> 37;
            case 200 -> 112;
            case 201 -> 128;
            case 202 -> 230;
            case 203 -> 77;
            case 204 -> 28;
            case 205 -> 152;
            case 206 -> 215;
            case 207 -> 113;
            case 208 -> 68;
            case 209 -> 169;
            case 210 -> 148;
            case 211 -> 198;
            case 212 -> 126;
            case 213 -> 225;
            case 214 -> 104;
            case 215 -> 11;
            case 216 -> 171;
            case 217 -> 4;
            case 218 -> 240;
            case 219 -> 31;
            case 220 -> 241;
            case 221 -> 124;
            case 222 -> 45;
            case 223 -> 36;
            case 224 -> 100;
            case 225 -> 186;
            case 226 -> 120;
            case 227 -> 247;
            case 228 -> 155;
            case 229 -> 24;
            case 230 -> 117;
            case 231 -> 250;
            case 232 -> 157;
            case 233 -> 237;
            case 234 -> 81;
            case 235 -> 49;
            case 236 -> 182;
            case 237 -> 226;
            case 238 -> 119;
            case 239 -> 212;
            case 240 -> 69;
            case 241 -> 92;
            case 242 -> 203;
            case 243 -> 199;
            case 244 -> 202;
            case 245 -> 44;
            case 246 -> 181;
            case 247 -> 175;
            case 248 -> 94;
            case 249 -> 114;
            case 250 -> 196;
            case 251 -> 233;
            case 252 -> 211;
            case 253 -> 164;
            case 254 -> 14;
            default -> 34;
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

   public static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(Object... px) {
        }

      private IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll() {
      }

      @NotNull
      public final IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl a() {
         return llIlIIIIlIlIIlllIllIlIIIIIIIlIlIIlllIlIllIIIlllllIlllIlIIIIIIIllIIIlIIIlIIIlIIllllIll.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl;
      }

      @NotNull
      public final IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl b() {
         return llIlIIIIlIlIIlllIllIlIIIIIIIlIlIIlllIlIllIIIlllllIlllIlIIIIIIIllIIIlIIIlIIIlIIllllIll.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll;
      }

      @NotNull
      public final IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl c() {
         return llIlIIIIlIlIIlllIllIlIIIIIIIlIlIIlllIlIllIIIlllllIlllIlIIIIIIIllIIIlIIIlIIIlIIllllIll.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI;
      }

      @NotNull
      public final IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl d() {
         return llIlIIIIlIlIIlllIllIlIIIIIIIlIlIIlllIlIllIIIlllllIlllIlIIIIIIIllIIIlIIIlIIIlIIllllIll.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI;
      }
      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(kotlin.jvm.internal.DefaultConstructorMarker p0) { this(); }
   }
}
