package me.octo.client;

import java.io.File;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.io.FilesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import kotlin.collections.ArraysKt;
import kotlin.io.ByteStreamsKt;
import java.nio.charset.Charset;
import kotlin.text.Charsets;
import net.minecraft.network.chat.ClickEvent;
import kotlin.io.CloseableKt;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.network.chat.Component;
import java.time.format.DateTimeFormatter;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.DisconnectedScreen;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;
import com.mojang.blaze3d.opengl.GlTexture;
import net.minecraft.network.chat.HoverEvent;
import me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII;
import java.lang.invoke.LambdaMetafactory;
import java.util.List;
import java.time.LocalDateTime;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.MutableComponent;
import java.io.OutputStream;
import java.io.Reader;
import com.mojang.blaze3d.pipeline.RenderTarget;
import net.minecraft.network.chat.Style;
import kotlin.io.TextStreamsKt;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipInputStream;
import me.octo.client.utils.lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl;

public final class lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   public static me.octo.client.lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll = null; // PX-FIX missing field (typed to WhenMappings)
   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) { return null; } // PX-FIX ovld

   @NotNull
   public static lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @Nullable
   private Process lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @Nullable
   private File lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private final Object IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private volatile boolean llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private volatile boolean IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private volatile boolean IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private volatile boolean IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private int IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private int llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private long IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   @NotNull
   private final LinkedBlockingQueue<lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   @NotNull
   private final LinkedBlockingQueue<byte[]> llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   @Nullable
   private Thread lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   @Nullable
   private int[] IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   private int IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   private boolean IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   private int llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   private int lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   @Nullable
   private String IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   private boolean IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   private long lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   private boolean lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
   @Nullable
   private volatile lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
   public static int IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
   @JvmField
   @NotNull
   public static lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI;
   private static String[] f;
   private static String[] g;

   private lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll() {
      short var10001 = 23062;
      short var10002 = -29982;
      var10002 = 23042;
      short var10003 = -30503;
      me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      short var10004 = 23135;
      short var10005 = -2340;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         IllIllllIIIIIIIIIllllIIlIlIlIlIIIIlIIllIlIlIlIIIllllIlIIIIIlIIlIIIlIIlIIlIlIllllIlIll.a(),
         IllIllllIIIIIIIIIllllIIlIlIlIlIIIIlIIllIlIlIlIIIllllIlIIIIIlIIlIIIlIIlIIlIlIllllIlIll.b(),
         IllIllllIIIIIIIIIllllIIlIlIlIlIIIIlIIllIlIlIlIIIllllIlIIIIIlIIlIIIlIIlIIlIlIllllIlIll.c(),
         IllIllllIIIIIIIIIllllIIlIlIlIlIIIIlIIllIlIlIlIIIllllIlIIIIIlIIlIIIlIIlIIlIlIllllIlIll.d(),
         IllIllllIIIIIIIIIllllIIlIlIlIlIIIIlIIllIlIlIlIIIllllIlIIIIIlIIlIIIlIIlIIlIlIllllIlIll.e(),
         IllIllllIIIIIIIIIllllIIlIlIlIlIIIIlIIllIlIlIlIIIllllIlIIIIIlIIlIIIlIIlIIlIlIllllIlIll.f(),
         IllIllllIIIIIIIIIllllIIlIlIlIlIIIIlIIllIlIlIlIIIllllIlIIIIIlIIlIIIlIIlIIlIlIllllIlIll.g()
      };
      super("Clipping", "Records gameplay for a set time. Use /clip to save.", var3, "Recording", var1);
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new Object();
      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = new LinkedBlockingQueue<>(3);
      this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = new LinkedBlockingQueue<>(4);
   }

   private final lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl ag() {
      String var1 = System.getProperty("os.name").toLowerCase(java.util.Locale.ROOT);
      if (((CharSequence)var1).charAt(0) == 0) { throw null; }
      if (kotlin.text.StringsKt.contains((CharSequence)var1, (CharSequence)"win", false)) { return llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
      if (kotlin.text.StringsKt.contains((CharSequence)var1, (CharSequence)"mac", false)) { return llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl; }
      if (kotlin.text.StringsKt.contains((CharSequence)var1, (CharSequence)"darwin", false)) { return llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
      return llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public void aB() {
      int[] var1 = me.octo.client.lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      this.aZ();
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = false;
      if (var1 == null) {
         if (this.ag() == me.octo.client.lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("cClipping: macOS is not supported due to Apple's privacy restrictions.");
            c(this, false, 1, null);
            return;
         }
      }
      this.as();
      com.mojang.blaze3d.platform.Window var2 = null;
      try {
         var2 = net.minecraft.client.Minecraft.getInstance().getWindow();
      } catch (Throwable var4) {
      }
      if (var1 == null) {
         if (var2 == null || var2.handle() == 0L) {
            this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = true;
         }
         return;
      }
      a(this, false, 1, (Object)null);
   }

   public void aC() {
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = false;
      this.aO();
      this.aP();
      this.at();
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b ()[I
      // 003: aload 1
      // 004: sipush 23530
      // 007: sipush 3079
      // 00a: pop2
      // 00b: ldc_w "event"
      // 00e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 011: astore 2
      // 012: aload 0
      // 013: getfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Z
      // 016: aload 2
      // 017: ifnonnull 02f
      // 01a: ifeq 032
      // 01d: goto 024
      // 020: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 023: athrow
      // 024: aload 0
      // 025: getfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll Z
      // 028: goto 02f
      // 02b: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02e: athrow
      // 02f: ifeq 033
      // 032: return
      // 033: invokestatic java/lang/System.nanoTime ()J
      // 036: lstore 3
      // 037: ldc2_w 1000000000
      // 03a: invokestatic me/octo/client/IllIllllIIIIIIIIIllllIIlIlIlIlIIIIlIIllIlIlIlIIIllllIlIIIIIlIIlIIIlIIlIIlIlIllllIlIll.b ()Lme/octo/client/IllIllllIIIIIIIIIllllIIlIlIlIlIIIIlIIllIlIlIlIIIllllIlIIIIIlIIlIIIlIIlIIlIlIllllIlIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 03d: invokevirtual me/octo/client/IllIllllIIIIIIIIIllllIIlIlIlIlIIIIlIIllIlIlIlIIIllllIlIIIIIlIIlIIIlIIlIIlIlIllllIlIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.O ()I
      // 040: i2l
      // 041: ldiv
      // 042: lstore 5
      // 044: aload 2
      // 045: ifnonnull 065
      // 048: lload 3
      // 049: aload 0
      // 04a: getfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll J
      // 04d: lsub
      // 04e: lload 5
      // 050: lcmp
      // 051: ifge 060
      // 054: goto 05b
      // 057: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05a: athrow
      // 05b: return
      // 05c: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05f: athrow
      // 060: aload 0
      // 061: lload 3
      // 062: putfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll J
      // 065: invokestatic net/minecraft/client/Minecraft.getInstance ()Lnet/minecraft/client/Minecraft;
      // 068: dup
      // 069: sipush 23268
      // 06c: sipush 1950
      // 06f: pop2
      // 070: ldc_w "getInstance(...)"
      // 073: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 076: astore 7
      // 078: aload 2
      // 079: ifnonnull 094
      // 07c: aload 7
      // 07e: invokevirtual net/minecraft/client/Minecraft.getMainRenderTarget ()Lcom/mojang/blaze3d/pipeline/RenderTarget;
      // 081: dup
      // 082: ifnonnull 095
      // 085: goto 08c
      // 088: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08b: athrow
      // 08c: pop
      // 08d: goto 094
      // 090: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 093: athrow
      // 094: return
      // 095: astore 8
      // 097: aload 8
      // 099: getfield com/mojang/blaze3d/pipeline/RenderTarget.width I
      // 09c: istore 9
      // 09e: aload 8
      // 0a0: getfield com/mojang/blaze3d/pipeline/RenderTarget.height I
      // 0a3: istore 10
      // 0a5: iload 9
      // 0a7: aload 2
      // 0a8: ifnonnull 0b7
      // 0ab: ifle 0c5
      // 0ae: goto 0b5
      // 0b1: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b4: athrow
      // 0b5: iload 10
      // 0b7: aload 2
      // 0b8: ifnonnull 0c8
      // 0bb: ifgt 0c6
      // 0be: goto 0c5
      // 0c1: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c4: athrow
      // 0c5: return
      // 0c6: iload 9
      // 0c8: aload 0
      // 0c9: getfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl I
      // 0cc: aload 2
      // 0cd: ifnonnull 100
      // 0d0: if_icmpne 0f5
      // 0d3: goto 0da
      // 0d6: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d9: athrow
      // 0da: iload 10
      // 0dc: aload 0
      // 0dd: getfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI I
      // 0e0: aload 2
      // 0e1: ifnonnull 100
      // 0e4: goto 0eb
      // 0e7: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ea: athrow
      // 0eb: if_icmpeq 127
      // 0ee: goto 0f5
      // 0f1: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f4: athrow
      // 0f5: iload 9
      // 0f7: iload 10
      // 0f9: goto 100
      // 0fc: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ff: athrow
      // 100: sipush 23244
      // 103: sipush -31903
      // 106: pop2
      // 107: ldc_w "Clipping: Framebuffer resized to "
      // 10a: dup_x2
      // 10b: pop
      // 10c: ldc_w "x"
      // 10f: swap
      // 110: sipush 23215
      // 113: sipush 23337
      // 116: pop2
      // 117: ldc_w ", restarting capture"
      // 11a: invokedynamic makeConcatWithConstants (Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001" ]
      // 11f: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d (Ljava/lang/String;)V
      // 122: aload 0
      // 123: invokespecial me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.aN ()V
      // 126: return
      // 127: aload 8
      // 129: invokevirtual com/mojang/blaze3d/pipeline/RenderTarget.getColorTexture ()Lcom/mojang/blaze3d/textures/GpuTexture;
      // 12c: astore 11
      // 12e: aload 11
      // 130: instanceof com/mojang/blaze3d/opengl/GlTexture
      // 133: aload 2
      // 134: ifnonnull 148
      // 137: ifne 142
      // 13a: goto 141
      // 13d: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 140: athrow
      // 141: return
      // 142: ldc_w 32873
      // 145: invokestatic org/lwjgl/opengl/GL11.glGetInteger (I)I
      // 148: istore 12
      // 14a: sipush 3553
      // 14d: aload 11
      // 14f: checkcast com/mojang/blaze3d/opengl/GlTexture
      // 152: invokevirtual com/mojang/blaze3d/opengl/GlTexture.glId ()I
      // 155: invokestatic org/lwjgl/opengl/GL11.glBindTexture (II)V
      // 158: sipush 3553
      // 15b: bipush 0
      // 15c: sipush 4096
      // 15f: invokestatic org/lwjgl/opengl/GL11.glGetTexLevelParameteri (III)I
      // 162: istore 13
      // 164: sipush 3553
      // 167: bipush 0
      // 168: sipush 4097
      // 16b: invokestatic org/lwjgl/opengl/GL11.glGetTexLevelParameteri (III)I
      // 16e: istore 14
      // 170: iload 13
      // 172: iload 9
      // 174: aload 2
      // 175: ifnonnull 1a7
      // 178: if_icmpne 19b
      // 17b: goto 182
      // 17e: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 181: athrow
      // 182: iload 14
      // 184: iload 10
      // 186: aload 2
      // 187: ifnonnull 1b1
      // 18a: goto 191
      // 18d: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 190: athrow
      // 191: if_icmpeq 1ab
      // 194: goto 19b
      // 197: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19a: athrow
      // 19b: sipush 3553
      // 19e: iload 12
      // 1a0: goto 1a7
      // 1a3: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a6: athrow
      // 1a7: invokestatic org/lwjgl/opengl/GL11.glBindTexture (II)V
      // 1aa: return
      // 1ab: iload 9
      // 1ad: iload 10
      // 1af: imul
      // 1b0: bipush 4
      // 1b1: imul
      // 1b2: istore 15
      // 1b4: nop
      // 1b5: aload 0
      // 1b6: getfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll [I
      // 1b9: astore 16
      // 1bb: aload 16
      // 1bd: aload 2
      // 1be: ifnonnull 20d
      // 1c1: ifnull 20b
      // 1c4: goto 1cb
      // 1c7: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ca: athrow
      // 1cb: aload 0
      // 1cc: getfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI I
      // 1cf: iload 15
      // 1d1: aload 2
      // 1d2: ifnonnull 207
      // 1d5: goto 1dc
      // 1d8: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1db: athrow
      // 1dc: if_icmpeq 20b
      // 1df: goto 1e6
      // 1e2: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e5: athrow
      // 1e6: aload 16
      // 1e8: invokestatic org/lwjgl/opengl/GL15.glDeleteBuffers ([I)V
      // 1eb: aload 0
      // 1ec: aconst_null
      // 1ed: putfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll [I
      // 1f0: aload 0
      // 1f1: bipush 0
      // 1f2: putfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll Z
      // 1f5: aload 0
      // 1f6: bipush 0
      // 1f7: putfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI I
      // 1fa: nop
      // 1fb: ldc_w 35051
      // 1fe: bipush 0
      // 1ff: invokestatic org/lwjgl/opengl/GL15.glBindBuffer (II)V
      // 202: sipush 3553
      // 205: iload 12
      // 207: invokestatic org/lwjgl/opengl/GL11.glBindTexture (II)V
      // 20a: return
      // 20b: aload 16
      // 20d: aload 2
      // 20e: ifnonnull 227
      // 211: ifnonnull 282
      // 214: goto 21b
      // 217: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21a: athrow
      // 21b: bipush 2
      // 21c: newarray 10
      // 21e: astore 16
      // 220: aload 16
      // 222: invokestatic org/lwjgl/opengl/GL15.glGenBuffers ([I)V
      // 225: aload 16
      // 227: astore 17
      // 229: bipush 0
      // 22a: istore 18
      // 22c: aload 17
      // 22e: arraylength
      // 22f: istore 19
      // 231: iload 18
      // 233: iload 19
      // 235: if_icmpge 265
      // 238: aload 17
      // 23a: iload 18
      // 23c: iaload
      // 23d: istore 20
      // 23f: ldc_w 35051
      // 242: iload 20
      // 244: invokestatic org/lwjgl/opengl/GL15.glBindBuffer (II)V
      // 247: ldc_w 35051
      // 24a: iload 15
      // 24c: i2l
      // 24d: ldc_w 35041
      // 250: invokestatic org/lwjgl/opengl/GL15.glBufferData (IJI)V
      // 253: iinc 18 1
      // 256: aload 2
      // 257: ifnonnull 27d
      // 25a: aload 2
      // 25b: ifnull 231
      // 25e: goto 265
      // 261: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 264: athrow
      // 265: ldc_w 35051
      // 268: bipush 0
      // 269: invokestatic org/lwjgl/opengl/GL15.glBindBuffer (II)V
      // 26c: aload 0
      // 26d: aload 16
      // 26f: putfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll [I
      // 272: aload 0
      // 273: iload 15
      // 275: putfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI I
      // 278: aload 0
      // 279: bipush 0
      // 27a: putfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII I
      // 27d: aload 0
      // 27e: bipush 0
      // 27f: putfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll Z
      // 282: sipush 3333
      // 285: bipush 1
      // 286: invokestatic org/lwjgl/opengl/GL11.glPixelStorei (II)V
      // 289: sipush 3330
      // 28c: bipush 0
      // 28d: invokestatic org/lwjgl/opengl/GL11.glPixelStorei (II)V
      // 290: sipush 3331
      // 293: bipush 0
      // 294: invokestatic org/lwjgl/opengl/GL11.glPixelStorei (II)V
      // 297: sipush 3332
      // 29a: bipush 0
      // 29b: invokestatic org/lwjgl/opengl/GL11.glPixelStorei (II)V
      // 29e: ldc_w 35051
      // 2a1: aload 16
      // 2a3: aload 0
      // 2a4: getfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII I
      // 2a7: iaload
      // 2a8: invokestatic org/lwjgl/opengl/GL15.glBindBuffer (II)V
      // 2ab: sipush 3553
      // 2ae: bipush 0
      // 2af: ldc_w 32993
      // 2b2: sipush 5121
      // 2b5: lconst_0
      // 2b6: invokestatic org/lwjgl/opengl/GL11.glGetTexImage (IIIIJ)V
      // 2b9: aload 0
      // 2ba: getfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll Z
      // 2bd: aload 2
      // 2be: ifnonnull 3ad
      // 2c1: ifeq 394
      // 2c4: goto 2cb
      // 2c7: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ca: athrow
      // 2cb: ldc_w 35051
      // 2ce: aload 16
      // 2d0: bipush 1
      // 2d1: aload 0
      // 2d2: getfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII I
      // 2d5: isub
      // 2d6: iaload
      // 2d7: invokestatic org/lwjgl/opengl/GL15.glBindBuffer (II)V
      // 2da: ldc_w 35051
      // 2dd: ldc_w 35000
      // 2e0: iload 15
      // 2e2: i2l
      // 2e3: aconst_null
      // 2e4: invokestatic org/lwjgl/opengl/GL15.glMapBuffer (IIJLjava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
      // 2e7: astore 17
      // 2e9: aload 2
      // 2ea: ifnonnull 3b2
      // 2ed: aload 17
      // 2ef: ifnull 394
      // 2f2: goto 2f9
      // 2f5: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f8: athrow
      // 2f9: aload 0
      // 2fa: getfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl Ljava/util/concurrent/LinkedBlockingQueue;
      // 2fd: invokevirtual java/util/concurrent/LinkedBlockingQueue.poll ()Ljava/lang/Object;
      // 300: checkcast [B
      // 303: dup
      // 304: ifnull 347
      // 307: goto 30e
      // 30a: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30d: athrow
      // 30e: astore 21
      // 310: aload 21
      // 312: astore 22
      // 314: bipush 0
      // 315: istore 23
      // 317: aload 22
      // 319: arraylength
      // 31a: aload 2
      // 31b: ifnonnull 332
      // 31e: iload 15
      // 320: if_icmpne 335
      // 323: goto 32a
      // 326: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 329: athrow
      // 32a: bipush 1
      // 32b: goto 332
      // 32e: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 331: athrow
      // 332: goto 336
      // 335: bipush 0
      // 336: ifeq 342
      // 339: aload 21
      // 33b: goto 343
      // 33e: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 341: athrow
      // 342: aconst_null
      // 343: dup
      // 344: ifnonnull 353
      // 347: pop
      // 348: iload 15
      // 34a: newarray 8
      // 34c: goto 353
      // 34f: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 352: athrow
      // 353: astore 18
      // 355: aload 17
      // 357: aload 18
      // 359: invokevirtual java/nio/ByteBuffer.get ([B)Ljava/nio/ByteBuffer;
      // 35c: pop
      // 35d: ldc_w 35051
      // 360: invokestatic org/lwjgl/opengl/GL15.glUnmapBuffer (I)Z
      // 363: pop
      // 364: aload 0
      // 365: getfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll Ljava/util/concurrent/LinkedBlockingQueue;
      // 368: new me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 36b: dup
      // 36c: aload 18
      // 36e: lload 3
      // 36f: invokespecial me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.<init> ([BJ)V
      // 372: invokevirtual java/util/concurrent/LinkedBlockingQueue.offer (Ljava/lang/Object;)Z
      // 375: aload 2
      // 376: ifnonnull 3ad
      // 379: ifne 394
      // 37c: goto 383
      // 37f: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 382: athrow
      // 383: aload 0
      // 384: getfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl Ljava/util/concurrent/LinkedBlockingQueue;
      // 387: aload 18
      // 389: invokevirtual java/util/concurrent/LinkedBlockingQueue.offer (Ljava/lang/Object;)Z
      // 38c: pop
      // 38d: goto 394
      // 390: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 393: athrow
      // 394: aload 0
      // 395: bipush 1
      // 396: aload 0
      // 397: getfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII I
      // 39a: isub
      // 39b: putfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII I
      // 39e: aload 0
      // 39f: bipush 1
      // 3a0: putfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll Z
      // 3a3: ldc_w 35051
      // 3a6: bipush 0
      // 3a7: invokestatic org/lwjgl/opengl/GL15.glBindBuffer (II)V
      // 3aa: sipush 3553
      // 3ad: iload 12
      // 3af: invokestatic org/lwjgl/opengl/GL11.glBindTexture (II)V
      // 3b2: goto 3f2
      // 3b5: astore 16
      // 3b7: aload 16
      // 3b9: sipush 23228
      // 3bc: sipush -16366
      // 3bf: pop2
      // 3c0: ldc_w "Clipping: Failed to read framebuffer: "
      // 3c3: swap
      // 3c4: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 3c9: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b (Ljava/lang/String;)V
      // 3cc: ldc_w 35051
      // 3cf: bipush 0
      // 3d0: invokestatic org/lwjgl/opengl/GL15.glBindBuffer (II)V
      // 3d3: sipush 3553
      // 3d6: iload 12
      // 3d8: invokestatic org/lwjgl/opengl/GL11.glBindTexture (II)V
      // 3db: goto 3f2
      // 3de: astore 16
      // 3e0: ldc_w 35051
      // 3e3: bipush 0
      // 3e4: invokestatic org/lwjgl/opengl/GL15.glBindBuffer (II)V
      // 3e7: sipush 3553
      // 3ea: iload 12
      // 3ec: invokestatic org/lwjgl/opengl/GL11.glBindTexture (II)V
      // 3ef: aload 16
      // 3f1: athrow
      // 3f2: return
   }

   @SubscribeEvent
   public final void a(@NotNull IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl param1) {
      int[] var2 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      if (this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl && this.aA() && !this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI) {
         com.mojang.blaze3d.platform.Window var3 = net.minecraft.client.Minecraft.getInstance().getWindow();
         if (var3 != null && var3.handle() != 0L) {
            this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = false;
            this.d(false);
         }
      } else if (!this.aA() && this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl) {
         this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = false;
      }

      if (this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI && !this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll) {
         long var4 = System.currentTimeMillis();
         if (var4 - this.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI > 5000L) {
            this.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI = var4;
            this.aG();
         }
      }
   }

   @NotNull
   public final File ah() {
      int[] var1 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      File var2 = new File(Minecraft.getInstance().gameDirectory, "polinex/clips");
      if (var1 == null && !var2.exists()) {
         var2.mkdirs();
      }
      return var2;
   }

   private final File ai() {
      int[] var1 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      File var2 = new File(Minecraft.getInstance().gameDirectory, "polinex/clips/.segments");
      if (var1 == null && !var2.exists()) {
         var2.mkdirs();
      }
      return var2;
   }

   private final void aG() {
      long var3 = System.currentTimeMillis() - ((long)IllIllllIIIIIIIIIllllIIlIlIlIlIIIIlIIllIlIlIlIIIllllIlIIIIIlIIlIIIlIIlIIlIlIllllIlIll.a().O() * 1000L + 4000L);
      File[] var5 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.listFiles();
      if (var5 != null) { for (int var7 = 0; var7 < var5.length; var7++) { if (a(var3, var5[var7])) { var5[var7].delete(); } } }
   }

   @NotNull
   private final String aH() {
      if (this.ag() == llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
         return "ffmpeg.exe";
      }

      return "ffmpeg";
   }

   @NotNull
   private final File aI() {
      return new File(Minecraft.getInstance().gameDirectory, "polinex/ffmpeg/" + this.aH());
   }

   @Nullable
   private final String aJ() {
      File var1 = this.aI();

      try {
         if (var1.exists()) {
            return var1.getAbsolutePath();
         }
      } catch (Exception var13) {
      }

      try {
         Process var2 = new ProcessBuilder(new String[]{"ffmpeg", "-version"}).redirectErrorStream(true).start();
         InputStream var5 = var2.getInputStream();
         Intrinsics.checkNotNullExpressionValue(var5, "getInputStream(...)");
         Charset var6 = Charsets.UTF_8;
         int var7 = 8192;
         BufferedReader var8;
         {
            Reader var9 = new InputStreamReader(var5, var6);
            if (var9 instanceof BufferedReader) {
               var8 = (BufferedReader)var9;
            } else {
               var8 = new BufferedReader(var9, var7);
            }
         }

         String var10 = var8.readLine();
         var2.waitFor();
         if (var2.exitValue() == 0) {
            return "ffmpeg";
         }

         return var10;
      } catch (Exception var14) {
         if (this.ag() != llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
            return null;
         }

         for (String var4 : Arrays.asList(
            "C:\\ffmpeg\\bin\\ffmpeg.exe",
            "C:\\Program Files\\ffmpeg\\bin\\ffmpeg.exe",
            "C:\\Program Files (x86)\\ffmpeg\\bin\\ffmpeg.exe",
            System.getProperty("user.home") + "\\ffmpeg\\bin\\ffmpeg.exe"
         )) {
            try {
               if (new File(var4).exists()) {
                  return var4;
               }
            } catch (Exception var12) {
            }
         }

         return null;
      }
   }

   @NotNull
   private final String aK() {
      return "";
   }

   private final void aL() {
      if (this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl) {
         return;
      }

      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = true;
      String var1 = this.aK();
      if (var1 == null) {
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("\u00a7cClipping: FFmpeg not available for your OS. Install it manually.");
         this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = false;
         return;
      }

      lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("\u00a7eClipping: FFmpeg not found, downloading...");
      Thread var2 = new Thread(() -> a(this, var1), "Clipping-FFmpeg-Install");
      var2.setDaemon(true);
      var2.start();
   }

   private final void a(InputStream param1, File param2) throws java.io.IOException {
      java.util.zip.ZipInputStream var4 = new java.util.zip.ZipInputStream(param1);
      java.util.zip.ZipEntry var5 = var4.getNextEntry();
      var var3 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      int var6 = 0;
      while (var5 != null) {
        if (!var5.isDirectory()) {
          kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var5.getName(), "getName(...)");
          if (var5.getName().endsWith("ffmpeg.exe")) {
            java.io.File var7 = new java.io.File(param2, "ffmpeg.exe");
            java.io.FileOutputStream var8 = new java.io.FileOutputStream(var7);
            try {
              kotlin.io.ByteStreamsKt.copyTo(var4, var8, 8192);
            } finally {
              kotlin.io.CloseableKt.closeFinally(var8, null);
            }
            var6 = 1;
          }
        }
        var5 = var4.getNextEntry();
      }
      var4.close();
      if (var6 != 0) {
        me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("\u00a7aClipping: FFmpeg installed! Enable the module again.");
      }
   }

   private final void b(InputStream param1, File param2) {
      try {
         java.io.File var4 = new java.io.File(param2, "ffmpeg.tar.xz");
         java.io.FileOutputStream var7 = new java.io.FileOutputStream(var4);
         try {
            kotlin.io.ByteStreamsKt.copyTo(param1, var7, 8192);
         } finally {
            var7.close();
         }
         param1.close();
         java.lang.String[] var8 = new java.lang.String[]{"tar", "xf", var4.getAbsolutePath(), "--strip-components=1", "-C", param2.getAbsolutePath()};
         java.lang.Process var9 = new java.lang.ProcessBuilder(var8).redirectErrorStream(true).start();
         kotlin.io.TextStreamsKt.forEachLine(new java.io.BufferedReader(new java.io.InputStreamReader(var9.getInputStream(), kotlin.text.Charsets.UTF_8), 8192), me.octo.client.lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll::f);
         var9.waitFor(60L, java.util.concurrent.TimeUnit.SECONDS);
         var4.delete();
         java.io.File var10 = new java.io.File(param2, "ffmpeg");
         if (var10.exists()) {
            var10.setExecutable(true);
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Clipping: FFmpeg installed! Enable the module again.");
         } else {
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Clipping: Failed to extract ffmpeg.");
         }
      } catch (InterruptedException var11) {
         Thread.currentThread().interrupt();
      } catch (Exception var12) {
      }
   }

   // $VF: Extended synchronized range to monitorexit
   public final void d(boolean var1) {
      Object var2 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      synchronized (var2) {
         boolean var3 = false;
         this.e(var1);
         Unit var6 = Unit.INSTANCE;
      }
   }

   public static void a(lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll param0, boolean param1, int param2, Object param3) {
      if ((param2 & 1) != 0) {
         param1 = false;
      }

      param0.d(param1);
   }

   private final void e(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b ()[I
      // 003: astore 2
      // 004: aload 0
      // 005: aload 2
      // 006: ifnonnull 01c
      // 009: getfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Z
      // 00c: ifeq 01b
      // 00f: goto 016
      // 012: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 015: athrow
      // 016: return
      // 017: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01a: athrow
      // 01b: aload 0
      // 01c: invokespecial me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.aJ ()Ljava/lang/String;
      // 01f: astore 3
      // 020: aload 2
      // 021: ifnonnull 03f
      // 024: aload 3
      // 025: ifnonnull 040
      // 028: goto 02f
      // 02b: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02e: athrow
      // 02f: aload 0
      // 030: invokespecial me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.aL ()V
      // 033: aload 0
      // 034: bipush 0
      // 035: invokevirtual me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.c (Z)V
      // 038: goto 03f
      // 03b: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03e: athrow
      // 03f: return
      // 040: aload 0
      // 041: invokespecial me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.ai ()Ljava/io/File;
      // 044: astore 4
      // 046: aload 0
      // 047: aload 4
      // 049: putfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll Ljava/io/File;
      // 04c: invokestatic net/minecraft/client/Minecraft.getInstance ()Lnet/minecraft/client/Minecraft;
      // 04f: dup
      // 050: sipush 23054
      // 053: sipush -20223
      // 056: pop2
      // 057: ldc_w "getInstance(...)"
      // 05a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 05d: astore 5
      // 05f: aload 5
      // 061: invokevirtual net/minecraft/client/Minecraft.getMainRenderTarget ()Lcom/mojang/blaze3d/pipeline/RenderTarget;
      // 064: dup
      // 065: sipush 23057
      // 068: sipush -9176
      // 06b: pop2
      // 06c: ldc_w "getMainRenderTarget(...)"
      // 06f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 072: astore 6
      // 074: aload 0
      // 075: aload 6
      // 077: getfield com/mojang/blaze3d/pipeline/RenderTarget.width I
      // 07a: putfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl I
      // 07d: aload 0
      // 07e: aload 6
      // 080: getfield com/mojang/blaze3d/pipeline/RenderTarget.height I
      // 083: putfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI I
      // 086: aload 0
      // 087: aload 2
      // 088: ifnonnull 0b2
      // 08b: getfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl I
      // 08e: ifle 0b1
      // 091: goto 098
      // 094: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 097: athrow
      // 098: aload 0
      // 099: getfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI I
      // 09c: aload 2
      // 09d: ifnonnull 0bb
      // 0a0: goto 0a7
      // 0a3: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a6: athrow
      // 0a7: ifgt 0b7
      // 0aa: goto 0b1
      // 0ad: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b0: athrow
      // 0b1: aload 0
      // 0b2: bipush 1
      // 0b3: putfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Z
      // 0b6: return
      // 0b7: aload 0
      // 0b8: getfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII I
      // 0bb: istore 8
      // 0bd: aload 0
      // 0be: iload 8
      // 0c0: bipush 1
      // 0c1: iadd
      // 0c2: putfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII I
      // 0c5: iload 8
      // 0c7: istore 7
      // 0c9: invokestatic me/octo/client/IllIllllIIIIIIIIIllllIIlIlIlIlIIIIlIIllIlIlIlIIIllllIlIIIIIlIIlIIIlIIlIIlIlIllllIlIll.b ()Lme/octo/client/IllIllllIIIIIIIIIllllIIlIlIlIlIIIIlIIllIlIlIlIIIllllIlIIIIIlIIlIIIlIIlIIlIlIllllIlIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0cc: invokevirtual me/octo/client/IllIllllIIIIIIIIIllllIIlIlIlIlIIIIlIIllIlIlIlIIIllllIlIIIIIlIIlIIIlIIlIIlIlIllllIlIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.O ()I
      // 0cf: istore 8
      // 0d1: bipush 33
      // 0d3: anewarray 176
      // 0d6: astore 10
      // 0d8: aload 10
      // 0da: bipush 0
      // 0db: aload 3
      // 0dc: aastore
      // 0dd: aload 10
      // 0df: bipush 1
      // 0e0: sipush 23293
      // 0e3: sipush 1531
      // 0e6: pop2
      // 0e7: ldc_w "-y"
      // 0ea: aastore
      // 0eb: aload 10
      // 0ed: bipush 2
      // 0ee: sipush 23223
      // 0f1: sipush 4767
      // 0f4: pop2
      // 0f5: ldc_w "-f"
      // 0f8: aastore
      // 0f9: aload 10
      // 0fb: bipush 3
      // 0fc: sipush 23243
      // 0ff: sipush -30954
      // 102: pop2
      // 103: ldc_w "rawvideo"
      // 106: aastore
      // 107: aload 10
      // 109: bipush 4
      // 10a: sipush 23058
      // 10d: sipush -25407
      // 110: pop2
      // 111: ldc_w "-pix_fmt"
      // 114: aastore
      // 115: aload 10
      // 117: bipush 5
      // 118: sipush 23041
      // 11b: sipush 20297
      // 11e: pop2
      // 11f: ldc_w "bgra"
      // 122: aastore
      // 123: aload 10
      // 125: bipush 6
      // 127: sipush 23173
      // 12a: sipush 9768
      // 12d: pop2
      // 12e: ldc_w "-s"
      // 131: aastore
      // 132: aload 10
      // 134: bipush 7
      // 136: aload 0
      // 137: getfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl I
      // 13a: aload 0
      // 13b: getfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI I
      // 13e: invokedynamic makeConcatWithConstants (II)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001x\u0001" ]
      // 143: aastore
      // 144: aload 10
      // 146: bipush 8
      // 148: sipush 23529
      // 14b: sipush 7519
      // 14e: pop2
      // 14f: ldc_w "-r"
      // 152: aastore
      // 153: aload 10
      // 155: bipush 9
      // 157: iload 8
      // 159: invokestatic java/lang/String.valueOf (I)Ljava/lang/String;
      // 15c: aastore
      // 15d: aload 10
      // 15f: bipush 10
      // 161: sipush 23184
      // 164: sipush 9047
      // 167: pop2
      // 168: ldc_w "-i"
      // 16b: aastore
      // 16c: aload 10
      // 16e: bipush 11
      // 170: sipush 23233
      // 173: sipush -27203
      // 176: pop2
      // 177: ldc_w "pipe:"
      // 17a: aastore
      // 17b: aload 10
      // 17d: bipush 12
      // 17f: sipush 23094
      // 182: sipush 15241
      // 185: pop2
      // 186: ldc_w "-vf"
      // 189: aastore
      // 18a: aload 10
      // 18c: bipush 13
      // 18e: sipush 23040
      // 191: sipush 21935
      // 194: pop2
      // 195: ldc_w "vflip,scale=trunc(iw/2)*2:trunc(ih/2)*2"
      // 198: aastore
      // 199: aload 10
      // 19b: bipush 14
      // 19d: sipush 23533
      // 1a0: sipush 20078
      // 1a3: pop2
      // 1a4: ldc_w "-c:v"
      // 1a7: aastore
      // 1a8: aload 10
      // 1aa: bipush 15
      // 1ac: sipush 23052
      // 1af: sipush 25602
      // 1b2: pop2
      // 1b3: ldc_w "libx264"
      // 1b6: aastore
      // 1b7: aload 10
      // 1b9: bipush 16
      // 1bb: sipush 23219
      // 1be: sipush -5550
      // 1c1: pop2
      // 1c2: ldc_w "-preset"
      // 1c5: aastore
      // 1c6: aload 10
      // 1c8: bipush 17
      // 1ca: sipush 23232
      // 1cd: sipush -17592
      // 1d0: pop2
      // 1d1: ldc_w "ultrafast"
      // 1d4: aastore
      // 1d5: aload 10
      // 1d7: bipush 18
      // 1d9: sipush 23123
      // 1dc: sipush 5823
      // 1df: pop2
      // 1e0: ldc_w "-tune"
      // 1e3: aastore
      // 1e4: aload 10
      // 1e6: bipush 19
      // 1e8: sipush 23229
      // 1eb: sipush -20967
      // 1ee: pop2
      // 1ef: ldc_w "zerolatency"
      // 1f2: aastore
      // 1f3: aload 10
      // 1f5: bipush 20
      // 1f7: sipush 23538
      // 1fa: sipush 12603
      // 1fd: pop2
      // 1fe: ldc_w "-crf"
      // 201: aastore
      // 202: aload 10
      // 204: bipush 21
      // 206: sipush 23156
      // 209: sipush -28374
      // 20c: pop2
      // 20d: ldc_w "23"
      // 210: aastore
      // 211: aload 10
      // 213: bipush 22
      // 215: sipush 23058
      // 218: sipush -25407
      // 21b: pop2
      // 21c: ldc_w "-pix_fmt"
      // 21f: aastore
      // 220: aload 10
      // 222: bipush 23
      // 224: sipush 23277
      // 227: sipush -6955
      // 22a: pop2
      // 22b: ldc_w "yuv420p"
      // 22e: aastore
      // 22f: aload 10
      // 231: bipush 24
      // 233: sipush 23223
      // 236: sipush 4767
      // 239: pop2
      // 23a: ldc_w "-f"
      // 23d: aastore
      // 23e: aload 10
      // 240: bipush 25
      // 242: sipush 23283
      // 245: sipush -24700
      // 248: pop2
      // 249: ldc_w "segment"
      // 24c: aastore
      // 24d: aload 10
      // 24f: bipush 26
      // 251: sipush 23195
      // 254: sipush -24673
      // 257: pop2
      // 258: ldc_w "-segment_time"
      // 25b: aastore
      // 25c: aload 10
      // 25e: bipush 27
      // 260: ldc_w "2"
      // 263: aastore
      // 264: aload 10
      // 266: bipush 28
      // 268: sipush 23129
      // 26b: sipush 26100
      // 26e: pop2
      // 26f: ldc_w "-segment_format"
      // 272: aastore
      // 273: aload 10
      // 275: bipush 29
      // 277: sipush 23279
      // 27a: sipush 20459
      // 27d: pop2
      // 27e: ldc_w "mp4"
      // 281: aastore
      // 282: aload 10
      // 284: bipush 30
      // 286: sipush 23079
      // 289: sipush -29973
      // 28c: pop2
      // 28d: ldc_w "-reset_timestamps"
      // 290: aastore
      // 291: aload 10
      // 293: bipush 31
      // 295: ldc_w "1"
      // 298: aastore
      // 299: aload 10
      // 29b: bipush 32
      // 29d: aload 4
      // 29f: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 2a2: getstatic java/io/File.separator Ljava/lang/String;
      // 2a5: iload 7
      // 2a7: ldc_w "s"
      // 2aa: swap
      // 2ab: sipush 23266
      // 2ae: sipush -20525
      // 2b1: pop2
      // 2b2: ldc_w "_%04d.mp4"
      // 2b5: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001" ]
      // 2ba: aastore
      // 2bb: aload 10
      // 2bd: invokestatic kotlin/collections/CollectionsKt.listOf ([Ljava/lang/Object;)Ljava/util/List;
      // 2c0: astore 9
      // 2c2: nop
      // 2c3: sipush 23083
      // 2c6: iload 7
      // 2c8: iload 8
      // 2ca: aload 0
      // 2cb: getfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl I
      // 2ce: aload 0
      // 2cf: getfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI I
      // 2d2: istore 15
      // 2d4: istore 16
      // 2d6: istore 17
      // 2d8: istore 18
      // 2da: sipush -14975
      // 2dd: pop2
      // 2de: ldc_w "Clipping: Starting framebuffer capture (session "
      // 2e1: iload 18
      // 2e3: sipush 23257
      // 2e6: sipush 30061
      // 2e9: pop2
      // 2ea: ldc_w ") at "
      // 2ed: iload 17
      // 2ef: sipush 23189
      // 2f2: sipush -2774
      // 2f5: pop2
      // 2f6: ldc_w "fps, "
      // 2f9: iload 16
      // 2fb: ldc_w "x"
      // 2fe: iload 15
      // 300: invokedynamic makeConcatWithConstants (Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" ]
      // 305: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d (Ljava/lang/String;)V
      // 308: new java/lang/ProcessBuilder
      // 30b: dup
      // 30c: aload 9
      // 30e: invokespecial java/lang/ProcessBuilder.<init> (Ljava/util/List;)V
      // 311: astore 10
      // 313: aload 10
      // 315: bipush 1
      // 316: invokevirtual java/lang/ProcessBuilder.redirectErrorStream (Z)Ljava/lang/ProcessBuilder;
      // 319: pop
      // 31a: aload 0
      // 31b: aload 10
      // 31d: invokevirtual java/lang/ProcessBuilder.start ()Ljava/lang/Process;
      // 320: putfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Ljava/lang/Process;
      // 323: aload 0
      // 324: bipush 1
      // 325: putfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Z
      // 328: aload 0
      // 329: invokestatic java/lang/System.nanoTime ()J
      // 32c: putfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll J
      // 32f: aload 0
      // 330: getfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Ljava/lang/Process;
      // 333: astore 11
      // 335: new java/lang/Thread
      // 338: dup
      // 339: aload 11
      // 33b: aload 0
      // 33c: invokedynamic run (Ljava/lang/Process;Lme/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Process;Lme/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll;)V, ()V ]
      // 341: sipush 23136
      // 344: sipush -27226
      // 347: pop2
      // 348: ldc_w "Clipping-FFmpeg-Drain"
      // 34b: invokespecial java/lang/Thread.<init> (Ljava/lang/Runnable;Ljava/lang/String;)V
      // 34e: astore 12
      // 350: aload 12
      // 352: astore 13
      // 354: bipush 0
      // 355: istore 14
      // 357: aload 13
      // 359: bipush 1
      // 35a: invokevirtual java/lang/Thread.setDaemon (Z)V
      // 35d: aload 12
      // 35f: invokevirtual java/lang/Thread.start ()V
      // 362: aload 0
      // 363: invokespecial me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.aM ()V
      // 366: aload 2
      // 367: ifnonnull 389
      // 36a: iload 1
      // 36b: ifne 3c0
      // 36e: goto 375
      // 371: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 374: athrow
      // 375: sipush 23125
      // 378: sipush 12592
      // 37b: pop2
      // 37c: ldc_w "§aClipping: Recording started! Use §e/clip §ato save."
      // 37f: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 382: goto 389
      // 385: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 388: athrow
      // 389: goto 3c0
      // 38c: astore 10
      // 38e: aload 10
      // 390: sipush 23520
      // 393: sipush -6697
      // 396: pop2
      // 397: ldc_w "Clipping: Failed to start ffmpeg: "
      // 39a: swap
      // 39b: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 3a0: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b (Ljava/lang/String;)V
      // 3a3: aload 10
      // 3a5: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 3a8: sipush 23106
      // 3ab: sipush 4038
      // 3ae: pop2
      // 3af: ldc_w "§cClipping: Failed to start recording: "
      // 3b2: swap
      // 3b3: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 3b8: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 3bb: aload 0
      // 3bc: bipush 0
      // 3bd: putfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Z
      // 3c0: return
   }

   private final void aM() {
      long var1 = 1000000000L / (Long)((me.octo.client.PXDyn)(Object)(IllIllllIIIIIIIIIllllIIlIlIlIlIIIIlIIllIlIlIlIIIllllIlIIIIIlIIlIIIlIIlIIlIlIllllIlIll.b())).O();
      Runnable var10003 = null;
      short var10004 = 23122;
      short var10005 = -32437;
      Thread var3 = new Thread(var10003, "Clipping-FrameWriter");
      boolean var5 = false;
      var3.setDaemon(true);
      this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = var3;
      Thread var10000 = this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
      Intrinsics.checkNotNull(this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll);
      var10000.start();
   }

    private final void aN() {
       if (!this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll) {
          this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = true;
          java.lang.Thread var2 = new java.lang.Thread(this::aQ, "Clipping-Restart");
          var2.setDaemon(true);
          var2.start();
       }
    }

   public final void aO() {
      int[] var1 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      if (var1 == null && !this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI) {
         return;
      }
      this.aQ();
   }

   private final void aP() {
      int[] var1 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      if (var1 != null) {
         return;
      }
      int[] var2 = this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
      if (var2 != null) {
         GL15.glDeleteBuffers(var2);
         this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = null;
         this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = false;
         this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = 0;
      }
   }

   // $VF: Extended synchronized range to monitorexit
   private final void aQ() {
      Object var1 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      synchronized (var1) {
         boolean var2 = false;
         this.aR();
         Unit var5 = Unit.INSTANCE;
      }
   }

   private final void aR() {
      int[] var1 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = false;
      while (true) {
         llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll.poll();
         if (var3 == null) {
            break;
         }
         this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.offer(var3.a());
         if (var1 != null) {
            break;
         }
      }
      this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.clear();
      if (var1 == null) {
         Thread var2 = this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
         if (var2 != null) {
            var2.interrupt();
         }
         this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = null;
         Process var4 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         if (var4 != null && var4.isAlive()) {
            try {
               var4.getOutputStream().close();
            } catch (Exception var5) {
            }
            try {
               if (!var4.waitFor(3L, java.util.concurrent.TimeUnit.SECONDS)) {
                  var4.destroyForcibly();
               }
            } catch (InterruptedException var6) {
            }
         }
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = null;
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private final void aS() {
      Object var42 = null; // PX-FIX
      int[] var10000 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      Object var2 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      int[] var1 = var10000;
      synchronized (var2) {
         boolean var3 = false;

         label195: {
            label204: {
               try {
                  var42 = this;
                  if (var1 != null) {
                     break label204;
                  }

                  if (!this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI) {
                     return;
                  }
               } catch (Exception var32) {
                  throw (RuntimeException)a(var32);
               }

               this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = true;
               boolean var28 = false /* VF: Semaphore variable */;

               try {
                  var28 = true;
                  this.aR();
                  var28 = false;
               } finally {
                  if (var28) {
                     try {
                        this.e(true);
                     } catch (Exception var29) {
                        short var10001 = 23143;
                        short var10002 = 18437;
                        lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b(
                           "Clipping: Failed to resume recording after save snapshot: " + var29
                        );
                        this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = false;
                     } finally {
                        this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = false;
                     }
                  }
               }

               boolean var13 = false /* VF: Semaphore variable */;

               label192: {
                  try {
                     var13 = true;
                     this.e(true);
                     var13 = false;
                     break label192;
                  } catch (Exception var33) {
                     short var43 = 23237;
                     short var44 = -6552;
                     lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b(
                        "Clipping: Failed to resume recording after save snapshot: " + var33
                     );
                     this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = false;
                     var13 = false;
                  } finally {
                     if (var13) {
                        this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = false;
                     }
                  }

                  this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = false;
                  break label195;
               }

               var42 = this;
            }

            this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = false;
         }

         Unit var36 = Unit.INSTANCE;
      }
   }

   static void b(lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll param0, boolean param1, int param2, Object param3) {
      if ((param2 & 1) != 0) {
         param1 = false;
      }

      param0.e(param1);
   }

   public final void e(@NotNull String param1) {
      if (!this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI || this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll) {
         return;
      }

      Thread var3 = new Thread(new Runnable() {
         @Override
         public void run() {
            lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a(lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.this, param1);
         }
      }, "Clipping-SettingRefresh");

      var3.setDaemon(true);
      var3.start();
   }

   public final void a(int var1) {
      a(String.valueOf(this), var1, false, null, 6, null);
   }

   public static CompletableFuture a(lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll param0, int param1, boolean param2, String param3, int param4, Object param5) {
      if ((param4 & 2) != 0) {
         param2 = true;
      }

      if ((param4 & 4) != 0) {
         param3 = "clip";
      }

      return param0.a(param1, param2, param3);
   }

   @NotNull
   public final CompletableFuture<File> a(int param1, boolean param2, @NotNull String param3) {
      int[] var4 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      Intrinsics.checkNotNullParameter(param3, "filePrefix");
      CompletableFuture var5 = new CompletableFuture();
      if (!this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI) {
         if (this.aA() && this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl) {
            if (param2) {
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§eClipping: Recorder is still starting. Try /clip again in a second."); }
         } else if (param2) {
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§cClipping: Not recording! Enable the Clipping module first."); }
         var5.complete(null);
         return var5; }
      String var6 = this.aJ();
      if (var6 == null) {
         if (param2) {
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§cClipping: FFmpeg not found!"); }
         var5.complete(null);
         return var5; }
      File var7 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      if (var7 == null) {
         if (param2) {
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§cClipping: Segment buffer unavailable."); }
         var5.complete(null);
         return var5; }
      File[] var9 = var7.listFiles((java.io.FileFilter) (lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll::d));
      List var8 = var9 == null ? null : ArraysKt.sortedWith((Object[]) var9, (java.util.Comparator) new lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll());
      if (var8 == null || ((Collection) var8).isEmpty()) {
         if (param2) {
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§cClipping: No segments yet. Wait a few seconds and try again."); }
         var5.complete(null);
         return var5; }
      int var9i = param1 > 0 ? param1 : me.octo.client.IllIllllIIIIIIIIIllllIIlIlIlIlIIIIlIIllIlIlIlIIIllllIlIIIIIlIIlIIIlIIlIIlIlIllllIlIll.a().O();
      if (param2 && param1 > 0 && param1 > me.octo.client.IllIllllIIIIIIIIIllllIIlIlIlIlIIIIlIIllIlIlIlIIIllllIlIIIIIlIIlIIIlIIlIIlIlIllllIlIll.a().O()) {
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§cClipping: Requested " + param1 + "s but buffer is " + me.octo.client.IllIllllIIIIIIIIIllllIIlIlIlIlIIIIlIIllIlIlIlIIIllllIlIIIIIlIIlIIIlIIlIIlIlIllllIlIll.a().O() + "s. Saving entire buffer."); }
      long var10 = System.currentTimeMillis() - (long) var9i * 1000L;
      List var12 = new java.util.ArrayList();
      for (Object var19 : (Iterable) var8) {
         File var20 = (File) var19;
         if (var20.lastModified() >= var10) {
            ((Collection) var12).add(var19); } }
      if (var12.isEmpty()) {
         if (param2) {
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§cClipping: No recent segments. Wait a few seconds and try again."); }
         var5.complete(null);
         return var5; }
      if (param2) {
         String var13s = param1 > 0 ? param1 + "s" : "full buffer";
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§eClipping: Saving " + var13s + " clip (" + var12.size() + " segments)..."); }
      int var13 = this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl / 2 * 2;
      int var14 = this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI / 2 * 2;
      me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(new kotlin.jvm.functions.Function0() {
         public Object invoke() {
            return lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a(lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.this, var7, var9i, param2, var5, param3, var6, var13, var14, param1); }
      });
      return var5;
   }

   public final void f(boolean param1) {
      int[] var2 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      if (!param1) {
         if (this.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI) {
            return;
         }

         if (this.aW() != lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
            return;
         }
      }

      this.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI = true;
      me.octo.client.llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.e();
      net.minecraft.network.chat.MutableComponent var3 = net.minecraft.network.chat.Component.literal("\u00a7a\u00a7l[ALLOW]").setStyle(net.minecraft.network.chat.Style.EMPTY.withClickEvent(new net.minecraft.network.chat.ClickEvent.RunCommand("/clip consent allow")).withHoverEvent(new net.minecraft.network.chat.HoverEvent.ShowText((net.minecraft.network.chat.Component) net.minecraft.network.chat.Component.literal("Always save ban clips locally and also upload them to help reduce future bans for other users and players"))));
      kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var3, "setStyle(...)");
      net.minecraft.network.chat.MutableComponent var4 = net.minecraft.network.chat.Component.literal("\u00a7c\u00a7l[DISALLOW]").setStyle(net.minecraft.network.chat.Style.EMPTY.withClickEvent(new net.minecraft.network.chat.ClickEvent.RunCommand("/clip consent disallow")).withHoverEvent(new net.minecraft.network.chat.HoverEvent.ShowText((net.minecraft.network.chat.Component) net.minecraft.network.chat.Component.literal("Save ban clips locally and choose on the ban disconnect screen whether to upload them"))));
      kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var4, "setStyle(...)");
      net.minecraft.network.chat.MutableComponent var5 = net.minecraft.network.chat.Component.literal("\u00a7e\u00a7l[ASK LATER]").setStyle(net.minecraft.network.chat.Style.EMPTY.withClickEvent(new net.minecraft.network.chat.ClickEvent.RunCommand("/clip consent ask")).withHoverEvent(new net.minecraft.network.chat.HoverEvent.ShowText((net.minecraft.network.chat.Component) net.minecraft.network.chat.Component.literal("Keep asking until you choose a mode"))));
      kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var5, "setStyle(...)");
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("\u00a7eClipping: Ban clips are always saved locally. Uploads can help reduce future bans for other users and players.");
      net.minecraft.client.player.LocalPlayer var6 = net.minecraft.client.Minecraft.getInstance().player;
      if (var6 != null) {
         var6.sendSystemMessage(net.minecraft.network.chat.Component.literal("\u00a77Also upload saved ban clips to the backend to help reduce future bans for other users and players? ").append((net.minecraft.network.chat.Component) var3).append((net.minecraft.network.chat.Component) net.minecraft.network.chat.Component.literal(" \u00a78| ")).append((net.minecraft.network.chat.Component) var4).append((net.minecraft.network.chat.Component) net.minecraft.network.chat.Component.literal(" \u00a78| ")).append((net.minecraft.network.chat.Component) var5));
      }
   }

   public static void c(lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll param0, boolean param1, int param2, Object param3) {
      if ((param2 & 1) != 0) {
         param1 = false;
      }

      param0.f(param1);
   }

   public final boolean aT() {
      return this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   }

   public final boolean aU() {
      return ((IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl)IllIllllIIIIIIIIIllllIIlIlIlIlIIIIlIIllIlIlIlIIIllllIlIIIIIlIIlIIIlIIlIIlIlIllllIlIll.f()).al();
   }

   public final int aV() {
      return ((IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl)IllIllllIIIIIIIIIllllIIlIlIlIlIIIIlIIllIlIlIlIIIllllIlIIIIIlIIlIIIlIIlIIlIlIllllIlIll.g()).O();
   }

   @NotNull
   public final lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI aW() {
      String var1 = ((lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII)IllIllllIIIIIIIIIllllIIlIlIlIlIIIIlIIllIlIlIlIIIllllIlIIIIIlIIlIIIlIIlIIlIlIllllIlIll.e()).B();
      if (Intrinsics.areEqual(var1, "Save Only")) {
         return lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      return Intrinsics.areEqual(var1, "Save and Upload")
         ? lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         : lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   public final boolean aX() {
      boolean var10000;
      label16: {
         try {
            if (this.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl != null) {
               var10000 = true;
               break label16;
            }
         } catch (NoWhenBranchMatchedException var2) {
            throw (RuntimeException)a(var2);
         }

         var10000 = false;
      }

      boolean var1 = var10000;
      short var10001 = 23132;
      short var10002 = 32041;
      lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Clipping: hasPendingDisconnectBanClipPrompt=" + var1);
      return var1;
   }

   public final void a(
      @NotNull lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI param1
   ) {
      Object IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll = null; // PX-FIX
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b ()[I
      // 003: aload 1
      // 004: sipush 23185
      // 007: sipush -3558
      // 00a: pop2
      // 00b: ldc_w "mode"
      // 00e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 011: astore 2
      // 012: aload 2
      // 013: ifnonnull 02d
      // 016: aload 0
      // 017: getfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl Lme/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 01a: dup
      // 01b: ifnonnull 02e
      // 01e: goto 025
      // 021: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 024: athrow
      // 025: pop
      // 026: goto 02d
      // 029: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02c: athrow
      // 02d: return
      // 02e: astore 3
      // 02f: aload 0
      // 030: aconst_null
      // 031: putfield me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl Lme/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 034: aload 1
      // 035: aload 3
      // 036: invokevirtual me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a ()Ljava/io/File;
      // 039: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 03c: aload 3
      // 03d: invokevirtual me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.b ()Ljava/lang/String;
      // 040: astore 7
      // 042: astore 8
      // 044: astore 9
      // 046: sipush 23221
      // 049: sipush -25983
      // 04c: pop2
      // 04d: ldc_w "Clipping: resolving pending ban clip decision mode="
      // 050: aload 9
      // 052: sipush 23271
      // 055: sipush 5940
      // 058: pop2
      // 059: ldc_w " file="
      // 05c: aload 8
      // 05e: sipush 23072
      // 061: sipush 12501
      // 064: pop2
      // 065: ldc_w " banId="
      // 068: aload 7
      // 06a: invokedynamic makeConcatWithConstants (Ljava/lang/String;Lme/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001\u0001" ]
      // 06f: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d (Ljava/lang/String;)V
      // 072: aload 2
      // 073: ifnonnull 0a7
      // 076: aload 1
      // 077: getstatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII [I
      // 07a: swap
      // 07b: invokevirtual me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.ordinal ()I
      // 07e: iaload
      // 07f: tableswitch 439 1 3 311 179 29
      // 098: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09b: athrow
      // 09c: getstatic kotlin/jvm/internal/StringCompanionObject.INSTANCE Lkotlin/jvm/internal/StringCompanionObject;
      // 09f: pop
      // 0a0: goto 0a7
      // 0a3: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a6: athrow
      // 0a7: sipush 23096
      // 0aa: sipush 5345
      // 0ad: pop2
      // 0ae: ldc_w "%.1f"
      // 0b1: astore 5
      // 0b3: bipush 1
      // 0b4: anewarray 132
      // 0b7: astore 6
      // 0b9: aload 6
      // 0bb: bipush 0
      // 0bc: aload 3
      // 0bd: invokevirtual me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a ()Ljava/io/File;
      // 0c0: invokevirtual java/io/File.length ()J
      // 0c3: l2d
      // 0c4: ldc2_w 1048576.0
      // 0c7: ddiv
      // 0c8: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 0cb: aastore
      // 0cc: aload 6
      // 0ce: astore 6
      // 0d0: aload 5
      // 0d2: aload 6
      // 0d4: aload 6
      // 0d6: arraylength
      // 0d7: invokestatic java/util/Arrays.copyOf ([Ljava/lang/Object;I)[Ljava/lang/Object;
      // 0da: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 0dd: dup
      // 0de: sipush 23140
      // 0e1: sipush -8310
      // 0e4: pop2
      // 0e5: ldc_w "format(...)"
      // 0e8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0eb: astore 4
      // 0ed: aload 3
      // 0ee: invokevirtual me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a ()Ljava/io/File;
      // 0f1: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 0f4: aload 4
      // 0f6: sipush 23550
      // 0f9: sipush -3418
      // 0fc: pop2
      // 0fd: ldc_w "§eClipping: Uploading saved ban clip §f"
      // 100: dup_x2
      // 101: pop
      // 102: sipush 23252
      // 105: sipush -28619
      // 108: pop2
      // 109: ldc_w " §7("
      // 10c: swap
      // 10d: sipush 23155
      // 110: sipush 26034
      // 113: pop2
      // 114: ldc_w "MB) to the backend..."
      // 117: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001" ]
      // 11c: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 11f: aload 3
      // 120: invokevirtual me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a ()Ljava/io/File;
      // 123: aload 3
      // 124: invokevirtual me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.b ()Ljava/lang/String;
      // 127: aload 3
      // 128: invokevirtual me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.c ()J
      // 12b: invokestatic me/octo/client/utils/lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.a (Ljava/io/File;Ljava/lang/String;J)V
      // 12e: aload 2
      // 12f: ifnull 242
      // 132: getstatic kotlin/jvm/internal/StringCompanionObject.INSTANCE Lkotlin/jvm/internal/StringCompanionObject;
      // 135: pop
      // 136: sipush 23096
      // 139: sipush 5345
      // 13c: pop2
      // 13d: ldc_w "%.1f"
      // 140: astore 5
      // 142: bipush 1
      // 143: anewarray 132
      // 146: astore 6
      // 148: aload 6
      // 14a: bipush 0
      // 14b: aload 3
      // 14c: invokevirtual me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a ()Ljava/io/File;
      // 14f: invokevirtual java/io/File.length ()J
      // 152: l2d
      // 153: ldc2_w 1048576.0
      // 156: ddiv
      // 157: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 15a: aastore
      // 15b: aload 6
      // 15d: astore 6
      // 15f: aload 5
      // 161: aload 6
      // 163: aload 6
      // 165: arraylength
      // 166: invokestatic java/util/Arrays.copyOf ([Ljava/lang/Object;I)[Ljava/lang/Object;
      // 169: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 16c: dup
      // 16d: sipush 23140
      // 170: sipush -8310
      // 173: pop2
      // 174: ldc_w "format(...)"
      // 177: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 17a: astore 4
      // 17c: aload 3
      // 17d: invokevirtual me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a ()Ljava/io/File;
      // 180: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 183: aload 4
      // 185: sipush 23216
      // 188: sipush 22621
      // 18b: pop2
      // 18c: ldc_w "§aClipping: Kept ban clip §f"
      // 18f: dup_x2
      // 190: pop
      // 191: sipush 23050
      // 194: sipush 18306
      // 197: pop2
      // 198: ldc_w " §7("
      // 19b: swap
      // 19c: sipush 23080
      // 19f: sipush 21588
      // 1a2: pop2
      // 1a3: ldc_w "MB) locally."
      // 1a6: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001" ]
      // 1ab: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 1ae: aload 0
      // 1af: invokevirtual me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.aY ()V
      // 1b2: aload 2
      // 1b3: ifnull 242
      // 1b6: getstatic kotlin/jvm/internal/StringCompanionObject.INSTANCE Lkotlin/jvm/internal/StringCompanionObject;
      // 1b9: pop
      // 1ba: sipush 23096
      // 1bd: sipush 5345
      // 1c0: pop2
      // 1c1: ldc_w "%.1f"
      // 1c4: astore 5
      // 1c6: bipush 1
      // 1c7: anewarray 132
      // 1ca: astore 6
      // 1cc: aload 6
      // 1ce: bipush 0
      // 1cf: aload 3
      // 1d0: invokevirtual me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a ()Ljava/io/File;
      // 1d3: invokevirtual java/io/File.length ()J
      // 1d6: l2d
      // 1d7: ldc2_w 1048576.0
      // 1da: ddiv
      // 1db: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 1de: aastore
      // 1df: aload 6
      // 1e1: astore 6
      // 1e3: aload 5
      // 1e5: aload 6
      // 1e7: aload 6
      // 1e9: arraylength
      // 1ea: invokestatic java/util/Arrays.copyOf ([Ljava/lang/Object;I)[Ljava/lang/Object;
      // 1ed: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 1f0: dup
      // 1f1: sipush 23140
      // 1f4: sipush -8310
      // 1f7: pop2
      // 1f8: ldc_w "format(...)"
      // 1fb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1fe: astore 4
      // 200: aload 3
      // 201: invokevirtual me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a ()Ljava/io/File;
      // 204: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 207: aload 4
      // 209: sipush 23192
      // 20c: sipush 22962
      // 20f: pop2
      // 210: ldc_w "§eClipping: Kept ban clip §f"
      // 213: dup_x2
      // 214: pop
      // 215: sipush 23050
      // 218: sipush 18306
      // 21b: pop2
      // 21c: ldc_w " §7("
      // 21f: swap
      // 220: sipush 23194
      // 223: sipush -2397
      // 226: pop2
      // 227: ldc_w "MB) locally."
      // 22a: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001" ]
      // 22f: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 232: aload 2
      // 233: ifnull 242
      // 236: new kotlin/NoWhenBranchMatchedException
      // 239: dup
      // 23a: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
      // 23d: athrow
      // 23e: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 241: athrow
      // 242: return
   }

   public final void a(@NotNull lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI param1, boolean param2) {
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      Intrinsics.checkNotNullParameter(param1, "mode");
      int modeIndex;
      try {
         if (param1 == lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
            modeIndex = 0;
         } else if (param1 == lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
            modeIndex = 1;
         } else if (param1 == lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
            modeIndex = 2;
         } else {
            throw new NoWhenBranchMatchedException();
         }
      } catch (NoWhenBranchMatchedException var2) {
         throw (RuntimeException)a(var2);
      }

      try {
         me.octo.client.IllIllllIIIIIIIIIllllIIlIlIlIlIIIIlIIllIlIlIlIIIllllIlIIIIIlIIlIIIlIIlIIlIlIllllIlIll.e().c(modeIndex);
      } catch (NoWhenBranchMatchedException var2) {
         throw (RuntimeException)a(var2);
      }

      try {
         this.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI = param1 != lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         me.octo.client.llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.e();
      } catch (NoWhenBranchMatchedException var2) {
         throw (RuntimeException)a(var2);
      }

      if (param2) {
         String var3;
         try {
            if (param1 == lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               var3 = "\u00a7eClipping: Ban clips will be saved locally, and you'll choose on the ban disconnect screen whether to also upload them.";
            } else if (param1 == lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
               var3 = "\u00a7aClipping: Ban clips will be saved locally only.";
            } else if (param1 == lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
               var3 = "\u00a7aClipping: Ban clips will be saved locally and also uploaded automatically.";
            } else {
               throw new NoWhenBranchMatchedException();
            }
         } catch (NoWhenBranchMatchedException var2) {
            throw (RuntimeException)a(var2);
         }

         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c(var3);
      }

      try {
         if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
            IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b(new int[5]);
         }
      } catch (NoWhenBranchMatchedException var2) {
         throw (RuntimeException)a(var2);
      }   }

   public static void a(lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll param0, lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI param1, boolean param2, int param3, Object param4) {
      if ((param3 & 2) != 0) {
         param2 = true;
      }

      param0.a(param1, param2);
   }

   public final void a(@NotNull String param1, long param2) {
      int[] var4 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      if (!this.aT()) {
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Clipping: Ban detected but recording was not running");
         return;
      }

      lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var5 = this.aW();
      me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Clipping: handleBanDetected id=" + param1 + " timestamp=" + param2 + " mode=" + var5);
      this.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl = null;
      this.a(-1, false, "banclip_" + param1).whenComplete(new java.util.function.BiConsumer<java.io.File, Throwable>() {
         public void accept(java.io.File var0x, Throwable var1x) {
            lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a(param1, var5, param2, lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.this, var0x, var1x);
         }
      });
   }

   public final void aY() {
      String[] var11 = null; // PX-FIX
      Object var10 = null; // PX-FIX
      Object IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll = null; // PX-FIX
      int[] var10000 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      File var2 = this.ah();
      int[] var1 = var10000;

      try {
         label35: {
   pxClinit: {
            label34: {
               label33: {
                  try {
                     var10 = ((int[])lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)[this.ag()
                        .ordinal()];
                     if (var1 != null) {
                        break label34;
                     }

                     switch ((Integer)(var10)) {
                        case 1:
                           break;
                        case 2:
                           break label33;
                        case 3:
                           break pxClinit;
                        default:
                           throw new NoWhenBranchMatchedException();
                     }
                  } catch (Exception var6) {
                     throw (RuntimeException)a(var6);
                  }

                  var10 = 2;
                  break label34;
               }

               String[] var5 = new String[2];
               short var12 = 23178;
               short var10003 = 18204;
               var5[0] = "xdg-open";
               var5[1] = var2.getAbsolutePath();
               var11 = var5;
               break label35;
            }

            String[] var8 = new String[((Integer)(var10))];
            short var13 = 23246;
            short var14 = 24985;
            var8[0] = "explorer";
            var8[1] = var2.getAbsolutePath();
            var11 = var8;
         }
}

         String[] var3 = var11;
         Runtime.getRuntime().exec(var3);
      } catch (Exception var7) {
         String var9 = var7.getMessage();
         short var10001 = 23111;
         short var10002 = -16349;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
            "§cClipping: Failed to open folder: " + var9
         );
      }
   }

   private final String a(String param1, File param2) {
      int[] var3 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      if (var3 == null && this.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI) { return this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll; }
      String text;
      try {
         ProcessBuilder var4 = new ProcessBuilder(param1, "-encoders", "-v", "quiet").redirectErrorStream(true);
         Process var5 = var4.start();
         InputStream var6 = var5.getInputStream();
         Intrinsics.checkNotNullExpressionValue(var6, "getInputStream(...)");
         Charset var7 = Charsets.UTF_8;
         Reader var9 = (Reader)(Object)new BufferedReader(new InputStreamReader(var6, var7), 8192);
         text = TextStreamsKt.readText(var9);
         var5.waitFor(5L, TimeUnit.SECONDS);
      } catch (Exception var8) {
         text = "";
      }
      String var9b = text;
      for (String var11 : CollectionsKt.listOf(new String[]{"h264_nvenc", "h264_amf", "h264_qsv"})) {
         if (!StringsKt.contains((CharSequence)var9b, (CharSequence)var11, false)) {
            me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d(var11 + "Clipping:" + " not in FFmpeg build, skipping");
            try {
               ProcessBuilder var12 = new ProcessBuilder(param1, "-v", "error", "-t", "0.5", "-i", param2.getAbsolutePath(), "-c:v", var11, "-f", "null", "-").redirectErrorStream(true);
               Process var13 = var12.start();
               InputStream var14 = var13.getInputStream();
               Intrinsics.checkNotNullExpressionValue(var14, "getInputStream(...)");
               Charset var15c = Charsets.UTF_8;
               Reader var16r = (Reader)(Object)new BufferedReader(new InputStreamReader(var14, var15c), 8192);
               String var15 = TextStreamsKt.readText(var16r);
               if (var13.waitFor(10L, TimeUnit.SECONDS) && var13.exitValue() == 0) {
                  me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Clipping: using hardware encoder" + var11);
                  this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = var11;
                  this.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = true;
                  return var11;
               }
               var13.destroyForcibly();
               me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Clipping: " + StringsKt.take(var15, 300) + " probe failed:");
            } catch (Exception var17) {
               me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Clipping: " + var17 + " probe exception:");
            }
         }
      }
      this.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = true;
      this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = null;
      return null;
   }

   private final void a(File param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b ()[I
      // 003: aload 1
      // 004: invokevirtual java/io/File.length ()J
      // 007: lstore 4
      // 009: aload 1
      // 00a: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 00d: sipush 23202
      // 010: sipush 20341
      // 013: pop2
      // 014: ldc_w "§eClipping: Compressing §e"
      // 017: swap
      // 018: sipush 23241
      // 01b: sipush -11494
      // 01e: pop2
      // 01f: ldc_w "§e..."
      // 022: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 027: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 02a: astore 3
      // 02b: new java/io/File
      // 02e: dup
      // 02f: aload 1
      // 030: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 033: aload 1
      // 034: invokestatic kotlin/io/FilesKt.getNameWithoutExtension (Ljava/io/File;)Ljava/lang/String;
      // 037: sipush 23150
      // 03a: sipush -7678
      // 03d: pop2
      // 03e: ldc_w "_tmp.mp4"
      // 041: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 046: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 049: astore 6
      // 04b: nop
      // 04c: invokestatic me/octo/client/IllIllllIIIIIIIIIllllIIlIlIlIlIIIIlIIllIlIlIlIIIllllIlIIIIIlIIlIIIlIIlIIlIlIllllIlIll.d ()Lme/octo/client/lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII;
      // 04f: invokevirtual me/octo/client/lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII.B ()Ljava/lang/String;
      // 052: astore 8
      // 054: aload 8
      // 056: sipush 23172
      // 059: sipush -27145
      // 05c: pop2
      // 05d: ldc_w "High Quality"
      // 060: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 063: aload 3
      // 064: ifnonnull 09c
      // 067: ifeq 082
      // 06a: goto 071
      // 06d: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 070: athrow
      // 071: sipush 23091
      // 074: sipush -12216
      // 077: pop2
      // 078: ldc_w "20"
      // 07b: goto 0b6
      // 07e: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 081: athrow
      // 082: aload 8
      // 084: aload 3
      // 085: ifnonnull 0a9
      // 088: sipush 23264
      // 08b: sipush -18880
      // 08e: pop2
      // 08f: ldc_w "Small File"
      // 092: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 095: goto 09c
      // 098: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09b: athrow
      // 09c: ifeq 0ac
      // 09f: sipush 23258
      // 0a2: sipush -19739
      // 0a5: pop2
      // 0a6: ldc_w "32"
      // 0a9: goto 0b6
      // 0ac: sipush 23077
      // 0af: sipush -15128
      // 0b2: pop2
      // 0b3: ldc_w "26"
      // 0b6: astore 7
      // 0b8: aload 0
      // 0b9: aload 2
      // 0ba: aload 1
      // 0bb: invokespecial me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/String;Ljava/io/File;)Ljava/lang/String;
      // 0be: astore 9
      // 0c0: aload 9
      // 0c2: aload 3
      // 0c3: ifnonnull 0d2
      // 0c6: ifnull 307
      // 0c9: goto 0d0
      // 0cc: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cf: athrow
      // 0d0: aload 9
      // 0d2: invokevirtual java/lang/String.hashCode ()I
      // 0d5: aload 3
      // 0d6: ifnonnull 309
      // 0d9: lookupswitch 558 3 -2082943973 39 -408883709 78 -408868131 110
      // 0fc: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ff: athrow
      // 100: aload 9
      // 102: sipush 23527
      // 105: sipush -12374
      // 108: pop2
      // 109: ldc_w "h264_nvenc"
      // 10c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 10f: aload 3
      // 110: ifnonnull 169
      // 113: goto 11a
      // 116: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 119: athrow
      // 11a: ifne 167
      // 11d: goto 124
      // 120: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 123: athrow
      // 124: goto 307
      // 127: aload 9
      // 129: sipush 23078
      // 12c: sipush -3963
      // 12f: pop2
      // 130: ldc_w "h264_amf"
      // 133: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 136: aload 3
      // 137: ifnonnull 200
      // 13a: ifne 1fe
      // 13d: goto 144
      // 140: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 143: athrow
      // 144: goto 307
      // 147: aload 9
      // 149: sipush 23076
      // 14c: sipush -12051
      // 14f: pop2
      // 150: ldc_w "h264_qsv"
      // 153: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 156: aload 3
      // 157: ifnonnull 297
      // 15a: ifne 295
      // 15d: goto 164
      // 160: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 163: athrow
      // 164: goto 307
      // 167: bipush 10
      // 169: anewarray 176
      // 16c: astore 10
      // 16e: aload 10
      // 170: bipush 0
      // 171: sipush 23250
      // 174: sipush -6410
      // 177: pop2
      // 178: ldc_w "-c:v"
      // 17b: aastore
      // 17c: aload 10
      // 17e: bipush 1
      // 17f: sipush 23222
      // 182: sipush 30866
      // 185: pop2
      // 186: ldc_w "h264_nvenc"
      // 189: aastore
      // 18a: aload 10
      // 18c: bipush 2
      // 18d: sipush 23281
      // 190: sipush -22575
      // 193: pop2
      // 194: ldc_w "-preset"
      // 197: aastore
      // 198: aload 10
      // 19a: bipush 3
      // 19b: sipush 23074
      // 19e: sipush -28447
      // 1a1: pop2
      // 1a2: ldc_w "fast"
      // 1a5: aastore
      // 1a6: aload 10
      // 1a8: bipush 4
      // 1a9: sipush 23196
      // 1ac: sipush -31969
      // 1af: pop2
      // 1b0: ldc_w "-rc:v"
      // 1b3: aastore
      // 1b4: aload 10
      // 1b6: bipush 5
      // 1b7: sipush 23204
      // 1ba: sipush 24801
      // 1bd: pop2
      // 1be: ldc_w "vbr"
      // 1c1: aastore
      // 1c2: aload 10
      // 1c4: bipush 6
      // 1c6: sipush 23043
      // 1c9: sipush 21559
      // 1cc: pop2
      // 1cd: ldc_w "-cq:v"
      // 1d0: aastore
      // 1d1: aload 10
      // 1d3: bipush 7
      // 1d5: aload 7
      // 1d7: aastore
      // 1d8: aload 10
      // 1da: bipush 8
      // 1dc: sipush 23104
      // 1df: sipush 14664
      // 1e2: pop2
      // 1e3: ldc_w "-pix_fmt"
      // 1e6: aastore
      // 1e7: aload 10
      // 1e9: bipush 9
      // 1eb: sipush 23138
      // 1ee: sipush -13673
      // 1f1: pop2
      // 1f2: ldc_w "yuv420p"
      // 1f5: aastore
      // 1f6: aload 10
      // 1f8: invokestatic kotlin/collections/CollectionsKt.listOf ([Ljava/lang/Object;)Ljava/util/List;
      // 1fb: goto 37d
      // 1fe: bipush 10
      // 200: anewarray 176
      // 203: astore 10
      // 205: aload 10
      // 207: bipush 0
      // 208: sipush 23533
      // 20b: sipush 20078
      // 20e: pop2
      // 20f: ldc_w "-c:v"
      // 212: aastore
      // 213: aload 10
      // 215: bipush 1
      // 216: sipush 23121
      // 219: sipush 15999
      // 21c: pop2
      // 21d: ldc_w "h264_amf"
      // 220: aastore
      // 221: aload 10
      // 223: bipush 2
      // 224: sipush 23051
      // 227: sipush -688
      // 22a: pop2
      // 22b: ldc_w "-quality"
      // 22e: aastore
      // 22f: aload 10
      // 231: bipush 3
      // 232: sipush 23087
      // 235: sipush 30894
      // 238: pop2
      // 239: ldc_w "speed"
      // 23c: aastore
      // 23d: aload 10
      // 23f: bipush 4
      // 240: sipush 23152
      // 243: sipush 22630
      // 246: pop2
      // 247: ldc_w "-rc"
      // 24a: aastore
      // 24b: aload 10
      // 24d: bipush 5
      // 24e: sipush 23278
      // 251: sipush 26911
      // 254: pop2
      // 255: ldc_w "cqp"
      // 258: aastore
      // 259: aload 10
      // 25b: bipush 6
      // 25d: sipush 23114
      // 260: sipush -16704
      // 263: pop2
      // 264: ldc_w "-qp_i"
      // 267: aastore
      // 268: aload 10
      // 26a: bipush 7
      // 26c: aload 7
      // 26e: aastore
      // 26f: aload 10
      // 271: bipush 8
      // 273: sipush 23058
      // 276: sipush -25407
      // 279: pop2
      // 27a: ldc_w "-pix_fmt"
      // 27d: aastore
      // 27e: aload 10
      // 280: bipush 9
      // 282: sipush 23277
      // 285: sipush -6955
      // 288: pop2
      // 289: ldc_w "yuv420p"
      // 28c: aastore
      // 28d: aload 10
      // 28f: invokestatic kotlin/collections/CollectionsKt.listOf ([Ljava/lang/Object;)Ljava/util/List;
      // 292: goto 37d
      // 295: bipush 8
      // 297: anewarray 176
      // 29a: astore 10
      // 29c: aload 10
      // 29e: bipush 0
      // 29f: sipush 23533
      // 2a2: sipush 20078
      // 2a5: pop2
      // 2a6: ldc_w "-c:v"
      // 2a9: aastore
      // 2aa: aload 10
      // 2ac: bipush 1
      // 2ad: sipush 23534
      // 2b0: sipush 22062
      // 2b3: pop2
      // 2b4: ldc_w "h264_qsv"
      // 2b7: aastore
      // 2b8: aload 10
      // 2ba: bipush 2
      // 2bb: sipush 23201
      // 2be: sipush 9442
      // 2c1: pop2
      // 2c2: ldc_w "-global_quality"
      // 2c5: aastore
      // 2c6: aload 10
      // 2c8: bipush 3
      // 2c9: aload 7
      // 2cb: aastore
      // 2cc: aload 10
      // 2ce: bipush 4
      // 2cf: sipush 23197
      // 2d2: sipush -12228
      // 2d5: pop2
      // 2d6: ldc_w "-look_ahead"
      // 2d9: aastore
      // 2da: aload 10
      // 2dc: bipush 5
      // 2dd: ldc_w "0"
      // 2e0: aastore
      // 2e1: aload 10
      // 2e3: bipush 6
      // 2e5: sipush 23058
      // 2e8: sipush -25407
      // 2eb: pop2
      // 2ec: ldc_w "-pix_fmt"
      // 2ef: aastore
      // 2f0: aload 10
      // 2f2: bipush 7
      // 2f4: sipush 23531
      // 2f7: sipush 10655
      // 2fa: pop2
      // 2fb: ldc_w "nv12"
      // 2fe: aastore
      // 2ff: aload 10
      // 301: invokestatic kotlin/collections/CollectionsKt.listOf ([Ljava/lang/Object;)Ljava/util/List;
      // 304: goto 37d
      // 307: bipush 8
      // 309: anewarray 176
      // 30c: astore 10
      // 30e: aload 10
      // 310: bipush 0
      // 311: sipush 23533
      // 314: sipush 20078
      // 317: pop2
      // 318: ldc_w "-c:v"
      // 31b: aastore
      // 31c: aload 10
      // 31e: bipush 1
      // 31f: sipush 23217
      // 322: sipush 16178
      // 325: pop2
      // 326: ldc_w "libx264"
      // 329: aastore
      // 32a: aload 10
      // 32c: bipush 2
      // 32d: sipush 23219
      // 330: sipush -5550
      // 333: pop2
      // 334: ldc_w "-preset"
      // 337: aastore
      // 338: aload 10
      // 33a: bipush 3
      // 33b: sipush 23158
      // 33e: sipush 1562
      // 341: pop2
      // 342: ldc_w "veryfast"
      // 345: aastore
      // 346: aload 10
      // 348: bipush 4
      // 349: sipush 23249
      // 34c: sipush 30122
      // 34f: pop2
      // 350: ldc_w "-crf"
      // 353: aastore
      // 354: aload 10
      // 356: bipush 5
      // 357: aload 7
      // 359: aastore
      // 35a: aload 10
      // 35c: bipush 6
      // 35e: sipush 23058
      // 361: sipush -25407
      // 364: pop2
      // 365: ldc_w "-pix_fmt"
      // 368: aastore
      // 369: aload 10
      // 36b: bipush 7
      // 36d: sipush 23277
      // 370: sipush -6955
      // 373: pop2
      // 374: ldc_w "yuv420p"
      // 377: aastore
      // 378: aload 10
      // 37a: invokestatic kotlin/collections/CollectionsKt.listOf ([Ljava/lang/Object;)Ljava/util/List;
      // 37d: astore 8
      // 37f: bipush 4
      // 380: anewarray 176
      // 383: astore 10
      // 385: aload 10
      // 387: bipush 0
      // 388: aload 2
      // 389: aastore
      // 38a: aload 10
      // 38c: bipush 1
      // 38d: sipush 23061
      // 390: sipush 15049
      // 393: pop2
      // 394: ldc_w "-y"
      // 397: aastore
      // 398: aload 10
      // 39a: bipush 2
      // 39b: sipush 23282
      // 39e: sipush 15874
      // 3a1: pop2
      // 3a2: ldc_w "-i"
      // 3a5: aastore
      // 3a6: aload 10
      // 3a8: bipush 3
      // 3a9: aload 1
      // 3aa: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 3ad: aastore
      // 3ae: aload 10
      // 3b0: invokestatic kotlin/collections/CollectionsKt.listOf ([Ljava/lang/Object;)Ljava/util/List;
      // 3b3: checkcast java/util/Collection
      // 3b6: aload 8
      // 3b8: checkcast java/lang/Iterable
      // 3bb: invokestatic kotlin/collections/CollectionsKt.plus (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
      // 3be: checkcast java/util/Collection
      // 3c1: bipush 3
      // 3c2: anewarray 176
      // 3c5: astore 10
      // 3c7: aload 10
      // 3c9: bipush 0
      // 3ca: sipush 23069
      // 3cd: sipush -29903
      // 3d0: pop2
      // 3d1: ldc_w "-movflags"
      // 3d4: aastore
      // 3d5: aload 10
      // 3d7: bipush 1
      // 3d8: sipush 23276
      // 3db: sipush -28778
      // 3de: pop2
      // 3df: ldc_w "+faststart"
      // 3e2: aastore
      // 3e3: aload 10
      // 3e5: bipush 2
      // 3e6: aload 6
      // 3e8: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 3eb: aastore
      // 3ec: aload 10
      // 3ee: invokestatic kotlin/collections/CollectionsKt.listOf ([Ljava/lang/Object;)Ljava/util/List;
      // 3f1: checkcast java/lang/Iterable
      // 3f4: invokestatic kotlin/collections/CollectionsKt.plus (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
      // 3f7: astore 9
      // 3f9: new java/lang/ProcessBuilder
      // 3fc: dup
      // 3fd: aload 9
      // 3ff: invokespecial java/lang/ProcessBuilder.<init> (Ljava/util/List;)V
      // 402: bipush 1
      // 403: invokevirtual java/lang/ProcessBuilder.redirectErrorStream (Z)Ljava/lang/ProcessBuilder;
      // 406: invokevirtual java/lang/ProcessBuilder.start ()Ljava/lang/Process;
      // 409: astore 10
      // 40b: aload 10
      // 40d: invokevirtual java/lang/Process.getInputStream ()Ljava/io/InputStream;
      // 410: dup
      // 411: sipush 23274
      // 414: sipush -4167
      // 417: pop2
      // 418: ldc_w "getInputStream(...)"
      // 41b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 41e: astore 11
      // 420: getstatic kotlin/text/Charsets.UTF_8 Ljava/nio/charset/Charset;
      // 423: astore 12
      // 425: new java/io/InputStreamReader
      // 428: dup
      // 429: aload 11
      // 42b: aload 12
      // 42d: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
      // 430: checkcast java/io/Reader
      // 433: astore 13
      // 435: sipush 8192
      // 438: istore 14
      // 43a: aload 13
      // 43c: aload 3
      // 43d: ifnonnull 456
      // 440: instanceof java/io/BufferedReader
      // 443: ifeq 45c
      // 446: goto 44d
      // 449: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44c: athrow
      // 44d: aload 13
      // 44f: goto 456
      // 452: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 455: athrow
      // 456: checkcast java/io/BufferedReader
      // 459: goto 467
      // 45c: new java/io/BufferedReader
      // 45f: dup
      // 460: aload 13
      // 462: iload 14
      // 464: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;I)V
      // 467: checkcast java/io/Reader
      // 46a: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.j (Ljava/lang/String;)Lkotlin/Unit;, (Ljava/lang/String;)Lkotlin/Unit; ]
      // 46f: invokestatic kotlin/io/TextStreamsKt.forEachLine (Ljava/io/Reader;Lkotlin/jvm/functions/Function1;)V
      // 472: aload 10
      // 474: ldc2_w 300
      // 477: getstatic java/util/concurrent/TimeUnit.SECONDS Ljava/util/concurrent/TimeUnit;
      // 47a: invokevirtual java/lang/Process.waitFor (JLjava/util/concurrent/TimeUnit;)Z
      // 47d: pop
      // 47e: aload 10
      // 480: invokevirtual java/lang/Process.isAlive ()Z
      // 483: aload 3
      // 484: ifnonnull 4a3
      // 487: ifeq 49e
      // 48a: goto 491
      // 48d: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 490: athrow
      // 491: aload 10
      // 493: invokevirtual java/lang/Process.destroyForcibly ()Ljava/lang/Process;
      // 496: pop
      // 497: goto 49e
      // 49a: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49d: athrow
      // 49e: aload 6
      // 4a0: invokevirtual java/io/File.exists ()Z
      // 4a3: aload 3
      // 4a4: ifnonnull 5a2
      // 4a7: ifeq 596
      // 4aa: goto 4b1
      // 4ad: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b0: athrow
      // 4b1: aload 6
      // 4b3: invokevirtual java/io/File.length ()J
      // 4b6: lconst_0
      // 4b7: lcmp
      // 4b8: aload 3
      // 4b9: ifnonnull 5a2
      // 4bc: goto 4c3
      // 4bf: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c2: athrow
      // 4c3: ifle 596
      // 4c6: goto 4cd
      // 4c9: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4cc: athrow
      // 4cd: aload 6
      // 4cf: invokevirtual java/io/File.length ()J
      // 4d2: lload 4
      // 4d4: lcmp
      // 4d5: aload 3
      // 4d6: ifnonnull 584
      // 4d9: goto 4e0
      // 4dc: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4df: athrow
      // 4e0: ifge 57f
      // 4e3: goto 4ea
      // 4e6: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e9: athrow
      // 4ea: aload 1
      // 4eb: invokevirtual java/io/File.delete ()Z
      // 4ee: pop
      // 4ef: sipush 23081
      // 4f2: aload 6
      // 4f4: aload 1
      // 4f5: invokevirtual java/io/File.renameTo (Ljava/io/File;)Z
      // 4f8: pop
      // 4f9: sipush 15312
      // 4fc: getstatic kotlin/jvm/internal/StringCompanionObject.INSTANCE Lkotlin/jvm/internal/StringCompanionObject;
      // 4ff: pop
      // 500: pop2
      // 501: ldc_w "%.1f"
      // 504: astore 13
      // 506: bipush 1
      // 507: anewarray 132
      // 50a: astore 14
      // 50c: aload 14
      // 50e: bipush 0
      // 50f: aload 1
      // 510: invokevirtual java/io/File.length ()J
      // 513: l2d
      // 514: ldc2_w 1048576.0
      // 517: ddiv
      // 518: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 51b: aastore
      // 51c: aload 14
      // 51e: astore 14
      // 520: aload 13
      // 522: aload 14
      // 524: aload 14
      // 526: arraylength
      // 527: invokestatic java/util/Arrays.copyOf ([Ljava/lang/Object;I)[Ljava/lang/Object;
      // 52a: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 52d: dup
      // 52e: sipush 23206
      // 531: sipush -27886
      // 534: pop2
      // 535: ldc_w "format(...)"
      // 538: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 53b: astore 11
      // 53d: dconst_1
      // 53e: aload 1
      // 53f: invokevirtual java/io/File.length ()J
      // 542: l2d
      // 543: lload 4
      // 545: l2d
      // 546: ddiv
      // 547: dsub
      // 548: bipush 100
      // 54a: i2d
      // 54b: dmul
      // 54c: d2i
      // 54d: istore 12
      // 54f: aload 11
      // 551: iload 12
      // 553: sipush 23162
      // 556: sipush -30096
      // 559: pop2
      // 55a: ldc_w "§aClipping: Compressed to §e"
      // 55d: dup_x2
      // 55e: pop
      // 55f: sipush 23247
      // 562: sipush 6025
      // 565: pop2
      // 566: ldc_w "MB §a(saved "
      // 569: swap
      // 56a: sipush 23170
      // 56d: sipush -2358
      // 570: pop2
      // 571: ldc_w "%)"
      // 574: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001" ]
      // 579: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 57c: goto 5e8
      // 57f: aload 6
      // 581: invokevirtual java/io/File.delete ()Z
      // 584: pop
      // 585: sipush 23236
      // 588: sipush 23845
      // 58b: pop2
      // 58c: ldc_w "§eClipping: Compression would have increased file size, original kept."
      // 58f: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 592: aload 3
      // 593: ifnull 5e8
      // 596: aload 6
      // 598: invokevirtual java/io/File.delete ()Z
      // 59b: goto 5a2
      // 59e: invokestatic me/octo/client/lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a1: athrow
      // 5a2: pop
      // 5a3: sipush 23198
      // 5a6: sipush 10993
      // 5a9: pop2
      // 5aa: ldc_w "§cClipping: Compression failed, original kept."
      // 5ad: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 5b0: goto 5e8
      // 5b3: astore 7
      // 5b5: aload 6
      // 5b7: invokevirtual java/io/File.delete ()Z
      // 5ba: pop
      // 5bb: aload 7
      // 5bd: sipush 23523
      // 5c0: sipush -14857
      // 5c3: pop2
      // 5c4: ldc_w "Clipping: Compression failed: "
      // 5c7: swap
      // 5c8: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 5cd: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b (Ljava/lang/String;)V
      // 5d0: aload 7
      // 5d2: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 5d5: sipush 23290
      // 5d8: sipush 6141
      // 5db: pop2
      // 5dc: ldc_w "§cClipping: Compression failed: "
      // 5df: swap
      // 5e0: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 5e5: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 5e8: return
   }

   public final void a(@NotNull File var1) {
      Object IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll = null; // PX-FIX
      short var10001 = 23098;
      short var10002 = -26886;
      Intrinsics.checkNotNullParameter(var1, "file");

      try {
         switch (((int[])lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)[this.ag()
            .ordinal()]) {
            case 1:
               Runtime var7 = Runtime.getRuntime();
               String[] var5 = new String[5];
               short var10 = 23231;
               short var13 = 9662;
               var5[0] = "cmd";
               var10 = 23265;
               var13 = 20805;
               var5[1] = "/c";
               var10 = 23056;
               var13 = -15097;
               var5[2] = "start";
               var5[3] = "";
               var5[4] = var1.getAbsolutePath();
               var7.exec(var5);
               break;
            case 2:
               Runtime var6 = Runtime.getRuntime();
               String[] var3 = new String[2];
               short var10003 = 23088;
               short var10004 = 8816;
               var3[0] = "xdg-open";
               var3[1] = var1.getAbsolutePath();
               var6.exec(var3);
               break;
            case 3:
               return;
            default:
               throw new NoWhenBranchMatchedException();
         }
      } catch (Exception var4) {
         String var10000 = var4.getMessage();
         var10001 = 23227;
         var10002 = 8839;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
            "§cClipping: Failed to open clip: " + var10000
         );
      }
   }

   private final void aZ() {
      int[] var1 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      if (var1 == null && this.aW() != lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
         return;
      }
      this.f(false);
   }

   public void a(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var1) {
      short var10001 = 23141;
      short var10002 = 15841;
      Intrinsics.checkNotNullParameter(var1, "data");
      super.a(var1);
      var10001 = 23532;
      var10002 = -739;
      var1.a("consentPromptShown", this.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI);
   }

   public void b(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var1) {
      short var10001 = 23139;
      short var10002 = 7178;
      Intrinsics.checkNotNullParameter(var1, "data");
      super.b(var1);
      var10002 = 23103;
      short var10003 = 20699;
      this.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI =
         var1.a("consentPromptShown", false);
   }

   private static final boolean a(long param0, File param2) {
      Intrinsics.checkNotNull(param2);
      if (Intrinsics.areEqual(FilesKt.getExtension(param2), "mp4")) { if (param2.lastModified() < param0) { return true; } }
      return false;
   }

   private static final void a(lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll var0, String var1) {
   }

   private static final Unit f(String var0) {
      short var10001 = 23090;
      short var10002 = -2769;
      Intrinsics.checkNotNullParameter(var0, "it");
      return Unit.INSTANCE;
   }

   private static final Unit g(String var0) {
      short var10001 = 23090;
      short var10002 = -2769;
      Intrinsics.checkNotNullParameter(var0, "it");
      return Unit.INSTANCE;
   }

   private static final boolean b(File param0) {
      Intrinsics.checkNotNull(param0);
      return Intrinsics.areEqual(FilesKt.getExtension(param0), "mp4");
   }

   private static final CharSequence c(File param0) {
      String var1 = param0.getAbsolutePath();
      Intrinsics.checkNotNullExpressionValue(var1, "getAbsolutePath(...)");
      return "file '" + var1.replace("\\", "/") + "'";
   }

   private static final Unit h(String var0) {
      Intrinsics.checkNotNullParameter(var0, "it");
      return Unit.INSTANCE;
   }

   private static final boolean d(File param0) {
      Intrinsics.checkNotNull(param0);
      return Intrinsics.areEqual(FilesKt.getExtension(param0), "mp4");
   }

   private static final void a(Process param0, lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll param1) {
      try {
         java.io.InputStream var5 = param0.getInputStream();
         java.io.Reader var7 = (java.io.Reader) new java.io.InputStreamReader(var5, kotlin.text.Charsets.UTF_8);
         java.io.Reader var9 = var7 instanceof java.io.BufferedReader
            ? (java.io.BufferedReader) var7
            : new java.io.BufferedReader(var7, 8192);
         kotlin.io.TextStreamsKt.forEachLine(var9, me.octo.client.lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll::g);
      } catch (Exception var4) {
      }
      if (!param1.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI || param1.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll) {
         return;
      }
      Integer var3 = null;
      try {
         var3 = Integer.valueOf(param0.exitValue());
      } catch (Exception var5) {
         var3 = null;
      }
      param1.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = false;
      me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Clipping: FFmpeg exited unexpectedly (code:" + var3 + ")");
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Clipping: Recording stopped unexpectedly. Check logs for details.");
   }

   private static final boolean a(lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll param0, byte[] param1) {
      int[] var2 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      if (var2 != null) {
         try {
            OutputStream var3 = param0.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.getOutputStream();
            var3.write(param1);
            var3.flush();
            return true;
         } catch (Exception var4) {
            return false;
         }
      }
      return false;
   }

   private static final void a(lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll param0, long param1) {
      me.octo.client.lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      java.lang.Object var3 = null;
      me.octo.client.lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var4 = null;
      java.lang.Long var5 = null;
      while (param0.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
            || ((java.util.Collection) param0.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll).isEmpty()) {
         me.octo.client.lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var8 = null;
         try {
            var8 = (me.octo.client.lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll) param0.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll.poll(100L, java.util.concurrent.TimeUnit.MILLISECONDS);
         } catch (java.lang.InterruptedException var9) {
            break;
         }

         if (var8 == null) {
            continue;
         }

         me.octo.client.lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var6 = var8;
         me.octo.client.lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var7 = var4;
         if (var7 != null) {
            var4 = var6;
            var5 = java.lang.Long.valueOf(var6.b());
         }

         long var10 = var5 != null ? var5.longValue() : var7.b();
         if (var10 > var6.b()) {
            var10 += param1;
            param0.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.offer(var7.a());
            var4 = var6;
            var5 = java.lang.Long.valueOf(var10);
            continue;
         }

         a(param0, var7.a());
         param0.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.offer(var7.a());
         param0.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.offer(var6.a());
         return;
      }

      if (var4 != null) {
         a(param0, var4.a());
         param0.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.offer(var4.a());
      }
   }

   private static final void a(lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll var0) {
      try {
         var0.aQ();
         var0.d(true);
      } catch (Exception var4) {
         short var10001 = 23526;
         short var10002 = -32362;
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Clipping: Failed to restart: " + var4);
         var0.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = false;
      } finally {
         var0.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = false;
      }
   }

   private static final void b(lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll param0, String param1) {
      Object var3 = param0.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      int[] var2 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      synchronized (var3) {
         if (param0.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI && !param0.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll) {
            param0.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = true;
            try {
               me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Clipping: Restarting capture because " + param1 + " changed");
               param0.aR();
               param0.e(true);
            } catch (Exception var5) {
               me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Clipping: Failed to restart after " + param1 + " change: " + var5);
               param0.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = false;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Â§cClipping: Failed to apply new " + param1 + " setting.");
            } finally {
               param0.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = false; } } }
   }

   private static final Unit a(
      String param0,
      lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI param1,
      long param2,
      lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll param4,
      File param5,
      Throwable param6
   ) {
      int[] var7 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      if (var7 != null || param6 != null) {
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Clipping: Failed to save ban clip: " + param6);
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§cClipping: Failed to save ban clip.");
         return Unit.INSTANCE;
      }
      if (param5 == null) {
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§cClipping: No ban clip was saved.");
         return Unit.INSTANCE;
      }
      me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Clipping: ban clip saved for banId=" + param0 + " file=" + param5.getName() + " size=" + param5.length() + " mode=" + param1);
      if (param1 == lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Clipping: queueing ban clip for immediate upload banId=" + param0);
         me.octo.client.utils.lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.a(param5, param0, param2);
         return Unit.INSTANCE;
      }
      if (param1 == lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl || param1 == lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
         param4.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl = new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(param5, param0, param2);
         Screen var13 = Minecraft.getInstance().screen;
         String var14 = var13 == null ? null : var13.getClass().getSimpleName();
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Clipping: stored pending disconnect prompt for banId=" + param0 + " file=" + param5.getName() + " currentScreen=" + var14);
         Minecraft.getInstance().execute(new Runnable() { public void run() { i(param0); } });
      }
      return Unit.INSTANCE;
   }

   private static final Unit a(
      lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll param0,
      File param1,
      int param2,
      boolean param3,
      CompletableFuture param4,
      String param5,
      String param6,
      int param7,
      int param8,
      int param9
   ) {
      int[] var10 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      try {
         param0.aS();
         java.io.File[] var12 = param1.listFiles((java.io.FileFilter) (lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll::b));
         java.util.List var11 = var12 == null ? kotlin.collections.CollectionsKt.emptyList() : (java.util.List) kotlin.collections.ArraysKt.sortedWith((Object[]) var12, (java.util.Comparator) new lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI());
         long var13cut = System.currentTimeMillis() - (long) param2 * 1000L;
         java.util.Collection var18c = new java.util.ArrayList();
         for (Object var21 : (Iterable) var11) {
            java.io.File var22 = (java.io.File) var21;
            if (var22.lastModified() >= var13cut) {
               ((java.util.Collection) var18c).add(var21); } }
         java.util.List var14 = (java.util.List) var18c;
         if (var14.isEmpty()) {
            if (param3) {
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("\u00c2\u00a7cClipping: No recent segments. Wait a few seconds and try again."); }
            param4.complete(null);
            return kotlin.Unit.INSTANCE; }
         String var15 = java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
         CharSequence var17 = kotlin.text.StringsKt.trim(new kotlin.text.Regex("[^a-z0-9_-]+").replace(param5.toLowerCase(java.util.Locale.ROOT), "_"), new char[]{'_'});
         String var16 = kotlin.text.StringsKt.isBlank(var17) ? "clip" : (String) var17;
         java.io.File var17f = new java.io.File(param0.ah(), var16 + "_" + var15 + ".mp4");
         java.io.File var18f = new java.io.File(param1, "concat.txt");
         kotlin.jvm.functions.Function1<java.io.File, java.lang.CharSequence> var30 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll::c;
         kotlin.io.FilesKt.writeText(var18f, kotlin.collections.CollectionsKt.joinToString((Iterable) var14, "\n", "", "", -1, "...", var30), kotlin.text.Charsets.UTF_8);
         try {
            java.util.List var19l = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault((Iterable) var14, 10));
            for (Object var26 : (Iterable) var14) {
               java.io.File var27 = (java.io.File) var26;
               ((java.util.Collection) var19l).add(kotlin.text.StringsKt.substringBefore(var27.getName(), "_", var27.getName())); }
            java.util.Set var19s = kotlin.collections.CollectionsKt.toSet((Iterable) var19l);
            boolean var20 = ((java.util.Set) var19s).size() > 1;
            java.util.List var21l = kotlin.collections.CollectionsKt.mutableListOf(new String[]{param6, "-y", "-f", "concat", "-safe", "0", "-i", var18f.getAbsolutePath()});
            if (var20) {
               String var22vf = "scale=" + param7 + ":" + param8 + ":force_original_aspect_ratio=decrease,pad=" + param7 + ":" + param8 + ":(ow-iw)/2:(oh-ih)/2:black";
               ((java.util.List) var21l).addAll(kotlin.collections.CollectionsKt.listOf("-vf", var22vf, "-c:v", "libx264", "-preset", "ultrafast", "-crf", "20", "-pix_fmt", "yuv420p", "-movflags", "+faststart"));
            } else {
               ((java.util.List) var21l).addAll(kotlin.collections.CollectionsKt.listOf("-c:v", "copy", "-movflags", "+faststart")); }
            if (param9 > 0) {
               ((java.util.List) var21l).addAll(kotlin.collections.CollectionsKt.listOf("-t", String.valueOf(param9))); }
            ((java.util.List) var21l).add(var17f.getAbsolutePath());
            Process var22p = new ProcessBuilder((java.util.List) var21l).redirectErrorStream(true).start();
            java.io.InputStream var23 = var22p.getInputStream();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var23, "getInputStream(...)");
            java.io.Reader var25 = new java.io.InputStreamReader(var23, kotlin.text.Charsets.UTF_8);
            java.io.BufferedReader var28 = var25 instanceof java.io.BufferedReader ? (java.io.BufferedReader) var25 : new java.io.BufferedReader(var25, 8192);
            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> var31 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll::h;
            kotlin.io.TextStreamsKt.forEachLine((java.io.Reader) var28, var31);
            var22p.waitFor(120L, java.util.concurrent.TimeUnit.SECONDS);
            if (var22p.isAlive()) {
               var22p.destroyForcibly(); }
         } finally {
            var18f.delete(); }
         if (var17f.exists() && var17f.length() > 0L) {
            if (param3) {
               String var19m = String.format("%.1f", (double) var17f.length() / 1048576.0);
               kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var19m, "format(...)");
               net.minecraft.network.chat.MutableComponent var20c = net.minecraft.network.chat.Component.literal(" \u00a77[\u00a7aOpen Clip\u00a77]").setStyle(net.minecraft.network.chat.Style.EMPTY.withClickEvent(new net.minecraft.network.chat.ClickEvent.RunCommand("/clip open " + var17f.getName())).withHoverEvent(new net.minecraft.network.chat.HoverEvent.ShowText((net.minecraft.network.chat.Component) net.minecraft.network.chat.Component.literal("\u00a77Open this clip"))));
               kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var20c, "setStyle(...)");
               net.minecraft.network.chat.MutableComponent var21c = net.minecraft.network.chat.Component.literal(" \u00a77[\u00a7aOpen Location\u00a77]").setStyle(net.minecraft.network.chat.Style.EMPTY.withClickEvent(new net.minecraft.network.chat.ClickEvent.RunCommand("/clip folder")).withHoverEvent(new net.minecraft.network.chat.HoverEvent.ShowText((net.minecraft.network.chat.Component) net.minecraft.network.chat.Component.literal("\u00a77Open clips folder"))));
               kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var21c, "setStyle(...)");
               net.minecraft.network.chat.MutableComponent var23c = net.minecraft.network.chat.Component.empty().append((net.minecraft.network.chat.Component) var20c).append((net.minecraft.network.chat.Component) var21c);
               kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var23c, "append(...)");
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a("\u00a7aClipping: Saved \u00a7e" + var17f.getName() + " \u00a7a(" + var19m + "MB)", var23c); }
            if (IllIllllIIIIIIIIIllllIIlIlIlIlIIIIlIIllIlIlIlIIIllllIlIIIIIlIIlIIIlIIlIIlIlIllllIlIll.c().al()) {
               param0.a(var17f, param6); }
            param4.complete(var17f);
         } else {
            if (param3) {
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("\u00a7cClipping: Failed to save clip."); }
            param4.complete(null); }
         return kotlin.Unit.INSTANCE;
      } catch (Exception var12e) {
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Clipping: Failed to save clip: " + var12e);
         if (param3) {
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("\u00a7cClipping: Error saving clip: " + var12e.getMessage()); }
         param4.completeExceptionally(var12e); }
      return kotlin.Unit.INSTANCE;
   }

   private static final void i(String param0) {
      Minecraft var1 = Minecraft.getInstance();
      Intrinsics.checkNotNullExpressionValue(var1, "getInstance(...)");
      Screen var2 = var1.screen;
      String var3 = "Clipping: executing disconnect prompt refresh for banId=" + param0 + " currentScreen=" + (var2 != null ? var2.getClass().getSimpleName() : null);
      if (var2 instanceof DisconnectedScreen) {
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Clipping: reinitializing DisconnectedScreen for pending ban clip prompt banId=" + param0);
         ((DisconnectedScreen)var2).init(var1.getWindow().getGuiScaledWidth(), var1.getWindow().getGuiScaledHeight());
      } else {
         var3 = "Clipping: pending ban clip prompt exists but current screen is not DisconnectedScreen for banId=" + param0;
      }

      lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c(var3);
   }

   private static final void a(Function2 var0, Object var1, Object var2) {
      var0.invoke(var1, var2);
   }

   private static final Unit j(String var0) {
      short var10001 = 23090;
      short var10002 = -2769;
      Intrinsics.checkNotNullParameter(var0, "it");
      return Unit.INSTANCE;
   }

   @JvmStatic
   @NotNull
   public static final lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll a0() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.a();
   }

   @JvmStatic
   @Nullable
   public static final Integer k(@NotNull String var0) {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.a(var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[282];
      int var3 = 0;
      String var2 = "\u0095§\u0006\u008cZ¨\u0012Z÷\u0016,)LMÄ\u0000\u0087u\u0015Z\u001ab\u0004\u0092ñVXåöîv\u0013\u001bÇj\u0091w\fqç\u008a\u0084ó¡\rÙ¨ùà\u0013p\u0010;\u0003Ó\u0018à:E\b\n.E\u0000;5\u0083³*õ\u0083ZA\u0004_\u0099!Ù9\u0089¤úøü!é\n®\u0017\u00813L\u0018µå¼`\u0082ÆYº>\u0013Ó´~Q\u009fLÇ°\u0003ÝT¹\u0003-ù,\u0007\u0011\u0002ôFºd\u001a\nÃ¿¡Ç£¸³\u0007Ò/\t\u0018\u0004\u0013Ã\u0000=®QC\t\u009d\u008bÁ-Ä\u0017T\u0015R\u0002¹Á\n0\u008c¨Ô\u009au½\u008fy&\u0006ößeÔ#hx\u0080*ö\t2\u009e;¨[À\u001b\u001dr¯F´þ7\u0017Y\u009c\u0019Õ\u0098¦\u0095;xJ-\u0005\te'9a\u008f\u0091\u009a\u007f\u001e\u00877\u0011f\u0003(gÏ\u0011\u009e÷\u009fçrt î\u0082>\u000f\u000e\u0095\u000bÔ5¤D%\u0084cùÚ»2\u0014\u0094ÉÌ®\u009c½}CìÍ,?A\u0090Æ\u0097 H\u0011¶\u00ad\u0000ÎÅg\u001a\u0098\u008e\u0012\u0083à»\u0002\u008dÙé×÷a\u008bÎÀ\u0098\u0093\b\u0016YÙ\b/zÞ\t\u00102£O\u001dÓ\u009eäÃ$ «\u009d¼ù>Ñ\u0018ÒÆ\u0091\u0089ÙPV°Åc¿\u0088d\u0092h_ç©\u0003S\u0094Éf( z\u008c©\u001bÙÜFàôÉî<Í\u0085\u0093n6?'sÙp=Z\u008b \u009c|Þ&Þå\u0017ú\u0003ë\u0018ç:¥\b\u0016:å\nl\u00adø}+ Øí.GÈ\u0006¥\u000e\u001f\u0092o\u000f\u0004\u009eÚC#\u0004J\u000fÙ\u0099\u0002)oG5nA®\u000f¿\u009aÉÔuWPðÇ`?u/Ûa)&\u008d\u0018å \u0006Ã{²\u0010\u0001Ð\u0080wå©&z\fåâmüÂÓ\u0097¢}¬>ï²ÿ¿l>¸Õ\u0019õ\u0082Æç\u0001\tC\u0007%íY\u0007¨\u0093\u0099?sg\u009a\u0002ºº\u0007\u001f`ïþ\u001c]£\u0006\nãq´AV\u0002- \tÙ\u001ds%'Þ)¿î\rö\u0000As\b\u0000Þ_>ú-4I\u0011\u0006ß\u0090t-Äñ¿sðAÃ»²\u0080-À\b¤.)\u0017{\u0010\u0007é\u000f\ríE¿\u0089ø£\u0095Iè\u0007ik}ç\u0005Ã@ó\u0006\u0015\nÎ1N.¥\u0090\u009eðlf\f\u0080\t\"e¯ù\u0082\u001f\u0017=×à\bs\u009e!!\u009b\u0099Ý\u0011\u0016\"P¢\u0080¸¯j\u008eq\u0004^\u0085Ê¸\\\u0087G±û`¨\u0089!z?û\u009fåÊå\u0016\t\u009fó\u000b¿y³¡<\u0095\u0094S\u0003ï\u0002JæG\u0095\u0080\u008fÕ\u009b\u0018\u0007\bôr$É!=«$\r\u0080\u0001§³þ¶8\u0007ûÅ¥4_\u0005j\u0083µ¸\\\tàdEö\u009dªÖàÏ6hôëV\u0091uOÕÕoÊèL6\u0006\u0014\u0093r5\u0082¥\u000bOë\u0096òx\u0092\u008b¶ÇuÚA3\u000f\u008bªÔdña\u0019¤\"ùTÐk5m²g\u0092\u0003\u0007\u0091\u009e:<\u00993KüPÆEmõ\u007fU&Â\u0089ñ.K \u009d½\u009eÔ\u0099\u0003#®\u0096ø¡O ¡oû¢ÐH±\u009e×\u0012\u007f!\\¦\rbRj\u001ah\u0094µÎî\r+F\u0096\u00144Îjf0·:#7aö.ô\u001bÚ\u0091º¦jÊK\rTDH/Ú\b-\u00ad\u0018³Òº<\u0086¿\u0014\u0084qÔ{\u0085\bSé\u0002\u0090Ö©Tº½÷\u001d\u0084¾\"T\u008fæR\u009d6\u001b\u001eðÚ\fÓ=sÉ[ý\n;\u008a\u0092}>\u0002Iu\u0005\\¥\u0010\rÁPµ>\u008f\u0099\u009e\u009fßþôå °¢\u001e6Eu=9´à±ê,ÿæ~X^è\u008a5jÕ\u008eå£íÜÄRF¤JC`}L¼Ü?ù\u0080F\u0080\u0014\u0097G\u0016dïÌ¥\u0096/º\u009cC%\u0000\u0083\u008e ~XNRB«\u0003\tÎ¤n\u0014Þ?\u0006¨aNÕ£\u000e\f[¸2XóV\u0098%hJL²R$Ì\u008eK\u0090\u001eÇ©\u0099VÅ\u0081æ§Ù\u009cÕg¼^û©\u009aqCå\u00ad\u008f\u0017\u0087nõà\u0082GsÀcÒé3\u008bâ\u001f:ÌºÑ¯\u0085JÏò!,J)§\u000fzÐ\u0002[q&2lÇIó2lÚKüí·Þ]\u0096\u0015±0)ï¶4ãå|¬áÄ\u0095\u0005\u0083\u0093{EÁ*\u0087\u001f'hÇër\u0091ñOEÕ}ÊªY]\u0019#;#tÉ_\u0004\u008fË×\u000f=á\u0081ª\u0013\u0090\u001d\u001dÏLô4¸\u0004H>MW\u0004³:zÇ\nÄ5¨n\nX7=j\u0083\u001fü4y\fÃ>\u0005¼\u009cBãMj¶¾©o~\f¤£Ü\u008eN»\u008f\u0011Þß\u0089S12ê \u0095ø\rbÚp\u008e~ÔÞ\u0096Ó\u0093LÓAÅV\u008a\u008cê\u008dÛ^±æ\u0014\u0090.×ÃoýE\u0002Ã\r5ÉRÔ\u00859ðÓ\u0098\u000f\u001e\u009fdg\u008b\u009bj¢\u0091;\u0090£e\u009a4\u0004©CÐú\u0002\u0080-<2\r +øÚb pÑ~?ÒåÅ2Æî)U\u0011 [t¡¢±]\u0010\u000b5©CÚ\u009c{ Üg}\u0080wHÕïpÐÆ\u0018\u0010ØpLa\b(µ\u001e\b\u0019\u0013èÈM\u0096\u0096\u0098\u00864\u009d\u0081\u009cí\u0000w÷\u008a)6\u001d\u0003ÊÙA\u0014y¯\u0002]¡8\u0001ã5ßÛvÖoó¾±5\u00106\f\u0004Ø\u0089u\u0004jáÉ÷ÌÒõ`Z\u0004ÿøe&õ\u008b\u000b,\u0085j\u008e©w\u009f;\u0099 X\r\nMÿ&À\u008e_ëÖÚÁAHþ9SÕ³z\u0082ymY [ë8\u009d2Í\rÓ\u0086\u0013öd«Ýuß×Öå½\u009dü£ü\u0082Ô\u000e\rÄÉvÍÈ\u000bu\u0003K$yOêÚÿ-s²G:\u001ai°\u001d:Ê¡ÓØÅfÃð\u00adn°Ø=\u0094uÁ^\u007f\u0000í»3\u001dÄÒZ¬¥i\u0018Îë°3\u0006YÂBÅ\u0089\u008e´Ýºúaþä`â>\u0001zK\u0002$(pèÏ¾~z\u000fkó\u0015ªû/\u0081\u0098\u009c\u0003\u0017R\u0080\u009ctVÌhíÉµ\\#¼\u0081xFú/Í<ÿx\u000fè\u0005\u008fJ³¢\u0018#ì3 W\b\u0097\u0018t°o\u0016\n»¶t@d\u009dh´Çb\u009c¥â2Vµ\u001a)=Ãë\u0094Âï#Á±H3\u0019d\tRe¸M\u0083\u0094o\u009d\u0098vü\u000f\u0093\u0097`ÿ!2/8Y0ü\u001f\u0095?ã\u0017#ãÐ\u0004\u0080¹Ix\u008b!uÇ=\"_KìnMX/(h\u000eZ\u001aIÉ\u008f²Á¥57jÂñê\u000bå{\u0092i¡·\u0018N,ú®\u0002¿Ò\u0003\u0019\u0084\u001f!Gà\u000e\u0096-mØÖ'\u000f\u0094ä\u0087\u0090{\u001f¸\u008fPC\bÞÀy\u0016\u0091\u0005»\u0084=÷0\u000e'\u0006é&·(IxR3\u009f\u0016ö×ÒqWù\u0086xb\rúkâ\u001b\u001e¸Fû\u0002ä\u0007P-½l\u0082\u0088\u0012,Pbì\u0000q¿S\u008cVDº\u008dB\u009aÇ\u0081«À2ÓDÁ\u0006Rb;\u008e\u00912Ö}x\u009eÍo\u0019A3åN±\rÿH\u0014\u007fÇâí\u009d\u0000¶\u0005ç±wjo\u0014fc\u0087U\u0099¨\u0003SÊ÷\u0005\u0010ÀèÞ¬\u000bÓ[Ë$\u0087I,m=ñ\u0094&ç>H¿\u0093Î+\u0096Ð\u008fÈ\u001aÐ+WÌõì[iÒ\u0000+[áKDëµyâzºÜÑ/å\u000f\u0007q\u009c\"a¥®\u0094\u0007\u0006v~Aðb\u0001\u0007vN»\u001cÅì±\u001cY\u0088ÍÙU\u0084×ëÆ¨¨\u0010\r\n\u009fÐ[k\u0080\u00034Ìâ\t$ësv\u0002\u001cÒ\nK#ÌÍ\u0098K\u0098Ãé$3½c\u0003\u0014ú»\u00068uZH¤h{\u0010·|É\u0002\u0094ò¿b¬o½à}\u0099Æ\u0085\\Þíô@Öär¹À\u0002Y\u001e÷\u0088\u009et>\u0005>\u0010?\fn99òöcº'q\u0092éN\u0006\u0081\u000fßE\\<\u008cð\u008aÏ\u008d\u0096\u0013\u0016\u0015,:\bÉ\u0088ß=±q\u0098R%É}\u008d×+Ã<72»\u0094\u009c[û&ÖÛ¯\u009e\u0001|\u0007<ú\u009b=Ý\bº\u0083Ãz(ÄU\u0007-\u0003¥\u0010A\f\u001f®³ZI\u0001x\u0007åðÑ*\u0013\u008f±\u001b~\u000eña\u0092HÂqÁ^\nì«\u008d\u0018\u0085\u0010·f¶ÈÊÐûü\u000e1\u0000½Éý\u0090Q\t\u0086Öi\u001b\u001bË`ßú\u0006c\u0001ÑmsV\u0002\u0005u\u0005\u009fÂ©g&Acù\u008aµ½\tÊZe\u009eÜÖ\u0086Ø\u001bÇÔN\u0098\u0086ç?YP¸\u0000×ç+\u0000GÔúñÂk\u0010\u0000ï\u0085\u0092$×BMß¡´\u009b*\u0097ÏQ~\u0087\u001aÊì³C\u009bjØ\u0002]\u0005x»\u0010å\u0084\u000f)Å'ôB\u0010bLy\u0011£\u001dvf\u0012\u0002×\u0083\f\"i\u0094è\u0097\u0007ê\u0096Æ\u0000¤\u0093\r\u0096ÀÉ\u008b3±\u0081çà\u0084(©\n\f\u001bëX¾Å²sÙ!ìUü8\u0090\u009c¦ëND\u0090Ç§¥\u0005F\"\u0095\u0094åÖÁW\u0095L\u0093>£\\»Iø\u0085\u008ei²Õi¢³ÌÞø4ktÎí\u008ei|H\u001eÇ±K\u009fÃ\u001al\u001c©ÈÓU\u0096\u0015¯ÙÉîIØ1\u0013\u0018ó«\u000f\u009e\u008f÷]\u009a;+\u00ad\u0092¾\n\u009eÙgCvQ\u0097eGñ.ÚÍ½3[Ù\u0016@þÝ¯¾åÕ\u0096d\u0096~3[[umú\u0081´ÝþövÍïÑ\u0085\u0098\u0087\u0012ã\u008e\u001d\u0092`\u007fV¤s\u000b\u001a§R\u0093\r\u0081\u008f\u0080õâú\u0005êY@Äß\u0006\tk«çó\u000e\u000bPÈ\bÑ§´Áß\u009e\u009fÁ\u0004é\u000boo\u0002\u001de\u0004\u0014°\u000b\u0004\u0006#\u0000ß\u008et÷\u0005\\u¤\u0015\u0007%;â\u0081ÖÜeæ×à/là\u0098\u0010\u0098\u000fÄ\u008dß\u0003ùÖôpÊ¥ì¢ÈWsA\u0007Ü\fîJ\u0006>\u001dö\u0090Õ%\u0013\u001dJz\u008f\u009aÄß=W½´¹D\u0012È\u008b\u0002+\u0015\u001f\b\u0089µI,\u0010ÜM.ô9u\u0002Îãx)Nïîr\tÎN\u008d\r\u0001\u0001ÍL6\"¥ÞRQ¦\u0095©É\tìQ\u00987\u0011-î\u0016t\u0001`!\u0006\u0099RÓ¡¾\u0010Õk'¬\u0096\\\u0004¾·\u0085ø\bÁ\u0002\u0017#¢Y\u0086³\n¬\u0018¤0\u009f1]¤\u0014Î#å¾\r\u0087æÁÂr\u0000ÐÊ7\u0089åòZ>Æñ½Ty\u001e\u0095J\u0016\u0096l\u0083\t\u0082èµ\u0097\u0018\u0004d{æª\u0007Y.ýÃ\u009bÔ>BØ\u0012ýÈS¦\u0017¯Þ «\u0001`\u000b\u0083³#\u0086#\u001bfØBvóL\u0081áy\u0093øÐp\u009b\fÇ\u000fKCä¶.É\u009eG#ä\u0000Æ»\u0088\u0017Ù\u008d\u009d¨»®Ä\u0092\u000e¾?\u009aSj\u0015&0p~\u0094öË\u0091Û\t\\l[a\u001eäú\u008f\\\u008aá:\u009b\u007fÇ\u0097bË\u00156\u0017\u009b0\u0098Ï{´Æ\u0089\u00adÔA#\u0005\u0007êyMá[\u0011\u0018r\u0097\u0006\u0089\u000f~NÓbí\u00ad|0ìµ\u001f0Uõ\u008cî´\n.\u001d\u009dwE\t)¹|MºÝ2\u000eS\u0004y\bEÄ\u000b\u000bÝO½\u001a-o\u001dÂ\u0090s.Û\u0007\u009dj_ò\u0096%îq\u00ad+ i\u009f $hÃ¿zA\u0087\u0093Ýü\u0016Xìà±P\u0081Í\u009b\u009f;ÂÅiz\u0091ï\u009eíY\u001cH\u0098ïÛ\u0011Ä_ã×©\u008a0A\u0004\u0002^\u00049a³\u001dcf\u0006n´Æ\u009e\u0002!à\u0013=4AÊÄæå§\u0080!`!\f(¢\rtk£\f\u0017ßEª1Ãw\u001b\u0015¦¢Ù\u000b}\u0096\u009f\u008c\u009c<\u008b£àM-7T\u0091>J]pòAëu\u0098Q\u0007Í 'U.\u0087\u0002ülÞ»z¿ðÚj<cÌ\u0097þ\u0092\u0016Ú\u0094;\fa\u0012ü:Þ¿õ?\u009a\u0001:\u0096ª»&\u0003\u001dò¢\u0015Õ\u0001\u0081ãæ\u0019O¹\u0089^\u009dÎØÝQý´ûµ\u0097:\u0004\u00943!ôLÁIÞá7\u0083\u009b\u000bO´\u0099\u0093\"~L\u008e¿p?±\u0099\u0004u;²á¹ö\u001aü\u000f3$`\u0011\u0089\u008a\u008c:Ü\nóµ\u0093wÑi\u0097íÖ¯¢!\r^_¶GÆ)úâ\u009faæn¢\u0080Î},¦\u0010\u001c4b\u0003Ó\u0092g\u0003^ÊÉ\b\\s·7\u0002ÿÐª\br{ø¨~]\u0017Ü\u0002Wç6ûÞ\u0099\u0013ßÝ\u0086ÀìÍí¼¨¼\u009aE\u0000XGÇë£\u0086þ¯P_Æo<[$IkAJÅ\u0002\u001dqÈÃ>ðÆsÈ\u0081ø\u001f\u001f÷):\u00055g¨\u0005¬\r\nêÞ.û« *ñTÔáv\u0003_m¾\u000ba\u008c|\u001e°\u0089N\t\u0002Ç@%\u009d\u0090\u0007jzt\u0016Áwe(C@\u009c\u00187ÌZ£F¾L¾\u0000\u0007¥FC¸ï Y\u0012\u007f5=·\u001e\u008fÏLÇ\u0085E³ ¿\u0080ý@4X\u0003ÎÇwáà¸¸á®¡\r.ÿ¹ð\u0012\u008dsT\u008fR\u008e\u001f\u0080\fö\u0081\u0090V\u00197ìYz\u0010\u0014\u009bÂwD'*\u00024îGF!\u0082\u008d¾'§2\u0012Ì®&¨¿)\"UA¿$|\u0089X]L\u0019\u008b\u0095¬\u0014\u0000¤\u0017Á\u0006UiåþtÃdwã¬\u0016<ÁbÙ\u0094DÇÙ\u0017Ýâú9°¨AÇT|\u0081RR\bO+þ\u008ajnÝ\u007f#\u0098·õ|R07}Úz+JpE\u0085¥gØ«©w\u0083/Òëäº\u0010pè\u001ep÷Ó«\u0005·C»Ò\u0097\t{§~«\u0085\u008f2\u001bT\u0006\u0017EÓ\u009bqD\u0002F9\u0006B$õÉ÷Â\u000f]\u009a°À\u001cØdÊ\\3¹\u0010ö\u0016\u0006#l¿9\u008f½ÈîVh\u0097ß\u00192K\u000bÀ~m*Yý\u0002ø\u009enÖ¦ÓÕ\u0096\u0004]¿ûà\tØÁ\u0096w\u0001&<.\u0088!JáýD%±ýy\nr ·\u0088Ì^6ÞjbJN¬\u000eK4kâ\u008eü\u0096\u008e¡\u0096\u000fù$\u009f|\u0003F'\u000b\u008dTy\u0005\u0084\u001a4,d\u00178\u009a\u009djê\u0002è\u001dáH\u0004]\u0094³ÉU\u0011§\u008cz\u0002\u009eÛ\u001c¹\f\u009b\u0010ÈpÓ.üë\"\u009f¡hK¶±¹\u0005xÀ\u0004e\u0090\u0014í°\tn»ô.Ñg\u0001ÿa\u0080Më>_fdj\b&7aO-\u00145Å\u0006v\\Y\u0083G%\u0006X\u009b°\\\u0099y\u0010À¹\u0011G\u0004ó\u0085õ\u0090õ¾Â\u0081\u0012\u0099¬5\u0019ÖÅ\u0012Tý÷ÄÂM(¬\u0004\u009d\u00979y(Ô\u00adðZÊíÌ\u009b\u008ec#¨Z¬²!\"&)NfÁ\u0084à\u0098é ó\u0098\u008a«x2Ñ9Dã#\u009a(¿º\u008a,mPÝ\u000fºé@·\u0083ù\u0087\u008bPHq\u009b©\u008don© Q½ø\u0011o\u001bU¶ÎÓHeÂ\u009c×=òï\u0086õã\u000b¹-:\u0088áw®Å\u007f¨ç\u0007vwÁÍ0c\u0018Ø{\u0081Vi\u0085\u0098íÔCì©ÈL{CB«WÒ\u0097\u0084¹\u0082Q¤\u0089`.º.\u0006µ§\u0012¼·Ø\u008f\u001aóÕü!\u001b¨>Ï\u0097\u001fx\u000f°\u009cm¯x\u0085\n\u00adC~µx%\u0005dG]\u0014\u0087\u000f\u001fíM\u000b9Ò\u001aÍ\tkIj\u009ey\u0094ë\u009aoÙz41`\u0013*g0\u0099þ\u009e\u008a\u0088>ËÌôÝ\u0004ä\u0012Ú&\fëìF^\u0006®\u000bZ.\u009c´ò\u0005Ü\u0019\u0015Ñ¡\tD¸2\u0090ã\u0016ó\u001f»\u0016u;éII¢y\u00adêýô\tuÙ\u0005ÍóI7é<ý\u000b\u0005P\u001btì\u0013ir\u0096\u0085Æ#²fâ´Æ¯\u0081º\u0085\nFª¦qxJ\u009f19\u0005+§aÞ,ûàîÒ¯é\\\u0097bæ\u0004D¸§Ç\u000f\u008d\u0088\bÐ7\u009cåÖ\u0013\u0091ß\u000fÄ(\u0012\u0007kÄÞ1qÏ:\u0011\u009b/hC\u000f/>\u00076\u0081\u000e-R\u0090±\u0003s\b\få$\u0015\u0085_ ¬\u0002\u0094´\bù¶\u009a\u007fR\u0002Ä\u0005\u0010;þ\u008d\u0097ÜÌ;\"\u0007!\u001fî³Ü|&\u0004\u008fìÁU\r\u000f\u001aÐp\u00119\u008c´7èl÷2\u0004-\u001dãÇ\u0012\u0014\u009b\u0015kÊ0\u00ad\u0099\u0011ð\u009aBÉ,Çÿ\u001cú\n`\u000bÕQ-jb]èd\u0006Û´\u0017E\u0019q\u0004¡ñ\r`\u0002Ù[\u0002v©\u001aP²îåÜb-M?aþÞã×¿ÚáßØë¢\u0007iYF£\ba§ÊØ\u0013ÍÌÅ\u0004\u009f9\u009e:\u0003 A\f\u0002zs\"\u0097UFÒRc\u0013#×9(ÌÌñÔ\u0097\u0085\u0087U\u0004\u0013\u00ad\u0001þµù¡jÃ#·BÐ\u008f\bÁø3È\u007f\u001333\u0004Æ\f=\u0013\rÇ§\u001cö¢ÑÆ°àF\u0093÷k\u0017é²ÙT\u001a\u0085Ñ:\u0002\u0017ÏÝà£Cá\u0010¯\b5æw Gg\u008a\nÛ\u00adÄÈã%©Ô0¤\n[oÁ\u0082Æ)õ:ÙfpëqYé\u0016ÇÝ\u000f\u000bA\u0081UK¸zrÜáãÓ\u0087Ï\u0018\n\u008c\u00001þÂÔÊÂZ\u008aã°ï0\u0002u\u0086!ë Åå\u0010bØEr\u0092sÌ~!\u0017\u000bk¨'¼\n,ÛxúËTb\u0098ÐÕ½>\u009f¤XÙµ$jvvÆ´X\nS(\u009eé¦\u0084ËÇ\u0097Î~\u0004$¬È\"Ðãåü\u0007'Ä\u0091M\u0080Æ\u0019\u0005¡ú;\u0083à3\u0000l\u008dÂb\u0090J¶\u001feì*\u0003©\u0013\u0081ùéÚË°H>Áoÿ*8d¼[\u0090,\u0082\u009b¦bÄâ\u0090\u0014Ê\u008a\u007fìÜÂðzZõ\u0004®¥\u007f·'@\u0082*zz\t\u000b\u00871eçÞoz\u000e1\u008fD9ü\u0005Xo£:\u008fi·Î\u0088\u0097s:\u0005e\u009bcÛ»\u0005\u0089xñX \u0014ÕD³é@\t\u0000<Ûä,\u0098\u0003t)p\u0098äxp\u0002ëX\u0005\u0099^Ù\r\u008apN\u009f/¿\tH\\r·\u009b\u0086vÁÂ0\u00190\u0082Îï§Ï¤YU\u0099,2Óêl\u008aU\u0011¦%Ð\u008e\u001aû&´KÙ¾J¶\u0011!\u001a\u009b¤\u001aÜS\u001ax*\u0098ÁvW\u008e?<\u001d/Uwh<\u000eÞy«¯´'¦¹xÙ\u001fñôY°`ërÞ½à¨¼ì\u0007»6GLK\u000eÄ\u0010¼1ùçµhí\u0014ý-YmÇ\u0012\u00859\u008còá[<g¤è¾\u001d6Ì4²åâÄÆ¡\u0081{\u00852f\u00ad\u0086\u0091{_\u0005®\u0097FÑ:ÿ;G\u0093=³\u008a\u0005\u00014hýÂð÷\u0014RÆ\tâ\u0006§\u0094\u0095mÎQ\u007fË:\u0007D\u0014Ò\u0018~ã®Uq[\u0097ªÄÐ\u00946ÓðÛÖÄ¤ªÉèRP\u0007b\u0014¡C\u0097ï_?Ë«\u0085mù¾Ðñ\u0094\u001f7Ò\u008d¸\u0098{\u0088Aò\u009d0\u00adK¯F\u009b[\u0015\u008eÉHºþÞ\u007fc\u008ff\tÃ\u0090&\u0097 O'°\u009eè®±Å²\u008a4\u0087â!¶½ÙNö¥\u0006ìû{µX3yOä>TìMH\u008eÿÄB\u000bt/#ñÓ\u0003=\t;\u001dvü\u0084e\u0012FP\u0005ÞËm\u0094Ä å¨Z\u009f§L\u0089ò\r\u008bÑt/\u0082n]\u001aÇ\u0004J\u0082ÿ\u008dL3\u000fÐ\u0002>\n Â\b¤\u0014\u0083mÅ\u0092(à\u0018T\u0092\u0083?EDÂò²Þ\u0012³ö¢ïÔ!*u\u008a3>\u008fó\u0005Ù\u0014±ã¡B\u0087\u0019ÿÚ27\u009e¾è1×\u0011\u007fXÈ\u0080\u001f¸\u0012\u0095jcâ\u0013ô¶\u0014q@¿.ÊVËÆÁÍªËÿ|÷>;ÛÏ«q]¤Wª\u007f±èüíåÈI\u0080Du\u0006¡\\\b1N\u0092±È\u000f@®\u0002²yeV/.±q\u0096ZI3h\u009e#\u001b@\u0094a\u000fí\u0093z±fZWb\f\u0004YÛYä\u0089èé\u0018Îj\u0084ás4M\u0082(%pAú\u008brT\u0001¢\u0082;A·\u008f¾7Ö\u0099Mñ\rvTËápn¡@\u0096~^Õ÷|\u0097qµI¨ûV3?´\u0083ö\u009fjM»\u009fq\u009eøüÔ\u0004¥#Ð\u0007\u0005\u0091\u008fhÎ\u001e\u0002ÒÇ\n\u009f\u001cÂ°S!Ä¦'\u008e$ý©Y¿ÇH\u0085r\u008c\u009báv)Â®U\u0002Æ\u0007jâû\u0081Ì²\u001fà\u00015L= A\\ð\u008d\bv\fk(lè\u0003X\u0004^8\u008f\u0097\u0012µÑ!\"L\u0019}¼\u000bTÙÖ¡¾Ê\u00ad½°\u001e·®B\u00adÒ\u008c\u0003ÞÕ\u0086m5Å\u001df\u0094uÁtdíBTû ð\u001bÒü¾\u0003±\u0014\rC\u0019ºÅÝT\u0004÷ûÂª(P\u0004\u0002\u0097ÊyVÔbð£ÊÒÂ~\u0084\u009dæv·mæX,u´å\u0015\u008c)I\u0086s\u008eË1QÍiÿ\u0090\u0090M\u0097\u009bÕ\u0087îA2\u009a§¬ùT\u0019\"\u009d\u0088\u0007iz\u0014\u0016Íwä<wN\u0086\u0084y\u008fZ\u0014¿:Ë\u0017\u00072RôA5Þõ+ãà\n\u008435Ï§\u000b\u007fË\u0015%\u001d©¹\u0081OªÐ\fU4÷T\u0015CÊ%ð»k\u0092\u0099ë\u001e\u001e\u0088V7Ý©\rF\u0086U7ÉÁSCTïÆ0&\u001c\týæÆ\u0014\u00ad\u0006çÊT\u0085Þ\u0093aµ\u0097|\u008dØc»\u0001\u0082gÊ£\u0091ÞQ\n\u008a.\u001d\n{Î\u0097H\u0088|\u0013fñ\u0005\u000b²t\u0019WJJúN\u0001\u0000\u008c\f\u0016QSzåpöZù\u00068ïÚn\u0091?S\u008a¦\u008eÛ\u0016\u0081\n8¶³®ììÄÒ-\u00075fUxÒ\u0095cë#È9þÙ\u0083úû+`\u0014ã¼\u00981¹ó]?È5RøÝ\u001aÓ\u00ad\u008eöw~\u00160\u001eûñÏ\u0083È|i\u0083\u0001X\u0011¿\u0012â\u001bü\u009boºª\u0097%®_\u0004xÞöÝ\u0090Ñ\u0018Ä\u0097\u0019\u0000<é\u0014ô·ýö¯°¤¿\tÆ\u0012ÓuÔ,%ß\u000b\u000biªßëx¿¥Ø\u00870'¯1\u0013j\u008eò¬%©qE+®x*23Iì\u0081÷ß*HÇ\u008f\nQ§CBì&ûë\u00825\u007f\r,\u0002\u0004ôø\u0004&Ù\u008b\u008e,\u0003I\u00ad\u009e|æ\u0090ÛàõVóxa{Èÿ\u008b*O®½\u0011\u0007Î\u001d4+(\u0089@\u009f¶6\u0013©\u0081<Y½\u0015(Ä¡à\u0096-¡H=ËRU&";
      int var4 = "\u0095§\u0006\u008cZ¨\u0012Z÷\u0016,)LMÄ\u0000\u0087u\u0015Z\u001ab\u0004\u0092ñVXåöîv\u0013\u001bÇj\u0091w\fqç\u008a\u0084ó¡\rÙ¨ùà\u0013p\u0010;\u0003Ó\u0018à:E\b\n.E\u0000;5\u0083³*õ\u0083ZA\u0004_\u0099!Ù9\u0089¤úøü!é\n®\u0017\u00813L\u0018µå¼`\u0082ÆYº>\u0013Ó´~Q\u009fLÇ°\u0003ÝT¹\u0003-ù,\u0007\u0011\u0002ôFºd\u001a\nÃ¿¡Ç£¸³\u0007Ò/\t\u0018\u0004\u0013Ã\u0000=®QC\t\u009d\u008bÁ-Ä\u0017T\u0015R\u0002¹Á\n0\u008c¨Ô\u009au½\u008fy&\u0006ößeÔ#hx\u0080*ö\t2\u009e;¨[À\u001b\u001dr¯F´þ7\u0017Y\u009c\u0019Õ\u0098¦\u0095;xJ-\u0005\te'9a\u008f\u0091\u009a\u007f\u001e\u00877\u0011f\u0003(gÏ\u0011\u009e÷\u009fçrt î\u0082>\u000f\u000e\u0095\u000bÔ5¤D%\u0084cùÚ»2\u0014\u0094ÉÌ®\u009c½}CìÍ,?A\u0090Æ\u0097 H\u0011¶\u00ad\u0000ÎÅg\u001a\u0098\u008e\u0012\u0083à»\u0002\u008dÙé×÷a\u008bÎÀ\u0098\u0093\b\u0016YÙ\b/zÞ\t\u00102£O\u001dÓ\u009eäÃ$ «\u009d¼ù>Ñ\u0018ÒÆ\u0091\u0089ÙPV°Åc¿\u0088d\u0092h_ç©\u0003S\u0094Éf( z\u008c©\u001bÙÜFàôÉî<Í\u0085\u0093n6?'sÙp=Z\u008b \u009c|Þ&Þå\u0017ú\u0003ë\u0018ç:¥\b\u0016:å\nl\u00adø}+ Øí.GÈ\u0006¥\u000e\u001f\u0092o\u000f\u0004\u009eÚC#\u0004J\u000fÙ\u0099\u0002)oG5nA®\u000f¿\u009aÉÔuWPðÇ`?u/Ûa)&\u008d\u0018å \u0006Ã{²\u0010\u0001Ð\u0080wå©&z\fåâmüÂÓ\u0097¢}¬>ï²ÿ¿l>¸Õ\u0019õ\u0082Æç\u0001\tC\u0007%íY\u0007¨\u0093\u0099?sg\u009a\u0002ºº\u0007\u001f`ïþ\u001c]£\u0006\nãq´AV\u0002- \tÙ\u001ds%'Þ)¿î\rö\u0000As\b\u0000Þ_>ú-4I\u0011\u0006ß\u0090t-Äñ¿sðAÃ»²\u0080-À\b¤.)\u0017{\u0010\u0007é\u000f\ríE¿\u0089ø£\u0095Iè\u0007ik}ç\u0005Ã@ó\u0006\u0015\nÎ1N.¥\u0090\u009eðlf\f\u0080\t\"e¯ù\u0082\u001f\u0017=×à\bs\u009e!!\u009b\u0099Ý\u0011\u0016\"P¢\u0080¸¯j\u008eq\u0004^\u0085Ê¸\\\u0087G±û`¨\u0089!z?û\u009fåÊå\u0016\t\u009fó\u000b¿y³¡<\u0095\u0094S\u0003ï\u0002JæG\u0095\u0080\u008fÕ\u009b\u0018\u0007\bôr$É!=«$\r\u0080\u0001§³þ¶8\u0007ûÅ¥4_\u0005j\u0083µ¸\\\tàdEö\u009dªÖàÏ6hôëV\u0091uOÕÕoÊèL6\u0006\u0014\u0093r5\u0082¥\u000bOë\u0096òx\u0092\u008b¶ÇuÚA3\u000f\u008bªÔdña\u0019¤\"ùTÐk5m²g\u0092\u0003\u0007\u0091\u009e:<\u00993KüPÆEmõ\u007fU&Â\u0089ñ.K \u009d½\u009eÔ\u0099\u0003#®\u0096ø¡O ¡oû¢ÐH±\u009e×\u0012\u007f!\\¦\rbRj\u001ah\u0094µÎî\r+F\u0096\u00144Îjf0·:#7aö.ô\u001bÚ\u0091º¦jÊK\rTDH/Ú\b-\u00ad\u0018³Òº<\u0086¿\u0014\u0084qÔ{\u0085\bSé\u0002\u0090Ö©Tº½÷\u001d\u0084¾\"T\u008fæR\u009d6\u001b\u001eðÚ\fÓ=sÉ[ý\n;\u008a\u0092}>\u0002Iu\u0005\\¥\u0010\rÁPµ>\u008f\u0099\u009e\u009fßþôå °¢\u001e6Eu=9´à±ê,ÿæ~X^è\u008a5jÕ\u008eå£íÜÄRF¤JC`}L¼Ü?ù\u0080F\u0080\u0014\u0097G\u0016dïÌ¥\u0096/º\u009cC%\u0000\u0083\u008e ~XNRB«\u0003\tÎ¤n\u0014Þ?\u0006¨aNÕ£\u000e\f[¸2XóV\u0098%hJL²R$Ì\u008eK\u0090\u001eÇ©\u0099VÅ\u0081æ§Ù\u009cÕg¼^û©\u009aqCå\u00ad\u008f\u0017\u0087nõà\u0082GsÀcÒé3\u008bâ\u001f:ÌºÑ¯\u0085JÏò!,J)§\u000fzÐ\u0002[q&2lÇIó2lÚKüí·Þ]\u0096\u0015±0)ï¶4ãå|¬áÄ\u0095\u0005\u0083\u0093{EÁ*\u0087\u001f'hÇër\u0091ñOEÕ}ÊªY]\u0019#;#tÉ_\u0004\u008fË×\u000f=á\u0081ª\u0013\u0090\u001d\u001dÏLô4¸\u0004H>MW\u0004³:zÇ\nÄ5¨n\nX7=j\u0083\u001fü4y\fÃ>\u0005¼\u009cBãMj¶¾©o~\f¤£Ü\u008eN»\u008f\u0011Þß\u0089S12ê \u0095ø\rbÚp\u008e~ÔÞ\u0096Ó\u0093LÓAÅV\u008a\u008cê\u008dÛ^±æ\u0014\u0090.×ÃoýE\u0002Ã\r5ÉRÔ\u00859ðÓ\u0098\u000f\u001e\u009fdg\u008b\u009bj¢\u0091;\u0090£e\u009a4\u0004©CÐú\u0002\u0080-<2\r +øÚb pÑ~?ÒåÅ2Æî)U\u0011 [t¡¢±]\u0010\u000b5©CÚ\u009c{ Üg}\u0080wHÕïpÐÆ\u0018\u0010ØpLa\b(µ\u001e\b\u0019\u0013èÈM\u0096\u0096\u0098\u00864\u009d\u0081\u009cí\u0000w÷\u008a)6\u001d\u0003ÊÙA\u0014y¯\u0002]¡8\u0001ã5ßÛvÖoó¾±5\u00106\f\u0004Ø\u0089u\u0004jáÉ÷ÌÒõ`Z\u0004ÿøe&õ\u008b\u000b,\u0085j\u008e©w\u009f;\u0099 X\r\nMÿ&À\u008e_ëÖÚÁAHþ9SÕ³z\u0082ymY [ë8\u009d2Í\rÓ\u0086\u0013öd«Ýuß×Öå½\u009dü£ü\u0082Ô\u000e\rÄÉvÍÈ\u000bu\u0003K$yOêÚÿ-s²G:\u001ai°\u001d:Ê¡ÓØÅfÃð\u00adn°Ø=\u0094uÁ^\u007f\u0000í»3\u001dÄÒZ¬¥i\u0018Îë°3\u0006YÂBÅ\u0089\u008e´Ýºúaþä`â>\u0001zK\u0002$(pèÏ¾~z\u000fkó\u0015ªû/\u0081\u0098\u009c\u0003\u0017R\u0080\u009ctVÌhíÉµ\\#¼\u0081xFú/Í<ÿx\u000fè\u0005\u008fJ³¢\u0018#ì3 W\b\u0097\u0018t°o\u0016\n»¶t@d\u009dh´Çb\u009c¥â2Vµ\u001a)=Ãë\u0094Âï#Á±H3\u0019d\tRe¸M\u0083\u0094o\u009d\u0098vü\u000f\u0093\u0097`ÿ!2/8Y0ü\u001f\u0095?ã\u0017#ãÐ\u0004\u0080¹Ix\u008b!uÇ=\"_KìnMX/(h\u000eZ\u001aIÉ\u008f²Á¥57jÂñê\u000bå{\u0092i¡·\u0018N,ú®\u0002¿Ò\u0003\u0019\u0084\u001f!Gà\u000e\u0096-mØÖ'\u000f\u0094ä\u0087\u0090{\u001f¸\u008fPC\bÞÀy\u0016\u0091\u0005»\u0084=÷0\u000e'\u0006é&·(IxR3\u009f\u0016ö×ÒqWù\u0086xb\rúkâ\u001b\u001e¸Fû\u0002ä\u0007P-½l\u0082\u0088\u0012,Pbì\u0000q¿S\u008cVDº\u008dB\u009aÇ\u0081«À2ÓDÁ\u0006Rb;\u008e\u00912Ö}x\u009eÍo\u0019A3åN±\rÿH\u0014\u007fÇâí\u009d\u0000¶\u0005ç±wjo\u0014fc\u0087U\u0099¨\u0003SÊ÷\u0005\u0010ÀèÞ¬\u000bÓ[Ë$\u0087I,m=ñ\u0094&ç>H¿\u0093Î+\u0096Ð\u008fÈ\u001aÐ+WÌõì[iÒ\u0000+[áKDëµyâzºÜÑ/å\u000f\u0007q\u009c\"a¥®\u0094\u0007\u0006v~Aðb\u0001\u0007vN»\u001cÅì±\u001cY\u0088ÍÙU\u0084×ëÆ¨¨\u0010\r\n\u009fÐ[k\u0080\u00034Ìâ\t$ësv\u0002\u001cÒ\nK#ÌÍ\u0098K\u0098Ãé$3½c\u0003\u0014ú»\u00068uZH¤h{\u0010·|É\u0002\u0094ò¿b¬o½à}\u0099Æ\u0085\\Þíô@Öär¹À\u0002Y\u001e÷\u0088\u009et>\u0005>\u0010?\fn99òöcº'q\u0092éN\u0006\u0081\u000fßE\\<\u008cð\u008aÏ\u008d\u0096\u0013\u0016\u0015,:\bÉ\u0088ß=±q\u0098R%É}\u008d×+Ã<72»\u0094\u009c[û&ÖÛ¯\u009e\u0001|\u0007<ú\u009b=Ý\bº\u0083Ãz(ÄU\u0007-\u0003¥\u0010A\f\u001f®³ZI\u0001x\u0007åðÑ*\u0013\u008f±\u001b~\u000eña\u0092HÂqÁ^\nì«\u008d\u0018\u0085\u0010·f¶ÈÊÐûü\u000e1\u0000½Éý\u0090Q\t\u0086Öi\u001b\u001bË`ßú\u0006c\u0001ÑmsV\u0002\u0005u\u0005\u009fÂ©g&Acù\u008aµ½\tÊZe\u009eÜÖ\u0086Ø\u001bÇÔN\u0098\u0086ç?YP¸\u0000×ç+\u0000GÔúñÂk\u0010\u0000ï\u0085\u0092$×BMß¡´\u009b*\u0097ÏQ~\u0087\u001aÊì³C\u009bjØ\u0002]\u0005x»\u0010å\u0084\u000f)Å'ôB\u0010bLy\u0011£\u001dvf\u0012\u0002×\u0083\f\"i\u0094è\u0097\u0007ê\u0096Æ\u0000¤\u0093\r\u0096ÀÉ\u008b3±\u0081çà\u0084(©\n\f\u001bëX¾Å²sÙ!ìUü8\u0090\u009c¦ëND\u0090Ç§¥\u0005F\"\u0095\u0094åÖÁW\u0095L\u0093>£\\»Iø\u0085\u008ei²Õi¢³ÌÞø4ktÎí\u008ei|H\u001eÇ±K\u009fÃ\u001al\u001c©ÈÓU\u0096\u0015¯ÙÉîIØ1\u0013\u0018ó«\u000f\u009e\u008f÷]\u009a;+\u00ad\u0092¾\n\u009eÙgCvQ\u0097eGñ.ÚÍ½3[Ù\u0016@þÝ¯¾åÕ\u0096d\u0096~3[[umú\u0081´ÝþövÍïÑ\u0085\u0098\u0087\u0012ã\u008e\u001d\u0092`\u007fV¤s\u000b\u001a§R\u0093\r\u0081\u008f\u0080õâú\u0005êY@Äß\u0006\tk«çó\u000e\u000bPÈ\bÑ§´Áß\u009e\u009fÁ\u0004é\u000boo\u0002\u001de\u0004\u0014°\u000b\u0004\u0006#\u0000ß\u008et÷\u0005\\u¤\u0015\u0007%;â\u0081ÖÜeæ×à/là\u0098\u0010\u0098\u000fÄ\u008dß\u0003ùÖôpÊ¥ì¢ÈWsA\u0007Ü\fîJ\u0006>\u001dö\u0090Õ%\u0013\u001dJz\u008f\u009aÄß=W½´¹D\u0012È\u008b\u0002+\u0015\u001f\b\u0089µI,\u0010ÜM.ô9u\u0002Îãx)Nïîr\tÎN\u008d\r\u0001\u0001ÍL6\"¥ÞRQ¦\u0095©É\tìQ\u00987\u0011-î\u0016t\u0001`!\u0006\u0099RÓ¡¾\u0010Õk'¬\u0096\\\u0004¾·\u0085ø\bÁ\u0002\u0017#¢Y\u0086³\n¬\u0018¤0\u009f1]¤\u0014Î#å¾\r\u0087æÁÂr\u0000ÐÊ7\u0089åòZ>Æñ½Ty\u001e\u0095J\u0016\u0096l\u0083\t\u0082èµ\u0097\u0018\u0004d{æª\u0007Y.ýÃ\u009bÔ>BØ\u0012ýÈS¦\u0017¯Þ «\u0001`\u000b\u0083³#\u0086#\u001bfØBvóL\u0081áy\u0093øÐp\u009b\fÇ\u000fKCä¶.É\u009eG#ä\u0000Æ»\u0088\u0017Ù\u008d\u009d¨»®Ä\u0092\u000e¾?\u009aSj\u0015&0p~\u0094öË\u0091Û\t\\l[a\u001eäú\u008f\\\u008aá:\u009b\u007fÇ\u0097bË\u00156\u0017\u009b0\u0098Ï{´Æ\u0089\u00adÔA#\u0005\u0007êyMá[\u0011\u0018r\u0097\u0006\u0089\u000f~NÓbí\u00ad|0ìµ\u001f0Uõ\u008cî´\n.\u001d\u009dwE\t)¹|MºÝ2\u000eS\u0004y\bEÄ\u000b\u000bÝO½\u001a-o\u001dÂ\u0090s.Û\u0007\u009dj_ò\u0096%îq\u00ad+ i\u009f $hÃ¿zA\u0087\u0093Ýü\u0016Xìà±P\u0081Í\u009b\u009f;ÂÅiz\u0091ï\u009eíY\u001cH\u0098ïÛ\u0011Ä_ã×©\u008a0A\u0004\u0002^\u00049a³\u001dcf\u0006n´Æ\u009e\u0002!à\u0013=4AÊÄæå§\u0080!`!\f(¢\rtk£\f\u0017ßEª1Ãw\u001b\u0015¦¢Ù\u000b}\u0096\u009f\u008c\u009c<\u008b£àM-7T\u0091>J]pòAëu\u0098Q\u0007Í 'U.\u0087\u0002ülÞ»z¿ðÚj<cÌ\u0097þ\u0092\u0016Ú\u0094;\fa\u0012ü:Þ¿õ?\u009a\u0001:\u0096ª»&\u0003\u001dò¢\u0015Õ\u0001\u0081ãæ\u0019O¹\u0089^\u009dÎØÝQý´ûµ\u0097:\u0004\u00943!ôLÁIÞá7\u0083\u009b\u000bO´\u0099\u0093\"~L\u008e¿p?±\u0099\u0004u;²á¹ö\u001aü\u000f3$`\u0011\u0089\u008a\u008c:Ü\nóµ\u0093wÑi\u0097íÖ¯¢!\r^_¶GÆ)úâ\u009faæn¢\u0080Î},¦\u0010\u001c4b\u0003Ó\u0092g\u0003^ÊÉ\b\\s·7\u0002ÿÐª\br{ø¨~]\u0017Ü\u0002Wç6ûÞ\u0099\u0013ßÝ\u0086ÀìÍí¼¨¼\u009aE\u0000XGÇë£\u0086þ¯P_Æo<[$IkAJÅ\u0002\u001dqÈÃ>ðÆsÈ\u0081ø\u001f\u001f÷):\u00055g¨\u0005¬\r\nêÞ.û« *ñTÔáv\u0003_m¾\u000ba\u008c|\u001e°\u0089N\t\u0002Ç@%\u009d\u0090\u0007jzt\u0016Áwe(C@\u009c\u00187ÌZ£F¾L¾\u0000\u0007¥FC¸ï Y\u0012\u007f5=·\u001e\u008fÏLÇ\u0085E³ ¿\u0080ý@4X\u0003ÎÇwáà¸¸á®¡\r.ÿ¹ð\u0012\u008dsT\u008fR\u008e\u001f\u0080\fö\u0081\u0090V\u00197ìYz\u0010\u0014\u009bÂwD'*\u00024îGF!\u0082\u008d¾'§2\u0012Ì®&¨¿)\"UA¿$|\u0089X]L\u0019\u008b\u0095¬\u0014\u0000¤\u0017Á\u0006UiåþtÃdwã¬\u0016<ÁbÙ\u0094DÇÙ\u0017Ýâú9°¨AÇT|\u0081RR\bO+þ\u008ajnÝ\u007f#\u0098·õ|R07}Úz+JpE\u0085¥gØ«©w\u0083/Òëäº\u0010pè\u001ep÷Ó«\u0005·C»Ò\u0097\t{§~«\u0085\u008f2\u001bT\u0006\u0017EÓ\u009bqD\u0002F9\u0006B$õÉ÷Â\u000f]\u009a°À\u001cØdÊ\\3¹\u0010ö\u0016\u0006#l¿9\u008f½ÈîVh\u0097ß\u00192K\u000bÀ~m*Yý\u0002ø\u009enÖ¦ÓÕ\u0096\u0004]¿ûà\tØÁ\u0096w\u0001&<.\u0088!JáýD%±ýy\nr ·\u0088Ì^6ÞjbJN¬\u000eK4kâ\u008eü\u0096\u008e¡\u0096\u000fù$\u009f|\u0003F'\u000b\u008dTy\u0005\u0084\u001a4,d\u00178\u009a\u009djê\u0002è\u001dáH\u0004]\u0094³ÉU\u0011§\u008cz\u0002\u009eÛ\u001c¹\f\u009b\u0010ÈpÓ.üë\"\u009f¡hK¶±¹\u0005xÀ\u0004e\u0090\u0014í°\tn»ô.Ñg\u0001ÿa\u0080Më>_fdj\b&7aO-\u00145Å\u0006v\\Y\u0083G%\u0006X\u009b°\\\u0099y\u0010À¹\u0011G\u0004ó\u0085õ\u0090õ¾Â\u0081\u0012\u0099¬5\u0019ÖÅ\u0012Tý÷ÄÂM(¬\u0004\u009d\u00979y(Ô\u00adðZÊíÌ\u009b\u008ec#¨Z¬²!\"&)NfÁ\u0084à\u0098é ó\u0098\u008a«x2Ñ9Dã#\u009a(¿º\u008a,mPÝ\u000fºé@·\u0083ù\u0087\u008bPHq\u009b©\u008don© Q½ø\u0011o\u001bU¶ÎÓHeÂ\u009c×=òï\u0086õã\u000b¹-:\u0088áw®Å\u007f¨ç\u0007vwÁÍ0c\u0018Ø{\u0081Vi\u0085\u0098íÔCì©ÈL{CB«WÒ\u0097\u0084¹\u0082Q¤\u0089`.º.\u0006µ§\u0012¼·Ø\u008f\u001aóÕü!\u001b¨>Ï\u0097\u001fx\u000f°\u009cm¯x\u0085\n\u00adC~µx%\u0005dG]\u0014\u0087\u000f\u001fíM\u000b9Ò\u001aÍ\tkIj\u009ey\u0094ë\u009aoÙz41`\u0013*g0\u0099þ\u009e\u008a\u0088>ËÌôÝ\u0004ä\u0012Ú&\fëìF^\u0006®\u000bZ.\u009c´ò\u0005Ü\u0019\u0015Ñ¡\tD¸2\u0090ã\u0016ó\u001f»\u0016u;éII¢y\u00adêýô\tuÙ\u0005ÍóI7é<ý\u000b\u0005P\u001btì\u0013ir\u0096\u0085Æ#²fâ´Æ¯\u0081º\u0085\nFª¦qxJ\u009f19\u0005+§aÞ,ûàîÒ¯é\\\u0097bæ\u0004D¸§Ç\u000f\u008d\u0088\bÐ7\u009cåÖ\u0013\u0091ß\u000fÄ(\u0012\u0007kÄÞ1qÏ:\u0011\u009b/hC\u000f/>\u00076\u0081\u000e-R\u0090±\u0003s\b\få$\u0015\u0085_ ¬\u0002\u0094´\bù¶\u009a\u007fR\u0002Ä\u0005\u0010;þ\u008d\u0097ÜÌ;\"\u0007!\u001fî³Ü|&\u0004\u008fìÁU\r\u000f\u001aÐp\u00119\u008c´7èl÷2\u0004-\u001dãÇ\u0012\u0014\u009b\u0015kÊ0\u00ad\u0099\u0011ð\u009aBÉ,Çÿ\u001cú\n`\u000bÕQ-jb]èd\u0006Û´\u0017E\u0019q\u0004¡ñ\r`\u0002Ù[\u0002v©\u001aP²îåÜb-M?aþÞã×¿ÚáßØë¢\u0007iYF£\ba§ÊØ\u0013ÍÌÅ\u0004\u009f9\u009e:\u0003 A\f\u0002zs\"\u0097UFÒRc\u0013#×9(ÌÌñÔ\u0097\u0085\u0087U\u0004\u0013\u00ad\u0001þµù¡jÃ#·BÐ\u008f\bÁø3È\u007f\u001333\u0004Æ\f=\u0013\rÇ§\u001cö¢ÑÆ°àF\u0093÷k\u0017é²ÙT\u001a\u0085Ñ:\u0002\u0017ÏÝà£Cá\u0010¯\b5æw Gg\u008a\nÛ\u00adÄÈã%©Ô0¤\n[oÁ\u0082Æ)õ:ÙfpëqYé\u0016ÇÝ\u000f\u000bA\u0081UK¸zrÜáãÓ\u0087Ï\u0018\n\u008c\u00001þÂÔÊÂZ\u008aã°ï0\u0002u\u0086!ë Åå\u0010bØEr\u0092sÌ~!\u0017\u000bk¨'¼\n,ÛxúËTb\u0098ÐÕ½>\u009f¤XÙµ$jvvÆ´X\nS(\u009eé¦\u0084ËÇ\u0097Î~\u0004$¬È\"Ðãåü\u0007'Ä\u0091M\u0080Æ\u0019\u0005¡ú;\u0083à3\u0000l\u008dÂb\u0090J¶\u001feì*\u0003©\u0013\u0081ùéÚË°H>Áoÿ*8d¼[\u0090,\u0082\u009b¦bÄâ\u0090\u0014Ê\u008a\u007fìÜÂðzZõ\u0004®¥\u007f·'@\u0082*zz\t\u000b\u00871eçÞoz\u000e1\u008fD9ü\u0005Xo£:\u008fi·Î\u0088\u0097s:\u0005e\u009bcÛ»\u0005\u0089xñX \u0014ÕD³é@\t\u0000<Ûä,\u0098\u0003t)p\u0098äxp\u0002ëX\u0005\u0099^Ù\r\u008apN\u009f/¿\tH\\r·\u009b\u0086vÁÂ0\u00190\u0082Îï§Ï¤YU\u0099,2Óêl\u008aU\u0011¦%Ð\u008e\u001aû&´KÙ¾J¶\u0011!\u001a\u009b¤\u001aÜS\u001ax*\u0098ÁvW\u008e?<\u001d/Uwh<\u000eÞy«¯´'¦¹xÙ\u001fñôY°`ërÞ½à¨¼ì\u0007»6GLK\u000eÄ\u0010¼1ùçµhí\u0014ý-YmÇ\u0012\u00859\u008còá[<g¤è¾\u001d6Ì4²åâÄÆ¡\u0081{\u00852f\u00ad\u0086\u0091{_\u0005®\u0097FÑ:ÿ;G\u0093=³\u008a\u0005\u00014hýÂð÷\u0014RÆ\tâ\u0006§\u0094\u0095mÎQ\u007fË:\u0007D\u0014Ò\u0018~ã®Uq[\u0097ªÄÐ\u00946ÓðÛÖÄ¤ªÉèRP\u0007b\u0014¡C\u0097ï_?Ë«\u0085mù¾Ðñ\u0094\u001f7Ò\u008d¸\u0098{\u0088Aò\u009d0\u00adK¯F\u009b[\u0015\u008eÉHºþÞ\u007fc\u008ff\tÃ\u0090&\u0097 O'°\u009eè®±Å²\u008a4\u0087â!¶½ÙNö¥\u0006ìû{µX3yOä>TìMH\u008eÿÄB\u000bt/#ñÓ\u0003=\t;\u001dvü\u0084e\u0012FP\u0005ÞËm\u0094Ä å¨Z\u009f§L\u0089ò\r\u008bÑt/\u0082n]\u001aÇ\u0004J\u0082ÿ\u008dL3\u000fÐ\u0002>\n Â\b¤\u0014\u0083mÅ\u0092(à\u0018T\u0092\u0083?EDÂò²Þ\u0012³ö¢ïÔ!*u\u008a3>\u008fó\u0005Ù\u0014±ã¡B\u0087\u0019ÿÚ27\u009e¾è1×\u0011\u007fXÈ\u0080\u001f¸\u0012\u0095jcâ\u0013ô¶\u0014q@¿.ÊVËÆÁÍªËÿ|÷>;ÛÏ«q]¤Wª\u007f±èüíåÈI\u0080Du\u0006¡\\\b1N\u0092±È\u000f@®\u0002²yeV/.±q\u0096ZI3h\u009e#\u001b@\u0094a\u000fí\u0093z±fZWb\f\u0004YÛYä\u0089èé\u0018Îj\u0084ás4M\u0082(%pAú\u008brT\u0001¢\u0082;A·\u008f¾7Ö\u0099Mñ\rvTËápn¡@\u0096~^Õ÷|\u0097qµI¨ûV3?´\u0083ö\u009fjM»\u009fq\u009eøüÔ\u0004¥#Ð\u0007\u0005\u0091\u008fhÎ\u001e\u0002ÒÇ\n\u009f\u001cÂ°S!Ä¦'\u008e$ý©Y¿ÇH\u0085r\u008c\u009báv)Â®U\u0002Æ\u0007jâû\u0081Ì²\u001fà\u00015L= A\\ð\u008d\bv\fk(lè\u0003X\u0004^8\u008f\u0097\u0012µÑ!\"L\u0019}¼\u000bTÙÖ¡¾Ê\u00ad½°\u001e·®B\u00adÒ\u008c\u0003ÞÕ\u0086m5Å\u001df\u0094uÁtdíBTû ð\u001bÒü¾\u0003±\u0014\rC\u0019ºÅÝT\u0004÷ûÂª(P\u0004\u0002\u0097ÊyVÔbð£ÊÒÂ~\u0084\u009dæv·mæX,u´å\u0015\u008c)I\u0086s\u008eË1QÍiÿ\u0090\u0090M\u0097\u009bÕ\u0087îA2\u009a§¬ùT\u0019\"\u009d\u0088\u0007iz\u0014\u0016Íwä<wN\u0086\u0084y\u008fZ\u0014¿:Ë\u0017\u00072RôA5Þõ+ãà\n\u008435Ï§\u000b\u007fË\u0015%\u001d©¹\u0081OªÐ\fU4÷T\u0015CÊ%ð»k\u0092\u0099ë\u001e\u001e\u0088V7Ý©\rF\u0086U7ÉÁSCTïÆ0&\u001c\týæÆ\u0014\u00ad\u0006çÊT\u0085Þ\u0093aµ\u0097|\u008dØc»\u0001\u0082gÊ£\u0091ÞQ\n\u008a.\u001d\n{Î\u0097H\u0088|\u0013fñ\u0005\u000b²t\u0019WJJúN\u0001\u0000\u008c\f\u0016QSzåpöZù\u00068ïÚn\u0091?S\u008a¦\u008eÛ\u0016\u0081\n8¶³®ììÄÒ-\u00075fUxÒ\u0095cë#È9þÙ\u0083úû+`\u0014ã¼\u00981¹ó]?È5RøÝ\u001aÓ\u00ad\u008eöw~\u00160\u001eûñÏ\u0083È|i\u0083\u0001X\u0011¿\u0012â\u001bü\u009boºª\u0097%®_\u0004xÞöÝ\u0090Ñ\u0018Ä\u0097\u0019\u0000<é\u0014ô·ýö¯°¤¿\tÆ\u0012ÓuÔ,%ß\u000b\u000biªßëx¿¥Ø\u00870'¯1\u0013j\u008eò¬%©qE+®x*23Iì\u0081÷ß*HÇ\u008f\nQ§CBì&ûë\u00825\u007f\r,\u0002\u0004ôø\u0004&Ù\u008b\u008e,\u0003I\u00ad\u009e|æ\u0090ÛàõVóxa{Èÿ\u008b*O®½\u0011\u0007Î\u001d4+(\u0089@\u009f¶6\u0013©\u0081<Y½\u0015(Ä¡à\u0096-¡H=ËRU&"
         .length();
      char var1 = 31;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 2;
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
                     case 0 -> 14;
                     case 1 -> 6;
                     case 2 -> 117;
                     case 3 -> 107;
                     case 4 -> 66;
                     case 5 -> 1;
                     default -> 67;
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
                     g = new String[282];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI = new lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll();
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

                  var2 = "\u0082\u008b\u00048\u0004\u001a\u0011";
                  var4 = "\u0082\u008b\u00048\u0004\u001a\u0011".length();
                  var1 = 2;
                  var8 = -1;
            }

            var10000 = 88;
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
      int var2 = (var0 ^ 23275) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 29;
            case 1 -> 13;
            case 2 -> 59;
            case 3 -> 226;
            case 4 -> 31;
            case 5 -> 140;
            case 6 -> 205;
            case 7 -> 41;
            case 8 -> 168;
            case 9 -> 158;
            case 10 -> 231;
            case 11 -> 129;
            case 12 -> 123;
            case 13 -> 148;
            case 14 -> 65;
            case 15 -> 139;
            case 16 -> 98;
            case 17 -> 27;
            case 18 -> 165;
            case 19 -> 147;
            case 20 -> 17;
            case 21 -> 126;
            case 22 -> 1;
            case 23 -> 73;
            case 24 -> 96;
            case 25 -> 87;
            case 26 -> 154;
            case 27 -> 211;
            case 28 -> 36;
            case 29 -> 113;
            case 30 -> 246;
            case 31 -> 66;
            case 32 -> 199;
            case 33 -> 221;
            case 34 -> 192;
            case 35 -> 76;
            case 36 -> 214;
            case 37 -> 243;
            case 38 -> 33;
            case 39 -> 182;
            case 40 -> 184;
            case 41 -> 153;
            case 42 -> 61;
            case 43 -> 187;
            case 44 -> 247;
            case 45 -> 4;
            case 46 -> 145;
            case 47 -> 42;
            case 48 -> 245;
            case 49 -> 238;
            case 50 -> 110;
            case 51 -> 104;
            case 52 -> 46;
            case 53 -> 34;
            case 54 -> 63;
            case 55 -> 23;
            case 56 -> 234;
            case 57 -> 172;
            case 58 -> 164;
            case 59 -> 25;
            case 60 -> 209;
            case 61 -> 100;
            case 62 -> 69;
            case 63 -> 16;
            case 64 -> 57;
            case 65 -> 56;
            case 66 -> 222;
            case 67 -> 218;
            case 68 -> 141;
            case 69 -> 111;
            case 70 -> 77;
            case 71 -> 99;
            case 72 -> 179;
            case 73 -> 83;
            case 74 -> 74;
            case 75 -> 155;
            case 76 -> 117;
            case 77 -> 250;
            case 78 -> 135;
            case 79 -> 115;
            case 80 -> 244;
            case 81 -> 120;
            case 82 -> 239;
            case 83 -> 58;
            case 84 -> 161;
            case 85 -> 107;
            case 86 -> 177;
            case 87 -> 210;
            case 88 -> 233;
            case 89 -> 71;
            case 90 -> 121;
            case 91 -> 193;
            case 92 -> 105;
            case 93 -> 195;
            case 94 -> 203;
            case 95 -> 130;
            case 96 -> 9;
            case 97 -> 70;
            case 98 -> 181;
            case 99 -> 22;
            case 100 -> 14;
            case 101 -> 92;
            case 102 -> 167;
            case 103 -> 142;
            case 104 -> 254;
            case 105 -> 223;
            case 106 -> 32;
            case 107 -> 118;
            case 108 -> 93;
            case 109 -> 91;
            case 110 -> 248;
            case 111 -> 85;
            case 112 -> 235;
            case 113 -> 197;
            case 114 -> 89;
            case 115 -> 40;
            case 116 -> 102;
            case 117 -> 208;
            case 118 -> 44;
            case 119 -> 219;
            case 120 -> 109;
            case 121 -> 220;
            case 122 -> 28;
            case 123 -> 114;
            case 124 -> 174;
            case 125 -> 2;
            case 126 -> 26;
            case 127 -> 127;
            case 128 -> 38;
            case 129 -> 132;
            case 130 -> 82;
            case 131 -> 21;
            case 132 -> 159;
            case 133 -> 18;
            case 134 -> 10;
            case 135 -> 215;
            case 136 -> 202;
            case 137 -> 39;
            case 138 -> 241;
            case 139 -> 229;
            case 140 -> 200;
            case 141 -> 160;
            case 142 -> 253;
            case 143 -> 124;
            case 144 -> 185;
            case 145 -> 5;
            case 146 -> 68;
            case 147 -> 150;
            case 148 -> 240;
            case 149 -> 53;
            case 150 -> 196;
            case 151 -> 49;
            case 152 -> 62;
            case 153 -> 125;
            case 154 -> 232;
            case 155 -> 236;
            case 156 -> 228;
            case 157 -> 15;
            case 158 -> 252;
            case 159 -> 48;
            case 160 -> 133;
            case 161 -> 230;
            case 162 -> 137;
            case 163 -> 162;
            case 164 -> 173;
            case 165 -> 176;
            case 166 -> 20;
            case 167 -> 64;
            case 168 -> 60;
            case 169 -> 216;
            case 170 -> 136;
            case 171 -> 186;
            case 172 -> 8;
            case 173 -> 183;
            case 174 -> 138;
            case 175 -> 163;
            case 176 -> 217;
            case 177 -> 143;
            case 178 -> 224;
            case 179 -> 72;
            case 180 -> 144;
            case 181 -> 171;
            case 182 -> 103;
            case 183 -> 35;
            case 184 -> 212;
            case 185 -> 67;
            case 186 -> 225;
            case 187 -> 255;
            case 188 -> 251;
            case 189 -> 149;
            case 190 -> 54;
            case 191 -> 24;
            case 192 -> 191;
            case 193 -> 94;
            case 194 -> 206;
            case 195 -> 157;
            case 196 -> 237;
            case 197 -> 95;
            case 198 -> 166;
            case 199 -> 37;
            case 200 -> 43;
            case 201 -> 55;
            case 202 -> 152;
            case 203 -> 151;
            case 204 -> 180;
            case 205 -> 112;
            case 206 -> 198;
            case 207 -> 178;
            case 208 -> 11;
            case 209 -> 47;
            case 210 -> 249;
            case 211 -> 12;
            case 212 -> 86;
            case 213 -> 97;
            case 214 -> 128;
            case 215 -> 188;
            case 216 -> 19;
            case 217 -> 30;
            case 218 -> 194;
            case 219 -> 50;
            case 220 -> 45;
            case 221 -> 242;
            case 222 -> 108;
            case 223 -> 116;
            case 224 -> 78;
            case 225 -> 169;
            case 226 -> 207;
            case 227 -> 75;
            case 228 -> 52;
            case 229 -> 146;
            case 230 -> 84;
            case 231 -> 170;
            case 232 -> 3;
            case 233 -> 131;
            case 234 -> 51;
            case 235 -> 106;
            case 236 -> 175;
            case 237 -> 189;
            case 238 -> 0;
            case 239 -> 156;
            case 240 -> 88;
            case 241 -> 101;
            case 242 -> 122;
            case 243 -> 190;
            case 244 -> 201;
            case 245 -> 80;
            case 246 -> 81;
            case 247 -> 119;
            case 248 -> 7;
            case 249 -> 227;
            case 250 -> 90;
            case 251 -> 213;
            case 252 -> 134;
            case 253 -> 79;
            case 254 -> 204;
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

         g[var2] = new String(var3).intern();
      }

      return g[var2];
   }

   private static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
   public static IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll p0, File p1, String p2, long p3, int m, Object mk) {
      if ((m & 1) != 0) {
         p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }
      if ((m & 2) != 0) {
         p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }
      if ((m & 4) != 0) {
         p3 = p0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }
      return new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(p1, p2, p3);
   }

      @NotNull
      private final File IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(@NotNull File var1, @NotNull String var2, long var3) {
         short var10001 = 15809;
         short var10002 = 21874;
         Intrinsics.checkNotNullParameter(var1, "clipFile");
         var10001 = 15808;
         var10002 = -12748;
         Intrinsics.checkNotNullParameter(var2, "banId");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      }

      @NotNull
      public final File a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final String b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final long c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final File d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final String e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final long f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
         @NotNull File var1, @NotNull String var2, long var3
      ) {
         short var10001 = 15813;
         short var10002 = 12599;
         Intrinsics.checkNotNullParameter(var1, "clipFile");
         var10001 = 15815;
         var10002 = -26524;
         Intrinsics.checkNotNullParameter(var2, "banId");
         return new lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 15811;
         long var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         String var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         File var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -10762;
         short var10002 = 15812;
         short var10003 = -28042;
         short var10004 = 15810;
         short var10005 = 16125;
         return "PendingBanClipDecision(clipFile=" + var4 + ", banId=" + var3 + ", banTimestamp=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         var1 = var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
         return var1 * 31 + Long.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int[] var2 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
         Object var10000 = this;
         if (var2 == null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == null) {
            if (!(
               var10000 instanceof lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = (lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var10000;
         int var4 = ((Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )) ? 1 : 0);
         if (var2 == null) {
            if ((var4 == 0)) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )) ? 1 : 0);
         }

         if (var2 == null) {
            if ((var4 == 0)) {
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

         if (var2 == null) {
            if ((var4 != 0)) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[7];
         int var3 = 0;
         String var2 = "»\u0088\u0010ý*_©c\u0005¯Q´S{ ÈE,xe~\u0081\u0087Â\u0095+WÐu³\u00adØhM×Õy\bî=\u0091Á>\u0086=ð\u0006\u000fÎX\u00133\b\u0088Å\u000b\u0081Óð,~¶\u009b\bÇ\u0095\u009f^Û+\u0097í";
         int var4 = "»\u0088\u0010ý*_©c\u0005¯Q´S{ ÈE,xe~\u0081\u0087Â\u0095+WÐu³\u00adØhM×Õy\bî=\u0091Á>\u0086=ð\u0006\u000fÎX\u00133\b\u0088Å\u000b\u0081Óð,~¶\u009b\bÇ\u0095\u009f^Û+\u0097í"
            .length();
         char var1 = '\b';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 120;
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
                        case 0 -> 114;
                        case 1 -> 41;
                        case 2 -> 56;
                        case 3 -> 47;
                        case 4 -> 90;
                        case 5 -> 101;
                        default -> 50;
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
                        b = new String[7];
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

                     var2 = "ôO\b\u008d7\u001esk\u0005ÎÚÄ~)";
                     var4 = "ôO\b\u008d7\u001esk\u0005ÎÚÄ~)".length();
                     var1 = '\b';
                     var8 = -1;
               }

               var10000 = 67;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 15809) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 155;
               case 1 -> 194;
               case 2 -> 98;
               case 3 -> 251;
               case 4 -> 102;
               case 5 -> 2;
               case 6 -> 90;
               case 7 -> 206;
               case 8 -> 58;
               case 9 -> 69;
               case 10 -> 39;
               case 11 -> 175;
               case 12 -> 118;
               case 13 -> 143;
               case 14 -> 64;
               case 15 -> 105;
               case 16 -> 20;
               case 17 -> 216;
               case 18 -> 204;
               case 19 -> 214;
               case 20 -> 13;
               case 21 -> 124;
               case 22 -> 122;
               case 23 -> 187;
               case 24 -> 79;
               case 25 -> 70;
               case 26 -> 61;
               case 27 -> 37;
               case 28 -> 174;
               case 29 -> 225;
               case 30 -> 193;
               case 31 -> 154;
               case 32 -> 164;
               case 33 -> 169;
               case 34 -> 157;
               case 35 -> 76;
               case 36 -> 52;
               case 37 -> 91;
               case 38 -> 62;
               case 39 -> 209;
               case 40 -> 148;
               case 41 -> 223;
               case 42 -> 227;
               case 43 -> 63;
               case 44 -> 195;
               case 45 -> 210;
               case 46 -> 55;
               case 47 -> 104;
               case 48 -> 33;
               case 49 -> 229;
               case 50 -> 177;
               case 51 -> 207;
               case 52 -> 117;
               case 53 -> 108;
               case 54 -> 12;
               case 55 -> 156;
               case 56 -> 226;
               case 57 -> 83;
               case 58 -> 40;
               case 59 -> 97;
               case 60 -> 103;
               case 61 -> 249;
               case 62 -> 35;
               case 63 -> 133;
               case 64 -> 42;
               case 65 -> 46;
               case 66 -> 0;
               case 67 -> 255;
               case 68 -> 168;
               case 69 -> 29;
               case 70 -> 3;
               case 71 -> 88;
               case 72 -> 246;
               case 73 -> 74;
               case 74 -> 200;
               case 75 -> 128;
               case 76 -> 34;
               case 77 -> 51;
               case 78 -> 190;
               case 79 -> 243;
               case 80 -> 232;
               case 81 -> 26;
               case 82 -> 86;
               case 83 -> 147;
               case 84 -> 198;
               case 85 -> 233;
               case 86 -> 16;
               case 87 -> 158;
               case 88 -> 7;
               case 89 -> 139;
               case 90 -> 176;
               case 91 -> 56;
               case 92 -> 219;
               case 93 -> 170;
               case 94 -> 110;
               case 95 -> 59;
               case 96 -> 237;
               case 97 -> 138;
               case 98 -> 6;
               case 99 -> 197;
               case 100 -> 28;
               case 101 -> 99;
               case 102 -> 132;
               case 103 -> 252;
               case 104 -> 134;
               case 105 -> 126;
               case 106 -> 150;
               case 107 -> 173;
               case 108 -> 89;
               case 109 -> 189;
               case 110 -> 114;
               case 111 -> 92;
               case 112 -> 18;
               case 113 -> 24;
               case 114 -> 213;
               case 115 -> 73;
               case 116 -> 240;
               case 117 -> 152;
               case 118 -> 202;
               case 119 -> 136;
               case 120 -> 95;
               case 121 -> 120;
               case 122 -> 234;
               case 123 -> 245;
               case 124 -> 179;
               case 125 -> 30;
               case 126 -> 236;
               case 127 -> 186;
               case 128 -> 65;
               case 129 -> 161;
               case 130 -> 54;
               case 131 -> 180;
               case 132 -> 38;
               case 133 -> 8;
               case 134 -> 94;
               case 135 -> 212;
               case 136 -> 235;
               case 137 -> 247;
               case 138 -> 222;
               case 139 -> 53;
               case 140 -> 238;
               case 141 -> 203;
               case 142 -> 172;
               case 143 -> 208;
               case 144 -> 23;
               case 145 -> 50;
               case 146 -> 48;
               case 147 -> 116;
               case 148 -> 140;
               case 149 -> 242;
               case 150 -> 244;
               case 151 -> 75;
               case 152 -> 218;
               case 153 -> 36;
               case 154 -> 241;
               case 155 -> 115;
               case 156 -> 111;
               case 157 -> 17;
               case 158 -> 67;
               case 159 -> 1;
               case 160 -> 127;
               case 161 -> 57;
               case 162 -> 121;
               case 163 -> 130;
               case 164 -> 239;
               case 165 -> 109;
               case 166 -> 171;
               case 167 -> 142;
               case 168 -> 72;
               case 169 -> 166;
               case 170 -> 129;
               case 171 -> 9;
               case 172 -> 184;
               case 173 -> 230;
               case 174 -> 224;
               case 175 -> 196;
               case 176 -> 60;
               case 177 -> 160;
               case 178 -> 248;
               case 179 -> 159;
               case 180 -> 106;
               case 181 -> 151;
               case 182 -> 49;
               case 183 -> 221;
               case 184 -> 188;
               case 185 -> 123;
               case 186 -> 84;
               case 187 -> 27;
               case 188 -> 144;
               case 189 -> 254;
               case 190 -> 47;
               case 191 -> 71;
               case 192 -> 11;
               case 193 -> 82;
               case 194 -> 100;
               case 195 -> 205;
               case 196 -> 21;
               case 197 -> 141;
               case 198 -> 220;
               case 199 -> 68;
               case 200 -> 231;
               case 201 -> 31;
               case 202 -> 32;
               case 203 -> 185;
               case 204 -> 228;
               case 205 -> 137;
               case 206 -> 4;
               case 207 -> 44;
               case 208 -> 43;
               case 209 -> 87;
               case 210 -> 181;
               case 211 -> 211;
               case 212 -> 5;
               case 213 -> 182;
               case 214 -> 96;
               case 215 -> 22;
               case 216 -> 250;
               case 217 -> 149;
               case 218 -> 112;
               case 219 -> 66;
               case 220 -> 192;
               case 221 -> 78;
               case 222 -> 215;
               case 223 -> 45;
               case 224 -> 101;
               case 225 -> 162;
               case 226 -> 107;
               case 227 -> 113;
               case 228 -> 183;
               case 229 -> 93;
               case 230 -> 217;
               case 231 -> 165;
               case 232 -> 146;
               case 233 -> 10;
               case 234 -> 80;
               case 235 -> 19;
               case 236 -> 153;
               case 237 -> 85;
               case 238 -> 178;
               case 239 -> 14;
               case 240 -> 81;
               case 241 -> 15;
               case 242 -> 167;
               case 243 -> 135;
               case 244 -> 119;
               case 245 -> 163;
               case 246 -> 41;
               case 247 -> 77;
               case 248 -> 253;
               case 249 -> 191;
               case 250 -> 131;
               case 251 -> 145;
               case 252 -> 125;
               case 253 -> 25;
               case 254 -> 201;
               default -> 199;
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

   public static enum IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;

      public static lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI[] a() {
         return (lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI[])lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clone();
      }

      public static lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI a(
         String var0
      ) {
         return Enum.valueOf(
            lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI> b() {
         return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI[]{IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl};
      private static final EnumEntries<IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = kotlin.enums.EnumEntriesKt.enumEntries(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
   
  // PX-FIX synth restored from jar bytecode
  // PX-FIX synth restored from jar bytecode: anewarray + getstatic*/aastore
  public static final me.octo.client.lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI[] c() { return new me.octo.client.lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI[] { IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl }; }
}

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(Object... px) {
        }
      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private static int[] IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private static String[] a;
      private static String[] b;

      private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
      }

      @JvmStatic
      @NotNull
      public final lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll a() {
         return lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI;
      }

      @JvmStatic
      @Nullable
      public final Integer a(@NotNull String var1) {
         int[] var10000 = b();
         short var10002 = 28036;
         short var10003 = 2130;
         Intrinsics.checkNotNullParameter(var1, "input");
         int[] var2 = var10000;
         String var6 = StringsKt.trim(var1).toString().toLowerCase(Locale.ROOT);
         var10002 = 28037;
         var10003 = 1106;
         Intrinsics.checkNotNullExpressionValue(var6, "toLowerCase(...)");
         String var3 = var6;
         var10002 = 28038;
         short var14 = 113;
         MatchResult var4 = (new Regex("^(\\d+)\\s*m(?:in(?:s)?)?$")).find( var3, 0);
         MatchResult var7 = var4;
         if (var2 == null) {
            if (var4 != null) {
               Integer var9 = StringsKt.toIntOrNull((String)var4.getGroupValues().get(1));
               if (var2 == null) {
                  if (var9 == null) {
                     return null;
                  }

                  var9 = var9 * 60;
               }

               if (var2 == null) {
                  return var9;
               }

               lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
                  new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[2]
               );
               return null;
            }

            var10002 = 28039;
            var14 = 22505;
            var7 = (new Regex("^(\\d+)\\s*s(?:ec(?:s)?)?$")).find( var3, 0);
         }

         MatchResult var5 = var7;
         var10000 = (int[])(Object)var5;
         if (var2 == null) {
            if (var5 == null) {
               return StringsKt.toIntOrNull(var3);
            }

            var10000 = (int[])(Object)(var5.getGroupValues().get(1));
         }

         return StringsKt.toIntOrNull((String)(Object)var10000);
      }

      public static void b(int[] var0) {
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var0;
      }

      public static int[] b() {
         return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[4];
         int var3 = 0;
         String var2 = "ÝJØÉ»\u009bBdT\u0001Ï\u0007[=3$\u0005tÛoÀõ";
         int var4 = "ÝJØÉ»\u009bBdT\u0001Ï\u0007[=3$\u0005tÛoÀõ".length();
         char var1 = 16;
         b(null);
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 56;
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
                        case 0 -> 13;
                        case 1 -> 83;
                        case 2 -> 75;
                        case 3 -> 56;
                        case 4 -> 68;
                        case 5 -> 125;
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
                        a = var5;
                        b = new String[4];
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

                     var2 = "n°\u0090s½«:Öº <u\u0094\u008cPp®5-ö\u0018'äX\u0018\u009aC\u000e\rnd@/õ\u0001Õ\u008c©¿ú\u009bWH\u0012YÿÒ\u0018æ";
                     var4 = "n°\u0090s½«:Öº <u\u0094\u008cPp®5-ö\u0018'äX\u0018\u009aC\u000e\rnd@/õ\u0001Õ\u008c©¿ú\u009bWH\u0012YÿÒ\u0018æ".length();
                     var1 = 24;
                     var8 = -1;
               }

               var10000 = 112;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 28037) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 35;
               case 1 -> 241;
               case 2 -> 10;
               case 3 -> 70;
               case 4 -> 137;
               case 5 -> 169;
               case 6 -> 249;
               case 7 -> 79;
               case 8 -> 16;
               case 9 -> 110;
               case 10 -> 90;
               case 11 -> 159;
               case 12 -> 19;
               case 13 -> 232;
               case 14 -> 138;
               case 15 -> 186;
               case 16 -> 132;
               case 17 -> 74;
               case 18 -> 24;
               case 19 -> 156;
               case 20 -> 136;
               case 21 -> 248;
               case 22 -> 254;
               case 23 -> 100;
               case 24 -> 219;
               case 25 -> 86;
               case 26 -> 214;
               case 27 -> 37;
               case 28 -> 204;
               case 29 -> 180;
               case 30 -> 255;
               case 31 -> 106;
               case 32 -> 51;
               case 33 -> 216;
               case 34 -> 147;
               case 35 -> 221;
               case 36 -> 71;
               case 37 -> 15;
               case 38 -> 125;
               case 39 -> 23;
               case 40 -> 119;
               case 41 -> 177;
               case 42 -> 88;
               case 43 -> 140;
               case 44 -> 235;
               case 45 -> 73;
               case 46 -> 208;
               case 47 -> 207;
               case 48 -> 39;
               case 49 -> 95;
               case 50 -> 18;
               case 51 -> 242;
               case 52 -> 31;
               case 53 -> 197;
               case 54 -> 162;
               case 55 -> 66;
               case 56 -> 148;
               case 57 -> 193;
               case 58 -> 48;
               case 59 -> 78;
               case 60 -> 251;
               case 61 -> 131;
               case 62 -> 107;
               case 63 -> 154;
               case 64 -> 46;
               case 65 -> 42;
               case 66 -> 0;
               case 67 -> 57;
               case 68 -> 202;
               case 69 -> 85;
               case 70 -> 89;
               case 71 -> 8;
               case 72 -> 246;
               case 73 -> 139;
               case 74 -> 49;
               case 75 -> 113;
               case 76 -> 50;
               case 77 -> 14;
               case 78 -> 157;
               case 79 -> 222;
               case 80 -> 9;
               case 81 -> 5;
               case 82 -> 64;
               case 83 -> 141;
               case 84 -> 150;
               case 85 -> 96;
               case 86 -> 55;
               case 87 -> 129;
               case 88 -> 102;
               case 89 -> 22;
               case 90 -> 59;
               case 91 -> 84;
               case 92 -> 229;
               case 93 -> 67;
               case 94 -> 250;
               case 95 -> 116;
               case 96 -> 217;
               case 97 -> 190;
               case 98 -> 155;
               case 99 -> 11;
               case 100 -> 30;
               case 101 -> 62;
               case 102 -> 65;
               case 103 -> 17;
               case 104 -> 144;
               case 105 -> 101;
               case 106 -> 3;
               case 107 -> 142;
               case 108 -> 166;
               case 109 -> 32;
               case 110 -> 105;
               case 111 -> 118;
               case 112 -> 121;
               case 113 -> 127;
               case 114 -> 210;
               case 115 -> 220;
               case 116 -> 163;
               case 117 -> 212;
               case 118 -> 53;
               case 119 -> 135;
               case 120 -> 109;
               case 121 -> 245;
               case 122 -> 252;
               case 123 -> 195;
               case 124 -> 151;
               case 125 -> 172;
               case 126 -> 34;
               case 127 -> 199;
               case 128 -> 134;
               case 129 -> 194;
               case 130 -> 93;
               case 131 -> 126;
               case 132 -> 69;
               case 133 -> 171;
               case 134 -> 112;
               case 135 -> 198;
               case 136 -> 145;
               case 137 -> 29;
               case 138 -> 244;
               case 139 -> 239;
               case 140 -> 27;
               case 141 -> 7;
               case 142 -> 228;
               case 143 -> 164;
               case 144 -> 165;
               case 145 -> 91;
               case 146 -> 234;
               case 147 -> 192;
               case 148 -> 230;
               case 149 -> 133;
               case 150 -> 247;
               case 151 -> 1;
               case 152 -> 43;
               case 153 -> 25;
               case 154 -> 175;
               case 155 -> 60;
               case 156 -> 189;
               case 157 -> 143;
               case 158 -> 87;
               case 159 -> 44;
               case 160 -> 226;
               case 161 -> 99;
               case 162 -> 236;
               case 163 -> 94;
               case 164 -> 68;
               case 165 -> 218;
               case 166 -> 130;
               case 167 -> 238;
               case 168 -> 181;
               case 169 -> 225;
               case 170 -> 176;
               case 171 -> 108;
               case 172 -> 178;
               case 173 -> 152;
               case 174 -> 122;
               case 175 -> 104;
               case 176 -> 160;
               case 177 -> 77;
               case 178 -> 173;
               case 179 -> 13;
               case 180 -> 82;
               case 181 -> 201;
               case 182 -> 6;
               case 183 -> 83;
               case 184 -> 203;
               case 185 -> 12;
               case 186 -> 209;
               case 187 -> 120;
               case 188 -> 52;
               case 189 -> 36;
               case 190 -> 41;
               case 191 -> 2;
               case 192 -> 75;
               case 193 -> 253;
               case 194 -> 33;
               case 195 -> 115;
               case 196 -> 161;
               case 197 -> 179;
               case 198 -> 185;
               case 199 -> 103;
               case 200 -> 76;
               case 201 -> 111;
               case 202 -> 63;
               case 203 -> 47;
               case 204 -> 213;
               case 205 -> 187;
               case 206 -> 206;
               case 207 -> 56;
               case 208 -> 233;
               case 209 -> 211;
               case 210 -> 40;
               case 211 -> 231;
               case 212 -> 240;
               case 213 -> 227;
               case 214 -> 128;
               case 215 -> 188;
               case 216 -> 117;
               case 217 -> 80;
               case 218 -> 72;
               case 219 -> 38;
               case 220 -> 200;
               case 221 -> 81;
               case 222 -> 168;
               case 223 -> 124;
               case 224 -> 183;
               case 225 -> 20;
               case 226 -> 170;
               case 227 -> 54;
               case 228 -> 61;
               case 229 -> 98;
               case 230 -> 123;
               case 231 -> 184;
               case 232 -> 182;
               case 233 -> 149;
               case 234 -> 223;
               case 235 -> 224;
               case 236 -> 45;
               case 237 -> 174;
               case 238 -> 114;
               case 239 -> 243;
               case 240 -> 191;
               case 241 -> 21;
               case 242 -> 205;
               case 243 -> 97;
               case 244 -> 58;
               case 245 -> 153;
               case 246 -> 237;
               case 247 -> 92;
               case 248 -> 26;
               case 249 -> 4;
               case 250 -> 196;
               case 251 -> 28;
               case 252 -> 158;
               case 253 -> 215;
               case 254 -> 167;
               default -> 146;
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

   private static enum llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;

      public static lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl[] a() {
         return (lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl[])lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clone();
      }

      public static lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl a(
         String var0
      ) {
         return Enum.valueOf(
            lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl> b() {
         return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl[]{IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl};
      private static final EnumEntries<llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = kotlin.enums.EnumEntriesKt.enumEntries(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
   
  // PX-FIX synth restored from jar bytecode
  // PX-FIX synth restored from jar bytecode: anewarray + getstatic*/aastore
  public static final me.octo.client.lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl[] c() { return new me.octo.client.lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl[] { IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl }; }
}

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @NotNull
      private final byte[] IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(@NotNull byte[] var1, long var2) {
         short var10001 = 4891;
         short var10002 = 15801;
         Intrinsics.checkNotNullParameter(var1, "data");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      }

      @NotNull
      public final byte[] a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final long b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final byte[] c() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final long d() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         @NotNull byte[] var1, long var2
      ) {
         short var10001 = 4888;
         short var10002 = 1043;
         Intrinsics.checkNotNullParameter(var1, "data");
         return new lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 4889;
         String var10001 = Arrays.toString(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         long var1 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         String var3 = var10001;
         short var4 = -21617;
         short var10002 = 4890;
         short var10003 = -32385;
         return "CapturedFrame(data=" + var3 + ", timestampNs=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Arrays.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         return var1 * 31 + Long.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int[] var2 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
         Object var10000 = this;
         if (var2 == null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == null) {
            if (!(
               var10000 instanceof lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         int var4 = ((Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )) ? 1 : 0);
         if (var2 == null) {
            if ((var4 == 0)) {
               return false;
            }

            long var5;
            var4 = (
                     var5 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        - var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  )
                  == 0L
               ? 0
               : (var5 < 0L ? -1 : 1);
         }

         if (var2 == null) {
            if ((var4 != 0)) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[4];
         int var3 = 0;
         String var2 = " <\rD\u0013?\u000b)·v\u008c\u008dæ»Óws4{\u0004¦\u0089\u0017®";
         int var4 = " <\rD\u0013?\u000b)·v\u008c\u008dæ»Óws4{\u0004¦\u0089\u0017®".length();
         char var1 = 4;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 8;
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
                        case 0 -> 101;
                        case 1 -> 79;
                        case 2 -> 48;
                        case 3 -> 15;
                        case 4 -> 87;
                        case 5 -> 26;
                        default -> 30;
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
                        b = new String[4];
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

                     var2 = "8\u0018\u0016øT\u0095\u009dy\u0013té\u0001\u009b>\u0004äGÌr";
                     var4 = "8\u0018\u0016øT\u0095\u009dy\u0013té\u0001\u009b>\u0004äGÌr".length();
                     var1 = 14;
                     var8 = -1;
               }

               var10000 = 18;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 4888) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 229;
               case 1 -> 136;
               case 2 -> 125;
               case 3 -> 134;
               case 4 -> 184;
               case 5 -> 167;
               case 6 -> 247;
               case 7 -> 226;
               case 8 -> 37;
               case 9 -> 106;
               case 10 -> 94;
               case 11 -> 18;
               case 12 -> 120;
               case 13 -> 138;
               case 14 -> 128;
               case 15 -> 19;
               case 16 -> 98;
               case 17 -> 36;
               case 18 -> 55;
               case 19 -> 228;
               case 20 -> 86;
               case 21 -> 114;
               case 22 -> 23;
               case 23 -> 75;
               case 24 -> 34;
               case 25 -> 32;
               case 26 -> 181;
               case 27 -> 59;
               case 28 -> 242;
               case 29 -> 254;
               case 30 -> 45;
               case 31 -> 239;
               case 32 -> 113;
               case 33 -> 214;
               case 34 -> 205;
               case 35 -> 3;
               case 36 -> 236;
               case 37 -> 200;
               case 38 -> 82;
               case 39 -> 137;
               case 40 -> 212;
               case 41 -> 115;
               case 42 -> 201;
               case 43 -> 135;
               case 44 -> 9;
               case 45 -> 87;
               case 46 -> 223;
               case 47 -> 118;
               case 48 -> 193;
               case 49 -> 67;
               case 50 -> 249;
               case 51 -> 58;
               case 52 -> 97;
               case 53 -> 7;
               case 54 -> 101;
               case 55 -> 195;
               case 56 -> 93;
               case 57 -> 148;
               case 58 -> 17;
               case 59 -> 173;
               case 60 -> 160;
               case 61 -> 38;
               case 62 -> 117;
               case 63 -> 213;
               case 64 -> 175;
               case 65 -> 232;
               case 66 -> 237;
               case 67 -> 197;
               case 68 -> 131;
               case 69 -> 80;
               case 70 -> 76;
               case 71 -> 157;
               case 72 -> 71;
               case 73 -> 149;
               case 74 -> 61;
               case 75 -> 22;
               case 76 -> 190;
               case 77 -> 234;
               case 78 -> 182;
               case 79 -> 28;
               case 80 -> 127;
               case 81 -> 244;
               case 82 -> 126;
               case 83 -> 161;
               case 84 -> 248;
               case 85 -> 57;
               case 86 -> 189;
               case 87 -> 50;
               case 88 -> 165;
               case 89 -> 187;
               case 90 -> 221;
               case 91 -> 246;
               case 92 -> 99;
               case 93 -> 108;
               case 94 -> 56;
               case 95 -> 69;
               case 96 -> 16;
               case 97 -> 209;
               case 98 -> 88;
               case 99 -> 222;
               case 100 -> 179;
               case 101 -> 44;
               case 102 -> 140;
               case 103 -> 112;
               case 104 -> 231;
               case 105 -> 168;
               case 106 -> 230;
               case 107 -> 0;
               case 108 -> 41;
               case 109 -> 65;
               case 110 -> 53;
               case 111 -> 241;
               case 112 -> 68;
               case 113 -> 21;
               case 114 -> 60;
               case 115 -> 171;
               case 116 -> 10;
               case 117 -> 233;
               case 118 -> 208;
               case 119 -> 176;
               case 120 -> 20;
               case 121 -> 227;
               case 122 -> 145;
               case 123 -> 1;
               case 124 -> 238;
               case 125 -> 95;
               case 126 -> 139;
               case 127 -> 77;
               case 128 -> 152;
               case 129 -> 164;
               case 130 -> 54;
               case 131 -> 191;
               case 132 -> 119;
               case 133 -> 62;
               case 134 -> 169;
               case 135 -> 143;
               case 136 -> 46;
               case 137 -> 219;
               case 138 -> 66;
               case 139 -> 30;
               case 140 -> 39;
               case 141 -> 172;
               case 142 -> 109;
               case 143 -> 224;
               case 144 -> 14;
               case 145 -> 144;
               case 146 -> 48;
               case 147 -> 194;
               case 148 -> 6;
               case 149 -> 166;
               case 150 -> 133;
               case 151 -> 102;
               case 152 -> 156;
               case 153 -> 13;
               case 154 -> 70;
               case 155 -> 206;
               case 156 -> 83;
               case 157 -> 103;
               case 158 -> 105;
               case 159 -> 158;
               case 160 -> 51;
               case 161 -> 203;
               case 162 -> 96;
               case 163 -> 154;
               case 164 -> 170;
               case 165 -> 43;
               case 166 -> 49;
               case 167 -> 92;
               case 168 -> 255;
               case 169 -> 25;
               case 170 -> 163;
               case 171 -> 192;
               case 172 -> 5;
               case 173 -> 218;
               case 174 -> 142;
               case 175 -> 90;
               case 176 -> 73;
               case 177 -> 235;
               case 178 -> 4;
               case 179 -> 110;
               case 180 -> 250;
               case 181 -> 151;
               case 182 -> 107;
               case 183 -> 111;
               case 184 -> 72;
               case 185 -> 204;
               case 186 -> 162;
               case 187 -> 146;
               case 188 -> 78;
               case 189 -> 24;
               case 190 -> 33;
               case 191 -> 26;
               case 192 -> 15;
               case 193 -> 240;
               case 194 -> 207;
               case 195 -> 132;
               case 196 -> 215;
               case 197 -> 180;
               case 198 -> 42;
               case 199 -> 177;
               case 200 -> 251;
               case 201 -> 183;
               case 202 -> 185;
               case 203 -> 188;
               case 204 -> 243;
               case 205 -> 199;
               case 206 -> 150;
               case 207 -> 31;
               case 208 -> 178;
               case 209 -> 11;
               case 210 -> 81;
               case 211 -> 159;
               case 212 -> 129;
               case 213 -> 210;
               case 214 -> 122;
               case 215 -> 29;
               case 216 -> 211;
               case 217 -> 220;
               case 218 -> 85;
               case 219 -> 47;
               case 220 -> 63;
               case 221 -> 202;
               case 222 -> 8;
               case 223 -> 174;
               case 224 -> 64;
               case 225 -> 123;
               case 226 -> 225;
               case 227 -> 198;
               case 228 -> 104;
               case 229 -> 84;
               case 230 -> 2;
               case 231 -> 253;
               case 232 -> 196;
               case 233 -> 216;
               case 234 -> 147;
               case 235 -> 27;
               case 236 -> 116;
               case 237 -> 121;
               case 238 -> 52;
               case 239 -> 40;
               case 240 -> 153;
               case 241 -> 89;
               case 242 -> 124;
               case 243 -> 155;
               case 244 -> 141;
               case 245 -> 35;
               case 246 -> 245;
               case 247 -> 186;
               case 248 -> 217;
               case 249 -> 91;
               case 250 -> 74;
               case 251 -> 100;
               case 252 -> 252;
               case 253 -> 12;
               case 254 -> 130;
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

            b[var2] = new String(var3).intern();
         }

         return b[var2];
      }
   
    public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0, @NotNull byte[] var1, long var2, int var3, Object var4) {
        if ((var3 & 1) != 0) {
            var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        }
        if ((var3 & 2) != 0) {
            var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
        }
        return var0.a(var1, var2);
    }}
}
