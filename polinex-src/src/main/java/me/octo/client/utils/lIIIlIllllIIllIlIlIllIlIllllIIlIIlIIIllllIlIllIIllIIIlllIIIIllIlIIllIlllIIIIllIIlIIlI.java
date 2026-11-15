package me.octo.client.utils;

import kotlin.jvm.internal.Intrinsics;
import me.octo.client.IIIIllllIlIIllIIlIIIlIlIllllIIIIIIlIlIlIIIllIllIIIIIlIIIlIlIlIlIlIIIllllIllIIlIIIIllI;
import me.octo.client.IllIIlIlllIlIllIlIllIlIIllIlIIlIllIllIlIllIllIIlIllIIlIIIlIlIIIIIIlllIIIllIIIIlIIIllI;
import me.octo.client.lIIlIlIIllIllllIIIllIIIIIlIIlIllIllllIIlllIIIIIlIlIlllIlIIIlllIlIIlIlllllIIlIIIIIIIll;
import me.octo.client.llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.input.CharacterEvent;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;

public final class lIIIlIllllIIllIlIlIllIlIllllIIlIIlIIIllllIlIllIIllIIIlllIIIIllIlIIllIlllIIIIllIIlIIlI {
   @NotNull
   public static lIIIlIllllIIllIlIlIllIlIllllIIlIIlIIIllllIlIllIIllIIIlllIIIIllIlIIllIlllIIIIllIIlIIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static String[] a;
   private static String[] b;

   private lIIIlIllllIIllIlIlIllIlIllllIIlIIlIIIllllIlIllIIllIIIlllIIIIllIlIIllIlllIIIIllIIlIIlI() {
   }

   public final void a(int var1, int var2, int var3) {
      String var4 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      if (lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .screen
         == null) {
         label56: {
            int var10000;
            label57: {
               byte var10001;
               var10000 = var2;
               var10001 = 1;
               label50:
               if (var4 == null) {
                  if (var2 != 1) {
                     var10000 = var2;
                     var10001 = 2;
                     if (var4 != null) {
                        break label50;
                     }

                     if (var2 != 2) {
                        return;
                     }
                  }

                  var10000 = var2;
                  if (var4 != null) {
                     break label57;
                  }

                  var10001 = 1;
               }

               if (var10000 != var10001) {
                  break label56;
               }

               var10000 = ((llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b(var1)) ? 1 : 0);
            }

            if (var4 == null) {
               if (var10000 != 0) {
                  return;
               }

               var10000 = var1;
            }

            switch (var10000) {
               case 263:
                  IllIIlIlllIlIllIlIllIlIIllIlIIlIllIllIlIllIllIIlIllIIlIIIlIlIIIIIIlllIIIllIIIIlIIIllI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
                     .a(
                        IllIIlIlllIlIllIlIllIlIIllIlIIlIllIllIlIllIllIIlIllIIlIIIlIlIIIIIIlllIIIllIIIIlIIIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.LEFT
                     );
                  if (var4 == null) {
                     break;
                  }
               case 262:
                  IllIIlIlllIlIllIlIllIlIIllIlIIlIllIllIlIllIllIIlIllIIlIIIlIlIIIIIIlllIIIllIIIIlIIIllI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
                     .a(
                        IllIIlIlllIlIllIlIllIlIIllIlIIlIllIllIlIllIllIIlIllIIlIIIlIlIIIIIIlllIIIllIIIIlIIIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.RIGHT
                     );
                  if (var4 == null) {
                     break;
                  }
               case 265:
                  IllIIlIlllIlIllIlIllIlIIllIlIIlIllIllIlIllIllIIlIllIIlIIIlIlIIIIIIlllIIIllIIIIlIIIllI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
                     .a(
                        IllIIlIlllIlIllIlIllIlIIllIlIIlIllIllIlIllIllIIlIllIIlIIIlIlIIIIIIlllIIIllIIIIlIIIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.UP
                     );
                  if (var4 == null) {
                     break;
                  }
               case 264:
                  IllIIlIlllIlIllIlIllIlIIllIlIIlIllIllIlIllIllIIlIllIIlIIIlIlIIIIIIlllIIIllIIIIlIIIllI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
                     .a(
                        IllIIlIlllIlIllIlIllIlIIllIlIIlIllIllIlIllIllIIlIllIIlIIIlIlIIIIIIlllIIIllIIIIlIIIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.DOWN
                     );
                  if (var4 == null) {
                     break;
                  }
               case 76:
                  IllIIlIlllIlIllIlIllIlIIllIlIIlIllIllIlIllIllIIlIllIIlIIIlIlIIIIIIlllIIIllIIIIlIIIllI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
                     .c();
            }
         }

         me.octo.client.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var1, var2);
      }
   }

   public final void b(int var1, int var2, int var3) {
      String var4 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      if (lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .screen
         == null) {
         label18: {
            int var10000 = var2;
            byte var10001 = 1;
            if (var4 == null) {
               if (var2 == 1) {
                  break label18;
               }

               var10000 = var2;
               var10001 = 2;
            }

            if (var10000 != var10001) {
               return;
            }
         }

         me.octo.client.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var1, var2);
      }
   }

   public final void a(char var1, int var2) {
      String var10000 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      Screen var4 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .screen;
      String var3 = var10000;
      boolean var6 = var4 instanceof lIIlIlIIllIllllIIIllIIIIIlIIlIllIllllIIlllIIIIIlIlIlllIlIIIlllIlIIlIlllllIIlIIIIIIIll;
      if (var3 == null) {
         if (!var6) {
            IIIIllllIlIIllIIlIIIlIlIllllIIIIIIlIlIlIIIllIllIIIIIlIIIlIlIlIlIlIIIllllIllIIlIIIIllI var5 = IIIIllllIlIIllIIlIIIlIlIllllIIIIIIlIlIlIIIllIllIIIIIlIIIlIlIlIlIlIIIllllIllIIlIIIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b();
            IIIIllllIlIIllIIlIIIlIlIllllIIIIIIlIlIlIIIllIllIIIIIlIIIlIlIlIlIlIIIllllIllIIlIIIIllI var7 = var5;
            if (var3 == null) {
               if (var5 == null) {
                  return;
               }

               var7 = var5;
            }

            var7.a(var1);
            return;
         }

         ((lIIlIlIIllIllllIIIllIIIIIlIIlIllIllllIIlllIIIIIlIlIlllIlIIIlllIlIIlIlllllIIlIIIIIIIll)var4).charTyped(new CharacterEvent(var1));
      }
   }

   public final boolean a(int var1) {
      Minecraft var10000 = Minecraft.getInstance();
      short var10002 = 32426;
      short var10003 = -7464;
      Intrinsics.checkNotNullExpressionValue(var10000, "getInstance(...)");
      Minecraft var3 = var10000;
      String var6 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      long var4 = var3.getWindow().handle();
      String var2 = var6;
      int var7 = GLFW.glfwGetKey(var4, var1);
      if (var2 == null) {
         var7 = var7 == 1 ? 1 : 0;
      }

      return (var7 != 0);
   }

   public final boolean a(int var1, @NotNull int... var2) {
       boolean var8 = false; // PX-FIX decl var8
      String var10000 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      short var10002 = 32427;
      short var10003 = 18076;
      Intrinsics.checkNotNullParameter(var2, "modifierKeys");
      String var3 = var10000;
      byte var7 = ((byte)((this.a(var1)) ? 1 : 0));
      if (var3 == null) {
         if (var7 == 0) {
            return false;
         }

         var7 = 0;
      }

      int var4 = var7;
      int var5 = var2.length;

      while (true) {
         if (var4 < var5) {
            int var6 = var2[var4];
            if (var3 == null) {
               var8 = this.a(var6);
               if (var3 != null) {
                  break;
               }

               if (!var8) {
                  return false;
               }

               var4++;
            }

            if (var3 == null) {
               continue;
            }
         }

         var8 = true;
         break;
      }

      return var8;
   }

   public final boolean a() {
      return lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .screen instanceof lIIlIlIIllIllllIIIllIIIIIlIIlIllIllllIIlllIIIIIlIlIlllIlIIIlllIlIIlIlllllIIlIIIIIIIll;
   }

   public final void b() {
      if (!this.a()) {
         Minecraft.getInstance().setScreen(new lIIlIlIIllIllllIIIllIIIIIlIIlIllIllllIIlllIIIIIlIlIlllIlIIIlllIlIIlIlllllIIlIIIIIIIll());
      }
   }

   public final void c() {
      if (this.a()) {
         if (lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .screen
            != null) {
            lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .screen
               .onClose();
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static { int var8 = 0; // PX-FIX hoist
        
   pxClinit: { // PX-FIX
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "\u0010ÿB\u0016 \u0086\u008a2\u008cûÈ#\u0010\u0088\u0083\nò3$ð,ÕO~(AG9u";
      int var4 = "\u0010ÿB\u0016 \u0086\u008a2\u008cûÈ#\u0010\u0088\u0083\nò3$ð,ÕO~(AG9u".length();
      char var1 = '\f';
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 16;
            var10002 = var10003;
             var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 16;
               var10006 = var6;
            } else {
               var13 = 16;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 16;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 76;
                  case 1 -> 75;
                  case 2 -> 127;
                  case 3 -> 121;
                  case 4 -> 27;
                  case 5 -> 84;
                  default -> 48;
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
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIIIlIllllIIllIlIlIllIlIllllIIlIIlIIIllllIlIllIIllIIIlllIIIIllIlIIllIlllIIIIllIIlIIlI();
            break pxClinit; // PX-FIX
         }

         var1 = var2.charAt(var0);
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) { int var8 = 0; // PX-FIX hoist
        
      int var2 = (var0 ^ 32427) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 14;
            case 1 -> 197;
            case 2 -> 116;
            case 3 -> 50;
            case 4 -> 129;
            case 5 -> 201;
            case 6 -> 184;
            case 7 -> 213;
            case 8 -> 199;
            case 9 -> 95;
            case 10 -> 49;
            case 11 -> 162;
            case 12 -> 139;
            case 13 -> 30;
            case 14 -> 89;
            case 15 -> 131;
            case 16 -> 134;
            case 17 -> 158;
            case 18 -> 202;
            case 19 -> 146;
            case 20 -> 65;
            case 21 -> 169;
            case 22 -> 64;
            case 23 -> 125;
            case 24 -> 200;
            case 25 -> 193;
            case 26 -> 81;
            case 27 -> 235;
            case 28 -> 44;
            case 29 -> 76;
            case 30 -> 209;
            case 31 -> 68;
            case 32 -> 175;
            case 33 -> 33;
            case 34 -> 136;
            case 35 -> 127;
            case 36 -> 245;
            case 37 -> 119;
            case 38 -> 216;
            case 39 -> 145;
            case 40 -> 79;
            case 41 -> 150;
            case 42 -> 91;
            case 43 -> 164;
            case 44 -> 214;
            case 45 -> 196;
            case 46 -> 130;
            case 47 -> 27;
            case 48 -> 19;
            case 49 -> 170;
            case 50 -> 62;
            case 51 -> 15;
            case 52 -> 178;
            case 53 -> 242;
            case 54 -> 246;
            case 55 -> 205;
            case 56 -> 208;
            case 57 -> 238;
            case 58 -> 152;
            case 59 -> 173;
            case 60 -> 179;
            case 61 -> 191;
            case 62 -> 110;
            case 63 -> 251;
            case 64 -> 85;
            case 65 -> 182;
            case 66 -> 185;
            case 67 -> 230;
            case 68 -> 217;
            case 69 -> 155;
            case 70 -> 156;
            case 71 -> 73;
            case 72 -> 67;
            case 73 -> 3;
            case 74 -> 72;
            case 75 -> 45;
            case 76 -> 123;
            case 77 -> 177;
            case 78 -> 250;
            case 79 -> 97;
            case 80 -> 195;
            case 81 -> 26;
            case 82 -> 108;
            case 83 -> 128;
            case 84 -> 121;
            case 85 -> 31;
            case 86 -> 149;
            case 87 -> 233;
            case 88 -> 83;
            case 89 -> 61;
            case 90 -> 93;
            case 91 -> 220;
            case 92 -> 159;
            case 93 -> 41;
            case 94 -> 231;
            case 95 -> 226;
            case 96 -> 60;
            case 97 -> 229;
            case 98 -> 142;
            case 99 -> 86;
            case 100 -> 212;
            case 101 -> 59;
            case 102 -> 222;
            case 103 -> 181;
            case 104 -> 190;
            case 105 -> 2;
            case 106 -> 105;
            case 107 -> 7;
            case 108 -> 204;
            case 109 -> 188;
            case 110 -> 106;
            case 111 -> 215;
            case 112 -> 94;
            case 113 -> 92;
            case 114 -> 137;
            case 115 -> 57;
            case 116 -> 151;
            case 117 -> 47;
            case 118 -> 11;
            case 119 -> 210;
            case 120 -> 28;
            case 121 -> 180;
            case 122 -> 132;
            case 123 -> 247;
            case 124 -> 17;
            case 125 -> 22;
            case 126 -> 167;
            case 127 -> 218;
            case 128 -> 38;
            case 129 -> 6;
            case 130 -> 88;
            case 131 -> 154;
            case 132 -> 112;
            case 133 -> 140;
            case 134 -> 0;
            case 135 -> 102;
            case 136 -> 42;
            case 137 -> 90;
            case 138 -> 114;
            case 139 -> 1;
            case 140 -> 5;
            case 141 -> 194;
            case 142 -> 104;
            case 143 -> 237;
            case 144 -> 103;
            case 145 -> 163;
            case 146 -> 12;
            case 147 -> 71;
            case 148 -> 239;
            case 149 -> 203;
            case 150 -> 148;
            case 151 -> 40;
            case 152 -> 117;
            case 153 -> 234;
            case 154 -> 141;
            case 155 -> 78;
            case 156 -> 223;
            case 157 -> 192;
            case 158 -> 36;
            case 159 -> 80;
            case 160 -> 198;
            case 161 -> 224;
            case 162 -> 227;
            case 163 -> 39;
            case 164 -> 157;
            case 165 -> 34;
            case 166 -> 20;
            case 167 -> 109;
            case 168 -> 13;
            case 169 -> 135;
            case 170 -> 211;
            case 171 -> 32;
            case 172 -> 58;
            case 173 -> 122;
            case 174 -> 228;
            case 175 -> 241;
            case 176 -> 4;
            case 177 -> 165;
            case 178 -> 161;
            case 179 -> 25;
            case 180 -> 243;
            case 181 -> 35;
            case 182 -> 189;
            case 183 -> 207;
            case 184 -> 232;
            case 185 -> 143;
            case 186 -> 84;
            case 187 -> 24;
            case 188 -> 166;
            case 189 -> 252;
            case 190 -> 63;
            case 191 -> 118;
            case 192 -> 147;
            case 193 -> 18;
            case 194 -> 138;
            case 195 -> 253;
            case 196 -> 240;
            case 197 -> 16;
            case 198 -> 10;
            case 199 -> 75;
            case 200 -> 186;
            case 201 -> 52;
            case 202 -> 153;
            case 203 -> 206;
            case 204 -> 29;
            case 205 -> 107;
            case 206 -> 183;
            case 207 -> 99;
            case 208 -> 66;
            case 209 -> 126;
            case 210 -> 100;
            case 211 -> 82;
            case 212 -> 37;
            case 213 -> 144;
            case 214 -> 255;
            case 215 -> 254;
            case 216 -> 51;
            case 217 -> 221;
            case 218 -> 96;
            case 219 -> 172;
            case 220 -> 176;
            case 221 -> 46;
            case 222 -> 249;
            case 223 -> 54;
            case 224 -> 21;
            case 225 -> 171;
            case 226 -> 113;
            case 227 -> 98;
            case 228 -> 160;
            case 229 -> 120;
            case 230 -> 56;
            case 231 -> 101;
            case 232 -> 70;
            case 233 -> 53;
            case 234 -> 244;
            case 235 -> 48;
            case 236 -> 111;
            case 237 -> 55;
            case 238 -> 236;
            case 239 -> 87;
            case 240 -> 174;
            case 241 -> 187;
            case 242 -> 74;
            case 243 -> 69;
            case 244 -> 124;
            case 245 -> 225;
            case 246 -> 115;
            case 247 -> 43;
            case 248 -> 8;
            case 249 -> 77;
            case 250 -> 248;
            case 251 -> 219;
            case 252 -> 133;
            case 253 -> 23;
            case 254 -> 168;
            default -> 9;
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
             var8 = var7 % 2;
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
