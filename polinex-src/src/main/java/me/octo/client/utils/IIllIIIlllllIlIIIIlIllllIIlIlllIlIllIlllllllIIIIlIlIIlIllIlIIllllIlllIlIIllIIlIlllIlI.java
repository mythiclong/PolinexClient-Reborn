package me.octo.client.utils;

import com.google.gson.JsonObject;
import kotlin.Unit;
import dev.jnic.PdfVaZ.JNICLoader;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.BiConsumer;

public class IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI {
   private static String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = "https://api.polinexclient.net/api/macro-status";
   private static long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = 600000L;
   private static Map<String, String> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new java.util.HashMap<>();
   private static Map<String, IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new java.util.concurrent.ConcurrentHashMap<>();
   private static List<String> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new java.util.concurrent.CopyOnWriteArrayList<>();
   private static Map<String, BiConsumer<IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI, String>> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new java.util.concurrent.ConcurrentHashMap<>();
   private static List<BiConsumer<IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll, IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI>> IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new java.util.concurrent.CopyOnWriteArrayList<>();
   private static ScheduledExecutorService lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static volatile boolean IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static volatile long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static String[] a;
   private static String[] b;

   public static void a(
      BiConsumer<IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll, IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> var0
   ) {
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.add(var0);
   }

   public static void b(
      BiConsumer<IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll, IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> var0
   ) {
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.remove(var0);
   }

   public static native void a();

   private static native void b();

   public static native void a(JsonObject var0);

   public static native void a(String var0);

   public static native void a(
      String var0,
      BiConsumer<IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI, String> var1
   );

   public static native void b(String var0);

   public static native String c(String var0);

   public static IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI d(String var0) {
      String var1 = var0 == null ? null : IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.get(var0);
      return var1 == null ? IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI : IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b(var1);
   }

   public static IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI e(String var0) {
      return d(var0);
   }

   public static IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll f(String var0) {
      return var0 == null ? null : lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var0);
   }

   public static native List<IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> c();

   public static native Map<String, IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> d();

   public static native boolean e();

   private static native String a(
      IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0
   );

   private static Exception a(Exception var0) {
      return var0;
   }

   private static native String a(int var0, int var1);

   // PX-FIX W7-6: lambdas declared native in the reference jar (JNIC-nativized class)
   private static native Thread lambda$init$0(Runnable var0);

   private static native Unit lambda$init$1(JsonObject var0);

   static {
      JNICLoader.init();
      $jnicLoader();
      $jnicClinit();
   }

   public static enum IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;

      private static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = {IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI};

      private static String[] a;
      private static String[] b;

      public static IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] a() {
         return (IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[])IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.clone();
      }

      public static IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         String var0
      ) {
         return Enum.valueOf(
            IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.class,
            var0
         );
      }

      public static IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI b(
         String var0
      ) {
      Object var4 = null; // PX-FIX
         String var1 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
         String var10000 = var0;
         if (var1 == null) {
            if (var0 == null) {
               return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            }

            var10000 = var0.toLowerCase();
         }

         String var2 = var10000;
         byte var3 = -1;
         var4 = var2.hashCode();
         label47:
         if (var1 == null) {
            switch ((Integer)(var4)) {
               case 3522445:
                  short var10001 = -13911;
                  short var10002 = 20228;
                  var4 = var2.equals("safe");
                  if (var1 != null) {
                     break label47;
                  }

                  if (((Boolean)(var4))) {
                     break;
                  }

                  var3 = 0;
                  if (var1 == null) {
                     break;
                  }
               case 108523402:
                  short var5 = -13913;
                  short var7 = 11056;
                  var4 = var2.equals("risky");
                  if (var1 != null) {
                     break label47;
                  }

                  if (((Boolean)(var4))) {
                     break;
                  }

                  var3 = 1;
                  if (var1 == null) {
                     break;
                  }
               case -840246874:
                  short var6 = -13905;
                  short var8 = 28042;
                  var4 = var2.equals("unsafe");
                  if (var1 != null) {
                     break label47;
                  }

                  if (!((Boolean)var4)) {
                     var3 = 2;
                  }
            }

            var4 = var3;
         }

         switch ((Integer)(var4)) {
            case 0:
               return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            case 1:
               return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            case 2:
               return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            default:
               return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }
      }

      public String b() {
         switch (this) {
            case IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl:
               short var3 = -13906;
               short var6 = -12569;
               return "§a";
            case lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII:
               short var2 = -13916;
               short var5 = -22249;
               return "§e";
            case IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl:
               short var1 = -13912;
               short var4 = -7983;
               return "§c";
            default:
               short var10000 = -13908;
               short var10001 = 2377;
               return "§7";
         }
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -13907) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 241;
               case 1 -> 34;
               case 2 -> 222;
               case 3 -> 41;
               case 4 -> 152;
               case 5 -> 117;
               case 6 -> 156;
               case 7 -> 7;
               case 8 -> 108;
               case 9 -> 10;
               case 10 -> 17;
               case 11 -> 77;
               case 12 -> 114;
               case 13 -> 233;
               case 14 -> 164;
               case 15 -> 206;
               case 16 -> 51;
               case 17 -> 221;
               case 18 -> 88;
               case 19 -> 130;
               case 20 -> 43;
               case 21 -> 123;
               case 22 -> 182;
               case 23 -> 231;
               case 24 -> 121;
               case 25 -> 143;
               case 26 -> 57;
               case 27 -> 136;
               case 28 -> 159;
               case 29 -> 158;
               case 30 -> 254;
               case 31 -> 105;
               case 32 -> 162;
               case 33 -> 179;
               case 34 -> 237;
               case 35 -> 216;
               case 36 -> 59;
               case 37 -> 253;
               case 38 -> 25;
               case 39 -> 71;
               case 40 -> 75;
               case 41 -> 157;
               case 42 -> 150;
               case 43 -> 45;
               case 44 -> 31;
               case 45 -> 26;
               case 46 -> 172;
               case 47 -> 63;
               case 48 -> 210;
               case 49 -> 191;
               case 50 -> 212;
               case 51 -> 165;
               case 52 -> 151;
               case 53 -> 76;
               case 54 -> 178;
               case 55 -> 161;
               case 56 -> 176;
               case 57 -> 15;
               case 58 -> 228;
               case 59 -> 85;
               case 60 -> 109;
               case 61 -> 149;
               case 62 -> 211;
               case 63 -> 192;
               case 64 -> 154;
               case 65 -> 144;
               case 66 -> 95;
               case 67 -> 70;
               case 68 -> 184;
               case 69 -> 215;
               case 70 -> 181;
               case 71 -> 208;
               case 72 -> 174;
               case 73 -> 203;
               case 74 -> 4;
               case 75 -> 97;
               case 76 -> 142;
               case 77 -> 79;
               case 78 -> 92;
               case 79 -> 50;
               case 80 -> 226;
               case 81 -> 236;
               case 82 -> 199;
               case 83 -> 125;
               case 84 -> 106;
               case 85 -> 8;
               case 86 -> 74;
               case 87 -> 227;
               case 88 -> 218;
               case 89 -> 5;
               case 90 -> 22;
               case 91 -> 28;
               case 92 -> 167;
               case 93 -> 64;
               case 94 -> 53;
               case 95 -> 61;
               case 96 -> 163;
               case 97 -> 171;
               case 98 -> 58;
               case 99 -> 44;
               case 100 -> 12;
               case 101 -> 140;
               case 102 -> 238;
               case 103 -> 90;
               case 104 -> 24;
               case 105 -> 65;
               case 106 -> 99;
               case 107 -> 124;
               case 108 -> 185;
               case 109 -> 18;
               case 110 -> 55;
               case 111 -> 193;
               case 112 -> 207;
               case 113 -> 122;
               case 114 -> 33;
               case 115 -> 16;
               case 116 -> 129;
               case 117 -> 248;
               case 118 -> 249;
               case 119 -> 229;
               case 120 -> 246;
               case 121 -> 21;
               case 122 -> 72;
               case 123 -> 131;
               case 124 -> 103;
               case 125 -> 225;
               case 126 -> 134;
               case 127 -> 132;
               case 128 -> 242;
               case 129 -> 183;
               case 130 -> 68;
               case 131 -> 250;
               case 132 -> 247;
               case 133 -> 11;
               case 134 -> 187;
               case 135 -> 145;
               case 136 -> 141;
               case 137 -> 60;
               case 138 -> 84;
               case 139 -> 110;
               case 140 -> 87;
               case 141 -> 96;
               case 142 -> 116;
               case 143 -> 196;
               case 144 -> 146;
               case 145 -> 189;
               case 146 -> 111;
               case 147 -> 2;
               case 148 -> 244;
               case 149 -> 148;
               case 150 -> 36;
               case 151 -> 119;
               case 152 -> 48;
               case 153 -> 0;
               case 154 -> 205;
               case 155 -> 9;
               case 156 -> 120;
               case 157 -> 220;
               case 158 -> 47;
               case 159 -> 168;
               case 160 -> 20;
               case 161 -> 173;
               case 162 -> 80;
               case 163 -> 38;
               case 164 -> 30;
               case 165 -> 73;
               case 166 -> 46;
               case 167 -> 155;
               case 168 -> 83;
               case 169 -> 42;
               case 170 -> 197;
               case 171 -> 102;
               case 172 -> 40;
               case 173 -> 23;
               case 174 -> 98;
               case 175 -> 135;
               case 176 -> 69;
               case 177 -> 198;
               case 178 -> 190;
               case 179 -> 188;
               case 180 -> 13;
               case 181 -> 101;
               case 182 -> 66;
               case 183 -> 194;
               case 184 -> 32;
               case 185 -> 81;
               case 186 -> 213;
               case 187 -> 224;
               case 188 -> 169;
               case 189 -> 160;
               case 190 -> 204;
               case 191 -> 100;
               case 192 -> 139;
               case 193 -> 78;
               case 194 -> 234;
               case 195 -> 180;
               case 196 -> 35;
               case 197 -> 14;
               case 198 -> 112;
               case 199 -> 27;
               case 200 -> 252;
               case 201 -> 255;
               case 202 -> 104;
               case 203 -> 82;
               case 204 -> 153;
               case 205 -> 127;
               case 206 -> 175;
               case 207 -> 217;
               case 208 -> 219;
               case 209 -> 186;
               case 210 -> 214;
               case 211 -> 37;
               case 212 -> 94;
               case 213 -> 107;
               case 214 -> 166;
               case 215 -> 91;
               case 216 -> 115;
               case 217 -> 245;
               case 218 -> 147;
               case 219 -> 118;
               case 220 -> 201;
               case 221 -> 1;
               case 222 -> 56;
               case 223 -> 137;
               case 224 -> 86;
               case 225 -> 202;
               case 226 -> 251;
               case 227 -> 138;
               case 228 -> 6;
               case 229 -> 29;
               case 230 -> 39;
               case 231 -> 93;
               case 232 -> 177;
               case 233 -> 128;
               case 234 -> 223;
               case 235 -> 235;
               case 236 -> 230;
               case 237 -> 243;
               case 238 -> 113;
               case 239 -> 3;
               case 240 -> 126;
               case 241 -> 232;
               case 242 -> 19;
               case 243 -> 195;
               case 244 -> 54;
               case 245 -> 49;
               case 246 -> 200;
               case 247 -> 52;
               case 248 -> 89;
               case 249 -> 67;
               case 250 -> 62;
               case 251 -> 133;
               case 252 -> 239;
               case 253 -> 240;
               case 254 -> 209;
               default -> 170;
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
      private static final IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] c() {
         return values();
      }

   }

   public static class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      public final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      public final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      public final IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      public final String lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;

      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         String var1,
         String var2,
         IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3,
         String var4
      ) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
      }
   }

    // PX-FIX JNIC placeholder (Phase 2: Ghidra restore)
    private static void $jnicClinit() {
    }

    // PX-FIX JNIC placeholder (Phase 2: Ghidra restore)
    private static void $jnicLoader() {
    }
}
