package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import me.octo.client.IIIlIlllllllIlIlIllIlIIIlIlIlIIIIIIllllIIIlIlIlIIIlIlllllIlIIllIIllllIlIIIllllIllllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
import me.octo.client.events.impl.lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
import me.octo.client.utils.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.ChatScreen;
import net.minecraft.network.chat.Style;
import net.minecraft.util.FormattedCharSequence;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;
import me.octo.client.mixin.accessors.ChatComponentAccessor;
import kotlin.collections.CollectionsKt;
import net.minecraft.network.chat.Component;
import java.lang.reflect.Field;
import java.util.List;
import java.lang.reflect.Method;
import kotlin.ranges.RangesKt;

public final class lIIlIIlllllIIllIlIllIllIIIIllIllllIIllIIllIllIlIIIIIllIllIIlIIIllIllIIIIlIIIIllllIIII {
   @NotNull
   public static lIIlIIlllllIIllIlIllIllIIIIllIllllIIllIIllIllIlIIIIIllIllIIlIIIllIllIIIIlIIIIllllIIII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static String[] a;
   private static String[] b;

   private lIIlIIlllllIIllIlIllIllIIIIllIllllIIllIIllIllIlIIIIIllIllIIlIIIllIllIIIIlIIIIllllIIII() {
   }

   @SubscribeEvent
   public final void a(@NotNull lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl var1) {
      Object var9 = null; // PX-FIX
      Object var8 = null; // PX-FIX
      String[] var10000 = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      short var10002 = 774;
      short var10003 = 10662;
      Intrinsics.checkNotNullParameter(var1, "event");
      String[] var2 = var10000;
      int var7 = ((IIIlIlllllllIlIlIllIlIIIlIlIlIIIIIIllllIIIlIlIlIIIlIlllllIlIIllIIllllIlIIIllllIllllll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
         .ae()) ? 1 : 0);
      if (var2 == null) {
         if (var7 == 0) {
            return;
         }

         var7 = ((var1.n()) ? 1 : 0);
      }

      if (var2 == null) {
         if (var7 == 0) {
            return;
         }

         var7 = ((lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .screen instanceof ChatScreen) ? 1 : 0);
      }

      if (var2 == null) {
         if (var7 == 0) {
            return;
         }

         var7 = var1.k();
      }

      if (var2 == null) {
         byte var10001;
         label124: {
            if (var7 != 0) {
               var8 = var1.k();
               var10001 = 1;
               if (var2 != null) {
                  break label124;
               }

               if ((me.octo.client.PxTruth.truth(var8))) {
                  return;
               }
            }

            var8 = var1.m();
            var10001 = 2;
         }

         var7 = ((Byte)var8) & var10001;
      }

      label118:
      if (var2 == null) {
         if (var7 == 0) {
            var7 = GLFW.glfwGetKey(
               lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .getWindow()
                  .handle(),
               341
            );
            if (var2 != null) {
               break label118;
            }

            if (var7 != 1) {
               var7 = GLFW.glfwGetKey(
                  lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     .getWindow()
                     .handle(),
                  345
               );
               if (var2 != null) {
                  break label118;
               }

               if (var7 != 1) {
                  var7 = 0;
                  break label118;
               }
            }
         }

         var7 = 1;
      }

      int var3;
      var3 = var7;
      var9 = var1.m() & 1;
      label107:
      if (var2 == null) {
         if ((me.octo.client.PxTruth.truth(var9))) {
            var9 = GLFW.glfwGetKey(
               lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .getWindow()
                  .handle(),
               340
            );
            if (var2 != null) {
               break label107;
            }

            if ((me.octo.client.PxTruth.truth(var9))) {
               var9 = GLFW.glfwGetKey(
                  lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     .getWindow()
                     .handle(),
                  344
               );
               if (var2 != null) {
                  break label107;
               }

               if ((me.octo.client.PxTruth.truth(var9))) {
                  var9 = 0;
                  break label107;
               }
            }
         }

         var9 = 1;
      }

      int var4;
      label96: {
         var4 =((Integer)( var9));
         int var10 = var3;
         if (var2 == null) {
            if (var3 != 0) {
               break label96;
            }

            var10 = var4;
         }

         if (var10 == 0) {
            return;
         }
      }

      String var11 = this.a();
      if (var11 != null) {
         String var5 = var11;
         var1.a(true);
         if (var2 == null) {
            if (var1.k() == 0) {
               label84: {
                  label83: {
                     int var12 = ((IIIlIlllllllIlIlIllIlIIIlIlIlIIIIIIllllIIIlIlIlIIIlIlllllIlIIllIIllllIlIIIllllIllllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                        .a()
                        .ae()) ? 1 : 0);
                     if (var2 == null) {
                        if (var12 != 0) {
                           break label83;
                        }

                        var12 = var4;
                     }

                     if (var12 == 0) {
                        var10000 = ((String[])(Object)(ChatFormatting.stripFormatting(var5)));
                        if (var10000 == null) {
                           var10000 = ((String[])(Object)(var5));
                        }
                        break label84;
                     }
                  }

                  var10000 = ((String[])(Object)(var5));
               }

               String var6 = String.valueOf(var10000);
               short var14 = 768;
               llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a(var6);
               short var16 = -19085;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                  "Copied chat message to clipboard!"
               );
               if (var2 == null) {
                  return;
               }
            }

            llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a(var5);
         }

         short var15 = 780;
         short var17 = -26334;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
            "Copied raw chat line to clipboard!"
         );
      }
   }

   private final String a() {
      try {
         var var1 = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
         var var2 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.gui;
         if (var2 == null) {
            return null;
         }
         var var3 = var2.getChat();
         if (var3 == null) {
            return null;
         }
         var var4 = (ChatComponentAccessor) var3;
         var var5 = new double[1];
         var var6 = new double[1];
         GLFW.glfwGetCursorPos(me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getWindow().handle(), var5, var6);
         double var7 = var5[0] * (double)me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getWindow().getGuiScaledWidth() / (double)me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getWindow().getScreenWidth();
         double var8 = var6[0] * (double)me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getWindow().getGuiScaledHeight() / (double)me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getWindow().getScreenHeight();
         double var9 = var4.invokeGetScale();
         if (var9 <= 0.0) {
            return null;
         }
         double var10 = var7 / var9 - 4.0;
         double var11 = ((double)me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getWindow().getGuiScaledHeight() - var8 - 40.0) / var9;
         if (var10 < 0.0) {
            return null;
         }
         if (var11 < 0.0) {
            return null;
         }
         int var12 = var4.invokeGetWidth();
         int var13 = var4.invokeGetHeight();
         if (var10 > (double)var12) {
            return null;
         }
         if (var11 > (double)var13) {
            return null;
         }
         int var14 = RangesKt.coerceAtLeast(var4.invokeGetLineHeight(), 1);
         int var15 = (int)(var11 / (double)var14) + var4.getChatScrollbarPos();
         if (var15 < 0) {
            return null;
         }
         var var16 = var4.getTrimmedMessages();
         if (var15 >= var16.size()) {
            return null;
         }
         return this.a(var16.get(var15));
      } catch (Throwable var17) {
         return null;
      }
   }

   private final String a(Object param1) {
      List var3 = java.util.Arrays.asList("content", "getContent", "text", "getText", "message", "getMessage", "string", "getString");
      for (Object var16 : var3) {
         String var5 = (String)var16;
         Method[] var8 = param1.getClass().getMethods();
         Intrinsics.checkNotNullExpressionValue(var8, "getMethods(...)");
         Method var6 = null;
         for (int var10 = 0; var10 < var8.length; var10++) {
            Method var13 = var8[var10];
            if (Intrinsics.areEqual(var13.getName(), var5) && var13.getParameterCount() == 0) {
               var6 = var13;
               break;
            }
         }
         if (var6 == null) {
            continue;
         }
         try {
            Object var7 = var6.invoke(param1, new Object[0]);
            if (var7 == null) {
               continue;
            }
            if (var7 instanceof String) {
               return (String)var7;
            }
            if (var7 instanceof Component) {
               return ((Component)var7).getString();
            }
            if (var7 instanceof FormattedCharSequence) {
               return this.a((FormattedCharSequence)var7);
            }
            return var7.toString();
         } catch (Exception var9) {
            continue;
         }
      }
      Field[] var4 = param1.getClass().getDeclaredFields();
      Intrinsics.checkNotNullExpressionValue(var4, "getDeclaredFields(...)");
      for (int var5i = 0; var5i < var4.length; var5i++) {
         Field var7f = var4[var5i];
         try {
            var7f.setAccessible(true);
            Object var8f = var7f.get(param1);
            if (var8f == null) {
               continue;
            }
            if (var8f instanceof String) {
               return (String)var8f;
            }
            if (var8f instanceof Component) {
               return ((Component)var8f).getString();
            }
            if (var8f instanceof FormattedCharSequence) {
               return this.a((FormattedCharSequence)var8f);
            }
         } catch (Exception var10f) {
            continue;
         }
      }
      return param1.toString();
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 8
      // 002: anewarray 89
      // 005: astore 4
      // 007: invokestatic me/octo/client/IIIlIlllllllIlIlIllIlIIIlIlIlIIIIIIllllIIIlIlIlIIIlIlllllIlIIllIIllllIlIIIllllIllllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()[Ljava/lang/String;
      // 00a: aload 4
      // 00c: bipush 0
      // 00d: sipush 770
      // 010: sipush 6496
      // 013: pop2
      // 014: ldc "content"
      // 016: aastore
      // 017: aload 4
      // 019: bipush 1
      // 01a: sipush 772
      // 01d: sipush -17078
      // 020: pop2
      // 021: ldc "getContent"
      // 023: aastore
      // 024: aload 4
      // 026: bipush 2
      // 027: sipush 773
      // 02a: sipush -7388
      // 02d: pop2
      // 02e: ldc "text"
      // 030: aastore
      // 031: aload 4
      // 033: bipush 3
      // 034: sipush 776
      // 037: sipush 15394
      // 03a: pop2
      // 03b: ldc "getText"
      // 03d: aastore
      // 03e: aload 4
      // 040: bipush 4
      // 041: sipush 775
      // 044: sipush -27270
      // 047: pop2
      // 048: ldc "message"
      // 04a: aastore
      // 04b: astore 2
      // 04c: aload 4
      // 04e: bipush 5
      // 04f: sipush 781
      // 052: sipush 32074
      // 055: pop2
      // 056: ldc "getMessage"
      // 058: aastore
      // 059: aload 4
      // 05b: bipush 6
      // 05d: sipush 778
      // 060: sipush -3791
      // 063: pop2
      // 064: ldc "string"
      // 066: aastore
      // 067: aload 4
      // 069: bipush 7
      // 06b: sipush 769
      // 06e: sipush -14841
      // 071: pop2
      // 072: ldc "getString"
      // 074: aastore
      // 075: aload 4
      // 077: invokestatic kotlin/collections/CollectionsKt.listOf ([Ljava/lang/Object;)Ljava/util/List;
      // 07a: astore 3
      // 07b: aload 3
      // 07c: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 081: astore 4
      // 083: aload 4
      // 085: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 08a: ifeq 1d1
      // 08d: aload 4
      // 08f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 094: checkcast java/lang/String
      // 097: astore 5
      // 099: aload 1
      // 09a: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 09d: invokevirtual java/lang/Class.getMethods ()[Ljava/lang/reflect/Method;
      // 0a0: dup
      // 0a1: sipush 783
      // 0a4: sipush 5982
      // 0a7: pop2
      // 0a8: ldc_w "getMethods(...)"
      // 0ab: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0ae: checkcast [Ljava/lang/Object;
      // 0b1: astore 8
      // 0b3: bipush 0
      // 0b4: istore 9
      // 0b6: bipush 0
      // 0b7: istore 10
      // 0b9: aload 8
      // 0bb: aload 2
      // 0bc: ifnonnull 1d2
      // 0bf: arraylength
      // 0c0: istore 11
      // 0c2: iload 10
      // 0c4: iload 11
      // 0c6: if_icmpge 128
      // 0c9: aload 8
      // 0cb: iload 10
      // 0cd: aaload
      // 0ce: astore 12
      // 0d0: aload 12
      // 0d2: checkcast java/lang/reflect/Method
      // 0d5: astore 13
      // 0d7: bipush 0
      // 0d8: istore 14
      // 0da: aload 13
      // 0dc: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 0df: aload 5
      // 0e1: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 0e4: aload 2
      // 0e5: ifnonnull 08a
      // 0e8: aload 2
      // 0e9: ifnonnull 102
      // 0ec: ifeq 114
      // 0ef: goto 0f6
      // 0f2: invokestatic me/octo/client/lIIlIIlllllIIllIlIllIllIIIIllIllllIIllIIllIllIlIIIIIllIllIIlIIIllIllIIIIlIIIIllllIIII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f5: athrow
      // 0f6: aload 13
      // 0f8: invokevirtual java/lang/reflect/Method.getParameterCount ()I
      // 0fb: goto 102
      // 0fe: invokestatic me/octo/client/lIIlIIlllllIIllIlIllIllIIIIllIllllIIllIIllIllIlIIIIIllIllIIlIIIllIllIIIIlIIIIllllIIII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 101: athrow
      // 102: aload 2
      // 103: ifnonnull 111
      // 106: ifne 114
      // 109: goto 110
      // 10c: invokestatic me/octo/client/lIIlIIlllllIIllIlIllIllIIIIllIllllIIllIIllIllIlIIIIIllIllIIlIIIllIllIIIIlIIIIllllIIII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10f: athrow
      // 110: bipush 1
      // 111: goto 115
      // 114: bipush 0
      // 115: ifeq 121
      // 118: aload 12
      // 11a: goto 129
      // 11d: invokestatic me/octo/client/lIIlIIlllllIIllIlIllIllIIIIllIllllIIllIIllIllIlIIIIIllIllIIlIIIllIllIIIIlIIIIllllIIII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 120: athrow
      // 121: iinc 10 1
      // 124: aload 2
      // 125: ifnull 0c2
      // 128: aconst_null
      // 129: checkcast java/lang/reflect/Method
      // 12c: dup
      // 12d: ifnonnull 138
      // 130: pop
      // 131: goto 083
      // 134: invokestatic me/octo/client/lIIlIIlllllIIllIlIllIllIIIIllIllllIIllIIllIllIlIIIIIllIllIIlIIIllIllIIIIlIIIIllllIIII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 137: athrow
      // 138: astore 6
      // 13a: nop
      // 13b: aload 2
      // 13c: ifnonnull 15c
      // 13f: aload 6
      // 141: aload 1
      // 142: bipush 0
      // 143: anewarray 4
      // 146: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 149: dup
      // 14a: ifnonnull 15f
      // 14d: goto 154
      // 150: invokestatic me/octo/client/lIIlIIlllllIIllIlIllIllIIIIllIllllIIllIIllIllIlIIIIIllIllIIlIIIllIllIIIIlIIIIllllIIII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 153: athrow
      // 154: pop
      // 155: goto 15c
      // 158: invokestatic me/octo/client/lIIlIIlllllIIllIlIllIllIIIIllIllllIIllIIllIllIlIIIIIllIllIIlIIIllIllIIIIlIIIIllllIIII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15b: athrow
      // 15c: goto 083
      // 15f: astore 7
      // 161: aload 7
      // 163: astore 8
      // 165: aload 8
      // 167: instanceof java/lang/String
      // 16a: aload 2
      // 16b: ifnonnull 187
      // 16e: ifeq 182
      // 171: goto 178
      // 174: invokestatic me/octo/client/lIIlIIlllllIIllIlIllIllIIIIllIllllIIllIIllIllIlIIIIIllIllIIlIIIllIllIIIIlIIIIllllIIII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 177: athrow
      // 178: aload 7
      // 17a: checkcast java/lang/String
      // 17d: areturn
      // 17e: invokestatic me/octo/client/lIIlIIlllllIIllIlIllIllIIIIllIllllIIllIIllIllIlIIIIIllIllIIlIIIllIllIIIIlIIIIllllIIII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 181: athrow
      // 182: aload 8
      // 184: instanceof net/minecraft/network/chat/Component
      // 187: aload 2
      // 188: ifnonnull 1b4
      // 18b: ifeq 1a4
      // 18e: goto 195
      // 191: invokestatic me/octo/client/lIIlIIlllllIIllIlIllIllIIIIllIllllIIllIIllIllIlIIIIIllIllIIlIIIllIllIIIIlIIIIllllIIII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 194: athrow
      // 195: aload 7
      // 197: checkcast net/minecraft/network/chat/Component
      // 19a: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 19f: areturn
      // 1a0: invokestatic me/octo/client/lIIlIIlllllIIllIlIllIllIIIIllIllllIIllIIllIllIlIIIIIllIllIIlIIIllIllIIIIlIIIIllllIIII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a3: athrow
      // 1a4: aload 8
      // 1a6: aload 2
      // 1a7: ifnonnull 1c7
      // 1aa: instanceof net/minecraft/util/FormattedCharSequence
      // 1ad: goto 1b4
      // 1b0: invokestatic me/octo/client/lIIlIIlllllIIllIlIllIllIIIIllIllllIIllIIllIllIlIIIIIllIllIIlIIIllIllIIIIlIIIIllllIIII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b3: athrow
      // 1b4: ifeq 1c5
      // 1b7: aload 0
      // 1b8: aload 7
      // 1ba: checkcast net/minecraft/util/FormattedCharSequence
      // 1bd: invokespecial me/octo/client/lIIlIIlllllIIllIlIllIllIIIIllIllllIIllIIllIllIlIIIIIllIllIIlIIIllIllIIIIlIIIIllllIIII.a (Lnet/minecraft/util/FormattedCharSequence;)Ljava/lang/String;
      // 1c0: areturn
      // 1c1: invokestatic me/octo/client/lIIlIIlllllIIllIlIllIllIIIIllIllllIIllIIllIllIlIIIIIllIllIIlIIIllIllIIIIlIIIIllllIIII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c4: athrow
      // 1c5: aload 7
      // 1c7: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 1ca: areturn
      // 1cb: astore 7
      // 1cd: aload 2
      // 1ce: ifnull 083
      // 1d1: aload 1
      // 1d2: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 1d5: invokevirtual java/lang/Class.getDeclaredFields ()[Ljava/lang/reflect/Field;
      // 1d8: dup
      // 1d9: sipush 782
      // 1dc: sipush 20816
      // 1df: pop2
      // 1e0: ldc_w "getDeclaredFields(...)"
      // 1e3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1e6: astore 4
      // 1e8: bipush 0
      // 1e9: istore 5
      // 1eb: aload 4
      // 1ed: arraylength
      // 1ee: istore 6
      // 1f0: iload 5
      // 1f2: iload 6
      // 1f4: if_icmpge 2aa
      // 1f7: aload 4
      // 1f9: iload 5
      // 1fb: aaload
      // 1fc: astore 7
      // 1fe: nop
      // 1ff: aload 7
      // 201: bipush 1
      // 202: invokevirtual java/lang/reflect/Field.setAccessible (Z)V
      // 205: aload 2
      // 206: ifnonnull 22d
      // 209: aload 7
      // 20b: aload 1
      // 20c: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 20f: aload 2
      // 210: ifnonnull 2ab
      // 213: goto 21a
      // 216: invokestatic me/octo/client/lIIlIIlllllIIllIlIllIllIIIIllIllllIIllIIllIllIlIIIIIllIllIIlIIIllIllIIIIlIIIIllllIIII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 219: athrow
      // 21a: dup
      // 21b: ifnonnull 230
      // 21e: goto 225
      // 221: invokestatic me/octo/client/lIIlIIlllllIIllIlIllIllIIIIllIllllIIllIIllIllIlIIIIIllIllIIlIIIllIllIIIIlIIIIllllIIII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 224: athrow
      // 225: pop
      // 226: goto 22d
      // 229: invokestatic me/octo/client/lIIlIIlllllIIllIlIllIllIIIIllIllllIIllIIllIllIlIIIIIllIllIIlIIIllIllIIIIlIIIIllllIIII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22c: athrow
      // 22d: goto 2a3
      // 230: astore 8
      // 232: aload 8
      // 234: astore 9
      // 236: aload 9
      // 238: instanceof java/lang/String
      // 23b: aload 2
      // 23c: ifnonnull 258
      // 23f: ifeq 253
      // 242: goto 249
      // 245: invokestatic me/octo/client/lIIlIIlllllIIllIlIllIllIIIIllIllllIIllIIllIllIlIIIIIllIllIIlIIIllIllIIIIlIIIIllllIIII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 248: athrow
      // 249: aload 8
      // 24b: checkcast java/lang/String
      // 24e: areturn
      // 24f: invokestatic me/octo/client/lIIlIIlllllIIllIlIllIllIIIIllIllllIIllIIllIllIlIIIIIllIllIIlIIIllIllIIIIlIIIIllllIIII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 252: athrow
      // 253: aload 9
      // 255: instanceof net/minecraft/network/chat/Component
      // 258: aload 2
      // 259: ifnonnull 27a
      // 25c: ifeq 275
      // 25f: goto 266
      // 262: invokestatic me/octo/client/lIIlIIlllllIIllIlIllIllIIIIllIllllIIllIIllIllIlIIIIIllIllIIlIIIllIllIIIIlIIIIllllIIII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 265: athrow
      // 266: aload 8
      // 268: checkcast net/minecraft/network/chat/Component
      // 26b: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 270: areturn
      // 271: invokestatic me/octo/client/lIIlIIlllllIIllIlIllIllIIIIllIllllIIllIIllIllIlIIIIIllIllIIlIIIllIllIIIIlIIIIllllIIII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 274: athrow
      // 275: aload 9
      // 277: instanceof net/minecraft/util/FormattedCharSequence
      // 27a: aload 2
      // 27b: ifnonnull 29b
      // 27e: ifeq 296
      // 281: goto 288
      // 284: invokestatic me/octo/client/lIIlIIlllllIIllIlIllIllIIIIllIllllIIllIIllIllIlIIIIIllIllIIlIIIllIllIIIIlIIIIllllIIII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 287: athrow
      // 288: aload 0
      // 289: aload 8
      // 28b: checkcast net/minecraft/util/FormattedCharSequence
      // 28e: invokespecial me/octo/client/lIIlIIlllllIIllIlIllIllIIIIllIllllIIllIIllIllIlIIIIIllIllIIlIIIllIllIIIIlIIIIllllIIII.a (Lnet/minecraft/util/FormattedCharSequence;)Ljava/lang/String;
      // 291: areturn
      // 292: invokestatic me/octo/client/lIIlIIlllllIIllIlIllIllIIIIllIllllIIllIIllIllIlIIIIIllIllIIlIIIllIllIIIIlIIIIllllIIII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 295: athrow
      // 296: aload 9
      // 298: instanceof net/minecraft/network/chat/Style
      // 29b: ifeq 2a3
      // 29e: goto 2a3
      // 2a1: astore 8
      // 2a3: iinc 5 1
      // 2a6: aload 2
      // 2a7: ifnull 1f0
      // 2aa: aload 1
      // 2ab: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 2ae: areturn
   }

   private final String a(FormattedCharSequence var1) {
      StringBuilder var2 = new StringBuilder();
      var1.accept((p0, p1, p2) -> a(var2, p0, p1, p2));
      String var10000 = var2.toString();
      short var10002 = 771;
      short var10003 = -7567;
      Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
      return var10000;
   }

   private static final boolean a(StringBuilder var0, int var1, Style var2, int var3) {
      short var10001 = 777;
      short var10002 = -11170;
      Intrinsics.checkNotNullParameter(var2, "<unused var>");
      var0.appendCodePoint(var3);
      return true;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[16];
      int var3 = 0;
      String var2 = "ººx\u0080ß'-\u0005Mô\u0099%\"\u0004Ú1Eö\nÈzz¨v\u001dÆúµ~\rqØ\u001b\u0080\u0084Î<eõ\u0095ÐÛ\u0095\u0007\u0006`=\u0097Í+ú\tP¶i!\u000f\"\u008c\u0089K!¨cÒêí0ª\u0012à°`×ÖEöë>jC«+¡FIíãa¤¢\"8\u0000¶\u000fq\u009fM\u001a\u009a\u009e\fÙyV\u0082U\u001e\u0091\u009e\u0016ñ×]\u001a\u0098¡HÅc\fY¢çAK|g\"s\nU\u001c\nÈºz¾|\rËBúü\"Õ«}ó\u0018\u0013\u0014g>;Ç1ù¶±B<h¤aé\u000e\u008f\u0087}\u0014\u0084í)Uö7[¶\bB'+h\u001dC\u00985\u0006b\u0080¿î\t³";
      int var4 = "ººx\u0080ß'-\u0005Mô\u0099%\"\u0004Ú1Eö\nÈzz¨v\u001dÆúµ~\rqØ\u001b\u0080\u0084Î<eõ\u0095ÐÛ\u0095\u0007\u0006`=\u0097Í+ú\tP¶i!\u000f\"\u008c\u0089K!¨cÒêí0ª\u0012à°`×ÖEöë>jC«+¡FIíãa¤¢\"8\u0000¶\u000fq\u009fM\u001a\u009a\u009e\fÙyV\u0082U\u001e\u0091\u009e\u0016ñ×]\u001a\u0098¡HÅc\fY¢çAK|g\"s\nU\u001c\nÈºz¾|\rËBúü\"Õ«}ó\u0018\u0013\u0014g>;Ç1ù¶±B<h¤aé\u000e\u008f\u0087}\u0014\u0084í)Uö7[¶\bB'+h\u001dC\u00985\u0006b\u0080¿î\t³"
         .length();
      char var1 = 7;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 103;
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
                     case 0 -> 121;
                     case 1 -> 92;
                     case 2 -> 56;
                     case 3 -> 109;
                     case 4 -> 32;
                     case 5 -> 107;
                     default -> 113;
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
                     b = new String[16];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIIlIIlllllIIllIlIllIllIIIIllIllllIIllIIllIllIlIIIIIllIllIIlIIIllIllIIIIlIIIIllllIIII();
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

                  var2 = "i\u008f¿éP\u0015V\u000fvã²x\u0007§îLöaî´";
                  var4 = "i\u008f¿éP\u0015V\u000fvã²x\u0007§îLöaî´".length();
                  var1 = '\f';
                  var8 = -1;
            }

            var10000 = 18;
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
      int var2 = (var0 ^ 775) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 82;
            case 1 -> 205;
            case 2 -> 32;
            case 3 -> 230;
            case 4 -> 17;
            case 5 -> 79;
            case 6 -> 101;
            case 7 -> 27;
            case 8 -> 193;
            case 9 -> 13;
            case 10 -> 110;
            case 11 -> 121;
            case 12 -> 22;
            case 13 -> 37;
            case 14 -> 238;
            case 15 -> 208;
            case 16 -> 254;
            case 17 -> 215;
            case 18 -> 176;
            case 19 -> 92;
            case 20 -> 234;
            case 21 -> 188;
            case 22 -> 243;
            case 23 -> 226;
            case 24 -> 229;
            case 25 -> 228;
            case 26 -> 210;
            case 27 -> 239;
            case 28 -> 217;
            case 29 -> 137;
            case 30 -> 218;
            case 31 -> 251;
            case 32 -> 185;
            case 33 -> 144;
            case 34 -> 84;
            case 35 -> 54;
            case 36 -> 97;
            case 37 -> 6;
            case 38 -> 187;
            case 39 -> 106;
            case 40 -> 45;
            case 41 -> 149;
            case 42 -> 237;
            case 43 -> 70;
            case 44 -> 111;
            case 45 -> 67;
            case 46 -> 29;
            case 47 -> 221;
            case 48 -> 196;
            case 49 -> 167;
            case 50 -> 39;
            case 51 -> 56;
            case 52 -> 165;
            case 53 -> 73;
            case 54 -> 91;
            case 55 -> 184;
            case 56 -> 150;
            case 57 -> 219;
            case 58 -> 191;
            case 59 -> 0;
            case 60 -> 255;
            case 61 -> 233;
            case 62 -> 242;
            case 63 -> 36;
            case 64 -> 225;
            case 65 -> 140;
            case 66 -> 186;
            case 67 -> 214;
            case 68 -> 128;
            case 69 -> 49;
            case 70 -> 173;
            case 71 -> 93;
            case 72 -> 75;
            case 73 -> 89;
            case 74 -> 127;
            case 75 -> 98;
            case 76 -> 31;
            case 77 -> 52;
            case 78 -> 222;
            case 79 -> 204;
            case 80 -> 252;
            case 81 -> 8;
            case 82 -> 40;
            case 83 -> 112;
            case 84 -> 71;
            case 85 -> 35;
            case 86 -> 146;
            case 87 -> 115;
            case 88 -> 132;
            case 89 -> 55;
            case 90 -> 68;
            case 91 -> 88;
            case 92 -> 60;
            case 93 -> 118;
            case 94 -> 158;
            case 95 -> 30;
            case 96 -> 48;
            case 97 -> 78;
            case 98 -> 21;
            case 99 -> 169;
            case 100 -> 57;
            case 101 -> 94;
            case 102 -> 43;
            case 103 -> 231;
            case 104 -> 211;
            case 105 -> 227;
            case 106 -> 246;
            case 107 -> 100;
            case 108 -> 253;
            case 109 -> 58;
            case 110 -> 105;
            case 111 -> 86;
            case 112 -> 235;
            case 113 -> 26;
            case 114 -> 245;
            case 115 -> 14;
            case 116 -> 236;
            case 117 -> 83;
            case 118 -> 141;
            case 119 -> 195;
            case 120 -> 156;
            case 121 -> 44;
            case 122 -> 104;
            case 123 -> 63;
            case 124 -> 34;
            case 125 -> 179;
            case 126 -> 80;
            case 127 -> 241;
            case 128 -> 95;
            case 129 -> 189;
            case 130 -> 18;
            case 131 -> 240;
            case 132 -> 142;
            case 133 -> 209;
            case 134 -> 201;
            case 135 -> 125;
            case 136 -> 248;
            case 137 -> 223;
            case 138 -> 183;
            case 139 -> 199;
            case 140 -> 220;
            case 141 -> 113;
            case 142 -> 244;
            case 143 -> 61;
            case 144 -> 147;
            case 145 -> 81;
            case 146 -> 174;
            case 147 -> 123;
            case 148 -> 232;
            case 149 -> 117;
            case 150 -> 28;
            case 151 -> 135;
            case 152 -> 224;
            case 153 -> 180;
            case 154 -> 19;
            case 155 -> 64;
            case 156 -> 131;
            case 157 -> 170;
            case 158 -> 46;
            case 159 -> 138;
            case 160 -> 10;
            case 161 -> 192;
            case 162 -> 11;
            case 163 -> 20;
            case 164 -> 177;
            case 165 -> 87;
            case 166 -> 4;
            case 167 -> 99;
            case 168 -> 194;
            case 169 -> 143;
            case 170 -> 162;
            case 171 -> 250;
            case 172 -> 171;
            case 173 -> 9;
            case 174 -> 198;
            case 175 -> 129;
            case 176 -> 163;
            case 177 -> 164;
            case 178 -> 160;
            case 179 -> 151;
            case 180 -> 166;
            case 181 -> 178;
            case 182 -> 126;
            case 183 -> 12;
            case 184 -> 42;
            case 185 -> 1;
            case 186 -> 182;
            case 187 -> 102;
            case 188 -> 77;
            case 189 -> 90;
            case 190 -> 130;
            case 191 -> 172;
            case 192 -> 148;
            case 193 -> 65;
            case 194 -> 122;
            case 195 -> 38;
            case 196 -> 116;
            case 197 -> 247;
            case 198 -> 249;
            case 199 -> 157;
            case 200 -> 108;
            case 201 -> 152;
            case 202 -> 206;
            case 203 -> 154;
            case 204 -> 119;
            case 205 -> 212;
            case 206 -> 66;
            case 207 -> 120;
            case 208 -> 159;
            case 209 -> 103;
            case 210 -> 139;
            case 211 -> 161;
            case 212 -> 114;
            case 213 -> 168;
            case 214 -> 153;
            case 215 -> 51;
            case 216 -> 203;
            case 217 -> 62;
            case 218 -> 59;
            case 219 -> 133;
            case 220 -> 181;
            case 221 -> 175;
            case 222 -> 69;
            case 223 -> 33;
            case 224 -> 53;
            case 225 -> 197;
            case 226 -> 16;
            case 227 -> 207;
            case 228 -> 76;
            case 229 -> 155;
            case 230 -> 216;
            case 231 -> 134;
            case 232 -> 5;
            case 233 -> 213;
            case 234 -> 25;
            case 235 -> 96;
            case 236 -> 190;
            case 237 -> 24;
            case 238 -> 3;
            case 239 -> 200;
            case 240 -> 15;
            case 241 -> 202;
            case 242 -> 85;
            case 243 -> 145;
            case 244 -> 50;
            case 245 -> 136;
            case 246 -> 41;
            case 247 -> 109;
            case 248 -> 47;
            case 249 -> 23;
            case 250 -> 124;
            case 251 -> 2;
            case 252 -> 7;
            case 253 -> 107;
            case 254 -> 72;
            default -> 74;
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
