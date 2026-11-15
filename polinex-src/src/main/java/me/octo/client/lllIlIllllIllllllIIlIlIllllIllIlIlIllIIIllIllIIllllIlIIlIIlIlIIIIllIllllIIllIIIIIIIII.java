package me.octo.client;

import java.util.Locale;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import org.jetbrains.annotations.NotNull;

public final class lllIlIllllIllllllIIlIlIllllIllIlIlIllIIIllIllIIllllIlIIlIIlIlIIIIllIllllIIllIIIIIIIII
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static lllIlIllllIllllllIIlIlIllllIllIlIlIllIIIllIllIIllllIlIIlIIlIlIIIIllIllllIIllIIIIIIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private boolean lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @JvmField
   @NotNull
   public static lllIlIllllIllllllIIlIlIllllIllIlIlIllIIIllIllIIllllIlIIlIIlIlIIIIllIllllIIllIIIIIIIII IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static String[] f;
   private static String[] g;

   private lllIlIllllIllllllIIlIlIllllIllIlIlIllIIIllIllIIllllIlIIlIIlIlIIIIllIllllIIllIIIIIIIII() {
      short var10001 = 29002;
      short var10002 = 26375;
      var10002 = 29004;
      short var10003 = 31205;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      short var10004 = 29003;
      short var10005 = 30860;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         llIllIlllIIlIlIIIlIIlIIlIllllIIlllIIllIIIlIIIIIlIlIIIlllIIlllIllllIlIlllIllIllIIIIlll.a()
      };
      super("Auto Pass Renew", "Automatically re-buys your Crystal Hollows pass before it expires.", var3, "Crystal Hollows", var1);
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      Object var18 = null; // PX-FIX
      Object var17 = null; // PX-FIX
      boolean var16 = false; // PX-FIX
      Object var14 = null; // PX-FIX
      short var10001 = 28997;
      short var10002 = -25527;
      Intrinsics.checkNotNullParameter(var1, "event");
      int[] var10000 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      Packet var3 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      int[] var2 = var10000;
      boolean var7 = var3 instanceof ClientboundSystemChatPacket;
      if (var2 != null) {
         if (!var7) {
            return;
         }

         var7 = ((ClientboundSystemChatPacket)var3).overlay();
      }

      if (!var7) {
         if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g()
            == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
            )
          {
            me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var8 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            String var20 = ((ClientboundSystemChatPacket)var3).content().getString();
            short var10003 = 28998;
            short var10004 = 14739;
            Intrinsics.checkNotNullExpressionValue(var20, "getString(...)");
            String var9 = StringsKt.trim(var8.a(var20)).toString().toLowerCase(Locale.ROOT);
            var10002 = 29000;
            var10003 = -2456;
            Intrinsics.checkNotNullExpressionValue(var9, "toLowerCase(...)");
            String var4 = var9;
            CharSequence var10 = var4;
            var10001 = 29001;
            var10002 = 9050;
            boolean var11 = StringsKt.contains(var10, "crystal hollows", false);
            if (var2 != null) {
               if (!var11) {
                  return;
               }

               CharSequence var12 = var4;
               var10001 = 29005;
               var10002 = 8618;
               var11 = StringsKt.contains(var12, "pass", false);
            }

            if (var2 != null) {
               if (!var11) {
                  return;
               }

               CharSequence var13 = var4;
               var10001 = 28996;
               var10002 = 26269;
               var11 = StringsKt.contains(var13, "expire", false);
            }

            boolean var5;
            label69: {
               label92: {
                  var5 = var11;
                  var14 = ((me.octo.client.PXDyn)(Object)(llIllIlllIIlIlIIIlIIlIIlIllllIIlllIIllIIIlIIIIIlIlIIIlllIIlllIllllIlIlllIllIllIIIIlll.a())).al();
                  if (var2 != null) {
                     if (!((Boolean)var14)) {
                        break label92;
                     }

                     CharSequence var15 = var4;
                     var10001 = 29006;
                     var10002 = -4631;
                     var14 = StringsKt.contains(var15, "do not have an active", false);
                  }

                  if (var2 == null) {
                     break label69;
                  }

                  if (((Boolean)(var14))) {
                     var14 = true;
                     break label69;
                  }
               }

               var14 = false;
            }

            label58: {
               label93: {
                  boolean var6 =((Boolean)( var14));
                  var16 = var5;
                  label56:
                  if (var2 != null) {
                     if (!var5) {
                        var16 = var6;
                        if (var2 == null) {
                           break label56;
                        }

                        if (!var6) {
                           return;
                        }
                     }

                     var17 = this;
                     if (var2 == null) {
                        break label93;
                     }

                     var16 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
                  }

                  if (var16) {
                     var18 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                     if (var2 == null) {
                        break label58;
                     }

                     if (!((java.util.function.Supplier<Boolean>)(() -> { this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.a(2000); return false; })).get()) {
                        return;
                     }
                  }

                  this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = true;
                  var17 = this;
               }

               var18 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
            }

            ((me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI)var18).f();
            short var19 = 29007;
            var10001 = 952;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b("purchasecrystallhollowspass");
         }
      }
   }

   @Override
   public void aB() {
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = false;
      super.aB();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[11];
      int var3 = 0;
      String var2 = "\u0018[ïx\u0094ÓK\u009f\u0001'ä;;Ë\u0082É°5\u0015Îgnyw«à±\u000e¡b\u008aÉÓ\u0090zzõ\u0093÷\u0002WÜ\u0092\u0007æJ\u001cK\u0091é\u008bj\u000eTâGÍ}×T½«Ö\u0095d¤\u0004\u0082\u0017¬{\u0015ÑÅ\u0003óÕ\u0096u\u0081\u001aÒÌ<\u000e m'\u001bzûü3\u001b\u0017Ä\u001f\u0087I¡RÝÅñi\u008f0àQÌR°½ÇT¯\u008aí\u008aNP\u0010ûe8æK\u0004ïËQÐ¥ÑlT\u0089¹\u000f^«L\u009dUðQ²Rìä\u008d-J\u0095\u000fó¼\u0092\u0084v}æG\u0013$\u008a;\u0018¦\u0016\u000f?\tDÉTzqãvÆDÈ9â\u0017\u0006º\u0087\u001fI\u00117";
      int var4 = "\u0018[ïx\u0094ÓK\u009f\u0001'ä;;Ë\u0082É°5\u0015Îgnyw«à±\u000e¡b\u008aÉÓ\u0090zzõ\u0093÷\u0002WÜ\u0092\u0007æJ\u001cK\u0091é\u008bj\u000eTâGÍ}×T½«Ö\u0095d¤\u0004\u0082\u0017¬{\u0015ÑÅ\u0003óÕ\u0096u\u0081\u001aÒÌ<\u000e m'\u001bzûü3\u001b\u0017Ä\u001f\u0087I¡RÝÅñi\u008f0àQÌR°½ÇT¯\u008aí\u008aNP\u0010ûe8æK\u0004ïËQÐ¥ÑlT\u0089¹\u000f^«L\u009dUðQ²Rìä\u008d-J\u0095\u000fó¼\u0092\u0084v}æG\u0013$\u008a;\u0018¦\u0016\u000f?\tDÉTzqãvÆDÈ9â\u0017\u0006º\u0087\u001fI\u00117"
         .length();
      char var1 = 'B';
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
                     case 0 -> 41;
                     case 1 -> 50;
                     case 2 -> 58;
                     case 3 -> 15;
                     case 4 -> 87;
                     case 5 -> 48;
                     default -> 105;
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
                     g = new String[11];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lllIlIllllIllllllIIlIlIllllIllIlIlIllIIIllIllIIllllIlIIlIIlIlIIIIllIllllIIllIIIIIIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new lllIlIllllIllllllIIlIlIllllIllIlIlIllIIIllIllIIllllIlIIlIIlIlIIIIllIllllIIllIIIIIIIII();
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

                  var2 = "\u001cyÆF\u0083\u000e·@à-tÉh²Ç4âc¾Û";
                  var4 = "\u001cyÆF\u0083\u000e·@à-tÉh²Ç4âc¾Û".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 93;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 29004) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 129;
            case 1 -> 237;
            case 2 -> 56;
            case 3 -> 227;
            case 4 -> 32;
            case 5 -> 99;
            case 6 -> 107;
            case 7 -> 5;
            case 8 -> 52;
            case 9 -> 217;
            case 10 -> 147;
            case 11 -> 78;
            case 12 -> 83;
            case 13 -> 74;
            case 14 -> 152;
            case 15 -> 235;
            case 16 -> 3;
            case 17 -> 92;
            case 18 -> 234;
            case 19 -> 26;
            case 20 -> 213;
            case 21 -> 66;
            case 22 -> 160;
            case 23 -> 54;
            case 24 -> 195;
            case 25 -> 50;
            case 26 -> 10;
            case 27 -> 114;
            case 28 -> 30;
            case 29 -> 218;
            case 30 -> 35;
            case 31 -> 246;
            case 32 -> 178;
            case 33 -> 123;
            case 34 -> 228;
            case 35 -> 136;
            case 36 -> 64;
            case 37 -> 94;
            case 38 -> 177;
            case 39 -> 6;
            case 40 -> 120;
            case 41 -> 16;
            case 42 -> 59;
            case 43 -> 233;
            case 44 -> 13;
            case 45 -> 240;
            case 46 -> 95;
            case 47 -> 18;
            case 48 -> 243;
            case 49 -> 119;
            case 50 -> 96;
            case 51 -> 145;
            case 52 -> 103;
            case 53 -> 4;
            case 54 -> 87;
            case 55 -> 231;
            case 56 -> 221;
            case 57 -> 155;
            case 58 -> 125;
            case 59 -> 224;
            case 60 -> 84;
            case 61 -> 68;
            case 62 -> 102;
            case 63 -> 67;
            case 64 -> 154;
            case 65 -> 199;
            case 66 -> 46;
            case 67 -> 34;
            case 68 -> 88;
            case 69 -> 62;
            case 70 -> 2;
            case 71 -> 23;
            case 72 -> 173;
            case 73 -> 205;
            case 74 -> 187;
            case 75 -> 255;
            case 76 -> 232;
            case 77 -> 101;
            case 78 -> 230;
            case 79 -> 8;
            case 80 -> 162;
            case 81 -> 149;
            case 82 -> 41;
            case 83 -> 21;
            case 84 -> 113;
            case 85 -> 253;
            case 86 -> 20;
            case 87 -> 111;
            case 88 -> 202;
            case 89 -> 90;
            case 90 -> 220;
            case 91 -> 15;
            case 92 -> 17;
            case 93 -> 72;
            case 94 -> 250;
            case 95 -> 212;
            case 96 -> 226;
            case 97 -> 0;
            case 98 -> 146;
            case 99 -> 183;
            case 100 -> 131;
            case 101 -> 241;
            case 102 -> 222;
            case 103 -> 48;
            case 104 -> 60;
            case 105 -> 197;
            case 106 -> 135;
            case 107 -> 236;
            case 108 -> 79;
            case 109 -> 57;
            case 110 -> 171;
            case 111 -> 39;
            case 112 -> 159;
            case 113 -> 93;
            case 114 -> 47;
            case 115 -> 193;
            case 116 -> 153;
            case 117 -> 180;
            case 118 -> 223;
            case 119 -> 22;
            case 120 -> 63;
            case 121 -> 112;
            case 122 -> 200;
            case 123 -> 210;
            case 124 -> 100;
            case 125 -> 31;
            case 126 -> 127;
            case 127 -> 19;
            case 128 -> 71;
            case 129 -> 150;
            case 130 -> 91;
            case 131 -> 166;
            case 132 -> 9;
            case 133 -> 121;
            case 134 -> 85;
            case 135 -> 24;
            case 136 -> 28;
            case 137 -> 105;
            case 138 -> 229;
            case 139 -> 158;
            case 140 -> 144;
            case 141 -> 126;
            case 142 -> 242;
            case 143 -> 116;
            case 144 -> 157;
            case 145 -> 132;
            case 146 -> 82;
            case 147 -> 189;
            case 148 -> 196;
            case 149 -> 156;
            case 150 -> 118;
            case 151 -> 249;
            case 152 -> 172;
            case 153 -> 29;
            case 154 -> 69;
            case 155 -> 142;
            case 156 -> 164;
            case 157 -> 211;
            case 158 -> 45;
            case 159 -> 117;
            case 160 -> 244;
            case 161 -> 252;
            case 162 -> 104;
            case 163 -> 219;
            case 164 -> 214;
            case 165 -> 181;
            case 166 -> 122;
            case 167 -> 148;
            case 168 -> 194;
            case 169 -> 184;
            case 170 -> 25;
            case 171 -> 206;
            case 172 -> 27;
            case 173 -> 204;
            case 174 -> 80;
            case 175 -> 203;
            case 176 -> 207;
            case 177 -> 209;
            case 178 -> 110;
            case 179 -> 170;
            case 180 -> 182;
            case 181 -> 245;
            case 182 -> 216;
            case 183 -> 143;
            case 184 -> 70;
            case 185 -> 124;
            case 186 -> 33;
            case 187 -> 174;
            case 188 -> 192;
            case 189 -> 38;
            case 190 -> 179;
            case 191 -> 97;
            case 192 -> 61;
            case 193 -> 49;
            case 194 -> 40;
            case 195 -> 239;
            case 196 -> 137;
            case 197 -> 55;
            case 198 -> 130;
            case 199 -> 75;
            case 200 -> 109;
            case 201 -> 208;
            case 202 -> 44;
            case 203 -> 186;
            case 204 -> 12;
            case 205 -> 161;
            case 206 -> 37;
            case 207 -> 165;
            case 208 -> 76;
            case 209 -> 36;
            case 210 -> 151;
            case 211 -> 53;
            case 212 -> 254;
            case 213 -> 115;
            case 214 -> 7;
            case 215 -> 73;
            case 216 -> 51;
            case 217 -> 58;
            case 218 -> 65;
            case 219 -> 106;
            case 220 -> 188;
            case 221 -> 191;
            case 222 -> 167;
            case 223 -> 98;
            case 224 -> 251;
            case 225 -> 190;
            case 226 -> 42;
            case 227 -> 198;
            case 228 -> 168;
            case 229 -> 11;
            case 230 -> 128;
            case 231 -> 133;
            case 232 -> 169;
            case 233 -> 89;
            case 234 -> 14;
            case 235 -> 238;
            case 236 -> 108;
            case 237 -> 81;
            case 238 -> 225;
            case 239 -> 141;
            case 240 -> 134;
            case 241 -> 185;
            case 242 -> 138;
            case 243 -> 175;
            case 244 -> 248;
            case 245 -> 139;
            case 246 -> 163;
            case 247 -> 86;
            case 248 -> 176;
            case 249 -> 77;
            case 250 -> 43;
            case 251 -> 247;
            case 252 -> 1;
            case 253 -> 201;
            case 254 -> 215;
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
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }
}
