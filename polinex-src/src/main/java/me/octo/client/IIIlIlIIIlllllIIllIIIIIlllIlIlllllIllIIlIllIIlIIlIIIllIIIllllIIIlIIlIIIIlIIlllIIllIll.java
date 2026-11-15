package me.octo.client;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import net.minecraft.core.BlockPos;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIIlIlIIIlllllIIllIIIIIlllIlIlllllIllIIlIllIIlIIlIIIllIIIllllIIIlIIlIIIIlIIlllIIllIll
   extends llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII {
   @NotNull
   public static IIIlIlIIIlllllIIllIIIIIlllIlIlllllIllIIlIllIIlIIlIIIllIIIllllIIIlIIlIIIIlIIlllIIllIll llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   @NotNull
   public static String lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   private static String[] c;
   private static String[] d;

   private IIIlIlIIIlllllIIllIIIIIlllIlIlllllIllIIlIllIIlIIlIIIllIIIllllIIIlIIlIIIIlIIlllIIllIll() {
      short var10001 = 13681;
      short var10002 = 31063;
      var10002 = 13694;
      short var10003 = -5457;
      var10003 = 13683;
      short var10004 = -24972;
      var10004 = 13684;
      short var10005 = -26807;
      IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI[] var1 = new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI[]{
         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
      };
      List var6 = CollectionsKt.listOf(var1);
      short var10006 = 13686;
      short var10007 = -12448;
      llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var7 = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      String[] var2 = new String[2];
      short var10011 = 13682;
      short var10012 = 13204;
      var2[0] = "location_route";
      var10011 = 13687;
      var10012 = -20363;
      var2[1] = "mine_route";
      super(
         "Cobblestone Mining Editor",
         "CobblestoneMining-Routes",
         "CobblestoneMining",
         "cobblestone",
         var6,
         "cobblestone",
         var7,
         null,
         CollectionsKt.listOf(var2),
         true,
         false,
         false,
         false,
         7296,
         null
      );
   }

   @Override
   public boolean G() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.e();
      if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
         == me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
         )
       {
         boolean var10000 = IIlllIIIlIIIIlIIlIIlIllIIlIIlllllIIIIlIlIllIllIllIIlllIlllllIllllIlIllIllIlIllllIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .d()
            .al();
         if (var1 != null) {
            return var10000;
         }

         if (var10000) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean I() {
      return IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
         == me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   }

   @Nullable
   @Override
   public String E() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.e();
      String var2 = IIlllIIIlIIIIlIIlIIlIllIIlIIlllllIIIIlIlIllIllIllIIlllIlllllIllllIlIllIllIlIllllIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a()
         .y();
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var10000;
      boolean var3 = Intrinsics.areEqual(var2, this.i().get(0));
      if (var1 == null) {
         if (var3) {
            return this.i().get(0);
         }

         if (var1 != null) {
            return var2;
         }

         var3 = Intrinsics.areEqual(var2, this.i().get(1));
      }

      return var3 ? this.i().get(1) : null;
   }

   @NotNull
   @Override
   public IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl J() {
      return IIlllIIIlIIIIlIIlIIlIllIIlIIlllllIIIIlIlIllIllIllIIlllIlllllIllllIlIllIllIlIllllIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var27 = null; // PX-FIX
      String[] var5 = new String[9];
      int var3 = 0;
      String var2 = "\u000fÇÇÅÍ*ó\b\u0083ÞJ\n@Ví66¤Å-ÁP\u000bgNÊôl\fÇÌ\u0005F\u009a\r\u0088Ððo¶\u0015¡\u0093\u0013rÒÏ=\u000e*Ù\u008c\u0005\u009d]þq\u008d´·¨Ùs\u0011xi\r\u0010\u0094\u0090Ø_æ4æ\u001f¥±itE\rÌ\u0012x7§\u001e\u0083òW^ZJ,";
      int var4 = "\u000fÇÇÅÍ*ó\b\u0083ÞJ\n@Ví66¤Å-ÁP\u000bgNÊôl\fÇÌ\u0005F\u009a\r\u0088Ððo¶\u0015¡\u0093\u0013rÒÏ=\u000e*Ù\u008c\u0005\u009d]þq\u008d´·¨Ùs\u0011xi\r\u0010\u0094\u0090Ø_æ4æ\u001f¥±itE\rÌ\u0012x7§\u001e\u0083òW^ZJ,"
         .length();
      char var1 = 11;
      int var10 = -1;

      label52:
while (true) {
         short var10000 = 85;
         String var10001 = var2.substring(++var10, var10 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var32 = var10001.toCharArray();
               int var10004 = var32.length;
               int var6 = 0;
               byte var35 = (byte)var10000;
               var27 = var32;
               int var19 = var10004;
               byte var40;
               char[] var44;
               int var10006;
               if (var10004 <= 1) {
                  var44 = var32;
                  var40 = (byte)var10000;
                  var10006 = var6;
               } else {
                  var35 = (byte)var10000;
                  var19 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var44 = var32;
                  var40 = (byte)var10000;
                  var10006 = var6;
               }

               while (true) {
                  var44[var10006] = (char)(var44[var10006] ^ var40 ^ switch (var6 % 7) {
                     case 0 -> 79;
                     case 1 -> 24;
                     case 2 -> 93;
                     case 3 -> 33;
                     case 4 -> 35;
                     case 5 -> 2;
                     default -> 67;
                  });
                  var6++;
                  if (var35 == 0) {
                     var10006 = var35;
                     var44 = var27;
                     var40 = var35;
                  } else {
                     if (var19 <= var6) {
                        break;
                     }

                     var44 = var27;
                     var40 = var35;
                     var10006 = var6;
                  }
               }
            }

            String var37 = new String(var27).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var37;
                  if ((var10 += var1) >= var4) {
                     c = var5;
                     d = new String[9];
                     var10000 = 13685;
                     short var21 = -9030;
                     lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = "Default Route";
                     llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = new IIIlIlIIIlllllIIllIIIIIlllIlIlllllIllIIlIllIIlIIlIIIllIIIllllIIIlIIlIIIIlIIlllIIllIll();
                     IIIlIlIIIlllllIIllIIIIIlllIlIlllllIllIIlIllIIlIIlIIIllIIIllllIIIlIIlIIIIlIIlllIIllIll var14 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
                     short var22 = 13680;
                     var10002 = 3943;
                     ArrayList[] var7 = new ArrayList[2];
                     IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll[] var8 = new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll[]{
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(-11, 178, -54),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(126, 186, 11),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                        )
                     };
                     var7[0] = CollectionsKt.arrayListOf(var8);
                     var8 = new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll[]{
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(127, 186, 23),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(126, 186, 37),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(127, 186, 54),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(126, 186, 77),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(127, 186, 91),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(126, 186, 98),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(127, 186, 101),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(131, 186, 101),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(132, 186, 96),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(131, 186, 83),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(132, 186, 69),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(131, 186, 46),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(132, 186, 34),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(132, 186, 26),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(130, 186, 22),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        )
                     };
                     var7[1] = CollectionsKt.arrayListOf(var8);
                     var14.a("Default Route", CollectionsKt.listOf(var7));
                     break label52;
                  }

                  var1 = var2.charAt(var10);
                  break;
               default:
                  var5[var3++] = var37;
                  if ((var10 += var1) < var4) {
                     var1 = var2.charAt(var10);
                     continue label52;
                  }

                  var2 = "`9\u0086\u0092mHoÌ\u0098Î¡¥á©Î\u001f×\u0095\u0086-ÀY\u0083Ã\u00ad\u0018:\u0086Íe\u0004¶B\u0013=5\u0015·S,?O\u00072Æðå\u0090\u0005X";
                  var4 = "`9\u0086\u0092mHoÌ\u0098Î¡¥á©Î\u001f×\u0095\u0086-ÀY\u0083Ã\u00ad\u0018:\u0086Íe\u0004¶B\u0013=5\u0015·S,?O\u00072Æðå\u0090\u0005X"
                     .length();
                  var1 = 25;
                  var10 = -1;
            }

            var10000 = 120;
            var10001 = var2.substring(++var10, var10 + var1);
            var10002 = 0;
         }
      }
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 13686) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 65;
            case 1 -> 103;
            case 2 -> 2;
            case 3 -> 33;
            case 4 -> 154;
            case 5 -> 37;
            case 6 -> 51;
            case 7 -> 181;
            case 8 -> 61;
            case 9 -> 4;
            case 10 -> 230;
            case 11 -> 121;
            case 12 -> 26;
            case 13 -> 97;
            case 14 -> 232;
            case 15 -> 165;
            case 16 -> 219;
            case 17 -> 194;
            case 18 -> 120;
            case 19 -> 130;
            case 20 -> 48;
            case 21 -> 234;
            case 22 -> 54;
            case 23 -> 84;
            case 24 -> 50;
            case 25 -> 94;
            case 26 -> 188;
            case 27 -> 218;
            case 28 -> 16;
            case 29 -> 138;
            case 30 -> 114;
            case 31 -> 64;
            case 32 -> 99;
            case 33 -> 70;
            case 34 -> 78;
            case 35 -> 133;
            case 36 -> 90;
            case 37 -> 53;
            case 38 -> 111;
            case 39 -> 251;
            case 40 -> 177;
            case 41 -> 192;
            case 42 -> 166;
            case 43 -> 178;
            case 44 -> 45;
            case 45 -> 240;
            case 46 -> 124;
            case 47 -> 136;
            case 48 -> 56;
            case 49 -> 6;
            case 50 -> 25;
            case 51 -> 35;
            case 52 -> 21;
            case 53 -> 184;
            case 54 -> 162;
            case 55 -> 102;
            case 56 -> 249;
            case 57 -> 118;
            case 58 -> 1;
            case 59 -> 254;
            case 60 -> 185;
            case 61 -> 142;
            case 62 -> 159;
            case 63 -> 73;
            case 64 -> 22;
            case 65 -> 66;
            case 66 -> 32;
            case 67 -> 47;
            case 68 -> 170;
            case 69 -> 144;
            case 70 -> 34;
            case 71 -> 49;
            case 72 -> 171;
            case 73 -> 225;
            case 74 -> 40;
            case 75 -> 220;
            case 76 -> 143;
            case 77 -> 224;
            case 78 -> 12;
            case 79 -> 125;
            case 80 -> 148;
            case 81 -> 246;
            case 82 -> 237;
            case 83 -> 135;
            case 84 -> 212;
            case 85 -> 115;
            case 86 -> 168;
            case 87 -> 67;
            case 88 -> 41;
            case 89 -> 116;
            case 90 -> 62;
            case 91 -> 92;
            case 92 -> 245;
            case 93 -> 46;
            case 94 -> 243;
            case 95 -> 63;
            case 96 -> 167;
            case 97 -> 24;
            case 98 -> 83;
            case 99 -> 147;
            case 100 -> 5;
            case 101 -> 8;
            case 102 -> 109;
            case 103 -> 229;
            case 104 -> 250;
            case 105 -> 198;
            case 106 -> 210;
            case 107 -> 160;
            case 108 -> 14;
            case 109 -> 253;
            case 110 -> 91;
            case 111 -> 137;
            case 112 -> 17;
            case 113 -> 42;
            case 114 -> 106;
            case 115 -> 179;
            case 116 -> 150;
            case 117 -> 93;
            case 118 -> 9;
            case 119 -> 214;
            case 120 -> 71;
            case 121 -> 190;
            case 122 -> 100;
            case 123 -> 176;
            case 124 -> 86;
            case 125 -> 43;
            case 126 -> 110;
            case 127 -> 193;
            case 128 -> 98;
            case 129 -> 20;
            case 130 -> 221;
            case 131 -> 131;
            case 132 -> 149;
            case 133 -> 191;
            case 134 -> 107;
            case 135 -> 207;
            case 136 -> 195;
            case 137 -> 172;
            case 138 -> 81;
            case 139 -> 141;
            case 140 -> 113;
            case 141 -> 23;
            case 142 -> 235;
            case 143 -> 44;
            case 144 -> 108;
            case 145 -> 252;
            case 146 -> 228;
            case 147 -> 223;
            case 148 -> 39;
            case 149 -> 211;
            case 150 -> 183;
            case 151 -> 128;
            case 152 -> 132;
            case 153 -> 95;
            case 154 -> 163;
            case 155 -> 244;
            case 156 -> 231;
            case 157 -> 112;
            case 158 -> 79;
            case 159 -> 201;
            case 160 -> 145;
            case 161 -> 10;
            case 162 -> 74;
            case 163 -> 15;
            case 164 -> 29;
            case 165 -> 169;
            case 166 -> 27;
            case 167 -> 87;
            case 168 -> 217;
            case 169 -> 75;
            case 170 -> 186;
            case 171 -> 236;
            case 172 -> 208;
            case 173 -> 255;
            case 174 -> 196;
            case 175 -> 238;
            case 176 -> 119;
            case 177 -> 76;
            case 178 -> 209;
            case 179 -> 30;
            case 180 -> 38;
            case 181 -> 248;
            case 182 -> 197;
            case 183 -> 69;
            case 184 -> 60;
            case 185 -> 7;
            case 186 -> 187;
            case 187 -> 199;
            case 188 -> 215;
            case 189 -> 182;
            case 190 -> 180;
            case 191 -> 247;
            case 192 -> 28;
            case 193 -> 129;
            case 194 -> 153;
            case 195 -> 89;
            case 196 -> 126;
            case 197 -> 140;
            case 198 -> 189;
            case 199 -> 57;
            case 200 -> 96;
            case 201 -> 233;
            case 202 -> 151;
            case 203 -> 127;
            case 204 -> 36;
            case 205 -> 239;
            case 206 -> 155;
            case 207 -> 117;
            case 208 -> 85;
            case 209 -> 204;
            case 210 -> 226;
            case 211 -> 18;
            case 212 -> 59;
            case 213 -> 68;
            case 214 -> 213;
            case 215 -> 216;
            case 216 -> 242;
            case 217 -> 11;
            case 218 -> 202;
            case 219 -> 13;
            case 220 -> 80;
            case 221 -> 58;
            case 222 -> 134;
            case 223 -> 152;
            case 224 -> 200;
            case 225 -> 175;
            case 226 -> 173;
            case 227 -> 72;
            case 228 -> 139;
            case 229 -> 227;
            case 230 -> 0;
            case 231 -> 161;
            case 232 -> 203;
            case 233 -> 105;
            case 234 -> 122;
            case 235 -> 146;
            case 236 -> 241;
            case 237 -> 82;
            case 238 -> 123;
            case 239 -> 206;
            case 240 -> 31;
            case 241 -> 156;
            case 242 -> 205;
            case 243 -> 174;
            case 244 -> 88;
            case 245 -> 158;
            case 246 -> 222;
            case 247 -> 19;
            case 248 -> 104;
            case 249 -> 164;
            case 250 -> 52;
            case 251 -> 55;
            case 252 -> 77;
            case 253 -> 157;
            case 254 -> 3;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }
}
