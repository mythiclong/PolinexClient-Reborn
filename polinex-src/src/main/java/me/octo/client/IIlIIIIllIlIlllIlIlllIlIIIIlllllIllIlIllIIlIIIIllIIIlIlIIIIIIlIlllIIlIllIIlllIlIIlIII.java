package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import me.octo.client.utils.player.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.player.RemotePlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Entity.RemovalReason;
import net.minecraft.world.phys.AABB;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII
   extends lllIllllIlIIllIlIIlIIllIIIIIIIIIlIIIIllllIlIllIlllIlIlIlIIIIIIlllIIIIIllIIIIIllIlIIIl {
    public static <T> T d(Object p0) { return null; } // PX-FIX mr4
    public static <T> T f(Object p0) { return null; } // PX-FIX mr3
    public static <T> T e(Object p0) { return null; } // PX-FIX mr3

   public Object receiver; // PX-FIX kotlin lambda receiver
   public static final void a(IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII var0, me.octo.client.IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      var0.a(var1);
   }

   public static final IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII bl() {
      return lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
   }


   @NotNull
   public static IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
   private int IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   @NotNull
   private final ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
   private int llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
   @NotNull
   private static IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
   private static String[] j;
   private static String[] k;

   public IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII() {
      short var10001 = -25156;
      short var10002 = -15948;
      var10002 = -25155;
      short var10003 = 10520;
      me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var6 = me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      short var10004 = -25171;
      short var10005 = -12365;
      String[] var1 = new String[3];
      short var10007 = -25162;
      short var10008 = 27237;
      var1[0] = "This macro kills Goblins in the Dwarven Mines";
      var10007 = -25163;
      var10008 = 12533;
      var1[1] = "Uses CombatBot for intelligent targeting and pathfinding";
      var10007 = -25164;
      var10008 = 23380;
      var1[2] = "Tracks session kills";
      List var7 = CollectionsKt.listOf(var1);
      var1 = new String[3];
      var10008 = -25159;
      short var10009 = -16398;
      var1[0] = "Make sure you have a good combat pet";
      var10008 = -25160;
      var10009 = -24933;
      var1[1] = "Use a strong melee weapon";
      var10008 = -25158;
      var10009 = -12515;
      var1[2] = "Etherwarp recommended for movement";
      List var10006 = CollectionsKt.listOf(var1);
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var3 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         lllIllIIllIIIlIllllllIlllIIllIlIllIlIllIIlIlIlIlllllIIllIIIIllIllIllIIlIllIIlIlIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a()
      };
      super("Goblin Macro", "Kills Goblins in the Dwarven Mines.", var6, "Dwarven", var7, var10006, false, var3);
      IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll[] var4 = new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll[]{
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(-73, 137, 151),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         )
      };
      this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = CollectionsKt.arrayListOf(var4);
   }

   public final int bd() {
      return this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   }

   public final void c(int var1) {
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = var1;
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var1) {
      Entity var11 = null; // PX-FIX
      String var10000 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      short var10002 = -25165;
      short var10003 = 2283;
      Intrinsics.checkNotNullParameter(var1, "event");
      String var2 = var10000;
      IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII var8 = this;
      if (var2 != null) {
         if (!this.G()) {
            return;
         }

         var8 = this;
      }

      ClientLevel var9 = var8.ap().level;
      if (var9 != null) {
         Entity var10 = var9.getEntity(var1.l());
         if (var10 != null) {
            Entity var3 = var10;
            boolean var4 = false;
            if (var2 != null && !var3.isAlive()) {
               var11 = var3;
               label54:
               if (var2 != null) {
                  label52:
                  if (var3 instanceof RemotePlayer) {
                     label50: {
                        var10000 = ((RemotePlayer)var3).getName().getString();
                        var10002 = -25172;
                        var10003 = -13206;
                        Intrinsics.checkNotNullExpressionValue(var10000, "getString(...)");
                        String var5 = var10000;
                        CharSequence var13 = var5;
                        short var10001 = -25161;
                        var10002 = -26184;
                        boolean var14 = StringsKt.contains(var13, "Goblin", false);
                        if (var2 != null) {
                           if (var14) {
                              break label50;
                           }

                           CharSequence var15 = var5;
                           var10001 = -25153;
                           var10002 = -1324;
                           var14 = StringsKt.contains(var15, "Weakling", false);
                        }

                        if (!var14) {
                           break label52;
                        }
                     }

                     LocalPlayer var6 = this.ap().player;
                     var11 = var6;
                     if (var2 == null) {
                        break label54;
                     }

                     label42:
                     if (var6 != null) {
                        double var22;
                        int var16 = (
                                 var22 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                       .b(llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(var3), true)
                                    - 8.0
                              )
                              == 0.0
                           ? 0
                           : (var22 < 0.0 ? -1 : 1);
                        if (var2 != null) {
                           if (var16 >= 0) {
                              break label42;
                           }

                           var16 = this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
                        }

                        int var7 = var16;
                        this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = var7 + 1;
                     }
                  }

                  var11 = var3;
               }

               var11.remove(RemovalReason.DISCARDED);
            }
         }
      }
   }

   @Override
   protected void aD() {
      Object receiver = null; // PX-FIX
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var10000 = this;
      short var10001 = -25157;
      short var10002 = -2748;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10000,
         "Goblin travel",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         (kotlin.jvm.functions.Function0)(() -> IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII.a(this)),
         5000L,
         false,
         false,
         (kotlin.jvm.functions.Function0)(() -> IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII.b(this)),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = -1250;
                  short var10005 = -12963;
                  var10005 = -1249;
                  short var10006 = -6901;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001x = -1252;
                  short var10002x = 26237;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "{Í0B´f\u0084\u0095Æ\bMó\u001d\u001d\u0010¡æz\u008clÎvkà\u007fE¹\u0012¢°àu¯¬\u0011`\u0015ï¶íë@Y\u0015]÷ò\u0003\u008e\u0098\u0011<%û3'\u001c\u0014\t\u009eÒa¦ò\u0080p¨Y&s\u001a\u009emêßK\u00076\u0091è.JR40÷©ÇGË1\u0082ÖÚã¨OÌ7ií1N±5L×&æ¶n\u000f\u0013\u0011i\u001bÞP'ñ\u0095´\u008b@gP\u0096úXføÚÆ\u0004(®<ðÔ@\u0002é\u0089";
                  int var4 = "{Í0B´f\u0084\u0095Æ\bMó\u001d\u001d\u0010¡æz\u008clÎvkà\u007fE¹\u0012¢°àu¯¬\u0011`\u0015ï¶íë@Y\u0015]÷ò\u0003\u008e\u0098\u0011<%û3'\u001c\u0014\t\u009eÒa¦ò\u0080p¨Y&s\u001a\u009emêßK\u00076\u0091è.JR40÷©ÇGË1\u0082ÖÚã¨OÌ7ií1N±5L×&æ¶n\u000f\u0013\u0011i\u001bÞP'ñ\u0095´\u008b@gP\u0096úXføÚÆ\u0004(®<ðÔ@\u0002é\u0089"
                     .length();
                  char var1 = 17;
                  int var0 = -1;

                  while (true) {
                     char[] var10002x;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 77;
                        var10002x = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 77;
                           var10006 = var6;
                        } else {
                           var13 = 77;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 77;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 55;
                              case 1 -> 56;
                              case 2 -> 86;
                              case 3 -> 49;
                              case 4 -> 83;
                              case 5 -> 97;
                              default -> 58;
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
                  int var2 = (var0 ^ -1250) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 197;
                        case 1 -> 244;
                        case 2 -> 250;
                        case 3 -> 178;
                        case 4 -> 138;
                        case 5 -> 21;
                        case 6 -> 167;
                        case 7 -> 69;
                        case 8 -> 226;
                        case 9 -> 111;
                        case 10 -> 37;
                        case 11 -> 40;
                        case 12 -> 62;
                        case 13 -> 175;
                        case 14 -> 94;
                        case 15 -> 173;
                        case 16 -> 209;
                        case 17 -> 32;
                        case 18 -> 238;
                        case 19 -> 43;
                        case 20 -> 70;
                        case 21 -> 247;
                        case 22 -> 147;
                        case 23 -> 74;
                        case 24 -> 72;
                        case 25 -> 220;
                        case 26 -> 140;
                        case 27 -> 29;
                        case 28 -> 28;
                        case 29 -> 170;
                        case 30 -> 117;
                        case 31 -> 187;
                        case 32 -> 78;
                        case 33 -> 126;
                        case 34 -> 139;
                        case 35 -> 195;
                        case 36 -> 234;
                        case 37 -> 246;
                        case 38 -> 17;
                        case 39 -> 245;
                        case 40 -> 133;
                        case 41 -> 103;
                        case 42 -> 11;
                        case 43 -> 223;
                        case 44 -> 50;
                        case 45 -> 18;
                        case 46 -> 236;
                        case 47 -> 141;
                        case 48 -> 252;
                        case 49 -> 242;
                        case 50 -> 27;
                        case 51 -> 12;
                        case 52 -> 243;
                        case 53 -> 113;
                        case 54 -> 208;
                        case 55 -> 115;
                        case 56 -> 213;
                        case 57 -> 253;
                        case 58 -> 219;
                        case 59 -> 98;
                        case 60 -> 200;
                        case 61 -> 214;
                        case 62 -> 24;
                        case 63 -> 119;
                        case 64 -> 25;
                        case 65 -> 33;
                        case 66 -> 96;
                        case 67 -> 107;
                        case 68 -> 194;
                        case 69 -> 5;
                        case 70 -> 65;
                        case 71 -> 143;
                        case 72 -> 49;
                        case 73 -> 23;
                        case 74 -> 224;
                        case 75 -> 144;
                        case 76 -> 182;
                        case 77 -> 192;
                        case 78 -> 184;
                        case 79 -> 116;
                        case 80 -> 105;
                        case 81 -> 22;
                        case 82 -> 120;
                        case 83 -> 190;
                        case 84 -> 183;
                        case 85 -> 30;
                        case 86 -> 118;
                        case 87 -> 125;
                        case 88 -> 102;
                        case 89 -> 164;
                        case 90 -> 198;
                        case 91 -> 232;
                        case 92 -> 127;
                        case 93 -> 57;
                        case 94 -> 48;
                        case 95 -> 221;
                        case 96 -> 10;
                        case 97 -> 129;
                        case 98 -> 172;
                        case 99 -> 222;
                        case 100 -> 156;
                        case 101 -> 142;
                        case 102 -> 159;
                        case 103 -> 87;
                        case 104 -> 8;
                        case 105 -> 153;
                        case 106 -> 19;
                        case 107 -> 3;
                        case 108 -> 231;
                        case 109 -> 210;
                        case 110 -> 176;
                        case 111 -> 169;
                        case 112 -> 80;
                        case 113 -> 64;
                        case 114 -> 211;
                        case 115 -> 206;
                        case 116 -> 180;
                        case 117 -> 97;
                        case 118 -> 249;
                        case 119 -> 67;
                        case 120 -> 7;
                        case 121 -> 203;
                        case 122 -> 0;
                        case 123 -> 39;
                        case 124 -> 137;
                        case 125 -> 38;
                        case 126 -> 146;
                        case 127 -> 152;
                        case 128 -> 16;
                        case 129 -> 112;
                        case 130 -> 4;
                        case 131 -> 128;
                        case 132 -> 13;
                        case 133 -> 93;
                        case 134 -> 104;
                        case 135 -> 240;
                        case 136 -> 34;
                        case 137 -> 165;
                        case 138 -> 76;
                        case 139 -> 99;
                        case 140 -> 60;
                        case 141 -> 54;
                        case 142 -> 132;
                        case 143 -> 134;
                        case 144 -> 56;
                        case 145 -> 166;
                        case 146 -> 225;
                        case 147 -> 154;
                        case 148 -> 216;
                        case 149 -> 248;
                        case 150 -> 171;
                        case 151 -> 158;
                        case 152 -> 204;
                        case 153 -> 15;
                        case 154 -> 88;
                        case 155 -> 41;
                        case 156 -> 110;
                        case 157 -> 161;
                        case 158 -> 66;
                        case 159 -> 205;
                        case 160 -> 31;
                        case 161 -> 122;
                        case 162 -> 168;
                        case 163 -> 150;
                        case 164 -> 201;
                        case 165 -> 124;
                        case 166 -> 26;
                        case 167 -> 1;
                        case 168 -> 63;
                        case 169 -> 135;
                        case 170 -> 148;
                        case 171 -> 79;
                        case 172 -> 235;
                        case 173 -> 42;
                        case 174 -> 83;
                        case 175 -> 2;
                        case 176 -> 71;
                        case 177 -> 75;
                        case 178 -> 212;
                        case 179 -> 59;
                        case 180 -> 202;
                        case 181 -> 229;
                        case 182 -> 185;
                        case 183 -> 53;
                        case 184 -> 85;
                        case 185 -> 255;
                        case 186 -> 191;
                        case 187 -> 130;
                        case 188 -> 230;
                        case 189 -> 155;
                        case 190 -> 14;
                        case 191 -> 174;
                        case 192 -> 193;
                        case 193 -> 89;
                        case 194 -> 61;
                        case 195 -> 131;
                        case 196 -> 90;
                        case 197 -> 207;
                        case 198 -> 46;
                        case 199 -> 84;
                        case 200 -> 215;
                        case 201 -> 162;
                        case 202 -> 9;
                        case 203 -> 241;
                        case 204 -> 68;
                        case 205 -> 254;
                        case 206 -> 108;
                        case 207 -> 227;
                        case 208 -> 36;
                        case 209 -> 218;
                        case 210 -> 100;
                        case 211 -> 58;
                        case 212 -> 199;
                        case 213 -> 106;
                        case 214 -> 95;
                        case 215 -> 82;
                        case 216 -> 179;
                        case 217 -> 163;
                        case 218 -> 91;
                        case 219 -> 149;
                        case 220 -> 121;
                        case 221 -> 151;
                        case 222 -> 217;
                        case 223 -> 186;
                        case 224 -> 77;
                        case 225 -> 196;
                        case 226 -> 35;
                        case 227 -> 189;
                        case 228 -> 114;
                        case 229 -> 145;
                        case 230 -> 233;
                        case 231 -> 160;
                        case 232 -> 157;
                        case 233 -> 177;
                        case 234 -> 51;
                        case 235 -> 123;
                        case 236 -> 228;
                        case 237 -> 86;
                        case 238 -> 81;
                        case 239 -> 181;
                        case 240 -> 73;
                        case 241 -> 47;
                        case 242 -> 101;
                        case 243 -> 136;
                        case 244 -> 251;
                        case 245 -> 92;
                        case 246 -> 109;
                        case 247 -> 45;
                        case 248 -> 237;
                        case 249 -> 55;
                        case 250 -> 52;
                        case 251 -> 44;
                        case 252 -> 6;
                        case 253 -> 239;
                        case 254 -> 188;
                        default -> 20;
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
      var10001 = -25170;
      var10002 = -209;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10000),
         "Goblin route",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
         20000L,
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
                  short var10004 = -28962;
                  short var10005 = 4317;
                  var10005 = -28961;
                  short var10006 = 26057;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = -28964;
                  short var10002 = 28942;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "ï\u001791Ò´\u000eé÷\u001cC6`ã\u0099\u001eLz\u0093\u001c¶P#\u00980l0¬» \u007f!zF0\u0015vý\u009c\u0089ÎWÕ°p\u0005q=ew+}$õs}<\u0018±Yãù\u001bÉp«ð\u0004MC_ßy\u0084{æ\b«7ç¼\u008d`W^ÜØäOÏ«*Âs'»·5\u0000\u0011·x#ø\u0003MVº\u0090\u0003À\"îój\u0001\u0098st½¸\u0081hÀ{Û=Ì\u0091æçª¾\"`ÖsÙ]þ\u0002]Ø";
                  int var4 = "ï\u001791Ò´\u000eé÷\u001cC6`ã\u0099\u001eLz\u0093\u001c¶P#\u00980l0¬» \u007f!zF0\u0015vý\u009c\u0089ÎWÕ°p\u0005q=ew+}$õs}<\u0018±Yãù\u001bÉp«ð\u0004MC_ßy\u0084{æ\b«7ç¼\u008d`W^ÜØäOÏ«*Âs'»·5\u0000\u0011·x#ø\u0003MVº\u0090\u0003À\"îój\u0001\u0098st½¸\u0081hÀ{Û=Ì\u0091æçª¾\"`ÖsÙ]þ\u0002]Ø"
                     .length();
                  char var1 = 17;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 35;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 35;
                           var10006 = var6;
                        } else {
                           var13 = 35;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 35;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 92;
                              case 1 -> 126;
                              case 2 -> 3;
                              case 3 -> 114;
                              case 4 -> 29;
                              case 5 -> 22;
                              default -> 22;
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
                  int var2 = (var0 ^ -28962) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 234;
                        case 1 -> 183;
                        case 2 -> 108;
                        case 3 -> 164;
                        case 4 -> 72;
                        case 5 -> 148;
                        case 6 -> 191;
                        case 7 -> 160;
                        case 8 -> 24;
                        case 9 -> 184;
                        case 10 -> 86;
                        case 11 -> 20;
                        case 12 -> 52;
                        case 13 -> 154;
                        case 14 -> 119;
                        case 15 -> 222;
                        case 16 -> 61;
                        case 17 -> 78;
                        case 18 -> 71;
                        case 19 -> 144;
                        case 20 -> 27;
                        case 21 -> 143;
                        case 22 -> 218;
                        case 23 -> 233;
                        case 24 -> 167;
                        case 25 -> 90;
                        case 26 -> 115;
                        case 27 -> 18;
                        case 28 -> 208;
                        case 29 -> 152;
                        case 30 -> 150;
                        case 31 -> 122;
                        case 32 -> 204;
                        case 33 -> 75;
                        case 34 -> 188;
                        case 35 -> 127;
                        case 36 -> 3;
                        case 37 -> 236;
                        case 38 -> 41;
                        case 39 -> 139;
                        case 40 -> 175;
                        case 41 -> 58;
                        case 42 -> 23;
                        case 43 -> 76;
                        case 44 -> 146;
                        case 45 -> 38;
                        case 46 -> 5;
                        case 47 -> 91;
                        case 48 -> 251;
                        case 49 -> 232;
                        case 50 -> 226;
                        case 51 -> 205;
                        case 52 -> 30;
                        case 53 -> 47;
                        case 54 -> 28;
                        case 55 -> 126;
                        case 56 -> 68;
                        case 57 -> 49;
                        case 58 -> 224;
                        case 59 -> 123;
                        case 60 -> 83;
                        case 61 -> 149;
                        case 62 -> 21;
                        case 63 -> 215;
                        case 64 -> 173;
                        case 65 -> 111;
                        case 66 -> 106;
                        case 67 -> 198;
                        case 68 -> 217;
                        case 69 -> 140;
                        case 70 -> 135;
                        case 71 -> 240;
                        case 72 -> 56;
                        case 73 -> 220;
                        case 74 -> 34;
                        case 75 -> 107;
                        case 76 -> 252;
                        case 77 -> 166;
                        case 78 -> 159;
                        case 79 -> 221;
                        case 80 -> 7;
                        case 81 -> 178;
                        case 82 -> 155;
                        case 83 -> 182;
                        case 84 -> 113;
                        case 85 -> 16;
                        case 86 -> 195;
                        case 87 -> 151;
                        case 88 -> 168;
                        case 89 -> 213;
                        case 90 -> 186;
                        case 91 -> 121;
                        case 92 -> 192;
                        case 93 -> 219;
                        case 94 -> 36;
                        case 95 -> 238;
                        case 96 -> 171;
                        case 97 -> 254;
                        case 98 -> 87;
                        case 99 -> 65;
                        case 100 -> 92;
                        case 101 -> 104;
                        case 102 -> 163;
                        case 103 -> 190;
                        case 104 -> 209;
                        case 105 -> 239;
                        case 106 -> 98;
                        case 107 -> 174;
                        case 108 -> 137;
                        case 109 -> 54;
                        case 110 -> 235;
                        case 111 -> 35;
                        case 112 -> 147;
                        case 113 -> 6;
                        case 114 -> 129;
                        case 115 -> 102;
                        case 116 -> 37;
                        case 117 -> 26;
                        case 118 -> 96;
                        case 119 -> 17;
                        case 120 -> 201;
                        case 121 -> 101;
                        case 122 -> 136;
                        case 123 -> 158;
                        case 124 -> 89;
                        case 125 -> 194;
                        case 126 -> 223;
                        case 127 -> 134;
                        case 128 -> 128;
                        case 129 -> 103;
                        case 130 -> 116;
                        case 131 -> 25;
                        case 132 -> 142;
                        case 133 -> 66;
                        case 134 -> 43;
                        case 135 -> 48;
                        case 136 -> 125;
                        case 137 -> 156;
                        case 138 -> 15;
                        case 139 -> 50;
                        case 140 -> 12;
                        case 141 -> 84;
                        case 142 -> 185;
                        case 143 -> 73;
                        case 144 -> 229;
                        case 145 -> 39;
                        case 146 -> 97;
                        case 147 -> 59;
                        case 148 -> 153;
                        case 149 -> 141;
                        case 150 -> 244;
                        case 151 -> 62;
                        case 152 -> 55;
                        case 153 -> 225;
                        case 154 -> 117;
                        case 155 -> 203;
                        case 156 -> 211;
                        case 157 -> 237;
                        case 158 -> 246;
                        case 159 -> 19;
                        case 160 -> 0;
                        case 161 -> 13;
                        case 162 -> 189;
                        case 163 -> 81;
                        case 164 -> 243;
                        case 165 -> 216;
                        case 166 -> 253;
                        case 167 -> 1;
                        case 168 -> 193;
                        case 169 -> 82;
                        case 170 -> 118;
                        case 171 -> 206;
                        case 172 -> 88;
                        case 173 -> 179;
                        case 174 -> 99;
                        case 175 -> 32;
                        case 176 -> 231;
                        case 177 -> 94;
                        case 178 -> 124;
                        case 179 -> 45;
                        case 180 -> 110;
                        case 181 -> 85;
                        case 182 -> 109;
                        case 183 -> 245;
                        case 184 -> 131;
                        case 185 -> 29;
                        case 186 -> 93;
                        case 187 -> 120;
                        case 188 -> 196;
                        case 189 -> 248;
                        case 190 -> 63;
                        case 191 -> 22;
                        case 192 -> 46;
                        case 193 -> 133;
                        case 194 -> 180;
                        case 195 -> 132;
                        case 196 -> 228;
                        case 197 -> 130;
                        case 198 -> 212;
                        case 199 -> 207;
                        case 200 -> 4;
                        case 201 -> 250;
                        case 202 -> 161;
                        case 203 -> 10;
                        case 204 -> 74;
                        case 205 -> 67;
                        case 206 -> 176;
                        case 207 -> 227;
                        case 208 -> 249;
                        case 209 -> 79;
                        case 210 -> 255;
                        case 211 -> 172;
                        case 212 -> 177;
                        case 213 -> 60;
                        case 214 -> 230;
                        case 215 -> 145;
                        case 216 -> 64;
                        case 217 -> 80;
                        case 218 -> 14;
                        case 219 -> 53;
                        case 220 -> 2;
                        case 221 -> 162;
                        case 222 -> 170;
                        case 223 -> 187;
                        case 224 -> 95;
                        case 225 -> 8;
                        case 226 -> 44;
                        case 227 -> 169;
                        case 228 -> 57;
                        case 229 -> 202;
                        case 230 -> 100;
                        case 231 -> 200;
                        case 232 -> 105;
                        case 233 -> 181;
                        case 234 -> 241;
                        case 235 -> 42;
                        case 236 -> 69;
                        case 237 -> 33;
                        case 238 -> 112;
                        case 239 -> 9;
                        case 240 -> 165;
                        case 241 -> 214;
                        case 242 -> 11;
                        case 243 -> 40;
                        case 244 -> 31;
                        case 245 -> 157;
                        case 246 -> 77;
                        case 247 -> 197;
                        case 248 -> 199;
                        case 249 -> 70;
                        case 250 -> 114;
                        case 251 -> 247;
                        case 252 -> 51;
                        case 253 -> 210;
                        case 254 -> 242;
                        default -> 138;
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
      var10001 = -25154;
      var10002 = 25376;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10000,
         "Goblin combat",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
         60000L,
         0L,
         null,
         false,
         false,
         (kotlin.jvm.functions.Function1)(IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII::d),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = -2814;
                  short var10005 = -19510;
                  var10005 = -2815;
                  short var10006 = 10035;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = -2813;
                  short var10002 = 14422;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "d¯\u0011^'nH\u0084³T\u009eã\u0093¾{÷Úüf\u0081zÐ¬¿9¾\u009d\u0013[\u000b+£lT8\u0088:\u000få-ËgØî\u001c®e7/\u000e'ëKFÒ\u0019\u0097\u008bP\\\u0001\u0095êðÐ\u0018\u0093¬Èûÿs]ç Fû\u000bVgÂfâ\u0006ºhÐ \u0090?ý$³§ÚÿE\u0010ê\u000e~HÄ\u0096R\u0090â\u0014q\b\u0015Ëaô\u000f\u0017ê}²íZ»çýâP;#ÅI³7\u0099¤\u001a·KýÓPîfy";
                  int var4 = "d¯\u0011^'nH\u0084³T\u009eã\u0093¾{÷Úüf\u0081zÐ¬¿9¾\u009d\u0013[\u000b+£lT8\u0088:\u000få-ËgØî\u001c®e7/\u000e'ëKFÒ\u0019\u0097\u008bP\\\u0001\u0095êðÐ\u0018\u0093¬Èûÿs]ç Fû\u000bVgÂfâ\u0006ºhÐ \u0090?ý$³§ÚÿE\u0010ê\u000e~HÄ\u0096R\u0090â\u0014q\b\u0015Ëaô\u000f\u0017ê}²íZ»çýâP;#ÅI³7\u0099¤\u001a·KýÓPîfy"
                     .length();
                  char var1 = 2;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 29;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 29;
                           var10006 = var6;
                        } else {
                           var13 = 29;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 29;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 17;
                              case 1 -> 120;
                              case 2 -> 50;
                              case 3 -> 52;
                              case 4 -> 126;
                              case 5 -> 15;
                              default -> 19;
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
                  int var2 = (var0 ^ -2813) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 206;
                        case 1 -> 202;
                        case 2 -> 7;
                        case 3 -> 35;
                        case 4 -> 20;
                        case 5 -> 203;
                        case 6 -> 16;
                        case 7 -> 233;
                        case 8 -> 8;
                        case 9 -> 69;
                        case 10 -> 37;
                        case 11 -> 239;
                        case 12 -> 123;
                        case 13 -> 115;
                        case 14 -> 88;
                        case 15 -> 188;
                        case 16 -> 47;
                        case 17 -> 109;
                        case 18 -> 28;
                        case 19 -> 156;
                        case 20 -> 212;
                        case 21 -> 186;
                        case 22 -> 132;
                        case 23 -> 163;
                        case 24 -> 100;
                        case 25 -> 17;
                        case 26 -> 135;
                        case 27 -> 174;
                        case 28 -> 211;
                        case 29 -> 49;
                        case 30 -> 117;
                        case 31 -> 151;
                        case 32 -> 138;
                        case 33 -> 25;
                        case 34 -> 173;
                        case 35 -> 157;
                        case 36 -> 124;
                        case 37 -> 31;
                        case 38 -> 215;
                        case 39 -> 78;
                        case 40 -> 33;
                        case 41 -> 63;
                        case 42 -> 99;
                        case 43 -> 231;
                        case 44 -> 67;
                        case 45 -> 253;
                        case 46 -> 112;
                        case 47 -> 71;
                        case 48 -> 96;
                        case 49 -> 32;
                        case 50 -> 187;
                        case 51 -> 110;
                        case 52 -> 102;
                        case 53 -> 153;
                        case 54 -> 45;
                        case 55 -> 83;
                        case 56 -> 40;
                        case 57 -> 169;
                        case 58 -> 171;
                        case 59 -> 179;
                        case 60 -> 134;
                        case 61 -> 185;
                        case 62 -> 146;
                        case 63 -> 27;
                        case 64 -> 194;
                        case 65 -> 22;
                        case 66 -> 21;
                        case 67 -> 224;
                        case 68 -> 254;
                        case 69 -> 245;
                        case 70 -> 92;
                        case 71 -> 72;
                        case 72 -> 56;
                        case 73 -> 130;
                        case 74 -> 217;
                        case 75 -> 247;
                        case 76 -> 34;
                        case 77 -> 91;
                        case 78 -> 164;
                        case 79 -> 142;
                        case 80 -> 223;
                        case 81 -> 53;
                        case 82 -> 144;
                        case 83 -> 5;
                        case 84 -> 54;
                        case 85 -> 93;
                        case 86 -> 154;
                        case 87 -> 147;
                        case 88 -> 226;
                        case 89 -> 101;
                        case 90 -> 12;
                        case 91 -> 108;
                        case 92 -> 10;
                        case 93 -> 238;
                        case 94 -> 61;
                        case 95 -> 39;
                        case 96 -> 148;
                        case 97 -> 85;
                        case 98 -> 250;
                        case 99 -> 1;
                        case 100 -> 236;
                        case 101 -> 227;
                        case 102 -> 103;
                        case 103 -> 18;
                        case 104 -> 62;
                        case 105 -> 41;
                        case 106 -> 114;
                        case 107 -> 244;
                        case 108 -> 9;
                        case 109 -> 234;
                        case 110 -> 219;
                        case 111 -> 43;
                        case 112 -> 210;
                        case 113 -> 170;
                        case 114 -> 183;
                        case 115 -> 87;
                        case 116 -> 197;
                        case 117 -> 149;
                        case 118 -> 140;
                        case 119 -> 82;
                        case 120 -> 228;
                        case 121 -> 196;
                        case 122 -> 81;
                        case 123 -> 76;
                        case 124 -> 95;
                        case 125 -> 141;
                        case 126 -> 175;
                        case 127 -> 98;
                        case 128 -> 36;
                        case 129 -> 79;
                        case 130 -> 158;
                        case 131 -> 192;
                        case 132 -> 89;
                        case 133 -> 3;
                        case 134 -> 249;
                        case 135 -> 118;
                        case 136 -> 190;
                        case 137 -> 218;
                        case 138 -> 74;
                        case 139 -> 200;
                        case 140 -> 161;
                        case 141 -> 125;
                        case 142 -> 160;
                        case 143 -> 205;
                        case 144 -> 58;
                        case 145 -> 220;
                        case 146 -> 60;
                        case 147 -> 152;
                        case 148 -> 225;
                        case 149 -> 65;
                        case 150 -> 184;
                        case 151 -> 177;
                        case 152 -> 241;
                        case 153 -> 14;
                        case 154 -> 199;
                        case 155 -> 66;
                        case 156 -> 4;
                        case 157 -> 162;
                        case 158 -> 229;
                        case 159 -> 240;
                        case 160 -> 46;
                        case 161 -> 113;
                        case 162 -> 214;
                        case 163 -> 195;
                        case 164 -> 64;
                        case 165 -> 23;
                        case 166 -> 104;
                        case 167 -> 19;
                        case 168 -> 42;
                        case 169 -> 120;
                        case 170 -> 128;
                        case 171 -> 75;
                        case 172 -> 30;
                        case 173 -> 150;
                        case 174 -> 6;
                        case 175 -> 232;
                        case 176 -> 80;
                        case 177 -> 131;
                        case 178 -> 107;
                        case 179 -> 251;
                        case 180 -> 207;
                        case 181 -> 145;
                        case 182 -> 77;
                        case 183 -> 97;
                        case 184 -> 159;
                        case 185 -> 86;
                        case 186 -> 29;
                        case 187 -> 143;
                        case 188 -> 2;
                        case 189 -> 167;
                        case 190 -> 11;
                        case 191 -> 246;
                        case 192 -> 165;
                        case 193 -> 208;
                        case 194 -> 50;
                        case 195 -> 180;
                        case 196 -> 189;
                        case 197 -> 57;
                        case 198 -> 176;
                        case 199 -> 133;
                        case 200 -> 15;
                        case 201 -> 51;
                        case 202 -> 230;
                        case 203 -> 248;
                        case 204 -> 94;
                        case 205 -> 222;
                        case 206 -> 191;
                        case 207 -> 166;
                        case 208 -> 0;
                        case 209 -> 70;
                        case 210 -> 68;
                        case 211 -> 198;
                        case 212 -> 201;
                        case 213 -> 59;
                        case 214 -> 252;
                        case 215 -> 73;
                        case 216 -> 193;
                        case 217 -> 209;
                        case 218 -> 55;
                        case 219 -> 122;
                        case 220 -> 127;
                        case 221 -> 243;
                        case 222 -> 172;
                        case 223 -> 119;
                        case 224 -> 182;
                        case 225 -> 106;
                        case 226 -> 136;
                        case 227 -> 116;
                        case 228 -> 26;
                        case 229 -> 90;
                        case 230 -> 204;
                        case 231 -> 129;
                        case 232 -> 178;
                        case 233 -> 235;
                        case 234 -> 237;
                        case 235 -> 126;
                        case 236 -> 84;
                        case 237 -> 221;
                        case 238 -> 24;
                        case 239 -> 13;
                        case 240 -> 155;
                        case 241 -> 137;
                        case 242 -> 48;
                        case 243 -> 255;
                        case 244 -> 38;
                        case 245 -> 168;
                        case 246 -> 181;
                        case 247 -> 216;
                        case 248 -> 213;
                        case 249 -> 52;
                        case 250 -> 111;
                        case 251 -> 139;
                        case 252 -> 242;
                        case 253 -> 44;
                        case 254 -> 105;
                        default -> 121;
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
         ),
         48,
         null);
   }

   @Override
   public void aC() {
      Object IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll = null; // PX-FIX
      label22: {
         String var1;
         label21: {
            var1 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
            IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII var10000 = this;
            if (var1 != null) {
               switch (((int[])IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)[this.W()
                  .ordinal()]) {
                  case 1:
                     var10000 = this;
                     break;
                  case 2:
                     break label21;
                  case 3:
                     break label22;
                  default:
                     return;
               }
            }

            var10000.be();
            if (var1 != null) {
               return;
            }
         }

         this.bf();
         if (var1 != null) {
            return;
         }
      }

      this.bg();
   }

   private final void be() {
      Object IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll = null; // PX-FIX
      IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII var2;
      label25: {
         String var1 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
         int var10000 = ((this.aK()) ? 1 : 0);
         if (var1 != null) {
            if (var10000 == 0) {
               return;
            }

            var2 = this;
            if (var1 == null) {
               break label25;
            }

            var10000 = ((int[])IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII)[this.aJ()
               .a()
               .ordinal()];
         }

         if (var10000 != 1) {
            return;
         }

         var2 = this;
      }

      var2.bi();
   }

   private final void bf() {
      Object var11 = null; // PX-FIX
      Object IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll = null; // PX-FIX
      String var1 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var10000 = ((IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)(Object)(this));
      llIlIlIIlIIlIlIllIIIIIIIIlIIIIlIIlIIllllllIIIllIIllllIlIlllIIIIllIIIIlllllIlIIllllIIl var10000x = null; // PX-FIX var-split (ctx B)
      if (var1 != null) {
         if (this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI
            >= this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII.size()) {
            this.bh();
            return;
         }

         var10000 = this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII
            .get(this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI);
         short var10002 = -25167;
         short var10003 = 16428;
         Intrinsics.checkNotNullExpressionValue(var10000, "get(...)");
      }

      IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var2 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)(Object)var10000;
      int var8 = ((int[])IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl)[var2.b()
         .ordinal()];
      if (var1 != null) {
         switch (var8) {
            case 1:
               Integer var13;
               BlockPos var10001;
               label60: {
                  var10000x = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                     .f();
                  var10001 = var2.a();
                  if (var1 != null) {
                     me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var12 = this.X();
                     if (var12 != null) {
                        var13 = var12.b();
                        break label60;
                     }
                  }

                  var13 = null;
               }

               int var10 = ((var10000x.a(var10001, var13)) ? 1 : 0);
               if (var1 != null) {
                  if (var10 == 0) {
                     return;
                  }

                  var10 = this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
               }

               int var3 = var10;
               this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = var3 + 1;
               if (var1 != null) {
                  return;
               }
            case 2:
               double var6 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var2.a(), false);
               var11 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                  .e()
                  .d();
               label54:
               if (var1 != null) {
                  if (!((Boolean)var11)) {
                     double var14;
                     var11 = (var14 = var6 - 1.5) == 0.0 ? 0 : (var14 < 0.0 ? -1 : 1);
                     if (var1 == null) {
                        break label54;
                     }

                     if (((Boolean)var11)) {
                        int var5 = this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI++;
                        if (var1 != null) {
                           return;
                        }
                     }
                  }

                  var11 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                     .e()
                     .d();
               }

               if (var1 != null) {
                  if (((Boolean)(var11))) {
                     return;
                  }

                  IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                     ((BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                        .e())),
                     ((IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll)(Object)(var2.a())),
                     0,
                     false);
               }

               if (var1 != null) {
                  return;
               }
         }

         var8 = this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
      }

      int var7 = var8;
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = var7 + 1;
   }

   private final void bg() {
      String var1 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      boolean var10000 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m();
      if (var1 != null) {
         if (!var10000) {
            return;
         }

         var10000 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .g()
            .c();
      }

      if (var1 != null) {
         if (var10000) {
            return;
         }

         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .g()
            .b(
               lllIllIIllIIIlIllllllIlllIIllIlIllIlIllIIlIlIlIlllllIIllIIIIllIllIllIIlIllIIlIlIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a()
                  .al()
            );
         var10000 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .g()
            .o();
      }

      boolean var2 = var10000;
      if (var1 != null) {
         if (var2) {
            return;
         }

         short var10001 = -25166;
         short var10002 = -19712;
         this.d("§cFailed to start macro - no weapon found?");
      }

      this.N();
   }

   private final void bh() {
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
      );
   }

   private final void bi() {
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
      );
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = 0;
   }

   private final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      this.ae()
         .a(
            new lllIllIIllIIIIIIIlIIlIIIIIllllIlIIIIIllllIIlIIIIlllIIIIIIlIIIIlIlIIIIllIIllIIlllIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI,
               (kotlin.jvm.functions.Function1)(IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII::e),
               var1.d(),
               0,
               0,
               0L,
               0,
               (kotlin.jvm.functions.Function1)(IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII::f),
               120,
               null
            )
         );
   }

   private final void bj() {
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .g()
         .q();
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = 0;
      this.aO();
   }

   @Override
   public void a9() {
      Object var10000 = null; // PX-FIX
      String var1 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
         == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
         )
       {
         boolean var8;
         label48: {
            var var2 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
               .g()
               .a()
               .a();
            boolean var3 = false;
            var10000 = var2;
            label42:
            if (var1 != null) {
               if (var2 instanceof Collection) {
                  var10000 = (Collection)var2;
                  if (var1 == null) {
                     break label42;
                  }

                  if (((me.octo.client.PXDyn)var10000).isEmpty()) {
                     var8 = false;
                     break label48;
                  }
               }

               var10000 = var2;
            }

            Iterator var4 = ((me.octo.client.PXDyn)var10000).iterator();

            label35:
            while (true) {
               if (!var4.hasNext()) {
                  var8 = false;
                  break;
               }

               Object var5 = var4.next();
               AABB var6 = (AABB)var5;
               boolean var7 = false;
               var8 = var6.contains(me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w());

               while (var8) {
                  var8 = true;
                  if (var1 != null) {
                     break label35;
                  }
               }
            }
         }

         if (var8) {
            this.bh();
            if (var1 != null) {
               return;
            }
         }
      }

      this.a(
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI,
         3000
      );
   }

   @Override
   public void M() {
      Object var12 = null; // PX-FIX
      String var1;
      boolean var2;
      boolean var3;
      boolean var15;
      label116: {
         label120: {
            String var10000 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
            this.aM();
            var1 = var10000;
            var2 = this.a5() != null;
            var3 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .g()
               == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
            IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII var11 = this;
            if (var1 != null) {
               if (this.X() != null) {
                  break label120;
               }

               var11 = this;
            }

            label121: {
               var var5 = var11.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
               boolean var6 = false;
               var12 = var5;
               label108:
               if (var1 != null) {
                  if (var5 instanceof Collection) {
                     var12 = var5;
                     if (var1 == null) {
                        break label108;
                     }

                     if (((me.octo.client.PXDyn)var12).isEmpty()) {
                        var15 = true;
                        break label121;
                     }
                  }

                  var12 = var5;
               }

               Iterator var7 = ((me.octo.client.PXDyn)var12).iterator();

               label101:
               while (true) {
                  if (!var7.hasNext()) {
                     var15 = true;
                     break;
                  }

                  Object var8 = var7.next();
                  IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var9 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var8;
                  var15 = false;

                  while (
                     var9.b()
                        == IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                  ) {
                     var15 = false;
                     if (var1 != null) {
                        break label101;
                     }
                  }
               }
            }

            if (!var15) {
               var15 = false;
               break label116;
            }
         }

         var15 = true;
      }

      boolean var4;
      var4 = var15;
      var15 = var2;
      label86:
      if (var1 != null) {
         if (var2) {
            var15 = var3;
            if (var1 == null) {
               break label86;
            }

            if (var3) {
               var15 = var4;
               if (var1 == null) {
                  break label86;
               }

               if (var4) {
                  this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = 0;
                  IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII var17 = this;
                  if (var1 != null) {
                     super.M();
                     if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .g()
                        == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
                        )
                      {
                        this.a9();
                        if (var1 != null) {
                           return;
                        }
                     }

                     var17 = this;
                  }

                  var17.a(
                     IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI,
                     3000
                  );
                  return;
               }
            }
         }

         var15 = var2;
      }

      if (var1 != null) {
         if (!var15) {
            this.a_();
         }

         var15 = var4;
      }

      if (var1 != null) {
         if (!var15) {
            this.aP();
         }

         var15 = var3;
      }

      if (!var15) {
         this.b(
            CollectionsKt.listOf(
               IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
            )
         );
      }

      this.N();
   }

   @Override
   public void N() {
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .g()
         .q();
      this.aN();
      super.N();
   }

   @Override
   public void O() {
      short var10001 = -25168;
      short var10002 = -17039;
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.a(String.valueOf(
         llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl),
         "Session Info");
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a((kotlin.jvm.functions.Function0<String>)null,  16777215,  0);;
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a((kotlin.jvm.functions.Function0<String>)null,  16777215,  0);;
   }

   private static final long a(IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII var0) {
      return var0.aJ().b() + 15000L;
   }

   private static final Object b(IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII var0) {
      return TuplesKt.to(
         var0.aJ().a(),
         IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
      );
   }

   private static final Object c(IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII var0) {
      return new IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         var0.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI,
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .e()
            .d(),
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(var0, 0.0, 1, null)
      );
   }

   private static final boolean bk() {
      return IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .g()
         .c();
   }

   private static final Object d(IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII var0) {
      return new IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         var0.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI,
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .g()
            .k()
      );
   }

   private static final Unit e(IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII var0) {
      var0.bi();
      return Unit.INSTANCE;
   }

   private static final Unit f(IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII var0) {
      var0.bj();
      return Unit.INSTANCE;
   }

   private static final String g(IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII var0) {
      String var10000 = var0.W().name();
      short var10001 = -25176;
      short var10002 = -5796;
      return "Macro State: " + var10000;
   }

   private static final String h(IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII var0) {
      short var10001 = -25169;
      short var10002 = 13265;
      return "Goblins Killed: " + var0.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[21];
      int var3 = 0;
      String var2 = "\u008eÚ®`\u0003\u000e\r¥*\u0081¯Á##w\u0098\u0013\u0010.Q\u0004)Ü·\u0085L:wÃ8zÚ]\u0017¬\u007f\u008aÑûî ¾4(ÙµfX\r*,:¾\u0091Õ_ðnÎøéÈ\b¨Õ{Íß[}Â\u0019\u0000H(á<µ°l·ªq! ËÏ\u001bç2\u0084uØÜl\u000bH$²:kºÚ`\u0003é\u0010\u0093g¨B¾q\\\u008fvøë\u0012ÝÇíË\u008e\u007f\u0093\u0007\\ó\u0004\u0082\u0087\u0018p\"\u0001¯\u0017¿dÄØùè\u0091ÄâJó¡_#\u0090XY\u008eH\u0091ð?-;ç[Õ\fÃ¾H\rÕÇÅÃnz \u0012\u008ck\u000eÔ\u0098\u0014u!£®Ã$W`eÐÃÿ\u0087ÜØ\u009dä\f%\u009e8\u009eªûî\u0007\u000e¢\rz²ÀÈ\u0000n(\u009füþ¬\u0007ÖZÒo*ôN¶¦¥åïhø.Ìô\u008bßÃõ\u009b~\u0094þß\u000b|M\u0099kE\u0098ó\u0018T-Î\u0094ÜQn×\u0081ÓÁ¨ñmþÎ}\u0085Ü?A§Ï9¸¢A±ï[ é9\u00ad;kÃ\f\u008dj²55â¦³¶\u0006éËBB\u009eJ\f\u009d\u008eK¾\u008c(²-r]\u009dö\b«Ô8®B[\u0084#*Ö´}-Ù\t\u0013.Eë66º\u009f¡µ¿\u007fñ'\u0094Q<\u0084ý\u0005Ôâ\u0093g\u0081Á\u0018\u0097\u001aÚH¢\u0003)R°\u0005\\\u0003\u0095c\u009e\u000eYÐfUÓlàUñ\u0093Nà\u0081×\u0007\u008e°Î(sÑ±\f\f\u009dþ\u0088\t\u0013L9\fÜ¢´";
      int var4 = "\u008eÚ®`\u0003\u000e\r¥*\u0081¯Á##w\u0098\u0013\u0010.Q\u0004)Ü·\u0085L:wÃ8zÚ]\u0017¬\u007f\u008aÑûî ¾4(ÙµfX\r*,:¾\u0091Õ_ðnÎøéÈ\b¨Õ{Íß[}Â\u0019\u0000H(á<µ°l·ªq! ËÏ\u001bç2\u0084uØÜl\u000bH$²:kºÚ`\u0003é\u0010\u0093g¨B¾q\\\u008fvøë\u0012ÝÇíË\u008e\u007f\u0093\u0007\\ó\u0004\u0082\u0087\u0018p\"\u0001¯\u0017¿dÄØùè\u0091ÄâJó¡_#\u0090XY\u008eH\u0091ð?-;ç[Õ\fÃ¾H\rÕÇÅÃnz \u0012\u008ck\u000eÔ\u0098\u0014u!£®Ã$W`eÐÃÿ\u0087ÜØ\u009dä\f%\u009e8\u009eªûî\u0007\u000e¢\rz²ÀÈ\u0000n(\u009füþ¬\u0007ÖZÒo*ôN¶¦¥åïhø.Ìô\u008bßÃõ\u009b~\u0094þß\u000b|M\u0099kE\u0098ó\u0018T-Î\u0094ÜQn×\u0081ÓÁ¨ñmþÎ}\u0085Ü?A§Ï9¸¢A±ï[ é9\u00ad;kÃ\f\u008dj²55â¦³¶\u0006éËBB\u009eJ\f\u009d\u008eK¾\u008c(²-r]\u009dö\b«Ô8®B[\u0084#*Ö´}-Ù\t\u0013.Eë66º\u009f¡µ¿\u007fñ'\u0094Q<\u0084ý\u0005Ôâ\u0093g\u0081Á\u0018\u0097\u001aÚH¢\u0003)R°\u0005\\\u0003\u0095c\u009e\u000eYÐfUÓlàUñ\u0093Nà\u0081×\u0007\u008e°Î(sÑ±\f\f\u009dþ\u0088\t\u0013L9\fÜ¢´"
         .length();
      char var1 = '\f';
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
                     case 0 -> 96;
                     case 1 -> 9;
                     case 2 -> 80;
                     case 3 -> 26;
                     case 4 -> 117;
                     case 5 -> 32;
                     default -> 73;
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
                     k = new String[21];
                     lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = new IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = new IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII();
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

                  var2 = "ð\u0013\u009b£_\u008c/b\u0087I\u0091jÁ;»\u009b\rÙ\u000fôñ\u0095U\u0090\u008a~\u0097ÈY\u0087";
                  var4 = "ð\u0013\u009b£_\u008c/b\u0087I\u0091jÁ;»\u009b\rÙ\u000fôñ\u0095U\u0090\u008a~\u0097ÈY\u0087".length();
                  var1 = 16;
                  var8 = -1;
            }

            var10000 = 123;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String e(int var0, int var1) {
      int var2 = (var0 ^ -25156) & 65535;
      if (k[var2] == null) {
         char[] var3 = j[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 217;
            case 1 -> 236;
            case 2 -> 154;
            case 3 -> 151;
            case 4 -> 42;
            case 5 -> 122;
            case 6 -> 74;
            case 7 -> 64;
            case 8 -> 121;
            case 9 -> 243;
            case 10 -> 159;
            case 11 -> 230;
            case 12 -> 136;
            case 13 -> 145;
            case 14 -> 218;
            case 15 -> 33;
            case 16 -> 85;
            case 17 -> 241;
            case 18 -> 103;
            case 19 -> 16;
            case 20 -> 118;
            case 21 -> 59;
            case 22 -> 220;
            case 23 -> 110;
            case 24 -> 38;
            case 25 -> 227;
            case 26 -> 6;
            case 27 -> 150;
            case 28 -> 162;
            case 29 -> 148;
            case 30 -> 56;
            case 31 -> 53;
            case 32 -> 250;
            case 33 -> 197;
            case 34 -> 131;
            case 35 -> 169;
            case 36 -> 147;
            case 37 -> 181;
            case 38 -> 179;
            case 39 -> 190;
            case 40 -> 170;
            case 41 -> 19;
            case 42 -> 188;
            case 43 -> 2;
            case 44 -> 101;
            case 45 -> 142;
            case 46 -> 66;
            case 47 -> 125;
            case 48 -> 0;
            case 49 -> 79;
            case 50 -> 245;
            case 51 -> 149;
            case 52 -> 168;
            case 53 -> 158;
            case 54 -> 25;
            case 55 -> 69;
            case 56 -> 176;
            case 57 -> 206;
            case 58 -> 213;
            case 59 -> 114;
            case 60 -> 164;
            case 61 -> 177;
            case 62 -> 135;
            case 63 -> 32;
            case 64 -> 99;
            case 65 -> 244;
            case 66 -> 61;
            case 67 -> 171;
            case 68 -> 222;
            case 69 -> 30;
            case 70 -> 203;
            case 71 -> 166;
            case 72 -> 211;
            case 73 -> 35;
            case 74 -> 46;
            case 75 -> 89;
            case 76 -> 17;
            case 77 -> 36;
            case 78 -> 255;
            case 79 -> 183;
            case 80 -> 96;
            case 81 -> 178;
            case 82 -> 10;
            case 83 -> 139;
            case 84 -> 237;
            case 85 -> 225;
            case 86 -> 107;
            case 87 -> 160;
            case 88 -> 138;
            case 89 -> 252;
            case 90 -> 104;
            case 91 -> 18;
            case 92 -> 73;
            case 93 -> 232;
            case 94 -> 146;
            case 95 -> 43;
            case 96 -> 65;
            case 97 -> 165;
            case 98 -> 126;
            case 99 -> 11;
            case 100 -> 239;
            case 101 -> 105;
            case 102 -> 235;
            case 103 -> 63;
            case 104 -> 248;
            case 105 -> 172;
            case 106 -> 124;
            case 107 -> 127;
            case 108 -> 153;
            case 109 -> 111;
            case 110 -> 242;
            case 111 -> 97;
            case 112 -> 108;
            case 113 -> 76;
            case 114 -> 134;
            case 115 -> 195;
            case 116 -> 233;
            case 117 -> 141;
            case 118 -> 7;
            case 119 -> 120;
            case 120 -> 92;
            case 121 -> 1;
            case 122 -> 189;
            case 123 -> 215;
            case 124 -> 15;
            case 125 -> 88;
            case 126 -> 130;
            case 127 -> 113;
            case 128 -> 182;
            case 129 -> 48;
            case 130 -> 13;
            case 131 -> 8;
            case 132 -> 157;
            case 133 -> 221;
            case 134 -> 247;
            case 135 -> 144;
            case 136 -> 180;
            case 137 -> 95;
            case 138 -> 194;
            case 139 -> 23;
            case 140 -> 5;
            case 141 -> 196;
            case 142 -> 173;
            case 143 -> 100;
            case 144 -> 249;
            case 145 -> 24;
            case 146 -> 21;
            case 147 -> 193;
            case 148 -> 228;
            case 149 -> 167;
            case 150 -> 200;
            case 151 -> 82;
            case 152 -> 34;
            case 153 -> 4;
            case 154 -> 54;
            case 155 -> 12;
            case 156 -> 51;
            case 157 -> 57;
            case 158 -> 254;
            case 159 -> 204;
            case 160 -> 50;
            case 161 -> 112;
            case 162 -> 20;
            case 163 -> 40;
            case 164 -> 55;
            case 165 -> 83;
            case 166 -> 187;
            case 167 -> 72;
            case 168 -> 140;
            case 169 -> 192;
            case 170 -> 202;
            case 171 -> 184;
            case 172 -> 238;
            case 173 -> 67;
            case 174 -> 94;
            case 175 -> 60;
            case 176 -> 39;
            case 177 -> 253;
            case 178 -> 49;
            case 179 -> 29;
            case 180 -> 155;
            case 181 -> 209;
            case 182 -> 45;
            case 183 -> 9;
            case 184 -> 210;
            case 185 -> 226;
            case 186 -> 71;
            case 187 -> 78;
            case 188 -> 240;
            case 189 -> 199;
            case 190 -> 106;
            case 191 -> 28;
            case 192 -> 229;
            case 193 -> 152;
            case 194 -> 205;
            case 195 -> 116;
            case 196 -> 137;
            case 197 -> 224;
            case 198 -> 41;
            case 199 -> 68;
            case 200 -> 117;
            case 201 -> 143;
            case 202 -> 234;
            case 203 -> 251;
            case 204 -> 77;
            case 205 -> 91;
            case 206 -> 156;
            case 207 -> 102;
            case 208 -> 93;
            case 209 -> 90;
            case 210 -> 26;
            case 211 -> 115;
            case 212 -> 47;
            case 213 -> 3;
            case 214 -> 44;
            case 215 -> 119;
            case 216 -> 52;
            case 217 -> 201;
            case 218 -> 133;
            case 219 -> 87;
            case 220 -> 129;
            case 221 -> 98;
            case 222 -> 212;
            case 223 -> 58;
            case 224 -> 84;
            case 225 -> 14;
            case 226 -> 163;
            case 227 -> 246;
            case 228 -> 123;
            case 229 -> 198;
            case 230 -> 185;
            case 231 -> 174;
            case 232 -> 75;
            case 233 -> 223;
            case 234 -> 86;
            case 235 -> 37;
            case 236 -> 207;
            case 237 -> 27;
            case 238 -> 31;
            case 239 -> 70;
            case 240 -> 175;
            case 241 -> 81;
            case 242 -> 208;
            case 243 -> 62;
            case 244 -> 109;
            case 245 -> 128;
            case 246 -> 161;
            case 247 -> 186;
            case 248 -> 22;
            case 249 -> 219;
            case 250 -> 132;
            case 251 -> 191;
            case 252 -> 216;
            case 253 -> 214;
            case 254 -> 80;
            default -> 231;
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
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final Triple<Integer, Integer, Integer> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         int var1, boolean var2, @NotNull Triple<Integer, Integer, Integer> var3
      ) {
         short var10001 = 30237;
         short var10002 = -5311;
         Intrinsics.checkNotNullParameter(var3, "playerPos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      }

      public final int a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final boolean b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final int d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final boolean e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
         int var1, boolean var2, @NotNull Triple<Integer, Integer, Integer> var3
      ) {
         short var10001 = 30235;
         short var10002 = 24089;
         Intrinsics.checkNotNullParameter(var3, "playerPos");
         return new IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 30236;
         Triple var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         boolean var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 6182;
         short var10002 = 30239;
         short var10003 = 19765;
         short var10004 = 30238;
         short var10005 = 9899;
         return "RouteProgress(index=" + var3 + ", walkerFinished=" + var2 + ", playerPos=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var1 = var1 * 31 + Boolean.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         return var1 * 31 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
      Object var4 = null; // PX-FIX
         String var2 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         label48: {
            IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = (IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var10000;
            var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            int var10001 = var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            if (var2 != null) {
               if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
                  return false;
               }

               var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               if (var2 == null) {
                  break label48;
               }

               var10001 = ((var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) ? 1 : 0);
            }

            if ((Boolean)var4 != ((var10001 == 0))) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            );
         }

         if (var2 != null) {
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
         String[] var5 = new String[5];
         int var3 = 0;
         String var2 = "\u008dåÌþ\u008c¢Ö+\u0099\u0093Ô¿\u0011\u0018QÎ}\f\u0011ÌXÖô\u0019u\fûqQq\t\tó\u009dá{C50C";
         int var4 = "\u008dåÌþ\u008c¢Ö+\u0099\u0093Ô¿\u0011\u0018QÎ}\f\u0011ÌXÖô\u0019u\fûqQq\t\tó\u009dá{C50C".length();
         char var1 = 17;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 117;
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
                        case 0 -> 25;
                        case 1 -> 85;
                        case 2 -> 91;
                        case 3 -> 118;
                        case 4 -> 80;
                        case 5 -> 78;
                        default -> 18;
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

                     var2 = "\u0099ú\u0080Ó3öc\u009d\u0086\u009dDa\u0014§\u0080\u0006î|Ð]\tþk\u001e\u008fvóé[¥";
                     var4 = "\u0099ú\u0080Ó3öc\u009d\u0086\u009dDa\u0014§\u0080\u0006î|Ð]\tþk\u001e\u008fvóé[¥".length();
                     var1 = 20;
                     var8 = -1;
               }

               var10000 = 79;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 30239) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 151;
               case 1 -> 210;
               case 2 -> 140;
               case 3 -> 160;
               case 4 -> 50;
               case 5 -> 53;
               case 6 -> 111;
               case 7 -> 10;
               case 8 -> 37;
               case 9 -> 194;
               case 10 -> 212;
               case 11 -> 130;
               case 12 -> 89;
               case 13 -> 248;
               case 14 -> 19;
               case 15 -> 225;
               case 16 -> 186;
               case 17 -> 121;
               case 18 -> 172;
               case 19 -> 241;
               case 20 -> 42;
               case 21 -> 158;
               case 22 -> 81;
               case 23 -> 113;
               case 24 -> 56;
               case 25 -> 188;
               case 26 -> 133;
               case 27 -> 49;
               case 28 -> 84;
               case 29 -> 99;
               case 30 -> 33;
               case 31 -> 231;
               case 32 -> 134;
               case 33 -> 167;
               case 34 -> 209;
               case 35 -> 161;
               case 36 -> 229;
               case 37 -> 4;
               case 38 -> 34;
               case 39 -> 93;
               case 40 -> 228;
               case 41 -> 86;
               case 42 -> 141;
               case 43 -> 136;
               case 44 -> 239;
               case 45 -> 79;
               case 46 -> 187;
               case 47 -> 52;
               case 48 -> 218;
               case 49 -> 203;
               case 50 -> 100;
               case 51 -> 46;
               case 52 -> 168;
               case 53 -> 255;
               case 54 -> 138;
               case 55 -> 155;
               case 56 -> 145;
               case 57 -> 243;
               case 58 -> 164;
               case 59 -> 201;
               case 60 -> 221;
               case 61 -> 152;
               case 62 -> 11;
               case 63 -> 224;
               case 64 -> 230;
               case 65 -> 83;
               case 66 -> 29;
               case 67 -> 244;
               case 68 -> 240;
               case 69 -> 150;
               case 70 -> 200;
               case 71 -> 254;
               case 72 -> 166;
               case 73 -> 132;
               case 74 -> 1;
               case 75 -> 217;
               case 76 -> 20;
               case 77 -> 98;
               case 78 -> 156;
               case 79 -> 227;
               case 80 -> 8;
               case 81 -> 127;
               case 82 -> 112;
               case 83 -> 48;
               case 84 -> 214;
               case 85 -> 24;
               case 86 -> 196;
               case 87 -> 15;
               case 88 -> 189;
               case 89 -> 97;
               case 90 -> 2;
               case 91 -> 171;
               case 92 -> 45;
               case 93 -> 226;
               case 94 -> 180;
               case 95 -> 35;
               case 96 -> 43;
               case 97 -> 163;
               case 98 -> 102;
               case 99 -> 207;
               case 100 -> 68;
               case 101 -> 44;
               case 102 -> 116;
               case 103 -> 22;
               case 104 -> 82;
               case 105 -> 28;
               case 106 -> 66;
               case 107 -> 182;
               case 108 -> 64;
               case 109 -> 216;
               case 110 -> 135;
               case 111 -> 253;
               case 112 -> 61;
               case 113 -> 69;
               case 114 -> 47;
               case 115 -> 118;
               case 116 -> 18;
               case 117 -> 162;
               case 118 -> 88;
               case 119 -> 232;
               case 120 -> 249;
               case 121 -> 129;
               case 122 -> 205;
               case 123 -> 30;
               case 124 -> 16;
               case 125 -> 90;
               case 126 -> 148;
               case 127 -> 215;
               case 128 -> 110;
               case 129 -> 57;
               case 130 -> 154;
               case 131 -> 177;
               case 132 -> 25;
               case 133 -> 41;
               case 134 -> 144;
               case 135 -> 108;
               case 136 -> 124;
               case 137 -> 252;
               case 138 -> 105;
               case 139 -> 128;
               case 140 -> 220;
               case 141 -> 219;
               case 142 -> 234;
               case 143 -> 95;
               case 144 -> 242;
               case 145 -> 85;
               case 146 -> 63;
               case 147 -> 78;
               case 148 -> 119;
               case 149 -> 122;
               case 150 -> 103;
               case 151 -> 222;
               case 152 -> 223;
               case 153 -> 76;
               case 154 -> 181;
               case 155 -> 236;
               case 156 -> 245;
               case 157 -> 92;
               case 158 -> 233;
               case 159 -> 39;
               case 160 -> 27;
               case 161 -> 174;
               case 162 -> 250;
               case 163 -> 211;
               case 164 -> 176;
               case 165 -> 142;
               case 166 -> 87;
               case 167 -> 146;
               case 168 -> 65;
               case 169 -> 165;
               case 170 -> 0;
               case 171 -> 204;
               case 172 -> 51;
               case 173 -> 55;
               case 174 -> 179;
               case 175 -> 247;
               case 176 -> 80;
               case 177 -> 115;
               case 178 -> 17;
               case 179 -> 197;
               case 180 -> 58;
               case 181 -> 5;
               case 182 -> 178;
               case 183 -> 173;
               case 184 -> 32;
               case 185 -> 198;
               case 186 -> 107;
               case 187 -> 72;
               case 188 -> 169;
               case 189 -> 71;
               case 190 -> 60;
               case 191 -> 109;
               case 192 -> 36;
               case 193 -> 114;
               case 194 -> 91;
               case 195 -> 13;
               case 196 -> 183;
               case 197 -> 126;
               case 198 -> 190;
               case 199 -> 94;
               case 200 -> 175;
               case 201 -> 117;
               case 202 -> 75;
               case 203 -> 153;
               case 204 -> 206;
               case 205 -> 143;
               case 206 -> 73;
               case 207 -> 137;
               case 208 -> 96;
               case 209 -> 238;
               case 210 -> 191;
               case 211 -> 157;
               case 212 -> 120;
               case 213 -> 21;
               case 214 -> 192;
               case 215 -> 62;
               case 216 -> 77;
               case 217 -> 12;
               case 218 -> 193;
               case 219 -> 185;
               case 220 -> 202;
               case 221 -> 246;
               case 222 -> 101;
               case 223 -> 208;
               case 224 -> 125;
               case 225 -> 104;
               case 226 -> 70;
               case 227 -> 14;
               case 228 -> 54;
               case 229 -> 251;
               case 230 -> 40;
               case 231 -> 7;
               case 232 -> 6;
               case 233 -> 235;
               case 234 -> 195;
               case 235 -> 26;
               case 236 -> 74;
               case 237 -> 106;
               case 238 -> 159;
               case 239 -> 31;
               case 240 -> 38;
               case 241 -> 67;
               case 242 -> 59;
               case 243 -> 3;
               case 244 -> 149;
               case 245 -> 23;
               case 246 -> 9;
               case 247 -> 184;
               case 248 -> 139;
               case 249 -> 199;
               case 250 -> 123;
               case 251 -> 147;
               case 252 -> 170;
               case 253 -> 131;
               case 254 -> 237;
               default -> 213;
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
         public static me.octo.client.IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(me.octo.client.IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll p0, int p1, boolean p2, kotlin.Triple p3, int mask, java.lang.Object marker) {
         if ((mask & 1) != 0) { p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
         if ((mask & 2) != 0) { p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
         if ((mask & 4) != 0) { p3 = p0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl; }
         return p0.a(p1, p2, p3);
      }
}

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(Object... px) {
        }
        public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(kotlin.jvm.internal.DefaultConstructorMarker pxMarker) {
           this();
        }


      private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
      }

      @NotNull
      public final IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII a() {
         return IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
      }
   }

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         int var1,
         @NotNull lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2
      ) {
         short var10001 = 21480;
         short var10002 = -244;
         Intrinsics.checkNotNullParameter(var2, "bot");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      }

      public final int a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int c() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll d() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         int var1,
         @NotNull lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2
      ) {
         short var10001 = 21481;
         short var10002 = 2013;
         Intrinsics.checkNotNullParameter(var2, "bot");
         return new IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10002 = 21482;
         short var10003 = 24555;
         var10003 = 21483;
         short var10004 = -29860;
         return "CombatProgress(kills="
            + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            + ", bot="
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
         String var2 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var2 != null) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )) ? 1 : 0);
         }

         if (var2 != null) {
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
         String[] var5 = new String[4];
         int var3 = 0;
         String var2 = "%\u000e\u0012s,\u0003\u0015ý\u000b\u0084x\u0005\u0087©Ýº\u009d^iV\u0083Z¼r\u0004RÀ\u0082";
         int var4 = "%\u000e\u0012s,\u0003\u0015ý\u000b\u0084x\u0005\u0087©Ýº\u009d^iV\u0083Z¼r\u0004RÀ\u0082".length();
         char var1 = 6;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 125;
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
                        case 0 -> 95;
                        case 1 -> 9;
                        case 2 -> 68;
                        case 3 -> 10;
                        case 4 -> 110;
                        case 5 -> 65;
                        default -> 11;
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

                     var2 = "!P\u0082\u0003¸î±";
                     var4 = "!P\u0082\u0003¸î±".length();
                     var1 = 3;
                     var8 = -1;
               }

               var10000 = 88;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 21483) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 26;
               case 1 -> 87;
               case 2 -> 144;
               case 3 -> 146;
               case 4 -> 221;
               case 5 -> 25;
               case 6 -> 19;
               case 7 -> 49;
               case 8 -> 104;
               case 9 -> 106;
               case 10 -> 98;
               case 11 -> 75;
               case 12 -> 78;
               case 13 -> 31;
               case 14 -> 18;
               case 15 -> 11;
               case 16 -> 197;
               case 17 -> 76;
               case 18 -> 183;
               case 19 -> 238;
               case 20 -> 234;
               case 21 -> 95;
               case 22 -> 131;
               case 23 -> 139;
               case 24 -> 115;
               case 25 -> 34;
               case 26 -> 143;
               case 27 -> 124;
               case 28 -> 105;
               case 29 -> 204;
               case 30 -> 215;
               case 31 -> 102;
               case 32 -> 77;
               case 33 -> 37;
               case 34 -> 195;
               case 35 -> 191;
               case 36 -> 159;
               case 37 -> 184;
               case 38 -> 153;
               case 39 -> 152;
               case 40 -> 97;
               case 41 -> 56;
               case 42 -> 10;
               case 43 -> 239;
               case 44 -> 109;
               case 45 -> 248;
               case 46 -> 173;
               case 47 -> 165;
               case 48 -> 15;
               case 49 -> 243;
               case 50 -> 120;
               case 51 -> 99;
               case 52 -> 107;
               case 53 -> 23;
               case 54 -> 100;
               case 55 -> 28;
               case 56 -> 250;
               case 57 -> 22;
               case 58 -> 42;
               case 59 -> 36;
               case 60 -> 137;
               case 61 -> 12;
               case 62 -> 65;
               case 63 -> 205;
               case 64 -> 38;
               case 65 -> 227;
               case 66 -> 254;
               case 67 -> 14;
               case 68 -> 242;
               case 69 -> 225;
               case 70 -> 231;
               case 71 -> 202;
               case 72 -> 54;
               case 73 -> 39;
               case 74 -> 89;
               case 75 -> 20;
               case 76 -> 134;
               case 77 -> 247;
               case 78 -> 249;
               case 79 -> 114;
               case 80 -> 84;
               case 81 -> 240;
               case 82 -> 210;
               case 83 -> 149;
               case 84 -> 245;
               case 85 -> 69;
               case 86 -> 117;
               case 87 -> 86;
               case 88 -> 132;
               case 89 -> 5;
               case 90 -> 193;
               case 91 -> 46;
               case 92 -> 85;
               case 93 -> 189;
               case 94 -> 27;
               case 95 -> 150;
               case 96 -> 142;
               case 97 -> 252;
               case 98 -> 224;
               case 99 -> 21;
               case 100 -> 91;
               case 101 -> 126;
               case 102 -> 70;
               case 103 -> 174;
               case 104 -> 228;
               case 105 -> 213;
               case 106 -> 121;
               case 107 -> 6;
               case 108 -> 64;
               case 109 -> 155;
               case 110 -> 61;
               case 111 -> 108;
               case 112 -> 57;
               case 113 -> 230;
               case 114 -> 17;
               case 115 -> 212;
               case 116 -> 199;
               case 117 -> 203;
               case 118 -> 130;
               case 119 -> 140;
               case 120 -> 135;
               case 121 -> 156;
               case 122 -> 188;
               case 123 -> 52;
               case 124 -> 90;
               case 125 -> 55;
               case 126 -> 253;
               case 127 -> 244;
               case 128 -> 13;
               case 129 -> 186;
               case 130 -> 48;
               case 131 -> 133;
               case 132 -> 223;
               case 133 -> 60;
               case 134 -> 226;
               case 135 -> 179;
               case 136 -> 148;
               case 137 -> 29;
               case 138 -> 251;
               case 139 -> 53;
               case 140 -> 214;
               case 141 -> 81;
               case 142 -> 167;
               case 143 -> 206;
               case 144 -> 185;
               case 145 -> 180;
               case 146 -> 129;
               case 147 -> 59;
               case 148 -> 73;
               case 149 -> 35;
               case 150 -> 182;
               case 151 -> 113;
               case 152 -> 80;
               case 153 -> 32;
               case 154 -> 147;
               case 155 -> 241;
               case 156 -> 172;
               case 157 -> 162;
               case 158 -> 154;
               case 159 -> 72;
               case 160 -> 127;
               case 161 -> 66;
               case 162 -> 45;
               case 163 -> 255;
               case 164 -> 171;
               case 165 -> 110;
               case 166 -> 0;
               case 167 -> 201;
               case 168 -> 187;
               case 169 -> 51;
               case 170 -> 211;
               case 171 -> 83;
               case 172 -> 101;
               case 173 -> 164;
               case 174 -> 88;
               case 175 -> 181;
               case 176 -> 235;
               case 177 -> 246;
               case 178 -> 111;
               case 179 -> 192;
               case 180 -> 67;
               case 181 -> 82;
               case 182 -> 219;
               case 183 -> 71;
               case 184 -> 30;
               case 185 -> 176;
               case 186 -> 2;
               case 187 -> 4;
               case 188 -> 122;
               case 189 -> 198;
               case 190 -> 200;
               case 191 -> 47;
               case 192 -> 74;
               case 193 -> 44;
               case 194 -> 103;
               case 195 -> 9;
               case 196 -> 216;
               case 197 -> 161;
               case 198 -> 209;
               case 199 -> 169;
               case 200 -> 16;
               case 201 -> 43;
               case 202 -> 116;
               case 203 -> 7;
               case 204 -> 96;
               case 205 -> 58;
               case 206 -> 138;
               case 207 -> 196;
               case 208 -> 3;
               case 209 -> 175;
               case 210 -> 94;
               case 211 -> 218;
               case 212 -> 168;
               case 213 -> 62;
               case 214 -> 141;
               case 215 -> 93;
               case 216 -> 233;
               case 217 -> 151;
               case 218 -> 166;
               case 219 -> 194;
               case 220 -> 118;
               case 221 -> 136;
               case 222 -> 232;
               case 223 -> 79;
               case 224 -> 112;
               case 225 -> 190;
               case 226 -> 217;
               case 227 -> 63;
               case 228 -> 8;
               case 229 -> 40;
               case 230 -> 177;
               case 231 -> 170;
               case 232 -> 92;
               case 233 -> 207;
               case 234 -> 24;
               case 235 -> 208;
               case 236 -> 125;
               case 237 -> 128;
               case 238 -> 222;
               case 239 -> 68;
               case 240 -> 229;
               case 241 -> 145;
               case 242 -> 119;
               case 243 -> 236;
               case 244 -> 163;
               case 245 -> 33;
               case 246 -> 237;
               case 247 -> 123;
               case 248 -> 178;
               case 249 -> 160;
               case 250 -> 41;
               case 251 -> 157;
               case 252 -> 220;
               case 253 -> 1;
               case 254 -> 158;
               default -> 50;
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
         public static me.octo.client.IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(me.octo.client.IIlIIIIllIlIlllIlIlllIlIIIIlllllIllIlIllIIlIIIIllIIIlIlIIIIIIlIlllIIlIllIIlllIlIIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll p0, int p1, me.octo.client.lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll p2, int mask, java.lang.Object marker) {
         if ((mask & 1) != 0) { p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
         if ((mask & 2) != 0) { p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
         return p0.a(p1, p2);
      }
}
}
