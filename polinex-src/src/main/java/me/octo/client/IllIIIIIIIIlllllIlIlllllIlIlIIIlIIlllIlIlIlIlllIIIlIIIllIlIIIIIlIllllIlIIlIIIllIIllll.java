package me.octo.client;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IllIIIIIIIIlllllIlIlllllIlIlIIIlIIlllIlIlIlIlllIIIlIIIllIlIIIIIlIllllIlIIlIIIllIIllll
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static IllIIIIIIIIlllllIlIlllllIlIlIIIlIIlllIlIlIlIlllIIIlIIIllIlIIIIIlIllllIlIIlIIIllIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @Nullable
   private BlockPos lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private boolean IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @JvmField
   @NotNull
   public static IllIIIIIIIIlllllIlIlllllIlIlIIIlIIlllIlIlIlIlllIIIlIIIllIlIIIIIlIllllIlIIlIIIllIIllll llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static String[] f;
   private static String[] g;

   private IllIIIIIIIIlllllIlIlllllIlIlIIIlIIlllIlIlIlIlllIIIlIIIllIlIIIIIlIllllIlIIlIIIllIIllll() {
      short var10001 = 15058;
      short var10002 = 5075;
      var10002 = 15056;
      short var10003 = 19845;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      short var10004 = 15062;
      short var10005 = -22596;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         lIIIIIIIlllllIllIlIlIIIIllIlIllIllIIlllIlIllllIlIIIlIlIlIllIlllllllIlllIllIlIIIIIllII.a()
      };
      super("Auto Agaricus", "Automatically breaks Agaricus Cap mushrooms when they turn red in the Dreadfarm.", var3, "Misc", var1);
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
   }

   @SubscribeEvent
   public final void a(@NotNull llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII var1) {
      Object var16 = null; // PX-FIX
      Object var12 = null; // PX-FIX
      int[] var10000 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      short var10002 = 15057;
      short var10003 = -2719;
      Intrinsics.checkNotNullParameter(var1, "event");
      int[] var2 = var10000;
      boolean var10 = this.ae();
      if (var2 == null) {
         if (!var10) {
            return;
         }

         var10 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m();
      }

      if (var10) {
         if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g()
            == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll
            )
          {
            short var10001 = 15060;
            var10002 = 13073;
            if (me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .c("Wand of Farming")) {
               label96: {
                  HitResult var5 = this.ap().hitResult;
                  HitResult var11 = var5;
                  if (var2 == null) {
                     if (!(var5 instanceof BlockHitResult)) {
                        var12 = null;
                        break label96;
                     }

                     var11 = var5;
                  }

                  var12 = (BlockHitResult)var11;
               }

               if (var12 == null) {
                  IllIIIIIIIIlllllIlIlllllIlIlIIIlIIlllIlIlIlIlllIIIlIIIllIlIIIIIlIllllIlIIlIIIllIIllll var9 = this;
                  boolean var7 = false;
                  var9.ag();
               } else {
                  BlockHitResult var3 =((BlockHitResult)( var12));
                  if (var2 == null) {
                     ClientLevel var13 = this.ap().level;
                     if (var13 != null) {
                        BlockState var6;
                        BlockPos var8;
                        ClientLevel var4 = var13;
                        BlockPos var14 = var3.getBlockPos();
                        var10002 = 15061;
                        var10003 = -27394;
                        Intrinsics.checkNotNullExpressionValue(var14, "getBlockPos(...)");
                        var8 = var14;
                        BlockState var15 = var4.getBlockState(var8);
                        var10002 = 15063;
                        var10003 = -5514;
                        Intrinsics.checkNotNullExpressionValue(var15, "getBlockState(...)");
                        var6 = var15;
                        var16 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
                        label85:
                        if (var2 == null) {
                           if (this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) {
                              var16 = Intrinsics.areEqual(var8, this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll);
                              if (var2 != null) {
                                 break label85;
                              }

                              if ((me.octo.client.PxTruth.truth(var16))) {
                                 boolean var17 = var6.is(Blocks.RED_MUSHROOM);
                                 if (var2 == null) {
                                    if (!var17) {
                                       this.ag();
                                       return;
                                    }

                                    var17 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                                       .a((Number)Long.valueOf(lIIIIIIIlllllIllIlIlIIIIllIlIllIllIIlllIlIllllIlIIIlIlIlIllIlllllllIlllIllIlIIIIIllII.a().M()));
                                 }

                                 if (var2 == null) {
                                    if (!var17) {
                                       return;
                                    }

                                    me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                       .i();
                                 }

                                 this.ag();
                                 return;
                              }
                           }

                           var16 = var6.is(Blocks.BROWN_MUSHROOM);
                        }

                        if (var2 == null) {
                           if ((me.octo.client.PxTruth.truth(var16))) {
                              this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var8;
                              this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = false;
                              if (var2 == null) {
                                 return;
                              }
                           }

                           var16 = var6.is(Blocks.RED_MUSHROOM);
                        }

                        label71: {
                           if (var2 == null) {
                              if (!(me.octo.client.PxTruth.truth(var16))) {
                                 break label71;
                              }

                              var16 = Intrinsics.areEqual(var8, this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll);
                           }

                           if ((me.octo.client.PxTruth.truth(var16))) {
                              this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = true;
                              this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.f();
                              if (var2 == null) {
                                 return;
                              }
                           }
                        }

                        this.ag();
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   private final void ag() {
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = null;
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = false;
   }

   @Override
   public void aB() {
      this.ag();
      this.as();
   }

   @Override
   public void aC() {
      this.ag();
      this.at();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[7];
      int var3 = 0;
      String var2 = "F\u0000«cC1ÊMl\\;\u001eè\u008d÷\u0010ò\u0014\u0011C\u0001×BÚÎ\u0082ºO¾\nÛZ\u0004Uz\u008d\"\u0012\u001b\u0093,³¦É¶\u0019Sáx\u0007ýÒ\u0091\u0080G\u0098PÈ:´¹´\u000eÂ,\u0018\u0010*\u0096\u0007ó\u001dñX)\u001cÁE\u00ad2\rõ0;×ÒØ´\u0014x5ü>õÄ\u009b'úëgD6\u008e\u008f\u0000ø\u001e\u008aì\u0007Á\u0018\u0089B]ä0h\u0084\u0004Ø\u0013Ïÿ\u0000º¥\u0013;{pwÿ\u0087î\t\u007f";
      int var4 = "F\u0000«cC1ÊMl\\;\u001eè\u008d÷\u0010ò\u0014\u0011C\u0001×BÚÎ\u0082ºO¾\nÛZ\u0004Uz\u008d\"\u0012\u001b\u0093,³¦É¶\u0019Sáx\u0007ýÒ\u0091\u0080G\u0098PÈ:´¹´\u000eÂ,\u0018\u0010*\u0096\u0007ó\u001dñX)\u001cÁE\u00ad2\rõ0;×ÒØ´\u0014x5ü>õÄ\u009b'úëgD6\u008e\u008f\u0000ø\u001e\u008aì\u0007Á\u0018\u0089B]ä0h\u0084\u0004Ø\u0013Ïÿ\u0000º¥\u0013;{pwÿ\u0087î\t\u007f"
         .length();
      char var1 = 15;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 121;
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
                     case 0 -> 94;
                     case 1 -> 64;
                     case 2 -> 45;
                     case 3 -> 20;
                     case 4 -> 70;
                     case 5 -> 14;
                     default -> 126;
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
                     g = new String[7];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IllIIIIIIIIlllllIlIlllllIlIlIIIlIIlllIlIlIlIlllIIIlIIIllIlIIIIIlIllllIlIIlIIIllIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new IllIIIIIIIIlllllIlIlllllIlIlIIIlIIlllIlIlIlIlllIIIlIIIllIlIIIIIlIllllIlIIlIIIllIIllll();
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

                  var2 = "\u0010\u0089.\u009dý\r°Ú\u008b\u0095.\u009bV\u0082Úô~*Y";
                  var4 = "\u0010\u0089.\u009dý\r°Ú\u008b\u0095.\u009bV\u0082Úô~*Y".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 34;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 15060) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 174;
            case 1 -> 129;
            case 2 -> 49;
            case 3 -> 114;
            case 4 -> 38;
            case 5 -> 54;
            case 6 -> 172;
            case 7 -> 150;
            case 8 -> 47;
            case 9 -> 224;
            case 10 -> 160;
            case 11 -> 69;
            case 12 -> 226;
            case 13 -> 74;
            case 14 -> 115;
            case 15 -> 236;
            case 16 -> 116;
            case 17 -> 230;
            case 18 -> 255;
            case 19 -> 229;
            case 20 -> 25;
            case 21 -> 61;
            case 22 -> 93;
            case 23 -> 227;
            case 24 -> 41;
            case 25 -> 99;
            case 26 -> 82;
            case 27 -> 119;
            case 28 -> 158;
            case 29 -> 13;
            case 30 -> 45;
            case 31 -> 205;
            case 32 -> 253;
            case 33 -> 46;
            case 34 -> 181;
            case 35 -> 140;
            case 36 -> 196;
            case 37 -> 178;
            case 38 -> 251;
            case 39 -> 80;
            case 40 -> 233;
            case 41 -> 239;
            case 42 -> 182;
            case 43 -> 139;
            case 44 -> 245;
            case 45 -> 56;
            case 46 -> 218;
            case 47 -> 157;
            case 48 -> 171;
            case 49 -> 64;
            case 50 -> 120;
            case 51 -> 122;
            case 52 -> 75;
            case 53 -> 109;
            case 54 -> 31;
            case 55 -> 34;
            case 56 -> 195;
            case 57 -> 121;
            case 58 -> 141;
            case 59 -> 232;
            case 60 -> 27;
            case 61 -> 142;
            case 62 -> 55;
            case 63 -> 11;
            case 64 -> 106;
            case 65 -> 72;
            case 66 -> 149;
            case 67 -> 91;
            case 68 -> 3;
            case 69 -> 7;
            case 70 -> 112;
            case 71 -> 30;
            case 72 -> 199;
            case 73 -> 145;
            case 74 -> 67;
            case 75 -> 131;
            case 76 -> 138;
            case 77 -> 246;
            case 78 -> 134;
            case 79 -> 94;
            case 80 -> 42;
            case 81 -> 40;
            case 82 -> 132;
            case 83 -> 220;
            case 84 -> 188;
            case 85 -> 53;
            case 86 -> 214;
            case 87 -> 183;
            case 88 -> 33;
            case 89 -> 48;
            case 90 -> 57;
            case 91 -> 184;
            case 92 -> 107;
            case 93 -> 101;
            case 94 -> 44;
            case 95 -> 250;
            case 96 -> 35;
            case 97 -> 219;
            case 98 -> 130;
            case 99 -> 16;
            case 100 -> 18;
            case 101 -> 73;
            case 102 -> 65;
            case 103 -> 43;
            case 104 -> 151;
            case 105 -> 153;
            case 106 -> 237;
            case 107 -> 63;
            case 108 -> 88;
            case 109 -> 96;
            case 110 -> 79;
            case 111 -> 186;
            case 112 -> 137;
            case 113 -> 201;
            case 114 -> 125;
            case 115 -> 234;
            case 116 -> 133;
            case 117 -> 8;
            case 118 -> 192;
            case 119 -> 66;
            case 120 -> 86;
            case 121 -> 194;
            case 122 -> 212;
            case 123 -> 60;
            case 124 -> 241;
            case 125 -> 104;
            case 126 -> 36;
            case 127 -> 189;
            case 128 -> 126;
            case 129 -> 95;
            case 130 -> 190;
            case 131 -> 208;
            case 132 -> 148;
            case 133 -> 78;
            case 134 -> 235;
            case 135 -> 173;
            case 136 -> 127;
            case 137 -> 198;
            case 138 -> 58;
            case 139 -> 163;
            case 140 -> 155;
            case 141 -> 2;
            case 142 -> 10;
            case 143 -> 62;
            case 144 -> 177;
            case 145 -> 68;
            case 146 -> 100;
            case 147 -> 52;
            case 148 -> 197;
            case 149 -> 202;
            case 150 -> 200;
            case 151 -> 9;
            case 152 -> 252;
            case 153 -> 0;
            case 154 -> 159;
            case 155 -> 168;
            case 156 -> 203;
            case 157 -> 179;
            case 158 -> 221;
            case 159 -> 170;
            case 160 -> 193;
            case 161 -> 6;
            case 162 -> 185;
            case 163 -> 19;
            case 164 -> 240;
            case 165 -> 210;
            case 166 -> 223;
            case 167 -> 164;
            case 168 -> 32;
            case 169 -> 213;
            case 170 -> 108;
            case 171 -> 111;
            case 172 -> 29;
            case 173 -> 222;
            case 174 -> 1;
            case 175 -> 216;
            case 176 -> 167;
            case 177 -> 180;
            case 178 -> 169;
            case 179 -> 21;
            case 180 -> 147;
            case 181 -> 144;
            case 182 -> 113;
            case 183 -> 23;
            case 184 -> 211;
            case 185 -> 204;
            case 186 -> 14;
            case 187 -> 123;
            case 188 -> 152;
            case 189 -> 81;
            case 190 -> 15;
            case 191 -> 71;
            case 192 -> 248;
            case 193 -> 26;
            case 194 -> 162;
            case 195 -> 5;
            case 196 -> 254;
            case 197 -> 103;
            case 198 -> 117;
            case 199 -> 207;
            case 200 -> 243;
            case 201 -> 39;
            case 202 -> 83;
            case 203 -> 249;
            case 204 -> 70;
            case 205 -> 165;
            case 206 -> 217;
            case 207 -> 97;
            case 208 -> 87;
            case 209 -> 98;
            case 210 -> 4;
            case 211 -> 136;
            case 212 -> 105;
            case 213 -> 76;
            case 214 -> 110;
            case 215 -> 51;
            case 216 -> 154;
            case 217 -> 28;
            case 218 -> 37;
            case 219 -> 89;
            case 220 -> 156;
            case 221 -> 118;
            case 222 -> 77;
            case 223 -> 50;
            case 224 -> 166;
            case 225 -> 128;
            case 226 -> 176;
            case 227 -> 247;
            case 228 -> 206;
            case 229 -> 238;
            case 230 -> 24;
            case 231 -> 135;
            case 232 -> 209;
            case 233 -> 17;
            case 234 -> 90;
            case 235 -> 187;
            case 236 -> 231;
            case 237 -> 191;
            case 238 -> 84;
            case 239 -> 215;
            case 240 -> 22;
            case 241 -> 242;
            case 242 -> 225;
            case 243 -> 85;
            case 244 -> 59;
            case 245 -> 244;
            case 246 -> 146;
            case 247 -> 124;
            case 248 -> 20;
            case 249 -> 161;
            case 250 -> 143;
            case 251 -> 12;
            case 252 -> 175;
            case 253 -> 102;
            case 254 -> 92;
            default -> 228;
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

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   
   public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker p0) {
      this();
   }
}
}
