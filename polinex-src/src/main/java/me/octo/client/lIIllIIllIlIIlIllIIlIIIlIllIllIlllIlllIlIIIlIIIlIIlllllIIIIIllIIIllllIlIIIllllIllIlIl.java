package me.octo.client;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.Options;
import net.minecraft.client.gui.screens.Screen;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIllIIllIlIIlIllIIlIIIlIllIllIlllIlllIlIIIlIIIlIIlllllIIIIIllIIIllllIlIIIllllIllIlIl
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static lIIllIIllIlIIlIllIIlIIIlIllIllIlllIlllIlIIIlIIIlIIlllllIIIIIllIIIllllIlIIIllllIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @Nullable
   private Integer lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @JvmField
   @NotNull
   public static lIIllIIllIlIIlIllIIlIIIlIllIllIlllIlllIlIIIlIIIlIIlllllIIIIIllIIIllllIlIIIllllIllIlIl lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static String[] f;
   private static String[] g;

   private lIIllIIllIlIIlIllIIlIIIlIllIllIlllIlllIlIIIlIIIlIIlllllIIIIIllIIIllllIlIIIllllIllIlIl() {
      short var10001 = 9512;
      short var10002 = 15055;
      var10002 = 9514;
      short var10003 = 28785;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      short var10004 = 9513;
      short var10005 = -20737;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         lIllIIIllIIIlIIIlIIIIlIIIlIlllllllIllIIIIIllIlllIlllllIlIIIIllIIIIIllllllIIllIIlIIlIl.a(),
         lIllIIIllIIIlIIIlIIIIlIIIlIlllllllIllIIIIIllIlllIlllllIlIIIIllIIIIIllllllIIllIIlIIlIl.b(),
         lIllIIIllIIIlIIIlIIIIlIIIlIlllllllIllIIIIIllIlllIlllllIlIIIIllIIIIIllllllIIllIIlIIlIl.c(),
         lIllIIIllIIIlIIIlIIIIlIIIlIlllllllIllIIIIIllIlllIlllllIlIIIIllIIIIIllllllIIllIIlIIlIl.d()
      };
      super("No Render", "Limits world rendering while a macro is active.", var3, "Render", var1);
   }

   private final boolean ag() {
      return lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   }

   public final boolean ah() {
      String var1 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      boolean var10000 = this.ae();
      if (var1 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = this.ag();
      }

      if (var1 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = this.aL();
      }

      return var1 != null ? var10000 : var10000;
   }

   public final int ai() {
      return RangesKt.coerceAtLeast((int)Math.ceil(lIllIIIllIIIlIIIlIIIIlIIIlIlllllllIllIIIIIllIlllIlllllIlIIIIllIIIIIllllllIIllIIlIIlIl.a().M() / 16.0), 0);
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl var1) {
      Intrinsics.checkNotNullParameter(var1, "e");
      this.aG();
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      Intrinsics.checkNotNullParameter(var1, "e");
      this.aM();
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII var1) {
      Intrinsics.checkNotNullParameter(var1, "e");
      this.aM();
   }

   public final void aG() {
      String var1 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      if (var1 == null) {
         Options var10000 = this.ap().options;
         if (var10000 != null) {
            Options var2 = var10000;
            if (var1 == null) {
               Integer var5 = var2.renderDistance().get();
               if (var5 != null) {
                  int var3 = var5;
                  lIIllIIllIlIIlIllIIlIIIlIllIllIlllIlllIlIIIlIIIlIIlllllIIIIIllIIIllllIlIIIllllIllIlIl var6 = this;
                  if (var1 == null) {
                     if (this.ah()) {
                        int var4;
                        label34: {
                           var4 = this.ai();
                           lIIllIIllIlIIlIllIIlIIIlIllIllIlllIlllIlIIIlIIIlIIlllllIIIIIllIIIllllIlIIIllllIllIlIl var7 = this;
                           if (var1 == null) {
                              if (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl != null) {
                                 break label34;
                              }

                              var7 = this;
                           }

                           var7.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var3;
                        }

                        if (var3 == var4) {
                           return;
                        }

                        var2.renderDistance().set(var4);
                        if (var1 == null) {
                           return;
                        }
                     }

                     var6 = this;
                  }

                  var6.aM();
                  return;
               }
            }

            return;
         }
      }
   }

   @Override
   public void aB() {
      super.aB();
      this.aG();
   }

   @Override
   public void aC() {
      super.aC();
      this.aM();
   }

   public final boolean aH() {
      return this.ah();
   }

   public final boolean aI() {
      String var1 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      boolean var10000 = this.ah();
      if (var1 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = lIllIIIllIIIlIIIlIIIIlIIIlIlllllllIllIIIIIllIlllIlllllIlIIIIllIIIIIllllllIIllIIlIIlIl.b().ae();
      }

      return var1 != null ? var10000 : var10000;
   }

   public final boolean aJ() {
      String var1 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      boolean var10000 = this.ah();
      if (var1 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = lIllIIIllIIIlIIIlIIIIlIIIlIlllllllIllIIIIIllIlllIlllllIlIIIIllIIIIIllllllIIllIIlIIlIl.c().ae();
      }

      return var1 != null ? var10000 : var10000;
   }

   public final boolean aK() {
      String var1 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      boolean var10000 = this.ah();
      if (var1 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = lIllIIIllIIIlIIIlIIIIlIIIlIlllllllIllIIIIIllIlllIlllllIlIIIIllIIIIIllllllIIllIIlIIlIl.d().ae();
      }

      return var1 != null ? var10000 : var10000;
   }

   private final boolean aL() {
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      Screen var2 = this.ap().screen;
      String var1 = var10000;
      Minecraft var3 = this.ap();
      if (var1 == null) {
         if (var3.player == null) {
            return false;
         }

         var3 = this.ap();
      }

      if (var3.level != null) {
         Screen var4 = var2;
         if (var1 == null) {
            if (var2 == null) {
               return true;
            }

            var4 = var2;
         }

         boolean var5 = var4.isInGameUi();
         if (var1 != null) {
            return var5;
         }

         if (var5) {
            return true;
         }
      }

      return false;
   }

   private final void aM() {
      String var1 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      if (var1 == null) {
         Options var10000 = this.ap().options;
         if (var10000 != null) {
            Options var2 = var10000;
            if (var1 == null && this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl != null) {
               int var3 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.intValue();
               boolean var4 = false;
               var2.renderDistance().set(var3);
            }

            this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = null;
            return;
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "è;\u007fÞQÄ²\u0086(\u0006L\u0095:v~=/\u0083ú\u001d\u001bè=ò\u0015ñ\u008c¹6\u009fij\u009b%ÜÁR_±\u008c\u000f´îöÉÇu9ç\u009d6¹~ÏáÇ§í\u0086\\RÂ\u00021";
      int var4 = "è;\u007fÞQÄ²\u0086(\u0006L\u0095:v~=/\u0083ú\u001d\u001bè=ò\u0015ñ\u008c¹6\u009fij\u009b%ÜÁR_±\u008c\u000f´îöÉÇu9ç\u009d6¹~ÏáÇ§í\u0086\\RÂ\u00021"
         .length();
      char var1 = '\t';
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
                  case 0 -> 118;
                  case 1 -> 41;
                  case 2 -> 76;
                  case 3 -> 11;
                  case 4 -> 49;
                  case 5 -> 79;
                  default -> 84;
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
            f = var5;
            g = new String[3];
            lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lIIllIIllIlIIlIllIIlIIIlIllIllIlllIlllIlIIIlIIIlIIlllllIIIIIllIIIllllIlIIIllllIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               (kotlin.jvm.internal.DefaultConstructorMarker) null
            );
            lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new lIIllIIllIlIIlIllIIlIIIlIllIllIlllIlllIlIIIlIIIlIIlllllIIIIIllIIIllllIlIIIllllIllIlIl();
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 9512) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 33;
            case 1 -> 156;
            case 2 -> 210;
            case 3 -> 214;
            case 4 -> 181;
            case 5 -> 192;
            case 6 -> 107;
            case 7 -> 52;
            case 8 -> 149;
            case 9 -> 150;
            case 10 -> 125;
            case 11 -> 146;
            case 12 -> 202;
            case 13 -> 133;
            case 14 -> 166;
            case 15 -> 183;
            case 16 -> 139;
            case 17 -> 195;
            case 18 -> 43;
            case 19 -> 20;
            case 20 -> 238;
            case 21 -> 173;
            case 22 -> 34;
            case 23 -> 129;
            case 24 -> 35;
            case 25 -> 180;
            case 26 -> 44;
            case 27 -> 226;
            case 28 -> 190;
            case 29 -> 175;
            case 30 -> 81;
            case 31 -> 11;
            case 32 -> 239;
            case 33 -> 209;
            case 34 -> 219;
            case 35 -> 147;
            case 36 -> 63;
            case 37 -> 236;
            case 38 -> 93;
            case 39 -> 197;
            case 40 -> 50;
            case 41 -> 73;
            case 42 -> 182;
            case 43 -> 5;
            case 44 -> 199;
            case 45 -> 96;
            case 46 -> 234;
            case 47 -> 167;
            case 48 -> 196;
            case 49 -> 12;
            case 50 -> 49;
            case 51 -> 144;
            case 52 -> 47;
            case 53 -> 251;
            case 54 -> 203;
            case 55 -> 241;
            case 56 -> 127;
            case 57 -> 28;
            case 58 -> 29;
            case 59 -> 186;
            case 60 -> 58;
            case 61 -> 118;
            case 62 -> 3;
            case 63 -> 191;
            case 64 -> 54;
            case 65 -> 103;
            case 66 -> 235;
            case 67 -> 160;
            case 68 -> 224;
            case 69 -> 154;
            case 70 -> 60;
            case 71 -> 13;
            case 72 -> 123;
            case 73 -> 101;
            case 74 -> 85;
            case 75 -> 170;
            case 76 -> 92;
            case 77 -> 108;
            case 78 -> 233;
            case 79 -> 221;
            case 80 -> 19;
            case 81 -> 138;
            case 82 -> 153;
            case 83 -> 104;
            case 84 -> 206;
            case 85 -> 115;
            case 86 -> 230;
            case 87 -> 78;
            case 88 -> 208;
            case 89 -> 106;
            case 90 -> 217;
            case 91 -> 134;
            case 92 -> 177;
            case 93 -> 48;
            case 94 -> 204;
            case 95 -> 27;
            case 96 -> 229;
            case 97 -> 168;
            case 98 -> 86;
            case 99 -> 141;
            case 100 -> 165;
            case 101 -> 83;
            case 102 -> 112;
            case 103 -> 14;
            case 104 -> 213;
            case 105 -> 246;
            case 106 -> 228;
            case 107 -> 231;
            case 108 -> 185;
            case 109 -> 249;
            case 110 -> 124;
            case 111 -> 111;
            case 112 -> 128;
            case 113 -> 7;
            case 114 -> 218;
            case 115 -> 109;
            case 116 -> 68;
            case 117 -> 72;
            case 118 -> 121;
            case 119 -> 16;
            case 120 -> 205;
            case 121 -> 131;
            case 122 -> 136;
            case 123 -> 212;
            case 124 -> 51;
            case 125 -> 200;
            case 126 -> 56;
            case 127 -> 252;
            case 128 -> 36;
            case 129 -> 99;
            case 130 -> 151;
            case 131 -> 94;
            case 132 -> 82;
            case 133 -> 21;
            case 134 -> 30;
            case 135 -> 87;
            case 136 -> 179;
            case 137 -> 148;
            case 138 -> 245;
            case 139 -> 31;
            case 140 -> 91;
            case 141 -> 2;
            case 142 -> 57;
            case 143 -> 62;
            case 144 -> 188;
            case 145 -> 24;
            case 146 -> 222;
            case 147 -> 37;
            case 148 -> 61;
            case 149 -> 84;
            case 150 -> 74;
            case 151 -> 69;
            case 152 -> 169;
            case 153 -> 116;
            case 154 -> 77;
            case 155 -> 110;
            case 156 -> 216;
            case 157 -> 53;
            case 158 -> 89;
            case 159 -> 25;
            case 160 -> 162;
            case 161 -> 126;
            case 162 -> 67;
            case 163 -> 178;
            case 164 -> 40;
            case 165 -> 158;
            case 166 -> 38;
            case 167 -> 70;
            case 168 -> 97;
            case 169 -> 159;
            case 170 -> 66;
            case 171 -> 46;
            case 172 -> 243;
            case 173 -> 155;
            case 174 -> 207;
            case 175 -> 64;
            case 176 -> 15;
            case 177 -> 23;
            case 178 -> 157;
            case 179 -> 194;
            case 180 -> 114;
            case 181 -> 130;
            case 182 -> 18;
            case 183 -> 59;
            case 184 -> 95;
            case 185 -> 253;
            case 186 -> 120;
            case 187 -> 100;
            case 188 -> 161;
            case 189 -> 220;
            case 190 -> 22;
            case 191 -> 6;
            case 192 -> 117;
            case 193 -> 145;
            case 194 -> 0;
            case 195 -> 80;
            case 196 -> 142;
            case 197 -> 10;
            case 198 -> 232;
            case 199 -> 79;
            case 200 -> 135;
            case 201 -> 198;
            case 202 -> 163;
            case 203 -> 88;
            case 204 -> 75;
            case 205 -> 113;
            case 206 -> 105;
            case 207 -> 17;
            case 208 -> 174;
            case 209 -> 227;
            case 210 -> 119;
            case 211 -> 248;
            case 212 -> 201;
            case 213 -> 132;
            case 214 -> 215;
            case 215 -> 242;
            case 216 -> 140;
            case 217 -> 164;
            case 218 -> 8;
            case 219 -> 223;
            case 220 -> 41;
            case 221 -> 42;
            case 222 -> 189;
            case 223 -> 176;
            case 224 -> 172;
            case 225 -> 4;
            case 226 -> 26;
            case 227 -> 71;
            case 228 -> 76;
            case 229 -> 240;
            case 230 -> 237;
            case 231 -> 98;
            case 232 -> 247;
            case 233 -> 102;
            case 234 -> 171;
            case 235 -> 55;
            case 236 -> 45;
            case 237 -> 9;
            case 238 -> 254;
            case 239 -> 122;
            case 240 -> 143;
            case 241 -> 211;
            case 242 -> 137;
            case 243 -> 187;
            case 244 -> 193;
            case 245 -> 32;
            case 246 -> 39;
            case 247 -> 255;
            case 248 -> 65;
            case 249 -> 90;
            case 250 -> 1;
            case 251 -> 152;
            case 252 -> 184;
            case 253 -> 225;
            case 254 -> 250;
            default -> 244;
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

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker p0) {  }
   }
}
