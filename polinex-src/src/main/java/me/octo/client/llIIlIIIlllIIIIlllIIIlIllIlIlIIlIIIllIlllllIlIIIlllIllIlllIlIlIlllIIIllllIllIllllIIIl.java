package me.octo.client;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import org.jetbrains.annotations.NotNull;

public final class llIIlIIIlllIIIIlllIIIlIllIlIlIIlIIIllIlllllIlIIIlllIllIlllIlIlIlllIIIllllIllIllllIIIl {
   @NotNull
   public static llIIlIIIlllIIIIlllIIIlIllIlIlIIlIIIllIlllllIlIIIlllIllIlllIlIlIlllIIIllllIllIllllIIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static List<String> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static List<String> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static long IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static String[] a;
   private static String[] b;

   private llIIlIIIlllIIIIlllIIIlIllIlIlIIlIIIllIlllllIlIIIlllIllIlllIlIlIlllIIIllllIllIllllIIIl() {
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      boolean var24 = false; // PX-FIX
      Object var23 = null; // PX-FIX
      boolean var22 = false; // PX-FIX
      Object var21 = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = b();
      short var10002 = -1802;
      short var10003 = -22300;
      Intrinsics.checkNotNullParameter(var1, "event");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      Packet var3 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      boolean var19 = var3 instanceof ClientboundSystemChatPacket;
      if (var2 == null) {
         if (!var19) {
            return;
         }

         var19 = ((ClientboundSystemChatPacket)var3).overlay();
      }

      if (!var19) {
         String var4;
         label112: {
            me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var20 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            String var10001 = ((ClientboundSystemChatPacket)var3).content().getString();
            var10003 = -1798;
            short var10004 = 16388;
            Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
            var4 = var20.a(var10001);
            var var5 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            boolean var6 = false;
            var21 = var5;
            label105:
            if (var2 == null) {
               if (var5 instanceof Collection) {
                  var21 = (Collection)var5;
                  if (var2 != null) {
                     break label105;
                  }

                  if (((me.octo.client.PXDyn)var21).isEmpty()) {
                     var22 = false;
                     break label112;
                  }
               }

               var21 = var5;
            }

            Iterator var7 = ((me.octo.client.PXDyn)var21).iterator();

            label96:
            while (true) {
               if (!var7.hasNext()) {
                  var22 = false;
                  break;
               }

               Object var8 = var7.next();
               String var9 = (String)var8;
               boolean var10 = false;
               var22 = StringsKt.contains(var4, var9, true);

               while (var22) {
                  var22 = true;
                  if (var2 == null) {
                     break label96;
                  }
               }
            }
         }

         if (var22) {
            long var27 = System.currentTimeMillis() - IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            if (var2 == null) {
               if (var27 <= IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
                  return;
               }

               var27 = System.currentTimeMillis();
            }

            IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var27;
            short var31 = -1807;
            var10002 = -12604;
            me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("Server evacuation detected: " + var4);
            short var28 = -1799;
            var31 = 13824;
            Pair[] var13 = new Pair[2];
            var10003 = -1808;
            short var43 = 24060;
            var43 = -1801;
            short var46 = -27817;
            var13[0] = TuplesKt.to("title", "Server Evacuating");
            var10003 = -1800;
            var43 = 14245;
            var13[1] = TuplesKt.to("description", var4);
            me.octo.client.utils.lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.a(
               "evacuating", MapsKt.mapOf(var13), true, true
            );
         } else {
            label114: {
               var var11 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               boolean var14 = false;
               var23 = var11;
               label83:
               if (var2 == null) {
                  if (var11 instanceof Collection) {
                     var23 = (Collection)var11;
                     if (var2 != null) {
                        break label83;
                     }

                     if (((me.octo.client.PXDyn)var23).isEmpty()) {
                        var24 = false;
                        break label114;
                     }
                  }

                  var23 = var11;
               }

               Iterator var15 = ((me.octo.client.PXDyn)var23).iterator();

               label74:
               while (true) {
                  if (!var15.hasNext()) {
                     var24 = false;
                     break;
                  }

                  Object var16 = var15.next();
                  String var17 = (String)var16;
                  boolean var18 = false;
                  var24 = StringsKt.contains(var4, var17, true);

                  while (var24) {
                     var24 = true;
                     if (var2 == null) {
                        break label74;
                     }
                  }
               }
            }

            if (var24) {
               long var25 = System.currentTimeMillis() - lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
               if (var2 == null) {
                  if (var25 <= IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
                     return;
                  }

                  var25 = System.currentTimeMillis();
               }

               lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var25;
               short var29 = -1812;
               var10002 = -21807;
               me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("Server restart detected: " + var4);
               short var26 = -1806;
               var29 = 17821;
               Pair[] var12 = new Pair[2];
               var10003 = -1797;
               short var40 = -10066;
               var40 = -1803;
               short var10005 = -8503;
               var12[0] = TuplesKt.to("title", "Server Restarting");
               var10003 = -1796;
               var40 = 1341;
               var12[1] = TuplesKt.to("description", var4);
               me.octo.client.utils.lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.a(
                  "server_restart", MapsKt.mapOf(var12), true, true
               );
            }
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var22 = null; // PX-FIX
      String[] var5 = new String[18];
      int var3 = 0;
      String var2 = "ÚeXa\u0001þ\u0092Ó\u000b\u0094!¦\u009c\u008dMä¹c\rT\u0014@ ì©òG®\u009djx0xñ«b\u0015Úåù'\rbKK gÂZ\\7\u0007w)\u001d\n\u008aãVµÄ`.\b¹\u008d\u000býÎ\u008ba(òPNõó\u0086\u0005\u0005\u0002\u0081z\u0099\u000e\u0006\f\u0090\tªÒß(0!±\u0011Kù\u0011}\u0012Kï\u0006\u008f0¿¯3Z,{¥\u001aÈÏ\u0014<¸cº\u0003%\u0090Ê»¹Ø}+\u008f\u0010\u008d\u008e \u0005ö\u0011\u008cªuøÁmÈô£½½¹a\u0081(L\u0089\u0005©26\u0082M\u001c_+\u000fÈ\u008ek!\u0014\u009e\u0085\u001a¾\u0095a¶QS\u009a\u009bªöÙ¯)\u008d\u008dú`\u0005õ\u001b\u009fYZ\u001d\u009cÌ\u008b\u009d#e<ãÐ\u008aÂ\u008e«\u0085 pz\u008f8\u0006£\u009c\u0014\u0005\u008c\u001fb\u0088\u0080\u000e \"ÔéõO1\u0087\u001f\u0010LH¹)";
      int var4 = "ÚeXa\u0001þ\u0092Ó\u000b\u0094!¦\u009c\u008dMä¹c\rT\u0014@ ì©òG®\u009djx0xñ«b\u0015Úåù'\rbKK gÂZ\\7\u0007w)\u001d\n\u008aãVµÄ`.\b¹\u008d\u000býÎ\u008ba(òPNõó\u0086\u0005\u0005\u0002\u0081z\u0099\u000e\u0006\f\u0090\tªÒß(0!±\u0011Kù\u0011}\u0012Kï\u0006\u008f0¿¯3Z,{¥\u001aÈÏ\u0014<¸cº\u0003%\u0090Ê»¹Ø}+\u008f\u0010\u008d\u008e \u0005ö\u0011\u008cªuøÁmÈô£½½¹a\u0081(L\u0089\u0005©26\u0082M\u001c_+\u000fÈ\u008ek!\u0014\u009e\u0085\u001a¾\u0095a¶QS\u009a\u009bªöÙ¯)\u008d\u008dú`\u0005õ\u001b\u009fYZ\u001d\u009cÌ\u008b\u009d#e<ãÐ\u008aÂ\u008e«\u0085 pz\u008f8\u0006£\u009c\u0014\u0005\u008c\u001fb\u0088\u0080\u000e \"ÔéõO1\u0087\u001f\u0010LH¹)"
         .length();
      char var1 = '\b';
      b(null);
      int var9 = -1;

      label52:
while (true) {
         byte var10000 = 50;
         String var10001 = var2.substring(++var9, var9 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var32 = var10001.toCharArray();
               int var10004 = var32.length;
               int var6 = 0;
               byte var35 = var10000;
               var22 = var32;
               int var16 = var10004;
               byte var46;
               char[] var50;
               int var10006;
               if (var10004 <= 1) {
                  var50 = var32;
                  var46 = var10000;
                  var10006 = var6;
               } else {
                  var35 = var10000;
                  var16 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var50 = var32;
                  var46 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var50[var10006] = (char)(var50[var10006] ^ var46 ^ switch (var6 % 7) {
                     case 0 -> 92;
                     case 1 -> 16;
                     case 2 -> 80;
                     case 3 -> 100;
                     case 4 -> 72;
                     case 5 -> 64;
                     default -> 100;
                  });
                  var6++;
                  if (var35 == 0) {
                     var10006 = var35;
                     var50 = var22;
                     var46 = var35;
                  } else {
                     if (var16 <= var6) {
                        break;
                     }

                     var50 = var22;
                     var46 = var35;
                     var10006 = var6;
                  }
               }
            }

            String var37 = new String(var22).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var37;
                  if ((var9 += var1) >= var4) {
                     a = var5;
                     b = new String[18];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIlIIIlllIIIIlllIIIlIllIlIlIIlIIIllIlllllIlIIIlllIllIlllIlIlIlllIIIllllIllIllllIIIl();
                     String[] var7 = new String[4];
                     var10002 = -1805;
                     short var38 = 19307;
                     var7[0] = "This server will restart soon";
                     var10002 = -1804;
                     short var39 = 5142;
                     var7[1] = "Server restarting in";
                     var10002 = -1811;
                     short var40 = -3281;
                     var7[2] = "The server is restarting";
                     var10002 = -1793;
                     short var41 = 23923;
                     var7[3] = "Server is restarting";
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = CollectionsKt.listOf(var7);
                     var7 = new String[2];
                     var10002 = -1795;
                     short var42 = -30359;
                     var7[0] = "EVACUATE";
                     var10002 = -1794;
                     short var43 = 14723;
                     var7[1] = "evacuating to";
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = CollectionsKt.listOf(var7);
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = 45000L;
                     break label52;
                  }

                  var1 = var2.charAt(var9);
                  break;
               default:
                  var5[var3++] = var37;
                  if ((var9 += var1) < var4) {
                     var1 = var2.charAt(var9);
                     continue label52;
                  }

                  var2 = "hÜb·»tzj\u0085S0r\u0092HfÛW¯Û¾ Ù\u0003Ì\u0019]\u001c4U\u0092£Ùaé·éÇv£\u0089y¤Úu\u0001q\u0011#\u0005Å";
                  var4 = "hÜb·»tzj\u0085S0r\u0092HfÛW¯Û¾ Ù\u0003Ì\u0019]\u001c4U\u0092£Ùaé·éÇv£\u0089y¤Úu\u0001q\u0011#\u0005Å".length();
                  var1 = 24;
                  var9 = -1;
            }

            var10000 = 99;
            var10001 = var2.substring(++var9, var9 + var1);
            var10002 = 0;
         }
      }
   }

   public static void b(me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var0) {
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var0;
   }

   public static me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] b() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -1795) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 49;
            case 1 -> 194;
            case 2 -> 226;
            case 3 -> 109;
            case 4 -> 198;
            case 5 -> 101;
            case 6 -> 52;
            case 7 -> 28;
            case 8 -> 37;
            case 9 -> 149;
            case 10 -> 165;
            case 11 -> 34;
            case 12 -> 26;
            case 13 -> 19;
            case 14 -> 254;
            case 15 -> 31;
            case 16 -> 30;
            case 17 -> 69;
            case 18 -> 242;
            case 19 -> 137;
            case 20 -> 35;
            case 21 -> 222;
            case 22 -> 139;
            case 23 -> 81;
            case 24 -> 219;
            case 25 -> 215;
            case 26 -> 107;
            case 27 -> 111;
            case 28 -> 14;
            case 29 -> 123;
            case 30 -> 126;
            case 31 -> 27;
            case 32 -> 71;
            case 33 -> 187;
            case 34 -> 152;
            case 35 -> 176;
            case 36 -> 151;
            case 37 -> 67;
            case 38 -> 183;
            case 39 -> 82;
            case 40 -> 202;
            case 41 -> 57;
            case 42 -> 7;
            case 43 -> 39;
            case 44 -> 115;
            case 45 -> 53;
            case 46 -> 246;
            case 47 -> 128;
            case 48 -> 155;
            case 49 -> 98;
            case 50 -> 117;
            case 51 -> 2;
            case 52 -> 162;
            case 53 -> 0;
            case 54 -> 87;
            case 55 -> 234;
            case 56 -> 106;
            case 57 -> 233;
            case 58 -> 203;
            case 59 -> 48;
            case 60 -> 145;
            case 61 -> 42;
            case 62 -> 103;
            case 63 -> 236;
            case 64 -> 200;
            case 65 -> 23;
            case 66 -> 244;
            case 67 -> 223;
            case 68 -> 195;
            case 69 -> 8;
            case 70 -> 171;
            case 71 -> 74;
            case 72 -> 132;
            case 73 -> 150;
            case 74 -> 55;
            case 75 -> 130;
            case 76 -> 45;
            case 77 -> 134;
            case 78 -> 205;
            case 79 -> 16;
            case 80 -> 161;
            case 81 -> 4;
            case 82 -> 21;
            case 83 -> 190;
            case 84 -> 216;
            case 85 -> 196;
            case 86 -> 38;
            case 87 -> 44;
            case 88 -> 25;
            case 89 -> 251;
            case 90 -> 201;
            case 91 -> 59;
            case 92 -> 212;
            case 93 -> 157;
            case 94 -> 20;
            case 95 -> 214;
            case 96 -> 232;
            case 97 -> 213;
            case 98 -> 160;
            case 99 -> 70;
            case 100 -> 243;
            case 101 -> 86;
            case 102 -> 114;
            case 103 -> 237;
            case 104 -> 245;
            case 105 -> 248;
            case 106 -> 182;
            case 107 -> 143;
            case 108 -> 6;
            case 109 -> 235;
            case 110 -> 167;
            case 111 -> 108;
            case 112 -> 29;
            case 113 -> 122;
            case 114 -> 125;
            case 115 -> 104;
            case 116 -> 218;
            case 117 -> 41;
            case 118 -> 12;
            case 119 -> 51;
            case 120 -> 173;
            case 121 -> 85;
            case 122 -> 210;
            case 123 -> 240;
            case 124 -> 158;
            case 125 -> 92;
            case 126 -> 33;
            case 127 -> 209;
            case 128 -> 217;
            case 129 -> 17;
            case 130 -> 95;
            case 131 -> 169;
            case 132 -> 238;
            case 133 -> 91;
            case 134 -> 135;
            case 135 -> 118;
            case 136 -> 32;
            case 137 -> 58;
            case 138 -> 144;
            case 139 -> 225;
            case 140 -> 146;
            case 141 -> 164;
            case 142 -> 72;
            case 143 -> 250;
            case 144 -> 60;
            case 145 -> 141;
            case 146 -> 94;
            case 147 -> 174;
            case 148 -> 105;
            case 149 -> 83;
            case 150 -> 15;
            case 151 -> 102;
            case 152 -> 153;
            case 153 -> 255;
            case 154 -> 249;
            case 155 -> 13;
            case 156 -> 43;
            case 157 -> 47;
            case 158 -> 193;
            case 159 -> 231;
            case 160 -> 100;
            case 161 -> 68;
            case 162 -> 50;
            case 163 -> 184;
            case 164 -> 140;
            case 165 -> 80;
            case 166 -> 252;
            case 167 -> 88;
            case 168 -> 208;
            case 169 -> 178;
            case 170 -> 228;
            case 171 -> 10;
            case 172 -> 119;
            case 173 -> 63;
            case 174 -> 229;
            case 175 -> 112;
            case 176 -> 221;
            case 177 -> 3;
            case 178 -> 89;
            case 179 -> 124;
            case 180 -> 120;
            case 181 -> 113;
            case 182 -> 9;
            case 183 -> 11;
            case 184 -> 99;
            case 185 -> 239;
            case 186 -> 142;
            case 187 -> 116;
            case 188 -> 75;
            case 189 -> 207;
            case 190 -> 230;
            case 191 -> 40;
            case 192 -> 186;
            case 193 -> 46;
            case 194 -> 177;
            case 195 -> 156;
            case 196 -> 97;
            case 197 -> 172;
            case 198 -> 73;
            case 199 -> 66;
            case 200 -> 64;
            case 201 -> 175;
            case 202 -> 78;
            case 203 -> 61;
            case 204 -> 84;
            case 205 -> 154;
            case 206 -> 224;
            case 207 -> 185;
            case 208 -> 204;
            case 209 -> 5;
            case 210 -> 54;
            case 211 -> 188;
            case 212 -> 36;
            case 213 -> 227;
            case 214 -> 180;
            case 215 -> 131;
            case 216 -> 189;
            case 217 -> 24;
            case 218 -> 96;
            case 219 -> 62;
            case 220 -> 168;
            case 221 -> 148;
            case 222 -> 93;
            case 223 -> 129;
            case 224 -> 79;
            case 225 -> 133;
            case 226 -> 166;
            case 227 -> 22;
            case 228 -> 127;
            case 229 -> 136;
            case 230 -> 77;
            case 231 -> 170;
            case 232 -> 206;
            case 233 -> 199;
            case 234 -> 191;
            case 235 -> 179;
            case 236 -> 90;
            case 237 -> 147;
            case 238 -> 181;
            case 239 -> 56;
            case 240 -> 110;
            case 241 -> 121;
            case 242 -> 197;
            case 243 -> 76;
            case 244 -> 163;
            case 245 -> 253;
            case 246 -> 1;
            case 247 -> 18;
            case 248 -> 241;
            case 249 -> 138;
            case 250 -> 159;
            case 251 -> 247;
            case 252 -> 220;
            case 253 -> 192;
            case 254 -> 65;
            default -> 211;
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
