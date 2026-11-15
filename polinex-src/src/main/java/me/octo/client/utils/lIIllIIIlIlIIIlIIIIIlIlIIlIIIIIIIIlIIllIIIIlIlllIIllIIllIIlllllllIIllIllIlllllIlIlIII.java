package me.octo.client.utils;

import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundPlayerInfoUpdatePacket;
import net.minecraft.network.protocol.game.ClientboundTabListPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerInfoUpdatePacket.Action;
import net.minecraft.network.protocol.game.ClientboundPlayerInfoUpdatePacket.Entry;
import org.jetbrains.annotations.NotNull;

public final class lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII
   extends lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   @NotNull
   public static lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static ConcurrentHashMap<UUID, String> IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private static String lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private static String IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static String[] c;
   private static String[] d;

   private lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII() {
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      Packet var29;
      label119: {
         String var10000 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
         short var10002 = -32425;
         short var10003 = -23635;
         Intrinsics.checkNotNullParameter(var1, "event");
         String var2 = var10000;
         Packet var3 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         boolean var19 = var3 instanceof ClientboundPlayerInfoUpdatePacket;
         if (var2 == null) {
            if (var19) {
               EnumSet var20 = ((ClientboundPlayerInfoUpdatePacket)var3).actions();
               var10002 = -32426;
               var10003 = 24649;
               Intrinsics.checkNotNullExpressionValue(var20, "actions(...)");
               EnumSet var4 = var20;
               Iterator var5 = ((ClientboundPlayerInfoUpdatePacket)var3).entries().iterator();

               label112:
               while (true) {
                  boolean var21 = var5.hasNext();

                  Entry var6;
                  do {
                     if (!var21) {
                        return;
                     }

                     var29 = (Packet)var5.next();
                     var10002 = -32430;
                     var10003 = 3927;
                     Intrinsics.checkNotNullExpressionValue(var29, "next(...)");
                     var6 = (Entry)(Object)var29;
                     var21 = var4.contains(Action.ADD_PLAYER);
                     if (var2 == null) {
                        if (var21) {
                           Component var23 = var6.displayName();
                           if (var23 != null) {
                              Component var14 = var23;
                              boolean var17 = false;
                              IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.put(var6.profileId(), var14.getString());
                              continue label112;
                           }

                           lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var8 = this;
                           boolean var9 = false;
                           if (var2 == null) {
                              GameProfile var24 = var6.profile();
                              if (var24 != null) {
                                 GameProfile var10 = var24;
                                 boolean var11 = false;
                                 IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.put(var6.profileId(), var10.name());
                              }
                           }

                           if (var2 == null) {
                              continue label112;
                           }
                        }

                        var21 = var4.contains(Action.UPDATE_DISPLAY_NAME);
                     }

                     if (var2 == null) {
                        if (var21) {
                           Component var25 = var6.displayName();
                           if (var25 != null) {
                              Component var7 = var25;
                              boolean var13 = false;
                              IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.put(var6.profileId(), var7.getString());
                              continue label112;
                           }

                           if (var2 == null) {
                              continue label112;
                           }
                        }

                        var21 = var4.contains(Action.UPDATE_LISTED);
                     }

                     if (var2 == null) {
                        if (!var21) {
                           continue label112;
                        }

                        var21 = var6.listed();
                     }

                     if (var2 == null) {
                        if (!var21) {
                           IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.remove(var6.profileId());
                           if (var2 == null) {
                              continue label112;
                           }
                        }

                        var21 = var4.contains(Action.ADD_PLAYER);
                     }
                  } while (var2 != null);

                  if (var21) {
                     label125: {
                        Entry var26 = var6;
                        if (var2 == null) {
                           Component var27 = var6.displayName();
                           if (var27 != null) {
                              Component var12 = var27;
                              boolean var16 = false;
                              IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.put(var6.profileId(), var12.getString());
                              continue;
                           }

                           if (var2 != null) {
                              break label125;
                           }

                           var26 = var6;
                        }

                        GameProfile var28 = var26.profile();
                        if (var28 != null) {
                           GameProfile var15 = var28;
                           boolean var18 = false;
                           IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.put(var6.profileId(), var15.name());
                           continue;
                        }
                     }

                     if (var2 != null) {
                        break;
                     }
                  }
               }
            }

            var29 = var3;
            if (var2 != null) {
               break label119;
            }

            var19 = var3 instanceof ClientboundTabListPacket;
         }

         if (!var19) {
            return;
         }

         String var30 = ((ClientboundTabListPacket)var3).header().getString();
         var10002 = -32428;
         var10003 = -13839;
         Intrinsics.checkNotNullExpressionValue(var30, "getString(...)");
         lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var30;
         var29 = var3;
      }

      String var31 = ((ClientboundTabListPacket)var29).footer().getString();
      short var35 = -32429;
      short var39 = -12275;
      Intrinsics.checkNotNullExpressionValue(var31, "getString(...)");
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var31;
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII param1) {
      String var2 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "event");

      if (var2 == null) {
         net.minecraft.client.Minecraft var4 = this.a();

         if (var4.gui != null && var4.gui.getTabList() != null) {
            me.octo.client.mixin.accessors.PlayerTabOverlayAccessor var6 = (me.octo.client.mixin.accessors.PlayerTabOverlayAccessor) var4.gui.getTabList();

            lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var6.getHeader() != null ? var6.getHeader().getString() : "";
            IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var6.getFooter() != null ? var6.getFooter().getString() : "";
         }
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      short var10001 = -32425;
      short var10002 = -23635;
      Intrinsics.checkNotNullParameter(var1, "event");
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.clear();
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = "";
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = "";
   }

   @NotNull
   public final ConcurrentHashMap<UUID, String> g() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   @NotNull
   public final List<String> h() {
      Collection var12 = null; // PX-FIX
      String var10000 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      Map var2 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      String var1 = var10000;
      boolean var3 = false;
      Collection var5 = new ArrayList(var2.size());
      boolean var6 = false;
      Iterator var7 = var2.entrySet().iterator();

      while (true) {
         if (var7.hasNext()) {
            java.util.Map.Entry var8 = (java.util.Map.Entry)var7.next();
            var12 = var5;
            if (var1 != null) {
               break;
            }

            boolean var10 = false;
            var5.add(
               IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a((String)var8.getValue())
            );
            if (var1 == null) {
               continue;
            }
         }

         var12 = var5;
         break;
      }

      return (List<String>)var12;
   }

   @NotNull
   public final String i() {
      return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   @NotNull
   public final String j() {
      return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   @NotNull
   public final String k() {
      return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
         + "\n"
         + IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "=\u0018úrT\f\u001f\u000e+\u0000FÛ\u0014\u001a,±çB\u0005\u008fu¬ß\u009e\u000eã\u0081r\rv\u001bpÛ°\u0001\u0014\u0095¶]";
      int var4 = "=\u0018úrT\f\u001f\u000e+\u0000FÛ\u0014\u001a,±çB\u0005\u008fu¬ß\u009e\u000eã\u0081r\rv\u001bpÛ°\u0001\u0014\u0095¶]".length();
      char var1 = 5;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 8;
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
                     case 0 -> 108;
                     case 1 -> 84;
                     case 2 -> 117;
                     case 3 -> 36;
                     case 4 -> 17;
                     case 5 -> 124;
                     default -> 6;
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
                     c = var5;
                     d = new String[6];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII();
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new ConcurrentHashMap<>();
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = "";
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = "";
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

                  var2 = "¡Ö×\n/\u0016¶\u0097\u0085e_ô2\u009c\t\u001ft$y\u0080çÓ>È";
                  var4 = "¡Ö×\n/\u0016¶\u0097\u0085e_ô2\u009c\t\u001ft$y\u0080çÓ>È".length();
                  var1 = 14;
                  var8 = -1;
            }

            var10000 = 77;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -32425) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 240;
            case 1 -> 207;
            case 2 -> 35;
            case 3 -> 99;
            case 4 -> 53;
            case 5 -> 182;
            case 6 -> 87;
            case 7 -> 60;
            case 8 -> 228;
            case 9 -> 118;
            case 10 -> 143;
            case 11 -> 231;
            case 12 -> 11;
            case 13 -> 150;
            case 14 -> 152;
            case 15 -> 123;
            case 16 -> 128;
            case 17 -> 149;
            case 18 -> 49;
            case 19 -> 188;
            case 20 -> 33;
            case 21 -> 95;
            case 22 -> 54;
            case 23 -> 124;
            case 24 -> 82;
            case 25 -> 187;
            case 26 -> 198;
            case 27 -> 214;
            case 28 -> 44;
            case 29 -> 45;
            case 30 -> 165;
            case 31 -> 13;
            case 32 -> 201;
            case 33 -> 126;
            case 34 -> 232;
            case 35 -> 111;
            case 36 -> 66;
            case 37 -> 59;
            case 38 -> 213;
            case 39 -> 69;
            case 40 -> 29;
            case 41 -> 65;
            case 42 -> 219;
            case 43 -> 70;
            case 44 -> 71;
            case 45 -> 166;
            case 46 -> 185;
            case 47 -> 97;
            case 48 -> 40;
            case 49 -> 108;
            case 50 -> 254;
            case 51 -> 155;
            case 52 -> 31;
            case 53 -> 104;
            case 54 -> 193;
            case 55 -> 122;
            case 56 -> 144;
            case 57 -> 67;
            case 58 -> 196;
            case 59 -> 210;
            case 60 -> 138;
            case 61 -> 230;
            case 62 -> 7;
            case 63 -> 5;
            case 64 -> 224;
            case 65 -> 180;
            case 66 -> 222;
            case 67 -> 57;
            case 68 -> 181;
            case 69 -> 175;
            case 70 -> 51;
            case 71 -> 18;
            case 72 -> 137;
            case 73 -> 221;
            case 74 -> 186;
            case 75 -> 56;
            case 76 -> 208;
            case 77 -> 248;
            case 78 -> 183;
            case 79 -> 157;
            case 80 -> 91;
            case 81 -> 102;
            case 82 -> 12;
            case 83 -> 48;
            case 84 -> 43;
            case 85 -> 148;
            case 86 -> 37;
            case 87 -> 190;
            case 88 -> 62;
            case 89 -> 113;
            case 90 -> 189;
            case 91 -> 72;
            case 92 -> 88;
            case 93 -> 68;
            case 94 -> 249;
            case 95 -> 220;
            case 96 -> 163;
            case 97 -> 227;
            case 98 -> 147;
            case 99 -> 77;
            case 100 -> 234;
            case 101 -> 252;
            case 102 -> 133;
            case 103 -> 32;
            case 104 -> 151;
            case 105 -> 93;
            case 106 -> 173;
            case 107 -> 92;
            case 108 -> 24;
            case 109 -> 83;
            case 110 -> 192;
            case 111 -> 141;
            case 112 -> 255;
            case 113 -> 117;
            case 114 -> 115;
            case 115 -> 1;
            case 116 -> 21;
            case 117 -> 74;
            case 118 -> 135;
            case 119 -> 179;
            case 120 -> 90;
            case 121 -> 244;
            case 122 -> 134;
            case 123 -> 47;
            case 124 -> 212;
            case 125 -> 242;
            case 126 -> 250;
            case 127 -> 14;
            case 128 -> 38;
            case 129 -> 241;
            case 130 -> 106;
            case 131 -> 114;
            case 132 -> 27;
            case 133 -> 22;
            case 134 -> 129;
            case 135 -> 17;
            case 136 -> 233;
            case 137 -> 127;
            case 138 -> 172;
            case 139 -> 3;
            case 140 -> 153;
            case 141 -> 205;
            case 142 -> 216;
            case 143 -> 164;
            case 144 -> 159;
            case 145 -> 131;
            case 146 -> 139;
            case 147 -> 146;
            case 148 -> 16;
            case 149 -> 145;
            case 150 -> 23;
            case 151 -> 110;
            case 152 -> 30;
            case 153 -> 20;
            case 154 -> 2;
            case 155 -> 225;
            case 156 -> 15;
            case 157 -> 64;
            case 158 -> 204;
            case 159 -> 79;
            case 160 -> 174;
            case 161 -> 171;
            case 162 -> 85;
            case 163 -> 19;
            case 164 -> 76;
            case 165 -> 121;
            case 166 -> 61;
            case 167 -> 245;
            case 168 -> 58;
            case 169 -> 206;
            case 170 -> 238;
            case 171 -> 136;
            case 172 -> 223;
            case 173 -> 218;
            case 174 -> 195;
            case 175 -> 142;
            case 176 -> 46;
            case 177 -> 100;
            case 178 -> 25;
            case 179 -> 184;
            case 180 -> 6;
            case 181 -> 194;
            case 182 -> 226;
            case 183 -> 132;
            case 184 -> 156;
            case 185 -> 75;
            case 186 -> 251;
            case 187 -> 160;
            case 188 -> 169;
            case 189 -> 34;
            case 190 -> 101;
            case 191 -> 168;
            case 192 -> 229;
            case 193 -> 36;
            case 194 -> 116;
            case 195 -> 8;
            case 196 -> 89;
            case 197 -> 50;
            case 198 -> 202;
            case 199 -> 42;
            case 200 -> 253;
            case 201 -> 162;
            case 202 -> 176;
            case 203 -> 63;
            case 204 -> 161;
            case 205 -> 41;
            case 206 -> 200;
            case 207 -> 80;
            case 208 -> 125;
            case 209 -> 52;
            case 210 -> 94;
            case 211 -> 217;
            case 212 -> 203;
            case 213 -> 167;
            case 214 -> 39;
            case 215 -> 140;
            case 216 -> 78;
            case 217 -> 177;
            case 218 -> 81;
            case 219 -> 84;
            case 220 -> 191;
            case 221 -> 28;
            case 222 -> 154;
            case 223 -> 73;
            case 224 -> 170;
            case 225 -> 236;
            case 226 -> 237;
            case 227 -> 112;
            case 228 -> 197;
            case 229 -> 158;
            case 230 -> 0;
            case 231 -> 243;
            case 232 -> 105;
            case 233 -> 96;
            case 234 -> 211;
            case 235 -> 120;
            case 236 -> 235;
            case 237 -> 109;
            case 238 -> 178;
            case 239 -> 119;
            case 240 -> 55;
            case 241 -> 26;
            case 242 -> 86;
            case 243 -> 239;
            case 244 -> 9;
            case 245 -> 199;
            case 246 -> 215;
            case 247 -> 246;
            case 248 -> 103;
            case 249 -> 4;
            case 250 -> 107;
            case 251 -> 98;
            case 252 -> 247;
            case 253 -> 10;
            case 254 -> 130;
            default -> 209;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }
}
