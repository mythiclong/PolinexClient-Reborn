package me.octo.client;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

@lIIlllllIIIlllIIIllIIlllIllllllIIIIIlllllIIlIIIIIIIlllIlIlIIlIlllIIlIIlIIlIIlllIIlllI
public final class lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII
   implements lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII(Object... px) {
        }
        // PX-RESTORED no-arg ctor (jar <init>()V, access 0x1; javap -c -> aload_0 / invokespecial java/lang/Object.<init>:()V / return)
        public lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII() {
        }

   private static String[] a;
   private static String[] b;

   @NotNull
   @Override
   public IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI a() {
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      short var10001 = -28700;
      short var10002 = 19766;
      var10002 = -28694;
      short var10003 = 19062;
      var10000 = var10000.a("routeedit", "Open the route editor (click blocks to add/remove waypoints)");
      var10001 = -28691;
      var10002 = -21061;
      var10000 = var10000.a("editroute").b(lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII::a);
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var5 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      var10002 = -28692;
      var10003 = 29930;
      var10003 = -28690;
      short var10004 = 20967;
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var6 = var5.a(
         "cycle", "Cycle to the next target file (mine/travel) while editing"
      );
      var10002 = -28693;
      var10003 = 23771;
      var10000 = var10000.a(var6.a("next").a(lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII::b).a());
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var7 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      var10002 = -28699;
      var10003 = 29648;
      var10003 = -28689;
      var10004 = 8547;
      return var10000.a(
            var7.a("prev", "Cycle to the previous target file while editing")
               .a(lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII::c)
               .a()
         )
         .a();
   }

   private static final void b() {
      Minecraft.getInstance().setScreen(new lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl());
   }

   private static final Unit c() {
      Minecraft.getInstance().execute(lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII::b);
      return Unit.INSTANCE;
   }

   private static final Unit a(llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var0) {
      label16: {
         String[] var1 = IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.c();
         short var10001 = -28695;
         short var10002 = -12792;
         Intrinsics.checkNotNullParameter(var0, "<unused var>");
         llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII var10000 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var1 != null) {
            if (!llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()) {
               break label16;
            }

            var10000 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         }

         var10000.h();
         if (var1 != null) {
            return Unit.INSTANCE;
         }
      }

      me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(100L, lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII::c);
      return Unit.INSTANCE;
   }

   private static final Unit b(llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var0) {
      short var10001 = -28696;
      short var10002 = 2882;
      Intrinsics.checkNotNullParameter(var0, "<unused var>");
      llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(1);
      return Unit.INSTANCE;
   }

   private static final Unit c(llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var0) {
      short var10001 = -28695;
      short var10002 = -12792;
      Intrinsics.checkNotNullParameter(var0, "<unused var>");
      llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(-1);
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[10];
      int var3 = 0;
      String var2 = "Z\u001eÍA\u001b´F\u0090X\u0005\u0091nxéñ/`ãbX²Ã\u0087Ã\u0004¨Ò\u001e\u0016\u0016d÷à@_0v\r\u0089Â§æ¤O\u008d[Ú³î¾\u000fk?BØ\u001d¾\u008f\u0087CûâÈ9z\u0091!\u0016Ú\n\u008aú¥\u008fæú\u0090\u0094£gï¥çø\u0018Åtay$k.¼*P\u0012Úå\u0016ÀQ\u0086¯\u000eÔy\u008aÀ\fJåIñ\u0018¼e)¤\u0001ló\fÑ\u00adÉ\u0005}\u0017ºûç\u001c(d\f4ÏuIê\u009eHÊ¹:ã \u0004§T\t)<\u00019Å)Åû\u0098\u0010x\u009fZ.´\u0017¼`ñ²6t\"Ü~ú\u0090\u00ad\u0099öì\u0094óÍhY\u001dýäÒX-Bà\u007f¨fZþôTö\u001a½½\u001e\u0087¸ì\tkì";
      int var4 = "Z\u001eÍA\u001b´F\u0090X\u0005\u0091nxéñ/`ãbX²Ã\u0087Ã\u0004¨Ò\u001e\u0016\u0016d÷à@_0v\r\u0089Â§æ¤O\u008d[Ú³î¾\u000fk?BØ\u001d¾\u008f\u0087CûâÈ9z\u0091!\u0016Ú\n\u008aú¥\u008fæú\u0090\u0094£gï¥çø\u0018Åtay$k.¼*P\u0012Úå\u0016ÀQ\u0086¯\u000eÔy\u008aÀ\fJåIñ\u0018¼e)¤\u0001ló\fÑ\u00adÉ\u0005}\u0017ºûç\u001c(d\f4ÏuIê\u009eHÊ¹:ã \u0004§T\t)<\u00019Å)Åû\u0098\u0010x\u009fZ.´\u0017¼`ñ²6t\"Ü~ú\u0090\u00ad\u0099öì\u0094óÍhY\u001dýäÒX-Bà\u007f¨fZþôTö\u001a½½\u001e\u0087¸ì\tkì"
         .length();
      char var1 = '\t';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 86;
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
                     case 1 -> 53;
                     case 2 -> 115;
                     case 3 -> 36;
                     case 4 -> 102;
                     case 5 -> 17;
                     default -> 60;
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
                     b = new String[10];
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "\u008cVÒà\t@\r\u00197w\u000eQïæ";
                  var4 = "\u008cVÒà\t@\r\u00197w\u000eQïæ".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 38;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -28691) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 39;
            case 1 -> 193;
            case 2 -> 239;
            case 3 -> 166;
            case 4 -> 186;
            case 5 -> 219;
            case 6 -> 246;
            case 7 -> 150;
            case 8 -> 207;
            case 9 -> 66;
            case 10 -> 95;
            case 11 -> 7;
            case 12 -> 147;
            case 13 -> 130;
            case 14 -> 34;
            case 15 -> 74;
            case 16 -> 72;
            case 17 -> 217;
            case 18 -> 235;
            case 19 -> 129;
            case 20 -> 89;
            case 21 -> 200;
            case 22 -> 33;
            case 23 -> 62;
            case 24 -> 168;
            case 25 -> 32;
            case 26 -> 132;
            case 27 -> 163;
            case 28 -> 22;
            case 29 -> 42;
            case 30 -> 127;
            case 31 -> 46;
            case 32 -> 44;
            case 33 -> 103;
            case 34 -> 208;
            case 35 -> 8;
            case 36 -> 90;
            case 37 -> 139;
            case 38 -> 195;
            case 39 -> 12;
            case 40 -> 220;
            case 41 -> 153;
            case 42 -> 156;
            case 43 -> 247;
            case 44 -> 50;
            case 45 -> 169;
            case 46 -> 205;
            case 47 -> 43;
            case 48 -> 141;
            case 49 -> 210;
            case 50 -> 76;
            case 51 -> 23;
            case 52 -> 121;
            case 53 -> 125;
            case 54 -> 120;
            case 55 -> 248;
            case 56 -> 73;
            case 57 -> 105;
            case 58 -> 58;
            case 59 -> 24;
            case 60 -> 213;
            case 61 -> 114;
            case 62 -> 41;
            case 63 -> 13;
            case 64 -> 97;
            case 65 -> 199;
            case 66 -> 148;
            case 67 -> 252;
            case 68 -> 204;
            case 69 -> 36;
            case 70 -> 78;
            case 71 -> 160;
            case 72 -> 63;
            case 73 -> 173;
            case 74 -> 91;
            case 75 -> 136;
            case 76 -> 159;
            case 77 -> 133;
            case 78 -> 196;
            case 79 -> 135;
            case 80 -> 176;
            case 81 -> 9;
            case 82 -> 117;
            case 83 -> 31;
            case 84 -> 183;
            case 85 -> 17;
            case 86 -> 241;
            case 87 -> 96;
            case 88 -> 47;
            case 89 -> 11;
            case 90 -> 38;
            case 91 -> 68;
            case 92 -> 177;
            case 93 -> 206;
            case 94 -> 202;
            case 95 -> 81;
            case 96 -> 167;
            case 97 -> 145;
            case 98 -> 198;
            case 99 -> 88;
            case 100 -> 4;
            case 101 -> 182;
            case 102 -> 86;
            case 103 -> 94;
            case 104 -> 102;
            case 105 -> 128;
            case 106 -> 221;
            case 107 -> 87;
            case 108 -> 236;
            case 109 -> 99;
            case 110 -> 126;
            case 111 -> 137;
            case 112 -> 48;
            case 113 -> 227;
            case 114 -> 124;
            case 115 -> 158;
            case 116 -> 201;
            case 117 -> 214;
            case 118 -> 64;
            case 119 -> 110;
            case 120 -> 40;
            case 121 -> 108;
            case 122 -> 98;
            case 123 -> 29;
            case 124 -> 187;
            case 125 -> 92;
            case 126 -> 77;
            case 127 -> 119;
            case 128 -> 189;
            case 129 -> 61;
            case 130 -> 35;
            case 131 -> 152;
            case 132 -> 3;
            case 133 -> 112;
            case 134 -> 20;
            case 135 -> 106;
            case 136 -> 54;
            case 137 -> 0;
            case 138 -> 251;
            case 139 -> 223;
            case 140 -> 134;
            case 141 -> 14;
            case 142 -> 175;
            case 143 -> 154;
            case 144 -> 211;
            case 145 -> 185;
            case 146 -> 56;
            case 147 -> 101;
            case 148 -> 122;
            case 149 -> 113;
            case 150 -> 55;
            case 151 -> 5;
            case 152 -> 104;
            case 153 -> 2;
            case 154 -> 170;
            case 155 -> 142;
            case 156 -> 188;
            case 157 -> 16;
            case 158 -> 222;
            case 159 -> 225;
            case 160 -> 144;
            case 161 -> 215;
            case 162 -> 171;
            case 163 -> 161;
            case 164 -> 111;
            case 165 -> 116;
            case 166 -> 140;
            case 167 -> 25;
            case 168 -> 250;
            case 169 -> 69;
            case 170 -> 70;
            case 171 -> 82;
            case 172 -> 242;
            case 173 -> 244;
            case 174 -> 184;
            case 175 -> 218;
            case 176 -> 107;
            case 177 -> 243;
            case 178 -> 52;
            case 179 -> 138;
            case 180 -> 115;
            case 181 -> 229;
            case 182 -> 53;
            case 183 -> 27;
            case 184 -> 155;
            case 185 -> 123;
            case 186 -> 197;
            case 187 -> 37;
            case 188 -> 109;
            case 189 -> 157;
            case 190 -> 209;
            case 191 -> 10;
            case 192 -> 180;
            case 193 -> 232;
            case 194 -> 164;
            case 195 -> 15;
            case 196 -> 118;
            case 197 -> 203;
            case 198 -> 51;
            case 199 -> 230;
            case 200 -> 151;
            case 201 -> 19;
            case 202 -> 83;
            case 203 -> 59;
            case 204 -> 6;
            case 205 -> 254;
            case 206 -> 18;
            case 207 -> 93;
            case 208 -> 238;
            case 209 -> 1;
            case 210 -> 194;
            case 211 -> 237;
            case 212 -> 172;
            case 213 -> 181;
            case 214 -> 190;
            case 215 -> 100;
            case 216 -> 231;
            case 217 -> 65;
            case 218 -> 233;
            case 219 -> 85;
            case 220 -> 57;
            case 221 -> 178;
            case 222 -> 179;
            case 223 -> 28;
            case 224 -> 240;
            case 225 -> 228;
            case 226 -> 67;
            case 227 -> 30;
            case 228 -> 60;
            case 229 -> 245;
            case 230 -> 84;
            case 231 -> 255;
            case 232 -> 174;
            case 233 -> 212;
            case 234 -> 165;
            case 235 -> 191;
            case 236 -> 131;
            case 237 -> 45;
            case 238 -> 224;
            case 239 -> 146;
            case 240 -> 226;
            case 241 -> 143;
            case 242 -> 49;
            case 243 -> 249;
            case 244 -> 80;
            case 245 -> 234;
            case 246 -> 253;
            case 247 -> 71;
            case 248 -> 26;
            case 249 -> 149;
            case 250 -> 216;
            case 251 -> 79;
            case 252 -> 75;
            case 253 -> 192;
            case 254 -> 21;
            default -> 162;
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
