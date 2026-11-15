package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll;
import me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
import me.octo.client.utils.IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI;
import me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
import me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI
   extends lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll {
    public static <T> T d(Object p0) { return null; } // PX-FIX mr4
    public static <T> T bw(Object p0) { return null; } // PX-FIX mr4
    public static <T> T b(Object p0) { return null; } // PX-FIX mr4
    public static <T> T g(Object p0) { return null; } // PX-FIX mr3
    public static <T> T f(Object p0) { return null; } // PX-FIX mr3

   public Object receiver; // PX-FIX kotlin lambda receiver

   @NotNull
   public static IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
   @NotNull
   private ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   @NotNull
   private ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
   @NotNull
   private IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
   @NotNull
   private static IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
   @NotNull
   private static lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
   private static String[] j;
   private static String[] k;

   public IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI() {
      short var10001 = -438;
      short var10002 = 4294;
      var10002 = -423;
      short var10003 = 1493;
      me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      short var10004 = -447;
      short var10005 = 9910;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         llllIlIIIIIIlIllllIIlIllllIIIIlIIlIlIIlllIlIIIlllIIIIIlIlllllIIIIIlIlIIllIllIlIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         llllIlIIIIIIlIllllIIlIllllIIIIlIIlIlIIlllIlIIIlllIIIIIlIlllllIIIIIlIlIIllIllIlIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .d(),
         llllIlIIIIIIlIllllIIlIllllIIIIlIIlIlIIlllIlIIIlllIIIIIlIlllllIIIIIlIlIIllIllIlIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         llllIlIIIIIIlIllllIIlIllllIIIIlIIlIlIIlllIlIIIlllIIIIIlIlllllIIIIIlIlIIllIllIlIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c(),
         llllIlIIIIIIlIllllIIlIllllIIIIlIIlIlIIlllIlIIIlllIIIIIlIlllllIIIIIlIlIIllIllIlIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e(),
         llllIlIIIIIIlIllllIIlIllllIIIIlIIlIlIIlllIlIIIlllIIIIIlIlllllIIIIIlIlIIllIllIlIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .f(),
         llllIlIIIIIIlIllllIIlIllllIIIIlIIlIlIIlllIlIIIlllIIIIIlIlllllIIIIIlIlIIllIllIlIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .g(),
         llllIlIIIIIIlIllllIIlIllllIIIIlIIlIlIIlllIlIIIlllIIIIIlIlllllIIIIIlIlIIllIllIlIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .h()
      };
      super("Obsidian Macro", "Mines obsidian in The End using a smooth path route with speedboost support.", var3, "The End", null, null, true, var1, 48, null);
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = new ArrayList<>();
      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = new ArrayList<>();
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @Override
   protected void aD() {
      Object receiver = null; // PX-FIX
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var10000 = this;
      short var10001 = -417;
      short var10002 = 12404;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10000),
         "Obsidian travel",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         null,
         5000L,
         false,
         false,
         (kotlin.jvm.functions.Function1)(IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI::b),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = -18706;
                  short var10005 = -5443;
                  var10005 = -18707;
                  short var10006 = 17399;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      short var10001 = -18705;
      short var10002 = -27242;
      Intrinsics.checkNotNullParameter(var1, "p0");
      ((IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
   pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "<:\u0013\u008c\u00ad\u0004©\u0080w&·\u0004/Ì\u0007ßR\u0017\u00880½y|\u0081y¥3´$ ÝÔbÖ®\u009cg\u007f.=iØÅÉ\n\u008c0\u0002`yô\bj9\u001el&¨º³JO\u008a\u008eD\n5Óº\u001d\u0094\u0012í[\u008bö²\u001dCÜð\u0088¦v\u0096Z\u00adö\u0083ç\u0096\u009bF\u008dP¢\u0097\u0016\u0014×Yb¹Ñuù»eÊ>` k\u0080\u0093\u00ada©nöØ\u0084\u0083\u0002í'[p°\u0096¡j÷*ë\u009eåA\u0004jÂX'\u0093 \u008fÑ";
                  int var4 = "<:\u0013\u008c\u00ad\u0004©\u0080w&·\u0004/Ì\u0007ßR\u0017\u00880½y|\u0081y¥3´$ ÝÔbÖ®\u009cg\u007f.=iØÅÉ\n\u008c0\u0002`yô\bj9\u001el&¨º³JO\u008a\u008eD\n5Óº\u001d\u0094\u0012í[\u008bö²\u001dCÜð\u0088¦v\u0096Z\u00adö\u0083ç\u0096\u009bF\u008dP¢\u0097\u0016\u0014×Yb¹Ñuù»eÊ>` k\u0080\u0093\u00ada©nöØ\u0084\u0083\u0002í'[p°\u0096¡j÷*ë\u009eåA\u0004jÂX'\u0093 \u008fÑ"
                     .length();
                  char var1 = 2;
                  int var0 = -1;

                  while (true) {
                     char[] var10002x;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 24;
                        var10002x = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 24;
                           var10006 = var6;
                        } else {
                           var13 = 24;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 24;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 78;
                              case 1 -> 11;
                              case 2 -> 76;
                              case 3 -> 79;
                              case 4 -> 93;
                              case 5 -> 61;
                              default -> 40;
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
                  int var2 = (var0 ^ -18705) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 226;
                        case 1 -> 185;
                        case 2 -> 177;
                        case 3 -> 150;
                        case 4 -> 102;
                        case 5 -> 20;
                        case 6 -> 158;
                        case 7 -> 254;
                        case 8 -> 217;
                        case 9 -> 146;
                        case 10 -> 188;
                        case 11 -> 7;
                        case 12 -> 52;
                        case 13 -> 99;
                        case 14 -> 33;
                        case 15 -> 235;
                        case 16 -> 236;
                        case 17 -> 212;
                        case 18 -> 41;
                        case 19 -> 18;
                        case 20 -> 162;
                        case 21 -> 128;
                        case 22 -> 106;
                        case 23 -> 168;
                        case 24 -> 241;
                        case 25 -> 155;
                        case 26 -> 95;
                        case 27 -> 3;
                        case 28 -> 151;
                        case 29 -> 183;
                        case 30 -> 205;
                        case 31 -> 66;
                        case 32 -> 249;
                        case 33 -> 144;
                        case 34 -> 83;
                        case 35 -> 98;
                        case 36 -> 132;
                        case 37 -> 32;
                        case 38 -> 37;
                        case 39 -> 65;
                        case 40 -> 116;
                        case 41 -> 170;
                        case 42 -> 213;
                        case 43 -> 251;
                        case 44 -> 208;
                        case 45 -> 220;
                        case 46 -> 6;
                        case 47 -> 129;
                        case 48 -> 26;
                        case 49 -> 91;
                        case 50 -> 76;
                        case 51 -> 30;
                        case 52 -> 174;
                        case 53 -> 12;
                        case 54 -> 85;
                        case 55 -> 139;
                        case 56 -> 64;
                        case 57 -> 179;
                        case 58 -> 200;
                        case 59 -> 79;
                        case 60 -> 227;
                        case 61 -> 93;
                        case 62 -> 38;
                        case 63 -> 175;
                        case 64 -> 136;
                        case 65 -> 255;
                        case 66 -> 130;
                        case 67 -> 16;
                        case 68 -> 230;
                        case 69 -> 73;
                        case 70 -> 211;
                        case 71 -> 63;
                        case 72 -> 68;
                        case 73 -> 22;
                        case 74 -> 34;
                        case 75 -> 0;
                        case 76 -> 192;
                        case 77 -> 36;
                        case 78 -> 126;
                        case 79 -> 195;
                        case 80 -> 117;
                        case 81 -> 166;
                        case 82 -> 97;
                        case 83 -> 206;
                        case 84 -> 147;
                        case 85 -> 14;
                        case 86 -> 72;
                        case 87 -> 250;
                        case 88 -> 51;
                        case 89 -> 216;
                        case 90 -> 221;
                        case 91 -> 70;
                        case 92 -> 74;
                        case 93 -> 40;
                        case 94 -> 118;
                        case 95 -> 47;
                        case 96 -> 143;
                        case 97 -> 115;
                        case 98 -> 164;
                        case 99 -> 252;
                        case 100 -> 5;
                        case 101 -> 153;
                        case 102 -> 207;
                        case 103 -> 253;
                        case 104 -> 42;
                        case 105 -> 165;
                        case 106 -> 124;
                        case 107 -> 125;
                        case 108 -> 81;
                        case 109 -> 247;
                        case 110 -> 228;
                        case 111 -> 245;
                        case 112 -> 103;
                        case 113 -> 107;
                        case 114 -> 237;
                        case 115 -> 50;
                        case 116 -> 157;
                        case 117 -> 104;
                        case 118 -> 186;
                        case 119 -> 243;
                        case 120 -> 71;
                        case 121 -> 69;
                        case 122 -> 29;
                        case 123 -> 142;
                        case 124 -> 59;
                        case 125 -> 210;
                        case 126 -> 231;
                        case 127 -> 202;
                        case 128 -> 238;
                        case 129 -> 88;
                        case 130 -> 122;
                        case 131 -> 184;
                        case 132 -> 149;
                        case 133 -> 121;
                        case 134 -> 120;
                        case 135 -> 90;
                        case 136 -> 53;
                        case 137 -> 134;
                        case 138 -> 13;
                        case 139 -> 197;
                        case 140 -> 159;
                        case 141 -> 161;
                        case 142 -> 27;
                        case 143 -> 35;
                        case 144 -> 173;
                        case 145 -> 194;
                        case 146 -> 223;
                        case 147 -> 48;
                        case 148 -> 234;
                        case 149 -> 248;
                        case 150 -> 100;
                        case 151 -> 1;
                        case 152 -> 225;
                        case 153 -> 28;
                        case 154 -> 233;
                        case 155 -> 44;
                        case 156 -> 154;
                        case 157 -> 240;
                        case 158 -> 112;
                        case 159 -> 196;
                        case 160 -> 244;
                        case 161 -> 218;
                        case 162 -> 77;
                        case 163 -> 198;
                        case 164 -> 57;
                        case 165 -> 171;
                        case 166 -> 222;
                        case 167 -> 23;
                        case 168 -> 203;
                        case 169 -> 15;
                        case 170 -> 24;
                        case 171 -> 180;
                        case 172 -> 138;
                        case 173 -> 191;
                        case 174 -> 219;
                        case 175 -> 86;
                        case 176 -> 229;
                        case 177 -> 67;
                        case 178 -> 43;
                        case 179 -> 61;
                        case 180 -> 89;
                        case 181 -> 127;
                        case 182 -> 167;
                        case 183 -> 224;
                        case 184 -> 114;
                        case 185 -> 105;
                        case 186 -> 187;
                        case 187 -> 239;
                        case 188 -> 9;
                        case 189 -> 75;
                        case 190 -> 172;
                        case 191 -> 176;
                        case 192 -> 193;
                        case 193 -> 113;
                        case 194 -> 19;
                        case 195 -> 58;
                        case 196 -> 199;
                        case 197 -> 123;
                        case 198 -> 111;
                        case 199 -> 242;
                        case 200 -> 204;
                        case 201 -> 181;
                        case 202 -> 163;
                        case 203 -> 54;
                        case 204 -> 182;
                        case 205 -> 119;
                        case 206 -> 189;
                        case 207 -> 215;
                        case 208 -> 140;
                        case 209 -> 92;
                        case 210 -> 10;
                        case 211 -> 62;
                        case 212 -> 110;
                        case 213 -> 109;
                        case 214 -> 148;
                        case 215 -> 56;
                        case 216 -> 145;
                        case 217 -> 108;
                        case 218 -> 11;
                        case 219 -> 137;
                        case 220 -> 84;
                        case 221 -> 45;
                        case 222 -> 87;
                        case 223 -> 25;
                        case 224 -> 169;
                        case 225 -> 131;
                        case 226 -> 80;
                        case 227 -> 60;
                        case 228 -> 101;
                        case 229 -> 96;
                        case 230 -> 2;
                        case 231 -> 160;
                        case 232 -> 82;
                        case 233 -> 135;
                        case 234 -> 17;
                        case 235 -> 133;
                        case 236 -> 152;
                        case 237 -> 55;
                        case 238 -> 214;
                        case 239 -> 21;
                        case 240 -> 46;
                        case 241 -> 78;
                        case 242 -> 156;
                        case 243 -> 39;
                        case 244 -> 49;
                        case 245 -> 94;
                        case 246 -> 209;
                        case 247 -> 190;
                        case 248 -> 141;
                        case 249 -> 201;
                        case 250 -> 8;
                        case 251 -> 246;
                        case 252 -> 232;
                        case 253 -> 178;
                        case 254 -> 4;
                        default -> 31;
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
      var10000 = this;
      var10001 = -442;
      var10002 = -12940;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10000),
         "Obsidian route",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI,
         15000L,
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
                  short var10004 = 23524;
                  short var10005 = -23192;
                  var10005 = 23525;
                  short var10006 = 26419;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = 23527;
                  short var10002 = -15961;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
   pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "Py 0ç\u0012\u0003=\u001cAÌ9\u0089\\ûõ\u0092\u0011Þ\u009cÀ\u0007\u0011®²@99&oÃ½À\u0004ôØ\u00849ª\u0017d>qÆ\u0083Çämäô9\u0097¹Â¢\u0084\r´\u008d-%±ùo>äý\u0089\u008el\t©\r«\u0010ÅÞEÿ\u0005a\u0011¹þKÞÄá\f\rÜy\u009a\u0003LÑ\u001cæÿøR\u0081Þ\u0080\u0086íô5%\u0096\u0095\u000eOåD\u00079ôûÇ[\u0083\u0095F\u0013bræQ/>\u001a¸?ñ¨/\u0005\u009ej\u00ad \u001a\u0098\u0002ln";
                  int var4 = "Py 0ç\u0012\u0003=\u001cAÌ9\u0089\\ûõ\u0092\u0011Þ\u009cÀ\u0007\u0011®²@99&oÃ½À\u0004ôØ\u00849ª\u0017d>qÆ\u0083Çämäô9\u0097¹Â¢\u0084\r´\u008d-%±ùo>äý\u0089\u008el\t©\r«\u0010ÅÞEÿ\u0005a\u0011¹þKÞÄá\f\rÜy\u009a\u0003LÑ\u001cæÿøR\u0081Þ\u0080\u0086íô5%\u0096\u0095\u000eOåD\u00079ôûÇ[\u0083\u0095F\u0013bræQ/>\u001a¸?ñ¨/\u0005\u009ej\u00ad \u001a\u0098\u0002ln"
                     .length();
                  char var1 = '|';
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 54;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 54;
                           var10006 = var6;
                        } else {
                           var13 = 54;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 54;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 40;
                              case 1 -> 116;
                              case 2 -> 84;
                              case 3 -> 72;
                              case 4 -> 70;
                              case 5 -> 96;
                              default -> 105;
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
                  int var2 = (var0 ^ 23525) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 65;
                        case 1 -> 63;
                        case 2 -> 251;
                        case 3 -> 91;
                        case 4 -> 117;
                        case 5 -> 200;
                        case 6 -> 70;
                        case 7 -> 60;
                        case 8 -> 113;
                        case 9 -> 170;
                        case 10 -> 59;
                        case 11 -> 96;
                        case 12 -> 57;
                        case 13 -> 86;
                        case 14 -> 46;
                        case 15 -> 94;
                        case 16 -> 34;
                        case 17 -> 99;
                        case 18 -> 76;
                        case 19 -> 78;
                        case 20 -> 188;
                        case 21 -> 125;
                        case 22 -> 73;
                        case 23 -> 150;
                        case 24 -> 5;
                        case 25 -> 220;
                        case 26 -> 121;
                        case 27 -> 214;
                        case 28 -> 229;
                        case 29 -> 159;
                        case 30 -> 110;
                        case 31 -> 27;
                        case 32 -> 157;
                        case 33 -> 160;
                        case 34 -> 206;
                        case 35 -> 36;
                        case 36 -> 45;
                        case 37 -> 174;
                        case 38 -> 93;
                        case 39 -> 216;
                        case 40 -> 218;
                        case 41 -> 75;
                        case 42 -> 138;
                        case 43 -> 100;
                        case 44 -> 253;
                        case 45 -> 139;
                        case 46 -> 149;
                        case 47 -> 4;
                        case 48 -> 16;
                        case 49 -> 152;
                        case 50 -> 136;
                        case 51 -> 133;
                        case 52 -> 54;
                        case 53 -> 164;
                        case 54 -> 142;
                        case 55 -> 223;
                        case 56 -> 198;
                        case 57 -> 33;
                        case 58 -> 32;
                        case 59 -> 14;
                        case 60 -> 205;
                        case 61 -> 230;
                        case 62 -> 163;
                        case 63 -> 126;
                        case 64 -> 26;
                        case 65 -> 41;
                        case 66 -> 153;
                        case 67 -> 235;
                        case 68 -> 212;
                        case 69 -> 176;
                        case 70 -> 29;
                        case 71 -> 114;
                        case 72 -> 24;
                        case 73 -> 90;
                        case 74 -> 171;
                        case 75 -> 98;
                        case 76 -> 130;
                        case 77 -> 39;
                        case 78 -> 13;
                        case 79 -> 237;
                        case 80 -> 68;
                        case 81 -> 146;
                        case 82 -> 58;
                        case 83 -> 7;
                        case 84 -> 168;
                        case 85 -> 180;
                        case 86 -> 119;
                        case 87 -> 187;
                        case 88 -> 193;
                        case 89 -> 189;
                        case 90 -> 154;
                        case 91 -> 144;
                        case 92 -> 175;
                        case 93 -> 53;
                        case 94 -> 217;
                        case 95 -> 20;
                        case 96 -> 210;
                        case 97 -> 48;
                        case 98 -> 241;
                        case 99 -> 106;
                        case 100 -> 56;
                        case 101 -> 85;
                        case 102 -> 232;
                        case 103 -> 213;
                        case 104 -> 62;
                        case 105 -> 143;
                        case 106 -> 219;
                        case 107 -> 252;
                        case 108 -> 204;
                        case 109 -> 134;
                        case 110 -> 108;
                        case 111 -> 37;
                        case 112 -> 203;
                        case 113 -> 151;
                        case 114 -> 165;
                        case 115 -> 247;
                        case 116 -> 194;
                        case 117 -> 225;
                        case 118 -> 169;
                        case 119 -> 147;
                        case 120 -> 81;
                        case 121 -> 228;
                        case 122 -> 79;
                        case 123 -> 22;
                        case 124 -> 84;
                        case 125 -> 38;
                        case 126 -> 30;
                        case 127 -> 242;
                        case 128 -> 244;
                        case 129 -> 215;
                        case 130 -> 83;
                        case 131 -> 8;
                        case 132 -> 120;
                        case 133 -> 77;
                        case 134 -> 192;
                        case 135 -> 248;
                        case 136 -> 21;
                        case 137 -> 116;
                        case 138 -> 231;
                        case 139 -> 234;
                        case 140 -> 72;
                        case 141 -> 140;
                        case 142 -> 43;
                        case 143 -> 246;
                        case 144 -> 178;
                        case 145 -> 211;
                        case 146 -> 172;
                        case 147 -> 23;
                        case 148 -> 184;
                        case 149 -> 31;
                        case 150 -> 209;
                        case 151 -> 105;
                        case 152 -> 132;
                        case 153 -> 118;
                        case 154 -> 162;
                        case 155 -> 40;
                        case 156 -> 109;
                        case 157 -> 69;
                        case 158 -> 87;
                        case 159 -> 167;
                        case 160 -> 185;
                        case 161 -> 123;
                        case 162 -> 243;
                        case 163 -> 47;
                        case 164 -> 148;
                        case 165 -> 9;
                        case 166 -> 2;
                        case 167 -> 222;
                        case 168 -> 66;
                        case 169 -> 49;
                        case 170 -> 52;
                        case 171 -> 124;
                        case 172 -> 226;
                        case 173 -> 74;
                        case 174 -> 35;
                        case 175 -> 236;
                        case 176 -> 102;
                        case 177 -> 112;
                        case 178 -> 44;
                        case 179 -> 115;
                        case 180 -> 156;
                        case 181 -> 254;
                        case 182 -> 207;
                        case 183 -> 92;
                        case 184 -> 111;
                        case 185 -> 161;
                        case 186 -> 101;
                        case 187 -> 197;
                        case 188 -> 128;
                        case 189 -> 227;
                        case 190 -> 141;
                        case 191 -> 10;
                        case 192 -> 50;
                        case 193 -> 80;
                        case 194 -> 224;
                        case 195 -> 55;
                        case 196 -> 182;
                        case 197 -> 196;
                        case 198 -> 51;
                        case 199 -> 28;
                        case 200 -> 11;
                        case 201 -> 202;
                        case 202 -> 240;
                        case 203 -> 61;
                        case 204 -> 107;
                        case 205 -> 190;
                        case 206 -> 173;
                        case 207 -> 88;
                        case 208 -> 199;
                        case 209 -> 19;
                        case 210 -> 129;
                        case 211 -> 239;
                        case 212 -> 208;
                        case 213 -> 17;
                        case 214 -> 238;
                        case 215 -> 127;
                        case 216 -> 15;
                        case 217 -> 155;
                        case 218 -> 245;
                        case 219 -> 104;
                        case 220 -> 250;
                        case 221 -> 64;
                        case 222 -> 122;
                        case 223 -> 177;
                        case 224 -> 201;
                        case 225 -> 179;
                        case 226 -> 42;
                        case 227 -> 255;
                        case 228 -> 71;
                        case 229 -> 181;
                        case 230 -> 249;
                        case 231 -> 166;
                        case 232 -> 6;
                        case 233 -> 82;
                        case 234 -> 145;
                        case 235 -> 89;
                        case 236 -> 137;
                        case 237 -> 233;
                        case 238 -> 97;
                        case 239 -> 95;
                        case 240 -> 195;
                        case 241 -> 186;
                        case 242 -> 131;
                        case 243 -> 25;
                        case 244 -> 3;
                        case 245 -> 135;
                        case 246 -> 67;
                        case 247 -> 183;
                        case 248 -> 158;
                        case 249 -> 18;
                        case 250 -> 12;
                        case 251 -> 221;
                        case 252 -> 103;
                        case 253 -> 1;
                        case 254 -> 0;
                        default -> 191;
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
      var10000 = this;
      var10001 = -437;
      var10002 = 17832;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10000,
         "Obsidian path",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         15000L,
         0L,
         null,
         false,
         false,
         (kotlin.jvm.functions.Function1)(IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI::d),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = -12606;
                  short var10005 = 15711;
                  var10005 = -12607;
                  short var10006 = 7200;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = -12605;
                  short var10002 = 31613;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
   pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "\u0082Ó\u0013]!äE-\u0089\u0018v\u000bÍPê/d\u0017\u0086ê\u0001\u0093|np\u0082oáÌ\u0081Þ8Ø6Hã0\u008e\fÙPõ\u0081ç\u009c\u00818ÞÐ\u0081i\t\u0011Ã\f\u0082\u0007þ\u0080±×r\u0088J\u008f\u008c\u0084Ùñí\u009e\u0087²!ºÄ%8:f\u0017\u0005'vÅÑÙO×\u00ad\u00ad±ªÖ\u0005\u0013@\u0091\u008d¬tÅÆX+«û1\nn\u0005\u001b¤|túG>\u001bgý¨ï]\u001d}&°\u0001FM\rÛ¥åqìfX?*y$\u007f\u001ao7";
                  int var4 = "\u0082Ó\u0013]!äE-\u0089\u0018v\u000bÍPê/d\u0017\u0086ê\u0001\u0093|np\u0082oáÌ\u0081Þ8Ø6Hã0\u008e\fÙPõ\u0081ç\u009c\u00818ÞÐ\u0081i\t\u0011Ã\f\u0082\u0007þ\u0080±×r\u0088J\u008f\u008c\u0084Ùñí\u009e\u0087²!ºÄ%8:f\u0017\u0005'vÅÑÙO×\u00ad\u00ad±ªÖ\u0005\u0013@\u0091\u008d¬tÅÆX+«û1\nn\u0005\u001b¤|túG>\u001bgý¨ï]\u001d}&°\u0001FM\rÛ¥åqìfX?*y$\u007f\u001ao7"
                     .length();
                  char var1 = 2;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 28;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 28;
                           var10006 = var6;
                        } else {
                           var13 = 28;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 28;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 125;
                              case 1 -> 110;
                              case 2 -> 116;
                              case 3 -> 26;
                              case 4 -> 111;
                              case 5 -> 112;
                              default -> 97;
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
                  int var2 = (var0 ^ -12605) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 12;
                        case 1 -> 232;
                        case 2 -> 131;
                        case 3 -> 62;
                        case 4 -> 209;
                        case 5 -> 250;
                        case 6 -> 94;
                        case 7 -> 176;
                        case 8 -> 37;
                        case 9 -> 253;
                        case 10 -> 135;
                        case 11 -> 222;
                        case 12 -> 204;
                        case 13 -> 249;
                        case 14 -> 36;
                        case 15 -> 185;
                        case 16 -> 15;
                        case 17 -> 66;
                        case 18 -> 72;
                        case 19 -> 236;
                        case 20 -> 146;
                        case 21 -> 203;
                        case 22 -> 122;
                        case 23 -> 170;
                        case 24 -> 76;
                        case 25 -> 119;
                        case 26 -> 162;
                        case 27 -> 42;
                        case 28 -> 216;
                        case 29 -> 161;
                        case 30 -> 215;
                        case 31 -> 247;
                        case 32 -> 155;
                        case 33 -> 1;
                        case 34 -> 5;
                        case 35 -> 212;
                        case 36 -> 73;
                        case 37 -> 197;
                        case 38 -> 193;
                        case 39 -> 74;
                        case 40 -> 243;
                        case 41 -> 118;
                        case 42 -> 75;
                        case 43 -> 26;
                        case 44 -> 231;
                        case 45 -> 147;
                        case 46 -> 110;
                        case 47 -> 92;
                        case 48 -> 240;
                        case 49 -> 98;
                        case 50 -> 244;
                        case 51 -> 223;
                        case 52 -> 59;
                        case 53 -> 77;
                        case 54 -> 166;
                        case 55 -> 133;
                        case 56 -> 3;
                        case 57 -> 187;
                        case 58 -> 102;
                        case 59 -> 43;
                        case 60 -> 11;
                        case 61 -> 55;
                        case 62 -> 173;
                        case 63 -> 213;
                        case 64 -> 140;
                        case 65 -> 221;
                        case 66 -> 52;
                        case 67 -> 202;
                        case 68 -> 226;
                        case 69 -> 238;
                        case 70 -> 7;
                        case 71 -> 178;
                        case 72 -> 58;
                        case 73 -> 124;
                        case 74 -> 25;
                        case 75 -> 189;
                        case 76 -> 71;
                        case 77 -> 145;
                        case 78 -> 80;
                        case 79 -> 167;
                        case 80 -> 19;
                        case 81 -> 227;
                        case 82 -> 39;
                        case 83 -> 150;
                        case 84 -> 18;
                        case 85 -> 233;
                        case 86 -> 246;
                        case 87 -> 91;
                        case 88 -> 95;
                        case 89 -> 113;
                        case 90 -> 14;
                        case 91 -> 130;
                        case 92 -> 211;
                        case 93 -> 129;
                        case 94 -> 194;
                        case 95 -> 41;
                        case 96 -> 152;
                        case 97 -> 207;
                        case 98 -> 112;
                        case 99 -> 29;
                        case 100 -> 82;
                        case 101 -> 205;
                        case 102 -> 83;
                        case 103 -> 67;
                        case 104 -> 104;
                        case 105 -> 210;
                        case 106 -> 65;
                        case 107 -> 188;
                        case 108 -> 50;
                        case 109 -> 33;
                        case 110 -> 106;
                        case 111 -> 60;
                        case 112 -> 48;
                        case 113 -> 208;
                        case 114 -> 235;
                        case 115 -> 108;
                        case 116 -> 192;
                        case 117 -> 28;
                        case 118 -> 89;
                        case 119 -> 88;
                        case 120 -> 134;
                        case 121 -> 117;
                        case 122 -> 153;
                        case 123 -> 175;
                        case 124 -> 40;
                        case 125 -> 22;
                        case 126 -> 17;
                        case 127 -> 93;
                        case 128 -> 137;
                        case 129 -> 109;
                        case 130 -> 53;
                        case 131 -> 81;
                        case 132 -> 47;
                        case 133 -> 90;
                        case 134 -> 163;
                        case 135 -> 242;
                        case 136 -> 61;
                        case 137 -> 254;
                        case 138 -> 179;
                        case 139 -> 9;
                        case 140 -> 142;
                        case 141 -> 186;
                        case 142 -> 138;
                        case 143 -> 141;
                        case 144 -> 171;
                        case 145 -> 68;
                        case 146 -> 44;
                        case 147 -> 143;
                        case 148 -> 245;
                        case 149 -> 100;
                        case 150 -> 191;
                        case 151 -> 172;
                        case 152 -> 79;
                        case 153 -> 160;
                        case 154 -> 6;
                        case 155 -> 214;
                        case 156 -> 97;
                        case 157 -> 144;
                        case 158 -> 182;
                        case 159 -> 206;
                        case 160 -> 84;
                        case 161 -> 111;
                        case 162 -> 54;
                        case 163 -> 136;
                        case 164 -> 174;
                        case 165 -> 220;
                        case 166 -> 4;
                        case 167 -> 86;
                        case 168 -> 16;
                        case 169 -> 230;
                        case 170 -> 252;
                        case 171 -> 225;
                        case 172 -> 24;
                        case 173 -> 123;
                        case 174 -> 78;
                        case 175 -> 180;
                        case 176 -> 239;
                        case 177 -> 237;
                        case 178 -> 248;
                        case 179 -> 56;
                        case 180 -> 10;
                        case 181 -> 38;
                        case 182 -> 128;
                        case 183 -> 190;
                        case 184 -> 181;
                        case 185 -> 149;
                        case 186 -> 27;
                        case 187 -> 34;
                        case 188 -> 255;
                        case 189 -> 32;
                        case 190 -> 115;
                        case 191 -> 30;
                        case 192 -> 177;
                        case 193 -> 99;
                        case 194 -> 107;
                        case 195 -> 169;
                        case 196 -> 196;
                        case 197 -> 219;
                        case 198 -> 105;
                        case 199 -> 132;
                        case 200 -> 151;
                        case 201 -> 87;
                        case 202 -> 251;
                        case 203 -> 164;
                        case 204 -> 154;
                        case 205 -> 13;
                        case 206 -> 218;
                        case 207 -> 0;
                        case 208 -> 63;
                        case 209 -> 21;
                        case 210 -> 31;
                        case 211 -> 198;
                        case 212 -> 85;
                        case 213 -> 139;
                        case 214 -> 116;
                        case 215 -> 8;
                        case 216 -> 229;
                        case 217 -> 35;
                        case 218 -> 183;
                        case 219 -> 114;
                        case 220 -> 96;
                        case 221 -> 57;
                        case 222 -> 127;
                        case 223 -> 159;
                        case 224 -> 69;
                        case 225 -> 121;
                        case 226 -> 156;
                        case 227 -> 234;
                        case 228 -> 70;
                        case 229 -> 241;
                        case 230 -> 184;
                        case 231 -> 224;
                        case 232 -> 49;
                        case 233 -> 45;
                        case 234 -> 195;
                        case 235 -> 200;
                        case 236 -> 199;
                        case 237 -> 157;
                        case 238 -> 201;
                        case 239 -> 158;
                        case 240 -> 103;
                        case 241 -> 51;
                        case 242 -> 217;
                        case 243 -> 228;
                        case 244 -> 168;
                        case 245 -> 46;
                        case 246 -> 165;
                        case 247 -> 20;
                        case 248 -> 120;
                        case 249 -> 126;
                        case 250 -> 2;
                        case 251 -> 125;
                        case 252 -> 64;
                        case 253 -> 148;
                        case 254 -> 23;
                        default -> 101;
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
      var10000 = this;
      var10001 = -424;
      var10002 = -1227;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10000,
         "Obsidian mined progress",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         20000L,
         0L,
         null,
         false,
         false,
         (kotlin.jvm.functions.Function1)(IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI::bw),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = 14500;
                  short var10005 = -8800;
                  var10005 = 14502;
                  short var10006 = -27154;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = 14501;
                  short var10002 = 11607;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
   pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "å²`\u009dh4\\é¢\u00adÏ3z³\u0095])Ð>\u0002\u0016\u001f|fÅ\u0010sfé\u009dR\u009aÚÈÝ\u009an\u0089æª§NÙ|¿ÓÏ>û;àv\u0001¿¤Ø´YÞd\u008fbVî¸0CÝ£¸rÁ\u0007È\u009fSTløÄnÂ¢[Ó\u00983G\u0019\u0006¡bÇ\u0084\u0089Ê{\u007fL\u009ddÂW\u0012ÌDëä)GËëÛ\u008e³\u0085,{£i\u0006A±ó|}¬\\xúñ0\u0099¤AyYôD¸\u000fe¨Ý\u0018\u0091¢";
                  int var4 = "å²`\u009dh4\\é¢\u00adÏ3z³\u0095])Ð>\u0002\u0016\u001f|fÅ\u0010sfé\u009dR\u009aÚÈÝ\u009an\u0089æª§NÙ|¿ÓÏ>û;àv\u0001¿¤Ø´YÞd\u008fbVî¸0CÝ£¸rÁ\u0007È\u009fSTløÄnÂ¢[Ó\u00983G\u0019\u0006¡bÇ\u0084\u0089Ê{\u007fL\u009ddÂW\u0012ÌDëä)GËëÛ\u008e³\u0085,{£i\u0006A±ó|}¬\\xúñ0\u0099¤AyYôD¸\u000fe¨Ý\u0018\u0091¢"
                     .length();
                  char var1 = 19;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 55;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 55;
                           var10006 = var6;
                        } else {
                           var13 = 55;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 55;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 50;
                              case 1 -> 33;
                              case 2 -> 64;
                              case 3 -> 23;
                              case 4 -> 114;
                              case 5 -> 57;
                              default -> 96;
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
                  int var2 = (var0 ^ 14500) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 138;
                        case 1 -> 93;
                        case 2 -> 165;
                        case 3 -> 205;
                        case 4 -> 70;
                        case 5 -> 146;
                        case 6 -> 90;
                        case 7 -> 36;
                        case 8 -> 68;
                        case 9 -> 114;
                        case 10 -> 0;
                        case 11 -> 110;
                        case 12 -> 173;
                        case 13 -> 118;
                        case 14 -> 113;
                        case 15 -> 237;
                        case 16 -> 103;
                        case 17 -> 21;
                        case 18 -> 199;
                        case 19 -> 244;
                        case 20 -> 6;
                        case 21 -> 81;
                        case 22 -> 106;
                        case 23 -> 207;
                        case 24 -> 127;
                        case 25 -> 32;
                        case 26 -> 226;
                        case 27 -> 233;
                        case 28 -> 54;
                        case 29 -> 73;
                        case 30 -> 88;
                        case 31 -> 174;
                        case 32 -> 255;
                        case 33 -> 17;
                        case 34 -> 20;
                        case 35 -> 57;
                        case 36 -> 27;
                        case 37 -> 250;
                        case 38 -> 182;
                        case 39 -> 254;
                        case 40 -> 162;
                        case 41 -> 213;
                        case 42 -> 180;
                        case 43 -> 179;
                        case 44 -> 129;
                        case 45 -> 224;
                        case 46 -> 210;
                        case 47 -> 184;
                        case 48 -> 79;
                        case 49 -> 87;
                        case 50 -> 121;
                        case 51 -> 216;
                        case 52 -> 169;
                        case 53 -> 60;
                        case 54 -> 86;
                        case 55 -> 31;
                        case 56 -> 125;
                        case 57 -> 204;
                        case 58 -> 145;
                        case 59 -> 117;
                        case 60 -> 137;
                        case 61 -> 104;
                        case 62 -> 56;
                        case 63 -> 241;
                        case 64 -> 228;
                        case 65 -> 5;
                        case 66 -> 22;
                        case 67 -> 236;
                        case 68 -> 49;
                        case 69 -> 9;
                        case 70 -> 10;
                        case 71 -> 219;
                        case 72 -> 160;
                        case 73 -> 35;
                        case 74 -> 131;
                        case 75 -> 158;
                        case 76 -> 23;
                        case 77 -> 193;
                        case 78 -> 47;
                        case 79 -> 91;
                        case 80 -> 171;
                        case 81 -> 62;
                        case 82 -> 96;
                        case 83 -> 37;
                        case 84 -> 83;
                        case 85 -> 25;
                        case 86 -> 163;
                        case 87 -> 186;
                        case 88 -> 12;
                        case 89 -> 191;
                        case 90 -> 115;
                        case 91 -> 134;
                        case 92 -> 122;
                        case 93 -> 82;
                        case 94 -> 187;
                        case 95 -> 67;
                        case 96 -> 196;
                        case 97 -> 197;
                        case 98 -> 7;
                        case 99 -> 227;
                        case 100 -> 92;
                        case 101 -> 132;
                        case 102 -> 80;
                        case 103 -> 222;
                        case 104 -> 111;
                        case 105 -> 253;
                        case 106 -> 13;
                        case 107 -> 130;
                        case 108 -> 172;
                        case 109 -> 153;
                        case 110 -> 29;
                        case 111 -> 89;
                        case 112 -> 58;
                        case 113 -> 214;
                        case 114 -> 161;
                        case 115 -> 245;
                        case 116 -> 34;
                        case 117 -> 107;
                        case 118 -> 85;
                        case 119 -> 209;
                        case 120 -> 189;
                        case 121 -> 194;
                        case 122 -> 190;
                        case 123 -> 239;
                        case 124 -> 181;
                        case 125 -> 156;
                        case 126 -> 142;
                        case 127 -> 176;
                        case 128 -> 231;
                        case 129 -> 206;
                        case 130 -> 139;
                        case 131 -> 14;
                        case 132 -> 202;
                        case 133 -> 218;
                        case 134 -> 166;
                        case 135 -> 76;
                        case 136 -> 108;
                        case 137 -> 175;
                        case 138 -> 95;
                        case 139 -> 77;
                        case 140 -> 97;
                        case 141 -> 232;
                        case 142 -> 144;
                        case 143 -> 38;
                        case 144 -> 188;
                        case 145 -> 167;
                        case 146 -> 3;
                        case 147 -> 98;
                        case 148 -> 177;
                        case 149 -> 170;
                        case 150 -> 53;
                        case 151 -> 50;
                        case 152 -> 33;
                        case 153 -> 4;
                        case 154 -> 164;
                        case 155 -> 240;
                        case 156 -> 41;
                        case 157 -> 75;
                        case 158 -> 46;
                        case 159 -> 217;
                        case 160 -> 248;
                        case 161 -> 61;
                        case 162 -> 147;
                        case 163 -> 148;
                        case 164 -> 102;
                        case 165 -> 223;
                        case 166 -> 63;
                        case 167 -> 18;
                        case 168 -> 19;
                        case 169 -> 69;
                        case 170 -> 71;
                        case 171 -> 65;
                        case 172 -> 159;
                        case 173 -> 84;
                        case 174 -> 133;
                        case 175 -> 249;
                        case 176 -> 200;
                        case 177 -> 44;
                        case 178 -> 136;
                        case 179 -> 100;
                        case 180 -> 168;
                        case 181 -> 116;
                        case 182 -> 15;
                        case 183 -> 203;
                        case 184 -> 154;
                        case 185 -> 198;
                        case 186 -> 94;
                        case 187 -> 247;
                        case 188 -> 78;
                        case 189 -> 124;
                        case 190 -> 246;
                        case 191 -> 238;
                        case 192 -> 119;
                        case 193 -> 221;
                        case 194 -> 225;
                        case 195 -> 242;
                        case 196 -> 99;
                        case 197 -> 1;
                        case 198 -> 149;
                        case 199 -> 140;
                        case 200 -> 42;
                        case 201 -> 2;
                        case 202 -> 48;
                        case 203 -> 243;
                        case 204 -> 252;
                        case 205 -> 234;
                        case 206 -> 251;
                        case 207 -> 55;
                        case 208 -> 101;
                        case 209 -> 72;
                        case 210 -> 155;
                        case 211 -> 11;
                        case 212 -> 112;
                        case 213 -> 229;
                        case 214 -> 74;
                        case 215 -> 109;
                        case 216 -> 8;
                        case 217 -> 52;
                        case 218 -> 135;
                        case 219 -> 201;
                        case 220 -> 230;
                        case 221 -> 66;
                        case 222 -> 212;
                        case 223 -> 123;
                        case 224 -> 24;
                        case 225 -> 151;
                        case 226 -> 183;
                        case 227 -> 40;
                        case 228 -> 141;
                        case 229 -> 59;
                        case 230 -> 30;
                        case 231 -> 64;
                        case 232 -> 192;
                        case 233 -> 143;
                        case 234 -> 152;
                        case 235 -> 157;
                        case 236 -> 150;
                        case 237 -> 26;
                        case 238 -> 120;
                        case 239 -> 128;
                        case 240 -> 211;
                        case 241 -> 51;
                        case 242 -> 195;
                        case 243 -> 220;
                        case 244 -> 16;
                        case 245 -> 208;
                        case 246 -> 215;
                        case 247 -> 178;
                        case 248 -> 43;
                        case 249 -> 126;
                        case 250 -> 105;
                        case 251 -> 39;
                        case 252 -> 185;
                        case 253 -> 45;
                        case 254 -> 28;
                        default -> 235;
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
   }

   @Override
   public void aC() {
      boolean var43 = false; // PX-FIX
      Object var33 = null; // PX-FIX
      Object var31 = null; // PX-FIX
      Object var29 = null; // PX-FIX
      Object IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll = null; // PX-FIX
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      int var10000 = ((this.G()) ? 1 : 0);
      if (var1 == 0) {
         if ((var10000 == 0)) {
            return;
         }

         var10000 = ((me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m()) ? 1 : 0);
      }

      if ((var10000 != 0)) {
         label277: {
            Minecraft var28 = this.ap();
            if (var1 == 0) {
               if (var28.level == null) {
                  return;
               }

               var29 = this;
               if (var1 != 0) {
                  break label277;
               }

               var28 = this.ap();
            }

            if (var28.player == null) {
               return;
            }

            var29 = this;
         }

         label252: {
            label319: {
               label280: {
                  label281: {
                     var10000 = ((int[])IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl)[((me.octo.client.PXDyn)(Object)(this.W()
                        )).ordinal()];
                     if (var1 == 0) {
                        switch (var10000) {
                           case 1:
                              var10000 = ((this.aK()) ? 1 : 0);
                              break;
                           case 2:
                              break label281;
                           case 3:
                              break label280;
                           default:
                              return;
                        }
                     }

                     label240: {
                        label239: {
                           label238: {
                              if (var1 == 0) {
                                 if (var10000 == 0) {
                                    return;
                                 }

                                 var31 = this;
                                 if (var1 != 0) {
                                    break label238;
                                 }

                                 var10000 = ((int[])IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)[this.aJ()
                                    .a()
                                    .ordinal()];
                              }

                              switch (var10000) {
                                 case 1:
                                    var31 = this;
                                    break;
                                 case 2:
                                    break label239;
                                 default:
                                    break label240;
                              }
                           }

                           this.a(
                              IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll,
                              2000
                           );
                           if (var1 == 0) {
                              return;
                           }
                        }

                        IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .a(3000L, null);
                     }

                     if (var1 == 0) {
                        return;
                     }
                  }

                  Object var32 = this;
                  if (var1 == 0) {
                     if (this.a9() > CollectionsKt.getLastIndex(this.ac())) {
                        var33 = this;
                        if (var1 != 0) {
                           break label252;
                        }

                        if (this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll
                           != IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           )
                         {
                           break label319;
                        }

                        IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI var34 = this;
                        if (var1 == 0) {
                           if (this.a_()) {
                              short var50 = -426;
                              short var52 = -6741;
                              this.a(
                                 "Player on route, swapping lobbies",
                                 me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                              );
                              this.a(
                                 IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
                                 5000
                              );
                              return;
                           }

                           this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                           this.a(0);
                           var34 = this;
                        }

                        var34.a(this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll);
                        if (var1 != 0) {
                           break label319;
                        }
                     }

                     var32 = this.ac().get(this.a9());
                     short var10002 = -443;
                     short var10003 = -21795;
                     Intrinsics.checkNotNullExpressionValue(var32, "get(...)");
                  }

                  IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var2 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var32;
                  var10000 = ((int[])IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII)[var2.b()
                     .ordinal()];
                  if (var1 == 0) {
                     switch (var10000) {
                        case 1:
                           boolean var36 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a(
                              this, var2, 0.0, null);
                           if (var1 == 0) {
                              if (var36) {
                                 int var5 = this.a9();
                                 this.a(var5 + 1);
                                 IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                    .e()
                                    .k();
                                 if (var1 == 0) {
                                    return;
                                 }
                              }

                              var36 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                 .e()
                                 .d();
                           }

                           if (var1 == 0) {
                              if (!var36) {
                                 return;
                              }

                              IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                                 ((net.minecraft.core.BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                    .e())),
                                 var2.a(),
                                 null,
                                 false);
                           }

                           if (var1 == 0) {
                              return;
                           }
                        case 2:
                           var10000 = (llIlIlIIlIIlIlIllIIIIIIIIlIIIIlIIlIIllllllIIIllIIllllIlIlllIIIIllIIIIlllllIlIIllllIIl.a(
                              IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                 .f(),
                              var2.a(),
                              null,
                              2,
                              null
                           ) ? 1 : 0);
                           if (var1 == 0) {
                              if (var10000 == 0) {
                                 return;
                              }

                              var10000 = this.a9();
                           }

                           int var18 = var10000;
                           this.a(var18 + 1);
                           if (var1 == 0) {
                              return;
                           }
                        case 3:
                           IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI var38 = this;
                           if (var1 == 0) {
                              if (this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll
                                 == IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                                 )
                               {
                                 short var39 = -434;
                                 short var10001 = -30251;
                                 me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                                    "§aReached mining area, starting bot..."
                                 );
                                 this.bp();
                                 if (var1 == 0) {
                                    return;
                                 }
                              }

                              var38 = this;
                           }

                           int var19 = var38.a9();
                           this.a(var19 + 1);
                           if (var1 == 0) {
                              return;
                           }
                        default:
                           var10000 = this.a9();
                     }
                  }

                  int var20 = var10000;
                  this.a(var20 + 1);
                  if (var1 == 0) {
                     return;
                  }
               }

               if (this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI != null) {
                  me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var4 = this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
                  boolean var21 = false;
                  if (var1 == 0
                     && me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .K()
                        != var4.b()) {
                     boolean var40 = lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .j();
                     if (var1 != 0) {
                        return;
                     }

                     if (!var40) {
                        me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .b(var4.b());
                        return;
                     }
                  }
               }

               lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl var41 = lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
               if (var1 == 0) {
                  if (!lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.a()) {
                     Iterable var3 = this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
                     boolean var15 = false;
                     var var6 = new ArrayList();
                     boolean var7 = false;

                     for (Object var9 : var3) {
                        IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var10 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var9;
                        boolean var11 = false;
                        if (var1 != 0) {
                           return;
                        }

                        if (var10.b()
                           == IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                           )
                         {
                           var6.add(var9);
                           if (var1 != 0) {
                              break;
                           }
                        }
                     }

                     List var13 = var6;
                     Iterable var16 = this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
                     boolean var22 = false;
                     var var23 = new ArrayList();
                     boolean var24 = false;

                     for (Object var26 : var16) {
                        IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var27 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var26;
                        boolean var12 = false;
                        if (var1 != 0) {
                           return;
                        }

                        if (var27.b()
                           == IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           )
                         {
                           var23.add(var26);
                           if (var1 != 0) {
                              break;
                           }
                        }
                     }

                     List var14 = var23;
                     int var42 = ((var13.isEmpty()) ? 1 : 0);
                     if (var1 == 0) {
                        if ((var42 != 0)) {
                           var42 = (short)-430;
                           short var49 = 8423;
                           me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                              "§cNo MINE waypoints found in route!"
                           );
                           this.N();
                           return;
                        }

                        var42 = ((llllIlIIIIIIlIllllIIlIllllIIIIlIIlIlIIlllIlIIIlllIIIIIlIlllllIIIIIlIlIIllIllIlIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .c()
                           .al()) ? 1 : 0);
                     }

                     label151: {
                        label288: {
                           if (var1 == 0) {
                              if ((var42 == 0)) {
                                 break label288;
                              }

                              var42 = ((var14.isEmpty()) ? 1 : 0);
                           }

                           if (var1 == 0) {
                              var42 = (((var42 == 0) ? 1 : 0));
                           }

                           if ((var42 != 0)) {
                              var43 = true;
                              break label151;
                           }
                        }

                        var43 = false;
                     }

                     var15 = var43;
                     var42 = ((llllIlIIIIIIlIllllIIlIllllIIIIlIIlIlIIlllIlIIIlllIIIIIlIlllllIIIIIlIlIIllIllIlIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .c()
                        .al()) ? 1 : 0);
                     label141:
                     if (var1 == 0) {
                        if (var42 != 0) {
                           var42 = ((var14.isEmpty()) ? 1 : 0);
                           if (var1 != 0) {
                              break label141;
                           }

                           if (var42 != 0) {
                              short var45 = -428;
                              short var47 = -3551;
                              me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                                 "§eSpeedboost enabled but no VEIN waypoints found - will use ability without speedboost path"
                              );
                           }
                        }

                        var42 = var13.size();
                     }

                     int var48 = var14.size();
                     short var51 = -440;
                     short var53 = 13983;
                     var53 = -439;
                     short var10004 = -29610;
                     var10004 = -422;
                     short var10005 = -10692;
                     me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                        "§aStarting obsidian bot: " + var42 + " normal, " + var48 + " speedboost waypoints"
                     );
                     lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.a(
                        var13,
                        var14,
                        this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI,
                        llllIlIIIIIIlIllllIIlIllllIIIIlIIlIlIIlllIlIIIlllIIIIIlIlllllIIIIIlIlIIllIllIlIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .a()
                           .al(),
                        llllIlIIIIIIlIllllIIlIllllIIIIlIIlIlIIlllIlIIIlllIIIIIlIlllllIIIIIlIlIIllIllIlIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .b()
                           .al(),
                        llllIlIIIIIIlIllllIIlIllllIIIIlIIlIlIIlllIlIIIlllIIIIIlIlllllIIIIIlIlIIllIllIlIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .e()
                           .al(),
                        var15,
                        llllIlIIIIIIlIllllIIlIllllIIIIlIIlIlIIlllIlIIIlllIIIIIlIlllllIIIIIlIlIIllIllIlIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .d()
                           .al(),
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                           .e()
                     );
                     if (var1 == 0) {
                        return;
                     }
                  }

                  var41 = lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
               }

               var41.e();
               return;
            }

            var33 = this;
         }

         this.bp();
      }
   }

   private final void bp() {
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
      );
   }

   public static final void a(IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI self, IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      self.ae()
         .a(
            new lllIllIIllIIIIIIIlIIlIIIIIllllIlIIIIIllllIIlIIIIlllIIIIIIlIIIIlIlIIIIllIIllIIlllIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll,
               (kotlin.jvm.functions.Function1)(IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI::f),
               var1.d(),
               0,
               0,
               0L,
               0,
               (kotlin.jvm.functions.Function1)(IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI::g),
               120,
               null
            )
         );
   }

   private final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      a(this, var1);
   }

   private final void bq() {
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      if (var1 == 0) {
         if (lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.a()) {
            lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.v();
         }

         llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .p();
         short var10001 = -425;
         short var10002 = -7705;
         llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a("attack", false);
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .e()
            .k();
      }
   }

   private final void br() {
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .e()
         .k();
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      this.a(this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl);
      lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a(this, 0.0, 1, null);
   }

   private final void bs() {
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      this.a(this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll);
      lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a(this, 0.0, 1, null);
   }

   @Override
   public void ba() {
      ArrayList var18 = null; // PX-FIX
      ArrayList var14 = null; // PX-FIX
      int var1;
      ArrayList var2;
      int var15;
      label120: {
         var2 = this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
         var15 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
         boolean var3 = false;
         var1 = var15;
         var14 = var2;
         label116:
         if (var1 != 0) {
            if (var2 instanceof Collection) {
               var14 = var2;
               if (var1 == 0) {
                  break label116;
               }

               if (var14.isEmpty()) {
                  var15 = 0;
                  break label120;
               }
            }

            var14 = var2;
         }

         Iterator var4 = var14.iterator();

         label107:
         while (true) {
            if (!var4.hasNext()) {
               var15 = 0;
               break;
            }

            Object var5 = var4.next();
            IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var6 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var5;
            boolean var7 = false;
            var15 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a(this, var6, 2.0, null);

            while ((var15 != 0)) {
               var15 = 1;
               if (var1 != 0) {
                  break label107;
               }
            }
         }
      }

      if ((var15 != 0)) {
         this.bp();
      } else {
         boolean var16 = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl.isEmpty();
         if (var1 != 0) {
            var16 = !var16;
         }

         label122: {
   pxClinit: {
            label123: {
               label124: {
                  if (var16) {
                     var16 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a(
                        this,
                        (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)CollectionsKt.last(
                           this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl
                        ),
                        0.0);
                     if (var1 == 0) {
                        break label124;
                     }

                     if (var16) {
                        IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                           ((net.minecraft.core.BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                              .e())),
                           ((IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)CollectionsKt.last(
                                 this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl
                              ))
                              .a(),
                           null,
                           false);
                        this.bp();
                        break pxClinit;
                     }
                  }

                  var2 = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
                  boolean var9 = false;
                  var18 = var2;
                  if (var1 == 0) {
                     break label123;
                  }

                  var16 = var2 instanceof Collection;
               }

               if (var16) {
                  var18 = var2;
                  if (var1 == 0) {
                     break label123;
                  }

                  if (var18.isEmpty()) {
                     var16 = false;
                     break label122;
                  }
               }

               var18 = var2;
            }

            Iterator var10 = var18.iterator();

            label75:
            while (true) {
               if (!var10.hasNext()) {
                  var16 = false;
                  break;
               }

               Object var11 = var10.next();
               IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var12 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var11;
               boolean var13 = false;
               var16 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a(this, var12, 0.0, null);

               while (var16) {
                  var16 = true;
                  if (var1 != 0) {
                     break label75;
                  }
               }
            }
         }
}

         if (var16) {
            this.br();
         } else {
            int var8 = this.b(this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl);
            if (var1 != 0) {
               if (var8 < 0) {
                  if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .g()
                     == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll
                     )
                   {
                     this.br();
                     if (var1 != 0) {
                        return;
                     }
                  }

                  this.a(
                     IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll,
                     2000
                  );
                  return;
               }

               this.br();
               this.a(var8);
            }
         }
      }
   }

   @Override
   public void M() {
      boolean var27 = false; // PX-FIX
      Object var26 = null; // PX-FIX
      Object var23 = null; // PX-FIX
      int var1;
      boolean var3;
      boolean var15;
      int var24;
      label238: {
         this.aM();
         this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = this.bt();
         llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI[] var2 = new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI[]{
            new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
               me.octo.client.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               null,
               true
            ),
            new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
               me.octo.client.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI::bx,
               false
            ),
            new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
               me.octo.client.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI::by,
               false
            ),
            new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
               me.octo.client.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
               IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI::bz,
               false
            )
         };
         this.a(CollectionsKt.listOf(var2));
         var24 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
         this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = llllIIIIIIlIIIlIIlIllIIlIIlIIlIlIIlllIIIIIlIlIlIIIIlIllIllllIIIIIIlIIIlllIIlIIIIlIlIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
            .a(0);
         var1 = var24;
         this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = llllIIIIIIlIIIlIIlIllIIlIIlIIlIlIIlllIIIIIlIlIlIIIIlIllIllllIIIIIIlIIIlllIIlIIIIlIlIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
            .a(1);
         var15 = this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI != null;
         var3 = lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g()
            != null;
         var var5 = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
         boolean var6 = false;
         var23 = var5;
         label233:
         if (var1 == 0) {
            if (var5 instanceof Collection) {
               var23 = var5;
               if (var1 != 0) {
                  break label233;
               }

               if (((me.octo.client.PXDyn)var23).isEmpty()) {
                  var24 = 0;
                  break label238;
               }
            }

            var23 = var5;
         }

         Iterator var7 = ((me.octo.client.PXDyn)var23).iterator();

         label224:
         while (true) {
            if (!var7.hasNext()) {
               var24 = 0;
               break;
            }

            Object var8 = var7.next();
            IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var9 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var8;
            boolean var25 = false;

            while (
               var9.b()
                  == IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            ) {
               var24 = 1;
               if (var1 == 0) {
                  break label224;
               }
            }
         }
      }

      boolean var4;
      boolean var16;
      boolean var17;
      boolean var18;
      label241: {
         var4 = (var24 != 0);
         var16 = this.X() != null;
         var17 = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl.isEmpty();
         var18 = this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll.isEmpty();
         var var20 = this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
         boolean var10 = false;
         var26 = var20;
         label210:
         if (var1 == 0) {
            if (var20 instanceof Collection) {
               var26 = var20;
               if (var1 != 0) {
                  break label210;
               }

               if (((me.octo.client.PXDyn)var26).isEmpty()) {
                  var27 = false;
                  break label241;
               }
            }

            var26 = var20;
         }

         Iterator var11 = ((me.octo.client.PXDyn)var26).iterator();

         label201:
         while (true) {
            if (!var11.hasNext()) {
               var27 = false;
               break;
            }

            Object var12 = var11.next();
            IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var13 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var12;
            boolean var28 = false;

            while (
               var13.b()
                  == IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            ) {
               var27 = true;
               if (var1 == 0) {
                  break label201;
               }
            }
         }
      }

      boolean var19 = var27;
      short var29 = ((short)((llllIlIIIIIIlIllllIIlIllllIIIIlIIlIlIIlllIlIIIlllIIIIIlIlllllIIIIIlIlIIllIllIlIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b()
         .al()) ? 1 : 0));
      if (var1 == 0) {
         var29 = (short)(((var29 != 0)
            || (me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.a(
                  me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                  false)
                ? 1 : 0) != 0) ? 1 : 0);
      }

      boolean var21;
      var21 = (var29 != 0);
      var29 =((short)(( var4) ? 1 : 0));
      label183:
      if (var1 == 0) {
         if (var4) {
            var29 =((short)(( var16) ? 1 : 0));
            if (var1 != 0) {
               break label183;
            }

            if (!var16) {
               var29 = (short)((0 != 0) ? 1 : 0);
               break label183;
            }
         }

         var29 = (short)((1 != 0) ? 1 : 0);
      }

      label252: {
         boolean var22 =( var29 != 0);
         var29 =((short)(( var15) ? 1 : 0));
         label173:
         if (var1 == 0) {
            if (var15) {
               var29 =((short)(( var3) ? 1 : 0));
               if (var1 != 0) {
                  break label173;
               }

               if (var3) {
                  var29 =((short)(( var22) ? 1 : 0));
                  if (var1 != 0) {
                     break label173;
                  }

                  if (var22) {
                     var29 =((short)(( var17) ? 1 : 0));
                     if (var1 != 0) {
                        break label173;
                     }

                     if (!var17) {
                        var29 =((short)(( var18) ? 1 : 0));
                        if (var1 != 0) {
                           break label173;
                        }

                        if (!var18) {
                           var29 =((short)(( var19) ? 1 : 0));
                           if (var1 != 0) {
                              break label173;
                           }

                           if (var19) {
                              var29 =((short)(( var21) ? 1 : 0));
                              if (var1 != 0) {
                                 break label252;
                              }

                              if (var21) {
                                 var29 = ((short)((llllIlIIIIIIlIllllIIlIllllIIIIlIIlIlIIlllIlIIIlllIIIIIlIlllllIIIIIlIlIIllIllIlIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .c()
                                    .al()) ? 1 : 0));
                                 break label252;
                              }
                           }
                        }
                     }
                  }
               }
            }

            var29 =((short)(( var15) ? 1 : 0));
         }

         if (var1 == 0) {
            if ((var29 == 0)) {
               IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII var34 = IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
               String var10002 = this.aj();
               short var10003 = -431;
               short var10004 = -23340;
               var34.b(
                  5000L,
                  var10002,
                  "No drill or pickaxe found in hotbar!",
                  me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
               );
               var29 = -429;
               short var40 = 25472;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                  "§cPlease put a drill or pickaxe in your hotbar"
               );
            }

            var29 =((short)(( var3) ? 1 : 0));
         }

         if (var1 == 0) {
            if ((var29 == 0)) {
               this.bg();
            }

            var29 =((short)(( var4) ? 1 : 0));
         }

         label145:
         if (var1 == 0) {
            if ((var29 != 0)) {
               var29 =((short)(( var16) ? 1 : 0));
               if (var1 != 0) {
                  break label145;
               }

               if (!var16) {
                  this.aP();
               }
            }

            var29 =((short)(( var17) ? 1 : 0));
         }

         if (var1 == 0) {
            if ((var29 != 0)) {
               llllIIIIIIlIIIlIIlIllIIlIIlIIlIlIIlllIIIIIlIlIlIIIIlIllIllllIIIIIIlIIIlllIIlIIIIlIlIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
                  .c(0);
            }

            var29 =((short)(( var18) ? 1 : 0));
         }

         if (var1 == 0) {
            if ((var29 != 0)) {
               llllIIIIIIlIIIlIIlIllIIlIIlIIlIlIIlllIIIIIlIlIlIIIIlIllIllllIIIIIIlIIIlllIIlIIIIlIlIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
                  .c(1);
            }

            var29 =((short)(( var19) ? 1 : 0));
         }

         label135:
         if (var1 == 0) {
            if ((var29 == 0)) {
               var29 =((short)(( var18) ? 1 : 0));
               if (var1 != 0) {
                  break label135;
               }

               if (!var18) {
                  var29 = -441;
                  short var41 = 2854;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                     "§cMine route must have MINE waypoints!"
                  );
                  IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII var37 = IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  String var43 = this.aj();
                  short var45 = -421;
                  short var47 = 23912;
                  var37.b(
                     5000L,
                     var43,
                     "No MINE waypoints in mine route",
                     me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                  );
               }
            }

            var29 =((short)(( var21) ? 1 : 0));
         }

         if ((var29 == 0)) {
            IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII var38 = IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            String var44 = this.aj();
            short var46 = -445;
            short var48 = 6043;
            var38.b(
               5000L,
               var44,
               "No fishing rod found for rod swap!",
               me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            );
            var29 = -419;
            short var42 = 27861;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "§cPlease put a fishing rod in your hotbar or disable rod swap"
            );
         }

         this.N();
         return;
      }

      if ((var29 != 0)) {
         var29 = -436;
         short var10001 = 17356;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
            "§eSpeedboost mode enabled - ensure you have 30,000+ mining speed with ability active to instamine!"
         );
      }

      super.M();
      this.ba();
   }

   @Override
   public void N() {
      this.bq();
      this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = null;
      super.N();
   }

   @Override
   public void aN() {
      this.bq();
      super.aN();
   }

   @SubscribeEvent(
      priority = EventPriority.HIGH
   )
   public final void a(@NotNull IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl param1) {
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "event");
      if (this.G()) {
         return;
      }

      if (!me.octo.client.lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
            .a(me.octo.client.llllIlIIIIIIlIllllIIlIllllIIIIlIIlIlIIlllIlIIIlllIIIIIlIlllllIIIIIlIlIIllIllIlIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.h().al())) {
         return;
      }

      if (!me.octo.client.IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.a()) {
         return;
      }

      java.util.List var3 = kotlin.collections.CollectionsKt.toList((java.lang.Iterable) me.octo.client.IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.w());
      if (var3.isEmpty()) {
         return;
      }

      if (me.octo.client.IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.a()) {
         me.octo.client.lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
            .a(param1.k(), (java.util.List) var3, me.octo.client.IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.y());
      }

      if (me.octo.client.IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.b()) {
         return;
      }

      int var4 = me.octo.client.IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.x();
      java.util.ArrayList var5 = new java.util.ArrayList();
      for (me.octo.client.IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var13 : (java.lang.Iterable<me.octo.client.IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll>) this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll) {
         if (var13.b() == me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
            var5.add(var13);
         }
      }

      me.octo.client.lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
         .a((java.util.List) var5, var4, null);
   }

   @Override
   public boolean af() {
      return this.W()
         == IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   private final me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll bt() {
      boolean var18 = false; // PX-FIX
      Object var17 = null; // PX-FIX
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      if (var1 != 0) {
         LocalPlayer var10000 = this.ap().player;
         if (var10000 != null) {
            Inventory var14 = var10000.getInventory();
            if (var14 != null) {
               Inventory var2 = var14;
               String[] var4 = new String[3];
               short var10002 = -432;
               short var10003 = 2026;
               var4[0] = "Drill";
               var10002 = -433;
               var10003 = 3266;
               var4[1] = "Pickaxe";
               var10002 = -444;
               var10003 = 9909;
               var4[2] = "Gauntlet";
               List var3 = CollectionsKt.listOf(var4);
               int var13 = 0;

               while (var13 < 9) {
                  ItemStack var15 = var2.getItem(var13);
                  var10002 = -420;
                  var10003 = -28962;
                  Intrinsics.checkNotNullExpressionValue(var15, "getItem(...)");
                  ItemStack var5 = var15;
                  if (var1 != 0) {
                     if (!var5.isEmpty()) {
                        label74: {
                           String var6;
                           String var16 = var5.getHoverName().getString();
                           var10002 = -446;
                           var10003 = 29110;
                           Intrinsics.checkNotNullExpressionValue(var16, "getString(...)");
                           var6 = var16;
                           var var7 = var3;
                           boolean var8 = false;
                           var17 = var7;
                           label55:
                           if (var1 != 0) {
                              if (var7 instanceof Collection) {
                                 var17 = (Collection)var7;
                                 if (var1 == 0) {
                                    break label55;
                                 }

                                 if (((me.octo.client.PXDyn)var17).isEmpty()) {
                                    var18 = false;
                                    break label74;
                                 }
                              }

                              var17 = var7;
                           }

                           Iterator var9 = ((me.octo.client.PXDyn)var17).iterator();

                           label46:
                           while (true) {
                              if (!var9.hasNext()) {
                                 var18 = false;
                                 break;
                              }

                              Object var10 = var9.next();
                              String var11 = (String)var10;
                              boolean var12 = false;
                              var18 = StringsKt.contains(var6, var11, false);

                              while (var18) {
                                 var18 = true;
                                 if (var1 != 0) {
                                    break label46;
                                 }
                              }
                           }
                        }

                        if (var18) {
                           return new me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                              var5,
                              var13,
                              me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                           );
                        }
                     }

                     var13++;
                  }

                  if (var1 == 0) {
                     break;
                  }
               }

               return null;
            }
         }
      }

      return null;
   }

   @SubscribeEvent
   public final void c(@NotNull IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      int var2 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var10000 = var1;
      if (var2 != 0) {
         short var10001 = -418;
         short var10002 = 28150;
         Intrinsics.checkNotNullParameter(var1, "event");
         if (!this.G()) {
            return;
         }

         var10000 = var1;
      }

      Packet var3 = var10000.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      Packet var5 = var3;
      if (var2 != 0) {
         if (!(var3 instanceof ClientboundSystemChatPacket)) {
            return;
         }

         var5 = var3;
      }

      String var6 = ((ClientboundSystemChatPacket)var5).content().getString();
      short var9 = -435;
      short var10003 = 30106;
      Intrinsics.checkNotNullExpressionValue(var6, "getString(...)");
      String var4 = var6;
      CharSequence var7 = var4;
      short var8 = -427;
      var9 = -22763;
      if (StringsKt.contains(var7, "Your Mining Speed Boost has expired!", false)) {
         lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.h();
      }
   }

   private static final long a(IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI var0) {
      return var0.aJ().b() + 15000L;
   }

   private static final Object b(IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI var0) {
      return TuplesKt.to(
         var0.aJ().a(),
         IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
      );
   }

   private static final Object c(IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI var0) {
      return new IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         var0.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll,
         var0.a9(),
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(var0, 0.0, 1, null)
      );
   }

   private static final boolean bu() {
      return lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.a();
   }

   private static final Object d(IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI var0) {
      return new IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.y(),
         lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.x(),
         lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.b(),
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(var0, 0.0, 1, null)
      );
   }

   private static final boolean bv() {
      return lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.a();
   }

   private static final Object bw() {
      return IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .r();
   }

   private static final Unit e(IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI var0) {
      if (var0.G()
         && IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g()
            == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll
         )
       {
         var0.ba();
      }

      return Unit.INSTANCE;
   }

   private static final Unit f(IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI var0) {
      var0.ba();
      return Unit.INSTANCE;
   }

   private static final Unit g(IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI var0) {
      var0.bq();
      return Unit.INSTANCE;
   }

   private static final boolean h(IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI var0) {
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      boolean var10000 = var0.af();
      if (var1 != 0) {
         if (!var10000) {
            return false;
         }

         var10000 = lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            .b();
      }

      return var1 == 0 ? var10000 : var10000;
   }

   private static final boolean bx() {
      return IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .e();
   }

   private static final boolean by() {
      return IlllIIIIlIlllIlllllIlIlIIllIlllIlIIllllllIlllllIllIllllIllIIIllIIlIlIlllIIlIllIIlIlll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .a();
   }

   private static final boolean bz() {
      return IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .a();
   }

   @NotNull
   public static final IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI bA() {
      return IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll.a();
   }

   @NotNull
   public static final IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI bB() {
      return llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
   }

   @NotNull
   public static final lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl bC() {
      return lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[32];
      int var3 = 0;
      String var2 = "\u001c\u0001W@Bnk\u0011Wß:§ìÊt\u008d\u0093I¤\u0099H\u008c-\u000e\u009c¼õ®.åý+¡\u0019\u001b»\u0005ä\u0093J¤\u009f.\u001dRÓ¯»\u0092¾\u008e\u0011\u001bõ\u0097¢\u001a¤\u0091±5\u0098i¡W\u0099;ùÔÅÆ\"]\u001fz½â r¤\u001eâÆïà\u0018\u0007ë:#ë\u009a\u0013µ;\u009ey\u008dñe\"\u0017C¬¥y+\u0099K\u000ea~\bP8wa×¼Ð¯Õýã\u0017$¡i@[\rý\u009fÁ%\u0086\u0001\u00ad\u001f\u0092K²·9¢\u008bBtEÀ¼£fj@êÂÅª~~Ó[×(\u0089:\u0093»¬(é7Jî\u00931Ìu+\tÐC\u0080\u0016ºë*\u0017é\u0012\u001dØ\u0005>\u001eÐõ\u000ex\u008b\u009ec\u0004Ï®yív¯\u0096\u0005ã_ð \u0015Ë\u0010\u0019®în\u008bl&;\u0012\u0081ù\u0014ù¼&@\"\u009eLÏsYíC\u0096=²\u0095S¿$û?\u0092±\u0006Ï°³\u000b\u0011 !#½,©Söðy¯þ¢júÈ\u001548ÚªÀÏÑ\u0015Y\u0007VàòkEYeâLï÷\u0004Y®%Ô\u0016\u0090öí\rÓøã.E'¡OüXè2\u0012;8CAàx\u0019\u001bÀ.¥Lhù\u0019\u0002EñYhwäB¦J\u0091à\n¯KªG¸Ïé\u001cw[\u009dÑ1Jå'\u009e}\u0083Íú±ª\u0017ìW;+à¯æ+JØ\u0082K\u0096ÝÏØÜ\u008c>\u0086Zk\n\u001fõCj!Þi\u008d~Ðù|üQû2´åÊ6ôÑ¤\u008cI6T\u009a²î[\u0010\u0015\u0002\u0093g\u008c\tÛù\b\u0085\u0083À³r@ZÎ\u0001H2Þå=u¶Þ3\u001a\u0001\u008aü\u0097U%^¸#ç´ÂÉ\u008aª)\u0082]Úfý\u0089M\u008f6X\u000bÖvRnú¯9\u0090\u009c\f4,W[Y\u0017}iu\u0015éç\u0091×d\u009a¬©\u0082\fýc3j\u0016¯&àÑly±\u000f;>Á\u0006¿\n\r\u009f7W6\u008fkªM\u0005I©öe\u009d\u0007x¸ÇÔ\u008a7«\u0005þ\u001e\u0000\u0093C\"¯n!¯\u0097Ë\u00adùEo\u00adê\u0019vu»\u0096.À\u009dèÉ\u00ad\u0092\u0091â\u009ew\u0085\u008e\u0090+\u0005î\u000e\u00147\u000eú±óÖØ\u0002ãc\u0081N\u0081\b\u0088\u0095\u009dÕ\u0099^\u0085ý\bY¢\u0082ñ\u0001\u0016Ì£&\u0016Y¯Ë\u0081¿À¸¨-eå\u0091k\u0097%.\u001f©AUôÉiÒy\u0098û}Á<\u0083@\u0080\u0097ÔÙ2\u000e;\u0093Á³¿¼\rI7\u008b+Æt\u0015\tÞÆã\u008fmKrüt\u0019\u0007\u001a\u0093üÔðÐ¿u§«îÔ_)i{\"»ÎÅf\u0019\u0007\u007f\r\u008e wÕip×ÐlºN£\u000b\u000eíÒ\u001b\u009bä¹féZ \u0088mÉ¾\u000eÜo\u0017ñ\u0092\u0092²ô\u008efò1|\u0097b\u009bJ\u0000v¢2\u008a\u0019-\u0011Ò*\u0080¡¯ka#~É\u0014\fX¹\b #s}ßf«],ÄÁ(h!@\u0086h\fn\b_\u0086\n:³¡\u0013\u0091Ñ{dVT:ôí\u0001Õy¨ÃÞk\u0010Äò%\t`ò~\u0010áÎ\bf\u0099§a\u0098j+\u0011p\u008fJÒÎ¾{\u0087©\u0001";
      int var4 = "\u001c\u0001W@Bnk\u0011Wß:§ìÊt\u008d\u0093I¤\u0099H\u008c-\u000e\u009c¼õ®.åý+¡\u0019\u001b»\u0005ä\u0093J¤\u009f.\u001dRÓ¯»\u0092¾\u008e\u0011\u001bõ\u0097¢\u001a¤\u0091±5\u0098i¡W\u0099;ùÔÅÆ\"]\u001fz½â r¤\u001eâÆïà\u0018\u0007ë:#ë\u009a\u0013µ;\u009ey\u008dñe\"\u0017C¬¥y+\u0099K\u000ea~\bP8wa×¼Ð¯Õýã\u0017$¡i@[\rý\u009fÁ%\u0086\u0001\u00ad\u001f\u0092K²·9¢\u008bBtEÀ¼£fj@êÂÅª~~Ó[×(\u0089:\u0093»¬(é7Jî\u00931Ìu+\tÐC\u0080\u0016ºë*\u0017é\u0012\u001dØ\u0005>\u001eÐõ\u000ex\u008b\u009ec\u0004Ï®yív¯\u0096\u0005ã_ð \u0015Ë\u0010\u0019®în\u008bl&;\u0012\u0081ù\u0014ù¼&@\"\u009eLÏsYíC\u0096=²\u0095S¿$û?\u0092±\u0006Ï°³\u000b\u0011 !#½,©Söðy¯þ¢júÈ\u001548ÚªÀÏÑ\u0015Y\u0007VàòkEYeâLï÷\u0004Y®%Ô\u0016\u0090öí\rÓøã.E'¡OüXè2\u0012;8CAàx\u0019\u001bÀ.¥Lhù\u0019\u0002EñYhwäB¦J\u0091à\n¯KªG¸Ïé\u001cw[\u009dÑ1Jå'\u009e}\u0083Íú±ª\u0017ìW;+à¯æ+JØ\u0082K\u0096ÝÏØÜ\u008c>\u0086Zk\n\u001fõCj!Þi\u008d~Ðù|üQû2´åÊ6ôÑ¤\u008cI6T\u009a²î[\u0010\u0015\u0002\u0093g\u008c\tÛù\b\u0085\u0083À³r@ZÎ\u0001H2Þå=u¶Þ3\u001a\u0001\u008aü\u0097U%^¸#ç´ÂÉ\u008aª)\u0082]Úfý\u0089M\u008f6X\u000bÖvRnú¯9\u0090\u009c\f4,W[Y\u0017}iu\u0015éç\u0091×d\u009a¬©\u0082\fýc3j\u0016¯&àÑly±\u000f;>Á\u0006¿\n\r\u009f7W6\u008fkªM\u0005I©öe\u009d\u0007x¸ÇÔ\u008a7«\u0005þ\u001e\u0000\u0093C\"¯n!¯\u0097Ë\u00adùEo\u00adê\u0019vu»\u0096.À\u009dèÉ\u00ad\u0092\u0091â\u009ew\u0085\u008e\u0090+\u0005î\u000e\u00147\u000eú±óÖØ\u0002ãc\u0081N\u0081\b\u0088\u0095\u009dÕ\u0099^\u0085ý\bY¢\u0082ñ\u0001\u0016Ì£&\u0016Y¯Ë\u0081¿À¸¨-eå\u0091k\u0097%.\u001f©AUôÉiÒy\u0098û}Á<\u0083@\u0080\u0097ÔÙ2\u000e;\u0093Á³¿¼\rI7\u008b+Æt\u0015\tÞÆã\u008fmKrüt\u0019\u0007\u001a\u0093üÔðÐ¿u§«îÔ_)i{\"»ÎÅf\u0019\u0007\u007f\r\u008e wÕip×ÐlºN£\u000b\u000eíÒ\u001b\u009bä¹féZ \u0088mÉ¾\u000eÜo\u0017ñ\u0092\u0092²ô\u008efò1|\u0097b\u009bJ\u0000v¢2\u008a\u0019-\u0011Ò*\u0080¡¯ka#~É\u0014\fX¹\b #s}ßf«],ÄÁ(h!@\u0086h\fn\b_\u0086\n:³¡\u0013\u0091Ñ{dVT:ôí\u0001Õy¨ÃÞk\u0010Äò%\t`ò~\u0010áÎ\bf\u0099§a\u0098j+\u0011p\u008fJÒÎ¾{\u0087©\u0001"
         .length();
      char var1 = '$';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 79;
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
                     case 0 -> 119;
                     case 1 -> 27;
                     case 2 -> 59;
                     case 3 -> 67;
                     case 4 -> 63;
                     case 5 -> 41;
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
                     j = var5;
                     k = new String[32];
                     IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = new IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl = new IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI();
                     lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = new lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl();
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

                  var2 = "¤§ü\u007f-TÜ&v(\u009e\u0089v^ºw\u008fVÐ[q\u00175\u0018tM\u0004D\u008c»%üP?G\u008fk¼\u001f°Ö\u0098Ñi7¹";
                  var4 = "¤§ü\u007f-TÜ&v(\u009e\u0089v^ºw\u008fVÐ[q\u00175\u0018tM\u0004D\u008c»%üP?G\u008fk¼\u001f°Ö\u0098Ñi7¹".length();
                  var1 = 7;
                  var8 = -1;
            }

            var10000 = 4;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String e(int var0, int var1) {
      int var2 = (var0 ^ -431) & 65535;
      if (k[var2] == null) {
         char[] var3 = j[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 102;
            case 1 -> 43;
            case 2 -> 27;
            case 3 -> 40;
            case 4 -> 9;
            case 5 -> 51;
            case 6 -> 24;
            case 7 -> 171;
            case 8 -> 240;
            case 9 -> 193;
            case 10 -> 20;
            case 11 -> 153;
            case 12 -> 78;
            case 13 -> 188;
            case 14 -> 126;
            case 15 -> 221;
            case 16 -> 163;
            case 17 -> 112;
            case 18 -> 13;
            case 19 -> 159;
            case 20 -> 203;
            case 21 -> 155;
            case 22 -> 32;
            case 23 -> 232;
            case 24 -> 225;
            case 25 -> 0;
            case 26 -> 250;
            case 27 -> 96;
            case 28 -> 95;
            case 29 -> 10;
            case 30 -> 181;
            case 31 -> 183;
            case 32 -> 47;
            case 33 -> 179;
            case 34 -> 61;
            case 35 -> 150;
            case 36 -> 106;
            case 37 -> 254;
            case 38 -> 242;
            case 39 -> 55;
            case 40 -> 185;
            case 41 -> 4;
            case 42 -> 161;
            case 43 -> 189;
            case 44 -> 107;
            case 45 -> 134;
            case 46 -> 157;
            case 47 -> 212;
            case 48 -> 156;
            case 49 -> 22;
            case 50 -> 8;
            case 51 -> 100;
            case 52 -> 158;
            case 53 -> 135;
            case 54 -> 121;
            case 55 -> 202;
            case 56 -> 176;
            case 57 -> 33;
            case 58 -> 34;
            case 59 -> 28;
            case 60 -> 15;
            case 61 -> 54;
            case 62 -> 35;
            case 63 -> 7;
            case 64 -> 162;
            case 65 -> 14;
            case 66 -> 152;
            case 67 -> 75;
            case 68 -> 48;
            case 69 -> 169;
            case 70 -> 172;
            case 71 -> 92;
            case 72 -> 129;
            case 73 -> 253;
            case 74 -> 5;
            case 75 -> 21;
            case 76 -> 218;
            case 77 -> 235;
            case 78 -> 70;
            case 79 -> 31;
            case 80 -> 210;
            case 81 -> 230;
            case 82 -> 45;
            case 83 -> 160;
            case 84 -> 173;
            case 85 -> 87;
            case 86 -> 37;
            case 87 -> 63;
            case 88 -> 195;
            case 89 -> 130;
            case 90 -> 208;
            case 91 -> 65;
            case 92 -> 50;
            case 93 -> 145;
            case 94 -> 211;
            case 95 -> 248;
            case 96 -> 57;
            case 97 -> 143;
            case 98 -> 3;
            case 99 -> 215;
            case 100 -> 90;
            case 101 -> 252;
            case 102 -> 1;
            case 103 -> 166;
            case 104 -> 122;
            case 105 -> 186;
            case 106 -> 124;
            case 107 -> 204;
            case 108 -> 76;
            case 109 -> 244;
            case 110 -> 147;
            case 111 -> 234;
            case 112 -> 93;
            case 113 -> 226;
            case 114 -> 167;
            case 115 -> 41;
            case 116 -> 133;
            case 117 -> 138;
            case 118 -> 25;
            case 119 -> 97;
            case 120 -> 123;
            case 121 -> 119;
            case 122 -> 128;
            case 123 -> 228;
            case 124 -> 170;
            case 125 -> 94;
            case 126 -> 98;
            case 127 -> 108;
            case 128 -> 120;
            case 129 -> 139;
            case 130 -> 227;
            case 131 -> 238;
            case 132 -> 84;
            case 133 -> 18;
            case 134 -> 249;
            case 135 -> 64;
            case 136 -> 136;
            case 137 -> 116;
            case 138 -> 39;
            case 139 -> 177;
            case 140 -> 184;
            case 141 -> 132;
            case 142 -> 68;
            case 143 -> 127;
            case 144 -> 73;
            case 145 -> 146;
            case 146 -> 182;
            case 147 -> 83;
            case 148 -> 255;
            case 149 -> 140;
            case 150 -> 174;
            case 151 -> 194;
            case 152 -> 241;
            case 153 -> 85;
            case 154 -> 86;
            case 155 -> 246;
            case 156 -> 231;
            case 157 -> 236;
            case 158 -> 141;
            case 159 -> 104;
            case 160 -> 29;
            case 161 -> 58;
            case 162 -> 223;
            case 163 -> 200;
            case 164 -> 110;
            case 165 -> 220;
            case 166 -> 91;
            case 167 -> 201;
            case 168 -> 207;
            case 169 -> 79;
            case 170 -> 213;
            case 171 -> 196;
            case 172 -> 113;
            case 173 -> 80;
            case 174 -> 101;
            case 175 -> 72;
            case 176 -> 6;
            case 177 -> 151;
            case 178 -> 180;
            case 179 -> 77;
            case 180 -> 219;
            case 181 -> 17;
            case 182 -> 175;
            case 183 -> 11;
            case 184 -> 74;
            case 185 -> 36;
            case 186 -> 233;
            case 187 -> 26;
            case 188 -> 199;
            case 189 -> 243;
            case 190 -> 69;
            case 191 -> 125;
            case 192 -> 206;
            case 193 -> 191;
            case 194 -> 142;
            case 195 -> 105;
            case 196 -> 198;
            case 197 -> 60;
            case 198 -> 71;
            case 199 -> 187;
            case 200 -> 137;
            case 201 -> 237;
            case 202 -> 209;
            case 203 -> 216;
            case 204 -> 205;
            case 205 -> 229;
            case 206 -> 53;
            case 207 -> 164;
            case 208 -> 131;
            case 209 -> 89;
            case 210 -> 222;
            case 211 -> 115;
            case 212 -> 154;
            case 213 -> 44;
            case 214 -> 42;
            case 215 -> 59;
            case 216 -> 114;
            case 217 -> 178;
            case 218 -> 109;
            case 219 -> 165;
            case 220 -> 82;
            case 221 -> 62;
            case 222 -> 103;
            case 223 -> 247;
            case 224 -> 224;
            case 225 -> 190;
            case 226 -> 111;
            case 227 -> 56;
            case 228 -> 23;
            case 229 -> 19;
            case 230 -> 144;
            case 231 -> 149;
            case 232 -> 49;
            case 233 -> 148;
            case 234 -> 12;
            case 235 -> 118;
            case 236 -> 192;
            case 237 -> 239;
            case 238 -> 245;
            case 239 -> 217;
            case 240 -> 117;
            case 241 -> 66;
            case 242 -> 168;
            case 243 -> 52;
            case 244 -> 2;
            case 245 -> 67;
            case 246 -> 16;
            case 247 -> 81;
            case 248 -> 99;
            case 249 -> 38;
            case 250 -> 30;
            case 251 -> 251;
            case 252 -> 88;
            case 253 -> 46;
            case 254 -> 197;
            default -> 214;
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

         k[var2] = new String(var3).intern();
      }

      return k[var2];
   }

   private static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      @NotNull
      private final IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final Triple<Integer, Integer, Integer> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         @NotNull IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll var1,
         int var2,
         @NotNull Triple<Integer, Integer, Integer> var3
      ) {
         short var10001 = -8643;
         short var10002 = -846;
         Intrinsics.checkNotNullParameter(var1, "routeType");
         var10001 = -8647;
         var10002 = -29493;
         Intrinsics.checkNotNullParameter(var3, "playerPos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      }

      @NotNull
      public final IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
         @NotNull IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll var1,
         int var2,
         @NotNull Triple<Integer, Integer, Integer> var3
      ) {
         short var10001 = -8641;
         short var10002 = -32713;
         Intrinsics.checkNotNullParameter(var1, "routeType");
         var10001 = -8644;
         var10002 = 8779;
         Intrinsics.checkNotNullParameter(var3, "playerPos");
         return new IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -8642;
         Triple var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 8687;
         short var10002 = -8646;
         short var10003 = -11217;
         short var10004 = -8645;
         short var10005 = 28502;
         return "RouteProgress(routeType=" + var3 + ", currentIndex=" + var2 + ", playerPos=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         var1 = var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         return var1 * 31 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int var2 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
         IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var10000 = this;
         if (var2 != 0) {
            if (this == var1) {
               return true;
            }

            var10000 = (IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var1;
         }

         if (var2 != 0) {
            if (!(
               var10000 instanceof IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
            )) {
               return false;
            }

            var10000 = (IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var1;
         }

         IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = var10000;
         var10000 = this;
         if (var2 != 0) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var10000 = this;
         }

         int var5 = var10000.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if (var2 != 0) {
            if (var10000.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               != var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
               return false;
            }

            var5 = ((Intrinsics.areEqual(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            )) ? 1 : 0);
         }

         if (var2 != 0) {
            if (var5 == 0) {
               return false;
            }

            var5 = 1;
         }

         return (var5 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[7];
         int var3 = 0;
         String var2 = "\u009ebÎ\u009f\u0005¿\u009f9\u0003\u0018\u0010ñ;í»õCëðÙÕ\u0016âxS\u008ew\u00022\fyOßþ\t»Fj\u001b\u0091/\r+Q\tkf&q\u008eèÇ.\u0012\f1n« \bn¦\u0089\u008e6Ý\u001b";
         int var4 = "\u009ebÎ\u009f\u0005¿\u009f9\u0003\u0018\u0010ñ;í»õCëðÙÕ\u0016âxS\u008ew\u00022\fyOßþ\t»Fj\u001b\u0091/\r+Q\tkf&q\u008eèÇ.\u0012\f1n« \bn¦\u0089\u008e6Ý\u001b"
            .length();
         char var1 = '\t';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 16;
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
                        case 0 -> 57;
                        case 1 -> 19;
                        case 2 -> 97;
                        case 3 -> 85;
                        case 4 -> 92;
                        case 5 -> 90;
                        default -> 22;
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

                     var2 = "\u0084ù\u001fZí\u0011z\u0001 \u008f¤\u0086¡Þ±\tW °¨MÂ®z.";
                     var4 = "\u0084ù\u001fZí\u0011z\u0001 \u008f¤\u0086¡Þ±\tW °¨MÂ®z.".length();
                     var1 = 15;
                     var8 = -1;
               }

               var10000 = 74;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -8641) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 29;
               case 1 -> 16;
               case 2 -> 0;
               case 3 -> 216;
               case 4 -> 140;
               case 5 -> 181;
               case 6 -> 247;
               case 7 -> 167;
               case 8 -> 69;
               case 9 -> 219;
               case 10 -> 136;
               case 11 -> 118;
               case 12 -> 201;
               case 13 -> 92;
               case 14 -> 242;
               case 15 -> 32;
               case 16 -> 91;
               case 17 -> 152;
               case 18 -> 6;
               case 19 -> 135;
               case 20 -> 206;
               case 21 -> 179;
               case 22 -> 121;
               case 23 -> 137;
               case 24 -> 34;
               case 25 -> 131;
               case 26 -> 246;
               case 27 -> 230;
               case 28 -> 231;
               case 29 -> 183;
               case 30 -> 233;
               case 31 -> 234;
               case 32 -> 253;
               case 33 -> 155;
               case 34 -> 90;
               case 35 -> 166;
               case 36 -> 119;
               case 37 -> 207;
               case 38 -> 98;
               case 39 -> 157;
               case 40 -> 235;
               case 41 -> 144;
               case 42 -> 180;
               case 43 -> 173;
               case 44 -> 23;
               case 45 -> 226;
               case 46 -> 172;
               case 47 -> 77;
               case 48 -> 178;
               case 49 -> 15;
               case 50 -> 56;
               case 51 -> 211;
               case 52 -> 208;
               case 53 -> 30;
               case 54 -> 7;
               case 55 -> 12;
               case 56 -> 96;
               case 57 -> 132;
               case 58 -> 199;
               case 59 -> 35;
               case 60 -> 240;
               case 61 -> 170;
               case 62 -> 51;
               case 63 -> 138;
               case 64 -> 5;
               case 65 -> 177;
               case 66 -> 25;
               case 67 -> 196;
               case 68 -> 48;
               case 69 -> 202;
               case 70 -> 169;
               case 71 -> 163;
               case 72 -> 111;
               case 73 -> 3;
               case 74 -> 80;
               case 75 -> 106;
               case 76 -> 165;
               case 77 -> 168;
               case 78 -> 203;
               case 79 -> 134;
               case 80 -> 79;
               case 81 -> 36;
               case 82 -> 122;
               case 83 -> 221;
               case 84 -> 133;
               case 85 -> 241;
               case 86 -> 31;
               case 87 -> 189;
               case 88 -> 117;
               case 89 -> 171;
               case 90 -> 88;
               case 91 -> 62;
               case 92 -> 200;
               case 93 -> 8;
               case 94 -> 188;
               case 95 -> 108;
               case 96 -> 197;
               case 97 -> 115;
               case 98 -> 73;
               case 99 -> 248;
               case 100 -> 27;
               case 101 -> 127;
               case 102 -> 20;
               case 103 -> 237;
               case 104 -> 110;
               case 105 -> 142;
               case 106 -> 214;
               case 107 -> 213;
               case 108 -> 232;
               case 109 -> 71;
               case 110 -> 38;
               case 111 -> 37;
               case 112 -> 150;
               case 113 -> 97;
               case 114 -> 145;
               case 115 -> 251;
               case 116 -> 159;
               case 117 -> 81;
               case 118 -> 218;
               case 119 -> 254;
               case 120 -> 101;
               case 121 -> 156;
               case 122 -> 154;
               case 123 -> 129;
               case 124 -> 74;
               case 125 -> 209;
               case 126 -> 160;
               case 127 -> 2;
               case 128 -> 72;
               case 129 -> 45;
               case 130 -> 220;
               case 131 -> 53;
               case 132 -> 11;
               case 133 -> 194;
               case 134 -> 68;
               case 135 -> 87;
               case 136 -> 143;
               case 137 -> 43;
               case 138 -> 86;
               case 139 -> 58;
               case 140 -> 124;
               case 141 -> 215;
               case 142 -> 65;
               case 143 -> 93;
               case 144 -> 161;
               case 145 -> 125;
               case 146 -> 210;
               case 147 -> 153;
               case 148 -> 104;
               case 149 -> 236;
               case 150 -> 54;
               case 151 -> 47;
               case 152 -> 184;
               case 153 -> 195;
               case 154 -> 191;
               case 155 -> 185;
               case 156 -> 39;
               case 157 -> 244;
               case 158 -> 44;
               case 159 -> 103;
               case 160 -> 162;
               case 161 -> 229;
               case 162 -> 33;
               case 163 -> 187;
               case 164 -> 59;
               case 165 -> 60;
               case 166 -> 255;
               case 167 -> 21;
               case 168 -> 4;
               case 169 -> 149;
               case 170 -> 112;
               case 171 -> 158;
               case 172 -> 82;
               case 173 -> 67;
               case 174 -> 225;
               case 175 -> 227;
               case 176 -> 252;
               case 177 -> 192;
               case 178 -> 17;
               case 179 -> 63;
               case 180 -> 224;
               case 181 -> 151;
               case 182 -> 205;
               case 183 -> 114;
               case 184 -> 250;
               case 185 -> 147;
               case 186 -> 1;
               case 187 -> 174;
               case 188 -> 75;
               case 189 -> 57;
               case 190 -> 109;
               case 191 -> 228;
               case 192 -> 50;
               case 193 -> 239;
               case 194 -> 139;
               case 195 -> 100;
               case 196 -> 46;
               case 197 -> 176;
               case 198 -> 222;
               case 199 -> 55;
               case 200 -> 175;
               case 201 -> 243;
               case 202 -> 78;
               case 203 -> 198;
               case 204 -> 204;
               case 205 -> 107;
               case 206 -> 245;
               case 207 -> 61;
               case 208 -> 70;
               case 209 -> 164;
               case 210 -> 14;
               case 211 -> 10;
               case 212 -> 116;
               case 213 -> 42;
               case 214 -> 120;
               case 215 -> 141;
               case 216 -> 9;
               case 217 -> 41;
               case 218 -> 217;
               case 219 -> 95;
               case 220 -> 123;
               case 221 -> 94;
               case 222 -> 28;
               case 223 -> 238;
               case 224 -> 99;
               case 225 -> 83;
               case 226 -> 190;
               case 227 -> 49;
               case 228 -> 146;
               case 229 -> 52;
               case 230 -> 22;
               case 231 -> 212;
               case 232 -> 148;
               case 233 -> 128;
               case 234 -> 223;
               case 235 -> 18;
               case 236 -> 105;
               case 237 -> 102;
               case 238 -> 249;
               case 239 -> 85;
               case 240 -> 24;
               case 241 -> 130;
               case 242 -> 66;
               case 243 -> 193;
               case 244 -> 26;
               case 245 -> 76;
               case 246 -> 89;
               case 247 -> 84;
               case 248 -> 19;
               case 249 -> 40;
               case 250 -> 186;
               case 251 -> 64;
               case 252 -> 113;
               case 253 -> 13;
               case 254 -> 126;
               default -> 182;
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
   
   public static me.octo.client.IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(me.octo.client.IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll p0, me.octo.client.IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll p1, int p2, kotlin.Triple p3, int p4, java.lang.Object p5) {
      if ((p4 & 1) != 0) p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      if ((p4 & 2) != 0) p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      if ((p4 & 4) != 0) p3 = p0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      return p0.a(p1, p2, p3);
   }
}

   public static enum IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

      public static IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll[] a() {
         return (IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll[])IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.clone();
      }

      public static IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll a(
         String var0
      ) {
         return Enum.valueOf(
            IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll> b() {
         return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll[]{IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII};
      private static final EnumEntries<IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = kotlin.enums.EnumEntriesKt.enumEntries(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);

      private static final IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll[] c() {
         return new IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll[]{IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII};
      }
   }

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(Object... px) {
        }

      private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
      }

      @NotNull
      public final IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI a() {
         return IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
      }

      @NotNull
      public final lIIlllIIIIlIlIlIIlIlIIIIllIIIIllIlIIllIIlIllIllllllllllllIlllIlIlllIIIllIlIIllIIIIIIl c() {
         return IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
      }
   
   public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(kotlin.jvm.internal.DefaultConstructorMarker p0) {
      this();
   }
   public static void b() {
   }
}

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @NotNull
      private final Triple<Integer, Integer, Integer> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         int var1, int var2, boolean var3, @NotNull Triple<Integer, Integer, Integer> var4
      ) {
         short var10001 = 13977;
         short var10002 = -15316;
         Intrinsics.checkNotNullParameter(var4, "playerPos");
         super();
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

      public final boolean c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final int e() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int f() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean g() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> h() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         int var1, int var2, boolean var3, @NotNull Triple<Integer, Integer, Integer> var4
      ) {
         short var10001 = 13981;
         short var10002 = 17133;
         Intrinsics.checkNotNullParameter(var4, "playerPos");
         return new IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2, var3, var4
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 13978;
         Triple var1 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         boolean var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -21488;
         short var10002 = 13979;
         short var10003 = 14875;
         short var10004 = 13980;
         short var10005 = -26577;
         short var10006 = 13976;
         short var10007 = -8346;
         return "BotProgress(pathIndex=" + var4 + ", waypointIndex=" + var3 + ", speedboostMode=" + var2 + ", playerPos=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var1 = var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         var1 = var1 * 31 + Boolean.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         return var1 * 31 + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int var2 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
         Object var10000 = this;
         if (var2 != 0) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != 0) {
            if (!(
               var10000 instanceof IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         int var10001 = var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var2 != 0) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         label56: {
            if (var2 != 0) {
               if (var4 != var10001) {
                  return false;
               }

               var4 = ((this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) ? 1 : 0);
               if (var2 == 0) {
                  break label56;
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

         if (var2 != 0) {
            if (var4 == 0) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[6];
         int var3 = 0;
         String var2 = ">×ÎX8ù\u000e\u00176a\u0005m\t\u0099\u007fü\u009dIý\u0091àu\u0016@k¦U¢õ.BE×ø1\u0018K\u0005\"Ã¥\u0082\u0018áû\u0010\u001fRíå£ëlf\u000f,áïR\u001aÖÙ";
         int var4 = ">×ÎX8ù\u000e\u00176a\u0005m\t\u0099\u007fü\u009dIý\u0091àu\u0016@k¦U¢õ.BE×ø1\u0018K\u0005\"Ã¥\u0082\u0018áû\u0010\u001fRíå£ëlf\u000f,áïR\u001aÖÙ"
            .length();
         char var1 = '\f';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 43;
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
                        case 0 -> 70;
                        case 1 -> 36;
                        case 2 -> 86;
                        case 3 -> 32;
                        case 4 -> 122;
                        case 5 -> 32;
                        default -> 32;
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

                     var2 = "¤#\u001f[ä\u009b\u0091UZºÑÞ\u0081î=Õ#\tiàcï;2^\u0098\r";
                     var4 = "¤#\u001f[ä\u009b\u0091UZºÑÞ\u0081î=Õ#\tiàcï;2^\u0098\r".length();
                     var1 = 17;
                     var8 = -1;
               }

               var10000 = 14;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 13976) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 218;
               case 1 -> 0;
               case 2 -> 220;
               case 3 -> 152;
               case 4 -> 245;
               case 5 -> 23;
               case 6 -> 59;
               case 7 -> 115;
               case 8 -> 103;
               case 9 -> 241;
               case 10 -> 172;
               case 11 -> 46;
               case 12 -> 143;
               case 13 -> 196;
               case 14 -> 44;
               case 15 -> 228;
               case 16 -> 74;
               case 17 -> 4;
               case 18 -> 150;
               case 19 -> 104;
               case 20 -> 126;
               case 21 -> 42;
               case 22 -> 217;
               case 23 -> 83;
               case 24 -> 121;
               case 25 -> 82;
               case 26 -> 50;
               case 27 -> 69;
               case 28 -> 3;
               case 29 -> 124;
               case 30 -> 119;
               case 31 -> 53;
               case 32 -> 236;
               case 33 -> 156;
               case 34 -> 254;
               case 35 -> 202;
               case 36 -> 149;
               case 37 -> 56;
               case 38 -> 36;
               case 39 -> 26;
               case 40 -> 155;
               case 41 -> 141;
               case 42 -> 246;
               case 43 -> 84;
               case 44 -> 224;
               case 45 -> 161;
               case 46 -> 21;
               case 47 -> 72;
               case 48 -> 147;
               case 49 -> 98;
               case 50 -> 78;
               case 51 -> 49;
               case 52 -> 183;
               case 53 -> 137;
               case 54 -> 92;
               case 55 -> 85;
               case 56 -> 230;
               case 57 -> 233;
               case 58 -> 164;
               case 59 -> 171;
               case 60 -> 255;
               case 61 -> 94;
               case 62 -> 12;
               case 63 -> 232;
               case 64 -> 20;
               case 65 -> 176;
               case 66 -> 60;
               case 67 -> 203;
               case 68 -> 223;
               case 69 -> 219;
               case 70 -> 33;
               case 71 -> 134;
               case 72 -> 106;
               case 73 -> 47;
               case 74 -> 197;
               case 75 -> 188;
               case 76 -> 133;
               case 77 -> 76;
               case 78 -> 153;
               case 79 -> 96;
               case 80 -> 28;
               case 81 -> 87;
               case 82 -> 165;
               case 83 -> 231;
               case 84 -> 30;
               case 85 -> 8;
               case 86 -> 35;
               case 87 -> 113;
               case 88 -> 191;
               case 89 -> 63;
               case 90 -> 194;
               case 91 -> 120;
               case 92 -> 48;
               case 93 -> 237;
               case 94 -> 213;
               case 95 -> 58;
               case 96 -> 174;
               case 97 -> 75;
               case 98 -> 167;
               case 99 -> 159;
               case 100 -> 226;
               case 101 -> 15;
               case 102 -> 31;
               case 103 -> 207;
               case 104 -> 185;
               case 105 -> 157;
               case 106 -> 227;
               case 107 -> 253;
               case 108 -> 1;
               case 109 -> 204;
               case 110 -> 108;
               case 111 -> 151;
               case 112 -> 148;
               case 113 -> 29;
               case 114 -> 189;
               case 115 -> 51;
               case 116 -> 99;
               case 117 -> 10;
               case 118 -> 162;
               case 119 -> 24;
               case 120 -> 91;
               case 121 -> 136;
               case 122 -> 125;
               case 123 -> 132;
               case 124 -> 229;
               case 125 -> 163;
               case 126 -> 7;
               case 127 -> 179;
               case 128 -> 205;
               case 129 -> 16;
               case 130 -> 154;
               case 131 -> 40;
               case 132 -> 239;
               case 133 -> 131;
               case 134 -> 38;
               case 135 -> 182;
               case 136 -> 212;
               case 137 -> 240;
               case 138 -> 89;
               case 139 -> 105;
               case 140 -> 216;
               case 141 -> 55;
               case 142 -> 2;
               case 143 -> 86;
               case 144 -> 221;
               case 145 -> 62;
               case 146 -> 71;
               case 147 -> 248;
               case 148 -> 112;
               case 149 -> 225;
               case 150 -> 88;
               case 151 -> 65;
               case 152 -> 123;
               case 153 -> 122;
               case 154 -> 118;
               case 155 -> 187;
               case 156 -> 37;
               case 157 -> 138;
               case 158 -> 95;
               case 159 -> 198;
               case 160 -> 142;
               case 161 -> 200;
               case 162 -> 173;
               case 163 -> 19;
               case 164 -> 101;
               case 165 -> 13;
               case 166 -> 206;
               case 167 -> 73;
               case 168 -> 158;
               case 169 -> 210;
               case 170 -> 193;
               case 171 -> 192;
               case 172 -> 32;
               case 173 -> 184;
               case 174 -> 25;
               case 175 -> 175;
               case 176 -> 93;
               case 177 -> 170;
               case 178 -> 178;
               case 179 -> 235;
               case 180 -> 140;
               case 181 -> 52;
               case 182 -> 64;
               case 183 -> 39;
               case 184 -> 190;
               case 185 -> 242;
               case 186 -> 80;
               case 187 -> 211;
               case 188 -> 247;
               case 189 -> 199;
               case 190 -> 177;
               case 191 -> 22;
               case 192 -> 117;
               case 193 -> 209;
               case 194 -> 57;
               case 195 -> 34;
               case 196 -> 181;
               case 197 -> 234;
               case 198 -> 97;
               case 199 -> 222;
               case 200 -> 68;
               case 201 -> 67;
               case 202 -> 27;
               case 203 -> 6;
               case 204 -> 17;
               case 205 -> 11;
               case 206 -> 109;
               case 207 -> 180;
               case 208 -> 79;
               case 209 -> 250;
               case 210 -> 186;
               case 211 -> 201;
               case 212 -> 54;
               case 213 -> 127;
               case 214 -> 90;
               case 215 -> 81;
               case 216 -> 107;
               case 217 -> 214;
               case 218 -> 139;
               case 219 -> 144;
               case 220 -> 61;
               case 221 -> 18;
               case 222 -> 128;
               case 223 -> 66;
               case 224 -> 129;
               case 225 -> 195;
               case 226 -> 238;
               case 227 -> 5;
               case 228 -> 208;
               case 229 -> 110;
               case 230 -> 100;
               case 231 -> 9;
               case 232 -> 166;
               case 233 -> 160;
               case 234 -> 146;
               case 235 -> 130;
               case 236 -> 111;
               case 237 -> 249;
               case 238 -> 43;
               case 239 -> 77;
               case 240 -> 252;
               case 241 -> 145;
               case 242 -> 244;
               case 243 -> 102;
               case 244 -> 168;
               case 245 -> 215;
               case 246 -> 135;
               case 247 -> 116;
               case 248 -> 14;
               case 249 -> 41;
               case 250 -> 243;
               case 251 -> 169;
               case 252 -> 70;
               case 253 -> 114;
               case 254 -> 45;
               default -> 251;
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
   
   public static me.octo.client.IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(me.octo.client.IIlIIlllIIlllIIIIIllIlIIlIIIIIIlllIIIllIIllIlIIIIlIIIIlIIIIlIlIIllllIIlIllIIIIllIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll p0, int p1, int p2, boolean p3, kotlin.Triple p4, int p5, java.lang.Object p6) {
      if ((p5 & 1) != 0) {
         p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }
      if ((p5 & 2) != 0) {
         p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }
      if ((p5 & 4) != 0) {
         p3 = p0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }
      if ((p5 & 8) != 0) {
         p4 = p0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }
      return p0.a(p1, p2, p3, p4);
   }
}
}
