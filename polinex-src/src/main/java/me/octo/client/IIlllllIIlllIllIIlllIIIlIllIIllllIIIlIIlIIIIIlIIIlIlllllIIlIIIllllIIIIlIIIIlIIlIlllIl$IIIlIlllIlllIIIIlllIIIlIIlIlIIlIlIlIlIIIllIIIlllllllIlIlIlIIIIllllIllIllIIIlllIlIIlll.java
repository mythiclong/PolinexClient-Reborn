package me.octo.client;

// Restored from me.octo.client jar bytecode (Phase A, slice NT6).
// Convention (a) of .analysis/agents/lead/br/NESTED-BRIEF.md: the jar LOCAL class
// (EnclosingMethod = IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.<init>) is re-created as a top-level class whose
// simple name carries the '$', so the binary name and the method set match the jar class.
// Fidelity: bodies transcribed from javap -p -c -v of the jar class
// me.octo.client.IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
// (fields b/c are private static String[]; <init>()V is package-private; e()V carries the
//  obfuscator's junk predicates, which are dropped one by one in
//  .analysis/reports/phaseA-nested-NT6.md section 5; d()V / a(IIIIII)Z are ACC_BRIDGE
//  trampolines onto the interface defaults via invokespecial; <clinit>()V and
//  a(II)Ljava/lang/String; are the obfuscator string-decryptor, see report section 4/R7).
public final class IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll implements me.octo.client.IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII {
   private static java.lang.String[] b;
   private static java.lang.String[] c;

   IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll() {
   }

   @Override
   public void e() {
      try {
         java.io.File file = net.minecraft.client.Minecraft.getInstance().gameDirectory.toPath().resolve("polinex").resolve("routes").toFile();
         if (!file.exists()) {
            file.mkdirs();
         }
         String string = System.getProperty("os.name").toLowerCase(java.util.Locale.ROOT);
         if (string.contains("win")) {
            new ProcessBuilder(new String[]{"explorer", file.getAbsolutePath()}).start();
         } else if (string.contains("mac")) {
            new ProcessBuilder(new String[]{"open", file.getAbsolutePath()}).start();
         } else if (string.contains("linux")) {
            new ProcessBuilder(new String[]{"xdg-open", file.getAbsolutePath()}).start();
         } else if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop.getDesktop().open(file);
         }
      } catch (Exception exception) {
      }
   }

   @Override
   public void a(char p0, int p1) {
   }

   @Override
   public void d() {
      me.octo.client.IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.d();
   }

   @Override
   public boolean a(int p0, int p1, int p2, int p3, int p4, int p5) {
      return me.octo.client.IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.a(p0, p1, p2, p3, p4, p5);
   }

   private static java.lang.Exception a(java.lang.Exception p0) {
      return p0;
   }

   static {
      b = new String[11];
      c = new String[11];
   }

   private static java.lang.String a(int p0, int p1) {
      int n = (p0 ^ -16202) & 65535;
      java.lang.String[] arr = c;
      if (arr[n] == null) {
         char[] cs = b[n].toCharArray();
         int n2 = 0;
         int n3 = 0;
         while (n3 < cs.length) {
            cs[n3] = (char)(cs[n3] ^ n2);
            n2 = ((n2 >>> 3) | (n2 << 5)) ^ cs[n3] & 255;
            n3++;
         }
         arr[n] = new java.lang.String(cs).intern();
      }
      return arr[n];
   }
}
