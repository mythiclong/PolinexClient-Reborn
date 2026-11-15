package me.octo.client;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.npc.villager.Villager;
import net.minecraft.world.phys.EntityHitResult;
import org.jetbrains.annotations.NotNull;

public final class IlIllIIIlIlIIlIIllIlIlIIIIIIIIlIlIIIlIIIllIllIllllIIIIIIllIIIIIIIlIIIllIlIIllllIllIII
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static IlIllIIIlIlIIlIIllIlIlIIIIIIIIlIlIIIlIIIllIllIllllIIIIIIllIIIIIIIlIIIllIlIIllllIllIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private long lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private long lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @JvmField
   @NotNull
   public static IlIllIIIlIlIIlIIllIlIlIIIIIIIIlIlIIIlIIIllIllIllllIIIIIIllIIIIIIIlIIIllIlIIllllIllIII IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private static Regex llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static String[] f;
   private static String[] g;

   private IlIllIIIlIlIIlIIllIlIlIIIIIIIIlIlIIIlIIIllIllIllllIIIIIIllIIIIIIIlIIIllIlIIllllIllIII() {
      short var10001 = 11819;
      short var10002 = 24008;
      var10002 = 11823;
      short var10003 = 7084;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      short var10004 = 11822;
      short var10005 = 10303;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         llIlIIlIllllIlllIIlIlIllIIlIIlIIIIlIIlIIIlIIIllIlIIIlIllllIllIIIlIlIIlIllIIIlllIIlllI.a()
      };
      super("Auto Conversation", "Auto-advances NPC dialogue (Bankers, Quest NPCs, Galatea questline).", var3, "NPCs", var1);
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      Object var7 = null; // PX-FIX
      int var2 = lIIlllllllIlIlIIlIIlllIIIIIIIllIIIlIIIIIIlIlIIlIIIIIllIIIllIlIIIIIllllIlllllllIllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c();
      me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var10000 = var1;
      if (var2 == 0) {
         short var10001 = 11818;
         short var10002 = -10169;
         Intrinsics.checkNotNullParameter(var1, "event");
         if (!this.ae()) {
            return;
         }

         var10000 = var1;
      }

      label37: {
         Packet var5 = var10000.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         Packet var6 = var5;
         if (var2 == 0) {
            if (!(var5 instanceof ClientboundSystemChatPacket)) {
               var7 = null;
               break label37;
            }

            var6 = var5;
         }

         var7 = (ClientboundSystemChatPacket)var6;
      }

      if (var7 != null) {
         ClientboundSystemChatPacket var3 =((ClientboundSystemChatPacket)( var7));
         if (var2 == 0) {
            String var8 = var3.content().tryCollapseToString();
            if (var8 != null) {
               String var4 = var8;
               if (llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.containsMatchIn(var4)) {
                  this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = System.nanoTime();
               }

               return;
            }
         }
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl var1) {
      Object var13 = null; // PX-FIX
      int var2;
      IlIllIIIlIlIIlIIllIlIlIIIIIIIIlIlIIIlIIIllIllIllllIIIIIIllIIIIIIIlIIIllIlIIllllIllIII var9;
      label91: {
         int var10000 = lIIlllllllIlIlIIlIIlllIIIIIIIllIIIlIIIIIIlIlIIlIIIIIllIIIllIlIIIIIllllIlllllllIllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c();
         short var10002 = 11817;
         short var10003 = -26699;
         Intrinsics.checkNotNullParameter(var1, "event");
         var2 = var10000;
         int var8 = ((this.ae()) ? 1 : 0);
         if (var2 == 0) {
            if ((var8 == 0)) {
               return;
            }

            var9 = this;
            if (var2 != 0) {
               break label91;
            }

            long var14;
            var8 = (var14 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl - 0L) == 0L ? 0 : (var14 < 0L ? -1 : 1);
         }

         if ((var8 == 0)) {
            return;
         }

         var9 = this;
      }

      Minecraft var10 = var9.ap();
      if (var2 == 0) {
         if (var10.screen != null) {
            return;
         }

         var10 = this.ap();
      }

      if (var2 == 0) {
         if (var10.player == null) {
            return;
         }

         var10 = this.ap();
      }

      if (var10.level != null) {
         long var3 = System.nanoTime();
         long var5 = (var3 - this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) / 1000000L;
         long var15;
         int var11 = (var15 = var5 - 1100L) == 0L ? 0 : (var15 < 0L ? -1 : 1);
         if (var2 == 0) {
            if (var11 < 0) {
               return;
            }

            long var16;
            var11 = (var16 = var5 - 4000L) == 0L ? 0 : (var16 < 0L ? -1 : 1);
         }

         if (var2 == 0) {
            if (var11 > 0) {
               this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 0L;
               return;
            }

            long var17;
            var11 = (var17 = (var3 - this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll) / 1000000L - 1100L) == 0L
               ? 0
               : (var17 < 0L ? -1 : 1);
         }

         if (var11 >= 0) {
            Entity var7;
            EntityHitResult var12 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .H();
            var7 = var12 != null ? var12.getEntity() : null;
            var13 = ((me.octo.client.PXDyn)(Object)(llIlIIlIllllIlllIIlIlIllIIlIIlIIIIlIIlIIIlIIIllIlIIIlIllllIllIIIlIlIIlIllIIIlllIIlllI.a())).ae();
            label67:
            if (var2 == 0) {
               if ((me.octo.client.PxTruth.truth(var13))) {
                  var13 = var7 instanceof Villager;
                  if (var2 != 0) {
                     break label67;
                  }

                  if (!(me.octo.client.PxTruth.truth(var13))) {
                     return;
                  }
               }

               var13 = var7 instanceof Villager;
            }

            label60: {
               if ((me.octo.client.PxTruth.truth(var13))) {
                  me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a(var7);
                  if (var2 == 0) {
                     break label60;
                  }
               }

               me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.p();
            }

            this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var3;
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "\u007fã\u008e\u001e\u0017?5\u0017ÌX\u0085\u00adÐ@\u008b\u0003'\u0005zÿ\u009fÿR\u0005tF^Èj\u000f\tzÄù@\u0005ã\u0090\u001f(\u0004\u0013u¨×";
      int var4 = "\u007fã\u008e\u001e\u0017?5\u0017ÌX\u0085\u00adÐ@\u008b\u0003'\u0005zÿ\u009fÿR\u0005tF^Èj\u000f\tzÄù@\u0005ã\u0090\u001f(\u0004\u0013u¨×"
         .length();
      char var1 = 17;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 62;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var25 = var10001.toCharArray();
               int var10004 = var25.length;
               int var6 = 0;
               byte var28 = var10000;
               var20 = var25;
               int var14 = var10004;
               byte var34;
               char[] var38;
               int var10006;
               if (var10004 <= 1) {
                  var38 = var25;
                  var34 = var10000;
                  var10006 = var6;
               } else {
                  var28 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var38 = var25;
                  var34 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var38[var10006] = (char)(var38[var10006] ^ var34 ^ switch (var6 % 7) {
                     case 0 -> 77;
                     case 1 -> 74;
                     case 2 -> 44;
                     case 3 -> 102;
                     case 4 -> 96;
                     case 5 -> 8;
                     default -> 105;
                  });
                  var6++;
                  if (var28 == 0) {
                     var10006 = var28;
                     var38 = var20;
                     var34 = var28;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var38 = var20;
                     var34 = var28;
                     var10006 = var6;
                  }
               }
            }

            String var30 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var30;
                  if ((var8 += var1) >= var4) {
                     f = var5;
                     g = new String[6];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IlIllIIIlIlIIlIIllIlIlIIIIIIIIlIlIIIlIIIllIllIllllIIIIIIllIIIIIIIlIIIllIlIIllllIllIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new IlIllIIIlIlIIlIIllIlIlIIIIIIIIlIlIIIlIIIllIllIllllIIIIIIllIIIIIIIlIIIllIlIIllllIllIII();
                     var10002 = 11816;
                     short var31 = -21636;
                     llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new Regex("\\[NPC]\\s*[^:]+:");
                     break label52;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var30;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "\u0090Òò¹\u0014hs\u0002økf6\f2æ-å\u0088nàY\u0000\u0016{b\u001c\u000b\u007f3¼ÿæ¤\u00143¦DÑ\u008e¹Å\u0097±Y¿¸C¬HOS×\u0011ò¶Ø\u000b8Íj\u008cLý./\u00198Y\u0004Ì¼ é";
                  var4 = "\u0090Òò¹\u0014hs\u0002økf6\f2æ-å\u0088nàY\u0000\u0016{b\u001c\u000b\u007f3¼ÿæ¤\u00143¦DÑ\u008e¹Å\u0097±Y¿¸C¬HOS×\u0011ò¶Ø\u000b8Íj\u008cLý./\u00198Y\u0004Ì¼ é"
                     .length();
                  var1 = 'D';
                  var8 = -1;
            }

            var10000 = 27;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 11819) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 141;
            case 1 -> 179;
            case 2 -> 231;
            case 3 -> 165;
            case 4 -> 63;
            case 5 -> 251;
            case 6 -> 139;
            case 7 -> 83;
            case 8 -> 47;
            case 9 -> 219;
            case 10 -> 57;
            case 11 -> 158;
            case 12 -> 123;
            case 13 -> 248;
            case 14 -> 20;
            case 15 -> 68;
            case 16 -> 188;
            case 17 -> 229;
            case 18 -> 244;
            case 19 -> 182;
            case 20 -> 104;
            case 21 -> 2;
            case 22 -> 59;
            case 23 -> 144;
            case 24 -> 87;
            case 25 -> 85;
            case 26 -> 232;
            case 27 -> 210;
            case 28 -> 113;
            case 29 -> 49;
            case 30 -> 66;
            case 31 -> 7;
            case 32 -> 79;
            case 33 -> 56;
            case 34 -> 1;
            case 35 -> 52;
            case 36 -> 125;
            case 37 -> 60;
            case 38 -> 121;
            case 39 -> 46;
            case 40 -> 143;
            case 41 -> 225;
            case 42 -> 235;
            case 43 -> 137;
            case 44 -> 205;
            case 45 -> 81;
            case 46 -> 96;
            case 47 -> 186;
            case 48 -> 30;
            case 49 -> 67;
            case 50 -> 128;
            case 51 -> 23;
            case 52 -> 41;
            case 53 -> 198;
            case 54 -> 8;
            case 55 -> 28;
            case 56 -> 26;
            case 57 -> 142;
            case 58 -> 111;
            case 59 -> 160;
            case 60 -> 130;
            case 61 -> 16;
            case 62 -> 150;
            case 63 -> 18;
            case 64 -> 195;
            case 65 -> 48;
            case 66 -> 32;
            case 67 -> 184;
            case 68 -> 22;
            case 69 -> 34;
            case 70 -> 77;
            case 71 -> 78;
            case 72 -> 62;
            case 73 -> 230;
            case 74 -> 236;
            case 75 -> 215;
            case 76 -> 50;
            case 77 -> 163;
            case 78 -> 159;
            case 79 -> 120;
            case 80 -> 136;
            case 81 -> 168;
            case 82 -> 202;
            case 83 -> 6;
            case 84 -> 149;
            case 85 -> 155;
            case 86 -> 29;
            case 87 -> 33;
            case 88 -> 138;
            case 89 -> 234;
            case 90 -> 154;
            case 91 -> 5;
            case 92 -> 109;
            case 93 -> 222;
            case 94 -> 250;
            case 95 -> 80;
            case 96 -> 114;
            case 97 -> 249;
            case 98 -> 247;
            case 99 -> 108;
            case 100 -> 24;
            case 101 -> 194;
            case 102 -> 117;
            case 103 -> 54;
            case 104 -> 218;
            case 105 -> 166;
            case 106 -> 134;
            case 107 -> 105;
            case 108 -> 162;
            case 109 -> 252;
            case 110 -> 176;
            case 111 -> 92;
            case 112 -> 223;
            case 113 -> 0;
            case 114 -> 174;
            case 115 -> 101;
            case 116 -> 94;
            case 117 -> 228;
            case 118 -> 55;
            case 119 -> 99;
            case 120 -> 15;
            case 121 -> 178;
            case 122 -> 86;
            case 123 -> 44;
            case 124 -> 206;
            case 125 -> 112;
            case 126 -> 19;
            case 127 -> 255;
            case 128 -> 196;
            case 129 -> 199;
            case 130 -> 157;
            case 131 -> 73;
            case 132 -> 38;
            case 133 -> 200;
            case 134 -> 91;
            case 135 -> 40;
            case 136 -> 72;
            case 137 -> 164;
            case 138 -> 116;
            case 139 -> 242;
            case 140 -> 43;
            case 141 -> 106;
            case 142 -> 17;
            case 143 -> 140;
            case 144 -> 214;
            case 145 -> 211;
            case 146 -> 58;
            case 147 -> 246;
            case 148 -> 93;
            case 149 -> 146;
            case 150 -> 127;
            case 151 -> 122;
            case 152 -> 208;
            case 153 -> 169;
            case 154 -> 107;
            case 155 -> 4;
            case 156 -> 118;
            case 157 -> 100;
            case 158 -> 76;
            case 159 -> 3;
            case 160 -> 151;
            case 161 -> 183;
            case 162 -> 207;
            case 163 -> 180;
            case 164 -> 175;
            case 165 -> 224;
            case 166 -> 97;
            case 167 -> 36;
            case 168 -> 102;
            case 169 -> 10;
            case 170 -> 51;
            case 171 -> 172;
            case 172 -> 233;
            case 173 -> 216;
            case 174 -> 75;
            case 175 -> 161;
            case 176 -> 239;
            case 177 -> 181;
            case 178 -> 197;
            case 179 -> 147;
            case 180 -> 156;
            case 181 -> 245;
            case 182 -> 217;
            case 183 -> 243;
            case 184 -> 201;
            case 185 -> 124;
            case 186 -> 153;
            case 187 -> 190;
            case 188 -> 103;
            case 189 -> 241;
            case 190 -> 53;
            case 191 -> 253;
            case 192 -> 212;
            case 193 -> 209;
            case 194 -> 21;
            case 195 -> 237;
            case 196 -> 65;
            case 197 -> 191;
            case 198 -> 37;
            case 199 -> 192;
            case 200 -> 39;
            case 201 -> 226;
            case 202 -> 84;
            case 203 -> 25;
            case 204 -> 173;
            case 205 -> 167;
            case 206 -> 64;
            case 207 -> 82;
            case 208 -> 126;
            case 209 -> 119;
            case 210 -> 9;
            case 211 -> 131;
            case 212 -> 31;
            case 213 -> 221;
            case 214 -> 132;
            case 215 -> 45;
            case 216 -> 71;
            case 217 -> 115;
            case 218 -> 61;
            case 219 -> 133;
            case 220 -> 42;
            case 221 -> 88;
            case 222 -> 170;
            case 223 -> 148;
            case 224 -> 14;
            case 225 -> 189;
            case 226 -> 13;
            case 227 -> 240;
            case 228 -> 238;
            case 229 -> 187;
            case 230 -> 95;
            case 231 -> 152;
            case 232 -> 213;
            case 233 -> 193;
            case 234 -> 129;
            case 235 -> 11;
            case 236 -> 254;
            case 237 -> 98;
            case 238 -> 145;
            case 239 -> 185;
            case 240 -> 203;
            case 241 -> 227;
            case 242 -> 69;
            case 243 -> 135;
            case 244 -> 12;
            case 245 -> 90;
            case 246 -> 70;
            case 247 -> 27;
            case 248 -> 220;
            case 249 -> 204;
            case 250 -> 110;
            case 251 -> 171;
            case 252 -> 74;
            case 253 -> 177;
            case 254 -> 89;
            default -> 35;
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
