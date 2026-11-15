package me.octo.client;

import com.mojang.authlib.GameProfile;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import me.octo.client.utils.player.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.player.RemotePlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.npc.villager.Villager;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.ResolvableProfile;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI
   extends IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI {
   @NotNull
   public static lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI;
   @NotNull
   private List<String> lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
   private boolean llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll;
   private int llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
   @NotNull
   private Vec3 IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII;
   @NotNull
   private me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
   private boolean lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
   private boolean IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   private int lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
   private int llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
   private int lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
   @NotNull
   private me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
   @NotNull
   private me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
   @NotNull
   private ArrayList<Double> lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   @Nullable
   private Double IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
   @NotNull
   private me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
   private int lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
   @NotNull
   private me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
   private boolean IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
   private boolean lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl;
   @NotNull
   private static lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll;
   private static String[] h;
   private static String[] i;

   public lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI() {
      short var10001 = 16591;
      short var10002 = 28871;
      var10002 = 16576;
      short var10003 = -32562;
      short var10004 = 16630;
      short var10005 = -28708;
      super(
         "Dev Macro",
         "Dev Macro.",
         me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
         "General",
         null,
         null,
         false,
         new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[0],
         112,
         null
      );
      String[] var1 = new String[6];
      var10003 = 16615;
      var10004 = -28596;
      var1[0] = "0f0b3b3e0bce4485be658a860a0c8fd6";
      var10003 = 16637;
      var10004 = -3756;
      var1[1] = "0e2921d3d8bb4737bcb27ec6475f45d1";
      var10003 = 16616;
      var10004 = 9914;
      var1[2] = "aa06ab805cec4ca6a998abc62e1a9fde";
      var10003 = 16596;
      var10004 = -4382;
      var1[3] = "ab224520f010423aa9983a4bc3d6eebf";
      var10003 = 16578;
      var10004 = -9311;
      var1[4] = "fdc27f969de345e582981a3ae3098baa";
      var10003 = 16611;
      var10004 = 26594;
      var1[5] = "a81fec2ccc6348a6844b89a4faffb951";
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = CollectionsKt.listOf(var1);
      Vec3 var2 = Vec3.ZERO;
      var10003 = 16638;
      var10004 = 5773;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = var2;
      this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = new ArrayList<>();
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
   }

   @Override
   public boolean b() {
      return this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.contains("");
   }

   private final List<BlockPos> a5() {
      BlockPos[] var1 = new BlockPos[]{
         new BlockPos(0, 78, 13),
         new BlockPos(-24, 54, -11),
         new BlockPos(66, 67, 8),
         new BlockPos(10, 60, -46),
         new BlockPos(-21, 63, -37),
         new BlockPos(-66, 69, -64),
         new BlockPos(-128, 72, -30),
         new BlockPos(-148, 62, -33)
      };
      return CollectionsKt.listOf(var1);
   }

   private final List<lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> a6() {
      lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] var1 = new lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[]{
         new lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            35.0, 10.0
         ),
         new lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            20.0, 6.0
         ),
         new lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            50.0, 15.0
         ),
         new lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            20.0, 10.0
         ),
         new lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            20.0, 10.0
         ),
         new lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            35.0, 20.0
         ),
         new lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            50.0, 10.0
         ),
         new lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            35.0, 10.0
         )
      };
      return CollectionsKt.listOf(var1);
   }

   private final HashMap<BlockPos, List<BlockPos>> a7() {
      Pair[] var1 = new Pair[40];
      var1[0] = TuplesKt.to(new BlockPos(-4, 76, -1), CollectionsKt.listOf(new BlockPos(-25, 71, -13)));
      var1[1] = TuplesKt.to(new BlockPos(0, 78, 8), CollectionsKt.listOf(new BlockPos(-3, 77, -5)));
      var1[2] = TuplesKt.to(new BlockPos(-3, 77, -5), CollectionsKt.listOf(new BlockPos(-29, 71, -13)));
      var1[3] = TuplesKt.to(new BlockPos(-29, 71, -13), CollectionsKt.listOf(new BlockPos(-39, 71, -8)));
      var1[4] = TuplesKt.to(new BlockPos(-39, 71, -8), CollectionsKt.listOf(new BlockPos(-44, 67, -10)));
      var1[5] = TuplesKt.to(new BlockPos(-44, 67, -10), CollectionsKt.listOf(new BlockPos(-42, 60, -19)));
      var1[6] = TuplesKt.to(new BlockPos(-42, 60, -19), CollectionsKt.listOf(new BlockPos(-30, 55, -14)));
      BlockPos var10002 = new BlockPos(-30, 55, -14);
      BlockPos[] var2 = new BlockPos[]{new BlockPos(-16, 55, -8), new BlockPos(-19, 54, -5), new BlockPos(-27, 55, -8)};
      var1[7] = TuplesKt.to(var10002, CollectionsKt.listOf(var2));
      var10002 = new BlockPos(59, 69, 4);
      var2 = new BlockPos[]{new BlockPos(71, 67, 11), new BlockPos(66, 67, 7), new BlockPos(66, 67, 2)};
      var1[8] = TuplesKt.to(var10002, CollectionsKt.listOf(var2));
      var10002 = new BlockPos(-104, 73, -34);
      var2 = new BlockPos[]{new BlockPos(-127, 73, -25), new BlockPos(-117, 73, -28)};
      var1[9] = TuplesKt.to(var10002, CollectionsKt.listOf(var2));
      var1[10] = TuplesKt.to(new BlockPos(-127, 73, -25), CollectionsKt.listOf(new BlockPos(-137, 73, -39)));
      var1[11] = TuplesKt.to(new BlockPos(4, 76, -1), CollectionsKt.listOf(new BlockPos(49, 71, -25)));
      var10002 = new BlockPos(49, 71, -25);
      var2 = new BlockPos[]{new BlockPos(67, 67, -11), new BlockPos(60, 69, -9), new BlockPos(58, 69, 3)};
      var1[12] = TuplesKt.to(var10002, CollectionsKt.listOf(var2));
      var1[13] = TuplesKt.to(new BlockPos(-10, 57, -44), CollectionsKt.listOf(new BlockPos(-28, 65, -37)));
      var1[14] = TuplesKt.to(new BlockPos(-13, 57, -43), CollectionsKt.listOf(new BlockPos(-28, 65, -37)));
      var1[15] = TuplesKt.to(new BlockPos(49, 75, -8), CollectionsKt.listOf(new BlockPos(65, 75, 0)));
      var1[16] = TuplesKt.to(new BlockPos(14, 62, -21), CollectionsKt.listOf(new BlockPos(16, 64, -40)));
      var1[17] = TuplesKt.to(new BlockPos(16, 64, -47), CollectionsKt.listOf(new BlockPos(7, 60, -45)));
      var1[18] = TuplesKt.to(new BlockPos(58, 69, -8), CollectionsKt.listOf(new BlockPos(56, 68, -21)));
      var1[19] = TuplesKt.to(new BlockPos(56, 68, -21), CollectionsKt.listOf(new BlockPos(23, 65, -20)));
      var1[20] = TuplesKt.to(new BlockPos(15, 62, -22), CollectionsKt.listOf(new BlockPos(15, 62, -39)));
      var10002 = new BlockPos(15, 62, -39);
      var2 = new BlockPos[]{new BlockPos(7, 60, -45), new BlockPos(11, 57, -47), new BlockPos(7, 60, -49)};
      var1[21] = TuplesKt.to(var10002, CollectionsKt.listOf(var2));
      var10002 = new BlockPos(11, 57, -45);
      var2 = new BlockPos[]{new BlockPos(7, 60, -45), new BlockPos(7, 60, -49)};
      var1[22] = TuplesKt.to(var10002, CollectionsKt.listOf(var2));
      var1[23] = TuplesKt.to(new BlockPos(-14, 57, -44), CollectionsKt.listOf(new BlockPos(-15, 60, -45)));
      var10002 = new BlockPos(7, 60, -45);
      var2 = new BlockPos[]{new BlockPos(-15, 60, -45), new BlockPos(-14, 60, -45)};
      var1[24] = TuplesKt.to(var10002, CollectionsKt.listOf(var2));
      var10002 = new BlockPos(-15, 60, -45);
      var2 = new BlockPos[]{new BlockPos(-18, 60, -39), new BlockPos(-20, 62, -35)};
      var1[25] = TuplesKt.to(var10002, CollectionsKt.listOf(var2));
      var1[26] = TuplesKt.to(new BlockPos(-24, 60, -38), CollectionsKt.listOf(new BlockPos(-28, 65, -38)));
      var10002 = new BlockPos(-43, 65, -37);
      var2 = new BlockPos[]{new BlockPos(-54, 69, -38), new BlockPos(-71, 70, -53), new BlockPos(-70, 67, -52), new BlockPos(-68, 68, -54)};
      var1[27] = TuplesKt.to(var10002, CollectionsKt.listOf(var2));
      var1[28] = TuplesKt.to(new BlockPos(-68, 63, -50), CollectionsKt.listOf(new BlockPos(-78, 68, -42)));
      var1[29] = TuplesKt.to(new BlockPos(0, 76, -6), CollectionsKt.listOf(new BlockPos(-5, 68, -22)));
      var1[30] = TuplesKt.to(new BlockPos(-133, 72, -28), CollectionsKt.listOf(new BlockPos(-137, 79, -23)));
      var1[31] = TuplesKt.to(new BlockPos(-79, 70, -52), CollectionsKt.listOf(new BlockPos(-98, 73, -38)));
      var1[32] = TuplesKt.to(new BlockPos(-115, 73, -31), CollectionsKt.listOf(new BlockPos(-121, 75, -21)));
      var1[33] = TuplesKt.to(new BlockPos(-140, 73, -44), CollectionsKt.listOf(new BlockPos(-146, 68, -41)));
      var1[34] = TuplesKt.to(new BlockPos(-146, 68, -41), CollectionsKt.listOf(new BlockPos(-147, 62, -34)));
      var1[35] = TuplesKt.to(new BlockPos(12, 70, -11), CollectionsKt.listOf(new BlockPos(39, 74, -10)));
      var1[36] = TuplesKt.to(new BlockPos(6, 60, -45), CollectionsKt.listOf(new BlockPos(-12, 60, -45)));
      var1[37] = TuplesKt.to(new BlockPos(-30, 65, -37), CollectionsKt.listOf(new BlockPos(-42, 65, -37)));
      var10002 = new BlockPos(1, 60, -45);
      var2 = new BlockPos[]{new BlockPos(-11, 60, -45), new BlockPos(-15, 60, -45)};
      var1[38] = TuplesKt.to(var10002, CollectionsKt.listOf(var2));
      var1[39] = TuplesKt.to(new BlockPos(-21, 62, -35), CollectionsKt.listOf(new BlockPos(-24, 60, -39)));
      return MapsKt.hashMapOf(var1);
   }

   @Override
   public void aC() {
      Object var93 = null; // PX-FIX
      Object var92 = null; // PX-FIX
      Object var91 = null; // PX-FIX
      Object var90 = null; // PX-FIX
      Object var87 = null; // PX-FIX
      Object var86 = null; // PX-FIX
      Object var83 = null; // PX-FIX
      Object var74 = null; // PX-FIX
      Object var73 = null; // PX-FIX
      Object var69 = null; // PX-FIX
      Object var66 = null; // PX-FIX
      Object var56 = null; // PX-FIX
      Object var51 = null; // PX-FIX
      boolean var1;
      label674: {
         label635: {
            label636: {
               lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI var50;
               label625: {
                  boolean var10000 = lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
                  String var2 = "";
                  var1 = var10000;
                  int var49 = ((this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.contains(var2)) ? 1 : 0);
                  if (!var1) {
                     if (var49 == 0) {
                        this.N();
                        return;
                     }

                     var50 = this;
                     if (var1) {
                        break label625;
                     }

                     var49 = ((int[])(Object)(lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII))[this.W()
                        .ordinal()];
                  }

                  switch (var49) {
                     case 1:
                        var50 = this;
                        break;
                     case 2:
                        break label636;
                     case 3:
                        break label635;
                     case 4:
                        break label674;
                     default:
                        return;
                  }
               }

               label612: {
                  if (!var1) {
                     if (var50.aJ().a()
                        == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                        )
                      {
                        double var116;
                        var51 = (
                                 var116 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                       .a(
                                          this.aJ().c(),
                                          me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w()
                                       )
                                    - 3.0
                              )
                              == 0.0
                           ? 0
                           : (var116 < 0.0 ? -1 : 1);
                        if (var1) {
                           break label612;
                        }

                        if (((Boolean)var51)) {
                           var51 = ((java.util.function.Supplier<Object>)(() -> { IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                              .d()
                              .a(5000); return null; })).get();
                           if (var1) {
                              break label612;
                           }

                           if (!((Boolean)var51)) {
                              this.a(
                                 IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
                                 2000
                              );
                              return;
                           }
                        }
                     }

                     var50 = this;
                  }

                  var51 = var50.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
               }

               label601: {
                  label638: {
                     if (!var1) {
                        if (((Boolean)(var51))) {
                           var51 = this.aK();
                           if (var1) {
                              break label601;
                           }

                           if (((Boolean)(var51))) {
                              var51 = this.a9().isEmpty();
                              if (!var1) {
                                 if (!((Boolean)var51)) {
                                    return;
                                 }

                                 var51 = ((java.util.function.Supplier<Object>)(() -> { this.aI().a(500); return null; })).get();
                              }

                              if (var1) {
                                 break label601;
                              }

                              if (((Boolean)(var51))) {
                                 return;
                              }
                           }
                           break label638;
                        }

                        var51 = this.aK();
                     }

                     if (var1) {
                        break label601;
                     }

                     if (((Boolean)(var51))) {
                        return;
                     }
                  }

                  var51 = ((int[])(Object)(lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl))[this.aJ()
                     .a()
                     .ordinal()];
               }

               int var10001 = 1;
               if (!var1) {
                  if (((Boolean)(var51))) {
                     return;
                  }

                  var51 = this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
                  var10001 = 15;
               }

               if (!var1) {
                  if ((Boolean)var51 == ((var10001 == 0))) {
                     this.a_();
                     if (!var1) {
                        return;
                     }
                  }

                  var51 = this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
                  var10001 = this.a5().size();
               }

               label640: {
                  if (!var1) {
                     if ((Boolean)var51 == ((var10001 == 0))) {
                        this.ba();
                        if (!var1) {
                           return;
                        }
                     }

                     var50 = this;
                     if (var1) {
                        break label640;
                     }

                     var51 = this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
                     var10001 = 2;
                  }

                  if ((Boolean)var51 == ((var10001 == 0))) {
                     this.a(
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
                     );
                     if (!var1) {
                        return;
                     }
                  }

                  var50 = this;
               }

               var50.bb();
               if (!var1) {
                  return;
               }
            }

            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .t();
            List var3 = this.a9();
            int var53 = ((var3.isEmpty()) ? 1 : 0);
            if (!var1) {
               if (var53 != 0) {
                  this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII.f();
               }

               long var117;
               var53 = (var117 = this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll.b() % 30000 - 40L) == 0L
                  ? 0
                  : (var117 < 0L ? -1 : 1);
            }

            label642: {
               if (!var1) {
                  if (var53 < 0) {
                     short var54 = 16635;
                     short var98 = -32305;
                     String var5 = "%.2f";
                     Object[] var6 = new Object[]{
                        5.0 - this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll.b() / 60000.0
                     };
                     String var55 = String.format(var5, Arrays.copyOf(var6, var6.length));
                     short var10002 = 16593;
                     short var10003 = -2737;
                     Intrinsics.checkNotNullExpressionValue(var55, "format(...)");
                     var98 = 16639;
                     var10002 = 1355;
                     me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                        var55 + " minutes left"
                     );
                  }

                  var56 = this;
                  if (var1) {
                     break label642;
                  }

                  var53 = ((java.util.function.Supplier<Integer>)(() -> { this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII.a(5000); return 0; })).get();
               }

               if (var53 == 0) {
                  var56 = this;
                  if (var1) {
                     break label642;
                  }

                  if (!((java.util.function.Supplier<Boolean>)(() -> { this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll.a(300000); return false; })).get()) {
                     return;
                  }
               }

               this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = 0;
               var56 = this;
            }

            this.bb();
            if (!var1) {
               return;
            }
         }

         if (this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl) {
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .t();
            return;
         }

         BlockPos var21 = new BlockPos(-5, 68, -22);
         Vec3 var4 = new Vec3(-5.5, 68.0, -22.5);
         Vec3 var57 = var4.add(0.0, 1.62, 0.0);
         short var107 = 16620;
         short var112 = 8019;
         Intrinsics.checkNotNullExpressionValue(var57, "add(...)");
         Vec3 var24 = var57;
         double var118;
         int var58 = (
                  var118 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .b(var24, true)
                     - 3.0
               )
               == 0.0
            ? 0
            : (var118 < 0.0 ? -1 : 1);
         if (!var1) {
            if (var58 < 0) {
               label556: {
                  IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll var59 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                     .e();
                  if (!var1) {
                     if (var59.d()) {
                        break label556;
                     }

                     var59 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                        .e();
                  }

                  var59.k();
               }

               label550: {
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .r();
                  me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.a(var24);
                  if (!var1) {
                     LocalPlayer var60 = this.ap().player;
                     if (var60 != null) {
                        var57 = ((Vec3)(Object)(var60.getId()));
                        break label550;
                     }
                  }

                  var57 = ((Vec3)(Object)(""));
               }

               Object var26 = var57;
               ClientLevel var62 = this.ap().level;
               Intrinsics.checkNotNull(var62);
               Iterable var63 = var62.entitiesForRendering();
               var107 = 16636;
               var112 = -446;
               Intrinsics.checkNotNullExpressionValue(var63, "entitiesForRendering(...)");
               Iterable var10 = var63;
               Iterator var11 = var10.iterator();

               label543:
               while (true) {
                  if (!var11.hasNext()) {
                     var57 = null;
                     break;
                  }

                  Object var12 = var11.next();
                  var57 = (Vec3)var12;

                  while (true) {
                     label676: {
                        Entity var13 = (Entity)(Object)var57;
                        boolean var14 = false;
                        if (var1 || !(var26 instanceof Integer) || var13.getId() != ((Number)var26).intValue()) {
                           me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var65 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                           Intrinsics.checkNotNull(var13);
                           double var119;
                           var66 = (
                                    var119 = var65.c(
                                          var4,
                                          me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(
                                             var13
                                          )
                                       )
                                       - 0.01
                                 )
                                 == 0.0
                              ? 0
                              : (var119 < 0.0 ? -1 : 1);
                           if (var1) {
                              break label676;
                           }

                           if (((Boolean)var66)) {
                              var66 = 1;
                              break label676;
                           }
                        }

                        var66 = 0;
                     }

                     if (((Boolean)(var66))) {
                        break;
                     }

                     var57 = (Vec3)var12;
                     if (!var1) {
                        break label543;
                     }
                  }
               }

               Entity var67 = (Entity)(Object)var57;
               if ((Entity)(Object)var57 == null) {
                  return;
               }

               label649: {
                  Entity var7 = var67;
                  float var120;
                  int var68 = (
                           var120 = Math.abs(
                                 me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                    .c(var24)
                                    .a()
                              )
                              - 5.0F
                        )
                        == 0.0F
                     ? 0
                     : (var120 < 0.0F ? -1 : 1);
                  if (!var1) {
                     if (var68 >= 0) {
                        return;
                     }

                     var69 = this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
                     if (var1) {
                        break label649;
                     }

                     var68 = ((java.util.function.Supplier<Integer>)(() -> { this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.a(1500); return 0; })).get();
                  }

                  if (var68 == 0) {
                     return;
                  }

                  me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a(var7);
                  var69 = this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
               }

               this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.f();
               if (!var1) {
                  return;
               }
            }

            var58 = ((IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
               .e()
               .d()) ? 1 : 0);
         }

         if (!var1) {
            if (var58 == 0) {
               return;
            }

            IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
               ((BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                  .e())),
               ((IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll)(Object)(var21)),
               0,
               false);
         }

         if (!var1) {
            return;
         }
      }

      LocalPlayer var70 = this.ap().player;
      if (var70 != null) {
         LocalPlayer var22 = var70;
         BlockPos var23 = this.a5().get(this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll);
         Vec3 var71 = var23.getCenter();
         short var109 = 16597;
         short var114 = -30632;
         Intrinsics.checkNotNullExpressionValue(var71, "getCenter(...)");
         Vec3 var25 = var71;
         lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var27 = this.a6()
            .get(this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll);
         Vec3 var28 = llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(var22);
         Vec3 var8 = new Vec3(0.5, 77.0, -0.5);
         List var9 = this.a9();
         Iterable var33 = var9;
         Iterator var35 = var33.iterator();

         label507:
         while (true) {
            if (!var35.hasNext()) {
               var70 = null;
               break;
            }

            Object var36 = var35.next();
            var70 = (LocalPlayer)var36;

            while (true) {
               label503: {
                  label653: {
                     Vec3 var15 = (Vec3)(Object)var70;
                     boolean var16 = false;
                     double var121;
                     var73 = (
                              var121 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .a(var25, var15)
                                 - var27.a()
                           )
                           == 0.0
                        ? 0
                        : (var121 < 0.0 ? -1 : 1);
                     if (!var1) {
                        if (((Boolean)var73)) {
                           break label653;
                        }

                        double var122;
                        var73 = (var122 = Math.abs(var15.y - var25.y) - var27.b()) == 0.0 ? 0 : (var122 < 0.0 ? -1 : 1);
                     }

                     if (!var1) {
                        if (((Boolean)var73)) {
                           break label653;
                        }

                        double var123;
                        var73 = (
                                 var123 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                       .a(var8, var15)
                                    - 2.0
                              )
                              == 0.0
                           ? 0
                           : (var123 < 0.0 ? -1 : 1);
                     }

                     if (var1) {
                        break label503;
                     }

                     if (((Boolean)var73)) {
                        var73 = 1;
                        break label503;
                     }
                  }

                  var73 = 0;
               }

               if (((Boolean)(var73))) {
                  break;
               }

               var70 = (LocalPlayer)var36;
               if (!var1) {
                  break label507;
               }
            }
         }

         Vec3 var29;
         var29 = (Vec3)(Object)var70;
         var74 = ((java.util.function.Supplier<Object>)(() -> { this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.a(3000); return null; })).get();
         label481:
         if (!var1) {
            if (((Boolean)(var74))) {
               ClientLevel var75 = this.ap().level;
               if (var75 != null) {
                  Iterable var76 = var75.entitiesForRendering();
                  if (var76 != null) {
                     Iterable var37 = var76;
                     boolean var40 = false;
                     var var17 = new ArrayList();
                     boolean var18 = false;

                     label472: {
                        for (Object var20 : var37) {
                           boolean var77 = var20 instanceof RemotePlayer;
                           if (var1) {
                              break label472;
                           }

                           if (!var1) {
                              if (!var77) {
                                 continue;
                              }

                              var17.add(var20);
                           }

                           if (var1) {
                              break;
                           }
                        }

                        var37 = var17;
                        boolean var78 = false;
                     }

                     for (Object var44 : var37) {
                        RemotePlayer var46 = (RemotePlayer)var44;
                        boolean var47 = false;
                        String var79 = var46.getUUID().toString();
                        var109 = 16614;
                        var114 = -23211;
                        Intrinsics.checkNotNullExpressionValue(var79, "toString(...)");
                        String var48 = StringsKt.replace(var79, "-", "", false);
                        if (!var1) {
                           var74 = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.contains(var48);
                           if (var1) {
                              break label481;
                           }

                           if (!((Boolean)var74)) {
                              short var80 = 16582;
                              short var100 = 22205;
                              me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                                 "Detected other player!"
                              );
                              String var81 = var46.getName().getString();
                              var100 = 16610;
                              var109 = -15340;
                              me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                                 "Say hi to " + var81 + "!"
                              );
                              this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII = true;
                              this.ba();
                              return;
                           }
                        }

                        if (var1) {
                           break;
                        }
                     }
                  }
               }
            }

            var74 = var9.isEmpty();
         }

         label446:
         if (!var1) {
            if (((Boolean)(var74))) {
               var74 = this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
               if (var1) {
                  break label446;
               }

               if (!this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII) {
                  if (var29 == null) {
                     this.a8();
                     lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI var95 = this;
                     if (!var1) {
                        if (this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll != this.a5().size()) {
                           return;
                        }

                        var95 = this;
                     }

                     var95.a(
                        IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
                        50
                     );
                     return;
                  }

                  label659: {
                     int var82 = this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
                     int var102 = 3;
                     if (!var1) {
                        if (this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII != 3) {
                           Entity var30;
                           EntityHitResult var84 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .H();
                           var30 = var84 != null ? var84.getEntity() : null;
                           double var34 = this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll ? 5.0 : 6.0;
                           label391:
                           if (me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .a(var29, llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(var22))
                              < var34) {
                              label389: {
                                 label663: {
                                    label664: {
                                       label665: {
                                          Entity var85 = var30;
                                          if (!var1) {
                                             if (var30 == null) {
                                                break label665;
                                             }

                                             var85 = var30;
                                          }

                                          var86 = var85 instanceof RemotePlayer;
                                          if (!var1) {
                                             if (((Boolean)(var86))) {
                                                break label391;
                                             }

                                             var86 = var30 instanceof Villager;
                                          }

                                          if (var1) {
                                             break label664;
                                          }

                                          if (((Boolean)(var86))) {
                                             break label391;
                                          }
                                       }

                                       var87 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                          .e();
                                       if (var1) {
                                          break label663;
                                       }

                                       var86 = ((me.octo.client.PXDyn)var87).d();
                                    }

                                    if (((Boolean)(var86))) {
                                       break label389;
                                    }

                                    var87 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                       .e();
                                 }

                                 ((me.octo.client.PXDyn)var87).k();
                              }

                              if (this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll != null) {
                                 me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var43 = this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
                                 boolean var45 = false;
                                 if (!var1
                                    && me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                          .K()
                                       != var43.b()) {
                                    me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                       .b(var43.b());
                                    return;
                                 }
                              }

                              lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var38 = new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(
                                 var22.getYRot(), 89.0F
                              );
                              me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.a(var38);
                              float var124;
                              int var88 = (
                                       var124 = Math.abs(
                                             me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                                .b(var38)
                                                .b()
                                          )
                                          - 20.0F
                                    )
                                    == 0.0F
                                 ? 0
                                 : (var124 < 0.0F ? -1 : 1);
                              if (!var1) {
                                 if (var88 >= 0) {
                                    return;
                                 }

                                 var88 = ((java.util.function.Supplier<Integer>)(() -> { this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.a(600); return 0; })).get();
                              }

                              if (!var1) {
                                 if (var88 == 0) {
                                    return;
                                 }

                                 var88 = ((me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                    .k()) ? 1 : 0);
                              }

                              if (!var1) {
                                 if (var88 == 0) {
                                    return;
                                 }

                                 this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.f();
                                 var88 = this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
                              }

                              int var41 = var88;
                              this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = var41 + 1;
                              int var89 = ((this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll) ? 1 : 0);
                              if (!var1) {
                                 if (!this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll) {
                                    return;
                                 }

                                 var89 = this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
                              }

                              label666: {
                                 var102 = this.a5().size();
                                 if (!var1) {
                                    if (var89 >= var102) {
                                       return;
                                    }

                                    this.a8();
                                    var90 = this;
                                    if (var1) {
                                       break label666;
                                    }

                                    var89 = this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
                                    var102 = 2;
                                 }

                                 if (var89 != var102) {
                                    var90 = this;
                                    if (var1) {
                                       break label666;
                                    }

                                    if (this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll != this.a5().size()) {
                                       return;
                                    }
                                 }

                                 var90 = this;
                              }

                              this.a(
                                 IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
                                 50
                              );
                              if (!var1) {
                                 return;
                              }
                           }

                           BlockPos var39;
                           label333: {
                              var39 = this.a(var29);
                              if (!var1) {
                                 if (!(
                                    me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                          .c(this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII, var29)
                                       > 4.0
                                 )) {
                                    break label333;
                                 }

                                 IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                    .e()
                                    .k();
                              }

                              this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = var29;
                           }

                           label327: {
                              if (var30 != null) {
                                 double var125;
                                 var91 = (
                                          var125 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                                .c(
                                                   llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(var30),
                                                   new Vec3(-1.5, 79.0, 10.5)
                                                )
                                             - 0.1
                                       )
                                       == 0.0
                                    ? 0
                                    : (var125 < 0.0 ? -1 : 1);
                                 if (var1) {
                                    break label327;
                                 }

                                 if (((Boolean)var91)) {
                                    var91 = this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
                                    if (var1) {
                                       break label327;
                                    }

                                    if (this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll != 0) {
                                       var91 = this.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl;
                                       if (var1) {
                                          break label327;
                                       }

                                       if (!this.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl) {
                                          this.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl = true;
                                          IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                                             ((BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                                .e())),
                                             ((IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll)(Object)(new BlockPos(-1, 78, 8))),
                                             0,
                                             false);
                                       }
                                    }
                                 }
                              }

                              var91 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                 .e()
                                 .d();
                           }

                           if (!((Boolean)var91)) {
                              label668: {
                                 label669: {
                                    if (var39 != null) {
                                       var92 = IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                                          ((BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                             .e())),
                                          ((IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll)(Object)(var39)),
                                          0,
                                          false);
                                       if (var1) {
                                          break label669;
                                       }

                                       if (((Boolean)(var92))) {
                                          return;
                                       }
                                    }

                                    var93 = this;
                                    if (var1) {
                                       break label668;
                                    }

                                    var92 = this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
                                 }

                                 label304:
                                 if (((Boolean)(var92))) {
                                    this.a8();
                                    lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI var94 = this;
                                    if (!var1) {
                                       if (this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll != 2) {
                                          var93 = this;
                                          if (var1) {
                                             break label668;
                                          }

                                          if (this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll != this.a5().size()) {
                                             break label304;
                                          }
                                       }

                                       var94 = this;
                                    }

                                    var94.a(
                                       IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
                                       50
                                    );
                                 }

                                 var93 = this;
                              }

                              this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = true;
                           }

                           return;
                        }

                        this.a8();
                        var83 = this;
                        if (var1) {
                           break label659;
                        }

                        var82 = this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
                        var102 = 2;
                     }

                     if (var82 != var102) {
                        var83 = this;
                        if (var1) {
                           break label659;
                        }

                        if (this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll != this.a5().size()) {
                           return;
                        }
                     }

                     var83 = this;
                  }

                  this.a(
                     IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
                     50
                  );
                  return;
               }
            }

            double var126;
            var74 = (
                     var126 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .a(var8, var28)
                        - 2.0
                  )
                  == 0.0
               ? 0
               : (var126 < 0.0 ? -1 : 1);
         }

         label290: {
            if (!var1) {
               if (((Boolean)var74)) {
                  break label290;
               }

               short var96 = 16598;
               short var104 = -11235;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Rats empty: FAIL");
               var74 = this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
            }

            int var31 =((Integer)( var74));
            this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = var31 + 1;
            this.ba();
            if (!var1) {
               return;
            }
         }

         short var97 = 16594;
         short var105 = -16835;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Rats empty: SUCCESS");
         this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = 0;
         this.a(
            IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII
         );
         this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = this.a5().size();
         Vec3 var32 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
         me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(null);
      }
   }

   @SubscribeEvent
   public final void b(@NotNull me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      short var10001 = 16622;
      short var10002 = 11973;
      Intrinsics.checkNotNullParameter(var1, "event");
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll.f();
      this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.f();
      this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII = false;
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI var1) {
      Object var19 = null; // PX-FIX
      int var10000 = ((lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c()) ? 1 : 0);
      short var10002 = 16619;
      short var10003 = -25886;
      Intrinsics.checkNotNullParameter(var1, "event");
      boolean var2 = (var10000 != 0);
      if (var2) {
         String var12 = var1.k();
         if (var12 != null) {
            String var3 = var12;
            if (var2) {
               List var13 = var1.m();
               if (var13 != null) {
                  List var4 = var13;
                  Object var14 = this;
                  if (var2) {
                     if (this.W()
                        != IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl
                        )
                      {
                        return;
                     }

                     var14 = this;
                  }

                  if (var2) {
                     if (!((lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI)var14).lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl
                        )
                      {
                        this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.f();
                     }

                     var14 = var4.get(50);
                  }

                  Slot var5 = (Slot)var14;
                  Object var15 = var5;
                  if (var2) {
                     if (!var5.hasItem()) {
                        return;
                     }

                     var15 = Item.BY_BLOCK.get(Blocks.BEDROCK);
                  }

                  label93: {
                     Item var6 = (Item)var15;
                     if (var2) {
                        if (var6 != null) {
                           var10000 = ((var5.getItem().is(var6)) ? 1 : 0);
                           if (!var2) {
                              break label93;
                           }

                           if (var10000 != 0) {
                              short var17 = 16612;
                              short var23 = 32081;
                              me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                                 "Bedrock selector item!"
                              );
                              if (var2) {
                                 LocalPlayer var18 = this.ap().player;
                                 if (var18 != null) {
                                    var18.closeContainer();
                                 }
                              }

                              this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = false;
                              return;
                           }
                        }

                        this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = true;
                     }

                     short var10001 = 16623;
                     var10002 = -26906;
                     var10000 = ((Intrinsics.areEqual(var3, "SkyBlock Hub Selector")) ? 1 : 0);
                  }

                  if (var2) {
                     if (var10000 == 0) {
                        return;
                     }

                     var10000 = ((java.util.function.Supplier<Integer>)(() -> { this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.a(500); return 0; })).get();
                  }

                  label113: {
                     if (var2) {
                        if (var10000 == 0) {
                           return;
                        }

                        me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .a(50, 0, ContainerInput.PICKUP);
                        this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.f();
                        this.a(
                           IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        );
                        this.a(
                           (me.octo.client.lIllllIllllIIllIlIllIlIlIIIIlIIlllllllIlIIIIIIlIlIlIIIlIIIIllIllllIllllIIIlllIIIIlIlI)IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .a(
                                 IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
                                 2000
                              )
                        );
                        this.aI().f();
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                           .d()
                           .f();
                        var19 = this;
                        if (!var2) {
                           break label113;
                        }

                        var10000 = this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
                     }

                     if (var10000 < 7) {
                        return;
                     }

                     var19 = this;
                  }

                  double var7;
                  label69: {
                     String var9;
                     label68: {
                        var7 = (Double)((me.octo.client.PXDyn)(Object)this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll).b() / 1000.0;
                        short var20 = 16635;
                        short var24 = -32305;
                        String var10 = "%.2f";
                        Object[] var11 = new Object[]{var7};
                        String var21 = String.format(var10, Arrays.copyOf(var11, var11.length));
                        var10002 = 16593;
                        var10003 = -2737;
                        Intrinsics.checkNotNullExpressionValue(var21, "format(...)");
                        var9 = var21;
                        lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI var22 = this;
                        if (var2) {
                           if (this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll != null) {
                              Double var25 = this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
                              Intrinsics.checkNotNull(this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll);
                              if (!(var7 < var25)) {
                                 break label68;
                              }
                           }

                           var22 = this;
                        }

                        var22.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = var7;
                        var24 = 16589;
                        var10002 = 27603;
                        me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("New Best: " + var9);
                        if (var2) {
                           break label69;
                        }
                     }

                     short var27 = 16600;
                     var10002 = -16592;
                     me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Lobby Time: " + var9);
                  }

                  this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl.add(var7);
                  return;
               }
            }

            return;
         }
      }
   }

   @SubscribeEvent
   public final void c(@NotNull me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      int var10000 = ((lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c()) ? 1 : 0);
      short var10002 = 16622;
      short var10003 = 11973;
      Intrinsics.checkNotNullParameter(var1, "event");
      boolean var2 = (var10000 != 0);
      Packet var3 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      var10000 = ((var3 instanceof ClientboundSystemChatPacket) ? 1 : 0);
      if (var2) {
         if ((var10000 == 0)) {
            return;
         }

         var10000 = ((((ClientboundSystemChatPacket)var3).overlay() ? 1 : 0));
      }

      if ((var10000 == 0)) {
         label53: {
            String var4;
            label63: {
               me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var8 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
               String var10001 = ((ClientboundSystemChatPacket)var3).content().getString();
               var10003 = 16609;
               short var10004 = -6470;
               Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
               var4 = var8.a(var10001);
               short var12 = 16632;
               var10002 = -1537;
               var10000 = ((StringsKt.startsWith(var4, "Your Implosion hit", false)) ? 1 : 0);
               if (var2) {
                  if (var10000 == 0) {
                     short var13 = 16605;
                     var10002 = 12825;
                     var10000 = ((StringsKt.startsWith(var4, "Your Spirit Sceptre hit", false)) ? 1 : 0);
                     if (!var2) {
                        break label53;
                     }

                     if (var10000 == 0) {
                        break label63;
                     }
                  }

                  var10000 = this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
               }

               int var5 = var10000;
               this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = var5 + 1;
               var5 = this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI++;
               var10000 = ((this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll) ? 1 : 0);
               if (!var2) {
                  break label53;
               }

               if (!this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll) {
                  var10000 = this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
                  if (!var2) {
                     break label53;
                  }

                  label42:
                  if (this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll < this.a5().size()) {
                     this.a8();
                     lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI var11 = this;
                     if (var2) {
                        if (this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll != 2) {
                           var10000 = this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
                           if (!var2) {
                              break label53;
                           }

                           if (this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll != this.a5().size()) {
                              break label42;
                           }
                        }

                        var11 = this;
                     }

                     var11.a(
                        IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
                        500
                     );
                  }
               }
            }

            short var14 = 16580;
            var10002 = 2316;
            var10000 = ((StringsKt.startsWith(var4, "Exception Connecting:", false)) ? 1 : 0);
         }

         if (var10000 != 0) {
            this.a(
               IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII
            );
         }
      }
   }

   private final void a8() {
      int var2 = this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll++;
      boolean var10000 = lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = false;
      this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = 0;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .t();
      boolean var1 = var10000;
      IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll var3 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .e();
      if (!var1) {
         if (var3.d()) {
            return;
         }

         var3 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .e();
      }

      var3.k();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final BlockPos a(Vec3 var1) {
      boolean var2 = lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      if (!var2) {
         ClientLevel var10000 = this.ap().level;
         if (var10000 != null) {
            ClientLevel var3 = var10000;
            BlockPos var4 = me.octo.client.utils.lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .f(var1);
            if (!this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI) {
               BlockPos var5 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a(var4);
               if (var5 != null && a(var3, var5)) {
                  return var5;
               }
            }

            ArrayList var17 = new ArrayList();
            int var6 = -2;

            label128:
            while (true) {
               int var29 = var6;

               label126:
               while (true) {
                  if (var29 >= 3) {
                     break label128;
                  }

                  int var7 = -2;

                  label123:
                  while (true) {
                     int var30 = var7;

                     label121:
                     while (true) {
                        if (var30 >= 3) {
                           break label123;
                        }

                        var29 = -6;
                        if (var2) {
                           continue label126;
                        }

                        int var8 = -6;

                        while (var8 < 3) {
                           BlockPos var31 = var4.offset(var6, var8, var7);
                           short var10002 = 16586;
                           short var10003 = 11320;
                           Intrinsics.checkNotNullExpressionValue(var31, "offset(...)");
                           BlockPos var9 = var31;
                           if (!var2) {
                              var30 = ((b(var3, var9)) ? 1 : 0);
                              if (var2) {
                                 continue label121;
                              }

                              if (var30 != 0) {
                                 var17.add(var9);
                              }

                              var8++;
                           }

                           if (var2) {
                              break;
                           }
                        }

                        var7++;
                        if (var2) {
                           break label123;
                        }
                        break;
                     }
                  }

                  var6++;
                  if (var2) {
                     break label128;
                  }
                  break;
               }
            }

            Iterable var18 = var17;
            boolean var19 = false;
            var var21 = new ArrayList();
            boolean var10 = false;
            Iterator var12 = var18.iterator();

            while (true) {
               if (var12.hasNext()) {
                  Object var13 = var12.next();
                  BlockPos var15 = (BlockPos)var13;
                  boolean var16 = false;
                  boolean var32 = a(var3, var15);
                  if (var2) {
                     break;
                  }

                  if (!var2) {
                     if (!var32) {
                        continue;
                     }

                     var21.add(var13);
                  }

                  if (!var2) {
                     continue;
                  }
               }

               var18 = (Iterable & List)var21;
               boolean var33 = false;
               break;
            }

            Iterator var20;
            label142: {
               var20 = var18.iterator();
               boolean var34 = var20.hasNext();
               if (!var2) {
                  if (!var34) {
                     return (BlockPos)null;
                  }

                  var21 = ((ArrayList)(var20.next()));
                  var10000 = ((ClientLevel)(Object)(var20));
                  if (var2) {
                     break label142;
                  }

                  var34 = var20.hasNext();
               }

               if (!var34) {
                  return (BlockPos)(Object)var21;
               }

               var10000 = (ClientLevel)(Object)var21;
            }

            BlockPos var22 = (BlockPos)(Object)var10000;
            boolean var24 = false;
            double var23 = var22.getY()
               + me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(var22, false)
                  * 0.5;

            while (true) {
               Object var25 = var20.next();
               BlockPos var26 = (BlockPos)var25;
               boolean var28 = false;
               double var27 = var26.getY()
                  + me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .b(var26, false)
                     * 0.5;
               if (Double.compare(var23, var27) > 0) {
                  var21 =((ArrayList)( var25));
                  var23 = var27;
               }

               while (!var20.hasNext()) {
                  if (!var2) {
                     return (BlockPos)(Object)var21;
                  }

                  var23 = var27;
               }
            }
         }
      }

      return null;
   }

   private final List<Vec3> a9() {
      Object var56 = null; // PX-FIX
      Object var53 = null; // PX-FIX
      Object var52 = null; // PX-FIX
      int var50 = 0; // PX-FIX
      Object var49 = null; // PX-FIX
      Object var46 = null; // PX-FIX
      ItemStack var39 = null; // PX-FIX
      boolean var1 = lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c();
      if (var1) {
         ClientLevel var10000 = this.ap().level;
         if (var10000 != null) {
            ClientLevel var2 = var10000;
            Iterable var42 = var2.entitiesForRendering();
            short var10002 = 16618;
            short var10003 = 15138;
            Intrinsics.checkNotNullExpressionValue(var42, "entitiesForRendering(...)");
            Iterable var4 = var42;
            boolean var5 = false;
            Iterable var6 = var4;
            var var7 = new ArrayList();
            boolean var8 = false;
            Iterator var9 = var4.iterator();

            while (true) {
               if (var9.hasNext()) {
                  Object var10 = var9.next();
                  boolean var43 = var10 instanceof ArmorStand;
                  if (!var1) {
                     break;
                  }

                  if (var1) {
                     if (!var43) {
                        continue;
                     }

                     var7.add(var10);
                  }

                  if (var1) {
                     continue;
                  }
               }

               var4 = var7;
               var5 = false;
               var6 = var4;
               var7 = new ArrayList();
               boolean var44 = false;
               break;
            }

            for (Object var32 : var6) {
               label201: {
                  label227: {
                     ArmorStand var11 = (ArmorStand)var32;
                     boolean var12 = false;
                     me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var45 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                     String var10001 = var11.getName().getString();
                     var10003 = 16609;
                     short var10004 = -6470;
                     Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
                     String var13 = var45.a(var10001);
                     short var60 = 16579;
                     var10002 = 8716;
                     var46 = StringsKt.startsWith(var13, "[Lv", false);
                     if (var1) {
                        if (((Boolean)(var46))) {
                           short var61 = 16583;
                           var10002 = -32689;
                           var46 = StringsKt.endsWith(var13, "Rat", false);
                           if (!var1) {
                              break label201;
                           }

                           if (((Boolean)(var46))) {
                              break label227;
                           }
                        }

                        short var62 = 16602;
                        var10002 = -18805;
                        var46 = StringsKt.startsWith(var13, "[RAT] ", false);
                     }

                     if (!var1) {
                        break label201;
                     }

                     if (!((Boolean)var46)) {
                        var46 = false;
                        break label201;
                     }
                  }

                  var46 = true;
               }

               if (((Boolean)(var46))) {
                  var7.add(var32);
                  if (!var1) {
                     break;
                  }
               }
            }

            List var3 = var7;
            Iterable var47 = var2.entitiesForRendering();
            var10002 = 16636;
            var10003 = -446;
            Intrinsics.checkNotNullExpressionValue(var47, "entitiesForRendering(...)");
            Iterable var22 = var47;
            boolean var24 = false;
            var var27 = new ArrayList();
            boolean var30 = false;

            for (Object var35 : var22) {
               boolean var48 = var35 instanceof LivingEntity;
               if (var1) {
                  if (!var48) {
                     continue;
                  }

                  var27.add(var35);
               }

               if (!var1) {
                  break;
               }
            }

            List var20 = var27;
            ArrayList var23 = new ArrayList();
            var6 = var20;
            boolean var26 = false;

            for (Object var31 : var6) {
               LivingEntity var34 = (LivingEntity)var31;
               boolean var36 = false;
               Vec3 var37 = llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(var34);
               var var38 = var3;
               boolean var14 = false;
               if (var1) {
                  label230: {
                     var49 = var38;
                     label164:
                     if (var1) {
                        if (var38 instanceof Collection) {
                           var49 = (Collection)var38;
                           if (!var1) {
                              break label164;
                           }

                           if (((me.octo.client.PXDyn)var49).isEmpty()) {
                              var50 = 0;
                              break label230;
                           }
                        }

                        var49 = var38;
                     }

                     Iterator var15 = ((me.octo.client.PXDyn)var49).iterator();

                     label157:
                     while (true) {
                        if (!var15.hasNext()) {
                           var50 = 0;
                           break;
                        }

                        Object var16 = var15.next();
                        ArmorStand var17 = (ArmorStand)var16;
                        boolean var18 = false;
                        double var75;
                        var50 = (
                                 var75 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                       .b(var37, llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(var17))
                                    - 9.0
                              )
                              == 0.0
                           ? 0
                           : (var75 < 0.0 ? -1 : 1);

                        while (true) {
                           if (var1) {
                              var50 = var50 < 0 ? 1 : 0;
                           }

                           if (var50 == 0) {
                              break;
                           }

                           var50 = 1;
                           if (var1) {
                              break label157;
                           }
                        }
                     }
                  }

                  label99:
                  if (var50 == 0 || !var1) {
                     label235: {
                        label236: {
                           label139: {
                              ItemStack var51 = var34.getItemBySlot(EquipmentSlot.HEAD);
                              var10002 = 16613;
                              var10003 = 17424;
                              Intrinsics.checkNotNullExpressionValue(var51, "getItemBySlot(...)");
                              var39 = var51;
                              if (!var39.isEmpty()) {
                                 Component var64;
                                 label136: {
                                    var52 = var34.getName();
                                    if (var1) {
                                       LocalPlayer var63 = this.ap().player;
                                       if (var63 != null) {
                                          var64 = var63.getName();
                                          break label136;
                                       }
                                    }

                                    var64 = null;
                                 }

                                 var53 = Intrinsics.areEqual(var52, var64);
                                 if (!var1) {
                                    break label236;
                                 }

                                 if (!((Boolean)var53)) {
                                    break label139;
                                 }
                              }

                              if (var1) {
                                 break label99;
                              }
                           }

                           var10000 = ((ClientLevel)(Object)(var39));
                           if (!var1) {
                              break label235;
                           }

                           var53 = var39.is(Items.PLAYER_HEAD);
                        }

                        if (!((Boolean)var53)) {
                           break label99;
                        }

                        var10000 = (ClientLevel)(Object)(var39.get(DataComponents.PROFILE));
                     }

                     label119: {
                        ResolvableProfile var40 = (ResolvableProfile)(Object)var10000;
                        if (var1 && var40 != null) {
                           GameProfile var55 = var40.partialProfile();
                           if (var55 != null) {
                              var56 = var55.id();
                              if (var1) {
                                 break label119;
                              }
                           }
                        }

                        var56 = null;
                     }

                     label110: {
                        label238: {
                           UUID var41 =((UUID)( var56));
                           UUID var57 = var41;
                           if (var1) {
                              if (var41 == null) {
                                 break label238;
                              }

                              var57 = var41;
                           }

                           String var58 = var57.toString();
                           short var65 = 16621;
                           var10002 = -25159;
                           boolean var59 = Intrinsics.areEqual(var58, "8842a457-5e25-3ad0-958e-dfbebbb1129c");
                           if (!var1) {
                              break label99;
                           }

                           if (var59) {
                              break label110;
                           }
                        }

                        if (var1) {
                           break label99;
                        }
                     }

                     var23.add(var37.add(0.0, 1.62, 0.0));
                  }

                  if (var1) {
                     continue;
                  }
               }
               break;
            }

            return var23;
         }
      }

      return CollectionsKt.emptyList();
   }

   private final void a_() {
      short var10000 = 16590;
      this.aO();
      short var10001 = 175;
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl
      );
      this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll.f();
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Started respawn wait");
   }

   private final void ba() {
      this.aO();
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl
      );
      this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = false;
      this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = 0;
   }

   private final void bb() {
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
      );
      this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = 0;
      this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = 0;
      this.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl = false;
      me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(this.a7());
   }

   private final void bc() {
      this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = 0;
      this.a(
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         2000
      );
   }

   @Override
   public void M() {
      boolean var10000 = lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      String var2 = "";
      boolean var1 = var10000;
      lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI var7 = this;
      if (!var1) {
         if (!this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.contains(var2)) {
            this.N();
            return;
         }

         this.aM();
         var7 = this;
      }

      if (!var1) {
         short var10002 = 16608;
         short var10003 = 19686;
         me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10001 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .d("Wither Impact");
         if (var10001 == null) {
            var10002 = 16588;
            var10003 = 28084;
            var10001 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a("Spirit Sceptre");
         }

         var7.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = var10001;
         var7 = this;
      }

      boolean var4;
      boolean var5;
      boolean var3 = var7.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll != null;
      var4 = this.X() != null;
      var5 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
         == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      var10000 = var3;
      label69:
      if (!var1) {
         if (var3) {
            var10000 = var4;
            if (var1) {
               break label69;
            }

            if (var4) {
               var10000 = var5;
               if (var1) {
                  break label69;
               }

               if (var5) {
                  super.M();
                  llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI[] var6 = new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI[]{
                     new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                        lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI::bd,
                        false
                     ),
                     new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
                        lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI::be,
                        false
                     )
                  };
                  this.a(CollectionsKt.listOf(var6));
                  me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var9 = this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
                  Intrinsics.checkNotNull(this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll);
                  String var10 = var9.a().getHoverName().getString();
                  short var17 = 16631;
                  short var10004 = -17058;
                  Intrinsics.checkNotNullExpressionValue(var10, "getString(...)");
                  CharSequence var11 = var10;
                  short var14 = 16601;
                  var17 = 21097;
                  this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = StringsKt.contains(
                     var11, "Spirit", false);
                  this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = 0;
                  this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = 0;
                  this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl.f();
                  this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll.f();
                  me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a(1.0);
                  this.bc();
                  return;
               }
            }
         }

         var10000 = var3;
      }

      if (!var1) {
         if (!var10000) {
            short var12 = 16581;
            short var15 = -870;
            this.a(
               "Missing: Hyperion",
               me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            );
         }

         var10000 = var4;
      }

      if (!var1) {
         if (!var10000) {
            this.aP();
         }

         var10000 = var5;
      }

      if (!var10000) {
         this.b(
            CollectionsKt.listOf(
               IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            )
         );
      }

      this.N();
   }

   @Override
   public void O() {
      short var10001 = 16607;
      short var10002 = 2789;
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.a(String.valueOf(
         llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl),
         "Rates Info");
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a((kotlin.jvm.functions.Function0<String>)null,  16777215,  0);;
      boolean var10000 = lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c();
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a((kotlin.jvm.functions.Function0<String>)null,  16777215,  0);;
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a((kotlin.jvm.functions.Function0<String>)null,  16777215,  0);;
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a((kotlin.jvm.functions.Function0<String>)null,  16777215,  0);;
      var10002 = 16584;
      short var10003 = 32529;
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.a(String.valueOf(
         llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl),
         "Time Info");
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a((kotlin.jvm.functions.Function0<String>)null,  16777215,  1);;
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a((kotlin.jvm.functions.Function0<String>)null,  16777215,  1);;
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a((kotlin.jvm.functions.Function0<String>)null,  16777215,  1);;
      boolean var1 = var10000;
      if (!var1) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[3]
         );
      }
   }

   @Override
   public void N() {
      super.N();
      this.aN();
      me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(8.0);
   }

   @Override
   public void aH() {
      this.bc();
   }

   @Override
   public void ah() {
      this.bc();
   }

   @Override
   public void aB() {
      this.bc();
   }

   private static final void a(Vec3 var0, lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI var1) {
      if (me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var0, me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w())
         < 1.5) {
         var1.a(
            IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
            50
         );
      }
   }

   private static final Unit a(lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI var0, Vec3 var1) {
      try {
         Thread.sleep(1000L);
      }
      catch (InterruptedException interruptedException) {
         throw new RuntimeException(interruptedException);
      }
      var0.a(
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         50
      );
      try {
         Thread.sleep(3000L);
      }
      catch (InterruptedException interruptedException) {
         throw new RuntimeException(interruptedException);
      }
      var0.ap().execute(null);
      return Unit.INSTANCE;
   }

   private static final boolean a(ClientLevel var0, BlockPos var1) {
      boolean var10000 = lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c();
      BlockState var10001 = var0.getBlockState(var1);
      short var10003 = 16577;
      short var10004 = -10530;
      Intrinsics.checkNotNullExpressionValue(var10001, "getBlockState(...)");
      BlockState var3 = var10001;
      boolean var2 = var10000;
      var10000 = var3.is(BlockTags.LEAVES);
      if (var2) {
         if (var10000) {
            return false;
         }

         var10000 = var3.is(BlockTags.FENCES);
      }

      if (var2) {
         if (var10000) {
            return false;
         }

         var10000 = var3.is(BlockTags.LANTERNS);
      }

      if (var2) {
         if (var10000) {
            return false;
         }

         var10000 = var3.is(BlockTags.WALLS);
      }

      return !var2 ? var10000 : !var10000;
   }

   private static final boolean b(ClientLevel var0, BlockPos var1) {
      byte var10000 = ((byte)((lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b()) ? 1 : 0));
      long var3 = me.octo.client.utils.IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(var1);
      boolean var2 = (var10000 != 0);
      var10000 = ((byte)((var0.isLoaded(var1)) ? 1 : 0));
      if (!var2) {
         if ((var10000 != 0)) {
            return me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .i(var1);
         }

         var10000 = (byte)((0 != 0) ? 1 : 0);
      }

      byte var6 = 7;
      Long2ByteOpenHashMap var7 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .l();
      byte var8 = var7.get(var3);
      var10000 = var8;
      if (!var2) {
         if (var8 != 0) {
            if (var2) {
               return (var8 != 0);
            }

            if (var8 != var6) {
               var10000 = var7.get(
                  me.octo.client.utils.IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a(var3, 0, 1, 0)
               );
               if (var2) {
                  return (var10000 != 0);
               }

               if (var10000 == 0) {
                  var10000 = var7.get(
                     me.octo.client.utils.IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a(var3, 0, 2, 0)
                  );
                  if (var2) {
                     return (var10000 != 0);
                  }

                  if (var10000 == 0) {
                     return (1 != 0);
                  }
               }
            }
         }

         var10000 = 0;
      }

      return (var10000 != 0);
   }

   private static final boolean bd() {
      return IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .e();
   }

   private static final boolean be() {
      return IlllIIIIlIlllIlllllIlIlIIllIlllIlIIllllllIlllllIllIllllIllIIIllIIlIlIlllIIlIllIIlIlll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .a();
   }

   private static final String a(lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI var0) {
      String var10000 = String.valueOf(((me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl)null).a(
         var0.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI
      ));
      short var10001 = 16633;
      short var10002 = 8080;
      return "Rats killed: " + var10000;
   }

   private static final String b(lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI var0) {
      short var10000 = 16585;
      short var10001 = 4937;
      String var1 = "%.1f";
      Object[] var2 = new Object[]{var0.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI * 7.4};
      String var3 = String.format(var1, Arrays.copyOf(var2, var2.length));
      short var10002 = 16593;
      short var10003 = -2737;
      Intrinsics.checkNotNullExpressionValue(var3, "format(...)");
      var10001 = 16604;
      var10002 = 18983;
      return "Expected cheese: " + var3;
   }

   private static final String c(lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI var0) {
      short var10000 = 16635;
      short var10001 = -32305;
      String var1 = "%.2f";
      Object[] var2 = new Object[]{
         var0.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI
            * 7.4
            / (var0.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl.b() / 3600000.0)
      };
      String var3 = String.format(var1, Arrays.copyOf(var2, var2.length));
      short var10002 = 16593;
      short var10003 = -2737;
      Intrinsics.checkNotNullExpressionValue(var3, "format(...)");
      var10001 = 16592;
      var10002 = -29381;
      return "Cheese / hr: " + var3;
   }

   private static final String d(lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI var0) {
      short var10000 = 16634;
      short var10001 = 29533;
      String var1 = "%.2f";
      Object[] var2 = new Object[]{
         var0.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI
            / (var0.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl.b() / 3600000.0)
      };
      String var3 = String.format(var1, Arrays.copyOf(var2, var2.length));
      short var10002 = 16628;
      short var10003 = -16952;
      Intrinsics.checkNotNullExpressionValue(var3, "format(...)");
      var10001 = 16606;
      var10002 = -23009;
      return "Rats / hr: " + var3;
   }

   private static final String e(lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI var0) {
      String var7;
      label20: {
         boolean var1 = lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c();
         if (var1 && var0.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll != null) {
            double var2 = var0.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll.doubleValue();
            short var10000 = 16635;
            boolean var4 = false;
            short var10001 = -32305;
            String var5 = "%.2f";
            Object[] var6 = new Object[]{var2};
            var7 = String.format(var5, Arrays.copyOf(var6, var6.length));
            short var10002 = 16593;
            short var10003 = -2737;
            Intrinsics.checkNotNullExpressionValue(var7, "format(...)");
            if (!var1) {
               return var7;
            }

            if (var7 != null) {
               break label20;
            }
         }

         short var8 = 16603;
         short var9 = 30557;
         var7 = "...";
      }

      short var10 = 16617;
      short var11 = -7303;
      return "Best time (7+ rats): " + var7;
   }

   private static final String f(lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI var0) {
      boolean var1 = lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      String var4;
      if (!var1 && var0.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl.isEmpty()) {
         short var5 = 16599;
         short var6 = -30338;
         var4 = "...";
      } else {
         short var10000 = 16635;
         short var10001 = -32305;
         String var2 = "%.2f";
         Object[] var3 = new Object[]{
            CollectionsKt.averageOfDouble(var0.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl)
         };
         var4 = String.format(var2, Arrays.copyOf(var3, var3.length));
         short var10002 = 16593;
         short var10003 = -2737;
         Intrinsics.checkNotNullExpressionValue(var4, "format(...)");
      }

      short var7 = 16587;
      short var8 = -26226;
      return "Average time (7+ rats): " + var4;
   }

   private static final String g(lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI var0) {
      short var10000 = 16635;
      short var10001 = -32305;
      String var1 = "%.2f";
      Object[] var2 = new Object[]{var0.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll.b() / 1000.0};
      String var3 = String.format(var1, Arrays.copyOf(var2, var2.length));
      short var10002 = 16593;
      short var10003 = -2737;
      Intrinsics.checkNotNullExpressionValue(var3, "format(...)");
      var10001 = 16595;
      var10002 = 782;
      return "Lobby time: " + var3;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[59];
      int var3 = 0;
      String var2 = "\u00943¨èá\u0081!(\u009f&º°î\u009c\u000f\u000bW\"×¸\tß¶#9\\§\u008f:°\u000e\u0086mâ§¼ypwhÐtjGQ\n[ÙùÔ)\u001eß\u008fýI\u000b\u0081µ¶iÔ\u0081ø\u0015=\u0005c\u0018\u0093\u0098\u001cßæewörñßÒÞ89 ´>\u001eJ~kÉ#\tVÈ\u001b>N\u0082\u0000§í\u0004\".\u0096N\u0016=\u0084}:û?\u0096\u0088\u001aô\u0015¹ø£\u0007\u0019Ê:\fª&L\u0003°å\u0018\u0015âë°i¤U\u0000Î\u000b\u0019\u0087¥pÛ9\u009aø3F\u0080Ò\u0011;@\u00929ë\u0091ÝZ1\u001c}\u007fY`z~\u0007 \u0086ï{!\u009aó8\u0013\u0001\u0094]\u0084\u0093sTé\u0019\u009aèÚ±ô3ÐP©6Ú9\u0006\u001b\u0089\u0003\u008aºu\ní¯e\u001a\u0094Ã\u0096¶\u0093¦\u0012V\u001dW.±e7´\u009b\u0086-\u0093H#\u001fFD\f\u000b\u001cç\u008dÄ¦oS¾\u001dê¹\n\u0019~-áá\u0010ë¹Z\u0099\u0011&\r;µ·Î\u001f¶+?/@ 1Y  \u0017\u0018ff:úí\u0088\u001c<ÌÉ0UÂ\u0007\u0006?Êµ\u0080\u0094¬¢\u0006úéLwpÕ\u0003´k1\f&\u0085\u0001Vº\u0001Ö\u009cHÐõ>\u0006ÚÑi0Í\u008b\u0010kÞcã{Á¥p!kâÖ¢<b\u0083\u0003JNî =\u001bºyÚ«X'8\u0080\u009aÛµüÆ«\u008e\u0007h\u0003£Ï4´QF\u0084(ì±T\u009f\u000e¾ýJ3\u001bæ]ë\u0002þT\u0011\u008ac\u0013\t\u008a/iò\u0090\u0094Z\u0007.&~/=n:Á9K\fÎÇ\u001c\u001e\u0019\b\u0082½æô º\r©Å\u0019¾T¾4À£Ø$\u0089]\u000b5ç\u001c\u0015\u0013Ó\u0084_²L\u0092\u0005>¥\tdQ\u0015A8\nE¶\b×\u0019ô\u000fÉ\u000f\u0007\u001fP\u0097Ävèk\u0016\bÂº\u0013\u0091iôk\u00ad$B\u0097!ù:º¼#\bâê0dÜÝSè\u0011\u0015è\u009cÊD)#\u0006+\u008cØ\u001b5zt¯#\u0013\u0019\u00165\u001djà¥\u0000r®^/Öy/s\u0002\u0096æM:¡\u0013\u0016Å\u0006\u0005¼VY\u001a[ $\u0081\u009bMéþË0R1º\u0087o\u001fÏû·°Oõ\u0015\u0012\u00ad8\u008e_QÀõ\u0012¦\u008b\u0015\u008b\u0007j[½ yb/Î\u0002\u0007\u0083\u0092½6\u009dþ\u00ad=\u001a\r\u0089óú\u008eÙ\u0087ê\"÷\u0083ûxx óÐ\u001aÔ\u008b\u0013\u0094ØÖÒ\u0089ÜÏå\u0082\u001ao³8OLê¯DüÔ\\7t®·O\u0016_½ç\n¶Û¼¥Ã\u0097\u000f\u0093¦LE hW\u0090\u000e\u0006Ø\u0012¢ÍÉ?z'[\u009eóèB\u0086\u0018ù&\u001dcg\noÜÏð\n\u0096\u0087\u0013\u009aÚ =Ê¹\u0006\u0088Ìi\u0004\u001b\u008e\\ \u008aêsuylé\u00984õùö\u0012ÀK°P¤s½\rXÍ \u0093F ¢\u0090<` Üø\u000e\u0019\u001e¾_\u0094e\u0082\u000fR\béÏ=¸\u0004åR\u009dî\r¨\u009e:{»}J×\u0081éww\u0096\u0019o\u00192ï\u0005\u0015¼d9\u009cÝ\u008e'$¸cïÊb¿D£ªÓ\u0091 Æ\u0001¾Ö\\0\u0018Ó®uY>ô]îl\u00889\u0090ß\u0088\u001b\u0082þmÕï\u008e«oÁI\u0004þ®\u000e^\u0004t¼_\u001c\u0012ïî\u0098+%Õn[@\u0018\u009c%$\r×KÕ~\rþMÑ\u0091-\u0081k«d\u0093\u000fLì\u0007[\u0005È\n\u0005,s";
      int var4 = "\u00943¨èá\u0081!(\u009f&º°î\u009c\u000f\u000bW\"×¸\tß¶#9\\§\u008f:°\u000e\u0086mâ§¼ypwhÐtjGQ\n[ÙùÔ)\u001eß\u008fýI\u000b\u0081µ¶iÔ\u0081ø\u0015=\u0005c\u0018\u0093\u0098\u001cßæewörñßÒÞ89 ´>\u001eJ~kÉ#\tVÈ\u001b>N\u0082\u0000§í\u0004\".\u0096N\u0016=\u0084}:û?\u0096\u0088\u001aô\u0015¹ø£\u0007\u0019Ê:\fª&L\u0003°å\u0018\u0015âë°i¤U\u0000Î\u000b\u0019\u0087¥pÛ9\u009aø3F\u0080Ò\u0011;@\u00929ë\u0091ÝZ1\u001c}\u007fY`z~\u0007 \u0086ï{!\u009aó8\u0013\u0001\u0094]\u0084\u0093sTé\u0019\u009aèÚ±ô3ÐP©6Ú9\u0006\u001b\u0089\u0003\u008aºu\ní¯e\u001a\u0094Ã\u0096¶\u0093¦\u0012V\u001dW.±e7´\u009b\u0086-\u0093H#\u001fFD\f\u000b\u001cç\u008dÄ¦oS¾\u001dê¹\n\u0019~-áá\u0010ë¹Z\u0099\u0011&\r;µ·Î\u001f¶+?/@ 1Y  \u0017\u0018ff:úí\u0088\u001c<ÌÉ0UÂ\u0007\u0006?Êµ\u0080\u0094¬¢\u0006úéLwpÕ\u0003´k1\f&\u0085\u0001Vº\u0001Ö\u009cHÐõ>\u0006ÚÑi0Í\u008b\u0010kÞcã{Á¥p!kâÖ¢<b\u0083\u0003JNî =\u001bºyÚ«X'8\u0080\u009aÛµüÆ«\u008e\u0007h\u0003£Ï4´QF\u0084(ì±T\u009f\u000e¾ýJ3\u001bæ]ë\u0002þT\u0011\u008ac\u0013\t\u008a/iò\u0090\u0094Z\u0007.&~/=n:Á9K\fÎÇ\u001c\u001e\u0019\b\u0082½æô º\r©Å\u0019¾T¾4À£Ø$\u0089]\u000b5ç\u001c\u0015\u0013Ó\u0084_²L\u0092\u0005>¥\tdQ\u0015A8\nE¶\b×\u0019ô\u000fÉ\u000f\u0007\u001fP\u0097Ävèk\u0016\bÂº\u0013\u0091iôk\u00ad$B\u0097!ù:º¼#\bâê0dÜÝSè\u0011\u0015è\u009cÊD)#\u0006+\u008cØ\u001b5zt¯#\u0013\u0019\u00165\u001djà¥\u0000r®^/Öy/s\u0002\u0096æM:¡\u0013\u0016Å\u0006\u0005¼VY\u001a[ $\u0081\u009bMéþË0R1º\u0087o\u001fÏû·°Oõ\u0015\u0012\u00ad8\u008e_QÀõ\u0012¦\u008b\u0015\u008b\u0007j[½ yb/Î\u0002\u0007\u0083\u0092½6\u009dþ\u00ad=\u001a\r\u0089óú\u008eÙ\u0087ê\"÷\u0083ûxx óÐ\u001aÔ\u008b\u0013\u0094ØÖÒ\u0089ÜÏå\u0082\u001ao³8OLê¯DüÔ\\7t®·O\u0016_½ç\n¶Û¼¥Ã\u0097\u000f\u0093¦LE hW\u0090\u000e\u0006Ø\u0012¢ÍÉ?z'[\u009eóèB\u0086\u0018ù&\u001dcg\noÜÏð\n\u0096\u0087\u0013\u009aÚ =Ê¹\u0006\u0088Ìi\u0004\u001b\u008e\\ \u008aêsuylé\u00984õùö\u0012ÀK°P¤s½\rXÍ \u0093F ¢\u0090<` Üø\u000e\u0019\u001e¾_\u0094e\u0082\u000fR\béÏ=¸\u0004åR\u009dî\r¨\u009e:{»}J×\u0081éww\u0096\u0019o\u00192ï\u0005\u0015¼d9\u009cÝ\u008e'$¸cïÊb¿D£ªÓ\u0091 Æ\u0001¾Ö\\0\u0018Ó®uY>ô]îl\u00889\u0090ß\u0088\u001b\u0082þmÕï\u008e«oÁI\u0004þ®\u000e^\u0004t¼_\u001c\u0012ïî\u0098+%Õn[@\u0018\u009c%$\r×KÕ~\rþMÑ\u0091-\u0081k«d\u0093\u000fLì\u0007[\u0005È\n\u0005,s"
         .length();
      char var1 = 20;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 28;
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
                     case 0 -> 109;
                     case 1 -> 92;
                     case 2 -> 80;
                     case 3 -> 18;
                     case 4 -> 88;
                     case 5 -> 24;
                     default -> 23;
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
                     h = var5;
                     i = new String[59];
                     lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = new lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll = new lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI();
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

                  var2 = "#ÿ+±ôj\\<[¼\u001a\u008b\u0091â\u000bÞû³D4+²\u0092¦'Â";
                  var4 = "#ÿ+±ôj\\<[¼\u001a\u008b\u0091â\u000bÞû³D4+²\u0092¦'Â".length();
                  var1 = 14;
                  var8 = -1;
            }

            var10000 = 97;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 16590) & 65535;
      if (i[var2] == null) {
         char[] var3 = h[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 252;
            case 1 -> 101;
            case 2 -> 245;
            case 3 -> 3;
            case 4 -> 186;
            case 5 -> 175;
            case 6 -> 141;
            case 7 -> 50;
            case 8 -> 194;
            case 9 -> 87;
            case 10 -> 26;
            case 11 -> 38;
            case 12 -> 217;
            case 13 -> 180;
            case 14 -> 66;
            case 15 -> 243;
            case 16 -> 209;
            case 17 -> 156;
            case 18 -> 128;
            case 19 -> 62;
            case 20 -> 53;
            case 21 -> 202;
            case 22 -> 30;
            case 23 -> 234;
            case 24 -> 25;
            case 25 -> 33;
            case 26 -> 213;
            case 27 -> 36;
            case 28 -> 231;
            case 29 -> 24;
            case 30 -> 199;
            case 31 -> 65;
            case 32 -> 223;
            case 33 -> 46;
            case 34 -> 95;
            case 35 -> 195;
            case 36 -> 79;
            case 37 -> 121;
            case 38 -> 4;
            case 39 -> 158;
            case 40 -> 119;
            case 41 -> 104;
            case 42 -> 111;
            case 43 -> 250;
            case 44 -> 152;
            case 45 -> 90;
            case 46 -> 229;
            case 47 -> 22;
            case 48 -> 131;
            case 49 -> 74;
            case 50 -> 226;
            case 51 -> 174;
            case 52 -> 242;
            case 53 -> 7;
            case 54 -> 133;
            case 55 -> 106;
            case 56 -> 124;
            case 57 -> 83;
            case 58 -> 35;
            case 59 -> 105;
            case 60 -> 168;
            case 61 -> 2;
            case 62 -> 138;
            case 63 -> 184;
            case 64 -> 29;
            case 65 -> 225;
            case 66 -> 48;
            case 67 -> 253;
            case 68 -> 45;
            case 69 -> 178;
            case 70 -> 120;
            case 71 -> 127;
            case 72 -> 216;
            case 73 -> 8;
            case 74 -> 147;
            case 75 -> 151;
            case 76 -> 181;
            case 77 -> 254;
            case 78 -> 197;
            case 79 -> 155;
            case 80 -> 190;
            case 81 -> 63;
            case 82 -> 238;
            case 83 -> 211;
            case 84 -> 232;
            case 85 -> 134;
            case 86 -> 52;
            case 87 -> 21;
            case 88 -> 228;
            case 89 -> 220;
            case 90 -> 157;
            case 91 -> 109;
            case 92 -> 240;
            case 93 -> 18;
            case 94 -> 72;
            case 95 -> 49;
            case 96 -> 173;
            case 97 -> 192;
            case 98 -> 15;
            case 99 -> 28;
            case 100 -> 241;
            case 101 -> 80;
            case 102 -> 126;
            case 103 -> 32;
            case 104 -> 171;
            case 105 -> 233;
            case 106 -> 227;
            case 107 -> 183;
            case 108 -> 222;
            case 109 -> 224;
            case 110 -> 165;
            case 111 -> 91;
            case 112 -> 99;
            case 113 -> 98;
            case 114 -> 163;
            case 115 -> 40;
            case 116 -> 9;
            case 117 -> 100;
            case 118 -> 71;
            case 119 -> 143;
            case 120 -> 19;
            case 121 -> 166;
            case 122 -> 149;
            case 123 -> 219;
            case 124 -> 69;
            case 125 -> 67;
            case 126 -> 14;
            case 127 -> 93;
            case 128 -> 132;
            case 129 -> 61;
            case 130 -> 154;
            case 131 -> 125;
            case 132 -> 244;
            case 133 -> 10;
            case 134 -> 212;
            case 135 -> 102;
            case 136 -> 47;
            case 137 -> 0;
            case 138 -> 130;
            case 139 -> 187;
            case 140 -> 116;
            case 141 -> 70;
            case 142 -> 214;
            case 143 -> 179;
            case 144 -> 88;
            case 145 -> 185;
            case 146 -> 76;
            case 147 -> 54;
            case 148 -> 191;
            case 149 -> 146;
            case 150 -> 55;
            case 151 -> 60;
            case 152 -> 237;
            case 153 -> 12;
            case 154 -> 39;
            case 155 -> 218;
            case 156 -> 246;
            case 157 -> 145;
            case 158 -> 56;
            case 159 -> 248;
            case 160 -> 43;
            case 161 -> 122;
            case 162 -> 196;
            case 163 -> 215;
            case 164 -> 110;
            case 165 -> 204;
            case 166 -> 118;
            case 167 -> 150;
            case 168 -> 203;
            case 169 -> 103;
            case 170 -> 251;
            case 171 -> 113;
            case 172 -> 164;
            case 173 -> 44;
            case 174 -> 221;
            case 175 -> 117;
            case 176 -> 94;
            case 177 -> 42;
            case 178 -> 86;
            case 179 -> 129;
            case 180 -> 230;
            case 181 -> 17;
            case 182 -> 159;
            case 183 -> 205;
            case 184 -> 170;
            case 185 -> 247;
            case 186 -> 198;
            case 187 -> 75;
            case 188 -> 182;
            case 189 -> 162;
            case 190 -> 64;
            case 191 -> 27;
            case 192 -> 207;
            case 193 -> 188;
            case 194 -> 31;
            case 195 -> 89;
            case 196 -> 11;
            case 197 -> 114;
            case 198 -> 255;
            case 199 -> 208;
            case 200 -> 51;
            case 201 -> 142;
            case 202 -> 140;
            case 203 -> 200;
            case 204 -> 23;
            case 205 -> 58;
            case 206 -> 169;
            case 207 -> 176;
            case 208 -> 236;
            case 209 -> 41;
            case 210 -> 20;
            case 211 -> 92;
            case 212 -> 5;
            case 213 -> 96;
            case 214 -> 115;
            case 215 -> 210;
            case 216 -> 160;
            case 217 -> 82;
            case 218 -> 1;
            case 219 -> 135;
            case 220 -> 206;
            case 221 -> 13;
            case 222 -> 59;
            case 223 -> 37;
            case 224 -> 84;
            case 225 -> 167;
            case 226 -> 235;
            case 227 -> 97;
            case 228 -> 107;
            case 229 -> 249;
            case 230 -> 136;
            case 231 -> 137;
            case 232 -> 177;
            case 233 -> 6;
            case 234 -> 139;
            case 235 -> 189;
            case 236 -> 77;
            case 237 -> 78;
            case 238 -> 239;
            case 239 -> 81;
            case 240 -> 153;
            case 241 -> 68;
            case 242 -> 34;
            case 243 -> 172;
            case 244 -> 73;
            case 245 -> 123;
            case 246 -> 57;
            case 247 -> 16;
            case 248 -> 201;
            case 249 -> 148;
            case 250 -> 193;
            case 251 -> 108;
            case 252 -> 144;
            case 253 -> 112;
            case 254 -> 161;
            default -> 85;
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

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      private final double IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final double lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(double var1, double var3) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var3;
      }

      public final double a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final double b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final double c() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final double d() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         double var1, double var3
      ) {
         return new lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 20503;
         double var1 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         double var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 4391;
         short var10002 = 20502;
         short var10003 = 31541;
         return "ScanConfig(maxRange=" + var3 + ", maxDY=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Double.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         return var1 * 31 + Double.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         boolean var2 = lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c();
         Object var10000 = this;
         if (var2) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2) {
            if (!(
               var10000 instanceof lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
         int var4 = Double.compare(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         );
         if (var2) {
            if (var4 != 0) {
               return false;
            }

            var4 = Double.compare(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
         }

         if (var2) {
            if (var4 != 0) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
         pxClinit: {
         String[] var5 = new String[2];
         int var3 = 0;
         String var2 = "\u0080R\u001e0pÈA+\u0088þf\u0084\u0082\"\u00998\u00136\u0019r\b~,]Û®pñ)";
         int var4 = "\u0080R\u001e0pÈA+\u0088þf\u0084\u0082\"\u00998\u00136\u0019r\b~,]Û®pñ)".length();
         char var1 = 20;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 60;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 60;
                  var10006 = var6;
               } else {
                  var13 = 60;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 60;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 103;
                     case 1 -> 127;
                     case 2 -> 1;
                     case 3 -> 79;
                     case 4 -> 38;
                     case 5 -> 80;
                     default -> 117;
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
         int var2 = (var0 ^ 20503) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 31;
               case 1 -> 134;
               case 2 -> 2;
               case 3 -> 80;
               case 4 -> 130;
               case 5 -> 13;
               case 6 -> 70;
               case 7 -> 150;
               case 8 -> 171;
               case 9 -> 156;
               case 10 -> 82;
               case 11 -> 93;
               case 12 -> 200;
               case 13 -> 52;
               case 14 -> 250;
               case 15 -> 208;
               case 16 -> 96;
               case 17 -> 247;
               case 18 -> 217;
               case 19 -> 120;
               case 20 -> 41;
               case 21 -> 116;
               case 22 -> 167;
               case 23 -> 158;
               case 24 -> 211;
               case 25 -> 8;
               case 26 -> 255;
               case 27 -> 58;
               case 28 -> 146;
               case 29 -> 225;
               case 30 -> 220;
               case 31 -> 33;
               case 32 -> 107;
               case 33 -> 168;
               case 34 -> 46;
               case 35 -> 111;
               case 36 -> 103;
               case 37 -> 44;
               case 38 -> 253;
               case 39 -> 123;
               case 40 -> 215;
               case 41 -> 101;
               case 42 -> 135;
               case 43 -> 72;
               case 44 -> 239;
               case 45 -> 186;
               case 46 -> 66;
               case 47 -> 75;
               case 48 -> 14;
               case 49 -> 65;
               case 50 -> 26;
               case 51 -> 236;
               case 52 -> 37;
               case 53 -> 165;
               case 54 -> 59;
               case 55 -> 30;
               case 56 -> 98;
               case 57 -> 161;
               case 58 -> 234;
               case 59 -> 233;
               case 60 -> 86;
               case 61 -> 48;
               case 62 -> 110;
               case 63 -> 214;
               case 64 -> 177;
               case 65 -> 174;
               case 66 -> 7;
               case 67 -> 221;
               case 68 -> 131;
               case 69 -> 121;
               case 70 -> 227;
               case 71 -> 197;
               case 72 -> 122;
               case 73 -> 54;
               case 74 -> 138;
               case 75 -> 0;
               case 76 -> 87;
               case 77 -> 228;
               case 78 -> 204;
               case 79 -> 28;
               case 80 -> 56;
               case 81 -> 128;
               case 82 -> 184;
               case 83 -> 166;
               case 84 -> 244;
               case 85 -> 77;
               case 86 -> 155;
               case 87 -> 170;
               case 88 -> 202;
               case 89 -> 51;
               case 90 -> 164;
               case 91 -> 106;
               case 92 -> 57;
               case 93 -> 12;
               case 94 -> 129;
               case 95 -> 9;
               case 96 -> 118;
               case 97 -> 223;
               case 98 -> 148;
               case 99 -> 176;
               case 100 -> 151;
               case 101 -> 201;
               case 102 -> 198;
               case 103 -> 147;
               case 104 -> 248;
               case 105 -> 136;
               case 106 -> 143;
               case 107 -> 34;
               case 108 -> 84;
               case 109 -> 35;
               case 110 -> 230;
               case 111 -> 39;
               case 112 -> 183;
               case 113 -> 32;
               case 114 -> 69;
               case 115 -> 68;
               case 116 -> 180;
               case 117 -> 76;
               case 118 -> 246;
               case 119 -> 55;
               case 120 -> 49;
               case 121 -> 194;
               case 122 -> 126;
               case 123 -> 114;
               case 124 -> 182;
               case 125 -> 173;
               case 126 -> 40;
               case 127 -> 125;
               case 128 -> 99;
               case 129 -> 187;
               case 130 -> 25;
               case 131 -> 115;
               case 132 -> 209;
               case 133 -> 195;
               case 134 -> 142;
               case 135 -> 152;
               case 136 -> 117;
               case 137 -> 189;
               case 138 -> 235;
               case 139 -> 112;
               case 140 -> 219;
               case 141 -> 60;
               case 142 -> 249;
               case 143 -> 109;
               case 144 -> 6;
               case 145 -> 11;
               case 146 -> 224;
               case 147 -> 47;
               case 148 -> 71;
               case 149 -> 229;
               case 150 -> 178;
               case 151 -> 181;
               case 152 -> 102;
               case 153 -> 238;
               case 154 -> 210;
               case 155 -> 196;
               case 156 -> 157;
               case 157 -> 175;
               case 158 -> 16;
               case 159 -> 36;
               case 160 -> 1;
               case 161 -> 50;
               case 162 -> 141;
               case 163 -> 145;
               case 164 -> 237;
               case 165 -> 191;
               case 166 -> 192;
               case 167 -> 95;
               case 168 -> 45;
               case 169 -> 79;
               case 170 -> 137;
               case 171 -> 226;
               case 172 -> 19;
               case 173 -> 240;
               case 174 -> 252;
               case 175 -> 153;
               case 176 -> 61;
               case 177 -> 92;
               case 178 -> 241;
               case 179 -> 199;
               case 180 -> 213;
               case 181 -> 124;
               case 182 -> 104;
               case 183 -> 140;
               case 184 -> 88;
               case 185 -> 169;
               case 186 -> 105;
               case 187 -> 206;
               case 188 -> 232;
               case 189 -> 43;
               case 190 -> 83;
               case 191 -> 163;
               case 192 -> 38;
               case 193 -> 4;
               case 194 -> 3;
               case 195 -> 20;
               case 196 -> 29;
               case 197 -> 193;
               case 198 -> 243;
               case 199 -> 222;
               case 200 -> 216;
               case 201 -> 245;
               case 202 -> 179;
               case 203 -> 139;
               case 204 -> 190;
               case 205 -> 254;
               case 206 -> 97;
               case 207 -> 53;
               case 208 -> 133;
               case 209 -> 113;
               case 210 -> 62;
               case 211 -> 94;
               case 212 -> 218;
               case 213 -> 144;
               case 214 -> 22;
               case 215 -> 91;
               case 216 -> 21;
               case 217 -> 119;
               case 218 -> 251;
               case 219 -> 159;
               case 220 -> 67;
               case 221 -> 42;
               case 222 -> 205;
               case 223 -> 89;
               case 224 -> 15;
               case 225 -> 231;
               case 226 -> 24;
               case 227 -> 162;
               case 228 -> 5;
               case 229 -> 127;
               case 230 -> 172;
               case 231 -> 74;
               case 232 -> 63;
               case 233 -> 132;
               case 234 -> 149;
               case 235 -> 160;
               case 236 -> 27;
               case 237 -> 10;
               case 238 -> 242;
               case 239 -> 207;
               case 240 -> 212;
               case 241 -> 17;
               case 242 -> 108;
               case 243 -> 73;
               case 244 -> 18;
               case 245 -> 203;
               case 246 -> 188;
               case 247 -> 78;
               case 248 -> 154;
               case 249 -> 81;
               case 250 -> 23;
               case 251 -> 64;
               case 252 -> 90;
               case 253 -> 85;
               case 254 -> 100;
               default -> 185;
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
   
    public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var0, double var1, double var2, int var3, Object var4) {
       if ((var3 & 1) != 0) {
          var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
       }
       if ((var3 & 2) != 0) {
          var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
       }
       return var0.a(var1, var2);
    }}

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private static boolean IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI a() {
         return lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll;
      }

      public static void b(boolean var0) {
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var0;
      }

      public static boolean b() {
         return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public static boolean c() {
         boolean var0 = b();
         return !var0;
      }

      static {
         if (b()) {
            b(true);
         }
      }
   }

  // PX-FIX synth restored from jar bytecode
  public static final me.octo.client.lIIllIIllllIIlIIIIIIIIIIIlIIIlIlIIlIlllIllIlIlIIIlIlIlIlIIllIllIIlIIIIlllllIllIllIllI bf() { return IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll; }
}
