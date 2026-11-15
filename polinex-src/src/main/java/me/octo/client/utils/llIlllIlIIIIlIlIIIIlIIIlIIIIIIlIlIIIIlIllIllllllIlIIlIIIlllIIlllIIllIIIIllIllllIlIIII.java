package me.octo.client.utils;

import me.octo.client.IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

public final class llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII
   extends me.octo.client.llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private int lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private boolean lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private static llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static String[] f;
   private static String[] g;

   private llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII() {
      short var10001 = 20266;
      short var10002 = -4515;
      var10002 = 20268;
      short var10003 = -8040;
      short var10004 = 20257;
      short var10005 = 10686;
      super(
         "Discord Rich Presence",
         "Displays your current game status on Discord.",
         me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         "Addons",
         true,
         1
      , new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[0]);
   }

   @Override
   public void aB() {
      super.aB();
      String[] var10000 = llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = true;
      String[] var1 = var10000;
      if (!llllIIIlIIlIIIllllIllIIllIIIllIlIIllIIIIlllIIlllIlIIIIIIIlllIIllIlIllIlIlIIIIlIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .p()) {
         Runnable var10002 = llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII::ag;
         short var10003 = 20264;
         short var10004 = 12769;
         Thread var2 = new Thread(var10002, "DiscordRPC-Enable");
         boolean var4 = false;
         var2.setDaemon(true);
         var2.start();
      }

      if (var1 == null) {
         lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[1]
         );
      }
   }

   @Override
   public void aC() {
      super.aC();
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = false;

      try {
         llllIIIlIIlIIIllllIllIIllIIIllIlIIllIIIIlllIIlllIlIIIIIIIlllIIllIlIllIlIlIIIIlIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b();
      } catch (Exception var2) {
         String var10000 = var2.getMessage();
         short var10001 = 20269;
         short var10002 = -17244;
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("[DiscordRPC Module] Disable failed: " + var10000);
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl param1) {
      String[] var2 = me.octo.client.utils.llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "event");
      try {
         if (!this.aA()) {
            return;
         }
         int var3 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var3 + 1;
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl % 100;
         if (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl != 0) {
            return;
         }
         boolean var5 = this.aA();
         if (var5 == this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll) {
            return;
         }
         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var5;
         if (var5) {
            if (me.octo.client.utils.llllIIIlIIlIIIllllIllIIllIIIllIlIIllIIIIlllIIlllIlIIIIIIIlllIIllIlIllIlIlIIIIlIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.p()) {
               return;
            }
            Thread var4 = new Thread(llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII::ah, "DiscordRPC-ReEnable");
            var4.setDaemon(true);
            var4.start();
         } else {
            if (!me.octo.client.utils.llllIIIlIIlIIIllllIllIIllIIIllIlIIllIIIIlllIIlllIlIIIIIIIlllIIllIlIllIlIlIIIIlIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.p()) {
               return;
            }
            me.octo.client.utils.llllIIIlIIlIIIllllIllIIllIIIllIlIIllIIIIlllIIlllIlIIIIIIIlllIIllIlIllIlIlIIIIlIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b();
         }
      } catch (Exception var4ex) {
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("[DiscordRPC Module] Toggle disable failed: " + var4ex.getMessage());
      }
   }

   private static final void ag() {
      try {
         llllIIIlIIlIIIllllIllIIllIIIllIlIIllIIIIlllIIlllIlIIIIIIIlllIIllIlIllIlIlIIIIlIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a();
      } catch (Exception var1) {
         String var10000 = var1.getMessage();
         short var10001 = 20265;
         short var10002 = -27940;
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("[DiscordRPC Module] Enable failed: " + var10000);
      }
   }

   private static final void ah() {
      try {
         llllIIIlIIlIIIllllIllIIllIIIllIlIIllIIIIlllIIlllIlIIIIIIIlllIIllIlIllIlIlIIIIlIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a();
      } catch (Exception var1) {
         String var10000 = var1.getMessage();
         short var10001 = 20267;
         short var10002 = -9488;
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("[DiscordRPC Module] Re-enable failed: " + var10000);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[10];
      int var3 = 0;
      String var2 = "\u001d\u0010\u0099¦~Þô,J[½:&\u0016\u009c\u008f]#óÆ¢äL\u0099)L'´<Ó\u0096ìË\u0006xý\u008c!ÿ÷\u001fºA#\u009e\u0016\u000fmE\u000f\u0012eW\u0015\u0095'\u0088@\\\u0002°ÅÀpà\u001dDKG:\"h\bÐ\u001a&\"»\u0098K\u000blÁò:c\u009f)â³Eí©\u0080¶\u008e¯\t¬\bð\u0096¨.ÇhÒË¦/(ù\u009ar-]È\u0091®|½Ê\u0010Cã `\u0093*´xn%«\u0081\u0015*S\u0085\u000f§v\u0093\u0007bë÷ËrÖ\u009d\u0014ÑLºÙøß\u0095l$\u0006q\u001c\u0012\u009bGÓ\u0097xÏ×¼ë\u0001d»\u008dJ2×).öe\"²xJ9`a®2'hµ\u0013\u0011ñ\u0018\u009aNYòÜ\u008aE¥î.]ûK;Ë\u0013+)\u0016ùþ'ÚD$\u008a¹\u0089r Ø\u001d\u0080¢-×;\u0085µeÖÈ\u000b¯\u0011!Õ\u0084F\u008eôÍ¨\u0090S°tä Í";
      int var4 = "\u001d\u0010\u0099¦~Þô,J[½:&\u0016\u009c\u008f]#óÆ¢äL\u0099)L'´<Ó\u0096ìË\u0006xý\u008c!ÿ÷\u001fºA#\u009e\u0016\u000fmE\u000f\u0012eW\u0015\u0095'\u0088@\\\u0002°ÅÀpà\u001dDKG:\"h\bÐ\u001a&\"»\u0098K\u000blÁò:c\u009f)â³Eí©\u0080¶\u008e¯\t¬\bð\u0096¨.ÇhÒË¦/(ù\u009ar-]È\u0091®|½Ê\u0010Cã `\u0093*´xn%«\u0081\u0015*S\u0085\u000f§v\u0093\u0007bë÷ËrÖ\u009d\u0014ÑLºÙøß\u0095l$\u0006q\u001c\u0012\u009bGÓ\u0097xÏ×¼ë\u0001d»\u008dJ2×).öe\"²xJ9`a®2'hµ\u0013\u0011ñ\u0018\u009aNYòÜ\u008aE¥î.]ûK;Ë\u0013+)\u0016ùþ'ÚD$\u008a¹\u0089r Ø\u001d\u0080¢-×;\u0085µeÖÈ\u000b¯\u0011!Õ\u0084F\u008eôÍ¨\u0090S°tä Í"
         .length();
      char var1 = 17;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 95;
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
                     case 0 -> 33;
                     case 1 -> 81;
                     case 2 -> 21;
                     case 3 -> 29;
                     case 4 -> 41;
                     case 5 -> 96;
                     default -> 76;
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
                     f = var5;
                     g = new String[10];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII();
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

                  var2 = "tt#_b\u0006c\u00ad`51¤";
                  var4 = "tt#_b\u0006c\u00ad`51¤".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 91;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 20264) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 176;
            case 1 -> 218;
            case 2 -> 213;
            case 3 -> 166;
            case 4 -> 90;
            case 5 -> 177;
            case 6 -> 54;
            case 7 -> 14;
            case 8 -> 150;
            case 9 -> 7;
            case 10 -> 40;
            case 11 -> 86;
            case 12 -> 149;
            case 13 -> 142;
            case 14 -> 93;
            case 15 -> 39;
            case 16 -> 146;
            case 17 -> 36;
            case 18 -> 23;
            case 19 -> 220;
            case 20 -> 16;
            case 21 -> 245;
            case 22 -> 107;
            case 23 -> 196;
            case 24 -> 1;
            case 25 -> 102;
            case 26 -> 13;
            case 27 -> 138;
            case 28 -> 59;
            case 29 -> 20;
            case 30 -> 182;
            case 31 -> 197;
            case 32 -> 4;
            case 33 -> 43;
            case 34 -> 181;
            case 35 -> 49;
            case 36 -> 96;
            case 37 -> 144;
            case 38 -> 83;
            case 39 -> 195;
            case 40 -> 52;
            case 41 -> 106;
            case 42 -> 28;
            case 43 -> 171;
            case 44 -> 118;
            case 45 -> 75;
            case 46 -> 123;
            case 47 -> 70;
            case 48 -> 89;
            case 49 -> 113;
            case 50 -> 58;
            case 51 -> 211;
            case 52 -> 254;
            case 53 -> 38;
            case 54 -> 33;
            case 55 -> 122;
            case 56 -> 222;
            case 57 -> 185;
            case 58 -> 183;
            case 59 -> 242;
            case 60 -> 87;
            case 61 -> 239;
            case 62 -> 79;
            case 63 -> 32;
            case 64 -> 247;
            case 65 -> 162;
            case 66 -> 202;
            case 67 -> 29;
            case 68 -> 205;
            case 69 -> 125;
            case 70 -> 189;
            case 71 -> 81;
            case 72 -> 21;
            case 73 -> 172;
            case 74 -> 25;
            case 75 -> 35;
            case 76 -> 42;
            case 77 -> 206;
            case 78 -> 92;
            case 79 -> 223;
            case 80 -> 246;
            case 81 -> 46;
            case 82 -> 77;
            case 83 -> 208;
            case 84 -> 121;
            case 85 -> 191;
            case 86 -> 45;
            case 87 -> 148;
            case 88 -> 18;
            case 89 -> 104;
            case 90 -> 190;
            case 91 -> 50;
            case 92 -> 233;
            case 93 -> 69;
            case 94 -> 62;
            case 95 -> 207;
            case 96 -> 57;
            case 97 -> 126;
            case 98 -> 215;
            case 99 -> 186;
            case 100 -> 199;
            case 101 -> 158;
            case 102 -> 184;
            case 103 -> 139;
            case 104 -> 91;
            case 105 -> 53;
            case 106 -> 31;
            case 107 -> 236;
            case 108 -> 44;
            case 109 -> 170;
            case 110 -> 255;
            case 111 -> 140;
            case 112 -> 115;
            case 113 -> 65;
            case 114 -> 109;
            case 115 -> 160;
            case 116 -> 229;
            case 117 -> 244;
            case 118 -> 55;
            case 119 -> 103;
            case 120 -> 129;
            case 121 -> 240;
            case 122 -> 230;
            case 123 -> 151;
            case 124 -> 60;
            case 125 -> 82;
            case 126 -> 228;
            case 127 -> 11;
            case 128 -> 237;
            case 129 -> 200;
            case 130 -> 17;
            case 131 -> 234;
            case 132 -> 163;
            case 133 -> 30;
            case 134 -> 209;
            case 135 -> 175;
            case 136 -> 114;
            case 137 -> 37;
            case 138 -> 66;
            case 139 -> 243;
            case 140 -> 131;
            case 141 -> 6;
            case 142 -> 143;
            case 143 -> 193;
            case 144 -> 0;
            case 145 -> 141;
            case 146 -> 9;
            case 147 -> 101;
            case 148 -> 161;
            case 149 -> 88;
            case 150 -> 67;
            case 151 -> 3;
            case 152 -> 178;
            case 153 -> 78;
            case 154 -> 224;
            case 155 -> 72;
            case 156 -> 192;
            case 157 -> 159;
            case 158 -> 168;
            case 159 -> 226;
            case 160 -> 127;
            case 161 -> 153;
            case 162 -> 80;
            case 163 -> 169;
            case 164 -> 227;
            case 165 -> 41;
            case 166 -> 84;
            case 167 -> 74;
            case 168 -> 19;
            case 169 -> 252;
            case 170 -> 99;
            case 171 -> 110;
            case 172 -> 76;
            case 173 -> 250;
            case 174 -> 180;
            case 175 -> 167;
            case 176 -> 97;
            case 177 -> 204;
            case 178 -> 201;
            case 179 -> 10;
            case 180 -> 136;
            case 181 -> 27;
            case 182 -> 134;
            case 183 -> 241;
            case 184 -> 203;
            case 185 -> 152;
            case 186 -> 249;
            case 187 -> 26;
            case 188 -> 128;
            case 189 -> 219;
            case 190 -> 51;
            case 191 -> 111;
            case 192 -> 179;
            case 193 -> 98;
            case 194 -> 119;
            case 195 -> 155;
            case 196 -> 116;
            case 197 -> 137;
            case 198 -> 100;
            case 199 -> 124;
            case 200 -> 71;
            case 201 -> 145;
            case 202 -> 187;
            case 203 -> 214;
            case 204 -> 8;
            case 205 -> 108;
            case 206 -> 212;
            case 207 -> 130;
            case 208 -> 194;
            case 209 -> 95;
            case 210 -> 47;
            case 211 -> 154;
            case 212 -> 216;
            case 213 -> 147;
            case 214 -> 188;
            case 215 -> 165;
            case 216 -> 112;
            case 217 -> 15;
            case 218 -> 2;
            case 219 -> 63;
            case 220 -> 232;
            case 221 -> 253;
            case 222 -> 56;
            case 223 -> 156;
            case 224 -> 120;
            case 225 -> 198;
            case 226 -> 68;
            case 227 -> 64;
            case 228 -> 157;
            case 229 -> 48;
            case 230 -> 235;
            case 231 -> 22;
            case 232 -> 34;
            case 233 -> 225;
            case 234 -> 24;
            case 235 -> 174;
            case 236 -> 105;
            case 237 -> 221;
            case 238 -> 5;
            case 239 -> 94;
            case 240 -> 132;
            case 241 -> 135;
            case 242 -> 217;
            case 243 -> 248;
            case 244 -> 85;
            case 245 -> 73;
            case 246 -> 133;
            case 247 -> 164;
            case 248 -> 61;
            case 249 -> 210;
            case 250 -> 117;
            case 251 -> 173;
            case 252 -> 12;
            case 253 -> 251;
            case 254 -> 238;
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

         g[var2] = new String(var3).intern();
      }

      return g[var2];
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

      private static String[] IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII a() {
         return llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      }

      public static void b(String[] var0) {
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var0;
      }

      public static String[] b() {
         return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      static {
         if (b() == null) {
            b(new String[4]);
         }
      }
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker p0) { this(); }
   }
   public static llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII ai() { return null; }
}
