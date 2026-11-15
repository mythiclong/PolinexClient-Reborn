package me.octo.client;

import java.util.Optional;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.ChatComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import net.minecraft.world.scores.PlayerTeam;
import org.jetbrains.annotations.NotNull;

public final class lIIlllllIIIIllIlIlllIlIIlIlIlIIlIlIllIIIlIIIIIllllllllIlllIIIIIlIIIlIlIlIIlllIllIlIlI
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   public static <T> T a(Object p0, Object p1) { return null; } // PX-FIX mr5
    public static <T> T visit(Object... args) { return null; } // PX-FIX ovld-var
   @NotNull
   public static lIIlllllIIIIllIlIlllIlIIlIlIlIIlIlIllIIIlIIIIIllllllllIlllIIIIIlIIIlIlIlIIlllIllIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @JvmField
   @NotNull
   public static lIIlllllIIIIllIlIlllIlIIlIlIlIIlIlIllIIIlIIIIIllllllllIlllIIIIIlIIIlIlIlIIlllIllIlIlI lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private static Regex lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private static Regex IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private static Regex llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static String[] f;
   private static String[] g;

   public lIIlllllIIIIllIlIlllIlIIlIlIlIIlIlIllIIIlIIIIIllllllllIlllIIIIIlIIIlIlIlIIlllIllIlIlI() {
      short var10001 = -8233;
      short var10002 = 22703;
      var10002 = -8235;
      short var10003 = -17656;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      short var10004 = -8227;
      short var10005 = 32442;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         IIllIIIIIllIlIlllIIlIIIlIllIlIIllIIllIIllllllllIllllIllIlIIIIlIlIlIllIlIIIllIIIlIIIII.a(),
         IIllIIIIIllIlIlllIIlIIIlIllIlIIllIIllIIllllllllIllllIllIlIIIIlIlIlIllIlIIIllIIIlIIIII.b(),
         IIllIIIIIllIlIlllIIlIIIlIllIlIIllIIllIIllllllllIllllIllIlIIIIlIlIlIllIlIIIllIIIlIIIII.c()
      };
      super("Hide Sensitive Info", "Hides your Profile ID and server ID.", var3, "Misc", var1);
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      boolean var13 = false; // PX-FIX
      Object var12 = null; // PX-FIX
      Object var11 = null; // PX-FIX
      int[] var2 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var10000 = var1;
      if (var2 == null) {
         short var10001 = -8228;
         short var10002 = -4902;
         Intrinsics.checkNotNullParameter(var1, "event");
         if (!this.aA()) {
            return;
         }

         var10000 = var1;
      }

      Packet var3 = var10000.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      Packet var9 = var3;
      if (var2 == null) {
         if (!(var3 instanceof ClientboundSystemChatPacket)) {
            return;
         }

         var9 = var3;
      }

      String var4;
      label90: {
         label96: {
            String var10 = ((ClientboundSystemChatPacket)var9).content().getString();
            short var20 = -8239;
            short var10003 = 10869;
            Intrinsics.checkNotNullExpressionValue(var10, "getString(...)");
            var4 = var10;
            var11 = ((me.octo.client.PXDyn)(Object)(IIllIIIIIllIlIlllIIlIIIlIllIlIIllIIllIIllllllllIllllIllIlIIIIlIlIlIllIlIIIllIIIlIIIII.a())).al();
            if (var2 == null) {
               if (!((Boolean)var11)) {
                  break label96;
               }

               var11 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.containsMatchIn(var4);
            }

            if (var2 != null) {
               break label90;
            }

            if (((Boolean)(var11))) {
               var11 = true;
               break label90;
            }
         }

         var11 = false;
      }

      boolean var5;
      label79: {
         label97: {
            var5 =((Boolean)( var11));
            var12 = ((me.octo.client.PXDyn)(Object)(IIllIIIIIllIlIlllIIlIIIlIllIlIIllIIllIIllllllllIllllIllIlIIIIlIlIlIllIlIIIllIIIlIIIII.b())).al();
            if (var2 == null) {
               if (!((Boolean)var12)) {
                  break label97;
               }

               var12 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.containsMatchIn(var4);
            }

            if (var2 != null) {
               break label79;
            }

            if (((Boolean)(var12))) {
               var12 = true;
               break label79;
            }
         }

         var12 = false;
      }

      boolean var6;
      var6 =((Boolean)( var12));
      var13 = var5;
      label68:
      if (var2 == null) {
         if (!var5) {
            var13 = var6;
            if (var2 != null) {
               break label68;
            }

            if (!var6) {
               return;
            }
         }

         var1.a(true);
         lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var14 = IIllIIIIIllIlIlllIIlIIIlIllIlIIllIIllIIllllllllIllllIllIlIIIIlIlIlIllIlIIIllIIIlIIIII.c();
         short var19 = -8229;
         short var21 = -16760;
         var13 = var14.c("Remove");
      }

      if (!var13) {
         MutableComponent var15 = Component.empty();
         short var22 = -8245;
         short var24 = -16416;
         Intrinsics.checkNotNullExpressionValue(var15, "empty(...)");
         MutableComponent var7 = var15;
         ((ClientboundSystemChatPacket)var3)
            .content()
            .visit((net.minecraft.network.chat.FormattedText.StyledContentConsumer)(lIIlllllIIIIllIlIlllIlIIlIlIlIIlIlIllIIIlIIIIIllllllllIlllIIIIIlIIIlIlIlIIlllIllIlIlI::a), Style.EMPTY);
         Minecraft var16 = Minecraft.getInstance();
         var22 = -8234;
         var24 = -8964;
         Intrinsics.checkNotNullExpressionValue(var16, "getInstance(...)");
         Minecraft var8 = var16;
         Minecraft var17 = var8;
         if (var2 == null) {
            if (var8.isSameThread()) {
               if (var8.gui != null) {
                  ChatComponent var18 = var8.gui.getChat();
                  if (var18 != null) {
                     var18.addClientSystemMessage(var7);
                     return;
                  }
               }

               if (var2 == null) {
                  return;
               }
            }

            var17 = var8;
         }

         var17.execute(null);
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII var1) {
      int[] var10000 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      short var10002 = -8232;
      short var10003 = -30070;
      Intrinsics.checkNotNullParameter(var1, "event");
      int[] var2 = var10000;
      boolean var8 = this.aA();
      if (var2 == null) {
         if (!var8) {
            return;
         }

         var8 = ((me.octo.client.PXDyn)(Object)(IIllIIIIIllIlIlllIIlIIIlIllIlIIllIIllIIllllllllIllllIllIlIIIIlIlIlIllIlIIIllIIIlIIIII.b())).al();
      }

      if (var8) {
         for (Object var9 : var1.l().getScoreboard().getPlayerTeams()) {
            var10002 = -8226;
            var10003 = 22561;
            Intrinsics.checkNotNullExpressionValue(var9, "next(...)");
            PlayerTeam var4 = (PlayerTeam)var9;
            String var10 = var4.getPlayerPrefix().getString();
            var10002 = -8238;
            var10003 = 616;
            Intrinsics.checkNotNullExpressionValue(var10, "getString(...)");
            String var5 = var10;
            if (var2 == null) {
               MatchResult var11 = (llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI).find( var5, 0);
               if (var11 != null) {
                  MatchResult var6 = var11;
                  String var7 = var6.getValue();
                  int var12 = ((Intrinsics.areEqual(var7, var5)) ? 1 : 0);
                  if (var2 == null) {
                     if (var12 == 0) {
                        var4.setPlayerPrefix(
                           me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.m(var7)
                        );
                     }

                     String var13 = var4.getPlayerSuffix().getString();
                     var10002 = -8238;
                     var10003 = 616;
                     Intrinsics.checkNotNullExpressionValue(var13, "getString(...)");
                     var12 = var13.length();
                  }

                  if (var2 == null) {
                     var12 = var12 > 0 ? 1 : 0;
                  }

                  if (var12 != 0) {
                     var4.setPlayerSuffix(
                        me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.m("")
                     );
                     if (var2 != null) {
                        break;
                     }
                  }
               }
            }
         }
      }
   }

   private static final String a(boolean var0, boolean var1, String var2) {
      int[] var10000 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      String var4 = var2;
      int[] var3 = var10000;
      boolean var5 = var0;
      if (var3 == null) {
         if (var0) {
            CharSequence var10001 = var2;
            short var10002 = -8240;
            short var10003 = -20458;
            var4 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.replace(
               var10001, "Profile ID: ████████-████-████-████-████████████"
            );
         }

         var5 = var1;
      }

      if (var5) {
         CharSequence var6 = var4;
         short var7 = -8230;
         short var8 = 16963;
         var4 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.replace(var6, "Sending to server ████████...");
      }

      return var4;
   }

   private static final Optional a(MutableComponent var0, boolean var1, boolean var2, Style var3, String var4) {
      short var10001 = -8237;
      short var10002 = 8501;
      Intrinsics.checkNotNullParameter(var3, "style");
      var10001 = -8231;
      var10002 = -11035;
      Intrinsics.checkNotNullParameter(var4, "segment");
      var0.append(Component.literal(a(var1, var2, var4)).withStyle(var3));
      return Optional.empty();
   }

   private static final void a(Minecraft var0, MutableComponent var1) {
      if (var0.gui != null) {
         ChatComponent var10000 = var0.gui.getChat();
         if (var10000 != null) {
            var10000.addClientSystemMessage(var1);
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[18];
      int var3 = 0;
      String var2 = "¬\u0098¬ÑY³\u001d\u0081ÿ+6Õ.Io=ê\u0019Ö\fe\u0017\u001edN╂┋▉╙○╶┌▥XÓç\u0007\u001aºu\u0097:2*\u0005\u0090Êòë\u0099\u001bs<uN\u001e!0\u008e\u0012ÖüQ°\u0095\u0080\u0000\u0096\u008dÈ¨5Y-ì\u0004l+\tcîû\u0004Z:\u0098«:\u0004nG\u0016«\u0005W;\nÕ\u0086\u0005){\r\u009dè\u000e\u0097fA2ÜcØ\u0017Ó%»ÝÜ©\u000e£\u0017Ç\u001c\f¦Â¯\u00902Ó?Ñõ0ÞÓ¢DÅ IìB±v ╕╨▒◷┏▋▊┎5◹╍╢◜\u0082◤▀▤◪l┨◷╺┿Ò┝┖◖▩▥◴▌╤◌◹◲╀\u0013ÁÐQ_\u0098\u001f\u0082\u009d\u00015-ñGÏY\u0092-0\u0013\u0010(C¶\u008c8ì\u0000È\u007f{M2 \u0095è\u009b$\u008b\u0014\u0018Çâ\u007fè\u008dÕ\r%·\u009c\u0013àb\u0096\tiÏ\u009d\u0090õ\u0014ó{\u008bþ7\u008bóßíà\r{\u0011ö\u0094>,Ô°Ä\u0091ß¤öµ>ÈB(m";
      int var4 = "¬\u0098¬ÑY³\u001d\u0081ÿ+6Õ.Io=ê\u0019Ö\fe\u0017\u001edN╂┋▉╙○╶┌▥XÓç\u0007\u001aºu\u0097:2*\u0005\u0090Êòë\u0099\u001bs<uN\u001e!0\u008e\u0012ÖüQ°\u0095\u0080\u0000\u0096\u008dÈ¨5Y-ì\u0004l+\tcîû\u0004Z:\u0098«:\u0004nG\u0016«\u0005W;\nÕ\u0086\u0005){\r\u009dè\u000e\u0097fA2ÜcØ\u0017Ó%»ÝÜ©\u000e£\u0017Ç\u001c\f¦Â¯\u00902Ó?Ñõ0ÞÓ¢DÅ IìB±v ╕╨▒◷┏▋▊┎5◹╍╢◜\u0082◤▀▤◪l┨◷╺┿Ò┝┖◖▩▥◴▌╤◌◹◲╀\u0013ÁÐQ_\u0098\u001f\u0082\u009d\u00015-ñGÏY\u0092-0\u0013\u0010(C¶\u008c8ì\u0000È\u007f{M2 \u0095è\u009b$\u008b\u0014\u0018Çâ\u007fè\u008dÕ\r%·\u009c\u0013àb\u0096\tiÏ\u009d\u0090õ\u0014ó{\u008bþ7\u008bóßíà\r{\u0011ö\u0094>,Ô°Ä\u0091ß¤öµ>ÈB(m"
         .length();
      char var1 = 6;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 59;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var27 = var10001.toCharArray();
               int var10004 = var27.length;
               int var6 = 0;
               byte var30 = var10000;
               var20 = var27;
               int var14 = var10004;
               byte var38;
               char[] var42;
               int var10006;
               if (var10004 <= 1) {
                  var42 = var27;
                  var38 = var10000;
                  var10006 = var6;
               } else {
                  var30 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var42 = var27;
                  var38 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var42[var10006] = (char)(var42[var10006] ^ var38 ^ switch (var6 % 7) {
                     case 0 -> 90;
                     case 1 -> 19;
                     case 2 -> 91;
                     case 3 -> 90;
                     case 4 -> 77;
                     case 5 -> 121;
                     default -> 37;
                  });
                  var6++;
                  if (var30 == 0) {
                     var10006 = var30;
                     var42 = var20;
                     var38 = var30;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var42 = var20;
                     var38 = var30;
                     var10006 = var6;
                  }
               }
            }

            String var32 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var32;
                  if ((var8 += var1) >= var4) {
                     f = var5;
                     g = new String[18];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lIIlllllIIIIllIlIlllIlIIlIlIlIIlIlIllIIIlIIIIIllllllllIlllIIIIIlIIIlIlIlIIlllIllIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new lIIlllllIIIIllIlIlllIlIIlIlIlIIlIlIllIIIlIIIIIllllllllIlllIIIIIlIIIlIlIlIIlllIllIlIlI();
                     var10002 = -8246;
                     short var33 = 26890;
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new Regex("Profile ID: [0-9a-fA-F-]{36}");
                     var10002 = -8225;
                     short var34 = -11357;
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new Regex("Sending to server \\S+\\.\\.\\.");
                     var10002 = -8236;
                     short var35 = -30083;
                     llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new Regex("\\d{2}/\\d{2}/\\d{2}");
                     break label52;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var32;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "0Nw\u009d\u0017\u008bÎßsñ\u001cxòòäK°\u001czlç7î*\u009dõÓ\u009f©&\u0016\u0017@(\u0013\u0016Y\nW";
                  var4 = "0Nw\u009d\u0017\u008bÎßsñ\u001cxòòäK°\u001czlç7î*\u009dõÓ\u009f©&\u0016\u0017@(\u0013\u0016Y\nW".length();
                  var1 = '\n';
                  var8 = -1;
            }

            var10000 = 63;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -8229) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 230;
            case 1 -> 9;
            case 2 -> 181;
            case 3 -> 71;
            case 4 -> 87;
            case 5 -> 36;
            case 6 -> 24;
            case 7 -> 201;
            case 8 -> 151;
            case 9 -> 56;
            case 10 -> 108;
            case 11 -> 112;
            case 12 -> 3;
            case 13 -> 217;
            case 14 -> 114;
            case 15 -> 120;
            case 16 -> 78;
            case 17 -> 0;
            case 18 -> 98;
            case 19 -> 77;
            case 20 -> 214;
            case 21 -> 95;
            case 22 -> 145;
            case 23 -> 62;
            case 24 -> 94;
            case 25 -> 16;
            case 26 -> 187;
            case 27 -> 11;
            case 28 -> 116;
            case 29 -> 189;
            case 30 -> 186;
            case 31 -> 51;
            case 32 -> 128;
            case 33 -> 231;
            case 34 -> 252;
            case 35 -> 198;
            case 36 -> 60;
            case 37 -> 33;
            case 38 -> 209;
            case 39 -> 193;
            case 40 -> 203;
            case 41 -> 61;
            case 42 -> 164;
            case 43 -> 137;
            case 44 -> 179;
            case 45 -> 196;
            case 46 -> 34;
            case 47 -> 91;
            case 48 -> 191;
            case 49 -> 90;
            case 50 -> 84;
            case 51 -> 76;
            case 52 -> 118;
            case 53 -> 142;
            case 54 -> 135;
            case 55 -> 141;
            case 56 -> 92;
            case 57 -> 127;
            case 58 -> 155;
            case 59 -> 28;
            case 60 -> 241;
            case 61 -> 180;
            case 62 -> 121;
            case 63 -> 171;
            case 64 -> 152;
            case 65 -> 159;
            case 66 -> 23;
            case 67 -> 150;
            case 68 -> 48;
            case 69 -> 134;
            case 70 -> 99;
            case 71 -> 86;
            case 72 -> 250;
            case 73 -> 206;
            case 74 -> 123;
            case 75 -> 207;
            case 76 -> 63;
            case 77 -> 226;
            case 78 -> 220;
            case 79 -> 68;
            case 80 -> 81;
            case 81 -> 248;
            case 82 -> 188;
            case 83 -> 202;
            case 84 -> 117;
            case 85 -> 176;
            case 86 -> 37;
            case 87 -> 245;
            case 88 -> 97;
            case 89 -> 147;
            case 90 -> 153;
            case 91 -> 212;
            case 92 -> 88;
            case 93 -> 227;
            case 94 -> 225;
            case 95 -> 149;
            case 96 -> 160;
            case 97 -> 64;
            case 98 -> 17;
            case 99 -> 131;
            case 100 -> 185;
            case 101 -> 172;
            case 102 -> 211;
            case 103 -> 173;
            case 104 -> 109;
            case 105 -> 54;
            case 106 -> 236;
            case 107 -> 38;
            case 108 -> 234;
            case 109 -> 235;
            case 110 -> 115;
            case 111 -> 222;
            case 112 -> 126;
            case 113 -> 75;
            case 114 -> 129;
            case 115 -> 183;
            case 116 -> 45;
            case 117 -> 205;
            case 118 -> 228;
            case 119 -> 72;
            case 120 -> 96;
            case 121 -> 47;
            case 122 -> 249;
            case 123 -> 221;
            case 124 -> 5;
            case 125 -> 53;
            case 126 -> 21;
            case 127 -> 166;
            case 128 -> 1;
            case 129 -> 133;
            case 130 -> 216;
            case 131 -> 163;
            case 132 -> 89;
            case 133 -> 139;
            case 134 -> 43;
            case 135 -> 26;
            case 136 -> 223;
            case 137 -> 143;
            case 138 -> 197;
            case 139 -> 106;
            case 140 -> 240;
            case 141 -> 57;
            case 142 -> 50;
            case 143 -> 42;
            case 144 -> 132;
            case 145 -> 58;
            case 146 -> 52;
            case 147 -> 138;
            case 148 -> 170;
            case 149 -> 162;
            case 150 -> 85;
            case 151 -> 178;
            case 152 -> 10;
            case 153 -> 244;
            case 154 -> 104;
            case 155 -> 30;
            case 156 -> 6;
            case 157 -> 2;
            case 158 -> 192;
            case 159 -> 111;
            case 160 -> 199;
            case 161 -> 251;
            case 162 -> 239;
            case 163 -> 119;
            case 164 -> 175;
            case 165 -> 27;
            case 166 -> 110;
            case 167 -> 200;
            case 168 -> 190;
            case 169 -> 204;
            case 170 -> 195;
            case 171 -> 70;
            case 172 -> 254;
            case 173 -> 224;
            case 174 -> 158;
            case 175 -> 25;
            case 176 -> 184;
            case 177 -> 242;
            case 178 -> 154;
            case 179 -> 219;
            case 180 -> 165;
            case 181 -> 146;
            case 182 -> 12;
            case 183 -> 140;
            case 184 -> 247;
            case 185 -> 4;
            case 186 -> 93;
            case 187 -> 46;
            case 188 -> 174;
            case 189 -> 14;
            case 190 -> 148;
            case 191 -> 39;
            case 192 -> 83;
            case 193 -> 69;
            case 194 -> 208;
            case 195 -> 130;
            case 196 -> 243;
            case 197 -> 66;
            case 198 -> 113;
            case 199 -> 32;
            case 200 -> 157;
            case 201 -> 194;
            case 202 -> 255;
            case 203 -> 177;
            case 204 -> 31;
            case 205 -> 233;
            case 206 -> 218;
            case 207 -> 55;
            case 208 -> 73;
            case 209 -> 35;
            case 210 -> 49;
            case 211 -> 80;
            case 212 -> 59;
            case 213 -> 8;
            case 214 -> 161;
            case 215 -> 182;
            case 216 -> 168;
            case 217 -> 7;
            case 218 -> 169;
            case 219 -> 74;
            case 220 -> 101;
            case 221 -> 29;
            case 222 -> 44;
            case 223 -> 156;
            case 224 -> 144;
            case 225 -> 238;
            case 226 -> 237;
            case 227 -> 167;
            case 228 -> 19;
            case 229 -> 210;
            case 230 -> 105;
            case 231 -> 82;
            case 232 -> 124;
            case 233 -> 15;
            case 234 -> 102;
            case 235 -> 253;
            case 236 -> 122;
            case 237 -> 18;
            case 238 -> 20;
            case 239 -> 136;
            case 240 -> 79;
            case 241 -> 246;
            case 242 -> 107;
            case 243 -> 213;
            case 244 -> 232;
            case 245 -> 22;
            case 246 -> 215;
            case 247 -> 40;
            case 248 -> 100;
            case 249 -> 41;
            case 250 -> 65;
            case 251 -> 13;
            case 252 -> 229;
            case 253 -> 67;
            case 254 -> 125;
            default -> 103;
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

      public final boolean a() {
         int[] var1 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
         boolean var10000 = lIIlllllIIIIllIlIlllIlIIlIlIlIIlIlIllIIIlIIIIIllllllllIlllIIIIIlIIIlIlIlIIlllIllIlIlI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
            .aA();
         if (var1 == null) {
            if (!var10000) {
               return false;
            }

            var10000 = ((me.octo.client.PXDyn)(Object)(IIllIIIIIllIlIlllIIlIIIlIllIlIIllIIllIIllllllllIllllIllIlIIIIlIlIlIllIlIIIllIIIlIIIII.b())).al();
         }

         return var1 != null ? var10000 : var10000;
      }
   }
}
