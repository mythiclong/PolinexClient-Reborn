package me.octo.client.utils;

import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import kotlin.io.ByteStreamsKt;
import java.io.File;
import java.nio.file.Files;
import org.lwjgl.system.MemoryUtil;

public final class llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII {
    public static <T> T listFiles(Object... args) { return null; } // PX-FIX ovld-var
   @NotNull
   public static llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private InputStream lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @Nullable
   private ByteBuffer IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static String[] a;
   private static String[] b;

   public llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII(
      @NotNull String var1, boolean var2, @NotNull InputStream var3, @Nullable ByteBuffer var4
   ) {
      short var10001 = -9936;
      short var10002 = 6653;
      Intrinsics.checkNotNullParameter(var1, "identifier");
      var10001 = -9926;
      var10002 = 2578;
      Intrinsics.checkNotNullParameter(var3, "stream");
      super();
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var2;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var3;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var4;
      var10002 = -9929;
      short var10003 = -26576;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = StringsKt.endsWith(
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, ".svg", true
      );
   }

   public llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII(
      String var0, boolean var1, java.io.InputStream var2, java.nio.ByteBuffer var3, int var4, kotlin.jvm.internal.DefaultConstructorMarker var5
   ) {
      if ((var4 & 2) != 0) {
         var1 = false;
      }

      if ((var4 & 4) != 0) {
         var2 = llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a(llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, var0);
      }

      if ((var4 & 8) != 0) {
         var3 = null;
      }

      this(var0, var1, var2, var3);
   }

   @NotNull
   public final String a() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final boolean b() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final void a(boolean var1) {
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
   }

   @NotNull
   public final InputStream c() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   public final void a(@NotNull InputStream var1) {
      short var10001 = -9935;
      short var10002 = 1733;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var1;
   }

   @NotNull
   public final ByteBuffer d() {
      String var1 = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.j();
      if (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII == null) {
         boolean var2 = StringsKt.contains((CharSequence)this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, (CharSequence)"avatar.png", false);
         byte[] var3 = ByteStreamsKt.readBytes(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         if (var2) {
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("[PFP] Image.buffer() read " + var3.length + " bytes for " + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         }

         ByteBuffer var4 = MemoryUtil.memAlloc(var3.length).put(var3).flip();
         Intrinsics.checkNotNull(var4, "null cannot be cast to non-null type java.nio.ByteBuffer");
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var4;
         try {
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.close();
         } catch (java.io.IOException var6) {
         }
      }

      ByteBuffer var5 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      if (var5 == null) {
         throw new IllegalStateException("Image has no data");
      }
      return var5;
   }

   @Override
   public boolean equals(@Nullable Object param1) {
        boolean bl;
        block10: {
            block11: {
                Object object2;
                String string;
                block8: {
                    block9: {
                        string = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.j();
                        try {
                            try {
                                object2 = this;
                                if (string == null) break block8;
                                if (object2 != param1) break block9;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.a(illegalStateException);
                            }
                            return true;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.a(illegalStateException);
                        }
                    }
                    object2 = param1;
                }
                try {
                    try {
                        bl = object2 instanceof llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII;
                        if (string == null) break block10;
                        if (bl) break block11;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.a(illegalStateException);
                    }
                    return false;
                }
                catch (IllegalStateException illegalStateException) {
                    throw llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.a(illegalStateException);
                }
            }
            bl = Intrinsics.areEqual((Object)this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, (Object)((llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII)param1).lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
        }
        return bl;
   }

   @Override
   public int hashCode() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[9];
      int var3 = 0;
      String var2 = "oÕk\u0002\u001fÃ\u00036\u009d\u0091)6w\u0007¡¡\u000b^!'v\u009ds\u001eq\u000f\u0011Â\u0095©§¼¦i\u0096ÇO9\u0003]Ùé[á\n¡\u009aåg ß×ÑÉü\u0007§{Ú´\u001eª*8\u0086`ï\t\u009dZ©-ê\u009980f\u0018ÅU\rd9HöEø´æú\u008aÍ«\u008a2\"rà\u009b(ÑVÍ:l\u008e©¯\t-@Î)íañò\"hÃ\u0004\u0088\u007f|'\n³PªtØÿ'´\u009d\u007f";
      int var4 = "oÕk\u0002\u001fÃ\u00036\u009d\u0091)6w\u0007¡¡\u000b^!'v\u009ds\u001eq\u000f\u0011Â\u0095©§¼¦i\u0096ÇO9\u0003]Ùé[á\n¡\u009aåg ß×ÑÉü\u0007§{Ú´\u001eª*8\u0086`ï\t\u009dZ©-ê\u009980f\u0018ÅU\rd9HöEø´æú\u008aÍ«\u008a2\"rà\u009b(ÑVÍ:l\u008e©¯\t-@Î)íañò\"hÃ\u0004\u0088\u007f|'\n³PªtØÿ'´\u009d\u007f"
         .length();
      char var1 = 26;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 3;
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
                     case 0 -> 110;
                     case 1 -> 60;
                     case 2 -> 94;
                     case 3 -> 86;
                     case 4 -> 9;
                     case 5 -> 80;
                     default -> 29;
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
                     b = new String[9];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
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

                  var2 = "'ù=£Apê\u0006\u009e\u009c·\u0006\u0080Ýûâ÷u";
                  var4 = "'ù=£Apê\u0006\u009e\u009c·\u0006\u0080Ýûâ÷u".length();
                  var1 = 11;
                  var8 = -1;
            }

            var10000 = 49;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static IllegalStateException a(IllegalStateException var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -9934) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 92;
            case 1 -> 202;
            case 2 -> 109;
            case 3 -> 31;
            case 4 -> 215;
            case 5 -> 53;
            case 6 -> 57;
            case 7 -> 66;
            case 8 -> 19;
            case 9 -> 163;
            case 10 -> 239;
            case 11 -> 230;
            case 12 -> 40;
            case 13 -> 105;
            case 14 -> 14;
            case 15 -> 241;
            case 16 -> 68;
            case 17 -> 38;
            case 18 -> 127;
            case 19 -> 80;
            case 20 -> 111;
            case 21 -> 153;
            case 22 -> 223;
            case 23 -> 17;
            case 24 -> 112;
            case 25 -> 216;
            case 26 -> 157;
            case 27 -> 28;
            case 28 -> 253;
            case 29 -> 52;
            case 30 -> 0;
            case 31 -> 78;
            case 32 -> 128;
            case 33 -> 3;
            case 34 -> 49;
            case 35 -> 47;
            case 36 -> 243;
            case 37 -> 146;
            case 38 -> 208;
            case 39 -> 233;
            case 40 -> 173;
            case 41 -> 84;
            case 42 -> 172;
            case 43 -> 73;
            case 44 -> 115;
            case 45 -> 185;
            case 46 -> 200;
            case 47 -> 20;
            case 48 -> 177;
            case 49 -> 232;
            case 50 -> 106;
            case 51 -> 162;
            case 52 -> 142;
            case 53 -> 250;
            case 54 -> 197;
            case 55 -> 107;
            case 56 -> 141;
            case 57 -> 217;
            case 58 -> 201;
            case 59 -> 218;
            case 60 -> 34;
            case 61 -> 148;
            case 62 -> 96;
            case 63 -> 209;
            case 64 -> 129;
            case 65 -> 178;
            case 66 -> 91;
            case 67 -> 120;
            case 68 -> 204;
            case 69 -> 23;
            case 70 -> 86;
            case 71 -> 37;
            case 72 -> 121;
            case 73 -> 63;
            case 74 -> 11;
            case 75 -> 69;
            case 76 -> 95;
            case 77 -> 1;
            case 78 -> 8;
            case 79 -> 62;
            case 80 -> 155;
            case 81 -> 131;
            case 82 -> 198;
            case 83 -> 254;
            case 84 -> 205;
            case 85 -> 72;
            case 86 -> 238;
            case 87 -> 110;
            case 88 -> 24;
            case 89 -> 193;
            case 90 -> 182;
            case 91 -> 234;
            case 92 -> 229;
            case 93 -> 4;
            case 94 -> 168;
            case 95 -> 123;
            case 96 -> 240;
            case 97 -> 149;
            case 98 -> 74;
            case 99 -> 152;
            case 100 -> 6;
            case 101 -> 176;
            case 102 -> 124;
            case 103 -> 134;
            case 104 -> 225;
            case 105 -> 188;
            case 106 -> 166;
            case 107 -> 7;
            case 108 -> 81;
            case 109 -> 203;
            case 110 -> 160;
            case 111 -> 227;
            case 112 -> 246;
            case 113 -> 189;
            case 114 -> 60;
            case 115 -> 180;
            case 116 -> 145;
            case 117 -> 151;
            case 118 -> 89;
            case 119 -> 99;
            case 120 -> 187;
            case 121 -> 117;
            case 122 -> 165;
            case 123 -> 75;
            case 124 -> 139;
            case 125 -> 144;
            case 126 -> 186;
            case 127 -> 248;
            case 128 -> 212;
            case 129 -> 181;
            case 130 -> 56;
            case 131 -> 32;
            case 132 -> 169;
            case 133 -> 43;
            case 134 -> 61;
            case 135 -> 222;
            case 136 -> 245;
            case 137 -> 184;
            case 138 -> 76;
            case 139 -> 67;
            case 140 -> 150;
            case 141 -> 58;
            case 142 -> 22;
            case 143 -> 30;
            case 144 -> 39;
            case 145 -> 214;
            case 146 -> 255;
            case 147 -> 161;
            case 148 -> 236;
            case 149 -> 211;
            case 150 -> 170;
            case 151 -> 15;
            case 152 -> 147;
            case 153 -> 12;
            case 154 -> 46;
            case 155 -> 64;
            case 156 -> 100;
            case 157 -> 25;
            case 158 -> 136;
            case 159 -> 29;
            case 160 -> 130;
            case 161 -> 54;
            case 162 -> 113;
            case 163 -> 251;
            case 164 -> 135;
            case 165 -> 183;
            case 166 -> 196;
            case 167 -> 210;
            case 168 -> 9;
            case 169 -> 94;
            case 170 -> 226;
            case 171 -> 219;
            case 172 -> 194;
            case 173 -> 85;
            case 174 -> 10;
            case 175 -> 221;
            case 176 -> 125;
            case 177 -> 140;
            case 178 -> 206;
            case 179 -> 79;
            case 180 -> 199;
            case 181 -> 98;
            case 182 -> 132;
            case 183 -> 138;
            case 184 -> 174;
            case 185 -> 104;
            case 186 -> 59;
            case 187 -> 114;
            case 188 -> 122;
            case 189 -> 65;
            case 190 -> 195;
            case 191 -> 143;
            case 192 -> 93;
            case 193 -> 249;
            case 194 -> 175;
            case 195 -> 77;
            case 196 -> 48;
            case 197 -> 159;
            case 198 -> 16;
            case 199 -> 108;
            case 200 -> 83;
            case 201 -> 35;
            case 202 -> 207;
            case 203 -> 247;
            case 204 -> 88;
            case 205 -> 45;
            case 206 -> 41;
            case 207 -> 116;
            case 208 -> 167;
            case 209 -> 158;
            case 210 -> 235;
            case 211 -> 192;
            case 212 -> 97;
            case 213 -> 27;
            case 214 -> 137;
            case 215 -> 70;
            case 216 -> 126;
            case 217 -> 36;
            case 218 -> 213;
            case 219 -> 237;
            case 220 -> 179;
            case 221 -> 220;
            case 222 -> 87;
            case 223 -> 102;
            case 224 -> 133;
            case 225 -> 231;
            case 226 -> 33;
            case 227 -> 44;
            case 228 -> 119;
            case 229 -> 101;
            case 230 -> 252;
            case 231 -> 242;
            case 232 -> 2;
            case 233 -> 51;
            case 234 -> 224;
            case 235 -> 164;
            case 236 -> 90;
            case 237 -> 191;
            case 238 -> 26;
            case 239 -> 190;
            case 240 -> 103;
            case 241 -> 21;
            case 242 -> 156;
            case 243 -> 154;
            case 244 -> 13;
            case 245 -> 71;
            case 246 -> 5;
            case 247 -> 171;
            case 248 -> 82;
            case 249 -> 42;
            case 250 -> 50;
            case 251 -> 228;
            case 252 -> 244;
            case 253 -> 18;
            case 254 -> 55;
            default -> 118;
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      public static final java.io.InputStream a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0, String var1) { return var0.a(var1); }

        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

      private static String[] a;
      private static String[] b;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      private final InputStream a(String param1) {
      String var2;
      String var3 = ((Object)StringsKt.trim((CharSequence)param1)).toString();
      var2 = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.j();
      boolean var4 = StringsKt.contains((CharSequence)var3, (CharSequence)"avatar.png", false);
      boolean var11 = StringsKt.startsWith(var3, "http", false);
      if (var2 == null || var11) {
         if (var2 == null ? var11 : var4) {
            String var12 = "[PFP] Image.getStream: http branch for ";
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d(var12 + var3);
         }

         return IlllIIIlIlIIIIIIlIllIIlllllIIllIlIllIlllIIllllIlIllIIlllIIlIIlIIIIIIIllIlIlllIlIIlIII.a(var3, 0, false, 6, (Object)null);
      }

      File var5 = new File(var3);
      boolean var13 = var5.exists();
      boolean var14 = var5.isFile();
      if (var2 != null && var13 && var14) {
         if (var4) {
            String var15 = "[PFP] Image.getStream: local file branch, size=";
            long var16 = var5.length();
            String var17 = " for ";
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d(var15 + var16 + var17 + var3);
         }

         try {
            InputStream var18 = java.nio.file.Files.newInputStream(var5.toPath(), new java.nio.file.OpenOption[0]);
            Intrinsics.checkNotNullExpressionValue((Object)var18, "newInputStream(...)");
            return var18;
         } catch (java.io.IOException var19) {
            throw new RuntimeException(var19);
         }
      }

      if (var4 && var2 != null) {
         boolean var20 = var5.exists();
         boolean var21 = var5.isFile();
         String var22 = var3;
         String var23 = "[PFP] Image.getStream: avatar.png path didn't resolve to http or existing file:";
         String var24 = " (exists=";
         String var25 = ", isFile=";
         String var26 = ")";
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d(var23 + var22 + var24 + var20 + var25 + var21 + var26);
      }

      boolean var27 = var2 == null ? var13 : StringsKt.startsWith(var3, "/assets/", false);
      if (var27) {
         String var6 = StringsKt.removePrefix(var3, (CharSequence)"/assets/");
         int var7 = StringsKt.indexOf((CharSequence)var6, '/', 0, false);
         if (var7 > 0) {
            try {
               String var8 = var6.substring(0, var7);
               Intrinsics.checkNotNullExpressionValue((Object)var8, "substring(...)");
               String var9 = var6.substring(var7 + 1);
               Intrinsics.checkNotNullExpressionValue((Object)var9, "substring(...)");
               InputStream var10 = lIlIlIlIIIlIIIIIllIlIIIIllllIIIlllIIlllIllIlllllIIIllIIlllIllIlIlllIllIlIIlIIllllIlll.a(var8, var9);
               Intrinsics.checkNotNullExpressionValue((Object)var10, "get(...)");
               return var10;
            } catch (Throwable var28) {
            }
         }
      }

      InputStream var29 = this.getClass().getResourceAsStream(var3);
      if (var29 == null) {
         throw new RuntimeException(new java.io.FileNotFoundException(var3));
      }

      return var29;
         // $VF: Couldn't be decompiled
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         // java.lang.RuntimeException: parsing failure!
         //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
         //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
         //
         // Bytecode:
         // 000: aload 1
         // 001: checkcast java/lang/CharSequence
         // 004: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
         // 007: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
         // 00a: astore 3
         // 00b: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.j ()Ljava/lang/String;
         // 00e: aload 3
         // 00f: checkcast java/lang/CharSequence
         // 012: sipush 2560
         // 015: sipush -20910
         // 018: pop2
         // 019: ldc "avatar.png"
         // 01b: checkcast java/lang/CharSequence
         // 01e: bipush 0
         // 01f: bipush 2
         // 020: aconst_null
         // 021: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
         // 024: istore 4
         // 026: astore 2
         // 027: aload 3
         // 028: sipush 2574
         // 02b: sipush 9087
         // 02e: pop2
         // 02f: ldc "http"
         // 031: bipush 0
         // 032: bipush 2
         // 033: aconst_null
         // 034: invokestatic kotlin/text/StringsKt.startsWith$default (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
         // 037: aload 2
         // 038: ifnull 047
         // 03b: ifeq 06e
         // 03e: goto 045
         // 041: invokestatic me/octo/client/utils/llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
         // 044: athrow
         // 045: iload 4
         // 047: ifeq 064
         // 04a: aload 3
         // 04b: sipush 2569
         // 04e: sipush 10534
         // 051: pop2
         // 052: ldc "[PFP] Image.getStream: http branch for "
         // 054: swap
         // 055: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
         // 05a: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d (Ljava/lang/String;)V
         // 05d: goto 064
         // 060: invokestatic me/octo/client/utils/llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
         // 063: athrow
         // 064: aload 3
         // 065: bipush 0
         // 066: bipush 0
         // 067: bipush 6
         // 069: aconst_null
         // 06a: invokestatic me/octo/client/utils/IlllIIIlIlIIIIIIlIllIIlllllIIllIlIllIlllIIllllIlIllIIlllIIlIIlIIIIIIIllIlIlllIlIIlIII.a (Ljava/lang/String;IZILjava/lang/Object;)Ljava/io/InputStream;
         // 06d: areturn
         // 06e: new java/io/File
         // 071: dup
         // 072: aload 3
         // 073: invokespecial java/io/File.<init> (Ljava/lang/String;)V
         // 076: astore 5
         // 078: aload 5
         // 07a: invokevirtual java/io/File.exists ()Z
         // 07d: aload 2
         // 07e: ifnull 0f5
         // 081: ifeq 0f3
         // 084: goto 08b
         // 087: invokestatic me/octo/client/utils/llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
         // 08a: athrow
         // 08b: aload 5
         // 08d: invokevirtual java/io/File.isFile ()Z
         // 090: aload 2
         // 091: ifnull 0f5
         // 094: goto 09b
         // 097: invokestatic me/octo/client/utils/llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
         // 09a: athrow
         // 09b: ifeq 0f3
         // 09e: goto 0a5
         // 0a1: invokestatic me/octo/client/utils/llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
         // 0a4: athrow
         // 0a5: iload 4
         // 0a7: ifeq 0d9
         // 0aa: goto 0b1
         // 0ad: invokestatic me/octo/client/utils/llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
         // 0b0: athrow
         // 0b1: aload 5
         // 0b3: invokevirtual java/io/File.length ()J
         // 0b6: aload 3
         // 0b7: astore 11
         // 0b9: lstore 12
         // 0bb: sipush 2570
         // 0be: sipush 18782
         // 0c1: pop2
         // 0c2: ldc "[PFP] Image.getStream: local file branch, size="
         // 0c4: lload 12
         // 0c6: sipush 2561
         // 0c9: sipush 18976
         // 0cc: pop2
         // 0cd: ldc " for "
         // 0cf: aload 11
         // 0d1: invokedynamic makeConcatWithConstants (Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001" ]
         // 0d6: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d (Ljava/lang/String;)V
         // 0d9: aload 5
         // 0db: invokevirtual java/io/File.toPath ()Ljava/nio/file/Path;
         // 0de: bipush 0
         // 0df: anewarray 107
         // 0e2: invokestatic java/nio/file/Files.newInputStream (Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/InputStream;
         // 0e5: dup
         // 0e6: sipush 2568
         // 0e9: sipush 31601
         // 0ec: pop2
         // 0ed: ldc "newInputStream(...)"
         // 0ef: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
         // 0f2: areturn
         // 0f3: iload 4
         // 0f5: aload 2
         // 0f6: ifnull 15a
         // 0f9: ifeq 13f
         // 0fc: goto 103
         // 0ff: invokestatic me/octo/client/utils/llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
         // 102: athrow
         // 103: aload 3
         // 104: aload 5
         // 106: invokevirtual java/io/File.exists ()Z
         // 109: aload 5
         // 10b: invokevirtual java/io/File.isFile ()Z
         // 10e: istore 14
         // 110: istore 15
         // 112: astore 16
         // 114: sipush 2562
         // 117: sipush -18041
         // 11a: pop2
         // 11b: ldc "[PFP] Image.getStream: avatar.png path didn't resolve to http or existing file: "
         // 11d: aload 16
         // 11f: sipush 2575
         // 122: sipush 27839
         // 125: pop2
         // 126: ldc " (exists="
         // 128: iload 15
         // 12a: sipush 2563
         // 12d: sipush 29380
         // 130: pop2
         // 131: ldc ", isFile="
         // 133: iload 14
         // 135: ldc ")"
         // 137: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001\u0001\u0001" ]
         // 13c: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d (Ljava/lang/String;)V
         // 13f: aload 3
         // 140: sipush 2571
         // 143: sipush -30937
         // 146: pop2
         // 147: ldc "/assets/"
         // 149: aload 2
         // 14a: ifnull 171
         // 14d: bipush 0
         // 14e: bipush 2
         // 14f: aconst_null
         // 150: invokestatic kotlin/text/StringsKt.startsWith$default (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
         // 153: goto 15a
         // 156: invokestatic me/octo/client/utils/llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
         // 159: athrow
         // 15a: ifeq 1d3
         // 15d: aload 3
         // 15e: sipush 2566
         // 161: sipush 1221
         // 164: pop2
         // 165: ldc "/assets/"
         // 167: checkcast java/lang/CharSequence
         // 16a: goto 171
         // 16d: invokestatic me/octo/client/utils/llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
         // 170: athrow
         // 171: invokestatic kotlin/text/StringsKt.removePrefix (Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;
         // 174: astore 6
         // 176: aload 6
         // 178: checkcast java/lang/CharSequence
         // 17b: bipush 47
         // 17d: bipush 0
         // 17e: bipush 0
         // 17f: bipush 6
         // 181: aconst_null
         // 182: invokestatic kotlin/text/StringsKt.indexOf$default (Ljava/lang/CharSequence;CIZILjava/lang/Object;)I
         // 185: istore 7
         // 187: iload 7
         // 189: ifle 1d3
         // 18c: aload 6
         // 18e: bipush 0
         // 18f: iload 7
         // 191: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
         // 194: dup
         // 195: sipush 2564
         // 198: sipush 32565
         // 19b: pop2
         // 19c: ldc "substring(...)"
         // 19e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
         // 1a1: astore 8
         // 1a3: aload 6
         // 1a5: iload 7
         // 1a7: bipush 1
         // 1a8: iadd
         // 1a9: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
         // 1ac: dup
         // 1ad: sipush 2567
         // 1b0: sipush 285
         // 1b3: pop2
         // 1b4: ldc "substring(...)"
         // 1b6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
         // 1b9: astore 9
         // 1bb: nop
         // 1bc: aload 8
         // 1be: aload 9
         // 1c0: invokestatic me/octo/client/utils/lIlIlIlIIIlIIIIIllIlIIIIllllIIIlllIIlllIllIlllllIIIllIIlllIllIlIlllIllIlIIlIIllllIlll.a (Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;
         // 1c3: dup
         // 1c4: sipush 2565
         // 1c7: sipush -13407
         // 1ca: pop2
         // 1cb: ldc "get(...)"
         // 1cd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
         // 1d0: areturn
         // 1d1: astore 10
         // 1d3: aload 0
         // 1d4: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
         // 1d7: aload 3
         // 1d8: invokevirtual java/lang/Class.getResourceAsStream (Ljava/lang/String;)Ljava/io/InputStream;
         // 1db: dup
         // 1dc: ifnonnull 1ed
         // 1df: pop
         // 1e0: new java/io/FileNotFoundException
         // 1e3: dup
         // 1e4: aload 3
         // 1e5: invokespecial java/io/FileNotFoundException.<init> (Ljava/lang/String;)V
         // 1e8: athrow
         // 1e9: invokestatic me/octo/client/utils/llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
         // 1ec: athrow
         // 1ed: areturn
      }

      private static Throwable a(Throwable var0) {
         return var0;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[14];
         int var3 = 0;
         String var2 = "AôvNÐréñ\u0097PþH7\u0084)%\u008bs\u0006WoS\u008cõðR\u000e\u0086BBý¡)¶ðæ\u001dáµ)d'\u0089¨ÛÎ\u0007b½Q5·\u0012O\u000b\u008dõ?àß\u001b\u0091`¶~\u008c\u008b\r¿7aó,¶Q\u0011ñ\u009eõòT¼7\u0093\u0017ð5¡\u000bC\u0005\\O^¶u\nø \u00adO\u0085®Â\u0007«g\u000eªû´PÐª\u0098\u0099F&êÛW¨\b/ËÂÀ<¾,\u009c\baâM:a\u008bø-\u000e<ëfR\u008aêÓ\u0091/'Çûò¬\b\u0087B×ñ\u009e\u0098xX/gz\u0004ÂOíGj\u009ft\\7êy<Ã\u0097´q\u0004\u009biå¢pÊ\"+·\u0094%Ó\u0099t\u0089F\b\u0004¨Wù¾{ì\u0096;Æ'¢Ý¼6Xs¥¹Ã\u000e×x\u009b\u0090\u0012þR\u0013Éð\u008c÷\u0007u7££¿ö×\u000f/ÓáD¡µr\u0093\u0013ù\u0093uuEqoº\u0013G®kGØ\u0013\u0083ÿ2!";
         int var4 = "AôvNÐréñ\u0097PþH7\u0084)%\u008bs\u0006WoS\u008cõðR\u000e\u0086BBý¡)¶ðæ\u001dáµ)d'\u0089¨ÛÎ\u0007b½Q5·\u0012O\u000b\u008dõ?àß\u001b\u0091`¶~\u008c\u008b\r¿7aó,¶Q\u0011ñ\u009eõòT¼7\u0093\u0017ð5¡\u000bC\u0005\\O^¶u\nø \u00adO\u0085®Â\u0007«g\u000eªû´PÐª\u0098\u0099F&êÛW¨\b/ËÂÀ<¾,\u009c\baâM:a\u008bø-\u000e<ëfR\u008aêÓ\u0091/'Çûò¬\b\u0087B×ñ\u009e\u0098xX/gz\u0004ÂOíGj\u009ft\\7êy<Ã\u0097´q\u0004\u009biå¢pÊ\"+·\u0094%Ó\u0099t\u0089F\b\u0004¨Wù¾{ì\u0096;Æ'¢Ý¼6Xs¥¹Ã\u000e×x\u009b\u0090\u0012þR\u0013Éð\u008c÷\u0007u7££¿ö×\u000f/ÓáD¡µr\u0093\u0013ù\u0093uuEqoº\u0013G®kGØ\u0013\u0083ÿ2!"
            .length();
         char var1 = '\t';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 93;
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
                        case 0 -> 42;
                        case 1 -> 65;
                        case 2 -> 45;
                        case 3 -> 89;
                        case 4 -> 79;
                        case 5 -> 18;
                        default -> 14;
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
                        b = new String[14];
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

                     var2 = "\u0088>ì7\u0003\u000fc3ÿ\u0004ný`\u0090";
                     var4 = "\u0088>ì7\u0003\u000fc3ÿ\u0004ný`\u0090".length();
                     var1 = '\t';
                     var8 = -1;
               }

               var10000 = 22;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 2563) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 84;
               case 1 -> 73;
               case 2 -> 227;
               case 3 -> 153;
               case 4 -> 234;
               case 5 -> 151;
               case 6 -> 128;
               case 7 -> 54;
               case 8 -> 189;
               case 9 -> 165;
               case 10 -> 119;
               case 11 -> 22;
               case 12 -> 99;
               case 13 -> 44;
               case 14 -> 220;
               case 15 -> 243;
               case 16 -> 19;
               case 17 -> 135;
               case 18 -> 18;
               case 19 -> 200;
               case 20 -> 103;
               case 21 -> 249;
               case 22 -> 48;
               case 23 -> 147;
               case 24 -> 148;
               case 25 -> 55;
               case 26 -> 26;
               case 27 -> 114;
               case 28 -> 238;
               case 29 -> 251;
               case 30 -> 177;
               case 31 -> 144;
               case 32 -> 49;
               case 33 -> 175;
               case 34 -> 130;
               case 35 -> 241;
               case 36 -> 52;
               case 37 -> 102;
               case 38 -> 240;
               case 39 -> 25;
               case 40 -> 1;
               case 41 -> 24;
               case 42 -> 161;
               case 43 -> 21;
               case 44 -> 39;
               case 45 -> 213;
               case 46 -> 80;
               case 47 -> 160;
               case 48 -> 58;
               case 49 -> 30;
               case 50 -> 186;
               case 51 -> 211;
               case 52 -> 214;
               case 53 -> 108;
               case 54 -> 170;
               case 55 -> 162;
               case 56 -> 226;
               case 57 -> 75;
               case 58 -> 217;
               case 59 -> 116;
               case 60 -> 219;
               case 61 -> 158;
               case 62 -> 180;
               case 63 -> 195;
               case 64 -> 139;
               case 65 -> 236;
               case 66 -> 235;
               case 67 -> 81;
               case 68 -> 184;
               case 69 -> 191;
               case 70 -> 166;
               case 71 -> 85;
               case 72 -> 83;
               case 73 -> 16;
               case 74 -> 35;
               case 75 -> 253;
               case 76 -> 95;
               case 77 -> 201;
               case 78 -> 14;
               case 79 -> 142;
               case 80 -> 248;
               case 81 -> 246;
               case 82 -> 69;
               case 83 -> 122;
               case 84 -> 53;
               case 85 -> 149;
               case 86 -> 159;
               case 87 -> 179;
               case 88 -> 78;
               case 89 -> 117;
               case 90 -> 17;
               case 91 -> 96;
               case 92 -> 90;
               case 93 -> 109;
               case 94 -> 244;
               case 95 -> 221;
               case 96 -> 34;
               case 97 -> 138;
               case 98 -> 70;
               case 99 -> 190;
               case 100 -> 47;
               case 101 -> 15;
               case 102 -> 40;
               case 103 -> 146;
               case 104 -> 0;
               case 105 -> 197;
               case 106 -> 192;
               case 107 -> 182;
               case 108 -> 140;
               case 109 -> 86;
               case 110 -> 51;
               case 111 -> 247;
               case 112 -> 204;
               case 113 -> 77;
               case 114 -> 129;
               case 115 -> 233;
               case 116 -> 242;
               case 117 -> 228;
               case 118 -> 9;
               case 119 -> 57;
               case 120 -> 28;
               case 121 -> 232;
               case 122 -> 174;
               case 123 -> 13;
               case 124 -> 168;
               case 125 -> 41;
               case 126 -> 209;
               case 127 -> 202;
               case 128 -> 118;
               case 129 -> 225;
               case 130 -> 187;
               case 131 -> 134;
               case 132 -> 254;
               case 133 -> 113;
               case 134 -> 101;
               case 135 -> 194;
               case 136 -> 89;
               case 137 -> 181;
               case 138 -> 121;
               case 139 -> 3;
               case 140 -> 222;
               case 141 -> 82;
               case 142 -> 145;
               case 143 -> 100;
               case 144 -> 137;
               case 145 -> 203;
               case 146 -> 215;
               case 147 -> 112;
               case 148 -> 45;
               case 149 -> 23;
               case 150 -> 183;
               case 151 -> 12;
               case 152 -> 106;
               case 153 -> 252;
               case 154 -> 212;
               case 155 -> 141;
               case 156 -> 163;
               case 157 -> 172;
               case 158 -> 237;
               case 159 -> 150;
               case 160 -> 185;
               case 161 -> 239;
               case 162 -> 4;
               case 163 -> 231;
               case 164 -> 20;
               case 165 -> 10;
               case 166 -> 154;
               case 167 -> 88;
               case 168 -> 46;
               case 169 -> 36;
               case 170 -> 123;
               case 171 -> 56;
               case 172 -> 173;
               case 173 -> 29;
               case 174 -> 6;
               case 175 -> 205;
               case 176 -> 157;
               case 177 -> 63;
               case 178 -> 87;
               case 179 -> 155;
               case 180 -> 43;
               case 181 -> 5;
               case 182 -> 37;
               case 183 -> 31;
               case 184 -> 143;
               case 185 -> 156;
               case 186 -> 188;
               case 187 -> 199;
               case 188 -> 178;
               case 189 -> 206;
               case 190 -> 125;
               case 191 -> 164;
               case 192 -> 91;
               case 193 -> 71;
               case 194 -> 94;
               case 195 -> 61;
               case 196 -> 105;
               case 197 -> 27;
               case 198 -> 229;
               case 199 -> 32;
               case 200 -> 176;
               case 201 -> 59;
               case 202 -> 74;
               case 203 -> 230;
               case 204 -> 131;
               case 205 -> 207;
               case 206 -> 66;
               case 207 -> 110;
               case 208 -> 11;
               case 209 -> 198;
               case 210 -> 136;
               case 211 -> 67;
               case 212 -> 115;
               case 213 -> 152;
               case 214 -> 196;
               case 215 -> 169;
               case 216 -> 223;
               case 217 -> 208;
               case 218 -> 97;
               case 219 -> 93;
               case 220 -> 7;
               case 221 -> 111;
               case 222 -> 79;
               case 223 -> 133;
               case 224 -> 218;
               case 225 -> 132;
               case 226 -> 60;
               case 227 -> 68;
               case 228 -> 42;
               case 229 -> 104;
               case 230 -> 127;
               case 231 -> 2;
               case 232 -> 76;
               case 233 -> 224;
               case 234 -> 210;
               case 235 -> 62;
               case 236 -> 64;
               case 237 -> 255;
               case 238 -> 124;
               case 239 -> 171;
               case 240 -> 72;
               case 241 -> 8;
               case 242 -> 126;
               case 243 -> 98;
               case 244 -> 216;
               case 245 -> 245;
               case 246 -> 193;
               case 247 -> 250;
               case 248 -> 38;
               case 249 -> 33;
               case 250 -> 65;
               case 251 -> 92;
               case 252 -> 120;
               case 253 -> 107;
               case 254 -> 50;
               default -> 167;
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
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker p0) { this(); }
   }
}
