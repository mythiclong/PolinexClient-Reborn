package me.octo.client.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

public final class lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll {
   @NotNull
   public static lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static volatile boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   public static String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String[] a;
   private static String[] b;

   private lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll() {
   }

   public final void a() {
      boolean var1 = false;
      boolean var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      if (var1) {
         if (lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
            return;
         }

         var10000 = true;
      }

      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var10000;
      this.b();
   }

   public final void b() {
      // PX-FIX restored try/catch: jar b() has Exception table 38-252 -> handler 255 (Throwable),
      // handler logs "Essential import failed: " + t.getMessage() and returns; without it a missing
      // optional mod (gg.essential) escaped as RuntimeException.
      try {
         java.util.Set var2 = this.d();
         java.util.List var3 = this.c();
         int var4 = 0;

         for (Object var8 : (Iterable) var3) {
            kotlin.Pair var9 = (kotlin.Pair) var8;
            java.util.UUID var11 = (java.util.UUID) var9.component1();
            String var12 = (String) var9.component2();
            if (!var2.contains(var11)) {
               var4 = var4 + 1;
            }
         }

         if (var4 > 0) {
            me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Imported " + var4 + " accounts from Essential.");
         }
      } catch (Throwable var13) {
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Essential import failed: " + var13.getMessage());
      }

   }
   private final List<Pair<UUID, String>> c() {
      Object var33 = null; // PX-FIX
      Object var30 = null; // PX-FIX
      boolean var1;
      List var26;
      label72: {
         short var10001 = -31046;
         short var10002 = 27920;
         Class var2;
         try {
            var2 = Class.forName("gg.essential.gui.menu.AccountManager");
         }
         catch (ClassNotFoundException exception) {
            throw new RuntimeException(exception);
         }
         Object var3;
         try {
            try {
               try {
                  var3 = var2.getDeclaredConstructor().newInstance();
               }
               catch (java.lang.reflect.InvocationTargetException exception) {
                  throw new RuntimeException(exception);
               }
            }
            catch (IllegalAccessException exception) {
               throw new RuntimeException(exception);
            }
         }
         catch (NoSuchMethodException | InstantiationException exception) {
            throw new RuntimeException(exception);
         }
         var1 = false;
         var10001 = -31055;
         var10002 = 24798;
         Method var5;
         try {
            var5 = var2.getDeclaredMethod("getAllAccounts");
         }
         catch (NoSuchMethodException exception) {
            throw new RuntimeException(exception);
         }
         boolean var7 = false;
         var5.setAccessible(true);
         Object var21;
         try {
            try {
               var21 = var5.invoke(var3);
            }
            catch (java.lang.reflect.InvocationTargetException exception) {
               throw new RuntimeException(exception);
            }
         }
         catch (IllegalAccessException exception) {
            throw new RuntimeException(exception);
         }
         Class var10000 = var21.getClass();
         var10001 = -31052;
         var10002 = -16313;
         Object var8;
         try {
            try {
               var8 = var10000.getMethod("get").invoke(var21);
            }
            catch (java.lang.reflect.InvocationTargetException exception) {
               throw new RuntimeException(exception);
            }
         }
         catch (NoSuchMethodException | IllegalAccessException exception) {
            throw new RuntimeException(exception);
         }
         var26 = (List)var8;
         if (var1) {
            if (!(var8 instanceof List)) {
               var26 = null;
               break label72;
            }

            var26 = (List)var8;
         }

         var26 = var26;
      }

      if (var26 == null) {
         return CollectionsKt.emptyList();
      } else {
         List var6 = var26;
         List var22 = new ArrayList();
         Iterable var23 = var6;
         boolean var9 = false;

         for (Object var11 : var23) {
            boolean var13 = false;
            if (var1) {
               label76: {
                  var26 = (List)var11;
                  if (var1) {
                     if (var11 == null) {
                        break label76;
                     }

                     var26 = (List)var11;
                  }

                  label58: {
                     Class var28 = var26.getClass();
                     short var36 = -31045;
                     short var40 = 28061;
                     Field var14;
                     try {
                        var14 = var28.getDeclaredField("uuid");
                     }
                     catch (NoSuchFieldException exception) {
                        throw new RuntimeException(exception);
                     }
                     boolean var16 = false;
                     var14.setAccessible(true);
                     Object var17;
                     try {
                        var17 = var14.get(var11);
                     }
                     catch (IllegalAccessException exception) {
                        throw new RuntimeException(exception);
                     }
                     var26 = (List)var17;
                     if (var1) {
                        if (!(var17 instanceof UUID)) {
                           var30 = null;
                           break label58;
                        }

                        var26 = (List)var17;
                     }

                     var30 = (UUID)(Object)var26;
                  }

                  if (var30 != null) {
                     UUID var18;
                     label51: {
                        var18 =((UUID)( var30));
                        Class var31 = var11.getClass();
                        short var37 = -31042;
                        short var41 = -527;
                        Field var15;
                        try {
                           var15 = var31.getDeclaredField("name");
                        }
                        catch (NoSuchFieldException exception) {
                           throw new RuntimeException(exception);
                        }
                        boolean var19 = false;
                        var15.setAccessible(true);
                        Object var24;
                        try {
                           var24 = var15.get(var11);
                        }
                        catch (IllegalAccessException exception) {
                           throw new RuntimeException(exception);
                        }
                        var26 = (List)var24;
                        if (var1) {
                           if (!(var24 instanceof String)) {
                              var33 = null;
                              break label51;
                           }

                           var26 = (List)var24;
                        }

                        var33 = (String)(Object)var26;
                     }

                     if (var33 != null) {
                        String var20 =((String)( var33));
                        var22.add(TuplesKt.to(var18, var20));
                     }
                  }
               }

               if (var1) {
                  continue;
               }
            }
            break;
         }

         return var22;
      }
   }

   private final Set<UUID> d() {
      Set<UUID> var2 = new java.util.LinkedHashSet<>();
      try {
         Class var3 = Class.forName("gg.essential.Essential");
         Object var4 = var3.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
         Field var6 = var4.getClass().getDeclaredField("sessionFactories");
         var6.setAccessible(true);
         Object var8 = var6.get(var4);
         List var5 = var8 instanceof List ? (List)var8 : null;
         if (var5 == null) {
            return var2;
         }

         for (Object var11 : (Iterable)var5) {
            if (var11 != null && kotlin.jvm.internal.Intrinsics.areEqual(var11.getClass().getSimpleName(), "InitialSessionFactory")) {
               Object var13 = var11.getClass().getMethod("getSessions", new Class[0]).invoke(var11, new Object[0]);
               java.util.Map var14 = var13 instanceof java.util.Map ? (java.util.Map)var13 : null;
               if (var14 == null) {
                  continue;
               }

               for (Object var18 : var14.keySet()) {
                  if (var18 instanceof UUID) {
                     var2.add((UUID)var18);
                  }
               }
            }
         }
      } catch (Throwable var10) {
      }

      return var2;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 0
      // 001: new java/util/LinkedHashSet
      // 004: dup
      // 005: invokespecial java/util/LinkedHashSet.<init> ()V
      // 008: checkcast java/util/Set
      // 00b: astore 2
      // 00c: istore 1
      // 00d: nop
      // 00e: sipush -31051
      // 011: sipush 8637
      // 014: pop2
      // 015: ldc "gg.essential.Essential"
      // 017: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 01a: astore 3
      // 01b: aload 3
      // 01c: sipush -31054
      // 01f: sipush 21629
      // 022: pop2
      // 023: ldc "getInstance"
      // 025: bipush 0
      // 026: anewarray 130
      // 029: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 02c: aconst_null
      // 02d: bipush 0
      // 02e: anewarray 4
      // 031: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 034: astore 4
      // 036: aload 4
      // 038: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 03b: sipush -31048
      // 03e: sipush -6863
      // 041: pop2
      // 042: ldc "sessionFactories"
      // 044: invokevirtual java/lang/Class.getDeclaredField (Ljava/lang/String;)Ljava/lang/reflect/Field;
      // 047: astore 6
      // 049: aload 6
      // 04b: astore 7
      // 04d: bipush 0
      // 04e: istore 8
      // 050: aload 7
      // 052: bipush 1
      // 053: invokevirtual java/lang/reflect/Field.setAccessible (Z)V
      // 056: aload 6
      // 058: astore 5
      // 05a: aload 5
      // 05c: aload 4
      // 05e: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 061: astore 8
      // 063: aload 8
      // 065: iload 1
      // 066: ifne 07f
      // 069: instanceof java/util/List
      // 06c: ifeq 085
      // 06f: goto 076
      // 072: invokestatic me/octo/client/utils/lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 075: athrow
      // 076: aload 8
      // 078: goto 07f
      // 07b: invokestatic me/octo/client/utils/lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07e: athrow
      // 07f: checkcast java/util/List
      // 082: goto 086
      // 085: aconst_null
      // 086: dup
      // 087: ifnonnull 091
      // 08a: pop
      // 08b: aload 2
      // 08c: areturn
      // 08d: invokestatic me/octo/client/utils/lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 090: athrow
      // 091: astore 6
      // 093: aload 6
      // 095: checkcast java/lang/Iterable
      // 098: astore 7
      // 09a: bipush 0
      // 09b: istore 8
      // 09d: aload 7
      // 09f: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 0a4: astore 9
      // 0a6: aload 9
      // 0a8: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0ad: ifeq 1c3
      // 0b0: aload 9
      // 0b2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0b7: astore 10
      // 0b9: aload 10
      // 0bb: astore 11
      // 0bd: bipush 0
      // 0be: istore 12
      // 0c0: iload 1
      // 0c1: ifne 1c4
      // 0c4: aload 11
      // 0c6: iload 1
      // 0c7: ifne 0f2
      // 0ca: goto 0d1
      // 0cd: invokestatic me/octo/client/utils/lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d0: athrow
      // 0d1: dup
      // 0d2: ifnonnull 0e4
      // 0d5: goto 0dc
      // 0d8: invokestatic me/octo/client/utils/lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0db: athrow
      // 0dc: pop
      // 0dd: goto 1be
      // 0e0: invokestatic me/octo/client/utils/lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e3: athrow
      // 0e4: pop
      // 0e5: iload 1
      // 0e6: ifne 1bf
      // 0e9: aload 11
      // 0eb: goto 0f2
      // 0ee: invokestatic me/octo/client/utils/lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f1: athrow
      // 0f2: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0f5: invokevirtual java/lang/Class.getSimpleName ()Ljava/lang/String;
      // 0f8: sipush -31053
      // 0fb: sipush -11917
      // 0fe: pop2
      // 0ff: ldc "InitialSessionFactory"
      // 101: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 104: ifeq 1be
      // 107: nop
      // 108: aload 11
      // 10a: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 10d: sipush -31050
      // 110: sipush -20538
      // 113: pop2
      // 114: ldc "getSessions"
      // 116: bipush 0
      // 117: anewarray 130
      // 11a: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 11d: aload 11
      // 11f: bipush 0
      // 120: anewarray 4
      // 123: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 126: astore 13
      // 128: aload 13
      // 12a: iload 1
      // 12b: ifne 144
      // 12e: instanceof java/util/Map
      // 131: ifeq 14a
      // 134: goto 13b
      // 137: invokestatic me/octo/client/utils/lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13a: athrow
      // 13b: aload 13
      // 13d: goto 144
      // 140: invokestatic me/octo/client/utils/lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 143: athrow
      // 144: checkcast java/util/Map
      // 147: goto 14b
      // 14a: aconst_null
      // 14b: dup
      // 14c: ifnonnull 157
      // 14f: pop
      // 150: goto 1be
      // 153: invokestatic me/octo/client/utils/lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 156: athrow
      // 157: astore 14
      // 159: aload 14
      // 15b: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 160: checkcast java/lang/Iterable
      // 163: astore 15
      // 165: bipush 0
      // 166: istore 13
      // 168: aload 15
      // 16a: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 16f: astore 16
      // 171: aload 16
      // 173: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 178: ifeq 1b7
      // 17b: aload 16
      // 17d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 182: astore 17
      // 184: aload 17
      // 186: astore 18
      // 188: bipush 0
      // 189: istore 19
      // 18b: iload 1
      // 18c: ifne 1b3
      // 18f: aload 18
      // 191: instanceof java/util/UUID
      // 194: iload 1
      // 195: ifne 0ad
      // 198: goto 19f
      // 19b: invokestatic me/octo/client/utils/lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19e: athrow
      // 19f: ifeq 1b2
      // 1a2: aload 2
      // 1a3: aload 18
      // 1a5: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 1aa: pop
      // 1ab: goto 1b2
      // 1ae: invokestatic me/octo/client/utils/lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b1: athrow
      // 1b2: nop
      // 1b3: iload 1
      // 1b4: ifeq 171
      // 1b7: nop
      // 1b8: goto 1bd
      // 1bb: astore 14
      // 1bd: nop
      // 1be: nop
      // 1bf: iload 1
      // 1c0: ifeq 0a6
      // 1c3: nop
      // 1c4: goto 1c8
      // 1c7: astore 3
      // 1c8: aload 2
      // 1c9: areturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[14];
      int var3 = 0;
      String var2 = "\u0082\u0012öI\u008e\u008c\u0002\u001fÌ\u0006ÿÉ³è\"×\u0006\u001fÝU»\u000bp´^Ê\"thb\u0091Í(\u000e\u0001\u0090pFåóçlþByÙ¾\u0010\u0019±ºÞ¥ÆðÏ!!Q\u0083\u0001\u008b\u008aCÜ\u0090Ù\u0017v¤\u0094\u0007\u0015_\tõT\u0001ùQ÷\u0088ðð\u000b¦\u009c\u0084ÕrÎ\u000f=\u009b\"^\u0016|Ñ\u0085\bU\u0085)S\u0090\u000fU´÷Éö¯\tZá¿\\O\u0003ão,\u0004_¾ö´$F2Ât½\n4¢31!sy\u0013!\u0088~ä<\fÀ\u009c\u008a´\u0087\u008b´f©*\u0001\u0013q\u0098ýz\t3Ts.`F=Ã\u0087\u0010\u008bÀ°~\u001f\u00832$\u008cÆtÅ8¨Î*";
      int var4 = "\u0082\u0012öI\u008e\u008c\u0002\u001fÌ\u0006ÿÉ³è\"×\u0006\u001fÝU»\u000bp´^Ê\"thb\u0091Í(\u000e\u0001\u0090pFåóçlþByÙ¾\u0010\u0019±ºÞ¥ÆðÏ!!Q\u0083\u0001\u008b\u008aCÜ\u0090Ù\u0017v¤\u0094\u0007\u0015_\tõT\u0001ùQ÷\u0088ðð\u000b¦\u009c\u0084ÕrÎ\u000f=\u009b\"^\u0016|Ñ\u0085\bU\u0085)S\u0090\u000fU´÷Éö¯\tZá¿\\O\u0003ão,\u0004_¾ö´$F2Ât½\n4¢31!sy\u0013!\u0088~ä<\fÀ\u009c\u008a´\u0087\u008b´f©*\u0001\u0013q\u0098ýz\t3Ts.`F=Ã\u0087\u0010\u008bÀ°~\u001f\u00832$\u008cÆtÅ8¨Î*"
         .length();
      char var1 = 21;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 85;
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
                     case 0 -> 98;
                     case 1 -> 115;
                     case 2 -> 28;
                     case 3 -> 77;
                     case 4 -> 1;
                     case 5 -> 104;
                     default -> 36;
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
                     b = new String[14];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll();
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

                  var2 = "\u0084\u0093ò\u0085\u0003`\u0002T3\u001ba\u0004u\u0087a]Ì¸ò¹×Õ$µÃ\u0004ÈÊ+þ";
                  var4 = "\u0084\u0093ò\u0085\u0003`\u0002T3\u001ba\u0004u\u0087a]Ì¸ò¹×Õ$µÃ\u0004ÈÊ+þ".length();
                  var1 = 25;
                  var8 = -1;
            }

            var10000 = 13;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static Throwable a(Throwable var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -31053) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 180;
            case 1 -> 179;
            case 2 -> 203;
            case 3 -> 103;
            case 4 -> 233;
            case 5 -> 43;
            case 6 -> 160;
            case 7 -> 138;
            case 8 -> 183;
            case 9 -> 215;
            case 10 -> 8;
            case 11 -> 75;
            case 12 -> 19;
            case 13 -> 173;
            case 14 -> 130;
            case 15 -> 20;
            case 16 -> 186;
            case 17 -> 89;
            case 18 -> 182;
            case 19 -> 12;
            case 20 -> 63;
            case 21 -> 189;
            case 22 -> 234;
            case 23 -> 114;
            case 24 -> 222;
            case 25 -> 31;
            case 26 -> 193;
            case 27 -> 3;
            case 28 -> 71;
            case 29 -> 137;
            case 30 -> 157;
            case 31 -> 86;
            case 32 -> 74;
            case 33 -> 53;
            case 34 -> 118;
            case 35 -> 51;
            case 36 -> 9;
            case 37 -> 107;
            case 38 -> 187;
            case 39 -> 44;
            case 40 -> 69;
            case 41 -> 36;
            case 42 -> 191;
            case 43 -> 33;
            case 44 -> 171;
            case 45 -> 129;
            case 46 -> 249;
            case 47 -> 77;
            case 48 -> 29;
            case 49 -> 230;
            case 50 -> 134;
            case 51 -> 248;
            case 52 -> 48;
            case 53 -> 181;
            case 54 -> 141;
            case 55 -> 49;
            case 56 -> 174;
            case 57 -> 127;
            case 58 -> 190;
            case 59 -> 110;
            case 60 -> 142;
            case 61 -> 68;
            case 62 -> 46;
            case 63 -> 226;
            case 64 -> 153;
            case 65 -> 246;
            case 66 -> 4;
            case 67 -> 149;
            case 68 -> 1;
            case 69 -> 161;
            case 70 -> 23;
            case 71 -> 93;
            case 72 -> 155;
            case 73 -> 243;
            case 74 -> 32;
            case 75 -> 145;
            case 76 -> 207;
            case 77 -> 58;
            case 78 -> 11;
            case 79 -> 132;
            case 80 -> 206;
            case 81 -> 197;
            case 82 -> 239;
            case 83 -> 59;
            case 84 -> 17;
            case 85 -> 18;
            case 86 -> 62;
            case 87 -> 253;
            case 88 -> 199;
            case 89 -> 185;
            case 90 -> 216;
            case 91 -> 156;
            case 92 -> 109;
            case 93 -> 223;
            case 94 -> 195;
            case 95 -> 251;
            case 96 -> 99;
            case 97 -> 111;
            case 98 -> 136;
            case 99 -> 255;
            case 100 -> 194;
            case 101 -> 117;
            case 102 -> 115;
            case 103 -> 165;
            case 104 -> 128;
            case 105 -> 76;
            case 106 -> 200;
            case 107 -> 10;
            case 108 -> 168;
            case 109 -> 170;
            case 110 -> 242;
            case 111 -> 34;
            case 112 -> 65;
            case 113 -> 250;
            case 114 -> 60;
            case 115 -> 210;
            case 116 -> 219;
            case 117 -> 25;
            case 118 -> 67;
            case 119 -> 162;
            case 120 -> 84;
            case 121 -> 211;
            case 122 -> 30;
            case 123 -> 218;
            case 124 -> 7;
            case 125 -> 240;
            case 126 -> 24;
            case 127 -> 201;
            case 128 -> 83;
            case 129 -> 6;
            case 130 -> 125;
            case 131 -> 54;
            case 132 -> 205;
            case 133 -> 178;
            case 134 -> 61;
            case 135 -> 175;
            case 136 -> 238;
            case 137 -> 124;
            case 138 -> 5;
            case 139 -> 131;
            case 140 -> 247;
            case 141 -> 15;
            case 142 -> 169;
            case 143 -> 35;
            case 144 -> 152;
            case 145 -> 208;
            case 146 -> 91;
            case 147 -> 231;
            case 148 -> 252;
            case 149 -> 254;
            case 150 -> 81;
            case 151 -> 92;
            case 152 -> 113;
            case 153 -> 106;
            case 154 -> 52;
            case 155 -> 13;
            case 156 -> 2;
            case 157 -> 64;
            case 158 -> 27;
            case 159 -> 90;
            case 160 -> 192;
            case 161 -> 235;
            case 162 -> 225;
            case 163 -> 72;
            case 164 -> 95;
            case 165 -> 139;
            case 166 -> 245;
            case 167 -> 40;
            case 168 -> 144;
            case 169 -> 151;
            case 170 -> 102;
            case 171 -> 177;
            case 172 -> 87;
            case 173 -> 120;
            case 174 -> 66;
            case 175 -> 22;
            case 176 -> 105;
            case 177 -> 100;
            case 178 -> 21;
            case 179 -> 140;
            case 180 -> 39;
            case 181 -> 119;
            case 182 -> 0;
            case 183 -> 16;
            case 184 -> 176;
            case 185 -> 94;
            case 186 -> 47;
            case 187 -> 164;
            case 188 -> 98;
            case 189 -> 143;
            case 190 -> 228;
            case 191 -> 167;
            case 192 -> 121;
            case 193 -> 163;
            case 194 -> 198;
            case 195 -> 202;
            case 196 -> 45;
            case 197 -> 85;
            case 198 -> 172;
            case 199 -> 188;
            case 200 -> 227;
            case 201 -> 224;
            case 202 -> 220;
            case 203 -> 126;
            case 204 -> 147;
            case 205 -> 73;
            case 206 -> 214;
            case 207 -> 50;
            case 208 -> 204;
            case 209 -> 79;
            case 210 -> 38;
            case 211 -> 78;
            case 212 -> 148;
            case 213 -> 116;
            case 214 -> 158;
            case 215 -> 237;
            case 216 -> 14;
            case 217 -> 209;
            case 218 -> 232;
            case 219 -> 104;
            case 220 -> 88;
            case 221 -> 112;
            case 222 -> 150;
            case 223 -> 70;
            case 224 -> 241;
            case 225 -> 133;
            case 226 -> 101;
            case 227 -> 154;
            case 228 -> 122;
            case 229 -> 221;
            case 230 -> 166;
            case 231 -> 135;
            case 232 -> 244;
            case 233 -> 41;
            case 234 -> 37;
            case 235 -> 236;
            case 236 -> 56;
            case 237 -> 217;
            case 238 -> 42;
            case 239 -> 28;
            case 240 -> 213;
            case 241 -> 57;
            case 242 -> 229;
            case 243 -> 159;
            case 244 -> 108;
            case 245 -> 80;
            case 246 -> 97;
            case 247 -> 212;
            case 248 -> 196;
            case 249 -> 123;
            case 250 -> 146;
            case 251 -> 26;
            case 252 -> 82;
            case 253 -> 96;
            case 254 -> 55;
            default -> 184;
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
