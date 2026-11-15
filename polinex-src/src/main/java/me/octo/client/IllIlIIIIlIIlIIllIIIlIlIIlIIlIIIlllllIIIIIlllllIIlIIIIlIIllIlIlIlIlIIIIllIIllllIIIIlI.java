package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import org.graalvm.polyglot.Value;
import org.graalvm.polyglot.HostAccess.Export;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI {
   @NotNull
   private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @Nullable
   private lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static String[] b;
   private static String[] c;

   public IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI(
      @NotNull String var1, @NotNull lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll var2
   ) {
      short var10001 = 5745;
      short var10002 = 9061;
      Intrinsics.checkNotNullParameter(var1, "scriptName");
      var10001 = 5734;
      var10002 = 21056;
      Intrinsics.checkNotNullParameter(var2, "script");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
   }

   @Export
   @NotNull
   public final lIIIlIlIIIIlIlIlIlllIIlIIlIIIIIlIIIlIIlIllIllIlIIIlIlIlIlIlIIIlIIIllIIlIllIIlllIIIIlI a(@NotNull Value param1) {
      Intrinsics.checkNotNullParameter(param1, "config");
      if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl != null) {
         throw new IllegalStateException("Script '" + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl + "' has already registered a module! Only ONE module per script is allowed.");
      }
      String var3 = param1.getMember("name").asString();
      String var4 = param1.getMember("description").asString();
      String var5;
      Value var10000 = param1.getMember("subcategory");
      if (var10000 != null) {
         String var10001 = var10000.asString();
         var5 = var10001 != null ? var10001 : "Scripts";
      } else {
         var5 = "Scripts";
      }
      Value var6 = param1.getMember("settings");
      Value var7 = param1.getMember("onEnable");
      Value var8 = param1.getMember("onDisable");
      Value var9 = param1.getMember("shouldRender");
      me.octo.client.IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var10 = me.octo.client.IlIIlllIIlIllIlIIllIIIIIIlllIlIlIllllllIIIlIIIIlllIIllIlllIllIllllIlIIIlIIlIIIIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var6, this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      me.octo.client.lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl var11 = new me.octo.client.lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl(var7, var8, null, var9, new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII));
      Intrinsics.checkNotNull(var3);
      Intrinsics.checkNotNull(var4);
      me.octo.client.IlIIIIIIlllIlIlllIllIIlIIllIllllllIlIIlIlIIllIIIIlIIlIIIIIlIIllIlIIllllllllIllIIlllll var12 = new me.octo.client.IlIIIIIIlllIlIlllIllIIlIIllIllllllIlIIlIlIIllIIIIlIIlIIIIIlIIllIlIIllllllllIllIIlllll(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, var3, var4, var5, false, var10, var11);
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var12;
      me.octo.client.IllIIIlIlIIIIIIIIlllIIlIllIIlIllIllIIIIIlIlllIIIIlllIIIIIllIlIlIlIIIIIlllIIIIIIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var12);
      me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Script '" + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl + "' registered BooleanModule: " + var3);
      return new me.octo.client.lIIIlIlIIIIlIlIlIlllIIlIIlIIIIIlIIIlIIlIllIllIlIIIlIlIlIlIlIIIlIIIllIIlIllIIlllIIIIlI(var12);
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.b ()[Ljava/lang/String;
      // 003: astore 2
      // 004: aload 1
      // 005: sipush 5736
      // 008: sipush 11856
      // 00b: pop2
      // 00c: ldc "config"
      // 00e: aload 2
      // 00f: ifnull 055
      // 012: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 015: aload 0
      // 016: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII;
      // 019: ifnull 04b
      // 01c: goto 023
      // 01f: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 022: athrow
      // 023: new java/lang/IllegalStateException
      // 026: dup
      // 027: aload 0
      // 028: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Ljava/lang/String;
      // 02b: sipush 5757
      // 02e: sipush -26465
      // 031: pop2
      // 032: ldc "Script '"
      // 034: swap
      // 035: sipush 5743
      // 038: sipush -26919
      // 03b: pop2
      // 03c: ldc "' has already registered a module! Only ONE module per script is allowed."
      // 03e: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 043: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 046: athrow
      // 047: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 04a: athrow
      // 04b: aload 1
      // 04c: sipush 5730
      // 04f: sipush 14796
      // 052: pop2
      // 053: ldc "name"
      // 055: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 058: invokevirtual org/graalvm/polyglot/Value.asString ()Ljava/lang/String;
      // 05b: astore 3
      // 05c: aload 1
      // 05d: sipush 5735
      // 060: sipush -15405
      // 063: pop2
      // 064: ldc "description"
      // 066: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 069: invokevirtual org/graalvm/polyglot/Value.asString ()Ljava/lang/String;
      // 06c: astore 4
      // 06e: aload 2
      // 06f: ifnull 0a0
      // 072: aload 1
      // 073: sipush 5724
      // 076: sipush -24623
      // 079: pop2
      // 07a: ldc "subcategory"
      // 07c: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 07f: dup
      // 080: ifnull 098
      // 083: goto 08a
      // 086: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 089: athrow
      // 08a: invokevirtual org/graalvm/polyglot/Value.asString ()Ljava/lang/String;
      // 08d: dup
      // 08e: ifnonnull 0a9
      // 091: goto 098
      // 094: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 097: athrow
      // 098: pop
      // 099: goto 0a0
      // 09c: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 09f: athrow
      // 0a0: sipush 5738
      // 0a3: sipush -14562
      // 0a6: pop2
      // 0a7: ldc "Scripts"
      // 0a9: astore 5
      // 0ab: aload 1
      // 0ac: sipush 5717
      // 0af: sipush 32254
      // 0b2: pop2
      // 0b3: ldc "settings"
      // 0b5: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 0b8: astore 6
      // 0ba: aload 1
      // 0bb: sipush 5720
      // 0be: sipush 31498
      // 0c1: pop2
      // 0c2: ldc "onEnable"
      // 0c4: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 0c7: astore 7
      // 0c9: aload 1
      // 0ca: sipush 5742
      // 0cd: sipush 6037
      // 0d0: pop2
      // 0d1: ldc "onDisable"
      // 0d3: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 0d6: astore 8
      // 0d8: aload 1
      // 0d9: sipush 5731
      // 0dc: sipush -12765
      // 0df: pop2
      // 0e0: ldc "shouldRender"
      // 0e2: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 0e5: astore 9
      // 0e7: getstatic me/octo/client/IlIIlllIIlIllIlIIllIIIIIIlllIlIlIllllllIIIlIIIIlllIIllIlllIllIllllIlIIIlIIlIIIIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IlIIlllIIlIllIlIIllIIIIIIlllIlIlIllllllIIIlIIIIlllIIllIlllIllIllllIlIIIlIIlIIIIllIIlI;
      // 0ea: aload 6
      // 0ec: aload 0
      // 0ed: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll;
      // 0f0: invokevirtual me/octo/client/IlIIlllIIlIllIlIIllIIIIIIlllIlIlIllllllIIIlIIIIlllIIllIlllIllIllllIlIIIlIIlIIIIllIIlI.a (Lorg/graalvm/polyglot/Value;Lme/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll;)[Lme/octo/client/IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll;
      // 0f3: astore 10
      // 0f5: new me/octo/client/lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl
      // 0f8: dup
      // 0f9: aload 7
      // 0fb: aload 8
      // 0fd: aconst_null
      // 0fe: aload 9
      // 100: new me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 103: dup
      // 104: aload 0
      // 105: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll;
      // 108: invokespecial me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.<init> (Ljava/lang/Object;)V
      // 10b: checkcast kotlin/jvm/functions/Function2
      // 10e: invokespecial me/octo/client/lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl.<init> (Lorg/graalvm/polyglot/Value;Lorg/graalvm/polyglot/Value;Lorg/graalvm/polyglot/Value;Lorg/graalvm/polyglot/Value;Lkotlin/jvm/functions/Function2;)V
      // 111: astore 11
      // 113: new me/octo/client/IlIIIIIIlllIlIlllIllIIlIIllIllllllIlIIlIlIIllIIIIlIIlIIIIIlIIllIlIIllllllllIllIIlllll
      // 116: dup
      // 117: aload 0
      // 118: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Ljava/lang/String;
      // 11b: aload 3
      // 11c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 11f: aload 3
      // 120: aload 4
      // 122: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 125: aload 4
      // 127: aload 5
      // 129: bipush 0
      // 12a: aload 10
      // 12c: aload 11
      // 12e: invokespecial me/octo/client/IlIIIIIIlllIlIlllIllIIlIIllIllllllIlIIlIlIIllIIIIlIIlIIIIIlIIllIlIIllllllllIllIIlllll.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z[Lme/octo/client/IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll;Lme/octo/client/lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl;)V
      // 131: astore 12
      // 133: aload 0
      // 134: aload 12
      // 136: checkcast me/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII
      // 139: putfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII;
      // 13c: getstatic me/octo/client/IllIIIlIlIIIIIIIIlllIIlIllIIlIllIllIIIIIlIlllIIIIlllIIIIIllIlIlIlIIIIIlllIIIIIIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIlIIIIIIIIlllIIlIllIIlIllIllIIIIIlIlllIIIIlllIIIIIllIlIlIlIIIIIlllIIIIIIllIIlI;
      // 13f: aload 12
      // 141: checkcast me/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII
      // 144: invokevirtual me/octo/client/IllIIIlIlIIIIIIIIlllIIlIllIIlIllIllIIIIIlIlllIIIIlllIIIIIllIlIlIlIIIIIlllIIIIIIllIIlI.a (Lme/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII;)V
      // 147: aload 0
      // 148: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Ljava/lang/String;
      // 14b: aload 3
      // 14c: sipush 5728
      // 14f: sipush -23674
      // 152: pop2
      // 153: ldc "Script '"
      // 155: dup_x2
      // 156: pop
      // 157: sipush 5758
      // 15a: sipush 3654
      // 15d: pop2
      // 15e: ldc "' registered BooleanModule: "
      // 160: swap
      // 161: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001" ]
      // 166: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d (Ljava/lang/String;)V
      // 169: new me/octo/client/lIIIlIlIIIIlIlIlIlllIIlIIlIIIIIlIIIlIIlIllIllIlIIIlIlIlIlIlIIIlIIIllIIlIllIIlllIIIIlI
      // 16c: dup
      // 16d: aload 12
      // 16f: checkcast me/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII
      // 172: invokespecial me/octo/client/lIIIlIlIIIIlIlIlIlllIIlIIlIIIIIlIIIlIIlIllIllIlIIIlIlIlIlIlIIIlIIIllIIlIllIIlllIIIIlI.<init> (Lme/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII;)V
      // 175: areturn
   }

   @Export
   @NotNull
   public final lIIIlIlIIIIlIlIlIlllIIlIIlIIIIIlIIIlIIlIllIllIlIIIlIlIlIlIlIIIlIIIllIIlIllIIlllIIIIlI b(@NotNull Value param1) {
      Intrinsics.checkNotNullParameter(param1, "config");
      if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl != null) {
         throw new IllegalStateException("Script '" + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl + "' has already registered a module! Only ONE module per script is allowed.");
      }
      String var3 = param1.getMember("name").asString();
      String var4 = param1.getMember("description").asString();
      String var5;
      Value var10000 = param1.getMember("subcategory");
      if (var10000 != null) {
         String var10001 = var10000.asString();
         var5 = var10001 != null ? var10001 : "Scripts";
      } else {
         var5 = "Scripts";
      }
      Value var6 = param1.getMember("options");
      java.util.List var7 = new java.util.ArrayList();
      long var8 = 0L;
      long var10 = var6.getArraySize();
      while (var8 < var10) {
         String var10003 = var6.getArrayElement(var8).asString();
         Intrinsics.checkNotNullExpressionValue(var10003, "asString(...)");
         var7.add(var10003);
         ++var8;
      }
      Value var10002 = param1.getMember("defaultIndex");
      int var8b = var10002 != null ? var10002.asInt() : 0;
      Value var9 = param1.getMember("settings");
      Value var10b = param1.getMember("onChange");
      Value var11 = param1.getMember("shouldRender");
      me.octo.client.IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var12 = me.octo.client.IlIIlllIIlIllIlIIllIIIIIIlllIlIlIllllllIIIlIIIIlllIIllIlllIllIllllIlIIIlIIlIIIIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var9, this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      me.octo.client.lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl var13 = new me.octo.client.lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl(null, null, var10b, var11, new IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII));
      Intrinsics.checkNotNull(var3);
      Intrinsics.checkNotNull(var4);
      me.octo.client.lIIIlllIIIlIllIlIIIIIIllIlllllIllIIIlIIllIIIIIIIllIIlIllIlIIlllllllIIlIIlIIlllIIIIIII var14 = new me.octo.client.lIIIlllIIIlIllIlIIIIIIllIlllllIllIIIlIIllIIIIIIIllIIlIllIlIIlllllllIIlIIlIIlllIIIIIII(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, var3, var4, var5, (String[])var7.toArray(new String[0]), var8b, var12, var13);
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var14;
      me.octo.client.IllIIIlIlIIIIIIIIlllIIlIllIIlIllIllIIIIIlIlllIIIIlllIIIIIllIlIlIlIIIIIlllIIIIIIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var14);
      me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Script '" + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl + "' registered DropdownModule: " + var3);
      return new me.octo.client.lIIIlIlIIIIlIlIlIlllIIlIIlIIIIIlIIIlIIlIllIllIlIIIlIlIlIlIlIIIlIIIllIIlIllIIlllIIIIlI(var14);
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.b ()[Ljava/lang/String;
      // 003: astore 2
      // 004: aload 1
      // 005: sipush 5750
      // 008: sipush -11677
      // 00b: pop2
      // 00c: ldc "config"
      // 00e: aload 2
      // 00f: ifnull 055
      // 012: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 015: aload 0
      // 016: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII;
      // 019: ifnull 04b
      // 01c: goto 023
      // 01f: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 022: athrow
      // 023: new java/lang/IllegalStateException
      // 026: dup
      // 027: aload 0
      // 028: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Ljava/lang/String;
      // 02b: sipush 5728
      // 02e: sipush -23674
      // 031: pop2
      // 032: ldc "Script '"
      // 034: swap
      // 035: sipush 5751
      // 038: sipush -22812
      // 03b: pop2
      // 03c: ldc "' has already registered a module! Only ONE module per script is allowed."
      // 03e: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 043: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 046: athrow
      // 047: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 04a: athrow
      // 04b: aload 1
      // 04c: sipush 5755
      // 04f: sipush -27384
      // 052: pop2
      // 053: ldc "name"
      // 055: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 058: invokevirtual org/graalvm/polyglot/Value.asString ()Ljava/lang/String;
      // 05b: astore 3
      // 05c: aload 1
      // 05d: sipush 5729
      // 060: sipush -8979
      // 063: pop2
      // 064: ldc "description"
      // 066: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 069: invokevirtual org/graalvm/polyglot/Value.asString ()Ljava/lang/String;
      // 06c: astore 4
      // 06e: aload 2
      // 06f: ifnull 0a0
      // 072: aload 1
      // 073: sipush 5716
      // 076: sipush -14700
      // 079: pop2
      // 07a: ldc "subcategory"
      // 07c: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 07f: dup
      // 080: ifnull 098
      // 083: goto 08a
      // 086: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 089: athrow
      // 08a: invokevirtual org/graalvm/polyglot/Value.asString ()Ljava/lang/String;
      // 08d: dup
      // 08e: ifnonnull 0a9
      // 091: goto 098
      // 094: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 097: athrow
      // 098: pop
      // 099: goto 0a0
      // 09c: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 09f: athrow
      // 0a0: sipush 5739
      // 0a3: sipush 28987
      // 0a6: pop2
      // 0a7: ldc "Scripts"
      // 0a9: astore 5
      // 0ab: aload 1
      // 0ac: sipush 5721
      // 0af: sipush 2129
      // 0b2: pop2
      // 0b3: ldc "options"
      // 0b5: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 0b8: astore 6
      // 0ba: new java/util/ArrayList
      // 0bd: dup
      // 0be: invokespecial java/util/ArrayList.<init> ()V
      // 0c1: checkcast java/util/List
      // 0c4: astore 7
      // 0c6: lconst_0
      // 0c7: lstore 8
      // 0c9: aload 6
      // 0cb: invokevirtual org/graalvm/polyglot/Value.getArraySize ()J
      // 0ce: lstore 10
      // 0d0: lload 8
      // 0d2: lload 10
      // 0d4: lcmp
      // 0d5: ifge 113
      // 0d8: aload 7
      // 0da: aload 6
      // 0dc: lload 8
      // 0de: invokevirtual org/graalvm/polyglot/Value.getArrayElement (J)Lorg/graalvm/polyglot/Value;
      // 0e1: invokevirtual org/graalvm/polyglot/Value.asString ()Ljava/lang/String;
      // 0e4: dup
      // 0e5: sipush 5744
      // 0e8: sipush -229
      // 0eb: pop2
      // 0ec: ldc "asString(...)"
      // 0ee: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0f1: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0f6: pop
      // 0f7: lload 8
      // 0f9: lconst_1
      // 0fa: ladd
      // 0fb: lstore 8
      // 0fd: aload 2
      // 0fe: ifnull 12f
      // 101: aload 2
      // 102: ifnonnull 0d0
      // 105: goto 10c
      // 108: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 10b: athrow
      // 10c: bipush 2
      // 10d: anewarray 194
      // 110: invokestatic me/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b ([Lme/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;)V
      // 113: aload 1
      // 114: sipush 5741
      // 117: sipush 15474
      // 11a: pop2
      // 11b: ldc "defaultIndex"
      // 11d: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 120: dup
      // 121: ifnull 12e
      // 124: invokevirtual org/graalvm/polyglot/Value.asInt ()I
      // 127: goto 130
      // 12a: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 12d: athrow
      // 12e: pop
      // 12f: bipush 0
      // 130: istore 8
      // 132: aload 1
      // 133: sipush 5723
      // 136: sipush -15498
      // 139: pop2
      // 13a: ldc "settings"
      // 13c: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 13f: astore 9
      // 141: aload 1
      // 142: sipush 5748
      // 145: sipush 31821
      // 148: pop2
      // 149: ldc "onChange"
      // 14b: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 14e: astore 10
      // 150: aload 1
      // 151: sipush 5725
      // 154: sipush -19596
      // 157: pop2
      // 158: ldc "shouldRender"
      // 15a: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 15d: astore 11
      // 15f: getstatic me/octo/client/IlIIlllIIlIllIlIIllIIIIIIlllIlIlIllllllIIIlIIIIlllIIllIlllIllIllllIlIIIlIIlIIIIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IlIIlllIIlIllIlIIllIIIIIIlllIlIlIllllllIIIlIIIIlllIIllIlllIllIllllIlIIIlIIlIIIIllIIlI;
      // 162: aload 9
      // 164: aload 0
      // 165: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll;
      // 168: invokevirtual me/octo/client/IlIIlllIIlIllIlIIllIIIIIIlllIlIlIllllllIIIlIIIIlllIIllIlllIllIllllIlIIIlIIlIIIIllIIlI.a (Lorg/graalvm/polyglot/Value;Lme/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll;)[Lme/octo/client/IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll;
      // 16b: astore 12
      // 16d: new me/octo/client/lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl
      // 170: dup
      // 171: aconst_null
      // 172: aconst_null
      // 173: aload 10
      // 175: aload 11
      // 177: new me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll
      // 17a: dup
      // 17b: aload 0
      // 17c: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll;
      // 17f: invokespecial me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.<init> (Ljava/lang/Object;)V
      // 182: checkcast kotlin/jvm/functions/Function2
      // 185: invokespecial me/octo/client/lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl.<init> (Lorg/graalvm/polyglot/Value;Lorg/graalvm/polyglot/Value;Lorg/graalvm/polyglot/Value;Lorg/graalvm/polyglot/Value;Lkotlin/jvm/functions/Function2;)V
      // 188: astore 13
      // 18a: new me/octo/client/lIIIlllIIIlIllIlIIIIIIllIlllllIllIIIlIIllIIIIIIIllIIlIllIlIIlllllllIIlIIlIIlllIIIIIII
      // 18d: dup
      // 18e: aload 0
      // 18f: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Ljava/lang/String;
      // 192: aload 3
      // 193: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 196: aload 3
      // 197: aload 4
      // 199: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 19c: aload 4
      // 19e: aload 5
      // 1a0: aload 7
      // 1a2: checkcast java/util/Collection
      // 1a5: astore 15
      // 1a7: bipush 0
      // 1a8: istore 16
      // 1aa: aload 15
      // 1ac: astore 17
      // 1ae: aload 17
      // 1b0: bipush 0
      // 1b1: anewarray 94
      // 1b4: invokeinterface java/util/Collection.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 1b9: checkcast [Ljava/lang/String;
      // 1bc: iload 8
      // 1be: aload 12
      // 1c0: aload 13
      // 1c2: invokespecial me/octo/client/lIIIlllIIIlIllIlIIIIIIllIlllllIllIIIlIIllIIIIIIIllIIlIllIlIIlllllllIIlIIlIIlllIIIIIII.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;I[Lme/octo/client/IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll;Lme/octo/client/lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl;)V
      // 1c5: astore 14
      // 1c7: aload 0
      // 1c8: aload 14
      // 1ca: checkcast me/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII
      // 1cd: putfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII;
      // 1d0: getstatic me/octo/client/IllIIIlIlIIIIIIIIlllIIlIllIIlIllIllIIIIIlIlllIIIIlllIIIIIllIlIlIlIIIIIlllIIIIIIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIlIIIIIIIIlllIIlIllIIlIllIllIIIIIlIlllIIIIlllIIIIIllIlIlIlIIIIIlllIIIIIIllIIlI;
      // 1d3: aload 14
      // 1d5: checkcast me/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII
      // 1d8: invokevirtual me/octo/client/IllIIIlIlIIIIIIIIlllIIlIllIIlIllIllIIIIIlIlllIIIIlllIIIIIllIlIlIlIIIIIlllIIIIIIllIIlI.a (Lme/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII;)V
      // 1db: aload 0
      // 1dc: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Ljava/lang/String;
      // 1df: aload 3
      // 1e0: sipush 5728
      // 1e3: sipush -23674
      // 1e6: pop2
      // 1e7: ldc "Script '"
      // 1e9: dup_x2
      // 1ea: pop
      // 1eb: sipush 5756
      // 1ee: sipush 27403
      // 1f1: pop2
      // 1f2: ldc "' registered DropdownModule: "
      // 1f4: swap
      // 1f5: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001" ]
      // 1fa: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d (Ljava/lang/String;)V
      // 1fd: new me/octo/client/lIIIlIlIIIIlIlIlIlllIIlIIlIIIIIlIIIlIIlIllIllIlIIIlIlIlIlIlIIIlIIIllIIlIllIIlllIIIIlI
      // 200: dup
      // 201: aload 14
      // 203: checkcast me/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII
      // 206: invokespecial me/octo/client/lIIIlIlIIIIlIlIlIlllIIlIIlIIIIIlIIIlIIlIllIllIlIIIlIlIlIlIlIIIlIIIllIIlIllIIlllIIIIlI.<init> (Lme/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII;)V
      // 209: areturn
   }

   @Export
   @NotNull
   public final lIIIlIlIIIIlIlIlIlllIIlIIlIIIIIlIIIlIIlIllIllIlIIIlIlIlIlIlIIIlIIIllIIlIllIIlllIIIIlI c(@NotNull Value param1) {
      String[] var2 = b();
      Intrinsics.checkNotNullParameter(param1, "config");
      if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl != null) {
         throw new IllegalStateException("Script '" + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl + "' has already registered a module! Only ONE module per script is allowed.");
      }
      String var3 = param1.getMember("name").asString();
      String var4 = param1.getMember("description").asString();
      String var5;
      Value var10000 = param1.getMember("subcategory");
      if (var10000 != null) {
         String var10001 = var10000.asString();
         var5 = var10001 != null ? var10001 : "Scripts";
      } else {
         var5 = "Scripts";
      }
      int var6 = param1.getMember("min").asInt();
      int var7 = param1.getMember("max").asInt();
      int var8 = param1.getMember("default").asInt();
      Value var9 = param1.getMember("settings");
      Value var10 = param1.getMember("onChange");
      Value var11 = param1.getMember("shouldRender");
      me.octo.client.IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var12 = me.octo.client.IlIIlllIIlIllIlIIllIIIIIIlllIlIlIllllllIIIlIIIIlllIIllIlllIllIllllIlIIIlIIlIIIIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var9, this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      me.octo.client.lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl var13 = new me.octo.client.lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl(null, null, var10, var11, new IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII));
      Intrinsics.checkNotNull(var3);
      Intrinsics.checkNotNull(var4);
      me.octo.client.IlIlIlIllIIllIIllIIllllIIllIlIIllIlllIlIlIlllllllllIIIIlIIlllIlIlllllIlllllIlllllIIlI var14 = new me.octo.client.IlIlIlIllIIllIIllIIllllIIllIlIIllIlllIlIlIlllllllllIIIIlIIlllIlIlllllIlllllIlllllIIlI(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, var3, var4, var5, var6, var7, var8, var12, var13);
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var14;
      me.octo.client.IllIIIlIlIIIIIIIIlllIIlIllIIlIllIllIIIIIlIlllIIIIlllIIIIIllIlIlIlIIIIIlllIIIIIIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var14);
      me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Script '" + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl + "' registered SliderModule: " + var3);
      return new me.octo.client.lIIIlIlIIIIlIlIlIlllIIlIIlIIIIIlIIIlIIlIllIllIlIIIlIlIlIlIlIIIlIIIllIIlIllIIlllIIIIlI(var14);
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.b ()[Ljava/lang/String;
      // 003: astore 2
      // 004: aload 1
      // 005: sipush 5750
      // 008: sipush -11677
      // 00b: pop2
      // 00c: ldc "config"
      // 00e: aload 2
      // 00f: ifnull 055
      // 012: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 015: aload 0
      // 016: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII;
      // 019: ifnull 04b
      // 01c: goto 023
      // 01f: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 022: athrow
      // 023: new java/lang/IllegalStateException
      // 026: dup
      // 027: aload 0
      // 028: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Ljava/lang/String;
      // 02b: sipush 5728
      // 02e: sipush -23674
      // 031: pop2
      // 032: ldc "Script '"
      // 034: swap
      // 035: sipush 5751
      // 038: sipush -22812
      // 03b: pop2
      // 03c: ldc "' has already registered a module! Only ONE module per script is allowed."
      // 03e: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 043: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 046: athrow
      // 047: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 04a: athrow
      // 04b: aload 1
      // 04c: sipush 5755
      // 04f: sipush -27384
      // 052: pop2
      // 053: ldc "name"
      // 055: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 058: invokevirtual org/graalvm/polyglot/Value.asString ()Ljava/lang/String;
      // 05b: astore 3
      // 05c: aload 1
      // 05d: sipush 5729
      // 060: sipush -8979
      // 063: pop2
      // 064: ldc "description"
      // 066: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 069: invokevirtual org/graalvm/polyglot/Value.asString ()Ljava/lang/String;
      // 06c: astore 4
      // 06e: aload 2
      // 06f: ifnull 0a0
      // 072: aload 1
      // 073: sipush 5716
      // 076: sipush -14700
      // 079: pop2
      // 07a: ldc "subcategory"
      // 07c: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 07f: dup
      // 080: ifnull 098
      // 083: goto 08a
      // 086: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 089: athrow
      // 08a: invokevirtual org/graalvm/polyglot/Value.asString ()Ljava/lang/String;
      // 08d: dup
      // 08e: ifnonnull 0a9
      // 091: goto 098
      // 094: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 097: athrow
      // 098: pop
      // 099: goto 0a0
      // 09c: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 09f: athrow
      // 0a0: sipush 5739
      // 0a3: sipush 28987
      // 0a6: pop2
      // 0a7: ldc "Scripts"
      // 0a9: astore 5
      // 0ab: aload 1
      // 0ac: sipush 5737
      // 0af: sipush 13239
      // 0b2: pop2
      // 0b3: ldc "min"
      // 0b5: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 0b8: invokevirtual org/graalvm/polyglot/Value.asInt ()I
      // 0bb: istore 6
      // 0bd: aload 1
      // 0be: sipush 5726
      // 0c1: sipush -27123
      // 0c4: pop2
      // 0c5: ldc "max"
      // 0c7: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 0ca: invokevirtual org/graalvm/polyglot/Value.asInt ()I
      // 0cd: istore 7
      // 0cf: aload 1
      // 0d0: sipush 5754
      // 0d3: sipush -25716
      // 0d6: pop2
      // 0d7: ldc "default"
      // 0d9: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 0dc: invokevirtual org/graalvm/polyglot/Value.asInt ()I
      // 0df: istore 8
      // 0e1: aload 1
      // 0e2: sipush 5723
      // 0e5: sipush -15498
      // 0e8: pop2
      // 0e9: ldc "settings"
      // 0eb: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 0ee: astore 9
      // 0f0: aload 1
      // 0f1: sipush 5748
      // 0f4: sipush 31821
      // 0f7: pop2
      // 0f8: ldc "onChange"
      // 0fa: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 0fd: astore 10
      // 0ff: aload 1
      // 100: sipush 5725
      // 103: sipush -19596
      // 106: pop2
      // 107: ldc "shouldRender"
      // 109: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 10c: astore 11
      // 10e: getstatic me/octo/client/IlIIlllIIlIllIlIIllIIIIIIlllIlIlIllllllIIIlIIIIlllIIllIlllIllIllllIlIIIlIIlIIIIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IlIIlllIIlIllIlIIllIIIIIIlllIlIlIllllllIIIlIIIIlllIIllIlllIllIllllIlIIIlIIlIIIIllIIlI;
      // 111: aload 9
      // 113: aload 0
      // 114: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll;
      // 117: invokevirtual me/octo/client/IlIIlllIIlIllIlIIllIIIIIIlllIlIlIllllllIIIlIIIIlllIIllIlllIllIllllIlIIIlIIlIIIIllIIlI.a (Lorg/graalvm/polyglot/Value;Lme/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll;)[Lme/octo/client/IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll;
      // 11a: astore 12
      // 11c: new me/octo/client/lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl
      // 11f: dup
      // 120: aconst_null
      // 121: aconst_null
      // 122: aload 10
      // 124: aload 11
      // 126: new me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI
      // 129: dup
      // 12a: aload 0
      // 12b: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll;
      // 12e: invokespecial me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.<init> (Ljava/lang/Object;)V
      // 131: checkcast kotlin/jvm/functions/Function2
      // 134: invokespecial me/octo/client/lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl.<init> (Lorg/graalvm/polyglot/Value;Lorg/graalvm/polyglot/Value;Lorg/graalvm/polyglot/Value;Lorg/graalvm/polyglot/Value;Lkotlin/jvm/functions/Function2;)V
      // 137: astore 13
      // 139: new me/octo/client/IlIlIlIllIIllIIllIIllllIIllIlIIllIlllIlIlIlllllllllIIIIlIIlllIlIlllllIlllllIlllllIIlI
      // 13c: dup
      // 13d: aload 0
      // 13e: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Ljava/lang/String;
      // 141: aload 3
      // 142: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 145: aload 3
      // 146: aload 4
      // 148: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 14b: aload 4
      // 14d: aload 5
      // 14f: iload 6
      // 151: iload 7
      // 153: iload 8
      // 155: aload 12
      // 157: aload 13
      // 159: invokespecial me/octo/client/IlIlIlIllIIllIIllIIllllIIllIlIIllIlllIlIlIlllllllllIIIIlIIlllIlIlllllIlllllIlllllIIlI.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III[Lme/octo/client/IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll;Lme/octo/client/lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl;)V
      // 15c: astore 14
      // 15e: aload 0
      // 15f: aload 14
      // 161: checkcast me/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII
      // 164: putfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII;
      // 167: getstatic me/octo/client/IllIIIlIlIIIIIIIIlllIIlIllIIlIllIllIIIIIlIlllIIIIlllIIIIIllIlIlIlIIIIIlllIIIIIIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIlIIIIIIIIlllIIlIllIIlIllIllIIIIIlIlllIIIIlllIIIIIllIlIlIlIIIIIlllIIIIIIllIIlI;
      // 16a: aload 14
      // 16c: checkcast me/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII
      // 16f: invokevirtual me/octo/client/IllIIIlIlIIIIIIIIlllIIlIllIIlIllIllIIIIIlIlllIIIIlllIIIIIllIlIlIlIIIIIlllIIIIIIllIIlI.a (Lme/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII;)V
      // 172: aload 0
      // 173: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Ljava/lang/String;
      // 176: aload 3
      // 177: sipush 5728
      // 17a: sipush -23674
      // 17d: pop2
      // 17e: ldc "Script '"
      // 180: dup_x2
      // 181: pop
      // 182: sipush 5759
      // 185: sipush -1385
      // 188: pop2
      // 189: ldc "' registered SliderModule: "
      // 18b: swap
      // 18c: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001" ]
      // 191: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d (Ljava/lang/String;)V
      // 194: new me/octo/client/lIIIlIlIIIIlIlIlIlllIIlIIlIIIIIlIIIlIIlIllIllIlIIIlIlIlIlIlIIIlIIIllIIlIllIIlllIIIIlI
      // 197: dup
      // 198: aload 14
      // 19a: checkcast me/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII
      // 19d: invokespecial me/octo/client/lIIIlIlIIIIlIlIlIlllIIlIIlIIIIIlIIIlIIlIllIllIlIIIlIlIlIlIlIIIlIIIllIIlIllIIlllIIIIlI.<init> (Lme/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII;)V
      // 1a0: areturn
   }

   @Export
   @NotNull
   public final lIIIlIlIIIIlIlIlIlllIIlIIlIIIIIlIIIlIIlIllIllIlIIIlIlIlIlIlIIIlIIIllIIlIllIIlllIIIIlI d(@NotNull Value param1) {
      String[] var2 = b();
      Intrinsics.checkNotNullParameter(param1, "config");
      if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl != null) {
         throw new IllegalStateException("Script '" + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl + "' has already registered a module! Only ONE module per script is allowed.");
      }
      String var3 = param1.getMember("name").asString();
      String var4 = param1.getMember("description").asString();
      String var5;
      Value var10000 = param1.getMember("subcategory");
      if (var10000 != null) {
         String var10001 = var10000.asString();
         var5 = var10001 != null ? var10001 : "Scripts";
      } else {
         var5 = "Scripts";
      }
      double var6 = param1.getMember("min").asDouble();
      double var8 = param1.getMember("max").asDouble();
      double var10 = param1.getMember("default").asDouble();
      Value var12 = param1.getMember("settings");
      Value var13 = param1.getMember("onChange");
      Value var14 = param1.getMember("shouldRender");
      me.octo.client.IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var15 = me.octo.client.IlIIlllIIlIllIlIIllIIIIIIlllIlIlIllllllIIIlIIIIlllIIllIlllIllIllllIlIIIlIIlIIIIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var12, this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      me.octo.client.lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl var16 = new me.octo.client.lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl((Value)null, (Value)null, var13, var14, new me.octo.client.IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII));
      Intrinsics.checkNotNull(var3);
      Intrinsics.checkNotNull(var4);
      me.octo.client.IIllIIIIlllIIIlIIllIIIIIIIIlIlIlllIlIllIIllllIlIIIlIlIIIllIllIlllllIlllllIlIIIlIIllll var17 = new me.octo.client.IIllIIIIlllIIIlIIllIIIIIIIIlIlIlllIlIllIIllllIlIIIlIlIIIllIllIlllllIlllllIlIIIlIIllll(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, var3, var4, var5, var6, var8, var10, var15, var16);
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var17;
      me.octo.client.IllIIIlIlIIIIIIIIlllIIlIllIIlIllIllIIIIIlIlllIIIIlllIIIIIllIlIlIlIIIIIlllIIIIIIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var17);
      me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Script '" + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl + "' registered DecimalSliderModule: " + var3);
      return new me.octo.client.lIIIlIlIIIIlIlIlIlllIIlIIlIIIIIlIIIlIIlIllIllIlIIIlIlIlIlIlIIIlIIIllIIlIllIIlllIIIIlI(var17);
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.b ()[Ljava/lang/String;
      // 003: astore 2
      // 004: aload 1
      // 005: sipush 5750
      // 008: sipush -11677
      // 00b: pop2
      // 00c: ldc "config"
      // 00e: aload 2
      // 00f: ifnull 055
      // 012: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 015: aload 0
      // 016: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII;
      // 019: ifnull 04b
      // 01c: goto 023
      // 01f: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 022: athrow
      // 023: new java/lang/IllegalStateException
      // 026: dup
      // 027: aload 0
      // 028: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Ljava/lang/String;
      // 02b: sipush 5728
      // 02e: sipush -23674
      // 031: pop2
      // 032: ldc "Script '"
      // 034: swap
      // 035: sipush 5751
      // 038: sipush -22812
      // 03b: pop2
      // 03c: ldc "' has already registered a module! Only ONE module per script is allowed."
      // 03e: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 043: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 046: athrow
      // 047: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 04a: athrow
      // 04b: aload 1
      // 04c: sipush 5755
      // 04f: sipush -27384
      // 052: pop2
      // 053: ldc "name"
      // 055: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 058: invokevirtual org/graalvm/polyglot/Value.asString ()Ljava/lang/String;
      // 05b: astore 3
      // 05c: aload 1
      // 05d: sipush 5729
      // 060: sipush -8979
      // 063: pop2
      // 064: ldc "description"
      // 066: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 069: invokevirtual org/graalvm/polyglot/Value.asString ()Ljava/lang/String;
      // 06c: astore 4
      // 06e: aload 2
      // 06f: ifnull 0a0
      // 072: aload 1
      // 073: sipush 5716
      // 076: sipush -14700
      // 079: pop2
      // 07a: ldc "subcategory"
      // 07c: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 07f: dup
      // 080: ifnull 098
      // 083: goto 08a
      // 086: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 089: athrow
      // 08a: invokevirtual org/graalvm/polyglot/Value.asString ()Ljava/lang/String;
      // 08d: dup
      // 08e: ifnonnull 0a9
      // 091: goto 098
      // 094: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 097: athrow
      // 098: pop
      // 099: goto 0a0
      // 09c: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 09f: athrow
      // 0a0: sipush 5739
      // 0a3: sipush 28987
      // 0a6: pop2
      // 0a7: ldc "Scripts"
      // 0a9: astore 5
      // 0ab: aload 1
      // 0ac: sipush 5719
      // 0af: sipush 7017
      // 0b2: pop2
      // 0b3: ldc "min"
      // 0b5: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 0b8: invokevirtual org/graalvm/polyglot/Value.asDouble ()D
      // 0bb: dstore 6
      // 0bd: aload 1
      // 0be: sipush 5753
      // 0c1: sipush -10395
      // 0c4: pop2
      // 0c5: ldc "max"
      // 0c7: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 0ca: invokevirtual org/graalvm/polyglot/Value.asDouble ()D
      // 0cd: dstore 8
      // 0cf: aload 1
      // 0d0: sipush 5747
      // 0d3: sipush -18358
      // 0d6: pop2
      // 0d7: ldc "default"
      // 0d9: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 0dc: invokevirtual org/graalvm/polyglot/Value.asDouble ()D
      // 0df: dstore 10
      // 0e1: aload 1
      // 0e2: sipush 5723
      // 0e5: sipush -15498
      // 0e8: pop2
      // 0e9: ldc "settings"
      // 0eb: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 0ee: astore 12
      // 0f0: aload 1
      // 0f1: sipush 5740
      // 0f4: sipush -23589
      // 0f7: pop2
      // 0f8: ldc "onChange"
      // 0fa: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 0fd: astore 13
      // 0ff: aload 1
      // 100: sipush 5725
      // 103: sipush -19596
      // 106: pop2
      // 107: ldc "shouldRender"
      // 109: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 10c: astore 14
      // 10e: getstatic me/octo/client/IlIIlllIIlIllIlIIllIIIIIIlllIlIlIllllllIIIlIIIIlllIIllIlllIllIllllIlIIIlIIlIIIIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IlIIlllIIlIllIlIIllIIIIIIlllIlIlIllllllIIIlIIIIlllIIllIlllIllIllllIlIIIlIIlIIIIllIIlI;
      // 111: aload 12
      // 113: aload 0
      // 114: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll;
      // 117: invokevirtual me/octo/client/IlIIlllIIlIllIlIIllIIIIIIlllIlIlIllllllIIIlIIIIlllIIllIlllIllIllllIlIIIlIIlIIIIllIIlI.a (Lorg/graalvm/polyglot/Value;Lme/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll;)[Lme/octo/client/IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll;
      // 11a: astore 15
      // 11c: new me/octo/client/lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl
      // 11f: dup
      // 120: aconst_null
      // 121: aconst_null
      // 122: aload 13
      // 124: aload 14
      // 126: new me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
      // 129: dup
      // 12a: aload 0
      // 12b: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll;
      // 12e: invokespecial me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.<init> (Ljava/lang/Object;)V
      // 131: checkcast kotlin/jvm/functions/Function2
      // 134: invokespecial me/octo/client/lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl.<init> (Lorg/graalvm/polyglot/Value;Lorg/graalvm/polyglot/Value;Lorg/graalvm/polyglot/Value;Lorg/graalvm/polyglot/Value;Lkotlin/jvm/functions/Function2;)V
      // 137: astore 16
      // 139: new me/octo/client/IIllIIIIlllIIIlIIllIIIIIIIIlIlIlllIlIllIIllllIlIIIlIlIIIllIllIlllllIlllllIlIIIlIIllll
      // 13c: dup
      // 13d: aload 0
      // 13e: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Ljava/lang/String;
      // 141: aload 3
      // 142: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 145: aload 3
      // 146: aload 4
      // 148: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 14b: aload 4
      // 14d: aload 5
      // 14f: dload 6
      // 151: dload 8
      // 153: dload 10
      // 155: aload 15
      // 157: aload 16
      // 159: invokespecial me/octo/client/IIllIIIIlllIIIlIIllIIIIIIIIlIlIlllIlIllIIllllIlIIIlIlIIIllIllIlllllIlllllIlIIIlIIllll.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDD[Lme/octo/client/IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll;Lme/octo/client/lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl;)V
      // 15c: astore 17
      // 15e: aload 0
      // 15f: aload 17
      // 161: checkcast me/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII
      // 164: putfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII;
      // 167: getstatic me/octo/client/IllIIIlIlIIIIIIIIlllIIlIllIIlIllIllIIIIIlIlllIIIIlllIIIIIllIlIlIlIIIIIlllIIIIIIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIlIIIIIIIIlllIIlIllIIlIllIllIIIIIlIlllIIIIlllIIIIIllIlIlIlIIIIIlllIIIIIIllIIlI;
      // 16a: aload 17
      // 16c: checkcast me/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII
      // 16f: invokevirtual me/octo/client/IllIIIlIlIIIIIIIIlllIIlIllIIlIllIllIIIIIlIlllIIIIlllIIIIIllIlIlIlIIIIIlllIIIIIIllIIlI.a (Lme/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII;)V
      // 172: aload 0
      // 173: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Ljava/lang/String;
      // 176: aload 3
      // 177: sipush 5728
      // 17a: sipush -23674
      // 17d: pop2
      // 17e: ldc "Script '"
      // 180: dup_x2
      // 181: pop
      // 182: sipush 5752
      // 185: sipush 31726
      // 188: pop2
      // 189: ldc "' registered DecimalSliderModule: "
      // 18b: swap
      // 18c: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001" ]
      // 191: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d (Ljava/lang/String;)V
      // 194: new me/octo/client/lIIIlIlIIIIlIlIlIlllIIlIIlIIIIIlIIIlIIlIllIllIlIIIlIlIlIlIlIIIlIIIllIIlIllIIlllIIIIlI
      // 197: dup
      // 198: aload 17
      // 19a: checkcast me/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII
      // 19d: invokespecial me/octo/client/lIIIlIlIIIIlIlIlIlllIIlIIlIIIIIlIIIlIIlIllIllIlIIIlIlIlIlIlIIIlIIIllIIlIllIIlllIIIIlI.<init> (Lme/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII;)V
      // 1a0: areturn
   }

   @Export
   @NotNull
   public final lIIIlIlIIIIlIlIlIlllIIlIIlIIIIIlIIIlIIlIllIllIlIIIlIlIlIlIlIIIlIIIllIIlIllIIlllIIIIlI e(@NotNull Value param1) {
      String[] var2 = b();
      Intrinsics.checkNotNullParameter(param1, "config");
      if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl != null) {
         throw new IllegalStateException("Script '" + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl + "' has already registered a module! Only ONE module per script is allowed.");
      }
      String var3 = param1.getMember("name").asString();
      String var4 = param1.getMember("description").asString();
      String var5;
      Value var10000 = param1.getMember("subcategory");
      if (var10000 != null) {
         String var10001 = var10000.asString();
         var5 = var10001 != null ? var10001 : "Scripts";
      } else {
         var5 = "Scripts";
      }
      int var6 = param1.getMember("min").asInt();
      int var7 = param1.getMember("max").asInt();
      int var8 = param1.getMember("defaultMin").asInt();
      int var9 = param1.getMember("defaultMax").asInt();
      Value var10 = param1.getMember("settings");
      Value var11 = param1.getMember("onChange");
      Value var12 = param1.getMember("shouldRender");
      me.octo.client.IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var13 = me.octo.client.IlIIlllIIlIllIlIIllIIIIIIlllIlIlIllllllIIIlIIIIlllIIllIlllIllIllllIlIIIlIIlIIIIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var10, this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      me.octo.client.lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl var14 = new me.octo.client.lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl((Value)null, (Value)null, var11, var12, new llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII));
      Intrinsics.checkNotNull(var3);
      Intrinsics.checkNotNull(var4);
      me.octo.client.IIIllIlIIlllIIIlIllIlllllIlIllIlIIlIIlllIlIIIlllllIIIIllllIIIIlllIlllllllllllllIlIIlI var15 = new me.octo.client.IIIllIlIIlllIIIlIllIlllllIlIllIlIIlIIlllIlIIIlllllIIIIllllIIIIlllIlllllllllllllIlIIlI(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, var3, var4, var5, var6, var7, var8, var9, var13, var14);
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var15;
      me.octo.client.IllIIIlIlIIIIIIIIlllIIlIllIIlIllIllIIIIIlIlllIIIIlllIIIIIllIlIlIlIIIIIlllIIIIIIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var15);
      me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Script '" + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl + "' registered RangeModule: " + var3);
      return new me.octo.client.lIIIlIlIIIIlIlIlIlllIIlIIlIIIIIlIIIlIIlIllIllIlIIIlIlIlIlIlIIIlIIIllIIlIllIIlllIIIIlI(var15);
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.b ()[Ljava/lang/String;
      // 003: astore 2
      // 004: aload 1
      // 005: sipush 5750
      // 008: sipush -11677
      // 00b: pop2
      // 00c: ldc "config"
      // 00e: aload 2
      // 00f: ifnull 055
      // 012: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 015: aload 0
      // 016: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII;
      // 019: ifnull 04b
      // 01c: goto 023
      // 01f: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 022: athrow
      // 023: new java/lang/IllegalStateException
      // 026: dup
      // 027: aload 0
      // 028: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Ljava/lang/String;
      // 02b: sipush 5728
      // 02e: sipush -23674
      // 031: pop2
      // 032: ldc "Script '"
      // 034: swap
      // 035: sipush 5751
      // 038: sipush -22812
      // 03b: pop2
      // 03c: ldc "' has already registered a module! Only ONE module per script is allowed."
      // 03e: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 043: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 046: athrow
      // 047: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 04a: athrow
      // 04b: aload 1
      // 04c: sipush 5755
      // 04f: sipush -27384
      // 052: pop2
      // 053: ldc "name"
      // 055: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 058: invokevirtual org/graalvm/polyglot/Value.asString ()Ljava/lang/String;
      // 05b: astore 3
      // 05c: aload 1
      // 05d: sipush 5729
      // 060: sipush -8979
      // 063: pop2
      // 064: ldc "description"
      // 066: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 069: invokevirtual org/graalvm/polyglot/Value.asString ()Ljava/lang/String;
      // 06c: astore 4
      // 06e: aload 2
      // 06f: ifnull 0a0
      // 072: aload 1
      // 073: sipush 5716
      // 076: sipush -14700
      // 079: pop2
      // 07a: ldc "subcategory"
      // 07c: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 07f: dup
      // 080: ifnull 098
      // 083: goto 08a
      // 086: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 089: athrow
      // 08a: invokevirtual org/graalvm/polyglot/Value.asString ()Ljava/lang/String;
      // 08d: dup
      // 08e: ifnonnull 0a9
      // 091: goto 098
      // 094: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 097: athrow
      // 098: pop
      // 099: goto 0a0
      // 09c: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 09f: athrow
      // 0a0: sipush 5739
      // 0a3: sipush 28987
      // 0a6: pop2
      // 0a7: ldc "Scripts"
      // 0a9: astore 5
      // 0ab: aload 1
      // 0ac: sipush 5737
      // 0af: sipush 13239
      // 0b2: pop2
      // 0b3: ldc "min"
      // 0b5: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 0b8: invokevirtual org/graalvm/polyglot/Value.asInt ()I
      // 0bb: istore 6
      // 0bd: aload 1
      // 0be: sipush 5726
      // 0c1: sipush -27123
      // 0c4: pop2
      // 0c5: ldc "max"
      // 0c7: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 0ca: invokevirtual org/graalvm/polyglot/Value.asInt ()I
      // 0cd: istore 7
      // 0cf: aload 1
      // 0d0: sipush 5749
      // 0d3: sipush -751
      // 0d6: pop2
      // 0d7: ldc "defaultMin"
      // 0d9: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 0dc: invokevirtual org/graalvm/polyglot/Value.asInt ()I
      // 0df: istore 8
      // 0e1: aload 1
      // 0e2: sipush 5733
      // 0e5: sipush 23936
      // 0e8: pop2
      // 0e9: ldc "defaultMax"
      // 0eb: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 0ee: invokevirtual org/graalvm/polyglot/Value.asInt ()I
      // 0f1: istore 9
      // 0f3: aload 1
      // 0f4: sipush 5723
      // 0f7: sipush -15498
      // 0fa: pop2
      // 0fb: ldc "settings"
      // 0fd: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 100: astore 10
      // 102: aload 1
      // 103: sipush 5748
      // 106: sipush 31821
      // 109: pop2
      // 10a: ldc "onChange"
      // 10c: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 10f: astore 11
      // 111: aload 1
      // 112: sipush 5725
      // 115: sipush -19596
      // 118: pop2
      // 119: ldc "shouldRender"
      // 11b: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 11e: astore 12
      // 120: getstatic me/octo/client/IlIIlllIIlIllIlIIllIIIIIIlllIlIlIllllllIIIlIIIIlllIIllIlllIllIllllIlIIIlIIlIIIIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IlIIlllIIlIllIlIIllIIIIIIlllIlIlIllllllIIIlIIIIlllIIllIlllIllIllllIlIIIlIIlIIIIllIIlI;
      // 123: aload 10
      // 125: aload 0
      // 126: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll;
      // 129: invokevirtual me/octo/client/IlIIlllIIlIllIlIIllIIIIIIlllIlIlIllllllIIIlIIIIlllIIllIlllIllIllllIlIIIlIIlIIIIllIIlI.a (Lorg/graalvm/polyglot/Value;Lme/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll;)[Lme/octo/client/IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll;
      // 12c: astore 13
      // 12e: new me/octo/client/lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl
      // 131: dup
      // 132: aconst_null
      // 133: aconst_null
      // 134: aload 11
      // 136: aload 12
      // 138: new me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll
      // 13b: dup
      // 13c: aload 0
      // 13d: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll;
      // 140: invokespecial me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.<init> (Ljava/lang/Object;)V
      // 143: checkcast kotlin/jvm/functions/Function2
      // 146: invokespecial me/octo/client/lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl.<init> (Lorg/graalvm/polyglot/Value;Lorg/graalvm/polyglot/Value;Lorg/graalvm/polyglot/Value;Lorg/graalvm/polyglot/Value;Lkotlin/jvm/functions/Function2;)V
      // 149: astore 14
      // 14b: new me/octo/client/IIIllIlIIlllIIIlIllIlllllIlIllIlIIlIIlllIlIIIlllllIIIIllllIIIIlllIlllllllllllllIlIIlI
      // 14e: dup
      // 14f: aload 0
      // 150: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Ljava/lang/String;
      // 153: aload 3
      // 154: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 157: aload 3
      // 158: aload 4
      // 15a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 15d: aload 4
      // 15f: aload 5
      // 161: iload 6
      // 163: iload 7
      // 165: iload 8
      // 167: iload 9
      // 169: aload 13
      // 16b: aload 14
      // 16d: invokespecial me/octo/client/IIIllIlIIlllIIIlIllIlllllIlIllIlIIlIIlllIlIIIlllllIIIIllllIIIIlllIlllllllllllllIlIIlI.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIII[Lme/octo/client/IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll;Lme/octo/client/lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl;)V
      // 170: astore 15
      // 172: aload 0
      // 173: aload 15
      // 175: checkcast me/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII
      // 178: putfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII;
      // 17b: getstatic me/octo/client/IllIIIlIlIIIIIIIIlllIIlIllIIlIllIllIIIIIlIlllIIIIlllIIIIIllIlIlIlIIIIIlllIIIIIIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIlIIIIIIIIlllIIlIllIIlIllIllIIIIIlIlllIIIIlllIIIIIllIlIlIlIIIIIlllIIIIIIllIIlI;
      // 17e: aload 15
      // 180: checkcast me/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII
      // 183: invokevirtual me/octo/client/IllIIIlIlIIIIIIIIlllIIlIllIIlIllIllIIIIIlIlllIIIIlllIIIIIllIlIlIlIIIIIlllIIIIIIllIIlI.a (Lme/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII;)V
      // 186: aload 0
      // 187: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Ljava/lang/String;
      // 18a: aload 3
      // 18b: sipush 5728
      // 18e: sipush -23674
      // 191: pop2
      // 192: ldc "Script '"
      // 194: dup_x2
      // 195: pop
      // 196: sipush 5732
      // 199: sipush 3749
      // 19c: pop2
      // 19d: ldc_w "' registered RangeModule: "
      // 1a0: swap
      // 1a1: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001" ]
      // 1a6: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d (Ljava/lang/String;)V
      // 1a9: new me/octo/client/lIIIlIlIIIIlIlIlIlllIIlIIlIIIIIlIIIlIIlIllIllIlIIIlIlIlIlIlIIIlIIIllIIlIllIIlllIIIIlI
      // 1ac: dup
      // 1ad: aload 15
      // 1af: checkcast me/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII
      // 1b2: invokespecial me/octo/client/lIIIlIlIIIIlIlIlIlllIIlIIlIIIIIlIIIlIIlIllIllIlIIIlIlIlIlIlIIIlIIIllIIlIllIIlllIIIIlI.<init> (Lme/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII;)V
      // 1b5: areturn
   }

   @Export
   @NotNull
   public final lIIIlIlIIIIlIlIlIlllIIlIIlIIIIIlIIIlIIlIllIllIlIIIlIlIlIlIlIIIlIIIllIIlIllIIlllIIIIlI f(@NotNull Value param1) {
      String[] var2 = b();
      Intrinsics.checkNotNullParameter(param1, "config");
      if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl != null) {
         throw new IllegalStateException("Script '" + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl + "' has already registered a module! Only ONE module per script is allowed.");
      }
      String var3 = param1.getMember("name").asString();
      String var4 = param1.getMember("description").asString();
      String var5;
      Value var10000 = param1.getMember("subcategory");
      if (var10000 != null) {
         String var10001 = var10000.asString();
         var5 = var10001 != null ? var10001 : "Scripts";
      } else {
         var5 = "Scripts";
      }
      double var6 = param1.getMember("min").asDouble();
      double var8 = param1.getMember("max").asDouble();
      double var10 = param1.getMember("defaultMin").asDouble();
      double var12 = param1.getMember("defaultMax").asDouble();
      Value var14 = param1.getMember("settings");
      Value var15 = param1.getMember("onChange");
      Value var16 = param1.getMember("shouldRender");
      me.octo.client.IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var17 = me.octo.client.IlIIlllIIlIllIlIIllIIIIIIlllIlIlIllllllIIIlIIIIlllIIllIlllIllIllllIlIIIlIIlIIIIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var14, this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      me.octo.client.lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl var18 = new me.octo.client.lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl(null, null, var15, var16, new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII));
      Intrinsics.checkNotNull(var3);
      Intrinsics.checkNotNull(var4);
      me.octo.client.IlIIIlllllllIIIIIIlIIllllIlIlIllIIlIIlIlIIIlllIIllllIlIlIIIIllIlllIIIIIlllIIlIlIllIlI var19 = new me.octo.client.IlIIIlllllllIIIIIIlIIllllIlIlIllIIlIIlIlIIIlllIIllllIlIlIIIIllIlllIIIIIlllIIlIlIllIlI(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, var3, var4, var5, var6, var8, var10, var12, var17, var18);
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var19;
      me.octo.client.IllIIIlIlIIIIIIIIlllIIlIllIIlIllIllIIIIIlIlllIIIIlllIIIIIllIlIlIlIIIIIlllIIIIIIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var19);
      me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Script '" + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl + "' registered DecimalRangeModule: " + var3);
      return new me.octo.client.lIIIlIlIIIIlIlIlIlllIIlIIlIIIIIlIIIlIIlIllIllIlIIIlIlIlIlIlIIIlIIIllIIlIllIIlllIIIIlI(var19);
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.b ()[Ljava/lang/String;
      // 003: astore 2
      // 004: aload 1
      // 005: sipush 5750
      // 008: sipush -11677
      // 00b: pop2
      // 00c: ldc "config"
      // 00e: aload 2
      // 00f: ifnull 055
      // 012: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 015: aload 0
      // 016: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII;
      // 019: ifnull 04b
      // 01c: goto 023
      // 01f: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 022: athrow
      // 023: new java/lang/IllegalStateException
      // 026: dup
      // 027: aload 0
      // 028: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Ljava/lang/String;
      // 02b: sipush 5728
      // 02e: sipush -23674
      // 031: pop2
      // 032: ldc "Script '"
      // 034: swap
      // 035: sipush 5751
      // 038: sipush -22812
      // 03b: pop2
      // 03c: ldc "' has already registered a module! Only ONE module per script is allowed."
      // 03e: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 043: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 046: athrow
      // 047: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 04a: athrow
      // 04b: aload 1
      // 04c: sipush 5755
      // 04f: sipush -27384
      // 052: pop2
      // 053: ldc "name"
      // 055: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 058: invokevirtual org/graalvm/polyglot/Value.asString ()Ljava/lang/String;
      // 05b: astore 3
      // 05c: aload 1
      // 05d: sipush 5729
      // 060: sipush -8979
      // 063: pop2
      // 064: ldc "description"
      // 066: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 069: invokevirtual org/graalvm/polyglot/Value.asString ()Ljava/lang/String;
      // 06c: astore 4
      // 06e: aload 2
      // 06f: ifnull 0a0
      // 072: aload 1
      // 073: sipush 5716
      // 076: sipush -14700
      // 079: pop2
      // 07a: ldc "subcategory"
      // 07c: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 07f: dup
      // 080: ifnull 098
      // 083: goto 08a
      // 086: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 089: athrow
      // 08a: invokevirtual org/graalvm/polyglot/Value.asString ()Ljava/lang/String;
      // 08d: dup
      // 08e: ifnonnull 0a9
      // 091: goto 098
      // 094: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 097: athrow
      // 098: pop
      // 099: goto 0a0
      // 09c: invokestatic me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 09f: athrow
      // 0a0: sipush 5739
      // 0a3: sipush 28987
      // 0a6: pop2
      // 0a7: ldc "Scripts"
      // 0a9: astore 5
      // 0ab: aload 1
      // 0ac: sipush 5737
      // 0af: sipush 13239
      // 0b2: pop2
      // 0b3: ldc "min"
      // 0b5: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 0b8: invokevirtual org/graalvm/polyglot/Value.asDouble ()D
      // 0bb: dstore 6
      // 0bd: aload 1
      // 0be: sipush 5726
      // 0c1: sipush -27123
      // 0c4: pop2
      // 0c5: ldc "max"
      // 0c7: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 0ca: invokevirtual org/graalvm/polyglot/Value.asDouble ()D
      // 0cd: dstore 8
      // 0cf: aload 1
      // 0d0: sipush 5727
      // 0d3: sipush 10454
      // 0d6: pop2
      // 0d7: ldc "defaultMin"
      // 0d9: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 0dc: invokevirtual org/graalvm/polyglot/Value.asDouble ()D
      // 0df: dstore 10
      // 0e1: aload 1
      // 0e2: sipush 5746
      // 0e5: sipush 960
      // 0e8: pop2
      // 0e9: ldc "defaultMax"
      // 0eb: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 0ee: invokevirtual org/graalvm/polyglot/Value.asDouble ()D
      // 0f1: dstore 12
      // 0f3: aload 1
      // 0f4: sipush 5723
      // 0f7: sipush -15498
      // 0fa: pop2
      // 0fb: ldc "settings"
      // 0fd: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 100: astore 14
      // 102: aload 1
      // 103: sipush 5748
      // 106: sipush 31821
      // 109: pop2
      // 10a: ldc "onChange"
      // 10c: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 10f: astore 15
      // 111: aload 1
      // 112: sipush 5725
      // 115: sipush -19596
      // 118: pop2
      // 119: ldc "shouldRender"
      // 11b: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 11e: astore 16
      // 120: getstatic me/octo/client/IlIIlllIIlIllIlIIllIIIIIIlllIlIlIllllllIIIlIIIIlllIIllIlllIllIllllIlIIIlIIlIIIIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IlIIlllIIlIllIlIIllIIIIIIlllIlIlIllllllIIIlIIIIlllIIllIlllIllIllllIlIIIlIIlIIIIllIIlI;
      // 123: aload 14
      // 125: aload 0
      // 126: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll;
      // 129: invokevirtual me/octo/client/IlIIlllIIlIllIlIIllIIIIIIlllIlIlIllllllIIIlIIIIlllIIllIlllIllIllllIlIIIlIIlIIIIllIIlI.a (Lorg/graalvm/polyglot/Value;Lme/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll;)[Lme/octo/client/IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll;
      // 12c: astore 17
      // 12e: new me/octo/client/lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl
      // 131: dup
      // 132: aconst_null
      // 133: aconst_null
      // 134: aload 15
      // 136: aload 16
      // 138: new me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
      // 13b: dup
      // 13c: aload 0
      // 13d: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll;
      // 140: invokespecial me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.<init> (Ljava/lang/Object;)V
      // 143: checkcast kotlin/jvm/functions/Function2
      // 146: invokespecial me/octo/client/lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl.<init> (Lorg/graalvm/polyglot/Value;Lorg/graalvm/polyglot/Value;Lorg/graalvm/polyglot/Value;Lorg/graalvm/polyglot/Value;Lkotlin/jvm/functions/Function2;)V
      // 149: astore 18
      // 14b: new me/octo/client/IlIIIlllllllIIIIIIlIIllllIlIlIllIIlIIlIlIIIlllIIllllIlIlIIIIllIlllIIIIIlllIIlIlIllIlI
      // 14e: dup
      // 14f: aload 0
      // 150: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Ljava/lang/String;
      // 153: aload 3
      // 154: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 157: aload 3
      // 158: aload 4
      // 15a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 15d: aload 4
      // 15f: aload 5
      // 161: dload 6
      // 163: dload 8
      // 165: dload 10
      // 167: dload 12
      // 169: aload 17
      // 16b: aload 18
      // 16d: invokespecial me/octo/client/IlIIIlllllllIIIIIIlIIllllIlIlIllIIlIIlIlIIIlllIIllllIlIlIIIIllIlllIIIIIlllIIlIlIllIlI.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDD[Lme/octo/client/IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll;Lme/octo/client/lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl;)V
      // 170: astore 19
      // 172: aload 0
      // 173: aload 19
      // 175: checkcast me/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII
      // 178: putfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII;
      // 17b: getstatic me/octo/client/IllIIIlIlIIIIIIIIlllIIlIllIIlIllIllIIIIIlIlllIIIIlllIIIIIllIlIlIlIIIIIlllIIIIIIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIlIIIIIIIIlllIIlIllIIlIllIllIIIIIlIlllIIIIlllIIIIIllIlIlIlIIIIIlllIIIIIIllIIlI;
      // 17e: aload 19
      // 180: checkcast me/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII
      // 183: invokevirtual me/octo/client/IllIIIlIlIIIIIIIIlllIIlIllIIlIllIllIIIIIlIlllIIIIlllIIIIIllIlIlIlIIIIIlllIIIIIIllIIlI.a (Lme/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII;)V
      // 186: aload 0
      // 187: getfield me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Ljava/lang/String;
      // 18a: aload 3
      // 18b: sipush 5728
      // 18e: sipush -23674
      // 191: pop2
      // 192: ldc "Script '"
      // 194: dup_x2
      // 195: pop
      // 196: sipush 5722
      // 199: sipush -31552
      // 19c: pop2
      // 19d: ldc_w "' registered DecimalRangeModule: "
      // 1a0: swap
      // 1a1: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001" ]
      // 1a6: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d (Ljava/lang/String;)V
      // 1a9: new me/octo/client/lIIIlIlIIIIlIlIlIlllIIlIIlIIIIIlIIIlIIlIllIllIlIIIlIlIlIlIlIIIlIIIllIIlIllIIlllIIIIlI
      // 1ac: dup
      // 1ad: aload 19
      // 1af: checkcast me/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII
      // 1b2: invokespecial me/octo/client/lIIIlIlIIIIlIlIlIlllIIlIIlIIIIIlIIIlIIlIllIllIlIIIlIlIlIlIlIIIlIIIllIIlIllIIlllIIIIlI.<init> (Lme/octo/client/lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII;)V
      // 1b5: areturn
   }

   public static void b(String[] var0) {
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var0;
   }

   public static String[] b() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   private static IllegalStateException a(IllegalStateException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[43];
      int var3 = 0;
      String[] var10000 = new String[1];
      String var2 = "ª\u009bð¢\u009bÚ|l\u001d@ïW\u000bx\u007f¦5ÏÀâ\u0089\u000bÌÝY\u0019zûnÂó÷\u0010¾O×cù\u001bè\u0080BæÚÂò\u0082E6³W!\u0000\u00863»ð$$\u0086îD·\u0081äg\u001c¯øªéÇ#Q¾1±=§ð\u000f¿ç÷¬·\u008c§·\u0017ïÑ\u008a_é\u0003ªØ\u0003\"\u0010\u0092]¤9\u008a\u008e\u008bÊ\u0017Bs\u001f\u0093H¾G\u0002\u0004RÏ-ÊÎÏ\u008aÃS\u0012þ(Ö\u0017\u008d\u0004\n\u0082aÏ\u0007\u0080\u0098p\f\u0018\u001eý\nÑôZ\u0081]¯U³Z\u0012\b2dið®«®YIÚ\u0017\u001e\u0010\u001cÑ®\u0098\u0089yÛKñðð<«\u0090D\u009c¡ñû\u0088!Q\u009e[r¬W¦\u009dª\u000bõH\u009ad[+PlÎã%\u0011í÷é\\j}\u0088ø\u000f²íÞF\"(\u0086¸×\u0085\u0005X\u0090Ì\u001f\u0007ê\u0006Äs\u0017=áÔ\ní·<'\u0002j!<\u00adA\r\u0091§Â*ÚhXÄãÓÈve\u0007©ÞUÄ¼\u0007i\ná+\\z\u009dÐM\\Qù\f5öÆÁÎ§'¶\u0013<\u0013Þ\b\u0017&Í¸:¢<xI^\u0094\u008e`\u000eßìYÁAÒLÐ\u0010Ô /\u0013Ôì³ÿ¹Iii\u0097\\SLsº\u0019)\u009b\u0085Z\u0094&\u009acheÉÂÅ5ñsjÌ\u001ao\u0086ºÎúÕ×A\u0003È¢¤S\u0006\u0095(\u0082Â]Æ¢\t /<\u0098ñ\u0088\u0010Ú*\u0003{ë/\u0006ý\u009b0 \u0005w\u0007\u008aüôN\u001bG?\u0007>ÿb.ÉKe\nx\u001eoÜû\u0004\u0081ÆÈª\u001a/Ûº\u008dÅ¯\u0011/9\u0083<áÐ×µïr\u008cA\u0089ù,ØÕw\u009a\u000b¼¥â©úíBg<\u0097\u001a\u0006ýó>¯B{\u000bLtü\u00939ª:\u008f3\u008aû\bËÔÜK\u001eçÌË\f\u001fñ\u007f\u0099È2û!jg<¿\u0004Åw\u0098q\fé;¡À\u0013\u0019\u0080D\u0005ËÑ*\u000b\u0016ÖSÕì\u007fä\u0098Y\u0004g\nè3}y¹°ÉPÉn\u0003úw\t\u0007íC¥Èè\u008d½\b>¦î®\u0098ªcô\b\u0095Ø5\u0011ü\bí;!\u008dÞî-O»@\u00ad\u0013Óyëx\u0080¤ÜÚN·Û¸\u0011\u0002æ1Ó>«Ú\u0092\u000b>A\b>¯@ÿRÕ8\u0080";
      int var4 = "ª\u009bð¢\u009bÚ|l\u001d@ïW\u000bx\u007f¦5ÏÀâ\u0089\u000bÌÝY\u0019zûnÂó÷\u0010¾O×cù\u001bè\u0080BæÚÂò\u0082E6³W!\u0000\u00863»ð$$\u0086îD·\u0081äg\u001c¯øªéÇ#Q¾1±=§ð\u000f¿ç÷¬·\u008c§·\u0017ïÑ\u008a_é\u0003ªØ\u0003\"\u0010\u0092]¤9\u008a\u008e\u008bÊ\u0017Bs\u001f\u0093H¾G\u0002\u0004RÏ-ÊÎÏ\u008aÃS\u0012þ(Ö\u0017\u008d\u0004\n\u0082aÏ\u0007\u0080\u0098p\f\u0018\u001eý\nÑôZ\u0081]¯U³Z\u0012\b2dið®«®YIÚ\u0017\u001e\u0010\u001cÑ®\u0098\u0089yÛKñðð<«\u0090D\u009c¡ñû\u0088!Q\u009e[r¬W¦\u009dª\u000bõH\u009ad[+PlÎã%\u0011í÷é\\j}\u0088ø\u000f²íÞF\"(\u0086¸×\u0085\u0005X\u0090Ì\u001f\u0007ê\u0006Äs\u0017=áÔ\ní·<'\u0002j!<\u00adA\r\u0091§Â*ÚhXÄãÓÈve\u0007©ÞUÄ¼\u0007i\ná+\\z\u009dÐM\\Qù\f5öÆÁÎ§'¶\u0013<\u0013Þ\b\u0017&Í¸:¢<xI^\u0094\u008e`\u000eßìYÁAÒLÐ\u0010Ô /\u0013Ôì³ÿ¹Iii\u0097\\SLsº\u0019)\u009b\u0085Z\u0094&\u009acheÉÂÅ5ñsjÌ\u001ao\u0086ºÎúÕ×A\u0003È¢¤S\u0006\u0095(\u0082Â]Æ¢\t /<\u0098ñ\u0088\u0010Ú*\u0003{ë/\u0006ý\u009b0 \u0005w\u0007\u008aüôN\u001bG?\u0007>ÿb.ÉKe\nx\u001eoÜû\u0004\u0081ÆÈª\u001a/Ûº\u008dÅ¯\u0011/9\u0083<áÐ×µïr\u008cA\u0089ù,ØÕw\u009a\u000b¼¥â©úíBg<\u0097\u001a\u0006ýó>¯B{\u000bLtü\u00939ª:\u008f3\u008aû\bËÔÜK\u001eçÌË\f\u001fñ\u007f\u0099È2û!jg<¿\u0004Åw\u0098q\fé;¡À\u0013\u0019\u0080D\u0005ËÑ*\u000b\u0016ÖSÕì\u007fä\u0098Y\u0004g\nè3}y¹°ÉPÉn\u0003úw\t\u0007íC¥Èè\u008d½\b>¦î®\u0098ªcô\b\u0095Ø5\u0011ü\bí;!\u008dÞî-O»@\u00ad\u0013Óyëx\u0080¤ÜÚN·Û¸\u0011\u0002æ1Ó>«Ú\u0092\u000b>A\b>¯@ÿRÕ8\u0080"
         .length();
      char var1 = '\b';
      b(var10000);
      int var8 = -1;

      label52:
      while (true) {
         byte var9 = 117;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var25 = var10001.toCharArray();
               int var10004 = var25.length;
               int var6 = 0;
               byte var28 = var9;
               var21 = var25;
               int var15 = var10004;
               byte var33;
               char[] var37;
               int var10006;
               if (var10004 <= 1) {
                  var37 = var25;
                  var33 = var9;
                  var10006 = var6;
               } else {
                  var28 = var9;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var37 = var25;
                  var33 = var9;
                  var10006 = var6;
               }

               while (true) {
                  var37[var10006] = (char)(var37[var10006] ^ var33 ^ switch (var6 % 7) {
                     case 0 -> 48;
                     case 1 -> 56;
                     case 2 -> 51;
                     case 3 -> 107;
                     case 4 -> 116;
                     case 5 -> 8;
                     default -> 4;
                  });
                  var6++;
                  if (var28 == 0) {
                     var10006 = var28;
                     var37 = var21;
                     var33 = var28;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var37 = var21;
                     var33 = var28;
                     var10006 = var6;
                  }
               }
            }

            String var30 = new String(var21).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var30;
                  if ((var8 += var1) >= var4) {
                     b = var5;
                     c = new String[43];
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var30;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "\u0014è\u009d\u009c»Ø\u0080â[Å©\u0003+\u0095«";
                  var4 = "\u0014è\u009d\u009c»Ø\u0080â[Å©\u0003+\u0095«".length();
                  var1 = 11;
                  var8 = -1;
            }

            var9 = 51;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 5757) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 147;
            case 1 -> 164;
            case 2 -> 175;
            case 3 -> 4;
            case 4 -> 104;
            case 5 -> 233;
            case 6 -> 151;
            case 7 -> 204;
            case 8 -> 93;
            case 9 -> 128;
            case 10 -> 162;
            case 11 -> 206;
            case 12 -> 244;
            case 13 -> 170;
            case 14 -> 47;
            case 15 -> 25;
            case 16 -> 57;
            case 17 -> 153;
            case 18 -> 14;
            case 19 -> 171;
            case 20 -> 10;
            case 21 -> 220;
            case 22 -> 82;
            case 23 -> 48;
            case 24 -> 198;
            case 25 -> 200;
            case 26 -> 32;
            case 27 -> 157;
            case 28 -> 114;
            case 29 -> 155;
            case 30 -> 122;
            case 31 -> 202;
            case 32 -> 43;
            case 33 -> 237;
            case 34 -> 126;
            case 35 -> 180;
            case 36 -> 241;
            case 37 -> 27;
            case 38 -> 41;
            case 39 -> 35;
            case 40 -> 36;
            case 41 -> 172;
            case 42 -> 190;
            case 43 -> 66;
            case 44 -> 145;
            case 45 -> 106;
            case 46 -> 107;
            case 47 -> 248;
            case 48 -> 99;
            case 49 -> 78;
            case 50 -> 139;
            case 51 -> 73;
            case 52 -> 110;
            case 53 -> 197;
            case 54 -> 56;
            case 55 -> 80;
            case 56 -> 254;
            case 57 -> 229;
            case 58 -> 127;
            case 59 -> 8;
            case 60 -> 161;
            case 61 -> 39;
            case 62 -> 100;
            case 63 -> 46;
            case 64 -> 87;
            case 65 -> 70;
            case 66 -> 228;
            case 67 -> 133;
            case 68 -> 218;
            case 69 -> 140;
            case 70 -> 215;
            case 71 -> 185;
            case 72 -> 20;
            case 73 -> 137;
            case 74 -> 193;
            case 75 -> 239;
            case 76 -> 188;
            case 77 -> 28;
            case 78 -> 42;
            case 79 -> 231;
            case 80 -> 123;
            case 81 -> 160;
            case 82 -> 158;
            case 83 -> 177;
            case 84 -> 85;
            case 85 -> 124;
            case 86 -> 72;
            case 87 -> 148;
            case 88 -> 144;
            case 89 -> 19;
            case 90 -> 250;
            case 91 -> 77;
            case 92 -> 191;
            case 93 -> 95;
            case 94 -> 247;
            case 95 -> 26;
            case 96 -> 236;
            case 97 -> 81;
            case 98 -> 60;
            case 99 -> 97;
            case 100 -> 45;
            case 101 -> 142;
            case 102 -> 225;
            case 103 -> 221;
            case 104 -> 30;
            case 105 -> 120;
            case 106 -> 88;
            case 107 -> 86;
            case 108 -> 253;
            case 109 -> 16;
            case 110 -> 71;
            case 111 -> 156;
            case 112 -> 94;
            case 113 -> 111;
            case 114 -> 189;
            case 115 -> 7;
            case 116 -> 92;
            case 117 -> 252;
            case 118 -> 184;
            case 119 -> 53;
            case 120 -> 76;
            case 121 -> 243;
            case 122 -> 9;
            case 123 -> 246;
            case 124 -> 23;
            case 125 -> 166;
            case 126 -> 69;
            case 127 -> 22;
            case 128 -> 222;
            case 129 -> 129;
            case 130 -> 152;
            case 131 -> 49;
            case 132 -> 65;
            case 133 -> 75;
            case 134 -> 186;
            case 135 -> 234;
            case 136 -> 37;
            case 137 -> 212;
            case 138 -> 219;
            case 139 -> 38;
            case 140 -> 68;
            case 141 -> 143;
            case 142 -> 169;
            case 143 -> 84;
            case 144 -> 192;
            case 145 -> 125;
            case 146 -> 40;
            case 147 -> 91;
            case 148 -> 33;
            case 149 -> 208;
            case 150 -> 167;
            case 151 -> 52;
            case 152 -> 195;
            case 153 -> 1;
            case 154 -> 163;
            case 155 -> 176;
            case 156 -> 183;
            case 157 -> 255;
            case 158 -> 181;
            case 159 -> 44;
            case 160 -> 134;
            case 161 -> 251;
            case 162 -> 203;
            case 163 -> 201;
            case 164 -> 0;
            case 165 -> 34;
            case 166 -> 58;
            case 167 -> 223;
            case 168 -> 138;
            case 169 -> 62;
            case 170 -> 179;
            case 171 -> 242;
            case 172 -> 149;
            case 173 -> 13;
            case 174 -> 24;
            case 175 -> 226;
            case 176 -> 187;
            case 177 -> 213;
            case 178 -> 6;
            case 179 -> 61;
            case 180 -> 245;
            case 181 -> 182;
            case 182 -> 17;
            case 183 -> 83;
            case 184 -> 117;
            case 185 -> 174;
            case 186 -> 210;
            case 187 -> 119;
            case 188 -> 90;
            case 189 -> 18;
            case 190 -> 105;
            case 191 -> 59;
            case 192 -> 74;
            case 193 -> 116;
            case 194 -> 98;
            case 195 -> 146;
            case 196 -> 199;
            case 197 -> 235;
            case 198 -> 216;
            case 199 -> 217;
            case 200 -> 209;
            case 201 -> 96;
            case 202 -> 50;
            case 203 -> 63;
            case 204 -> 108;
            case 205 -> 214;
            case 206 -> 31;
            case 207 -> 159;
            case 208 -> 211;
            case 209 -> 238;
            case 210 -> 118;
            case 211 -> 29;
            case 212 -> 102;
            case 213 -> 232;
            case 214 -> 2;
            case 215 -> 21;
            case 216 -> 55;
            case 217 -> 230;
            case 218 -> 103;
            case 219 -> 15;
            case 220 -> 12;
            case 221 -> 135;
            case 222 -> 130;
            case 223 -> 101;
            case 224 -> 3;
            case 225 -> 112;
            case 226 -> 165;
            case 227 -> 141;
            case 228 -> 249;
            case 229 -> 11;
            case 230 -> 240;
            case 231 -> 168;
            case 232 -> 173;
            case 233 -> 64;
            case 234 -> 121;
            case 235 -> 154;
            case 236 -> 194;
            case 237 -> 132;
            case 238 -> 109;
            case 239 -> 227;
            case 240 -> 205;
            case 241 -> 196;
            case 242 -> 207;
            case 243 -> 67;
            case 244 -> 51;
            case 245 -> 131;
            case 246 -> 89;
            case 247 -> 150;
            case 248 -> 224;
            case 249 -> 54;
            case 250 -> 115;
            case 251 -> 178;
            case 252 -> 136;
            case 253 -> 5;
            case 254 -> 113;
            default -> 79;
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }

   // PX-FIX PhaseA-inline: jar-only nested class restored from ext2/row0.javap.txt bytecode (see phaseA-nested-inline-BD2.md).
   static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
         extends kotlin.jvm.internal.FunctionReferenceImpl
         implements kotlin.jvm.functions.Function2 {
      // PX-FIX PhaseA-pending: the a[]/b[] string tables and the private static decryptor are
      // unreachable from anywhere in the jar (no call sites); their bytecode is preserved in
      // descriptor and control-flow shape, but the table *contents* are equivalent, not literal.
      private static java.lang.String[] a;
      private static java.lang.String[] b;

      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(java.lang.Object var1) {
         super(2, var1, me.octo.client.lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.class, "executeValue", "executeValue(Lorg/graalvm/polyglot/Value;[Ljava/lang/Object;)Ljava/lang/Object;", 0);
         return;
      }

      public final java.lang.Object a(org.graalvm.polyglot.Value var1, java.lang.Object[] var2) {
         kotlin.jvm.internal.Intrinsics.checkNotNullParameter(var2, "p1");
         return ((me.octo.client.lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll)this.receiver).a(var1, var2);
      }

      public java.lang.Object invoke(java.lang.Object var1, java.lang.Object var2) {
         return this.a((org.graalvm.polyglot.Value)var1, (java.lang.Object[])var2);
      }

      static {
         a = new String[3];
         b = new String[3];
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 17999) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();
            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 208;
               case 1 -> 184;
               case 2 -> 77;
               case 3 -> 87;
               case 4 -> 26;
               case 5 -> 36;
               case 6 -> 1;
               case 7 -> 115;
               case 8 -> 248;
               case 9 -> 151;
               case 10 -> 83;
               case 11 -> 199;
               case 12 -> 173;
               case 13 -> 162;
               case 14 -> 14;
               case 15 -> 202;
               case 16 -> 73;
               case 17 -> 170;
               case 18 -> 183;
               case 19 -> 139;
               case 20 -> 255;
               case 21 -> 15;
               case 22 -> 93;
               case 23 -> 25;
               case 24 -> 190;
               case 25 -> 104;
               case 26 -> 249;
               case 27 -> 228;
               case 28 -> 31;
               case 29 -> 218;
               case 30 -> 236;
               case 31 -> 119;
               case 32 -> 107;
               case 33 -> 221;
               case 34 -> 201;
               case 35 -> 118;
               case 36 -> 157;
               case 37 -> 17;
               case 38 -> 245;
               case 39 -> 38;
               case 40 -> 22;
               case 41 -> 254;
               case 42 -> 216;
               case 43 -> 95;
               case 44 -> 125;
               case 45 -> 34;
               case 46 -> 131;
               case 47 -> 163;
               case 48 -> 126;
               case 49 -> 198;
               case 50 -> 142;
               case 51 -> 76;
               case 52 -> 112;
               case 53 -> 24;
               case 54 -> 32;
               case 55 -> 117;
               case 56 -> 211;
               case 57 -> 45;
               case 58 -> 29;
               case 59 -> 147;
               case 60 -> 64;
               case 61 -> 188;
               case 62 -> 196;
               case 63 -> 9;
               case 64 -> 91;
               case 65 -> 239;
               case 66 -> 39;
               case 67 -> 214;
               case 68 -> 58;
               case 69 -> 130;
               case 70 -> 181;
               case 71 -> 246;
               case 72 -> 4;
               case 73 -> 79;
               case 74 -> 135;
               case 75 -> 12;
               case 76 -> 179;
               case 77 -> 94;
               case 78 -> 206;
               case 79 -> 250;
               case 80 -> 232;
               case 81 -> 72;
               case 82 -> 2;
               case 83 -> 108;
               case 84 -> 165;
               case 85 -> 46;
               case 86 -> 65;
               case 87 -> 252;
               case 88 -> 90;
               case 89 -> 160;
               case 90 -> 3;
               case 91 -> 212;
               case 92 -> 234;
               case 93 -> 123;
               case 94 -> 223;
               case 95 -> 168;
               case 96 -> 28;
               case 97 -> 81;
               case 98 -> 47;
               case 99 -> 172;
               case 100 -> 251;
               case 101 -> 52;
               case 102 -> 150;
               case 103 -> 74;
               case 104 -> 153;
               case 105 -> 84;
               case 106 -> 209;
               case 107 -> 99;
               case 108 -> 48;
               case 109 -> 164;
               case 110 -> 92;
               case 111 -> 230;
               case 112 -> 63;
               case 113 -> 43;
               case 114 -> 144;
               case 115 -> 20;
               case 116 -> 166;
               case 117 -> 21;
               case 118 -> 27;
               case 119 -> 109;
               case 120 -> 121;
               case 121 -> 0;
               case 122 -> 96;
               case 123 -> 78;
               case 124 -> 145;
               case 125 -> 67;
               case 126 -> 102;
               case 127 -> 11;
               case 128 -> 180;
               case 129 -> 70;
               case 130 -> 80;
               case 131 -> 241;
               case 132 -> 140;
               case 133 -> 229;
               case 134 -> 217;
               case 135 -> 50;
               case 136 -> 226;
               case 137 -> 193;
               case 138 -> 243;
               case 139 -> 204;
               case 140 -> 53;
               case 141 -> 178;
               case 142 -> 19;
               case 143 -> 137;
               case 144 -> 215;
               case 145 -> 37;
               case 146 -> 159;
               case 147 -> 62;
               case 148 -> 191;
               case 149 -> 152;
               case 150 -> 18;
               case 151 -> 235;
               case 152 -> 171;
               case 153 -> 155;
               case 154 -> 129;
               case 155 -> 167;
               case 156 -> 182;
               case 157 -> 224;
               case 158 -> 141;
               case 159 -> 148;
               case 160 -> 136;
               case 161 -> 205;
               case 162 -> 60;
               case 163 -> 100;
               case 164 -> 238;
               case 165 -> 122;
               case 166 -> 69;
               case 167 -> 189;
               case 168 -> 16;
               case 169 -> 5;
               case 170 -> 242;
               case 171 -> 175;
               case 172 -> 149;
               case 173 -> 237;
               case 174 -> 57;
               case 175 -> 213;
               case 176 -> 8;
               case 177 -> 200;
               case 178 -> 98;
               case 179 -> 106;
               case 180 -> 42;
               case 181 -> 124;
               case 182 -> 176;
               case 183 -> 194;
               case 184 -> 133;
               case 185 -> 51;
               case 186 -> 143;
               case 187 -> 55;
               case 188 -> 203;
               case 189 -> 177;
               case 190 -> 54;
               case 191 -> 30;
               case 192 -> 233;
               case 193 -> 23;
               case 194 -> 158;
               case 195 -> 240;
               case 196 -> 41;
               case 197 -> 101;
               case 198 -> 82;
               case 199 -> 103;
               case 200 -> 138;
               case 201 -> 13;
               case 202 -> 210;
               case 203 -> 161;
               case 204 -> 219;
               case 205 -> 89;
               case 206 -> 88;
               case 207 -> 195;
               case 208 -> 220;
               case 209 -> 66;
               case 210 -> 10;
               case 211 -> 146;
               case 212 -> 113;
               case 213 -> 127;
               case 214 -> 86;
               case 215 -> 111;
               case 216 -> 186;
               case 217 -> 120;
               case 218 -> 61;
               case 219 -> 154;
               case 220 -> 192;
               case 221 -> 207;
               case 222 -> 253;
               case 223 -> 222;
               case 224 -> 75;
               case 225 -> 40;
               case 226 -> 35;
               case 227 -> 231;
               case 228 -> 134;
               case 229 -> 44;
               case 230 -> 114;
               case 231 -> 7;
               case 232 -> 244;
               case 233 -> 97;
               case 234 -> 227;
               case 235 -> 132;
               case 236 -> 128;
               case 237 -> 85;
               case 238 -> 169;
               case 239 -> 156;
               case 240 -> 56;
               case 241 -> 68;
               case 242 -> 110;
               case 243 -> 59;
               case 244 -> 247;
               case 245 -> 185;
               case 246 -> 197;
               case 247 -> 71;
               case 248 -> 187;
               case 249 -> 33;
               case 250 -> 174;
               case 251 -> 49;
               case 252 -> 6;
               case 253 -> 105;
               case 254 -> 225;
               default -> 116;
            };
            int var5 = (var1 & 0xFF) - var4;
            if (var5 < 0) { var5 += 256; }
            int var6 = ((var1 & 65535) >>> 8) - var4;
            if (var6 < 0) { var6 += 256; }
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

   // PX-FIX PhaseA-inline: jar-only nested class restored from ext2/row1.javap.txt bytecode (see phaseA-nested-inline-BD2.md).
   static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
         extends kotlin.jvm.internal.FunctionReferenceImpl
         implements kotlin.jvm.functions.Function2 {
      // PX-FIX PhaseA-pending: the a[]/b[] string tables and the private static decryptor are
      // unreachable from anywhere in the jar (no call sites); their bytecode is preserved in
      // descriptor and control-flow shape, but the table *contents* are equivalent, not literal.
      private static java.lang.String[] a;
      private static java.lang.String[] b;

      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(java.lang.Object var1) {
         super(2, var1, me.octo.client.lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.class, "executeValue", "executeValue(Lorg/graalvm/polyglot/Value;[Ljava/lang/Object;)Ljava/lang/Object;", 0);
         return;
      }

      public final java.lang.Object a(org.graalvm.polyglot.Value var1, java.lang.Object[] var2) {
         kotlin.jvm.internal.Intrinsics.checkNotNullParameter(var2, "p1");
         return ((me.octo.client.lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll)this.receiver).a(var1, var2);
      }

      public java.lang.Object invoke(java.lang.Object var1, java.lang.Object var2) {
         return this.a((org.graalvm.polyglot.Value)var1, (java.lang.Object[])var2);
      }

      static {
         a = new String[3];
         b = new String[3];
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -3302) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();
            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 177;
               case 1 -> 196;
               case 2 -> 105;
               case 3 -> 115;
               case 4 -> 64;
               case 5 -> 47;
               case 6 -> 130;
               case 7 -> 224;
               case 8 -> 2;
               case 9 -> 100;
               case 10 -> 242;
               case 11 -> 120;
               case 12 -> 83;
               case 13 -> 102;
               case 14 -> 178;
               case 15 -> 165;
               case 16 -> 82;
               case 17 -> 251;
               case 18 -> 70;
               case 19 -> 192;
               case 20 -> 57;
               case 21 -> 24;
               case 22 -> 135;
               case 23 -> 205;
               case 24 -> 245;
               case 25 -> 78;
               case 26 -> 75;
               case 27 -> 25;
               case 28 -> 101;
               case 29 -> 84;
               case 30 -> 187;
               case 31 -> 39;
               case 32 -> 49;
               case 33 -> 89;
               case 34 -> 15;
               case 35 -> 134;
               case 36 -> 244;
               case 37 -> 247;
               case 38 -> 50;
               case 39 -> 52;
               case 40 -> 141;
               case 41 -> 180;
               case 42 -> 202;
               case 43 -> 162;
               case 44 -> 45;
               case 45 -> 32;
               case 46 -> 210;
               case 47 -> 35;
               case 48 -> 157;
               case 49 -> 74;
               case 50 -> 42;
               case 51 -> 29;
               case 52 -> 8;
               case 53 -> 87;
               case 54 -> 68;
               case 55 -> 212;
               case 56 -> 132;
               case 57 -> 233;
               case 58 -> 27;
               case 59 -> 156;
               case 60 -> 38;
               case 61 -> 215;
               case 62 -> 118;
               case 63 -> 221;
               case 64 -> 239;
               case 65 -> 65;
               case 66 -> 10;
               case 67 -> 79;
               case 68 -> 236;
               case 69 -> 125;
               case 70 -> 69;
               case 71 -> 122;
               case 72 -> 12;
               case 73 -> 22;
               case 74 -> 136;
               case 75 -> 126;
               case 76 -> 248;
               case 77 -> 16;
               case 78 -> 6;
               case 79 -> 81;
               case 80 -> 195;
               case 81 -> 144;
               case 82 -> 161;
               case 83 -> 163;
               case 84 -> 20;
               case 85 -> 216;
               case 86 -> 123;
               case 87 -> 58;
               case 88 -> 139;
               case 89 -> 110;
               case 90 -> 54;
               case 91 -> 3;
               case 92 -> 208;
               case 93 -> 14;
               case 94 -> 109;
               case 95 -> 254;
               case 96 -> 0;
               case 97 -> 176;
               case 98 -> 213;
               case 99 -> 186;
               case 100 -> 85;
               case 101 -> 95;
               case 102 -> 93;
               case 103 -> 97;
               case 104 -> 113;
               case 105 -> 170;
               case 106 -> 147;
               case 107 -> 107;
               case 108 -> 168;
               case 109 -> 96;
               case 110 -> 218;
               case 111 -> 76;
               case 112 -> 191;
               case 113 -> 150;
               case 114 -> 232;
               case 115 -> 1;
               case 116 -> 160;
               case 117 -> 250;
               case 118 -> 106;
               case 119 -> 48;
               case 120 -> 138;
               case 121 -> 217;
               case 122 -> 94;
               case 123 -> 172;
               case 124 -> 98;
               case 125 -> 164;
               case 126 -> 36;
               case 127 -> 33;
               case 128 -> 223;
               case 129 -> 62;
               case 130 -> 185;
               case 131 -> 207;
               case 132 -> 34;
               case 133 -> 56;
               case 134 -> 188;
               case 135 -> 31;
               case 136 -> 127;
               case 137 -> 17;
               case 138 -> 159;
               case 139 -> 194;
               case 140 -> 140;
               case 141 -> 23;
               case 142 -> 77;
               case 143 -> 146;
               case 144 -> 154;
               case 145 -> 206;
               case 146 -> 114;
               case 147 -> 148;
               case 148 -> 200;
               case 149 -> 190;
               case 150 -> 117;
               case 151 -> 116;
               case 152 -> 5;
               case 153 -> 225;
               case 154 -> 40;
               case 155 -> 175;
               case 156 -> 252;
               case 157 -> 71;
               case 158 -> 67;
               case 159 -> 145;
               case 160 -> 63;
               case 161 -> 7;
               case 162 -> 197;
               case 163 -> 183;
               case 164 -> 121;
               case 165 -> 103;
               case 166 -> 155;
               case 167 -> 204;
               case 168 -> 53;
               case 169 -> 128;
               case 170 -> 173;
               case 171 -> 80;
               case 172 -> 26;
               case 173 -> 111;
               case 174 -> 167;
               case 175 -> 151;
               case 176 -> 214;
               case 177 -> 46;
               case 178 -> 30;
               case 179 -> 234;
               case 180 -> 92;
               case 181 -> 241;
               case 182 -> 143;
               case 183 -> 18;
               case 184 -> 13;
               case 185 -> 184;
               case 186 -> 226;
               case 187 -> 211;
               case 188 -> 66;
               case 189 -> 169;
               case 190 -> 171;
               case 191 -> 166;
               case 192 -> 201;
               case 193 -> 249;
               case 194 -> 142;
               case 195 -> 253;
               case 196 -> 229;
               case 197 -> 246;
               case 198 -> 158;
               case 199 -> 59;
               case 200 -> 112;
               case 201 -> 182;
               case 202 -> 235;
               case 203 -> 189;
               case 204 -> 99;
               case 205 -> 60;
               case 206 -> 11;
               case 207 -> 51;
               case 208 -> 119;
               case 209 -> 44;
               case 210 -> 149;
               case 211 -> 86;
               case 212 -> 21;
               case 213 -> 90;
               case 214 -> 88;
               case 215 -> 104;
               case 216 -> 227;
               case 217 -> 129;
               case 218 -> 243;
               case 219 -> 255;
               case 220 -> 4;
               case 221 -> 73;
               case 222 -> 237;
               case 223 -> 28;
               case 224 -> 209;
               case 225 -> 131;
               case 226 -> 124;
               case 227 -> 9;
               case 228 -> 203;
               case 229 -> 61;
               case 230 -> 222;
               case 231 -> 152;
               case 232 -> 137;
               case 233 -> 231;
               case 234 -> 108;
               case 235 -> 174;
               case 236 -> 72;
               case 237 -> 181;
               case 238 -> 240;
               case 239 -> 193;
               case 240 -> 198;
               case 241 -> 43;
               case 242 -> 91;
               case 243 -> 153;
               case 244 -> 179;
               case 245 -> 228;
               case 246 -> 41;
               case 247 -> 219;
               case 248 -> 230;
               case 249 -> 220;
               case 250 -> 37;
               case 251 -> 133;
               case 252 -> 199;
               case 253 -> 19;
               case 254 -> 238;
               default -> 55;
            };
            int var5 = (var1 & 0xFF) - var4;
            if (var5 < 0) { var5 += 256; }
            int var6 = ((var1 & 65535) >>> 8) - var4;
            if (var6 < 0) { var6 += 256; }
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

   // PX-FIX PhaseA-inline: jar-only nested class restored from ext2/row2.javap.txt bytecode (see phaseA-nested-inline-BD2.md).
   static final class llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll
         extends kotlin.jvm.internal.FunctionReferenceImpl
         implements kotlin.jvm.functions.Function2 {
      // PX-FIX PhaseA-pending: the a[]/b[] string tables and the private static decryptor are
      // unreachable from anywhere in the jar (no call sites); their bytecode is preserved in
      // descriptor and control-flow shape, but the table *contents* are equivalent, not literal.
      private static java.lang.String[] a;
      private static java.lang.String[] b;

      llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(java.lang.Object var1) {
         super(2, var1, me.octo.client.lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.class, "executeValue", "executeValue(Lorg/graalvm/polyglot/Value;[Ljava/lang/Object;)Ljava/lang/Object;", 0);
         return;
      }

      public final java.lang.Object a(org.graalvm.polyglot.Value var1, java.lang.Object[] var2) {
         kotlin.jvm.internal.Intrinsics.checkNotNullParameter(var2, "p1");
         return ((me.octo.client.lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll)this.receiver).a(var1, var2);
      }

      public java.lang.Object invoke(java.lang.Object var1, java.lang.Object var2) {
         return this.a((org.graalvm.polyglot.Value)var1, (java.lang.Object[])var2);
      }

      static {
         a = new String[3];
         b = new String[3];
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 31024) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();
            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 147;
               case 1 -> 4;
               case 2 -> 93;
               case 3 -> 166;
               case 4 -> 251;
               case 5 -> 59;
               case 6 -> 79;
               case 7 -> 214;
               case 8 -> 255;
               case 9 -> 14;
               case 10 -> 23;
               case 11 -> 210;
               case 12 -> 53;
               case 13 -> 137;
               case 14 -> 18;
               case 15 -> 246;
               case 16 -> 28;
               case 17 -> 69;
               case 18 -> 186;
               case 19 -> 33;
               case 20 -> 154;
               case 21 -> 103;
               case 22 -> 226;
               case 23 -> 24;
               case 24 -> 6;
               case 25 -> 125;
               case 26 -> 102;
               case 27 -> 86;
               case 28 -> 22;
               case 29 -> 77;
               case 30 -> 82;
               case 31 -> 197;
               case 32 -> 74;
               case 33 -> 8;
               case 34 -> 163;
               case 35 -> 176;
               case 36 -> 92;
               case 37 -> 234;
               case 38 -> 78;
               case 39 -> 216;
               case 40 -> 9;
               case 41 -> 122;
               case 42 -> 61;
               case 43 -> 169;
               case 44 -> 44;
               case 45 -> 153;
               case 46 -> 198;
               case 47 -> 156;
               case 48 -> 222;
               case 49 -> 179;
               case 50 -> 37;
               case 51 -> 76;
               case 52 -> 85;
               case 53 -> 232;
               case 54 -> 36;
               case 55 -> 15;
               case 56 -> 55;
               case 57 -> 190;
               case 58 -> 45;
               case 59 -> 252;
               case 60 -> 205;
               case 61 -> 64;
               case 62 -> 233;
               case 63 -> 165;
               case 64 -> 89;
               case 65 -> 148;
               case 66 -> 31;
               case 67 -> 124;
               case 68 -> 253;
               case 69 -> 16;
               case 70 -> 101;
               case 71 -> 161;
               case 72 -> 17;
               case 73 -> 177;
               case 74 -> 118;
               case 75 -> 58;
               case 76 -> 3;
               case 77 -> 115;
               case 78 -> 228;
               case 79 -> 172;
               case 80 -> 12;
               case 81 -> 34;
               case 82 -> 192;
               case 83 -> 173;
               case 84 -> 238;
               case 85 -> 96;
               case 86 -> 227;
               case 87 -> 63;
               case 88 -> 121;
               case 89 -> 168;
               case 90 -> 195;
               case 91 -> 202;
               case 92 -> 171;
               case 93 -> 80;
               case 94 -> 98;
               case 95 -> 243;
               case 96 -> 84;
               case 97 -> 151;
               case 98 -> 209;
               case 99 -> 247;
               case 100 -> 0;
               case 101 -> 117;
               case 102 -> 158;
               case 103 -> 220;
               case 104 -> 191;
               case 105 -> 142;
               case 106 -> 152;
               case 107 -> 183;
               case 108 -> 212;
               case 109 -> 54;
               case 110 -> 66;
               case 111 -> 208;
               case 112 -> 211;
               case 113 -> 131;
               case 114 -> 35;
               case 115 -> 241;
               case 116 -> 245;
               case 117 -> 149;
               case 118 -> 193;
               case 119 -> 225;
               case 120 -> 39;
               case 121 -> 100;
               case 122 -> 104;
               case 123 -> 116;
               case 124 -> 65;
               case 125 -> 150;
               case 126 -> 95;
               case 127 -> 141;
               case 128 -> 170;
               case 129 -> 136;
               case 130 -> 110;
               case 131 -> 134;
               case 132 -> 159;
               case 133 -> 13;
               case 134 -> 38;
               case 135 -> 97;
               case 136 -> 203;
               case 137 -> 182;
               case 138 -> 29;
               case 139 -> 146;
               case 140 -> 231;
               case 141 -> 19;
               case 142 -> 10;
               case 143 -> 41;
               case 144 -> 88;
               case 145 -> 60;
               case 146 -> 57;
               case 147 -> 130;
               case 148 -> 237;
               case 149 -> 180;
               case 150 -> 145;
               case 151 -> 219;
               case 152 -> 223;
               case 153 -> 99;
               case 154 -> 25;
               case 155 -> 185;
               case 156 -> 157;
               case 157 -> 181;
               case 158 -> 206;
               case 159 -> 132;
               case 160 -> 129;
               case 161 -> 167;
               case 162 -> 221;
               case 163 -> 239;
               case 164 -> 70;
               case 165 -> 217;
               case 166 -> 207;
               case 167 -> 175;
               case 168 -> 138;
               case 169 -> 174;
               case 170 -> 47;
               case 171 -> 235;
               case 172 -> 126;
               case 173 -> 215;
               case 174 -> 111;
               case 175 -> 196;
               case 176 -> 73;
               case 177 -> 106;
               case 178 -> 109;
               case 179 -> 49;
               case 180 -> 67;
               case 181 -> 113;
               case 182 -> 236;
               case 183 -> 248;
               case 184 -> 20;
               case 185 -> 120;
               case 186 -> 62;
               case 187 -> 194;
               case 188 -> 51;
               case 189 -> 144;
               case 190 -> 240;
               case 191 -> 160;
               case 192 -> 43;
               case 193 -> 249;
               case 194 -> 189;
               case 195 -> 184;
               case 196 -> 52;
               case 197 -> 201;
               case 198 -> 188;
               case 199 -> 108;
               case 200 -> 7;
               case 201 -> 230;
               case 202 -> 56;
               case 203 -> 123;
               case 204 -> 21;
               case 205 -> 94;
               case 206 -> 81;
               case 207 -> 250;
               case 208 -> 30;
               case 209 -> 143;
               case 210 -> 127;
               case 211 -> 68;
               case 212 -> 133;
               case 213 -> 128;
               case 214 -> 218;
               case 215 -> 244;
               case 216 -> 140;
               case 217 -> 139;
               case 218 -> 72;
               case 219 -> 75;
               case 220 -> 91;
               case 221 -> 71;
               case 222 -> 50;
               case 223 -> 178;
               case 224 -> 1;
               case 225 -> 135;
               case 226 -> 26;
               case 227 -> 229;
               case 228 -> 119;
               case 229 -> 242;
               case 230 -> 105;
               case 231 -> 40;
               case 232 -> 200;
               case 233 -> 199;
               case 234 -> 162;
               case 235 -> 87;
               case 236 -> 164;
               case 237 -> 32;
               case 238 -> 46;
               case 239 -> 5;
               case 240 -> 224;
               case 241 -> 42;
               case 242 -> 90;
               case 243 -> 187;
               case 244 -> 254;
               case 245 -> 204;
               case 246 -> 48;
               case 247 -> 27;
               case 248 -> 213;
               case 249 -> 83;
               case 250 -> 112;
               case 251 -> 11;
               case 252 -> 107;
               case 253 -> 155;
               case 254 -> 114;
               default -> 2;
            };
            int var5 = (var1 & 0xFF) - var4;
            if (var5 < 0) { var5 += 256; }
            int var6 = ((var1 & 65535) >>> 8) - var4;
            if (var6 < 0) { var6 += 256; }
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
}
