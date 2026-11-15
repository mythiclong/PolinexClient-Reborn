package me.octo.client.utils.player;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import java.net.URI;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import me.octo.client.IIllIIIIIlIIIllIIllIIIlIIIIIllIIIIIIlllllIIllIIIlllIllIIlIIlIIlllIIIllIlIlllllIIIIlII;
import me.octo.client.utils.lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.serializer.gson.GsonComponentSerializer;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.ClickEvent.OpenUrl;
import net.minecraft.network.chat.ClickEvent.SuggestCommand;
import net.minecraft.network.chat.HoverEvent.ShowText;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
   extends me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   public static <T> T a(Object p0, Object p1, Object p2) { return null; } // PX-FIX ovld

   @NotNull
   public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static Map<String, String> IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private static Regex lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private static Regex IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private static Function1<String, String> llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private static MiniMessage lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private static GsonComponentSerializer lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static Gson lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static Pattern lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static boolean IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static String[] c;
   private static String[] d;

   private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
   }

   private final void a(Function0<Unit> var1) {
      try {
         if (this.a().isSameThread()) {
            var1.invoke();
            return;
         }
      } catch (JsonParseException var2) {
         throw (RuntimeException)a(var2);
      }

      this.a().execute(IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI::b);
   }

   @NotNull
   public static final Function1<String, String> g() {
      return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   @JvmStatic
   public static final void h() {
   }

   private final void a(String var1) {
      this.a((kotlin.jvm.functions.Function1)null);
   }

   @JvmStatic
   public static final void polinex$sendChatRaw(@NotNull Object param0) {
      var var1 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      Intrinsics.checkNotNullParameter(param0, "message");
      var var2 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a();
      if (var2.player != null) {
        var var3 = var2.player.connection;
        if (var3 != null) {
          var3.sendChat(param0.toString());
        }
      }
   }

   @JvmStatic
   public static final void b(@NotNull String param0) {
      Intrinsics.checkNotNullParameter(param0, "command");
      var var1 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a();
      if (var1.player != null) {
        var var2 = var1.player.connection;
        if (var2 != null) {
          var2.sendCommand(param0);
        }
      }
   }

   @JvmStatic
   public static final void c(@NotNull String var0) {
      short var10001 = 2712;
      short var10002 = 24037;
      Intrinsics.checkNotNullParameter(var0, "message");
      short var10000 = 2724;
      var10001 = 2095;
      String var1 = "<bold><gradient:#55AAFF:#0066FF>[Polinex]</gradient></bold> <dark_gray>» <white>";
      Component var3 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.deserialize(var1 + var0);
      var10002 = 2722;
      short var10003 = -32368;
      Intrinsics.checkNotNullExpressionValue(var3, "deserialize(...)");
      Component var2 = var3;
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var2);
   }

   @JvmStatic
   public static final void d(@NotNull String var0) {
      short var10001 = 2798;
      short var10002 = -28134;
      Intrinsics.checkNotNullParameter(var0, "message");
      short var10000 = 2735;
      var10001 = -7383;
      String var1 = "<dark_gray><bold>[Polinex]</bold> » ";
      Component var3 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.deserialize(var1 + var0);
      var10002 = 2786;
      short var10003 = 22749;
      Intrinsics.checkNotNullExpressionValue(var3, "deserialize(...)");
      Component var2 = var3;
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var2);
   }

   @JvmStatic
   public static final void a(@NotNull String var0, @NotNull MutableComponent var1) {
      short var10001 = 2798;
      short var10002 = -28134;
      Intrinsics.checkNotNullParameter(var0, "message");
      var10001 = 2764;
      var10002 = -20756;
      Intrinsics.checkNotNullParameter(var1, "append");
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(
         () -> b(var0, var1)
      );
   }

   @JvmStatic
   public static final void a(@NotNull String... var0) {
      short var10001 = 2776;
      short var10002 = 25844;
      Intrinsics.checkNotNullParameter(var0, "messages");
      int var2 = 0;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      int var3 = var0.length;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var10000;

      while (var2 < var3) {
         String var4 = var0[var2];
         c(var4);
         var2++;
         if (var1 == null) {
            break;
         }
      }
   }

   @JvmStatic
   public static final void e(@NotNull String var0) {
      short var10001 = 2798;
      short var10002 = -28134;
      Intrinsics.checkNotNullParameter(var0, "message");
      short var10000 = 2733;
      var10001 = -10493;
      String var1 = "<bold><gradient:#55AAFF:#0066FF>[Polinex Script]</gradient></bold> <dark_gray>» <white>";
      Component var3 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.deserialize(var1 + var0);
      var10002 = 2786;
      short var10003 = 22749;
      Intrinsics.checkNotNullExpressionValue(var3, "deserialize(...)");
      Component var2 = var3;
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var2);
   }

   @JvmStatic
   public static final void f(@NotNull String var0) {
      short var10001 = 2798;
      short var10002 = -28134;
      Intrinsics.checkNotNullParameter(var0, "message");
      short var10000 = 2805;
      var10001 = 8791;
      String var1 = "<bold><red>[Cerberus]</red></bold> <dark_gray>» <red>";
      Component var3 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.deserialize(var1 + var0);
      var10002 = 2786;
      short var10003 = 22749;
      Intrinsics.checkNotNullExpressionValue(var3, "deserialize(...)");
      Component var2 = var3;
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var2);
   }

   @JvmStatic
   public static final void g(@NotNull String param0) {
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param0, "message");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      String var2 = "<bold><yellow>[PNX DEBUG]</yellow></bold> <dark_gray>? <white>";
      net.minecraft.network.chat.Component var3 = (net.minecraft.network.chat.Component)lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.deserialize(var2 + param0);
      kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var3, "deserialize(...)");
      if (var1 == null) {
         System.out.println("[PNX DEBUG] ? " + param0);
      } else {
         if (kotlin.jvm.internal.Intrinsics.areEqual(me.octo.client.lIIlIlIIllIllllIIIllIIIIIlIIlIllIllllIIlllIIIIIlIlIlllIlIIIlllIlIIlIlllllIIlIIIIIIIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.a(), "vdev-private")) {
            IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var3);
            return;
         }
         System.out.println("[PNX DEBUG] ? " + param0);
         return;
      }
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var3);
   }

   @JvmStatic
   public static final void b(@NotNull String... param0) {
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param0, "messages");
      int var2 = 0;
      int var3 = param0.length;
      String[] var1 = param0;
      while (var2 < var3) {
         String var4 = var1[var2];
         String var5 = "<bold><yellow>[PNX DEBUG]</yellow></bold> <dark_gray>\u00bb <white>";
         net.kyori.adventure.text.Component var6 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.deserialize(var5 + var4);
         if (!"vdev-private".equals(me.octo.client.lIIlIlIIllIllllIIIllIIIIIlIIlIllIllllIIlllIIIIIlIlIlllIlIIIlllIlIIlIlllllIIlIIIIIIIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.a())) {
            java.lang.System.out.println("[PNX DEBUG] \u00bb " + var4);
         } else {
            IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var6);
         }

         var2++;
      }
   }

   @JvmStatic
   public static final void h(@NotNull String var0) {
      short var10001 = 2798;
      short var10002 = -28134;
      Intrinsics.checkNotNullParameter(var0, "message");
      short var10000 = 2748;
      var10001 = 10979;
      String var1 = "<bold><red>[ERROR]</red></bold> <dark_gray>» <red>";
      Component var3 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.deserialize(var1 + var0);
      var10002 = 2786;
      short var10003 = 22749;
      Intrinsics.checkNotNullExpressionValue(var3, "deserialize(...)");
      Component var2 = var3;
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var2);
   }

   @JvmStatic
   public static final void i(@NotNull String var0) {
      short var10001 = 2798;
      short var10002 = -28134;
      Intrinsics.checkNotNullParameter(var0, "message");
      short var10000 = 2757;
      var10001 = -9202;
      String var1 = "<bold><green>[SUCCESS]</green></bold> <dark_gray>» <green>";
      Component var3 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.deserialize(var1 + var0);
      var10002 = 2786;
      short var10003 = 22749;
      Intrinsics.checkNotNullExpressionValue(var3, "deserialize(...)");
      Component var2 = var3;
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var2);
   }

   @JvmStatic
   public static final void j(@NotNull String var0) {
      short var10001 = 2798;
      short var10002 = -28134;
      Intrinsics.checkNotNullParameter(var0, "message");
      short var10000 = 2730;
      var10001 = -9493;
      String var1 = "<bold><gold>[WARNING]</gold></bold> <dark_gray>» <yellow>";
      Component var3 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.deserialize(var1 + var0);
      var10002 = 2786;
      short var10003 = 22749;
      Intrinsics.checkNotNullExpressionValue(var3, "deserialize(...)");
      Component var2 = var3;
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var2);
   }

   @JvmStatic
   public static final void k(@NotNull String var0) {
      short var10001 = 2798;
      short var10002 = -28134;
      Intrinsics.checkNotNullParameter(var0, "message");
      short var10000 = 2703;
      var10001 = -11887;
      String var1 = "<bold><aqua>[INFO]</aqua></bold> <dark_gray>» <white>";
      Component var3 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.deserialize(var1 + var0);
      var10002 = 2786;
      short var10003 = 22749;
      Intrinsics.checkNotNullExpressionValue(var3, "deserialize(...)");
      Component var2 = var3;
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var2);
   }

   @JvmStatic
   public static final void l(@NotNull String var0) {
      short var10001 = 2798;
      short var10002 = -28134;
      Intrinsics.checkNotNullParameter(var0, "message");
      Component var10000 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.deserialize(var0);
      var10002 = 2786;
      short var10003 = 22749;
      Intrinsics.checkNotNullExpressionValue(var10000, "deserialize(...)");
      Component var1 = var10000;
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var1);
   }

   @JvmStatic
   @NotNull
   public static final net.minecraft.network.chat.Component m(@NotNull String var0) {
      short var10001 = 2798;
      short var10002 = -28134;
      Intrinsics.checkNotNullParameter(var0, "message");
      Component var10000 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.deserialize(var0);
      var10002 = 2786;
      short var10003 = 22749;
      Intrinsics.checkNotNullExpressionValue(var10000, "deserialize(...)");
      Component var1 = var10000;
      return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b(var1);
   }

   private final void a(Component var1) {
      try {
         if (IIllIIIIIlIIIllIIllIIIlIIIIIllIIIIIIlllllIIllIIIlllIllIIlIIlIIlllIIIllIlIlllllIIIIlII.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
            .aA()) {
            return;
         }
      } catch (JsonParseException var2) {
         throw (RuntimeException)a(var2);
      }

      this.a(() -> c(var1));
   }

   private final net.minecraft.network.chat.Component b(Component param1) {
      String var3 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.serialize(param1);
      Intrinsics.checkNotNullExpressionValue(var3, "serialize(...)");
      com.google.gson.JsonElement var4 = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.fromJson(var3, com.google.gson.JsonElement.class);
      net.minecraft.network.chat.Component var5;
      try {
         if (this.a().player != null) {
            var5 = net.minecraft.network.chat.ComponentSerialization.CODEC
               .parse(this.a().player.registryAccess().createSerializationContext(com.mojang.serialization.JsonOps.INSTANCE), var4)
               .getOrThrow(s -> r(s));
         } else {
            var5 = net.minecraft.network.chat.Component.literal(param1.toString());
         }
      } catch (JsonParseException var7) {
         throw (RuntimeException)a(var7);
      }
      return var5;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h ()[Lme/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
      // 03: getstatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Lnet/kyori/adventure/text/serializer/gson/GsonComponentSerializer;
      // 06: aload 1
      // 07: invokeinterface net/kyori/adventure/text/serializer/gson/GsonComponentSerializer.serialize (Lnet/kyori/adventure/text/Component;)Ljava/lang/Object; 2
      // 0c: dup
      // 0d: sipush 2778
      // 10: sipush 7601
      // 13: pop2
      // 14: ldc_w "serialize(...)"
      // 17: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1a: checkcast java/lang/String
      // 1d: astore 3
      // 1e: getstatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Lcom/google/gson/Gson;
      // 21: aload 3
      // 22: ldc_w com/google/gson/JsonElement
      // 25: invokevirtual com/google/gson/Gson.fromJson (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
      // 28: checkcast com/google/gson/JsonElement
      // 2b: astore 4
      // 2d: astore 2
      // 2e: aload 0
      // 2f: invokevirtual me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()Lnet/minecraft/client/Minecraft;
      // 32: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 35: aload 2
      // 36: ifnull 7a
      // 39: ifnull 89
      // 3c: goto 43
      // 3f: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 42: athrow
      // 43: getstatic net/minecraft/network/chat/ComponentSerialization.CODEC Lcom/mojang/serialization/Codec;
      // 46: aload 0
      // 47: invokevirtual me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()Lnet/minecraft/client/Minecraft;
      // 4a: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 4d: dup
      // 4e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 51: invokevirtual net/minecraft/client/player/LocalPlayer.registryAccess ()Lnet/minecraft/core/RegistryAccess;
      // 54: getstatic com/mojang/serialization/JsonOps.INSTANCE Lcom/mojang/serialization/JsonOps;
      // 57: checkcast com/mojang/serialization/DynamicOps
      // 5a: invokeinterface net/minecraft/core/RegistryAccess.createSerializationContext (Lcom/mojang/serialization/DynamicOps;)Lnet/minecraft/resources/RegistryOps; 2
      // 5f: checkcast com/mojang/serialization/DynamicOps
      // 62: aload 4
      // 64: invokeinterface com/mojang/serialization/Codec.parse (Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult; 3
      // 69: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.r (Ljava/lang/String;)Lcom/google/gson/JsonParseException;, (Ljava/lang/String;)Lcom/google/gson/JsonParseException; ]
      // 6e: invokeinterface com/mojang/serialization/DataResult.getOrThrow (Ljava/util/function/Function;)Ljava/lang/Object; 2
      // 73: goto 7a
      // 76: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 79: athrow
      // 7a: astore 5
      // 7c: aload 5
      // 7e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 81: aload 5
      // 83: checkcast net/minecraft/network/chat/Component
      // 86: goto 9c
      // 89: aload 1
      // 8a: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 8d: invokestatic net/minecraft/network/chat/Component.literal (Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;
      // 90: astore 5
      // 92: aload 5
      // 94: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 97: aload 5
      // 99: checkcast net/minecraft/network/chat/Component
      // 9c: areturn
   }

   @JvmStatic
   public static final void n(@NotNull String var0) {
      short var10001 = 2792;
      short var10002 = 23370;
      Intrinsics.checkNotNullParameter(var0, "name");
      short var10000 = 2693;
      var10001 = 21661;
      var10001 = 2807;
      var10002 = -32261;
      lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.a(
         "failsafe_triggered", MapsKt.mapOf(TuplesKt.to("reason", var0)), true, true
      );
   }

   @JvmStatic
   public static final void a(
      @NotNull String var0, @NotNull String var1, @Nullable String var2, @Nullable String var3, @Nullable String var4, @Nullable String var5
   ) {
      short var10001 = 2794;
      short var10002 = -26481;
      Intrinsics.checkNotNullParameter(var0, "sender");
      var10001 = 2798;
      var10002 = -28134;
      Intrinsics.checkNotNullParameter(var1, "message");
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(
         () -> c(var0, var1, var2, var3, var4, var5)
      );
   }

   @JvmStatic
   public static void a(@NotNull String var0, @NotNull String var1, @Nullable String var2, @Nullable String var3, @Nullable String var4, @Nullable String var5, int var6, Object var7) {
      int var8;
      var8 = var6 & 4;
      if (var2 == null || var8 != 0) {
         var2 = null;
      }
      var8 = var6 & 8;
      if (var3 == null || var8 != 0) {
         var3 = null;
      }
      var8 = var6 & 16;
      if (var4 == null || var8 != 0) {
         var4 = null;
      }
      var8 = var6 & 32;
      if (var5 == null || var8 != 0) {
         var5 = null;
      }
      a(var0, var1, var2, var3, var4, var5);
   }

   private final MutableComponent b(String param1, String param2, String param3, String param4, String param5, String param6) {
      var var7 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      MutableComponent var8 = net.minecraft.network.chat.Component.literal("§8[§9§lPNX IRC§8] ");
      Intrinsics.checkNotNullExpressionValue(var8, "literal(...)");
      CharSequence var10 = param3;
      String var9;
      if (var10 == null || var10.length() == 0 || Intrinsics.areEqual(param3, "null")) {
         var9 = "§f";
      } else if (StringsKt.startsWith(param3, "#", false)) {
         String var15 = param3.substring(1);
         Intrinsics.checkNotNullExpressionValue(var15, "substring(...)");
         String var14 = var15.toLowerCase(java.util.Locale.ROOT);
         Intrinsics.checkNotNullExpressionValue(var14, "toLowerCase(...)");
         if (var14.length() == 6) {
            char var16 = var14.charAt(0);
            char var17 = var14.charAt(1);
            char var18 = var14.charAt(2);
            char var19 = var14.charAt(3);
            char var20 = var14.charAt(4);
            char var21 = var14.charAt(5);
            var9 = "§x§" + var16 + "§" + var17 + "§" + var18 + "§" + var19 + "§" + var20 + "§" + var21;
         } else {
            var9 = "§f";
         }
      } else {
         var9 = param3;
      }
      CharSequence var22 = param4;
      MutableComponent var11;
      if (var22 != null && var22.length() > 0) {
         var11 = net.minecraft.network.chat.Component.literal("§l" + var9 + param4).append(net.minecraft.network.chat.Component.literal(var9 + param1));
      } else {
         var11 = net.minecraft.network.chat.Component.literal(var9 + param1);
      }
      Intrinsics.checkNotNull(var11);
      MutableComponent var23 = var11;
      StringBuilder var12 = new StringBuilder();
      StringBuilder var13 = var12;
      var13.append("§7Sender: §f" + param1);
      if (param5 != null && param6 != null) {
         var13.append("\n§7Discord: §f" + param5 + " §8(" + param6 + ")");
      }
      var13.append("\n§7Click to mention");
      String var24 = var12.toString();
      var23.withStyle(new java.util.function.UnaryOperator<Style>() {
         public Style apply(Style var1) {
            return a(var24, param1, var1);
         }
      });
      var8.append(var23);
      var8.append(net.minecraft.network.chat.Component.literal("§8: §r"));
      java.util.regex.Matcher var25 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.matcher(param2);
      int var26 = 0;
      while (var25.find()) {
         int var27 = var25.start();
         int var28 = var25.end();
         String var29 = var25.group();
         if (var27 > var26) {
            String var30 = param2.substring(var26, var27);
            Intrinsics.checkNotNullExpressionValue(var30, "substring(...)");
            var8.append(net.minecraft.network.chat.Component.literal(var30));
         }
         Intrinsics.checkNotNull(var29);
         String var31 = StringsKt.startsWith(var29, "http://", false) || StringsKt.startsWith(var29, "https://", false) ? var29 : "https://" + var29;
         MutableComponent var32 = net.minecraft.network.chat.Component.literal("§b§n" + var29).withStyle(new java.util.function.UnaryOperator<Style>() {
            public Style apply(Style var1) {
               return a(var31, var1);
            }
         });
         Intrinsics.checkNotNullExpressionValue(var32, "withStyle(...)");
         var8.append(var32);
         var26 = var28;
      }
      if (var26 < param2.length()) {
         String var33 = param2.substring(var26);
         Intrinsics.checkNotNullExpressionValue(var33, "substring(...)");
         var8.append(net.minecraft.network.chat.Component.literal(var33));
      }
      return var8;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h ()[Lme/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
      // 003: sipush 2714
      // 006: sipush -27892
      // 009: pop2
      // 00a: ldc_w "§8[§9§lPNX IRC§8] "
      // 00d: invokestatic net/minecraft/network/chat/Component.literal (Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;
      // 010: dup
      // 011: sipush 2707
      // 014: sipush -10365
      // 017: pop2
      // 018: ldc_w "literal(...)"
      // 01b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 01e: astore 8
      // 020: nop
      // 021: aload 3
      // 022: checkcast java/lang/CharSequence
      // 025: astore 10
      // 027: astore 7
      // 029: aload 10
      // 02b: aload 7
      // 02d: ifnull 03c
      // 030: ifnull 050
      // 033: goto 03a
      // 036: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 039: athrow
      // 03a: aload 10
      // 03c: invokeinterface java/lang/CharSequence.length ()I 1
      // 041: aload 7
      // 043: ifnull 051
      // 046: ifne 054
      // 049: goto 050
      // 04c: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 04f: athrow
      // 050: bipush 1
      // 051: goto 055
      // 054: bipush 0
      // 055: ifne 07c
      // 058: aload 3
      // 059: sipush 2688
      // 05c: sipush -3603
      // 05f: pop2
      // 060: ldc_w "null"
      // 063: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 066: aload 7
      // 068: ifnull 0a3
      // 06b: goto 072
      // 06e: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 071: athrow
      // 072: ifeq 08d
      // 075: goto 07c
      // 078: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 07b: athrow
      // 07c: sipush 2739
      // 07f: sipush 8341
      // 082: pop2
      // 083: ldc_w "§f"
      // 086: goto 158
      // 089: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 08c: athrow
      // 08d: aload 3
      // 08e: ldc_w "#"
      // 091: aload 7
      // 093: ifnull 0c8
      // 096: bipush 0
      // 097: bipush 2
      // 098: aconst_null
      // 099: invokestatic kotlin/text/StringsKt.startsWith$default (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
      // 09c: goto 0a3
      // 09f: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 0a2: athrow
      // 0a3: ifeq 157
      // 0a6: nop
      // 0a7: aload 3
      // 0a8: bipush 1
      // 0a9: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0ac: dup
      // 0ad: sipush 2704
      // 0b0: sipush -15128
      // 0b3: pop2
      // 0b4: ldc_w "substring(...)"
      // 0b7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0ba: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 0bd: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 0c0: dup
      // 0c1: goto 0c8
      // 0c4: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 0c7: athrow
      // 0c8: sipush 2773
      // 0cb: sipush 16012
      // 0ce: pop2
      // 0cf: ldc_w "toLowerCase(...)"
      // 0d2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0d5: astore 10
      // 0d7: aload 10
      // 0d9: aload 7
      // 0db: ifnull 154
      // 0de: invokevirtual java/lang/String.length ()I
      // 0e1: bipush 6
      // 0e3: if_icmpne 14a
      // 0e6: goto 0ed
      // 0e9: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 0ec: athrow
      // 0ed: aload 10
      // 0ef: bipush 0
      // 0f0: invokevirtual java/lang/String.charAt (I)C
      // 0f3: aload 10
      // 0f5: bipush 1
      // 0f6: invokevirtual java/lang/String.charAt (I)C
      // 0f9: aload 10
      // 0fb: bipush 2
      // 0fc: invokevirtual java/lang/String.charAt (I)C
      // 0ff: aload 10
      // 101: bipush 3
      // 102: invokevirtual java/lang/String.charAt (I)C
      // 105: aload 10
      // 107: bipush 4
      // 108: invokevirtual java/lang/String.charAt (I)C
      // 10b: aload 10
      // 10d: bipush 5
      // 10e: invokevirtual java/lang/String.charAt (I)C
      // 111: istore 19
      // 113: istore 20
      // 115: istore 21
      // 117: istore 22
      // 119: istore 23
      // 11b: istore 24
      // 11d: sipush 2726
      // 120: sipush 3967
      // 123: pop2
      // 124: ldc_w "§x§"
      // 127: iload 24
      // 129: ldc_w "§"
      // 12c: iload 23
      // 12e: ldc_w "§"
      // 131: iload 22
      // 133: ldc_w "§"
      // 136: iload 21
      // 138: ldc_w "§"
      // 13b: iload 20
      // 13d: ldc_w "§"
      // 140: iload 19
      // 142: invokedynamic makeConcatWithConstants (Ljava/lang/String;CLjava/lang/String;CLjava/lang/String;CLjava/lang/String;CLjava/lang/String;CLjava/lang/String;C)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" ]
      // 147: goto 158
      // 14a: sipush 2739
      // 14d: sipush 8341
      // 150: pop2
      // 151: ldc_w "§f"
      // 154: goto 158
      // 157: aload 3
      // 158: astore 9
      // 15a: aload 4
      // 15c: aload 7
      // 15e: ifnull 1d0
      // 161: ifnull 1c8
      // 164: goto 16b
      // 167: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 16a: athrow
      // 16b: aload 4
      // 16d: checkcast java/lang/CharSequence
      // 170: invokeinterface java/lang/CharSequence.length ()I 1
      // 175: aload 7
      // 177: ifnull 18c
      // 17a: goto 181
      // 17d: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 180: athrow
      // 181: ifle 18f
      // 184: goto 18b
      // 187: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 18a: athrow
      // 18b: bipush 1
      // 18c: goto 190
      // 18f: bipush 0
      // 190: ifeq 1c8
      // 193: aload 9
      // 195: aload 4
      // 197: astore 25
      // 199: astore 26
      // 19b: sipush 2736
      // 19e: sipush 16856
      // 1a1: pop2
      // 1a2: ldc_w "§l"
      // 1a5: aload 26
      // 1a7: aload 25
      // 1a9: ldc_w " "
      // 1ac: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001" ]
      // 1b1: invokestatic net/minecraft/network/chat/Component.literal (Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;
      // 1b4: aload 9
      // 1b6: aload 1
      // 1b7: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 1bc: invokestatic net/minecraft/network/chat/Component.literal (Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;
      // 1bf: checkcast net/minecraft/network/chat/Component
      // 1c2: invokevirtual net/minecraft/network/chat/MutableComponent.append (Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/MutableComponent;
      // 1c5: goto 1d3
      // 1c8: aload 9
      // 1ca: aload 1
      // 1cb: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 1d0: invokestatic net/minecraft/network/chat/Component.literal (Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;
      // 1d3: astore 11
      // 1d5: aload 11
      // 1d7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 1da: aload 11
      // 1dc: astore 10
      // 1de: new java/lang/StringBuilder
      // 1e1: dup
      // 1e2: invokespecial java/lang/StringBuilder.<init> ()V
      // 1e5: astore 12
      // 1e7: aload 12
      // 1e9: astore 13
      // 1eb: bipush 0
      // 1ec: istore 14
      // 1ee: aload 13
      // 1f0: aload 1
      // 1f1: sipush 2731
      // 1f4: sipush 16818
      // 1f7: pop2
      // 1f8: ldc_w "§7Sender: §f"
      // 1fb: swap
      // 1fc: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 201: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 204: pop
      // 205: aload 5
      // 207: aload 7
      // 209: ifnull 274
      // 20c: ifnull 25e
      // 20f: goto 216
      // 212: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 215: athrow
      // 216: aload 6
      // 218: aload 7
      // 21a: ifnull 274
      // 21d: goto 224
      // 220: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 223: athrow
      // 224: ifnull 25e
      // 227: goto 22e
      // 22a: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 22d: athrow
      // 22e: aload 13
      // 230: aload 5
      // 232: aload 6
      // 234: sipush 2711
      // 237: sipush 21887
      // 23a: pop2
      // 23b: ldc_w "\n§7Discord: §f"
      // 23e: dup_x2
      // 23f: pop
      // 240: sipush 2754
      // 243: sipush -10774
      // 246: pop2
      // 247: ldc_w " §8("
      // 24a: swap
      // 24b: ldc_w ")"
      // 24e: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001" ]
      // 253: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 256: pop
      // 257: goto 25e
      // 25a: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 25d: athrow
      // 25e: aload 13
      // 260: sipush 2743
      // 263: sipush 20715
      // 266: pop2
      // 267: ldc_w "\n§7Click to mention"
      // 26a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 26d: pop
      // 26e: nop
      // 26f: aload 12
      // 271: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 274: astore 11
      // 276: aload 10
      // 278: aload 11
      // 27a: aload 1
      // 27b: invokedynamic apply (Ljava/lang/String;Ljava/lang/String;)Ljava/util/function/UnaryOperator; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Ljava/lang/String;Ljava/lang/String;Lnet/minecraft/network/chat/Style;)Lnet/minecraft/network/chat/Style;, (Lnet/minecraft/network/chat/Style;)Lnet/minecraft/network/chat/Style; ]
      // 280: invokevirtual net/minecraft/network/chat/MutableComponent.withStyle (Ljava/util/function/UnaryOperator;)Lnet/minecraft/network/chat/MutableComponent;
      // 283: pop
      // 284: aload 8
      // 286: aload 10
      // 288: checkcast net/minecraft/network/chat/Component
      // 28b: invokevirtual net/minecraft/network/chat/MutableComponent.append (Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/MutableComponent;
      // 28e: pop
      // 28f: aload 8
      // 291: sipush 2755
      // 294: sipush -10211
      // 297: pop2
      // 298: ldc_w "§8: §r"
      // 29b: invokestatic net/minecraft/network/chat/Component.literal (Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;
      // 29e: checkcast net/minecraft/network/chat/Component
      // 2a1: invokevirtual net/minecraft/network/chat/MutableComponent.append (Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/MutableComponent;
      // 2a4: pop
      // 2a5: getstatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll Ljava/util/regex/Pattern;
      // 2a8: aload 2
      // 2a9: checkcast java/lang/CharSequence
      // 2ac: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 2af: astore 12
      // 2b1: bipush 0
      // 2b2: istore 13
      // 2b4: aload 12
      // 2b6: invokevirtual java/util/regex/Matcher.find ()Z
      // 2b9: ifeq 3c7
      // 2bc: aload 12
      // 2be: invokevirtual java/util/regex/Matcher.start ()I
      // 2c1: istore 14
      // 2c3: aload 12
      // 2c5: invokevirtual java/util/regex/Matcher.end ()I
      // 2c8: istore 15
      // 2ca: aload 12
      // 2cc: invokevirtual java/util/regex/Matcher.group ()Ljava/lang/String;
      // 2cf: astore 16
      // 2d1: iload 14
      // 2d3: aload 7
      // 2d5: ifnull 339
      // 2d8: iload 13
      // 2da: aload 7
      // 2dc: ifnull 3cd
      // 2df: goto 2e6
      // 2e2: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 2e5: athrow
      // 2e6: if_icmple 316
      // 2e9: goto 2f0
      // 2ec: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 2ef: athrow
      // 2f0: aload 2
      // 2f1: iload 13
      // 2f3: iload 14
      // 2f5: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 2f8: dup
      // 2f9: sipush 2787
      // 2fc: sipush -32093
      // 2ff: pop2
      // 300: ldc_w "substring(...)"
      // 303: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 306: astore 17
      // 308: aload 8
      // 30a: aload 17
      // 30c: invokestatic net/minecraft/network/chat/Component.literal (Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;
      // 30f: checkcast net/minecraft/network/chat/Component
      // 312: invokevirtual net/minecraft/network/chat/MutableComponent.append (Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/MutableComponent;
      // 315: pop
      // 316: aload 16
      // 318: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 31b: aload 16
      // 31d: aload 7
      // 31f: ifnull 36d
      // 322: sipush 2774
      // 325: sipush 7650
      // 328: pop2
      // 329: ldc_w "http://"
      // 32c: bipush 0
      // 32d: bipush 2
      // 32e: aconst_null
      // 32f: invokestatic kotlin/text/StringsKt.startsWith$default (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
      // 332: goto 339
      // 335: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 338: athrow
      // 339: ifne 364
      // 33c: aload 16
      // 33e: aload 7
      // 340: ifnull 372
      // 343: goto 34a
      // 346: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 349: athrow
      // 34a: sipush 2788
      // 34d: sipush 424
      // 350: pop2
      // 351: ldc_w "https://"
      // 354: bipush 0
      // 355: bipush 2
      // 356: aconst_null
      // 357: invokestatic kotlin/text/StringsKt.startsWith$default (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
      // 35a: ifeq 370
      // 35d: goto 364
      // 360: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 363: athrow
      // 364: aload 16
      // 366: goto 36d
      // 369: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 36c: athrow
      // 36d: goto 382
      // 370: aload 16
      // 372: sipush 2766
      // 375: sipush 16445
      // 378: pop2
      // 379: ldc_w "https://"
      // 37c: swap
      // 37d: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 382: astore 17
      // 384: aload 16
      // 386: sipush 2782
      // 389: sipush 12512
      // 38c: pop2
      // 38d: ldc_w "§b§n"
      // 390: swap
      // 391: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 396: invokestatic net/minecraft/network/chat/Component.literal (Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;
      // 399: aload 17
      // 39b: invokedynamic apply (Ljava/lang/String;)Ljava/util/function/UnaryOperator; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Ljava/lang/String;Lnet/minecraft/network/chat/Style;)Lnet/minecraft/network/chat/Style;, (Lnet/minecraft/network/chat/Style;)Lnet/minecraft/network/chat/Style; ]
      // 3a0: invokevirtual net/minecraft/network/chat/MutableComponent.withStyle (Ljava/util/function/UnaryOperator;)Lnet/minecraft/network/chat/MutableComponent;
      // 3a3: dup
      // 3a4: sipush 2689
      // 3a7: sipush -32123
      // 3aa: pop2
      // 3ab: ldc_w "withStyle(...)"
      // 3ae: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 3b1: astore 18
      // 3b3: aload 8
      // 3b5: aload 18
      // 3b7: checkcast net/minecraft/network/chat/Component
      // 3ba: invokevirtual net/minecraft/network/chat/MutableComponent.append (Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/MutableComponent;
      // 3bd: pop
      // 3be: iload 15
      // 3c0: istore 13
      // 3c2: aload 7
      // 3c4: ifnonnull 2b4
      // 3c7: iload 13
      // 3c9: aload 2
      // 3ca: invokevirtual java/lang/String.length ()I
      // 3cd: if_icmpge 3f4
      // 3d0: aload 2
      // 3d1: iload 13
      // 3d3: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 3d6: dup
      // 3d7: sipush 2787
      // 3da: sipush -32093
      // 3dd: pop2
      // 3de: ldc_w "substring(...)"
      // 3e1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 3e4: astore 14
      // 3e6: aload 8
      // 3e8: aload 14
      // 3ea: invokestatic net/minecraft/network/chat/Component.literal (Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;
      // 3ed: checkcast net/minecraft/network/chat/Component
      // 3f0: invokevirtual net/minecraft/network/chat/MutableComponent.append (Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/MutableComponent;
      // 3f3: pop
      // 3f4: aload 8
      // 3f6: areturn
   }

   static MutableComponent a(IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var0, String var1, String var2, String var3, String var4, String var5, String var6, int var7, Object var8) {
      int var9;
      var9 = var7 & 4;
      if (var3 == null || var9 != 0) {
         var3 = null;
      }
      var9 = var7 & 8;
      if (var4 == null || var9 != 0) {
         var4 = null;
      }
      var9 = var7 & 16;
      if (var5 == null || var9 != 0) {
         var5 = null;
      }
      var9 = var7 & 32;
      if (var6 == null || var9 != 0) {
         var6 = null;
      }
      return var0.b(var1, var2, var3, var4, var5, var6);
   }

   private final String o(String param1) {
      String var3 = param1.replace("#", "").toLowerCase(java.util.Locale.ROOT);
      Intrinsics.checkNotNullExpressionValue(var3, "toLowerCase(...)");
      int var4;
      if (var3.length() == 6) {
         var4 = Integer.parseInt(var3.substring(0, 2), 16);
      } else {
         return "\u00a7f";
      }
      int var5 = Integer.parseInt(var3.substring(2, 4), 16);
      int var6 = Integer.parseInt(var3.substring(4, 6), 16);
      if (var4 > 120 && var6 > 120 && (double)var5 < (double)Math.min(var4, var6) * 0.7) {
         if (var4 > 200 && var6 > 200) {
            return "\u00a7d";
         }
         return "\u00a75";
      }
      if (var4 > 200 && var6 > 100 && var6 < 200 && var5 < 150 && var4 > var6) {
         return "\u00a7d";
      }
      if (var4 > 180 && var5 > 80 && var5 < var4 && var6 < var5) {
         return "\u00a76";
      }
      if (var4 > 180 && var5 > 180 && var6 < 120) {
         return "\u00a7e";
      }
      if (var4 > 150 && (double)var4 > (double)var5 * 1.5 && (double)var4 > (double)var6 * 1.5) {
         return var4 > 200 ? "\u00a7c" : "\u00a74";
      }
      if (var5 > 120 && var5 > var4 && var5 > var6) {
         return var5 > 180 ? "\u00a7a" : "\u00a72";
      }
      if (var5 > 120 && var6 > 120 && (double)var4 < (double)Math.min(var5, var6) * 0.8) {
         return "\u00a7b";
      }
      if (var6 > 120 && var6 > var4 && var6 > var5) {
         return var6 > 180 ? "\u00a79" : "\u00a71";
      }
      if (Math.abs(var4 - var5) < 30 && Math.abs(var5 - var6) < 30) {
         if (var4 > 220 && var5 > 220 && var6 > 220) {
            return "\u00a7f";
         }
         if (var4 > 150 && var5 > 150 && var6 > 150) {
            return "\u00a77";
         }
         if (var4 > 80 && var5 > 80 && var6 > 80) {
            return "\u00a78";
         }
         return "\u00a70";
      }
      return "\u00a7f";
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h ()[Lme/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
      // 003: aload 1
      // 004: ldc_w "#"
      // 007: ldc_w ""
      // 00a: bipush 0
      // 00b: bipush 4
      // 00c: aconst_null
      // 00d: invokestatic kotlin/text/StringsKt.replace$default (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
      // 010: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 013: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 016: dup
      // 017: sipush 2793
      // 01a: sipush 27802
      // 01d: pop2
      // 01e: ldc_w "toLowerCase(...)"
      // 021: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 024: astore 3
      // 025: astore 2
      // 026: aload 3
      // 027: invokevirtual java/lang/String.length ()I
      // 02a: aload 2
      // 02b: ifnull 065
      // 02e: bipush 6
      // 030: if_icmpeq 049
      // 033: goto 03a
      // 036: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 039: athrow
      // 03a: sipush 2739
      // 03d: sipush 8341
      // 040: pop2
      // 041: ldc_w "§f"
      // 044: areturn
      // 045: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 048: athrow
      // 049: aload 3
      // 04a: bipush 0
      // 04b: bipush 2
      // 04c: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 04f: dup
      // 050: sipush 2787
      // 053: sipush -32093
      // 056: pop2
      // 057: ldc_w "substring(...)"
      // 05a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 05d: bipush 16
      // 05f: invokestatic kotlin/text/CharsKt.checkRadix (I)I
      // 062: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;I)I
      // 065: istore 4
      // 067: aload 3
      // 068: bipush 2
      // 069: bipush 4
      // 06a: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 06d: dup
      // 06e: sipush 2787
      // 071: sipush -32093
      // 074: pop2
      // 075: ldc_w "substring(...)"
      // 078: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 07b: bipush 16
      // 07d: invokestatic kotlin/text/CharsKt.checkRadix (I)I
      // 080: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;I)I
      // 083: istore 5
      // 085: aload 3
      // 086: bipush 4
      // 087: bipush 6
      // 089: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 08c: dup
      // 08d: sipush 2787
      // 090: sipush -32093
      // 093: pop2
      // 094: ldc_w "substring(...)"
      // 097: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 09a: bipush 16
      // 09c: invokestatic kotlin/text/CharsKt.checkRadix (I)I
      // 09f: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;I)I
      // 0a2: istore 6
      // 0a4: nop
      // 0a5: iload 4
      // 0a7: bipush 120
      // 0a9: aload 2
      // 0aa: ifnull 180
      // 0ad: if_icmple 17b
      // 0b0: goto 0b7
      // 0b3: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 0b6: athrow
      // 0b7: iload 6
      // 0b9: bipush 120
      // 0bb: aload 2
      // 0bc: ifnull 180
      // 0bf: goto 0c6
      // 0c2: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 0c5: athrow
      // 0c6: if_icmple 17b
      // 0c9: goto 0d0
      // 0cc: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 0cf: athrow
      // 0d0: iload 5
      // 0d2: i2d
      // 0d3: iload 4
      // 0d5: iload 6
      // 0d7: invokestatic java/lang/Math.min (II)I
      // 0da: i2d
      // 0db: ldc2_w 0.7
      // 0de: dmul
      // 0df: dcmpg
      // 0e0: aload 2
      // 0e1: ifnull 17d
      // 0e4: goto 0eb
      // 0e7: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 0ea: athrow
      // 0eb: ifge 17b
      // 0ee: goto 0f5
      // 0f1: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 0f4: athrow
      // 0f5: nop
      // 0f6: iload 4
      // 0f8: sipush 200
      // 0fb: aload 2
      // 0fc: ifnull 140
      // 0ff: goto 106
      // 102: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 105: athrow
      // 106: if_icmple 13b
      // 109: goto 110
      // 10c: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 10f: athrow
      // 110: iload 6
      // 112: sipush 200
      // 115: aload 2
      // 116: ifnull 140
      // 119: goto 120
      // 11c: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 11f: athrow
      // 120: if_icmple 13b
      // 123: goto 12a
      // 126: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 129: athrow
      // 12a: sipush 2796
      // 12d: sipush 17243
      // 130: pop2
      // 131: ldc_w "§d"
      // 134: goto 5fa
      // 137: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 13a: athrow
      // 13b: iload 4
      // 13d: sipush 150
      // 140: aload 2
      // 141: ifnull 15a
      // 144: if_icmple 16e
      // 147: goto 14e
      // 14a: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 14d: athrow
      // 14e: iload 6
      // 150: sipush 150
      // 153: goto 15a
      // 156: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 159: athrow
      // 15a: if_icmple 16e
      // 15d: sipush 2716
      // 160: sipush -32013
      // 163: pop2
      // 164: ldc_w "§5"
      // 167: goto 5fa
      // 16a: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 16d: athrow
      // 16e: sipush 2716
      // 171: sipush -32013
      // 174: pop2
      // 175: ldc_w "§5"
      // 178: goto 5fa
      // 17b: iload 4
      // 17d: sipush 200
      // 180: aload 2
      // 181: ifnull 20a
      // 184: if_icmple 205
      // 187: goto 18e
      // 18a: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 18d: athrow
      // 18e: iload 6
      // 190: bipush 100
      // 192: aload 2
      // 193: ifnull 20a
      // 196: goto 19d
      // 199: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 19c: athrow
      // 19d: if_icmple 205
      // 1a0: goto 1a7
      // 1a3: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 1a6: athrow
      // 1a7: iload 6
      // 1a9: sipush 200
      // 1ac: aload 2
      // 1ad: ifnull 20a
      // 1b0: goto 1b7
      // 1b3: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 1b6: athrow
      // 1b7: if_icmpge 205
      // 1ba: goto 1c1
      // 1bd: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 1c0: athrow
      // 1c1: iload 5
      // 1c3: sipush 150
      // 1c6: aload 2
      // 1c7: ifnull 20a
      // 1ca: goto 1d1
      // 1cd: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 1d0: athrow
      // 1d1: if_icmpge 205
      // 1d4: goto 1db
      // 1d7: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 1da: athrow
      // 1db: iload 4
      // 1dd: iload 6
      // 1df: aload 2
      // 1e0: ifnull 20a
      // 1e3: goto 1ea
      // 1e6: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 1e9: athrow
      // 1ea: if_icmple 205
      // 1ed: goto 1f4
      // 1f0: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 1f3: athrow
      // 1f4: sipush 2796
      // 1f7: sipush 17243
      // 1fa: pop2
      // 1fb: ldc_w "§d"
      // 1fe: goto 5fa
      // 201: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 204: athrow
      // 205: iload 4
      // 207: sipush 180
      // 20a: aload 2
      // 20b: ifnull 295
      // 20e: if_icmple 290
      // 211: goto 218
      // 214: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 217: athrow
      // 218: iload 5
      // 21a: bipush 80
      // 21c: aload 2
      // 21d: ifnull 295
      // 220: goto 227
      // 223: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 226: athrow
      // 227: if_icmple 290
      // 22a: goto 231
      // 22d: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 230: athrow
      // 231: iload 5
      // 233: iload 4
      // 235: aload 2
      // 236: ifnull 295
      // 239: goto 240
      // 23c: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 23f: athrow
      // 240: if_icmpge 290
      // 243: goto 24a
      // 246: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 249: athrow
      // 24a: iload 6
      // 24c: iload 5
      // 24e: aload 2
      // 24f: ifnull 295
      // 252: goto 259
      // 255: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 258: athrow
      // 259: if_icmpge 290
      // 25c: goto 263
      // 25f: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 262: athrow
      // 263: iload 5
      // 265: sipush 140
      // 268: if_icmple 283
      // 26b: goto 272
      // 26e: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 271: athrow
      // 272: sipush 2697
      // 275: sipush -5416
      // 278: pop2
      // 279: ldc_w "§6"
      // 27c: goto 5fa
      // 27f: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 282: athrow
      // 283: sipush 2697
      // 286: sipush -5416
      // 289: pop2
      // 28a: ldc_w "§6"
      // 28d: goto 5fa
      // 290: iload 4
      // 292: sipush 180
      // 295: aload 2
      // 296: ifnull 2ec
      // 299: if_icmple 2e7
      // 29c: goto 2a3
      // 29f: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 2a2: athrow
      // 2a3: iload 5
      // 2a5: sipush 180
      // 2a8: aload 2
      // 2a9: ifnull 2ec
      // 2ac: goto 2b3
      // 2af: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 2b2: athrow
      // 2b3: if_icmple 2e7
      // 2b6: goto 2bd
      // 2b9: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 2bc: athrow
      // 2bd: iload 6
      // 2bf: bipush 120
      // 2c1: aload 2
      // 2c2: ifnull 2ec
      // 2c5: goto 2cc
      // 2c8: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 2cb: athrow
      // 2cc: if_icmpge 2e7
      // 2cf: goto 2d6
      // 2d2: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 2d5: athrow
      // 2d6: sipush 2691
      // 2d9: sipush 7346
      // 2dc: pop2
      // 2dd: ldc_w "§e"
      // 2e0: goto 5fa
      // 2e3: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 2e6: athrow
      // 2e7: iload 4
      // 2e9: sipush 150
      // 2ec: aload 2
      // 2ed: ifnull 36b
      // 2f0: if_icmple 367
      // 2f3: goto 2fa
      // 2f6: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 2f9: athrow
      // 2fa: iload 4
      // 2fc: i2d
      // 2fd: iload 5
      // 2ff: i2d
      // 300: ldc2_w 1.5
      // 303: dmul
      // 304: dcmpl
      // 305: aload 2
      // 306: ifnull 369
      // 309: goto 310
      // 30c: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 30f: athrow
      // 310: ifle 367
      // 313: goto 31a
      // 316: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 319: athrow
      // 31a: iload 4
      // 31c: i2d
      // 31d: iload 6
      // 31f: i2d
      // 320: ldc2_w 1.5
      // 323: dmul
      // 324: dcmpl
      // 325: aload 2
      // 326: ifnull 369
      // 329: goto 330
      // 32c: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 32f: athrow
      // 330: ifle 367
      // 333: goto 33a
      // 336: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 339: athrow
      // 33a: iload 4
      // 33c: sipush 200
      // 33f: if_icmple 35a
      // 342: goto 349
      // 345: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 348: athrow
      // 349: sipush 2744
      // 34c: sipush 1054
      // 34f: pop2
      // 350: ldc_w "§c"
      // 353: goto 5fa
      // 356: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 359: athrow
      // 35a: sipush 2740
      // 35d: sipush -22803
      // 360: pop2
      // 361: ldc_w "§4"
      // 364: goto 5fa
      // 367: iload 5
      // 369: bipush 120
      // 36b: aload 2
      // 36c: ifnull 3dc
      // 36f: if_icmple 3d8
      // 372: goto 379
      // 375: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 378: athrow
      // 379: iload 5
      // 37b: iload 4
      // 37d: aload 2
      // 37e: ifnull 3dc
      // 381: goto 388
      // 384: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 387: athrow
      // 388: if_icmple 3d8
      // 38b: goto 392
      // 38e: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 391: athrow
      // 392: iload 5
      // 394: iload 6
      // 396: aload 2
      // 397: ifnull 3dc
      // 39a: goto 3a1
      // 39d: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 3a0: athrow
      // 3a1: if_icmple 3d8
      // 3a4: goto 3ab
      // 3a7: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 3aa: athrow
      // 3ab: iload 5
      // 3ad: sipush 180
      // 3b0: if_icmple 3cb
      // 3b3: goto 3ba
      // 3b6: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 3b9: athrow
      // 3ba: sipush 2701
      // 3bd: sipush 19517
      // 3c0: pop2
      // 3c1: ldc_w "§a"
      // 3c4: goto 5fa
      // 3c7: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 3ca: athrow
      // 3cb: sipush 2753
      // 3ce: sipush 26076
      // 3d1: pop2
      // 3d2: ldc_w "§2"
      // 3d5: goto 5fa
      // 3d8: iload 5
      // 3da: bipush 120
      // 3dc: aload 2
      // 3dd: ifnull 43d
      // 3e0: if_icmple 439
      // 3e3: goto 3ea
      // 3e6: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 3e9: athrow
      // 3ea: iload 6
      // 3ec: bipush 120
      // 3ee: aload 2
      // 3ef: ifnull 43d
      // 3f2: goto 3f9
      // 3f5: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 3f8: athrow
      // 3f9: if_icmple 439
      // 3fc: goto 403
      // 3ff: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 402: athrow
      // 403: iload 4
      // 405: i2d
      // 406: iload 5
      // 408: iload 6
      // 40a: invokestatic java/lang/Math.min (II)I
      // 40d: i2d
      // 40e: ldc2_w 0.8
      // 411: dmul
      // 412: dcmpg
      // 413: aload 2
      // 414: ifnull 43b
      // 417: goto 41e
      // 41a: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 41d: athrow
      // 41e: ifge 439
      // 421: goto 428
      // 424: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 427: athrow
      // 428: sipush 2752
      // 42b: sipush 26222
      // 42e: pop2
      // 42f: ldc_w "§b"
      // 432: goto 5fa
      // 435: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 438: athrow
      // 439: iload 6
      // 43b: bipush 120
      // 43d: aload 2
      // 43e: ifnull 4b4
      // 441: if_icmple 4aa
      // 444: goto 44b
      // 447: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 44a: athrow
      // 44b: iload 6
      // 44d: iload 4
      // 44f: aload 2
      // 450: ifnull 4b4
      // 453: goto 45a
      // 456: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 459: athrow
      // 45a: if_icmple 4aa
      // 45d: goto 464
      // 460: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 463: athrow
      // 464: iload 6
      // 466: iload 5
      // 468: aload 2
      // 469: ifnull 4b4
      // 46c: goto 473
      // 46f: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 472: athrow
      // 473: if_icmple 4aa
      // 476: goto 47d
      // 479: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 47c: athrow
      // 47d: iload 6
      // 47f: sipush 180
      // 482: if_icmple 49d
      // 485: goto 48c
      // 488: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 48b: athrow
      // 48c: sipush 2802
      // 48f: sipush 13129
      // 492: pop2
      // 493: ldc_w "§9"
      // 496: goto 5fa
      // 499: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 49c: athrow
      // 49d: sipush 2745
      // 4a0: sipush -638
      // 4a3: pop2
      // 4a4: ldc_w "§1"
      // 4a7: goto 5fa
      // 4aa: iload 4
      // 4ac: iload 5
      // 4ae: isub
      // 4af: invokestatic java/lang/Math.abs (I)I
      // 4b2: bipush 30
      // 4b4: aload 2
      // 4b5: ifnull 4d3
      // 4b8: if_icmpge 5f0
      // 4bb: goto 4c2
      // 4be: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 4c1: athrow
      // 4c2: iload 5
      // 4c4: iload 6
      // 4c6: isub
      // 4c7: invokestatic java/lang/Math.abs (I)I
      // 4ca: bipush 30
      // 4cc: goto 4d3
      // 4cf: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 4d2: athrow
      // 4d3: aload 2
      // 4d4: ifnull 4ee
      // 4d7: if_icmpge 5f0
      // 4da: goto 4e1
      // 4dd: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 4e0: athrow
      // 4e1: nop
      // 4e2: iload 4
      // 4e4: sipush 220
      // 4e7: goto 4ee
      // 4ea: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 4ed: athrow
      // 4ee: aload 2
      // 4ef: ifnull 546
      // 4f2: if_icmple 541
      // 4f5: goto 4fc
      // 4f8: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 4fb: athrow
      // 4fc: iload 5
      // 4fe: sipush 220
      // 501: aload 2
      // 502: ifnull 546
      // 505: goto 50c
      // 508: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 50b: athrow
      // 50c: if_icmple 541
      // 50f: goto 516
      // 512: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 515: athrow
      // 516: iload 6
      // 518: sipush 220
      // 51b: aload 2
      // 51c: ifnull 546
      // 51f: goto 526
      // 522: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 525: athrow
      // 526: if_icmple 541
      // 529: goto 530
      // 52c: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 52f: athrow
      // 530: sipush 2739
      // 533: sipush 8341
      // 536: pop2
      // 537: ldc_w "§f"
      // 53a: goto 5fa
      // 53d: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 540: athrow
      // 541: iload 4
      // 543: sipush 150
      // 546: aload 2
      // 547: ifnull 59d
      // 54a: if_icmple 599
      // 54d: goto 554
      // 550: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 553: athrow
      // 554: iload 5
      // 556: sipush 150
      // 559: aload 2
      // 55a: ifnull 59d
      // 55d: goto 564
      // 560: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 563: athrow
      // 564: if_icmple 599
      // 567: goto 56e
      // 56a: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 56d: athrow
      // 56e: iload 6
      // 570: sipush 150
      // 573: aload 2
      // 574: ifnull 59d
      // 577: goto 57e
      // 57a: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 57d: athrow
      // 57e: if_icmple 599
      // 581: goto 588
      // 584: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 587: athrow
      // 588: sipush 2762
      // 58b: sipush 6275
      // 58e: pop2
      // 58f: ldc_w "§7"
      // 592: goto 5fa
      // 595: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 598: athrow
      // 599: iload 4
      // 59b: bipush 80
      // 59d: aload 2
      // 59e: ifnull 5b6
      // 5a1: if_icmple 5e3
      // 5a4: goto 5ab
      // 5a7: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 5aa: athrow
      // 5ab: iload 5
      // 5ad: bipush 80
      // 5af: goto 5b6
      // 5b2: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 5b5: athrow
      // 5b6: aload 2
      // 5b7: ifnull 5cf
      // 5ba: if_icmple 5e3
      // 5bd: goto 5c4
      // 5c0: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 5c3: athrow
      // 5c4: iload 6
      // 5c6: bipush 80
      // 5c8: goto 5cf
      // 5cb: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 5ce: athrow
      // 5cf: if_icmple 5e3
      // 5d2: sipush 2732
      // 5d5: sipush 13801
      // 5d8: pop2
      // 5d9: ldc_w "§8"
      // 5dc: goto 5fa
      // 5df: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 5e2: athrow
      // 5e3: sipush 2710
      // 5e6: sipush -29309
      // 5e9: pop2
      // 5ea: ldc_w "§0"
      // 5ed: goto 5fa
      // 5f0: sipush 2739
      // 5f3: sipush 8341
      // 5f6: pop2
      // 5f7: ldc_w "§f"
      // 5fa: areturn
   }

   private static final void b(Function0 var0) {
      var0.invoke();
   }

   private static final CharSequence a(MatchResult var0) {
      short var10001 = 2702;
      short var10002 = 19288;
      Intrinsics.checkNotNullParameter(var0, "matchResult");
      String var10000 = var0.getValue();
      var10001 = 2760;
      var10002 = 13241;
      String var1 = StringsKt.replace(StringsKt.replace(var10000, "§x", "", false), "§", "", false);
      var10001 = 2721;
      var10002 = 14905;
      return "<color:#" + var1 + ">";
   }

   private static final CharSequence b(MatchResult param0) {
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param0, "matchResult");
      String value = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.get(param0.getValue());
      if (value == null) return param0.getValue();
      return value;
   }

   private static final String p(String var0) {
      short var10001 = 2717;
      short var10002 = 14856;
      Intrinsics.checkNotNullParameter(var0, "text");
      String var1 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.replace(
         var0, IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI::a
      );
      return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.replace(
         var1, IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI::b
      );
   }

   private static final String a(Function1 var0, String var1) {
      return (String)var0.invoke(var1);
   }

   private static final Unit q(String param0) {
      net.minecraft.client.gui.Gui var1 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().gui;
      if (var1 != null) {
         net.minecraft.client.gui.components.ChatComponent var2 = var1.getChat();
         if (var2 != null) {
            var2.addClientSystemMessage((net.minecraft.network.chat.Component)net.minecraft.network.chat.Component.literal(param0));
         }
      }
      return kotlin.Unit.INSTANCE;
   }

   private static final Unit b(String param0, MutableComponent param1) {
      if (IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().player == null) return kotlin.Unit.INSTANCE;
      String var2 = "<bold><gradient:#55AAFF:#0066FF>[Polinex]</gradient></bold> <dark_gray>? <white>";
      net.minecraft.network.chat.Component var3 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b(lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.deserialize(var2 + param0));
      net.minecraft.network.chat.MutableComponent var4 = net.minecraft.network.chat.Component.empty().append(var3).append(param1);
      net.minecraft.client.gui.Gui var5 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().gui;
      if (var5 != null) {
         net.minecraft.client.gui.components.ChatComponent var6 = var5.getChat();
         if (var6 != null) {
            var6.addClientSystemMessage((net.minecraft.network.chat.Component) var4);
         }
      }
      return kotlin.Unit.INSTANCE;
   }

   private static final Unit c(Component param0) {
      if (IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().player == null) {
         return kotlin.Unit.INSTANCE;
      }

      net.minecraft.network.chat.Component var2 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b(param0);
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().gui.getChat().addClientSystemMessage(var2);
      return kotlin.Unit.INSTANCE;
   }

   private static final JsonParseException r(String var0) {
      return new JsonParseException(var0);
   }

   private static final Unit c(String param0, String param1, String param2, String param3, String param4, String param5) {
      net.minecraft.network.chat.MutableComponent var6 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b(param0, param1, param2, param3, param4, param5);
      net.minecraft.client.gui.Gui var7 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().gui;
      if (var7 != null) {
         net.minecraft.client.gui.components.ChatComponent var8 = var7.getChat();
         if (var8 != null) {
            var8.addClientSystemMessage((net.minecraft.network.chat.Component) var6);
         }
      }
      return kotlin.Unit.INSTANCE;
   }

   private static final Style a(String var0, String var1, Style var2) {
      short var10001 = 2780;
      short var10002 = -11197;
      Intrinsics.checkNotNullParameter(var2, "style");
      return var2.withHoverEvent(new ShowText(net.minecraft.network.chat.Component.literal(var0))).withClickEvent(new SuggestCommand("@" + var1 + " "));
   }

   private static final Style a(String var0, Style var1) {
      short var10001 = 2759;
      short var10002 = -17163;
      Intrinsics.checkNotNullParameter(var1, "style");
      return var1.withClickEvent(new OpenUrl(URI.create(var0)));
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var25 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[119];
      int var3 = 0;
      String var2 = "\u009eB\n!¯=\u0085\u0015`ä\u008c\u0012!\u0088äÃc\u0082\u0006\f\u000f?Ô¼»¥íw\u0012E\u0007ç\u00ad\u009d©Úác\u0007\u001b©³6¯\u009d \u0004å\u009dp÷\u000e\u008c\n\u007f\u009e\u008e¸\u0080õ\u0019t7EY{\u000föÖ\u0012F\u0019å\u0013ºùÜÆ\u001aGá)\u00022!\tz¢¨Ôwmü\u001cg\u0002 p\u000bQE\u009dué\u0089,.\u0003·<5\u0085|g>Âb\u009d C/¥ÈØ¸\u0011\u000béAo\u008b&¾ÆêÎäuT\u007fò\nrAñy\u0090\u008f7aO\u0090\u0012#\u000b\u008aKi@ï\u008cÖ³í\u0002¬¡\u0002&&\u0006\u001b±´\u0087¸U\u0002i`\rØ^{%¨77¹?³}D\n\f\u0015\u0093{\u001b\u0081z@ýÜåÏ\u0083\u0002Ø\"\u000e§\u0017\u008b\u0006\u0001\u0005\u0016¦\u00851E&\b\u0097\u000eå ÀO\u008aüÓ¹c¿:<øT\r\u0000µÙßÕâÝé\u008d\u0095\u0012aç\u0002þð\fâ<ÊU\u0019xb\u001e¹Ã\u0001r\u0002F\u0002\u0004óWÿ¤\u0002\u001fÁ\fá)æ2Oå@´I½D\u0088\u0007³dÆÅl¸´\u0002\u0090?\u0012É¾2¼\u0087\u0019\u0093Tç\u008b¨£\u0019Fèá\u0010Ð\u000b¼â©´íA'\u009aÝ\u0095\u008aPºª\u0080ä>9\u0002Í³PÝæLç@_ÒPà¢ß\u000fîV\u0083O}øÛ\u0093Î1ÄõÖü\u000b\u0013³q\u0098t¾hl\u0014\u001dÜ?Å`&9Ú\u0084ï¦!\b\u001f\fÙJÕUÚ8U\u0097þõ\bd\u0002\u0017é\u0003X{Ì\u0002@x\u0003e-[\u0007\u0091\u009aæï\u0096¡ò\u0002\u0095\u007f\b\u00016÷VÛ#Ò\u000f\u0010'R|\u0015(xIS7ò4\u008b\u001bcÒ\u0094\u0002l8\u0002DÀWÞ\u0013\fÓ¯ß0\u0011õË\u0015\u0095U\u0089c\u0092¶él\u0095NéÜ\u008aÅÔµ\u008bÂýíü LZË\u009aõ\u0081\u00ad£\u0080Ga\u008d\u0093I+þÈ9¢>Ä\u0099\u0004m\u00073Õx\u0019»\u0015«~NÂó\u0093\u0090nr_@{\\h\\×\u0088a¸Ír¢\u0089\u000bó\u0084ÉMc\u008e}Î)«y$Q¨ó|\u0090\u0096b`\u009cJ\u0013ë\u0083¸FË\u00149ã\u0002[ßÞÙógO$D\u001bÉv.|\u0096ÿ\n¯\"±\u0000Þ³\f\u0001~á\u0002\u0015æ9\u009c¶Dg¦I\u0011ÃÌ\u009c\u008c\u0084X/\u000e0å¤½É|Þl\u0004Û¯ç;\\\u008bQ' xÚ³¤5½ôëìhaä\u009a'Ä,\u001câ^\u0095¦FS\u0000\f2TEÍ7n1#ï{Ôå\u0002Bq\u0002SÙ\u0005\u008cÊLò¶\u0013zÕ0Ys\u0013ý9ªVíØ(Kßî2»¤\u0002&\u0015\fê\u0000\u008bL\u007fi[\fÞ£ïK\u000e4\u00adûD\u0010årFÌ\u0086È\u0097.ç\u0002\u0095¨2\u009f_$Zªî\u0090\"ö\u001fÚ\u0098\u009d`xaF$$'\\?é\u0013\u001a|à;*»\u0099L>³\f\u0098\u009ds!`´X\u0091Üè\u0098\u0083·9u\u000e\u007f#\u0092\u0095=ß×\u0001xn^\u008aüDP\u00ad-b\u0014b'\u0089\u000eÂ(óé\u0089\u0006øcÅ×\u0002R\u0083\u0011e\u0095ò7S÷\u001erv\rÓr4\fW\r8²é\f\u0090g©õ¥à(B\u0082ÖeÄ\u000f,×Y&\u0010É8òéB]Ú¥Ëà~Ë\u0015z9æÆ¹Ãð\u0002Lß\u00023ª\u0002\u0016j\u0006?i.æ3C\u0002¬/\u0002Íü:Ý\u0016ls£Ë±\u0093Å\u009f\u0012\u009cÏz'\u0010\u009dM\u0015«\re\u009evü¾\u000b\u009f²>ÊâH\u0083Zâ®\u0097ãzÜÄÉÁ[\rI\u009eKJ\u008aºáV¨\u0082Æ\u009d\u0006qöäÇ\u0011ñ\u0005æß»\u009e\u008c\u00021\u009b\u0002\u0081Ê\u0004\u0080\u007f\u000fg\u0006\u001e[©\u0087'Ü\u0006ª\u001ek+µ²\u000bHBÐ!ô=ë\u000b\u001cæ\u0095\b\u009dû¡\u0006uþ\u008dù\u0002îe\u0002ïÉ\u0002;\u009f\u0002Ø°\u0006\u009dld\u0099¢\u0096\u0002R\"\u0010çéI#Sù\u0090Áucu\u00913 ×ü\u0007\u008f±ãOtÂÍ\f&ø\u001aroü\u0006ü°¹)×>°ÁÁ\u0089\u0016\u0094\u0007f\u0004õÖø6²pÅsI\u0001DPr\u0088\u0000@[«¸®\u0017s\u009f05²\u0004µ&\u0007êE\u0084\u0019êú4±\u009fFA\u0018n\u0083èÓü]vX,â;\u0007>ï\u001aA';\u0002\b*é\u0089ëo#~j\u0002lÎ\u0005.Ñ¢_¯\u0002o\n\u0004bp»½> DÓ9T\u0082O¤\r\u00ad÷ó\u0012ÓôéãÌ\u0013ô\u0012dÀÂI\u0003\u008a³\u008av÷³ ° ´÷0O(LÜ8áÞU5³ÖÄ\nÞÁþ\u009b>T.y'ÆZ\bä\u001b,*1E\u001f$\nÇ\t!HÊ\u0010<§å\u0000\u000eÄAô{\u000b=TH\u0091\u0017&){ö\u0002ßH\b\u0082\u0080Bi\t\u0013\u0002D\u0006b\u009c\u0098;_ø\u000e\u0003Z±>ÒBq¶ÕÙâ£=º\u0007ø5Õ»+ª\u0083\u0013´§î×cã`\u0007ßÐ#\u001b\u0099]\u00926Ü\u000f:\u000bª\u000f\u008c\u0088\u007f\b\u0099°1+0\u0010©J\u00ad\u0016\u0012\u0018\u000e_ßs)»¸e¦T\u000e\u0082\u0002,\u001b\u0017v`è\u0015\u0095ôy!ü\u0002Aý\u0002¥<\u0007\u0014\u00032)ò%g\u0002Ä>\u0004¸ÁÚã\u0010Dn=ÓÝçA\u0002O\u001b2\u009eÛÁÊÀ\u0006¯×\u0085¤¾t\b\u009dª\u0003\u001cÔ\u0083£ü\u0002ÆG5\u001aX\u0094º¼òR¡®oÑ\u0096ú\u0096rC\u0014ÇöÍIìÊW\u0005z-\u008a\u0007²FçæY\u0005\u009aÚ\u008a2¿_\u0087Y m\u0084\u00883ðDúÓ[\f.?\u001b\u008aOã\u0002\u001f0Å9X\u0006y\u008fq¸Ä\u001e\bú\u000e\u0082\b=õ v";
      int var4 = "\u009eB\n!¯=\u0085\u0015`ä\u008c\u0012!\u0088äÃc\u0082\u0006\f\u000f?Ô¼»¥íw\u0012E\u0007ç\u00ad\u009d©Úác\u0007\u001b©³6¯\u009d \u0004å\u009dp÷\u000e\u008c\n\u007f\u009e\u008e¸\u0080õ\u0019t7EY{\u000föÖ\u0012F\u0019å\u0013ºùÜÆ\u001aGá)\u00022!\tz¢¨Ôwmü\u001cg\u0002 p\u000bQE\u009dué\u0089,.\u0003·<5\u0085|g>Âb\u009d C/¥ÈØ¸\u0011\u000béAo\u008b&¾ÆêÎäuT\u007fò\nrAñy\u0090\u008f7aO\u0090\u0012#\u000b\u008aKi@ï\u008cÖ³í\u0002¬¡\u0002&&\u0006\u001b±´\u0087¸U\u0002i`\rØ^{%¨77¹?³}D\n\f\u0015\u0093{\u001b\u0081z@ýÜåÏ\u0083\u0002Ø\"\u000e§\u0017\u008b\u0006\u0001\u0005\u0016¦\u00851E&\b\u0097\u000eå ÀO\u008aüÓ¹c¿:<øT\r\u0000µÙßÕâÝé\u008d\u0095\u0012aç\u0002þð\fâ<ÊU\u0019xb\u001e¹Ã\u0001r\u0002F\u0002\u0004óWÿ¤\u0002\u001fÁ\fá)æ2Oå@´I½D\u0088\u0007³dÆÅl¸´\u0002\u0090?\u0012É¾2¼\u0087\u0019\u0093Tç\u008b¨£\u0019Fèá\u0010Ð\u000b¼â©´íA'\u009aÝ\u0095\u008aPºª\u0080ä>9\u0002Í³PÝæLç@_ÒPà¢ß\u000fîV\u0083O}øÛ\u0093Î1ÄõÖü\u000b\u0013³q\u0098t¾hl\u0014\u001dÜ?Å`&9Ú\u0084ï¦!\b\u001f\fÙJÕUÚ8U\u0097þõ\bd\u0002\u0017é\u0003X{Ì\u0002@x\u0003e-[\u0007\u0091\u009aæï\u0096¡ò\u0002\u0095\u007f\b\u00016÷VÛ#Ò\u000f\u0010'R|\u0015(xIS7ò4\u008b\u001bcÒ\u0094\u0002l8\u0002DÀWÞ\u0013\fÓ¯ß0\u0011õË\u0015\u0095U\u0089c\u0092¶él\u0095NéÜ\u008aÅÔµ\u008bÂýíü LZË\u009aõ\u0081\u00ad£\u0080Ga\u008d\u0093I+þÈ9¢>Ä\u0099\u0004m\u00073Õx\u0019»\u0015«~NÂó\u0093\u0090nr_@{\\h\\×\u0088a¸Ír¢\u0089\u000bó\u0084ÉMc\u008e}Î)«y$Q¨ó|\u0090\u0096b`\u009cJ\u0013ë\u0083¸FË\u00149ã\u0002[ßÞÙógO$D\u001bÉv.|\u0096ÿ\n¯\"±\u0000Þ³\f\u0001~á\u0002\u0015æ9\u009c¶Dg¦I\u0011ÃÌ\u009c\u008c\u0084X/\u000e0å¤½É|Þl\u0004Û¯ç;\\\u008bQ' xÚ³¤5½ôëìhaä\u009a'Ä,\u001câ^\u0095¦FS\u0000\f2TEÍ7n1#ï{Ôå\u0002Bq\u0002SÙ\u0005\u008cÊLò¶\u0013zÕ0Ys\u0013ý9ªVíØ(Kßî2»¤\u0002&\u0015\fê\u0000\u008bL\u007fi[\fÞ£ïK\u000e4\u00adûD\u0010årFÌ\u0086È\u0097.ç\u0002\u0095¨2\u009f_$Zªî\u0090\"ö\u001fÚ\u0098\u009d`xaF$$'\\?é\u0013\u001a|à;*»\u0099L>³\f\u0098\u009ds!`´X\u0091Üè\u0098\u0083·9u\u000e\u007f#\u0092\u0095=ß×\u0001xn^\u008aüDP\u00ad-b\u0014b'\u0089\u000eÂ(óé\u0089\u0006øcÅ×\u0002R\u0083\u0011e\u0095ò7S÷\u001erv\rÓr4\fW\r8²é\f\u0090g©õ¥à(B\u0082ÖeÄ\u000f,×Y&\u0010É8òéB]Ú¥Ëà~Ë\u0015z9æÆ¹Ãð\u0002Lß\u00023ª\u0002\u0016j\u0006?i.æ3C\u0002¬/\u0002Íü:Ý\u0016ls£Ë±\u0093Å\u009f\u0012\u009cÏz'\u0010\u009dM\u0015«\re\u009evü¾\u000b\u009f²>ÊâH\u0083Zâ®\u0097ãzÜÄÉÁ[\rI\u009eKJ\u008aºáV¨\u0082Æ\u009d\u0006qöäÇ\u0011ñ\u0005æß»\u009e\u008c\u00021\u009b\u0002\u0081Ê\u0004\u0080\u007f\u000fg\u0006\u001e[©\u0087'Ü\u0006ª\u001ek+µ²\u000bHBÐ!ô=ë\u000b\u001cæ\u0095\b\u009dû¡\u0006uþ\u008dù\u0002îe\u0002ïÉ\u0002;\u009f\u0002Ø°\u0006\u009dld\u0099¢\u0096\u0002R\"\u0010çéI#Sù\u0090Áucu\u00913 ×ü\u0007\u008f±ãOtÂÍ\f&ø\u001aroü\u0006ü°¹)×>°ÁÁ\u0089\u0016\u0094\u0007f\u0004õÖø6²pÅsI\u0001DPr\u0088\u0000@[«¸®\u0017s\u009f05²\u0004µ&\u0007êE\u0084\u0019êú4±\u009fFA\u0018n\u0083èÓü]vX,â;\u0007>ï\u001aA';\u0002\b*é\u0089ëo#~j\u0002lÎ\u0005.Ñ¢_¯\u0002o\n\u0004bp»½> DÓ9T\u0082O¤\r\u00ad÷ó\u0012ÓôéãÌ\u0013ô\u0012dÀÂI\u0003\u008a³\u008av÷³ ° ´÷0O(LÜ8áÞU5³ÖÄ\nÞÁþ\u009b>T.y'ÆZ\bä\u001b,*1E\u001f$\nÇ\t!HÊ\u0010<§å\u0000\u000eÄAô{\u000b=TH\u0091\u0017&){ö\u0002ßH\b\u0082\u0080Bi\t\u0013\u0002D\u0006b\u009c\u0098;_ø\u000e\u0003Z±>ÒBq¶ÕÙâ£=º\u0007ø5Õ»+ª\u0083\u0013´§î×cã`\u0007ßÐ#\u001b\u0099]\u00926Ü\u000f:\u000bª\u000f\u008c\u0088\u007f\b\u0099°1+0\u0010©J\u00ad\u0016\u0012\u0018\u000e_ßs)»¸e¦T\u000e\u0082\u0002,\u001b\u0017v`è\u0015\u0095ôy!ü\u0002Aý\u0002¥<\u0007\u0014\u00032)ò%g\u0002Ä>\u0004¸ÁÚã\u0010Dn=ÓÝçA\u0002O\u001b2\u009eÛÁÊÀ\u0006¯×\u0085¤¾t\b\u009dª\u0003\u001cÔ\u0083£ü\u0002ÆG5\u001aX\u0094º¼òR¡®oÑ\u0096ú\u0096rC\u0014ÇöÍIìÊW\u0005z-\u008a\u0007²FçæY\u0005\u009aÚ\u008a2¿_\u0087Y m\u0084\u00883ðDúÓ[\f.?\u001b\u008aOã\u0002\u001f0Å9X\u0006y\u008fq¸Ä\u001e\bú\u000e\u0082\b=õ v"
         .length();
      char var1 = 11;
      b(true);
      int var9 = -1;

      label52:
      while (true) {
         short var10000 = 18;
         String var10001 = var2.substring(++var9, var9 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var55 = var10001.toCharArray();
               int var10004 = var55.length;
               int var6 = 0;
               byte var58 = (byte)var10000;
               var25 = var55;
               int var18 = var10004;
               byte var111;
               char[] var137;
               int var10006;
               if (var10004 <= 1) {
                  var137 = var55;
                  var111 = (byte)var10000;
                  var10006 = var6;
               } else {
                  var58 = (byte)var10000;
                  var18 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var137 = var55;
                  var111 = (byte)var10000;
                  var10006 = var6;
               }

               while (true) {
                  var137[var10006] = (char)(var137[var10006] ^ var111 ^ switch (var6 % 7) {
                     case 0 -> 104;
                     case 1 -> 15;
                     case 2 -> 94;
                     case 3 -> 66;
                     case 4 -> 83;
                     case 5 -> 98;
                     default -> 43;
                  });
                  var6++;
                  if (var58 == 0) {
                     var10006 = var58;
                     var137 = var25;
                     var111 = var58;
                  } else {
                     if (var18 <= var6) {
                        break;
                     }

                     var137 = var25;
                     var111 = var58;
                     var10006 = var6;
                  }
               }
            }

            String var60 = new String(var25).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var60;
                  if ((var9 += var1) >= var4) {
                     c = var5;
                     d = new String[119];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI();
                     Pair[] var7 = new Pair[22];
                     var10002 = 2797;
                     short var61 = 6271;
                     short var62 = 2727;
                     short var115 = -8239;
                     var7[0] = TuplesKt.to("§0", "<black>");
                     var10002 = 2756;
                     short var63 = 5204;
                     short var64 = 2765;
                     var115 = -26003;
                     var7[1] = TuplesKt.to("§1", "<dark_blue>");
                     var10002 = 2804;
                     short var65 = -592;
                     short var66 = 2709;
                     var115 = 7301;
                     var7[2] = TuplesKt.to("§2", "<dark_green>");
                     var10002 = 2772;
                     short var67 = -8864;
                     short var68 = 2785;
                     var115 = -20185;
                     var7[3] = TuplesKt.to("§3", "<dark_aqua>");
                     var10002 = 2741;
                     short var69 = -19117;
                     short var70 = 2777;
                     var115 = -24142;
                     var7[4] = TuplesKt.to("§4", "<dark_red>");
                     var10002 = 2751;
                     short var71 = -11411;
                     short var72 = 2705;
                     var115 = -30461;
                     var7[5] = TuplesKt.to("§5", "<dark_purple>");
                     var10002 = 2699;
                     short var73 = -17371;
                     short var74 = 2763;
                     var115 = -15223;
                     var7[6] = TuplesKt.to("§6", "<gold>");
                     var10002 = 2723;
                     short var75 = -7808;
                     short var76 = 2758;
                     var115 = 428;
                     var7[7] = TuplesKt.to("§7", "<gray>");
                     var10002 = 2725;
                     short var77 = -29492;
                     short var78 = 2692;
                     var115 = 16091;
                     var7[8] = TuplesKt.to("§8", "<dark_gray>");
                     var10002 = 2718;
                     short var79 = -12115;
                     short var80 = 2789;
                     var115 = 1093;
                     var7[9] = TuplesKt.to("§9", "<blue>");
                     var10002 = 2799;
                     short var81 = 9981;
                     short var82 = 2791;
                     var115 = -12739;
                     var7[10] = TuplesKt.to("§a", "<green>");
                     var10002 = 2767;
                     short var83 = -31587;
                     short var84 = 2746;
                     var115 = 10637;
                     var7[11] = TuplesKt.to("§b", "<aqua>");
                     var10002 = 2706;
                     short var85 = 15826;
                     short var86 = 2742;
                     var115 = -22066;
                     var7[12] = TuplesKt.to("§c", "<red>");
                     var10002 = 2779;
                     short var87 = 30793;
                     short var88 = 2790;
                     var115 = 11077;
                     var7[13] = TuplesKt.to("§d", "<light_purple>");
                     var10002 = 2771;
                     short var89 = -31360;
                     short var90 = 2800;
                     var115 = 24754;
                     var7[14] = TuplesKt.to("§e", "<yellow>");
                     var10002 = 2761;
                     short var91 = -20559;
                     short var92 = 2695;
                     var115 = -17836;
                     var7[15] = TuplesKt.to("§f", "<white>");
                     var10002 = 2781;
                     short var93 = 19586;
                     short var94 = 2719;
                     var115 = -11232;
                     var7[16] = TuplesKt.to("§k", "<obfuscated>");
                     var10002 = 2720;
                     short var95 = 23445;
                     short var96 = 2698;
                     var115 = -15020;
                     var7[17] = TuplesKt.to("§l", "<bold>");
                     var10002 = 2747;
                     short var97 = -12833;
                     short var98 = 2690;
                     var115 = 248;
                     var7[18] = TuplesKt.to("§m", "<strikethrough>");
                     var10002 = 2729;
                     short var99 = -14342;
                     short var100 = 2737;
                     var115 = -23320;
                     var7[19] = TuplesKt.to("§n", "<underlined>");
                     var10002 = 2713;
                     byte var101 = -1;
                     short var102 = 2770;
                     var115 = 18455;
                     var7[20] = TuplesKt.to("§o", "<italic>");
                     var10002 = 2696;
                     short var103 = 15583;
                     short var104 = 2769;
                     var115 = -23139;
                     var7[21] = TuplesKt.to("§r", "<reset>");
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = MapsKt.mapOf(var7);
                     var10002 = 2708;
                     short var105 = -27005;
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new Regex("§[0-9a-fk-or]");
                     var10002 = 2784;
                     short var106 = 21241;
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new Regex("§x(§[0-9a-fA-F]){6}");
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI::p;
                     MiniMessage var11 = MiniMessage.builder()
                     .preProcessor(s -> (String) llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.invoke(s))
                        .build();
                     var10002 = 2728;
                     short var107 = 13216;
                     Intrinsics.checkNotNullExpressionValue(var11, "build(...)");
                     lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var11;
                     GsonComponentSerializer var12 = GsonComponentSerializer.gson();
                     var10002 = 2700;
                     short var108 = -21176;
                     Intrinsics.checkNotNullExpressionValue(var12, "gson(...)");
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var12;
                     var10000 = 2801;
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new GsonBuilder().disableHtmlEscaping().create();
                     short var20 = -19848;
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = Pattern.compile(
                        "(?i)\\b(?:https?://|www\\.)[-A-Z0-9+&@#/%?=~_|!:,.;]*[-A-Z0-9+&@#/%=~_|]", 2
                     );
                     break pxClinit;
                  }

                  var1 = var2.charAt(var9);
                  break;
               default:
                  var5[var3++] = var60;
                  if ((var9 += var1) < var4) {
                     var1 = var2.charAt(var9);
                     continue label52;
                  }

                  var2 = "Jp=?DÀUN´I_Ã(Ó\u0003T§\u0018¹÷\u0091WþmáæT\u008fhË\u0085\u0085DZ\u0092\u0002\u009a\u0017ñìË\u0019ûçÚõ\u0089¤\u0081eO1k¬\u0081\u0084Ï¥Æ×\u001b½\u0080\u0097{5P\u0098\u008eØ\u0002ÊÅ";
                  var4 = "Jp=?DÀUN´I_Ã(Ó\u0003T§\u0018¹÷\u0091WþmáæT\u008fhË\u0085\u0085DZ\u0092\u0002\u009a\u0017ñìË\u0019ûçÚõ\u0089¤\u0081eO1k¬\u0081\u0084Ï¥Æ×\u001b½\u0080\u0097{5P\u0098\u008eØ\u0002ÊÅ"
                     .length();
                  var1 = 'F';
                  var9 = -1;
            }

            var10000 = 3;
            var10001 = var2.substring(++var9, var9 + var1);
            var10002 = 0;
         }
      }
   }
}

   public static void b(boolean var0) {
      IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var0;
   }

   public static boolean i() {
      return IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   }

   public static boolean j() {
      boolean var0 = i();

      try {
         return !var0;
      } catch (JsonParseException var1) {
         throw (RuntimeException)a(var1);
      }
   }

   private static JsonParseException a(JsonParseException var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 2692) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 225;
            case 1 -> 2;
            case 2 -> 15;
            case 3 -> 138;
            case 4 -> 118;
            case 5 -> 226;
            case 6 -> 8;
            case 7 -> 129;
            case 8 -> 176;
            case 9 -> 181;
            case 10 -> 244;
            case 11 -> 117;
            case 12 -> 94;
            case 13 -> 188;
            case 14 -> 26;
            case 15 -> 58;
            case 16 -> 61;
            case 17 -> 140;
            case 18 -> 63;
            case 19 -> 113;
            case 20 -> 9;
            case 21 -> 208;
            case 22 -> 207;
            case 23 -> 32;
            case 24 -> 33;
            case 25 -> 12;
            case 26 -> 41;
            case 27 -> 84;
            case 28 -> 56;
            case 29 -> 124;
            case 30 -> 142;
            case 31 -> 199;
            case 32 -> 31;
            case 33 -> 111;
            case 34 -> 236;
            case 35 -> 212;
            case 36 -> 230;
            case 37 -> 19;
            case 38 -> 70;
            case 39 -> 211;
            case 40 -> 209;
            case 41 -> 197;
            case 42 -> 53;
            case 43 -> 18;
            case 44 -> 112;
            case 45 -> 239;
            case 46 -> 218;
            case 47 -> 39;
            case 48 -> 224;
            case 49 -> 215;
            case 50 -> 95;
            case 51 -> 13;
            case 52 -> 22;
            case 53 -> 237;
            case 54 -> 220;
            case 55 -> 245;
            case 56 -> 78;
            case 57 -> 200;
            case 58 -> 47;
            case 59 -> 191;
            case 60 -> 88;
            case 61 -> 54;
            case 62 -> 80;
            case 63 -> 14;
            case 64 -> 222;
            case 65 -> 203;
            case 66 -> 75;
            case 67 -> 159;
            case 68 -> 37;
            case 69 -> 20;
            case 70 -> 217;
            case 71 -> 119;
            case 72 -> 195;
            case 73 -> 48;
            case 74 -> 85;
            case 75 -> 130;
            case 76 -> 193;
            case 77 -> 160;
            case 78 -> 114;
            case 79 -> 109;
            case 80 -> 171;
            case 81 -> 29;
            case 82 -> 184;
            case 83 -> 102;
            case 84 -> 28;
            case 85 -> 98;
            case 86 -> 104;
            case 87 -> 229;
            case 88 -> 148;
            case 89 -> 141;
            case 90 -> 64;
            case 91 -> 96;
            case 92 -> 221;
            case 93 -> 87;
            case 94 -> 99;
            case 95 -> 234;
            case 96 -> 251;
            case 97 -> 247;
            case 98 -> 76;
            case 99 -> 240;
            case 100 -> 90;
            case 101 -> 235;
            case 102 -> 52;
            case 103 -> 202;
            case 104 -> 186;
            case 105 -> 165;
            case 106 -> 131;
            case 107 -> 34;
            case 108 -> 183;
            case 109 -> 167;
            case 110 -> 23;
            case 111 -> 50;
            case 112 -> 169;
            case 113 -> 40;
            case 114 -> 146;
            case 115 -> 92;
            case 116 -> 79;
            case 117 -> 173;
            case 118 -> 145;
            case 119 -> 125;
            case 120 -> 213;
            case 121 -> 0;
            case 122 -> 189;
            case 123 -> 242;
            case 124 -> 214;
            case 125 -> 147;
            case 126 -> 120;
            case 127 -> 46;
            case 128 -> 246;
            case 129 -> 223;
            case 130 -> 127;
            case 131 -> 185;
            case 132 -> 175;
            case 133 -> 81;
            case 134 -> 172;
            case 135 -> 103;
            case 136 -> 74;
            case 137 -> 11;
            case 138 -> 162;
            case 139 -> 253;
            case 140 -> 72;
            case 141 -> 238;
            case 142 -> 122;
            case 143 -> 35;
            case 144 -> 60;
            case 145 -> 153;
            case 146 -> 66;
            case 147 -> 42;
            case 148 -> 106;
            case 149 -> 135;
            case 150 -> 179;
            case 151 -> 55;
            case 152 -> 143;
            case 153 -> 27;
            case 154 -> 45;
            case 155 -> 121;
            case 156 -> 6;
            case 157 -> 163;
            case 158 -> 1;
            case 159 -> 252;
            case 160 -> 201;
            case 161 -> 67;
            case 162 -> 126;
            case 163 -> 227;
            case 164 -> 107;
            case 165 -> 71;
            case 166 -> 5;
            case 167 -> 115;
            case 168 -> 82;
            case 169 -> 97;
            case 170 -> 194;
            case 171 -> 108;
            case 172 -> 136;
            case 173 -> 134;
            case 174 -> 36;
            case 175 -> 216;
            case 176 -> 210;
            case 177 -> 196;
            case 178 -> 116;
            case 179 -> 248;
            case 180 -> 133;
            case 181 -> 21;
            case 182 -> 30;
            case 183 -> 68;
            case 184 -> 101;
            case 185 -> 255;
            case 186 -> 137;
            case 187 -> 219;
            case 188 -> 149;
            case 189 -> 49;
            case 190 -> 228;
            case 191 -> 190;
            case 192 -> 51;
            case 193 -> 151;
            case 194 -> 158;
            case 195 -> 154;
            case 196 -> 170;
            case 197 -> 177;
            case 198 -> 187;
            case 199 -> 156;
            case 200 -> 161;
            case 201 -> 65;
            case 202 -> 44;
            case 203 -> 25;
            case 204 -> 155;
            case 205 -> 139;
            case 206 -> 144;
            case 207 -> 73;
            case 208 -> 59;
            case 209 -> 231;
            case 210 -> 232;
            case 211 -> 38;
            case 212 -> 192;
            case 213 -> 233;
            case 214 -> 110;
            case 215 -> 166;
            case 216 -> 62;
            case 217 -> 86;
            case 218 -> 182;
            case 219 -> 89;
            case 220 -> 204;
            case 221 -> 168;
            case 222 -> 100;
            case 223 -> 7;
            case 224 -> 164;
            case 225 -> 243;
            case 226 -> 43;
            case 227 -> 254;
            case 228 -> 3;
            case 229 -> 10;
            case 230 -> 17;
            case 231 -> 174;
            case 232 -> 83;
            case 233 -> 180;
            case 234 -> 178;
            case 235 -> 250;
            case 236 -> 198;
            case 237 -> 157;
            case 238 -> 93;
            case 239 -> 77;
            case 240 -> 241;
            case 241 -> 91;
            case 242 -> 105;
            case 243 -> 132;
            case 244 -> 249;
            case 245 -> 69;
            case 246 -> 4;
            case 247 -> 152;
            case 248 -> 24;
            case 249 -> 150;
            case 250 -> 16;
            case 251 -> 128;
            case 252 -> 57;
            case 253 -> 205;
            case 254 -> 123;
            default -> 206;
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

   public static final void a(Object var0) {
      String var1 = String.valueOf(var0);
      if (var1.startsWith("/") && var1.length() > 1) {
         b(var1.substring(1));
         return;
      }
      polinex$sendChatRaw(var0);
   }
}