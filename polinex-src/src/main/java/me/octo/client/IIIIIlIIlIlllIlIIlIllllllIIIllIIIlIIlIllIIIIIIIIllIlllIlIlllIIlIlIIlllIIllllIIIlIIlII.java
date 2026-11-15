package me.octo.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket.Action;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIIIIlIIlIlllIlIIlIllllllIIIllIIIlIIlIllIIIIIIIIllIlllIlIlllIIlIlIIlllIIllllIIIlIIlII
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static IIIIIlIIlIlllIlIIlIllllllIIIllIIIlIIlIllIIIIIIIIllIlllIlIlllIIlIlIIlllIIllllIIIlIIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @Nullable
   private BlockPos lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private List<IIIIIlIIlIlllIlIIlIllllllIIIllIIIlIIlIllIIIIIIIIllIlllIlIlllIIlIlIIlllIIllllIIIlIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @JvmField
   @NotNull
   public static IIIIIlIIlIlllIlIIlIllllllIIIllIIIlIIlIllIIIIIIIIllIlllIlIlllIIlIlIIlllIIllllIIIlIIlII llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static String[] f;
   private static String[] g;

   private IIIIIlIIlIlllIlIIlIllllllIIIllIIIlIIlIllIIIIIIIIllIlllIlIlllIIlIlIIlllIIllllIIIlIIlII() {
      short var10001 = -18723;
      short var10002 = 28859;
      var10002 = -18727;
      short var10003 = -28635;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      short var10004 = -18725;
      short var10005 = 24112;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         lllllIIllIlllIIIlIlIlllIIllllIlIllllIlIllIIllIIlllIllIIlIlllIllllIIIlllIlIlIIIlIIlIIl.a(),
         lllllIIllIlllIIIlIlIlllIIllllIlIllllIlIllIIllIIlllIllIIlIlllIllllIIIlllIlIlIIIlIIlIIl.b()
      };
      super("Pingless CH Gold", "Makes Mining Gold Blocks in the CH Pingless when an MSB is active.", var3, "Crystal Hollows", var1);
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new ArrayList<>();
   }

   @NotNull
   public final List<IIIIIlIIlIlllIlIIlIllllllIIIllIIIlIIlIllIIIIIIIIllIlllIlIlllIIlIlIIlllIIllllIIIlIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> ag() {
      return this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI var1) {
      short var10001 = -18726;
      short var10002 = 17459;
      Intrinsics.checkNotNullParameter(var1, "event");
      Packet var2 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      if (var2 instanceof ServerboundPlayerActionPacket) {
         if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g()
            != IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
            )
          {
            return;
         }

         if (((ServerboundPlayerActionPacket)var2).getAction() == Action.START_DESTROY_BLOCK) {
            this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = ((ServerboundPlayerActionPacket)var2).getPos();
            this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.f();
         }
      }
   }

   @SubscribeEvent
   public final void a(@NotNull llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII var1) {
      int[] var2;
      BlockPos var5;
      BlockState var7;
      int var16;
      label88: {
         int[] var10000 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
         short var10002 = -18721;
         short var10003 = 22164;
         Intrinsics.checkNotNullParameter(var1, "event");
         var2 = var10000;
         if (var2 != null && this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl != null) {
            var5 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
            boolean var6 = false;
            ClientLevel var13 = this.ap().level;
            Intrinsics.checkNotNull(var13);
            BlockState var14 = var13.getBlockState(var5);
            var10002 = -18728;
            var10003 = 20070;
            Intrinsics.checkNotNullExpressionValue(var14, "getBlockState(...)");
            var7 = var14;
            Block var15 = var7.getBlock();
            var10002 = -18722;
            var10003 = 1224;
            Intrinsics.checkNotNullExpressionValue(var15, "getBlock(...)");
            Block var8 = var15;
            label64:
            if (var2 != null) {
               label73: {
                  if (Intrinsics.areEqual(var8, Blocks.GOLD_BLOCK)) {
                     var16 = ((java.util.function.Supplier<Integer>)(() -> { this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.a(1); return 0; })).get();
                     if (var2 == null) {
                        break label88;
                     }

                     if ((var16 != 0)) {
                        break label73;
                     }

                     var16 = ((me.octo.client.PXDyn)(Object)(lllllIIllIlllIIIlIlIlllIIllllIlIllllIlIllIIllIIlllIllIIlIlllIllllIIIlllIlIlIIIlIIlIIl.a())).al();
                     if (var2 == null) {
                        break label88;
                     }

                     if ((var16 == 0)) {
                        break label73;
                     }
                  }
                  break label64;
               }

               var16 = ((me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .m()) ? 1 : 0);
               break label88;
            }
         }

         long var3 = System.currentTimeMillis();
         List var9 = new ArrayList();
         Iterator var10 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.iterator();

         label57:
         while (true) {
            var16 = ((var10.hasNext()) ? 1 : 0);

            while (var16 != 0) {
               IIIIIlIIlIlllIlIIlIllllllIIIllIIIlIIlIllIIIIIIIIllIlllIlIlllIIlIlIIlllIIllllIIIlIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var11 = (IIIIIlIIlIlllIlIIlIllllllIIIllIIIlIIlIllIIIIIIIIllIlllIlIlllIIlIlIIlllIIllllIIIlIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10.next();
               long var29;
               var16 = (var29 = var3 - (Long)var11.c() - ((Long)((me.octo.client.PXDyn)(Object)(lllllIIllIlllIIIlIlIlllIIllllIlIllllIlIllIIllIIlllIllIIlIlllIllllIIIlllIlIlIIIlIIlIIl.b())).M())) == 0L
                  ? 0
                  : (var29 < 0L ? -1 : 1);
               if (var2 == null) {
                  return;
               }

               if (var2 != null) {
                  if (var16 < 0) {
                     continue label57;
                  }

                  ClientLevel var18 = this.ap().level;
                  Intrinsics.checkNotNull(var18);
                  BlockState var19 = var18.getBlockState(var11.a());
                  var10002 = -18724;
                  var10003 = 28960;
                  Intrinsics.checkNotNullExpressionValue(var19, "getBlockState(...)");
                  BlockState var12 = var19;
                  boolean var20 = Intrinsics.areEqual(var12.getBlock(), Blocks.AIR);
                  if (var2 != null) {
                     if (!var20) {
                        ClientLevel var21 = this.ap().level;
                        Intrinsics.checkNotNull(var21);
                        var21.setBlock(var11.a(), var11.b(), 3);
                     }

                     var9.add(var11);
                  }

                  if (var2 != null) {
                     continue label57;
                  }
                  break;
               }
            }

            this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.removeAll(var9);
            return;
         }
      }

      if (var2 != null) {
         if ((var16 == 0)) {
            return;
         }

         this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
            .add(
               new IIIIIlIIlIlllIlIIlIllllllIIIllIIIlIIlIllIIIIIIIIllIlllIlIlllIIlIlIIlllIIllllIIIlIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                  var5, var7, System.currentTimeMillis()
               )
            );
         ClientLevel var22 = this.ap().level;
         Intrinsics.checkNotNull(var22);
         var22.setBlock(var5, Blocks.AIR.defaultBlockState(), 3);
      }

      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = null;
   }

   @Override
   public void aC() {
      super.aC();
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.clear();
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = null;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[8];
      int var3 = 0;
      String var2 = "\u0099Áö\u0015\u0010ª*\u008dkm\"¯¾Ý\u0093\u0005\u0090Ë)ÍtB`\u008e\u0014\u009b\u001bî\u008d%¼\u001e8\fðóà:mäë ¦#º\u008f\u0013i\\÷é55\u0081À(\u00ad¡\u007f\u0097®ÑO\u0016æx!!4[Ñ\u001c÷yr´\u009c1Eö[ÀÀUÀ\u0093¾s\u0012%\u0010Ìëãl@ÑÓß@\u0099T_ØoIM\u0005\u0006\bûµ.\r¹(_ì\u0091\u008c\u000eÍa\u0006Mé\u001f";
      int var4 = "\u0099Áö\u0015\u0010ª*\u008dkm\"¯¾Ý\u0093\u0005\u0090Ë)ÍtB`\u008e\u0014\u009b\u001bî\u008d%¼\u001e8\fðóà:mäë ¦#º\u008f\u0013i\\÷é55\u0081À(\u00ad¡\u007f\u0097®ÑO\u0016æx!!4[Ñ\u001c÷yr´\u009c1Eö[ÀÀUÀ\u0093¾s\u0012%\u0010Ìëãl@ÑÓß@\u0099T_ØoIM\u0005\u0006\bûµ.\r¹(_ì\u0091\u008c\u000eÍa\u0006Mé\u001f"
         .length();
      char var1 = 15;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 15;
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
                     case 0 -> 25;
                     case 1 -> 70;
                     case 2 -> 90;
                     case 3 -> 68;
                     case 4 -> 73;
                     case 5 -> 18;
                     default -> 121;
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
                     g = new String[8];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IIIIIlIIlIlllIlIIlIllllllIIIllIIIlIIlIllIIIIIIIIllIlllIlIlllIIlIlIIlllIIllllIIIlIIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (Object) null
                     );
                     llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new IIIIIlIIlIlllIlIIlIllllllIIIllIIIlIIlIllIIIIIIIIllIlllIlIlllIIlIlIIlllIIllllIIIlIIlII();
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

                  var2 = "\u0096¯ð5¼½:9|o\u0000\u008bó\u0005\u0089@\u0012.Â,0~\u0096r\u000f\u0014\u00859Sú\u0087\u008cõB\u009f";
                  var4 = "\u0096¯ð5¼½:9|o\u0000\u008bó\u0005\u0089@\u0012.Â,0~\u0096r\u000f\u0014\u00859Sú\u0087\u008cõB\u009f".length();
                  var1 = 16;
                  var8 = -1;
            }

            var10000 = 42;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -18725) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 143;
            case 1 -> 129;
            case 2 -> 187;
            case 3 -> 46;
            case 4 -> 95;
            case 5 -> 88;
            case 6 -> 136;
            case 7 -> 185;
            case 8 -> 57;
            case 9 -> 213;
            case 10 -> 1;
            case 11 -> 216;
            case 12 -> 34;
            case 13 -> 239;
            case 14 -> 167;
            case 15 -> 245;
            case 16 -> 31;
            case 17 -> 228;
            case 18 -> 180;
            case 19 -> 174;
            case 20 -> 35;
            case 21 -> 146;
            case 22 -> 120;
            case 23 -> 148;
            case 24 -> 244;
            case 25 -> 33;
            case 26 -> 45;
            case 27 -> 222;
            case 28 -> 77;
            case 29 -> 166;
            case 30 -> 29;
            case 31 -> 103;
            case 32 -> 179;
            case 33 -> 142;
            case 34 -> 205;
            case 35 -> 214;
            case 36 -> 175;
            case 37 -> 188;
            case 38 -> 112;
            case 39 -> 48;
            case 40 -> 226;
            case 41 -> 183;
            case 42 -> 186;
            case 43 -> 114;
            case 44 -> 181;
            case 45 -> 254;
            case 46 -> 105;
            case 47 -> 71;
            case 48 -> 24;
            case 49 -> 255;
            case 50 -> 97;
            case 51 -> 18;
            case 52 -> 190;
            case 53 -> 83;
            case 54 -> 169;
            case 55 -> 11;
            case 56 -> 199;
            case 57 -> 230;
            case 58 -> 7;
            case 59 -> 249;
            case 60 -> 63;
            case 61 -> 124;
            case 62 -> 243;
            case 63 -> 53;
            case 64 -> 224;
            case 65 -> 223;
            case 66 -> 132;
            case 67 -> 157;
            case 68 -> 215;
            case 69 -> 2;
            case 70 -> 4;
            case 71 -> 81;
            case 72 -> 236;
            case 73 -> 164;
            case 74 -> 36;
            case 75 -> 156;
            case 76 -> 178;
            case 77 -> 237;
            case 78 -> 20;
            case 79 -> 141;
            case 80 -> 191;
            case 81 -> 26;
            case 82 -> 194;
            case 83 -> 118;
            case 84 -> 13;
            case 85 -> 61;
            case 86 -> 128;
            case 87 -> 144;
            case 88 -> 108;
            case 89 -> 101;
            case 90 -> 140;
            case 91 -> 212;
            case 92 -> 54;
            case 93 -> 137;
            case 94 -> 25;
            case 95 -> 115;
            case 96 -> 98;
            case 97 -> 86;
            case 98 -> 37;
            case 99 -> 5;
            case 100 -> 231;
            case 101 -> 171;
            case 102 -> 111;
            case 103 -> 202;
            case 104 -> 133;
            case 105 -> 79;
            case 106 -> 76;
            case 107 -> 201;
            case 108 -> 206;
            case 109 -> 247;
            case 110 -> 204;
            case 111 -> 39;
            case 112 -> 42;
            case 113 -> 189;
            case 114 -> 125;
            case 115 -> 200;
            case 116 -> 59;
            case 117 -> 123;
            case 118 -> 234;
            case 119 -> 17;
            case 120 -> 232;
            case 121 -> 207;
            case 122 -> 134;
            case 123 -> 225;
            case 124 -> 176;
            case 125 -> 240;
            case 126 -> 168;
            case 127 -> 106;
            case 128 -> 127;
            case 129 -> 197;
            case 130 -> 184;
            case 131 -> 149;
            case 132 -> 122;
            case 133 -> 6;
            case 134 -> 80;
            case 135 -> 196;
            case 136 -> 110;
            case 137 -> 19;
            case 138 -> 152;
            case 139 -> 119;
            case 140 -> 221;
            case 141 -> 27;
            case 142 -> 84;
            case 143 -> 100;
            case 144 -> 41;
            case 145 -> 193;
            case 146 -> 219;
            case 147 -> 233;
            case 148 -> 91;
            case 149 -> 49;
            case 150 -> 99;
            case 151 -> 38;
            case 152 -> 47;
            case 153 -> 246;
            case 154 -> 82;
            case 155 -> 89;
            case 156 -> 14;
            case 157 -> 12;
            case 158 -> 55;
            case 159 -> 94;
            case 160 -> 43;
            case 161 -> 218;
            case 162 -> 135;
            case 163 -> 74;
            case 164 -> 150;
            case 165 -> 198;
            case 166 -> 117;
            case 167 -> 160;
            case 168 -> 209;
            case 169 -> 90;
            case 170 -> 138;
            case 171 -> 113;
            case 172 -> 75;
            case 173 -> 70;
            case 174 -> 126;
            case 175 -> 0;
            case 176 -> 116;
            case 177 -> 130;
            case 178 -> 96;
            case 179 -> 87;
            case 180 -> 15;
            case 181 -> 235;
            case 182 -> 159;
            case 183 -> 165;
            case 184 -> 241;
            case 185 -> 93;
            case 186 -> 162;
            case 187 -> 62;
            case 188 -> 147;
            case 189 -> 145;
            case 190 -> 238;
            case 191 -> 154;
            case 192 -> 58;
            case 193 -> 30;
            case 194 -> 3;
            case 195 -> 131;
            case 196 -> 161;
            case 197 -> 32;
            case 198 -> 10;
            case 199 -> 208;
            case 200 -> 67;
            case 201 -> 52;
            case 202 -> 40;
            case 203 -> 170;
            case 204 -> 163;
            case 205 -> 65;
            case 206 -> 153;
            case 207 -> 220;
            case 208 -> 252;
            case 209 -> 21;
            case 210 -> 217;
            case 211 -> 92;
            case 212 -> 172;
            case 213 -> 250;
            case 214 -> 68;
            case 215 -> 177;
            case 216 -> 8;
            case 217 -> 182;
            case 218 -> 85;
            case 219 -> 227;
            case 220 -> 195;
            case 221 -> 66;
            case 222 -> 242;
            case 223 -> 211;
            case 224 -> 210;
            case 225 -> 51;
            case 226 -> 60;
            case 227 -> 203;
            case 228 -> 248;
            case 229 -> 104;
            case 230 -> 192;
            case 231 -> 44;
            case 232 -> 23;
            case 233 -> 16;
            case 234 -> 121;
            case 235 -> 229;
            case 236 -> 22;
            case 237 -> 56;
            case 238 -> 102;
            case 239 -> 78;
            case 240 -> 173;
            case 241 -> 9;
            case 242 -> 64;
            case 243 -> 139;
            case 244 -> 107;
            case 245 -> 251;
            case 246 -> 72;
            case 247 -> 151;
            case 248 -> 69;
            case 249 -> 28;
            case 250 -> 253;
            case 251 -> 50;
            case 252 -> 109;
            case 253 -> 73;
            case 254 -> 155;
            default -> 158;
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

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      @NotNull
      private final BlockPos IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final BlockState lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(@NotNull BlockPos var1, @NotNull BlockState var2, long var3) {
         short var10001 = 22240;
         short var10002 = -16736;
         Intrinsics.checkNotNullParameter(var1, "pos");
         var10001 = 22242;
         var10002 = 31855;
         Intrinsics.checkNotNullParameter(var2, "originalState");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      }

      @NotNull
      public final BlockPos a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final BlockState b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final long c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final BlockPos d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final BlockState e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final long f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final IIIIIlIIlIlllIlIIlIllllllIIIllIIIlIIlIllIIIIIIIIllIlllIlIlllIIlIlIIlllIIllllIIIlIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         @NotNull BlockPos var1, @NotNull BlockState var2, long var3
      ) {
         short var10001 = 22243;
         short var10002 = -2720;
         Intrinsics.checkNotNullParameter(var1, "pos");
         var10001 = 22244;
         var10002 = -18471;
         Intrinsics.checkNotNullParameter(var2, "originalState");
         return new IIIIIlIIlIlllIlIIlIllllllIIIllIIIlIIlIllIIIIIIIIllIlllIlIlllIIlIlIIlllIIllllIIIlIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 22246;
         long var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         BlockState var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         BlockPos var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 27447;
         short var10002 = 22245;
         short var10003 = -30784;
         short var10004 = 22241;
         short var10005 = 9160;
         return "MinedBlock(pos=" + var4 + ", originalState=" + var3 + ", minedTime=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         var1 = var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
         return var1 * 31 + Long.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int[] var2 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof IIIIIlIIlIlllIlIIlIllllllIIIllIIIlIIlIllIIIIIIIIllIlllIlIlllIIlIlIIlllIIllllIIIlIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = var1;
         }

         IIIIIlIIlIlllIlIIlIllllllIIIllIIIlIIlIllIIIIIIIIllIlllIlIlllIIlIlIIlllIIllllIIIlIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (IIIIIlIIlIlllIlIIlIllllllIIIllIIIlIIlIllIIIIIIIIllIlllIlIlllIIlIlIIlllIIllllIIIlIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
         int var4 = ((Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )) ? 1 : 0);
         if (var2 != null) {
            if ((var4 == 0)) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if ((var4 == 0)) {
               return false;
            }

            long var5;
            var4 = (
                     var5 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        - var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                  )
                  == 0L
               ? 0
               : (var5 < 0L ? -1 : 1);
         }

         if (var2 != null) {
            if ((var4 != 0)) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[7];
         int var3 = 0;
         String var2 = "»È\u0017\f\u001bþÊpì½\u000f)áûÿ\u0099\r*,Ã<Nð¹Ò¨¢¯ÁO\u0003Ø^{\r\u0081p¶·à\u0081lü\u0012gøy¥";
         int var4 = "»È\u0017\f\u001bþÊpì½\u000f)áûÿ\u0099\r*,Ã<Nð¹Ò¨¢¯ÁO\u0003Ø^{\r\u0081p¶·à\u0081lü\u0012gøy¥".length();
         char var1 = 3;
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
                        case 0 -> 18;
                        case 1 -> 28;
                        case 2 -> 59;
                        case 3 -> 117;
                        case 4 -> 104;
                        case 5 -> 40;
                        default -> 76;
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
                        b = new String[7];
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

                     var2 = "þ³ö@¬Co\fË¡\u00078¨^¼\u000f\u000f\u0083\u009d\u0015òüÅÌ\\\u0018\u008dD^Ú\u0011e";
                     var4 = "þ³ö@¬Co\fË¡\u00078¨^¼\u000f\u000f\u0083\u009d\u0015òüÅÌ\\\u0018\u008dD^Ú\u0011e".length();
                     var1 = 16;
                     var8 = -1;
               }

               var10000 = 20;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 22240) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 114;
               case 1 -> 128;
               case 2 -> 144;
               case 3 -> 242;
               case 4 -> 53;
               case 5 -> 223;
               case 6 -> 166;
               case 7 -> 150;
               case 8 -> 21;
               case 9 -> 171;
               case 10 -> 74;
               case 11 -> 61;
               case 12 -> 208;
               case 13 -> 209;
               case 14 -> 162;
               case 15 -> 79;
               case 16 -> 100;
               case 17 -> 0;
               case 18 -> 210;
               case 19 -> 26;
               case 20 -> 108;
               case 21 -> 218;
               case 22 -> 29;
               case 23 -> 73;
               case 24 -> 212;
               case 25 -> 41;
               case 26 -> 60;
               case 27 -> 154;
               case 28 -> 198;
               case 29 -> 89;
               case 30 -> 101;
               case 31 -> 22;
               case 32 -> 161;
               case 33 -> 191;
               case 34 -> 5;
               case 35 -> 206;
               case 36 -> 13;
               case 37 -> 76;
               case 38 -> 124;
               case 39 -> 178;
               case 40 -> 182;
               case 41 -> 23;
               case 42 -> 52;
               case 43 -> 156;
               case 44 -> 133;
               case 45 -> 249;
               case 46 -> 229;
               case 47 -> 37;
               case 48 -> 139;
               case 49 -> 243;
               case 50 -> 30;
               case 51 -> 25;
               case 52 -> 239;
               case 53 -> 131;
               case 54 -> 145;
               case 55 -> 7;
               case 56 -> 126;
               case 57 -> 43;
               case 58 -> 185;
               case 59 -> 84;
               case 60 -> 143;
               case 61 -> 15;
               case 62 -> 237;
               case 63 -> 87;
               case 64 -> 226;
               case 65 -> 9;
               case 66 -> 251;
               case 67 -> 67;
               case 68 -> 81;
               case 69 -> 221;
               case 70 -> 110;
               case 71 -> 149;
               case 72 -> 224;
               case 73 -> 90;
               case 74 -> 220;
               case 75 -> 68;
               case 76 -> 201;
               case 77 -> 51;
               case 78 -> 12;
               case 79 -> 78;
               case 80 -> 222;
               case 81 -> 213;
               case 82 -> 65;
               case 83 -> 214;
               case 84 -> 167;
               case 85 -> 47;
               case 86 -> 31;
               case 87 -> 179;
               case 88 -> 123;
               case 89 -> 109;
               case 90 -> 158;
               case 91 -> 234;
               case 92 -> 151;
               case 93 -> 33;
               case 94 -> 205;
               case 95 -> 127;
               case 96 -> 40;
               case 97 -> 252;
               case 98 -> 255;
               case 99 -> 248;
               case 100 -> 153;
               case 101 -> 207;
               case 102 -> 180;
               case 103 -> 140;
               case 104 -> 91;
               case 105 -> 125;
               case 106 -> 58;
               case 107 -> 165;
               case 108 -> 183;
               case 109 -> 134;
               case 110 -> 176;
               case 111 -> 228;
               case 112 -> 113;
               case 113 -> 187;
               case 114 -> 106;
               case 115 -> 97;
               case 116 -> 103;
               case 117 -> 14;
               case 118 -> 244;
               case 119 -> 2;
               case 120 -> 200;
               case 121 -> 20;
               case 122 -> 148;
               case 123 -> 142;
               case 124 -> 186;
               case 125 -> 66;
               case 126 -> 105;
               case 127 -> 102;
               case 128 -> 3;
               case 129 -> 11;
               case 130 -> 17;
               case 131 -> 235;
               case 132 -> 59;
               case 133 -> 111;
               case 134 -> 247;
               case 135 -> 117;
               case 136 -> 96;
               case 137 -> 157;
               case 138 -> 138;
               case 139 -> 245;
               case 140 -> 217;
               case 141 -> 112;
               case 142 -> 86;
               case 143 -> 241;
               case 144 -> 147;
               case 145 -> 196;
               case 146 -> 70;
               case 147 -> 48;
               case 148 -> 69;
               case 149 -> 35;
               case 150 -> 189;
               case 151 -> 129;
               case 152 -> 204;
               case 153 -> 121;
               case 154 -> 80;
               case 155 -> 95;
               case 156 -> 62;
               case 157 -> 63;
               case 158 -> 238;
               case 159 -> 172;
               case 160 -> 44;
               case 161 -> 202;
               case 162 -> 118;
               case 163 -> 18;
               case 164 -> 170;
               case 165 -> 203;
               case 166 -> 163;
               case 167 -> 57;
               case 168 -> 34;
               case 169 -> 4;
               case 170 -> 92;
               case 171 -> 169;
               case 172 -> 24;
               case 173 -> 55;
               case 174 -> 75;
               case 175 -> 240;
               case 176 -> 174;
               case 177 -> 159;
               case 178 -> 72;
               case 179 -> 132;
               case 180 -> 192;
               case 181 -> 130;
               case 182 -> 188;
               case 183 -> 88;
               case 184 -> 232;
               case 185 -> 54;
               case 186 -> 27;
               case 187 -> 227;
               case 188 -> 137;
               case 189 -> 246;
               case 190 -> 146;
               case 191 -> 42;
               case 192 -> 168;
               case 193 -> 173;
               case 194 -> 120;
               case 195 -> 175;
               case 196 -> 215;
               case 197 -> 115;
               case 198 -> 1;
               case 199 -> 230;
               case 200 -> 19;
               case 201 -> 194;
               case 202 -> 36;
               case 203 -> 164;
               case 204 -> 77;
               case 205 -> 39;
               case 206 -> 99;
               case 207 -> 211;
               case 208 -> 195;
               case 209 -> 116;
               case 210 -> 254;
               case 211 -> 71;
               case 212 -> 181;
               case 213 -> 45;
               case 214 -> 94;
               case 215 -> 177;
               case 216 -> 135;
               case 217 -> 28;
               case 218 -> 38;
               case 219 -> 107;
               case 220 -> 199;
               case 221 -> 10;
               case 222 -> 98;
               case 223 -> 50;
               case 224 -> 190;
               case 225 -> 104;
               case 226 -> 119;
               case 227 -> 231;
               case 228 -> 32;
               case 229 -> 197;
               case 230 -> 85;
               case 231 -> 16;
               case 232 -> 82;
               case 233 -> 141;
               case 234 -> 122;
               case 235 -> 233;
               case 236 -> 160;
               case 237 -> 49;
               case 238 -> 136;
               case 239 -> 193;
               case 240 -> 219;
               case 241 -> 250;
               case 242 -> 152;
               case 243 -> 64;
               case 244 -> 83;
               case 245 -> 155;
               case 246 -> 46;
               case 247 -> 8;
               case 248 -> 236;
               case 249 -> 6;
               case 250 -> 253;
               case 251 -> 56;
               case 252 -> 216;
               case 253 -> 184;
               case 254 -> 225;
               default -> 93;
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
         public static me.octo.client.IIIIIlIIlIlllIlIIlIllllllIIIllIIIlIIlIllIIIIIIIIllIlllIlIlllIIlIlIIlllIIllllIIIlIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(me.octo.client.IIIIIlIIlIlllIlIIlIllllllIIIllIIIlIIlIllIIIIIIIIllIlllIlIlllIIlIlIIlllIIllllIIIlIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI p0, net.minecraft.core.BlockPos p1, net.minecraft.world.level.block.state.BlockState p2, long p3, int mask, java.lang.Object marker) {
         if ((mask & 1) != 0) { p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
         if ((mask & 2) != 0) { p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
         if ((mask & 4) != 0) { p3 = p0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl; }
         return p0.a(p1, p2, p3);
      }
}

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }
        // PX-FIX DCM: kotlin-synthesized <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
           this();
        }


      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }
}
