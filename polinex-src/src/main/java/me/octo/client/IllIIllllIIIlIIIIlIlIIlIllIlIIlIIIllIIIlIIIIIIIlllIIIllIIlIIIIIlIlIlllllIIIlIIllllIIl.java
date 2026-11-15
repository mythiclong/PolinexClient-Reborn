package me.octo.client;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.common.ClientboundDisconnectPacket;
import org.jetbrains.annotations.NotNull;

public final class IllIIllllIIIlIIIIlIlIIlIllIlIIlIIIllIIIlIIIIIIIlllIIIllIIlIIIIIlIlIlllllIIIlIIllllIIl {
   @NotNull
   public static IllIIllllIIIlIIIIlIlIIlIllIlIIlIIIllIIIlIIIIIIIlllIIIllIIlIIIIIlIlIlllllIIIlIIllllIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Regex lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] a;
   private static String[] b;

   private IllIIllllIIIlIIIIlIlIIlIllIlIIlIIIllIIIlIIIIIIIlllIIIllIIlIIIIIlIlIlllllIIIlIIllllIIl() {
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      Object var49 = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = llIIlIIIlllIIIIlllIIIlIllIlIlIIlIIIllIlllllIlIIIlllIllIlllIlIlIlllIIIllllIllIllllIIIl.b();
      short var10002 = 32361;
      short var10003 = -25075;
      Intrinsics.checkNotNullParameter(var1, "event");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      Packet var3 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      Packet var44 = var3;
      if (var2 == null) {
         if (!(var3 instanceof ClientboundDisconnectPacket)) {
            return;
         }

         var44 = var3;
      }

      String var45 = ((ClientboundDisconnectPacket)var44).reason().getString();
      var10002 = 32352;
      var10003 = -10441;
      Intrinsics.checkNotNullExpressionValue(var45, "getString(...)");
      String var4 = var45;
      if (var2 == null) {
         MatchResult var46 = (lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII).find( var4, 0);
         if (var46 != null) {
            MatchResult var5 = var46;
            lIIIIlIlllIlIlIIlllIlIIlIIIIIIlIlIIIIIIlIIlllIlIlIlIIIllllIllllIIlllIlIIlIlIIIlIlIlII var6 = new lIIIIlIlllIlIlIIlllIlIIlIIIIIIlIlIIIIIIlIIlllIlIlIlIIIllllIllllIIlllIlIIlIlIIIlIlIlII(
               (String)var5.getGroupValues().get(1), (String)var5.getGroupValues().get(2), (String)var5.getGroupValues().get(3), System.currentTimeMillis()
            );
            List var7 = me.octo.client.utils.lIlIIIIIIlllIllIlIlIlIIIIIlIlllllllIIIIIIlIlIIllIlIllIllIIIIIIIlIIIIIllIllllIIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a();
            JsonObject var9 = new JsonObject();
            boolean var11 = false;
            short var10001 = 32363;
            var10002 = 6229;
            var9.addProperty("duration", var6.a());
            var10001 = 32360;
            var10002 = 29912;
            var9.addProperty("reason", var6.b());
            var10001 = 32377;
            var10002 = 7912;
            var9.addProperty("id", var6.c());
            var10001 = 32359;
            var10002 = 2659;
            var9.addProperty("timestamp", var6.d());
            JsonArray var10 = new JsonArray();
            JsonArray var42 = var10;
            boolean var12 = false;
            Iterable var13 = var7;
            boolean var14 = false;

            for (Object var16 : var13) {
               me.octo.client.utils.lIlIIIIIIlllIllIlIlIlIIIIIlIlllllllIIIIIIlIlIIllIlIllIllIIIIIIIlIIIIIllIllllIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var17 = (me.octo.client.utils.lIlIIIIIIlllIllIlIlIlIIIIIlIlllllllIIIIIIlIlIIllIlIllIllIIIIIIIlIIIIIllIllllIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var16;
               boolean var18 = false;
               JsonObject var19 = new JsonObject();
               boolean var22 = false;
               var10001 = 32353;
               var10002 = 26288;
               var19.addProperty("timestamp", var17.a());
               var10001 = 32358;
               var10002 = -18051;
               var19.addProperty("name", var17.b());
               var10001 = 32362;
               var10002 = 18591;
               JsonObject var23 = new JsonObject();
               JsonObject var24 = var23;
               String var25 = "data";
               boolean var27 = false;
               Iterable var28 = var17.c();
               boolean var29 = false;
               if (var2 == null) {
                  for (Object var31 : var28) {
                     Pair var32 = (Pair)var31;
                     boolean var33 = false;
                     String var34 = (String)var32.component1();
                     String var35 = (String)var32.component2();
                     var24.addProperty(var34, var35);
                     if (var2 != null || var2 != null) {
                        break;
                     }
                  }

                  Unit var36 = Unit.INSTANCE;
                  var19.add(var25, (JsonElement)var23);
                  var42.add((JsonElement)var19);
                  if (var2 == null) {
                     continue;
                  }
               }
               break;
            }

            label54: {
               label85: {
                  short var47 = 32364;
                  String var57 = var6.a();
                  String var37 = var6.c();
                  String var38 = var6.b();
                  String var39 = var57;
                  var10001 = -17551;
                  var10002 = 32357;
                  var10003 = 18984;
                  short var10004 = 32367;
                  short var10005 = -4463;
                  me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c(
                     "Ban detected! Duration: " + var39 + ", Reason: " + var38 + ", ID: " + var37
                  );
                  IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var48 = lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
                  IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var59 = lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
                  if (var2 == null) {
                     if (lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
                        != null) {
                        var49 = lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
                           .aj();
                        if (var49 != null) {
                           break label54;
                        }
                     }

                     if (var2 != null) {
                        break label85;
                     }

                     var48 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
                     var59 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
                  }

                  if (var59 != null) {
                     var49 = var48.aj();
                     break label54;
                  }
               }

               var49 = llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c();
            }

            String var41 =((String)( var49));
            short var50 = 32354;
            var10001 = -32531;
            Pair[] var43 = new Pair[3];
            var10003 = 32355;
            short var76 = 27271;
            var43[0] = TuplesKt.to("ban", var9);
            var10003 = 32366;
            var76 = -30946;
            var43[1] = TuplesKt.to("packets", var10);
            Pair[] var61 = var43;
            if (var2 == null) {
               var10003 = 32365;
               var76 = 15986;
               String var79 = var41;
               if (var41 == null) {
                  var76 = 32376;
                  short var81 = 32462;
                  var79 = "Unknown";
               }

               var43[2] = TuplesKt.to("lastMacroUsed", var79);
               var61 = var43;
            }

            me.octo.client.utils.lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.a("ban", MapsKt.mapOf(var61), true, true);
            lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
               .a()
               .a(var6.c(), var6.d());
            return;
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[18];
      int var3 = 0;
      String var2 = "Ð\u001f(Sf\u0006v\u0090\rÎ]S\b\u0086\u0017Ô>\f\u001a%\u0095\u0004ZiIg\rßË÷&p¦¸\u0017\n\u0015ÖæZ\u0018fÆ6ÓßÂV\b.\"É\u0004(y¸\u00037¼pJª\u009f\u0090î\u0006Ì.çÃxm\u0007×\"y\u0004\u009b\u000bø\tMW \u00adyñbU\f\u000eGh\u0089ña\u008c\u008e?\u008fò2\u0083z\u0083\u0003 \u0003Ê\u0003¿f)\nû\u0098\u001a4äÅ\u008f74ûÓ)t¼Jóæg<,XtlØ°\u0004%:\u0092¤j\u0091ô\u000f#A}8\u0010°§*\u0086äXùHÎ\u009f$±\u0013\u008d¨\u0013ån4ñæ`\u0015ÞW\u0013w=SµK\u0089} þ\u008e^\u0000\u0086§\u0093çý9¢\u0014\u0080}õ4G:\u0005\u0001¥JoÔS\u007f3G¡ïÞ(\u000f<\u001e_*ÆÊ4\u000e;ÂÉ\u0098\u001a\u009bX=\u0085ÉØ\u0098{ì\u008d9\u0082ã@Í0Û\u008dº×Ö9\u0015Lo*¿¿üÃ\u0006\u0013ÐA\u0088U\u0095¯3\u001bd\u0001¤Ø5=~\u0088rôb,^\u0089MÑ\u008a\u0080ÅË$D»«\u0010á\u0004\u0082Ö\u0001uCx×¿\u0018,Ü\rsÏuø\u008a\rü{-w\u009aÒæÏ\u00068Ç'2¿\u0083\u0011ä²\tTm\u0083ê\u001d\u0019îH\u009d\u0004qÿ~±";
      int var4 = "Ð\u001f(Sf\u0006v\u0090\rÎ]S\b\u0086\u0017Ô>\f\u001a%\u0095\u0004ZiIg\rßË÷&p¦¸\u0017\n\u0015ÖæZ\u0018fÆ6ÓßÂV\b.\"É\u0004(y¸\u00037¼pJª\u009f\u0090î\u0006Ì.çÃxm\u0007×\"y\u0004\u009b\u000bø\tMW \u00adyñbU\f\u000eGh\u0089ña\u008c\u008e?\u008fò2\u0083z\u0083\u0003 \u0003Ê\u0003¿f)\nû\u0098\u001a4äÅ\u008f74ûÓ)t¼Jóæg<,XtlØ°\u0004%:\u0092¤j\u0091ô\u000f#A}8\u0010°§*\u0086äXùHÎ\u009f$±\u0013\u008d¨\u0013ån4ñæ`\u0015ÞW\u0013w=SµK\u0089} þ\u008e^\u0000\u0086§\u0093çý9¢\u0014\u0080}õ4G:\u0005\u0001¥JoÔS\u007f3G¡ïÞ(\u000f<\u001e_*ÆÊ4\u000e;ÂÉ\u0098\u001a\u009bX=\u0085ÉØ\u0098{ì\u008d9\u0082ã@Í0Û\u008dº×Ö9\u0015Lo*¿¿üÃ\u0006\u0013ÐA\u0088U\u0095¯3\u001bd\u0001¤Ø5=~\u0088rôb,^\u0089MÑ\u008a\u0080ÅË$D»«\u0010á\u0004\u0082Ö\u0001uCx×¿\u0018,Ü\rsÏuø\u008a\rü{-w\u009aÒæÏ\u00068Ç'2¿\u0083\u0011ä²\tTm\u0083ê\u001d\u0019îH\u009d\u0004qÿ~±"
         .length();
      char var1 = 5;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 55;
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
                     case 0 -> 96;
                     case 1 -> 45;
                     case 2 -> 67;
                     case 3 -> 18;
                     case 4 -> 103;
                     case 5 -> 106;
                     default -> 12;
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
                     a = var5;
                     b = new String[18];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllIIllllIIIlIIIIlIlIIlIllIlIIlIIIllIIIlIIIIIIIlllIIIllIIlIIIIIlIlIlllllIIIlIIllllIIl();
                     var10002 = 32356;
                     short var31 = 10061;
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new Regex(
                        "You are temporarily banned for ([\\dhdms\\s]+) from this server!\\s+Reason: (.+?)\\.\\s+Find out more: https://www\\.hypixel\\.net/appeal\\s+Ban ID: #(\\w+)\\s+Sharing your Ban ID may affect the processing of your appeal!",
                        RegexOption.DOT_MATCHES_ALL
                     );
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

                  var2 = "ÛÕ\u0007\u0084¢í\u0088}K\u0005";
                  var4 = "ÛÕ\u0007\u0084¢í\u0088}K\u0005".length();
                  var1 = 2;
                  var8 = -1;
            }

            var10000 = 79;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 32361) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 213;
            case 1 -> 36;
            case 2 -> 8;
            case 3 -> 236;
            case 4 -> 201;
            case 5 -> 193;
            case 6 -> 227;
            case 7 -> 231;
            case 8 -> 219;
            case 9 -> 251;
            case 10 -> 81;
            case 11 -> 117;
            case 12 -> 165;
            case 13 -> 54;
            case 14 -> 147;
            case 15 -> 149;
            case 16 -> 192;
            case 17 -> 179;
            case 18 -> 228;
            case 19 -> 130;
            case 20 -> 229;
            case 21 -> 82;
            case 22 -> 215;
            case 23 -> 154;
            case 24 -> 57;
            case 25 -> 86;
            case 26 -> 66;
            case 27 -> 146;
            case 28 -> 78;
            case 29 -> 127;
            case 30 -> 225;
            case 31 -> 243;
            case 32 -> 144;
            case 33 -> 133;
            case 34 -> 112;
            case 35 -> 37;
            case 36 -> 226;
            case 37 -> 178;
            case 38 -> 53;
            case 39 -> 79;
            case 40 -> 62;
            case 41 -> 93;
            case 42 -> 120;
            case 43 -> 220;
            case 44 -> 87;
            case 45 -> 128;
            case 46 -> 49;
            case 47 -> 39;
            case 48 -> 239;
            case 49 -> 254;
            case 50 -> 110;
            case 51 -> 253;
            case 52 -> 6;
            case 53 -> 136;
            case 54 -> 232;
            case 55 -> 4;
            case 56 -> 145;
            case 57 -> 244;
            case 58 -> 116;
            case 59 -> 148;
            case 60 -> 42;
            case 61 -> 157;
            case 62 -> 167;
            case 63 -> 159;
            case 64 -> 60;
            case 65 -> 9;
            case 66 -> 15;
            case 67 -> 141;
            case 68 -> 246;
            case 69 -> 158;
            case 70 -> 143;
            case 71 -> 22;
            case 72 -> 80;
            case 73 -> 163;
            case 74 -> 0;
            case 75 -> 135;
            case 76 -> 121;
            case 77 -> 109;
            case 78 -> 67;
            case 79 -> 55;
            case 80 -> 95;
            case 81 -> 233;
            case 82 -> 96;
            case 83 -> 200;
            case 84 -> 209;
            case 85 -> 25;
            case 86 -> 247;
            case 87 -> 47;
            case 88 -> 104;
            case 89 -> 164;
            case 90 -> 31;
            case 91 -> 156;
            case 92 -> 125;
            case 93 -> 91;
            case 94 -> 162;
            case 95 -> 173;
            case 96 -> 248;
            case 97 -> 32;
            case 98 -> 94;
            case 99 -> 123;
            case 100 -> 189;
            case 101 -> 174;
            case 102 -> 58;
            case 103 -> 184;
            case 104 -> 240;
            case 105 -> 207;
            case 106 -> 204;
            case 107 -> 44;
            case 108 -> 185;
            case 109 -> 196;
            case 110 -> 52;
            case 111 -> 63;
            case 112 -> 113;
            case 113 -> 155;
            case 114 -> 70;
            case 115 -> 56;
            case 116 -> 115;
            case 117 -> 197;
            case 118 -> 17;
            case 119 -> 90;
            case 120 -> 107;
            case 121 -> 183;
            case 122 -> 169;
            case 123 -> 126;
            case 124 -> 40;
            case 125 -> 249;
            case 126 -> 38;
            case 127 -> 105;
            case 128 -> 46;
            case 129 -> 24;
            case 130 -> 177;
            case 131 -> 124;
            case 132 -> 27;
            case 133 -> 29;
            case 134 -> 172;
            case 135 -> 43;
            case 136 -> 142;
            case 137 -> 19;
            case 138 -> 132;
            case 139 -> 108;
            case 140 -> 14;
            case 141 -> 18;
            case 142 -> 98;
            case 143 -> 139;
            case 144 -> 230;
            case 145 -> 211;
            case 146 -> 73;
            case 147 -> 20;
            case 148 -> 180;
            case 149 -> 137;
            case 150 -> 64;
            case 151 -> 166;
            case 152 -> 170;
            case 153 -> 221;
            case 154 -> 250;
            case 155 -> 218;
            case 156 -> 84;
            case 157 -> 118;
            case 158 -> 69;
            case 159 -> 10;
            case 160 -> 89;
            case 161 -> 234;
            case 162 -> 224;
            case 163 -> 216;
            case 164 -> 106;
            case 165 -> 199;
            case 166 -> 187;
            case 167 -> 214;
            case 168 -> 68;
            case 169 -> 182;
            case 170 -> 101;
            case 171 -> 208;
            case 172 -> 168;
            case 173 -> 140;
            case 174 -> 85;
            case 175 -> 41;
            case 176 -> 1;
            case 177 -> 13;
            case 178 -> 97;
            case 179 -> 59;
            case 180 -> 30;
            case 181 -> 114;
            case 182 -> 190;
            case 183 -> 198;
            case 184 -> 51;
            case 185 -> 222;
            case 186 -> 238;
            case 187 -> 175;
            case 188 -> 48;
            case 189 -> 210;
            case 190 -> 111;
            case 191 -> 71;
            case 192 -> 119;
            case 193 -> 61;
            case 194 -> 34;
            case 195 -> 35;
            case 196 -> 26;
            case 197 -> 138;
            case 198 -> 194;
            case 199 -> 102;
            case 200 -> 252;
            case 201 -> 83;
            case 202 -> 152;
            case 203 -> 202;
            case 204 -> 33;
            case 205 -> 100;
            case 206 -> 134;
            case 207 -> 45;
            case 208 -> 188;
            case 209 -> 160;
            case 210 -> 2;
            case 211 -> 129;
            case 212 -> 255;
            case 213 -> 3;
            case 214 -> 150;
            case 215 -> 28;
            case 216 -> 65;
            case 217 -> 7;
            case 218 -> 151;
            case 219 -> 50;
            case 220 -> 92;
            case 221 -> 203;
            case 222 -> 77;
            case 223 -> 195;
            case 224 -> 88;
            case 225 -> 23;
            case 226 -> 191;
            case 227 -> 241;
            case 228 -> 176;
            case 229 -> 76;
            case 230 -> 237;
            case 231 -> 223;
            case 232 -> 99;
            case 233 -> 171;
            case 234 -> 16;
            case 235 -> 181;
            case 236 -> 72;
            case 237 -> 205;
            case 238 -> 103;
            case 239 -> 131;
            case 240 -> 206;
            case 241 -> 153;
            case 242 -> 122;
            case 243 -> 245;
            case 244 -> 75;
            case 245 -> 21;
            case 246 -> 235;
            case 247 -> 242;
            case 248 -> 11;
            case 249 -> 186;
            case 250 -> 12;
            case 251 -> 5;
            case 252 -> 217;
            case 253 -> 161;
            case 254 -> 212;
            default -> 74;
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
