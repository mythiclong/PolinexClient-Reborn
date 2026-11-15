package me.octo.client;

import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundPlayerChatPacket;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import org.jetbrains.annotations.NotNull;

public final class IlllIlIllIllIIllIIlIIIIIIIllllIlIllIIlllIIIllIlIlIIIIIIlIIlllIlIllIlIIIllIllIIlIlllll
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static IlllIlIllIllIIllIIlIIIIIIIllllIlIllIIlllIIIllIlIlIIIIIIlIIlllIlIllIlIIIllIllIIlIlllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @JvmField
   @NotNull
   public static IlllIlIllIllIIllIIlIIIIIIIllllIlIllIIlllIIIllIlIlIIIIIIlIIlllIlIllIlIIIllIllIIlIlllll lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static String[] f;
   private static String[] g;

   private IlllIlIllIllIIllIIlIIIIIIIllllIlIllIIlllIIIllIlIlIIIIIIlIIlllIlIllIlIIIllIllIIlIlllll() {
      short var10001 = 8413;
      short var10002 = 19051;
      var10002 = 8412;
      short var10003 = 6544;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      short var10004 = 8408;
      short var10005 = 13036;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         lllIIllIIlIlllIlllIIlIIllIIlIllllIlIlIIlllllllIlIlIIllIlIlllIlllIIIIllIlIlIIIIlIllIIl.a(),
         lllIIllIIlIlllIlllIIlIIllIIlIllllIlIlIIlllllllIlIlIIllIlIlllIlllIIIIllIlIlIIIIlIllIIl.b(),
         lllIIllIIlIlllIlllIIlIIllIIlIllllIlIlIIlllllllIlIlIIllIlIlllIlllIIIIllIlIlIIIIlIllIIl.c(),
         lllIIllIIlIlllIlllIIlIIllIIlIllllIlIlIIlllllllIlIlIIllIlIlllIlllIIIIllIlIlIIIIlIllIIl.d()
      };
      super("Auto Responder", "Automatically responds to chat triggers for duping", var3, "Misc", var1);
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      Packet var9 = null; // PX-FIX
      int[] var10000 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      short var10002 = 8406;
      short var10003 = -897;
      Intrinsics.checkNotNullParameter(var1, "event");
      int[] var2 = var10000;
      Minecraft var6 = this.ap();
      if (var2 == null) {
         if (var6.player == null) {
            return;
         }

         var6 = this.ap();
      }

      if (var6.level != null) {
         label47: {
            Packet var3 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            boolean var7 = var3 instanceof ClientboundSystemChatPacket;
            if (var2 == null) {
               if (var7) {
                  String var8 = ((ClientboundSystemChatPacket)var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI)
                     .content()
                     .getString();
                  var10002 = 8414;
                  var10003 = -18485;
                  Intrinsics.checkNotNullExpressionValue(var8, "getString(...)");
                  String var4 = var8;
                  if (var2 == null) {
                     if (!StringsKt.contains(var4, ((me.octo.client.PXDyn)(Object)(lllIIllIIlIlllIlllIIlIIllIIlIllllIlIlIIlllllllIlIlIIllIlIlllIlllIIIIllIlIlIIIIlIllIIl.a())).U(), false)) {
                        return;
                     }

                     this.ag();
                  }

                  if (var2 == null) {
                     return;
                  }
               }

               var9 = var3;
               if (var2 != null) {
                  break label47;
               }

               var7 = var3 instanceof ClientboundPlayerChatPacket;
            }

            if (!var7) {
               return;
            }

            var9 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         }

         String var10 = ((ClientboundPlayerChatPacket)var9).body().content();
         var10002 = 8410;
         var10003 = -335;
         Intrinsics.checkNotNullExpressionValue(var10, "content(...)");
         String var5 = var10;
         if (StringsKt.contains(var5, ((me.octo.client.PXDyn)(Object)(lllIIllIIlIlllIlllIIlIIllIIlIllllIlIlIIlllllllIlIlIIllIlIlllIlllIIIIllIlIlIIIIlIllIIl.a())).U(), false)) {
            this.ag();
         }
      }
   }

   private final void ag() {
      int[] var1 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      if (((java.util.function.Supplier<Boolean>)(() -> { this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.a(1000); return false; })).get()) {
         label19: {
            String var2 = ((me.octo.client.PXDyn)(Object)(lllIIllIIlIlllIlllIIlIIllIIlIllllIlIlIIlllllllIlIlIIllIlIlllIlllIIIIllIlIlIIIIlIllIIl.d())).y();
            short var10001 = 8407;
            short var10002 = 16331;
            boolean var10000 = Intrinsics.areEqual(var2, "Confirm");
            if (var1 == null) {
               if (var10000) {
                  this.ah();
                  if (var1 == null) {
                     break label19;
                  }
               }

               var10001 = 8415;
               var10002 = 16235;
               var10000 = Intrinsics.areEqual(var2, "Chest");
            }

            if (var10000) {
               this.ai();
            }
         }

         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.f();
      }
   }

   private final void ah() {
      me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(
            ((me.octo.client.PXDyn)(Object)(lllIIllIIlIlllIlllIIlIIllIIlIllllIlIlIIlllllllIlIlIIllIlIlllIlllIIIIllIlIlIIIIlIllIIl.b())).M(),
            IlllIlIllIllIIllIIlIIIIIIIllllIlIllIIlllIIIllIlIlIIIIIIlIIlllIlIllIlIIIllIllIIlIlllll::aG
         );
   }

   private final void ai() {
      me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(
            ((me.octo.client.PXDyn)(Object)(lllIIllIIlIlllIlllIIlIIllIIlIllllIlIlIIlllllllIlIlIIllIlIlllIlllIIIIllIlIlIIIIlIllIIl.c())).M(),
            IlllIlIllIllIIllIIlIIIIIIIllllIlIllIIlllIIIllIlIlIIIIIIlIIlllIlIllIlIIIllIllIIlIlllll::aH
         );
   }

   @Override
   public void aB() {
      this.as();
   }

   @Override
   public void aC() {
      this.at();
   }

   private static final Unit aG() {
      try {
         short var2 = 8411;
         me.octo.client.utils.player.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(29, 0, 0);
         short var3 = -4785;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Auto-confirmed kick action");
      } catch (Exception var1) {
         String var10000 = var1.getMessage();
         short var10001 = 8404;
         short var10002 = -4873;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
            "Failed to perform kick action: " + var10000
         );
      }

      return Unit.INSTANCE;
   }

   private static final Unit aH() {
      int[] var0 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();

      try {
         int var1 = 53;

         while (var1 < 90) {
            try {
               me.octo.client.utils.player.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a(var1, 0, 1);
               var1++;
               if (var0 != null) {
                  return Unit.INSTANCE;
               }

               if (var0 != null) {
                  break;
               }
            } catch (Exception var2) {
               throw (RuntimeException)a(var2);
            }
         }

         short var4 = 8409;
         short var5 = -6586;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
            "Auto-moved inventory items to chest"
         );
      } catch (Exception var3) {
         String var10000 = var3.getMessage();
         short var10001 = 8405;
         short var10002 = -141;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
            "Failed to perform chest action: " + var10000
         );
      }

      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[12];
      int var3 = 0;
      String var2 = "\fÙ\u001fØt\u000e±U\u0019Å\u0087Jâ\u0002§\u001b¤Jè\n\u000e×\u00887P\u0016c\u0002\u001e!aÁàG\u00072ÄsU/\u0017¿×Ê»¬á\u009e\u001d\u0093\u009eëL1Ñ\u008f]8»¾É'a)[ìÖæ¦ö\u000eä÷µ±\u0080ôÚ_!c\u0080Þ\u001bJY\u001a¸dÚÍ¦á²Dj\u0092`Qì\u000fmº0Ç\u0003n\u0086\u00931ÄF\u0098\f½ä\u0006\u009f,Þ¹I;úW·#\n\u0094\u008cÓl,ë*BIT\u0082yãðrswÌ¬\u0004³\b\u0087c`5äô\u009e¯jµâ\u008a\u0004k\u0083*¢\u0007àZ\u0089ZÑ*\u0092\u0005WÉ\u0096\u001aE";
      int var4 = "\fÙ\u001fØt\u000e±U\u0019Å\u0087Jâ\u0002§\u001b¤Jè\n\u000e×\u00887P\u0016c\u0002\u001e!aÁàG\u00072ÄsU/\u0017¿×Ê»¬á\u009e\u001d\u0093\u009eëL1Ñ\u008f]8»¾É'a)[ìÖæ¦ö\u000eä÷µ±\u0080ôÚ_!c\u0080Þ\u001bJY\u001a¸dÚÍ¦á²Dj\u0092`Qì\u000fmº0Ç\u0003n\u0086\u00931ÄF\u0098\f½ä\u0006\u009f,Þ¹I;úW·#\n\u0094\u008cÓl,ë*BIT\u0082yãðrswÌ¬\u0004³\b\u0087c`5äô\u009e¯jµâ\u008a\u0004k\u0083*¢\u0007àZ\u0089ZÑ*\u0092\u0005WÉ\u0096\u001aE"
         .length();
      char var1 = 5;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 30;
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
                     case 0 -> 73;
                     case 1 -> 67;
                     case 2 -> 36;
                     case 3 -> 64;
                     case 4 -> 115;
                     case 5 -> 108;
                     default -> 50;
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
                     g = new String[12];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IlllIlIllIllIIllIIlIIIIIIIllllIlIllIIlllIIIllIlIlIIIIIIlIIlllIlIllIlIIIllIllIIlIlllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new IlllIlIllIllIIllIIlIIIIIIIllllIlIllIIlllIIIllIlIlIIIIIIlIIlllIlIllIlIIIllIllIIlIlllll();
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

                  var2 = "Â{\u009cHkÆö®¾,#\u001d\"~ý<s\u009d\u0014µ\u009aJÅW%t×\u009a\u0085R+Ï\u001fë;¹@ÏÇb\u008e,(q\u009dhn´>ZÝ9¼0R\u0002\u000e\u0001!\fÃAë\u0088";
                  var4 = "Â{\u009cHkÆö®¾,#\u001d\"~ý<s\u009d\u0014µ\u009aJÅW%t×\u009a\u0085R+Ï\u001fë;¹@ÏÇb\u008e,(q\u009dhn´>ZÝ9¼0R\u0002\u000e\u0001!\fÃAë\u0088"
                     .length();
                  var1 = ' ';
                  var8 = -1;
            }

            var10000 = 98;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 8415) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 26;
            case 1 -> 193;
            case 2 -> 77;
            case 3 -> 114;
            case 4 -> 20;
            case 5 -> 16;
            case 6 -> 90;
            case 7 -> 172;
            case 8 -> 89;
            case 9 -> 82;
            case 10 -> 171;
            case 11 -> 14;
            case 12 -> 240;
            case 13 -> 28;
            case 14 -> 211;
            case 15 -> 68;
            case 16 -> 126;
            case 17 -> 236;
            case 18 -> 160;
            case 19 -> 149;
            case 20 -> 245;
            case 21 -> 34;
            case 22 -> 105;
            case 23 -> 232;
            case 24 -> 204;
            case 25 -> 146;
            case 26 -> 33;
            case 27 -> 129;
            case 28 -> 173;
            case 29 -> 119;
            case 30 -> 151;
            case 31 -> 206;
            case 32 -> 76;
            case 33 -> 96;
            case 34 -> 81;
            case 35 -> 39;
            case 36 -> 8;
            case 37 -> 249;
            case 38 -> 238;
            case 39 -> 17;
            case 40 -> 254;
            case 41 -> 21;
            case 42 -> 137;
            case 43 -> 246;
            case 44 -> 57;
            case 45 -> 235;
            case 46 -> 187;
            case 47 -> 162;
            case 48 -> 133;
            case 49 -> 157;
            case 50 -> 70;
            case 51 -> 11;
            case 52 -> 203;
            case 53 -> 217;
            case 54 -> 244;
            case 55 -> 47;
            case 56 -> 139;
            case 57 -> 181;
            case 58 -> 121;
            case 59 -> 183;
            case 60 -> 123;
            case 61 -> 207;
            case 62 -> 186;
            case 63 -> 225;
            case 64 -> 15;
            case 65 -> 23;
            case 66 -> 124;
            case 67 -> 22;
            case 68 -> 56;
            case 69 -> 97;
            case 70 -> 80;
            case 71 -> 174;
            case 72 -> 110;
            case 73 -> 100;
            case 74 -> 79;
            case 75 -> 166;
            case 76 -> 0;
            case 77 -> 180;
            case 78 -> 109;
            case 79 -> 218;
            case 80 -> 189;
            case 81 -> 213;
            case 82 -> 197;
            case 83 -> 93;
            case 84 -> 45;
            case 85 -> 198;
            case 86 -> 209;
            case 87 -> 231;
            case 88 -> 158;
            case 89 -> 242;
            case 90 -> 91;
            case 91 -> 83;
            case 92 -> 220;
            case 93 -> 42;
            case 94 -> 159;
            case 95 -> 120;
            case 96 -> 247;
            case 97 -> 182;
            case 98 -> 94;
            case 99 -> 152;
            case 100 -> 67;
            case 101 -> 127;
            case 102 -> 62;
            case 103 -> 18;
            case 104 -> 3;
            case 105 -> 10;
            case 106 -> 12;
            case 107 -> 175;
            case 108 -> 13;
            case 109 -> 36;
            case 110 -> 50;
            case 111 -> 230;
            case 112 -> 30;
            case 113 -> 179;
            case 114 -> 237;
            case 115 -> 25;
            case 116 -> 51;
            case 117 -> 150;
            case 118 -> 55;
            case 119 -> 75;
            case 120 -> 61;
            case 121 -> 69;
            case 122 -> 116;
            case 123 -> 101;
            case 124 -> 199;
            case 125 -> 108;
            case 126 -> 53;
            case 127 -> 145;
            case 128 -> 170;
            case 129 -> 6;
            case 130 -> 102;
            case 131 -> 223;
            case 132 -> 167;
            case 133 -> 164;
            case 134 -> 212;
            case 135 -> 140;
            case 136 -> 64;
            case 137 -> 178;
            case 138 -> 216;
            case 139 -> 95;
            case 140 -> 169;
            case 141 -> 73;
            case 142 -> 128;
            case 143 -> 184;
            case 144 -> 200;
            case 145 -> 155;
            case 146 -> 132;
            case 147 -> 190;
            case 148 -> 192;
            case 149 -> 131;
            case 150 -> 143;
            case 151 -> 210;
            case 152 -> 4;
            case 153 -> 66;
            case 154 -> 44;
            case 155 -> 142;
            case 156 -> 122;
            case 157 -> 31;
            case 158 -> 112;
            case 159 -> 24;
            case 160 -> 63;
            case 161 -> 99;
            case 162 -> 201;
            case 163 -> 255;
            case 164 -> 98;
            case 165 -> 168;
            case 166 -> 144;
            case 167 -> 38;
            case 168 -> 130;
            case 169 -> 118;
            case 170 -> 250;
            case 171 -> 134;
            case 172 -> 92;
            case 173 -> 165;
            case 174 -> 5;
            case 175 -> 147;
            case 176 -> 41;
            case 177 -> 148;
            case 178 -> 226;
            case 179 -> 65;
            case 180 -> 185;
            case 181 -> 248;
            case 182 -> 229;
            case 183 -> 215;
            case 184 -> 32;
            case 185 -> 85;
            case 186 -> 154;
            case 187 -> 224;
            case 188 -> 7;
            case 189 -> 205;
            case 190 -> 86;
            case 191 -> 37;
            case 192 -> 113;
            case 193 -> 19;
            case 194 -> 135;
            case 195 -> 103;
            case 196 -> 78;
            case 197 -> 117;
            case 198 -> 29;
            case 199 -> 115;
            case 200 -> 195;
            case 201 -> 58;
            case 202 -> 221;
            case 203 -> 104;
            case 204 -> 52;
            case 205 -> 188;
            case 206 -> 239;
            case 207 -> 27;
            case 208 -> 107;
            case 209 -> 252;
            case 210 -> 163;
            case 211 -> 106;
            case 212 -> 214;
            case 213 -> 228;
            case 214 -> 241;
            case 215 -> 9;
            case 216 -> 84;
            case 217 -> 253;
            case 218 -> 49;
            case 219 -> 111;
            case 220 -> 234;
            case 221 -> 153;
            case 222 -> 233;
            case 223 -> 54;
            case 224 -> 59;
            case 225 -> 136;
            case 226 -> 2;
            case 227 -> 176;
            case 228 -> 243;
            case 229 -> 202;
            case 230 -> 74;
            case 231 -> 72;
            case 232 -> 71;
            case 233 -> 196;
            case 234 -> 40;
            case 235 -> 222;
            case 236 -> 138;
            case 237 -> 191;
            case 238 -> 46;
            case 239 -> 161;
            case 240 -> 88;
            case 241 -> 43;
            case 242 -> 208;
            case 243 -> 48;
            case 244 -> 194;
            case 245 -> 156;
            case 246 -> 1;
            case 247 -> 141;
            case 248 -> 87;
            case 249 -> 227;
            case 250 -> 177;
            case 251 -> 125;
            case 252 -> 219;
            case 253 -> 35;
            case 254 -> 251;
            default -> 60;
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
}
