package me.octo.client;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import net.minecraft.client.player.LocalPlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private final List<lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private long lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private static lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;

   // PX-FIX TOP5F: jar public static final me.octo.client.lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll ag() { return IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl; }
   public static final me.octo.client.lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll ag() {
      return IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   }
   private static String[] f;
   private static String[] g;

   private lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll() {
      short var10001 = 12931;
      short var10002 = -6920;
      var10002 = 12958;
      short var10003 = 27597;
      short var10004 = 12930;
      short var10005 = 32507;
      super(
         "Reaction Recorder",
         "Records full reaction patterns (rotations + movement) for analysis",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
         "Dev Modules",
         new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[0]
      );
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new ArrayList<>();
   }

   public void aB() {
      short var10000 = 12936;
      super.aB();
      short var10001 = -7846;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.clear();
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = System.nanoTime();
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
         "§aStarted recording reaction pattern"
      );
      var10000 = 12937;
      var10001 = 3045;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§7Disable module to save recording");
   }

   public void aC() {
      int var10000 = me.octo.client.lIIlllllllIlIlIIlIIlllIIIIIIIllIIIlIIIIIIlIlIIlIIIIIllIIIllIlIIIIIllllIlllllllIllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      super.aC();
      int var1 = var10000;
      if (var1 != 0) {
         if (!this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.isEmpty()) {
            long var4 = System.currentTimeMillis();
            short var6 = 12938;
            short var10002 = 26541;
            var10002 = 12941;
            short var10003 = 25388;
            String var2 = "reaction-" + var4 + ".json";
            this.e(var2);
            var10000 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.size();
            var10002 = 12956;
            var10003 = 25153;
            var10003 = 12959;
            short var10004 = 18297;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "§aSaved §e" + var10000 + " §aframes to §e" + var2
            );
            this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.clear();
            return;
         }

         short var3 = 12934;
         short var10001 = -4576;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§cNo data recorded!");
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII event) {
      // PX-R999: reconstructed from javap -c (315 instructions). Samples yaw/pitch/position, the time
      // since the previous sample and the five movement keys into the reaction recorder list.
      // The obfuscation guard probe is omitted: this class's guard holder exposes no accessor in the
      // rebuild and the guarded branch only short-circuits to `return` (no-op path).
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
      net.minecraft.client.player.LocalPlayer var1 = this.ap().player;
      if (var1 == null) {
         return;
      }
      me.octo.client.lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var2 =
         new me.octo.client.lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1.getYRot(),
            var1.getXRot(),
            System.nanoTime() - this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll,
            var1.getX(),
            var1.getY(),
            var1.getZ(),
            this.ap().options.keyUp.isDown(),
            this.ap().options.keyDown.isDown(),
            this.ap().options.keyLeft.isDown(),
            this.ap().options.keyRight.isDown(),
            this.ap().options.keyShift.isDown());
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.add(var2);
   }

   private final void e(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/lIIlllllllIlIlIIlIIlllIIIIIIIllIIIlIIIIIIlIlIIlIIIIIllIIIllIlIIIIIllllIlllllllIllIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d ()I
      // 003: new java/io/File
      // 006: dup
      // 007: sipush 12929
      // 00a: sipush 29393
      // 00d: pop2
      // 00e: ldc "run/polinex/reaction_recordings"
      // 010: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 013: astore 3
      // 014: istore 2
      // 015: aload 3
      // 016: iload 2
      // 017: ifeq 03c
      // 01a: invokevirtual java/io/File.exists ()Z
      // 01d: ifne 033
      // 020: goto 027
      // 023: invokestatic me/octo/client/lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 026: athrow
      // 027: aload 3
      // 028: invokevirtual java/io/File.mkdirs ()Z
      // 02b: pop
      // 02c: goto 033
      // 02f: invokestatic me/octo/client/lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 032: athrow
      // 033: new java/io/File
      // 036: dup
      // 037: aload 3
      // 038: aload 1
      // 039: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 03c: astore 4
      // 03e: new com/google/gson/JsonObject
      // 041: dup
      // 042: invokespecial com/google/gson/JsonObject.<init> ()V
      // 045: astore 5
      // 047: aload 5
      // 049: sipush 12952
      // 04c: sipush -29275
      // 04f: pop2
      // 050: ldc "session_name"
      // 052: sipush 12944
      // 055: sipush -13689
      // 058: pop2
      // 059: ldc "reaction"
      // 05b: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 05e: aload 5
      // 060: sipush 12955
      // 063: sipush -26014
      // 066: pop2
      // 067: ldc "duration_ms"
      // 069: aload 0
      // 06a: getfield me/octo/client/lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Ljava/util/List;
      // 06d: invokestatic kotlin/collections/CollectionsKt.last (Ljava/util/List;)Ljava/lang/Object;
      // 070: checkcast me/octo/client/lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
      // 073: invokevirtual me/octo/client/lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c ()J
      // 076: l2d
      // 077: ldc2_w 1000000.0
      // 07a: ddiv
      // 07b: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 07e: checkcast java/lang/Number
      // 081: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Number;)V
      // 084: aload 5
      // 086: sipush 12928
      // 089: sipush 25783
      // 08c: pop2
      // 08d: ldc_w "frame_count"
      // 090: aload 0
      // 091: getfield me/octo/client/lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Ljava/util/List;
      // 094: invokeinterface java/util/List.size ()I 1
      // 099: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 09c: checkcast java/lang/Number
      // 09f: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Number;)V
      // 0a2: new com/google/gson/JsonArray
      // 0a5: dup
      // 0a6: invokespecial com/google/gson/JsonArray.<init> ()V
      // 0a9: astore 6
      // 0ab: aload 0
      // 0ac: getfield me/octo/client/lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Ljava/util/List;
      // 0af: checkcast java/lang/Iterable
      // 0b2: astore 7
      // 0b4: bipush 0
      // 0b5: istore 8
      // 0b7: aload 7
      // 0b9: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 0be: astore 9
      // 0c0: aload 9
      // 0c2: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0c7: ifeq 14f
      // 0ca: aload 9
      // 0cc: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0d1: astore 10
      // 0d3: aload 10
      // 0d5: checkcast me/octo/client/lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
      // 0d8: astore 11
      // 0da: bipush 0
      // 0db: istore 12
      // 0dd: new com/google/gson/JsonObject
      // 0e0: dup
      // 0e1: invokespecial com/google/gson/JsonObject.<init> ()V
      // 0e4: astore 13
      // 0e6: aload 13
      // 0e8: sipush 12935
      // 0eb: sipush 135
      // 0ee: pop2
      // 0ef: ldc_w "yaw"
      // 0f2: aload 11
      // 0f4: invokevirtual me/octo/client/lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()F
      // 0f7: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 0fa: checkcast java/lang/Number
      // 0fd: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Number;)V
      // 100: aload 13
      // 102: sipush 12942
      // 105: sipush -24913
      // 108: pop2
      // 109: ldc_w "pitch"
      // 10c: aload 11
      // 10e: invokevirtual me/octo/client/lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b ()F
      // 111: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 114: checkcast java/lang/Number
      // 117: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Number;)V
      // 11a: aload 13
      // 11c: sipush 12954
      // 11f: sipush 5911
      // 122: pop2
      // 123: ldc_w "time"
      // 126: aload 11
      // 128: invokevirtual me/octo/client/lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c ()J
      // 12b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12e: checkcast java/lang/Number
      // 131: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Number;)V
      // 134: aload 6
      // 136: aload 13
      // 138: checkcast com/google/gson/JsonElement
      // 13b: invokevirtual com/google/gson/JsonArray.add (Lcom/google/gson/JsonElement;)V
      // 13e: nop
      // 13f: nop
      // 140: iload 2
      // 141: ifeq 164
      // 144: iload 2
      // 145: ifne 0c0
      // 148: goto 14f
      // 14b: invokestatic me/octo/client/lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14e: athrow
      // 14f: nop
      // 150: aload 5
      // 152: sipush 12947
      // 155: sipush -8753
      // 158: pop2
      // 159: ldc_w "rotations"
      // 15c: aload 6
      // 15e: checkcast com/google/gson/JsonElement
      // 161: invokevirtual com/google/gson/JsonObject.add (Ljava/lang/String;Lcom/google/gson/JsonElement;)V
      // 164: new com/google/gson/JsonArray
      // 167: dup
      // 168: invokespecial com/google/gson/JsonArray.<init> ()V
      // 16b: astore 7
      // 16d: aload 0
      // 16e: getfield me/octo/client/lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Ljava/util/List;
      // 171: checkcast java/lang/Iterable
      // 174: astore 8
      // 176: bipush 0
      // 177: istore 9
      // 179: aload 8
      // 17b: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 180: astore 10
      // 182: aload 10
      // 184: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 189: ifeq 289
      // 18c: aload 10
      // 18e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 193: astore 11
      // 195: aload 11
      // 197: checkcast me/octo/client/lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
      // 19a: astore 12
      // 19c: bipush 0
      // 19d: istore 13
      // 19f: new com/google/gson/JsonObject
      // 1a2: dup
      // 1a3: invokespecial com/google/gson/JsonObject.<init> ()V
      // 1a6: astore 14
      // 1a8: aload 14
      // 1aa: sipush 12940
      // 1ad: sipush 23255
      // 1b0: pop2
      // 1b1: ldc_w "time"
      // 1b4: aload 12
      // 1b6: invokevirtual me/octo/client/lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c ()J
      // 1b9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1bc: checkcast java/lang/Number
      // 1bf: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Number;)V
      // 1c2: aload 14
      // 1c4: ldc_w "x"
      // 1c7: aload 12
      // 1c9: invokevirtual me/octo/client/lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d ()D
      // 1cc: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 1cf: checkcast java/lang/Number
      // 1d2: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Number;)V
      // 1d5: aload 14
      // 1d7: ldc_w "y"
      // 1da: aload 12
      // 1dc: invokevirtual me/octo/client/lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.e ()D
      // 1df: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 1e2: checkcast java/lang/Number
      // 1e5: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Number;)V
      // 1e8: aload 14
      // 1ea: ldc_w "z"
      // 1ed: aload 12
      // 1ef: invokevirtual me/octo/client/lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.f ()D
      // 1f2: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 1f5: checkcast java/lang/Number
      // 1f8: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Number;)V
      // 1fb: aload 14
      // 1fd: sipush 12949
      // 200: sipush 26226
      // 203: pop2
      // 204: ldc_w "forward"
      // 207: aload 12
      // 209: invokevirtual me/octo/client/lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g ()Z
      // 20c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 20f: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Boolean;)V
      // 212: aload 14
      // 214: sipush 12948
      // 217: sipush 15104
      // 21a: pop2
      // 21b: ldc_w "back"
      // 21e: aload 12
      // 220: invokevirtual me/octo/client/lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.h ()Z
      // 223: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 226: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Boolean;)V
      // 229: aload 14
      // 22b: sipush 12933
      // 22e: sipush -7598
      // 231: pop2
      // 232: ldc_w "left"
      // 235: aload 12
      // 237: invokevirtual me/octo/client/lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.i ()Z
      // 23a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 23d: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Boolean;)V
      // 240: aload 14
      // 242: sipush 12932
      // 245: sipush -26700
      // 248: pop2
      // 249: ldc_w "right"
      // 24c: aload 12
      // 24e: invokevirtual me/octo/client/lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.j ()Z
      // 251: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 254: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Boolean;)V
      // 257: aload 14
      // 259: sipush 12953
      // 25c: sipush 4938
      // 25f: pop2
      // 260: ldc_w "sneaking"
      // 263: aload 12
      // 265: invokevirtual me/octo/client/lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.k ()Z
      // 268: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 26b: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Boolean;)V
      // 26e: aload 7
      // 270: aload 14
      // 272: checkcast com/google/gson/JsonElement
      // 275: invokevirtual com/google/gson/JsonArray.add (Lcom/google/gson/JsonElement;)V
      // 278: nop
      // 279: nop
      // 27a: iload 2
      // 27b: ifeq 29e
      // 27e: iload 2
      // 27f: ifne 182
      // 282: goto 289
      // 285: invokestatic me/octo/client/lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 288: athrow
      // 289: nop
      // 28a: aload 5
      // 28c: sipush 12943
      // 28f: sipush 13372
      // 292: pop2
      // 293: ldc_w "movement"
      // 296: aload 7
      // 298: checkcast com/google/gson/JsonElement
      // 29b: invokevirtual com/google/gson/JsonObject.add (Ljava/lang/String;Lcom/google/gson/JsonElement;)V
      // 29e: new com/google/gson/GsonBuilder
      // 2a1: dup
      // 2a2: invokespecial com/google/gson/GsonBuilder.<init> ()V
      // 2a5: invokevirtual com/google/gson/GsonBuilder.setPrettyPrinting ()Lcom/google/gson/GsonBuilder;
      // 2a8: invokevirtual com/google/gson/GsonBuilder.create ()Lcom/google/gson/Gson;
      // 2ab: astore 8
      // 2ad: new java/io/FileWriter
      // 2b0: dup
      // 2b1: aload 4
      // 2b3: invokespecial java/io/FileWriter.<init> (Ljava/io/File;)V
      // 2b6: checkcast java/io/Closeable
      // 2b9: astore 9
      // 2bb: aconst_null
      // 2bc: astore 10
      // 2be: nop
      // 2bf: aload 9
      // 2c1: checkcast java/io/FileWriter
      // 2c4: astore 11
      // 2c6: bipush 0
      // 2c7: istore 12
      // 2c9: aload 8
      // 2cb: aload 5
      // 2cd: checkcast com/google/gson/JsonElement
      // 2d0: aload 11
      // 2d2: checkcast java/lang/Appendable
      // 2d5: invokevirtual com/google/gson/Gson.toJson (Lcom/google/gson/JsonElement;Ljava/lang/Appendable;)V
      // 2d8: nop
      // 2d9: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 2dc: astore 11
      // 2de: aload 9
      // 2e0: aload 10
      // 2e2: invokestatic kotlin/io/CloseableKt.closeFinally (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 2e5: goto 2fd
      // 2e8: astore 12
      // 2ea: aload 12
      // 2ec: astore 10
      // 2ee: aload 12
      // 2f0: athrow
      // 2f1: astore 12
      // 2f3: aload 9
      // 2f5: aload 10
      // 2f7: invokestatic kotlin/io/CloseableKt.closeFinally (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 2fa: aload 12
      // 2fc: athrow
      // 2fd: new java/io/File
      // 300: dup
      // 301: aload 3
      // 302: aload 1
      // 303: sipush 12957
      // 306: sipush -17673
      // 309: pop2
      // 30a: ldc_w "rotations_only_"
      // 30d: swap
      // 30e: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 313: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 316: astore 9
      // 318: new com/google/gson/JsonArray
      // 31b: dup
      // 31c: invokespecial com/google/gson/JsonArray.<init> ()V
      // 31f: astore 10
      // 321: aload 0
      // 322: getfield me/octo/client/lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Ljava/util/List;
      // 325: checkcast java/lang/Iterable
      // 328: astore 11
      // 32a: bipush 0
      // 32b: istore 12
      // 32d: aload 11
      // 32f: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 334: astore 13
      // 336: aload 13
      // 338: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 33d: ifeq 3c5
      // 340: aload 13
      // 342: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 347: astore 14
      // 349: aload 14
      // 34b: checkcast me/octo/client/lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
      // 34e: astore 15
      // 350: bipush 0
      // 351: istore 16
      // 353: new com/google/gson/JsonObject
      // 356: dup
      // 357: invokespecial com/google/gson/JsonObject.<init> ()V
      // 35a: astore 17
      // 35c: aload 17
      // 35e: sipush 12939
      // 361: sipush 11615
      // 364: pop2
      // 365: ldc_w "yaw"
      // 368: aload 15
      // 36a: invokevirtual me/octo/client/lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()F
      // 36d: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 370: checkcast java/lang/Number
      // 373: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Number;)V
      // 376: aload 17
      // 378: sipush 12946
      // 37b: sipush -3407
      // 37e: pop2
      // 37f: ldc_w "pitch"
      // 382: aload 15
      // 384: invokevirtual me/octo/client/lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b ()F
      // 387: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 38a: checkcast java/lang/Number
      // 38d: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Number;)V
      // 390: aload 17
      // 392: sipush 12940
      // 395: sipush 23255
      // 398: pop2
      // 399: ldc_w "time"
      // 39c: aload 15
      // 39e: invokevirtual me/octo/client/lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c ()J
      // 3a1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3a4: checkcast java/lang/Number
      // 3a7: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Number;)V
      // 3aa: aload 10
      // 3ac: aload 17
      // 3ae: checkcast com/google/gson/JsonElement
      // 3b1: invokevirtual com/google/gson/JsonArray.add (Lcom/google/gson/JsonElement;)V
      // 3b4: nop
      // 3b5: nop
      // 3b6: iload 2
      // 3b7: ifeq 3c6
      // 3ba: iload 2
      // 3bb: ifne 336
      // 3be: goto 3c5
      // 3c1: invokestatic me/octo/client/lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c4: athrow
      // 3c5: nop
      // 3c6: new java/io/FileWriter
      // 3c9: dup
      // 3ca: aload 9
      // 3cc: invokespecial java/io/FileWriter.<init> (Ljava/io/File;)V
      // 3cf: checkcast java/io/Closeable
      // 3d2: astore 11
      // 3d4: aconst_null
      // 3d5: astore 12
      // 3d7: nop
      // 3d8: aload 11
      // 3da: checkcast java/io/FileWriter
      // 3dd: astore 13
      // 3df: bipush 0
      // 3e0: istore 14
      // 3e2: aload 8
      // 3e4: aload 10
      // 3e6: checkcast com/google/gson/JsonElement
      // 3e9: aload 13
      // 3eb: checkcast java/lang/Appendable
      // 3ee: invokevirtual com/google/gson/Gson.toJson (Lcom/google/gson/JsonElement;Ljava/lang/Appendable;)V
      // 3f1: nop
      // 3f2: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 3f5: astore 13
      // 3f7: aload 11
      // 3f9: aload 12
      // 3fb: invokestatic kotlin/io/CloseableKt.closeFinally (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 3fe: goto 416
      // 401: astore 14
      // 403: aload 14
      // 405: astore 12
      // 407: aload 14
      // 409: athrow
      // 40a: astore 14
      // 40c: aload 11
      // 40e: aload 12
      // 410: invokestatic kotlin/io/CloseableKt.closeFinally (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 413: aload 14
      // 415: athrow
      // 416: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[30];
      int var3 = 0;
      String var2 = "!^\u009b&ÇìÚ\u0090\u0015Dì%b\u0019e\u0015Fð\u0007=\u0002²ÍCTâ¿m\u0001®Ú\u000b\u008e^B8\"\u009cd;à4\u0099âFÇ¶\u0088q\u0015Âr60¯¡\u008fÞà`\u008b@&é\u0080Ï½ 6~E\tmÆO¦<\u0012\t<^\u0003\u009f·m\u0004\u0094\bºô\u0005-\"\u0082ØÏ\u0005òúë¬\u0003\bÙÑ2\t\u007f-ZL\u000b×6\u008eC\u0015W\u0013eÈÿb\u001fhÌà¹#2mùò¡Q>\u008fsø\u0014\u00990J\u008c\u008f\u0014ðblÝËõ«M\u001a\u000bâFYõ2UÝ\tï »\u00115\u001c`ýÙyµQÄd\r\u001b§\u0005F)í\u0005G{\f\u0097\u0092\u0004ª\u0011mK\u0013ô`<¸ÌQÇâ\u00049k\u008a\u0092ì{«\u0089-5\u0003¾+I\f\\`ZbÓ\u009eKZt!\u0094à\bÙ\u000fü÷ÑzI8\u0004\u008b\u0094Yg\u000b±j\u0013#ÆàVbÇ=ë\n\u00961mÞ\u000eS\u0006×_\u0004\u000f¨øâ(>\u0081IN\b\u008a§gº-½Bò!\u009aVÂ\u008c\f\r*OW²\u008bÞdV\u0099'¹Ñ\u0006ÌÃc¦¹ë¤\u008e\u000bí\u0080\u0007ò³é(¦D\u0012ÙÚY\u008f·n¬\u008a[©\u00157üÐUJ&;&ù\u0004P¯Ì\u001aH\u000f\u00834\u008ag\u0082\u0087\u001a\u008c Ç¹_MÕ¼\bJ\u001c«ý y\u009aQ\u0005\u0086\u008fÃó)\u0005\u0097KG\u009a\u0096\t\u0084\u0089g\u0006\u008eD_öÊ";
      int var4 = "!^\u009b&ÇìÚ\u0090\u0015Dì%b\u0019e\u0015Fð\u0007=\u0002²ÍCTâ¿m\u0001®Ú\u000b\u008e^B8\"\u009cd;à4\u0099âFÇ¶\u0088q\u0015Âr60¯¡\u008fÞà`\u008b@&é\u0080Ï½ 6~E\tmÆO¦<\u0012\t<^\u0003\u009f·m\u0004\u0094\bºô\u0005-\"\u0082ØÏ\u0005òúë¬\u0003\bÙÑ2\t\u007f-ZL\u000b×6\u008eC\u0015W\u0013eÈÿb\u001fhÌà¹#2mùò¡Q>\u008fsø\u0014\u00990J\u008c\u008f\u0014ðblÝËõ«M\u001a\u000bâFYõ2UÝ\tï »\u00115\u001c`ýÙyµQÄd\r\u001b§\u0005F)í\u0005G{\f\u0097\u0092\u0004ª\u0011mK\u0013ô`<¸ÌQÇâ\u00049k\u008a\u0092ì{«\u0089-5\u0003¾+I\f\\`ZbÓ\u009eKZt!\u0094à\bÙ\u000fü÷ÑzI8\u0004\u008b\u0094Yg\u000b±j\u0013#ÆàVbÇ=ë\n\u00961mÞ\u000eS\u0006×_\u0004\u000f¨øâ(>\u0081IN\b\u008a§gº-½Bò!\u009aVÂ\u008c\f\r*OW²\u008bÞdV\u0099'¹Ñ\u0006ÌÃc¦¹ë¤\u008e\u000bí\u0080\u0007ò³é(¦D\u0012ÙÚY\u008f·n¬\u008a[©\u00157üÐUJ&;&ù\u0004P¯Ì\u001aH\u000f\u00834\u008ag\u0082\u0087\u001a\u008c Ç¹_MÕ¼\bJ\u001c«ý y\u009aQ\u0005\u0086\u008fÃó)\u0005\u0097KG\u009a\u0096\t\u0084\u0089g\u0006\u008eD_öÊ"
         .length();
      char var1 = '$';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 31;
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
                     case 0 -> 3;
                     case 1 -> 1;
                     case 2 -> 35;
                     case 3 -> 8;
                     case 4 -> 116;
                     case 5 -> 93;
                     default -> 105;
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
                     f = var5;
                     g = new String[30];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll();
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

                  var2 = "V\u001c*c\u0007\u008b´\u0004¥#íD";
                  var4 = "V\u001c*c\u0007\u008b´\u0004¥#íD".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 15;
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
      int var2 = (var0 ^ 12936) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 50;
            case 1 -> 68;
            case 2 -> 142;
            case 3 -> 206;
            case 4 -> 118;
            case 5 -> 35;
            case 6 -> 28;
            case 7 -> 155;
            case 8 -> 15;
            case 9 -> 43;
            case 10 -> 214;
            case 11 -> 12;
            case 12 -> 147;
            case 13 -> 162;
            case 14 -> 22;
            case 15 -> 104;
            case 16 -> 160;
            case 17 -> 38;
            case 18 -> 16;
            case 19 -> 174;
            case 20 -> 166;
            case 21 -> 161;
            case 22 -> 194;
            case 23 -> 163;
            case 24 -> 222;
            case 25 -> 7;
            case 26 -> 173;
            case 27 -> 230;
            case 28 -> 132;
            case 29 -> 122;
            case 30 -> 183;
            case 31 -> 77;
            case 32 -> 235;
            case 33 -> 151;
            case 34 -> 157;
            case 35 -> 168;
            case 36 -> 76;
            case 37 -> 81;
            case 38 -> 175;
            case 39 -> 113;
            case 40 -> 54;
            case 41 -> 125;
            case 42 -> 129;
            case 43 -> 0;
            case 44 -> 62;
            case 45 -> 143;
            case 46 -> 89;
            case 47 -> 136;
            case 48 -> 158;
            case 49 -> 13;
            case 50 -> 241;
            case 51 -> 217;
            case 52 -> 3;
            case 53 -> 72;
            case 54 -> 243;
            case 55 -> 108;
            case 56 -> 196;
            case 57 -> 59;
            case 58 -> 252;
            case 59 -> 53;
            case 60 -> 232;
            case 61 -> 192;
            case 62 -> 176;
            case 63 -> 240;
            case 64 -> 114;
            case 65 -> 55;
            case 66 -> 90;
            case 67 -> 42;
            case 68 -> 95;
            case 69 -> 66;
            case 70 -> 169;
            case 71 -> 233;
            case 72 -> 69;
            case 73 -> 8;
            case 74 -> 128;
            case 75 -> 225;
            case 76 -> 75;
            case 77 -> 21;
            case 78 -> 227;
            case 79 -> 140;
            case 80 -> 51;
            case 81 -> 228;
            case 82 -> 201;
            case 83 -> 131;
            case 84 -> 171;
            case 85 -> 82;
            case 86 -> 99;
            case 87 -> 2;
            case 88 -> 91;
            case 89 -> 126;
            case 90 -> 200;
            case 91 -> 139;
            case 92 -> 130;
            case 93 -> 149;
            case 94 -> 93;
            case 95 -> 154;
            case 96 -> 210;
            case 97 -> 119;
            case 98 -> 100;
            case 99 -> 34;
            case 100 -> 111;
            case 101 -> 247;
            case 102 -> 191;
            case 103 -> 221;
            case 104 -> 121;
            case 105 -> 105;
            case 106 -> 110;
            case 107 -> 127;
            case 108 -> 70;
            case 109 -> 115;
            case 110 -> 239;
            case 111 -> 242;
            case 112 -> 205;
            case 113 -> 170;
            case 114 -> 6;
            case 115 -> 255;
            case 116 -> 203;
            case 117 -> 187;
            case 118 -> 179;
            case 119 -> 234;
            case 120 -> 64;
            case 121 -> 71;
            case 122 -> 137;
            case 123 -> 215;
            case 124 -> 146;
            case 125 -> 135;
            case 126 -> 204;
            case 127 -> 58;
            case 128 -> 190;
            case 129 -> 138;
            case 130 -> 236;
            case 131 -> 101;
            case 132 -> 152;
            case 133 -> 124;
            case 134 -> 231;
            case 135 -> 145;
            case 136 -> 219;
            case 137 -> 19;
            case 138 -> 20;
            case 139 -> 182;
            case 140 -> 83;
            case 141 -> 47;
            case 142 -> 27;
            case 143 -> 199;
            case 144 -> 97;
            case 145 -> 213;
            case 146 -> 40;
            case 147 -> 181;
            case 148 -> 184;
            case 149 -> 30;
            case 150 -> 4;
            case 151 -> 52;
            case 152 -> 229;
            case 153 -> 237;
            case 154 -> 207;
            case 155 -> 9;
            case 156 -> 226;
            case 157 -> 144;
            case 158 -> 56;
            case 159 -> 186;
            case 160 -> 212;
            case 161 -> 63;
            case 162 -> 172;
            case 163 -> 18;
            case 164 -> 244;
            case 165 -> 208;
            case 166 -> 238;
            case 167 -> 88;
            case 168 -> 123;
            case 169 -> 74;
            case 170 -> 44;
            case 171 -> 98;
            case 172 -> 159;
            case 173 -> 153;
            case 174 -> 211;
            case 175 -> 165;
            case 176 -> 133;
            case 177 -> 78;
            case 178 -> 202;
            case 179 -> 156;
            case 180 -> 49;
            case 181 -> 112;
            case 182 -> 120;
            case 183 -> 106;
            case 184 -> 180;
            case 185 -> 79;
            case 186 -> 86;
            case 187 -> 197;
            case 188 -> 188;
            case 189 -> 253;
            case 190 -> 25;
            case 191 -> 57;
            case 192 -> 23;
            case 193 -> 32;
            case 194 -> 67;
            case 195 -> 36;
            case 196 -> 246;
            case 197 -> 148;
            case 198 -> 164;
            case 199 -> 96;
            case 200 -> 251;
            case 201 -> 29;
            case 202 -> 185;
            case 203 -> 10;
            case 204 -> 1;
            case 205 -> 116;
            case 206 -> 48;
            case 207 -> 249;
            case 208 -> 195;
            case 209 -> 224;
            case 210 -> 102;
            case 211 -> 14;
            case 212 -> 245;
            case 213 -> 220;
            case 214 -> 254;
            case 215 -> 85;
            case 216 -> 26;
            case 217 -> 24;
            case 218 -> 11;
            case 219 -> 73;
            case 220 -> 218;
            case 221 -> 31;
            case 222 -> 92;
            case 223 -> 223;
            case 224 -> 107;
            case 225 -> 109;
            case 226 -> 87;
            case 227 -> 248;
            case 228 -> 167;
            case 229 -> 60;
            case 230 -> 150;
            case 231 -> 178;
            case 232 -> 209;
            case 233 -> 189;
            case 234 -> 45;
            case 235 -> 193;
            case 236 -> 198;
            case 237 -> 134;
            case 238 -> 17;
            case 239 -> 141;
            case 240 -> 250;
            case 241 -> 216;
            case 242 -> 37;
            case 243 -> 84;
            case 244 -> 5;
            case 245 -> 61;
            case 246 -> 177;
            case 247 -> 46;
            case 248 -> 39;
            case 249 -> 94;
            case 250 -> 41;
            case 251 -> 103;
            case 252 -> 33;
            case 253 -> 117;
            case 254 -> 65;
            default -> 80;
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

         g[var2] = new String(var3).intern();
      }

      return g[var2];
   }

   private static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      private final float IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final float lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final double lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final double IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private final double IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private final boolean IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private final boolean lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      private final boolean IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      private final boolean llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      private final boolean lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         float var1, float var2, long var3, double var5, double var7, double var9, boolean var11, boolean var12, boolean var13, boolean var14, boolean var15
      ) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var5;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var7;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var9;
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var11;
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var12;
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var13;
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var14;
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var15;
      }

      public final float a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final float b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final long c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final double d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final double e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final double f() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final boolean g() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      public final boolean h() {
         return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      public final boolean i() {
         return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      public final boolean j() {
         return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }

      public final boolean k() {
         return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      }

      public final float l() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final float m() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final long n() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final double o() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final double p() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final double q() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final boolean r() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      public final boolean s() {
         return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      public final boolean t() {
         return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      public final boolean u() {
         return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }

      public final boolean v() {
         return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      }

      @NotNull
      public final lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         float var1, float var2, long var3, double var5, double var7, double var9, boolean var11, boolean var12, boolean var13, boolean var14, boolean var15
      ) {
         return new lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var2, var3, var5, var7, var9, var11, var12, var13, var14, var15
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -8688;
         boolean var1 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
         boolean var2 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
         boolean var3 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
         boolean var4 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
         boolean var5 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         double var6 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         double var8 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         double var10 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         long var12 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         float var14 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         float var15 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -26667;
         short var10002 = -8677;
         short var10003 = -32185;
         short var10004 = -8679;
         short var10005 = 17577;
         short var10006 = -8687;
         short var10007 = 25193;
         short var10008 = -8675;
         short var10009 = -2505;
         short var10010 = -8680;
         short var10011 = 4175;
         short var10012 = -8676;
         short var10013 = 32250;
         short var10014 = -8673;
         short var10015 = 3383;
         short var10016 = -8674;
         short var10017 = 22153;
         short var10018 = -8685;
         short var10019 = 17808;
         short var10020 = -8678;
         short var10021 = 31265;
         return "RecordedFrame(yaw="
            + var15
            + ", pitch="
            + var14
            + ", time="
            + var12
            + ", x="
            + var10
            + ", y="
            + var8
            + ", z="
            + var6
            + ", movingForward="
            + var5
            + ", movingBack="
            + var4
            + ", movingLeft="
            + var3
            + ", movingRight="
            + var2
            + ", sneaking="
            + var1
            + ")";
      }

      @Override
      public int hashCode() {
         int var2 = Float.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var2 = var2 * 31 + Float.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         int var10000 = me.octo.client.lIIlllllllIlIlIIlIIlllIIIIIIIllIIIlIIIIIIlIlIIlIIIIIllIIIllIlIIIIIllllIlllllllIllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c();
         var2 = var2 * 31 + Long.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         var2 = var2 * 31 + Double.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         var2 = var2 * 31 + Double.hashCode(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         var2 = var2 * 31 + Double.hashCode(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
         var2 = var2 * 31 + Boolean.hashCode(this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll);
         var2 = var2 * 31 + Boolean.hashCode(this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll);
         int var1 = var10000;
         var2 = var2 * 31 + Boolean.hashCode(this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII);
         var2 = var2 * 31 + Boolean.hashCode(this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI);
         var2 = var2 * 31 + Boolean.hashCode(this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl);
         if (var1 != 0) {
            lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
               new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[1]
            );
         }

         return var2;
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int var2 = me.octo.client.lIIlllllllIlIlIIlIIlllIIIIIIIllIIIlIIIIIIlIlIIlIIIIIllIIIllIlIIIIIllllIlllllllIllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
         Object var10000 = this;
         if (var2 != 0) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != 0) {
            if (!(
               var10000 instanceof lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = var1;
         }

         lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
         int var4 = Float.compare(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         );
         if (var2 != 0) {
            if (var4 != 0) {
               return false;
            }

            var4 = Float.compare(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
         }

         if (var2 != 0) {
            if (var4 != 0) {
               return false;
            }

            long var5;
            var4 = (
                     var5 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        - var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                  )
                  == 0L
               ? 0
               : (var5 < 0L ? -1 : 1);
         }

         if (var2 != 0) {
            if (var4 != 0) {
               return false;
            }

            var4 = Double.compare(
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            );
         }

         if (var2 != 0) {
            if (var4 != 0) {
               return false;
            }

            var4 = Double.compare(
               this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
               var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            );
         }

         if (var2 != 0) {
            if (var4 != 0) {
               return false;
            }

            var4 = Double.compare(
               this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
               var3.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            );
         }

         if (var2 != 0) {
            if (var4 != 0) {
               return false;
            }

            var4 = ((this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) ? 1 : 0);
         }

         byte var10001 = ((byte)((var3.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) ? 1 : 0));
         if (var2 != 0) {
            if (var4 !=( (!var3.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) ? 1 : 0)) {
               return false;
            }

            var4 = ((this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) ? 1 : 0);
            var10001 = ((byte)((var3.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) ? 1 : 0));
         }

         if (var2 != 0) {
            if (var4 != var10001) {
               return false;
            }

            var4 = ((this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) ? 1 : 0);
            var10001 = ((byte)((var3.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) ? 1 : 0));
         }

         if (var2 != 0) {
            if (var4 != var10001) {
               return false;
            }

            var4 = ((this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) ? 1 : 0);
            var10001 = ((byte)((var3.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) ? 1 : 0));
         }

         if (var2 != 0) {
            if (var4 != var10001) {
               return false;
            }

            var4 = ((this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl) ? 1 : 0);
            if (var2 == 0) {
               return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
            }

            var10001 = ((byte)((var3.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl) ? 1 : 0));
         }

         return !(var4 != var10001);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[11];
         int var3 = 0;
         String var2 = " ¼\u009fU·úa\u0004[#þò\bú\nÀ\u0083Á&Àr\u000b¤Æ\b\u001dª\u0010\u009d¢g1ý\u0004\u0015ï4k\u0010¼\u0000\u0015ÄÇ\u0002DçÑ^Ií\u0005<\r:\r\u0015\u0014 FaR\u0090íO\u0011\u000f×¢\rõ½<sâôà9O\u008fÅ\u009f^\u0004Ýé,«";
         int var4 = " ¼\u009fU·úa\u0004[#þò\bú\nÀ\u0083Á&Àr\u000b¤Æ\b\u001dª\u0010\u009d¢g1ý\u0004\u0015ï4k\u0010¼\u0000\u0015ÄÇ\u0002DçÑ^Ií\u0005<\r:\r\u0015\u0014 FaR\u0090íO\u0011\u000f×¢\rõ½<sâôà9O\u008fÅ\u009f^\u0004Ýé,«"
            .length();
         char var1 = 7;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 82;
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
                        case 0 -> 88;
                        case 1 -> 111;
                        case 2 -> 85;
                        case 3 -> 122;
                        case 4 -> 97;
                        case 5 -> 38;
                        default -> 94;
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
                        b = new String[11];
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

                     var2 = "É·¢y\\\u001e\u001emV×\fÞ~ÿ]©jl\u000e\u001azg-/\u0099ÿ2\u0014DÔÑ²®";
                     var4 = "É·¢y\\\u001e\u001emV×\fÞ~ÿ]©jl\u000e\u001azg-/\u0099ÿ2\u0014DÔÑ²®".length();
                     var1 = 18;
                     var8 = -1;
               }

               var10000 = 29;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -8679) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 86;
               case 1 -> 46;
               case 2 -> 144;
               case 3 -> 134;
               case 4 -> 39;
               case 5 -> 148;
               case 6 -> 10;
               case 7 -> 26;
               case 8 -> 93;
               case 9 -> 149;
               case 10 -> 212;
               case 11 -> 48;
               case 12 -> 252;
               case 13 -> 238;
               case 14 -> 200;
               case 15 -> 206;
               case 16 -> 240;
               case 17 -> 117;
               case 18 -> 104;
               case 19 -> 101;
               case 20 -> 184;
               case 21 -> 239;
               case 22 -> 178;
               case 23 -> 211;
               case 24 -> 156;
               case 25 -> 199;
               case 26 -> 11;
               case 27 -> 168;
               case 28 -> 109;
               case 29 -> 235;
               case 30 -> 224;
               case 31 -> 4;
               case 32 -> 158;
               case 33 -> 13;
               case 34 -> 123;
               case 35 -> 108;
               case 36 -> 220;
               case 37 -> 172;
               case 38 -> 170;
               case 39 -> 255;
               case 40 -> 244;
               case 41 -> 194;
               case 42 -> 163;
               case 43 -> 70;
               case 44 -> 20;
               case 45 -> 157;
               case 46 -> 120;
               case 47 -> 59;
               case 48 -> 155;
               case 49 -> 14;
               case 50 -> 136;
               case 51 -> 23;
               case 52 -> 95;
               case 53 -> 8;
               case 54 -> 92;
               case 55 -> 207;
               case 56 -> 66;
               case 57 -> 19;
               case 58 -> 81;
               case 59 -> 152;
               case 60 -> 230;
               case 61 -> 180;
               case 62 -> 189;
               case 63 -> 203;
               case 64 -> 167;
               case 65 -> 37;
               case 66 -> 190;
               case 67 -> 38;
               case 68 -> 91;
               case 69 -> 7;
               case 70 -> 125;
               case 71 -> 12;
               case 72 -> 129;
               case 73 -> 249;
               case 74 -> 248;
               case 75 -> 15;
               case 76 -> 118;
               case 77 -> 124;
               case 78 -> 54;
               case 79 -> 43;
               case 80 -> 198;
               case 81 -> 210;
               case 82 -> 103;
               case 83 -> 223;
               case 84 -> 127;
               case 85 -> 215;
               case 86 -> 126;
               case 87 -> 68;
               case 88 -> 6;
               case 89 -> 63;
               case 90 -> 30;
               case 91 -> 88;
               case 92 -> 228;
               case 93 -> 16;
               case 94 -> 9;
               case 95 -> 29;
               case 96 -> 174;
               case 97 -> 237;
               case 98 -> 196;
               case 99 -> 169;
               case 100 -> 97;
               case 101 -> 139;
               case 102 -> 100;
               case 103 -> 202;
               case 104 -> 218;
               case 105 -> 22;
               case 106 -> 141;
               case 107 -> 193;
               case 108 -> 138;
               case 109 -> 84;
               case 110 -> 55;
               case 111 -> 161;
               case 112 -> 78;
               case 113 -> 0;
               case 114 -> 214;
               case 115 -> 209;
               case 116 -> 102;
               case 117 -> 154;
               case 118 -> 227;
               case 119 -> 58;
               case 120 -> 52;
               case 121 -> 181;
               case 122 -> 61;
               case 123 -> 164;
               case 124 -> 113;
               case 125 -> 1;
               case 126 -> 2;
               case 127 -> 27;
               case 128 -> 83;
               case 129 -> 187;
               case 130 -> 160;
               case 131 -> 67;
               case 132 -> 132;
               case 133 -> 197;
               case 134 -> 42;
               case 135 -> 50;
               case 136 -> 153;
               case 137 -> 236;
               case 138 -> 47;
               case 139 -> 44;
               case 140 -> 247;
               case 141 -> 51;
               case 142 -> 64;
               case 143 -> 146;
               case 144 -> 245;
               case 145 -> 165;
               case 146 -> 131;
               case 147 -> 45;
               case 148 -> 99;
               case 149 -> 87;
               case 150 -> 18;
               case 151 -> 204;
               case 152 -> 35;
               case 153 -> 234;
               case 154 -> 77;
               case 155 -> 191;
               case 156 -> 98;
               case 157 -> 94;
               case 158 -> 74;
               case 159 -> 145;
               case 160 -> 217;
               case 161 -> 34;
               case 162 -> 166;
               case 163 -> 25;
               case 164 -> 114;
               case 165 -> 76;
               case 166 -> 226;
               case 167 -> 183;
               case 168 -> 89;
               case 169 -> 150;
               case 170 -> 233;
               case 171 -> 57;
               case 172 -> 112;
               case 173 -> 72;
               case 174 -> 159;
               case 175 -> 229;
               case 176 -> 133;
               case 177 -> 162;
               case 178 -> 41;
               case 179 -> 143;
               case 180 -> 253;
               case 181 -> 192;
               case 182 -> 96;
               case 183 -> 60;
               case 184 -> 242;
               case 185 -> 82;
               case 186 -> 53;
               case 187 -> 121;
               case 188 -> 130;
               case 189 -> 222;
               case 190 -> 201;
               case 191 -> 62;
               case 192 -> 213;
               case 193 -> 33;
               case 194 -> 17;
               case 195 -> 246;
               case 196 -> 254;
               case 197 -> 56;
               case 198 -> 251;
               case 199 -> 137;
               case 200 -> 105;
               case 201 -> 185;
               case 202 -> 250;
               case 203 -> 85;
               case 204 -> 186;
               case 205 -> 232;
               case 206 -> 175;
               case 207 -> 36;
               case 208 -> 5;
               case 209 -> 205;
               case 210 -> 177;
               case 211 -> 195;
               case 212 -> 208;
               case 213 -> 171;
               case 214 -> 40;
               case 215 -> 110;
               case 216 -> 24;
               case 217 -> 90;
               case 218 -> 135;
               case 219 -> 176;
               case 220 -> 147;
               case 221 -> 80;
               case 222 -> 221;
               case 223 -> 65;
               case 224 -> 119;
               case 225 -> 21;
               case 226 -> 73;
               case 227 -> 31;
               case 228 -> 231;
               case 229 -> 140;
               case 230 -> 243;
               case 231 -> 225;
               case 232 -> 75;
               case 233 -> 151;
               case 234 -> 71;
               case 235 -> 173;
               case 236 -> 115;
               case 237 -> 219;
               case 238 -> 49;
               case 239 -> 28;
               case 240 -> 107;
               case 241 -> 3;
               case 242 -> 32;
               case 243 -> 188;
               case 244 -> 142;
               case 245 -> 128;
               case 246 -> 179;
               case 247 -> 111;
               case 248 -> 216;
               case 249 -> 122;
               case 250 -> 69;
               case 251 -> 79;
               case 252 -> 241;
               case 253 -> 116;
               case 254 -> 106;
               default -> 182;
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

   public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1, float var2, float var3, long var4, double var5, double var6, double var7, boolean var8, boolean var9, boolean var10, boolean var11, boolean var12, int var13, Object var14) {
      if ((var13 & 1) != 0) {
         var2 = var1.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }
      if ((var13 & 2) != 0) {
         var3 = var1.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }
      if ((var13 & 4) != 0) {
         var4 = var1.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }
      if ((var13 & 8) != 0) {
         var5 = var1.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }
      if ((var13 & 16) != 0) {
         var6 = var1.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }
      if ((var13 & 32) != 0) {
         var7 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }
      if ((var13 & 64) != 0) {
         var8 = var1.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }
      if ((var13 & 128) != 0) {
         var9 = var1.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }
      if ((var13 & 256) != 0) {
         var10 = var1.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }
      if ((var13 & 512) != 0) {
         var11 = var1.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }
      if ((var13 & 1024) != 0) {
         var12 = var1.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      }
      return var1.a(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

    // PX-FIX TOP5F: Kotlin synthetic no-arg marker ctor (jar: <init>(DefaultConstructorMarker))
    public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker marker) {
        this();
    }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll a() {
         return lllIIIlllIIIIlIllIlIIlllllIIIlIIlIIIllIllllllIllIlIIIlIlIIlllIIIIIlIIIIIlIlIIlIlIlIll.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      }
   }
}
