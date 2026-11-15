package me.octo.client;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.player.Inventory;

import java.util.ArrayList;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import me.octo.client.utils.IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI;
import me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
import me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
import net.minecraft.world.entity.monster.Endermite;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
import me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
import net.minecraft.world.item.ItemStack;
import java.util.Iterator;
import java.util.List;
import kotlin.text.StringsKt;
import me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;

public final class lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI
   extends lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll {
   public Object receiver; // PX-FIX kotlin lambda receiver

   @NotNull
   public static lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
   @NotNull
   private ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
   @NotNull
   private ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
   @NotNull
   private lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
   @NotNull
   private lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
   @NotNull
   private static lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl;
   @NotNull
   private static lIllIIIllIllllllIIIIIlIIIIIlIllIIlllIllIIllIlIIIIIIIlIlllIlIIIllIIlIlIIIIIIlIlIIlIIlI IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll;
   private static String[] j;
   private static String[] k;

   public lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI() {
      short var10001 = -505;
      short var10002 = -13589;
      var10002 = -486;
      short var10003 = -31722;
      me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      short var10004 = -497;
      short var10005 = 27825;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         llllIIlIIlIIlIlIlIIIIllIIllllllIIlIllIlllIlllllllllIlllIIIIllllIIlIIllIlIIIIlIIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         llllIIlIIlIIlIlIlIIIIllIIllllllIIlIllIlllIlllllllllIlllIIIIllllIIlIIllIlIIIIlIIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         llllIIlIIlIIlIlIlIIIIllIIllllllIIlIllIlllIlllllllllIlllIIIIllllIIlIIllIlIIIIlIIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c(),
         llllIIlIIlIIlIlIlIIIIllIIllllllIIlIllIlllIlllllllllIlllIIIIllllIIlIIllIlIIIIlIIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .d(),
         llllIIlIIlIIlIlIlIIIIllIIllllllIIlIllIlllIlllllllllIlllIIIIllllIIlIIllIlIIIIlIIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e(),
         llllIIlIIlIIlIlIlIIIIllIIllllllIIlIllIlllIlllllllllIlllIIIIllllIIlIIllIlIIIIlIIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .f()
      };
      super("End Stone Macro", "Mines end stone in The End using a smooth path route with ability usage.", var3, "The End", null, null, true, var1, 48, null);
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = new ArrayList<>();
      this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = new ArrayList<>();
      this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl = lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
   }

   @Override
   protected void aD() {
      Object receiver = null; // PX-FIX
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var10000 = this;
      short var10001 = -503;
      short var10002 = -3778;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10000),
         "End Stone travel",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         (Function0)(() -> a(this)),
         5000L,
         false,
         false,
         (Function0)(() -> b(this)),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = -26200;
                  short var10005 = -29133;
                  var10005 = -26197;
                  short var10006 = -7308;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001x = -26199;
                  short var10002x = 12581;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
   pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "JY\u0013\u009ag>\u001c·E\u0016Á¿®²<\u0089$\u000fÍËùv|\u00ad\u008aØ¡kò\u008d7ÌpÜçD_¶¢ü\u0014\u0090î\u001cS×ã\u0085j\riº8\u0097¸ÉvÀ\u008c_t>=$nc\u0091\u0006Â×\u001f\u0097 \nÚ0èAÔkã\u0086(ÇÃ°;J©\u009c£p<Ìþr®|·F\u0011±HG;¯®\u0093\u0089\u0018ä\u0014\u007fÊ-\u0005NPûM¶Ï¯\u0093\u0084eòä¹åxè¼þ^8²m\u0002\u009f\u0086:\u0093>ÎÖl";
                  int var4 = "JY\u0013\u009ag>\u001c·E\u0016Á¿®²<\u0089$\u000fÍËùv|\u00ad\u008aØ¡kò\u008d7ÌpÜçD_¶¢ü\u0014\u0090î\u001cS×ã\u0085j\riº8\u0097¸ÉvÀ\u008c_t>=$nc\u0091\u0006Â×\u001f\u0097 \nÚ0èAÔkã\u0086(ÇÃ°;J©\u009c£p<Ìþr®|·F\u0011±HG;¯®\u0093\u0089\u0018ä\u0014\u007fÊ-\u0005NPûM¶Ï¯\u0093\u0084eòä¹åxè¼þ^8²m\u0002\u009f\u0086:\u0093>ÎÖl"
                     .length();
                  char var1 = 2;
                  int var0 = -1;

                  while (true) {
                     char[] var10002x;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 92;
                        var10002x = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 92;
                           var10006 = var6;
                        } else {
                           var13 = 92;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 92;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 22;
                              case 1 -> 73;
                              case 2 -> 115;
                              case 3 -> 39;
                              case 4 -> 6;
                              case 5 -> 120;
                              default -> 83;
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
                  int var2 = (var0 ^ -26199) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 181;
                        case 1 -> 150;
                        case 2 -> 245;
                        case 3 -> 103;
                        case 4 -> 52;
                        case 5 -> 50;
                        case 6 -> 45;
                        case 7 -> 22;
                        case 8 -> 61;
                        case 9 -> 210;
                        case 10 -> 233;
                        case 11 -> 253;
                        case 12 -> 249;
                        case 13 -> 30;
                        case 14 -> 13;
                        case 15 -> 159;
                        case 16 -> 252;
                        case 17 -> 36;
                        case 18 -> 171;
                        case 19 -> 207;
                        case 20 -> 26;
                        case 21 -> 86;
                        case 22 -> 209;
                        case 23 -> 74;
                        case 24 -> 164;
                        case 25 -> 166;
                        case 26 -> 80;
                        case 27 -> 160;
                        case 28 -> 83;
                        case 29 -> 68;
                        case 30 -> 246;
                        case 31 -> 142;
                        case 32 -> 157;
                        case 33 -> 198;
                        case 34 -> 136;
                        case 35 -> 47;
                        case 36 -> 189;
                        case 37 -> 188;
                        case 38 -> 99;
                        case 39 -> 10;
                        case 40 -> 131;
                        case 41 -> 111;
                        case 42 -> 60;
                        case 43 -> 169;
                        case 44 -> 39;
                        case 45 -> 194;
                        case 46 -> 94;
                        case 47 -> 53;
                        case 48 -> 254;
                        case 49 -> 18;
                        case 50 -> 176;
                        case 51 -> 115;
                        case 52 -> 219;
                        case 53 -> 117;
                        case 54 -> 151;
                        case 55 -> 75;
                        case 56 -> 152;
                        case 57 -> 236;
                        case 58 -> 235;
                        case 59 -> 48;
                        case 60 -> 55;
                        case 61 -> 239;
                        case 62 -> 224;
                        case 63 -> 87;
                        case 64 -> 172;
                        case 65 -> 212;
                        case 66 -> 180;
                        case 67 -> 241;
                        case 68 -> 156;
                        case 69 -> 76;
                        case 70 -> 24;
                        case 71 -> 238;
                        case 72 -> 33;
                        case 73 -> 42;
                        case 74 -> 95;
                        case 75 -> 105;
                        case 76 -> 127;
                        case 77 -> 250;
                        case 78 -> 97;
                        case 79 -> 140;
                        case 80 -> 247;
                        case 81 -> 223;
                        case 82 -> 12;
                        case 83 -> 113;
                        case 84 -> 119;
                        case 85 -> 8;
                        case 86 -> 120;
                        case 87 -> 32;
                        case 88 -> 84;
                        case 89 -> 51;
                        case 90 -> 134;
                        case 91 -> 139;
                        case 92 -> 31;
                        case 93 -> 43;
                        case 94 -> 183;
                        case 95 -> 112;
                        case 96 -> 138;
                        case 97 -> 1;
                        case 98 -> 34;
                        case 99 -> 251;
                        case 100 -> 248;
                        case 101 -> 225;
                        case 102 -> 146;
                        case 103 -> 163;
                        case 104 -> 106;
                        case 105 -> 190;
                        case 106 -> 2;
                        case 107 -> 162;
                        case 108 -> 7;
                        case 109 -> 72;
                        case 110 -> 205;
                        case 111 -> 14;
                        case 112 -> 96;
                        case 113 -> 0;
                        case 114 -> 54;
                        case 115 -> 217;
                        case 116 -> 114;
                        case 117 -> 40;
                        case 118 -> 17;
                        case 119 -> 122;
                        case 120 -> 130;
                        case 121 -> 213;
                        case 122 -> 195;
                        case 123 -> 191;
                        case 124 -> 178;
                        case 125 -> 56;
                        case 126 -> 109;
                        case 127 -> 71;
                        case 128 -> 107;
                        case 129 -> 214;
                        case 130 -> 3;
                        case 131 -> 49;
                        case 132 -> 28;
                        case 133 -> 62;
                        case 134 -> 228;
                        case 135 -> 218;
                        case 136 -> 175;
                        case 137 -> 234;
                        case 138 -> 121;
                        case 139 -> 57;
                        case 140 -> 230;
                        case 141 -> 126;
                        case 142 -> 240;
                        case 143 -> 92;
                        case 144 -> 104;
                        case 145 -> 145;
                        case 146 -> 184;
                        case 147 -> 118;
                        case 148 -> 110;
                        case 149 -> 186;
                        case 150 -> 132;
                        case 151 -> 211;
                        case 152 -> 11;
                        case 153 -> 143;
                        case 154 -> 101;
                        case 155 -> 41;
                        case 156 -> 44;
                        case 157 -> 203;
                        case 158 -> 135;
                        case 159 -> 21;
                        case 160 -> 153;
                        case 161 -> 9;
                        case 162 -> 232;
                        case 163 -> 149;
                        case 164 -> 222;
                        case 165 -> 147;
                        case 166 -> 144;
                        case 167 -> 15;
                        case 168 -> 216;
                        case 169 -> 255;
                        case 170 -> 199;
                        case 171 -> 196;
                        case 172 -> 128;
                        case 173 -> 78;
                        case 174 -> 221;
                        case 175 -> 161;
                        case 176 -> 193;
                        case 177 -> 85;
                        case 178 -> 70;
                        case 179 -> 206;
                        case 180 -> 201;
                        case 181 -> 91;
                        case 182 -> 179;
                        case 183 -> 141;
                        case 184 -> 202;
                        case 185 -> 154;
                        case 186 -> 187;
                        case 187 -> 4;
                        case 188 -> 98;
                        case 189 -> 197;
                        case 190 -> 63;
                        case 191 -> 192;
                        case 192 -> 89;
                        case 193 -> 38;
                        case 194 -> 155;
                        case 195 -> 66;
                        case 196 -> 165;
                        case 197 -> 16;
                        case 198 -> 177;
                        case 199 -> 25;
                        case 200 -> 6;
                        case 201 -> 125;
                        case 202 -> 81;
                        case 203 -> 208;
                        case 204 -> 93;
                        case 205 -> 77;
                        case 206 -> 227;
                        case 207 -> 69;
                        case 208 -> 123;
                        case 209 -> 242;
                        case 210 -> 65;
                        case 211 -> 231;
                        case 212 -> 129;
                        case 213 -> 148;
                        case 214 -> 37;
                        case 215 -> 237;
                        case 216 -> 58;
                        case 217 -> 244;
                        case 218 -> 35;
                        case 219 -> 158;
                        case 220 -> 29;
                        case 221 -> 5;
                        case 222 -> 168;
                        case 223 -> 73;
                        case 224 -> 243;
                        case 225 -> 182;
                        case 226 -> 27;
                        case 227 -> 19;
                        case 228 -> 88;
                        case 229 -> 67;
                        case 230 -> 204;
                        case 231 -> 229;
                        case 232 -> 100;
                        case 233 -> 20;
                        case 234 -> 90;
                        case 235 -> 226;
                        case 236 -> 46;
                        case 237 -> 200;
                        case 238 -> 64;
                        case 239 -> 124;
                        case 240 -> 167;
                        case 241 -> 220;
                        case 242 -> 79;
                        case 243 -> 82;
                        case 244 -> 170;
                        case 245 -> 137;
                        case 246 -> 185;
                        case 247 -> 116;
                        case 248 -> 173;
                        case 249 -> 174;
                        case 250 -> 23;
                        case 251 -> 215;
                        case 252 -> 133;
                        case 253 -> 108;
                        case 254 -> 102;
                        default -> 59;
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
         ),
         48,
         null
      );
      var10000 = this;
      var10001 = -490;
      var10002 = 23646;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10000),
         "End Stone route",
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
                  short var10004 = -17339;
                  short var10005 = -7492;
                  var10005 = -17340;
                  short var10006 = -17836;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = -17337;
                  short var10002 = 12218;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
   pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "ØPæä±Õ#^ÛÍ MTÿ9t\u009dÐ¡|\fä|râ\u0007I\u0004\u0096\u0086\u0089$aÒ\u009fÑId;o\u009cî\u0005ÄÁ\u0093\n£×£ªÕsTbEÉÝò\u00152\u009e,M\u007fGå $Ê¾\u0007¸Nßõ5\u0005Ýê±\u0014\u008bLï×6qª\u0093\u001aÉ8V('9\u008e\u009c+üJWu\u00010ÚÍQÕ\u0097õlÅc\u0097¤Î\u007fb\u0015#¨\u0089¨[®´\u009f8\u009f;\u0099ÜÉÑ\u0016sþ d8\u0083¯\u0002$ª";
                  int var4 = "ØPæä±Õ#^ÛÍ MTÿ9t\u009dÐ¡|\fä|râ\u0007I\u0004\u0096\u0086\u0089$aÒ\u009fÑId;o\u009cî\u0005ÄÁ\u0093\n£×£ªÕsTbEÉÝò\u00152\u009e,M\u007fGå $Ê¾\u0007¸Nßõ5\u0005Ýê±\u0014\u008bLï×6qª\u0093\u001aÉ8V('9\u008e\u009c+üJWu\u00010ÚÍQÕ\u0097õlÅc\u0097¤Î\u007fb\u0015#¨\u0089¨[®´\u009f8\u009f;\u0099ÜÉÑ\u0016sþ d8\u0083¯\u0002$ª"
                     .length();
                  char var1 = 19;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 23;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 23;
                           var10006 = var6;
                        } else {
                           var13 = 23;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 23;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 89;
                              case 1 -> 2;
                              case 2 -> 40;
                              case 3 -> 114;
                              case 4 -> 82;
                              case 5 -> 127;
                              default -> 14;
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
                  int var2 = (var0 ^ -17339) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 63;
                        case 1 -> 236;
                        case 2 -> 84;
                        case 3 -> 112;
                        case 4 -> 51;
                        case 5 -> 124;
                        case 6 -> 15;
                        case 7 -> 1;
                        case 8 -> 146;
                        case 9 -> 86;
                        case 10 -> 103;
                        case 11 -> 119;
                        case 12 -> 24;
                        case 13 -> 144;
                        case 14 -> 235;
                        case 15 -> 49;
                        case 16 -> 43;
                        case 17 -> 60;
                        case 18 -> 157;
                        case 19 -> 68;
                        case 20 -> 7;
                        case 21 -> 241;
                        case 22 -> 166;
                        case 23 -> 198;
                        case 24 -> 88;
                        case 25 -> 246;
                        case 26 -> 105;
                        case 27 -> 125;
                        case 28 -> 78;
                        case 29 -> 156;
                        case 30 -> 6;
                        case 31 -> 188;
                        case 32 -> 3;
                        case 33 -> 223;
                        case 34 -> 205;
                        case 35 -> 143;
                        case 36 -> 95;
                        case 37 -> 114;
                        case 38 -> 155;
                        case 39 -> 255;
                        case 40 -> 215;
                        case 41 -> 164;
                        case 42 -> 111;
                        case 43 -> 251;
                        case 44 -> 66;
                        case 45 -> 247;
                        case 46 -> 149;
                        case 47 -> 180;
                        case 48 -> 83;
                        case 49 -> 18;
                        case 50 -> 242;
                        case 51 -> 46;
                        case 52 -> 199;
                        case 53 -> 213;
                        case 54 -> 169;
                        case 55 -> 230;
                        case 56 -> 231;
                        case 57 -> 61;
                        case 58 -> 228;
                        case 59 -> 171;
                        case 60 -> 91;
                        case 61 -> 32;
                        case 62 -> 248;
                        case 63 -> 218;
                        case 64 -> 5;
                        case 65 -> 47;
                        case 66 -> 42;
                        case 67 -> 55;
                        case 68 -> 224;
                        case 69 -> 249;
                        case 70 -> 217;
                        case 71 -> 27;
                        case 72 -> 200;
                        case 73 -> 17;
                        case 74 -> 226;
                        case 75 -> 158;
                        case 76 -> 102;
                        case 77 -> 50;
                        case 78 -> 133;
                        case 79 -> 25;
                        case 80 -> 67;
                        case 81 -> 23;
                        case 82 -> 131;
                        case 83 -> 181;
                        case 84 -> 33;
                        case 85 -> 0;
                        case 86 -> 29;
                        case 87 -> 239;
                        case 88 -> 100;
                        case 89 -> 254;
                        case 90 -> 182;
                        case 91 -> 183;
                        case 92 -> 173;
                        case 93 -> 204;
                        case 94 -> 138;
                        case 95 -> 219;
                        case 96 -> 99;
                        case 97 -> 96;
                        case 98 -> 175;
                        case 99 -> 221;
                        case 100 -> 211;
                        case 101 -> 35;
                        case 102 -> 41;
                        case 103 -> 162;
                        case 104 -> 85;
                        case 105 -> 89;
                        case 106 -> 160;
                        case 107 -> 177;
                        case 108 -> 240;
                        case 109 -> 167;
                        case 110 -> 107;
                        case 111 -> 39;
                        case 112 -> 98;
                        case 113 -> 94;
                        case 114 -> 92;
                        case 115 -> 62;
                        case 116 -> 170;
                        case 117 -> 106;
                        case 118 -> 10;
                        case 119 -> 22;
                        case 120 -> 135;
                        case 121 -> 220;
                        case 122 -> 187;
                        case 123 -> 186;
                        case 124 -> 56;
                        case 125 -> 191;
                        case 126 -> 192;
                        case 127 -> 214;
                        case 128 -> 74;
                        case 129 -> 16;
                        case 130 -> 28;
                        case 131 -> 81;
                        case 132 -> 75;
                        case 133 -> 184;
                        case 134 -> 141;
                        case 135 -> 53;
                        case 136 -> 154;
                        case 137 -> 232;
                        case 138 -> 38;
                        case 139 -> 185;
                        case 140 -> 110;
                        case 141 -> 113;
                        case 142 -> 72;
                        case 143 -> 11;
                        case 144 -> 65;
                        case 145 -> 194;
                        case 146 -> 101;
                        case 147 -> 130;
                        case 148 -> 90;
                        case 149 -> 82;
                        case 150 -> 190;
                        case 151 -> 202;
                        case 152 -> 137;
                        case 153 -> 244;
                        case 154 -> 14;
                        case 155 -> 4;
                        case 156 -> 150;
                        case 157 -> 165;
                        case 158 -> 21;
                        case 159 -> 237;
                        case 160 -> 229;
                        case 161 -> 2;
                        case 162 -> 234;
                        case 163 -> 121;
                        case 164 -> 193;
                        case 165 -> 216;
                        case 166 -> 145;
                        case 167 -> 195;
                        case 168 -> 126;
                        case 169 -> 139;
                        case 170 -> 142;
                        case 171 -> 77;
                        case 172 -> 132;
                        case 173 -> 71;
                        case 174 -> 109;
                        case 175 -> 108;
                        case 176 -> 178;
                        case 177 -> 115;
                        case 178 -> 148;
                        case 179 -> 196;
                        case 180 -> 243;
                        case 181 -> 122;
                        case 182 -> 174;
                        case 183 -> 238;
                        case 184 -> 161;
                        case 185 -> 19;
                        case 186 -> 159;
                        case 187 -> 58;
                        case 188 -> 69;
                        case 189 -> 9;
                        case 190 -> 40;
                        case 191 -> 250;
                        case 192 -> 222;
                        case 193 -> 136;
                        case 194 -> 151;
                        case 195 -> 172;
                        case 196 -> 57;
                        case 197 -> 45;
                        case 198 -> 87;
                        case 199 -> 34;
                        case 200 -> 127;
                        case 201 -> 179;
                        case 202 -> 147;
                        case 203 -> 207;
                        case 204 -> 201;
                        case 205 -> 76;
                        case 206 -> 116;
                        case 207 -> 30;
                        case 208 -> 210;
                        case 209 -> 123;
                        case 210 -> 8;
                        case 211 -> 44;
                        case 212 -> 176;
                        case 213 -> 163;
                        case 214 -> 54;
                        case 215 -> 117;
                        case 216 -> 233;
                        case 217 -> 212;
                        case 218 -> 37;
                        case 219 -> 59;
                        case 220 -> 48;
                        case 221 -> 31;
                        case 222 -> 227;
                        case 223 -> 197;
                        case 224 -> 26;
                        case 225 -> 152;
                        case 226 -> 252;
                        case 227 -> 64;
                        case 228 -> 206;
                        case 229 -> 129;
                        case 230 -> 52;
                        case 231 -> 225;
                        case 232 -> 245;
                        case 233 -> 203;
                        case 234 -> 118;
                        case 235 -> 73;
                        case 236 -> 189;
                        case 237 -> 153;
                        case 238 -> 97;
                        case 239 -> 13;
                        case 240 -> 253;
                        case 241 -> 128;
                        case 242 -> 209;
                        case 243 -> 208;
                        case 244 -> 93;
                        case 245 -> 36;
                        case 246 -> 120;
                        case 247 -> 134;
                        case 248 -> 104;
                        case 249 -> 80;
                        case 250 -> 168;
                        case 251 -> 12;
                        case 252 -> 20;
                        case 253 -> 79;
                        case 254 -> 140;
                        default -> 70;
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
      var10001 = -504;
      var10002 = 15231;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10000,
         "End Stone approach",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         30000L,
         0L,
         null,
         false,
         false,
         (kotlin.jvm.functions.Function0)(() -> lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.e(this)),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = -27271;
                  short var10005 = 20600;
                  var10005 = -27272;
                  short var10006 = -16712;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = -27269;
                  short var10002 = -13847;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
   pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "Ú9wF/\u0087\u0004\u0010\u0080ÕÄâÎþnë¦¬j|©¸\u0019vâ\u0081½Ð·Í\"á\u0012\u009eõçÕ-\u0004@\u008f\u000fØ)õ\u0082\u008auÃÆùöµ6N\ró\u0005:¢-\u009cË²R7ì(ñÏ»v\u0097Ì<QM.\u0003\u0000ÆO\u0091#\u0013ë&Z®\u0002\u009eDyh¬æ]²¯}\u0015,lMb\u0088gUJÀ\u0000S!ÀE\u009bf»#sO\u008eO: )\u0010+Çg\u0092$<\u0080¬Õ\u0016õ\ntEs(j\u0002Ãa";
                  int var4 = "Ú9wF/\u0087\u0004\u0010\u0080ÕÄâÎþnë¦¬j|©¸\u0019vâ\u0081½Ð·Í\"á\u0012\u009eõçÕ-\u0004@\u008f\u000fØ)õ\u0082\u008auÃÆùöµ6N\ró\u0005:¢-\u009cË²R7ì(ñÏ»v\u0097Ì<QM.\u0003\u0000ÆO\u0091#\u0013ë&Z®\u0002\u009eDyh¬æ]²¯}\u0015,lMb\u0088gUJÀ\u0000S!ÀE\u009bf»#sO\u008eO: )\u0010+Çg\u0092$<\u0080¬Õ\u0016õ\ntEs(j\u0002Ãa"
                     .length();
                  char var1 = 19;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 36;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 36;
                           var10006 = var6;
                        } else {
                           var13 = 36;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 36;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 14;
                              case 1 -> 12;
                              case 2 -> 70;
                              case 3 -> 105;
                              case 4 -> 102;
                              case 5 -> 79;
                              default -> 41;
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
                  int var2 = (var0 ^ -27271) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 204;
                        case 1 -> 4;
                        case 2 -> 103;
                        case 3 -> 75;
                        case 4 -> 245;
                        case 5 -> 5;
                        case 6 -> 225;
                        case 7 -> 93;
                        case 8 -> 134;
                        case 9 -> 220;
                        case 10 -> 230;
                        case 11 -> 38;
                        case 12 -> 121;
                        case 13 -> 253;
                        case 14 -> 102;
                        case 15 -> 51;
                        case 16 -> 219;
                        case 17 -> 217;
                        case 18 -> 249;
                        case 19 -> 210;
                        case 20 -> 236;
                        case 21 -> 76;
                        case 22 -> 79;
                        case 23 -> 244;
                        case 24 -> 12;
                        case 25 -> 49;
                        case 26 -> 68;
                        case 27 -> 131;
                        case 28 -> 53;
                        case 29 -> 74;
                        case 30 -> 231;
                        case 31 -> 45;
                        case 32 -> 187;
                        case 33 -> 157;
                        case 34 -> 10;
                        case 35 -> 61;
                        case 36 -> 50;
                        case 37 -> 44;
                        case 38 -> 145;
                        case 39 -> 184;
                        case 40 -> 60;
                        case 41 -> 247;
                        case 42 -> 183;
                        case 43 -> 91;
                        case 44 -> 251;
                        case 45 -> 138;
                        case 46 -> 17;
                        case 47 -> 143;
                        case 48 -> 104;
                        case 49 -> 174;
                        case 50 -> 114;
                        case 51 -> 175;
                        case 52 -> 235;
                        case 53 -> 191;
                        case 54 -> 78;
                        case 55 -> 180;
                        case 56 -> 20;
                        case 57 -> 163;
                        case 58 -> 223;
                        case 59 -> 198;
                        case 60 -> 43;
                        case 61 -> 202;
                        case 62 -> 113;
                        case 63 -> 159;
                        case 64 -> 6;
                        case 65 -> 142;
                        case 66 -> 228;
                        case 67 -> 152;
                        case 68 -> 67;
                        case 69 -> 153;
                        case 70 -> 117;
                        case 71 -> 98;
                        case 72 -> 47;
                        case 73 -> 7;
                        case 74 -> 240;
                        case 75 -> 229;
                        case 76 -> 97;
                        case 77 -> 146;
                        case 78 -> 201;
                        case 79 -> 25;
                        case 80 -> 193;
                        case 81 -> 192;
                        case 82 -> 87;
                        case 83 -> 197;
                        case 84 -> 82;
                        case 85 -> 22;
                        case 86 -> 94;
                        case 87 -> 72;
                        case 88 -> 115;
                        case 89 -> 33;
                        case 90 -> 172;
                        case 91 -> 28;
                        case 92 -> 124;
                        case 93 -> 128;
                        case 94 -> 161;
                        case 95 -> 70;
                        case 96 -> 66;
                        case 97 -> 181;
                        case 98 -> 173;
                        case 99 -> 168;
                        case 100 -> 254;
                        case 101 -> 55;
                        case 102 -> 119;
                        case 103 -> 110;
                        case 104 -> 96;
                        case 105 -> 239;
                        case 106 -> 250;
                        case 107 -> 34;
                        case 108 -> 89;
                        case 109 -> 56;
                        case 110 -> 196;
                        case 111 -> 16;
                        case 112 -> 248;
                        case 113 -> 24;
                        case 114 -> 215;
                        case 115 -> 150;
                        case 116 -> 209;
                        case 117 -> 84;
                        case 118 -> 30;
                        case 119 -> 242;
                        case 120 -> 222;
                        case 121 -> 190;
                        case 122 -> 133;
                        case 123 -> 1;
                        case 124 -> 129;
                        case 125 -> 179;
                        case 126 -> 203;
                        case 127 -> 234;
                        case 128 -> 216;
                        case 129 -> 19;
                        case 130 -> 232;
                        case 131 -> 205;
                        case 132 -> 154;
                        case 133 -> 31;
                        case 134 -> 29;
                        case 135 -> 40;
                        case 136 -> 135;
                        case 137 -> 167;
                        case 138 -> 83;
                        case 139 -> 95;
                        case 140 -> 0;
                        case 141 -> 213;
                        case 142 -> 206;
                        case 143 -> 18;
                        case 144 -> 212;
                        case 145 -> 137;
                        case 146 -> 140;
                        case 147 -> 88;
                        case 148 -> 11;
                        case 149 -> 155;
                        case 150 -> 211;
                        case 151 -> 162;
                        case 152 -> 139;
                        case 153 -> 166;
                        case 154 -> 52;
                        case 155 -> 185;
                        case 156 -> 238;
                        case 157 -> 105;
                        case 158 -> 123;
                        case 159 -> 59;
                        case 160 -> 144;
                        case 161 -> 54;
                        case 162 -> 233;
                        case 163 -> 132;
                        case 164 -> 2;
                        case 165 -> 199;
                        case 166 -> 207;
                        case 167 -> 42;
                        case 168 -> 85;
                        case 169 -> 77;
                        case 170 -> 27;
                        case 171 -> 176;
                        case 172 -> 90;
                        case 173 -> 100;
                        case 174 -> 21;
                        case 175 -> 41;
                        case 176 -> 15;
                        case 177 -> 36;
                        case 178 -> 195;
                        case 179 -> 169;
                        case 180 -> 108;
                        case 181 -> 101;
                        case 182 -> 73;
                        case 183 -> 141;
                        case 184 -> 86;
                        case 185 -> 48;
                        case 186 -> 188;
                        case 187 -> 148;
                        case 188 -> 156;
                        case 189 -> 125;
                        case 190 -> 126;
                        case 191 -> 35;
                        case 192 -> 189;
                        case 193 -> 130;
                        case 194 -> 71;
                        case 195 -> 255;
                        case 196 -> 165;
                        case 197 -> 23;
                        case 198 -> 136;
                        case 199 -> 194;
                        case 200 -> 116;
                        case 201 -> 170;
                        case 202 -> 171;
                        case 203 -> 246;
                        case 204 -> 226;
                        case 205 -> 109;
                        case 206 -> 46;
                        case 207 -> 221;
                        case 208 -> 149;
                        case 209 -> 120;
                        case 210 -> 13;
                        case 211 -> 37;
                        case 212 -> 214;
                        case 213 -> 178;
                        case 214 -> 112;
                        case 215 -> 9;
                        case 216 -> 107;
                        case 217 -> 8;
                        case 218 -> 122;
                        case 219 -> 208;
                        case 220 -> 151;
                        case 221 -> 182;
                        case 222 -> 158;
                        case 223 -> 218;
                        case 224 -> 241;
                        case 225 -> 252;
                        case 226 -> 227;
                        case 227 -> 62;
                        case 228 -> 3;
                        case 229 -> 65;
                        case 230 -> 69;
                        case 231 -> 243;
                        case 232 -> 63;
                        case 233 -> 80;
                        case 234 -> 58;
                        case 235 -> 111;
                        case 236 -> 26;
                        case 237 -> 127;
                        case 238 -> 106;
                        case 239 -> 200;
                        case 240 -> 224;
                        case 241 -> 99;
                        case 242 -> 147;
                        case 243 -> 237;
                        case 244 -> 177;
                        case 245 -> 186;
                        case 246 -> 118;
                        case 247 -> 39;
                        case 248 -> 160;
                        case 249 -> 64;
                        case 250 -> 57;
                        case 251 -> 32;
                        case 252 -> 92;
                        case 253 -> 81;
                        case 254 -> 14;
                        default -> 164;
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
      var10001 = -485;
      var10002 = -20779;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10000,
         "End Stone path",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         15000L,
         0L,
         null,
         false,
         false,
         (kotlin.jvm.functions.Function0)(() -> lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.g(this)),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = 11628;
                  short var10005 = -13937;
                  var10005 = 11630;
                  short var10006 = -27052;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = 11629;
                  short var10002 = 19149;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
   pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "àÓz\u001f×½ÑÒêÇ\u008dùöWì\u000e¼\u0014p\u0002Rá|\u001d¦Å± h/h5\u0090v\u0013\u0089\n\u0003¥AaÏØ<\u0099~±%È\u0081ö'f/æ6%ôêt³Î-¢§¿\u0005\u0096Å-g\u0003£5±Bm\u0097¯½!Wå\u0015â!\u0013Õ§ú\u008a$ÒJ\u008e©5ï\\ÿ`+m\u0081wïì\u0097l\u0093Í\u008dÂ2\u0096·2\u0093\u009c\u00ad\u0091ßæ\u009a8¬ý\u0016T\u0016Î\u0003\u0082\u001bR\u0088\u009ep\u0012Ô\u001c\u0098ÌÇ.|\u0098";
                  int var4 = "àÓz\u001f×½ÑÒêÇ\u008dùöWì\u000e¼\u0014p\u0002Rá|\u001d¦Å± h/h5\u0090v\u0013\u0089\n\u0003¥AaÏØ<\u0099~±%È\u0081ö'f/æ6%ôêt³Î-¢§¿\u0005\u0096Å-g\u0003£5±Bm\u0097¯½!Wå\u0015â!\u0013Õ§ú\u008a$ÒJ\u008e©5ï\\ÿ`+m\u0081wïì\u0097l\u0093Í\u008dÂ2\u0096·2\u0093\u009c\u00ad\u0091ßæ\u009a8¬ý\u0016T\u0016Î\u0003\u0082\u001bR\u0088\u009ep\u0012Ô\u001c\u0098ÌÇ.|\u0098"
                     .length();
                  char var1 = 19;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 57;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 57;
                           var10006 = var6;
                        } else {
                           var13 = 57;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 57;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 24;
                              case 1 -> 104;
                              case 2 -> 112;
                              case 3 -> 95;
                              case 4 -> 71;
                              case 5 -> 38;
                              default -> 121;
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
                  int var2 = (var0 ^ 11628) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 39;
                        case 1 -> 54;
                        case 2 -> 57;
                        case 3 -> 207;
                        case 4 -> 201;
                        case 5 -> 44;
                        case 6 -> 59;
                        case 7 -> 174;
                        case 8 -> 235;
                        case 9 -> 189;
                        case 10 -> 134;
                        case 11 -> 22;
                        case 12 -> 237;
                        case 13 -> 9;
                        case 14 -> 191;
                        case 15 -> 118;
                        case 16 -> 36;
                        case 17 -> 85;
                        case 18 -> 154;
                        case 19 -> 37;
                        case 20 -> 19;
                        case 21 -> 31;
                        case 22 -> 133;
                        case 23 -> 218;
                        case 24 -> 41;
                        case 25 -> 76;
                        case 26 -> 111;
                        case 27 -> 220;
                        case 28 -> 13;
                        case 29 -> 89;
                        case 30 -> 193;
                        case 31 -> 157;
                        case 32 -> 160;
                        case 33 -> 5;
                        case 34 -> 40;
                        case 35 -> 168;
                        case 36 -> 194;
                        case 37 -> 170;
                        case 38 -> 63;
                        case 39 -> 138;
                        case 40 -> 150;
                        case 41 -> 214;
                        case 42 -> 196;
                        case 43 -> 233;
                        case 44 -> 117;
                        case 45 -> 56;
                        case 46 -> 141;
                        case 47 -> 65;
                        case 48 -> 60;
                        case 49 -> 222;
                        case 50 -> 64;
                        case 51 -> 15;
                        case 52 -> 216;
                        case 53 -> 132;
                        case 54 -> 17;
                        case 55 -> 183;
                        case 56 -> 249;
                        case 57 -> 188;
                        case 58 -> 30;
                        case 59 -> 68;
                        case 60 -> 0;
                        case 61 -> 114;
                        case 62 -> 70;
                        case 63 -> 163;
                        case 64 -> 186;
                        case 65 -> 123;
                        case 66 -> 178;
                        case 67 -> 119;
                        case 68 -> 90;
                        case 69 -> 225;
                        case 70 -> 147;
                        case 71 -> 115;
                        case 72 -> 42;
                        case 73 -> 229;
                        case 74 -> 137;
                        case 75 -> 210;
                        case 76 -> 246;
                        case 77 -> 101;
                        case 78 -> 10;
                        case 79 -> 203;
                        case 80 -> 251;
                        case 81 -> 53;
                        case 82 -> 110;
                        case 83 -> 171;
                        case 84 -> 74;
                        case 85 -> 219;
                        case 86 -> 127;
                        case 87 -> 128;
                        case 88 -> 252;
                        case 89 -> 49;
                        case 90 -> 144;
                        case 91 -> 121;
                        case 92 -> 142;
                        case 93 -> 98;
                        case 94 -> 28;
                        case 95 -> 208;
                        case 96 -> 166;
                        case 97 -> 91;
                        case 98 -> 199;
                        case 99 -> 181;
                        case 100 -> 80;
                        case 101 -> 204;
                        case 102 -> 7;
                        case 103 -> 250;
                        case 104 -> 95;
                        case 105 -> 73;
                        case 106 -> 158;
                        case 107 -> 192;
                        case 108 -> 224;
                        case 109 -> 50;
                        case 110 -> 152;
                        case 111 -> 93;
                        case 112 -> 145;
                        case 113 -> 247;
                        case 114 -> 255;
                        case 115 -> 202;
                        case 116 -> 87;
                        case 117 -> 24;
                        case 118 -> 78;
                        case 119 -> 162;
                        case 120 -> 197;
                        case 121 -> 143;
                        case 122 -> 164;
                        case 123 -> 34;
                        case 124 -> 232;
                        case 125 -> 99;
                        case 126 -> 51;
                        case 127 -> 16;
                        case 128 -> 69;
                        case 129 -> 195;
                        case 130 -> 82;
                        case 131 -> 23;
                        case 132 -> 198;
                        case 133 -> 149;
                        case 134 -> 8;
                        case 135 -> 47;
                        case 136 -> 107;
                        case 137 -> 169;
                        case 138 -> 131;
                        case 139 -> 43;
                        case 140 -> 244;
                        case 141 -> 227;
                        case 142 -> 77;
                        case 143 -> 130;
                        case 144 -> 72;
                        case 145 -> 236;
                        case 146 -> 187;
                        case 147 -> 146;
                        case 148 -> 234;
                        case 149 -> 228;
                        case 150 -> 136;
                        case 151 -> 179;
                        case 152 -> 140;
                        case 153 -> 175;
                        case 154 -> 231;
                        case 155 -> 88;
                        case 156 -> 167;
                        case 157 -> 151;
                        case 158 -> 155;
                        case 159 -> 79;
                        case 160 -> 45;
                        case 161 -> 18;
                        case 162 -> 32;
                        case 163 -> 226;
                        case 164 -> 12;
                        case 165 -> 1;
                        case 166 -> 96;
                        case 167 -> 29;
                        case 168 -> 14;
                        case 169 -> 159;
                        case 170 -> 200;
                        case 171 -> 103;
                        case 172 -> 238;
                        case 173 -> 52;
                        case 174 -> 48;
                        case 175 -> 129;
                        case 176 -> 81;
                        case 177 -> 243;
                        case 178 -> 223;
                        case 179 -> 173;
                        case 180 -> 6;
                        case 181 -> 4;
                        case 182 -> 139;
                        case 183 -> 61;
                        case 184 -> 106;
                        case 185 -> 109;
                        case 186 -> 165;
                        case 187 -> 58;
                        case 188 -> 92;
                        case 189 -> 242;
                        case 190 -> 97;
                        case 191 -> 20;
                        case 192 -> 35;
                        case 193 -> 230;
                        case 194 -> 3;
                        case 195 -> 62;
                        case 196 -> 75;
                        case 197 -> 206;
                        case 198 -> 254;
                        case 199 -> 153;
                        case 200 -> 217;
                        case 201 -> 205;
                        case 202 -> 182;
                        case 203 -> 239;
                        case 204 -> 122;
                        case 205 -> 84;
                        case 206 -> 148;
                        case 207 -> 21;
                        case 208 -> 177;
                        case 209 -> 71;
                        case 210 -> 112;
                        case 211 -> 27;
                        case 212 -> 66;
                        case 213 -> 253;
                        case 214 -> 125;
                        case 215 -> 102;
                        case 216 -> 113;
                        case 217 -> 11;
                        case 218 -> 240;
                        case 219 -> 2;
                        case 220 -> 215;
                        case 221 -> 241;
                        case 222 -> 180;
                        case 223 -> 104;
                        case 224 -> 120;
                        case 225 -> 86;
                        case 226 -> 135;
                        case 227 -> 211;
                        case 228 -> 105;
                        case 229 -> 176;
                        case 230 -> 172;
                        case 231 -> 156;
                        case 232 -> 184;
                        case 233 -> 209;
                        case 234 -> 248;
                        case 235 -> 161;
                        case 236 -> 67;
                        case 237 -> 38;
                        case 238 -> 126;
                        case 239 -> 212;
                        case 240 -> 46;
                        case 241 -> 26;
                        case 242 -> 116;
                        case 243 -> 55;
                        case 244 -> 94;
                        case 245 -> 100;
                        case 246 -> 108;
                        case 247 -> 190;
                        case 248 -> 245;
                        case 249 -> 25;
                        case 250 -> 221;
                        case 251 -> 185;
                        case 252 -> 124;
                        case 253 -> 33;
                        case 254 -> 213;
                        default -> 83;
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
      var10001 = -501;
      var10002 = -26988;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10000,
         "End Stone mined progress",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         20000L,
         0L,
         null,
         false,
         false,
         (kotlin.jvm.functions.Function0)(lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI::bu),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = -8407;
                  short var10005 = -16463;
                  var10005 = -8408;
                  short var10006 = -2424;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = -8405;
                  short var10002 = -22748;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
   pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "¥üË#\u0091Á|R\u0000Î\t¨\u009d\u0018\u008e¸é\u001bª|ÑðE¢@ñFTG\u000eá°\u0080\u001b-Ø\u009d\u0017$í$0\"\u009dw=0-\u001eB\u0011»\u0081ugïY\n²jÖ*>ë¿Áx\u001cÌÃ\u0093¤O¿Í\u0090ù\u0099Æ+WÀ\fX/×|ô\u000fx \u0084ý\u00ad\u0015´År36[lOê\u008cóéç²|°N¸0«¬QòOÕ\u0091\u0087½ñQÚ¡\u0006,ë\u0005\u001aDÈð\u0001´\u0085ñðµ°ë;\u0002\u001a\u0099";
                  int var4 = "¥üË#\u0091Á|R\u0000Î\t¨\u009d\u0018\u008e¸é\u001bª|ÑðE¢@ñFTG\u000eá°\u0080\u001b-Ø\u009d\u0017$í$0\"\u009dw=0-\u001eB\u0011»\u0081ugïY\n²jÖ*>ë¿Áx\u001cÌÃ\u0093¤O¿Í\u0090ù\u0099Æ+WÀ\fX/×|ô\u000fx \u0084ý\u00ad\u0015´År36[lOê\u008cóéç²|°N¸0«¬QòOÕ\u0091\u0087½ñQÚ¡\u0006,ë\u0005\u001aDÈð\u0001´\u0085ñðµ°ë;\u0002\u001a\u0099"
                     .length();
                  char var1 = 19;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 90;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 90;
                           var10006 = var6;
                        } else {
                           var13 = 90;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 90;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 115;
                              case 1 -> 53;
                              case 2 -> 11;
                              case 3 -> 34;
                              case 4 -> 87;
                              case 5 -> 125;
                              default -> 17;
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
                  int var2 = (var0 ^ -8407) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 20;
                        case 1 -> 148;
                        case 2 -> 208;
                        case 3 -> 241;
                        case 4 -> 75;
                        case 5 -> 33;
                        case 6 -> 122;
                        case 7 -> 154;
                        case 8 -> 162;
                        case 9 -> 7;
                        case 10 -> 99;
                        case 11 -> 28;
                        case 12 -> 151;
                        case 13 -> 178;
                        case 14 -> 63;
                        case 15 -> 188;
                        case 16 -> 175;
                        case 17 -> 15;
                        case 18 -> 215;
                        case 19 -> 102;
                        case 20 -> 247;
                        case 21 -> 70;
                        case 22 -> 115;
                        case 23 -> 40;
                        case 24 -> 143;
                        case 25 -> 18;
                        case 26 -> 55;
                        case 27 -> 72;
                        case 28 -> 191;
                        case 29 -> 135;
                        case 30 -> 231;
                        case 31 -> 89;
                        case 32 -> 245;
                        case 33 -> 168;
                        case 34 -> 10;
                        case 35 -> 3;
                        case 36 -> 21;
                        case 37 -> 140;
                        case 38 -> 13;
                        case 39 -> 237;
                        case 40 -> 12;
                        case 41 -> 136;
                        case 42 -> 192;
                        case 43 -> 170;
                        case 44 -> 217;
                        case 45 -> 105;
                        case 46 -> 116;
                        case 47 -> 59;
                        case 48 -> 11;
                        case 49 -> 177;
                        case 50 -> 111;
                        case 51 -> 225;
                        case 52 -> 49;
                        case 53 -> 46;
                        case 54 -> 161;
                        case 55 -> 26;
                        case 56 -> 163;
                        case 57 -> 47;
                        case 58 -> 97;
                        case 59 -> 176;
                        case 60 -> 82;
                        case 61 -> 79;
                        case 62 -> 160;
                        case 63 -> 194;
                        case 64 -> 50;
                        case 65 -> 139;
                        case 66 -> 110;
                        case 67 -> 249;
                        case 68 -> 185;
                        case 69 -> 94;
                        case 70 -> 132;
                        case 71 -> 227;
                        case 72 -> 25;
                        case 73 -> 246;
                        case 74 -> 80;
                        case 75 -> 27;
                        case 76 -> 233;
                        case 77 -> 183;
                        case 78 -> 169;
                        case 79 -> 159;
                        case 80 -> 120;
                        case 81 -> 103;
                        case 82 -> 147;
                        case 83 -> 71;
                        case 84 -> 22;
                        case 85 -> 112;
                        case 86 -> 251;
                        case 87 -> 30;
                        case 88 -> 23;
                        case 89 -> 232;
                        case 90 -> 137;
                        case 91 -> 142;
                        case 92 -> 198;
                        case 93 -> 235;
                        case 94 -> 250;
                        case 95 -> 221;
                        case 96 -> 213;
                        case 97 -> 124;
                        case 98 -> 84;
                        case 99 -> 90;
                        case 100 -> 107;
                        case 101 -> 65;
                        case 102 -> 201;
                        case 103 -> 119;
                        case 104 -> 144;
                        case 105 -> 207;
                        case 106 -> 180;
                        case 107 -> 48;
                        case 108 -> 155;
                        case 109 -> 174;
                        case 110 -> 73;
                        case 111 -> 199;
                        case 112 -> 88;
                        case 113 -> 184;
                        case 114 -> 171;
                        case 115 -> 141;
                        case 116 -> 85;
                        case 117 -> 166;
                        case 118 -> 226;
                        case 119 -> 1;
                        case 120 -> 187;
                        case 121 -> 157;
                        case 122 -> 240;
                        case 123 -> 113;
                        case 124 -> 130;
                        case 125 -> 9;
                        case 126 -> 17;
                        case 127 -> 218;
                        case 128 -> 254;
                        case 129 -> 133;
                        case 130 -> 83;
                        case 131 -> 34;
                        case 132 -> 193;
                        case 133 -> 131;
                        case 134 -> 197;
                        case 135 -> 214;
                        case 136 -> 66;
                        case 137 -> 223;
                        case 138 -> 92;
                        case 139 -> 200;
                        case 140 -> 205;
                        case 141 -> 150;
                        case 142 -> 8;
                        case 143 -> 210;
                        case 144 -> 87;
                        case 145 -> 57;
                        case 146 -> 100;
                        case 147 -> 19;
                        case 148 -> 211;
                        case 149 -> 252;
                        case 150 -> 64;
                        case 151 -> 114;
                        case 152 -> 202;
                        case 153 -> 220;
                        case 154 -> 6;
                        case 155 -> 216;
                        case 156 -> 61;
                        case 157 -> 196;
                        case 158 -> 67;
                        case 159 -> 206;
                        case 160 -> 101;
                        case 161 -> 134;
                        case 162 -> 236;
                        case 163 -> 39;
                        case 164 -> 253;
                        case 165 -> 138;
                        case 166 -> 244;
                        case 167 -> 108;
                        case 168 -> 109;
                        case 169 -> 51;
                        case 170 -> 44;
                        case 171 -> 60;
                        case 172 -> 68;
                        case 173 -> 153;
                        case 174 -> 228;
                        case 175 -> 53;
                        case 176 -> 165;
                        case 177 -> 167;
                        case 178 -> 126;
                        case 179 -> 234;
                        case 180 -> 76;
                        case 181 -> 127;
                        case 182 -> 74;
                        case 183 -> 37;
                        case 184 -> 146;
                        case 185 -> 42;
                        case 186 -> 179;
                        case 187 -> 173;
                        case 188 -> 81;
                        case 189 -> 158;
                        case 190 -> 4;
                        case 191 -> 96;
                        case 192 -> 203;
                        case 193 -> 129;
                        case 194 -> 189;
                        case 195 -> 190;
                        case 196 -> 0;
                        case 197 -> 204;
                        case 198 -> 5;
                        case 199 -> 32;
                        case 200 -> 62;
                        case 201 -> 93;
                        case 202 -> 238;
                        case 203 -> 41;
                        case 204 -> 95;
                        case 205 -> 117;
                        case 206 -> 56;
                        case 207 -> 2;
                        case 208 -> 104;
                        case 209 -> 222;
                        case 210 -> 69;
                        case 211 -> 14;
                        case 212 -> 45;
                        case 213 -> 181;
                        case 214 -> 219;
                        case 215 -> 31;
                        case 216 -> 182;
                        case 217 -> 209;
                        case 218 -> 255;
                        case 219 -> 118;
                        case 220 -> 91;
                        case 221 -> 43;
                        case 222 -> 54;
                        case 223 -> 29;
                        case 224 -> 149;
                        case 225 -> 195;
                        case 226 -> 77;
                        case 227 -> 239;
                        case 228 -> 86;
                        case 229 -> 121;
                        case 230 -> 24;
                        case 231 -> 224;
                        case 232 -> 52;
                        case 233 -> 230;
                        case 234 -> 106;
                        case 235 -> 164;
                        case 236 -> 152;
                        case 237 -> 16;
                        case 238 -> 78;
                        case 239 -> 212;
                        case 240 -> 243;
                        case 241 -> 229;
                        case 242 -> 123;
                        case 243 -> 172;
                        case 244 -> 35;
                        case 245 -> 186;
                        case 246 -> 36;
                        case 247 -> 242;
                        case 248 -> 248;
                        case 249 -> 156;
                        case 250 -> 38;
                        case 251 -> 128;
                        case 252 -> 98;
                        case 253 -> 58;
                        case 254 -> 125;
                        default -> 145;
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
      var10001 = -495;
      var10002 = 16291;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10000,
         "End Stone endermite clear",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         10000L,
         0L,
         null,
         false,
         false,
         (kotlin.jvm.functions.Function0)(() -> lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.j(this)),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = 7421;
                  short var10005 = 17076;
                  var10005 = 7423;
                  short var10006 = -9031;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = 7422;
                  short var10002 = -13898;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
   pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "Ì»\u001f¶¶k\"æ\u0014¡öøz¨\u0093q³_\\ü\u0091óK\u001c'°\"&½ü\u009c\u0011\u008d8\\§áúØÉ\u0083äuí/|×³\u0083×¥ßôm¢põZ¾.åxà®mðI\u00ad±é\u0016iÂmO´4\u0093Òó\u001ai\u007fðkoì\t¯¹©\u0017DâIK\u0015´&ÂE\u0018\u009a\u001a\u000fFµlÓ\u001bâ¾Y\u0083ª\u0015B\u001f\u0095Bæ\u001füs\u0002\u0011U\u0013CÅîy\u0088\u0092åÙìFé\u0004\u00997ï\u0082<!\u00ad";
                  int var4 = "Ì»\u001f¶¶k\"æ\u0014¡öøz¨\u0093q³_\\ü\u0091óK\u001c'°\"&½ü\u009c\u0011\u008d8\\§áúØÉ\u0083äuí/|×³\u0083×¥ßôm¢põZ¾.åxà®mðI\u00ad±é\u0016iÂmO´4\u0093Òó\u001ai\u007fðkoì\t¯¹©\u0017DâIK\u0015´&ÂE\u0018\u009a\u001a\u000fFµlÓ\u001bâ¾Y\u0083ª\u0015B\u001f\u0095Bæ\u001füs\u0002\u0011U\u0013CÅîy\u0088\u0092åÙìFé\u0004\u00997ï\u0082<!\u00ad"
                     .length();
                  char var1 = '|';
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 10;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 10;
                           var10006 = var6;
                        } else {
                           var13 = 10;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 10;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 12;
                              case 1 -> 21;
                              case 2 -> 71;
                              case 3 -> 1;
                              case 4 -> 57;
                              case 5 -> 91;
                              default -> 60;
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
                  int var2 = (var0 ^ 7423) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 119;
                        case 1 -> 235;
                        case 2 -> 86;
                        case 3 -> 201;
                        case 4 -> 249;
                        case 5 -> 117;
                        case 6 -> 243;
                        case 7 -> 13;
                        case 8 -> 172;
                        case 9 -> 37;
                        case 10 -> 123;
                        case 11 -> 209;
                        case 12 -> 156;
                        case 13 -> 9;
                        case 14 -> 41;
                        case 15 -> 221;
                        case 16 -> 149;
                        case 17 -> 214;
                        case 18 -> 114;
                        case 19 -> 95;
                        case 20 -> 178;
                        case 21 -> 159;
                        case 22 -> 27;
                        case 23 -> 79;
                        case 24 -> 40;
                        case 25 -> 68;
                        case 26 -> 218;
                        case 27 -> 76;
                        case 28 -> 154;
                        case 29 -> 78;
                        case 30 -> 32;
                        case 31 -> 113;
                        case 32 -> 12;
                        case 33 -> 20;
                        case 34 -> 70;
                        case 35 -> 7;
                        case 36 -> 245;
                        case 37 -> 244;
                        case 38 -> 162;
                        case 39 -> 6;
                        case 40 -> 91;
                        case 41 -> 198;
                        case 42 -> 206;
                        case 43 -> 88;
                        case 44 -> 220;
                        case 45 -> 197;
                        case 46 -> 192;
                        case 47 -> 144;
                        case 48 -> 130;
                        case 49 -> 175;
                        case 50 -> 171;
                        case 51 -> 199;
                        case 52 -> 250;
                        case 53 -> 73;
                        case 54 -> 226;
                        case 55 -> 8;
                        case 56 -> 118;
                        case 57 -> 143;
                        case 58 -> 67;
                        case 59 -> 158;
                        case 60 -> 0;
                        case 61 -> 39;
                        case 62 -> 139;
                        case 63 -> 217;
                        case 64 -> 80;
                        case 65 -> 48;
                        case 66 -> 105;
                        case 67 -> 108;
                        case 68 -> 124;
                        case 69 -> 135;
                        case 70 -> 229;
                        case 71 -> 56;
                        case 72 -> 134;
                        case 73 -> 115;
                        case 74 -> 31;
                        case 75 -> 145;
                        case 76 -> 141;
                        case 77 -> 109;
                        case 78 -> 60;
                        case 79 -> 137;
                        case 80 -> 42;
                        case 81 -> 238;
                        case 82 -> 35;
                        case 83 -> 234;
                        case 84 -> 232;
                        case 85 -> 242;
                        case 86 -> 111;
                        case 87 -> 121;
                        case 88 -> 87;
                        case 89 -> 241;
                        case 90 -> 157;
                        case 91 -> 142;
                        case 92 -> 72;
                        case 93 -> 129;
                        case 94 -> 164;
                        case 95 -> 66;
                        case 96 -> 202;
                        case 97 -> 10;
                        case 98 -> 34;
                        case 99 -> 222;
                        case 100 -> 193;
                        case 101 -> 89;
                        case 102 -> 228;
                        case 103 -> 227;
                        case 104 -> 190;
                        case 105 -> 208;
                        case 106 -> 3;
                        case 107 -> 251;
                        case 108 -> 128;
                        case 109 -> 122;
                        case 110 -> 126;
                        case 111 -> 195;
                        case 112 -> 64;
                        case 113 -> 36;
                        case 114 -> 55;
                        case 115 -> 127;
                        case 116 -> 219;
                        case 117 -> 18;
                        case 118 -> 211;
                        case 119 -> 166;
                        case 120 -> 146;
                        case 121 -> 94;
                        case 122 -> 188;
                        case 123 -> 75;
                        case 124 -> 21;
                        case 125 -> 177;
                        case 126 -> 30;
                        case 127 -> 140;
                        case 128 -> 98;
                        case 129 -> 231;
                        case 130 -> 230;
                        case 131 -> 46;
                        case 132 -> 205;
                        case 133 -> 19;
                        case 134 -> 155;
                        case 135 -> 176;
                        case 136 -> 1;
                        case 137 -> 168;
                        case 138 -> 101;
                        case 139 -> 90;
                        case 140 -> 16;
                        case 141 -> 25;
                        case 142 -> 74;
                        case 143 -> 233;
                        case 144 -> 59;
                        case 145 -> 14;
                        case 146 -> 11;
                        case 147 -> 52;
                        case 148 -> 151;
                        case 149 -> 85;
                        case 150 -> 161;
                        case 151 -> 248;
                        case 152 -> 51;
                        case 153 -> 33;
                        case 154 -> 57;
                        case 155 -> 81;
                        case 156 -> 150;
                        case 157 -> 196;
                        case 158 -> 132;
                        case 159 -> 38;
                        case 160 -> 103;
                        case 161 -> 184;
                        case 162 -> 153;
                        case 163 -> 96;
                        case 164 -> 47;
                        case 165 -> 252;
                        case 166 -> 53;
                        case 167 -> 2;
                        case 168 -> 148;
                        case 169 -> 185;
                        case 170 -> 102;
                        case 171 -> 223;
                        case 172 -> 204;
                        case 173 -> 253;
                        case 174 -> 152;
                        case 175 -> 69;
                        case 176 -> 186;
                        case 177 -> 173;
                        case 178 -> 216;
                        case 179 -> 237;
                        case 180 -> 110;
                        case 181 -> 44;
                        case 182 -> 180;
                        case 183 -> 104;
                        case 184 -> 77;
                        case 185 -> 22;
                        case 186 -> 136;
                        case 187 -> 224;
                        case 188 -> 181;
                        case 189 -> 93;
                        case 190 -> 169;
                        case 191 -> 116;
                        case 192 -> 61;
                        case 193 -> 4;
                        case 194 -> 200;
                        case 195 -> 174;
                        case 196 -> 125;
                        case 197 -> 99;
                        case 198 -> 254;
                        case 199 -> 83;
                        case 200 -> 225;
                        case 201 -> 247;
                        case 202 -> 23;
                        case 203 -> 106;
                        case 204 -> 194;
                        case 205 -> 92;
                        case 206 -> 5;
                        case 207 -> 133;
                        case 208 -> 212;
                        case 209 -> 207;
                        case 210 -> 215;
                        case 211 -> 160;
                        case 212 -> 210;
                        case 213 -> 24;
                        case 214 -> 131;
                        case 215 -> 49;
                        case 216 -> 17;
                        case 217 -> 183;
                        case 218 -> 50;
                        case 219 -> 189;
                        case 220 -> 246;
                        case 221 -> 100;
                        case 222 -> 167;
                        case 223 -> 240;
                        case 224 -> 138;
                        case 225 -> 15;
                        case 226 -> 203;
                        case 227 -> 43;
                        case 228 -> 191;
                        case 229 -> 179;
                        case 230 -> 107;
                        case 231 -> 29;
                        case 232 -> 120;
                        case 233 -> 65;
                        case 234 -> 62;
                        case 235 -> 84;
                        case 236 -> 147;
                        case 237 -> 63;
                        case 238 -> 170;
                        case 239 -> 26;
                        case 240 -> 255;
                        case 241 -> 97;
                        case 242 -> 54;
                        case 243 -> 165;
                        case 244 -> 213;
                        case 245 -> 45;
                        case 246 -> 239;
                        case 247 -> 71;
                        case 248 -> 187;
                        case 249 -> 182;
                        case 250 -> 236;
                        case 251 -> 163;
                        case 252 -> 28;
                        case 253 -> 82;
                        case 254 -> 58;
                        default -> 112;
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
      // PX-FIX 仅签名(不可约简): CFR (.analysis/cfr-out/me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.java:2490) 抛 IllegalStateException("Decompilation failed")；
      // Vineflower (.analysis/vf-retry-out.jar) 同样失败，只给出 635 行字节码注释 (.analysis/agents/A6bs/vf/me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.java:2511-3145)。
      // 权威字节码: javap -p -c -v -cp .analysis/me-octo-only.jar <FQN>，见 .analysis/agents/A6bs/javap.txt:1389 (locals=13)。
      // 需要按字节码人工重建（本次未做：该体 ~500 条指令、13 个局部变量，超出本轮预算）。
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      if (!this.G()) {
         return;
      }
      if (!me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m()) {
         return;
      }
      if (this.ap().level == null) {
         return;
      }
      if (this.ap().player == null) {
         return;
      }
      switch (this.W()) {
      case lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII:
         if (this.aK()) {
            switch (this.aJ().a()) {
            case lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI:
               this.a(me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll, 2000);
               return;
            case IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll:
               me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(3000L, new kotlin.jvm.functions.Function0<kotlin.Unit>() {
                  public kotlin.Unit invoke() {
                     return lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.k(lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.this);
                  }
               });
               return;
            default:
               return;
            }
         }
         return;
      case llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI:
         if (this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl == lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
            if (this.a9() > kotlin.collections.CollectionsKt.getLastIndex(this.ac())) {
               this.br();
               return;
            }
            Object var3 = this.ac().get(this.a9());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var3, "get(...)");
            me.octo.client.IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var2 = (me.octo.client.IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var3;
            switch (var2.b()) {
            case IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII:
               if (me.octo.client.lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a(this, var2, 0.0, (net.minecraft.world.phys.Vec3)null, 6, null)) {
                  int var4 = this.a9();
                  this.a(var4 + 1);
                  me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.e().k();
                  return;
               }
               if (!me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.e().d()) {
                  return;
               }
               me.octo.client.IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.e(), var2.a(), (net.minecraft.world.phys.Vec3)null, false, 6, null);
               return;
            case lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI:
               if (me.octo.client.llIlIlIIlIIlIlIllIIIIIIIIlIIIIlIIlIIllllllIIIllIIllllIlIlllIIIIllIIIIlllllIlIIllllIIl.a(me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.f(), var2.a(), (java.lang.Integer)null, 2, null)) {
                  int var5 = this.a9();
                  this.a(var5 + 1);
               }
               return;
            default:
               return;
            }
         } else {
            this.a(me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll);
         }
         return;
      case IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll:
         if (me.octo.client.llllIIlIIlIIlIlIlIIIIllIIllllllIIlIllIlllIlllllllllIlllIIIIllllIIlIIllIlIIIIlIIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().al() && this.bp() && this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII.a(Integer.valueOf(500))) {
            this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            return;
         }
         if (me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.h() && !me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.i() && !me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.j()) {
         }
         switch (this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII) {
         case IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl:
            var var6 = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
            if (var6 != null && me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.K() != var6.b()) {
               me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b(var6.b());
               return;
            }
            if (!IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll.a()) {
               java.util.ArrayList<me.octo.client.IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> var17 = this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
               java.util.Collection<me.octo.client.IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> var7 = new java.util.ArrayList<me.octo.client.IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll>();
               for (me.octo.client.IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var9 : (java.lang.Iterable<me.octo.client.IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll>)var17) {
                  if (var9.b() == me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
                     var7.add(var9);
                  }
               }
               java.util.List<me.octo.client.IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> var8 = (java.util.List<me.octo.client.IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll>)var7;
               if (var8.isEmpty()) {
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("\u00a7cNo MINE waypoints found in route!");
                  this.N();
                  return;
               }
               me.octo.client.IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var10 = (me.octo.client.IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)kotlin.collections.CollectionsKt.first(var8);
               net.minecraft.world.phys.Vec3 var11 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g(var10.a());
               double var12 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w().distanceTo(var11);
               if (var12 > 2.0) {
                  if (me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.e().d()) {
                     me.octo.client.IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.e(), var10.a(), (net.minecraft.world.phys.Vec3)null, false, 6, null);
                  }
                  return;
               }
               me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.e().k();
               IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll.b(me.octo.client.llllIIlIIlIIlIlIlIIIIllIIllllllIIlIllIlllIlllllllllIlllIIIIllllIIlIIllIlIIIIlIIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.e().al());
               IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll.a(var8, this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl);
               return;
            }
            IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll.e();
            return;
         case lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII:
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("attack", false);
            var var13 = this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
            if (var13 != null && me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.K() != var13.b()) {
               me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b(var13.b());
               this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII.f();
               return;
            }
            if (this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII.a(Integer.valueOf(150))) {
               me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.j();
               this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
               this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII.f();
            }
            if (!IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll.a()) {
               return;
            }
            java.util.List<net.minecraft.world.phys.Vec3> var14 = IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll.i();
            if (!((java.util.Collection<net.minecraft.world.phys.Vec3>)var14).isEmpty()) {
               int var15 = IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll.k();
               int var16 = (var15 + 2) % var14.size();
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, (net.minecraft.world.phys.Vec3)var14.get(var16), false, 2, (Object)null);
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("sprint", true);
            }
            return;
         default:
            throw new kotlin.NoWhenBranchMatchedException();
         }
      }
   }

   @Override
   public void ba() {
if (me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g() == me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll) {
   boolean var1 = false;

   for (me.octo.client.IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var5 : this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI) {
      if (this.a(var5, 2.0)) {
         var1 = true;
         break;
      }
   }

   if (var1) {
      this.a(me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll);
      return;
   }

   if (!this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll.isEmpty()) {
      if (this.a(kotlin.collections.CollectionsKt.last(this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll), 15.0)) {
         me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.e().a(kotlin.collections.CollectionsKt.last(this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll).a(), (net.minecraft.world.phys.Vec3)null, false);
         this.a(me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll);
         return;
      }
   }

   if (this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll.isEmpty()) {
      this.a(me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll);
      return;
   }

   int var2 = this.b(this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll);
   if (var2 >= 0) {
      this.bq();
      this.a(var2);
   } else {
      this.bq();
   }
} else {
   this.a(me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll, 2000);
}
   }

   @Override
   public void M() {
      // PX-FIX 仅签名: 体为空(桩)。CFR(.analysis/cfr-out/me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.java:2792) 与 Vineflower 均不可约简(parsing failure)；
      // 本文件 2751-3243 行保存其 493 行字节码注释；权威字节码见 .analysis/agents/A6bs/javap.txt 中 M() 段。需按字节码人工重建。
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokevirtual me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.aM ()V
      // 004: invokestatic me/octo/client/llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d ()I
      // 007: aload 0
      // 008: aload 0
      // 009: invokespecial me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.bt ()Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 00c: putfield me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 00f: istore 1
      // 010: iload 1
      // 011: ifne 057
      // 014: getstatic me/octo/client/llllIIlIIlIIlIlIlIIIIllIIllllllIIlIllIlllIlllllllllIlllIIIIllllIIlIIllIlIIIIlIIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllIIlIIlIIlIlIlIIIIllIIllllllIIlIllIlllIlllllllllIlllIIIIllllIIlIIllIlIIIIlIIIIlIII;
      // 017: invokevirtual me/octo/client/llllIIlIIlIIlIlIlIIIIllIIllllllIIlIllIlllIlllllllllIlllIIIIllllIIlIIllIlIIIIlIIIIlIII.a ()Lme/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl;
      // 01a: invokevirtual me/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.al ()Z
      // 01d: ifeq 041
      // 020: goto 027
      // 023: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 026: athrow
      // 027: aload 0
      // 028: getstatic me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 02b: getstatic me/octo/client/llllIIlIIlIIlIlIlIIIIllIIllllllIIlIllIlllIlllllllllIlllIIIIllllIIlIIllIlIIIIlIIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllIIlIIlIIlIlIlIIIIllIIllllllIIlIllIlllIlllllllllIlllIIIIllllIIlIIllIlIIIIlIIIIlIII;
      // 02e: invokevirtual me/octo/client/llllIIlIIlIIlIlIlIIIIllIIllllllIIlIllIlllIlllllllllIlllIIIIllllIIlIIllIlIIIIlIIIIlIII.b ()Lme/octo/client/lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII;
      // 031: invokevirtual me/octo/client/lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII.y ()Ljava/lang/String;
      // 034: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.a (Ljava/lang/String;)Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 037: putfield me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 03a: goto 041
      // 03d: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 040: athrow
      // 041: aload 0
      // 042: getstatic me/octo/client/lIllllIlllIlIIIlllllIIlIllIIIIIIIIlIIIlllIlllIllllIllIIIIIllIIIIIIlIIllIIlIIIIllIIllI.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI Lme/octo/client/lIllllIlllIlIIIlllllIIlIllIIIIIIIIlIIIlllIlllIllllIllIIIIIllIIIIIIlIIllIIlIIIIllIIllI;
      // 045: bipush 0
      // 046: invokevirtual me/octo/client/lIllllIlllIlIIIlllllIIlIllIIIIIIIIlIIIlllIlllIllllIllIIIIIllIIIIIIlIIllIIlIIIIllIIllI.a (I)Ljava/util/ArrayList;
      // 049: putfield me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll Ljava/util/ArrayList;
      // 04c: aload 0
      // 04d: getstatic me/octo/client/lIllllIlllIlIIIlllllIIlIllIIIIIIIIlIIIlllIlllIllllIllIIIIIllIIIIIIlIIllIIlIIIIllIIllI.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI Lme/octo/client/lIllllIlllIlIIIlllllIIlIllIIIIIIIIlIIIlllIlllIllllIllIIIIIllIIIIIIlIIllIIlIIIIllIIllI;
      // 050: bipush 1
      // 051: invokevirtual me/octo/client/lIllllIlllIlIIIlllllIIlIllIIIIIIIIlIIIlllIlllIllllIllIIIIIllIIIIIIlIIllIIlIIIIllIIllI.a (I)Ljava/util/ArrayList;
      // 054: putfield me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI Ljava/util/ArrayList;
      // 057: aload 0
      // 058: getfield me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 05b: ifnull 066
      // 05e: bipush 1
      // 05f: goto 067
      // 062: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 065: athrow
      // 066: bipush 0
      // 067: istore 2
      // 068: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
      // 06b: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.g ()Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 06e: ifnull 079
      // 071: bipush 1
      // 072: goto 07a
      // 075: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 078: athrow
      // 079: bipush 0
      // 07a: istore 3
      // 07b: aload 0
      // 07c: getfield me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll Ljava/util/ArrayList;
      // 07f: checkcast java/lang/Iterable
      // 082: astore 5
      // 084: bipush 0
      // 085: istore 6
      // 087: aload 5
      // 089: iload 1
      // 08a: ifne 0c3
      // 08d: instanceof java/util/Collection
      // 090: ifeq 0c1
      // 093: goto 09a
      // 096: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 099: athrow
      // 09a: aload 5
      // 09c: checkcast java/util/Collection
      // 09f: iload 1
      // 0a0: ifne 0c3
      // 0a3: goto 0aa
      // 0a6: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0a9: athrow
      // 0aa: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 0af: ifeq 0c1
      // 0b2: goto 0b9
      // 0b5: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0b8: athrow
      // 0b9: bipush 0
      // 0ba: goto 103
      // 0bd: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0c0: athrow
      // 0c1: aload 5
      // 0c3: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 0c8: astore 7
      // 0ca: aload 7
      // 0cc: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0d1: ifeq 102
      // 0d4: aload 7
      // 0d6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0db: astore 8
      // 0dd: aload 8
      // 0df: checkcast me/octo/client/IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll
      // 0e2: astore 9
      // 0e4: bipush 0
      // 0e5: istore 10
      // 0e7: aload 9
      // 0e9: invokevirtual me/octo/client/IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll.b ()Lme/octo/client/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 0ec: getstatic me/octo/client/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 0ef: if_acmpne 0f6
      // 0f2: bipush 1
      // 0f3: goto 0f7
      // 0f6: bipush 0
      // 0f7: ifeq 0ca
      // 0fa: bipush 1
      // 0fb: iload 1
      // 0fc: ifne 0e5
      // 0ff: goto 103
      // 102: bipush 0
      // 103: istore 4
      // 105: aload 0
      // 106: invokevirtual me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.X ()Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 109: ifnonnull 123
      // 10c: iload 4
      // 10e: iload 1
      // 10f: ifne 124
      // 112: goto 119
      // 115: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 118: athrow
      // 119: ifne 127
      // 11c: goto 123
      // 11f: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 122: athrow
      // 123: bipush 1
      // 124: goto 128
      // 127: bipush 0
      // 128: istore 5
      // 12a: aload 0
      // 12b: getfield me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI Ljava/util/ArrayList;
      // 12e: checkcast java/util/Collection
      // 131: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 136: iload 1
      // 137: ifne 145
      // 13a: ifne 148
      // 13d: goto 144
      // 140: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 143: athrow
      // 144: bipush 1
      // 145: goto 149
      // 148: bipush 0
      // 149: istore 6
      // 14b: aload 0
      // 14c: getfield me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI Ljava/util/ArrayList;
      // 14f: checkcast java/lang/Iterable
      // 152: astore 8
      // 154: bipush 0
      // 155: istore 9
      // 157: aload 8
      // 159: iload 1
      // 15a: ifne 193
      // 15d: instanceof java/util/Collection
      // 160: ifeq 191
      // 163: goto 16a
      // 166: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 169: athrow
      // 16a: aload 8
      // 16c: checkcast java/util/Collection
      // 16f: iload 1
      // 170: ifne 193
      // 173: goto 17a
      // 176: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 179: athrow
      // 17a: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 17f: ifeq 191
      // 182: goto 189
      // 185: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 188: athrow
      // 189: bipush 0
      // 18a: goto 1d3
      // 18d: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 190: athrow
      // 191: aload 8
      // 193: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 198: astore 10
      // 19a: aload 10
      // 19c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1a1: ifeq 1d2
      // 1a4: aload 10
      // 1a6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1ab: astore 11
      // 1ad: aload 11
      // 1af: checkcast me/octo/client/IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll
      // 1b2: astore 12
      // 1b4: bipush 0
      // 1b5: istore 13
      // 1b7: aload 12
      // 1b9: invokevirtual me/octo/client/IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll.b ()Lme/octo/client/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 1bc: getstatic me/octo/client/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 1bf: if_acmpne 1c6
      // 1c2: bipush 1
      // 1c3: goto 1c7
      // 1c6: bipush 0
      // 1c7: ifeq 19a
      // 1ca: bipush 1
      // 1cb: iload 1
      // 1cc: ifne 1b5
      // 1cf: goto 1d3
      // 1d2: bipush 0
      // 1d3: istore 7
      // 1d5: getstatic me/octo/client/llllIIlIIlIIlIlIlIIIIllIIllllllIIlIllIlllIlllllllllIlllIIIIllllIIlIIllIlIIIIlIIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllIIlIIlIIlIlIlIIIIllIIllllllIIlIllIlllIlllllllllIlllIIIIllllIIlIIllIlIIIIlIIIIlIII;
      // 1d8: invokevirtual me/octo/client/llllIIlIIlIIlIlIlIIIIllIIllllllIIlIllIlllIlllllllllIlllIIIIllllIIlIIllIlIIIIlIIIIlIII.a ()Lme/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl;
      // 1db: invokevirtual me/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.al ()Z
      // 1de: iload 1
      // 1df: ifne 202
      // 1e2: ifeq 1fa
      // 1e5: goto 1ec
      // 1e8: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 1eb: athrow
      // 1ec: aload 0
      // 1ed: getfield me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 1f0: ifnull 205
      // 1f3: goto 1fa
      // 1f6: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 1f9: athrow
      // 1fa: bipush 1
      // 1fb: goto 202
      // 1fe: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 201: athrow
      // 202: goto 206
      // 205: bipush 0
      // 206: istore 8
      // 208: iload 2
      // 209: iload 1
      // 20a: ifne 28a
      // 20d: ifeq 289
      // 210: goto 217
      // 213: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 216: athrow
      // 217: iload 3
      // 218: iload 1
      // 219: ifne 28a
      // 21c: goto 223
      // 21f: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 222: athrow
      // 223: ifeq 289
      // 226: goto 22d
      // 229: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 22c: athrow
      // 22d: iload 5
      // 22f: iload 1
      // 230: ifne 28a
      // 233: goto 23a
      // 236: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 239: athrow
      // 23a: ifeq 289
      // 23d: goto 244
      // 240: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 243: athrow
      // 244: iload 6
      // 246: iload 1
      // 247: ifne 28a
      // 24a: goto 251
      // 24d: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 250: athrow
      // 251: ifeq 289
      // 254: goto 25b
      // 257: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 25a: athrow
      // 25b: iload 7
      // 25d: iload 1
      // 25e: ifne 28a
      // 261: goto 268
      // 264: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 267: athrow
      // 268: ifeq 289
      // 26b: goto 272
      // 26e: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 271: athrow
      // 272: iload 8
      // 274: iload 1
      // 275: ifne 28a
      // 278: goto 27f
      // 27b: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 27e: athrow
      // 27f: ifne 3bf
      // 282: goto 289
      // 285: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 288: athrow
      // 289: iload 2
      // 28a: iload 1
      // 28b: ifne 2c7
      // 28e: ifne 2c6
      // 291: goto 298
      // 294: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 297: athrow
      // 298: getstatic me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
      // 29b: ldc2_w 5000
      // 29e: aload 0
      // 29f: invokevirtual me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.aj ()Ljava/lang/String;
      // 2a2: sipush -502
      // 2a5: sipush -5386
      // 2a8: pop2
      // 2a9: ldc_w "No Stonk or pickaxe found in hotbar!"
      // 2ac: getstatic me/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 2af: invokevirtual me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.b (JLjava/lang/String;Ljava/lang/String;Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 2b2: sipush -507
      // 2b5: sipush 5327
      // 2b8: pop2
      // 2b9: ldc_w "§cPlease put a Stonk or pickaxe in your hotbar"
      // 2bc: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 2bf: goto 2c6
      // 2c2: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2c5: athrow
      // 2c6: iload 3
      // 2c7: iload 1
      // 2c8: ifne 2e2
      // 2cb: ifne 2e0
      // 2ce: goto 2d5
      // 2d1: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2d4: athrow
      // 2d5: aload 0
      // 2d6: invokevirtual me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.bg ()V
      // 2d9: goto 2e0
      // 2dc: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2df: athrow
      // 2e0: iload 5
      // 2e2: iload 1
      // 2e3: ifne 314
      // 2e6: ifne 312
      // 2e9: goto 2f0
      // 2ec: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2ef: athrow
      // 2f0: iload 4
      // 2f2: iload 1
      // 2f3: ifne 314
      // 2f6: goto 2fd
      // 2f9: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2fc: athrow
      // 2fd: ifeq 312
      // 300: goto 307
      // 303: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 306: athrow
      // 307: aload 0
      // 308: invokevirtual me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.aP ()V
      // 30b: goto 312
      // 30e: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 311: athrow
      // 312: iload 6
      // 314: iload 1
      // 315: ifne 332
      // 318: ifne 330
      // 31b: goto 322
      // 31e: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 321: athrow
      // 322: getstatic me/octo/client/lIllllIlllIlIIIlllllIIlIllIIIIIIIIlIIIlllIlllIllllIllIIIIIllIIIIIIlIIllIIlIIIIllIIllI.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI Lme/octo/client/lIllllIlllIlIIIlllllIIlIllIIIIIIIIlIIIlllIlllIllllIllIIIIIllIIIIIIlIIllIIlIIIIllIIllI;
      // 325: bipush 1
      // 326: invokevirtual me/octo/client/lIllllIlllIlIIIlllllIIlIllIIIIIIIIlIIIlllIlllIllllIllIIIIIllIIIIIIlIIllIIlIIIIllIIllI.c (I)V
      // 329: goto 330
      // 32c: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 32f: athrow
      // 330: iload 7
      // 332: iload 1
      // 333: ifne 387
      // 336: ifne 385
      // 339: goto 340
      // 33c: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 33f: athrow
      // 340: iload 6
      // 342: iload 1
      // 343: ifne 387
      // 346: goto 34d
      // 349: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 34c: athrow
      // 34d: ifeq 385
      // 350: goto 357
      // 353: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 356: athrow
      // 357: sipush -510
      // 35a: sipush -12493
      // 35d: pop2
      // 35e: ldc_w "§cmine_route must have MINE waypoints!"
      // 361: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 364: getstatic me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
      // 367: ldc2_w 5000
      // 36a: aload 0
      // 36b: invokevirtual me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.aj ()Ljava/lang/String;
      // 36e: sipush -499
      // 371: sipush -17450
      // 374: pop2
      // 375: ldc_w "No MINE waypoints in mine_route"
      // 378: getstatic me/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 37b: invokevirtual me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.b (JLjava/lang/String;Ljava/lang/String;Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 37e: goto 385
      // 381: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 384: athrow
      // 385: iload 8
      // 387: ifne 3ba
      // 38a: getstatic me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
      // 38d: ldc2_w 5000
      // 390: aload 0
      // 391: invokevirtual me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.aj ()Ljava/lang/String;
      // 394: getstatic me/octo/client/llllIIlIIlIIlIlIlIIIIllIIllllllIIlIllIlllIlllllllllIlllIIIIllllIIlIIllIlIIIIlIIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllIIlIIlIIlIlIlIIIIllIIllllllIIlIllIlllIlllllllllIlllIIIIllllIIlIIllIlIIIIlIIIIlIII;
      // 397: invokevirtual me/octo/client/llllIIlIIlIIlIlIlIIIIllIIllllllIIlIllIlllIlllllllllIlllIIIIllllIIlIIllIlIIIIlIIIIlIII.b ()Lme/octo/client/lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII;
      // 39a: invokevirtual me/octo/client/lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII.y ()Ljava/lang/String;
      // 39d: sipush -484
      // 3a0: sipush 9559
      // 3a3: pop2
      // 3a4: ldc_w "Missing: "
      // 3a7: swap
      // 3a8: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 3ad: getstatic me/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 3b0: invokevirtual me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.b (JLjava/lang/String;Ljava/lang/String;Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 3b3: goto 3ba
      // 3b6: invokestatic me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 3b9: athrow
      // 3ba: aload 0
      // 3bb: invokevirtual me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.N ()V
      // 3be: return
      // 3bf: aload 0
      // 3c0: new java/util/ArrayList
      // 3c3: dup
      // 3c4: invokespecial java/util/ArrayList.<init> ()V
      // 3c7: astore 9
      // 3c9: aload 9
      // 3cb: astore 10
      // 3cd: astore 14
      // 3cf: bipush 0
      // 3d0: istore 11
      // 3d2: aload 10
      // 3d4: aload 0
      // 3d5: getfield me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll Ljava/util/ArrayList;
      // 3d8: checkcast java/util/Collection
      // 3db: invokevirtual java/util/ArrayList.addAll (Ljava/util/Collection;)Z
      // 3de: pop
      // 3df: aload 10
      // 3e1: aload 0
      // 3e2: getfield me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI Ljava/util/ArrayList;
      // 3e5: checkcast java/util/Collection
      // 3e8: invokevirtual java/util/ArrayList.addAll (Ljava/util/Collection;)Z
      // 3eb: pop
      // 3ec: nop
      // 3ed: aload 14
      // 3ef: aload 9
      // 3f1: invokevirtual me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/util/ArrayList;)V
      // 3f4: aload 0
      // 3f5: bipush 4
      // 3f6: anewarray 815
      // 3f9: astore 9
      // 3fb: aload 9
      // 3fd: bipush 0
      // 3fe: new me/octo/client/llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI
      // 401: dup
      // 402: getstatic me/octo/client/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 405: aload 0
      // 406: invokedynamic invoke (Lme/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.n (Lme/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI;)Z, ()Ljava/lang/Boolean; ]
      // 40b: bipush 1
      // 40c: invokespecial me/octo/client/llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI.<init> (Lme/octo/client/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;Lkotlin/jvm/functions/Function0;Z)V
      // 40f: aastore
      // 410: aload 9
      // 412: bipush 1
      // 413: new me/octo/client/llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI
      // 416: dup
      // 417: getstatic me/octo/client/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 41a: invokedynamic invoke ()Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.bv ()Z, ()Ljava/lang/Boolean; ]
      // 41f: bipush 0
      // 420: invokespecial me/octo/client/llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI.<init> (Lme/octo/client/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;Lkotlin/jvm/functions/Function0;Z)V
      // 423: aastore
      // 424: aload 9
      // 426: bipush 2
      // 427: new me/octo/client/llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI
      // 42a: dup
      // 42b: getstatic me/octo/client/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 42e: invokedynamic invoke ()Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.bw ()Z, ()Ljava/lang/Boolean; ]
      // 433: bipush 0
      // 434: invokespecial me/octo/client/llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI.<init> (Lme/octo/client/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;Lkotlin/jvm/functions/Function0;Z)V
      // 437: aastore
      // 438: aload 9
      // 43a: bipush 3
      // 43b: new me/octo/client/llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI
      // 43e: dup
      // 43f: getstatic me/octo/client/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 442: invokedynamic invoke ()Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.bx ()Z, ()Ljava/lang/Boolean; ]
      // 447: bipush 0
      // 448: invokespecial me/octo/client/llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI.<init> (Lme/octo/client/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;Lkotlin/jvm/functions/Function0;Z)V
      // 44b: aastore
      // 44c: aload 9
      // 44e: invokestatic kotlin/collections/CollectionsKt.listOf ([Ljava/lang/Object;)Ljava/util/List;
      // 451: invokevirtual me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a (Ljava/util/List;)V
      // 454: aload 0
      // 455: invokespecial me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.M ()V
      // 458: aload 0
      // 459: invokevirtual me/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.ba ()V
      // 45c: return
   }

   @Override
   public void N() {
      this.bs();
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = null;
      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = null;
      super.N();
   }

   @Override
   public void aN() {
      this.bs();
      super.aN();
   }

   @SubscribeEvent(
      priority = EventPriority.HIGH
   )
   public final void a(@NotNull IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var1) {
        boolean bl;
        block7: {
            block8: {
                int n;
                block5: {
                    block6: {
                        int n2 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
                        Intrinsics.checkNotNullParameter((Object)var1, (String)"event");
                        n = n2;
                        try {
                            bl = this.G();
                            if (n == 0) break block5;
                            if (bl) break block6;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a(nullPointerException);
                        }
                        return;
                    }
                    bl = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.a(llllIIlIIlIIlIlIlIIIIllIIllllllIIlIllIlllIlllllllllIlllIIIIllllIIlIIllIlIIIIlIIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.f().al());
                }
                try {
                    if (n == 0) break block7;
                    if (bl) break block8;
                }
                catch (NullPointerException nullPointerException) {
                    throw lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a(nullPointerException);
                }
                return;
            }
            bl = IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll.a();
        }
        if (!bl) {
            return;
        }
        lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.a(var1.k(), IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll.i(), IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll.k());
        lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.a((List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll>)this.ac(), IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll.j(), me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
   }

   @Override
   public boolean af() {
        boolean bl;
        block8: {
            block7: {
                lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI2;
                block6: {
                    int n = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
                    try {
                        try {
                            lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI2 = this;
                            if (n != 0) break block6;
                            if (lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI2.W() != IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) break block7;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a(nullPointerException);
                        }
                        lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI2 = this;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a(nullPointerException);
                    }
                }
                try {
                    if (lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI2.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII != llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) break block7;
                    bl = true;
                    break block8;
                }
                catch (NullPointerException nullPointerException) {
                    throw lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a(nullPointerException);
                }
            }
            bl = false;
        }
        return bl;
   }

   private final me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll bt() {
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      if (var1 == 0) {
         return null;
      }

      LocalPlayer var2 = this.ap().player;
      if (var2 == null) {
         return null;
      }

      Inventory var3 = var2.getInventory();
      if (var3 == null) {
         return null;
      }

      for (int var4 = 0; var4 < 9; var4++) {
         ItemStack var5 = var3.getItem(var4);
         if (var5.isEmpty()) {
            continue;
         }
         String var6 = var5.getHoverName().getString();
         if (var6.contains("Stonk")) {
            return new me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               var5, var4, me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            );
         }
      }

      List<String> var7 = CollectionsKt.listOf("Pickaxe", "Drill", "Gauntlet", "Pickonimbus");
      for (int var8 = 0; var8 < 9; var8++) {
         ItemStack var9 = var3.getItem(var8);
         if (var9.isEmpty()) {
            continue;
         }
         String var10 = var9.getHoverName().getString();
         for (String var11 : var7) {
            if (var10.contains(var11)) {
               return new me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                  var9, var8, me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
               );
            }
         }
      }

      return null;
   }

   private final boolean bp() {
      int var1 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      if (var1 == 0) {
         return false;
      }
      net.minecraft.client.player.LocalPlayer var2 = this.ap().player;
      if (var2 == null) {
         return false;
      }
      net.minecraft.client.multiplayer.ClientLevel var3 = this.ap().level;
      if (var3 == null) {
         return false;
      }
      double var4 = 5.0;
      Function1 var5 = var6 -> lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a((Endermite)var6);
      List var7 = var3.getEntitiesOfClass(Endermite.class, new net.minecraft.world.phys.AABB(var2.getX() - var4, var2.getY() - var4, var2.getZ() - var4, var2.getX() + var4, var2.getY() + var4, var2.getZ() + var4), (java.util.function.Predicate<Object>)(var8 -> lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a(var5, var8)));
      Intrinsics.checkNotNullExpressionValue(var7, "getEntitiesOfClass(...)");
      return var7.size() >= 3;
   }

    private final void bq() {
        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.e().k();
        this.a(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI);
        this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl = lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        this.a(this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll);
        this.a(0);
    }

    private final void br() {
        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.e().k();
        this.a(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI);
        this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl = lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
        this.a(this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI);
        this.a(0);
    }

    private final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll iIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll) {
        this.ae().a(new lllIllIIllIIIIIIIlIIlIIIIIllllIlIIIIIllllIIlIIIIlllIIIIIIlIIIIlIlIIIIllIIllIIlllIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll, () -> lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.l(this), iIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll.d(), 5000, 2000, 30000L, 3, () -> lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.m(this)));
    }

    private final void bs() {
        block4: {
            block5: {
                int n = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
                try {
                    try {
                        if (n == 0) break block4;
                        if (!IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll.a()) break block5;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a(nullPointerException);
                    }
                    IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll.h();
                }
                catch (NullPointerException nullPointerException) {
                    throw lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a(nullPointerException);
                }
            }
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.p();
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("attack", false);
            IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.e().k();
            this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        }
    }

   public static final lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI bz() {
      return lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl;
   }

   public static final lIllIIIllIllllllIIIIIlIIIIIlIllIIlllIllIIllIlIIIIIIIlIlllIlIIIllIIlIlIIIIIIlIlIIlIIlI bA() {
      return IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll;
   }

   public static final void a(lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI p0, IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p1) {
      p0.a(p1);
   }

   private static final long a(lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI var0) {
      return var0.aJ().b() + 15000L;
   }

   private static final Object b(lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI var0) {
      return TuplesKt.to(
         var0.aJ().a(),
         IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
      );
   }

   private static final Object c(lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI var0) {
      return new lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
         var0.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl,
         var0.a9(),
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(var0, 0.0, 1, null)
      );
   }

   private static final boolean d(lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI param0) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll.a() || param0.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII != llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) break block4;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a(nullPointerException);
                    }
                    bl = true;
                    break block5;
                }
                catch (NullPointerException nullPointerException) {
                    throw lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a(nullPointerException);
                }
            }
            bl = false;
        }
        return bl;
   }

   private static final Object e(lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI var0) {
      return new lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .K(),
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(var0, 0.0, 1, null)
      );
   }

   private static final boolean f(lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI param0) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll.a() || param0.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII != llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) break block4;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a(nullPointerException);
                    }
                    bl = true;
                    break block5;
                }
                catch (NullPointerException nullPointerException) {
                    throw lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a(nullPointerException);
                }
            }
            bl = false;
        }
        return bl;
   }

   private static final Object g(lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI var0) {
      return new lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll.k(),
         IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll.j(),
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(var0, 0.0, 1, null)
      );
   }

   private static final boolean h(lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI param0) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll.a() || param0.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII != llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) break block4;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a(nullPointerException);
                    }
                    bl = true;
                    break block5;
                }
                catch (NullPointerException nullPointerException) {
                    throw lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a(nullPointerException);
                }
            }
            bl = false;
        }
        return bl;
   }

   private static final Object bu() {
      return IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .s();
   }

   private static final boolean i(lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI var0) {
      try {
         if (var0.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII
            == lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )
          {
            return true;
         }
      } catch (NullPointerException var1) {
         throw (RuntimeException)a(var1);
      }

      return false;
   }

   private static final Object j(lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI var0) {
      return new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.K(), var0.bp());
   }

   private static final Unit k(lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI param0) {
        block4: {
            try {
                try {
                    if (!param0.G() || IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g() != me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll) break block4;
                }
                catch (NullPointerException nullPointerException) {
                    throw lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a(nullPointerException);
                }
                param0.ba();
            }
            catch (NullPointerException nullPointerException) {
                throw lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a(nullPointerException);
            }
        }
        return Unit.INSTANCE;
   }

   private static final boolean a(Endermite var0) {
      short var10001 = -506;
      short var10002 = -25870;
      Intrinsics.checkNotNullParameter(var0, "it");
      return true;
   }

   private static final boolean a(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final Unit l(lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI var0) {
      var0.ba();
      return Unit.INSTANCE;
   }

   private static final Unit m(lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI var0) {
      var0.bs();
      return Unit.INSTANCE;
   }

   private static final boolean n(lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI param0) {
        boolean bl;
        block8: {
            block7: {
                int n;
                block6: {
                    n = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
                    try {
                        try {
                            bl = param0.af();
                            if (n != 0) break block6;
                            if (!bl) break block7;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a(nullPointerException);
                        }
                        bl = lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.b();
                    }
                    catch (NullPointerException nullPointerException) {
                        throw lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a(nullPointerException);
                    }
                }
                try {
                    if (n != 0) break block8;
                    if (!bl) break block7;
                }
                catch (NullPointerException nullPointerException) {
                    throw lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.a(nullPointerException);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
   }

   private static final boolean bv() {
      return IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .e();
   }

   private static final boolean bw() {
      return IlllIIIIlIlllIlllllIlIlIIllIlllIlIIllllllIlllllIllIllllIllIIIllIIlIlIlllIIlIllIIlIlll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .a();
   }

   private static final boolean bx() {
      return IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .a();
   }

   @NotNull
   public static final lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI by() {
      return IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll.a();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[31];
      int var3 = 0;
      String var2 = "\u0000E[ñ\u0082/ £ù%\\³ÀuH\u0012Ù\u001aÀÁ°f\u008e{\u0080.\u0012öðë\u0087\u000f`×º\u0090>M\u00999èå¦9|\u0086v\u0001e\u0002@\u0013¨\u0017±IÊî\u0006\u0005?(±h\u00adáÙ<×\u008b1\u008fæ'@\u0092\u000bY&\fÌx\u009côÏdF\u0017è\u00860\u0086À\bô]©æØ\b!Â0\bFå¯ÎÐÎÂ\f/dÈÖÅ\u009e\tàÕÍ¥)\u0005Tåô°q\u000e²G{¨³\u001fÃcA5W÷n\u001a\u0006\u009fD\u0018ÉÈ^\tó\u0018;îAï-¶\u0014\u0005_\u008c\u009c\u001bé\u0006Ï\u009cD^\u0088º\u0019AÇs¡\u0087%\u0080âí\rË¹\u0095×úDØæhG\u0081r@\u001ci\u000b\u0098¦ø!-\rh½1Ð¡\f0?+½¹ó\u0086M$x\u009b\u009f\u000fpXURC[\u0018-þô¾\u0087ß \u0097\u0007\u0016W)\u001f\u0019Ü-\u000e*îh\u009dÑ¹\u008f·È¯f¤Hp\u0018êÂ\u0006\u0001)1U`W]\u0094´}\u0091ºÁ\u001d´à\u008cÊ\u00ad\fÝ$\u0090Äg\u0093îeo\u0097tI\u0002ÙMPf?pCt~\u0007V%ôÁOø\u0085©a¬ç'&\u009ez\u0010Ë2\"\u001f\u00adòÅ\u0018ERÏN#¥\u009ez\u0012%Kÿ0\u0016\u0017²¤«Å\u0007¾\u009cýPø9à\u0007&P\u00ad\u0095k¹Â\u0006\u009d_XªÀ2\u001f\u0018]v¾ñ<=ò'ÉÞV£ûJUKªO^«×\"\u0086¿~\r2:ª+\u0005>¢C\u001aÓ#\u00077/\\\u0010\u0005IØ\u0016n\u0082Úñ@Õ\u0005\u0084J\u0012Ò\u001fÃ&F¡\u0019ôO(\"\u009c×7\u0005\u001b&\u000b2\u008dúM?s\u008e¯JÙ¥ 6\u0097o\u008f\n1E\u0013Rà\u001c«{\u0011îj\u0082\u007f·\u0084 Zö\u0081×\b\u007f²ç¯\u0001{\u0099(\bë¨P.\u008c\u0087rà\u000fP\u009bQ*ÃT\bÌüÈÁ\u000eþØm";
      int var4 = "\u0000E[ñ\u0082/ £ù%\\³ÀuH\u0012Ù\u001aÀÁ°f\u008e{\u0080.\u0012öðë\u0087\u000f`×º\u0090>M\u00999èå¦9|\u0086v\u0001e\u0002@\u0013¨\u0017±IÊî\u0006\u0005?(±h\u00adáÙ<×\u008b1\u008fæ'@\u0092\u000bY&\fÌx\u009côÏdF\u0017è\u00860\u0086À\bô]©æØ\b!Â0\bFå¯ÎÐÎÂ\f/dÈÖÅ\u009e\tàÕÍ¥)\u0005Tåô°q\u000e²G{¨³\u001fÃcA5W÷n\u001a\u0006\u009fD\u0018ÉÈ^\tó\u0018;îAï-¶\u0014\u0005_\u008c\u009c\u001bé\u0006Ï\u009cD^\u0088º\u0019AÇs¡\u0087%\u0080âí\rË¹\u0095×úDØæhG\u0081r@\u001ci\u000b\u0098¦ø!-\rh½1Ð¡\f0?+½¹ó\u0086M$x\u009b\u009f\u000fpXURC[\u0018-þô¾\u0087ß \u0097\u0007\u0016W)\u001f\u0019Ü-\u000e*îh\u009dÑ¹\u008f·È¯f¤Hp\u0018êÂ\u0006\u0001)1U`W]\u0094´}\u0091ºÁ\u001d´à\u008cÊ\u00ad\fÝ$\u0090Äg\u0093îeo\u0097tI\u0002ÙMPf?pCt~\u0007V%ôÁOø\u0085©a¬ç'&\u009ez\u0010Ë2\"\u001f\u00adòÅ\u0018ERÏN#¥\u009ez\u0012%Kÿ0\u0016\u0017²¤«Å\u0007¾\u009cýPø9à\u0007&P\u00ad\u0095k¹Â\u0006\u009d_XªÀ2\u001f\u0018]v¾ñ<=ò'ÉÞV£ûJUKªO^«×\"\u0086¿~\r2:ª+\u0005>¢C\u001aÓ#\u00077/\\\u0010\u0005IØ\u0016n\u0082Úñ@Õ\u0005\u0084J\u0012Ò\u001fÃ&F¡\u0019ôO(\"\u009c×7\u0005\u001b&\u000b2\u008dúM?s\u008e¯JÙ¥ 6\u0097o\u008f\n1E\u0013Rà\u001c«{\u0011îj\u0082\u007f·\u0084 Zö\u0081×\b\u007f²ç¯\u0001{\u0099(\bë¨P.\u008c\u0087rà\u000fP\u009bQ*ÃT\bÌüÈÁ\u000eþØm"
         .length();
      char var1 = 14;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 61;
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
                     case 0 -> 35;
                     case 1 -> 34;
                     case 2 -> 44;
                     case 3 -> 4;
                     case 4 -> 77;
                     case 5 -> 91;
                     default -> 21;
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
                     k = new String[31];
                     IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = new lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl = new lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI();
                     IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll = new lIllIIIllIllllllIIIIIlIIIIIlIllIIlllIllIIllIlIIIIIIIlIlllIlIIIllIIlIlIIIIIIlIlIIlIIlI();
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

                  var2 = "\u0090ô.îÐ\u0081.Ð\u0089\u000bFË.\u007f\u0010Ø2@Ï\u0007ø«:]qjÓVè\u001b\u0099RÚ=[ØíÔ8F{oKu\u0089àFØÃ";
                  var4 = "\u0090ô.îÐ\u0081.Ð\u0089\u000bFË.\u007f\u0010Ø2@Ï\u0007ø«:]qjÓVè\u001b\u0099RÚ=[ØíÔ8F{oKu\u0089àFØÃ".length();
                  var1 = 2;
                  var8 = -1;
            }

            var10000 = 49;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static NullPointerException a(NullPointerException var0) {
      return var0;
   }

   private static String e(int var0, int var1) {
      int var2 = (var0 ^ -485) & 65535;
      if (k[var2] == null) {
         char[] var3 = j[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 99;
            case 1 -> 169;
            case 2 -> 160;
            case 3 -> 242;
            case 4 -> 34;
            case 5 -> 222;
            case 6 -> 142;
            case 7 -> 48;
            case 8 -> 82;
            case 9 -> 130;
            case 10 -> 128;
            case 11 -> 147;
            case 12 -> 213;
            case 13 -> 206;
            case 14 -> 230;
            case 15 -> 20;
            case 16 -> 251;
            case 17 -> 149;
            case 18 -> 151;
            case 19 -> 170;
            case 20 -> 74;
            case 21 -> 129;
            case 22 -> 71;
            case 23 -> 164;
            case 24 -> 200;
            case 25 -> 90;
            case 26 -> 52;
            case 27 -> 37;
            case 28 -> 47;
            case 29 -> 217;
            case 30 -> 122;
            case 31 -> 119;
            case 32 -> 35;
            case 33 -> 178;
            case 34 -> 126;
            case 35 -> 228;
            case 36 -> 172;
            case 37 -> 88;
            case 38 -> 111;
            case 39 -> 89;
            case 40 -> 162;
            case 41 -> 163;
            case 42 -> 55;
            case 43 -> 168;
            case 44 -> 144;
            case 45 -> 6;
            case 46 -> 107;
            case 47 -> 167;
            case 48 -> 223;
            case 49 -> 157;
            case 50 -> 244;
            case 51 -> 36;
            case 52 -> 44;
            case 53 -> 154;
            case 54 -> 161;
            case 55 -> 18;
            case 56 -> 69;
            case 57 -> 203;
            case 58 -> 173;
            case 59 -> 1;
            case 60 -> 43;
            case 61 -> 73;
            case 62 -> 231;
            case 63 -> 204;
            case 64 -> 118;
            case 65 -> 133;
            case 66 -> 72;
            case 67 -> 62;
            case 68 -> 202;
            case 69 -> 211;
            case 70 -> 25;
            case 71 -> 198;
            case 72 -> 234;
            case 73 -> 153;
            case 74 -> 152;
            case 75 -> 125;
            case 76 -> 63;
            case 77 -> 19;
            case 78 -> 224;
            case 79 -> 124;
            case 80 -> 15;
            case 81 -> 38;
            case 82 -> 32;
            case 83 -> 114;
            case 84 -> 53;
            case 85 -> 65;
            case 86 -> 135;
            case 87 -> 246;
            case 88 -> 17;
            case 89 -> 139;
            case 90 -> 110;
            case 91 -> 192;
            case 92 -> 134;
            case 93 -> 117;
            case 94 -> 123;
            case 95 -> 137;
            case 96 -> 58;
            case 97 -> 59;
            case 98 -> 146;
            case 99 -> 209;
            case 100 -> 76;
            case 101 -> 41;
            case 102 -> 190;
            case 103 -> 39;
            case 104 -> 193;
            case 105 -> 30;
            case 106 -> 87;
            case 107 -> 238;
            case 108 -> 12;
            case 109 -> 100;
            case 110 -> 51;
            case 111 -> 83;
            case 112 -> 86;
            case 113 -> 184;
            case 114 -> 249;
            case 115 -> 148;
            case 116 -> 4;
            case 117 -> 226;
            case 118 -> 127;
            case 119 -> 105;
            case 120 -> 143;
            case 121 -> 42;
            case 122 -> 214;
            case 123 -> 218;
            case 124 -> 70;
            case 125 -> 13;
            case 126 -> 156;
            case 127 -> 220;
            case 128 -> 40;
            case 129 -> 221;
            case 130 -> 7;
            case 131 -> 255;
            case 132 -> 78;
            case 133 -> 109;
            case 134 -> 194;
            case 135 -> 14;
            case 136 -> 205;
            case 137 -> 229;
            case 138 -> 237;
            case 139 -> 215;
            case 140 -> 250;
            case 141 -> 181;
            case 142 -> 54;
            case 143 -> 207;
            case 144 -> 179;
            case 145 -> 0;
            case 146 -> 24;
            case 147 -> 10;
            case 148 -> 104;
            case 149 -> 98;
            case 150 -> 159;
            case 151 -> 112;
            case 152 -> 208;
            case 153 -> 141;
            case 154 -> 239;
            case 155 -> 132;
            case 156 -> 185;
            case 157 -> 8;
            case 158 -> 245;
            case 159 -> 254;
            case 160 -> 61;
            case 161 -> 155;
            case 162 -> 23;
            case 163 -> 235;
            case 164 -> 28;
            case 165 -> 113;
            case 166 -> 247;
            case 167 -> 93;
            case 168 -> 56;
            case 169 -> 241;
            case 170 -> 196;
            case 171 -> 84;
            case 172 -> 188;
            case 173 -> 96;
            case 174 -> 50;
            case 175 -> 120;
            case 176 -> 233;
            case 177 -> 66;
            case 178 -> 81;
            case 179 -> 187;
            case 180 -> 225;
            case 181 -> 182;
            case 182 -> 186;
            case 183 -> 29;
            case 184 -> 103;
            case 185 -> 101;
            case 186 -> 195;
            case 187 -> 166;
            case 188 -> 97;
            case 189 -> 252;
            case 190 -> 16;
            case 191 -> 219;
            case 192 -> 121;
            case 193 -> 79;
            case 194 -> 180;
            case 195 -> 45;
            case 196 -> 248;
            case 197 -> 175;
            case 198 -> 138;
            case 199 -> 131;
            case 200 -> 31;
            case 201 -> 189;
            case 202 -> 3;
            case 203 -> 106;
            case 204 -> 27;
            case 205 -> 68;
            case 206 -> 60;
            case 207 -> 197;
            case 208 -> 199;
            case 209 -> 49;
            case 210 -> 236;
            case 211 -> 2;
            case 212 -> 5;
            case 213 -> 174;
            case 214 -> 253;
            case 215 -> 171;
            case 216 -> 145;
            case 217 -> 240;
            case 218 -> 165;
            case 219 -> 210;
            case 220 -> 177;
            case 221 -> 77;
            case 222 -> 108;
            case 223 -> 85;
            case 224 -> 26;
            case 225 -> 95;
            case 226 -> 150;
            case 227 -> 102;
            case 228 -> 94;
            case 229 -> 191;
            case 230 -> 22;
            case 231 -> 21;
            case 232 -> 11;
            case 233 -> 33;
            case 234 -> 80;
            case 235 -> 140;
            case 236 -> 46;
            case 237 -> 183;
            case 238 -> 232;
            case 239 -> 64;
            case 240 -> 92;
            case 241 -> 115;
            case 242 -> 67;
            case 243 -> 136;
            case 244 -> 227;
            case 245 -> 9;
            case 246 -> 176;
            case 247 -> 91;
            case 248 -> 57;
            case 249 -> 216;
            case 250 -> 243;
            case 251 -> 158;
            case 252 -> 116;
            case 253 -> 212;
            case 254 -> 201;
            default -> 75;
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

   public static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(Object... px) {
        }
      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll() {
      }

      @NotNull
      public final lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI a() {
         return lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl;
      }

      @NotNull
      public final lIllIIIllIllllllIIIIIlIIIIIlIllIIlllIllIIllIlIIIIIIIlIlllIlIIIllIIlIlIIIIIIlIlIIlIIlI c() {
         return lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll;
      }
   
  // PX-FIX synth restored from jar bytecode
  // PX-FIX synth restored from jar bytecode: bare return
  public static void b() { }
}

   private static final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] a;
      private static String[] b;

      public IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(int var1, boolean var2) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      }

      public final int a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final boolean b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int c() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final boolean d() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(
         int var1, boolean var2
      ) {
         return new lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
            var1, var2
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10002 = -25265;
         short var10003 = -14762;
         var10003 = -25266;
         short var10004 = 21512;
         return "KillProgress(heldSlot="
            + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            + ", endermitesNearby="
            + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         return var1 * 31 + Boolean.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int var2 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
         Object var10000 = this;
         if (var2 == 0) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == 0) {
            if (!(
               var10000 instanceof lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var3 = (lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)var10000;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         int var10001 = var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var2 == 0) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = ((this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) ? 1 : 0);
            if (var2 != 0) {
               return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            var10001 = ((var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) ? 1 : 0);
         }

         return !(var4 != var10001);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: {
         String[] var5 = new String[2];
         int var3 = 0;
         String var2 = "T´78¿\u0013bÄ÷\u00857âT\u0089?s¹Z[\u009a^\u0011\u0013\f\u0006¾\f\u0092ÀhA\u0013oÅ\u008c¸I\fÙ]øP";
         int var4 = "T´78¿\u0013bÄ÷\u00857âT\u0089?s¹Z[\u009a^\u0011\u0013\f\u0006¾\f\u0092ÀhA\u0013oÅ\u008c¸I\fÙ]øP".length();
         char var1 = 22;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 9;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 9;
                  var10006 = var6;
               } else {
                  var13 = 9;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 9;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 61;
                     case 1 -> 79;
                     case 2 -> 124;
                     case 3 -> 71;
                     case 4 -> 79;
                     case 5 -> 71;
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
               b = new String[2];
               break pxClinit;
            }

            var1 = var2.charAt(var0);
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -25265) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 121;
               case 1 -> 201;
               case 2 -> 247;
               case 3 -> 196;
               case 4 -> 25;
               case 5 -> 11;
               case 6 -> 214;
               case 7 -> 149;
               case 8 -> 187;
               case 9 -> 108;
               case 10 -> 245;
               case 11 -> 7;
               case 12 -> 162;
               case 13 -> 212;
               case 14 -> 228;
               case 15 -> 211;
               case 16 -> 57;
               case 17 -> 116;
               case 18 -> 56;
               case 19 -> 77;
               case 20 -> 254;
               case 21 -> 178;
               case 22 -> 197;
               case 23 -> 153;
               case 24 -> 176;
               case 25 -> 218;
               case 26 -> 129;
               case 27 -> 182;
               case 28 -> 53;
               case 29 -> 125;
               case 30 -> 84;
               case 31 -> 58;
               case 32 -> 61;
               case 33 -> 79;
               case 34 -> 215;
               case 35 -> 216;
               case 36 -> 97;
               case 37 -> 69;
               case 38 -> 174;
               case 39 -> 217;
               case 40 -> 171;
               case 41 -> 78;
               case 42 -> 147;
               case 43 -> 8;
               case 44 -> 156;
               case 45 -> 104;
               case 46 -> 105;
               case 47 -> 145;
               case 48 -> 150;
               case 49 -> 70;
               case 50 -> 186;
               case 51 -> 123;
               case 52 -> 167;
               case 53 -> 170;
               case 54 -> 132;
               case 55 -> 4;
               case 56 -> 244;
               case 57 -> 23;
               case 58 -> 1;
               case 59 -> 37;
               case 60 -> 240;
               case 61 -> 189;
               case 62 -> 255;
               case 63 -> 67;
               case 64 -> 81;
               case 65 -> 52;
               case 66 -> 48;
               case 67 -> 124;
               case 68 -> 138;
               case 69 -> 246;
               case 70 -> 126;
               case 71 -> 13;
               case 72 -> 127;
               case 73 -> 96;
               case 74 -> 31;
               case 75 -> 249;
               case 76 -> 166;
               case 77 -> 115;
               case 78 -> 131;
               case 79 -> 38;
               case 80 -> 234;
               case 81 -> 103;
               case 82 -> 179;
               case 83 -> 94;
               case 84 -> 136;
               case 85 -> 133;
               case 86 -> 34;
               case 87 -> 163;
               case 88 -> 252;
               case 89 -> 205;
               case 90 -> 192;
               case 91 -> 224;
               case 92 -> 239;
               case 93 -> 202;
               case 94 -> 198;
               case 95 -> 177;
               case 96 -> 43;
               case 97 -> 199;
               case 98 -> 172;
               case 99 -> 165;
               case 100 -> 35;
               case 101 -> 180;
               case 102 -> 66;
               case 103 -> 16;
               case 104 -> 190;
               case 105 -> 73;
               case 106 -> 137;
               case 107 -> 17;
               case 108 -> 183;
               case 109 -> 15;
               case 110 -> 110;
               case 111 -> 80;
               case 112 -> 230;
               case 113 -> 99;
               case 114 -> 122;
               case 115 -> 194;
               case 116 -> 151;
               case 117 -> 111;
               case 118 -> 100;
               case 119 -> 117;
               case 120 -> 90;
               case 121 -> 87;
               case 122 -> 238;
               case 123 -> 63;
               case 124 -> 59;
               case 125 -> 5;
               case 126 -> 148;
               case 127 -> 75;
               case 128 -> 242;
               case 129 -> 220;
               case 130 -> 102;
               case 131 -> 175;
               case 132 -> 50;
               case 133 -> 130;
               case 134 -> 207;
               case 135 -> 140;
               case 136 -> 227;
               case 137 -> 32;
               case 138 -> 22;
               case 139 -> 193;
               case 140 -> 109;
               case 141 -> 219;
               case 142 -> 68;
               case 143 -> 221;
               case 144 -> 89;
               case 145 -> 114;
               case 146 -> 98;
               case 147 -> 231;
               case 148 -> 44;
               case 149 -> 173;
               case 150 -> 135;
               case 151 -> 106;
               case 152 -> 119;
               case 153 -> 222;
               case 154 -> 49;
               case 155 -> 6;
               case 156 -> 152;
               case 157 -> 42;
               case 158 -> 29;
               case 159 -> 226;
               case 160 -> 54;
               case 161 -> 2;
               case 162 -> 209;
               case 163 -> 191;
               case 164 -> 164;
               case 165 -> 88;
               case 166 -> 235;
               case 167 -> 93;
               case 168 -> 157;
               case 169 -> 36;
               case 170 -> 21;
               case 171 -> 27;
               case 172 -> 141;
               case 173 -> 213;
               case 174 -> 92;
               case 175 -> 243;
               case 176 -> 168;
               case 177 -> 229;
               case 178 -> 71;
               case 179 -> 233;
               case 180 -> 14;
               case 181 -> 20;
               case 182 -> 203;
               case 183 -> 128;
               case 184 -> 51;
               case 185 -> 250;
               case 186 -> 206;
               case 187 -> 251;
               case 188 -> 146;
               case 189 -> 139;
               case 190 -> 33;
               case 191 -> 236;
               case 192 -> 158;
               case 193 -> 120;
               case 194 -> 60;
               case 195 -> 113;
               case 196 -> 62;
               case 197 -> 26;
               case 198 -> 159;
               case 199 -> 195;
               case 200 -> 154;
               case 201 -> 210;
               case 202 -> 83;
               case 203 -> 86;
               case 204 -> 204;
               case 205 -> 18;
               case 206 -> 76;
               case 207 -> 169;
               case 208 -> 188;
               case 209 -> 46;
               case 210 -> 82;
               case 211 -> 74;
               case 212 -> 41;
               case 213 -> 155;
               case 214 -> 55;
               case 215 -> 72;
               case 216 -> 28;
               case 217 -> 143;
               case 218 -> 107;
               case 219 -> 181;
               case 220 -> 232;
               case 221 -> 12;
               case 222 -> 30;
               case 223 -> 134;
               case 224 -> 64;
               case 225 -> 161;
               case 226 -> 91;
               case 227 -> 0;
               case 228 -> 208;
               case 229 -> 40;
               case 230 -> 45;
               case 231 -> 3;
               case 232 -> 237;
               case 233 -> 184;
               case 234 -> 9;
               case 235 -> 225;
               case 236 -> 85;
               case 237 -> 185;
               case 238 -> 112;
               case 239 -> 24;
               case 240 -> 95;
               case 241 -> 241;
               case 242 -> 142;
               case 243 -> 118;
               case 244 -> 223;
               case 245 -> 253;
               case 246 -> 10;
               case 247 -> 39;
               case 248 -> 65;
               case 249 -> 47;
               case 250 -> 144;
               case 251 -> 160;
               case 252 -> 200;
               case 253 -> 19;
               case 254 -> 101;
               default -> 248;
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
   
    public static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var0, int var1, boolean var2, int var3, Object var4) {
        if ((var3 & 1) != 0) {
            var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        }
        if ((var3 & 2) != 0) {
            var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
        }
        return var0.a(var1, var2);
    }}

   private static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final Triple<Integer, Integer, Integer> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         int var1, int var2, @NotNull Triple<Integer, Integer, Integer> var3
      ) {
         short var10001 = -20407;
         short var10002 = 32076;
         Intrinsics.checkNotNullParameter(var3, "playerPos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      }

      public final int a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final int d() {
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
      public final lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         int var1, int var2, @NotNull Triple<Integer, Integer, Integer> var3
      ) {
         short var10001 = -20404;
         short var10002 = -23152;
         Intrinsics.checkNotNullParameter(var3, "playerPos");
         return new lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -20402;
         Triple var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 15799;
         short var10002 = -20401;
         short var10003 = -10806;
         short var10004 = -20403;
         short var10005 = 5311;
         return "BotProgress(pathIndex=" + var3 + ", waypointIndex=" + var2 + ", playerPos=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var1 = var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         return var1 * 31 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
      Object var4 = null; // PX-FIX
         int var2 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
         Object var10000 = this;
         if (var2 == 0) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == 0) {
            if (!(
               var10000 instanceof lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = var1;
         }

         label48: {
            lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
            var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            int var10001 = var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            if (var2 == 0) {
               if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
                  return false;
               }

               var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               if (var2 != 0) {
                  break label48;
               }

               var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            if ((Boolean)var4 != ((var10001 == 0))) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            );
         }

         if (var2 == 0) {
            if (((Boolean)(var4))) {
               return false;
            }

            var4 = 1;
         }

         return (boolean)var4;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[5];
         int var3 = 0;
         String var2 = "RmX\u009eÎ ÄÙÅ£ê\u0011\tÃ²¬µgy@\u0095å\u0010Å\u009a\u00adm\u008f{ý\u0091\u0097Écw\u0083\u001d\t\u0093";
         int var4 = "RmX\u009eÎ ÄÙÅ£ê\u0011\tÃ²¬µgy@\u0095å\u0010Å\u009a\u00adm\u008f{ý\u0091\u0097Écw\u0083\u001d\t\u0093".length();
         char var1 = '\f';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 123;
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
                        case 0 -> 23;
                        case 1 -> 81;
                        case 2 -> 61;
                        case 3 -> 69;
                        case 4 -> 105;
                        case 5 -> 87;
                        default -> 12;
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
                        b = new String[5];
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

                     var2 = "(ÉkKäl)OÔ¶\u0080âMþ\u0091å\u0091\u00177\u0014\u0098D\t¢Ï[ÁB,?äÑ";
                     var4 = "(ÉkKäl)OÔ¶\u0080âMþ\u0091å\u0091\u00177\u0014\u0098D\t¢Ï[ÁB,?äÑ".length();
                     var1 = 22;
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
         int var2 = (var0 ^ -20403) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 61;
               case 1 -> 152;
               case 2 -> 214;
               case 3 -> 63;
               case 4 -> 166;
               case 5 -> 155;
               case 6 -> 28;
               case 7 -> 216;
               case 8 -> 144;
               case 9 -> 141;
               case 10 -> 34;
               case 11 -> 232;
               case 12 -> 112;
               case 13 -> 0;
               case 14 -> 84;
               case 15 -> 230;
               case 16 -> 93;
               case 17 -> 199;
               case 18 -> 92;
               case 19 -> 118;
               case 20 -> 21;
               case 21 -> 85;
               case 22 -> 169;
               case 23 -> 175;
               case 24 -> 113;
               case 25 -> 231;
               case 26 -> 44;
               case 27 -> 20;
               case 28 -> 156;
               case 29 -> 98;
               case 30 -> 207;
               case 31 -> 52;
               case 32 -> 105;
               case 33 -> 51;
               case 34 -> 183;
               case 35 -> 90;
               case 36 -> 104;
               case 37 -> 40;
               case 38 -> 153;
               case 39 -> 163;
               case 40 -> 50;
               case 41 -> 117;
               case 42 -> 89;
               case 43 -> 66;
               case 44 -> 246;
               case 45 -> 148;
               case 46 -> 32;
               case 47 -> 3;
               case 48 -> 53;
               case 49 -> 68;
               case 50 -> 88;
               case 51 -> 81;
               case 52 -> 30;
               case 53 -> 184;
               case 54 -> 247;
               case 55 -> 120;
               case 56 -> 110;
               case 57 -> 5;
               case 58 -> 244;
               case 59 -> 186;
               case 60 -> 240;
               case 61 -> 94;
               case 62 -> 173;
               case 63 -> 202;
               case 64 -> 38;
               case 65 -> 255;
               case 66 -> 119;
               case 67 -> 253;
               case 68 -> 130;
               case 69 -> 108;
               case 70 -> 234;
               case 71 -> 142;
               case 72 -> 123;
               case 73 -> 192;
               case 74 -> 70;
               case 75 -> 195;
               case 76 -> 151;
               case 77 -> 33;
               case 78 -> 16;
               case 79 -> 239;
               case 80 -> 200;
               case 81 -> 237;
               case 82 -> 174;
               case 83 -> 29;
               case 84 -> 14;
               case 85 -> 127;
               case 86 -> 249;
               case 87 -> 167;
               case 88 -> 162;
               case 89 -> 101;
               case 90 -> 254;
               case 91 -> 57;
               case 92 -> 220;
               case 93 -> 178;
               case 94 -> 83;
               case 95 -> 194;
               case 96 -> 193;
               case 97 -> 170;
               case 98 -> 43;
               case 99 -> 46;
               case 100 -> 238;
               case 101 -> 37;
               case 102 -> 137;
               case 103 -> 245;
               case 104 -> 217;
               case 105 -> 76;
               case 106 -> 8;
               case 107 -> 224;
               case 108 -> 125;
               case 109 -> 190;
               case 110 -> 241;
               case 111 -> 222;
               case 112 -> 227;
               case 113 -> 182;
               case 114 -> 54;
               case 115 -> 67;
               case 116 -> 131;
               case 117 -> 160;
               case 118 -> 23;
               case 119 -> 210;
               case 120 -> 146;
               case 121 -> 1;
               case 122 -> 211;
               case 123 -> 59;
               case 124 -> 185;
               case 125 -> 189;
               case 126 -> 106;
               case 127 -> 49;
               case 128 -> 116;
               case 129 -> 99;
               case 130 -> 176;
               case 131 -> 7;
               case 132 -> 191;
               case 133 -> 251;
               case 134 -> 135;
               case 135 -> 140;
               case 136 -> 208;
               case 137 -> 60;
               case 138 -> 205;
               case 139 -> 62;
               case 140 -> 223;
               case 141 -> 164;
               case 142 -> 236;
               case 143 -> 72;
               case 144 -> 218;
               case 145 -> 95;
               case 146 -> 56;
               case 147 -> 149;
               case 148 -> 172;
               case 149 -> 86;
               case 150 -> 26;
               case 151 -> 138;
               case 152 -> 17;
               case 153 -> 233;
               case 154 -> 10;
               case 155 -> 242;
               case 156 -> 159;
               case 157 -> 73;
               case 158 -> 215;
               case 159 -> 103;
               case 160 -> 196;
               case 161 -> 136;
               case 162 -> 71;
               case 163 -> 74;
               case 164 -> 197;
               case 165 -> 161;
               case 166 -> 58;
               case 167 -> 75;
               case 168 -> 77;
               case 169 -> 69;
               case 170 -> 24;
               case 171 -> 225;
               case 172 -> 219;
               case 173 -> 187;
               case 174 -> 243;
               case 175 -> 177;
               case 176 -> 226;
               case 177 -> 128;
               case 178 -> 82;
               case 179 -> 206;
               case 180 -> 19;
               case 181 -> 132;
               case 182 -> 27;
               case 183 -> 22;
               case 184 -> 2;
               case 185 -> 235;
               case 186 -> 114;
               case 187 -> 129;
               case 188 -> 31;
               case 189 -> 181;
               case 190 -> 139;
               case 191 -> 65;
               case 192 -> 248;
               case 193 -> 124;
               case 194 -> 203;
               case 195 -> 15;
               case 196 -> 122;
               case 197 -> 180;
               case 198 -> 198;
               case 199 -> 9;
               case 200 -> 201;
               case 201 -> 96;
               case 202 -> 36;
               case 203 -> 250;
               case 204 -> 229;
               case 205 -> 48;
               case 206 -> 171;
               case 207 -> 188;
               case 208 -> 12;
               case 209 -> 11;
               case 210 -> 6;
               case 211 -> 133;
               case 212 -> 150;
               case 213 -> 168;
               case 214 -> 47;
               case 215 -> 134;
               case 216 -> 157;
               case 217 -> 158;
               case 218 -> 100;
               case 219 -> 154;
               case 220 -> 165;
               case 221 -> 213;
               case 222 -> 147;
               case 223 -> 4;
               case 224 -> 80;
               case 225 -> 13;
               case 226 -> 204;
               case 227 -> 18;
               case 228 -> 25;
               case 229 -> 115;
               case 230 -> 45;
               case 231 -> 97;
               case 232 -> 102;
               case 233 -> 42;
               case 234 -> 78;
               case 235 -> 145;
               case 236 -> 143;
               case 237 -> 209;
               case 238 -> 64;
               case 239 -> 91;
               case 240 -> 228;
               case 241 -> 121;
               case 242 -> 107;
               case 243 -> 87;
               case 244 -> 35;
               case 245 -> 79;
               case 246 -> 221;
               case 247 -> 252;
               case 248 -> 109;
               case 249 -> 39;
               case 250 -> 126;
               case 251 -> 41;
               case 252 -> 212;
               case 253 -> 111;
               case 254 -> 179;
               default -> 55;
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
   
    public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var0, int var1, int var2, @NotNull Triple<Integer, Integer, Integer> var3, int var4, Object var5) {
        if ((var4 & 1) != 0) {
            var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        }
        if ((var4 & 2) != 0) {
            var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
        }
        if ((var4 & 4) != 0) {
            var3 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
        }
        return var0.a(var1, var2, var3);
    }}

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final Triple<Integer, Integer, Integer> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(int var1, @NotNull Triple<Integer, Integer, Integer> var2) {
         short var10001 = -21720;
         short var10002 = -7704;
         Intrinsics.checkNotNullParameter(var2, "playerPos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      }

      public final int a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int c() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> d() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         int var1, @NotNull Triple<Integer, Integer, Integer> var2
      ) {
         short var10001 = -21719;
         short var10002 = -21977;
         Intrinsics.checkNotNullParameter(var2, "playerPos");
         return new lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10002 = -21718;
         short var10003 = 28922;
         var10003 = -21717;
         short var10004 = -5452;
         return "ApproachProgress(heldSlot="
            + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            + ", playerPos="
            + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         return var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int var2 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
         Object var10000 = this;
         if (var2 == 0) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == 0) {
            if (!(
               var10000 instanceof lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var2 == 0) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )) ? 1 : 0);
         }

         if (var2 == 0) {
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
         String[] var5 = new String[4];
         int var3 = 0;
         String var2 = "\u0002\u0080¶±1®ì.\b\tG]\u001e\n$ÙNÀ\\";
         int var4 = "\u0002\u0080¶±1®ì.\b\tG]\u001e\n$ÙNÀ\\".length();
         char var1 = '\t';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 27;
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
                        case 0 -> 125;
                        case 1 -> 96;
                        case 2 -> 62;
                        case 3 -> 77;
                        case 4 -> 112;
                        case 5 -> 109;
                        default -> 37;
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
                        b = new String[4];
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

                     var2 = "`»cYãPXÙqÞaô\u001a\u00817\u009f\u008cr/£7ÈGJ#Z\u0086ó\u0089ý\"g®M\u0090Îò*q";
                     var4 = "`»cYãPXÙqÞaô\u001a\u00817\u009f\u008cr/£7ÈGJ#Z\u0086ó\u0089ý\"g®M\u0090Îò*q".length();
                     var1 = '\f';
                     var8 = -1;
               }

               var10000 = 106;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -21719) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 238;
               case 1 -> 134;
               case 2 -> 32;
               case 3 -> 173;
               case 4 -> 252;
               case 5 -> 94;
               case 6 -> 49;
               case 7 -> 10;
               case 8 -> 250;
               case 9 -> 51;
               case 10 -> 63;
               case 11 -> 241;
               case 12 -> 45;
               case 13 -> 242;
               case 14 -> 222;
               case 15 -> 204;
               case 16 -> 66;
               case 17 -> 168;
               case 18 -> 8;
               case 19 -> 136;
               case 20 -> 2;
               case 21 -> 199;
               case 22 -> 80;
               case 23 -> 61;
               case 24 -> 30;
               case 25 -> 244;
               case 26 -> 207;
               case 27 -> 144;
               case 28 -> 246;
               case 29 -> 83;
               case 30 -> 184;
               case 31 -> 103;
               case 32 -> 230;
               case 33 -> 151;
               case 34 -> 247;
               case 35 -> 70;
               case 36 -> 53;
               case 37 -> 255;
               case 38 -> 145;
               case 39 -> 76;
               case 40 -> 206;
               case 41 -> 137;
               case 42 -> 218;
               case 43 -> 237;
               case 44 -> 12;
               case 45 -> 214;
               case 46 -> 96;
               case 47 -> 146;
               case 48 -> 178;
               case 49 -> 36;
               case 50 -> 104;
               case 51 -> 81;
               case 52 -> 117;
               case 53 -> 179;
               case 54 -> 55;
               case 55 -> 56;
               case 56 -> 25;
               case 57 -> 92;
               case 58 -> 154;
               case 59 -> 202;
               case 60 -> 15;
               case 61 -> 217;
               case 62 -> 43;
               case 63 -> 148;
               case 64 -> 86;
               case 65 -> 41;
               case 66 -> 226;
               case 67 -> 185;
               case 68 -> 201;
               case 69 -> 211;
               case 70 -> 64;
               case 71 -> 195;
               case 72 -> 163;
               case 73 -> 5;
               case 74 -> 59;
               case 75 -> 165;
               case 76 -> 116;
               case 77 -> 74;
               case 78 -> 192;
               case 79 -> 181;
               case 80 -> 6;
               case 81 -> 223;
               case 82 -> 243;
               case 83 -> 114;
               case 84 -> 16;
               case 85 -> 126;
               case 86 -> 161;
               case 87 -> 111;
               case 88 -> 248;
               case 89 -> 18;
               case 90 -> 170;
               case 91 -> 39;
               case 92 -> 198;
               case 93 -> 155;
               case 94 -> 120;
               case 95 -> 4;
               case 96 -> 236;
               case 97 -> 95;
               case 98 -> 72;
               case 99 -> 215;
               case 100 -> 19;
               case 101 -> 23;
               case 102 -> 3;
               case 103 -> 57;
               case 104 -> 253;
               case 105 -> 50;
               case 106 -> 91;
               case 107 -> 159;
               case 108 -> 69;
               case 109 -> 142;
               case 110 -> 183;
               case 111 -> 205;
               case 112 -> 28;
               case 113 -> 87;
               case 114 -> 115;
               case 115 -> 128;
               case 116 -> 24;
               case 117 -> 227;
               case 118 -> 189;
               case 119 -> 89;
               case 120 -> 235;
               case 121 -> 249;
               case 122 -> 119;
               case 123 -> 162;
               case 124 -> 160;
               case 125 -> 122;
               case 126 -> 208;
               case 127 -> 169;
               case 128 -> 11;
               case 129 -> 102;
               case 130 -> 123;
               case 131 -> 27;
               case 132 -> 7;
               case 133 -> 101;
               case 134 -> 135;
               case 135 -> 196;
               case 136 -> 210;
               case 137 -> 100;
               case 138 -> 138;
               case 139 -> 127;
               case 140 -> 233;
               case 141 -> 200;
               case 142 -> 182;
               case 143 -> 229;
               case 144 -> 17;
               case 145 -> 133;
               case 146 -> 232;
               case 147 -> 99;
               case 148 -> 147;
               case 149 -> 42;
               case 150 -> 35;
               case 151 -> 54;
               case 152 -> 0;
               case 153 -> 225;
               case 154 -> 197;
               case 155 -> 98;
               case 156 -> 58;
               case 157 -> 46;
               case 158 -> 52;
               case 159 -> 90;
               case 160 -> 240;
               case 161 -> 143;
               case 162 -> 193;
               case 163 -> 121;
               case 164 -> 228;
               case 165 -> 212;
               case 166 -> 150;
               case 167 -> 157;
               case 168 -> 239;
               case 169 -> 209;
               case 170 -> 234;
               case 171 -> 141;
               case 172 -> 174;
               case 173 -> 108;
               case 174 -> 68;
               case 175 -> 164;
               case 176 -> 186;
               case 177 -> 105;
               case 178 -> 131;
               case 179 -> 109;
               case 180 -> 191;
               case 181 -> 9;
               case 182 -> 73;
               case 183 -> 172;
               case 184 -> 44;
               case 185 -> 213;
               case 186 -> 107;
               case 187 -> 47;
               case 188 -> 203;
               case 189 -> 93;
               case 190 -> 254;
               case 191 -> 78;
               case 192 -> 112;
               case 193 -> 171;
               case 194 -> 219;
               case 195 -> 79;
               case 196 -> 153;
               case 197 -> 77;
               case 198 -> 156;
               case 199 -> 132;
               case 200 -> 149;
               case 201 -> 1;
               case 202 -> 216;
               case 203 -> 20;
               case 204 -> 152;
               case 205 -> 113;
               case 206 -> 251;
               case 207 -> 140;
               case 208 -> 176;
               case 209 -> 166;
               case 210 -> 139;
               case 211 -> 88;
               case 212 -> 97;
               case 213 -> 224;
               case 214 -> 13;
               case 215 -> 60;
               case 216 -> 187;
               case 217 -> 37;
               case 218 -> 33;
               case 219 -> 118;
               case 220 -> 71;
               case 221 -> 84;
               case 222 -> 65;
               case 223 -> 167;
               case 224 -> 125;
               case 225 -> 22;
               case 226 -> 62;
               case 227 -> 21;
               case 228 -> 34;
               case 229 -> 40;
               case 230 -> 158;
               case 231 -> 38;
               case 232 -> 177;
               case 233 -> 221;
               case 234 -> 14;
               case 235 -> 175;
               case 236 -> 129;
               case 237 -> 110;
               case 238 -> 85;
               case 239 -> 188;
               case 240 -> 82;
               case 241 -> 245;
               case 242 -> 180;
               case 243 -> 124;
               case 244 -> 48;
               case 245 -> 106;
               case 246 -> 231;
               case 247 -> 29;
               case 248 -> 31;
               case 249 -> 190;
               case 250 -> 26;
               case 251 -> 194;
               case 252 -> 75;
               case 253 -> 67;
               case 254 -> 220;
               default -> 130;
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
   
    public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0, int var1, @NotNull Triple<Integer, Integer, Integer> var2, int var3, Object var4) {
        if ((var3 & 1) != 0) {
            var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        }
        if ((var3 & 2) != 0) {
            var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
        }
        return var0.a(var1, var2);
    }}

   private static enum llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

      public static lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI[] a() {
         return (lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI[])IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.clone();
      }

      public static lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI a(
         String var0
      ) {
         return Enum.valueOf(
            lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI> b() {
         return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI[]{IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII};
      private static final EnumEntries<llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = kotlin.enums.EnumEntriesKt.enumEntries(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
   
      public static me.octo.client.lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI[] c() {
         me.octo.client.lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI[] var0 = new me.octo.client.lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI[2];
         var0[0] = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         var0[1] = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         return var0;
      }}

   private static enum lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

      public static lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] a() {
         return (lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[])IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.clone();
      }

      public static lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll a(
         String var0
      ) {
         return Enum.valueOf(
            lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll> b() {
         return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[]{IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII};
      private static final EnumEntries<lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = kotlin.enums.EnumEntriesKt.enumEntries(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
   
      public static me.octo.client.lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] c() {
         me.octo.client.lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var0 = new me.octo.client.lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[2];
         var0[0] = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         var0[1] = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         return var0;
      }}

   private static final class llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll {
      // PX-FIX RC4-159: Kotlin default-args bridge restored from jar bytecode (descriptor (Lme/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;Lme/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI$lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;ILkotlin/Triple;ILjava/lang/Object;)Lme/octo/client/lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;)
      public static llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll a(llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll self, me.octo.client.lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll p1, int p2, kotlin.Triple p3, int mask, java.lang.Object marker) {
      if ((mask & 1) != 0) { p1 = self.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
      if ((mask & 2) != 0) { p2 = self.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
      if ((mask & 4) != 0) { p3 = self.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl; }
      return self.a(p1, p2, p3);
      }
      @NotNull
      private final lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final Triple<Integer, Integer, Integer> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
         @NotNull lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll var1,
         int var2,
         @NotNull Triple<Integer, Integer, Integer> var3
      ) {
         short var10001 = 19630;
         short var10002 = -21619;
         Intrinsics.checkNotNullParameter(var1, "routeType");
         var10001 = 19624;
         var10002 = -20126;
         Intrinsics.checkNotNullParameter(var3, "playerPos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      }

      @NotNull
      public final lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll a() {
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
      public final lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll d() {
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
      public final lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll a(
         @NotNull lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll var1,
         int var2,
         @NotNull Triple<Integer, Integer, Integer> var3
      ) {
         short var10001 = 19625;
         short var10002 = -26868;
         Intrinsics.checkNotNullParameter(var1, "routeType");
         var10001 = 19628;
         var10002 = -1611;
         Intrinsics.checkNotNullParameter(var3, "playerPos");
         return new lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 19626;
         Triple var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 12821;
         short var10002 = 19627;
         short var10003 = 21221;
         short var10004 = 19629;
         short var10005 = 11091;
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
         lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var10000 = this;
         if (var2 != 0) {
            if (this == var1) {
               return true;
            }

            var10000 = (lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll)var1;
         }

         if (var2 != 0) {
            if (!(
               var10000 instanceof lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll
            )) {
               return false;
            }

            var10000 = (lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll)var1;
         }

         lllllIIllIIlIIllIIllIllllIIlIIIIllllllIlIIIlllIIIlIlIllIIlIIlIllllllllIIllllllIlllllI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var3 = var10000;
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
         String var2 = "Ö«ãåâ\u0010Âyj\t=\u0087È\u000e\u0011ç\u0095z\u009a\u0018ÕùñÁ6\u001az^\u000f\u001d\u0007ZÒy\u001dvÌ0\u0091 \u0085\u0082\u00985\u000f²\u0019ºz\u009cnÍ·\u001f:\u007fõ¡)è\tÈ¢ Ä\u009a4Íý\u008b";
         int var4 = "Ö«ãåâ\u0010Âyj\t=\u0087È\u000e\u0011ç\u0095z\u009a\u0018ÕùñÁ6\u001az^\u000f\u001d\u0007ZÒy\u001dvÌ0\u0091 \u0085\u0082\u00985\u000f²\u0019ºz\u009cnÍ·\u001f:\u007fõ¡)è\tÈ¢ Ä\u009a4Íý\u008b"
            .length();
         char var1 = '\t';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 83;
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
                        case 1 -> 97;
                        case 2 -> 117;
                        case 3 -> 29;
                        case 4 -> 33;
                        case 5 -> 18;
                        default -> 26;
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

                     var2 = " 6\u0001|se»Z\u000fÄ:k\t8u\u0092ª \u0089YMù";
                     var4 = " 6\u0001|se»Z\u000fÄ:k\t8u\u0092ª \u0089YMù".length();
                     var1 = '\f';
                     var8 = -1;
               }

               var10000 = 39;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 19624) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 99;
               case 1 -> 187;
               case 2 -> 181;
               case 3 -> 30;
               case 4 -> 128;
               case 5 -> 109;
               case 6 -> 52;
               case 7 -> 209;
               case 8 -> 207;
               case 9 -> 164;
               case 10 -> 215;
               case 11 -> 120;
               case 12 -> 206;
               case 13 -> 0;
               case 14 -> 2;
               case 15 -> 244;
               case 16 -> 210;
               case 17 -> 41;
               case 18 -> 225;
               case 19 -> 140;
               case 20 -> 152;
               case 21 -> 70;
               case 22 -> 49;
               case 23 -> 7;
               case 24 -> 254;
               case 25 -> 183;
               case 26 -> 12;
               case 27 -> 151;
               case 28 -> 60;
               case 29 -> 252;
               case 30 -> 117;
               case 31 -> 43;
               case 32 -> 248;
               case 33 -> 22;
               case 34 -> 82;
               case 35 -> 10;
               case 36 -> 242;
               case 37 -> 143;
               case 38 -> 20;
               case 39 -> 66;
               case 40 -> 182;
               case 41 -> 68;
               case 42 -> 239;
               case 43 -> 26;
               case 44 -> 9;
               case 45 -> 127;
               case 46 -> 135;
               case 47 -> 18;
               case 48 -> 212;
               case 49 -> 40;
               case 50 -> 38;
               case 51 -> 157;
               case 52 -> 59;
               case 53 -> 250;
               case 54 -> 55;
               case 55 -> 201;
               case 56 -> 200;
               case 57 -> 3;
               case 58 -> 153;
               case 59 -> 21;
               case 60 -> 53;
               case 61 -> 189;
               case 62 -> 233;
               case 63 -> 74;
               case 64 -> 119;
               case 65 -> 226;
               case 66 -> 133;
               case 67 -> 202;
               case 68 -> 165;
               case 69 -> 46;
               case 70 -> 155;
               case 71 -> 255;
               case 72 -> 8;
               case 73 -> 29;
               case 74 -> 28;
               case 75 -> 240;
               case 76 -> 79;
               case 77 -> 176;
               case 78 -> 180;
               case 79 -> 205;
               case 80 -> 51;
               case 81 -> 62;
               case 82 -> 95;
               case 83 -> 69;
               case 84 -> 219;
               case 85 -> 249;
               case 86 -> 136;
               case 87 -> 154;
               case 88 -> 131;
               case 89 -> 213;
               case 90 -> 144;
               case 91 -> 73;
               case 92 -> 125;
               case 93 -> 204;
               case 94 -> 228;
               case 95 -> 236;
               case 96 -> 123;
               case 97 -> 112;
               case 98 -> 108;
               case 99 -> 147;
               case 100 -> 138;
               case 101 -> 50;
               case 102 -> 218;
               case 103 -> 91;
               case 104 -> 33;
               case 105 -> 93;
               case 106 -> 14;
               case 107 -> 230;
               case 108 -> 216;
               case 109 -> 158;
               case 110 -> 58;
               case 111 -> 96;
               case 112 -> 169;
               case 113 -> 160;
               case 114 -> 67;
               case 115 -> 1;
               case 116 -> 179;
               case 117 -> 94;
               case 118 -> 5;
               case 119 -> 16;
               case 120 -> 221;
               case 121 -> 72;
               case 122 -> 184;
               case 123 -> 107;
               case 124 -> 191;
               case 125 -> 45;
               case 126 -> 217;
               case 127 -> 31;
               case 128 -> 92;
               case 129 -> 37;
               case 130 -> 172;
               case 131 -> 90;
               case 132 -> 141;
               case 133 -> 178;
               case 134 -> 27;
               case 135 -> 171;
               case 136 -> 130;
               case 137 -> 231;
               case 138 -> 139;
               case 139 -> 166;
               case 140 -> 175;
               case 141 -> 76;
               case 142 -> 251;
               case 143 -> 105;
               case 144 -> 193;
               case 145 -> 118;
               case 146 -> 224;
               case 147 -> 89;
               case 148 -> 245;
               case 149 -> 238;
               case 150 -> 186;
               case 151 -> 57;
               case 152 -> 195;
               case 153 -> 83;
               case 154 -> 32;
               case 155 -> 129;
               case 156 -> 159;
               case 157 -> 116;
               case 158 -> 47;
               case 159 -> 121;
               case 160 -> 145;
               case 161 -> 146;
               case 162 -> 170;
               case 163 -> 194;
               case 164 -> 208;
               case 165 -> 190;
               case 166 -> 110;
               case 167 -> 220;
               case 168 -> 81;
               case 169 -> 101;
               case 170 -> 103;
               case 171 -> 132;
               case 172 -> 113;
               case 173 -> 17;
               case 174 -> 167;
               case 175 -> 163;
               case 176 -> 173;
               case 177 -> 156;
               case 178 -> 71;
               case 179 -> 192;
               case 180 -> 15;
               case 181 -> 36;
               case 182 -> 115;
               case 183 -> 197;
               case 184 -> 56;
               case 185 -> 137;
               case 186 -> 232;
               case 187 -> 106;
               case 188 -> 203;
               case 189 -> 149;
               case 190 -> 25;
               case 191 -> 148;
               case 192 -> 199;
               case 193 -> 198;
               case 194 -> 185;
               case 195 -> 246;
               case 196 -> 211;
               case 197 -> 234;
               case 198 -> 54;
               case 199 -> 177;
               case 200 -> 253;
               case 201 -> 4;
               case 202 -> 80;
               case 203 -> 126;
               case 204 -> 13;
               case 205 -> 241;
               case 206 -> 23;
               case 207 -> 150;
               case 208 -> 104;
               case 209 -> 86;
               case 210 -> 39;
               case 211 -> 100;
               case 212 -> 243;
               case 213 -> 142;
               case 214 -> 188;
               case 215 -> 122;
               case 216 -> 98;
               case 217 -> 223;
               case 218 -> 11;
               case 219 -> 97;
               case 220 -> 75;
               case 221 -> 77;
               case 222 -> 162;
               case 223 -> 19;
               case 224 -> 168;
               case 225 -> 34;
               case 226 -> 214;
               case 227 -> 247;
               case 228 -> 85;
               case 229 -> 227;
               case 230 -> 24;
               case 231 -> 88;
               case 232 -> 114;
               case 233 -> 229;
               case 234 -> 6;
               case 235 -> 61;
               case 236 -> 124;
               case 237 -> 35;
               case 238 -> 134;
               case 239 -> 237;
               case 240 -> 65;
               case 241 -> 102;
               case 242 -> 64;
               case 243 -> 44;
               case 244 -> 84;
               case 245 -> 174;
               case 246 -> 235;
               case 247 -> 222;
               case 248 -> 87;
               case 249 -> 63;
               case 250 -> 48;
               case 251 -> 78;
               case 252 -> 196;
               case 253 -> 111;
               case 254 -> 42;
               default -> 161;
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
}
