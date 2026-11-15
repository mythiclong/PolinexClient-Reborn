package me.octo.client;

import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.util.ArrayList;
import kotlin.text.Charsets;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.io.TextStreamsKt;
import java.util.concurrent.TimeUnit;
import me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI;

public final class lIIIIlIIllIIIllllllIlIlIllllllllllllIlllIIlIllIIllIIlllIlIIIIIlllIlIIllIlIIlIIlllIIlI
   implements lIIIlIllIllIIIllIIIlIlllllllIlIlllIIlIIllIIIIlIIlIllllllllllIllIlIlIIlllIlIIIIIllIlII {
   @NotNull
   public static lIIIIlIIllIIIllllllIlIlIllllllllllllIlllIIlIllIIllIIlllIlIIIIIlllIlIIllIlIIlIIlllIIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static String lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static String IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static String IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static String IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private static String lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @Nullable
   private static volatile Boolean IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @Nullable
   private static volatile String llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static String[] a;
   private static String[] b;

   private lIIIIlIIllIIIllllllIlIlIllllllllllllIlllIIlIllIIllIIlllIlIIIIIlllIlIIllIlIIlIIlllIIlI() {
   }

   public boolean a() {
      Boolean var2 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      if (var2 != null) {
         return var2;
      }
      boolean var5 = System.getProperty("os.name").toLowerCase(Locale.ROOT).contains("win");
      if (!var5) {
         IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = Boolean.valueOf(false);
         return false;
      }

      boolean var4;
      try {
         Process var3 = new ProcessBuilder(new String[]{"powershell", "-NoProfile", "-NoLogo", "-Command", "exit 0"}).redirectErrorStream(true).start();
         var4 = var3.waitFor(2500L, TimeUnit.MILLISECONDS) && var3.exitValue() == 0;
      } catch (Exception var6) {
         IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = Boolean.valueOf(false);
         var4 = false;
      }

      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = Boolean.valueOf(var4);
      return var4;
   }

   @Nullable
   public llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll b() {
      String var1 = me.octo.client.llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.u();
      if (!this.a()) {
         return null;
      }

      String var2 = this.a(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, (String)null);
      if (var2 == null) {
         return null;
      }

      if (StringsKt.isBlank((CharSequence)var2)) {
         return null;
      }

      List var3 = new ArrayList();

      for (Object var4 : StringsKt.lines((CharSequence)var2)) {
         var var5 = (String)var4;
         if (!StringsKt.isBlank((CharSequence)var5)) {
            var3.add(var4);
         }
      }

      List var6 = new ArrayList();

      for (Object var7 : var3) {
         var var8 = (String)var7;
         var var9 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var8);
         if (var9 != null) {
            var6.add(var9);
         }
      }

      if (var6.isEmpty()) {
         return null;
      }

      List var10 = new ArrayList();

      for (Object var11 : var6) {
         var var12 = (me.octo.client.llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll)var11;
         if (var12.f()) {
            var10.add(var11);
         }
      }

      String var13 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      boolean var14 = false;
      if (var13 != null) {
         for (Object var15 : var10) {
            if (Intrinsics.areEqual(((me.octo.client.llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll)var15).g(), var13)) {
               var14 = true;
               break;
            }
         }
      }

      me.octo.client.llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll var16;
      if (var14) {
         var16 = null;

         for (Object var17 : var10) {
            if (Intrinsics.areEqual(((me.octo.client.llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll)var17).g(), var13)) {
               var16 = (me.octo.client.llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll)var17;
               break;
            }
         }

         if (var16 == null) {
            throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
         }
      } else if (!var10.isEmpty()) {
         var16 = (me.octo.client.llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll)CollectionsKt.first(var10);
      } else {
         boolean var18 = false;
         if (var13 != null) {
            for (Object var19 : var6) {
               if (Intrinsics.areEqual(((me.octo.client.llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll)var19).g(), var13)) {
                  var18 = true;
                  break;
               }
            }
         }

         if (var18) {
            var16 = null;

            for (Object var20 : var6) {
               if (Intrinsics.areEqual(((me.octo.client.llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll)var20).g(), var13)) {
                  var16 = (me.octo.client.llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll)var20;
                  break;
               }
            }

            if (var16 == null) {
               throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
            }
         } else {
            var16 = (me.octo.client.llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll)CollectionsKt.first(var6);
         }
      }

      if (var16.f()) {
         llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var16.g();
      }

      return var16;
   }

   private final llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll a(String param1) {
      // Decoy: `u()` is a foreign static string-pool field (written only by the unused setter b(String)); its
      // value lands in local 2 and is tested only by `aload_2; ifnull` folds (offsets 32 and 90) - dropped.
      List var3 = StringsKt.split(param1, new char[]{'\t'}, false, 0);
      if (var3.size() < 7) {
         return null;
      }
      String var4 = StringsKt.trim((CharSequence)var3.get(1)).toString();
      if (var4.isEmpty()) {
         return null;
      }
      String var9 = StringsKt.trim((CharSequence)var3.get(0)).toString();
      String var10 = StringsKt.trim((CharSequence)var3.get(2)).toString();
      Long var11 = StringsKt.toLongOrNull(StringsKt.trim((CharSequence)var3.get(3)).toString());
      long var12 = var11 != null ? var11.longValue() : 0L;
      Long var13 = StringsKt.toLongOrNull(StringsKt.trim((CharSequence)var3.get(4)).toString());
      long var14 = var13 != null ? var13.longValue() : 0L;
      String var15 = StringsKt.trim((CharSequence)var3.get(5)).toString();
      String var16 = StringsKt.trim((CharSequence)var3.get(6)).toString();
      return new llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll(var9, var4, var10, var12, var14, StringsKt.equals(var15, "Playing", true), var16, null, null, 384, null);
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.u ()Ljava/lang/String;
      // 003: aload 1
      // 004: checkcast java/lang/CharSequence
      // 007: bipush 1
      // 008: newarray 5
      // 00a: astore 4
      // 00c: aload 4
      // 00e: bipush 0
      // 00f: bipush 9
      // 011: castore
      // 012: aload 4
      // 014: bipush 0
      // 015: bipush 0
      // 016: bipush 6
      // 018: aconst_null
      // 019: invokestatic kotlin/text/StringsKt.split$default (Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;
      // 01c: astore 3
      // 01d: astore 2
      // 01e: aload 3
      // 01f: aload 2
      // 020: ifnull 041
      // 023: invokeinterface java/util/List.size ()I 1
      // 028: bipush 7
      // 02a: if_icmpge 03a
      // 02d: goto 034
      // 030: invokestatic me/octo/client/lIIIIlIIllIIIllllllIlIlIllllllllllllIlllIIlIllIIllIIlllIlIIIIIlllIlIIllIlIIlIIlllIIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 033: athrow
      // 034: aconst_null
      // 035: areturn
      // 036: invokestatic me/octo/client/lIIIIlIIllIIIllllllIlIlIllllllllllllIlllIIlIllIIllIIlllIlIIIIIlllIlIIllIlIIlIIlllIIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 039: athrow
      // 03a: aload 3
      // 03b: bipush 1
      // 03c: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 041: checkcast java/lang/String
      // 044: checkcast java/lang/CharSequence
      // 047: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
      // 04a: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 04d: astore 4
      // 04f: aload 4
      // 051: checkcast java/lang/CharSequence
      // 054: invokeinterface java/lang/CharSequence.length ()I 1
      // 059: aload 2
      // 05a: ifnull 068
      // 05d: ifne 06b
      // 060: goto 067
      // 063: invokestatic me/octo/client/lIIIIlIIllIIIllllllIlIlIllllllllllllIlllIIlIllIIllIIlllIlIIIIIlllIlIIllIlIIlIIlllIIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 066: athrow
      // 067: bipush 1
      // 068: goto 06c
      // 06b: bipush 0
      // 06c: ifeq 075
      // 06f: aconst_null
      // 070: areturn
      // 071: invokestatic me/octo/client/lIIIIlIIllIIIllllllIlIlIllllllllllllIlllIIlIllIIllIIlllIlIIIIIlllIlIIllIlIIlIIlllIIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 074: athrow
      // 075: new me/octo/client/llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll
      // 078: dup
      // 079: aload 3
      // 07a: bipush 0
      // 07b: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 080: checkcast java/lang/String
      // 083: checkcast java/lang/CharSequence
      // 086: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
      // 089: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 08c: aload 4
      // 08e: aload 3
      // 08f: bipush 2
      // 090: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 095: checkcast java/lang/String
      // 098: checkcast java/lang/CharSequence
      // 09b: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
      // 09e: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 0a1: aload 3
      // 0a2: bipush 3
      // 0a3: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0a8: checkcast java/lang/String
      // 0ab: checkcast java/lang/CharSequence
      // 0ae: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
      // 0b1: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 0b4: invokestatic kotlin/text/StringsKt.toLongOrNull (Ljava/lang/String;)Ljava/lang/Long;
      // 0b7: dup
      // 0b8: ifnull 0c5
      // 0bb: invokevirtual java/lang/Long.longValue ()J
      // 0be: goto 0c7
      // 0c1: invokestatic me/octo/client/lIIIIlIIllIIIllllllIlIlIllllllllllllIlllIIlIllIIllIIlllIlIIIIIlllIlIIllIlIIlIIlllIIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c4: athrow
      // 0c5: pop
      // 0c6: lconst_0
      // 0c7: aload 3
      // 0c8: bipush 4
      // 0c9: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0ce: checkcast java/lang/String
      // 0d1: checkcast java/lang/CharSequence
      // 0d4: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
      // 0d7: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 0da: invokestatic kotlin/text/StringsKt.toLongOrNull (Ljava/lang/String;)Ljava/lang/Long;
      // 0dd: dup
      // 0de: ifnull 0e7
      // 0e1: invokevirtual java/lang/Long.longValue ()J
      // 0e4: goto 0e9
      // 0e7: pop
      // 0e8: lconst_0
      // 0e9: aload 3
      // 0ea: bipush 5
      // 0eb: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0f0: checkcast java/lang/String
      // 0f3: checkcast java/lang/CharSequence
      // 0f6: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
      // 0f9: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 0fc: sipush -19149
      // 0ff: sipush 4220
      // 102: pop2
      // 103: ldc "Playing"
      // 105: bipush 1
      // 106: invokestatic kotlin/text/StringsKt.equals (Ljava/lang/String;Ljava/lang/String;Z)Z
      // 109: aload 3
      // 10a: bipush 6
      // 10c: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 111: checkcast java/lang/String
      // 114: checkcast java/lang/CharSequence
      // 117: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
      // 11a: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 11d: aconst_null
      // 11e: aconst_null
      // 11f: sipush 384
      // 122: aconst_null
      // 123: invokespecial me/octo/client/llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
      // 126: areturn
   }

   public void c() {
      this.a(
         IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
         llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
      );
   }

   public void d() {
      this.a(
         IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
         llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
      );
   }

   public void e() {
      this.a(
         IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
      );
   }

   public void f() {
      this.a(
         lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
         llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
      );
   }

   public void a(long var1) {
      long var3 = var1 * 10000L;
      short var10002 = -19150;
      short var10003 = 14504;
      var10003 = -19160;
      short var10004 = -15897;
      String var5 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         + "\n"
         + IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         + "\n"
         + StringsKt.replace(
            "if ($session) {\n    $timeline = $session.GetTimelineProperties()\n    $target = $timeline.Position.Ticks + __DELTA__\n    if ($target -lt 0) { $target = 0 }\n    $session.TryChangePlaybackPositionAsync($target) | Out-Null\n}",
            "__DELTA__",
            String.valueOf(var3),
            false);
      this.a(var5, llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI);
   }

   private final String a(String param1, String param2) {
      String var3 = me.octo.client.llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.u();
      String var11;
      try {
         ProcessBuilder var4 = new ProcessBuilder(new String[]{"powershell", "-NoProfile", "-NoLogo", "-NonInteractive", "-ExecutionPolicy", "Bypass", "-Command", param1});
         var4.redirectErrorStream(true);
         if (var3 != null && param2 != null) {
            Map var8 = var4.environment();
            Intrinsics.checkNotNullExpressionValue(var8, "environment(...)");
            var8.put("POLINEX_PREFERRED", param2);
         }

         Process var5 = var4.start();
         boolean var6 = var5.waitFor(2500L, TimeUnit.MILLISECONDS);
         if (var3 != null) {
            if (!var6) {
               var5.destroyForcibly();
               return null;
            }
            if (var5.exitValue() != 0) {
               return null;
            }
         } else if (var6) {
            return null;
         }

         java.io.InputStream var7 = var5.getInputStream();
         Intrinsics.checkNotNullExpressionValue(var7, "getInputStream(...)");
         java.io.Reader var9 = new java.io.InputStreamReader(var7, Charsets.UTF_8);
         int var10 = 8192;
         java.io.Reader var13;
         if (var3 == null) {
            var13 = (java.io.BufferedReader)var9;
         } else if (var9 instanceof java.io.BufferedReader) {
            var13 = (java.io.BufferedReader)var9;
         } else {
            var13 = new java.io.BufferedReader(var9, var10);
         }
         var11 = StringsKt.trimEnd(TextStreamsKt.readText(var13)).toString();
      } catch (Exception var5) {
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("powershell SMTC invocation failed:" + var5.getMessage());
         var11 = null;
      }
      return var11;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.u ()Ljava/lang/String;
      // 003: astore 3
      // 004: nop
      // 005: new java/lang/ProcessBuilder
      // 008: dup
      // 009: bipush 8
      // 00b: anewarray 42
      // 00e: astore 5
      // 010: aload 5
      // 012: bipush 0
      // 013: sipush -19141
      // 016: sipush 145
      // 019: pop2
      // 01a: ldc "powershell"
      // 01c: aastore
      // 01d: aload 5
      // 01f: bipush 1
      // 020: sipush -19148
      // 023: sipush -24223
      // 026: pop2
      // 027: ldc "-NoProfile"
      // 029: aastore
      // 02a: aload 5
      // 02c: bipush 2
      // 02d: sipush -19147
      // 030: sipush -14377
      // 033: pop2
      // 034: ldc "-NoLogo"
      // 036: aastore
      // 037: aload 5
      // 039: bipush 3
      // 03a: sipush -19142
      // 03d: sipush 26432
      // 040: pop2
      // 041: ldc_w "-NonInteractive"
      // 044: aastore
      // 045: aload 5
      // 047: bipush 4
      // 048: sipush -19144
      // 04b: sipush -181
      // 04e: pop2
      // 04f: ldc_w "-ExecutionPolicy"
      // 052: aastore
      // 053: aload 5
      // 055: bipush 5
      // 056: sipush -19155
      // 059: sipush 8538
      // 05c: pop2
      // 05d: ldc_w "Bypass"
      // 060: aastore
      // 061: aload 5
      // 063: bipush 6
      // 065: sipush -19161
      // 068: sipush -7063
      // 06b: pop2
      // 06c: ldc "-Command"
      // 06e: aastore
      // 06f: aload 5
      // 071: bipush 7
      // 073: aload 1
      // 074: aastore
      // 075: aload 5
      // 077: invokespecial java/lang/ProcessBuilder.<init> ([Ljava/lang/String;)V
      // 07a: bipush 1
      // 07b: invokevirtual java/lang/ProcessBuilder.redirectErrorStream (Z)Ljava/lang/ProcessBuilder;
      // 07e: astore 4
      // 080: aload 3
      // 081: ifnull 0c3
      // 084: aload 2
      // 085: dup
      // 086: ifnull 0c2
      // 089: goto 090
      // 08c: invokestatic me/octo/client/lIIIIlIIllIIIllllllIlIlIllllllllllllIlllIIlIllIIllIIlllIlIIIIIlllIlIIllIlIIlIIlllIIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08f: athrow
      // 090: astore 6
      // 092: bipush 0
      // 093: istore 7
      // 095: aload 4
      // 097: invokevirtual java/lang/ProcessBuilder.environment ()Ljava/util/Map;
      // 09a: dup
      // 09b: sipush -19163
      // 09e: sipush 27315
      // 0a1: pop2
      // 0a2: ldc_w "environment(...)"
      // 0a5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0a8: astore 8
      // 0aa: aload 8
      // 0ac: sipush -19162
      // 0af: sipush -30693
      // 0b2: pop2
      // 0b3: ldc_w "POLINEX_PREFERRED"
      // 0b6: aload 6
      // 0b8: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0bd: pop
      // 0be: nop
      // 0bf: goto 0c4
      // 0c2: pop
      // 0c3: nop
      // 0c4: aload 4
      // 0c6: invokevirtual java/lang/ProcessBuilder.start ()Ljava/lang/Process;
      // 0c9: astore 5
      // 0cb: aload 5
      // 0cd: ldc2_w 2500
      // 0d0: getstatic java/util/concurrent/TimeUnit.MILLISECONDS Ljava/util/concurrent/TimeUnit;
      // 0d3: invokevirtual java/lang/Process.waitFor (JLjava/util/concurrent/TimeUnit;)Z
      // 0d6: istore 6
      // 0d8: iload 6
      // 0da: aload 3
      // 0db: ifnull 104
      // 0de: ifne 0f4
      // 0e1: goto 0e8
      // 0e4: invokestatic me/octo/client/lIIIIlIIllIIIllllllIlIlIllllllllllllIlllIIlIllIIllIIlllIlIIIIIlllIlIIllIlIIlIIlllIIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e7: athrow
      // 0e8: aload 5
      // 0ea: invokevirtual java/lang/Process.destroyForcibly ()Ljava/lang/Process;
      // 0ed: pop
      // 0ee: aconst_null
      // 0ef: areturn
      // 0f0: invokestatic me/octo/client/lIIIIlIIllIIIllllllIlIlIllllllllllllIlllIIlIllIIllIIlllIlIIIIIlllIlIIllIlIIlIIlllIIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f3: athrow
      // 0f4: aload 5
      // 0f6: aload 3
      // 0f7: ifnull 10f
      // 0fa: invokevirtual java/lang/Process.exitValue ()I
      // 0fd: goto 104
      // 100: invokestatic me/octo/client/lIIIIlIIllIIIllllllIlIlIllllllllllllIlllIIlIllIIllIIlllIlIIIIIlllIlIIllIlIIlIIlllIIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 103: athrow
      // 104: ifeq 10d
      // 107: aconst_null
      // 108: areturn
      // 109: invokestatic me/octo/client/lIIIIlIIllIIIllllllIlIlIllllllllllllIlllIIlIllIIllIIlllIlIIIIIlllIlIIllIlIIlIIlllIIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10c: athrow
      // 10d: aload 5
      // 10f: invokevirtual java/lang/Process.getInputStream ()Ljava/io/InputStream;
      // 112: dup
      // 113: sipush -19153
      // 116: sipush 7095
      // 119: pop2
      // 11a: ldc_w "getInputStream(...)"
      // 11d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 120: astore 7
      // 122: getstatic kotlin/text/Charsets.UTF_8 Ljava/nio/charset/Charset;
      // 125: astore 8
      // 127: new java/io/InputStreamReader
      // 12a: dup
      // 12b: aload 7
      // 12d: aload 8
      // 12f: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
      // 132: checkcast java/io/Reader
      // 135: astore 9
      // 137: sipush 8192
      // 13a: istore 10
      // 13c: aload 9
      // 13e: aload 3
      // 13f: ifnull 158
      // 142: instanceof java/io/BufferedReader
      // 145: ifeq 15e
      // 148: goto 14f
      // 14b: invokestatic me/octo/client/lIIIIlIIllIIIllllllIlIlIllllllllllllIlllIIlIllIIllIIlllIlIIIIIlllIlIIllIlIIlIIlllIIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14e: athrow
      // 14f: aload 9
      // 151: goto 158
      // 154: invokestatic me/octo/client/lIIIIlIIllIIIllllllIlIlIllllllllllllIlllIIlIllIIllIIlllIlIIIIIlllIlIIllIlIIlIIlllIIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 157: athrow
      // 158: checkcast java/io/BufferedReader
      // 15b: goto 169
      // 15e: new java/io/BufferedReader
      // 161: dup
      // 162: aload 9
      // 164: iload 10
      // 166: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;I)V
      // 169: checkcast java/io/Reader
      // 16c: invokestatic kotlin/io/TextStreamsKt.readText (Ljava/io/Reader;)Ljava/lang/String;
      // 16f: checkcast java/lang/CharSequence
      // 172: invokestatic kotlin/text/StringsKt.trimEnd (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
      // 175: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 178: astore 4
      // 17a: goto 19a
      // 17d: astore 5
      // 17f: aload 5
      // 181: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 184: sipush -19164
      // 187: sipush -6405
      // 18a: pop2
      // 18b: ldc_w "powershell SMTC invocation failed: "
      // 18e: swap
      // 18f: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 194: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b (Ljava/lang/String;)V
      // 197: aconst_null
      // 198: astore 4
      // 19a: aload 4
      // 19c: areturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var25 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[32];
      int var3 = 0;
      String var2 = "ðùQÎ×µ\u0091\u000bP¹ë:;Ù\u009c@õ\u00ad\u0096\u001c\u0089AI8\u0096ÔI6öµ\u0082i$kwÎG\u0080å@çp¢]_\u0017\u007fç÷\u0011Ø\u0083^\u001fÔãiOKjf%E\u008dv%ï&zFöXў\u008b¨Á\u001f\u0014Át\u001f\u009fçó©ÀÑ_l%Àw&qz\rÙ0ù\u001d \u008e9<\u000f7\u000eq\u0080g\u0084³{+\u009cá\\Ü1é\u008f´x4^MP ÄvìÜ£HO\u0093¦\u0094\u009eçBçÇÎÖÃØàå·²Uþ¨\u0081\u0097\u009b\b¬CÌ\u0088\u0004ï\u0090\u0087ß¯\u0013¸°¬ýÝùÝ/#»2v\u0012\u001dÿ6Ø®KD¤\u009bßB½\bZéÀ\u009fâ,\u001eÜ#\u0006\u009aÐ)×z\u0012\u0002ä\u0088ÚQ¶Â6Õ'¤\u0012»÷iá¤ÎÅýI\b\u0098æ\u008f\u001fñ\u009d£F8É\u0015¨y5ÂÉøJ\fÜ!å\u0018\rNµ²ê\u0018«õ\u009dÁä´M¯\\~fÕ\u0010²\u0006÷\u0084QÉ¨I\u008b\f\u0090Ø\u0016ù\u0004ÉWÂä\u000fÜ\u0085Ë\b·\u001c3ûg\u0004¯f>_\u0004]/æ~ Þ|Ô²p\u001d\u0018\u0010\u0014¹\tµ\u0098º÷\u0013çKØ¿\"\u0000\u0092!\u001e^\u009d3Ô¬%Å\u0084\u008b-ºeêI\u0014å$\u0093oÍ\u007f\u009dmÂ\u0093Í®¹´×\u0010\u0095\u001d²7%G=?\u0083ö\u009dø3\u0018RXÁ~½\u0091Oq\u0015%\u001e\u0010vñ$x\u0013\u0095=ØÂ]X@)Í°\u001a¾Gy=\u0005ô\u0013lX}<\u001f\u0094ÙXÔ\u0090ÑI±Ëg!²X^i\u001b\u0081\u0016y\u0017\u0005½\u000eÌ\u0013éÉ('=½\u0091á\u008b\u009cÂ¦xÒx¨\u008c_E8\u0005\u009e\t\u007f\u001cs\u0096\u0092F¿Å?áÇ\u0095\u0082v-\u0003\u0085\u009cr\u0095a}bQ7BÓz³ú~»\u000ed\u0084»ö\\ä4°\u0082·\u0014P²ãuÈq\u009c\u0095\u0001\u009dÀ\u0004£/ sd7®#@Ç üºJ}\u001f\u0015\u009aâ\r ©fêvæf?m£\u000bZ\u0087ª±5\u0083/®¾\u0090«¢F\u0013AºàÄ§\u0011 6|÷÷¸YUÉ]¡õ\u000b\u0088z\u0005\u009fä${a»Ú\u00077KÊÇSv±«ÀùÚ#N\u0006xýõ\f¾®\u0017F\u001d\u0004Böu¬\u0003§NîË&°qÎ««ßµÅ½\u0013É\fZ\u0081²@ØÕì\u007f\u00131/\u0014S\u0094\u008dÇ\u0012\u000f°Á°\u0085\u00909L\u009fV±\u0093ÖïXÕ\u0089X\u0004ý\u0086\u0084,Ù\u0011\u007fÈÓ\u0082 \u009a30ßþsPáÆ\u009aä¡Z\u009fg]æ%{ùa\u009c\u0084\u0091ÎÃ\u0005\u008a¨\u008fÑ\\ \n\u0091¦çª9%K\u000fEO¢g\u008f\u0089\u0007½\"«Q\u0017\u009bß\u0089H1&æW#&\u0085²\u008d$\u001c¶\u00adÌ·b?ù?º\u0095ýr\u0081E\u009bÖ\u001d¹£Î\u0004W]\u001dn-\u0013èP«\u001c\u0092Ö\u0090\u001bª¼\u0017Î\u0002DÂ Úön(Ë>\u0085\u008e$\u0095n\u008eV\u000b\u0000Fcq\u0094¦\u001d[oÍÑKüÂ³ö|P(W\u000bIÉ+g\u00940`\u000eÒ\u0005÷:\u007fÂ\b\u008d\u007ft\u009fâXp¥\u0004:[\"\u009dÈq\u0005;ÂÖe \u001f\u0004Ì@\n÷\u008d\u001fÇÞ\u008avcàv\u001e5\n\u0013\u0099çAVèô\u00165¼Èô\u0019gSb·»3ù¸r%ø²ø\u0003¼\u0093oÞ\u0006Z\u0080\u0012iÝ-del÷]Ìg(Y¶Ø\u0012Ô\u001evÖ\u0011?}\u0091'\u0015\u0087\f\tä÷2Z\u0096ÂxùÊÄ¸£[[ÀàÇ^¡+©\u009b%\ti~Å\u0082\u0010Á\u0084^¹å\u0089\u007fý\u001e6áR\u0095G\u000f\u008a9°*P¿°qX\u007f\\zW6â\u007f\u009a\u0098Ï\u001få=¡H\u0012¶Wbyß\rÔC/°`\u001e\u00978ÛÄÒ\u0001h\u0019ÔÈoâ\u0002|Ëh_\u001aëØ\u009b+\u008c©-]\u0096v\u0015\u008f\u001d¶×,ç\u0085Æ*<¨Û\u0086\\×\u00adu¹Ð\u007f@RîSaN·È\u008f¹ëW\u00184¬QDCyt>.3\u008fW¥Â©·\u0013Iw\u009d} \u008d+SÐ²\u009f^h0$Å-!\u0097\u001d+H\u0090òý~4( \u0012\u0014Ùd\u000bs\u00adÒÝifê\u008dâö($\u0018\u00849\nÃ¬$\u0006£ÇRwF\u0090\u0080H\u00adï¬A±³7\u001c\u0010\u00ad*a=á,âw\rÔ\u001cÐ\b,¼K\u0007[éîcO¢1#¨»~\u0005[v\nÎD\u001eÜ\u000e\u009e\u0099\fÁ¡çy\\Á\u0010ODéÝóKC¦+`\u009f\u0093\u000e\u0010Eîu\u0082\u001b\u0017\u0004uJba¸\u0094!/ê\u0011¨}aÕØóñ´1\u0012¬cQ\u0085íá\u0083\bqã«¯å8'V\tRÏØ\u009däf-5\u009f\u0010²xË\u0003\u008e9¨¸\u0015Èr´Z öÚǺ\u0086Ê`×):È\u0084LªõÿÖtãL¡\u0085£îWJm\u000eç\f\u0093R\u0015\u0018hJÍxÐ\u0090þH\u008f\u0018'BînNÛ\u0096\u0013YMâ¥s¿pè¹ÓßÃ@<Ä\u0018ïï³\u0018\u0085|r÷^AEÏ©¦\u0011\u008erÀ\u0098Y\u0019\rãª\u0007\u0087\u009f]0~x8NV3ÆY\u009fOÅp\u0018¹8ú\u0098ûQ)\u0012,ÓþT¡*ßzÄ\u0015ÛÚ\u0003\t\u0082Àe\u0010\u001e-\n©n>ÓØó\u009d!Qurð2\u0016 S\u007f\u0002\u0097z\u009a¯ÆÔ:á»|å¢\u009avß¯Ü\u009a\u0094Cz\u000e·*\u0010Pø&ïý\b4ï\u00adC\u009bJÓóTX¾Þg \u008a±y\u009ft1ö6a\u001bÞR\u001d\u0011Z\u008a\nk?HI\u0006Ç\u0091fl°\u0085-\u000buL Ül{\u0018Nª\u0092\u0097*âú\u0081½D6mßrQí¨\rØ´ Ý\u0013\u008a\u001e\u001fê®Åä'ÁÇ\u0017mÃA9\u001aO¦+ngBà6T¢\u007f\u0005\u00adö\u008d× \u0081l\u0001ñ(\fÆ}¨·CÎaHWaÛPslÿö\u0097¦È¼ù\u0002\u001e¢¬¢B¯K±\u009d,üÄÛKl\u0003t\u009a)2ì¾Êz\u000etî=þ¹²ÁbÓ,Lm1#a\u0095ëî\u009aJ&dçàj\b\fÖ¶ gC£Ù®ÔÀ\u000bWZ\u001a]õ½Yâå÷ÀL-\u0087ç¢\u009fg¢,¬\u0081×÷éö[O\u0010\u00813\u0011nñ\u001d:áàk\u000eVJGNÙµnú÷a)49\bEÊ\u0012[ÍgÇ¤ÏeÔ`\u000b{I/\u0099>Î~¢©ñ\u001d\u0097ø0g\u0016S\u001f\u0098ÒÕ\u0001\u001dÛfc\u008b>²gI¿\u0081ê±¶/ÍA_\u0092Ê÷b9\u008e»{EÙ¾Ü\u0082]ïÞ\u0080\u0007gq\"È±»+9Çÿ·\u000e\u000b\u00ad\n\b#Ù\u00856öX%pÂ«pÜUYÒ;å´':;$8A\u000eNïNL\u009d\u0095Ü\u00ad\u009bFY§Î\u008f\t\u0095\u008bH§a`÷ø\u001a\u0006ÚQC\u0088\u001aC@\u009f\u0001¼ÑjV&w¦65Ëàçç\u0087\u009aU{\u00034¢þD`[\u0097Ç-\u009cþ¿E|sFÇ\u0091õPå\u0010ú°a9C8hô'ñ\u0001EðÌ´c@\u0004\u009c[g\u008f\u0013¤5\t³Ê\nº3Ó\u008a¤±¥§©\u0016T\u00927\u0006°ZÔÝ\u0081\u001d6¦ÐñaÅÂ0F\u009f\u0080Ä¯¿¡yúÞé\u0093Ò4i\t¨üÆ\u007fA9\u0099Æ1âþG5\u0082Ïæ\u0005OÙ\u000er\u001a\u008d'\u0085qC\u0007q]\u0085Ü\u0089\u00817'\u0099ÖÃÌÎ\u008f>¤\u0000\"\u000ff·2\u008d.\u0084íUH\u001eÚ\u000fá¸³\u0081çñÇÎîoË\n,\u0081TÆ]'\u00ad(ø\u009cÇ\u0010»d³Õ\u000f%á{ü\u008fÄ%Ô\u008fÔ\u000fá\u0089\t\u0019ìÉ\"\u001f×?Eït88ü\u0013KÎ\u0084mbXýZX@³â0Å\u00896î|ÞÅØÄ\u0006\u0081¥¾X[÷æª÷¾ùæC\u009dHBô$ò=Úï\u0097}wMÞYxt}ôíâ\u0081nd:Ê+Þ\u0080~\u0081\u001aX=]Y¢º/;\u0087Ú\u0092\u0083³}06\u0089Sô\u0080ß6Å\u0094r+~!;>(\u0086A\u001a>\u0006\u0019Ñ\u0002Íÿ\u0005C\u0085c\u0089\u0085\u008f\u0096\\oÙ¸¦bqP\u001fÎ¾i´æ\u0007\u0002/§\u001b\u0007yÆvÕ\u0095î¤\nê>Ø\u0085\u0094éý®u\u0096\u0007¯«p+\u009c«K6 \u0090!ißÃsf÷\u0084É/\u001e±MøX©CÚ.hJ\u0088\u0094ÂrÁ\u0098\u0089ò3d¾\u0097=\u0098Î¥%'Ý\u0003ò»\u009d\u0013\u0087÷\u0003×yG\u0084\bÆ\u008a]\u0082;\u009düâ\u0010\u0010Ã\u0090ey|aEµàñ¯d+vT\n\u0017Sg(c\\\u0003\u0018ª@\u000f©\u0092°.¢du2*\u008c\u008f×ûC&\n4Ëí\u000b)·Dö\u008d\u0019ڦì\u001aÇ\u0013é´|\u009c©\u0000#_\f`®ÅÙ\u00970ì\u0019*í\u00ad\u0004\u000eÄ\r\u0007Ö\f\u0094daóî\u0006Í\u007f7\bç^\u009a\u008d\u001e)òº\u0003tO\u001bÈ\u008fXÃc\u009d®\t×®ö«\u0096\u0011's¦8ì\u000e\fº½4L\u0096Æi\u0093*C9`A\u009dSß\u000bQ|\u0004ë¡1\u0005\u0085ÿÚ\u009a\u001d[D\u0013Ú\u008e\u00877;¨,ÂcR\u0093\u0086Î¼êÀ\u0084\u0080ð\u00983\u00803\rwÝ¨ö\u0092\u009aÃ\u00000J\u0004\u001c16\u00955vi\u0092ÁGç\r£×üÝü\u0015fÇ\u0018Ræ\u001f lsëúUè\u00adæ\u0004\u0001\fâ\u009d3àì6¯w\u0012\u009dØùövJ\u008a£m°gbÄc\u0093rmùgÝÙMC£%4!\u001fæÚv\u0014VÔ£És\b\u0012\t$°ÿ7\u0088ú\u009f=;\n\u001a8ÊU\u000b~çJ²{\u008fÂÓï×¿\u0086\u008cùe¶\nw\b$\u0098¥B*\u00169ÊAÈSq_\u0006.5quâ\u0014\u0005\r60\u0007=[\u0085é\t5Íy\u00adû\u0019\u0092\u0097Þ%Û\u0090\u0090|:¥´¶\u000fî¤d\u0080ä!à,z\u00140ºÿ0kKÏ[³q5&z\u0006¾öl}\u0018[\u00ad\u008cö\u0093ëXYöR~ý\u001c\u0094ÍlÂåiÀ%~1õ\u0098²>Ó\u0095Ò\n2\u0087|\u0098o\u0086ÏnÝùF\r\u0001GQ\u0088Û--ê\u00ad5°\u008aÈ\"ÀÊ$0e\u0017\u009bþ<\u008e5\u00ad\u001d\u009f\u008c\bÀ\u0086dïí\u008b|3Hu\u0001È±b^}³óÝeì_ig%}s´\u0080£5ªÕ\u008c4\u00adúOù£5Ã#:\u0018{5(È%Ý\u008cþqàyïÛ1só³»\u009e\u007f\u0019çrjÒ\u009fAyOIxRg{\u0090c55ö^¨HäoúÐW\u00ad\u0092äâ\u0018o\u009e\u0088÷\u009a\u0097RÎ©Eç\u008c\u0001Ì¶\u0082ç\u0018¤³\u0010E\u009fÍ×2\u0093GN\u000bU³\u008e\u008b\u0085ºØÕ+\f\u0083)½M±ÒÙ\u0086\u0080]\u0017\u009a\u009e[µúÍ3ÌË\u000f¡<o~òx\u0082©åN\u0011´\u0005\u0015'É4×z\u0015bly}b\u0017¸kü\u000fa>8Q\u0096Ìí\u0005G\u0095\u00186IÛÄ6Ó\u0018\u0017\u0087§m¥óÈv\u007f_\u0094\u0083§_,õ\u009eù6\u0083Â\u0013WS\u0091¸S£y\u008e\u0095\u0099\u0093 +^\u0080e÷ïüÈµ'QÃÈuèW6û4åøWA«6¨\u008d\f¢\u00892 =|\u0096÷\u0099HÛà\u000bõ\u001d\f\u0095ØÒï@²I\u0012\u009dx[\u007få2K\u0083ç÷ôí\u0096ÛC\u0000\u00001x~¡EÓÌwm#îº'Ò\u0004&2á\u0007>\u001aà\u0093\u0088 õ@J5\t&\u0082pdçzL(ï\u0094\u0086úá#0RR>\u0018L#\"\u008a\u0010\u000f%Q5óÀU \u0012L¬\u0097_ÿ¤ï\u008e»cM^Zf_ÿb^\u0011ßJÊ5QÀ»gV\n¦<\u008d\u008aê\u0005K[Ó\rQ\u009c\u0087`¶\u0084£ì`õ=Â¯>dõ¢ï®ñé\u007f>\rÊPÜ\u0014a\u0090ôf\u001f)ùÄïÏP¥>õÖjX=\u0095\u0082S\u0000_\u008b\t«óC'\b\u0010<B\u0007ëTIcüÜäý9\u008d\u0098\u0090\u001a%¹\u0015pí¸s\u001f²&û'\u0013gÚ <\u0000ï1\u0081.VTô®\u0011)Zèºà;wË\u009e\u0095~D*ÁRY\u009cÿ\u0015zïC^1Æ}\u008c¹m\u0090!Â½\u001d\u0001\u0017xA\u0091ià@Ã\u0088Û¥O]<\u001bü\u0005:\u0092øs\u0016Y8\u009a@\u001c¾Mßu>\u0003$\f\u00079¬@\u0081`\u0001p(h\u00943¶é*E\u0088YìGõ\\\u00adq(iåÙå|[óÑWé»²Ð\u0089\u0082\u008aÇ÷ ]\u008aê\u00830¯\u0086Vdþe\n\u001c:åâ\u008eãðu)T\u0094ÍÝ\u000fuérêð÷\u0015\u0002\u0093\u0096É_>Ú»S\u0011ûYRV\u0088BNo²±.\u009dÝ \u0015óês\u0006á\u0014\u00adOÙ\u0082\u0097 \u001e©5Ðï\r\u009cwGhm@¡«mxö[È\u0097·s\u0012?Ü¹ç?\u009av(¦0ûÞaÀký£ç|mX¶åã\u0080£f\u0090\u0088æ\u0000\u009c/{Ûg\u0013ênþ\u0094ÒÉ\u000e/=B{Ù§\u001f{\u001f^3Z*SÒ=h{áþ\u0098TEt¡\u001fO\u008bØ\r\u0013Ã¡Æ\u0013ðì;0\u009c½ß\u0086B\u009cu\u009b1¨XÑêÚ\u0001³mïu~í×[\u0012wÑ\u008buqûî½!\u0011¥!ËÀÄH\u001cù7>,\u0093\u001b®ã}hÇ<\u0084\u008fö`ì\"Ì¾\u0095ñôU\u0083¤\u0090¼H!üãÝ*\u0083LáòToöå¸-lÍ¸\u0084ÜÚÈ\u009e±ÆJfT0¤Ò\u0089\u008c\u009d@\u0007ø#êÅ\u009e³ÒÉú?5\u001bfB·\u0088\u0093 éW\u00045c²\u0099ßÛØ=?\u0018\u0004\u0010~¿.\u0006q\u000b\u0003ê\u0012zªÐÎ\u0080»\r\u0080å\u00adV\u0098Ö Ä\u008e}K\u009e`Bw ßxóiïV\u0095²\u0088>ñR\rá¼\u0082!ö\u0081â Â¦P\u00adÚ,\u001e3w/KXÐÝëó9às¯\u0016\u0000¼\nêÂU\u001a«P}l>ö¯ï\u0089õW/\u0091\u008d\u0003Íl\u008dÙ\u0085Js\u0018\u00ad\u000fä¾ô\\°F?@nM7¿.£Ta£Þ$\u0011\\YÉ,\bù\tY°P~;³oMV$ÍµÅ¾ÞF ý\u000f5\u0086ÀAc@]t§¸®eRð\u001f\u0087«ªÚýNÃ\u0004RJºÀ\u009cÏ\u001bZ½)-9\u0012EÎ\u0000Íh\u0088q\u0019H²vm4½zm\u0083ýè\u008eÛ\u008a\u0097\u008a\tqäîÉñ\u0015Xå3^\u0005-fZGú\u0010Ö\n\u0087U\u0098\u009bo{\u008bþ}åN\u008cä$\u008f\u0006O^\u001eÍZô4õaÿu\u0014\u000b\u0080\u0083m\u0086h<°gûdO\u001bGÙ\u0003\u0014îN\u00995sC¸\u0015K;!=\u008bO-Ù#\u0096üF\u009aÐ¾<zÂ´]ëZ¥U¯í\u00103\u0013\"\u0089\u001e&_IÊ\bøÒ\u000b2Pg\u0002?\u0090ãPÛ]iÍÏ\u008dôr,ÖÖ\u0089^éÐê=ë\u00932\u0083»\u001c\u001c>á\u001fÝîýCD\u0013îÇõQåèÄ\r'r\u007fâ0?Y\"\"<}ÀéÚ\u007f\u0015r\rX½\u001a\u0017·¨Î\u001dÑ}þ\u0002EÁ-ßp¯í";
      int var4 = "ðùQÎ×µ\u0091\u000bP¹ë:;Ù\u009c@õ\u00ad\u0096\u001c\u0089AI8\u0096ÔI6öµ\u0082i$kwÎG\u0080å@çp¢]_\u0017\u007fç÷\u0011Ø\u0083^\u001fÔãiOKjf%E\u008dv%ï&zFöXў\u008b¨Á\u001f\u0014Át\u001f\u009fçó©ÀÑ_l%Àw&qz\rÙ0ù\u001d \u008e9<\u000f7\u000eq\u0080g\u0084³{+\u009cá\\Ü1é\u008f´x4^MP ÄvìÜ£HO\u0093¦\u0094\u009eçBçÇÎÖÃØàå·²Uþ¨\u0081\u0097\u009b\b¬CÌ\u0088\u0004ï\u0090\u0087ß¯\u0013¸°¬ýÝùÝ/#»2v\u0012\u001dÿ6Ø®KD¤\u009bßB½\bZéÀ\u009fâ,\u001eÜ#\u0006\u009aÐ)×z\u0012\u0002ä\u0088ÚQ¶Â6Õ'¤\u0012»÷iá¤ÎÅýI\b\u0098æ\u008f\u001fñ\u009d£F8É\u0015¨y5ÂÉøJ\fÜ!å\u0018\rNµ²ê\u0018«õ\u009dÁä´M¯\\~fÕ\u0010²\u0006÷\u0084QÉ¨I\u008b\f\u0090Ø\u0016ù\u0004ÉWÂä\u000fÜ\u0085Ë\b·\u001c3ûg\u0004¯f>_\u0004]/æ~ Þ|Ô²p\u001d\u0018\u0010\u0014¹\tµ\u0098º÷\u0013çKØ¿\"\u0000\u0092!\u001e^\u009d3Ô¬%Å\u0084\u008b-ºeêI\u0014å$\u0093oÍ\u007f\u009dmÂ\u0093Í®¹´×\u0010\u0095\u001d²7%G=?\u0083ö\u009dø3\u0018RXÁ~½\u0091Oq\u0015%\u001e\u0010vñ$x\u0013\u0095=ØÂ]X@)Í°\u001a¾Gy=\u0005ô\u0013lX}<\u001f\u0094ÙXÔ\u0090ÑI±Ëg!²X^i\u001b\u0081\u0016y\u0017\u0005½\u000eÌ\u0013éÉ('=½\u0091á\u008b\u009cÂ¦xÒx¨\u008c_E8\u0005\u009e\t\u007f\u001cs\u0096\u0092F¿Å?áÇ\u0095\u0082v-\u0003\u0085\u009cr\u0095a}bQ7BÓz³ú~»\u000ed\u0084»ö\\ä4°\u0082·\u0014P²ãuÈq\u009c\u0095\u0001\u009dÀ\u0004£/ sd7®#@Ç üºJ}\u001f\u0015\u009aâ\r ©fêvæf?m£\u000bZ\u0087ª±5\u0083/®¾\u0090«¢F\u0013AºàÄ§\u0011 6|÷÷¸YUÉ]¡õ\u000b\u0088z\u0005\u009fä${a»Ú\u00077KÊÇSv±«ÀùÚ#N\u0006xýõ\f¾®\u0017F\u001d\u0004Böu¬\u0003§NîË&°qÎ««ßµÅ½\u0013É\fZ\u0081²@ØÕì\u007f\u00131/\u0014S\u0094\u008dÇ\u0012\u000f°Á°\u0085\u00909L\u009fV±\u0093ÖïXÕ\u0089X\u0004ý\u0086\u0084,Ù\u0011\u007fÈÓ\u0082 \u009a30ßþsPáÆ\u009aä¡Z\u009fg]æ%{ùa\u009c\u0084\u0091ÎÃ\u0005\u008a¨\u008fÑ\\ \n\u0091¦çª9%K\u000fEO¢g\u008f\u0089\u0007½\"«Q\u0017\u009bß\u0089H1&æW#&\u0085²\u008d$\u001c¶\u00adÌ·b?ù?º\u0095ýr\u0081E\u009bÖ\u001d¹£Î\u0004W]\u001dn-\u0013èP«\u001c\u0092Ö\u0090\u001bª¼\u0017Î\u0002DÂ Úön(Ë>\u0085\u008e$\u0095n\u008eV\u000b\u0000Fcq\u0094¦\u001d[oÍÑKüÂ³ö|P(W\u000bIÉ+g\u00940`\u000eÒ\u0005÷:\u007fÂ\b\u008d\u007ft\u009fâXp¥\u0004:[\"\u009dÈq\u0005;ÂÖe \u001f\u0004Ì@\n÷\u008d\u001fÇÞ\u008avcàv\u001e5\n\u0013\u0099çAVèô\u00165¼Èô\u0019gSb·»3ù¸r%ø²ø\u0003¼\u0093oÞ\u0006Z\u0080\u0012iÝ-del÷]Ìg(Y¶Ø\u0012Ô\u001evÖ\u0011?}\u0091'\u0015\u0087\f\tä÷2Z\u0096ÂxùÊÄ¸£[[ÀàÇ^¡+©\u009b%\ti~Å\u0082\u0010Á\u0084^¹å\u0089\u007fý\u001e6áR\u0095G\u000f\u008a9°*P¿°qX\u007f\\zW6â\u007f\u009a\u0098Ï\u001få=¡H\u0012¶Wbyß\rÔC/°`\u001e\u00978ÛÄÒ\u0001h\u0019ÔÈoâ\u0002|Ëh_\u001aëØ\u009b+\u008c©-]\u0096v\u0015\u008f\u001d¶×,ç\u0085Æ*<¨Û\u0086\\×\u00adu¹Ð\u007f@RîSaN·È\u008f¹ëW\u00184¬QDCyt>.3\u008fW¥Â©·\u0013Iw\u009d} \u008d+SÐ²\u009f^h0$Å-!\u0097\u001d+H\u0090òý~4( \u0012\u0014Ùd\u000bs\u00adÒÝifê\u008dâö($\u0018\u00849\nÃ¬$\u0006£ÇRwF\u0090\u0080H\u00adï¬A±³7\u001c\u0010\u00ad*a=á,âw\rÔ\u001cÐ\b,¼K\u0007[éîcO¢1#¨»~\u0005[v\nÎD\u001eÜ\u000e\u009e\u0099\fÁ¡çy\\Á\u0010ODéÝóKC¦+`\u009f\u0093\u000e\u0010Eîu\u0082\u001b\u0017\u0004uJba¸\u0094!/ê\u0011¨}aÕØóñ´1\u0012¬cQ\u0085íá\u0083\bqã«¯å8'V\tRÏØ\u009däf-5\u009f\u0010²xË\u0003\u008e9¨¸\u0015Èr´Z öÚǺ\u0086Ê`×):È\u0084LªõÿÖtãL¡\u0085£îWJm\u000eç\f\u0093R\u0015\u0018hJÍxÐ\u0090þH\u008f\u0018'BînNÛ\u0096\u0013YMâ¥s¿pè¹ÓßÃ@<Ä\u0018ïï³\u0018\u0085|r÷^AEÏ©¦\u0011\u008erÀ\u0098Y\u0019\rãª\u0007\u0087\u009f]0~x8NV3ÆY\u009fOÅp\u0018¹8ú\u0098ûQ)\u0012,ÓþT¡*ßzÄ\u0015ÛÚ\u0003\t\u0082Àe\u0010\u001e-\n©n>ÓØó\u009d!Qurð2\u0016 S\u007f\u0002\u0097z\u009a¯ÆÔ:á»|å¢\u009avß¯Ü\u009a\u0094Cz\u000e·*\u0010Pø&ïý\b4ï\u00adC\u009bJÓóTX¾Þg \u008a±y\u009ft1ö6a\u001bÞR\u001d\u0011Z\u008a\nk?HI\u0006Ç\u0091fl°\u0085-\u000buL Ül{\u0018Nª\u0092\u0097*âú\u0081½D6mßrQí¨\rØ´ Ý\u0013\u008a\u001e\u001fê®Åä'ÁÇ\u0017mÃA9\u001aO¦+ngBà6T¢\u007f\u0005\u00adö\u008d× \u0081l\u0001ñ(\fÆ}¨·CÎaHWaÛPslÿö\u0097¦È¼ù\u0002\u001e¢¬¢B¯K±\u009d,üÄÛKl\u0003t\u009a)2ì¾Êz\u000etî=þ¹²ÁbÓ,Lm1#a\u0095ëî\u009aJ&dçàj\b\fÖ¶ gC£Ù®ÔÀ\u000bWZ\u001a]õ½Yâå÷ÀL-\u0087ç¢\u009fg¢,¬\u0081×÷éö[O\u0010\u00813\u0011nñ\u001d:áàk\u000eVJGNÙµnú÷a)49\bEÊ\u0012[ÍgÇ¤ÏeÔ`\u000b{I/\u0099>Î~¢©ñ\u001d\u0097ø0g\u0016S\u001f\u0098ÒÕ\u0001\u001dÛfc\u008b>²gI¿\u0081ê±¶/ÍA_\u0092Ê÷b9\u008e»{EÙ¾Ü\u0082]ïÞ\u0080\u0007gq\"È±»+9Çÿ·\u000e\u000b\u00ad\n\b#Ù\u00856öX%pÂ«pÜUYÒ;å´':;$8A\u000eNïNL\u009d\u0095Ü\u00ad\u009bFY§Î\u008f\t\u0095\u008bH§a`÷ø\u001a\u0006ÚQC\u0088\u001aC@\u009f\u0001¼ÑjV&w¦65Ëàçç\u0087\u009aU{\u00034¢þD`[\u0097Ç-\u009cþ¿E|sFÇ\u0091õPå\u0010ú°a9C8hô'ñ\u0001EðÌ´c@\u0004\u009c[g\u008f\u0013¤5\t³Ê\nº3Ó\u008a¤±¥§©\u0016T\u00927\u0006°ZÔÝ\u0081\u001d6¦ÐñaÅÂ0F\u009f\u0080Ä¯¿¡yúÞé\u0093Ò4i\t¨üÆ\u007fA9\u0099Æ1âþG5\u0082Ïæ\u0005OÙ\u000er\u001a\u008d'\u0085qC\u0007q]\u0085Ü\u0089\u00817'\u0099ÖÃÌÎ\u008f>¤\u0000\"\u000ff·2\u008d.\u0084íUH\u001eÚ\u000fá¸³\u0081çñÇÎîoË\n,\u0081TÆ]'\u00ad(ø\u009cÇ\u0010»d³Õ\u000f%á{ü\u008fÄ%Ô\u008fÔ\u000fá\u0089\t\u0019ìÉ\"\u001f×?Eït88ü\u0013KÎ\u0084mbXýZX@³â0Å\u00896î|ÞÅØÄ\u0006\u0081¥¾X[÷æª÷¾ùæC\u009dHBô$ò=Úï\u0097}wMÞYxt}ôíâ\u0081nd:Ê+Þ\u0080~\u0081\u001aX=]Y¢º/;\u0087Ú\u0092\u0083³}06\u0089Sô\u0080ß6Å\u0094r+~!;>(\u0086A\u001a>\u0006\u0019Ñ\u0002Íÿ\u0005C\u0085c\u0089\u0085\u008f\u0096\\oÙ¸¦bqP\u001fÎ¾i´æ\u0007\u0002/§\u001b\u0007yÆvÕ\u0095î¤\nê>Ø\u0085\u0094éý®u\u0096\u0007¯«p+\u009c«K6 \u0090!ißÃsf÷\u0084É/\u001e±MøX©CÚ.hJ\u0088\u0094ÂrÁ\u0098\u0089ò3d¾\u0097=\u0098Î¥%'Ý\u0003ò»\u009d\u0013\u0087÷\u0003×yG\u0084\bÆ\u008a]\u0082;\u009düâ\u0010\u0010Ã\u0090ey|aEµàñ¯d+vT\n\u0017Sg(c\\\u0003\u0018ª@\u000f©\u0092°.¢du2*\u008c\u008f×ûC&\n4Ëí\u000b)·Dö\u008d\u0019ڦì\u001aÇ\u0013é´|\u009c©\u0000#_\f`®ÅÙ\u00970ì\u0019*í\u00ad\u0004\u000eÄ\r\u0007Ö\f\u0094daóî\u0006Í\u007f7\bç^\u009a\u008d\u001e)òº\u0003tO\u001bÈ\u008fXÃc\u009d®\t×®ö«\u0096\u0011's¦8ì\u000e\fº½4L\u0096Æi\u0093*C9`A\u009dSß\u000bQ|\u0004ë¡1\u0005\u0085ÿÚ\u009a\u001d[D\u0013Ú\u008e\u00877;¨,ÂcR\u0093\u0086Î¼êÀ\u0084\u0080ð\u00983\u00803\rwÝ¨ö\u0092\u009aÃ\u00000J\u0004\u001c16\u00955vi\u0092ÁGç\r£×üÝü\u0015fÇ\u0018Ræ\u001f lsëúUè\u00adæ\u0004\u0001\fâ\u009d3àì6¯w\u0012\u009dØùövJ\u008a£m°gbÄc\u0093rmùgÝÙMC£%4!\u001fæÚv\u0014VÔ£És\b\u0012\t$°ÿ7\u0088ú\u009f=;\n\u001a8ÊU\u000b~çJ²{\u008fÂÓï×¿\u0086\u008cùe¶\nw\b$\u0098¥B*\u00169ÊAÈSq_\u0006.5quâ\u0014\u0005\r60\u0007=[\u0085é\t5Íy\u00adû\u0019\u0092\u0097Þ%Û\u0090\u0090|:¥´¶\u000fî¤d\u0080ä!à,z\u00140ºÿ0kKÏ[³q5&z\u0006¾öl}\u0018[\u00ad\u008cö\u0093ëXYöR~ý\u001c\u0094ÍlÂåiÀ%~1õ\u0098²>Ó\u0095Ò\n2\u0087|\u0098o\u0086ÏnÝùF\r\u0001GQ\u0088Û--ê\u00ad5°\u008aÈ\"ÀÊ$0e\u0017\u009bþ<\u008e5\u00ad\u001d\u009f\u008c\bÀ\u0086dïí\u008b|3Hu\u0001È±b^}³óÝeì_ig%}s´\u0080£5ªÕ\u008c4\u00adúOù£5Ã#:\u0018{5(È%Ý\u008cþqàyïÛ1só³»\u009e\u007f\u0019çrjÒ\u009fAyOIxRg{\u0090c55ö^¨HäoúÐW\u00ad\u0092äâ\u0018o\u009e\u0088÷\u009a\u0097RÎ©Eç\u008c\u0001Ì¶\u0082ç\u0018¤³\u0010E\u009fÍ×2\u0093GN\u000bU³\u008e\u008b\u0085ºØÕ+\f\u0083)½M±ÒÙ\u0086\u0080]\u0017\u009a\u009e[µúÍ3ÌË\u000f¡<o~òx\u0082©åN\u0011´\u0005\u0015'É4×z\u0015bly}b\u0017¸kü\u000fa>8Q\u0096Ìí\u0005G\u0095\u00186IÛÄ6Ó\u0018\u0017\u0087§m¥óÈv\u007f_\u0094\u0083§_,õ\u009eù6\u0083Â\u0013WS\u0091¸S£y\u008e\u0095\u0099\u0093 +^\u0080e÷ïüÈµ'QÃÈuèW6û4åøWA«6¨\u008d\f¢\u00892 =|\u0096÷\u0099HÛà\u000bõ\u001d\f\u0095ØÒï@²I\u0012\u009dx[\u007få2K\u0083ç÷ôí\u0096ÛC\u0000\u00001x~¡EÓÌwm#îº'Ò\u0004&2á\u0007>\u001aà\u0093\u0088 õ@J5\t&\u0082pdçzL(ï\u0094\u0086úá#0RR>\u0018L#\"\u008a\u0010\u000f%Q5óÀU \u0012L¬\u0097_ÿ¤ï\u008e»cM^Zf_ÿb^\u0011ßJÊ5QÀ»gV\n¦<\u008d\u008aê\u0005K[Ó\rQ\u009c\u0087`¶\u0084£ì`õ=Â¯>dõ¢ï®ñé\u007f>\rÊPÜ\u0014a\u0090ôf\u001f)ùÄïÏP¥>õÖjX=\u0095\u0082S\u0000_\u008b\t«óC'\b\u0010<B\u0007ëTIcüÜäý9\u008d\u0098\u0090\u001a%¹\u0015pí¸s\u001f²&û'\u0013gÚ <\u0000ï1\u0081.VTô®\u0011)Zèºà;wË\u009e\u0095~D*ÁRY\u009cÿ\u0015zïC^1Æ}\u008c¹m\u0090!Â½\u001d\u0001\u0017xA\u0091ià@Ã\u0088Û¥O]<\u001bü\u0005:\u0092øs\u0016Y8\u009a@\u001c¾Mßu>\u0003$\f\u00079¬@\u0081`\u0001p(h\u00943¶é*E\u0088YìGõ\\\u00adq(iåÙå|[óÑWé»²Ð\u0089\u0082\u008aÇ÷ ]\u008aê\u00830¯\u0086Vdþe\n\u001c:åâ\u008eãðu)T\u0094ÍÝ\u000fuérêð÷\u0015\u0002\u0093\u0096É_>Ú»S\u0011ûYRV\u0088BNo²±.\u009dÝ \u0015óês\u0006á\u0014\u00adOÙ\u0082\u0097 \u001e©5Ðï\r\u009cwGhm@¡«mxö[È\u0097·s\u0012?Ü¹ç?\u009av(¦0ûÞaÀký£ç|mX¶åã\u0080£f\u0090\u0088æ\u0000\u009c/{Ûg\u0013ênþ\u0094ÒÉ\u000e/=B{Ù§\u001f{\u001f^3Z*SÒ=h{áþ\u0098TEt¡\u001fO\u008bØ\r\u0013Ã¡Æ\u0013ðì;0\u009c½ß\u0086B\u009cu\u009b1¨XÑêÚ\u0001³mïu~í×[\u0012wÑ\u008buqûî½!\u0011¥!ËÀÄH\u001cù7>,\u0093\u001b®ã}hÇ<\u0084\u008fö`ì\"Ì¾\u0095ñôU\u0083¤\u0090¼H!üãÝ*\u0083LáòToöå¸-lÍ¸\u0084ÜÚÈ\u009e±ÆJfT0¤Ò\u0089\u008c\u009d@\u0007ø#êÅ\u009e³ÒÉú?5\u001bfB·\u0088\u0093 éW\u00045c²\u0099ßÛØ=?\u0018\u0004\u0010~¿.\u0006q\u000b\u0003ê\u0012zªÐÎ\u0080»\r\u0080å\u00adV\u0098Ö Ä\u008e}K\u009e`Bw ßxóiïV\u0095²\u0088>ñR\rá¼\u0082!ö\u0081â Â¦P\u00adÚ,\u001e3w/KXÐÝëó9às¯\u0016\u0000¼\nêÂU\u001a«P}l>ö¯ï\u0089õW/\u0091\u008d\u0003Íl\u008dÙ\u0085Js\u0018\u00ad\u000fä¾ô\\°F?@nM7¿.£Ta£Þ$\u0011\\YÉ,\bù\tY°P~;³oMV$ÍµÅ¾ÞF ý\u000f5\u0086ÀAc@]t§¸®eRð\u001f\u0087«ªÚýNÃ\u0004RJºÀ\u009cÏ\u001bZ½)-9\u0012EÎ\u0000Íh\u0088q\u0019H²vm4½zm\u0083ýè\u008eÛ\u008a\u0097\u008a\tqäîÉñ\u0015Xå3^\u0005-fZGú\u0010Ö\n\u0087U\u0098\u009bo{\u008bþ}åN\u008cä$\u008f\u0006O^\u001eÍZô4õaÿu\u0014\u000b\u0080\u0083m\u0086h<°gûdO\u001bGÙ\u0003\u0014îN\u00995sC¸\u0015K;!=\u008bO-Ù#\u0096üF\u009aÐ¾<zÂ´]ëZ¥U¯í\u00103\u0013\"\u0089\u001e&_IÊ\bøÒ\u000b2Pg\u0002?\u0090ãPÛ]iÍÏ\u008dôr,ÖÖ\u0089^éÐê=ë\u00932\u0083»\u001c\u001c>á\u001fÝîýCD\u0013îÇõQåèÄ\r'r\u007fâ0?Y\"\"<}ÀéÚ\u007f\u0015r\rX½\u001a\u0017·¨Î\u001dÑ}þ\u0002EÁ-ßp¯í"
         .length();
      char var1 = 'H';
      int var8 = -1;

      label52:
      while (true) {
         short var10000 = 85;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var30 = var10001.toCharArray();
               int var10004 = var30.length;
               int var6 = 0;
               byte var33 = (byte)var10000;
               var25 = var30;
               int var16 = var10004;
               byte var42;
               char[] var50;
               int var10006;
               if (var10004 <= 1) {
                  var50 = var30;
                  var42 = (byte)var10000;
                  var10006 = var6;
               } else {
                  var33 = (byte)var10000;
                  var16 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var50 = var30;
                  var42 = (byte)var10000;
                  var10006 = var6;
               }

               while (true) {
                  var50[var10006] = (char)(var50[var10006] ^ var42 ^ switch (var6 % 7) {
                     case 0 -> 69;
                     case 1 -> 50;
                     case 2 -> 53;
                     case 3 -> 44;
                     case 4 -> 38;
                     case 5 -> 22;
                     default -> 14;
                  });
                  var6++;
                  if (var33 == 0) {
                     var10006 = var33;
                     var50 = var25;
                     var42 = var33;
                  } else {
                     if (var16 <= var6) {
                        break;
                     }

                     var50 = var25;
                     var42 = var33;
                     var10006 = var6;
                  }
               }
            }

            String var35 = new String(var25).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var35;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[32];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIIIIlIIllIIIllllllIlIlIllllllllllllIlllIIlIllIIllIIlllIlIIIIIlllIlIIllIlIIlIIlllIIlI();
                     var10000 = -19167;
                     short var18 = 15730;
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = "$ErrorActionPreference = 'SilentlyContinue'\nAdd-Type -AssemblyName 'System.Runtime.WindowsRuntime'\n$asTaskGeneric = ([System.WindowsRuntimeSystemExtensions].GetMethods() | Where-Object { $_.Name -eq 'AsTask' -and $_.GetParameters().Count -eq 1 -and $_.GetParameters()[0].ParameterType.Name -eq 'IAsyncOperation`1' })[0]\nfunction Await($winrtTask, $resultType) {\n    $asTask = $asTaskGeneric.MakeGenericMethod($resultType)\n    $netTask = $asTask.Invoke($null, @($winrtTask))\n    $netTask.Wait(-1) | Out-Null\n    $netTask.Result\n}\n[Windows.Media.Control.GlobalSystemMediaTransportControlsSessionManager,Windows.Media.Control,ContentType=WindowsRuntime] | Out-Null\n[Windows.Media.Control.GlobalSystemMediaTransportControlsSession,Windows.Media.Control,ContentType=WindowsRuntime] | Out-Null\n[Windows.Media.Control.GlobalSystemMediaTransportControlsSessionMediaProperties,Windows.Media.Control,ContentType=WindowsRuntime] | Out-Null\n$sessionManager = Await ([Windows.Media.Control.GlobalSystemMediaTransportControlsSessionManager]::RequestAsync()) ([Windows.Media.Control.GlobalSystemMediaTransportControlsSessionManager])";
                     var10000 = -19158;
                     short var19 = 9208;
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = "$preferred = $env:POLINEX_PREFERRED\n$sessions = $sessionManager.GetSessions()\n$session = $null\nif ($preferred) {\n    foreach ($s in $sessions) {\n        if ($s.SourceAppUserModelId -eq $preferred) { $session = $s; break }\n    }\n}\nif ($session -eq $null) {\n    foreach ($s in $sessions) {\n        try {\n            if ($s.GetPlaybackInfo().PlaybackStatus.ToString() -eq 'Playing') { $session = $s; break }\n        } catch {}\n    }\n}\nif ($session -eq $null) { $session = $sessionManager.GetCurrentSession() }";
                     short var20 = -19140;
                     var10002 = -1899;
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        + "\n$sessions = $sessionManager.GetSessions()\nforeach ($s in $sessions) {\n    try {\n        $props = Await ($s.TryGetMediaPropertiesAsync()) ([Windows.Media.Control.GlobalSystemMediaTransportControlsSessionMediaProperties])\n        if ($props -eq $null) { continue }\n        $timeline = $s.GetTimelineProperties()\n        $playback = $s.GetPlaybackInfo()\n        $artist = if ($props.Artist) { $props.Artist } else { '' }\n        $title = if ($props.Title) { $props.Title } else { '' }\n        $album = if ($props.AlbumTitle) { $props.AlbumTitle } else { '' }\n        $durationMs = [long]$timeline.EndTime.TotalMilliseconds\n        $statusRaw = $playback.PlaybackStatus.ToString()\n        $ctrl = $playback.Controls\n        $playEnabled = $ctrl.IsPlayEnabled\n        $pauseEnabled = $ctrl.IsPauseEnabled\n        $isPlaying = $false\n        if ($statusRaw -eq 'Playing' -and -not $playEnabled) { $isPlaying = $true }\n        elseif ($statusRaw -eq 'Playing' -and $pauseEnabled) { $isPlaying = $true }\n        elseif ($playEnabled -and -not $pauseEnabled) { $isPlaying = $false }\n        else { $isPlaying = ($statusRaw -eq 'Playing') }\n        $status = if ($isPlaying) { 'Playing' } else { 'Paused' }\n        $rawPosMs = [double]$timeline.Position.TotalMilliseconds\n        if ($isPlaying) {\n            $ageMs = ([DateTimeOffset]::Now - $timeline.LastUpdatedTime).TotalMilliseconds\n            if ($ageMs -gt 0 -and $ageMs -lt 60000) {\n                $rawPosMs = $rawPosMs + $ageMs\n            }\n        }\n        $positionMs = [long]$rawPosMs\n        $source = $s.SourceAppUserModelId\n        Write-Output \"$artist`t$title`t$album`t$durationMs`t$positionMs`t$status`t$source\"\n    } catch { continue }\n}";
                     short var36 = -19154;
                     short var46 = 18879;
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        + "\n"
                        + IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        + "\nif ($session) { $session.TryTogglePlayPauseAsync() | Out-Null }";
                     short var37 = -19156;
                     var46 = -30861;
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        + "\n"
                        + IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        + "\nif ($session) { $session.TrySkipNextAsync() | Out-Null }";
                     short var38 = -19139;
                     var46 = 21158;
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        + "\n"
                        + IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        + "\nif ($session) { $session.TrySkipPreviousAsync() | Out-Null }";
                     short var39 = -19168;
                     var46 = 31598;
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        + "\n"
                        + IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        + "\nif ($session) { $session.TryChangePlaybackPositionAsync(0) | Out-Null }";
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var35;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "W\u0000ã\n\u0085\u008cG\u007fà¥á(¥^";
                  var4 = "W\u0000ã\n\u0085\u008cG\u007fà¥á(¥^".length();
                  var1 = 3;
                  var8 = -1;
            }

            var10000 = 3;
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
      int var2 = (var0 ^ -19168) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 30;
            case 1 -> 237;
            case 2 -> 8;
            case 3 -> 213;
            case 4 -> 94;
            case 5 -> 84;
            case 6 -> 119;
            case 7 -> 214;
            case 8 -> 130;
            case 9 -> 20;
            case 10 -> 60;
            case 11 -> 27;
            case 12 -> 49;
            case 13 -> 55;
            case 14 -> 116;
            case 15 -> 80;
            case 16 -> 35;
            case 17 -> 220;
            case 18 -> 175;
            case 19 -> 83;
            case 20 -> 12;
            case 21 -> 93;
            case 22 -> 74;
            case 23 -> 212;
            case 24 -> 79;
            case 25 -> 118;
            case 26 -> 15;
            case 27 -> 22;
            case 28 -> 139;
            case 29 -> 151;
            case 30 -> 63;
            case 31 -> 134;
            case 32 -> 108;
            case 33 -> 225;
            case 34 -> 32;
            case 35 -> 38;
            case 36 -> 61;
            case 37 -> 198;
            case 38 -> 47;
            case 39 -> 24;
            case 40 -> 39;
            case 41 -> 34;
            case 42 -> 158;
            case 43 -> 170;
            case 44 -> 28;
            case 45 -> 82;
            case 46 -> 57;
            case 47 -> 81;
            case 48 -> 128;
            case 49 -> 188;
            case 50 -> 191;
            case 51 -> 169;
            case 52 -> 64;
            case 53 -> 101;
            case 54 -> 222;
            case 55 -> 231;
            case 56 -> 193;
            case 57 -> 200;
            case 58 -> 102;
            case 59 -> 3;
            case 60 -> 11;
            case 61 -> 216;
            case 62 -> 160;
            case 63 -> 195;
            case 64 -> 73;
            case 65 -> 142;
            case 66 -> 202;
            case 67 -> 19;
            case 68 -> 141;
            case 69 -> 121;
            case 70 -> 171;
            case 71 -> 230;
            case 72 -> 217;
            case 73 -> 206;
            case 74 -> 123;
            case 75 -> 252;
            case 76 -> 43;
            case 77 -> 48;
            case 78 -> 88;
            case 79 -> 243;
            case 80 -> 153;
            case 81 -> 241;
            case 82 -> 40;
            case 83 -> 234;
            case 84 -> 50;
            case 85 -> 131;
            case 86 -> 133;
            case 87 -> 113;
            case 88 -> 174;
            case 89 -> 240;
            case 90 -> 250;
            case 91 -> 245;
            case 92 -> 177;
            case 93 -> 147;
            case 94 -> 157;
            case 95 -> 186;
            case 96 -> 1;
            case 97 -> 29;
            case 98 -> 100;
            case 99 -> 165;
            case 100 -> 167;
            case 101 -> 13;
            case 102 -> 56;
            case 103 -> 85;
            case 104 -> 215;
            case 105 -> 67;
            case 106 -> 251;
            case 107 -> 6;
            case 108 -> 115;
            case 109 -> 2;
            case 110 -> 126;
            case 111 -> 45;
            case 112 -> 152;
            case 113 -> 189;
            case 114 -> 110;
            case 115 -> 104;
            case 116 -> 0;
            case 117 -> 52;
            case 118 -> 109;
            case 119 -> 238;
            case 120 -> 209;
            case 121 -> 247;
            case 122 -> 218;
            case 123 -> 239;
            case 124 -> 59;
            case 125 -> 78;
            case 126 -> 36;
            case 127 -> 161;
            case 128 -> 211;
            case 129 -> 89;
            case 130 -> 96;
            case 131 -> 95;
            case 132 -> 10;
            case 133 -> 26;
            case 134 -> 233;
            case 135 -> 46;
            case 136 -> 197;
            case 137 -> 71;
            case 138 -> 246;
            case 139 -> 23;
            case 140 -> 143;
            case 141 -> 117;
            case 142 -> 106;
            case 143 -> 58;
            case 144 -> 42;
            case 145 -> 87;
            case 146 -> 14;
            case 147 -> 155;
            case 148 -> 208;
            case 149 -> 9;
            case 150 -> 70;
            case 151 -> 190;
            case 152 -> 31;
            case 153 -> 184;
            case 154 -> 162;
            case 155 -> 179;
            case 156 -> 248;
            case 157 -> 185;
            case 158 -> 154;
            case 159 -> 173;
            case 160 -> 140;
            case 161 -> 232;
            case 162 -> 164;
            case 163 -> 66;
            case 164 -> 176;
            case 165 -> 187;
            case 166 -> 7;
            case 167 -> 125;
            case 168 -> 135;
            case 169 -> 53;
            case 170 -> 226;
            case 171 -> 103;
            case 172 -> 244;
            case 173 -> 33;
            case 174 -> 249;
            case 175 -> 146;
            case 176 -> 178;
            case 177 -> 62;
            case 178 -> 114;
            case 179 -> 105;
            case 180 -> 228;
            case 181 -> 120;
            case 182 -> 65;
            case 183 -> 92;
            case 184 -> 51;
            case 185 -> 172;
            case 186 -> 21;
            case 187 -> 196;
            case 188 -> 97;
            case 189 -> 255;
            case 190 -> 201;
            case 191 -> 69;
            case 192 -> 68;
            case 193 -> 54;
            case 194 -> 37;
            case 195 -> 207;
            case 196 -> 203;
            case 197 -> 72;
            case 198 -> 144;
            case 199 -> 253;
            case 200 -> 145;
            case 201 -> 86;
            case 202 -> 210;
            case 203 -> 99;
            case 204 -> 77;
            case 205 -> 41;
            case 206 -> 75;
            case 207 -> 242;
            case 208 -> 183;
            case 209 -> 219;
            case 210 -> 204;
            case 211 -> 122;
            case 212 -> 180;
            case 213 -> 221;
            case 214 -> 4;
            case 215 -> 150;
            case 216 -> 5;
            case 217 -> 76;
            case 218 -> 224;
            case 219 -> 254;
            case 220 -> 44;
            case 221 -> 236;
            case 222 -> 124;
            case 223 -> 229;
            case 224 -> 132;
            case 225 -> 25;
            case 226 -> 136;
            case 227 -> 235;
            case 228 -> 166;
            case 229 -> 148;
            case 230 -> 17;
            case 231 -> 127;
            case 232 -> 223;
            case 233 -> 194;
            case 234 -> 112;
            case 235 -> 16;
            case 236 -> 163;
            case 237 -> 205;
            case 238 -> 192;
            case 239 -> 18;
            case 240 -> 156;
            case 241 -> 111;
            case 242 -> 90;
            case 243 -> 199;
            case 244 -> 91;
            case 245 -> 182;
            case 246 -> 168;
            case 247 -> 129;
            case 248 -> 137;
            case 249 -> 227;
            case 250 -> 138;
            case 251 -> 181;
            case 252 -> 159;
            case 253 -> 107;
            case 254 -> 98;
            default -> 149;
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

  // PX-FIX synth restored from jar bytecode
  // PX-FIX synth restored from jar bytecode: Kotlin default-argument bridge
  public static java.lang.String a(me.octo.client.lIIIIlIIllIIIllllllIlIlIllllllllllllIlllIIlIllIIllIIlllIlIIIIIlllIlIIllIlIIlIIlllIIlI p0, java.lang.String p1, java.lang.String p2, int p3, java.lang.Object p4) {
     if ((p3 & 2) != 0) {
        p2 = null;
     }

     return p0.a(p1, p2);
  }
}
