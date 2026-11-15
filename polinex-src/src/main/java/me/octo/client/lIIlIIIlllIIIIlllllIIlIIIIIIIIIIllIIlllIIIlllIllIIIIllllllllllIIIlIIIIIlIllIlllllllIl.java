package me.octo.client;

import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.BlockPos.MutableBlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.status.ChunkStatus;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIlIIIlllIIIIlllllIIlIIIIIIIIIIllIIlllIIIlllIllIIIIllllllllllIIIlIIIIIlIllIlllllllIl
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static lIIlIIIlllIIIIlllllIIlIIIIIIIIIIllIIlllIIIlllIllIIIIllllllllllIIIlIIIIIlIllIlllllllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private final byte lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 0; // PX-FIX: 字节码从不写该字段（默认 0）
   private final byte lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private final byte IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private final byte llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @NotNull
   private final Long2ByteOpenHashMap IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @NotNull
   private MutableBlockPos IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @Nullable
   private ChunkAccess IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private int IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private int llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private int IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   @NotNull
   private List<Long> lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   @NotNull
   private List<? extends BlockPos> llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   @NotNull
   private List<? extends BlockPos> lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   @NotNull
   private List<? extends BlockPos> IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   @NotNull
   private List<? extends BlockPos> IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   private boolean IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   @NotNull
   private ArrayList<BlockPos> llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   @NotNull
   private me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   @Nullable
   private BlockPos IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   @JvmField
   @NotNull
   public static lIIlIIIlllIIIIlllllIIlIIIIIIIIIIllIIlllIIIlllIllIIIIllllllllllIIIlIIIIIlIllIlllllllIl IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   private static String[] f;
   private static String[] g;

   private lIIlIIIlllIIIIlllllIIlIIIIIIIIIIllIIlllIIIlllIllIIIIllllllllllIIIlIIIIIlIllIlllllllIl() {
      short var10001 = -10389;
      short var10002 = 30549;
      var10002 = -10393;
      short var10003 = 24869;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var7 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      short var10004 = -10400;
      short var10005 = -7639;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         IlIlIlllIlIIlIllIIIIlIIIlIIIlIlllIlllIIlllIlllllllIllIllIIlIlIllIIllIIlllIlIIIlllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         IlIlIlllIlIIlIllIIIIlIIIlIIIlIlllIlllIIlllIlllllllIllIllIIlIlIllIIllIIlllIlIIIlllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c(),
         IlIlIlllIlIIlIllIIIIlIIIlIIIlIlllIlllIIlllIlllllllIllIllIIlIlIllIIllIIlllIlIIIlllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         IlIlIlllIlIIlIllIIIIlIIIlIIIlIlllIlllIIlllIlllllllIllIllIIlIlIllIIllIIlllIlIIIlllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .d()
      };
      super("Route Assist", "Helps with mining out your gemstone route", var7, "Crystal Hollows", var1);
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 1;
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 2;
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 3;
      Long2ByteOpenHashMap var5 = new Long2ByteOpenHashMap();
      boolean var3 = false;
      var5.defaultReturnValue((byte)-1);
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = var5;
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new MutableBlockPos();
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = Integer.MAX_VALUE;
      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = Integer.MAX_VALUE;
      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = CollectionsKt.emptyList();
      this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = CollectionsKt.emptyList();
      this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = CollectionsKt.emptyList();
      this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = CollectionsKt.emptyList();
      this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = CollectionsKt.emptyList();
      this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = new ArrayList<>();
      this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
   }

   private final ClientLevel ag() {
      ClientLevel var10000 = this.ap().level;
      Intrinsics.checkNotNull(var10000);
      return var10000;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @SubscribeEvent(
      priority = EventPriority.HIGH
   )
   public final void a(@NotNull llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII var1) {
      Object var132 = null; // PX-FIX
      Object var128 = null; // PX-FIX
      Object var126 = null; // PX-FIX
      long var122 = 0; // PX-FIX
      long var120 = 0; // PX-FIX
      int[] var2;
      boolean var130;
      label432: {
         label431: {
            int[] var10000 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
            short var10002 = -10391;
            short var10003 = -8071;
            Intrinsics.checkNotNullParameter(var1, "event");
            var2 = var10000;
            IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var10001 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g();
            IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var133 = IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
            if (var2 != null) {
               if (var10001
                  == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                  )
                {
                  break label431;
               }

               var10001 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .g();
               var133 = IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
            }

            if (var10001 != var133) {
               var130 = false;
               break label432;
            }
         }

         var130 = true;
      }

      this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = var130;
      if (this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll) {
         ArrayList var3 = IlIlIllllIIlllIIIIlIlIIllllllIlIIIlIlIIIlIIlIIllIlIlIlllIIlIlIlIllIIIlIlIIllIlIIlIIII.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
            .o();
         int var116 = ((var3.isEmpty()) ? 1 : 0);
         if (var2 != null) {
            if (var116 != 0) {
               return;
            }

            var116 = this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
         }

         int var4 = var116;
         this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = var4 + 1;
         lIIlIIIlllIIIIlllllIIlIIIIIIIIIIllIIlllIIIlllIllIIIIllllllllllIIIlIIIIIlIllIlllllllIl var117 = this;
         if (var2 != null) {
            if (this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll % 20 == 0) {
               LongOpenHashSet var28 = new LongOpenHashSet();
               int var5 = 0;
               int var6 = CollectionsKt.getLastIndex(var3);
               if (var5 <= var6) {
                  label415:
                  do {
                     BlockPos var7;
                     label365: {
                        var7 = ((IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var3.get(var5)).a();
                        if (var5 + 1 == var3.size()) {
                           var116 = 0;
                           if (var2 != null) {
                              break label365;
                           }
                        } else {
                           var116 =((Integer)( var5));
                        }

                        var116 += 1;
                     }

                     int var8 = var116;
                     BlockPos var9 = ((IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var3.get(var8)).a();
                     me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI var119 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                     Vec3 var131 = var7.getCenter();
                     short var135 = -10392;
                     short var10004 = -9201;
                     Intrinsics.checkNotNullExpressionValue(var131, "getCenter(...)");
                     Vec3 var134 = var9.getCenter();
                     var10004 = -10392;
                     short var10005 = -9201;
                     Intrinsics.checkNotNullExpressionValue(var134, "getCenter(...)");
                     Iterable var11 = var119.b(var131, var134);
                     boolean var12 = false;
                     var var14 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var11, 10));
                     boolean var15 = false;

                     for (Object var17 : var11) {
                        BlockPos var18 = (BlockPos)var17;
                        boolean var19 = false;
                        var14.add(
                           me.octo.client.utils.IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .a(var18)
                        );
                        if (var2 == null) {
                           break label415;
                        }

                        if (var2 == null) {
                           break;
                        }
                     }

                     List var10 = var14;
                     long var74 = me.octo.client.utils.IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a(var7);
                     long var13 = me.octo.client.utils.IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a(var9);
                     Iterable var111 = var10;
                     boolean var112 = false;
                     Iterator var113 = var111.iterator();

                     while (true) {
                        if (var113.hasNext()) {
                           long var115;
                           Object var114 = var113.next();
                           var115 = ((Number)var114).longValue();
                           boolean var21 = false;
                           var120 = var115;
                           label406:
                           if (var2 != null) {
                              long var137;
                              var116 = (var137 = var115 - var74) == 0L ? 0 : (var137 < 0L ? -1 : 1);
                              if (var2 == null) {
                                 break;
                              }

                              if (var116 != 0) {
                                 var120 = var115;
                                 if (var2 == null) {
                                    break label406;
                                 }

                                 if (var115 != var13) {
                                    var28.add(var115);
                                 }
                              }

                              var120 = me.octo.client.utils.IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .a(var115, 0, 1, 0);
                           }

                           long var22 = var120;
                           var122 = var22;
                           label397:
                           if (var2 != null) {
                              if (var22 != var74) {
                                 var122 = var22;
                                 if (var2 == null) {
                                    break label397;
                                 }

                                 if (var22 != var13) {
                                    var28.add(var22);
                                 }
                              }

                              var122 = me.octo.client.utils.IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .a(var115, 0, 2, 0);
                           }

                           long var24 = var122;
                           if (var2 != null && var24 != var74 && var2 != null && var24 != var13) {
                              var28.add(var24);
                           }

                           if (var2 != null) {
                              continue;
                           }
                        }

                        if (var2 == null) {
                           continue label415;
                        }

                        var116 = var5;
                        break;
                     }

                     if (var116 == var6) {
                        break;
                     }

                     var5++;
                  } while (var2 != null);
               }

               this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = CollectionsKt.toList((Iterable)var28);
            }

            this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = null;
            this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = Integer.MAX_VALUE;
            this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = Integer.MAX_VALUE;
            this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.clear();
            var117 = this;
         }

         Iterable var30 = var117.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
         boolean var36 = false;
         Iterable var47 = var30;
         var var49 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var30, 10));
         boolean var54 = false;
         Iterator var65 = var30.iterator();

         while (true) {
            if (var65.hasNext()) {
               Object var75 = var65.next();
               long var87 = ((Number)var75).longValue();
               boolean var110 = false;
               var49.add(TuplesKt.to(var87, this.a(var87)));
               if (var2 == null) {
                  break;
               }

               if (var2 != null) {
                  continue;
               }
            }

            var30 = var49;
            var36 = false;
            var47 = var30;
            var49 = new ArrayList();
            var54 = false;
            break;
         }

         for (Object var76 : var47) {
            Pair var88 = (Pair)var76;
            boolean var99 = false;
            var116 = ((Number)var88.getSecond()).byteValue();
            if (var2 != null) {
               var116 = var116 != this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl ? 1 : 0;
            }

            if (var116 != 0) {
               var49.add(var76);
               if (var2 == null) {
                  break;
               }
            }
         }

         List var29 = var49;
         var30 = var29;
         var36 = false;
         var49 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var30, 10));
         var54 = false;
         var65 = var30.iterator();

         while (true) {
            if (var65.hasNext()) {
               Object var77 = var65.next();
               Pair var89 = (Pair)var77;
               boolean var100 = false;
               var49.add(((Number)var89.getFirst()).longValue());
               if (var2 == null) {
                  break;
               }

               if (var2 != null) {
                  continue;
               }
            }

            this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = var49;
            break;
         }

         lIIlIIIlllIIIIlllllIIlIIIIIIIIIIllIIlllIIIlllIllIIIIllllllllllIIIlIIIIIlIllIlllllllIl var26;
         label324: {
            label445: {
               label322: {
                  label446: {
                     label447: {
                        if (var2 != null) {
                           if (!IlIlIlllIlIIlIllIIIIlIIIlIIIlIlllIlllIIlllIlllllllIllIllIIlIlIllIIllIIlllIlIIIlllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .c()
                              .al()) {
                              this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = CollectionsKt.emptyList();
                              break label447;
                           }

                           var30 = var29;
                        }

                        var26 = this;
                        var36 = false;
                        var47 = var30;
                        var49 = new ArrayList();
                        var54 = false;

                        for (Object var78 : var30) {
                           Pair var90 = (Pair)var78;
                           boolean var101 = false;
                           var116 = ((Number)var90.getSecond()).byteValue();
                           if (var2 != null) {
                              if (var2 == null) {
                                 if (var116 == this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) {
                                    var49.add(var78);
                                    if (var2 == null) {
                                       break label322;
                                    }
                                 }
                                 break label446;
                              }

                              var116 = var116 == this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl ? 1 : 0;
                           }

                           if (var116 != 0) {
                              var49.add(var78);
                              if (var2 == null) {
                                 break;
                              }
                           }
                        }

                        var30 = var49;
                        var36 = false;
                        var49 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var30, 10));
                        var54 = false;

                        for (Object var79 : var30) {
                           Pair var91 = (Pair)var79;
                           boolean var102 = false;
                           var49.add(
                              me.octo.client.utils.IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .e(((Number)var91.getFirst()).longValue())
                           );
                           if (var2 == null) {
                              break label447;
                           }

                           if (var2 == null) {
                              break;
                           }
                        }

                        this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = var49;
                     }

                     label450: {
                        if (var2 != null) {
                           if (!IlIlIlllIlIIlIllIIIIlIIIlIIIlIlllIlllIIlllIlllllllIllIllIIlIlIllIIllIIlllIlIIIlllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .a()
                              .al()) {
                              this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = CollectionsKt.emptyList();
                              break label450;
                           }

                           var30 = var29;
                        }

                        var26 = this;
                        var36 = false;
                        var47 = var30;
                        var49 = new ArrayList();
                        var54 = false;

                        for (Object var80 : var30) {
                           Pair var92 = (Pair)var80;
                           boolean var103 = false;
                           var116 = ((Number)var92.getSecond()).byteValue();
                           if (var2 != null) {
                              if (var2 == null) {
                                 if (var116 == this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll) {
                                    var49.add(var80);
                                    if (var2 == null) {
                                       break label322;
                                    }
                                 }
                                 break label446;
                              }

                              var116 = var116 == this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll ? 1 : 0;
                           }

                           if (var116 != 0) {
                              var49.add(var80);
                              if (var2 == null) {
                                 break;
                              }
                           }
                        }

                        var30 = var49;
                        var36 = false;
                        var49 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var30, 10));
                        var54 = false;
                        var65 = var30.iterator();

                        while (true) {
                           if (!var65.hasNext()) {
                              this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = var49;
                              break;
                           }

                           Object var81 = var65.next();
                           Pair var93 = (Pair)var81;
                           boolean var104 = false;
                           var49.add(
                              me.octo.client.utils.IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .e(((Number)var93.getFirst()).longValue())
                           );
                           if (var2 == null) {
                              break;
                           }

                           if (var2 == null) {
                              this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = var49;
                              break;
                           }
                        }
                     }

                     var126 = this;
                     if (var2 != null) {
                        if (!IlIlIlllIlIIlIllIIIIlIIIlIIIlIlllIlllIIlllIlllllllIllIllIIlIlIllIIllIIlllIlIIIlllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .b()
                           .al()) {
                           var132 = CollectionsKt.emptyList();
                           break label445;
                        }

                        var30 = var29;
                     }

                     var26 = this;
                     var36 = false;
                     var47 = var30;
                     var49 = new ArrayList();
                     var54 = false;
                  }

                  for (Object var82 : var30) {
                     Pair var94 = (Pair)var82;
                     boolean var105 = false;
                     var116 = ((Number)var94.getSecond()).byteValue();
                     if (var2 == null) {
                        for (Object var83 : var47) {
                           var94 = (Pair)var83;
                           var105 = false;
                           var49.add(
                              me.octo.client.utils.IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .e(((Number)var94.getFirst()).longValue())
                           );
                           if (var2 == null) {
                              break label324;
                           }

                           if (var2 == null) {
                              break;
                           }
                        }

                        var132 = var49;
                        var126 = var26;
                        break label445;
                     }

                     if (var2 != null) {
                        var116 = var116 == this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI ? 1 : 0;
                     }

                     if (var116 != 0) {
                        var49.add(var82);
                        if (var2 == null) {
                           break;
                        }
                     }
                  }
               }

               var30 = var49;
               var26 = var26;
               var36 = false;
               var47 = var30;
               var49 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var30, 10));
               var54 = false;

               for (Object var84 : var30) {
                  Pair var96 = (Pair)var84;
                  boolean var107 = false;
                  var49.add(
                     me.octo.client.utils.IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .e(((Number)var96.getFirst()).longValue())
                  );
                  if (var2 == null) {
                     break label324;
                  }

                  if (var2 == null) {
                     break;
                  }
               }

               var132 = var49;
               var126 = var26;
            }

            ((me.octo.client.PXDyn)var126).IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = var132;
            var30 = var3;
            var26 = this;
            var36 = false;
            var47 = var30;
            var49 = new ArrayList();
            var54 = false;
         }

         var65 = var47.iterator();

         label195: {
            while (true) {
               if (var65.hasNext()) {
                  Object var85 = var65.next();
                  IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var97 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var85;
                  boolean var108 = false;
                  var128 = var97.b();
                  if (var2 == null) {
                     break;
                  }

                  boolean var129;
                  if (var128
                     == IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                     )
                   {
                     var129 = this.ag().getBlockState(var97.a()).is(Blocks.COBBLESTONE);
                     if (var2 != null) {
                        ;
                     }
                  } else {
                     var129 = false;
                  }

                  if (!var129) {
                     continue;
                  }

                  var49.add(var85);
                  if (var2 != null) {
                     continue;
                  }
               }

               var30 = var49;
               var26 = var26;
               var36 = false;
               var49 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var30, 10));
               var54 = false;
               var65 = var30.iterator();
               if (!var65.hasNext()) {
                  break label195;
               }

               var128 = var65.next();
               break;
            }

            while (true) {
               Object var86 = var128;
               IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var98 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var86;
               boolean var109 = false;
               var49.add(var98.a());
               if (var2 == null) {
                  return;
               }

               if (var2 == null || !var65.hasNext()) {
                  break;
               }

               var128 = var65.next();
            }
         }

         var26.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = var49;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @SubscribeEvent(
      priority = EventPriority.NORMAL
   )
   public final void b(@NotNull llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII var1) {
      int[] var10000 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      short var10002 = -10385;
      short var10003 = -14961;
      Intrinsics.checkNotNullParameter(var1, "event");
      int[] var2 = var10000;
      lIIlIIIlllIIIIlllllIIlIIIIIIIIIIllIIlllIIIlllIllIIIIllllllllllIIIlIIIIIlIllIlllllllIl var34 = this;
      if (var2 != null) {
         if (!this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll) {
            return;
         }

         var34 = this;
      }

      ClientLevel var35 = var34.ap().level;
      if (var35 != null) {
         ClientLevel var3 = var35;
         if (var2 != null) {
            LocalPlayer var36 = this.ap().player;
            if (var36 != null) {
               LocalPlayer var4 = var36;
               Vec3 var5 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.u();
               double var6 = var4.blockInteractionRange();
               if (var2 != null) {
                  ItemStack var37 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .L();
                  if (var37 != null) {
                     ItemStack var8 = var37;
                     me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var38 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                     String var10001 = var8.getHoverName().getString();
                     var10003 = -10390;
                     short var10004 = 22551;
                     Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
                     String var9 = var38.a(var10001);
                     boolean var10 = IlIlIlllIlIIlIllIIIIlIIIlIIIlIlllIlllIIlllIlllllllIllIllIIlIlIllIIllIIlllIlIIIlllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .d()
                        .al();
                     boolean var39 = var10;
                     if (var2 != null) {
                        if (!var10) {
                           this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = null;
                        }

                        var39 = var10;
                     }

                     if (var2 != null) {
                        if (!var39) {
                           return;
                        }

                        var39 = var1.b();
                     }

                     if (var2 != null) {
                        if (!var39) {
                           return;
                        }

                        CharSequence var40 = var9;
                        short var57 = -10397;
                        var10002 = -22281;
                        var39 = StringsKt.contains(var40, "Pickaxe", false);
                     }

                     label208: {
                        if (var2 != null) {
                           if (var39) {
                              break label208;
                           }

                           CharSequence var41 = var9;
                           short var58 = -10399;
                           var10002 = 2825;
                           var39 = StringsKt.contains(var41, "Drill", false);
                        }

                        if (var2 != null) {
                           if (var39) {
                              break label208;
                           }

                           CharSequence var42 = var9;
                           short var59 = -10398;
                           var10002 = 1948;
                           var39 = StringsKt.contains(var42, "Gauntlet", false);
                        }

                        if (!var39) {
                           return;
                        }
                     }

                     label169:
                     if (this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll != null) {
                        label166: {
                           BlockPos var13 = this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
                           boolean var14 = false;
                           me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var43 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                           Vec3 var64 = var13.getCenter();
                           var10004 = -10386;
                           short var10005 = 28859;
                           Intrinsics.checkNotNullExpressionValue(var64, "getCenter(...)");
                           double var15 = var43.a(var5, var64);
                           double var77;
                           int var44 = (var77 = var15 - var6) == 0.0 ? 0 : (var77 < 0.0 ? -1 : 1);
                           if (var2 != null) {
                              if (var44 >= 0) {
                                 break label166;
                              }

                              var44 = ((var3.getBlockState(var13).isAir()) ? 1 : 0);
                           }

                           if (var44 == 0) {
                              break label169;
                           }
                        }

                        this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = null;
                     }

                     short var60 = -10388;
                     var10002 = -5194;
                     me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a("attack", this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll != null);
                     lIIlIIIlllIIIIlllllIIlIIIIIIIIIIllIIlllIIIlllIllIIIIllllllllllIIIlIIIIIlIllIlllllllIl var45 = this;
                     if (var2 != null) {
                        if (((java.util.function.Supplier<Boolean>)(() -> { this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.a(500); return false; })).get()) {
                           lIIlIIIlllIIIIlllllIIlIIIIIIIIIIllIIlllIIIlllIllIIIIllllllllllIIIlIIIIIlIllIlllllllIl var46 = this;
                           if (var2 != null) {
                              if (!this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.isEmpty()) {
                                 this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.remove(0);
                              }

                              var46 = this;
                           }

                           var46.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.f();
                        }

                        var45 = this;
                     }

                     Iterable var24 = var45.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
                     boolean var25 = false;
                     var var16 = new ArrayList();
                     boolean var17 = false;
                     Iterator var19 = var24.iterator();

                     while (true) {
                        if (var19.hasNext()) {
                           Object var20 = var19.next();
                           BlockPos var22 = (BlockPos)var20;
                           boolean var23 = false;
                           boolean var47 = this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.contains(var22);
                           if (var2 == null) {
                              break;
                           }

                           if (var2 != null) {
                              var47 = !var47;
                           }

                           if (!var47) {
                              continue;
                           }

                           var16.add(var20);
                           if (var2 != null) {
                              continue;
                           }
                        }

                        var24 = (Iterable & List)var16;
                        boolean var48 = false;
                        break;
                     }

                     label210: {
                        Iterator var26;
                        label211: {
                           var26 = var24.iterator();
                           boolean var49 = var26.hasNext();
                           if (var2 != null) {
                              if (!var49) {
                                 var10000 = null;
                                 break label210;
                              }

                              var16 = ((ArrayList)(var26.next()));
                              var10000 = (int[])(Object)var26;
                              if (var2 == null) {
                                 break label211;
                              }

                              var49 = var26.hasNext();
                           }

                           if (!var49) {
                              var10000 = (int[])(Object)var16;
                              break label210;
                           }

                           var10000 = (int[])(Object)var16;
                        }

                        BlockPos var27 = (BlockPos)(Object)var10000;
                        boolean var29 = false;
                        me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var52 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                        Vec3 var66 = var27.getCenter();
                        var10004 = -10392;
                        short var74 = -9201;
                        Intrinsics.checkNotNullExpressionValue(var66, "getCenter(...)");
                        double var28 = var52.b(var5, var66);

                        label133:
                        while (true) {
                           Object var30 = var26.next();
                           BlockPos var31 = (BlockPos)var30;
                           boolean var33 = false;
                           me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var53 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                           Vec3 var67 = var31.getCenter();
                           var10004 = -10392;
                           var74 = -9201;
                           Intrinsics.checkNotNullExpressionValue(var67, "getCenter(...)");
                           double var32 = var53.b(var5, var67);
                           if (Double.compare(var28, var32) > 0) {
                              var16 =((ArrayList)( var30));
                              var28 = var32;
                           }

                           while (!var26.hasNext()) {
                              if (var2 != null) {
                                 var10000 = (int[])(Object)var16;
                                 break label133;
                              }

                              var28 = var32;
                           }
                        }
                     }

                     BlockPos var54 = (BlockPos)(Object)var10000;
                     if ((BlockPos)(Object)var10000 == null) {
                        return;
                     }

                     BlockPos var11 = var54;
                     me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var55 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                     Vec3 var68 = var11.getCenter();
                     var10004 = -10392;
                     short var76 = -9201;
                     Intrinsics.checkNotNullExpressionValue(var68, "getCenter(...)");
                     double var12 = var55.a(var5, var68);
                     double var78;
                     int var56 = (var78 = var12 - var6) == 0.0 ? 0 : (var78 < 0.0 ? -1 : 1);
                     if (var2 != null) {
                        if (var56 >= 0) {
                           return;
                        }

                        var56 = ((this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.isEmpty()) ? 1 : 0);
                     }

                     if (var2 != null) {
                        if (var56 != 0) {
                           this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.f();
                        }

                        this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.add(var11);
                     }

                     this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = var11;
                     this.ap().hitResult = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(
                        var11
                     );
                     return;
                  }
               }

               return;
            }
         }
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var1) {
      int[] var10000 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      short var10002 = -10391;
      short var10003 = -8071;
      Intrinsics.checkNotNullParameter(var1, "event");
      int[] var2 = var10000;
      if (var2 != null) {
         if (this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll == null) {
            return;
         }

         var1.a(true);
      }
   }

   @SubscribeEvent(
      priority = EventPriority.HIGH
   )
   public final void a(@NotNull me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var1) {
      int[] var10000 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      short var10002 = -10391;
      short var10003 = -8071;
      Intrinsics.checkNotNullParameter(var1, "event");
      int[] var2 = var10000;
      if (this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll) {
         llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3 = new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(
            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl
               .a(0.8F)
               .o()
         );
         llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var4 = new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(
            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
               .a(0.8F)
               .o()
         );
         llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var5 = new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(
            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
               .a(0.25F)
               .o()
         );
         llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var6 = new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(
            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI
               .o()
         );
         Iterable var7 = this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
         boolean var8 = false;
         Iterator var9 = var7.iterator();

         while (true) {
            if (var9.hasNext()) {
               Object var10 = var9.next();
               BlockPos var11 = (BlockPos)var10;
               boolean var12 = false;
               IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a(
                  var11, var3, var3, 1.5F, null, null, 0.0F, false, 0.0F);
               if (var2 == null) {
                  break;
               }

               if (var2 != null) {
                  continue;
               }
            }

            var7 = this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
            var8 = false;
            break;
         }

         var9 = var7.iterator();

         while (true) {
            if (var9.hasNext()) {
               Object var19 = var9.next();
               BlockPos var22 = (BlockPos)var19;
               boolean var25 = false;
               IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a(
                  var22, var4, var4, 1.5F, null, null, 0.0F, false, 0.0F);
               if (var2 == null) {
                  break;
               }

               if (var2 != null) {
                  continue;
               }
            }

            var7 = this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
            var8 = false;
            break;
         }

         var9 = var7.iterator();

         while (true) {
            if (var9.hasNext()) {
               Object var20 = var9.next();
               BlockPos var23 = (BlockPos)var20;
               boolean var26 = false;
               IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a(
                  var23, var5, null, 0.0F, null, null, 0.0F, false, 0.0F);
               if (var2 == null) {
                  break;
               }

               if (var2 != null) {
                  continue;
               }
            }

            var7 = this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
            var8 = false;
            break;
         }

         for (Object var21 : var7) {
            BlockPos var24 = (BlockPos)var21;
            boolean var27 = false;
            IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a(
               var24, null, var6, 1.5F, null, null, 0.0F, false, 0.0F);
            if (var2 != null && var2 != null) {
               continue;
            }
            break;
         }
      }
   }

   private final byte a(long var1) {
      int[] var10000 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      byte var4 = this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.get(var1);
      int[] var3 = var10000;
      int var13 = var4;
      if (var3 != null) {
         if (var4 != -1) {
            return var4;
         }

         var13 = me.octo.client.utils.IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .b(var1);
      }

      int var5;
      int var6;
      int var7;
      label40: {
         label39: {
            var5 = var13;
            var6 = me.octo.client.utils.IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .c(var1);
            var7 = me.octo.client.utils.IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .d(var1);
            int var8 = var5 >> 4;
            int var9 = var7 >> 4;
            if (var3 != null) {
               if (var8 == this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl) {
                  if (var3 == null) {
                     break label40;
                  }

                  if (var9 == this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI) {
                     break label39;
                  }
               }

               this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = this.ag()
                  .getChunk(var8, var9, ChunkStatus.FULL, false);
               this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = var8;
            }

            this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = var9;
         }

         boolean var14 = false;
      }

      ChunkAccess var11 = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
      ChunkAccess var15 = var11;
      if (var3 != null) {
         if (var11 == null) {
            return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         }

         this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.set(var5, var6, var7);
         var15 = var11;
      }

      BlockState var16 = var15.getBlockState(this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl);
      short var10002 = -10387;
      short var10003 = -27959;
      Intrinsics.checkNotNullExpressionValue(var16, "getBlockState(...)");
      BlockState var12 = var16;
      byte var10 = this.a(var12, this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl);
      if (var3 != null) {
         ((Map)this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl).put(var1, var10);
         return var10;
      } else {
         return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      }
   }

   private final byte a(BlockState var1, BlockPos var2) {
      Object var5 = null; // PX-FIX
      int[] var3 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      byte var10000 = ((byte)((var1.isAir()) ? 1 : 0));
      if (var3 != null) {
         if ((var10000 != 0)) {
            return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         }

         var10000 = ((byte)((var1.getFluidState().isEmpty()) ? 1 : 0));
      }

      label63: {
         if (var3 != null) {
            if ((var10000 == 0)) {
               return this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
            }

            var5 = var1;
            if (var3 == null) {
               break label63;
            }

            var10000 = ((byte)((var1.getCollisionShape(this.ag(), var2).isEmpty()) ? 1 : 0));
         }

         if ((var10000 != 0)) {
            return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         }

         var5 = var1;
      }

      Block var6 = ((me.octo.client.PXDyn)var5).getBlock();
      short var10002 = -10394;
      short var10003 = 4114;
      Intrinsics.checkNotNullExpressionValue(var6, "getBlock(...)");
      Block var4 = var6;
      var10000 = ((byte)((me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .D(var1)) ? 1 : 0));
      if (var3 != null) {
         if (var10000 == 0) {
            var10000 = ((byte)((me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .p(var1)) ? 1 : 0));
            if (var3 == null) {
               return var10000;
            }

            label46:
            if (var10000 == 0) {
               var10000 = ((byte)((me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .G(var1)) ? 1 : 0));
               if (var3 != null) {
                  if (var10000 != 0) {
                     break label46;
                  }

                  var10000 = ((byte)((me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(var4)) ? 1 : 0));
               }

               if (var3 != null) {
                  var10000 = var10000 != 0
                     ? this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
                     : this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
               }

               return var10000;
            }
         }

         var10000 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      }

      return var10000;
   }

   @Override
   public void aC() {
      super.aC();
      this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = null;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[14];
      int var3 = 0;
      String var2 = "\u008a\u00891X\u000e\u001d¼\u0005âÙ\u00ad\u009d\u000eM\u0012[Gso\bNMO\u0093|{¸\u0005|\n.\bî\u000e«À\u0087\rù(w2\tª¬À\u009c/\u0005é¨\u009c\\¸\u000e\u0013p\u0090\u001b\u001bê+j\u0082¡Ý¡²\u0003\u0012Ëì\u008b\u0089q\u0098Y\u000b\u0018\u001eÄÛ|\\\u0099çû¡\u0006K\u0017]æ¤6\u0007W\u00adÞ\u0005#\u0012¹\brý\u0099\u0003\nc+\b\u0005\u001e2k\u0089Ó\u000fj\u008c\u0012Aö\u0098½\u008fq·\u009c\u008eÑ²:";
      int var4 = "\u008a\u00891X\u000e\u001d¼\u0005âÙ\u00ad\u009d\u000eM\u0012[Gso\bNMO\u0093|{¸\u0005|\n.\bî\u000e«À\u0087\rù(w2\tª¬À\u009c/\u0005é¨\u009c\\¸\u000e\u0013p\u0090\u001b\u001bê+j\u0082¡Ý¡²\u0003\u0012Ëì\u008b\u0089q\u0098Y\u000b\u0018\u001eÄÛ|\\\u0099çû¡\u0006K\u0017]æ¤6\u0007W\u00adÞ\u0005#\u0012¹\brý\u0099\u0003\nc+\b\u0005\u001e2k\u0089Ó\u000fj\u008c\u0012Aö\u0098½\u008fq·\u009c\u008eÑ²:"
         .length();
      char var1 = '\f';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 54;
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
                     case 0 -> 38;
                     case 1 -> 58;
                     case 2 -> 57;
                     case 3 -> 40;
                     case 4 -> 65;
                     case 5 -> 57;
                     default -> 45;
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
                     g = new String[14];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lIIlIIIlllIIIIlllllIIlIIIIIIIIIIllIIlllIIIlllIllIIIIllllllllllIIIlIIIIIlIllIlllllllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = new lIIlIIIlllIIIIlllllIIlIIIIIIIIIIllIIlllIIIlllIllIIIIllllllllllIIIlIIIIIlIllIlllllllIl();
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

                  var2 = "\u008aÿíE%¦§ôê#\u0084f\u008d\u000bñ_\u008ck\u007flp\u001b~¹ïÍV\u008bæd÷;\u0086£^\u009a\u0083\u0089:Í©\ríõÓ6æó7ú2æF\u0013Z";
                  var4 = "\u008aÿíE%¦§ôê#\u0084f\u008d\u000bñ_\u008ck\u007flp\u001b~¹ïÍV\u008bæd÷;\u0086£^\u009a\u0083\u0089:Í©\ríõÓ6æó7ú2æF\u0013Z".length();
                  var1 = ')';
                  var8 = -1;
            }

            var10000 = 96;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -10389) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 139;
            case 1 -> 54;
            case 2 -> 21;
            case 3 -> 87;
            case 4 -> 219;
            case 5 -> 209;
            case 6 -> 104;
            case 7 -> 247;
            case 8 -> 146;
            case 9 -> 189;
            case 10 -> 228;
            case 11 -> 204;
            case 12 -> 230;
            case 13 -> 96;
            case 14 -> 191;
            case 15 -> 120;
            case 16 -> 52;
            case 17 -> 16;
            case 18 -> 152;
            case 19 -> 61;
            case 20 -> 122;
            case 21 -> 90;
            case 22 -> 192;
            case 23 -> 30;
            case 24 -> 80;
            case 25 -> 100;
            case 26 -> 113;
            case 27 -> 1;
            case 28 -> 117;
            case 29 -> 182;
            case 30 -> 118;
            case 31 -> 218;
            case 32 -> 244;
            case 33 -> 40;
            case 34 -> 183;
            case 35 -> 64;
            case 36 -> 101;
            case 37 -> 159;
            case 38 -> 125;
            case 39 -> 114;
            case 40 -> 110;
            case 41 -> 82;
            case 42 -> 5;
            case 43 -> 186;
            case 44 -> 223;
            case 45 -> 79;
            case 46 -> 97;
            case 47 -> 88;
            case 48 -> 50;
            case 49 -> 232;
            case 50 -> 98;
            case 51 -> 49;
            case 52 -> 248;
            case 53 -> 115;
            case 54 -> 71;
            case 55 -> 138;
            case 56 -> 216;
            case 57 -> 33;
            case 58 -> 249;
            case 59 -> 184;
            case 60 -> 94;
            case 61 -> 171;
            case 62 -> 2;
            case 63 -> 41;
            case 64 -> 109;
            case 65 -> 93;
            case 66 -> 175;
            case 67 -> 111;
            case 68 -> 27;
            case 69 -> 206;
            case 70 -> 92;
            case 71 -> 224;
            case 72 -> 194;
            case 73 -> 149;
            case 74 -> 121;
            case 75 -> 245;
            case 76 -> 215;
            case 77 -> 8;
            case 78 -> 212;
            case 79 -> 144;
            case 80 -> 103;
            case 81 -> 77;
            case 82 -> 134;
            case 83 -> 130;
            case 84 -> 172;
            case 85 -> 231;
            case 86 -> 137;
            case 87 -> 241;
            case 88 -> 177;
            case 89 -> 227;
            case 90 -> 47;
            case 91 -> 124;
            case 92 -> 25;
            case 93 -> 221;
            case 94 -> 234;
            case 95 -> 57;
            case 96 -> 174;
            case 97 -> 250;
            case 98 -> 119;
            case 99 -> 58;
            case 100 -> 180;
            case 101 -> 32;
            case 102 -> 29;
            case 103 -> 156;
            case 104 -> 10;
            case 105 -> 242;
            case 106 -> 157;
            case 107 -> 233;
            case 108 -> 112;
            case 109 -> 23;
            case 110 -> 45;
            case 111 -> 132;
            case 112 -> 133;
            case 113 -> 196;
            case 114 -> 91;
            case 115 -> 208;
            case 116 -> 84;
            case 117 -> 193;
            case 118 -> 108;
            case 119 -> 78;
            case 120 -> 207;
            case 121 -> 253;
            case 122 -> 240;
            case 123 -> 187;
            case 124 -> 19;
            case 125 -> 190;
            case 126 -> 188;
            case 127 -> 28;
            case 128 -> 37;
            case 129 -> 95;
            case 130 -> 59;
            case 131 -> 68;
            case 132 -> 102;
            case 133 -> 220;
            case 134 -> 48;
            case 135 -> 158;
            case 136 -> 83;
            case 137 -> 151;
            case 138 -> 255;
            case 139 -> 44;
            case 140 -> 154;
            case 141 -> 106;
            case 142 -> 199;
            case 143 -> 160;
            case 144 -> 67;
            case 145 -> 211;
            case 146 -> 129;
            case 147 -> 0;
            case 148 -> 246;
            case 149 -> 105;
            case 150 -> 203;
            case 151 -> 170;
            case 152 -> 251;
            case 153 -> 128;
            case 154 -> 141;
            case 155 -> 155;
            case 156 -> 42;
            case 157 -> 65;
            case 158 -> 238;
            case 159 -> 6;
            case 160 -> 60;
            case 161 -> 20;
            case 162 -> 72;
            case 163 -> 163;
            case 164 -> 81;
            case 165 -> 213;
            case 166 -> 143;
            case 167 -> 24;
            case 168 -> 34;
            case 169 -> 148;
            case 170 -> 162;
            case 171 -> 70;
            case 172 -> 31;
            case 173 -> 3;
            case 174 -> 107;
            case 175 -> 164;
            case 176 -> 123;
            case 177 -> 185;
            case 178 -> 176;
            case 179 -> 73;
            case 180 -> 56;
            case 181 -> 202;
            case 182 -> 252;
            case 183 -> 131;
            case 184 -> 169;
            case 185 -> 126;
            case 186 -> 210;
            case 187 -> 51;
            case 188 -> 214;
            case 189 -> 181;
            case 190 -> 135;
            case 191 -> 12;
            case 192 -> 14;
            case 193 -> 15;
            case 194 -> 85;
            case 195 -> 197;
            case 196 -> 62;
            case 197 -> 63;
            case 198 -> 198;
            case 199 -> 222;
            case 200 -> 36;
            case 201 -> 178;
            case 202 -> 99;
            case 203 -> 200;
            case 204 -> 161;
            case 205 -> 195;
            case 206 -> 11;
            case 207 -> 153;
            case 208 -> 179;
            case 209 -> 66;
            case 210 -> 225;
            case 211 -> 201;
            case 212 -> 165;
            case 213 -> 168;
            case 214 -> 145;
            case 215 -> 26;
            case 216 -> 205;
            case 217 -> 173;
            case 218 -> 89;
            case 219 -> 13;
            case 220 -> 74;
            case 221 -> 76;
            case 222 -> 142;
            case 223 -> 69;
            case 224 -> 55;
            case 225 -> 7;
            case 226 -> 235;
            case 227 -> 35;
            case 228 -> 136;
            case 229 -> 147;
            case 230 -> 53;
            case 231 -> 150;
            case 232 -> 39;
            case 233 -> 217;
            case 234 -> 86;
            case 235 -> 116;
            case 236 -> 254;
            case 237 -> 17;
            case 238 -> 18;
            case 239 -> 4;
            case 240 -> 75;
            case 241 -> 229;
            case 242 -> 236;
            case 243 -> 239;
            case 244 -> 46;
            case 245 -> 237;
            case 246 -> 166;
            case 247 -> 38;
            case 248 -> 226;
            case 249 -> 243;
            case 250 -> 43;
            case 251 -> 22;
            case 252 -> 167;
            case 253 -> 127;
            case 254 -> 9;
            default -> 140;
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
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker pxMarker) {
           this();
        }


      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }
}
