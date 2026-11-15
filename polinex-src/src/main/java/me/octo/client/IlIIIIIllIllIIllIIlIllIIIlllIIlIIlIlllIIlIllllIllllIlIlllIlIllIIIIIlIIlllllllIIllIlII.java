package me.octo.client;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import me.octo.client.utils.player.etherwarp.PolinexGlaciteTunnelEtherwarpCompatibility;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import net.minecraft.network.protocol.game.ServerboundContainerClosePacket;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII
   extends lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll {
    public static <T> T b(Object p0) { return null; } // PX-FIX mr4
    public static <T> T f(Object p0) { return null; } // PX-FIX mr3

   public Object receiver; // PX-FIX kotlin lambda receiver

   @NotNull
   public static IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
   private boolean lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   @Nullable
   private String IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
   @NotNull
   private final Set<Integer> IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
   @NotNull
   private final Set<Integer> lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
   @NotNull
   private final Set<Integer> llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
   @NotNull
   private IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
   @NotNull
   private IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
   private int lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl;
   private int IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll;
   private boolean lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI;
   private int lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII;
   @NotNull
   private final Vec3 lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll;
   @NotNull
   private final IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl;
   @NotNull
   private static IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl;
   private static String[] j;
   private static String[] k;

   public IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII() {
      short var10001 = 7885;
      short var10002 = -2412;
      var10002 = 7875;
      short var10003 = -3952;
      me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      short var10004 = 7903;
      short var10005 = -23384;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         lIIIIlIIIIIIlIIllllIIlllIIlllllIllIIlIIIllllIIlllIlIllIIIIllIlllIlIlIllIIlIIIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         lIIIIlIIIIIIlIIllllIIlllIIlllllIllIIlIIIllllIIlllIlIllIIIIllIlllIlIlIllIIlIIIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c()
      };
      super("Excavator Macro", "Automates the Excavator in the Glacite Tunnels.", var3, "Glacite Tunnels", null, null, false, var1, 112, null);
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = new LinkedHashSet<>();
      this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = new LinkedHashSet<>();
      this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl = new LinkedHashSet<>();
      this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII = IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      this.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI = 200;
      this.IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll = new Vec3(19.4, 121.4, 226.7);
      this.IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl = new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
         new BlockPos(16, 119, 228),
         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
   }

   @Override
   protected void aD() {
      Object receiver = null; // PX-FIX
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var10000 = this;
      short var10001 = 7878;
      short var10002 = -10106;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10000),
         "Excavator travel",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         null,
         5000L,
         false,
         false,
         (kotlin.jvm.functions.Function1)(IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII::b),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = -20772;
                  short var10005 = -7295;
                  var10005 = -20770;
                  short var10006 = -15247;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001x = -20769;
                  short var10002x = -7954;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "\u0005Ü²77;?ófq0¬\u009aÊþ\u0087\u008e9æÇ\u0086\u0097\u009fK\u0099aÊ§\u001c.{æ§\b£\u0099÷\u0099ø\u0091CçÀÚ©Ò²¢'Xf\u001eáÅ`É¤»\u0000\u007f#\u0017\u0094Ë\u0010È/»\u009c¢ºWÃâ~\u0081\u009b\u0098U\u0087#ö¹¯\u009fRBÃê\u0080\u00889\u0012\u0096JU\u0094Û:ÜÓ\u0012|ºÛ~][\u0007H¼Ü?½s>M\u001aYë©éj[\u0017\u0002ê·\u0014N*Ûé\u001aà\u009a\u0088Ò\u001e¦AHw¤0ÅÏ\u008f\u0019";
                  int var4 = "\u0005Ü²77;?ófq0¬\u009aÊþ\u0087\u008e9æÇ\u0086\u0097\u009fK\u0099aÊ§\u001c.{æ§\b£\u0099÷\u0099ø\u0091CçÀÚ©Ò²¢'Xf\u001eáÅ`É¤»\u0000\u007f#\u0017\u0094Ë\u0010È/»\u009c¢ºWÃâ~\u0081\u009b\u0098U\u0087#ö¹¯\u009fRBÃê\u0080\u00889\u0012\u0096JU\u0094Û:ÜÓ\u0012|ºÛ~][\u0007H¼Ü?½s>M\u001aYë©éj[\u0017\u0002ê·\u0014N*Ûé\u001aà\u009a\u0088Ò\u001e¦AHw¤0ÅÏ\u008f\u0019"
                     .length();
                  char var1 = '}';
                  int var0 = -1;

                  while (true) {
                     char[] var10002x;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 104;
                        var10002x = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 104;
                           var10006 = var6;
                        } else {
                           var13 = 104;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 104;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 67;
                              case 1 -> 76;
                              case 2 -> 20;
                              case 3 -> 105;
                              case 4 -> 73;
                              case 5 -> 24;
                              default -> 49;
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
                  int var2 = (var0 ^ -20770) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 148;
                        case 1 -> 5;
                        case 2 -> 79;
                        case 3 -> 243;
                        case 4 -> 240;
                        case 5 -> 235;
                        case 6 -> 3;
                        case 7 -> 223;
                        case 8 -> 230;
                        case 9 -> 204;
                        case 10 -> 152;
                        case 11 -> 170;
                        case 12 -> 247;
                        case 13 -> 32;
                        case 14 -> 117;
                        case 15 -> 89;
                        case 16 -> 126;
                        case 17 -> 111;
                        case 18 -> 208;
                        case 19 -> 236;
                        case 20 -> 200;
                        case 21 -> 220;
                        case 22 -> 238;
                        case 23 -> 227;
                        case 24 -> 44;
                        case 25 -> 156;
                        case 26 -> 147;
                        case 27 -> 70;
                        case 28 -> 92;
                        case 29 -> 177;
                        case 30 -> 45;
                        case 31 -> 228;
                        case 32 -> 175;
                        case 33 -> 246;
                        case 34 -> 143;
                        case 35 -> 232;
                        case 36 -> 55;
                        case 37 -> 41;
                        case 38 -> 167;
                        case 39 -> 213;
                        case 40 -> 141;
                        case 41 -> 199;
                        case 42 -> 17;
                        case 43 -> 102;
                        case 44 -> 157;
                        case 45 -> 81;
                        case 46 -> 43;
                        case 47 -> 0;
                        case 48 -> 203;
                        case 49 -> 165;
                        case 50 -> 133;
                        case 51 -> 226;
                        case 52 -> 83;
                        case 53 -> 136;
                        case 54 -> 172;
                        case 55 -> 47;
                        case 56 -> 189;
                        case 57 -> 166;
                        case 58 -> 74;
                        case 59 -> 90;
                        case 60 -> 105;
                        case 61 -> 87;
                        case 62 -> 35;
                        case 63 -> 118;
                        case 64 -> 103;
                        case 65 -> 37;
                        case 66 -> 197;
                        case 67 -> 212;
                        case 68 -> 53;
                        case 69 -> 188;
                        case 70 -> 225;
                        case 71 -> 30;
                        case 72 -> 138;
                        case 73 -> 255;
                        case 74 -> 95;
                        case 75 -> 23;
                        case 76 -> 214;
                        case 77 -> 251;
                        case 78 -> 29;
                        case 79 -> 7;
                        case 80 -> 75;
                        case 81 -> 84;
                        case 82 -> 49;
                        case 83 -> 15;
                        case 84 -> 54;
                        case 85 -> 97;
                        case 86 -> 209;
                        case 87 -> 224;
                        case 88 -> 11;
                        case 89 -> 173;
                        case 90 -> 85;
                        case 91 -> 38;
                        case 92 -> 150;
                        case 93 -> 100;
                        case 94 -> 249;
                        case 95 -> 31;
                        case 96 -> 25;
                        case 97 -> 78;
                        case 98 -> 119;
                        case 99 -> 109;
                        case 100 -> 179;
                        case 101 -> 116;
                        case 102 -> 57;
                        case 103 -> 50;
                        case 104 -> 128;
                        case 105 -> 124;
                        case 106 -> 99;
                        case 107 -> 174;
                        case 108 -> 244;
                        case 109 -> 132;
                        case 110 -> 233;
                        case 111 -> 42;
                        case 112 -> 146;
                        case 113 -> 187;
                        case 114 -> 72;
                        case 115 -> 36;
                        case 116 -> 183;
                        case 117 -> 64;
                        case 118 -> 242;
                        case 119 -> 178;
                        case 120 -> 193;
                        case 121 -> 12;
                        case 122 -> 110;
                        case 123 -> 19;
                        case 124 -> 4;
                        case 125 -> 123;
                        case 126 -> 121;
                        case 127 -> 63;
                        case 128 -> 202;
                        case 129 -> 219;
                        case 130 -> 104;
                        case 131 -> 21;
                        case 132 -> 93;
                        case 133 -> 122;
                        case 134 -> 168;
                        case 135 -> 181;
                        case 136 -> 20;
                        case 137 -> 215;
                        case 138 -> 1;
                        case 139 -> 125;
                        case 140 -> 56;
                        case 141 -> 171;
                        case 142 -> 106;
                        case 143 -> 201;
                        case 144 -> 112;
                        case 145 -> 252;
                        case 146 -> 192;
                        case 147 -> 218;
                        case 148 -> 113;
                        case 149 -> 69;
                        case 150 -> 216;
                        case 151 -> 48;
                        case 152 -> 185;
                        case 153 -> 58;
                        case 154 -> 46;
                        case 155 -> 217;
                        case 156 -> 139;
                        case 157 -> 149;
                        case 158 -> 129;
                        case 159 -> 221;
                        case 160 -> 86;
                        case 161 -> 253;
                        case 162 -> 164;
                        case 163 -> 101;
                        case 164 -> 154;
                        case 165 -> 14;
                        case 166 -> 248;
                        case 167 -> 210;
                        case 168 -> 222;
                        case 169 -> 67;
                        case 170 -> 40;
                        case 171 -> 26;
                        case 172 -> 144;
                        case 173 -> 114;
                        case 174 -> 24;
                        case 175 -> 77;
                        case 176 -> 205;
                        case 177 -> 66;
                        case 178 -> 239;
                        case 179 -> 158;
                        case 180 -> 229;
                        case 181 -> 145;
                        case 182 -> 140;
                        case 183 -> 195;
                        case 184 -> 135;
                        case 185 -> 6;
                        case 186 -> 51;
                        case 187 -> 176;
                        case 188 -> 60;
                        case 189 -> 161;
                        case 190 -> 159;
                        case 191 -> 231;
                        case 192 -> 65;
                        case 193 -> 61;
                        case 194 -> 16;
                        case 195 -> 190;
                        case 196 -> 186;
                        case 197 -> 18;
                        case 198 -> 134;
                        case 199 -> 94;
                        case 200 -> 8;
                        case 201 -> 194;
                        case 202 -> 28;
                        case 203 -> 180;
                        case 204 -> 107;
                        case 205 -> 39;
                        case 206 -> 131;
                        case 207 -> 207;
                        case 208 -> 115;
                        case 209 -> 169;
                        case 210 -> 33;
                        case 211 -> 196;
                        case 212 -> 155;
                        case 213 -> 27;
                        case 214 -> 191;
                        case 215 -> 76;
                        case 216 -> 237;
                        case 217 -> 142;
                        case 218 -> 250;
                        case 219 -> 120;
                        case 220 -> 153;
                        case 221 -> 108;
                        case 222 -> 52;
                        case 223 -> 160;
                        case 224 -> 163;
                        case 225 -> 127;
                        case 226 -> 198;
                        case 227 -> 91;
                        case 228 -> 254;
                        case 229 -> 241;
                        case 230 -> 130;
                        case 231 -> 137;
                        case 232 -> 68;
                        case 233 -> 96;
                        case 234 -> 88;
                        case 235 -> 73;
                        case 236 -> 245;
                        case 237 -> 206;
                        case 238 -> 10;
                        case 239 -> 184;
                        case 240 -> 34;
                        case 241 -> 13;
                        case 242 -> 2;
                        case 243 -> 22;
                        case 244 -> 62;
                        case 245 -> 98;
                        case 246 -> 234;
                        case 247 -> 71;
                        case 248 -> 182;
                        case 249 -> 82;
                        case 250 -> 162;
                        case 251 -> 9;
                        case 252 -> 151;
                        case 253 -> 59;
                        case 254 -> 211;
                        default -> 80;
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
      var10001 = 7886;
      var10002 = 16012;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10000),
         "Excavator open",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll,
         60000L,
         0L,
         true,
         false,
         null,
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = 13906;
                  short var10005 = -30963;
                  var10005 = 13904;
                  short var10006 = -11398;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = 13907;
                  short var10002 = 4117;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "ñCÕú\u0089Ê¤Ï4\u000fD1\\5$Y,Üà3\u0002\u009aü}R\u0083¡â\u0007Éu¯\u000e\u0003\u0003°´\u00059_\u008f\u001c\u0094+\u0084\bþA\u008brÀ\u0089_ÊêDÇ\u0014ã\u0018ÞPãúhÆ§ß¼LB9u)\rÉ²mB\u0090â±1\u0000W°V=iï>\rö8õ%Ó\u0092.ÇÝR¼' °\u0091+\u0098ã[Ë\u009bÉê\u0012\u007f\nÙ\u0094®¯\u007fs\u0082Ù\u0004\u008b\u0098Z\u0014&\u0010µ\u0016/hâ`ë}è\u0013·Á\u009bYG9";
                  int var4 = "ñCÕú\u0089Ê¤Ï4\u000fD1\\5$Y,Üà3\u0002\u009aü}R\u0083¡â\u0007Éu¯\u000e\u0003\u0003°´\u00059_\u008f\u001c\u0094+\u0084\bþA\u008brÀ\u0089_ÊêDÇ\u0014ã\u0018ÞPãúhÆ§ß¼LB9u)\rÉ²mB\u0090â±1\u0000W°V=iï>\rö8õ%Ó\u0092.ÇÝR¼' °\u0091+\u0098ã[Ë\u009bÉê\u0012\u007f\nÙ\u0094®¯\u007fs\u0082Ù\u0004\u008b\u0098Z\u0014&\u0010µ\u0016/hâ`ë}è\u0013·Á\u009bYG9"
                     .length();
                  char var1 = 20;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 19;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 19;
                           var10006 = var6;
                        } else {
                           var13 = 19;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 19;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 127;
                              case 1 -> 94;
                              case 2 -> 126;
                              case 3 -> 1;
                              case 4 -> 66;
                              case 5 -> 73;
                              default -> 8;
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
                  int var2 = (var0 ^ 13906) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 63;
                        case 1 -> 207;
                        case 2 -> 27;
                        case 3 -> 118;
                        case 4 -> 70;
                        case 5 -> 119;
                        case 6 -> 202;
                        case 7 -> 200;
                        case 8 -> 219;
                        case 9 -> 79;
                        case 10 -> 65;
                        case 11 -> 13;
                        case 12 -> 209;
                        case 13 -> 130;
                        case 14 -> 145;
                        case 15 -> 57;
                        case 16 -> 215;
                        case 17 -> 213;
                        case 18 -> 95;
                        case 19 -> 42;
                        case 20 -> 174;
                        case 21 -> 122;
                        case 22 -> 50;
                        case 23 -> 239;
                        case 24 -> 173;
                        case 25 -> 153;
                        case 26 -> 144;
                        case 27 -> 99;
                        case 28 -> 170;
                        case 29 -> 178;
                        case 30 -> 254;
                        case 31 -> 103;
                        case 32 -> 45;
                        case 33 -> 28;
                        case 34 -> 107;
                        case 35 -> 227;
                        case 36 -> 168;
                        case 37 -> 193;
                        case 38 -> 250;
                        case 39 -> 198;
                        case 40 -> 197;
                        case 41 -> 64;
                        case 42 -> 175;
                        case 43 -> 78;
                        case 44 -> 171;
                        case 45 -> 85;
                        case 46 -> 80;
                        case 47 -> 201;
                        case 48 -> 88;
                        case 49 -> 3;
                        case 50 -> 120;
                        case 51 -> 9;
                        case 52 -> 14;
                        case 53 -> 105;
                        case 54 -> 12;
                        case 55 -> 89;
                        case 56 -> 135;
                        case 57 -> 228;
                        case 58 -> 141;
                        case 59 -> 117;
                        case 60 -> 233;
                        case 61 -> 112;
                        case 62 -> 36;
                        case 63 -> 211;
                        case 64 -> 76;
                        case 65 -> 159;
                        case 66 -> 54;
                        case 67 -> 155;
                        case 68 -> 38;
                        case 69 -> 29;
                        case 70 -> 91;
                        case 71 -> 104;
                        case 72 -> 216;
                        case 73 -> 220;
                        case 74 -> 204;
                        case 75 -> 245;
                        case 76 -> 146;
                        case 77 -> 126;
                        case 78 -> 18;
                        case 79 -> 125;
                        case 80 -> 93;
                        case 81 -> 191;
                        case 82 -> 132;
                        case 83 -> 221;
                        case 84 -> 33;
                        case 85 -> 189;
                        case 86 -> 26;
                        case 87 -> 205;
                        case 88 -> 180;
                        case 89 -> 100;
                        case 90 -> 128;
                        case 91 -> 6;
                        case 92 -> 188;
                        case 93 -> 35;
                        case 94 -> 106;
                        case 95 -> 247;
                        case 96 -> 185;
                        case 97 -> 43;
                        case 98 -> 176;
                        case 99 -> 148;
                        case 100 -> 115;
                        case 101 -> 97;
                        case 102 -> 179;
                        case 103 -> 31;
                        case 104 -> 206;
                        case 105 -> 41;
                        case 106 -> 253;
                        case 107 -> 165;
                        case 108 -> 101;
                        case 109 -> 230;
                        case 110 -> 236;
                        case 111 -> 52;
                        case 112 -> 56;
                        case 113 -> 37;
                        case 114 -> 74;
                        case 115 -> 190;
                        case 116 -> 223;
                        case 117 -> 84;
                        case 118 -> 110;
                        case 119 -> 203;
                        case 120 -> 251;
                        case 121 -> 39;
                        case 122 -> 59;
                        case 123 -> 86;
                        case 124 -> 17;
                        case 125 -> 109;
                        case 126 -> 199;
                        case 127 -> 196;
                        case 128 -> 150;
                        case 129 -> 154;
                        case 130 -> 96;
                        case 131 -> 129;
                        case 132 -> 123;
                        case 133 -> 55;
                        case 134 -> 121;
                        case 135 -> 69;
                        case 136 -> 137;
                        case 137 -> 229;
                        case 138 -> 73;
                        case 139 -> 186;
                        case 140 -> 82;
                        case 141 -> 46;
                        case 142 -> 8;
                        case 143 -> 113;
                        case 144 -> 0;
                        case 145 -> 181;
                        case 146 -> 172;
                        case 147 -> 72;
                        case 148 -> 151;
                        case 149 -> 16;
                        case 150 -> 183;
                        case 151 -> 49;
                        case 152 -> 232;
                        case 153 -> 40;
                        case 154 -> 116;
                        case 155 -> 15;
                        case 156 -> 241;
                        case 157 -> 24;
                        case 158 -> 161;
                        case 159 -> 20;
                        case 160 -> 187;
                        case 161 -> 61;
                        case 162 -> 68;
                        case 163 -> 164;
                        case 164 -> 208;
                        case 165 -> 11;
                        case 166 -> 255;
                        case 167 -> 47;
                        case 168 -> 160;
                        case 169 -> 1;
                        case 170 -> 94;
                        case 171 -> 156;
                        case 172 -> 210;
                        case 173 -> 124;
                        case 174 -> 182;
                        case 175 -> 249;
                        case 176 -> 158;
                        case 177 -> 166;
                        case 178 -> 48;
                        case 179 -> 22;
                        case 180 -> 90;
                        case 181 -> 83;
                        case 182 -> 184;
                        case 183 -> 131;
                        case 184 -> 167;
                        case 185 -> 58;
                        case 186 -> 244;
                        case 187 -> 77;
                        case 188 -> 34;
                        case 189 -> 157;
                        case 190 -> 66;
                        case 191 -> 133;
                        case 192 -> 4;
                        case 193 -> 162;
                        case 194 -> 30;
                        case 195 -> 163;
                        case 196 -> 32;
                        case 197 -> 19;
                        case 198 -> 127;
                        case 199 -> 152;
                        case 200 -> 60;
                        case 201 -> 149;
                        case 202 -> 114;
                        case 203 -> 102;
                        case 204 -> 136;
                        case 205 -> 53;
                        case 206 -> 108;
                        case 207 -> 23;
                        case 208 -> 138;
                        case 209 -> 194;
                        case 210 -> 147;
                        case 211 -> 169;
                        case 212 -> 224;
                        case 213 -> 142;
                        case 214 -> 5;
                        case 215 -> 248;
                        case 216 -> 225;
                        case 217 -> 62;
                        case 218 -> 238;
                        case 219 -> 98;
                        case 220 -> 44;
                        case 221 -> 222;
                        case 222 -> 252;
                        case 223 -> 177;
                        case 224 -> 243;
                        case 225 -> 139;
                        case 226 -> 140;
                        case 227 -> 21;
                        case 228 -> 71;
                        case 229 -> 67;
                        case 230 -> 212;
                        case 231 -> 246;
                        case 232 -> 10;
                        case 233 -> 81;
                        case 234 -> 25;
                        case 235 -> 92;
                        case 236 -> 214;
                        case 237 -> 240;
                        case 238 -> 242;
                        case 239 -> 111;
                        case 240 -> 195;
                        case 241 -> 2;
                        case 242 -> 234;
                        case 243 -> 134;
                        case 244 -> 87;
                        case 245 -> 226;
                        case 246 -> 143;
                        case 247 -> 231;
                        case 248 -> 217;
                        case 249 -> 51;
                        case 250 -> 235;
                        case 251 -> 237;
                        case 252 -> 75;
                        case 253 -> 7;
                        case 254 -> 192;
                        default -> 218;
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
      var10001 = 7882;
      var10002 = 32684;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10000),
         "Excavator GUI",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI,
         60000L,
         0L,
         true,
         false,
         null,
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = -12136;
                  short var10005 = -27915;
                  var10005 = -12134;
                  short var10006 = -5420;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = -12135;
                  short var10002 = 22025;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "æ`Á9\u00857m\u009d\u000e³¤(Å^ú7\u0001¶Ëû\u0002Q$}\b}\u001c\u009a>C\u001a\u0013àby\u0012~\u0019\u008dßï«\u0016X\u009c\u008bþÇ,,±\n\u009c¹d\u008d\u0098¨@b©éªCÄ¹ß3Evóû\u000b\u009cÁ\u0089\u008cë\u0000\bG¡s¥\u0091\u0081Æöx`»rÃ\u009f¾ÒLËSi:jCÖx\u0000\u001fu¤+*u;\u009b¶µ÷\boZý>øB\u0084XJ>\u0019\u0001'»Ñ\u0088«À2\u001cÝ\u0093Db|\u000b/ú#åó";
                  int var4 = "æ`Á9\u00857m\u009d\u000e³¤(Å^ú7\u0001¶Ëû\u0002Q$}\b}\u001c\u009a>C\u001a\u0013àby\u0012~\u0019\u008dßï«\u0016X\u009c\u008bþÇ,,±\n\u009c¹d\u008d\u0098¨@b©éªCÄ¹ß3Evóû\u000b\u009cÁ\u0089\u008cë\u0000\bG¡s¥\u0091\u0081Æöx`»rÃ\u009f¾ÒLËSi:jCÖx\u0000\u001fu¤+*u;\u009b¶µ÷\boZý>øB\u0084XJ>\u0019\u0001'»Ñ\u0088«À2\u001cÝ\u0093Db|\u000b/ú#åó"
                     .length();
                  char var1 = 20;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 4;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 4;
                           var10006 = var6;
                        } else {
                           var13 = 4;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 4;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 44;
                              case 1 -> 70;
                              case 2 -> 23;
                              case 3 -> 80;
                              case 4 -> 20;
                              case 5 -> 19;
                              default -> 127;
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
                  int var2 = (var0 ^ -12136) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 42;
                        case 1 -> 255;
                        case 2 -> 166;
                        case 3 -> 94;
                        case 4 -> 212;
                        case 5 -> 172;
                        case 6 -> 243;
                        case 7 -> 62;
                        case 8 -> 189;
                        case 9 -> 155;
                        case 10 -> 210;
                        case 11 -> 24;
                        case 12 -> 35;
                        case 13 -> 251;
                        case 14 -> 41;
                        case 15 -> 4;
                        case 16 -> 126;
                        case 17 -> 115;
                        case 18 -> 20;
                        case 19 -> 107;
                        case 20 -> 137;
                        case 21 -> 182;
                        case 22 -> 183;
                        case 23 -> 158;
                        case 24 -> 149;
                        case 25 -> 84;
                        case 26 -> 225;
                        case 27 -> 53;
                        case 28 -> 138;
                        case 29 -> 73;
                        case 30 -> 177;
                        case 31 -> 7;
                        case 32 -> 140;
                        case 33 -> 95;
                        case 34 -> 203;
                        case 35 -> 5;
                        case 36 -> 87;
                        case 37 -> 28;
                        case 38 -> 112;
                        case 39 -> 227;
                        case 40 -> 114;
                        case 41 -> 154;
                        case 42 -> 90;
                        case 43 -> 217;
                        case 44 -> 33;
                        case 45 -> 161;
                        case 46 -> 122;
                        case 47 -> 100;
                        case 48 -> 49;
                        case 49 -> 152;
                        case 50 -> 110;
                        case 51 -> 30;
                        case 52 -> 31;
                        case 53 -> 151;
                        case 54 -> 215;
                        case 55 -> 233;
                        case 56 -> 134;
                        case 57 -> 75;
                        case 58 -> 56;
                        case 59 -> 219;
                        case 60 -> 88;
                        case 61 -> 241;
                        case 62 -> 123;
                        case 63 -> 153;
                        case 64 -> 236;
                        case 65 -> 168;
                        case 66 -> 43;
                        case 67 -> 98;
                        case 68 -> 106;
                        case 69 -> 163;
                        case 70 -> 186;
                        case 71 -> 97;
                        case 72 -> 237;
                        case 73 -> 132;
                        case 74 -> 141;
                        case 75 -> 64;
                        case 76 -> 109;
                        case 77 -> 45;
                        case 78 -> 167;
                        case 79 -> 71;
                        case 80 -> 119;
                        case 81 -> 93;
                        case 82 -> 175;
                        case 83 -> 108;
                        case 84 -> 234;
                        case 85 -> 78;
                        case 86 -> 144;
                        case 87 -> 17;
                        case 88 -> 202;
                        case 89 -> 150;
                        case 90 -> 146;
                        case 91 -> 80;
                        case 92 -> 164;
                        case 93 -> 105;
                        case 94 -> 222;
                        case 95 -> 121;
                        case 96 -> 218;
                        case 97 -> 249;
                        case 98 -> 148;
                        case 99 -> 195;
                        case 100 -> 135;
                        case 101 -> 228;
                        case 102 -> 11;
                        case 103 -> 159;
                        case 104 -> 235;
                        case 105 -> 10;
                        case 106 -> 60;
                        case 107 -> 247;
                        case 108 -> 239;
                        case 109 -> 54;
                        case 110 -> 127;
                        case 111 -> 129;
                        case 112 -> 32;
                        case 113 -> 204;
                        case 114 -> 192;
                        case 115 -> 118;
                        case 116 -> 178;
                        case 117 -> 231;
                        case 118 -> 50;
                        case 119 -> 176;
                        case 120 -> 245;
                        case 121 -> 0;
                        case 122 -> 208;
                        case 123 -> 248;
                        case 124 -> 229;
                        case 125 -> 207;
                        case 126 -> 117;
                        case 127 -> 68;
                        case 128 -> 252;
                        case 129 -> 52;
                        case 130 -> 184;
                        case 131 -> 205;
                        case 132 -> 201;
                        case 133 -> 116;
                        case 134 -> 244;
                        case 135 -> 242;
                        case 136 -> 221;
                        case 137 -> 130;
                        case 138 -> 86;
                        case 139 -> 19;
                        case 140 -> 77;
                        case 141 -> 25;
                        case 142 -> 216;
                        case 143 -> 223;
                        case 144 -> 47;
                        case 145 -> 160;
                        case 146 -> 220;
                        case 147 -> 196;
                        case 148 -> 92;
                        case 149 -> 157;
                        case 150 -> 81;
                        case 151 -> 102;
                        case 152 -> 58;
                        case 153 -> 171;
                        case 154 -> 69;
                        case 155 -> 61;
                        case 156 -> 70;
                        case 157 -> 99;
                        case 158 -> 162;
                        case 159 -> 85;
                        case 160 -> 185;
                        case 161 -> 170;
                        case 162 -> 224;
                        case 163 -> 187;
                        case 164 -> 199;
                        case 165 -> 193;
                        case 166 -> 250;
                        case 167 -> 197;
                        case 168 -> 2;
                        case 169 -> 206;
                        case 170 -> 44;
                        case 171 -> 1;
                        case 172 -> 139;
                        case 173 -> 38;
                        case 174 -> 174;
                        case 175 -> 36;
                        case 176 -> 67;
                        case 177 -> 211;
                        case 178 -> 165;
                        case 179 -> 254;
                        case 180 -> 91;
                        case 181 -> 136;
                        case 182 -> 246;
                        case 183 -> 156;
                        case 184 -> 12;
                        case 185 -> 48;
                        case 186 -> 226;
                        case 187 -> 120;
                        case 188 -> 82;
                        case 189 -> 145;
                        case 190 -> 194;
                        case 191 -> 40;
                        case 192 -> 74;
                        case 193 -> 103;
                        case 194 -> 8;
                        case 195 -> 22;
                        case 196 -> 13;
                        case 197 -> 66;
                        case 198 -> 72;
                        case 199 -> 181;
                        case 200 -> 147;
                        case 201 -> 57;
                        case 202 -> 18;
                        case 203 -> 173;
                        case 204 -> 37;
                        case 205 -> 125;
                        case 206 -> 79;
                        case 207 -> 213;
                        case 208 -> 59;
                        case 209 -> 214;
                        case 210 -> 232;
                        case 211 -> 104;
                        case 212 -> 89;
                        case 213 -> 133;
                        case 214 -> 29;
                        case 215 -> 6;
                        case 216 -> 3;
                        case 217 -> 14;
                        case 218 -> 46;
                        case 219 -> 15;
                        case 220 -> 101;
                        case 221 -> 39;
                        case 222 -> 128;
                        case 223 -> 124;
                        case 224 -> 131;
                        case 225 -> 190;
                        case 226 -> 76;
                        case 227 -> 34;
                        case 228 -> 200;
                        case 229 -> 111;
                        case 230 -> 9;
                        case 231 -> 83;
                        case 232 -> 27;
                        case 233 -> 65;
                        case 234 -> 179;
                        case 235 -> 55;
                        case 236 -> 142;
                        case 237 -> 51;
                        case 238 -> 16;
                        case 239 -> 26;
                        case 240 -> 169;
                        case 241 -> 230;
                        case 242 -> 180;
                        case 243 -> 209;
                        case 244 -> 23;
                        case 245 -> 143;
                        case 246 -> 63;
                        case 247 -> 198;
                        case 248 -> 113;
                        case 249 -> 21;
                        case 250 -> 253;
                        case 251 -> 191;
                        case 252 -> 188;
                        case 253 -> 238;
                        case 254 -> 96;
                        default -> 240;
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
      Object var2 = null; // PX-FIX
      Object IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll = null; // PX-FIX
      int var1;
      label82: {
         PolinexGlaciteTunnelEtherwarpCompatibility.markActive("Excavator Macro");
         var1 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
         int var10000 = ((int[])IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII)[this.W()
            .ordinal()];
         if (var1 != 0) {
            switch (var10000) {
               case 1:
                  var10000 = ((this.aK()) ? 1 : 0);
                  break;
               case 2:
                  break label82;
               default:
                  return;
            }
         }

         label83: {
            if (var1 != 0) {
               if (var10000 == 0) {
                  return;
               }

               var2 = this;
               if (var1 == 0) {
                  break label83;
               }

               var10000 = ((int[])IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)[this.aJ()
                  .a()
                  .ordinal()];
            }

            if (var10000 != 1) {
               return;
            }

            var2 = this;
         }

         this.bq();
         if (var1 != 0) {
            return;
         }
      }

      int var3 = lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a(
         this, this.IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl, 1.5, null);
      if (var1 != 0) {
         if ((var3 != 0)) {
            var3 = ((IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
               .e()
               .d()) ? 1 : 0);
            if (var1 != 0) {
               if (var3 == 0) {
                  IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                     .e()
                     .k();
               }

               me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.a(
                  this.lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll
               );
               double var5;
               var3 = (
                        var5 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .d(this.lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll)
                           - 1.0
                     )
                     == 0.0
                  ? 0
                  : (var5 < 0.0 ? -1 : 1);
            }

            if (var1 != 0) {
               if (var3 >= 0) {
                  return;
               }

               var3 = ((java.util.function.Supplier<Integer>)(() -> { this.IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII.a(1000); return 0; })).get();
            }

            if (var1 != 0) {
               if (var3 == 0) {
                  return;
               }

               var3 = ((me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .j()) ? 1 : 0);
            }

            if (var3 != 0) {
               this.IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII.f();
            }

            return;
         }

         var3 = ((IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .e()
            .d()) ? 1 : 0);
      }

      if (var1 != 0 && (var3 != 0)) {
         IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
            ((BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
               .e())),
            ((IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll)(Object)(this.IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl.a())),
            0,
            false);
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI var1) {
      Object var48 = null; // PX-FIX
      Object var42 = null; // PX-FIX
      Object var36 = null; // PX-FIX
      Object var33 = null; // PX-FIX
      Object var32 = null; // PX-FIX
      Object var31 = null; // PX-FIX
      Object var30 = null; // PX-FIX
      Object var29 = null; // PX-FIX
      Object var18 = null; // PX-FIX
      Object IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll = null; // PX-FIX
      int var10000 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      short var10002 = 7887;
      short var10003 = 13811;
      Intrinsics.checkNotNullParameter(var1, "event");
      int var2 = var10000;
      IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII var14 = this;
      if (var2 != 0) {
         if (this.W()
            == IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll
            )
          {
            this.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI = false;
            this.a(
               IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI
            );
            this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII = IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            a(this, 0, 1, null);
            return;
         }

         var14 = this;
      }

      label306: {
         IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var15 = var14.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
         IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var10001 = IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if (var2 != 0) {
            if (var14.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII
               == IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               )
             {
               List var16 = var1.m();
               if (var16 == null) {
                  return;
               }

               label309: {
                  List var3;
                  label310: {
                     label311: {
                        label289: {
                           var3 = var16;
                           var10000 = ((java.util.function.Supplier<Integer>)(() -> { this.IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII
                              .a(this.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI); return 0; })).get();
                           if (var2 != 0) {
                              if (var10000 == 0) {
                                 return;
                              }

                              var18 = this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
                              if (var2 == 0) {
                                 break label289;
                              }

                              var10000 = ((int[])IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl)[this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII
                                 .ordinal()];
                           }

                           switch (var10000) {
                              case 1:
                                 var18 = var3.get(12);
                                 break;
                              case 2:
                                 break label311;
                              case 3:
                                 break label310;
                              default:
                                 break label309;
                           }
                        }

                        Slot var6 = (Slot)var18;
                        boolean var19 = var6.hasItem();
                        if (var2 != 0) {
                           if (!var19) {
                              return;
                           }

                           me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var20 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                           String var50 = var6.getItem().getHoverName().getString();
                           var10003 = 7874;
                           short var10004 = 29310;
                           Intrinsics.checkNotNullExpressionValue(var50, "getString(...)");
                           CharSequence var21 = var20.a(var50);
                           short var51 = 7877;
                           var10002 = -8420;
                           var19 = StringsKt.contains(var21, "Scrap", false);
                        }

                        if (!var19) {
                           return;
                        }

                        this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII = IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                        if (var2 != 0) {
                           return;
                        }
                     }

                     Slot var11 = (Slot)var3.get(14);
                     int var22 = ((var11.hasItem()) ? 1 : 0);
                     if (var2 != 0) {
                        if ((var22 == 0)) {
                           return;
                        }

                        me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var23 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                        String var52 = var11.getItem().getHoverName().getString();
                        var10003 = 7874;
                        short var73 = 29310;
                        Intrinsics.checkNotNullExpressionValue(var52, "getString(...)");
                        CharSequence var24 = var23.a(var52);
                        short var53 = 7872;
                        var10002 = -22863;
                        var22 = ((StringsKt.contains(var24, "Chisel", false)) ? 1 : 0);
                     }

                     if ((var22 == 0)) {
                        return;
                     }

                     ItemStack var25 = var11.getItem();
                     if (var25 == null) {
                        return;
                     }

                     Component var26 = var25.getHoverName();
                     if (var26 == null) {
                        return;
                     }

                     String var27 = var26.getString();
                     String var54 = var27;
                     if (var2 != 0) {
                        if (var27 == null) {
                           return;
                        }

                        var27 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .a(var27);
                        var54 = var27;
                     }

                     if (var54 == null) {
                        return;
                     }

                     label270: {
                        label269: {
                           label268: {
                              label267: {
                                 label266: {
                                    label313: {
                                       String var7 = var27;
                                       var22 = var7.hashCode();
                                       if (var2 != 0) {
                                          switch (var22) {
                                             case -1479724914:
                                                short var58 = 7881;
                                                var10002 = 25928;
                                                var32 = var7.equals("Glacite-Plated Chisel");
                                                if (var2 == 0) {
                                                   break label268;
                                                }

                                                if (!((Boolean)var32)) {
                                                   var32 = 20;
                                                   break label268;
                                                }
                                                break label313;
                                             case 162984133:
                                                short var57 = 7876;
                                                var10002 = 15200;
                                                var31 = var7.equals("Reinforced Chisel");
                                                if (var2 == 0) {
                                                   break label267;
                                                }

                                                if (!((Boolean)var31)) {
                                                   var31 = 18;
                                                   break label267;
                                                }
                                                break label313;
                                             case 1304129769:
                                                short var56 = 7891;
                                                var10002 = 9415;
                                                var22 = ((var7.equals("Perfect Chisel")) ? 1 : 0);
                                                break;
                                             case 2017441110:
                                                short var55 = 7892;
                                                var10002 = 24230;
                                                var29 = var7.equals("Chisel");
                                                if (var2 == 0) {
                                                   break label266;
                                                }

                                                if (!((Boolean)var29)) {
                                                   var29 = 16;
                                                   break label266;
                                                }
                                             default:
                                                break label313;
                                          }
                                       }

                                       if (var2 == 0) {
                                          break label269;
                                       }

                                       if (var22 != 0) {
                                          var22 = 22;
                                          break label269;
                                       }
                                    }

                                    var30 = null;
                                    break label270;
                                 }

                                 var30 = Integer.valueOf(String.valueOf(var29));
                                 break label270;
                              }

                              var30 = Integer.valueOf(String.valueOf(var31));
                              break label270;
                           }

                           var30 = Integer.valueOf(String.valueOf(var32));
                           break label270;
                        }

                        var30 = var22;
                     }

                     if (var30 == null) {
                        return;
                     }

                     int var8 =((Integer)( var30));
                     this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll = var8;
                     this.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl = var8;
                     this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII = IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                     a(this, 0, 1, null);
                     if (var2 != 0) {
                        return;
                     }
                  }

                  Slot var12 = (Slot)var3.get(31);
                  if (var2 != 0) {
                     if (!var12.hasItem()) {
                        return;
                     }

                     me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a(31, 0, ContainerInput.PICKUP);
                     a(this, 0, 1, null);
                     this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII = IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
                     this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                     this.a(-1);
                     this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = false;
                  }

                  this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = null;
               }

               if (var2 != 0) {
                  return;
               }
            }

            var33 = this;
            if (var2 == 0) {
               break label306;
            }

            var15 = this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
            var10001 = IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         if (var15 != var10001) {
            return;
         }

         var33 = this;
      }

      if (this.IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII
         .a((Number)Integer.valueOf(this.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI))) {
         List var34 = var1.m();
         if (var34 != null) {
            label324: {
               List var10 = var34;
               var10000 = this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll;
               if (var2 != 0) {
                  if (this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll == 0) {
                     this.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI = true;
                     if (var2 != 0) {
                        LocalPlayer var49 = this.ap().player;
                        if (var49 != null) {
                           var49.closeContainer();
                        }
                     }

                     return;
                  }

                  var36 = this;
                  if (var2 == 0) {
                     break label324;
                  }

                  var10000 = this.a9();
               }

               if (var10000 == -1) {
                  this.bp();
                  int var37 = ((this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll.isEmpty()) ? 1 : 0);
                  if (var2 != 0) {
                     var37 = (((var37 == 0) ? 1 : 0));
                  }

                  if ((var37 != 0)) {
                     var37 = ((Number)CollectionsKt.random(
                           this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll, (Random)Random.Default
                        ))
                        .intValue();
                  } else {
                     int var74 = this.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl;
                     if (var2 != 0) {
                        var74 = this.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl < 18 ? 1 : 0;
                     }

                     Integer var39 = me.octo.client.utils.IIIlIllIIIllllllIllllIIIlIllIllIllIIIIlllllllIIIIlllllIllIIIIlIIlIIIIIlIlllllIlIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(
                           this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI,
                           this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl,
                           this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll,
                           ((((((Boolean)(Object)((boolean)(var74 != 0)
                          ? 1 : 0))) ? 1 : 0)!= 0)));
                     if (var39 != null) {
                        var37 = var39;
                     } else {
                        boolean var40 = this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl.isEmpty();
                        if (var2 != 0) {
                           var40 = !var40;
                        }

                        if (!var40) {
                           return;
                        }

                        var37 = ((Number)CollectionsKt.random(
                              this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl, (Random)Random.Default
                           ))
                           .intValue();
                     }
                  }

                  int var4;
                  label193: {
                     var4 = var37;
                     if (var2 != 0) {
                        Slot var41 = (Slot)CollectionsKt.getOrNull(var10, var4);
                        if (var41 != null) {
                           var42 = var41.getItem();
                           break label193;
                        }
                     }

                     var42 = null;
                  }

                  label187: {
                     ItemStack var5 =((ItemStack)( var42));
                     if (var2 != 0) {
                        if (var5 != null && var5.getHoverName() != null) {
                           me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var43 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                           String var59 = var5.getHoverName().getString();
                           var10003 = 7874;
                           short var75 = 29310;
                           Intrinsics.checkNotNullExpressionValue(var59, "getString(...)");
                           CharSequence var44 = var43.a(var59);
                           short var60 = 7879;
                           var10002 = -5440;
                           var37 = ((StringsKt.contains(var44, "Dirt", false)) ? 1 : 0);
                           if (var2 == 0) {
                              break label187;
                           }

                           if (var37 == 0) {
                              this.a(-1);
                              a(this, 0, 1, null);
                              return;
                           }
                        }

                        me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .a(var4, 0, ContainerInput.PICKUP);
                     }

                     var37 = this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll;
                  }

                  int var13 = var37;
                  this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll = var13 + -1;
                  this.a(var4);
                  a(this, 0, 1, null);
                  if (var2 != 0) {
                     return;
                  }
               }

               var36 = var10.get(this.a9());
            }

            label174: {
               ItemStack var46 = ((Slot)var36).getItem();
               if (var46 != null) {
                  Component var47 = var46.getHoverName();
                  label172:
                  if (var47 != null) {
                     var48 = var47.getString();
                     if (var2 != 0) {
                        if (var48 == null) {
                           break label172;
                        }

                        var48 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                    .aPX(var48);
                     }

                     if (var2 != 0) {
                        break label174;
                     }
                  }
               }

               var48 = null;
            }

            short var61 = 7895;
            var10002 = -1351;
            if (!Intrinsics.areEqual(var48, "Dirt")) {
               this.a(-1);
            }
         }
      }
   }

   @SubscribeEvent
   public final void c(@NotNull me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      short var10001 = 7893;
      short var10002 = -28700;
      Intrinsics.checkNotNullParameter(var1, "event");
      int var10000 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      Packet var3 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      int var2 = var10000;
      boolean var5 = var3 instanceof ClientboundSystemChatPacket;
      if (var2 == 0) {
         if (!var5) {
            return;
         }

         var5 = ((ClientboundSystemChatPacket)var3).overlay();
      }

      if (!var5) {
         label28: {
            me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var6 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            String var9 = ((ClientboundSystemChatPacket)var3).content().getString();
            short var10003 = 7890;
            short var10004 = 28457;
            Intrinsics.checkNotNullExpressionValue(var9, "getString(...)");
            String var4 = var6.a(var9);
            var5 = StringsKt.startsWith(var4, "[", false);
            label27:
            if (var2 == 0) {
               if (!var5) {
                  CharSequence var8 = var4;
                  var10001 = 7894;
                  var10002 = -14477;
                  var5 = StringsKt.contains(var8, "EXCAVATION COMPLETE", false);
                  if (var2 != 0) {
                     break label27;
                  }

                  if (var5) {
                     break label28;
                  }
               }

               var10001 = 7883;
               var10002 = -6118;
               var5 = StringsKt.startsWith(var4, "You didn't find anything. Maybe next time", false);
            }

            if (!var5) {
               return;
            }
         }

         this.bq();
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI var1) {
      Object var5 = null; // PX-FIX
      int var2 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      me.octo.client.events.impl.IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI var10000 = var1;
      if (var2 == 0) {
         short var10001 = 7887;
         short var10002 = 13811;
         Intrinsics.checkNotNullParameter(var1, "event");
         if (this.W()
            != IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI
            )
          {
            return;
         }

         var10000 = var1;
      }

      label33: {
         Packet var3 = var10000.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         boolean var4 = var3 instanceof ServerboundContainerClosePacket;
         if (var2 == 0) {
            if (!var4) {
               return;
            }

            var5 = this;
            if (var2 != 0) {
               break label33;
            }

            var4 = this.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI;
         }

         if (var4) {
            return;
         }

         short var6 = 7884;
         short var7 = 3824;
         this.a(
            "Detected a manual exit",
            me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         );
         var5 = this;
      }

      this.N();
   }

   private final void bp() {
      Object var27 = null; // PX-FIX
      this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI.clear();
      this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl.clear();
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll.clear();
      short var10002 = 7880;
      short var10003 = -6292;
      Regex var2 = new Regex("\\b(100\\.0|[0-9]{1,2}(\\.\\d+)?)\\b(?=%)");
      int var10000 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      Iterator var3 = me.octo.client.utils.player.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .i()
         .iterator();
      int var1 = var10000;

      label110:
      while (true) {
         boolean var22 = var3.hasNext();

         label108:
         while (var22) {
            ItemStack var5;
            boolean var9;
            label89: {
               Slot var4 = (Slot)var3.next();
               ItemStack var23 = var4.getItem();
               var10002 = 7888;
               var10003 = -13333;
               Intrinsics.checkNotNullExpressionValue(var23, "getItem(...)");
               var5 = var23;
               int var6 = var4.getContainerSlot();
               me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var24 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
               String var10001 = var5.getHoverName().getString();
               var10003 = 7874;
               short var10004 = 29310;
               Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
               String var7 = var24.a(var10001);
               short var36 = 7895;
               var10002 = -1351;
               boolean var8 = Intrinsics.areEqual(var7, "Dirt");
               short var37 = 7901;
               var10002 = -17430;
               var9 = Intrinsics.areEqual(var7, "Fossil");
               var22 = var8;
               if (var1 == 0) {
                  if (var8) {
                     label115: {
                        me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var26 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                        ItemStack var38 = var4.getItem();
                        var10003 = 7873;
                        var10004 = -15661;
                        Intrinsics.checkNotNullExpressionValue(var38, "getItem(...)");
                        var var11 = var26.d(var38);
                        boolean var12 = false;
                        var27 = var11;
                        label83:
                        if (var1 == 0) {
                           if (var11 instanceof Collection) {
                              var27 = (Collection)var11;
                              if (var1 != 0) {
                                 break label83;
                              }

                              if (((me.octo.client.PXDyn)var27).isEmpty()) {
                                 var22 = false;
                                 break label115;
                              }
                           }

                           var27 = var11;
                        }

                        Iterator var13 = ((me.octo.client.PXDyn)var27).iterator();

                        label74:
                        while (true) {
                           if (!var13.hasNext()) {
                              var22 = false;
                              break;
                           }

                           Object var14 = var13.next();
                           Component var15 = (Component)var14;
                           boolean var16 = false;
                           me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var29 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                           var10001 = var15.getString();
                           var10003 = 7874;
                           var10004 = 29310;
                           Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
                           CharSequence var30 = var29.a(var10001);
                           short var40 = 7900;
                           var10002 = 20999;
                           var22 = StringsKt.contains(var30, "highlighted", false);

                           while (var22) {
                              var22 = true;
                              if (var1 == 0) {
                                 break label74;
                              }
                           }
                        }
                     }

                     boolean var10 = var22;
                     if (var1 == 0) {
                        if (var10) {
                           this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll.add(var6);
                        } else {
                           this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl.add(var6);
                        }
                     }
                     break label89;
                  }

                  var22 = var9;
               }

               if (var1 == 0) {
                  if (!var22) {
                     continue label110;
                  }

                  this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI.add(var6);
               }
            }

            var22 = var9;
            if (var1 == 0) {
               if (!var9) {
                  continue label110;
               }

               var22 = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
            }

            if (var22) {
               continue label110;
            }

            List var17 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .d(var5);
            Iterator var18 = var17.iterator();

            while (true) {
               var22 = var18.hasNext();

               String var20;
               do {
                  if (!var22) {
                     continue label110;
                  }

                  Component var19 = (Component)var18.next();
                  me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var32 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                  String var41 = var19.getString();
                  var10003 = 7874;
                  short var55 = 29310;
                  Intrinsics.checkNotNullExpressionValue(var41, "getString(...)");
                  var20 = var32.a(var41);
                  CharSequence var33 = var20;
                  short var42 = 7889;
                  var10002 = -6202;
                  var22 = StringsKt.contains(var33, "Fossil Excavation Progress:", false);
                  if (var1 != 0) {
                     continue label108;
                  }
               } while (var1 != 0);

               if (var22) {
                  MatchResult var34 = (var2).find( var20, 0);
                  if (var34 != null) {
                     String var35 = var34.getValue();
                     if (var35 != null) {
                        String var21 = var35;
                        this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = true;
                        this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = var21 + "%";
                        if (var1 != 0) {
                           return;
                        }
                     }
                  }
               }
            }
         }

         return;
      }
   }

   // W8-3 backfill: compiler-synthesised static accessors (jar flags 0x1019 ACC_PUBLIC|STATIC|FINAL|SYNTHETIC)
   public static final IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII bs() {
      return IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl;
   }

   public static final void a(IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII var0, IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      var0.a(var1);
   }

   // W8-3 backfill: Kotlin default-argument mask bridge (jar flags 0x1008 ACC_STATIC|SYNTHETIC)
   static void a(IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII var0, int var1, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         var1 = lIIIIlIIIIIIlIIllllIIlllIIlllllIllIIlIIIllllIIlllIlIllIIIIllIlllIlIlIllIIlIIIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c().O();
      }

      var0.e(var1);
   }

   private final void e(int var1) {
      this.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI = var1 + Random.Default.nextInt(200);
      this.IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII.f();
   }

   private final void bq() {
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll
      );
   }

   private final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      this.ae()
         .a(
            new lllIllIIllIIIIIIIlIIlIIIIIllllIlIIIIIllllIIlIIIIlllIIIIIIlIIIIlIlIIIIllIIllIIlllIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl,
               (kotlin.jvm.functions.Function0)(() -> e(this)),
               var1.d(),
               5000,
               2000,
               30000L,
               3,
               (kotlin.jvm.functions.Function0)(() -> f(this))
            )
         );
   }

   private final void br() {
      int var10000 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      this.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI = true;
      int var1 = var10000;
      if (var1 == 0) {
         LocalPlayer var2 = this.ap().player;
         if (var2 != null) {
            var2.closeContainer();
         }
      }

      this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII = IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      this.a(-1);
      this.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl = 0;
      this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll = 0;
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = false;
      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = null;
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll.clear();
      this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI.clear();
      this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl.clear();
      this.aO();
   }

   @Override
   public void ba() {
      label16: {
         int var1 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
         if (var1 != 0) {
            if (!(
               me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(this.lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll, true)
                  < 4.0
            )) {
               break label16;
            }

            this.bq();
         }

         if (var1 != 0) {
            return;
         }
      }

      this.a(
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl,
         2000
      );
   }

   @Override
   public void M() {
      int var1;
      boolean var3;
      int var4;
      var4 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      this.aM();
      var1 = var4;
      boolean var2 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .v()
         != null;
      var3 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
         == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
      var4 =(( var2) ? 1 : 0);
      label38:
      if (var1 != 0) {
         if (var2) {
            var4 =(( var3) ? 1 : 0);
            if (var1 == 0) {
               break label38;
            }

            if (var3) {
               super.M();
               this.a(CollectionsKt.emptyList());
               this.ba();
               return;
            }
         }

         var4 =(( var2) ? 1 : 0);
      }

      if (var1 != 0) {
         if ((var4 == 0)) {
            this.bc();
         }

         var4 =(( var3) ? 1 : 0);
      }

      if ((var4 == 0)) {
         this.b(
            CollectionsKt.listOf(
               IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            )
         );
      }

      this.N();
   }

   private static final long a(IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII var0) {
      return var0.aJ().b() + 15000L;
   }

   private static final Object b(IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII var0) {
      return TuplesKt.to(
         var0.aJ().a(),
         IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
      );
   }

   private static final Object c(IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII var0) {
      String var3;
      IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var10000;
      Triple var10002;
      boolean var10003;
      label18: {
         int var1 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
         var10002 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(var0, 0.0, 1, null);
         var10003 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .e()
            .d();
         Screen var10004 = var0.ap().screen;
         if (var10004 != null) {
            Component var2 = var10004.getTitle();
            if (var2 != null) {
               var3 = var2.getString();
               if (var1 == 0) {
                  break label18;
               }
            }
         }

         var3 = null;
      }

      var10000 = new IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         var10002,
         var10003,
         var3,
         me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .d(var0.lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll)
            < 1.0
      );
      return var10000;
   }

   private static final Object d(IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII var0) {
      String var3;
      IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var10000;
      IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var10002;
      IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll var10003;
      int var10004;
      int var10005;
      int var10006;
      boolean var10007;
      String var10008;
      int var10009;
      int var10010;
      int var10011;
      label13: {
         int var1 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
         var10002 = var0.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
         var10003 = var0.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
         var10004 = var0.a9();
         var10005 = var0.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl;
         var10006 = var0.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll;
         var10007 = var0.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
         var10008 = var0.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
         var10009 = var0.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll.size();
         var10010 = var0.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI.size();
         var10011 = var0.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl.size();
         Screen var10012 = var0.ap().screen;
         if (var10012 != null) {
            Component var2 = var10012.getTitle();
            if (var2 != null) {
               var3 = var2.getString();
               if (var1 == 0) {
                  break label13;
               }
            }
         }

         var3 = null;
      }

      var10000 = new IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         var10002, var10003, var10004, var10005, var10006, var10007, var10008, var10009, var10010, var10011, var3
      );
      return var10000;
   }

   private static final Unit e(IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII var0) {
      var0.ba();
      return Unit.INSTANCE;
   }

   private static final Unit f(IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII var0) {
      var0.br();
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[27];
      int var3 = 0;
      String var2 = "\u0094\u0085wú¨\u0011ñGák\u0014M;Á|ýB\u001eèà\u0082\u007f\u008f\u0004j\u001f]÷\u0010\u009awsÜ\u001d[\u000eÀ\u000b\u0014\rÞÖð{\u0088\fu\u0000ÿ¤{}\u0099Ç\u009fU\u0012b\u0006y?ÃÕS'/\"\u0090÷\u0082c_¹Jü\u000eÒ\u0087)Ô \u0084$¢÷\u0094S9 +e%$\u0012A\u009fÃY:\t¤\u008c\u00ad\u001eKTÔ[¦ïµcs\u000e¡ñe\u0080(·÷-\u009f\u0080r\u0019g\u0080\u000fìÕ½\u0088ÄÑ5\u0091l>Ø\u0088pOç\u0016Äå\u008e4B×CíÃ\u009aXy¢àå\u009c¥Ú:ë\u0086÷\u0005\u0090'\u0010\u0016µ\u000e\"ÏdËÿ¹R\u009c\u0080\u009fg\u00adçÄ\u0015ï\u0085\u009d\u0016\u009dUóô¥Ô«\u0005±_V\u0002(&\u0019\t3$\u0012Ç\u0013Ãu³¥ç\u0011Åkq\u009c@Ï/\u0090ù=\u0007\u009aç\u0012ÙéÍ\u0010©®ó\u0015¥¹H«3)\u0018\u001eªEà\tñ\u0082³)±³\u0097Ó[»L\u0019·\u0018©\u0019|®&t\u008eªÅ8%-\t\b\u009b5f\u0086¥My\r-\u001b\u0085QÃêÕöpÒQ! \u00056\u0014Äp/\u0006\u009d\u0098_!À¹\u0004\u0093\u0019b7\u0013\u0012ÝB\u008d?uN\u0007\u001a`áÂ»_\b\u0001°\u0095´\u001b\u0017¹±âHÁ\f\u0015\u009f\u0082Á#øÉ²îÒ[£Ñ è¶]½\u001b|\fFÂ\u0099ü·v\u0000¦¬ytç\u000e?\u0081a»\u007fR3ì\u009d\u007fÕówn\u000e\u00897`X\u0088¬ãN\u001dì\"\u0094m1\u0006\u0013m1xX\u0092";
      int var4 = "\u0094\u0085wú¨\u0011ñGák\u0014M;Á|ýB\u001eèà\u0082\u007f\u008f\u0004j\u001f]÷\u0010\u009awsÜ\u001d[\u000eÀ\u000b\u0014\rÞÖð{\u0088\fu\u0000ÿ¤{}\u0099Ç\u009fU\u0012b\u0006y?ÃÕS'/\"\u0090÷\u0082c_¹Jü\u000eÒ\u0087)Ô \u0084$¢÷\u0094S9 +e%$\u0012A\u009fÃY:\t¤\u008c\u00ad\u001eKTÔ[¦ïµcs\u000e¡ñe\u0080(·÷-\u009f\u0080r\u0019g\u0080\u000fìÕ½\u0088ÄÑ5\u0091l>Ø\u0088pOç\u0016Äå\u008e4B×CíÃ\u009aXy¢àå\u009c¥Ú:ë\u0086÷\u0005\u0090'\u0010\u0016µ\u000e\"ÏdËÿ¹R\u009c\u0080\u009fg\u00adçÄ\u0015ï\u0085\u009d\u0016\u009dUóô¥Ô«\u0005±_V\u0002(&\u0019\t3$\u0012Ç\u0013Ãu³¥ç\u0011Åkq\u009c@Ï/\u0090ù=\u0007\u009aç\u0012ÙéÍ\u0010©®ó\u0015¥¹H«3)\u0018\u001eªEà\tñ\u0082³)±³\u0097Ó[»L\u0019·\u0018©\u0019|®&t\u008eªÅ8%-\t\b\u009b5f\u0086¥My\r-\u001b\u0085QÃêÕöpÒQ! \u00056\u0014Äp/\u0006\u009d\u0098_!À¹\u0004\u0093\u0019b7\u0013\u0012ÝB\u008d?uN\u0007\u001a`áÂ»_\b\u0001°\u0095´\u001b\u0017¹±âHÁ\f\u0015\u009f\u0082Á#øÉ²îÒ[£Ñ è¶]½\u001b|\fFÂ\u0099ü·v\u0000¦¬ytç\u000e?\u0081a»\u007fR3ì\u009d\u007fÕówn\u000e\u00897`X\u0088¬ãN\u001dì\"\u0094m1\u0006\u0013m1xX\u0092"
         .length();
      char var1 = 5;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 110;
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
                     case 0 -> 75;
                     case 1 -> 45;
                     case 2 -> 100;
                     case 3 -> 34;
                     case 4 -> 37;
                     case 5 -> 11;
                     default -> 102;
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
                     k = new String[27];
                     IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = new IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl = new IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII();
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

                  var2 = "®\u009c¼^¿îÕ½ÂÜ'\u000fA\b\u008dbZ\u001eÎUÃ\u0090)hÊf¯";
                  var4 = "®\u009c¼^¿îÕ½ÂÜ'\u000fA\b\u008dbZ\u001eÎUÃ\u0090)hÊf¯".length();
                  var1 = 11;
                  var8 = -1;
            }

            var10000 = 34;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String e(int var0, int var1) {
      int var2 = (var0 ^ 7877) & 65535;
      if (k[var2] == null) {
         char[] var3 = j[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 43;
            case 1 -> 235;
            case 2 -> 30;
            case 3 -> 54;
            case 4 -> 175;
            case 5 -> 241;
            case 6 -> 2;
            case 7 -> 74;
            case 8 -> 95;
            case 9 -> 253;
            case 10 -> 118;
            case 11 -> 76;
            case 12 -> 4;
            case 13 -> 9;
            case 14 -> 204;
            case 15 -> 52;
            case 16 -> 201;
            case 17 -> 98;
            case 18 -> 31;
            case 19 -> 110;
            case 20 -> 210;
            case 21 -> 131;
            case 22 -> 115;
            case 23 -> 33;
            case 24 -> 176;
            case 25 -> 149;
            case 26 -> 125;
            case 27 -> 132;
            case 28 -> 166;
            case 29 -> 189;
            case 30 -> 212;
            case 31 -> 116;
            case 32 -> 41;
            case 33 -> 233;
            case 34 -> 198;
            case 35 -> 200;
            case 36 -> 85;
            case 37 -> 236;
            case 38 -> 20;
            case 39 -> 158;
            case 40 -> 57;
            case 41 -> 179;
            case 42 -> 169;
            case 43 -> 246;
            case 44 -> 47;
            case 45 -> 222;
            case 46 -> 39;
            case 47 -> 61;
            case 48 -> 205;
            case 49 -> 219;
            case 50 -> 82;
            case 51 -> 173;
            case 52 -> 100;
            case 53 -> 245;
            case 54 -> 122;
            case 55 -> 1;
            case 56 -> 27;
            case 57 -> 71;
            case 58 -> 177;
            case 59 -> 249;
            case 60 -> 244;
            case 61 -> 182;
            case 62 -> 78;
            case 63 -> 104;
            case 64 -> 143;
            case 65 -> 142;
            case 66 -> 97;
            case 67 -> 34;
            case 68 -> 137;
            case 69 -> 127;
            case 70 -> 25;
            case 71 -> 112;
            case 72 -> 202;
            case 73 -> 234;
            case 74 -> 135;
            case 75 -> 50;
            case 76 -> 16;
            case 77 -> 129;
            case 78 -> 139;
            case 79 -> 181;
            case 80 -> 156;
            case 81 -> 161;
            case 82 -> 66;
            case 83 -> 29;
            case 84 -> 77;
            case 85 -> 174;
            case 86 -> 188;
            case 87 -> 81;
            case 88 -> 242;
            case 89 -> 217;
            case 90 -> 133;
            case 91 -> 196;
            case 92 -> 146;
            case 93 -> 237;
            case 94 -> 59;
            case 95 -> 73;
            case 96 -> 60;
            case 97 -> 26;
            case 98 -> 93;
            case 99 -> 231;
            case 100 -> 18;
            case 101 -> 192;
            case 102 -> 19;
            case 103 -> 79;
            case 104 -> 65;
            case 105 -> 165;
            case 106 -> 103;
            case 107 -> 145;
            case 108 -> 243;
            case 109 -> 162;
            case 110 -> 126;
            case 111 -> 11;
            case 112 -> 23;
            case 113 -> 89;
            case 114 -> 134;
            case 115 -> 251;
            case 116 -> 121;
            case 117 -> 102;
            case 118 -> 220;
            case 119 -> 160;
            case 120 -> 99;
            case 121 -> 32;
            case 122 -> 123;
            case 123 -> 252;
            case 124 -> 195;
            case 125 -> 128;
            case 126 -> 63;
            case 127 -> 83;
            case 128 -> 21;
            case 129 -> 14;
            case 130 -> 24;
            case 131 -> 194;
            case 132 -> 155;
            case 133 -> 239;
            case 134 -> 124;
            case 135 -> 36;
            case 136 -> 105;
            case 137 -> 28;
            case 138 -> 190;
            case 139 -> 46;
            case 140 -> 15;
            case 141 -> 5;
            case 142 -> 164;
            case 143 -> 48;
            case 144 -> 86;
            case 145 -> 170;
            case 146 -> 208;
            case 147 -> 216;
            case 148 -> 22;
            case 149 -> 87;
            case 150 -> 120;
            case 151 -> 13;
            case 152 -> 117;
            case 153 -> 178;
            case 154 -> 44;
            case 155 -> 38;
            case 156 -> 203;
            case 157 -> 247;
            case 158 -> 191;
            case 159 -> 151;
            case 160 -> 186;
            case 161 -> 232;
            case 162 -> 230;
            case 163 -> 12;
            case 164 -> 40;
            case 165 -> 148;
            case 166 -> 101;
            case 167 -> 211;
            case 168 -> 42;
            case 169 -> 224;
            case 170 -> 184;
            case 171 -> 214;
            case 172 -> 94;
            case 173 -> 152;
            case 174 -> 229;
            case 175 -> 167;
            case 176 -> 111;
            case 177 -> 58;
            case 178 -> 180;
            case 179 -> 136;
            case 180 -> 92;
            case 181 -> 35;
            case 182 -> 199;
            case 183 -> 17;
            case 184 -> 171;
            case 185 -> 221;
            case 186 -> 68;
            case 187 -> 183;
            case 188 -> 147;
            case 189 -> 144;
            case 190 -> 159;
            case 191 -> 140;
            case 192 -> 72;
            case 193 -> 227;
            case 194 -> 106;
            case 195 -> 154;
            case 196 -> 153;
            case 197 -> 238;
            case 198 -> 90;
            case 199 -> 88;
            case 200 -> 250;
            case 201 -> 8;
            case 202 -> 187;
            case 203 -> 62;
            case 204 -> 107;
            case 205 -> 37;
            case 206 -> 223;
            case 207 -> 55;
            case 208 -> 197;
            case 209 -> 130;
            case 210 -> 70;
            case 211 -> 56;
            case 212 -> 218;
            case 213 -> 53;
            case 214 -> 207;
            case 215 -> 119;
            case 216 -> 163;
            case 217 -> 228;
            case 218 -> 215;
            case 219 -> 80;
            case 220 -> 7;
            case 221 -> 51;
            case 222 -> 254;
            case 223 -> 96;
            case 224 -> 172;
            case 225 -> 75;
            case 226 -> 255;
            case 227 -> 108;
            case 228 -> 45;
            case 229 -> 109;
            case 230 -> 150;
            case 231 -> 185;
            case 232 -> 114;
            case 233 -> 84;
            case 234 -> 168;
            case 235 -> 157;
            case 236 -> 213;
            case 237 -> 49;
            case 238 -> 69;
            case 239 -> 226;
            case 240 -> 113;
            case 241 -> 209;
            case 242 -> 138;
            case 243 -> 193;
            case 244 -> 64;
            case 245 -> 225;
            case 246 -> 67;
            case 247 -> 91;
            case 248 -> 3;
            case 249 -> 6;
            case 250 -> 0;
            case 251 -> 240;
            case 252 -> 248;
            case 253 -> 141;
            case 254 -> 10;
            default -> 206;
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
      private final Triple<Integer, Integer, Integer> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @Nullable
      private final String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] a;
      private static String[] b;

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         @NotNull Triple<Integer, Integer, Integer> var1, boolean var2, @Nullable String var3, boolean var4
      ) {
         short var10001 = -30869;
         short var10002 = 9855;
         Intrinsics.checkNotNullParameter(var1, "playerPos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final boolean b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final String c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final boolean d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> e() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final boolean f() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final String g() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final boolean h() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
         @NotNull Triple<Integer, Integer, Integer> var1, boolean var2, @Nullable String var3, boolean var4
      ) {
         short var10001 = -30867;
         short var10002 = -19592;
         Intrinsics.checkNotNullParameter(var1, "playerPos");
         return new IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            var1, var2, var3, var4
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -30868;
         boolean var1 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         String var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         boolean var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         Triple var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 13835;
         short var10002 = -30865;
         short var10003 = 22924;
         short var10004 = -30866;
         short var10005 = 25570;
         short var10006 = -30870;
         short var10007 = -27091;
         return "OpenProgress(playerPos=" + var4 + ", walkerFinished=" + var3 + ", screenTitle=" + var2 + ", rotationReady=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var5;
         int var6;
         label14: {
            var5 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
            int var2 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
            int var1 = var5;
            var2 = var2 * 31 + Boolean.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
            var5 = var2 * 31;
            String var10001 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            if (var1 == 0) {
               if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == null) {
                  var6 = 0;
                  break label14;
               }

               var10001 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }

            var6 = var10001.hashCode();
         }

         int var4 = var5 + var6;
         return var4 * 31 + Boolean.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int var2 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
         Object var10000 = this;
         if (var2 == 0) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == 0) {
            if (!(
               var10000 instanceof IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = (IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var10000;
         boolean var4 = Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         );
         if (var2 == 0) {
            if (!var4) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         if (var2 == 0) {
            if (var4 != var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            );
         }

         if (var2 == 0) {
            if (!var4) {
               return false;
            }

            var4 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         if (var2 == 0) {
            if (var4 != var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
               return false;
            }

            var4 = true;
         }

         return var4;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[6];
         int var3 = 0;
         String var2 = "\u0015ê%E\u0016úÚ6ÜQnßjf\u0011§\u0014w\u0098Æ\r\u001d\u001b6ky\u009dÇÞNÀ`\u0017\u0089ñ¯q±ÇBm¢\u001eD¤\u0085¸?\u0012\"5½\u0007¥\u0007\u0011\tRq\béô!F¹û";
         int var4 = "\u0015ê%E\u0016úÚ6ÜQnßjf\u0011§\u0014w\u0098Æ\r\u001d\u001b6ky\u009dÇÞNÀ`\u0017\u0089ñ¯q±ÇBm¢\u001eD¤\u0085¸?\u0012\"5½\u0007¥\u0007\u0011\tRq\béô!F¹û"
            .length();
         char var1 = 14;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 36;
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
                        case 0 -> 45;
                        case 1 -> 95;
                        case 2 -> 88;
                        case 3 -> 20;
                        case 4 -> 118;
                        case 5 -> 26;
                        default -> 47;
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

                     var2 = "\u008c\u0005½\u001e\u0088²t\u0016«\u001fPRá\flä\tùü×ò¥èÆ*A";
                     var4 = "\u008c\u0005½\u001e\u0088²t\u0016«\u001fPRá\flä\tùü×ò¥èÆ*A".length();
                     var1 = 16;
                     var8 = -1;
               }

               var10000 = 66;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -30866) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 47;
               case 1 -> 68;
               case 2 -> 195;
               case 3 -> 181;
               case 4 -> 3;
               case 5 -> 114;
               case 6 -> 13;
               case 7 -> 182;
               case 8 -> 162;
               case 9 -> 63;
               case 10 -> 183;
               case 11 -> 151;
               case 12 -> 154;
               case 13 -> 125;
               case 14 -> 252;
               case 15 -> 185;
               case 16 -> 99;
               case 17 -> 16;
               case 18 -> 48;
               case 19 -> 232;
               case 20 -> 12;
               case 21 -> 250;
               case 22 -> 202;
               case 23 -> 137;
               case 24 -> 208;
               case 25 -> 171;
               case 26 -> 251;
               case 27 -> 93;
               case 28 -> 178;
               case 29 -> 17;
               case 30 -> 188;
               case 31 -> 241;
               case 32 -> 217;
               case 33 -> 66;
               case 34 -> 97;
               case 35 -> 255;
               case 36 -> 25;
               case 37 -> 4;
               case 38 -> 6;
               case 39 -> 53;
               case 40 -> 105;
               case 41 -> 89;
               case 42 -> 38;
               case 43 -> 126;
               case 44 -> 106;
               case 45 -> 220;
               case 46 -> 172;
               case 47 -> 118;
               case 48 -> 91;
               case 49 -> 84;
               case 50 -> 26;
               case 51 -> 246;
               case 52 -> 176;
               case 53 -> 201;
               case 54 -> 186;
               case 55 -> 161;
               case 56 -> 238;
               case 57 -> 119;
               case 58 -> 145;
               case 59 -> 131;
               case 60 -> 229;
               case 61 -> 96;
               case 62 -> 27;
               case 63 -> 160;
               case 64 -> 71;
               case 65 -> 11;
               case 66 -> 166;
               case 67 -> 165;
               case 68 -> 206;
               case 69 -> 29;
               case 70 -> 213;
               case 71 -> 100;
               case 72 -> 234;
               case 73 -> 7;
               case 74 -> 210;
               case 75 -> 136;
               case 76 -> 242;
               case 77 -> 75;
               case 78 -> 110;
               case 79 -> 226;
               case 80 -> 61;
               case 81 -> 2;
               case 82 -> 62;
               case 83 -> 149;
               case 84 -> 203;
               case 85 -> 69;
               case 86 -> 204;
               case 87 -> 221;
               case 88 -> 32;
               case 89 -> 111;
               case 90 -> 58;
               case 91 -> 77;
               case 92 -> 31;
               case 93 -> 95;
               case 94 -> 72;
               case 95 -> 189;
               case 96 -> 117;
               case 97 -> 228;
               case 98 -> 88;
               case 99 -> 230;
               case 100 -> 74;
               case 101 -> 49;
               case 102 -> 98;
               case 103 -> 155;
               case 104 -> 45;
               case 105 -> 209;
               case 106 -> 231;
               case 107 -> 128;
               case 108 -> 109;
               case 109 -> 30;
               case 110 -> 253;
               case 111 -> 140;
               case 112 -> 197;
               case 113 -> 92;
               case 114 -> 249;
               case 115 -> 87;
               case 116 -> 233;
               case 117 -> 142;
               case 118 -> 225;
               case 119 -> 199;
               case 120 -> 41;
               case 121 -> 101;
               case 122 -> 132;
               case 123 -> 174;
               case 124 -> 243;
               case 125 -> 15;
               case 126 -> 116;
               case 127 -> 207;
               case 128 -> 60;
               case 129 -> 244;
               case 130 -> 108;
               case 131 -> 122;
               case 132 -> 224;
               case 133 -> 70;
               case 134 -> 57;
               case 135 -> 164;
               case 136 -> 135;
               case 137 -> 107;
               case 138 -> 22;
               case 139 -> 102;
               case 140 -> 59;
               case 141 -> 190;
               case 142 -> 168;
               case 143 -> 148;
               case 144 -> 78;
               case 145 -> 24;
               case 146 -> 146;
               case 147 -> 152;
               case 148 -> 198;
               case 149 -> 245;
               case 150 -> 153;
               case 151 -> 83;
               case 152 -> 79;
               case 153 -> 200;
               case 154 -> 177;
               case 155 -> 1;
               case 156 -> 205;
               case 157 -> 170;
               case 158 -> 86;
               case 159 -> 212;
               case 160 -> 85;
               case 161 -> 80;
               case 162 -> 51;
               case 163 -> 247;
               case 164 -> 179;
               case 165 -> 239;
               case 166 -> 34;
               case 167 -> 141;
               case 168 -> 67;
               case 169 -> 184;
               case 170 -> 175;
               case 171 -> 39;
               case 172 -> 211;
               case 173 -> 14;
               case 174 -> 10;
               case 175 -> 52;
               case 176 -> 214;
               case 177 -> 8;
               case 178 -> 64;
               case 179 -> 90;
               case 180 -> 112;
               case 181 -> 144;
               case 182 -> 157;
               case 183 -> 218;
               case 184 -> 33;
               case 185 -> 124;
               case 186 -> 82;
               case 187 -> 28;
               case 188 -> 194;
               case 189 -> 73;
               case 190 -> 169;
               case 191 -> 123;
               case 192 -> 237;
               case 193 -> 42;
               case 194 -> 19;
               case 195 -> 54;
               case 196 -> 193;
               case 197 -> 115;
               case 198 -> 35;
               case 199 -> 120;
               case 200 -> 167;
               case 201 -> 0;
               case 202 -> 81;
               case 203 -> 215;
               case 204 -> 56;
               case 205 -> 156;
               case 206 -> 147;
               case 207 -> 236;
               case 208 -> 36;
               case 209 -> 223;
               case 210 -> 23;
               case 211 -> 248;
               case 212 -> 129;
               case 213 -> 127;
               case 214 -> 187;
               case 215 -> 138;
               case 216 -> 21;
               case 217 -> 222;
               case 218 -> 46;
               case 219 -> 227;
               case 220 -> 9;
               case 221 -> 254;
               case 222 -> 173;
               case 223 -> 65;
               case 224 -> 121;
               case 225 -> 43;
               case 226 -> 134;
               case 227 -> 94;
               case 228 -> 44;
               case 229 -> 143;
               case 230 -> 192;
               case 231 -> 133;
               case 232 -> 40;
               case 233 -> 103;
               case 234 -> 5;
               case 235 -> 104;
               case 236 -> 50;
               case 237 -> 18;
               case 238 -> 235;
               case 239 -> 163;
               case 240 -> 150;
               case 241 -> 196;
               case 242 -> 180;
               case 243 -> 55;
               case 244 -> 219;
               case 245 -> 139;
               case 246 -> 158;
               case 247 -> 20;
               case 248 -> 130;
               case 249 -> 216;
               case 250 -> 191;
               case 251 -> 159;
               case 252 -> 76;
               case 253 -> 113;
               case 254 -> 37;
               default -> 240;
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
         public static me.octo.client.IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(me.octo.client.IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll p0, kotlin.Triple p1, boolean p2, java.lang.String p3, boolean p4, int mask, java.lang.Object marker) {
         if ((mask & 1) != 0) { p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
         if ((mask & 2) != 0) { p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
         if ((mask & 4) != 0) { p3 = p0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl; }
         if ((mask & 8) != 0) { p4 = p0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI; }
         return p0.a(p1, p2, p3, p4);
      }
}

   public static enum IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;

      public static IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll[] a() {
         return (IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll[])IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.clone();
      }

      public static IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll a(
         String var0
      ) {
         return Enum.valueOf(
            IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll> b() {
         return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll[]{IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI};
      private static final EnumEntries<IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = kotlin.enums.EnumEntriesKt.enumEntries(IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
      private static final IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll[] c() {
         return values();
      }

   }

   private static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      @NotNull
      private final IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private final boolean IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      @Nullable
      private final String IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private final int lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      private final int IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      private final int llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      @Nullable
      private final String lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         @NotNull IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var1,
         @NotNull IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll var2,
         int var3,
         int var4,
         int var5,
         boolean var6,
         @Nullable String var7,
         int var8,
         int var9,
         int var10,
         @Nullable String var11
      ) {
         short var10001 = 4704;
         short var10002 = 14699;
         Intrinsics.checkNotNullParameter(var1, "inventory");
         var10001 = 4717;
         var10002 = -31311;
         Intrinsics.checkNotNullParameter(var2, "action");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var6;
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var7;
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var8;
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var9;
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var10;
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var11;
      }

      @NotNull
      public final IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final int d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final int e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final boolean f() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @Nullable
      public final String g() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      public final int h() {
         return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      public final int i() {
         return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      public final int j() {
         return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }

      @Nullable
      public final String k() {
         return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      }

      @NotNull
      public final IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl l() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll m() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int n() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final int o() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final int p() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final boolean q() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @Nullable
      public final String r() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      public final int s() {
         return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      public final int t() {
         return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      public final int u() {
         return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }

      @Nullable
      public final String v() {
         return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      }

      @NotNull
      public final IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         @NotNull IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var1,
         @NotNull IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll var2,
         int var3,
         int var4,
         int var5,
         boolean var6,
         @Nullable String var7,
         int var8,
         int var9,
         int var10,
         @Nullable String var11
      ) {
         short var10001 = 4711;
         short var10002 = 714;
         Intrinsics.checkNotNullParameter(var1, "inventory");
         var10001 = 4715;
         var10002 = 1398;
         Intrinsics.checkNotNullParameter(var2, "action");
         return new IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 4718;
         String var1 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
         int var2 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
         int var3 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
         int var4 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
         String var5 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         boolean var6 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         int var7 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         int var8 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         int var9 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll var10 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var11 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -12851;
         short var10002 = 4710;
         short var10003 = -15031;
         short var10004 = 4713;
         short var10005 = 7279;
         short var10006 = 4708;
         short var10007 = -18625;
         short var10008 = 4705;
         short var10009 = -6202;
         short var10010 = 4719;
         short var10011 = -21497;
         short var10012 = 4714;
         short var10013 = 25148;
         short var10014 = 4707;
         short var10015 = 11176;
         short var10016 = 4716;
         short var10017 = 27826;
         short var10018 = 4709;
         short var10019 = 24955;
         short var10020 = 4706;
         short var10021 = -26455;
         return "ExcavationProgress(inventory="
            + var11
            + ", action="
            + var10
            + ", currentIndex="
            + var9
            + ", maxCharges="
            + var8
            + ", chargesRemaining="
            + var7
            + ", foundPercentage="
            + var6
            + ", percentage="
            + var5
            + ", highlightedCount="
            + var4
            + ", fossilCount="
            + var3
            + ", dirtCount="
            + var2
            + ", screenTitle="
            + var1
            + ")";
      }

      @Override
      public int hashCode() {
         int var1;
         int var12;
         int var14;
         label25: {
            var12 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
            int var2 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
            var1 = var12;
            var2 = var2 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
            var2 = var2 * 31 + Integer.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
            var2 = var2 * 31 + Integer.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
            var2 = var2 * 31 + Integer.hashCode(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
            var2 = var2 * 31 + Boolean.hashCode(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
            var12 = var2 * 31;
            String var10001 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
            if (var1 != 0) {
               if (this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll == null) {
                  var14 = 0;
                  break label25;
               }

               var10001 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
            }

            var14 = var10001.hashCode();
         }

         int var8 = var12 + var14;
         var8 = var8 * 31 + Integer.hashCode(this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll);
         var8 = var8 * 31 + Integer.hashCode(this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII);
         var8 = var8 * 31 + Integer.hashCode(this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI);
         var12 = var8 * 31;
         String var15 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
         if (var1 != 0) {
            if (this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl == null) {
               return var12 + 0;
            }

            var15 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
         }

         return var12 + var15.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int var2 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
         IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var10000 = this;
         if (var2 == 0) {
            if (this == var1) {
               return true;
            }

            var10000 = (IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var1;
         }

         if (var2 == 0) {
            if (!(
               var10000 instanceof IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = (IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var1;
         }

         IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = var10000;
         var10000 = this;
         if (var2 == 0) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var10000 = this;
         }

         if (var2 == 0) {
            if (var10000.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               != var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
               return false;
            }

            var10000 = this;
         }

         int var5 = var10000.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var10001 = var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if (var2 == 0) {
            if (var10000.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
               != var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
               return false;
            }

            var5 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            var10001 = var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         if (var2 == 0) {
            if (var5 != var10001) {
               return false;
            }

            var5 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            var10001 = var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         }

         label114: {
            if (var2 == 0) {
               if (var5 != var10001) {
                  return false;
               }

               var5 = ((this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) ? 1 : 0);
               if (var2 != 0) {
                  break label114;
               }

               var10001 = ((var3.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) ? 1 : 0);
            }

            if (var5 != var10001) {
               return false;
            }

            var5 = ((Intrinsics.areEqual(
               this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
               var3.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
            )) ? 1 : 0);
         }

         if (var2 == 0) {
            if (var5 == 0) {
               return false;
            }

            var5 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
         }

         var10001 = var3.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
         if (var2 == 0) {
            if (var5 != var3.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) {
               return false;
            }

            var5 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
            var10001 = var3.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
         }

         label116: {
            if (var2 == 0) {
               if (var5 != var10001) {
                  return false;
               }

               var5 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
               if (var2 != 0) {
                  break label116;
               }

               var10001 = var3.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
            }

            if (var5 != var10001) {
               return false;
            }

            var5 = ((Intrinsics.areEqual(
               this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
               var3.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
            )) ? 1 : 0);
         }

         if (var2 == 0) {
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
         String[] var5 = new String[15];
         int var3 = 0;
         String var2 = "\u0011U\u008dÏ\u0000\u0097$]\u0018\t&¥\u0091Pl¿ðúÆ\f\u008cåÁRÅ©/\u0087Ü\u0081\u0097É\r²=\u000fA>õ0ÓvÍ4&¡\u0013×m¦C±\u00979ÙÆ\u008a\u00846Ý¤\u001b\u00ad\u0012¹»\u000e\u008eú\u0096»ÚÎêY§|ýÀó,\u0013\u00160\u0095é»ùµA).þ×¤»\u0090=B'±\tÉ\u0093\u0096\u0017c\u008cH>\u0095\u0012\u0011±pÞ¶ä\u0081HÚ¼R©ø`úöêË\u001d\u0090¦\u0001a>Óãy\u008e\u0098 ¥ò\u0007\u0089iã4.!n1lm\u0093\u0006)Ó\u0003\u0006\u0090e¶i$Ô\u000eR\u009b\u0018\u009b½Q+|\u0005\u009c]\u0018×u\u0006\u0093)Öà(å";
         int var4 = "\u0011U\u008dÏ\u0000\u0097$]\u0018\t&¥\u0091Pl¿ðúÆ\f\u008cåÁRÅ©/\u0087Ü\u0081\u0097É\r²=\u000fA>õ0ÓvÍ4&¡\u0013×m¦C±\u00979ÙÆ\u008a\u00846Ý¤\u001b\u00ad\u0012¹»\u000e\u008eú\u0096»ÚÎêY§|ýÀó,\u0013\u00160\u0095é»ùµA).þ×¤»\u0090=B'±\tÉ\u0093\u0096\u0017c\u008cH>\u0095\u0012\u0011±pÞ¶ä\u0081HÚ¼R©ø`úöêË\u001d\u0090¦\u0001a>Óãy\u008e\u0098 ¥ò\u0007\u0089iã4.!n1lm\u0093\u0006)Ó\u0003\u0006\u0090e¶i$Ô\u000eR\u009b\u0018\u009b½Q+|\u0005\u009c]\u0018×u\u0006\u0093)Öà(å"
            .length();
         char var1 = '\t';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 55;
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
                        case 0 -> 83;
                        case 1 -> 88;
                        case 2 -> 38;
                        case 3 -> 121;
                        case 4 -> 114;
                        case 5 -> 45;
                        default -> 119;
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
                        b = new String[15];
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

                     var2 = "\u008fÒboðCxù\u0002·©n\u0087\u000fa1¬\u0003XÍm\u001b ÃôÌ\\6\u008f";
                     var4 = "\u008fÒboðCxù\u0002·©n\u0087\u000fa1¬\u0003XÍm\u001b ÃôÌ\\6\u008f".length();
                     var1 = '\r';
                     var8 = -1;
               }

               var10000 = 107;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 4711) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 31;
               case 1 -> 107;
               case 2 -> 232;
               case 3 -> 140;
               case 4 -> 244;
               case 5 -> 157;
               case 6 -> 62;
               case 7 -> 73;
               case 8 -> 0;
               case 9 -> 111;
               case 10 -> 26;
               case 11 -> 203;
               case 12 -> 1;
               case 13 -> 54;
               case 14 -> 58;
               case 15 -> 247;
               case 16 -> 169;
               case 17 -> 106;
               case 18 -> 144;
               case 19 -> 41;
               case 20 -> 15;
               case 21 -> 64;
               case 22 -> 88;
               case 23 -> 21;
               case 24 -> 149;
               case 25 -> 124;
               case 26 -> 65;
               case 27 -> 134;
               case 28 -> 131;
               case 29 -> 52;
               case 30 -> 216;
               case 31 -> 50;
               case 32 -> 226;
               case 33 -> 102;
               case 34 -> 201;
               case 35 -> 148;
               case 36 -> 180;
               case 37 -> 84;
               case 38 -> 87;
               case 39 -> 234;
               case 40 -> 136;
               case 41 -> 23;
               case 42 -> 127;
               case 43 -> 229;
               case 44 -> 171;
               case 45 -> 146;
               case 46 -> 82;
               case 47 -> 141;
               case 48 -> 222;
               case 49 -> 138;
               case 50 -> 173;
               case 51 -> 238;
               case 52 -> 72;
               case 53 -> 221;
               case 54 -> 152;
               case 55 -> 166;
               case 56 -> 13;
               case 57 -> 215;
               case 58 -> 210;
               case 59 -> 220;
               case 60 -> 34;
               case 61 -> 230;
               case 62 -> 8;
               case 63 -> 233;
               case 64 -> 143;
               case 65 -> 137;
               case 66 -> 219;
               case 67 -> 208;
               case 68 -> 133;
               case 69 -> 252;
               case 70 -> 37;
               case 71 -> 59;
               case 72 -> 175;
               case 73 -> 4;
               case 74 -> 254;
               case 75 -> 162;
               case 76 -> 105;
               case 77 -> 94;
               case 78 -> 70;
               case 79 -> 198;
               case 80 -> 115;
               case 81 -> 156;
               case 82 -> 43;
               case 83 -> 76;
               case 84 -> 130;
               case 85 -> 32;
               case 86 -> 5;
               case 87 -> 96;
               case 88 -> 182;
               case 89 -> 250;
               case 90 -> 192;
               case 91 -> 55;
               case 92 -> 122;
               case 93 -> 237;
               case 94 -> 185;
               case 95 -> 181;
               case 96 -> 204;
               case 97 -> 150;
               case 98 -> 179;
               case 99 -> 153;
               case 100 -> 239;
               case 101 -> 145;
               case 102 -> 113;
               case 103 -> 90;
               case 104 -> 103;
               case 105 -> 235;
               case 106 -> 38;
               case 107 -> 66;
               case 108 -> 202;
               case 109 -> 189;
               case 110 -> 154;
               case 111 -> 49;
               case 112 -> 164;
               case 113 -> 241;
               case 114 -> 104;
               case 115 -> 77;
               case 116 -> 42;
               case 117 -> 174;
               case 118 -> 186;
               case 119 -> 126;
               case 120 -> 207;
               case 121 -> 51;
               case 122 -> 85;
               case 123 -> 132;
               case 124 -> 190;
               case 125 -> 17;
               case 126 -> 195;
               case 127 -> 60;
               case 128 -> 248;
               case 129 -> 255;
               case 130 -> 120;
               case 131 -> 196;
               case 132 -> 36;
               case 133 -> 6;
               case 134 -> 16;
               case 135 -> 159;
               case 136 -> 20;
               case 137 -> 125;
               case 138 -> 109;
               case 139 -> 18;
               case 140 -> 188;
               case 141 -> 151;
               case 142 -> 25;
               case 143 -> 19;
               case 144 -> 81;
               case 145 -> 117;
               case 146 -> 142;
               case 147 -> 112;
               case 148 -> 29;
               case 149 -> 30;
               case 150 -> 61;
               case 151 -> 118;
               case 152 -> 194;
               case 153 -> 193;
               case 154 -> 91;
               case 155 -> 178;
               case 156 -> 63;
               case 157 -> 242;
               case 158 -> 251;
               case 159 -> 14;
               case 160 -> 27;
               case 161 -> 71;
               case 162 -> 39;
               case 163 -> 11;
               case 164 -> 213;
               case 165 -> 212;
               case 166 -> 217;
               case 167 -> 158;
               case 168 -> 128;
               case 169 -> 129;
               case 170 -> 170;
               case 171 -> 12;
               case 172 -> 78;
               case 173 -> 167;
               case 174 -> 7;
               case 175 -> 123;
               case 176 -> 67;
               case 177 -> 228;
               case 178 -> 3;
               case 179 -> 9;
               case 180 -> 223;
               case 181 -> 168;
               case 182 -> 110;
               case 183 -> 161;
               case 184 -> 48;
               case 185 -> 116;
               case 186 -> 108;
               case 187 -> 184;
               case 188 -> 24;
               case 189 -> 160;
               case 190 -> 68;
               case 191 -> 2;
               case 192 -> 45;
               case 193 -> 79;
               case 194 -> 206;
               case 195 -> 93;
               case 196 -> 163;
               case 197 -> 98;
               case 198 -> 139;
               case 199 -> 253;
               case 200 -> 176;
               case 201 -> 46;
               case 202 -> 10;
               case 203 -> 86;
               case 204 -> 214;
               case 205 -> 205;
               case 206 -> 231;
               case 207 -> 147;
               case 208 -> 35;
               case 209 -> 177;
               case 210 -> 47;
               case 211 -> 57;
               case 212 -> 236;
               case 213 -> 95;
               case 214 -> 69;
               case 215 -> 53;
               case 216 -> 99;
               case 217 -> 56;
               case 218 -> 33;
               case 219 -> 200;
               case 220 -> 97;
               case 221 -> 197;
               case 222 -> 218;
               case 223 -> 249;
               case 224 -> 40;
               case 225 -> 246;
               case 226 -> 44;
               case 227 -> 187;
               case 228 -> 240;
               case 229 -> 225;
               case 230 -> 191;
               case 231 -> 165;
               case 232 -> 183;
               case 233 -> 119;
               case 234 -> 227;
               case 235 -> 209;
               case 236 -> 74;
               case 237 -> 121;
               case 238 -> 80;
               case 239 -> 92;
               case 240 -> 155;
               case 241 -> 101;
               case 242 -> 75;
               case 243 -> 245;
               case 244 -> 28;
               case 245 -> 83;
               case 246 -> 100;
               case 247 -> 224;
               case 248 -> 89;
               case 249 -> 199;
               case 250 -> 172;
               case 251 -> 114;
               case 252 -> 22;
               case 253 -> 243;
               case 254 -> 135;
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
         public static me.octo.client.IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(me.octo.client.IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI p0, me.octo.client.IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl p1, me.octo.client.IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll p2, int p3, int p4, int p5, boolean p6, java.lang.String p7, int p8, int p9, int p10, java.lang.String p11, int mask, java.lang.Object marker) {
         if ((mask & 1) != 0) { p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
         if ((mask & 2) != 0) { p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
         if ((mask & 4) != 0) { p3 = p0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl; }
         if ((mask & 8) != 0) { p4 = p0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI; }
         if ((mask & 16) != 0) { p5 = p0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII; }
         if ((mask & 32) != 0) { p6 = p0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI; }
         if ((mask & 64) != 0) { p7 = p0.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll; }
         if ((mask & 128) != 0) { p8 = p0.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll; }
         if ((mask & 256) != 0) { p9 = p0.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII; }
         if ((mask & 512) != 0) { p10 = p0.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI; }
         if ((mask & 1024) != 0) { p11 = p0.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl; }
         return p0.a(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
      }
}

   public static enum llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      // PX-FIX varargs-ctor: entry args lost by obfuscator
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl(Object... px) {
      }


      public static IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl[] a() {
         return (IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl[])lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clone();
      }

      public static IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl a(
         String var0
      ) {
         return Enum.valueOf(
            IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl> b() {
         return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl[]{IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl};
      private static final EnumEntries<llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = kotlin.enums.EnumEntriesKt.enumEntries(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      private static final llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl[] c() {
         return values();
      }

         private llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl() {
         }
}

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker pxMarker) {
           this();
        }


      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII a() {
         return IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII.lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl;
      }
   }
}
