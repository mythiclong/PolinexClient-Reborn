package me.octo.client;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.random.Random;
import me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll;
import me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;
import me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import me.octo.client.utils.player.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl
   extends IlIlIIIllIIlIIlllIlIlIlIIlIIIlIllIllIIIllIIlIlIIllIIlIIlIlllIIIlllIlIIlIIIIlIllIlIlII {
   @NotNull
   public static lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private boolean lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private final ArrayList<String> lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private List<String> lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private List<String> lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private int IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private final Vec3 llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @NotNull
   private final BlockPos IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @NotNull
   private final Vec3 IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @NotNull
   private final BlockPos IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private boolean IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private int llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   @NotNull
   private static lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   @NotNull
   private static lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   private static String[] c;
   private static String[] d;

   public lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl() {
      short var10001 = 10668;
      short var10002 = 5107;
      super("Auto Sell");
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      String[] var2 = new String[1];
      short var10003 = 10687;
      short var10004 = -13838;
      var2[0] = "Builder";
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = CollectionsKt.arrayListOf(var2);
      var2 = new String[14];
      var10003 = 10650;
      var10004 = 9311;
      var2[0] = "Mithril";
      var10003 = 10667;
      var10004 = -15577;
      var2[1] = "Titanium";
      var10003 = 10655;
      var10004 = 25912;
      var2[2] = "Goblin";
      var10003 = 10632;
      var10004 = 32331;
      var2[3] = "Ice";
      var10003 = 10661;
      var10004 = 26395;
      var2[4] = "Glacite";
      var10003 = 10666;
      var10004 = 5781;
      var2[5] = "Cobblestone";
      var10003 = 10674;
      var10004 = 23292;
      var2[6] = "Rune ";
      var10003 = 10626;
      var10004 = -29120;
      var2[7] = "Endstone";
      var10003 = 10660;
      var10004 = 2510;
      var2[8] = "Hard Stone";
      var10003 = 10684;
      var10004 = -20975;
      var2[9] = "Obsidian";
      var10003 = 10669;
      var10004 = 1856;
      var2[10] = "End Stone";
      var10003 = 10627;
      var10004 = 20879;
      var2[11] = "Flawed";
      var10003 = 10664;
      var10004 = 10795;
      var2[12] = "Rough";
      var10003 = 10686;
      var10004 = 26352;
      var2[13] = "Stone";
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = CollectionsKt.listOf(var2);
      var2 = new String[15];
      var10003 = 10685;
      var10004 = 5598;
      var2[0] = "Drill";
      var10003 = 10681;
      var10004 = 22603;
      var2[1] = "Pickaxe";
      var10003 = 10630;
      var10004 = 31251;
      var2[2] = "Tasty";
      var10003 = 10658;
      var10004 = -15349;
      var2[3] = "Jewel";
      var10003 = 10657;
      var10004 = 31231;
      var2[4] = "Omelette";
      var10003 = 10638;
      var10004 = 13761;
      var2[5] = "Sludge";
      var10003 = 10649;
      var10004 = -26780;
      var2[6] = "Minecart";
      var10003 = 10636;
      var10004 = 28056;
      var2[7] = "Sword";
      var10003 = 10683;
      var10004 = -2260;
      var2[8] = "Ice Spray";
      var10003 = 10633;
      var10004 = -27342;
      var2[9] = "Barrel";
      var10003 = 10631;
      var10004 = -11685;
      var2[10] = "Slice";
      var10003 = 10679;
      var10004 = 27352;
      var2[11] = "Gauntlet";
      var10003 = 10680;
      var10004 = -30940;
      var2[12] = "Sack";
      var10003 = 10656;
      var10004 = 15977;
      var2[13] = "Bob-ombs";
      var10003 = 10670;
      var10004 = -32373;
      var2[14] = "Necklace";
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = CollectionsKt.listOf(var2);
      String var10000 = IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.B();
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 400 + Random.Default.nextInt(200);
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new Vec3(-8.5, 70.0, -61.5);
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new BlockPos(-10, 70, -60);
      String var1 = var10000;

      try {
         this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new Vec3(-33.5, 72.0, -22.5);
         this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = new BlockPos(-34, 72, -25);
         if (var1 == null) {
            lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
               new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[5]
            );
         }
      } catch (NoWhenBranchMatchedException var3) {
         throw (RuntimeException)a(var3);
      }
   }

   public void g() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.B ()Ljava/lang/String;
      // 003: astore 1
      // 004: aload 0
      // 005: invokevirtual me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.c ()Lme/octo/client/IlIlIIIllIIlIIlllIlIlIlIIlIIIlIllIllIIIllIIlIlIIllIIlIIlIlllIIIlllIlIIlIIIIlIllIlIlII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 008: getstatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII [I
      // 00b: swap
      // 00c: invokevirtual me/octo/client/IlIlIIIllIIlIIlllIlIlIlIIlIIIlIllIllIIIllIIlIlIIllIIlIIlIlllIIIlllIlIIlIIIIlIllIlIlII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.ordinal ()I
      // 00f: iaload
      // 010: aload 1
      // 011: ifnull 043
      // 014: tableswitch 1240 1 4 36 130 638 736
      // 034: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 037: athrow
      // 038: aload 0
      // 039: invokevirtual me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.f ()Z
      // 03c: goto 043
      // 03f: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 042: athrow
      // 043: aload 1
      // 044: ifnull 06c
      // 047: ifne 052
      // 04a: goto 051
      // 04d: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 050: athrow
      // 051: return
      // 052: aload 0
      // 053: aload 1
      // 054: ifnull 078
      // 057: invokevirtual me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.e ()Lme/octo/client/lIllllIllllIIllIlIllIlIlIIIIlIIlllllllIlIIIIIIlIlIlIIIlIIIIllIllllIllllIIIlllIIIIlIlI;
      // 05a: invokevirtual me/octo/client/lIllllIllllIIllIlIllIlIlIIIIlIIlllllllIlIIIIIIlIlIlIIIlIIIIllIllllIllllIIIlllIIIIlIlI.a ()Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 05d: getstatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl [I
      // 060: swap
      // 061: invokevirtual me/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.ordinal ()I
      // 064: iaload
      // 065: goto 06c
      // 068: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 06b: athrow
      // 06c: bipush 1
      // 06d: if_icmpne 4ec
      // 070: aload 0
      // 071: goto 078
      // 074: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 077: athrow
      // 078: aload 0
      // 079: getfield me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lme/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 07c: getstatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 07f: if_acmpne 08c
      // 082: getstatic me/octo/client/IlIlIIIllIIlIIlllIlIlIlIIlIIIlIllIllIIIllIIlIlIIllIIlIIlIlllIIIlllIlIIlIIIIlIllIlIlII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/IlIlIIIllIIlIIlllIlIlIlIIlIIIlIllIllIIIllIIlIlIIllIIlIIlIlllIIIlllIlIIlIIIIlIllIlIlII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 085: goto 08f
      // 088: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 08b: athrow
      // 08c: getstatic me/octo/client/IlIlIIIllIIlIIlllIlIlIlIIlIIIlIllIllIIIllIIlIlIIllIIlIIlIlllIIIlllIlIIlIIIIlIllIlIlII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/IlIlIIIllIIlIIlllIlIlIlIIlIIIlIllIllIIIllIIlIlIIllIIlIIlIlllIIIlllIlIIlIIIIlIllIlIlII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 08f: invokevirtual me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lme/octo/client/IlIlIIIllIIlIIlllIlIlIlIIlIIIlIllIllIIIllIIlIlIIllIIlIIlIlllIIIlllIlIIlIIIIlIllIlIlII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;)V
      // 092: aload 1
      // 093: ifnonnull 4ec
      // 096: aload 0
      // 097: aload 1
      // 098: ifnull 0be
      // 09b: goto 0a2
      // 09e: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0a1: athrow
      // 0a2: getfield me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lme/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 0a5: getstatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 0a8: if_acmpeq 0bd
      // 0ab: goto 0b2
      // 0ae: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0b1: athrow
      // 0b2: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 0b5: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.t ()V
      // 0b8: return
      // 0b9: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0bc: athrow
      // 0bd: aload 0
      // 0be: getfield me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0c1: dup
      // 0c2: ifnull 0f5
      // 0c5: astore 3
      // 0c6: bipush 0
      // 0c7: istore 4
      // 0c9: aload 1
      // 0ca: ifnull 0f2
      // 0cd: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 0d0: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.K ()I
      // 0d3: aload 3
      // 0d4: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()I
      // 0d7: if_icmpeq 0f1
      // 0da: goto 0e1
      // 0dd: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0e0: athrow
      // 0e1: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 0e4: aload 3
      // 0e5: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()I
      // 0e8: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.b (I)Z
      // 0eb: pop
      // 0ec: return
      // 0ed: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0f0: athrow
      // 0f1: nop
      // 0f2: goto 0f7
      // 0f5: pop
      // 0f6: nop
      // 0f7: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 0fa: aload 0
      // 0fb: getfield me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Lnet/minecraft/world/phys/Vec3;
      // 0fe: bipush 0
      // 0ff: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.b (Lnet/minecraft/world/phys/Vec3;Z)D
      // 102: ldc2_w 3.0
      // 105: dcmpg
      // 106: aload 1
      // 107: ifnull 15c
      // 10a: ifge 14c
      // 10d: goto 114
      // 110: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 113: athrow
      // 114: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 117: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.r ()V
      // 11a: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 11d: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()Lme/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll;
      // 120: invokevirtual me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.d ()Z
      // 123: aload 1
      // 124: ifnull 18d
      // 127: goto 12e
      // 12a: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 12d: athrow
      // 12e: ifne 184
      // 131: goto 138
      // 134: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 137: athrow
      // 138: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 13b: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()Lme/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll;
      // 13e: invokevirtual me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.k ()V
      // 141: aload 1
      // 142: ifnonnull 184
      // 145: goto 14c
      // 148: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 14b: athrow
      // 14c: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 14f: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()Lme/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll;
      // 152: invokevirtual me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.d ()Z
      // 155: goto 15c
      // 158: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 15b: athrow
      // 15c: aload 1
      // 15d: ifnull 18d
      // 160: ifeq 184
      // 163: goto 16a
      // 166: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 169: athrow
      // 16a: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 16d: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()Lme/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll;
      // 170: aload 0
      // 171: getfield me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lnet/minecraft/core/BlockPos;
      // 174: aconst_null
      // 175: bipush 0
      // 176: bipush 6
      // 178: aconst_null
      // 179: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lme/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll;Ljava/lang/Object;Lnet/minecraft/world/phys/Vec3;ZILjava/lang/Object;)Z
      // 17c: pop
      // 17d: goto 184
      // 180: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 183: athrow
      // 184: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 187: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()Lme/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll;
      // 18a: invokevirtual me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.d ()Z
      // 18d: ifne 191
      // 190: return
      // 191: aload 0
      // 192: getfield me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Lnet/minecraft/world/phys/Vec3;
      // 195: dconst_0
      // 196: ldc2_w 1.52
      // 199: dconst_0
      // 19a: invokevirtual net/minecraft/world/phys/Vec3.add (DDD)Lnet/minecraft/world/phys/Vec3;
      // 19d: dup
      // 19e: sipush 10646
      // 1a1: sipush -9070
      // 1a4: pop2
      // 1a5: ldc_w "add(...)"
      // 1a8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1ab: invokestatic me/octo/client/utils/player/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.a (Lnet/minecraft/world/phys/Vec3;)Lme/octo/client/utils/player/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
      // 1ae: pop
      // 1af: aload 0
      // 1b0: invokevirtual me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a ()Lnet/minecraft/client/Minecraft;
      // 1b3: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 1b6: dup
      // 1b7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 1ba: invokevirtual net/minecraft/client/multiplayer/ClientLevel.entitiesForRendering ()Ljava/lang/Iterable;
      // 1bd: dup
      // 1be: sipush 10634
      // 1c1: sipush 1567
      // 1c4: pop2
      // 1c5: ldc_w "entitiesForRendering(...)"
      // 1c8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1cb: astore 4
      // 1cd: aload 4
      // 1cf: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 1d4: astore 5
      // 1d6: aload 5
      // 1d8: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1dd: ifeq 223
      // 1e0: aload 5
      // 1e2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1e7: astore 6
      // 1e9: aload 6
      // 1eb: checkcast net/minecraft/world/entity/Entity
      // 1ee: astore 7
      // 1f0: bipush 0
      // 1f1: istore 8
      // 1f3: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 1f6: aload 0
      // 1f7: getfield me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Lnet/minecraft/world/phys/Vec3;
      // 1fa: aload 7
      // 1fc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 1ff: aload 7
      // 201: invokestatic me/octo/client/utils/player/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 204: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.c (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 207: ldc2_w 0.01
      // 20a: dcmpg
      // 20b: aload 1
      // 20c: ifnull 213
      // 20f: ifge 216
      // 212: bipush 1
      // 213: goto 217
      // 216: bipush 0
      // 217: ifeq 1d6
      // 21a: aload 6
      // 21c: aload 1
      // 21d: ifnull 1eb
      // 220: goto 224
      // 223: aconst_null
      // 224: checkcast net/minecraft/world/entity/Entity
      // 227: dup
      // 228: ifnonnull 231
      // 22b: pop
      // 22c: return
      // 22d: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 230: athrow
      // 231: astore 2
      // 232: getstatic me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 235: aload 0
      // 236: getfield me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Lnet/minecraft/world/phys/Vec3;
      // 239: invokevirtual me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.c (Lnet/minecraft/world/phys/Vec3;)Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
      // 23c: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.a ()F
      // 23f: invokestatic java/lang/Math.abs (F)F
      // 242: ldc_w 5.0
      // 245: fcmpg
      // 246: aload 1
      // 247: ifnull 276
      // 24a: ifge 4ec
      // 24d: goto 254
      // 250: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 253: athrow
      // 254: aload 0
      // 255: invokevirtual me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.d ()Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 258: aload 1
      // 259: ifnull 28b
      // 25c: goto 263
      // 25f: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 262: athrow
      // 263: sipush 1500
      // 266: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 269: checkcast java/lang/Number
      // 26c: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 26f: goto 276
      // 272: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 275: athrow
      // 276: ifeq 4ec
      // 279: getstatic me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 27c: aload 2
      // 27d: invokevirtual me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a (Lnet/minecraft/world/entity/Entity;)V
      // 280: aload 0
      // 281: invokevirtual me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.d ()Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 284: goto 28b
      // 287: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 28a: athrow
      // 28b: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 28e: aload 1
      // 28f: ifnonnull 4ec
      // 292: aload 0
      // 293: aload 1
      // 294: ifnull 2ba
      // 297: goto 29e
      // 29a: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 29d: athrow
      // 29e: getfield me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lme/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 2a1: getstatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 2a4: if_acmpeq 2b9
      // 2a7: goto 2ae
      // 2aa: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2ad: athrow
      // 2ae: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 2b1: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.t ()V
      // 2b4: return
      // 2b5: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2b8: athrow
      // 2b9: aload 0
      // 2ba: invokevirtual me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.d ()Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 2bd: aload 1
      // 2be: ifnull 2e0
      // 2c1: sipush 1000
      // 2c4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2c7: checkcast java/lang/Number
      // 2ca: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 2cd: ifne 2dc
      // 2d0: goto 2d7
      // 2d3: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2d6: athrow
      // 2d7: return
      // 2d8: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2db: athrow
      // 2dc: aload 0
      // 2dd: invokevirtual me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.d ()Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 2e0: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 2e3: sipush 10676
      // 2e6: sipush -32246
      // 2e9: pop2
      // 2ea: ldc_w "/bz"
      // 2ed: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Ljava/lang/Object;)V
      // 2f0: aload 1
      // 2f1: ifnonnull 4ec
      // 2f4: aload 0
      // 2f5: aload 1
      // 2f6: ifnull 31c
      // 2f9: goto 300
      // 2fc: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2ff: athrow
      // 300: getfield me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lme/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 303: getstatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 306: if_acmpeq 31b
      // 309: goto 310
      // 30c: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 30f: athrow
      // 310: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 313: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.t ()V
      // 316: return
      // 317: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 31a: athrow
      // 31b: aload 0
      // 31c: getfield me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 31f: dup
      // 320: ifnull 353
      // 323: astore 3
      // 324: bipush 0
      // 325: istore 4
      // 327: aload 1
      // 328: ifnull 350
      // 32b: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 32e: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.K ()I
      // 331: aload 3
      // 332: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()I
      // 335: if_icmpeq 34f
      // 338: goto 33f
      // 33b: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 33e: athrow
      // 33f: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 342: aload 3
      // 343: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()I
      // 346: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.b (I)Z
      // 349: pop
      // 34a: return
      // 34b: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 34e: athrow
      // 34f: nop
      // 350: goto 355
      // 353: pop
      // 354: nop
      // 355: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 358: aload 0
      // 359: getfield me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl Lnet/minecraft/world/phys/Vec3;
      // 35c: bipush 0
      // 35d: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.b (Lnet/minecraft/world/phys/Vec3;Z)D
      // 360: ldc2_w 3.0
      // 363: dcmpg
      // 364: aload 1
      // 365: ifnull 3ba
      // 368: ifge 3aa
      // 36b: goto 372
      // 36e: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 371: athrow
      // 372: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 375: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.r ()V
      // 378: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 37b: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()Lme/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll;
      // 37e: invokevirtual me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.d ()Z
      // 381: aload 1
      // 382: ifnull 3eb
      // 385: goto 38c
      // 388: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 38b: athrow
      // 38c: ifne 3e2
      // 38f: goto 396
      // 392: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 395: athrow
      // 396: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 399: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()Lme/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll;
      // 39c: invokevirtual me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.k ()V
      // 39f: aload 1
      // 3a0: ifnonnull 3e2
      // 3a3: goto 3aa
      // 3a6: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3a9: athrow
      // 3aa: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 3ad: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()Lme/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll;
      // 3b0: invokevirtual me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.d ()Z
      // 3b3: goto 3ba
      // 3b6: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3b9: athrow
      // 3ba: aload 1
      // 3bb: ifnull 3eb
      // 3be: ifeq 3e2
      // 3c1: goto 3c8
      // 3c4: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3c7: athrow
      // 3c8: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 3cb: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()Lme/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll;
      // 3ce: aload 0
      // 3cf: getfield me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll Lnet/minecraft/core/BlockPos;
      // 3d2: aconst_null
      // 3d3: bipush 0
      // 3d4: bipush 6
      // 3d6: aconst_null
      // 3d7: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lme/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll;Ljava/lang/Object;Lnet/minecraft/world/phys/Vec3;ZILjava/lang/Object;)Z
      // 3da: pop
      // 3db: goto 3e2
      // 3de: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3e1: athrow
      // 3e2: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 3e5: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()Lme/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll;
      // 3e8: invokevirtual me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.d ()Z
      // 3eb: ifne 3ef
      // 3ee: return
      // 3ef: aload 0
      // 3f0: getfield me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl Lnet/minecraft/world/phys/Vec3;
      // 3f3: dconst_0
      // 3f4: ldc2_w 1.52
      // 3f7: dconst_0
      // 3f8: invokevirtual net/minecraft/world/phys/Vec3.add (DDD)Lnet/minecraft/world/phys/Vec3;
      // 3fb: dup
      // 3fc: sipush 10682
      // 3ff: sipush -10290
      // 402: pop2
      // 403: ldc_w "add(...)"
      // 406: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 409: invokestatic me/octo/client/utils/player/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.a (Lnet/minecraft/world/phys/Vec3;)Lme/octo/client/utils/player/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
      // 40c: pop
      // 40d: aload 0
      // 40e: invokevirtual me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a ()Lnet/minecraft/client/Minecraft;
      // 411: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 414: dup
      // 415: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 418: invokevirtual net/minecraft/client/multiplayer/ClientLevel.entitiesForRendering ()Ljava/lang/Iterable;
      // 41b: dup
      // 41c: sipush 10624
      // 41f: sipush -12148
      // 422: pop2
      // 423: ldc_w "entitiesForRendering(...)"
      // 426: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 429: astore 4
      // 42b: aload 4
      // 42d: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 432: astore 5
      // 434: aload 5
      // 436: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 43b: ifeq 481
      // 43e: aload 5
      // 440: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 445: astore 6
      // 447: aload 6
      // 449: checkcast net/minecraft/world/entity/Entity
      // 44c: astore 7
      // 44e: bipush 0
      // 44f: istore 8
      // 451: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 454: aload 0
      // 455: getfield me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl Lnet/minecraft/world/phys/Vec3;
      // 458: aload 7
      // 45a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 45d: aload 7
      // 45f: invokestatic me/octo/client/utils/player/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 462: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.c (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 465: ldc2_w 0.01
      // 468: dcmpg
      // 469: aload 1
      // 46a: ifnull 471
      // 46d: ifge 474
      // 470: bipush 1
      // 471: goto 475
      // 474: bipush 0
      // 475: ifeq 434
      // 478: aload 6
      // 47a: aload 1
      // 47b: ifnull 449
      // 47e: goto 482
      // 481: aconst_null
      // 482: checkcast net/minecraft/world/entity/Entity
      // 485: dup
      // 486: ifnonnull 48f
      // 489: pop
      // 48a: return
      // 48b: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 48e: athrow
      // 48f: astore 2
      // 490: getstatic me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 493: aload 0
      // 494: getfield me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl Lnet/minecraft/world/phys/Vec3;
      // 497: invokevirtual me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.c (Lnet/minecraft/world/phys/Vec3;)Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
      // 49a: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.a ()F
      // 49d: invokestatic java/lang/Math.abs (F)F
      // 4a0: ldc_w 5.0
      // 4a3: fcmpg
      // 4a4: aload 1
      // 4a5: ifnull 4d4
      // 4a8: ifge 4ec
      // 4ab: goto 4b2
      // 4ae: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4b1: athrow
      // 4b2: aload 0
      // 4b3: invokevirtual me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.d ()Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 4b6: aload 1
      // 4b7: ifnull 4e9
      // 4ba: goto 4c1
      // 4bd: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4c0: athrow
      // 4c1: sipush 1500
      // 4c4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 4c7: checkcast java/lang/Number
      // 4ca: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 4cd: goto 4d4
      // 4d0: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4d3: athrow
      // 4d4: ifeq 4ec
      // 4d7: getstatic me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 4da: aload 2
      // 4db: invokevirtual me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a (Lnet/minecraft/world/entity/Entity;)V
      // 4de: aload 0
      // 4df: invokevirtual me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.d ()Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 4e2: goto 4e9
      // 4e5: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4e8: athrow
      // 4e9: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 4ec: return
   }

   public void b(@NotNull llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.B ()Ljava/lang/String;
      // 003: aload 1
      // 004: sipush 10662
      // 007: sipush -9901
      // 00a: pop2
      // 00b: ldc_w "event"
      // 00e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 011: astore 2
      // 012: aload 1
      // 013: aload 2
      // 014: ifnull 02c
      // 017: invokevirtual me/octo/client/events/impl/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.k ()Ljava/lang/String;
      // 01a: ifnull 04b
      // 01d: goto 024
      // 020: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 023: athrow
      // 024: aload 1
      // 025: goto 02c
      // 028: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 02b: athrow
      // 02c: aload 2
      // 02d: ifnull 045
      // 030: invokevirtual me/octo/client/events/impl/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.m ()Ljava/util/List;
      // 033: ifnull 04b
      // 036: goto 03d
      // 039: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 03c: athrow
      // 03d: aload 1
      // 03e: goto 045
      // 041: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 044: athrow
      // 045: invokevirtual me/octo/client/events/impl/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.l ()Ljava/lang/Integer;
      // 048: ifnonnull 050
      // 04b: return
      // 04c: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 04f: athrow
      // 050: aload 0
      // 051: invokevirtual me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.d ()Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 054: aload 0
      // 055: getfield me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl I
      // 058: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 05b: checkcast java/lang/Number
      // 05e: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 061: aload 2
      // 062: ifnull 07c
      // 065: ifne 070
      // 068: goto 06f
      // 06b: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 06e: athrow
      // 06f: return
      // 070: aload 0
      // 071: getfield me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lme/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 074: getstatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl [I
      // 077: swap
      // 078: invokevirtual me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.ordinal ()I
      // 07b: iaload
      // 07c: aload 2
      // 07d: ifnull 0cf
      // 080: tableswitch 1384 1 6 44 134 273 321 828 884
      // 0a8: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0ab: athrow
      // 0ac: aload 1
      // 0ad: invokevirtual me/octo/client/events/impl/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.k ()Ljava/lang/String;
      // 0b0: aload 2
      // 0b1: ifnull 0de
      // 0b4: goto 0bb
      // 0b7: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0ba: athrow
      // 0bb: sipush 10625
      // 0be: sipush 31073
      // 0c1: pop2
      // 0c2: ldc_w "SkyBlock Menu"
      // 0c5: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 0c8: goto 0cf
      // 0cb: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0ce: athrow
      // 0cf: ifne 0d3
      // 0d2: return
      // 0d3: aload 1
      // 0d4: invokevirtual me/octo/client/events/impl/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.m ()Ljava/util/List;
      // 0d7: bipush 51
      // 0d9: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0de: checkcast net/minecraft/world/inventory/Slot
      // 0e1: invokevirtual net/minecraft/world/inventory/Slot.getItem ()Lnet/minecraft/world/item/ItemStack;
      // 0e4: dup
      // 0e5: ifnonnull 0ee
      // 0e8: pop
      // 0e9: return
      // 0ea: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0ed: athrow
      // 0ee: pop
      // 0ef: getstatic me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 0f2: bipush 51
      // 0f4: bipush 0
      // 0f5: getstatic net/minecraft/world/inventory/ContainerInput.PICKUP Lnet/minecraft/world/inventory/ContainerInput;
      // 0f8: invokevirtual me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a (IILnet/minecraft/world/inventory/ContainerInput;)V
      // 0fb: aload 0
      // 0fc: getstatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 0ff: invokespecial me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lme/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 102: aload 2
      // 103: ifnonnull 5f4
      // 106: aload 1
      // 107: invokevirtual me/octo/client/events/impl/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.k ()Ljava/lang/String;
      // 10a: aload 2
      // 10b: ifnull 13c
      // 10e: goto 115
      // 111: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 114: athrow
      // 115: sipush 10659
      // 118: sipush -21948
      // 11b: pop2
      // 11c: ldc_w "Booster Cookie"
      // 11f: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 122: ifne 131
      // 125: goto 12c
      // 128: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 12b: athrow
      // 12c: return
      // 12d: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 130: athrow
      // 131: aload 1
      // 132: invokevirtual me/octo/client/events/impl/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.m ()Ljava/util/List;
      // 135: bipush 49
      // 137: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 13c: checkcast net/minecraft/world/inventory/Slot
      // 13f: invokevirtual net/minecraft/world/inventory/Slot.getItem ()Lnet/minecraft/world/item/ItemStack;
      // 142: dup
      // 143: ifnonnull 14c
      // 146: pop
      // 147: return
      // 148: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 14b: athrow
      // 14c: astore 3
      // 14d: aload 2
      // 14e: ifnull 18d
      // 151: aload 3
      // 152: getstatic net/minecraft/world/item/Items.BARRIER Lnet/minecraft/world/item/Item;
      // 155: invokevirtual net/minecraft/world/item/ItemStack.is (Ljava/lang/Object;)Z
      // 158: ifne 174
      // 15b: goto 162
      // 15e: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 161: athrow
      // 162: aload 0
      // 163: getstatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 166: invokespecial me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lme/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 169: aload 2
      // 16a: ifnonnull 5f4
      // 16d: goto 174
      // 170: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 173: athrow
      // 174: aload 0
      // 175: invokevirtual me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a ()Lnet/minecraft/client/Minecraft;
      // 178: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 17b: dup
      // 17c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 17f: invokevirtual net/minecraft/client/player/LocalPlayer.closeContainer ()V
      // 182: aload 0
      // 183: invokespecial me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.n ()V
      // 186: goto 18d
      // 189: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 18c: athrow
      // 18d: aload 2
      // 18e: ifnonnull 5f4
      // 191: aload 0
      // 192: aload 2
      // 193: ifnull 1b7
      // 196: goto 19d
      // 199: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 19c: athrow
      // 19d: getfield me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Ljava/util/ArrayList;
      // 1a0: aload 1
      // 1a1: invokevirtual me/octo/client/events/impl/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.k ()Ljava/lang/String;
      // 1a4: invokevirtual java/util/ArrayList.contains (Ljava/lang/Object;)Z
      // 1a7: ifne 1b6
      // 1aa: goto 1b1
      // 1ad: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1b0: athrow
      // 1b1: return
      // 1b2: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1b5: athrow
      // 1b6: aload 0
      // 1b7: getstatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 1ba: invokespecial me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lme/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 1bd: aload 2
      // 1be: ifnonnull 5f4
      // 1c1: aload 1
      // 1c2: invokevirtual me/octo/client/events/impl/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.m ()Ljava/util/List;
      // 1c5: bipush 36
      // 1c7: invokestatic kotlin/collections/CollectionsKt.takeLast (Ljava/util/List;I)Ljava/util/List;
      // 1ca: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1cf: astore 3
      // 1d0: aload 3
      // 1d1: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1d6: ifeq 382
      // 1d9: aload 3
      // 1da: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1df: checkcast net/minecraft/world/inventory/Slot
      // 1e2: astore 4
      // 1e4: aload 2
      // 1e5: ifnull 3b8
      // 1e8: aload 2
      // 1e9: ifnull 23f
      // 1ec: goto 1f3
      // 1ef: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1f2: athrow
      // 1f3: aload 4
      // 1f5: invokevirtual net/minecraft/world/inventory/Slot.getItem ()Lnet/minecraft/world/item/ItemStack;
      // 1f8: dup
      // 1f9: ifnull 23e
      // 1fc: goto 203
      // 1ff: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 202: athrow
      // 203: invokevirtual net/minecraft/world/item/ItemStack.getHoverName ()Lnet/minecraft/network/chat/Component;
      // 206: dup
      // 207: ifnull 23e
      // 20a: goto 211
      // 20d: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 210: athrow
      // 211: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 216: dup
      // 217: aload 2
      // 218: ifnull 23b
      // 21b: goto 222
      // 21e: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 221: athrow
      // 222: ifnull 23e
      // 225: goto 22c
      // 228: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 22b: athrow
      // 22c: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // 22f: swap
      // 230: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // 233: dup
      // 234: goto 23b
      // 237: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 23a: athrow
      // 23b: ifnonnull 242
      // 23e: pop
      // 23f: goto 1d0
      // 242: astore 5
      // 244: aload 0
      // 245: getfield me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Ljava/util/List;
      // 248: checkcast java/lang/Iterable
      // 24b: astore 6
      // 24d: bipush 0
      // 24e: istore 7
      // 250: aload 6
      // 252: aload 2
      // 253: ifnull 28c
      // 256: instanceof java/util/Collection
      // 259: ifeq 28a
      // 25c: goto 263
      // 25f: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 262: athrow
      // 263: aload 6
      // 265: checkcast java/util/Collection
      // 268: aload 2
      // 269: ifnull 28c
      // 26c: goto 273
      // 26f: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 272: athrow
      // 273: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 278: ifeq 28a
      // 27b: goto 282
      // 27e: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 281: athrow
      // 282: bipush 0
      // 283: goto 2cc
      // 286: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 289: athrow
      // 28a: aload 6
      // 28c: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 291: astore 8
      // 293: aload 8
      // 295: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 29a: ifeq 2cb
      // 29d: aload 8
      // 29f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2a4: astore 9
      // 2a6: aload 9
      // 2a8: checkcast java/lang/String
      // 2ab: astore 10
      // 2ad: bipush 0
      // 2ae: istore 11
      // 2b0: aload 5
      // 2b2: checkcast java/lang/CharSequence
      // 2b5: aload 10
      // 2b7: checkcast java/lang/CharSequence
      // 2ba: bipush 0
      // 2bb: bipush 2
      // 2bc: aconst_null
      // 2bd: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 2c0: ifeq 293
      // 2c3: bipush 1
      // 2c4: aload 2
      // 2c5: ifnull 2c0
      // 2c8: goto 2cc
      // 2cb: bipush 0
      // 2cc: ifeq 1d0
      // 2cf: aload 0
      // 2d0: getfield me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll Ljava/util/List;
      // 2d3: checkcast java/lang/Iterable
      // 2d6: astore 6
      // 2d8: bipush 0
      // 2d9: istore 7
      // 2db: aload 6
      // 2dd: aload 2
      // 2de: ifnull 317
      // 2e1: instanceof java/util/Collection
      // 2e4: ifeq 315
      // 2e7: goto 2ee
      // 2ea: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2ed: athrow
      // 2ee: aload 6
      // 2f0: checkcast java/util/Collection
      // 2f3: aload 2
      // 2f4: ifnull 317
      // 2f7: goto 2fe
      // 2fa: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2fd: athrow
      // 2fe: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 303: ifeq 315
      // 306: goto 30d
      // 309: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 30c: athrow
      // 30d: bipush 0
      // 30e: goto 357
      // 311: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 314: athrow
      // 315: aload 6
      // 317: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 31c: astore 8
      // 31e: aload 8
      // 320: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 325: ifeq 356
      // 328: aload 8
      // 32a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 32f: astore 9
      // 331: aload 9
      // 333: checkcast java/lang/String
      // 336: astore 10
      // 338: bipush 0
      // 339: istore 11
      // 33b: aload 5
      // 33d: checkcast java/lang/CharSequence
      // 340: aload 10
      // 342: checkcast java/lang/CharSequence
      // 345: bipush 0
      // 346: bipush 2
      // 347: aconst_null
      // 348: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 34b: ifeq 31e
      // 34e: bipush 1
      // 34f: aload 2
      // 350: ifnull 34b
      // 353: goto 357
      // 356: bipush 0
      // 357: ifne 1d0
      // 35a: getstatic me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 35d: aload 4
      // 35f: getfield net/minecraft/world/inventory/Slot.index I
      // 362: bipush 0
      // 363: getstatic net/minecraft/world/inventory/ContainerInput.PICKUP Lnet/minecraft/world/inventory/ContainerInput;
      // 366: invokevirtual me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a (IILnet/minecraft/world/inventory/ContainerInput;)V
      // 369: aload 0
      // 36a: invokevirtual me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.d ()Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 36d: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 370: aload 0
      // 371: sipush 200
      // 374: getstatic kotlin/random/Random.Default Lkotlin/random/Random$Default;
      // 377: sipush 200
      // 37a: invokevirtual kotlin/random/Random$Default.nextInt (I)I
      // 37d: iadd
      // 37e: putfield me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl I
      // 381: return
      // 382: aload 0
      // 383: invokevirtual me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a ()Lnet/minecraft/client/Minecraft;
      // 386: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 389: dup
      // 38a: ifnull 397
      // 38d: invokevirtual net/minecraft/client/player/LocalPlayer.closeContainer ()V
      // 390: goto 398
      // 393: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 396: athrow
      // 397: pop
      // 398: sipush 10651
      // 39b: sipush 14077
      // 39e: pop2
      // 39f: ldc_w "auto_sell_complete"
      // 3a2: invokestatic kotlin/collections/MapsKt.emptyMap ()Ljava/util/Map;
      // 3a5: bipush 1
      // 3a6: bipush 1
      // 3a7: invokestatic me/octo/client/utils/lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.a (Ljava/lang/String;Ljava/util/Map;ZZ)Z
      // 3aa: pop
      // 3ab: bipush 0
      // 3ac: putstatic me/octo/client/lIlIllllIllIIlIIIIIIlIIIlllllIIIIllIIIIIIllllIIIIIIlllIlIllIIIIIIIIllllIIlllllIllIlII.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll Z
      // 3af: bipush 0
      // 3b0: putstatic me/octo/client/lIlIllllIllIIlIIIIIIlIIIlllllIIIIllIIIIIIllllIIIIIIlllIlIllIIIIIIIIllllIIlllllIllIlII.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl Z
      // 3b3: aload 0
      // 3b4: bipush 1
      // 3b5: invokevirtual me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Z)V
      // 3b8: aload 2
      // 3b9: ifnonnull 5f4
      // 3bc: aload 1
      // 3bd: invokevirtual me/octo/client/events/impl/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.k ()Ljava/lang/String;
      // 3c0: sipush 10653
      // 3c3: sipush -20119
      // 3c6: pop2
      // 3c7: ldc_w "Bazaar"
      // 3ca: bipush 0
      // 3cb: bipush 2
      // 3cc: aconst_null
      // 3cd: invokestatic kotlin/text/StringsKt.startsWith$default (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
      // 3d0: ifne 3df
      // 3d3: goto 3da
      // 3d6: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3d9: athrow
      // 3da: return
      // 3db: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3de: athrow
      // 3df: aload 0
      // 3e0: bipush 1
      // 3e1: putfield me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl Z
      // 3e4: aload 0
      // 3e5: bipush 0
      // 3e6: putfield me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI I
      // 3e9: aload 0
      // 3ea: getstatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 3ed: invokespecial me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lme/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 3f0: aload 2
      // 3f1: ifnonnull 5f4
      // 3f4: aload 0
      // 3f5: aload 2
      // 3f6: ifnull 42f
      // 3f9: goto 400
      // 3fc: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3ff: athrow
      // 400: getfield me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl Z
      // 403: ifeq 427
      // 406: goto 40d
      // 409: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 40c: athrow
      // 40d: aload 0
      // 40e: aload 2
      // 40f: ifnull 42f
      // 412: goto 419
      // 415: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 418: athrow
      // 419: getfield me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI I
      // 41c: bipush 1
      // 41d: if_icmplt 449
      // 420: goto 427
      // 423: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 426: athrow
      // 427: aload 0
      // 428: goto 42f
      // 42b: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 42e: athrow
      // 42f: invokevirtual me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a ()Lnet/minecraft/client/Minecraft;
      // 432: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 435: dup
      // 436: ifnull 443
      // 439: invokevirtual net/minecraft/client/player/LocalPlayer.closeContainer ()V
      // 43c: goto 444
      // 43f: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 442: athrow
      // 443: pop
      // 444: aload 0
      // 445: invokespecial me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.n ()V
      // 448: return
      // 449: aload 1
      // 44a: invokevirtual me/octo/client/events/impl/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.k ()Ljava/lang/String;
      // 44d: astore 3
      // 44e: aload 3
      // 44f: sipush 10628
      // 452: sipush -22307
      // 455: pop2
      // 456: ldc_w "Bazaar"
      // 459: bipush 0
      // 45a: bipush 2
      // 45b: aconst_null
      // 45c: invokestatic kotlin/text/StringsKt.startsWith$default (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
      // 45f: aload 2
      // 460: ifnull 59f
      // 463: ifeq 57c
      // 466: goto 46d
      // 469: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 46c: athrow
      // 46d: aload 1
      // 46e: invokevirtual me/octo/client/events/impl/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.m ()Ljava/util/List;
      // 471: bipush 47
      // 473: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 478: checkcast net/minecraft/world/inventory/Slot
      // 47b: invokevirtual net/minecraft/world/inventory/Slot.getItem ()Lnet/minecraft/world/item/ItemStack;
      // 47e: dup
      // 47f: ifnonnull 48f
      // 482: goto 489
      // 485: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 488: athrow
      // 489: pop
      // 48a: return
      // 48b: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 48e: athrow
      // 48f: astore 4
      // 491: getstatic me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 494: aload 4
      // 496: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.d (Lnet/minecraft/world/item/ItemStack;)Ljava/util/List;
      // 499: astore 5
      // 49b: aload 5
      // 49d: checkcast java/lang/Iterable
      // 4a0: astore 6
      // 4a2: bipush 0
      // 4a3: istore 7
      // 4a5: aload 6
      // 4a7: aload 2
      // 4a8: ifnull 4e1
      // 4ab: instanceof java/util/Collection
      // 4ae: ifeq 4df
      // 4b1: goto 4b8
      // 4b4: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4b7: athrow
      // 4b8: aload 6
      // 4ba: checkcast java/util/Collection
      // 4bd: aload 2
      // 4be: ifnull 4e1
      // 4c1: goto 4c8
      // 4c4: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4c7: athrow
      // 4c8: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 4cd: ifeq 4df
      // 4d0: goto 4d7
      // 4d3: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4d6: athrow
      // 4d7: bipush 0
      // 4d8: goto 539
      // 4db: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4de: athrow
      // 4df: aload 6
      // 4e1: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 4e6: astore 8
      // 4e8: aload 8
      // 4ea: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4ef: ifeq 538
      // 4f2: aload 8
      // 4f4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4f9: astore 9
      // 4fb: aload 9
      // 4fd: checkcast net/minecraft/network/chat/Component
      // 500: astore 10
      // 502: bipush 0
      // 503: istore 11
      // 505: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // 508: aload 10
      // 50a: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 50f: dup
      // 510: sipush 10648
      // 513: sipush 17534
      // 516: pop2
      // 517: ldc_w "getString(...)"
      // 51a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 51d: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // 520: sipush 10654
      // 523: sipush 3826
      // 526: pop2
      // 527: ldc_w "You don't have anything to sell"
      // 52a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 52d: ifeq 4e8
      // 530: bipush 1
      // 531: aload 2
      // 532: ifnull 52d
      // 535: goto 539
      // 538: bipush 0
      // 539: ifeq 55e
      // 53c: aload 0
      // 53d: invokevirtual me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a ()Lnet/minecraft/client/Minecraft;
      // 540: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 543: dup
      // 544: ifnull 558
      // 547: goto 54e
      // 54a: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 54d: athrow
      // 54e: invokevirtual net/minecraft/client/player/LocalPlayer.closeContainer ()V
      // 551: goto 559
      // 554: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 557: athrow
      // 558: pop
      // 559: aload 0
      // 55a: invokespecial me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.n ()V
      // 55d: return
      // 55e: getstatic me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 561: bipush 47
      // 563: bipush 0
      // 564: getstatic net/minecraft/world/inventory/ContainerInput.PICKUP Lnet/minecraft/world/inventory/ContainerInput;
      // 567: invokevirtual me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a (IILnet/minecraft/world/inventory/ContainerInput;)V
      // 56a: aload 0
      // 56b: invokevirtual me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.d ()Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 56e: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 571: aload 0
      // 572: sipush 400
      // 575: putfield me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl I
      // 578: aload 2
      // 579: ifnonnull 5f4
      // 57c: aload 3
      // 57d: aload 2
      // 57e: ifnull 5b4
      // 581: goto 588
      // 584: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 587: athrow
      // 588: sipush 10663
      // 58b: sipush 9932
      // 58e: pop2
      // 58f: ldc_w "Are you sure"
      // 592: bipush 0
      // 593: bipush 2
      // 594: aconst_null
      // 595: invokestatic kotlin/text/StringsKt.startsWith$default (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
      // 598: goto 59f
      // 59b: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 59e: athrow
      // 59f: ifeq 5f4
      // 5a2: aload 1
      // 5a3: invokevirtual me/octo/client/events/impl/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.m ()Ljava/util/List;
      // 5a6: bipush 11
      // 5a8: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 5ad: goto 5b4
      // 5b0: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5b3: athrow
      // 5b4: checkcast net/minecraft/world/inventory/Slot
      // 5b7: invokevirtual net/minecraft/world/inventory/Slot.getItem ()Lnet/minecraft/world/item/ItemStack;
      // 5ba: dup
      // 5bb: ifnonnull 5c4
      // 5be: pop
      // 5bf: return
      // 5c0: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5c3: athrow
      // 5c4: pop
      // 5c5: getstatic me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 5c8: bipush 11
      // 5ca: bipush 0
      // 5cb: getstatic net/minecraft/world/inventory/ContainerInput.PICKUP Lnet/minecraft/world/inventory/ContainerInput;
      // 5ce: invokevirtual me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a (IILnet/minecraft/world/inventory/ContainerInput;)V
      // 5d1: aload 0
      // 5d2: invokevirtual me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.d ()Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 5d5: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 5d8: aload 0
      // 5d9: sipush 500
      // 5dc: putfield me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl I
      // 5df: aload 0
      // 5e0: bipush 0
      // 5e1: putfield me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl Z
      // 5e4: aload 2
      // 5e5: ifnonnull 5f4
      // 5e8: new kotlin/NoWhenBranchMatchedException
      // 5eb: dup
      // 5ec: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
      // 5ef: athrow
      // 5f0: invokestatic me/octo/client/lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5f3: athrow
      // 5f4: return
   }

   public void b(@NotNull IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll param1) {
java.lang.String var1 = me.octo.client.IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.B();
net.minecraft.network.protocol.Packet var2 = param1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
if (!(var2 instanceof net.minecraft.network.protocol.game.ClientboundSystemChatPacket)) {
   return;
}
if (((net.minecraft.network.protocol.game.ClientboundSystemChatPacket)var2).overlay()) {
   return;
}
java.lang.String var3 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(((net.minecraft.network.protocol.game.ClientboundSystemChatPacket)var2).content().getString());
if (this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI == me.octo.client.lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
      && (kotlin.jvm.internal.Intrinsics.areEqual(var3, "[Bazaar] You don't have enough of an item in your inventories.")
         || kotlin.jvm.internal.Intrinsics.areEqual(var3, "[Bazaar] No items could be matched to buyers!")
         || kotlin.jvm.internal.Intrinsics.areEqual(var3, "[Bazaar] You don't have anything to sell!"))) {
   this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = true;
   this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI++;
}
if (var3.startsWith("This server is too laggy to use the Bazaar")
      && (this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI == me.octo.client.lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         || this.c() == me.octo.client.IlIlIIIllIIlIIlllIlIlIlIIlIIIlIllIllIIIllIIlIlIIllIIlIIlIlllIIIlllIlIIlIIIIlIllIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI)) {
   me.octo.client.lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll.f();
   me.octo.client.utils.lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.a("auto_sell_complete", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", "bazaar_laggy")), true, true);
   this.a(true);
}
if (var3.startsWith("You need SkyBlock Level 7 to acccess this feature!")) {
   this.k();
}
   }

    private final void n() {
       if (me.octo.client.utils.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g() && !this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl) {
          this.a(IlIlIIIllIIlIIlllIlIlIlIIlIIIlIllIllIIIllIIlIlIIllIIlIIlIlllIIIlllIlIIlIIIIlIllIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
          this.a(IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
          me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a("/sbmenu");
       }
       this.a(IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
       this.a(me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, 2000);
    }

   private final void o() {
      String var1 = me.octo.client.IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.B();
      if (var1 != null) {
         if (me.octo.client.utils.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g() && !this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl) {
            this.a(me.octo.client.IlIlIIIllIIlIIlllIlIlIlIIlIIIlIllIllIIIllIIlIlIIllIIlIIlIlllIIIlllIlIIlIIIIlIllIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
            this.a(me.octo.client.lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         } else {
            this.a(me.octo.client.lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         }
      }
   }

   private final void a(
      lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var1
   ) {
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var1;
      this.d().f();
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 400 + Random.Default.nextInt(200);
   }

   public void j() {
      java.lang.String var1 = me.octo.client.IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.B();
      super.j();
      java.lang.Object var2 = me.octo.client.lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var2 instanceof me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI && ((me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI) var2).ai();
      me.octo.client.lIlIllllIllIIlIIIIIIlIIIlllllIIIIllIIIIIIllllIIIIIIlllIlIllIIIIIIIIllllIIlllllIllIlII.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = true;
      me.octo.client.lIlIllllIllIIlIIIIIIlIIIlllllIIIIllIIIIIIllllIIIIIIlllIlIllIIIIIIIIllllIIlllllIllIlII.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = true;
      me.octo.client.utils.lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.a("auto_sell_start", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("bazaar_first", java.lang.Boolean.valueOf(me.octo.client.IIlIIllIIlIIIIllIIIIllllIIIIIIlllIIllIllllIlIlIIllIlIlIIIIIlllIIllIIIlllIlIllIIIllIlI.a().al()))), false, true);
      if (var1 != null && me.octo.client.IIlIIllIIlIIIIllIIIIllllIIIIIIlllIIllIllllIlIlIIllIlIlIIIIIlllIIllIIIlllIlIllIIIllIlI.a().al()) {
         this.o();
      }
      if (var1 == null) {
         this.n();
      }
   }

   public void k() {
      super.k();
      lIlIllllIllIIlIIIIIIlIIIlllllIIIIllIIIIIIllllIIIIIIlllIlIllIIIIIIIIllllIIlllllIllIlII.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = false;
      lIlIllllIllIIlIIIIIIlIIIlllllIIIIllIIIIIIllllIIIIIIlllIlIllIIIIIIIIllllIIlllllIllIlII.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = false;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[58];
      int var3 = 0;
      String var2 = "}À\u0013®ñ.\u0000¸2Ý×äLÙTArQ\u00adq\u0005ö&îÖlá7áéÅy\tíÕ\u0084M\u001fÚüa\u0003Ú ´¹§o\u0097g*Â\u0094Ë;±s4&\t\\hÎ\u00adóø\u0083\u001fE\tYÛúì\u0014Qhëz\u000bË\u0000hô¿IÙÁÙôÈ\bl\u00ad\u007f\u0084\u008b(\u001by\u0005k5XWH\fÒ@V0n¥c±)è\u001b\u001f\u0005h\u0091ùðr\f]¨ÿ\u001d¿thy5&Ý\u008a\nó\u0081\u0015\rN\u0086%Ó Å\u0007\u0086qF¸\u001cð\u001e\u0005ZÚgãé\u000eP»7\u0092à¶(jê^\rÒÖ\u0085\bÔ¶ªmäÔÀ|\b¿slÖÑÓ;°\u0005\u0085L¾\tÀ\u0007\\Ò°ùÆ'þ\b\u0014Ä\u000fËhÈ8f\u0005×ö\u0007\u009a8\b)CT¼¼\bî\u0096\tXÍV\u0082 \u0098ãY©\u0004\bù\u0003\r\u0007Y\rJ\u009a×±n-çYõOb!ÏauÌñÎI5]¡IÀ§Ï2BiÑ³\u008bäi\u008c\tç§fi\u0099äè\u001eéböN¯ã°\b<è\u0005*ÿ\u0016Ü\u0002\u00032§®)\u0003_i\u008fñ9½b;»8\u00809\u00139tÚMH§ð²¦\u0096hh¥fßÏ¨Îfº;Ø\u0006\u0002¥\u0015è\u0005A¨\u0006¿³\u0005\u0081ÑÄøÕ\u0006Õz¿á%Ó\u000f¯G\u0094HÇd\u0095¨\u0087óvN.ý©\u0006_\u009cÿ\u0002³Q\fX\u001f\u0007ÛDØ&\u0014\u0089\u0002\u0012ø\u0005}Æ¡'\"\u0012T\u0089ë\u0091(_hÏ8\u001f\u0091ÈÌW`aÁ\u0094\u0019À°ýÈÁ¨\u001bw|Äg¸)ÝÝíy\t\u008d\u009e\u0086#Cù¾\u0007¶_&\u008f\u007fÃï\u0003ª3\b\u0006@¦(ÿ¬3\u0005\u0007õ\u0015\u00936\u0005½{¿ù&\u0006<*¯}Q\f*ö\u001e1Á²Ê«cZm\u0095´{}^VØKI\u001bÐ° ¼«E¢Îö\u001e8êJ\u008dj¡V)®ù\u001d¼\bY@úÌ3wN\\\u0006\u001e\u0012tÀVy\u00199\u009eÂ\r&\u0010ç`ã&\u0094äWV\u0012\u009c\u0080'²[a\u009b¿î!\r\u0005µ¸æÝ%\u0085\u0018\u000f\u0010´x¶\u001f¦Ô\u008b,>Rýºøì\u0099(¼\u0091Z\nYa\f\u008e®\u008ff*'þ¢\u0092@³õ\u0006èõ\u0088D¦\u009b>çXõob%ÏáuËñ\u008e\u0000Ò\u001eL>JÔGc®Ô\u0015\"\u0018~i\u007f\u000e\u001cß1ÅQ§×f¾\u001dÜög\u0004ÐN¡vx`Ê\u001e\u007fõ¥¿-ï\u0016°\u0005m\u0006[PC2Ìå\u0007îo\u0015ÕÚ*·\u0012\u0086;±Çc\u0095\u0001\u0096\u001544\u00adxûöô\u0013&\u000e\u0013+ÅëÆª÷RM\u0099\u0018ÀZf\b\u008e\u0019\u0003\u0016PöË²";
      int var4 = "}À\u0013®ñ.\u0000¸2Ý×äLÙTArQ\u00adq\u0005ö&îÖlá7áéÅy\tíÕ\u0084M\u001fÚüa\u0003Ú ´¹§o\u0097g*Â\u0094Ë;±s4&\t\\hÎ\u00adóø\u0083\u001fE\tYÛúì\u0014Qhëz\u000bË\u0000hô¿IÙÁÙôÈ\bl\u00ad\u007f\u0084\u008b(\u001by\u0005k5XWH\fÒ@V0n¥c±)è\u001b\u001f\u0005h\u0091ùðr\f]¨ÿ\u001d¿thy5&Ý\u008a\nó\u0081\u0015\rN\u0086%Ó Å\u0007\u0086qF¸\u001cð\u001e\u0005ZÚgãé\u000eP»7\u0092à¶(jê^\rÒÖ\u0085\bÔ¶ªmäÔÀ|\b¿slÖÑÓ;°\u0005\u0085L¾\tÀ\u0007\\Ò°ùÆ'þ\b\u0014Ä\u000fËhÈ8f\u0005×ö\u0007\u009a8\b)CT¼¼\bî\u0096\tXÍV\u0082 \u0098ãY©\u0004\bù\u0003\r\u0007Y\rJ\u009a×±n-çYõOb!ÏauÌñÎI5]¡IÀ§Ï2BiÑ³\u008bäi\u008c\tç§fi\u0099äè\u001eéböN¯ã°\b<è\u0005*ÿ\u0016Ü\u0002\u00032§®)\u0003_i\u008fñ9½b;»8\u00809\u00139tÚMH§ð²¦\u0096hh¥fßÏ¨Îfº;Ø\u0006\u0002¥\u0015è\u0005A¨\u0006¿³\u0005\u0081ÑÄøÕ\u0006Õz¿á%Ó\u000f¯G\u0094HÇd\u0095¨\u0087óvN.ý©\u0006_\u009cÿ\u0002³Q\fX\u001f\u0007ÛDØ&\u0014\u0089\u0002\u0012ø\u0005}Æ¡'\"\u0012T\u0089ë\u0091(_hÏ8\u001f\u0091ÈÌW`aÁ\u0094\u0019À°ýÈÁ¨\u001bw|Äg¸)ÝÝíy\t\u008d\u009e\u0086#Cù¾\u0007¶_&\u008f\u007fÃï\u0003ª3\b\u0006@¦(ÿ¬3\u0005\u0007õ\u0015\u00936\u0005½{¿ù&\u0006<*¯}Q\f*ö\u001e1Á²Ê«cZm\u0095´{}^VØKI\u001bÐ° ¼«E¢Îö\u001e8êJ\u008dj¡V)®ù\u001d¼\bY@úÌ3wN\\\u0006\u001e\u0012tÀVy\u00199\u009eÂ\r&\u0010ç`ã&\u0094äWV\u0012\u009c\u0080'²[a\u009b¿î!\r\u0005µ¸æÝ%\u0085\u0018\u000f\u0010´x¶\u001f¦Ô\u008b,>Rýºøì\u0099(¼\u0091Z\nYa\f\u008e®\u008ff*'þ¢\u0092@³õ\u0006èõ\u0088D¦\u009b>çXõob%ÏáuËñ\u008e\u0000Ò\u001eL>JÔGc®Ô\u0015\"\u0018~i\u007f\u000e\u001cß1ÅQ§×f¾\u001dÜög\u0004ÐN¡vx`Ê\u001e\u007fõ¥¿-ï\u0016°\u0005m\u0006[PC2Ìå\u0007îo\u0015ÕÚ*·\u0012\u0086;±Çc\u0095\u0001\u0096\u001544\u00adxûöô\u0013&\u000e\u0013+ÅëÆª÷RM\u0099\u0018ÀZf\b\u008e\u0019\u0003\u0016PöË²"
         .length();
      char var1 = '\b';
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
                     case 0 -> 116;
                     case 1 -> 20;
                     case 2 -> 112;
                     case 3 -> 48;
                     case 4 -> 88;
                     case 5 -> 60;
                     default -> 17;
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
                     c = var5;
                     d = new String[58];
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
                     llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
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

                  var2 = "\u00856û(s -¹\u000e±Ò«î103;ï\u008ev\u0018\u00adG";
                  var4 = "\u00856û(s -¹\u000e±Ò«î103;ï\u008ev\u0018\u00adG".length();
                  var1 = '\b';
                  var8 = -1;
            }

            var10000 = 86;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
      return var0;
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 10670) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 57;
            case 1 -> 76;
            case 2 -> 37;
            case 3 -> 211;
            case 4 -> 247;
            case 5 -> 154;
            case 6 -> 113;
            case 7 -> 152;
            case 8 -> 122;
            case 9 -> 228;
            case 10 -> 172;
            case 11 -> 181;
            case 12 -> 203;
            case 13 -> 4;
            case 14 -> 168;
            case 15 -> 0;
            case 16 -> 252;
            case 17 -> 19;
            case 18 -> 91;
            case 19 -> 50;
            case 20 -> 56;
            case 21 -> 5;
            case 22 -> 201;
            case 23 -> 11;
            case 24 -> 77;
            case 25 -> 98;
            case 26 -> 12;
            case 27 -> 101;
            case 28 -> 48;
            case 29 -> 178;
            case 30 -> 58;
            case 31 -> 66;
            case 32 -> 133;
            case 33 -> 109;
            case 34 -> 8;
            case 35 -> 202;
            case 36 -> 87;
            case 37 -> 44;
            case 38 -> 149;
            case 39 -> 116;
            case 40 -> 47;
            case 41 -> 216;
            case 42 -> 169;
            case 43 -> 42;
            case 44 -> 62;
            case 45 -> 214;
            case 46 -> 185;
            case 47 -> 177;
            case 48 -> 217;
            case 49 -> 123;
            case 50 -> 137;
            case 51 -> 196;
            case 52 -> 150;
            case 53 -> 13;
            case 54 -> 17;
            case 55 -> 82;
            case 56 -> 195;
            case 57 -> 28;
            case 58 -> 162;
            case 59 -> 248;
            case 60 -> 171;
            case 61 -> 94;
            case 62 -> 244;
            case 63 -> 135;
            case 64 -> 118;
            case 65 -> 179;
            case 66 -> 166;
            case 67 -> 173;
            case 68 -> 130;
            case 69 -> 114;
            case 70 -> 131;
            case 71 -> 220;
            case 72 -> 234;
            case 73 -> 69;
            case 74 -> 229;
            case 75 -> 38;
            case 76 -> 80;
            case 77 -> 111;
            case 78 -> 141;
            case 79 -> 221;
            case 80 -> 41;
            case 81 -> 32;
            case 82 -> 128;
            case 83 -> 29;
            case 84 -> 225;
            case 85 -> 23;
            case 86 -> 59;
            case 87 -> 36;
            case 88 -> 110;
            case 89 -> 237;
            case 90 -> 159;
            case 91 -> 22;
            case 92 -> 218;
            case 93 -> 213;
            case 94 -> 183;
            case 95 -> 105;
            case 96 -> 71;
            case 97 -> 224;
            case 98 -> 25;
            case 99 -> 2;
            case 100 -> 138;
            case 101 -> 102;
            case 102 -> 165;
            case 103 -> 205;
            case 104 -> 30;
            case 105 -> 83;
            case 106 -> 250;
            case 107 -> 27;
            case 108 -> 227;
            case 109 -> 6;
            case 110 -> 43;
            case 111 -> 191;
            case 112 -> 167;
            case 113 -> 182;
            case 114 -> 74;
            case 115 -> 223;
            case 116 -> 93;
            case 117 -> 125;
            case 118 -> 35;
            case 119 -> 208;
            case 120 -> 242;
            case 121 -> 192;
            case 122 -> 212;
            case 123 -> 249;
            case 124 -> 16;
            case 125 -> 67;
            case 126 -> 70;
            case 127 -> 106;
            case 128 -> 187;
            case 129 -> 163;
            case 130 -> 10;
            case 131 -> 193;
            case 132 -> 52;
            case 133 -> 34;
            case 134 -> 134;
            case 135 -> 254;
            case 136 -> 246;
            case 137 -> 18;
            case 138 -> 176;
            case 139 -> 155;
            case 140 -> 153;
            case 141 -> 24;
            case 142 -> 15;
            case 143 -> 180;
            case 144 -> 251;
            case 145 -> 115;
            case 146 -> 26;
            case 147 -> 49;
            case 148 -> 96;
            case 149 -> 81;
            case 150 -> 156;
            case 151 -> 95;
            case 152 -> 240;
            case 153 -> 60;
            case 154 -> 121;
            case 155 -> 197;
            case 156 -> 86;
            case 157 -> 46;
            case 158 -> 92;
            case 159 -> 186;
            case 160 -> 236;
            case 161 -> 72;
            case 162 -> 126;
            case 163 -> 51;
            case 164 -> 144;
            case 165 -> 89;
            case 166 -> 230;
            case 167 -> 204;
            case 168 -> 200;
            case 169 -> 241;
            case 170 -> 143;
            case 171 -> 139;
            case 172 -> 64;
            case 173 -> 231;
            case 174 -> 75;
            case 175 -> 68;
            case 176 -> 20;
            case 177 -> 21;
            case 178 -> 142;
            case 179 -> 198;
            case 180 -> 160;
            case 181 -> 108;
            case 182 -> 161;
            case 183 -> 245;
            case 184 -> 120;
            case 185 -> 55;
            case 186 -> 107;
            case 187 -> 40;
            case 188 -> 85;
            case 189 -> 33;
            case 190 -> 3;
            case 191 -> 88;
            case 192 -> 104;
            case 193 -> 97;
            case 194 -> 146;
            case 195 -> 235;
            case 196 -> 184;
            case 197 -> 190;
            case 198 -> 219;
            case 199 -> 61;
            case 200 -> 78;
            case 201 -> 65;
            case 202 -> 100;
            case 203 -> 14;
            case 204 -> 148;
            case 205 -> 189;
            case 206 -> 99;
            case 207 -> 90;
            case 208 -> 1;
            case 209 -> 243;
            case 210 -> 84;
            case 211 -> 164;
            case 212 -> 215;
            case 213 -> 199;
            case 214 -> 174;
            case 215 -> 210;
            case 216 -> 222;
            case 217 -> 158;
            case 218 -> 132;
            case 219 -> 209;
            case 220 -> 147;
            case 221 -> 112;
            case 222 -> 206;
            case 223 -> 255;
            case 224 -> 239;
            case 225 -> 207;
            case 226 -> 145;
            case 227 -> 175;
            case 228 -> 9;
            case 229 -> 79;
            case 230 -> 103;
            case 231 -> 232;
            case 232 -> 233;
            case 233 -> 140;
            case 234 -> 194;
            case 235 -> 238;
            case 236 -> 54;
            case 237 -> 151;
            case 238 -> 39;
            case 239 -> 188;
            case 240 -> 226;
            case 241 -> 31;
            case 242 -> 157;
            case 243 -> 53;
            case 244 -> 253;
            case 245 -> 7;
            case 246 -> 170;
            case 247 -> 136;
            case 248 -> 73;
            case 249 -> 117;
            case 250 -> 45;
            case 251 -> 129;
            case 252 -> 127;
            case 253 -> 124;
            case 254 -> 119;
            default -> 63;
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


@NotNull
   public static final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI p() {
      return lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   }

@NotNull
   public static final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI q() {
      return llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   }
   public static enum IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;

      public static lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] a() {
         return (lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[])IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.clone();
      }

      public static lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
         String var0
      ) {
         return Enum.valueOf(
            lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> b() {
         return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[]{IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI};
      private static final EnumEntries<IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = kotlin.enums.EnumEntriesKt.enumEntries(IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll);
      public static IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] c() {
    IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var0 = new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[6];
    var0[0] = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
    var0[1] = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
    var0[2] = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
    var0[3] = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
    var0[4] = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
    var0[5] = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
    return var0;
   }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI a() {
         return lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
      }

      public final boolean b() {
         String var1 = IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.B();
         int var10000 = IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .h();
         if (var1 != null) {
            if (var10000 > 2) {
               lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl
                  .f();
            }

            var10000 = ((IIlIIllIIlIIIIllIIIIllllIIIIIIlllIIllIllllIlIlIIllIlIlIIIIIlllIIllIIIlllIlIllIIIllIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
               .aA()) ? 1 : 0);
         }

         if (var1 != null) {
            if (var10000 == 0) {
               return (0 != 0);
            }

            var10000 = ((java.util.function.Supplier<Integer>)(() -> { lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl
               .a(1000); return 0; })).get();
         }

         if (var1 != null) {
            if (var10000 == 0) {
               return (0 != 0);
            }

            var10000 = ((java.util.function.Supplier<Integer>)(() -> { this.a().a(60000); return 0; })).get();
         }

         if (var1 == null) {
            return (var10000 != 0);
         } else {
            return (var10000 != 0);
         }
      }
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker p0) { this(); }
   }
}
