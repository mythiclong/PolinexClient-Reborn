package me.octo.client.utils;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII<T> {

// PX-DEDUP removed duplicate ovld: public static <T> T a(HashMap<String,Object> p0) { return null; } // PX-FIX ovld

        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII(Object... px) {
           this((Function0<? extends T>)null, (Function1<? super T, Unit>)null); // PX-FIX: 委托主构造器（final 字段初始化）
        }

   @NotNull
   private final Function0<T> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final Function1<T, Unit> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final ObjectArrayList<T> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static String IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static String[] a;
   private static String[] b;

   @JvmOverloads
   public lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII(
      @NotNull Function0<? extends T> var1, @NotNull Function1<? super T, Unit> var2
   ) {
      short var10001 = 14408;
      short var10002 = -19161;
      Intrinsics.checkNotNullParameter(var1, "initializer");
      var10001 = 14410;
      var10002 = -27014;
      Intrinsics.checkNotNullParameter(var2, "finalizer");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = ((Function0<T>)(Object)(var1));
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = ((Function1<T,Unit>)(Object)(var2));
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new ObjectArrayList();
   }

   // $VF: Extended synchronized range to monitorexit
   @NotNull
   public final T a() {
      String var1 = d();
      lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII var10000 = this;
      if (var1 == null) {
         if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
            synchronized (this) {
               boolean var3 = false;
               return this.c();
            }
         }

         var10000 = this;
      }

      return (T)var10000.c();
   }

   // $VF: Extended synchronized range to monitorexit
   public final void a(@NotNull T var1) {
      String var10000 = d();
      short var10002 = 14411;
      short var10003 = -21196;
      Intrinsics.checkNotNullParameter(var1, "item");
      String var2 = var10000;
      lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII var8 = this;
      if (var2 == null) {
         if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
            synchronized (this) {
               boolean var4 = false;
               this.b((T)var1);
               Unit var7 = Unit.INSTANCE;
               return;
            }
         }

         var8 = this;
      }

      var8.b(var1);
   }

   // $VF: Extended synchronized range to monitorexit
   public final void a(@NotNull Iterable<? extends T> var1) {
      String var2 = d();
      Iterable var10000 = var1;
      if (var2 == null) {
         short var10001 = 14415;
         short var10002 = -10861;
         Intrinsics.checkNotNullParameter(var1, "items");
         if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
            synchronized (this) {
               boolean var12 = false;
               boolean var14 = false;

               for (Object var15 : var1) {
                  boolean var10 = false;
                  this.b((T)var15);
                  if (var2 != null) {
                     break;
                  }

                  if (var2 != null) {
                     lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
                        new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[4]
                     );
                     break;
                  }
               }

               Unit var13 = Unit.INSTANCE;
               return;
            }
         }

         var10000 = var1;
      }

      Iterable var3 = var10000;
      boolean var4 = false;

      for (Object var6 : var3) {
         boolean var8 = false;
         this.b((T)var6);
         if (var2 != null || var2 != null) {
            break;
         }
      }
   }

   @NotNull
   public final lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII<T> b() {
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = true;
      return this;
   }

   private final T c() {
      String var1 = d();
      Object var10000 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      if (var1 == null) {
         if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.isEmpty()) {
            return (T)this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.invoke();
         }

         var10000 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            .remove(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.size() - 1);
      }

      short var10002 = 14412;
      short var10003 = 19535;
      Intrinsics.checkNotNullExpressionValue(var10000, "removeAt(...)");
      return (T)var10000;
   }

   private final void b(T var1) {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.invoke(var1);
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.add(var1);
   }

   @JvmOverloads
   public lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII(@NotNull Function0<? extends T> var1) {
      short var10001 = 14409;
      short var10002 = -6215;
      Intrinsics.checkNotNullParameter(var1, "initializer");
      this(var1, null, 2, null);
   }

   private static final Unit c(Object var0) {
      short var10001 = 14413;
      short var10002 = -3059;
      Intrinsics.checkNotNullParameter(var0, "it");
      return Unit.INSTANCE;
   }

   public static void b(String var0) {
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var0;
   }

   public static String d() {
      return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
       char[] var20 = null; // PX-FIX decl var20
   pxClinit: { // PX-FIX
      String[] var5 = new String[7];
      int var3 = 0;
      String var2 = "\r\u0007u\u007f[úrè3Åi\u000b'\u00810¯óàg«\u0091\u00ad=\u0004*ñ\u009dá\t{ÇR\u0095]\u0018\u0001±\u0081\u0002Õî";
      int var4 = "\r\u0007u\u007f[úrè3Åi\u000b'\u00810¯óàg«\u0091\u00ad=\u0004*ñ\u009dá\t{ÇR\u0095]\u0018\u0001±\u0081\u0002Õî".length();
      b((String)null);
      char var1 = 11;
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
                     case 0 -> 34;
                     case 1 -> 125;
                     case 2 -> 66;
                     case 3 -> 24;
                     case 4 -> 111;
                     case 5 -> 114;
                     default -> 35;
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
                     b = new String[7];
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

                  var2 = "¯\u009az\u009a\u0006\u001d/ªe_ÀÑs\u0005]]TSÏ";
                  var4 = "¯\u009az\u009a\u0006\u001d/ªe_ÀÑs\u0005]]TSÏ".length();
                  var1 = '\r';
                  var8 = -1;
            }

            var10000 = 63;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 14409) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 134;
            case 1 -> 130;
            case 2 -> 131;
            case 3 -> 168;
            case 4 -> 21;
            case 5 -> 236;
            case 6 -> 198;
            case 7 -> 171;
            case 8 -> 150;
            case 9 -> 10;
            case 10 -> 246;
            case 11 -> 26;
            case 12 -> 16;
            case 13 -> 111;
            case 14 -> 195;
            case 15 -> 62;
            case 16 -> 132;
            case 17 -> 196;
            case 18 -> 176;
            case 19 -> 175;
            case 20 -> 158;
            case 21 -> 216;
            case 22 -> 211;
            case 23 -> 230;
            case 24 -> 250;
            case 25 -> 156;
            case 26 -> 179;
            case 27 -> 7;
            case 28 -> 219;
            case 29 -> 92;
            case 30 -> 67;
            case 31 -> 51;
            case 32 -> 112;
            case 33 -> 185;
            case 34 -> 251;
            case 35 -> 99;
            case 36 -> 118;
            case 37 -> 162;
            case 38 -> 243;
            case 39 -> 147;
            case 40 -> 169;
            case 41 -> 88;
            case 42 -> 17;
            case 43 -> 1;
            case 44 -> 202;
            case 45 -> 187;
            case 46 -> 12;
            case 47 -> 86;
            case 48 -> 55;
            case 49 -> 140;
            case 50 -> 115;
            case 51 -> 32;
            case 52 -> 244;
            case 53 -> 31;
            case 54 -> 206;
            case 55 -> 93;
            case 56 -> 73;
            case 57 -> 186;
            case 58 -> 113;
            case 59 -> 74;
            case 60 -> 14;
            case 61 -> 83;
            case 62 -> 210;
            case 63 -> 23;
            case 64 -> 106;
            case 65 -> 197;
            case 66 -> 213;
            case 67 -> 204;
            case 68 -> 84;
            case 69 -> 217;
            case 70 -> 87;
            case 71 -> 70;
            case 72 -> 201;
            case 73 -> 6;
            case 74 -> 174;
            case 75 -> 142;
            case 76 -> 189;
            case 77 -> 255;
            case 78 -> 237;
            case 79 -> 27;
            case 80 -> 238;
            case 81 -> 96;
            case 82 -> 190;
            case 83 -> 68;
            case 84 -> 119;
            case 85 -> 33;
            case 86 -> 159;
            case 87 -> 191;
            case 88 -> 56;
            case 89 -> 234;
            case 90 -> 28;
            case 91 -> 233;
            case 92 -> 11;
            case 93 -> 0;
            case 94 -> 64;
            case 95 -> 228;
            case 96 -> 30;
            case 97 -> 104;
            case 98 -> 167;
            case 99 -> 226;
            case 100 -> 199;
            case 101 -> 117;
            case 102 -> 20;
            case 103 -> 49;
            case 104 -> 184;
            case 105 -> 212;
            case 106 -> 77;
            case 107 -> 15;
            case 108 -> 97;
            case 109 -> 76;
            case 110 -> 126;
            case 111 -> 183;
            case 112 -> 129;
            case 113 -> 25;
            case 114 -> 181;
            case 115 -> 38;
            case 116 -> 89;
            case 117 -> 141;
            case 118 -> 121;
            case 119 -> 227;
            case 120 -> 253;
            case 121 -> 163;
            case 122 -> 166;
            case 123 -> 107;
            case 124 -> 155;
            case 125 -> 19;
            case 126 -> 223;
            case 127 -> 35;
            case 128 -> 24;
            case 129 -> 78;
            case 130 -> 153;
            case 131 -> 90;
            case 132 -> 161;
            case 133 -> 124;
            case 134 -> 193;
            case 135 -> 177;
            case 136 -> 138;
            case 137 -> 182;
            case 138 -> 239;
            case 139 -> 102;
            case 140 -> 81;
            case 141 -> 4;
            case 142 -> 235;
            case 143 -> 100;
            case 144 -> 207;
            case 145 -> 82;
            case 146 -> 44;
            case 147 -> 120;
            case 148 -> 110;
            case 149 -> 91;
            case 150 -> 114;
            case 151 -> 59;
            case 152 -> 2;
            case 153 -> 249;
            case 154 -> 154;
            case 155 -> 127;
            case 156 -> 72;
            case 157 -> 252;
            case 158 -> 42;
            case 159 -> 205;
            case 160 -> 232;
            case 161 -> 137;
            case 162 -> 66;
            case 163 -> 75;
            case 164 -> 248;
            case 165 -> 135;
            case 166 -> 85;
            case 167 -> 209;
            case 168 -> 36;
            case 169 -> 58;
            case 170 -> 60;
            case 171 -> 103;
            case 172 -> 220;
            case 173 -> 63;
            case 174 -> 3;
            case 175 -> 164;
            case 176 -> 29;
            case 177 -> 214;
            case 178 -> 143;
            case 179 -> 52;
            case 180 -> 71;
            case 181 -> 57;
            case 182 -> 47;
            case 183 -> 39;
            case 184 -> 245;
            case 185 -> 53;
            case 186 -> 145;
            case 187 -> 61;
            case 188 -> 180;
            case 189 -> 125;
            case 190 -> 146;
            case 191 -> 79;
            case 192 -> 105;
            case 193 -> 254;
            case 194 -> 157;
            case 195 -> 229;
            case 196 -> 148;
            case 197 -> 151;
            case 198 -> 242;
            case 199 -> 5;
            case 200 -> 108;
            case 201 -> 136;
            case 202 -> 208;
            case 203 -> 46;
            case 204 -> 231;
            case 205 -> 240;
            case 206 -> 13;
            case 207 -> 94;
            case 208 -> 194;
            case 209 -> 101;
            case 210 -> 224;
            case 211 -> 160;
            case 212 -> 128;
            case 213 -> 69;
            case 214 -> 225;
            case 215 -> 172;
            case 216 -> 247;
            case 217 -> 122;
            case 218 -> 65;
            case 219 -> 18;
            case 220 -> 34;
            case 221 -> 200;
            case 222 -> 149;
            case 223 -> 173;
            case 224 -> 144;
            case 225 -> 40;
            case 226 -> 221;
            case 227 -> 95;
            case 228 -> 43;
            case 229 -> 41;
            case 230 -> 170;
            case 231 -> 215;
            case 232 -> 54;
            case 233 -> 45;
            case 234 -> 8;
            case 235 -> 218;
            case 236 -> 152;
            case 237 -> 48;
            case 238 -> 192;
            case 239 -> 133;
            case 240 -> 22;
            case 241 -> 123;
            case 242 -> 98;
            case 243 -> 80;
            case 244 -> 222;
            case 245 -> 9;
            case 246 -> 188;
            case 247 -> 37;
            case 248 -> 241;
            case 249 -> 116;
            case 250 -> 178;
            case 251 -> 109;
            case 252 -> 203;
            case 253 -> 139;
            case 254 -> 165;
            default -> 50;
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
    public lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII(kotlin.jvm.functions.Function0 var0, kotlin.jvm.functions.Function1 var1, int var2, kotlin.jvm.internal.DefaultConstructorMarker var3) { this(var0, (var2 & 2) != 0 ? null : var1); }
    // UNSUP default@3
}
