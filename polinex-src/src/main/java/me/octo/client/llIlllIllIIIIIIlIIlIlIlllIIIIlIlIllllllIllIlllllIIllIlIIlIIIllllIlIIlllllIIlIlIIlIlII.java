package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
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

public final class llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII
   extends lllIllllIlIIllIlIIlIIllIIIIIIIIIlIIIIllllIlIllIlllIlIlIlIIIIIIlllIIIIIllIIIIIllIlIIIl {
    public static <T> T f(Object p0) { return null; } // PX-FIX mr3
    public static <T> T e(Object p0) { return null; } // PX-FIX mr3

   public Object receiver; // PX-FIX kotlin lambda receiver

   @NotNull
   public static llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
   private int IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   @NotNull
   private final ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
   private int llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
   @NotNull
   private static llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;

   public static final llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII bl() {
      return lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
   }

   public static final void a(llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII var0, IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      var0.a(var1);
   }
   private static String[] j;
   private static String[] k;

   public llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII() {
      short var10001 = -18930;
      short var10002 = 2110;
      var10002 = -18934;
      short var10003 = -3630;
      me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var6 = me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      short var10004 = -18942;
      short var10005 = 15003;
      String[] var1 = new String[3];
      short var10007 = -18937;
      short var10008 = -3130;
      var1[0] = "This macro kills Glacite Walkers in the Dwarven Mines";
      var10007 = -18929;
      var10008 = 30876;
      var1[1] = "Uses CombatBot for intelligent targeting and pathfinding";
      var10007 = -18932;
      var10008 = 24413;
      var1[2] = "Tracks session kills";
      List var7 = CollectionsKt.listOf(var1);
      var1 = new String[3];
      var10008 = -18916;
      short var10009 = 31798;
      var1[0] = "Make sure you have a good combat pet";
      var10008 = -18943;
      var10009 = -14845;
      var1[1] = "Use a strong melee weapon or mining tool";
      var10008 = -18938;
      var10009 = -6848;
      var1[2] = "Etherwarp recommended for movement";
      List var10006 = CollectionsKt.listOf(var1);
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var3 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         lIIIlIIIlllllIllIIlIllllIIllIIlIIIIIIIIIIllIIIlllIllllIllIIllllIIllIIlllIIIIIIIIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a()
      };
      super("Glacite Walker Macro", "Kills Glacite Walkers in the Dwarven Mines.", var6, "Dwarven", var7, var10006, false, var3);
      IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll[] var4 = new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll[]{
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(0, 127, 137),
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
      short var10002 = -18915;
      short var10003 = 11006;
      Intrinsics.checkNotNullParameter(var1, "event");
      String var2 = var10000;
      llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII var8 = this;
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
                        var10002 = -18914;
                        var10003 = -13384;
                        Intrinsics.checkNotNullExpressionValue(var10000, "getString(...)");
                        String var5 = var10000;
                        CharSequence var13 = var5;
                        short var10001 = -18944;
                        var10002 = -340;
                        boolean var14 = StringsKt.contains(var13, "Glacite Walker", false);
                        if (var2 != null) {
                           if (var14) {
                              break label50;
                           }

                           CharSequence var15 = var5;
                           var10001 = -18913;
                           var10002 = -6552;
                           var14 = StringsKt.contains(var15, "Ice Walker", false);
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
      short var10001 = -18933;
      short var10002 = 28535;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10000),
         "Glacite Walker travel",
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
                  short var10004 = 19961;
                  short var10005 = -32271;
                  var10005 = 19960;
                  short var10006 = 18807;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001x = 19962;
                  short var10002x = 32291;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "Gt£\u0007:ËTiæïX\u0007\u008cø\u008cl÷©\u000b\t\u009cØ¨ë\u0092¶´ÃÌ|pÙïH©\u001añ\u0087´Ì¼\u009f¡]x£\u0003û}Æ$0(®.lØ\u0087W\\æ ä,³m[ @\u0019\u0015\u008dË¹ô\u009d¦\u008bÞ¼R\u009bÅK\u0001cíÀ±\u0016+{Ë\u0087q}\u0084²¨ÝØ\u0017\u0017ìÚ$Ql£\u0000û8ã(0\r\n.y|\u0000B-D\u008e°¾|\u009d\u0018Ï\"²Í\u0018\u0092\u0010Bn\u008aI«®mÈÞ\u007fÿ\u001aÃ¾\u0081ìÀ\u0002µ\u001a";
                  int var4 = "Gt£\u0007:ËTiæïX\u0007\u008cø\u008cl÷©\u000b\t\u009cØ¨ë\u0092¶´ÃÌ|pÙïH©\u001añ\u0087´Ì¼\u009f¡]x£\u0003û}Æ$0(®.lØ\u0087W\\æ ä,³m[ @\u0019\u0015\u008dË¹ô\u009d¦\u008bÞ¼R\u009bÅK\u0001cíÀ±\u0016+{Ë\u0087q}\u0084²¨ÝØ\u0017\u0017ìÚ$Ql£\u0000û8ã(0\r\n.y|\u0000B-D\u008e°¾|\u009d\u0018Ï\"²Í\u0018\u0092\u0010Bn\u008aI«®mÈÞ\u007fÿ\u001aÃ¾\u0081ìÀ\u0002µ\u001a"
                     .length();
                  char var1 = 129;
                  int var0 = -1;

                  while (true) {
                     char[] var10002x;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 20;
                        var10002x = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 20;
                           var10006 = var6;
                        } else {
                           var13 = 20;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 20;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 101;
                              case 1 -> 49;
                              case 2 -> 122;
                              case 3 -> 16;
                              case 4 -> 88;
                              case 5 -> 50;
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
                  int var2 = (var0 ^ 19960) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 104;
                        case 1 -> 45;
                        case 2 -> 13;
                        case 3 -> 157;
                        case 4 -> 192;
                        case 5 -> 186;
                        case 6 -> 214;
                        case 7 -> 119;
                        case 8 -> 137;
                        case 9 -> 250;
                        case 10 -> 254;
                        case 11 -> 53;
                        case 12 -> 174;
                        case 13 -> 113;
                        case 14 -> 244;
                        case 15 -> 184;
                        case 16 -> 76;
                        case 17 -> 114;
                        case 18 -> 20;
                        case 19 -> 89;
                        case 20 -> 116;
                        case 21 -> 150;
                        case 22 -> 66;
                        case 23 -> 122;
                        case 24 -> 148;
                        case 25 -> 136;
                        case 26 -> 61;
                        case 27 -> 30;
                        case 28 -> 92;
                        case 29 -> 23;
                        case 30 -> 239;
                        case 31 -> 38;
                        case 32 -> 232;
                        case 33 -> 201;
                        case 34 -> 213;
                        case 35 -> 235;
                        case 36 -> 51;
                        case 37 -> 102;
                        case 38 -> 7;
                        case 39 -> 223;
                        case 40 -> 134;
                        case 41 -> 130;
                        case 42 -> 246;
                        case 43 -> 22;
                        case 44 -> 93;
                        case 45 -> 29;
                        case 46 -> 52;
                        case 47 -> 96;
                        case 48 -> 55;
                        case 49 -> 135;
                        case 50 -> 12;
                        case 51 -> 220;
                        case 52 -> 218;
                        case 53 -> 50;
                        case 54 -> 25;
                        case 55 -> 90;
                        case 56 -> 229;
                        case 57 -> 193;
                        case 58 -> 228;
                        case 59 -> 56;
                        case 60 -> 152;
                        case 61 -> 187;
                        case 62 -> 205;
                        case 63 -> 167;
                        case 64 -> 225;
                        case 65 -> 73;
                        case 66 -> 178;
                        case 67 -> 131;
                        case 68 -> 17;
                        case 69 -> 57;
                        case 70 -> 39;
                        case 71 -> 5;
                        case 72 -> 101;
                        case 73 -> 196;
                        case 74 -> 159;
                        case 75 -> 164;
                        case 76 -> 99;
                        case 77 -> 33;
                        case 78 -> 81;
                        case 79 -> 86;
                        case 80 -> 209;
                        case 81 -> 103;
                        case 82 -> 139;
                        case 83 -> 211;
                        case 84 -> 83;
                        case 85 -> 165;
                        case 86 -> 175;
                        case 87 -> 171;
                        case 88 -> 210;
                        case 89 -> 11;
                        case 90 -> 255;
                        case 91 -> 168;
                        case 92 -> 64;
                        case 93 -> 182;
                        case 94 -> 199;
                        case 95 -> 215;
                        case 96 -> 151;
                        case 97 -> 153;
                        case 98 -> 149;
                        case 99 -> 105;
                        case 100 -> 142;
                        case 101 -> 3;
                        case 102 -> 169;
                        case 103 -> 37;
                        case 104 -> 42;
                        case 105 -> 125;
                        case 106 -> 16;
                        case 107 -> 172;
                        case 108 -> 32;
                        case 109 -> 79;
                        case 110 -> 10;
                        case 111 -> 26;
                        case 112 -> 158;
                        case 113 -> 9;
                        case 114 -> 78;
                        case 115 -> 65;
                        case 116 -> 194;
                        case 117 -> 160;
                        case 118 -> 44;
                        case 119 -> 97;
                        case 120 -> 67;
                        case 121 -> 185;
                        case 122 -> 15;
                        case 123 -> 31;
                        case 124 -> 115;
                        case 125 -> 0;
                        case 126 -> 188;
                        case 127 -> 120;
                        case 128 -> 112;
                        case 129 -> 247;
                        case 130 -> 34;
                        case 131 -> 154;
                        case 132 -> 242;
                        case 133 -> 195;
                        case 134 -> 127;
                        case 135 -> 71;
                        case 136 -> 197;
                        case 137 -> 59;
                        case 138 -> 202;
                        case 139 -> 144;
                        case 140 -> 36;
                        case 141 -> 161;
                        case 142 -> 183;
                        case 143 -> 60;
                        case 144 -> 47;
                        case 145 -> 198;
                        case 146 -> 206;
                        case 147 -> 18;
                        case 148 -> 240;
                        case 149 -> 70;
                        case 150 -> 84;
                        case 151 -> 8;
                        case 152 -> 87;
                        case 153 -> 147;
                        case 154 -> 68;
                        case 155 -> 204;
                        case 156 -> 106;
                        case 157 -> 138;
                        case 158 -> 226;
                        case 159 -> 190;
                        case 160 -> 243;
                        case 161 -> 62;
                        case 162 -> 162;
                        case 163 -> 216;
                        case 164 -> 4;
                        case 165 -> 163;
                        case 166 -> 28;
                        case 167 -> 208;
                        case 168 -> 224;
                        case 169 -> 252;
                        case 170 -> 75;
                        case 171 -> 179;
                        case 172 -> 80;
                        case 173 -> 177;
                        case 174 -> 121;
                        case 175 -> 123;
                        case 176 -> 166;
                        case 177 -> 251;
                        case 178 -> 14;
                        case 179 -> 108;
                        case 180 -> 49;
                        case 181 -> 21;
                        case 182 -> 1;
                        case 183 -> 222;
                        case 184 -> 72;
                        case 185 -> 181;
                        case 186 -> 46;
                        case 187 -> 82;
                        case 188 -> 170;
                        case 189 -> 6;
                        case 190 -> 27;
                        case 191 -> 238;
                        case 192 -> 133;
                        case 193 -> 94;
                        case 194 -> 74;
                        case 195 -> 143;
                        case 196 -> 111;
                        case 197 -> 233;
                        case 198 -> 110;
                        case 199 -> 2;
                        case 200 -> 155;
                        case 201 -> 203;
                        case 202 -> 156;
                        case 203 -> 237;
                        case 204 -> 221;
                        case 205 -> 180;
                        case 206 -> 63;
                        case 207 -> 217;
                        case 208 -> 107;
                        case 209 -> 77;
                        case 210 -> 253;
                        case 211 -> 191;
                        case 212 -> 124;
                        case 213 -> 200;
                        case 214 -> 43;
                        case 215 -> 241;
                        case 216 -> 69;
                        case 217 -> 118;
                        case 218 -> 48;
                        case 219 -> 219;
                        case 220 -> 24;
                        case 221 -> 249;
                        case 222 -> 140;
                        case 223 -> 85;
                        case 224 -> 41;
                        case 225 -> 212;
                        case 226 -> 126;
                        case 227 -> 88;
                        case 228 -> 236;
                        case 229 -> 98;
                        case 230 -> 58;
                        case 231 -> 145;
                        case 232 -> 100;
                        case 233 -> 227;
                        case 234 -> 146;
                        case 235 -> 207;
                        case 236 -> 109;
                        case 237 -> 91;
                        case 238 -> 248;
                        case 239 -> 176;
                        case 240 -> 117;
                        case 241 -> 54;
                        case 242 -> 40;
                        case 243 -> 231;
                        case 244 -> 35;
                        case 245 -> 173;
                        case 246 -> 245;
                        case 247 -> 129;
                        case 248 -> 141;
                        case 249 -> 95;
                        case 250 -> 230;
                        case 251 -> 132;
                        case 252 -> 234;
                        case 253 -> 128;
                        case 254 -> 19;
                        default -> 189;
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
      var10001 = -18931;
      var10002 = -21162;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10000),
         "Glacite Walker route",
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
                  short var10004 = 4069;
                  short var10005 = 18290;
                  var10005 = 4068;
                  short var10006 = -17282;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = 4071;
                  short var10002 = -1797;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "ÅÞ¢\u0018\u0096>LÝ[(¥s%û³²A8Q-ZVÎk\u0081\u0099q)íç\u0080b\n\u009eÒ\u001d,2\u0010QÏ\u001d\u0097ÚØ+èà¼ÑÐÊ\u0082\tê\u0099A^M\u0012°8\u0083ÇÀÄ\u0093¤b\u0089\u000e±X¦¸á®Úñf\nÛõfXL6<ô\u0016'¥å\u0089,&\u0095üð\u009e¢ffxPÌ\u008a\u0000ä³(êãÝd+?u^ìÊ!É\u0016\f^gKôÜ-/\u001c&\u0082]å=-ºç×eO\u001fx\u007fho0Xcßw\u0002>R";
                  int var4 = "ÅÞ¢\u0018\u0096>LÝ[(¥s%û³²A8Q-ZVÎk\u0081\u0099q)íç\u0080b\n\u009eÒ\u001d,2\u0010QÏ\u001d\u0097ÚØ+èà¼ÑÐÊ\u0082\tê\u0099A^M\u0012°8\u0083ÇÀÄ\u0093¤b\u0089\u000e±X¦¸á®Úñf\nÛõfXL6<ô\u0016'¥å\u0089,&\u0095üð\u009e¢ffxPÌ\u008a\u0000ä³(êãÝd+?u^ìÊ!É\u0016\f^gKôÜ-/\u001c&\u0082]å=-ºç×eO\u001fx\u007fho0Xcßw\u0002>R"
                     .length();
                  char var1 = 24;
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
                              case 0 -> 61;
                              case 1 -> 18;
                              case 2 -> 22;
                              case 3 -> 8;
                              case 4 -> 111;
                              case 5 -> 17;
                              default -> 117;
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
                  int var2 = (var0 ^ 4069) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 56;
                        case 1 -> 51;
                        case 2 -> 84;
                        case 3 -> 158;
                        case 4 -> 237;
                        case 5 -> 85;
                        case 6 -> 254;
                        case 7 -> 38;
                        case 8 -> 6;
                        case 9 -> 219;
                        case 10 -> 63;
                        case 11 -> 235;
                        case 12 -> 218;
                        case 13 -> 231;
                        case 14 -> 214;
                        case 15 -> 250;
                        case 16 -> 112;
                        case 17 -> 124;
                        case 18 -> 92;
                        case 19 -> 228;
                        case 20 -> 196;
                        case 21 -> 198;
                        case 22 -> 17;
                        case 23 -> 55;
                        case 24 -> 127;
                        case 25 -> 170;
                        case 26 -> 247;
                        case 27 -> 26;
                        case 28 -> 125;
                        case 29 -> 136;
                        case 30 -> 162;
                        case 31 -> 35;
                        case 32 -> 151;
                        case 33 -> 132;
                        case 34 -> 242;
                        case 35 -> 44;
                        case 36 -> 103;
                        case 37 -> 116;
                        case 38 -> 95;
                        case 39 -> 164;
                        case 40 -> 249;
                        case 41 -> 252;
                        case 42 -> 192;
                        case 43 -> 213;
                        case 44 -> 57;
                        case 45 -> 65;
                        case 46 -> 173;
                        case 47 -> 82;
                        case 48 -> 104;
                        case 49 -> 152;
                        case 50 -> 53;
                        case 51 -> 111;
                        case 52 -> 241;
                        case 53 -> 34;
                        case 54 -> 49;
                        case 55 -> 107;
                        case 56 -> 251;
                        case 57 -> 74;
                        case 58 -> 189;
                        case 59 -> 188;
                        case 60 -> 180;
                        case 61 -> 7;
                        case 62 -> 200;
                        case 63 -> 208;
                        case 64 -> 93;
                        case 65 -> 201;
                        case 66 -> 227;
                        case 67 -> 97;
                        case 68 -> 99;
                        case 69 -> 88;
                        case 70 -> 119;
                        case 71 -> 52;
                        case 72 -> 142;
                        case 73 -> 89;
                        case 74 -> 66;
                        case 75 -> 139;
                        case 76 -> 2;
                        case 77 -> 138;
                        case 78 -> 98;
                        case 79 -> 210;
                        case 80 -> 203;
                        case 81 -> 135;
                        case 82 -> 193;
                        case 83 -> 156;
                        case 84 -> 4;
                        case 85 -> 78;
                        case 86 -> 110;
                        case 87 -> 236;
                        case 88 -> 169;
                        case 89 -> 184;
                        case 90 -> 246;
                        case 91 -> 207;
                        case 92 -> 73;
                        case 93 -> 13;
                        case 94 -> 146;
                        case 95 -> 147;
                        case 96 -> 206;
                        case 97 -> 120;
                        case 98 -> 67;
                        case 99 -> 1;
                        case 100 -> 182;
                        case 101 -> 171;
                        case 102 -> 81;
                        case 103 -> 155;
                        case 104 -> 11;
                        case 105 -> 75;
                        case 106 -> 36;
                        case 107 -> 109;
                        case 108 -> 255;
                        case 109 -> 39;
                        case 110 -> 204;
                        case 111 -> 131;
                        case 112 -> 126;
                        case 113 -> 185;
                        case 114 -> 20;
                        case 115 -> 199;
                        case 116 -> 222;
                        case 117 -> 100;
                        case 118 -> 221;
                        case 119 -> 18;
                        case 120 -> 149;
                        case 121 -> 114;
                        case 122 -> 128;
                        case 123 -> 215;
                        case 124 -> 64;
                        case 125 -> 21;
                        case 126 -> 244;
                        case 127 -> 42;
                        case 128 -> 150;
                        case 129 -> 16;
                        case 130 -> 15;
                        case 131 -> 205;
                        case 132 -> 27;
                        case 133 -> 94;
                        case 134 -> 209;
                        case 135 -> 9;
                        case 136 -> 187;
                        case 137 -> 183;
                        case 138 -> 32;
                        case 139 -> 69;
                        case 140 -> 87;
                        case 141 -> 50;
                        case 142 -> 115;
                        case 143 -> 148;
                        case 144 -> 3;
                        case 145 -> 43;
                        case 146 -> 25;
                        case 147 -> 24;
                        case 148 -> 71;
                        case 149 -> 141;
                        case 150 -> 72;
                        case 151 -> 137;
                        case 152 -> 154;
                        case 153 -> 108;
                        case 154 -> 216;
                        case 155 -> 212;
                        case 156 -> 159;
                        case 157 -> 223;
                        case 158 -> 90;
                        case 159 -> 106;
                        case 160 -> 195;
                        case 161 -> 177;
                        case 162 -> 41;
                        case 163 -> 140;
                        case 164 -> 238;
                        case 165 -> 194;
                        case 166 -> 230;
                        case 167 -> 160;
                        case 168 -> 167;
                        case 169 -> 240;
                        case 170 -> 30;
                        case 171 -> 48;
                        case 172 -> 181;
                        case 173 -> 118;
                        case 174 -> 123;
                        case 175 -> 8;
                        case 176 -> 102;
                        case 177 -> 186;
                        case 178 -> 40;
                        case 179 -> 68;
                        case 180 -> 31;
                        case 181 -> 22;
                        case 182 -> 54;
                        case 183 -> 232;
                        case 184 -> 28;
                        case 185 -> 113;
                        case 186 -> 5;
                        case 187 -> 47;
                        case 188 -> 253;
                        case 189 -> 157;
                        case 190 -> 61;
                        case 191 -> 33;
                        case 192 -> 175;
                        case 193 -> 143;
                        case 194 -> 233;
                        case 195 -> 105;
                        case 196 -> 10;
                        case 197 -> 144;
                        case 198 -> 133;
                        case 199 -> 220;
                        case 200 -> 14;
                        case 201 -> 217;
                        case 202 -> 121;
                        case 203 -> 70;
                        case 204 -> 229;
                        case 205 -> 83;
                        case 206 -> 174;
                        case 207 -> 62;
                        case 208 -> 202;
                        case 209 -> 168;
                        case 210 -> 163;
                        case 211 -> 101;
                        case 212 -> 161;
                        case 213 -> 243;
                        case 214 -> 166;
                        case 215 -> 245;
                        case 216 -> 59;
                        case 217 -> 176;
                        case 218 -> 197;
                        case 219 -> 46;
                        case 220 -> 190;
                        case 221 -> 58;
                        case 222 -> 165;
                        case 223 -> 122;
                        case 224 -> 225;
                        case 225 -> 19;
                        case 226 -> 248;
                        case 227 -> 234;
                        case 228 -> 80;
                        case 229 -> 134;
                        case 230 -> 23;
                        case 231 -> 96;
                        case 232 -> 179;
                        case 233 -> 91;
                        case 234 -> 224;
                        case 235 -> 12;
                        case 236 -> 37;
                        case 237 -> 153;
                        case 238 -> 0;
                        case 239 -> 130;
                        case 240 -> 145;
                        case 241 -> 191;
                        case 242 -> 29;
                        case 243 -> 76;
                        case 244 -> 129;
                        case 245 -> 45;
                        case 246 -> 239;
                        case 247 -> 79;
                        case 248 -> 77;
                        case 249 -> 172;
                        case 250 -> 60;
                        case 251 -> 178;
                        case 252 -> 226;
                        case 253 -> 211;
                        case 254 -> 86;
                        default -> 117;
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
      var10001 = -18936;
      var10002 = -868;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10000,
         "Glacite Walker combat",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
         60000L,
         0L,
         (Function0)(() -> bk()),
         false,
         false,
         (Function0)(() -> d(this)),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = -23307;
                  short var10005 = 2957;
                  var10005 = -23306;
                  short var10006 = -8804;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = -23305;
                  short var10002 = -17294;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "¹®\u0081¶Õ\n×\u0018}©3æ3¼\u008b¼Ð\u0006Ö1\u001aÄÓÜ\u000f\u001f\u0086\u0080\fZ-\u009d\u001eÍqOñ\u0004¡ûg\u0011Ç¤G.ù\u001eÓØY¿\u001eÃ¼0(\u0081\u0005¡\u0015ïêæÚ]ï;\u0082®ÊRýÛ®\u00859*!Ä\u0090-HÈ\u0012:ÃrÍ\u0014ñ\u0099\u009c\u0097¦ã«\u0090ï\u0014Y6\u001f\u009c«\u0088×\u0090Ï§\u0086\u0099J\u0010È\u0012\u0089\u0099Ý(\u0098\u0084&\u0000\u009eÉÈ¾\u00984Æ[\u0018\u0006 \u001cyÚ¨ñ\u0089ídÝa\u0090\u008d\u0083}\u0081oÒ}\u001eÚG<";
                  int var4 = "¹®\u0081¶Õ\n×\u0018}©3æ3¼\u008b¼Ð\u0006Ö1\u001aÄÓÜ\u000f\u001f\u0086\u0080\fZ-\u009d\u001eÍqOñ\u0004¡ûg\u0011Ç¤G.ù\u001eÓØY¿\u001eÃ¼0(\u0081\u0005¡\u0015ïêæÚ]ï;\u0082®ÊRýÛ®\u00859*!Ä\u0090-HÈ\u0012:ÃrÍ\u0014ñ\u0099\u009c\u0097¦ã«\u0090ï\u0014Y6\u001f\u009c«\u0088×\u0090Ï§\u0086\u0099J\u0010È\u0012\u0089\u0099Ý(\u0098\u0084&\u0000\u009eÉÈ¾\u00984Æ[\u0018\u0006 \u001cyÚ¨ñ\u0089ídÝa\u0090\u008d\u0083}\u0081oÒ}\u001eÚG<"
                     .length();
                  char var1 = 2;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 121;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 121;
                           var10006 = var6;
                        } else {
                           var13 = 121;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 121;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 44;
                              case 1 -> 1;
                              case 2 -> 4;
                              case 3 -> 50;
                              case 4 -> 64;
                              case 5 -> 26;
                              default -> 82;
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
                  int var2 = (var0 ^ -23305) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 31;
                        case 1 -> 100;
                        case 2 -> 245;
                        case 3 -> 140;
                        case 4 -> 221;
                        case 5 -> 243;
                        case 6 -> 195;
                        case 7 -> 201;
                        case 8 -> 226;
                        case 9 -> 184;
                        case 10 -> 57;
                        case 11 -> 130;
                        case 12 -> 24;
                        case 13 -> 43;
                        case 14 -> 152;
                        case 15 -> 67;
                        case 16 -> 124;
                        case 17 -> 149;
                        case 18 -> 92;
                        case 19 -> 103;
                        case 20 -> 49;
                        case 21 -> 52;
                        case 22 -> 172;
                        case 23 -> 141;
                        case 24 -> 250;
                        case 25 -> 16;
                        case 26 -> 228;
                        case 27 -> 180;
                        case 28 -> 206;
                        case 29 -> 75;
                        case 30 -> 56;
                        case 31 -> 193;
                        case 32 -> 10;
                        case 33 -> 96;
                        case 34 -> 199;
                        case 35 -> 78;
                        case 36 -> 89;
                        case 37 -> 154;
                        case 38 -> 175;
                        case 39 -> 85;
                        case 40 -> 136;
                        case 41 -> 176;
                        case 42 -> 194;
                        case 43 -> 222;
                        case 44 -> 183;
                        case 45 -> 212;
                        case 46 -> 240;
                        case 47 -> 251;
                        case 48 -> 64;
                        case 49 -> 132;
                        case 50 -> 220;
                        case 51 -> 50;
                        case 52 -> 131;
                        case 53 -> 205;
                        case 54 -> 46;
                        case 55 -> 68;
                        case 56 -> 189;
                        case 57 -> 30;
                        case 58 -> 118;
                        case 59 -> 234;
                        case 60 -> 125;
                        case 61 -> 58;
                        case 62 -> 122;
                        case 63 -> 238;
                        case 64 -> 112;
                        case 65 -> 137;
                        case 66 -> 143;
                        case 67 -> 213;
                        case 68 -> 162;
                        case 69 -> 164;
                        case 70 -> 90;
                        case 71 -> 29;
                        case 72 -> 239;
                        case 73 -> 255;
                        case 74 -> 42;
                        case 75 -> 246;
                        case 76 -> 72;
                        case 77 -> 3;
                        case 78 -> 110;
                        case 79 -> 0;
                        case 80 -> 109;
                        case 81 -> 161;
                        case 82 -> 185;
                        case 83 -> 82;
                        case 84 -> 135;
                        case 85 -> 34;
                        case 86 -> 168;
                        case 87 -> 47;
                        case 88 -> 191;
                        case 89 -> 40;
                        case 90 -> 248;
                        case 91 -> 160;
                        case 92 -> 121;
                        case 93 -> 202;
                        case 94 -> 6;
                        case 95 -> 77;
                        case 96 -> 229;
                        case 97 -> 134;
                        case 98 -> 95;
                        case 99 -> 174;
                        case 100 -> 197;
                        case 101 -> 144;
                        case 102 -> 187;
                        case 103 -> 99;
                        case 104 -> 209;
                        case 105 -> 147;
                        case 106 -> 105;
                        case 107 -> 216;
                        case 108 -> 32;
                        case 109 -> 12;
                        case 110 -> 61;
                        case 111 -> 219;
                        case 112 -> 107;
                        case 113 -> 163;
                        case 114 -> 114;
                        case 115 -> 13;
                        case 116 -> 60;
                        case 117 -> 80;
                        case 118 -> 9;
                        case 119 -> 138;
                        case 120 -> 23;
                        case 121 -> 18;
                        case 122 -> 186;
                        case 123 -> 97;
                        case 124 -> 19;
                        case 125 -> 178;
                        case 126 -> 33;
                        case 127 -> 27;
                        case 128 -> 115;
                        case 129 -> 153;
                        case 130 -> 235;
                        case 131 -> 211;
                        case 132 -> 148;
                        case 133 -> 247;
                        case 134 -> 198;
                        case 135 -> 74;
                        case 136 -> 63;
                        case 137 -> 170;
                        case 138 -> 252;
                        case 139 -> 139;
                        case 140 -> 69;
                        case 141 -> 102;
                        case 142 -> 166;
                        case 143 -> 111;
                        case 144 -> 91;
                        case 145 -> 253;
                        case 146 -> 120;
                        case 147 -> 37;
                        case 148 -> 225;
                        case 149 -> 79;
                        case 150 -> 223;
                        case 151 -> 200;
                        case 152 -> 207;
                        case 153 -> 51;
                        case 154 -> 11;
                        case 155 -> 128;
                        case 156 -> 188;
                        case 157 -> 157;
                        case 158 -> 81;
                        case 159 -> 88;
                        case 160 -> 45;
                        case 161 -> 53;
                        case 162 -> 5;
                        case 163 -> 241;
                        case 164 -> 177;
                        case 165 -> 119;
                        case 166 -> 4;
                        case 167 -> 165;
                        case 168 -> 244;
                        case 169 -> 20;
                        case 170 -> 15;
                        case 171 -> 55;
                        case 172 -> 156;
                        case 173 -> 101;
                        case 174 -> 129;
                        case 175 -> 94;
                        case 176 -> 224;
                        case 177 -> 179;
                        case 178 -> 25;
                        case 179 -> 48;
                        case 180 -> 182;
                        case 181 -> 145;
                        case 182 -> 142;
                        case 183 -> 93;
                        case 184 -> 28;
                        case 185 -> 231;
                        case 186 -> 62;
                        case 187 -> 227;
                        case 188 -> 86;
                        case 189 -> 26;
                        case 190 -> 41;
                        case 191 -> 249;
                        case 192 -> 39;
                        case 193 -> 71;
                        case 194 -> 70;
                        case 195 -> 73;
                        case 196 -> 215;
                        case 197 -> 7;
                        case 198 -> 76;
                        case 199 -> 127;
                        case 200 -> 167;
                        case 201 -> 98;
                        case 202 -> 236;
                        case 203 -> 38;
                        case 204 -> 65;
                        case 205 -> 117;
                        case 206 -> 218;
                        case 207 -> 83;
                        case 208 -> 233;
                        case 209 -> 196;
                        case 210 -> 116;
                        case 211 -> 126;
                        case 212 -> 66;
                        case 213 -> 190;
                        case 214 -> 204;
                        case 215 -> 84;
                        case 216 -> 106;
                        case 217 -> 203;
                        case 218 -> 173;
                        case 219 -> 87;
                        case 220 -> 150;
                        case 221 -> 171;
                        case 222 -> 2;
                        case 223 -> 237;
                        case 224 -> 210;
                        case 225 -> 254;
                        case 226 -> 159;
                        case 227 -> 17;
                        case 228 -> 54;
                        case 229 -> 208;
                        case 230 -> 22;
                        case 231 -> 242;
                        case 232 -> 123;
                        case 233 -> 108;
                        case 234 -> 133;
                        case 235 -> 217;
                        case 236 -> 214;
                        case 237 -> 104;
                        case 238 -> 146;
                        case 239 -> 151;
                        case 240 -> 113;
                        case 241 -> 192;
                        case 242 -> 59;
                        case 243 -> 8;
                        case 244 -> 232;
                        case 245 -> 155;
                        case 246 -> 158;
                        case 247 -> 14;
                        case 248 -> 181;
                        case 249 -> 44;
                        case 250 -> 36;
                        case 251 -> 1;
                        case 252 -> 35;
                        case 253 -> 21;
                        case 254 -> 230;
                        default -> 169;
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
         104,
         null
      );
   }

   @Override
   public void aC() {
      Object IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll = null; // PX-FIX
      label22: {
         String var1;
         label21: {
            var1 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
            llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII var10000 = this;
            if (var1 != null) {
               switch (((int[])llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)[this.W()
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
      llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII var2;
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

            var10000 = ((int[])llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII)[this.aJ()
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
         short var10002 = -18935;
         short var10003 = 16671;
         Intrinsics.checkNotNullExpressionValue(var10000, "get(...)");
      }

      IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var2 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)(Object)var10000;
      int var8 = ((int[])llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl)[var2.b()
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
            .h()
            .c();
      }

      if (var1 != null) {
         if (var10000) {
            return;
         }

         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .h()
            .b(
               lIIIlIIIlllllIllIIlIllllIIllIIlIIIIIIIIIIllIIIlllIllllIllIIllllIIllIIlllIIIIIIIIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a()
                  .al()
            );
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .h()
            .c(false);
         var10000 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .h()
            .o();
      }

      boolean var2 = var10000;
      if (var1 != null) {
         if (var2) {
            return;
         }

         short var10001 = -18941;
         short var10002 = 14146;
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
               (kotlin.jvm.functions.Function1)(llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII::e),
               var1.d(),
               0,
               0,
               0L,
               0,
               (kotlin.jvm.functions.Function1)(llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII::f),
               120,
               null
            )
         );
   }

   private final void bj() {
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .h()
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
               .h()
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
            me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .D();
            var1 = var10000;
            var2 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .q()
               != null;
            var3 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .g()
               == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
            llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII var11 = this;
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
                  llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII var17 = this;
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
         .h()
         .q();
      this.aN();
      super.N();
   }

   @Override
   public void O() {
      short var10001 = -18940;
      short var10002 = 314;
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.a(String.valueOf(
         llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl),
         "Session Info");
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a((kotlin.jvm.functions.Function0<String>)null,  16777215,  0);;
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a((kotlin.jvm.functions.Function0<String>)null,  16777215,  0);;
   }

   private static final long a(llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII var0) {
      return var0.aJ().b() + 15000L;
   }

   private static final Object b(llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII var0) {
      return TuplesKt.to(
         var0.aJ().a(),
         IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
      );
   }

   private static final Object c(llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII var0) {
      return new llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         var0.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI,
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .e()
            .d(),
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(var0, 0.0, 1, null)
      );
   }

   private static final boolean bk() {
      return IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .h()
         .c();
   }

   private static final Object d(llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII var0) {
      return new llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         var0.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI,
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .h()
            .k()
      );
   }

   private static final Unit e(llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII var0) {
      var0.bi();
      return Unit.INSTANCE;
   }

   private static final Unit f(llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII var0) {
      var0.bj();
      return Unit.INSTANCE;
   }

   private static final String g(llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII var0) {
      String var10000 = var0.W().name();
      short var10001 = -18919;
      short var10002 = -19428;
      return "Macro State: " + var10000;
   }

   private static final String h(llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII var0) {
      short var10001 = -18939;
      short var10002 = 19770;
      return "Glacite Walkers Killed: " + var0.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[21];
      int var3 = 0;
      String var2 = "\u0086n× K2\u009e³Yú\u0015ì{?©½·\u0011\u0095Á\u0014\u008c²çæOý\u0019þvx\u009bî\\!\u0006øD\u009a5\u009c8à O\u0085\u0095³/\u001f\u0011\u008b\u0097ë:ÕÊ2ÛqL&\u0015Ûp$D\u0099SÄ 1^G\u001b=\u009fÑ\u0018SxÜÑ§_É¡Nä\u009eo`õ\u0001q\u007fõ\u001a\u0014\u007f´èû¬YbÞÆWæY\u0005\u0089fT@â¢a\b!ß\u0012õ\u0003àsñ\u0015ú«X\u0018º% Q\u009e¦ígdNJ\u0082ËÝ\fG\r\u0015ÆÏß\u0094J´¾c]à\u0095¯kW«¶ê¢\u0082!R+H\u0011\u008eåÖ Vc\u0010'É\nEM\u0019ø;Övó¢M4*\r\u0007°©|¬\u0015×Ü\u009c\u0014j\u007fjMRÕLr\u0018>\"À)©\u0003Â\u0095Ò>dtU,?\u008dx\u0013Ô\u0017ÈHþ\b\fa\u0086¯\u0085\u0014\u009f~~1LÏÐ5ve°Uç\u0087o|Æ&+¸u«©ó=Ëzê\u001bV\f\"´O\u008eîØM¦ü]¶7\u009d%6Ô\u0016JGË\u0017\u008bT2>~¥Q\\\u0015\"\u007f\u0089£AöËU½\u0083b\u0093\u0098pcC\u0097\u0004³¸íM{3íQ\u008a&Ì]j·\u000eÍ!(\u001ac\u0010¾?\u008e\u000f®\u009a\u0089îA\u0003\u0018\u000e»¤\u001cè`\u008aÛü\u0090`%\u009d$>ÁCyÐ¿ï[\u0016é¸F\u000e¶uÑÃ\u008b^\u0086>ZKuÚwù*®\u007f\tnS±\u009d\u009cNÆm\u0097\u0001ts\u0012\u009e±Ñ.OÕ\u009doó|Å\u0012\u0014£\ncm\u0013kï¼\u007f§\u0096\u0016\u0098\u0007Ð\u0006~Äa\u009c,\u0005Cf\rõ\u0089$ºF\u0011\u000f\u0091\u0006µ\u0080\u001cÅÜfå¸ FÞ\u000fÖ\u0014\b\u0087^ÝÂ\u008c\u008e\f\u009cuû\u001b\u0087´g³\nãQ°ê\u001dE¤¡\u0004\u0089";
      int var4 = "\u0086n× K2\u009e³Yú\u0015ì{?©½·\u0011\u0095Á\u0014\u008c²çæOý\u0019þvx\u009bî\\!\u0006øD\u009a5\u009c8à O\u0085\u0095³/\u001f\u0011\u008b\u0097ë:ÕÊ2ÛqL&\u0015Ûp$D\u0099SÄ 1^G\u001b=\u009fÑ\u0018SxÜÑ§_É¡Nä\u009eo`õ\u0001q\u007fõ\u001a\u0014\u007f´èû¬YbÞÆWæY\u0005\u0089fT@â¢a\b!ß\u0012õ\u0003àsñ\u0015ú«X\u0018º% Q\u009e¦ígdNJ\u0082ËÝ\fG\r\u0015ÆÏß\u0094J´¾c]à\u0095¯kW«¶ê¢\u0082!R+H\u0011\u008eåÖ Vc\u0010'É\nEM\u0019ø;Övó¢M4*\r\u0007°©|¬\u0015×Ü\u009c\u0014j\u007fjMRÕLr\u0018>\"À)©\u0003Â\u0095Ò>dtU,?\u008dx\u0013Ô\u0017ÈHþ\b\fa\u0086¯\u0085\u0014\u009f~~1LÏÐ5ve°Uç\u0087o|Æ&+¸u«©ó=Ëzê\u001bV\f\"´O\u008eîØM¦ü]¶7\u009d%6Ô\u0016JGË\u0017\u008bT2>~¥Q\\\u0015\"\u007f\u0089£AöËU½\u0083b\u0093\u0098pcC\u0097\u0004³¸íM{3íQ\u008a&Ì]j·\u000eÍ!(\u001ac\u0010¾?\u008e\u000f®\u009a\u0089îA\u0003\u0018\u000e»¤\u001cè`\u008aÛü\u0090`%\u009d$>ÁCyÐ¿ï[\u0016é¸F\u000e¶uÑÃ\u008b^\u0086>ZKuÚwù*®\u007f\tnS±\u009d\u009cNÆm\u0097\u0001ts\u0012\u009e±Ñ.OÕ\u009doó|Å\u0012\u0014£\ncm\u0013kï¼\u007f§\u0096\u0016\u0098\u0007Ð\u0006~Äa\u009c,\u0005Cf\rõ\u0089$ºF\u0011\u000f\u0091\u0006µ\u0080\u001cÅÜfå¸ FÞ\u000fÖ\u0014\b\u0087^ÝÂ\u008c\u008e\f\u009cuû\u001b\u0087´g³\nãQ°ê\u001dE¤¡\u0004\u0089"
         .length();
      char var1 = 20;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 63;
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
                     case 0 -> 27;
                     case 1 -> 1;
                     case 2 -> 114;
                     case 3 -> 23;
                     case 4 -> 3;
                     case 5 -> 103;
                     default -> 110;
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
                     lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = new llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = new llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII();
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

                  var2 = "ÜÓRð®÷o|%2\u0011/E\u000e\rQ\u000f\u009bÎyg×lI5\u0011\fi";
                  var4 = "ÜÓRð®÷o|%2\u0011/E\u000e\rQ\u000f\u009bÎyg×lI5\u0011\fi".length();
                  var1 = 14;
                  var8 = -1;
            }

            var10000 = 106;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String e(int var0, int var1) {
      int var2 = (var0 ^ -18931) & 65535;
      if (k[var2] == null) {
         char[] var3 = j[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 237;
            case 1 -> 106;
            case 2 -> 16;
            case 3 -> 191;
            case 4 -> 24;
            case 5 -> 189;
            case 6 -> 117;
            case 7 -> 161;
            case 8 -> 142;
            case 9 -> 15;
            case 10 -> 128;
            case 11 -> 44;
            case 12 -> 123;
            case 13 -> 203;
            case 14 -> 76;
            case 15 -> 95;
            case 16 -> 231;
            case 17 -> 131;
            case 18 -> 194;
            case 19 -> 154;
            case 20 -> 55;
            case 21 -> 29;
            case 22 -> 107;
            case 23 -> 158;
            case 24 -> 125;
            case 25 -> 58;
            case 26 -> 221;
            case 27 -> 223;
            case 28 -> 8;
            case 29 -> 43;
            case 30 -> 184;
            case 31 -> 66;
            case 32 -> 175;
            case 33 -> 151;
            case 34 -> 185;
            case 35 -> 122;
            case 36 -> 188;
            case 37 -> 133;
            case 38 -> 179;
            case 39 -> 255;
            case 40 -> 28;
            case 41 -> 46;
            case 42 -> 63;
            case 43 -> 205;
            case 44 -> 73;
            case 45 -> 204;
            case 46 -> 4;
            case 47 -> 182;
            case 48 -> 77;
            case 49 -> 86;
            case 50 -> 177;
            case 51 -> 217;
            case 52 -> 244;
            case 53 -> 100;
            case 54 -> 88;
            case 55 -> 198;
            case 56 -> 31;
            case 57 -> 115;
            case 58 -> 2;
            case 59 -> 234;
            case 60 -> 92;
            case 61 -> 105;
            case 62 -> 152;
            case 63 -> 120;
            case 64 -> 53;
            case 65 -> 200;
            case 66 -> 101;
            case 67 -> 199;
            case 68 -> 51;
            case 69 -> 36;
            case 70 -> 206;
            case 71 -> 136;
            case 72 -> 47;
            case 73 -> 121;
            case 74 -> 79;
            case 75 -> 220;
            case 76 -> 132;
            case 77 -> 57;
            case 78 -> 134;
            case 79 -> 146;
            case 80 -> 111;
            case 81 -> 81;
            case 82 -> 192;
            case 83 -> 137;
            case 84 -> 197;
            case 85 -> 150;
            case 86 -> 127;
            case 87 -> 14;
            case 88 -> 167;
            case 89 -> 245;
            case 90 -> 72;
            case 91 -> 34;
            case 92 -> 230;
            case 93 -> 45;
            case 94 -> 124;
            case 95 -> 69;
            case 96 -> 143;
            case 97 -> 214;
            case 98 -> 138;
            case 99 -> 96;
            case 100 -> 162;
            case 101 -> 208;
            case 102 -> 62;
            case 103 -> 252;
            case 104 -> 118;
            case 105 -> 22;
            case 106 -> 109;
            case 107 -> 80;
            case 108 -> 171;
            case 109 -> 254;
            case 110 -> 141;
            case 111 -> 0;
            case 112 -> 207;
            case 113 -> 70;
            case 114 -> 163;
            case 115 -> 112;
            case 116 -> 64;
            case 117 -> 213;
            case 118 -> 40;
            case 119 -> 157;
            case 120 -> 89;
            case 121 -> 178;
            case 122 -> 193;
            case 123 -> 10;
            case 124 -> 209;
            case 125 -> 116;
            case 126 -> 49;
            case 127 -> 48;
            case 128 -> 26;
            case 129 -> 30;
            case 130 -> 216;
            case 131 -> 240;
            case 132 -> 176;
            case 133 -> 39;
            case 134 -> 91;
            case 135 -> 85;
            case 136 -> 241;
            case 137 -> 186;
            case 138 -> 21;
            case 139 -> 37;
            case 140 -> 170;
            case 141 -> 129;
            case 142 -> 232;
            case 143 -> 78;
            case 144 -> 7;
            case 145 -> 202;
            case 146 -> 215;
            case 147 -> 159;
            case 148 -> 9;
            case 149 -> 149;
            case 150 -> 183;
            case 151 -> 17;
            case 152 -> 18;
            case 153 -> 82;
            case 154 -> 212;
            case 155 -> 108;
            case 156 -> 93;
            case 157 -> 160;
            case 158 -> 99;
            case 159 -> 229;
            case 160 -> 119;
            case 161 -> 32;
            case 162 -> 113;
            case 163 -> 226;
            case 164 -> 65;
            case 165 -> 168;
            case 166 -> 155;
            case 167 -> 172;
            case 168 -> 97;
            case 169 -> 59;
            case 170 -> 250;
            case 171 -> 102;
            case 172 -> 84;
            case 173 -> 238;
            case 174 -> 38;
            case 175 -> 27;
            case 176 -> 195;
            case 177 -> 135;
            case 178 -> 61;
            case 179 -> 243;
            case 180 -> 236;
            case 181 -> 130;
            case 182 -> 164;
            case 183 -> 187;
            case 184 -> 12;
            case 185 -> 114;
            case 186 -> 25;
            case 187 -> 219;
            case 188 -> 247;
            case 189 -> 253;
            case 190 -> 211;
            case 191 -> 103;
            case 192 -> 42;
            case 193 -> 201;
            case 194 -> 56;
            case 195 -> 68;
            case 196 -> 11;
            case 197 -> 227;
            case 198 -> 90;
            case 199 -> 218;
            case 200 -> 13;
            case 201 -> 139;
            case 202 -> 140;
            case 203 -> 248;
            case 204 -> 196;
            case 205 -> 156;
            case 206 -> 50;
            case 207 -> 180;
            case 208 -> 33;
            case 209 -> 174;
            case 210 -> 249;
            case 211 -> 23;
            case 212 -> 1;
            case 213 -> 6;
            case 214 -> 166;
            case 215 -> 169;
            case 216 -> 71;
            case 217 -> 19;
            case 218 -> 233;
            case 219 -> 165;
            case 220 -> 67;
            case 221 -> 20;
            case 222 -> 3;
            case 223 -> 87;
            case 224 -> 225;
            case 225 -> 224;
            case 226 -> 210;
            case 227 -> 94;
            case 228 -> 104;
            case 229 -> 110;
            case 230 -> 246;
            case 231 -> 251;
            case 232 -> 190;
            case 233 -> 173;
            case 234 -> 242;
            case 235 -> 126;
            case 236 -> 60;
            case 237 -> 52;
            case 238 -> 5;
            case 239 -> 147;
            case 240 -> 75;
            case 241 -> 153;
            case 242 -> 144;
            case 243 -> 181;
            case 244 -> 235;
            case 245 -> 83;
            case 246 -> 98;
            case 247 -> 145;
            case 248 -> 41;
            case 249 -> 54;
            case 250 -> 228;
            case 251 -> 239;
            case 252 -> 148;
            case 253 -> 74;
            case 254 -> 222;
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
         short var10001 = -8669;
         short var10002 = -29447;
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
      public final llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
         int var1, boolean var2, @NotNull Triple<Integer, Integer, Integer> var3
      ) {
         short var10001 = -8672;
         short var10002 = -15975;
         Intrinsics.checkNotNullParameter(var3, "playerPos");
         return new llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -8670;
         Triple var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         boolean var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 1597;
         short var10002 = -8671;
         short var10003 = 593;
         short var10004 = -8666;
         short var10005 = 19112;
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
               var10000 instanceof llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         label48: {
            llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = (llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var10000;
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
         String var2 = "Ú\u0099A}\u001dÜ\u0096\u0084®\u0017\u0083&\u0013\u007f<\u008bÐ\u000f\u0001Ì\toù\u0085\u001f\u0013\u001euº \tl\u008fåÑ\u001fÇô\u0081\u0090";
         int var4 = "Ú\u0099A}\u001dÜ\u0096\u0084®\u0017\u0083&\u0013\u007f<\u008bÐ\u000f\u0001Ì\toù\u0085\u001f\u0013\u001euº \tl\u008fåÑ\u001fÇô\u0081\u0090"
            .length();
         char var1 = 20;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 98;
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
                        case 0 -> 34;
                        case 1 -> 5;
                        case 2 -> 29;
                        case 3 -> 54;
                        case 4 -> 6;
                        case 5 -> 49;
                        default -> 96;
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

                     var2 = "è\u0012\u0082\u0089\u0018ø?wyúAÏ\u0017m\u0086½e\fÿ2g\u0080NgYÔ£\u0088Ó\u0013";
                     var4 = "è\u0012\u0082\u0089\u0018ø?wyúAÏ\u0017m\u0086½e\fÿ2g\u0080NgYÔ£\u0088Ó\u0013".length();
                     var1 = 17;
                     var8 = -1;
               }

               var10000 = 82;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -8670) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 251;
               case 1 -> 254;
               case 2 -> 213;
               case 3 -> 67;
               case 4 -> 175;
               case 5 -> 73;
               case 6 -> 34;
               case 7 -> 33;
               case 8 -> 218;
               case 9 -> 169;
               case 10 -> 127;
               case 11 -> 11;
               case 12 -> 27;
               case 13 -> 168;
               case 14 -> 1;
               case 15 -> 159;
               case 16 -> 180;
               case 17 -> 35;
               case 18 -> 146;
               case 19 -> 105;
               case 20 -> 144;
               case 21 -> 32;
               case 22 -> 253;
               case 23 -> 200;
               case 24 -> 153;
               case 25 -> 83;
               case 26 -> 128;
               case 27 -> 186;
               case 28 -> 179;
               case 29 -> 89;
               case 30 -> 237;
               case 31 -> 246;
               case 32 -> 210;
               case 33 -> 94;
               case 34 -> 74;
               case 35 -> 41;
               case 36 -> 245;
               case 37 -> 129;
               case 38 -> 238;
               case 39 -> 243;
               case 40 -> 124;
               case 41 -> 37;
               case 42 -> 172;
               case 43 -> 215;
               case 44 -> 61;
               case 45 -> 209;
               case 46 -> 212;
               case 47 -> 154;
               case 48 -> 114;
               case 49 -> 2;
               case 50 -> 131;
               case 51 -> 26;
               case 52 -> 50;
               case 53 -> 224;
               case 54 -> 119;
               case 55 -> 8;
               case 56 -> 20;
               case 57 -> 76;
               case 58 -> 30;
               case 59 -> 116;
               case 60 -> 171;
               case 61 -> 42;
               case 62 -> 107;
               case 63 -> 110;
               case 64 -> 165;
               case 65 -> 15;
               case 66 -> 240;
               case 67 -> 164;
               case 68 -> 51;
               case 69 -> 230;
               case 70 -> 214;
               case 71 -> 223;
               case 72 -> 136;
               case 73 -> 204;
               case 74 -> 228;
               case 75 -> 248;
               case 76 -> 77;
               case 77 -> 163;
               case 78 -> 84;
               case 79 -> 219;
               case 80 -> 208;
               case 81 -> 38;
               case 82 -> 48;
               case 83 -> 28;
               case 84 -> 109;
               case 85 -> 143;
               case 86 -> 250;
               case 87 -> 161;
               case 88 -> 59;
               case 89 -> 14;
               case 90 -> 197;
               case 91 -> 88;
               case 92 -> 184;
               case 93 -> 177;
               case 94 -> 103;
               case 95 -> 63;
               case 96 -> 36;
               case 97 -> 104;
               case 98 -> 97;
               case 99 -> 222;
               case 100 -> 101;
               case 101 -> 55;
               case 102 -> 9;
               case 103 -> 6;
               case 104 -> 21;
               case 105 -> 216;
               case 106 -> 62;
               case 107 -> 181;
               case 108 -> 247;
               case 109 -> 203;
               case 110 -> 142;
               case 111 -> 225;
               case 112 -> 54;
               case 113 -> 211;
               case 114 -> 231;
               case 115 -> 7;
               case 116 -> 149;
               case 117 -> 167;
               case 118 -> 57;
               case 119 -> 239;
               case 120 -> 47;
               case 121 -> 199;
               case 122 -> 126;
               case 123 -> 139;
               case 124 -> 123;
               case 125 -> 44;
               case 126 -> 192;
               case 127 -> 151;
               case 128 -> 189;
               case 129 -> 58;
               case 130 -> 160;
               case 131 -> 23;
               case 132 -> 65;
               case 133 -> 40;
               case 134 -> 191;
               case 135 -> 0;
               case 136 -> 138;
               case 137 -> 100;
               case 138 -> 173;
               case 139 -> 10;
               case 140 -> 221;
               case 141 -> 60;
               case 142 -> 31;
               case 143 -> 5;
               case 144 -> 99;
               case 145 -> 205;
               case 146 -> 148;
               case 147 -> 132;
               case 148 -> 72;
               case 149 -> 56;
               case 150 -> 82;
               case 151 -> 176;
               case 152 -> 157;
               case 153 -> 242;
               case 154 -> 117;
               case 155 -> 78;
               case 156 -> 133;
               case 157 -> 227;
               case 158 -> 183;
               case 159 -> 201;
               case 160 -> 234;
               case 161 -> 130;
               case 162 -> 91;
               case 163 -> 29;
               case 164 -> 3;
               case 165 -> 193;
               case 166 -> 185;
               case 167 -> 202;
               case 168 -> 90;
               case 169 -> 252;
               case 170 -> 39;
               case 171 -> 152;
               case 172 -> 75;
               case 173 -> 24;
               case 174 -> 194;
               case 175 -> 166;
               case 176 -> 16;
               case 177 -> 249;
               case 178 -> 155;
               case 179 -> 112;
               case 180 -> 174;
               case 181 -> 255;
               case 182 -> 102;
               case 183 -> 98;
               case 184 -> 120;
               case 185 -> 121;
               case 186 -> 198;
               case 187 -> 52;
               case 188 -> 196;
               case 189 -> 233;
               case 190 -> 80;
               case 191 -> 232;
               case 192 -> 71;
               case 193 -> 18;
               case 194 -> 158;
               case 195 -> 145;
               case 196 -> 229;
               case 197 -> 25;
               case 198 -> 190;
               case 199 -> 187;
               case 200 -> 235;
               case 201 -> 49;
               case 202 -> 70;
               case 203 -> 134;
               case 204 -> 226;
               case 205 -> 17;
               case 206 -> 162;
               case 207 -> 182;
               case 208 -> 12;
               case 209 -> 87;
               case 210 -> 150;
               case 211 -> 4;
               case 212 -> 195;
               case 213 -> 96;
               case 214 -> 66;
               case 215 -> 79;
               case 216 -> 141;
               case 217 -> 220;
               case 218 -> 46;
               case 219 -> 125;
               case 220 -> 135;
               case 221 -> 122;
               case 222 -> 113;
               case 223 -> 244;
               case 224 -> 115;
               case 225 -> 45;
               case 226 -> 93;
               case 227 -> 178;
               case 228 -> 95;
               case 229 -> 22;
               case 230 -> 68;
               case 231 -> 140;
               case 232 -> 13;
               case 233 -> 241;
               case 234 -> 69;
               case 235 -> 108;
               case 236 -> 207;
               case 237 -> 137;
               case 238 -> 81;
               case 239 -> 170;
               case 240 -> 188;
               case 241 -> 43;
               case 242 -> 106;
               case 243 -> 85;
               case 244 -> 19;
               case 245 -> 92;
               case 246 -> 236;
               case 247 -> 217;
               case 248 -> 147;
               case 249 -> 111;
               case 250 -> 53;
               case 251 -> 206;
               case 252 -> 156;
               case 253 -> 86;
               case 254 -> 64;
               default -> 118;
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
         public static me.octo.client.llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(me.octo.client.llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll p0, int p1, boolean p2, kotlin.Triple p3, int mask, java.lang.Object marker) {
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
      public final llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII a() {
         return llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
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
         short var10001 = 16801;
         short var10002 = -27549;
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
      public final llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         int var1,
         @NotNull lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2
      ) {
         short var10001 = 16803;
         short var10002 = -30325;
         Intrinsics.checkNotNullParameter(var2, "bot");
         return new llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10002 = 16802;
         short var10003 = 20564;
         var10003 = 16800;
         short var10004 = -1831;
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
               var10000 instanceof llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
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
         String var2 = "£ÁñWY¥\u0097ÜË\u0003\u0006H\u009a\u0012\u00868Wâ\u0004Ûý\u0003m\u00144";
         int var4 = "£ÁñWY¥\u0097ÜË\u0003\u0006H\u009a\u0012\u00868Wâ\u0004Ûý\u0003m\u00144".length();
         char var1 = 21;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 85;
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
                        case 0 -> 59;
                        case 1 -> 113;
                        case 2 -> 91;
                        case 3 -> 94;
                        case 4 -> 82;
                        case 5 -> 33;
                        default -> 20;
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

                     var2 = "2UÌì\u0087µ\u0003\u0018\u0088\u0018";
                     var4 = "2UÌì\u0087µ\u0003\u0018\u0088\u0018".length();
                     var1 = 6;
                     var8 = -1;
               }

               var10000 = 58;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 16802) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 114;
               case 1 -> 107;
               case 2 -> 40;
               case 3 -> 42;
               case 4 -> 129;
               case 5 -> 74;
               case 6 -> 216;
               case 7 -> 66;
               case 8 -> 167;
               case 9 -> 109;
               case 10 -> 91;
               case 11 -> 208;
               case 12 -> 73;
               case 13 -> 106;
               case 14 -> 165;
               case 15 -> 116;
               case 16 -> 98;
               case 17 -> 144;
               case 18 -> 233;
               case 19 -> 52;
               case 20 -> 18;
               case 21 -> 62;
               case 22 -> 229;
               case 23 -> 178;
               case 24 -> 169;
               case 25 -> 232;
               case 26 -> 160;
               case 27 -> 134;
               case 28 -> 145;
               case 29 -> 53;
               case 30 -> 180;
               case 31 -> 46;
               case 32 -> 223;
               case 33 -> 234;
               case 34 -> 104;
               case 35 -> 141;
               case 36 -> 221;
               case 37 -> 57;
               case 38 -> 0;
               case 39 -> 111;
               case 40 -> 227;
               case 41 -> 147;
               case 42 -> 151;
               case 43 -> 29;
               case 44 -> 30;
               case 45 -> 228;
               case 46 -> 219;
               case 47 -> 37;
               case 48 -> 127;
               case 49 -> 102;
               case 50 -> 122;
               case 51 -> 186;
               case 52 -> 254;
               case 53 -> 128;
               case 54 -> 17;
               case 55 -> 10;
               case 56 -> 75;
               case 57 -> 236;
               case 58 -> 192;
               case 59 -> 182;
               case 60 -> 7;
               case 61 -> 115;
               case 62 -> 205;
               case 63 -> 244;
               case 64 -> 117;
               case 65 -> 237;
               case 66 -> 47;
               case 67 -> 3;
               case 68 -> 214;
               case 69 -> 38;
               case 70 -> 177;
               case 71 -> 174;
               case 72 -> 14;
               case 73 -> 97;
               case 74 -> 212;
               case 75 -> 143;
               case 76 -> 159;
               case 77 -> 26;
               case 78 -> 1;
               case 79 -> 135;
               case 80 -> 246;
               case 81 -> 199;
               case 82 -> 150;
               case 83 -> 132;
               case 84 -> 19;
               case 85 -> 20;
               case 86 -> 88;
               case 87 -> 77;
               case 88 -> 126;
               case 89 -> 89;
               case 90 -> 215;
               case 91 -> 99;
               case 92 -> 50;
               case 93 -> 210;
               case 94 -> 45;
               case 95 -> 87;
               case 96 -> 23;
               case 97 -> 189;
               case 98 -> 156;
               case 99 -> 33;
               case 100 -> 72;
               case 101 -> 94;
               case 102 -> 152;
               case 103 -> 195;
               case 104 -> 201;
               case 105 -> 253;
               case 106 -> 217;
               case 107 -> 142;
               case 108 -> 162;
               case 109 -> 105;
               case 110 -> 230;
               case 111 -> 202;
               case 112 -> 119;
               case 113 -> 181;
               case 114 -> 63;
               case 115 -> 220;
               case 116 -> 231;
               case 117 -> 71;
               case 118 -> 213;
               case 119 -> 170;
               case 120 -> 82;
               case 121 -> 54;
               case 122 -> 110;
               case 123 -> 249;
               case 124 -> 124;
               case 125 -> 79;
               case 126 -> 242;
               case 127 -> 70;
               case 128 -> 185;
               case 129 -> 146;
               case 130 -> 194;
               case 131 -> 101;
               case 132 -> 90;
               case 133 -> 163;
               case 134 -> 240;
               case 135 -> 121;
               case 136 -> 11;
               case 137 -> 148;
               case 138 -> 243;
               case 139 -> 51;
               case 140 -> 136;
               case 141 -> 239;
               case 142 -> 168;
               case 143 -> 21;
               case 144 -> 86;
               case 145 -> 22;
               case 146 -> 138;
               case 147 -> 12;
               case 148 -> 113;
               case 149 -> 36;
               case 150 -> 179;
               case 151 -> 155;
               case 152 -> 27;
               case 153 -> 96;
               case 154 -> 238;
               case 155 -> 157;
               case 156 -> 41;
               case 157 -> 44;
               case 158 -> 43;
               case 159 -> 55;
               case 160 -> 2;
               case 161 -> 224;
               case 162 -> 139;
               case 163 -> 175;
               case 164 -> 78;
               case 165 -> 9;
               case 166 -> 67;
               case 167 -> 222;
               case 168 -> 15;
               case 169 -> 85;
               case 170 -> 24;
               case 171 -> 118;
               case 172 -> 204;
               case 173 -> 83;
               case 174 -> 153;
               case 175 -> 187;
               case 176 -> 92;
               case 177 -> 13;
               case 178 -> 211;
               case 179 -> 154;
               case 180 -> 183;
               case 181 -> 197;
               case 182 -> 58;
               case 183 -> 16;
               case 184 -> 203;
               case 185 -> 137;
               case 186 -> 5;
               case 187 -> 241;
               case 188 -> 112;
               case 189 -> 59;
               case 190 -> 64;
               case 191 -> 209;
               case 192 -> 8;
               case 193 -> 125;
               case 194 -> 207;
               case 195 -> 130;
               case 196 -> 100;
               case 197 -> 131;
               case 198 -> 103;
               case 199 -> 196;
               case 200 -> 251;
               case 201 -> 225;
               case 202 -> 164;
               case 203 -> 81;
               case 204 -> 149;
               case 205 -> 198;
               case 206 -> 65;
               case 207 -> 28;
               case 208 -> 4;
               case 209 -> 80;
               case 210 -> 68;
               case 211 -> 161;
               case 212 -> 250;
               case 213 -> 31;
               case 214 -> 200;
               case 215 -> 206;
               case 216 -> 133;
               case 217 -> 140;
               case 218 -> 184;
               case 219 -> 248;
               case 220 -> 218;
               case 221 -> 252;
               case 222 -> 226;
               case 223 -> 172;
               case 224 -> 61;
               case 225 -> 35;
               case 226 -> 25;
               case 227 -> 56;
               case 228 -> 255;
               case 229 -> 32;
               case 230 -> 158;
               case 231 -> 190;
               case 232 -> 60;
               case 233 -> 108;
               case 234 -> 69;
               case 235 -> 235;
               case 236 -> 193;
               case 237 -> 247;
               case 238 -> 6;
               case 239 -> 171;
               case 240 -> 191;
               case 241 -> 166;
               case 242 -> 76;
               case 243 -> 95;
               case 244 -> 123;
               case 245 -> 39;
               case 246 -> 49;
               case 247 -> 245;
               case 248 -> 176;
               case 249 -> 173;
               case 250 -> 93;
               case 251 -> 48;
               case 252 -> 188;
               case 253 -> 120;
               case 254 -> 84;
               default -> 34;
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
         public static me.octo.client.llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(me.octo.client.llIlllIllIIIIIIlIIlIlIlllIIIIlIlIllllllIllIlllllIIllIlIIlIIIllllIlIIlllllIIlIlIIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll p0, int p1, me.octo.client.lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll p2, int mask, java.lang.Object marker) {
         if ((mask & 1) != 0) { p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
         if ((mask & 2) != 0) { p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
         return p0.a(p1, p2);
      }
}
}
