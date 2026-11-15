package me.octo.client;

import java.util.List;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.util.Arrays;
import kotlin.text.Charsets;
import kotlin.jvm.internal.Intrinsics;
import java.util.Locale;
import kotlin.io.TextStreamsKt;
import java.util.concurrent.TimeUnit;
import me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI;

public final class lIllIllIlIlIIllIIllIIIIlIllllIlIllIIllIlIIIlIIllIIIIIIlIlIlIIIlIIlIIIIIIlIIlIlIIIIIII
   implements lIIIlIllIllIIIllIIIlIlllllllIlIlllIIlIIllIIIIlIIlIllllllllllIllIlIlIIlllIlIIIIIllIlII {
   @NotNull
   public static lIllIllIlIlIIllIIllIIIIlIllllIlIllIIllIlIIIlIIllIIIIIIlIlIlIIIlIIlIIIIIIlIIlIlIIIIIII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @Nullable
   private static volatile Boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String[] a;
   private static String[] b;

   private lIllIllIlIlIIllIIllIIIIlIllllIlIllIIllIlIIIlIIllIIIIIIlIlIlIIIlIIlIIIIIIlIIlIlIIIIIII() {
   }

   public boolean a() {
      Boolean var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      if (var1 != null) {
         return var1;
      }

      boolean var2 = StringsKt.contains(System.getProperty("os.name").toLowerCase(Locale.ROOT), "mac", false);
      if (!var2) {
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = false;
         return false;
      }

      try {
         Process var3 = new ProcessBuilder(new String[]{"osascript", "-e", "return 1"}).redirectErrorStream(true).start();
         boolean var4 = var3.waitFor(800L, TimeUnit.MILLISECONDS) && var3.exitValue() == 0;
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var4;
         return var4;
      } catch (Exception var5) {
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = false;
         return false;
      }
   }

   @Nullable
   public llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll b() {
      String var25 = null; // PX-FIX
      Double var22 = null; // PX-FIX
      Object var20 = null; // PX-FIX
      String var1 = llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.u();
      lIllIllIlIlIIllIIllIIIIlIllllIlIllIIllIlIIIlIIllIIIIIIlIlIlIIIlIIlIIIIIIlIIlIlIIIIIII var10000 = this;
      if (var1 != null) {
         if (!this.a()) {
            return null;
         }

         var10000 = this;
      }

      String[] var4 = new String[3];
      short var10003 = -883;
      short var10004 = 21035;
      var4[0] = "osascript";
      var10003 = -896;
      var10004 = 26366;
      var4[1] = "-e";
      var4[2] = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      String var15 = var10000.a(var4);
      if (var15 == null) {
         return null;
      } else {
         String var2 = var15;
         CharSequence var16 = var2;
         if (var1 != null) {
            if (StringsKt.isBlank(var16)) {
               return null;
            }

            var16 = var2;
         }

         char[] var13 = new char[]{'\t'};
         List var3 = (StringsKt.split(var16, var13, false, 0));
         Double var17 = ((Double)(Object)(var3));
         if (var1 != null) {
            if (var3.size() < 6) {
               return null;
            }

            var17 = (Double)var3.get(0);
         }

         String var17x = (String)(Object)var17;
         String var14 = StringsKt.trim((String & CharSequence)var17x).toString();
         String var5 = StringsKt.trim((String & CharSequence)var3.get(1)).toString();
         int var18 = var5.length();
         if (var1 != null) {
            var18 = var18 == 0 ? 1 : 0;
         }

         if (var18 != 0) {
            return null;
         } else {
            String var6;
            label67: {
               var6 = StringsKt.trim((String & CharSequence)var3.get(2)).toString();
               if (var1 != null) {
                  var17 = StringsKt.toDoubleOrNull(
                     StringsKt.replace(StringsKt.trim((String & CharSequence)var3.get(3)).toString(), ',', '.', false)
                  );
                  if (var17 != null) {
                     var20 = (long)var17.doubleValue();
                     break label67;
                  }
               }

               var20 = 0L;
            }

            long var7;
            label61: {
               var7 =((Long)( var20));
               if (var1 != null) {
                  var17 = StringsKt.toDoubleOrNull(
                     StringsKt.replace(StringsKt.trim((String & CharSequence)var3.get(4)).toString(), ',', '.', false)
                  );
                  if (var17 != null) {
                     var22 = var17;
                     break label61;
                  }
               }

               var22 = 0.0;
            }

            long var9;
            boolean var11;
            label55: {
               var9 = (long)(var22 * 1000.0);
               String var23 = StringsKt.trim((String & CharSequence)var3.get(5)).toString();
               short var10001 = -885;
               short var10002 = -232;
               var11 = StringsKt.equals(var23, "playing", true);
               var17 = ((Double)(Object)(var3));
               if (var1 != null) {
                  if (var3.size() <= 6) {
                     var25 = "";
                     break label55;
                  }

                  var17 = (Double)var3.get(6);
               }

               String var17y = (String)(Object)var17;
               var25 = StringsKt.trim((String & CharSequence)var17y).toString();
            }

            String var12 = var25;
            short var10008 = -871;
            short var10009 = -6222;
            return new llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll(
               var14, var5, var6, var7, var9, var11, "Spotify", null, var12, 128, null
            );
         }
      }
   }

   public void c() {
      String[] var1 = new String[3];
      short var10003 = -881;
      short var10004 = 25865;
      var1[0] = "osascript";
      var10003 = -894;
      var10004 = 4300;
      var1[1] = "-e";
      var10003 = -884;
      var10004 = 19228;
      var1[2] = "tell application \"Spotify\" to playpause";
      this.a(var1);
   }

   public void d() {
      String[] var1 = new String[3];
      short var10003 = -883;
      short var10004 = 21035;
      var1[0] = "osascript";
      var10003 = -896;
      var10004 = 26366;
      var1[1] = "-e";
      var10003 = -886;
      var10004 = -12042;
      var1[2] = "tell application \"Spotify\" to next track";
      this.a(var1);
   }

   public void e() {
      String[] var1 = new String[3];
      short var10003 = -883;
      short var10004 = 21035;
      var1[0] = "osascript";
      var10003 = -896;
      var10004 = 26366;
      var1[1] = "-e";
      var10003 = -887;
      var10004 = 19935;
      var1[2] = "tell application \"Spotify\" to previous track";
      this.a(var1);
   }

   public void f() {
      String[] var1 = new String[3];
      short var10003 = -883;
      short var10004 = 21035;
      var1[0] = "osascript";
      var10003 = -896;
      var10004 = 26366;
      var1[1] = "-e";
      var10003 = -889;
      var10004 = 31922;
      var1[2] = "tell application \"Spotify\" to set player position to 0";
      this.a(var1);
   }

   public void a(long var1) {
   }

   private final String a(String... param1) {
      String var2 = llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.u();
      String varText;
      try {
         Process var3 = (new ProcessBuilder(Arrays.copyOf(param1, param1.length))).redirectErrorStream(true).start();
         boolean var4 = var3.waitFor(900L, TimeUnit.MILLISECONDS);
         if (var2 == null) {
            if (var4) {
               return null;
            }
         } else {
            if (!var4) {
               var3.destroyForcibly();
               return null;
            }

            if (var2 != null && var3.exitValue() != 0) {
               return null;
            }
         }

         java.io.InputStream var5 = var3.getInputStream();
         Intrinsics.checkNotNullExpressionValue(var5, "getInputStream(...)");
         java.nio.charset.Charset var6 = Charsets.UTF_8;
         java.io.Reader var7 = new java.io.InputStreamReader(var5, var6);
         int var8 = 8192;
         java.io.BufferedReader var9;
         if (var2 == null) {
            var9 = (java.io.BufferedReader)var7;
         } else if (var7 instanceof java.io.BufferedReader) {
            var9 = (java.io.BufferedReader)var7;
         } else {
            var9 = new java.io.BufferedReader(var7, var8);
         }

         Object var10 = StringsKt.trimEnd((CharSequence)TextStreamsKt.readText(var9));
         varText = var10.toString();
      } catch (Exception var11) {
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("osascript invocation failed: " + var11.getMessage());
         varText = null;
      }

      return varText;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.u ()Ljava/lang/String;
      // 03: astore 2
      // 04: nop
      // 05: new java/lang/ProcessBuilder
      // 08: dup
      // 09: aload 1
      // 0a: aload 1
      // 0b: arraylength
      // 0c: invokestatic java/util/Arrays.copyOf ([Ljava/lang/Object;I)[Ljava/lang/Object;
      // 0f: checkcast [Ljava/lang/String;
      // 12: invokespecial java/lang/ProcessBuilder.<init> ([Ljava/lang/String;)V
      // 15: bipush 1
      // 16: invokevirtual java/lang/ProcessBuilder.redirectErrorStream (Z)Ljava/lang/ProcessBuilder;
      // 19: invokevirtual java/lang/ProcessBuilder.start ()Ljava/lang/Process;
      // 1c: astore 3
      // 1d: aload 3
      // 1e: ldc2_w 900
      // 21: getstatic java/util/concurrent/TimeUnit.MILLISECONDS Ljava/util/concurrent/TimeUnit;
      // 24: invokevirtual java/lang/Process.waitFor (JLjava/util/concurrent/TimeUnit;)Z
      // 27: istore 4
      // 29: iload 4
      // 2b: aload 2
      // 2c: ifnull 53
      // 2f: ifne 44
      // 32: goto 39
      // 35: invokestatic me/octo/client/lIllIllIlIlIIllIIllIIIIlIllllIlIllIIllIlIIIlIIllIIIIIIlIlIlIIIlIIlIIIIIIlIIlIlIIIIIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38: athrow
      // 39: aload 3
      // 3a: invokevirtual java/lang/Process.destroyForcibly ()Ljava/lang/Process;
      // 3d: pop
      // 3e: aconst_null
      // 3f: areturn
      // 40: invokestatic me/octo/client/lIllIllIlIlIIllIIllIIIIlIllllIlIllIIllIlIIIlIIllIIIIIIlIlIlIIIlIIlIIIIIIlIIlIlIIIIIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: aload 3
      // 45: aload 2
      // 46: ifnull 5d
      // 49: invokevirtual java/lang/Process.exitValue ()I
      // 4c: goto 53
      // 4f: invokestatic me/octo/client/lIllIllIlIlIIllIIllIIIIlIllllIlIllIIllIlIIIlIIllIIIIIIlIlIlIIIlIIlIIIIIIlIIlIlIIIIIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52: athrow
      // 53: ifeq 5c
      // 56: aconst_null
      // 57: areturn
      // 58: invokestatic me/octo/client/lIllIllIlIlIIllIIllIIIIlIllllIlIllIIllIlIIIlIIllIIIIIIlIlIlIIIlIIlIIIIIIlIIlIlIIIIIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5b: athrow
      // 5c: aload 3
      // 5d: invokevirtual java/lang/Process.getInputStream ()Ljava/io/InputStream;
      // 60: dup
      // 61: sipush -892
      // 64: sipush -26113
      // 67: pop2
      // 68: ldc "getInputStream(...)"
      // 6a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 6d: astore 5
      // 6f: getstatic kotlin/text/Charsets.UTF_8 Ljava/nio/charset/Charset;
      // 72: astore 6
      // 74: new java/io/InputStreamReader
      // 77: dup
      // 78: aload 5
      // 7a: aload 6
      // 7c: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
      // 7f: checkcast java/io/Reader
      // 82: astore 7
      // 84: sipush 8192
      // 87: istore 8
      // 89: aload 7
      // 8b: aload 2
      // 8c: ifnull a5
      // 8f: instanceof java/io/BufferedReader
      // 92: ifeq ab
      // 95: goto 9c
      // 98: invokestatic me/octo/client/lIllIllIlIlIIllIIllIIIIlIllllIlIllIIllIlIIIlIIllIIIIIIlIlIlIIIlIIlIIIIIIlIIlIlIIIIIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9b: athrow
      // 9c: aload 7
      // 9e: goto a5
      // a1: invokestatic me/octo/client/lIllIllIlIlIIllIIllIIIIlIllllIlIllIIllIlIIIlIIllIIIIIIlIlIlIIIlIIlIIIIIIlIIlIlIIIIIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a4: athrow
      // a5: checkcast java/io/BufferedReader
      // a8: goto b6
      // ab: new java/io/BufferedReader
      // ae: dup
      // af: aload 7
      // b1: iload 8
      // b3: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;I)V
      // b6: checkcast java/io/Reader
      // b9: invokestatic kotlin/io/TextStreamsKt.readText (Ljava/io/Reader;)Ljava/lang/String;
      // bc: checkcast java/lang/CharSequence
      // bf: invokestatic kotlin/text/StringsKt.trimEnd (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
      // c2: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // c5: astore 3
      // c6: goto e4
      // c9: astore 4
      // cb: aload 4
      // cd: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // d0: sipush -872
      // d3: sipush -1337
      // d6: pop2
      // d7: ldc "osascript invocation failed: "
      // d9: swap
      // da: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // df: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b (Ljava/lang/String;)V
      // e2: aconst_null
      // e3: astore 3
      // e4: aload 3
      // e5: areturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var22 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[18];
      int var3 = 0;
      String var2 = "ÞZ\u008e\u00816×\u001bõ\u0093ª\bÂN½sD(\u009fà#8àH¥~\bBª?v\u0084zéXÑ\u0090·ohU\u0014æñª\u000b\u0004\u0093Ì\u0018@ñm\u0002\f\u008dÌ\u008c\u0090\u0084\u0086\t¨oz\u0089(:]\u0001Y°\u0005aÊ\u009b\u0087¸ìa¨}ðöç°å#¹Óé±!@\u0011\r\u0095,<ô\u001c!\u0086\u0019A6Üñd\u0017ß\u009eviuMÒ³Ùë\u009e\u008clÆ¥]]¶ÿ\u008cú&\u0081\u000f,\u0097°÷¡ ¬]\u008esKÙ\u008a¿\u0093f\u0015ôDÍw\u009c\tà\u0082fÛ~Êä: wPw\u0089Ã&|Q>áÛJNL~W\u0004öö¸\u009eÍàíL¢-\u001eÌú\u001eh%\u007f^óS\u0013»A;\u0080\u008d\u0098Ã\u0088\u0084v\n\"½\u008e\u0089È\u0004\u001c7]-·ÓÃ\u007fÏbw=u\b«.äÐb9ç\u009c\u0007mº\u009f\u0087\u000e³Ðe\u0084ÉKQ:$\u001eÅ\u008dQß\rM]\r·×ÃÿÏ!2802P´¹°¥`\u008fF\u0098à\u0094\u001bxz*\u0015Ó&o]µ\u0087\u0090\u0000U\u009b³Fs\u007f°$\nòt[9æ©\u00ad®\rÐ{\u008bzÃi\b3*\u0094®cè\r`\u009cþ\u0086oõ±ÑÕ\u008fæ»\u008dÌ1\u0006\u0097\u000bî\u0017èçª\"\u009eX¥môw\u00adºû\u001c'\nÄ\u0087Â£ðå\u0019c¿ÈëoHè¾Ã\u001cdõ¹ïÒ¤£úmj¨úË\u0094eä\u0099\u0099\u0084í[¡\u001dRã\u0090OF§\u0083¬ùµùìl5_ña¯v\u0006UíØXvØX+\u0098\u00adñ\u0012X\u0003+ìç p@I\\\u001d¬{K¤uâ\u009bYÄõS¢Y/\u0087Õ¶#M înj\u0013\u0086~¦úÑèäÖÒé#\u0080_\u007f85qü+ºú\u0000*zpØ¹\u001dü-¨\fy:ñ\u000bn~;ÊBÆ\u001f\u00ad\u0099\u0080´§\u0082?ÞÐrvõ\u0010ã\u001eVö](é§-\u0082\u0005U(t\\Óa&%sý÷\u009eåj.ÈÞ½ÇÁÍ=\u000eyE}xXX\u0003\u0082áÀRBOÿ74úðj\u001bú½ÆîâPÕ\f|Ï\u0091çE\u0096\u001f\f(\u009ds\u0086.)²iÒ\tè\u0016ØsÐr)5\u0089\u0096w\\`\\Ö\u000eN¡\u0082;Ë=|\u0010\u0003\u008c0_¿_X°Âb)X\u0089;jê,ÔW=NÕ\u0093!WDÌ\u000b\u000fÀ\n\u0095\u0019!£à¸\u0085\u0005)\r\u0019\u009a\u008f\u008e¢y\u0097xZ\u009f$<ÇG\u00022Ì\u0012Þ\u0016(aV\u008bn\u0003\u0097û×\u001fÜ`\r\u00adJ8\u0011\u0094¢V\u0098S\u0001ó\u008dB\u008aä\u008cÏ9$gì\u008b\u0005ç\u0084VÎ_\u0007üË±à¡þØ'\u0001!\u0087\u0080\u0082JËl\u0019« ãµ\u0097;ªôÕZvÒÜÃ6Dý$b×ä9Õ\u008bø\u00830\t\t\u009e\t\nO\u0093\u0086ïeTøÈ\u0003-=7\t\u0010hÐb\u0087ùYki\u0002Gg\b\u0091rKóR\u0011\u0099¨\u0002úî\u0010pâÀÄ#wç\u0011\u0082®\u0014´ ZÙû\u00135Ýh:*\u008d\\£qËdU\u000bÁ\u001c¤±PG\u0007\u009a¢Î&àÐû\u0010zóÈ\u0092\u0018o'\u007fË\u0086PV7\u0006;p6í²\u001aò1\u0004½¥×\u0092yÄ\u008es\\6\u0018FÇ\u0004a\u0092µÿ\u008aÄýEì\u0000]@q;k7\u0000O)~\u0016L\u0091öè¶\u0083\u0099\u0095\u0089\u0017K9h";
      int var4 = "ÞZ\u008e\u00816×\u001bõ\u0093ª\bÂN½sD(\u009fà#8àH¥~\bBª?v\u0084zéXÑ\u0090·ohU\u0014æñª\u000b\u0004\u0093Ì\u0018@ñm\u0002\f\u008dÌ\u008c\u0090\u0084\u0086\t¨oz\u0089(:]\u0001Y°\u0005aÊ\u009b\u0087¸ìa¨}ðöç°å#¹Óé±!@\u0011\r\u0095,<ô\u001c!\u0086\u0019A6Üñd\u0017ß\u009eviuMÒ³Ùë\u009e\u008clÆ¥]]¶ÿ\u008cú&\u0081\u000f,\u0097°÷¡ ¬]\u008esKÙ\u008a¿\u0093f\u0015ôDÍw\u009c\tà\u0082fÛ~Êä: wPw\u0089Ã&|Q>áÛJNL~W\u0004öö¸\u009eÍàíL¢-\u001eÌú\u001eh%\u007f^óS\u0013»A;\u0080\u008d\u0098Ã\u0088\u0084v\n\"½\u008e\u0089È\u0004\u001c7]-·ÓÃ\u007fÏbw=u\b«.äÐb9ç\u009c\u0007mº\u009f\u0087\u000e³Ðe\u0084ÉKQ:$\u001eÅ\u008dQß\rM]\r·×ÃÿÏ!2802P´¹°¥`\u008fF\u0098à\u0094\u001bxz*\u0015Ó&o]µ\u0087\u0090\u0000U\u009b³Fs\u007f°$\nòt[9æ©\u00ad®\rÐ{\u008bzÃi\b3*\u0094®cè\r`\u009cþ\u0086oõ±ÑÕ\u008fæ»\u008dÌ1\u0006\u0097\u000bî\u0017èçª\"\u009eX¥môw\u00adºû\u001c'\nÄ\u0087Â£ðå\u0019c¿ÈëoHè¾Ã\u001cdõ¹ïÒ¤£úmj¨úË\u0094eä\u0099\u0099\u0084í[¡\u001dRã\u0090OF§\u0083¬ùµùìl5_ña¯v\u0006UíØXvØX+\u0098\u00adñ\u0012X\u0003+ìç p@I\\\u001d¬{K¤uâ\u009bYÄõS¢Y/\u0087Õ¶#M înj\u0013\u0086~¦úÑèäÖÒé#\u0080_\u007f85qü+ºú\u0000*zpØ¹\u001dü-¨\fy:ñ\u000bn~;ÊBÆ\u001f\u00ad\u0099\u0080´§\u0082?ÞÐrvõ\u0010ã\u001eVö](é§-\u0082\u0005U(t\\Óa&%sý÷\u009eåj.ÈÞ½ÇÁÍ=\u000eyE}xXX\u0003\u0082áÀRBOÿ74úðj\u001bú½ÆîâPÕ\f|Ï\u0091çE\u0096\u001f\f(\u009ds\u0086.)²iÒ\tè\u0016ØsÐr)5\u0089\u0096w\\`\\Ö\u000eN¡\u0082;Ë=|\u0010\u0003\u008c0_¿_X°Âb)X\u0089;jê,ÔW=NÕ\u0093!WDÌ\u000b\u000fÀ\n\u0095\u0019!£à¸\u0085\u0005)\r\u0019\u009a\u008f\u008e¢y\u0097xZ\u009f$<ÇG\u00022Ì\u0012Þ\u0016(aV\u008bn\u0003\u0097û×\u001fÜ`\r\u00adJ8\u0011\u0094¢V\u0098S\u0001ó\u008dB\u008aä\u008cÏ9$gì\u008b\u0005ç\u0084VÎ_\u0007üË±à¡þØ'\u0001!\u0087\u0080\u0082JËl\u0019« ãµ\u0097;ªôÕZvÒÜÃ6Dý$b×ä9Õ\u008bø\u00830\t\t\u009e\t\nO\u0093\u0086ïeTøÈ\u0003-=7\t\u0010hÐb\u0087ùYki\u0002Gg\b\u0091rKóR\u0011\u0099¨\u0002úî\u0010pâÀÄ#wç\u0011\u0082®\u0014´ ZÙû\u00135Ýh:*\u008d\\£qËdU\u000bÁ\u001c¤±PG\u0007\u009a¢Î&àÐû\u0010zóÈ\u0092\u0018o'\u007fË\u0086PV7\u0006;p6í²\u001aò1\u0004½¥×\u0092yÄ\u008es\\6\u0018FÇ\u0004a\u0092µÿ\u008aÄýEì\u0000]@q;k7\u0000O)~\u0016L\u0091öè¶\u0083\u0099\u0095\u0089\u0017K9h"
         .length();
      char var1 = 651;
      int var8 = -1;

      label52:
      while (true) {
         short var10000 = 101;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var26 = var10001.toCharArray();
               int var10004 = var26.length;
               int var6 = 0;
               byte var29 = (byte)var10000;
               var22 = var26;
               int var15 = var10004;
               byte var34;
               char[] var38;
               int var10006;
               if (var10004 <= 1) {
                  var38 = var26;
                  var34 = (byte)var10000;
                  var10006 = var6;
               } else {
                  var29 = (byte)var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var38 = var26;
                  var34 = (byte)var10000;
                  var10006 = var6;
               }

               while (true) {
                  var38[var10006] = (char)(var38[var10006] ^ var34 ^ switch (var6 % 7) {
                     case 0 -> 31;
                     case 1 -> 31;
                     case 2 -> 27;
                     case 3 -> 43;
                     case 4 -> 25;
                     case 5 -> 118;
                     default -> 37;
                  });
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var38 = var22;
                     var34 = var29;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var38 = var22;
                     var34 = var29;
                     var10006 = var6;
                  }
               }
            }

            String var31 = new String(var22).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var31;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[18];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIllIllIlIlIIllIIllIIIIlIllllIlIllIIllIlIIIlIIllIIIIIIlIlIlIIIlIIlIIIIIIlIIlIlIIIIIII();
                     var10000 = -888;
                     short var17 = 18382;
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = "if application \"Spotify\" is running then\n    tell application \"Spotify\"\n        try\n            set t to name of current track\n            set a to artist of current track\n            set al to album of current track\n            set d to duration of current track\n            set p to player position\n            set s to (player state as string)\n            set artUrl to \"\"\n            try\n                set artUrl to artwork url of current track\n            end try\n            return a & tab & t & tab & al & tab & d & tab & p & tab & s & tab & artUrl\n        on error\n            return \"\"\n        end try\n    end tell\nelse\n    return \"\"\nend if";
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var31;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "Ñ\u00983§ \u009avÜW/£ÇG ðN\u008f7\fÍ7¿\nÞº\u0092Óµq\u0007ð\u009e¢\u0003×ýÓ";
                  var4 = "Ñ\u00983§ \u009avÜW/£ÇG ðN\u008f7\fÍ7¿\nÞº\u0092Óµq\u0007ð\u009e¢\u0003×ýÓ".length();
                  var1 = 29;
                  var8 = -1;
            }

            var10000 = 16;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -888) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 159;
            case 1 -> 126;
            case 2 -> 63;
            case 3 -> 174;
            case 4 -> 218;
            case 5 -> 122;
            case 6 -> 18;
            case 7 -> 33;
            case 8 -> 176;
            case 9 -> 11;
            case 10 -> 115;
            case 11 -> 229;
            case 12 -> 210;
            case 13 -> 127;
            case 14 -> 14;
            case 15 -> 206;
            case 16 -> 165;
            case 17 -> 94;
            case 18 -> 217;
            case 19 -> 69;
            case 20 -> 249;
            case 21 -> 106;
            case 22 -> 137;
            case 23 -> 141;
            case 24 -> 250;
            case 25 -> 246;
            case 26 -> 236;
            case 27 -> 135;
            case 28 -> 41;
            case 29 -> 36;
            case 30 -> 49;
            case 31 -> 213;
            case 32 -> 101;
            case 33 -> 138;
            case 34 -> 222;
            case 35 -> 60;
            case 36 -> 182;
            case 37 -> 110;
            case 38 -> 232;
            case 39 -> 97;
            case 40 -> 243;
            case 41 -> 130;
            case 42 -> 103;
            case 43 -> 152;
            case 44 -> 20;
            case 45 -> 179;
            case 46 -> 177;
            case 47 -> 202;
            case 48 -> 26;
            case 49 -> 253;
            case 50 -> 16;
            case 51 -> 87;
            case 52 -> 10;
            case 53 -> 77;
            case 54 -> 8;
            case 55 -> 74;
            case 56 -> 15;
            case 57 -> 23;
            case 58 -> 181;
            case 59 -> 121;
            case 60 -> 64;
            case 61 -> 238;
            case 62 -> 133;
            case 63 -> 68;
            case 64 -> 194;
            case 65 -> 196;
            case 66 -> 100;
            case 67 -> 150;
            case 68 -> 235;
            case 69 -> 124;
            case 70 -> 228;
            case 71 -> 160;
            case 72 -> 83;
            case 73 -> 234;
            case 74 -> 167;
            case 75 -> 71;
            case 76 -> 161;
            case 77 -> 145;
            case 78 -> 219;
            case 79 -> 215;
            case 80 -> 89;
            case 81 -> 61;
            case 82 -> 230;
            case 83 -> 113;
            case 84 -> 108;
            case 85 -> 92;
            case 86 -> 51;
            case 87 -> 212;
            case 88 -> 2;
            case 89 -> 73;
            case 90 -> 220;
            case 91 -> 88;
            case 92 -> 205;
            case 93 -> 119;
            case 94 -> 82;
            case 95 -> 251;
            case 96 -> 37;
            case 97 -> 227;
            case 98 -> 154;
            case 99 -> 17;
            case 100 -> 231;
            case 101 -> 224;
            case 102 -> 99;
            case 103 -> 29;
            case 104 -> 140;
            case 105 -> 86;
            case 106 -> 4;
            case 107 -> 35;
            case 108 -> 57;
            case 109 -> 173;
            case 110 -> 21;
            case 111 -> 255;
            case 112 -> 12;
            case 113 -> 48;
            case 114 -> 143;
            case 115 -> 19;
            case 116 -> 193;
            case 117 -> 139;
            case 118 -> 104;
            case 119 -> 183;
            case 120 -> 216;
            case 121 -> 46;
            case 122 -> 203;
            case 123 -> 13;
            case 124 -> 50;
            case 125 -> 170;
            case 126 -> 38;
            case 127 -> 59;
            case 128 -> 31;
            case 129 -> 239;
            case 130 -> 171;
            case 131 -> 30;
            case 132 -> 158;
            case 133 -> 225;
            case 134 -> 34;
            case 135 -> 192;
            case 136 -> 58;
            case 137 -> 132;
            case 138 -> 120;
            case 139 -> 66;
            case 140 -> 204;
            case 141 -> 153;
            case 142 -> 163;
            case 143 -> 254;
            case 144 -> 168;
            case 145 -> 209;
            case 146 -> 81;
            case 147 -> 117;
            case 148 -> 186;
            case 149 -> 42;
            case 150 -> 84;
            case 151 -> 207;
            case 152 -> 107;
            case 153 -> 32;
            case 154 -> 24;
            case 155 -> 111;
            case 156 -> 40;
            case 157 -> 0;
            case 158 -> 3;
            case 159 -> 131;
            case 160 -> 166;
            case 161 -> 102;
            case 162 -> 178;
            case 163 -> 129;
            case 164 -> 1;
            case 165 -> 78;
            case 166 -> 125;
            case 167 -> 245;
            case 168 -> 214;
            case 169 -> 172;
            case 170 -> 93;
            case 171 -> 144;
            case 172 -> 45;
            case 173 -> 136;
            case 174 -> 5;
            case 175 -> 67;
            case 176 -> 109;
            case 177 -> 211;
            case 178 -> 151;
            case 179 -> 90;
            case 180 -> 27;
            case 181 -> 195;
            case 182 -> 44;
            case 183 -> 80;
            case 184 -> 54;
            case 185 -> 98;
            case 186 -> 180;
            case 187 -> 233;
            case 188 -> 226;
            case 189 -> 76;
            case 190 -> 53;
            case 191 -> 142;
            case 192 -> 72;
            case 193 -> 200;
            case 194 -> 242;
            case 195 -> 96;
            case 196 -> 199;
            case 197 -> 75;
            case 198 -> 28;
            case 199 -> 47;
            case 200 -> 56;
            case 201 -> 240;
            case 202 -> 118;
            case 203 -> 62;
            case 204 -> 149;
            case 205 -> 248;
            case 206 -> 116;
            case 207 -> 112;
            case 208 -> 175;
            case 209 -> 198;
            case 210 -> 79;
            case 211 -> 241;
            case 212 -> 91;
            case 213 -> 123;
            case 214 -> 55;
            case 215 -> 185;
            case 216 -> 184;
            case 217 -> 156;
            case 218 -> 162;
            case 219 -> 52;
            case 220 -> 201;
            case 221 -> 237;
            case 222 -> 22;
            case 223 -> 157;
            case 224 -> 9;
            case 225 -> 164;
            case 226 -> 247;
            case 227 -> 252;
            case 228 -> 85;
            case 229 -> 190;
            case 230 -> 148;
            case 231 -> 105;
            case 232 -> 221;
            case 233 -> 95;
            case 234 -> 134;
            case 235 -> 197;
            case 236 -> 128;
            case 237 -> 208;
            case 238 -> 43;
            case 239 -> 25;
            case 240 -> 188;
            case 241 -> 187;
            case 242 -> 244;
            case 243 -> 70;
            case 244 -> 147;
            case 245 -> 223;
            case 246 -> 114;
            case 247 -> 39;
            case 248 -> 7;
            case 249 -> 189;
            case 250 -> 191;
            case 251 -> 155;
            case 252 -> 65;
            case 253 -> 146;
            case 254 -> 169;
            default -> 6;
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
}
