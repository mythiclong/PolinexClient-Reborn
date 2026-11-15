package me.octo.client;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.inventory.ContainerInput;
import org.jetbrains.annotations.NotNull;

public final class IIIIIIIIIIIIIlIllllIIllIllIIlllIIlIIlIlIIlIlIIllIIIIlIlIlllllllIlIIlIIlIlllllIIIIlIll
   extends IlIlIIIllIIlIIlllIlIlIlIIlIIIlIllIllIIIllIIlIlIIllIIlIIlIlllIIIlllIlIIlIIIIlIllIlIlII {
   private boolean IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static String[] c;
   private static String[] d;

   public IIIIIIIIIIIIIlIllllIIllIllIIlllIIlIIlIlIIlIlIIllIIIIlIlIlllllllIlIIlIIlIlllllIIIIlIll() {
      short var10001 = 30299;
      short var10002 = 27053;
      super("Bank Helper");
   }

   public final boolean n() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   public final void c(boolean var1) {
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var1;
   }

   @Override
   public void g() {
      Object var4 = null; // PX-FIX
      Object var2 = null; // PX-FIX
      int var1 = IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid.p();
      short var10000 = ((java.util.function.Supplier<Short>)(() -> { this.d().a(250); return 0; })).get();
      if (var1 == 0) {
         if ((var10000 == 0)) {
            return;
         }

         var10000 = ((short)((lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
            .b()
            .a()) ? 1 : 0));
      }

      label73: {
         label61:
         if (var1 == 0) {
            if ((var10000 != 0)) {
               var10000 = ((short)((lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                  .b()
                  .c()) ? 1 : 0));
               if (var1 != 0) {
                  break label61;
               }

               if ((var10000 != 0)) {
                  return;
               }
            }

            var2 = lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
               .b();
            if (var1 != 0) {
               break label73;
            }

            var10000 = ((me.octo.client.PXDyn)var2).a();
         }

         label42:
         if ((var10000 == 0)) {
            var10000 = ((short)((IlIIIlIIIlIIIlIIlIIllIIIIlIllIllIlIlIIllllIIlIIIIIllIIIlIlllIIIlIIllIllIlIlllIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b()
               .ae()) ? 1 : 0));
            if (var1 == 0) {
               if ((var10000 == 0)) {
                  break label42;
               }

               var10000 = ((short)((Intrinsics.areEqual(
                  lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .g(),
                  BigDecimal.ZERO
               )) ? 1 : 0));
            }

            label70: {
               if (var1 == 0) {
                  if ((var10000 != 0)) {
                     lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                        .b()
                        .a(true);
                     return;
                  }

                  var4 = this;
                  if (var1 != 0) {
                     break label70;
                  }

                  var10000 = ((short)((this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) ? 1 : 0));
               }

               if ((var10000 != 0)) {
                  return;
               }

               var10000 = 30303;
               short var10001 = -16897;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a("/bank");
               this.d().f();
               var4 = this;
            }

            this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = true;
            if (var1 == 0) {
               return;
            }
         }

         lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
            .b()
            .a(
               lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .h()
            );
         lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
            .b()
            .b(true);
         var2 = lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
            .b();
      }

      BigDecimal var6 = ((me.octo.client.PXDyn)var2).b();
      short var7 = 30302;
      short var10002 = 25888;
      var10002 = 30297;
      short var10003 = -11378;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
         "Successfully retrieved " + var6 + " coins."
      );
      this.a(true);
   }

   @SubscribeEvent
   public final void c(@NotNull me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI var1) {
      int var10000 = IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid.p();
      short var10002 = 30298;
      short var10003 = -18125;
      Intrinsics.checkNotNullParameter(var1, "event");
      int var2 = var10000;
      boolean var4 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m();
      if (var2 == 0) {
         if (!var4) {
            return;
         }

         var4 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      if (var2 == 0) {
         if (!var4) {
            return;
         }

         var4 = ((java.util.function.Supplier<Boolean>)(() -> { this.d().a(500); return false; })).get();
      }

      if (var4) {
         String var3 = var1.k();
         short var10001 = 30301;
         var10002 = 14770;
         var4 = Intrinsics.areEqual(var3, "Personal Bank Account");
         if (var2 == 0) {
            if (var4) {
               me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a(13, 0, ContainerInput.PICKUP);
               this.d().f();
               if (var2 == 0) {
                  return;
               }
            }

            var10001 = 30296;
            var10002 = 4252;
            var4 = Intrinsics.areEqual(var3, "Bank Withdrawal");
         }

         if (var4) {
            me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a(10, 0, ContainerInput.PICKUP);
            this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = false;
            lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
               .b()
               .a(true);
            if (var2 == 0) {
               LocalPlayer var6 = this.a().player;
               if (var6 != null) {
                  var6.closeContainer();
               }
            }

            this.d().f();
         }
      }
   }

   @Override
   public void j() {
      super.j();
      this.d().f();
   }

   @Override
   public void k() {
      super.k();
      this.d().d();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[7];
      int var3 = 0;
      String var2 = "Cø§gÓÚ»\u008e\tþs\u0005\u000eÏÆqÁ\u0007M\u0097IÊa\u0016!\u000f\u001fÔ,â¢u\u0099\u009fØÆRõy\u0012\"\u0005\u0002Ñ@$\u008a";
      int var4 = "Cø§gÓÚ»\u008e\tþs\u0005\u000eÏÆqÁ\u0007M\u0097IÊa\u0016!\u000f\u001fÔ,â¢u\u0099\u009fØÆRõy\u0012\"\u0005\u0002Ñ@$\u008a".length();
      char var1 = 11;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 113;
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
                     case 0 -> 78;
                     case 1 -> 18;
                     case 2 -> 61;
                     case 3 -> 67;
                     case 4 -> 92;
                     case 5 -> 79;
                     default -> 84;
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
                     d = new String[7];
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

                  var2 = "ìÛ\u009cm\u00adY\u007fX°\u0096\u000f\u001e¨\u0097\\\u008dk\u008c`+Ð±Ä\u0015h\u0088~\u0005È[\u008a¬\u000bm\u008a\u009dÿ@°xGÁÆ\\\u0007";
                  var4 = "ìÛ\u009cm\u00adY\u007fX°\u0096\u000f\u001e¨\u0097\\\u008dk\u008c`+Ð±Ä\u0015h\u0088~\u0005È[\u008a¬\u000bm\u008a\u009dÿ@°xGÁÆ\\\u0007"
                     .length();
                  var1 = 23;
                  var8 = -1;
            }

            var10000 = 71;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 30299) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 211;
            case 1 -> 217;
            case 2 -> 212;
            case 3 -> 227;
            case 4 -> 79;
            case 5 -> 85;
            case 6 -> 220;
            case 7 -> 150;
            case 8 -> 126;
            case 9 -> 17;
            case 10 -> 84;
            case 11 -> 231;
            case 12 -> 242;
            case 13 -> 86;
            case 14 -> 160;
            case 15 -> 21;
            case 16 -> 62;
            case 17 -> 138;
            case 18 -> 120;
            case 19 -> 154;
            case 20 -> 56;
            case 21 -> 25;
            case 22 -> 113;
            case 23 -> 210;
            case 24 -> 12;
            case 25 -> 76;
            case 26 -> 234;
            case 27 -> 7;
            case 28 -> 205;
            case 29 -> 19;
            case 30 -> 11;
            case 31 -> 116;
            case 32 -> 58;
            case 33 -> 2;
            case 34 -> 152;
            case 35 -> 67;
            case 36 -> 145;
            case 37 -> 181;
            case 38 -> 70;
            case 39 -> 69;
            case 40 -> 49;
            case 41 -> 179;
            case 42 -> 195;
            case 43 -> 243;
            case 44 -> 16;
            case 45 -> 253;
            case 46 -> 157;
            case 47 -> 236;
            case 48 -> 9;
            case 49 -> 223;
            case 50 -> 135;
            case 51 -> 235;
            case 52 -> 153;
            case 53 -> 170;
            case 54 -> 32;
            case 55 -> 36;
            case 56 -> 91;
            case 57 -> 74;
            case 58 -> 196;
            case 59 -> 213;
            case 60 -> 134;
            case 61 -> 237;
            case 62 -> 33;
            case 63 -> 8;
            case 64 -> 172;
            case 65 -> 190;
            case 66 -> 93;
            case 67 -> 89;
            case 68 -> 221;
            case 69 -> 45;
            case 70 -> 193;
            case 71 -> 202;
            case 72 -> 40;
            case 73 -> 214;
            case 74 -> 156;
            case 75 -> 128;
            case 76 -> 41;
            case 77 -> 24;
            case 78 -> 188;
            case 79 -> 95;
            case 80 -> 39;
            case 81 -> 103;
            case 82 -> 238;
            case 83 -> 166;
            case 84 -> 81;
            case 85 -> 132;
            case 86 -> 144;
            case 87 -> 175;
            case 88 -> 30;
            case 89 -> 99;
            case 90 -> 168;
            case 91 -> 244;
            case 92 -> 241;
            case 93 -> 163;
            case 94 -> 5;
            case 95 -> 203;
            case 96 -> 224;
            case 97 -> 129;
            case 98 -> 0;
            case 99 -> 54;
            case 100 -> 139;
            case 101 -> 53;
            case 102 -> 31;
            case 103 -> 92;
            case 104 -> 61;
            case 105 -> 102;
            case 106 -> 38;
            case 107 -> 6;
            case 108 -> 77;
            case 109 -> 57;
            case 110 -> 28;
            case 111 -> 178;
            case 112 -> 149;
            case 113 -> 251;
            case 114 -> 60;
            case 115 -> 182;
            case 116 -> 48;
            case 117 -> 209;
            case 118 -> 185;
            case 119 -> 15;
            case 120 -> 167;
            case 121 -> 94;
            case 122 -> 159;
            case 123 -> 110;
            case 124 -> 111;
            case 125 -> 80;
            case 126 -> 201;
            case 127 -> 141;
            case 128 -> 71;
            case 129 -> 37;
            case 130 -> 177;
            case 131 -> 35;
            case 132 -> 130;
            case 133 -> 133;
            case 134 -> 123;
            case 135 -> 50;
            case 136 -> 14;
            case 137 -> 118;
            case 138 -> 66;
            case 139 -> 1;
            case 140 -> 96;
            case 141 -> 255;
            case 142 -> 51;
            case 143 -> 158;
            case 144 -> 100;
            case 145 -> 199;
            case 146 -> 75;
            case 147 -> 225;
            case 148 -> 165;
            case 149 -> 121;
            case 150 -> 122;
            case 151 -> 247;
            case 152 -> 151;
            case 153 -> 115;
            case 154 -> 218;
            case 155 -> 44;
            case 156 -> 207;
            case 157 -> 189;
            case 158 -> 4;
            case 159 -> 114;
            case 160 -> 109;
            case 161 -> 27;
            case 162 -> 117;
            case 163 -> 146;
            case 164 -> 200;
            case 165 -> 125;
            case 166 -> 176;
            case 167 -> 216;
            case 168 -> 55;
            case 169 -> 83;
            case 170 -> 248;
            case 171 -> 104;
            case 172 -> 162;
            case 173 -> 90;
            case 174 -> 46;
            case 175 -> 64;
            case 176 -> 142;
            case 177 -> 23;
            case 178 -> 206;
            case 179 -> 107;
            case 180 -> 52;
            case 181 -> 136;
            case 182 -> 171;
            case 183 -> 219;
            case 184 -> 191;
            case 185 -> 42;
            case 186 -> 180;
            case 187 -> 26;
            case 188 -> 222;
            case 189 -> 88;
            case 190 -> 161;
            case 191 -> 72;
            case 192 -> 143;
            case 193 -> 124;
            case 194 -> 252;
            case 195 -> 186;
            case 196 -> 13;
            case 197 -> 68;
            case 198 -> 239;
            case 199 -> 208;
            case 200 -> 246;
            case 201 -> 78;
            case 202 -> 240;
            case 203 -> 127;
            case 204 -> 119;
            case 205 -> 22;
            case 206 -> 230;
            case 207 -> 229;
            case 208 -> 183;
            case 209 -> 148;
            case 210 -> 105;
            case 211 -> 155;
            case 212 -> 187;
            case 213 -> 82;
            case 214 -> 97;
            case 215 -> 108;
            case 216 -> 43;
            case 217 -> 18;
            case 218 -> 164;
            case 219 -> 147;
            case 220 -> 59;
            case 221 -> 20;
            case 222 -> 101;
            case 223 -> 47;
            case 224 -> 173;
            case 225 -> 232;
            case 226 -> 140;
            case 227 -> 250;
            case 228 -> 29;
            case 229 -> 106;
            case 230 -> 233;
            case 231 -> 228;
            case 232 -> 63;
            case 233 -> 204;
            case 234 -> 131;
            case 235 -> 98;
            case 236 -> 215;
            case 237 -> 245;
            case 238 -> 34;
            case 239 -> 198;
            case 240 -> 184;
            case 241 -> 112;
            case 242 -> 197;
            case 243 -> 226;
            case 244 -> 87;
            case 245 -> 254;
            case 246 -> 174;
            case 247 -> 169;
            case 248 -> 10;
            case 249 -> 194;
            case 250 -> 3;
            case 251 -> 249;
            case 252 -> 65;
            case 253 -> 192;
            case 254 -> 137;
            default -> 73;
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
