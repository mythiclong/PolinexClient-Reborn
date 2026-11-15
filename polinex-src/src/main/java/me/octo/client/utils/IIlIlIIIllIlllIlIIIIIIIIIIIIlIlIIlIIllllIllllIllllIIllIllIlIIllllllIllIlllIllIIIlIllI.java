package me.octo.client.utils;

import dev.jnic.PdfVaZ.JNICLoader;
import java.io.InputStream;
import java.net.http.HttpClient;
import java.net.http.HttpRequest.Builder;
import org.jetbrains.annotations.NotNull;

public final class IIlIlIIIllIlllIlIIIIIIIIIIIIlIlIIlIIllllIllllIllllIIllIllIlIIllllllIllIlllIllIIIlIllI {
   @NotNull
   public static IIlIlIIIllIlllIlIIIIIIIIIIIIlIlIIlIIllllIllllIllllIIllIllIlIIllllllIllIlllIllIIIlIllI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   public static String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static HttpClient IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String[] a;
   private static String[] b;

   private IIlIlIIIllIlllIlIIIIIIIIIIIIlIlIIlIIllllIllllIllllIIllIllIlIIllllllIllIlllIllIIIlIllI() {
   }

   @NotNull
   public final native HttpClient a();

   @NotNull
   public final native Builder a(@NotNull String var1);

   @NotNull
   public final native String b(@NotNull String var1);

   @NotNull
   public final native byte[] c(@NotNull String var1);

   @NotNull
   public final native InputStream d(@NotNull String var1);

   @NotNull
   public final native String a(@NotNull String var1, @NotNull String var2);

   public final native boolean e(@NotNull String var1);

   private static Exception a(Exception var0) {
      return var0;
   }

   private static native String a(int var0, int var1);

   static {
      JNICLoader.init();
      $jnicLoader();
      $jnicClinit();
   }

    // PX-FIX JNIC placeholder (Phase 2: Ghidra restore)
    private static void $jnicClinit() {
    }

    // PX-FIX JNIC placeholder (Phase 2: Ghidra restore)
    private static void $jnicLoader() {
    }
}
