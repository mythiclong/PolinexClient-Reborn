package me.octo.client;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.utils.player.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.player.RemotePlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.feline.Ocelot;
import net.minecraft.world.entity.animal.frog.Tadpole;
import net.minecraft.world.entity.animal.golem.IronGolem;
import net.minecraft.world.entity.animal.sniffer.Sniffer;
import net.minecraft.world.entity.animal.squid.Squid;
import net.minecraft.world.entity.animal.wolf.Wolf;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.Endermite;
import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.world.entity.monster.Guardian;
import net.minecraft.world.entity.monster.MagmaCube;
import net.minecraft.world.entity.monster.Silverfish;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.entity.monster.Witch;
import net.minecraft.world.entity.monster.skeleton.Bogged;
import net.minecraft.world.entity.monster.skeleton.Skeleton;
import net.minecraft.world.entity.monster.skeleton.WitherSkeleton;
import net.minecraft.world.entity.monster.spider.Spider;
import net.minecraft.world.entity.monster.zombie.Zombie;
import net.minecraft.world.entity.monster.zombie.ZombifiedPiglin;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IlIlIllllllIlllIlIIlIlIllIlllIlllIlIIllIllIIlIllIIlIIIlIlIlIlIIIlIlIlllIIlIIIIllIIIlI
   extends lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI {
   @NotNull
   public static IlIlIllllllIlllIlIIlIlIllIlllIlllIlIIllIllIIlIllIIlIIIlIlIlIlIIIlIlIlllIIlIIIIllIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
   @NotNull
   private Vec3 IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
   @NotNull
   private static List<Class<? extends Entity>> IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
   private static boolean IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI;
   private static String[] c;
   private static String[] d;

   public static void a(IlIlIllllllIlllIlIIlIlIllIlllIlllIlIIllIllIIlIllIIlIIIlIlIlIlIIIlIlIlllIIlIIIIllIIIlI var0, net.minecraft.world.phys.Vec3 var1, String var2, java.util.List<String> var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = null;
      }
      if ((var4 & 4) != 0) {
         var3 = kotlin.collections.CollectionsKt.emptyList();
      }
      var0.a(var1, var2, var3);
   }

   public static final java.util.List<Class<? extends Entity>> s() {
      return IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
   }

   public IlIlIllllllIlllIlIIlIlIllIlllIlllIlIIllIllIIlIllIIlIIIlIlIlIlIIIlIlIlllIIlIIIIllIIIlI() {
      super(
         IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a()
      );
      Vec3 var10001 = Vec3.ZERO;
      short var10003 = 1352;
      short var10004 = 16130;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      this.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl = var10001;
   }

   public final void a(@NotNull Vec3 var1, @Nullable String var2, @NotNull List<String> var3) {
      boolean var10000 = u();
      short var10002 = 1354;
      short var10003 = 24373;
      Intrinsics.checkNotNullParameter(var1, "fishingSpot");
      var10002 = 1357;
      var10003 = -23115;
      Intrinsics.checkNotNullParameter(var3, "ignoreCompletely");
      this.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl = var1;
      double var5 = 15.0;
      boolean var4 = var10000;
      AABB var7 = new AABB(var1.x - var5, var1.y - 10.0, var1.z - var5, var1.x + var5, var1.y + 10.0, var1.z + var5);
      List var8 = var4 && var2 != null ? CollectionsKt.listOf(var2) : CollectionsKt.emptyList();
      this.a(
         new IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII(
            CollectionsKt.listOf(var7),
            CollectionsKt.emptyList(),
            new me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid(
               (int)(var1.x - var5), (int)(var1.x + var5), (int)(var1.z - var5), (int)(var1.z + var5)
            ),
            IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI,
            IllllllllIlIlIlllllIIlIlIlIllIIIIlIIIIIIIIIIllllIIlllIIIIIlIlllIlIlllIIIIIllIlllIIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(),
            CollectionsKt.emptyList(),
            var3,
            var8,
            false,
            true,
            256,
            null
         )
      );
      if (!var4) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[2]
         );
      }
   }

   @Override
   public double a(
      @NotNull lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1,
      @NotNull LocalPlayer var2
   ) {
      boolean var10000 = t();
      short var10002 = 1353;
      short var10003 = -19888;
      Intrinsics.checkNotNullParameter(var1, "mob");
      boolean var3 = var10000;
      short var10001 = 1355;
      var10002 = -1248;
      Intrinsics.checkNotNullParameter(var2, "player");
      LivingEntity var4 = var1.a();
      double var5 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(
            llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(var4),
            llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(var2)
         );
      double var7 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .d(llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(var4))
         * 0.3;
      if (!var3) {
         var5 += var7;
         var7 = !var2.hasLineOfSight(var4) ? 8.0 : 0.0;
      }

      double var6 = var5
         + var7
         + me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(
                  llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(var4),
                  this.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl
               )
            * 0.5;
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         g(!var3);
      }

      return var6;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[5];
      int var3 = 0;
      String var2 = "GGË\u0004ÔôX[\u0006\u0088\u008d\u008fN\u00046";
      int var4 = "GGË\u0004ÔôX[\u0006\u0088\u008d\u008fN\u00046".length();
      g(false);
      char var1 = 3;
      int var9 = -1;

      label52:
      while (true) {
         byte var10000 = 123;
         String var10001 = var2.substring(++var9, var9 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var25 = var10001.toCharArray();
               int var10004 = var25.length;
               int var6 = 0;
               byte var28 = var10000;
               var21 = var25;
               int var15 = var10004;
               byte var33;
               char[] var37;
               int var10006;
               if (var10004 <= 1) {
                  var37 = var25;
                  var33 = var10000;
                  var10006 = var6;
               } else {
                  var28 = var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var37 = var25;
                  var33 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var37[var10006] = (char)(var37[var10006] ^ var33 ^ switch (var6 % 7) {
                     case 0 -> 94;
                     case 1 -> 34;
                     case 2 -> 94;
                     case 3 -> 55;
                     case 4 -> 2;
                     case 5 -> 41;
                     default -> 24;
                  });
                  var6++;
                  if (var28 == 0) {
                     var10006 = var28;
                     var37 = var21;
                     var33 = var28;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var37 = var21;
                     var33 = var28;
                     var10006 = var6;
                  }
               }
            }

            String var30 = new String(var21).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var30;
                  if ((var9 += var1) >= var4) {
                     c = var5;
                     d = new String[5];
                     lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI = new IlIlIllllllIlllIlIIlIlIllIlllIlllIlIIllIllIIlIllIIlIIIlIlIlIlIIIlIlIlllIIlIIIIllIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
                     Class[] var7 = new Class[]{
                        RemotePlayer.class,
                        Zombie.class,
                        Skeleton.class,
                        Spider.class,
                        EnderMan.class,
                        Endermite.class,
                        Blaze.class,
                        Ghast.class,
                        MagmaCube.class,
                        Silverfish.class,
                        Slime.class,
                        Witch.class,
                        Guardian.class,
                        WitherSkeleton.class,
                        ZombifiedPiglin.class,
                        IronGolem.class,
                        Wolf.class,
                        Squid.class,
                        Creeper.class,
                        Ocelot.class,
                        Sniffer.class,
                        Tadpole.class,
                        Guardian.class,
                        Bogged.class
                     };
                     IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI = CollectionsKt.listOf(var7);
                     break pxClinit;
                  }

                  var1 = var2.charAt(var9);
                  break;
               default:
                  var5[var3++] = var30;
                  if ((var9 += var1) < var4) {
                     var1 = var2.charAt(var9);
                     continue label52;
                  }

                  var2 = "\u008e×éÑô\u008a\u0091®\u009cb\u009e\u0010á£÷\u0097\u0092®\u0001|3\u009cÍ5\u0097&k!";
                  var4 = "\u008e×éÑô\u008a\u0091®\u009cb\u009e\u0010á£÷\u0097\u0092®\u0001|3\u009cÍ5\u0097&k!".length();
                  var1 = 11;
                  var9 = -1;
            }

            var10000 = 50;
            var10001 = var2.substring(++var9, var9 + var1);
            var10002 = 0;
         }
      }
   }
}

   public static void g(boolean var0) {
      IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI = var0;
   }

   public static boolean t() {
      return IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI;
   }

   public static boolean u() {
      boolean var0 = t();
      return !var0;
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 1353) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 41;
            case 1 -> 169;
            case 2 -> 161;
            case 3 -> 11;
            case 4 -> 151;
            case 5 -> 56;
            case 6 -> 74;
            case 7 -> 107;
            case 8 -> 152;
            case 9 -> 4;
            case 10 -> 210;
            case 11 -> 138;
            case 12 -> 211;
            case 13 -> 38;
            case 14 -> 54;
            case 15 -> 61;
            case 16 -> 170;
            case 17 -> 145;
            case 18 -> 233;
            case 19 -> 128;
            case 20 -> 58;
            case 21 -> 12;
            case 22 -> 180;
            case 23 -> 238;
            case 24 -> 214;
            case 25 -> 190;
            case 26 -> 22;
            case 27 -> 198;
            case 28 -> 146;
            case 29 -> 31;
            case 30 -> 102;
            case 31 -> 230;
            case 32 -> 2;
            case 33 -> 125;
            case 34 -> 134;
            case 35 -> 75;
            case 36 -> 197;
            case 37 -> 94;
            case 38 -> 122;
            case 39 -> 243;
            case 40 -> 187;
            case 41 -> 153;
            case 42 -> 115;
            case 43 -> 108;
            case 44 -> 199;
            case 45 -> 36;
            case 46 -> 82;
            case 47 -> 162;
            case 48 -> 113;
            case 49 -> 133;
            case 50 -> 123;
            case 51 -> 71;
            case 52 -> 196;
            case 53 -> 234;
            case 54 -> 15;
            case 55 -> 144;
            case 56 -> 166;
            case 57 -> 227;
            case 58 -> 70;
            case 59 -> 40;
            case 60 -> 247;
            case 61 -> 73;
            case 62 -> 9;
            case 63 -> 185;
            case 64 -> 235;
            case 65 -> 98;
            case 66 -> 246;
            case 67 -> 215;
            case 68 -> 175;
            case 69 -> 229;
            case 70 -> 186;
            case 71 -> 97;
            case 72 -> 140;
            case 73 -> 117;
            case 74 -> 104;
            case 75 -> 226;
            case 76 -> 55;
            case 77 -> 6;
            case 78 -> 239;
            case 79 -> 69;
            case 80 -> 64;
            case 81 -> 39;
            case 82 -> 7;
            case 83 -> 126;
            case 84 -> 52;
            case 85 -> 27;
            case 86 -> 191;
            case 87 -> 255;
            case 88 -> 79;
            case 89 -> 83;
            case 90 -> 34;
            case 91 -> 157;
            case 92 -> 193;
            case 93 -> 42;
            case 94 -> 103;
            case 95 -> 182;
            case 96 -> 46;
            case 97 -> 155;
            case 98 -> 65;
            case 99 -> 158;
            case 100 -> 120;
            case 101 -> 232;
            case 102 -> 43;
            case 103 -> 143;
            case 104 -> 99;
            case 105 -> 213;
            case 106 -> 178;
            case 107 -> 176;
            case 108 -> 26;
            case 109 -> 244;
            case 110 -> 165;
            case 111 -> 124;
            case 112 -> 28;
            case 113 -> 228;
            case 114 -> 142;
            case 115 -> 248;
            case 116 -> 80;
            case 117 -> 21;
            case 118 -> 160;
            case 119 -> 242;
            case 120 -> 225;
            case 121 -> 188;
            case 122 -> 250;
            case 123 -> 254;
            case 124 -> 96;
            case 125 -> 240;
            case 126 -> 91;
            case 127 -> 212;
            case 128 -> 110;
            case 129 -> 30;
            case 130 -> 164;
            case 131 -> 0;
            case 132 -> 59;
            case 133 -> 84;
            case 134 -> 18;
            case 135 -> 149;
            case 136 -> 116;
            case 137 -> 48;
            case 138 -> 8;
            case 139 -> 45;
            case 140 -> 14;
            case 141 -> 209;
            case 142 -> 77;
            case 143 -> 139;
            case 144 -> 204;
            case 145 -> 47;
            case 146 -> 68;
            case 147 -> 171;
            case 148 -> 156;
            case 149 -> 112;
            case 150 -> 29;
            case 151 -> 100;
            case 152 -> 114;
            case 153 -> 35;
            case 154 -> 37;
            case 155 -> 17;
            case 156 -> 13;
            case 157 -> 216;
            case 158 -> 172;
            case 159 -> 181;
            case 160 -> 249;
            case 161 -> 202;
            case 162 -> 223;
            case 163 -> 76;
            case 164 -> 203;
            case 165 -> 220;
            case 166 -> 88;
            case 167 -> 53;
            case 168 -> 101;
            case 169 -> 219;
            case 170 -> 33;
            case 171 -> 23;
            case 172 -> 183;
            case 173 -> 67;
            case 174 -> 147;
            case 175 -> 159;
            case 176 -> 119;
            case 177 -> 16;
            case 178 -> 20;
            case 179 -> 154;
            case 180 -> 141;
            case 181 -> 132;
            case 182 -> 192;
            case 183 -> 127;
            case 184 -> 184;
            case 185 -> 217;
            case 186 -> 121;
            case 187 -> 57;
            case 188 -> 168;
            case 189 -> 3;
            case 190 -> 92;
            case 191 -> 252;
            case 192 -> 195;
            case 193 -> 5;
            case 194 -> 19;
            case 195 -> 237;
            case 196 -> 253;
            case 197 -> 95;
            case 198 -> 241;
            case 199 -> 231;
            case 200 -> 130;
            case 201 -> 222;
            case 202 -> 174;
            case 203 -> 208;
            case 204 -> 194;
            case 205 -> 129;
            case 206 -> 207;
            case 207 -> 131;
            case 208 -> 81;
            case 209 -> 189;
            case 210 -> 201;
            case 211 -> 109;
            case 212 -> 236;
            case 213 -> 224;
            case 214 -> 167;
            case 215 -> 50;
            case 216 -> 251;
            case 217 -> 148;
            case 218 -> 93;
            case 219 -> 137;
            case 220 -> 25;
            case 221 -> 135;
            case 222 -> 173;
            case 223 -> 179;
            case 224 -> 90;
            case 225 -> 136;
            case 226 -> 177;
            case 227 -> 118;
            case 228 -> 60;
            case 229 -> 24;
            case 230 -> 163;
            case 231 -> 85;
            case 232 -> 205;
            case 233 -> 150;
            case 234 -> 66;
            case 235 -> 218;
            case 236 -> 221;
            case 237 -> 206;
            case 238 -> 44;
            case 239 -> 245;
            case 240 -> 63;
            case 241 -> 87;
            case 242 -> 86;
            case 243 -> 1;
            case 244 -> 49;
            case 245 -> 51;
            case 246 -> 72;
            case 247 -> 89;
            case 248 -> 32;
            case 249 -> 78;
            case 250 -> 111;
            case 251 -> 62;
            case 252 -> 105;
            case 253 -> 10;
            case 254 -> 200;
            default -> 106;
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final List<Class<? extends Entity>> a() {
         return IlIlIllllllIlllIlIIlIlIllIlllIlllIlIIllIllIIlIllIIlIIIlIlIlIlIIIlIlIlllIIlIIIIllIIIlI.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
      }
       public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker var1) { this(); }
   }
}
