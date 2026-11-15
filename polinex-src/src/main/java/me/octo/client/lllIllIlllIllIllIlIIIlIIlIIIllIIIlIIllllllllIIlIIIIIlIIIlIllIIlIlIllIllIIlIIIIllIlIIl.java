package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.protocol.game.ClientboundLevelParticlesPacket;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl
   extends IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI {
    public static <T> T b(Object p0) { return null; } // PX-FIX mr4
    public static <T> T i(Object p0) { return null; } // PX-FIX mr3
    public static <T> T h(Object p0) { return null; } // PX-FIX mr3
   public static me.octo.client.PXDyn var18 = null; // PX-FIX missing field v2
   
   public static me.octo.client.PXDyn var20 = null; // PX-FIX missing field v2

   public Object receiver; // PX-FIX kotlin lambda receiver

   @NotNull
   public static lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI;
   @NotNull
   private final ConcurrentHashMap<BlockPos, lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll> lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
   private final Set<BlockPos> IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII;
   @NotNull
   private final List<BlockPos> llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
   private int lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
   @NotNull
   private final List<BlockPos> IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   private int lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
   @Nullable
   private lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
   @Nullable
   private volatile lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
   private volatile boolean lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
   @Nullable
   private Vec3 IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
   private int lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   private int IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
   private int IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
   @NotNull
   private static lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
   private static String[] h;
   private static String[] i;

   public lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl() {
      short var10001 = -12486;
      short var10002 = 25335;
      var10002 = -12496;
      short var10003 = -31416;
      me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var5 = me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      short var10004 = -12506;
      short var10005 = -31376;
      List var6 = CollectionsKt.emptyList();
      List var10006 = CollectionsKt.emptyList();
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         lIllIlIIIIIIlllllIllIlIIIlllIIIIIIIIIIlIllllIIlIIllIIIllIlIlIIIllllllllIIlIIIlllIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         lIllIlIIIIIIlllllIllIlIIIlllIIIIIIIIIIlIllllIIlIIllIIIllIlIlIIIllllllllIIlIIIlllIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b()
      };
      super("Glowing Mushroom Macro", "Automatically farms glowing mushrooms in the Glowing Mushroom Cave.", var5, "Foraging", var6, var10006, false, var1);
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = new ConcurrentHashMap<>();
      this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = Collections.synchronizedSet(new LinkedHashSet<>());
      this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      BlockPos[] var2 = new BlockPos[]{new BlockPos(252, 41, -568), new BlockPos(204, 41, -529), new BlockPos(202, 42, -451), new BlockPos(233, 53, -497)};
      this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl = CollectionsKt.listOf(var2);
      BlockPos[] var3 = new BlockPos[]{
         new BlockPos(180, 77, -436), new BlockPos(227, 75, -491), new BlockPos(241, 64, -544), new BlockPos(287, 44, -500), new BlockPos(266, 48, -491)
      };
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = CollectionsKt.listOf(var3);
   }

   @NotNull
   @Override
   protected lIIllIIlIllIIllIIlIIIIIlIlIlllIIIlllllllllIlIllIIIIlllllllllIlIllIIIlIlllllllIlllIlll aL() {
      return new lIIllIIlIllIIllIIlIIIIIlIlIlllIIIlllllllllIlIllIIIIlllllllllIlIllIIIlIlllllllIlllIlll(true, true, false, false, false, null, 60, null);
   }

   @Override
   protected void aD() {
      Object receiver = null; // PX-FIX
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var10000 = this;
      short var10001 = -12521;
      short var10002 = 730;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10000),
         "Glowing Mushroom travel",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         null,
         5000L,
         false,
         false,
         (kotlin.jvm.functions.Function1)(lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl::b),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = -3448;
                  short var10005 = -23471;
                  var10005 = -3445;
                  short var10006 = -32313;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001x = -3447;
                  short var10002x = -13857;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "\u0010S\u0013\u0014\u0081,µ\u008e3\u008b\u001aÁUûd$\u0095\u0095![\u0011\u001f|Ù£\u0095ñ¹»m\u000b\u001dw` W\u001dû0\u00963¦Ih©\u008a\u007f[\u0082\u0095Æ§\u001e÷\t¾\u0003\u009c,\u0007£@¼¨ìü\u00126Çªü\u008aÒzWK\"m?àM4\u0088ê\u0094§ß{öÏ3Y\u009cç9Ô#ÓE\u0001A\u008a\u0081Uy®T½\u0005\u001e\u0000¯ \u000fØn3H/\r\u009eÉy\u0090+~D5a\f  Ü´à\u007f¶F÷\u0081{K\"Ã;\u001c©";
                  int var4 = "\u0010S\u0013\u0014\u0081,µ\u008e3\u008b\u001aÁUûd$\u0095\u0095![\u0011\u001f|Ù£\u0095ñ¹»m\u000b\u001dw` W\u001dû0\u00963¦Ih©\u008a\u007f[\u0082\u0095Æ§\u001e÷\t¾\u0003\u009c,\u0007£@¼¨ìü\u00126Çªü\u008aÒzWK\"m?àM4\u0088ê\u0094§ß{öÏ3Y\u009cç9Ô#ÓE\u0001A\u008a\u0081Uy®T½\u0005\u001e\u0000¯ \u000fØn3H/\r\u009eÉy\u0090+~D5a\f  Ü´à\u007f¶F÷\u0081{K\"Ã;\u001c©"
                     .length();
                  char var1 = 2;
                  int var0 = -1;

                  while (true) {
                     char[] var10002x;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 6;
                        var10002x = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 6;
                           var10006 = var6;
                        } else {
                           var13 = 6;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 6;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 67;
                              case 1 -> 106;
                              case 2 -> 11;
                              case 3 -> 39;
                              case 4 -> 99;
                              case 5 -> 42;
                              default -> 92;
                           });
                           var6++;
                           if (var13 == 0) {
                              var10006 = var13;
                              var10005 = var10002x;
                              var16 = var13;
                           } else {
                              if (var8 <= var6) {
                                 break;
                              }

                              var10005 = var10002x;
                              var16 = var13;
                              var10006 = var6;
                           }
                        }
                     }

                     String var15 = new String(var10002x).intern();
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
                  int var2 = (var0 ^ -3447) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 122;
                        case 1 -> 237;
                        case 2 -> 103;
                        case 3 -> 165;
                        case 4 -> 132;
                        case 5 -> 28;
                        case 6 -> 117;
                        case 7 -> 116;
                        case 8 -> 168;
                        case 9 -> 93;
                        case 10 -> 185;
                        case 11 -> 74;
                        case 12 -> 187;
                        case 13 -> 228;
                        case 14 -> 60;
                        case 15 -> 170;
                        case 16 -> 238;
                        case 17 -> 209;
                        case 18 -> 21;
                        case 19 -> 9;
                        case 20 -> 30;
                        case 21 -> 161;
                        case 22 -> 169;
                        case 23 -> 194;
                        case 24 -> 17;
                        case 25 -> 147;
                        case 26 -> 217;
                        case 27 -> 255;
                        case 28 -> 140;
                        case 29 -> 215;
                        case 30 -> 232;
                        case 31 -> 29;
                        case 32 -> 20;
                        case 33 -> 64;
                        case 34 -> 92;
                        case 35 -> 242;
                        case 36 -> 66;
                        case 37 -> 159;
                        case 38 -> 124;
                        case 39 -> 104;
                        case 40 -> 128;
                        case 41 -> 134;
                        case 42 -> 233;
                        case 43 -> 138;
                        case 44 -> 164;
                        case 45 -> 252;
                        case 46 -> 152;
                        case 47 -> 157;
                        case 48 -> 82;
                        case 49 -> 245;
                        case 50 -> 45;
                        case 51 -> 148;
                        case 52 -> 205;
                        case 53 -> 225;
                        case 54 -> 172;
                        case 55 -> 32;
                        case 56 -> 1;
                        case 57 -> 179;
                        case 58 -> 146;
                        case 59 -> 219;
                        case 60 -> 136;
                        case 61 -> 133;
                        case 62 -> 48;
                        case 63 -> 145;
                        case 64 -> 244;
                        case 65 -> 206;
                        case 66 -> 68;
                        case 67 -> 77;
                        case 68 -> 65;
                        case 69 -> 181;
                        case 70 -> 197;
                        case 71 -> 178;
                        case 72 -> 54;
                        case 73 -> 72;
                        case 74 -> 150;
                        case 75 -> 135;
                        case 76 -> 229;
                        case 77 -> 43;
                        case 78 -> 57;
                        case 79 -> 12;
                        case 80 -> 204;
                        case 81 -> 24;
                        case 82 -> 127;
                        case 83 -> 126;
                        case 84 -> 184;
                        case 85 -> 186;
                        case 86 -> 115;
                        case 87 -> 241;
                        case 88 -> 247;
                        case 89 -> 38;
                        case 90 -> 39;
                        case 91 -> 175;
                        case 92 -> 158;
                        case 93 -> 58;
                        case 94 -> 3;
                        case 95 -> 195;
                        case 96 -> 120;
                        case 97 -> 4;
                        case 98 -> 248;
                        case 99 -> 216;
                        case 100 -> 70;
                        case 101 -> 144;
                        case 102 -> 79;
                        case 103 -> 100;
                        case 104 -> 220;
                        case 105 -> 214;
                        case 106 -> 208;
                        case 107 -> 210;
                        case 108 -> 240;
                        case 109 -> 33;
                        case 110 -> 26;
                        case 111 -> 2;
                        case 112 -> 108;
                        case 113 -> 46;
                        case 114 -> 213;
                        case 115 -> 200;
                        case 116 -> 25;
                        case 117 -> 198;
                        case 118 -> 125;
                        case 119 -> 84;
                        case 120 -> 110;
                        case 121 -> 162;
                        case 122 -> 31;
                        case 123 -> 88;
                        case 124 -> 75;
                        case 125 -> 139;
                        case 126 -> 254;
                        case 127 -> 56;
                        case 128 -> 174;
                        case 129 -> 223;
                        case 130 -> 90;
                        case 131 -> 44;
                        case 132 -> 166;
                        case 133 -> 193;
                        case 134 -> 41;
                        case 135 -> 76;
                        case 136 -> 85;
                        case 137 -> 118;
                        case 138 -> 221;
                        case 139 -> 250;
                        case 140 -> 141;
                        case 141 -> 61;
                        case 142 -> 176;
                        case 143 -> 14;
                        case 144 -> 91;
                        case 145 -> 42;
                        case 146 -> 234;
                        case 147 -> 27;
                        case 148 -> 196;
                        case 149 -> 235;
                        case 150 -> 78;
                        case 151 -> 52;
                        case 152 -> 105;
                        case 153 -> 23;
                        case 154 -> 251;
                        case 155 -> 129;
                        case 156 -> 211;
                        case 157 -> 167;
                        case 158 -> 51;
                        case 159 -> 114;
                        case 160 -> 190;
                        case 161 -> 73;
                        case 162 -> 160;
                        case 163 -> 53;
                        case 164 -> 222;
                        case 165 -> 188;
                        case 166 -> 81;
                        case 167 -> 107;
                        case 168 -> 212;
                        case 169 -> 121;
                        case 170 -> 203;
                        case 171 -> 137;
                        case 172 -> 236;
                        case 173 -> 199;
                        case 174 -> 230;
                        case 175 -> 10;
                        case 176 -> 35;
                        case 177 -> 253;
                        case 178 -> 19;
                        case 179 -> 22;
                        case 180 -> 40;
                        case 181 -> 154;
                        case 182 -> 89;
                        case 183 -> 231;
                        case 184 -> 249;
                        case 185 -> 202;
                        case 186 -> 15;
                        case 187 -> 207;
                        case 188 -> 47;
                        case 189 -> 246;
                        case 190 -> 0;
                        case 191 -> 239;
                        case 192 -> 113;
                        case 193 -> 189;
                        case 194 -> 13;
                        case 195 -> 67;
                        case 196 -> 8;
                        case 197 -> 191;
                        case 198 -> 153;
                        case 199 -> 55;
                        case 200 -> 177;
                        case 201 -> 94;
                        case 202 -> 80;
                        case 203 -> 49;
                        case 204 -> 83;
                        case 205 -> 62;
                        case 206 -> 106;
                        case 207 -> 69;
                        case 208 -> 180;
                        case 209 -> 226;
                        case 210 -> 37;
                        case 211 -> 224;
                        case 212 -> 123;
                        case 213 -> 111;
                        case 214 -> 192;
                        case 215 -> 182;
                        case 216 -> 102;
                        case 217 -> 155;
                        case 218 -> 34;
                        case 219 -> 156;
                        case 220 -> 6;
                        case 221 -> 99;
                        case 222 -> 59;
                        case 223 -> 183;
                        case 224 -> 101;
                        case 225 -> 131;
                        case 226 -> 130;
                        case 227 -> 112;
                        case 228 -> 227;
                        case 229 -> 143;
                        case 230 -> 97;
                        case 231 -> 151;
                        case 232 -> 218;
                        case 233 -> 95;
                        case 234 -> 63;
                        case 235 -> 36;
                        case 236 -> 96;
                        case 237 -> 98;
                        case 238 -> 243;
                        case 239 -> 16;
                        case 240 -> 5;
                        case 241 -> 7;
                        case 242 -> 201;
                        case 243 -> 149;
                        case 244 -> 171;
                        case 245 -> 173;
                        case 246 -> 163;
                        case 247 -> 86;
                        case 248 -> 109;
                        case 249 -> 87;
                        case 250 -> 71;
                        case 251 -> 119;
                        case 252 -> 142;
                        case 253 -> 18;
                        case 254 -> 11;
                        default -> 50;
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
                        char var10002x = var3[var7];
                        if (var8 == 0) {
                           var3[var7] = (char)(var10002x ^ var5);
                           var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
                        } else {
                           var3[var7] = (char)(var10002x ^ var6);
                           var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
                        }
                     }

                     b[var2] = new String(var3).intern();
                  }

                  return b[var2];
               }
            }
         ));
      String var2 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var4 = this;
      var10002 = -12503;
      short var10003 = -23119;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var4),
         "Glowing Mushroom setup",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
         35000L,
         0L,
         false,
         false,
         null,
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = 26261;
                  short var10005 = 24280;
                  var10005 = 26260;
                  short var10006 = 5282;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = 26263;
                  short var10002 = -22352;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "åpÈå\u0014\u007f\u008fñ\u0086ò}\u0096²\u009c%Ç\u0097£\u0080|þc«\u0087x3\u0002x7ÃK°tXý_\u008c°ã\u007f\u0097\r²12Mþh¨\fÌ%ßÀç6¯:;\u0089\u0081\u001d»ë\u0004\u0096ê\u0090Õ=Vp ÀV4åëN2£\u0085Ù\u009fs$ oò@ðeìÆÒ¿v|£ü\u001eÐ\u00816:\u008e4\u001fì\u00050\u000eN3\")\u0006\tÊL*ã/\u001bHèdKÃ§\u009eØXvx\u0081@ó$Qé\u008f79\u0002)g";
                  int var4 = "åpÈå\u0014\u007f\u008fñ\u0086ò}\u0096²\u009c%Ç\u0097£\u0080|þc«\u0087x3\u0002x7ÃK°tXý_\u008c°ã\u007f\u0097\r²12Mþh¨\fÌ%ßÀç6¯:;\u0089\u0081\u001d»ë\u0004\u0096ê\u0090Õ=Vp ÀV4åëN2£\u0085Ù\u009fs$ oò@ðeìÆÒ¿v|£ü\u001eÐ\u00816:\u008e4\u001fì\u00050\u000eN3\")\u0006\tÊL*ã/\u001bHèdKÃ§\u009eØXvx\u0081@ó$Qé\u008f79\u0002)g"
                     .length();
                  char var1 = 19;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 56;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 56;
                           var10006 = var6;
                        } else {
                           var13 = 56;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 56;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 122;
                              case 1 -> 124;
                              case 2 -> 15;
                              case 3 -> 114;
                              case 4 -> 28;
                              case 5 -> 63;
                              default -> 29;
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
                  int var2 = (var0 ^ 26261) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 10;
                        case 1 -> 106;
                        case 2 -> 234;
                        case 3 -> 242;
                        case 4 -> 30;
                        case 5 -> 201;
                        case 6 -> 135;
                        case 7 -> 52;
                        case 8 -> 53;
                        case 9 -> 193;
                        case 10 -> 126;
                        case 11 -> 74;
                        case 12 -> 215;
                        case 13 -> 40;
                        case 14 -> 127;
                        case 15 -> 89;
                        case 16 -> 165;
                        case 17 -> 32;
                        case 18 -> 117;
                        case 19 -> 101;
                        case 20 -> 48;
                        case 21 -> 223;
                        case 22 -> 241;
                        case 23 -> 47;
                        case 24 -> 175;
                        case 25 -> 107;
                        case 26 -> 169;
                        case 27 -> 5;
                        case 28 -> 219;
                        case 29 -> 213;
                        case 30 -> 138;
                        case 31 -> 44;
                        case 32 -> 198;
                        case 33 -> 110;
                        case 34 -> 63;
                        case 35 -> 160;
                        case 36 -> 96;
                        case 37 -> 121;
                        case 38 -> 229;
                        case 39 -> 184;
                        case 40 -> 192;
                        case 41 -> 60;
                        case 42 -> 164;
                        case 43 -> 109;
                        case 44 -> 152;
                        case 45 -> 232;
                        case 46 -> 129;
                        case 47 -> 35;
                        case 48 -> 238;
                        case 49 -> 88;
                        case 50 -> 11;
                        case 51 -> 155;
                        case 52 -> 182;
                        case 53 -> 51;
                        case 54 -> 14;
                        case 55 -> 128;
                        case 56 -> 187;
                        case 57 -> 85;
                        case 58 -> 1;
                        case 59 -> 25;
                        case 60 -> 168;
                        case 61 -> 252;
                        case 62 -> 68;
                        case 63 -> 199;
                        case 64 -> 22;
                        case 65 -> 38;
                        case 66 -> 4;
                        case 67 -> 150;
                        case 68 -> 64;
                        case 69 -> 98;
                        case 70 -> 233;
                        case 71 -> 71;
                        case 72 -> 124;
                        case 73 -> 43;
                        case 74 -> 17;
                        case 75 -> 195;
                        case 76 -> 239;
                        case 77 -> 224;
                        case 78 -> 104;
                        case 79 -> 120;
                        case 80 -> 90;
                        case 81 -> 36;
                        case 82 -> 8;
                        case 83 -> 185;
                        case 84 -> 222;
                        case 85 -> 42;
                        case 86 -> 102;
                        case 87 -> 39;
                        case 88 -> 131;
                        case 89 -> 255;
                        case 90 -> 115;
                        case 91 -> 33;
                        case 92 -> 65;
                        case 93 -> 249;
                        case 94 -> 209;
                        case 95 -> 72;
                        case 96 -> 45;
                        case 97 -> 108;
                        case 98 -> 220;
                        case 99 -> 250;
                        case 100 -> 221;
                        case 101 -> 189;
                        case 102 -> 176;
                        case 103 -> 146;
                        case 104 -> 54;
                        case 105 -> 31;
                        case 106 -> 203;
                        case 107 -> 149;
                        case 108 -> 133;
                        case 109 -> 142;
                        case 110 -> 180;
                        case 111 -> 171;
                        case 112 -> 112;
                        case 113 -> 153;
                        case 114 -> 78;
                        case 115 -> 245;
                        case 116 -> 247;
                        case 117 -> 57;
                        case 118 -> 144;
                        case 119 -> 225;
                        case 120 -> 231;
                        case 121 -> 161;
                        case 122 -> 211;
                        case 123 -> 181;
                        case 124 -> 151;
                        case 125 -> 186;
                        case 126 -> 61;
                        case 127 -> 218;
                        case 128 -> 18;
                        case 129 -> 67;
                        case 130 -> 58;
                        case 131 -> 114;
                        case 132 -> 0;
                        case 133 -> 24;
                        case 134 -> 21;
                        case 135 -> 23;
                        case 136 -> 20;
                        case 137 -> 105;
                        case 138 -> 77;
                        case 139 -> 200;
                        case 140 -> 92;
                        case 141 -> 37;
                        case 142 -> 191;
                        case 143 -> 111;
                        case 144 -> 178;
                        case 145 -> 83;
                        case 146 -> 170;
                        case 147 -> 56;
                        case 148 -> 251;
                        case 149 -> 197;
                        case 150 -> 66;
                        case 151 -> 230;
                        case 152 -> 99;
                        case 153 -> 177;
                        case 154 -> 183;
                        case 155 -> 29;
                        case 156 -> 148;
                        case 157 -> 81;
                        case 158 -> 130;
                        case 159 -> 12;
                        case 160 -> 216;
                        case 161 -> 210;
                        case 162 -> 95;
                        case 163 -> 204;
                        case 164 -> 139;
                        case 165 -> 97;
                        case 166 -> 82;
                        case 167 -> 9;
                        case 168 -> 147;
                        case 169 -> 49;
                        case 170 -> 59;
                        case 171 -> 123;
                        case 172 -> 143;
                        case 173 -> 76;
                        case 174 -> 94;
                        case 175 -> 73;
                        case 176 -> 141;
                        case 177 -> 188;
                        case 178 -> 6;
                        case 179 -> 100;
                        case 180 -> 235;
                        case 181 -> 134;
                        case 182 -> 28;
                        case 183 -> 207;
                        case 184 -> 80;
                        case 185 -> 212;
                        case 186 -> 214;
                        case 187 -> 55;
                        case 188 -> 206;
                        case 189 -> 27;
                        case 190 -> 3;
                        case 191 -> 240;
                        case 192 -> 122;
                        case 193 -> 202;
                        case 194 -> 190;
                        case 195 -> 159;
                        case 196 -> 118;
                        case 197 -> 157;
                        case 198 -> 243;
                        case 199 -> 254;
                        case 200 -> 50;
                        case 201 -> 103;
                        case 202 -> 244;
                        case 203 -> 179;
                        case 204 -> 156;
                        case 205 -> 116;
                        case 206 -> 2;
                        case 207 -> 41;
                        case 208 -> 75;
                        case 209 -> 236;
                        case 210 -> 113;
                        case 211 -> 69;
                        case 212 -> 226;
                        case 213 -> 34;
                        case 214 -> 167;
                        case 215 -> 196;
                        case 216 -> 154;
                        case 217 -> 227;
                        case 218 -> 119;
                        case 219 -> 174;
                        case 220 -> 7;
                        case 221 -> 86;
                        case 222 -> 62;
                        case 223 -> 13;
                        case 224 -> 158;
                        case 225 -> 15;
                        case 226 -> 46;
                        case 227 -> 145;
                        case 228 -> 132;
                        case 229 -> 166;
                        case 230 -> 237;
                        case 231 -> 208;
                        case 232 -> 93;
                        case 233 -> 125;
                        case 234 -> 19;
                        case 235 -> 217;
                        case 236 -> 205;
                        case 237 -> 87;
                        case 238 -> 162;
                        case 239 -> 248;
                        case 240 -> 194;
                        case 241 -> 163;
                        case 242 -> 84;
                        case 243 -> 246;
                        case 244 -> 26;
                        case 245 -> 79;
                        case 246 -> 91;
                        case 247 -> 172;
                        case 248 -> 137;
                        case 249 -> 228;
                        case 250 -> 16;
                        case 251 -> 140;
                        case 252 -> 253;
                        case 253 -> 136;
                        case 254 -> 70;
                        default -> 173;
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
         ));
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var5 = this;
      var10002 = -12512;
      var10003 = 1708;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var5),
         "Glowing Mushroom scan",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl,
         45000L,
         0L,
         false,
         false,
         null,
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = -6558;
                  short var10005 = 3229;
                  var10005 = -6560;
                  short var10006 = -23349;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = -6559;
                  short var10002 = -21248;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "\n\u0002\"HNÕ\u0002£ø¯Q:(Ïqb\nô4è«øú\u0098Ø\u007f¼èçÓ2=\u0007Ü:²Û½V~3%ê#9lJÐ\u00072Ã\u0086ñ\u0019cÉD\u009bmßÀ'sÌéY\u0010Çû\u0093ÖÐ?\u0093¯\n\u001fÍAÝ¡ói\u0094 \u0015`\u008fa\bG¨oðåVá 1¦B]%ÓÏö[\u009fÇ:\u0001\u00ad¬\u0017ñNv\u0015$\u008a&ã-³\u0002±ê\u0013\u00ad}Ö§Ð(Ñ\u001c\u0082X\u001eÄÁ\u0010L\u0099\u00ad\u008bÀ";
                  int var4 = "\n\u0002\"HNÕ\u0002£ø¯Q:(Ïqb\nô4è«øú\u0098Ø\u007f¼èçÓ2=\u0007Ü:²Û½V~3%ê#9lJÐ\u00072Ã\u0086ñ\u0019cÉD\u009bmßÀ'sÌéY\u0010Çû\u0093ÖÐ?\u0093¯\n\u001fÍAÝ¡ói\u0094 \u0015`\u008fa\bG¨oðåVá 1¦B]%ÓÏö[\u009fÇ:\u0001\u00ad¬\u0017ñNv\u0015$\u008a&ã-³\u0002±ê\u0013\u00ad}Ö§Ð(Ñ\u001c\u0082X\u001eÄÁ\u0010L\u0099\u00ad\u008bÀ"
                     .length();
                  char var1 = '|';
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 13;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 13;
                           var10006 = var6;
                        } else {
                           var13 = 13;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 13;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 39;
                              case 1 -> 79;
                              case 2 -> 32;
                              case 3 -> 100;
                              case 4 -> 109;
                              case 5 -> 113;
                              default -> 102;
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
                  int var2 = (var0 ^ -6560) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 251;
                        case 1 -> 60;
                        case 2 -> 207;
                        case 3 -> 250;
                        case 4 -> 88;
                        case 5 -> 188;
                        case 6 -> 199;
                        case 7 -> 94;
                        case 8 -> 123;
                        case 9 -> 64;
                        case 10 -> 47;
                        case 11 -> 59;
                        case 12 -> 197;
                        case 13 -> 171;
                        case 14 -> 243;
                        case 15 -> 160;
                        case 16 -> 57;
                        case 17 -> 235;
                        case 18 -> 55;
                        case 19 -> 196;
                        case 20 -> 33;
                        case 21 -> 231;
                        case 22 -> 226;
                        case 23 -> 2;
                        case 24 -> 79;
                        case 25 -> 214;
                        case 26 -> 221;
                        case 27 -> 7;
                        case 28 -> 72;
                        case 29 -> 44;
                        case 30 -> 204;
                        case 31 -> 228;
                        case 32 -> 131;
                        case 33 -> 31;
                        case 34 -> 152;
                        case 35 -> 233;
                        case 36 -> 198;
                        case 37 -> 73;
                        case 38 -> 90;
                        case 39 -> 15;
                        case 40 -> 85;
                        case 41 -> 26;
                        case 42 -> 3;
                        case 43 -> 154;
                        case 44 -> 81;
                        case 45 -> 165;
                        case 46 -> 108;
                        case 47 -> 181;
                        case 48 -> 203;
                        case 49 -> 167;
                        case 50 -> 118;
                        case 51 -> 209;
                        case 52 -> 113;
                        case 53 -> 144;
                        case 54 -> 184;
                        case 55 -> 37;
                        case 56 -> 70;
                        case 57 -> 202;
                        case 58 -> 164;
                        case 59 -> 46;
                        case 60 -> 255;
                        case 61 -> 14;
                        case 62 -> 246;
                        case 63 -> 177;
                        case 64 -> 56;
                        case 65 -> 134;
                        case 66 -> 201;
                        case 67 -> 173;
                        case 68 -> 50;
                        case 69 -> 157;
                        case 70 -> 20;
                        case 71 -> 119;
                        case 72 -> 170;
                        case 73 -> 36;
                        case 74 -> 211;
                        case 75 -> 66;
                        case 76 -> 93;
                        case 77 -> 99;
                        case 78 -> 69;
                        case 79 -> 223;
                        case 80 -> 224;
                        case 81 -> 106;
                        case 82 -> 206;
                        case 83 -> 40;
                        case 84 -> 137;
                        case 85 -> 12;
                        case 86 -> 225;
                        case 87 -> 71;
                        case 88 -> 86;
                        case 89 -> 158;
                        case 90 -> 190;
                        case 91 -> 32;
                        case 92 -> 122;
                        case 93 -> 169;
                        case 94 -> 245;
                        case 95 -> 35;
                        case 96 -> 189;
                        case 97 -> 212;
                        case 98 -> 38;
                        case 99 -> 58;
                        case 100 -> 24;
                        case 101 -> 127;
                        case 102 -> 143;
                        case 103 -> 139;
                        case 104 -> 172;
                        case 105 -> 142;
                        case 106 -> 76;
                        case 107 -> 65;
                        case 108 -> 34;
                        case 109 -> 232;
                        case 110 -> 149;
                        case 111 -> 185;
                        case 112 -> 30;
                        case 113 -> 61;
                        case 114 -> 114;
                        case 115 -> 102;
                        case 116 -> 151;
                        case 117 -> 191;
                        case 118 -> 217;
                        case 119 -> 147;
                        case 120 -> 1;
                        case 121 -> 166;
                        case 122 -> 42;
                        case 123 -> 135;
                        case 124 -> 145;
                        case 125 -> 195;
                        case 126 -> 159;
                        case 127 -> 25;
                        case 128 -> 249;
                        case 129 -> 186;
                        case 130 -> 104;
                        case 131 -> 133;
                        case 132 -> 239;
                        case 133 -> 120;
                        case 134 -> 111;
                        case 135 -> 174;
                        case 136 -> 63;
                        case 137 -> 6;
                        case 138 -> 39;
                        case 139 -> 247;
                        case 140 -> 92;
                        case 141 -> 162;
                        case 142 -> 101;
                        case 143 -> 19;
                        case 144 -> 200;
                        case 145 -> 126;
                        case 146 -> 156;
                        case 147 -> 236;
                        case 148 -> 222;
                        case 149 -> 215;
                        case 150 -> 110;
                        case 151 -> 254;
                        case 152 -> 82;
                        case 153 -> 105;
                        case 154 -> 48;
                        case 155 -> 21;
                        case 156 -> 230;
                        case 157 -> 253;
                        case 158 -> 87;
                        case 159 -> 89;
                        case 160 -> 51;
                        case 161 -> 11;
                        case 162 -> 115;
                        case 163 -> 62;
                        case 164 -> 183;
                        case 165 -> 109;
                        case 166 -> 27;
                        case 167 -> 77;
                        case 168 -> 141;
                        case 169 -> 161;
                        case 170 -> 13;
                        case 171 -> 205;
                        case 172 -> 148;
                        case 173 -> 0;
                        case 174 -> 179;
                        case 175 -> 138;
                        case 176 -> 116;
                        case 177 -> 98;
                        case 178 -> 80;
                        case 179 -> 95;
                        case 180 -> 168;
                        case 181 -> 107;
                        case 182 -> 146;
                        case 183 -> 129;
                        case 184 -> 132;
                        case 185 -> 218;
                        case 186 -> 130;
                        case 187 -> 187;
                        case 188 -> 96;
                        case 189 -> 216;
                        case 190 -> 178;
                        case 191 -> 238;
                        case 192 -> 241;
                        case 193 -> 182;
                        case 194 -> 242;
                        case 195 -> 43;
                        case 196 -> 180;
                        case 197 -> 91;
                        case 198 -> 8;
                        case 199 -> 252;
                        case 200 -> 112;
                        case 201 -> 54;
                        case 202 -> 124;
                        case 203 -> 244;
                        case 204 -> 22;
                        case 205 -> 28;
                        case 206 -> 74;
                        case 207 -> 150;
                        case 208 -> 213;
                        case 209 -> 5;
                        case 210 -> 9;
                        case 211 -> 136;
                        case 212 -> 23;
                        case 213 -> 237;
                        case 214 -> 240;
                        case 215 -> 103;
                        case 216 -> 83;
                        case 217 -> 229;
                        case 218 -> 194;
                        case 219 -> 210;
                        case 220 -> 220;
                        case 221 -> 140;
                        case 222 -> 234;
                        case 223 -> 84;
                        case 224 -> 52;
                        case 225 -> 219;
                        case 226 -> 155;
                        case 227 -> 125;
                        case 228 -> 16;
                        case 229 -> 53;
                        case 230 -> 45;
                        case 231 -> 248;
                        case 232 -> 100;
                        case 233 -> 10;
                        case 234 -> 78;
                        case 235 -> 153;
                        case 236 -> 117;
                        case 237 -> 128;
                        case 238 -> 41;
                        case 239 -> 75;
                        case 240 -> 68;
                        case 241 -> 67;
                        case 242 -> 193;
                        case 243 -> 97;
                        case 244 -> 121;
                        case 245 -> 175;
                        case 246 -> 176;
                        case 247 -> 4;
                        case 248 -> 192;
                        case 249 -> 49;
                        case 250 -> 17;
                        case 251 -> 29;
                        case 252 -> 18;
                        case 253 -> 227;
                        case 254 -> 208;
                        default -> 163;
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
         ));
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var6 = this;
      var10002 = -12511;
      var10003 = -10547;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var6),
         "Glowing Mushroom walk",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII,
         30000L,
         0L,
         false,
         false,
         null,
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = 22723;
                  short var10005 = -10883;
                  var10005 = 22722;
                  short var10006 = -20407;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = 22720;
                  short var10002 = -17995;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "~¿þÎßj%\u008bÓø\u0005ÚÍÆ\u0012\u008c4\u0018ù\u001a\u0007y ú¢9\u009c5<§\u001b\u0082(DÊ~\nv]\r=^ô\u0083¨Ir\u001b\u0015\u0094N\u0000qÃ\u001c\u0087t\u009d9.@vv9\u0086µÌP\u000ft\u0097ãEÄê\u008f¢¢9b\u009f\u000eÁ>ê\u008fkí\n+?\u0013¯ÕÌø«à§qÂ\u0096?Å\u0099ë^nV\u000e\\>Øª-Èçª\u0003¢\r´yS\u0013DÆ¹á7\u008f87poq(C\u0098ÃG\u000ea¾\u0002²\u0085";
                  int var4 = "~¿þÎßj%\u008bÓø\u0005ÚÍÆ\u0012\u008c4\u0018ù\u001a\u0007y ú¢9\u009c5<§\u001b\u0082(DÊ~\nv]\r=^ô\u0083¨Ir\u001b\u0015\u0094N\u0000qÃ\u001c\u0087t\u009d9.@vv9\u0086µÌP\u000ft\u0097ãEÄê\u008f¢¢9b\u009f\u000eÁ>ê\u008fkí\n+?\u0013¯ÕÌø«à§qÂ\u0096?Å\u0099ë^nV\u000e\\>Øª-Èçª\u0003¢\r´yS\u0013DÆ¹á7\u008f87poq(C\u0098ÃG\u000ea¾\u0002²\u0085"
                     .length();
                  char var1 = '|';
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 30;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 30;
                           var10006 = var6;
                        } else {
                           var13 = 30;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 30;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 102;
                              case 1 -> 21;
                              case 2 -> 43;
                              case 3 -> 111;
                              case 4 -> 119;
                              case 5 -> 14;
                              default -> 65;
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
                  int var2 = (var0 ^ 22722) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 223;
                        case 1 -> 116;
                        case 2 -> 49;
                        case 3 -> 88;
                        case 4 -> 165;
                        case 5 -> 105;
                        case 6 -> 219;
                        case 7 -> 199;
                        case 8 -> 102;
                        case 9 -> 246;
                        case 10 -> 108;
                        case 11 -> 12;
                        case 12 -> 129;
                        case 13 -> 194;
                        case 14 -> 158;
                        case 15 -> 124;
                        case 16 -> 122;
                        case 17 -> 59;
                        case 18 -> 50;
                        case 19 -> 43;
                        case 20 -> 243;
                        case 21 -> 193;
                        case 22 -> 84;
                        case 23 -> 120;
                        case 24 -> 14;
                        case 25 -> 190;
                        case 26 -> 27;
                        case 27 -> 185;
                        case 28 -> 242;
                        case 29 -> 150;
                        case 30 -> 141;
                        case 31 -> 138;
                        case 32 -> 234;
                        case 33 -> 205;
                        case 34 -> 48;
                        case 35 -> 163;
                        case 36 -> 4;
                        case 37 -> 170;
                        case 38 -> 93;
                        case 39 -> 126;
                        case 40 -> 207;
                        case 41 -> 237;
                        case 42 -> 80;
                        case 43 -> 73;
                        case 44 -> 235;
                        case 45 -> 9;
                        case 46 -> 254;
                        case 47 -> 178;
                        case 48 -> 224;
                        case 49 -> 81;
                        case 50 -> 83;
                        case 51 -> 169;
                        case 52 -> 26;
                        case 53 -> 200;
                        case 54 -> 15;
                        case 55 -> 6;
                        case 56 -> 247;
                        case 57 -> 10;
                        case 58 -> 191;
                        case 59 -> 244;
                        case 60 -> 41;
                        case 61 -> 206;
                        case 62 -> 52;
                        case 63 -> 183;
                        case 64 -> 203;
                        case 65 -> 112;
                        case 66 -> 107;
                        case 67 -> 3;
                        case 68 -> 101;
                        case 69 -> 74;
                        case 70 -> 195;
                        case 71 -> 215;
                        case 72 -> 143;
                        case 73 -> 233;
                        case 74 -> 94;
                        case 75 -> 135;
                        case 76 -> 168;
                        case 77 -> 213;
                        case 78 -> 18;
                        case 79 -> 54;
                        case 80 -> 201;
                        case 81 -> 64;
                        case 82 -> 24;
                        case 83 -> 33;
                        case 84 -> 212;
                        case 85 -> 136;
                        case 86 -> 221;
                        case 87 -> 236;
                        case 88 -> 162;
                        case 89 -> 159;
                        case 90 -> 127;
                        case 91 -> 239;
                        case 92 -> 149;
                        case 93 -> 90;
                        case 94 -> 192;
                        case 95 -> 175;
                        case 96 -> 66;
                        case 97 -> 210;
                        case 98 -> 202;
                        case 99 -> 204;
                        case 100 -> 39;
                        case 101 -> 31;
                        case 102 -> 181;
                        case 103 -> 36;
                        case 104 -> 249;
                        case 105 -> 133;
                        case 106 -> 87;
                        case 107 -> 69;
                        case 108 -> 45;
                        case 109 -> 16;
                        case 110 -> 157;
                        case 111 -> 5;
                        case 112 -> 67;
                        case 113 -> 245;
                        case 114 -> 56;
                        case 115 -> 174;
                        case 116 -> 77;
                        case 117 -> 37;
                        case 118 -> 109;
                        case 119 -> 228;
                        case 120 -> 53;
                        case 121 -> 85;
                        case 122 -> 132;
                        case 123 -> 51;
                        case 124 -> 218;
                        case 125 -> 89;
                        case 126 -> 156;
                        case 127 -> 252;
                        case 128 -> 214;
                        case 129 -> 82;
                        case 130 -> 211;
                        case 131 -> 55;
                        case 132 -> 115;
                        case 133 -> 180;
                        case 134 -> 188;
                        case 135 -> 226;
                        case 136 -> 72;
                        case 137 -> 140;
                        case 138 -> 78;
                        case 139 -> 144;
                        case 140 -> 30;
                        case 141 -> 47;
                        case 142 -> 110;
                        case 143 -> 231;
                        case 144 -> 11;
                        case 145 -> 130;
                        case 146 -> 148;
                        case 147 -> 176;
                        case 148 -> 147;
                        case 149 -> 131;
                        case 150 -> 238;
                        case 151 -> 100;
                        case 152 -> 111;
                        case 153 -> 139;
                        case 154 -> 21;
                        case 155 -> 113;
                        case 156 -> 8;
                        case 157 -> 63;
                        case 158 -> 92;
                        case 159 -> 151;
                        case 160 -> 240;
                        case 161 -> 71;
                        case 162 -> 114;
                        case 163 -> 95;
                        case 164 -> 173;
                        case 165 -> 145;
                        case 166 -> 222;
                        case 167 -> 57;
                        case 168 -> 241;
                        case 169 -> 65;
                        case 170 -> 209;
                        case 171 -> 46;
                        case 172 -> 134;
                        case 173 -> 155;
                        case 174 -> 216;
                        case 175 -> 117;
                        case 176 -> 70;
                        case 177 -> 38;
                        case 178 -> 98;
                        case 179 -> 160;
                        case 180 -> 91;
                        case 181 -> 152;
                        case 182 -> 172;
                        case 183 -> 229;
                        case 184 -> 227;
                        case 185 -> 164;
                        case 186 -> 99;
                        case 187 -> 217;
                        case 188 -> 177;
                        case 189 -> 0;
                        case 190 -> 75;
                        case 191 -> 225;
                        case 192 -> 123;
                        case 193 -> 179;
                        case 194 -> 96;
                        case 195 -> 20;
                        case 196 -> 13;
                        case 197 -> 197;
                        case 198 -> 255;
                        case 199 -> 104;
                        case 200 -> 118;
                        case 201 -> 23;
                        case 202 -> 251;
                        case 203 -> 128;
                        case 204 -> 40;
                        case 205 -> 58;
                        case 206 -> 153;
                        case 207 -> 61;
                        case 208 -> 119;
                        case 209 -> 253;
                        case 210 -> 189;
                        case 211 -> 34;
                        case 212 -> 184;
                        case 213 -> 161;
                        case 214 -> 79;
                        case 215 -> 121;
                        case 216 -> 68;
                        case 217 -> 146;
                        case 218 -> 198;
                        case 219 -> 232;
                        case 220 -> 44;
                        case 221 -> 19;
                        case 222 -> 28;
                        case 223 -> 187;
                        case 224 -> 106;
                        case 225 -> 167;
                        case 226 -> 137;
                        case 227 -> 186;
                        case 228 -> 2;
                        case 229 -> 166;
                        case 230 -> 86;
                        case 231 -> 17;
                        case 232 -> 182;
                        case 233 -> 125;
                        case 234 -> 35;
                        case 235 -> 29;
                        case 236 -> 142;
                        case 237 -> 220;
                        case 238 -> 248;
                        case 239 -> 230;
                        case 240 -> 196;
                        case 241 -> 154;
                        case 242 -> 97;
                        case 243 -> 25;
                        case 244 -> 171;
                        case 245 -> 60;
                        case 246 -> 32;
                        case 247 -> 76;
                        case 248 -> 42;
                        case 249 -> 103;
                        case 250 -> 250;
                        case 251 -> 7;
                        case 252 -> 1;
                        case 253 -> 22;
                        case 254 -> 62;
                        default -> 208;
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
         ));
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var7 = this;
      var10002 = -12502;
      var10003 = 6275;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var7),
         "Glowing Mushroom move",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
         25000L,
         0L,
         false,
         false,
         null,
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = 24166;
                  short var10005 = -2534;
                  var10005 = 24164;
                  short var10006 = 4845;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = 24165;
                  short var10002 = -16028;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "\rfù[}¥¼lCm¹*'\u0015QU5\u008d\u009bÕ\u0086\u009e3o~Ézæþ~*\u0017L\u008b\u008b\u0099\u0081ã\u0082ý»\u008d:Z\u0018Ü&ÔRs\u0005\u0095¶3\u0099TÚD\u0085»\u0095¹\u0001ÞË Ë \u0092§::\u0099Q3@TED÷\u009eþ\u009cí_V´x³äÅôS@ý\bð3Ò¨\u0005\u0003\u0085\n\u0003\f®ûæþ7í«s*]Ee\u009aE\u009d!Å£\u0002%\u008f\u0013Ïï¡jv\u0083Ý¨oõ<9\u0097wG\u0019÷\u0004Ã";
                  int var4 = "\rfù[}¥¼lCm¹*'\u0015QU5\u008d\u009bÕ\u0086\u009e3o~Ézæþ~*\u0017L\u008b\u008b\u0099\u0081ã\u0082ý»\u008d:Z\u0018Ü&ÔRs\u0005\u0095¶3\u0099TÚD\u0085»\u0095¹\u0001ÞË Ë \u0092§::\u0099Q3@TED÷\u009eþ\u009cí_V´x³äÅôS@ý\bð3Ò¨\u0005\u0003\u0085\n\u0003\f®ûæþ7í«s*]Ee\u009aE\u009d!Å£\u0002%\u008f\u0013Ïï¡jv\u0083Ý¨oõ<9\u0097wG\u0019÷\u0004Ã"
                     .length();
                  char var1 = '|';
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 44;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 44;
                           var10006 = var6;
                        } else {
                           var13 = 44;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 44;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 76;
                              case 1 -> 1;
                              case 2 -> 115;
                              case 3 -> 55;
                              case 4 -> 74;
                              case 5 -> 12;
                              default -> 95;
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
                  int var2 = (var0 ^ 24164) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 105;
                        case 1 -> 206;
                        case 2 -> 95;
                        case 3 -> 162;
                        case 4 -> 130;
                        case 5 -> 237;
                        case 6 -> 191;
                        case 7 -> 212;
                        case 8 -> 157;
                        case 9 -> 46;
                        case 10 -> 168;
                        case 11 -> 196;
                        case 12 -> 101;
                        case 13 -> 202;
                        case 14 -> 194;
                        case 15 -> 67;
                        case 16 -> 111;
                        case 17 -> 100;
                        case 18 -> 176;
                        case 19 -> 0;
                        case 20 -> 22;
                        case 21 -> 65;
                        case 22 -> 190;
                        case 23 -> 167;
                        case 24 -> 60;
                        case 25 -> 26;
                        case 26 -> 35;
                        case 27 -> 160;
                        case 28 -> 15;
                        case 29 -> 246;
                        case 30 -> 236;
                        case 31 -> 187;
                        case 32 -> 132;
                        case 33 -> 12;
                        case 34 -> 122;
                        case 35 -> 118;
                        case 36 -> 207;
                        case 37 -> 149;
                        case 38 -> 92;
                        case 39 -> 13;
                        case 40 -> 10;
                        case 41 -> 222;
                        case 42 -> 117;
                        case 43 -> 85;
                        case 44 -> 108;
                        case 45 -> 230;
                        case 46 -> 79;
                        case 47 -> 34;
                        case 48 -> 121;
                        case 49 -> 76;
                        case 50 -> 234;
                        case 51 -> 125;
                        case 52 -> 223;
                        case 53 -> 185;
                        case 54 -> 75;
                        case 55 -> 31;
                        case 56 -> 213;
                        case 57 -> 173;
                        case 58 -> 218;
                        case 59 -> 87;
                        case 60 -> 64;
                        case 61 -> 25;
                        case 62 -> 242;
                        case 63 -> 78;
                        case 64 -> 148;
                        case 65 -> 24;
                        case 66 -> 3;
                        case 67 -> 200;
                        case 68 -> 21;
                        case 69 -> 47;
                        case 70 -> 89;
                        case 71 -> 250;
                        case 72 -> 161;
                        case 73 -> 244;
                        case 74 -> 113;
                        case 75 -> 165;
                        case 76 -> 45;
                        case 77 -> 16;
                        case 78 -> 97;
                        case 79 -> 135;
                        case 80 -> 159;
                        case 81 -> 211;
                        case 82 -> 252;
                        case 83 -> 18;
                        case 84 -> 240;
                        case 85 -> 133;
                        case 86 -> 86;
                        case 87 -> 124;
                        case 88 -> 174;
                        case 89 -> 128;
                        case 90 -> 99;
                        case 91 -> 137;
                        case 92 -> 192;
                        case 93 -> 199;
                        case 94 -> 102;
                        case 95 -> 52;
                        case 96 -> 17;
                        case 97 -> 43;
                        case 98 -> 37;
                        case 99 -> 181;
                        case 100 -> 217;
                        case 101 -> 56;
                        case 102 -> 109;
                        case 103 -> 62;
                        case 104 -> 224;
                        case 105 -> 245;
                        case 106 -> 184;
                        case 107 -> 204;
                        case 108 -> 107;
                        case 109 -> 232;
                        case 110 -> 32;
                        case 111 -> 9;
                        case 112 -> 4;
                        case 113 -> 39;
                        case 114 -> 91;
                        case 115 -> 72;
                        case 116 -> 42;
                        case 117 -> 205;
                        case 118 -> 23;
                        case 119 -> 70;
                        case 120 -> 59;
                        case 121 -> 136;
                        case 122 -> 57;
                        case 123 -> 195;
                        case 124 -> 142;
                        case 125 -> 150;
                        case 126 -> 1;
                        case 127 -> 186;
                        case 128 -> 81;
                        case 129 -> 66;
                        case 130 -> 155;
                        case 131 -> 225;
                        case 132 -> 6;
                        case 133 -> 253;
                        case 134 -> 96;
                        case 135 -> 38;
                        case 136 -> 126;
                        case 137 -> 175;
                        case 138 -> 48;
                        case 139 -> 238;
                        case 140 -> 93;
                        case 141 -> 27;
                        case 142 -> 221;
                        case 143 -> 84;
                        case 144 -> 28;
                        case 145 -> 188;
                        case 146 -> 229;
                        case 147 -> 166;
                        case 148 -> 140;
                        case 149 -> 177;
                        case 150 -> 40;
                        case 151 -> 127;
                        case 152 -> 226;
                        case 153 -> 243;
                        case 154 -> 172;
                        case 155 -> 146;
                        case 156 -> 216;
                        case 157 -> 58;
                        case 158 -> 104;
                        case 159 -> 54;
                        case 160 -> 145;
                        case 161 -> 2;
                        case 162 -> 203;
                        case 163 -> 14;
                        case 164 -> 77;
                        case 165 -> 152;
                        case 166 -> 182;
                        case 167 -> 248;
                        case 168 -> 8;
                        case 169 -> 115;
                        case 170 -> 98;
                        case 171 -> 82;
                        case 172 -> 36;
                        case 173 -> 164;
                        case 174 -> 69;
                        case 175 -> 83;
                        case 176 -> 219;
                        case 177 -> 254;
                        case 178 -> 215;
                        case 179 -> 198;
                        case 180 -> 156;
                        case 181 -> 110;
                        case 182 -> 158;
                        case 183 -> 114;
                        case 184 -> 251;
                        case 185 -> 178;
                        case 186 -> 94;
                        case 187 -> 169;
                        case 188 -> 154;
                        case 189 -> 63;
                        case 190 -> 119;
                        case 191 -> 153;
                        case 192 -> 68;
                        case 193 -> 20;
                        case 194 -> 163;
                        case 195 -> 71;
                        case 196 -> 228;
                        case 197 -> 193;
                        case 198 -> 80;
                        case 199 -> 44;
                        case 200 -> 116;
                        case 201 -> 139;
                        case 202 -> 5;
                        case 203 -> 180;
                        case 204 -> 170;
                        case 205 -> 151;
                        case 206 -> 141;
                        case 207 -> 209;
                        case 208 -> 214;
                        case 209 -> 189;
                        case 210 -> 231;
                        case 211 -> 147;
                        case 212 -> 103;
                        case 213 -> 235;
                        case 214 -> 19;
                        case 215 -> 131;
                        case 216 -> 73;
                        case 217 -> 210;
                        case 218 -> 197;
                        case 219 -> 33;
                        case 220 -> 123;
                        case 221 -> 7;
                        case 222 -> 220;
                        case 223 -> 51;
                        case 224 -> 41;
                        case 225 -> 249;
                        case 226 -> 49;
                        case 227 -> 183;
                        case 228 -> 144;
                        case 229 -> 129;
                        case 230 -> 88;
                        case 231 -> 112;
                        case 232 -> 61;
                        case 233 -> 179;
                        case 234 -> 241;
                        case 235 -> 201;
                        case 236 -> 11;
                        case 237 -> 239;
                        case 238 -> 55;
                        case 239 -> 29;
                        case 240 -> 208;
                        case 241 -> 120;
                        case 242 -> 106;
                        case 243 -> 171;
                        case 244 -> 247;
                        case 245 -> 53;
                        case 246 -> 30;
                        case 247 -> 134;
                        case 248 -> 233;
                        case 249 -> 90;
                        case 250 -> 227;
                        case 251 -> 50;
                        case 252 -> 74;
                        case 253 -> 138;
                        case 254 -> 255;
                        default -> 143;
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
         ));
      String var1 = var2;
      var10000 = this;
      var10001 = -12510;
      var10002 = -20315;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10000),
         "Glowing Mushroom mine",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         5000L,
         0L,
         false,
         false,
         null,
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = 11003;
                  short var10005 = 30054;
                  var10005 = 11001;
                  short var10006 = -18782;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = 11000;
                  short var10002 = -10809;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "}:ÍH\u0090¨Äµ\u000el\u0088an¹\u0000\u0082%ïòön\u0082lÖ\r\u0095{¨¦õ\u001bþ\u0001Ùç«N\u009fã\u0019øÔ*3 iJ\r\u001a0NÇG\u0012Èµ\u0088:õìð<h\u0016¤\u0003¾¯S\u0083zü«\u0011\u001e'4Ñ\n_Ï\u0080Ùç\u008fU\u0094\u0080Ü\u0094í\u0082\u0014´\u008dý\u0091H\u0086\u0085µ>øÂim¡í\u009fWw\u001dÛ/\u001eN¨hâ\u009cÐ ôè\u0002\u0085\u0081\u0013@$j\u008bdÐZºÝ\u008dò]!>ér\u0018ñU";
                  int var4 = "}:ÍH\u0090¨Äµ\u000el\u0088an¹\u0000\u0082%ïòön\u0082lÖ\r\u0095{¨¦õ\u001bþ\u0001Ùç«N\u009fã\u0019øÔ*3 iJ\r\u001a0NÇG\u0012Èµ\u0088:õìð<h\u0016¤\u0003¾¯S\u0083zü«\u0011\u001e'4Ñ\n_Ï\u0080Ùç\u008fU\u0094\u0080Ü\u0094í\u0082\u0014´\u008dý\u0091H\u0086\u0085µ>øÂim¡í\u009fWw\u001dÛ/\u001eN¨hâ\u009cÐ ôè\u0002\u0085\u0081\u0013@$j\u008bdÐZºÝ\u008dò]!>ér\u0018ñU"
                     .length();
                  char var1 = '|';
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 35;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 35;
                           var10006 = var6;
                        } else {
                           var13 = 35;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 35;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 19;
                              case 1 -> 65;
                              case 2 -> 76;
                              case 3 -> 73;
                              case 4 -> 40;
                              case 5 -> 66;
                              default -> 56;
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
                  int var2 = (var0 ^ 11001) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 114;
                        case 1 -> 209;
                        case 2 -> 158;
                        case 3 -> 185;
                        case 4 -> 137;
                        case 5 -> 49;
                        case 6 -> 187;
                        case 7 -> 94;
                        case 8 -> 205;
                        case 9 -> 106;
                        case 10 -> 215;
                        case 11 -> 45;
                        case 12 -> 245;
                        case 13 -> 44;
                        case 14 -> 19;
                        case 15 -> 241;
                        case 16 -> 135;
                        case 17 -> 148;
                        case 18 -> 191;
                        case 19 -> 80;
                        case 20 -> 111;
                        case 21 -> 233;
                        case 22 -> 182;
                        case 23 -> 12;
                        case 24 -> 8;
                        case 25 -> 204;
                        case 26 -> 237;
                        case 27 -> 91;
                        case 28 -> 24;
                        case 29 -> 138;
                        case 30 -> 170;
                        case 31 -> 121;
                        case 32 -> 37;
                        case 33 -> 82;
                        case 34 -> 175;
                        case 35 -> 115;
                        case 36 -> 169;
                        case 37 -> 120;
                        case 38 -> 69;
                        case 39 -> 140;
                        case 40 -> 26;
                        case 41 -> 81;
                        case 42 -> 40;
                        case 43 -> 55;
                        case 44 -> 22;
                        case 45 -> 152;
                        case 46 -> 212;
                        case 47 -> 95;
                        case 48 -> 4;
                        case 49 -> 62;
                        case 50 -> 206;
                        case 51 -> 236;
                        case 52 -> 183;
                        case 53 -> 219;
                        case 54 -> 154;
                        case 55 -> 126;
                        case 56 -> 87;
                        case 57 -> 163;
                        case 58 -> 242;
                        case 59 -> 211;
                        case 60 -> 33;
                        case 61 -> 73;
                        case 62 -> 89;
                        case 63 -> 17;
                        case 64 -> 34;
                        case 65 -> 189;
                        case 66 -> 10;
                        case 67 -> 71;
                        case 68 -> 161;
                        case 69 -> 238;
                        case 70 -> 105;
                        case 71 -> 239;
                        case 72 -> 134;
                        case 73 -> 167;
                        case 74 -> 127;
                        case 75 -> 190;
                        case 76 -> 160;
                        case 77 -> 125;
                        case 78 -> 139;
                        case 79 -> 72;
                        case 80 -> 147;
                        case 81 -> 186;
                        case 82 -> 112;
                        case 83 -> 196;
                        case 84 -> 218;
                        case 85 -> 149;
                        case 86 -> 83;
                        case 87 -> 86;
                        case 88 -> 32;
                        case 89 -> 109;
                        case 90 -> 188;
                        case 91 -> 136;
                        case 92 -> 225;
                        case 93 -> 110;
                        case 94 -> 181;
                        case 95 -> 131;
                        case 96 -> 198;
                        case 97 -> 130;
                        case 98 -> 235;
                        case 99 -> 184;
                        case 100 -> 53;
                        case 101 -> 11;
                        case 102 -> 88;
                        case 103 -> 217;
                        case 104 -> 54;
                        case 105 -> 35;
                        case 106 -> 230;
                        case 107 -> 104;
                        case 108 -> 200;
                        case 109 -> 222;
                        case 110 -> 246;
                        case 111 -> 116;
                        case 112 -> 78;
                        case 113 -> 76;
                        case 114 -> 56;
                        case 115 -> 177;
                        case 116 -> 146;
                        case 117 -> 164;
                        case 118 -> 129;
                        case 119 -> 124;
                        case 120 -> 157;
                        case 121 -> 153;
                        case 122 -> 99;
                        case 123 -> 67;
                        case 124 -> 25;
                        case 125 -> 21;
                        case 126 -> 229;
                        case 127 -> 174;
                        case 128 -> 150;
                        case 129 -> 220;
                        case 130 -> 141;
                        case 131 -> 107;
                        case 132 -> 172;
                        case 133 -> 195;
                        case 134 -> 7;
                        case 135 -> 60;
                        case 136 -> 234;
                        case 137 -> 166;
                        case 138 -> 103;
                        case 139 -> 208;
                        case 140 -> 31;
                        case 141 -> 108;
                        case 142 -> 214;
                        case 143 -> 28;
                        case 144 -> 231;
                        case 145 -> 6;
                        case 146 -> 123;
                        case 147 -> 199;
                        case 148 -> 48;
                        case 149 -> 90;
                        case 150 -> 9;
                        case 151 -> 227;
                        case 152 -> 5;
                        case 153 -> 100;
                        case 154 -> 210;
                        case 155 -> 165;
                        case 156 -> 75;
                        case 157 -> 155;
                        case 158 -> 118;
                        case 159 -> 194;
                        case 160 -> 156;
                        case 161 -> 29;
                        case 162 -> 249;
                        case 163 -> 180;
                        case 164 -> 224;
                        case 165 -> 84;
                        case 166 -> 122;
                        case 167 -> 223;
                        case 168 -> 151;
                        case 169 -> 173;
                        case 170 -> 66;
                        case 171 -> 70;
                        case 172 -> 201;
                        case 173 -> 162;
                        case 174 -> 192;
                        case 175 -> 119;
                        case 176 -> 58;
                        case 177 -> 51;
                        case 178 -> 203;
                        case 179 -> 113;
                        case 180 -> 92;
                        case 181 -> 2;
                        case 182 -> 228;
                        case 183 -> 57;
                        case 184 -> 252;
                        case 185 -> 226;
                        case 186 -> 251;
                        case 187 -> 15;
                        case 188 -> 13;
                        case 189 -> 0;
                        case 190 -> 250;
                        case 191 -> 102;
                        case 192 -> 145;
                        case 193 -> 202;
                        case 194 -> 20;
                        case 195 -> 77;
                        case 196 -> 97;
                        case 197 -> 42;
                        case 198 -> 132;
                        case 199 -> 159;
                        case 200 -> 30;
                        case 201 -> 207;
                        case 202 -> 255;
                        case 203 -> 143;
                        case 204 -> 221;
                        case 205 -> 248;
                        case 206 -> 176;
                        case 207 -> 168;
                        case 208 -> 98;
                        case 209 -> 171;
                        case 210 -> 65;
                        case 211 -> 52;
                        case 212 -> 3;
                        case 213 -> 64;
                        case 214 -> 101;
                        case 215 -> 213;
                        case 216 -> 46;
                        case 217 -> 117;
                        case 218 -> 85;
                        case 219 -> 1;
                        case 220 -> 41;
                        case 221 -> 197;
                        case 222 -> 232;
                        case 223 -> 16;
                        case 224 -> 63;
                        case 225 -> 96;
                        case 226 -> 244;
                        case 227 -> 216;
                        case 228 -> 23;
                        case 229 -> 93;
                        case 230 -> 68;
                        case 231 -> 254;
                        case 232 -> 61;
                        case 233 -> 133;
                        case 234 -> 74;
                        case 235 -> 128;
                        case 236 -> 253;
                        case 237 -> 50;
                        case 238 -> 38;
                        case 239 -> 43;
                        case 240 -> 79;
                        case 241 -> 142;
                        case 242 -> 243;
                        case 243 -> 240;
                        case 244 -> 144;
                        case 245 -> 193;
                        case 246 -> 18;
                        case 247 -> 36;
                        case 248 -> 179;
                        case 249 -> 14;
                        case 250 -> 178;
                        case 251 -> 47;
                        case 252 -> 59;
                        case 253 -> 39;
                        case 254 -> 247;
                        default -> 27;
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
         ));
      if (var1 == null) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[5]
         );
      }
   }

   @Override
   public void aC() { Vec3 var20 = null; // PX-FIX hoist
         lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll var18 = null; // PX-FIX hoist
        
      Object var99 = null; // PX-FIX
      Object var92 = null; // PX-FIX
      byte var89 = 0; // PX-FIX
      Object var82 = null; // PX-FIX
      Object var80 = null; // PX-FIX
      Object var78 = null; // PX-FIX
      Object var74 = null; // PX-FIX
      Object var73 = null; // PX-FIX
      Object var61 = null; // PX-FIX
      Object var59 = null; // PX-FIX
      Object var58 = null; // PX-FIX
      Object var56 = null; // PX-FIX
      Object var54 = null; // PX-FIX
      Object var52 = null; // PX-FIX
      Object var51 = null; // PX-FIX
      Object var48 = null; // PX-FIX
      Object llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl = null; // PX-FIX
      String var10000 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      this.a5();
      String var1 = var10000;
      int var47 = this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
      if (var1 != null) {
         if (this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll > 0) {
            int var2 = this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
            this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = var2 + -1;
         }

         var47 = ((int[])lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl$llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII)[this.W()
            .ordinal()];
      }

      label695: {
         label696: {
            label697: {
               label698: {
                  label618: {
                     label619: {
                        label699: {
                           label655: {
                              label622: {
                                 label623: {
                                    label624: {
                                       label625: {
                                          if (var1 != null) {
                                             switch (var47) {
                                                case 1:
                                                   var47 = ((this.aK()) ? 1 : 0);
                                                   break;
                                                case 2:
                                                   break label625;
                                                case 3:
                                                   break label624;
                                                case 4:
                                                   break label623;
                                                case 5:
                                                   break label622;
                                                case 6:
                                                   break label655;
                                                default:
                                                   return;
                                             }
                                          }

                                          label587: {
                                             label586: {
                                                label585: {
                                                   if (var1 != null) {
                                                      if (var47 == 0) {
                                                         return;
                                                      }

                                                      var48 = this;
                                                      if (var1 == null) {
                                                         break label585;
                                                      }

                                                      var47 = ((int[])lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl$llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)[this.aJ()
                                                         .a()
                                                         .ordinal()];
                                                   }

                                                   switch (var47) {
                                                      case 1:
                                                         var48 = this;
                                                         break;
                                                      case 2:
                                                         break label586;
                                                      default:
                                                         break label587;
                                                   }
                                                }

                                                this.a9();
                                                if (var1 != null) {
                                                   return;
                                                }
                                             }

                                             this.a(
                                                me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl,
                                                2000
                                             );
                                          }

                                          if (var1 != null) {
                                             return;
                                          }
                                       }

                                       int var49 = ((IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                          .e()
                                          .d()) ? 1 : 0);
                                       if (var1 != null) {
                                          if (var49 == 0) {
                                             return;
                                          }

                                          var49 = this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
                                       }

                                       if (var1 != null) {
                                          if (var49
                                             >= CollectionsKt.getLastIndex(
                                                this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI
                                             )) {
                                             short var101 = -12507;
                                             short var106 = -30507;
                                             me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
                                                "Arrived at farming area"
                                             );
                                             this.a7();
                                             return;
                                          }

                                          var49 = this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
                                       }

                                       int var3 = var49;
                                       this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = var3 + 1;
                                       IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                                          ((BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                             .e())),
                                          ((IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll)(Object)(this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI
                                             .get(this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII))),
                                          0,
                                          false);
                                       if (var1 != null) {
                                          return;
                                       }
                                    }

                                    this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = a(this, null, 1, null);
                                    lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl var50 = this;
                                    if (var1 != null) {
                                       if (this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI == null) {
                                          BlockPos var19 = this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl
                                             .get(
                                                this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl
                                                   % this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.size()
                                             );
                                          int var22 = this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl++;
                                          short var105 = -12482;
                                          short var114 = 6223;
                                          me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
                                             "No mushrooms found, roaming to point "
                                                + this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl
                                          );
                                          IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                                             ((BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                                .e())),
                                             ((IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll)(Object)(var19)),
                                             0,
                                             false);
                                          this.a(
                                             IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII
                                          );
                                          return;
                                       }

                                       var50 = this;
                                    }

                                    var50.a(
                                       IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                                    );
                                    if (var1 != null) {
                                       return;
                                    }
                                 }

                                 lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll var16 = a(this, null, 1, null);
                                 if (var16 != null) {
                                    label292: {
                                       IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll var100 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                          .e();
                                       if (var1 != null) {
                                          if (var100.d()) {
                                             break label292;
                                          }

                                          var100 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                             .e();
                                       }

                                       var100.k();
                                    }

                                    this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = var16;
                                    this.a(
                                       IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                                    );
                                    return;
                                 }

                                 if (!IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                    .e()
                                    .d()) {
                                    return;
                                 }

                                 this.a(
                                    IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                                 );
                                 if (var1 != null) {
                                    return;
                                 }
                              }

                              var51 = this;
                              if (var1 == null) {
                                 break label695;
                              }

                              if (this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI == null) {
                                 var51 = this;
                                 break label695;
                              }

                              lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll var17 = this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
                              var52 = var17.f();
                              if (var1 == null) {
                                 break label699;
                              }

                              label557:
                              if (((Boolean)(var52))) {
                                 label628: {
                                    label629: {
                                       boolean var53 = var17.e();
                                       if (var1 != null) {
                                          if (var53) {
                                             break label557;
                                          }

                                          var54 = this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
                                          if (var1 == null) {
                                             break label629;
                                          }

                                          var53 = ((java.util.function.Supplier<Boolean>)(() -> { this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll.a(250); return false; })).get();
                                       }

                                       if (!var53) {
                                          break label628;
                                       }

                                       var54 = this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
                                    }

                                    label553: {
                                       ((me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI)var54).f();
                                       if (var1 != null) {
                                          ClientLevel var55 = this.ap().level;
                                          if (var55 != null) {
                                             var56 = var55.getBlockState(var17.a());
                                             break label553;
                                          }
                                       }

                                       var56 = null;
                                    }

                                    BlockState var4 =((BlockState)( var56));
                                    BlockState var57 = var4;
                                    if (var1 != null) {
                                       if (var4 == null) {
                                          break label628;
                                       }

                                       var57 = var4;
                                    }

                                    var58 = var57.is(Blocks.RED_MUSHROOM);
                                    if (var1 != null) {
                                       if (((Boolean)(var58))) {
                                          break label628;
                                       }

                                       var58 = var4.is(Blocks.BROWN_MUSHROOM);
                                    }

                                    if (var1 == null) {
                                       break label619;
                                    }

                                    if (!((Boolean)var58)) {
                                       var59 = this;
                                       if (var1 == null) {
                                          break label618;
                                       }

                                       this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.remove(var17.a());
                                       var58 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                          .e()
                                          .d();
                                       break label619;
                                    }
                                 }

                                  var20 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
                                 double var23 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .b(var17.a(), false);
                                 int var67 = this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
                                 if (var1 != null) {
                                    if (this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll == 0) {
                                       double var28 = var17.a().distToCenterSqr(var20);
                                       lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll var36 = this.a(var17, var28);
                                       if (var36 != null) {
                                          label333: {
                                             IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll var97 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                                .e();
                                             if (var1 != null) {
                                                if (var97.d()) {
                                                   break label333;
                                                }

                                                var97 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                                   .e();
                                             }

                                             var97.k();
                                          }

                                          me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                             .p();
                                          short var98 = -12501;
                                          this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = null;
                                          short var104 = -4849;
                                          this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII = false;
                                          this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = var36;
                                          this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = null;
                                          this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = 0;
                                          this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = 20;
                                          me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
                                             "Retargeting to closer mushroom"
                                          );
                                          return;
                                       }
                                    }

                                    var67 = ((IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                       .e()
                                       .d()) ? 1 : 0);
                                 }

                                 label526:
                                 if (var1 != null) {
                                    if (var67 != 0) {
                                       double var122;
                                       var67 = (var122 = var23 - 2.5) == 0.0 ? 0 : (var122 < 0.0 ? -1 : 1);
                                       if (var1 == null) {
                                          break label526;
                                       }

                                       if (var67 > 0) {
                                          BlockPos var68 = var17.a().below();
                                          short var107 = -12508;
                                          short var115 = 26276;
                                          Intrinsics.checkNotNullExpressionValue(var68, "below(...)");
                                          BlockPos var29 = var68;
                                          if (var1 == null) {
                                             return;
                                          }

                                          ClientLevel var69 = this.ap().level;
                                          if (var69 == null) {
                                             return;
                                          }

                                          ClientLevel var34 = var69;
                                          if (var1 == null) {
                                             return;
                                          }

                                          LocalPlayer var70 = this.ap().player;
                                          if (var70 == null) {
                                             return;
                                          }

                                          LocalPlayer var37 = var70;
                                          boolean var71 = var34.getBlockState(var29).isAir();
                                          if (var1 != null) {
                                             if (var71) {
                                                var29 = new BlockPos(var29.getX(), (int)var37.getY(), var29.getZ());
                                             }

                                             IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                                                ((BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                                   .e())),
                                                ((IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll)(Object)(var29)),
                                                var17.a().getCenter(),
                                                false);
                                          }
                                       }
                                    }

                                    double var123;
                                    var67 = (var123 = var23 - 4.5) == 0.0 ? 0 : (var123 < 0.0 ? -1 : 1);
                                 }

                                 label509:
                                 if (var1 != null) {
                                    if (var67 <= 0) {
                                       var67 = ((this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII) ? 1 : 0);
                                       if (var1 == null) {
                                          break label509;
                                       }

                                       label515:
                                       if (!this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII) {
                                          lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl var72 = this;
                                          if (var1 != null) {
                                             if (this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII != null) {
                                                break label515;
                                             }

                                             var72 = this;
                                          }

                                          var72.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII = true;
                                          me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                             .a(null);
                                       }
                                    }

                                    double var124;
                                    var67 = (var124 = var23 - 3.5) == 0.0 ? 0 : (var124 < 0.0 ? -1 : 1);
                                 }

                                 if (var1 != null) {
                                    if (var67 > 0) {
                                       return;
                                    }

                                    var67 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.b(
                                       me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                                       var17.a(),
                                       null,
                                       null);
                                 }

                                 label504: {
                                    label634: {
                                       label502:
                                       if (var1 != null) {
                                          if (var67 == 0) {
                                             var67 = ((lIllIlIIIIIIlllllIllIlIIIlllIIIIIIIIIIlIllllIIlIIllIIIllIlIlIIIllllllllIIlIIIlllIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                                .b()
                                                .al()) ? 1 : 0);
                                             if (var1 == null) {
                                                break label502;
                                             }

                                             if (var67 != 0) {
                                                return;
                                             }
                                          }

                                          var73 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                             .e();
                                          if (var1 == null) {
                                             break label634;
                                          }

                                          var67 = ((me.octo.client.PXDyn)var73).d();
                                       }

                                       if (var67 != 0) {
                                          break label504;
                                       }

                                       var73 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                          .e();
                                    }

                                    ((me.octo.client.PXDyn)var73).k();
                                 }

                                 me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                    .p();
                                 this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = 0;
                                 this.a(
                                    IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
                                 );
                                 this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll.f();
                                 if (var1 != null) {
                                    return;
                                 }
                                 break label655;
                              }

                              var99 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                 .e();
                              if (var1 == null) {
                                 break label698;
                              }

                              var52 = ((me.octo.client.PXDyn)var99).d();
                              break label699;
                           }

                           var74 = this;
                           if (var1 == null) {
                              break label697;
                           }

                           if (this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI == null) {
                              var74 = this;
                              break label697;
                           }

                            var18 = this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
                           double var21 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .b(var18.a(), false);
                           if (var1 == null) {
                              return;
                           }

                           label461:
                           if (!(var21 > 4.0)) {
                              lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl var75 = this;
                              if (var1 != null) {
                                 if (((java.util.function.Supplier<Boolean>)(() -> { this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll.a(1000); return false; })).get()) {
                                    break label461;
                                 }

                                 var75 = this;
                              }

                              label427: {
                                 label637: {
                                    ClientLevel var24 = var75.ap().level;
                                    ClientLevel var76 = var24;
                                    if (var1 != null) {
                                       if (var24 == null) {
                                          break label637;
                                       }

                                       var76 = var24;
                                    }

                                    BlockState var77 = var76.getBlockState(var18.a());
                                    short var108 = -12489;
                                    short var116 = -29171;
                                    Intrinsics.checkNotNullExpressionValue(var77, "getBlockState(...)");
                                    BlockState var30 = var77;
                                    var78 = var30.is(Blocks.RED_MUSHROOM);
                                    if (var1 == null) {
                                       break label427;
                                    }

                                    if (((Boolean)(var78))) {
                                       var78 = var30.is(Blocks.BROWN_MUSHROOM);
                                       if (var1 == null) {
                                          break label427;
                                       }

                                       if (((Boolean)(var78))) {
                                          this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.remove(var18.a());
                                          this.a6();
                                          this.a(
                                             IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                                          );
                                          this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll.f();
                                          return;
                                       }
                                    }
                                 }

                                 var78 = lIllIlIIIIIIlllllIllIlIIIlllIIIIIIIIIIlIllllIIlIIllIIIllIlIlIIIllllllllIIlIIIlllIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .b()
                                    .al();
                              }

                              if (var1 != null) {
                                 var78 =((Boolean)(Object)( (Boolean)var78 ? 1 : 0));
                              }

                              int var31;
                              byte var35;
                              label413: {
                                 label638: {
                                    var31 =((Integer)( var78));
                                    var35 = (byte)(Intrinsics.areEqual(a(this, 0.0, 1, null), var18.a()) ? 1 : 0);
                                    int var79 = var35;
                                    if (var1 != null) {
                                       if (var35 != 0) {
                                          var80 = this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
                                          if (var1 == null) {
                                             break label413;
                                          }

                                          if (this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll != null) {
                                             break label638;
                                          }
                                       }

                                       var79 = var31;
                                    }

                                    label639: {
                                       List var38 = var79 != 0
                                          ? me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.a(
                                             me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                                             var18.a(),
                                             CollectionsKt.emptyList(),
                                             null,
                                             0.02,
                                             0.001,
                                             0.0)
                                          : me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.a(
                                             me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                                             var18.a(),
                                             CollectionsKt.emptyList(),
                                             null,
                                             0.0,
                                             0.0,
                                             0.0);
                                       this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = (Vec3)CollectionsKt.firstOrNull(
                                          var38
                                       );
                                       Vec3 var81 = this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
                                       if (var1 != null) {
                                          if (this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll == null && var31 != 0) {
                                             AABB var10 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                                .f(var18.a());
                                             this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = var10.getCenter();
                                          }

                                          var82 = this;
                                          if (var1 == null) {
                                             break label639;
                                          }

                                          var81 = this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
                                       }

                                       if (var81 == null) {
                                          int var83 = ((IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                             .e()
                                             .d()) ? 1 : 0);
                                          if (var1 != null) {
                                             if (var83 == 0) {
                                                return;
                                             }

                                             var83 = ((java.util.function.Supplier<Integer>)(() -> { this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII.a(100); return 0; })).get();
                                          }

                                          if (var1 != null) {
                                             if (var83 == 0) {
                                                return;
                                             }

                                             var83 = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
                                          }

                                          int var41 = var83;
                                          this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = var41 + 1;
                                          this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII.f();
                                          lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl var84 = this;
                                          if (var1 != null) {
                                             if (this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl <= 20) {
                                                Vec3 var42 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
                                                Vec3 var85 = var18.a().getCenter();
                                                short var109 = -12523;
                                                short var117 = -21840;
                                                Intrinsics.checkNotNullExpressionValue(var85, "getCenter(...)");
                                                Vec3 var11 = var85;
                                                Vec3 var86 = var11.subtract(var42).normalize();
                                                var109 = -12491;
                                                var117 = 2952;
                                                Intrinsics.checkNotNullExpressionValue(var86, "normalize(...)");
                                                Vec3 var12 = var86;
                                                Vec3 var87 = new Vec3(-var12.z, 0.0, var12.x).scale(2.0);
                                                var109 = -12494;
                                                var117 = -30297;
                                                Intrinsics.checkNotNullExpressionValue(var87, "scale(...)");
                                                Vec3 var13 = var87;
                                                Vec3 var15 = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl % 2
                                                      == 0
                                                   ? var42.add(var13)
                                                   : var42.subtract(var13);
                                                Intrinsics.checkNotNull(var15);
                                                BlockPos var46 = new BlockPos((int)var15.x, (int)var42.y, (int)var15.z);
                                                IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                                                   ((BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                                      .e())),
                                                   ((IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll)(Object)(var46)),
                                                   var18.a().getCenter(),
                                                   false);
                                                return;
                                             }

                                             short var88 = -12500;
                                             short var10001 = 30099;
                                             me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
                                                "Can't find angle to mushroom, moving on"
                                             );
                                             this.a6();
                                             var84 = this;
                                          }

                                          var84.a(
                                             IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                                          );
                                          return;
                                       }

                                       var82 = this;
                                    }

                                    this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = 0;
                                 }

                                 var80 = this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
                                 Intrinsics.checkNotNull(this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll);
                              }

                              me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a(var80);
                              var89 = var35;
                              label394:
                              if (var1 != null) {
                                 if (var35 == 0) {
                                    var89 =(byte)( var31);
                                    if (var1 != null) {
                                       if (var31 == 0) {
                                          return;
                                       }

                                       double var125;
                                       var89 = (byte)((var125 = ((byte)((var21 - 3.5 != 0.0) ? 1 : 0))) == (byte)((0.0 != 0) ? 0 : (var125 < 0.0 ? -1 : 1)) ? 1 : 0);
                                    }

                                    if (var1 != null) {
                                       if (var89 > 0) {
                                          return;
                                       }

                                       var89 = ((byte)((me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                          .h()) ? 1 : 0));
                                    }

                                    if (var1 == null) {
                                       break label394;
                                    }

                                    if (var89 == 0) {
                                       return;
                                    }
                                 }

                                 me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                    .i();
                                 var89 = (byte)(this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll);
                              }

                              int var39 = var89;
                              short var90 = -12492;
                              this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = var39 + 1;
                              short var102 = -11392;
                              var18.b(30);
                              me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
                                 "Clicked mushroom, moving to next"
                              );
                              me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .p();
                              me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .g();
                              this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll.f();
                              lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll var91;
                              if (var1 != null && this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII != null) {
                                 lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll var44;
                                 label372: {
                                    label644: {
                                       var44 = this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
                                       boolean var45 = false;
                                       var92 = var44.f();
                                       if (var1 != null) {
                                          if (!((Boolean)var92)) {
                                             break label644;
                                          }

                                          var92 = var44.e();
                                       }

                                       if (var1 == null) {
                                          break label372;
                                       }

                                       if (!((Boolean)var92)) {
                                          var92 = true;
                                          break label372;
                                       }
                                    }

                                    var92 = false;
                                 }

                                 var91 = ((lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll)(Object)(((Boolean)(((Boolean)(Object)( (Boolean)var92 ? var44 : null))))));
                              } else {
                                 var91 = null;
                              }

                              lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll var40 = var91;
                              this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = null;
                              this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII = false;
                              if (var1 != null) {
                                 if (var40 != null) {
                                    short var93 = -12497;
                                    var102 = 21788;
                                    me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
                                       "Using pre-scanned next mushroom"
                                    );
                                    this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = var40;
                                    this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = null;
                                    this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = 0;
                                    BlockPos var94 = var40.a().below();
                                    int var112 = -12508;
                                    short var120 = 26276;
                                    Intrinsics.checkNotNullExpressionValue(var94, "below(...)");
                                    BlockPos var43 = var94;
                                    ClientLevel var95 = this.ap().level;
                                    Intrinsics.checkNotNull(var95);
                                    boolean var96 = var95.getBlockState(var43).isAir();
                                    if (var1 != null) {
                                       if (var96) {
                                          var112 = var43.getX();
                                          LocalPlayer var121 = this.ap().player;
                                          Intrinsics.checkNotNull(var121);
                                          var43 = new BlockPos(var112, (int)var121.getY(), var43.getZ());
                                       }

                                       IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                                          ((BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                             .e())),
                                          ((IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll)(Object)(var43)),
                                          var40.a().getCenter(),
                                          false);
                                    }

                                    this.a(
                                       IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                                    );
                                    if (var1 != null) {
                                       return;
                                    }
                                 }

                                 this.a6();
                              }

                              this.a(
                                 IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                              );
                              return;
                           }

                           var18.b(30);
                           this.a6();
                           this.a(
                              IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                           );
                           this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll.f();
                           return;
                        }

                        if (((Boolean)(var52))) {
                           break label696;
                        }

                        var99 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                           .e();
                        break label698;
                     }

                     if (!((Boolean)var58)) {
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                           .e()
                           .k();
                     }

                     var59 = this;
                  }

                  lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll var62;
                  if (((me.octo.client.PXDyn)var59).lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII != null) {
                     lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll var7;
                     label325: {
                        label645: {
                           var7 = ((lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll)(Object)(((me.octo.client.PXDyn)var59).lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII));
                           boolean var9 = false;
                           var61 = var7.f();
                           if (var1 != null) {
                              if (!((Boolean)var61)) {
                                 break label645;
                              }

                              var61 = var7.e();
                           }

                           if (var1 == null) {
                              break label325;
                           }

                           if (!((Boolean)var61)) {
                              var61 = true;
                              break label325;
                           }
                        }

                        var61 = false;
                     }

                     var62 = ((lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll)(Object)(((Boolean)(((Boolean)(Object)( (Boolean)var61 ? var7 : null))))));
                  } else {
                     var62 = null;
                  }

                  lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll var5 = var62;
                  this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = null;
                  this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII = false;
                  if (var1 != null) {
                     if (var5 != null) {
                        this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = var5;
                        this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = null;
                        this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = 0;
                        BlockPos var63 = var5.a().below();
                        short var10002 = -12509;
                        short var10003 = -31907;
                        Intrinsics.checkNotNullExpressionValue(var63, "below(...)");
                        BlockPos var6 = var63;
                        if (var1 == null) {
                           return;
                        }

                        ClientLevel var64 = this.ap().level;
                        if (var64 == null) {
                           return;
                        }

                        ClientLevel var27 = var64;
                        if (var1 == null) {
                           return;
                        }

                        LocalPlayer var65 = this.ap().player;
                        if (var65 == null) {
                           return;
                        }

                        LocalPlayer var8 = var65;
                        boolean var66 = var27.getBlockState(var6).isAir();
                        if (var1 != null) {
                           if (var66) {
                              var6 = new BlockPos(var6.getX(), (int)var8.getY(), var6.getZ());
                           }

                           IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                              ((BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                 .e())),
                              ((IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll)(Object)(var6)),
                              var5.a().getCenter(),
                              false);
                        }

                        if (var1 != null) {
                           return;
                        }
                     }

                     this.a6();
                  }

                  this.a(
                     IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                  );
                  return;
               }

               ((me.octo.client.PXDyn)var99).k();
               break label696;
            }

            lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl var25 =((lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl)( var74));
            boolean var32 = false;
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .p();
            var25.a(
               IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
            );
            return;
         }

         this.a6();
         this.a(
            IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
         );
         return;
      }

      lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl var26 =((lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl)( var51));
      boolean var33 = false;
      var26.a6();
      var26.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
      );
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.lIIIlIllllIIllIlIlIllIlIllllIIlIIlIIIllllIlIllIIllIIIlllIIIIllIlIIllIlllIIIIllIIlIIlI var1) { boolean var20 = false; // PX-FIX hoist
         ConcurrentMap var18 = null; // PX-FIX hoist
        
      String var10000 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      short var10002 = -12484;
      short var10003 = -24026;
      Intrinsics.checkNotNullParameter(var1, "event");
      String var2 = var10000;
      if (var2 != null) {
         ClientLevel var24 = this.ap().level;
         if (var24 != null) {
            ClientLevel var3 = var24;
            if (var2 != null) {
               LocalPlayer var25 = this.ap().player;
               if (var25 != null) {
                  LocalPlayer var4 = var25;
                  ClientboundLevelParticlesPacket var5 = var1.k();
                  int var26 = ((Intrinsics.areEqual(var5.getParticle().getType(), ParticleTypes.ENTITY_EFFECT)) ? 1 : 0);
                  if (var2 != null) {
                     if (var26 == 0) {
                        return;
                     }

                     var26 = lIllIlIIIIIIlllllIllIlIIIlllIIIIIIIIIIlIllllIIlIIllIIIllIlIlIIIllllllllIIlIIIlllIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a()
                        .M();
                  }

                  double var6 = var26;
                  Vec3 var8 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var4);
                  double var9 = var5.getX() - var8.x;
                  double var11 = var5.getY() - var8.y;
                  double var13 = var5.getZ() - var8.z;
                  if (var9 * var9 + var11 * var11 + var13 * var13 > var6 * var6) {
                     return;
                  }

                  BlockPos var15 = new BlockPos((int)Math.floor(var5.getX()), (int)Math.floor(var5.getY()), (int)Math.floor(var5.getZ()));
                  if (this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.contains(var15)) {
                     return;
                  }

                  label55: {
                     BlockState var27 = var3.getBlockState(var15);
                     var10002 = -12490;
                     var10003 = 5996;
                     Intrinsics.checkNotNullExpressionValue(var27, "getBlockState(...)");
                     BlockState var16 = var27;
                     boolean var28 = var16.is(Blocks.RED_MUSHROOM);
                     if (var2 != null) {
                        if (var28) {
                           break label55;
                        }

                        var28 = var16.is(Blocks.BROWN_MUSHROOM);
                     }

                     if (!var28) {
                        return;
                     }
                  }

                   var18 = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
                   var20 = false;
                  var10000 = (String)var18.get(var15);
                  label49:
                  if (var2 != null && var10000 == null) {
                     boolean var21 = false;
                     lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll var22 = new lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll(
                        var15, 0, 0L, 0L, 14, null
                     );
                     boolean var23 = false;
                     if (var2 != null) {
                        var10000 = ((String)(var18.putIfAbsent(var15, var22)));
                        if (var10000 != null) {
                           break label49;
                        }
                     }

                     var10000 = String.valueOf(var22);
                  }

                  lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll var17 = (lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll)(Object)var10000;
                  var17.g();
                  return;
               }
            }

            return;
         }
      }
   }

   @SubscribeEvent(
      priority = EventPriority.HIGH
   )
   public final void a(@NotNull me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var1) {
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var8 = null; // PX-FIX
      String var10000 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      short var10002 = -12504;
      short var10003 = 4918;
      Intrinsics.checkNotNullParameter(var1, "event");
      String var2 = var10000;

      for (Object var6 : this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.values()) {
         var10002 = -12485;
         var10003 = 14965;
         Intrinsics.checkNotNullExpressionValue(var6, "next(...)");
         lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll var4 = (lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll)var6;
         boolean var7 = var4.f();
         if (var2 != null) {
            if (!var7) {
               continue;
            }

            var7 = var4.e();
         }

         label30: {
            if (var2 != null) {
               if (var7) {
                  var8 = me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
                  break label30;
               }

               var7 = Intrinsics.areEqual(var4, this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI);
            }

            var8 = var7
               ? me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI
               : me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
         }

         me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var5 = var8;
         IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a(
            var4.a(),
            null,
            new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(var5.o()),
            1.5F,
            null,
            null,
            0.0F,
            false,
            0.0F);
         if (var2 == null) {
            break;
         }
      }
   }

   private final BlockPos b(double var1) {
      String var10000 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      LocalPlayer var10001 = this.ap().player;
      Intrinsics.checkNotNull(var10001);
      Entity var7 = var10001;
      LocalPlayer var10004 = this.ap().player;
      Intrinsics.checkNotNull(var10004);
      float var9 = var10004.getYRot();
      LocalPlayer var10005 = this.ap().player;
      Intrinsics.checkNotNull(var10005);
      HitResult var4 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(
         var7, var1, 1.0F, var9, var10005.getXRot()
      );
      String var3 = var10000;
      HitResult var5 = var4;
      if (var3 != null) {
         if (var4.getType() != Type.BLOCK) {
            return null;
         }

         short var8 = -12505;
         short var10002 = 31160;
         Intrinsics.checkNotNull(var4, "null cannot be cast to non-null type net.minecraft.world.phys.BlockHitResult");
         var5 = var4;
      }

      return ((BlockHitResult)var5).getBlockPos();
   }

   private final lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll a(BlockPos var1) { List var20 = null; // PX-FIX hoist
        
      Object var25 = null; // PX-FIX
      lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll var18 = null; // PX-FIX hoist
      String var2 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      if (var2 != null) {
         LocalPlayer var10000 = this.ap().player;
         if (var10000 != null) {
            Vec3 var21 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var10000);
            if (var21 != null) {
               Vec3 var3 = var21;
               if (var2 != null) {
                  ClientLevel var22 = this.ap().level;
                  if (var22 != null) {
                     ClientLevel var4 = var22;
                     Collection var23 = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.values();
                     short var10002 = -12499;
                     short var10003 = -31095;
                     Intrinsics.checkNotNullExpressionValue(var23, "<get-values>(...)");
                     Iterable var6 = var23;
                     boolean var7 = false;
                     Collection var9 = new ArrayList();
                     boolean var10 = false;
                     Iterator var11 = var6.iterator();

                     while (true) {
                        if (var11.hasNext()) {
                           Object var12 = var11.next();
                           lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll var13 = (lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll)var12;
                           boolean var14 = false;
                           var10000 = ((LocalPlayer)(Object)(this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll));
                           if (var2 == null) {
                              break;
                           }

                           label103: {
                              label122: {
                                 var25 = this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.contains(var13.a());
                                 if (var2 != null) {
                                    if (!((Boolean)var25)) {
                                       break label122;
                                    }

                                    var25 = var13.f();
                                 }

                                 if (var2 != null) {
                                    if (((Boolean)(var25))) {
                                       break label122;
                                    }

                                    var25 = var13.e();
                                 }

                                 if (var2 != null) {
                                    if (!((Boolean)var25)) {
                                       break label122;
                                    }

                                    var25 = var13.b();
                                 }

                                 if (var2 != null) {
                                    if ((((((Boolean)(Object)((Boolean)var25 ? 1 : 0)))) ? 1 : 0)  < 1) {
                                       break label122;
                                    }

                                    var25 = Intrinsics.areEqual(var13.a(), var1);
                                 }

                                 if (var2 == null) {
                                    break label103;
                                 }

                                 if (((Boolean)(var25))) {
                                    var25 = 1;
                                    break label103;
                                 }
                              }

                              var25 = 0;
                           }

                           if (((Boolean)(var25))) {
                              continue;
                           }

                           var9.add(var12);
                           if (var2 != null) {
                              continue;
                           }
                        }

                        var10000 = ((LocalPlayer)(Object)(var9));
                        break;
                     }

                     List var5 = (List)var10000;
                     var10000 = ((LocalPlayer)(Object)(var5));
                     if (var2 != null) {
                        if (var5.isEmpty()) {
                           return null;
                        }

                        var10000 = ((LocalPlayer)(Object)(var5));
                     }

                     Object var16 = var10000;
                     boolean var8 = false;

                     for (Object var27 : CollectionsKt.take(
                        CollectionsKt.sortedWith(
                           (Iterable)var16,
                           new lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl$IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll(
                              var3
                           )
                        ),
                        10
                     )) {
                        label68: {
                           var10002 = -12485;
                           var10003 = 14965;
                           Intrinsics.checkNotNullExpressionValue(var27, "next(...)");
                           var18 = (lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll)var27;
                           BlockState var28 = var4.getBlockState(var18.a().above());
                           var10002 = -12489;
                           var10003 = -29171;
                           Intrinsics.checkNotNullExpressionValue(var28, "getBlockState(...)");
                           BlockState var19 = var28;
                           boolean var29 = var19.isAir();
                           if (var2 != null) {
                              if (var29) {
                                 break label68;
                              }

                              this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.add(var18.a());
                           }

                           if (var2 != null) {
                              continue;
                           }
                        }

                        me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var30 = me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                        BlockPos var10001 = var18.a().offset(0, -1, 0);
                        var10003 = -12487;
                        short var10004 = 13570;
                        Intrinsics.checkNotNullExpressionValue(var10001, "offset(...)");
                         var20 = me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.b(
                           var30, var10001, false);
                        if (var2 != null) {
                           if (var20 != null) {
                              return ((lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll)(Object)(var18));
                           }

                           this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.add(var18.a());
                        }

                        if (var2 == null) {
                           break;
                        }
                     }

                     return null;
                  }
               }

               return null;
            }
         }
      }

      return null;
   }

   private final lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll a(
      lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll var1, double var2
   ) {
      String var4 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      if (var4 != null) {
         LocalPlayer var10000 = this.ap().player;
         if (var10000 != null) {
            Vec3 var15 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var10000);
            if (var15 != null) {
               Vec3 var5 = var15;
               if (var4 != null) {
                  ClientLevel var16 = this.ap().level;
                  if (var16 != null) {
                     ClientLevel var6 = var16;
                     Iterator var7 = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.values().iterator();

                     label94:
                     while (true) {
                        int var17 = ((var7.hasNext()) ? 1 : 0);

                        lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll var8;
                        do {
                           if (var17 == 0) {
                              return null;
                           }

                           var10000 = (LocalPlayer)var7.next();
                           short var10002 = -12483;
                           short var10003 = 27251;
                           Intrinsics.checkNotNullExpressionValue(var10000, "next(...)");
                           var8 = (lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll)(Object)var10000;
                           int var19 = ((Intrinsics.areEqual(var8, var1)) ? 1 : 0);
                           if (var4 != null) {
                              if (var19 != 0) {
                                 continue label94;
                              }

                              var19 = ((this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.contains(var8.a())) ? 1 : 0);
                           }

                           if (var4 != null) {
                              if (var19 != 0) {
                                 continue label94;
                              }

                              var19 = ((var8.f()) ? 1 : 0);
                           }

                           if (var4 != null) {
                              if (var19 == 0) {
                                 continue label94;
                              }

                              var19 = ((var8.e()) ? 1 : 0);
                           }

                           label108: { Object var20 = null; // PX-FIX hoist
        
       var20 = null; // PX-FIX
                              if (var4 != null) {
                                 if (var19 != 0) {
                                    continue label94;
                                 }

                                 var20 = var8;
                                 if (var4 == null) {
                                    break label108;
                                 }

                                 var19 = var8.b();
                              }

                              if (var19 < 1) {
                                 continue label94;
                              }

                              var20 = var8;
                           }

                           double var9 = ((me.octo.client.PXDyn)(Object)(var20.a())).distToCenterSqr(var5);
                           double var21 = var2 - var9;
                           if (var4 != null) {
                              if (var21 < 16.0) {
                                 continue label94;
                              }

                              me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII var22 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                              Vec3 var10001 = var8.a().getCenter();
                              var10003 = -12493;
                              short var10004 = 8783;
                              Intrinsics.checkNotNullExpressionValue(var10001, "getCenter(...)");
                              var21 = var22.d(var10001);
                           }

                           double var11 = var21;
                           double var32;
                           var17 = (var32 = var11 - 60.0) == 0.0 ? 0 : (var32 < 0.0 ? -1 : 1);
                        } while (var4 == null);

                        if (var17 <= 0) {
                           label75: {
                              BlockState var23 = var6.getBlockState(var8.a().above());
                              short var27 = -12489;
                              short var29 = -29171;
                              Intrinsics.checkNotNullExpressionValue(var23, "getBlockState(...)");
                              BlockState var13 = var23;
                              boolean var24 = var13.isAir();
                              if (var4 != null) {
                                 if (var24) {
                                    break label75;
                                 }

                                 this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.add(var8.a());
                              }

                              if (var4 != null) {
                                 continue;
                              }
                           }

                           me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var25 = me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                           BlockPos var26 = var8.a().offset(0, -1, 0);
                           short var30 = -12495;
                           short var31 = 9324;
                           Intrinsics.checkNotNullExpressionValue(var26, "offset(...)");
                           List var14 = me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.b(
                              var25, var26, false);
                           if (var4 != null) {
                              if (var14 != null) {
                                 return var8;
                              }

                              this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.add(var8.a());
                           }

                           if (var4 == null) {
                              return null;
                           }
                        }
                     }
                  }
               }

               return null;
            }
         }
      }

      return null;
   }

   // $VF: Extended synchronized range to monitorexit
   private final void a5() {
      String var10000 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI
         .values()
         .removeIf(null);
      String var1 = var10000;
      int var9 = this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.size();
      short var10001 = 200;
      if (var1 != null) {
         if (var9 <= 200) {
            return;
         }

         var9 = this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.size();
         var10001 = 150;
      }

      int var2 = var9 - var10001;
      Set var10 = this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
      short var10002 = -12498;
      short var10003 = 9934;
      Intrinsics.checkNotNullExpressionValue(this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll, "permanentBlacklist");
      Set var3 = var10;
      synchronized (var3) {
         boolean var4 = false;
         Iterator var5 = this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.iterator();
         int var6 = 0;

         while (var5.hasNext() && var6 < var2) {
            var5.next();
            var5.remove();
            var6++;
            if (var1 == null) {
               break;
            }
         }

         Unit var8 = Unit.INSTANCE;
      }
   }

   private final void a6() {
      Object llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl = null; // PX-FIX
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .p();
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = null;
      this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = null;
      this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII = false;
      this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = null;
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = 0;
      this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII.f();
   }

   private final void a7() {
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.clear();
      this.a6();
      this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = 0;
      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = 0;
      this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll.f();
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
      );
   }

   @Override
   public void M() {
      Object llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl = null; // PX-FIX
      String var10000 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      this.aM();
      String var1 = var10000;
      if (var1 != null) {
         if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g()
            != me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl
            )
          {
            this.b(
               CollectionsKt.listOf(
                  me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl
               )
            );
            this.N();
            return;
         }

         super.M();
      }

      llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI[] var2 = new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI[]{
         new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
            me.octo.client.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl::ba,
            true
         ),
         new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
            me.octo.client.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
            lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl::bb,
            false
         ),
         new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
            me.octo.client.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl::bc,
            false
         )
      };
      this.a(CollectionsKt.listOf(var2));
      this.a9();
   }

   private final void a8() {
      label16: {
         String var1 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
         if (var1 != null) {
            if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .g()
               != me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl
               )
             {
               break label16;
            }

            this.a9();
         }

         if (var1 != null) {
            return;
         }
      }

      this.a(
         me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl,
         2000
      );
   }

   private final void a9() {
      Object var3 = null; // PX-FIX
      String var10000 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      int var2 = CollectionsKt.getLastIndex(this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI);
      String var1 = var10000;

      label27: {
         while (true) {
            if (-1 < var2) {
               if (var1 == null) {
                  break;
               }

               var3 = IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                  ((BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                     .e())),
                  ((IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll)(Object)(this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI.get(var2))),
                  0,
                  false);
               if (var1 == null) {
                  break label27;
               }

               if (!((Boolean)var3)) {
                  this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = var2;
                  this.a(
                     IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  );
                  var3 = var2 + 1;
                  break label27;
               }

               var2--;
               if (var1 != null) {
                  continue;
               }
            }

            short var4 = -12524;
            short var10001 = 6460;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
               "Couldn't path to any startup waypoint, starting directly"
            );
            this.a7();
            break;
         }

         return;
      }

      int var5 = this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI.size();
      short var10002 = -12488;
      short var10003 = -20959;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
         "Traveling to waypoint " + var3 + "/" + var5
      );
   }

   private final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      this.ae()
         .a(
            new lllIllIIllIIIIIIIlIIlIIIIIllllIlIIIIIllllIIlIIIIlllIIIIIIlIIIIlIlIIIIllIIllIIlllIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl,
               (kotlin.jvm.functions.Function1)(lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl::h),
               var1.d(),
               0,
               0,
               0L,
               0,
               (kotlin.jvm.functions.Function1)(lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl::i),
               120,
               null
            )
         );
   }

   private final void a_() {
      Object llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl = null; // PX-FIX
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.clear();
      String var10000 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      this.a6();
      this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = 0;
      String var1 = var10000;
      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = 0;
      this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll.f();
      if (var1 != null) {
         if (!IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .e()
            .d()) {
            IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
               .e()
               .k();
         }

         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .t();
         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .v();
      }
   }

   @Override
   public void N() {
      Object llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl = null; // PX-FIX
      String var10000 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.clear();
      String var1 = var10000;
      this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.clear();
      this.a6();
      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = 0;
      if (var1 != null) {
         if (!IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .e()
            .d()) {
            IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
               .e()
               .k();
         }

         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .v();
         this.aN();
         super.N();
      }
   }

   @Override
   public void ah() {
      this.a8();
   }

   @Override
   public void aB() {
      this.a8();
   }

   @Override
   public void aH() {
      this.a8();
   }

   private final lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(
      lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll var1
   ) {
      String var2 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var10000;
      if (var2 != null && var1 != null) {
         boolean var4 = false;
         var10000 = new lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
            var1.a(), var1.b(), var1.c(), var1.d()
         );
      } else {
         var10000 = null;
      }

      return var10000;
   }

   private static final long a(lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl var0) {
      return var0.aJ().b() + 15000L;
   }

   private static final Object b(lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl var0) {
      return TuplesKt.to(
         var0.aJ().a(),
         IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
      );
   }

   private static final Object c(lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl var0) {
      return new lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
         var0.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII,
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .e()
            .d(),
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(var0, 0.0, 1, null)
      );
   }

   private static final Object d(lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl var0) {
      return new lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
         var0.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.size(),
         var0.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.size(),
         var0.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl,
         var0.a(var0.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI)
      );
   }

   private static final Object e(lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl var0) {
      return new lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI(
         var0.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.size(),
         var0.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl,
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .e()
            .d(),
         var0.a(var0.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI),
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(var0, 0.0, 1, null)
      );
   }

   private static final Object f(lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl var0) {
      return new lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         var0.a(var0.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI),
         var0.a(var0.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII),
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .e()
            .d(),
         var0.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII,
         var0.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl,
         var0.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll,
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(var0, 0.0, 1, null)
      );
   }

   private static final Object g(lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl var0) {
      return new lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         var0.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll,
         var0.a(var0.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI),
         a(var0, 0.0, 1, null),
         var0.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll,
         me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .i()
      );
   }

   private static final Unit a(
      lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl var0,
      lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll var1
   ) {
      var0.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = var0.a(var1.a());
      var0.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII = false;
      return Unit.INSTANCE;
   }

   private static final boolean b(lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll var0) {
      String var10000 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      short var10002 = -12481;
      short var10003 = -146;
      Intrinsics.checkNotNullParameter(var0, "it");
      String var1 = var10000;
      boolean var2 = var0.f();
      if (var1 != null) {
         if (var2) {
            return false;
         }

         var2 = var0.e();
      }

      return var1 == null ? var2 : !var2;
   }

   private static final boolean a(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final boolean ba() {
      return lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .b();
   }

   private static final boolean bb() {
      return IlllIIIIlIlllIlllllIlIlIIllIlllIlIIllllllIlllllIllIllllIllIIIllIIlIlIlllIIlIllIIlIlll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .a();
   }

   private static final boolean bc() {
      return IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .e();
   }

   private static final Unit h(lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl var0) {
      var0.a9();
      return Unit.INSTANCE;
   }

   private static final Unit i(lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl var0) {
      var0.a_();
      return Unit.INSTANCE;
   }

   @NotNull
   public static final lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl bd() {
      return lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI.a();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static { char[] var20 = null; // PX-FIX hoist
        
       var20 = null; // PX-FIX
      String[] var5 = new String[35];
      int var3 = 0;
      String var2 = "jþ$\u0097V\u000b~\u0006\u0006e\u0080 \u0080V \u0004\u0088z4ï¹\u000f\"\u008c\u00ad\u0085\u0089\u008a«þrÉ\tr?hð3\u0085BÀVRÚã8f\u0012ãv;â~lÝ\u0098\u000fÙ\u001e:¾\u0005ÌKä\f\u0012è\u0091Z\u001eRóXk¿§\bõ|ü\u0094tïë\u000b\u0099How\u00adÒÄrs3\u000bC³ÐÓ\tb\u0097h*|ØKµ¤çXQk\u00ad\u00ad\u0000_´ç¸°o`þ\u0016fÉØÙDø\u009b\u0006+\u0013 SSÚ\u001d¦\u008a\u0013Äd\u008f\u0093jV\u0004Î\u0087\u0096w`\u001al´\u009e/fuý\u000e\u001eÓ\u0084W\u0080ú=eÇõM29\u0014\n·\u00912öáBK·D\u008c\t\u0012ð!\u0004ô\u0001\r\u0019\u008b\u0005\u0005\u0082´!¤\u0002¶*%F@×@$î§N\u0016\"\u008a:ä¬+¢1L&\u0014\u008f5Dñ\u000b\u001f\u0017ðá½^â\u000f\u001e\u009d\u000fØ\u000b\u009b·/\u0088¥-Å\u008dSÌ\u000f\u0016Þ\u009fÜ\u001e<B·;=\\ÿOp\u008c·\u0099s\u00adö\f~þ\tè´~\u008c\u001f\u0010p;$\u0016\u0013\u0095\u001a\u0083'ÒW%ÄM¨\u0095/(J\u0002Sj \u009f»o\u0017\u007féLÏL\u008dÅ¤Ù|ñ\u009c.Û\u0019Æ5\\ª4\u0093RÇ\nV\u00070á\u001fÃÄ\u0087µ\u008aL±{A\u007ff8\u0019\u009aè'mÉ`èþ_\"0òn@z:\u001b«!\u008fyð\b\u0011g8ä\u001dS\u0015uDö:Ù9}¾Èã\"¶\u0081º\u0005tÄ5P\u0095z\u0089ï¨ÐÚaÖ\u0016\u0094\n¨äÿë,f{6\bøÖ[\u009e¿¢\u0082\u008b\u0015\u0080Âhii\u008f\u009e\u008eý8\u008f;ËýÖ¸À\u0007Ò@ì\u0015\u000f\u0092\u0099cWÎY¦\u0005=\u0090\u009b(éª:OS!CÕ\nb¯¶ôÏaÞÓö\u0000\u0015  |5ë\u0004Îÿ÷\u0016ÎþãEÓ¯`ÿÎ\u0004h\u0011Û\u009d\u001dëÈ¤`¼Ü«\u0094\ròæ¡ñN'\u0081\u0091ÍÿáI0\u0098*\u008baw3TU\u008cÓ\u008b¾þ¨rNE\u0001-&Ú\u0096S®\u0086ìnÛ\u0012\u0010\u001eï\u001f}\u008c\u0081E\u009c~øeì\u0005\u0080Ä9iø\u0003`.\u0005Ñë{Â@®43y\u0090\u0094E\u0012Y¤\u009f\u0097!\t\u009c\u0010Æ[é\u008fêGÂorz\u0016dSô[úÉìF³!F\u0018ò\u0099ñ4$\u0092Jne»\u0005©\u0089!@\u0016\u001eÔÝN´Îé\u0010>JëÍq\u0013õD·x1\u0012\u0094½\u0087\u000e\u0019Õ\u001f\u0080y¿(\u0015§7\u008c×õX\rt\u008fgÁÐ\u0002\u0080ï\u0017çè8þp\u000e\u0084\u009c×¾êÇpÂn\u0001x¬\u009fÇ";
      int var4 = "jþ$\u0097V\u000b~\u0006\u0006e\u0080 \u0080V \u0004\u0088z4ï¹\u000f\"\u008c\u00ad\u0085\u0089\u008a«þrÉ\tr?hð3\u0085BÀVRÚã8f\u0012ãv;â~lÝ\u0098\u000fÙ\u001e:¾\u0005ÌKä\f\u0012è\u0091Z\u001eRóXk¿§\bõ|ü\u0094tïë\u000b\u0099How\u00adÒÄrs3\u000bC³ÐÓ\tb\u0097h*|ØKµ¤çXQk\u00ad\u00ad\u0000_´ç¸°o`þ\u0016fÉØÙDø\u009b\u0006+\u0013 SSÚ\u001d¦\u008a\u0013Äd\u008f\u0093jV\u0004Î\u0087\u0096w`\u001al´\u009e/fuý\u000e\u001eÓ\u0084W\u0080ú=eÇõM29\u0014\n·\u00912öáBK·D\u008c\t\u0012ð!\u0004ô\u0001\r\u0019\u008b\u0005\u0005\u0082´!¤\u0002¶*%F@×@$î§N\u0016\"\u008a:ä¬+¢1L&\u0014\u008f5Dñ\u000b\u001f\u0017ðá½^â\u000f\u001e\u009d\u000fØ\u000b\u009b·/\u0088¥-Å\u008dSÌ\u000f\u0016Þ\u009fÜ\u001e<B·;=\\ÿOp\u008c·\u0099s\u00adö\f~þ\tè´~\u008c\u001f\u0010p;$\u0016\u0013\u0095\u001a\u0083'ÒW%ÄM¨\u0095/(J\u0002Sj \u009f»o\u0017\u007féLÏL\u008dÅ¤Ù|ñ\u009c.Û\u0019Æ5\\ª4\u0093RÇ\nV\u00070á\u001fÃÄ\u0087µ\u008aL±{A\u007ff8\u0019\u009aè'mÉ`èþ_\"0òn@z:\u001b«!\u008fyð\b\u0011g8ä\u001dS\u0015uDö:Ù9}¾Èã\"¶\u0081º\u0005tÄ5P\u0095z\u0089ï¨ÐÚaÖ\u0016\u0094\n¨äÿë,f{6\bøÖ[\u009e¿¢\u0082\u008b\u0015\u0080Âhii\u008f\u009e\u008eý8\u008f;ËýÖ¸À\u0007Ò@ì\u0015\u000f\u0092\u0099cWÎY¦\u0005=\u0090\u009b(éª:OS!CÕ\nb¯¶ôÏaÞÓö\u0000\u0015  |5ë\u0004Îÿ÷\u0016ÎþãEÓ¯`ÿÎ\u0004h\u0011Û\u009d\u001dëÈ¤`¼Ü«\u0094\ròæ¡ñN'\u0081\u0091ÍÿáI0\u0098*\u008baw3TU\u008cÓ\u008b¾þ¨rNE\u0001-&Ú\u0096S®\u0086ìnÛ\u0012\u0010\u001eï\u001f}\u008c\u0081E\u009c~øeì\u0005\u0080Ä9iø\u0003`.\u0005Ñë{Â@®43y\u0090\u0094E\u0012Y¤\u009f\u0097!\t\u009c\u0010Æ[é\u008fêGÂorz\u0016dSô[úÉìF³!F\u0018ò\u0099ñ4$\u0092Jne»\u0005©\u0089!@\u0016\u001eÔÝN´Îé\u0010>JëÍq\u0013õD·x1\u0012\u0094½\u0087\u000e\u0019Õ\u001f\u0080y¿(\u0015§7\u008c×õX\rt\u008fgÁÐ\u0002\u0080ï\u0017çè8þp\u000e\u0084\u009c×¾êÇpÂn\u0001x¬\u009fÇ"
         .length();
      char var1 = 14;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 109;
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
                     case 1 -> 2;
                     case 2 -> 58;
                     case 3 -> 39;
                     case 4 -> 8;
                     case 5 -> 113;
                     default -> 81;
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
                     i = new String[35];
                     lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = new lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = new lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl();
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

                  var2 = "}$µ1z\u0000ì×j4SÿæIÍv'vÝSTOÎÑ\np¡èÏ\u0000ø»QçQ\u0010\u000eÉ@\u0090ñ\u0002¶mÇb¨f\u0096\u0081\\U\u008fd;c\u0017U\u0086.\u001d]ýä<N\u0092\u0005\u0092f4\u009f}\u0015@\u0087:Öo\u001a";
                  var4 = "}$µ1z\u0000ì×j4SÿæIÍv'vÝSTOÎÑ\np¡èÏ\u0000ø»QçQ\u0010\u000eÉ@\u0090ñ\u0002¶mÇb¨f\u0096\u0081\\U\u008fd;c\u0017U\u0086.\u001d]ýä<N\u0092\u0005\u0092f4\u009f}\u0015@\u0087:Öo\u001a"
                     .length();
                  var1 = '8';
                  var8 = -1;
            }

            var10000 = 114;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -12491) & 65535;
      if (i[var2] == null) {
         char[] var3 = h[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 148;
            case 1 -> 153;
            case 2 -> 197;
            case 3 -> 127;
            case 4 -> 229;
            case 5 -> 168;
            case 6 -> 103;
            case 7 -> 177;
            case 8 -> 192;
            case 9 -> 174;
            case 10 -> 56;
            case 11 -> 154;
            case 12 -> 61;
            case 13 -> 82;
            case 14 -> 165;
            case 15 -> 213;
            case 16 -> 33;
            case 17 -> 160;
            case 18 -> 173;
            case 19 -> 92;
            case 20 -> 188;
            case 21 -> 13;
            case 22 -> 158;
            case 23 -> 245;
            case 24 -> 159;
            case 25 -> 83;
            case 26 -> 67;
            case 27 -> 85;
            case 28 -> 23;
            case 29 -> 222;
            case 30 -> 84;
            case 31 -> 179;
            case 32 -> 58;
            case 33 -> 93;
            case 34 -> 130;
            case 35 -> 54;
            case 36 -> 2;
            case 37 -> 143;
            case 38 -> 120;
            case 39 -> 253;
            case 40 -> 26;
            case 41 -> 89;
            case 42 -> 126;
            case 43 -> 96;
            case 44 -> 251;
            case 45 -> 211;
            case 46 -> 53;
            case 47 -> 5;
            case 48 -> 105;
            case 49 -> 184;
            case 50 -> 161;
            case 51 -> 97;
            case 52 -> 123;
            case 53 -> 104;
            case 54 -> 35;
            case 55 -> 95;
            case 56 -> 146;
            case 57 -> 216;
            case 58 -> 239;
            case 59 -> 41;
            case 60 -> 201;
            case 61 -> 36;
            case 62 -> 134;
            case 63 -> 78;
            case 64 -> 0;
            case 65 -> 202;
            case 66 -> 100;
            case 67 -> 223;
            case 68 -> 176;
            case 69 -> 156;
            case 70 -> 107;
            case 71 -> 48;
            case 72 -> 50;
            case 73 -> 40;
            case 74 -> 136;
            case 75 -> 248;
            case 76 -> 65;
            case 77 -> 16;
            case 78 -> 87;
            case 79 -> 75;
            case 80 -> 243;
            case 81 -> 60;
            case 82 -> 128;
            case 83 -> 250;
            case 84 -> 247;
            case 85 -> 25;
            case 86 -> 115;
            case 87 -> 151;
            case 88 -> 64;
            case 89 -> 212;
            case 90 -> 145;
            case 91 -> 233;
            case 92 -> 194;
            case 93 -> 88;
            case 94 -> 138;
            case 95 -> 141;
            case 96 -> 142;
            case 97 -> 73;
            case 98 -> 4;
            case 99 -> 219;
            case 100 -> 68;
            case 101 -> 45;
            case 102 -> 234;
            case 103 -> 144;
            case 104 -> 90;
            case 105 -> 171;
            case 106 -> 52;
            case 107 -> 218;
            case 108 -> 204;
            case 109 -> 112;
            case 110 -> 9;
            case 111 -> 150;
            case 112 -> 117;
            case 113 -> 1;
            case 114 -> 66;
            case 115 -> 125;
            case 116 -> 139;
            case 117 -> 237;
            case 118 -> 246;
            case 119 -> 30;
            case 120 -> 28;
            case 121 -> 27;
            case 122 -> 7;
            case 123 -> 72;
            case 124 -> 195;
            case 125 -> 108;
            case 126 -> 185;
            case 127 -> 15;
            case 128 -> 8;
            case 129 -> 217;
            case 130 -> 240;
            case 131 -> 140;
            case 132 -> 79;
            case 133 -> 242;
            case 134 -> 43;
            case 135 -> 175;
            case 136 -> 86;
            case 137 -> 193;
            case 138 -> 39;
            case 139 -> 94;
            case 140 -> 51;
            case 141 -> 198;
            case 142 -> 220;
            case 143 -> 59;
            case 144 -> 190;
            case 145 -> 102;
            case 146 -> 205;
            case 147 -> 132;
            case 148 -> 135;
            case 149 -> 225;
            case 150 -> 62;
            case 151 -> 124;
            case 152 -> 32;
            case 153 -> 77;
            case 154 -> 164;
            case 155 -> 230;
            case 156 -> 18;
            case 157 -> 129;
            case 158 -> 189;
            case 159 -> 98;
            case 160 -> 181;
            case 161 -> 44;
            case 162 -> 207;
            case 163 -> 209;
            case 164 -> 241;
            case 165 -> 157;
            case 166 -> 221;
            case 167 -> 226;
            case 168 -> 3;
            case 169 -> 152;
            case 170 -> 37;
            case 171 -> 22;
            case 172 -> 76;
            case 173 -> 166;
            case 174 -> 113;
            case 175 -> 42;
            case 176 -> 231;
            case 177 -> 109;
            case 178 -> 122;
            case 179 -> 71;
            case 180 -> 249;
            case 181 -> 191;
            case 182 -> 210;
            case 183 -> 137;
            case 184 -> 29;
            case 185 -> 11;
            case 186 -> 172;
            case 187 -> 91;
            case 188 -> 47;
            case 189 -> 155;
            case 190 -> 6;
            case 191 -> 200;
            case 192 -> 182;
            case 193 -> 169;
            case 194 -> 215;
            case 195 -> 147;
            case 196 -> 80;
            case 197 -> 224;
            case 198 -> 121;
            case 199 -> 208;
            case 200 -> 236;
            case 201 -> 206;
            case 202 -> 252;
            case 203 -> 110;
            case 204 -> 187;
            case 205 -> 149;
            case 206 -> 24;
            case 207 -> 57;
            case 208 -> 69;
            case 209 -> 55;
            case 210 -> 99;
            case 211 -> 180;
            case 212 -> 244;
            case 213 -> 116;
            case 214 -> 131;
            case 215 -> 14;
            case 216 -> 228;
            case 217 -> 63;
            case 218 -> 106;
            case 219 -> 101;
            case 220 -> 111;
            case 221 -> 196;
            case 222 -> 232;
            case 223 -> 118;
            case 224 -> 167;
            case 225 -> 238;
            case 226 -> 19;
            case 227 -> 178;
            case 228 -> 119;
            case 229 -> 46;
            case 230 -> 227;
            case 231 -> 49;
            case 232 -> 12;
            case 233 -> 34;
            case 234 -> 17;
            case 235 -> 183;
            case 236 -> 10;
            case 237 -> 114;
            case 238 -> 170;
            case 239 -> 81;
            case 240 -> 162;
            case 241 -> 133;
            case 242 -> 38;
            case 243 -> 255;
            case 244 -> 199;
            case 245 -> 74;
            case 246 -> 163;
            case 247 -> 70;
            case 248 -> 203;
            case 249 -> 31;
            case 250 -> 254;
            case 251 -> 20;
            case 252 -> 235;
            case 253 -> 186;
            case 254 -> 214;
            default -> 21;
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


   static net.minecraft.core.BlockPos a(me.octo.client.lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl var0, double var1, int var3, java.lang.Object var4) {
      if ((var3 & 1) != 0) {
         var1 = 5.5D;
      }
      return var0.b(var1);
   }

   public static final void a(me.octo.client.lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl var0, me.octo.client.IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      var0.a(var1);
   }

   static me.octo.client.lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll a(me.octo.client.lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl var0, net.minecraft.core.BlockPos var1, int var2, java.lang.Object var3) {
      if ((var2 & 1) != 0) {
         var1 = null;
      }
      return var0.a(var1);
   }

   public static final me.octo.client.lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl be() {
      return lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
   }
   private static final class IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final Triple<Integer, Integer, Integer> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
         int var1, boolean var2, @NotNull Triple<Integer, Integer, Integer> var3
      ) {
         short var10001 = -3591;
         short var10002 = 2872;
         Intrinsics.checkNotNullParameter(var3, "playerPos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl =((Triple)( var3));
      }

      public final int a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final boolean b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final int d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final boolean e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI a(
         int var1, boolean var2, @NotNull Triple<Integer, Integer, Integer> var3
      ) {
         short var10001 = -3589;
         short var10002 = -16601;
         Intrinsics.checkNotNullParameter(var3, "playerPos");
         return new lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
            var1, var2,((Triple)( var3
         )));
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -3585;
         Triple var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         boolean var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -32662;
         short var10002 = -3590;
         short var10003 = -32062;
         short var10004 = -3592;
         short var10005 = 6412;
         return "SetupProgress(startupIndex=" + var3 + ", walkerFinished=" + var2 + ", playerPos=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var1 = var1 * 31 + Boolean.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         return var1 * 31 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
      Object var4 = null; // PX-FIX
         String var2 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI
            )) {
               return false;
            }

            var10000 = var1;
         }

         label48: {
            lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var3 = (lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI)var10000;
            var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            int var10001 = var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            if (var2 != null) {
               if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
                  return false;
               }

               var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               if (var2 == null) {
                  break label48;
               }

               var10001 = ((var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) ? 1 : 0);
            }

            if ((Boolean)var4 != ((var10001 == 0))) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            );
         }

         if (var2 != null) {
            if (((Boolean)(var4))) {
               return false;
            }

            var4 = 1;
         }

         return (boolean)var4;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static { char[] var20 = null; // PX-FIX hoist
        
       var20 = null; // PX-FIX
         String[] var5 = new String[5];
         int var3 = 0;
         String var2 = "\u008e\u001b¶¦\rO\n\u001aí\u0011ï\u0082[Hm\u0090\u001bÆiõ\u0090`}\u0012wÆb\ty\u0093H·Òmñ^\u0092";
         int var4 = "\u008e\u001b¶¦\rO\n\u001aí\u0011ï\u0082[Hm\u0090\u001bÆiõ\u0090`}\u0012wÆb\ty\u0093H·Òmñ^\u0092".length();
         char var1 = '\t';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 105;
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
                        case 0 -> 74;
                        case 1 -> 107;
                        case 2 -> 117;
                        case 3 -> 116;
                        case 4 -> 25;
                        case 5 -> 117;
                        default -> 85;
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
                        b = new String[5];
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

                     var2 = "¼\u009c\u0005µ\u007f¢Æã÷d¹ó\u001bs^h\u0019G$å\"Qÿªpc:\u0091¨\u0005óY» v²\u0081þ`§";
                     var4 = "¼\u009c\u0005µ\u007f¢Æã÷d¹ó\u001bs^h\u0019G$å\"Qÿªpc:\u0091¨\u0005óY» v²\u0081þ`§".length();
                     var1 = '\f';
                     var8 = -1;
               }

               var10000 = 120;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -3589) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 20;
               case 1 -> 229;
               case 2 -> 235;
               case 3 -> 216;
               case 4 -> 164;
               case 5 -> 194;
               case 6 -> 189;
               case 7 -> 230;
               case 8 -> 250;
               case 9 -> 212;
               case 10 -> 87;
               case 11 -> 31;
               case 12 -> 215;
               case 13 -> 32;
               case 14 -> 239;
               case 15 -> 37;
               case 16 -> 38;
               case 17 -> 4;
               case 18 -> 13;
               case 19 -> 140;
               case 20 -> 16;
               case 21 -> 77;
               case 22 -> 193;
               case 23 -> 60;
               case 24 -> 252;
               case 25 -> 22;
               case 26 -> 184;
               case 27 -> 129;
               case 28 -> 43;
               case 29 -> 23;
               case 30 -> 49;
               case 31 -> 159;
               case 32 -> 9;
               case 33 -> 190;
               case 34 -> 145;
               case 35 -> 232;
               case 36 -> 121;
               case 37 -> 205;
               case 38 -> 91;
               case 39 -> 151;
               case 40 -> 155;
               case 41 -> 152;
               case 42 -> 173;
               case 43 -> 174;
               case 44 -> 30;
               case 45 -> 40;
               case 46 -> 56;
               case 47 -> 119;
               case 48 -> 69;
               case 49 -> 224;
               case 50 -> 206;
               case 51 -> 66;
               case 52 -> 178;
               case 53 -> 248;
               case 54 -> 161;
               case 55 -> 134;
               case 56 -> 42;
               case 57 -> 108;
               case 58 -> 198;
               case 59 -> 196;
               case 60 -> 123;
               case 61 -> 210;
               case 62 -> 241;
               case 63 -> 15;
               case 64 -> 73;
               case 65 -> 88;
               case 66 -> 237;
               case 67 -> 201;
               case 68 -> 1;
               case 69 -> 143;
               case 70 -> 46;
               case 71 -> 3;
               case 72 -> 238;
               case 73 -> 107;
               case 74 -> 148;
               case 75 -> 218;
               case 76 -> 63;
               case 77 -> 149;
               case 78 -> 110;
               case 79 -> 254;
               case 80 -> 45;
               case 81 -> 197;
               case 82 -> 109;
               case 83 -> 208;
               case 84 -> 10;
               case 85 -> 131;
               case 86 -> 67;
               case 87 -> 227;
               case 88 -> 111;
               case 89 -> 97;
               case 90 -> 14;
               case 91 -> 200;
               case 92 -> 221;
               case 93 -> 154;
               case 94 -> 51;
               case 95 -> 128;
               case 96 -> 195;
               case 97 -> 50;
               case 98 -> 175;
               case 99 -> 249;
               case 100 -> 222;
               case 101 -> 95;
               case 102 -> 64;
               case 103 -> 122;
               case 104 -> 150;
               case 105 -> 114;
               case 106 -> 84;
               case 107 -> 34;
               case 108 -> 217;
               case 109 -> 182;
               case 110 -> 2;
               case 111 -> 179;
               case 112 -> 157;
               case 113 -> 240;
               case 114 -> 5;
               case 115 -> 255;
               case 116 -> 139;
               case 117 -> 61;
               case 118 -> 98;
               case 119 -> 132;
               case 120 -> 94;
               case 121 -> 188;
               case 122 -> 59;
               case 123 -> 12;
               case 124 -> 186;
               case 125 -> 169;
               case 126 -> 181;
               case 127 -> 180;
               case 128 -> 214;
               case 129 -> 120;
               case 130 -> 101;
               case 131 -> 25;
               case 132 -> 27;
               case 133 -> 137;
               case 134 -> 127;
               case 135 -> 29;
               case 136 -> 100;
               case 137 -> 245;
               case 138 -> 125;
               case 139 -> 199;
               case 140 -> 96;
               case 141 -> 166;
               case 142 -> 106;
               case 143 -> 124;
               case 144 -> 253;
               case 145 -> 133;
               case 146 -> 243;
               case 147 -> 92;
               case 148 -> 26;
               case 149 -> 209;
               case 150 -> 76;
               case 151 -> 156;
               case 152 -> 8;
               case 153 -> 65;
               case 154 -> 244;
               case 155 -> 172;
               case 156 -> 90;
               case 157 -> 207;
               case 158 -> 89;
               case 159 -> 158;
               case 160 -> 41;
               case 161 -> 141;
               case 162 -> 171;
               case 163 -> 44;
               case 164 -> 80;
               case 165 -> 83;
               case 166 -> 54;
               case 167 -> 138;
               case 168 -> 153;
               case 169 -> 62;
               case 170 -> 204;
               case 171 -> 223;
               case 172 -> 39;
               case 173 -> 74;
               case 174 -> 203;
               case 175 -> 78;
               case 176 -> 102;
               case 177 -> 192;
               case 178 -> 52;
               case 179 -> 33;
               case 180 -> 135;
               case 181 -> 104;
               case 182 -> 11;
               case 183 -> 6;
               case 184 -> 18;
               case 185 -> 231;
               case 186 -> 211;
               case 187 -> 144;
               case 188 -> 115;
               case 189 -> 103;
               case 190 -> 130;
               case 191 -> 219;
               case 192 -> 58;
               case 193 -> 167;
               case 194 -> 146;
               case 195 -> 81;
               case 196 -> 21;
               case 197 -> 236;
               case 198 -> 234;
               case 199 -> 165;
               case 200 -> 113;
               case 201 -> 126;
               case 202 -> 47;
               case 203 -> 7;
               case 204 -> 226;
               case 205 -> 185;
               case 206 -> 117;
               case 207 -> 112;
               case 208 -> 183;
               case 209 -> 170;
               case 210 -> 99;
               case 211 -> 72;
               case 212 -> 105;
               case 213 -> 187;
               case 214 -> 191;
               case 215 -> 82;
               case 216 -> 247;
               case 217 -> 79;
               case 218 -> 28;
               case 219 -> 70;
               case 220 -> 177;
               case 221 -> 225;
               case 222 -> 0;
               case 223 -> 48;
               case 224 -> 228;
               case 225 -> 168;
               case 226 -> 24;
               case 227 -> 55;
               case 228 -> 163;
               case 229 -> 93;
               case 230 -> 17;
               case 231 -> 233;
               case 232 -> 202;
               case 233 -> 162;
               case 234 -> 71;
               case 235 -> 142;
               case 236 -> 213;
               case 237 -> 118;
               case 238 -> 116;
               case 239 -> 242;
               case 240 -> 147;
               case 241 -> 176;
               case 242 -> 68;
               case 243 -> 35;
               case 244 -> 57;
               case 245 -> 86;
               case 246 -> 160;
               case 247 -> 251;
               case 248 -> 246;
               case 249 -> 85;
               case 250 -> 19;
               case 251 -> 53;
               case 252 -> 220;
               case 253 -> 136;
               case 254 -> 36;
               default -> 75;
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
      public static IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI a(IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI p0, int p1, boolean p2, kotlin.Triple p3, int p4, java.lang.Object p5) {
         if ((p4 & 1) != 0) p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if ((p4 & 2) != 0) p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if ((p4 & 4) != 0) p3 = p0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         return p0.a(p1, p2, p3);
      }
   }

   private static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      @Nullable
      private final lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @Nullable
      private final lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private final int IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      @NotNull
      private final Triple<Integer, Integer, Integer> IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private static String[] a;
      private static String[] b;

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         @Nullable lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var1,
         @Nullable lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var2,
         boolean var3,
         boolean var4,
         int var5,
         int var6,
         @NotNull Triple<Integer, Integer, Integer> var7
      ) {
         short var10001 = 18587;
         short var10002 = -11132;
         Intrinsics.checkNotNullParameter(var7, "playerPos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var6;
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var7;
      }

      @Nullable
      public final lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final boolean d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final int e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final int f() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> g() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      @Nullable
      public final lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll h() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll i() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean j() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final boolean k() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final int l() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final int m() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> n() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      @NotNull
      public final lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
         @Nullable lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var1,
         @Nullable lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var2,
         boolean var3,
         boolean var4,
         int var5,
         int var6,
         @NotNull Triple<Integer, Integer, Integer> var7
      ) {
         short var10001 = 18591;
         short var10002 = -12317;
         Intrinsics.checkNotNullParameter(var7, "playerPos");
         return new lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            var1, var2, var3, var4, var5, var6, var7
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 18584;
         Triple var1 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         int var2 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         int var3 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         boolean var4 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         boolean var5 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var6 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var7 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 23353;
         short var10002 = 18585;
         short var10003 = 30907;
         short var10004 = 18586;
         byte var10005 = 109;
         short var10006 = 18589;
         short var10007 = -6254;
         short var10008 = 18578;
         short var10009 = 6171;
         short var10010 = 18588;
         short var10011 = -6611;
         short var10012 = 18590;
         short var10013 = -19759;
         return "MoveProgress(target="
            + var7
            + ", next="
            + var6
            + ", walkerFinished="
            + var5
            + ", scanningNext="
            + var4
            + ", strafeAttempts="
            + var3
            + ", retargetCooldown="
            + var2
            + ", playerPos="
            + var1
            + ")";
      }

      @Override
      public int hashCode() {
         String var1;
         int var8;
         label25: {
            var1 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
            lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            if (var1 != null) {
               if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl == null) {
                  var8 = 0;
                  break label25;
               }

               var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            }

            var8 = var10000.hashCode();
         }

         int var10;
         label19: {
            int var2 = var8;
            var8 = var2 * 31;
            lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (var1 != null) {
               if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII == null) {
                  var10 = 0;
                  break label19;
               }

               var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            var10 = var10001.hashCode();
         }

         int var3 = var8 + var10;
         var3 = var3 * 31 + Boolean.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         var3 = var3 * 31 + Boolean.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         var3 = var3 * 31 + Integer.hashCode(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         var3 = var3 * 31 + Integer.hashCode(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
         return var3 * 31 + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = (lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var10000;
         int var4 = ((Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )) ? 1 : 0);
         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) ? 1 : 0);
         }

         int var10001 = ((var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) ? 1 : 0);
         if (var2 != null) {
            if (var4 !=( (!var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) ? 1 : 0)) {
               return false;
            }

            var4 = ((this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0);
            var10001 = ((var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 != var10001) {
               return false;
            }

            var4 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            var10001 = var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         }

         label80: {
            if (var2 != null) {
               if (var4 != var10001) {
                  return false;
               }

               var4 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
               if (var2 == null) {
                  break label80;
               }

               var10001 = var3.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            }

            if (var4 != var10001) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
               var3.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static { char[] var20 = null; // PX-FIX hoist
        
       var20 = null; // PX-FIX
         String[] var5 = new String[9];
         int var3 = 0;
         String var2 = "~ÿØhÉ¤é¡ù¨\r\u001fþ\u009bæ9á\t\u000e\u0082\u0017\u001aíèp\u000fl\u0014h\u0088V$\u0005°Á\f\u0083¦íI\u0007\u0014íA^£\u0013\u000f\u0007\u0087îþN#ûz\f\u0017\u001aòÙf,°àÄ\u0086cH\t\u009a\u0092\u0085\u0018¿¨:\u0007%\u0013µÀ¤\u008bûV£¡f\u0002\u0094òYä\u008cYÇ\u0015{";
         int var4 = "~ÿØhÉ¤é¡ù¨\r\u001fþ\u009bæ9á\t\u000e\u0082\u0017\u001aíèp\u000fl\u0014h\u0088V$\u0005°Á\f\u0083¦íI\u0007\u0014íA^£\u0013\u000f\u0007\u0087îþN#ûz\f\u0017\u001aòÙf,°àÄ\u0086cH\t\u009a\u0092\u0085\u0018¿¨:\u0007%\u0013µÀ¤\u008bûV£¡f\u0002\u0094òYä\u008cYÇ\u0015{"
            .length();
         char var1 = 17;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 45;
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
                        case 0 -> 96;
                        case 1 -> 64;
                        case 2 -> 77;
                        case 3 -> 82;
                        case 4 -> 6;
                        case 5 -> 77;
                        default -> 28;
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
                        b = new String[9];
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

                     var2 = "£Ô\u008aâç_f\u008d§¶&òYZÍ\u0011Îï'\u0092A«Ëñ4§¤¡a44-e";
                     var4 = "£Ô\u008aâç_f\u008d§¶&òYZÍ\u0011Îï'\u0092A«Ëñ4§¤¡a44-e".length();
                     var1 = 15;
                     var8 = -1;
               }

               var10000 = 104;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 18586) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 252;
               case 1 -> 99;
               case 2 -> 240;
               case 3 -> 153;
               case 4 -> 250;
               case 5 -> 35;
               case 6 -> 24;
               case 7 -> 235;
               case 8 -> 90;
               case 9 -> 224;
               case 10 -> 162;
               case 11 -> 171;
               case 12 -> 131;
               case 13 -> 151;
               case 14 -> 103;
               case 15 -> 21;
               case 16 -> 116;
               case 17 -> 125;
               case 18 -> 183;
               case 19 -> 174;
               case 20 -> 76;
               case 21 -> 218;
               case 22 -> 10;
               case 23 -> 119;
               case 24 -> 95;
               case 25 -> 57;
               case 26 -> 244;
               case 27 -> 26;
               case 28 -> 145;
               case 29 -> 154;
               case 30 -> 198;
               case 31 -> 85;
               case 32 -> 102;
               case 33 -> 27;
               case 34 -> 133;
               case 35 -> 241;
               case 36 -> 142;
               case 37 -> 209;
               case 38 -> 232;
               case 39 -> 104;
               case 40 -> 8;
               case 41 -> 197;
               case 42 -> 112;
               case 43 -> 84;
               case 44 -> 194;
               case 45 -> 202;
               case 46 -> 149;
               case 47 -> 61;
               case 48 -> 201;
               case 49 -> 189;
               case 50 -> 130;
               case 51 -> 78;
               case 52 -> 230;
               case 53 -> 220;
               case 54 -> 108;
               case 55 -> 72;
               case 56 -> 52;
               case 57 -> 87;
               case 58 -> 205;
               case 59 -> 192;
               case 60 -> 7;
               case 61 -> 199;
               case 62 -> 129;
               case 63 -> 188;
               case 64 -> 238;
               case 65 -> 236;
               case 66 -> 246;
               case 67 -> 81;
               case 68 -> 247;
               case 69 -> 42;
               case 70 -> 5;
               case 71 -> 191;
               case 72 -> 55;
               case 73 -> 156;
               case 74 -> 92;
               case 75 -> 159;
               case 76 -> 136;
               case 77 -> 139;
               case 78 -> 41;
               case 79 -> 227;
               case 80 -> 18;
               case 81 -> 210;
               case 82 -> 48;
               case 83 -> 164;
               case 84 -> 207;
               case 85 -> 211;
               case 86 -> 190;
               case 87 -> 98;
               case 88 -> 144;
               case 89 -> 225;
               case 90 -> 91;
               case 91 -> 82;
               case 92 -> 68;
               case 93 -> 181;
               case 94 -> 4;
               case 95 -> 2;
               case 96 -> 196;
               case 97 -> 30;
               case 98 -> 122;
               case 99 -> 37;
               case 100 -> 249;
               case 101 -> 147;
               case 102 -> 110;
               case 103 -> 25;
               case 104 -> 184;
               case 105 -> 135;
               case 106 -> 120;
               case 107 -> 231;
               case 108 -> 123;
               case 109 -> 28;
               case 110 -> 1;
               case 111 -> 88;
               case 112 -> 253;
               case 113 -> 206;
               case 114 -> 121;
               case 115 -> 167;
               case 116 -> 58;
               case 117 -> 54;
               case 118 -> 165;
               case 119 -> 63;
               case 120 -> 237;
               case 121 -> 44;
               case 122 -> 33;
               case 123 -> 180;
               case 124 -> 46;
               case 125 -> 73;
               case 126 -> 127;
               case 127 -> 118;
               case 128 -> 251;
               case 129 -> 219;
               case 130 -> 234;
               case 131 -> 38;
               case 132 -> 160;
               case 133 -> 187;
               case 134 -> 228;
               case 135 -> 215;
               case 136 -> 141;
               case 137 -> 255;
               case 138 -> 51;
               case 139 -> 20;
               case 140 -> 94;
               case 141 -> 117;
               case 142 -> 86;
               case 143 -> 47;
               case 144 -> 115;
               case 145 -> 243;
               case 146 -> 36;
               case 147 -> 106;
               case 148 -> 223;
               case 149 -> 178;
               case 150 -> 109;
               case 151 -> 212;
               case 152 -> 101;
               case 153 -> 155;
               case 154 -> 172;
               case 155 -> 19;
               case 156 -> 34;
               case 157 -> 195;
               case 158 -> 140;
               case 159 -> 9;
               case 160 -> 29;
               case 161 -> 204;
               case 162 -> 186;
               case 163 -> 185;
               case 164 -> 79;
               case 165 -> 126;
               case 166 -> 74;
               case 167 -> 69;
               case 168 -> 13;
               case 169 -> 143;
               case 170 -> 59;
               case 171 -> 11;
               case 172 -> 193;
               case 173 -> 43;
               case 174 -> 12;
               case 175 -> 45;
               case 176 -> 128;
               case 177 -> 70;
               case 178 -> 245;
               case 179 -> 179;
               case 180 -> 134;
               case 181 -> 157;
               case 182 -> 173;
               case 183 -> 97;
               case 184 -> 158;
               case 185 -> 208;
               case 186 -> 111;
               case 187 -> 170;
               case 188 -> 248;
               case 189 -> 22;
               case 190 -> 14;
               case 191 -> 75;
               case 192 -> 0;
               case 193 -> 77;
               case 194 -> 114;
               case 195 -> 113;
               case 196 -> 31;
               case 197 -> 221;
               case 198 -> 49;
               case 199 -> 138;
               case 200 -> 15;
               case 201 -> 17;
               case 202 -> 213;
               case 203 -> 6;
               case 204 -> 177;
               case 205 -> 239;
               case 206 -> 132;
               case 207 -> 56;
               case 208 -> 100;
               case 209 -> 214;
               case 210 -> 71;
               case 211 -> 83;
               case 212 -> 62;
               case 213 -> 166;
               case 214 -> 175;
               case 215 -> 60;
               case 216 -> 23;
               case 217 -> 229;
               case 218 -> 32;
               case 219 -> 152;
               case 220 -> 216;
               case 221 -> 137;
               case 222 -> 53;
               case 223 -> 169;
               case 224 -> 161;
               case 225 -> 40;
               case 226 -> 66;
               case 227 -> 64;
               case 228 -> 203;
               case 229 -> 16;
               case 230 -> 254;
               case 231 -> 148;
               case 232 -> 222;
               case 233 -> 107;
               case 234 -> 200;
               case 235 -> 3;
               case 236 -> 124;
               case 237 -> 39;
               case 238 -> 242;
               case 239 -> 50;
               case 240 -> 226;
               case 241 -> 146;
               case 242 -> 168;
               case 243 -> 80;
               case 244 -> 65;
               case 245 -> 96;
               case 246 -> 150;
               case 247 -> 93;
               case 248 -> 89;
               case 249 -> 176;
               case 250 -> 233;
               case 251 -> 163;
               case 252 -> 105;
               case 253 -> 67;
               case 254 -> 182;
               default -> 217;
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
      public static IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll p0, me.octo.client.lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll p1, me.octo.client.lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll p2, boolean p3, boolean p4, int p5, int p6, kotlin.Triple p7, int p8, java.lang.Object p9) {
         if ((p8 & 1) != 0) p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if ((p8 & 2) != 0) p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if ((p8 & 4) != 0) p3 = p0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if ((p8 & 8) != 0) p4 = p0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         if ((p8 & 16) != 0) p5 = p0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         if ((p8 & 32) != 0) p6 = p0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         if ((p8 & 64) != 0) p7 = p0.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         return p0.a(p1, p2, p3, p4, p5, p6, p7);
      }
   }

   private static final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
      @NotNull
      private final BlockPos IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] a;
      private static String[] b;

      public IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(@NotNull BlockPos var1, int var2, long var3, long var5) {
         short var10001 = 30489;
         short var10002 = -13826;
         Intrinsics.checkNotNullParameter(var1, "pos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var5;
      }

      @NotNull
      public final BlockPos a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final long c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final long d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final BlockPos e() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int f() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final long g() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final long h() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(
         @NotNull BlockPos var1, int var2, long var3, long var5
      ) {
         short var10001 = 30493;
         short var10002 = -12295;
         Intrinsics.checkNotNullParameter(var1, "pos");
         return new lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
            var1, var2, var3, var5
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 30488;
         long var1 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         long var3 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var5 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         BlockPos var6 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -1652;
         short var10002 = 30494;
         short var10003 = -30320;
         short var10004 = 30492;
         short var10005 = -1343;
         short var10006 = 30495;
         short var10007 = -14506;
         return "MushroomSnapshot(pos=" + var6 + ", particleCount=" + var5 + ", lastParticleTime=" + var3 + ", blacklistedUntil=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         var1 = var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         var1 = var1 * 31 + Long.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         return var1 * 31 + Long.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var3 = (lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)var10000;
         int var4 = ((Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )) ? 1 : 0);
         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         if (var2 != null) {
            if (var4 != var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
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
            if (var4 != 0) {
               return false;
            }

            long var6;
            var4 = (
                     var6 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                        - var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                  )
                  == 0L
               ? 0
               : (var6 < 0L ? -1 : 1);
         }

         if (var2 != null) {
            if (var4 != 0) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static { char[] var20 = null; // PX-FIX hoist
        
       var20 = null; // PX-FIX
         String[] var5 = new String[6];
         int var3 = 0;
         String var2 = "ed\u008f\u0013í\u0018V\u000bD¼:\u0018m\u0014µ\u0007zuî\f@íé\u0013x÷êû\u000e\u0019\u0018Tn6°¢l7\u001fo\u00076\u0085\u0010Âù¯7å;\u0016êè\u0019ò\u0099ä '\u0098";
         int var4 = "ed\u008f\u0013í\u0018V\u000bD¼:\u0018m\u0014µ\u0007zuî\f@íé\u0013x÷êû\u000e\u0019\u0018Tn6°¢l7\u001fo\u00076\u0085\u0010Âù¯7å;\u0016êè\u0019ò\u0099ä '\u0098"
            .length();
         char var1 = 3;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 11;
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
                        case 0 -> 50;
                        case 1 -> 2;
                        case 2 -> 2;
                        case 3 -> 103;
                        case 4 -> 54;
                        case 5 -> 98;
                        default -> 83;
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
                        b = new String[6];
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

                     var2 = "y\u0099x\u0015áZñÁ9¢ÿÛX\u008fjJãÔný=\f\u008d\u001c\u0085";
                     var4 = "y\u0099x\u0015áZñÁ9¢ÿÛX\u008fjJãÔný=\f\u008d\u001c\u0085".length();
                     var1 = 3;
                     var8 = -1;
               }

               var10000 = 57;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 30493) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 149;
               case 1 -> 183;
               case 2 -> 152;
               case 3 -> 197;
               case 4 -> 240;
               case 5 -> 214;
               case 6 -> 236;
               case 7 -> 18;
               case 8 -> 61;
               case 9 -> 231;
               case 10 -> 193;
               case 11 -> 126;
               case 12 -> 114;
               case 13 -> 23;
               case 14 -> 26;
               case 15 -> 254;
               case 16 -> 143;
               case 17 -> 118;
               case 18 -> 55;
               case 19 -> 101;
               case 20 -> 47;
               case 21 -> 195;
               case 22 -> 235;
               case 23 -> 202;
               case 24 -> 110;
               case 25 -> 36;
               case 26 -> 15;
               case 27 -> 221;
               case 28 -> 241;
               case 29 -> 222;
               case 30 -> 178;
               case 31 -> 43;
               case 32 -> 97;
               case 33 -> 217;
               case 34 -> 155;
               case 35 -> 5;
               case 36 -> 175;
               case 37 -> 177;
               case 38 -> 98;
               case 39 -> 174;
               case 40 -> 170;
               case 41 -> 192;
               case 42 -> 4;
               case 43 -> 219;
               case 44 -> 133;
               case 45 -> 199;
               case 46 -> 65;
               case 47 -> 19;
               case 48 -> 59;
               case 49 -> 124;
               case 50 -> 230;
               case 51 -> 0;
               case 52 -> 12;
               case 53 -> 32;
               case 54 -> 208;
               case 55 -> 63;
               case 56 -> 234;
               case 57 -> 184;
               case 58 -> 218;
               case 59 -> 171;
               case 60 -> 167;
               case 61 -> 237;
               case 62 -> 103;
               case 63 -> 123;
               case 64 -> 90;
               case 65 -> 233;
               case 66 -> 146;
               case 67 -> 77;
               case 68 -> 31;
               case 69 -> 60;
               case 70 -> 150;
               case 71 -> 196;
               case 72 -> 153;
               case 73 -> 156;
               case 74 -> 30;
               case 75 -> 251;
               case 76 -> 16;
               case 77 -> 73;
               case 78 -> 147;
               case 79 -> 162;
               case 80 -> 34;
               case 81 -> 70;
               case 82 -> 49;
               case 83 -> 108;
               case 84 -> 58;
               case 85 -> 9;
               case 86 -> 207;
               case 87 -> 141;
               case 88 -> 64;
               case 89 -> 255;
               case 90 -> 246;
               case 91 -> 187;
               case 92 -> 205;
               case 93 -> 154;
               case 94 -> 122;
               case 95 -> 243;
               case 96 -> 189;
               case 97 -> 181;
               case 98 -> 157;
               case 99 -> 75;
               case 100 -> 203;
               case 101 -> 198;
               case 102 -> 172;
               case 103 -> 212;
               case 104 -> 80;
               case 105 -> 100;
               case 106 -> 250;
               case 107 -> 232;
               case 108 -> 137;
               case 109 -> 117;
               case 110 -> 105;
               case 111 -> 11;
               case 112 -> 102;
               case 113 -> 46;
               case 114 -> 252;
               case 115 -> 95;
               case 116 -> 51;
               case 117 -> 82;
               case 118 -> 38;
               case 119 -> 129;
               case 120 -> 29;
               case 121 -> 249;
               case 122 -> 144;
               case 123 -> 116;
               case 124 -> 89;
               case 125 -> 120;
               case 126 -> 228;
               case 127 -> 164;
               case 128 -> 79;
               case 129 -> 200;
               case 130 -> 8;
               case 131 -> 160;
               case 132 -> 191;
               case 133 -> 99;
               case 134 -> 179;
               case 135 -> 239;
               case 136 -> 50;
               case 137 -> 130;
               case 138 -> 68;
               case 139 -> 206;
               case 140 -> 253;
               case 141 -> 163;
               case 142 -> 121;
               case 143 -> 24;
               case 144 -> 72;
               case 145 -> 165;
               case 146 -> 111;
               case 147 -> 48;
               case 148 -> 119;
               case 149 -> 71;
               case 150 -> 161;
               case 151 -> 135;
               case 152 -> 113;
               case 153 -> 188;
               case 154 -> 84;
               case 155 -> 190;
               case 156 -> 83;
               case 157 -> 180;
               case 158 -> 107;
               case 159 -> 33;
               case 160 -> 148;
               case 161 -> 6;
               case 162 -> 128;
               case 163 -> 67;
               case 164 -> 134;
               case 165 -> 74;
               case 166 -> 245;
               case 167 -> 76;
               case 168 -> 45;
               case 169 -> 215;
               case 170 -> 88;
               case 171 -> 168;
               case 172 -> 91;
               case 173 -> 10;
               case 174 -> 28;
               case 175 -> 244;
               case 176 -> 41;
               case 177 -> 22;
               case 178 -> 13;
               case 179 -> 136;
               case 180 -> 140;
               case 181 -> 62;
               case 182 -> 224;
               case 183 -> 54;
               case 184 -> 104;
               case 185 -> 159;
               case 186 -> 151;
               case 187 -> 211;
               case 188 -> 186;
               case 189 -> 242;
               case 190 -> 2;
               case 191 -> 52;
               case 192 -> 131;
               case 193 -> 56;
               case 194 -> 225;
               case 195 -> 204;
               case 196 -> 209;
               case 197 -> 223;
               case 198 -> 44;
               case 199 -> 213;
               case 200 -> 92;
               case 201 -> 17;
               case 202 -> 57;
               case 203 -> 226;
               case 204 -> 220;
               case 205 -> 227;
               case 206 -> 139;
               case 207 -> 132;
               case 208 -> 78;
               case 209 -> 66;
               case 210 -> 238;
               case 211 -> 247;
               case 212 -> 201;
               case 213 -> 1;
               case 214 -> 40;
               case 215 -> 35;
               case 216 -> 166;
               case 217 -> 3;
               case 218 -> 20;
               case 219 -> 106;
               case 220 -> 182;
               case 221 -> 42;
               case 222 -> 94;
               case 223 -> 173;
               case 224 -> 39;
               case 225 -> 25;
               case 226 -> 142;
               case 227 -> 37;
               case 228 -> 69;
               case 229 -> 96;
               case 230 -> 109;
               case 231 -> 27;
               case 232 -> 112;
               case 233 -> 176;
               case 234 -> 229;
               case 235 -> 115;
               case 236 -> 87;
               case 237 -> 7;
               case 238 -> 210;
               case 239 -> 248;
               case 240 -> 81;
               case 241 -> 14;
               case 242 -> 125;
               case 243 -> 93;
               case 244 -> 216;
               case 245 -> 145;
               case 246 -> 53;
               case 247 -> 138;
               case 248 -> 86;
               case 249 -> 194;
               case 250 -> 127;
               case 251 -> 185;
               case 252 -> 85;
               case 253 -> 158;
               case 254 -> 21;
               default -> 169;
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
      public static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll p0, net.minecraft.core.BlockPos p1, int p2, long p3, long p4, int p5, java.lang.Object p6) {
         if ((p5 & 1) != 0) p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if ((p5 & 2) != 0) p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if ((p5 & 4) != 0) p3 = p0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if ((p5 & 8) != 0) p4 = p0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         return p0.a(p1, p2, p3, p4);
      }
   }

   private static final class IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @Nullable
      private final lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      @NotNull
      private final Triple<Integer, Integer, Integer> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static String[] a;
      private static String[] b;

      public IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI(
         int var1,
         int var2,
         boolean var3,
         @Nullable lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var4,
         @NotNull Triple<Integer, Integer, Integer> var5
      ) {
         short var10001 = -27548;
         short var10002 = 22140;
         Intrinsics.checkNotNullParameter(var5, "playerPos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
      }

      public final int a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @Nullable
      public final lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final int f() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int g() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean h() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @Nullable
      public final lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll i() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> j() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @NotNull
      public final lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI a(
         int var1,
         int var2,
         boolean var3,
         @Nullable lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var4,
         @NotNull Triple<Integer, Integer, Integer> var5
      ) {
         short var10001 = -27545;
         short var10002 = 162;
         Intrinsics.checkNotNullParameter(var5, "playerPos");
         return new lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI(
            var1, var2, var3, var4, var5
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -27552;
         Triple var1 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var2 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         boolean var3 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var5 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -13420;
         short var10002 = -27547;
         short var10003 = -651;
         short var10004 = -27546;
         short var10005 = -25455;
         short var10006 = -27550;
         short var10007 = -17612;
         short var10008 = -27551;
         short var10009 = -30348;
         return "WalkProgress(mushrooms=" + var5 + ", roamIndex=" + var4 + ", walkerFinished=" + var3 + ", target=" + var2 + ", playerPos=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var6;
         int var7;
         label14: {
            int var2 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
            var2 = var2 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
            String var10000 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
            var2 = var2 * 31 + Boolean.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
            String var1 = var10000;
            var6 = var2 * 31;
            lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var10001 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            if (var1 != null) {
               if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI == null) {
                  var7 = 0;
                  break label14;
               }

               var10001 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            }

            var7 = var10001.hashCode();
         }

         int var5 = var6 + var7;
         return var5 * 31 + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI
            )) {
               return false;
            }

            var10000 = var1;
         }

         lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var3 = (lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI)var10000;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         int var10001 = var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var2 != null) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         label64: {
            if (var2 != null) {
               if (var4 != var10001) {
                  return false;
               }

               var4 = ((this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) ? 1 : 0);
               if (var2 == null) {
                  break label64;
               }

               var10001 = ((var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) ? 1 : 0);
            }

            if (var4 != var10001) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
               var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static { char[] var20 = null; // PX-FIX hoist
        
       var20 = null; // PX-FIX
         String[] var5 = new String[7];
         int var3 = 0;
         String var2 = "cµÅ\u0001J\b2kò\fúB2,ÁfÞ[B\u001b÷M\u0011É\u0014Qè\u00057Æ«Ê\u0096\u0096%\u000ej\u0080ÑR\t©\u007f\u009cXa#W\u000e^\u0017ä·ûÿ\u0014\u0087U\u0092Ç\n\u0098!*¶$ø\u0081_à´\u0011^B";
         int var4 = "cµÅ\u0001J\b2kò\fúB2,ÁfÞ[B\u001b÷M\u0011É\u0014Qè\u00057Æ«Ê\u0096\u0096%\u000ej\u0080ÑR\t©\u007f\u009cXa#W\u000e^\u0017ä·ûÿ\u0014\u0087U\u0092Ç\n\u0098!*¶$ø\u0081_à´\u0011^B"
            .length();
         char var1 = '\t';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 117;
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
                        case 0 -> 105;
                        case 1 -> 69;
                        case 2 -> 64;
                        case 3 -> 92;
                        case 4 -> 9;
                        case 5 -> 92;
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

                     var2 = "en\u009aóÏ³j2\u0010ú]c\t¹\u0010\u00051«Y\u0097´Â";
                     var4 = "en\u009aóÏ³j2\u0010ú]c\t¹\u0010\u00051«Y\u0097´Â".length();
                     var1 = '\f';
                     var8 = -1;
               }

               var10000 = 111;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -27548) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 247;
               case 1 -> 114;
               case 2 -> 88;
               case 3 -> 164;
               case 4 -> 242;
               case 5 -> 15;
               case 6 -> 47;
               case 7 -> 13;
               case 8 -> 39;
               case 9 -> 73;
               case 10 -> 41;
               case 11 -> 191;
               case 12 -> 18;
               case 13 -> 116;
               case 14 -> 58;
               case 15 -> 244;
               case 16 -> 130;
               case 17 -> 194;
               case 18 -> 182;
               case 19 -> 110;
               case 20 -> 246;
               case 21 -> 169;
               case 22 -> 233;
               case 23 -> 14;
               case 24 -> 30;
               case 25 -> 251;
               case 26 -> 203;
               case 27 -> 2;
               case 28 -> 7;
               case 29 -> 223;
               case 30 -> 148;
               case 31 -> 78;
               case 32 -> 149;
               case 33 -> 137;
               case 34 -> 64;
               case 35 -> 96;
               case 36 -> 237;
               case 37 -> 166;
               case 38 -> 147;
               case 39 -> 243;
               case 40 -> 134;
               case 41 -> 112;
               case 42 -> 59;
               case 43 -> 57;
               case 44 -> 226;
               case 45 -> 196;
               case 46 -> 214;
               case 47 -> 212;
               case 48 -> 142;
               case 49 -> 219;
               case 50 -> 204;
               case 51 -> 46;
               case 52 -> 19;
               case 53 -> 9;
               case 54 -> 189;
               case 55 -> 141;
               case 56 -> 125;
               case 57 -> 52;
               case 58 -> 113;
               case 59 -> 170;
               case 60 -> 132;
               case 61 -> 21;
               case 62 -> 231;
               case 63 -> 82;
               case 64 -> 240;
               case 65 -> 24;
               case 66 -> 98;
               case 67 -> 155;
               case 68 -> 3;
               case 69 -> 50;
               case 70 -> 32;
               case 71 -> 193;
               case 72 -> 111;
               case 73 -> 61;
               case 74 -> 173;
               case 75 -> 95;
               case 76 -> 255;
               case 77 -> 107;
               case 78 -> 146;
               case 79 -> 91;
               case 80 -> 198;
               case 81 -> 230;
               case 82 -> 45;
               case 83 -> 31;
               case 84 -> 192;
               case 85 -> 253;
               case 86 -> 54;
               case 87 -> 159;
               case 88 -> 89;
               case 89 -> 23;
               case 90 -> 53;
               case 91 -> 249;
               case 92 -> 177;
               case 93 -> 124;
               case 94 -> 239;
               case 95 -> 56;
               case 96 -> 8;
               case 97 -> 210;
               case 98 -> 28;
               case 99 -> 37;
               case 100 -> 105;
               case 101 -> 184;
               case 102 -> 178;
               case 103 -> 67;
               case 104 -> 183;
               case 105 -> 71;
               case 106 -> 168;
               case 107 -> 245;
               case 108 -> 213;
               case 109 -> 118;
               case 110 -> 162;
               case 111 -> 200;
               case 112 -> 115;
               case 113 -> 175;
               case 114 -> 216;
               case 115 -> 34;
               case 116 -> 68;
               case 117 -> 51;
               case 118 -> 163;
               case 119 -> 49;
               case 120 -> 60;
               case 121 -> 44;
               case 122 -> 70;
               case 123 -> 227;
               case 124 -> 224;
               case 125 -> 197;
               case 126 -> 160;
               case 127 -> 109;
               case 128 -> 81;
               case 129 -> 187;
               case 130 -> 252;
               case 131 -> 4;
               case 132 -> 248;
               case 133 -> 1;
               case 134 -> 207;
               case 135 -> 40;
               case 136 -> 16;
               case 137 -> 6;
               case 138 -> 201;
               case 139 -> 11;
               case 140 -> 140;
               case 141 -> 199;
               case 142 -> 250;
               case 143 -> 62;
               case 144 -> 117;
               case 145 -> 156;
               case 146 -> 36;
               case 147 -> 139;
               case 148 -> 202;
               case 149 -> 75;
               case 150 -> 225;
               case 151 -> 186;
               case 152 -> 101;
               case 153 -> 208;
               case 154 -> 86;
               case 155 -> 69;
               case 156 -> 35;
               case 157 -> 0;
               case 158 -> 176;
               case 159 -> 85;
               case 160 -> 158;
               case 161 -> 220;
               case 162 -> 136;
               case 163 -> 27;
               case 164 -> 195;
               case 165 -> 180;
               case 166 -> 121;
               case 167 -> 172;
               case 168 -> 20;
               case 169 -> 102;
               case 170 -> 131;
               case 171 -> 234;
               case 172 -> 103;
               case 173 -> 55;
               case 174 -> 80;
               case 175 -> 179;
               case 176 -> 254;
               case 177 -> 151;
               case 178 -> 22;
               case 179 -> 17;
               case 180 -> 5;
               case 181 -> 221;
               case 182 -> 190;
               case 183 -> 12;
               case 184 -> 99;
               case 185 -> 25;
               case 186 -> 209;
               case 187 -> 228;
               case 188 -> 90;
               case 189 -> 43;
               case 190 -> 205;
               case 191 -> 161;
               case 192 -> 76;
               case 193 -> 77;
               case 194 -> 144;
               case 195 -> 33;
               case 196 -> 84;
               case 197 -> 66;
               case 198 -> 238;
               case 199 -> 235;
               case 200 -> 157;
               case 201 -> 165;
               case 202 -> 133;
               case 203 -> 135;
               case 204 -> 128;
               case 205 -> 97;
               case 206 -> 119;
               case 207 -> 217;
               case 208 -> 26;
               case 209 -> 100;
               case 210 -> 150;
               case 211 -> 120;
               case 212 -> 211;
               case 213 -> 152;
               case 214 -> 145;
               case 215 -> 188;
               case 216 -> 126;
               case 217 -> 181;
               case 218 -> 104;
               case 219 -> 241;
               case 220 -> 38;
               case 221 -> 94;
               case 222 -> 174;
               case 223 -> 222;
               case 224 -> 65;
               case 225 -> 127;
               case 226 -> 236;
               case 227 -> 72;
               case 228 -> 10;
               case 229 -> 154;
               case 230 -> 171;
               case 231 -> 42;
               case 232 -> 143;
               case 233 -> 87;
               case 234 -> 92;
               case 235 -> 63;
               case 236 -> 218;
               case 237 -> 79;
               case 238 -> 167;
               case 239 -> 74;
               case 240 -> 123;
               case 241 -> 129;
               case 242 -> 153;
               case 243 -> 29;
               case 244 -> 232;
               case 245 -> 48;
               case 246 -> 138;
               case 247 -> 83;
               case 248 -> 229;
               case 249 -> 122;
               case 250 -> 206;
               case 251 -> 106;
               case 252 -> 185;
               case 253 -> 108;
               case 254 -> 215;
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
      public static IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI a(IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI p0, int p1, int p2, boolean p3, me.octo.client.lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll p4, kotlin.Triple p5, int p6, java.lang.Object p7) {
         if ((p6 & 1) != 0) p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if ((p6 & 2) != 0) p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if ((p6 & 4) != 0) p3 = p0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if ((p6 & 8) != 0) p4 = p0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         if ((p6 & 16) != 0) p5 = p0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         return p0.a(p1, p2, p3, p4, p5);
      }
   }

   private static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @Nullable
      private final lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @Nullable
      private final BlockPos IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @Nullable
      private final Vec3 lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final boolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         int var1,
         @Nullable lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var2,
         @Nullable BlockPos var3,
         @Nullable Vec3 var4,
         boolean var5
      ) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
      }

      public final int a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final BlockPos c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @Nullable
      public final Vec3 d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final boolean e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final int f() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll g() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final BlockPos h() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @Nullable
      public final Vec3 i() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final boolean j() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @NotNull
      public final lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         int var1,
         @Nullable lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var2,
         @Nullable BlockPos var3,
         @Nullable Vec3 var4,
         boolean var5
      ) {
         return new lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var2, var3, var4, var5
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 29276;
         boolean var1 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         Vec3 var2 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         BlockPos var3 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var5 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -11809;
         short var10002 = 29278;
         short var10003 = -5717;
         short var10004 = 29274;
         short var10005 = -30768;
         short var10006 = 29277;
         short var10007 = -15210;
         short var10008 = 29279;
         short var10009 = 3939;
         return "MineProgress(clicked=" + var5 + ", target=" + var4 + ", targetBlock=" + var3 + ", visiblePoint=" + var2 + ", rotating=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         String var1;
         int var6;
         int var9;
         label36: {
            String var10000 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
            int var2 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
            var1 = var10000;
            var6 = var2 * 31;
            lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (var1 != null) {
               if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII == null) {
                  var9 = 0;
                  break label36;
               }

               var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            var9 = var10001.hashCode();
         }

         label30: {
            int var3 = var6 + var9;
            var6 = var3 * 31;
            BlockPos var10 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            if (var1 != null) {
               if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == null) {
                  var9 = 0;
                  break label30;
               }

               var10 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }

            var9 = var10.hashCode();
         }

         label24: {
            int var4 = var6 + var9;
            var6 = var4 * 31;
            Vec3 var12 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            if (var1 != null) {
               if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI == null) {
                  var9 = 0;
                  break label24;
               }

               var12 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            }

            var9 = var12.hashCode();
         }

         int var5 = var6 + var9;
         return var5 * 31 + Boolean.hashCode(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = var1;
         }

         lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var2 != null) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 !=( (!var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) ? 1 : 0)) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static { char[] var20 = null; // PX-FIX hoist
        
       var20 = null; // PX-FIX
         String[] var5 = new String[5];
         int var3 = 0;
         String var2 = "Jö\u0010¡\u0005fcö\u009f\u000bé\u0007b\u0091\u008b©eÔ?=C\u0015î¶ÓÍ\u0006zoÑ\u001aP6?\u008b\u0003õ\u0001¸5ò¼0";
         int var4 = "Jö\u0010¡\u0005fcö\u009f\u000bé\u0007b\u0091\u008b©eÔ?=C\u0015î¶ÓÍ\u0006zoÑ\u001aP6?\u008b\u0003õ\u0001¸5ò¼0".length();
         char var1 = '\t';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 66;
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
                        case 0 -> 68;
                        case 1 -> 10;
                        case 2 -> 6;
                        case 3 -> 113;
                        case 4 -> 69;
                        case 5 -> 92;
                        default -> 56;
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
                        b = new String[5];
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

                     var2 = "ð\u0084\u00913¢çeÅ4YÎC\u0099\u0016¼\u000e÷üs4½\u0000 îL\u001b\u0002º\u0005+";
                     var4 = "ð\u0084\u00913¢çeÅ4YÎC\u0099\u0016¼\u000e÷üs4½\u0000 îL\u001b\u0002º\u0005+".length();
                     var1 = 15;
                     var8 = -1;
               }

               var10000 = 84;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 29278) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 220;
               case 1 -> 92;
               case 2 -> 70;
               case 3 -> 120;
               case 4 -> 169;
               case 5 -> 137;
               case 6 -> 141;
               case 7 -> 173;
               case 8 -> 132;
               case 9 -> 77;
               case 10 -> 91;
               case 11 -> 28;
               case 12 -> 14;
               case 13 -> 219;
               case 14 -> 146;
               case 15 -> 86;
               case 16 -> 134;
               case 17 -> 17;
               case 18 -> 178;
               case 19 -> 254;
               case 20 -> 172;
               case 21 -> 239;
               case 22 -> 79;
               case 23 -> 51;
               case 24 -> 10;
               case 25 -> 66;
               case 26 -> 236;
               case 27 -> 142;
               case 28 -> 148;
               case 29 -> 184;
               case 30 -> 213;
               case 31 -> 175;
               case 32 -> 59;
               case 33 -> 230;
               case 34 -> 199;
               case 35 -> 228;
               case 36 -> 96;
               case 37 -> 57;
               case 38 -> 233;
               case 39 -> 174;
               case 40 -> 156;
               case 41 -> 186;
               case 42 -> 167;
               case 43 -> 218;
               case 44 -> 244;
               case 45 -> 165;
               case 46 -> 182;
               case 47 -> 135;
               case 48 -> 95;
               case 49 -> 105;
               case 50 -> 56;
               case 51 -> 133;
               case 52 -> 189;
               case 53 -> 206;
               case 54 -> 177;
               case 55 -> 183;
               case 56 -> 43;
               case 57 -> 222;
               case 58 -> 35;
               case 59 -> 97;
               case 60 -> 223;
               case 61 -> 4;
               case 62 -> 235;
               case 63 -> 139;
               case 64 -> 221;
               case 65 -> 83;
               case 66 -> 33;
               case 67 -> 131;
               case 68 -> 110;
               case 69 -> 22;
               case 70 -> 243;
               case 71 -> 0;
               case 72 -> 245;
               case 73 -> 246;
               case 74 -> 241;
               case 75 -> 99;
               case 76 -> 75;
               case 77 -> 31;
               case 78 -> 101;
               case 79 -> 155;
               case 80 -> 215;
               case 81 -> 34;
               case 82 -> 140;
               case 83 -> 185;
               case 84 -> 122;
               case 85 -> 224;
               case 86 -> 195;
               case 87 -> 46;
               case 88 -> 23;
               case 89 -> 231;
               case 90 -> 111;
               case 91 -> 81;
               case 92 -> 144;
               case 93 -> 188;
               case 94 -> 9;
               case 95 -> 187;
               case 96 -> 54;
               case 97 -> 84;
               case 98 -> 69;
               case 99 -> 103;
               case 100 -> 94;
               case 101 -> 25;
               case 102 -> 190;
               case 103 -> 8;
               case 104 -> 6;
               case 105 -> 21;
               case 106 -> 143;
               case 107 -> 198;
               case 108 -> 166;
               case 109 -> 124;
               case 110 -> 128;
               case 111 -> 53;
               case 112 -> 45;
               case 113 -> 39;
               case 114 -> 50;
               case 115 -> 38;
               case 116 -> 152;
               case 117 -> 85;
               case 118 -> 67;
               case 119 -> 249;
               case 120 -> 63;
               case 121 -> 180;
               case 122 -> 212;
               case 123 -> 74;
               case 124 -> 232;
               case 125 -> 216;
               case 126 -> 129;
               case 127 -> 138;
               case 128 -> 52;
               case 129 -> 209;
               case 130 -> 29;
               case 131 -> 108;
               case 132 -> 192;
               case 133 -> 80;
               case 134 -> 107;
               case 135 -> 247;
               case 136 -> 61;
               case 137 -> 153;
               case 138 -> 214;
               case 139 -> 60;
               case 140 -> 200;
               case 141 -> 201;
               case 142 -> 42;
               case 143 -> 150;
               case 144 -> 37;
               case 145 -> 162;
               case 146 -> 11;
               case 147 -> 252;
               case 148 -> 12;
               case 149 -> 20;
               case 150 -> 13;
               case 151 -> 82;
               case 152 -> 157;
               case 153 -> 211;
               case 154 -> 159;
               case 155 -> 88;
               case 156 -> 238;
               case 157 -> 207;
               case 158 -> 109;
               case 159 -> 250;
               case 160 -> 24;
               case 161 -> 248;
               case 162 -> 210;
               case 163 -> 71;
               case 164 -> 73;
               case 165 -> 49;
               case 166 -> 47;
               case 167 -> 205;
               case 168 -> 251;
               case 169 -> 226;
               case 170 -> 114;
               case 171 -> 158;
               case 172 -> 89;
               case 173 -> 176;
               case 174 -> 161;
               case 175 -> 234;
               case 176 -> 253;
               case 177 -> 55;
               case 178 -> 136;
               case 179 -> 149;
               case 180 -> 44;
               case 181 -> 255;
               case 182 -> 179;
               case 183 -> 237;
               case 184 -> 68;
               case 185 -> 119;
               case 186 -> 208;
               case 187 -> 7;
               case 188 -> 117;
               case 189 -> 191;
               case 190 -> 3;
               case 191 -> 78;
               case 192 -> 18;
               case 193 -> 112;
               case 194 -> 193;
               case 195 -> 154;
               case 196 -> 16;
               case 197 -> 127;
               case 198 -> 40;
               case 199 -> 98;
               case 200 -> 115;
               case 201 -> 121;
               case 202 -> 171;
               case 203 -> 194;
               case 204 -> 227;
               case 205 -> 113;
               case 206 -> 65;
               case 207 -> 118;
               case 208 -> 15;
               case 209 -> 125;
               case 210 -> 225;
               case 211 -> 164;
               case 212 -> 102;
               case 213 -> 26;
               case 214 -> 240;
               case 215 -> 203;
               case 216 -> 116;
               case 217 -> 181;
               case 218 -> 90;
               case 219 -> 163;
               case 220 -> 64;
               case 221 -> 126;
               case 222 -> 229;
               case 223 -> 36;
               case 224 -> 202;
               case 225 -> 1;
               case 226 -> 130;
               case 227 -> 41;
               case 228 -> 217;
               case 229 -> 242;
               case 230 -> 62;
               case 231 -> 5;
               case 232 -> 58;
               case 233 -> 32;
               case 234 -> 106;
               case 235 -> 168;
               case 236 -> 100;
               case 237 -> 30;
               case 238 -> 151;
               case 239 -> 160;
               case 240 -> 196;
               case 241 -> 104;
               case 242 -> 170;
               case 243 -> 48;
               case 244 -> 87;
               case 245 -> 147;
               case 246 -> 145;
               case 247 -> 72;
               case 248 -> 76;
               case 249 -> 2;
               case 250 -> 93;
               case 251 -> 27;
               case 252 -> 123;
               case 253 -> 197;
               case 254 -> 204;
               default -> 19;
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
      public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI p0, int p1, me.octo.client.lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll p2, net.minecraft.core.BlockPos p3, net.minecraft.world.phys.Vec3 p4, boolean p5, int p6, java.lang.Object p7) {
         if ((p6 & 1) != 0) p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if ((p6 & 2) != 0) p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if ((p6 & 4) != 0) p3 = p0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if ((p6 & 8) != 0) p4 = p0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         if ((p6 & 16) != 0) p5 = p0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         return p0.a(p1, p2, p3, p4, p5);
      }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl a() {
         return lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
      }
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker p0) { this(); }
      public static void b() {  }
   }

   private static final class llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @Nullable
      private final lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] a;
      private static String[] b;

      public llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
         int var1,
         int var2,
         int var3,
         @Nullable lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var4
      ) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
      }

      public final int a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @Nullable
      public final lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final int e() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int f() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int g() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @Nullable
      public final lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll h() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll a(
         int var1,
         int var2,
         int var3,
         @Nullable lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var4
      ) {
         return new lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
            var1, var2, var3, var4
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 3721;
         lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var1 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         int var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -28440;
         short var10002 = 3720;
         short var10003 = 27553;
         short var10004 = 3722;
         short var10005 = -18178;
         short var10006 = 3723;
         short var10007 = 875;
         return "ScanProgress(mushrooms=" + var4 + ", permanentBlacklist=" + var3 + ", roamIndex=" + var2 + ", target=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         String var10000 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
         int var2 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         String var1 = var10000;
         var2 = var2 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         var2 = var2 * 31 + Integer.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         int var5 = var2 * 31;
         lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var10001 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         if (var1 != null) {
            if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI == null) {
               return var5 + 0;
            }

            var10001 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         return var5 + var10001.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var3 = (lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll)var10000;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         int var10001 = var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var2 != null) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         label56: {
            if (var2 != null) {
               if (var4 != var10001) {
                  return false;
               }

               var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               if (var2 == null) {
                  break label56;
               }

               var10001 = var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }

            if (var4 != var10001) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static { char[] var20 = null; // PX-FIX hoist
        
       var20 = null; // PX-FIX
         String[] var5 = new String[4];
         int var3 = 0;
         String var2 = "¾B%HÛGû¥Xð%Æ\u000e\u001d\u008fÇèöu\u0012ô¥´\u0015d\u0086ÿð\u0091%Ú\u001c¤äH\u001f\u0000=\u0094V[Ä\u009b7æ";
         int var4 = "¾B%HÛGû¥Xð%Æ\u000e\u001d\u008fÇèöu\u0012ô¥´\u0015d\u0086ÿð\u0091%Ú\u001c¤äH\u001f\u0000=\u0094V[Ä\u009b7æ".length();
         char var1 = 23;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 44;
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
                        case 0 -> 112;
                        case 1 -> 84;
                        case 2 -> 13;
                        case 3 -> 66;
                        case 4 -> 106;
                        case 5 -> 126;
                        default -> 81;
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
                        b = new String[4];
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

                     var2 = "\u0095E\u001bRW!Ø\u0013æ\f°B¹¼Ö9µA»\u009aX\u001b";
                     var4 = "\u0095E\u001bRW!Ø\u0013æ\f°B¹¼Ö9µA»\u009aX\u001b".length();
                     var1 = '\t';
                     var8 = -1;
               }

               var10000 = 120;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 3721) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 200;
               case 1 -> 156;
               case 2 -> 242;
               case 3 -> 172;
               case 4 -> 39;
               case 5 -> 114;
               case 6 -> 104;
               case 7 -> 198;
               case 8 -> 191;
               case 9 -> 160;
               case 10 -> 22;
               case 11 -> 0;
               case 12 -> 138;
               case 13 -> 208;
               case 14 -> 194;
               case 15 -> 205;
               case 16 -> 239;
               case 17 -> 255;
               case 18 -> 61;
               case 19 -> 213;
               case 20 -> 64;
               case 21 -> 42;
               case 22 -> 251;
               case 23 -> 155;
               case 24 -> 188;
               case 25 -> 210;
               case 26 -> 133;
               case 27 -> 250;
               case 28 -> 145;
               case 29 -> 14;
               case 30 -> 190;
               case 31 -> 202;
               case 32 -> 130;
               case 33 -> 117;
               case 34 -> 99;
               case 35 -> 69;
               case 36 -> 234;
               case 37 -> 82;
               case 38 -> 174;
               case 39 -> 131;
               case 40 -> 92;
               case 41 -> 169;
               case 42 -> 51;
               case 43 -> 245;
               case 44 -> 19;
               case 45 -> 37;
               case 46 -> 40;
               case 47 -> 91;
               case 48 -> 121;
               case 49 -> 27;
               case 50 -> 153;
               case 51 -> 225;
               case 52 -> 85;
               case 53 -> 81;
               case 54 -> 1;
               case 55 -> 7;
               case 56 -> 141;
               case 57 -> 204;
               case 58 -> 35;
               case 59 -> 140;
               case 60 -> 98;
               case 61 -> 94;
               case 62 -> 53;
               case 63 -> 60;
               case 64 -> 100;
               case 65 -> 97;
               case 66 -> 229;
               case 67 -> 159;
               case 68 -> 16;
               case 69 -> 149;
               case 70 -> 115;
               case 71 -> 254;
               case 72 -> 125;
               case 73 -> 26;
               case 74 -> 152;
               case 75 -> 50;
               case 76 -> 228;
               case 77 -> 240;
               case 78 -> 29;
               case 79 -> 137;
               case 80 -> 187;
               case 81 -> 112;
               case 82 -> 214;
               case 83 -> 43;
               case 84 -> 180;
               case 85 -> 147;
               case 86 -> 249;
               case 87 -> 116;
               case 88 -> 211;
               case 89 -> 253;
               case 90 -> 219;
               case 91 -> 11;
               case 92 -> 232;
               case 93 -> 31;
               case 94 -> 86;
               case 95 -> 129;
               case 96 -> 201;
               case 97 -> 243;
               case 98 -> 176;
               case 99 -> 167;
               case 100 -> 5;
               case 101 -> 54;
               case 102 -> 78;
               case 103 -> 110;
               case 104 -> 128;
               case 105 -> 34;
               case 106 -> 87;
               case 107 -> 247;
               case 108 -> 233;
               case 109 -> 73;
               case 110 -> 163;
               case 111 -> 45;
               case 112 -> 96;
               case 113 -> 9;
               case 114 -> 207;
               case 115 -> 68;
               case 116 -> 103;
               case 117 -> 209;
               case 118 -> 108;
               case 119 -> 146;
               case 120 -> 206;
               case 121 -> 88;
               case 122 -> 36;
               case 123 -> 217;
               case 124 -> 75;
               case 125 -> 113;
               case 126 -> 65;
               case 127 -> 102;
               case 128 -> 220;
               case 129 -> 93;
               case 130 -> 59;
               case 131 -> 120;
               case 132 -> 24;
               case 133 -> 56;
               case 134 -> 166;
               case 135 -> 12;
               case 136 -> 122;
               case 137 -> 203;
               case 138 -> 70;
               case 139 -> 80;
               case 140 -> 135;
               case 141 -> 47;
               case 142 -> 230;
               case 143 -> 90;
               case 144 -> 168;
               case 145 -> 226;
               case 146 -> 58;
               case 147 -> 13;
               case 148 -> 123;
               case 149 -> 223;
               case 150 -> 241;
               case 151 -> 63;
               case 152 -> 142;
               case 153 -> 3;
               case 154 -> 38;
               case 155 -> 227;
               case 156 -> 15;
               case 157 -> 186;
               case 158 -> 49;
               case 159 -> 17;
               case 160 -> 8;
               case 161 -> 67;
               case 162 -> 218;
               case 163 -> 79;
               case 164 -> 162;
               case 165 -> 231;
               case 166 -> 184;
               case 167 -> 76;
               case 168 -> 83;
               case 169 -> 4;
               case 170 -> 212;
               case 171 -> 66;
               case 172 -> 107;
               case 173 -> 124;
               case 174 -> 28;
               case 175 -> 101;
               case 176 -> 252;
               case 177 -> 178;
               case 178 -> 193;
               case 179 -> 20;
               case 180 -> 165;
               case 181 -> 173;
               case 182 -> 195;
               case 183 -> 235;
               case 184 -> 106;
               case 185 -> 154;
               case 186 -> 144;
               case 187 -> 127;
               case 188 -> 238;
               case 189 -> 139;
               case 190 -> 157;
               case 191 -> 52;
               case 192 -> 2;
               case 193 -> 57;
               case 194 -> 189;
               case 195 -> 151;
               case 196 -> 72;
               case 197 -> 196;
               case 198 -> 25;
               case 199 -> 44;
               case 200 -> 222;
               case 201 -> 136;
               case 202 -> 109;
               case 203 -> 105;
               case 204 -> 119;
               case 205 -> 179;
               case 206 -> 89;
               case 207 -> 10;
               case 208 -> 41;
               case 209 -> 248;
               case 210 -> 185;
               case 211 -> 170;
               case 212 -> 134;
               case 213 -> 150;
               case 214 -> 158;
               case 215 -> 175;
               case 216 -> 126;
               case 217 -> 111;
               case 218 -> 118;
               case 219 -> 33;
               case 220 -> 197;
               case 221 -> 199;
               case 222 -> 143;
               case 223 -> 30;
               case 224 -> 148;
               case 225 -> 177;
               case 226 -> 55;
               case 227 -> 164;
               case 228 -> 48;
               case 229 -> 182;
               case 230 -> 6;
               case 231 -> 183;
               case 232 -> 192;
               case 233 -> 71;
               case 234 -> 161;
               case 235 -> 21;
               case 236 -> 84;
               case 237 -> 224;
               case 238 -> 23;
               case 239 -> 221;
               case 240 -> 74;
               case 241 -> 95;
               case 242 -> 181;
               case 243 -> 32;
               case 244 -> 244;
               case 245 -> 77;
               case 246 -> 46;
               case 247 -> 62;
               case 248 -> 246;
               case 249 -> 236;
               case 250 -> 18;
               case 251 -> 237;
               case 252 -> 216;
               case 253 -> 132;
               case 254 -> 215;
               default -> 171;
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
      public static llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll a(llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll p0, int p1, int p2, int p3, me.octo.client.lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll p4, int p5, java.lang.Object p6) {
         if ((p5 & 1) != 0) p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if ((p5 & 2) != 0) p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if ((p5 & 4) != 0) p3 = p0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if ((p5 & 8) != 0) p4 = p0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         return p0.a(p1, p2, p3, p4);
      }
   }
}
