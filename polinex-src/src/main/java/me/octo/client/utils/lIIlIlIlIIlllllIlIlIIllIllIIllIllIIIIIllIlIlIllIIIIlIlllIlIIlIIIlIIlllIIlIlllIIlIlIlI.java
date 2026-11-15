package me.octo.client.utils;

import com.mojang.blaze3d.systems.RenderSystem;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;

public final class lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI
   extends lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   @NotNull
   public static lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static boolean IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private static String lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private static volatile String IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @Nullable
   private static volatile String llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static volatile boolean lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static String[] c;
   private static String[] d;

   private lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI() {
   }

   private final void g() {
      int[] var1 = me.octo.client.utils.lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      String var2 = "";
      CharSequence var3 = (CharSequence)var2;
      if (var3.length() == 0 || !var2.startsWith("http")) {
         IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = "/assets/polinex/pfp.png";
         return;
      }
      if (var2.equals(llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) || lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl) {
         return;
      }
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var2;
      lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = true;
      me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(new kotlin.jvm.functions.Function0() {
         @Override
         public Object invoke() {
            return me.octo.client.utils.lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI.a(var2);
         }
      });
   }

   private final void a(byte[] param1) {
      int[] var2 = me.octo.client.utils.lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      java.nio.ByteBuffer var3 = org.lwjgl.system.MemoryUtil.memAlloc(param1.length);
      var3.put(param1);
      var3.flip();
      try {
         int[] var4 = new int[1];
         int[] var5 = new int[1];
         int[] var6 = new int[1];
         if (var2 == null) { throw new IllegalStateException("avatar is not a decodable image"); }
         java.nio.ByteBuffer var7 = org.lwjgl.stb.STBImage.stbi_load_from_memory(var3, var4, var5, var6, 4);
         if (var7 == null) { throw new IllegalStateException("avatar is not a decodable image"); }
         try {
            if (var4[0] < 1 || var5[0] < 1) {
               String var9 = "avatar dimensions invalid: " + var4[0] + "x" + var5[0];
               throw new IllegalStateException(var9.toString());
            }
         } finally {
            org.lwjgl.stb.STBImage.stbi_image_free(var7);
         }
      } finally {
         org.lwjgl.system.MemoryUtil.memFree(var3);
      }
   }

   @JvmStatic
   public static final void h() {
      RenderSystem.backupProjectionMatrix();
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = false;
   }

   @JvmStatic
   public static final void i() {
      RenderSystem.restoreProjectionMatrix();
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = true;
   }

   public final int b(int var1) {
      return this.a().getWindow().getScreenHeight() - var1;
   }

   public final void a(int var1, int var2, int var3, int var4) {
      GL11.glScissor(var1, var2, var3, var4);
   }

   public final void a(
      double param1,
      double param3,
      double param5,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll param7,
      float param8,
      float param9,
      float param10,
      float param11,
      float param12
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 7
      // 02: sipush -3774
      // 05: sipush 19855
      // 08: pop2
      // 09: ldc "color"
      // 0b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 0e: invokestatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o ()[I
      // 11: ldc 50.0
      // 13: fstore 14
      // 15: fload 14
      // 17: fstore 15
      // 19: astore 13
      // 1b: fload 14
      // 1d: fstore 16
      // 1f: getstatic me/octo/client/utils/lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Ljava/lang/String;
      // 22: aload 13
      // 24: ifnull 4d
      // 27: sipush -3765
      // 2a: sipush -14662
      // 2d: pop2
      // 2e: ldc ""
      // 30: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 33: ifeq 4b
      // 36: goto 3d
      // 39: invokestatic me/octo/client/utils/lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3c: athrow
      // 3d: aload 0
      // 3e: invokespecial me/octo/client/utils/lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI.j ()Ljava/lang/String;
      // 41: putstatic me/octo/client/utils/lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Ljava/lang/String;
      // 44: goto 4b
      // 47: invokestatic me/octo/client/utils/lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 4a: athrow
      // 4b: ldc ""
      // 4d: astore 17
      // 4f: aload 17
      // 51: aload 13
      // 53: ifnull 91
      // 56: ifnull 88
      // 59: goto 60
      // 5c: invokestatic me/octo/client/utils/lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 5f: athrow
      // 60: aload 17
      // 62: checkcast java/lang/CharSequence
      // 65: invokeinterface java/lang/CharSequence.length ()I 1
      // 6a: aload 13
      // 6c: ifnull 81
      // 6f: goto 76
      // 72: invokestatic me/octo/client/utils/lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 75: athrow
      // 76: ifne 84
      // 79: goto 80
      // 7c: invokestatic me/octo/client/utils/lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 7f: athrow
      // 80: bipush 1
      // 81: goto 85
      // 84: bipush 0
      // 85: ifeq 93
      // 88: sipush -3767
      // 8b: sipush -656
      // 8e: pop2
      // 8f: ldc "Unknown"
      // 91: astore 17
      // 93: aload 0
      // 94: invokespecial me/octo/client/utils/lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI.g ()V
      // 97: getstatic me/octo/client/utils/lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Ljava/lang/String;
      // 9a: astore 18
      // 9c: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
      // 9f: aload 18
      // a1: fload 8
      // a3: fload 9
      // a5: fload 15
      // a7: fload 16
      // a9: ldc 8.0
      // ab: ldc 8.0
      // ad: ldc 8.0
      // af: ldc 8.0
      // b1: fload 12
      // b3: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/String;FFFFFFFFF)V
      // b6: return
   }

   private final String j() {
      String var1;
      try {
         short var4 = -3766;
         short var5 = -15345;
         var1 = "Deluxe TEMP";
      } catch (Throwable var3) {
         short var10000 = -3764;
         short var10001 = 15434;
         var1 = "";
      }

      return var1;
   }

   private static final Unit a(String var0) {
      try {
         var var2 = new URL(var0).openStream();
         Throwable var3 = null;

         byte[] var20;
         try {
            InputStream var4 = var2;
            boolean var5 = false;
            Intrinsics.checkNotNull(var4);
            var20 = ByteStreamsKt.readBytes(var4);
         } catch (Throwable var14) {
            var3 = var14;
            throw var14;
         } finally {
            CloseableKt.closeFinally(var2, var3);
         }

         IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var20);
         Minecraft var18 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a();
         short var10003 = -3770;
         short var10004 = 24804;
         File var19 = new File(var18.gameDirectory, "polinex/cache");
         var19.mkdirs();
         var10003 = -3773;
         var10004 = 24128;
         File var21 = new File(var19, "avatar.png");
         FilesKt.writeBytes(var21, var20);
         String var22 = var21.getAbsolutePath();
         short var10002 = -3776;
         var10003 = -1783;
         Intrinsics.checkNotNullExpressionValue(var22, "getAbsolutePath(...)");
         IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var22;
      } catch (Throwable var16) {
         short var10000 = -3769;
         var16.printStackTrace();
         short var10001 = 9312;
         IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = "/assets/polinex/pfp.png";
      } finally {
         lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = false;
      }

      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var24 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[14];
      int var3 = 0;
      String var2 = "I¡y¨´JàÞª¸È\u000f\u0099Ò]¬\u0090Ç¬ùÿ\u0005F\u0087RùÞ\u001f\u00944Njç$°Û\u0096ï\u0081´\u0006\u0015QqóO÷®´<ËV\u0012\t\u0003IOY1\u0007\u0088Bu¥Å\u0081u\u0004=öFt\u000f*M+_^¹u6Äü!¸¾\u001eC\u0014®û»\u0089Lc7m\u008c\u0097(Õ\u009f³gH H\u0085U\u0017f#\u0085zÊÇÂ'â±nß£û¥NCEdÍ£6º\u0005\u00075skÿ\n\u0089\u0000íì\u0093ô0ØTò\u0014Ë\u0085v\u0018Tøêd}é1\u0095o½Â²ãu»\u008d\u001b\u007f#3\u0088HxE]2ÞGw³\u0005\u000e]À\bnªÞ\u009dØg¾\u0090þ";
      int var4 = "I¡y¨´JàÞª¸È\u000f\u0099Ò]¬\u0090Ç¬ùÿ\u0005F\u0087RùÞ\u001f\u00944Njç$°Û\u0096ï\u0081´\u0006\u0015QqóO÷®´<ËV\u0012\t\u0003IOY1\u0007\u0088Bu¥Å\u0081u\u0004=öFt\u000f*M+_^¹u6Äü!¸¾\u001eC\u0014®û»\u0089Lc7m\u008c\u0097(Õ\u009f³gH H\u0085U\u0017f#\u0085zÊÇÂ'â±nß£û¥NCEdÍ£6º\u0005\u00075skÿ\n\u0089\u0000íì\u0093ô0ØTò\u0014Ë\u0085v\u0018Tøêd}é1\u0095o½Â²ãu»\u008d\u001b\u007f#3\u0088HxE]2ÞGw³\u0005\u000e]À\bnªÞ\u009dØg¾\u0090þ"
         .length();
      char var1 = 11;
      int var8 = -1;

      label52:
      while (true) {
         short var10000 = 61;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var28 = var10001.toCharArray();
               int var10004 = var28.length;
               int var6 = 0;
               byte var31 = (byte)var10000;
               var24 = var28;
               int var16 = var10004;
               byte var36;
               char[] var40;
               int var10006;
               if (var10004 <= 1) {
                  var40 = var28;
                  var36 = (byte)var10000;
                  var10006 = var6;
               } else {
                  var31 = (byte)var10000;
                  var16 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var40 = var28;
                  var36 = (byte)var10000;
                  var10006 = var6;
               }

               while (true) {
                  var40[var10006] = (char)(var40[var10006] ^ var36 ^ switch (var6 % 7) {
                     case 0 -> 50;
                     case 1 -> 78;
                     case 2 -> 44;
                     case 3 -> 115;
                     case 4 -> 29;
                     case 5 -> 21;
                     default -> 24;
                  });
                  var6++;
                  if (var31 == 0) {
                     var10006 = var31;
                     var40 = var24;
                     var36 = var31;
                  } else {
                     if (var16 <= var6) {
                        break;
                     }

                     var40 = var24;
                     var36 = var31;
                     var10006 = var6;
                  }
               }
            }

            String var33 = new String(var24).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var33;
                  if ((var8 += var1) >= var4) {
                     c = var5;
                     d = new String[14];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI();
                     var10000 = -3761;
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = true;
                     short var18 = -16931;
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = "";
                     var10000 = -3769;
                     short var19 = 9312;
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = "/assets/polinex/pfp.png";
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var33;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "w\u0090\u0081T0Çq\u0099`åÍ\u0016¿\u0017\u001aä\u0087\u000f\u0007äöÎé\u0001\u0082D³\u0005*\u001c?\u0082f¸n\u0015\u008e";
                  var4 = "w\u0090\u0081T0Çq\u0099`åÍ\u0016¿\u0017\u001aä\u0087\u000f\u0007äöÎé\u0001\u0082D³\u0005*\u001c?\u0082f¸n\u0015\u008e".length();
                  var1 = '\r';
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
      int var2 = (var0 ^ -3766) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 72;
            case 1 -> 61;
            case 2 -> 60;
            case 3 -> 24;
            case 4 -> 167;
            case 5 -> 190;
            case 6 -> 56;
            case 7 -> 144;
            case 8 -> 36;
            case 9 -> 18;
            case 10 -> 255;
            case 11 -> 4;
            case 12 -> 163;
            case 13 -> 177;
            case 14 -> 29;
            case 15 -> 100;
            case 16 -> 151;
            case 17 -> 3;
            case 18 -> 238;
            case 19 -> 211;
            case 20 -> 73;
            case 21 -> 240;
            case 22 -> 192;
            case 23 -> 70;
            case 24 -> 45;
            case 25 -> 42;
            case 26 -> 212;
            case 27 -> 1;
            case 28 -> 193;
            case 29 -> 232;
            case 30 -> 152;
            case 31 -> 106;
            case 32 -> 16;
            case 33 -> 7;
            case 34 -> 209;
            case 35 -> 182;
            case 36 -> 215;
            case 37 -> 109;
            case 38 -> 157;
            case 39 -> 52;
            case 40 -> 28;
            case 41 -> 251;
            case 42 -> 76;
            case 43 -> 136;
            case 44 -> 33;
            case 45 -> 92;
            case 46 -> 143;
            case 47 -> 84;
            case 48 -> 91;
            case 49 -> 222;
            case 50 -> 88;
            case 51 -> 191;
            case 52 -> 181;
            case 53 -> 204;
            case 54 -> 227;
            case 55 -> 168;
            case 56 -> 178;
            case 57 -> 166;
            case 58 -> 95;
            case 59 -> 111;
            case 60 -> 80;
            case 61 -> 10;
            case 62 -> 12;
            case 63 -> 180;
            case 64 -> 48;
            case 65 -> 63;
            case 66 -> 133;
            case 67 -> 237;
            case 68 -> 220;
            case 69 -> 135;
            case 70 -> 13;
            case 71 -> 253;
            case 72 -> 50;
            case 73 -> 38;
            case 74 -> 17;
            case 75 -> 170;
            case 76 -> 98;
            case 77 -> 186;
            case 78 -> 43;
            case 79 -> 176;
            case 80 -> 254;
            case 81 -> 68;
            case 82 -> 123;
            case 83 -> 0;
            case 84 -> 252;
            case 85 -> 183;
            case 86 -> 185;
            case 87 -> 22;
            case 88 -> 75;
            case 89 -> 146;
            case 90 -> 233;
            case 91 -> 134;
            case 92 -> 161;
            case 93 -> 99;
            case 94 -> 244;
            case 95 -> 156;
            case 96 -> 120;
            case 97 -> 174;
            case 98 -> 37;
            case 99 -> 40;
            case 100 -> 145;
            case 101 -> 221;
            case 102 -> 214;
            case 103 -> 235;
            case 104 -> 216;
            case 105 -> 159;
            case 106 -> 175;
            case 107 -> 59;
            case 108 -> 25;
            case 109 -> 230;
            case 110 -> 218;
            case 111 -> 239;
            case 112 -> 57;
            case 113 -> 47;
            case 114 -> 155;
            case 115 -> 140;
            case 116 -> 224;
            case 117 -> 77;
            case 118 -> 162;
            case 119 -> 126;
            case 120 -> 165;
            case 121 -> 55;
            case 122 -> 74;
            case 123 -> 107;
            case 124 -> 184;
            case 125 -> 242;
            case 126 -> 39;
            case 127 -> 153;
            case 128 -> 203;
            case 129 -> 198;
            case 130 -> 188;
            case 131 -> 141;
            case 132 -> 9;
            case 133 -> 66;
            case 134 -> 89;
            case 135 -> 158;
            case 136 -> 131;
            case 137 -> 121;
            case 138 -> 87;
            case 139 -> 83;
            case 140 -> 231;
            case 141 -> 173;
            case 142 -> 150;
            case 143 -> 139;
            case 144 -> 46;
            case 145 -> 154;
            case 146 -> 108;
            case 147 -> 34;
            case 148 -> 148;
            case 149 -> 125;
            case 150 -> 247;
            case 151 -> 147;
            case 152 -> 160;
            case 153 -> 23;
            case 154 -> 199;
            case 155 -> 197;
            case 156 -> 219;
            case 157 -> 2;
            case 158 -> 49;
            case 159 -> 58;
            case 160 -> 54;
            case 161 -> 86;
            case 162 -> 201;
            case 163 -> 104;
            case 164 -> 32;
            case 165 -> 250;
            case 166 -> 223;
            case 167 -> 245;
            case 168 -> 113;
            case 169 -> 207;
            case 170 -> 5;
            case 171 -> 21;
            case 172 -> 202;
            case 173 -> 122;
            case 174 -> 226;
            case 175 -> 225;
            case 176 -> 137;
            case 177 -> 20;
            case 178 -> 171;
            case 179 -> 249;
            case 180 -> 35;
            case 181 -> 241;
            case 182 -> 62;
            case 183 -> 236;
            case 184 -> 206;
            case 185 -> 234;
            case 186 -> 19;
            case 187 -> 96;
            case 188 -> 117;
            case 189 -> 172;
            case 190 -> 67;
            case 191 -> 187;
            case 192 -> 130;
            case 193 -> 248;
            case 194 -> 6;
            case 195 -> 97;
            case 196 -> 102;
            case 197 -> 53;
            case 198 -> 85;
            case 199 -> 205;
            case 200 -> 27;
            case 201 -> 142;
            case 202 -> 81;
            case 203 -> 210;
            case 204 -> 116;
            case 205 -> 115;
            case 206 -> 51;
            case 207 -> 41;
            case 208 -> 114;
            case 209 -> 15;
            case 210 -> 79;
            case 211 -> 90;
            case 212 -> 149;
            case 213 -> 246;
            case 214 -> 179;
            case 215 -> 69;
            case 216 -> 101;
            case 217 -> 213;
            case 218 -> 169;
            case 219 -> 217;
            case 220 -> 26;
            case 221 -> 132;
            case 222 -> 164;
            case 223 -> 118;
            case 224 -> 194;
            case 225 -> 128;
            case 226 -> 44;
            case 227 -> 8;
            case 228 -> 195;
            case 229 -> 138;
            case 230 -> 110;
            case 231 -> 14;
            case 232 -> 228;
            case 233 -> 30;
            case 234 -> 105;
            case 235 -> 71;
            case 236 -> 200;
            case 237 -> 82;
            case 238 -> 119;
            case 239 -> 129;
            case 240 -> 229;
            case 241 -> 243;
            case 242 -> 11;
            case 243 -> 31;
            case 244 -> 196;
            case 245 -> 94;
            case 246 -> 78;
            case 247 -> 93;
            case 248 -> 127;
            case 249 -> 124;
            case 250 -> 112;
            case 251 -> 103;
            case 252 -> 208;
            case 253 -> 189;
            case 254 -> 64;
            default -> 65;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }
}
