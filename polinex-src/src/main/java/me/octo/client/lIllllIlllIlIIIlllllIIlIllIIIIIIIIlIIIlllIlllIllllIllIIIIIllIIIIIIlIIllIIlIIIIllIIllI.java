package me.octo.client;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import net.minecraft.core.BlockPos;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIllllIlllIlIIIlllllIIlIllIIIIIIIIlIIIlllIlllIllllIllIIIIIllIIIIIIlIIllIIlIIIIllIIllI
   extends llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII {
   @NotNull
   public static lIllllIlllIlIIIlllllIIlIllIIIIIIIIlIIIlllIlllIllllIllIIIIIllIIIIIIlIIllIIlIIIIllIIllI llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   @NotNull
   public static String lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   private static String[] c;
   private static String[] d;

   private lIllllIlllIlIIIlllllIIlIllIIIIIIIIlIIIlllIlllIllllIllIIIIIllIIIIIIlIIllIIlIIIIllIIllI() {
      short var10001 = 11752;
      short var10002 = -32000;
      var10002 = 11758;
      short var10003 = 22450;
      var10003 = 11754;
      short var10004 = -1049;
      var10004 = 11756;
      short var10005 = 30360;
      IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI[] var1 = new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI[]{
         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
      };
      List var6 = CollectionsKt.listOf(var1);
      short var10006 = 11757;
      short var10007 = 19094;
      llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var7 = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      String[] var2 = new String[2];
      short var10011 = 11759;
      short var10012 = -21032;
      var2[0] = "location_route";
      var10011 = 11747;
      var10012 = 15828;
      var2[1] = "mine_route";
      super(
         "End Stone Editor",
         "EndStone-Routes",
         "EndStone",
         "endstone",
         var6,
         "endstone",
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
         == me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll
         )
       {
         boolean var10000 = llllIIlIIlIIlIlIlIIIIllIIllllllIIlIllIlllIlllllllllIlllIIIIllllIIlIIllIlIIIIlIIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .f()
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
         == me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   }

   @Nullable
   @Override
   public String E() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.e();
      String var2 = llllIIlIIlIIlIlIlIIIIllIIllllllIIlIllIlllIlllllllllIlllIIIIllllIIlIIllIlIIIIlIIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .c()
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
      return llllIIlIIlIIlIlIlIIIIllIIllllllIIlIllIlllIlllllllllIlllIIIIllllIIlIIllIlIIIIlIIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .d();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var27 = null; // PX-FIX
      String[] var5 = new String[9];
      int var3 = 0;
      String var2 = "\u0087Ê1ND=\\ãn\\\u001fÀ\u0088\b\u0098úñ\u0010\u001f\u0081\fR\rV\u0017\u000bõ\u0003J´\rs\u0081¼{ü\u0010%¬F©Î°ô\u00074\bµüçxRÊ\u000e3:\u008f\u001b7\u0092\bý\u0091\u0005VTéO\u000fÝ¶Y\u0099\n°®t\u0016~\u009a\u001fp&\u0002\b\u009ax\u0095`\u0093«\u009d\u0017";
      int var4 = "\u0087Ê1ND=\\ãn\\\u001fÀ\u0088\b\u0098úñ\u0010\u001f\u0081\fR\rV\u0017\u000bõ\u0003J´\rs\u0081¼{ü\u0010%¬F©Î°ô\u00074\bµüçxRÊ\u000e3:\u008f\u001b7\u0092\bý\u0091\u0005VTéO\u000fÝ¶Y\u0099\n°®t\u0016~\u009a\u001fp&\u0002\b\u009ax\u0095`\u0093«\u009d\u0017"
         .length();
      char var1 = '\r';
      int var10 = -1;

      label52:
while (true) {
         short var10000 = 69;
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
                     case 0 -> 39;
                     case 1 -> 2;
                     case 2 -> 98;
                     case 3 -> 18;
                     case 4 -> 28;
                     case 5 -> 122;
                     default -> 21;
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
                     var10000 = 11755;
                     short var21 = -13693;
                     lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = "Default Route";
                     llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = new lIllllIlllIlIIIlllllIIlIllIIIIIIIIlIIIlllIlllIllllIllIIIIIllIIIIIIlIIllIIlIIIIllIIllI();
                     lIllllIlllIlIIIlllllIIlIllIIIIIIIIlIIIlllIlllIllllIllIIIIIllIIIIIIlIIllIIlIIIIllIIllI var14 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
                     short var22 = 11753;
                     var10002 = -23586;
                     ArrayList[] var7 = new ArrayList[2];
                     IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll[] var8 = new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll[]{
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(-537, 100, -269),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(-551, 57, -262),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(-553, 17, -265),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(-583, 24, -280),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(-612, 22, -273),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(-664, 25, -255),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(-685, 16, -264),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(-684, 6, -317),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                        )
                     };
                     var7[0] = CollectionsKt.arrayListOf(var8);
                     var8 = new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll[]{
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(-683, 4, -329),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(-692, 4, -327),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(-705, 4, -317),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(-712, 4, -301),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(-722, 4, -287),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(-731, 4, -291),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(-741, 4, -294),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(-732, 4, -285),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(-737, 4, -266),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(-724, 4, -247),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(-713, 4, -245),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(-705, 4, -260),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(-691, 4, -263),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(-684, 4, -275),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(-698, 4, -274),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(-686, 4, -291),
                           IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        ),
                        new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
                           new BlockPos(-680, 4, -312),
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

                  var2 = "F\n^~º8è5\nûsê L*yÙÄ¾";
                  var4 = "F\n^~º8è5\nûsê L*yÙÄ¾".length();
                  var1 = '\b';
                  var10 = -1;
            }

            var10000 = 87;
            var10001 = var2.substring(++var10, var10 + var1);
            var10002 = 0;
         }
      }
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 11755) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 42;
            case 1 -> 228;
            case 2 -> 232;
            case 3 -> 234;
            case 4 -> 201;
            case 5 -> 88;
            case 6 -> 222;
            case 7 -> 243;
            case 8 -> 162;
            case 9 -> 169;
            case 10 -> 209;
            case 11 -> 221;
            case 12 -> 188;
            case 13 -> 75;
            case 14 -> 14;
            case 15 -> 132;
            case 16 -> 236;
            case 17 -> 198;
            case 18 -> 235;
            case 19 -> 246;
            case 20 -> 68;
            case 21 -> 180;
            case 22 -> 10;
            case 23 -> 17;
            case 24 -> 107;
            case 25 -> 215;
            case 26 -> 99;
            case 27 -> 13;
            case 28 -> 83;
            case 29 -> 122;
            case 30 -> 202;
            case 31 -> 127;
            case 32 -> 149;
            case 33 -> 111;
            case 34 -> 28;
            case 35 -> 171;
            case 36 -> 43;
            case 37 -> 172;
            case 38 -> 24;
            case 39 -> 210;
            case 40 -> 224;
            case 41 -> 102;
            case 42 -> 98;
            case 43 -> 79;
            case 44 -> 41;
            case 45 -> 220;
            case 46 -> 8;
            case 47 -> 214;
            case 48 -> 230;
            case 49 -> 34;
            case 50 -> 4;
            case 51 -> 251;
            case 52 -> 110;
            case 53 -> 119;
            case 54 -> 69;
            case 55 -> 255;
            case 56 -> 54;
            case 57 -> 183;
            case 58 -> 239;
            case 59 -> 117;
            case 60 -> 90;
            case 61 -> 45;
            case 62 -> 15;
            case 63 -> 159;
            case 64 -> 63;
            case 65 -> 176;
            case 66 -> 231;
            case 67 -> 114;
            case 68 -> 71;
            case 69 -> 244;
            case 70 -> 73;
            case 71 -> 254;
            case 72 -> 165;
            case 73 -> 167;
            case 74 -> 182;
            case 75 -> 144;
            case 76 -> 32;
            case 77 -> 197;
            case 78 -> 33;
            case 79 -> 38;
            case 80 -> 59;
            case 81 -> 155;
            case 82 -> 163;
            case 83 -> 70;
            case 84 -> 0;
            case 85 -> 80;
            case 86 -> 56;
            case 87 -> 253;
            case 88 -> 51;
            case 89 -> 179;
            case 90 -> 170;
            case 91 -> 248;
            case 92 -> 157;
            case 93 -> 128;
            case 94 -> 240;
            case 95 -> 207;
            case 96 -> 133;
            case 97 -> 199;
            case 98 -> 146;
            case 99 -> 66;
            case 100 -> 227;
            case 101 -> 252;
            case 102 -> 242;
            case 103 -> 158;
            case 104 -> 137;
            case 105 -> 46;
            case 106 -> 23;
            case 107 -> 96;
            case 108 -> 218;
            case 109 -> 20;
            case 110 -> 97;
            case 111 -> 118;
            case 112 -> 105;
            case 113 -> 124;
            case 114 -> 81;
            case 115 -> 76;
            case 116 -> 84;
            case 117 -> 85;
            case 118 -> 77;
            case 119 -> 19;
            case 120 -> 39;
            case 121 -> 161;
            case 122 -> 206;
            case 123 -> 121;
            case 124 -> 233;
            case 125 -> 205;
            case 126 -> 217;
            case 127 -> 186;
            case 128 -> 100;
            case 129 -> 191;
            case 130 -> 120;
            case 131 -> 94;
            case 132 -> 103;
            case 133 -> 193;
            case 134 -> 139;
            case 135 -> 104;
            case 136 -> 142;
            case 137 -> 250;
            case 138 -> 154;
            case 139 -> 238;
            case 140 -> 25;
            case 141 -> 55;
            case 142 -> 65;
            case 143 -> 44;
            case 144 -> 223;
            case 145 -> 11;
            case 146 -> 211;
            case 147 -> 58;
            case 148 -> 116;
            case 149 -> 143;
            case 150 -> 190;
            case 151 -> 7;
            case 152 -> 60;
            case 153 -> 181;
            case 154 -> 115;
            case 155 -> 64;
            case 156 -> 219;
            case 157 -> 16;
            case 158 -> 6;
            case 159 -> 67;
            case 160 -> 78;
            case 161 -> 61;
            case 162 -> 57;
            case 163 -> 189;
            case 164 -> 49;
            case 165 -> 123;
            case 166 -> 35;
            case 167 -> 31;
            case 168 -> 50;
            case 169 -> 82;
            case 170 -> 37;
            case 171 -> 178;
            case 172 -> 200;
            case 173 -> 160;
            case 174 -> 36;
            case 175 -> 101;
            case 176 -> 12;
            case 177 -> 113;
            case 178 -> 27;
            case 179 -> 173;
            case 180 -> 22;
            case 181 -> 5;
            case 182 -> 175;
            case 183 -> 140;
            case 184 -> 148;
            case 185 -> 91;
            case 186 -> 164;
            case 187 -> 72;
            case 188 -> 53;
            case 189 -> 2;
            case 190 -> 152;
            case 191 -> 184;
            case 192 -> 106;
            case 193 -> 151;
            case 194 -> 212;
            case 195 -> 213;
            case 196 -> 3;
            case 197 -> 29;
            case 198 -> 108;
            case 199 -> 9;
            case 200 -> 195;
            case 201 -> 52;
            case 202 -> 18;
            case 203 -> 185;
            case 204 -> 21;
            case 205 -> 166;
            case 206 -> 1;
            case 207 -> 194;
            case 208 -> 208;
            case 209 -> 229;
            case 210 -> 48;
            case 211 -> 204;
            case 212 -> 168;
            case 213 -> 136;
            case 214 -> 150;
            case 215 -> 62;
            case 216 -> 86;
            case 217 -> 135;
            case 218 -> 92;
            case 219 -> 225;
            case 220 -> 131;
            case 221 -> 141;
            case 222 -> 134;
            case 223 -> 241;
            case 224 -> 129;
            case 225 -> 187;
            case 226 -> 174;
            case 227 -> 30;
            case 228 -> 95;
            case 229 -> 226;
            case 230 -> 147;
            case 231 -> 196;
            case 232 -> 126;
            case 233 -> 138;
            case 234 -> 192;
            case 235 -> 203;
            case 236 -> 130;
            case 237 -> 87;
            case 238 -> 153;
            case 239 -> 89;
            case 240 -> 245;
            case 241 -> 112;
            case 242 -> 47;
            case 243 -> 26;
            case 244 -> 247;
            case 245 -> 109;
            case 246 -> 177;
            case 247 -> 156;
            case 248 -> 249;
            case 249 -> 237;
            case 250 -> 40;
            case 251 -> 216;
            case 252 -> 74;
            case 253 -> 125;
            case 254 -> 145;
            default -> 93;
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
