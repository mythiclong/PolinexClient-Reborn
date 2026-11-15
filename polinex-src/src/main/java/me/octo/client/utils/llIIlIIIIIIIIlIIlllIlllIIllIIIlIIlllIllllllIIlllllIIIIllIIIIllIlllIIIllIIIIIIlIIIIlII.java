package me.octo.client.utils;

import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class llIIlIIIIIIIIlIIlllIlllIIllIIIlIIlllIllllllIIlllllIIIIllIIIIllIlllIIIllIIIIIIlIIIIlII {
    public static <T> T a(Object... args) { return null; } // PX-FIX ovld-var
   @NotNull
   public static llIIlIIIIIIIIlIIlllIlllIIllIIIlIIlllIllllllIIlllllIIIIllIIIIllIlllIIIllIIIIIIlIIIIlII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String[] a;
   private static String[] b;

   private llIIlIIIIIIIIlIIlllIlllIIllIIIlIIlllIllllllIIlllllIIIIllIIIIllIlllIIIllIIIIIIlIIIIlII() {
   }

   public final boolean a() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final void a(boolean var1) {
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
   }

   @JvmStatic
   @JvmOverloads
   public static final boolean a(@NotNull String var0, boolean var1) { int[] var2 = null; // PX-FIX hoist
        
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      short var10002 = 21859;
      short var10003 = 22391;
      Intrinsics.checkNotNullParameter(var0, "operation");
       var2 = var10000;
      int var3 = GL11.glGetError();
      int var6 = var3;
      if (var2 != null) {
         if (var3 != 0) {
            int var7 =(( var1) ? 1 : 0);
            if (var2 != null) {
               if (!var1) {
                  if (var2 == null) {
                     return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                  }

                  if (!lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
                     return true;
                  }
               }

               var7 = var3;
            }

            String var4 = a(var7);
            int var9 = var0.length();
            if (var2 != null) {
               var9 = var9 > 0 ? 1 : 0;
            }

            String var10;
            if (var9 != 0) {
               var10002 = 21869;
               var10003 = -12805;
               var10003 = 21858;
               short var10004 = 3842;
               var10 = "GL Error " + var4 + " during " + var0;
            } else {
               short var10001 = 21877;
               var10002 = -17070;
               var10 = "GL Error " + var4;
            }

            String var5 = var10;
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c(var5);
            return true;
         }

         var6 = 0;
      }

      return (var6 != 0);
   }

   public static boolean a(@NotNull String var0, boolean var1, int var2, Object var3) {
      int[] var4 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      if (var4 != null) {
         if ((var2 & 1) != 0) {
            var0 = "";
         }

         if ((var2 & 2) != 0) {
            var1 = false;
         }
      }

      return a(var0, var1);
   }

   @JvmStatic
   @NotNull
   public static final String a(int var0) {
      int[] var1 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      int var10000 = var0;
      if (var1 != null) {
         switch (var0) {
            case 0:
               short var8 = 21876;
               short var14 = -12146;
               return "NO_ERROR";
            case 1280:
               short var7 = 21872;
               short var13 = -23885;
               return "GL_INVALID_ENUM";
            case 1281:
               short var6 = 21863;
               short var12 = -18471;
               return "GL_INVALID_VALUE";
            case 1282:
               short var5 = 21860;
               short var11 = 26844;
               return "GL_INVALID_OPERATION";
            case 1285:
               short var4 = 21880;
               short var10 = -28217;
               return "GL_OUT_OF_MEMORY";
            case 1286:
               short var3 = 21878;
               short var9 = 4989;
               return "GL_INVALID_FRAMEBUFFER_OPERATION";
            default:
               var10000 = var0;
         }
      }

      short var10001 = 21856;
      short var10002 = 15637;
      return "UNKNOWN(" + var10000 + ")";
   }

   @JvmStatic
   public static final int b() {
       int var2 = 0; // PX-FIX decl var2
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      int var1 = 0;
      int[] var0 = var10000;

      label49: {
         byte var10001;
         while (true) {
            if (GL11.glGetError() != 0) {
               var2 = var1;
               var10001 = 100;
               if (var0 == null || var0 == null) {
                  break;
               }

               if (var1 < 100) {
                  var1++;
                  if (var0 != null) {
                     continue;
                  }
               }
            }

            var2 = var1;
            if (var0 == null) {
               break label49;
            }

            var10001 = 100;
            break;
         }

         if (var2 >= var10001) {
            short var3 = 21884;
            var10001 =(byte)( 29307);
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("Cleared 100 GL errors, may be in error state");
            return -1;
         }

         var2 = var1;
      }

      if (var0 != null) {
         if (var2 > 0) {
            if (var0 == null) {
               return (lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII ? 1 : 0);
            }

            if (lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
               short var4 = 21864;
               short var10002 = -7176;
               var10002 = 21865;
               short var10003 = -16574;
               lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("Cleared " + var1 + " pending GL errors");
            }
         }

         var2 = var1;
      }

      return var2;
   }

   @JvmStatic
   public static final int c() {
      return b();
   }

   @JvmStatic
   @NotNull
   public static final String b(int var0) {
      int[] var1 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      int var10000 = var0;
      if (var1 != null) {
         switch (var0) {
            case 36053:
               short var9 = 21861;
               short var16 = -4066;
               return "COMPLETE";
            case 36054:
               short var8 = 21882;
               short var15 = 30658;
               return "INCOMPLETE_ATTACHMENT";
            case 36055:
               short var7 = 21887;
               short var14 = -26637;
               return "MISSING_ATTACHMENT";
            case 36059:
               short var6 = 21874;
               short var13 = -32206;
               return "INCOMPLETE_DRAW_BUFFER";
            case 36060:
               short var5 = 21886;
               short var12 = 2851;
               return "INCOMPLETE_READ_BUFFER";
            case 36061:
               short var4 = 21870;
               short var11 = -19538;
               return "UNSUPPORTED";
            case 36182:
               short var3 = 21867;
               short var10 = 19468;
               return "INCOMPLETE_MULTISAMPLE";
            default:
               var10000 = var0;
         }
      }

      short var10001 = 21875;
      short var10002 = 1819;
      return "UNKNOWN(" + var10000 + ")";
   }

   @JvmStatic
   public static final boolean c(int var0) { int var2 = 0; // PX-FIX hoist
        
      String var6 = null; // PX-FIX
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
       var2 = GL30.glCheckFramebufferStatus(36160);
      int[] var1 = var10000;
      int var4 = var2;
      if (var1 != null) {
         if (var2 != 36053) {
            label18: {
               int var5 = var0;
               if (var1 != null) {
                  if (var0 < 0) {
                     var6 = "";
                     break label18;
                  }

                  var5 = var0;
               }

               short var10001 = 21873;
               short var10002 = 3388;
               var6 = " (FBO " + var5 + ")";
            }

            String var3 = var6;
            String var7 = b(var2);
            short var8 = 21871;
            short var10003 = -31909;
            var10003 = 21881;
            short var10004 = 3992;
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("Framebuffer incomplete" + var3 + ": " + var7);
            return false;
         }

         var4 = 1;
      }

      return (var4 != 0);
   }

   public static boolean a(int var0, int var1, Object var2) {
      int[] var3 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      if (var3 != null) {
         if ((var1 & 1) != 0) {
            var0 = -1;
         }
      }

      return c(var0);
   }

   @JvmStatic
   @JvmOverloads
   @NotNull
   public static final llIIlIIIIIIIIlIIlllIlllIIllIIIlIIlllIllllllIIlllllIIIIllIIIIllIlllIIIllIIIIIIlIIIIlII.PXEvMid a(
      boolean var0, boolean var1
   ) {
      return llIIlIIIIIIIIlIIlllIlllIIllIIIlIIlllIllllllIIlllllIIIIllIIIIllIlllIIIllIIIIIIlIIIIlII.PXEvMid.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var0, var1);
   }

   @NotNull
   public static llIIlIIIIIIIIlIIlllIlllIIllIIIlIIlllIllllllIIlllllIIIIllIIIIllIlllIIIllIIIIIIlIIIIlII.PXEvMid a(
      boolean var0, boolean var1, int var2, Object var3
   ) {
      int[] var4 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      if (var4 != null) {
         if ((var2 & 1) != 0) {
            var0 = true;
         }

         if ((var2 & 2) != 0) {
            var1 = true;
         }
      }

      return a(var0, var1);
   }

   @JvmStatic
   public static final void d(int var0) {
      int[] var1 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      if (var1 != null && var0 > 0) {
         GL30.glDeleteFramebuffers(var0);
         short var10001 = 21862;
         short var10002 = 25758;
         a("glDeleteFramebuffers(" + var0 + ")", true);
      }
   }

   @JvmStatic
   public static final void e(int var0) {
      int[] var1 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      if (var1 != null && var0 > 0) {
         GL11.glDeleteTextures(var0);
         short var10001 = 21866;
         short var10002 = -12615;
         a("glDeleteTextures(" + var0 + ")", true);
      }
   }

   @JvmStatic
   public static final void f(int var0) {
      int[] var1 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      if (var1 != null && var0 > 0) {
         GL20.glDeleteProgram(var0);
         short var10001 = 21857;
         short var10002 = -9003;
         a("glDeleteProgram(" + var0 + ")", true);
      }
   }

   @JvmStatic
   public static final void g(int var0) {
      int[] var1 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      if (var1 != null && var0 > 0) {
         GL30.glDeleteVertexArrays(var0);
         short var10001 = 21868;
         short var10002 = -22809;
         a("glDeleteVertexArrays(" + var0 + ")", true);
      }
   }

   @JvmStatic
   public static final void a(@NotNull Function0<Unit> var0) { llIIlIIIIIIIIlIIlllIlllIIllIIIlIIlllIllllllIIlllllIIIIllIIIIllIlllIIIllIIIIIIlIIIIlII.PXEvMid var2 = null; // PX-FIX hoist
        
      short var10001 = 21879;
      short var10002 = -24916;
      Intrinsics.checkNotNullParameter(var0, "block");
      boolean var1 = false;
       var2 = a(
         false, false);

      try {
         var0.invoke();
      } finally {
         InlineMarker.finallyStart(1);
         var2.a();
         InlineMarker.finallyEnd(1);
      }
   }

   @JvmStatic
   public static final boolean a(@NotNull String var0, @NotNull Function0<Unit> var1) { int[] var2 = null; // PX-FIX hoist
        
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      short var10002 = 21883;
      short var10003 = -769;
      Intrinsics.checkNotNullParameter(var0, "operation");
      var10002 = 21885;
      var10003 = 2322;
      Intrinsics.checkNotNullParameter(var1, "block");
      boolean var3 = false;
       var2 = var10000;
      b();
      var1.invoke();
      boolean var4 = a(var0, false);
      if (var2 != null) {
         var4 = !var4;
      }

      return var4;
   }

   @JvmStatic
   @JvmOverloads
   public static final boolean a(@NotNull String var0) {
      short var10001 = 21883;
      short var10002 = -769;
      Intrinsics.checkNotNullParameter(var0, "operation");
      return a(var0, false);
   }

   @JvmStatic
   @JvmOverloads
   public static final boolean d() {
      return a(null, false);
   }

   @JvmStatic
   @JvmOverloads
   @NotNull
   public static final llIIlIIIIIIIIlIIlllIlllIIllIIIlIIlllIllllllIIlllllIIIIllIIIIllIlllIIIllIIIIIIlIIIIlII.PXEvMid b(
      boolean var0
   ) {
      return a(var0, false);
   }

   @JvmStatic
   @JvmOverloads
   @NotNull
   public static final llIIlIIIIIIIIlIIlllIlllIIllIIIlIIlllIllllllIIlllllIIIIllIIIIllIlllIIIllIIIIIIlIIIIlII.PXEvMid e() {
      return a(false, false);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static { String var2 = null; // PX-FIX hoist
        
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[32];
      int var3 = 0;
       var2 = "ê\\ÂsºJ\u0097Äü\u000e.3º¤ý\u0097\u0002\u0099_\u00159Îkc\bLÉ\u008aT\u0096y}\u0019ò ?ZóL\u0002P\tD\u001d\u0000Ý«%1-ð,Ò\u008d{C×\u0096Â'}\u009fúæøÔ\u008cÆ¨\u0011Eº9[æÀë¢Æ\u0000\u0085ò\u007ff\u0088Ü'<K¦¹\u0098±\u000f¤5\u0005·ÉØÉñ\u0016÷C²Ò3z®L¸Näu»\u0097Â8¹\u0094xý¤\u007f\u0012Ø{Ã.\u000bd&HÖ\u0086\u0095LùÈEám÷\u000f\u009eíLCp\u0088¨ÝÉUt ¢Ü\u0082\u0006TH\u0087\u00142~\u0016îÒ\u0091àW<\"\u0084)WÖ@êå\u000evQ]eÄ\u0007X\bÝ\u0091`\u0089b7Äo\b§+Cô\u008d÷\u0086¨\t.ñ%ÌñÐ\rHÿ \u001a0Üøbÿê3\u0081\u0088}\u0098\u009f¼ºG\u009e\"\u009c+8¥I\u008c¿q)âu\u0080PL\u0005 w*\u001e¯\bF5éT\u0085t\u0088{\u0012pè \u007fªó³A\t\u008b;ý\u0011\u0089\u0085\u009e\u0091P\u0011\u0092Ïò\u000fý\u009bJÃ\u001b»·É\"Ñæ\u0089R\u0016\u0098\u0014_8\u008e'\u0019çN;:ÄpP¹zÕ\u001cÍlq\u008e\u0015Xß«\rÖÛ/Ëµº*éÊßÍ\u0002Íoÿ\u0005á\tbÜ¬iÀd+Þ;\u000bø\u0095Ü\u0012ñ;Ksg\\\u0004\u0016Ïèy>\u0004³\\\"Êäóvýä\u0084¬\u009d\u0015\u001cov]\b\u0017¯9NIÏ¡p\u0010à¯¼\u00034\u001asó8ª@\r.+\u0088ü\b\u001d\u0007\u009d\b\u0002\u0085\u0003/\t{\u000fç\u009fWm®$\u0003\u0014\u0015Ù=Å^XmÇq\u0016cB^Ëß)Øw\u0089\u0016\b)\u001c,\u0007.)4\u0091";
      int var4 = "ê\\ÂsºJ\u0097Äü\u000e.3º¤ý\u0097\u0002\u0099_\u00159Îkc\bLÉ\u008aT\u0096y}\u0019ò ?ZóL\u0002P\tD\u001d\u0000Ý«%1-ð,Ò\u008d{C×\u0096Â'}\u009fúæøÔ\u008cÆ¨\u0011Eº9[æÀë¢Æ\u0000\u0085ò\u007ff\u0088Ü'<K¦¹\u0098±\u000f¤5\u0005·ÉØÉñ\u0016÷C²Ò3z®L¸Näu»\u0097Â8¹\u0094xý¤\u007f\u0012Ø{Ã.\u000bd&HÖ\u0086\u0095LùÈEám÷\u000f\u009eíLCp\u0088¨ÝÉUt ¢Ü\u0082\u0006TH\u0087\u00142~\u0016îÒ\u0091àW<\"\u0084)WÖ@êå\u000evQ]eÄ\u0007X\bÝ\u0091`\u0089b7Äo\b§+Cô\u008d÷\u0086¨\t.ñ%ÌñÐ\rHÿ \u001a0Üøbÿê3\u0081\u0088}\u0098\u009f¼ºG\u009e\"\u009c+8¥I\u008c¿q)âu\u0080PL\u0005 w*\u001e¯\bF5éT\u0085t\u0088{\u0012pè \u007fªó³A\t\u008b;ý\u0011\u0089\u0085\u009e\u0091P\u0011\u0092Ïò\u000fý\u009bJÃ\u001b»·É\"Ñæ\u0089R\u0016\u0098\u0014_8\u008e'\u0019çN;:ÄpP¹zÕ\u001cÍlq\u008e\u0015Xß«\rÖÛ/Ëµº*éÊßÍ\u0002Íoÿ\u0005á\tbÜ¬iÀd+Þ;\u000bø\u0095Ü\u0012ñ;Ksg\\\u0004\u0016Ïèy>\u0004³\\\"Êäóvýä\u0084¬\u009d\u0015\u001cov]\b\u0017¯9NIÏ¡p\u0010à¯¼\u00034\u001asó8ª@\r.+\u0088ü\b\u001d\u0007\u009d\b\u0002\u0085\u0003/\t{\u000fç\u009fWm®$\u0003\u0014\u0015Ù=Å^XmÇq\u0016cB^Ëß)Øw\u0089\u0016\b)\u001c,\u0007.)4\u0091"
         .length();
      char var1 = 16;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 27;
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
                     case 0 -> 40;
                     case 1 -> 99;
                     case 2 -> 18;
                     case 3 -> 102;
                     case 4 -> 57;
                     case 5 -> 98;
                     default -> 63;
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
                     b = new String[32];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIlIIIIIIIIlIIlllIlllIIllIIIlIIlllIllllllIIlllllIIIIllIIIIllIlllIIIllIIIIIIlIIIIlII();
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

                  var2 = "\u0084\u008eSDª\u0091Ãá[\u008b\u0095@/©&âu\u0082\u0016_Õ\u0010|ÞsFôK[ÆÔU´PÖÙ\u0099$";
                  var4 = "\u0084\u008eSDª\u0091Ãá[\u008b\u0095@/©&âu\u0082\u0016_Õ\u0010|ÞsFôK[ÆÔU´PÖÙ\u0099$".length();
                  var1 = 21;
                  var8 = -1;
            }

            var10000 = 24;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String a(int var0, int var1) { int var2 = 0; // PX-FIX hoist
        
       var2 = (var0 ^ 21880) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 119;
            case 1 -> 105;
            case 2 -> 1;
            case 3 -> 34;
            case 4 -> 141;
            case 5 -> 57;
            case 6 -> 171;
            case 7 -> 2;
            case 8 -> 103;
            case 9 -> 162;
            case 10 -> 127;
            case 11 -> 163;
            case 12 -> 181;
            case 13 -> 74;
            case 14 -> 106;
            case 15 -> 50;
            case 16 -> 58;
            case 17 -> 215;
            case 18 -> 198;
            case 19 -> 59;
            case 20 -> 234;
            case 21 -> 104;
            case 22 -> 182;
            case 23 -> 220;
            case 24 -> 89;
            case 25 -> 52;
            case 26 -> 197;
            case 27 -> 101;
            case 28 -> 78;
            case 29 -> 248;
            case 30 -> 154;
            case 31 -> 95;
            case 32 -> 9;
            case 33 -> 237;
            case 34 -> 71;
            case 35 -> 3;
            case 36 -> 164;
            case 37 -> 83;
            case 38 -> 123;
            case 39 -> 247;
            case 40 -> 92;
            case 41 -> 15;
            case 42 -> 107;
            case 43 -> 11;
            case 44 -> 20;
            case 45 -> 137;
            case 46 -> 244;
            case 47 -> 188;
            case 48 -> 153;
            case 49 -> 202;
            case 50 -> 72;
            case 51 -> 172;
            case 52 -> 176;
            case 53 -> 146;
            case 54 -> 212;
            case 55 -> 225;
            case 56 -> 250;
            case 57 -> 241;
            case 58 -> 134;
            case 59 -> 131;
            case 60 -> 108;
            case 61 -> 22;
            case 62 -> 94;
            case 63 -> 28;
            case 64 -> 133;
            case 65 -> 124;
            case 66 -> 45;
            case 67 -> 223;
            case 68 -> 31;
            case 69 -> 191;
            case 70 -> 12;
            case 71 -> 66;
            case 72 -> 80;
            case 73 -> 6;
            case 74 -> 112;
            case 75 -> 151;
            case 76 -> 206;
            case 77 -> 0;
            case 78 -> 187;
            case 79 -> 165;
            case 80 -> 17;
            case 81 -> 229;
            case 82 -> 75;
            case 83 -> 142;
            case 84 -> 185;
            case 85 -> 255;
            case 86 -> 64;
            case 87 -> 159;
            case 88 -> 179;
            case 89 -> 147;
            case 90 -> 199;
            case 91 -> 79;
            case 92 -> 240;
            case 93 -> 218;
            case 94 -> 51;
            case 95 -> 193;
            case 96 -> 232;
            case 97 -> 63;
            case 98 -> 102;
            case 99 -> 178;
            case 100 -> 117;
            case 101 -> 7;
            case 102 -> 35;
            case 103 -> 245;
            case 104 -> 208;
            case 105 -> 125;
            case 106 -> 186;
            case 107 -> 219;
            case 108 -> 167;
            case 109 -> 144;
            case 110 -> 140;
            case 111 -> 254;
            case 112 -> 130;
            case 113 -> 233;
            case 114 -> 61;
            case 115 -> 205;
            case 116 -> 207;
            case 117 -> 194;
            case 118 -> 139;
            case 119 -> 231;
            case 120 -> 128;
            case 121 -> 189;
            case 122 -> 174;
            case 123 -> 68;
            case 124 -> 168;
            case 125 -> 18;
            case 126 -> 47;
            case 127 -> 55;
            case 128 -> 62;
            case 129 -> 38;
            case 130 -> 204;
            case 131 -> 166;
            case 132 -> 44;
            case 133 -> 97;
            case 134 -> 13;
            case 135 -> 85;
            case 136 -> 93;
            case 137 -> 252;
            case 138 -> 226;
            case 139 -> 183;
            case 140 -> 227;
            case 141 -> 19;
            case 142 -> 43;
            case 143 -> 87;
            case 144 -> 239;
            case 145 -> 40;
            case 146 -> 209;
            case 147 -> 136;
            case 148 -> 180;
            case 149 -> 26;
            case 150 -> 14;
            case 151 -> 129;
            case 152 -> 135;
            case 153 -> 86;
            case 154 -> 111;
            case 155 -> 246;
            case 156 -> 196;
            case 157 -> 118;
            case 158 -> 169;
            case 159 -> 200;
            case 160 -> 120;
            case 161 -> 243;
            case 162 -> 88;
            case 163 -> 157;
            case 164 -> 70;
            case 165 -> 173;
            case 166 -> 216;
            case 167 -> 221;
            case 168 -> 170;
            case 169 -> 46;
            case 170 -> 8;
            case 171 -> 42;
            case 172 -> 39;
            case 173 -> 201;
            case 174 -> 67;
            case 175 -> 149;
            case 176 -> 99;
            case 177 -> 36;
            case 178 -> 91;
            case 179 -> 184;
            case 180 -> 203;
            case 181 -> 29;
            case 182 -> 73;
            case 183 -> 126;
            case 184 -> 10;
            case 185 -> 48;
            case 186 -> 81;
            case 187 -> 82;
            case 188 -> 190;
            case 189 -> 253;
            case 190 -> 156;
            case 191 -> 100;
            case 192 -> 249;
            case 193 -> 21;
            case 194 -> 115;
            case 195 -> 5;
            case 196 -> 150;
            case 197 -> 132;
            case 198 -> 192;
            case 199 -> 145;
            case 200 -> 210;
            case 201 -> 76;
            case 202 -> 110;
            case 203 -> 16;
            case 204 -> 228;
            case 205 -> 155;
            case 206 -> 213;
            case 207 -> 98;
            case 208 -> 116;
            case 209 -> 25;
            case 210 -> 138;
            case 211 -> 33;
            case 212 -> 37;
            case 213 -> 109;
            case 214 -> 222;
            case 215 -> 32;
            case 216 -> 24;
            case 217 -> 41;
            case 218 -> 90;
            case 219 -> 27;
            case 220 -> 152;
            case 221 -> 158;
            case 222 -> 148;
            case 223 -> 143;
            case 224 -> 4;
            case 225 -> 217;
            case 226 -> 65;
            case 227 -> 195;
            case 228 -> 69;
            case 229 -> 211;
            case 230 -> 236;
            case 231 -> 114;
            case 232 -> 30;
            case 233 -> 224;
            case 234 -> 230;
            case 235 -> 77;
            case 236 -> 54;
            case 237 -> 177;
            case 238 -> 96;
            case 239 -> 122;
            case 240 -> 251;
            case 241 -> 238;
            case 242 -> 235;
            case 243 -> 84;
            case 244 -> 49;
            case 245 -> 160;
            case 246 -> 121;
            case 247 -> 56;
            case 248 -> 214;
            case 249 -> 113;
            case 250 -> 23;
            case 251 -> 175;
            case 252 -> 161;
            case 253 -> 53;
            case 254 -> 60;
            default -> 242;
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

   public static final class PXEvMid {
        // PX-RESTORE X1: jar row50 = ...$llIIllll(85) synthetic Kotlin default-args ctor
        // jar descriptor ([IIIII[FIIIZZZZZIZZLkotlin/jvm/internal/DefaultConstructorMarker;)V
        public PXEvMid(
           int[] var1, int var2, int var3, int var4, int var5, float[] var6, int var7, int var8, int var9,
           boolean var10, boolean var11, boolean var12, boolean var13, boolean var14, int var15, boolean var16,
           boolean var17, DefaultConstructorMarker var18
        ) {
           this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17);
        }

      @NotNull
      public static llIIlIIIIIIIIlIIlllIlllIIllIIIlIIlllIllllllIIlllllIIIIllIIIIllIlllIIIllIIIIIIlIIIIlII.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final int[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private final int IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      @NotNull
      private final float[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private final int lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      private final int IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      private final int llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      private final boolean lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      private final boolean lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      private final boolean lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      private final boolean lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      private final boolean IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      private final int llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      private final boolean IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
      private final boolean IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
      private static String a;

      private PXEvMid(
         int[] var1,
         int var2,
         int var3,
         int var4,
         int var5,
         float[] var6,
         int var7,
         int var8,
         int var9,
         boolean var10,
         boolean var11,
         boolean var12,
         boolean var13,
         boolean var14,
         int var15,
         boolean var16,
         boolean var17
      ) {
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var2;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var3;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var4;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var5;
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var6;
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var7;
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var8;
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var9;
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var10;
         this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var11;
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var12;
         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var13;
         this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var14;
         this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var15;
         this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = var16;
         this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var17;
      }

      public final void a() {
int[] var1 = me.octo.client.utils.lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
try {
   if (var1 != null) {
      if (this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl) {
         if (this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl && var1 != null) {
            org.lwjgl.opengl.GL11.glEnable(3042);
         } else {
            org.lwjgl.opengl.GL11.glDisable(3042);
         }
         if (this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI && var1 != null) {
            org.lwjgl.opengl.GL11.glEnable(2929);
         } else {
            org.lwjgl.opengl.GL11.glDisable(2929);
         }
         if (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl && var1 != null) {
            org.lwjgl.opengl.GL11.glEnable(2884);
         } else {
            org.lwjgl.opengl.GL11.glDisable(2884);
         }
         if (this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll && var1 != null) {
            org.lwjgl.opengl.GL11.glEnable(3089);
         } else {
            org.lwjgl.opengl.GL11.glDisable(3089);
         }
         if (this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl && var1 != null) {
            org.lwjgl.opengl.GL11.glEnable(2960);
         } else {
            org.lwjgl.opengl.GL11.glDisable(2960);
         }
      }
      org.lwjgl.opengl.GL13.glActiveTexture(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
      org.lwjgl.opengl.GL11.glBindTexture(3553, this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
      if (this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl) {
         org.lwjgl.opengl.GL30.glBindVertexArray(this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI);
      }
      org.lwjgl.opengl.GL30.glBindFramebuffer(36009, this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      org.lwjgl.opengl.GL30.glBindFramebuffer(36008, this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      org.lwjgl.opengl.GL11.glViewport(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[0], this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[1], this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[2], this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[3]);
      org.lwjgl.opengl.GL11.glClearColor(this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[0], this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[1], this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[2], this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[3]);
      org.lwjgl.opengl.GL11.glReadBuffer(this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll);
      org.lwjgl.opengl.GL11.glDrawBuffer(this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII);
   }
   org.lwjgl.opengl.GL20.glUseProgram(this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI);
} catch (Exception var2) {
   me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c(a + var2.getMessage());
}
      }

      @JvmStatic
      @JvmOverloads
      @NotNull
      public static final llIIlIIIIIIIIlIIlllIlllIIllIIIlIIlllIllllllIIlllllIIIIllIIIIllIlllIIIllIIIIIIlIIIIlII.PXEvMid a(
         boolean var0, boolean var1
      ) {
         return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0, var1);
      }

      @JvmStatic
      @JvmOverloads
      @NotNull
      public static final llIIlIIIIIIIIlIIlllIlllIIllIIIlIIlllIllllllIIlllllIIIIllIIIIllIlllIIIllIIIIIIlIIIIlII.PXEvMid a(
         boolean var0
      ) {
         return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0);
      }

      @JvmStatic
      @JvmOverloads
      @NotNull
      public static final llIIlIIIIIIIIlIIlllIlllIIllIIIlIIlllIllllllIIlllllIIIIllIIIIllIlllIIIllIIIIIIlIIIIlII.PXEvMid b() {
         return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a();
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: {
         char[] var10003 = "\u001f9Hng\rR-7\u0001pg\u001a\u00066*D\"E%R*,@vgSR".toCharArray();
         int var10004 = var10003.length;
         int var0 = 0;
         byte var6 = 107;
         char[] var10002 = var10003;
         int var1 = var10004;
         byte var10;
         char[] var10005;
         int var10006;
         if (var10004 <= 1) {
            var10005 = var10003;
            var10 = 107;
            var10006 = var0;
         } else {
            var6 = 107;
            var1 = var10004;
            if (var10004 <= var0) {
               String var9 = new String(var10003).intern();
               byte var4 = -1;
               a = var9;
               IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIlIIIIIIIIlIIlllIlllIIllIIIlIIlllIllllllIIlllllIIIIllIIIIllIlllIIIllIIIIIIlIIIIlII.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI((kotlin.jvm.internal.DefaultConstructorMarker) null);
               break pxClinit;
            }

            var10005 = var10003;
            var10 = 107;
            var10006 = var0;
         }

         while (true) {
            var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
               case 0 -> 50;
               case 1 -> 51;
               case 2 -> 74;
               case 3 -> 105;
               case 4 -> 105;
               case 5 -> 2;
               default -> 25;
            });
            var0++;
            if (var6 == 0) {
               var10006 = var6;
               var10005 = var10002;
               var10 = var6;
            } else {
               if (var1 <= var0) {
                  String var8 = new String(var10002).intern();
                  byte var3 = -1;
                  a = var8;
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIlIIIIIIIIlIIlllIlllIIllIIIlIIlllIllllllIIlllllIIIIllIIIIllIlllIIIllIIIIIIlIIIIlII.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI((kotlin.jvm.internal.DefaultConstructorMarker) null);
                  break pxClinit;
               }

               var10005 = var10002;
               var10 = var6;
               var10006 = var0;
            }
         }
      }
}

      private static Exception a(Exception var0) {
         return var0;
      }

      public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
        // PX-RESTORE X1: jar row51 = ...$llIIllll(85)$IllllIIlll(85); ctor from DefaultConstructorMarker
        public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(DefaultConstructorMarker var1) {
        }

        private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
        }

        // PX-RESTORE X1: jar row51 static $default for a(ZZ) - mask bit1 -> var1, bit2 -> var2 (Kotlin defaults true)
        public static llIIlIIIIIIIIlIIlllIlllIIllIIIlIIlllIllllllIIlllllIIIIllIIIIllIlllIIIllIIIIIIlIIIIlII.PXEvMid a(
           IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var0, boolean var1, boolean var2, int var3, Object var4
        ) {
           if ((var3 & 1) != 0) {
              var1 = true;
           }

           if ((var3 & 2) != 0) {
              var2 = true;
           }

           return var0.a(var1, var2);
        }

         @JvmStatic
         @JvmOverloads
         @NotNull
         public final llIIlIIIIIIIIlIIlllIlllIIllIIIlIIlllIllllllIIlllllIIIIllIIIIllIlllIIIllIIIIIIlIIIIlII.PXEvMid a(
            boolean var1, boolean var2
         ) {
            int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
            int[] var4 = new int[4];
            GL11.glGetIntegerv(2978, var4);
            int[] var3 = var10000;
            int var5 = GL11.glGetInteger(36006);
            int var6 = GL11.glGetInteger(36010);
            int var7 = GL11.glGetInteger(32873);
            int var8 = GL11.glGetInteger(34016);
            int var9 = GL11.glGetInteger(3074);
            int var10 = GL11.glGetInteger(3073);
            int var11 = GL11.glGetInteger(35725);
            boolean var19 = var1;
            if (var3 != null) {
               var19 = var1 ? GL11.glIsEnabled(3042) : false;
            }

            boolean var12 = var19;
            boolean var20 = var1;
            if (var3 != null) {
               var20 = var1 ? GL11.glIsEnabled(2929) : false;
            }

            boolean var13 = var20;
            boolean var21 = var1;
            if (var3 != null) {
               var21 = var1 ? GL11.glIsEnabled(2884) : false;
            }

            boolean var14 = var21;
            boolean var22 = var1;
            if (var3 != null) {
               var22 = var1 ? GL11.glIsEnabled(3089) : false;
            }

            boolean var15 = var22;
            boolean var23 = var1;
            if (var3 != null) {
               var23 = var1 ? GL11.glIsEnabled(2960) : false;
            }

            boolean var16 = var23;
            int var24 =(( var2) ? 1 : 0);
            if (var3 != null) {
               var24 = !var2 ? GL11.glGetInteger(34229) : 0;
            }

            int var17 = var24;
            float[] var18 = new float[4];
            GL11.glGetFloatv(3106, var18);
            llIIlIIIIIIIIlIIlllIlllIIllIIIlIIlllIllllllIIlllllIIIIllIIIIllIlllIIIllIIIIIIlIIIIlII.PXEvMid var25 = new llIIlIIIIIIIIlIIlllIlllIIllIIIlIIlllIllllllIIlllllIIIIllIIIIllIlllIIIllIIIIIIlIIIIlII.PXEvMid(
               var4, var5, var6, var7, var8, var18, var9, var10, var11, var12, var13, var14, var15, var16, var17, var1, (boolean)var2, null
            );
            if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
               lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.b(new int[4]);
            }

            return var25;
         }

         @JvmStatic
         @JvmOverloads
         @NotNull
         public final llIIlIIIIIIIIlIIlllIlllIIllIIIlIIlllIllllllIIlllllIIIIllIIIIllIlllIIIllIIIIIIlIIIIlII.PXEvMid a(
            boolean var1
         ) {
            return a(var1, true);
         }

         @JvmStatic
         @JvmOverloads
         @NotNull
         public final llIIlIIIIIIIIlIIlllIlllIIllIIIlIIlllIllllllIIlllllIIIIllIIIIllIlllIIIllIIIIIIlIIIIlII.PXEvMid a() {
            return a(true, true);
         }
      }
   }
}
