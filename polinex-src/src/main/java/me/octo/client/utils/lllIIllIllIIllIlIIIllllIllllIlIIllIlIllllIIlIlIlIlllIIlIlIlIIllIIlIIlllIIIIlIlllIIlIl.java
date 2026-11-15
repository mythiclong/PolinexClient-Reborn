package me.octo.client.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.security.MessageDigest;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public final class lllIIllIllIIllIlIIIllllIllllIlIIllIlIllllIIlIlIlIlllIIlIlIlIIllIIlIIlllIIIIlIlllIIlIl {
   private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = "https://api.polinexclient.net/libs";
   private final Set<String> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new LinkedHashSet<>();
   private Map<String, String> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static String[] a;
   private static String[] b;

   private boolean a(String var1) {
      if (var1 == null) {
         return false;
      } else {
         String var2 = var1.toLowerCase(Locale.ROOT);
         return !var2.startsWith("lwjgl") ? true : var2.startsWith("lwjgl-nanovg");
      }
   }

   private String a() {
      String var1 = System.getProperty("os.name", "").toLowerCase(Locale.ROOT);
      String var2 = System.getProperty("os.arch", "").toLowerCase(Locale.ROOT);
      if (var1.contains("win")) {
         return "windows";
      } else if (!var1.contains("mac") && !var1.contains("darwin") || !var2.equals("aarch64") && !var2.equals("arm64")) {
         return !var1.contains("mac") && !var1.contains("darwin") ? "linux" : "macos";
      } else {
         return "macos-arm64";
      }
   }

   private String a(File var1) {
      if (var1 != null && var1.isFile()) {
         try {
            String var6;
            try (FileInputStream var2 = new FileInputStream(var1)) {
               MessageDigest var3 = MessageDigest.getInstance("SHA-256");
               byte[] var4 = new byte[8192];

               int var5;
               while ((var5 = var2.read(var4)) >= 0) {
                  if (var5 > 0) {
                     var3.update(var4, 0, var5);
                  }
               }

               var6 = this.a(var3.digest());
            }

            return var6;
         } catch (Throwable var9) {
            logWarn("LibraryManager: failed to hash file '" + var1 + "': " + var9.getMessage());
            return null;
         }
      } else {
         return null;
      }
   }

   private String a(byte[] var1) {
      if (var1 == null) {
         return null;
      } else {
         StringBuilder var2 = new StringBuilder(var1.length * 2);

         for (byte var6 : var1) {
            var2.append(String.format(Locale.ROOT, "%02x", var6 & 255));
         }

         return var2.toString();
      }
   }

   public boolean b(File var1) {
      if (var1 != null && var1.exists()) {
         boolean var2 = true;
         if (var1.isDirectory()) {
            File[] var3 = var1.listFiles();
            if (var3 != null) {
               for (File var7 : var3) {
                  var2 &= this.b(var7);
               }
            }
         }

         try {
            var2 &= Files.deleteIfExists(var1.toPath());
         } catch (Throwable var8) {
            logWarn("LibraryManager: failed to delete '" + var1 + "': " + var8.getMessage());
            var2 = false;
         }

         return var2;
      } else {
         return true;
      }
   }

   public void b() {
   }

   public void c() {
      this.b();
      this.d();
      this.e();
   }

   public void d() {
      File var1 = new File(this.baseDir(), "libs");
      if (var1.exists() && var1.isDirectory()) {
         File var2 = new File(this.baseDir(), "natives");
         if (!var2.exists() && !var2.mkdirs()) {
            logWarn("LibraryManager: failed to create natives directory");
         } else {
            Set var3 = new LinkedHashSet();
            var3.add("dylib");
            var3.add("so");
            var3.add("dll");
            File[] var4 = var1.listFiles(var0 -> var0 != null && var0.isFile() && var0.getName().toLowerCase(Locale.ROOT).endsWith(".jar"));
            if (var4 != null) {
               for (File var8 : var4) {
                  if (!this.a(var8.getName())) {
                     try (JarFile var9 = new JarFile(var8)) {
                        var9.stream().filter(var1x -> shouldExtract(var3, var1x)).forEach(var3x -> this.extractEntry(var9, var3x, var2));
                     } catch (Throwable var14) {
                        logWarn("LibraryManager: failed to extract natives from " + var8.getName() + ": " + var14.getMessage());
                     }
                  }
               }
            }
         }
      }
   }

   public void e() {
      File var1 = new File(this.baseDir(), "natives");
      File[] var2 = var1.listFiles();
      if (var2 != null) {
         String var3 = this.a();
         File var4 = null;

         for (File var8 : var2) {
            if (var8.isFile()) {
               String var9 = var8.getName().toLowerCase(Locale.ROOT);
               if (var9.contains("pathfinder")) {
                  if (var3.equals("windows") && var9.endsWith(".dll")) {
                     var4 = var8;
                  } else if (var3.equals("linux") && var9.endsWith(".so")) {
                     var4 = var8;
                  } else if ((var3.equals("macos") || var3.equals("macos-arm64")) && var9.endsWith(".dylib")) {
                     var4 = var8;
                  }

                  if (var4 != null) {
                     break;
                  }
               }
            }
         }

         if (var4 == null) {
            logWarn("LibraryManager: pathfinder native not found in " + var1.getAbsolutePath());
         } else {
            try {
               System.load(var4.getAbsolutePath());
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.add(var4.getName());
            } catch (Throwable var10) {
               logWarn("LibraryManager: failed to load pathfinder native '" + var4.getName() + "', JNI pathfinding disabled: " + var10.getMessage());
            }
         }
      }
   }

   public boolean b(String var1) {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.contains(var1);
   }

   public Set<String> f() {
      return new LinkedHashSet<>(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
   }

   private static CharSequence a(byte var0) {
      return String.format(Locale.ROOT, "%02x", var0 & 255);
   }

   private static CharSequence b(byte var0) {
      return String.format(Locale.ROOT, "%02x", var0 & 255);
   }

   private static boolean c(File var0) {
      return hasExtension(var0, "jar");
   }

   private static boolean d(File var0) {
      return hasExtension(var0, "jar");
   }

   private static boolean e(File var0) {
      return hasExtension(var0, "jar");
   }

   private static boolean f(File var0) {
      return hasExtension(var0, "jar");
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   static void $jnicClinit() {
      a = new String[0];
      b = new String[0];
   }

   private static String a(int var0, int var1) {
      return "";
   }

   public static void $jnicLoader() {
   }

   private static boolean hasExtension(File var0, String var1) {
      if (var0 == null) {
         return false;
      } else {
         String var2 = var0.getName();
         int var3 = var2.lastIndexOf(46);
         return var3 >= 0 && var2.substring(var3 + 1).equalsIgnoreCase(var1);
      }
   }

   private static boolean shouldExtract(Set<String> var0, JarEntry var1) {
      if (var1 != null && !var1.isDirectory()) {
         String var2 = var1.getName();
         int var3 = var2.lastIndexOf(47);
         String var4 = var3 >= 0 ? var2.substring(var3 + 1) : var2;
         int var5 = var4.lastIndexOf(46);
         return var5 >= 0 && var0.contains(var4.substring(var5 + 1).toLowerCase(Locale.ROOT));
      } else {
         return false;
      }
   }

   private void extractEntry(JarFile var1, JarEntry var2, File var3) {
      String var4 = var2.getName();
      int var5 = var4.lastIndexOf(47);
      String var6 = var5 >= 0 ? var4.substring(var5 + 1) : var4;
      File var7 = new File(var3, var6);
      if (!var7.exists()) {
         try (InputStream var8 = var1.getInputStream(var2)) {
            Files.copy(var8, var7.toPath(), StandardCopyOption.REPLACE_EXISTING);
            var7.setExecutable(true, false);
         } catch (Throwable var13) {
            logWarn("LibraryManager: failed to extract " + var6 + " from " + var1.getName() + ": " + var13.getMessage());
         }
      }
   }

   private Map<String, String> parseManifest(String var1) {
      LinkedHashMap var2 = new LinkedHashMap();
      if (var1 != null && !var1.isEmpty()) {
         if (var1.startsWith("{") && var1.endsWith("}")) {
            String var11 = var1.substring(1, var1.length() - 1).trim();
            if (!var11.isEmpty()) {
               for (String var15 : var11.split(",")) {
                  String[] var16 = var15.split(":", 2);
                  if (var16.length == 2) {
                     String var9 = unquote(var16[0].trim());
                     String var10 = unquote(var16[1].trim());
                     if (!var9.isEmpty() && !var10.isEmpty()) {
                        var2.put(var9, var10);
                     }
                  }
               }
            }

            return var2;
         } else {
            for (String var6 : var1.split("\\R")) {
               String var7 = var6.trim();
               if (!var7.isEmpty() && !var7.startsWith("#")) {
                  String[] var8 = var7.split("\\s+", 2);
                  if (var8.length == 2) {
                     var2.put(var8[1], var8[0]);
                  }
               }
            }

            return var2;
         }
      } else {
         return var2;
      }
   }

   private static String unquote(String var0) {
      if (var0 == null) {
         return "";
      } else {
         var0 = var0.trim();
         if (var0.length() >= 2 && var0.charAt(0) == '"' && var0.charAt(var0.length() - 1) == '"') {
            var0 = var0.substring(1, var0.length() - 1);
         }

         return var0.replace("\\\"", "\"").replace("\\\\", "\\");
      }
   }

   private File baseDir() {
      try {
         Class var1 = Class.forName("me.octo.client.llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl");
         Field var2 = var1.getField("IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl");
         Object var3 = var2.get(null);
         Method var4 = var1.getMethod("a");
         Object var5 = var4.invoke(var3);
         if (var5 instanceof String && !((String)var5).isEmpty()) {
            return new File((String)var5);
         }
      } catch (Throwable var6) {
      }

      return new File(System.getProperty("user.dir", "."));
   }

   private static byte[] readAll(InputStream var0) throws IOException {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      byte[] var2 = new byte[8192];

      int var3;
      while ((var3 = var0.read(var2)) >= 0) {
         if (var3 > 0) {
            var1.write(var2, 0, var3);
         }
      }

      return var1.toByteArray();
   }

   private static void logWarn(String var0) {
      try {
         Class var1 = Class.forName("me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI");

         for (String var5 : new String[]{"c", "b", "e", "d"}) {
            try {
               Method var6 = var1.getMethod(var5, String.class);
               var6.invoke(null, var0);
               return;
            } catch (NoSuchMethodException var7) {
            }
         }
      } catch (Throwable var8) {
      }

      System.err.println(var0);
   }
}
