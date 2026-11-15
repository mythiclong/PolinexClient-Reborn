package me.octo.client;

import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class IIIlllllIlIIlllIllllIllIlllIlllIIIIIlIlIllIllIlIlIlIlIIIIIIlIIIIlIIIllllIllllllIIIIll
   extends IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl {
   @Nullable
   private volatile Path llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   @NotNull
   private final ConcurrentHashMap<String, String> lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   @Nullable
   private volatile String IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   private static boolean IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   private static String[] j;
   private static String[] k;

   public IIIlllllIlIIlllIllllIllIlllIlllIIIIIlIlIllIllIlIlIlIlIIIIIIlIIIIlIIIllllIllllllIIIIll(
      @NotNull String var1, @NotNull String var2, @NotNull String var3, @NotNull List<String> var4
   ) {
      short var10001 = -18613;
      short var10002 = 13727;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = -18618;
      var10002 = -24998;
      Intrinsics.checkNotNullParameter(var2, "description");
      var10001 = -18620;
      var10002 = 972;
      Intrinsics.checkNotNullParameter(var3, "parentFolderName");
      var10001 = -18611;
      var10002 = -6649;
      Intrinsics.checkNotNullParameter(var4, "requiredFiles");
      super(var1, var2, var3, new String[0], 0, var4, 16, null);
      this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = new ConcurrentHashMap<>();
   }

   @Nullable
   @Override
   protected Object a(
      @NotNull Continuation<? super Map<String, ? extends IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll>> var1
   ) {
      return a(this, var1);
   }

   static Object a(@NotNull IIIlllllIlIIlllIllllIllIlllIlllIIIIIlIlIllIllIlIlIlIlIIIIIIlIIIIlIIIllllIllllllIIIIll var0, @NotNull Continuation<? super Map<String, ? extends IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll>> var1) {
      return IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl.a(var0, var1);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private final void a(
      String var1,
      String var2,
      Map<String, IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> var3
   ) {
      List var5 = CollectionsKt.toList(var3.keySet());
      boolean var10000 = Y();
      int var6 = var5.indexOf(var2);
      boolean var4 = var10000;

      label26: {
         try {
            if (!var4) {
               break label26;
            }

            if (var6 < 0) {
               return;
            }
         } catch (Exception var10) {
            throw (RuntimeException)a(var10);
         }

         try {
            ;
         } catch (Exception var9) {
            return;
         }
      }

      try {
         Minecraft var11 = Minecraft.getInstance();
         short var10002 = -18605;
         short var10003 = 11931;
         Intrinsics.checkNotNullExpressionValue(var11, "getInstance(...)");
         Minecraft var7 = var11;
         var7.execute(null);
      } catch (Exception var8) {
      }
   }

   @NotNull
   @Override
   protected Set<Path> a(
      @NotNull Map<String, ? extends IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> param1
   ) {
      Intrinsics.checkNotNullParameter(param1, "items");
      boolean var2 = ac();
      Path var3 = this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
      if (!var2 && var3 != null && java.nio.file.Files.exists(var3)) {
         return SetsKt.setOf(var3);
      } else {
         return SetsKt.emptySet();
      }
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: sipush -18610
      // 04: sipush -10690
      // 07: pop2
      // 08: ldc_w "items"
      // 0b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 0e: invokestatic me/octo/client/IIIlllllIlIIlllIllllIllIlllIlllIIIIIlIlIllIllIlIlIlIlIIIIIIlIIIIlIIIllllIllllllIIIIll.ac ()Z
      // 11: aload 0
      // 12: getfield me/octo/client/IIIlllllIlIIlllIllllIllIlllIlllIIIIIlIlIllIllIlIlIlIlIIIIIIlIIIIlIIIllllIllllllIIIIll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI Ljava/nio/file/Path;
      // 15: astore 3
      // 16: istore 2
      // 17: aload 3
      // 18: iload 2
      // 19: ifne 27
      // 1c: ifnull 52
      // 1f: goto 26
      // 22: invokestatic me/octo/client/IIIlllllIlIIlllIllllIllIlllIlllIIIIIlIlIllIllIlIlIlIlIIIIIIlIIIIlIIIllllIllllllIIIIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: aload 3
      // 27: iload 2
      // 28: ifne 4c
      // 2b: bipush 0
      // 2c: anewarray 273
      // 2f: dup
      // 30: arraylength
      // 31: invokestatic java/util/Arrays.copyOf ([Ljava/lang/Object;I)[Ljava/lang/Object;
      // 34: checkcast [Ljava/nio/file/LinkOption;
      // 37: invokestatic java/nio/file/Files.exists (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
      // 3a: ifeq 52
      // 3d: goto 44
      // 40: invokestatic me/octo/client/IIIlllllIlIIlllIllllIllIlllIlllIIIIIlIlIllIllIlIlIlIlIIIIIIlIIIIlIIIllllIllllllIIIIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: aload 3
      // 45: goto 4c
      // 48: invokestatic me/octo/client/IIIlllllIlIIlllIllllIllIlllIlllIIIIIlIlIllIllIlIlIlIlIIIIIIlIIIIlIIIllllIllllllIIIIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b: athrow
      // 4c: invokestatic kotlin/collections/SetsKt.setOf (Ljava/lang/Object;)Ljava/util/Set;
      // 4f: goto 55
      // 52: invokestatic kotlin/collections/SetsKt.emptySet ()Ljava/util/Set;
      // 55: areturn
   }

   public void c(int param1) {
      boolean var2 = ac();
      String var3 = this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
      try {
         if (!var2 && var3 != null) {
            try {
               if (param1 >= 0) {
                  String[] var4 = this.w();
                  if (!var2 && param1 < var4.length) {
                     String var5 = this.H();
                     try {
                        if (!var2 && var5 != null) {
                           ((Map)this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII).put(var3, var5);
                        }
                     } catch (Exception var8) {
                        throw (RuntimeException)a(var8);
                     }
                  }
               }
            } catch (Exception var7) {
               throw (RuntimeException)a(var7);
            }
         }
      } catch (Exception var6) {
      }
      super.c(param1);
   }

   @Override
   public void a(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll param1) {
      short var10001 = -18621;
      short var10002 = 25774;
      Intrinsics.checkNotNullParameter(param1, "data");
      var10001 = -18619;
      var10002 = 21103;
      param1.a("index", Integer.valueOf(this.z()));
      boolean var2 = Y();
      llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var3 = new llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll();
      Map var4 = (Map)this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
      int var5 = 0;

      for (Object var7 : var4.entrySet()) {
         String var10 = (String)((Map.Entry)var7).getKey();
         String var11 = (String)((Map.Entry)var7).getValue();
         var3.a(var10, var11);
      }

      var10001 = -18607;
      var10002 = -23964;
      param1.a("locationRoutes", var3);
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         b(!var2);
      }
   }

   @Override
   public void b(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll param1) {
      boolean var2 = ac();
      short var10001 = -18615;
      short var10002 = -22596;
      if (!var2) {
         Intrinsics.checkNotNullParameter(param1, "data");
      }
      var10001 = -18609;
      var10002 = 8771;
      this.d(llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll.a(param1, "index", 0, 2, (Object)null));
      if (this.z() >= this.w().length) {
         this.d(0);
      }
      var10001 = -18617;
      var10002 = 27428;
      llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var3 = param1.a("locationRoutes");
      if (var3 != null) {
         this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.clear();
         String[] var5 = new String[7];
         var10001 = -18614;
         var10002 = 26687;
         var5[0] = "hub";
         var10001 = -18606;
         var10002 = -21744;
         var5[1] = "crimson_isle";
         var10001 = -18616;
         var10002 = 16026;
         var5[2] = "winter_island";
         var10001 = -18612;
         var10002 = 12802;
         var5[3] = "crystal_hollows";
         var10001 = -18623;
         var10002 = 28734;
         var5[4] = "spider_den";
         var10001 = -18608;
         var10002 = -28069;
         var5[5] = "end";
         var10001 = -18622;
         var10002 = 7735;
         var5[6] = "park";
         for (String var9 : CollectionsKt.listOf(var5)) {
            String var11 = var3.aString(var9, "");
            if (((CharSequence)var11).length() > 0) {
               ((Map)this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII).put(var9, var11);
            }
         }
      }
      this.C();
   }

   @NotNull
   public final IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI W() {
      return IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .g();
   }

   @Nullable
   public final String X() {
      return llIIIIllllIIIIlIIIlIlllllIllllIlIlIlIlIlIlIIlIIIllllIIlIllllIIlIlllIlIlIlIIIlllllIlll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
         .b(this.W());
   }

   private static final void a(IIIlllllIlIIlllIllllIllIlllIlllIIIIIlIlIllIllIlIlIlIlIIIIIIlIIIIlIIIllllIllllllIIIIll var0, String var1, int var2) {
      boolean var3 = Y();

      try {
         int var10000;
         label25: {
   pxClinit: {
            try {
               var10000 = ((Intrinsics.areEqual(var0.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll, var1)) ? 1 : 0);
               if (!var3) {
                  break label25;
               }

               if (var10000 == 0) {
                  break pxClinit;
               }
            } catch (Exception var5) {
               throw (RuntimeException)a(var5);
            }

            var10000 = var2;
         }
}

         if (var10000 < var0.w().length) {
            var0.d(var2);
         }
      } catch (Exception var6) {
      }
   }

   private static final void a(
      Minecraft var0, IIIlllllIlIIlllIllllIllIlllIlllIIIIIlIlIllIllIlIlIlIlIIIIIIlIIIIlIIIllllIllllllIIIIll var1, String var2, int var3
   ) {
      try {
         Thread.sleep(100L);
      }
      catch (InterruptedException interruptedException) {
         throw new RuntimeException(interruptedException);
      }
      var0.execute(null);
   }

   private static final void b(
      Minecraft var0, IIIlllllIlIIlllIllllIllIlllIlllIIIIIlIlIllIllIlIlIlIlIIIIIIlIIIIlIIIllllIllllllIIIIll var1, String var2, int var3
   ) {
      new Thread(() -> a(var0, var1, var2, var3)).start();
   }

   public static void b(boolean var0) {
      IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = var0;
   }

   public static boolean Y() {
      return IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   }

   public static boolean ac() {
      boolean var0 = Y();

      try {
         return !var0;
      } catch (IllegalStateException var1) {
         throw (RuntimeException)a(var1);
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[20];
      int var3 = 0;
      String var2 = "Le\u0019ì \u0083êp\u0003l/{4èýþ®ìW·X\nfyÄÉð4ååpb\u008e$)0J/\u0003q<-ün¯ø@¼6Ë¯\u0080`\u0001uv`Í\u0004C\u0080\u0010f\u0004\u0090ôúâ\u0005\u0091÷öbl\u0010æ\u00924 ö=Cj\u0005O~QÌ\u000f+F\u000e\u0017Ó\u0084ÃÉØÔiÅ\u0005\u008ftË\u007f\u000b\u00ad\fÊq\u0014Ì¶ñNO¹\u0004rF6¾\r\u009a<@íì±s;&«âØñ\u0004d\u009d¦Á\u0003ø\u0092ü\r}U\u0006LÔ¤Ã\u0094x÷·ýà\u000f\u0081\\¢\u009eT+d/\u008aÚ\u0002\u0097J\u001cà\u0005«\u0091±®\u0084\u0005øaÚáÃ\u000eÜ\u0085ý\tæ\u00811By`\u0018Ø9ê\u0003¼dÞ";
      int var4 = "Le\u0019ì \u0083êp\u0003l/{4èýþ®ìW·X\nfyÄÉð4ååpb\u008e$)0J/\u0003q<-ün¯ø@¼6Ë¯\u0080`\u0001uv`Í\u0004C\u0080\u0010f\u0004\u0090ôúâ\u0005\u0091÷öbl\u0010æ\u00924 ö=Cj\u0005O~QÌ\u000f+F\u000e\u0017Ó\u0084ÃÉØÔiÅ\u0005\u008ftË\u007f\u000b\u00ad\fÊq\u0014Ì¶ñNO¹\u0004rF6¾\r\u009a<@íì±s;&«âØñ\u0004d\u009d¦Á\u0003ø\u0092ü\r}U\u0006LÔ¤Ã\u0094x÷·ýà\u000f\u0081\\¢\u009eT+d/\u008aÚ\u0002\u0097J\u001cà\u0005«\u0091±®\u0084\u0005øaÚáÃ\u000eÜ\u0085ý\tæ\u00811By`\u0018Ø9ê\u0003¼dÞ"
         .length();
      b(true);
      char var1 = '\n';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 69;
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
                     case 0 -> 112;
                     case 1 -> 108;
                     case 2 -> 7;
                     case 3 -> 58;
                     case 4 -> 47;
                     case 5 -> 46;
                     default -> 112;
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
                     j = var5;
                     k = new String[20];
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

                  var2 = "\u001f¶E±£\u001cf\u001aj4l>S\u0001JÐ\fßuÄ\u00180\u0095°\u008aîÏ\u0012\u001e";
                  var4 = "\u001f¶E±£\u001cf\u001aj4l>S\u0001JÐ\fßuÄ\u00180\u0095°\u008aîÏ\u0012\u001e".length();
                  var1 = 16;
                  var8 = -1;
            }

            var10000 = 18;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String e(int var0, int var1) {
      int var2 = (var0 ^ -18623) & 65535;
      if (k[var2] == null) {
         char[] var3 = j[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 255;
            case 1 -> 126;
            case 2 -> 151;
            case 3 -> 77;
            case 4 -> 208;
            case 5 -> 236;
            case 6 -> 148;
            case 7 -> 0;
            case 8 -> 117;
            case 9 -> 114;
            case 10 -> 201;
            case 11 -> 222;
            case 12 -> 204;
            case 13 -> 158;
            case 14 -> 10;
            case 15 -> 232;
            case 16 -> 54;
            case 17 -> 212;
            case 18 -> 179;
            case 19 -> 71;
            case 20 -> 146;
            case 21 -> 127;
            case 22 -> 241;
            case 23 -> 32;
            case 24 -> 35;
            case 25 -> 64;
            case 26 -> 178;
            case 27 -> 141;
            case 28 -> 159;
            case 29 -> 87;
            case 30 -> 60;
            case 31 -> 73;
            case 32 -> 55;
            case 33 -> 176;
            case 34 -> 214;
            case 35 -> 246;
            case 36 -> 184;
            case 37 -> 61;
            case 38 -> 166;
            case 39 -> 136;
            case 40 -> 90;
            case 41 -> 172;
            case 42 -> 191;
            case 43 -> 112;
            case 44 -> 181;
            case 45 -> 253;
            case 46 -> 147;
            case 47 -> 244;
            case 48 -> 72;
            case 49 -> 217;
            case 50 -> 139;
            case 51 -> 68;
            case 52 -> 120;
            case 53 -> 103;
            case 54 -> 81;
            case 55 -> 173;
            case 56 -> 251;
            case 57 -> 5;
            case 58 -> 183;
            case 59 -> 250;
            case 60 -> 219;
            case 61 -> 242;
            case 62 -> 24;
            case 63 -> 247;
            case 64 -> 170;
            case 65 -> 118;
            case 66 -> 15;
            case 67 -> 33;
            case 68 -> 157;
            case 69 -> 195;
            case 70 -> 38;
            case 71 -> 153;
            case 72 -> 205;
            case 73 -> 137;
            case 74 -> 131;
            case 75 -> 161;
            case 76 -> 95;
            case 77 -> 230;
            case 78 -> 149;
            case 79 -> 91;
            case 80 -> 3;
            case 81 -> 96;
            case 82 -> 80;
            case 83 -> 119;
            case 84 -> 18;
            case 85 -> 19;
            case 86 -> 197;
            case 87 -> 128;
            case 88 -> 88;
            case 89 -> 235;
            case 90 -> 209;
            case 91 -> 115;
            case 92 -> 185;
            case 93 -> 12;
            case 94 -> 122;
            case 95 -> 8;
            case 96 -> 187;
            case 97 -> 7;
            case 98 -> 56;
            case 99 -> 140;
            case 100 -> 160;
            case 101 -> 53;
            case 102 -> 142;
            case 103 -> 62;
            case 104 -> 113;
            case 105 -> 188;
            case 106 -> 100;
            case 107 -> 31;
            case 108 -> 224;
            case 109 -> 67;
            case 110 -> 239;
            case 111 -> 59;
            case 112 -> 16;
            case 113 -> 150;
            case 114 -> 152;
            case 115 -> 104;
            case 116 -> 215;
            case 117 -> 254;
            case 118 -> 156;
            case 119 -> 82;
            case 120 -> 238;
            case 121 -> 52;
            case 122 -> 240;
            case 123 -> 79;
            case 124 -> 2;
            case 125 -> 129;
            case 126 -> 237;
            case 127 -> 248;
            case 128 -> 65;
            case 129 -> 40;
            case 130 -> 39;
            case 131 -> 99;
            case 132 -> 221;
            case 133 -> 192;
            case 134 -> 57;
            case 135 -> 29;
            case 136 -> 48;
            case 137 -> 111;
            case 138 -> 182;
            case 139 -> 145;
            case 140 -> 207;
            case 141 -> 4;
            case 142 -> 107;
            case 143 -> 26;
            case 144 -> 121;
            case 145 -> 124;
            case 146 -> 45;
            case 147 -> 74;
            case 148 -> 234;
            case 149 -> 210;
            case 150 -> 63;
            case 151 -> 169;
            case 152 -> 94;
            case 153 -> 167;
            case 154 -> 21;
            case 155 -> 227;
            case 156 -> 46;
            case 157 -> 196;
            case 158 -> 76;
            case 159 -> 105;
            case 160 -> 93;
            case 161 -> 27;
            case 162 -> 216;
            case 163 -> 202;
            case 164 -> 162;
            case 165 -> 98;
            case 166 -> 171;
            case 167 -> 11;
            case 168 -> 198;
            case 169 -> 252;
            case 170 -> 138;
            case 171 -> 199;
            case 172 -> 6;
            case 173 -> 218;
            case 174 -> 135;
            case 175 -> 194;
            case 176 -> 134;
            case 177 -> 49;
            case 178 -> 163;
            case 179 -> 84;
            case 180 -> 43;
            case 181 -> 243;
            case 182 -> 190;
            case 183 -> 42;
            case 184 -> 86;
            case 185 -> 165;
            case 186 -> 229;
            case 187 -> 189;
            case 188 -> 220;
            case 189 -> 50;
            case 190 -> 133;
            case 191 -> 180;
            case 192 -> 211;
            case 193 -> 155;
            case 194 -> 200;
            case 195 -> 233;
            case 196 -> 85;
            case 197 -> 108;
            case 198 -> 168;
            case 199 -> 225;
            case 200 -> 228;
            case 201 -> 22;
            case 202 -> 30;
            case 203 -> 193;
            case 204 -> 1;
            case 205 -> 154;
            case 206 -> 75;
            case 207 -> 177;
            case 208 -> 143;
            case 209 -> 37;
            case 210 -> 58;
            case 211 -> 41;
            case 212 -> 116;
            case 213 -> 66;
            case 214 -> 186;
            case 215 -> 14;
            case 216 -> 213;
            case 217 -> 25;
            case 218 -> 20;
            case 219 -> 70;
            case 220 -> 9;
            case 221 -> 51;
            case 222 -> 34;
            case 223 -> 13;
            case 224 -> 206;
            case 225 -> 106;
            case 226 -> 102;
            case 227 -> 23;
            case 228 -> 175;
            case 229 -> 36;
            case 230 -> 89;
            case 231 -> 123;
            case 232 -> 226;
            case 233 -> 223;
            case 234 -> 203;
            case 235 -> 125;
            case 236 -> 132;
            case 237 -> 231;
            case 238 -> 110;
            case 239 -> 174;
            case 240 -> 44;
            case 241 -> 47;
            case 242 -> 144;
            case 243 -> 249;
            case 244 -> 28;
            case 245 -> 245;
            case 246 -> 92;
            case 247 -> 69;
            case 248 -> 17;
            case 249 -> 109;
            case 250 -> 130;
            case 251 -> 83;
            case 252 -> 101;
            case 253 -> 78;
            case 254 -> 97;
            default -> 164;
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

         k[var2] = new String(var3).intern();
      }

      return k[var2];
   }
}
