package me.octo.client;

import java.awt.Desktop;
import java.io.File;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class lIIlIlIIllIllllIIIllIIIIIlIIlIllIllllIIlllIIIIIlIlIlllIlIIIlllIlIIlIlllllIIlIIIIIIIll$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll implements IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII {
   final lIIlIlIIllIllllIIIllIIIIIlIIlIllIllllIIlllIIIIIlIlIlllIlIIIlllIlIIlIlllllIIlIIIIIIIll this$0;
   private static final char[] KEY = {
      81, 111, 235, 166, 184, 31, 121, 23, 223, 48, 138, 155, 203, 140, 16, 60,
      139, 243, 33, 97, 245, 78, 154, 122, 187, 69, 173, 61, 8, 72, 32, 34,
      217, 46, 222, 204, 152, 158, 146, 135, 103, 198, 64, 134, 39, 66, 56, 50,
      225, 206, 237, 44, 59, 240, 148, 127, 201, 5, 14, 212, 131, 112, 142, 157,
      202, 68, 114, 87, 35, 227, 200, 51, 156, 170, 165, 82, 250, 57, 58, 107,
      75, 79, 214, 238, 219, 143, 236, 144, 130, 230, 231, 147, 226, 90, 123, 0,
      195, 62, 149, 36, 71, 181, 47, 102, 199, 88, 117, 233, 86, 132, 151, 76,
      208, 242, 246, 249, 98, 27, 171, 11, 55, 162, 119, 45, 28, 192, 239, 126,
      26, 101, 191, 164, 180, 120, 167, 196, 128, 244, 77, 89, 210, 67, 224, 193,
      17, 179, 178, 115, 38, 255, 215, 2, 145, 116, 24, 9, 54, 189, 70, 25,
      124, 91, 53, 7, 85, 247, 3, 207, 253, 52, 183, 221, 80, 228, 251, 92,
      159, 95, 125, 99, 15, 234, 137, 169, 248, 153, 172, 186, 188, 41, 49, 73,
      182, 133, 211, 136, 13, 1, 197, 30, 84, 218, 43, 252, 220, 93, 6, 216,
      65, 185, 40, 105, 104, 10, 109, 209, 37, 168, 163, 176, 20, 22, 63, 241,
      194, 29, 205, 150, 118, 12, 18, 21, 229, 175, 254, 96, 108, 190, 213, 174,
      4, 74, 100, 94, 83, 232, 110, 129, 160, 113, 161, 19, 141, 42, 106, 177
   };
   private static String[] b;
   private static String[] c;

   public lIIlIlIIllIllllIIIllIIIIIlIIlIllIllllIIlllIIIIIlIlIlllIlIIIlllIlIIlIlllllIIlIIIIIIIll$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(lIIlIlIIllIllllIIIllIIIIIlIIlIllIllllIIlllIIIIIlIlIlllIlIIIlllIlIIlIlllllIIlIIIIIIIll var1) {
      this.this$0 = var1;
   }

   @Override
   public void e() {
      try {
         File var1 = this.this$0.a().gameDirectory.toPath().resolve("polinex").resolve("routes").toFile();
         if (!var1.exists()) {
            var1.mkdirs();
         }

         String var2 = System.getProperty("os.name");
         Intrinsics.checkNotNullExpressionValue(var2, "getProperty(...)");
         var2 = var2.toLowerCase(Locale.ROOT);
         Intrinsics.checkNotNullExpressionValue(var2, "toLowerCase(...)");
         if (StringsKt.contains(var2, "win", false)) {
            new ProcessBuilder(new String[]{"explorer", var1.getAbsolutePath()}).start();
         } else if (StringsKt.contains(var2, "mac", false)) {
            new ProcessBuilder(new String[]{"open", var1.getAbsolutePath()}).start();
         } else if (StringsKt.contains(var2, "linux", false)) {
            new ProcessBuilder(new String[]{"xdg-open", var1.getAbsolutePath()}).start();
         } else if (Desktop.isDesktopSupported()) {
            Desktop.getDesktop().open(var1);
         }
      } catch (Exception var3) {
      }
   }

   @Override
   public void a(char var1, int var2) {
   }

   @Override
   public void d() {
      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.d();
   }

   @Override
   public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
      return IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.a(var1, var2, var3, var4, var5, var6);
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   static {
      b = new String[]{
      "\u0092\u00be\u00f1",
      "\u0086\u0020\u0069\u001f\u003c\u0070\u0060\u0040",
      "\u0005\u0002\u00b0\u0085\u00f2\u0048\u00b9\u0019",
      "\u00bb\u0017\u0080",
      "\u00a1\u0065\u0026\u0047\u004b\u00c9\u00b2",
      "\u00e2\u00fc\u0015\u0069\u001c\u00a4",
      "\u00d4\u004a\u007d\u0059",
      "\u0098\u00fd\u009c\u008e\u0048",
      "\u0069\u0077\u0081\u009d\u00ba\u007d\u007f",
      "\u00cc\u0017\u002f\u000f\u0057\u0006\u0001\u004a\u007d\u0011\u0087\u0017\u0017\u00e1\u0027\u00fe",
      "\u0017\u0032\u001d\u00df\u002b\u00ce\u0029\u003e\u0029\u007a\u0060\u009d\u0074\u00b0\u004b\u00d4"
      };
      c = new String[11];
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -3357) & 65535;
      if (c[var2] != null) {
         return c[var2];
      }

      char[] var3 = b[var2].toCharArray();
      int var4 = KEY[var3[0] & 255];
      int var5 = (var1 & 255) - var4;
      if (var5 < 0) {
         var5 += 256;
      }

      int var6 = ((var1 & 65535) >>> 8) - var4;
      if (var6 < 0) {
         var6 += 256;
      }

      for (int var7 = 0; var7 < var3.length; ++var7) {
         if (var7 % 2 == 0) {
            var3[var7] = (char)(var3[var7] ^ var5);
            var5 = (((var5 >>> 3) | (var5 << 5)) ^ var3[var7]) & 255;
         } else {
            var3[var7] = (char)(var3[var7] ^ var6);
            var6 = (((var6 >>> 3) | (var6 << 5)) ^ var3[var7]) & 255;
         }
      }

      c[var2] = (new String(var3)).intern();
      return c[var2];
   }
}
