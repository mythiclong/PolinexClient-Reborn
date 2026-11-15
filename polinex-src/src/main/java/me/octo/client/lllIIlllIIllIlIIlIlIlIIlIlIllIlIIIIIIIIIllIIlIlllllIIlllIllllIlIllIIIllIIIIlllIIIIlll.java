package me.octo.client;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI;
import me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl;
import me.octo.client.events.impl.IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl;
import me.octo.client.events.impl.IIllIlllIIIIIllllIlllIIllIIIlIIllIIllIIlIllIIllIIIlIllIIlIIIIIlIIIIlIlIIIIIIlIlllIllI;
import me.octo.client.events.impl.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll;
import me.octo.client.events.impl.lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI;
import me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.EnvironmentAccess;
import org.graalvm.polyglot.PolyglotAccess;
import org.graalvm.polyglot.ResourceLimits;
import org.graalvm.polyglot.Source;
import org.graalvm.polyglot.Value;
import org.graalvm.polyglot.Context.Builder;
import org.graalvm.polyglot.HostAccess.Export;
import org.graalvm.polyglot.HostAccess.Implementable;
import org.graalvm.polyglot.io.IOAccess;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll {
   @NotNull
   private final File IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private long IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private long IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private final Object lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private final Context IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private final Map<String, Value> llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private final IIIIlIIlIlllllllIlIlIlIIlIIlllIlIllIllIlIIllIlIIIlIIIllIIIllIlllIllIIIIIlllIlIIlllllI lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private final IlIllIlIIlIIIIllllIIIIIllIllIlIlIIlIIIIlIIlIIIIIIlIIIIIllIIllIlIllIlIlllIllIIIllIlIII lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private final lllllIIlIIIlIIllIlIlIIIllIlllIlIlIIlIlIllllIlIllllIllIIIlIIllIIIlIlIIllIlIllIIIIlIIll lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private final IlllIlIlIlIIlIIIIIIIIIllIlllIlIlIlllllIlIllIlllIlIIIIIlIlllllIlIllllIIIlIIllIlIlllIIl lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private final lIIIIlIIIIlIlllIIIIlllIIlllllllllIllIIlIlIIIIllllIllIlIIlIIlIIIlIIlIlllIlIIllIlIIIIIl IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private final IlllllIIlIIIIlIlllIIIIlIIlllllIIIIlIlIIllIlIlIIllIIlIIIlIIlllIlllllIIIIIIIllllllllIIl llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @NotNull
   private final lIIIIlIlIIIIIIlIIlIlIlllIlIlIIllIllllIlllIIllllIIIIIlllIIIIlllIlllllIIllIllIllIllIIll IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @NotNull
   private final lllIlIIlllIIIlllIIlIIIlIlIIIIIIIlIIlllIllllIIlIIIIlIIIIlIIIlIIIIlIIIIIlIIlIIlIlIlllll IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @NotNull
   private final llIIIIllIIllIlIIlIlIIIIIIllIllIIlllIlllllllIIIIIIllIIlIlIllIIIllIIIllllIIllIlIllllIll IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   @NotNull
   private final lIIIllIlllllIIllIIlIlllllllIIIIIllllIlIlllIIIlIIllIlIIlllIIIIlIlIIllIIIlIIlllIIIIIlII IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   @NotNull
   private final IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private boolean IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   private static boolean lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   private static String[] a;
   private static String[] b;

   public lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll(@NotNull File var1) {
      short var10001 = 31334;
      short var10002 = 13712;
      Intrinsics.checkNotNullParameter(var1, "file");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = FilesKt.getNameWithoutExtension(
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
      );
      var10001 = 31343;
      var10002 = 11451;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = "No description";
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new Object();
      String[] var4 = new String[1];
      short var10003 = 31302;
      short var10004 = -22961;
      var4[0] = "js";
      Builder var9 = Context.newBuilder(var4)
         .allowHostAccess(
            IIIIlIIIIlIlllIIlIIIIIIIIIllIlIlIllIIlIIIlIlIIllIIIlIlIIIIIllIlIIIllIllllIllllllIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
         )
         .allowHostClassLookup(lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll::a)
         .allowIO(IOAccess.NONE)
         .allowNativeAccess(false)
         .allowCreateThread(false)
         .allowCreateProcess(false)
         .allowEnvironmentAccess(EnvironmentAccess.NONE)
         .allowPolyglotAccess(PolyglotAccess.NONE);
      var10002 = 31299;
      var10003 = -12724;
      var10003 = 31320;
      var10004 = 21375;
      Context var10 = var9.option("engine.WarnInterpreterOnly", "false").resourceLimits(ResourceLimits.newBuilder().build()).build();
      var10003 = 31309;
      var10004 = 16403;
      Intrinsics.checkNotNullExpressionValue(var10, "build(...)");
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var10;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new LinkedHashMap<>();
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new IIIIlIIlIlllllllIlIlIlIIlIIlllIlIllIllIlIIllIlIIIlIIIllIIIllIlllIllIIIIIlllIlIIlllllI();
      short var10000 = ((short)((h()) ? 1 : 0));
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IlIllIlIIlIIIIllllIIIIIllIllIlIlIIlIIIIlIIlIIIIIIlIIIIIllIIllIlIllIlIlllIllIIIllIlIII();
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new lllllIIlIIIlIIllIlIlIIIllIlllIlIlIIlIlIllllIlIllllIllIIIlIIllIIIlIlIIllIlIllIIIIlIIll();
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new IlllIlIlIlIIlIIIIIIIIIllIlllIlIlIlllllIlIllIlllIlIIIIIlIlllllIlIllllIIIlIIllIlIlllIIl();
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new lIIIIlIIIIlIlllIIIIlllIIlllllllllIllIIlIlIIIIllllIllIlIIlIIlIIIlIIlIlllIlIIllIlIIIIIl();
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new IlllllIIlIIIIlIlllIIIIlIIlllllIIIIlIlIIllIlIlIIllIIlIIIlIIlllIlllllIIIIIIIllllllllIIl();
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new lIIIIlIlIIIIIIlIIlIlIlllIlIlIIllIllllIlllIIllllIIIIIlllIIIIlllIlllllIIllIllIllIllIIll();
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new lllIlIIlllIIIlllIIlIIIlIlIIIIIIIlIIlllIllllIIlIIIIlIIIIlIIIlIIIIlIIIIIlIIlIIlIlIlllll();
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = new llIIIIllIIllIlIIlIlIIIIIIllIllIIlllIlllllllIIIIIIllIIlIlIllIIIllIIIllllIIllIlIllllIll();
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = new lIIIllIlllllIIllIIlIlllllllIIIIIllllIlIlllIIIlIIllIlIIlllIIIIlIlIIllIIIlIIlllIIIIIlII();
      boolean var2 = (var10000 != 0);
      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = new IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI(
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, this
      );
      var10001 = 31350;
      var10002 = -28916;
      Value var3 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.getBindings("js");
      var10001 = 31259;
      var10002 = 10652;
      var3.putMember("notification", this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl);
      var10001 = 31249;
      var10002 = 31334;
      var3.putMember("client", this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI);
      var10001 = 31300;
      var10002 = 31280;
      var3.putMember("render", this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl);
      var10001 = 31347;
      var10002 = -10603;
      var3.putMember("world", this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll);
      var10001 = 31252;
      var10002 = -1420;
      var3.putMember("player", this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
      var10001 = 31262;
      var10002 = -1688;
      var3.putMember("action", this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI);
      var10001 = 31311;
      var10002 = 25917;
      var3.putMember("packet", this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl);
      var10001 = 31257;
      var10002 = -7254;
      var3.putMember("rotation", this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl);
      var10001 = 31318;
      var10002 = -13406;
      var3.putMember("pathwalker", this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll);
      var10001 = 31319;
      var10002 = 15861;
      var3.putMember("etherwarp", this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl);
      var10001 = 31326;
      var10002 = -21396;
      var3.putMember("module", this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI);
      var10001 = 31348;
      var10002 = -23600;
      var3.putMember("initScript", (java.util.function.BiFunction<lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll, Value[], Object>)(lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll::a));
      var10001 = 31333;
      var10002 = 20588;
      var3.putMember("onTick", (java.util.function.BiFunction<lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll, Value[], Object>)(lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll::b));
      var10001 = 31322;
      var10002 = -11169;
      var3.putMember("onMotion", (java.util.function.BiFunction<lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll, Value[], Object>)(lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll::c));
      var10001 = 31296;
      var10002 = 7775;
      var3.putMember("onRender2D", (java.util.function.BiFunction<lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll, Value[], Object>)(lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll::d));
      var10001 = 31354;
      var10002 = 9667;
      var3.putMember("onRender3D", (java.util.function.BiFunction<lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll, Value[], Object>)(lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll::e));
      var10001 = 31256;
      var10002 = -32078;
      var3.putMember("onWorldRenderLast", (java.util.function.BiFunction<lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll, Value[], Object>)(lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll::f));
      var10001 = 31243;
      var10002 = 23140;
      var3.putMember("onPacketReceive", (java.util.function.BiFunction<lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll, Value[], Object>)(lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll::g));
      var10001 = 31355;
      var10002 = -13703;
      var3.putMember("onPacketSend", (java.util.function.BiFunction<lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll, Value[], Object>)(lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll::h));
      var10001 = 31338;
      var10002 = -12626;
      var3.putMember("onChatReceive", (java.util.function.BiFunction<lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll, Value[], Object>)(lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll::i));
      var10001 = 31344;
      var10002 = -27629;
      var3.putMember("onDeath", (java.util.function.BiFunction<lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll, Value[], Object>)(lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll::j));
      var10001 = 31261;
      var10002 = -20098;
      var3.putMember("onWorldLoad", (java.util.function.BiFunction<lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll, Value[], Object>)(lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll::k));
      var10001 = 31263;
      var10002 = 2346;
      var3.putMember("onEnable", (java.util.function.BiFunction<lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll, Value[], Object>)(lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll::l));
      var10001 = 31313;
      var10002 = 10066;
      var3.putMember("onDisable", (java.util.function.BiFunction<lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll, Value[], Object>)(lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll::m));
      var10000 = 31350;
      var10001 = -28916;
      Source var6;
      try {
         var6 = Source.newBuilder("js", this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl).build();
      }
      catch (java.io.IOException iOException) {
         throw new RuntimeException(iOException);
      }

      try {
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.eval(var6);
         if (var2) {
            lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
               new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[3]
            );
         }
      } catch (IllegalArgumentException var5) {
         throw (RuntimeException)a(var5);
      }
   }

   @NotNull
   public final File a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public final String b() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final String c() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public final lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll d() {
      lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var10000;
      lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var10001;
      String var10002;
      long var10003;
      long var10004;
      double var10005;
      label16: {
         try {
            var10002 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            var10003 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            var10004 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            if (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII > 0L) {
               var10005 = (double)this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                  / this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            } else {
               var10005 = 0.0;
            }
            var10000 = new lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
               var10002, var10003, var10004, var10005,
               this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll); // PX-FIX
            var10001 = var10000;
         } catch (IllegalArgumentException var1) {
            throw (RuntimeException)a(var1);
         }
      }

      return var10000;
   }

   @Nullable
   public final Object a(@Nullable Value param1, @NotNull Object... param2) {
      boolean var3 = i();
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param2, "args");
      if (var3 && param1 == null) {
         return null;
      }
      java.lang.Object var4 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      synchronized (var4) {
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.enter();
         try {
            java.lang.Object var6 = (var3 && param1.canExecute())
                  ? (java.lang.Object) param1.execute((java.lang.Object[]) java.util.Arrays.copyOf(param2, param2.length))
                  : null;
            return var6;
         } finally {
            this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.leave();
         }
      }
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.i ()Z
      // 03: aload 2
      // 04: sipush 31340
      // 07: sipush -27605
      // 0a: pop2
      // 0b: ldc_w "args"
      // 0e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 11: istore 3
      // 12: aload 1
      // 13: iload 3
      // 14: ifeq 2b
      // 17: ifnonnull 27
      // 1a: goto 21
      // 1d: invokestatic me/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: aconst_null
      // 22: areturn
      // 23: invokestatic me/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26: athrow
      // 27: aload 0
      // 28: getfield me/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Ljava/lang/Object;
      // 2b: astore 4
      // 2d: aload 4
      // 2f: monitorenter
      // 30: nop
      // 31: bipush 0
      // 32: istore 5
      // 34: aload 0
      // 35: getfield me/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lorg/graalvm/polyglot/Context;
      // 38: invokevirtual org/graalvm/polyglot/Context.enter ()V
      // 3b: nop
      // 3c: aload 1
      // 3d: iload 3
      // 3e: ifeq 58
      // 41: invokevirtual org/graalvm/polyglot/Value.canExecute ()Z
      // 44: ifeq 5b
      // 47: aload 1
      // 48: aload 2
      // 49: aload 2
      // 4a: arraylength
      // 4b: invokestatic java/util/Arrays.copyOf ([Ljava/lang/Object;I)[Ljava/lang/Object;
      // 4e: invokevirtual org/graalvm/polyglot/Value.execute ([Ljava/lang/Object;)Lorg/graalvm/polyglot/Value;
      // 51: goto 58
      // 54: invokestatic me/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 57: athrow
      // 58: goto 5c
      // 5b: aconst_null
      // 5c: astore 6
      // 5e: aload 0
      // 5f: getfield me/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lorg/graalvm/polyglot/Context;
      // 62: invokevirtual org/graalvm/polyglot/Context.leave ()V
      // 65: goto 74
      // 68: astore 7
      // 6a: aload 0
      // 6b: getfield me/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lorg/graalvm/polyglot/Context;
      // 6e: invokevirtual org/graalvm/polyglot/Context.leave ()V
      // 71: aload 7
      // 73: athrow
      // 74: aload 6
      // 76: nop
      // 77: astore 5
      // 79: aload 4
      // 7b: monitorexit
      // 7c: aload 5
      // 7e: goto 89
      // 81: astore 6
      // 83: aload 4
      // 85: monitorexit
      // 86: aload 6
      // 88: athrow
      // 89: areturn
   }

   public final void e() {
      if (this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll) {
         return;
      }

      me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a(this);
      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = true;
      this.a("enable", new Object[0]);
   }

   public final void f() {
      if (!this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll) {
         return;
      }

      this.a("disable", new Object[0]);
      me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.b(this);
      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = false;
   }

   public final void g() {
      this.f();
      IllIIIlIlIIIIIIIIlllIIlIllIIlIllIllIIIIIlIlllIIIIlllIIIIIllIlIlIlIIIIIlllIIIIIIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.close();
   }

   private final void a(String param1, Object... param2) {
      boolean flag = h();
      if (flag) {
         return;
      }

      Value value = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.get(param1);
      if (value == null) {
         return;
      }

      long start = System.nanoTime();
      try {
         Object lock = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
         synchronized (lock) {
            this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.enter();
            try {
               if (!flag) {
                  if (value.canExecute()) {
                     value.execute(java.util.Arrays.copyOf(param2, param2.length));
                  }
               }
            } finally {
               this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.leave();
            }
         }
      } catch (Exception e) {
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("[Script: " + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII + "] Error in " + param1 + " handler: " + e.getMessage());
         e.printStackTrace();
      } finally {
         long elapsed = (System.nanoTime() - start) / 1000000L;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI += elapsed;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII += 1L;
         if (flag) {
            this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = elapsed;
         } else {
            this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = elapsed;
            if (elapsed > this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
               this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = elapsed;
            }
         }
      }
   }

   @SubscribeEvent
   public final void a(@NotNull llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII param1) {
      net.minecraft.client.Minecraft var2 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.a();
      if (var2.player == null) {
         return;
      }

      var2 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.a();
      if (var2.level == null) {
         return;
      }

      this.a("tick", new Object[0]);
   }

   @SubscribeEvent
   public final void a(@NotNull lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI param1) {
      net.minecraft.client.Minecraft var2 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.a();
      if (var2.player == null) {
         return;
      }

      var2 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.a();
      if (var2.level == null) {
         return;
      }

      this.a("motion", new Object[]{param1});
   }

   @SubscribeEvent
   public final void a(@NotNull IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl param1) {
      net.minecraft.client.Minecraft var2 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.a();
      if (var2.player == null) {
         return;
      }

      var2 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.a();
      if (var2.level == null) {
         return;
      }

      this.a("render2d", new Object[]{param1});
   }

   @SubscribeEvent
   public final void a(@NotNull IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl param1) {
      net.minecraft.client.Minecraft var2 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.a();
      if (var2.player == null) {
         return;
      }

      var2 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.a();
      if (var2.level == null) {
         return;
      }

      this.a("render3d", new Object[]{param1});
   }

   @SubscribeEvent
   public final void a(@NotNull IIllIlllIIIIIllllIlllIIllIIIlIIllIIllIIlIllIIllIIIlIllIIlIIIIIlIIIIlIlIIIIIIlIlllIllI param1) {
      boolean var2 = h();
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "event");
      net.minecraft.client.Minecraft var3 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.a();
      if (!var2 && var3.player == null) {
         return;
      }
      if (var3.level == null) {
         return;
      }
      IlllIlIlIlIIlIIIIIIIIIllIlllIlIlIlllllIlIllIlllIlIIIIIlIlllllIlIllllIIIlIIllIlIlllIIl var4 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      var4.a(param1.k());
      this.a("worldRenderLast", new Object[]{param1});
      var4.a((net.fabricmc.fabric.api.client.rendering.v1.level.LevelRenderContext)null);
   }

   @SubscribeEvent
   public final void a(@NotNull IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      short var10001 = 31327;
      short var10002 = 8627;
      Intrinsics.checkNotNullParameter(var1, "event");
      var10001 = 31258;
      var10002 = 227;
      Object[] var2 = new Object[]{var1};
      this.a("worldLoad", var2);
   }

   @SubscribeEvent
   public final void a(@NotNull IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll param1) {
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "event");

      this.a("packetReceive", new Object[]{param1});

      if (!(param1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI instanceof net.minecraft.network.protocol.game.ClientboundSystemChatPacket)) {
         return;
      }

      String var4 = ((net.minecraft.network.protocol.game.ClientboundSystemChatPacket) param1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI).content().getString();

      this.a("chatReceive", new Object[]{var4, param1});

      if (!var4.startsWith(" ☠ You")) {
         return;
      }

      this.a("death", new Object[]{var4});
   }

   @SubscribeEvent
   public final void a(@NotNull IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI var1) {
      short var10001 = 31327;
      short var10002 = 8627;
      Intrinsics.checkNotNullParameter(var1, "event");
      var10001 = 31339;
      var10002 = -12600;
      Object[] var2 = new Object[]{var1};
      this.a("packetSend", var2);
   }

   private static final boolean a(String var0) {
      IIIIlIIIIlIlllIIlIIIIIIIIIllIlIlIllIIlIIIlIlIIllIIIlIlIIIIIllIlIIIllIllllIllllllIIlll var10000 = IIIIlIIIIlIlllIIlIIIIIIIIIllIlIlIllIIlIIIlIlIIllIIIlIlIIIIIllIlIIIllIllllIllllllIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      Intrinsics.checkNotNull(var0);
      return var10000.a(var0);
   }

   private static final Object a(lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll param0, Value[] param1) {
Value var2 = param1[0];
Intrinsics.checkNotNull(var2, "null cannot be cast to non-null type org.graalvm.polyglot.Value");
Value var3 = var2.getMember("module");
if (var3 == null) {
   throw new IllegalArgumentException("Script must have a 'module' configuration!");
}

if (var3.isNull()) {
   throw new IllegalArgumentException("Script must have a 'module' configuration!");
}

String var4 = var3.getMember("name").asString();
Intrinsics.checkNotNullExpressionValue(var4, "asString(...)");
param0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var4;
Value var5 = var3.getMember("description");
String var6 = var5 == null ? null : var5.asString();
param0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var6 == null ? "No description" : var6;
String var7 = var3.getMember("type").asString();
Intrinsics.checkNotNull(var7);
String var8 = var7.toLowerCase(java.util.Locale.ROOT);
Intrinsics.checkNotNullExpressionValue(var8, "toLowerCase(...)");
switch (var8) {
   case "boolean":
      return param0.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI.a(var3);
   case "dropdown":
      return param0.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI.b(var3);
   case "slider":
      return param0.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI.c(var3);
   case "decimalslider":
      return param0.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI.d(var3);
   case "range":
      return param0.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI.e(var3);
   case "decimalrange":
      return param0.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI.f(var3);
   default:
      throw new IllegalArgumentException("Unknown module type: " + var7);
}
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.h ()Z
      // 003: aload 1
      // 004: bipush 0
      // 005: aaload
      // 006: dup
      // 007: sipush 31349
      // 00a: sipush -31406
      // 00d: pop2
      // 00e: ldc_w "null cannot be cast to non-null type org.graalvm.polyglot.Value"
      // 011: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
      // 014: astore 3
      // 015: istore 2
      // 016: iload 2
      // 017: ifne 03b
      // 01a: aload 3
      // 01b: sipush 31345
      // 01e: sipush -28969
      // 021: pop2
      // 022: ldc_w "module"
      // 025: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 028: dup
      // 029: ifnonnull 04d
      // 02c: goto 033
      // 02f: invokestatic me/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 032: athrow
      // 033: pop
      // 034: goto 03b
      // 037: invokestatic me/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03a: athrow
      // 03b: new java/lang/IllegalArgumentException
      // 03e: dup
      // 03f: sipush 31305
      // 042: sipush -31472
      // 045: pop2
      // 046: ldc_w "Script must have a 'module' configuration!"
      // 049: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 04c: athrow
      // 04d: astore 4
      // 04f: iload 2
      // 050: ifne 09c
      // 053: aload 4
      // 055: invokevirtual org/graalvm/polyglot/Value.isNull ()Z
      // 058: ifeq 078
      // 05b: goto 062
      // 05e: invokestatic me/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 061: athrow
      // 062: new java/lang/IllegalArgumentException
      // 065: dup
      // 066: sipush 31330
      // 069: sipush -6393
      // 06c: pop2
      // 06d: ldc_w "Script must have a 'module' configuration!"
      // 070: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 073: athrow
      // 074: invokestatic me/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 077: athrow
      // 078: aload 0
      // 079: aload 4
      // 07b: sipush 31303
      // 07e: sipush 4373
      // 081: pop2
      // 082: ldc_w "name"
      // 085: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 088: invokevirtual org/graalvm/polyglot/Value.asString ()Ljava/lang/String;
      // 08b: dup
      // 08c: sipush 31260
      // 08f: sipush 22700
      // 092: pop2
      // 093: ldc_w "asString(...)"
      // 096: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 099: putfield me/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Ljava/lang/String;
      // 09c: aload 0
      // 09d: iload 2
      // 09e: ifne 0d1
      // 0a1: aload 4
      // 0a3: sipush 31346
      // 0a6: sipush 17210
      // 0a9: pop2
      // 0aa: ldc_w "description"
      // 0ad: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 0b0: dup
      // 0b1: ifnull 0c9
      // 0b4: goto 0bb
      // 0b7: invokestatic me/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ba: athrow
      // 0bb: invokevirtual org/graalvm/polyglot/Value.asString ()Ljava/lang/String;
      // 0be: dup
      // 0bf: ifnonnull 0da
      // 0c2: goto 0c9
      // 0c5: invokestatic me/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c8: athrow
      // 0c9: pop
      // 0ca: goto 0d1
      // 0cd: invokestatic me/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d0: athrow
      // 0d1: sipush 31328
      // 0d4: sipush -709
      // 0d7: pop2
      // 0d8: ldc "No description"
      // 0da: putfield me/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Ljava/lang/String;
      // 0dd: aload 4
      // 0df: sipush 31325
      // 0e2: sipush 14928
      // 0e5: pop2
      // 0e6: ldc_w "type"
      // 0e9: invokevirtual org/graalvm/polyglot/Value.getMember (Ljava/lang/String;)Lorg/graalvm/polyglot/Value;
      // 0ec: invokevirtual org/graalvm/polyglot/Value.asString ()Ljava/lang/String;
      // 0ef: astore 5
      // 0f1: aload 5
      // 0f3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 0f6: aload 5
      // 0f8: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 0fb: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 0fe: dup
      // 0ff: sipush 31336
      // 102: sipush 6682
      // 105: pop2
      // 106: ldc_w "toLowerCase(...)"
      // 109: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 10c: astore 6
      // 10e: aload 6
      // 110: invokevirtual java/lang/String.hashCode ()I
      // 113: iload 2
      // 114: ifne 16a
      // 117: lookupswitch 286 6 -1815344270 164 -899647263 61 -432061423 139 64711720 89 108280125 114 217288844 189
      // 150: invokestatic me/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 153: athrow
      // 154: aload 6
      // 156: sipush 31317
      // 159: sipush -1929
      // 15c: pop2
      // 15d: ldc_w "slider"
      // 160: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 163: goto 16a
      // 166: invokestatic me/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 169: athrow
      // 16a: ifne 205
      // 16d: goto 235
      // 170: aload 6
      // 172: sipush 31342
      // 175: sipush -12702
      // 178: pop2
      // 179: ldc_w "boolean"
      // 17c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 17f: ifne 1ed
      // 182: goto 235
      // 185: invokestatic me/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 188: athrow
      // 189: aload 6
      // 18b: sipush 31315
      // 18e: sipush -28347
      // 191: pop2
      // 192: ldc_w "range"
      // 195: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 198: ifne 21d
      // 19b: goto 235
      // 19e: invokestatic me/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a1: athrow
      // 1a2: aload 6
      // 1a4: sipush 31253
      // 1a7: sipush -28512
      // 1aa: pop2
      // 1ab: ldc_w "dropdown"
      // 1ae: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1b1: ifne 1f9
      // 1b4: goto 235
      // 1b7: invokestatic me/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ba: athrow
      // 1bb: aload 6
      // 1bd: sipush 31306
      // 1c0: sipush -19875
      // 1c3: pop2
      // 1c4: ldc_w "decimalslider"
      // 1c7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1ca: ifne 211
      // 1cd: goto 235
      // 1d0: invokestatic me/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d3: athrow
      // 1d4: aload 6
      // 1d6: sipush 31337
      // 1d9: sipush -26181
      // 1dc: pop2
      // 1dd: ldc_w "decimalrange"
      // 1e0: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1e3: ifne 229
      // 1e6: goto 235
      // 1e9: invokestatic me/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ec: athrow
      // 1ed: aload 0
      // 1ee: getfield me/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI Lme/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI;
      // 1f1: aload 4
      // 1f3: invokevirtual me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.a (Lorg/graalvm/polyglot/Value;)Lme/octo/client/lIIIlIlIIIIlIlIlIlllIIlIIlIIIIIlIIIlIIlIllIllIlIIIlIlIlIlIlIIIlIIIllIIlIllIIlllIIIIlI;
      // 1f6: goto 24f
      // 1f9: aload 0
      // 1fa: getfield me/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI Lme/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI;
      // 1fd: aload 4
      // 1ff: invokevirtual me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.b (Lorg/graalvm/polyglot/Value;)Lme/octo/client/lIIIlIlIIIIlIlIlIlllIIlIIlIIIIIlIIIlIIlIllIllIlIIIlIlIlIlIlIIIlIIIllIIlIllIIlllIIIIlI;
      // 202: goto 24f
      // 205: aload 0
      // 206: getfield me/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI Lme/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI;
      // 209: aload 4
      // 20b: invokevirtual me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.c (Lorg/graalvm/polyglot/Value;)Lme/octo/client/lIIIlIlIIIIlIlIlIlllIIlIIlIIIIIlIIIlIIlIllIllIlIIIlIlIlIlIlIIIlIIIllIIlIllIIlllIIIIlI;
      // 20e: goto 24f
      // 211: aload 0
      // 212: getfield me/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI Lme/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI;
      // 215: aload 4
      // 217: invokevirtual me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.d (Lorg/graalvm/polyglot/Value;)Lme/octo/client/lIIIlIlIIIIlIlIlIlllIIlIIlIIIIIlIIIlIIlIllIllIlIIIlIlIlIlIlIIIlIIIllIIlIllIIlllIIIIlI;
      // 21a: goto 24f
      // 21d: aload 0
      // 21e: getfield me/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI Lme/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI;
      // 221: aload 4
      // 223: invokevirtual me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.e (Lorg/graalvm/polyglot/Value;)Lme/octo/client/lIIIlIlIIIIlIlIlIlllIIlIIlIIIIIlIIIlIIlIllIllIlIIIlIlIlIlIlIIIlIIIllIIlIllIIlllIIIIlI;
      // 226: goto 24f
      // 229: aload 0
      // 22a: getfield me/octo/client/lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI Lme/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI;
      // 22d: aload 4
      // 22f: invokevirtual me/octo/client/IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.f (Lorg/graalvm/polyglot/Value;)Lme/octo/client/lIIIlIlIIIIlIlIlIlllIIlIIlIIIIIlIIIlIIlIllIllIlIIIlIlIlIlIlIIIlIIIllIIlIllIIlllIIIIlI;
      // 232: goto 24f
      // 235: new java/lang/IllegalArgumentException
      // 238: dup
      // 239: aload 5
      // 23b: sipush 31251
      // 23e: sipush 524
      // 241: pop2
      // 242: ldc_w "Unknown module type: "
      // 245: swap
      // 246: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 24b: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 24e: athrow
      // 24f: areturn
   }

   private static final Object b(lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll var0, Value[] var1) {
      short var10000 = 31332;
      Map var2 = var0.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      short var10001 = 21622;
      String var3 = "tick";
      Value var5 = var1[0];
      Value var6 = var1[0];
      short var10002 = 31349;
      short var10003 = -31406;
      Intrinsics.checkNotNull(var6, "null cannot be cast to non-null type org.graalvm.polyglot.Value");
      Value var4 = var5;
      var2.put(var3, var4);
      return null;
   }

   private static final Object c(lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll var0, Value[] var1) {
      short var10000 = 31304;
      Map var2 = var0.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      short var10001 = -16879;
      String var3 = "motion";
      Value var5 = var1[0];
      Value var6 = var1[0];
      short var10002 = 31349;
      short var10003 = -31406;
      Intrinsics.checkNotNull(var6, "null cannot be cast to non-null type org.graalvm.polyglot.Value");
      Value var4 = var5;
      var2.put(var3, var4);
      return null;
   }

   private static final Object d(lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll var0, Value[] var1) {
      short var10000 = 31359;
      Map var2 = var0.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      short var10001 = 2204;
      String var3 = "render2d";
      Value var5 = var1[0];
      Value var6 = var1[0];
      short var10002 = 31349;
      short var10003 = -31406;
      Intrinsics.checkNotNull(var6, "null cannot be cast to non-null type org.graalvm.polyglot.Value");
      Value var4 = var5;
      var2.put(var3, var4);
      return null;
   }

   private static final Object e(lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll var0, Value[] var1) {
      short var10000 = 31310;
      Map var2 = var0.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      short var10001 = -1251;
      String var3 = "render3d";
      Value var5 = var1[0];
      Value var6 = var1[0];
      short var10002 = 31349;
      short var10003 = -31406;
      Intrinsics.checkNotNull(var6, "null cannot be cast to non-null type org.graalvm.polyglot.Value");
      Value var4 = var5;
      var2.put(var3, var4);
      return null;
   }

   private static final Object f(lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll var0, Value[] var1) {
      short var10000 = 31301;
      Map var2 = var0.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      short var10001 = 1917;
      String var3 = "worldRenderLast";
      Value var5 = var1[0];
      Value var6 = var1[0];
      short var10002 = 31349;
      short var10003 = -31406;
      Intrinsics.checkNotNull(var6, "null cannot be cast to non-null type org.graalvm.polyglot.Value");
      Value var4 = var5;
      var2.put(var3, var4);
      return null;
   }

   private static final Object g(lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll var0, Value[] var1) {
      short var10000 = 31324;
      Map var2 = var0.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      short var10001 = 29718;
      String var3 = "packetReceive";
      Value var5 = var1[0];
      Value var6 = var1[0];
      short var10002 = 31349;
      short var10003 = -31406;
      Intrinsics.checkNotNull(var6, "null cannot be cast to non-null type org.graalvm.polyglot.Value");
      Value var4 = var5;
      var2.put(var3, var4);
      return null;
   }

   private static final Object h(lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll var0, Value[] var1) {
      short var10000 = 31316;
      Map var2 = var0.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      short var10001 = -25435;
      String var3 = "packetSend";
      Value var5 = var1[0];
      Value var6 = var1[0];
      short var10002 = 31349;
      short var10003 = -31406;
      Intrinsics.checkNotNull(var6, "null cannot be cast to non-null type org.graalvm.polyglot.Value");
      Value var4 = var5;
      var2.put(var3, var4);
      return null;
   }

   private static final Object i(lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll var0, Value[] var1) {
      short var10000 = 31250;
      Map var2 = var0.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      short var10001 = 31162;
      String var3 = "chatReceive";
      Value var5 = var1[0];
      Value var6 = var1[0];
      short var10002 = 31349;
      short var10003 = -31406;
      Intrinsics.checkNotNull(var6, "null cannot be cast to non-null type org.graalvm.polyglot.Value");
      Value var4 = var5;
      var2.put(var3, var4);
      return null;
   }

   private static final Object j(lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll var0, Value[] var1) {
      short var10000 = 31248;
      Map var2 = var0.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      short var10001 = -8169;
      String var3 = "death";
      Value var5 = var1[0];
      Value var6 = var1[0];
      short var10002 = 31349;
      short var10003 = -31406;
      Intrinsics.checkNotNull(var6, "null cannot be cast to non-null type org.graalvm.polyglot.Value");
      Value var4 = var5;
      var2.put(var3, var4);
      return null;
   }

   private static final Object k(lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll var0, Value[] var1) {
      short var10000 = 31312;
      Map var2 = var0.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      short var10001 = 20141;
      String var3 = "worldLoad";
      Value var5 = var1[0];
      Value var6 = var1[0];
      short var10002 = 31321;
      short var10003 = 27509;
      Intrinsics.checkNotNull(var6, "null cannot be cast to non-null type org.graalvm.polyglot.Value");
      Value var4 = var5;
      var2.put(var3, var4);
      return null;
   }

   private static final Object l(lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll var0, Value[] var1) {
      short var10000 = 31352;
      Map var2 = var0.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      short var10001 = 31122;
      String var3 = "enable";
      Value var5 = var1[0];
      Value var6 = var1[0];
      short var10002 = 31349;
      short var10003 = -31406;
      Intrinsics.checkNotNull(var6, "null cannot be cast to non-null type org.graalvm.polyglot.Value");
      Value var4 = var5;
      var2.put(var3, var4);
      return null;
   }

   private static final Object m(lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll var0, Value[] var1) {
      short var10000 = 31331;
      Map var2 = var0.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      short var10001 = 7018;
      String var3 = "disable";
      Value var5 = var1[0];
      Value var6 = var1[0];
      short var10002 = 31349;
      short var10003 = -31406;
      Intrinsics.checkNotNull(var6, "null cannot be cast to non-null type org.graalvm.polyglot.Value");
      Value var4 = var5;
      var2.put(var3, var4);
      return null;
   }

   public static void b(boolean var0) {
      lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = var0;
   }

   public static boolean h() {
      return lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   }

   public static boolean i() {
      boolean var0 = h();

      try {
         return !var0;
      } catch (IllegalArgumentException var1) {
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
      String[] var5 = new String[81];
      int var3 = 0;
      String var2 = "G`Ôa±\u0001ZØ\b9À\u0086\u0014\u00adÞ·Q?Ç\u0091YE\u0007\u009d2r\u009fìäÒ³\u008cØÁ0\u0084Ò\u001aC¨H\u0097\u0082ÒH\u0000T5S§\u0012\u001e_POÂ\u007fPJqp>=&qÿ/ï\u009b\u0081H[\u0084\u0018¥UvàÓ\u0093i\u0005KgÁ\u0012Q\u0005>4\u0005\u0090ð\u0006<\tM\u0016ÀË\u0004ùõÛM\r+3\u0016\u0080EÕ¤\u0085\u0015r\u0004\u001c\u0016\u0005!9\u0018Í(\u000420±é\tvuf¤\u009e\u0006;AÖ\t\u0085\t5\u000f\u0013ûr{R\t\u000f!.{?f-\u0087b\nBÿ,\u001aåðÞ\u0098¥\t\u0006\u008fhëH±$\n{j\u001c«\u0004°\u008d)\u001cæ\u0006\r⛚Ëæßl\r\u0097T\u0017êmÏ\u0096g¥öñ\u0012\u0013*ý\u0005\u009a\u0006òG\u0097ßY&D\u0014\u00adP\u0006Ø6s/³;z9Öc\u0089\u001dO£X{/H\u009f¯ªµsR\u0016×ö\u0006` Ö?¢z\u0006\u0000>s!éá\bèö!³\u000f[\u008c\u0093\nÅP\u0091}ÿÑ®\u0099ê\u009f\u0006^\u0089\r0mú\u001a\u0081cðf\u0016ZØuk\u000f\u008ey«¬\u0013çµr@±3\u001e\u001aÿIÈ\bûVC§CÙ\u0005Ã\t}¡\u0092¿Ù\f\u009ce³\n9\u008e\u0099×¨àD&\u0089Ò\u0004'£D\u009c\u0002#\u0016\u000f£zña\u008b(kÓ:Ò\u001d2Ig°\u0006Ä\u001e¤®¿ø\f=8\u001b\u0005·1\u000bô\u0001o·\u00ad\nE\u0091\u00164Y\u009cz©O#\u0006!pþ%§9\u0006íø{\u001e£?\bF²ô;µJÚ±\n\u007f/Ä.\\½\u0091\u0084;â\u000e<r\u0016\u0014¡~0=ßB\u009e¦¡\u0081\u0007ª\u009d V\u0086\\\f\u0005\u0098¶\u0096øg\u000b¥ÊA3ª·\u008ef<7m\u0006¹\u0005ý\u0097Öû\u0007Ä30`F\u0006z\u000fÖÐ_4^\u0082Ñ\u0086mx÷g\u0014Í\u001b\u0002µX?\u009f¤RãfI\u001eè\u001a¿T¸¥Á\u001ahh±Ù¼\"|d\r\u0007\u0081øjBx\u0091\u000eJ+Tö.\u0016SÊÏ\"ÀT+k³VwÚ\u0090')\u008f¨\u0082 \u0006Æ\u008aÅÞ«\nóö=É]\u0017w$XÚ\n8Ttl\tH,6(\u0005\rÐFµÃ\u0011ÞªäÔ^<\u0099\u0011\f\u0095ÁWXe\u0099\u0097¬\u0088©û\u001e\u0010\u0094øJ2\u0016\u0016¾èp+æ½\u008c#ô\\\u000e\u009aC\u009aNÿåÂsÄLhs/Ó\u0007zì`³\u0006Að\u000bèZ\u001d\u009aQ{ÆcD½i\u0004~ó\u008bñ\u0007£h\u0081è¢\u008b\u0088*0W#LÅ\u000eqö\u0085\u0003ß°ÞÄhJû!\u0096ù\f3ßÿ¿¬\u0086ëÐÌ\u0015½\u0085Í\u0016à\u0082:´?\u000bÓ\u0005$¼cê¤\u000e\u0083\u001b¹E\u009b\u0084N_UÉZÃiÅ\u000b{\u008b²ç$\u0018]\u0001\u0004\u0004$\u0004ÏÒQ»\u0006dv4ÄÖ\u0000\u0004\u0086Â'·\f\u0092\u0017ëÉ\f£ßñzt\u001aI\t/c`B¹R'Nø\b>\u0013áA_»éý\u0011\u0095Ó\tv\u0003\u0097¯á\u0082$=¯\u008aç¬°Â\b\u001aOêä<ê1¶\u0006<øÐ¹bª\u000bUö\u0011Ò\u0000\u0003Ïm\u0084g¶\r ùt\u0096(öÀ]i`î$¨\u0015\u0088ÞëÖù¹D.¼àó\u0006MéÈz*\u0005\u009bS\r\u000bçÚü\u008amyA#´µw\u0006<x\u008fK6c\u0005S\u001c\u008dþy\u0005à\u001aÞU\u008b\r\u0012o1\u000b¡¤8«\u0086·v¤X\b\u001bj\u008aÁZ\u009eC\u009f";
      int var4 = "G`Ôa±\u0001ZØ\b9À\u0086\u0014\u00adÞ·Q?Ç\u0091YE\u0007\u009d2r\u009fìäÒ³\u008cØÁ0\u0084Ò\u001aC¨H\u0097\u0082ÒH\u0000T5S§\u0012\u001e_POÂ\u007fPJqp>=&qÿ/ï\u009b\u0081H[\u0084\u0018¥UvàÓ\u0093i\u0005KgÁ\u0012Q\u0005>4\u0005\u0090ð\u0006<\tM\u0016ÀË\u0004ùõÛM\r+3\u0016\u0080EÕ¤\u0085\u0015r\u0004\u001c\u0016\u0005!9\u0018Í(\u000420±é\tvuf¤\u009e\u0006;AÖ\t\u0085\t5\u000f\u0013ûr{R\t\u000f!.{?f-\u0087b\nBÿ,\u001aåðÞ\u0098¥\t\u0006\u008fhëH±$\n{j\u001c«\u0004°\u008d)\u001cæ\u0006\r⛚Ëæßl\r\u0097T\u0017êmÏ\u0096g¥öñ\u0012\u0013*ý\u0005\u009a\u0006òG\u0097ßY&D\u0014\u00adP\u0006Ø6s/³;z9Öc\u0089\u001dO£X{/H\u009f¯ªµsR\u0016×ö\u0006` Ö?¢z\u0006\u0000>s!éá\bèö!³\u000f[\u008c\u0093\nÅP\u0091}ÿÑ®\u0099ê\u009f\u0006^\u0089\r0mú\u001a\u0081cðf\u0016ZØuk\u000f\u008ey«¬\u0013çµr@±3\u001e\u001aÿIÈ\bûVC§CÙ\u0005Ã\t}¡\u0092¿Ù\f\u009ce³\n9\u008e\u0099×¨àD&\u0089Ò\u0004'£D\u009c\u0002#\u0016\u000f£zña\u008b(kÓ:Ò\u001d2Ig°\u0006Ä\u001e¤®¿ø\f=8\u001b\u0005·1\u000bô\u0001o·\u00ad\nE\u0091\u00164Y\u009cz©O#\u0006!pþ%§9\u0006íø{\u001e£?\bF²ô;µJÚ±\n\u007f/Ä.\\½\u0091\u0084;â\u000e<r\u0016\u0014¡~0=ßB\u009e¦¡\u0081\u0007ª\u009d V\u0086\\\f\u0005\u0098¶\u0096øg\u000b¥ÊA3ª·\u008ef<7m\u0006¹\u0005ý\u0097Öû\u0007Ä30`F\u0006z\u000fÖÐ_4^\u0082Ñ\u0086mx÷g\u0014Í\u001b\u0002µX?\u009f¤RãfI\u001eè\u001a¿T¸¥Á\u001ahh±Ù¼\"|d\r\u0007\u0081øjBx\u0091\u000eJ+Tö.\u0016SÊÏ\"ÀT+k³VwÚ\u0090')\u008f¨\u0082 \u0006Æ\u008aÅÞ«\nóö=É]\u0017w$XÚ\n8Ttl\tH,6(\u0005\rÐFµÃ\u0011ÞªäÔ^<\u0099\u0011\f\u0095ÁWXe\u0099\u0097¬\u0088©û\u001e\u0010\u0094øJ2\u0016\u0016¾èp+æ½\u008c#ô\\\u000e\u009aC\u009aNÿåÂsÄLhs/Ó\u0007zì`³\u0006Að\u000bèZ\u001d\u009aQ{ÆcD½i\u0004~ó\u008bñ\u0007£h\u0081è¢\u008b\u0088*0W#LÅ\u000eqö\u0085\u0003ß°ÞÄhJû!\u0096ù\f3ßÿ¿¬\u0086ëÐÌ\u0015½\u0085Í\u0016à\u0082:´?\u000bÓ\u0005$¼cê¤\u000e\u0083\u001b¹E\u009b\u0084N_UÉZÃiÅ\u000b{\u008b²ç$\u0018]\u0001\u0004\u0004$\u0004ÏÒQ»\u0006dv4ÄÖ\u0000\u0004\u0086Â'·\f\u0092\u0017ëÉ\f£ßñzt\u001aI\t/c`B¹R'Nø\b>\u0013áA_»éý\u0011\u0095Ó\tv\u0003\u0097¯á\u0082$=¯\u008aç¬°Â\b\u001aOêä<ê1¶\u0006<øÐ¹bª\u000bUö\u0011Ò\u0000\u0003Ïm\u0084g¶\r ùt\u0096(öÀ]i`î$¨\u0015\u0088ÞëÖù¹D.¼àó\u0006MéÈz*\u0005\u009bS\r\u000bçÚü\u008amyA#´µw\u0006<x\u008fK6c\u0005S\u001c\u008dþy\u0005à\u001aÞU\u008b\r\u0012o1\u000b¡¤8«\u0086·v¤X\b\u001bj\u008aÁZ\u009eC\u009f"
         .length();
      char var1 = '\b';
      b(false);
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 115;
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
                     case 0 -> 56;
                     case 1 -> 79;
                     case 2 -> 116;
                     case 3 -> 52;
                     case 4 -> 126;
                     case 5 -> 44;
                     default -> 69;
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
                     b = new String[81];
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

                  var2 = "¿^\u00ad¸[¯\u000f\u0007GwÁ\u0011\u0082ô©Ôï\n\u0097»ñÝ";
                  var4 = "¿^\u00ad¸[¯\u000f\u0007GwÁ\u0011\u0082ô©Ôï\n\u0097»ñÝ".length();
                  var1 = 6;
                  var8 = -1;
            }

            var10000 = 48;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 31323) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 25;
            case 1 -> 249;
            case 2 -> 167;
            case 3 -> 205;
            case 4 -> 141;
            case 5 -> 113;
            case 6 -> 9;
            case 7 -> 107;
            case 8 -> 78;
            case 9 -> 41;
            case 10 -> 179;
            case 11 -> 139;
            case 12 -> 18;
            case 13 -> 29;
            case 14 -> 98;
            case 15 -> 4;
            case 16 -> 172;
            case 17 -> 54;
            case 18 -> 145;
            case 19 -> 170;
            case 20 -> 178;
            case 21 -> 117;
            case 22 -> 3;
            case 23 -> 12;
            case 24 -> 155;
            case 25 -> 16;
            case 26 -> 126;
            case 27 -> 46;
            case 28 -> 124;
            case 29 -> 93;
            case 30 -> 13;
            case 31 -> 216;
            case 32 -> 53;
            case 33 -> 100;
            case 34 -> 240;
            case 35 -> 57;
            case 36 -> 156;
            case 37 -> 42;
            case 38 -> 14;
            case 39 -> 99;
            case 40 -> 234;
            case 41 -> 232;
            case 42 -> 184;
            case 43 -> 203;
            case 44 -> 130;
            case 45 -> 151;
            case 46 -> 70;
            case 47 -> 44;
            case 48 -> 101;
            case 49 -> 15;
            case 50 -> 119;
            case 51 -> 129;
            case 52 -> 190;
            case 53 -> 215;
            case 54 -> 60;
            case 55 -> 94;
            case 56 -> 164;
            case 57 -> 134;
            case 58 -> 200;
            case 59 -> 90;
            case 60 -> 166;
            case 61 -> 0;
            case 62 -> 159;
            case 63 -> 250;
            case 64 -> 110;
            case 65 -> 5;
            case 66 -> 254;
            case 67 -> 201;
            case 68 -> 212;
            case 69 -> 87;
            case 70 -> 114;
            case 71 -> 68;
            case 72 -> 230;
            case 73 -> 69;
            case 74 -> 97;
            case 75 -> 2;
            case 76 -> 180;
            case 77 -> 24;
            case 78 -> 243;
            case 79 -> 238;
            case 80 -> 108;
            case 81 -> 236;
            case 82 -> 185;
            case 83 -> 228;
            case 84 -> 102;
            case 85 -> 252;
            case 86 -> 27;
            case 87 -> 104;
            case 88 -> 137;
            case 89 -> 34;
            case 90 -> 169;
            case 91 -> 50;
            case 92 -> 127;
            case 93 -> 26;
            case 94 -> 106;
            case 95 -> 143;
            case 96 -> 6;
            case 97 -> 83;
            case 98 -> 154;
            case 99 -> 214;
            case 100 -> 208;
            case 101 -> 37;
            case 102 -> 79;
            case 103 -> 23;
            case 104 -> 77;
            case 105 -> 224;
            case 106 -> 45;
            case 107 -> 162;
            case 108 -> 19;
            case 109 -> 32;
            case 110 -> 36;
            case 111 -> 133;
            case 112 -> 227;
            case 113 -> 61;
            case 114 -> 66;
            case 115 -> 197;
            case 116 -> 31;
            case 117 -> 163;
            case 118 -> 96;
            case 119 -> 82;
            case 120 -> 52;
            case 121 -> 86;
            case 122 -> 22;
            case 123 -> 223;
            case 124 -> 20;
            case 125 -> 92;
            case 126 -> 237;
            case 127 -> 195;
            case 128 -> 183;
            case 129 -> 239;
            case 130 -> 175;
            case 131 -> 247;
            case 132 -> 174;
            case 133 -> 67;
            case 134 -> 193;
            case 135 -> 248;
            case 136 -> 191;
            case 137 -> 219;
            case 138 -> 11;
            case 139 -> 128;
            case 140 -> 147;
            case 141 -> 21;
            case 142 -> 39;
            case 143 -> 51;
            case 144 -> 17;
            case 145 -> 213;
            case 146 -> 33;
            case 147 -> 204;
            case 148 -> 91;
            case 149 -> 142;
            case 150 -> 160;
            case 151 -> 55;
            case 152 -> 218;
            case 153 -> 182;
            case 154 -> 121;
            case 155 -> 186;
            case 156 -> 187;
            case 157 -> 199;
            case 158 -> 64;
            case 159 -> 209;
            case 160 -> 71;
            case 161 -> 125;
            case 162 -> 144;
            case 163 -> 76;
            case 164 -> 10;
            case 165 -> 150;
            case 166 -> 207;
            case 167 -> 149;
            case 168 -> 136;
            case 169 -> 81;
            case 170 -> 74;
            case 171 -> 59;
            case 172 -> 235;
            case 173 -> 226;
            case 174 -> 85;
            case 175 -> 116;
            case 176 -> 158;
            case 177 -> 202;
            case 178 -> 138;
            case 179 -> 7;
            case 180 -> 146;
            case 181 -> 148;
            case 182 -> 43;
            case 183 -> 173;
            case 184 -> 255;
            case 185 -> 251;
            case 186 -> 109;
            case 187 -> 206;
            case 188 -> 72;
            case 189 -> 63;
            case 190 -> 135;
            case 191 -> 132;
            case 192 -> 103;
            case 193 -> 47;
            case 194 -> 84;
            case 195 -> 118;
            case 196 -> 192;
            case 197 -> 112;
            case 198 -> 88;
            case 199 -> 217;
            case 200 -> 181;
            case 201 -> 177;
            case 202 -> 157;
            case 203 -> 73;
            case 204 -> 194;
            case 205 -> 189;
            case 206 -> 244;
            case 207 -> 168;
            case 208 -> 161;
            case 209 -> 28;
            case 210 -> 225;
            case 211 -> 241;
            case 212 -> 152;
            case 213 -> 123;
            case 214 -> 30;
            case 215 -> 233;
            case 216 -> 58;
            case 217 -> 229;
            case 218 -> 89;
            case 219 -> 231;
            case 220 -> 165;
            case 221 -> 188;
            case 222 -> 1;
            case 223 -> 111;
            case 224 -> 131;
            case 225 -> 40;
            case 226 -> 140;
            case 227 -> 221;
            case 228 -> 38;
            case 229 -> 115;
            case 230 -> 211;
            case 231 -> 49;
            case 232 -> 222;
            case 233 -> 210;
            case 234 -> 242;
            case 235 -> 171;
            case 236 -> 95;
            case 237 -> 245;
            case 238 -> 176;
            case 239 -> 220;
            case 240 -> 198;
            case 241 -> 196;
            case 242 -> 56;
            case 243 -> 8;
            case 244 -> 153;
            case 245 -> 80;
            case 246 -> 62;
            case 247 -> 75;
            case 248 -> 35;
            case 249 -> 105;
            case 250 -> 48;
            case 251 -> 253;
            case 252 -> 65;
            case 253 -> 122;
            case 254 -> 120;
            default -> 246;
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

   public static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      @NotNull
      private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] a;
      private static String[] b;

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(@NotNull String var1, @NotNull String var2) {
         short var10001 = -10057;
         short var10002 = 20388;
         Intrinsics.checkNotNullParameter(var1, "name");
         var10001 = -10061;
         var10002 = 851;
         Intrinsics.checkNotNullParameter(var2, "description");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      }

      @NotNull
      public final String a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final String b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final String c() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final String d() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
         @NotNull String var1, @NotNull String var2
      ) {
         short var10001 = -10059;
         short var10002 = 30162;
         Intrinsics.checkNotNullParameter(var1, "name");
         var10001 = -10058;
         var10002 = -14853;
         Intrinsics.checkNotNullParameter(var2, "description");
         return new lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            var1, var2
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10002 = -10062;
         short var10003 = 29108;
         var10003 = -10060;
         short var10004 = -5101;
         return "ScriptMetadata(name="
            + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            + ", description="
            + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         return var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         boolean var2 = lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.i();
         Object var10000 = this;
         if (var2) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2) {
            if (!(
               var10000 instanceof lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = (lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var10000;
         boolean var4 = Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         );
         if (var2) {
            if (!var4) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
         }

         if (var2) {
            if (!var4) {
               return false;
            }

            var4 = true;
         }

         return var4;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[6];
         int var3 = 0;
         String var2 = "\u008c\u009fí\u0005÷(ç\u008a\u009f#\u0085\u0004\u0015Ë\u008b\r\u000eDU¢·ê²g\u008fÔ&Ñtþd\u0004\u0094\\»ÿ";
         int var4 = "\u008c\u009fí\u0005÷(ç\u008a\u009f#\u0085\u0004\u0015Ë\u008b\r\u000eDU¢·ê²g\u008fÔ&Ñtþd\u0004\u0094\\»ÿ".length();
         char var1 = 11;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 75;
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
                        case 0 -> 117;
                        case 1 -> 17;
                        case 2 -> 107;
                        case 3 -> 92;
                        case 4 -> 106;
                        case 5 -> 71;
                        default -> 58;
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
                        b = new String[6];
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

                     var2 = "gp;OuL³Òén\u0084¿\u0099õ%\u0092t»ø\u001f\u000bçòûÓN\u0089«Åm± ";
                     var4 = "gp;OuL³Òén\u0084¿\u0099õ%\u0092t»ø\u001f\u000bçòûÓN\u0089«Åm± ".length();
                     var1 = 20;
                     var8 = -1;
               }

               var10000 = 26;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -10058) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 249;
               case 1 -> 13;
               case 2 -> 197;
               case 3 -> 8;
               case 4 -> 156;
               case 5 -> 233;
               case 6 -> 97;
               case 7 -> 177;
               case 8 -> 89;
               case 9 -> 0;
               case 10 -> 73;
               case 11 -> 130;
               case 12 -> 236;
               case 13 -> 134;
               case 14 -> 124;
               case 15 -> 121;
               case 16 -> 75;
               case 17 -> 27;
               case 18 -> 125;
               case 19 -> 145;
               case 20 -> 71;
               case 21 -> 39;
               case 22 -> 200;
               case 23 -> 154;
               case 24 -> 211;
               case 25 -> 105;
               case 26 -> 178;
               case 27 -> 55;
               case 28 -> 243;
               case 29 -> 45;
               case 30 -> 254;
               case 31 -> 56;
               case 32 -> 31;
               case 33 -> 111;
               case 34 -> 221;
               case 35 -> 129;
               case 36 -> 58;
               case 37 -> 10;
               case 38 -> 193;
               case 39 -> 160;
               case 40 -> 106;
               case 41 -> 190;
               case 42 -> 191;
               case 43 -> 95;
               case 44 -> 109;
               case 45 -> 38;
               case 46 -> 79;
               case 47 -> 237;
               case 48 -> 76;
               case 49 -> 113;
               case 50 -> 195;
               case 51 -> 77;
               case 52 -> 104;
               case 53 -> 81;
               case 54 -> 30;
               case 55 -> 87;
               case 56 -> 33;
               case 57 -> 116;
               case 58 -> 173;
               case 59 -> 224;
               case 60 -> 247;
               case 61 -> 229;
               case 62 -> 114;
               case 63 -> 88;
               case 64 -> 206;
               case 65 -> 201;
               case 66 -> 161;
               case 67 -> 248;
               case 68 -> 240;
               case 69 -> 218;
               case 70 -> 40;
               case 71 -> 3;
               case 72 -> 70;
               case 73 -> 127;
               case 74 -> 184;
               case 75 -> 157;
               case 76 -> 255;
               case 77 -> 163;
               case 78 -> 118;
               case 79 -> 92;
               case 80 -> 225;
               case 81 -> 219;
               case 82 -> 144;
               case 83 -> 98;
               case 84 -> 151;
               case 85 -> 194;
               case 86 -> 67;
               case 87 -> 122;
               case 88 -> 252;
               case 89 -> 231;
               case 90 -> 48;
               case 91 -> 192;
               case 92 -> 209;
               case 93 -> 149;
               case 94 -> 4;
               case 95 -> 102;
               case 96 -> 108;
               case 97 -> 53;
               case 98 -> 234;
               case 99 -> 80;
               case 100 -> 86;
               case 101 -> 16;
               case 102 -> 82;
               case 103 -> 47;
               case 104 -> 205;
               case 105 -> 175;
               case 106 -> 43;
               case 107 -> 22;
               case 108 -> 210;
               case 109 -> 69;
               case 110 -> 101;
               case 111 -> 179;
               case 112 -> 198;
               case 113 -> 32;
               case 114 -> 65;
               case 115 -> 52;
               case 116 -> 180;
               case 117 -> 158;
               case 118 -> 141;
               case 119 -> 235;
               case 120 -> 171;
               case 121 -> 174;
               case 122 -> 189;
               case 123 -> 126;
               case 124 -> 7;
               case 125 -> 223;
               case 126 -> 204;
               case 127 -> 115;
               case 128 -> 137;
               case 129 -> 19;
               case 130 -> 96;
               case 131 -> 41;
               case 132 -> 64;
               case 133 -> 167;
               case 134 -> 120;
               case 135 -> 142;
               case 136 -> 103;
               case 137 -> 215;
               case 138 -> 222;
               case 139 -> 59;
               case 140 -> 93;
               case 141 -> 83;
               case 142 -> 23;
               case 143 -> 12;
               case 144 -> 18;
               case 145 -> 46;
               case 146 -> 214;
               case 147 -> 2;
               case 148 -> 155;
               case 149 -> 253;
               case 150 -> 78;
               case 151 -> 242;
               case 152 -> 60;
               case 153 -> 143;
               case 154 -> 213;
               case 155 -> 250;
               case 156 -> 119;
               case 157 -> 166;
               case 158 -> 183;
               case 159 -> 6;
               case 160 -> 42;
               case 161 -> 28;
               case 162 -> 26;
               case 163 -> 216;
               case 164 -> 94;
               case 165 -> 29;
               case 166 -> 181;
               case 167 -> 135;
               case 168 -> 165;
               case 169 -> 188;
               case 170 -> 14;
               case 171 -> 172;
               case 172 -> 112;
               case 173 -> 246;
               case 174 -> 138;
               case 175 -> 232;
               case 176 -> 170;
               case 177 -> 85;
               case 178 -> 37;
               case 179 -> 241;
               case 180 -> 49;
               case 181 -> 136;
               case 182 -> 251;
               case 183 -> 20;
               case 184 -> 74;
               case 185 -> 132;
               case 186 -> 185;
               case 187 -> 84;
               case 188 -> 9;
               case 189 -> 66;
               case 190 -> 34;
               case 191 -> 245;
               case 192 -> 244;
               case 193 -> 117;
               case 194 -> 123;
               case 195 -> 1;
               case 196 -> 11;
               case 197 -> 203;
               case 198 -> 230;
               case 199 -> 110;
               case 200 -> 153;
               case 201 -> 168;
               case 202 -> 207;
               case 203 -> 5;
               case 204 -> 15;
               case 205 -> 54;
               case 206 -> 217;
               case 207 -> 164;
               case 208 -> 147;
               case 209 -> 131;
               case 210 -> 61;
               case 211 -> 51;
               case 212 -> 202;
               case 213 -> 90;
               case 214 -> 50;
               case 215 -> 176;
               case 216 -> 72;
               case 217 -> 186;
               case 218 -> 44;
               case 219 -> 187;
               case 220 -> 133;
               case 221 -> 62;
               case 222 -> 196;
               case 223 -> 128;
               case 224 -> 57;
               case 225 -> 68;
               case 226 -> 239;
               case 227 -> 152;
               case 228 -> 150;
               case 229 -> 25;
               case 230 -> 35;
               case 231 -> 227;
               case 232 -> 21;
               case 233 -> 146;
               case 234 -> 169;
               case 235 -> 107;
               case 236 -> 100;
               case 237 -> 228;
               case 238 -> 148;
               case 239 -> 220;
               case 240 -> 36;
               case 241 -> 226;
               case 242 -> 17;
               case 243 -> 199;
               case 244 -> 99;
               case 245 -> 140;
               case 246 -> 159;
               case 247 -> 208;
               case 248 -> 162;
               case 249 -> 238;
               case 250 -> 139;
               case 251 -> 182;
               case 252 -> 24;
               case 253 -> 212;
               case 254 -> 63;
               default -> 91;
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
       public static me.octo.client.lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(me.octo.client.lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var0, java.lang.String var1, java.lang.String var2, int var3, java.lang.Object var4) {
           if ((var3 & 2) != 0) var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
           return var0.a(var1, var2);
       }
   }

   public static final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
      @NotNull
      private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final double lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private final long IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static String[] a;
      private static String[] b;

      public IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
         @NotNull String var1, long var2, long var4, double var6, long var8, long var10
      ) {
         short var10001 = -1029;
         short var10002 = 12254;
         Intrinsics.checkNotNullParameter(var1, "name");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var4;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var6;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var8;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var10;
      }

      @NotNull
      public final String a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final long b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final long c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final double d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final long e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final long f() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @NotNull
      public final String g() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final long h() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final long i() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final double j() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final long k() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final long l() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @NotNull
      public final lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(
         @NotNull String var1, long var2, long var4, double var6, long var8, long var10
      ) {
         short var10001 = -1028;
         short var10002 = 7994;
         Intrinsics.checkNotNullParameter(var1, "name");
         return new lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
            var1, var2, var4, var6, var8, var10
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -1027;
         long var1 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         long var3 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         double var5 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         long var7 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         long var9 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         String var11 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -24219;
         short var10002 = -1026;
         short var10003 = -4171;
         short var10004 = -1030;
         short var10005 = 14473;
         short var10006 = -1032;
         short var10007 = 1989;
         short var10008 = -1025;
         short var10009 = 5970;
         short var10010 = -1031;
         short var10011 = -24749;
         return "ScriptStats(name="
            + var11
            + ", totalExecutionTimeMs="
            + var9
            + ", executionCount="
            + var7
            + ", averageExecutionTimeMs="
            + var5
            + ", lastExecutionTimeMs="
            + var3
            + ", peakExecutionTimeMs="
            + var1
            + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         var1 = var1 * 31 + Long.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         var1 = var1 * 31 + Long.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         var1 = var1 * 31 + Double.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         var1 = var1 * 31 + Long.hashCode(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         return var1 * 31 + Long.hashCode(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         boolean var2 = lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.i();
         Object var10000 = this;
         if (var2) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2) {
            if (!(
               var10000 instanceof lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var3 = (lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)var10000;
         int var4 = ((Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )) ? 1 : 0);
         if (var2) {
            if (var4 == 0) {
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

         if (var2) {
            if (var4 != 0) {
               return false;
            }

            long var6;
            var4 = (
                     var6 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        - var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                  )
                  == 0L
               ? 0
               : (var6 < 0L ? -1 : 1);
         }

         if (var2) {
            if (var4 != 0) {
               return false;
            }

            var4 = Double.compare(
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            );
         }

         if (var2) {
            if (var4 != 0) {
               return false;
            }

            long var7;
            var4 = (
                     var7 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                        - var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                  )
                  == 0L
               ? 0
               : (var7 < 0L ? -1 : 1);
         }

         if (var2) {
            if (var4 != 0) {
               return false;
            }

            long var8;
            var4 = (
                     var8 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        - var3.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  )
                  == 0L
               ? 0
               : (var8 < 0L ? -1 : 1);
         }

         if (var2) {
            if (var4 != 0) {
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
         String[] var5 = new String[8];
         int var3 = 0;
         String var2 = "¹eÚ\bME\u001eó\b^X¹_\u001dä6b\u0090dy\u0089Ó\u0019\u00924®1ô\n\u0089?Z\u001d\u001f\"\u0011G|\u0019.ì\u001a±O2'ÈØ\u0004ÑEÀe\u0011ôsf×i\b._4JI\u0081\u0003Ñ©Ö\u009f\u0011\u008d\u009dÎ0\u009cÐ\u0001±;\u008c¼J\u0002º«<¼\u0004ÜÒa\u0097";
         int var4 = "¹eÚ\bME\u001eó\b^X¹_\u001dä6b\u0090dy\u0089Ó\u0019\u00924®1ô\n\u0089?Z\u001d\u001f\"\u0011G|\u0019.ì\u001a±O2'ÈØ\u0004ÑEÀe\u0011ôsf×i\b._4JI\u0081\u0003Ñ©Ö\u009f\u0011\u008d\u009dÎ0\u009cÐ\u0001±;\u008c¼J\u0002º«<¼\u0004ÜÒa\u0097"
            .length();
         char var1 = 22;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 124;
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
                        case 0 -> 20;
                        case 1 -> 112;
                        case 2 -> 69;
                        case 3 -> 24;
                        case 4 -> 82;
                        case 5 -> 22;
                        default -> 6;
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
                        b = new String[8];
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

                     var2 = "\u0093¾\u007f\u008b\u0088R\n\u0011vþkQÅüKökt¹\u0019Î#\u0017Þ\u008cÎÃ¢\u0081\u0081á\u0016|ÏÆ\u0098)_°õÅø\u0083Ñ\u0013\\";
                     var4 = "\u0093¾\u007f\u008b\u0088R\n\u0011vþkQÅüKökt¹\u0019Î#\u0017Þ\u008cÎÃ¢\u0081\u0081á\u0016|ÏÆ\u0098)_°õÅø\u0083Ñ\u0013\\".length();
                     var1 = 22;
                     var8 = -1;
               }

               var10000 = 99;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -1031) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 95;
               case 1 -> 215;
               case 2 -> 223;
               case 3 -> 137;
               case 4 -> 196;
               case 5 -> 204;
               case 6 -> 157;
               case 7 -> 12;
               case 8 -> 70;
               case 9 -> 84;
               case 10 -> 231;
               case 11 -> 36;
               case 12 -> 19;
               case 13 -> 180;
               case 14 -> 129;
               case 15 -> 103;
               case 16 -> 170;
               case 17 -> 39;
               case 18 -> 250;
               case 19 -> 38;
               case 20 -> 226;
               case 21 -> 45;
               case 22 -> 128;
               case 23 -> 254;
               case 24 -> 209;
               case 25 -> 207;
               case 26 -> 116;
               case 27 -> 111;
               case 28 -> 68;
               case 29 -> 144;
               case 30 -> 191;
               case 31 -> 139;
               case 32 -> 8;
               case 33 -> 121;
               case 34 -> 37;
               case 35 -> 205;
               case 36 -> 88;
               case 37 -> 232;
               case 38 -> 5;
               case 39 -> 141;
               case 40 -> 199;
               case 41 -> 237;
               case 42 -> 73;
               case 43 -> 102;
               case 44 -> 202;
               case 45 -> 28;
               case 46 -> 41;
               case 47 -> 172;
               case 48 -> 113;
               case 49 -> 42;
               case 50 -> 244;
               case 51 -> 136;
               case 52 -> 6;
               case 53 -> 46;
               case 54 -> 16;
               case 55 -> 214;
               case 56 -> 198;
               case 57 -> 64;
               case 58 -> 186;
               case 59 -> 67;
               case 60 -> 197;
               case 61 -> 114;
               case 62 -> 135;
               case 63 -> 29;
               case 64 -> 87;
               case 65 -> 32;
               case 66 -> 152;
               case 67 -> 108;
               case 68 -> 193;
               case 69 -> 171;
               case 70 -> 76;
               case 71 -> 219;
               case 72 -> 105;
               case 73 -> 54;
               case 74 -> 248;
               case 75 -> 83;
               case 76 -> 10;
               case 77 -> 234;
               case 78 -> 195;
               case 79 -> 183;
               case 80 -> 20;
               case 81 -> 51;
               case 82 -> 47;
               case 83 -> 22;
               case 84 -> 174;
               case 85 -> 60;
               case 86 -> 253;
               case 87 -> 99;
               case 88 -> 4;
               case 89 -> 34;
               case 90 -> 151;
               case 91 -> 148;
               case 92 -> 77;
               case 93 -> 154;
               case 94 -> 241;
               case 95 -> 169;
               case 96 -> 159;
               case 97 -> 115;
               case 98 -> 17;
               case 99 -> 238;
               case 100 -> 130;
               case 101 -> 177;
               case 102 -> 131;
               case 103 -> 110;
               case 104 -> 66;
               case 105 -> 117;
               case 106 -> 82;
               case 107 -> 245;
               case 108 -> 182;
               case 109 -> 140;
               case 110 -> 91;
               case 111 -> 3;
               case 112 -> 53;
               case 113 -> 227;
               case 114 -> 190;
               case 115 -> 104;
               case 116 -> 203;
               case 117 -> 149;
               case 118 -> 201;
               case 119 -> 81;
               case 120 -> 24;
               case 121 -> 208;
               case 122 -> 52;
               case 123 -> 9;
               case 124 -> 158;
               case 125 -> 49;
               case 126 -> 90;
               case 127 -> 176;
               case 128 -> 192;
               case 129 -> 251;
               case 130 -> 98;
               case 131 -> 161;
               case 132 -> 30;
               case 133 -> 79;
               case 134 -> 243;
               case 135 -> 240;
               case 136 -> 165;
               case 137 -> 26;
               case 138 -> 25;
               case 139 -> 252;
               case 140 -> 106;
               case 141 -> 57;
               case 142 -> 112;
               case 143 -> 65;
               case 144 -> 118;
               case 145 -> 155;
               case 146 -> 43;
               case 147 -> 206;
               case 148 -> 181;
               case 149 -> 33;
               case 150 -> 56;
               case 151 -> 132;
               case 152 -> 127;
               case 153 -> 133;
               case 154 -> 168;
               case 155 -> 69;
               case 156 -> 217;
               case 157 -> 80;
               case 158 -> 236;
               case 159 -> 72;
               case 160 -> 145;
               case 161 -> 160;
               case 162 -> 125;
               case 163 -> 153;
               case 164 -> 143;
               case 165 -> 163;
               case 166 -> 97;
               case 167 -> 100;
               case 168 -> 210;
               case 169 -> 48;
               case 170 -> 156;
               case 171 -> 27;
               case 172 -> 242;
               case 173 -> 119;
               case 174 -> 13;
               case 175 -> 109;
               case 176 -> 40;
               case 177 -> 166;
               case 178 -> 246;
               case 179 -> 55;
               case 180 -> 96;
               case 181 -> 189;
               case 182 -> 178;
               case 183 -> 31;
               case 184 -> 147;
               case 185 -> 7;
               case 186 -> 15;
               case 187 -> 164;
               case 188 -> 74;
               case 189 -> 18;
               case 190 -> 124;
               case 191 -> 89;
               case 192 -> 228;
               case 193 -> 23;
               case 194 -> 94;
               case 195 -> 188;
               case 196 -> 62;
               case 197 -> 213;
               case 198 -> 212;
               case 199 -> 221;
               case 200 -> 187;
               case 201 -> 235;
               case 202 -> 75;
               case 203 -> 11;
               case 204 -> 233;
               case 205 -> 220;
               case 206 -> 63;
               case 207 -> 150;
               case 208 -> 1;
               case 209 -> 86;
               case 210 -> 92;
               case 211 -> 14;
               case 212 -> 0;
               case 213 -> 123;
               case 214 -> 134;
               case 215 -> 50;
               case 216 -> 93;
               case 217 -> 2;
               case 218 -> 107;
               case 219 -> 255;
               case 220 -> 44;
               case 221 -> 146;
               case 222 -> 211;
               case 223 -> 58;
               case 224 -> 167;
               case 225 -> 247;
               case 226 -> 61;
               case 227 -> 216;
               case 228 -> 138;
               case 229 -> 175;
               case 230 -> 249;
               case 231 -> 184;
               case 232 -> 126;
               case 233 -> 200;
               case 234 -> 194;
               case 235 -> 218;
               case 236 -> 35;
               case 237 -> 185;
               case 238 -> 101;
               case 239 -> 71;
               case 240 -> 85;
               case 241 -> 230;
               case 242 -> 122;
               case 243 -> 229;
               case 244 -> 225;
               case 245 -> 179;
               case 246 -> 78;
               case 247 -> 224;
               case 248 -> 21;
               case 249 -> 162;
               case 250 -> 239;
               case 251 -> 173;
               case 252 -> 59;
               case 253 -> 222;
               case 254 -> 142;
               default -> 120;
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
       public static me.octo.client.lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(me.octo.client.lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var0, java.lang.String var1, long var2, long var3, double var4, long var5, long var6, int var7, java.lang.Object var8) {
           if ((var7 & 32) != 0) var6 = var0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
           return var0.a(var1, var2, var3, var4, var5, var6);
       }
   }

   @Implementable
   public interface IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      @Export
      @NotNull
      lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll a(
         @NotNull lllIIlllIIllIlIIlIlIlIIlIlIllIlIIIIIIIIIllIIlIlllllIIlllIllllIlIllIIIllIIIIlllIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var1
      );
   }

   @Implementable
   public interface llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @Export
      void a(@NotNull Value var1);
   }
}
